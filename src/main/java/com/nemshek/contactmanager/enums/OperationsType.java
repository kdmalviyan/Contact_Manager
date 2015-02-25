/**
 * copyright Nemshek Software Solution
 */
package com.nemshek.contactmanager.enums;

public enum OperationsType {
	INSERT(1, "Add Contact"), DELETE(2, "Delete Contact"), UPDATE(3,
			"Edit Contact"), SELECT(4, "Search Contacts"), SELECT_ALL(5,
			"Show Contacts"), EXIT(6, "Exit");

	private int key;
	private String displayValue;

	OperationsType(int key, String displayValue) {
		this.key = key;
		this.displayValue = displayValue;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getDisplayValue() {
		return displayValue;
	}

	public void setDisplayValue(String displayValue) {
		this.displayValue = displayValue;
	}
}