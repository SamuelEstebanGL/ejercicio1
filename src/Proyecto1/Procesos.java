//el paquete donde se guarda las clases
package Proyecto1;


//esta es la libreria del Scanner
import java.awt.*;
import java.util.Scanner;

public class Procesos {
    //este se utiliza para que el usuario digite valores en la pantalla
    Scanner consola = new Scanner(System.in);
    int nclientes = 4;
    Clientes[] c = new Clientes[nclientes];

    public static void main(String[] args) {


        //esto es para correr el metodo de registrar cliente
        new Procesos().Menu();

    }

    private void Menu() {
        int Opcion = 0;
        System.out.println("******************************************************");
        System.out.println("******** bienvenidos al sistema de clientes ************");
        System.out.println("******************************************************");
        // menu de opciones
        System.out.println("*MENU DE OPCIONES*:");
        System.out.println("*********************************");
        System.out.println("1 - Añadir clientes!");
        System.out.println("**********************************");
        System.out.println("2 - Borrar un cliente!");
        System.out.println("**********************************");
        System.out.println("3 - Buscar un cliente!");
        System.out.println("**********************************");
        System.out.println("4 - editar cliente!");
        System.out.println("**********************************");
        System.out.println("5 - Mostrar cliente!");
        System.out.println("**********************************");
        System.out.println("6 - Salir!");
        System.out.println("**********************************");
        System.out.print("digite el numero de la Opcion: ");
        Opcion = consola.nextInt();

        switch (Opcion) {
            case 1:

                registrarCliente();
                break;

            case 2:

                eliminarClientes(c, consola);
                break;

            case 3:

                buscarClientes(c, consola);
                break;

            case 4:

                editarClientes(c, consola);
                break;

            case 5:

                Mostrarclientes(c);
                break;

            case 6:

                salir();
                break;

            default:

                System.out.println("El valor que ingreso no existe en el sistema!");


        }
    }

    //metodo para registrar arrays
    public void registrarCliente() {


        int contador = 0;

        while (contador < nclientes) {
            System.out.println("POR FAVOR INGRESAR LOS DATOS DEL CLIENTE: ");
            System.out.print("CEDULA = ");
            int Cedula = consola.nextInt();
            System.out.print("NOMBRE = ");
            String Nombre = consola.next();
            c[contador] = new Clientes(Cedula, Nombre);
            contador++;
        }
        Menu();
    }

    //Metodo para mostrar el array
    public void Mostrarclientes(Clientes[] c) {
        System.out.println(" MOSTRANDO TODO LOS CLIENTES ");
        for (int i = 0; i < c.length; i++) {
            System.out.println("Su cedula y nombre son = " + c[i].getCedula() + "-" + c[i].getNombre());
        }
        Menu();
    }

    /*public void Menu(Clientes[] c) {
        int Opcion = 0;
        System.out.println("******************************************************");
        System.out.println("******** bienvenidos al sistema de clientes ************");
        System.out.println("******************************************************");
        // menu de opciones
        System.out.println("*MENU DE OPCIONES*:");
        System.out.println("*********************************");
        System.out.println("1 - Añadir un cliente!");
        System.out.println("**********************************");
        System.out.println("2 - Borrar un cliente!");
        System.out.println("**********************************");
        System.out.println("3 - Buscar un cliente!");
        System.out.println("**********************************");
        System.out.println("4 - editar cliente!");
        System.out.println("**********************************");
        System.out.println("5 - Mostrar cliente!");
        System.out.println("**********************************");
        System.out.println("6 - Salir!");
        System.out.println("**********************************");
        System.out.print("digite el numero de la Opcion: ");
        Opcion = consola.nextInt();

        switch (Opcion) {
            case 1:

                registrarCliente();
                break;

            case 2:

                eliminarClientes(c, consola);
                break;

            case 3:

                buscarClientes(c, consola);
                break;

            case 4:

                editarClientes(c, consola);
                break;

            case 5:

                Mostrarclientes(c);
                break;

            case 6:

                salir();
                break;

            default:

                System.out.println("El valor que ingreso no existe en el sistema!");


        }
    }*/

    //metodo para eliminar
    public void eliminarClientes(Clientes[] c, Scanner consola) {
        System.out.println("Ingrese el numero de cedula del cliente que se va eliminar del Sistema! ");
        int Cedula = consola.nextInt();
        int posicion = -1;
        for (int i = 0; i < c.length; i++) {
            if (Cedula == (c[i].getCedula())) {
                posicion = i;
            }
        }
        if (posicion > -1) {
            c[posicion] = null;
            System.out.println("la persona con Cedula de Ciudadania= " + Cedula + " " + "se elimino correctamente!");
        } else {
            System.out.println("la persona con Cedula de Ciudadania= " + Cedula + " " + "no se encontro en el Sistema!!");
        }
        Menu();
    }

    //metodo para editar
    public void editarClientes(Clientes[] c, Scanner consola) {
        System.out.println("Ingrese el numero de cedula del cliente que se va a modificar su nombre ");
        int Cedula = consola.nextInt();
        int posicion = -1;
        for (int i = 0; i < c.length; i++) {
            if (Cedula == (c[i].getCedula())) {
                posicion = i;
            }
        }
        if (posicion > -1) {
            System.out.println("NOMBRE= ");
            String Nombrenv = consola.next();
            c[posicion] = new Clientes(Cedula, Nombrenv);
        } else {
            System.out.println("La cedula ingresada no esta en el Sistema! ");
        }
        Menu();
    }

    //metodo para buscar un cliente
    public void buscarClientes(Clientes[] c, Scanner consola) {
        System.out.println("Ingrese el numero de cedula del cliente ");
        int Cedula = consola.nextInt();
        int posicion = -1;
        for (int i = 0; i < c.length; i++) {
            if (Cedula == (c[i].getCedula())) {
                posicion = i;
            }
        }
        if (posicion > -1) {
            System.out.println("Su cedula y nombre son = " + c[posicion].getCedula() + "-" + c[posicion].getNombre());
        } else {
            System.out.println("La cedula ingresada no esta en el Sistema! ");
        }
        Menu();
    }

    //metodo para salir del programa
    public void salir() {
        System.exit(0);
    }
}
