/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.e;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

public class j
implements G {
    private static /* synthetic */ int[] lIIlIIlllI;
    private static /* synthetic */ String[] lIIlIIllIl;

    private static boolean lllllIlIllll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (j.lllllIlIllIl(Skills.getLevel((Skill)Skill.RANGED), lIIlIIlllI[39])) {
            bl = lIIlIIlllI[0];
            0;
            if (1 <= 0) {
                return ((0xA6 ^ 0xB9 ^ (0xDD ^ 0x94)) & (0xFB ^ 0xB6 ^ (0x3C ^ 0x27) ^ -1)) != 0;
            }
        } else {
            bl = lIIlIIlllI[1];
        }
        return bl;
    }

    private static boolean lllllIlIIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lllllIlIlllI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public String U() {
        return lIIlIIllIl[lIIlIIlllI[14]];
    }

    private static String lllllIIlllll(String var6, String var5) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var15 = var5.toCharArray();
        int var7 = lIIlIIlllI[1];
        char[] var8 = var6.toCharArray();
        int var14 = var8.length;
        int var9 = lIIlIIlllI[1];
        while (j.lllllIlIllll(var9, var14)) {
            char var12 = var8[var9];
            var23.append((char)(var12 ^ var15[var7 % var15.length]));
            0;
            ++var7;
            ++var9;
            0;
            if (((82 + 97 - 94 + 50 ^ 94 + 105 - 93 + 91) & (0x46 ^ 0x12 ^ (0x2C ^ 0x3A) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var23);
    }

    private static void lllllIlIIIlI() {
        lIIlIIllIl = new String[lIIlIIlllI[45]];
        j.lIIlIIllIl[j.lIIlIIlllI[1]] = j."Navigating to bank";
        j.lIIlIIllIl[j.lIIlIIlllI[0]] = j."Handling banking";
        j.lIIlIIllIl[j.lIIlIIlllI[10]] = j."Eat";
        j.lIIlIIllIl[j.lIIlIIlllI[20]] = j."Nav to souls";
        j.lIIlIIllIl[j.lIIlIIlllI[28]] = j."Soul Wars Portal";
        j.lIIlIIllIl[j.lIIlIIlllI[29]] = j."Enter";
        j.lIIlIIllIl[j.lIIlIIlllI[27]] = j."Climb-up";
        j.lIIlIIllIl[j.lIIlIIlllI[34]] = j."Fighting souls";
        j.lIIlIIllIl[j.lIIlIIlllI[35]] = j."Attacking soul";
        j.lIIlIIllIl[j.lIIlIIlllI[36]] = j."Attack";
        j.lIIlIIllIl[j.lIIlIIlllI[7]] = j."Attacking soull";
        j.lIIlIIllIl[j.lIIlIIlllI[13]] = j."Attack";
        j.lIIlIIllIl[j.lIIlIIlllI[37]] = j."In combat";
        j.lIIlIIllIl[j.lIIlIIlllI[14]] = j."Forgotten Souls";
        j.lIIlIIllIl[j.lIIlIIlllI[40]] = j."Soul";
        j.lIIlIIllIl[j.lIIlIIlllI[41]] = j."Attack";
        j.lIIlIIllIl[j.lIIlIIlllI[42]] = j."Soul";
        j.lIIlIIllIl[j.lIIlIIlllI[43]] = j."Attack";
        j.lIIlIIllIl[j.lIIlIIlllI[44]] = j."Staircase";
    }

    private static boolean lllllIlIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lllllIlIIIII(String var10, String var3) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIIlIIlllI[35]), "DES");
            Cipher var22 = Cipher.getInstance("DES");
            var22.init(lIIlIIlllI[10], var19);
            return new String(var22.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private static void lllllIlIIIll() {
        lIIlIIlllI = new int[46];
        j.lIIlIIlllI[0] = 1;
        j.lIIlIIlllI[1] = 3 & (3 ^ -1);
        j.lIIlIIlllI[2] = 0xFFFFA5FB & 0x5B7F;
        j.lIIlIIlllI[3] = -(0xFFFFFE7F & 0x65B5) & (0xFFFFFFFC & 0x77BF);
        j.lIIlIIlllI[4] = 0x9D ^ 0x85;
        j.lIIlIIlllI[5] = -(0xFFFFDE39 & 0x6BC7) & (0xFFFFFBF9 & 0x7F57);
        j.lIIlIIlllI[6] = -(0xFFFFA1BF & 0x7E73) & (0xFFFFBF7B & Short.MAX_VALUE);
        j.lIIlIIlllI[7] = 0x80 ^ 0x8A;
        j.lIIlIIlllI[8] = 0xFFFFBF5F & 0x48F7;
        j.lIIlIIlllI[9] = -1 & (0xFFFFEBF5 & 0x1FBF);
        j.lIIlIIlllI[10] = 2;
        j.lIIlIIlllI[11] = -(0xFFFFD53F & 0x7FE3) & (0xFFFFDF73 & 0x7DFE);
        j.lIIlIIlllI[12] = -(0xFFFFF617 & 0x39F9) & (0xFFFFFFBE & 0x3BFF);
        j.lIIlIIlllI[13] = 0xAE ^ 0xA5;
        j.lIIlIIlllI[14] = 0x45 ^ 0x17 ^ (0x52 ^ 0xD);
        j.lIIlIIlllI[15] = 0xFFFFFECD & 0x97B;
        j.lIIlIIlllI[16] = 0xFFFFDFDB & 0x2BBE;
        j.lIIlIIlllI[17] = 83 + 64 - 77 + 98 ^ 172 + 144 - 152 + 19;
        j.lIIlIIlllI[18] = 0xB6 ^ 0x95;
        j.lIIlIIlllI[19] = -(0x14 ^ 0x77) & (0xFFFFEFFF & 0x1BFF);
        j.lIIlIIlllI[20] = 3;
        j.lIIlIIlllI[21] = 0xFFFF9C5B & 0x6BBF;
        j.lIIlIIlllI[22] = -(0x18 ^ 0x39) & (0xFFFFDFF7 & 0x2AEE);
        j.lIIlIIlllI[23] = 0xFFFFD793 & 0x297F;
        j.lIIlIIlllI[24] = 123 + 251 - 188 + 66;
        j.lIIlIIlllI[25] = 0xFFFFFC5F & 0xFA9;
        j.lIIlIIlllI[26] = -(0xFFFFB769 & 0x5AD7) & (0xFFFFDFDF & 0x3FF3);
        j.lIIlIIlllI[27] = 0x49 ^ 0x4F;
        j.lIIlIIlllI[28] = 0x98 ^ 0xAB ^ (0x4D ^ 0x7A);
        j.lIIlIIlllI[29] = 0x9C ^ 0x99;
        j.lIIlIIlllI[30] = -(0xFFFFFFAD & 0x77FB) & (0xFFFFFFFE & Short.MAX_VALUE);
        j.lIIlIIlllI[31] = 0xFFFF8FF1 & 0x7BAF;
        j.lIIlIIlllI[32] = 0xFFFFCBAF & 0x3FF7;
        j.lIIlIIlllI[33] = -(0xFFFFDE67 & 0x759F) & (0xFFFFFFF7 & 0x5FBF);
        j.lIIlIIlllI[34] = 0x8D ^ 0x8A;
        j.lIIlIIlllI[35] = 0x7E ^ 0x76;
        j.lIIlIIlllI[36] = 0x5E ^ 0x4C ^ (0x56 ^ 0x4D);
        j.lIIlIIlllI[37] = 0x2F ^ 0x40 ^ (0x60 ^ 3);
        j.lIIlIIlllI[38] = 0xF3 ^ 0x86 ^ (0x4B ^ 0x5A);
        j.lIIlIIlllI[39] = 163 + 186 - 228 + 71 ^ 129 + 44 - 104 + 94;
        j.lIIlIIlllI[40] = 8 ^ 6;
        j.lIIlIIlllI[41] = 0xE0 ^ 0xBF ^ (0x42 ^ 0x12);
        j.lIIlIIlllI[42] = 70 + 73 - 67 + 111 ^ 101 + 103 - 55 + 22;
        j.lIIlIIlllI[43] = 122 + 168 - 254 + 138 ^ 148 + 85 - 199 + 157;
        j.lIIlIIlllI[44] = 0x25 ^ 0x37;
        j.lIIlIIlllI[45] = 0x53 ^ 0x40;
    }

    @Override
    public boolean S() {
        return lIIlIIlllI[1];
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, TileObject tileObject) {
        int n2;
        if (j.lllllIlIIllI(tileObject.getName().contains(lIIlIIllIl[lIIlIIlllI[44]]) ? 1 : 0) && j.lllllIlIIllI(worldArea.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
            n2 = lIIlIIlllI[0];
            0;
            if ((0x62 ^ 0x66) <= 0) {
                return false;
            }
        } else {
            n2 = lIIlIIlllI[1];
        }
        return n2 != 0;
    }

    private static boolean lllllIlIlIIl(int n2) {
        return n2 < 0;
    }

    private static boolean lllllIlIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lllllIlIIlIl(Object object) {
        return object != null;
    }

    private static String lllllIlIIIIl(String var17, String var1) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var25 = Cipher.getInstance("Blowfish");
            var25.init(lIIlIIlllI[10], var18);
            return new String(var25.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIlIllII(Object object) {
        return object == null;
    }

    private static int lllllIlIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lllllIlIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void R() {
        NPC var2;
        NPC var20;
        void var13;
        WorldPoint worldPoint = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[9], lIIlIIlllI[10]);
        WorldPoint worldPoint2 = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[9], lIIlIIlllI[0]);
        WorldArea worldArea = new WorldArea(lIIlIIlllI[11], lIIlIIlllI[12], lIIlIIlllI[13], lIIlIIlllI[14], lIIlIIlllI[0]);
        WorldArea worldArea2 = new WorldArea(lIIlIIlllI[11], lIIlIIlllI[12], lIIlIIlllI[13], lIIlIIlllI[14], lIIlIIlllI[0]);
        WorldArea worldArea3 = worldArea;
        WorldArea worldArea4 = new WorldArea(lIIlIIlllI[15], lIIlIIlllI[16], lIIlIIlllI[17], lIIlIIlllI[18], lIIlIIlllI[1]);
        WorldPoint worldPoint3 = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[19], lIIlIIlllI[1]);
        if (j.lllllIlIlIIl(j.lllllIlIlIII(e.u(), 45.0))) {
            int[] nArray = new int[lIIlIIlllI[0]];
            nArray[j.lIIlIIlllI[1]] = lIIlIIlllI[2];
            if (j.lllllIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIlIIlllI[0]];
                nArray2[j.lIIlIIlllI[1]] = lIIlIIlllI[2];
                Inventory.getFirst((int[])nArray2).interact(lIIlIIllIl[lIIlIIlllI[10]]);
                Time.sleepTicks((int)lIIlIIlllI[0]);
                0;
            }
        }
        if (j.lllllIlIIlII(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var24;
            AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[20]];
            var20 = new WorldArea(lIIlIIlllI[21], lIIlIIlllI[22], lIIlIIlllI[23], lIIlIIlllI[24], lIIlIIlllI[1]);
            if (j.lllllIlIIlII(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var2 = new WorldPoint(lIIlIIlllI[25], lIIlIIlllI[26], lIIlIIlllI[1]);
                if (j.lllllIlIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var2), lIIlIIlllI[27])) {
                    Movement.walkTo((WorldPoint)var2);
                    0;
                    Time.sleepTicks((int)lIIlIIlllI[0]);
                    0;
                }
                if (j.lllllIlIlIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var2), lIIlIIlllI[27])) {
                    String[] stringArray = new String[lIIlIIlllI[0]];
                    stringArray[j.lIIlIIlllI[1]] = lIIlIIllIl[lIIlIIlllI[28]];
                    TileObjects.getNearest((String[])stringArray).interact(lIIlIIllIl[lIIlIIlllI[29]]);
                    Time.sleepTicks((int)lIIlIIlllI[20]);
                    0;
                }
            }
            if (j.lllllIlIIllI(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && j.lllllIlIIlII(var24.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void var21;
                Movement.walkTo((WorldPoint)var21);
                0;
                Time.sleepTicks((int)lIIlIIlllI[0]);
                0;
            }
            if (j.lllllIlIIllI(var24.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var2 = TileObjects.getNearest(arg_0 -> j.a((WorldArea)var24, arg_0));
                if (j.lllllIlIllII(var2)) {
                    WorldPoint[] worldPointArray = new WorldPoint[lIIlIIlllI[28]];
                    worldPointArray[j.lIIlIIlllI[1]] = new WorldPoint(lIIlIIlllI[8], lIIlIIlllI[19], lIIlIIlllI[1]);
                    worldPointArray[j.lIIlIIlllI[0]] = new WorldPoint(lIIlIIlllI[30], lIIlIIlllI[31], lIIlIIlllI[1]);
                    worldPointArray[j.lIIlIIlllI[10]] = new WorldPoint(lIIlIIlllI[30], lIIlIIlllI[32], lIIlIIlllI[1]);
                    worldPointArray[j.lIIlIIlllI[20]] = new WorldPoint(lIIlIIlllI[30], lIIlIIlllI[33], lIIlIIlllI[1]);
                    WorldPoint[] var16 = worldPointArray;
                    Walker.walkAlong(Arrays.asList(var16), new HashMap());
                    0;
                }
                if (j.lllllIlIIlIl(var2)) {
                    var2.interact(lIIlIIllIl[lIIlIIlllI[27]]);
                    Time.sleepTicks((int)lIIlIIlllI[20]);
                    0;
                }
            }
        }
        if (j.lllllIlIIllI(var13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (j.lllllIlIllII(Players.getLocal().getInteracting())) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[34]];
                var20 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.lllllIlIIllI(nPC.getName().contains(lIIlIIllIl[lIIlIIlllI[42]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIlllI[0]];
                        stringArray[j.lIIlIIlllI[1]] = lIIlIIllIl[lIIlIIlllI[43]];
                        if (j.lllllIlIIllI(nPC.hasAction(stringArray) ? 1 : 0) && j.lllllIlIIlII(nPC.isDead() ? 1 : 0) && j.lllllIlIllII(nPC.getInteracting())) {
                            n2 = lIIlIIlllI[0];
                            0;
                            if (2 == 2) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIIlIIlllI[1];
                    return n2 != 0;
                });
                var2 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.lllllIlIIllI(nPC.getName().contains(lIIlIIllIl[lIIlIIlllI[40]]) ? 1 : 0) && j.lllllIlIIlII(nPC.isDead() ? 1 : 0)) {
                        String[] stringArray = new String[lIIlIIlllI[0]];
                        stringArray[j.lIIlIIlllI[1]] = lIIlIIllIl[lIIlIIlllI[41]];
                        if (j.lllllIlIIllI(nPC.hasAction(stringArray) ? 1 : 0) && j.lllllIlIlllI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIIlIIlllI[0];
                            0;
                            if (2 > 0) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIIlIIlllI[1];
                    return n2 != 0;
                });
                if (j.lllllIlIIlIl(var20) && j.lllllIlIllII(var2)) {
                    AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[35]];
                    var20.interact(lIIlIIllIl[lIIlIIlllI[36]]);
                    Time.sleepTicks((int)lIIlIIlllI[10]);
                    0;
                }
                if (j.lllllIlIIlIl(var2)) {
                    AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[7]];
                    var2.interact(lIIlIIllIl[lIIlIIlllI[13]]);
                    Time.sleepTicks((int)lIIlIIlllI[20]);
                    0;
                }
            }
            if (j.lllllIlIIlIl(Players.getLocal().getInteracting())) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[37]];
                Time.sleepTicks((int)lIIlIIlllI[0]);
                0;
            }
        }
    }

    static {
        j.lllllIlIIIll();
        j.lllllIlIIIlI();
    }

    @Override
    public int T() {
        try {
            j.Q();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 >= ((0x26 ^ 1) & ~(0xBE ^ 0x99))) {
            return (0x79 ^ 0x59) & ~(2 ^ 0x22);
        }
        return lIIlIIlllI[38];
    }

    private static boolean lllllIlIIllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void Q() {
        int[] nArray = new int[lIIlIIlllI[0]];
        nArray[j.lIIlIIlllI[1]] = lIIlIIlllI[2];
        if (j.lllllIlIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void var11;
            BankLocation bankLocation = BankLocation.getNearest();
            if (j.lllllIlIIlIl(bankLocation) && j.lllllIlIIlII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[1]];
                a.a(bankLocation);
            }
            if (j.lllllIlIIlIl(var11) && j.lllllIlIIllI(var11.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlIIllIl[lIIlIIlllI[0]];
                if (j.lllllIlIIlII(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIIlllI[3]);
                    0;
                }
                if (j.lllllIlIIllI(Bank.isOpen() ? 1 : 0)) {
                    if (j.lllllIlIIlll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIIlIIlllI[0]);
                        0;
                    }
                    a.a(lIIlIIlllI[2], lIIlIIlllI[4]);
                    a.a(lIIlIIlllI[5], lIIlIIlllI[0]);
                    a.a(lIIlIIlllI[6], lIIlIIlllI[7]);
                }
            }
        }
        int[] nArray2 = new int[lIIlIIlllI[0]];
        nArray2[j.lIIlIIlllI[1]] = lIIlIIlllI[2];
        if (j.lllllIlIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            j.R();
        }
    }
}

