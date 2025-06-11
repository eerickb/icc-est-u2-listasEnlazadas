package Controller;

import Model.Contact;
import View.ConsoleView;

public class MenuController {
    private ContactManager contactManager = new ContactManager();
    private ConsoleView consoleView = new ConsoleView();

    public void showMenu() {
        boolean running = true;
        while (running) {
            consoleView.displayMenu();
            String choice = consoleView.getInput("Choose an option: ");
            switch (choice) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printList();
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    consoleView.showMessage("Invalid option.");
            }
        }
    }

    public void addContact() {
        String name = consoleView.getInput("Enter name: ");
        String phone = consoleView.getInput("Enter phone: ");
        contactManager.addContact(new Contact<>(name, phone));
    }

    public void findContact() {
        String name = consoleView.getInput("Enter name to search: ");
        Contact<?, ?> contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage(contact.toString());
        } else {
            consoleView.showMessage("Contact not found.");
        }
    }

    public void deleteContact() {
        String name = consoleView.getInput("Enter name to delete: ");
        contactManager.deleteContactByName(name);
        consoleView.showMessage("Deleted if existed.");
    }

    public void printList() {
        contactManager.printList();
    }
}