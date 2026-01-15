
public class InterfazMenu {
     public void iniciarMenuPrincipal() {
         String menuPrincipal = """
            ---------------------------------------
            ¡Bienvenido al Conversor de Monedas!
            ---------------------------------------
            Seleccione una opción del 1 al 7 para continuar:
            
            1) Dólar (USD) a Peso Argentino (ARS)
            2) Peso Argentino (ARS) a Dólar (USD)
            3) Real Brasileño (BRL) a Dólar (USD)
            4) Dólar (USD) a Real Brasileño (BRL)
            5) Peso Argentino (ARS) a Real Brasileño (BRL)
            6) Real Brasileño (BRL) a Peso Argentino (ARS)
            
            7) Salir
            ---------------------------------------
            """;
         System.out.println(menuPrincipal);
     }

     public void iniciarMenuCantidad() {
         String menuCantidad = "Ingrese la cantidad de moneda que desea convertir: ";
         System.out.println(menuCantidad);
     }
}