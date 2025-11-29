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
 */
package gg.squire.sepulchre.tasks;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum21;
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

public final class GameEnum29
extends Enum<r> {
    public static final  /* enum */ r NORTH_I_VI;
    private static final  r[] $VALUES;
    public static final  /* enum */ r EAST_II_XII;
    public static final  /* enum */ r WEST_II_VI;
     Supplier<List<WorldArea>> startAreas;
    public static final  /* enum */ r NORTH_I_V;
     Supplier<WorldPoint> destination;
     s type;
    
    public static final  /* enum */ r SOUTH_IV_VII;
    public static final  /* enum */ r BOTTOM_V_IV;
    public static final  /* enum */ r NORTH_II_IV;
    public static final  /* enum */ r SOUTH_I_V;
    public static final  /* enum */ r SOUTH_II_VI;
    public static final  /* enum */ r SOUTH_III_II;
    public static final  /* enum */ r NORTH_IV_X;
    public  Supplier<TileObject> object;
    public static final  /* enum */ r EAST_II_VII;
    public static final  /* enum */ r SOUTH_IV_VI;
    public static final  /* enum */ r SOUTH_II_IV;
    public static final  /* enum */ r WEST_III_VI;
    
    public static final  /* enum */ r WEST_I_VI;
    public static final  /* enum */ r MIDDLE_V_XVII;
    public static final  /* enum */ r WEST_I_V;
    public static final  /* enum */ r NORTH_II_XI;
    public static final  /* enum */ r EAST_III_VIII;
    public static final  /* enum */ r WEST_II_VIII;
    public static final  /* enum */ r TOP_V_VIII;
     Supplier<WorldPoint> startPoint;
    public static final  /* enum */ r NORTH_II_I;
    public static final  /* enum */ r EAST_I_VI;

    private GameEnum29(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, Supplier<TileObject> supplier, s s2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var1 = list.iterator();
            while (r.lIIIlIIlIlIllll(var1.hasNext() ? 1 : 0)) {
                void var2;
                Triple var3 = (Triple)var1.next();
                var2.add(new WorldArea(SquireSepulchre.a((RegionPoint)var3.getFirst()), ((Integer)var3.getSecond()).intValue(), ((Integer)var3.getThird()).intValue()));

                if ((0x8C ^ 0x88) >= 3) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.object = supplier;
        this.type = s2;
    }

    private static boolean lIIIlIIlIlIllIl(Object object) {
        return object == null;
    }

    public static r valueOf(String string) {
        return Enum.valueOf(GameEnum29.class, string);
    }

        return String.valueOf(var4);
    }

    public static r[] values() {
        return (r[])$VALUES.clone();
    }

    static {
        r.lIIIlIIlIlIllII();
        r.lIIIlIIlIlIIlll();
        WEST_I_V = new GameEnum29(new RegionPoint(lllIIIllIIIl[21], lllIIIllIIIl[37], lllIIIllIIIl[3], b.C), lllIIIllIIIl[2], lllIIIllIIIl[12], new RegionPoint(lllIIIllIIIl[22], lllIIIllIIIl[37], lllIIIllIIIl[3], b.C), new RegionPoint(lllIIIllIIIl[22], lllIIIllIIIl[37], lllIIIllIIIl[3], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[50]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[51]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (-1 <= 3) return n2 != 0;
                    return ((114 + 78 - 72 + 10 ^ 31 + 71 - 95 + 139) & (62 + 80 - 85 + 79 ^ 70 + 3 - -3 + 76 ^ -1) & ((126 + 114 - 119 + 70 ^ 46 + 130 - 53 + 19) & (0x86 ^ 0x89 ^ (0x1C ^ 0x22) ^ -1) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        WEST_I_VI = new GameEnum29(new RegionPoint(lllIIIllIIIl[21], lllIIIllIIIl[29], lllIIIllIIIl[1], b.C), lllIIIllIIIl[2], lllIIIllIIIl[6], new RegionPoint(lllIIIllIIIl[23], lllIIIllIIIl[32], lllIIIllIIIl[1], b.C), new RegionPoint(lllIIIllIIIl[23], lllIIIllIIIl[32], lllIIIllIIIl[1], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[48]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[49]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (((0xCD ^ 0x94 ^ (0x6C ^ 0x16)) & (124 + 58 - 117 + 110 ^ 11 + 34 - -52 + 43 ^ -1)) == 0) return n2 != 0;
                    return ((2 ^ 0x73 ^ (0x6B ^ 0x42)) & (16 + 38 - -82 + 21 ^ 168 + 185 - 207 + 51 ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_I_V = new GameEnum29(new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[37], lllIIIllIIIl[3], b.C), lllIIIllIIIl[2], lllIIIllIIIl[5], new RegionPoint(lllIIIllIIIl[42], lllIIIllIIIl[37], lllIIIllIIIl[3], b.C), new RegionPoint(lllIIIllIIIl[42], lllIIIllIIIl[37], lllIIIllIIIl[3], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[46]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[47]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (2 > 0) return n2 != 0;
                    return ((0x44 ^ 0x4F ^ (0xEE ^ 0xB6)) & (26 + 98 - -97 + 16 ^ 77 + 10 - -94 + 9 ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_I_VI = new GameEnum29(new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[31], lllIIIllIIIl[1], b.C), lllIIIllIIIl[2], lllIIIllIIIl[2], new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[32], lllIIIllIIIl[1], b.C), new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[32], lllIIIllIIIl[1], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[44]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[45]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (3 != -1) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_I_V = new GameEnum29(new RegionPoint(lllIIIllIIIl[18], lllIIIllIIIl[26], lllIIIllIIIl[3], b.C), lllIIIllIIIl[6], lllIIIllIIIl[5], new RegionPoint(lllIIIllIIIl[19], lllIIIllIIIl[30], lllIIIllIIIl[3], b.C), new RegionPoint(lllIIIllIIIl[19], lllIIIllIIIl[30], lllIIIllIIIl[3], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[42]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[43]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (-3 < 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        EAST_I_VI = new GameEnum29(new RegionPoint(lllIIIllIIIl[44], lllIIIllIIIl[16], lllIIIllIIIl[3], b.C), lllIIIllIIIl[2], lllIIIllIIIl[16], new RegionPoint(lllIIIllIIIl[45], lllIIIllIIIl[30], lllIIIllIIIl[3], b.C), new RegionPoint(lllIIIllIIIl[45], lllIIIllIIIl[30], lllIIIllIIIl[3], b.C), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[40]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[41]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (((0x5F ^ 0x1C) & ~(0x7D ^ 0x3E)) <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        WEST_II_VI = new GameEnum29(new RegionPoint(lllIIIllIIIl[55], lllIIIllIIIl[19], lllIIIllIIIl[3], b.I), lllIIIllIIIl[8], lllIIIllIIIl[13], new RegionPoint(lllIIIllIIIl[57], lllIIIllIIIl[32], lllIIIllIIIl[3], b.I), new RegionPoint(lllIIIllIIIl[59], lllIIIllIIIl[21], lllIIIllIIIl[3], b.I), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[38]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[39]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        WEST_II_VIII = new GameEnum29(new RegionPoint(lllIIIllIIIl[61], lllIIIllIIIl[31], lllIIIllIIIl[1], b.I), lllIIIllIIIl[25], lllIIIllIIIl[2], new RegionPoint(lllIIIllIIIl[23], lllIIIllIIIl[32], lllIIIllIIIl[1], b.G), new RegionPoint(lllIIIllIIIl[23], lllIIIllIIIl[32], lllIIIllIIIl[1], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[36]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[37]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if ((0xE7 ^ 0x86 ^ (0x33 ^ 0x56)) >= 0) return n2 != 0;
                    return ((0x12 ^ 0x52 ^ (0x23 ^ 0x7C)) & (2 ^ 5 ^ (0x31 ^ 0x29) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_II_IV = new GameEnum29(new RegionPoint(lllIIIllIIIl[55], lllIIIllIIIl[3], lllIIIllIIIl[3], b.I), lllIIIllIIIl[33], lllIIIllIIIl[13], new RegionPoint(lllIIIllIIIl[15], lllIIIllIIIl[13], lllIIIllIIIl[3], b.G), new RegionPoint(lllIIIllIIIl[15], lllIIIllIIIl[13], lllIIIllIIIl[3], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[34]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[35]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_II_VI = new GameEnum29(new RegionPoint(lllIIIllIIIl[31], lllIIIllIIIl[22], lllIIIllIIIl[1], b.G), lllIIIllIIIl[2], lllIIIllIIIl[3], new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[23], lllIIIllIIIl[1], b.G), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[23], lllIIIllIIIl[1], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[32]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[33]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        EAST_II_VII = new GameEnum29(new RegionPoint(lllIIIllIIIl[33], lllIIIllIIIl[2], lllIIIllIIIl[3], b.G), lllIIIllIIIl[13], lllIIIllIIIl[7], new RegionPoint(lllIIIllIIIl[40], lllIIIllIIIl[7], lllIIIllIIIl[3], b.G), new RegionPoint(lllIIIllIIIl[40], lllIIIllIIIl[7], lllIIIllIIIl[3], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[30]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[31]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if ((132 + 49 - 122 + 77 ^ 39 + 68 - 51 + 84) == (0x9A ^ 0xA3 ^ (0x63 ^ 0x5E))) return n2 != 0;
                    return ((0x7C ^ 0x3C ^ (0x3A ^ 0x5B)) & (26 + 153 - 91 + 81 ^ 100 + 18 - 39 + 57 ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        EAST_II_XII = new GameEnum29(new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[30], lllIIIllIIIl[1], b.G), lllIIIllIIIl[6], lllIIIllIIIl[5], new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[32], lllIIIllIIIl[1], b.G), new RegionPoint(lllIIIllIIIl[41], lllIIIllIIIl[32], lllIIIllIIIl[1], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[28]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[29]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (-3 <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_II_I = new GameEnum29(new RegionPoint(lllIIIllIIIl[21], lllIIIllIIIl[36], lllIIIllIIIl[3], b.G), lllIIIllIIIl[15], lllIIIllIIIl[12], new RegionPoint(lllIIIllIIIl[22], lllIIIllIIIl[47], lllIIIllIIIl[3], b.G), new RegionPoint(lllIIIllIIIl[3], lllIIIllIIIl[47], lllIIIllIIIl[3], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[26]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[27]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (2 > 0) return n2 != 0;
                    return ((0x86 ^ 0x81 ^ (0x72 ^ 0x78)) & (0x7C ^ 0x57 ^ (0x2F ^ 9) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_II_IV = new GameEnum29(new RegionPoint(lllIIIllIIIl[38], lllIIIllIIIl[51], lllIIIllIIIl[3], b.G), lllIIIllIIIl[15], lllIIIllIIIl[12], new RegionPoint(lllIIIllIIIl[22], lllIIIllIIIl[47], lllIIIllIIIl[3], b.G), new RegionPoint(lllIIIllIIIl[3], lllIIIllIIIl[47], lllIIIllIIIl[3], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[24]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[25]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (((0x42 ^ 0) & ~(0x48 ^ 0xA)) >= -1) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_II_XI = new GameEnum29(new RegionPoint(lllIIIllIIIl[31], lllIIIllIIIl[41], lllIIIllIIIl[1], b.G), lllIIIllIIIl[2], lllIIIllIIIl[8], new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[41], lllIIIllIIIl[1], b.G), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[41], lllIIIllIIIl[1], b.G), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[22]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[23]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (-(0xB8 ^ 0xBC) < 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        EAST_III_VIII = new GameEnum29(new RegionPoint(lllIIIllIIIl[38], lllIIIllIIIl[2], lllIIIllIIIl[3], b.J), lllIIIllIIIl[8], lllIIIllIIIl[14], new RegionPoint(lllIIIllIIIl[38], lllIIIllIIIl[4], lllIIIllIIIl[3], b.J), new RegionPoint(lllIIIllIIIl[38], lllIIIllIIIl[4], lllIIIllIIIl[3], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[20]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[21]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (1 < 3) return n2 != 0;
                    return ((0xB3 ^ 0x87 ^ (0x63 ^ 0x5A)) & (0x4E ^ 0x14 ^ (0x1C ^ 0x4B) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_III_II = new GameEnum29(new RegionPoint(lllIIIllIIIl[27], lllIIIllIIIl[21], lllIIIllIIIl[1], b.J), lllIIIllIIIl[11], lllIIIllIIIl[10], new RegionPoint(lllIIIllIIIl[27], lllIIIllIIIl[30], lllIIIllIIIl[1], b.J), new RegionPoint(lllIIIllIIIl[27], lllIIIllIIIl[30], lllIIIllIIIl[1], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[18]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[19]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (((0x62 ^ 0x7D ^ (0x11 ^ 0x39)) & (0x8C ^ 0x98 ^ (0x8C ^ 0xAF) ^ -1)) == 0) return n2 != 0;
                    return ((0x99 ^ 0x92 ^ (0x18 ^ 0x37)) & (0x4D ^ 0x78 ^ (0xD4 ^ 0xC5) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        WEST_III_VI = new GameEnum29(List.of(new Triple((Object)new RegionPoint(lllIIIllIIIl[4], lllIIIllIIIl[12], lllIIIllIIIl[3], b.J), (Object)lllIIIllIIIl[21], (Object)lllIIIllIIIl[2]), new Triple((Object)new RegionPoint(lllIIIllIIIl[19], lllIIIllIIIl[2], lllIIIllIIIl[3], b.J), (Object)lllIIIllIIIl[8], (Object)lllIIIllIIIl[9])), new RegionPoint(lllIIIllIIIl[26], lllIIIllIIIl[5], lllIIIllIIIl[3], b.J), new RegionPoint(lllIIIllIIIl[26], lllIIIllIIIl[5], lllIIIllIIIl[3], b.J), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[16]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[17]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (-(74 + 103 - 46 + 56 ^ 186 + 37 - 196 + 164) < 0) return n2 != 0;
                    return ((0x6D ^ 0x14 ^ (0x94 ^ 0xB3)) & (0x4F ^ 0x1D ^ (0x6B ^ 0x67) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_IV_VII = new GameEnum29(new RegionPoint(lllIIIllIIIl[37], lllIIIllIIIl[2], lllIIIllIIIl[3], b.L), lllIIIllIIIl[25], lllIIIllIIIl[19], new RegionPoint(lllIIIllIIIl[37], lllIIIllIIIl[18], lllIIIllIIIl[3], b.L), new RegionPoint(lllIIIllIIIl[37], lllIIIllIIIl[18], lllIIIllIIIl[3], b.L), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[15]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if ((0xE ^ 0xB) != 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        NORTH_IV_X = new GameEnum29(new RegionPoint(lllIIIllIIIl[48], lllIIIllIIIl[35], lllIIIllIIIl[3], b.L), lllIIIllIIIl[9], lllIIIllIIIl[10], new RegionPoint(lllIIIllIIIl[48], lllIIIllIIIl[37], lllIIIllIIIl[3], b.L), new RegionPoint(lllIIIllIIIl[48], lllIIIllIIIl[37], lllIIIllIIIl[3], b.L), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[12]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[13]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (1 > 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        SOUTH_IV_VI = new GameEnum29(List.of(new Triple((Object)new RegionPoint(lllIIIllIIIl[31], lllIIIllIIIl[5], lllIIIllIIIl[1], b.L), (Object)lllIIIllIIIl[2], (Object)lllIIIllIIIl[16]), new Triple((Object)new RegionPoint(lllIIIllIIIl[34], lllIIIllIIIl[17], lllIIIllIIIl[1], b.L), (Object)lllIIIllIIIl[8], (Object)lllIIIllIIIl[2])), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[20], lllIIIllIIIl[1], b.L), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[20], lllIIIllIIIl[1], b.L), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[11]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (3 >= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        TOP_V_VIII = new GameEnum29(new RegionPoint(lllIIIllIIIl[2], lllIIIllIIIl[3], lllIIIllIIIl[3], b.N), lllIIIllIIIl[2], lllIIIllIIIl[14], new RegionPoint(lllIIIllIIIl[5], lllIIIllIIIl[4], lllIIIllIIIl[3], b.N), new RegionPoint(lllIIIllIIIl[5], lllIIIllIIIl[4], lllIIIllIIIl[3], b.N), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[8]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[9]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if ((152 + 102 - 198 + 122 ^ 54 + 73 - -45 + 10) == (34 + 145 - 164 + 150 ^ 159 + 20 - 26 + 8)) return n2 != 0;
                    return ((0x4A ^ 0x3C ^ (0x71 ^ 0x1F)) & (3 ^ (0x44 ^ 0x5F) ^ -1)) != 0;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        MIDDLE_V_XVII = new GameEnum29(new RegionPoint(lllIIIllIIIl[53], lllIIIllIIIl[8], lllIIIllIIIl[1], b.N), lllIIIllIIIl[14], lllIIIllIIIl[8], new RegionPoint(lllIIIllIIIl[60], lllIIIllIIIl[8], lllIIIllIIIl[1], b.N), new RegionPoint(lllIIIllIIIl[60], lllIIIllIIIl[8], lllIIIllIIIl[1], b.N), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[6]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[7]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (null == null) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        BOTTOM_V_IV = new GameEnum29(new RegionPoint(lllIIIllIIIl[25], lllIIIllIIIl[41], lllIIIllIIIl[0], b.N), lllIIIllIIIl[19], lllIIIllIIIl[6], new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[41], lllIIIllIIIl[0], b.N), new RegionPoint(lllIIIllIIIl[32], lllIIIllIIIl[41], lllIIIllIIIl[0], b.N), () -> TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIIIlIIlIlIllll(tileObject.getName().equals(lllIIIllIIII[lllIIIllIIIl[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIllIIIl[1]];
                stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[5]];
                if (r.lIIIlIIlIlIllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lllIIIllIIIl[1];

                    if (-1 <= 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lllIIIllIIIl[0];
            return n2 != 0;
        }), s.INTERACT);
        r[] rArray = new r[lllIIIllIIIl[24]];
        rArray[r.lllIIIllIIIl[0]] = WEST_I_V;
        rArray[r.lllIIIllIIIl[1]] = WEST_I_VI;
        rArray[r.lllIIIllIIIl[3]] = NORTH_I_V;
        rArray[r.lllIIIllIIIl[2]] = NORTH_I_VI;
        rArray[r.lllIIIllIIIl[4]] = SOUTH_I_V;
        rArray[r.lllIIIllIIIl[5]] = EAST_I_VI;
        rArray[r.lllIIIllIIIl[6]] = WEST_II_VI;
        rArray[r.lllIIIllIIIl[7]] = WEST_II_VIII;
        rArray[r.lllIIIllIIIl[8]] = SOUTH_II_IV;
        rArray[r.lllIIIllIIIl[9]] = SOUTH_II_VI;
        rArray[r.lllIIIllIIIl[10]] = EAST_II_VII;
        rArray[r.lllIIIllIIIl[11]] = EAST_II_XII;
        rArray[r.lllIIIllIIIl[12]] = NORTH_II_I;
        rArray[r.lllIIIllIIIl[13]] = NORTH_II_IV;
        rArray[r.lllIIIllIIIl[14]] = NORTH_II_XI;
        rArray[r.lllIIIllIIIl[15]] = EAST_III_VIII;
        rArray[r.lllIIIllIIIl[16]] = SOUTH_III_II;
        rArray[r.lllIIIllIIIl[17]] = WEST_III_VI;
        rArray[r.lllIIIllIIIl[18]] = SOUTH_IV_VII;
        rArray[r.lllIIIllIIIl[19]] = NORTH_IV_X;
        rArray[r.lllIIIllIIIl[20]] = SOUTH_IV_VI;
        rArray[r.lllIIIllIIIl[21]] = TOP_V_VIII;
        rArray[r.lllIIIllIIIl[22]] = MIDDLE_V_XVII;
        rArray[r.lllIIIllIIIl[23]] = BOTTOM_V_IV;
        $VALUES = rArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var5;
        r var6;
        Player player = Players.getLocal();
        if (r.lIIIlIIlIlIllIl(player)) {
            return lllIIIllIIIl[0];
        }
        if (r.lIIIlIIlIlIlllI(var6.a((Locatable)var5) ? 1 : 0)) {
            return lllIIIllIIIl[0];
        }
        this.a(squireSepulchre);
        this.X();

        return lllIIIllIIIl[1];
    }

    private GameEnum29(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, Supplier<TileObject> supplier, s s2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.object = supplier;
        this.type = s2;
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private boolean X() {
        TileObject tileObject = this.object.get();
        if (r.lIIIlIIlIlIllIl(tileObject)) {
            return lllIIIllIIIl[0];
        }
        System.out.println(lllIIIllIIII[lllIIIllIIIl[0]]);
        String[] stringArray = new String[lllIIIllIIIl[2]];
        stringArray[r.lllIIIllIIIl[0]] = lllIIIllIIII[lllIIIllIIIl[1]];
        stringArray[r.lllIIIllIIIl[1]] = lllIIIllIIII[lllIIIllIIIl[3]];
        stringArray[r.lllIIIllIIIl[3]] = lllIIIllIIII[lllIIIllIIIl[2]];
        tileObject.interact(stringArray);
        return lllIIIllIIIl[1];
    }

    private static boolean lIIIlIIlIlIlllI(int n2) {
        return n2 == 0;
    }

    private static void lIIIlIIlIlIIlll() {
        lllIIIllIIII = new String[lllIIIllIIIl[76]];
        r.lllIIIllIIII[r.lllIIIllIIIl[0]] = "Traversing";
        r.lllIIIllIIII[r.lllIIIllIIIl[1]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[3]] = "Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[2]] = "Squeeze-through";
        r.lllIIIllIIII[r.lllIIIllIIIl[4]] = "Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[5]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[6]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[7]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[8]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[9]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[10]] = "Gate";
        r.lllIIIllIIII[r.lllIIIllIIIl[11]] = "Squeeze-through";
        r.lllIIIllIIII[r.lllIIIllIIIl[12]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[13]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[14]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[15]] = "Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[16]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[17]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[18]] = "Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[19]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[20]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[21]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[22]] = "Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[23]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[24]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[25]] = "Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[26]] = "Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[27]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[28]] = "Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[29]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[30]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[31]] = "Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[32]] = "Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[33]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[34]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[35]] = "Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[36]] = "Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[37]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[38]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[39]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[40]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[41]] = "Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[42]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[43]] = "Climb-down";
        r.lllIIIllIIII[r.lllIIIllIIIl[44]] = "Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[45]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[46]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[47]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[48]] = "Platform";
        r.lllIIIllIIII[r.lllIIIllIIIl[49]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[50]] = "Stairs";
        r.lllIIIllIIII[r.lllIIIllIIIl[51]] = "Jump";
        r.lllIIIllIIII[r.lllIIIllIIIl[52]] = "WEST_I_V";
        r.lllIIIllIIII[r.lllIIIllIIIl[53]] = "WEST_I_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[54]] = "NORTH_I_V";
        r.lllIIIllIIII[r.lllIIIllIIIl[55]] = "NORTH_I_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[56]] = "SOUTH_I_V";
        r.lllIIIllIIII[r.lllIIIllIIIl[57]] = "EAST_I_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[58]] = "WEST_II_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[60]] = "WEST_II_VIII";
        r.lllIIIllIIII[r.lllIIIllIIIl[62]] = "SOUTH_II_IV";
        r.lllIIIllIIII[r.lllIIIllIIIl[59]] = "SOUTH_II_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[63]] = "EAST_II_VII";
        r.lllIIIllIIII[r.lllIIIllIIIl[61]] = "EAST_II_XII";
        r.lllIIIllIIII[r.lllIIIllIIIl[64]] = "NORTH_II_I";
        r.lllIIIllIIII[r.lllIIIllIIIl[65]] = "NORTH_II_IV";
        r.lllIIIllIIII[r.lllIIIllIIIl[66]] = "NORTH_II_XI";
        r.lllIIIllIIII[r.lllIIIllIIIl[67]] = "EAST_III_VIII";
        r.lllIIIllIIII[r.lllIIIllIIIl[68]] = "SOUTH_III_II";
        r.lllIIIllIIII[r.lllIIIllIIIl[69]] = "WEST_III_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[70]] = "SOUTH_IV_VII";
        r.lllIIIllIIII[r.lllIIIllIIIl[71]] = "NORTH_IV_X";
        r.lllIIIllIIII[r.lllIIIllIIIl[72]] = "SOUTH_IV_VI";
        r.lllIIIllIIII[r.lllIIIllIIIl[73]] = "TOP_V_VIII";
        r.lllIIIllIIII[r.lllIIIllIIIl[74]] = "MIDDLE_V_XVII";
        r.lllIIIllIIII[r.lllIIIllIIIl[75]] = "BOTTOM_V_IV";
    }

    private static boolean lIIIlIIlIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var7 = this.startAreas.get().iterator();
        while (r.lIIIlIIlIlIllll(var7.hasNext() ? 1 : 0)) {
            void var8;
            WorldArea var9 = var7.next();
            if (r.lIIIlIIlIlIllll(var9.contains((Locatable)var8) ? 1 : 0)) {
                return lllIIIllIIIl[1];
            }

            if (-1 < 2) continue;
            return false;
        }
        return lllIIIllIIIl[0];
    }

    private static boolean lIIIlIIlIlIllll(int n2) {
        return n2 != 0;
    }
}

