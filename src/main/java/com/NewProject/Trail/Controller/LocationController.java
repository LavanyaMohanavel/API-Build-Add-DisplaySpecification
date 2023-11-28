package com.NewProject.Trail.Controller;

import com.NewProject.Trail.*;
import com.NewProject.Trail.Service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("Location")
public class LocationController {
    @Autowired
    LocationService locationService;
@GetMapping("allLocation")

    public List<Location> getAllLocation(){

    return locationService.getAllLocation();
    }
    @GetMapping("job/{job}")
    public List<Location> getLocationByJob(@PathVariable("job") String category){
    return locationService.getLocationByJob(category);

    }
    @PostMapping("add")
    public String addLocation(@RequestBody Location location){
        return locationService.addLocation(location);

    }


}
