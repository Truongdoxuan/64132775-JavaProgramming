module th.doxuantruong.simplemath.th_bai1_basicgui_simplemath {
    requires javafx.controls;
    requires javafx.fxml;


    opens th.doxuantruong.simplemath.th_bai1_basicgui_simplemath to javafx.fxml;
    exports th.doxuantruong.simplemath.th_bai1_basicgui_simplemath;
}