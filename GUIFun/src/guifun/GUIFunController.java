/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guifun;

import java.net.URL;
import java.util.ArrayList;
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
    private Room[][] map;
    private ArrayList<ArrayList<Room>> mapArrayList;

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
    @FXML
    private Button northButton;
    @FXML
    private Button southButton;
    @FXML
    private Button westButton;
    @FXML
    private Button eastButton;

    private int currentRow;
    private int currentColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        currentRow = 0;
        currentColumn = 0;

        selectedDrink = new Drink("Coffee", 2.5);
        checkoutButton.setDisable(true);

        map = new Room[10][10];
        mapArrayList = new ArrayList<>();

        for (int rowIndex = 0; rowIndex < 10; rowIndex++) {
            // adds an empty row
            mapArrayList.add(new ArrayList<>());

            // add ten columns to the new row
            for (int columnIndex = 0; columnIndex < 10; columnIndex++) {
                mapArrayList.get(rowIndex).add(new Room());
            }
        }

        // for arrays
        for (int rowIndex = 0; rowIndex < map.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < map[rowIndex].length; columnIndex++) {
                map[rowIndex][columnIndex] = new Room();
            }
        }
        // one a time
        // row/column
        map[0][0] = new Room();
        map[9][9] = new Room();

        // gets the row, sets the item at the column index
        mapArrayList.get(0).set(0, new Room());
        mapArrayList.get(9).set(9, new Room());

        mapArrayList.get(0).get(0).setNpc(new NPC());
        map[0][0].setNpc(new NPC());

        NPC currentRoomNPC = mapArrayList.get(0).get(0).getNpc();

        // check if the NPC actually exists
        if (currentRoomNPC != null) {
            // do something here with fighting or running
        } else {
            // no npc, other options
        }

        northButton.setVisible(false);
        eastButton.setVisible(false);
        southButton.setVisible(false);
        westButton.setVisible(false);
        enableNavigationButtons();
    }

    private void enableNavigationButtons() {

        northButton.setDisable(!(currentRow - 1 >= 0
                && !map[currentRow - 1][currentColumn].isBlocked()));
        northButton.setDisable(!(currentRow - 1 >= 0
                && !mapArrayList.get(currentRow - 1).get(currentColumn).isBlocked()));

        southButton.setDisable(!(currentRow + 1 < map.length
                && !map[currentRow + 1][currentColumn].isBlocked()));
        
        eastButton.setDisable(!(currentColumn+1 < map[currentRow].length
                && !map[currentRow][currentColumn+1].isBlocked()));

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
        northButton.setVisible(true);
        eastButton.setVisible(true);
        southButton.setVisible(true);
        westButton.setVisible(true);
    }

}
