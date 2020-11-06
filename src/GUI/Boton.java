package GUI;

import javafx.scene.control.Button;

public class Boton {
	private Button b1;
	
	public Boton(String s, Window w){
		b1=new Button(s);
		b1.setOnAction(e->{notificar(s,w);});
	}
	public Button getBoton() {
		return b1;
	}
	public void notificar(String s,Window w) {
		w.update(s);
	}
}