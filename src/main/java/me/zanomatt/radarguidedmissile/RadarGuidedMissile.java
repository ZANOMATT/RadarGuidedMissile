package me.zanomatt.radarguidedmissile;

import org.bukkit.plugin.java.JavaPlugin;

public final class RadarGuidedMissile extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("The Radar Guided Missile has started.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("The Radar Guided Missile has stopped.");
    }
}
