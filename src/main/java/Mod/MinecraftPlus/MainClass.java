package Mod.MinecraftPlus;



import Mod.MinecraftPlus.CreativeTabs.MinecraftPlusTab;
import Mod.MinecraftPlus.block.CopperBlockClass;
import Mod.MinecraftPlus.item.CopperAxeClass;
import Mod.MinecraftPlus.item.CopperHoeClass;
import Mod.MinecraftPlus.item.CopperIngotClass;
import Mod.MinecraftPlus.item.CopperPickaxeClass;
import Mod.MinecraftPlus.item.CopperShovelClass;
import Mod.MinecraftPlus.item.CopperSwordClass;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = MainClass.MODID, name = MainClass.NAME, version = MainClass.VERSION)
public class MainClass {
	 @SidedProxy(clientSide = "Mod.MinecraftPlus.ClientProxy", serverSide = "Mod.MinecraftPlus.CommonProxy")
	 public static CommonProxy proxy;
	
	 //Mod Info Stuff
	public static final String MODID = "MinecraftPlus"; //main use other than mod registration is for textures
	public static final String NAME = "MinecraftPlus"; 
	public static final String VERSION = "v1.0";
	
	//Creative Tabs
	public static CreativeTabs MinecraftPlusTab = new MinecraftPlusTab(CreativeTabs.getNextID(), "MinecraftPlusTab");
	
	//Materials
	 public static ToolMaterial Copper = EnumHelper.addToolMaterial("Copper", 2, 175, 7.0F, 2.0F, 14); 
	
	//Blocks
	public static Block CopperBlock = new CopperBlockClass(Material.iron).setBlockName("CopperBlock");

	//Items
	public static Item CopperIngot = new CopperIngotClass().setUnlocalizedName("CopperIngot");
	
	//Tools
	public static Item CopperAxe = new CopperAxeClass(Copper).setUnlocalizedName("CopperAxe");
	public static Item CopperHoe  = new CopperHoeClass(Copper).setUnlocalizedName("CopperHoe");
	public static Item CopperPickaxe = new CopperPickaxeClass(Copper).setUnlocalizedName("CopperPickaxe");
	public static Item CopperShovel = new CopperShovelClass(Copper).setUnlocalizedName("CopperShovel");
	public static Item CopperSword  = new CopperSwordClass(Copper).setUnlocalizedName("CopperSword");
	
	public MainClass() {
		GameRegistry.registerBlock(CopperBlock, "CopperBlock");
		GameRegistry.registerItem(CopperIngot, "CopperIngot");
		
		GameRegistry.registerItem(CopperAxe, "CopperAxe");
		GameRegistry.registerItem(CopperHoe, "CopperHoe");
		GameRegistry.registerItem(CopperPickaxe, "CopperPickaxe");
		GameRegistry.registerItem(CopperShovel, "CopperShovel");
		GameRegistry.registerItem(CopperSword, "CopperSword");
		
		//Recipes
		GameRegistry.addRecipe(new ItemStack(CopperAxe, 1), new Object[] {"CC ","CS "," S ",'C', CopperIngot, 'S', Item.itemRegistry.getObject("stick")});
		GameRegistry.addRecipe(new ItemStack(CopperHoe, 1), new Object[] {"CC "," S "," S ",'C', CopperIngot, 'S', Item.itemRegistry.getObject("stick")});
		GameRegistry.addRecipe(new ItemStack(CopperPickaxe, 1), new Object[] {"CCC"," S "," S ",'C', CopperIngot, 'S', Item.itemRegistry.getObject("stick")});
		GameRegistry.addRecipe(new ItemStack(CopperShovel, 1), new Object[] {" C "," S "," S ",'C', CopperIngot, 'S', Item.itemRegistry.getObject("stick")});
		GameRegistry.addRecipe(new ItemStack(CopperSword, 1), new Object[] {" C "," C "," S ",'C', CopperIngot, 'S', Item.itemRegistry.getObject("stick")});
		GameRegistry.addRecipe(new ItemStack(CopperBlock, 1), new Object[] {"CCC","CCC","CCC",'C', CopperIngot});
		
		//Shapeless Recipes
	 GameRegistry.addShapelessRecipe(new ItemStack(CopperIngot, 9), new Object[] {CopperBlock});
	 
}
	 }
	
