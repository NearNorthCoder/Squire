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

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.B;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.C;
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

public final class A
extends Enum<A> {
    public static final /* synthetic */ /* enum */ A EAST_I_I;
    public static final /* synthetic */ /* enum */ A EAST_II_X;
    public static final /* synthetic */ /* enum */ A NORTH_II_VIII;
    public static final /* synthetic */ /* enum */ A EAST_III_VII;
    public static final /* synthetic */ /* enum */ A WEST_I_I;
    public static final /* synthetic */ /* enum */ A NORTH_I_II;
    public static final /* synthetic */ /* enum */ A EAST_I_IV;
    public static final /* synthetic */ /* enum */ A MIDDLE_V_VII;
    public static final /* synthetic */ /* enum */ A NORTH_II_IX;
    public /* synthetic */ Supplier<TileObject> object;
    public static final /* synthetic */ /* enum */ A MIDDLE_V_X;
    public static final /* synthetic */ /* enum */ A TOP_V_I;
    public static final /* synthetic */ /* enum */ A SOUTH_IV_II;
    public static final /* synthetic */ /* enum */ A SOUTH_I_III;
    public static final /* synthetic */ /* enum */ A EAST_II_IX;
    public static final /* synthetic */ /* enum */ A MIDDLE_V_IX;
    public static final /* synthetic */ /* enum */ A EAST_II_III;
    public static final /* synthetic */ /* enum */ A EAST_II_XI;
    public static final /* synthetic */ /* enum */ A SOUTH_I_II_EXTEND;
    public static final /* synthetic */ /* enum */ A NORTH_IV_VII;
    public static final /* synthetic */ /* enum */ A WEST_II_V;
    public static final /* synthetic */ /* enum */ A EAST_I_II;
    public static final /* synthetic */ /* enum */ A SOUTH_IV_I;
    public static final /* synthetic */ /* enum */ A WEST_III_II;
    private static final /* synthetic */ A[] $VALUES;
    public static final /* synthetic */ /* enum */ A MIDDLE_V_III;
    public static final /* synthetic */ /* enum */ A EAST_I_V;
    public static final /* synthetic */ /* enum */ A WEST_I_II;
    /* synthetic */ C type;
    public static final /* synthetic */ /* enum */ A EAST_II_VIII;
    public static final /* synthetic */ /* enum */ A NORTH_IV_VIII;
    public static final /* synthetic */ /* enum */ A MIDDLE_V_VI;
    public static final /* synthetic */ /* enum */ A NORTH_II_X;
    public static final /* synthetic */ /* enum */ A EAST_II_II;
    public static final /* synthetic */ /* enum */ A NORTH_I_III;
    public static final /* synthetic */ /* enum */ A EAST_II_I;
    public static final /* synthetic */ /* enum */ A WEST_II_IV;
    private static /* synthetic */ int[] lllIIIIIIllI;
    private static /* synthetic */ String[] lllIIIIIIlIl;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    public static final /* synthetic */ /* enum */ A SOUTH_I_II;
    public static final /* synthetic */ /* enum */ A EAST_III_VI;
    public static final /* synthetic */ /* enum */ A TOP_V_III;
    public static final /* synthetic */ /* enum */ A NORTH_I_IV;
    /* synthetic */ Supplier<WorldPoint> destination;
    public static final /* synthetic */ /* enum */ A TOP_V_II;
    /* synthetic */ Supplier<WorldPoint> startPoint;

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void lllllllllllllllIIlllIIlIlIIlIIll;
        void lllllllllllllllIIlllIIlIlIIlIIlI;
        void lllllllllllllllIIlllIIlIlIIlIIIl;
        A lllllllllllllllIIlllIIlIlIIlIlII;
        Player player = Players.getLocal();
        if (A.lIIIlIIIIlIlllI(player)) {
            return lllIIIIIIllI[0];
        }
        if (A.lIIIlIIIIlIllll(lllllllllllllllIIlllIIlIlIIlIlII.a((Locatable)lllllllllllllllIIlllIIlIlIIlIIIl) ? 1 : 0)) {
            return lllIIIIIIllI[0];
        }
        lllllllllllllllIIlllIIlIlIIlIlII.a((SquireSepulchre)lllllllllllllllIIlllIIlIlIIlIIlI);
        if (A.lIIIlIIIIllIlIl(lllllllllllllllIIlllIIlIlIIlIlII.a((d)lllllllllllllllIIlllIIlIlIIlIIll) ? 1 : 0)) {
            System.out.println(lllIIIIIIlIl[lllIIIIIIllI[2]]);
            Movement.setDestination((WorldPoint)lllllllllllllllIIlllIIlIlIIlIlII.destination.get());
            return lllIIIIIIllI[2];
        }
        Movement.setDestination((WorldPoint)this.startPoint.get());
        return lllIIIIIIllI[2];
    }

    private static boolean lIIIlIIIIlIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIIIIllIlII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2) {
        A lllllllllllllllIIlllIIlIlIIlllII;
        void lllllllllllllllIIlllIIlIlIIllIlI;
        J j2 = d2.b(this.object.get());
        if (A.lIIIlIIIIlIlllI(j2)) {
            System.out.println(lllIIIIIIlIl[lllIIIIIIllI[0]]);
            return lllIIIIIIllI[0];
        }
        System.out.println("ID: " + lllllllllllllllIIlllIIlIlIIllIlI.aG() + " | ticks:" + lllllllllllllllIIlllIIlIlIIllIlI.aF());
        Player lllllllllllllllIIlllIIlIlIIllIIl = Players.getLocal();
        if (A.lIIIlIIIIlIlllI(lllllllllllllllIIlllIIlIlIIllIIl)) {
            return lllIIIIIIllI[0];
        }
        if (A.lIIIlIIIIlIllll(lllllllllllllllIIlllIIlIlIIllIIl.getWorldLocation().equals((Object)lllllllllllllllIIlllIIlIlIIlllII.startPoint.get()) ? 1 : 0)) {
            return lllIIIIIIllI[0];
        }
        switch (B.U[lllllllllllllllIIlllIIlIlIIlllII.type.ordinal()]) {
            case 1: {
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.o) && A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.o) && A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[3])) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 2: {
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.o) && A.lIIIlIIIIllIIIl(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 3: {
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.o) && A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.o) && A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[3])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 4: {
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.o) && A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (!A.lIIIlIIIIllIIlI(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.p) || A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 5: {
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.o) && A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 6: {
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.o) && A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 7: {
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.o) && A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.p) && A.lIIIlIIIIllIIll(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[4])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 8: {
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.o) && A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 9: {
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.o) && A.lIIIlIIIIllIlII(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[2])) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 10: {
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.o) && A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[2])) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 11: {
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.o) && (!A.lIIIlIIIIllIIlI(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[2]) || !A.lIIIlIIIIllIIlI(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[1])) || A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(lllllllllllllllIIlllIIlIlIIllIlI.aG(), b.p) && A.lIIIlIIIIllIlII(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[2]) && A.lIIIlIIIIllIIll(lllllllllllllllIIlllIIlIlIIllIlI.aF(), lllIIIIIIllI[4])) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
        }
        return lllIIIIIIllI[0];
    }

    private static String lIIIlIIIIIIllll(String lllllllllllllllIIlllIIlIIlIlIIlI, String lllllllllllllllIIlllIIlIIlIlIIll) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIlIIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIIlIlIIll.getBytes(StandardCharsets.UTF_8)), lllIIIIIIllI[16]), "DES");
            Cipher lllllllllllllllIIlllIIlIIlIlIllI = Cipher.getInstance("DES");
            lllllllllllllllIIlllIIlIIlIlIllI.init(lllIIIIIIllI[1], lllllllllllllllIIlllIIlIIlIlIlll);
            return new String(lllllllllllllllIIlllIIlIIlIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIlIIlIlIlIl) {
            lllllllllllllllIIlllIIlIIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIIllIlIl(int n2) {
        return n2 != 0;
    }

    public Supplier<WorldPoint> al() {
        return this.startPoint;
    }

    private A(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier<TileObject> supplier, C c2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.object = supplier;
        this.type = c2;
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static String lIIIlIIIIIIlllI(String lllllllllllllllIIlllIIlIIlIlllll, String lllllllllllllllIIlllIIlIIlIllllI) {
        try {
            SecretKeySpec lllllllllllllllIIlllIIlIIllIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIlIIlIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIIlIIllIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIIlIIllIIIll.init(lllIIIIIIllI[1], lllllllllllllllIIlllIIlIIllIIlII);
            return new String(lllllllllllllllIIlllIIlIIllIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIlIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlllIIlIIllIIIlI) {
            lllllllllllllllIIlllIIlIIllIIIlI.printStackTrace();
            return null;
        }
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    public static A valueOf(String string) {
        return Enum.valueOf(A.class, string);
    }

    private static boolean lIIIlIIIIllIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIIlIIIIIlIIIl() {
        lllIIIIIIlIl = new String[lllIIIIIIllI[80]];
        A.lllIIIIIIlIl[A.lllIIIIIIllI[0]] = A."we null? wtf";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[2]] = A."walking to start";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[1]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[3]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[4]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[10]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[12]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[14]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[16]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[18]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[21]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[23]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[25]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[11]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[27]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[9]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[30]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[29]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[32]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[33]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[34]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[13]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[35]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[8]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[24]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[15]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[37]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[17]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[40]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[31]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[42]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[43]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[44]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[39]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[45]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[46]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[19]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[48]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[49]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[50]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[28]] = A."Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[36]] = A."WEST_I_I";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[7]] = A."WEST_I_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[52]] = A."NORTH_I_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[5]] = A."NORTH_I_III";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[54]] = A."NORTH_I_IV";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[55]] = A."SOUTH_I_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[56]] = A."SOUTH_I_II_EXTEND";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[57]] = A."SOUTH_I_III";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[58]] = A."EAST_I_I";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[26]] = A."EAST_I_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[22]] = A."EAST_I_IV";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[61]] = A."EAST_I_V";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[41]] = A."WEST_II_IV";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[6]] = A."WEST_II_V";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[62]] = A."EAST_II_I";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[20]] = A."EAST_II_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[51]] = A."EAST_II_III";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[38]] = A."EAST_II_VIII";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[47]] = A."EAST_II_IX";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[53]] = A."EAST_II_X";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[63]] = A."EAST_II_XI";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[59]] = A."NORTH_II_VIII";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[60]] = A."NORTH_II_IX";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[64]] = A."NORTH_II_X";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[65]] = A."EAST_III_VI";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[66]] = A."EAST_III_VII";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[67]] = A."WEST_III_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[68]] = A."SOUTH_IV_I";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[69]] = A."SOUTH_IV_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[70]] = A."NORTH_IV_VII";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[71]] = A."NORTH_IV_VIII";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[72]] = A."TOP_V_I";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[73]] = A."TOP_V_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[74]] = A."TOP_V_III";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[75]] = A."MIDDLE_V_III";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[76]] = A."MIDDLE_V_VI";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[77]] = A."MIDDLE_V_VII";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[78]] = A."MIDDLE_V_IX";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[79]] = A."MIDDLE_V_X";
    }

    private static boolean lIIIlIIIIlIlllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> lllllllllllllllIIlllIIlIlIIIlIlI = this.startAreas.get().iterator();
        while (A.lIIIlIIIIllIlIl(lllllllllllllllIIlllIIlIlIIIlIlI.hasNext() ? 1 : 0)) {
            void lllllllllllllllIIlllIIlIlIIIlIll;
            WorldArea lllllllllllllllIIlllIIlIlIIIlIIl = lllllllllllllllIIlllIIlIlIIIlIlI.next();
            if (A.lIIIlIIIIllIlIl(lllllllllllllllIIlllIIlIlIIIlIIl.contains((Locatable)lllllllllllllllIIlllIIlIlIIIlIll) ? 1 : 0)) {
                return lllIIIIIIllI[2];
            }
            0;
            if (null == null) continue;
            return ((85 + 111 - 102 + 63 ^ 14 + 20 - -90 + 27) & (0x16 ^ 0x18 ^ (0x12 ^ 0x16) ^ -1)) != 0;
        }
        return lllIIIIIIllI[0];
    }

    private static boolean lIIIlIIIIllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private A(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier<TileObject> supplier, C c2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator lllllllllllllllIIlllIIlIlIIIIIlI = list.iterator();
            while (A.lIIIlIIIIllIlIl(lllllllllllllllIIlllIIlIlIIIIIlI.hasNext() ? 1 : 0)) {
                void lllllllllllllllIIlllIIlIlIIIIIll;
                Triple lllllllllllllllIIlllIIlIlIIIIIIl = (Triple)lllllllllllllllIIlllIIlIlIIIIIlI.next();
                lllllllllllllllIIlllIIlIlIIIIIll.add(new WorldArea(SquireSepulchre.a((RegionPoint)lllllllllllllllIIlllIIlIlIIIIIIl.getFirst()), ((Integer)lllllllllllllllIIlllIIlIlIIIIIIl.getSecond()).intValue(), ((Integer)lllllllllllllllIIlllIIlIlIIIIIIl.getThird()).intValue()));
                0;
                0;
                if (3 < (0x83 ^ 0x87)) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.object = supplier;
        this.type = c2;
    }

    static {
        A.lIIIlIIIIlIllIl();
        A.lIIIlIIIIIlIIIl();
        WEST_I_I = new A(new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[14], lllIIIIIIllI[1], b.D), lllIIIIIIllI[11], lllIIIIIIllI[33], new RegionPoint(lllIIIIIIllI[4], lllIIIIIIllI[15], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[4], lllIIIIIIllI[19], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[28]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[12], lllIIIIIIllI[37], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        WEST_I_II = new A(new RegionPoint(lllIIIIIIllI[3], lllIIIIIIllI[37], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[23], new RegionPoint(lllIIIIIIllI[4], lllIIIIIIllI[19], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[0], lllIIIIIIllI[5], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[50]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[12], lllIIIIIIllI[37], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        NORTH_I_II = new A(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[53], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[53], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[22], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[49]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[47], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        NORTH_I_III = new A(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[22], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[18], new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[22], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[7], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[48]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[47], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        NORTH_I_IV = new A(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[7], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[18], new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[7], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[48], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[19]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[47], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        SOUTH_I_II = new A(List.of(new Triple((Object)new RegionPoint(lllIIIIIIllI[33], lllIIIIIIllI[0], lllIIIIIIllI[1], b.C), (Object)lllIIIIIIllI[37], (Object)lllIIIIIIllI[3]), new Triple((Object)new RegionPoint(lllIIIIIIllI[35], lllIIIIIIllI[3], lllIIIIIIllI[1], b.C), (Object)lllIIIIIIllI[30], (Object)lllIIIIIIllI[16])), new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[21], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[27], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[46]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[23], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        SOUTH_I_II_EXTEND = new A(new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[23], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[27], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[32], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[45]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[23], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        SOUTH_I_III = new A(new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[9], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[32], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[35], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[39]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[23], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_I_I = new A(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[41], lllIIIIIIllI[1], b.C), lllIIIIIIllI[25], lllIIIIIIllI[16], new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[41], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[54], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[44]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[22], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        EAST_I_II = new A(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[54], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[16], new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[54], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[59], lllIIIIIIllI[45], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[43]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[22], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        EAST_I_IV = new A(List.of(new Triple((Object)new RegionPoint(lllIIIIIIllI[60], lllIIIIIIllI[35], lllIIIIIIllI[1], b.C), (Object)lllIIIIIIllI[4], (Object)lllIIIIIIllI[30]), new Triple((Object)new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[30], lllIIIIIIllI[1], b.C), (Object)lllIIIIIIllI[14], (Object)lllIIIIIIllI[25])), new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[32], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[22], lllIIIIIIllI[32], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[42]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[41], lllIIIIIIllI[27], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_I_V = new A(new RegionPoint(lllIIIIIIllI[22], lllIIIIIIllI[30], lllIIIIIIllI[1], b.C), lllIIIIIIllI[10], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[22], lllIIIIIIllI[32], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[54], lllIIIIIIllI[42], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[31]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[41], lllIIIIIIllI[9], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        WEST_II_IV = new A(new RegionPoint(lllIIIIIIllI[62], lllIIIIIIllI[19], lllIIIIIIllI[1], b.I), lllIIIIIIllI[16], lllIIIIIIllI[21], new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[19], lllIIIIIIllI[1], b.I), new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[44], lllIIIIIIllI[1], b.I), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[40]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[39], lllIIIIIIllI[1], b.I)), (String[])stringArray);
        }, C.STATUE_SHORT);
        WEST_II_V = new A(new RegionPoint(lllIIIIIIllI[62], lllIIIIIIllI[44], lllIIIIIIllI[1], b.I), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[44], lllIIIIIIllI[1], b.I), new RegionPoint(lllIIIIIIllI[63], lllIIIIIIllI[13], lllIIIIIIllI[1], b.I), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[17]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[39], lllIIIIIIllI[1], b.I)), (String[])stringArray);
        }, C.STATUE_4);
        EAST_II_I = new A(new RegionPoint(lllIIIIIIllI[19], lllIIIIIIllI[43], lllIIIIIIllI[1], b.G), lllIIIIIIllI[10], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[28], lllIIIIIIllI[44], lllIIIIIIllI[1], b.G), new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[44], lllIIIIIIllI[1], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[37]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[31], lllIIIIIIllI[1], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_II_II = new A(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[43], lllIIIIIIllI[1], b.G), lllIIIIIIllI[4], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[44], lllIIIIIIllI[1], b.G), new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[44], lllIIIIIIllI[1], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[15]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[31], lllIIIIIIllI[1], b.G)), (String[])stringArray);
        }, C.STATUE_4);
        EAST_II_III = new A(new RegionPoint(lllIIIIIIllI[54], lllIIIIIIllI[43], lllIIIIIIllI[1], b.G), lllIIIIIIllI[12], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[44], lllIIIIIIllI[1], b.G), new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[8], lllIIIIIIllI[1], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[24]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[31], lllIIIIIIllI[1], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_II_VIII = new A(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[12], lllIIIIIIllI[2], b.G), lllIIIIIIllI[3], lllIIIIIIllI[11], new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[32], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[15], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[8]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[33], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_4);
        EAST_II_IX = new A(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[33], lllIIIIIIllI[2], b.G), lllIIIIIIllI[3], lllIIIIIIllI[14], new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[15], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[44], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[35]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[33], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_4);
        EAST_II_X = new A(new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[37], lllIIIIIIllI[2], b.G), lllIIIIIIllI[33], lllIIIIIIllI[21], new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[44], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[55], lllIIIIIIllI[44], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[13]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[33], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_II_XI = new A(new RegionPoint(lllIIIIIIllI[55], lllIIIIIIllI[43], lllIIIIIIllI[2], b.G), lllIIIIIIllI[4], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[55], lllIIIIIIllI[44], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[44], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[34]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[33], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        NORTH_II_VIII = new A(new RegionPoint(lllIIIIIIllI[35], lllIIIIIIllI[38], lllIIIIIIllI[2], b.G), lllIIIIIIllI[27], lllIIIIIIllI[10], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[38], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[41], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[33]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[20], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        NORTH_II_IX = new A(new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[41], lllIIIIIIllI[2], b.G), lllIIIIIIllI[3], lllIIIIIIllI[10], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[41], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[58], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[32]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[20], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        NORTH_II_X = new A(new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[58], lllIIIIIIllI[2], b.G), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[58], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[36], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[29]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[20], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_III_VI = new A(List.of(new Triple((Object)new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[27], lllIIIIIIllI[1], b.J), (Object)lllIIIIIIllI[3], (Object)lllIIIIIIllI[9]), new Triple((Object)new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[13], lllIIIIIIllI[1], b.J), (Object)lllIIIIIIllI[16], (Object)lllIIIIIIllI[10])), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[13], lllIIIIIIllI[1], b.J), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[29], lllIIIIIIllI[1], b.J), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[30]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[28], lllIIIIIIllI[29], lllIIIIIIllI[1], b.J)), (String[])stringArray);
        }, C.STATUE_GOLD_SHORT);
        EAST_III_VII = new A(new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[29], lllIIIIIIllI[1], b.J), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[29], lllIIIIIIllI[1], b.J), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[18], lllIIIIIIllI[1], b.J), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[9]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[28], lllIIIIIIllI[23], lllIIIIIIllI[1], b.J)), (String[])stringArray);
        }, C.STATUE_GOLD_6);
        WEST_III_II = new A(new RegionPoint(lllIIIIIIllI[23], lllIIIIIIllI[49], lllIIIIIIllI[1], b.J), lllIIIIIIllI[18], lllIIIIIIllI[21], new RegionPoint(lllIIIIIIllI[23], lllIIIIIIllI[56], lllIIIIIIllI[1], b.J), new RegionPoint(lllIIIIIIllI[23], lllIIIIIIllI[51], lllIIIIIIllI[1], b.J), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[27]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[18], lllIIIIIIllI[26], lllIIIIIIllI[1], b.J)), (String[])stringArray);
        }, C.STATUE);
        SOUTH_IV_I = new A(new RegionPoint(lllIIIIIIllI[37], lllIIIIIIllI[29], lllIIIIIIllI[1], b.L), lllIIIIIIllI[18], lllIIIIIIllI[25], new RegionPoint(lllIIIIIIllI[37], lllIIIIIIllI[33], lllIIIIIIllI[1], b.L), new RegionPoint(lllIIIIIIllI[33], lllIIIIIIllI[33], lllIIIIIIllI[1], b.L), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[11]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[24], lllIIIIIIllI[9], lllIIIIIIllI[1], b.L)), (String[])stringArray);
        }, C.STATUE_GOLD_6);
        SOUTH_IV_II = new A(new RegionPoint(lllIIIIIIllI[33], lllIIIIIIllI[29], lllIIIIIIllI[1], b.L), lllIIIIIIllI[14], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[33], lllIIIIIIllI[33], lllIIIIIIllI[1], b.L), new RegionPoint(lllIIIIIIllI[12], lllIIIIIIllI[9], lllIIIIIIllI[1], b.L), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[25]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[24], lllIIIIIIllI[9], lllIIIIIIllI[1], b.L)), (String[])stringArray);
        }, C.STATUE_GOLD_6);
        NORTH_IV_VII = new A(new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[41], lllIIIIIIllI[1], b.L), lllIIIIIIllI[21], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[6], lllIIIIIIllI[1], b.L), new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[6], lllIIIIIIllI[1], b.L), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[23]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[19], lllIIIIIIllI[22], lllIIIIIIllI[1], b.L)), (String[])stringArray);
        }, C.STATUE_STRICT);
        NORTH_IV_VIII = new A(new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[41], lllIIIIIIllI[1], b.L), lllIIIIIIllI[21], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[6], lllIIIIIIllI[1], b.L), new RegionPoint(lllIIIIIIllI[30], lllIIIIIIllI[57], lllIIIIIIllI[1], b.L), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[21]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[19], lllIIIIIIllI[20], lllIIIIIIllI[1], b.L)), (String[])stringArray);
        }, C.STATUE_SHORT);
        TOP_V_I = new A(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[22], lllIIIIIIllI[1], b.N), lllIIIIIIllI[12], lllIIIIIIllI[21], new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[51], lllIIIIIIllI[1], b.N), new RegionPoint(lllIIIIIIllI[17], lllIIIIIIllI[51], lllIIIIIIllI[1], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[18]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[17], lllIIIIIIllI[6], lllIIIIIIllI[1], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_I);
        TOP_V_II = new A(new RegionPoint(lllIIIIIIllI[17], lllIIIIIIllI[20], lllIIIIIIllI[1], b.N), lllIIIIIIllI[1], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[17], lllIIIIIIllI[51], lllIIIIIIllI[1], b.N), new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[51], lllIIIIIIllI[1], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[16]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[15], lllIIIIIIllI[6], lllIIIIIIllI[1], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_III);
        TOP_V_III = new A(new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[20], lllIIIIIIllI[1], b.N), lllIIIIIIllI[4], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[51], lllIIIIIIllI[1], b.N), new RegionPoint(lllIIIIIIllI[12], lllIIIIIIllI[41], lllIIIIIIllI[1], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[14]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[13], lllIIIIIIllI[6], lllIIIIIIllI[1], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_III = new A(new RegionPoint(lllIIIIIIllI[3], lllIIIIIIllI[49], lllIIIIIIllI[2], b.N), lllIIIIIIllI[21], lllIIIIIIllI[13], new RegionPoint(lllIIIIIIllI[25], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), new RegionPoint(lllIIIIIIllI[9], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[12]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[11], lllIIIIIIllI[6], lllIIIIIIllI[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_SHORT);
        MIDDLE_V_VI = new A(new RegionPoint(lllIIIIIIllI[11], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), lllIIIIIIllI[3], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[9], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[10]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[9], lllIIIIIIllI[6], lllIIIIIIllI[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_VII = new A(new RegionPoint(lllIIIIIIllI[30], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), lllIIIIIIllI[16], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[4]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[6], lllIIIIIIllI[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_IX = new A(new RegionPoint(lllIIIIIIllI[24], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), lllIIIIIIllI[27], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[48], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), new RegionPoint(lllIIIIIIllI[52], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[3]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[6], lllIIIIIIllI[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_X = new A(new RegionPoint(lllIIIIIIllI[49], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), lllIIIIIIllI[12], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[52], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), new RegionPoint(lllIIIIIIllI[6], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[1]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[6], lllIIIIIIllI[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        A[] aArray = new A[lllIIIIIIllI[50]];
        aArray[A.lllIIIIIIllI[0]] = WEST_I_I;
        aArray[A.lllIIIIIIllI[2]] = WEST_I_II;
        aArray[A.lllIIIIIIllI[1]] = NORTH_I_II;
        aArray[A.lllIIIIIIllI[3]] = NORTH_I_III;
        aArray[A.lllIIIIIIllI[4]] = NORTH_I_IV;
        aArray[A.lllIIIIIIllI[10]] = SOUTH_I_II;
        aArray[A.lllIIIIIIllI[12]] = SOUTH_I_II_EXTEND;
        aArray[A.lllIIIIIIllI[14]] = SOUTH_I_III;
        aArray[A.lllIIIIIIllI[16]] = EAST_I_I;
        aArray[A.lllIIIIIIllI[18]] = EAST_I_II;
        aArray[A.lllIIIIIIllI[21]] = EAST_I_IV;
        aArray[A.lllIIIIIIllI[23]] = EAST_I_V;
        aArray[A.lllIIIIIIllI[25]] = WEST_II_IV;
        aArray[A.lllIIIIIIllI[11]] = WEST_II_V;
        aArray[A.lllIIIIIIllI[27]] = EAST_II_I;
        aArray[A.lllIIIIIIllI[9]] = EAST_II_II;
        aArray[A.lllIIIIIIllI[30]] = EAST_II_III;
        aArray[A.lllIIIIIIllI[29]] = EAST_II_VIII;
        aArray[A.lllIIIIIIllI[32]] = EAST_II_IX;
        aArray[A.lllIIIIIIllI[33]] = EAST_II_X;
        aArray[A.lllIIIIIIllI[34]] = EAST_II_XI;
        aArray[A.lllIIIIIIllI[13]] = NORTH_II_VIII;
        aArray[A.lllIIIIIIllI[35]] = NORTH_II_IX;
        aArray[A.lllIIIIIIllI[8]] = NORTH_II_X;
        aArray[A.lllIIIIIIllI[24]] = EAST_III_VI;
        aArray[A.lllIIIIIIllI[15]] = EAST_III_VII;
        aArray[A.lllIIIIIIllI[37]] = WEST_III_II;
        aArray[A.lllIIIIIIllI[17]] = SOUTH_IV_I;
        aArray[A.lllIIIIIIllI[40]] = SOUTH_IV_II;
        aArray[A.lllIIIIIIllI[31]] = NORTH_IV_VII;
        aArray[A.lllIIIIIIllI[42]] = NORTH_IV_VIII;
        aArray[A.lllIIIIIIllI[43]] = TOP_V_I;
        aArray[A.lllIIIIIIllI[44]] = TOP_V_II;
        aArray[A.lllIIIIIIllI[39]] = TOP_V_III;
        aArray[A.lllIIIIIIllI[45]] = MIDDLE_V_III;
        aArray[A.lllIIIIIIllI[46]] = MIDDLE_V_VI;
        aArray[A.lllIIIIIIllI[19]] = MIDDLE_V_VII;
        aArray[A.lllIIIIIIllI[48]] = MIDDLE_V_IX;
        aArray[A.lllIIIIIIllI[49]] = MIDDLE_V_X;
        $VALUES = aArray;
    }

    private static void lIIIlIIIIlIllIl() {
        lllIIIIIIllI = new int[81];
        A.lllIIIIIIllI[0] = (0xC4 ^ 0xB5 ^ (0x75 ^ 0x18)) & (163 + 147 - 188 + 99 ^ 181 + 134 - 128 + 6 ^ -1);
        A.lllIIIIIIllI[1] = 2;
        A.lllIIIIIIllI[2] = 1;
        A.lllIIIIIIllI[3] = 3;
        A.lllIIIIIIllI[4] = 0xD ^ 0x2A ^ (0xB0 ^ 0x93);
        A.lllIIIIIIllI[5] = 0x28 ^ 4;
        A.lllIIIIIIllI[6] = 0x43 ^ 0x75;
        A.lllIIIIIIllI[7] = 62 + 9 - -2 + 73 ^ 67 + 22 - 41 + 136;
        A.lllIIIIIIllI[8] = 0xD7 ^ 0xC0;
        A.lllIIIIIIllI[9] = 0x17 ^ 0x18;
        A.lllIIIIIIllI[10] = 71 + 56 - 68 + 121 ^ 48 + 153 - 72 + 48;
        A.lllIIIIIIllI[11] = 177 + 18 - 92 + 80 ^ 152 + 43 - 105 + 96;
        A.lllIIIIIIllI[12] = 0xBA ^ 0xBC;
        A.lllIIIIIIllI[13] = 113 + 142 - 133 + 57 ^ 148 + 30 - 138 + 126;
        A.lllIIIIIIllI[14] = 0xB3 ^ 0xB4;
        A.lllIIIIIIllI[15] = 63 + 26 - -6 + 45 ^ 122 + 31 - 140 + 136;
        A.lllIIIIIIllI[16] = 0x4B ^ 0x43;
        A.lllIIIIIIllI[17] = 145 + 38 - 44 + 11 ^ 90 + 107 - 186 + 130;
        A.lllIIIIIIllI[18] = 0x1A ^ 0x13;
        A.lllIIIIIIllI[19] = 0xC ^ 0x53 ^ (0x29 ^ 0x52);
        A.lllIIIIIIllI[20] = 53 + 7 - 50 + 129 ^ 127 + 51 - 153 + 154;
        A.lllIIIIIIllI[21] = 138 + 101 - 183 + 106 ^ 36 + 153 - 58 + 37;
        A.lllIIIIIIllI[22] = 0x96 ^ 0xA5;
        A.lllIIIIIIllI[23] = 0x31 ^ 0x3A;
        A.lllIIIIIIllI[24] = 0 ^ 0x18;
        A.lllIIIIIIllI[25] = 0x23 ^ 0x2C ^ 3;
        A.lllIIIIIIllI[26] = 0xA5 ^ 0x97;
        A.lllIIIIIIllI[27] = 0x59 ^ 0x74 ^ (0xAC ^ 0x8F);
        A.lllIIIIIIllI[28] = 4 ^ 0x2C;
        A.lllIIIIIIllI[29] = 176 + 58 - 165 + 120 ^ 130 + 132 - 259 + 169;
        A.lllIIIIIIllI[30] = 0x11 ^ 1;
        A.lllIIIIIIllI[31] = 0x5D ^ 0x5A ^ (0x21 ^ 0x3B);
        A.lllIIIIIIllI[32] = 95 + 97 - 126 + 94 ^ 118 + 36 - 45 + 69;
        A.lllIIIIIIllI[33] = 8 ^ 0x1B;
        A.lllIIIIIIllI[34] = 133 + 122 - 78 + 38 ^ 114 + 118 - 178 + 141;
        A.lllIIIIIIllI[35] = 0xB1 ^ 0x8A ^ (0x9E ^ 0xB3);
        A.lllIIIIIIllI[36] = 0x1F ^ 0x27 ^ (0x1E ^ 0xF);
        A.lllIIIIIIllI[37] = 0x3B ^ 0x21;
        A.lllIIIIIIllI[38] = 0x9A ^ 0xA0;
        A.lllIIIIIIllI[39] = 0x5C ^ 0x7D;
        A.lllIIIIIIllI[40] = 44 + 44 - 61 + 107 ^ 125 + 49 - 163 + 143;
        A.lllIIIIIIllI[41] = 0x4D ^ 0x1A ^ (5 ^ 0x67);
        A.lllIIIIIIllI[42] = 0x66 ^ 0x78;
        A.lllIIIIIIllI[43] = 0xC ^ 0x13;
        A.lllIIIIIIllI[44] = 0xBE ^ 0x9E;
        A.lllIIIIIIllI[45] = 0xA2 ^ 0x97 ^ (0xD1 ^ 0xC6);
        A.lllIIIIIIllI[46] = 0x6E ^ 0x6B ^ (0x1D ^ 0x3B);
        A.lllIIIIIIllI[47] = 0x70 ^ 0x4B;
        A.lllIIIIIIllI[48] = 0x41 ^ 0x64;
        A.lllIIIIIIllI[49] = 29 + 110 - 111 + 160 ^ 10 + 121 - 88 + 111;
        A.lllIIIIIIllI[50] = 61 + 27 - 70 + 113 ^ 17 + 11 - 17 + 153;
        A.lllIIIIIIllI[51] = 0xB5 ^ 0x8C;
        A.lllIIIIIIllI[52] = 0x13 ^ 0x39 ^ 1;
        A.lllIIIIIIllI[53] = 0x31 ^ 0xD;
        A.lllIIIIIIllI[54] = 0x1D ^ 0x30;
        A.lllIIIIIIllI[55] = 0x68 ^ 0x46;
        A.lllIIIIIIllI[56] = 0xA2 ^ 0xAD ^ (0x88 ^ 0xA8);
        A.lllIIIIIIllI[57] = 0x29 ^ 0x19;
        A.lllIIIIIIllI[58] = 0xD3 ^ 0x80 ^ (0xCD ^ 0xAF);
        A.lllIIIIIIllI[59] = 0 ^ 0x3E;
        A.lllIIIIIIllI[60] = 0x46 ^ 0x79;
        A.lllIIIIIIllI[61] = 78 + 72 - 63 + 96 ^ 88 + 19 - 70 + 94;
        A.lllIIIIIIllI[62] = 0xF2 ^ 0xC5;
        A.lllIIIIIIllI[63] = 0x7C ^ 0x41;
        A.lllIIIIIIllI[64] = 0x6A ^ 0x12 ^ (0x2F ^ 0x17);
        A.lllIIIIIIllI[65] = 0x4E ^ 0x41 ^ (0x60 ^ 0x2E);
        A.lllIIIIIIllI[66] = 0x2A ^ 0x68;
        A.lllIIIIIIllI[67] = 0x3E ^ 0xF ^ (0xC9 ^ 0xBB);
        A.lllIIIIIIllI[68] = 0x3F ^ 0x56 ^ (0x8A ^ 0xA7);
        A.lllIIIIIIllI[69] = 0x56 ^ 0x13;
        A.lllIIIIIIllI[70] = 93 + 60 - 47 + 100 ^ 19 + 7 - -6 + 104;
        A.lllIIIIIIllI[71] = 0xEB ^ 0x93 ^ (0x6D ^ 0x52);
        A.lllIIIIIIllI[72] = 24 + 42 - 64 + 195 ^ 123 + 137 - 150 + 31;
        A.lllIIIIIIllI[73] = 0xF ^ 0x46;
        A.lllIIIIIIllI[74] = 0x58 ^ 0x6E ^ (0xEE ^ 0x92);
        A.lllIIIIIIllI[75] = 5 ^ 0x4E;
        A.lllIIIIIIllI[76] = 0x48 ^ 4;
        A.lllIIIIIIllI[77] = 0x3E ^ 0x73;
        A.lllIIIIIIllI[78] = 0xC9 ^ 0x87;
        A.lllIIIIIIllI[79] = 0x68 ^ 0x15 ^ (0x16 ^ 0x24);
        A.lllIIIIIIllI[80] = 0x25 ^ 0x75;
    }

    private static boolean lIIIlIIIIllIIII(int n2, int n3) {
        return n2 == n3;
    }

    public static A[] values() {
        return (A[])$VALUES.clone();
    }

    private static boolean lIIIlIIIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIlIIIIIlIIII(String lllllllllllllllIIlllIIlIIlllIllI, String lllllllllllllllIIlllIIlIIlllIIII) {
        lllllllllllllllIIlllIIlIIlllIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIlIIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIlIIlllIlII = new StringBuilder();
        char[] lllllllllllllllIIlllIIlIIlllIIll = lllllllllllllllIIlllIIlIIlllIIII.toCharArray();
        int lllllllllllllllIIlllIIlIIlllIIlI = lllIIIIIIllI[0];
        char[] lllllllllllllllIIlllIIlIIllIllII = lllllllllllllllIIlllIIlIIlllIllI.toCharArray();
        int lllllllllllllllIIlllIIlIIllIlIll = lllllllllllllllIIlllIIlIIllIllII.length;
        int lllllllllllllllIIlllIIlIIllIlIlI = lllIIIIIIllI[0];
        while (A.lIIIlIIIIllIIll(lllllllllllllllIIlllIIlIIllIlIlI, lllllllllllllllIIlllIIlIIllIlIll)) {
            char lllllllllllllllIIlllIIlIIlllIlll = lllllllllllllllIIlllIIlIIllIllII[lllllllllllllllIIlllIIlIIllIlIlI];
            lllllllllllllllIIlllIIlIIlllIlII.append((char)(lllllllllllllllIIlllIIlIIlllIlll ^ lllllllllllllllIIlllIIlIIlllIIll[lllllllllllllllIIlllIIlIIlllIIlI % lllllllllllllllIIlllIIlIIlllIIll.length]));
            0;
            ++lllllllllllllllIIlllIIlIIlllIIlI;
            ++lllllllllllllllIIlllIIlIIllIlIlI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlllIIlIIlllIlII);
    }
}

