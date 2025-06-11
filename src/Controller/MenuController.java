package Controller;

import Model.Contact;
import view.ConsoleView;

public class MenuController {
    private ContactManager contactManager = new ContactManager();
    private ConsoleView consoleView = new ConsoleView();

    public void showMenu() {
        boolean running = true;
        while (running) {
            consoleView.displayMenu();
            String choice = consoleView.getInput("Escoga una opción: ");
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
                    consoleView.showMessage("Error: opción inválida.");
            }
        }
    }

    private void addContact() {
        String name = consoleView.getInput("Ingrese el nombre: ");
        String phone = consoleView.getInput("Ingrese el teléfono: ");
        contactManager.addContact(new Contact<>(name, phone));
    }

    private void findContact() {
        String name = consoleView.getInput("Ingrese el nombre de búsqueda: ");
        Contact<?, ?> contact = contactManager.findContactByName(name);

        if (contact != null) {
            consoleView.showMessage("Contacto encontrado: " + contact);
        } else {
            consoleView.showMessage("Contacto no encontrado.");
        }
    }

    private void deleteContact() {
        String name = consoleView.getInput("Ingrese el nombre del contacto a eliminar: ");
        boolean eliminado = contactManager.deleteContactByName(name);
        if (eliminado) {
            consoleView.showMessage("Contacto eliminado.");
        } else {
            consoleView.showMessage("No se encontró el contacto para eliminar.");
        }
    }

    private void printList() {
        contactManager.printList();
    }
}