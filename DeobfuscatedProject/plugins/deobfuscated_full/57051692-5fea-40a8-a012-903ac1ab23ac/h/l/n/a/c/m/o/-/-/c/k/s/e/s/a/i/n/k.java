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
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.e;
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

public class k
implements K {
    private static /* synthetic */ int[] lIllIIIIll;
    private static /* synthetic */ String[] lIllIIIIlI;

    private static boolean lIIlIlIllIlIl(int n2) {
        return n2 < 0;
    }

    @Override
    public boolean ac() {
        return lIllIIIIll[1];
    }

    private static boolean lIIlIlIlllIII(Object object) {
        return object == null;
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, TileObject tileObject) {
        int n2;
        if (k.lIIlIlIllIIlI(tileObject.getName().contains(lIllIIIIlI[lIllIIIIll[44]]) ? 1 : 0) && k.lIIlIlIllIIlI(worldArea.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
            n2 = lIllIIIIll[0];
            0;
            if (-(0xC5 ^ 0xC1) > 0) {
                return false;
            }
        } else {
            n2 = lIllIIIIll[1];
        }
        return n2 != 0;
    }

    private static boolean lIIlIlIlllIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private static void ab() {
        NPC var13;
        NPC var25;
        void var23;
        WorldPoint worldPoint = new WorldPoint(lIllIIIIll[8], lIllIIIIll[9], lIllIIIIll[10]);
        WorldPoint worldPoint2 = new WorldPoint(lIllIIIIll[8], lIllIIIIll[9], lIllIIIIll[0]);
        WorldArea worldArea = new WorldArea(lIllIIIIll[11], lIllIIIIll[12], lIllIIIIll[13], lIllIIIIll[14], lIllIIIIll[0]);
        WorldArea worldArea2 = new WorldArea(lIllIIIIll[11], lIllIIIIll[12], lIllIIIIll[13], lIllIIIIll[14], lIllIIIIll[0]);
        WorldArea worldArea3 = worldArea;
        WorldArea worldArea4 = new WorldArea(lIllIIIIll[15], lIllIIIIll[16], lIllIIIIll[17], lIllIIIIll[18], lIllIIIIll[1]);
        WorldPoint worldPoint3 = new WorldPoint(lIllIIIIll[8], lIllIIIIll[19], lIllIIIIll[1]);
        if (k.lIIlIlIllIlIl(k.lIIlIlIllIlII(e.u(), 45.0))) {
            int[] nArray = new int[lIllIIIIll[0]];
            nArray[k.lIllIIIIll[1]] = lIllIIIIll[2];
            if (k.lIIlIlIllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIllIIIIll[0]];
                nArray2[k.lIllIIIIll[1]] = lIllIIIIll[2];
                Inventory.getFirst((int[])nArray2).interact(lIllIIIIlI[lIllIIIIll[10]]);
                Time.sleepTicks((int)lIllIIIIll[0]);
                0;
            }
        }
        if (k.lIIlIlIllIIII(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void var14;
            AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[20]];
            var25 = new WorldArea(lIllIIIIll[21], lIllIIIIll[22], lIllIIIIll[23], lIllIIIIll[24], lIllIIIIll[1]);
            if (k.lIIlIlIllIIII(var25.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var13 = new WorldPoint(lIllIIIIll[25], lIllIIIIll[26], lIllIIIIll[1]);
                if (k.lIIlIlIllIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var13), lIllIIIIll[27])) {
                    Movement.walkTo((WorldPoint)var13);
                    0;
                    Time.sleepTicks((int)lIllIIIIll[0]);
                    0;
                }
                if (k.lIIlIlIllIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var13), lIllIIIIll[27])) {
                    String[] stringArray = new String[lIllIIIIll[0]];
                    stringArray[k.lIllIIIIll[1]] = lIllIIIIlI[lIllIIIIll[28]];
                    TileObjects.getNearest((String[])stringArray).interact(lIllIIIIlI[lIllIIIIll[29]]);
                    Time.sleepTicks((int)lIllIIIIll[20]);
                    0;
                }
            }
            if (k.lIIlIlIllIIlI(var25.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && k.lIIlIlIllIIII(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void var21;
                Movement.walkTo((WorldPoint)var21);
                0;
                Time.sleepTicks((int)lIllIIIIll[0]);
                0;
            }
            if (k.lIIlIlIllIIlI(var14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                var13 = TileObjects.getNearest(arg_0 -> k.a((WorldArea)var14, arg_0));
                if (k.lIIlIlIlllIII(var13)) {
                    WorldPoint[] worldPointArray = new WorldPoint[lIllIIIIll[28]];
                    worldPointArray[k.lIllIIIIll[1]] = new WorldPoint(lIllIIIIll[8], lIllIIIIll[19], lIllIIIIll[1]);
                    worldPointArray[k.lIllIIIIll[0]] = new WorldPoint(lIllIIIIll[30], lIllIIIIll[31], lIllIIIIll[1]);
                    worldPointArray[k.lIllIIIIll[10]] = new WorldPoint(lIllIIIIll[30], lIllIIIIll[32], lIllIIIIll[1]);
                    worldPointArray[k.lIllIIIIll[20]] = new WorldPoint(lIllIIIIll[30], lIllIIIIll[33], lIllIIIIll[1]);
                    WorldPoint[] var6 = worldPointArray;
                    Walker.walkAlong(Arrays.asList(var6), new HashMap());
                    0;
                }
                if (k.lIIlIlIllIIIl(var13)) {
                    var13.interact(lIllIIIIlI[lIllIIIIll[27]]);
                    Time.sleepTicks((int)lIllIIIIll[20]);
                    0;
                }
            }
        }
        if (k.lIIlIlIllIIlI(var23.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (k.lIIlIlIlllIII(Players.getLocal().getInteracting())) {
                AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[34]];
                var25 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIlIlIllIIlI(nPC.getName().contains(lIllIIIIlI[lIllIIIIll[42]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIllIIIIll[0]];
                        stringArray[k.lIllIIIIll[1]] = lIllIIIIlI[lIllIIIIll[43]];
                        if (k.lIIlIlIllIIlI(nPC.hasAction(stringArray) ? 1 : 0) && k.lIIlIlIllIIII(nPC.isDead() ? 1 : 0) && k.lIIlIlIlllIII(nPC.getInteracting())) {
                            n2 = lIllIIIIll[0];
                            0;
                            if (((0xF0 ^ 0x92) & ~(0x18 ^ 0x7A)) == (1 & ~1)) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIllIIIIll[1];
                    return n2 != 0;
                });
                var13 = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIIlIlIllIIlI(nPC.getName().contains(lIllIIIIlI[lIllIIIIll[40]]) ? 1 : 0) && k.lIIlIlIllIIII(nPC.isDead() ? 1 : 0)) {
                        String[] stringArray = new String[lIllIIIIll[0]];
                        stringArray[k.lIllIIIIll[1]] = lIllIIIIlI[lIllIIIIll[41]];
                        if (k.lIIlIlIllIIlI(nPC.hasAction(stringArray) ? 1 : 0) && k.lIIlIlIlllIlI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIllIIIIll[0];
                            0;
                            if (((66 + 9 - 54 + 142 ^ 118 + 102 - 107 + 28) & (113 + 70 - 168 + 113 ^ 157 + 67 - 157 + 107 ^ -1)) == 0) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIllIIIIll[1];
                    return n2 != 0;
                });
                if (k.lIIlIlIllIIIl(var25) && k.lIIlIlIlllIII(var13)) {
                    AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[35]];
                    var25.interact(lIllIIIIlI[lIllIIIIll[36]]);
                    Time.sleepTicks((int)lIllIIIIll[10]);
                    0;
                }
                if (k.lIIlIlIllIIIl(var13)) {
                    AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[7]];
                    var13.interact(lIllIIIIlI[lIllIIIIll[13]]);
                    Time.sleepTicks((int)lIllIIIIll[20]);
                    0;
                }
            }
            if (k.lIIlIlIllIIIl(Players.getLocal().getInteracting())) {
                AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[37]];
                Time.sleepTicks((int)lIllIIIIll[0]);
                0;
            }
        }
    }

    @Override
    public String ae() {
        return lIllIIIIlI[lIllIIIIll[14]];
    }

    private static boolean lIIlIlIllIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public static void aa() {
        int[] nArray = new int[lIllIIIIll[0]];
        nArray[k.lIllIIIIll[1]] = lIllIIIIll[2];
        if (k.lIIlIlIllIIII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void var9;
            BankLocation bankLocation = BankLocation.getNearest();
            if (k.lIIlIlIllIIIl(bankLocation) && k.lIIlIlIllIIII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[1]];
                a.a(bankLocation);
            }
            if (k.lIIlIlIllIIIl(var9) && k.lIIlIlIllIIlI(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderShamans.c = lIllIIIIlI[lIllIIIIll[0]];
                if (k.lIIlIlIllIIII(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIIIIll[3]);
                    0;
                }
                if (k.lIIlIlIllIIlI(Bank.isOpen() ? 1 : 0)) {
                    if (k.lIIlIlIllIIll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIllIIIIll[0]);
                        0;
                    }
                    a.a(lIllIIIIll[2], lIllIIIIll[4]);
                    a.a(lIllIIIIll[5], lIllIIIIll[0]);
                    a.a(lIllIIIIll[6], lIllIIIIll[7]);
                }
            }
        }
        int[] nArray2 = new int[lIllIIIIll[0]];
        nArray2[k.lIllIIIIll[1]] = lIllIIIIll[2];
        if (k.lIIlIlIllIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            k.ab();
        }
    }

    private static boolean lIIlIlIllIIIl(Object object) {
        return object != null;
    }

    private static int lIIlIlIllIlII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void lIIlIlIlIllll() {
        lIllIIIIll = new int[46];
        k.lIllIIIIll[0] = 1;
        k.lIllIIIIll[1] = (6 + 35 - 17 + 138 ^ 26 + 133 - 104 + 86) & (61 + 41 - -4 + 54 ^ 10 + 66 - 14 + 81 ^ -1);
        k.lIllIIIIll[2] = -(0xFFFFFDBF & 0x56C5) & (0xFFFFF7FF & 0x5DFF);
        k.lIllIIIIll[3] = 0xFFFFDB8E & 0x37F9;
        k.lIllIIIIll[4] = 12 + 34 - -85 + 1 ^ 135 + 0 - 89 + 110;
        k.lIllIIIIll[5] = -(0xFFFFFE3B & 0x7EF) & (0xFFFFBF7F & 0x77FB);
        k.lIllIIIIll[6] = 0xFFFFDF5F & 0x3FE9;
        k.lIllIIIIll[7] = 0xA3 ^ 0xA9;
        k.lIllIIIIll[8] = -(0xFFFFD7E7 & 0x7FB9) & (0xFFFFDFF7 & Short.MAX_VALUE);
        k.lIllIIIIll[9] = -(0xFFFFDE69 & 0x71D7) & (0xFFFFFBFF & 0x5FF5);
        k.lIllIIIIll[10] = 2;
        k.lIllIIIIll[11] = -(0xFFFFD2CF & 0x6FBF) & (0xFFFFDADE & 0x6FFF);
        k.lIllIIIIll[12] = -(0xFFFFF2DF & 0x7D71) & (0xFFFFFBFE & Short.MAX_VALUE);
        k.lIllIIIIll[13] = 0x8A ^ 0x81;
        k.lIllIIIIll[14] = 0xB1 ^ 0xA4 ^ (0x89 ^ 0x91);
        k.lIllIIIIll[15] = 0xFFFF9A6B & 0x6DDD;
        k.lIllIIIIll[16] = 0xFFFFEFBE & 0x1BDB;
        k.lIllIIIIll[17] = 112 + 117 - 195 + 110 ^ 63 + 116 - 47 + 11;
        k.lIllIIIIll[18] = 0x76 ^ 0x55;
        k.lIllIIIIll[19] = -(0xFFFFD63B & 0x2DE5) & (0xFFFF9FBF & 0x6FFD);
        k.lIllIIIIll[20] = 3;
        k.lIllIIIIll[21] = -(0xFFFFD7B7 & 0x6ECD) & (0xFFFFFE9F & 0x4FFF);
        k.lIllIIIIll[22] = 0xFFFFAAF6 & 0x5FCF;
        k.lIllIIIIll[23] = 0xFFFFEDD7 & 0x133B;
        k.lIllIIIIll[24] = 17 + 192 - 82 + 103 + (46 + 85 - 14 + 21) - (38 + 9 - 46 + 182) + (0x24 ^ 0x67);
        k.lIllIIIIll[25] = 0xFFFFEC59 & 0x1FAF;
        k.lIllIIIIll[26] = -(0xFFFFE6DF & 0x7965) & (0xFFFFFFFF & 0x6DD7);
        k.lIllIIIIll[27] = 45 + 62 - 53 + 94 ^ 71 + 102 - 106 + 79;
        k.lIllIIIIll[28] = 0x77 ^ 0x73;
        k.lIllIIIIll[29] = 0x19 ^ 0x1C;
        k.lIllIIIIll[30] = 0xFFFF8E56 & 0x79FF;
        k.lIllIIIIll[31] = 0xFFFFDBB9 & 0x2FE7;
        k.lIllIIIIll[32] = -(0xFFFFBC71 & 0x77DF) & (0xFFFFBFFF & 0x7FF7);
        k.lIllIIIIll[33] = -(0xFFFFBE67 & 0x75DF) & (0xFFFFBFF7 & Short.MAX_VALUE);
        k.lIllIIIIll[34] = 0xA7 ^ 0xA0;
        k.lIllIIIIll[35] = 0x8A ^ 0x82;
        k.lIllIIIIll[36] = 3 ^ 0x34 ^ (0xBE ^ 0x80);
        k.lIllIIIIll[37] = 176 + 121 - 130 + 10 ^ 113 + 80 - 167 + 163;
        k.lIllIIIIll[38] = 0xDF ^ 0xBC ^ (0x8F ^ 0x88);
        k.lIllIIIIll[39] = 0x68 ^ 0xB;
        k.lIllIIIIll[40] = 150 + 6 - 107 + 125 ^ 104 + 73 - 91 + 74;
        k.lIllIIIIll[41] = 0x55 ^ 0x10 ^ (0x66 ^ 0x2C);
        k.lIllIIIIll[42] = 0x5C ^ 0x4C;
        k.lIllIIIIll[43] = 94 + 50 - 12 + 12 ^ 111 + 38 - 100 + 80;
        k.lIllIIIIll[44] = 5 ^ 0x2D ^ (0x36 ^ 0xC);
        k.lIllIIIIll[45] = 16 + 20 - -22 + 81 ^ 75 + 25 - -30 + 22;
    }

    @Override
    public int ad() {
        try {
            k.aa();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0xBF ^ 0xBB) <= ((0x6F ^ 0x48) & ~(0xAB ^ 0x8C))) {
            return (0x66 ^ 0x53) & ~(0x50 ^ 0x65);
        }
        return lIllIIIIll[38];
    }

    private static boolean lIIlIlIlllIlI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (k.lIIlIlIlllIIl(Skills.getLevel((Skill)Skill.RANGED), lIllIIIIll[39])) {
            bl = lIllIIIIll[0];
            0;
            
            }
        } else {
            bl = lIllIIIIll[1];
        }
        return bl;
    }

    private static String lIIlIlIlIlIll(String var4, String var1) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), lIllIIIIll[35]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lIllIIIIll[10], var10);
            return new String(var3.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIlIlIllIlll(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIIlIlIlIllIl(String var5, String var22) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var26 = Cipher.getInstance("Blowfish");
            var26.init(lIllIIIIll[10], var18);
            return new String(var26.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    static {
        k.lIIlIlIlIllll();
        k.lIIlIlIlIlllI();
    }

    private static boolean lIIlIlIllIIll(int n2) {
        return n2 > 0;
    }

    private static void lIIlIlIlIlllI() {
        lIllIIIIlI = new String[lIllIIIIll[45]];
        k.lIllIIIIlI[k.lIllIIIIll[1]] = k."Navigating to bank";
        k.lIllIIIIlI[k.lIllIIIIll[0]] = k."Handling banking";
        k.lIllIIIIlI[k.lIllIIIIll[10]] = k."Eat";
        k.lIllIIIIlI[k.lIllIIIIll[20]] = k."Nav to souls";
        k.lIllIIIIlI[k.lIllIIIIll[28]] = k."Soul Wars Portal";
        k.lIllIIIIlI[k.lIllIIIIll[29]] = k."Enter";
        k.lIllIIIIlI[k.lIllIIIIll[27]] = k."Climb-up";
        k.lIllIIIIlI[k.lIllIIIIll[34]] = k."Fighting souls";
        k.lIllIIIIlI[k.lIllIIIIll[35]] = k."Attacking soul";
        k.lIllIIIIlI[k.lIllIIIIll[36]] = k."Attack";
        k.lIllIIIIlI[k.lIllIIIIll[7]] = k."Attacking soull";
        k.lIllIIIIlI[k.lIllIIIIll[13]] = k."Attack";
        k.lIllIIIIlI[k.lIllIIIIll[37]] = k."In combat";
        k.lIllIIIIlI[k.lIllIIIIll[14]] = k."Forgotten Souls";
        k.lIllIIIIlI[k.lIllIIIIll[40]] = k."Soul";
        k.lIllIIIIlI[k.lIllIIIIll[41]] = k."Attack";
        k.lIllIIIIlI[k.lIllIIIIll[42]] = k."Soul";
        k.lIllIIIIlI[k.lIllIIIIll[43]] = k."Attack";
        k.lIllIIIIlI[k.lIllIIIIll[44]] = k."Staircase";
    }

    private static String lIIlIlIlIllII(String var16, String var8) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var12 = var8.toCharArray();
        int var19 = lIllIIIIll[1];
        char[] var17 = var16.toCharArray();
        int var7 = var17.length;
        int var20 = lIllIIIIll[1];
        while (k.lIIlIlIlllIll(var20, var7)) {
            char var11 = var17[var20];
            var2.append((char)(var11 ^ var12[var19 % var12.length]));
            0;
            ++var19;
            ++var20;
            0;
            if ((0x38 ^ 0x3C) != ((0x3D ^ 0x67) & ~(0xC1 ^ 0x9B))) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    private static boolean lIIlIlIllIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIlIlIllIIlI(int n2) {
        return n2 != 0;
    }
}

