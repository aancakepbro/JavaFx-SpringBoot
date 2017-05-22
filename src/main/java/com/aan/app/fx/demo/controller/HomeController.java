package com.aan.app.fx.demo.controller;

import com.aan.app.fx.demo.config.BootInitialize;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.stage.Stage;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by lainc aancakepbro on 5/21/2017.
 */

@Component
public class HomeController implements BootInitialize {

    @Autowired
    private ApplicationContext springContext;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @Override
    public void initContruct() {

    }

    @Override
    public void stage(Stage primariStage) {

    }

    @Override
    public Node initView() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/Home.fxml"));
            loader.setController(springContext.getBean(this.getClass()));
            return loader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.springContext = applicationContext;
    }

    @FXML
    void OnActionShowBuku(ActionEvent event) {

    }

    @FXML
    void OnActionShowAnggota(ActionEvent event) {

    }

    @FXML
    void OnActionShowTransaksi(ActionEvent event) {

    }

    @FXML
    void OnActionCLose (ActionEvent event) {
        Platform.exit();
    }
}
