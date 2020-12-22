import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.*;
import java.util.Scanner;

public class Controller {

    /* Back button */
    @FXML
    Button back = new Button();

    @FXML
    void backButton() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Stage stage = (Stage) back.getScene().getWindow();
        stage.setScene(new Scene(root));

        try {
            stage.show();
        } catch (Exception e) {
            stage.close();
        }
    }

    /* Ingredienser og fremgangsmåde */
    @FXML
    Button start = new Button();

    @FXML
    TextArea ingredienser = new TextArea();

    @FXML
    TextArea fremgangsmaade = new TextArea();

    private void addIngredienser(File file) {
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                ingredienser.appendText(input.nextLine() + "\n");
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private void addFremgangsmaade(File file) {
        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                fremgangsmaade.appendText(input.nextLine() + "\n");
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    /* Pandekager */
    @FXML
    Button pandekager = new Button();

    @FXML
    void openPandekager() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("pandekager.fxml"));
        Stage stage = (Stage) pandekager.getScene().getWindow();
        stage.setScene(new Scene(root));

        try {
            stage.show();
        } catch (Exception e) {
            stage.close();
        }
    }

    @FXML
    void Pandekager() {
        File file = new File("Pandekager_ingredients");
        addIngredienser(file);

        File file2 = new File("Pandekager_guide");
        addFremgangsmaade(file2);
    }

    /* Pølsehorn */
    @FXML
    Button polsehorn = new Button();

    @FXML
    void openPolsehorn() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("pølsehorn.fxml"));
        Stage stage = (Stage) polsehorn.getScene().getWindow();
        stage.setScene(new Scene(root));

        try {
            stage.show();
        } catch (Exception e) {
            stage.close();
        }
    }

    @FXML
    void Polsehorn() {
        File file = new File("Pølsehorn_ingredients");
        addIngredienser(file);

        File file2 = new File("Pølsehorn_guide");
        addFremgangsmaade(file2);
    }

    /* Pasta med kødsauce */
    @FXML
    Button pasta = new Button();

    @FXML
    void openPasta() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("pasta.fxml"));
        Stage stage = (Stage) polsehorn.getScene().getWindow();
        stage.setScene(new Scene(root));

        try {
            stage.show();
        } catch (Exception e) {
            stage.close();
        }
    }

    @FXML
    void Pasta() {
        File file = new File("Pasta_ingredients");
        addIngredienser(file);

        File file2 = new File("Pasta_guide");
        addFremgangsmaade(file2);
    }

    /* Lasagne */
    @FXML
    Button lasagne = new Button();

    @FXML
    void openLasagne() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("lasagne.fxml"));
        Stage stage = (Stage) polsehorn.getScene().getWindow();
        stage.setScene(new Scene(root));

        try {
            stage.show();
        } catch (Exception e) {
            stage.close();
        }
    }

    @FXML
    void Lasagne() {
        File file = new File("Lasagne_ingredients");
        addIngredienser(file);

        File file2 = new File("Lasagne_guide");
        addFremgangsmaade(file2);
    }
}
