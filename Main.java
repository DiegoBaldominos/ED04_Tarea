package cuentas;

/**
 * La clase Main es la clase principal que contiene el método main para probar la clase CCuenta.
 */
public class Main {
    
    /**
     * Método principal para probar la clase CCuenta.
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            operativa_cuenta(cuenta1, 2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar: " + e.getMessage());
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar: " + e.getMessage());
        }
    }

    /**
     * Realiza operaciones con la cuenta 
     * @param cuenta ID de la cuenta bancaria
     * @param cantidad cantidad de saldo a retirar
     * @throws Exception establece una excepción si hay algun error al retirar 
     * el dinero
     */
    public static void operativa_cuenta(CCuenta cuenta, double cantidad) throws Exception {
        cuenta.retirar(cantidad);
    }
}
