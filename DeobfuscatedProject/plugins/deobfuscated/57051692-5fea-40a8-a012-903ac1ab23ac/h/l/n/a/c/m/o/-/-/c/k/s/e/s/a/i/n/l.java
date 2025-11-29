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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
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

public class l {
    private static /* synthetic */ String[] lIllIllllI;
    private static /* synthetic */ int[] lIllIlllll;

    private static void lIIllIllIIlII() {
        lIllIlllll = new int[31];
        l.lIllIlllll[0] = -(0xFFFFF7F7 & 0x182D) & (0xFFFFDDBF & 0x3F7F);
        l.lIllIlllll[1] = 0xFFFFCF7B & 0x3CBF;
        l.lIllIlllll[2] = 0x8A ^ 0xAC;
        l.lIllIlllll[3] = 0x66 ^ 0x41;
        l.lIllIlllll[4] = (0x22 ^ 0x64) & ~(0x21 ^ 0x67);
        l.lIllIlllll[5] = -(0xFFFFFEFF & 0x41C5) & (0xFFFFEDF5 & 0x5FFF);
        l.lIllIlllll[6] = -(0xFFFFDFEB & 0x6336) & (0xFFFFFF7F & 0x4FEF);
        l.lIllIlllll[7] = 0xFFFFCD6F & 0x3FBA;
        l.lIllIlllll[8] = 0xFFFF8DDE & 0x7E7F;
        l.lIllIlllll[9] = -(0xFFFF9FC9 & 0x6137) & (0xFFFFCFFE & 0x3DC5);
        l.lIllIlllll[10] = -(0xFFFFFF6D & 0x33F6) & (0xFFFFBFFF & Short.MAX_VALUE);
        l.lIllIlllll[11] = -(0xFFFFEBE7 & 0x7779) & (0xFFFFFFFF & 0x6FFB);
        l.lIllIlllll[12] = 0xFFFFACFE & 0x5FCF;
        l.lIllIlllll[13] = 0xFFFFDEDB & 0x2DBE;
        l.lIllIlllll[14] = 0xFFFFB5DD & 0x5BB6;
        l.lIllIlllll[15] = 1;
        l.lIllIlllll[16] = 99 + 66 - 31 + 28 ^ 10 + 128 - 29 + 55;
        l.lIllIlllll[17] = 2;
        l.lIllIlllll[18] = 0xFFFF89FF & 0x777B;
        l.lIllIlllll[19] = 3;
        l.lIllIlllll[20] = 0x7E ^ 0x4C ^ (0x37 ^ 1);
        l.lIllIlllll[21] = -1;
        l.lIllIlllll[22] = 0xC3 ^ 0xC6;
        l.lIllIlllll[23] = 0x80 ^ 0x87;
        l.lIllIlllll[24] = 0xF7 ^ 0x81 ^ (0x30 ^ 0x4E);
        l.lIllIlllll[25] = 0x70 ^ 0x79;
        l.lIllIlllll[26] = 0x9C ^ 0x96;
        l.lIllIlllll[27] = 0x66 ^ 0x6D;
        l.lIllIlllll[28] = 0xF4 ^ 0x8C ^ (0x49 ^ 0x3D);
        l.lIllIlllll[29] = 0x40 ^ 0x4F ^ 2;
        l.lIllIlllll[30] = 0x6B ^ 0x65;
    }

