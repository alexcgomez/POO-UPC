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
    @FXML
    private JFXTextField Max21;
    @FXML
    private JFXTextField Max22;
    @FXML
    private JFXTextField Maxim2;
    @FXML
    private JFXTextField Maxim3;
    @FXML
    private JFXTextField Max32;
    @FXML
    private JFXTextField Max31;
    @FXML
    private JFXTextField Max33;
    @FXML
    private JFXTextField fac1;
    @FXML
    private JFXTextField Factorial;

    
  
 
    
 
    
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

    @FXML
    private void Maximo2(MouseEvent event) {
        
        Max2 maximo2 = new Max2(Integer.parseInt(Max21.getText()),Integer.parseInt(Max22.getText()));
        Maxim2.setText(Integer.toString(maximo2.maxim2()));
        
    }

    @FXML
    private void Maximo3(MouseEvent event) {
        
          Max3 maximo3 = new Max3(Integer.parseInt(Max31.getText()),Integer.parseInt(Max32.getText()),Integer.parseInt(Max33.getText()));
          Maxim3.setText(Integer.toString(maximo3.maxim3()));
    }

    @FXML
    private void calcfact(MouseEvent event) {
        
        LongCalculoFact fact1 = new LongCalculoFact(Integer.parseInt(fac1.getText()));
        Factorial.setText(Long.toString(fact1.CalcFact()));
    }
    
    
    
    


}
