package GUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application{
	public static void main(String[] args) {
        launch(args);
    }
	@Override
    public void start(Stage primaryStage) {		
		Window w=new Window();
		Scene s= new Scene(w.getRoot(),1000,600);		
	    primaryStage.setTitle("Observer");
	    primaryStage.setScene(s);
	    primaryStage.show();
   }
}