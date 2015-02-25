/**
 * copyright Nemshek Software Solution
 */
package com.nemshek.contactmanager.enums;

public enum OperationsType {
	INSERT(1, "Insert contact"), DELETE(2, "Delete contact"), UPDATE(3,
			"Update contact"), SELECT(4, "Select contact"), SELECT_ALL(5,
			"Select all contacts"), EXIT(6, "close application");

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