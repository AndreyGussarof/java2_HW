package homework4.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {


    @FXML
    public Button Enter;
    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;


    public void onActionButtonEnter(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.setText("");
    }

    public void onActionTextField(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.setText("");
    }
}