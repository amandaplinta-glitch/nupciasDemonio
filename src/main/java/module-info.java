module com.mycompany.nupciasdodemonio {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.nupciasdodemonio to javafx.fxml;
    exports com.mycompany.nupciasdodemonio;
}
