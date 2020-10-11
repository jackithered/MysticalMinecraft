package com.kittyboy.mysticalminecraft.util;


import com.kittyboy.mysticalminecraft.MysticalMinecraft;
import com.kittyboy.mysticalminecraft.blocks.BlockItemBase;
import com.kittyboy.mysticalminecraft.blocks.RubyBlock;
import com.kittyboy.mysticalminecraft.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create (ForgeRegistries.ITEMS, MysticalMinecraft.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create (ForgeRegistries.BLOCKS, MysticalMinecraft.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    public static final RegistryObject<Item> DEMONHEART = ITEMS.register("demonheart", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block",RubyBlock::new);


    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(RUBY_BLOCK.get()));

}
