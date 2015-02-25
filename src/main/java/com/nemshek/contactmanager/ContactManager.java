/**
 * copyright Nemshek Software Solution
 */
package com.nemshek.contactmanager;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import com.nemshek.contactmanager.dao.ContactDao;
import com.nemshek.contactmanager.dao.ContactDaoImpl;
import com.nemshek.contactmanager.entity.Contact;
import com.nemshek.contactmanager.enums.OperationsType;
import com.nemshek.contactmanager.helper.AppConstants;
import com.nemshek.contactmanager.helper.ContactHelper;

/**
 * @author nemshek
 *
 */
public class ContactManager {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		boolean flag = true;
		System.out.println(AppConstants.WELCOME);
		Scanner scanner = new Scanner(System.in);
		while (flag) {
			System.out.println(AppConstants.CHOOSE_OPTION);
			String whatToDo = scanner.nextLine();
			if (StringUtils.isNotBlank(whatToDo)) {
				try {
					int taskNum = Integer.parseInt(whatToDo.trim());
					flag = performOperation(taskNum, scanner);
					if (flag) {
						continue;
					}
					System.out.println(AppConstants.TASK_DONE
							+ OperationsType.values()[taskNum - 1]
									.getDisplayValue() + AppConstants.IS_DONE);

					System.out.println(AppConstants.WANT_TO_CONTINUE_MESSAGE);
					while (true) {
						String continueApp = scanner.nextLine();
						if (StringUtils.isNotBlank(continueApp)) {
							if (continueApp
									.equalsIgnoreCase(AppConstants.CONTINUE_YES)) {
								flag = true;
								break;
							} else if (continueApp
									.equalsIgnoreCase(AppConstants.CONTINUE_NO)) {
								flag = false;
								break;
							} else {
								System.out.println(AppConstants.WRONG_OPTION_CHOOSEN + "\n"+ AppConstants.WANT_TO_CONTINUE_MESSAGE);
								continue;
							}
						}
					}

				} catch (NumberFormatException e) {
					System.out.println(AppConstants.PLEASE_ENTER_NUMERIC);
					continue;
				}
			} else {
				System.out.println(AppConstants.WRONG_OPTION_CHOOSEN);
				continue;
			}
		}
		if (!flag) {
			System.out.println(AppConstants.THANK_YOU_MESSAGE);
		}
		scanner.close();
	}

	private static boolean performOperation(int whatToDo, Scanner scanner) {
		boolean flagValue = true;
		ContactDao contactDao = new ContactDaoImpl();
		switch (whatToDo) {
		case 1:
			Contact insertContact = ContactHelper.getContactToInsert(scanner);
			contactDao.insertContact(insertContact);
			flagValue = false;
			break;
		case 2:
			String deleteCriteria = ContactHelper.getCriteriaToDelete(scanner);
			contactDao.deleteContact(deleteCriteria);
			flagValue = false;
			break;
		case 3:
			Contact updateContact = ContactHelper.getContactToUpdate(scanner);
			;
			contactDao.updateContact(updateContact);
			flagValue = false;
			break;
		case 4:
			String selectCriteria = ContactHelper.getCriteriaToselect(scanner);
			;
			contactDao.selectContact(selectCriteria);
			flagValue = false;
			break;
		case 5:
			contactDao.selectAllContact();
			flagValue = false;
			break;
		case 6:
			System.out.println(AppConstants.THANK_YOU_MESSAGE);
			System.exit(0);
			break;
		default:
			System.out.println(AppConstants.WRONG_OPTION_CHOOSEN);
			break;
		}
		return flagValue;
	}
}
