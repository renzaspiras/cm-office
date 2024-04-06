import UI.Window;
import Strings.App_info;

/**
 * index -- Java 11 is a must, 
 *  - if using different JDK, there is 10% the app might not work, but never be 0%
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

/*
 * Getting the best features from different Office Apps accross the net
 * - CM Word
 * - CM Powerpoint
 * - CM Excel
 * - CM Access
 * - CM Publisher
 */