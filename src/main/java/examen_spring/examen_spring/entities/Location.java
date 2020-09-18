package examen_spring.examen_spring.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date datelocation;
    @Column(length = 255)
    private String descriptif;
    private int nbjour;
    @ManyToOne
    @JoinColumn(name = "idvehicule")
    private Vehicule vehicule;
    @ManyToOne
    @JoinColumn(name = "idclient")
    private Client client;

    public Location(Long id, Date datelocation, String descriptif, int nbjour, Vehicule vehicule, Client client) {
        this.id = id;
        this.datelocation = datelocation;
        this.descriptif = descriptif;
        this.nbjour = nbjour;
        this.vehicule = vehicule;
        this.client = client;
    }

    public Location() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDatelocation() {
        return datelocation;
    }

    public void setDatelocation(Date datelocation) {
        this.datelocation = datelocation;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String descriptif) {
        this.descriptif = descriptif;
    }

    public int getNbjour() {
        return nbjour;
    }

    public void setNbjour(int nbjour) {
        this.nbjour = nbjour;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
