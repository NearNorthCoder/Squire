/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Triple
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.E;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.F;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d;
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

public final class D
extends Enum<D> {
    private static /* synthetic */ String[] llIlllllIllI;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    /* synthetic */ Supplier<WorldPoint> destination;
    public /* synthetic */ Supplier<TileObject> object1;
    public static final /* synthetic */ /* enum */ D EAST_III_II;
    private static final /* synthetic */ D[] $VALUES;
    public static final /* synthetic */ /* enum */ D NORTH_IV_VI;
    private static /* synthetic */ int[] llIllllllIll;
    /* synthetic */ F type;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ /* enum */ D EAST_III_I;
    public /* synthetic */ Supplier<TileObject> object2;

    private boolean b(int n2, int n3, J j2, J j3) {
        if (D.lIIIIlllllIlIll(j2.aG(), n2) && D.lIIIIlllllIlIll(j2.aF(), n3) && D.lIIIIlllllIlIll(j3.aG(), n2) && D.lIIIIlllllIlIll(j3.aF(), n3)) {
            return llIllllllIll[1];
        }
        return llIllllllIll[0];
    }

    public Supplier<WorldPoint> al() {
        return this.startPoint;
    }

    private D(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier<TileObject> supplier, Supplier<TileObject> supplier2, F f2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.object1 = supplier;
        this.object2 = supplier2;
        this.type = f2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2) {
        D lllllllllllllllIIlllIlIIlllIIIII;
        void lllllllllllllllIIlllIlIIllIlllIl;
        void lllllllllllllllIIlllIlIIllIllllI;
        J j2 = d2.b(this.object1.get());
        J j3 = d2.b(this.object2.get());
        if (!D.lIIIIlllllIIllI(j2) || D.lIIIIlllllIIlll(j3)) {
            if (D.lIIIIlllllIIlll(lllllllllllllllIIlllIlIIllIllllI)) {
                System.out.println(llIlllllIllI[llIllllllIll[0]]);
            }
            System.out.println(llIlllllIllI[llIllllllIll[1]]);
            return llIllllllIll[0];
        }
        System.out.println("ID1: " + lllllllllllllllIIlllIlIIllIllllI.aG() + " | ticks1:" + lllllllllllllllIIlllIlIIllIllllI.aF());
        System.out.println("ID2: " + lllllllllllllllIIlllIlIIllIlllIl.aG() + " | ticks2:" + lllllllllllllllIIlllIlIIllIlllIl.aF());
        Player lllllllllllllllIIlllIlIIllIlllII = Players.getLocal();
        if (D.lIIIIlllllIIlll(lllllllllllllllIIlllIlIIllIlllII)) {
            return llIllllllIll[0];
        }
        if (D.lIIIIlllllIlIII(lllllllllllllllIIlllIlIIllIlllII.getWorldLocation().equals((Object)lllllllllllllllIIlllIlIIlllIIIII.startPoint.get()) ? 1 : 0)) {
            return llIllllllIll[0];
        }
        switch (E.V[lllllllllllllllIIlllIlIIlllIIIII.type.ordinal()]) {
            case 1: {
                if (D.lIIIIlllllIlIIl(lllllllllllllllIIlllIlIIlllIIIII.a(b.o, llIllllllIll[2], (J)lllllllllllllllIIlllIlIIllIllllI, (J)lllllllllllllllIIlllIlIIllIlllIl) ? 1 : 0)) {
                    return llIllllllIll[1];
                }
                return llIllllllIll[0];
            }
            case 2: {
                if (D.lIIIIlllllIlIIl(lllllllllllllllIIlllIlIIlllIIIII.b(b.o, llIllllllIll[2], (J)lllllllllllllllIIlllIlIIllIllllI, (J)lllllllllllllllIIlllIlIIllIlllIl) ? 1 : 0)) {
                    return llIllllllIll[1];
                }
                return llIllllllIll[0];
            }
            case 3: {
                if (D.lIIIIlllllIlIIl(lllllllllllllllIIlllIlIIlllIIIII.a(b.o, llIllllllIll[2], b.p, llIllllllIll[0], (J)lllllllllllllllIIlllIlIIllIllllI, (J)lllllllllllllllIIlllIlIIllIlllIl) ? 1 : 0)) {
                    return llIllllllIll[1];
                }
                if (D.lIIIIlllllIlIIl(lllllllllllllllIIlllIlIIlllIIIII.a(b.n, llIllllllIll[0], b.p, llIllllllIll[0], (J)lllllllllllllllIIlllIlIIllIllllI, (J)lllllllllllllllIIlllIlIIllIlllIl) ? 1 : 0)) {
                    return llIllllllIll[1];
                }
                return llIllllllIll[0];
            }
        }
        return llIllllllIll[0];
    }

    private static boolean lIIIIlllllIlIll(int n2, int n3) {
        return n2 == n3;
    }

    public static D valueOf(String string) {
        return Enum.valueOf(D.class, string);
    }

    private static boolean lIIIIlllllIIllI(Object object) {
        return object != null;
    }

    private static boolean lIIIIlllllIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private D(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier<TileObject> supplier, Supplier<TileObject> supplier2, F f2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator lllllllllllllllIIlllIlIIlIlIIIll = list.iterator();
            while (D.lIIIIlllllIlIIl(lllllllllllllllIIlllIlIIlIlIIIll.hasNext() ? 1 : 0)) {
                void lllllllllllllllIIlllIlIIlIlIIlII;
                Triple lllllllllllllllIIlllIlIIlIlIIIlI = (Triple)lllllllllllllllIIlllIlIIlIlIIIll.next();
                lllllllllllllllIIlllIlIIlIlIIlII.add(new WorldArea(SquireSepulchre.a((RegionPoint)lllllllllllllllIIlllIlIIlIlIIIlI.getFirst()), ((Integer)lllllllllllllllIIlllIlIIlIlIIIlI.getSecond()).intValue(), ((Integer)lllllllllllllllIIlllIlIIlIlIIIlI.getThird()).intValue()));
                "".length();
                "".length();
                if (" ".length() != 0) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.object1 = supplier;
        this.object2 = supplier2;
        this.type = f2;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3, int n4, int n5, J j2, J j3) {
        void lllllllllllllllIIlllIlIIllIIIlII;
        void lllllllllllllllIIlllIlIIllIIIlIl;
        void lllllllllllllllIIlllIlIIllIIIIlI;
        if (D.lIIIIlllllIlIll(j2.aG(), n2) && (!D.lIIIIlllllIlIIl(n3) || !D.lIIIIlllllIlIlI(j2.aF(), n3)) || D.lIIIIlllllIlIll(lllllllllllllllIIlllIlIIllIIIIlI.aG(), (int)lllllllllllllllIIlllIlIIllIIIlIl) && (!D.lIIIIlllllIlIIl((int)lllllllllllllllIIlllIlIIllIIIlII) || D.lIIIIlllllIlIll(lllllllllllllllIIlllIlIIllIIIIlI.aF(), (int)lllllllllllllllIIlllIlIIllIIIlII))) {
            return llIllllllIll[1];
        }
        return llIllllllIll[0];
    }

    private boolean a(int n2, J j2, J j3) {
        if (!D.lIIIIlllllIlIlI(j2.aG(), n2) || D.lIIIIlllllIlIll(j3.aG(), n2)) {
            return llIllllllIll[1];
        }
        return llIllllllIll[0];
    }

    private static void lIIIIlllllIIlII() {
        llIlllllIllI = new String[llIllllllIll[29]];
        D.llIlllllIllI[D.llIllllllIll[0]] = D.lIIIIllllIlllIl("2lF4irtHyXNdnChR/jMJeA==", "JQpps");
        D.llIlllllIllI[D.llIllllllIll[1]] = D.lIIIIllllIllllI("asqn7anzvQ7n+Tsyzs2yfg==", "uclZt");
        D.llIlllllIllI[D.llIllllllIll[2]] = D.lIIIIllllIlllIl("tydM7oW7gKIC/WPGF0nAjWYWOq1/P7Sk", "TydZQ");
        D.llIlllllIllI[D.llIllllllIll[5]] = D.lIIIIllllIlllIl("zWi20XAaMYo24RIcMgKaGg==", "fmDnB");
        D.llIlllllIllI[D.llIllllllIll[7]] = D.lIIIIlllllIIIll("GAwwIzMrRRk2IDsQLw==", "OeJBA");
        D.llIlllllIllI[D.llIllllllIll[10]] = D.lIIIIllllIllllI("M5HJ8t0U9eSTpxyOHUHtLQ==", "nWCZm");
        D.llIlllllIllI[D.llIllllllIll[12]] = D.lIIIIllllIllllI("m8gXXMOtu0mvigR0/Rv9Sg==", "XSSPt");
        D.llIlllllIllI[D.llIllllllIll[13]] = D.lIIIIllllIllllI("QQM2V4H1vhnzg6BRsyFVHQ==", "JVtKG");
        D.llIlllllIllI[D.llIllllllIll[14]] = D.lIIIIllllIllllI("Ub4Ii1BsttJPeXNlyAcnIw==", "CWRSF");
        D.llIlllllIllI[D.llIllllllIll[15]] = D.lIIIIllllIlllIl("qZNZ4DRe2nrp5oGe1t+mtQ==", "TBgse");
        D.llIlllllIllI[D.llIllllllIll[22]] = D.lIIIIllllIllllI("DeJZOWlyqMKkAg31Yy0gKg==", "ZOIst");
        D.llIlllllIllI[D.llIllllllIll[25]] = D.lIIIIllllIlllIl("1/alsr1+W0AsSWXji+JCYg==", "LSaQr");
    }

    static {
        D.lIIIIlllllIIlIl();
        D.lIIIIlllllIIlII();
        EAST_III_I = new D(new RegionPoint(llIllllllIll[16], llIllllllIll[17], llIllllllIll[2], b.J), llIllllllIll[18], llIllllllIll[14], new RegionPoint(llIllllllIll[19], llIllllllIll[16], llIllllllIll[2], b.J), new RegionPoint(llIllllllIll[20], llIllllllIll[21], llIllllllIll[2], b.J), () -> {
            String[] stringArray = new String[llIllllllIll[1]];
            stringArray[D.llIllllllIll[0]] = llIlllllIllI[llIllllllIll[14]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(llIllllllIll[8], llIllllllIll[11], llIllllllIll[2], b.J)), (String[])stringArray);
        }, () -> {
            String[] stringArray = new String[llIllllllIll[1]];
            stringArray[D.llIllllllIll[0]] = llIlllllIllI[llIllllllIll[13]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(llIllllllIll[8], llIllllllIll[9], llIllllllIll[2], b.J)), (String[])stringArray);
        }, F.STATUE_6_DOUBLE);
        EAST_III_II = new D(new RegionPoint(llIllllllIll[23], llIllllllIll[11], llIllllllIll[2], b.J), llIllllllIll[5], llIllllllIll[15], new RegionPoint(llIllllllIll[20], llIllllllIll[21], llIllllllIll[2], b.J), new RegionPoint(llIllllllIll[20], llIllllllIll[24], llIllllllIll[2], b.J), () -> {
            String[] stringArray = new String[llIllllllIll[1]];
            stringArray[D.llIllllllIll[0]] = llIlllllIllI[llIllllllIll[12]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(llIllllllIll[8], llIllllllIll[11], llIllllllIll[2], b.J)), (String[])stringArray);
        }, () -> {
            String[] stringArray = new String[llIllllllIll[1]];
            stringArray[D.llIllllllIll[0]] = llIlllllIllI[llIllllllIll[10]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(llIllllllIll[8], llIllllllIll[9], llIllllllIll[2], b.J)), (String[])stringArray);
        }, F.STATUE_6_DOUBLE);
        NORTH_IV_VI = new D(new RegionPoint(llIllllllIll[26], llIllllllIll[27], llIllllllIll[2], b.L), llIllllllIll[14], llIllllllIll[14], new RegionPoint(llIllllllIll[26], llIllllllIll[24], llIllllllIll[2], b.L), new RegionPoint(llIllllllIll[28], llIllllllIll[24], llIllllllIll[2], b.L), () -> {
            String[] stringArray = new String[llIllllllIll[1]];
            stringArray[D.llIllllllIll[0]] = llIlllllIllI[llIllllllIll[7]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(llIllllllIll[3], llIllllllIll[6], llIllllllIll[2], b.L)), (String[])stringArray);
        }, () -> {
            String[] stringArray = new String[llIllllllIll[1]];
            stringArray[D.llIllllllIll[0]] = llIlllllIllI[llIllllllIll[5]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(llIllllllIll[3], llIllllllIll[4], llIllllllIll[2], b.L)), (String[])stringArray);
        }, F.STATUE_8_DOUBLE);
        D[] dArray = new D[llIllllllIll[5]];
        dArray[D.llIllllllIll[0]] = EAST_III_I;
        dArray[D.llIllllllIll[1]] = EAST_III_II;
        dArray[D.llIllllllIll[2]] = NORTH_IV_VI;
        $VALUES = dArray;
    }

    private static String lIIIIlllllIIIll(String lllllllllllllllIIlllIlIIlIIlIlll, String lllllllllllllllIIlllIlIIlIIlIllI) {
        lllllllllllllllIIlllIlIIlIIlIlll = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIlIIlIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIlIIlIIlIlIl = new StringBuilder();
        char[] lllllllllllllllIIlllIlIIlIIlIlII = lllllllllllllllIIlllIlIIlIIlIllI.toCharArray();
        int lllllllllllllllIIlllIlIIlIIlIIll = llIllllllIll[0];
        char[] lllllllllllllllIIlllIlIIlIIIllIl = lllllllllllllllIIlllIlIIlIIlIlll.toCharArray();
        int lllllllllllllllIIlllIlIIlIIIllII = lllllllllllllllIIlllIlIIlIIIllIl.length;
        int lllllllllllllllIIlllIlIIlIIIlIll = llIllllllIll[0];
        while (D.lIIIIlllllIllII(lllllllllllllllIIlllIlIIlIIIlIll, lllllllllllllllIIlllIlIIlIIIllII)) {
            char lllllllllllllllIIlllIlIIlIIllIII = lllllllllllllllIIlllIlIIlIIIllIl[lllllllllllllllIIlllIlIIlIIIlIll];
            lllllllllllllllIIlllIlIIlIIlIlIl.append((char)(lllllllllllllllIIlllIlIIlIIllIII ^ lllllllllllllllIIlllIlIIlIIlIlII[lllllllllllllllIIlllIlIIlIIlIIll % lllllllllllllllIIlllIlIIlIIlIlII.length]));
            "".length();
            ++lllllllllllllllIIlllIlIIlIIlIIll;
            ++lllllllllllllllIIlllIlIIlIIIlIll;
            "".length();
            if ("  ".length() < "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlllIlIIlIIlIlIl);
    }

    private static boolean lIIIIlllllIIlll(Object object) {
        return object == null;
    }

    private static boolean lIIIIlllllIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIlllllIllII(int n2, int n3) {
        return n2 < n3;
    }

    public static D[] values() {
        return (D[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void lllllllllllllllIIlllIlIIlIllIlII;
        void lllllllllllllllIIlllIlIIlIllIIll;
        void lllllllllllllllIIlllIlIIlIllIIlI;
        D lllllllllllllllIIlllIlIIlIllIlIl;
        Player player = Players.getLocal();
        if (D.lIIIIlllllIIlll(player)) {
            return llIllllllIll[0];
        }
        if (D.lIIIIlllllIlIII(lllllllllllllllIIlllIlIIlIllIlIl.a((Locatable)lllllllllllllllIIlllIlIIlIllIIlI) ? 1 : 0)) {
            return llIllllllIll[0];
        }
        lllllllllllllllIIlllIlIIlIllIlIl.a((SquireSepulchre)lllllllllllllllIIlllIlIIlIllIIll);
        if (D.lIIIIlllllIlIIl(lllllllllllllllIIlllIlIIlIllIlIl.a((d)lllllllllllllllIIlllIlIIlIllIlII) ? 1 : 0)) {
            System.out.println(llIlllllIllI[llIllllllIll[2]]);
            Movement.setDestination((WorldPoint)lllllllllllllllIIlllIlIIlIllIlIl.destination.get());
            return llIllllllIll[1];
        }
        Movement.setDestination((WorldPoint)this.startPoint.get());
        return llIllllllIll[1];
    }

    private static void lIIIIlllllIIlIl() {
        llIllllllIll = new int[30];
        D.llIllllllIll[0] = (0x59 ^ 0x47) & ~(0x2C ^ 0x32);
        D.llIllllllIll[1] = " ".length();
        D.llIllllllIll[2] = "  ".length();
        D.llIllllllIll[3] = 0x74 ^ 0x5C;
        D.llIllllllIll[4] = 0x21 ^ 0x26 ^ (0x6B ^ 0x54);
        D.llIllllllIll[5] = "   ".length();
        D.llIllllllIll[6] = 0xAB ^ 0x98;
        D.llIllllllIll[7] = 0xC7 ^ 0xC3;
        D.llIllllllIll[8] = 0x1A ^ 0x36;
        D.llIllllllIll[9] = 0x7C ^ 0x5B;
        D.llIllllllIll[10] = 0x3B ^ 0x4A ^ (0xD9 ^ 0xAD);
        D.llIllllllIll[11] = 0xD8 ^ 0x8D ^ (0x71 ^ 1);
        D.llIllllllIll[12] = 121 + 0 - 86 + 123 ^ 90 + 99 - 153 + 116;
        D.llIllllllIll[13] = 0x15 ^ 0x12;
        D.llIllllllIll[14] = 0x60 ^ 0x35 ^ (0x5C ^ 1);
        D.llIllllllIll[15] = 0xA5 ^ 0xAC;
        D.llIllllllIll[16] = 0x14 ^ 0x30;
        D.llIllllllIll[17] = 0x95 ^ 0x88;
        D.llIllllllIll[18] = 0xF ^ 2;
        D.llIllllllIll[19] = 0xD ^ 0x22;
        D.llIllllllIll[20] = 0x6E ^ 0x5E;
        D.llIllllllIll[21] = 66 + 61 - 87 + 98 ^ 94 + 29 - 34 + 78;
        D.llIllllllIll[22] = 0x40 ^ 0x76 ^ (0xA6 ^ 0x9A);
        D.llIllllllIll[23] = 0x46 ^ 0x5A ^ (0x3B ^ 9);
        D.llIllllllIll[24] = 0x5E ^ 0x68;
        D.llIllllllIll[25] = 0xC9 ^ 0xB4 ^ (0x31 ^ 0x47);
        D.llIllllllIll[26] = 57 + 128 - 107 + 88 ^ 42 + 26 - 48 + 120;
        D.llIllllllIll[27] = 0x9C ^ 0xA9;
        D.llIllllllIll[28] = 0x4B ^ 0x29 ^ (0x34 ^ 0x76);
        D.llIllllllIll[29] = 0x27 ^ 0x2B;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> lllllllllllllllIIlllIlIIlIlIlIll = this.startAreas.get().iterator();
        while (D.lIIIIlllllIlIIl(lllllllllllllllIIlllIlIIlIlIlIll.hasNext() ? 1 : 0)) {
            void lllllllllllllllIIlllIlIIlIlIllII;
            WorldArea lllllllllllllllIIlllIlIIlIlIlIlI = lllllllllllllllIIlllIlIIlIlIlIll.next();
            if (D.lIIIIlllllIlIIl(lllllllllllllllIIlllIlIIlIlIlIlI.contains((Locatable)lllllllllllllllIIlllIlIIlIlIllII) ? 1 : 0)) {
                return llIllllllIll[1];
            }
            "".length();
            if ("   ".length() != 0) continue;
            return ((0x57 ^ 0xE ^ (0x6C ^ 0x38)) & (0x6F ^ 0x11 ^ (0 ^ 0x73) ^ -" ".length())) != 0;
        }
        return llIllllllIll[0];
    }

    private static boolean lIIIIlllllIlIIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3, J j2, J j3) {
        void lllllllllllllllIIlllIlIIllIlIIII;
        void lllllllllllllllIIlllIlIIllIlIIIl;
        void lllllllllllllllIIlllIlIIllIIlllI;
        if (D.lIIIIlllllIlIll(j2.aG(), n2) && !D.lIIIIlllllIlIlI(j2.aF(), n3) || D.lIIIIlllllIlIll(lllllllllllllllIIlllIlIIllIIlllI.aG(), (int)lllllllllllllllIIlllIlIIllIlIIIl) && D.lIIIIlllllIlIll(lllllllllllllllIIlllIlIIllIIlllI.aF(), (int)lllllllllllllllIIlllIlIIllIlIIII)) {
            return llIllllllIll[1];
        }
        return llIllllllIll[0];
    }

    private static String lIIIIllllIllllI(String lllllllllllllllIIlllIlIIIlllIIll, String lllllllllllllllIIlllIlIIIlllIlII) {
        try {
            SecretKeySpec lllllllllllllllIIlllIlIIIllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIlIIIlllIlII.getBytes(StandardCharsets.UTF_8)), llIllllllIll[14]), "DES");
            Cipher lllllllllllllllIIlllIlIIIlllIlll = Cipher.getInstance("DES");
            lllllllllllllllIIlllIlIIIlllIlll.init(llIllllllIll[2], lllllllllllllllIIlllIlIIIllllIII);
            return new String(lllllllllllllllIIlllIlIIIlllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIlIIIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIlIIIlllIllI) {
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
        }
        catch (Exception lllllllllllllllIIlllIlIIlIIIIIll) {
            lllllllllllllllIIlllIlIIlIIIIIll.printStackTrace();
            return null;
        }
    }
}

