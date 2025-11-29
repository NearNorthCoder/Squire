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
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import gg.squire.account.AccBuilderGWD;
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
implements ab {
    private static /* synthetic */ String[] llIIlIlll;
    private static /* synthetic */ int[] llIIllIlI;

    @Override
    public boolean ah() {
        boolean bl;
        if (k.lIlIllIlIlIl(Skills.getLevel((Skill)Skill.RANGED), llIIllIlI[39])) {
            bl = llIIllIlI[0];
            0;
            if (2 != 2) {
                return ((0x9A ^ 0xBA ^ (0x37 ^ 0x3E)) & (4 ^ 0x60 ^ (0xDE ^ 0x93) ^ -1)) != 0;
            }
        } else {
            bl = llIIllIlI[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    private static void ad() {
        NPC lIlIIIlIIIIIll;
        NPC lIlIIIlIIIIlII;
        void lIlIIIlIIIIlll;
        WorldPoint worldPoint = new WorldPoint(llIIllIlI[8], llIIllIlI[9], llIIllIlI[10]);
        WorldPoint worldPoint2 = new WorldPoint(llIIllIlI[8], llIIllIlI[9], llIIllIlI[0]);
        WorldArea worldArea = new WorldArea(llIIllIlI[11], llIIllIlI[12], llIIllIlI[13], llIIllIlI[14], llIIllIlI[0]);
        WorldArea worldArea2 = new WorldArea(llIIllIlI[11], llIIllIlI[12], llIIllIlI[13], llIIllIlI[14], llIIllIlI[0]);
        WorldArea worldArea3 = worldArea;
        WorldArea worldArea4 = new WorldArea(llIIllIlI[15], llIIllIlI[16], llIIllIlI[17], llIIllIlI[18], llIIllIlI[1]);
        WorldPoint worldPoint3 = new WorldPoint(llIIllIlI[8], llIIllIlI[19], llIIllIlI[1]);
        if (k.lIlIllIlIIIl(k.lIlIllIlIIII(e.w(), 45.0))) {
            int[] nArray = new int[llIIllIlI[0]];
            nArray[k.llIIllIlI[1]] = llIIllIlI[2];
            if (k.lIlIllIIlllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIllIlI[0]];
                nArray2[k.llIIllIlI[1]] = llIIllIlI[2];
                Inventory.getFirst((int[])nArray2).interact(llIIlIlll[llIIllIlI[10]]);
                Time.sleepTicks((int)llIIllIlI[0]);
                0;
            }
        }
        if (k.lIlIllIIllII(lIlIIIlIIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void lIlIIIlIIIIllI;
            AccBuilderGWD.c = llIIlIlll[llIIllIlI[20]];
            lIlIIIlIIIIlII = new WorldArea(llIIllIlI[21], llIIllIlI[22], llIIllIlI[23], llIIllIlI[24], llIIllIlI[1]);
            if (k.lIlIllIIllII(lIlIIIlIIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lIlIIIlIIIIIll = new WorldPoint(llIIllIlI[25], llIIllIlI[26], llIIllIlI[1]);
                if (k.lIlIllIlIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIIlIIIIIll), llIIllIlI[27])) {
                    Movement.walkTo((WorldPoint)lIlIIIlIIIIIll);
                    0;
                    Time.sleepTicks((int)llIIllIlI[0]);
                    0;
                }
                if (k.lIlIllIlIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lIlIIIlIIIIIll), llIIllIlI[27])) {
                    String[] stringArray = new String[llIIllIlI[0]];
                    stringArray[k.llIIllIlI[1]] = llIIlIlll[llIIllIlI[28]];
                    TileObjects.getNearest((String[])stringArray).interact(llIIlIlll[llIIllIlI[29]]);
                    Time.sleepTicks((int)llIIllIlI[20]);
                    0;
                }
            }
            if (k.lIlIllIIlllI(lIlIIIlIIIIlII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && k.lIlIllIIllII(lIlIIIlIIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void lIlIIIlIIIIlIl;
                Movement.walkTo((WorldPoint)lIlIIIlIIIIlIl);
                0;
                Time.sleepTicks((int)llIIllIlI[0]);
                0;
            }
            if (k.lIlIllIIlllI(lIlIIIlIIIIllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lIlIIIlIIIIIll = TileObjects.getNearest(arg_0 -> k.a((WorldArea)lIlIIIlIIIIllI, arg_0));
                if (k.lIlIllIlIlII(lIlIIIlIIIIIll)) {
                    WorldPoint[] worldPointArray = new WorldPoint[llIIllIlI[28]];
                    worldPointArray[k.llIIllIlI[1]] = new WorldPoint(llIIllIlI[8], llIIllIlI[19], llIIllIlI[1]);
                    worldPointArray[k.llIIllIlI[0]] = new WorldPoint(llIIllIlI[30], llIIllIlI[31], llIIllIlI[1]);
                    worldPointArray[k.llIIllIlI[10]] = new WorldPoint(llIIllIlI[30], llIIllIlI[32], llIIllIlI[1]);
                    worldPointArray[k.llIIllIlI[20]] = new WorldPoint(llIIllIlI[30], llIIllIlI[33], llIIllIlI[1]);
                    WorldPoint[] lIlIIIlIIIIIlI = worldPointArray;
                    Walker.walkAlong(Arrays.asList(lIlIIIlIIIIIlI), new HashMap());
                    0;
                }
                if (k.lIlIllIIllIl(lIlIIIlIIIIIll)) {
                    lIlIIIlIIIIIll.interact(llIIlIlll[llIIllIlI[27]]);
                    Time.sleepTicks((int)llIIllIlI[20]);
                    0;
                }
            }
        }
        if (k.lIlIllIIlllI(lIlIIIlIIIIlll.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (k.lIlIllIlIlII(Players.getLocal().getInteracting())) {
                AccBuilderGWD.c = llIIlIlll[llIIllIlI[34]];
                lIlIIIlIIIIlII = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIlIllIIlllI(nPC.getName().contains(llIIlIlll[llIIllIlI[42]]) ? 1 : 0)) {
                        String[] stringArray = new String[llIIllIlI[0]];
                        stringArray[k.llIIllIlI[1]] = llIIlIlll[llIIllIlI[43]];
                        if (k.lIlIllIIlllI(nPC.hasAction(stringArray) ? 1 : 0) && k.lIlIllIIllII(nPC.isDead() ? 1 : 0) && k.lIlIllIlIlII(nPC.getInteracting())) {
                            n2 = llIIllIlI[0];
                            0;
                            if (((0xEE ^ 0xC4) & ~(0x77 ^ 0x5D)) == 0) return n2 != 0;
                            return ((0x57 ^ 0x50) & ~(0x6D ^ 0x6A)) != 0;
                        }
                    }
                    n2 = llIIllIlI[1];
                    return n2 != 0;
                });
                lIlIIIlIIIIIll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (k.lIlIllIIlllI(nPC.getName().contains(llIIlIlll[llIIllIlI[40]]) ? 1 : 0) && k.lIlIllIIllII(nPC.isDead() ? 1 : 0)) {
                        String[] stringArray = new String[llIIllIlI[0]];
                        stringArray[k.llIIllIlI[1]] = llIIlIlll[llIIllIlI[41]];
                        if (k.lIlIllIIlllI(nPC.hasAction(stringArray) ? 1 : 0) && k.lIlIllIlIllI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = llIIllIlI[0];
                            0;
                            if (((113 + 43 - 139 + 127 ^ 77 + 151 - 158 + 96) & (0xF6 ^ 0xBE ^ (0x1B ^ 0x65) ^ -1)) != (0x67 ^ 0x3E ^ (0xF4 ^ 0xA9))) return n2 != 0;
                            return ((0x12 ^ 0x1A ^ (0x4B ^ 1)) & (0x57 ^ 0x61 ^ (0x76 ^ 2) ^ -1)) != 0;
                        }
                    }
                    n2 = llIIllIlI[1];
                    return n2 != 0;
                });
                if (k.lIlIllIIllIl(lIlIIIlIIIIlII) && k.lIlIllIlIlII(lIlIIIlIIIIIll)) {
                    AccBuilderGWD.c = llIIlIlll[llIIllIlI[35]];
                    lIlIIIlIIIIlII.interact(llIIlIlll[llIIllIlI[36]]);
                    Time.sleepTicks((int)llIIllIlI[10]);
                    0;
                }
                if (k.lIlIllIIllIl(lIlIIIlIIIIIll)) {
                    AccBuilderGWD.c = llIIlIlll[llIIllIlI[7]];
                    lIlIIIlIIIIIll.interact(llIIlIlll[llIIllIlI[13]]);
                    Time.sleepTicks((int)llIIllIlI[20]);
                    0;
                }
            }
            if (k.lIlIllIIllIl(Players.getLocal().getInteracting())) {
                AccBuilderGWD.c = llIIlIlll[llIIllIlI[37]];
                Time.sleepTicks((int)llIIllIlI[0]);
                0;
            }
        }
    }

    private static boolean lIlIllIIllIl(Object object) {
        return object != null;
    }

    private static boolean lIlIllIlIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIllIlIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlIlIllllIl(String lIlIIIIllIIIII, String lIlIIIIlIlllll) {
        lIlIIIIllIIIII = new String(Base64.getDecoder().decode(lIlIIIIllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIIIlIllllI = new StringBuilder();
        char[] lIlIIIIlIlllIl = lIlIIIIlIlllll.toCharArray();
        int lIlIIIIlIlllII = llIIllIlI[1];
        char[] lIlIIIIlIlIllI = lIlIIIIllIIIII.toCharArray();
        int lIlIIIIlIlIlIl = lIlIIIIlIlIllI.length;
        int lIlIIIIlIlIlII = llIIllIlI[1];
        while (k.lIlIllIlIlll(lIlIIIIlIlIlII, lIlIIIIlIlIlIl)) {
            char lIlIIIIllIIIIl = lIlIIIIlIlIllI[lIlIIIIlIlIlII];
            lIlIIIIlIllllI.append((char)(lIlIIIIllIIIIl ^ lIlIIIIlIlllIl[lIlIIIIlIlllII % lIlIIIIlIlllIl.length]));
            0;
            ++lIlIIIIlIlllII;
            ++lIlIIIIlIlIlII;
            0;
            if (1 >= 1) continue;
            return null;
        }
        return String.valueOf(lIlIIIIlIllllI);
    }

    @Override
    public boolean ae() {
        return llIIllIlI[1];
    }

    private static boolean lIlIllIIllII(int n2) {
        return n2 == 0;
    }

    private static int lIlIllIlIIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    static {
        k.lIlIllIIlIll();
        k.lIlIllIIIIll();
    }

    private static void lIlIllIIlIll() {
        llIIllIlI = new int[46];
        k.llIIllIlI[0] = 1;
        k.llIIllIlI[1] = (0x6F ^ 0x5A) & ~(0xD ^ 0x38);
        k.llIIllIlI[2] = -(0xFFFFF5A7 & 0x1E5D) & (0xFFFFBF7F & 0x55FF);
        k.llIIllIlI[3] = -(0xFFFFBEF3 & 0x6D3F) & (0xFFFFFFFE & 0x3FBB);
        k.llIIllIlI[4] = 0x72 ^ 0x6A;
        k.llIIllIlI[5] = 0xFFFFF95D & 0x37F3;
        k.llIIllIlI[6] = -(0xFFFFD535 & 0x6ACF) & (0xFFFFDFFF & 0x7F4D);
        k.llIIllIlI[7] = 0xAE ^ 0xA4;
        k.llIIllIlI[8] = -(138 + 55 - 62 + 38) & (0xFFFFAFFF & 0x58FF);
        k.llIIllIlI[9] = 0xFFFFFBFD & 0xFB7;
        k.llIIllIlI[10] = 2;
        k.llIIllIlI[11] = 0xFFFFFD53 & 0xAFC;
        k.llIIllIlI[12] = -(0xFFFFB8D7 & 0x7779) & (0xFFFFFFFF & 0x3BFE);
        k.llIIllIlI[13] = 0xE3 ^ 0xC4 ^ (0x2B ^ 7);
        k.llIIllIlI[14] = 0x56 ^ 0x5B;
        k.llIIllIlI[15] = 0xFFFFFAFB & 0xD4D;
        k.llIIllIlI[16] = -(0xFFFFDBEF & 0x3452) & (0xFFFFBBFF & 0x5FDB);
        k.llIIllIlI[17] = 0xAF ^ 0xB2 ^ 2;
        k.llIIllIlI[18] = 0xBB ^ 0x98;
        k.llIIllIlI[19] = 0xFFFFBFDF & 0x4BBD;
        k.llIIllIlI[20] = 3;
        k.llIIllIlI[21] = 0xFFFF887B & 0x7F9F;
        k.llIIllIlI[22] = 0xFFFFCFE6 & 0x3ADF;
        k.llIIllIlI[23] = -(0xFFFFFBBD & 0x5CE7) & (0xFFFFFFF7 & 0x59BF);
        k.llIIllIlI[24] = (0x62 ^ 0x79) + (0x19 ^ 0x47) - (0xE8 ^ 0x80) + (60 + 168 - 52 + 59);
        k.llIIllIlI[25] = 0xFFFFAD3B & 0x5ECD;
        k.llIIllIlI[26] = 0xFFFFCFBB & 0x3DD7;
        k.llIIllIlI[27] = 0x93 ^ 0x95;
        k.llIIllIlI[28] = 0x23 ^ 0x27;
        k.llIIllIlI[29] = 0x1B ^ 0x1E;
        k.llIIllIlI[30] = -(0xFFFFD72A & 0x29FF) & (0xFFFFB9FF & 0x4F7F);
        k.llIIllIlI[31] = -(0xFFFFFD7F & 0x76D7) & (0xFFFFFFF7 & Short.MAX_VALUE);
        k.llIIllIlI[32] = -(0xFFFFFDB9 & 0x765F) & (0xFFFFFFBF & Short.MAX_VALUE);
        k.llIIllIlI[33] = 0xFFFFDFF3 & 0x2BBD;
        k.llIIllIlI[34] = 175 + 6 - 123 + 118 ^ 58 + 128 - 61 + 58;
        k.llIIllIlI[35] = 75 + 133 - 154 + 129 ^ 104 + 43 - 33 + 77;
        k.llIIllIlI[36] = 0xD ^ 4;
        k.llIIllIlI[37] = 0xB4 ^ 0xB8;
        k.llIIllIlI[38] = 0x62 ^ 6;
        k.llIIllIlI[39] = 0x39 ^ 0x5A;
        k.llIIllIlI[40] = 0xB4 ^ 0xBA;
        k.llIIllIlI[41] = 0x94 ^ 0x9B;
        k.llIIllIlI[42] = 0x2E ^ 0x3E;
        k.llIIllIlI[43] = 0xE9 ^ 0xBF ^ (0x3D ^ 0x7A);
        k.llIIllIlI[44] = 0x8F ^ 0x9D;
        k.llIIllIlI[45] = 0x27 ^ 8 ^ (0x27 ^ 0x1B);
    }

    private static void lIlIllIIIIll() {
        llIIlIlll = new String[llIIllIlI[45]];
        k.llIIlIlll[k.llIIllIlI[1]] = k."Navigating to bank";
        k.llIIlIlll[k.llIIllIlI[0]] = k."Handling banking";
        k.llIIlIlll[k.llIIllIlI[10]] = k."Eat";
        k.llIIlIlll[k.llIIllIlI[20]] = k."Nav to souls";
        k.llIIlIlll[k.llIIllIlI[28]] = k."Soul Wars Portal";
        k.llIIlIlll[k.llIIllIlI[29]] = k."Enter";
        k.llIIlIlll[k.llIIllIlI[27]] = k."Climb-up";
        k.llIIlIlll[k.llIIllIlI[34]] = k."Fighting souls";
        k.llIIlIlll[k.llIIllIlI[35]] = k."Attacking soul";
        k.llIIlIlll[k.llIIllIlI[36]] = k."Attack";
        k.llIIlIlll[k.llIIllIlI[7]] = k."Attacking soull";
        k.llIIlIlll[k.llIIllIlI[13]] = k."Attack";
        k.llIIlIlll[k.llIIllIlI[37]] = k."In combat";
        k.llIIlIlll[k.llIIllIlI[14]] = k."Forgotten Souls";
        k.llIIlIlll[k.llIIllIlI[40]] = k."Soul";
        k.llIIlIlll[k.llIIllIlI[41]] = k."Attack";
        k.llIIlIlll[k.llIIllIlI[42]] = k."Soul";
        k.llIIlIlll[k.llIIllIlI[43]] = k."Attack";
        k.llIIlIlll[k.llIIllIlI[44]] = k."Staircase";
    }

    private static String lIlIlIlllllI(String lIlIIIIlllIIII, String lIlIIIIllIllIl) {
        try {
            SecretKeySpec lIlIIIIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIIllIllIl.getBytes(StandardCharsets.UTF_8)), llIIllIlI[35]), "DES");
            Cipher lIlIIIIlllIIlI = Cipher.getInstance("DES");
            lIlIIIIlllIIlI.init(llIIllIlI[10], lIlIIIIlllIIll);
            return new String(lIlIIIIlllIIlI.doFinal(Base64.getDecoder().decode(lIlIIIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIIlllIIIl) {
            lIlIIIIlllIIIl.printStackTrace();
            return null;
        }
    }

    private static /* synthetic */ boolean a(WorldArea worldArea, TileObject tileObject) {
        int n2;
        if (k.lIlIllIIlllI(tileObject.getName().contains(llIIlIlll[llIIllIlI[44]]) ? 1 : 0) && k.lIlIllIIlllI(worldArea.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
            n2 = llIIllIlI[0];
            0;
            if (((0x4B ^ 0x12) & ~(0xCF ^ 0x96)) != 0) {
                return ((0xE8 ^ 0xC2) & ~(0x99 ^ 0xB3) & ~((0xD0 ^ 0x98) & ~(0x8E ^ 0xC6))) != 0;
            }
        } else {
            n2 = llIIllIlI[1];
        }
        return n2 != 0;
    }

    private static String lIlIllIIIIIl(String lIlIIIIlIIlIll, String lIlIIIIlIIlIlI) {
        try {
            SecretKeySpec lIlIIIIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIIIlIIllIl = Cipher.getInstance("Blowfish");
            lIlIIIIlIIllIl.init(llIIllIlI[10], lIlIIIIlIIlllI);
            return new String(lIlIIIIlIIllIl.doFinal(Base64.getDecoder().decode(lIlIIIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIIlIIllII) {
            lIlIIIIlIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIllIlIlII(Object object) {
        return object == null;
    }

    @Override
    public String ag() {
        return llIIlIlll[llIIllIlI[14]];
    }

    private static boolean lIlIllIlIIIl(int n2) {
        return n2 < 0;
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
        if (3 < 0) {
            return (126 + 120 - 200 + 82 ^ 110 + 41 - 105 + 136) & (0x53 ^ 0x72 ^ (0xA0 ^ 0xB7) ^ -1);
        }
        return llIIllIlI[38];
    }

    private static boolean lIlIllIIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIllIIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void ac() {
        int[] nArray = new int[llIIllIlI[0]];
        nArray[k.llIIllIlI[1]] = llIIllIlI[2];
        if (k.lIlIllIIllII(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void lIlIIIlIIlIllI;
            BankLocation bankLocation = BankLocation.getNearest();
            if (k.lIlIllIIllIl(bankLocation) && k.lIlIllIIllII(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIIlIlll[llIIllIlI[1]];
                a.a(bankLocation);
            }
            if (k.lIlIllIIllIl(lIlIIIlIIlIllI) && k.lIlIllIIlllI(lIlIIIlIIlIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderGWD.c = llIIlIlll[llIIllIlI[0]];
                if (k.lIlIllIIllII(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)llIIllIlI[3]);
                    0;
                }
                if (k.lIlIllIIlllI(Bank.isOpen() ? 1 : 0)) {
                    if (k.lIlIllIIllll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)llIIllIlI[0]);
                        0;
                    }
                    a.a(llIIllIlI[2], llIIllIlI[4]);
                    a.a(llIIllIlI[5], llIIllIlI[0]);
                    a.a(llIIllIlI[6], llIIllIlI[7]);
                }
            }
        }
        int[] nArray2 = new int[llIIllIlI[0]];
        nArray2[k.llIIllIlI[1]] = llIIllIlI[2];
        if (k.lIlIllIIlllI(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            k.ad();
        }
    }

    private static boolean lIlIllIlIIlI(int n2, int n3) {
        return n2 > n3;
    }
}

