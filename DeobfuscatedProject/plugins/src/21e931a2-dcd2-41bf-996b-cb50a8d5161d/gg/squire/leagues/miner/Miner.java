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
import i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5.c;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(name="[Leagues] Miner", enabledByDefault=false)
public class Miner
extends SquirePlugin {
    private static /* synthetic */ int[] llIII;

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIII[0]];
        classArray[Miner.llIII[1]] = c.class;
        return classArray;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
    }

    protected void onStart() {
    }

    private static void lIIlIll() {
        llIII = new int[2];
        Miner.llIII[0] = " ".length();
        Miner.llIII[1] = (19 + 30 - -48 + 75 ^ 29 + 90 - -8 + 10) & (25 + 40 - -19 + 67 ^ 48 + 107 - 66 + 89 ^ -" ".length());
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

