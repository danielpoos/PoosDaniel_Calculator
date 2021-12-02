package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;

public class Controller {
    @FXML private Spinner<Double> numberone;
    @FXML private Spinner<Double> numbertwo;
    @FXML private Label answer;
    @FXML public void plus() {
        if (numberone.getValue()==null || numbertwo.getValue()==null) answer.setText("You have to give two numbers.");
        else{
            answer.setText(String.valueOf(numberone.getValue()+numbertwo.getValue()));
        }
    }
    @FXML public void minus() {
        if (numberone.getValue()==null || numbertwo.getValue()==null) answer.setText("You have to give two numbers.");
        else{
            answer.setText(String.valueOf(numberone.getValue()-numbertwo.getValue()));
        }
    }
    @FXML public void multiply() {
        if (numberone.getValue()==null || numbertwo.getValue()==null) answer.setText("You have to give two numbers.");
        else{
            answer.setText(String.valueOf(numberone.getValue()*numbertwo.getValue()));
        }
    }
    @FXML public void divide() {
        if (numberone.getValue()==null || numbertwo.getValue()==null) answer.setText("You have to give two numbers.");
        else{
            if (numbertwo.getValue()==0) answer.setText("Nem oszthatsz nullával");
            else answer.setText(String.valueOf(numberone.getValue()/numbertwo.getValue()));
        }
    }
    @FXML public void mod() {
        if (numberone.getValue()==null || numbertwo.getValue()==null) answer.setText("You have to give two numbers.");
        else{
            if (numbertwo.getValue()==0) answer.setText("Nem oszthatsz nullával");
            else answer.setText(String.valueOf(numberone.getValue()%numbertwo.getValue()));
        }
    }
}
