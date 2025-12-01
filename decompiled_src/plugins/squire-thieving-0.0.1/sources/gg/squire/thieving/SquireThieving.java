package gg.squire.thieving;

import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.A;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.B;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.C;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.C0008i;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.C0009j;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.C0010k;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.D;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.E;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.EnumC0002c;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.EnumC0003d;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.EnumC0004e;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.EnumC0005f;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.F;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.G;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.H;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.I;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.J;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.K;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.l;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.m;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.n;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.o;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.q;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.r;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.t;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.u;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.v;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.w;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.x;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.y;
import s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e.z;
@PluginDescriptor(name = "Squire Thiever", enabledByDefault = false)
/* loaded from: squire-thieving-0.0.1.jar:gg/squire/thieving/SquireThieving.class */
public class SquireThieving extends SquirePlugin {
    private /* synthetic */ boolean j;
    private /* synthetic */ List<Item> i;
    private static /* synthetic */ int[] lIIllIlllIIlI;
    private /* synthetic */ boolean l;
    @Inject
    private /* synthetic */ ThievingOverlayPanel d;
    @Inject
    private /* synthetic */ SquireThievingConfig e;
    private static /* synthetic */ String[] lIIllIlllIIIl;
    @Inject
    private /* synthetic */ OverlayManager c;
    private static final /* synthetic */ Logger a;
    private /* synthetic */ InventorySetup h;
    private /* synthetic */ int f;
    private /* synthetic */ WorldPoint g;
    private /* synthetic */ boolean k;
    private final /* synthetic */ List<Integer> b;

