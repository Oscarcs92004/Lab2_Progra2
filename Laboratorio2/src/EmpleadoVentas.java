

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

        System.out.println("**** EMPLEADO DE VENTAS ****");
        System.out.println("Código de empleado: " + codigoUnico);
        System.out.println("Nombre co/mpleto: " +nombre);
        System.out.println("Fecha de contratación: " + fechaContratacion.getTime());
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        
        System.out.println("Salario base: L. " + salarioBase);
        System.out.println("Comisión del mes: L. " + calcularComision());
        System.out.println("Ventas anuales: L. " + calcularVentasAnuales());
        System.out.println("Pago mensual: L. " +calcularPago());
    }

    public double[] getVentasMensuales() {
        
        return ventasMensuales;
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