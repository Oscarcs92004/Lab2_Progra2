/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
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
    
    public boolean registrarEmpleado(){
    
    }
    
    public Empleado buscarEmpleado(){
    
    }
    
    public boolean registrarHorasTrabajadas(){
    
    }
    
    public boolean registrarVentas(){
    
    }
    
    public boolean actualizarFechaFinContrato(){
    
    }
    
    public double calcularPagoMensual(){
    
    }
    
    public String generarReporte(){
    
    }
    
    public ArrayList<Empleado> getEmpleado(){
        return empleados;
    }
    
}
