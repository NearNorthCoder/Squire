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
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.e  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/e.class */
public final class EnumC0004e {
    public /* synthetic */ Supplier<TileObject> object;
    private static /* synthetic */ String[] lllIIIlllIIl;
    public static final /* synthetic */ EnumC0004e WEST_III_VI;
    private static /* synthetic */ int[] lllIIIlllIlI;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    public static final /* synthetic */ EnumC0004e WEST_IV_I;
    public static final /* synthetic */ EnumC0004e SOUTH_II_III;
    public static final /* synthetic */ EnumC0004e NORTH_II_III;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ EnumC0004e SOUTH_I_I;
    public static final /* synthetic */ EnumC0004e TOP_V_IV;
    public static final /* synthetic */ EnumC0004e NORTH_III_III;
    public static final /* synthetic */ EnumC0004e SOUTH_IV_VI;
    public static final /* synthetic */ EnumC0004e WEST_II_I;
    public static final /* synthetic */ EnumC0004e NORTH_III_V;
    private static final /* synthetic */ EnumC0004e[] $VALUES;
    public static final /* synthetic */ EnumC0004e WEST_II_VII;
    public static final /* synthetic */ EnumC0004e NORTH_IV_III;
    public static final /* synthetic */ EnumC0004e MIDDLE_V_XI;
    /* synthetic */ Supplier<WorldPoint> destination;
    public static final /* synthetic */ EnumC0004e EAST_I_III;
    /* synthetic */ EnumC0006g type;
    public static final /* synthetic */ EnumC0004e WEST_I_III;
    public static final /* synthetic */ EnumC0004e WEST_III_III;

