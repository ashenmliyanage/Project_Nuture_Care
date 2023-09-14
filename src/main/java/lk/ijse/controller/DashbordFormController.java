package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TouchEvent;

import java.io.IOException;

public class DashbordFormController extends LoginPageFormController{

    @FXML
    private ProgressBar CofH;

    @FXML
    private ProgressBar CofT;

    @FXML
    private ProgressBar CofW;

        /* = x+0.1;
        b1.setProgress(x);*/
        @FXML
        void b1onActhion(ActionEvent event) {
            CofH.setProgress(0.1);
        }

    @Override
    void btnOkyOnAction(ActionEvent event) throws IOException {
        super.btnOkyOnAction(event);
        CofH.setProgress(0.1);
    }
    //https://www.youtube.com/watch?v=870XIYMrlSo
}
