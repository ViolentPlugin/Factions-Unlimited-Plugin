package violentninjad.plugins.factionsunlimited;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class FactionsUnlimited extends JavaPlugin implements Listener {
    public void onDisable() {
        // TODO: Place any custom disable code here.
    }

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        System.out.println("Factions Unlimited!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("Welcome, " + event.getPlayer().getDisplayName() + "!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player player = (Player) sender;
        if (cmd.getName().equalsIgnoreCase("pvparena"))
        {
            String pvparena = "warp pvparena " + player.getName();
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), pvparena);
            player.sendMessage(ChatColor.YELLOW + "Successfully teleported to the arena!");
        }

        return false;

    }
}

