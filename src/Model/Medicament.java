package Model;

public class Medicament {
    private int id;
    private String nom;
    private int qute;
    private String methode;
    private int ordannaceId;

    public Medicament(int id, String nom, int qute, String methode, int ordannaceId) {
        this.id = id;
        this.nom = nom;
        this.qute = qute;
        this.methode = methode;
        this.ordannaceId = ordannaceId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQute() {
        return qute;
    }

    public void setQute(int qute) {
        this.qute = qute;
    }

    public String getMethode() {
        return methode;
    }

    public void setMethode(String methode) {
        this.methode = methode;
    }

    public int getOrdannaceId() {
        return ordannaceId;
    }

    public void setOrdannaceId(int ordannaceId) {
        this.ordannaceId = ordannaceId;
    }
}
