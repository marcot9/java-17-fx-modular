package com.example.graphics;

import com.example.calculator.Calculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class GraphicController {
    GraphicController graph = new GraphicController();



    @FXML
    public TextField firstNumber;
    @FXML
    public TextField secondNumber;
    @FXML
    public Button compute;
    @FXML
    public Button subButton;
    @FXML
    public Button multiButton;
    @FXML
    public Button divButton;


    @FXML
    public void handleComputeButton(ActionEvent actionEvent) {
    }
}