    protected void onStart() {
        a(lIIllIlllIIlI[38]);
        Player local = Players.getLocal();
        if (lIllIIIllIlIlII(local)) {
            a(local.getWorldLocation());
        }
        this.c.add(this.d);
        "".length();
        a(new InventorySetup());
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    public boolean a(Player player, boolean z) {
        EnumC0002c t;
        String str;
        String str2;
        String str3;
        String str4;
        if (lIllIIIllIlIlII(EnumC0002c.b(player.getWorldLocation()))) {
            t = EnumC0002c.b(player.getWorldLocation());
            "".length();
            if ((((((93 + 60) - 83) + 65) ^ (((13 + 14) - 25) + 143)) & (((82 ^ 37) ^ (66 ^ 35)) ^ (-" ".length()))) == "   ".length()) {
                return ((((102 + 119) - 126) + 35) ^ (((57 + 41) - (-35)) + 13)) & (((199 ^ 147) ^ (47 ^ 107)) ^ (-" ".length()));
            }
        } else {
            t = b().t();
        }
        EnumC0002c enumC0002c = t;
        if (lIllIIIllIllIlI(z ? 1 : 0) && lIllIIIllIllIlI(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        TileObject a2 = a(enumC0002c);
        if (lIllIIIllIlIlII(a2)) {
            String[] strArr = new String[lIIllIlllIIlI[3]];
            int i = lIIllIlllIIlI[1];
            if (lIllIIIllIlIllI(z ? 1 : 0)) {
                str = lIIllIlllIIIl[lIIllIlllIIlI[1]];
                "".length();
                if (" ".length() <= (-" ".length())) {
                    return ((190 ^ 129) ^ (79 ^ 55)) & (((225 ^ 167) ^ " ".length()) ^ (-" ".length()));
                }
            } else {
                str = lIIllIlllIIIl[lIIllIlllIIlI[3]];
            }
            strArr[i] = str;
            if (lIllIIIllIlIllI(a2.hasAction(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIIllIlllIIlI[3]];
                int i2 = lIIllIlllIIlI[1];
                if (lIllIIIllIlIllI(z ? 1 : 0)) {
                    str2 = lIIllIlllIIIl[lIIllIlllIIlI[5]];
                    "".length();
                    if (" ".length() > ((58 ^ 86) ^ (248 ^ 144))) {
                        return ((62 ^ 13) ^ (166 ^ 185)) & (((71 ^ 27) ^ (2 ^ 114)) ^ (-" ".length()));
                    }
                } else {
                    str2 = lIIllIlllIIIl[lIIllIlllIIlI[7]];
                }
                strArr2[i2] = str2;
                if (lIllIIIllIllIlI(a2.hasAction(strArr2) ? 1 : 0)) {
                    String str5 = lIIllIlllIIIl[lIIllIlllIIlI[9]];
                    Object[] objArr = new Object[lIIllIlllIIlI[3]];
                    objArr[lIIllIlllIIlI[1]] = Boolean.valueOf(z);
                    Log.info(str5, objArr);
                    return lIIllIlllIIlI[1];
                }
                String str6 = lIIllIlllIIIl[lIIllIlllIIlI[11]];
                Object[] objArr2 = new Object[lIIllIlllIIlI[5]];
                int i3 = lIIllIlllIIlI[1];
                if (lIllIIIllIlIllI(z ? 1 : 0)) {
                    str3 = lIIllIlllIIIl[lIIllIlllIIlI[13]];
                    "".length();
                    if (((((83 + 35) - 26) + 47) ^ (((86 + 39) - 104) + 122)) <= (-" ".length())) {
                        return ((195 ^ 166) ^ (194 ^ 172)) & (((114 ^ 59) ^ (24 ^ 90)) ^ (-" ".length()));
                    }
                } else {
                    str3 = lIIllIlllIIIl[lIIllIlllIIlI[15]];
                }
                objArr2[i3] = str3;
                objArr2[lIIllIlllIIlI[3]] = Integer.valueOf(a2.getId());
                Log.info(str6, objArr2);
                if (lIllIIIllIlIllI(z ? 1 : 0)) {
                    str4 = lIIllIlllIIIl[lIIllIlllIIlI[17]];
                    "".length();
                    if ((-"  ".length()) > 0) {
                        return "  ".length() & ("  ".length() ^ (-1));
                    }
                } else {
                    str4 = lIIllIlllIIIl[lIIllIlllIIlI[19]];
                }
                a2.interact(str4);
                return lIIllIlllIIlI[3];
            }
        }
        return lIIllIlllIIlI[1];
    }

    public boolean j() {
        return this.k;
    }

    private static boolean lIllIIIllIlIllI(int i) {
        return i != 0;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
        a(new InventorySetup());
        a();
    }

    public InventorySetup g() {
        return this.h;
    }

    private static boolean lIllIIIllIllIll(Object obj) {
        return obj == null;
    }

    static {
        lIllIIIllIlIIll();
        lIllIIIllIlIIlI();
        a = LoggerFactory.getLogger(SquireThieving.class);
    }

    public boolean k() {
        return this.l;
    }

    public TileObject a(EnumC0002c enumC0002c) {
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            return tileObject.getWorldLocation().equals(enumC0002c.s());
        });
        if (lIllIIIllIllIll(nearest)) {
            Log.info(lIIllIlllIIIl[lIIllIlllIIlI[0]]);
            return null;
        }
        return nearest;
    }

    public EnumC0003d c() {
        int level = Skills.getLevel(Skill.THIEVING);
        return lIllIIIllIllIIl(level, EnumC0003d.MENAPHITE.u()) ? EnumC0003d.MENAPHITE : lIllIIIllIllIIl(level, EnumC0003d.BANDIT_56.u()) ? EnumC0003d.BANDIT_56 : EnumC0003d.BANDIT_41;
    }

    private static void lIllIIIllIlIIll() {
        lIIllIlllIIlI = new int[43];
        lIIllIlllIIlI[0] = (100 ^ 112) ^ (168 ^ 182);
        lIIllIlllIIlI[1] = (106 ^ 56) & ((94 ^ 12) ^ (-1));
        lIIllIlllIIlI[2] = (-((-13425) & 15481)) & (-17409) & 32255;
        lIIllIlllIIlI[3] = " ".length();
        lIIllIlllIIlI[4] = (-5481) & 32761;
        lIIllIlllIIlI[5] = "  ".length();
        lIIllIlllIIlI[6] = (-339) & 895;
        lIIllIlllIIlI[7] = "   ".length();
        lIIllIlllIIlI[8] = (-7510) & 8063;
        lIIllIlllIIlI[9] = (((6 + 93) - 81) + 153) ^ (((109 + 135) - 148) + 79);
        lIIllIlllIIlI[10] = (-10371) & 10934;
        lIIllIlllIIlI[11] = (99 ^ 52) ^ (71 ^ 21);
        lIIllIlllIIlI[12] = (-((-14703) & 32239)) & (-8198) & 30431;
        lIIllIlllIIlI[13] = (3 ^ 67) ^ (46 ^ 104);
        lIIllIlllIIlI[14] = (-26661) & 31359;
        lIIllIlllIIlI[15] = 39 ^ 32;
        lIIllIlllIIlI[16] = (-27682) & 32377;
        lIIllIlllIIlI[17] = (61 ^ 86) ^ (160 ^ 195);
        lIIllIlllIIlI[18] = (-24873) & 29566;
        lIIllIlllIIlI[19] = (127 ^ 66) ^ (24 ^ 44);
        lIIllIlllIIlI[20] = (-((-4873) & 6061)) & (-259) & 6143;
        lIIllIlllIIlI[21] = (123 ^ 49) ^ (193 ^ 144);
        lIIllIlllIIlI[22] = (24 ^ 55) ^ (157 ^ 185);
        lIIllIlllIIlI[23] = (243 ^ 191) ^ (201 ^ 137);
        lIIllIlllIIlI[24] = 119 ^ 122;
        lIIllIlllIIlI[25] = 31 ^ 17;
        lIIllIlllIIlI[26] = (((163 + 45) - 135) + 93) ^ (((151 + 117) - 165) + 66);
        lIIllIlllIIlI[27] = (((49 + 58) - (-43)) + 4) ^ (((45 + 14) - 34) + 113);
        lIIllIlllIIlI[28] = (11 ^ 99) ^ (39 ^ 94);
        lIIllIlllIIlI[29] = 64 ^ 82;
        lIIllIlllIIlI[30] = 141 ^ 158;
        lIIllIlllIIlI[31] = (((104 + 5) - 45) + 147) ^ (((133 + 17) - 27) + 76);
        lIIllIlllIIlI[32] = 56 ^ 45;
        lIIllIlllIIlI[33] = (154 ^ 176) ^ (104 ^ 84);
        lIIllIlllIIlI[34] = 157 ^ 138;
        lIIllIlllIIlI[35] = 7 ^ 31;
        lIIllIlllIIlI[36] = (((21 + 85) - 46) + 79) ^ (((49 + 60) - 92) + 129);
        lIIllIlllIIlI[37] = 160 ^ 186;
        lIIllIlllIIlI[38] = -" ".length();
        lIIllIlllIIlI[39] = (-((-4001) & 28587)) & (-2113) & 32255;
        lIIllIlllIIlI[40] = (-581) & 6133;
        lIIllIlllIIlI[41] = (-8257) & 13811;
        lIIllIlllIIlI[42] = (-9545) & 30687;
    }

    protected void onStop() {
        this.c.remove(this.d);
        "".length();
        a((InventorySetup) null);
        a((List<Item>) null);
    }

    private static boolean lIllIIIllIllIIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    public SquireThieving() {
        Integer[] numArr = new Integer[lIIllIlllIIlI[0]];
        numArr[lIIllIlllIIlI[1]] = Integer.valueOf(lIIllIlllIIlI[2]);
        numArr[lIIllIlllIIlI[3]] = Integer.valueOf(lIIllIlllIIlI[4]);
        numArr[lIIllIlllIIlI[5]] = Integer.valueOf(lIIllIlllIIlI[6]);
        numArr[lIIllIlllIIlI[7]] = Integer.valueOf(lIIllIlllIIlI[8]);
        numArr[lIIllIlllIIlI[9]] = Integer.valueOf(lIIllIlllIIlI[10]);
        numArr[lIIllIlllIIlI[11]] = Integer.valueOf(lIIllIlllIIlI[12]);
        numArr[lIIllIlllIIlI[13]] = Integer.valueOf(lIIllIlllIIlI[14]);
        numArr[lIIllIlllIIlI[15]] = Integer.valueOf(lIIllIlllIIlI[16]);
        numArr[lIIllIlllIIlI[17]] = Integer.valueOf(lIIllIlllIIlI[18]);
        numArr[lIIllIlllIIlI[19]] = Integer.valueOf(lIIllIlllIIlI[20]);
        this.b = (List) Stream.of((Object[]) numArr).collect(Collectors.toList());
        this.f = lIIllIlllIIlI[1];
        this.l = lIIllIlllIIlI[1];
    }

    private static String lIllIIIllIIllll(String llllllllllllllIlllIlllIIlIllllII, String llllllllllllllIlllIlllIIlIlllIll) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIIlIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIlIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIIlIlllllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIIlIlllllI.init(lIIllIlllIIlI[5], llllllllllllllIlllIlllIIlIllllll);
            return new String(llllllllllllllIlllIlllIIlIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIIlIllllIl) {
            llllllllllllllIlllIlllIIlIllllIl.printStackTrace();
            return null;
        }
    }

    public void a(boolean z) {
        this.j = z;
    }

    public void b(boolean z) {
        this.k = z;
    }

    public void a(List<Item> list) {
        this.i = list;
    }

    public WorldPoint f() {
        return this.g;
    }

    public void a(int i) {
        this.f = i;
    }

    public List<Item> h() {
        return this.i;
    }

    public void a(WorldPoint worldPoint) {
        this.g = worldPoint;
    }

    private static boolean lIllIIIllIlllII(int i, int i2) {
        return i < i2;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIllIlllIIlI[21]];
        clsArr[lIIllIlllIIlI[1]] = F.class;
        clsArr[lIIllIlllIIlI[3]] = C.class;
        clsArr[lIIllIlllIIlI[5]] = D.class;
        clsArr[lIIllIlllIIlI[7]] = H.class;
        clsArr[lIIllIlllIIlI[9]] = G.class;
        clsArr[lIIllIlllIIlI[11]] = x.class;
        clsArr[lIIllIlllIIlI[13]] = y.class;
        clsArr[lIIllIlllIIlI[15]] = z.class;
        clsArr[lIIllIlllIIlI[17]] = B.class;
        clsArr[lIIllIlllIIlI[19]] = E.class;
        clsArr[lIIllIlllIIlI[0]] = A.class;
        clsArr[lIIllIlllIIlI[22]] = C0010k.class;
        clsArr[lIIllIlllIIlI[23]] = o.class;
        clsArr[lIIllIlllIIlI[24]] = r.class;
        clsArr[lIIllIlllIIlI[25]] = l.class;
        clsArr[lIIllIlllIIlI[26]] = n.class;
        clsArr[lIIllIlllIIlI[27]] = m.class;
        clsArr[lIIllIlllIIlI[28]] = q.class;
        clsArr[lIIllIlllIIlI[29]] = t.class;
        clsArr[lIIllIlllIIlI[30]] = v.class;
        clsArr[lIIllIlllIIlI[31]] = w.class;
        clsArr[lIIllIlllIIlI[32]] = u.class;
        clsArr[lIIllIlllIIlI[33]] = C0008i.class;
        clsArr[lIIllIlllIIlI[34]] = C0009j.class;
        clsArr[lIIllIlllIIlI[35]] = K.class;
        clsArr[lIIllIlllIIlI[36]] = J.class;
        clsArr[lIIllIlllIIlI[37]] = I.class;
        return clsArr;
    }

