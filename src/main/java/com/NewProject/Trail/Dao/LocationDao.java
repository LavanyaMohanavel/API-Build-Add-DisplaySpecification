package com.NewProject.Trail.Dao;

import com.NewProject.Trail.*;
import jakarta.persistence.criteria.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface LocationDao extends JpaRepository<Location, CriteriaBuilder.In> {
    List<Location> findByJob(String category);
}
