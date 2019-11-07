package viewFx;

import controller.ControlMascotas;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.FileChooser;

public class VentanaPrincipalController implements Initializable {
    ControlMascotas controlador = new ControlMascotas();
    
    @FXML private Button loadBtn;
    @FXML private Button saveBtn;
    @FXML private ToggleButton isXmlToggle;
    @FXML private TextField newNombreInput;
    @FXML private TextField newEdadInput;
    @FXML private TextField newRazaInput;
    @FXML private Button newMascotaBtn;
    @FXML private TextArea reporteTextArea;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    
 
    @FXML
    void loadFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Cargar Reporte");
        fileChooser.setInitialDirectory(new File("res"));
        if(isXmlToggle.isSelected()){
            fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("XML Files", "*.xml")
            );
        } else {
            fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("CSV Files", "*.csv")
            );
        }
        File selectedFile = fileChooser.showOpenDialog(this.loadBtn.getScene().getWindow());
        System.out.println("File to load:" + selectedFile.getAbsolutePath());
    }

    @FXML
    void newMascota(ActionEvent event) {
        
    }

    @FXML
    void saveFile(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Guardar Reporte");
        fileChooser.setInitialDirectory(new File("res"));
        if(isXmlToggle.isSelected()){
            fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("XML Files", "*.xml")
            );
            fileChooser.setInitialFileName("reporte.xml");
        } else {
            fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("CSV Files", "*.csv")
            );
            fileChooser.setInitialFileName("reporte.csv");
        }
        File selectedFile = fileChooser.showSaveDialog(this.saveBtn.getScene().getWindow());
        System.out.println("File to save:" + selectedFile.getAbsolutePath());
    }
}
