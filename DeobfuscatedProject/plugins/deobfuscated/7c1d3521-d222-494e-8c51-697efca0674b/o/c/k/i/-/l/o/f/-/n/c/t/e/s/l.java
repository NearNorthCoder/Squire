/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;

public class l {
    private static /* synthetic */ int[] lllIIIlIlI;
    private static /* synthetic */ String[] lllIIIlIIl;

    private static void lIllllllIIlll() {
        lllIIIlIlI = new int[31];
        l.lllIIIlIlI[0] = -(0xFFFFF26D & 0x3FD7) & (0xFFFFFFFF & 0x3F5F);
        l.lllIIIlIlI[1] = -(0xFFFFADE1 & 0x531F) & (0xFFFF9F7F & 0x6DBB);
        l.lllIIIlIlI[2] = 0x72 ^ 0x54;
        l.lllIIIlIlI[3] = 0x88 ^ 0xA3 ^ (0x9C ^ 0x90);
        l.lllIIIlIlI[4] = (0x5A ^ 0x21 ^ (0xF3 ^ 0x84)) & (61 + 100 - 53 + 42 ^ 15 + 85 - 63 + 117 ^ -1);
        l.lllIIIlIlI[5] = -(45 + 57 - 34 + 61) & (0xFFFFFFB5 & 0xDFB);
        l.lllIIIlIlI[6] = 0xFFFFED4F & 0x1EFE;
        l.lllIIIlIlI[7] = -(0xFFFF9BFA & 0x7697) & (0xFFFFFFFB & 0x1FBF);
        l.lllIIIlIlI[8] = -(0xFFFFD9F3 & 0x378D) & (0xFFFF9DDF & 0x7FFE);
        l.lllIIIlIlI[9] = 0xFFFFECE4 & 0x1FDF;
        l.lllIIIlIlI[10] = -(0xFFFFD764 & 0x79DF) & (0xFFFFDFDF & 0x7DFF);
        l.lllIIIlIlI[11] = 0xFFFFFDFF & 0xE9B;
        l.lllIIIlIlI[12] = -(0xFFFFF66F & 0x7BB1) & (0xFFFFFEEF & 0x7FFE);
        l.lllIIIlIlI[13] = -(0xFFFFBA75 & 0x57AF) & (0xFFFFFFFE & 0x1EBF);
        l.lllIIIlIlI[14] = 0xFFFF97BF & 0x79D4;
        l.lllIIIlIlI[15] = 1;
        l.lllIIIlIlI[16] = 0x2D ^ 0x2B;
        l.lllIIIlIlI[17] = 2;
        l.lllIIIlIlI[18] = 0xFFFFD1FB & 0x2F7F;
        l.lllIIIlIlI[19] = 3;
        l.lllIIIlIlI[20] = 0xA3 ^ 0xA7;
        l.lllIIIlIlI[21] = -1;
        l.lllIIIlIlI[22] = 0xED ^ 0x99 ^ (0xFE ^ 0x8F);
        l.lllIIIlIlI[23] = 117 + 18 - 62 + 61 ^ 89 + 95 - 159 + 104;
        l.lllIIIlIlI[24] = 0x64 ^ 0x4C ^ (0xF ^ 0x2F);
        l.lllIIIlIlI[25] = 4 ^ 0xD;
        l.lllIIIlIlI[26] = 0x74 ^ 0x7E;
        l.lllIIIlIlI[27] = 0x70 ^ 0x7B;
        l.lllIIIlIlI[28] = 0x14 ^ 0x18;
        l.lllIIIlIlI[29] = 0x7C ^ 0x71;
        l.lllIIIlIlI[30] = 0x7D ^ 0x73;
    }

    private static boolean lIllllllIllII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllllllIlIlI(int n2) {
        return n2 != 0;
    }

    static {
        l.lIllllllIIlll();
        l.lIllllllIIllI();
    }

