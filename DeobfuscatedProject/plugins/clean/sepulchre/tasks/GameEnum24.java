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

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.J;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.sepulchre.tasks.SepulchreManager;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.f;
import gg.squire.sepulchre.tasks.GameEnum14;
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

public final class GameEnum24
extends Enum<e> {
    public  Supplier<TileObject> object;
    
    public static final  /* enum */ e WEST_III_VI;
    
     Supplier<WorldPoint> startPoint;
    public static final  /* enum */ e WEST_IV_I;
    public static final  /* enum */ e SOUTH_II_III;
    public static final  /* enum */ e NORTH_II_III;
     Supplier<List<WorldArea>> startAreas;
    public static final  /* enum */ e SOUTH_I_I;
    public static final  /* enum */ e TOP_V_IV;
    public static final  /* enum */ e NORTH_III_III;
    public static final  /* enum */ e SOUTH_IV_VI;
    public static final  /* enum */ e WEST_II_I;
    public static final  /* enum */ e NORTH_III_V;
    private static final  e[] $VALUES;
    public static final  /* enum */ e WEST_II_VII;
    public static final  /* enum */ e NORTH_IV_III;
    public static final  /* enum */ e MIDDLE_V_XI;
     Supplier<WorldPoint> destination;
    public static final  /* enum */ e EAST_I_III;
     g type;
    public static final  /* enum */ e WEST_I_III;
    public static final  /* enum */ e WEST_III_III;

    private static boolean lIIIlIIllIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var1 = this.startAreas.get().iterator();
        while (e.lIIIlIIllIllIlI(var1.hasNext() ? 1 : 0)) {
            void var2;
            WorldArea var3 = var1.next();
            if (e.lIIIlIIllIllIlI(var3.contains((Locatable)var2) ? 1 : 0)) {
                return lllIIIlllIlI[2];
            }

            return false;
        }
        return lllIIIlllIlI[0];
    }

    private static boolean lIIIlIIllIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    private GameEnum24(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier<TileObject> supplier, g g2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.object = supplier;
        this.type = g2;
    }

    private static void lIIIlIIllIlIIII() {
        lllIIIlllIIl = new String[lllIIIlllIlI[39]];
        e.lllIIIlllIIl[e.lllIIIlllIlI[0]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[2]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[14]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[9]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[1]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[5]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[11]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[15]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[16]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[17]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[8]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[18]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[19]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[3]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[7]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[6]] = "Knight Statue";
        e.lllIIIlllIIl[e.lllIIIlllIlI[4]] = "WEST_I_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[25]] = "SOUTH_I_I";
        e.lllIIIlllIIl[e.lllIIIlllIlI[13]] = "EAST_I_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[12]] = "WEST_II_I";
        e.lllIIIlllIIl[e.lllIIIlllIlI[36]] = "WEST_II_VII";
        e.lllIIIlllIIl[e.lllIIIlllIlI[40]] = "SOUTH_II_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[41]] = "NORTH_II_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[38]] = "NORTH_III_V";
        e.lllIIIlllIIl[e.lllIIIlllIlI[47]] = "WEST_III_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[37]] = "NORTH_III_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[10]] = "WEST_III_VI";
        e.lllIIIlllIIl[e.lllIIIlllIlI[52]] = "NORTH_IV_III";
        e.lllIIIlllIIl[e.lllIIIlllIlI[53]] = "SOUTH_IV_VI";
        e.lllIIIlllIIl[e.lllIIIlllIlI[42]] = "WEST_IV_I";
        e.lllIIIlllIIl[e.lllIIIlllIlI[33]] = "TOP_V_IV";
        e.lllIIIlllIIl[e.lllIIIlllIlI[28]] = "MIDDLE_V_XI";
    }

    private GameEnum24(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier<TileObject> supplier, g g2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var4 = list.iterator();
            while (e.lIIIlIIllIllIlI(var4.hasNext() ? 1 : 0)) {
                void var5;
                Triple var6 = (Triple)var4.next();
                var5.add(new WorldArea(SquireSepulchre.a((RegionPoint)var6.getFirst()), ((Integer)var6.getSecond()).intValue(), ((Integer)var6.getThird()).intValue()));

                if (-2 < 0) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.object = supplier;
        this.type = g2;
    }

    private static boolean lIIIlIIllIllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIllIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var7;
        void var8;
        void var9;
        e var10;
        Player player = Players.getLocal();
        if (e.lIIIlIIllIlIIlI(player)) {
            return lllIIIlllIlI[0];
        }
        if (e.lIIIlIIllIlIIll(var10.a((Locatable)var9) ? 1 : 0)) {
            return lllIIIlllIlI[0];
        }
        var10.a((SquireSepulchre)var8);
        if (e.lIIIlIIllIllIlI(var10.a((SepulchreManager) ar7) ? 1 : 0)) {
            WorldPoint var11 = var10.destination.get();
            System.out.println(var11);
            Movement.setDestination((WorldPoint)var11);
            return lllIIIlllIlI[2];
        }
        Movement.setDestination((WorldPoint)this.startPoint.get());
        return lllIIIlllIlI[2];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static boolean lIIIlIIllIlIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIlIIllIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static e valueOf(String string) {
        return Enum.valueOf(GameEnum24.class, string);
    }

    private static boolean lIIIlIIllIlIIll(int n2) {
        return n2 == 0;
    }

    static {
        e.lIIIlIIllIlIIIl();
        e.lIIIlIIllIlIIII();
        WEST_I_III = new GameEnum24(new RegionPoint(lllIIIlllIlI[0], lllIIIlllIlI[22], lllIIIlllIlI[14], b.C), lllIIIlllIlI[15], lllIIIlllIlI[17], new RegionPoint(lllIIIlllIlI[0], lllIIIlllIlI[23], lllIIIlllIlI[14], b.C), new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[24], lllIIIlllIlI[14], b.C), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[6]];
            return TileObjects.getNearest((WorldPoint)SquireSepulchre.a(new RegionPoint(lllIIIlllIlI[20], lllIIIlllIlI[21], lllIIIlllIlI[14], b.D)), (String[])stringArray);
        }, g.BLADE);
        SOUTH_I_I = new GameEnum24(List.of(new Triple((Object)new RegionPoint(lllIIIlllIlI[21], lllIIIlllIlI[9], lllIIIlllIlI[14], b.C), (Object)lllIIIlllIlI[4], (Object)lllIIIlllIlI[9]), new Triple((Object)new RegionPoint(lllIIIlllIlI[24], lllIIIlllIlI[26], lllIIIlllIlI[14], b.E), (Object)lllIIIlllIlI[9], (Object)lllIIIlllIlI[17])), new RegionPoint(lllIIIlllIlI[27], lllIIIlllIlI[9], lllIIIlllIlI[14], b.C), new RegionPoint(lllIIIlllIlI[28], lllIIIlllIlI[8], lllIIIlllIlI[14], b.C), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[7]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.BLADE_I);
        EAST_I_III = new GameEnum24(new RegionPoint(lllIIIlllIlI[29], lllIIIlllIlI[30], lllIIIlllIlI[14], b.C), lllIIIlllIlI[11], lllIIIlllIlI[18], new RegionPoint(lllIIIlllIlI[31], lllIIIlllIlI[30], lllIIIlllIlI[14], b.C), new RegionPoint(lllIIIlllIlI[32], lllIIIlllIlI[13], lllIIIlllIlI[14], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[3]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];

                if (3 <= ((234 + 62 - 176 + 134 ^ 58 + 31 - -36 + 41) & (0x77 ^ 0x21 ^ (0x7B ^ 0x75) ^ -1))) {
                    return ((32 + 157 - 182 + 245 ^ 162 + 13 - 108 + 111) & (0x64 ^ 0x41 ^ (0x6B ^ 0) ^ -1)) != 0;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.BLADE);
        WEST_II_I = new GameEnum24(new RegionPoint(lllIIIlllIlI[13], lllIIIlllIlI[33], lllIIIlllIlI[14], b.G), lllIIIlllIlI[19], lllIIIlllIlI[1], new RegionPoint(lllIIIlllIlI[13], lllIIIlllIlI[34], lllIIIlllIlI[14], b.G), new RegionPoint(lllIIIlllIlI[19], lllIIIlllIlI[35], lllIIIlllIlI[14], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[19]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];

                if (((0x2C ^ 0x69) & ~(0x80 ^ 0xC5)) != 0) {
                    return false;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.BLADE);
        WEST_II_VII = new GameEnum24(List.of(new Triple((Object)new RegionPoint(lllIIIlllIlI[26], lllIIIlllIlI[37], lllIIIlllIlI[2], b.I), (Object)lllIIIlllIlI[11], (Object)lllIIIlllIlI[11]), new Triple((Object)new RegionPoint(lllIIIlllIlI[26], lllIIIlllIlI[30], lllIIIlllIlI[2], b.I), (Object)lllIIIlllIlI[11], (Object)lllIIIlllIlI[8])), new RegionPoint(lllIIIlllIlI[2], lllIIIlllIlI[33], lllIIIlllIlI[2], b.G), new RegionPoint(lllIIIlllIlI[38], lllIIIlllIlI[39], lllIIIlllIlI[2], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[18]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[2])) {
                n2 = lllIIIlllIlI[2];

                if (1 >= (0x55 ^ 0x51)) {
                    return false;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.BLADE_II);
        SOUTH_II_III = new GameEnum24(new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[6], lllIIIlllIlI[14], b.G), lllIIIlllIlI[9], lllIIIlllIlI[2], new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[6], lllIIIlllIlI[14], b.G), new RegionPoint(lllIIIlllIlI[6], lllIIIlllIlI[3], lllIIIlllIlI[14], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[8]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];

                if (1 == 3) {
                    return false;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.BLADE_III);
        NORTH_II_III = new GameEnum24(new RegionPoint(lllIIIlllIlI[42], lllIIIlllIlI[43], lllIIIlllIlI[14], b.G), lllIIIlllIlI[19], lllIIIlllIlI[9], new RegionPoint(lllIIIlllIlI[21], lllIIIlllIlI[43], lllIIIlllIlI[14], b.G), new RegionPoint(lllIIIlllIlI[24], lllIIIlllIlI[44], lllIIIlllIlI[14], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[17]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];

                if (((0x33 ^ 0x6C) & ~(0x17 ^ 0x48)) > 3) {
                    return false;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.BLADE_IV);
        NORTH_III_V = new GameEnum24(new RegionPoint(lllIIIlllIlI[45], lllIIIlllIlI[7], lllIIIlllIlI[14], b.J), lllIIIlllIlI[9], lllIIIlllIlI[9], new RegionPoint(lllIIIlllIlI[45], lllIIIlllIlI[4], lllIIIlllIlI[14], b.J), new RegionPoint(lllIIIlllIlI[46], lllIIIlllIlI[40], lllIIIlllIlI[14], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[16]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];

                if (1 > 1) {
                    return ((0x1E ^ 0x42 ^ (0x69 ^ 0x71)) & (0x63 ^ 0xA ^ (0x8C ^ 0xA1) ^ -1)) != 0;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.GOLDEN_BLADE_II);
        WEST_III_III = new GameEnum24(new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[48], lllIIIlllIlI[14], b.J), lllIIIlllIlI[19], lllIIIlllIlI[7], new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[29], lllIIIlllIlI[14], b.J), new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[46], lllIIIlllIlI[14], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[15]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];

                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.GOLDEN_BLADE_I);
        NORTH_III_III = new GameEnum24(List.of(new Triple((Object)new RegionPoint(lllIIIlllIlI[49], lllIIIlllIlI[49], lllIIIlllIlI[14], b.J), (Object)lllIIIlllIlI[9], (Object)lllIIIlllIlI[17]), new Triple((Object)new RegionPoint(lllIIIlllIlI[26], lllIIIlllIlI[30], lllIIIlllIlI[2], b.I), (Object)lllIIIlllIlI[11], (Object)lllIIIlllIlI[8])), new RegionPoint(lllIIIlllIlI[48], lllIIIlllIlI[50], lllIIIlllIlI[14], b.J), new RegionPoint(lllIIIlllIlI[51], lllIIIlllIlI[35], lllIIIlllIlI[14], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (e.lIIIlIIllIllIlI(tileObject.getName().startsWith(lllIIIlllIIl[lllIIIlllIlI[11]]) ? 1 : 0) && e.lIIIlIIllIlIlII(tileObject.getPlane(), lllIIIlllIlI[14])) {
                n2 = lllIIIlllIlI[2];

                if ((0x39 ^ 0x3D) < ((0x20 ^ 0x67) & ~(0x17 ^ 0x50))) {
                    return false;
                }
            } else {
                n2 = lllIIIlllIlI[0];
            }
            return n2 != 0;
        }), g.GOLDEN_BLADE_I);
        WEST_III_VI = new GameEnum24(List.of(new Triple((Object)new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[6], lllIIIlllIlI[14], b.J), (Object)lllIIIlllIlI[9], (Object)lllIIIlllIlI[17]), new Triple((Object)new RegionPoint(lllIIIlllIlI[1], lllIIIlllIlI[9], lllIIIlllIlI[14], b.J), (Object)lllIIIlllIlI[9], (Object)lllIIIlllIlI[17])), new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[6], lllIIIlllIlI[14], b.J), new RegionPoint(lllIIIlllIlI[10], lllIIIlllIlI[5], lllIIIlllIlI[14], b.J), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[5]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.GOLDEN_BLADE_III);
        NORTH_IV_III = new GameEnum24(new RegionPoint(lllIIIlllIlI[8], lllIIIlllIlI[30], lllIIIlllIlI[14], b.L), lllIIIlllIlI[7], lllIIIlllIlI[17], new RegionPoint(lllIIIlllIlI[8], lllIIIlllIlI[46], lllIIIlllIlI[14], b.L), new RegionPoint(lllIIIlllIlI[19], lllIIIlllIlI[26], lllIIIlllIlI[14], b.L), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[1]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.GOLDEN_BLADE_IV);
        SOUTH_IV_VI = new GameEnum24(new RegionPoint(lllIIIlllIlI[5], lllIIIlllIlI[8], lllIIIlllIlI[14], b.L), lllIIIlllIlI[11], lllIIIlllIlI[11], new RegionPoint(lllIIIlllIlI[8], lllIIIlllIlI[8], lllIIIlllIlI[14], b.L), new RegionPoint(lllIIIlllIlI[47], lllIIIlllIlI[45], lllIIIlllIlI[14], b.M), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[9]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.GOLDEN_BLADE_V);
        WEST_IV_I = new GameEnum24(new RegionPoint(lllIIIlllIlI[36], lllIIIlllIlI[25], lllIIIlllIlI[2], b.L), lllIIIlllIlI[16], lllIIIlllIlI[9], new RegionPoint(lllIIIlllIlI[36], lllIIIlllIlI[12], lllIIIlllIlI[2], b.L), new RegionPoint(lllIIIlllIlI[15], lllIIIlllIlI[39], lllIIIlllIlI[2], b.L), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[14]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.GOLDEN_BLADE_VI);
        TOP_V_IV = new GameEnum24(new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[45], lllIIIlllIlI[14], b.N), lllIIIlllIlI[25], lllIIIlllIlI[11], new RegionPoint(lllIIIlllIlI[11], lllIIIlllIlI[45], lllIIIlllIlI[14], b.N), new RegionPoint(lllIIIlllIlI[5], lllIIIlllIlI[24], lllIIIlllIlI[14], b.N), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[2]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.BLUE_BLADE_I);
        MIDDLE_V_XI = new GameEnum24(new RegionPoint(lllIIIlllIlI[23], lllIIIlllIlI[45], lllIIIlllIlI[2], b.N), lllIIIlllIlI[6], lllIIIlllIlI[11], new RegionPoint(lllIIIlllIlI[29], lllIIIlllIlI[45], lllIIIlllIlI[2], b.N), new RegionPoint(lllIIIlllIlI[51], lllIIIlllIlI[24], lllIIIlllIlI[2], b.N), () -> {
            String[] stringArray = new String[lllIIIlllIlI[2]];
            stringArray[e.lllIIIlllIlI[0]] = lllIIIlllIIl[lllIIIlllIlI[0]];
            return TileObjects.getNearest((String[])stringArray);
        }, g.BLUE_BLADE_II);
        e[] eArray = new e[lllIIIlllIlI[4]];
        eArray[e.lllIIIlllIlI[0]] = WEST_I_III;
        eArray[e.lllIIIlllIlI[2]] = SOUTH_I_I;
        eArray[e.lllIIIlllIlI[14]] = EAST_I_III;
        eArray[e.lllIIIlllIlI[9]] = WEST_II_I;
        eArray[e.lllIIIlllIlI[1]] = WEST_II_VII;
        eArray[e.lllIIIlllIlI[5]] = SOUTH_II_III;
        eArray[e.lllIIIlllIlI[11]] = NORTH_II_III;
        eArray[e.lllIIIlllIlI[15]] = NORTH_III_V;
        eArray[e.lllIIIlllIlI[16]] = WEST_III_III;
        eArray[e.lllIIIlllIlI[17]] = NORTH_III_III;
        eArray[e.lllIIIlllIlI[8]] = WEST_III_VI;
        eArray[e.lllIIIlllIlI[18]] = NORTH_IV_III;
        eArray[e.lllIIIlllIlI[19]] = SOUTH_IV_VI;
        eArray[e.lllIIIlllIlI[3]] = WEST_IV_I;
        eArray[e.lllIIIlllIlI[7]] = TOP_V_IV;
        eArray[e.lllIIIlllIlI[6]] = MIDDLE_V_XI;
        $VALUES = eArray;
    }

        return String.valueOf(var12);
    }

    public static e[] values() {
        return (e[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2) {
        e var13;
        J j2 = d2.b(this.object.get());
        if (e.lIIIlIIllIlIIlI(j2)) {
            return lllIIIlllIlI[0];
        }
        Player var14 = Players.getLocal();
        if (e.lIIIlIIllIlIIlI(var14)) {
            return lllIIIlllIlI[0];
        }
        if (e.lIIIlIIllIlIIll(var14.getWorldLocation().equals((Object)var13.startPoint.get()) ? 1 : 0)) {
            return lllIIIlllIlI[0];
        }
        switch (f.S[var13.type.ordinal()]) {
            case 1: {
                void var15;
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && !e.lIIIlIIllIlIlIl(var15.aF(), lllIIIlllIlI[1]) || e.lIIIlIIllIlIlII(var15.aG(), b.v)) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && !e.lIIIlIIllIlIllI(var15.aF(), lllIIIlllIlI[3]) || !e.lIIIlIIllIlIlll(var15.aG(), b.t) || e.lIIIlIIllIlIlII(var15.aG(), b.w)) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 2: {
                void var15;
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s)) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 3: {
                void var15;
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIII(var15.aF(), lllIIIlllIlI[4])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var15.aG(), b.t)) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 4: {
                void var15;
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIIl(var15.aF(), lllIIIlllIlI[5])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIII(var15.aF(), lllIIIlllIlI[6])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 5: {
                void var15;
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIIl(var15.aF(), lllIIIlllIlI[5])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIII(var15.aF(), lllIIIlllIlI[4])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 6: {
                void var15;
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIIl(var15.aF(), lllIIIlllIlI[5])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIII(var15.aF(), lllIIIlllIlI[7])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 7: {
                void var15;
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIIl(var15.aF(), lllIIIlllIlI[1])) {
                    return lllIIIlllIlI[2];
                }
                if (!e.lIIIlIIllIlIlll(var15.aG(), b.u) || e.lIIIlIIllIlIlII(var15.aG(), b.v)) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIII(var15.aF(), lllIIIlllIlI[8])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 8: {
                void var15;
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIIl(var15.aF(), lllIIIlllIlI[9])) {
                    return lllIIIlllIlI[2];
                }
                if (!e.lIIIlIIllIlIlll(var15.aG(), b.u) || e.lIIIlIIllIlIlII(var15.aG(), b.v)) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIII(var15.aF(), lllIIIlllIlI[7])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 9: {
                void var15;
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIII(var15.aF(), lllIIIlllIlI[6])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIIl(var15.aF(), lllIIIlllIlI[9])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 10: {
                void var15;
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIIl(var15.aF(), lllIIIlllIlI[9])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 11: {
                void var15;
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIII(var15.aF(), lllIIIlllIlI[10])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIIl(var15.aF(), lllIIIlllIlI[11])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 12: {
                void var15;
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIII(var15.aF(), lllIIIlllIlI[12])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIIl(var15.aF(), lllIIIlllIlI[11])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
            case 13: {
                void var15;
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIII(var15.aF(), lllIIIlllIlI[13])) {
                    return lllIIIlllIlI[2];
                }
                if (e.lIIIlIIllIlIlII(var15.aG(), b.s) && e.lIIIlIIllIllIIl(var15.aF(), lllIIIlllIlI[11])) {
                    return lllIIIlllIlI[2];
                }
                return lllIIIlllIlI[0];
            }
        }
        return lllIIIlllIlI[0];
    }

    private static boolean lIIIlIIllIllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIIllIlIIlI(Object object) {
        return object == null;
    }
}

