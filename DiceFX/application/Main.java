package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	String t1 = "1";
	String t2 = "6";
	double calc1=0;
	double calc2=0;
	int calc3=0;
	int calc4=0;
	String calc5 = "1";
	String calc6 = "3";

	
	
	@Override
	public void start(Stage primaryStage) {


		primaryStage.setHeight(81);
		primaryStage.setWidth(162);

		
		
		
		
Button button1 = new Button(calc5);
Button button2 = new Button("6");	




button1.setOnAction(event -> {
	calc1 = Math.random()*6+1;
	calc3 = (int)calc1;
	calc5 = Integer.toString(calc3);
	button1.setText(calc5);
});


button2.setOnAction(new EventHandler<ActionEvent>() {
@Override
public void handle (ActionEvent b) {
	calc2 = Math.random()*6+1;
	calc4 = (int)calc2;
	calc6 = Integer.toString(calc4);
	button2.setText(calc6);
}
});



button1.setPrefSize(80, 80);
button2.setPrefSize(80, 80);
		GridPane grid = new GridPane();
		
grid.add(button1, 0, 0);
grid.add(button2, 1, 0);
		
grid.setGridLinesVisible(true);








Scene scene = new Scene(grid);
primaryStage.setScene(scene);
primaryStage.show();
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		}
	
}
