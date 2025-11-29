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
package gg.squire.sepulchre.tasks;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.B;
import gg.squire.sepulchre.tasks.GameEnum34;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.sepulchre.tasks.SepulchreManager;
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

public final class GameEnum32
extends Enum<A> {
    public static final  /* enum */ A EAST_I_I;
    public static final  /* enum */ A EAST_II_X;
    public static final  /* enum */ A NORTH_II_VIII;
    public static final  /* enum */ A EAST_III_VII;
    public static final  /* enum */ A WEST_I_I;
    public static final  /* enum */ A NORTH_I_II;
    public static final  /* enum */ A EAST_I_IV;
    public static final  /* enum */ A MIDDLE_V_VII;
    public static final  /* enum */ A NORTH_II_IX;
    public  Supplier<TileObject> object;
    public static final  /* enum */ A MIDDLE_V_X;
    public static final  /* enum */ A TOP_V_I;
    public static final  /* enum */ A SOUTH_IV_II;
    public static final  /* enum */ A SOUTH_I_III;
    public static final  /* enum */ A EAST_II_IX;
    public static final  /* enum */ A MIDDLE_V_IX;
    public static final  /* enum */ A EAST_II_III;
    public static final  /* enum */ A EAST_II_XI;
    public static final  /* enum */ A SOUTH_I_II_EXTEND;
    public static final  /* enum */ A NORTH_IV_VII;
    public static final  /* enum */ A WEST_II_V;
    public static final  /* enum */ A EAST_I_II;
    public static final  /* enum */ A SOUTH_IV_I;
    public static final  /* enum */ A WEST_III_II;
    private static final  A[] $VALUES;
    public static final  /* enum */ A MIDDLE_V_III;
    public static final  /* enum */ A EAST_I_V;
    public static final  /* enum */ A WEST_I_II;
     C type;
    public static final  /* enum */ A EAST_II_VIII;
    public static final  /* enum */ A NORTH_IV_VIII;
    public static final  /* enum */ A MIDDLE_V_VI;
    public static final  /* enum */ A NORTH_II_X;
    public static final  /* enum */ A EAST_II_II;
    public static final  /* enum */ A NORTH_I_III;
    public static final  /* enum */ A EAST_II_I;
    public static final  /* enum */ A WEST_II_IV;

     Supplier<List<WorldArea>> startAreas;
    public static final  /* enum */ A SOUTH_I_II;
    public static final  /* enum */ A EAST_III_VI;
    public static final  /* enum */ A TOP_V_III;
    public static final  /* enum */ A NORTH_I_IV;
     Supplier<WorldPoint> destination;
    public static final  /* enum */ A TOP_V_II;
     Supplier<WorldPoint> startPoint;

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var1;
        void var2;
        void var3;
        A var4;
        Player player = Players.getLocal();
        if (A.lIIIlIIIIlIlllI(player)) {
            return lllIIIIIIllI[0];
        }
        if (A.lIIIlIIIIlIllll(var4.a((Locatable)var3) ? 1 : 0)) {
            return lllIIIIIIllI[0];
        }
        var4.a((SquireSepulchre)var2);
        if (A.lIIIlIIIIllIlIl(var4.a((SepulchreManager) ar1) ? 1 : 0)) {
            System.out.println(lllIIIIIIlIl[lllIIIIIIllI[2]]);
            Movement.setDestination((WorldPoint)var4.destination.get());
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
        A var5;
        void var6;
        J j2 = d2.b(this.object.get());
        if (A.lIIIlIIIIlIlllI(j2)) {
            System.out.println(lllIIIIIIlIl[lllIIIIIIllI[0]]);
            return lllIIIIIIllI[0];
        }
        System.out.println("ID: " + var6.aG() + " | ticks:" + var6.aF());
        Player var7 = Players.getLocal();
        if (A.lIIIlIIIIlIlllI(var7)) {
            return lllIIIIIIllI[0];
        }
        if (A.lIIIlIIIIlIllll(var7.getWorldLocation().equals((Object)var5.startPoint.get()) ? 1 : 0)) {
            return lllIIIIIIllI[0];
        }
        switch (B.U[var5.type.ordinal()]) {
            case 1: {
                if (A.lIIIlIIIIllIIII(var6.aG(), b.o) && A.lIIIlIIIIllIIII(var6.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(var6.aG(), b.o) && A.lIIIlIIIIllIIII(var6.aF(), lllIIIIIIllI[3])) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 2: {
                if (A.lIIIlIIIIllIIII(var6.aG(), b.o) && A.lIIIlIIIIllIIIl(var6.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(var6.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 3: {
                if (A.lIIIlIIIIllIIII(var6.aG(), b.o) && A.lIIIlIIIIllIIII(var6.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(var6.aG(), b.o) && A.lIIIlIIIIllIIII(var6.aF(), lllIIIIIIllI[3])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(var6.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 4: {
                if (A.lIIIlIIIIllIIII(var6.aG(), b.o) && A.lIIIlIIIIllIIII(var6.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (!A.lIIIlIIIIllIIlI(var6.aG(), b.p) || A.lIIIlIIIIllIIII(var6.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 5: {
                if (A.lIIIlIIIIllIIII(var6.aG(), b.o) && A.lIIIlIIIIllIIII(var6.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(var6.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 6: {
                if (A.lIIIlIIIIllIIII(var6.aG(), b.o) && A.lIIIlIIIIllIIII(var6.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 7: {
                if (A.lIIIlIIIIllIIII(var6.aG(), b.o) && A.lIIIlIIIIllIIII(var6.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(var6.aG(), b.p) && A.lIIIlIIIIllIIll(var6.aF(), lllIIIIIIllI[4])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(var6.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 8: {
                if (A.lIIIlIIIIllIIII(var6.aG(), b.o) && A.lIIIlIIIIllIIII(var6.aF(), lllIIIIIIllI[1])) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(var6.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 9: {
                if (A.lIIIlIIIIllIIII(var6.aG(), b.o) && A.lIIIlIIIIllIlII(var6.aF(), lllIIIIIIllI[2])) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 10: {
                if (A.lIIIlIIIIllIIII(var6.aG(), b.o) && A.lIIIlIIIIllIIII(var6.aF(), lllIIIIIIllI[2])) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
            case 11: {
                if (A.lIIIlIIIIllIIII(var6.aG(), b.o) && (!A.lIIIlIIIIllIIlI(var6.aF(), lllIIIIIIllI[2]) || !A.lIIIlIIIIllIIlI(var6.aF(), lllIIIIIIllI[1])) || A.lIIIlIIIIllIIII(var6.aG(), b.n)) {
                    return lllIIIIIIllI[2];
                }
                if (A.lIIIlIIIIllIIII(var6.aG(), b.p) && A.lIIIlIIIIllIlII(var6.aF(), lllIIIIIIllI[2]) && A.lIIIlIIIIllIIll(var6.aF(), lllIIIIIIllI[4])) {
                    return lllIIIIIIllI[2];
                }
                return lllIIIIIIllI[0];
            }
        }
        return lllIIIIIIllI[0];
    }

    private static boolean lIIIlIIIIllIlIl(int n2) {
        return n2 != 0;
    }

    public Supplier<WorldPoint> al() {
        return this.startPoint;
    }

    private GameEnum32(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier<TileObject> supplier, C c2) {
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

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    public static A valueOf(String string) {
        return Enum.valueOf(GameEnum32.class, string);
    }

    private static boolean lIIIlIIIIllIIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIIIlIIIIIlIIIl() {
        lllIIIIIIlIl = new String[lllIIIIIIllI[80]];
        A.lllIIIIIIlIl[A.lllIIIIIIllI[0]] = "we null? wtf";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[2]] = "walking to start";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[1]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[3]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[4]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[10]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[12]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[14]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[16]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[18]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[21]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[23]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[25]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[11]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[27]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[9]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[30]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[29]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[32]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[33]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[34]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[13]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[35]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[8]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[24]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[15]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[37]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[17]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[40]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[31]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[42]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[43]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[44]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[39]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[45]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[46]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[19]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[48]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[49]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[50]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[28]] = "Wizard Statue";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[36]] = "WEST_I_I";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[7]] = "WEST_I_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[52]] = "NORTH_I_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[5]] = "NORTH_I_III";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[54]] = "NORTH_I_IV";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[55]] = "SOUTH_I_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[56]] = "SOUTH_I_II_EXTEND";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[57]] = "SOUTH_I_III";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[58]] = "EAST_I_I";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[26]] = "EAST_I_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[22]] = "EAST_I_IV";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[61]] = "EAST_I_V";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[41]] = "WEST_II_IV";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[6]] = "WEST_II_V";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[62]] = "EAST_II_I";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[20]] = "EAST_II_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[51]] = "EAST_II_III";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[38]] = "EAST_II_VIII";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[47]] = "EAST_II_IX";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[53]] = "EAST_II_X";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[63]] = "EAST_II_XI";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[59]] = "NORTH_II_VIII";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[60]] = "NORTH_II_IX";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[64]] = "NORTH_II_X";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[65]] = "EAST_III_VI";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[66]] = "EAST_III_VII";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[67]] = "WEST_III_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[68]] = "SOUTH_IV_I";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[69]] = "SOUTH_IV_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[70]] = "NORTH_IV_VII";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[71]] = "NORTH_IV_VIII";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[72]] = "TOP_V_I";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[73]] = "TOP_V_II";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[74]] = "TOP_V_III";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[75]] = "MIDDLE_V_III";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[76]] = "MIDDLE_V_VI";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[77]] = "MIDDLE_V_VII";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[78]] = "MIDDLE_V_IX";
        A.lllIIIIIIlIl[A.lllIIIIIIllI[79]] = "MIDDLE_V_X";
    }

    private static boolean lIIIlIIIIlIlllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var8 = this.startAreas.get().iterator();
        while (A.lIIIlIIIIllIlIl(var8.hasNext() ? 1 : 0)) {
            void var9;
            WorldArea var10 = var8.next();
            if (A.lIIIlIIIIllIlIl(var10.contains((Locatable)var9) ? 1 : 0)) {
                return lllIIIIIIllI[2];
            }

            return ((85 + 111 - 102 + 63 ^ 14 + 20 - -90 + 27) & (0x16 ^ 0x18 ^ (0x12 ^ 0x16) ^ -1)) != 0;
        }
        return lllIIIIIIllI[0];
    }

    private static boolean lIIIlIIIIllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private GameEnum32(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier<TileObject> supplier, C c2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var11 = list.iterator();
            while (A.lIIIlIIIIllIlIl(var11.hasNext() ? 1 : 0)) {
                void var12;
                Triple var13 = (Triple)var11.next();
                var12.add(new WorldArea(SquireSepulchre.a((RegionPoint)var13.getFirst()), ((Integer)var13.getSecond()).intValue(), ((Integer)var13.getThird()).intValue()));

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
        WEST_I_I = new GameEnum32(new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[14], lllIIIIIIllI[1], b.D), lllIIIIIIllI[11], lllIIIIIIllI[33], new RegionPoint(lllIIIIIIllI[4], lllIIIIIIllI[15], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[4], lllIIIIIIllI[19], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[28]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[12], lllIIIIIIllI[37], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        WEST_I_II = new GameEnum32(new RegionPoint(lllIIIIIIllI[3], lllIIIIIIllI[37], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[23], new RegionPoint(lllIIIIIIllI[4], lllIIIIIIllI[19], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[0], lllIIIIIIllI[5], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[50]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[12], lllIIIIIIllI[37], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        NORTH_I_II = new GameEnum32(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[53], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[53], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[22], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[49]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[47], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        NORTH_I_III = new GameEnum32(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[22], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[18], new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[22], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[7], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[48]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[47], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        NORTH_I_IV = new GameEnum32(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[7], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[18], new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[7], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[48], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[19]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[47], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        SOUTH_I_II = new GameEnum32(List.of(new Triple((Object)new RegionPoint(lllIIIIIIllI[33], lllIIIIIIllI[0], lllIIIIIIllI[1], b.C), (Object)lllIIIIIIllI[37], (Object)lllIIIIIIllI[3]), new Triple((Object)new RegionPoint(lllIIIIIIllI[35], lllIIIIIIllI[3], lllIIIIIIllI[1], b.C), (Object)lllIIIIIIllI[30], (Object)lllIIIIIIllI[16])), new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[21], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[27], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[46]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[23], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        SOUTH_I_II_EXTEND = new GameEnum32(new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[23], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[27], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[32], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[45]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[23], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        SOUTH_I_III = new GameEnum32(new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[9], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[32], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[35], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[39]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[23], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_I_I = new GameEnum32(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[41], lllIIIIIIllI[1], b.C), lllIIIIIIllI[25], lllIIIIIIllI[16], new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[41], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[54], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[44]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[22], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        EAST_I_II = new GameEnum32(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[54], lllIIIIIIllI[1], b.C), lllIIIIIIllI[3], lllIIIIIIllI[16], new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[54], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[59], lllIIIIIIllI[45], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[43]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[22], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE);
        EAST_I_IV = new GameEnum32(List.of(new Triple((Object)new RegionPoint(lllIIIIIIllI[60], lllIIIIIIllI[35], lllIIIIIIllI[1], b.C), (Object)lllIIIIIIllI[4], (Object)lllIIIIIIllI[30]), new Triple((Object)new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[30], lllIIIIIIllI[1], b.C), (Object)lllIIIIIIllI[14], (Object)lllIIIIIIllI[25])), new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[32], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[22], lllIIIIIIllI[32], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[42]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[41], lllIIIIIIllI[27], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_I_V = new GameEnum32(new RegionPoint(lllIIIIIIllI[22], lllIIIIIIllI[30], lllIIIIIIllI[1], b.C), lllIIIIIIllI[10], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[22], lllIIIIIIllI[32], lllIIIIIIllI[1], b.C), new RegionPoint(lllIIIIIIllI[54], lllIIIIIIllI[42], lllIIIIIIllI[1], b.C), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[31]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[41], lllIIIIIIllI[9], lllIIIIIIllI[1], b.C)), (String[])stringArray);
        }, C.STATUE_SHORT);
        WEST_II_IV = new GameEnum32(new RegionPoint(lllIIIIIIllI[62], lllIIIIIIllI[19], lllIIIIIIllI[1], b.I), lllIIIIIIllI[16], lllIIIIIIllI[21], new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[19], lllIIIIIIllI[1], b.I), new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[44], lllIIIIIIllI[1], b.I), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[40]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[39], lllIIIIIIllI[1], b.I)), (String[])stringArray);
        }, C.STATUE_SHORT);
        WEST_II_V = new GameEnum32(new RegionPoint(lllIIIIIIllI[62], lllIIIIIIllI[44], lllIIIIIIllI[1], b.I), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[44], lllIIIIIIllI[1], b.I), new RegionPoint(lllIIIIIIllI[63], lllIIIIIIllI[13], lllIIIIIIllI[1], b.I), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[17]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[39], lllIIIIIIllI[1], b.I)), (String[])stringArray);
        }, C.STATUE_4);
        EAST_II_I = new GameEnum32(new RegionPoint(lllIIIIIIllI[19], lllIIIIIIllI[43], lllIIIIIIllI[1], b.G), lllIIIIIIllI[10], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[28], lllIIIIIIllI[44], lllIIIIIIllI[1], b.G), new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[44], lllIIIIIIllI[1], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[37]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[31], lllIIIIIIllI[1], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_II_II = new GameEnum32(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[43], lllIIIIIIllI[1], b.G), lllIIIIIIllI[4], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[5], lllIIIIIIllI[44], lllIIIIIIllI[1], b.G), new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[44], lllIIIIIIllI[1], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[15]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[31], lllIIIIIIllI[1], b.G)), (String[])stringArray);
        }, C.STATUE_4);
        EAST_II_III = new GameEnum32(new RegionPoint(lllIIIIIIllI[54], lllIIIIIIllI[43], lllIIIIIIllI[1], b.G), lllIIIIIIllI[12], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[44], lllIIIIIIllI[1], b.G), new RegionPoint(lllIIIIIIllI[51], lllIIIIIIllI[8], lllIIIIIIllI[1], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[24]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[36], lllIIIIIIllI[31], lllIIIIIIllI[1], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_II_VIII = new GameEnum32(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[12], lllIIIIIIllI[2], b.G), lllIIIIIIllI[3], lllIIIIIIllI[11], new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[32], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[15], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[8]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[33], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_4);
        EAST_II_IX = new GameEnum32(new RegionPoint(lllIIIIIIllI[38], lllIIIIIIllI[33], lllIIIIIIllI[2], b.G), lllIIIIIIllI[3], lllIIIIIIllI[14], new RegionPoint(lllIIIIIIllI[47], lllIIIIIIllI[15], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[44], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[35]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[33], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_4);
        EAST_II_X = new GameEnum32(new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[37], lllIIIIIIllI[2], b.G), lllIIIIIIllI[33], lllIIIIIIllI[21], new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[44], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[55], lllIIIIIIllI[44], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[13]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[33], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_II_XI = new GameEnum32(new RegionPoint(lllIIIIIIllI[55], lllIIIIIIllI[43], lllIIIIIIllI[2], b.G), lllIIIIIIllI[4], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[55], lllIIIIIIllI[44], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[44], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[34]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[20], lllIIIIIIllI[33], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        NORTH_II_VIII = new GameEnum32(new RegionPoint(lllIIIIIIllI[35], lllIIIIIIllI[38], lllIIIIIIllI[2], b.G), lllIIIIIIllI[27], lllIIIIIIllI[10], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[38], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[41], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[33]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[20], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        NORTH_II_IX = new GameEnum32(new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[41], lllIIIIIIllI[2], b.G), lllIIIIIIllI[3], lllIIIIIIllI[10], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[41], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[58], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[32]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[20], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        NORTH_II_X = new GameEnum32(new RegionPoint(lllIIIIIIllI[43], lllIIIIIIllI[58], lllIIIIIIllI[2], b.G), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[58], lllIIIIIIllI[2], b.G), new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[36], lllIIIIIIllI[2], b.G), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[29]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[20], lllIIIIIIllI[2], b.G)), (String[])stringArray);
        }, C.STATUE_SHORT);
        EAST_III_VI = new GameEnum32(List.of(new Triple((Object)new RegionPoint(lllIIIIIIllI[26], lllIIIIIIllI[27], lllIIIIIIllI[1], b.J), (Object)lllIIIIIIllI[3], (Object)lllIIIIIIllI[9]), new Triple((Object)new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[13], lllIIIIIIllI[1], b.J), (Object)lllIIIIIIllI[16], (Object)lllIIIIIIllI[10])), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[13], lllIIIIIIllI[1], b.J), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[29], lllIIIIIIllI[1], b.J), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[30]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[28], lllIIIIIIllI[29], lllIIIIIIllI[1], b.J)), (String[])stringArray);
        }, C.STATUE_GOLD_SHORT);
        EAST_III_VII = new GameEnum32(new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[29], lllIIIIIIllI[1], b.J), lllIIIIIIllI[3], lllIIIIIIllI[4], new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[29], lllIIIIIIllI[1], b.J), new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[18], lllIIIIIIllI[1], b.J), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[9]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[28], lllIIIIIIllI[23], lllIIIIIIllI[1], b.J)), (String[])stringArray);
        }, C.STATUE_GOLD_6);
        WEST_III_II = new GameEnum32(new RegionPoint(lllIIIIIIllI[23], lllIIIIIIllI[49], lllIIIIIIllI[1], b.J), lllIIIIIIllI[18], lllIIIIIIllI[21], new RegionPoint(lllIIIIIIllI[23], lllIIIIIIllI[56], lllIIIIIIllI[1], b.J), new RegionPoint(lllIIIIIIllI[23], lllIIIIIIllI[51], lllIIIIIIllI[1], b.J), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[27]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[18], lllIIIIIIllI[26], lllIIIIIIllI[1], b.J)), (String[])stringArray);
        }, C.STATUE);
        SOUTH_IV_I = new GameEnum32(new RegionPoint(lllIIIIIIllI[37], lllIIIIIIllI[29], lllIIIIIIllI[1], b.L), lllIIIIIIllI[18], lllIIIIIIllI[25], new RegionPoint(lllIIIIIIllI[37], lllIIIIIIllI[33], lllIIIIIIllI[1], b.L), new RegionPoint(lllIIIIIIllI[33], lllIIIIIIllI[33], lllIIIIIIllI[1], b.L), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[11]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[24], lllIIIIIIllI[9], lllIIIIIIllI[1], b.L)), (String[])stringArray);
        }, C.STATUE_GOLD_6);
        SOUTH_IV_II = new GameEnum32(new RegionPoint(lllIIIIIIllI[33], lllIIIIIIllI[29], lllIIIIIIllI[1], b.L), lllIIIIIIllI[14], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[33], lllIIIIIIllI[33], lllIIIIIIllI[1], b.L), new RegionPoint(lllIIIIIIllI[12], lllIIIIIIllI[9], lllIIIIIIllI[1], b.L), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[25]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[24], lllIIIIIIllI[9], lllIIIIIIllI[1], b.L)), (String[])stringArray);
        }, C.STATUE_GOLD_6);
        NORTH_IV_VII = new GameEnum32(new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[41], lllIIIIIIllI[1], b.L), lllIIIIIIllI[21], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[44], lllIIIIIIllI[6], lllIIIIIIllI[1], b.L), new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[6], lllIIIIIIllI[1], b.L), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[23]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[19], lllIIIIIIllI[22], lllIIIIIIllI[1], b.L)), (String[])stringArray);
        }, C.STATUE_STRICT);
        NORTH_IV_VIII = new GameEnum32(new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[41], lllIIIIIIllI[1], b.L), lllIIIIIIllI[21], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[6], lllIIIIIIllI[1], b.L), new RegionPoint(lllIIIIIIllI[30], lllIIIIIIllI[57], lllIIIIIIllI[1], b.L), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[21]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[19], lllIIIIIIllI[20], lllIIIIIIllI[1], b.L)), (String[])stringArray);
        }, C.STATUE_SHORT);
        TOP_V_I = new GameEnum32(new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[22], lllIIIIIIllI[1], b.N), lllIIIIIIllI[12], lllIIIIIIllI[21], new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[51], lllIIIIIIllI[1], b.N), new RegionPoint(lllIIIIIIllI[17], lllIIIIIIllI[51], lllIIIIIIllI[1], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[18]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[17], lllIIIIIIllI[6], lllIIIIIIllI[1], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_I);
        TOP_V_II = new GameEnum32(new RegionPoint(lllIIIIIIllI[17], lllIIIIIIllI[20], lllIIIIIIllI[1], b.N), lllIIIIIIllI[1], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[17], lllIIIIIIllI[51], lllIIIIIIllI[1], b.N), new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[51], lllIIIIIIllI[1], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[16]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[15], lllIIIIIIllI[6], lllIIIIIIllI[1], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_III);
        TOP_V_III = new GameEnum32(new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[20], lllIIIIIIllI[1], b.N), lllIIIIIIllI[4], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[51], lllIIIIIIllI[1], b.N), new RegionPoint(lllIIIIIIllI[12], lllIIIIIIllI[41], lllIIIIIIllI[1], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[14]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[13], lllIIIIIIllI[6], lllIIIIIIllI[1], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_III = new GameEnum32(new RegionPoint(lllIIIIIIllI[3], lllIIIIIIllI[49], lllIIIIIIllI[2], b.N), lllIIIIIIllI[21], lllIIIIIIllI[13], new RegionPoint(lllIIIIIIllI[25], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), new RegionPoint(lllIIIIIIllI[9], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[12]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[11], lllIIIIIIllI[6], lllIIIIIIllI[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_SHORT);
        MIDDLE_V_VI = new GameEnum32(new RegionPoint(lllIIIIIIllI[11], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), lllIIIIIIllI[3], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[9], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[10]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[9], lllIIIIIIllI[6], lllIIIIIIllI[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_VII = new GameEnum32(new RegionPoint(lllIIIIIIllI[30], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), lllIIIIIIllI[16], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), new RegionPoint(lllIIIIIIllI[31], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[4]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[8], lllIIIIIIllI[6], lllIIIIIIllI[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_IX = new GameEnum32(new RegionPoint(lllIIIIIIllI[24], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), lllIIIIIIllI[27], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[48], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), new RegionPoint(lllIIIIIIllI[52], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), () -> {
            String[] stringArray = new String[lllIIIIIIllI[2]];
            stringArray[A.lllIIIIIIllI[0]] = lllIIIIIIlIl[lllIIIIIIllI[3]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIIIIllI[7], lllIIIIIIllI[6], lllIIIIIIllI[2], b.N)), (String[])stringArray);
        }, C.STATUE_BLUE_STRICT);
        MIDDLE_V_X = new GameEnum32(new RegionPoint(lllIIIIIIllI[49], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), lllIIIIIIllI[12], lllIIIIIIllI[3], new RegionPoint(lllIIIIIIllI[52], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), new RegionPoint(lllIIIIIIllI[6], lllIIIIIIllI[20], lllIIIIIIllI[2], b.N), () -> {
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

    private static boolean lIIIlIIIIllIIII(int n2, int n3) {
        return n2 == n3;
    }

    public static A[] values() {
        return (A[])$VALUES.clone();
    }

    private static boolean lIIIlIIIIllIIll(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var14);
    }
}

