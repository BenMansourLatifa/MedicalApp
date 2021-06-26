package Model;

import java.util.Date;

public class Consultation {
    private int id;
    private Date date;
    private String type;
    private String remarques;
    private int patientId;

    public Consultation(int id, Date date, String type, String remarques, int patientId) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.remarques = remarques;
        this.patientId = patientId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setRemarques(String rmarques) {
        this.remarques = rmarques;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
