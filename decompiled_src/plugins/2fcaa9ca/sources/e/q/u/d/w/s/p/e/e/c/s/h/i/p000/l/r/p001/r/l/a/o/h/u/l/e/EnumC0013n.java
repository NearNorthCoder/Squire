package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Triple;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.n  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/n.class */
public final class EnumC0013n {
    /* synthetic */ Supplier<WorldPoint> dartDestination;
    private static final /* synthetic */ EnumC0013n[] $VALUES;
    public static final /* synthetic */ EnumC0013n BOTTOM_V_II;
    private /* synthetic */ boolean north = lllIIIIllIIl[0];
    private static /* synthetic */ int[] lllIIIIllIIl;
    /* synthetic */ Supplier<WorldArea> dartArea;
    /* synthetic */ EnumC0015p type;
    /* synthetic */ Supplier<List<WorldArea>> startAreas;
    private static /* synthetic */ String[] lllIIIIllIII;
    public /* synthetic */ Supplier<TileObject> object;
    /* synthetic */ EnumC0014o entry;
    /* synthetic */ Supplier<WorldPoint> startPoint;
    /* synthetic */ Supplier<WorldPoint> startDestination;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v116, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v127, types: [boolean] */
    private List<WorldPoint> a(List<WorldPoint> list, C0003d c0003d) {
        Player local = Players.getLocal();
        if (lIIIlIIIlIIlIll(local)) {
            return null;
        }
        List<WorldPoint> aC = I.aC();
        ArrayList arrayList = new ArrayList();
        int i = lllIIIIllIIl[1];
        while (lIIIlIIIlIlIIIl(i, list.size())) {
            WorldPoint worldPoint = list.get(i);
            if (lIIIlIIIlIIlIll(worldPoint)) {
                "".length();
                if ((((135 ^ 155) ^ (231 ^ 190)) & (((88 ^ 79) ^ (2 ^ 80)) ^ (-" ".length()))) != 0) {
                    return null;
                }
            } else if (lIIIlIIIlIIllII(aC.contains(worldPoint) ? 1 : 0) && lIIIlIIIlIIllll(EnumC0015p.FINAL, this.type)) {
                arrayList.add(worldPoint.dx(lllIIIIllIIl[0]));
                "".length();
                "".length();
                if ("  ".length() > "  ".length()) {
                    return null;
                }
            } else {
                arrayList.add(worldPoint);
                "".length();
            }
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        WorldPoint worldPoint2 = this.startPoint.get();
        int lllllllllllllllIIlllIIIlIllllllI = worldPoint2.getWorldY() - lllIIIIllIIl[0];
        int lllllllllllllllIIlllIIIlIlllllIl = worldPoint2.getWorldY() + lllIIIIllIIl[5];
        TileObject nearest = TileObjects.getNearest(new WorldPoint(local.getWorldX() - lllIIIIllIIl[0], lllllllllllllllIIlllIIIlIllllllI, worldPoint2.getPlane()), tileObject -> {
            if (lIIIlIIIlIIllII(tileObject.getName().equals(lllIIIIllIII[lllIIIIllIIl[14]]) ? 1 : 0) && lIIIlIIIlIlIIIl(tileObject.getWorldX(), local.getWorldX())) {
                ?? r0 = lllIIIIllIIl[0];
                "".length();
                return 0 != 0 ? "  ".length() & ("  ".length() ^ (-1)) & (((19 ^ 2) & ((6 ^ 23) ^ (-1))) ^ (-1)) : r0;
            }
            return lllIIIIllIIl[1];
        });
        TileObject nearest2 = TileObjects.getNearest(new WorldPoint(local.getWorldX() - lllIIIIllIIl[0], lllllllllllllllIIlllIIIlIlllllIl, worldPoint2.getPlane()), tileObject2 -> {
            if (lIIIlIIIlIIllII(tileObject2.getName().equals(lllIIIIllIII[lllIIIIllIIl[13]]) ? 1 : 0) && lIIIlIIIlIlIIIl(tileObject2.getWorldX(), local.getWorldX())) {
                ?? r0 = lllIIIIllIIl[0];
                "".length();
                return (-" ".length()) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIIIIllIIl[1];
        });
        if (!lIIIlIIIlIIlIll(nearest) && !lIIIlIIIlIIlIll(nearest2)) {
            J b = c0003d.b(nearest);
            J b2 = c0003d.b(nearest2);
            if (!lIIIlIIIlIIlIll(b) && !lIIIlIIIlIIlIll(b2)) {
                ArrayList arrayList2 = new ArrayList();
                int i2 = lllIIIIllIIl[1];
                while (lIIIlIIIlIlIIIl(i2, arrayList.size())) {
                    WorldPoint worldPoint3 = (WorldPoint) arrayList.get(i2);
                    int x = this.dartArea.get().getX();
                    if (lIIIlIIIlIIlIll(worldPoint3)) {
                        "".length();
                        if (0 != 0) {
                            return null;
                        }
                    } else {
                        if (lIIIlIIIlIlIlII(x + lllIIIIllIIl[6], local.getWorldX())) {
                            if (lIIIlIIIlIIllII(this.north ? 1 : 0)) {
                                if (lIIIlIIIlIlIIII(x + lllIIIIllIIl[7], local.getWorldX())) {
                                    if (lIIIlIIIlIlIIII(b2.aG(), C0001b.o) && lIIIlIIIlIlIIII(b2.aF(), lllIIIIllIIl[0])) {
                                        arrayList2.add(new WorldPoint(local.getWorldX() - lllIIIIllIIl[3], worldPoint3.getY(), local.getPlane()));
                                        "".length();
                                        "".length();
                                        if ((((((80 + 7) - 28) + 89) ^ (((39 + 68) - 60) + 134)) & (((76 ^ 83) ^ (20 ^ 42)) ^ (-" ".length()))) != 0) {
                                            return null;
                                        }
                                    } else if (lIIIlIIIlIlIIII(b.aG(), C0001b.o) && lIIIlIIIlIlIIII(b.aF(), lllIIIIllIIl[0])) {
                                        arrayList2.add(new WorldPoint(local.getWorldX() - lllIIIIllIIl[3], worldPoint3.getY(), local.getPlane()));
                                        "".length();
                                        "".length();
                                        if ("   ".length() == 0) {
                                            return null;
                                        }
                                    } else {
                                        arrayList2.add(new WorldPoint(local.getWorldX(), worldPoint3.getY(), local.getPlane()));
                                        "".length();
                                        "".length();
                                        if (0 != 0) {
                                            return null;
                                        }
                                    }
                                } else if (lIIIlIIIlIlIIII(x + lllIIIIllIIl[8], local.getWorldX())) {
                                    arrayList2.add(new WorldPoint(local.getWorldX() - lllIIIIllIIl[0], worldPoint3.getY(), local.getPlane()));
                                    "".length();
                                    "".length();
                                    if ((-" ".length()) >= (79 ^ 75)) {
                                        return null;
                                    }
                                }
                            }
                            if (lIIIlIIIlIlIIII(x + lllIIIIllIIl[8], local.getWorldX())) {
                                if (lIIIlIIIlIlIIII(b2.aG(), C0001b.o) && lIIIlIIIlIlIIII(b2.aF(), lllIIIIllIIl[0])) {
                                    arrayList2.add(new WorldPoint(local.getWorldX() - lllIIIIllIIl[3], worldPoint3.getY(), local.getPlane()));
                                    "".length();
                                    "".length();
                                    if (!(true ^ true)) {
                                        return null;
                                    }
                                } else if (lIIIlIIIlIlIIII(b.aG(), C0001b.o) && lIIIlIIIlIlIIII(b.aF(), lllIIIIllIIl[0])) {
                                    arrayList2.add(new WorldPoint(local.getWorldX() - lllIIIIllIIl[3], worldPoint3.getY(), local.getPlane()));
                                    "".length();
                                    "".length();
                                    if (0 != 0) {
                                        return null;
                                    }
                                } else {
                                    arrayList2.add(new WorldPoint(local.getWorldX(), worldPoint3.getY(), local.getPlane()));
                                    "".length();
                                    "".length();
                                    if ("  ".length() < 0) {
                                        return null;
                                    }
                                }
                            } else if (lIIIlIIIlIlIIII(x + lllIIIIllIIl[9], local.getWorldX())) {
                                arrayList2.add(new WorldPoint(local.getWorldX() - lllIIIIllIIl[0], worldPoint3.getY(), local.getPlane()));
                                "".length();
                                "".length();
                                if (" ".length() == "   ".length()) {
                                    return null;
                                }
                            }
                        }
                        if (lIIIlIIIlIlIIII(x + lllIIIIllIIl[10], local.getWorldX())) {
                            arrayList2.add(new WorldPoint(local.getWorldX() - lllIIIIllIIl[0], worldPoint3.getY(), local.getPlane()));
                            "".length();
                            "".length();
                            if (("   ".length() ^ (50 ^ 53)) < 0) {
                                return null;
                            }
                        } else if (!lIIIlIIIlIlIIII(x + lllIIIIllIIl[6], local.getWorldX())) {
                            int abs = Math.abs(local.getWorldX() - nearest.getWorldX());
                            if ((lIIIlIIIlIlIlIl(abs, lllIIIIllIIl[4]) && !lIIIlIIIlIlIIlI(x + lllIIIIllIIl[11], local.getWorldX())) || (lIIIlIIIlIlIIlI(abs, lllIIIIllIIl[3]) && lIIIlIIIlIlIlIl(abs, lllIIIIllIIl[5]) && lIIIlIIIlIlIIIl(x + lllIIIIllIIl[12], local.getWorldX()) && lIIIlIIIlIlIlII(x + lllIIIIllIIl[11], local.getWorldX()))) {
                                if (!lIIIlIIIlIlIIll(b.aG(), C0001b.r) || lIIIlIIIlIlIIII(b.aG(), C0001b.q)) {
                                    arrayList2.add(new WorldPoint(local.getWorldX(), worldPoint3.getY(), local.getPlane()));
                                    "".length();
                                    "".length();
                                    if (((((140 + 165) - 214) + 89) ^ (((162 + 127) - 282) + 170)) == 0) {
                                        return null;
                                    }
                                } else if (!lIIIlIIIlIlIIll(b2.aG(), C0001b.r) || lIIIlIIIlIlIIII(b2.aG(), C0001b.q)) {
                                    arrayList2.add(new WorldPoint(local.getWorldX(), worldPoint3.getY(), local.getPlane()));
                                    "".length();
                                    "".length();
                                    if (0 != 0) {
                                        return null;
                                    }
                                } else if (lIIIlIIIlIlIIIl(x + lllIIIIllIIl[11], local.getWorldX())) {
                                    if (lIIIlIIIlIlIIII(local.getWorldX() % lllIIIIllIIl[3], lllIIIIllIIl[0])) {
                                        if ((lIIIlIIIlIlIIII(b.aG(), C0001b.o) && !lIIIlIIIlIlIlIl(b.aF(), lllIIIIllIIl[0])) || lIIIlIIIlIlIIII(b.aG(), C0001b.n)) {
                                            arrayList2.add(new WorldPoint(local.getWorldX() - lllIIIIllIIl[0], worldPoint3.getY(), local.getPlane()));
                                            "".length();
                                            "".length();
                                            if (((22 ^ 86) ^ (84 ^ 16)) < (-" ".length())) {
                                                return null;
                                            }
                                        }
                                    } else if ((lIIIlIIIlIlIIII(b2.aG(), C0001b.o) && !lIIIlIIIlIlIlIl(b2.aF(), lllIIIIllIIl[0])) || lIIIlIIIlIlIIII(b2.aG(), C0001b.n)) {
                                        arrayList2.add(new WorldPoint(local.getWorldX() - lllIIIIllIIl[0], worldPoint3.getY(), local.getPlane()));
                                        "".length();
                                        "".length();
                                        if ((-" ".length()) >= (165 ^ 161)) {
                                            return null;
                                        }
                                    }
                                }
                            }
                            arrayList2.add(worldPoint3);
                            "".length();
                        } else if (lIIIlIIIlIlIIII(b2.aG(), C0001b.o) && lIIIlIIIlIlIIII(b2.aF(), lllIIIIllIIl[0])) {
                            this.north = lllIIIIllIIl[0];
                            arrayList2.add(new WorldPoint(local.getWorldX() - lllIIIIllIIl[3], worldPoint3.getY(), local.getPlane()));
                            "".length();
                            "".length();
                            if (0 != 0) {
                                return null;
                            }
                        } else if (lIIIlIIIlIlIIII(b.aG(), C0001b.o) && lIIIlIIIlIlIIII(b.aF(), lllIIIIllIIl[0])) {
                            this.north = lllIIIIllIIl[1];
                            arrayList2.add(new WorldPoint(local.getWorldX() - lllIIIIllIIl[3], worldPoint3.getY(), local.getPlane()));
                            "".length();
                            "".length();
                            if ((-" ".length()) >= ((52 ^ 14) & ((155 ^ 161) ^ (-1)))) {
                                return null;
                            }
                        } else {
                            arrayList2.add(new WorldPoint(local.getWorldX(), worldPoint3.getY(), local.getPlane()));
                            "".length();
                            "".length();
                            if ("   ".length() == 0) {
                                return null;
                            }
                        }
                    }
                    i2++;
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                }
                return arrayList2;
            }
            return arrayList;
        }
        return arrayList;
    }

    private static void lIIIlIIIlIIlIlI() {
        lllIIIIllIIl = new int[27];
        lllIIIIllIIl[0] = " ".length();
        lllIIIIllIIl[1] = (55 ^ 113) & ((255 ^ 185) ^ (-1));
        lllIIIIllIIl[2] = 134 ^ 137;
        lllIIIIllIIl[3] = "  ".length();
        lllIIIIllIIl[4] = "   ".length();
        lllIIIIllIIl[5] = (2 ^ 25) ^ (174 ^ 177);
        lllIIIIllIIl[6] = (((178 + 27) - 145) + 124) ^ (((113 + 70) - 166) + 155);
        lllIIIIllIIl[7] = 105 ^ 101;
        lllIIIIllIIl[8] = 48 ^ 61;
        lllIIIIllIIl[9] = 173 ^ 163;
        lllIIIIllIIl[10] = (225 ^ 138) ^ (19 ^ 109);
        lllIIIIllIIl[11] = (219 ^ 141) ^ (115 ^ 13);
        lllIIIIllIIl[12] = (((70 + 80) - 49) + 29) ^ (((7 + 13) - (-95)) + 39);
        lllIIIIllIIl[13] = 175 ^ 170;
        lllIIIIllIIl[14] = (((2 + 69) - 18) + 92) ^ (((128 + 134) - 179) + 68);
        lllIIIIllIIl[15] = 19 ^ 1;
        lllIIIIllIIl[16] = (47 ^ 4) ^ (14 ^ 34);
        lllIIIIllIIl[17] = 125 ^ 117;
        lllIIIIllIIl[18] = (185 ^ 150) ^ (214 ^ 194);
        lllIIIIllIIl[19] = 95 ^ 118;
        lllIIIIllIIl[20] = 36 ^ 46;
        lllIIIIllIIl[21] = 108 ^ 94;
        lllIIIIllIIl[22] = 123 ^ 65;
        lllIIIIllIIl[23] = (121 ^ 88) ^ (78 ^ 92);
        lllIIIIllIIl[24] = 63 ^ 127;
        lllIIIIllIIl[25] = (((39 + 113) - 54) + 74) ^ (((123 + 74) - 170) + 102);
        lllIIIIllIIl[26] = (21 ^ 31) ^ "   ".length();
    }

    private static String lIIIlIIIlIIIlll(String lllllllllllllllIIlllIIIlIIIIlllI, String lllllllllllllllIIlllIIIlIIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIlIIIIllIl.getBytes(StandardCharsets.UTF_8)), lllIIIIllIIl[17]), "DES");
            Cipher lllllllllllllllIIlllIIIlIIIlIIII = Cipher.getInstance("DES");
            lllllllllllllllIIlllIIIlIIIlIIII.init(lllIIIIllIIl[3], secretKeySpec);
            return new String(lllllllllllllllIIlllIIIlIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIlIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIIlIIIIlIlI) {
            lllllllllllllllIIlllIIIlIIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIlIIllII(int i) {
        return i != 0;
    }

    public static EnumC0013n valueOf(String str) {
        return (EnumC0013n) Enum.valueOf(EnumC0013n.class, str);
    }

    public void b(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.dartArea.get()));
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.dartDestination.get());
        squireSepulchre.a(this.type.name() + " " + name());
    }

    private static String lIIIlIIIlIIlIII(String lllllllllllllllIIlllIIIlIIllIIII, String lllllllllllllllIIlllIIIlIIlIllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIIlIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIIlllIIIlIIlIllll.toCharArray();
        int lllllllllllllllIIlllIIIlIIlIllII = lllIIIIllIIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIIIIllIIl[1];
        while (lIIIlIIIlIlIIIl(i, length)) {
            char lllllllllllllllIIlllIIIlIIlIIIll = charArray2[i];
            sb.append((char) (lllllllllllllllIIlllIIIlIIlIIIll ^ charArray[lllllllllllllllIIlllIIIlIIlIllII % charArray.length]));
            "".length();
            lllllllllllllllIIlllIIIlIIlIllII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    private boolean a(int i) {
        Player local = Players.getLocal();
        if (lIIIlIIIlIIlIll(local)) {
            return lllIIIIllIIl[1];
        }
        if (lIIIlIIIlIIllll(this.type, EnumC0015p.FINAL) && lIIIlIIIlIlIIIl(Q().get().getWorldX(), local.getWorldX())) {
            return lllIIIIllIIl[1];
        }
        List<TileObject> M = M();
        int i2 = lllIIIIllIIl[1];
        do {
            if (lIIIlIIIlIlIIIl(i2, M.size()) && lIIIlIIIlIlIIIl(i2, lllIIIIllIIl[4])) {
                if (lIIIlIIIlIlIIlI(i2, M.size())) {
                    "".length();
                    if ((-"  ".length()) > 0) {
                        return ((((127 + 132) - 224) + 120) ^ (((120 + 117) - 235) + 143)) & (((((139 + 179) - 292) + 154) ^ (((33 + 163) - 120) + 114)) ^ (-" ".length()));
                    }
                } else if (!lIIIlIIIlIlIIll(C0002c.a(M.get(i2)), C0001b.y) || lIIIlIIIlIlIIII(i, lllIIIIllIIl[4])) {
                    return lllIIIIllIIl[0];
                } else {
                    i2++;
                    "".length();
                }
            }
            System.out.println(lllIIIIllIII[lllIIIIllIIl[1]]);
            return lllIIIIllIIl[1];
        } while ("  ".length() <= "  ".length());
        return ((((154 + 46) - 140) + 159) ^ (((13 + 56) - 68) + 132)) & ((" ".length() ^ (98 ^ 61)) ^ (-" ".length()));
    }

    private List<NPC> N() {
        Player local = Players.getLocal();
        if (!lIIIlIIIlIIlIll(local) && lIIIlIIIlIIllll(this.type, EnumC0015p.FINAL)) {
            return NPCs.getAll(npc -> {
                if (lIIIlIIIlIlIIIl(npc.getWorldX(), local.getWorldX() + lllIIIIllIIl[0]) && lIIIlIIIlIlIIIl(Math.abs(npc.getWorldY() - local.getWorldY()), lllIIIIllIIl[5]) && lIIIlIIIlIlIlII(npc.getWorldX(), local.getWorldX() - lllIIIIllIIl[6]) && lIIIlIIIlIIllII(C0001b.z.contains(Integer.valueOf(npc.getId())) ? 1 : 0)) {
                    ?? r0 = lllIIIIllIIl[0];
                    "".length();
                    return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIIIIllIIl[1];
            });
        }
        return null;
    }

    private static void lIIIlIIIlIIlIIl() {
        lllIIIIllIII = new String[lllIIIIllIIl[26]];
        lllIIIIllIII[lllIIIIllIIl[1]] = lIIIlIIIlIIIllI("qYjqzrC08lfuZF+K0ZJzC5ZrvpvPB8vN", "aLXUB");
        lllIIIIllIII[lllIIIIllIIl[0]] = lIIIlIIIlIIIlll("ZbKH5q62PKGk7mPeyaBLhA==", "NToUY");
        lllIIIIllIII[lllIIIIllIIl[3]] = lIIIlIIIlIIIllI("aCZ6hZbCjzz5BGK8sGhNFmiJzvDTvoyD", "QPgjJ");
        lllIIIIllIII[lllIIIIllIIl[4]] = lIIIlIIIlIIIlll("874+PVtf7o+JENveKDUsxuK1pS5eYIpV", "jAEVO");
        lllIIIIllIII[lllIIIIllIIl[5]] = lIIIlIIIlIIIlll("YIVPMj0lx9M=", "aUMPD");
        lllIIIIllIII[lllIIIIllIIl[13]] = lIIIlIIIlIIlIII("IggqNh4RQQMjDQEUNQ==", "uaPWl");
        lllIIIIllIII[lllIIIIllIIl[14]] = lIIIlIIIlIIlIII("NS0SGSIGZDsMMRYxDQ==", "bDhxP");
        lllIIIIllIII[lllIIIIllIIl[16]] = lIIIlIIIlIIlIII("OhYMAwMbCxQdERdEMAQRDREG", "ydcpp");
        lllIIIIllIII[lllIIIIllIIl[17]] = lIIIlIIIlIIIlll("oH6VjA1I/9u90Aifyi4gVw==", "uufHo");
    }

    private static String lIIIlIIIlIIIllI(String lllllllllllllllIIlllIIIlIIIllIll, String lllllllllllllllIIlllIIIlIIIllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlllIIIlIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlllIIIlIIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlllIIIlIIIlllIl.init(lllIIIIllIIl[3], secretKeySpec);
            return new String(lllllllllllllllIIlllIIIlIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlllIIIlIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlllIIIlIIIlllII) {
            lllllllllllllllIIlllIIIlIIIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIIlIlIllI(int i) {
        return i > 0;
    }

    private static boolean lIIIlIIIlIlIIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIlIIIlIIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private List<WorldPoint> L() {
        Player local = Players.getLocal();
        if (!lIIIlIIIlIIlIll(local) && lIIIlIIIlIIllll(this.type, EnumC0015p.FINAL) && lIIIlIIIlIIllll(this.entry, EnumC0014o.SOUTH)) {
            return new WorldArea(new WorldPoint(local.getWorldX() - lllIIIIllIIl[3], this.startPoint.get().getWorldY() + lllIIIIllIIl[0], local.getPlane()), lllIIIIllIIl[0], lllIIIIllIIl[4]).toWorldPointList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    public boolean a(C0003d c0003d, SquireSepulchre squireSepulchre) {
        Player local = Players.getLocal();
        if (lIIIlIIIlIIlIll(local)) {
            return lllIIIIllIIl[1];
        }
        if (lIIIlIIIlIIllII(b((Locatable) local) ? 1 : 0)) {
            a(squireSepulchre);
            if (lIIIlIIIlIIllII(b(c0003d) ? 1 : 0)) {
                Movement.setDestination(this.startDestination.get());
                return lllIIIIllIIl[0];
            }
            Movement.setDestination(this.startPoint.get());
            return lllIIIIllIIl[0];
        } else if (lIIIlIIIlIIllII(c(local) ? 1 : 0)) {
            b(squireSepulchre);
            e(c0003d);
            "".length();
            return lllIIIIllIIl[0];
        } else {
            return lllIIIIllIIl[1];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    private EnumC0013n(String str, int i, List list, RegionPoint regionPoint, RegionPoint regionPoint2, RegionPoint regionPoint3, int i2, int i3, RegionPoint regionPoint4, EnumC0015p enumC0015p, EnumC0014o enumC0014o) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (lIIIlIIIlIIllII(it.hasNext() ? 1 : 0)) {
                Triple triple = (Triple) it.next();
                arrayList.add(new WorldArea(SquireSepulchre.a((RegionPoint) triple.getFirst()), ((Integer) triple.getSecond()).intValue(), ((Integer) triple.getThird()).intValue()));
                "".length();
                "".length();
                if (" ".length() <= ((139 ^ 179) & ((162 ^ 154) ^ (-1)))) {
                    return null;
                }
            }
            return arrayList;
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint);
        };
        this.startDestination = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.type = enumC0015p;
        this.dartArea = () -> {
            return new WorldArea(SquireSepulchre.a(regionPoint3), i2, i3);
        };
        this.dartDestination = () -> {
            return SquireSepulchre.a(regionPoint4);
        };
        this.entry = enumC0014o;
    }

    public static EnumC0013n[] values() {
        return (EnumC0013n[]) $VALUES.clone();
    }

    public Supplier<WorldPoint> Q() {
        return this.dartDestination;
    }

    public boolean c(Locatable locatable) {
        return this.dartArea.get().contains(locatable);
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.startDestination.get());
        squireSepulchre.a(this.type.name() + " " + name());
    }

    private static boolean lIIIlIIIlIlIlIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIIlIIIlIlIlII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIlIIIlIlIIll(int i, int i2) {
        return i != i2;
    }

    public Supplier<WorldPoint> P() {
        return this.startDestination;
    }

    static {
        lIIIlIIIlIIlIlI();
        lIIIlIIIlIIlIIl();
        BOTTOM_V_II = new EnumC0013n(lllIIIIllIII[lllIIIIllIIl[17]], lllIIIIllIIl[1], new RegionPoint(lllIIIIllIIl[18], lllIIIIllIIl[19], lllIIIIllIIl[1], C0001b.N), lllIIIIllIIl[4], lllIIIIllIIl[20], new RegionPoint(lllIIIIllIIl[18], lllIIIIllIIl[21], lllIIIIllIIl[1], C0001b.N), new RegionPoint(lllIIIIllIIl[22], lllIIIIllIIl[23], lllIIIIllIIl[1], C0001b.N), new RegionPoint(lllIIIIllIIl[1], lllIIIIllIIl[23], lllIIIIllIIl[1], C0001b.N), lllIIIIllIIl[24], lllIIIIllIIl[4], new RegionPoint(lllIIIIllIIl[13], lllIIIIllIIl[25], lllIIIIllIIl[1], C0001b.N), EnumC0015p.FINAL, EnumC0014o.SOUTH);
        EnumC0013n[] enumC0013nArr = new EnumC0013n[lllIIIIllIIl[0]];
        enumC0013nArr[lllIIIIllIIl[1]] = BOTTOM_V_II;
        $VALUES = enumC0013nArr;
    }

    private List<TileObject> M() {
        Player local = Players.getLocal();
        if (!lIIIlIIIlIIlIll(local) && lIIIlIIIlIIllll(this.type, EnumC0015p.FINAL)) {
            return TileObjects.getAll(tileObject -> {
                if (lIIIlIIIlIlIIIl(local.getWorldX() - tileObject.getWorldX(), lllIIIIllIIl[15]) && lIIIlIIIlIlIIIl(Math.abs(local.getWorldY() - tileObject.getWorldY()), lllIIIIllIIl[4]) && lIIIlIIIlIlIIII(local.getPlane(), tileObject.getPlane()) && lIIIlIIIlIIllII(tileObject.getName().equals(lllIIIIllIII[lllIIIIllIIl[16]]) ? 1 : 0)) {
                    ?? r0 = lllIIIIllIIl[0];
                    "".length();
                    return (-" ".length()) == "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lllIIIIllIIl[1];
            });
        }
        return null;
    }

    private static boolean lIIIlIIIlIIlllI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    private EnumC0013n(String str, int i, RegionPoint regionPoint, int i2, int i3, RegionPoint regionPoint2, RegionPoint regionPoint3, RegionPoint regionPoint4, int i4, int i5, RegionPoint regionPoint5, EnumC0015p enumC0015p, EnumC0014o enumC0014o) {
        this.startAreas = () -> {
            return List.of(new WorldArea(SquireSepulchre.a(regionPoint), i2, i3));
        };
        this.startPoint = () -> {
            return SquireSepulchre.a(regionPoint2);
        };
        this.startDestination = () -> {
            return SquireSepulchre.a(regionPoint3);
        };
        this.dartArea = () -> {
            return new WorldArea(SquireSepulchre.a(regionPoint4), i4, i5);
        };
        this.type = enumC0015p;
        this.dartDestination = () -> {
            return SquireSepulchre.a(regionPoint5);
        };
        this.entry = enumC0014o;
    }

    private static boolean lIIIlIIIlIIlIll(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlIIIlIIllIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public boolean b(Locatable locatable) {
        for (WorldArea worldArea : this.startAreas.get()) {
            if (lIIIlIIIlIIllII(worldArea.contains(locatable) ? 1 : 0)) {
                return lllIIIIllIIl[0];
            }
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lllIIIIllIIl[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x034a, code lost:
        if (lIIIlIIIlIIllll(r5.type, e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.EnumC0015p.FINAL) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x034d, code lost:
        r0.removeIf((v1) -> { // java.util.function.Predicate.test(java.lang.Object):boolean
            return h(r1, v1);
        });
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x036b, code lost:
        if (lIIIlIIIlIIllII(r0.size()) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x036e, code lost:
        r0.sort(java.util.Comparator.comparingInt((v1) -> { // java.util.function.ToIntFunction.applyAsInt(java.lang.Object):int
            return c(r1, v1);
        }));
        java.lang.System.out.println(e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.EnumC0013n.lllIIIIllIII[e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.EnumC0013n.lllIIIIllIIl[4]]);
        net.unethicalite.api.movement.Movement.setDestination(r0.get(e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.EnumC0013n.lllIIIIllIIl[1]));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x039f, code lost:
        java.lang.System.out.println(e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.EnumC0013n.lllIIIIllIII[e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.EnumC0013n.lllIIIIllIIl[5]]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x03b3, code lost:
        return e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e.EnumC0013n.lllIIIIllIIl[1];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v114, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(C0003d c0003d) {
        Player local = Players.getLocal();
        if (lIIIlIIIlIIlIll(local)) {
            return lllIIIIllIIl[1];
        }
        List<WorldPoint> a = a(L(), c0003d);
        List<TileObject> M = M();
        ArrayList arrayList = new ArrayList();
        if (lIIIlIIIlIlIllI(M.size())) {
            int i = lllIIIIllIIl[1];
            int i2 = lllIIIIllIIl[1];
            for (TileObject tileObject : M) {
                int lllllllllllllllIIlllIIIlIlIllIll = C0002c.a(tileObject);
                if (lIIIlIIIlIlIIII(lllllllllllllllIIlllIIIlIlIllIll, C0001b.x)) {
                    i2++;
                }
                if (lIIIlIIIlIlIIll(lllllllllllllllIIlllIIIlIlIllIll, C0001b.x)) {
                    if (lIIIlIIIlIIllll(this.type, EnumC0015p.FINAL)) {
                        arrayList.add(Integer.valueOf(tileObject.getWorldY()));
                        "".length();
                    }
                    i++;
                    "".length();
                    if ((((((102 + 146) - 180) + 156) ^ (((40 + 71) - 47) + 106)) & (((110 ^ 37) ^ " ".length()) ^ (-" ".length()))) != 0) {
                        return ((56 ^ 2) ^ (186 ^ 158)) & (((((38 + 127) - 5) + 23) ^ (((12 + 41) - 30) + 146)) ^ (-" ".length()));
                    }
                } else if (lIIIlIIIlIIllII(a(i2) ? 1 : 0)) {
                    System.out.println(lllIIIIllIII[lllIIIIllIIl[0]]);
                    Movement.setDestination(this.dartDestination.get());
                    return lllIIIIllIIl[0];
                } else {
                    i2++;
                    "".length();
                    if ((-" ".length()) != (-" ".length())) {
                        return ((13 ^ 30) ^ (206 ^ 157)) & (((((36 + 145) - 151) + 182) ^ (((81 + 22) - 16) + 61)) ^ (-" ".length()));
                    }
                }
            }
            if (lIIIlIIIlIIllll(this.type, EnumC0015p.FINAL)) {
                a.removeIf(worldPoint -> {
                    return arrayList.contains(Integer.valueOf(worldPoint.getWorldY()));
                });
                "".length();
            }
            if (!lIIIlIIIlIIllII(a.size())) {
                if (lIIIlIIIlIIllll(this.type, EnumC0015p.FINAL)) {
                    Movement.setDestination(local.getWorldLocation());
                }
                return lllIIIIllIIl[0];
            }
            a.sort(Comparator.comparingInt(worldPoint2 -> {
                return Math.abs(worldPoint2.getWorldX() - local.getWorldX()) + Math.abs(worldPoint2.getWorldY() - local.getWorldY());
            }));
            System.out.println(lllIIIIllIII[lllIIIIllIIl[3]]);
            Movement.setDestination(a.get(lllIIIIllIIl[1]));
            return lllIIIIllIIl[0];
        }
        List<NPC> N = N();
        N.sort(Comparator.comparingInt(npc -> {
            return Math.abs(npc.getWorldX() - local.getWorldX()) + Math.abs(npc.getWorldY() - local.getWorldY());
        }));
        arrayList.clear();
        int i3 = lllIIIIllIIl[1];
        while (true) {
            if (!lIIIlIIIlIlIIIl(i3, lllIIIIllIIl[3])) {
                break;
            } else if (lIIIlIIIlIlIlIl(N.size(), i3)) {
                "".length();
                if ("   ".length() == (102 ^ 98)) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                NPC npc2 = N.get(i3);
                if (lIIIlIIIlIIlIll(npc2)) {
                    N.remove(i3);
                    "".length();
                    "".length();
                    if ((-" ".length()) > (-" ".length())) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    if (lIIIlIIIlIIllll(this.type, EnumC0015p.FINAL)) {
                        if (lIIIlIIIlIlIIIl(npc2.getWorldX(), local.getWorldX())) {
                            arrayList.add(Integer.valueOf(npc2.getWorldY()));
                            "".length();
                            i3++;
                            "".length();
                            if ("  ".length() <= 0) {
                                return (true ^ true) & ((true ^ true) ^ true);
                            }
                        } else {
                            N.remove(i3);
                            "".length();
                        }
                    }
                    "".length();
                    if ("   ".length() == (-" ".length())) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                }
            }
        }
    }

    private static boolean lIIIlIIIlIlIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIIIlIlIIlI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    public boolean b(C0003d c0003d) {
        Player local = Players.getLocal();
        if (!lIIIlIIIlIIlIll(local) && !lIIIlIIIlIIllIl(local.getWorldLocation().equals(this.startPoint.get()) ? 1 : 0)) {
            List<NPC> N = N();
            N.sort(Comparator.comparingInt(npc -> {
                return Math.abs(npc.getWorldX() - local.getWorldX()) + Math.abs(npc.getWorldY() - local.getWorldY());
            }));
            if (lIIIlIIIlIIllIl(N.size())) {
                return lllIIIIllIIl[0];
            }
            NPC npc2 = N.get(lllIIIIllIIl[1]);
            if (lIIIlIIIlIIlllI(npc2) && lIIIlIIIlIIllll(this.type, EnumC0015p.FINAL)) {
                return (lIIIlIIIlIlIIII(npc2.getWorldY(), P().get().getWorldY()) && lIIIlIIIlIlIIIl(Math.abs(npc2.getWorldX() - local.getWorldX()), lllIIIIllIIl[2])) ? lllIIIIllIIl[1] : lllIIIIllIIl[0];
            }
            return lllIIIIllIIl[1];
        }
        return lllIIIIllIIl[1];
    }
}
