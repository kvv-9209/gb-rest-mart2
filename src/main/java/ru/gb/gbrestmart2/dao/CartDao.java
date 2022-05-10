package ru.gb.gbrestmart2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.gbrestmart2.entity.Product;

import java.util.List;
import java.util.Optional;

public interface CartDao extends JpaRepository<Product, Long> {

}
