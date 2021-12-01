package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextField numberone;
    @FXML private TextField numbertwo;
    @FXML private Label answer;
    @FXML public void plus() {
        if (numberone.getText().equals("") || numbertwo.getText().equals("")) answer.setText("You have to give two numbers.");
        else{
            answer.setText(String.valueOf(Double.parseDouble(numberone.getText())+Double.parseDouble(numbertwo.getText())));
        }
    }
    @FXML public void minus() {
        if (numberone.getText().equals("") || numbertwo.getText().equals("")) answer.setText("You have to give two numbers.");
        else{
            answer.setText(String.valueOf(Double.parseDouble(numberone.getText())-Double.parseDouble(numbertwo.getText())));
        }
    }
    @FXML public void multiply() {
        if (numberone.getText().equals("") || numbertwo.getText().equals("")) answer.setText("You have to give two numbers.");
        else{
            answer.setText(String.valueOf(Double.parseDouble(numberone.getText())*Double.parseDouble(numbertwo.getText())));
        }
    }
    @FXML public void divide() {
        if (numberone.getText().equals("") || numbertwo.getText().equals("")) answer.setText("You have to give two numbers.");
        else{
            answer.setText(String.valueOf(Double.parseDouble(numberone.getText())/Double.parseDouble(numbertwo.getText())));
        }
    }
    @FXML public void mod() {
        if (numberone.getText().equals("") || numbertwo.getText().equals("")) answer.setText("You have to give two numbers.");
        else{
            answer.setText(String.valueOf(Double.parseDouble(numberone.getText())%Double.parseDouble(numbertwo.getText())));
        }
    }
}
