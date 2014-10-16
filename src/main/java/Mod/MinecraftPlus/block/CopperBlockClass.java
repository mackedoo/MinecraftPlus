package Mod.MinecraftPlus.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Mod.MinecraftPlus.MainClass;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CopperBlockClass extends Block {

	public CopperBlockClass(Material arg0) {
		super(arg0);
		setCreativeTab(MainClass.MinecraftPlusTab);
		setHardness(5F);
		setResistance(7.0F);
		setBlockTextureName(MainClass.MODID + ":copper_block");
		
	}
	
		}
