package me.athlaeos.valhallammo.hooks;

import org.bukkit.Bukkit;

import me.athlaeos.valhallammo.ValhallaMMO;

public abstract class PluginHook {
    private final boolean isPresent;
    private final String plugin;

    public PluginHook(String name){
        this.isPresent = Bukkit.getPluginManager().getPlugin(name) != null;
        this.plugin = name;
    }

    public boolean isPresent(){
        return isPresent;
    }

    public abstract void whenPresent();

    public String getPlugin() {
        return plugin;
    }
}
