/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Calendar;
/**
 *
 * @author oscar
 */
public class Empleado {
    protected String codigoUnico;
    protected String nombre;
    protected Calendar fechaContratacion;
    protected double salarioBase;
    protected int horasTrabajadas;
    protected String img;
    
    public Empleado(String codigoUnico,String nombre, String img){
        this.codigoUnico = codigoUnico;
        this.nombre = nombre;
        this.img = img;
        fechaContratacion = Calendar.getInstance();
        salarioBase = 15000;
        horasTrabajadas = 0;
    }
    
    public String getCodigoUnico(){
        return codigoUnico;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Calendar getFechaContratacion(){
        return fechaContratacion;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public int getHorasTrabajadas(){
        return horasTrabajadas;
    }
    
    public String getImg(){
        return img;
    }
    
    public void setCodigoUnico(String codigoUnico){
        this.codigoUnico = codigoUnico;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setImg(String img){
        this.img = img;
    }
    
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    
    public void registrarHorasTrabajadas(){
    
    }
    
    public double calcularPago(){
        // borrar el return 0 despues ahorita esta solo para que no tire error
        return 0;
    }
    
    public void mostrarInformacion(){
    
    }
}
