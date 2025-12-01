package gg.squire.sepulchre;

import com.google.inject.Inject;
import com.google.inject.Provides;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.C0001b;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.C0003d;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.EnumC0016q;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.M;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.N;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.O;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.P;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.Q;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.R;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.S;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.T;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.U;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.w;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.x;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.y;
import e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.z;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.sepulchre.overlay.SquireSepulchreInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.client.Static;
@PluginDescriptor(name = "Squire Hallowed Sepulchre", description = "Runs laps in Hallowed Sepulchre.", enabledByDefault = false, tags = {"hallowed", "sepulchre", "agility"})
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:gg/squire/sepulchre/SquireSepulchre.class */
public class SquireSepulchre extends SquirePlugin {
    @Inject
    private /* synthetic */ EventBus i;
    private /* synthetic */ InventorySetup g;
    @Inject
    private /* synthetic */ SquireSepulchreConfig m;
    private static /* synthetic */ String[] lllIIIllIIll;
    private static /* synthetic */ int[] lllIIIllIlII;
    @Inject
    private /* synthetic */ M l;
    @Inject
    private /* synthetic */ OverlayManager j;
    @Inject
    private /* synthetic */ C0003d h;
    @Inject
    private /* synthetic */ SquireSepulchreInfoBox k;
    /* synthetic */ int a = lllIIIllIlII[0];
    /* synthetic */ boolean b = lllIIIllIlII[1];
    /* synthetic */ List<WorldPoint> c = new ArrayList();
    /* synthetic */ WorldPoint d = new WorldPoint(lllIIIllIlII[0], lllIIIllIlII[0], lllIIIllIlII[0]);

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ WorldPoint f0e = new WorldPoint(lllIIIllIlII[0], lllIIIllIlII[0], lllIIIllIlII[0]);
    /* synthetic */ List<WorldPoint> f = new ArrayList();
    /* synthetic */ String name = lllIIIllIIll[lllIIIllIlII[0]];

    public boolean e() {
        return this.b;
    }

    public void a(String str) {
        this.name = str;
    }

    private static boolean lIIIlIIlIlllIIl(int i, int i2) {
        return i != i2;
    }

