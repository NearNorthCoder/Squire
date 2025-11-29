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
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.a;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.u;
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

public final class t
extends Enum<t> {
    private static /* synthetic */ int[] llIlllllllII;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    public static final /* synthetic */ /* enum */ t COFFIN_V_III;
    public static final /* synthetic */ /* enum */ t COFFIN_V_I;
    /* synthetic */ Supplier<WorldPoint> destination;
    private static /* synthetic */ String[] llIllllllIlI;
    private static final /* synthetic */ t[] $VALUES;
    /* synthetic */ u type;
    public static final /* synthetic */ /* enum */ t COFFIN_IV_I_NORTH;
    public static final /* synthetic */ /* enum */ t FINAL_COFFIN;
    public static final /* synthetic */ /* enum */ t COFFIN_IV_II_;
    public static final /* synthetic */ /* enum */ t COFFIN_V_II;
    /* synthetic */ Supplier<WorldArea> lootArea;
    public static final /* synthetic */ /* enum */ t COFFIN_IV_I_SOUTH;

    private t(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, int n3, int n4, u u2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var24 = list.iterator();
            while (t.lIIIIllllllIllI(var24.hasNext() ? 1 : 0)) {
                void var8;
                Triple var13 = (Triple)var24.next();
                var8.add(new WorldArea(SquireSepulchre.a((RegionPoint)var13.getFirst()), ((Integer)var13.getSecond()).intValue(), ((Integer)var13.getThird()).intValue()));
                0;
                0;
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

    private static String lIIIIlllllIIIlI(String var19, String var5) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var31 = Cipher.getInstance("Blowfish");
            var31.init(llIlllllllII[2], var20);
            return new String(var31.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIllllllIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var6_6;
        void var25;
        void var11;
        t var26;
        Player player = Players.getLocal();
        if (t.lIIIIllllllIIIl(player)) {
            return llIlllllllII[0];
        }
        if (t.lIIIIllllllIIlI(var26.a((Locatable)var11) ? 1 : 0)) {
            return llIlllllllII[0];
        }
        System.out.println(llIllllllIlI[llIlllllllII[0]]);
        TileObject var2 = null;
        int var6 = var25.c();
        System.out.println("Time: " + var6);
        TileObject var21 = null;
        if (t.lIIIIllllllIIll(var6, llIlllllllII[1])) {
            var21 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().equals(llIllllllIlI[llIlllllllII[38]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[1]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[39]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0) && t.lIIIIllllllIllI(this.d((Locatable)tileObject) ? 1 : 0)) {
                        n2 = llIlllllllII[1];
                        0;
                        if (-(0x85 ^ 0x81) <= 0) return n2 != 0;
                        return false;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });
        }
        if (t.lIIIIllllllIlII((Object)var26.type, (Object)u.HOLY_BARRIER)) {
            var2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().toLowerCase().equals(llIllllllIlI[llIlllllllII[36]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[1]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[37]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIlllllllII[1];
                        0;
                        if (3 >= 1) return n2 != 0;
                        return ((0x1C ^ 7 ^ (0x12 ^ 0x15)) & (0x50 ^ 3 ^ (0xF0 ^ 0xBF) ^ -1)) != 0;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });
            0;
            if (3 < -1) {
                return false;
            }
        } else if (t.lIIIIllllllIlII((Object)var26.type, (Object)u.FIX_BRIDGE)) {
            var2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().toLowerCase().contains(llIllllllIlI[llIlllllllII[33]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[2]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[34]];
                    stringArray[t.llIlllllllII[1]] = llIllllllIlI[llIlllllllII[35]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIlllllllII[1];
                        0;
                        if (((0x67 ^ 0x7E) & ~(0x33 ^ 0x2A)) <= 0) return n2 != 0;
                        return false;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });
            0;
            
            }
        } else if (t.lIIIIllllllIlII((Object)var26.type, (Object)u.CAST_PORTAL)) {
            var2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().toLowerCase().contains(llIllllllIlI[llIlllllllII[30]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[2]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[31]];
                    stringArray[t.llIlllllllII[1]] = llIllllllIlI[llIlllllllII[32]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIlllllllII[1];
                        0;
                        if (((0x86 ^ 0x8F) & ~(0x89 ^ 0x80)) != -1) return n2 != 0;
                        return false;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });
            0;
            if (-1 > (0x79 ^ 0x7D)) {
                return (3 & ~3) != 0;
            }
        } else if (t.lIIIIllllllIlII((Object)var26.type, (Object)u.BRAZIER)) {
            var2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().toLowerCase().contains(llIllllllIlI[llIlllllllII[28]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[1]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[29]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIlllllllII[1];
                        0;
                        if (-1 < (13 + 46 - -51 + 18 ^ 41 + 4 - -45 + 42)) return n2 != 0;
                        return ((0x51 ^ 0x25 ^ (0x52 ^ 0x66)) & (0xE8 ^ 0x9D ^ (0 ^ 0x35) ^ -1)) != 0;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });
            0;
            if (-(0x34 ^ 0x61 ^ (0x24 ^ 0x75)) > 0) {
                return ((0x35 ^ 0x21 ^ (6 ^ 0x2F)) & (0x45 ^ 0x1D ^ (0x67 ^ 2) ^ -1)) != 0;
            }
        } else if (t.lIIIIllllllIlII((Object)var26.type, (Object)u.GRAPPLE)) {
            var2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().toLowerCase().contains(llIllllllIlI[llIlllllllII[26]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[1]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[27]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIlllllllII[1];
                        0;
                        if (3 >= -1) return n2 != 0;
                        return (3 & (3 ^ -1)) != 0;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });
        }
        if (t.lIIIIllllllIIIl(var2)) {
            System.out.println(llIllllllIlI[llIlllllllII[1]]);
            if (t.lIIIIllllllIlIl((Object)var26.type, (Object)u.BRAZIER)) {
                return llIlllllllII[0];
            }
            var2 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (t.lIIIIllllllIllI(tileObject.getName().toLowerCase().equals(llIllllllIlI[llIlllllllII[24]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIlllllllII[1]];
                    stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[25]];
                    if (t.lIIIIllllllIllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = llIlllllllII[1];
                        0;
                        if ((2 & ~2) < 2) return n2 != 0;
                        return false;
                    }
                }
                n2 = llIlllllllII[0];
                return n2 != 0;
            });
            if (t.lIIIIllllllIIIl(var2)) {
                return llIlllllllII[0];
            }
        }
        if (t.lIIIIllllllIIlI(var26.d((Locatable)var11) ? 1 : 0)) {
            if (t.lIIIIllllllIIIl(var21)) {
                System.out.println(llIllllllIlI[llIlllllllII[2]]);
                return llIlllllllII[0];
            }
            if (t.lIIIIllllllIlII((Object)var26.type, (Object)u.FIX_BRIDGE)) {
                if (!t.lIIIIllllllIllI(a.k() ? 1 : 0) || !t.lIIIIllllllIllI(a.m() ? 1 : 0) || !t.lIIIIllllllIllI(a.n() ? 1 : 0) || t.lIIIIllllllIIlI(a.l() ? 1 : 0)) {
                    System.out.println(llIllllllIlI[llIlllllllII[3]]);
                    return llIlllllllII[0];
                }
            } else if (t.lIIIIllllllIlII((Object)var26.type, (Object)u.CAST_PORTAL)) {
                if (t.lIIIIllllllIIlI(a.a(var25.a()) ? 1 : 0)) {
                    System.out.println(llIllllllIlI[llIlllllllII[4]]);
                    return llIlllllllII[0];
                }
            } else if (t.lIIIIllllllIlII((Object)var26.type, (Object)u.BRAZIER)) {
                if (t.lIIIIllllllIIIl(var2)) {
                    System.out.println(llIllllllIlI[llIlllllllII[5]]);
                    return llIlllllllII[0];
                }
                if (t.lIIIIllllllIIlI(a.o() ? 1 : 0)) {
                    System.out.println(llIllllllIlI[llIlllllllII[6]]);
                    return llIlllllllII[0];
                }
            } else if (t.lIIIIllllllIlII((Object)var26.type, (Object)u.GRAPPLE)) {
                if (t.lIIIIllllllIIIl(var2)) {
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
            var2.interact(stringArray);
            return llIlllllllII[1];
        }
        if (t.lIIIIllllllIIIl(var21)) {
            System.out.println(llIllllllIlI[llIlllllllII[15]]);
            String[] stringArray = new String[llIlllllllII[6]];
            stringArray[t.llIlllllllII[0]] = llIllllllIlI[llIlllllllII[16]];
            stringArray[t.llIlllllllII[1]] = llIllllllIlI[llIlllllllII[17]];
            stringArray[t.llIlllllllII[2]] = llIllllllIlI[llIlllllllII[18]];
            stringArray[t.llIlllllllII[3]] = llIllllllIlI[llIlllllllII[19]];
            stringArray[t.llIlllllllII[4]] = llIllllllIlI[llIlllllllII[20]];
            stringArray[t.llIlllllllII[5]] = llIllllllIlI[llIlllllllII[21]];
            var2.interact(stringArray);
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

    private static void lIIIIllllllIIII() {
        llIlllllllII = new int[51];
        t.llIlllllllII[0] = (0xE ^ 0x4E ^ (0x98 ^ 0xC3)) & (0xEF ^ 0xC7 ^ (0x1B ^ 0x28) ^ -1);
        t.llIlllllllII[1] = 1;
        t.llIlllllllII[2] = 2;
        t.llIlllllllII[3] = 3;
        t.llIlllllllII[4] = 0x94 ^ 0x90;
        t.llIlllllllII[5] = 0x1A ^ 0x7A ^ (0x46 ^ 0x23);
        t.llIlllllllII[6] = 0x91 ^ 0x97;
        t.llIlllllllII[7] = 0x6C ^ 0x7B ^ (0x81 ^ 0x91);
        t.llIlllllllII[8] = 71 + 115 - 132 + 73 ^ (0x5E ^ 0x29);
        t.llIlllllllII[9] = 0x75 ^ 0x7C;
        t.llIlllllllII[10] = 5 + 32 - -104 + 10 ^ 136 + 126 - 171 + 66;
        t.llIlllllllII[11] = 0xC1 ^ 0x99 ^ (0xFF ^ 0xAC);
        t.llIlllllllII[12] = 0x8F ^ 0x83;
        t.llIlllllllII[13] = 0x1F ^ 0x37 ^ (0x59 ^ 0x7C);
        t.llIlllllllII[14] = 109 + 103 - 134 + 66 ^ 35 + 95 - -26 + 2;
        t.llIlllllllII[15] = 0xAB ^ 0xA4;
        t.llIlllllllII[16] = 0xD1 ^ 0xC1;
        t.llIlllllllII[17] = 11 + 132 - 29 + 36 ^ 24 + 50 - 31 + 92;
        t.llIlllllllII[18] = 0x43 ^ 0x39 ^ (0x6D ^ 5);
        t.llIlllllllII[19] = 0x22 ^ 0x31;
        t.llIlllllllII[20] = 0x21 ^ 0x35;
        t.llIlllllllII[21] = 2 ^ 0x17;
        t.llIlllllllII[22] = 24 + 78 - -29 + 82 ^ 122 + 183 - 190 + 80;
        t.llIlllllllII[23] = 0x90 ^ 0x87;
        t.llIlllllllII[24] = 0xA8 ^ 0xB0;
        t.llIlllllllII[25] = 0x9A ^ 0x83;
        t.llIlllllllII[26] = 0x47 ^ 0x5D;
        t.llIlllllllII[27] = 0x6C ^ 0x77;
        t.llIlllllllII[28] = 0x80 ^ 0x8A ^ (0xA1 ^ 0xB7);
        t.llIlllllllII[29] = 174 + 109 - 192 + 127 ^ 157 + 101 - 120 + 61;
        t.llIlllllllII[30] = 0xD9 ^ 0xC7;
        t.llIlllllllII[31] = 0xBA ^ 0x8E ^ (0xE8 ^ 0xC3);
        t.llIlllllllII[32] = 44 + 27 - 24 + 88 ^ 152 + 132 - 263 + 146;
        t.llIlllllllII[33] = 0xC6 ^ 0xAD ^ (0x29 ^ 0x63);
        t.llIlllllllII[34] = 84 + 115 - 106 + 54 ^ 15 + 33 - 3 + 132;
        t.llIlllllllII[35] = 0x61 ^ 0x42;
        t.llIlllllllII[36] = 0x6C ^ 0x48;
        t.llIlllllllII[37] = 32 + 12 - 28 + 148 ^ 80 + 125 - 117 + 41;
        t.llIlllllllII[38] = 0x41 ^ 0x67;
        t.llIlllllllII[39] = 0x8F ^ 0xA8;
        t.llIlllllllII[40] = 0 + 70 - -38 + 39 ^ 135 + 163 - 288 + 177;
        t.llIlllllllII[41] = 0x12 ^ 0x2A;
        t.llIlllllllII[42] = 0x7D ^ 0x29 ^ (0x2D ^ 0x4C);
        t.llIlllllllII[43] = 0xA6 ^ 0x8F;
        t.llIlllllllII[44] = 45 + 144 - 55 + 17 ^ 154 + 18 - 55 + 50;
        t.llIlllllllII[45] = 0x6A ^ 0x53 ^ (0x2A ^ 0x39);
        t.llIlllllllII[46] = 0x5A ^ 9 ^ (0xC8 ^ 0xB0);
        t.llIlllllllII[47] = 0x25 ^ 9;
        t.llIlllllllII[48] = 0x4F ^ 0x19 ^ (0x33 ^ 0x48);
        t.llIlllllllII[49] = 0x63 ^ 0x4D;
        t.llIlllllllII[50] = 166 + 107 - 236 + 131 ^ 90 + 29 - 91 + 107;
    }

    private static boolean lIIIIllllllIlIl(Object object, Object object2) {
        return object != object2;
    }

    private t(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, int n5, int n6, BooleanSupplier booleanSupplier, u u2) {
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
        t var14;
        if (t.lIIIIllllllIllI(this.lootArea.get().contains(locatable) ? 1 : 0)) {
            return llIlllllllII[1];
        }
        Iterator<WorldArea> var18 = var14.startAreas.get().iterator();
        while (t.lIIIIllllllIllI(var18.hasNext() ? 1 : 0)) {
            void var16;
            WorldArea var3 = var18.next();
            if (t.lIIIIllllllIllI(var3.contains((Locatable)var16) ? 1 : 0)) {
                return llIlllllllII[1];
            }
            0;
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
        COFFIN_IV_I_SOUTH = new t(new RegionPoint(llIlllllllII[41], llIlllllllII[13], llIlllllllII[2], b.L), llIlllllllII[3], llIlllllllII[8], new RegionPoint(llIlllllllII[42], llIlllllllII[25], llIlllllllII[2], b.L), llIlllllllII[9], llIlllllllII[4], u.FIX_BRIDGE);
        COFFIN_IV_I_NORTH = new t(new RegionPoint(llIlllllllII[44], llIlllllllII[35], llIlllllllII[2], b.L), llIlllllllII[9], llIlllllllII[10], new RegionPoint(llIlllllllII[42], llIlllllllII[28], llIlllllllII[2], b.L), llIlllllllII[9], llIlllllllII[4], u.CAST_PORTAL);
        COFFIN_IV_II_ = new t(List.of(new Triple((Object)new RegionPoint(llIlllllllII[31], llIlllllllII[5], llIlllllllII[1], b.L), (Object)llIlllllllII[3], (Object)llIlllllllII[16]), new Triple((Object)new RegionPoint(llIlllllllII[34], llIlllllllII[17], llIlllllllII[1], b.L), (Object)llIlllllllII[8], (Object)llIlllllllII[3])), new RegionPoint(llIlllllllII[45], llIlllllllII[15], llIlllllllII[1], b.L), llIlllllllII[9], llIlllllllII[7], u.BRAZIER);
        COFFIN_V_I = new t(new RegionPoint(llIlllllllII[6], llIlllllllII[2], llIlllllllII[1], b.N), llIlllllllII[10], llIlllllllII[11], new RegionPoint(llIlllllllII[21], llIlllllllII[7], llIlllllllII[1], b.N), llIlllllllII[9], llIlllllllII[9], u.CAST_PORTAL);
        COFFIN_V_II = new t(new RegionPoint(llIlllllllII[42], llIlllllllII[8], llIlllllllII[1], b.N), llIlllllllII[14], llIlllllllII[8], new RegionPoint(llIlllllllII[38], llIlllllllII[7], llIlllllllII[1], b.N), llIlllllllII[7], llIlllllllII[7], u.GRAPPLE);
        COFFIN_V_III = new t(new RegionPoint(llIlllllllII[3], llIlllllllII[39], llIlllllllII[0], b.N), llIlllllllII[22], llIlllllllII[12], new RegionPoint(llIlllllllII[3], llIlllllllII[19], llIlllllllII[0], b.N), llIlllllllII[8], llIlllllllII[17], u.FIX_BRIDGE);
        FINAL_COFFIN = new t(new RegionPoint(llIlllllllII[30], llIlllllllII[33], llIlllllllII[0], b.N), llIlllllllII[5], llIlllllllII[4], new RegionPoint(llIlllllllII[30], llIlllllllII[27], llIlllllllII[0], b.N), llIlllllllII[5], llIlllllllII[6], u.HOLY_BARRIER);
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

    private static String lIIIIlllllIlllI(String var4, String var32) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var32.getBytes(StandardCharsets.UTF_8)), llIlllllllII[8]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(llIlllllllII[2], var23);
            return new String(var15.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    public static t valueOf(String string) {
        return Enum.valueOf(t.class, string);
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    private static void lIIIIlllllIllll() {
        llIllllllIlI = new String[llIlllllllII[50]];
        t.llIllllllIlI[t.llIlllllllII[0]] = t."contains";
        t.llIllllllIlI[t.llIlllllllII[1]] = t."loot: interact is null";
        t.llIllllllIlI[t.llIlllllllII[2]] = t."coffin is null";
        t.llIllllllIlI[t.llIlllllllII[3]] = t."aint got items for bridge chief :(";
        t.llIllllllIlI[t.llIlllllllII[4]] = t."aint got items for portal chief :(";
        t.llIllllllIlI[t.llIlllllllII[5]] = t."interact is null hmmge";
        t.llIllllllIlI[t.llIlllllllII[6]] = t."aint got items for brazier :(";
        t.llIllllllIlI[t.llIlllllllII[7]] = t."interact is null hmmge";
        t.llIllllllIlI[t.llIlllllllII[8]] = t."aint got items for grapple :(";
        t.llIllllllIlI[t.llIlllllllII[9]] = t."Pass-through";
        t.llIllllllIlI[t.llIlllllllII[10]] = t."Fix";
        t.llIllllllIlI[t.llIlllllllII[11]] = t."Sacrifice";
        t.llIllllllIlI[t.llIlllllllII[12]] = t."Conjure";
        t.llIllllllIlI[t.llIlllllllII[13]] = t."Walk-over";
        t.llIllllllIlI[t.llIlllllllII[14]] = t."Grapple";
        t.llIllllllIlI[t.llIlllllllII[15]] = t."leaving area";
        t.llIllllllIlI[t.llIlllllllII[16]] = t."Pass-through";
        t.llIllllllIlI[t.llIlllllllII[17]] = t."Fix";
        t.llIllllllIlI[t.llIlllllllII[18]] = t."Sacrifice";
        t.llIllllllIlI[t.llIlllllllII[19]] = t."Conjure";
        t.llIllllllIlI[t.llIlllllllII[20]] = t."Walk-over";
        t.llIllllllIlI[t.llIlllllllII[21]] = t."Grapple";
        t.llIllllllIlI[t.llIlllllllII[22]] = t."looting coffin";
        t.llIllllllIlI[t.llIlllllllII[23]] = t."Search-for-traps";
        t.llIllllllIlI[t.llIlllllllII[24]] = t."holy barrier";
        t.llIllllllIlI[t.llIlllllllII[25]] = t."Pass-through";
        t.llIllllllIlI[t.llIlllllllII[26]] = t."pillar";
        t.llIllllllIlI[t.llIlllllllII[27]] = t."Grapple";
        t.llIllllllIlI[t.llIlllllllII[28]] = t."saradomin brazier";
        t.llIllllllIlI[t.llIlllllllII[29]] = t."Sacrifice";
        t.llIllllllIlI[t.llIlllllllII[30]] = t."portal";
        t.llIllllllIlI[t.llIlllllllII[31]] = t."Conjure";
        t.llIllllllIlI[t.llIlllllllII[32]] = t."Pass-through";
        t.llIllllllIlI[t.llIlllllllII[33]] = t."bridge";
        t.llIllllllIlI[t.llIlllllllII[34]] = t."Fix";
        t.llIllllllIlI[t.llIlllllllII[35]] = t."Walk-over";
        t.llIllllllIlI[t.llIlllllllII[36]] = t."holy barrier";
        t.llIllllllIlI[t.llIlllllllII[37]] = t."Pass-through";
        t.llIllllllIlI[t.llIlllllllII[38]] = t."Coffin";
        t.llIllllllIlI[t.llIlllllllII[39]] = t."Search-for-traps";
        t.llIllllllIlI[t.llIlllllllII[40]] = t."COFFIN_IV_I_SOUTH";
        t.llIllllllIlI[t.llIlllllllII[43]] = t."COFFIN_IV_I_NORTH";
        t.llIllllllIlI[t.llIlllllllII[45]] = t."COFFIN_IV_II_";
        t.llIllllllIlI[t.llIlllllllII[46]] = t."COFFIN_V_I";
        t.llIllllllIlI[t.llIlllllllII[47]] = t."COFFIN_V_II";
        t.llIllllllIlI[t.llIlllllllII[48]] = t."COFFIN_V_III";
        t.llIllllllIlI[t.llIlllllllII[49]] = t."FINAL_COFFIN";
    }

    private t(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, int n5, int n6, u u2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.type = u2;
        this.lootArea = () -> new WorldArea(SquireSepulchre.a(regionPoint2), n5, n6);
    }

    private static String lIIIIlllllIllIl(String var9, String var30) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var7 = var30.toCharArray();
        int var27 = llIlllllllII[0];
        char[] var12 = var9.toCharArray();
        int var17 = var12.length;
        int var10 = llIlllllllII[0];
        while (t.lIIIIllllllIlll(var10, var17)) {
            char var28 = var12[var10];
            var1.append((char)(var28 ^ var7[var27 % var7.length]));
            0;
            ++var27;
            ++var10;
            0;
            if ((0x6F ^ 0x6B) > 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean lIIIIllllllIllI(int n2) {
        return n2 != 0;
    }
}

