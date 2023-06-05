package spegoman.halfhearteat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import spegoman.halfhearteat.handlers.OnItemConsume;

public final class HalfHeartEat extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Hello World");
        new OnItemConsume(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Shutting down");
    }
}
