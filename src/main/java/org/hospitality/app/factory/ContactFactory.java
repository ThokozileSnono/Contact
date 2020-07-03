package org.hospitality.app.factory;

import org.hospitality.app.entity.Contact;
import org.hospitality.app.util.GenericHelper;

// Creates objects of the Contact Entity
public class ContactFactory {

    public static Contact createContact(String email, String contactNumber){
        String contactNum = GenericHelper.generateContact();
        Contact contact = new Contact.Builder()
                .setContactNumber(contactNumber)
                .setEmail(email)
                .build();

        return contact ;
    }
}