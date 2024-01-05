package com.Tmsreview.tms.Models.TMS;


import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "commande")
public class Commande {

    @Id
    @Column(name = "idCommande")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idCommande;

    @Column(name = "dateCommande")
    Date dateCommande;

    @Column(name="quantiteProduit")
    int quantiteProduit;

    @Column(name="prixUHT")
    float prixUHT;

    @Column(name="prixUTTC")
    float prixUTTC;

    @Column(name="prixProduitTotalHT")
    float prixProduitTotalHT;

    @Column(name="totaleCommande")
    float totaleCommande;

    @Column(name="statuCommande")
    String statuCommande;

    @Column(name="adresseLivraison")
    String adresseLivraison ;

    @Column(name="modePayement")
    String modePayement;

    @Column(name="remise")
    float remise;

    @Column(name="fraisLivraison")
    float fraisLivraison;

    @Column(name="dateLivraison")
    Date  dateLivraison;

    @Column(name="methodeExpedition")
    String methodeExpedition;

    @Column(name="dateCreation")
    Date dateCreation;

    public Commande(){}

    public Commande(Date dateCommande, int quantiteProduit, float prixUHT, float prixUTTC, float prixProduitTotalHT, float totaleCommande, String statuCommande, String adresseLivraison, String modePayement, float remise, float fraisLivraison, Date dateLivraison, String methodeExpedition, Date dateCreation) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(dateCommande);
        cal.add(Calendar.DATE, 1);
        this.dateCommande = cal.getTime();


        this.quantiteProduit = quantiteProduit;
        this.prixUHT = prixUHT;
        this.prixUTTC = prixUTTC;
        this.prixProduitTotalHT = prixProduitTotalHT;
        this.totaleCommande = totaleCommande;
        this.statuCommande = statuCommande;
        this.adresseLivraison = adresseLivraison;
        this.modePayement = modePayement;
        this.remise = remise;
        this.fraisLivraison = fraisLivraison;

        cal.setTime(dateLivraison);
        cal.add(Calendar.DATE, 1);
        this.dateLivraison = cal.getTime();

        this.methodeExpedition = methodeExpedition;

        cal.setTime(dateCreation);
        cal.add(Calendar.DATE, 1);
        this.dateCreation = cal.getTime();
    }

    public Long getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Long idCommande) {
        this.idCommande = idCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public int getQuantiteProduit() {
        return quantiteProduit;
    }

    public void setQuantiteProduit(int quantiteProduit) {
        this.quantiteProduit = quantiteProduit;
    }

    public float getPrixUHT() {
        return prixUHT;
    }

    public void setPrixUHT(float prixUHT) {
        this.prixUHT = prixUHT;
    }

    public float getPrixUTTC() {
        return prixUTTC;
    }

    public void setPrixUTTC(float prixUTTC) {
        this.prixUTTC = prixUTTC;
    }

    public float getPrixProduitTotalHT() {
        return prixProduitTotalHT;
    }

    public void setPrixProduitTotalHT(float prixProduitTotalHT) {
        this.prixProduitTotalHT = prixProduitTotalHT;
    }

    public float getTotaleCommande() {
        return totaleCommande;
    }

    public void setTotaleCommande(float totaleCommande) {
        this.totaleCommande = totaleCommande;
    }

    public String getStatuCommande() {
        return statuCommande;
    }

    public void setStatuCommande(String statuCommande) {
        this.statuCommande = statuCommande;
    }

    public String getAdresseLivraison() {
        return adresseLivraison;
    }

    public void setAdresseLivraison(String adresseLivraison) {
        this.adresseLivraison = adresseLivraison;
    }

    public String getModePayement() {
        return modePayement;
    }

    public void setModePayement(String modePayement) {
        this.modePayement = modePayement;
    }

    public float getRemise() {
        return remise;
    }

    public void setRemise(float remise) {
        this.remise = remise;
    }

    public float getFraisLivraison() {
        return fraisLivraison;
    }

    public void setFraisLivraison(float fraisLivraison) {
        this.fraisLivraison = fraisLivraison;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public String getMethodeExpedition() {
        return methodeExpedition;
    }

    public void setMethodeExpedition(String methodeExpedition) {
        this.methodeExpedition = methodeExpedition;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
