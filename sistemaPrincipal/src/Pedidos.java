import java.util.ArrayList;

public class Pedidos {
    //Declaración de listas para varias ordenes en el mismo pedido
    ArrayList<Integer> cantidadesProducto = new ArrayList<>();
    ArrayList<String> pedidos = new ArrayList<>();
    ArrayList<Double> precios = new ArrayList<>();

    //Variables para metodos
    double totalPagar;

    public void gestionarPedido(int cantidad, String producto){
        if (pedidos.contains(producto)){
            int indice = pedidos.indexOf(producto);
            cantidadesProducto.set(indice, cantidadesProducto.get(indice) + cantidad);
        } else {
            pedidos.add(producto);
            cantidadesProducto.add(cantidad);
        }
    }

    public void datosFactura(){
        precios.clear();
        totalPagar = 0.0;

        for (int i = 0; i < pedidos.size(); i++){
            switch (pedidos.get(i)){
                case "Cafe negro":
                    precios.add(cantidadesProducto.get(i) * 10.0);
                    break;
                case "Cafe latte":
                    precios.add(cantidadesProducto.get(i) * 15.0);
                    break;
                case "Cafe con leche":
                    precios.add(cantidadesProducto.get(i) * 17.0);
                    break;
                case "Cafe helado":
                    precios.add(cantidadesProducto.get(i) * 20.0);
                    break;
                case "Cafe con pan":
                    precios.add(cantidadesProducto.get(i) * 25.0);
                    break;
            }
        }

        for (int j = 0; j < pedidos.size(); j++){
            totalPagar = totalPagar + precios.get(j);
        }
    }

    public int verificarCantidades(String product){
        int indice = pedidos.indexOf(product);
        if (indice == -1){
            return 0;
        } else {
            return cantidadesProducto.get(indice);
        }
    }

    public void Factura(){
        datosFactura();
        System.out.println("------------------------------------------------------------");
        System.out.println("Cafeteria `Cafe con aroma a mujer` \n" +
                           "--------------------Detalles de la orden--------------------");
        System.out.println("Cafe negro..................Q.10 cantidad: " + verificarCantidades("Cafe negro"));
        System.out.println("Cafe latte..................Q.15 cantidad: " + verificarCantidades("Cafe latte"));
        System.out.println("Cafe con leche..............Q.17 cantidad: " + verificarCantidades("Cafe con leche"));
        System.out.println("Cafe helado.................Q.20 cantidad: " + verificarCantidades("Cafe helado"));
        System.out.println("Cafe con pan................Q.25 cantidad: " + verificarCantidades("Cafe con pan"));

        System.out.println("------------------------------------------------------------");
        System.out.println("Total a pagar..........................................Q." + totalPagar);
    }
}