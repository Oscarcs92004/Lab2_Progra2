

import java.util.Calendar;

public class EmpleadoVentas extends Empleado {

    private double[] ventasMensuales;
    private double tasaComision;

    public EmpleadoVentas(String codigoUnico, String nombre, String img, double tasaComision) {
        super(codigoUnico, nombre, img);

        if (tasaComision < 0) {
            
            throw new IllegalArgumentException("La tasa de comisión no puede ser negativa. Coloque un valor positivo!");
        }

        this.tasaComision = tasaComision;
        ventasMensuales = new double[12];
    }

    public void registrarVentas(double monto) {

        if (monto < 0) {
            
            throw new IllegalArgumentException("Las ventas no pueden ser negativas. Inténtelo de nuevo!");
        }

        int mesActual = Calendar.getInstance().get(Calendar.MONTH);

        ventasMensuales[mesActual] += monto;
    }

    public double calcularComision() {

        int mesActual = Calendar.getInstance().get(Calendar.MONTH);

        return ventasMensuales[mesActual] * tasaComision;
    }

    @Override
    public double calcularPago() {

    int horas = horasTrabajadas;

    if (horas > 160) {
        
        horas = 160;
    }

    double pagoBase = (salarioBase * horas) /160.0;

    return pagoBase + calcularComision();
        }

    @Override
    public String mostrarInformacion() {

        return super.mostrarInformacion()
                + "Tasa de comisión: " + (tasaComision * 100) + "%" + "Ventas anuales: L. " + calcularVentasAnuales() + "Cmisión del mes: L. " + calcularComision() + "Pago mensual: L. " + calcularPago();
        }

    public double[] getVentasMensuales() {
        
        return ventasMensuales;
    }
    
    public double calcularVentasAnuales() {

        double total = 0;

        for (int i = 0; i < ventasMensuales.length; i++) {
            total += ventasMensuales[i];
        }

        return total;
    }

    public double getTasaComision() {
        return tasaComision;
    }

    public void setTasaComision(double tasaComision) {

        if (tasaComision < 0) {
            
            throw new IllegalArgumentException("La tasa de comisión no puede ser negativa.");
        }

        this.tasaComision = tasaComision;
    }
}