//import javafx.event.*;
//import javafx.fxml.FXML;
//import javafx.scene.control.*;
//
///** Controls the login screen */
//public class LoginController {
//  @FXML private TextField user;
//  @FXML private TextField password;
//  @FXML private Button loginButton;
//  boolean flag = false;
//
//  public void initialize() {
//
//  }
//
//  public void initManager(final LoginManager loginManager) {
//    loginButton.setOnAction(new EventHandler<ActionEvent>() {
//      @Override public void handle(ActionEvent event) {
//        String sessionID = authorize();
//        if (sessionID != null) {
//          loginManager.authenticated(sessionID);
//        }
//      }
//    });
//  }
//
//
//  /**
//   * Check authorization credentials.
//   *
//   * If accepted, return a sessionID for the authorized session
//   * otherwise, return null.
//   */
//  private String authorize() {
//    return
//      "open".equals(user.getText()) && "sesame".equals(password.getText())
//            ? generateSessionID()
//            : null;
//  }
//
//  private static int sessionID = 0;
//
//  private String generateSessionID() {
//    sessionID++;
//    return "xyzzy - session " + sessionID;
//  }
//
//  @FXML
//    public void setConnection(ActionEvent event) {
//
//    try {
//      System.out.println("I M CLICKED HARD");
//      Client cl = new Client ("localhost", 8080, true);
//      flag = true;
//    }
//
//    catch (NumberFormatException e) {
//      System.out.println ("Usage: java Client hostname port#");
//      System.out.println ("Second argument was not a port number");
//      return;
//    }
//  }
//}

