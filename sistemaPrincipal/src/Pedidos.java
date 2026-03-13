public class Pedidos {
    String cliente;
    String pedido;
    int cantidad;
    double precio;
    double compraTotal;
    double precioPagar;
    double descuento;

    public Pedidos(String cliente, String pedido, int cantidad, double precio){
        this.cliente = cliente;
        this.pedido = pedido;
        this.cantidad = cantidad;
        this.precio = precio;
        this.compraTotal = cantidad * precio;
    }

    //Aplicar_descuentos
    public void Descuentos(){
        if (compraTotal >= 100){
            descuento = 0.15;
            precioPagar = compraTotal * (1 - descuento);
        } else if (compraTotal >= 80){
            descuento = 0.10;
            precioPagar = compraTotal * (1 - descuento);
        } else if (compraTotal >= 50){
            descuento = 0.05;
            precioPagar = compraTotal * (1 - descuento);
        } else {
            precioPagar = compraTotal;
        }
    }

    public void Factura(){
        System.out.println("-------------------------------------------------");
        System.out.println("| Factura de cafeteria Cafe con aroma a mujer |");
        System.out.println("-------------------------------------------------");
        System.out.println("|Producto ordenado..............." + pedido);
        System.out.println("|Cantidad ordenada..............." + cantidad);
        System.out.println("|Precio unitario.................Q." + precio);
        System.out.println("-------------------------------------------------");
        System.out.println("|Total a neto....................Q." + compraTotal);
        System.out.println("|Descuento aplicado.............." + (descuento * 100) + "%");
        System.out.println("|Total a pagar...................Q." + precioPagar);
    }
}