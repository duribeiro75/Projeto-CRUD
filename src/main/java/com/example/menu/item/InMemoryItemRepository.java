package com.example.menu.item;

import com.example.menu.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InMemoryItemRepository extends CrudRepository<Item, Long>{

}
