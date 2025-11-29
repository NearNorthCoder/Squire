package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Triple;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.G  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/G.class */
public final class G {
    public static final /* synthetic */ G NORTH_II_VII;
    public static final /* synthetic */ G TOP_V_V;
    private static /* synthetic */ int[] lllIIIlIIllI;
    private static /* synthetic */ String[] lllIIIlIIlIl;
    public static final /* synthetic */ G NORTH_II_V;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ G MIDDLE_V_XIII;
    public static final /* synthetic */ G NORTH_II_VI;
    /* synthetic */ H type;
    public static final /* synthetic */ G TOP_V_VII;
    public static final /* synthetic */ G MIDDLE_V_XV;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    public static final /* synthetic */ G EAST_IV_II;
    public static final /* synthetic */ G WEST_II_III;
    private static final /* synthetic */ G[] $VALUES;
    /* synthetic */ Supplier<WorldPoint> destination;
    public static final /* synthetic */ G EAST_II_VI;

    private static boolean lIIIlIIlIIIlIII(Object obj) {
        return obj == null;
    }

    private G(String str, int i, List list, RegionPoint regionPoint, RegionPoint regionPoint2, H h) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (lIIIlIIlIIIlIll(it.hasNext() ? 1 : 0)) {
                Triple triple = (Triple) it.next();
                arrayList.add(new WorldArea(SquireSepulchre.a((RegionPoint) triple.getFirst()), ((Integer) triple.getSecond()).intValue(), ((Integer) triple.getThird()).intValue()));
                "".length();
                "".length();
                if ((-" ".length()) > "  ".length()) {
                    return null;
                }
            }
            return arrayList;
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint);
        };
        this.destination = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.type = h;
    }

    private static String lIIIlIIlIIIIlIl(String lllllllllllllllIIllIllllIlIIllll, String lllllllllllllllIIllIllllIlIIlllI) {
        try {
            SecretKeySpec lllllllllllllllIIllIllllIlIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllllIlIIlllI.getBytes(StandardCharsets.UTF_8)), lllIIIlIIllI[25]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIlIIllI[4], lllllllllllllllIIllIllllIlIlIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllllIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllllIlIlIIII) {
            lllllllllllllllIIllIllllIlIlIIII.printStackTrace();
            return null;
        }
    }

    private static void lIIIlIIlIIIIllI() {
        lllIIIlIIlIl = new String[lllIIIlIIllI[31]];
        lllIIIlIIlIl[lllIIIlIIllI[0]] = lIIIlIIlIIIIIll("Kg9FORAxBEQ=", "CaeQu");
        lllIIIlIIlIl[lllIIIlIIllI[1]] = lIIIlIIlIIIIlII("sf5n3X005K1E5xZZjVzl+A==", "KNBUz");
        lllIIIlIIlIl[lllIIIlIIllI[4]] = lIIIlIIlIIIIIll("DjcVAggCPxkAHg==", "KvFVW");
        lllIIIlIIlIl[lllIIIlIIllI[5]] = lIIIlIIlIIIIIll("LysbLgc+LQAlGQ==", "adIzO");
        lllIIIlIIlIl[lllIIIlIIllI[9]] = lIIIlIIlIIIIlIl("9Ccs0NNYkzUBj9BPC1SNaA==", "mTUsB");
        lllIIIlIIlIl[lllIIIlIIllI[11]] = lIIIlIIlIIIIlII("mrkUyUQjly/yU6SqKycyhA==", "dNsbB");
        lllIIIlIIlIl[lllIIIlIIllI[17]] = lIIIlIIlIIIIlIl("IwBG7UlZCI3kQ7el+G7smA==", "bBGNC");
        lllIIIlIIlIl[lllIIIlIIllI[21]] = lIIIlIIlIIIIlII("xer5EFQeNLI=", "vZLBZ");
        lllIIIlIIlIl[lllIIIlIIllI[25]] = lIIIlIIlIIIIIll("Ax0BGBoIBBgO", "WRQGL");
        lllIIIlIIlIl[lllIIIlIIllI[23]] = lIIIlIIlIIIIlII("cuRCbwZ9awZkhwKx2OHlhg==", "bRWsE");
        lllIIIlIIlIl[lllIIIlIIllI[29]] = lIIIlIIlIIIIlII("Y9GeQZOYqc/RmnACb3qGCg==", "lTKVV");
    }

    private static String lIIIlIIlIIIIIll(String lllllllllllllllIIllIllllIIllllll, String lllllllllllllllIIllIllllIIlllllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllllIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllllIIllllIl = new StringBuilder();
        char[] lllllllllllllllIIllIllllIIllllII = lllllllllllllllIIllIllllIIlllllI.toCharArray();
        int lllllllllllllllIIllIllllIIlllIll = lllIIIlIIllI[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIIlIIllI[0];
        while (lIIIlIIlIIIllII(i, length)) {
            char lllllllllllllllIIllIllllIlIIIIII = charArray[i];
            lllllllllllllllIIllIllllIIllllIl.append((char) (lllllllllllllllIIllIllllIlIIIIII ^ lllllllllllllllIIllIllllIIllllII[lllllllllllllllIIllIllllIIlllIll % lllllllllllllllIIllIllllIIllllII.length]));
            "".length();
            lllllllllllllllIIllIllllIIlllIll++;
            i++;
            "".length();
            if ((11 ^ 15) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIllllIIllllIl);
    }

    private static void lIIIlIIlIIIIlll() {
        lllIIIlIIllI = new int[32];
        lllIIIlIIllI[0] = ((2 ^ 38) ^ (94 ^ 127)) & (((111 ^ 22) ^ (240 ^ 140)) ^ (-" ".length()));
        lllIIIlIIllI[1] = " ".length();
        lllIIIlIIllI[2] = 9 ^ 53;
        lllIIIlIIllI[3] = (252 ^ 194) ^ (55 ^ 39);
        lllIIIlIIllI[4] = "  ".length();
        lllIIIlIIllI[5] = "   ".length();
        lllIIIlIIllI[6] = 116 ^ 120;
        lllIIIlIIllI[7] = (((97 + 21) - (-14)) + 10) ^ (((43 + 151) - 115) + 104);
        lllIIIlIIllI[8] = (210 ^ 144) ^ (10 ^ 108);
        lllIIIlIIllI[9] = (93 ^ 70) ^ (88 ^ 71);
        lllIIIlIIllI[10] = (((132 + 149) - 139) + 17) ^ (((40 + 162) - 86) + 62);
        lllIIIlIIllI[11] = (163 ^ 141) ^ (153 ^ 178);
        lllIIIlIIllI[12] = 112 ^ 92;
        lllIIIlIIllI[13] = (((155 + 12) - 99) + 99) ^ (((5 + 87) - (-53)) + 9);
        lllIIIlIIllI[14] = 167 ^ 143;
        lllIIIlIIllI[15] = 62 ^ 25;
        lllIIIlIIllI[16] = (((90 + 22) - 7) + 83) ^ (((92 + 17) - 95) + 145);
        lllIIIlIIllI[17] = 156 ^ 154;
        lllIIIlIIllI[18] = (86 ^ 47) ^ (102 ^ 39);
        lllIIIlIIllI[19] = (((195 + 136) - 309) + 189) ^ (((172 + 95) - 102) + 34);
        lllIIIlIIllI[20] = 113 ^ 102;
        lllIIIlIIllI[21] = (113 ^ 95) ^ (0 ^ 41);
        lllIIIlIIllI[22] = 14 ^ 62;
        lllIIIlIIllI[23] = 15 ^ 6;
        lllIIIlIIllI[24] = (225 ^ 143) ^ (64 ^ 4);
        lllIIIlIIllI[25] = 94 ^ 86;
        lllIIIlIIllI[26] = 163 ^ 131;
        lllIIIlIIllI[27] = 138 ^ 133;
        lllIIIlIIllI[28] = (147 ^ 183) ^ (182 ^ 169);
        lllIIIlIIllI[29] = 84 ^ 94;
        lllIIIlIIllI[30] = (142 ^ 192) ^ (55 ^ 88);
        lllIIIlIIllI[31] = (((96 + 83) - 136) + 99) ^ (((95 + 19) - 111) + 130);
    }

    private G(String str, int i, RegionPoint regionPoint, int i2, int i3, RegionPoint regionPoint2, RegionPoint regionPoint3, H h) {
        this.startAreas = () -> {
            return List.of(new WorldArea(SquireSepulchre.a(regionPoint), i2, i3));
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.destination = () -> {
            return SquireSepulchre.a(regionPoint3);
        };
        this.type = h;
    }

    private static boolean lIIIlIIlIIIlIIl(int i) {
        return i == 0;
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    public static G[] values() {
        return (G[]) $VALUES.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean c(WorldPoint worldPoint) {
        for (WorldArea worldArea : this.startAreas.get()) {
            if (lIIIlIIlIIIlIll(worldArea.contains(worldPoint) ? 1 : 0)) {
                return lllIIIlIIllI[1];
            }
            "".length();
            if (0 != 0) {
                return ((((28 + 123) - 59) + 68) ^ (((149 + 134) - 187) + 63)) & (((65 ^ 22) ^ (39 ^ 79)) ^ (-" ".length()));
            }
        }
        return lllIIIlIIllI[0];
    }

    private static boolean lIIIlIIlIIIlIll(int i) {
        return i != 0;
    }

    private static String lIIIlIIlIIIIlII(String lllllllllllllllIIllIllllIIlIlIlI, String lllllllllllllllIIllIllllIIlIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllllIIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIllllIIlIllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIllllIIlIllII.init(lllIIIlIIllI[4], secretKeySpec);
            return new String(lllllllllllllllIIllIllllIIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllllIIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllllIIlIlIll) {
            lllllllllllllllIIllIllllIIlIlIll.printStackTrace();
            return null;
        }
    }

    static {
        lIIIlIIlIIIIlll();
        lIIIlIIlIIIIllI();
        WEST_II_III = new G(lllIIIlIIlIl[lllIIIlIIllI[1]], lllIIIlIIllI[0], new RegionPoint(lllIIIlIIllI[2], lllIIIlIIllI[3], lllIIIlIIllI[4], C0001b.I), lllIIIlIIllI[5], lllIIIlIIllI[6], new RegionPoint(lllIIIlIIllI[7], lllIIIlIIllI[8], lllIIIlIIllI[4], C0001b.I), new RegionPoint(lllIIIlIIllI[7], lllIIIlIIllI[8], lllIIIlIIllI[4], C0001b.I), H.STRANGE_TILES);
        EAST_II_VI = new G(lllIIIlIIlIl[lllIIIlIIllI[4]], lllIIIlIIllI[1], new RegionPoint(lllIIIlIIllI[3], lllIIIlIIllI[5], lllIIIlIIllI[4], C0001b.G), lllIIIlIIllI[6], lllIIIlIIllI[5], new RegionPoint(lllIIIlIIllI[7], lllIIIlIIllI[9], lllIIIlIIllI[4], C0001b.G), new RegionPoint(lllIIIlIIllI[10], lllIIIlIIllI[9], lllIIIlIIllI[4], C0001b.G), H.STRANGE_TILES);
        NORTH_II_V = new G(lllIIIlIIlIl[lllIIIlIIllI[5]], lllIIIlIIllI[4], new RegionPoint(lllIIIlIIllI[10], lllIIIlIIllI[2], lllIIIlIIllI[1], C0001b.G), lllIIIlIIllI[11], lllIIIlIIllI[5], new RegionPoint(lllIIIlIIllI[12], lllIIIlIIllI[13], lllIIIlIIllI[1], C0001b.G), new RegionPoint(lllIIIlIIllI[12], lllIIIlIIllI[13], lllIIIlIIllI[1], C0001b.G), H.STRANGE_TILES);
        NORTH_II_VI = new G(lllIIIlIIlIl[lllIIIlIIllI[9]], lllIIIlIIllI[5], new RegionPoint(lllIIIlIIllI[14], lllIIIlIIllI[2], lllIIIlIIllI[1], C0001b.G), lllIIIlIIllI[11], lllIIIlIIllI[5], new RegionPoint(lllIIIlIIllI[15], lllIIIlIIllI[13], lllIIIlIIllI[1], C0001b.G), new RegionPoint(lllIIIlIIllI[15], lllIIIlIIllI[13], lllIIIlIIllI[1], C0001b.G), H.STRANGE_TILES);
        NORTH_II_VII = new G(lllIIIlIIlIl[lllIIIlIIllI[11]], lllIIIlIIllI[9], new RegionPoint(lllIIIlIIllI[8], lllIIIlIIllI[2], lllIIIlIIllI[1], C0001b.G), lllIIIlIIllI[9], lllIIIlIIllI[5], new RegionPoint(lllIIIlIIllI[16], lllIIIlIIllI[13], lllIIIlIIllI[1], C0001b.G), new RegionPoint(lllIIIlIIllI[16], lllIIIlIIllI[13], lllIIIlIIllI[1], C0001b.G), H.STRANGE_TILES);
        EAST_IV_II = new G(lllIIIlIIlIl[lllIIIlIIllI[17]], lllIIIlIIllI[11], new RegionPoint(lllIIIlIIllI[18], lllIIIlIIllI[19], lllIIIlIIllI[1], C0001b.L), lllIIIlIIllI[5], lllIIIlIIllI[9], new RegionPoint(lllIIIlIIllI[19], lllIIIlIIllI[20], lllIIIlIIllI[1], C0001b.L), new RegionPoint(lllIIIlIIllI[19], lllIIIlIIllI[20], lllIIIlIIllI[1], C0001b.L), H.DART_STRANGE_TILES);
        TOP_V_V = new G(lllIIIlIIlIl[lllIIIlIIllI[21]], lllIIIlIIllI[17], new RegionPoint(lllIIIlIIllI[5], lllIIIlIIllI[22], lllIIIlIIllI[4], C0001b.N), lllIIIlIIllI[5], lllIIIlIIllI[23], new RegionPoint(lllIIIlIIllI[11], lllIIIlIIllI[24], lllIIIlIIllI[4], C0001b.N), new RegionPoint(lllIIIlIIllI[11], lllIIIlIIllI[24], lllIIIlIIllI[4], C0001b.N), H.BLADE_STRANGE_TILES);
        TOP_V_VII = new G(lllIIIlIIlIl[lllIIIlIIllI[25]], lllIIIlIIllI[21], new RegionPoint(lllIIIlIIllI[5], lllIIIlIIllI[26], lllIIIlIIllI[4], C0001b.N), lllIIIlIIllI[5], lllIIIlIIllI[25], new RegionPoint(lllIIIlIIllI[5], lllIIIlIIllI[27], lllIIIlIIllI[4], C0001b.N), new RegionPoint(lllIIIlIIllI[5], lllIIIlIIllI[27], lllIIIlIIllI[4], C0001b.N), H.BLADE_STRANGE_TILES);
        MIDDLE_V_XIII = new G(lllIIIlIIlIl[lllIIIlIIllI[23]], lllIIIlIIllI[25], new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[10], lllIIIlIIllI[1], C0001b.N), lllIIIlIIllI[5], lllIIIlIIllI[9], new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[10], lllIIIlIIllI[1], C0001b.N), new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[10], lllIIIlIIllI[1], C0001b.N), H.BLADE_STRANGE_TILES);
        MIDDLE_V_XV = new G(lllIIIlIIlIl[lllIIIlIIllI[29]], lllIIIlIIllI[23], new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[30], lllIIIlIIllI[1], C0001b.N), lllIIIlIIllI[5], lllIIIlIIllI[9], new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[30], lllIIIlIIllI[1], C0001b.N), new RegionPoint(lllIIIlIIllI[28], lllIIIlIIllI[30], lllIIIlIIllI[1], C0001b.N), H.BLADE_STRANGE_TILES);
        G[] gArr = new G[lllIIIlIIllI[29]];
        gArr[lllIIIlIIllI[0]] = WEST_II_III;
        gArr[lllIIIlIIllI[1]] = EAST_II_VI;
        gArr[lllIIIlIIllI[4]] = NORTH_II_V;
        gArr[lllIIIlIIllI[5]] = NORTH_II_VI;
        gArr[lllIIIlIIllI[9]] = NORTH_II_VII;
        gArr[lllIIIlIIllI[11]] = EAST_IV_II;
        gArr[lllIIIlIIllI[17]] = TOP_V_V;
        gArr[lllIIIlIIllI[21]] = TOP_V_VII;
        gArr[lllIIIlIIllI[25]] = MIDDLE_V_XIII;
        gArr[lllIIIlIIllI[23]] = MIDDLE_V_XV;
        $VALUES = gArr;
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    public boolean a(C0003d c0003d, SquireSepulchre squireSepulchre) {
        Player local = Players.getLocal();
        if (!lIIIlIIlIIIlIII(local) && !lIIIlIIlIIIlIIl(a((Locatable) local) ? 1 : 0)) {
            System.out.println(lllIIIlIIlIl[lllIIIlIIllI[0]]);
            a(squireSepulchre);
            if (lIIIlIIlIIIlIlI(this.type, H.DART_STRANGE_TILES)) {
                for (GraphicsObject graphicsObject : Static.getClient().getGraphicsObjects()) {
                    if (lIIIlIIlIIIlIll(C0001b.A.contains(Integer.valueOf(graphicsObject.getId())) ? 1 : 0) && lIIIlIIlIIIlIll(c(WorldPoint.fromLocal(Static.getClient(), graphicsObject.getLocation())) ? 1 : 0)) {
                        Movement.setDestination(WorldPoint.fromLocal(Static.getClient(), graphicsObject.getLocation()));
                        return lllIIIlIIllI[1];
                    }
                    "".length();
                    if ((-"  ".length()) > 0) {
                        return ((136 ^ 176) ^ (56 ^ 52)) & (((89 ^ 9) ^ (70 ^ 34)) ^ (-" ".length()));
                    }
                }
                return lllIIIlIIllI[0];
            }
            if (lIIIlIIlIIIlIlI(this.type, H.BLADE_STRANGE_TILES)) {
                for (GraphicsObject graphicsObject2 : Static.getClient().getGraphicsObjects()) {
                    if (lIIIlIIlIIIlIll(C0001b.A.contains(Integer.valueOf(graphicsObject2.getId())) ? 1 : 0) && lIIIlIIlIIIlIll(c(WorldPoint.fromLocal(Static.getClient(), graphicsObject2.getLocation())) ? 1 : 0)) {
                        Movement.setDestination(WorldPoint.fromLocal(Static.getClient(), graphicsObject2.getLocation()));
                        return lllIIIlIIllI[1];
                    }
                    "".length();
                    if (" ".length() == 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            }
            Movement.setDestination(this.destination.get());
            return lllIIIlIIllI[1];
        }
        return lllIIIlIIllI[0];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + name());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(Locatable locatable) {
        for (WorldArea worldArea : this.startAreas.get()) {
            if (lIIIlIIlIIIlIll(worldArea.contains(locatable) ? 1 : 0)) {
                return lllIIIlIIllI[1];
            }
            "".length();
            if ("  ".length() > "  ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllIIIlIIllI[0];
    }

    private static boolean lIIIlIIlIIIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIlIIlIIIllII(int i, int i2) {
        return i < i2;
    }
}
