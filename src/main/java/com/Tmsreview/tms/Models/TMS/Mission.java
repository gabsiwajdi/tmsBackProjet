package com.Tmsreview.tms.Models.TMS;


import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "mission")
public class Mission {

    @Id
    @Column(name = "idMission")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idMission;

    @Column(name = "dateDepart")
    Date dateDepart;

    @Column(name = "dateArriver")
    Date dateArriver;

    @Column(name = "pointDepart")
    String pointDepart;

    @Column(name = "pointArriver")
    String pointArriver;

    @Column(name = "distance")
    float distance;

    @Column(name = "etatMission")
    String etatMission;

    @Column(name = "coutsAssocie")
    float coutsAssocie;

    @Column(name = "poids")
    float poids;

    @Column(name = "description")
    String description;

    public Mission(){}

    public Mission(Date dateDepart, Date dateArriver, String pointDepart, String pointArriver, float distance, String etatMission, float coutsAssocie, float poids, String description) {

        Calendar cal = Calendar.getInstance();
        cal.setTime(dateDepart);
        cal.add(Calendar.DATE, 1);
        this.dateDepart = cal.getTime();

        cal.setTime(dateArriver);
        cal.add(Calendar.DATE, 1);
        this.dateArriver =  cal.getTime();


        this.pointDepart = pointDepart;
        this.pointArriver = pointArriver;
        this.distance = distance;
        this.etatMission = etatMission;
        this.coutsAssocie = coutsAssocie;
        this.poids = poids;
        this.description = description;
    }

    public Long getIdMission() {
        return idMission;
    }

    public void setIdMission(Long idMission) {
        this.idMission = idMission;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateArriver() {
        return dateArriver;
    }

    public void setDateArriver(Date dateArriver) {
        this.dateArriver = dateArriver;
    }

    public String getPointDepart() {
        return pointDepart;
    }

    public void setPointDepart(String pointDepart) {
        this.pointDepart = pointDepart;
    }

    public String getPointArriver() {
        return pointArriver;
    }

    public void setPointArriver(String pointArriver) {
        this.pointArriver = pointArriver;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public String getEtatMission() {
        return etatMission;
    }

    public void setEtatMission(String etatMission) {
        this.etatMission = etatMission;
    }

    public float getCoutsAssocie() {
        return coutsAssocie;
    }

    public void setCoutsAssocie(float coutsAssocie) {
        this.coutsAssocie = coutsAssocie;
    }

    public float getPoids() {
        return poids;
    }

    public void setPoids(float poids) {
        this.poids = poids;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
