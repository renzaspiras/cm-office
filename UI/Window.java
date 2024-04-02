package UI;

// Lazy Import for java.swing
import javax.swing.*;


public class Window extends JFrame{
  public Window(boolean visible){
    this.setVisible(visible);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  public void isCentered(boolean status){
    this.setLocationRelativeTo(null);
  }
}
