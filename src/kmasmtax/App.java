/*
 * App.java
 */

package kmasmtax;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class App extends SingleFrameApplication {
    static int UserLogedInID;
    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new View(this));
    }
    protected static void ViewShow(){
        //String[] args={"",""};
        //if(UserLogedInID!=1){
            //BillsView.main(args);
            /*
            BillsView view=new BillsView();
            view.setVisible(true);
            */
        //}
        //else
            //adminview
    }
    protected void ViewInsertCompany(){
        //show(new Companies());
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of App
     */
    public static App getApplication() {
        return Application.getInstance(App.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(App.class, args);
    }

}
