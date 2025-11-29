/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.zammy;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.zammy.SquireZammyConfig;
import gg.squire.zammy.overlay.ZammyInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.A;
import m.e.a.i.z.m.r.-.q.s.y.u.B;
import m.e.a.i.z.m.r.-.q.s.y.u.C;
import m.e.a.i.z.m.r.-.q.s.y.u.D;
import m.e.a.i.z.m.r.-.q.s.y.u.E;
import m.e.a.i.z.m.r.-.q.s.y.u.k;
import m.e.a.i.z.m.r.-.q.s.y.u.l;
import m.e.a.i.z.m.r.-.q.s.y.u.n;
import m.e.a.i.z.m.r.-.q.s.y.u.o;
import m.e.a.i.z.m.r.-.q.s.y.u.p;
import m.e.a.i.z.m.r.-.q.s.y.u.q;
import m.e.a.i.z.m.r.-.q.s.y.u.r;
import m.e.a.i.z.m.r.-.q.s.y.u.s;
import m.e.a.i.z.m.r.-.q.s.y.u.t;
import m.e.a.i.z.m.r.-.q.s.y.u.u;
import m.e.a.i.z.m.r.-.q.s.y.u.v;
import m.e.a.i.z.m.r.-.q.s.y.u.w;
import m.e.a.i.z.m.r.-.q.s.y.u.x;
import m.e.a.i.z.m.r.-.q.s.y.u.y;
import m.e.a.i.z.m.r.-.q.s.y.u.z;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Equipment;

