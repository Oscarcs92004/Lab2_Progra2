
import java.util.*;

public class EmpleadoTemporal extends Empleado {

    private Calendar fechaFinDeContrato;

    public EmpleadoTemporal(String codigoUnico, String nombre, String img) {
        super(codigoUnico, nombre, img);
        this.fechaFinDeContrato = Calendar.getInstance();
        fechaContratacion = Calendar.getInstance();
        salarioBase = 15000;
        horasTrabajadas = 0;

    }
    @Override
    public double calcularPago() {
        
        
        
        return 0;
    }

    public void actualizarFechaFinContrato(Calendar nuevaFechaFinContrato) {

    }
    
    @Override
    public String mostrarInformacion(){
    super.mostrarInformacion();
    
    return "";}
}
