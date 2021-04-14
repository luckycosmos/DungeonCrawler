import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.List;
import java.util.Random;

public class ChainAttack implements Listener {

    private final DungeonCrawler plugin = DungeonCrawler.getInstance();
    private final Random random = new Random();

    @EventHandler
    public void playerActivateChain(EntityDamageByEntityEvent event) {
        if(event.getDamager().getType() != EntityType.PLAYER) event.setCancelled(true);
        double damage = event.getDamage();
        List<Entity> entities = event.getEntity().getNearbyEntities(5, 4, 5);
        for(Entity entity : entities){
            if(entity instanceof LivingEntity){
                ((LivingEntity) entity).damage(damage / 2, event.getDamager());
            }
        }
    }

    public void register() {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    public void unregister() {
        HandlerList.unregisterAll(this);
    }

}
