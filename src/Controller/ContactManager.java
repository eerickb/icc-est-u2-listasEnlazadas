package Controller;

import Model.Contact;
import Model.LinkedList;
import Model.Node;

public class ContactManager<T, U> {
    private LinkedList<Contact<T, U>> contacts = new LinkedList<>();

    public void addContact(Contact<T, U> contact) {
        contacts.appendToTail(contact);
    }

    public Contact<T, U> findContactByName(String name) {
        Node<Contact<T, U>> current = contacts.getHead();
        while (current != null) {
            if (name != null && name.equals(current.getValue().getName())) {
                return current.getValue();
            }
            current = current.getNext();
        }
        return null;
    }

    public void deleteContactByName(String name) {
        Node<Contact<T, U>> current = contacts.getHead();
        while (current != null) {
            if (name != null && name.equals(current.getValue().getName())) {
                contacts.deleteByValue(current.getValue());
                break;
            }
            current = current.getNext();
        }
    }

    public void printList() {
        contacts.print();
    }
}
