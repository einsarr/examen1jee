package examen_spring.examen_spring.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Marque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 30)
    private String libelle;
    @OneToMany(mappedBy = "marque")
    private List<Modele> modeles;

    public Marque() {
    }

    public Marque(Long id, String libelle, List<Modele> modeles) {
        this.id = id;
        this.libelle = libelle;
        this.modeles = modeles;
    }

    public List<Modele> getModeles() {
        return modeles;
    }

    public void setModeles(List<Modele> modeles) {
        this.modeles = modeles;
    }

    public Marque(Long id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

}
