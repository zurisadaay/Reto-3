import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner trx = new Scanner(System.in);

        //Pedir los datos al usuario
        System.out.print("Nombre del medicamento: ");
        var nombreMed = trx.nextLine();

        System.out.print("Precio unitario: ");
        var precio = trx.nextDouble();

        System.out.print("Cantidad de Piezas: ");
        var cantidad = trx.nextInt();

        //Cálculo de del precio y cantidad
        double total = precio * cantidad;

        //Descuento si el total super los $500
        boolean aplicaDescuento = total  > 500;

        //Asignación del descuento (15%)
        double descuento = aplicaDescuento ? total * 0.15: 0;

        //Cáluclo final
        double totalFinal = total - descuento;

        //Salida formateada
        System.out.println(); //Para seprar

        System.out.printf("Medicamento: %s%n", nombreMed);
        System.out.printf("Cantidad: %d%n", cantidad);
        System.out.printf("Precio unitario: $%.1f%n", precio);
        System.out.printf("Total sin descuento: $%.1f%n", total);
        System.out.printf("¿Aplica descuento?: %b%n", aplicaDescuento);
        System.out.printf("Descuento: $%.1f%n", descuento);
        System.out.printf("Total a pagar: $%.1f%n", totalFinal);

        trx.close();

    }

}

