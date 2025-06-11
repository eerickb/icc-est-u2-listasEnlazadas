package view;

import java.util.Scanner;

public class ConsoleView {
    
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);

        String opcion ;
        do{
            System.out.println("----MENÚ----");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir");

            System.out.println("-------------------------");
            System.out.println("Ingrese una opcion");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
            
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            opcion = scanner.next();
        }while(opcion.equalsIgnoreCase("S"));
    }


    public String getInput(String cadena){
        Scanner scanner = new Scanner(System.in);
        System.out.println(cadena);
        String txt = scanner.next();
        return txt;
    }
    public String showMessage(String cadena){

        return cadena;
    }
}
