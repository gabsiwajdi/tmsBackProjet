package com.Tmsreview.tms.Models.TMS;


import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "entretien" )
public class Entretien {

    @Id
    @Column(name = "idEntretien")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idEntretien;

    @Column(name = "date")
    Date date;

    @Column(name = "lieuIntervention")
    String lieuIntervention;

    @Column(name = "respensableEntretien")
    String respensableEntretien;

    @Column(name = "huileMoteur")
    Boolean huileMoteur;

    @Column(name = "liquideRefroidissement")
    Boolean liquideRefroidissement;

    @Column(name = "huileBoiteVitesse")
    Boolean huileBoiteVitesse;

    @Column(name = "filtreHuile")
    Boolean filtreHuile;

    @Column(name = "filtreAir")
    Boolean filtreAir;

    @Column(name = "filtreClimatiseur")
    Boolean filtreClimatiseur;

    @Column(name = "filtreCarburant")
    Boolean filtreCarburant;

    @Column(name = "bougies")
    Boolean bougies;

    @Column(name = "courroies")
    Boolean courroies;

    @Column(name = "pneus")
    Boolean pneus;

    @Column(name = "reparation")
    Boolean reparation;

    @Column(name = "noteReparation")
    String noteReparation;

    @Column(name = "coutEntretien")
    Boolean coutEntretien;

    @Column(name = "typePayement")
    Boolean typePayement;

    public Entretien (){}

    public Entretien(Date date, String lieuIntervention, String respensableEntretien, Boolean huileMoteur, Boolean liquideRefroidissement, Boolean huileBoiteVitesse, Boolean filtreHuile, Boolean filtreAir, Boolean filtreClimatiseur, Boolean filtreCarburant, Boolean bougies, Boolean courroies, Boolean pneus, Boolean reparation, String noteReparation, Boolean coutEntretien, Boolean typePayement) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);
        this.date =  cal.getTime();

        this.lieuIntervention = lieuIntervention;
        this.respensableEntretien = respensableEntretien;
        this.huileMoteur = huileMoteur;
        this.liquideRefroidissement = liquideRefroidissement;
        this.huileBoiteVitesse = huileBoiteVitesse;
        this.filtreHuile = filtreHuile;
        this.filtreAir = filtreAir;
        this.filtreClimatiseur = filtreClimatiseur;
        this.filtreCarburant = filtreCarburant;
        this.bougies = bougies;
        this.courroies = courroies;
        this.pneus = pneus;
        this.reparation = reparation;
        this.noteReparation = noteReparation;
        this.coutEntretien = coutEntretien;
        this.typePayement = typePayement;
    }

    public Long getIdEntretien() {
        return idEntretien;
    }

    public void setIdEntretien(Long idEntretien) {
        this.idEntretien = idEntretien;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLieuIntervention() {
        return lieuIntervention;
    }

    public void setLieuIntervention(String lieuIntervention) {
        this.lieuIntervention = lieuIntervention;
    }

    public String getRespensableEntretien() {
        return respensableEntretien;
    }

    public void setRespensableEntretien(String respensableEntretien) {
        this.respensableEntretien = respensableEntretien;
    }

    public Boolean getHuileMoteur() {
        return huileMoteur;
    }

    public void setHuileMoteur(Boolean huileMoteur) {
        this.huileMoteur = huileMoteur;
    }

    public Boolean getLiquideRefroidissement() {
        return liquideRefroidissement;
    }

    public void setLiquideRefroidissement(Boolean liquideRefroidissement) {
        this.liquideRefroidissement = liquideRefroidissement;
    }

    public Boolean getHuileBoiteVitesse() {
        return huileBoiteVitesse;
    }

    public void setHuileBoiteVitesse(Boolean huileBoiteVitesse) {
        this.huileBoiteVitesse = huileBoiteVitesse;
    }

    public Boolean getFiltreHuile() {
        return filtreHuile;
    }

    public void setFiltreHuile(Boolean filtreHuile) {
        this.filtreHuile = filtreHuile;
    }

    public Boolean getFiltreAir() {
        return filtreAir;
    }

    public void setFiltreAir(Boolean filtreAir) {
        this.filtreAir = filtreAir;
    }

    public Boolean getFiltreClimatiseur() {
        return filtreClimatiseur;
    }

    public void setFiltreClimatiseur(Boolean filtreClimatiseur) {
        this.filtreClimatiseur = filtreClimatiseur;
    }

    public Boolean getFiltreCarburant() {
        return filtreCarburant;
    }

    public void setFiltreCarburant(Boolean filtreCarburant) {
        this.filtreCarburant = filtreCarburant;
    }

    public Boolean getBougies() {
        return bougies;
    }

    public void setBougies(Boolean bougies) {
        this.bougies = bougies;
    }

    public Boolean getCourroies() {
        return courroies;
    }

    public void setCourroies(Boolean courroies) {
        this.courroies = courroies;
    }

    public Boolean getPneus() {
        return pneus;
    }

    public void setPneus(Boolean pneus) {
        this.pneus = pneus;
    }

    public Boolean getReparation() {
        return reparation;
    }

    public void setReparation(Boolean reparation) {
        this.reparation = reparation;
    }

    public String getNoteReparation() {
        return noteReparation;
    }

    public void setNoteReparation(String noteReparation) {
        this.noteReparation = noteReparation;
    }

    public Boolean getCoutEntretien() {
        return coutEntretien;
    }

    public void setCoutEntretien(Boolean coutEntretien) {
        this.coutEntretien = coutEntretien;
    }

    public Boolean getTypePayement() {
        return typePayement;
    }

    public void setTypePayement(Boolean typePayement) {
        this.typePayement = typePayement;
    }
}
