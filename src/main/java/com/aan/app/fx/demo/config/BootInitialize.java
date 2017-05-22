package com.aan.app.fx.demo.config;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by lainc aancakepbro on 5/21/2017.
 */
public interface BootInitialize extends Initializable, ApplicationContextAware {

    public void initContruct();
    public void stage(Stage primariStage);
    public Node initView();

}
