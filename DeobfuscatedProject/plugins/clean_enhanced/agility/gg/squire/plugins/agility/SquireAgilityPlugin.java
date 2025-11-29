/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.plugins.agility;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.AgilityOverlay;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import gg.squire.plugins.agility.GameEnum;
import gg.squire.plugins.agility.ConsumingTask;
import gg.squire.plugins.agility.DroppingEmptyPiesTask;
import gg.squire.plugins.agility.LootingMarksTask;
import gg.squire.plugins.agility.UsingPortalTask;
import gg.squire.plugins.agility.CastingSpellTask;
import gg.squire.plugins.agility.UsingSeersTeleportTask;
import gg.squire.plugins.agility.TraversingObstaclesTask;

@PluginDescriptor(name="Squire Agility", description="Completes agility courses.", enabledByDefault=false, tags={"agility", "course", "marks of grace"})
public class SquireAgilityPlugin
extends SquirePlugin {
    private  b f;

    @Inject
    private  OverlayManager d;
    private  int g;
    @Inject
    private  AgilityOverlay e;

    private static boolean var3(int n, int n2) {
        return n < n2;
    }

    private static void var4() {
        var1 = new String[var2[2]];
        SquireAgilityPlugin.var1[SquireAgilityPlugin.var2[0]] = "lap count";
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var2[1]];
        classArray[SquireAgilityPlugin.var2[0]] = ConsumingTask.class;
        classArray[SquireAgilityPlugin.var2[2]] = CastingSpellTask.class;
        classArray[SquireAgilityPlugin.var2[3]] = TraversingObstaclesTask.class;
        classArray[SquireAgilityPlugin.var2[4]] = DroppingEmptyPiesTask.class;
        classArray[SquireAgilityPlugin.var2[5]] = LootingMarksTask.class;
        classArray[SquireAgilityPlugin.var2[6]] = UsingSeersTeleportTask.class;
        classArray[SquireAgilityPlugin.var2[7]] = UsingPortalTask.class;
        return classArray;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireAgilityPlugin.var5(chatMessage.getMessage().contains(var1[var2[0]]) ? 1 : 0)) {
            this.g += var2[2];
        }
    }

    private static void var6() {
        var2 = new int[8];
        SquireAgilityPlugin.var2[0] = (0xE5 ^ 0xAA) & ~(0x67 ^ 0x28) & ~((0x71 ^ 0x6D) & ~(0x5C ^ 0x40));
        SquireAgilityPlugin.var2[1] = 0xB1 ^ 0xB6;
        SquireAgilityPlugin.var2[2] = 1;
        SquireAgilityPlugin.var2[3] = 2;
        SquireAgilityPlugin.var2[4] = 3;
        SquireAgilityPlugin.var2[5] = 61 + 51 - 19 + 98 ^ 118 + 138 - 141 + 72;
        SquireAgilityPlugin.var2[6] = 0x97 ^ 0x92;
        SquireAgilityPlugin.var2[7] = 0xA5 ^ 0xA3;
    }

    static {
        SquireAgilityPlugin.var6();
        SquireAgilityPlugin.var4();
    }

    public void a(b b2) {
        this.f = b2;
    }

    private static boolean var5(int n) {
        return n != 0;
    }

    public SquireAgilityPlugin() {
        this.g = var2[0];
    }

    @Provides
    public AgilityConfig a(ConfigManager configManager) {
        return (AgilityConfig)configManager.getConfig(AgilityConfig.class);
    }

    public b a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    protected void onStop() {
        this.d.remove((Overlay)this.e);
        0;
        this.a((b)null);
        this.g = var2[0];
    }

    protected void onStart() {
        this.d.add((Overlay)this.e);
        0;
        this.a((b)null);
        this.g = var2[0];
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = var2[0];
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = var2[0];
        while (SquireAgilityPlugin.var3(var15, var14)) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if ((97 + 98 - 188 + 183 ^ 62 + 144 - 25 + 5) >= 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }
}

