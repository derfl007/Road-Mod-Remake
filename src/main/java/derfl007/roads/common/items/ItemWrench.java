package derfl007.roads.common.items;


import derfl007.roads.Roads;
import net.minecraft.item.Item;

public class ItemWrench extends Item {

    public ItemWrench() {
        setUnlocalizedName("item_wrench");
        setRegistryName("item_wrench");
        setCreativeTab(Roads.ROADS_TAB);
    }

//    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4)
//    {
//        list.add("Use this to rotate the top texture of many road blocks");
//    }
}