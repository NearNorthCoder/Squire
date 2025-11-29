/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Triple
 *  net.runelite.api.Client
 *  net.runelite.api.Deque
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.GameEnum12;
import gg.squire.sepulchre.tasks.BHelper;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.SquireSepulchre;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import kotlin.Triple;
import net.runelite.api.Client;
import net.runelite.api.Deque;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;

public final class GameEnum
extends Enum<G> {
    public static final  /* enum */ G NORTH_II_VII;
    public static final  /* enum */ G TOP_V_V;

    public static final  /* enum */ G NORTH_II_V;
     Supplier<List<WorldArea>> startAreas;
    public static final  /* enum */ G MIDDLE_V_XIII;
    public static final  /* enum */ G NORTH_II_VI;
     H type;
    public static final  /* enum */ G TOP_V_VII;
    public static final  /* enum */ G MIDDLE_V_XV;
     Supplier<WorldPoint> startPoint;
    public static final  /* enum */ G EAST_IV_II;
    public static final  /* enum */ G WEST_II_III;
    private static final  G[] $VALUES;
     Supplier<WorldPoint> destination;
    public static final  /* enum */ G EAST_II_VI;

    private static boolean var3(Object object) {
        return object == null;
    }

    private GameEnum(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, H h2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var4 = list.iterator();
            while (G.var5(var4.hasNext() ? 1 : 0)) {
                void var6;
                Triple var7 = (Triple)var4.next();
                var6.add(new WorldArea(SquireSepulchre.a((RegionPoint)var7.getFirst()), ((Integer)var7.getSecond()).intValue(), ((Integer)var7.getThird()).intValue()));
                0;
                0;
                if (-1 <= 2) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.type = h2;
    }

        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void var14() {
        var2 = new String[var1[31]];
        G.var2[G.var1[0]] = "in here!";
        G.var2[G.var1[1]] = "WEST_II_III";
        G.var2[G.var1[4]] = "EAST_II_VI";
        G.var2[G.var1[5]] = "NORTH_II_V";
        G.var2[G.var1[9]] = "NORTH_II_VI";
        G.var2[G.var1[11]] = "NORTH_II_VII";
        G.var2[G.var1[17]] = "EAST_IV_II";
        G.var2[G.var1[21]] = "TOP_V_V";
        G.var2[G.var1[25]] = "TOP_V_VII";
        G.var2[G.var1[23]] = "MIDDLE_V_XIII";
        G.var2[G.var1[29]] = "MIDDLE_V_XV";
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var1[0];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var1[0];
        while (G.var24(var23, var22)) {
            char var25 = var21[var23];
            var18.append((char)(var25 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if ((0xB ^ 0xF) > 0) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static void var26() {
        var1 = new int[32];
        G.var1[0] = (2 ^ 0x26 ^ (0x5E ^ 0x7F)) & (0x6F ^ 0x16 ^ (0xF0 ^ 0x8C) ^ -1);
        G.var1[1] = 1;
        G.var1[2] = 9 ^ 0x35;
        G.var1[3] = 0xFC ^ 0xC2 ^ (0x37 ^ 0x27);
        G.var1[4] = 2;
        G.var1[5] = 3;
        G.var1[6] = 0x74 ^ 0x78;
        G.var1[7] = 97 + 21 - -14 + 10 ^ 43 + 151 - 115 + 104;
        G.var1[8] = 0xD2 ^ 0x90 ^ (0xA ^ 0x6C);
        G.var1[9] = 0x5D ^ 0x46 ^ (0x58 ^ 0x47);
        G.var1[10] = 132 + 149 - 139 + 17 ^ 40 + 162 - 86 + 62;
        G.var1[11] = 0xA3 ^ 0x8D ^ (0x99 ^ 0xB2);
        G.var1[12] = 0x70 ^ 0x5C;
        G.var1[13] = 155 + 12 - 99 + 99 ^ 5 + 87 - -53 + 9;
        G.var1[14] = 0xA7 ^ 0x8F;
        G.var1[15] = 0x3E ^ 0x19;
        G.var1[16] = 90 + 22 - 7 + 83 ^ 92 + 17 - 95 + 145;
        G.var1[17] = 0x9C ^ 0x9A;
        G.var1[18] = 0x56 ^ 0x2F ^ (0x66 ^ 0x27);
        G.var1[19] = 195 + 136 - 309 + 189 ^ 172 + 95 - 102 + 34;
        G.var1[20] = 0x71 ^ 0x66;
        G.var1[21] = 0x71 ^ 0x5F ^ (0 ^ 0x29);
        G.var1[22] = 0xE ^ 0x3E;
        G.var1[23] = 0xF ^ 6;
        G.var1[24] = 0xE1 ^ 0x8F ^ (0x40 ^ 4);
        G.var1[25] = 0x5E ^ 0x56;
        G.var1[26] = 0xA3 ^ 0x83;
        G.var1[27] = 0x8A ^ 0x85;
        G.var1[28] = 0x93 ^ 0xB7 ^ (0xB6 ^ 0xA9);
        G.var1[29] = 0x54 ^ 0x5E;
        G.var1[30] = 0x8E ^ 0xC0 ^ (0x37 ^ 0x58);
        G.var1[31] = 96 + 83 - 136 + 99 ^ 95 + 19 - 111 + 130;
    }

    private GameEnum(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, H h2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.type = h2;
    }

    private static boolean var27(int n2) {
        return n2 == 0;
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    public static G[] values() {
        return (G[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public boolean c(WorldPoint worldPoint) {
        Iterator<WorldArea> var28 = this.startAreas.get().iterator();
        while (G.var5(var28.hasNext() ? 1 : 0)) {
            void var29;
            WorldArea var30 = var28.next();
            if (G.var5(var30.contains((WorldPoint)var29) ? 1 : 0)) {
                return var1[1];
            }
            0;
            if null == null continue;
            return ((28 + 123 - 59 + 68 ^ 149 + 134 - 187 + 63) & (0x41 ^ 0x16 ^ (0x27 ^ 0x4F) ^ -1)) != 0;
        }
        return var1[0];
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    public static G valueOf(String string) {
        return Enum.valueOf(GameEnum.class, string);
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var37;
        void var38;
        G var39;
        Player player = Players.getLocal();
        if (G.var3(player)) {
            return var1[0];
        }
        if (G.var27(var39.a((Locatable)var38) ? 1 : 0)) {
            return var1[0];
        }
        System.out.println(var2[var1[0]]);
        var39.a((SquireSepulchre)var37);
        if (G.var40((Object)var39.type, (Object)H.DART_STRANGE_TILES)) {
            Deque var41 = Static.getClient().getGraphicsObjects();
            Iterator var42 = var41.iterator();
            while (G.var5(var42.hasNext() ? 1 : 0)) {
                GraphicsObject var43 = (GraphicsObject)var42.next();
                if (G.var5(b.A.contains(var43.getId()) ? 1 : 0) && G.var5(var39.c(WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var43.getLocation())) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var43.getLocation()));
                    return var1[1];
                }
                0;
                if (-2 <= 0) continue;
                return ((0x88 ^ 0xB0 ^ (0x38 ^ 0x34)) & (0x59 ^ 9 ^ (0x46 ^ 0x22) ^ -1)) != 0;
            }
            return var1[0];
        }
        if (G.var40((Object)var39.type, (Object)H.BLADE_STRANGE_TILES)) {
            Deque var41 = Static.getClient().getGraphicsObjects();
            Iterator var42 = var41.iterator();
            while (G.var5(var42.hasNext() ? 1 : 0)) {
                GraphicsObject var43 = (GraphicsObject)var42.next();
                if (G.var5(b.A.contains(var43.getId()) ? 1 : 0) && G.var5(var39.c(WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var43.getLocation())) ? 1 : 0)) {
                    Movement.setDestination((WorldPoint)WorldPoint.fromLocal((Client)Static.getClient(), (LocalPoint)var43.getLocation()));
                    return var1[1];
                }
                0;
                if (1 != 0) continue;
                return ((0x64 ^ 0x3C) & ~(0x2F ^ 0x77)) != 0;
            }
        }
        Movement.setDestination((WorldPoint)this.destination.get());
        return var1[1];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var44 = this.startAreas.get().iterator();
        while (G.var5(var44.hasNext() ? 1 : 0)) {
            void var45;
            WorldArea var46 = var44.next();
            if (G.var5(var46.contains((Locatable)var45) ? 1 : 0)) {
                return var1[1];
            }
            0;
            if (2 <= 2) continue;
            return ((0xF4 ^ 0xC0) & ~(0x9A ^ 0xAE)) != 0;
        }
        return var1[0];
    }

    private static boolean var40(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var24(int n2, int n3) {
        return n2 < n3;
    }
}

