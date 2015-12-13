package name.abhijitsarkar.javaee.travel.web;

import name.abhijitsarkar.javaee.travel.domain.Airport;
import name.abhijitsarkar.javaee.travel.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Abhijit Sarkar
 */
@RestController
@RequestMapping(method = GET, path = "/airports")
public class AirportController {
    @Autowired
    private AirportService service;

    @RequestMapping
    public Collection<Airport> findByFaaCodes(@RequestParam List<String> faaCodes) {
        return service.findByFaaCodes(faaCodes);
    }
}
