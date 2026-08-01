import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import java.util.Date;

public class Main extends JFrame implements ActionListener{
    
    
    public Main(Empresa emp, Empleado actual, EmpleadoTemporal empt){
        setTitle("Empresa");
        setLocationRelativeTo(null);
        setSize(800,800);
        setBackground(Color.gray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());
        
        
        
        //jpanel
        JPanel panelDerecha = new JPanel(new FlowLayout());
        JButton btnAgregar = new JButton("Agregar Empleado");
        JButton btnRegHoras = new JButton("Registrar Horas");
        JButton btnRegVenta = new JButton("Registrar Venta");
        JButton btnActualizarContrato = new JButton("Actualizar Contrato");
        JButton btnGenReporte = new JButton("Generar Reporte");
        JTextField txtmonto = new JTextField();
        double monto = Double.parseDouble(txtmonto.getText());
        panelDerecha.add(btnAgregar);
        panelDerecha.add(btnRegHoras);
        panelDerecha.add(btnRegVenta);
        panelDerecha.add(btnActualizarContrato);
        panelDerecha.add(btnGenReporte);
        add(panelDerecha);
        
        //listeners
        btnAgregar.addActionListener(e -> emp.registrarEmpleado(actual));
        btnRegHoras.addActionListener(e -> emp.registrarHorasTrabajadas(actual.getCodigoUnico(), actual.getHorasTrabajadas()));
        btnRegVenta.addActionListener(e -> emp.registrarVentas(actual.getCodigoUnico(), monto));
        btnActualizarContrato.addActionListener(e -> emp.actualizarFechaFinContrato(actual.getCodigoUnico(), empt.getFechaFinContrato()));
        btnGenReporte.addActionListener(e -> emp.generarReporte());
        
        
        
        
        
        
        setVisible(true);
        
    }
    public static void main(String[] args) {
   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
}