@PluginDescriptor(name="Squire Zammy", enabledByDefault=false)
public class SquireZammy
extends SquirePlugin {
    @Inject
    private /* synthetic */ l d;
    @Inject
    private /* synthetic */ k e;
    private static /* synthetic */ int[] lIllIIIllIIII;
    @Inject
    private /* synthetic */ EventBus c;
    @Inject
    private /* synthetic */ ZammyInfoBox b;
    private static /* synthetic */ String[] lIllIIIlIlllI;
    @Inject
    private /* synthetic */ OverlayManager a;
    @Inject
    private /* synthetic */ ConfigManager f;

    private static boolean llIIIlIlIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIlIlIIIlIII(String llllllllllllllIllIIlIllIlllIllll, String llllllllllllllIllIIlIllIllllIIII) {
        try {
            SecretKeySpec llllllllllllllIllIIlIllIllllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIllIllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIllIllllIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIllIllllIIll.init(lIllIIIllIIII[3], llllllllllllllIllIIlIllIllllIlII);
            return new String(llllllllllllllIllIIlIllIllllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIllIlllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIllIllllIIlI) {
            llllllllllllllIllIIlIllIllllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIlIIlIIIl(int n2) {
        return n2 == 0;
    }

    private static String llIIIlIlIIIIlll(String llllllllllllllIllIIlIllIlllIIIIl, String llllllllllllllIllIIlIllIllIllIll) {
        llllllllllllllIllIIlIllIlllIIIIl = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIllIlllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIllIllIlllll = new StringBuilder();
        char[] llllllllllllllIllIIlIllIllIllllI = llllllllllllllIllIIlIllIllIllIll.toCharArray();
        int llllllllllllllIllIIlIllIllIlllIl = lIllIIIllIIII[1];
        char[] llllllllllllllIllIIlIllIllIlIlll = llllllllllllllIllIIlIllIlllIIIIl.toCharArray();
        int llllllllllllllIllIIlIllIllIlIllI = llllllllllllllIllIIlIllIllIlIlll.length;
        int llllllllllllllIllIIlIllIllIlIlIl = lIllIIIllIIII[1];
        while (SquireZammy.llIIIlIlIIlIIlI(llllllllllllllIllIIlIllIllIlIlIl, llllllllllllllIllIIlIllIllIlIllI)) {
            char llllllllllllllIllIIlIllIlllIIIlI = llllllllllllllIllIIlIllIllIlIlll[llllllllllllllIllIIlIllIllIlIlIl];
            llllllllllllllIllIIlIllIllIlllll.append((char)(llllllllllllllIllIIlIllIlllIIIlI ^ llllllllllllllIllIIlIllIllIllllI[llllllllllllllIllIIlIllIllIlllIl % llllllllllllllIllIIlIllIllIllllI.length]));
            "".length();
            ++llllllllllllllIllIIlIllIllIlllIl;
            ++llllllllllllllIllIIlIllIllIlIlIl;
            "".length();
            if ("  ".length() != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIIlIllIllIlllll);
    }

    @Provides
    SquireZammyConfig a(ConfigManager configManager) {
        return (SquireZammyConfig)configManager.getConfig(SquireZammyConfig.class);
    }

    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        if (SquireZammy.llIIIlIlIIlIIIl(configButtonClicked.getGroup().equals(lIllIIIlIlllI[lIllIIIllIIII[1]]) ? 1 : 0)) {
            return;
        }
        String string = configButtonClicked.getKey();
        String string2 = string.replace(lIllIIIlIlllI[lIllIIIllIIII[2]], lIllIIIlIlllI[lIllIIIllIIII[3]]);
        String string3 = Equipment.getAll().stream().map(item -> item.getId() + ",").collect(Collectors.joining());
        this.f.setConfiguration(configButtonClicked.getGroup(), string2, string3);
    }

    protected void onStop() {
        this.c.unregister((Object)this.d);
        this.c.unregister((Object)this.e);
        this.a.remove((Overlay)this.b);
        "".length();
    }

    protected void onStart() {
        this.c.register((Object)this.d);
        this.c.register((Object)this.e);
        this.a.add((Overlay)this.b);
        "".length();
    }

    static {
        SquireZammy.llIIIlIlIIlIIII();
        SquireZammy.llIIIlIlIIIlIIl();
    }

    private static void llIIIlIlIIIlIIl() {
        lIllIIIlIlllI = new String[lIllIIIllIIII[4]];
        SquireZammy.lIllIIIlIlllI[SquireZammy.lIllIIIllIIII[1]] = SquireZammy.llIIIlIlIIIIlll("FT0eEwgDNgoXFx8=", "fLkzz");
        SquireZammy.lIllIIIlIlllI[SquireZammy.lIllIIIllIIII[2]] = SquireZammy.llIIIlIlIIIIlll("QxoiCQ8=", "myMyv");
        SquireZammy.lIllIIIlIlllI[SquireZammy.lIllIIIllIIII[3]] = SquireZammy.llIIIlIlIIIlIII("0+MPLRmxb1Y=", "Hksjk");
    }

    private static void llIIIlIlIIlIIII() {
        lIllIIIllIIII = new int[19];
        SquireZammy.lIllIIIllIIII[0] = 89 + 108 - 79 + 57 ^ 50 + 169 - 182 + 152;
        SquireZammy.lIllIIIllIIII[1] = (0x95 ^ 0xAA) & ~(0x35 ^ 0xA);
        SquireZammy.lIllIIIllIIII[2] = " ".length();
        SquireZammy.lIllIIIllIIII[3] = "  ".length();
        SquireZammy.lIllIIIllIIII[4] = "   ".length();
        SquireZammy.lIllIIIllIIII[5] = 0x46 ^ 0x42;
        SquireZammy.lIllIIIllIIII[6] = 0x1B ^ 0x53 ^ (0x47 ^ 0xA);
        SquireZammy.lIllIIIllIIII[7] = 0x25 ^ 0x23;
        SquireZammy.lIllIIIllIIII[8] = 0x97 ^ 0x90;
        SquireZammy.lIllIIIllIIII[9] = 0xF7 ^ 0xAF ^ (0xF3 ^ 0xA3);
        SquireZammy.lIllIIIllIIII[10] = 0xAD ^ 0xA4;
        SquireZammy.lIllIIIllIIII[11] = 0x6A ^ 0x60;
        SquireZammy.lIllIIIllIIII[12] = 0xC9 ^ 0xA1 ^ (0x5D ^ 0x3E);
        SquireZammy.lIllIIIllIIII[13] = 2 ^ 0xE;
        SquireZammy.lIllIIIllIIII[14] = 0x39 ^ 0x34;
        SquireZammy.lIllIIIllIIII[15] = 0x31 ^ 0x5B ^ (0xE2 ^ 0x86);
        SquireZammy.lIllIIIllIIII[16] = 0x7F ^ 0x56 ^ (0x10 ^ 0x36);
        SquireZammy.lIllIIIllIIII[17] = 54 + 25 - -68 + 22 ^ 111 + 128 - 228 + 174;
        SquireZammy.lIllIIIllIIII[18] = 36 + 98 - 72 + 107 ^ 183 + 176 - 213 + 38;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIllIIIllIIII[0]];
        classArray[SquireZammy.lIllIIIllIIII[1]] = B.class;
        classArray[SquireZammy.lIllIIIllIIII[2]] = o.class;
        classArray[SquireZammy.lIllIIIllIIII[3]] = u.class;
        classArray[SquireZammy.lIllIIIllIIII[4]] = s.class;
        classArray[SquireZammy.lIllIIIllIIII[5]] = q.class;
        classArray[SquireZammy.lIllIIIllIIII[6]] = v.class;
        classArray[SquireZammy.lIllIIIllIIII[7]] = D.class;
        classArray[SquireZammy.lIllIIIllIIII[8]] = C.class;
        classArray[SquireZammy.lIllIIIllIIII[9]] = n.class;
        classArray[SquireZammy.lIllIIIllIIII[10]] = r.class;
        classArray[SquireZammy.lIllIIIllIIII[11]] = A.class;
        classArray[SquireZammy.lIllIIIllIIII[12]] = E.class;
        classArray[SquireZammy.lIllIIIllIIII[13]] = p.class;
        classArray[SquireZammy.lIllIIIllIIII[14]] = x.class;
        classArray[SquireZammy.lIllIIIllIIII[15]] = w.class;
        classArray[SquireZammy.lIllIIIllIIII[16]] = y.class;
        classArray[SquireZammy.lIllIIIllIIII[17]] = z.class;
        classArray[SquireZammy.lIllIIIllIIII[18]] = t.class;
        return classArray;
    }
}

