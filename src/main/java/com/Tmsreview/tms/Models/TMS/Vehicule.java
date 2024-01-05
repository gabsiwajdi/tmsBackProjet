package com.Tmsreview.tms.Models.TMS;


import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "Vehicule")
public class Vehicule {

    @Id
    @Column(name = "idVehicule")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVehicule;

    @Column(name = "matricule")
    String matricule;

    @Column(name = "model")
    String model;

    @Column(name = "couleur")
    String couleur;

    @Column(name = "categories")
    String categories;

    @Column(name = "kmactuel")
    Integer kmactuel;

    @Column(name = "marque")
    String marque;

    @Column(name = "carburant")
    String carburant;

    @Column(name = "charge_utile")
    Float charge_utile;

    @Column(name = "longueur")
    Float longueur;

    @Column(name = "largeur")
    Float largeur;

    @Column(name = "hauteur")
    Float hauteur;

    @Column(name = "dateVisite")
    Date datevisite;

    @Column(name = "dateAssurance")
    Date dateassurance;

    @Column(name = "dateTaxe")
    Date datetaxe;

    @Column(name = "capaciteReservoir")
    float capaciteReservoir;

    @Column(name = "reservoir")
    int reservoir;

    @Column(name = "kilometrageProchainVidangeHuileMoteur")
    Long kilometrageProchainVidangeHuileMoteur;

    @Column(name = "kilometrageProchainVidangeLiquideRefroidissement")
    Long kilometrageProchainVidangeLiquideRefroidissement;

    @Column(name = "kilometrageProchainVidangeHuileBoiteVitesse")
    Long kilometrageProchainVidangeHuileBoiteVitesse;

    @Column(name = "kilometrageProchainChangementFiltreClimatiseur")
    Long kilometrageProchainChangementFiltreClimatiseur;

    @Column(name = "kilometrageProchainChangementFiltreCarburant")
    Long kilometrageProchainChangementFiltreCarburant;

    @Column(name = "kilometrageProchainChangementBougies")
    Long kilometrageProchainChangementBougies;

    @Column(name = "kilometrageProchainChangementCourroies")
    Long kilometrageProchainChangementCourroies;

    @Column(name = "kilometrageProchainChangementPneus")
    Long kilometrageProchainChangementPneus;

    @Column(name = "description")
    String description;

    public  Vehicule() {}

    public Vehicule(String matricule, String model, String couleur, String categories, Integer kmactuel, String marque, String carburant, Float charge_utile, Float longueur, Float largeur, Float hauteur, Date datevisite, Date dateassurance, Date datetaxe, float capaciteReservoir, int reservoir, Long kilometrageProchainVidangeHuileMoteur, Long kilometrageProchainVidangeLiquideRefroidissement, Long kilometrageProchainVidangeHuileBoiteVitesse, Long kilometrageProchainChangementFiltreClimatiseur, Long kilometrageProchainChangementFiltreCarburant, Long kilometrageProchainChangementBougies, Long kilometrageProchainChangementCourroies, Long kilometrageProchainChangementPneus, String description) {
        this.matricule = matricule;
        this.model = model;
        this.couleur = couleur;
        this.categories = categories;
        this.kmactuel = kmactuel;
        this.marque = marque;
        this.carburant = carburant;
        this.charge_utile = charge_utile;
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;

        Calendar cal = Calendar.getInstance();
        cal.setTime(datevisite);
        cal.add(Calendar.DATE, 1);
        this.datevisite = cal.getTime();

        cal.setTime(dateassurance);
        cal.add(Calendar.DATE, 1);
        this.dateassurance = cal.getTime();

        cal.setTime(datetaxe);
        cal.add(Calendar.DATE, 1);
        this.datetaxe = cal.getTime();


        this.capaciteReservoir = capaciteReservoir;
        this.reservoir = reservoir;
        this.kilometrageProchainVidangeHuileMoteur = kilometrageProchainVidangeHuileMoteur;
        this.kilometrageProchainVidangeLiquideRefroidissement = kilometrageProchainVidangeLiquideRefroidissement;
        this.kilometrageProchainVidangeHuileBoiteVitesse = kilometrageProchainVidangeHuileBoiteVitesse;
        this.kilometrageProchainChangementFiltreClimatiseur = kilometrageProchainChangementFiltreClimatiseur;
        this.kilometrageProchainChangementFiltreCarburant = kilometrageProchainChangementFiltreCarburant;
        this.kilometrageProchainChangementBougies = kilometrageProchainChangementBougies;
        this.kilometrageProchainChangementCourroies = kilometrageProchainChangementCourroies;
        this.kilometrageProchainChangementPneus = kilometrageProchainChangementPneus;
        this.description = description;
    }

