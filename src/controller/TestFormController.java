package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class TestFormController {

    public TextField txtSomething;
    public Button btnOk;
    public Label lblBanner;
    public Button btnHide;
    public Button btnShow;
    public AnchorPane root;

    public void initialize(){
        txtSomething.setDisable(true);
        btnOk.setDisable(true);

        btnHide.setVisible(false);
        btnShow.setVisible(false);
    }

    public void btnHelloJavaFXOnAction(ActionEvent actionEvent) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Sample Alert");
        alert.showAndWait();
        
        System.out.println("Hello Kamal");

        txtSomething.setDisable(false);
        btnOk.setDisable(false);

        txtSomething.requestFocus();
    }

    public void btnOkOnAction(ActionEvent actionEvent) {
        commonOnAction();
    }

    public void txtSomethingOnAction(ActionEvent actionEvent) {
        commonOnAction();
    }

    public void commonOnAction(){
        String text = txtSomething.getText();

        lblBanner.setText(text);

        txtSomething.clear();

        txtSomething.requestFocus();

        btnHide.setVisible(true);
    }

    public void btnHideOnAction(ActionEvent actionEvent) {
        lblBanner.setVisible(false);
        btnHide.setVisible(false);
        btnShow.setVisible(true);
    }

    public void btnShowOnAction(ActionEvent actionEvent) {
        lblBanner.setVisible(true);
        btnHide.setVisible(true);
        btnShow.setVisible(false);
    }

    public void btnLogOutOnAction(ActionEvent actionEvent) throws IOException {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Do you want to log out..?",ButtonType.YES,ButtonType.NO);

        Optional<ButtonType> buttonType = alert.showAndWait();

        if(buttonType.get().equals(ButtonType.YES)){
            Parent parent = FXMLLoader.load(this.getClass().getResource("../view/DashBoardForm.fxml"));

            Scene scene = new Scene(parent);

            Stage stage = (Stage) root.getScene().getWindow();

            stage.setScene(scene);
            stage.setTitle("Dash Board");
            stage.centerOnScreen();
        }

    }
}
