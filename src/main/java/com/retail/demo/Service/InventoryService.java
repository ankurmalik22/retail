package com.retail.demo.Service;

import com.retail.demo.dao.InventoryDao;
import com.retail.demo.dto.Inventory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.stream.Collectors;

@Service
@Slf4j
public class InventoryService {

    @Autowired
    private InventoryDao inventoryDao;

    public Inventory get(Inventory inv) {
        Date reqDate = inv.getReqDate();
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, 10);
        if (reqDate.before(new Date()) || reqDate.after(c.getTime())) {

            throw new RuntimeException();
        }
        //will filter any record which is above 10 days than req date
        // and then sum the avail qty and return
        return inventoryDao.getInventoryByProduct(inv.getProductId()).stream().filter(inventory ->
                inventory.getAvailDate().before(inv.getReqDate())).collect(Collectors.toList());
    }
}