    private static String lIIIlIIllIIlIIl(String lllllllllllllllIIllIllIIIlIIIIlI, String lllllllllllllllIIllIllIIIlIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIIIlIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), lllIIIlllIlI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIlllIlI[14], lllllllllllllllIIllIllIIIlIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIIIlIIIIll) {
            lllllllllllllllIIllIllIIIlIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIllIllIIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(Locatable locatable) {
        for (WorldArea worldArea : this.startAreas.get()) {
            if (lIIIlIIllIllIlI(worldArea.contains(locatable) ? 1 : 0)) {
                return lllIIIlllIlI[2];
            }
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllIIIlllIlI[0];
    }

    private static void lIIIlIIllIlIIIl() {
        lllIIIlllIlI = new int[54];
        lllIIIlllIlI[0] = (134 ^ 170) & ((26 ^ 54) ^ (-1));
        lllIIIlllIlI[1] = (((1 + 65) - (-61)) + 42) ^ (((62 + 1) - (-85)) + 25);
        lllIIIlllIlI[2] = " ".length();
        lllIIIlllIlI[3] = 112 ^ 125;
        lllIIIlllIlI[4] = 62 ^ 46;
        lllIIIlllIlI[5] = 126 ^ 123;
        lllIIIlllIlI[6] = 67 ^ 76;
        lllIIIlllIlI[7] = 168 ^ 166;
        lllIIIlllIlI[8] = (63 ^ 98) ^ (112 ^ 39);
        lllIIIlllIlI[9] = "   ".length();
        lllIIIlllIlI[10] = 54 ^ 44;
        lllIIIlllIlI[11] = 34 ^ 36;
        lllIIIlllIlI[12] = 81 ^ 66;
        lllIIIlllIlI[13] = 31 ^ 13;
        lllIIIlllIlI[14] = "  ".length();
        lllIIIlllIlI[15] = 103 ^ 96;
        lllIIIlllIlI[16] = 142 ^ 134;
        lllIIIlllIlI[17] = 80 ^ 89;
        lllIIIlllIlI[18] = 166 ^ 173;
        lllIIIlllIlI[19] = (((81 + 141) - 221) + 174) ^ (((122 + 136) - 148) + 53);
        lllIIIlllIlI[20] = 4 ^ 57;
        lllIIIlllIlI[21] = (126 ^ 78) ^ (175 ^ 183);
        lllIIIlllIlI[22] = (177 ^ 138) ^ (36 ^ 58);
        lllIIIlllIlI[23] = (145 ^ 192) ^ (191 ^ 194);
        lllIIIlllIlI[24] = (12 ^ 10) ^ (150 ^ 164);
        lllIIIlllIlI[25] = (34 ^ 85) ^ (96 ^ 6);
        lllIIIlllIlI[26] = 57 ^ 5;
        lllIIIlllIlI[27] = (75 ^ 104) ^ (49 ^ 59);
        lllIIIlllIlI[28] = 83 ^ 76;
        lllIIIlllIlI[29] = (101 ^ 105) ^ (168 ^ 158);
        lllIIIlllIlI[30] = 45 ^ 15;
        lllIIIlllIlI[31] = (145 ^ 156) ^ (177 ^ 130);
        lllIIIlllIlI[32] = (106 ^ 2) ^ (250 ^ 165);
        lllIIIlllIlI[33] = 155 ^ 133;
        lllIIIlllIlI[34] = 7 ^ 38;
        lllIIIlllIlI[35] = (((20 + 75) - 38) + 71) ^ (((115 + 17) - 35) + 74);
        lllIIIlllIlI[36] = 178 ^ 166;
        lllIIIlllIlI[37] = (46 ^ 115) ^ (95 ^ 27);
        lllIIIlllIlI[38] = 102 ^ 113;
        lllIIIlllIlI[39] = 9 ^ 41;
        lllIIIlllIlI[40] = 98 ^ 119;
        lllIIIlllIlI[41] = (((2 + 144) - 81) + 121) ^ (((127 + 17) - 108) + 136);
        lllIIIlllIlI[42] = 93 ^ 64;
        lllIIIlllIlI[43] = 7 ^ 56;
        lllIIIlllIlI[44] = (193 ^ 138) ^ (45 ^ 94);
        lllIIIlllIlI[45] = 30 ^ 43;
        lllIIIlllIlI[46] = (((54 + 70) - 77) + 81) ^ (((167 + 134) - 200) + 69);
        lllIIIlllIlI[47] = 148 ^ 140;
        lllIIIlllIlI[48] = 157 ^ 173;
        lllIIIlllIlI[49] = (((173 + 96) - 146) + 111) ^ (((36 + 126) - (-3)) + 31);
        lllIIIlllIlI[50] = (72 ^ 15) ^ (6 ^ 119);
        lllIIIlllIlI[51] = (211 ^ 181) ^ (211 ^ 142);
        lllIIIlllIlI[52] = 28 ^ 7;
        lllIIIlllIlI[53] = 110 ^ 114;
    }

    private static boolean lIIIlIIllIlIlII(int i, int i2) {
        return i == i2;
    }

    private EnumC0004e(String str, int i, RegionPoint regionPoint, int i2, int i3, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier supplier, EnumC0006g enumC0006g) {
        this.startAreas = () -> {
            return List.of(new WorldArea(SquireSepulchre.a(regionPoint), i2, i3));
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.destination = () -> {
            return SquireSepulchre.a(regionPoint3);
        };
        this.object = supplier;
        this.type = enumC0006g;
    }

    private static void lIIIlIIllIlIIII() {
        lllIIIlllIIl = new String[lllIIIlllIlI[39]];
        lllIIIlllIIl[lllIIIlllIlI[0]] = lIIIlIIllIIlIIl("VihUlEGw6JjIaikjpyBwGQ==", "XpzwN");
        lllIIIlllIIl[lllIIIlllIlI[2]] = lIIIlIIllIIlIIl("1HrgYJYqNqGIA+QP6to6yw==", "JdqyP");
        lllIIIlllIIl[lllIIIlllIlI[14]] = lIIIlIIllIIllII("C/FTwNuXBKK9Yk4+DHWDtw==", "PEBYx");
        lllIIIlllIIl[lllIIIlllIlI[9]] = lIIIlIIllIIllll("BRckLzg6WR48MToMKA==", "NyMHP");
        lllIIIlllIIl[lllIIIlllIlI[1]] = lIIIlIIllIIlIIl("/AV8goAUfF+MXuPrVX8tRA==", "ynORB");
        lllIIIlllIIl[lllIIIlllIlI[5]] = lIIIlIIllIIlIIl("8bt/Geu16axz6Fx5EnsQng==", "obTBC");
        lllIIIlllIIl[lllIIIlllIlI[11]] = lIIIlIIllIIllll("GQwLAwkmQjEQACYXBw==", "Rbbda");
        lllIIIlllIIl[lllIIIlllIlI[15]] = lIIIlIIllIIllll("EiAkKREtbh46GC07KA==", "YNMNy");
        lllIIIlllIIl[lllIIIlllIlI[16]] = lIIIlIIllIIlIIl("Ga+E2HoBUqO94cWkSVsLmQ==", "PjzwW");
        lllIIIlllIIl[lllIIIlllIlI[17]] = lIIIlIIllIIlIIl("wLUt2f1m1mtD0tnPatc8FA==", "QdOLH");
        lllIIIlllIIl[lllIIIlllIlI[8]] = lIIIlIIllIIllll("OgQKFiMFSjAFKgUfBg==", "qjcqK");
        lllIIIlllIIl[lllIIIlllIlI[18]] = lIIIlIIllIIllll("IBsaNB8fVSAnFh8AFg==", "kusSw");
        lllIIIlllIIl[lllIIIlllIlI[19]] = lIIIlIIllIIlIIl("iYt0JAml0VbLU3tJ8x9Lbw==", "zyjnq");
        lllIIIlllIIl[lllIIIlllIlI[3]] = lIIIlIIllIIllll("AgQqFiM9ShAFKj0fJg==", "IjCqK");
        lllIIIlllIIl[lllIIIlllIlI[7]] = lIIIlIIllIIllll("By8sDRo4YRYeEzg0IA==", "LAEjr");
        lllIIIlllIIl[lllIIIlllIlI[6]] = lIIIlIIllIIlIIl("oph7rAWaQrn4ROSk46zQmg==", "jBImv");
        lllIIIlllIIl[lllIIIlllIlI[4]] = lIIIlIIllIIllII("3hIuacrDxuvWBdhRiNPBbA==", "QmqEJ");
        lllIIIlllIIl[lllIIIlllIlI[25]] = lIIIlIIllIIllll("NgEdOg86Bxcn", "eNHnG");
        lllIIIlllIIl[lllIIIlllIlI[13]] = lIIIlIIllIIllII("lXPjJTn9G+d7cW3/lwWsjA==", "EqYgt");
        lllIIIlllIIl[lllIIIlllIlI[12]] = lIIIlIIllIIlIIl("zu9gbHHo4u4wrvVnA5rwzA==", "pHOqS");
        lllIIIlllIIl[lllIIIlllIlI[36]] = lIIIlIIllIIllII("jkg96zpWAK3qvGlJaB6tGA==", "jFRib");
        lllIIIlllIIl[lllIIIlllIlI[40]] = lIIIlIIllIIlIIl("Qc0bh2giqJSAJwhP1dgPXg==", "LquqZ");
        lllIIIlllIIl[lllIIIlllIlI[41]] = lIIIlIIllIIlIIl("A0l954GzFfSI7GSVIkpzBQ==", "isNHy");
        lllIIIlllIIl[lllIIIlllIlI[38]] = lIIIlIIllIIlIIl("vMV9stgJil6imO2GgLG6Kg==", "dczgI");
        lllIIIlllIIl[lllIIIlllIlI[47]] = lIIIlIIllIIllII("EqnHDwo1ZGRQBmgInDUdRg==", "CJeuB");
        lllIIIlllIIl[lllIIIlllIlI[37]] = lIIIlIIllIIllII("JJy0mec9jz2sR6x7A9LuLQ==", "kviSz");
        lllIIIlllIIl[lllIIIlllIlI[10]] = lIIIlIIllIIllII("AbuTsQyOVHYfa5VONCtEZg==", "slBvA");
        lllIIIlllIIl[lllIIIlllIlI[52]] = lIIIlIIllIIllll("Nz4DGgQmOAcRBTA4", "yqQNL");
        lllIIIlllIIl[lllIIIlllIlI[53]] = lIIIlIIllIIlIIl("ArbwVYH97dAVec683v7YfQ==", "AKXwT");
        lllIIIlllIIl[lllIIIlllIlI[42]] = lIIIlIIllIIllII("xXk4aPUyIBmDas70bUnXyw==", "pPWev");
        lllIIIlllIIl[lllIIIlllIlI[33]] = lIIIlIIllIIllll("ICsxJS8rLTc=", "tdazy");
        lllIIIlllIIl[lllIIIlllIlI[28]] = lIIIlIIllIIllll("NxoRBiI/DAMdNjM=", "zSUBn");
    }

    private EnumC0004e(String str, int i, List list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier supplier, EnumC0006g enumC0006g) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (lIIIlIIllIllIlI(it.hasNext() ? 1 : 0)) {
                Triple triple = (Triple) it.next();
                arrayList.add(new WorldArea(SquireSepulchre.a((RegionPoint) triple.getFirst()), ((Integer) triple.getSecond()).intValue(), ((Integer) triple.getThird()).intValue()));
                "".length();
                "".length();
                if ((-"  ".length()) >= 0) {
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
        this.object = supplier;
        this.type = enumC0006g;
    }

    private static boolean lIIIlIIllIllIlI(int i) {
        return i != 0;
    }

    private static boolean lIIIlIIllIlIllI(int i, int i2) {
        return i <= i2;
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    private static String lIIIlIIllIIllII(String lllllllllllllllIIllIllIIIIllIlIl, String lllllllllllllllIIllIllIIIIllIlII) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIIIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIIIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIllIIIIllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIllIIIIllIlll.init(lllIIIlllIlI[14], lllllllllllllllIIllIllIIIIlllIII);
            return new String(lllllllllllllllIIllIllIIIIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIllIllIIIIllIllI) {
            lllllllllllllllIIllIllIIIIllIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    public boolean a(C0003d c0003d, SquireSepulchre squireSepulchre) {
        Player local = Players.getLocal();
        if (!lIIIlIIllIlIIlI(local) && !lIIIlIIllIlIIll(a((Locatable) local) ? 1 : 0)) {
            a(squireSepulchre);
            if (!lIIIlIIllIllIlI(a(c0003d) ? 1 : 0)) {
                Movement.setDestination(this.startPoint.get());
                return lllIIIlllIlI[2];
            }
            WorldPoint worldPoint = this.destination.get();
            System.out.println(worldPoint);
            Movement.setDestination(worldPoint);
            return lllIIIlllIlI[2];
        }
        return lllIIIlllIlI[0];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + name());
    }

    private static boolean lIIIlIIllIlIlll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIIIlIIllIlIlIl(int i, int i2) {
        return i >= i2;
    }

    public static EnumC0004e valueOf(String str) {
        return (EnumC0004e) Enum.valueOf(EnumC0004e.class, str);
    }

    private static boolean lIIIlIIllIlIIll(int i) {
        return i == 0;
    }

    static {
        lIIIlIIllIlIIIl();
        lIIIlIIllIlIIII();
        WEST_I_III = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[4]], lllIIIlllIlI[0], new RegionPoint(lllIIIlllIlI[0], lllIIIlllIlI[22], lllIIIlllIlI[14], C0001b.C), lllIIIlllIlI[15], lllIIIlllIlI[17], new RegionPoint(lllIIIlllIlI[0], lllIIIlllIlI[23], lllIIIlllIlI[14], C0001b.C), new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[24], lllIIIlllIlI[14], C0001b.C), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(lllIIIlllIlI[20], lllIIIlllIlI[21], lllIIIlllIlI[14], C0001b.D));
            String[] strArr = new String[lllIIIlllIlI[2]];
            strArr[lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[6]];
            return TileObjects.getNearest(a, strArr);
        }, EnumC0006g.BLADE);
        SOUTH_I_I = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[25]], lllIIIlllIlI[2], List.of(new Triple(new RegionPoint(lllIIIlllIlI[21], lllIIIlllIlI[9], lllIIIlllIlI[14], C0001b.C), Integer.valueOf(lllIIIlllIlI[4]), Integer.valueOf(lllIIIlllIlI[9])), new Triple(new RegionPoint(lllIIIlllIlI[24], lllIIIlllIlI[26], lllIIIlllIlI[14], C0001b.E), Integer.valueOf(lllIIIlllIlI[9]), Integer.valueOf(lllIIIlllIlI[17]))), new RegionPoint(lllIIIlllIlI[27], lllIIIlllIlI[9], lllIIIlllIlI[14], C0001b.C), new RegionPoint(lllIIIlllIlI[28], lllIIIlllIlI[8], lllIIIlllIlI[14], C0001b.C), () -> {
            String[] strArr = new String[lllIIIlllIlI[2]];
            strArr[lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[7]];
            return TileObjects.getNearest(strArr);
        }, EnumC0006g.BLADE_I);
        EAST_I_III = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[13]], lllIIIlllIlI[14], new RegionPoint(lllIIIlllIlI[29], lllIIIlllIlI[30], lllIIIlllIlI[14], C0001b.C), lllIIIlllIlI[11], lllIIIlllIlI[18], new RegionPoint(lllIIIlllIlI[31], lllIIIlllIlI[30], lllIIIlllIlI[14], C0001b.C), new RegionPoint(lllIIIlllIlI[32], lllIIIlllIlI[13], lllIIIlllIlI[14], C0001b.C), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[3]]) ? 1 : 0) && lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                    ?? r0 = lllIIIlllIlI[2];
                    "".length();
                    return "   ".length() <= (((((234 + 62) - 176) + 134) ^ (((58 + 31) - (-36)) + 41)) & (((119 ^ 33) ^ (123 ^ 117)) ^ (-" ".length()))) ? ((((32 + 157) - 182) + 245) ^ (((162 + 13) - 108) + 111)) & (((100 ^ 65) ^ (107 ^ 0)) ^ (-" ".length())) : r0;
                }
                return lllIIIlllIlI[0];
            });
        }, EnumC0006g.BLADE);
        WEST_II_I = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[12]], lllIIIlllIlI[9], new RegionPoint(lllIIIlllIlI[13], lllIIIlllIlI[33], lllIIIlllIlI[14], C0001b.G), lllIIIlllIlI[19], lllIIIlllIlI[1], new RegionPoint(lllIIIlllIlI[13], lllIIIlllIlI[34], lllIIIlllIlI[14], C0001b.G), new RegionPoint(lllIIIlllIlI[19], lllIIIlllIlI[35], lllIIIlllIlI[14], C0001b.G), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[19]]) ? 1 : 0) && lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                    ?? r0 = lllIIIlllIlI[2];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIIIlllIlI[0];
            });
        }, EnumC0006g.BLADE);
        WEST_II_VII = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[36]], lllIIIlllIlI[1], List.of(new Triple(new RegionPoint(lllIIIlllIlI[26], lllIIIlllIlI[37], lllIIIlllIlI[2], C0001b.I), Integer.valueOf(lllIIIlllIlI[11]), Integer.valueOf(lllIIIlllIlI[11])), new Triple(new RegionPoint(lllIIIlllIlI[26], lllIIIlllIlI[30], lllIIIlllIlI[2], C0001b.I), Integer.valueOf(lllIIIlllIlI[11]), Integer.valueOf(lllIIIlllIlI[8]))), new RegionPoint(lllIIIlllIlI[2], lllIIIlllIlI[33], lllIIIlllIlI[2], C0001b.G), new RegionPoint(lllIIIlllIlI[38], lllIIIlllIlI[39], lllIIIlllIlI[2], C0001b.G), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[18]]) ? 1 : 0) && lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[2])) {
                    ?? r0 = lllIIIlllIlI[2];
                    "".length();
                    return " ".length() >= (85 ^ 81) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIIIlllIlI[0];
            });
        }, EnumC0006g.BLADE_II);
        SOUTH_II_III = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[40]], lllIIIlllIlI[5], new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[6], lllIIIlllIlI[14], C0001b.G), lllIIIlllIlI[9], lllIIIlllIlI[2], new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[6], lllIIIlllIlI[14], C0001b.G), new RegionPoint(lllIIIlllIlI[6], lllIIIlllIlI[3], lllIIIlllIlI[14], C0001b.G), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[8]]) ? 1 : 0) && lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                    ?? r0 = lllIIIlllIlI[2];
                    "".length();
                    return " ".length() == "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIIIlllIlI[0];
            });
        }, EnumC0006g.BLADE_III);
        NORTH_II_III = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[41]], lllIIIlllIlI[11], new RegionPoint(lllIIIlllIlI[42], lllIIIlllIlI[43], lllIIIlllIlI[14], C0001b.G), lllIIIlllIlI[19], lllIIIlllIlI[9], new RegionPoint(lllIIIlllIlI[21], lllIIIlllIlI[43], lllIIIlllIlI[14], C0001b.G), new RegionPoint(lllIIIlllIlI[24], lllIIIlllIlI[44], lllIIIlllIlI[14], C0001b.G), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[17]]) ? 1 : 0) && lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                    ?? r0 = lllIIIlllIlI[2];
                    "".length();
                    return ((51 ^ 108) & ((23 ^ 72) ^ (-1))) > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIIIlllIlI[0];
            });
        }, EnumC0006g.BLADE_IV);
        NORTH_III_V = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[38]], lllIIIlllIlI[15], new RegionPoint(lllIIIlllIlI[45], lllIIIlllIlI[7], lllIIIlllIlI[14], C0001b.J), lllIIIlllIlI[9], lllIIIlllIlI[9], new RegionPoint(lllIIIlllIlI[45], lllIIIlllIlI[4], lllIIIlllIlI[14], C0001b.J), new RegionPoint(lllIIIlllIlI[46], lllIIIlllIlI[40], lllIIIlllIlI[14], C0001b.J), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[16]]) ? 1 : 0) && lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                    ?? r0 = lllIIIlllIlI[2];
                    "".length();
                    return " ".length() > " ".length() ? ((30 ^ 66) ^ (105 ^ 113)) & (((99 ^ 10) ^ (140 ^ 161)) ^ (-" ".length())) : r0;
                }
                return lllIIIlllIlI[0];
            });
        }, EnumC0006g.GOLDEN_BLADE_II);
        WEST_III_III = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[47]], lllIIIlllIlI[16], new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[48], lllIIIlllIlI[14], C0001b.J), lllIIIlllIlI[19], lllIIIlllIlI[7], new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[29], lllIIIlllIlI[14], C0001b.J), new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[46], lllIIIlllIlI[14], C0001b.J), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[15]]) ? 1 : 0) && lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                    ?? r0 = lllIIIlllIlI[2];
                    "".length();
                    return 0 != 0 ? ((((214 + 155) - 148) + 31) ^ (((89 + 162) - 156) + 73)) & (((0 ^ 57) ^ (24 ^ 117)) ^ (-" ".length())) : r0;
                }
                return lllIIIlllIlI[0];
            });
        }, EnumC0006g.GOLDEN_BLADE_I);
        NORTH_III_III = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[37]], lllIIIlllIlI[17], List.of(new Triple(new RegionPoint(lllIIIlllIlI[49], lllIIIlllIlI[49], lllIIIlllIlI[14], C0001b.J), Integer.valueOf(lllIIIlllIlI[9]), Integer.valueOf(lllIIIlllIlI[17])), new Triple(new RegionPoint(lllIIIlllIlI[26], lllIIIlllIlI[30], lllIIIlllIlI[2], C0001b.I), Integer.valueOf(lllIIIlllIlI[11]), Integer.valueOf(lllIIIlllIlI[8]))), new RegionPoint(lllIIIlllIlI[48], lllIIIlllIlI[50], lllIIIlllIlI[14], C0001b.J), new RegionPoint(lllIIIlllIlI[51], lllIIIlllIlI[35], lllIIIlllIlI[14], C0001b.J), () -> {
            return TileObjects.getNearest(tileObject -> {
                if (lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[11]]) ? 1 : 0) && lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                    ?? r0 = lllIIIlllIlI[2];
                    "".length();
                    return (57 ^ 61) < ((32 ^ 103) & ((23 ^ 80) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIIIlllIlI[0];
            });
        }, EnumC0006g.GOLDEN_BLADE_I);
        WEST_III_VI = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[10]], lllIIIlllIlI[8], List.of(new Triple(new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[6], lllIIIlllIlI[14], C0001b.J), Integer.valueOf(lllIIIlllIlI[9]), Integer.valueOf(lllIIIlllIlI[17])), new Triple(new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[9], lllIIIlllIlI[14], C0001b.J), Integer.valueOf(lllIIIlllIlI[9]), Integer.valueOf(lllIIIlllIlI[17]))), new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[6], lllIIIlllIlI[14], C0001b.J), new RegionPoint(lllIIIlllIlI[10], lllIIIlllIlI[5], lllIIIlllIlI[14], C0001b.J), () -> {
            String[] strArr = new String[lllIIIlllIlI[2]];
            strArr[lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[5]];
            return TileObjects.getNearest(strArr);
        }, EnumC0006g.GOLDEN_BLADE_III);
        NORTH_IV_III = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[52]], lllIIIlllIlI[18], new RegionPoint(lllIIIlllIlI[8], lllIIIlllIlI[30], lllIIIlllIlI[14], C0001b.L), lllIIIlllIlI[7], lllIIIlllIlI[17], new RegionPoint(lllIIIlllIlI[8], lllIIIlllIlI[46], lllIIIlllIlI[14], C0001b.L), new RegionPoint(lllIIIlllIlI[19], lllIIIlllIlI[26], lllIIIlllIlI[14], C0001b.L), () -> {
            String[] strArr = new String[lllIIIlllIlI[2]];
            strArr[lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[1]];
            return TileObjects.getNearest(strArr);
        }, EnumC0006g.GOLDEN_BLADE_IV);
        SOUTH_IV_VI = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[53]], lllIIIlllIlI[19], new RegionPoint(lllIIIlllIlI[5], lllIIIlllIlI[8], lllIIIlllIlI[14], C0001b.L), lllIIIlllIlI[11], lllIIIlllIlI[11], new RegionPoint(lllIIIlllIlI[8], lllIIIlllIlI[8], lllIIIlllIlI[14], C0001b.L), new RegionPoint(lllIIIlllIlI[47], lllIIIlllIlI[45], lllIIIlllIlI[14], C0001b.M), () -> {
            String[] strArr = new String[lllIIIlllIlI[2]];
            strArr[lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[9]];
            return TileObjects.getNearest(strArr);
        }, EnumC0006g.GOLDEN_BLADE_V);
        WEST_IV_I = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[42]], lllIIIlllIlI[3], new RegionPoint(lllIIIlllIlI[36], lllIIIlllIlI[25], lllIIIlllIlI[2], C0001b.L), lllIIIlllIlI[16], lllIIIlllIlI[9], new RegionPoint(lllIIIlllIlI[36], lllIIIlllIlI[12], lllIIIlllIlI[2], C0001b.L), new RegionPoint(lllIIIlllIlI[15], lllIIIlllIlI[39], lllIIIlllIlI[2], C0001b.L), () -> {
            String[] strArr = new String[lllIIIlllIlI[2]];
            strArr[lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[14]];
            return TileObjects.getNearest(strArr);
        }, EnumC0006g.GOLDEN_BLADE_VI);
        TOP_V_IV = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[33]], lllIIIlllIlI[7], new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[45], lllIIIlllIlI[14], C0001b.N), lllIIIlllIlI[25], lllIIIlllIlI[11], new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[45], lllIIIlllIlI[14], C0001b.N), new RegionPoint(lllIIIlllIlI[5], lllIIIlllIlI[24], lllIIIlllIlI[14], C0001b.N), () -> {
            String[] strArr = new String[lllIIIlllIlI[2]];
            strArr[lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[2]];
            return TileObjects.getNearest(strArr);
        }, EnumC0006g.BLUE_BLADE_I);
        MIDDLE_V_XI = new EnumC0004e(lllIIIlllIIl[lllIIIlllIlI[28]], lllIIIlllIlI[6], new RegionPoint(lllIIIlllIlI[23], lllIIIlllIlI[45], lllIIIlllIlI[2], C0001b.N), lllIIIlllIlI[6], lllIIIlllIlI[11], new RegionPoint(lllIIIlllIlI[29], lllIIIlllIlI[45], lllIIIlllIlI[2], C0001b.N), new RegionPoint(lllIIIlllIlI[51], lllIIIlllIlI[24], lllIIIlllIlI[2], C0001b.N), () -> {
            String[] strArr = new String[lllIIIlllIlI[2]];
            strArr[lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[0]];
            return TileObjects.getNearest(strArr);
        }, EnumC0006g.BLUE_BLADE_II);
        EnumC0004e[] enumC0004eArr = new EnumC0004e[lllIIIlllIlI[4]];
        enumC0004eArr[lllIIIlllIlI[0]] = WEST_I_III;
        enumC0004eArr[lllIIIlllIlI[2]] = SOUTH_I_I;
        enumC0004eArr[lllIIIlllIlI[14]] = EAST_I_III;
        enumC0004eArr[lllIIIlllIlI[9]] = WEST_II_I;
        enumC0004eArr[lllIIIlllIlI[1]] = WEST_II_VII;
        enumC0004eArr[lllIIIlllIlI[5]] = SOUTH_II_III;
        enumC0004eArr[lllIIIlllIlI[11]] = NORTH_II_III;
        enumC0004eArr[lllIIIlllIlI[15]] = NORTH_III_V;
        enumC0004eArr[lllIIIlllIlI[16]] = WEST_III_III;
        enumC0004eArr[lllIIIlllIlI[17]] = NORTH_III_III;
        enumC0004eArr[lllIIIlllIlI[8]] = WEST_III_VI;
        enumC0004eArr[lllIIIlllIlI[18]] = NORTH_IV_III;
        enumC0004eArr[lllIIIlllIlI[19]] = SOUTH_IV_VI;
        enumC0004eArr[lllIIIlllIlI[3]] = WEST_IV_I;
        enumC0004eArr[lllIIIlllIlI[7]] = TOP_V_IV;
        enumC0004eArr[lllIIIlllIlI[6]] = MIDDLE_V_XI;
        $VALUES = enumC0004eArr;
    }

    private static String lIIIlIIllIIllll(String lllllllllllllllIIllIllIIIIlIIIII, String lllllllllllllllIIllIllIIIIlIIlII) {
        String lllllllllllllllIIllIllIIIIlIIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIIIIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllIIIIlIIIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIllIllIIIIlIIlII.toCharArray();
        int lllllllllllllllIIllIllIIIIlIIIIl = lllIIIlllIlI[0];
        char[] charArray2 = lllllllllllllllIIllIllIIIIlIIIII2.toCharArray();
        int length = charArray2.length;
        int i = lllIIIlllIlI[0];
        while (lIIIlIIllIllIIl(i, length)) {
            char lllllllllllllllIIllIllIIIIlIIllI = charArray2[i];
            lllllllllllllllIIllIllIIIIlIIIll.append((char) (lllllllllllllllIIllIllIIIIlIIllI ^ charArray[lllllllllllllllIIllIllIIIIlIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIllIllIIIIlIIIIl++;
            i++;
            "".length();
            if (((((46 + 73) - (-29)) + 34) ^ (((144 + 39) - 181) + 177)) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIllIllIIIIlIIIll);
    }

    public static EnumC0004e[] values() {
        return (EnumC0004e[]) $VALUES.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v130, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v138, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v143, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v156, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v161, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v166, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v174, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v179, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v184, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v192, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v197, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v202, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v210, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v212, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v217, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v222, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v224, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v241, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v243, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v248, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v253, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v255, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v257, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    public boolean a(C0003d c0003d) {
        J b = c0003d.b(this.object.get());
        if (lIIIlIIllIlIIlI(b)) {
            return lllIIIlllIlI[0];
        }
        Player local = Players.getLocal();
        if (!lIIIlIIllIlIIlI(local) && !lIIIlIIllIlIIll(local.getWorldLocation().equals(this.startPoint.get()) ? 1 : 0)) {
            switch (C0005f.S[this.type.ordinal()]) {
                case 1:
                    return ((!lIIIlIIllIlIlII(b.aG(), C0001b.s) || lIIIlIIllIlIlIl(b.aF(), lllIIIlllIlI[1])) && !lIIIlIIllIlIlII(b.aG(), C0001b.v)) ? ((!lIIIlIIllIlIlII(b.aG(), C0001b.s) || lIIIlIIllIlIllI(b.aF(), lllIIIlllIlI[3])) && lIIIlIIllIlIlll(b.aG(), C0001b.t) && !lIIIlIIllIlIlII(b.aG(), C0001b.w)) ? lllIIIlllIlI[0] : lllIIIlllIlI[2] : lllIIIlllIlI[2];
                case 2:
                    return lIIIlIIllIlIlII(b.aG(), C0001b.s) ? lllIIIlllIlI[2] : lllIIIlllIlI[0];
                case 3:
                    if ((!lIIIlIIllIlIlII(b.aG(), C0001b.s) || !lIIIlIIllIllIII(b.aF(), lllIIIlllIlI[4])) && !lIIIlIIllIlIlII(b.aG(), C0001b.t)) {
                        return lllIIIlllIlI[0];
                    }
                    return lllIIIlllIlI[2];
                case 4:
                    return (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIIl(b.aF(), lllIIIlllIlI[5])) ? lllIIIlllIlI[2] : (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIII(b.aF(), lllIIIlllIlI[6])) ? lllIIIlllIlI[2] : lllIIIlllIlI[0];
                case 5:
                    return (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIIl(b.aF(), lllIIIlllIlI[5])) ? lllIIIlllIlI[2] : (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIII(b.aF(), lllIIIlllIlI[4])) ? lllIIIlllIlI[2] : lllIIIlllIlI[0];
                case 6:
                    return (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIIl(b.aF(), lllIIIlllIlI[5])) ? lllIIIlllIlI[2] : (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIII(b.aF(), lllIIIlllIlI[7])) ? lllIIIlllIlI[2] : lllIIIlllIlI[0];
                case 7:
                    return (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIIl(b.aF(), lllIIIlllIlI[1])) ? lllIIIlllIlI[2] : (!lIIIlIIllIlIlll(b.aG(), C0001b.u) || lIIIlIIllIlIlII(b.aG(), C0001b.v)) ? lllIIIlllIlI[2] : (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIII(b.aF(), lllIIIlllIlI[8])) ? lllIIIlllIlI[2] : lllIIIlllIlI[0];
                case 8:
                    return (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIIl(b.aF(), lllIIIlllIlI[9])) ? lllIIIlllIlI[2] : (!lIIIlIIllIlIlll(b.aG(), C0001b.u) || lIIIlIIllIlIlII(b.aG(), C0001b.v)) ? lllIIIlllIlI[2] : (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIII(b.aF(), lllIIIlllIlI[7])) ? lllIIIlllIlI[2] : lllIIIlllIlI[0];
                case 9:
                    return (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIII(b.aF(), lllIIIlllIlI[6])) ? lllIIIlllIlI[2] : (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIIl(b.aF(), lllIIIlllIlI[9])) ? lllIIIlllIlI[2] : lllIIIlllIlI[0];
                case 10:
                    return (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIIl(b.aF(), lllIIIlllIlI[9])) ? lllIIIlllIlI[2] : lllIIIlllIlI[0];
                case 11:
                    return (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIII(b.aF(), lllIIIlllIlI[10])) ? lllIIIlllIlI[2] : (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIIl(b.aF(), lllIIIlllIlI[11])) ? lllIIIlllIlI[2] : lllIIIlllIlI[0];
                case 12:
                    return (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIII(b.aF(), lllIIIlllIlI[12])) ? lllIIIlllIlI[2] : (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIIl(b.aF(), lllIIIlllIlI[11])) ? lllIIIlllIlI[2] : lllIIIlllIlI[0];
                case 13:
                    return (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIII(b.aF(), lllIIIlllIlI[13])) ? lllIIIlllIlI[2] : (lIIIlIIllIlIlII(b.aG(), C0001b.s) && lIIIlIIllIllIIl(b.aF(), lllIIIlllIlI[11])) ? lllIIIlllIlI[2] : lllIIIlllIlI[0];
                default:
                    return lllIIIlllIlI[0];
            }
        }
        return lllIIIlllIlI[0];
    }

    private static boolean lIIIlIIllIllIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIlIIllIlIIlI(Object obj) {
        return obj == null;
    }
}
