/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.input.KeyListener
 *  net.runelite.client.input.KeyManager
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.basics.prayer.prayerflicker;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.prayer.prayerflicker.PrayFlickerConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bf;
import gg.squire.basics.prayer.prayerflicker.FlickingTask;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.input.KeyListener;
import net.runelite.client.input.KeyManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.widgets.Prayers;

@SquireUtil
@PluginDescriptor(name="Squire Prayer Flicker", description="Pray flicks", enabledByDefault=false)
public class SquirePrayFlick
extends SquirePlugin {
    public  boolean fu;
    @Inject
    public  PrayFlickerConfig ft;
    private final  KeyListener fv;
    
    @Inject
    private  KeyManager bY;

    public SquirePrayFlick() {
        this.fv = new bf(this);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (SquirePrayFlick.lIlIIIIIl(this.fu ? 1 : 0) && SquirePrayFlick.lIlIIIIlI(Prayers.isQuickPrayerEnabled() ? 1 : 0) && SquirePrayFlick.lIlIIIIIl(this.ft.keepPrayerOn() ? 1 : 0)) {
            Prayers.toggleQuickPrayer((boolean)lIlIIII[0]);
        }
    }

    protected void onStop() {
        this.bY.unregisterKeyListener(this.fv);
    }

    protected void onStart() {
        this.bY.registerKeyListener(this.fv);
    }

    private static boolean lIlIIIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIIIl(int n2) {
        return n2 == 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIIII[1]];
        classArray[SquirePrayFlick.lIlIIII[0]] = FlickingTask.class;
        return classArray;
    }

    public boolean isEnabled() {
        return this.fu;
    }

    static {
        SquirePrayFlick.lIlIIIIII();
    }

    @Provides
    PrayFlickerConfig s(ConfigManager configManager) {
        return (PrayFlickerConfig)configManager.getConfig(PrayFlickerConfig.class);
    }

}

