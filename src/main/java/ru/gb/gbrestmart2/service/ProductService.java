package ru.gb.gbrestmart2.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.gbrestmart2.controller.dto.ProductDto;
import ru.gb.gbrestmart2.controller.dto.ProductManufacturerDto;
import ru.gb.gbrestmart2.controller.dto.mapper.ProductMapper;
import ru.gb.gbrestmart2.dao.ManufacturerDao;
import ru.gb.gbrestmart2.dao.ProductDao;
import ru.gb.gbrestmart2.entity.Product;
import ru.gb.gbrestmart2.entity.enums.Status;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductDao productDao;
    private final ProductMapper productMapper;
    private final ManufacturerDao manufacturerDao;

    @Transactional
    public void init() {
//        Manufacturer testManufacturer = Manufacturer.builder()
//                .name("Test")
//                .products(new HashSet<>(productDao.findAll()))
//                .build();
//
//        manufacturerDao.save(testManufacturer);
        Product product = productDao.findById(3L).get();
        product.setManufacturer(manufacturerDao.findById(2L).get());
        productDao.save(product);
    }

    public ProductDto save(ProductDto productDto) {
        Product product = productMapper.toProduct(productDto, manufacturerDao);
        if (product.getId() != null) {
            productDao.findById(productDto.getId()).ifPresent(
                    (p) -> product.setVersion(p.getVersion())
            );
        }
        return productMapper.toProductDto(productDao.save(product));
    }


    @Transactional(readOnly = true)
    public ProductDto findById(Long id) {
        return productMapper.toProductDto(productDao.findById(id).orElse(null));
    }

    public List<ProductDto> findAll() {
        return productDao.findAll().stream()
                .map(productMapper::toProductDto)
                .collect(Collectors.toList());
    }

    public void deleteById(Long id) {
        try {
            productDao.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            log.error(e.getMessage());
        }
    }

    public void disable(Long id) {
        Optional<Product> product = productDao.findById(id);
        product.ifPresent(p -> {
            p.setStatus(Status.DISABLED);
            productDao.save(p);
        });
    }


    public List<ProductManufacturerDto> findFullInfo() {
        return productDao.findAll()
                .stream()
                .map(productMapper::toProductManufacturerDto)
                .collect(Collectors.toList());
    }
}
