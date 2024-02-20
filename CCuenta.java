package cuentas;

/**
* La case CCuenta representará una cuenta bancaria con sus atributos
* Los atributos serán el nombre del titular, el ID de la cuenta, el saldo actual,
* y el tipo de interés asociado a la cuenta
*/
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {}
/**
 * Constructor que inicializa los valores de CCuenta
 * @param nom nombre del titular de la cuenta
 * @param cue ID de la c uenta bancaria
 * @param sal saldo actual de la cuenta bancaria
 * @param tipo tipo de interés de la cuenta bancaria
 */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
/**
 * obtiene el saldo actual de la cuenta
 * @return el saldo de la cuenta
 */
    public double getSaldo() {
        return saldo;
    }
/**
 * establece el saldo de la cuenta
 * @param saldo actual de la cuenta
 */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
/**
 * ingresa una cantidad de dinero en la cuenta
 * @param cantidad que introducimos
 * @throws Exception lanza una excepcion si el dinero introducido es negativo
 */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * Retira una cantidad de dinero de la cuenta
 * @param cantidad retirada
 * @throws Exception Si el saldo es inferior a la cantidad retirada o si la 
 * cantidad es negativa
 */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}