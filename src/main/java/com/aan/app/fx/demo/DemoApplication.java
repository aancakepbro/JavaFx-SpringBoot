package com.aan.app.fx.demo;

import com.aan.app.fx.demo.controller.HomeController;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemoApplication extends Application{

	private static String[] argument;

	private ApplicationContext context =null;

	@Override
	public void start(Stage primaryStage) throws Exception {

		Task<Object> task = new Task<Object>() {
			@Override
			protected Object call() throws Exception {
				context = SpringApplication.run(DemoApplication.class,argument);
				return null;
			}
		};
		task.setOnSucceeded(event -> {
			HomeController homeController = context.getBean(HomeController.class);

			Parent parent = (Parent) homeController.initView();
			Scene scene = new Scene(parent);

			primaryStage.setScene(scene);
			primaryStage.setTitle("Main Aplication");
			primaryStage.show();
		});

		task.setOnFailed(event -> {
			System.exit(0);
			Platform.exit();
		});
		task.run();
	}

	public static void main(String[] args) {
		DemoApplication.argument = args;
		launch(args);
	}
}
