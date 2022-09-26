package phonecontacts;

public class Main {

    public static void main(String[] args) {

        ContactManager contactManager = new ContactManager();

        Contact gift = new Contact("Gift", "0856236547");
        contactManager.addNewContact(gift);

        Contact mike = new Contact("Mike", "0965325412");
        contactManager.addNewContact(mike);

        Contact Mike2 = new Contact("Mike", "0365698575");
        contactManager.addNewContact(Mike2);

        System.out.println(contactManager.searchContact("Mike"));

    }

}
