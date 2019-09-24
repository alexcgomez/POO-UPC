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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;


public class Controller implements Initializable {
    
    public Tesoro2 tesoro;
   
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
    private JFXButton btPunt2D;
    @FXML
    private Pane pane4;
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
    @FXML
    private Pane pane3;
    @FXML
    private JFXTextField CoorXp1;
    @FXML
    private JFXTextField CoorYp1;
    @FXML
    private JFXTextField CoorXp2;
    @FXML
    private JFXTextField CoorYp2;
    @FXML
    private JFXButton btCalcDist;
    @FXML
    private JFXTextField distX;
    @FXML
    private JFXTextField distY;
    @FXML
    private JFXTextField distMod;
    @FXML
    private JFXTextField TesDes2;
    @FXML
    private JFXTextField TesAlt2;
    @FXML
    private JFXTextField TesVal2;
    @FXML
    private JFXButton VerTes;
    @FXML
    private JFXButton ActTes;
    @FXML
    private TextField TesDes1;
    @FXML
    private TextField TesAlt1;
    @FXML
    private TextField TesVal1;

    
  
 
    
 
    
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

    @FXML
    private void PanelPunt2D(ActionEvent event) {
        
        pane3.toFront();
        
    }

    @FXML
    private void CalculaDistancias(ActionEvent event) {
        
        
        
        Punt2D punt2d1,punt2d2;
        punt2d1 = new Punt2D(Double.parseDouble(CoorXp1.getText()),Double.parseDouble(CoorYp1.getText()));
        punt2d2 = new Punt2D(Double.parseDouble(CoorXp2.getText()),Double.parseDouble(CoorYp2.getText()));
        
        distX.setText(Double.toString(punt2d1.DistanciaX(punt2d2)));
        distY.setText(Double.toString(punt2d1.DistanciaY(punt2d2)));
        distMod.setText(Double.toString(punt2d1.Distanciapunt(punt2d1, punt2d2)));
                     
    }

    @FXML
    private void ActualizarTesoro(ActionEvent event) {
        
         tesoro = new Tesoro2(TesDes1.getText(),Integer.parseInt(TesAlt1.getText()),Double.parseDouble(TesVal1.getText()));
        
               
    }

    @FXML
    private void VerTesoro(ActionEvent event) {
        
        TesDes2.setText(tesoro.getDescripcion());
        TesAlt2.setText(Integer.toString(tesoro.getAltura()));
        TesVal2.setText(Double.toString(tesoro.getValor()));
        
        if (tesoro.esValioso()){
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Valor del tesoro");
        alert.setHeaderText(null);
        alert.setContentText("El tesoro es valioso!");

        alert.showAndWait();}
        
        else{
        Alert alert2 = new Alert(AlertType.WARNING);
        alert2.setTitle("Valor del tesoro");
        alert2.setHeaderText(null);
        alert2.setContentText("El tesoro no vale para nada...");

        alert2.showAndWait();}
    }
    
    
    
    


}
