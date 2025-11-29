package gg.squire.vardorvis;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.vardorvis.overlay.SquireVardorvisBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashSet;
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
import net.runelite.client.ui.overlay.OverlayManager;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.A;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.B;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.C;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.C0001b;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.C0004e;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.D;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.F;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.G;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.H;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.m;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.n;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.o;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.p;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.r;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.s;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.t;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.u;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.v;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.w;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.x;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.y;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.p000.e.z;
@PluginDescriptor(name = "Squire Vardorvis", description = "Squire Vardorvis", enabledByDefault = false, tags = {"vardorvis", "dt2", "desert", "treasure"})
/* loaded from: 861c713a-2076-4f84-9c7c-f1dff7263a11.jar:gg/squire/vardorvis/SquireVardorvis.class */
public class SquireVardorvis extends SquirePlugin {
    @Inject
    private /* synthetic */ SquireVardorvisConfig n;
    private static /* synthetic */ int[] lIlIlIIlllIIl;
    @Inject
    private /* synthetic */ SquireVardorvisBox j;
    /* synthetic */ int e;
    @Inject
    private /* synthetic */ EventBus h;
    @Inject
    private /* synthetic */ C0001b m;
    @Inject
    private /* synthetic */ m k;
    private static /* synthetic */ String[] lIlIlIIlllIII;
    @Inject
    private /* synthetic */ OverlayManager i;
    @Inject
    private /* synthetic */ C0004e l;
    /* synthetic */ boolean d;
    private final /* synthetic */ HashSet<Prayer> a = new HashSet<>();
    /* synthetic */ boolean b = lIlIlIIlllIIl[0];
    /* synthetic */ List<WorldPoint> c = new ArrayList();
    /* synthetic */ boolean f = lIlIlIIlllIIl[1];
    /* synthetic */ boolean g = lIlIlIIlllIIl[1];

    protected void onStop() {
        this.h.unregister(this.l);
        this.h.unregister(this.m);
        this.i.remove(this.j);
        "".length();
        this.i.remove(this.k);
        "".length();
    }

