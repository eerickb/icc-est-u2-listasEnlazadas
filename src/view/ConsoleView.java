package view;

import java.util.Scanner;

public class ConsoleView {
    
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu(){
        System.out.println("----MENÚ----");
        System.out.println("1. Agregar contacto");
        System.out.println("2. Buscar contacto");
        System.out.println("3. Eliminar contacto");
        System.out.println("4. Imprimir lista");
        System.out.println("5. Salir");

        System.out.println("-------------------------");
            
    }


    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
