public class Ej07 {
    public static void main(String[] args) throws Exception {

        // --- Datos de los productos ---
        String nombreProd1 = "Teclado Mecánico";
        int cantProd1 = 2;
        double precioProd1 = 89.99;

        String nombreProd2 = "Ratón Gaming RGBBBB";
        int cantProd2 = 1;
        double precioProd2 = 54.50;

        // 1. Realizamos todos los cálculos ANTES de imprimir.
        double subtotal1 = cantProd1 * precioProd1;
        double subtotal2 = cantProd2 * precioProd2;
        double totalFactura = subtotal1 + subtotal2;

        // --- Impresión de la Factura ---
        System.out.println("============================================================");
        System.out.println("                         FACTURA");
        System.out.println("============================================================");

        // Cabecera de la tabla
        System.out.printf("%-20s | %5s | %12s | %12s\n", "PRODUCTO", "CANT.", "PRECIO UD.", "SUBTOTAL");
        System.out.println("------------------------------------------------------------");

        // Filas de productos
        System.out.printf("%-20s | %5d | %12.2f | %12.2f\n", nombreProd1, cantProd1, precioProd1, subtotal1);
        System.out.printf("%-20s | %5d | %12.2f | %12.2f\n", nombreProd2, cantProd2, precioProd2, subtotal2);
        System.out.println("------------------------------------------------------------");

        // Total final
        System.out.printf("%42s %12.2f€\n", "TOTAL A PAGAR:", totalFactura);
        System.out.println("============================================================");

    }
}
