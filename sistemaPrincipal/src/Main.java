import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String producto;
        double precio = 0;
        int cantidad = 0;

        System.out.println("Bienvenido");
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.nextLine();

        System.out.println("Que deseas ordenar");
        System.out.println("-------------------------------- \n" +
                "1. Café negro.....................Q10.00 \n" +
                "2. Café latte.....................Q15.00 \n" +
                "3. Café capuccino.................Q20.00 \n" +
                "4. Café helado....................Q22.00"
        );
        producto = sc.nextLine();
        switch (producto) {
            case "1":
                producto = "Café negro";
                precio = 10;
                break;

            case "2":
                producto = "Café ñatte";
                precio = 15;
                break;

            case "3":
                producto = "Café capuccino";
                precio = 20;
                break;

            case "4":
                producto = "Café helado";
                precio = 22;
                break;
            default:
                System.out.println("Producto no encontrado");
        }

        if (producto != "Producto no encontrado"){
            System.out.println("Ingrese la cantidad del producto: ");
            cantidad = Integer.parseInt(sc.nextLine());

            Pedidos pedidoCliente = new Pedidos(nombre, producto, cantidad, precio);
            pedidoCliente.Descuentos();

            pedidoCliente.Factura();
        }
    }
}