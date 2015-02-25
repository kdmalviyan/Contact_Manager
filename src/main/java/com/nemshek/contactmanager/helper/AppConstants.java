/**
 * copyright Nemshek Software Solution
 */
package com.nemshek.contactmanager.helper;

import com.nemshek.contactmanager.enums.OperationsType;

public class AppConstants {

	public static final String THANK_YOU_MESSAGE = "Thank you for using this Application... \nGood day ahead...";
	public static final String WRONG_OPTION_CHOOSEN = "Sorry, please choose any option from listed below...";
	public static final String PLEASE_ENTER_NUMERIC = "Please enter numeric value...";
	public static final String TASK_DONE = "Your task ";
	public static final String IS_DONE = " contact is done...";
	public static final String CHOOSE_OPTION = "What you want to do?" + "\n1="
			+ OperationsType.values()[0].getDisplayValue() + "\n2="
			+ OperationsType.values()[1].getDisplayValue() + "\n3="
			+ OperationsType.values()[2].getDisplayValue() + "\n4="
			+ OperationsType.values()[3].getDisplayValue() + "\n5="
			+ OperationsType.values()[4].getDisplayValue() + "\n6="
			+ OperationsType.values()[5].getDisplayValue()
			+ " \n=================================";
	public static final String WELCOME = "############################## Welcome! ##############################";
	public static final String CONTINUE_YES = "Y";
	public static final String CONTINUE_NO = "N";

	public static final String ASK_CONTACT_DETAILS_TO_ADD = "Please provide contact details to add(Note: email can not be duplicted):";
	public static final String ASK_CRITERIA_DETAILS_TO_DELETE = "Please choose how you want to delete contact(Note: except by email, multiple contact can be deleted):";
	public static final String ASK_CONTACT_DETAILS_TO_UPDATE = "Please provide contact details to update(Note: email will be used to search the recor to update):";
	public static final String ASK_CRITERIA_DETAILS_TO_SELECT = "Please choose how you want to search contact";
}
