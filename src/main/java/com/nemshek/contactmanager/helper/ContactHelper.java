/**
 * copyright Nemshek Software Solution
 */
package com.nemshek.contactmanager.helper;

import java.util.Scanner;

import com.nemshek.contactmanager.entity.Contact;

public class ContactHelper {

	public static Contact getContactToInsert(Scanner scanner) {
		System.out.println(AppConstants.ASK_CONTACT_DETAILS_TO_ADD);
		return null;
	}

	public static String getCriteriaToDelete(Scanner scanner) {
		System.out.println(AppConstants.ASK_CRITERIA_DETAILS_TO_DELETE);
		return null;
	}

	public static Contact getContactToUpdate(Scanner scanner) {
		System.out.println(AppConstants.ASK_CONTACT_DETAILS_TO_UPDATE);
		return null;
	}

	public static String getCriteriaToselect(Scanner scanner) {
		System.out.println(AppConstants.ASK_CRITERIA_DETAILS_TO_SELECT);
		return null;
	}

}
