package com.worldskills.wsapp.controller;

public class AlertMessage {
    public static void showAlert(javafx.scene.control.Alert.AlertType alertType, String headerText, String title, String contentText){
        javafx.scene.control.Alert alert = new javafx.scene.control.Alert(alertType);
        alert.setHeaderText(headerText);
        alert.setTitle(title);
        alert.setContentText(contentText);
        alert.showAndWait();
    }
}
