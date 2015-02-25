/**
 * 
 */
package com.nemshek.contactmanager.dao;

import java.util.List;

import com.nemshek.contactmanager.entity.Contact;

/**
 * @author nemshek
 *
 */
public interface ContactDao {

	public Contact selectContact(String criteria);

	public void insertContact(Contact contact);

	public void updateContact(Contact contact);

	public void deleteContact(String criteria);

	public List<Contact> selectAllContact();
}
