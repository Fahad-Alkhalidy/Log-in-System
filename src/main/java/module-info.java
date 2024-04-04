module com.example.loginsystemusingjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginsystemusingjfx to javafx.fxml;
    exports com.example.loginsystemusingjfx;
}