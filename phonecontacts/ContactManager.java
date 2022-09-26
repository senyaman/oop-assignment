package phonecontacts;

import java.util.ArrayList;

public class ContactManager {

    private ArrayList<Contact> contactList = new ArrayList<>();

    public void addNewContact(Contact contact) {
        contactList.add(contact);
    }

    public ArrayList<String> searchContact(String name) {

        ArrayList<String> phoneNumbers = new ArrayList<>();
        ArrayList<String> removeDuplicates = new ArrayList<>();

        for(Contact contact : contactList) {
            if(contact.getName().equals(name)) {
                phoneNumbers.add(contact.getPhoneNumber());
            }
        }

        for(String number : phoneNumbers) {
            if(!removeDuplicates.contains(number)) {
                removeDuplicates.add(number);
            }
        }

        if(removeDuplicates.isEmpty()) {
            return null;
        } else {
            return removeDuplicates;
        }

    }

}
