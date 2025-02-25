package clases;

public class cuentaCorriente extends cuentaBancaria {
    private double sobregiro;
    private double limiteSobregiro;

    // Constructor por defecto
    public cuentaCorriente() {
        super();
        this.sobregiro = 0;
        this.limiteSobregiro = 0;
    }

    // Constructor con parámetros
    public cuentaCorriente(String numeroCuenta, String titular, double saldoInicial, double limiteSobregiro) {
        super(numeroCuenta, titular, saldoInicial);
        this.sobregiro = 0;
        this.limiteSobregiro = limiteSobregiro;
    }

    // Métodos Getters y Setters
    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    // Método para retirar dinero con validación de sobregiro
    @Override
    public String retirar(double monto) {
        String texto = "";

        // Validación de monto negativo
        if (monto <= 0) {
            texto = "Monto menor o igual a cero.";
        }
        // Si hay saldo suficiente, retirar normalmente
        else if (saldo >= monto) {
            texto = super.retirar(monto);
        } 
        // Si no hay suficiente saldo pero se puede usar sobregiro
        else if (saldo + limiteSobregiro - sobregiro >= monto) {
            double montoSobregiro = monto - saldo;
            saldo = 0;
            sobregiro += montoSobregiro;

            texto = "Retiro de $" + monto + " realizado.\n"
                  + "Usando sobregiro: $" + montoSobregiro + "\n"
                  + "Sobregiro actual: $" + sobregiro;
        } 
        // Si excede el límite de sobregiro
        else {
            texto = "No se puede retirar $" + monto + ". Excede el límite de sobregiro.";
        }

        return texto;
    }

    // Método para pagar el sobregiro
    public String pagarSobregiro(double monto) {
        String texto = "";

        if (monto <= 0 || sobregiro <= 0) {
            texto = "No hay nada que pagar.";
        } else {
            if (monto > sobregiro) {
                double excedente = monto - sobregiro;
                sobregiro = 0;
                depositar(excedente);
            } else {
                sobregiro -= monto;
            }

            texto = "Pago de sobregiro: $" + monto + "\n"
                  + "Sobregiro restante: $" + sobregiro;
        }

        return texto;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSobregiro actual: $" + sobregiro + "\nLímite de sobregiro: $" + limiteSobregiro;
    }
}