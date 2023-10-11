module sierra.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    opens sierra.colorchooser to javafx.fxml;
    exports sierra.colorchooser;
}
