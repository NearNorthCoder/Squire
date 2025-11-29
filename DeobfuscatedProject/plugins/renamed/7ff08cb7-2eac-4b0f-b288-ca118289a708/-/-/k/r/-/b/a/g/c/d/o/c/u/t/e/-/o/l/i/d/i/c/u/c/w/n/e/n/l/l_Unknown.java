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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e_Unknown;
import gg.squire.account.AccBuilderGWD;
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

public class l_Unknown {
    private static /* synthetic */ int[] lllllIIll;
    private static /* synthetic */ String[] lllllIIlI;

    private static void llIlIIlllIII() {
        lllllIIll = new int[31];
        l.lllllIIll[0] = 0xFFFFFDDF & 0xF3B;
        l.lllllIIll[1] = 0xFFFFCEBB & 0x3D7F;
        l.lllllIIll[2] = 33 + 22 - 40 + 133 ^ 60 + 87 - -11 + 20;
        l.lllllIIll[3] = 0x2E ^ 0x46 ^ (8 ^ 0x47);
        l.lllllIIll[4] = (22 + 19 - 34 + 169 ^ 88 + 70 - 144 + 128) & (0x1D ^ 0x38 ^ (0x4E ^ 0x55) ^ -1);
        l.lllllIIll[5] = -(0xFFFFF6D5 & 0x4B2F) & (0xFFFFEFFD & 0x5F37);
        l.lllllIIll[6] = -(0xFFFFD6BE & 0x7973) & (0xFFFFDDFF & 0x7E7F);
        l.lllllIIll[7] = 0xFFFFDD3E & 0x2FEB;
        l.lllllIIll[8] = 0xFFFFFFDE & 0xC7F;
        l.lllllIIll[9] = -(0xFFFFAB7B & 0x759F) & (0xFFFFFFDF & 0x2DFE);
        l.lllllIIll[10] = -(0xFFFFF3EC & 0x5F17) & (0xFFFFFFDF & 0x5FBF);
        l.lllllIIll[11] = -(0xFFFFCBDF & 0x3625) & (0xFFFFDEDF & 0x2FBF);
        l.lllllIIll[12] = 0xFFFFCDDE & 0x3EEF;
        l.lllllIIll[13] = -(0xFFFFFB21 & 0x36FF) & (0xFFFFFFFB & 0x3EBE);
        l.lllllIIll[14] = -(0xFFFFE67A & 0x7FAF) & (0xFFFFFFBD & 0x77FF);
        l.lllllIIll[15] = 1;
        l.lllllIIll[16] = 0x2C ^ 2 ^ (0xB3 ^ 0x9B);
        l.lllllIIll[17] = 2;
        l.lllllIIll[18] = -(0xFFFFAB21 & 0x7EDF) & (0xFFFFAFFF & 0x7B7B);
        l.lllllIIll[19] = 3;
        l.lllllIIll[20] = 0x99 ^ 0xA1 ^ (0x17 ^ 0x2B);
        l.lllllIIll[21] = -1;
        l.lllllIIll[22] = 119 + 82 - 197 + 148 ^ 144 + 32 - 148 + 129;
        l.lllllIIll[23] = 0x71 ^ 0x26 ^ (0xA ^ 0x5A);
        l.lllllIIll[24] = 0xB3 ^ 0xB4 ^ (0x9A ^ 0x95);
        l.lllllIIll[25] = 0x93 ^ 0x9A;
        l.lllllIIll[26] = 0x1C ^ 0x16;
        l.lllllIIll[27] = 0x57 ^ 0x5C;
        l.lllllIIll[28] = 0x29 ^ 0x25;
        l.lllllIIll[29] = 0x86 ^ 0x8B;
        l.lllllIIll[30] = 55 + 44 - 67 + 139 ^ 11 + 120 - 92 + 126;
    }