    public Long getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(Long idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Integer getKmactuel() {
        return kmactuel;
    }

    public void setKmactuel(Integer kmactuel) {
        this.kmactuel = kmactuel;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public Float getCharge_utile() {
        return charge_utile;
    }

    public void setCharge_utile(Float charge_utile) {
        this.charge_utile = charge_utile;
    }

    public Float getLongueur() {
        return longueur;
    }

    public void setLongueur(Float longueur) {
        this.longueur = longueur;
    }

    public Float getLargeur() {
        return largeur;
    }

    public void setLargeur(Float largeur) {
        this.largeur = largeur;
    }

    public Float getHauteur() {
        return hauteur;
    }

    public void setHauteur(Float hauteur) {
        this.hauteur = hauteur;
    }

    public Date getDatevisite() {
        return datevisite;
    }

    public void setDatevisite(Date datevisite) {
        this.datevisite = datevisite;
    }

    public Date getDateassurance() {
        return dateassurance;
    }

    public void setDateassurance(Date dateassurance) {
        this.dateassurance = dateassurance;
    }

    public Date getDatetaxe() {
        return datetaxe;
    }

    public void setDatetaxe(Date datetaxe) {
        this.datetaxe = datetaxe;
    }

    public float getCapaciteReservoir() {
        return capaciteReservoir;
    }

    public void setCapaciteReservoir(float capaciteReservoir) {
        this.capaciteReservoir = capaciteReservoir;
    }

    public int getReservoir() {
        return reservoir;
    }

    public void setReservoir(int reservoir) {
        this.reservoir = reservoir;
    }

    public Long getKilometrageProchainVidangeHuileMoteur() {
        return kilometrageProchainVidangeHuileMoteur;
    }

    public void setKilometrageProchainVidangeHuileMoteur(Long kilometrageProchainVidangeHuileMoteur) {
        this.kilometrageProchainVidangeHuileMoteur = kilometrageProchainVidangeHuileMoteur;
    }

    public Long getKilometrageProchainVidangeLiquideRefroidissement() {
        return kilometrageProchainVidangeLiquideRefroidissement;
    }

    public void setKilometrageProchainVidangeLiquideRefroidissement(Long kilometrageProchainVidangeLiquideRefroidissement) {
        this.kilometrageProchainVidangeLiquideRefroidissement = kilometrageProchainVidangeLiquideRefroidissement;
    }

    public Long getKilometrageProchainVidangeHuileBoiteVitesse() {
        return kilometrageProchainVidangeHuileBoiteVitesse;
    }

    public void setKilometrageProchainVidangeHuileBoiteVitesse(Long kilometrageProchainVidangeHuileBoiteVitesse) {
        this.kilometrageProchainVidangeHuileBoiteVitesse = kilometrageProchainVidangeHuileBoiteVitesse;
    }

    public Long getKilometrageProchainChangementFiltreClimatiseur() {
        return kilometrageProchainChangementFiltreClimatiseur;
    }

    public void setKilometrageProchainChangementFiltreClimatiseur(Long kilometrageProchainChangementFiltreClimatiseur) {
        this.kilometrageProchainChangementFiltreClimatiseur = kilometrageProchainChangementFiltreClimatiseur;
    }

    public Long getKilometrageProchainChangementFiltreCarburant() {
        return kilometrageProchainChangementFiltreCarburant;
    }

    public void setKilometrageProchainChangementFiltreCarburant(Long kilometrageProchainChangementFiltreCarburant) {
        this.kilometrageProchainChangementFiltreCarburant = kilometrageProchainChangementFiltreCarburant;
    }

    public Long getKilometrageProchainChangementBougies() {
        return kilometrageProchainChangementBougies;
    }

    public void setKilometrageProchainChangementBougies(Long kilometrageProchainChangementBougies) {
        this.kilometrageProchainChangementBougies = kilometrageProchainChangementBougies;
    }

    public Long getKilometrageProchainChangementCourroies() {
        return kilometrageProchainChangementCourroies;
    }

    public void setKilometrageProchainChangementCourroies(Long kilometrageProchainChangementCourroies) {
        this.kilometrageProchainChangementCourroies = kilometrageProchainChangementCourroies;
    }

    public Long getKilometrageProchainChangementPneus() {
        return kilometrageProchainChangementPneus;
    }

    public void setKilometrageProchainChangementPneus(Long kilometrageProchainChangementPneus) {
        this.kilometrageProchainChangementPneus = kilometrageProchainChangementPneus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
