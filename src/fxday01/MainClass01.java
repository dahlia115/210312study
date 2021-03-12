package fxday01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application {

	@Override
	//기본틀
	public void start(Stage arg0) throws Exception {
		System.out.println("자동호출됩니다");
		Label lb = new Label("Hello World!!!");
		lb.setFont(new Font(20));
		
		//기본바탕
		Scene scene = new Scene(lb);
		arg0.setScene(scene);
		
		arg0.setTitle("제목이 들어갑니다");
		arg0.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
