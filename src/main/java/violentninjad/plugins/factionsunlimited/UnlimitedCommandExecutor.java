package violentninjad.plugins.factionsunlimited;

import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;

public class UnlimitedCommandExecutor implements CommandExecutor {


	public UnlimitedCommandExecutor(FactionsUnlimited plugin) {
		// TODO Auto-generated constructor stub
	}


	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		Player player = (Player) sender;
		PlayerInventory inventory = player.getInventory();
	    if (cmd.getName().equalsIgnoreCase("pvparena"))
	    {
	        String pvparena = "warp pvparena " + player.getName();
	        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), pvparena);
	        player.sendMessage(ChatColor.YELLOW + "Successfully teleported to the arena!");
	    }
	    
	    if (cmd.getName().equalsIgnoreCase("factionspawn "))
	    {
	    	String factionspawn = "warp factionarea " + player.getName();
	    	Bukkit.dispatchCommand(Bukkit.getConsoleSender(), factionspawn);
	    	player.sendMessage(ChatColor.GOLD + "Successfully teleported to the faction spawn!");
	    }
	    
	    if (cmd.getName().equalsIgnoreCase("factionarea"))
	    {
	    	String factionspawn = "warp factionarea " + player.getName();
	    	Bukkit.dispatchCommand(Bukkit.getConsoleSender(), factionspawn);
	    	player.sendMessage(ChatColor.GOLD + "Successfully teleported to the faction spawn!");
	    }
	    
	    if (cmd.getName().equalsIgnoreCase("bannedlist"))
	    {
	    	if (player.hasPermission("factionsunlimited.utils.bannedlist"))
	    	{
	    		Set<OfflinePlayer> bannedPlayerList = Bukkit.getBannedPlayers();
		    	player.sendMessage(ChatColor.AQUA + "These are the evil people: " + bannedPlayerList);
	    	}else{
	    		player.sendMessage(ChatColor.RED + "[Factions Unlimited] You do not have permission to view the banned player list!");
	    	}
	    }
	    String eggpersonId = "6bf8bff542204081b69fb03854891f2c";
		if (cmd.getName().equalsIgnoreCase("boiledeggs"))
		{
			if (Bukkit.getServer().getPlayer(eggpersonId) != null)
	        {
	        	player.sendMessage("Eggperson is not currently online!");
	        }else{
	        	player.giveExp(32);
	        }
		}
		if (cmd.getName().equalsIgnoreCase("unlimitedkits"))
		{
			  if (args[0].equalsIgnoreCase("godmode"))
			  {
				  if (player.hasPermission("unlimitedkits.godmode"))
				  {
					  //Diamond Helmet 
					  ItemStack diamondHelm = new ItemStack(Material.DIAMOND_HELMET, 1);
					  Enchantment Protection = new EnchantmentWrapper(0);
					  Enchantment Unbreaking = new EnchantmentWrapper(34);
					  diamondHelm.addEnchantment(Protection, 5);
					  diamondHelm.addEnchantment(Unbreaking, 5);
					  inventory.addItem(diamondHelm);
					  //Diamond ChestPlate
					  ItemStack diamondChestPlate = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
					  diamondChestPlate.addEnchantment(Protection, 5);
					  diamondChestPlate.addEnchantment(Unbreaking, 5);
					  inventory.addItem(diamondChestPlate);
					  //Diamond Leggings
					  ItemStack diamondLeggings = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
					  diamondLeggings.addEnchantment(Protection, 5);
					  diamondLeggings.addEnchantment(Unbreaking, 5);
					  inventory.addItem(diamondLeggings);
					  //Diamond Boots
					  ItemStack diamondBoots = new ItemStack(Material.DIAMOND_BOOTS, 1);
					  Enchantment FeatherFalling = new EnchantmentWrapper(2);
					  diamondBoots.addEnchantment(FeatherFalling, 5);
					  diamondBoots.addEnchantment(Unbreaking, 5);
					  diamondBoots.addEnchantment(Protection, 5);
					  inventory.addItem(diamondBoots);
					  //Diamond Sword
					  ItemStack diamondSword = new ItemStack(Material.DIAMOND_SWORD, 1);
					  Enchantment Sharpness = new EnchantmentWrapper(16);
					  Enchantment FireAspect = new EnchantmentWrapper(20);
					  diamondSword.addEnchantment(Sharpness, 5);
					  diamondSword.addEnchantment(FireAspect, 2);
					  diamondSword.addEnchantment(Unbreaking, 5);
					  inventory.addItem(diamondSword);
					  //Food
					  ItemStack steakStack = new ItemStack(Material.COOKED_BEEF, 64);
					  inventory.addItem(steakStack);
				  }else{
					  player.sendMessage(ChatColor.RED + "[Factions Unlimited] You do not have permission to get the godmode kit!");
				  }
				  
			  }

		}
			return false;
		}

	}
	
	

