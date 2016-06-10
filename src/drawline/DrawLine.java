package drawline;
import javax.swing.*;
import java.awt.*;
public class DrawLine extends JFrame {
    public DrawLine(){
        
    }
    public static void main(String[] args) {
        DrawLine frame = new DrawLine();
        frame.setTitle("Draw Line");
        frame.setLocation(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(317,340);
        frame.setVisible(true);
        Panel a = new Panel();
        a.setNumbersOfline(14);
        frame.add(a);
    }//end of main 
}
class Panel extends JPanel{
    int line;
    public void setNumbersOfline(int line){
        this.line = line;
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //(a)a set of line of one edge
//   
//        for(int i = 1; i <= line; i++){
//            g.drawLine(0, 0, (getWidth()/(line+1)) *i, getHeight()-(getHeight()/(line+1))*i);
//        }
        
        //(b) figure
        for(int i = 1; i <= line; i++){
            g.drawLine(0, 0, (getWidth()/(line+1)) *i, getHeight() -(getHeight()/(line+1) )*i);
            
            g.drawLine(0, getHeight(), (getWidth()/(line+1)) *i, (getHeight()/(line+1)) *i);
            
            g.drawLine(getWidth(), getHeight(), (getWidth()/(line+1)) *i, getHeight() -(getHeight()/(line+1)) *i);
            
            g.drawLine(getWidth(), 0, (getWidth()/(line+1)) *i, (getHeight()/(line+1) )*i);         
        }
        
        
    }
}
