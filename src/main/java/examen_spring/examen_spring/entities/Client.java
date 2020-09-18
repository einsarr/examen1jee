package examen_spring.examen_spring.entities;

import javax.persistence.*;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 16)
    private String numeropiece;
    @Column(length = 25)
    private String nom;
    @Column(length = 35)
    private String prenom;
    @Column(length = 9)
    private String tel;
    @Column(length = 25)
    private String adresse;

    public Client(Long id, String numeropiece, String nom, String prenom, String tel, String adresse) {
        this.id = id;
        this.numeropiece = numeropiece;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.adresse = adresse;
    }

    public Client(String numeropiece, String nom, String prenom, String tel, String adresse) {
        this.numeropiece = numeropiece;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.adresse = adresse;
    }

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeropiece() {
        return numeropiece;
    }

    public void setNumeropiece(String numeropiece) {
        this.numeropiece = numeropiece;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
