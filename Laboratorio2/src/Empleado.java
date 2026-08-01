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
    
    public void registrarHorasTrabajadas(int horas){
        if(horas < 0){
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas.");
        }
        this.horasTrabajadas = horas;
    }
    
    public double calcularPago(){
        if(horasTrabajadas < 0){
            throw new IllegalStateException("Las horas trabajadas son inválidas.");
        }
        if(horasTrabajadas > 160.0){
            double salarioFinal = salarioBase*160.0;
            double deduccion = salarioBase*0.035;
            return (salarioFinal/160.0) - deduccion;
        }
        double salarioFinal = (salarioBase*horasTrabajadas)/160.0;
        double deduccion = salarioBase*0.035;
        return salarioFinal - deduccion;
    }
    
    public String mostrarInformacion(){
        return "Codigo Unico: " + codigoUnico + "\n Nombre: " + nombre + " Fecha de contratacion: " + fechaContratacion;
    }
    
    public String toString(){
        return mostrarInformacion();
    }
}
