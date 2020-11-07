package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Window{
	private BorderPane root;
	private Boton b1;
	private Boton b2;
	private Boton b3;
	private VBox vertical=new VBox();
	public Window(){
		root = new BorderPane();
		b1=new Boton("yellow",this);
		b2=new Boton("blue",this);
		b3=new Boton("red",this);
		vertical.setPadding(new Insets(25));
		vertical.setSpacing(15);
		vertical.setAlignment(Pos.CENTER);
		vertical.getChildren().addAll(b1.getBoton(),b2.getBoton(),b3.getBoton());
		root.setCenter(vertical);
	}
	public BorderPane getRoot() {
		return root;
	}
	public void update(String s) {
		root.setStyle("-fx-background-color:"+s+";");
		System.out.println(s);
	}
}