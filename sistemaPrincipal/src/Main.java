import java.util.Scanner;

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

        System.out.println("Bienvenido! \n Ingresa el nombre al que se realizara la orden: ");
        nombre = sc.nextLine();

        //Se declara el objeto
        Pedidos cliente1 = new Pedidos();

        //Se despliega el menú
        while (menu){
            System.out.println("Que tiene que llevar la orden:");
            System.out.println("1. Cafe negro..................Q.10 \n" +
                               "2. Cafe latte..................Q.15 \n" +
                               "3. Cafe con leche..............Q.17 \n" +
                               "4. Cafe helado.................Q.20 \n" +
                               "5. Cafe con pan................Q.25 \n" +
                               "6. Cancelar pedido....................");
            pedido = sc.nextLine();

            //Se comprueba si el producto esta en el menú o si se cancela el pedido
            if(Integer.parseInt(pedido) >= 1 && Integer.parseInt(pedido) <= 5){
                //Si el producto esta en el menú se solicitara la cantidad
                System.out.println("Producto: " + pedido);
                System.out.println("Ingrese la cantidad: ");
                cantidad = Integer.parseInt(sc.nextLine());

            } else if(Integer.parseInt(pedido) == 6){
                //Si elige el la opción 6 se cancela todo el pedido
                System.out.println("Pedido cancelado");
                menu = false;

            } else {
                System.out.println("Lo que se ordeno, no esta en el menú");
            }

            System.out.println("Orden procesada....................");

            //Se registrara el nombre del producto según su numeral
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

            //Se pregunta al usuario si agregara mas productos al pedido
            //Esta bucle estara activo mientras el usuario no elija S o N
            while (op2){
                System.out.println("Desea ordenar algo más? S/N");
                op = sc.nextLine(); //Se cuarda la respuesta
                op = op.toUpperCase(); //Se convierte en mayusculas para que la comparación sea mas facil

                if (op.equals("S") || op.equals("N")){ //Se hace las comparaciones
                    op2 = false;
                }
            }

            //Dependiendo de la opcion del usuario (S o N)
            //Se repetira el menú o se saldra del bucle principal
            if (op.equals("S")){
                //Al ser `true` el menú se repetira
                menu = true;
                op2 = true; //Se reinicia el bucle
            } else {
                menu = false; //Si la respuesta es `N` se saldra del bucle principal
            }
        }

        System.out.println("Pedido a nombre de: " + nombre); //Mostar Datos del cliente
        cliente1.Factura(); //Se ejecutara la factura
    }
}