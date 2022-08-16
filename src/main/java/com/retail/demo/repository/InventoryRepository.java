package com.retail.demo.repository;

import com.retail.demo.dto.Inventory;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class InventoryRepository {

    private List<Inventory> inventoryList;

    public InventoryRepository() {

        this.inventoryList.add(new Inventory("Prod1", "Shirt", "EACH", 10.0, new Date(2022, 8, 20), null));
        this.inventoryList.add(new Inventory("Prod1", "Shirt", "EACH", 20.0, new Date(2022, 8, 17), null));
        this.inventoryList.add(new Inventory("Prod1", "Shirt", "EACH", 20.0, new Date(2022, 8, 28), null));
    }

    public List<Inventory> getByProductId(String prodId) {
        return this.inventoryList;
    }
}
