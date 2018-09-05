package ru.job4j.multithereading.threads.pinpong;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class PingPong extends Application {
    private static final String JOB4J = "Пинг-понг www.job4j.ru";

    @Override
    public void start(Stage stage) throws Exception {
        int limitX = 300;   // размер нашего прямоугольнкиа сцены, где будет двигарться
        int limitY = 300;
        Group group = new Group(); // что такое групп,?
        Rectangle rect = new Rectangle(0, 100, 10, 10); // определяет размер, пяямоугольника что двигатеся и откуда стартует
        group.getChildren().add(rect);
        new Thread(new RectangleMove(rect)).start();
        stage.setScene(new Scene(group, limitX, limitY));
        stage.setTitle(JOB4J);
        stage.setResizable(false);
        stage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }  // что это за метод? какой старт запскается
}
