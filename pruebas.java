import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

	@Override
	public void start(Stage primary) throws Exception {
		
		//Creación del botón cerrar
		Button btn = new Button("Cerrar");
		btn.setOnAction( new EventHandler<ActionEvent>() {
			@Override
			public void handle( ActionEvent action ) {
				Platform.exit();
			}
		});
		
		//Posición X y Y
		btn.setLayoutX(50);
		btn.setLayoutY(50);
		
		//Tamaño
		btn.setPrefSize(100, 100);
		
		//Grupo de componentes
		Group root = new Group();
		root.getChildren().add( btn );
		
		//Se agrega el grupo al escenario
		Scene scene = new Scene( root, 200, 200, Color.DEEPSKYBLUE );
		
		primary.setScene( scene );
		
		//Se indica que el stage no tenga bordes
		primary.initStyle( StageStyle.UNDECORATED );
		
		primary.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}