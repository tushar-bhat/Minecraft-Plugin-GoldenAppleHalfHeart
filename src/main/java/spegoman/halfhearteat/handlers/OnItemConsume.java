package spegoman.halfhearteat.handlers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import spegoman.halfhearteat.HalfHeartEat;

public class OnItemConsume implements Listener {

    public OnItemConsume(HalfHeartEat plugin){
        Bukkit.getPluginManager().registerEvents(this,plugin);
    }

    @EventHandler
    public void onGoldenAppleEat(PlayerItemConsumeEvent event){
        if (event.getItem().getType() == Material.GOLDEN_APPLE){
            event.getPlayer().setHealth(0.5);
        }
    }
}
