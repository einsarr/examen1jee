package examen_spring.examen_spring.entities;

import org.springframework.ui.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 6)
    private String matricule;
    @Column(length = 20)
    private String numcartegrise;
    @Column(length = 30)
    private String couleur;
    private float prixlocationjour;
    @ManyToOne
    @JoinColumn(name = "idmodele")
    private Modele modele;
    @OneToMany(mappedBy = "vehicule")
    private List<Location> locations;

    public Vehicule(Long id, String matricule, String numcartegrise, String couleur, float prixlocationjour, Modele modele) {
        this.id = id;
        this.matricule = matricule;
        this.numcartegrise = numcartegrise;
        this.couleur = couleur;
        this.prixlocationjour = prixlocationjour;
        this.modele = modele;
    }

    public Vehicule() {
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public Vehicule(Long id, String matricule, String numcartegrise, String couleur, float prixlocationjour, Modele modele, List<Location> locations) {
        this.id = id;
        this.matricule = matricule;
        this.numcartegrise = numcartegrise;
        this.couleur = couleur;
        this.prixlocationjour = prixlocationjour;
        this.modele = modele;
        this.locations = locations;
    }

    public Vehicule(Long id, String matricule, String numcartegrise, String couleur, float prixlocationjour) {
        this.id = id;
        this.matricule = matricule;
        this.numcartegrise = numcartegrise;
        this.couleur = couleur;
        this.prixlocationjour = prixlocationjour;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNumcartegrise() {
        return numcartegrise;
    }

    public void setNumcartegrise(String numcartegrise) {
        this.numcartegrise = numcartegrise;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public float getPrixlocationjour() {
        return prixlocationjour;
    }

    public void setPrixlocationjour(float prixlocationjour) {
        this.prixlocationjour = prixlocationjour;
    }

    public Modele getModele() {
        return modele;
    }

    public void setModele(Modele modele) {
        this.modele = modele;
    }
}
