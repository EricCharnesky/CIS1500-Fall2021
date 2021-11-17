
package guihelloworldmorning;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ExampleController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private Label label;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void butonClick(ActionEvent event) {
        String currentText = label.getText();
        currentText += "Hello world!\n";
        label.setText(currentText);
    }
    
}
