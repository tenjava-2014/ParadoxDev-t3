package com.tenjava.entries.ParadoxDev.t3;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class TenJava extends JavaPlugin {

    public static Plugin plugin;

    @Override
    public void onEnable() {
        enable();
        System.out.println("[TenJava] ParadoxDev-t3 plugin enabled. ");
    }

    @Override
    public void onDisable() {
        System.out.println("[TenJava] ParadoxDev-t3 plugin disabled.");
    }

    private void enable() {
        plugin = this;
    }

}
