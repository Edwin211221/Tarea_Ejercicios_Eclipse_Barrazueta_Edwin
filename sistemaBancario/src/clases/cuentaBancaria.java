package clases;

public class cuentaBancaria {
    protected String numeroCuenta;
    protected String titular;
    protected double saldo;

    // Constructor por defecto
    public cuentaBancaria() {
        this.numeroCuenta = "";
        this.titular = "";
        this.saldo = 0;
    }

    // Constructor con parámetros para inicializar la cuenta con datos específicos
    public cuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = (saldoInicial >= 0) ? saldoInicial : 0; // No permite saldo negativo al inicio
    }

    // Métodos Getter y Setter
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para depositar dinero en la cuenta (corregido)
    public String depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            return "Depósito de $" + monto + " realizado. Nuevo saldo: $" + saldo;
        } else {
            return "No se depositó. El monto debe ser mayor a 0.";
        }
    }

    // Método para retirar dinero de la cuenta
    public String retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            //System.out.println("Retiro de $" + monto + " realizado. Nuevo saldo: $" + saldo);
            return "Retiro de $" + monto + " realizado. Nuevo saldo: $" + saldo;
        } else {
            System.out.println("No se puede retirar $" + monto + ". Fondos insuficientes.");
            return "No se puede retirar $" + monto + ". Fondos insuficientes.";
        }
    }
    public String getInformacion() {
    	return "Cuenta: "+ numeroCuenta +
    			"\nTitular: " + titular +
    			"\nSaldo: $" + saldo;
    }
}