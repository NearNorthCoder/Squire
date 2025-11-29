package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

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
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.t  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/t.class */
public final class EnumC0019t {
    private static /* synthetic */ int[] llIlllllllII;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    public static final /* synthetic */ EnumC0019t COFFIN_V_III;
    public static final /* synthetic */ EnumC0019t COFFIN_V_I;
    /* synthetic */ Supplier<WorldPoint> destination;
    private static /* synthetic */ String[] llIllllllIlI;
    private static final /* synthetic */ EnumC0019t[] $VALUES;
    /* synthetic */ EnumC0020u type;
    public static final /* synthetic */ EnumC0019t COFFIN_IV_I_NORTH;
    public static final /* synthetic */ EnumC0019t FINAL_COFFIN;
    public static final /* synthetic */ EnumC0019t COFFIN_IV_II_;
    public static final /* synthetic */ EnumC0019t COFFIN_V_II;
    /* synthetic */ Supplier<WorldArea> lootArea;
    public static final /* synthetic */ EnumC0019t COFFIN_IV_I_SOUTH;

    private EnumC0019t(String str, int i, List list, RegionPoint regionPoint, int i2, int i3, EnumC0020u enumC0020u) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (lIIIIllllllIllI(it.hasNext() ? 1 : 0)) {
                Triple triple = (Triple) it.next();
                arrayList.add(new WorldArea(SquireSepulchre.a((RegionPoint) triple.getFirst()), ((Integer) triple.getSecond()).intValue(), ((Integer) triple.getThird()).intValue()));
                "".length();
                "".length();
                if ((-"   ".length()) >= 0) {
                    return null;
                }
            }
            return arrayList;
        };
        this.type = enumC0020u;
        this.lootArea = () -> {
            return new WorldArea(SquireSepulchre.a(regionPoint), i2, i3);
        };
    }

    private static boolean lIIIIllllllIIlI(int i) {
        return i == 0;
    }

    private static String lIIIIlllllIIIlI(String lllllllllllllllIIlllIlIIIIlIlIII, String lllllllllllllllIIlllIlIIIIlIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIlIIIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIlIIIIlIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIlIIIIlIlIlI.init(llIlllllllII[2], secretKeySpec);
            return new String(lllllllllllllllIIlllIlIIIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIlIIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIlIIIIlIlIIl) {
            lllllllllllllllIIlllIlIIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIllllllIlll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v116, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v119, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v124, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v133, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v143, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v145, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v161, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v96, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public boolean a(C0003d c0003d, SquireSepulchre squireSepulchre) {
        Player local = Players.getLocal();
        if (!lIIIIllllllIIIl(local) && !lIIIIllllllIIlI(a((Locatable) local) ? 1 : 0)) {
            System.out.println(llIllllllIlI[llIlllllllII[0]]);
            TileObject tileObject = null;
            int lllllllllllllllIIlllIlIIIlIlIIIl = squireSepulchre.c();
            System.out.println("Time: " + lllllllllllllllIIlllIlIIIlIlIIIl);
            TileObject tileObject2 = null;
            if (lIIIIllllllIIll(lllllllllllllllIIlllIlIIIlIlIIIl, llIlllllllII[1])) {
                tileObject2 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIIIllllllIllI(tileObject3.getName().equals(llIllllllIlI[llIlllllllII[38]]) ? 1 : 0)) {
                        String[] strArr = new String[llIlllllllII[1]];
                        strArr[llIlllllllII[0]] = llIllllllIlI[llIlllllllII[39]];
                        if (lIIIIllllllIllI(tileObject3.hasAction(strArr) ? 1 : 0) && lIIIIllllllIllI(d(tileObject3) ? 1 : 0)) {
                            ?? r0 = llIlllllllII[1];
                            "".length();
                            return (-(133 ^ 129)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return llIlllllllII[0];
                });
            }
            if (lIIIIllllllIlII(this.type, EnumC0020u.HOLY_BARRIER)) {
                tileObject = TileObjects.getNearest(tileObject4 -> {
                    if (lIIIIllllllIllI(tileObject4.getName().toLowerCase().equals(llIllllllIlI[llIlllllllII[36]]) ? 1 : 0)) {
                        String[] strArr = new String[llIlllllllII[1]];
                        strArr[llIlllllllII[0]] = llIllllllIlI[llIlllllllII[37]];
                        if (lIIIIllllllIllI(tileObject4.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = llIlllllllII[1];
                            "".length();
                            return "   ".length() < " ".length() ? ((28 ^ 7) ^ (18 ^ 21)) & (((80 ^ 3) ^ (240 ^ 191)) ^ (-" ".length())) : r0;
                        }
                    }
                    return llIlllllllII[0];
                });
                "".length();
                if ("   ".length() < (-" ".length())) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (lIIIIllllllIlII(this.type, EnumC0020u.FIX_BRIDGE)) {
                tileObject = TileObjects.getNearest(tileObject5 -> {
                    if (lIIIIllllllIllI(tileObject5.getName().toLowerCase().contains(llIllllllIlI[llIlllllllII[33]]) ? 1 : 0)) {
                        String[] strArr = new String[llIlllllllII[2]];
                        strArr[llIlllllllII[0]] = llIllllllIlI[llIlllllllII[34]];
                        strArr[llIlllllllII[1]] = llIllllllIlI[llIlllllllII[35]];
                        if (lIIIIllllllIllI(tileObject5.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = llIlllllllII[1];
                            "".length();
                            return ((103 ^ 126) & ((51 ^ 42) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return llIlllllllII[0];
                });
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (lIIIIllllllIlII(this.type, EnumC0020u.CAST_PORTAL)) {
                tileObject = TileObjects.getNearest(tileObject6 -> {
                    if (lIIIIllllllIllI(tileObject6.getName().toLowerCase().contains(llIllllllIlI[llIlllllllII[30]]) ? 1 : 0)) {
                        String[] strArr = new String[llIlllllllII[2]];
                        strArr[llIlllllllII[0]] = llIllllllIlI[llIlllllllII[31]];
                        strArr[llIlllllllII[1]] = llIllllllIlI[llIlllllllII[32]];
                        if (lIIIIllllllIllI(tileObject6.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = llIlllllllII[1];
                            "".length();
                            return ((134 ^ 143) & ((137 ^ 128) ^ (-1))) == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return llIlllllllII[0];
                });
                "".length();
                if ((-" ".length()) > (121 ^ 125)) {
                    return "   ".length() & ("   ".length() ^ (-1));
                }
            } else if (lIIIIllllllIlII(this.type, EnumC0020u.BRAZIER)) {
                tileObject = TileObjects.getNearest(tileObject7 -> {
                    if (lIIIIllllllIllI(tileObject7.getName().toLowerCase().contains(llIllllllIlI[llIlllllllII[28]]) ? 1 : 0)) {
                        String[] strArr = new String[llIlllllllII[1]];
                        strArr[llIlllllllII[0]] = llIllllllIlI[llIlllllllII[29]];
                        if (lIIIIllllllIllI(tileObject7.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = llIlllllllII[1];
                            "".length();
                            return (-" ".length()) >= ((((13 + 46) - (-51)) + 18) ^ (((41 + 4) - (-45)) + 42)) ? ((81 ^ 37) ^ (82 ^ 102)) & (((232 ^ 157) ^ (0 ^ 53)) ^ (-" ".length())) : r0;
                        }
                    }
                    return llIlllllllII[0];
                });
                "".length();
                if ((-((52 ^ 97) ^ (36 ^ 117))) > 0) {
                    return ((53 ^ 33) ^ (6 ^ 47)) & (((69 ^ 29) ^ (103 ^ 2)) ^ (-" ".length()));
                }
            } else if (lIIIIllllllIlII(this.type, EnumC0020u.GRAPPLE)) {
                tileObject = TileObjects.getNearest(tileObject8 -> {
                    if (lIIIIllllllIllI(tileObject8.getName().toLowerCase().contains(llIllllllIlI[llIlllllllII[26]]) ? 1 : 0)) {
                        String[] strArr = new String[llIlllllllII[1]];
                        strArr[llIlllllllII[0]] = llIllllllIlI[llIlllllllII[27]];
                        if (lIIIIllllllIllI(tileObject8.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = llIlllllllII[1];
                            "".length();
                            return "   ".length() < (-" ".length()) ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
                        }
                    }
                    return llIlllllllII[0];
                });
            }
            if (lIIIIllllllIIIl(tileObject)) {
                System.out.println(llIllllllIlI[llIlllllllII[1]]);
                if (lIIIIllllllIlIl(this.type, EnumC0020u.BRAZIER)) {
                    return llIlllllllII[0];
                }
                tileObject = TileObjects.getNearest(tileObject9 -> {
                    if (lIIIIllllllIllI(tileObject9.getName().toLowerCase().equals(llIllllllIlI[llIlllllllII[24]]) ? 1 : 0)) {
                        String[] strArr = new String[llIlllllllII[1]];
                        strArr[llIlllllllII[0]] = llIllllllIlI[llIlllllllII[25]];
                        if (lIIIIllllllIllI(tileObject9.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = llIlllllllII[1];
                            "".length();
                            return ("  ".length() & ("  ".length() ^ (-1))) >= "  ".length() ? (false ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return llIlllllllII[0];
                });
                if (lIIIIllllllIIIl(tileObject)) {
                    return llIlllllllII[0];
                }
            }
            if (!lIIIIllllllIIlI(d(local) ? 1 : 0)) {
                if (!lIIIIllllllIIIl(tileObject2)) {
                    System.out.println(llIllllllIlI[llIlllllllII[22]]);
                    tileObject2.interact(llIllllllIlI[llIlllllllII[23]]);
                    return llIlllllllII[1];
                }
                System.out.println(llIllllllIlI[llIlllllllII[15]]);
                String[] strArr = new String[llIlllllllII[6]];
                strArr[llIlllllllII[0]] = llIllllllIlI[llIlllllllII[16]];
                strArr[llIlllllllII[1]] = llIllllllIlI[llIlllllllII[17]];
                strArr[llIlllllllII[2]] = llIllllllIlI[llIlllllllII[18]];
                strArr[llIlllllllII[3]] = llIllllllIlI[llIlllllllII[19]];
                strArr[llIlllllllII[4]] = llIllllllIlI[llIlllllllII[20]];
                strArr[llIlllllllII[5]] = llIllllllIlI[llIlllllllII[21]];
                tileObject.interact(strArr);
                return llIlllllllII[1];
            } else if (lIIIIllllllIIIl(tileObject2)) {
                System.out.println(llIllllllIlI[llIlllllllII[2]]);
                return llIlllllllII[0];
            } else {
                if (lIIIIllllllIlII(this.type, EnumC0020u.FIX_BRIDGE)) {
                    if (!lIIIIllllllIllI(C0000a.k() ? 1 : 0) || !lIIIIllllllIllI(C0000a.m() ? 1 : 0) || !lIIIIllllllIllI(C0000a.n() ? 1 : 0) || lIIIIllllllIIlI(C0000a.l() ? 1 : 0)) {
                        System.out.println(llIllllllIlI[llIlllllllII[3]]);
                        return llIlllllllII[0];
                    }
                } else if (lIIIIllllllIlII(this.type, EnumC0020u.CAST_PORTAL)) {
                    if (lIIIIllllllIIlI(C0000a.a(squireSepulchre.a()) ? 1 : 0)) {
                        System.out.println(llIllllllIlI[llIlllllllII[4]]);
                        return llIlllllllII[0];
                    }
                } else if (lIIIIllllllIlII(this.type, EnumC0020u.BRAZIER)) {
                    if (lIIIIllllllIIIl(tileObject)) {
                        System.out.println(llIllllllIlI[llIlllllllII[5]]);
                        return llIlllllllII[0];
                    } else if (lIIIIllllllIIlI(C0000a.o() ? 1 : 0)) {
                        System.out.println(llIllllllIlI[llIlllllllII[6]]);
                        return llIlllllllII[0];
                    }
                } else if (lIIIIllllllIlII(this.type, EnumC0020u.GRAPPLE)) {
                    if (lIIIIllllllIIIl(tileObject)) {
                        System.out.println(llIllllllIlI[llIlllllllII[7]]);
                        return llIlllllllII[0];
                    } else if (lIIIIllllllIIlI(C0000a.p() ? 1 : 0)) {
                        System.out.println(llIllllllIlI[llIlllllllII[8]]);
                        return llIlllllllII[0];
                    }
                }
                String[] strArr2 = new String[llIlllllllII[6]];
                strArr2[llIlllllllII[0]] = llIllllllIlI[llIlllllllII[9]];
                strArr2[llIlllllllII[1]] = llIllllllIlI[llIlllllllII[10]];
                strArr2[llIlllllllII[2]] = llIllllllIlI[llIlllllllII[11]];
                strArr2[llIlllllllII[3]] = llIllllllIlI[llIlllllllII[12]];
                strArr2[llIlllllllII[4]] = llIllllllIlI[llIlllllllII[13]];
                strArr2[llIlllllllII[5]] = llIllllllIlI[llIlllllllII[14]];
                tileObject.interact(strArr2);
                return llIlllllllII[1];
            }
        }
        return llIlllllllII[0];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + name());
    }

    private static void lIIIIllllllIIII() {
        llIlllllllII = new int[51];
        llIlllllllII[0] = ((14 ^ 78) ^ (152 ^ 195)) & (((239 ^ 199) ^ (27 ^ 40)) ^ (-" ".length()));
        llIlllllllII[1] = " ".length();
        llIlllllllII[2] = "  ".length();
        llIlllllllII[3] = "   ".length();
        llIlllllllII[4] = 148 ^ 144;
        llIlllllllII[5] = (26 ^ 122) ^ (70 ^ 35);
        llIlllllllII[6] = 145 ^ 151;
        llIlllllllII[7] = (108 ^ 123) ^ (129 ^ 145);
        llIlllllllII[8] = (((71 + 115) - 132) + 73) ^ (94 ^ 41);
        llIlllllllII[9] = 117 ^ 124;
        llIlllllllII[10] = (((5 + 32) - (-104)) + 10) ^ (((136 + 126) - 171) + 66);
        llIlllllllII[11] = (193 ^ 153) ^ (255 ^ 172);
        llIlllllllII[12] = 143 ^ 131;
        llIlllllllII[13] = (31 ^ 55) ^ (89 ^ 124);
        llIlllllllII[14] = (((109 + 103) - 134) + 66) ^ (((35 + 95) - (-26)) + 2);
        llIlllllllII[15] = 171 ^ 164;
        llIlllllllII[16] = 209 ^ 193;
        llIlllllllII[17] = (((11 + 132) - 29) + 36) ^ (((24 + 50) - 31) + 92);
        llIlllllllII[18] = (67 ^ 57) ^ (109 ^ 5);
        llIlllllllII[19] = 34 ^ 49;
        llIlllllllII[20] = 33 ^ 53;
        llIlllllllII[21] = 2 ^ 23;
        llIlllllllII[22] = (((24 + 78) - (-29)) + 82) ^ (((122 + 183) - 190) + 80);
        llIlllllllII[23] = 144 ^ 135;
        llIlllllllII[24] = 168 ^ 176;
        llIlllllllII[25] = 154 ^ 131;
        llIlllllllII[26] = 71 ^ 93;
        llIlllllllII[27] = 108 ^ 119;
        llIlllllllII[28] = (128 ^ 138) ^ (161 ^ 183);
        llIlllllllII[29] = (((174 + 109) - 192) + 127) ^ (((157 + 101) - 120) + 61);
        llIlllllllII[30] = 217 ^ 199;
        llIlllllllII[31] = (186 ^ 142) ^ (232 ^ 195);
        llIlllllllII[32] = (((44 + 27) - 24) + 88) ^ (((152 + 132) - 263) + 146);
        llIlllllllII[33] = (198 ^ 173) ^ (41 ^ 99);
        llIlllllllII[34] = (((84 + 115) - 106) + 54) ^ (((15 + 33) - 3) + 132);
        llIlllllllII[35] = 97 ^ 66;
        llIlllllllII[36] = 108 ^ 72;
        llIlllllllII[37] = (((32 + 12) - 28) + 148) ^ (((80 + 125) - 117) + 41);
        llIlllllllII[38] = 65 ^ 103;
        llIlllllllII[39] = 143 ^ 168;
        llIlllllllII[40] = (((0 + 70) - (-38)) + 39) ^ (((135 + 163) - 288) + 177);
        llIlllllllII[41] = 18 ^ 42;
        llIlllllllII[42] = (125 ^ 41) ^ (45 ^ 76);
        llIlllllllII[43] = 166 ^ 143;
        llIlllllllII[44] = (((45 + 144) - 55) + 17) ^ (((154 + 18) - 55) + 50);
        llIlllllllII[45] = (106 ^ 83) ^ (42 ^ 57);
        llIlllllllII[46] = (90 ^ 9) ^ (200 ^ 176);
        llIlllllllII[47] = 37 ^ 9;
        llIlllllllII[48] = (79 ^ 25) ^ (51 ^ 72);
        llIlllllllII[49] = 99 ^ 77;
        llIlllllllII[50] = (((166 + 107) - 236) + 131) ^ (((90 + 29) - 91) + 107);
    }

    private static boolean lIIIIllllllIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private EnumC0019t(String str, int i, RegionPoint regionPoint, int i2, int i3, RegionPoint regionPoint2, int i4, int i5, BooleanSupplier booleanSupplier, EnumC0020u enumC0020u) {
        this.startAreas = () -> {
            return List.of(new WorldArea(SquireSepulchre.a(regionPoint), i2, i3));
        };
        this.type = enumC0020u;
        this.lootArea = () -> {
            return new WorldArea(SquireSepulchre.a(regionPoint2), i4, i5);
        };
    }

    public static EnumC0019t[] values() {
        return (EnumC0019t[]) $VALUES.clone();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    public boolean a(Locatable locatable) {
        if (lIIIIllllllIllI(this.lootArea.get().contains(locatable) ? 1 : 0)) {
            return llIlllllllII[1];
        }
        for (WorldArea worldArea : this.startAreas.get()) {
            if (lIIIIllllllIllI(worldArea.contains(locatable) ? 1 : 0)) {
                return llIlllllllII[1];
            }
            "".length();
            if ((120 ^ 124) <= "  ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIlllllllII[0];
    }

    private static boolean lIIIIllllllIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    public boolean d(Locatable locatable) {
        return this.lootArea.get().contains(locatable);
    }

    private static boolean lIIIIllllllIIIl(Object obj) {
        return obj == null;
    }

    static {
        lIIIIllllllIIII();
        lIIIIlllllIllll();
        COFFIN_IV_I_SOUTH = new EnumC0019t(llIllllllIlI[llIlllllllII[40]], llIlllllllII[0], new RegionPoint(llIlllllllII[41], llIlllllllII[13], llIlllllllII[2], C0001b.L), llIlllllllII[3], llIlllllllII[8], new RegionPoint(llIlllllllII[42], llIlllllllII[25], llIlllllllII[2], C0001b.L), llIlllllllII[9], llIlllllllII[4], EnumC0020u.FIX_BRIDGE);
        COFFIN_IV_I_NORTH = new EnumC0019t(llIllllllIlI[llIlllllllII[43]], llIlllllllII[1], new RegionPoint(llIlllllllII[44], llIlllllllII[35], llIlllllllII[2], C0001b.L), llIlllllllII[9], llIlllllllII[10], new RegionPoint(llIlllllllII[42], llIlllllllII[28], llIlllllllII[2], C0001b.L), llIlllllllII[9], llIlllllllII[4], EnumC0020u.CAST_PORTAL);
        COFFIN_IV_II_ = new EnumC0019t(llIllllllIlI[llIlllllllII[45]], llIlllllllII[2], List.of(new Triple(new RegionPoint(llIlllllllII[31], llIlllllllII[5], llIlllllllII[1], C0001b.L), Integer.valueOf(llIlllllllII[3]), Integer.valueOf(llIlllllllII[16])), new Triple(new RegionPoint(llIlllllllII[34], llIlllllllII[17], llIlllllllII[1], C0001b.L), Integer.valueOf(llIlllllllII[8]), Integer.valueOf(llIlllllllII[3]))), new RegionPoint(llIlllllllII[45], llIlllllllII[15], llIlllllllII[1], C0001b.L), llIlllllllII[9], llIlllllllII[7], EnumC0020u.BRAZIER);
        COFFIN_V_I = new EnumC0019t(llIllllllIlI[llIlllllllII[46]], llIlllllllII[3], new RegionPoint(llIlllllllII[6], llIlllllllII[2], llIlllllllII[1], C0001b.N), llIlllllllII[10], llIlllllllII[11], new RegionPoint(llIlllllllII[21], llIlllllllII[7], llIlllllllII[1], C0001b.N), llIlllllllII[9], llIlllllllII[9], EnumC0020u.CAST_PORTAL);
        COFFIN_V_II = new EnumC0019t(llIllllllIlI[llIlllllllII[47]], llIlllllllII[4], new RegionPoint(llIlllllllII[42], llIlllllllII[8], llIlllllllII[1], C0001b.N), llIlllllllII[14], llIlllllllII[8], new RegionPoint(llIlllllllII[38], llIlllllllII[7], llIlllllllII[1], C0001b.N), llIlllllllII[7], llIlllllllII[7], EnumC0020u.GRAPPLE);
        COFFIN_V_III = new EnumC0019t(llIllllllIlI[llIlllllllII[48]], llIlllllllII[5], new RegionPoint(llIlllllllII[3], llIlllllllII[39], llIlllllllII[0], C0001b.N), llIlllllllII[22], llIlllllllII[12], new RegionPoint(llIlllllllII[3], llIlllllllII[19], llIlllllllII[0], C0001b.N), llIlllllllII[8], llIlllllllII[17], EnumC0020u.FIX_BRIDGE);
        FINAL_COFFIN = new EnumC0019t(llIllllllIlI[llIlllllllII[49]], llIlllllllII[6], new RegionPoint(llIlllllllII[30], llIlllllllII[33], llIlllllllII[0], C0001b.N), llIlllllllII[5], llIlllllllII[4], new RegionPoint(llIlllllllII[30], llIlllllllII[27], llIlllllllII[0], C0001b.N), llIlllllllII[5], llIlllllllII[6], EnumC0020u.HOLY_BARRIER);
        EnumC0019t[] enumC0019tArr = new EnumC0019t[llIlllllllII[7]];
        enumC0019tArr[llIlllllllII[0]] = COFFIN_IV_I_SOUTH;
        enumC0019tArr[llIlllllllII[1]] = COFFIN_IV_I_NORTH;
        enumC0019tArr[llIlllllllII[2]] = COFFIN_IV_II_;
        enumC0019tArr[llIlllllllII[3]] = COFFIN_V_I;
        enumC0019tArr[llIlllllllII[4]] = COFFIN_V_II;
        enumC0019tArr[llIlllllllII[5]] = COFFIN_V_III;
        enumC0019tArr[llIlllllllII[6]] = FINAL_COFFIN;
        $VALUES = enumC0019tArr;
    }

    private static boolean lIIIIllllllIIll(int i, int i2) {
        return i > i2;
    }

    private static String lIIIIlllllIlllI(String lllllllllllllllIIlllIlIIIIIIIIll, String lllllllllllllllIIlllIlIIIIIIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIlIIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), llIlllllllII[8]), "DES");
            Cipher lllllllllllllllIIlllIlIIIIIIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIlllIlIIIIIIIlIl.init(llIlllllllII[2], secretKeySpec);
            return new String(lllllllllllllllIIlllIlIIIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIlIIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIlIIIIIIIlII) {
            lllllllllllllllIIlllIlIIIIIIIlII.printStackTrace();
            return null;
        }
    }

    public static EnumC0019t valueOf(String str) {
        return (EnumC0019t) Enum.valueOf(EnumC0019t.class, str);
    }

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    private static void lIIIIlllllIllll() {
        llIllllllIlI = new String[llIlllllllII[50]];
        llIllllllIlI[llIlllllllII[0]] = lIIIIlllllIIIlI("mm/WyYyAsY3kolDdziiFiA==", "LDnPN");
        llIllllllIlI[llIlllllllII[1]] = lIIIIlllllIIIlI("L2yQsCQorE7KwMwRSq86yr0brVhgVMM/", "AfWPm");
        llIllllllIlI[llIlllllllII[2]] = lIIIIlllllIllIl("ESwgFCwcYy8BZRw2Kh4=", "rCFrE");
        llIllllllIlI[llIlllllllII[3]] = lIIIIlllllIlllI("rG85ByVdwSFK7fXMnHyrKYrAHsX+Aeak5P3FJcEP+IiGwrvJEod0kA==", "RMBGd");
        llIllllllIlI[llIlllllllII[4]] = lIIIIlllllIllIl("JgAYE2wgBgJHJTMMGxRsIQYERzwoGwIGIGcKHg4pIUlMTw==", "GivgL");
        llIllllllIlI[llIlllllllII[5]] = lIIIIlllllIIIlI("mWrxK2f9/OjAas2FDZdB/7FwjL1LyHop", "AYxuE");
        llIllllllIlI[llIlllllllII[6]] = lIIIIlllllIlllI("gmGUOboI2ii9kWGk2U0r09luNCmJCNow6EtFme44HWE=", "pDrCw");
        llIllllllIlI[llIlllllllII[7]] = lIIIIlllllIllIl("IgEyFRwqDDJQBzhPKAUCJ08uHQMsCg==", "KoFpn");
        llIllllllIlI[llIlllllllII[8]] = lIIIIlllllIlllI("BVdIhBcNN+H0d+AJnIZANDZWi2qcpDerjMIE2cR+iP4=", "JHAeu");
        llIllllllIlI[llIlllllllII[9]] = lIIIIlllllIllIl("BTcBP0YhPgAjHjI+", "UVrLk");
        llIllllllIlI[llIlllllllII[10]] = lIIIIlllllIllIl("ISot", "gCUXQ");
        llIllllllIlI[llIlllllllII[11]] = lIIIIlllllIlllI("BeR8WeHND3NsUUjAsMaaMg==", "AwCBf");
        llIllllllIlI[llIlllllllII[12]] = lIIIIlllllIIIlI("g88u/fYfPeA=", "FvySq");
        llIllllllIlI[llIlllllllII[13]] = lIIIIlllllIllIl("ECU8AU8oMjUY", "GDPjb");
        llIllllllIlI[llIlllllllII[14]] = lIIIIlllllIIIlI("EXYYZtfSFdQ=", "cuaPD");
        llIllllllIlI[llIlllllllII[15]] = lIIIIlllllIllIl("ND0oHB82P2kLBD05", "XXIjv");
        llIllllllIlI[llIlllllllII[16]] = lIIIIlllllIlllI("P2Er0yapQSQh2K/gU6l0MQ==", "fVwEK");
        llIllllllIlI[llIlllllllII[17]] = lIIIIlllllIllIl("PDsa", "zRbnm");
        llIllllllIlI[llIlllllllII[18]] = lIIIIlllllIllIl("PzQhEQ8KPCEG", "lUBcf");
        llIllllllIlI[llIlllllllII[19]] = lIIIIlllllIlllI("hdvaoiaIgGw=", "hrZdg");
        llIllllllIlI[llIlllllllII[20]] = lIIIIlllllIllIl("GA8kI1sgGC06", "OnHHv");
        llIllllllIlI[llIlllllllII[21]] = lIIIIlllllIllIl("NBMrOQEfBA==", "saJIq");
        llIllllllIlI[llIlllllllII[22]] = lIIIIlllllIlllI("EguX3jsOtIZJgemnPAc47Q==", "HHDXK");
        llIllllllIlI[llIlllllllII[23]] = lIIIIlllllIllIl("Ai4sJhU5Zis7BHw/PzUGIg==", "QKMTv");
        llIllllllIlI[llIlllllllII[24]] = lIIIIlllllIlllI("QJQMEEDmT+NVweBjknJyqA==", "DMAMI");
        llIllllllIlI[llIlllllllII[25]] = lIIIIlllllIIIlI("EJ6WZE1R+PAV0kJpEWlbgA==", "ZjqIT");
        llIllllllIlI[llIlllllllII[26]] = lIIIIlllllIllIl("AwIfHwwB", "skssm");
        llIllllllIlI[llIlllllllII[27]] = lIIIIlllllIIIlI("jxr8bsjmRuE=", "BkJWb");
        llIllllllIlI[llIlllllllII[28]] = lIIIIlllllIllIl("HjE7KwgCPSAkTA8iKDAFCCI=", "mPIJl");
        llIllllllIlI[llIlllllllII[29]] = lIIIIlllllIllIl("FAgxOjEhADEt", "GiRHX");
        llIllllllIlI[llIlllllllII[30]] = lIIIIlllllIIIlI("GaJOnyk7Lcs=", "dSJMj");
        llIllllllIlI[llIlllllllII[31]] = lIIIIlllllIlllI("4SaSqnY0Apk=", "tBDff");
        llIllllllIlI[llIlllllllII[32]] = lIIIIlllllIlllI("hswJ49C+9o0rbtkogNlfVw==", "DgCTh");
        llIllllllIlI[llIlllllllII[33]] = lIIIIlllllIllIl("LhgYBwop", "Ljqcm");
        llIllllllIlI[llIlllllllII[34]] = lIIIIlllllIlllI("HwIkMFWYZjk=", "bpbvv");
        llIllllllIlI[llIlllllllII[35]] = lIIIIlllllIllIl("FA8rAEIsGCIZ", "CnGko");
        llIllllllIlI[llIlllllllII[36]] = lIIIIlllllIIIlI("rSx2Pk8O+9nePJLLhpHgaw==", "mbFRV");
        llIllllllIlI[llIlllllllII[37]] = lIIIIlllllIllIl("BAY9PWIgDzwhOjMP", "TgNNO");
        llIllllllIlI[llIlllllllII[38]] = lIIIIlllllIllIl("LiUkIx0D", "mJBEt");
        llIllllllIlI[llIlllllllII[39]] = lIIIIlllllIIIlI("fW9Uht7dHUBlo6JZeQs3oUm4zP2B+U0b", "KuIXp");
        llIllllllIlI[llIlllllllII[40]] = lIIIIlllllIllIl("DSEqCyEAMSUbNwcxPwI9GiY=", "NnlMh");
        llIllllllIlI[llIlllllllII[43]] = lIIIIlllllIllIl("Ox8rDSo2DyQdPDEPIwQxLBg=", "xPmKc");
        llIllllllIlI[llIlllllllII[45]] = lIIIIlllllIIIlI("LVnal8cOiVKCIWUwN6aYsQ==", "wIein");
        llIllllllIlI[llIlllllllII[46]] = lIIIIlllllIlllI("8286GLr0wZbIKYSFXSV9Jw==", "AjUMY");
        llIllllllIlI[llIlllllllII[47]] = lIIIIlllllIIIlI("7CTcwLcb18EmsWaicSDVQQ==", "ulUAK");
        llIllllllIlI[llIlllllllII[48]] = lIIIIlllllIIIlI("YdX+JWBAGhWrx0z8kxtEeQ==", "HYgmP");
        llIllllllIlI[llIlllllllII[49]] = lIIIIlllllIlllI("hY3uFaR9aK45oCeAu3ryhw==", "IJVMd");
    }

    private EnumC0019t(String str, int i, RegionPoint regionPoint, int i2, int i3, RegionPoint regionPoint2, int i4, int i5, EnumC0020u enumC0020u) {
        this.startAreas = () -> {
            return List.of(new WorldArea(SquireSepulchre.a(regionPoint), i2, i3));
        };
        this.type = enumC0020u;
        this.lootArea = () -> {
            return new WorldArea(SquireSepulchre.a(regionPoint2), i4, i5);
        };
    }

    private static String lIIIIlllllIllIl(String lllllllllllllllIIlllIlIIIIIllIII, String lllllllllllllllIIlllIlIIIIIlIlll) {
        String lllllllllllllllIIlllIlIIIIIllIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIlIIIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIlIIIIIlIllI = new StringBuilder();
        char[] lllllllllllllllIIlllIlIIIIIlIlIl = lllllllllllllllIIlllIlIIIIIlIlll.toCharArray();
        int lllllllllllllllIIlllIlIIIIIlIlII = llIlllllllII[0];
        char[] charArray = lllllllllllllllIIlllIlIIIIIllIII2.toCharArray();
        int length = charArray.length;
        int i = llIlllllllII[0];
        while (lIIIIllllllIlll(i, length)) {
            char lllllllllllllllIIlllIlIIIIIllIIl = charArray[i];
            lllllllllllllllIIlllIlIIIIIlIllI.append((char) (lllllllllllllllIIlllIlIIIIIllIIl ^ lllllllllllllllIIlllIlIIIIIlIlIl[lllllllllllllllIIlllIlIIIIIlIlII % lllllllllllllllIIlllIlIIIIIlIlIl.length]));
            "".length();
            lllllllllllllllIIlllIlIIIIIlIlII++;
            i++;
            "".length();
            if ((111 ^ 107) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlllIlIIIIIlIllI);
    }

    private static boolean lIIIIllllllIllI(int i) {
        return i != 0;
    }
}
