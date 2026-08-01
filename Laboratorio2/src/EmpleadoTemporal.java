
import java.util.*;

public class EmpleadoTemporal extends Empleado {

    private Calendar fechaFinDeContrato;

    public EmpleadoTemporal(String codigoUnico, String nombre, String img) {
        super(codigoUnico, nombre, img);
        this.fechaFinDeContrato = fechaFinDeContrato;
        fechaContratacion = Calendar.getInstance();
        salarioBase = 15000;
        horasTrabajadas = 0;

    }
    
    public Calendar getFechaFinContrato(){
    return fechaFinDeContrato;}
    
    @Override
    public double calcularPago() {
        Calendar hoy = Calendar.getInstance();
        
        if (hoy.after(fechaFinDeContrato)) {
            return 0;
        }
        return salarioBase*horasTrabajadas/160;
        
        
        
        
    }

    public void actualizarFechaFinContrato(Calendar nuevaFechaFinContrato) {
        this.fechaFinDeContrato = nuevaFechaFinContrato;
    }
    
    @Override
    public String mostrarInformacion(){
    return super.mostrarInformacion() + " Fin de contrato: " + fechaFinDeContrato.getTime();
    
    }
}
