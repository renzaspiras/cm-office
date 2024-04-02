import UI.Window;
import Strings.App_info;

/**
 * index
 */

public class index {

  public static void main(String[] args) {
    App_info app = new App_info();

    Window root = new Window(true);
    root.setTitle(app.AppName);
    root.setSize(1000, 700);
    root.isCentered(true);
  }
}