package com.NewProject.Trail.Service;

import com.NewProject.Trail.*;
import com.NewProject.Trail.Dao.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class LocationService {
    @Autowired
    LocationDao locationDao;

    public List<Location> getLocationByJob(String category) {
        return locationDao.findByJob(category);
    }

    public List<Location> getAllLocation() {
        return locationDao.findAll();

    }

    public String addLocation(Location location) {
        locationDao.save(location);
        return "success";
    }
}
