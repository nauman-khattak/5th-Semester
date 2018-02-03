package MouseDemo;



import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JTextField;

public class MouseListenerDemo extends Frame implements MouseListener, MouseMotionListener{
    JTextField TF;
    public MouseListenerDemo() {
        super("MouseDemo");
        TF = new JTextField();
        addMouseListener(this);
        addMouseMotionListener(this);
        
        
    }
    
    public void LaunchFrame(){
        add(TF, BorderLayout.SOUTH);
        setSize(400, 400);
        setVisible(true);
        TF.setEditable(false);
        
        TF.setToolTipText("This is JTextField");
    }   
    
    public static void main(String[] args) {
        MouseListenerDemo J = new MouseListenerDemo();
        J.LaunchFrame();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        TF.setText("Mouse is clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        TF.setText("Mouse is pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        TF.setText("Mouse is released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        TF.setText("Mouse is entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        TF.setText("Mouse is exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        TF.setText("Mouse is dragged at "+e.getX()+", "+e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        TF.setText("Mouse is moved at "+e.getX()+", "+e.getY());
    }
    
}
