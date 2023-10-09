package clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuarRegistro = true;
        int id = 1;
        String nombre = null;
        String marca = null;
        double precio;

        while (continuarRegistro) {
            System.out.println("\n======= <[Ingrese los datos del producto]> =======\n");
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            System.out.print("Marca: ");
            marca = scanner.nextLine();
            System.out.print("Precio: ");
            precio = scanner.nextDouble();
            scanner.nextLine();

            Producto producto = new Producto(id, nombre, marca, precio);
            productos.add(producto);
            id++;

            System.out.print("\n¿Desea continuar registrando productos? (S/N): ");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("N")) {
                continuarRegistro = false;
            } else {
                nombre = "";
                marca = "";
                precio = 0;
                System.out.println("\n=======================================\n");
            }
        }

        System.out.println("\n======== <[Productos Registrados]> =========\n");
        Iterator<Producto> iterator = productos.iterator();

        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            System.out.println("ID: " + producto.getId());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Marca: " + producto.getMarca());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("\n=======================================\n");
        }
    }
}
