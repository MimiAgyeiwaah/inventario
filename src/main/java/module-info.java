 module com.example.netmart {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires mysql.connector.java;
    requires java.desktop;
    requires com.google.gson;


    opens com.example.netmart to javafx.fxml;
    exports com.example.netmart;
    exports com.example.netmart.controller;
    exports com.example.netmart.controller.Admin;
    exports com.example.netmart.controller.Client;
    exports com.example.netmart.model;
    exports com.example.netmart.view;
    opens com.example.netmart.controller to javafx.fxml;
}