    private static boolean lIIllIllIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        l.lIIllIllIIlII();
        l.lIIllIllIIIll();
    }

    private static boolean lIIllIllIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void ah() {
        void lllllllllllllllllllIIIIIlllIlIll;
        WorldPoint lllllllllllllllllllIIIIIlllIIllI;
        WorldArea worldArea = new WorldArea(lIllIlllll[0], lIllIlllll[1], lIllIlllll[2], lIllIlllll[3], lIllIlllll[4]);
        WorldPoint worldPoint = new WorldPoint(lIllIlllll[5], lIllIlllll[6], lIllIlllll[4]);
        WorldPoint worldPoint2 = new WorldPoint(lIllIlllll[7], lIllIlllll[8], lIllIlllll[4]);
        e.D();
        if (l.lIIllIllIIllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lllllllllllllllllllIIIIIlllIlIlI;
            WorldPoint worldPoint3 = new WorldPoint(lIllIlllll[9], lIllIlllll[10], lIllIlllll[4]);
            WorldPoint worldPoint4 = new WorldPoint(lIllIlllll[9], lIllIlllll[11], lIllIlllll[4]);
            if (!l.lIIllIllIIllI(Players.getLocal().getWorldLocation().equals((Object)worldPoint3) ? 1 : 0) || l.lIIllIllIIlll(Players.getLocal().getWorldLocation().equals((Object)worldPoint4) ? 1 : 0)) {
                lllllllllllllllllllIIIIIlllIIllI = new WorldPoint(lIllIlllll[12], lIllIlllll[13], lIllIlllll[4]);
                e.c(lllllllllllllllllllIIIIIlllIIllI);
                Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)lllllllllllllllllllIIIIIlllIIllI), (int)lIllIlllll[14]);
                0;
            }
            AccBuilderShamans.c = lIllIllllI[lIllIlllll[4]];
            Movement.walkTo((WorldPoint)lllllllllllllllllllIIIIIlllIlIlI);
            0;
            Time.sleepTicks((int)lIllIlllll[15]);
            0;
        }
        List lllllllllllllllllllIIIIIlllIlIII = Players.getAll(arg_0 -> l.a((WorldArea)lllllllllllllllllllIIIIIlllIlIll, arg_0));
        if (l.lIIllIllIIlll(lllllllllllllllllllIIIIIlllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && l.lIIllIllIlIII(lllllllllllllllllllIIIIIlllIlIII.size(), lIllIlllll[16])) {
            void lllllllllllllllllllIIIIIlllIlIIl;
            if (l.lIIllIllIlIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIIIIlllIlIIl), lIllIlllll[17])) {
                AccBuilderShamans.c = lIllIllllI[lIllIlllll[15]];
                Movement.walkTo((WorldPoint)lllllllllllllllllllIIIIIlllIlIIl);
                0;
                Time.sleepTicks((int)lIllIlllll[15]);
                0;
            }
            if (l.lIIllIllIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllllllIIIIIlllIlIIl), lIllIlllll[17])) {
                AccBuilderShamans.c = lIllIllllI[lIllIlllll[17]];
                e.B();
            }
        }
        if (l.lIIllIllIIlll(lllllllllllllllllllIIIIIlllIlIll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && l.lIIllIllIlIll(lllllllllllllllllllIIIIIlllIlIII.size(), lIllIlllll[16])) {
            NPC lllllllllllllllllllIIIIIlllIIlll;
            if (l.lIIllIllIllII(l.lIIllIllIIlIl(e.u(), 55.0))) {
                int[] nArray = new int[lIllIlllll[15]];
                nArray[l.lIllIlllll[4]] = lIllIlllll[18];
                if (l.lIIllIllIIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIllIlllll[15]];
                    nArray2[l.lIllIlllll[4]] = lIllIlllll[18];
                    Inventory.getFirst((int[])nArray2).interact(lIllIllllI[lIllIlllll[19]]);
                    Time.sleepTicks((int)lIllIlllll[15]);
                    0;
                }
            }
            if (l.lIIllIllIllIl(Players.getLocal().getInteracting())) {
                AccBuilderShamans.c = lIllIllllI[lIllIlllll[20]];
            }
            if (l.lIIllIllIllIl(Players.getLocal().getInteracting()) && l.lIIllIllIlllI(Players.getLocal().getHealthRatio(), lIllIlllll[21])) {
                lllllllllllllllllllIIIIIlllIIlll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.lIIllIllIIlll(nPC.getName().contains(lIllIllllI[lIllIlllll[29]]) ? 1 : 0) && l.lIIllIlllIIII(nPC.getInteracting(), Players.getLocal()) && l.lIIllIllIIllI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIllIlllll[15];
                        0;
                        if (null != null) {
                            return ((0xC2 ^ 0x9B) & ~(0x21 ^ 0x78)) != 0;
                        }
                    } else {
                        n2 = lIllIlllll[4];
                    }
                    return n2 != 0;
                });
                if (l.lIIllIllIllIl(lllllllllllllllllllIIIIIlllIIlll)) {
                    lllllllllllllllllllIIIIIlllIIlll.interact(lIllIllllI[lIllIlllll[22]]);
                    Time.sleepTicks((int)lIllIlllll[17]);
                    0;
                    return;
                }
                lllllllllllllllllllIIIIIlllIIllI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.lIIllIllIIlll(nPC.getName().contains(lIllIllllI[lIllIlllll[28]]) ? 1 : 0) && l.lIIllIllIllll(nPC.getInteracting()) && l.lIIllIllIIllI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIllIlllll[15];
                        0;
                        if (-1 >= 3) {
                            return ((0xEF ^ 0xB2 ^ (0x35 ^ 0x4D)) & (139 + 5 - -12 + 14 ^ 110 + 136 - 238 + 135 ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIllIlllll[4];
                    }
                    return n2 != 0;
                });
                if (l.lIIllIllIllIl(lllllllllllllllllllIIIIIlllIIllI) && l.lIIllIllIllll(lllllllllllllllllllIIIIIlllIIlll)) {
                    AccBuilderShamans.c = lIllIllllI[lIllIlllll[16]];
                    lllllllllllllllllllIIIIIlllIIllI.interact(lIllIllllI[lIllIlllll[23]]);
                    Time.sleepTicks((int)lIllIlllll[17]);
                    0;
                    return;
                }
            }
            if (l.lIIllIllIllll(Players.getLocal().getInteracting())) {
                lllllllllllllllllllIIIIIlllIIlll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.lIIllIllIIlll(nPC.getName().contains(lIllIllllI[lIllIlllll[27]]) ? 1 : 0) && l.lIIllIllIllll(nPC.getInteracting()) && l.lIIllIllIIllI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIllIlllll[15];
                        0;
                        if (((2 ^ (0x8D ^ 0xA9)) & (11 + 153 - 149 + 155 ^ 32 + 67 - 52 + 93 ^ -1)) >= 3) {
                            return ((0x37 ^ 0x3A ^ (0x70 ^ 0x5F)) & (0x95 ^ 0xC1 ^ (0xB3 ^ 0xC5) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIllIlllll[4];
                    }
                    return n2 != 0;
                });
                lllllllllllllllllllIIIIIlllIIllI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.lIIllIllIIlll(nPC.getName().contains(lIllIllllI[lIllIlllll[26]]) ? 1 : 0) && l.lIIllIlllIIII(nPC.getInteracting(), Players.getLocal()) && l.lIIllIllIIllI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIllIlllll[15];
                        0;
                        if (null != null) {
                            return ((4 ^ 0x66 ^ (0xE ^ 0x79)) & (0xD7 ^ 0x9B ^ (0xE4 ^ 0xBD) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIllIlllll[4];
                    }
                    return n2 != 0;
                });
                if (l.lIIllIllIllIl(lllllllllllllllllllIIIIIlllIIlll) && l.lIIllIllIllll(lllllllllllllllllllIIIIIlllIIllI)) {
                    AccBuilderShamans.c = lIllIllllI[lIllIlllll[24]];
                    lllllllllllllllllllIIIIIlllIIlll.interact(lIllIllllI[lIllIlllll[25]]);
                    Time.sleepTicks((int)lIllIlllll[17]);
                    0;
                }
            }
        }
    }

    private static boolean lIIllIllIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIllIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIllIlllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllIllIllll(Object object) {
        return object == null;
    }

    private static boolean lIIllIllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIllIllII(int n2) {
        return n2 < 0;
    }

    private static boolean lIIllIllIllIl(Object object) {
        return object != null;
    }

    private static void lIIllIllIIIll() {
        lIllIllllI = new String[lIllIlllll[30]];
        l.lIllIllllI[l.lIllIlllll[4]] = l."Nav to hill giants";
        l.lIllIllllI[l.lIllIlllll[15]] = l."Run to hop tile";
        l.lIllIllllI[l.lIllIlllll[17]] = l."World hopping";
        l.lIllIllllI[l.lIllIlllll[19]] = l."Eat";
        l.lIllIllllI[l.lIllIlllll[20]] = l."In combat";
        l.lIllIllllI[l.lIllIlllll[22]] = l."Attack";
        l.lIllIllllI[l.lIllIlllll[16]] = l."Attacking hill giant";
        l.lIllIllllI[l.lIllIlllll[23]] = l."Attack";
        l.lIllIllllI[l.lIllIlllll[24]] = l."Attacking hill giant";
        l.lIllIllllI[l.lIllIlllll[25]] = l."Attack";
        l.lIllIllllI[l.lIllIlllll[26]] = l."Hill";
        l.lIllIllllI[l.lIllIlllll[27]] = l."Hill";
        l.lIllIllllI[l.lIllIlllll[28]] = l."Hill";
        l.lIllIllllI[l.lIllIlllll[29]] = l."Hill";
    }

    private static int lIIllIllIIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, Player player) {
        return worldArea.contains((Locatable)player);
    }

    private static boolean lIIllIllIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIllIlllIIII(Object object, Object object2) {
        return object == object2;
    }

    private static String lIIllIllIIIIl(String lllllllllllllllllllIIIIIlIllIIIl, String lllllllllllllllllllIIIIIlIlIlllI) {
        try {
            SecretKeySpec lllllllllllllllllllIIIIIlIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIIlIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllIIIIIlIllIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllllllIIIIIlIllIIll.init(lIllIlllll[17], lllllllllllllllllllIIIIIlIllIlII);
            return new String(lllllllllllllllllllIIIIIlIllIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIIIIlIllIIlI) {
            lllllllllllllllllllIIIIIlIllIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIIllIllIIIlI(String lllllllllllllllllllIIIIIllIlIllI, String lllllllllllllllllllIIIIIllIlIlIl) {
        try {
            SecretKeySpec lllllllllllllllllllIIIIIllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIIIIllIlIlIl.getBytes(StandardCharsets.UTF_8)), lIllIlllll[24]), "DES");
            Cipher lllllllllllllllllllIIIIIllIllIII = Cipher.getInstance("DES");
            lllllllllllllllllllIIIIIllIllIII.init(lIllIlllll[17], lllllllllllllllllllIIIIIllIllIIl);
            return new String(lllllllllllllllllllIIIIIllIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIIIIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllllllIIIIIllIlIlll) {
            lllllllllllllllllllIIIIIllIlIlll.printStackTrace();
            return null;
        }
    }

    private static String lIIllIllIIIII(String lllllllllllllllllllIIIIIllIIIIIl, String lllllllllllllllllllIIIIIllIIIlIl) {
        lllllllllllllllllllIIIIIllIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllllllllIIIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllIIIIIllIIIlII = new StringBuilder();
        char[] lllllllllllllllllllIIIIIllIIIIll = lllllllllllllllllllIIIIIllIIIlIl.toCharArray();
        int lllllllllllllllllllIIIIIllIIIIlI = lIllIlllll[4];
        char[] lllllllllllllllllllIIIIIlIllllII = lllllllllllllllllllIIIIIllIIIIIl.toCharArray();
        int lllllllllllllllllllIIIIIlIlllIll = lllllllllllllllllllIIIIIlIllllII.length;
        int lllllllllllllllllllIIIIIlIlllIlI = lIllIlllll[4];
        while (l.lIIllIllIlIll(lllllllllllllllllllIIIIIlIlllIlI, lllllllllllllllllllIIIIIlIlllIll)) {
            char lllllllllllllllllllIIIIIllIIIlll = lllllllllllllllllllIIIIIlIllllII[lllllllllllllllllllIIIIIlIlllIlI];
            lllllllllllllllllllIIIIIllIIIlII.append((char)(lllllllllllllllllllIIIIIllIIIlll ^ lllllllllllllllllllIIIIIllIIIIll[lllllllllllllllllllIIIIIllIIIIlI % lllllllllllllllllllIIIIIllIIIIll.length]));
            0;
            ++lllllllllllllllllllIIIIIllIIIIlI;
            ++lllllllllllllllllllIIIIIlIlllIlI;
            0;
            if ((0xEB ^ 0x9D ^ (0x35 ^ 0x47)) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllllllIIIIIllIIIlII);
    }
}