    private static String lIllIIIllIlIIII(String llllllllllllllIlllIlllIIlIIlIlll, String llllllllllllllIlllIlllIIlIIlIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIIlIIlIllI.getBytes(StandardCharsets.UTF_8)), lIIllIlllIIlI[17]), "DES");
            Cipher llllllllllllllIlllIlllIIlIIllIIl = Cipher.getInstance("DES");
            llllllllllllllIlllIlllIIlIIllIIl.init(lIIllIlllIIlI[5], secretKeySpec);
            return new String(llllllllllllllIlllIlllIIlIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIIlIIllIII) {
            llllllllllllllIlllIlllIIlIIllIII.printStackTrace();
            return null;
        }
    }

    public List<Integer> d() {
        return this.b;
    }

    private static boolean lIllIIIllIlIlII(Object obj) {
        return obj != null;
    }

    private static void lIllIIIllIlIIlI() {
        lIIllIlllIIIl = new String[lIIllIlllIIlI[28]];
        lIIllIlllIIIl[lIIllIlllIIlI[1]] = lIllIIIllIIllll("cmbPilvDoZw=", "QIijE");
        lIIllIlllIIIl[lIIllIlllIIlI[3]] = lIllIIIllIlIIII("X8K+PPcwi0U=", "RBPjr");
        lIIllIlllIIIl[lIIllIlllIIlI[5]] = lIllIIIllIlIIIl("JwYABw==", "hveiy");
        lIIllIlllIIIl[lIIllIlllIIlI[7]] = lIllIIIllIIllll("FELBFsTNpRA=", "cnkIN");
        lIIllIlllIIIl[lIIllIlllIIlI[9]] = lIllIIIllIlIIIl("Dw0YEAUlFkoADSgWTRBEJBkcAUQ4EA9EFiUfAhBELRseDQsiVkoLFCkWUEQfMQ==", "Lxjdd");
        lIIllIlllIIIl[lIIllIlllIIlI[11]] = lIllIIIllIIllll("xML+ZHHAW57ScGl4PGyi8tNcUBFMGOK0beLxQ61L5JI=", "vYmiM");
        lIIllIlllIIIl[lIIllIlllIIlI[13]] = lIllIIIllIlIIIl("Fyk2ORg2Pg==", "XYSWq");
        lIIllIlllIIIl[lIIllIlllIIlI[15]] = lIllIIIllIIllll("6N5CL5M6V4U=", "sReJZ");
        lIIllIlllIIIl[lIIllIlllIIlI[17]] = lIllIIIllIIllll("Qpx/SqhjHa0=", "VFIQc");
        lIIllIlllIIIl[lIIllIlllIIlI[19]] = lIllIIIllIlIIII("LD0xPP6AIdk=", "jUYZC");
        lIIllIlllIIIl[lIIllIlllIIlI[0]] = lIllIIIllIIllll("qQgQZeMbCvRXfQOVB/31sELEqOGPO5gvvJmwE7L4CsIb58BH9AI16Q==", "lUGXa");
        lIIllIlllIIIl[lIIllIlllIIlI[22]] = lIllIIIllIlIIIl("Kj8YEToDPUwGPB8oCQYnTTkZFycMMwJFNQIoTA08GCkJX3MWJ0BFPB0/AgQxAT9WRSgQ", "mZleS");
        lIIllIlllIIIl[lIIllIlllIIlI[23]] = lIllIIIllIlIIIl("MjccFhAffx1aEhg2DVobBCpJGQEDLAgTGgJ4MhUCFCoFFRUVPQ0n", "qXizt");
        lIIllIlllIIIl[lIIllIlllIIlI[24]] = lIllIIIllIlIIII("DyYnq41tfds=", "lFmNT");
        lIIllIlllIIIl[lIIllIlllIIlI[25]] = lIllIIIllIlIIII("c3oWBHo0R9Y=", "LlIIv");
        lIIllIlllIIIl[lIIllIlllIIlI[26]] = lIllIIIllIlIIIl("FTYdPWwEPAA=", "fSxYL");
        lIIllIlllIIIl[lIIllIlllIIlI[27]] = lIllIIIllIIllll("juBx3XJLLXw=", "VmLvX");
    }

    public void a(InventorySetup inventorySetup) {
        this.h = inventorySetup;
    }

    public void c(boolean z) {
        this.l = z;
    }

    private static boolean lIllIIIllIlIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIllIIIllIlIIIl(String llllllllllllllIlllIlllIIlIlIllII, String llllllllllllllIlllIlllIIlIlIlIll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIIlIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIIlIlIlIlI = new StringBuilder();
        char[] llllllllllllllIlllIlllIIlIlIlIIl = llllllllllllllIlllIlllIIlIlIlIll.toCharArray();
        int llllllllllllllIlllIlllIIlIlIlIII = lIIllIlllIIlI[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIllIlllIIlI[1];
        while (lIllIIIllIlllII(i, length)) {
            llllllllllllllIlllIlllIIlIlIlIlI.append((char) (charArray[i] ^ llllllllllllllIlllIlllIIlIlIlIIl[llllllllllllllIlllIlllIIlIlIlIII % llllllllllllllIlllIlllIIlIlIlIIl.length]));
            "".length();
            llllllllllllllIlllIlllIIlIlIlIII++;
            i++;
            "".length();
            if (((56 ^ 77) ^ (226 ^ 146)) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIlllIIlIlIlIlI);
    }

    private static boolean lIllIIIllIllIlI(int i) {
        return i == 0;
    }

    @Provides
    SquireThievingConfig a(ConfigManager configManager) {
        return (SquireThievingConfig) configManager.getConfig(SquireThievingConfig.class);
    }

    private static boolean lIllIIIllIlIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    public int e() {
        return this.f;
    }

    public boolean i() {
        return this.j;
    }

    private void a() {
        if (lIllIIIllIlIlIl(this.e.pickpocketTarget(), EnumC0005f.VYRE)) {
            this.h.add(lIIllIlllIIlI[39]);
            "".length();
            this.h.add(lIIllIlllIIlI[40]);
            "".length();
            this.h.add(lIIllIlllIIlI[41]);
            "".length();
        }
        if (lIllIIIllIlIllI(this.e.gemBag() ? 1 : 0)) {
            this.h.add(item -> {
                return item.getName().toLowerCase().contains(lIIllIlllIIIl[lIIllIlllIIlI[27]]);
            });
            "".length();
        }
        if (lIllIIIllIlIllI(this.e.shadowVeil() ? 1 : 0)) {
            for (Integer num : this.b) {
                int intValue = num.intValue();
                int[] iArr = new int[lIIllIlllIIlI[3]];
                iArr[lIIllIlllIIlI[1]] = intValue;
                if (lIllIIIllIlIllI(Inventory.contains(iArr) ? 1 : 0)) {
                    this.h.add(intValue);
                    "".length();
                }
                "".length();
                if ((((85 ^ 47) ^ (22 ^ 86)) & (((126 ^ 42) ^ (240 ^ 158)) ^ (-" ".length()))) == ((((20 + 80) - (-14)) + 31) ^ (((13 + 10) - (-14)) + 112))) {
                    return;
                }
            }
        }
        if (lIllIIIllIlIlll(this.e.pickpocketFood(), EnumC0004e.NONE) && lIllIIIllIllIII(this.e.pickpocketFoodAmount())) {
            this.h.add(this.e.pickpocketFood().x(), this.e.pickpocketFoodAmount());
            "".length();
        }
        if (lIllIIIllIlIllI(this.e.dodgyNecklace() ? 1 : 0) && lIllIIIllIllIII(this.e.dodgyNecklaceAmount())) {
            this.h.add(lIIllIlllIIlI[42], this.e.dodgyNecklaceAmount());
            "".length();
        }
        if (lIllIIIllIlIllI(this.e.useSeedBox() ? 1 : 0)) {
            this.h.add(item2 -> {
                return item2.getName().toLowerCase().contains(lIIllIlllIIIl[lIIllIlllIIlI[26]]);
            });
            "".length();
        }
    }

    public TileObject a(EnumC0002c enumC0002c, boolean z) {
        String str = lIIllIlllIIIl[lIIllIlllIIlI[22]];
        Object[] objArr = new Object[lIIllIlllIIlI[5]];
        objArr[lIIllIlllIIlI[1]] = enumC0002c;
        objArr[lIIllIlllIIlI[3]] = Boolean.valueOf(z);
        Log.info(str, objArr);
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            String str2;
            if (lIllIIIllIlIllI(tileObject.getWorldLocation().equals(enumC0002c.s()) ? 1 : 0)) {
                String[] strArr = new String[lIIllIlllIIlI[3]];
                int i = lIIllIlllIIlI[1];
                if (lIllIIIllIlIllI(z ? 1 : 0)) {
                    str2 = lIIllIlllIIIl[lIIllIlllIIlI[24]];
                    "".length();
                    if ((-" ".length()) >= ((124 ^ 123) ^ "   ".length())) {
                        return ((70 ^ 120) ^ "  ".length()) & (((((72 + 12) - (-83)) + 2) ^ (((136 + 134) - 234) + 113)) ^ (-" ".length()));
                    }
                } else {
                    str2 = lIIllIlllIIIl[lIIllIlllIIlI[25]];
                }
                strArr[i] = str2;
                if (lIllIIIllIlIllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIIllIlllIIlI[3];
                    "".length();
                    return "  ".length() <= 0 ? ((70 ^ 5) ^ (212 ^ 157)) & (((208 ^ 136) ^ (104 ^ 58)) ^ (-" ".length())) : r0;
                }
            }
            return lIIllIlllIIlI[1];
        });
        if (lIllIIIllIllIll(nearest)) {
            Log.info(lIIllIlllIIIl[lIIllIlllIIlI[23]]);
            return null;
        }
        return nearest;
    }

    private static boolean lIllIIIllIllIII(int i) {
        return i > 0;
    }

    public EnumC0003d b() {
        return lIllIIIllIlIlIl(this.e.blackJackTarget(), EnumC0003d.HIGHEST_LEVEL) ? c() : this.e.blackJackTarget();
    }
}
