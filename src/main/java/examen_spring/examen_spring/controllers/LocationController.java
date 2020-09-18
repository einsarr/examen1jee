package examen_spring.examen_spring.controllers;

import examen_spring.examen_spring.dao.LocationRepository;
import examen_spring.examen_spring.entities.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;
    @RequestMapping("/locations")
    public String index()
    {
        return "locations";
    }
    @RequestMapping("/rechercheLocation")
    public String recherche(Model model, String datelocation) throws ParseException {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat (pattern);
        Date date = simpleDateFormat.parse(datelocation);
        try{
            List<Location> loc = locationRepository.rechercherLocationByDate(date);
            if (loc.isEmpty())
                model.addAttribute("message","Aucun véhicule loyé à cette date");
            else
            model.addAttribute("listeLocations",loc);
        }catch (Exception e)
        {
            model.addAttribute("exception",e);
            return "redirect:/rechercheLocation?datelocation="+date+"&error="+e.getMessage();
        }
        return "locations";
    }
}
