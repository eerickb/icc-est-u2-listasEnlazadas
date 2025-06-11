package Controller;

import Model.Contact;
import Model.LinkedList;
import Model.Node;

public class ContactManager {
    private final LinkedList<Contact<?, ?>> contacts = new LinkedList<>();

    public void addContact(Contact<?, ?> contact) {
        contacts.appendToTail(contact);
    }

    public Contact<?, ?> findContactByName(String name) {
        Node<Contact<?, ?>> current = contacts.getHead();
        while (current != null) {
            if (current.getValue().getName().equals(name)) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean deleteContactByName(String name) {
        Node<Contact<?, ?>> current = contacts.getHead();
        while (current != null) {
            Contact<?, ?> contact = current.getValue();
            if (contact.getName().equals(name)) {
                contacts.deleteByValue(contact);
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void printList() {
        contacts.print();
    }

    public LinkedList<Contact<?, ?>> getContacts() {
        return contacts;
    }
}