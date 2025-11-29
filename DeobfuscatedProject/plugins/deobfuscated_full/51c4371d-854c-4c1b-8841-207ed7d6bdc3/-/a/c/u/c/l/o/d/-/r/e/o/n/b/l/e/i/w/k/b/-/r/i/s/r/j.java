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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import gg.squire.account.AccBuilderBarrows;
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
implements F {
    private static /* synthetic */ String[] lllIlIII;
    private static /* synthetic */ int[] lllIlIIl;

    private static boolean llIIIIIIIIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean T() {
        return lllIlIIl[1];
    }

    private static boolean llIIIIIIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIllllllIlI(String lIIllllllllllIl, String lIIllllllllllII) {
        try {
            SecretKeySpec lIlIIIIIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllllllllllII.getBytes(StandardCharsets.UTF_8)), lllIlIIl[35]), "DES");
            Cipher lIIllllllllllll = Cipher.getInstance("DES");
            lIIllllllllllll.init(lllIlIIl[10], lIlIIIIIIIIIIII);
            return new String(lIIllllllllllll.doFinal(Base64.getDecoder().decode(lIIllllllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlllllllllllI) {
            lIIlllllllllllI.printStackTrace();
            return null;
        }
    }

    private static String lIllllllIll(String lIlIIIIIIIllIlI, String lIlIIIIIIIllllI) {
        lIlIIIIIIIllIlI = new String(Base64.getDecoder().decode(lIlIIIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIIIIIIlllIl = new StringBuilder();
        char[] lIlIIIIIIIlllII = lIlIIIIIIIllllI.toCharArray();
        int lIlIIIIIIIllIll = lllIlIIl[1];
        char[] lIlIIIIIIIlIlIl = lIlIIIIIIIllIlI.toCharArray();
        int lIlIIIIIIIlIlII = lIlIIIIIIIlIlIl.length;
        int lIlIIIIIIIlIIll = lllIlIIl[1];
        while (j.llIIIIIlIlI(lIlIIIIIIIlIIll, lIlIIIIIIIlIlII)) {
            char lIlIIIIIIlIIIII = lIlIIIIIIIlIlIl[lIlIIIIIIIlIIll];
            lIlIIIIIIIlllIl.append((char)(lIlIIIIIIlIIIII ^ lIlIIIIIIIlllII[lIlIIIIIIIllIll % lIlIIIIIIIlllII.length]));
            0;
            ++lIlIIIIIIIllIll;
            ++lIlIIIIIIIlIIll;
            0;
            
            return null;
        }
        return String.valueOf(lIlIIIIIIIlllIl);
    }

    /*
     * WARNING - void declaration
     */
    public static void R() {
        int[] nArray = new int[lllIlIIl[0]];
        nArray[j.lllIlIIl[1]] = lllIlIIl[2];
        if (j.lIlllllllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void lIlIIIIIlIIlIII;
            BankLocation bankLocation = BankLocation.getNearest();
            if (j.llIIIIIIIII(bankLocation) && j.lIlllllllll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lllIlIII[lllIlIIl[1]];
                a.a(bankLocation);
            }
            if (j.llIIIIIIIII(lIlIIIIIlIIlIII) && j.llIIIIIIIIl(lIlIIIIIlIIlIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lllIlIII[lllIlIIl[0]];
                if (j.lIlllllllll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lllIlIIl[3]);
                    0;
                }
                if (j.llIIIIIIIIl(Bank.isOpen() ? 1 : 0)) {
                    if (j.llIIIIIIIlI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lllIlIIl[0]);
                        0;
                    }
                    a.a(lllIlIIl[2], lllIlIIl[4]);
                    a.a(lllIlIIl[5], lllIlIIl[0]);
                    a.a(lllIlIIl[6], lllIlIIl[7]);
                }
            }
        }
        int[] nArray2 = new int[lllIlIIl[0]];
        nArray2[j.lllIlIIl[1]] = lllIlIIl[2];
        if (j.llIIIIIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            j.S();
        }
    }

    private static boolean lIlllllllll(int n2) {
        return n2 == 0;
    }

    private static void lIlllllllIl() {
        lllIlIII = new String[lllIlIIl[45]];
        j.lllIlIII[j.lllIlIIl[1]] = j."Navigating to bank";
        j.lllIlIII[j.lllIlIIl[0]] = j."Handling banking";
        j.lllIlIII[j.lllIlIIl[10]] = j."Eat";
        j.lllIlIII[j.lllIlIIl[20]] = j."Nav to souls";
        j.lllIlIII[j.lllIlIIl[28]] = j."Soul Wars Portal";
        j.lllIlIII[j.lllIlIIl[29]] = j."Enter";
        j.lllIlIII[j.lllIlIIl[27]] = j."Climb-up";
        j.lllIlIII[j.lllIlIIl[34]] = j."Fighting souls";
        j.lllIlIII[j.lllIlIIl[35]] = j."Attacking soul";
        j.lllIlIII[j.lllIlIIl[36]] = j."Attack";
        j.lllIlIII[j.lllIlIIl[7]] = j."Attacking soull";
        j.lllIlIII[j.lllIlIIl[13]] = j."Attack";
        j.lllIlIII[j.lllIlIIl[37]] = j."In combat";
        j.lllIlIII[j.lllIlIIl[14]] = j."Forgotten Souls";
        j.lllIlIII[j.lllIlIIl[40]] = j."Soul";
        j.lllIlIII[j.lllIlIIl[41]] = j."Attack";
        j.lllIlIII[j.lllIlIIl[42]] = j."Soul";
        j.lllIlIII[j.lllIlIIl[43]] = j."Attack";
        j.lllIlIII[j.lllIlIIl[44]] = j."Staircase";
    }

    private static String lIlllllllII(String lIlIIIIIIIIlIII, String lIlIIIIIIIIlIIl) {
        try {
            SecretKeySpec lIlIIIIIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIIIIIIIllII = Cipher.getInstance("Blowfish");
            lIlIIIIIIIIllII.init(lllIlIIl[10], lIlIIIIIIIIllIl);
            return new String(lIlIIIIIIIIllII.doFinal(Base64.getDecoder().decode(lIlIIIIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIIIIIIlIll) {
            lIlIIIIIIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIlIIl(Object object, Object object2) {
        return object == object2;
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, TileObject tileObject) {
        int n2;
        if (j.llIIIIIIIIl(tileObject.getName().contains(lllIlIII[lllIlIIl[44]]) ? 1 : 0) && j.llIIIIIIIIl(worldArea.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
            n2 = lllIlIIl[0];
            0;
            if ((1 ^ 0x25 ^ (0x1C ^ 0x3C)) != (0x52 ^ 0x1E ^ (0xE0 ^ 0xA8))) {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            n2 = lllIlIIl[1];
        }
        return n2 != 0;
    }

    private static boolean llIIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIlIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIllllllllI() {
        lllIlIIl = new int[46];
        j.lllIlIIl[0] = 1;
        j.lllIlIIl[1] = (0xFB ^ 0xBE) & ~(0x2C ^ 0x69);
        j.lllIlIIl[2] = -(0xFFFFFF97 & 0x5A69) & (0xFFFFFB7B & 0x5FFF);
        j.lllIlIIl[3] = 0xFFFFD7CE & 0x3BB9;
        j.lllIlIIl[4] = 0x31 ^ 0x1C ^ (0x80 ^ 0xB5);
        j.lllIlIIl[5] = 0xFFFFB1DD & 0x7F73;
        j.lllIlIIl[6] = -(0xFFFFF7D7 & 0x68BF) & (0xFFFFFFDF & Short.MAX_VALUE);
        j.lllIlIIl[7] = 0x7D ^ 0x11 ^ (0x49 ^ 0x2F);
        j.lllIlIIl[8] = 0xFFFFFBFF & 0xC57;
        j.lllIlIIl[9] = 0xFFFFEFFD & 0x1BB7;
        j.lllIlIIl[10] = 2;
        j.lllIlIIl[11] = -(0xFFFFF62A & 0x5BFF) & (0xFFFFFF79 & 0x5AFF);
        j.lllIlIIl[12] = 0xFFFFAFAE & 0x5BFF;
        j.lllIlIIl[13] = 0x32 ^ 0x39;
        j.lllIlIIl[14] = 0x7C ^ 0x38 ^ (0x7A ^ 0x33);
        j.lllIlIIl[15] = 0xFFFFB87F & 0x4FC9;
        j.lllIlIIl[16] = -(0xFFFFFD7F & 0x72A5) & (0xFFFFFBBE & Short.MAX_VALUE);
        j.lllIlIIl[17] = 0x57 ^ 0x48;
        j.lllIlIIl[18] = 0x2C ^ 0xF;
        j.lllIlIIl[19] = -(0xFFFFD4F7 & 0x3F2B) & (0xFFFFFFBF & 0x1FFF);
        j.lllIlIIl[20] = 3;
        j.lllIlIIl[21] = -(0xFFFFDFB3 & 0x674D) & (0xFFFFFFBF & 0x4F5B);
        j.lllIlIIl[22] = -(0xFFFFFFA7 & 0x655A) & (0xFFFFFFEF & 0x6FD7);
        j.lllIlIIl[23] = 0xFFFFC193 & 0x3F7F;
        j.lllIlIIl[24] = (0x89 ^ 0x91) + (5 ^ 0x4E) - (0xB4 ^ 0x8D) + (65 + 81 - 77 + 141);
        j.lllIlIIl[25] = -(0xFFFFF03D & 0x2FC7) & (0xFFFFAD6D & 0x7E9F);
        j.lllIlIIl[26] = -(0xFFFFF22B & 0x3DF5) & (0xFFFFBDF7 & 0x7FBB);
        j.lllIlIIl[27] = 0xE2 ^ 0xA2 ^ (0x5E ^ 0x18);
        j.lllIlIIl[28] = 0x5A ^ 0x5E;
        j.lllIlIIl[29] = 137 + 105 - 156 + 77 ^ 136 + 132 - 149 + 47;
        j.lllIlIIl[30] = 0xFFFFEC5E & 0x1BF7;
        j.lllIlIIl[31] = -(0xFFFFEF3F & 0x74CB) & (0xFFFFEFBF & 0x7FEB);
        j.lllIlIIl[32] = -(0xFFFFD69F & 0x3D71) & (0xFFFFFFBF & 0x1FF7);
        j.lllIlIIl[33] = -(0xFFFFA76B & 0x7C9F) & (0xFFFFAFFB & 0x7FBF);
        j.lllIlIIl[34] = 0xC ^ 0x41 ^ (0xC1 ^ 0x8B);
        j.lllIlIIl[35] = 113 + 48 - 107 + 101 ^ 48 + 85 - 13 + 27;
        j.lllIlIIl[36] = 0x9E ^ 0x97;
        j.lllIlIIl[37] = 0xA6 ^ 0x9D ^ (0x9E ^ 0xA9);
        j.lllIlIIl[38] = 0xC7 ^ 0xA2 ^ 1;
        j.lllIlIIl[39] = 0x63 ^ 0;
        j.lllIlIIl[40] = 0x22 ^ 0x2C;
        j.lllIlIIl[41] = 59 + 77 - 52 + 44 ^ 17 + 22 - -90 + 14;
        j.lllIlIIl[42] = 0xD ^ 0x1D;
        j.lllIlIIl[43] = 0x4F ^ 0x4A ^ (0x4E ^ 0x5A);
        j.lllIlIIl[44] = 0x15 ^ 7;
        j.lllIlIIl[45] = 0x4F ^ 0x38 ^ (0x6F ^ 0xB);
    }

    /*
     * WARNING - void declaration
     */
    private static void S() {
        NPC lIlIIIIIIllIlIl;
        NPC lIlIIIIIIllIllI;
        void lIlIIIIIIlllIIl;
        WorldPoint worldPoint = new WorldPoint(lllIlIIl[8], lllIlIIl[9], lllIlIIl[10]);
        WorldPoint worldPoint2 = new WorldPoint(lllIlIIl[8], lllIlIIl[9], lllIlIIl[0]);
        WorldArea worldArea = new WorldArea(lllIlIIl[11], lllIlIIl[12], lllIlIIl[13], lllIlIIl[14], lllIlIIl[0]);
        WorldArea worldArea2 = new WorldArea(lllIlIIl[11], lllIlIIl[12], lllIlIIl[13], lllIlIIl[14], lllIlIIl[0]);
        WorldArea worldArea3 = worldArea;
        WorldArea worldArea4 = new WorldArea(lllIlIIl[15], lllIlIIl[16], lllIlIIl[17], lllIlIIl[18], lllIlIIl[1]);
        WorldPoint worldPoint3 = new WorldPoint(lllIlIIl[8], lllIlIIl[19], lllIlIIl[1]);
        if (j.llIIIIIIlII(j.llIIIIIIIll(e.v(), 45.0))) {
            int[] nArray = new int[lllIlIIl[0]];
            nArray[j.lllIlIIl[1]] = lllIlIIl[2];
            if (j.llIIIIIIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIlIIl[0]];
                nArray2[j.lllIlIIl[1]] = lllIlIIl[2];
                Inventory.getFirst((int[])nArray2).interact(lllIlIII[lllIlIIl[10]]);
                Time.sleepTicks((int)lllIlIIl[0]);
                0;
            }
        }
        if (j.lIlllllllll(lIlIIIIIIlllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lIlIIIIIIlllIII;
            AccBuilderBarrows.c = lllIlIII[lllIlIIl[20]];
            lIlIIIIIIllIllI = new WorldArea(lllIlIIl[21], lllIlIIl[22], lllIlIIl[23], lllIlIIl[24], lllIlIIl[1]);
            if (j.lIlllllllll(lIlIIIIIIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lIlIIIIIIllIlIl = new WorldPoint(lllIlIIl[25], lllIlIIl[26], lllIlIIl[1]);
                if (j.llIIIIIIlIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIIIIIllIlIl), lllIlIIl[27])) {
                    Movement.walkTo((WorldPoint)lIlIIIIIIllIlIl);
                    0;
                    Time.sleepTicks((int)lllIlIIl[0]);
                    0;
                }
                if (j.llIIIIIIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIIIIIllIlIl), lllIlIIl[27])) {
                    String[] stringArray = new String[lllIlIIl[0]];
                    stringArray[j.lllIlIIl[1]] = lllIlIII[lllIlIIl[28]];
                    TileObjects.getNearest((String[])stringArray).interact(lllIlIII[lllIlIIl[29]]);
                    Time.sleepTicks((int)lllIlIIl[20]);
                    0;
                }
            }
            if (j.llIIIIIIIIl(lIlIIIIIIllIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && j.lIlllllllll(lIlIIIIIIlllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void lIlIIIIIIllIlll;
                Movement.walkTo((WorldPoint)lIlIIIIIIllIlll);
                0;
                Time.sleepTicks((int)lllIlIIl[0]);
                0;
            }
            if (j.llIIIIIIIIl(lIlIIIIIIlllIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lIlIIIIIIllIlIl = TileObjects.getNearest(arg_0 -> j.a((WorldArea)lIlIIIIIIlllIII, arg_0));
                if (j.llIIIIIIlll(lIlIIIIIIllIlIl)) {
                    WorldPoint[] worldPointArray = new WorldPoint[lllIlIIl[28]];
                    worldPointArray[j.lllIlIIl[1]] = new WorldPoint(lllIlIIl[8], lllIlIIl[19], lllIlIIl[1]);
                    worldPointArray[j.lllIlIIl[0]] = new WorldPoint(lllIlIIl[30], lllIlIIl[31], lllIlIIl[1]);
                    worldPointArray[j.lllIlIIl[10]] = new WorldPoint(lllIlIIl[30], lllIlIIl[32], lllIlIIl[1]);
                    worldPointArray[j.lllIlIIl[20]] = new WorldPoint(lllIlIIl[30], lllIlIIl[33], lllIlIIl[1]);
                    WorldPoint[] lIlIIIIIIllIlII = worldPointArray;
                    Walker.walkAlong(Arrays.asList(lIlIIIIIIllIlII), new HashMap());
                    0;
                }
                if (j.llIIIIIIIII(lIlIIIIIIllIlIl)) {
                    lIlIIIIIIllIlIl.interact(lllIlIII[lllIlIIl[27]]);
                    Time.sleepTicks((int)lllIlIIl[20]);
                    0;
                }
            }
        }
        if (j.llIIIIIIIIl(lIlIIIIIIlllIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (j.llIIIIIIlll(Players.getLocal().getInteracting())) {
                AccBuilderBarrows.c = lllIlIII[lllIlIIl[34]];
                lIlIIIIIIllIllI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.llIIIIIIIIl(nPC.getName().contains(lllIlIII[lllIlIIl[42]]) ? 1 : 0)) {
                        String[] stringArray = new String[lllIlIIl[0]];
                        stringArray[j.lllIlIIl[1]] = lllIlIII[lllIlIIl[43]];
                        if (j.llIIIIIIIIl(nPC.hasAction(stringArray) ? 1 : 0) && j.lIlllllllll(nPC.isDead() ? 1 : 0) && j.llIIIIIIlll(nPC.getInteracting())) {
                            n2 = lllIlIIl[0];
                            0;
                            if (-1 < 2) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lllIlIIl[1];
                    return n2 != 0;
                });
                lIlIIIIIIllIlIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.llIIIIIIIIl(nPC.getName().contains(lllIlIII[lllIlIIl[40]]) ? 1 : 0) && j.lIlllllllll(nPC.isDead() ? 1 : 0)) {
                        String[] stringArray = new String[lllIlIIl[0]];
                        stringArray[j.lllIlIIl[1]] = lllIlIII[lllIlIIl[41]];
                        if (j.llIIIIIIIIl(nPC.hasAction(stringArray) ? 1 : 0) && j.llIIIIIlIIl(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lllIlIIl[0];
                            0;
                            if (((0xD7 ^ 0xC2 ^ (0xA6 ^ 0xAF)) & (0x46 ^ 0xC ^ (0x78 ^ 0x2E) ^ -1)) != 3) return n2 != 0;
                            return ((0x7D ^ 0x54 ^ (0x3D ^ 0x5A)) & (0xE2 ^ 0xA0 ^ (0x7D ^ 0x71) ^ -1)) != 0;
                        }
                    }
                    n2 = lllIlIIl[1];
                    return n2 != 0;
                });
                if (j.llIIIIIIIII(lIlIIIIIIllIllI) && j.llIIIIIIlll(lIlIIIIIIllIlIl)) {
                    AccBuilderBarrows.c = lllIlIII[lllIlIIl[35]];
                    lIlIIIIIIllIllI.interact(lllIlIII[lllIlIIl[36]]);
                    Time.sleepTicks((int)lllIlIIl[10]);
                    0;
                }
                if (j.llIIIIIIIII(lIlIIIIIIllIlIl)) {
                    AccBuilderBarrows.c = lllIlIII[lllIlIIl[7]];
                    lIlIIIIIIllIlIl.interact(lllIlIII[lllIlIIl[13]]);
                    Time.sleepTicks((int)lllIlIIl[20]);
                    0;
                }
            }
            if (j.llIIIIIIIII(Players.getLocal().getInteracting())) {
                AccBuilderBarrows.c = lllIlIII[lllIlIIl[37]];
                Time.sleepTicks((int)lllIlIIl[0]);
                0;
            }
        }
    }

    private static boolean llIIIIIIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public int U() {
        try {
            j.R();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        
        }
        return lllIlIIl[38];
    }

    @Override
    public boolean W() {
        boolean bl;
        if (j.llIIIIIlIII(Skills.getLevel((Skill)Skill.RANGED), lllIlIIl[39])) {
            bl = lllIlIIl[0];
            0;
            if ((0x2D ^ 0x4F ^ (0x18 ^ 0x7F)) == 0) {
                return ((93 + 73 - 42 + 127 ^ 94 + 116 - 24 + 1) & (0xD1 ^ 0x96 ^ (0xBB ^ 0xBC) ^ -1)) != 0;
            }
        } else {
            bl = lllIlIIl[1];
        }
        return bl;
    }

    @Override
    public String V() {
        return lllIlIII[lllIlIIl[14]];
    }

    private static boolean llIIIIIIlIl(int n2, int n3) {
        return n2 > n3;
    }

    static {
        j.lIllllllllI();
        j.lIlllllllIl();
    }

    private static boolean llIIIIIIlII(int n2) {
        return n2 < 0;
    }

    private static boolean llIIIIIIlll(Object object) {
        return object == null;
    }

    private static boolean llIIIIIIIII(Object object) {
        return object != null;
    }

    private static int llIIIIIIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

