package Controll;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DisenoCotrollers extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
     
        AnchorPane root = new AnchorPane();
        Label label1 = new Label("Button:");
        Label label2 = new  Label("CheckBox:");
        Label label3 = new Label("Hyperlink:");
        Label label4 = new Label("RadioButton:");
        Label label5 = new Label("Label:");
        Label label6 = new Label("TextField:");
        Label label7 = new Label("PasswordField:");
        Label label8 = new Label("TextArea:");
        Label label9 = new Label("ProgressIndicator:");
        Label label10 = new Label("ProgressBar:");
        Label label11 = new Label("Slider:");
      
        
        Button button = new Button("RadioButton");
        CheckBox checkBox = new CheckBox("CheckBox");
        Hyperlink hyperlink = new Hyperlink("Hyperlink");
        RadioButton radioButton = new RadioButton("RadioButton");
        Label label = new Label("Label");
        TextField textField = new TextField("TextField");
        PasswordField passwordField = new PasswordField();
        TextArea textArea = new TextArea();
        ProgressIndicator progressIndicator = new ProgressIndicator();
        ProgressBar progressBar = new ProgressBar();
        Slider slider = new Slider();
       
        root.getChildren().addAll(label1,label2,label3, label4,label5,label6,label7,label8,label9,label10,label11,button,checkBox,hyperlink,radioButton,label,textField,passwordField,textArea,progressIndicator,progressBar,slider);
        //label
        AnchorPane.setTopAnchor(label1, 30.0);
        AnchorPane.setLeftAnchor(label1, 20.0);
       //button
        AnchorPane.setTopAnchor(button, 30.0);
        AnchorPane.setLeftAnchor(button, 200.0);
       //label2
        AnchorPane.setTopAnchor(label2, 70.0);
        AnchorPane.setLeftAnchor(label2, 20.0);
       //CheckBox
        AnchorPane.setTopAnchor(checkBox, 70.0);
        AnchorPane.setLeftAnchor(checkBox, 200.0);
        //label3
        AnchorPane.setTopAnchor(label3, 110.0);
        AnchorPane.setLeftAnchor(label3, 20.0);
        //Hyperlink
        AnchorPane.setTopAnchor(hyperlink, 110.0);
        AnchorPane.setLeftAnchor(hyperlink, 200.0);
        //label4
        AnchorPane.setTopAnchor(label4, 150.0);
        AnchorPane.setLeftAnchor(label4, 20.0);
        //RadioButton
        AnchorPane.setTopAnchor(radioButton, 150.0);
        AnchorPane.setLeftAnchor(radioButton, 200.0);
        //label5
        AnchorPane.setTopAnchor(label5, 190.0);
        AnchorPane.setLeftAnchor(label5, 20.0);
        //Label
        AnchorPane.setTopAnchor(label, 190.0);
        AnchorPane.setLeftAnchor(label, 200.0);
        //Label6
        AnchorPane.setTopAnchor(label6, 230.0);
        AnchorPane.setLeftAnchor(label6, 20.0);
        //TextField
        AnchorPane.setTopAnchor(textField, 230.0);
        AnchorPane.setLeftAnchor(textField, 200.0);
        //Label7
        AnchorPane.setTopAnchor(label7, 270.0);
        AnchorPane.setLeftAnchor(label7, 20.0);
        //PasswordField
        AnchorPane.setTopAnchor(passwordField, 270.0);
        AnchorPane.setLeftAnchor(passwordField, 200.0);
        //Label8
        AnchorPane.setTopAnchor(label8, 310.0);
        AnchorPane.setLeftAnchor(label8, 20.0);
        //TextArea
        AnchorPane.setTopAnchor(textArea, 310.0);
        AnchorPane.setLeftAnchor(textArea, 200.0);
        textArea.setPrefSize(200, 100); // Ancho de 100 y alto de 50
        //Label9
        AnchorPane.setTopAnchor(label9, 430.0);
        AnchorPane.setLeftAnchor(label9, 20.0);
        //ProgressIndicator
        AnchorPane.setTopAnchor(progressIndicator,430.0);
        AnchorPane.setLeftAnchor(progressIndicator, 200.0);
        //label10
        AnchorPane.setTopAnchor(label10, 490.0);
        AnchorPane.setLeftAnchor(label10, 20.0);
        //ProgressBar
        AnchorPane.setTopAnchor(progressBar,490.0);
        AnchorPane.setLeftAnchor(progressBar, 200.0);
        //label11
        AnchorPane.setTopAnchor(label11, 520.0);
        AnchorPane.setLeftAnchor(label11, 20.0);
        //ProgressBar
        AnchorPane.setTopAnchor(slider,520.0);
        AnchorPane.setLeftAnchor(slider, 200.0);



        Scene scene = new Scene(root, 450, 550);

        primaryStage.setTitle("Diseño de Controll");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
