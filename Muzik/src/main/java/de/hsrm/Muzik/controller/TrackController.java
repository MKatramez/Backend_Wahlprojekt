package de.hsrm.Muzik.controller;

import de.hsrm.Muzik.baseClass.Event;
import de.hsrm.Muzik.baseClass.Track;
import de.hsrm.Muzik.dto.EventRequest;
import de.hsrm.Muzik.dto.TrackRequest;
import de.hsrm.Muzik.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("track")
public class TrackController {
    @Autowired
    private TrackRepository trackRepository;

    @PostMapping("")
    public Track placeTrack(@RequestBody TrackRequest request){
        return trackRepository.save(request.getTrack());
    }

    @GetMapping("")
    public List<Track> findAllTrack(){
        return trackRepository.findAll();
    }
}
