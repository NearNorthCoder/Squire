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
package e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u;

import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.S_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.a_Unknown;
import e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.e_Unknown;
import gg.squire.account.AccBuilderTempleTrek;
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

public class j_Unknown
implements S {
    private static /* synthetic */ String[] llllIIIlIl;
    private static /* synthetic */ int[] llllIIIllI;

    private static boolean llIIllIIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIIllIIIIlll(int n2) {
        return n2 > 0;
    }

    static {
        j.llIIllIIIIIll();
        j.llIIllIIIIIlI();
    }

    private static boolean llIIllIIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIIllIIIIIIl(String var9, String var24) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), llllIIIllI[35]), "DES");
            Cipher var23 = Cipher.getInstance("DES");
            var23.init(llllIIIllI[10], var18);
            return new String(var23.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static int llIIllIIIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * WARNING - void declaration
     */
    public static void Q() {
        int[] nArray = new int[llllIIIllI[0]];
        nArray[j.llllIIIllI[1]] = llllIIIllI[2];
        if (j.llIIllIIIIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void var6;
            BankLocation bankLocation = BankLocation.getNearest();
            if (j.llIIllIIIIlIl(bankLocation) && j.llIIllIIIIlII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[1]];
                a.a(bankLocation);
            }
            if (j.llIIllIIIIlIl(var6) && j.llIIllIIIIllI(var6.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[0]];
                if (j.llIIllIIIIlII(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llllIIIllI[3]);
                    0;
                }
                if (j.llIIllIIIIllI(Bank.isOpen() ? 1 : 0)) {
                    if (j.llIIllIIIIlll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)llllIIIllI[0]);
                        0;
                    }
                    a.a(llllIIIllI[2], llllIIIllI[4]);
                    a.a(llllIIIllI[5], llllIIIllI[0]);
                    a.a(llllIIIllI[6], llllIIIllI[7]);
                }
            }
        }
        int[] nArray2 = new int[llllIIIllI[0]];
        nArray2[j.llllIIIllI[1]] = llllIIIllI[2];
        if (j.llIIllIIIIllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            j.R();
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (j.llIIllIIIllIl(Skills.getLevel((Skill)Skill.RANGED), llllIIIllI[39])) {
            bl = llllIIIllI[0];
            0;
            if (3 <= -1) {
                return false;
            }
        } else {
            bl = llllIIIllI[1];
        }
        return bl;
    }

    private static boolean llIIllIIIlllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIllIIIIlIl(Object object) {
        return object != null;
    }

    private static String llIIllIIIIIII(String var10, String var5) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(llllIIIllI[10], var2);
            return new String(var7.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
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
        if ((9 + 6 - -32 + 117 ^ 110 + 126 - 184 + 108) == 2) {
            return (179 + 153 - 277 + 136 ^ 85 + 91 - 48 + 30) & (0x8F ^ 0xBA ^ (0x8D ^ 0x99) ^ -1);
        }
        return llllIIIllI[38];
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, TileObject tileObject) {
        int n2;
        if (j.llIIllIIIIllI(tileObject.getName().contains(llllIIIlIl[llllIIIllI[44]]) ? 1 : 0) && j.llIIllIIIIllI(worldArea.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
            n2 = llllIIIllI[0];
            0;
            if ((0x4F ^ 0x61 ^ (0xA5 ^ 0x8F)) != (133 + 134 - 179 + 107 ^ 100 + 61 - 9 + 47)) {
                return ((0x7B ^ 0x51 ^ (0x37 ^ 0x13)) & (166 + 63 - 187 + 146 ^ 142 + 177 - 281 + 140 ^ -1)) != 0;
            }
        } else {
            n2 = llllIIIllI[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private static void R() {
        NPC var13;
        NPC var1;
        void var14;
        WorldPoint worldPoint = new WorldPoint(llllIIIllI[8], llllIIIllI[9], llllIIIllI[10]);
        WorldPoint worldPoint2 = new WorldPoint(llllIIIllI[8], llllIIIllI[9], llllIIIllI[0]);
        WorldArea worldArea = new WorldArea(llllIIIllI[11], llllIIIllI[12], llllIIIllI[13], llllIIIllI[14], llllIIIllI[0]);
        WorldArea worldArea2 = new WorldArea(llllIIIllI[11], llllIIIllI[12], llllIIIllI[13], llllIIIllI[14], llllIIIllI[0]);
        WorldArea worldArea3 = worldArea;
        WorldArea worldArea4 = new WorldArea(llllIIIllI[15], llllIIIllI[16], llllIIIllI[17], llllIIIllI[18], llllIIIllI[1]);
        WorldPoint worldPoint3 = new WorldPoint(llllIIIllI[8], llllIIIllI[19], llllIIIllI[1]);
        if (j.llIIllIIIlIIl(j.llIIllIIIlIII(e.u(), 45.0))) {
            int[] nArray = new int[llllIIIllI[0]];
            nArray[j.llllIIIllI[1]] = llllIIIllI[2];
            if (j.llIIllIIIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llllIIIllI[0]];
                nArray2[j.llllIIIllI[1]] = llllIIIllI[2];
                Inventory.getFirst((int[])nArray2).interact(llllIIIlIl[llllIIIllI[10]]);
                Time.sleepTicks((int)llllIIIllI[0]);
                0;
            }
        }
        if (j.llIIllIIIIlII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var20;
            AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[20]];
            var1 = new WorldArea(llllIIIllI[21], llllIIIllI[22], llllIIIllI[23], llllIIIllI[24], llllIIIllI[1]);
            if (j.llIIllIIIIlII(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var13 = new WorldPoint(llllIIIllI[25], llllIIIllI[26], llllIIIllI[1]);
                if (j.llIIllIIIlIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var13), llllIIIllI[27])) {
                    Movement.walkTo((WorldPoint)var13);
                    0;
                    Time.sleepTicks((int)llllIIIllI[0]);
                    0;
                }
                if (j.llIIllIIIlIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var13), llllIIIllI[27])) {
                    String[] stringArray = new String[llllIIIllI[0]];
                    stringArray[j.llllIIIllI[1]] = llllIIIlIl[llllIIIllI[28]];
                    TileObjects.getNearest((String[])stringArray).interact(llllIIIlIl[llllIIIllI[29]]);
                    Time.sleepTicks((int)llllIIIllI[20]);
                    0;
                }
            }
            if (j.llIIllIIIIllI(var1.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && j.llIIllIIIIlII(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void var19;
                Movement.walkTo((WorldPoint)var19);
                0;
                Time.sleepTicks((int)llllIIIllI[0]);
                0;
            }
            if (j.llIIllIIIIllI(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var13 = TileObjects.getNearest(arg_0 -> j.a((WorldArea)var20, arg_0));
                if (j.llIIllIIIllII(var13)) {
                    WorldPoint[] worldPointArray = new WorldPoint[llllIIIllI[28]];
                    worldPointArray[j.llllIIIllI[1]] = new WorldPoint(llllIIIllI[8], llllIIIllI[19], llllIIIllI[1]);
                    worldPointArray[j.llllIIIllI[0]] = new WorldPoint(llllIIIllI[30], llllIIIllI[31], llllIIIllI[1]);
                    worldPointArray[j.llllIIIllI[10]] = new WorldPoint(llllIIIllI[30], llllIIIllI[32], llllIIIllI[1]);
                    worldPointArray[j.llllIIIllI[20]] = new WorldPoint(llllIIIllI[30], llllIIIllI[33], llllIIIllI[1]);
                    WorldPoint[] var3 = worldPointArray;
                    Walker.walkAlong(Arrays.asList(var3), new HashMap());
                    0;
                }
                if (j.llIIllIIIIlIl(var13)) {
                    var13.interact(llllIIIlIl[llllIIIllI[27]]);
                    Time.sleepTicks((int)llllIIIllI[20]);
                    0;
                }
            }
        }
        if (j.llIIllIIIIllI(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (j.llIIllIIIllII(Players.getLocal().getInteracting())) {
                AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[34]];
                var1 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.llIIllIIIIllI(nPC.getName().contains(llllIIIlIl[llllIIIllI[42]]) ? 1 : 0)) {
                        String[] stringArray = new String[llllIIIllI[0]];
                        stringArray[j.llllIIIllI[1]] = llllIIIlIl[llllIIIllI[43]];
                        if (j.llIIllIIIIllI(nPC.hasAction(stringArray) ? 1 : 0) && j.llIIllIIIIlII(nPC.isDead() ? 1 : 0) && j.llIIllIIIllII(nPC.getInteracting())) {
                            n2 = llllIIIllI[0];
                            0;
                            if ((0x84 ^ 0x80) <= (0x6C ^ 0x68)) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = llllIIIllI[1];
                    return n2 != 0;
                });
                var13 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.llIIllIIIIllI(nPC.getName().contains(llllIIIlIl[llllIIIllI[40]]) ? 1 : 0) && j.llIIllIIIIlII(nPC.isDead() ? 1 : 0)) {
                        String[] stringArray = new String[llllIIIllI[0]];
                        stringArray[j.llllIIIllI[1]] = llllIIIlIl[llllIIIllI[41]];
                        if (j.llIIllIIIIllI(nPC.hasAction(stringArray) ? 1 : 0) && j.llIIllIIIlllI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = llllIIIllI[0];
                            0;
                            if (((0xA1 ^ 0x86 ^ (0x74 ^ 0x10)) & (200 + 135 - 88 + 8 ^ 181 + 25 - 139 + 121 ^ -1)) < 2) return n2 != 0;
                            return ((0x12 ^ 0x69 ^ (0x70 ^ 0x5F)) & (58 + 67 - -28 + 67 ^ 67 + 22 - 51 + 98 ^ -1)) != 0;
                        }
                    }
                    n2 = llllIIIllI[1];
                    return n2 != 0;
                });
                if (j.llIIllIIIIlIl(var1) && j.llIIllIIIllII(var13)) {
                    AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[35]];
                    var1.interact(llllIIIlIl[llllIIIllI[36]]);
                    Time.sleepTicks((int)llllIIIllI[10]);
                    0;
                }
                if (j.llIIllIIIIlIl(var13)) {
                    AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[7]];
                    var13.interact(llllIIIlIl[llllIIIllI[13]]);
                    Time.sleepTicks((int)llllIIIllI[20]);
                    0;
                }
            }
            if (j.llIIllIIIIlIl(Players.getLocal().getInteracting())) {
                AccBuilderTempleTrek.c = llllIIIlIl[llllIIIllI[37]];
                Time.sleepTicks((int)llllIIIllI[0]);
                0;
            }
        }
    }

    private static void llIIllIIIIIlI() {
        llllIIIlIl = new String[llllIIIllI[45]];
        j.llllIIIlIl[j.llllIIIllI[1]] = j."Navigating to bank";
        j.llllIIIlIl[j.llllIIIllI[0]] = j."Handling banking";
        j.llllIIIlIl[j.llllIIIllI[10]] = j."Eat";
        j.llllIIIlIl[j.llllIIIllI[20]] = j."Nav to souls";
        j.llllIIIlIl[j.llllIIIllI[28]] = j."Soul Wars Portal";
        j.llllIIIlIl[j.llllIIIllI[29]] = j."Enter";
        j.llllIIIlIl[j.llllIIIllI[27]] = j."Climb-up";
        j.llllIIIlIl[j.llllIIIllI[34]] = j."Fighting souls";
        j.llllIIIlIl[j.llllIIIllI[35]] = j."Attacking soul";
        j.llllIIIlIl[j.llllIIIllI[36]] = j."Attack";
        j.llllIIIlIl[j.llllIIIllI[7]] = j."Attacking soull";
        j.llllIIIlIl[j.llllIIIllI[13]] = j."Attack";
        j.llllIIIlIl[j.llllIIIllI[37]] = j."In combat";
        j.llllIIIlIl[j.llllIIIllI[14]] = j."Forgotten Souls";
        j.llllIIIlIl[j.llllIIIllI[40]] = j."Soul";
        j.llllIIIlIl[j.llllIIIllI[41]] = j."Attack";
        j.llllIIIlIl[j.llllIIIllI[42]] = j."Soul";
        j.llllIIIlIl[j.llllIIIllI[43]] = j."Attack";
        j.llllIIIlIl[j.llllIIIllI[44]] = j."Staircase";
    }

    private static String llIIlIlllllll(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var8 = var22.toCharArray();
        int var25 = llllIIIllI[1];
        char[] var17 = var21.toCharArray();
        int var15 = var17.length;
        int var26 = llllIIIllI[1];
        while (j.llIIllIIIllll(var26, var15)) {
            char var16 = var17[var26];
            var11.append((char)(var16 ^ var8[var25 % var8.length]));
            0;
            ++var25;
            ++var26;
            0;
            
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean llIIllIIIIlII(int n2) {
        return n2 == 0;
    }

    private static void llIIllIIIIIll() {
        llllIIIllI = new int[46];
        j.llllIIIllI[0] = 1;
        j.llllIIIllI[1] = (0x66 ^ 5) & ~(0x7C ^ 0x1F);
        j.llllIIIllI[2] = -(0xFFFF9F6D & 0x7E93) & (0xFFFFFF7F & 0x1FFB);
        j.llllIIIllI[3] = -(0xFFFFFCD7 & 0x2F6C) & (0xFFFFFFCF & 0x3FFB);
        j.llllIIIllI[4] = 0x49 ^ 0x51;
        j.llllIIIllI[5] = -(0xFFFFC96F & 0x3EBF) & (0xFFFFBFFF & 0x797F);
        j.llllIIIllI[6] = -(0xFFFFED7D & 0x3297) & (0xFFFFFF5D & 0x3FFF);
        j.llllIIIllI[7] = 0xBA ^ 0xB0;
        j.llllIIIllI[8] = 0xFFFF8E7F & 0x79D7;
        j.llllIIIllI[9] = 0xFFFFFFBF & 0xBF5;
        j.llllIIIllI[10] = 2;
        j.llllIIIllI[11] = 0xFFFFDD5A & 0x2AF5;
        j.llllIIIllI[12] = 0xFFFF8BFE & 0x7FAF;
        j.llllIIIllI[13] = 0x50 ^ 0x5B;
        j.llllIIIllI[14] = 0x38 ^ 0x75 ^ (0x35 ^ 0x75);
        j.llllIIIllI[15] = -(0xFFFFF3E7 & 0x6FBF) & (0xFFFFFFEF & 0x6BFF);
        j.llllIIIllI[16] = 0xFFFFCB9E & 0x3FFB;
        j.llllIIIllI[17] = 1 ^ 0xF ^ (0x48 ^ 0x59);
        j.llllIIIllI[18] = 0x19 ^ 0x3A;
        j.llllIIIllI[19] = -(0x68 ^ 0x29) & (0xFFFFDFFD & 0x2BDF);
        j.llllIIIllI[20] = 3;
        j.llllIIIllI[21] = -(0xFFFFD763 & 0x3C9D) & (0xFFFFFE1B & 0x1DFF);
        j.llllIIIllI[22] = 0xFFFFBEDF & 0x4BE6;
        j.llllIIIllI[23] = 0xFFFFB5FB & 0x4B17;
        j.llllIIIllI[24] = 35 + 28 - -76 + 113;
        j.llllIIIllI[25] = 0xFFFFAFC9 & 0x5C3F;
        j.llllIIIllI[26] = -(0xFFFFD46D & 0x7BBB) & (0xFFFFDFBB & 0x7DFF);
        j.llllIIIllI[27] = 1 ^ 8 ^ (0xB5 ^ 0xBA);
        j.llllIIIllI[28] = 0x83 ^ 0x87;
        j.llllIIIllI[29] = 0xD9 ^ 0xA2 ^ (0x28 ^ 0x56);
        j.llllIIIllI[30] = 0xFFFF9D5F & 0x6AF6;
        j.llllIIIllI[31] = -(0xFFFFF07F & 0x7FD5) & (0xFFFFFFF5 & 0x7BFF);
        j.llllIIIllI[32] = 0xFFFFFFE7 & 0xBBF;
        j.llllIIIllI[33] = 0xFFFFFBB7 & 0xFF9;
        j.llllIIIllI[34] = 0x3B ^ 0xC ^ (0x42 ^ 0x72);
        j.llllIIIllI[35] = 0x21 ^ 0x3D ^ (0x31 ^ 0x25);
        j.llllIIIllI[36] = 0xCF ^ 0xC6;
        j.llllIIIllI[37] = 0xF1 ^ 0x91 ^ (0x1F ^ 0x73);
        j.llllIIIllI[38] = 0x2B ^ 0x4F;
        j.llllIIIllI[39] = 0xC2 ^ 0xA1;
        j.llllIIIllI[40] = 2 ^ 0xC;
        j.llllIIIllI[41] = 0x83 ^ 0x8C;
        j.llllIIIllI[42] = 3 ^ (0x9A ^ 0x89);
        j.llllIIIllI[43] = 9 ^ 0x18;
        j.llllIIIllI[44] = 0xD4 ^ 0xC6;
        j.llllIIIllI[45] = 0x32 ^ 0x21;
    }

    private static boolean llIIllIIIllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIllIIIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIllIIIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIllIIIllII(Object object) {
        return object == null;
    }

    private static boolean llIIllIIIlIIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean S() {
        return llllIIIllI[1];
    }

    @Override
    public String U() {
        return llllIIIlIl[llllIIIllI[14]];
    }
}

