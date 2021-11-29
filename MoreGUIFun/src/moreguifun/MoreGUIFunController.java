/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moreguifun;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author EricC
 */
public class MoreGUIFunController implements Initializable {

    @FXML
    private Button button;
    @FXML
    private Label label;
    @FXML
    private RadioButton creamerSoy;
    @FXML
    private ToggleGroup creamer;
    @FXML
    private RadioButton creamerWhole;
    @FXML
    private RadioButton creamer2Percent;
    @FXML
    private RadioButton creamerAlmond;
    @FXML
    private RadioButton creamerOat;
    @FXML
    private RadioButton creamerBlack;
    @FXML
    private RadioButton drinkBrewedCoffee;
    @FXML
    private ToggleGroup drink;
    @FXML
    private RadioButton drinkEspresso;
    @FXML
    private RadioButton drinkDecaf;
    @FXML
    private RadioButton drinkTea;
    @FXML
    private ChoiceBox<String> sugarSelect;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] options = { "no sugar", "1 sugar", "2 sugar" };
        sugarSelect.setItems(
                FXCollections.observableArrayList(options));
        sugarSelect.getSelectionModel().selectFirst();
        sugarSelect.setOnAction(event -> showReceipt());
    }

    @FXML
    private void buttonClick(ActionEvent event) {
        showReceipt();
    }

    private void showReceipt(){
        String receipt = "";
        double totalCost = 0;
        if (drinkBrewedCoffee.isSelected()) {
            totalCost += .1;
            receipt += "Brewed Coffee: $.10";
        } else if (drinkEspresso.isSelected()) {
            totalCost += .5;
            receipt += "Espresso: $.50";
        } else if (drinkDecaf.isSelected()) {
            totalCost += .1;
            receipt += "Decaf Coffee: $.10";
        } else if (drinkTea.isSelected()) {
            totalCost += 10;
            receipt += "Tea: $10";
        }
        
        if ( creamer2Percent.isSelected()){
            receipt += "\n  with 2% milk";
        } else if ( creamerWhole.isSelected()){
            receipt += "\n  with whole milk";
        }else if ( creamerSoy.isSelected()){
            receipt += "\n  with soy milk (+$.50)";
            totalCost += .5;
        }else if ( creamerOat.isSelected()){
            receipt += "\n  with oat milk (+$.50)";
            totalCost += .5;
        }else if ( creamerAlmond.isSelected()){
            receipt += "\n  with almond milk (+$.50)";
            totalCost += .5;
        }
        
        if ( sugarSelect.getSelectionModel().isSelected(1)){
            receipt += "\n with 1 sugar";
        } else if (sugarSelect.getSelectionModel().isSelected(2)){
            receipt += "\n with 2 sugar";
        }
        
        double salesTax = .06 * totalCost;
        receipt += String.format("\nSales Tax: $%.2f", salesTax);
        receipt += String.format("\nTotal: $%.2f", (salesTax + totalCost));
        
        label.setText(receipt);
    }

    
}
