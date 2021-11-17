package guihelloworldmorning;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ExampleController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private Label label;
    @FXML
    private TextField hoursWorkedTextBox;
    @FXML
    private TextField wageTextBox;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void butonClick(ActionEvent event) {
        try {
            double hoursWorked = Double.parseDouble(hoursWorkedTextBox.getText());
            double payRate = Double.parseDouble(wageTextBox.getText());

            double weeklySalary = hoursWorked * payRate;
            String result = String.format("Your weekly gross pay is: $%.2f", weeklySalary);
            double overtimePay = 0;

            if (hoursWorked > 40) {
                overtimePay = (hoursWorked - 40) * payRate * .5;
                result += String.format("\nYou made $%.2f addition in overtime pay", overtimePay);

            }

            double taxes = (weeklySalary + overtimePay) * .1;

            result += String.format("\nTotal Gross pay is $%.2f", weeklySalary + overtimePay);
            
            result += String.format("\nEstimated 10%% tax: $%.2f", taxes);
            result += String.format("\nTake home pay is $%.2f", (weeklySalary + overtimePay) - taxes);

            label.setText(result);
        } catch (NumberFormatException ex) {
            label.setText(ex.toString());
        }
    }

}
