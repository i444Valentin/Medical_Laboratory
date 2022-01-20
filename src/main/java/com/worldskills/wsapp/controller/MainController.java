package com.worldskills.wsapp.controller;

import com.worldskills.wsapp.entity.Users;
import com.worldskills.wsapp.service.UserService;
import com.worldskills.wsapp.service.UsersService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainController {

    private final UserService userService;
    private final UsersService usersService;

    public MainController(UserService userService, UsersService usersService) {
        this.userService = userService;
        this.usersService = usersService;
    }

    @FXML
    private TextField loginTxtFld;

    @FXML
    private TextField TxtFld;

    @FXML
    void buttonClickLogin(ActionEvent event) {
        Users users =  usersService.getUsersByLoginAndPassword(loginTxtFld.getText(),TxtFld.getText());
        if (users != null){
            AlertMessage.showAlert(Alert.AlertType.INFORMATION,"Вы успешно вошли","Вход выполнен","");
            SceneLoader.load("/view/laborant_searcher_window.fxml",false,false,"",false);
            TxtFld.getScene().getWindow().hide();
        }
    }
}
