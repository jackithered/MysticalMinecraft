package com.kittyboy.mysticalminecraft.items;

import com.kittyboy.mysticalminecraft.MysticalMinecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(MysticalMinecraft.TAB));
    }
}
