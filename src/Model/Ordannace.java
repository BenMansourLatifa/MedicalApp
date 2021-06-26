package Model;

public class Ordannace {
    private int id;
    private int consultationid;

    public Ordannace(int id, int consultationid) {
        this.id = id;
        this.consultationid = consultationid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConsultationid() {
        return consultationid;
    }

    public void setConsultationid(int consultationid) {
        this.consultationid = consultationid;
    }
}
