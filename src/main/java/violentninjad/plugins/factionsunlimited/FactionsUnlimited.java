package violentninjad.plugins.factionsunlimited;

import java.util.List;
import java.util.Set;

import net.minecraft.server.v1_7_R4.Block;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import violentninjad.plugins.factionsunlimited.players.eggPlayer;

public class FactionsUnlimited extends JavaPlugin implements Listener {
    public void onDisable() {
        // TODO: Place any custom disable code here.
    }

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        System.out.println("Factions Unlimited!");
        
        final FileConfiguration config = this.getConfig();
        
    	this.getCommand("").setExecutor(new UnlimitedCommandExecutor(this));


    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("Welcome, " + event.getPlayer().getDisplayName() + "!");
    }
    
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e)
    {
    	ItemStack diamond = new ItemStack(Material.DIAMOND, 1);
    	if (e.getEntity() instanceof Player) {
            e.getDrops().add(diamond);
    	}
    }

  
}

