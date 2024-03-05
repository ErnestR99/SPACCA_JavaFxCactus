package src;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class AdminLoginController {

    @FXML
    private void cerrarVentana(ActionEvent event) {
        // Obtener la ventana actual a través del botón
        Stage stage = (Stage) ((javafx.scene.control.Button) event.getSource()).getScene().getWindow();

        // Cerrar la ventana
        stage.close();
    }
}