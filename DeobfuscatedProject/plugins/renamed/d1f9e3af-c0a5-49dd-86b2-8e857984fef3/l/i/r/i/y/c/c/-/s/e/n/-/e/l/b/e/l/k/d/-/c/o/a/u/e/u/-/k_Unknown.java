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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown;
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

public class k_Unknown {
    private static /* synthetic */ int[] lIllIlIlI;
    private static /* synthetic */ String[] lIllIlIIl;

    private static boolean lIIllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, Player player) {
        return worldArea.contains((Locatable)player);
    }

    private static String lIIlIllllllI(String llIlIlllIlllll, String llIlIlllIlllII) {
        try {
            SecretKeySpec llIlIllllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIlllIlllII.getBytes(StandardCharsets.UTF_8)), lIllIlIlI[24]), "DES");
            Cipher llIlIllllIIIIl = Cipher.getInstance("DES");
            llIlIllllIIIIl.init(lIllIlIlI[17], llIlIllllIIIlI);
            return new String(llIlIllllIIIIl.doFinal(Base64.getDecoder().decode(llIlIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIllllIIIII) {
            llIlIllllIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlIlll(Object object) {
        return object == null;
    }

    static {
        k.lIIllIIIllII();
        k.lIIllIIIlIll();
    }

    private static void lIIllIIIlIll() {
        lIllIlIIl = new String[lIllIlIlI[30]];
        k.lIllIlIIl[k.lIllIlIlI[4]] = k."Nav to hill giants";
        k.lIllIlIIl[k.lIllIlIlI[15]] = k."Run to hop tile";
        k.lIllIlIIl[k.lIllIlIlI[17]] = k."World hopping";
        k.lIllIlIIl[k.lIllIlIlI[19]] = k."Eat";
        k.lIllIlIIl[k.lIllIlIlI[20]] = k."In combat";
        k.lIllIlIIl[k.lIllIlIlI[22]] = k."Attack";
        k.lIllIlIIl[k.lIllIlIlI[16]] = k."Attacking hill giant";
        k.lIllIlIIl[k.lIllIlIlI[23]] = k."Attack";
        k.lIllIlIIl[k.lIllIlIlI[24]] = k."Attacking hill giant";
        k.lIllIlIIl[k.lIllIlIlI[25]] = k."Attack";
        k.lIllIlIIl[k.lIllIlIlI[26]] = k."Hill";
        k.lIllIlIIl[k.lIllIlIlI[27]] = k."Hill";
        k.lIllIlIIl[k.lIllIlIlI[28]] = k."Hill";
        k.lIllIlIIl[k.lIllIlIlI[29]] = k."Hill";
    }

    private static boolean lIIllIIllIII(Object object, Object object2) {
        return object == object2;
    }

    private static String lIIlIlllllll(String llIlIllllIlIlI, String llIlIllllIlIIl) {
        try {
            SecretKeySpec llIlIllllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIllllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIllllIlllI = Cipher.getInstance("Blowfish");
            llIlIllllIlllI.init(lIllIlIlI[17], llIlIllllIllll);
            return new String(llIlIllllIlllI.doFinal(Base64.getDecoder().decode(llIlIllllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIllllIllIl) {
            llIlIllllIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIlIlIl(Object object) {
        return object != null;
    }

    private static String lIIllIIIlIlI(String llIllIIIIIIIIl, String llIllIIIIIIIII) {
        llIllIIIIIIIIl = new String(Base64.getDecoder().decode(llIllIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIlllllllll = new StringBuilder();
        char[] llIlIllllllllI = llIllIIIIIIIII.toCharArray();
        int llIlIlllllllIl = lIllIlIlI[4];
        char[] llIlIlllllIlll = llIllIIIIIIIIl.toCharArray();
        int llIlIlllllIllI = llIlIlllllIlll.length;
        int llIlIlllllIlIl = lIllIlIlI[4];
        while (k.lIIllIIlIIll(llIlIlllllIlIl, llIlIlllllIllI)) {
            char llIllIIIIIIIlI = llIlIlllllIlll[llIlIlllllIlIl];
            llIlIlllllllll.append((char)(llIllIIIIIIIlI ^ llIlIllllllllI[llIlIlllllllIl % llIlIllllllllI.length]));
            0;
            ++llIlIlllllllIl;
            ++llIlIlllllIlIl;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(llIlIlllllllll);
    }

    private static boolean lIIllIIIlllI(int n2) {
        return n2 == 0;
    }

    private static int lIIllIIIllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIllIIlIIII(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void X() {
        void llIllIIIIllIIl;
        WorldPoint llIllIIIIlIlII;
        WorldArea worldArea = new WorldArea(lIllIlIlI[0], lIllIlIlI[1], lIllIlIlI[2], lIllIlIlI[3], lIllIlIlI[4]);
        WorldPoint worldPoint = new WorldPoint(lIllIlIlI[5], lIllIlIlI[6], lIllIlIlI[4]);
        WorldPoint worldPoint2 = new WorldPoint(lIllIlIlI[7], lIllIlIlI[8], lIllIlIlI[4]);
        e.D();
        if (k.lIIllIIIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void llIllIIIIllIII;
            WorldPoint worldPoint3 = new WorldPoint(lIllIlIlI[9], lIllIlIlI[10], lIllIlIlI[4]);
            WorldPoint worldPoint4 = new WorldPoint(lIllIlIlI[9], lIllIlIlI[11], lIllIlIlI[4]);
            if (!k.lIIllIIIlllI(Players.getLocal().getWorldLocation().equals((Object)worldPoint3) ? 1 : 0) || k.lIIllIIIllll(Players.getLocal().getWorldLocation().equals((Object)worldPoint4) ? 1 : 0)) {
                llIllIIIIlIlII = new WorldPoint(lIllIlIlI[12], lIllIlIlI[13], lIllIlIlI[4]);
                e.c(llIllIIIIlIlII);
                Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)llIllIIIIlIlII), (int)lIllIlIlI[14]);
                0;
            }
            AccBuilderEasyClues.c = lIllIlIIl[lIllIlIlI[4]];
            Movement.walkTo((WorldPoint)llIllIIIIllIII);
            0;
            Time.sleepTicks((int)lIllIlIlI[15]);
            0;
        }
        List llIllIIIIlIllI = Players.getAll(arg_0 -> k.a((WorldArea)llIllIIIIllIIl, arg_0));
        if (k.lIIllIIIllll(llIllIIIIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && k.lIIllIIlIIII(llIllIIIIlIllI.size(), lIllIlIlI[16])) {
            void llIllIIIIlIlll;
            if (k.lIIllIIlIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIIlIlll), lIllIlIlI[17])) {
                AccBuilderEasyClues.c = lIllIlIIl[lIllIlIlI[15]];
                Movement.walkTo((WorldPoint)llIllIIIIlIlll);
                0;
                Time.sleepTicks((int)lIllIlIlI[15]);
                0;
            }
            if (k.lIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llIllIIIIlIlll), lIllIlIlI[17])) {
                AccBuilderEasyClues.c = lIllIlIIl[lIllIlIlI[17]];
                e.B();
            }
        }
        if (k.lIIllIIIllll(llIllIIIIllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && k.lIIllIIlIIll(llIllIIIIlIllI.size(), lIllIlIlI[16])) {
            NPC llIllIIIIlIlIl;
            if (k.lIIllIIlIlII(k.lIIllIIIllIl(e.u(), 55.0))) {
                int[] nArray = new int[lIllIlIlI[15]];
                nArray[k.lIllIlIlI[4]] = lIllIlIlI[18];
                if (k.lIIllIIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIllIlIlI[15]];
                    nArray2[k.lIllIlIlI[4]] = lIllIlIlI[18];
                    Inventory.getFirst((int[])nArray2).interact(lIllIlIIl[lIllIlIlI[19]]);
                    Time.sleepTicks((int)lIllIlIlI[15]);
                    0;
                }
            }
            if (k.lIIllIIlIlIl(Players.getLocal().getInteracting())) {
                AccBuilderEasyClues.c = lIllIlIIl[lIllIlIlI[20]];
            }
            if (k.lIIllIIlIlIl(Players.getLocal().getInteracting()) && k.lIIllIIlIllI(Players.getLocal().getHealthRatio(), lIllIlIlI[21])) {
                llIllIIIIlIlIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIllIIIllll(nPC.getName().contains(lIllIlIIl[lIllIlIlI[29]]) ? 1 : 0) && k.lIIllIIllIII(nPC.getInteracting(), Players.getLocal()) && k.lIIllIIIlllI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIllIlIlI[15];
                        0;
                        if (((0x34 ^ 3 ^ (0x6F ^ 0x1A)) & (0x12 ^ 0x5A ^ (0x50 ^ 0x5A) ^ -1)) > (58 + 133 - 185 + 186 ^ 193 + 80 - 126 + 49)) {
                            return ((0xC5 ^ 0xA6 ^ (0x73 ^ 0xA)) & (0x45 ^ 0x3F ^ (0x24 ^ 0x44) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIllIlIlI[4];
                    }
                    return n2 != 0;
                });
                if (k.lIIllIIlIlIl(llIllIIIIlIlIl)) {
                    llIllIIIIlIlIl.interact(lIllIlIIl[lIllIlIlI[22]]);
                    Time.sleepTicks((int)lIllIlIlI[17]);
                    0;
                    return;
                }
                llIllIIIIlIlII = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIllIIIllll(nPC.getName().contains(lIllIlIIl[lIllIlIlI[28]]) ? 1 : 0) && k.lIIllIIlIlll(nPC.getInteracting()) && k.lIIllIIIlllI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIllIlIlI[15];
                        0;
                        if (1 >= 2) {
                            return false;
                        }
                    } else {
                        n2 = lIllIlIlI[4];
                    }
                    return n2 != 0;
                });
                if (k.lIIllIIlIlIl(llIllIIIIlIlII) && k.lIIllIIlIlll(llIllIIIIlIlIl)) {
                    AccBuilderEasyClues.c = lIllIlIIl[lIllIlIlI[16]];
                    llIllIIIIlIlII.interact(lIllIlIIl[lIllIlIlI[23]]);
                    Time.sleepTicks((int)lIllIlIlI[17]);
                    0;
                    return;
                }
            }
            if (k.lIIllIIlIlll(Players.getLocal().getInteracting())) {
                llIllIIIIlIlIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIllIIIllll(nPC.getName().contains(lIllIlIIl[lIllIlIlI[27]]) ? 1 : 0) && k.lIIllIIlIlll(nPC.getInteracting()) && k.lIIllIIIlllI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIllIlIlI[15];
                        0;
                        if (-2 > 0) {
                            return ((7 ^ 0x47 ^ (0x59 ^ 0x37)) & (0xA7 ^ 0x99 ^ (0x16 ^ 6) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIllIlIlI[4];
                    }
                    return n2 != 0;
                });
                llIllIIIIlIlII = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIllIIIllll(nPC.getName().contains(lIllIlIIl[lIllIlIlI[26]]) ? 1 : 0) && k.lIIllIIllIII(nPC.getInteracting(), Players.getLocal()) && k.lIIllIIIlllI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIllIlIlI[15];
                        0;
                        
                        }
                    } else {
                        n2 = lIllIlIlI[4];
                    }
                    return n2 != 0;
                });
                if (k.lIIllIIlIlIl(llIllIIIIlIlIl) && k.lIIllIIlIlll(llIllIIIIlIlII)) {
                    AccBuilderEasyClues.c = lIllIlIIl[lIllIlIlI[24]];
                    llIllIIIIlIlIl.interact(lIllIlIIl[lIllIlIlI[25]]);
                    Time.sleepTicks((int)lIllIlIlI[17]);
                    0;
                }
            }
        }
    }

    private static boolean lIIllIIlIlII(int n2) {
        return n2 < 0;
    }

    private static boolean lIIllIIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllIIIllll(int n2) {
        return n2 != 0;
    }

    private static void lIIllIIIllII() {
        lIllIlIlI = new int[31];
        k.lIllIlIlI[0] = 0xFFFFAFFB & 0x5D1F;
        k.lIllIlIlI[1] = 0xFFFFCF3F & 0x3CFB;
        k.lIllIlIlI[2] = 0x52 ^ 0x74;
        k.lIllIlIlI[3] = 29 + 108 - 34 + 47 ^ 117 + 16 - 109 + 153;
        k.lIllIlIlI[4] = (131 + 39 - 10 + 33 ^ 124 + 86 - 137 + 69) & (0x60 ^ 0x44 ^ (0xEE ^ 0x85) ^ -1);
        k.lIllIlIlI[5] = -(0xFFFFFFFB & 0x32CF) & (0xFFFFBFFF & 0x7FFB);
        k.lIllIlIlI[6] = 0xFFFFEE4F & 0x1DFE;
        k.lIllIlIlI[7] = 0xFFFFDFFF & 0x2D2A;
        k.lIllIlIlI[8] = 0xFFFF8F5E & 0x7CFF;
        k.lIllIlIlI[9] = -(0xFFFFD7AB & 0x385E) & (0xFFFFBDCF & 0x5EFD);
        k.lIllIlIlI[10] = -(0xFFFFEB22 & 0x76FF) & (0xFFFFFEFD & 0x6FBF);
        k.lIllIlIlI[11] = 0xFFFFDC9F & 0x2FFB;
        k.lIllIlIlI[12] = -(0xFFFFB6F3 & 0x6B2D) & (0xFFFFEFEF & 0x3EFE);
        k.lIllIlIlI[13] = 0xFFFFFFBB & 0xCDE;
        k.lIllIlIlI[14] = 0xFFFFB59F & 0x5BF4;
        k.lIllIlIlI[15] = 1;
        k.lIllIlIlI[16] = 99 + 170 - 219 + 141 ^ 122 + 107 - 189 + 145;
        k.lIllIlIlI[17] = 2;
        k.lIllIlIlI[18] = -(0xFFFFEEB3 & 0x1B4D) & (0xFFFFFBFF & 0xF7B);
        k.lIllIlIlI[19] = 3;
        k.lIllIlIlI[20] = 0xC1 ^ 0xBB ^ (0x51 ^ 0x2F);
        k.lIllIlIlI[21] = -1;
        k.lIllIlIlI[22] = 0xBE ^ 0xBB;
        k.lIllIlIlI[23] = 132 + 6 - 112 + 119 ^ 29 + 12 - 39 + 148;
        k.lIllIlIlI[24] = 0x8A ^ 0x82;
        k.lIllIlIlI[25] = 121 + 178 - 284 + 172 ^ 84 + 1 - 43 + 136;
        k.lIllIlIlI[26] = 0x93 ^ 0x99;
        k.lIllIlIlI[27] = 0xCD ^ 0xC6;
        k.lIllIlIlI[28] = 140 + 11 - 33 + 27 ^ 123 + 48 - 165 + 151;
        k.lIllIlIlI[29] = 0x4E ^ 0x43;
        k.lIllIlIlI[30] = 0x73 ^ 0x23 ^ (0x6F ^ 0x31);
    }

    private static boolean lIIllIIlIIlI(int n2, int n3) {
        return n2 <= n3;
    }
}

