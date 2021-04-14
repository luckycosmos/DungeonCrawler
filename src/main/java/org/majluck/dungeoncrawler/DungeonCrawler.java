package org.majluck.dungeoncrawler;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class DungeonCrawler extends JavaPlugin {

    @Getter
    private static DungeonCrawler instance;

    @Override
    public void onEnable() {
        //Todo
        ChainAttack attack = new ChainAttack();
        attack.register();
    }

    @Override
    public void onDisable() {

    }

    public DungeonCrawler() {
        instance = this;
    }
}
