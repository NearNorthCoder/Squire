/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.moons;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import gg.squire.moons.overlay.MoonsInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.a;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.b;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.c;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.d;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.e;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.f;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.g;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.h;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.i;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.j;
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.k;

@PluginDescriptor(name="Squire Moons of Peril", enabledByDefault=false)
public class SquireMoonsOfPeril
extends SquirePlugin {
    @Inject
    private /* synthetic */ EventBus b;
    @Inject
    private /* synthetic */ SquireMoonsOfPerilConfig c;
    public static /* synthetic */ long i;
    @Inject
    private /* synthetic */ a e;
    public static /* synthetic */ Set<WorldPoint> j;
    @Inject
    private /* synthetic */ OverlayManager a;
    private static /* synthetic */ int[] lIIIIIIIlllII;
    public static /* synthetic */ String g;
    public static /* synthetic */ int h;
    public static /* synthetic */ String f;
    @Inject
    private /* synthetic */ MoonsInfoBox d;
    private static /* synthetic */ String[] lIIIIIIIllIll;

    private static void lIIlIllIllllIlI() {
        lIIIIIIIllIll = new String[lIIIIIIIlllII[5]];
        SquireMoonsOfPeril.lIIIIIIIllIll[SquireMoonsOfPeril.lIIIIIIIlllII[1]] = SquireMoonsOfPeril."squiremoonsofperil";
        SquireMoonsOfPeril.lIIIIIIIllIll[SquireMoonsOfPeril.lIIIIIIIlllII[2]] = SquireMoonsOfPeril."pause";
        SquireMoonsOfPeril.lIIIIIIIllIll[SquireMoonsOfPeril.lIIIIIIIlllII[3]] = SquireMoonsOfPeril."Lunar Chest count";
        SquireMoonsOfPeril.lIIIIIIIllIll[SquireMoonsOfPeril.lIIIIIIIlllII[4]] = SquireMoonsOfPeril."1.11";
    }

    private static String lIIlIllIlllIlll(String lllllllllllllllIIIlllllIIIIllllI, String lllllllllllllllIIIlllllIIIIllIll) {
        try {
            SecretKeySpec lllllllllllllllIIIlllllIIIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllllIIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIlllllIIIlIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIlllllIIIlIIIII.init(lIIIIIIIlllII[3], lllllllllllllllIIIlllllIIIlIIIIl);
            return new String(lllllllllllllllIIIlllllIIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllllIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlllllIIIIlllll) {
            lllllllllllllllIIIlllllIIIIlllll.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC lllllllllllllllIIIlllllIIIlIIllI;
        void lllllllllllllllIIIlllllIIIlIIlll;
        if (SquireMoonsOfPeril.lIIlIllIlllllII(Players.getLocal().getWorldLocation().equals((Object)new WorldPoint(lIIIIIIIlllII[11], lIIIIIIIlllII[12], lIIIIIIIlllII[1])) ? 1 : 0)) {
            return;
        }
        if (SquireMoonsOfPeril.lIIlIllIllllllI(lllllllllllllllIIIlllllIIIlIIlll.getNpc())) {
            System.out.println("name: " + lllllllllllllllIIIlllllIIIlIIlll.getNpc().getName());
            System.out.println("ID: " + lllllllllllllllIIIlllllIIIlIIlll.getNpc().getId());
            System.out.println("NPC: " + String.valueOf(lllllllllllllllIIIlllllIIIlIIlll.getNpc()));
        }
        if (SquireMoonsOfPeril.lIIlIllIllllllI(lllllllllllllllIIIlllllIIIlIIllI = lllllllllllllllIIIlllllIIIlIIlll.getNpc())) {
            j.add(lllllllllllllllIIIlllllIIIlIIllI.getWorldLocation());
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        void lllllllllllllllIIIlllllIIIlIllII;
        if (SquireMoonsOfPeril.lIIlIllIlllllII(configButtonClicked.getGroup().equals(lIIIIIIIllIll[lIIIIIIIlllII[1]]) ? 1 : 0)) {
            return;
        }
        if (SquireMoonsOfPeril.lIIlIllIlllllIl(lllllllllllllllIIIlllllIIIlIllII.getKey().equals(lIIIIIIIllIll[lIIIIIIIlllII[2]]) ? 1 : 0)) {
            boolean bl;
            SquireMoonsOfPeril lllllllllllllllIIIlllllIIIlIllIl;
            if (SquireMoonsOfPeril.lIIlIllIlllllII(lllllllllllllllIIIlllllIIIlIllIl.isPaused() ? 1 : 0)) {
                bl = lIIIIIIIlllII[2];
                0;
                if (1 == 0) {
                    return;
                }
            } else {
                bl = lIIIIIIIlllII[1];
            }
            lllllllllllllllIIIlllllIIIlIllIl.setPaused(bl);
        }
    }

    protected void onStop() {
        this.a.remove((Overlay)this.e);
        0;
        this.a.remove((Overlay)this.d);
        0;
    }

    private static boolean lIIlIllIlllllll(int n, int n2) {
        return n < n2;
    }

    protected void onStart() {
        this.a.add((Overlay)this.e);
        0;
        this.a.add((Overlay)this.d);
        0;
        i = System.currentTimeMillis();
        h = lIIIIIIIlllII[1];
    }

    private static String lIIlIllIllllIII(String lllllllllllllllIIIlllllIIIIIllll, String lllllllllllllllIIIlllllIIIIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIIlllllIIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllllIIIIIlllI.getBytes(StandardCharsets.UTF_8)), lIIIIIIIlllII[9]), "DES");
            Cipher lllllllllllllllIIIlllllIIIIlIIll = Cipher.getInstance("DES");
            lllllllllllllllIIIlllllIIIIlIIll.init(lIIIIIIIlllII[3], lllllllllllllllIIIlllllIIIIlIlII);
            return new String(lllllllllllllllIIIlllllIIIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllllIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlllllIIIIlIIlI) {
            lllllllllllllllIIIlllllIIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIlIllIllllIIl(String lllllllllllllllIIIllllIlllllllII, String lllllllllllllllIIIllllIllllllIll) {
        lllllllllllllllIIIllllIlllllllII = new String(Base64.getDecoder().decode(lllllllllllllllIIIllllIlllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIllllIlllllllll = new StringBuilder();
        char[] lllllllllllllllIIIllllIllllllllI = lllllllllllllllIIIllllIllllllIll.toCharArray();
        int lllllllllllllllIIIllllIlllllllIl = lIIIIIIIlllII[1];
        char[] lllllllllllllllIIIllllIlllllIlll = lllllllllllllllIIIllllIlllllllII.toCharArray();
        int lllllllllllllllIIIllllIlllllIllI = lllllllllllllllIIIllllIlllllIlll.length;
        int lllllllllllllllIIIllllIlllllIlIl = lIIIIIIIlllII[1];
        while (SquireMoonsOfPeril.lIIlIllIlllllll(lllllllllllllllIIIllllIlllllIlIl, lllllllllllllllIIIllllIlllllIllI)) {
            char lllllllllllllllIIIlllllIIIIIIIlI = lllllllllllllllIIIllllIlllllIlll[lllllllllllllllIIIllllIlllllIlIl];
            lllllllllllllllIIIllllIlllllllll.append((char)(lllllllllllllllIIIlllllIIIIIIIlI ^ lllllllllllllllIIIllllIllllllllI[lllllllllllllllIIIllllIlllllllIl % lllllllllllllllIIIllllIllllllllI.length]));
            0;
            ++lllllllllllllllIIIllllIlllllllIl;
            ++lllllllllllllllIIIllllIlllllIlIl;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIllllIlllllllll);
    }

    static {
        SquireMoonsOfPeril.lIIlIllIllllIll();
        SquireMoonsOfPeril.lIIlIllIllllIlI();
        f = lIIIIIIIllIll[lIIIIIIIlllII[4]];
        i = System.currentTimeMillis();
        j = new LinkedHashSet<WorldPoint>();
    }

    @Provides
    SquireMoonsOfPerilConfig a(ConfigManager configManager) {
        return (SquireMoonsOfPerilConfig)configManager.getConfig(SquireMoonsOfPerilConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIIIIIIlllII[0]];
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[1]] = g.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[2]] = c.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[3]] = b.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[4]] = d.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[5]] = e.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[6]] = i.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[7]] = h.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[8]] = k.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[9]] = j.class;
        classArray[SquireMoonsOfPeril.lIIIIIIIlllII[10]] = f.class;
        return classArray;
    }

    private static boolean lIIlIllIlllllII(int n) {
        return n == 0;
    }

    private static boolean lIIlIllIlllllIl(int n) {
        return n != 0;
    }

    private static void lIIlIllIllllIll() {
        lIIIIIIIlllII = new int[13];
        SquireMoonsOfPeril.lIIIIIIIlllII[0] = 0x35 ^ 0x3F;
        SquireMoonsOfPeril.lIIIIIIIlllII[1] = (59 + 180 - 67 + 48 ^ 58 + 123 - 168 + 128) & (0x40 ^ 0x1C ^ (0x1E ^ 0x13) ^ -1);
        SquireMoonsOfPeril.lIIIIIIIlllII[2] = 1;
        SquireMoonsOfPeril.lIIIIIIIlllII[3] = 2;
        SquireMoonsOfPeril.lIIIIIIIlllII[4] = 3;
        SquireMoonsOfPeril.lIIIIIIIlllII[5] = 0x75 ^ 0x71;
        SquireMoonsOfPeril.lIIIIIIIlllII[6] = 70 + 172 - 144 + 81 ^ 11 + 174 - 138 + 135;
        SquireMoonsOfPeril.lIIIIIIIlllII[7] = 0x6D ^ 0x44 ^ (0x8C ^ 0xA3);
        SquireMoonsOfPeril.lIIIIIIIlllII[8] = 0x90 ^ 0xA6 ^ (0x9F ^ 0xAE);
        SquireMoonsOfPeril.lIIIIIIIlllII[9] = 0x7F ^ 0x77;
        SquireMoonsOfPeril.lIIIIIIIlllII[10] = 0xA4 ^ 0x91 ^ (0xAB ^ 0x97);
        SquireMoonsOfPeril.lIIIIIIIlllII[11] = -(0xFFFFFBE9 & 0x7C3F) & (0xFFFFFDFE & 0x7FF9);
        SquireMoonsOfPeril.lIIIIIIIlllII[12] = -(0xFFFFFBD7 & 0x466D) & (0xFFFFEFEC & 0x77F7);
    }

    private static boolean lIIlIllIllllllI(Object object) {
        return object != null;
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireMoonsOfPeril.lIIlIllIlllllIl(chatMessage.getMessage().contains(lIIIIIIIllIll[lIIIIIIIlllII[3]]) ? 1 : 0)) {
            h += lIIIIIIIlllII[2];
        }
    }
}