    private void b() {
        j().add(item -> {
            if (!lIIIlIIlIlllIIl(item.getId(), lllIIIllIlII[28]) || lIIIlIIlIlllIlI(item.getId(), lllIIIllIlII[29])) {
                ?? r0 = lllIIIllIlII[1];
                "".length();
                return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIIIllIlII[0];
        }, this.m.stamina());
        "".length();
        y planks = this.m.planks();
        if (lIIIlIIlIllIllI(planks, y.REGULAR_STEEL)) {
            j().add(lllIIIllIlII[9], lllIIIllIlII[7]);
            "".length();
            j().add(lllIIIllIlII[10]);
            "".length();
        }
        if (lIIIlIIlIllIllI(planks, y.OAK_MITHRIL)) {
            j().add(lllIIIllIlII[11], lllIIIllIlII[7]);
            "".length();
            j().add(lllIIIllIlII[12]);
            "".length();
        }
        if (lIIIlIIlIllIllI(planks, y.TEAK_ADAMANT)) {
            j().add(lllIIIllIlII[13], lllIIIllIlII[7]);
            "".length();
            j().add(lllIIIllIlII[14]);
            "".length();
        }
        if (lIIIlIIlIllIllI(planks, y.MAHOGANY_RUNE)) {
            j().add(lllIIIllIlII[15], lllIIIllIlII[7]);
            "".length();
            j().add(lllIIIllIlII[16]);
            "".length();
        }
        w hammer = this.m.hammer();
        if (lIIIlIIlIllIllI(hammer, w.HAMMER)) {
            j().add(lllIIIllIlII[17], lllIIIllIlII[1]);
            "".length();
            j().add(lllIIIllIlII[18], lllIIIllIlII[1]);
            "".length();
        }
        if (lIIIlIIlIllIllI(hammer, w.HALLOWED_HAMMER)) {
            j().add(lllIIIllIlII[19], lllIIIllIlII[1]);
            "".length();
            j().add(lllIIIllIlII[18], lllIIIllIlII[1]);
            "".length();
        }
        j().add(lllIIIllIlII[20], this.m.dust());
        "".length();
        z portal = this.m.portal();
        if (lIIIlIIlIllIlll(portal, z.NONE)) {
            j().add(lllIIIllIlII[21]);
            "".length();
            if (lIIIlIIlIllIllI(portal, z.LV1_ENCHANT)) {
                j().add(lllIIIllIlII[22]);
                "".length();
                "".length();
                if ((((((178 + 125) - 214) + 94) ^ (((143 + 145) - 210) + 68)) & (((((108 + 179) - 204) + 107) ^ (((26 + 6) - (-73)) + 50)) ^ (-" ".length()))) != 0) {
                    return;
                }
            } else if (lIIIlIIlIllIllI(portal, z.LV2_ENCHANT)) {
                j().add(lllIIIllIlII[23]);
                "".length();
                "".length();
                if ("   ".length() > "   ".length()) {
                    return;
                }
            } else if (lIIIlIIlIllIllI(portal, z.LV3_ENCHANT)) {
                j().add(lllIIIllIlII[24]);
                "".length();
                "".length();
                if ((111 ^ 107) <= "   ".length()) {
                    return;
                }
            } else if (lIIIlIIlIllIllI(portal, z.LV4_ENCHANT)) {
                j().add(lllIIIllIlII[25]);
                "".length();
                "".length();
                if ((((((116 + 64) - 61) + 38) ^ (((12 + 124) - 83) + 85)) & (((126 ^ 59) ^ (66 ^ 16)) ^ (-" ".length()))) < (-" ".length())) {
                    return;
                }
            } else if (lIIIlIIlIllIllI(portal, z.LV5_ENCHANT)) {
                j().add(lllIIIllIlII[25]);
                "".length();
                j().add(lllIIIllIlII[22]);
                "".length();
                "".length();
                if (0 != 0) {
                    return;
                }
            } else if (lIIIlIIlIllIllI(portal, z.LV6_ENCHANT)) {
                j().add(lllIIIllIlII[25]);
                "".length();
                j().add(lllIIIllIlII[24]);
                "".length();
            }
        }
        EnumC0016q food = this.m.food();
        if (lIIIlIIlIlllIII(food)) {
            j().add(food.V(), this.m.foodAmount());
            "".length();
        }
        x lockpick = this.m.lockpick();
        if (lIIIlIIlIllIllI(lockpick, x.STRANGE_LOCKPICK)) {
            j().add(lllIIIllIlII[26], lllIIIllIlII[1]);
            "".length();
        }
        if (lIIIlIIlIllIllI(lockpick, x.LOCKPICK)) {
            j().add(lllIIIllIlII[27], lllIIIllIlII[1]);
            "".length();
        }
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        a(new InventorySetup());
        b();
    }

    protected void onStart() {
        this.h.q();
        this.i.register(this.h);
        this.j.add(this.k);
        "".length();
        this.j.add(this.l);
        "".length();
        a(new InventorySetup());
        b();
    }

    private static boolean lIIIlIIlIlllIII(Object obj) {
        return obj != null;
    }

    public void b(WorldPoint worldPoint) {
        this.f0e = worldPoint;
    }

    public List<WorldPoint> i() {
        return this.f;
    }

    public void a(List<WorldArea> list) {
        this.f.clear();
        for (WorldArea worldArea : list) {
            this.f.addAll(worldArea.toWorldPointList());
            "".length();
            "".length();
            if (((103 ^ 83) ^ (119 ^ 71)) <= "   ".length()) {
                return;
            }
        }
    }

    public void b(List<WorldPoint> list) {
        this.c = list;
    }

    public InventorySetup j() {
        return this.g;
    }

    public int c() {
        return Static.getClient().getVarbitValue(C0001b.O);
    }

    public void a(InventorySetup inventorySetup) {
        this.g = inventorySetup;
    }

    static {
        lIIIlIIlIllIIll();
        lIIIlIIlIllIIlI();
    }

    public String getName() {
        return this.name;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lllIIIllIlII[2]];
        clsArr[lllIIIllIlII[0]] = U.class;
        clsArr[lllIIIllIlII[1]] = N.class;
        clsArr[lllIIIllIlII[3]] = R.class;
        clsArr[lllIIIllIlII[4]] = T.class;
        clsArr[lllIIIllIlII[5]] = O.class;
        clsArr[lllIIIllIlII[6]] = P.class;
        clsArr[lllIIIllIlII[7]] = Q.class;
        clsArr[lllIIIllIlII[8]] = S.class;
        return clsArr;
    }

    public WorldPoint g() {
        return this.d;
    }

    private static boolean lIIIlIIlIlllIlI(int i, int i2) {
        return i == i2;
    }

