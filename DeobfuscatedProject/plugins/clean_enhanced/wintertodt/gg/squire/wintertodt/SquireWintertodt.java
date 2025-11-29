/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.wintertodt;

import gg.squire.wintertodt.WintertodtManager;
import gg.squire.wintertodt.EnteringWintertodtAreaTask;
import gg.squire.wintertodt.ChoppingBrumaTreeTask;
import gg.squire.wintertodt.BurningAtBrazierTask;
import gg.squire.wintertodt.CreatingRejuvenationPotionsTask;
import gg.squire.wintertodt.DodgingBrazierTask;
import gg.squire.wintertodt.DodgingSnowfallDamageTask;
import gg.squire.wintertodt.DroppingEmptyJugTask;
import gg.squire.wintertodt.EatingTask;
import gg.squire.wintertodt.FixingBrazierTask;
import gg.squire.wintertodt.FletchingLogsTask;
import gg.squire.wintertodt.LightingBrazierTask;
import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.wintertodt.SquireWintertodtConfig;
import gg.squire.wintertodt.overlay.WintertodtInfoBox;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Squire Wintertodt")
@Singleton
public class SquireWintertodt
extends SquirePlugin {
    @Inject
    private  WintertodtInfoBox c;
    @Inject
    private  OverlayManager d;
    @Inject
    private  b b;
    
    private static final  Logger a;
    private  int f;
    @Inject
    private  EventBus e;

    protected void onStop() {
        this.e.unregister((Object)this.b);
        this.d.remove((Overlay)this.c);
        0;
    }

    @Provides
    SquireWintertodtConfig a(ConfigManager configManager) {
        return (SquireWintertodtConfig)configManager.getConfig(SquireWintertodtConfig.class);
    }

    public int a() {
        return this.f;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[0];
        classArray[1] = CreatingRejuvenationPotionsTask.class;
        classArray[2] = ChoppingBrumaTreeTask.class;
        classArray[3] = BurningAtBrazierTask.class;
        classArray[4] = EatingTask.class;
        classArray[5] = LightingBrazierTask.class;
        classArray[6] = FletchingLogsTask.class;
        classArray[7] = FixingBrazierTask.class;
        classArray[8] = DodgingSnowfallDamageTask.class;
        classArray[9] = DroppingEmptyJugTask.class;
        classArray[SquireWintertodt.var1[10]] = EnteringWintertodtAreaTask.class;
        classArray[SquireWintertodt.var1[11]] = DodgingBrazierTask.class;
        return classArray;
    }

    protected void onStart() {
        this.e.register((Object)this.b);
        this.d.add((Overlay)this.c);
        0;
    }

    static {
        SquireWintertodt.var2();
        a = LoggerFactory.getLogger(SquireWintertodt.class);
    }
}

