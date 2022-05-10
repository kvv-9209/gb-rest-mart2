package ru.gb.gbrestmart2.entity;

import lombok.*;
import ru.gb.gbrestmart2.entity.enums.Status;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "CART")
@NamedQueries({
        @NamedQuery(name = "Cart.findById",
                query = "select c from Cart c where c.id = :id")
})
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Product> products;

    public boolean addProduct(Product product) {
        if (products == null) {
            products = new HashSet<>();
        }
        return products.add(product);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                "products=" + products +
                '}';
    }
}
