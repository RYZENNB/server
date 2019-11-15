package com.qf.j1906.service;

import com.qf.j1906.pojo.TbItem;

import java.util.List;

/**
 * Created by jeffrey on 2019/11/11.
 */
public interface ItemService {
   public TbItem findItemById(int id);
   public List<TbItem> findAll();
}
