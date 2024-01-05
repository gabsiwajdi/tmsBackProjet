package com.Tmsreview.tms.Models.TMS;


import javax.persistence.*;

@Entity
@Table(name = "marchendise")
public class Marchendise {

    @Id
    @Column(name = "idMarchendise")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idMarchendise;

    @Column(name = "nomMarchendise")
    String nomMarchendise;

    @Column(name = "adress")
    String adresse;

    @Column(name = "region")
    String region;

    @Column(name = "tel")
    String tel;

    @Column(name = "mail")
    String mail;

    @Column(name = "numPatente")
    String numPatente;

    @Column(name = "secteur")
    String secteur;

    public Marchendise(){}

    public Marchendise(String nomMarchendise, String adresse, String region, String tel, String mail, String numPatente, String secteur) {
        this.nomMarchendise = nomMarchendise;
        this.adresse = adresse;
        this.region = region;
        this.tel = tel;
        this.mail = mail;
        this.numPatente = numPatente;
        this.secteur = secteur;
    }

    public Long getIdMarchendise() {
        return idMarchendise;
    }

    public void setIdMarchendise(Long idMarchendise) {
        this.idMarchendise = idMarchendise;
    }

    public String getNomMarchendise() {
        return nomMarchendise;
    }

    public void setNomMarchendise(String nomMarchendise) {
        this.nomMarchendise = nomMarchendise;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNumPatente() {
        return numPatente;
    }

    public void setNumPatente(String numPatente) {
        this.numPatente = numPatente;
    }

    public String getSecteur() {
        return secteur;
    }

    public void setSecteur(String secteur) {
        this.secteur = secteur;
    }
}
