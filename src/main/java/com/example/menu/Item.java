package com.example.menu;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.validator.constraints.URL;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Getter

public class Item {
    @Id
    private final Long id;
    @NotNull(message="name is required")
    @Pattern(regexp="^[a-zA-Z ]+$", message = "name must be a string")
    private final String name;
    @NotNull(message = "price is required")
    @Positive(message = "price must be positive")
    private final Long price;
    @NotNull(message = "description is required")
    @Pattern(regexp="^[a-zA-Z ]+$", message = "description must be a string")
    private final String description;

    @NotNull(message = "image is required")
    @URL(message = "image must be a URL")
    private final String image;

    public Item atualizarItem(Item item){
        return new Item(
                this.id,
                item.name,
                item.price,
                item.description,
                item.image
        );
    }

}
