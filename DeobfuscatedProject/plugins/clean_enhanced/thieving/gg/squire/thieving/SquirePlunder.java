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
        0;
    }

    private static void var3() {
        var1 = new String[var2[2]];
        SquirePlunder.var1[SquirePlunder.var2[1]] = "Plunder started";
    }

    static {
        SquirePlunder.var4();
        SquirePlunder.var3();
    }

    @Provides
    SquirePlunderConfig a(ConfigManager configManager) {
        return (SquirePlunderConfig)configManager.getConfig(SquirePlunderConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var2[0]];
        classArray[SquirePlunder.var2[1]] = ConsumingTask.class;
        classArray[SquirePlunder.var2[2]] = BankingTask.class;
        classArray[SquirePlunder.var2[3]] = StartingMinigameTask.class;
        classArray[SquirePlunder.var2[4]] = FindingMummyTask.class;
        classArray[SquirePlunder.var2[5]] = LootingSceptreTask.class;
        classArray[SquirePlunder.var2[6]] = PassingTrapTask.class;
        classArray[SquirePlunder.var2[7]] = PlunderingSarcophagusTask.class;
        classArray[SquirePlunder.var2[8]] = PlunderingChestTask.class;
        classArray[SquirePlunder.var2[9]] = PlunderingUrnsTask.class;
        classArray[SquirePlunder.var2[10]] = MovingToNextFloorTask.class;
        return classArray;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = var2[1];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = var2[1];
        while (SquirePlunder.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (((76 + 89 - 119 + 114 ^ 13 + 19 - -145 + 5) & (39 + 91 - 28 + 48 ^ 119 + 5 - 6 + 10 ^ -1)) > -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        this.a();
    }

    private static void var4() {
        var2 = new int[11];
        SquirePlunder.var2[0] = 0x8E ^ 0x95 ^ (0x7E ^ 0x6F);
        SquirePlunder.var2[1] = (0x2B ^ 0x64 ^ (0xA ^ 0x58)) & (0xD3 ^ 0x95 ^ (0xD2 ^ 0x89) ^ -1);
        SquirePlunder.var2[2] = 1;
        SquirePlunder.var2[3] = 2;
        SquirePlunder.var2[4] = 3;
        SquirePlunder.var2[5] = 0x47 ^ 0x43;
        SquirePlunder.var2[6] = 0x97 ^ 0x92;
        SquirePlunder.var2[7] = 0xC0 ^ 0xC6;
        SquirePlunder.var2[8] = 99 + 106 - 191 + 165 ^ 105 + 121 - 171 + 125;
        SquirePlunder.var2[9] = 0x58 ^ 0x50;
        SquirePlunder.var2[10] = 96 + 144 - 120 + 83 ^ 29 + 7 - -30 + 128;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    public InventorySetup b() {
        return this.f;
    }

    protected void onStart() {
        this.d.register((Object)this.c);
        this.e.add((Overlay)this.b);
        0;
        System.out.println(var1[var2[1]]);
        this.a();
    }

    private void a() {
        SquirePlunder var16;
        this.f = new InventorySetup();
        if (SquirePlunder.var17(this.a.foodAmount())) {
            this.f.add(this.a.foodID(), this.a.foodAmount());
            0;
        }
        if (SquirePlunder.var17(var16.a.antiAmount())) {
            var16.f.add(item -> item.getName().startsWith(this.a.antiPoison()), var16.a.antiAmount());
            0;
        }
    }

    private static boolean var17(int n2) {
        return n2 != 0;
    }
}

