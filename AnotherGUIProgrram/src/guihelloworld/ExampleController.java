/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guihelloworld;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author EricC
 */
public class ExampleController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField wageTextBox;
    @FXML
    private TextField hoursTextBox;
    
    @FXML
    private Slider deductionSlider;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonClick(ActionEvent event) {
        try {
            double hourlyWage = Double.parseDouble(wageTextBox.getText());
            double hoursWorked = Double.parseDouble(hoursTextBox.getText());
            
           
            double salary = hourlyWage * hoursWorked;
            
            
            double retirementDeduction = deductionSlider.getValue()/100.0 * salary;
            
            double afterTaxSalary = (salary-retirementDeduction) * .9;
            
            String result = String.format("Your weekly gross pay is: $%.2f", salary);
            result += "\nBut don't forget to pay your taxes, estimated at 10%";
            result += String.format("\nTake home pay: $%.2f", 
                    afterTaxSalary);
            result += String.format("\nWith saving $%.2f for retirement", 
                    retirementDeduction);
            result += String.format("\nTake home pay + retirment savings $ %.2f", 
                    afterTaxSalary + retirementDeduction );
            label.setText(result);
            
        }
        catch ( NumberFormatException ex){
            label.setText(ex.toString());
        }
        
    }
    
}
