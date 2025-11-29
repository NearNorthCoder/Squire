/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-;

import gg.squire.account.AccBuilderEasyClues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.W;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.a;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.b;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.d;
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.e;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

public class ai
implements W {
    private static final /* synthetic */ WorldPoint lZ;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lIIlIllII;
    public static /* synthetic */ List<d> bv;
    private static final /* synthetic */ WorldPoint lW;
    private static final /* synthetic */ int lS;
    public static /* synthetic */ boolean bW;
    private static final /* synthetic */ WorldPoint lX;
    private static /* synthetic */ String[] lIIlIlIlI;
    private static final /* synthetic */ List<WorldPoint> mb;
    private static final /* synthetic */ int lT;
    private static final /* synthetic */ int lR;
    private static final /* synthetic */ int lU;
    private static final /* synthetic */ WorldArea ma;
    private static final /* synthetic */ int lV;
    private static final /* synthetic */ WorldPoint lY;

    public static void eb() {
        if (ai.lllllIIIlll(mb.isEmpty() ? 1 : 0)) {
            mb.add(lW);
            0;
            mb.add(lX);
            0;
            mb.add(lY);
            0;
            mb.add(lZ);
            0;
        }
        if (ai.lllllIIIlll(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[0]];
            b.a(bv);
            if (ai.lllllIIlIII(bv.size(), lIIlIllII[1])) {
                System.out.println(lIIlIlIlI[lIIlIllII[1]]);
                bt = lIIlIllII[0];
            }
        }
        if (ai.lllllIIlIIl(bt ? 1 : 0)) {
            Object lIIIIlIllIllIIl;
            if (ai.lllllIIlIIl(ai.ab() ? 1 : 0) && ai.lllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0)) {
                lIIIIlIllIllIIl = BankLocation.getNearest();
                if (ai.lllllIIlIlI(lIIIIlIllIllIIl) && ai.lllllIIlIIl(lIIIIlIllIllIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[2]];
                    a.a((BankLocation)lIIIIlIllIllIIl);
                }
                if (ai.lllllIIlIlI(lIIIIlIllIllIIl) && ai.lllllIIIlll(lIIIIlIllIllIIl.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (ai.lllllIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[3]];
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIllII[4]);
                        0;
                    }
                    if (ai.lllllIIIlll(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[5]];
                        if (ai.lllllIIlIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIlIllII[1]);
                            0;
                        }
                        int[] nArray = new int[lIIlIllII[1]];
                        nArray[ai.lIIlIllII[0]] = ai.ec();
                        if (ai.lllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            ai.af();
                            System.out.println(lIIlIlIlI[lIIlIllII[6]]);
                            bt = lIIlIllII[1];
                            return;
                        }
                        int[] nArray2 = new int[lIIlIllII[1]];
                        nArray2[ai.lIIlIllII[0]] = lIIlIllII[7];
                        if (ai.lllllIIlIII(Inventory.getCount((int[])nArray2), lIIlIllII[1])) {
                            Bank.withdraw((int)lIIlIllII[7], (int)lIIlIllII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks((int)lIIlIllII[1]);
                            0;
                        }
                        int[] nArray3 = new int[lIIlIllII[1]];
                        nArray3[ai.lIIlIllII[0]] = lIIlIllII[7];
                        if (ai.lllllIIlIll(Inventory.getCount((int[])nArray3))) {
                            int[] nArray4 = new int[lIIlIllII[1]];
                            nArray4[ai.lIIlIllII[0]] = ai.ec();
                            if (ai.lllllIIlIII(Inventory.getCount((int[])nArray4), lIIlIllII[1])) {
                                Bank.withdrawAll((int)ai.ec(), (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks((int)lIIlIllII[1]);
                                0;
                                Time.sleepUntil(() -> {
                                    boolean bl;
                                    int[] nArray = new int[lIIlIllII[1]];
                                    nArray[ai.lIIlIllII[0]] = ai.ec();
                                    if (ai.lllllIIlIll(Inventory.getCount((int[])nArray))) {
                                        bl = lIIlIllII[1];
                                        0;
                                        if (-3 >= 0) {
                                            return false;
                                        }
                                    } else {
                                        bl = lIIlIllII[0];
                                    }
                                    return bl;
                                }, (int)lIIlIllII[4]);
                                0;
                            }
                        }
                    }
                }
            }
            if (ai.lllllIIIlll(ai.ab() ? 1 : 0)) {
                if (ai.lllllIIlIIl(ma.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[8]];
                    Movement.walkTo((WorldPoint)lW);
                    0;
                    Time.sleepTicks((int)lIIlIllII[2]);
                    0;
                }
                if (ai.lllllIIIlll(ma.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] stringArray = new String[lIIlIllII[2]];
                    stringArray[ai.lIIlIllII[0]] = lIIlIlIlI[lIIlIllII[9]];
                    stringArray[ai.lIIlIllII[1]] = lIIlIlIlI[lIIlIllII[10]];
                    lIIIIlIllIllIIl = TileObjects.getAt((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray).stream().filter(tileObject -> {
                        boolean bl;
                        if (ai.lllllIIlIlI(tileObject)) {
                            bl = lIIlIllII[1];
                            0;
                            if (-(4 ^ 1) >= 0) {
                                return false;
                            }
                        } else {
                            bl = lIIlIllII[0];
                        }
                        return bl;
                    }).collect(Collectors.toList());
                    if (ai.lllllIIlIIl(lIIIIlIllIllIIl.isEmpty() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[11]];
                        Movement.walkTo((WorldPoint)mb.get(e.c(lIIlIllII[0], lIIlIllII[3])));
                        0;
                        Time.sleepTicks((int)lIIlIllII[1]);
                        0;
                    }
                    if (ai.lllllIIIlll(lIIIIlIllIllIIl.isEmpty() ? 1 : 0) && ai.lllllIIlIIl(Players.getLocal().isAnimating() ? 1 : 0) && ai.lllllIIlIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIlIlIlI[lIIlIllII[12]];
                        int[] nArray = new int[lIIlIllII[1]];
                        nArray[ai.lIIlIllII[0]] = ai.ec();
                        int lIIIIlIllIllIII = Inventory.getCount((int[])nArray);
                        int[] nArray5 = new int[lIIlIllII[1]];
                        nArray5[ai.lIIlIllII[0]] = lIIlIllII[7];
                        Item lIIIIlIllIlIlll = Inventory.getFirst((int[])nArray5);
                        int[] nArray6 = new int[lIIlIllII[1]];
                        nArray6[ai.lIIlIllII[0]] = ai.ec();
                        Item lIIIIlIllIlIllI = Inventory.getFirst((int[])nArray6);
                        if (ai.lllllIIlIlI(lIIIIlIllIlIlll) && ai.lllllIIlIlI(lIIIIlIllIlIllI)) {
                            lIIIIlIllIlIlll.useOn(lIIIIlIllIlIllI);
                            Time.sleepTicks((int)lIIlIllII[3]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                int[] nArray = new int[lIIlIllII[1]];
                                nArray[ai.lIIlIllII[0]] = ai.ec();
                                if (!ai.lllllIIllII(Inventory.getCount((int[])nArray), lIIIIlIllIllIII) || !ai.lllllIIIlll(Players.getLocal().isAnimating() ? 1 : 0) || ai.lllllIIIlll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIlIllII[1];
                                    0;
                                    if (((0xCD ^ 0xAE) & ~(0x17 ^ 0x74)) != 0) {
                                        return (3 & ~3) != 0;
                                    }
                                } else {
                                    bl = lIIlIllII[0];
                                }
                                return bl;
                            }, (int)lIIlIllII[13]);
                            0;
                            Time.sleepTicks((int)lIIlIllII[2]);
                            0;
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[36])) {
            bl = lIIlIllII[1];
            0;
            if (((212 + 143 - 122 + 13 ^ 25 + 12 - -118 + 6) & (48 + 76 - -2 + 1 ^ (0x27 ^ 0xF) ^ -1)) >= 1) {
                return ((0xC1 ^ 0xBF ^ (0x57 ^ 0x34)) & (0xFA ^ 0x9A ^ (0x4C ^ 0x31) ^ -1)) != 0;
            }
        } else {
            bl = lIIlIllII[0];
        }
        return bl;
    }

    private static void lllllIIIllI() {
        lIIlIllII = new int[46];
        ai.lIIlIllII[0] = (8 ^ 0x2A ^ (0x16 ^ 0x6C)) & (0x39 ^ 0x41 ^ (0xAC ^ 0x8C) ^ -1);
        ai.lIIlIllII[1] = 1;
        ai.lIIlIllII[2] = 2;
        ai.lIIlIllII[3] = 3;
        ai.lIIlIllII[4] = -(0xFFFFCEF4 & 0x352F) & (0xFFFFDFBB & 0x37EF);
        ai.lIIlIllII[5] = 0xB9 ^ 0xBD;
        ai.lIIlIllII[6] = 0xF1 ^ 0x99 ^ (0x63 ^ 0xE);
        ai.lIIlIllII[7] = -(0xFFFFE9A1 & 0x1EDF) & (0xFFFF8EDF & 0x7BEE);
        ai.lIIlIllII[8] = 0x6F ^ 0x69;
        ai.lIIlIllII[9] = 14 + 163 - 50 + 41 ^ 83 + 157 - 195 + 130;
        ai.lIIlIllII[10] = 0xBA ^ 0xB2;
        ai.lIIlIllII[11] = 0x9D ^ 0x94;
        ai.lIIlIllII[12] = 0xCF ^ 0x95 ^ (0xF9 ^ 0xA9);
        ai.lIIlIllII[13] = -(0xFFFFE7D1 & 0x3CEF) & (0xFFFFEFFC & 0x7EFB);
        ai.lIIlIllII[14] = 0x14 ^ 0x6F ^ (0xDD ^ 0xA9);
        ai.lIIlIllII[15] = 0x3B ^ 0x25;
        ai.lIIlIllII[16] = 0xFFFFA5FB & 0x5FF5;
        ai.lIIlIllII[17] = 0x23 ^ 0xE;
        ai.lIIlIllII[18] = -(0xFFFFFE11 & 0x29FF) & (0xFFFFBFFF & 0x6DFF);
        ai.lIIlIllII[19] = -(0xFFFFB697 & 0x6B79) & (0xFFFFF7FF & 0x2FFD);
        ai.lIIlIllII[20] = -(0xFFFFB14B & 0x6EBD) & (0xFFFFFFEF & 0x25FF);
        ai.lIIlIllII[21] = -(0xFFFFEE79 & 0x79EF) & (0xFFFFFFFD & 0x69FA);
        ai.lIIlIllII[22] = 143 + 4 - 53 + 71;
        ai.lIIlIllII[23] = 128 + 98 - 152 + 69 + (0x61 ^ 0xD) - (139 + 50 - 112 + 119) + (0xBD ^ 0xC5);
        ai.lIIlIllII[24] = -(0xFFFFFB41 & 0x7CBF) & (0xFFFFFFBD & 0x7AFE);
        ai.lIIlIllII[25] = 0x67 ^ 0x50 ^ (0xEC ^ 0x81);
        ai.lIIlIllII[26] = -(0xFFFFFFCB & 0x403D) & (0xFFFFDFFC & 0x67DB);
        ai.lIIlIllII[27] = 0xF9 ^ 0xBE ^ (0x66 ^ 0x60);
        ai.lIIlIllII[28] = -(0xFFFFF762 & 0x7C9F) & (0xFFFFFDF5 & 0x7FCF);
        ai.lIIlIllII[29] = 0xFFFFAFFF & 0x7ECC;
        ai.lIIlIllII[30] = 0xFFFFF3FC & 0x6DAB;
        ai.lIIlIllII[31] = 0xFFFFFF4F & 0x1FF7;
        ai.lIIlIllII[32] = 0xE9 ^ 0xC1;
        ai.lIIlIllII[33] = -(0xFFFFFA5F & 0x55B4) & (0xFFFFDB9F & 0x77F7);
        ai.lIIlIllII[34] = 229 + 196 - 233 + 41 ^ 3 + 8 - -50 + 80;
        ai.lIIlIllII[35] = 0xE0 ^ 0xB8 ^ (0xC9 ^ 0x9A);
        ai.lIIlIllII[36] = 0x1E ^ 0x58 ^ (0x12 ^ 0x37);
        ai.lIIlIllII[37] = 0x82 ^ 0x8E;
        ai.lIIlIllII[38] = -(0xFFFFB643 & 0x7BBD) & (0xFFFFBEFF & 0x7F7F);
        ai.lIIlIllII[39] = 0xFFFFEDF7 & 0x1F6F;
        ai.lIIlIllII[40] = 0xFFFFFDF6 & 0xF6F;
        ai.lIIlIllII[41] = 0xFFFFFFE7 & 0xD7D;
        ai.lIIlIllII[42] = -(0xFFFFDF6F & 0x609B) & (0xFFFFFFEF & 0x4D7E);
        ai.lIIlIllII[43] = 0xFFFFBD6A & 0x4EFF;
        ai.lIIlIllII[44] = 3 ^ (0x95 ^ 0x81);
        ai.lIIlIllII[45] = 0x9E ^ 0xAA ^ (0xB1 ^ 0x88);
    }

    static {
        ai.lllllIIIllI();
        ai.lllllIIIlII();
        lR = lIIlIllII[20];
        lS = lIIlIllII[16];
        lT = lIIlIllII[18];
        lV = lIIlIllII[7];
        lU = lIIlIllII[19];
        lW = new WorldPoint(lIIlIllII[38], lIIlIllII[39], lIIlIllII[0]);
        lX = new WorldPoint(lIIlIllII[38], lIIlIllII[40], lIIlIllII[0]);
        lY = new WorldPoint(lIIlIllII[38], lIIlIllII[41], lIIlIllII[0]);
        lZ = new WorldPoint(lIIlIllII[38], lIIlIllII[42], lIIlIllII[0]);
        ma = new WorldArea(lIIlIllII[43], lIIlIllII[42], lIIlIllII[44], lIIlIllII[6], lIIlIllII[0]);
        mb = new ArrayList<WorldPoint>();
        bv = new ArrayList<d>();
    }

    private static void lllllIIIlII() {
        lIIlIlIlI = new String[lIIlIllII[45]];
        ai.lIIlIlIlI[ai.lIIlIllII[0]] = ai."Buying Items";
        ai.lIIlIlIlI[ai.lIIlIllII[1]] = ai."Finished buying items, switching back to firemaking";
        ai.lIIlIlIlI[ai.lIIlIllII[2]] = ai."Navigating to bank";
        ai.lIIlIlIlI[ai.lIIlIllII[3]] = ai."Opening bank";
        ai.lIIlIlIlI[ai.lIIlIllII[5]] = ai."Handling banking";
        ai.lIIlIlIlI[ai.lIIlIllII[6]] = ai."We are missing supplies, switching to BUYING";
        ai.lIIlIlIlI[ai.lIIlIllII[8]] = ai."Navigating to FM tile";
        ai.lIIlIlIlI[ai.lIIlIllII[9]] = ai."Fire";
        ai.lIIlIlIlI[ai.lIIlIllII[10]] = ai."Jack-O-Lantern";
        ai.lIIlIlIlI[ai.lIIlIllII[11]] = ai."Walking to empty tile";
        ai.lIIlIlIlI[ai.lIIlIllII[12]] = ai."Lighting log";
        ai.lIIlIlIlI[ai.lIIlIllII[35]] = ai."Firemaking";
        ai.lIIlIlIlI[ai.lIIlIllII[37]] = ai."ring of wealth (";
    }

    private static boolean lllllIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lllllIIIIIl(String lIIIIlIlIIlllll, String lIIIIlIlIIllllI) {
        try {
            SecretKeySpec lIIIIlIlIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIIlIlIIllllI.getBytes(StandardCharsets.UTF_8)), lIIlIllII[10]), "DES");
            Cipher lIIIIlIlIlIIIll = Cipher.getInstance("DES");
            lIIIIlIlIlIIIll.init(lIIlIllII[2], lIIIIlIlIlIIlII);
            return new String(lIIIIlIlIlIIIll.doFinal(Base64.getDecoder().decode(lIIIIlIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlIlIlIIIlI) {
            lIIIIlIlIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lllllIIIIlI(String lIIIIlIlIlIlllI, String lIIIIlIlIlIllIl) {
        try {
            SecretKeySpec lIIIIlIlIllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIIlIlIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIIlIlIllIIII = Cipher.getInstance("Blowfish");
            lIIIIlIlIllIIII.init(lIIlIllII[2], lIIIIlIlIllIIIl);
            return new String(lIIIIlIlIllIIII.doFinal(Base64.getDecoder().decode(lIIIIlIlIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIIlIlIlIllll) {
            lIIIIlIlIlIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lllllIIlIlI(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ab() {
        int n2;
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[14]) && ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[15])) {
            int n3;
            int[] nArray = new int[lIIlIllII[1]];
            nArray[ai.lIIlIllII[0]] = lIIlIllII[7];
            if (ai.lllllIIlIll(Inventory.getCount((int[])nArray))) {
                int[] nArray2 = new int[lIIlIllII[1]];
                nArray2[ai.lIIlIllII[0]] = lIIlIllII[16];
                if (ai.lllllIIlIll(Inventory.getCount((int[])nArray2))) {
                    n3 = lIIlIllII[1];
                    0;
                    if (-(0x29 ^ 0x27 ^ (3 ^ 9)) <= 0) return n3 != 0;
                    return ((0x27 ^ 0x7D ^ (0x2F ^ 0x2A)) & (230 + 69 - 267 + 207 ^ 98 + 112 - 164 + 130 ^ -1)) != 0;
                }
            }
            n3 = lIIlIllII[0];
            return n3 != 0;
        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[15]) && ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[17])) {
            int n4;
            int[] nArray = new int[lIIlIllII[1]];
            nArray[ai.lIIlIllII[0]] = lIIlIllII[7];
            if (ai.lllllIIlIll(Inventory.getCount((int[])nArray))) {
                int[] nArray3 = new int[lIIlIllII[1]];
                nArray3[ai.lIIlIllII[0]] = lIIlIllII[18];
                if (ai.lllllIIlIll(Inventory.getCount((int[])nArray3))) {
                    n4 = lIIlIllII[1];
                    0;
                    if ((1 ^ (0x5D ^ 0x58)) >= 2) return n4 != 0;
                    return false;
                }
            }
            n4 = lIIlIllII[0];
            return n4 != 0;
        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[17])) {
            int n5;
            int[] nArray = new int[lIIlIllII[1]];
            nArray[ai.lIIlIllII[0]] = lIIlIllII[7];
            if (ai.lllllIIlIll(Inventory.getCount((int[])nArray))) {
                int[] nArray4 = new int[lIIlIllII[1]];
                nArray4[ai.lIIlIllII[0]] = lIIlIllII[19];
                if (ai.lllllIIlIll(Inventory.getCount((int[])nArray4))) {
                    n5 = lIIlIllII[1];
                    0;
                    if (2 <= (142 + 99 - 90 + 10 ^ 38 + 128 - 16 + 15)) return n5 != 0;
                    return ((0x30 ^ 0x16 ^ (0x51 ^ 0x33)) & (94 + 127 - 184 + 94 ^ 188 + 98 - 123 + 36 ^ -1)) != 0;
                }
            }
            n5 = lIIlIllII[0];
            return n5 != 0;
        }
        int[] nArray = new int[lIIlIllII[1]];
        nArray[ai.lIIlIllII[0]] = lIIlIllII[7];
        if (ai.lllllIIlIll(Inventory.getCount((int[])nArray))) {
            int[] nArray5 = new int[lIIlIllII[1]];
            nArray5[ai.lIIlIllII[0]] = lIIlIllII[20];
            if (ai.lllllIIlIll(Inventory.getCount((int[])nArray5))) {
                n2 = lIIlIllII[1];
                0;
                if (((0x26 ^ 3) & ~(0x5D ^ 0x78)) >= 0) return n2 != 0;
                return false;
            }
        }
        n2 = lIIlIllII[0];
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lIIlIllII[0];
    }

    @Override
    public int T() {
        ai.eb();
        return lIIlIllII[34];
    }

    private static String lllllIIIIll(String lIIIIlIlIlllllI, String lIIIIlIllIIIIlI) {
        lIIIIlIlIlllllI = new String(Base64.getDecoder().decode(lIIIIlIlIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIIlIllIIIIIl = new StringBuilder();
        char[] lIIIIlIllIIIIII = lIIIIlIllIIIIlI.toCharArray();
        int lIIIIlIlIllllll = lIIlIllII[0];
        char[] lIIIIlIlIlllIIl = lIIIIlIlIlllllI.toCharArray();
        int lIIIIlIlIlllIII = lIIIIlIlIlllIIl.length;
        int lIIIIlIlIllIlll = lIIlIllII[0];
        while (ai.lllllIIlIII(lIIIIlIlIllIlll, lIIIIlIlIlllIII)) {
            char lIIIIlIllIIIlII = lIIIIlIlIlllIIl[lIIIIlIlIllIlll];
            lIIIIlIllIIIIIl.append((char)(lIIIIlIllIIIlII ^ lIIIIlIllIIIIII[lIIIIlIlIllllll % lIIIIlIllIIIIII.length]));
            0;
            ++lIIIIlIlIllllll;
            ++lIIIIlIlIllIlll;
            0;
            if (2 <= (0x82 ^ 0x86)) continue;
            return null;
        }
        return String.valueOf(lIIIIlIllIIIIIl);
    }

    private static boolean lllllIIlIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIIIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lllllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String U() {
        return lIIlIlIlI[lIIlIllII[35]];
    }

    private static int ec() {
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[14]) && ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[15])) {
            return lIIlIllII[16];
        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[15]) && ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[17])) {
            return lIIlIllII[18];
        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[17])) {
            return lIIlIllII[19];
        }
        return lIIlIllII[20];
    }

    private static boolean lllllIIlIll(int n2) {
        return n2 > 0;
    }

    private static void af() {
        d lIIIIlIllIlIIlI;
        Object lIIIIlIllIlIIll;
        if (ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[14])) {
            d d2 = new d(lIIlIllII[20], lIIlIllII[21], e.c(lIIlIllII[22], lIIlIllII[23]));
            bv.add(d2);
            0;
        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[14]) && ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[15])) {
            lIIIIlIllIlIIll = new d(lIIlIllII[16], lIIlIllII[24], lIIlIllII[25]);
            bv.add((d)lIIIIlIllIlIIll);
            0;
        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[15]) && ai.lllllIIlIII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[17])) {
            lIIIIlIllIlIIll = new d(lIIlIllII[18], lIIlIllII[26], lIIlIllII[27]);
            bv.add((d)lIIIIlIllIlIIll);
            0;
        }
        if (ai.lllllIIllII(Skills.getLevel((Skill)Skill.FIREMAKING), lIIlIllII[17])) {
            lIIIIlIllIlIIll = new d(lIIlIllII[19], lIIlIllII[28], lIIlIllII[15]);
            bv.add((d)lIIIIlIllIlIIll);
            0;
        }
        if (ai.lllllIIlIIl(Bank.contains(lIIIIlIllIlIIll = item -> item.getName().toLowerCase().contains(lIIlIlIlI[lIIlIllII[37]])) ? 1 : 0)) {
            lIIIIlIllIlIIlI = new d(lIIlIllII[29], lIIlIllII[6], lIIlIllII[30]);
            bv.add(lIIIIlIllIlIIlI);
            0;
        }
        int[] nArray = new int[lIIlIllII[1]];
        nArray[ai.lIIlIllII[0]] = lIIlIllII[31];
        if (ai.lllllIIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIIIIlIllIlIIlI = new d(lIIlIllII[31], lIIlIllII[32], lIIlIllII[33]);
            bv.add(lIIIIlIllIlIIlI);
            0;
        }
    }
}

