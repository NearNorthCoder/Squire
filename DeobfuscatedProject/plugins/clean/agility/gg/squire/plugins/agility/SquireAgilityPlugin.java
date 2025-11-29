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
import java.nio.charset.StandardCharsets;
import java.util.Base64;
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

    private static boolean lIIlIlIIllIlII(int n, int n2) {
        return n < n2;
    }

    private static void lIIlIlIIllIIIl() {
        lIllIIIIIll = new String[lIllIIIIlII[2]];
        SquireAgilityPlugin.lIllIIIIIll[SquireAgilityPlugin.lIllIIIIlII[0]] = "lap count";
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIllIIIIlII[1]];
        classArray[SquireAgilityPlugin.lIllIIIIlII[0]] = ConsumingTask.class;
        classArray[SquireAgilityPlugin.lIllIIIIlII[2]] = CastingSpellTask.class;
        classArray[SquireAgilityPlugin.lIllIIIIlII[3]] = TraversingObstaclesTask.class;
        classArray[SquireAgilityPlugin.lIllIIIIlII[4]] = DroppingEmptyPiesTask.class;
        classArray[SquireAgilityPlugin.lIllIIIIlII[5]] = LootingMarksTask.class;
        classArray[SquireAgilityPlugin.lIllIIIIlII[6]] = UsingSeersTeleportTask.class;
        classArray[SquireAgilityPlugin.lIllIIIIlII[7]] = UsingPortalTask.class;
        return classArray;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireAgilityPlugin.lIIlIlIIllIIll(chatMessage.getMessage().contains(lIllIIIIIll[lIllIIIIlII[0]]) ? 1 : 0)) {
            this.g += lIllIIIIlII[2];
        }
    }

    static {
        SquireAgilityPlugin.lIIlIlIIllIIlI();
        SquireAgilityPlugin.lIIlIlIIllIIIl();
    }

    public void a(b b2) {
        this.f = b2;
    }

    private static boolean lIIlIlIIllIIll(int n) {
        return n != 0;
    }

    public SquireAgilityPlugin() {
        this.g = lIllIIIIlII[0];
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

        this.a((GameEnum) ull);
        this.g = lIllIIIIlII[0];
    }

    protected void onStart() {
        this.d.add((Overlay)this.e);

        this.a((GameEnum) ull);
        this.g = lIllIIIIlII[0];
    }

        return String.valueOf(var1);
    }
}

