package com.etiya.rentACar.dataAccess.abstracts;

import com.etiya.rentACar.entities.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ColorDao extends JpaRepository<Color,Integer> {
        List<Color> getByNameIgnoreCase(String name);
}
