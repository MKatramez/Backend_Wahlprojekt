package de.hsrm.Muzik.controller;

import de.hsrm.Muzik.baseClass.Event;
import de.hsrm.Muzik.dto.EventRequest;
import de.hsrm.Muzik.repository.EventRepository;
import de.hsrm.Muzik.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventRepository eventRepository;


    @PostMapping("")
    public Event placeEvent(@RequestBody EventRequest request){
        return eventRepository.save(request.getEvent());
    }

    @GetMapping("")
    public List<Event> findAllEvent(){
        return eventRepository.findAll();
    }


}
