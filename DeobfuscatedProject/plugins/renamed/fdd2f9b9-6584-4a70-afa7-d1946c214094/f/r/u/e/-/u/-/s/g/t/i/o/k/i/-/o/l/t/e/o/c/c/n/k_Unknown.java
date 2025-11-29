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
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e_Unknown;
import gg.squire.account.AccBuilderRogues;
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

public class k_Unknown {
    private static /* synthetic */ int[] lIIllIlIII;
    private static /* synthetic */ String[] lIIllIIlll;

    private static String lIIIIIIlllIlI(String var24, String var15) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), lIIllIlIII[24]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIIllIlIII[17], var23);
            return new String(var8.doFinal(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIlIIIlIl(Object object) {
        return object != null;
    }

    private static String lIIIIIIlllIII(String var12, String var16) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var10 = var16.toCharArray();
        int var19 = lIIllIlIII[4];
        char[] var3 = var12.toCharArray();
        int var9 = var3.length;
        int var13 = lIIllIlIII[4];
        while (k.lIIIIIlIIIIll(var13, var9)) {
            char var21 = var3[var13];
            var6.append((char)(var21 ^ var10[var19 % var10.length]));
            0;
            ++var19;
            ++var13;
            0;
            if (3 >= -1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean lIIIIIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIIIlIIIllI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void X() {
        void var14;
        WorldPoint var7;
        WorldArea worldArea = new WorldArea(lIIllIlIII[0], lIIllIlIII[1], lIIllIlIII[2], lIIllIlIII[3], lIIllIlIII[4]);
        WorldPoint worldPoint = new WorldPoint(lIIllIlIII[5], lIIllIlIII[6], lIIllIlIII[4]);
        WorldPoint worldPoint2 = new WorldPoint(lIIllIlIII[7], lIIllIlIII[8], lIIllIlIII[4]);
        e.D();
        if (k.lIIIIIIlllllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var5;
            WorldPoint worldPoint3 = new WorldPoint(lIIllIlIII[9], lIIllIlIII[10], lIIllIlIII[4]);
            WorldPoint worldPoint4 = new WorldPoint(lIIllIlIII[9], lIIllIlIII[11], lIIllIlIII[4]);
            if (!k.lIIIIIIlllllI(Players.getLocal().getWorldLocation().equals((Object)worldPoint3) ? 1 : 0) || k.lIIIIIIllllll(Players.getLocal().getWorldLocation().equals((Object)worldPoint4) ? 1 : 0)) {
                var7 = new WorldPoint(lIIllIlIII[12], lIIllIlIII[13], lIIllIlIII[4]);
                e.c(var7);
                Time.sleepUntil(() -> Players.getLocal().getWorldLocation().equals((Object)var7), (int)lIIllIlIII[14]);
                0;
            }
            AccBuilderRogues.c = lIIllIIlll[lIIllIlIII[4]];
            Movement.walkTo((WorldPoint)var5);
            0;
            Time.sleepTicks((int)lIIllIlIII[15]);
            0;
        }
        List var1 = Players.getAll(arg_0 -> k.a((WorldArea)var14, arg_0));
        if (k.lIIIIIIllllll(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && k.lIIIIIlIIIIII(var1.size(), lIIllIlIII[16])) {
            void var4;
            if (k.lIIIIIlIIIIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var4), lIIllIlIII[17])) {
                AccBuilderRogues.c = lIIllIIlll[lIIllIlIII[15]];
                Movement.walkTo((WorldPoint)var4);
                0;
                Time.sleepTicks((int)lIIllIlIII[15]);
                0;
            }
            if (k.lIIIIIlIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var4), lIIllIlIII[17])) {
                AccBuilderRogues.c = lIIllIIlll[lIIllIlIII[17]];
                e.B();
            }
        }
        if (k.lIIIIIIllllll(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && k.lIIIIIlIIIIll(var1.size(), lIIllIlIII[16])) {
            NPC var25;
            if (k.lIIIIIlIIIlII(k.lIIIIIIllllIl(e.u(), 55.0))) {
                int[] nArray = new int[lIIllIlIII[15]];
                nArray[k.lIIllIlIII[4]] = lIIllIlIII[18];
                if (k.lIIIIIIllllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIllIlIII[15]];
                    nArray2[k.lIIllIlIII[4]] = lIIllIlIII[18];
                    Inventory.getFirst((int[])nArray2).interact(lIIllIIlll[lIIllIlIII[19]]);
                    Time.sleepTicks((int)lIIllIlIII[15]);
                    0;
                }
            }
            if (k.lIIIIIlIIIlIl(Players.getLocal().getInteracting())) {
                AccBuilderRogues.c = lIIllIIlll[lIIllIlIII[20]];
            }
            if (k.lIIIIIlIIIlIl(Players.getLocal().getInteracting()) && k.lIIIIIlIIIllI(Players.getLocal().getHealthRatio(), lIIllIlIII[21])) {
                var25 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIIIIIllllll(nPC.getName().contains(lIIllIIlll[lIIllIlIII[29]]) ? 1 : 0) && k.lIIIIIlIIlIII(nPC.getInteracting(), Players.getLocal()) && k.lIIIIIIlllllI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIIllIlIII[15];
                        0;
                        if (((54 + 38 - -35 + 59 ^ 121 + 40 - 129 + 123) & (0x7E ^ 2 ^ (0xCC ^ 0x91) ^ -1)) >= 3) {
                            return ((123 + 213 - 200 + 113 ^ 2 + 41 - -8 + 122) & (0x5B ^ 0x75 ^ (0xC5 ^ 0xBF) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIIllIlIII[4];
                    }
                    return n2 != 0;
                });
                if (k.lIIIIIlIIIlIl(var25)) {
                    var25.interact(lIIllIIlll[lIIllIlIII[22]]);
                    Time.sleepTicks((int)lIIllIlIII[17]);
                    0;
                    return;
                }
                var7 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIIIIIllllll(nPC.getName().contains(lIIllIIlll[lIIllIlIII[28]]) ? 1 : 0) && k.lIIIIIlIIIlll(nPC.getInteracting()) && k.lIIIIIIlllllI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIIllIlIII[15];
                        0;
                        
                        }
                    } else {
                        n2 = lIIllIlIII[4];
                    }
                    return n2 != 0;
                });
                if (k.lIIIIIlIIIlIl(var7) && k.lIIIIIlIIIlll(var25)) {
                    AccBuilderRogues.c = lIIllIIlll[lIIllIlIII[16]];
                    var7.interact(lIIllIIlll[lIIllIlIII[23]]);
                    Time.sleepTicks((int)lIIllIlIII[17]);
                    0;
                    return;
                }
            }
            if (k.lIIIIIlIIIlll(Players.getLocal().getInteracting())) {
                var25 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIIIIIllllll(nPC.getName().contains(lIIllIIlll[lIIllIlIII[27]]) ? 1 : 0) && k.lIIIIIlIIIlll(nPC.getInteracting()) && k.lIIIIIIlllllI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIIllIlIII[15];
                        0;
                        if (3 == ((0x1F ^ 0x78 ^ (0x49 ^ 0xB)) & (0x49 ^ 0x79 ^ (0x4D ^ 0x58) ^ -1))) {
                            return ((0x59 ^ 0x28 ^ (0x50 ^ 0x72)) & (0x87 ^ 0xBF ^ (0xAB ^ 0xC0) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIIllIlIII[4];
                    }
                    return n2 != 0;
                });
                var7 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIIIIIllllll(nPC.getName().contains(lIIllIIlll[lIIllIlIII[26]]) ? 1 : 0) && k.lIIIIIlIIlIII(nPC.getInteracting(), Players.getLocal()) && k.lIIIIIIlllllI(nPC.isDead() ? 1 : 0)) {
                        n2 = lIIllIlIII[15];
                        0;
                        if (1 < 1) {
                            return ((0x68 ^ 0x50 ^ (8 ^ 0x62)) & (0x45 ^ 0x6A ^ (0x78 ^ 5) ^ -1)) != 0;
                        }
                    } else {
                        n2 = lIIllIlIII[4];
                    }
                    return n2 != 0;
                });
                if (k.lIIIIIlIIIlIl(var25) && k.lIIIIIlIIIlll(var7)) {
                    AccBuilderRogues.c = lIIllIIlll[lIIllIlIII[24]];
                    var25.interact(lIIllIIlll[lIIllIlIII[25]]);
                    Time.sleepTicks((int)lIIllIlIII[17]);
                    0;
                }
            }
        }
    }

    private static void lIIIIIIlllIll() {
        lIIllIIlll = new String[lIIllIlIII[30]];
        k.lIIllIIlll[k.lIIllIlIII[4]] = k."Nav to hill giants";
        k.lIIllIIlll[k.lIIllIlIII[15]] = k."Run to hop tile";
        k.lIIllIIlll[k.lIIllIlIII[17]] = k."World hopping";
        k.lIIllIIlll[k.lIIllIlIII[19]] = k."Eat";
        k.lIIllIIlll[k.lIIllIlIII[20]] = k."In combat";
        k.lIIllIIlll[k.lIIllIlIII[22]] = k."Attack";
        k.lIIllIIlll[k.lIIllIlIII[16]] = k."Attacking hill giant";
        k.lIIllIIlll[k.lIIllIlIII[23]] = k."Attack";
        k.lIIllIIlll[k.lIIllIlIII[24]] = k."Attacking hill giant";
        k.lIIllIIlll[k.lIIllIlIII[25]] = k."Attack";
        k.lIIllIIlll[k.lIIllIlIII[26]] = k."Hill";
        k.lIIllIIlll[k.lIIllIlIII[27]] = k."Hill";
        k.lIIllIIlll[k.lIIllIlIII[28]] = k."Hill";
        k.lIIllIIlll[k.lIIllIlIII[29]] = k."Hill";
    }

    private static boolean lIIIIIlIIIlll(Object object) {
        return object == null;
    }

    private static int lIIIIIIllllIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, Player player) {
        return worldArea.contains((Locatable)player);
    }

    private static void lIIIIIIllllII() {
        lIIllIlIII = new int[31];
        k.lIIllIlIII[0] = -(0xFFFFBAED & 0x5593) & (0xFFFFFDFB & 0x1F9F);
        k.lIIllIlIII[1] = 0xFFFFCF3F & 0x3CFB;
        k.lIIllIlIII[2] = 128 + 16 - 141 + 151 ^ 109 + 70 - 177 + 186;
        k.lIIllIlIII[3] = 6 ^ 0x43 ^ (0xD1 ^ 0xB3);
        k.lIIllIlIII[4] = (0x40 ^ 5) & ~(0xFB ^ 0xBE);
        k.lIIllIlIII[5] = -(0xFFFFFF1F & 0x30E3) & (0xFFFFBF37 & 0x7DFB);
        k.lIIllIlIII[6] = -(0x26 ^ 0x17) & (0xFFFFAEFE & 0x5D7F);
        k.lIIllIlIII[7] = 0xFFFFED2B & 0x1FFE;
        k.lIIllIlIII[8] = 0xFFFFCCFF & 0x3F5E;
        k.lIIllIlIII[9] = -(0xFFFFBB23 & 0x76FF) & (0xFFFFBEF7 & 0x7FEE);
        k.lIIllIlIII[10] = 0xFFFFBCDE & 0x4FBD;
        k.lIIllIlIII[11] = 0xFFFFCD9B & 0x3EFF;
        k.lIIllIlIII[12] = -(0xFFFFFB5B & 0x57B6) & (0xFFFFDFDF & Short.MAX_VALUE);
        k.lIIllIlIII[13] = -(0xFFFFDB1F & 0x77E6) & (0xFFFFFFBF & 0x5FDF);
        k.lIIllIlIII[14] = -(0xFFFFEF23 & 0x76FE) & (0xFFFFF7F5 & 0x7FBF);
        k.lIIllIlIII[15] = 1;
        k.lIIllIlIII[16] = 0x28 ^ 0x2E;
        k.lIIllIlIII[17] = 2;
        k.lIIllIlIII[18] = 0xFFFFEDFF & 0x137B;
        k.lIIllIlIII[19] = 3;
        k.lIIllIlIII[20] = 11 + 33 - -64 + 23 ^ 100 + 54 - 43 + 24;
        k.lIIllIlIII[21] = -1;
        k.lIIllIlIII[22] = 0x39 ^ 0x3C;
        k.lIIllIlIII[23] = 0 + 95 - -26 + 56 ^ 177 + 22 - 190 + 173;
        k.lIIllIlIII[24] = 0xB4 ^ 0x99 ^ (0xE6 ^ 0xC3);
        k.lIIllIlIII[25] = 0x49 ^ 0x40;
        k.lIIllIlIII[26] = 90 + 14 - -67 + 5 ^ 115 + 36 - 86 + 121;
        k.lIIllIlIII[27] = 0xA6 ^ 0xA1 ^ (0xBE ^ 0xB2);
        k.lIIllIlIII[28] = 0x9C ^ 0x90;
        k.lIIllIlIII[29] = 0x84 ^ 0x89;
        k.lIIllIlIII[30] = 0x7F ^ 0x71;
    }

    private static boolean lIIIIIlIIIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIIIIIlIIIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIIIIllllll(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIIIlIIIlII(int n2) {
        return n2 < 0;
    }

    private static boolean lIIIIIIlllllI(int n2) {
        return n2 == 0;
    }

    private static String lIIIIIIlllIIl(String var22, String var2) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIIllIlIII[17], var17);
            return new String(var11.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIlIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIIIlIIlIII(Object object, Object object2) {
        return object == object2;
    }

    static {
        k.lIIIIIIllllII();
        k.lIIIIIIlllIll();
    }
}

