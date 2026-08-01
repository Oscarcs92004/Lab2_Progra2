import java.awt.Color;
import javax.swing.*;

public class Main extends JFrame{
    
    
    public Main(){
        
        
        setSize(800,800);
        setBackground(Color.gray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        Main main = new Main();
    }
}
