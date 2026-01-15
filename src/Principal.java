import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        InterfazMenu menu = new InterfazMenu();
        ConversorMonedas consulta = new ConversorMonedas();
        int opcionMenu = 0;
        double cantidad;
        Scanner lectura = new Scanner(System.in);

        while (opcionMenu != 7) {
            String base_code = null;
            String target_code = null;
            try {
                menu.iniciarMenuPrincipal();
                opcionMenu = Integer.parseInt(lectura.nextLine());
                switch (opcionMenu) {
                    case 1:
                        base_code = "USD";
                        target_code = "ARS";
                        menu.iniciarMenuCantidad();
                        cantidad = Double.parseDouble(lectura.nextLine());
                        DatosExchangeRateAPI datos1 = consulta
                                .resultadoDeConversion(base_code, target_code, cantidad);
                        System.out.println("Su conversión ha sido exitosa! El resultado de la operación es: $"
                                + datos1.conversion_result() + ". \n");
                        break;
                    case 2:
                        base_code = "ARS";
                        target_code = "USD";
                        menu.iniciarMenuCantidad();
                        cantidad = Double.parseDouble(lectura.nextLine());
                        DatosExchangeRateAPI datos2 = consulta
                                .resultadoDeConversion(base_code, target_code, cantidad);
                        System.out.println("Su conversión ha sido exitosa! El resultado de la operación es: $"
                                + datos2.conversion_result() + ". \n");
                        break;
                    case 3:
                        base_code = "BRL";
                        target_code = "USD";
                        menu.iniciarMenuCantidad();
                        cantidad = Double.parseDouble(lectura.nextLine());
                        DatosExchangeRateAPI datos3 = consulta
                                .resultadoDeConversion(base_code, target_code, cantidad);
                        System.out.println("Su conversión ha sido exitosa! El resultado de la operación es: $"
                                + datos3.conversion_result() + ". \n");
                        break;
                    case 4:
                        base_code = "USD";
                        target_code = "BRL";
                        menu.iniciarMenuCantidad();
                        cantidad = Double.parseDouble(lectura.nextLine());
                        DatosExchangeRateAPI datos4 = consulta
                                .resultadoDeConversion(base_code, target_code, cantidad);
                        System.out.println("Su conversión ha sido exitosa! El resultado de la operación es: $"
                                + datos4.conversion_result() + ". \n");
                        break;
                    case 5:
                        base_code = "ARS";
                        target_code = "BRL";
                        menu.iniciarMenuCantidad();
                        cantidad = Double.parseDouble(lectura.nextLine());
                        DatosExchangeRateAPI datos5 = consulta
                                .resultadoDeConversion(base_code, target_code, cantidad);
                        System.out.println("Su conversión ha sido exitosa! El resultado de la operación es: $"
                                + datos5.conversion_result() + ". \n");
                        break;
                    case 6:
                        base_code = "BRL";
                        target_code = "ARS";
                        menu.iniciarMenuCantidad();
                        cantidad = Double.parseDouble(lectura.nextLine());
                        DatosExchangeRateAPI datos6 = consulta
                                .resultadoDeConversion(base_code, target_code, cantidad);
                        System.out.println("Su conversión ha sido exitosa! El resultado de la operación es: $"
                                + datos6.conversion_result() + ". \n");
                        break;
                    case 7:
                        System.out.println("Saliendo del conversor. \n" +
                                "Gracias por utilizar nuestros servicios.");
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error, por favor ingrese sólo números.");
            }
        }
    }
}