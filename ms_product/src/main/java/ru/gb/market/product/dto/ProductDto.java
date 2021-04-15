package ru.gb.market.product.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.gb.market.product.model.Product;

@Data
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private String title;
    private double price;

    public ProductDto(Product p) {
        this.id = p.getId();
        this.title = p.getTitle();
        this.price = p.getPrice();
    }
}
