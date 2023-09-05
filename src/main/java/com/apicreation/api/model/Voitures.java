package com.apicreation.api.model;

import jakarta.persistence.*;

//@Data //librairie lombok, pas besoin dajouter des getters et setters
@Entity //indique que la classe correspond à une table de la bdd
//@Table(name="Voitures")
public class Voitures {

    @Id //cle primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pour l'autoincrementation
    private int id;
    private String marque;
    private String modele;
    private String couleur;

    public Voitures() {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
    }
    public Voitures(int id, String marque, String modele, String couleur) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return this.modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }


    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }


    public String toString() {
        String convertedToStr = this.toString() + "\n";
        convertedToStr += "Id: " + this.getId() + "\n";
        convertedToStr += "Marque: " + this.getMarque() + "\n";
        convertedToStr += "Modele: " + this.getModele();
        convertedToStr += "Couleur: " + this.getCouleur();
        return convertedToStr;
    }
}
