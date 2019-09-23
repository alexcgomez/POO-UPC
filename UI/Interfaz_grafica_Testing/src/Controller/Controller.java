package Controller;

import Clases.*;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import javafx.application.Platform;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;


public class Controller implements Initializable {

    @FXML
    private Button button1;
    @FXML
    private JFXButton btMisFunciones;
    @FXML
    private Pane pane1;
    @FXML
    private JFXButton btTesoro1;
    @FXML
    private Pane pane2;
    @FXML
    private JFXButton btTesoro2;
    @FXML
    private JFXButton btPunt2D1;
    @FXML
    private Pane pane4;
    @FXML
    private Pane pane3;
    @FXML
    private JFXButton btCalcular;
    @FXML
    private JFXTextField Entero1;
    @FXML
    private JFXTextField Entero2;
    @FXML
    private JFXTextField ResultadoSum;

    
  
 
    
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
           
    }    

    @FXML
    private void cerrarVentana(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void Panel1(ActionEvent event) {
        pane1.toFront();
    }

    @FXML
    private void Panel2(ActionEvent event) {
        pane2.toFront();
    }

    @FXML
    private void Panel3(ActionEvent event) {
        pane3.toFront();
    }

    @FXML
    private void Panel4(ActionEvent event) {
        pane4.toFront();
    }

    @FXML
    private void SumarEnteros(ActionEvent event) {
        Sumar suma = new Sumar(Integer.parseInt(Entero1.getText()),Integer.parseInt(Entero2.getText()));
        ResultadoSum.setText(Integer.toString(suma.sumar()));
    }
    
    


}
