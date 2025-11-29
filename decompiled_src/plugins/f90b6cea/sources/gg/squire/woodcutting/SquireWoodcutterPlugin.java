package gg.squire.woodcutting;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.woodcutting.overlay.WCGInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.events.ExperienceGained;
import net.unethicalite.api.items.Inventory;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t.a;
import w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t.b;
import w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t.c;
import w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t.d;
import w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t.e;
import w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t.f;
import w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t.g;
import w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t.h;
import w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t.j;
import w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t.k;
import w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t.l;
import w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t.m;
@Extension
@PluginDescriptor(name = "Squire Woodcutter", enabledByDefault = false)
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:gg/squire/woodcutting/SquireWoodcutterPlugin.class */
public class SquireWoodcutterPlugin extends SquirePlugin {
    private /* synthetic */ WorldArea l;
    private final /* synthetic */ int[] o;
    private /* synthetic */ boolean m;
    private final /* synthetic */ int[] e;
    @Inject
    private /* synthetic */ OverlayManager i;
    public static /* synthetic */ int b;
    private static /* synthetic */ int[] lIllIIIIIIllI;
    private /* synthetic */ Instant k;
    @Inject
    private /* synthetic */ SquireWoodcutterConfig h;
    @Inject
    private /* synthetic */ WCGInfoBox j;
    private final /* synthetic */ List<Integer> f;
    private final /* synthetic */ int g = 4;
    private static /* synthetic */ String[] lIllIIIIIIlIl;
    private /* synthetic */ int n;
    private static final /* synthetic */ Logger a;
    public static /* synthetic */ int c;
    private final /* synthetic */ WorldArea d = new WorldArea(lIllIIIIIIllI[0], lIllIIIIIIllI[1], lIllIIIIIIllI[2], lIllIIIIIIllI[3], lIllIIIIIIllI[4]);

    public void a(boolean z) {
        this.m = z;
    }

    private static boolean llIIIIlllllIlIl(Object obj) {
        return obj != null;
    }

