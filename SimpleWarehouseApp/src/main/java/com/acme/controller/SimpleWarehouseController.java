package com.acme.controller;

import com.acme.model.SimpleWarehouse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;


@RestController
public class SimpleWarehouseController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());



    @RequestMapping(value = "/warehouses/{warehouseId}", method = RequestMethod.GET)
    public com.acme.model.SimpleWarehouse getSimpleWarehouse(@PathVariable("warehouseId") int warehouseId){


        //Log request and detail and method invoked
        logger.info("In method getSimpleWarehouse");
        logger.info("Request asking for warehouseId: " + warehouseId);


        //Use service / JPA to get Warehouse using key
        logger.info("Retrieving data from datastore");

        //Mock of response
        logger.info("Returning Spring Boot response");

        com.acme.model.SimpleWarehouse simpleWarehouse = new com.acme.model.SimpleWarehouse();
        simpleWarehouse.setLocation("Fall River, MA");
        simpleWarehouse.setQuantity(22);
        simpleWarehouse.setSku("XXX-S995-001291");
        simpleWarehouse.setWarehouseId(10001);

        return simpleWarehouse;
    }

    @RequestMapping(value = "/warehouses", method = RequestMethod.POST)
    public void postSimpleWarehosue(@RequestBody SimpleWarehouse input){

        //Log request and detail and method invoked
        logger.info("In method postSimpleWarehouse");
        logger.info("Request creating inventory for warehouseId: " + input.getWarehouseId());




    }


}