    private static void lIllllllIIllI() {
        lllIIIlIIl = new String[lllIIIlIlI[30]];
        l.lllIIIlIIl[l.lllIIIlIlI[4]] = l."Nav to hill giants";
        l.lllIIIlIIl[l.lllIIIlIlI[15]] = l."Run to hop tile";
        l.lllIIIlIIl[l.lllIIIlIlI[17]] = l."World hopping";
        l.lllIIIlIIl[l.lllIIIlIlI[19]] = l."Eat";
        l.lllIIIlIIl[l.lllIIIlIlI[20]] = l."In combat";
        l.lllIIIlIIl[l.lllIIIlIlI[22]] = l."Attack";
        l.lllIIIlIIl[l.lllIIIlIlI[16]] = l."Attacking hill giant";
        l.lllIIIlIIl[l.lllIIIlIlI[23]] = l."Attack";
        l.lllIIIlIIl[l.lllIIIlIlI[24]] = l."Attacking hill giant";
        l.lllIIIlIIl[l.lllIIIlIlI[25]] = l."Attack";
        l.lllIIIlIIl[l.lllIIIlIlI[26]] = l."Hill";
        l.lllIIIlIIl[l.lllIIIlIlI[27]] = l."Hill";
        l.lllIIIlIIl[l.lllIIIlIlI[28]] = l."Hill";
        l.lllIIIlIIl[l.lllIIIlIlI[29]] = l."Hill";
    }

