package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField inputField;
    @FXML
    TextArea chatArea;

    public void clickSendBtn() {
        if (!(inputField.getText().equals(""))) {
            chatArea.appendText(inputField.getText() + "\n");
            inputField.clear();
        }
    }
}