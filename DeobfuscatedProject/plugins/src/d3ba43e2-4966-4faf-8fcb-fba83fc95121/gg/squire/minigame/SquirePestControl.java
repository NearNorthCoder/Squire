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
import l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.a;
import l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.f;
import l.-.-.n.s.s.i.e.r.q.p.o.c.o.t.u.r.e.t.g;
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
    private /* synthetic */ int j;
    @Inject
    private /* synthetic */ a f;
    private /* synthetic */ int h;
    @Inject
    private /* synthetic */ EventBus d;
    @Inject
    private /* synthetic */ ConfigManager e;
    @Inject
    private /* synthetic */ OverlayManager b;
    @Inject
    private /* synthetic */ InfoBox c;
    private static /* synthetic */ long a;
    private static /* synthetic */ String[] lIIIlIlIIIlIl;
    private static /* synthetic */ int[] lIIIlIlIIIllI;
    private /* synthetic */ int i;
    private /* synthetic */ Instant g;

    private static void lIIllllllIllIlI() {
        lIIIlIlIIIllI = new int[8];
        SquirePestControl.lIIIlIlIIIllI[0] = 0xFFFFFFA5 & 0xFFA;
        SquirePestControl.lIIIlIlIIIllI[1] = (0x27 ^ 0x2B) & ~(0xB2 ^ 0xBE);
        SquirePestControl.lIIIlIlIIIllI[2] = 0xFFFFE1BF & 0x1FD7;
        SquirePestControl.lIIIlIlIIIllI[3] = 0x88 ^ 0x8D;
        SquirePestControl.lIIIlIlIIIllI[4] = " ".length();
        SquirePestControl.lIIIlIlIIIllI[5] = "  ".length();
        SquirePestControl.lIIIlIlIIIllI[6] = "   ".length();
        SquirePestControl.lIIIlIlIIIllI[7] = 0x29 ^ 0x75 ^ (0x4D ^ 0x19);
    }

    @Provides
    SquirePestControlConfig a(ConfigManager configManager) {
        return (SquirePestControlConfig)configManager.getConfig(SquirePestControlConfig.class);
    }

    protected void onStart() {
        System.out.println(lIIIlIlIIIlIl[lIIIlIlIIIllI[5]]);
        this.b.add((Overlay)this.c);
        "".length();
        this.g = Instant.now();
        this.j = lIIIlIlIIIllI[1];
    }

    private static String lIIllllllIllIII(String lllllllllllllllIIIIlllIlIlIIIIII, String lllllllllllllllIIIIlllIlIIllllll) {
        try {
            SecretKeySpec lllllllllllllllIIIIlllIlIlIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlllIlIIllllll.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIIllI[7]), "DES");
            Cipher lllllllllllllllIIIIlllIlIlIIIlII = Cipher.getInstance("DES");
            lllllllllllllllIIIIlllIlIlIIIlII.init(lIIIlIlIIIllI[5], lllllllllllllllIIIIlllIlIlIIIlIl);
            return new String(lllllllllllllllIIIIlllIlIlIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlllIlIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlllIlIlIIIIll) {
            lllllllllllllllIIIIlllIlIlIIIIll.printStackTrace();
            return null;
        }
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
        classArray[SquirePestControl.lIIIlIlIIIllI[1]] = g.class;
        classArray[SquirePestControl.lIIIlIlIIIllI[4]] = f.class;
        return classArray;
    }

    public void a(int n) {
        this.h = n;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        SquirePestControl lllllllllllllllIIIIlllIlIlIIlIlI;
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
        lllllllllllllllIIIIlllIlIlIIlIlI.j = Integer.parseInt(Widgets.get((int)lIIIlIlIIIllI[2], (int)lIIIlIlIIIllI[3]).getText().split(lIIIlIlIIIlIl[lIIIlIlIIIllI[4]])[lIIIlIlIIIllI[4]]);
        if (SquirePestControl.lIIllllllIllllI(lllllllllllllllIIIIlllIlIlIIlIlI.b())) {
            lllllllllllllllIIIIlllIlIlIIlIlI.a(lllllllllllllllIIIIlllIlIlIIlIlI.j);
            "".length();
            if (((0x55 ^ 0x75) & ~(0xD ^ 0x2D)) != ((0x7C ^ 0x42) & ~(0x30 ^ 0xE))) {
                return;
            }
        } else {
            lllllllllllllllIIIIlllIlIlIIlIlI.i = lllllllllllllllIIIIlllIlIlIIlIlI.j - lllllllllllllllIIIIlllIlIlIIlIlI.h;
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

    private static String lIIllllllIlIlll(String lllllllllllllllIIIIlllIlIIlIllIl, String lllllllllllllllIIIIlllIlIIllIIIl) {
        lllllllllllllllIIIIlllIlIIlIllIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlllIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlllIlIIllIIII = new StringBuilder();
        char[] lllllllllllllllIIIIlllIlIIlIllll = lllllllllllllllIIIIlllIlIIllIIIl.toCharArray();
        int lllllllllllllllIIIIlllIlIIlIlllI = lIIIlIlIIIllI[1];
        char[] lllllllllllllllIIIIlllIlIIlIlIII = lllllllllllllllIIIIlllIlIIlIllIl.toCharArray();
        int lllllllllllllllIIIIlllIlIIlIIlll = lllllllllllllllIIIIlllIlIIlIlIII.length;
        int lllllllllllllllIIIIlllIlIIlIIllI = lIIIlIlIIIllI[1];
        while (SquirePestControl.lIIllllllIlllll(lllllllllllllllIIIIlllIlIIlIIllI, lllllllllllllllIIIIlllIlIIlIIlll)) {
            char lllllllllllllllIIIIlllIlIIllIIll = lllllllllllllllIIIIlllIlIIlIlIII[lllllllllllllllIIIIlllIlIIlIIllI];
            lllllllllllllllIIIIlllIlIIllIIII.append((char)(lllllllllllllllIIIIlllIlIIllIIll ^ lllllllllllllllIIIIlllIlIIlIllll[lllllllllllllllIIIIlllIlIIlIlllI % lllllllllllllllIIIIlllIlIIlIllll.length]));
            "".length();
            ++lllllllllllllllIIIIlllIlIIlIlllI;
            ++lllllllllllllllIIIIlllIlIIlIIllI;
            "".length();
            if (((0xDF ^ 0x95) & ~(0xCD ^ 0x87)) == 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlllIlIIllIIII);
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
        SquirePestControl.lIIIlIlIIIlIl[SquirePestControl.lIIIlIlIIIllI[1]] = SquirePestControl.lIIllllllIlIlll("MSI3PzkLOD9vOgEkMT89TnYhIDxCNyoqaQMieCIoGnYoICAMIis=", "bVXOI");
        SquirePestControl.lIIIlIlIIIlIl[SquirePestControl.lIIIlIlIIIllI[4]] = SquirePestControl.lIIllllllIlIlll("aWg=", "SHRPv");
        SquirePestControl.lIIIlIlIIIlIl[SquirePestControl.lIIIlIlIIIllI[5]] = SquirePestControl.lIIllllllIllIII("phy2pjXBl/a/GFRy2u1omgBpYS20T1VgaJbf8XwKVSo=", "ojxDI");
    }

    private static boolean lIIllllllIllllI(int n) {
        return n == 0;
    }

    protected void onStop() {
        this.b.remove((Overlay)this.c);
        "".length();
    }
}

