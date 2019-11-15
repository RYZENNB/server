package com.qf.j1906.controller;

import com.qf.j1906.pojo.TbItem;
import com.qf.j1906.service.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jeffrey on 2019/11/11.
 */
@RestController
public class controller {
    Logger logger = LoggerFactory.getLogger(controller.class);
    @Autowired

    private ItemService itemService;
    @RequestMapping(value="/item")
    public TbItem  findById(@RequestParam("id") int id){
        TbItem item = itemService.findItemById(id);
        return item;
    }
    @RequestMapping(value="/item",method= RequestMethod.POST)
    public TbItem  addItem(TbItem item){
        logger.info("==============="+item.getTitle());
        item.setId(1111L);
        return item;
    }
}
