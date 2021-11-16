package de.hsrm.Muzik.controller;

import de.hsrm.Muzik.baseClass.Kalender;
import de.hsrm.Muzik.baseClass.Person;
import de.hsrm.Muzik.repository.KalenderRepository;
import de.hsrm.Muzik.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kalender")
public class KalenderController {

    @Autowired
    private KalenderRepository kalenderRepository;

    @GetMapping("")
    public List<Kalender> all(){
        return kalenderRepository.findAll();
    }

    //return {probe: 1.1.10, auftritt: 1.2.10}
    @GetMapping("Next")
    public String nextKalender(){
        return kalenderRepository.nextProbeUndAuftritt();
    }

}
