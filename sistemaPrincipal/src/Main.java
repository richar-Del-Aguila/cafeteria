import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String producto = "";
        double precio = 0;
        int cantidad = 0;
        boolean menu = true;

        System.out.println("Bienvenido");
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.nextLine();

        while(menu){
            System.out.println("Que deseas ordenar");
            System.out.println("-------------------------------- \n" +
                    "1. Cafe negro.....................Q10.00 \n" +
                    "2. Cafe latte.....................Q15.00 \n" +
                    "3. Cafe capuccino.................Q20.00 \n" +
                    "4. Cafe helado....................Q22.00"
            );
            producto = sc.nextLine();
            switch (producto) {
                case "1":
                    producto = "Cafe negro";
                    precio = 10;
                    menu = false;
                    break;

                case "2":
                    producto = "Cafe latte";
                    precio = 15;
                    menu = false;
                    break;

                case "3":
                    producto = "Cafe capuccino";
                    precio = 20;
                    menu = false;
                    break;

                case "4":
                    producto = "Cafe helado";
                    precio = 22;
                    menu = false;
                    break;
                default:
                    System.out.println("Producto no encontrado");
                    menu = true;
            }
        }

        System.out.println("Ingrese la cantidad del producto: ");
        cantidad = Integer.parseInt(sc.nextLine());

        Pedidos pedidoCliente = new Pedidos(nombre, producto, cantidad, precio);
        pedidoCliente.Descuentos();

        pedidoCliente.Factura();
    }
}