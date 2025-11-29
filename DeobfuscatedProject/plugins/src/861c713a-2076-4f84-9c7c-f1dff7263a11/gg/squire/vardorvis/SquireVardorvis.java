/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.Prayer
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.vardorvis;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.vardorvis.SquireVardorvisConfig;
import gg.squire.vardorvis.overlay.SquireVardorvisBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.A;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.B;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.C;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.D;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.F;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.G;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.H;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.b;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.m;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.n;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.o;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.p;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.r;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.s;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.t;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.u;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.v;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.w;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.x;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.y;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z;

@PluginDescriptor(name="Squire Vardorvis", description="Squire Vardorvis", enabledByDefault=false, tags={"vardorvis", "dt2", "desert", "treasure"})
public class SquireVardorvis
extends SquirePlugin {
    @Inject
    private /* synthetic */ SquireVardorvisConfig n;
    private static /* synthetic */ int[] lIlIlIIlllIIl;
    /* synthetic */ boolean g;
    @Inject
    private /* synthetic */ SquireVardorvisBox j;
    /* synthetic */ int e;
    @Inject
    private /* synthetic */ EventBus h;
    @Inject
    private /* synthetic */ b m;
    @Inject
    private /* synthetic */ m k;
    /* synthetic */ boolean b;
    /* synthetic */ boolean f;
    private static /* synthetic */ String[] lIlIlIIlllIII;
    @Inject
    private /* synthetic */ OverlayManager i;
    private final /* synthetic */ HashSet<Prayer> a;
    @Inject
    private /* synthetic */ e l;
    /* synthetic */ List<WorldPoint> c;
    /* synthetic */ boolean d;

    protected void onStop() {
        this.h.unregister((Object)this.l);
        this.h.unregister((Object)this.m);
        this.i.remove((Overlay)this.j);
        "".length();
        this.i.remove((Overlay)this.k);
        "".length();
    }

    public SquireVardorvis() {
        this.a = new HashSet();
        this.b = lIlIlIIlllIIl[0];
        this.c = new ArrayList<WorldPoint>();
        this.f = lIlIlIIlllIIl[1];
        this.g = lIlIlIIlllIIl[1];
    }

    public void d(boolean bl) {
        this.g = bl;
    }

    protected void onStart() {
        this.h.register((Object)this.l);
        this.l.x();
        this.h.register((Object)this.m);
        this.m.x();
        this.i.add((Overlay)this.j);
        "".length();
        this.i.add((Overlay)this.k);
        "".length();
        this.e = lIlIlIIlllIIl[1];
        this.f = this.n.bankOnStart();
        this.g = lIlIlIIlllIIl[1];
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIlIIlllIIl[2]];
        classArray[SquireVardorvis.lIlIlIIlllIIl[1]] = r.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[0]] = s.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[3]] = t.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[4]] = s.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[5]] = A.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[6]] = v.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[7]] = w.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[8]] = u.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[9]] = D.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[10]] = p.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[11]] = C.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[12]] = z.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[13]] = B.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[14]] = o.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[15]] = x.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[16]] = y.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[17]] = n.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[18]] = F.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[19]] = G.class;
        classArray[SquireVardorvis.lIlIlIIlllIIl[20]] = H.class;
        return classArray;
    }

    public void a() {
        this.e += lIlIlIIlllIIl[0];
    }

    private static String lIlllllIIIlIlIl(String llllllllllllllIllIlIlllIIlIIIIll, String llllllllllllllIllIlIlllIIlIIIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIlllIIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlllIIlIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlllIIlIIIlll.init(lIlIlIIlllIIl[3], llllllllllllllIllIlIlllIIlIIlIII);
            return new String(llllllllllllllIllIlIlllIIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllIIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlllIIlIIIllI) {
            llllllllllllllIllIlIlllIIlIIIllI.printStackTrace();
            return null;
        }
    }

    public boolean i() {
        return this.g;
    }

    public int g() {
        return this.e;
    }

    public boolean f() {
        return this.d;
    }

    public e j() {
        return this.l;
    }

    private static void lIlllllIIIlIllI() {
        lIlIlIIlllIII = new String[lIlIlIIlllIIl[0]];
        SquireVardorvis.lIlIlIIlllIII[SquireVardorvis.lIlIlIIlllIIl[1]] = SquireVardorvis.lIlllllIIIlIlIl("oeR24HV5i4AdUuaoJ8Q1k+YQmVnSEyPs", "dMKTa");
    }

    public b k() {
        return this.m;
    }

    public boolean d() {
        return this.b;
    }

    private static boolean lIlllllIIIllIII(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        String string = chatMessage.getMessage();
        if (SquireVardorvis.lIlllllIIIllIII(string.contains(lIlIlIIlllIII[lIlIlIIlllIIl[1]]) ? 1 : 0)) {
            this.d(lIlIlIIlllIIl[0]);
            this.l.x();
        }
    }

    public HashSet<Prayer> c() {
        return this.a;
    }

    public boolean h() {
        return this.f;
    }

    public void a(List<WorldArea> list) {
        this.c.clear();
        Iterator<WorldArea> llllllllllllllIllIlIlllIIllIIlII = list.iterator();
        while (SquireVardorvis.lIlllllIIIllIII(llllllllllllllIllIlIlllIIllIIlII.hasNext() ? 1 : 0)) {
            SquireVardorvis llllllllllllllIllIlIlllIIllIIllI;
            WorldArea llllllllllllllIllIlIlllIIllIIIll = llllllllllllllIllIlIlllIIllIIlII.next();
            llllllllllllllIllIlIlllIIllIIllI.c.addAll(llllllllllllllIllIlIlllIIllIIIll.toWorldPointList());
            "".length();
            "".length();
            if ((122 + 172 - 166 + 64 ^ 156 + 137 - 219 + 122) == (56 + 47 - 8 + 35 ^ 15 + 36 - 23 + 106)) continue;
            return;
        }
    }

    static {
        SquireVardorvis.lIlllllIIIlIlll();
        SquireVardorvis.lIlllllIIIlIllI();
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    @Provides
    SquireVardorvisConfig a(ConfigManager configManager) {
        return (SquireVardorvisConfig)configManager.getConfig(SquireVardorvisConfig.class);
    }

    public void c(List<WorldPoint> list) {
        this.c.addAll(list);
        "".length();
    }

    public void d(List<WorldPoint> list) {
        list.forEach(worldPoint -> {
            if (SquireVardorvis.lIlllllIIIllIII(this.c.contains(worldPoint) ? 1 : 0)) {
                this.c.remove(worldPoint);
                "".length();
            }
        });
    }

    public void b(boolean bl) {
        this.d = bl;
    }

    public void a(int n2) {
        this.e = n2;
    }

    public void b(WorldArea worldArea) {
        worldArea.toWorldPointList().forEach(worldPoint -> {
            if (SquireVardorvis.lIlllllIIIllIII(this.c.contains(worldPoint) ? 1 : 0)) {
                this.c.remove(worldPoint);
                "".length();
            }
        });
    }

    public void c(boolean bl) {
        this.f = bl;
    }

    public void a(WorldArea worldArea) {
        this.c.addAll(worldArea.toWorldPointList());
        "".length();
    }

    public void b() {
        this.c.clear();
    }

    public void b(List<WorldArea> list) {
        Iterator<WorldArea> llllllllllllllIllIlIlllIIlIlllII = list.iterator();
        while (SquireVardorvis.lIlllllIIIllIII(llllllllllllllIllIlIlllIIlIlllII.hasNext() ? 1 : 0)) {
            SquireVardorvis llllllllllllllIllIlIlllIIlIllllI;
            WorldArea llllllllllllllIllIlIlllIIlIllIll = llllllllllllllIllIlIlllIIlIlllII.next();
            llllllllllllllIllIlIlllIIlIllllI.c.addAll(llllllllllllllIllIlIlllIIlIllIll.toWorldPointList());
            "".length();
            "".length();
            if (-" ".length() == -" ".length()) continue;
            return;
        }
    }

    public List<WorldPoint> e() {
        return this.c;
    }

    private static void lIlllllIIIlIlll() {
        lIlIlIIlllIIl = new int[21];
        SquireVardorvis.lIlIlIIlllIIl[0] = " ".length();
        SquireVardorvis.lIlIlIIlllIIl[1] = (73 + 179 - 65 + 12 ^ 51 + 109 - 58 + 49) & (0x4A ^ 0x40 ^ (0x4F ^ 0x15) ^ -" ".length());
        SquireVardorvis.lIlIlIIlllIIl[2] = 0x6F ^ 0x7B;
        SquireVardorvis.lIlIlIIlllIIl[3] = "  ".length();
        SquireVardorvis.lIlIlIIlllIIl[4] = "   ".length();
        SquireVardorvis.lIlIlIIlllIIl[5] = 0x6C ^ 0xC ^ (0xA7 ^ 0xC3);
        SquireVardorvis.lIlIlIIlllIIl[6] = 0x57 ^ 0x1F ^ (0x46 ^ 0xB);
        SquireVardorvis.lIlIlIIlllIIl[7] = 0xFD ^ 0xC4 ^ (0x5C ^ 0x63);
        SquireVardorvis.lIlIlIIlllIIl[8] = 0xE0 ^ 0xB5 ^ (0xFF ^ 0xAD);
        SquireVardorvis.lIlIlIIlllIIl[9] = 6 + 131 - 129 + 159 ^ 114 + 3 - 74 + 132;
        SquireVardorvis.lIlIlIIlllIIl[10] = 0xC ^ 5;
        SquireVardorvis.lIlIlIIlllIIl[11] = 29 + 30 - 48 + 144 ^ 82 + 85 - 32 + 10;
        SquireVardorvis.lIlIlIIlllIIl[12] = 104 + 48 - 74 + 78 ^ 60 + 51 - 104 + 144;
        SquireVardorvis.lIlIlIIlllIIl[13] = 0x9E ^ 0x92 ^ (0xC4 ^ 0xC0) & ~(0x85 ^ 0x81);
        SquireVardorvis.lIlIlIIlllIIl[14] = 0x78 ^ 0x75;
        SquireVardorvis.lIlIlIIlllIIl[15] = 0x48 ^ 0x46;
        SquireVardorvis.lIlIlIIlllIIl[16] = 0x53 ^ 0x5C;
        SquireVardorvis.lIlIlIIlllIIl[17] = 0xFB ^ 0xB9 ^ (0xF0 ^ 0xA2);
        SquireVardorvis.lIlIlIIlllIIl[18] = 0xD ^ 0x5F ^ (0x37 ^ 0x74);
        SquireVardorvis.lIlIlIIlllIIl[19] = 0x98 ^ 0x8A;
        SquireVardorvis.lIlIlIIlllIIl[20] = 0x47 ^ 0x54;
    }
}

