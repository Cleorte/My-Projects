import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MainProcess {

    @FXML
    public Label history;
    public Label result;
    public float number1 = 0;
    public float number2 = 0;
    private boolean start = true;
    private String operator = "";
    private Calculation model = new Calculation();
    public Button c;
    public Label writer;

    @FXML // to preload the history file
    public void initialize() throws Exception {
        FileReader reader = new FileReader("history.txt");
        String text = new String(Files.readAllBytes(Paths.get("history.txt")));
        history.setText(text);
        reader.close();

    }

    // writing the output in a file
    public void writer() throws Exception {

        FileWriter writer = new FileWriter("history.txt", true);
        writer.write(Float.toString(number1));
        writer.write(operator);
        writer.write(Float.toString(number2));
        writer.write("=");
        writer.write(result.getText() + "\n");
        writer.close();

        // show in history
        FileReader reader = new FileReader("history.txt");
        String text = new String(Files.readAllBytes(Paths.get("history.txt")));
        history.setText(text);
        reader.close();

    }

    //
    @FXML
    public void processNumbers(ActionEvent event) throws Exception {

        if (start) {
            result.setText("");
            start = false;
        }

        String value = ((Button) event.getSource()).getText();
        result.setText(result.getText() + value);

    }

    // function of the clear button
    @FXML
    void cpressed(ActionEvent event) {
        result.setText("0");
    }

    public void processOperators(ActionEvent event) throws Exception {

        String value = ((Button) event.getSource()).getText();

        if (!value.equals("=")) {

            if (!operator.isEmpty())

                switch (value) {

                    case "C":
                        result.setText("");
                        this.number1 = 0;
                        this.number2 = 0;
                        break;

                }

            operator = value;
            number1 = Long.parseLong(result.getText());
            result.setText("");
            return;

            // equals was hit
        } else {

            if (operator.isEmpty())
                return;
            number2 = Long.parseLong(result.getText());
            float output = model.calculate(number1, number2, operator);
            result.setText(String.valueOf(output));

            // save in file
            writer();

        }

    }

}
