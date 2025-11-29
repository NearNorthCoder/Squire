/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Production
 */
package h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.K_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.a_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.b_Unknown;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.d;
import h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.f_Unknown;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class U_Unknown
implements K {
    private static /* synthetic */ int[] lIllIllIll;
    public static final /* synthetic */ int kA;
    public static final /* synthetic */ int kB;
    public static /* synthetic */ boolean bn;
    public static final /* synthetic */ WorldPoint kD;
    public static /* synthetic */ List<d> bp;
    public static final /* synthetic */ WorldPoint kE;
    public static final /* synthetic */ int kC;
    private static /* synthetic */ String[] lIllIlIlIl;

    @Override
    public int ad() {
        U.dj();
        return lIllIllIll[33];
    }

    private static void lIIllIlIIIIll() {
        lIllIlIlIl = new String[lIllIllIll[41]];
        U.lIllIlIlIl[U.lIllIllIll[0]] = U."Buying items";
        U.lIllIlIlIl[U.lIllIllIll[1]] = U."Finished buying items, switching back to cooking";
        U.lIllIlIlIl[U.lIllIllIll[2]] = U."Navigating to bank";
        U.lIllIlIlIl[U.lIllIllIll[3]] = U."Handling banking";
        U.lIllIlIlIl[U.lIllIllIll[7]] = U."We are missing supplies, switching to BUYING";
        U.lIllIlIlIl[U.lIllIllIll[10]] = U."We are missing supplies, switching to BUYING";
        U.lIllIlIlIl[U.lIllIllIll[12]] = U."We are missing supplies, switching to BUYING";
        U.lIllIlIlIl[U.lIllIllIll[15]] = U."Equiping duel";
        U.lIllIlIlIl[U.lIllIllIll[16]] = U."Wear";
        U.lIllIlIlIl[U.lIllIllIll[17]] = U."Navigate to range";
        U.lIllIlIlIl[U.lIllIllIll[18]] = U."Cooking";
        U.lIllIlIlIl[U.lIllIllIll[19]] = U."Range";
        U.lIllIlIlIl[U.lIllIllIll[20]] = U."Cook";
        U.lIllIlIlIl[U.lIllIllIll[34]] = U."Cooking";
        U.lIllIlIlIl[U.lIllIllIll[36]] = U."ring of wealth (";
        U.lIllIlIlIl[U.lIllIllIll[5]] = U."ring of dueling(";
    }

    private static boolean lIIllIlIIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIllIlIIlIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllIlIIllII(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String ae() {
        return lIllIlIlIl[lIllIllIll[34]];
    }

    private static void lIIllIlIIIlII() {
        lIllIllIll = new int[42];
        U.lIllIllIll[0] = (0x6E ^ 0x4A ^ (0x65 ^ 0x6F)) & (7 ^ 0x19 ^ (0xA0 ^ 0x90) ^ -1);
        U.lIllIllIll[1] = 1;
        U.lIllIllIll[2] = 2;
        U.lIllIllIll[3] = 3;
        U.lIllIllIll[4] = 0xFFFFDFD9 & 0x33AE;
        U.lIllIllIll[5] = 36 + 126 - 120 + 109 ^ 86 + 144 - 218 + 140;
        U.lIllIllIll[6] = -(0xFFFFFECB & 0x6B77) & (0xFFFFFBFF & 0x6F7F);
        U.lIllIllIll[7] = 0x8B ^ 0x8F;
        U.lIllIllIll[8] = 0xC ^ 0x12;
        U.lIllIllIll[9] = -(0xFFFFF63D & 0x4FF3) & (0xFFFFFF7F & 0x47FF);
        U.lIllIllIll[10] = 0x22 ^ 0x2B ^ (0x80 ^ 0x8C);
        U.lIllIllIll[11] = -(0xFFFFDFFB & 0x3A05) & (0xFFFFBB77 & 0x5FEF);
        U.lIllIllIll[12] = 8 ^ 0x70 ^ (0x21 ^ 0x5F);
        U.lIllIllIll[13] = 0xFFFFDBFB & 0x2DFC;
        U.lIllIllIll[14] = 0xBD ^ 0xA4;
        U.lIllIllIll[15] = 0x56 ^ 0x51;
        U.lIllIllIll[16] = 0x24 ^ 0x2C;
        U.lIllIllIll[17] = 81 + 86 - 79 + 44 ^ 131 + 41 - 45 + 14;
        U.lIllIllIll[18] = 0x2F ^ 0x25;
        U.lIllIllIll[19] = 105 + 41 - 93 + 86 ^ 27 + 56 - 62 + 107;
        U.lIllIllIll[20] = 0x46 ^ 0x71 ^ (7 ^ 0x3C);
        U.lIllIllIll[21] = -(0x2F ^ 0x2B) & (0xFFFFFDFF & 0xFFEB);
        U.lIllIllIll[22] = 176 + 124 - 150 + 100;
        U.lIllIllIll[23] = -(0xFFFFEADF & 0x5F31) & (0xFFFFDF3F & 0x6BFC);
        U.lIllIllIll[24] = 0xFFFFC7F5 & 0x39FE;
        U.lIllIllIll[25] = 96 + 43 - 66 + 127;
        U.lIllIllIll[26] = 0x31 ^ 0x25;
        U.lIllIllIll[27] = 0xFFFFDFDF & 0x27F0;
        U.lIllIllIll[28] = 0xFFFFAEEF & 0x7FDC;
        U.lIllIllIll[29] = 0xFFFFE7E9 & 0x79BE;
        U.lIllIllIll[30] = -(0xFFFFEBF5 & 0x54BB) & (0xFFFFFFFF & 0x5FF7);
        U.lIllIllIll[31] = 0x23 ^ 0x51 ^ (0x1E ^ 0x44);
        U.lIllIllIll[32] = -(0xFFFFCC7A & 0x778F) & (0xFFFFCFBF & 0x77CD);
        U.lIllIllIll[33] = 0x27 ^ 0x43;
        U.lIllIllIll[34] = 0x75 ^ 0x78;
        U.lIllIllIll[35] = 4 ^ 0x77 ^ (0x9B ^ 0x8B);
        U.lIllIllIll[36] = 0xA4 ^ 0xA3 ^ (0xB0 ^ 0xB9);
        U.lIllIllIll[37] = -(0xFFFFFFD9 & 0x612F) & (0xFFFFFFCD & 0x6DFF);
        U.lIllIllIll[38] = -(0xFFFFFF9F & 0x73F2) & (0xFFFFFFF5 & 0x7FFB);
        U.lIllIllIll[39] = -(0xFFFFFFB2 & 0x437F) & (0xFFFFDFFF & 0x6FF9);
        U.lIllIllIll[40] = -(0xFFFFEBB3 & 0x745D) & (0xFFFFFEFC & 0x6D7F);
        U.lIllIllIll[41] = 0x7D ^ 0x6D;
    }

    @Override
    public boolean af() {
        boolean bl;
        if (U.lIIllIlIIlIlI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[35])) {
            bl = lIllIllIll[1];
            0;
            if ((0x29 ^ 0x2C) == 0) {
                return false;
            }
        } else {
            bl = lIllIllIll[0];
        }
        return bl;
    }

    static {
        U.lIIllIlIIIlII();
        U.lIIllIlIIIIll();
        kA = lIllIllIll[6];
        kC = lIllIllIll[11];
        kB = lIllIllIll[9];
        kD = new WorldPoint(lIllIllIll[37], lIllIllIll[38], lIllIllIll[0]);
        kE = new WorldPoint(lIllIllIll[39], lIllIllIll[40], lIllIllIll[0]);
        bp = new ArrayList<d>();
    }

    private static boolean lIIllIlIIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIIllIIlIlllI(String var17, String var16) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(lIllIllIll[2], var19);
            return new String(var23.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ac() {
        return lIllIllIll[0];
    }

    private static String lIIllIIlIllll(String var22, String var20) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var2 = var20.toCharArray();
        int var1 = lIllIllIll[0];
        char[] var9 = var22.toCharArray();
        int var6 = var9.length;
        int var21 = lIllIllIll[0];
        while (U.lIIllIlIIIllI(var21, var6)) {
            char var11 = var9[var21];
            var8.append((char)(var11 ^ var2[var1 % var2.length]));
            0;
            ++var1;
            ++var21;
            0;
            if ((0xD4 ^ 0x86 ^ (0x28 ^ 0x7E)) != -1) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    private static boolean lIIllIlIIlIIl(int n2) {
        return n2 > 0;
    }

    private static boolean lIIllIlIIlIII(Object object) {
        return object != null;
    }

    private static boolean lIIllIlIIIlll(int n2) {
        return n2 == 0;
    }

    public static void dj() {
        if (U.lIIllIlIIIlIl(bn ? 1 : 0)) {
            AccBuilderShamans.c = lIllIlIlIl[lIllIllIll[0]];
            b.a(bp);
            if (U.lIIllIlIIIllI(bp.size(), lIllIllIll[1])) {
                System.out.println(lIllIlIlIl[lIllIllIll[1]]);
                bn = lIllIllIll[0];
            }
        }
        if (U.lIIllIlIIIlll(bn ? 1 : 0)) {
            BankLocation var10;
            if (U.lIIllIlIIIlll(U.al() ? 1 : 0)) {
                var10 = BankLocation.getNearest();
                if (U.lIIllIlIIlIII(var10) && U.lIIllIlIIIlll(var10.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIlIlIl[lIllIllIll[2]];
                    a.a(var10);
                }
                if (U.lIIllIlIIlIII(var10) && U.lIIllIlIIIlIl(var10.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIlIlIl[lIllIllIll[3]];
                    if (U.lIIllIlIIIlll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIllIllIll[4]);
                        0;
                    }
                    if (U.lIIllIlIIIlIl(Bank.isOpen() ? 1 : 0)) {
                        if (U.lIIllIlIIlIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIllIllIll[1]);
                            0;
                        }
                        if (U.lIIllIlIIlIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIllIllIll[2]);
                            0;
                        }
                    }
                    if (U.lIIllIlIIIllI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[5])) {
                        int[] nArray = new int[lIllIllIll[1]];
                        nArray[U.lIllIllIll[0]] = lIllIllIll[6];
                        if (U.lIIllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            U.O();
                            System.out.println(lIllIlIlIl[lIllIllIll[7]]);
                            bn = lIllIllIll[1];
                            return;
                        }
                    }
                    if (U.lIIllIlIIlIlI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[5]) && U.lIIllIlIIIllI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[8])) {
                        int[] nArray = new int[lIllIllIll[1]];
                        nArray[U.lIllIllIll[0]] = lIllIllIll[9];
                        if (U.lIIllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            U.O();
                            System.out.println(lIllIlIlIl[lIllIllIll[10]]);
                            bn = lIllIllIll[1];
                            return;
                        }
                    }
                    if (U.lIIllIlIIlIlI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[8])) {
                        int[] nArray = new int[lIllIllIll[1]];
                        nArray[U.lIllIllIll[0]] = lIllIllIll[11];
                        if (U.lIIllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            U.O();
                            System.out.println(lIllIlIlIl[lIllIllIll[12]]);
                            bn = lIllIllIll[1];
                            return;
                        }
                    }
                    int[] nArray = new int[lIllIllIll[1]];
                    nArray[U.lIllIllIll[0]] = lIllIllIll[13];
                    if (U.lIIllIlIIIlll(Equipment.contains((int[])nArray) ? 1 : 0) && U.lIIllIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(kE), lIllIllIll[14])) {
                        a.b(f.aM, lIllIllIll[1]);
                        Time.sleepTicks((int)lIllIllIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllIllIll[1]];
                            nArray[U.lIllIllIll[0]] = lIllIllIll[13];
                            if (U.lIIllIlIIlIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIllIllIll[1];
                                0;
                                if (-(0x9A ^ 0x9F) >= 0) {
                                    return false;
                                }
                            } else {
                                bl = lIllIllIll[0];
                            }
                            return bl;
                        }, (int)lIllIllIll[4]);
                        0;
                    }
                    if (U.lIIllIlIIIllI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[5])) {
                        Bank.withdrawAll((int)lIllIllIll[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIllIllIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllIllIll[1]];
                            nArray[U.lIllIllIll[0]] = lIllIllIll[6];
                            if (U.lIIllIlIIlIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIllIllIll[1];
                                0;
                                if (3 < 3) {
                                    return ((0xF ^ 0x55 ^ (0xD8 ^ 0x9F)) & (0xEA ^ 0x83 ^ (0x31 ^ 0x45) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIllIllIll[0];
                            }
                            return bl;
                        }, (int)lIllIllIll[4]);
                        0;
                    }
                    if (U.lIIllIlIIlIlI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[5]) && U.lIIllIlIIIllI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[8])) {
                        Bank.withdrawAll((int)lIllIllIll[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIllIllIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllIllIll[1]];
                            nArray[U.lIllIllIll[0]] = lIllIllIll[9];
                            if (U.lIIllIlIIlIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIllIllIll[1];
                                0;
                                if ((92 + 154 - 130 + 41 ^ 45 + 63 - -8 + 37) != (150 + 0 - 7 + 33 ^ 62 + 136 - 189 + 171)) {
                                    return ((133 + 135 - 249 + 132 ^ 126 + 49 - 115 + 92) & (0xE3 ^ 0xAB ^ (0x66 ^ 0x21) ^ -1)) != 0;
                                }
                            } else {
                                bl = lIllIllIll[0];
                            }
                            return bl;
                        }, (int)lIllIllIll[4]);
                        0;
                    }
                    if (U.lIIllIlIIlIlI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[8])) {
                        Bank.withdrawAll((int)lIllIllIll[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIllIllIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIllIllIll[1]];
                            nArray[U.lIllIllIll[0]] = lIllIllIll[11];
                            if (U.lIIllIlIIlIIl(Inventory.getCount((int[])nArray))) {
                                bl = lIllIllIll[1];
                                0;
                                if (3 < 3) {
                                    return false;
                                }
                            } else {
                                bl = lIllIllIll[0];
                            }
                            return bl;
                        }, (int)lIllIllIll[4]);
                        0;
                    }
                }
            }
            if (U.lIIllIlIIIlIl(U.al() ? 1 : 0)) {
                int[] nArray = new int[lIllIllIll[1]];
                nArray[U.lIllIllIll[0]] = lIllIllIll[13];
                if (U.lIIllIlIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIllIllIll[1]];
                    nArray2[U.lIllIllIll[0]] = lIllIllIll[13];
                    if (U.lIIllIlIIIlll(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIlIlIl[lIllIllIll[15]];
                        int[] nArray3 = new int[lIllIllIll[1]];
                        nArray3[U.lIllIllIll[0]] = lIllIllIll[13];
                        var10 = Inventory.getFirst((int[])nArray3);
                        if (U.lIIllIlIIlIII(var10)) {
                            var10.interact(lIllIlIlIl[lIllIllIll[16]]);
                            Time.sleepTicks((int)lIllIllIll[3]);
                            0;
                        }
                    }
                }
                if (U.lIIllIlIIlIll(Players.getLocal().getWorldLocation().distanceTo(kE), lIllIllIll[10])) {
                    AccBuilderShamans.c = lIllIlIlIl[lIllIllIll[17]];
                    Movement.walkTo((WorldPoint)kE);
                    0;
                    Time.sleepTicks((int)lIllIllIll[7]);
                    0;
                }
                if (U.lIIllIlIIllII(Players.getLocal().getWorldLocation().distanceTo(kE), lIllIllIll[10])) {
                    AccBuilderShamans.c = lIllIlIlIl[lIllIllIll[18]];
                    String[] stringArray = new String[lIllIllIll[1]];
                    stringArray[U.lIllIllIll[0]] = lIllIlIlIl[lIllIllIll[19]];
                    var10 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
                    if (U.lIIllIlIIlIII(var10)) {
                        if (U.lIIllIlIIIlll(Production.isOpen() ? 1 : 0)) {
                            var10.interact(lIllIlIlIl[lIllIllIll[20]]);
                            Time.sleepTicks((int)lIllIllIll[2]);
                            0;
                            Time.sleepUntil(() -> Production.isOpen(), (int)lIllIllIll[4]);
                            0;
                        }
                        if (U.lIIllIlIIIlIl(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption((int)lIllIllIll[1]);
                            Time.sleepTicks((int)lIllIllIll[7]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (!U.lIIllIlIIIlIl(U.al() ? 1 : 0) || U.lIIllIlIIIlIl(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIllIllIll[1];
                                    0;
                                    if ((138 + 102 - 71 + 2 ^ 130 + 165 - 212 + 92) < -1) {
                                        return ((84 + 12 - -23 + 85 ^ 5 + 195 - 193 + 192) & (0x6E ^ 0x45 ^ (0xA6 ^ 0x86) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIllIllIll[0];
                                }
                                return bl;
                            }, (int)lIllIllIll[21]);
                            0;
                        }
                    }
                }
            }
        }
    }

    private static boolean lIIllIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean al() {
        boolean bl;
        if (U.lIIllIlIIlIlI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[8])) {
            boolean bl2;
            int[] nArray = new int[lIllIllIll[1]];
            nArray[U.lIllIllIll[0]] = lIllIllIll[11];
            if (U.lIIllIlIIlIIl(Inventory.getCount((int[])nArray))) {
                bl2 = lIllIllIll[1];
                0;
                if ((0x46 ^ 0x42) < 2) {
                    return false;
                }
            } else {
                bl2 = lIllIllIll[0];
            }
            return bl2;
        }
        if (U.lIIllIlIIlIlI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[5]) && U.lIIllIlIIIllI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[8])) {
            boolean bl3;
            int[] nArray = new int[lIllIllIll[1]];
            nArray[U.lIllIllIll[0]] = lIllIllIll[9];
            if (U.lIIllIlIIlIIl(Inventory.getCount((int[])nArray))) {
                bl3 = lIllIllIll[1];
                0;
                if (1 != 1) {
                    return false;
                }
            } else {
                bl3 = lIllIllIll[0];
            }
            return bl3;
        }
        int[] nArray = new int[lIllIllIll[1]];
        nArray[U.lIllIllIll[0]] = lIllIllIll[6];
        if (U.lIIllIlIIlIIl(Inventory.getCount((int[])nArray))) {
            bl = lIllIllIll[1];
            0;
            
            }
        } else {
            bl = lIllIllIll[0];
        }
        return bl;
    }

    private static void O() {
        d var15;
        Object var4;
        Object var13;
        if (U.lIIllIlIIIllI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[5])) {
            d d2 = new d(lIllIllIll[6], lIllIllIll[22], lIllIllIll[23]);
            bp.add(d2);
            0;
        }
        if (U.lIIllIlIIlIlI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[5]) && U.lIIllIlIIIllI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[8])) {
            var13 = new d(lIllIllIll[9], lIllIllIll[24], lIllIllIll[25]);
            bp.add((d)var13);
            0;
        }
        if (U.lIIllIlIIlIlI(Skills.getLevel((Skill)Skill.COOKING), lIllIllIll[8])) {
            var13 = new d(lIllIllIll[11], lIllIllIll[24], lIllIllIll[25]);
            bp.add((d)var13);
            0;
        }
        if (U.lIIllIlIIIlll(Bank.contains(var13 = item -> item.getName().toLowerCase().contains(lIllIlIlIl[lIllIllIll[5]])) ? 1 : 0)) {
            var4 = new d(lIllIllIll[13], lIllIllIll[26], lIllIllIll[27]);
            bp.add((d)var4);
            0;
        }
        if (U.lIIllIlIIIlll(Bank.contains(var4 = item -> item.getName().toLowerCase().contains(lIllIlIlIl[lIllIllIll[36]])) ? 1 : 0)) {
            var15 = new d(lIllIllIll[28], lIllIllIll[10], lIllIllIll[29]);
            bp.add(var15);
            0;
        }
        int[] nArray = new int[lIllIllIll[1]];
        nArray[U.lIllIllIll[0]] = lIllIllIll[30];
        if (U.lIIllIlIIIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            var15 = new d(lIllIllIll[30], lIllIllIll[31], lIllIllIll[32]);
            bp.add(var15);
            0;
        }
    }

    private static String lIIllIIllIIII(String var5, String var3) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), lIllIllIll[16]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(lIllIllIll[2], var7);
            return new String(var14.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }
}