    public void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    protected void onStart() {
        this.h.register(this.l);
        this.l.x();
        this.h.register(this.m);
        this.m.x();
        this.i.add(this.j);
        "".length();
        this.i.add(this.k);
        "".length();
        this.e = lIlIlIIlllIIl[1];
        this.f = this.n.bankOnStart();
        this.g = lIlIlIIlllIIl[1];
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIlIlIIlllIIl[2]];
        clsArr[lIlIlIIlllIIl[1]] = r.class;
        clsArr[lIlIlIIlllIIl[0]] = s.class;
        clsArr[lIlIlIIlllIIl[3]] = t.class;
        clsArr[lIlIlIIlllIIl[4]] = s.class;
        clsArr[lIlIlIIlllIIl[5]] = A.class;
        clsArr[lIlIlIIlllIIl[6]] = v.class;
        clsArr[lIlIlIIlllIIl[7]] = w.class;
        clsArr[lIlIlIIlllIIl[8]] = u.class;
        clsArr[lIlIlIIlllIIl[9]] = D.class;
        clsArr[lIlIlIIlllIIl[10]] = p.class;
        clsArr[lIlIlIIlllIIl[11]] = C.class;
        clsArr[lIlIlIIlllIIl[12]] = z.class;
        clsArr[lIlIlIIlllIIl[13]] = B.class;
        clsArr[lIlIlIIlllIIl[14]] = o.class;
        clsArr[lIlIlIIlllIIl[15]] = x.class;
        clsArr[lIlIlIIlllIIl[16]] = y.class;
        clsArr[lIlIlIIlllIIl[17]] = n.class;
        clsArr[lIlIlIIlllIIl[18]] = F.class;
        clsArr[lIlIlIIlllIIl[19]] = G.class;
        clsArr[lIlIlIIlllIIl[20]] = H.class;
        return clsArr;
    }

    public void a() {
        this.e += lIlIlIIlllIIl[0];
    }

    private static String lIlllllIIIlIlIl(String llllllllllllllIllIlIlllIIlIIIlIl, String llllllllllllllIllIlIlllIIlIIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlIIlllIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlllIIlIIIllI) {
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

    public C0004e j() {
        return this.l;
    }

    private static void lIlllllIIIlIllI() {
        lIlIlIIlllIII = new String[lIlIlIIlllIIl[0]];
        lIlIlIIlllIII[lIlIlIIlllIIl[1]] = lIlllllIIIlIlIl("oeR24HV5i4AdUuaoJ8Q1k+YQmVnSEyPs", "dMKTa");
    }

    public C0001b k() {
        return this.m;
    }

    public boolean d() {
        return this.b;
    }

    private static boolean lIlllllIIIllIII(int i) {
        return i != 0;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlllllIIIllIII(chatMessage.getMessage().contains(lIlIlIIlllIII[lIlIlIIlllIIl[1]]) ? 1 : 0)) {
            d((boolean) lIlIlIIlllIIl[0]);
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
        for (WorldArea worldArea : list) {
            this.c.addAll(worldArea.toWorldPointList());
            "".length();
            "".length();
            if (((((122 + 172) - 166) + 64) ^ (((156 + 137) - 219) + 122)) != ((((56 + 47) - 8) + 35) ^ (((15 + 36) - 23) + 106))) {
                return;
            }
        }
    }

    static {
        lIlllllIIIlIlll();
        lIlllllIIIlIllI();
    }

    public void a(boolean z) {
        this.b = z;
    }

    @Provides
    SquireVardorvisConfig a(ConfigManager configManager) {
        return (SquireVardorvisConfig) configManager.getConfig(SquireVardorvisConfig.class);
    }

    public void c(List<WorldPoint> list) {
        this.c.addAll(list);
        "".length();
    }

    public void d(List<WorldPoint> list) {
        list.forEach(worldPoint -> {
            if (lIlllllIIIllIII(this.c.contains(worldPoint) ? 1 : 0)) {
                this.c.remove(worldPoint);
                "".length();
            }
        });
    }

    public void b(boolean z) {
        this.d = z;
    }

    public void a(int i) {
        this.e = i;
    }

    public void b(WorldArea worldArea) {
        worldArea.toWorldPointList().forEach(worldPoint -> {
            if (lIlllllIIIllIII(this.c.contains(worldPoint) ? 1 : 0)) {
                this.c.remove(worldPoint);
                "".length();
            }
        });
    }

    public void c(boolean z) {
        this.f = z;
    }

    public void a(WorldArea worldArea) {
        this.c.addAll(worldArea.toWorldPointList());
        "".length();
    }

    public void b() {
        this.c.clear();
    }

    public void b(List<WorldArea> list) {
        for (WorldArea worldArea : list) {
            this.c.addAll(worldArea.toWorldPointList());
            "".length();
            "".length();
            if ((-" ".length()) != (-" ".length())) {
                return;
            }
        }
    }

    public List<WorldPoint> e() {
        return this.c;
    }

    private static void lIlllllIIIlIlll() {
        lIlIlIIlllIIl = new int[21];
        lIlIlIIlllIIl[0] = " ".length();
        lIlIlIIlllIIl[1] = ((((73 + 179) - 65) + 12) ^ (((51 + 109) - 58) + 49)) & (((74 ^ 64) ^ (79 ^ 21)) ^ (-" ".length()));
        lIlIlIIlllIIl[2] = 111 ^ 123;
        lIlIlIIlllIIl[3] = "  ".length();
        lIlIlIIlllIIl[4] = "   ".length();
        lIlIlIIlllIIl[5] = (108 ^ 12) ^ (167 ^ 195);
        lIlIlIIlllIIl[6] = (87 ^ 31) ^ (70 ^ 11);
        lIlIlIIlllIIl[7] = (253 ^ 196) ^ (92 ^ 99);
        lIlIlIIlllIIl[8] = (224 ^ 181) ^ (255 ^ 173);
        lIlIlIIlllIIl[9] = (((6 + 131) - 129) + 159) ^ (((114 + 3) - 74) + 132);
        lIlIlIIlllIIl[10] = 12 ^ 5;
        lIlIlIIlllIIl[11] = (((29 + 30) - 48) + 144) ^ (((82 + 85) - 32) + 10);
        lIlIlIIlllIIl[12] = (((104 + 48) - 74) + 78) ^ (((60 + 51) - 104) + 144);
        lIlIlIIlllIIl[13] = (158 ^ 146) ^ ((196 ^ 192) & ((133 ^ 129) ^ (-1)));
        lIlIlIIlllIIl[14] = 120 ^ 117;
        lIlIlIIlllIIl[15] = 72 ^ 70;
        lIlIlIIlllIIl[16] = 83 ^ 92;
        lIlIlIIlllIIl[17] = (251 ^ 185) ^ (240 ^ 162);
        lIlIlIIlllIIl[18] = (13 ^ 95) ^ (55 ^ 116);
        lIlIlIIlllIIl[19] = 152 ^ 138;
        lIlIlIIlllIIl[20] = 71 ^ 84;
    }
}
