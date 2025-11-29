/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.leagues.miner;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.leagues.miner.MinerConfig;
import gg.squire.leagues.miner.MineRocksTask;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(name="[Leagues] Miner", enabledByDefault=false)
public class Miner
extends SquirePlugin {

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIII[0]];
        classArray[Miner.llIII[1]] = MineRocksTask.class;
        return classArray;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
    }

    protected void onStart() {
    }

    @Provides
    MinerConfig c(ConfigManager configManager) {
        return (MinerConfig)configManager.getConfig(MinerConfig.class);
    }

    protected void onStop() {
    }

    static {
        Miner.lIIlIll();
    }
}