    private static boolean llIIIIllllllIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIllIIIIIIllI[26]];
        clsArr[lIllIIIIIIllI[4]] = g.class;
        clsArr[lIllIIIIIIllI[7]] = h.class;
        clsArr[lIllIIIIIIllI[9]] = j.class;
        clsArr[lIllIIIIIIllI[11]] = m.class;
        clsArr[lIllIIIIIIllI[5]] = k.class;
        clsArr[lIllIIIIIIllI[23]] = l.class;
        clsArr[lIllIIIIIIllI[24]] = c.class;
        clsArr[lIllIIIIIIllI[25]] = b.class;
        clsArr[lIllIIIIIIllI[17]] = f.class;
        clsArr[lIllIIIIIIllI[27]] = e.class;
        clsArr[lIllIIIIIIllI[28]] = d.class;
        return clsArr;
    }

    private static void llIIIIllllIllIl() {
        lIllIIIIIIlIl = new String[lIllIIIIIIllI[25]];
        lIllIIIIIIlIl[lIllIIIIIIllI[4]] = llIIIIllllIlIlI("JwQQHioRVTIYNxAWEAMsHRsCVzAVBkUVPREbRQQsFQcREjxa", "tuewX");
        lIllIIIIIIlIl[lIllIIIIIIllI[7]] = llIIIIllllIlIll("GHa2uYMlpagILS1HavURe12SVjwjuwZbg2QfWGipPk5NoC4I1dKFqAKiWJrjQdYE", "kryiz");
        lIllIIIIIIlIl[lIllIIIIIIllI[9]] = llIIIIllllIlIlI("ABULOA==", "npxLk");
        lIllIIIIIIlIl[lIllIIIIIIllI[11]] = llIIIIllllIlIll("A5pQzh+NQ1dWONtjgd0JsA==", "cpWGc");
        lIllIIIIIIlIl[lIllIIIIIIllI[5]] = llIIIIllllIlIlI("FDYGLg==", "zSuZM");
        lIllIIIIIIlIl[lIllIIIIIIllI[23]] = llIIIIllllIllII("PiZOjZaRm+s=", "iQUrT");
        lIllIIIIIIlIl[lIllIIIIIIllI[24]] = llIIIIllllIllII("SVKncVIufJM=", "RSbZL");
    }

    public List<Integer> l() {
        return this.f;
    }

    private static void llIIIIlllllIlII() {
        lIllIIIIIIllI = new int[31];
        lIllIIIIIIllI[0] = (-12302) & 15999;
        lIllIIIIIIllI[1] = (-((-241) & 20987)) & (-8193) & 32767;
        lIllIIIIIIllI[2] = 45 ^ 58;
        lIllIIIIIIllI[3] = 110 ^ 99;
        lIllIIIIIIllI[4] = ((226 ^ 168) ^ (122 ^ 39)) & (((((4 + 32) - 8) + 161) ^ (((30 + 124) - 113) + 129)) ^ (-" ".length()));
        lIllIIIIIIllI[5] = 25 ^ 29;
        lIllIIIIIIllI[6] = (((((204 + 69) - 237) + 193) + (117 ^ 97)) - (71 ^ 28)) + (72 ^ 19);
        lIllIIIIIIllI[7] = " ".length();
        lIllIIIIIIllI[8] = ((22 + 184) - 134) + 179;
        lIllIIIIIIllI[9] = "  ".length();
        lIllIIIIIIllI[10] = ((95 + 90) - 75) + 143;
        lIllIIIIIIllI[11] = "   ".length();
        lIllIIIIIIllI[12] = (((16 ^ 89) + (150 ^ 172)) - (-(192 ^ 180))) + (99 ^ 107);
        lIllIIIIIIllI[13] = (((108 ^ 104) + (240 ^ 128)) - (-(77 ^ 30))) + ((34 ^ 21) & ((116 ^ 67) ^ (-1)));
        lIllIIIIIIllI[14] = ((182 + 149) - 171) + 41;
        lIllIIIIIIllI[15] = ((12 + 57) - 15) + 149;
        lIllIIIIIIllI[16] = ((71 + 48) - (-15)) + 71;
        lIllIIIIIIllI[17] = 170 ^ 162;
        lIllIIIIIIllI[18] = (-23621) & 24566;
        lIllIIIIIIllI[19] = (-((-949) & 10229)) & (-513) & 16125;
        lIllIIIIIIllI[20] = (-835) & 7166;
        lIllIIIIIIllI[21] = ((14 + 232) - 46) + 33;
        lIllIIIIIIllI[22] = (-14445) & 16383;
        lIllIIIIIIllI[23] = 193 ^ 196;
        lIllIIIIIIllI[24] = (29 ^ 95) ^ (21 ^ 81);
        lIllIIIIIIllI[25] = 152 ^ 159;
        lIllIIIIIIllI[26] = 191 ^ 180;
        lIllIIIIIIllI[27] = 64 ^ 73;
        lIllIIIIIIllI[28] = (72 ^ 8) ^ (88 ^ 18);
        lIllIIIIIIllI[29] = (-((-2037) & 10237)) & (-2849) & 16297;
        lIllIIIIIIllI[30] = (-((-2434) & 14739)) & (-17155) & 30707;
    }

    static {
        llIIIIlllllIlII();
        llIIIIllllIllIl();
        a = LoggerFactory.getLogger(SquireWoodcutterPlugin.class);
    }

    public void a(int i) {
        this.n = i;
    }

    public int[] i() {
        int[] iArr = this.o;
        return llIIIIllllllIll(this.h.tree(), a.TEAK) ? Arrays.stream(iArr).filter(i -> {
            if (llIIIIllllllIII(i, lIllIIIIIIllI[19])) {
                ?? r0 = lIllIIIIIIllI[7];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIIIIIIllI[4];
        }).toArray() : llIIIIllllllIll(this.h.tree(), a.MAHOGANY) ? Arrays.stream(iArr).filter(i2 -> {
            if (llIIIIllllllIII(i2, lIllIIIIIIllI[20])) {
                ?? r0 = lIllIIIIIIllI[7];
                "".length();
                return "  ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIllIIIIIIllI[4];
        }).toArray() : iArr;
    }

    public int m() {
        Objects.requireNonNull(this);
        "".length();
        return lIllIIIIIIllI[5];
    }

    protected void onStop() {
        this.i.remove(this.j);
        "".length();
        b = lIllIIIIIIllI[4];
        c = lIllIIIIIIllI[4];
        a.info(lIllIIIIIIlIl[lIllIIIIIIllI[7]]);
    }

    private static boolean llIIIIllllllIIl(int i, int i2) {
        return i == i2;
    }

    public boolean p() {
        return this.m;
    }

    public void a(WorldArea worldArea) {
        this.l = worldArea;
    }

    private static boolean llIIIIllllllIII(int i, int i2) {
        return i != i2;
    }

    @Subscribe
    public void a(GameTick gameTick) {
        this.n += lIllIIIIIIllI[7];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0093, code lost:
        if (llIIIIlllllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean f() {
        int[] iArr = new int[lIllIIIIIIllI[7]];
        iArr[lIllIIIIIIllI[4]] = lIllIIIIIIllI[21];
        if (llIIIIlllllIlll(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIllIIIIIIllI[7]];
            iArr2[lIllIIIIIIllI[4]] = lIllIIIIIIllI[22];
            if (llIIIIlllllIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIllIIIIIIllI[7]];
                iArr3[lIllIIIIIIllI[4]] = lIllIIIIIIllI[6];
                if (llIIIIllllllIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIllIIIIIIllI[7]];
                    iArr4[lIllIIIIIIllI[4]] = lIllIIIIIIllI[8];
                    if (llIIIIllllllIlI(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIllIIIIIIllI[7]];
                        iArr5[lIllIIIIIIllI[4]] = lIllIIIIIIllI[12];
                    }
                }
                ?? r0 = lIllIIIIIIllI[7];
                "".length();
                return 0 != 0 ? ((173 ^ 151) ^ (46 ^ 58)) & (((9 ^ 0) ^ (157 ^ 186)) ^ (-" ".length())) : r0;
            }
        }
        return lIllIIIIIIllI[4];
    }

    private static String llIIIIllllIlIlI(String llllllllllllllIllIIllIlIllIlIIlI, String llllllllllllllIllIIllIlIllIlIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIlIllIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIlIllIlIIII = new StringBuilder();
        char[] llllllllllllllIllIIllIlIllIIllll = llllllllllllllIllIIllIlIllIlIIIl.toCharArray();
        int llllllllllllllIllIIllIlIllIIlllI = lIllIIIIIIllI[4];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIIIIIIllI[4];
        while (llIIIIlllllllII(i, length)) {
            char llllllllllllllIllIIllIlIllIlIIll = charArray[i];
            llllllllllllllIllIIllIlIllIlIIII.append((char) (llllllllllllllIllIIllIlIllIlIIll ^ llllllllllllllIllIIllIlIllIIllll[llllllllllllllIllIIllIlIllIIlllI % llllllllllllllIllIIllIlIllIIllll.length]));
            "".length();
            llllllllllllllIllIIllIlIllIIlllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIllIlIllIlIIII);
    }

    private static String llIIIIllllIllII(String llllllllllllllIllIIllIlIlIllllIl, String llllllllllllllIllIIllIlIlIllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIlIlIllllII.getBytes(StandardCharsets.UTF_8)), lIllIIIIIIllI[17]), "DES");
            Cipher llllllllllllllIllIIllIlIlIllllll = Cipher.getInstance("DES");
            llllllllllllllIllIIllIlIlIllllll.init(lIllIIIIIIllI[9], secretKeySpec);
            return new String(llllllllllllllIllIIllIlIlIllllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIlIlIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIlIlIlllllI) {
            llllllllllllllIllIIllIlIlIlllllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean c() {
        if (!llIIIIllllllIlI(this.h.fastTickChop() ? 1 : 0) || llIIIIlllllIlll(this.h.tickChop() ? 1 : 0)) {
            ?? r0 = lIllIIIIIIllI[7];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIIIIIllI[4];
    }

    private static boolean llIIIIlllllIlll(int i) {
        return i != 0;
    }

    public int q() {
        return this.n;
    }

    public WorldArea o() {
        return this.l;
    }

    private static boolean llIIIIlllllIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean g() {
        int[] iArr = new int[lIllIIIIIIllI[7]];
        iArr[lIllIIIIIIllI[4]] = this.h.tree().s();
        if (llIIIIllllllIlI(Inventory.contains(iArr) ? 1 : 0) && llIIIIllllllIlI(Inventory.contains(item -> {
            return item.getName().toLowerCase().contains(lIllIIIIIIlIl[lIllIIIIIIllI[23]]);
        }) ? 1 : 0) && llIIIIllllllIlI(Inventory.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIllIIIIIIlIl[lIllIIIIIIllI[5]]);
        }) ? 1 : 0) && llIIIIlllllIlll(c() ? 1 : 0) && llIIIIlllllIlll(d() ? 1 : 0)) {
            ?? r0 = lIllIIIIIIllI[7];
            "".length();
            return 0 != 0 ? ((150 ^ 130) ^ (195 ^ 183)) & (((24 ^ 56) ^ (107 ^ 43)) ^ (-" ".length())) : r0;
        }
        return lIllIIIIIIllI[4];
    }

    public WorldArea j() {
        return this.d;
    }

    private static String llIIIIllllIlIll(String llllllllllllllIllIIllIlIlllIIIlI, String llllllllllllllIllIIllIlIlllIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIllIlIlllIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIIIIllI[9], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIllIlIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIllIlIlllIIIll) {
            llllllllllllllIllIIllIlIlllIIIll.printStackTrace();
            return null;
        }
    }

    public void h() {
        int i;
        if (llIIIIlllllIlll(Inventory.contains(this.e) ? 1 : 0)) {
            Item first = Inventory.getFirst(this.e);
            int[] iArr = new int[lIllIIIIIIllI[7]];
            iArr[lIllIIIIIIllI[4]] = lIllIIIIIIllI[22];
            first.useOn(Inventory.getFirst(iArr));
        }
        if (llIIIIlllllIlll(this.h.tree().equals(a.MAHOGANY) ? 1 : 0)) {
            i = lIllIIIIIIllI[19];
            "".length();
            if ((-((((28 + 99) - 66) + 135) ^ (((110 + 55) - 157) + 184))) > 0) {
                return;
            }
        } else {
            i = lIllIIIIIIllI[20];
        }
        int i2 = i;
        int[] iArr2 = new int[lIllIIIIIIllI[7]];
        iArr2[lIllIIIIIIllI[4]] = lIllIIIIIIllI[18];
        if (llIIIIlllllIlll(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIllIIIIIIllI[7]];
            iArr3[lIllIIIIIIllI[4]] = lIllIIIIIIllI[18];
            Item first2 = Inventory.getFirst(iArr3);
            int[] iArr4 = new int[lIllIIIIIIllI[7]];
            iArr4[lIllIIIIIIllI[4]] = i2;
            first2.useOn(Inventory.getFirst(iArr4));
        }
    }

    public Instant getStarted() {
        return this.k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    public SquireWoodcutterPlugin() {
        int[] iArr = new int[lIllIIIIIIllI[5]];
        iArr[lIllIIIIIIllI[4]] = lIllIIIIIIllI[6];
        iArr[lIllIIIIIIllI[7]] = lIllIIIIIIllI[8];
        iArr[lIllIIIIIIllI[9]] = lIllIIIIIIllI[10];
        iArr[lIllIIIIIIllI[11]] = lIllIIIIIIllI[12];
        this.e = iArr;
        this.f = List.of(Integer.valueOf(lIllIIIIIIllI[13]), Integer.valueOf(lIllIIIIIIllI[14]), Integer.valueOf(lIllIIIIIIllI[15]), Integer.valueOf(lIllIIIIIIllI[16]));
        this.g = lIllIIIIIIllI[5];
        this.m = lIllIIIIIIllI[4];
        this.n = lIllIIIIIIllI[4];
        int[] iArr2 = new int[lIllIIIIIIllI[17]];
        iArr2[lIllIIIIIIllI[4]] = lIllIIIIIIllI[18];
        iArr2[lIllIIIIIIllI[7]] = lIllIIIIIIllI[19];
        iArr2[lIllIIIIIIllI[9]] = lIllIIIIIIllI[20];
        iArr2[lIllIIIIIIllI[11]] = lIllIIIIIIllI[21];
        iArr2[lIllIIIIIIllI[5]] = lIllIIIIIIllI[22];
        iArr2[lIllIIIIIIllI[23]] = lIllIIIIIIllI[6];
        iArr2[lIllIIIIIIllI[24]] = lIllIIIIIIllI[8];
        iArr2[lIllIIIIIIllI[25]] = lIllIIIIIIllI[12];
        this.o = iArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean b() {
        if (!llIIIIllllllIII(Players.getLocal().getAnimation(), lIllIIIIIIllI[29]) || llIIIIllllllIIl(Players.getLocal().getAnimation(), lIllIIIIIIllI[30])) {
            ?? r0 = lIllIIIIIIllI[7];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIIIIIllI[4];
    }

    @Provides
    SquireWoodcutterConfig a(ConfigManager configManager) {
        return (SquireWoodcutterConfig) configManager.getConfig(SquireWoodcutterConfig.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean d() {
        if (!llIIIIllllllIlI(e() ? 1 : 0) || llIIIIlllllIlll(f() ? 1 : 0)) {
            ?? r0 = lIllIIIIIIllI[7];
            "".length();
            return "   ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIIIIIllI[4];
    }

    public int[] k() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean e() {
        a tree = this.h.tree();
        int[] iArr = new int[lIllIIIIIIllI[7]];
        iArr[lIllIIIIIIllI[4]] = lIllIIIIIIllI[18];
        if (!llIIIIlllllIlll(Inventory.contains(iArr) ? 1 : 0) || !llIIIIllllllIll(tree, a.TEAK)) {
            int[] iArr2 = new int[lIllIIIIIIllI[7]];
            iArr2[lIllIIIIIIllI[4]] = lIllIIIIIIllI[19];
            return Inventory.contains(iArr2);
        }
        int[] iArr3 = new int[lIllIIIIIIllI[7]];
        iArr3[lIllIIIIIIllI[4]] = lIllIIIIIIllI[20];
        boolean contains = Inventory.contains(iArr3);
        "".length();
        return "  ".length() < (-" ".length()) ? ((((0 + 44) - (-55)) + 71) ^ (((152 + 158) - 189) + 62)) & (((32 ^ 55) ^ (108 ^ 102)) ^ (-" ".length())) : contains;
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if (llIIIIllllllIll(experienceGained.getSkill(), Skill.WOODCUTTING)) {
            this.n = lIllIIIIIIllI[4];
        }
    }

    protected void onStart() {
        this.i.add(this.j);
        "".length();
        this.k = Instant.now();
        a.info(lIllIIIIIIlIl[lIllIIIIIIllI[4]]);
        if (llIIIIlllllIlIl(Players.getLocal())) {
            a(Players.getLocal().getWorldArea());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean a() {
        if (llIIIIlllllIlIl(TileItems.getNearest(tileItem -> {
            return tileItem.getName().toLowerCase().contains(lIllIIIIIIlIl[lIllIIIIIIllI[24]]);
        }))) {
            ?? r0 = lIllIIIIIIllI[7];
            "".length();
            return (-"   ".length()) > 0 ? ((((163 + 15) - (-22)) + 27) ^ (((128 + 53) - 12) + 22)) & (((255 ^ 141) ^ (185 ^ 151)) ^ (-" ".length())) : r0;
        }
        return lIllIIIIIIllI[4];
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (llIIIIlllllIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && llIIIIlllllIllI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (llIIIIlllllIlll(chatMessage.getMessage().contains(lIllIIIIIIlIl[lIllIIIIIIllI[9]]) ? 1 : 0)) {
            c += lIllIIIIIIllI[7];
        }
        if (llIIIIlllllIlll(chatMessage.getMessage().contains(lIllIIIIIIlIl[lIllIIIIIIllI[11]]) ? 1 : 0)) {
            b += lIllIIIIIIllI[7];
        }
    }

    private static boolean llIIIIllllllIlI(int i) {
        return i == 0;
    }

    public SquireWoodcutterConfig n() {
        return this.h;
    }

    private static boolean llIIIIlllllllII(int i, int i2) {
        return i < i2;
    }
}
