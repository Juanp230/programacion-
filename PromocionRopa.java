public class PromocionRopa {
    public static void main(String[] args) {
      
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;
        double descuento = 0.15;
        double descuentoAdicional = 0.05;

        
        double precioCamisetaConDescuento = precioCamiseta * (1 - descuento);
        double precioPantalonConDescuento = precioPantalon * (1 - descuento);

     
        double precioTotal = precioCamisetaConDescuento + precioPantalonConDescuento;

        
        double precioSegundaCamisetaConDescuentoAdicional = precioCamisetaConDescuento * (1 - descuentoAdicional);


        double precioTotalConSegundaCamiseta = precioTotal + precioSegundaCamisetaConDescuentoAdicional;

       
        System.out.println("Precio de la camiseta con el 15% de descuento: $" + precioCamisetaConDescuento);
        System.out.println("Precio del pantalón con el 15% de descuento: $" + precioPantalonConDescuento);
        System.out.println("Precio total de la camiseta y el pantalón después del descuento: $" + precioTotal);
        System.out.println("Precio de la segunda camiseta con el descuento adicional del 5%: $" + precioSegundaCamisetaConDescuentoAdicional);
        System.out.println("Precio total final incluyendo la segunda camiseta: $" + precioTotalConSegundaCamiseta);
    }
}
