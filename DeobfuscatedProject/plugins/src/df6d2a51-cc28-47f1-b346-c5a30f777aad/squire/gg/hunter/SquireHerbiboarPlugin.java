/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  org.pf4j.Extension
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package squire.gg.hunter;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.d;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.i;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.l;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.m;
import s.r.e.-.q.i.a.r.b.h.u.r.e.b.i.o.n;
import squire.gg.hunter.SquireHerbiboarConfig;
import squire.gg.hunter.overlay.HerbiboarInfoBox;

@Extension
@PluginDescriptor(name="Squire Herbiboar")
public class SquireHerbiboarPlugin
extends SquirePlugin {
    private /* synthetic */ boolean h;
    private static /* synthetic */ String[] lllIIllIIlll;
    private static final /* synthetic */ Logger a;
    @Inject
    private /* synthetic */ HerbiboarInfoBox e;
    private static /* synthetic */ int[] lllIIllIlIIl;
    @Inject
    private /* synthetic */ OverlayManager f;
    public static /* synthetic */ boolean b;
    @Inject
    private /* synthetic */ EventBus j;
    @Inject
    private /* synthetic */ i i;
    private /* synthetic */ Instant g;
    private /* synthetic */ boolean d;
    private static /* synthetic */ int c;

    @Provides
    SquireHerbiboarConfig a(ConfigManager configManager) {
        return (SquireHerbiboarConfig)configManager.getConfig(SquireHerbiboarConfig.class);
    }

    public Instant getStarted() {
        return this.g;
    }

    public void b(boolean bl) {
        this.h = bl;
    }

    protected void onStop() {
        this.g = null;
        this.h = lllIIllIlIIl[1];
        c = lllIIllIlIIl[1];
        this.i.o();
        this.f.remove((Overlay)this.e);
        "".length();
        this.j.unregister((Object)this.i);
    }

    private static void lIIIlIlIlIlIIIl() {
        lllIIllIlIIl = new int[6];
        SquireHerbiboarPlugin.lllIIllIlIIl[0] = 0xBB ^ 0xAB ^ (0x32 ^ 0x26);
        SquireHerbiboarPlugin.lllIIllIlIIl[1] = (0x7E ^ 0x56 ^ (0x1C ^ 0x62)) & (0xF2 ^ 0x89 ^ (1 ^ 0x2C) ^ -" ".length());
        SquireHerbiboarPlugin.lllIIllIlIIl[2] = " ".length();
        SquireHerbiboarPlugin.lllIIllIlIIl[3] = "  ".length();
        SquireHerbiboarPlugin.lllIIllIlIIl[4] = "   ".length();
        SquireHerbiboarPlugin.lllIIllIlIIl[5] = 0xF3 ^ 0xB5 ^ (0xE8 ^ 0xA6);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lllllllllllllllIIllIlIIIIllIlIlI;
        String string = chatMessage.getMessage();
        if (SquireHerbiboarPlugin.lIIIlIlIlIlIIlI(string.contains(lllIIllIIlll[lllIIllIlIIl[1]]) ? 1 : 0)) {
            int n2;
            if (SquireHerbiboarPlugin.lIIIlIlIlIlIIll(b ? 1 : 0)) {
                n2 = lllIIllIlIIl[2];
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            } else {
                b = lllIIllIlIIl[1];
                n2 = b ? 1 : 0;
            }
        }
        if (SquireHerbiboarPlugin.lIIIlIlIlIlIIlI(lllllllllllllllIIllIlIIIIllIlIlI.contains(lllIIllIIlll[lllIIllIlIIl[2]]) ? 1 : 0)) {
            c += lllIIllIlIIl[2];
        }
        if (SquireHerbiboarPlugin.lIIIlIlIlIlIIlI(lllllllllllllllIIllIlIIIIllIlIlI.contains(lllIIllIIlll[lllIIllIlIIl[3]]) ? 1 : 0)) {
            SquireHerbiboarPlugin lllllllllllllllIIllIlIIIIllIllII;
            lllllllllllllllIIllIlIIIIllIllII.b(lllIIllIlIIl[2]);
        }
    }

    private static boolean lIIIlIlIlIlIIll(int n2) {
        return n2 == 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lllIIllIlIIl[0]];
        classArray[SquireHerbiboarPlugin.lllIIllIlIIl[1]] = d.class;
        classArray[SquireHerbiboarPlugin.lllIIllIlIIl[2]] = n.class;
        classArray[SquireHerbiboarPlugin.lllIIllIlIIl[3]] = l.class;
        classArray[SquireHerbiboarPlugin.lllIIllIlIIl[4]] = m.class;
        return classArray;
    }

    private static boolean lIIIlIlIlIlIIlI(int n2) {
        return n2 != 0;
    }

    private static String lIIIlIlIlIIllll(String lllllllllllllllIIllIlIIIIlIIlIlI, String lllllllllllllllIIllIlIIIIlIIIlll) {
        try {
            SecretKeySpec lllllllllllllllIIllIlIIIIlIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIlIIIIlIIIlll.getBytes(StandardCharsets.UTF_8)), lllIIllIlIIl[5]), "DES");
            Cipher lllllllllllllllIIllIlIIIIlIIllII = Cipher.getInstance("DES");
            lllllllllllllllIIllIlIIIIlIIllII.init(lllIIllIlIIl[3], lllllllllllllllIIllIlIIIIlIIllIl);
            return new String(lllllllllllllllIIllIlIIIIlIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIlIIIIlIIlIll) {
            lllllllllllllllIIllIlIIIIlIIlIll.printStackTrace();
            return null;
        }
    }

    public boolean g() {
        return this.h;
    }

    private static String lIIIlIlIlIIlllI(String lllllllllllllllIIllIlIIIIlIlllll, String lllllllllllllllIIllIlIIIIlIllIIl) {
        lllllllllllllllIIllIlIIIIlIlllll = new String(Base64.getDecoder().decode(lllllllllllllllIIllIlIIIIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIlIIIIlIlllIl = new StringBuilder();
        char[] lllllllllllllllIIllIlIIIIlIlllII = lllllllllllllllIIllIlIIIIlIllIIl.toCharArray();
        int lllllllllllllllIIllIlIIIIlIllIll = lllIIllIlIIl[1];
        char[] lllllllllllllllIIllIlIIIIlIlIlIl = lllllllllllllllIIllIlIIIIlIlllll.toCharArray();
        int lllllllllllllllIIllIlIIIIlIlIlII = lllllllllllllllIIllIlIIIIlIlIlIl.length;
        int lllllllllllllllIIllIlIIIIlIlIIll = lllIIllIlIIl[1];
        while (SquireHerbiboarPlugin.lIIIlIlIlIlIlII(lllllllllllllllIIllIlIIIIlIlIIll, lllllllllllllllIIllIlIIIIlIlIlII)) {
            char lllllllllllllllIIllIlIIIIllIIIII = lllllllllllllllIIllIlIIIIlIlIlIl[lllllllllllllllIIllIlIIIIlIlIIll];
            lllllllllllllllIIllIlIIIIlIlllIl.append((char)(lllllllllllllllIIllIlIIIIllIIIII ^ lllllllllllllllIIllIlIIIIlIlllII[lllllllllllllllIIllIlIIIIlIllIll % lllllllllllllllIIllIlIIIIlIlllII.length]));
            "".length();
            ++lllllllllllllllIIllIlIIIIlIllIll;
            ++lllllllllllllllIIllIlIIIIlIlIIll;
            "".length();
            if (-" ".length() < "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIlIIIIlIlllIl);
    }

    protected void onStart() {
        this.g = Instant.now();
        this.h = lllIIllIlIIl[1];
        this.f.add((Overlay)this.e);
        "".length();
        this.j.register((Object)this.i);
        this.i.n();
    }

    private static void lIIIlIlIlIlIIII() {
        lllIIllIIlll = new String[lllIIllIlIIl[4]];
        SquireHerbiboarPlugin.lllIIllIIlll[SquireHerbiboarPlugin.lllIIllIlIIl[1]] = SquireHerbiboarPlugin.lIIIlIlIlIIlllI("BwMjLwM=", "woBLf");
        SquireHerbiboarPlugin.lllIIllIIlll[SquireHerbiboarPlugin.lllIIllIlIIl[2]] = SquireHerbiboarPlugin.lIIIlIlIlIIllll("f7fyi5EhM5vucERB0uEaag==", "wmGon");
        SquireHerbiboarPlugin.lllIIllIIlll[SquireHerbiboarPlugin.lllIIllIlIIl[3]] = SquireHerbiboarPlugin.lIIIlIlIlIIllll("YmJ0RmWi6tP8VfsnZ4sydg==", "LxXvj");
    }

    public static int e() {
        return c;
    }

    static {
        SquireHerbiboarPlugin.lIIIlIlIlIlIIIl();
        SquireHerbiboarPlugin.lIIIlIlIlIlIIII();
        a = LoggerFactory.getLogger(SquireHerbiboarPlugin.class);
    }

    private static boolean lIIIlIlIlIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean f() {
        return this.d;
    }

    public void a(boolean bl) {
        this.d = bl;
    }
}

