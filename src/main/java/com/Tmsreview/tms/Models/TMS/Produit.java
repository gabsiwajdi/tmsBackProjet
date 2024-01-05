package com.Tmsreview.tms.Models.TMS;


import javax.persistence.*;

@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @Column(name = "idProduit")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idProduit;

    @Column
    String nomProduit;

    @Column
    String categorie;

    @Column
    String unite;

    @Column
    float valeur_Unite;

    @Column
    String codeProduit;

    @Column
    float prixProduit;

    @Column
    int stockActuelle;

    @Column
    int stockMin;

    @Column
    String statut;

    @Column
    String description;

    public Produit(){}

    public Produit(String nomProduit, String categorie, String unite, float valeur_Unite, String codeProduit, float prixProduit, int stockActuelle, int stockMin, String statut, String description) {
        this.nomProduit = nomProduit;
        this.categorie = categorie;
        this.unite = unite;
        this.valeur_Unite = valeur_Unite;
        this.codeProduit = codeProduit;
        this.prixProduit = prixProduit;
        this.stockActuelle = stockActuelle;
        this.stockMin = stockMin;
        this.statut = statut;
        this.description = description;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    public float getValeur_Unite() {
        return valeur_Unite;
    }

    public void setValeur_Unite(float valeur_Unite) {
        this.valeur_Unite = valeur_Unite;
    }

    public String getCodeProduit() {
        return codeProduit;
    }

    public void setCodeProduit(String codeProduit) {
        this.codeProduit = codeProduit;
    }

    public float getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(float prixProduit) {
        this.prixProduit = prixProduit;
    }

    public int getStockActuelle() {
        return stockActuelle;
    }

    public void setStockActuelle(int stockActuelle) {
        this.stockActuelle = stockActuelle;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
