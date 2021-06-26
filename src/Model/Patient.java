package Model;

import java.util.Date;

public class Patient {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private String sexe;
    private String address;
    private int zip;
    private String ville;
    private int cnss;
    private String gpsng;
    private Date datenais;

    public Patient(int id, String nom, String prenom, String email, String sexe, String address, int zip, String ville, int cnss, String gpsng, Date datenais) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.sexe = sexe;
        this.address = address;
        this.zip = zip;
        this.ville = ville;
        this.cnss = cnss;
        this.gpsng = gpsng;
        this.datenais = datenais;
    }
    public Patient(){

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public int getCnss() {
        return cnss;
    }

    public void setCnss(int cnss) {
        this.cnss = cnss;
    }

    public String getGpsng() {
        return gpsng;
    }

    public void setGpsng(String gpsng) {
        this.gpsng = gpsng;
    }

    public Date getDatenais() {
        return datenais;
    }

    public void setDatenais(Date datenais) {
        this.datenais = datenais;
    }
}
