/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guifun;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author EricC
 */
public class GUIFunController implements Initializable {

    private Drink selectedDrink;

    @FXML
    private RadioButton drinkCoffee;
    @FXML
    private ToggleGroup drink;
    @FXML
    private RadioButton drinkEspresso;
    @FXML
    private RadioButton drinkTea;
    @FXML
    private RadioButton milkWhole;
    @FXML
    private ToggleGroup milk;
    @FXML
    private RadioButton milkSoy;
    @FXML
    private RadioButton milkAlmond;
    @FXML
    private RadioButton milkOat;
    @FXML
    private RadioButton milkBlack;
    @FXML
    private Label receiptLabel;

    @FXML
    private Button checkoutButton;
    @FXML
    private TextArea textArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        selectedDrink = new Drink("Coffee", 2.5);
        checkoutButton.setDisable(true);
    }

    @FXML
    private void updateItem(ActionEvent event) {
        updateLable();

        checkoutButton.setDisable(false);
    }

    private void updateLable() {
        if (drinkCoffee.isSelected()) {
            selectedDrink.setName("Coffee");
            selectedDrink.setCost(2.5);
        } else if (drinkEspresso.isSelected()) {
            selectedDrink.setName("Espresso");
            selectedDrink.setCost(2.99);
        } else if (drinkTea.isSelected()) {
            selectedDrink.setName("Tea");
            selectedDrink.setCost(1.99);
        }

        if (milkAlmond.isSelected()) {
            selectedDrink.setMilk("Almond Milk + $.50");
            selectedDrink.addCost(.5);
        } else if (milkOat.isSelected()) {
            selectedDrink.setMilk("Oat Milk + $.50");
            selectedDrink.addCost(.5);
        } else if (milkSoy.isSelected()) {
            selectedDrink.setMilk("Soy Milk + $.50");
            selectedDrink.addCost(.5);
        } else if (milkWhole.isSelected()) {
            selectedDrink.setMilk("Whole Milk");
        } else if (milkBlack.isSelected()) {
            selectedDrink.setMilk("");
        }

        receiptLabel.setText(selectedDrink.getReceipt());
    }

    @FXML
    private void checkout(ActionEvent event) {
        textArea.appendText(selectedDrink.getReceipt());
        textArea.appendText("\n");
    }

}
