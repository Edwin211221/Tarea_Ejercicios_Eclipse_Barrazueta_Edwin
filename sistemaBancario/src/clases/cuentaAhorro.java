package clases;

public class cuentaAhorro extends cuentaBancaria {
    private double tasaInteres;
    private int retirosGratisMensuales;
    private int retirosRealizados;

    // Constructor por defecto
    public cuentaAhorro() {
        super(); // Llama al constructor de CuentaBancaria
        this.tasaInteres = 0;
        this.retirosGratisMensuales = 0;
        this.retirosRealizados = 0;
    }

    // Constructor con parámetros para inicializar valores específicos
    public cuentaAhorro(String numeroCuenta, String titular, double saldoInicial, double tasaInteres, int retirosGratis) {
        super(numeroCuenta, titular, saldoInicial);
        this.tasaInteres = tasaInteres;
        this.retirosGratisMensuales = retirosGratis;
        this.retirosRealizados = 0;
    }

    // Métodos Getters y Setters para tasa de interés
    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    // Métodos Getters y Setters para retiros gratis mensuales
    public int getRetirosGratisMensuales() {
        return retirosGratisMensuales;
    }

    public void setRetirosGratisMensuales(int retirosGratisMensuales) {
        this.retirosGratisMensuales = retirosGratisMensuales;
    }

    // Métodos Getters y Setters para retiros realizados
    public int getRetirosRealizados() {
        return retirosRealizados;
    }

    public void setRetirosRealizados(int retirosRealizados) {
        this.retirosRealizados = retirosRealizados;
    }

    // Método para aplicar intereses al saldo
    public String aplicarInteres() {
        double interes = saldo * tasaInteres;
        depositar(interes);
        return "Interés aplicado: $" + interes;
    }

    // Sobrescritura del método retirar() para aplicar comisiones si se exceden los retiros gratis
    @Override
    public String retirar(double monto) {
        String texto = "No existe comisión"; // Mensaje por defecto
        double comision = 0;

        // Si se superan los retiros gratuitos, se aplica una comisión del 2%
        if (retirosRealizados >= retirosGratisMensuales) {
            comision = monto * 0.02;
            texto = "Comisión por retiro adicional: $" + comision;
        }

        // Llamamos al método retirar() de la superclase y verificamos si se realizó el retiro
        String mensaje = super.retirar(monto + comision);

        // Si el mensaje de la superclase indica un retiro exitoso, incrementamos retiros realizados
        if (mensaje.substring(0, 1).equals("R")) {
            retirosRealizados++;
        }

        return texto;
    }
    public String reiniciarRetiros() {
    	retirosRealizados = 0;
    	return "Constador de retiros reiniciando para el nuevo mes";
    }

	@Override
	public String getInformacion() {
		// TODO Auto-generated method stub
		return super.getInformacion();
	}
    
}