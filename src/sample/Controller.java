package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TextField resultWindow;

    public void onPadClick(ActionEvent actionEvent) {
        String currentValue = resultWindow.getText();

        if (actionEvent.getSource().getClass() == Button.class)
        {
            Button button = (Button)actionEvent.getSource();
            String buttonValue = button.getText();

            resultWindow.setText(currentValue+buttonValue);

        }
    }

    public void onActonClick(ActionEvent actionEvent) {
        Button button = null;

        if (actionEvent.getSource().getClass() == Button.class)
        {
            button = (Button)actionEvent.getSource();
            String buttonValue = button.getText();

        }

        switch (button.getText()){
            case "+":
                break;
            case "-":
                break;
            case "*":
                break;
            case "/":
                break;
            case "=":
                break;
            case "C":
                resultWindow.setText("");
                break;
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void onCalculateClick(ActionEvent actionEvent) {
    }
}
