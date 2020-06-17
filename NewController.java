import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class NewController {
  @FXML private TextField user;
  @FXML private TextField password;
  @FXML private Button loginButton;

  boolean flag = false;

    @FXML
    public void setConnection(ActionEvent event) {

      String pass = password.getText().toString();
      int hash = pass.hashCode();
      User usr = new User(user.getText().toString(), String.valueOf(hash));
        try {
          System.out.println("I M CLICKED HARD");
          Client cl = new Client("localhost", 8080, true, usr);
          flag = true;
        } catch (NumberFormatException e) {
          System.out.println("Usage: java Client hostname port#");
          System.out.println("Second argument was not a port number");
          return;
        }

    }

    }
