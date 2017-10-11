import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Rectangle extends Application {
	@Override
	public void start(Stage primaryStage) {
		TextInputDialog textInputDialog = new TextInputDialog("DON'T FORGET THE SPACE");
		textInputDialog.setHeaderText("Enter the height and width");
		Optional<String> result = textInputDialog.showAndWait();
		String [] side = result.get().split(" ");
		double width = Double.parseDouble(side [0]);
		double height = Double.parseDouble(side [1]);
		double perimeter = (width * 2) + (height * 2);
		double area = width * height;
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setContentText("The perimeter of your rectangle is " + perimeter + " and the area of your rectangle is " + area);
		alert.showAndWait();

	}
}


