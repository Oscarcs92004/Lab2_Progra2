/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author oscar
 */
public class Empresa {
    private String nombreEmpresa;
    private ArrayList<Empleado> empleados;
    
    public Empresa(String nombreEmpresa){
        this.nombreEmpresa = nombreEmpresa;
        empleados = new ArrayList<>();
    }
    
    public boolean registrarEmpleado(Empleado e){
        if(buscarEmpleado(e.getCodigoUnico()) != null){
            return false;
        }
        empleados.add(e);
        return true;
    }
    
    public Empleado buscarEmpleado(String codigoUnico){
        for(int i = 0; i < empleados.size(); i++){
            if(empleados.get(i).getCodigoUnico().equals(codigoUnico)){
                return empleados.get(i);
            }
        }
        return null;
    }
    
    public boolean registrarHorasTrabajadas(String codigoUnico, int horas){
        Empleado e = buscarEmpleado(codigoUnico);
        
        if(e == null){
            return false;
        }
        
        e.registrarHorasTrabajadas(horas);
        return true;
    }
    
    public boolean registrarVentas(String codigoUnico, double monto){
        Empleado e = buscarEmpleado(codigoUnico);
        
        if(e == null){
            return false;
        }
        
        if(e instanceof EmpleadoVentas){
            EmpleadoVentas aux = (EmpleadoVentas)e;
            aux.registrarVentas(monto);
            return true;
        }
        return false;
    }
    
    public boolean actualizarFechaFinContrato(String codigoUnico, Calendar nuevaFecha){
        Empleado e = buscarEmpleado(codigoUnico);
        
        if(e == null){
            return false;
        }
        if(e instanceof EmpleadoTemporal){
            EmpleadoTemporal aux = (EmpleadoTemporal) e;
            aux.actualizarFechaFinContrato(nuevaFecha);
            return true;
        }
        return false;
    }
    
    public double calcularPagoMensual(String codigoUnico){
        Empleado e = buscarEmpleado(codigoUnico);
        if(e == null){
            return -1;
        }
        
        return e.calcularPago();
    }
    
    public String generarReporte(){
        String reporte = "";
        int cantNormales = 0;
        int cantTemporales = 0;
        int cantVentas = 0;
        reporte += "----- Reporte Empleados -----\n";
        reporte += "----- Empleados Estandar -----\n";
        
        for(int i = 0; i < empleados.size(); i++){
            Empleado aux = empleados.get(i);
            if(aux.getClass() == Empleado.class){
                cantNormales++;
                
                reporte += aux.mostrarInformacion();
                reporte += "\n Horas: " + aux.getHorasTrabajadas();
                reporte += "\n Salario Base: " + aux.getSalarioBase();
                reporte += "\n Pago: " + aux.calcularPago();
                reporte += "\n";
            }
        }
        
        reporte += "----- Empleados Temporales ----- \n";
        
        for(int i = 0; i < empleados.size(); i++){
            Empleado aux = empleados.get(i);
            if(aux instanceof EmpleadoTemporal){
                cantTemporales++;
                reporte += aux.mostrarInformacion();
                reporte += "\n Horas: " + aux.getHorasTrabajadas();
                reporte += "\n Salario Base: " + aux.getSalarioBase();
                reporte += "\n Pago: " + aux.calcularPago();
                reporte += "\n";
            }
        }
        
        reporte += "----- Empleados de Ventas -----\n";
        
        for(int i = 0; i < empleados.size(); i++){
            Empleado aux = empleados.get(i);
            if(aux instanceof EmpleadoVentas){
                cantVentas++;
                reporte += aux.mostrarInformacion();
                reporte += "\n Horas: " + aux.getHorasTrabajadas();
                reporte += "\n Salario Base: " + aux.getSalarioBase();
                reporte += "\n Pago: " + aux.calcularPago();
                reporte += "\n";
            }
        }
        
        reporte += "-------- Resumen Cantidad de Empleados de cada tipo -----\n";
        reporte += "Total estándar: " + cantNormales + "\n";
        reporte += "Total temporales: " + cantTemporales + "\n";
        reporte += "Total ventas: " + cantVentas + "\n";
        reporte += "Total empleados: " + empleados.size();
        
        return reporte;
    }
    
    public ArrayList<Empleado> getEmpleado(){
        return empleados;
    }
    
}
