import java.util.Scanner;

public class ConversorDeMonedas {

    public static void main(String[] args) {
        // Definir las tasas de cambio (ejemplo: USD -> EUR, USD -> JPY, etc.)
        final double tasaDolarEuro = 0.92;
        final double tasaDolarYen = 134.21;
        final double tasaEuroDolar = 1 / tasaDolarEuro;
        final double tasaYenDolar = 1 / tasaDolarYen;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Monedas");
        System.out.println("Seleccione la moneda de origen:");
        System.out.println("1. USD (Dólar Americano)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. JPY (Yen Japonés)");

        // Obtener la moneda de origen
        int opcionOrigen = scanner.nextInt();
        System.out.println("Seleccione la moneda de destino:");
        System.out.println("1. USD (Dólar Americano)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. JPY (Yen Japonés)");

        // Obtener la moneda de destino
        int opcionDestino = scanner.nextInt();

        // Solicitar la cantidad a convertir
        System.out.println("Ingrese la cantidad a convertir:");
        double cantidad = scanner.nextDouble();

        // Variable para almacenar el resultado de la conversión
        double resultado = 0;

        // Realizar la conversión según las opciones seleccionadas
        if (opcionOrigen == 1 && opcionDestino == 2) {
            resultado = cantidad * tasaDolarEuro;  // USD -> EUR
        } else if (opcionOrigen == 1 && opcionDestino == 3) {
            resultado = cantidad * tasaDolarYen;  // USD -> JPY
        } else if (opcionOrigen == 2 && opcionDestino == 1) {
            resultado = cantidad * tasaEuroDolar;  // EUR -> USD
        } else if (opcionOrigen == 2 && opcionDestino == 3) {
            resultado = cantidad * tasaEuroDolar * tasaDolarYen;  // EUR -> JPY
        } else if (opcionOrigen == 3 && opcionDestino == 1) {
            resultado = cantidad * tasaYenDolar;  // JPY -> USD
        } else if (opcionOrigen == 3 && opcionDestino == 2) {
            resultado = cantidad * tasaYenDolar * tasaDolarEuro;  // JPY -> EUR
        } else {
            System.out.println("La conversión seleccionada no es válida.");
            System.exit(0);
        }

        // Mostrar el resultado de la conversión
        System.out.printf("La cantidad convertida es: %.2f%n", resultado);
        scanner.close();
    }
}