    private static String llIlIIllIllI(String lIllIlIlIIIlI, String lIllIlIIlllll) {
        try {
            SecretKeySpec lIllIlIlIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIllIlIIlllll.getBytes(StandardCharsets.UTF_8)), lllllIIll[24]), "DES");
            Cipher lIllIlIlIIlII = Cipher.getInstance("DES");
            lIllIlIlIIlII.init(lllllIIll[17], lIllIlIlIIlIl);
            return new String(lIllIlIlIIlII.doFinal(Base64.getDecoder().decode(lIllIlIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIlIlIIIll) {
            lIllIlIlIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIlllIll(int n2) {
        return n2 != 0;
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, Player player) {
        return worldArea.contains((Locatable)player);
    }

    private static boolean llIlIIllllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIlIIIIII(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIlIIIIIl(Object object) {
        return object != null;
    }

    private static boolean llIlIIllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlIIIIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIlIlIIIIll(Object object) {
        return object == null;
    }

    private static String llIlIIllIlIl(String lIllIIllllIll, String lIllIIllllIlI) {
        try {
            SecretKeySpec lIllIlIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIIllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIIlllllll = Cipher.getInstance("Blowfish");
            lIllIIlllllll.init(lllllIIll[17], lIllIlIIIIIII);
            return new String(lIllIIlllllll.doFinal(Base64.getDecoder().decode(lIllIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIllIIllllllI) {
            lIllIIllllllI.printStackTrace();
            return null;
        }
    }

    static {
        l.llIlIIlllIII();
        l.llIlIIllIlll();
    }

    private static boolean llIlIlIIIlII(Object object, Object object2) {
        return object == object2;
    }

    private static String llIlIIllIlII(String lIllIlIIIllIl, String lIllIlIIlIIIl) {
        lIllIlIIIllIl = new String(Base64.getDecoder().decode(lIllIlIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIlIIlIIII = new StringBuilder();
        char[] lIllIlIIIllll = lIllIlIIlIIIl.toCharArray();
        int lIllIlIIIlllI = lllllIIll[4];
        char[] lIllIlIIIlIII = lIllIlIIIllIl.toCharArray();
        int lIllIlIIIIlll = lIllIlIIIlIII.length;
        int lIllIlIIIIllI = lllllIIll[4];
        while (l.llIlIIllllll(lIllIlIIIIllI, lIllIlIIIIlll)) {
            char lIllIlIIlIIll = lIllIlIIIlIII[lIllIlIIIIllI];
            lIllIlIIlIIII.append((char)(lIllIlIIlIIll ^ lIllIlIIIllll[lIllIlIIIlllI % lIllIlIIIllll.length]));
            0;
            ++lIllIlIIIlllI;
            ++lIllIlIIIIllI;
            0;
            if (((0x38 ^ 0x66) & ~(0x26 ^ 0x78)) > -1) continue;
            return null;
        }
        return String.valueOf(lIllIlIIlIIII);
    }

    private static boolean llIlIIlllIlI(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void aj() {
        void lIllIlIllIlll;
        WorldPoint lIllIlIllIIlI;
        WorldArea worldArea = new WorldArea(lllllIIll[0], lllllIIll[1], lllllIIll[2], lllllIIll[3], lllllIIll[4]);
        WorldPoint worldPoint = new WorldPoint(lllllIIll[5], lllllIIll[6], lllllIIll[4]);
        WorldPoint worldPoint2 = new WorldPoint(lllllIIll[7], lllllIIll[8], lllllIIll[4]);
        e.F();
        if (l.llIlIIlllIlI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lIllIlIllIllI;
            WorldPoint worldPoint3 = new WorldPoint(lllllIIll[9], lllllIIll[10], lllllIIll[4]);
            WorldPoint worldPoint4 = new WorldPoint(lllllIIll[9], lllllIIll[11], lllllIIll[4]);
            if (!l.llIlIIlllIlI(Players.getLocal().getWorldLocation().equals((Object)worldPoint3) ? 1 : 0) || l.llIlIIlllIll(Players.getLocal().getWorldLocation().equals((Object)worldPoint4) ? 1 : 0)) {
                lIllIlIllIIlI = new WorldPoint(lllllIIll[12], lllllIIll[13], lllllIIll[4]);
                e.c(lIllIlIllIIlI);
                Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)lIllIlIllIIlI), (int)lllllIIll[14]);
                0;
            }
            AccBuilderGWD.c = lllllIIlI[lllllIIll[4]];
            Movement.walkTo((WorldPoint)lIllIlIllIllI);
            0;
            Time.sleepTicks((int)lllllIIll[15]);
            0;
        }
        List lIllIlIllIlII = Players.getAll(arg_0 -> l.a((WorldArea)lIllIlIllIlll, arg_0));
        if (l.llIlIIlllIll(lIllIlIllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && l.llIlIIllllII(lIllIlIllIlII.size(), lllllIIll[16])) {
            void lIllIlIllIlIl;
            if (l.llIlIIllllIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIllIlIllIlIl), lllllIIll[17])) {
                AccBuilderGWD.c = lllllIIlI[lllllIIll[15]];
                Movement.walkTo((WorldPoint)lIllIlIllIlIl);
                0;
                Time.sleepTicks((int)lllllIIll[15]);
                0;
            }
            if (l.llIlIIlllllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIllIlIllIlIl), lllllIIll[17])) {
                AccBuilderGWD.c = lllllIIlI[lllllIIll[17]];
                e.D();
            }
        }
        if (l.llIlIIlllIll(lIllIlIllIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && l.llIlIIllllll(lIllIlIllIlII.size(), lllllIIll[16])) {
            NPC lIllIlIllIIll;
            if (l.llIlIlIIIIII(l.llIlIIlllIIl(e.w(), 55.0))) {
                int[] nArray = new int[lllllIIll[15]];
                nArray[l.lllllIIll[4]] = lllllIIll[18];
                if (l.llIlIIlllIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lllllIIll[15]];
                    nArray2[l.lllllIIll[4]] = lllllIIll[18];
                    Inventory.getFirst((int[])nArray2).interact(lllllIIlI[lllllIIll[19]]);
                    Time.sleepTicks((int)lllllIIll[15]);
                    0;
                }
            }
            if (l.llIlIlIIIIIl(Players.getLocal().getInteracting())) {
                AccBuilderGWD.c = lllllIIlI[lllllIIll[20]];
            }
            if (l.llIlIlIIIIIl(Players.getLocal().getInteracting()) && l.llIlIlIIIIlI(Players.getLocal().getHealthRatio(), lllllIIll[21])) {
                lIllIlIllIIll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.llIlIIlllIll(nPC.getName().contains(lllllIIlI[lllllIIll[29]]) ? 1 : 0) && l.llIlIlIIIlII(nPC.getInteracting(), Players.getLocal()) && l.llIlIIlllIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = lllllIIll[15];
                        0;
                        
                        }
                    } else {
                        n2 = lllllIIll[4];
                    }
                    return n2 != 0;
                });
                if (l.llIlIlIIIIIl(lIllIlIllIIll)) {
                    lIllIlIllIIll.interact(lllllIIlI[lllllIIll[22]]);
                    Time.sleepTicks((int)lllllIIll[17]);
                    0;
                    return;
                }
                lIllIlIllIIlI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.llIlIIlllIll(nPC.getName().contains(lllllIIlI[lllllIIll[28]]) ? 1 : 0) && l.llIlIlIIIIll(nPC.getInteracting()) && l.llIlIIlllIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = lllllIIll[15];
                        0;
                        if (((0xB0 ^ 0x8C) & ~(2 ^ 0x3E)) != 0) {
                            return false;
                        }
                    } else {
                        n2 = lllllIIll[4];
                    }
                    return n2 != 0;
                });
                if (l.llIlIlIIIIIl(lIllIlIllIIlI) && l.llIlIlIIIIll(lIllIlIllIIll)) {
                    AccBuilderGWD.c = lllllIIlI[lllllIIll[16]];
                    lIllIlIllIIlI.interact(lllllIIlI[lllllIIll[23]]);
                    Time.sleepTicks((int)lllllIIll[17]);
                    0;
                    return;
                }
            }
            if (l.llIlIlIIIIll(Players.getLocal().getInteracting())) {
                lIllIlIllIIll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.llIlIIlllIll(nPC.getName().contains(lllllIIlI[lllllIIll[27]]) ? 1 : 0) && l.llIlIlIIIIll(nPC.getInteracting()) && l.llIlIIlllIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = lllllIIll[15];
                        0;
                        if (-1 > -1) {
                            return (3 & (3 ^ -1)) != 0;
                        }
                    } else {
                        n2 = lllllIIll[4];
                    }
                    return n2 != 0;
                });
                lIllIlIllIIlI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (l.llIlIIlllIll(nPC.getName().contains(lllllIIlI[lllllIIll[26]]) ? 1 : 0) && l.llIlIlIIIlII(nPC.getInteracting(), Players.getLocal()) && l.llIlIIlllIlI(nPC.isDead() ? 1 : 0)) {
                        n2 = lllllIIll[15];
                        0;
                        if ((0x32 ^ 0x36) == 1) {
                            return false;
                        }
                    } else {
                        n2 = lllllIIll[4];
                    }
                    return n2 != 0;
                });
                if (l.llIlIlIIIIIl(lIllIlIllIIll) && l.llIlIlIIIIll(lIllIlIllIIlI)) {
                    AccBuilderGWD.c = lllllIIlI[lllllIIll[24]];
                    lIllIlIllIIll.interact(lllllIIlI[lllllIIll[25]]);
                    Time.sleepTicks((int)lllllIIll[17]);
                    0;
                }
            }
        }
    }

    private static boolean llIlIIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIIlllllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static void llIlIIllIlll() {
        lllllIIlI = new String[lllllIIll[30]];
        l.lllllIIlI[l.lllllIIll[4]] = l."Nav to hill giants";
        l.lllllIIlI[l.lllllIIll[15]] = l."Run to hop tile";
        l.lllllIIlI[l.lllllIIll[17]] = l."World hopping";
        l.lllllIIlI[l.lllllIIll[19]] = l."Eat";
        l.lllllIIlI[l.lllllIIll[20]] = l."In combat";
        l.lllllIIlI[l.lllllIIll[22]] = l."Attack";
        l.lllllIIlI[l.lllllIIll[16]] = l."Attacking hill giant";
        l.lllllIIlI[l.lllllIIll[23]] = l."Attack";
        l.lllllIIlI[l.lllllIIll[24]] = l."Attacking hill giant";
        l.lllllIIlI[l.lllllIIll[25]] = l."Attack";
        l.lllllIIlI[l.lllllIIll[26]] = l."Hill";
        l.lllllIIlI[l.lllllIIll[27]] = l."Hill";
        l.lllllIIlI[l.lllllIIll[28]] = l."Hill";
        l.lllllIIlI[l.lllllIIll[29]] = l."Hill";
    }

    private static int llIlIIlllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

