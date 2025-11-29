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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import gg.squire.account.AccBuilderBarrows;
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

public class k {
    private static /* synthetic */ int[] lIlllIll;
    private static /* synthetic */ String[] lIlllIlI;

    private static String lIIllIllIlI(String lIlIllllIllIIlI, String lIlIllllIllIIIl) {
        try {
            SecretKeySpec lIlIllllIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllllIllIIIl.getBytes(StandardCharsets.UTF_8)), lIlllIll[24]), "DES");
            Cipher lIlIllllIllIllI = Cipher.getInstance("DES");
            lIlIllllIllIllI.init(lIlllIll[17], lIlIllllIllIlll);
            return new String(lIlIllllIllIllI.doFinal(Base64.getDecoder().decode(lIlIllllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllllIllIlII) {
            lIlIllllIllIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlllIlIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlllIllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIllllIIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIllllIIIl(Object object) {
        return object == null;
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, Player player) {
        return worldArea.contains((Locatable)player);
    }

    private static String lIIllIllIII(String lIlIllllIlIIIII, String lIlIllllIIlllll) {
        lIlIllllIlIIIII = new String(Base64.getDecoder().decode(lIlIllllIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllllIIllllI = new StringBuilder();
        char[] lIlIllllIIlllIl = lIlIllllIIlllll.toCharArray();
        int lIlIllllIIlllII = lIlllIll[4];
        char[] lIlIllllIIlIllI = lIlIllllIlIIIII.toCharArray();
        int lIlIllllIIlIlIl = lIlIllllIIlIllI.length;
        int lIlIllllIIlIlII = lIlllIll[4];
        while (k.lIIlllIllIl(lIlIllllIIlIlII, lIlIllllIIlIlIl)) {
            char lIlIllllIlIIIIl = lIlIllllIIlIllI[lIlIllllIIlIlII];
            lIlIllllIIllllI.append((char)(lIlIllllIlIIIIl ^ lIlIllllIIlllIl[lIlIllllIIlllII % lIlIllllIIlllIl.length]));
            0;
            ++lIlIllllIIlllII;
            ++lIlIllllIIlIlII;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return String.valueOf(lIlIllllIIllllI);
    }

    private static boolean lIIlllIlllI(int n2) {
        return n2 < 0;
    }

    private static String lIIllIllIIl(String lIlIllllIllllll, String lIlIllllIlllllI) {
        try {
            SecretKeySpec lIlIlllllIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllllIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlllllIIIIll = Cipher.getInstance("Blowfish");
            lIlIlllllIIIIll.init(lIlllIll[17], lIlIlllllIIIlII);
            return new String(lIlIlllllIIIIll.doFinal(Base64.getDecoder().decode(lIlIllllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlllllIIIIlI) {
            lIlIlllllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlllIIllI() {
        lIlllIll = new int[31];
        k.lIlllIll[0] = 0xFFFFCFBB & 0x3D5F;
        k.lIlllIll[1] = 0xFFFFFEBF & 0xD7B;
        k.lIlllIll[2] = 126 + 110 - 90 + 5 ^ 6 + 6 - -61 + 104;
        k.lIlllIll[3] = 0x49 ^ 0x6E;
        k.lIlllIll[4] = (0x3C ^ 0x6E) & ~(0x4F ^ 0x1D);
        k.lIlllIll[5] = -(0xFFFFF4FD & 0x3B4F) & (0xFFFFFFFD & 0x3D7F);
        k.lIlllIll[6] = -(0xFFFFE4A3 & 0x7B7D) & (0xFFFFED7F & 0x7EEE);
        k.lIlllIll[7] = 0xFFFF9DBB & 0x6F6E;
        k.lIlllIll[8] = -(0xFFFFFBAD & 0x3773) & (0xFFFFBF7F & 0x7FFE);
        k.lIlllIll[9] = -(0xFFFFABB6 & 0x566D) & (0xFFFFBEF7 & 0x4FEF);
        k.lIlllIll[10] = 0xFFFFEDDE & 0x1EBD;
        k.lIlllIll[11] = -(0xFFFFC7F9 & 0x7A07) & (0xFFFFCFBF & 0x7EDB);
        k.lIlllIll[12] = -(0xFFFFCB12 & 0x76FF) & (0xFFFFFEFF & 0x4FDF);
        k.lIlllIll[13] = -(7 ^ 0x42) & (0xFFFF8EFF & 0x7DDE);
        k.lIlllIll[14] = -(0xFFFF96EB & 0x6D3E) & (0xFFFFDFBD & 0x35FF);
        k.lIlllIll[15] = 1;
        k.lIlllIll[16] = 0xA6 ^ 0xA0;
        k.lIlllIll[17] = 2;
        k.lIlllIll[18] = -(0xFFFFDEE5 & 0x379F) & (0xFFFFFFFF & 0x17FF);
        k.lIlllIll[19] = 3;
        k.lIlllIll[20] = 0x11 ^ 0x15;
        k.lIlllIll[21] = -1;
        k.lIlllIll[22] = 46 + 29 - -53 + 8 ^ 62 + 101 - 103 + 81;
        k.lIlllIll[23] = 0xB7 ^ 0xB0;
        k.lIlllIll[24] = 0x42 ^ 0x4A;
        k.lIlllIll[25] = 0xAB ^ 0xA2;
        k.lIlllIll[26] = 0x86 ^ 0xA6 ^ (0xAB ^ 0x81);
        k.lIlllIll[27] = 86 + 56 - 57 + 59 ^ 0 + 147 - 144 + 152;
        k.lIlllIll[28] = 12 + 109 - 47 + 53 ^ (0xE6 ^ 0x95);
        k.lIlllIll[29] = 8 ^ 0x54 ^ (0x3C ^ 0x6D);
        k.lIlllIll[30] = 0xAA ^ 0xA4;
    }

    private static boolean lIIlllIllll(Object object) {
        return object != null;
    }

    static {
        k.lIIlllIIllI();
        k.lIIllIlllII();
    }

    private static boolean lIIlllIlIll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void Y() {
        void lIlIlllllIlIllI;
        WorldPoint lIlIlllllIlIIIl;
        WorldArea worldArea = new WorldArea(lIlllIll[0], lIlllIll[1], lIlllIll[2], lIlllIll[3], lIlllIll[4]);
        WorldPoint worldPoint = new WorldPoint(lIlllIll[5], lIlllIll[6], lIlllIll[4]);
        WorldPoint worldPoint2 = new WorldPoint(lIlllIll[7], lIlllIll[8], lIlllIll[4]);
        e.E();
        if (k.lIIlllIlIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lIlIlllllIlIlIl;
            WorldPoint worldPoint3 = new WorldPoint(lIlllIll[9], lIlllIll[10], lIlllIll[4]);
            WorldPoint worldPoint4 = new WorldPoint(lIlllIll[9], lIlllIll[11], lIlllIll[4]);
            if (!k.lIIlllIlIII(Players.getLocal().getWorldLocation().equals((Object)worldPoint3) ? 1 : 0) || k.lIIlllIlIIl(Players.getLocal().getWorldLocation().equals((Object)worldPoint4) ? 1 : 0)) {
                lIlIlllllIlIIIl = new WorldPoint(lIlllIll[12], lIlllIll[13], lIlllIll[4]);
                e.c(lIlIlllllIlIIIl);
                Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)lIlIlllllIlIIIl), (int)lIlllIll[14]);
                0;
            }
            AccBuilderBarrows.c = lIlllIlI[lIlllIll[4]];
            Movement.walkTo((WorldPoint)lIlIlllllIlIlIl);
            0;
            Time.sleepTicks((int)lIlllIll[15]);
            0;
        }
        List lIlIlllllIlIIll = Players.getAll(arg_0 -> k.a((WorldArea)lIlIlllllIlIllI, arg_0));
        if (k.lIIlllIlIIl(lIlIlllllIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && k.lIIlllIlIlI(lIlIlllllIlIIll.size(), lIlllIll[16])) {
            void lIlIlllllIlIlII;
            if (k.lIIlllIlIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIlllllIlIlII), lIlllIll[17])) {
                AccBuilderBarrows.c = lIlllIlI[lIlllIll[15]];
                Movement.walkTo((WorldPoint)lIlIlllllIlIlII);
                0;
                Time.sleepTicks((int)lIlllIll[15]);
                0;
            }
            if (k.lIIlllIllII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIlllllIlIlII), lIlllIll[17])) {
                AccBuilderBarrows.c = lIlllIlI[lIlllIll[17]];
                e.C();
            }
        }
        if (k.lIIlllIlIIl(lIlIlllllIlIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && k.lIIlllIllIl(lIlIlllllIlIIll.size(), lIlllIll[16])) {
            NPC lIlIlllllIlIIlI;
            if (k.lIIlllIlllI(k.lIIlllIIlll(e.v(), 55.0))) {
                int[] nArray = new int[lIlllIll[15]];
                nArray[k.lIlllIll[4]] = lIlllIll[18];
                if (k.lIIlllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIlllIll[15]];
                    nArray2[k.lIlllIll[4]] = lIlllIll[18];
                    Inventory.getFirst((int[])nArray2).interact(lIlllIlI[lIlllIll[19]]);
                    Time.sleepTicks((int)lIlllIll[15]);
                    0;
                }
            }
            if (k.lIIlllIllll(Players.getLocal().getInteracting())) {
                AccBuilderBarrows.c = lIlllIlI[lIlllIll[20]];
            }
            if (k.lIIlllIllll(Players.getLocal().getInteracting()) && k.lIIllllIIII(Players.getLocal().getHealthRatio(), lIlllIll[21])) {
                lIlIlllllIlIIlI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIlllIlIIl(nPC.getName().contains(lIlllIlI[lIlllIll[29]]) ? 1 : 0) && k.lIIllllIIlI(nPC.getInteracting(), Players.getLocal()) && k.lIIlllIlIII(nPC.isDead() ? 1 : 0)) {
                        n2 = lIlllIll[15];
                        0;
                        if (((0xA8 ^ 0x9B) & ~(3 ^ 0x30)) == 3) {
                            return ((0x10 ^ 1) & ~(0x5F ^ 0x4E)) != 0;
                        }
                    } else {
                        n2 = lIlllIll[4];
                    }
                    return n2 != 0;
                });
                if (k.lIIlllIllll(lIlIlllllIlIIlI)) {
                    lIlIlllllIlIIlI.interact(lIlllIlI[lIlllIll[22]]);
                    Time.sleepTicks((int)lIlllIll[17]);
                    0;
                    return;
                }
                lIlIlllllIlIIIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIlllIlIIl(nPC.getName().contains(lIlllIlI[lIlllIll[28]]) ? 1 : 0) && k.lIIllllIIIl(nPC.getInteracting()) && k.lIIlllIlIII(nPC.isDead() ? 1 : 0)) {
                        n2 = lIlllIll[15];
                        0;
                        if (-3 >= 0) {
                            return ((164 + 79 - 217 + 152 ^ 64 + 104 - 145 + 127) & (0x58 ^ 0x13 ^ (0x18 ^ 0x77) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIlllIll[4];
                    }
                    return n2 != 0;
                });
                if (k.lIIlllIllll(lIlIlllllIlIIIl) && k.lIIllllIIIl(lIlIlllllIlIIlI)) {
                    AccBuilderBarrows.c = lIlllIlI[lIlllIll[16]];
                    lIlIlllllIlIIIl.interact(lIlllIlI[lIlllIll[23]]);
                    Time.sleepTicks((int)lIlllIll[17]);
                    0;
                    return;
                }
            }
            if (k.lIIllllIIIl(Players.getLocal().getInteracting())) {
                lIlIlllllIlIIlI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIlllIlIIl(nPC.getName().contains(lIlllIlI[lIlllIll[27]]) ? 1 : 0) && k.lIIllllIIIl(nPC.getInteracting()) && k.lIIlllIlIII(nPC.isDead() ? 1 : 0)) {
                        n2 = lIlllIll[15];
                        0;
                        if (2 != 2) {
                            return ((0x8C ^ 0x8B) & ~(0x93 ^ 0x94)) != 0;
                        }
                    } else {
                        n2 = lIlllIll[4];
                    }
                    return n2 != 0;
                });
                lIlIlllllIlIIIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIlllIlIIl(nPC.getName().contains(lIlllIlI[lIlllIll[26]]) ? 1 : 0) && k.lIIllllIIlI(nPC.getInteracting(), Players.getLocal()) && k.lIIlllIlIII(nPC.isDead() ? 1 : 0)) {
                        n2 = lIlllIll[15];
                        0;
                        if ((100 + 107 - 95 + 36 ^ 113 + 112 - 200 + 119) <= 0) {
                            return ((0x89 ^ 0xA3 ^ (0x52 ^ 0x39)) & (0x93 ^ 0xBF ^ (0x2F ^ 0x42) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIlllIll[4];
                    }
                    return n2 != 0;
                });
                if (k.lIIlllIllll(lIlIlllllIlIIlI) && k.lIIllllIIIl(lIlIlllllIlIIIl)) {
                    AccBuilderBarrows.c = lIlllIlI[lIlllIll[24]];
                    lIlIlllllIlIIlI.interact(lIlllIlI[lIlllIll[25]]);
                    Time.sleepTicks((int)lIlllIll[17]);
                    0;
                }
            }
        }
    }

    private static boolean lIIllllIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIIllIlllII() {
        lIlllIlI = new String[lIlllIll[30]];
        k.lIlllIlI[k.lIlllIll[4]] = k."Nav to hill giants";
        k.lIlllIlI[k.lIlllIll[15]] = k."Run to hop tile";
        k.lIlllIlI[k.lIlllIll[17]] = k."World hopping";
        k.lIlllIlI[k.lIlllIll[19]] = k."Eat";
        k.lIlllIlI[k.lIlllIll[20]] = k."In combat";
        k.lIlllIlI[k.lIlllIll[22]] = k."Attack";
        k.lIlllIlI[k.lIlllIll[16]] = k."Attacking hill giant";
        k.lIlllIlI[k.lIlllIll[23]] = k."Attack";
        k.lIlllIlI[k.lIlllIll[24]] = k."Attacking hill giant";
        k.lIlllIlI[k.lIlllIll[25]] = k."Attack";
        k.lIlllIlI[k.lIlllIll[26]] = k."Hill";
        k.lIlllIlI[k.lIlllIll[27]] = k."Hill";
        k.lIlllIlI[k.lIlllIll[28]] = k."Hill";
        k.lIlllIlI[k.lIlllIll[29]] = k."Hill";
    }

    private static int lIIlllIIlll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIlllIlIIl(int n2) {
        return n2 != 0;
    }
}