    private static void lIIIlIIlIllIIlI() {
        lllIIIllIIll = new String[lllIIIllIlII[1]];
        lllIIIllIIll[lllIIIllIlII[0]] = lIIIlIIlIllIIIl("YizLrlOiIXo=", "SuSdZ");
    }

    private static String lIIIlIIlIllIIIl(String lllllllllllllllIIllIllIllIIIllIl, String lllllllllllllllIIllIllIllIIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIllIIIllII.getBytes(StandardCharsets.UTF_8)), lllIIIllIlII[2]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIllIlII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIllIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIllIIIlllI) {
            lllllllllllllllIIllIllIllIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIlIllIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    public static WorldPoint a(RegionPoint regionPoint) {
        if (lIIIlIIlIllIlII(regionPoint)) {
            return null;
        }
        WorldPoint world = regionPoint.toWorld();
        Client client = Static.getClient();
        return (WorldPoint) WorldPoint.toLocalInstance(client, world).stream().min(Comparator.comparingInt(worldPoint -> {
            return worldPoint.distanceTo(new WorldPoint(client.getBaseX(), client.getBaseY(), client.getPlane()));
        })).orElse(world);
    }

    @Provides
    SquireSepulchreConfig a(ConfigManager configManager) {
        return (SquireSepulchreConfig) configManager.getConfig(SquireSepulchreConfig.class);
    }

    private static void lIIIlIIlIllIIll() {
        lllIIIllIlII = new int[30];
        lllIIIllIlII[0] = (188 ^ 167) & ((13 ^ 22) ^ (-1));
        lllIIIllIlII[1] = " ".length();
        lllIIIllIlII[2] = 16 ^ 24;
        lllIIIllIlII[3] = "  ".length();
        lllIIIllIlII[4] = "   ".length();
        lllIIIllIlII[5] = 136 ^ 140;
        lllIIIllIlII[6] = 62 ^ 59;
        lllIIIllIlII[7] = (((101 + 104) - 99) + 71) ^ (((138 + 77) - 207) + 175);
        lllIIIllIlII[8] = 106 ^ 109;
        lllIIIllIlII[9] = (-30758) & 31717;
        lllIIIllIlII[10] = (-2477) & 4015;
        lllIIIllIlII[11] = (-19506) & 28283;
        lllIIIllIlII[12] = (-((-9169) & 28666)) & (-8449) & 32767;
        lllIIIllIlII[13] = (-1410) & 10189;
        lllIIIllIlII[14] = (-((-2201) & 3257)) & (-16393) & 22271;
        lllIIIllIlII[15] = (-19745) & 28526;
        lllIIIllIlII[16] = (-((-14033) & 14295)) & (-27649) & 32734;
        lllIIIllIlII[17] = (-17109) & 19455;
        lllIIIllIlII[18] = (-20485) & 29278;
        lllIIIllIlII[19] = (-((-29243) & 30331)) & (-4641) & 30455;
        lllIIIllIlII[20] = (-257) & 3581;
        lllIIIllIlII[21] = (-((-2609) & 23346)) & (-9411) & 30711;
        lllIIIllIlII[22] = (-5393) & 5947;
        lllIIIllIlII[23] = (-((-2253) & 6606)) & (-2113) & 7021;
        lllIIIllIlII[24] = (-((-18465) & 28070)) & (-4113) & 14271;
        lllIIIllIlII[25] = (-((-3629) & 20159)) & (-3329) & 20415;
        lllIIIllIlII[26] = (-3852) & 28591;
        lllIIIllIlII[27] = (-16905) & 18427;
        lllIIIllIlII[28] = (-((-6593) & 8163)) & (-18561) & 32755;
        lllIIIllIlII[29] = (-19497) & 32123;
    }

    private static boolean lIIIlIIlIllIlII(Object obj) {
        return obj == null;
    }

    public WorldPoint h() {
        return this.f0e;
    }

    private static boolean lIIIlIIlIllIlIl(int i) {
        return i != 0;
    }

    public List<WorldPoint> f() {
        return this.c;
    }

    public z a() {
        return this.m.portal();
    }

    public void a(WorldPoint worldPoint) {
        this.d = worldPoint;
    }

    public void a(boolean z) {
        this.b = z;
    }

    private static boolean lIIIlIIlIllIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    public int d() {
        return this.a;
    }

    protected void onStop() {
        this.h.r();
        this.i.unregister(this.h);
        this.j.remove(this.k);
        "".length();
        this.j.remove(this.l);
        "".length();
    }
}
