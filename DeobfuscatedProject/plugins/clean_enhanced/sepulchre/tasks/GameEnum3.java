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

import gg.squire.sepulchre.tasks.EHelper;
import gg.squire.sepulchre.tasks.GameEnum16;
import gg.squire.sepulchre.tasks.JHelper;
import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.SquireSepulchre;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
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

public final class GameEnum3
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
        if (D.var3(j2.aG(), n2) && D.var3(j2.aF(), n3) && D.var3(j3.aG(), n2) && D.var3(j3.aF(), n3)) {
            return var2[1];
        }
        return var2[0];
    }

    public Supplier<WorldPoint> al() {
        return this.startPoint;
    }

    private GameEnum3(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier<TileObject> supplier, Supplier<TileObject> supplier2, F f2) {
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
        D var4;
        void var5;
        void var6;
        J j2 = d2.b(this.object1.get());
        J j3 = d2.b(this.object2.get());
        if (!D.var7(j2) || D.var8(j3)) {
            if (D.var8(var6)) {
                System.out.println(var1[var2[0]]);
            }
            System.out.println(var1[var2[1]]);
            return var2[0];
        }
        System.out.println("ID1: " + var6.aG() + " | ticks1:" + var6.aF());
        System.out.println("ID2: " + var5.aG() + " | ticks2:" + var5.aF());
        Player var9 = Players.getLocal();
        if (D.var8(var9)) {
            return var2[0];
        }
        if (D.var10(var9.getWorldLocation().equals((Object)var4.startPoint.get()) ? 1 : 0)) {
            return var2[0];
        }
        switch (E.V[var4.type.ordinal()]) {
            case 1: {
                if (D.var11(var4.a(b.o, var2[2], (J)var6, (J)var5) ? 1 : 0)) {
                    return var2[1];
                }
                return var2[0];
            }
            case 2: {
                if (D.var11(var4.b(b.o, var2[2], (J)var6, (J)var5) ? 1 : 0)) {
                    return var2[1];
                }
                return var2[0];
            }
            case 3: {
                if (D.var11(var4.a(b.o, var2[2], b.p, var2[0], (J)var6, (J)var5) ? 1 : 0)) {
                    return var2[1];
                }
                if (D.var11(var4.a(b.n, var2[0], b.p, var2[0], (J)var6, (J)var5) ? 1 : 0)) {
                    return var2[1];
                }
                return var2[0];
            }
        }
        return var2[0];
    }

    private static boolean var3(int n2, int n3) {
        return n2 == n3;
    }

    public static D valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    private static boolean var12(int n2, int n3) {
        return n2 != n3;
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private GameEnum3(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier<TileObject> supplier, Supplier<TileObject> supplier2, F f2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var13 = list.iterator();
            while (D.var11(var13.hasNext() ? 1 : 0)) {
                void var14;
                Triple var15 = (Triple)var13.next();
                var14.add(new WorldArea(SquireSepulchre.a((RegionPoint)var15.getFirst()), ((Integer)var15.getSecond()).intValue(), ((Integer)var15.getThird()).intValue()));
                0;
                0;
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
        void var16;
        void var17;
        void var18;
        if (D.var3(j2.aG(), n2) && (!D.var11(n3) || !D.var12(j2.aF(), n3)) || D.var3(var18.aG(), (int)var17) && (!D.var11((int)var16) || D.var3(var18.aF(), (int)var16))) {
            return var2[1];
        }
        return var2[0];
    }

    private boolean a(int n2, J j2, J j3) {
        if (!D.var12(j2.aG(), n2) || D.var3(j3.aG(), n2)) {
            return var2[1];
        }
        return var2[0];
    }

    private static void var19() {
        var1 = new String[var2[29]];
        D.var1[D.var2[0]] = "we null? wtf 1";
        D.var1[D.var2[1]] = "we null? wtf 2";
        D.var1[D.var2[2]] = "walking to start";
        D.var1[D.var2[5]] = "Wizard Statue";
        D.var1[D.var2[7]] = "Wizard Statue";
        D.var1[D.var2[10]] = "Wizard Statue";
        D.var1[D.var2[12]] = "Wizard Statue";
        D.var1[D.var2[13]] = "Wizard Statue";
        D.var1[D.var2[14]] = "Wizard Statue";
        D.var1[D.var2[15]] = "EAST_III_I";
        D.var1[D.var2[22]] = "EAST_III_II";
        D.var1[D.var2[25]] = "NORTH_IV_VI";
    }

    static {
        D.var20();
        D.var19();
        EAST_III_I = new GameEnum3(new RegionPoint(var2[16], var2[17], var2[2], b.J), var2[18], var2[14], new RegionPoint(var2[19], var2[16], var2[2], b.J), new RegionPoint(var2[20], var2[21], var2[2], b.J), () -> {
            String[] stringArray = new String[var2[1]];
            stringArray[D.var2[0]] = var1[var2[14]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(var2[8], var2[11], var2[2], b.J)), (String[])stringArray);
        }, () -> {
            String[] stringArray = new String[var2[1]];
            stringArray[D.var2[0]] = var1[var2[13]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(var2[8], var2[9], var2[2], b.J)), (String[])stringArray);
        }, F.STATUE_6_DOUBLE);
        EAST_III_II = new GameEnum3(new RegionPoint(var2[23], var2[11], var2[2], b.J), var2[5], var2[15], new RegionPoint(var2[20], var2[21], var2[2], b.J), new RegionPoint(var2[20], var2[24], var2[2], b.J), () -> {
            String[] stringArray = new String[var2[1]];
            stringArray[D.var2[0]] = var1[var2[12]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(var2[8], var2[11], var2[2], b.J)), (String[])stringArray);
        }, () -> {
            String[] stringArray = new String[var2[1]];
            stringArray[D.var2[0]] = var1[var2[10]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(var2[8], var2[9], var2[2], b.J)), (String[])stringArray);
        }, F.STATUE_6_DOUBLE);
        NORTH_IV_VI = new GameEnum3(new RegionPoint(var2[26], var2[27], var2[2], b.L), var2[14], var2[14], new RegionPoint(var2[26], var2[24], var2[2], b.L), new RegionPoint(var2[28], var2[24], var2[2], b.L), () -> {
            String[] stringArray = new String[var2[1]];
            stringArray[D.var2[0]] = var1[var2[7]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(var2[3], var2[6], var2[2], b.L)), (String[])stringArray);
        }, () -> {
            String[] stringArray = new String[var2[1]];
            stringArray[D.var2[0]] = var1[var2[5]];
            return TileObjects.getFirstAt((WorldPoint)SquireSepulchre.a(new RegionPoint(var2[3], var2[4], var2[2], b.L)), (String[])stringArray);
        }, F.STATUE_8_DOUBLE);
        D[] dArray = new D[var2[5]];
        dArray[D.var2[0]] = EAST_III_I;
        dArray[D.var2[1]] = EAST_III_II;
        dArray[D.var2[2]] = NORTH_IV_VI;
        $VALUES = dArray;
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = var2[0];
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = var2[0];
        while (D.var30(var29, var28)) {
            char var31 = var27[var29];
            var24.append((char)(var31 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    private static boolean var30(int n2, int n3) {
        return n2 < n3;
    }

    public static D[] values() {
        return (D[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var32;
        void var33;
        void var34;
        D var35;
        Player player = Players.getLocal();
        if (D.var8(player)) {
            return var2[0];
        }
        if (D.var10(var35.a((Locatable)var34) ? 1 : 0)) {
            return var2[0];
        }
        var35.a((SquireSepulchre)var33);
        if (D.var11(var35.a((d)var32) ? 1 : 0)) {
            System.out.println(var1[var2[2]]);
            Movement.setDestination((WorldPoint)var35.destination.get());
            return var2[1];
        }
        Movement.setDestination((WorldPoint)this.startPoint.get());
        return var2[1];
    }

    private static void var20() {
        var2 = new int[30];
        D.var2[0] = (0x59 ^ 0x47) & ~(0x2C ^ 0x32);
        D.var2[1] = 1;
        D.var2[2] = 2;
        D.var2[3] = 0x74 ^ 0x5C;
        D.var2[4] = 0x21 ^ 0x26 ^ (0x6B ^ 0x54);
        D.var2[5] = 3;
        D.var2[6] = 0xAB ^ 0x98;
        D.var2[7] = 0xC7 ^ 0xC3;
        D.var2[8] = 0x1A ^ 0x36;
        D.var2[9] = 0x7C ^ 0x5B;
        D.var2[10] = 0x3B ^ 0x4A ^ (0xD9 ^ 0xAD);
        D.var2[11] = 0xD8 ^ 0x8D ^ (0x71 ^ 1);
        D.var2[12] = 121 + 0 - 86 + 123 ^ 90 + 99 - 153 + 116;
        D.var2[13] = 0x15 ^ 0x12;
        D.var2[14] = 0x60 ^ 0x35 ^ (0x5C ^ 1);
        D.var2[15] = 0xA5 ^ 0xAC;
        D.var2[16] = 0x14 ^ 0x30;
        D.var2[17] = 0x95 ^ 0x88;
        D.var2[18] = 0xF ^ 2;
        D.var2[19] = 0xD ^ 0x22;
        D.var2[20] = 0x6E ^ 0x5E;
        D.var2[21] = 66 + 61 - 87 + 98 ^ 94 + 29 - 34 + 78;
        D.var2[22] = 0x40 ^ 0x76 ^ (0xA6 ^ 0x9A);
        D.var2[23] = 0x46 ^ 0x5A ^ (0x3B ^ 9);
        D.var2[24] = 0x5E ^ 0x68;
        D.var2[25] = 0xC9 ^ 0xB4 ^ (0x31 ^ 0x47);
        D.var2[26] = 57 + 128 - 107 + 88 ^ 42 + 26 - 48 + 120;
        D.var2[27] = 0x9C ^ 0xA9;
        D.var2[28] = 0x4B ^ 0x29 ^ (0x34 ^ 0x76);
        D.var2[29] = 0x27 ^ 0x2B;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var36 = this.startAreas.get().iterator();
        while (D.var11(var36.hasNext() ? 1 : 0)) {
            void var37;
            WorldArea var38 = var36.next();
            if (D.var11(var38.contains((Locatable)var37) ? 1 : 0)) {
                return var2[1];
            }
            0;
            if (3 != 0) continue;
            return ((0x57 ^ 0xE ^ (0x6C ^ 0x38)) & (0x6F ^ 0x11 ^ (0 ^ 0x73) ^ -1)) != 0;
        }
        return var2[0];
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean a(int n2, int n3, J j2, J j3) {
        void var39;
        void var40;
        void var41;
        if (D.var3(j2.aG(), n2) && !D.var12(j2.aF(), n3) || D.var3(var41.aG(), (int)var40) && D.var3(var41.aF(), (int)var39)) {
            return var2[1];
        }
        return var2[0];
    }

        catch (Exception var47) {
            var47.printStackTrace();
            return null;
        }
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

        catch (Exception var53) {
            var53.printStackTrace();
            return null;
        }
    }
}

