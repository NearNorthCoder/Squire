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
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a_Unknown;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e_Unknown;
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
implements W {
    private static /* synthetic */ int[] lIlIIIlll;
    private static /* synthetic */ String[] lIlIIIllI;

    private static /* synthetic */ boolean a(WorldArea worldArea, TileObject tileObject) {
        int n2;
        if (j.lIIIlIIlIIIl(tileObject.getName().contains(lIlIIIllI[lIlIIIlll[44]]) ? 1 : 0) && j.lIIIlIIlIIIl(worldArea.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
            n2 = lIlIIIlll[0];
            0;
            if ((0x18 ^ 6 ^ (0x61 ^ 0x7B)) <= 1) {
                return ((0x64 ^ 0xF ^ (0xED ^ 0xBD)) & (0x36 ^ 1 ^ (0x22 ^ 0x2E) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIIIlll[1];
        }
        return n2 != 0;
    }

    private static void lIIIlIIIlllI() {
        lIlIIIlll = new int[46];
        j.lIlIIIlll[0] = 1;
        j.lIlIIIlll[1] = (0x5B ^ 0x5E) & ~(0x65 ^ 0x60);
        j.lIlIIIlll[2] = -(0xFFFFD6FB & 0x7D05) & (0xFFFFD7FB & 0x7D7F);
        j.lIlIIIlll[3] = -(0xFFFFE87B & 0x1FF7) & (0xFFFF9FFF & 0x7BFA);
        j.lIlIIIlll[4] = 0x78 ^ 0x63 ^ 3;
        j.lIlIIIlll[5] = 0xFFFFB3DB & 0x7D75;
        j.lIlIIIlll[6] = 0xFFFFFF49 & 0x1FFF;
        j.lIlIIIlll[7] = 0xA1 ^ 0xAB;
        j.lIlIIIlll[8] = -(0xFFFFC3B5 & 0x3D4B) & (0xFFFFBD77 & 0x4BDF);
        j.lIlIIIlll[9] = -(0xF5 ^ 0xB4) & (0xFFFFDBFD & 0x2FF7);
        j.lIlIIIlll[10] = 2;
        j.lIlIIIlll[11] = 0xFFFFAE5F & 0x59F0;
        j.lIlIIIlll[12] = 0xFFFFCFBF & 0x3BEE;
        j.lIlIIIlll[13] = 0x42 ^ 0x49;
        j.lIlIIIlll[14] = 0xB5 ^ 0xB8;
        j.lIlIIIlll[15] = 0xFFFFCD59 & 0x3AEF;
        j.lIlIIIlll[16] = -(0xFFFFFF75 & 0x54EB) & (0xFFFFFFFF & 0x5FFA);
        j.lIlIIIlll[17] = 0x68 ^ 0x7B ^ (0x96 ^ 0x9A);
        j.lIlIIIlll[18] = 0x9C ^ 0xBF;
        j.lIlIIIlll[19] = -(0xFFFF9D23 & 0x76FF) & (0xFFFFBFFF & 0x5FBF);
        j.lIlIIIlll[20] = 3;
        j.lIlIIIlll[21] = 0xFFFF9A3F & 0x6DDB;
        j.lIlIIIlll[22] = 0xFFFFDAD6 & 0x2FEF;
        j.lIlIIIlll[23] = 0xFFFFD5BB & 0x2B57;
        j.lIlIIIlll[24] = 53 + 63 - 80 + 115 + (120 + 89 - 154 + 99) - (62 + 116 - 55 + 5) + (0x4C ^ 7);
        j.lIlIIIlll[25] = 0xFFFFAF0D & 0x5CFB;
        j.lIlIIIlll[26] = 0xFFFFFDD7 & 0xFBB;
        j.lIlIIIlll[27] = 22 + 159 - 168 + 172 ^ 155 + 88 - 117 + 65;
        j.lIlIIIlll[28] = 1 ^ 5;
        j.lIlIIIlll[29] = 0x3D ^ 0x38;
        j.lIlIIIlll[30] = -(0xFFFFF9B7 & 0x46EA) & (0xFFFFFBFF & 0x4CF7);
        j.lIlIIIlll[31] = 0xFFFFEFF3 & 0x1BAD;
        j.lIlIIIlll[32] = 0xFFFF9BFF & 0x6FA7;
        j.lIlIIIlll[33] = -(0xFFFFBD5F & 0x52E1) & (0xFFFFFFF5 & 0x1BFB);
        j.lIlIIIlll[34] = 68 + 133 - 166 + 127 ^ 143 + 105 - 117 + 34;
        j.lIlIIIlll[35] = 0x7C ^ 0x74;
        j.lIlIIIlll[36] = 0xE3 ^ 0x82 ^ (0xE3 ^ 0x8B);
        j.lIlIIIlll[37] = 25 + 121 - 76 + 78 ^ 9 + 11 - -101 + 31;
        j.lIlIIIlll[38] = 170 + 147 - 264 + 177 ^ 22 + 4 - 18 + 122;
        j.lIlIIIlll[39] = 0x57 ^ 0x1E ^ (0x58 ^ 0x72);
        j.lIlIIIlll[40] = 0x81 ^ 0x8F;
        j.lIlIIIlll[41] = 0xB0 ^ 0x98 ^ (0x24 ^ 3);
        j.lIlIIIlll[42] = 0xBA ^ 0xAA;
        j.lIlIIIlll[43] = 0xDD ^ 0x9D ^ (0xEB ^ 0xBA);
        j.lIlIIIlll[44] = 0x62 ^ 0x70;
        j.lIlIIIlll[45] = 0x50 ^ 0x43;
    }

    private static boolean lIIIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIIllIl() {
        lIlIIIllI = new String[lIlIIIlll[45]];
        j.lIlIIIllI[j.lIlIIIlll[1]] = j."Navigating to bank";
        j.lIlIIIllI[j.lIlIIIlll[0]] = j."Handling banking";
        j.lIlIIIllI[j.lIlIIIlll[10]] = j."Eat";
        j.lIlIIIllI[j.lIlIIIlll[20]] = j."Nav to souls";
        j.lIlIIIllI[j.lIlIIIlll[28]] = j."Soul Wars Portal";
        j.lIlIIIllI[j.lIlIIIlll[29]] = j."Enter";
        j.lIlIIIllI[j.lIlIIIlll[27]] = j."Climb-up";
        j.lIlIIIllI[j.lIlIIIlll[34]] = j."Fighting souls";
        j.lIlIIIllI[j.lIlIIIlll[35]] = j."Attacking soul";
        j.lIlIIIllI[j.lIlIIIlll[36]] = j."Attack";
        j.lIlIIIllI[j.lIlIIIlll[7]] = j."Attacking soull";
        j.lIlIIIllI[j.lIlIIIlll[13]] = j."Attack";
        j.lIlIIIllI[j.lIlIIIlll[37]] = j."In combat";
        j.lIlIIIllI[j.lIlIIIlll[14]] = j."Forgotten Souls";
        j.lIlIIIllI[j.lIlIIIlll[40]] = j."Soul";
        j.lIlIIIllI[j.lIlIIIlll[41]] = j."Attack";
        j.lIlIIIllI[j.lIlIIIlll[42]] = j."Soul";
        j.lIlIIIllI[j.lIlIIIlll[43]] = j."Attack";
        j.lIlIIIllI[j.lIlIIIlll[44]] = j."Staircase";
    }

    private static String lIIIlIIIlIll(String llllIlIIIlIlIl, String llllIlIIIlIlII) {
        try {
            SecretKeySpec llllIlIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllIlIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllIlIIIlIlll = Cipher.getInstance("Blowfish");
            llllIlIIIlIlll.init(lIlIIIlll[10], llllIlIIIllIII);
            return new String(llllIlIIIlIlll.doFinal(Base64.getDecoder().decode(llllIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlIIIlIllI) {
            llllIlIIIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIlIIII(Object object) {
        return object != null;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (j.lIIIlIIllIIl(Skills.getLevel((Skill)Skill.RANGED), lIlIIIlll[39])) {
            bl = lIlIIIlll[0];
            0;
            if (-2 >= 0) {
                return ((0xE0 ^ 0xBC ^ (0x17 ^ 0x2A)) & (0x1C ^ 0x48 ^ (0x50 ^ 0x65) ^ -1)) != 0;
            }
        } else {
            bl = lIlIIIlll[1];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public static void Q() {
        int[] nArray = new int[lIlIIIlll[0]];
        nArray[j.lIlIIIlll[1]] = lIlIIIlll[2];
        if (j.lIIIlIIIllll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void llllIlIllIIIII;
            BankLocation bankLocation = BankLocation.getNearest();
            if (j.lIIIlIIlIIII(bankLocation) && j.lIIIlIIIllll(bankLocation.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[1]];
                a.a(bankLocation);
            }
            if (j.lIIIlIIlIIII(llllIlIllIIIII) && j.lIIIlIIlIIIl(llllIlIllIIIII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[0]];
                if (j.lIIIlIIIllll(Bank.isOpen() ? 1 : 0)) {
                    a.a();
                    Time.sleepUntil(() -> Bank.isOpen(), (int)lIlIIIlll[3]);
                    0;
                }
                if (j.lIIIlIIlIIIl(Bank.isOpen() ? 1 : 0)) {
                    if (j.lIIIlIIlIIlI(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks((int)lIlIIIlll[0]);
                        0;
                    }
                    a.a(lIlIIIlll[2], lIlIIIlll[4]);
                    a.a(lIlIIIlll[5], lIlIIIlll[0]);
                    a.a(lIlIIIlll[6], lIlIIIlll[7]);
                }
            }
        }
        int[] nArray2 = new int[lIlIIIlll[0]];
        nArray2[j.lIlIIIlll[1]] = lIlIIIlll[2];
        if (j.lIIIlIIlIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) {
            j.R();
        }
    }

    private static boolean lIIIlIIIllll(int n2) {
        return n2 == 0;
    }

    private static String lIIIlIIIllII(String llllIlIIlllIII, String llllIlIIlllIIl) {
        try {
            SecretKeySpec llllIlIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllIlIIlllIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIlll[35]), "DES");
            Cipher llllIlIIllllII = Cipher.getInstance("DES");
            llllIlIIllllII.init(lIlIIIlll[10], llllIlIIllllIl);
            return new String(llllIlIIllllII.doFinal(Base64.getDecoder().decode(llllIlIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllIlIIlllIll) {
            llllIlIIlllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlIIllIII(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    private static void R() {
        NPC llllIlIlIIllIl;
        NPC llllIlIlIIlllI;
        void llllIlIlIlIIIl;
        WorldPoint worldPoint = new WorldPoint(lIlIIIlll[8], lIlIIIlll[9], lIlIIIlll[10]);
        WorldPoint worldPoint2 = new WorldPoint(lIlIIIlll[8], lIlIIIlll[9], lIlIIIlll[0]);
        WorldArea worldArea = new WorldArea(lIlIIIlll[11], lIlIIIlll[12], lIlIIIlll[13], lIlIIIlll[14], lIlIIIlll[0]);
        WorldArea worldArea2 = new WorldArea(lIlIIIlll[11], lIlIIIlll[12], lIlIIIlll[13], lIlIIIlll[14], lIlIIIlll[0]);
        WorldArea worldArea3 = worldArea;
        WorldArea worldArea4 = new WorldArea(lIlIIIlll[15], lIlIIIlll[16], lIlIIIlll[17], lIlIIIlll[18], lIlIIIlll[1]);
        WorldPoint worldPoint3 = new WorldPoint(lIlIIIlll[8], lIlIIIlll[19], lIlIIIlll[1]);
        if (j.lIIIlIIlIlIl(j.lIIIlIIlIIll(e.u(), 45.0))) {
            int[] nArray = new int[lIlIIIlll[0]];
            nArray[j.lIlIIIlll[1]] = lIlIIIlll[2];
            if (j.lIIIlIIlIIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIlIIIlll[0]];
                nArray2[j.lIlIIIlll[1]] = lIlIIIlll[2];
                Inventory.getFirst((int[])nArray2).interact(lIlIIIllI[lIlIIIlll[10]]);
                Time.sleepTicks((int)lIlIIIlll[0]);
                0;
            }
        }
        if (j.lIIIlIIIllll(llllIlIlIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            void llllIlIlIlIIII;
            AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[20]];
            llllIlIlIIlllI = new WorldArea(lIlIIIlll[21], lIlIIIlll[22], lIlIIIlll[23], lIlIIIlll[24], lIlIIIlll[1]);
            if (j.lIIIlIIIllll(llllIlIlIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                llllIlIlIIllIl = new WorldPoint(lIlIIIlll[25], lIlIIIlll[26], lIlIIIlll[1]);
                if (j.lIIIlIIlIllI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIlIlIIllIl), lIlIIIlll[27])) {
                    Movement.walkTo((WorldPoint)llllIlIlIIllIl);
                    0;
                    Time.sleepTicks((int)lIlIIIlll[0]);
                    0;
                }
                if (j.lIIIlIIlIlll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)llllIlIlIIllIl), lIlIIIlll[27])) {
                    String[] stringArray = new String[lIlIIIlll[0]];
                    stringArray[j.lIlIIIlll[1]] = lIlIIIllI[lIlIIIlll[28]];
                    TileObjects.getNearest((String[])stringArray).interact(lIlIIIllI[lIlIIIlll[29]]);
                    Time.sleepTicks((int)lIlIIIlll[20]);
                    0;
                }
            }
            if (j.lIIIlIIlIIIl(llllIlIlIIlllI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && j.lIIIlIIIllll(llllIlIlIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                void llllIlIlIIllll;
                Movement.walkTo((WorldPoint)llllIlIlIIllll);
                0;
                Time.sleepTicks((int)lIlIIIlll[0]);
                0;
            }
            if (j.lIIIlIIlIIIl(llllIlIlIlIIII.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                llllIlIlIIllIl = TileObjects.getNearest(arg_0 -> j.a((WorldArea)llllIlIlIlIIII, arg_0));
                if (j.lIIIlIIllIII(llllIlIlIIllIl)) {
                    WorldPoint[] worldPointArray = new WorldPoint[lIlIIIlll[28]];
                    worldPointArray[j.lIlIIIlll[1]] = new WorldPoint(lIlIIIlll[8], lIlIIIlll[19], lIlIIIlll[1]);
                    worldPointArray[j.lIlIIIlll[0]] = new WorldPoint(lIlIIIlll[30], lIlIIIlll[31], lIlIIIlll[1]);
                    worldPointArray[j.lIlIIIlll[10]] = new WorldPoint(lIlIIIlll[30], lIlIIIlll[32], lIlIIIlll[1]);
                    worldPointArray[j.lIlIIIlll[20]] = new WorldPoint(lIlIIIlll[30], lIlIIIlll[33], lIlIIIlll[1]);
                    WorldPoint[] llllIlIlIIllII = worldPointArray;
                    Walker.walkAlong(Arrays.asList(llllIlIlIIllII), new HashMap());
                    0;
                }
                if (j.lIIIlIIlIIII(llllIlIlIIllIl)) {
                    llllIlIlIIllIl.interact(lIlIIIllI[lIlIIIlll[27]]);
                    Time.sleepTicks((int)lIlIIIlll[20]);
                    0;
                }
            }
        }
        if (j.lIIIlIIlIIIl(llllIlIlIlIIIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (j.lIIIlIIllIII(Players.getLocal().getInteracting())) {
                AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[34]];
                llllIlIlIIlllI = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.lIIIlIIlIIIl(nPC.getName().contains(lIlIIIllI[lIlIIIlll[42]]) ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIIlll[0]];
                        stringArray[j.lIlIIIlll[1]] = lIlIIIllI[lIlIIIlll[43]];
                        if (j.lIIIlIIlIIIl(nPC.hasAction(stringArray) ? 1 : 0) && j.lIIIlIIIllll(nPC.isDead() ? 1 : 0) && j.lIIIlIIllIII(nPC.getInteracting())) {
                            n2 = lIlIIIlll[0];
                            0;
                            if (-3 <= 0) return n2 != 0;
                            return false;
                        }
                    }
                    n2 = lIlIIIlll[1];
                    return n2 != 0;
                });
                llllIlIlIIllIl = NPCs.getNearest(nPC -> {
                    int n2;
                    if (j.lIIIlIIlIIIl(nPC.getName().contains(lIlIIIllI[lIlIIIlll[40]]) ? 1 : 0) && j.lIIIlIIIllll(nPC.isDead() ? 1 : 0)) {
                        String[] stringArray = new String[lIlIIIlll[0]];
                        stringArray[j.lIlIIIlll[1]] = lIlIIIllI[lIlIIIlll[41]];
                        if (j.lIIIlIIlIIIl(nPC.hasAction(stringArray) ? 1 : 0) && j.lIIIlIIllIlI(nPC.getInteracting(), Players.getLocal())) {
                            n2 = lIlIIIlll[0];
                            0;
                            if (null == null) return n2 != 0;
                            return ((0xC5 ^ 0x93 ^ (0x6C ^ 0x68)) & (0xF3 ^ 0x97 ^ (0x37 ^ 1) ^ -1)) != 0;
                        }
                    }
                    n2 = lIlIIIlll[1];
                    return n2 != 0;
                });
                if (j.lIIIlIIlIIII(llllIlIlIIlllI) && j.lIIIlIIllIII(llllIlIlIIllIl)) {
                    AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[35]];
                    llllIlIlIIlllI.interact(lIlIIIllI[lIlIIIlll[36]]);
                    Time.sleepTicks((int)lIlIIIlll[10]);
                    0;
                }
                if (j.lIIIlIIlIIII(llllIlIlIIllIl)) {
                    AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[7]];
                    llllIlIlIIllIl.interact(lIlIIIllI[lIlIIIlll[13]]);
                    Time.sleepTicks((int)lIlIIIlll[20]);
                    0;
                }
            }
            if (j.lIIIlIIlIIII(Players.getLocal().getInteracting())) {
                AccBuilderEasyClues.c = lIlIIIllI[lIlIIIlll[37]];
                Time.sleepTicks((int)lIlIIIlll[0]);
                0;
            }
        }
    }

    private static String lIIIlIIIlIlI(String llllIlIIlIIlIl, String llllIlIIlIlIIl) {
        llllIlIIlIIlIl = new String(Base64.getDecoder().decode(llllIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllIlIIlIlIII = new StringBuilder();
        char[] llllIlIIlIIlll = llllIlIIlIlIIl.toCharArray();
        int llllIlIIlIIllI = lIlIIIlll[1];
        char[] llllIlIIlIIIII = llllIlIIlIIlIl.toCharArray();
        int llllIlIIIlllll = llllIlIIlIIIII.length;
        int llllIlIIIllllI = lIlIIIlll[1];
        while (j.lIIIlIIllIll(llllIlIIIllllI, llllIlIIIlllll)) {
            char llllIlIIlIlIll = llllIlIIlIIIII[llllIlIIIllllI];
            llllIlIIlIlIII.append((char)(llllIlIIlIlIll ^ llllIlIIlIIlll[llllIlIIlIIllI % llllIlIIlIIlll.length]));
            0;
            ++llllIlIIlIIllI;
            ++llllIlIIIllllI;
            0;
            if (-2 <= 0) continue;
            return null;
        }
        return String.valueOf(llllIlIIlIlIII);
    }

    private static int lIIIlIIlIIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIIIlIIlIIlI(int n2) {
        return n2 > 0;
    }

    @Override
    public boolean S() {
        return lIlIIIlll[1];
    }

    @Override
    public String U() {
        return lIlIIIllI[lIlIIIlll[14]];
    }

    private static boolean lIIIlIIlIIIl(int n2) {
        return n2 != 0;
    }

    static {
        j.lIIIlIIIlllI();
        j.lIIIlIIIllIl();
    }

    private static boolean lIIIlIIlIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIIlIlll(int n2, int n3) {
        return n2 <= n3;
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
        if (-1 >= 1) {
            return (0xB9 ^ 0x96) & ~(0xE8 ^ 0xC7);
        }
        return lIlIIIlll[38];
    }

    private static boolean lIIIlIIllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlIIlIlIl(int n2) {
        return n2 < 0;
    }
}

