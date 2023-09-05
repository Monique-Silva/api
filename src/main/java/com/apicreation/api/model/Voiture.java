//cette classe est une entité, cela signifie que la classe représente la table, elle doit avoir l'annotation @Entity (elle contien les objets métiers)

package com.apicreation.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;

@Data //librairie lombok, pas besoin dajouter des getters et setters
@Entity //indique que la classe correspond à une table de la bdd
@Table(name="Voitures")
public class Voiture {

@Id //cle primaire
@GeneratedValue(strategy = GenerationType.IDENTITY) //pour l'autoincrementation
private Long id;

@Column(name="marque")
    private String marque;

@Column(name="modele")
    private String modele;

@Column(name="couleur")
    private String couleur;

}
