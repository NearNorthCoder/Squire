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
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac_Unknown;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e_Unknown;

public class k_Unknown
implements ac {
    private static /* synthetic */ int[] llIlIIllIl;
    private static /* synthetic */ String[] llIlIIllII;

    private static boolean lIllIIlIlIIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIIlIllIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIlIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIlIllIIl(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIIlIIlIIl(String var11, String var7) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var15 = Cipher.getInstance("Blowfish");
            var15.init(llIlIIllIl[10], var2);
            return new String(var15.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ae() {
        return llIlIIllIl[1];
    }

    @Override
    public int af() {
        try {
            k.ac();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (((0x21 ^ 0x7A ^ (0x7F ^ 0xD)) & (138 + 124 - 69 + 44 ^ 105 + 8 - 73 + 156 ^ -1)) < ((0x43 ^ 0x5C ^ (0x81 ^ 0xC4)) & (0x4D ^ 0x6F ^ (0xF8 ^ 0x80) ^ -1))) {
            return (0x4F ^ 0x70 ^ (0xD1 ^ 0xC1)) & (0xD4 ^ 0xA4 ^ (0x4A ^ 0x15) ^ -1);
        }
        return llIlIIllIl[38];
    }

    /*
     * WARNING - void declaration
     */
    public static void ac() {
        int[] nArray = new int[llIlIIllIl[0]];
        nArray[k.llIlIIllIl[1]] = llIlIIllIl[2];
        if (k.lIllIIlIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void var13;
            BankLocation bankLocation = BankLocation.getNearest();
            if (k.lIllIIlIIllll(bankLocation) && k.lIllIIlIIlllI(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIlIIllII[llIlIIllIl[1]];
                a.a(bankLocation);
            }
            if (k.lIllIIlIIllll(var13) && k.lIllIIlIlIIII(var13.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIlIIllII[llIlIIllIl[0]];
                if (k.lIllIIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIlIIllIl[3]);
                    0;
                }
                if (k.lIllIIlIlIIII(Bank.isOpen() ? 1 : 0)) {
                    if (k.lIllIIlIlIIIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)llIlIIllIl[0]);
                        0;
                    }
                    a.a(llIlIIllIl[2], llIlIIllIl[4]);
                    a.a(llIlIIllIl[5], llIlIIllIl[0]);
                    a.a(llIlIIllIl[6], llIlIIllIl[7]);
                }
            }
        }
        int[] nArray2 = new int[llIlIIllIl[0]];
        nArray2[k.llIlIIllIl[1]] = llIlIIllIl[2];
        if (k.lIllIIlIlIIII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            k.ad();
        }
    }

    private static boolean lIllIIlIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIlIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIIlIIllll(Object object) {
        return object != null;
    }

    private static boolean lIllIIlIlIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public String ag() {
        return llIlIIllII[llIlIIllIl[14]];
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, TileObject tileObject) {
        int n2;
        if (k.lIllIIlIlIIII(tileObject.getName().contains(llIlIIllII[llIlIIllIl[44]]) ? 1 : 0) && k.lIllIIlIlIIII(worldArea.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
            n2 = llIlIIllIl[0];
            0;
            if (-1 >= 3) {
                return false;
            }
        } else {
            n2 = llIlIIllIl[1];
        }
        return n2 != 0;
    }

    private static int lIllIIlIlIIlI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        k.lIllIIlIIllIl();
        k.lIllIIlIIllII();
    }

    private static boolean lIllIIlIlIllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private static void ad() {
        NPC var23;
        NPC var20;
        void var17;
        WorldPoint worldPoint = new WorldPoint(llIlIIllIl[8], llIlIIllIl[9], llIlIIllIl[10]);
        WorldPoint worldPoint2 = new WorldPoint(llIlIIllIl[8], llIlIIllIl[9], llIlIIllIl[0]);
        WorldArea worldArea = new WorldArea(llIlIIllIl[11], llIlIIllIl[12], llIlIIllIl[13], llIlIIllIl[14], llIlIIllIl[0]);
        WorldArea worldArea2 = new WorldArea(llIlIIllIl[11], llIlIIllIl[12], llIlIIllIl[13], llIlIIllIl[14], llIlIIllIl[0]);
        WorldArea worldArea3 = worldArea;
        WorldArea worldArea4 = new WorldArea(llIlIIllIl[15], llIlIIllIl[16], llIlIIllIl[17], llIlIIllIl[18], llIlIIllIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(llIlIIllIl[8], llIlIIllIl[19], llIlIIllIl[1]);
        if (k.lIllIIlIlIIll(k.lIllIIlIlIIlI(e.w(), 45.0))) {
            int[] nArray = new int[llIlIIllIl[0]];
            nArray[k.llIlIIllIl[1]] = llIlIIllIl[2];
            if (k.lIllIIlIlIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIlIIllIl[0]];
                nArray2[k.llIlIIllIl[1]] = llIlIIllIl[2];
                Inventory.getFirst((int[])nArray2).interact(llIlIIllII[llIlIIllIl[10]]);
                Time.sleepTicks((int)llIlIIllIl[0]);
                0;
            }
        }
        if (k.lIllIIlIIlllI(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var16;
            AccBuilderSotf.c = llIlIIllII[llIlIIllIl[20]];
            var20 = new WorldArea(llIlIIllIl[21], llIlIIllIl[22], llIlIIllIl[23], llIlIIllIl[24], llIlIIllIl[1]);
            if (k.lIllIIlIIlllI(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var23 = new WorldPoint(llIlIIllIl[25], llIlIIllIl[26], llIlIIllIl[1]);
                if (k.lIllIIlIlIlII(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var23), llIlIIllIl[27])) {
                    Movement.walkTo((WorldPoint)var23);
                    0;
                    Time.sleepTicks((int)llIlIIllIl[0]);
                    0;
                }
                if (k.lIllIIlIlIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var23), llIlIIllIl[27])) {
                    String[] stringArray = new String[llIlIIllIl[0]];
                    stringArray[k.llIlIIllIl[1]] = llIlIIllII[llIlIIllIl[28]];
                    TileObjects.getNearest((String[])stringArray).interact(llIlIIllII[llIlIIllIl[29]]);
                    Time.sleepTicks((int)llIlIIllIl[20]);
                    0;
                }
            }
            if (k.lIllIIlIlIIII(var20.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && k.lIllIIlIIlllI(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void var9;
                Movement.walkTo((WorldPoint)var9);
                0;
                Time.sleepTicks((int)llIlIIllIl[0]);
                0;
            }
            if (k.lIllIIlIlIIII(var16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var23 = TileObjects.getNearest(arg_0 -> k.a((WorldArea)var16, arg_0));
                if (k.lIllIIlIlIllI(var23)) {
                    WorldPoint[] worldPointArray = new WorldPoint[llIlIIllIl[28]];
                    worldPointArray[k.llIlIIllIl[1]] = new WorldPoint(llIlIIllIl[8], llIlIIllIl[19], llIlIIllIl[1]);
                    worldPointArray[k.llIlIIllIl[0]] = new WorldPoint(llIlIIllIl[30], llIlIIllIl[31], llIlIIllIl[1]);
                    worldPointArray[k.llIlIIllIl[10]] = new WorldPoint(llIlIIllIl[30], llIlIIllIl[32], llIlIIllIl[1]);
                    worldPointArray[k.llIlIIllIl[20]] = new WorldPoint(llIlIIllIl[30], llIlIIllIl[33], llIlIIllIl[1]);
                    WorldPoint[] var10 = worldPointArray;
                    Walker.walkAlong(Arrays.asList(var10), new HashMap());
                    0;
                }
                if (k.lIllIIlIIllll(var23)) {
                    var23.interact(llIlIIllII[llIlIIllIl[27]]);
                    Time.sleepTicks((int)llIlIIllIl[20]);
                    0;
                }
            }
        }
        if (k.lIllIIlIlIIII(var17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (k.lIllIIlIlIllI(Players.getLocal().getInteracting())) {
                AccBuilderSotf.c = llIlIIllII[llIlIIllIl[34]];
                var20 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIllIIlIlIIII(nPC.getName().contains(llIlIIllII[llIlIIllIl[42]]) ? 1 : 0)) {
                        String[] stringArray = new String[llIlIIllIl[0]];
                        stringArray[k.llIlIIllIl[1]] = llIlIIllII[llIlIIllIl[43]];
                        if (k.lIllIIlIlIIII(nPC.hasAction(stringArray) ? 1 : 0) && k.lIllIIlIIlllI(nPC.isDead() ? 1 : 0) && k.lIllIIlIlIllI(nPC.getInteracting())) {
                            n2 = llIlIIllIl[0];
                            0;
                            if (1 == 1) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = llIlIIllIl[1];
                    return n2 != 0;
                });
                var23 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIllIIlIlIIII(nPC.getName().contains(llIlIIllII[llIlIIllIl[40]]) ? 1 : 0) && k.lIllIIlIIlllI(nPC.isDead() ? 1 : 0)) {
                        String[] stringArray = new String[llIlIIllIl[0]];
                        stringArray[k.llIlIIllIl[1]] = llIlIIllII[llIlIIllIl[41]];
                        if (k.lIllIIlIlIIII(nPC.hasAction(stringArray) ? 1 : 0) && k.lIllIIlIllIIl(nPC.getInteracting(), Players.getLocal())) {
                            n2 = llIlIIllIl[0];
                            0;
                            if (3 > 1) return n2 != 0;
                            return ((171 + 107 - 229 + 160 ^ 70 + 56 - -67 + 4) & (0xA4 ^ 0x8D ^ (0x65 ^ 0x58) ^ -1)) != 0;
                        }
                    }
                    n2 = llIlIIllIl[1];
                    return n2 != 0;
                });
                if (k.lIllIIlIIllll(var20) && k.lIllIIlIlIllI(var23)) {
                    AccBuilderSotf.c = llIlIIllII[llIlIIllIl[35]];
                    var20.interact(llIlIIllII[llIlIIllIl[36]]);
                    Time.sleepTicks((int)llIlIIllIl[10]);
                    0;
                }
                if (k.lIllIIlIIllll(var23)) {
                    AccBuilderSotf.c = llIlIIllII[llIlIIllIl[7]];
                    var23.interact(llIlIIllII[llIlIIllIl[13]]);
                    Time.sleepTicks((int)llIlIIllIl[20]);
                    0;
                }
            }
            if (k.lIllIIlIIllll(Players.getLocal().getInteracting())) {
                AccBuilderSotf.c = llIlIIllII[llIlIIllIl[37]];
                Time.sleepTicks((int)llIlIIllIl[0]);
                0;
            }
        }
    }

    private static String lIllIIlIIlIll(String var21, String var6) {
        try {
            SecretKeySpec var26 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llIlIIllIl[35]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(llIlIIllIl[10], var26);
            return new String(var4.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static void lIllIIlIIllIl() {
        llIlIIllIl = new int[46];
        k.llIlIIllIl[0] = 1;
        k.llIlIIllIl[1] = (59 + 114 - 133 + 163 ^ 88 + 118 - 91 + 23) & (173 + 70 - 54 + 6 ^ 58 + 113 - 41 + 0 ^ -1);
        k.llIlIIllIl[2] = -(0xFFFFB31B & 0x5CE5) & (0xFFFFB3FB & 0x5D7F);
        k.llIlIIllIl[3] = -(0xFFFFEDB1 & 0x7E5F) & (0xFFFFFFFA & 0x7F9D);
        k.llIlIIllIl[4] = 0x28 ^ 0x30;
        k.llIlIIllIl[5] = 0xFFFFFBF7 & 0x3559;
        k.llIlIIllIl[6] = 0xFFFFBF7B & 0x5FCD;
        k.llIlIIllIl[7] = 0x20 ^ 0x2A;
        k.llIlIIllIl[8] = 0xFFFFD9D7 & 0x2E7F;
        k.llIlIIllIl[9] = 0xFFFFAFFD & 0x5BB7;
        k.llIlIIllIl[10] = 2;
        k.llIlIIllIl[11] = 0xFFFFDD5C & 0x2AF3;
        k.llIlIIllIl[12] = 0xFFFF9BAF & 0x6FFE;
        k.llIlIIllIl[13] = 0xEB ^ 0xB4 ^ (0x1D ^ 0x49);
        k.llIlIIllIl[14] = 0x3B ^ 0x36;
        k.llIlIIllIl[15] = -(0xFFFFDAF5 & 0x779B) & (0xFFFFDFD9 & 0x7AFF);
        k.llIlIIllIl[16] = 0xFFFFFBDE & 0xFBB;
        k.llIlIIllIl[17] = 0xE2 ^ 0xBE ^ (0x72 ^ 0x31);
        k.llIlIIllIl[18] = 37 + 139 - 135 + 110 ^ 43 + 30 - 30 + 137;
        k.llIlIIllIl[19] = 0xFFFFDBFD & 0x2F9F;
        k.llIlIIllIl[20] = 3;
        k.llIlIIllIl[21] = 0xFFFF9D1B & 0x6AFF;
        k.llIlIIllIl[22] = -(0xFFFFF77E & 0x7DA3) & (0xFFFFFFFF & 0x7FE7);
        k.llIlIIllIl[23] = -(0xFFFFBAF9 & 0x6F6F) & (0xFFFFEFFF & 0x3B7B);
        k.llIlIIllIl[24] = 44 + 105 - 75 + 178;
        k.llIlIIllIl[25] = 0xFFFF9F2D & 0x6CDB;
        k.llIlIIllIl[26] = -(0xFFFFFF87 & 0x707D) & (0xFFFFFFB7 & 0x7DDF);
        k.llIlIIllIl[27] = 0xE6 ^ 0xA5 ^ (0x59 ^ 0x1C);
        k.llIlIIllIl[28] = 0x83 ^ 0x87;
        k.llIlIIllIl[29] = 0x98 ^ 0x9D;
        k.llIlIIllIl[30] = -(0xFFFFFFB6 & 0x36EB) & (0xFFFFFFFF & 0x3EF7);
        k.llIlIIllIl[31] = 0xFFFF8BB5 & 0x7FEB;
        k.llIlIIllIl[32] = 0xFFFFAFBF & 0x5BE7;
        k.llIlIIllIl[33] = -(0xFFFFB3CF & 0x7C3B) & (0xFFFFFBBF & 0x3FFB);
        k.llIlIIllIl[34] = 93 + 27 - 103 + 175 ^ 163 + 67 - 123 + 92;
        k.llIlIIllIl[35] = 12 + 45 - -35 + 37 ^ 135 + 100 - 181 + 83;
        k.llIlIIllIl[36] = 7 ^ 0xE;
        k.llIlIIllIl[37] = 115 + 116 - 87 + 18 ^ 32 + 68 - -61 + 13;
        k.llIlIIllIl[38] = 3 ^ (0x5D ^ 0x3A);
        k.llIlIIllIl[39] = 0xE9 ^ 0xAF ^ (0xE1 ^ 0xC4);
        k.llIlIIllIl[40] = 61 + 49 - 75 + 97 ^ 31 + 117 - 44 + 34;
        k.llIlIIllIl[41] = 0xD4 ^ 0xC6 ^ (0x84 ^ 0x99);
        k.llIlIIllIl[42] = 0x4C ^ 0x71 ^ (6 ^ 0x2B);
        k.llIlIIllIl[43] = 0xBD ^ 0xAC;
        k.llIlIIllIl[44] = 0x3C ^ 0x2E;
        k.llIlIIllIl[45] = 0xA3 ^ 0xB0;
    }

    private static String lIllIIlIIlIII(String var18, String var25) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var1 = var25.toCharArray();
        int var12 = llIlIIllIl[1];
        char[] var8 = var18.toCharArray();
        int var3 = var8.length;
        int var22 = llIlIIllIl[1];
        while (k.lIllIIlIllIlI(var22, var3)) {
            char var14 = var8[var22];
            var5.append((char)(var14 ^ var1[var12 % var1.length]));
            0;
            ++var12;
            ++var22;
            0;
            if (-(0x8E ^ 0x8A) <= 0) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    private static boolean lIllIIlIlIIll(int n2) {
        return n2 < 0;
    }

    private static boolean lIllIIlIlIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (k.lIllIIlIllIII(Skills.getLevel((Skill)Skill.RANGED), llIlIIllIl[39])) {
            bl = llIlIIllIl[0];
            0;
            if ((128 + 79 - 72 + 57 ^ 112 + 86 - 38 + 37) == 0) {
                return ((152 + 24 - 97 + 157 ^ 122 + 51 - 84 + 94) & (0x65 ^ 0x2E ^ (0x22 ^ 0x32) ^ -1)) != 0;
            }
        } else {
            bl = llIlIIllIl[1];
        }
        return bl;
    }

    private static void lIllIIlIIllII() {
        llIlIIllII = new String[llIlIIllIl[45]];
        k.llIlIIllII[k.llIlIIllIl[1]] = k."Navigating to bank";
        k.llIlIIllII[k.llIlIIllIl[0]] = k."Handling banking";
        k.llIlIIllII[k.llIlIIllIl[10]] = k."Eat";
        k.llIlIIllII[k.llIlIIllIl[20]] = k."Nav to souls";
        k.llIlIIllII[k.llIlIIllIl[28]] = k."Soul Wars Portal";
        k.llIlIIllII[k.llIlIIllIl[29]] = k."Enter";
        k.llIlIIllII[k.llIlIIllIl[27]] = k."Climb-up";
        k.llIlIIllII[k.llIlIIllIl[34]] = k."Fighting souls";
        k.llIlIIllII[k.llIlIIllIl[35]] = k."Attacking soul";
        k.llIlIIllII[k.llIlIIllIl[36]] = k."Attack";
        k.llIlIIllII[k.llIlIIllIl[7]] = k."Attacking soull";
        k.llIlIIllII[k.llIlIIllIl[13]] = k."Attack";
        k.llIlIIllII[k.llIlIIllIl[37]] = k."In combat";
        k.llIlIIllII[k.llIlIIllIl[14]] = k."Forgotten Souls";
        k.llIlIIllII[k.llIlIIllIl[40]] = k."Soul";
        k.llIlIIllII[k.llIlIIllIl[41]] = k."Attack";
        k.llIlIIllII[k.llIlIIllIl[42]] = k."Soul";
        k.llIlIIllII[k.llIlIIllIl[43]] = k."Attack";
        k.llIlIIllII[k.llIlIIllIl[44]] = k."Staircase";
    }
}

