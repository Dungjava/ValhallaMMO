package me.athlaeos.valhallammo.listeners;

import me.athlaeos.valhallammo.ValhallaMMO;
import me.athlaeos.valhallammo.playerstats.profiles.ProfileRegistry;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldSaveEvent;

public class WorldSaveListener implements Listener {
    @EventHandler
    public void onWorldSave(WorldSaveEvent e){
        if (e.getWorld().getName().equals(Bukkit.getWorlds().get(0).getName())) {
            Bukkit.getScheduler().runTaskAsynchronously(ValhallaMMO.getInstance(), ProfileRegistry::saveAll);
        }
    }
}
