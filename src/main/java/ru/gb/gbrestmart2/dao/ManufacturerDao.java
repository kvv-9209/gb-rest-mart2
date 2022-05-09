package ru.gb.gbrestmart2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.gbrestmart2.entity.Manufacturer;

import java.util.Optional;

public interface ManufacturerDao extends JpaRepository<Manufacturer, Long> {
    Manufacturer findByNameLike(String name);
    Optional<Manufacturer> findByName(String name);
}
