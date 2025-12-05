/*
 * Deobfuscated from gg.squire.basics.log.AutoRelogHopper
 *
 * Automatically relogs and world hops when logged out.
 */
package gg.squire.basics.log;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aC;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aD;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aE;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aF;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.PluginDescriptor;

/**
 * Automatically relogs when logged out or hops worlds.
 */
@PluginDescriptor(
    name = "Squire Relog Hopper",
    description = "Automatically relogs when you get logged out",
    enabledByDefault = false
)
@SquireUtil
public class AutoRelogHopper extends SquirePlugin {

    private boolean isActive;

    @Override
    protected Class<?>[] tasks() {
        return new Class[]{ aF.class, aC.class, aD.class, aE.class };
    }

    @Provides
    RelogConfig provideConfig(ConfigManager configManager) {
        return configManager.getConfig(RelogConfig.class);
    }

    @Override
    protected void onStart() {
        this.isActive = true;
    }

    @Override
    protected void onStop() {
        this.isActive = false;
    }

    public boolean isActive() {
        return this.isActive;
    }
}
