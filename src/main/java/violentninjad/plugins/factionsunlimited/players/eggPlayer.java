package violentninjad.plugins.factionsunlimited.players;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class eggPlayer {
	public static final ItemStack egg = new ItemStack(Material.EGG);
	public static final ItemMeta eggMeta = egg.getItemMeta();
	@SuppressWarnings("deprecation")
	public eggPlayer() {
		Bukkit.getPlayer("eggperson");
	}

}
