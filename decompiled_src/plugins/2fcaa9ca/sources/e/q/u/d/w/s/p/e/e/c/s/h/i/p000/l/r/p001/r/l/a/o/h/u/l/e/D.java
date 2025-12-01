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
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.D  reason: invalid package */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/D.class */
public final class D {
    private static /* synthetic */ String[] llIlllllIllI;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    /* synthetic */ Supplier<WorldPoint> destination;
    public /* synthetic */ Supplier<TileObject> object1;
    public static final /* synthetic */ D EAST_III_II;
    private static final /* synthetic */ D[] $VALUES;
    public static final /* synthetic */ D NORTH_IV_VI;
    private static /* synthetic */ int[] llIllllllIll;
    /* synthetic */ F type;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ D EAST_III_I;
    public /* synthetic */ Supplier<TileObject> object2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private boolean b(int i, int i2, J j, J j2) {
        return (lIIIIlllllIlIll(j.aG(), i) && lIIIIlllllIlIll(j.aF(), i2) && lIIIIlllllIlIll(j2.aG(), i) && lIIIIlllllIlIll(j2.aF(), i2)) ? llIllllllIll[1] : llIllllllIll[0];
    }

    public Supplier<WorldPoint> al() {
        return this.startPoint;
    }

    private D(String str, int i, RegionPoint regionPoint, int i2, int i3, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier supplier, Supplier supplier2, F f) {
        this.startAreas = () -> {
            return List.of(new WorldArea(SquireSepulchre.a(regionPoint), i2, i3));
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.destination = () -> {
            return SquireSepulchre.a(regionPoint3);
        };
        this.object1 = supplier;
        this.object2 = supplier2;
        this.type = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    public boolean a(C0003d c0003d) {
        J b = c0003d.b(this.object1.get());
        J b2 = c0003d.b(this.object2.get());
        if (!lIIIIlllllIIllI(b) || lIIIIlllllIIlll(b2)) {
            if (lIIIIlllllIIlll(b)) {
                System.out.println(llIlllllIllI[llIllllllIll[0]]);
            }
            System.out.println(llIlllllIllI[llIllllllIll[1]]);
            return llIllllllIll[0];
        }
        System.out.println("ID1: " + b.aG() + " | ticks1:" + b.aF());
        System.out.println("ID2: " + b2.aG() + " | ticks2:" + b2.aF());
        Player local = Players.getLocal();
        if (!lIIIIlllllIIlll(local) && !lIIIIlllllIlIII(local.getWorldLocation().equals(this.startPoint.get()) ? 1 : 0)) {
            switch (E.V[this.type.ordinal()]) {
                case 1:
                    return lIIIIlllllIlIIl(a(C0001b.o, llIllllllIll[2], b, b2) ? 1 : 0) ? llIllllllIll[1] : llIllllllIll[0];
                case 2:
                    return lIIIIlllllIlIIl(b(C0001b.o, llIllllllIll[2], b, b2) ? 1 : 0) ? llIllllllIll[1] : llIllllllIll[0];
                case 3:
                    if (!lIIIIlllllIlIIl(a(C0001b.o, llIllllllIll[2], C0001b.p, llIllllllIll[0], b, b2) ? 1 : 0) && !lIIIIlllllIlIIl(a(C0001b.n, llIllllllIll[0], C0001b.p, llIllllllIll[0], b, b2) ? 1 : 0)) {
                        return llIllllllIll[0];
                    }
                    return llIllllllIll[1];
                default:
                    return llIllllllIll[0];
            }
        }
        return llIllllllIll[0];
    }

    private static boolean lIIIIlllllIlIll(int i, int i2) {
        return i == i2;
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    private static boolean lIIIIlllllIIllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIlllllIlIlI(int i, int i2) {
        return i != i2;
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + name());
    }

    private D(String str, int i, List list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier supplier, Supplier supplier2, F f) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (lIIIIlllllIlIIl(it.hasNext() ? 1 : 0)) {
                Triple triple = (Triple) it.next();
                arrayList.add(new WorldArea(SquireSepulchre.a((RegionPoint) triple.getFirst()), ((Integer) triple.getSecond()).intValue(), ((Integer) triple.getThird()).intValue()));
                "".length();
                "".length();
                if (" ".length() == 0) {
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
        this.object1 = supplier;
        this.object2 = supplier2;
        this.type = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean a(int i, int i2, int i3, int i4, J j, J j2) {
        return ((!lIIIIlllllIlIll(j.aG(), i) || (lIIIIlllllIlIIl(i2) && lIIIIlllllIlIlI(j.aF(), i2))) && (!lIIIIlllllIlIll(j2.aG(), i3) || (lIIIIlllllIlIIl(i4) && !lIIIIlllllIlIll(j2.aF(), i4)))) ? llIllllllIll[0] : llIllllllIll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private boolean a(int i, J j, J j2) {
        return (!lIIIIlllllIlIlI(j.aG(), i) || lIIIIlllllIlIll(j2.aG(), i)) ? llIllllllIll[1] : llIllllllIll[0];
    }

    private static void lIIIIlllllIIlII() {
        llIlllllIllI = new String[llIllllllIll[29]];
        llIlllllIllI[llIllllllIll[0]] = lIIIIllllIlllIl("2lF4irtHyXNdnChR/jMJeA==", "JQpps");
        llIlllllIllI[llIllllllIll[1]] = lIIIIllllIllllI("asqn7anzvQ7n+Tsyzs2yfg==", "uclZt");
        llIlllllIllI[llIllllllIll[2]] = lIIIIllllIlllIl("tydM7oW7gKIC/WPGF0nAjWYWOq1/P7Sk", "TydZQ");
        llIlllllIllI[llIllllllIll[5]] = lIIIIllllIlllIl("zWi20XAaMYo24RIcMgKaGg==", "fmDnB");
        llIlllllIllI[llIllllllIll[7]] = lIIIIlllllIIIll("GAwwIzMrRRk2IDsQLw==", "OeJBA");
        llIlllllIllI[llIllllllIll[10]] = lIIIIllllIllllI("M5HJ8t0U9eSTpxyOHUHtLQ==", "nWCZm");
        llIlllllIllI[llIllllllIll[12]] = lIIIIllllIllllI("m8gXXMOtu0mvigR0/Rv9Sg==", "XSSPt");
        llIlllllIllI[llIllllllIll[13]] = lIIIIllllIllllI("QQM2V4H1vhnzg6BRsyFVHQ==", "JVtKG");
        llIlllllIllI[llIllllllIll[14]] = lIIIIllllIllllI("Ub4Ii1BsttJPeXNlyAcnIw==", "CWRSF");
        llIlllllIllI[llIllllllIll[15]] = lIIIIllllIlllIl("qZNZ4DRe2nrp5oGe1t+mtQ==", "TBgse");
        llIlllllIllI[llIllllllIll[22]] = lIIIIllllIllllI("DeJZOWlyqMKkAg31Yy0gKg==", "ZOIst");
        llIlllllIllI[llIllllllIll[25]] = lIIIIllllIlllIl("1/alsr1+W0AsSWXji+JCYg==", "LSaQr");
    }

    static {
        lIIIIlllllIIlIl();
        lIIIIlllllIIlII();
        EAST_III_I = new D(llIlllllIllI[llIllllllIll[15]], llIllllllIll[0], new RegionPoint(llIllllllIll[16], llIllllllIll[17], llIllllllIll[2], C0001b.J), llIllllllIll[18], llIllllllIll[14], new RegionPoint(llIllllllIll[19], llIllllllIll[16], llIllllllIll[2], C0001b.J), new RegionPoint(llIllllllIll[20], llIllllllIll[21], llIllllllIll[2], C0001b.J), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(llIllllllIll[8], llIllllllIll[11], llIllllllIll[2], C0001b.J));
            String[] strArr = new String[llIllllllIll[1]];
            strArr[llIllllllIll[0]] = llIlllllIllI[llIllllllIll[14]];
            return TileObjects.getFirstAt(a, strArr);
        }, () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(llIllllllIll[8], llIllllllIll[9], llIllllllIll[2], C0001b.J));
            String[] strArr = new String[llIllllllIll[1]];
            strArr[llIllllllIll[0]] = llIlllllIllI[llIllllllIll[13]];
            return TileObjects.getFirstAt(a, strArr);
        }, F.STATUE_6_DOUBLE);
        EAST_III_II = new D(llIlllllIllI[llIllllllIll[22]], llIllllllIll[1], new RegionPoint(llIllllllIll[23], llIllllllIll[11], llIllllllIll[2], C0001b.J), llIllllllIll[5], llIllllllIll[15], new RegionPoint(llIllllllIll[20], llIllllllIll[21], llIllllllIll[2], C0001b.J), new RegionPoint(llIllllllIll[20], llIllllllIll[24], llIllllllIll[2], C0001b.J), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(llIllllllIll[8], llIllllllIll[11], llIllllllIll[2], C0001b.J));
            String[] strArr = new String[llIllllllIll[1]];
            strArr[llIllllllIll[0]] = llIlllllIllI[llIllllllIll[12]];
            return TileObjects.getFirstAt(a, strArr);
        }, () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(llIllllllIll[8], llIllllllIll[9], llIllllllIll[2], C0001b.J));
            String[] strArr = new String[llIllllllIll[1]];
            strArr[llIllllllIll[0]] = llIlllllIllI[llIllllllIll[10]];
            return TileObjects.getFirstAt(a, strArr);
        }, F.STATUE_6_DOUBLE);
        NORTH_IV_VI = new D(llIlllllIllI[llIllllllIll[25]], llIllllllIll[2], new RegionPoint(llIllllllIll[26], llIllllllIll[27], llIllllllIll[2], C0001b.L), llIllllllIll[14], llIllllllIll[14], new RegionPoint(llIllllllIll[26], llIllllllIll[24], llIllllllIll[2], C0001b.L), new RegionPoint(llIllllllIll[28], llIllllllIll[24], llIllllllIll[2], C0001b.L), () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(llIllllllIll[3], llIllllllIll[6], llIllllllIll[2], C0001b.L));
            String[] strArr = new String[llIllllllIll[1]];
            strArr[llIllllllIll[0]] = llIlllllIllI[llIllllllIll[7]];
            return TileObjects.getFirstAt(a, strArr);
        }, () -> {
            WorldPoint a = SquireSepulchre.a(new RegionPoint(llIllllllIll[3], llIllllllIll[4], llIllllllIll[2], C0001b.L));
            String[] strArr = new String[llIllllllIll[1]];
            strArr[llIllllllIll[0]] = llIlllllIllI[llIllllllIll[5]];
            return TileObjects.getFirstAt(a, strArr);
        }, F.STATUE_8_DOUBLE);
        D[] dArr = new D[llIllllllIll[5]];
        dArr[llIllllllIll[0]] = EAST_III_I;
        dArr[llIllllllIll[1]] = EAST_III_II;
        dArr[llIllllllIll[2]] = NORTH_IV_VI;
        $VALUES = dArr;
    }

    private static String lIIIIlllllIIIll(String lllllllllllllllIIlllIlIIlIIlIlll, String lllllllllllllllIIlllIlIIlIIlIllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIlIIlIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIlllIlIIlIIlIlII = lllllllllllllllIIlllIlIIlIIlIllI.toCharArray();
        int lllllllllllllllIIlllIlIIlIIlIIll = llIllllllIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIllllllIll[0];
        while (lIIIIlllllIllII(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIlllIlIIlIIlIlII[lllllllllllllllIIlllIlIIlIIlIIll % lllllllllllllllIIlllIlIIlIIlIlII.length]));
            "".length();
            lllllllllllllllIIlllIlIIlIIlIIll++;
            i++;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIIlllllIIlll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIIlllllIlIII(int i) {
        return i == 0;
    }

    private static boolean lIIIIlllllIllII(int i, int i2) {
        return i < i2;
    }

    public static D[] values() {
        return (D[]) $VALUES.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    public boolean a(C0003d c0003d, SquireSepulchre squireSepulchre) {
        Player local = Players.getLocal();
        if (!lIIIIlllllIIlll(local) && !lIIIIlllllIlIII(a((Locatable) local) ? 1 : 0)) {
            a(squireSepulchre);
            if (!lIIIIlllllIlIIl(a(c0003d) ? 1 : 0)) {
                Movement.setDestination(this.startPoint.get());
                return llIllllllIll[1];
            }
            System.out.println(llIlllllIllI[llIllllllIll[2]]);
            Movement.setDestination(this.destination.get());
            return llIllllllIll[1];
        }
        return llIllllllIll[0];
    }

    private static void lIIIIlllllIIlIl() {
        llIllllllIll = new int[30];
        llIllllllIll[0] = (89 ^ 71) & ((44 ^ 50) ^ (-1));
        llIllllllIll[1] = " ".length();
        llIllllllIll[2] = "  ".length();
        llIllllllIll[3] = 116 ^ 92;
        llIllllllIll[4] = (33 ^ 38) ^ (107 ^ 84);
        llIllllllIll[5] = "   ".length();
        llIllllllIll[6] = 171 ^ 152;
        llIllllllIll[7] = 199 ^ 195;
        llIllllllIll[8] = 26 ^ 54;
        llIllllllIll[9] = 124 ^ 91;
        llIllllllIll[10] = (59 ^ 74) ^ (217 ^ 173);
        llIllllllIll[11] = (216 ^ 141) ^ (113 ^ 1);
        llIllllllIll[12] = (((121 + 0) - 86) + 123) ^ (((90 + 99) - 153) + 116);
        llIllllllIll[13] = 21 ^ 18;
        llIllllllIll[14] = (96 ^ 53) ^ (92 ^ 1);
        llIllllllIll[15] = 165 ^ 172;
        llIllllllIll[16] = 20 ^ 48;
        llIllllllIll[17] = 149 ^ 136;
        llIllllllIll[18] = 15 ^ 2;
        llIllllllIll[19] = 13 ^ 34;
        llIllllllIll[20] = 110 ^ 94;
        llIllllllIll[21] = (((66 + 61) - 87) + 98) ^ (((94 + 29) - 34) + 78);
        llIllllllIll[22] = (64 ^ 118) ^ (166 ^ 154);
        llIllllllIll[23] = (70 ^ 90) ^ (59 ^ 9);
        llIllllllIll[24] = 94 ^ 104;
        llIllllllIll[25] = (201 ^ 180) ^ (49 ^ 71);
        llIllllllIll[26] = (((57 + 128) - 107) + 88) ^ (((42 + 26) - 48) + 120);
        llIllllllIll[27] = 156 ^ 169;
        llIllllllIll[28] = (75 ^ 41) ^ (52 ^ 118);
        llIllllllIll[29] = 39 ^ 43;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean a(Locatable locatable) {
        for (WorldArea worldArea : this.startAreas.get()) {
            if (lIIIIlllllIlIIl(worldArea.contains(locatable) ? 1 : 0)) {
                return llIllllllIll[1];
            }
            "".length();
            if ("   ".length() == 0) {
                return ((87 ^ 14) ^ (108 ^ 56)) & (((111 ^ 17) ^ (0 ^ 115)) ^ (-" ".length()));
            }
        }
        return llIllllllIll[0];
    }

    private static boolean lIIIIlllllIlIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private boolean a(int i, int i2, J j, J j2) {
        return ((!lIIIIlllllIlIll(j.aG(), i) || lIIIIlllllIlIlI(j.aF(), i2)) && !(lIIIIlllllIlIll(j2.aG(), i) && lIIIIlllllIlIll(j2.aF(), i2))) ? llIllllllIll[0] : llIllllllIll[1];
    }

    private static String lIIIIllllIllllI(String lllllllllllllllIIlllIlIIIlllIlIl, String lllllllllllllllIIlllIlIIIlllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIlIIIlllIlII.getBytes(StandardCharsets.UTF_8)), llIllllllIll[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllllllIll[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIlIIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIlIIIlllIllI) {
            lllllllllllllllIIlllIlIIIlllIllI.printStackTrace();
            return null;
        }
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    private static String lIIIIllllIlllIl(String lllllllllllllllIIlllIlIIlIIIIIlI, String lllllllllllllllIIlllIlIIlIIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlllIlIIlIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIlIIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIlIIlIIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIlIIlIIIIlII.init(llIllllllIll[2], lllllllllllllllIIlllIlIIlIIIIlIl);
            return new String(lllllllllllllllIIlllIlIIlIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIlIIlIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIlIIlIIIIIll) {
            lllllllllllllllIIlllIlIIlIIIIIll.printStackTrace();
            return null;
        }
    }
}
