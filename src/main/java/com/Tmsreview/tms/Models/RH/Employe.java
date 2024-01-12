package com.Tmsreview.tms.Models.RH;



import javax.persistence.*;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "employe")
public class Employe {

    @Id
    @Column(name = "idEmployee")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idEmployee ;

    @Column(name = "typeIdentite")
    String typeIdentite;

    @Column(name = "numIdentite",unique = true)
    String numIdentite;

    @Column(name = "datePieceIdentite")
    Date datePieceIdentite;

    @Column(name = "nationalite")
    String nationalite;

    @Column(name = "nom")
    String nom;

    @Column(name = "prenom")
    String prenom;

    @Column(name = "tel")
    String tel;

    @Column(name = "adress")
    String adress;

    @Column(name = "dateNaissance")
    Date dateNaissance;

    @Column(name = "image")
    String image;

    @Column(name = "ville")
    String ville;

    @Column(name = "banque")
    String banque;

    @Column(name = "permis")
    String permis;

    @Column(name = "categoriePermis")
    String categoriePermis;

    @Column(name = "dateExpirationPermis")
    Date dateExpirationPermis;

    @Column(name = "situationFamiliale")
    String situationFamiliale ;

    @Column(name = "enfantCharge")
    int enfantCharge;

    @Column(name = "cnss")
    String cnss;

    @Column(name = "numImmatriculationSociale")
     String numImmatriculationSociale ;


    @Column(name = "description ")
     String description  ;

    @Column(name = "rib")
     String rib;

    @Column(name = "posteEmploye")
    String posteEmploye;


    public Employe (){}

    public Employe(String typeIdentite, String numIdentite, Date datePieceIdentite, String nationalite, String nom, String prenom, String tel, String adress, Date dateNaissance,String image, String ville, String banque, String permis, String categoriePermis, Date dateExpirationPermis, String situationFamiliale, int enfantCharge, String cnss, String numImmatriculationSociale,  String description, String rib, String posteEmploye) {
        this.typeIdentite = typeIdentite;
        this.numIdentite = numIdentite;

        Calendar cal = Calendar.getInstance();
        cal.setTime(datePieceIdentite);
        cal.add(Calendar.DATE, 1);
        this.datePieceIdentite = cal.getTime();

        this.nationalite = nationalite;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.adress = adress;

        cal.setTime(dateNaissance);
        cal.add(Calendar.DATE, 1);
        this.dateNaissance = cal.getTime();


        this.ville = ville;
        this.banque = banque;
        this.permis = permis;
        this.categoriePermis = categoriePermis;

        cal.setTime(dateExpirationPermis);
        cal.add(Calendar.DATE, 1);
        this.dateExpirationPermis =  cal.getTime();

        this.situationFamiliale = situationFamiliale;
        this.enfantCharge = enfantCharge;
        this.cnss = cnss;
        this.numImmatriculationSociale = numImmatriculationSociale;

        this.description = description;
        this.rib = rib;
        this.posteEmploye = posteEmploye;
    }




    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getTypeIdentite() {
        return typeIdentite;
    }

    public void setTypeIdentite(String typeIdentite) {
        this.typeIdentite = typeIdentite;
    }

    public String getNumIdentite() {
        return numIdentite;
    }

    public void setNumIdentite(String numIdentite) {
        this.numIdentite = numIdentite;
    }

    public Date getDatePieceIdentite() {
        return datePieceIdentite;
    }

    public void setDatePieceIdentite(Date datePieceIdentite) {
        this.datePieceIdentite = datePieceIdentite;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getBanque() {
        return banque;
    }

    public void setBanque(String banque) {
        this.banque = banque;
    }

    public String getPermis() {
        return permis;
    }

    public void setPermis(String permis) {
        this.permis = permis;
    }

    public String getCategoriePermis() {
        return categoriePermis;
    }

    public void setCategoriePermis(String categoriePermis) {
        this.categoriePermis = categoriePermis;
    }

    public Date getDateExpirationPermis() {
        return dateExpirationPermis;
    }

    public void setDateExpirationPermis(Date dateExpirationPermis) {
        this.dateExpirationPermis = dateExpirationPermis;
    }

    public String getSituationFamiliale() {
        return situationFamiliale;
    }

    public void setSituationFamiliale(String situationFamiliale) {
        this.situationFamiliale = situationFamiliale;
    }

    public int getEnfantCharge() {
        return enfantCharge;
    }

    public void setEnfantCharge(int enfantCharge) {
        this.enfantCharge = enfantCharge;
    }

    public String getCnss() {
        return cnss;
    }

    public void setCnss(String cnss) {
        this.cnss = cnss;
    }

    public String getNumImmatriculationSociale() {
        return numImmatriculationSociale;
    }

    public void setNumImmatriculationSociale(String numImmatriculationSociale) {
        this.numImmatriculationSociale = numImmatriculationSociale;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRib() {
        return rib;
    }

    public void setRib(String rib) {
        this.rib = rib;
    }

    public String getPosteEmploye() {
        return posteEmploye;
    }

    public void setPosteEmploye(String posteEmploye) {
        this.posteEmploye = posteEmploye;
    }




}
