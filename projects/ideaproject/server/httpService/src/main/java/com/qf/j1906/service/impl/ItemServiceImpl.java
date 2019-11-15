package com.qf.j1906.service.impl;

import com.qf.j1906.mapper.TbItemMapper;
import com.qf.j1906.pojo.TbItem;
import com.qf.j1906.service.ItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jeffrey on 2019/11/11.
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Resource
    private TbItemMapper itemMapper;
    @Override
    public TbItem findItemById(int id) {
        TbItem tbItem = itemMapper.selectByPrimaryKey((long) id);
        return tbItem;
    }

    @Override
    public List<TbItem> findAll() {
        return null;
    }
}
