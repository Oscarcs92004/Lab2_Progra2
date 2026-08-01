import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame implements ActionListener{
    
    
    public Main(){
        setTitle("Empresa");
        setLocationRelativeTo(null);
        setSize(800,800);
        setBackground(Color.gray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());
        setVisible(true);
        
        
        //jpanel
        JPanel panelDerecha = new JPanel(new FlowLayout());
        JButton btnAgregar = new JButton("Agregar Empleado");
        JButton btnRegHoras = new JButton("Registrar Horas");
        JButton btnRegVenta = new JButton("Registrar Venta");
        JButton btnActualizarContrato = new JButton("Actualizar Contrato");
        JButton btnGenReporte = new JButton("Generar Reporte");
        panelDerecha.add(btnAgregar);
        panelDerecha.add(btnRegHoras);
        panelDerecha.add(btnRegVenta);
        panelDerecha.add(btnActualizarContrato);
        panelDerecha.add(btnGenReporte);
        add(panelDerecha);
        
    }
    public static void main(String[] args) {
        Main main = new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
}
