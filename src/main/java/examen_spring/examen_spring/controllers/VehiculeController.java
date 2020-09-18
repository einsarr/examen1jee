package examen_spring.examen_spring.controllers;

import examen_spring.examen_spring.dao.LocationRepository;
import examen_spring.examen_spring.dao.ModeleRepository;
import examen_spring.examen_spring.dao.VehiculeRepository;
import examen_spring.examen_spring.entities.Location;
import examen_spring.examen_spring.entities.Modele;
import examen_spring.examen_spring.entities.Vehicule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class VehiculeController {

    @Autowired
    private VehiculeRepository vehiculeRepository;
    @Autowired
    private ModeleRepository modeleRepository;
    @RequestMapping("/vehicules")
    public String index(Model model)
    {
        Modele modele = new Modele();
        model.addAttribute("modele",modele);
        model.addAttribute("modeles", modeleRepository.findAll());
        return "vehicules";
    }
    @RequestMapping("/rechercheVehicule")
    public String recherche(Model model, Long idmodele) throws ParseException {

        try{
            model.addAttribute("modeles", modeleRepository.findAll());
            List<Vehicule> v = vehiculeRepository.rechercherVehiculeByModele(idmodele);
            model.addAttribute("listeVehicules",v);
        }catch (Exception e)
        {
            model.addAttribute("exception",e);
        }
        return "vehicules";
    }
}
