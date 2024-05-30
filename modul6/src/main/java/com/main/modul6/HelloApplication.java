package com.main.modul6;

import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        stage.setTitle("Form Login");

        GridPane posisi = new GridPane();
        posisi.setAlignment(Pos.CENTER);
        posisi.setHgap(10);
        posisi.setVgap(10);
        posisi.setPadding(new Insets(25, 25, 25, 25));

        Label userName = new Label("User Name :");
        posisi.add(userName, 0, 0);
        TextField username = new TextField();
        posisi.add(username,1,0);

        Label password = new Label("Password : ");
        posisi.add(password, 0, 1);
        TextField Password = new TextField();
        posisi.add(Password,1,1);

        Label hasil = new Label();
        posisi.add(hasil,1,4);
        Button tombol1 = new Button("Sign in");
        tombol1.setOnAction(event -> {
            String user = username.getText();
            String pass = Password.getText();

            if(!user.equalsIgnoreCase("firman")){
                hasil.setText("ID tidak ditemukan");
            }else if(!pass.equalsIgnoreCase("firman123")){
                hasil.setText("Password Salah, harap coba lagi");
            }else{
                showNewPage(stage,user);
            }
        });

        posisi.add(tombol1,1,2);
        Scene scene = new Scene(posisi, 320, 240);
        stage.setScene(scene);
        stage.show();
    }
    private void showNewPage(Stage stage,String user) {

       GridPane position = new GridPane();
        position.setAlignment(Pos.CENTER);

        Label welcome = new Label();
        position.add(welcome,0,1);
        welcome.setText("Selamat Datang "+user);

        Button tombol2 = new Button("kembali");
        tombol2.setOnAction(event -> start(stage));
        position.add(tombol2,0,2);
        Scene newScene = new Scene(position, 320, 240);
        stage.setScene(newScene);
    }
    public static void main(String[] args) {
        launch();
    }
}