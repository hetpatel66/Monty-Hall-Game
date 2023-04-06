module com.example.montyhall {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.montyhall to javafx.fxml;
    exports com.example.montyhall;
}