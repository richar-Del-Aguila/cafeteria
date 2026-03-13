import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {


        //Variables que se le pediran al usuario
        String nombre = "";
        String pedido;
        int cantidad = 0;

        //Variables que usara el sistema
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
        String op = "S";
        boolean op2 = true;

        System.out.println("Bienvenido! \n Para continuar, ingresa tu  nombre: ");
        nombre = sc.nextLine();

        //Se declara el objeto
        Pedidos cliente1 = new Pedidos();

        while (menu){
            System.out.println("Que deseas ordenar:");
            System.out.println("1. Cafe negro..................Q.10 \n" +
                               "2. Cafe latte..................Q.15 \n" +
                               "3. Cafe con leche..............Q.17 \n" +
                               "4. Cafe helado.................Q.20 \n" +
                               "5. Cafe con pan................Q.25 \n" +
                               "6. salir...........................");
            pedido = sc.nextLine();


            if(Integer.parseInt(pedido) >= 1 && Integer.parseInt(pedido) <= 5){
                System.out.println("Ingrese la cantidad: ");
                cantidad = Integer.parseInt(sc.nextLine());
            } else if(Integer.parseInt(pedido) == 6){
                System.out.println("Hasta luego! Por gusto te atendi");
                menu = false;
            } else {
                System.out.println("Lo que usted pidio no esta en el menú");
            }

            System.out.println("Orden procesada....................");

            //Se registrara el pedido en las listas
            switch (pedido){
                case "1":
                    cliente1.gestionarPedido(cantidad, "Cafe negro");
                    break;
                case "2":
                    cliente1.gestionarPedido(cantidad, "Cafe latte");
                    break;
                case "3":
                    cliente1.gestionarPedido(cantidad, "Cafe con leche");
                    break;
                case "4":
                    cliente1.gestionarPedido(cantidad, "Cafe helado");
                    break;
                case "5":
                    cliente1.gestionarPedido(cantidad, "Cafe con pan");
                    break;
            }

            while (op2){
                System.out.println("Desea ordenar algo más? S/N");
                op = sc.nextLine();
                op = op.toUpperCase();

                if (op.equals("S") || op.equals("N")){
                    op2 = false;
                }
            }

            if (op.equals("S")){
                menu = true;
                op2 = true;
            } else {
                menu = false;
            }
        }
        cliente1.Factura();

    }
}