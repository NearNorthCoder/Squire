/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.events.MenuActionProcessed
 *  net.unethicalite.api.widgets.Widgets
 */
package gg.squire.minigame;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.minigame.SquirePestControlConfig;
import gg.squire.minigame.overlay.InfoBox;
import java.time.Instant;
import gg.squire.minigame.AHelper;
import gg.squire.minigame.AttackingTask;
import gg.squire.minigame.EnteringBoatTask;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.MenuActionProcessed;
import net.unethicalite.api.widgets.Widgets;

@PluginDescriptor(name="Squire Pest Control", enabledByDefault=false)
public class SquirePestControl
extends SquirePlugin {
    private  int j;
    @Inject
    private  a f;
    private  int h;
    @Inject
    private  EventBus d;
    @Inject
    private  ConfigManager e;
    @Inject
    private  OverlayManager b;
    @Inject
    private  InfoBox c;
    private static  long a;

    private  int i;
    private  Instant g;

    private static void var3() {
        var2 = new int[8];
        SquirePestControl.var2[0] = 0xFFFFFFA5 & 0xFFA;
        SquirePestControl.var2[1] = (0x27 ^ 0x2B) & ~(0xB2 ^ 0xBE);
        SquirePestControl.var2[2] = 0xFFFFE1BF & 0x1FD7;
        SquirePestControl.var2[3] = 0x88 ^ 0x8D;
        SquirePestControl.var2[4] = 1;
        SquirePestControl.var2[5] = 2;
        SquirePestControl.var2[6] = 3;
        SquirePestControl.var2[7] = 0x29 ^ 0x75 ^ (0x4D ^ 0x19);
    }

    @Provides
    SquirePestControlConfig a(ConfigManager configManager) {
        return (SquirePestControlConfig)configManager.getConfig(SquirePestControlConfig.class);
    }

    protected void onStart() {
        System.out.println(var1[var2[5]]);
        this.b.add((Overlay)this.c);
        0;
        this.g = Instant.now();
        this.j = var2[1];
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    public void c(int n) {
        this.j = n;
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    private static boolean var11(int n, int n2) {
        return n < n2;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var2[5]];
        classArray[SquirePestControl.var2[1]] = EnteringBoatTask.class;
        classArray[SquirePestControl.var2[4]] = AttackingTask.class;
        return classArray;
    }

    public void a(int n) {
        this.h = n;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        SquirePestControl var12;
        if (SquirePestControl.var13(this.j, var2[0])) {
            System.out.println(var1[var2[1]]);
            this.forceStop();
        }
        if (SquirePestControl.var10(Widgets.get((int)var2[2], (int)var2[3]))) {
            return;
        }
        if (SquirePestControl.var14(Widgets.get((int)var2[2], (int)var2[3]).getText().isEmpty() ? 1 : 0)) {
            return;
        }
        var12.j = Integer.parseInt(Widgets.get((int)var2[2], (int)var2[3]).getText().split(var1[var2[4]])[var2[4]]);
        if (SquirePestControl.var15(var12.b())) {
            var12.a(var12.j);
            0;
            if (((0x55 ^ 0x75) & ~(0xD ^ 0x2D)) != ((0x7C ^ 0x42) & ~(0x30 ^ 0xE))) {
                return;
            }
        } else {
            var12.i = var12.j - var12.h;
        }
    }

    public static long a() {
        return a;
    }

    static {
        SquirePestControl.var3();
        SquirePestControl.var16();
    }

    public Instant getStarted() {
        return this.g;
    }

    public void b(int n) {
        this.i = n;
    }

    public int c() {
        return this.i;
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var2[1];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var2[1];
        while (SquirePestControl.var11(var25, var24)) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if (((0xDF ^ 0x95) & ~(0xCD ^ 0x87)) == 0) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean var13(int n, int n2) {
        return n >= n2;
    }

    private static boolean var14(int n) {
        return n != 0;
    }

    public int d() {
        return this.j;
    }

    public int b() {
        return this.h;
    }

    @Subscribe
    public void a(MenuActionProcessed menuActionProcessed) {
        System.out.println(menuActionProcessed);
    }

    private static void var16() {
        var1 = new String[var2[6]];
        SquirePestControl.var1[SquirePestControl.var2[1]] = "Stopping script, you are at max points";
        SquirePestControl.var1[SquirePestControl.var2[4]] = ": ";
        SquirePestControl.var1[SquirePestControl.var2[5]] = "Squire Pest Control Started.";
    }

    private static boolean var15(int n) {
        return n == 0;
    }

    protected void onStop() {
        this.b.remove((Overlay)this.c);
        0;
    }
}