    private static String lIllllllIIIll(String lllllllllllllllllIllllIIIlIIllII, String lllllllllllllllllIllllIIIlIIlIll) {
        try {
            SecretKeySpec lllllllllllllllllIllllIIIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIIIlIIlIll.getBytes(StandardCharsets.UTF_8)), lllIIIlIlI[24]), "DES");
            Cipher lllllllllllllllllIllllIIIlIIlllI = Cipher.getInstance("DES");
            lllllllllllllllllIllllIIIlIIlllI.init(lllIIIlIlI[17], lllllllllllllllllIllllIIIlIIllll);
            return new String(lllllllllllllllllIllllIIIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIllllIIIlIIllIl) {
            lllllllllllllllllIllllIIIlIIllIl.printStackTrace();
            return null;
        }
    }

    private static String lIllllllIIlII(String lllllllllllllllllIllllIIIIlIlIlI, String lllllllllllllllllIllllIIIIlIlIIl) {
        lllllllllllllllllIllllIIIIlIlIlI = new String(Base64.getDecoder().decode(lllllllllllllllllIllllIIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIllllIIIIlIllIl = new StringBuilder();
        char[] lllllllllllllllllIllllIIIIlIllII = lllllllllllllllllIllllIIIIlIlIIl.toCharArray();
        int lllllllllllllllllIllllIIIIlIlIll = lllIIIlIlI[4];
        char[] lllllllllllllllllIllllIIIIlIIlIl = lllllllllllllllllIllllIIIIlIlIlI.toCharArray();
        int lllllllllllllllllIllllIIIIlIIlII = lllllllllllllllllIllllIIIIlIIlIl.length;
        int lllllllllllllllllIllllIIIIlIIIll = lllIIIlIlI[4];
        while (l.lIllllllIlllI(lllllllllllllllllIllllIIIIlIIIll, lllllllllllllllllIllllIIIIlIIlII)) {
            char lllllllllllllllllIllllIIIIllIIII = lllllllllllllllllIllllIIIIlIIlIl[lllllllllllllllllIllllIIIIlIIIll];
            lllllllllllllllllIllllIIIIlIllIl.append((char)(lllllllllllllllllIllllIIIIllIIII ^ lllllllllllllllllIllllIIIIlIllII[lllllllllllllllllIllllIIIIlIlIll % lllllllllllllllllIllllIIIIlIllII.length]));
            0;
            ++lllllllllllllllllIllllIIIIlIlIll;
            ++lllllllllllllllllIllllIIIIlIIIll;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllIllllIIIIlIllIl);
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, Player player) {
        return worldArea.contains((Locatable)player);
    }

    private static boolean lIllllllIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void aj() {
        void lllllllllllllllllIllllIIIllIIIIl;
        WorldPoint lllllllllllllllllIllllIIIlIlllII;
        WorldArea worldArea = new WorldArea(lllIIIlIlI[0], lllIIIlIlI[1], lllIIIlIlI[2], lllIIIlIlI[3], lllIIIlIlI[4]);
        WorldPoint worldPoint = new WorldPoint(lllIIIlIlI[5], lllIIIlIlI[6], lllIIIlIlI[4]);
        WorldPoint worldPoint2 = new WorldPoint(lllIIIlIlI[7], lllIIIlIlI[8], lllIIIlIlI[4]);
        e.F();
        if (l.lIllllllIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lllllllllllllllllIllllIIIllIIIII;
            WorldPoint worldPoint3 = new WorldPoint(lllIIIlIlI[9], lllIIIlIlI[10], lllIIIlIlI[4]);
            WorldPoint worldPoint4 = new WorldPoint(lllIIIlIlI[9], lllIIIlIlI[11], lllIIIlIlI[4]);
            if (!l.lIllllllIlIIl(Players.getLocal().getWorldLocation().equals((Object)worldPoint3) ? 1 : 0) || l.lIllllllIlIlI(Players.getLocal().getWorldLocation().equals((Object)worldPoint4) ? 1 : 0)) {
                lllllllllllllllllIllllIIIlIlllII = new WorldPoint(lllIIIlIlI[12], lllIIIlIlI[13], lllIIIlIlI[4]);
                e.c(lllllllllllllllllIllllIIIlIlllII);
                Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllIllllIIIlIlllII), (int)lllIIIlIlI[14]);
                0;
            }
            AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[4]];
            Movement.walkTo((WorldPoint)lllllllllllllllllIllllIIIllIIIII);
            0;
            Time.sleepTicks((int)lllIIIlIlI[15]);
            0;
        }
        List lllllllllllllllllIllllIIIlIllllI = Players.getAll(arg_0 -> l.a((WorldArea)lllllllllllllllllIllllIIIllIIIIl, arg_0));
        if (l.lIllllllIlIlI(lllllllllllllllllIllllIIIllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && l.lIllllllIlIll(lllllllllllllllllIllllIIIlIllllI.size(), lllIIIlIlI[16])) {
            void lllllllllllllllllIllllIIIlIlllll;
            if (l.lIllllllIllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllllIIIlIlllll), lllIIIlIlI[17])) {
                AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[15]];
                Movement.walkTo((WorldPoint)lllllllllllllllllIllllIIIlIlllll);
                0;
                Time.sleepTicks((int)lllIIIlIlI[15]);
                0;
            }
            if (l.lIllllllIllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllIllllIIIlIlllll), lllIIIlIlI[17])) {
                AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[17]];
                e.D();
            }
        }
        if (l.lIllllllIlIlI(lllllllllllllllllIllllIIIllIIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && l.lIllllllIlllI(lllllllllllllllllIllllIIIlIllllI.size(), lllIIIlIlI[16])) {
            NPC lllllllllllllllllIllllIIIlIlllIl;
            if (l.lIllllllIllll(l.lIllllllIlIII(e.w(), 55.0))) {
                int[] nArray = new int[lllIIIlIlI[15]];
                nArray[l.lllIIIlIlI[4]] = lllIIIlIlI[18];
                if (l.lIllllllIlIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllIIIlIlI[15]];
                    nArray2[l.lllIIIlIlI[4]] = lllIIIlIlI[18];
                    Inventory.getFirst((int[])nArray2).interact(lllIIIlIIl[lllIIIlIlI[19]]);
                    Time.sleepTicks((int)lllIIIlIlI[15]);
                    0;
                }
            }
            if (l.lIlllllllIIII(Players.getLocal().getInteracting())) {
                AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[20]];
            }
            if (l.lIlllllllIIII(Players.getLocal().getInteracting()) && l.lIlllllllIIIl(Players.getLocal().getHealthRatio(), lllIIIlIlI[21])) {
                lllllllllllllllllIllllIIIlIlllIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.lIllllllIlIlI(nPC.getName().contains(lllIIIlIIl[lllIIIlIlI[29]]) ? 1 : 0) && l.lIlllllllIIll(nPC.getInteracting(), Players.getLocal()) && l.lIllllllIlIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIIIlIlI[15];
                        0;
                        if (((0x4D ^ 0x3D ^ (0x2F ^ 0xC)) & (0x13 ^ 0x45 ^ (4 ^ 1) ^ -1)) != 0) {
                            return ((0xF0 ^ 0x96 ^ (0x5E ^ 2)) & (0xF0 ^ 0xC6 ^ (0x63 ^ 0x6F) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lllIIIlIlI[4];
                    }
                    return n2 != 0;
                });
                if (l.lIlllllllIIII(lllllllllllllllllIllllIIIlIlllIl)) {
                    lllllllllllllllllIllllIIIlIlllIl.interact(lllIIIlIIl[lllIIIlIlI[22]]);
                    Time.sleepTicks((int)lllIIIlIlI[17]);
                    0;
                    return;
                }
                lllllllllllllllllIllllIIIlIlllII = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.lIllllllIlIlI(nPC.getName().contains(lllIIIlIIl[lllIIIlIlI[28]]) ? 1 : 0) && l.lIlllllllIIlI(nPC.getInteracting()) && l.lIllllllIlIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIIIlIlI[15];
                        0;
                        if ((0xE ^ 0xA) < -1) {
                            return ((0x79 ^ 0x2E) & ~(0xE ^ 0x59)) != 0;
                        }
                    } else {
                        n2 = lllIIIlIlI[4];
                    }
                    return n2 != 0;
                });
                if (l.lIlllllllIIII(lllllllllllllllllIllllIIIlIlllII) && l.lIlllllllIIlI(lllllllllllllllllIllllIIIlIlllIl)) {
                    AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[16]];
                    lllllllllllllllllIllllIIIlIlllII.interact(lllIIIlIIl[lllIIIlIlI[23]]);
                    Time.sleepTicks((int)lllIIIlIlI[17]);
                    0;
                    return;
                }
            }
            if (l.lIlllllllIIlI(Players.getLocal().getInteracting())) {
                lllllllllllllllllIllllIIIlIlllIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.lIllllllIlIlI(nPC.getName().contains(lllIIIlIIl[lllIIIlIlI[27]]) ? 1 : 0) && l.lIlllllllIIlI(nPC.getInteracting()) && l.lIllllllIlIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIIIlIlI[15];
                        0;
                        if (null != null) {
                            return ((0x5C ^ 0x6E) & ~(0x96 ^ 0xA4)) != 0;
                        }
                    } else {
                        n2 = lllIIIlIlI[4];
                    }
                    return n2 != 0;
                });
                lllllllllllllllllIllllIIIlIlllII = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.lIllllllIlIlI(nPC.getName().contains(lllIIIlIIl[lllIIIlIlI[26]]) ? 1 : 0) && l.lIlllllllIIll(nPC.getInteracting(), Players.getLocal()) && l.lIllllllIlIIl(nPC.isDead() ? 1 : 0)) {
                        n2 = lllIIIlIlI[15];
                        0;
                        if (((0x7E ^ 0x1B ^ (0x51 ^ 9)) & (85 + 118 - 63 + 12 ^ 75 + 51 - 33 + 72 ^ -1)) == 3) {
                            return ((42 + 148 - 105 + 82 ^ 6 + 70 - 66 + 121) & (21 + 160 - 102 + 83 ^ 23 + 111 - 91 + 91 ^ -1)) != 0;
                        }
                    } else {
                        n2 = lllIIIlIlI[4];
                    }
                    return n2 != 0;
                });
                if (l.lIlllllllIIII(lllllllllllllllllIllllIIIlIlllIl) && l.lIlllllllIIlI(lllllllllllllllllIllllIIIlIlllII)) {
                    AccBuilderSotf.c = lllIIIlIIl[lllIIIlIlI[24]];
                    lllllllllllllllllIllllIIIlIlllIl.interact(lllIIIlIIl[lllIIIlIlI[25]]);
                    Time.sleepTicks((int)lllIIIlIlI[17]);
                    0;
                }
            }
        }
    }

    private static boolean lIlllllllIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlllllllIIII(Object object) {
        return object != null;
    }

    private static boolean lIlllllllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllllllIllll(int n2) {
        return n2 < 0;
    }

    private static String lIllllllIIlIl(String lllllllllllllllllIllllIIIIllllll, String lllllllllllllllllIllllIIIIlllllI) {
        try {
            SecretKeySpec lllllllllllllllllIllllIIIlIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllIIIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllllIIIlIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllllIIIlIIIIIl.init(lllIIIlIlI[17], lllllllllllllllllIllllIIIlIIIIlI);
            return new String(lllllllllllllllllIllllIIIlIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllllIIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllIllllIIIlIIIIII) {
            lllllllllllllllllIllllIIIlIIIIII.printStackTrace();
            return null;
        }
    }

    private static int lIllllllIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIllllllIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllllllIIlI(Object object) {
        return object == null;
    }

    private static boolean lIllllllIlIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllllllIlllI(int n2, int n3) {
        return n2 < n3;
    }
}

