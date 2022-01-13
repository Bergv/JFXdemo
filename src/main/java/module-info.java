module com.zb.jfxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.zb.jfxdemo to javafx.fxml;
    exports com.zb.jfxdemo;
}