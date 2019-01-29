package com.jalvarez.spring.dependencycheck;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;

public class Prescription {

    private int id;
    private String patientName;
    private List<String> medicines;

    //<editor-fold desc="getter & setter">
    public int getId() {
        return id;
    }

    @Required
    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public List<String> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<String> medicines) {
        this.medicines = medicines;
    }

    @Override
    public String toString() {
        return "\n" + "Patience : " + patientName + "\n" + "# Medicines : " + medicines.size();
    }

    //</editor-fold>

}
