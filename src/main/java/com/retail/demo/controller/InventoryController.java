package com.retail.demo.controller;

import com.retail.demo.Service.InventoryService;
import com.retail.demo.dto.Inventory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.messaging.handler.annotation.MessageMapping;

@RestController
@Slf4j
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @MessageMapping("getInvPicture")
    public Inventory getInvPicture(Inventory inventoryReq) throws Exception {
        return inventoryService.get(inventoryReq);
    }
}
