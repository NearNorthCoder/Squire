/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.thieving;

import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.thieving.SquirePlunderConfig;
import gg.squire.thieving.overlay.PlunderInfoBox;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import gg.squire.thieving.ThievingManager;
import gg.squire.thieving.BankingTask;
import gg.squire.thieving.ConsumingTask;
import gg.squire.thieving.LootingSceptreTask;
import gg.squire.thieving.MovingToNextFloorTask;
import gg.squire.thieving.PassingTrapTask;
import gg.squire.thieving.PlunderingChestTask;
import gg.squire.thieving.PlunderingSarcophagusTask;
import gg.squire.thieving.PlunderingUrnsTask;
import gg.squire.thieving.FindingMummyTask;
import gg.squire.thieving.StartingMinigameTask;

@PluginDescriptor(name="Squire Pyramid Plunder", enabledByDefault=false)
public class SquirePlunder
extends SquirePlugin {
    @Inject
    private  PlunderInfoBox b;
    
    @Inject
    private  SquirePlunderConfig a;
    
    @Inject
    private  a c;
    private  InventorySetup f;
    @Inject
    private  EventBus d;
    @Inject
    private  OverlayManager e;

    protected void onStop() {
        this.d.unregister((Object)this.c);
        this.e.remove((Overlay)this.b);

    }

    private static void lIIlIlIIIllIIlI() {
        llllllIlIlII = new String[llllllIlIlIl[2]];
        SquirePlunder.llllllIlIlII[SquirePlunder.llllllIlIlIl[1]] = "Plunder started";
    }

    static {
        SquirePlunder.lIIlIlIIIllIIll();
        SquirePlunder.lIIlIlIIIllIIlI();
    }

    @Provides
    SquirePlunderConfig a(ConfigManager configManager) {
        return (SquirePlunderConfig)configManager.getConfig(SquirePlunderConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llllllIlIlIl[0]];
        classArray[SquirePlunder.llllllIlIlIl[1]] = ConsumingTask.class;
        classArray[SquirePlunder.llllllIlIlIl[2]] = BankingTask.class;
        classArray[SquirePlunder.llllllIlIlIl[3]] = StartingMinigameTask.class;
        classArray[SquirePlunder.llllllIlIlIl[4]] = FindingMummyTask.class;
        classArray[SquirePlunder.llllllIlIlIl[5]] = LootingSceptreTask.class;
        classArray[SquirePlunder.llllllIlIlIl[6]] = PassingTrapTask.class;
        classArray[SquirePlunder.llllllIlIlIl[7]] = PlunderingSarcophagusTask.class;
        classArray[SquirePlunder.llllllIlIlIl[8]] = PlunderingChestTask.class;
        classArray[SquirePlunder.llllllIlIlIl[9]] = PlunderingUrnsTask.class;
        classArray[SquirePlunder.llllllIlIlIl[10]] = MovingToNextFloorTask.class;
        return classArray;
    }

        return String.valueOf(var1);
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a();
    }

    private static boolean lIIlIlIIIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    public InventorySetup b() {
        return this.f;
    }

    protected void onStart() {
        this.d.register((Object)this.c);
        this.e.add((Overlay)this.b);

        System.out.println(llllllIlIlII[llllllIlIlIl[1]]);
        this.a();
    }

    private void a() {
        SquirePlunder var2;
        this.f = new InventorySetup();
        if (SquirePlunder.lIIlIlIIIllIlII(this.a.foodAmount())) {
            this.f.add(this.a.foodID(), this.a.foodAmount());

        }
        if (SquirePlunder.lIIlIlIIIllIlII(var2.a.antiAmount())) {
            var2.f.add(item -> item.getName().startsWith(this.a.antiPoison()), var2.a.antiAmount());

        }
    }

    private static boolean lIIlIlIIIllIlII(int n2) {
        return n2 != 0;
    }
}

