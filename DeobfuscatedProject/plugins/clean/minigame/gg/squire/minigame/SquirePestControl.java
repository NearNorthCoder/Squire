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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    @Provides
    SquirePestControlConfig a(ConfigManager configManager) {
        return (SquirePestControlConfig)configManager.getConfig(SquirePestControlConfig.class);
    }

    protected void onStart() {
        System.out.println(lIIIlIlIIIlIl[lIIIlIlIIIllI[5]]);
        this.b.add((Overlay)this.c);

        this.g = Instant.now();
        this.j = lIIIlIlIIIllI[1];
    }

    public void c(int n) {
        this.j = n;
    }

    private static boolean lIIllllllIlllII(Object object) {
        return object == null;
    }

    private static boolean lIIllllllIlllll(int n, int n2) {
        return n < n2;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIIlIlIIIllI[5]];
        classArray[SquirePestControl.lIIIlIlIIIllI[1]] = EnteringBoatTask.class;
        classArray[SquirePestControl.lIIIlIlIIIllI[4]] = AttackingTask.class;
        return classArray;
    }

    public void a(int n) {
        this.h = n;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        SquirePestControl var1;
        if (SquirePestControl.lIIllllllIllIll(this.j, lIIIlIlIIIllI[0])) {
            System.out.println(lIIIlIlIIIlIl[lIIIlIlIIIllI[1]]);
            this.forceStop();
        }
        if (SquirePestControl.lIIllllllIlllII(Widgets.get((int)lIIIlIlIIIllI[2], (int)lIIIlIlIIIllI[3]))) {
            return;
        }
        if (SquirePestControl.lIIllllllIlllIl(Widgets.get((int)lIIIlIlIIIllI[2], (int)lIIIlIlIIIllI[3]).getText().isEmpty() ? 1 : 0)) {
            return;
        }
        var1.j = Integer.parseInt(Widgets.get((int)lIIIlIlIIIllI[2], (int)lIIIlIlIIIllI[3]).getText().split(lIIIlIlIIIlIl[lIIIlIlIIIllI[4]])[lIIIlIlIIIllI[4]]);
        if (SquirePestControl.lIIllllllIllllI(var1.b())) {
            var1.a(var1.j);

            if (((0x55 ^ 0x75) & ~(0xD ^ 0x2D)) != ((0x7C ^ 0x42) & ~(0x30 ^ 0xE))) {
                return;
            }
        } else {
            var1.i = var1.j - var1.h;
        }
    }

    public static long a() {
        return a;
    }

    static {
        SquirePestControl.lIIllllllIllIlI();
        SquirePestControl.lIIllllllIllIIl();
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

        return String.valueOf(var2);
    }

    private static boolean lIIllllllIllIll(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIllllllIlllIl(int n) {
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

    private static void lIIllllllIllIIl() {
        lIIIlIlIIIlIl = new String[lIIIlIlIIIllI[6]];
        SquirePestControl.lIIIlIlIIIlIl[SquirePestControl.lIIIlIlIIIllI[1]] = "Stopping script, you are at max points";
        SquirePestControl.lIIIlIlIIIlIl[SquirePestControl.lIIIlIlIIIllI[4]] = ": ";
        SquirePestControl.lIIIlIlIIIlIl[SquirePestControl.lIIIlIlIIIllI[5]] = "Squire Pest Control Started.";
    }

    private static boolean lIIllllllIllllI(int n) {
        return n == 0;
    }

    protected void onStop() {
        this.b.remove((Overlay)this.c);

    }
}

