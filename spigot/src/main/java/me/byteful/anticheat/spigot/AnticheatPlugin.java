package me.byteful.anticheat.spigot;

import org.bukkit.plugin.java.JavaPlugin;

public class AnticheatPlugin extends JavaPlugin {
  private final SpigotPlatform platform = new SpigotPlatform();

  @Override
  public void onEnable() {
    platform.load();
  }

  @Override
  public void onDisable() {
    platform.unload();
  }
}
