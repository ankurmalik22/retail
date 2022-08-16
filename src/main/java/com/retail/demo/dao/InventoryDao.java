package com.retail.demo.dao;

import com.retail.demo.dto.Inventory;
import com.retail.demo.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InventoryDao {

    @Autowired
    InventoryRepository inventoryRepository;

    public List<Inventory> getInventoryByProduct(String prodId) {

        return inventoryRepository.getByProductId(prodId);
    }
}
