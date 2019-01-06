package com.hand.hap.inventory.mapper;

import com.hand.hap.inventory.dto.InventoryItems;
import com.hand.hap.mybatis.common.Mapper;

import java.util.List;

public interface InventoryItemsMapper extends Mapper<InventoryItems> {
    List<InventoryItems> selectIdName(InventoryItems inventoryItems);
    List<InventoryItems> selectIdNameUOM(InventoryItems inventoryItems);
}