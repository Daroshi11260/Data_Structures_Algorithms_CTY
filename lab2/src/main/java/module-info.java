module edu.ncssm.briansea.pset3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.cty.brainsea.lab2.pset3 to javafx.fxml;
    exports com.cty.brainsea.lab2.pset3;
}