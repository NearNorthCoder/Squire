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

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.E;
import gg.squire.sepulchre.tasks.GameEnum23;
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

public final class GameEnum6
extends Enum<D> {
    
     Supplier<WorldPoint> startPoint;
     Supplier<WorldPoint> destination;
    public  Supplier<TileObject> object1;
    public static final  /* enum */ D EAST_III_II;
    private static final  D[] $VALUES;
    public static final  /* enum */ D NORTH_IV_VI;
    
     F type;
     Supplier<List<WorldArea>> startAreas;
    public static final  /* enum */ D EAST_III_I;
    public  Supplier<TileObject> object2;

    private boolean b(int n2, int n3, J j2, J j3) {
        if (D.lIIIIlllllIlIll(j2.aG(), n2) && D.lIIIIlllllIlIll(j2.aF(), n3) && D.lIIIIlllllIlIll(j3.aG(), n2) && D.lIIIIlllllIlIll(j3.aF(), n3)) {
            return llIllllllIll[1];
        }
        return llIllllllIll[0];
    }

    public Supplier<WorldPoint> al() {
        return this.startPoint;
    }

    private GameEnum6(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier<TileObject> supplier, Supplier<TileObject> supplier2, F f2) {
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
        D var1;
        void var2;
        void var3;
        J j2 = d2.b(this.object1.get());
        J j3 = d2.b(this.object2.get());
        if (!D.lIIIIlllllIIllI(j2) || D.lIIIIlllllIIlll(j3)) {
            if (D.lIIIIlllllIIlll(var3)) {
                System.out.println(llIlllllIllI[llIllllllIll[0]]);
            }
            System.out.println(llIlllllIllI[llIllllllIll[1]]);
            return llIllllllIll[0];
        }
        System.out.println("ID1: " + var3.aG() + " | ticks1:" + var3.aF());
        System.out.println("ID2: " + var2.aG() + " | ticks2:" + var2.aF());
        Player var4 = Players.getLocal();
        if (D.lIIIIlllllIIlll(var4)) {
            return llIllllllIll[0];
        }
        if (D.lIIIIlllllIlIII(var4.getWorldLocation().equals((Object)var1.startPoint.get()) ? 1 : 0)) {
            return llIllllllIll[0];
        }
        switch (E.V[var1.type.ordinal()]) {
            case 1: {
                if (D.lIIIIlllllIlIIl(var1.a(b.o, llIllllllIll[2], (J)var3, (J)var2) ? 1 : 0)) {
                    return llIllllllIll[1];
                }
                return llIllllllIll[0];
            }
            case 2: {
                if (D.lIIIIlllllIlIIl(var1.b(b.o, llIllllllIll[2], (J)var3, (J)var2) ? 1 : 0)) {
                    return llIllllllIll[1];
                }
                return llIllllllIll[0];
            }
            case 3: {
                if (D.lIIIIlllllIlIIl(var1.a(b.o, llIllllllIll[2], b.p, llIllllllIll[0], (J)var3, (J)var2) ? 1 : 0)) {
                    return llIllllllIll[1];
                }
                if (D.lIIIIlllllIlIIl(var1.a(b.n, llIllllllIll[0], b.p, llIllllllIll[0], (J)var3, (J)var2) ? 1 : 0)) {
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
        return Enum.valueOf(GameEnum6.class, string);
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

    private GameEnum6(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier<TileObject> supplier, Supplier<TileObject> supplier2, F f2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var5 = list.iterator();
            while (D.lIIIIlllllIlIIl(var5.hasNext() ? 1 : 0)) {
                void var6;
                Triple var7 = (Triple)var5.next();
                var6.add(new WorldArea(SquireSepulchre.a((RegionPoint)var7.getFirst()), ((Integer)var7.getSecond()).intValue(), ((Integer)var7.getThird()).intValue()));

                if (1 != 0) continue;
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
        void var8;
        void var9;
        void var10;
        if (D.lIIIIlllllIlIll(j2.aG(), n2) && (!D.lIIIIlllllIlIIl(n3) || !D.lIIIIlllllIlIlI(j2.aF(), n3)) || D.lIIIIlllllIlIll(var10.aG(), (int)var9) && (!D.lIIIIlllllIlIIl((int)var8) || D.lIIIIlllllIlIll(var10.aF(), (int)var8))) {
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
        D.llIlllllIllI[D.llIllllllIll[0]] = "we null? wtf 1";
        D.llIlllllIllI[D.llIllllllIll[1]] = "we null? wtf 2";
        D.llIlllllIllI[D.llIllllllIll[2]] = "walking to start";
        D.llIlllllIllI[D.llIllllllIll[5]] = "Wizard Statue";
        D.llIlllllIllI[D.llIllllllIll[7]] = "Wizard Statue";
        D.llIlllllIllI[D.llIllllllIll[10]] = "Wizard Statue";
        D.llIlllllIllI[D.llIllllllIll[12]] = "Wizard Statue";
        D.llIlllllIllI[D.llIllllllIll[13]] = "Wizard Statue";
        D.llIlllllIllI[D.llIllllllIll[14]] = "Wizard Statue";
        D.llIlllllIllI[D.llIllllllIll[15]] = "EAST_III_I";
        D.llIlllllIllI[D.llIllllllIll[22]] = "EAST_III_II";
        D.llIlllllIllI[D.llIllllllIll[25]] = "NORTH_IV_VI";
    }

    static {
        D.lIIIIlllllIIlIl();
        D.lIIIIlllllIIlII();
        EAST_III_I = new GameEnum6(new RegionPoint(llIllllllIll[16], llIllllllIll[17], llIllllllIll[2], b.J), llIllllllIll[18], llIllllllIll[14], new RegionPoint(llIllllllIll[19], llIllllllIll[16], llIllllllIll[2], b.J), new RegionPoint(llIllllllIll[20], llIllllllIll[21], llIllllllIll[2], b.J), () -> {
            String[] stringArray = new String[llIllllllIll[1]];
            stringArray[D.llIllllllIll[0]] = llIlllllIllI[llIllllllIll[14]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(llIllllllIll[8], llIllllllIll[11], llIllllllIll[2], b.J)), (String[])stringArray);
        }, () -> {
            String[] stringArray = new String[llIllllllIll[1]];
            stringArray[D.llIllllllIll[0]] = llIlllllIllI[llIllllllIll[13]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(llIllllllIll[8], llIllllllIll[9], llIllllllIll[2], b.J)), (String[])stringArray);
        }, F.STATUE_6_DOUBLE);
        EAST_III_II = new GameEnum6(new RegionPoint(llIllllllIll[23], llIllllllIll[11], llIllllllIll[2], b.J), llIllllllIll[5], llIllllllIll[15], new RegionPoint(llIllllllIll[20], llIllllllIll[21], llIllllllIll[2], b.J), new RegionPoint(llIllllllIll[20], llIllllllIll[24], llIllllllIll[2], b.J), () -> {
            String[] stringArray = new String[llIllllllIll[1]];
            stringArray[D.llIllllllIll[0]] = llIlllllIllI[llIllllllIll[12]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(llIllllllIll[8], llIllllllIll[11], llIllllllIll[2], b.J)), (String[])stringArray);
        }, () -> {
            String[] stringArray = new String[llIllllllIll[1]];
            stringArray[D.llIllllllIll[0]] = llIlllllIllI[llIllllllIll[10]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(llIllllllIll[8], llIllllllIll[9], llIllllllIll[2], b.J)), (String[])stringArray);
        }, F.STATUE_6_DOUBLE);
        NORTH_IV_VI = new GameEnum6(new RegionPoint(llIllllllIll[26], llIllllllIll[27], llIllllllIll[2], b.L), llIllllllIll[14], llIllllllIll[14], new RegionPoint(llIllllllIll[26], llIllllllIll[24], llIllllllIll[2], b.L), new RegionPoint(llIllllllIll[28], llIllllllIll[24], llIllllllIll[2], b.L), () -> {
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

        return String.valueOf(var11);
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
        void var12;
        void var13;
        void var14;
        D var15;
        Player player = Players.getLocal();
        if (D.lIIIIlllllIIlll(player)) {
            return llIllllllIll[0];
        }
        if (D.lIIIIlllllIlIII(var15.a((Locatable)var14) ? 1 : 0)) {
            return llIllllllIll[0];
        }
        var15.a((SquireSepulchre)var13);
        if (D.lIIIIlllllIlIIl(var15.a((SepulchreManager) ar12) ? 1 : 0)) {
            System.out.println(llIlllllIllI[llIllllllIll[2]]);
            Movement.setDestination((WorldPoint)var15.destination.get());
            return llIllllllIll[1];
        }
        Movement.setDestination((WorldPoint)this.startPoint.get());
        return llIllllllIll[1];
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var16 = this.startAreas.get().iterator();
        while (D.lIIIIlllllIlIIl(var16.hasNext() ? 1 : 0)) {
            void var17;
            WorldArea var18 = var16.next();
            if (D.lIIIIlllllIlIIl(var18.contains((Locatable)var17) ? 1 : 0)) {
                return llIllllllIll[1];
            }

            if (3 != 0) continue;
            return ((0x57 ^ 0xE ^ (0x6C ^ 0x38)) & (0x6F ^ 0x11 ^ (0 ^ 0x73) ^ -1)) != 0;
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
        void var19;
        void var20;
        void var21;
        if (D.lIIIIlllllIlIll(j2.aG(), n2) && !D.lIIIIlllllIlIlI(j2.aF(), n3) || D.lIIIIlllllIlIll(var21.aG(), (int)var20) && D.lIIIIlllllIlIll(var21.aF(), (int)var19)) {
            return llIllllllIll[1];
        }
        return llIllllllIll[0];
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

}

