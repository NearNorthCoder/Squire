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

import gg.squire.sepulchre.tasks.SepulchreManager;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.tasks.GameEnum28;
import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.function.BooleanSupplier;
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

public final class GameEnum5
extends Enum<t> {
    
     Supplier<List<WorldArea>> startAreas;
     Supplier<WorldPoint> startPoint;
    public static final  /* enum */ t COFFIN_V_III;
    public static final  /* enum */ t COFFIN_V_I;
     Supplier<WorldPoint> destination;
    
    private static final  t[] $VALUES;
     u type;
    public static final  /* enum */ t COFFIN_IV_I_NORTH;
    public static final  /* enum */ t FINAL_COFFIN;
    public static final  /* enum */ t COFFIN_IV_II_;
    public static final  /* enum */ t COFFIN_V_II;
     Supplier<WorldArea> lootArea;
    public static final  /* enum */ t COFFIN_IV_I_SOUTH;

    private GameEnum5(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, int n3, int n4, u u2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var1 = list.iterator();
            while (t.lIIIIllllllIllI(var1.hasNext() ? 1 : 0)) {
                void var2;
                Triple var3 = (Triple)var1.next();
                var2.add(new WorldArea(SquireSepulchre.a((RegionPoint)var3.getFirst()), ((Integer)var3.getSecond()).intValue(), ((Integer)var3.getThird()).intValue()));

                if (-3 < 0) continue;
                return null;
            }
            return arrayList;
        };
        this.type = u2;
        this.lootArea = () -> new WorldArea(SquireSepulchre.a(regionPoint), n3, n4);
    }

    private static boolean lIIIIllllllIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIIllllllIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var6_6;
        void var4;
        void var5;
        t var6;
        Player player = Players.getLocal();
        if (t.lIIIIllllllIIIl(player)) {
            return llIlllllllII[0];
        }
        if (t.lIIIIllllllIIlI(var6.a((Locatable)var5) ? 1 : 0)) {
            return llIlllllllII[0];
        }
        System.out.println(llIllllllIlI[llIlllllllII[0]]);
        TileObject var7 = null;
        int var8 = var4.c();
        System.out.println("Time: " + var8);
        TileObject var9 = null;
        if (t.lIIIIllllllIIll(var8, llIlllllllII[1])) {
            var9 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().equals(llIllllllIlI[llIlllllllII[38]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[1]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[39]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0) && t.lIIIIllllllIllI(this.d((Locatable)tileObject) ? 1 : 0)) {
                        n2 = llIlllllllII[1];

                        if (-(0x85 ^ 0x81) <= 0) return n2 != 0;
                        return false;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });
        }
        if (t.lIIIIllllllIlII((Object)var6.type, (Object)u.HOLY_BARRIER)) {
            var7 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().toLowerCase().equals(llIllllllIlI[llIlllllllII[36]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[1]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[37]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIlllllllII[1];

                        if (3 >= 1) return n2 != 0;
                        return ((0x1C ^ 7 ^ (0x12 ^ 0x15)) & (0x50 ^ 3 ^ (0xF0 ^ 0xBF) ^ -1)) != 0;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });

            if (3 < -1) {
                return false;
            }
        } else if (t.lIIIIllllllIlII((Object)var6.type, (Object)u.FIX_BRIDGE)) {
            var7 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().toLowerCase().contains(llIllllllIlI[llIlllllllII[33]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[2]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[34]];
                    stringArray[t.llIlllllllII[1]] = llIllllllIlI[llIlllllllII[35]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIlllllllII[1];

                        if (((0x67 ^ 0x7E) & ~(0x33 ^ 0x2A)) <= 0) return n2 != 0;
                        return false;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });

            }
        } else if (t.lIIIIllllllIlII((Object)var6.type, (Object)u.CAST_PORTAL)) {
            var7 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().toLowerCase().contains(llIllllllIlI[llIlllllllII[30]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[2]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[31]];
                    stringArray[t.llIlllllllII[1]] = llIllllllIlI[llIlllllllII[32]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIlllllllII[1];

                        if (((0x86 ^ 0x8F) & ~(0x89 ^ 0x80)) != -1) return n2 != 0;
                        return false;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });

            if (-1 > (0x79 ^ 0x7D)) {
                return (3 & ~3) != 0;
            }
        } else if (t.lIIIIllllllIlII((Object)var6.type, (Object)u.BRAZIER)) {
            var7 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().toLowerCase().contains(llIllllllIlI[llIlllllllII[28]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[1]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[29]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIlllllllII[1];

                        if (-1 < (13 + 46 - -51 + 18 ^ 41 + 4 - -45 + 42)) return n2 != 0;
                        return ((0x51 ^ 0x25 ^ (0x52 ^ 0x66)) & (0xE8 ^ 0x9D ^ (0 ^ 0x35) ^ -1)) != 0;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });

            if (-(0x34 ^ 0x61 ^ (0x24 ^ 0x75)) > 0) {
                return ((0x35 ^ 0x21 ^ (6 ^ 0x2F)) & (0x45 ^ 0x1D ^ (0x67 ^ 2) ^ -1)) != 0;
            }
        } else if (t.lIIIIllllllIlII((Object)var6.type, (Object)u.GRAPPLE)) {
            var7 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().toLowerCase().contains(llIllllllIlI[llIlllllllII[26]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[1]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[27]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIlllllllII[1];

                        if (3 >= -1) return n2 != 0;
                        return (3 & (3 ^ -1)) != 0;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });
        }
        if (t.lIIIIllllllIIIl(var7)) {
            System.out.println(llIllllllIlI[llIlllllllII[1]]);
            if (t.lIIIIllllllIlIl((Object)var6.type, (Object)u.BRAZIER)) {
                return llIlllllllII[0];
            }
            var7 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().toLowerCase().equals(llIllllllIlI[llIlllllllII[24]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[1]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[25]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIlllllllII[1];

                        if ((2 & ~2) < 2) return n2 != 0;
                        return false;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });
            if (t.lIIIIllllllIIIl(var7)) {
                return llIlllllllII[0];
            }
        }
        if (t.lIIIIllllllIIlI(var6.d((Locatable)var5) ? 1 : 0)) {
            if (t.lIIIIllllllIIIl(var9)) {
                System.out.println(llIllllllIlI[llIlllllllII[2]]);
                return llIlllllllII[0];
            }
            if (t.lIIIIllllllIlII((Object)var6.type, (Object)u.FIX_BRIDGE)) {
                if (!t.lIIIIllllllIllI(a.k() ? 1 : 0) || !t.lIIIIllllllIllI(a.m() ? 1 : 0) || !t.lIIIIllllllIllI(a.n() ? 1 : 0) || t.lIIIIllllllIIlI(a.l() ? 1 : 0)) {
                    System.out.println(llIllllllIlI[llIlllllllII[3]]);
                    return llIlllllllII[0];
                }
            } else if (t.lIIIIllllllIlII((Object)var6.type, (Object)u.CAST_PORTAL)) {
                if (t.lIIIIllllllIIlI(a.a(var4.a()) ? 1 : 0)) {
                    System.out.println(llIllllllIlI[llIlllllllII[4]]);
                    return llIlllllllII[0];
                }
            } else if (t.lIIIIllllllIlII((Object)var6.type, (Object)u.BRAZIER)) {
                if (t.lIIIIllllllIIIl(var7)) {
                    System.out.println(llIllllllIlI[llIlllllllII[5]]);
                    return llIlllllllII[0];
                }
                if (t.lIIIIllllllIIlI(a.o() ? 1 : 0)) {
                    System.out.println(llIllllllIlI[llIlllllllII[6]]);
                    return llIlllllllII[0];
                }
            } else if (t.lIIIIllllllIlII((Object)var6.type, (Object)u.GRAPPLE)) {
                if (t.lIIIIllllllIIIl(var7)) {
                    System.out.println(llIllllllIlI[llIlllllllII[7]]);
                    return llIlllllllII[0];
                }
                if (t.lIIIIllllllIIlI(a.p() ? 1 : 0)) {
                    System.out.println(llIllllllIlI[llIlllllllII[8]]);
                    return llIlllllllII[0];
                }
            }
            String[] stringArray = new String[llIlllllllII[6]];
            stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[9]];
            stringArray[t.llIlllllllII[1]] = llIllllllIlI[llIlllllllII[10]];
            stringArray[t.llIlllllllII[2]] = llIllllllIlI[llIlllllllII[11]];
            stringArray[t.llIlllllllII[3]] = llIllllllIlI[llIlllllllII[12]];
            stringArray[t.llIlllllllII[4]] = llIllllllIlI[llIlllllllII[13]];
            stringArray[t.llIlllllllII[5]] = llIllllllIlI[llIlllllllII[14]];
            var7.interact(stringArray);
            return llIlllllllII[1];
        }
        if (t.lIIIIllllllIIIl(var9)) {
            System.out.println(llIllllllIlI[llIlllllllII[15]]);
            String[] stringArray = new String[llIlllllllII[6]];
            stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[16]];
            stringArray[t.llIlllllllII[1]] = llIllllllIlI[llIlllllllII[17]];
            stringArray[t.llIlllllllII[2]] = llIllllllIlI[llIlllllllII[18]];
            stringArray[t.llIlllllllII[3]] = llIllllllIlI[llIlllllllII[19]];
            stringArray[t.llIlllllllII[4]] = llIllllllIlI[llIlllllllII[20]];
            stringArray[t.llIlllllllII[5]] = llIllllllIlI[llIlllllllII[21]];
            var7.interact(stringArray);
            return llIlllllllII[1];
        }
        System.out.println(llIllllllIlI[llIlllllllII[22]]);
        var6_6.interact(llIllllllIlI[llIlllllllII[23]]);
        return llIlllllllII[1];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private static boolean lIIIIllllllIlIl(Object object, Object object2) {
        return object != object2;
    }

    private GameEnum5(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, int n5, int n6, BooleanSupplier booleanSupplier, u u2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.type = u2;
        this.lootArea = () -> new WorldArea(SquireSepulchre.a(regionPoint2), n5, n6);
    }

    public static t[] values() {
        return (t[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        t var10;
        if (t.lIIIIllllllIllI(this.lootArea.get().contains(locatable) ? 1 : 0)) {
            return llIlllllllII[1];
        }
        Iterator<WorldArea> var11 = var10.startAreas.get().iterator();
        while (t.lIIIIllllllIllI(var11.hasNext() ? 1 : 0)) {
            void var12;
            WorldArea var13 = var11.next();
            if (t.lIIIIllllllIllI(var13.contains((Locatable)var12) ? 1 : 0)) {
                return llIlllllllII[1];
            }

            if ((0x78 ^ 0x7C) > 2) continue;
            return false;
        }
        return llIlllllllII[0];
    }

    private static boolean lIIIIllllllIlII(Object object, Object object2) {
        return object == object2;
    }

    public boolean d(Locatable locatable) {
        return this.lootArea.get().contains(locatable);
    }

    private static boolean lIIIIllllllIIIl(Object object) {
        return object == null;
    }

    static {
        t.lIIIIllllllIIII();
        t.lIIIIlllllIllll();
        COFFIN_IV_I_SOUTH = new GameEnum5(new RegionPoint(llIlllllllII[41], llIlllllllII[13], llIlllllllII[2], b.L), llIlllllllII[3], llIlllllllII[8], new RegionPoint(llIlllllllII[42], llIlllllllII[25], llIlllllllII[2], b.L), llIlllllllII[9], llIlllllllII[4], u.FIX_BRIDGE);
        COFFIN_IV_I_NORTH = new GameEnum5(new RegionPoint(llIlllllllII[44], llIlllllllII[35], llIlllllllII[2], b.L), llIlllllllII[9], llIlllllllII[10], new RegionPoint(llIlllllllII[42], llIlllllllII[28], llIlllllllII[2], b.L), llIlllllllII[9], llIlllllllII[4], u.CAST_PORTAL);
        COFFIN_IV_II_ = new GameEnum5(List.of(new Triple((Object)new RegionPoint(llIlllllllII[31], llIlllllllII[5], llIlllllllII[1], b.L), (Object)llIlllllllII[3], (Object)llIlllllllII[16]), new Triple((Object)new RegionPoint(llIlllllllII[34], llIlllllllII[17], llIlllllllII[1], b.L), (Object)llIlllllllII[8], (Object)llIlllllllII[3])), new RegionPoint(llIlllllllII[45], llIlllllllII[15], llIlllllllII[1], b.L), llIlllllllII[9], llIlllllllII[7], u.BRAZIER);
        COFFIN_V_I = new GameEnum5(new RegionPoint(llIlllllllII[6], llIlllllllII[2], llIlllllllII[1], b.N), llIlllllllII[10], llIlllllllII[11], new RegionPoint(llIlllllllII[21], llIlllllllII[7], llIlllllllII[1], b.N), llIlllllllII[9], llIlllllllII[9], u.CAST_PORTAL);
        COFFIN_V_II = new GameEnum5(new RegionPoint(llIlllllllII[42], llIlllllllII[8], llIlllllllII[1], b.N), llIlllllllII[14], llIlllllllII[8], new RegionPoint(llIlllllllII[38], llIlllllllII[7], llIlllllllII[1], b.N), llIlllllllII[7], llIlllllllII[7], u.GRAPPLE);
        COFFIN_V_III = new GameEnum5(new RegionPoint(llIlllllllII[3], llIlllllllII[39], llIlllllllII[0], b.N), llIlllllllII[22], llIlllllllII[12], new RegionPoint(llIlllllllII[3], llIlllllllII[19], llIlllllllII[0], b.N), llIlllllllII[8], llIlllllllII[17], u.FIX_BRIDGE);
        FINAL_COFFIN = new GameEnum5(new RegionPoint(llIlllllllII[30], llIlllllllII[33], llIlllllllII[0], b.N), llIlllllllII[5], llIlllllllII[4], new RegionPoint(llIlllllllII[30], llIlllllllII[27], llIlllllllII[0], b.N), llIlllllllII[5], llIlllllllII[6], u.HOLY_BARRIER);
        t[] tArray = new t[llIlllllllII[7]];
        tArray[t.llIlllllllII[0]] = COFFIN_IV_I_SOUTH;
        tArray[t.llIlllllllII[1]] = COFFIN_IV_I_NORTH;
        tArray[t.llIlllllllII[2]] = COFFIN_IV_II_;
        tArray[t.llIlllllllII[3]] = COFFIN_V_I;
        tArray[t.llIlllllllII[4]] = COFFIN_V_II;
        tArray[t.llIlllllllII[5]] = COFFIN_V_III;
        tArray[t.llIlllllllII[6]] = FINAL_COFFIN;
        $VALUES = tArray;
    }

    private static boolean lIIIIllllllIIll(int n2, int n3) {
        return n2 > n3;
    }

    public static t valueOf(String string) {
        return Enum.valueOf(GameEnum5.class, string);
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    private static void lIIIIlllllIllll() {
        llIllllllIlI = new String[llIlllllllII[50]];
        t.llIllllllIlI[t.llIlllllllII[0]] = "contains";
        t.llIllllllIlI[t.llIlllllllII[1]] = "loot: interact is null";
        t.llIllllllIlI[t.llIlllllllII[2]] = "coffin is null";
        t.llIllllllIlI[t.llIlllllllII[3]] = "aint got items for bridge chief :(";
        t.llIllllllIlI[t.llIlllllllII[4]] = "aint got items for portal chief :(";
        t.llIllllllIlI[t.llIlllllllII[5]] = "interact is null hmmge";
        t.llIllllllIlI[t.llIlllllllII[6]] = "aint got items for brazier :(";
        t.llIllllllIlI[t.llIlllllllII[7]] = "interact is null hmmge";
        t.llIllllllIlI[t.llIlllllllII[8]] = "aint got items for grapple :(";
        t.llIllllllIlI[t.llIlllllllII[9]] = "Pass-through";
        t.llIllllllIlI[t.llIlllllllII[10]] = "Fix";
        t.llIllllllIlI[t.llIlllllllII[11]] = "Sacrifice";
        t.llIllllllIlI[t.llIlllllllII[12]] = "Conjure";
        t.llIllllllIlI[t.llIlllllllII[13]] = "Walk-over";
        t.llIllllllIlI[t.llIlllllllII[14]] = "Grapple";
        t.llIllllllIlI[t.llIlllllllII[15]] = "leaving area";
        t.llIllllllIlI[t.llIlllllllII[16]] = "Pass-through";
        t.llIllllllIlI[t.llIlllllllII[17]] = "Fix";
        t.llIllllllIlI[t.llIlllllllII[18]] = "Sacrifice";
        t.llIllllllIlI[t.llIlllllllII[19]] = "Conjure";
        t.llIllllllIlI[t.llIlllllllII[20]] = "Walk-over";
        t.llIllllllIlI[t.llIlllllllII[21]] = "Grapple";
        t.llIllllllIlI[t.llIlllllllII[22]] = "looting coffin";
        t.llIllllllIlI[t.llIlllllllII[23]] = "Search-for-traps";
        t.llIllllllIlI[t.llIlllllllII[24]] = "holy barrier";
        t.llIllllllIlI[t.llIlllllllII[25]] = "Pass-through";
        t.llIllllllIlI[t.llIlllllllII[26]] = "pillar";
        t.llIllllllIlI[t.llIlllllllII[27]] = "Grapple";
        t.llIllllllIlI[t.llIlllllllII[28]] = "saradomin brazier";
        t.llIllllllIlI[t.llIlllllllII[29]] = "Sacrifice";
        t.llIllllllIlI[t.llIlllllllII[30]] = "portal";
        t.llIllllllIlI[t.llIlllllllII[31]] = "Conjure";
        t.llIllllllIlI[t.llIlllllllII[32]] = "Pass-through";
        t.llIllllllIlI[t.llIlllllllII[33]] = "bridge";
        t.llIllllllIlI[t.llIlllllllII[34]] = "Fix";
        t.llIllllllIlI[t.llIlllllllII[35]] = "Walk-over";
        t.llIllllllIlI[t.llIlllllllII[36]] = "holy barrier";
        t.llIllllllIlI[t.llIlllllllII[37]] = "Pass-through";
        t.llIllllllIlI[t.llIlllllllII[38]] = "Coffin";
        t.llIllllllIlI[t.llIlllllllII[39]] = "Search-for-traps";
        t.llIllllllIlI[t.llIlllllllII[40]] = "COFFIN_IV_I_SOUTH";
        t.llIllllllIlI[t.llIlllllllII[43]] = "COFFIN_IV_I_NORTH";
        t.llIllllllIlI[t.llIlllllllII[45]] = "COFFIN_IV_II_";
        t.llIllllllIlI[t.llIlllllllII[46]] = "COFFIN_V_I";
        t.llIllllllIlI[t.llIlllllllII[47]] = "COFFIN_V_II";
        t.llIllllllIlI[t.llIlllllllII[48]] = "COFFIN_V_III";
        t.llIllllllIlI[t.llIlllllllII[49]] = "FINAL_COFFIN";
    }

    private GameEnum5(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, int n5, int n6, u u2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.type = u2;
        this.lootArea = () -> new WorldArea(SquireSepulchre.a(regionPoint2), n5, n6);
    }

        return String.valueOf(var14);
    }

    private static boolean lIIIIllllllIllI(int n2) {
        return n2 != 0;
    }
}

