package com.aan.app.fx.demo;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication extends Application{

	private static String[] argument;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Task<Object> task = new Task<Object>() {
			@Override
			protected Object call() throws Exception {
				SpringApplication.run(DemoApplication.class, argument);
				return null;
			}
		};
		task.setOnSucceeded(event -> {
			primaryStage.show();
		});

		task.run();
	}

	public static void main(String[] args) {
		DemoApplication.argument = args;
		launch(args);
	}
}
