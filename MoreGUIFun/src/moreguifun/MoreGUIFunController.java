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
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author EricC
 */
public class MoreGUIFunController implements Initializable {

    private Drink selectedDrink;

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
    @FXML
    private TextArea textArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] options = {"no sugar", "1 sugar", "2 sugar"};
        sugarSelect.setItems(
                FXCollections.observableArrayList(options));
        sugarSelect.getSelectionModel().selectFirst();
        sugarSelect.setOnAction(event -> showReceipt());

        selectedDrink = new Drink("coffee", .1);
        showReceipt();
    }

    @FXML
    private void buttonClick(ActionEvent event) {
        showReceipt();
        
    }

    private void showReceipt() {

        if (drinkBrewedCoffee.isSelected()) {
            selectedDrink.setName("coffee");
            selectedDrink.setCost(.1);
        } else if (drinkEspresso.isSelected()) {
            selectedDrink.setName("espresso");
            selectedDrink.setCost(.5);
        } else if (drinkDecaf.isSelected()) {
            selectedDrink.setName("decaf");
            selectedDrink.setCost(.1);
        } else if (drinkTea.isSelected()) {
            selectedDrink.setName("tea");
            selectedDrink.setCost(10);
        }

        if (creamer2Percent.isSelected()) {
            selectedDrink.setMilk("2% milk");
            selectedDrink.setMilkCost(0);
        } else if (creamerWhole.isSelected()) {
            selectedDrink.setMilk("whole milk");
            selectedDrink.setMilkCost(0);
        } else if (creamerSoy.isSelected()) {
            selectedDrink.setMilk("soy milk");
            selectedDrink.setMilkCost(.5);
        } else if (creamerOat.isSelected()) {
            selectedDrink.setMilk("oat milk");
            selectedDrink.setMilkCost(.5);
        } else if (creamerAlmond.isSelected()) {
            selectedDrink.setMilk("almond milk");
            selectedDrink.setMilkCost(.5);
        }

        if (sugarSelect.getSelectionModel().isSelected(1)) {
            selectedDrink.setSugar("1 sugar");
        } else if (sugarSelect.getSelectionModel().isSelected(2)) {
            selectedDrink.setSugar("2 sugar");
        }

        label.setText(selectedDrink.getReceipt());
    }

    @FXML
    private void buyButtonClick(ActionEvent event) {
        textArea.appendText(selectedDrink.getReceipt());
        textArea.appendText("\n");
    }

}
