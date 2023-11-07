package Controller;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ponyoConfirmController {

    @FXML
    private Button paybtn;

    @FXML
    private Label selectedTimeLabel; //remove when error occurs

    @FXML
    private Label selectedSeatLabel;

    @FXML
    private String selectedSeat;

    @FXML
    private String selectedTime;


    public void setSelectedSeatLabel(String text) {
        selectedSeatLabel.setText(text);
        selectedSeatLabel.setVisible(true); // Make the label visible when a seat is selected
    }

    public void setSelectedTimeLabel(String text) {
        selectedTimeLabel.setText(text);
        selectedTimeLabel.setVisible(true);
    }

    public String getSelectedSeat() {
        return selectedSeat;
    }
    
    public String getSelectedTime() {
        return selectedTime;
    }

@FXML
private void payBtn(ActionEvent event) {
    try {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/FXML/ponyopay.fxml"));
        Parent root = loader.load();

       
        Scene scene = new Scene(root);
        Stage stage = (Stage) paybtn.getScene().getWindow();
        stage.setScene(scene);
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    
}

    
  
