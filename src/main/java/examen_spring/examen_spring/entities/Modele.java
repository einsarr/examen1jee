package examen_spring.examen_spring.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Modele {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String libelle;
    @ManyToOne
    @JoinColumn(name = "idmarque")
    private Marque marque;
    @OneToMany(mappedBy = "modele")
    private List<Vehicule> vehicules;

    public Modele() {
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Modele(Long id, String libelle, Marque marque, List<Vehicule> vehicules) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.vehicules = vehicules;
    }

    public Modele(Long id, String libelle, List<Vehicule> vehicules) {
        this.id = id;
        this.libelle = libelle;
        this.vehicules = vehicules;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }

    public Modele(Long id, String libelle) {
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
