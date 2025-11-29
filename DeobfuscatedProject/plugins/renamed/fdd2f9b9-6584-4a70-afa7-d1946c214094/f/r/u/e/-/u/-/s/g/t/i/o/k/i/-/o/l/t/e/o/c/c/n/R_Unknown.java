/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n;

import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.G_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.a_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.b_Unknown;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.d;
import f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.f_Unknown;
import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class R_Unknown
implements G {
    private static /* synthetic */ int[] lIIlIlIIII;
    private static /* synthetic */ WorldPoint jr;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] js;
    private static /* synthetic */ WorldPoint jq;
    private static /* synthetic */ String[] lIIlIIllII;
    public static /* synthetic */ WorldArea jp;

    private static boolean lllllIllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllllIIlllIl(String var14, String var15) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIIlIlIIII[2], var1);
            return new String(var11.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean V() {
        boolean bl;
        if (R.lllllIlllIII(Skills.getLevel((Skill)Skill.FISHING), lIIlIlIIII[74])) {
            bl = lIIlIlIIII[1];
            0;
            if ((98 + 100 - 90 + 69 ^ 36 + 47 - 8 + 106) != (0x65 ^ 0x26 ^ (0xF5 ^ 0xB2))) {
                return ((0x4B ^ 0x6A ^ (0x9D ^ 0x94)) & (0x58 ^ 0x56 ^ (0xA6 ^ 0x80) ^ -1)) != 0;
            }
        } else {
            bl = lIIlIlIIII[0];
        }
        return bl;
    }

    private static String lllllIIlllII(String var22, String var20) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIIlIlIIII[13]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIIlIlIIII[2], var23);
            return new String(var18.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    public static boolean dj() {
        int n2;
        String[] stringArray = new String[lIIlIlIIII[1]];
        stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[57]];
        if (R.lllllIllIIll(Inventory.contains((String[])stringArray) ? 1 : 0) && (!R.lllllIllIlIl(Inventory.contains((int[])f.aO) ? 1 : 0) || R.lllllIllIIll(Equipment.contains((int[])f.aO) ? 1 : 0))) {
            n2 = lIIlIlIIII[1];
            0;
            
            }
        } else {
            n2 = lIIlIlIIII[0];
        }
        return n2 != 0;
    }

    private static boolean lllllIlllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static void lllllIllIIlI() {
        lIIlIlIIII = new int[101];
        R.lIIlIlIIII[0] = (0xF5 ^ 0xB5) & ~(0x69 ^ 0x29);
        R.lIIlIlIIII[1] = 1;
        R.lIIlIlIIII[2] = 2;
        R.lIIlIlIIII[3] = 3;
        R.lIIlIlIIII[4] = -(0xFFFFDC6A & 0x63FD) & (0xFFFFFFFF & 0x53EF);
        R.lIIlIlIIII[5] = 0x14 ^ 0x21 ^ (0x22 ^ 0x13);
        R.lIIlIlIIII[6] = -(0xFFFFFFED & 0x68D3) & (0xFFFFFDEF & 0x6BFF);
        R.lIIlIlIIII[7] = 36 + 46 - -58 + 11 ^ 120 + 142 - 201 + 85;
        R.lIIlIlIIII[8] = 0xFFFFE73F & 0x19F3;
        R.lIIlIlIIII[9] = 0x2D ^ 0x2B;
        R.lIIlIlIIII[10] = 0xFFFF8777 & 0x79BD;
        R.lIIlIlIIII[11] = 0x8E ^ 0x89;
        R.lIIlIlIIII[12] = 0xFFFF8D3E & 0x73FB;
        R.lIIlIlIIII[13] = 50 + 71 - 100 + 108 ^ 13 + 4 - 16 + 136;
        R.lIIlIlIIII[14] = 0xFFFFB7FB & 0x493D;
        R.lIIlIlIIII[15] = 8 ^ 1;
        R.lIIlIlIIII[16] = 0xBE ^ 0xB4;
        R.lIIlIlIIII[17] = 0x10 ^ 0x1B;
        R.lIIlIlIIII[18] = 102 + 29 - 101 + 109 ^ 129 + 52 - 80 + 34;
        R.lIIlIlIIII[19] = 0xC4 ^ 0xC3 ^ (0xB0 ^ 0xBA);
        R.lIIlIlIIII[20] = 19 + 87 - -28 + 23 ^ 60 + 16 - -48 + 23;
        R.lIIlIlIIII[21] = -(0xFFFFF997 & 0x5E7F) & (0xFFFFDFFE & 0x1FEB7);
        R.lIIlIlIIII[22] = 0x2C ^ 5 ^ (0x2B ^ 0xD);
        R.lIIlIlIIII[23] = 0xFFFFF7EA & 0xBFD;
        R.lIIlIlIIII[24] = -(0xFFFFF9AA & 0x46D7) & (0xFFFFFFCF & 0x5FF9);
        R.lIIlIlIIII[25] = 83 + 33 - 59 + 80 ^ 96 + 90 - 75 + 42;
        R.lIIlIlIIII[26] = 0x1E ^ 0xF;
        R.lIIlIlIIII[27] = 12 + 87 - 94 + 172 ^ 58 + 67 - -11 + 29;
        R.lIIlIlIIII[28] = 0x99 ^ 0x8B;
        R.lIIlIlIIII[29] = 0x87 ^ 0xAC ^ (0x1D ^ 0x25);
        R.lIIlIlIIII[30] = -1;
        R.lIIlIlIIII[31] = 0xFFFF8E9C & 0x776B;
        R.lIIlIlIIII[32] = 0x2D ^ 0x38;
        R.lIIlIlIIII[33] = 51 + 4 - -51 + 63 ^ 149 + 8 - -15 + 19;
        R.lIIlIlIIII[34] = 0xD0 ^ 0xC7;
        R.lIIlIlIIII[35] = 0x6D ^ 0x75;
        R.lIIlIlIIII[36] = 0x4C ^ 0x55;
        R.lIIlIlIIII[37] = 0xB5 ^ 0xAF;
        R.lIIlIlIIII[38] = 0x1D ^ 0x51 ^ (0x58 ^ 0xF);
        R.lIIlIlIIII[39] = 137 + 73 - 159 + 127 ^ 47 + 78 - 57 + 106;
        R.lIIlIlIIII[40] = 0x9C ^ 0x81;
        R.lIIlIlIIII[41] = 0x8D ^ 0x93;
        R.lIIlIlIIII[42] = 0x4F ^ 0x50;
        R.lIIlIlIIII[43] = 0x39 ^ 0x51 ^ (0xCE ^ 0x86);
        R.lIIlIlIIII[44] = 0x5B ^ 0x7A;
        R.lIIlIlIIII[45] = 0xA8 ^ 0x8A;
        R.lIIlIlIIII[46] = 0x65 ^ 0x46;
        R.lIIlIlIIII[47] = 0x33 ^ 0x17;
        R.lIIlIlIIII[48] = 195 + 178 - 340 + 192 ^ 192 + 113 - 114 + 5;
        R.lIIlIlIIII[49] = 0x7D ^ 0x3A ^ (0xDB ^ 0xBA);
        R.lIIlIlIIII[50] = -(0xFFFFEF55 & 0x7EBF) & (0xFFFFEF5F & 0x7FF5);
        R.lIIlIlIIII[51] = 0xFFFFBFE7 & 0x49FF;
        R.lIIlIlIIII[52] = -(0xFFFFF2FB & 0x3F0D) & (0xFFFFFFFF & 0x3FFD);
        R.lIIlIlIIII[53] = 0x3B ^ 0x78 ^ (0xEF ^ 0x8B);
        R.lIIlIlIIII[54] = 0xC ^ 0x3F ^ (0xDB ^ 0xC0);
        R.lIIlIlIIII[55] = 0xB ^ 0x22 ^ (0x3C ^ 0x7B) & ~(0x6A ^ 0x2D);
        R.lIIlIlIIII[56] = 80 + 38 - 62 + 86 ^ 83 + 161 - 129 + 49;
        R.lIIlIlIIII[57] = 0x2A ^ 1;
        R.lIIlIlIIII[58] = 0x3A ^ 0x23 ^ (0x96 ^ 0xA3);
        R.lIIlIlIIII[59] = 0x52 ^ 0x7F;
        R.lIIlIlIIII[60] = 0x3F ^ 0x11;
        R.lIIlIlIIII[61] = 2 ^ (0x47 ^ 0x6A);
        R.lIIlIlIIII[62] = 130 + 86 - 179 + 120 ^ 135 + 162 - 154 + 30;
        R.lIIlIlIIII[63] = -(0xFFFFDD57 & 0x66FF) & (0xFFFFFF7F & 0x67FE);
        R.lIIlIlIIII[64] = 0xFFFFF76E & 0x9BD;
        R.lIIlIlIIII[65] = -(0xFFFF973E & 0x7ACB) & (0xFFFFBFFF & 0x53FD);
        R.lIIlIlIIII[66] = 0xFFFFFFDC & 0x32EB;
        R.lIIlIlIIII[67] = -(0xFFFFF1D3 & 0x6E6F) & (0xFFFFFF6F & 0x6FDF);
        R.lIIlIlIIII[68] = -(0xFFFFD3BB & 0x3D77) & (0xFFFFFFFE & 0x3FFF);
        R.lIIlIlIIII[69] = -(0xFFFF9F5C & 0x7AE7) & (0xFFFFFFEB & 0x7BFF);
        R.lIIlIlIIII[70] = -(0xFFFFE1E1 & 0x7E9F) & (0xFFFFFFFF & 0x7FC7);
        R.lIIlIlIIII[71] = -(0xFFFFEE57 & 0x7DF9) & (0xFFFFFFF7 & 0x6FDC);
        R.lIIlIlIIII[72] = 0xC5 ^ 0xA1;
        R.lIIlIlIIII[73] = 0x27 ^ 0x16;
        R.lIIlIlIIII[74] = 101 + 48 - 71 + 165 ^ 40 + 129 - 68 + 43;
        R.lIIlIlIIII[75] = 0x18 ^ 0x2A;
        R.lIIlIlIIII[76] = 0x16 ^ 0x25;
        R.lIIlIlIIII[77] = 0xFFFFF7E5 & 0xDFE;
        R.lIIlIlIIII[78] = 43 + 24 - 41 + 101 ^ (0xE1 ^ 0xAA);
        R.lIIlIlIIII[79] = 0x8C ^ 0xB9;
        R.lIIlIlIIII[80] = 0x9E ^ 0xA8;
        R.lIIlIlIIII[81] = 102 + 19 - -5 + 38 ^ 120 + 20 - 97 + 104;
        R.lIIlIlIIII[82] = 0x22 ^ 0x1A;
        R.lIIlIlIIII[83] = 0xFFFF8FDB & 0x79EE;
        R.lIIlIlIIII[84] = -(0xFFFFD7BF & 0x3A5B) & (0xFFFFBFFF & 0x5FFE);
        R.lIIlIlIIII[85] = 0xFFFFD9DD & 0x2FF7;
        R.lIIlIlIIII[86] = 0xFFFFADF4 & 0x5FFF;
        R.lIIlIlIIII[87] = 0xFFFFDBFE & 0x2DE5;
        R.lIIlIlIIII[88] = 0xFFFFCF5C & 0x3DF7;
        R.lIIlIlIIII[89] = 0xFFFFB5FF & 0x4FE7;
        R.lIIlIlIIII[90] = -(0xFFFFFB3F & 0x66C3) & (0xFFFFE7FB & 0x7FF7);
        R.lIIlIlIIII[91] = -(0xFFFFEBBF & 0x3E41) & (0xFFFFAFEF & Short.MAX_VALUE);
        R.lIIlIlIIII[92] = 0xFFFFF3FF & 0xD3D;
        R.lIIlIlIIII[93] = -(0xFFFFEF9F & 0x76F1) & (0xFFFFEFFF & 0x77D7);
        R.lIIlIlIIII[94] = -(0xFFFFB795 & 0x7EEF) & (0xFFFFB7CF & Short.MAX_VALUE);
        R.lIIlIlIIII[95] = 0xFFFF91FD & 0x6F5B;
        R.lIIlIlIIII[96] = 0xFFFFD77F & 0x29CF;
        R.lIIlIlIIII[97] = -(0xFFFFB15F & 0x5FAD) & (0xFFFFBFCF & 0x7D7E);
        R.lIIlIlIIII[98] = -(0xFFFFEFE7 & 0x53BB) & (0xFFFFEFE7 & 0x7FFE);
        R.lIIlIlIIII[99] = 0xFFFFBEE2 & 0x6D5D;
        R.lIIlIlIIII[100] = 0x78 ^ 0x41;
    }

    public static void di() {
        block26: {
            BankLocation var17;
            block27: {
                block30: {
                    block29: {
                        block28: {
                            if (R.lllllIllIIll(bt ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[42]];
                                b.a(bv);
                                if (R.lllllIllIlII(bv.size(), lIIlIlIIII[1])) {
                                    System.out.println(lIIlIIllII[lIIlIlIIII[43]]);
                                    bt = lIIlIlIIII[0];
                                }
                            }
                            if (!R.lllllIllIlIl(bt ? 1 : 0)) break block26;
                            if (!R.lllllIllIlIl(R.dj() ? 1 : 0)) break block27;
                            var17 = BankLocation.getNearest();
                            if (R.lllllIllIllI(var17) && R.lllllIllIlIl(var17.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[44]];
                                a.a(var17);
                            }
                            if (!R.lllllIllIllI(var17) || !R.lllllIllIIll(var17.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block27;
                            if (R.lllllIllIlIl(Bank.isOpen() ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[45]];
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIlIIII[4]);
                                0;
                            }
                            if (!R.lllllIllIIll(Bank.isOpen() ? 1 : 0)) break block27;
                            AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[46]];
                            if (R.lllllIllIlll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlIlIIII[5]);
                                0;
                            }
                            int[] nArray = new int[lIIlIlIIII[1]];
                            nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[6];
                            if (!R.lllllIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                            String[] stringArray = new String[lIIlIlIIII[1]];
                            stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[47]];
                            if (!R.lllllIlllIII(Inventory.getCount((String[])stringArray), lIIlIlIIII[1])) break block29;
                        }
                        if (!R.lllllIllIlIl(Bank.contains((int[])f.aO) ? 1 : 0) || !R.lllllIllIlIl(Inventory.contains((int[])f.aO) ? 1 : 0) || !R.lllllIllIlIl(Equipment.contains((int[])f.aO) ? 1 : 0)) break block30;
                    }
                    R.af();
                    System.out.println(lIIlIIllII[lIIlIlIIII[48]]);
                    bt = lIIlIlIIII[1];
                    return;
                }
                int[] nArray = new int[lIIlIlIIII[1]];
                nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[6];
                if (R.lllllIllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((String)lIIlIIllII[lIIlIlIIII[49]], (int)lIIlIlIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIlIIII[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIlIIII[1]];
                        stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[76]];
                        if (R.lllllIllIlll(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIlIIII[1];
                            0;
                            if ((0x1F ^ 0x1B) <= 3) {
                                return false;
                            }
                        } else {
                            bl = lIIlIlIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIII[4]);
                    0;
                }
                if (R.lllllIllIIll(Bank.contains((int[])f.aO) ? 1 : 0)) {
                    a.b(f.aO, lIIlIlIIII[1]);
                }
            }
            if (R.lllllIllIIll(R.dj() ? 1 : 0)) {
                if (R.lllllIllIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (R.lllllIllIIll(Inventory.isFull() ? 1 : 0)) {
                    int[] nArray = new int[lIIlIlIIII[1]];
                    nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[50];
                    if (R.lllllIllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        var17 = new WorldPoint(lIIlIlIIII[51], lIIlIlIIII[52], lIIlIlIIII[0]);
                        if (R.lllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var17), lIIlIlIIII[9])) {
                            AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[53]];
                            Movement.walkTo((WorldPoint)var17);
                            0;
                            Time.sleepTicks((int)lIIlIlIIII[1]);
                            0;
                        }
                        if (R.lllllIlllIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)var17), lIIlIlIIII[13])) {
                            if (R.lllllIllIlIl(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                            }
                            if (R.lllllIllIIll(Bank.isOpen() ? 1 : 0)) {
                                Time.sleepTicks((int)lIIlIlIIII[2]);
                                0;
                                Bank.depositInventory();
                                Time.sleepTicks((int)lIIlIlIIII[2]);
                                0;
                                a.a(lIIlIlIIII[6], lIIlIlIIII[1]);
                            }
                        }
                    }
                }
                if (R.lllllIllIlIl(Inventory.isFull() ? 1 : 0)) {
                    if (R.lllllIllIlIl(jp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && R.lllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(jq), lIIlIlIIII[7])) {
                        AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[54]];
                        if (R.lllllIllIIll(Inventory.contains((int[])f.aO) ? 1 : 0)) {
                            Inventory.getFirst((int[])f.aO).interact(lIIlIIllII[lIIlIlIIII[55]]);
                        }
                        Movement.walkTo((WorldPoint)jq);
                        0;
                        Time.sleepTicks((int)lIIlIlIIII[1]);
                        0;
                    }
                    if (R.lllllIllIIll(jp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[56]];
                        if (R.lllllIlllIlI(Players.getLocal().getAnimation(), lIIlIlIIII[30])) {
                            int[] nArray = new int[lIIlIlIIII[1]];
                            nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[31];
                            if (R.lllllIllIllI(NPCs.getNearest((int[])nArray))) {
                                int[] nArray2 = new int[lIIlIlIIII[1]];
                                nArray2[R.lIIlIlIIII[0]] = lIIlIlIIII[31];
                                NPCs.getNearest((int[])nArray2).interact(lIIlIlIIII[0]);
                                Time.sleepTicks((int)lIIlIlIIII[7]);
                                0;
                            }
                        }
                    }
                }
                if (R.lllllIllIIll(Inventory.isFull() ? 1 : 0)) {
                    int[] nArray = new int[lIIlIlIIII[1]];
                    nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[50];
                    if (R.lllllIllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray3 = new int[lIIlIlIIII[1]];
                        nArray3[R.lIIlIlIIII[0]] = lIIlIlIIII[50];
                        Inventory.getAll((int[])nArray3).stream().forEach(Item::drop);
                    }
                }
            }
        }
    }

    private static boolean lllllIlllIII(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public int T() {
        R.dg();
        return lIIlIlIIII[72];
    }

    public static void dh() {
        if (R.lllllIllIIll(Inventory.isFull() ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[38]];
            System.out.println(lIIlIIllII[lIIlIlIIII[39]]);
            Inventory.getAll((int[])js).stream().forEach(Item::drop);
        }
        if (R.lllllIllIlIl(Inventory.isFull() ? 1 : 0) && R.lllllIlllIlI(Players.getLocal().getAnimation(), lIIlIlIIII[30])) {
            String[] stringArray = new String[lIIlIlIIII[1]];
            stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[40]];
            NPCs.getNearest((String[])stringArray).interact(lIIlIIllII[lIIlIlIIII[41]]);
            Time.sleepTicks((int)lIIlIlIIII[2]);
            0;
        }
    }

    static {
        R.lllllIllIIlI();
        R.lllllIllIIIl();
        jp = new WorldArea(lIIlIlIIII[83], lIIlIlIIII[84], lIIlIlIIII[29], lIIlIlIIII[39], lIIlIlIIII[0]);
        bv = new ArrayList<d>();
        jq = new WorldPoint(lIIlIlIIII[85], lIIlIlIIII[86], lIIlIlIIII[0]);
        jr = new WorldPoint(lIIlIlIIII[87], lIIlIlIIII[88], lIIlIlIIII[0]);
        int[] nArray = new int[lIIlIlIIII[17]];
        nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[89];
        nArray[R.lIIlIlIIII[1]] = lIIlIlIIII[90];
        nArray[R.lIIlIlIIII[2]] = lIIlIlIIII[91];
        nArray[R.lIIlIlIIII[3]] = lIIlIlIIII[92];
        nArray[R.lIIlIlIIII[5]] = lIIlIlIIII[93];
        nArray[R.lIIlIlIIII[7]] = lIIlIlIIII[94];
        nArray[R.lIIlIlIIII[9]] = lIIlIlIIII[95];
        nArray[R.lIIlIlIIII[11]] = lIIlIlIIII[96];
        nArray[R.lIIlIlIIII[13]] = lIIlIlIIII[97];
        nArray[R.lIIlIlIIII[15]] = lIIlIlIIII[98];
        nArray[R.lIIlIlIIII[16]] = lIIlIlIIII[99];
        js = nArray;
    }

    private static boolean lllllIllIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lllllIlllIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lllllIllIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean S() {
        return lIIlIlIIII[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ab() {
        int n2;
        String[] stringArray = new String[lIIlIlIIII[1]];
        stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[58]];
        if (R.lllllIllIIll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIlIlIIII[1]];
            stringArray2[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[59]];
            if (R.lllllIllIIll(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lIIlIlIIII[1]];
                stringArray3[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[60]];
                if (R.lllllIllIIll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                    String[] stringArray4 = new String[lIIlIlIIII[1]];
                    stringArray4[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[61]];
                    if (R.lllllIllIIll(Inventory.contains((String[])stringArray4) ? 1 : 0)) {
                        String[] stringArray5 = new String[lIIlIlIIII[1]];
                        stringArray5[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[62]];
                        if (R.lllllIllIIll(Inventory.contains((String[])stringArray5) ? 1 : 0) && (!R.lllllIllIlIl(Inventory.contains((int[])f.aO) ? 1 : 0) || R.lllllIllIIll(Equipment.contains((int[])f.aO) ? 1 : 0))) {
                            n2 = lIIlIlIIII[1];
                            0;
                            if (null == null) return n2 != 0;
                            return false;
                        }
                    }
                }
            }
        }
        n2 = lIIlIlIIII[0];
        return n2 != 0;
    }

    public static void af() {
        d var2;
        Object var13;
        int[] nArray = new int[lIIlIlIIII[1]];
        nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[6];
        if (R.lllllIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(lIIlIlIIII[6], lIIlIlIIII[1], lIIlIlIIII[4]);
            bv.add(d2);
            0;
        }
        int[] nArray2 = new int[lIIlIlIIII[1]];
        nArray2[R.lIIlIlIIII[0]] = lIIlIlIIII[8];
        if (R.lllllIllIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
            var13 = new d(lIIlIlIIII[8], lIIlIlIIII[1], lIIlIlIIII[4]);
            bv.add((d)var13);
            0;
        }
        int[] nArray3 = new int[lIIlIlIIII[1]];
        nArray3[R.lIIlIlIIII[0]] = lIIlIlIIII[10];
        if (R.lllllIllIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
            var13 = new d(lIIlIlIIII[10], lIIlIlIIII[1], lIIlIlIIII[63]);
            bv.add((d)var13);
            0;
        }
        int[] nArray4 = new int[lIIlIlIIII[1]];
        nArray4[R.lIIlIlIIII[0]] = lIIlIlIIII[14];
        if (R.lllllIllIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
            var13 = new d(lIIlIlIIII[14], lIIlIlIIII[64], lIIlIlIIII[65]);
            bv.add((d)var13);
            0;
        }
        int[] nArray5 = new int[lIIlIlIIII[1]];
        nArray5[R.lIIlIlIIII[0]] = lIIlIlIIII[12];
        if (R.lllllIllIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
            var13 = new d(lIIlIlIIII[12], lIIlIlIIII[66], lIIlIlIIII[7]);
            bv.add((d)var13);
            0;
        }
        int[] nArray6 = new int[lIIlIlIIII[1]];
        nArray6[R.lIIlIlIIII[0]] = lIIlIlIIII[67];
        if (R.lllllIllIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
            var13 = new d(lIIlIlIIII[67], lIIlIlIIII[1], lIIlIlIIII[4]);
            bv.add((d)var13);
            0;
        }
        int[] nArray7 = new int[lIIlIlIIII[1]];
        nArray7[R.lIIlIlIIII[0]] = lIIlIlIIII[24];
        if (R.lllllIllIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
            var13 = new d(lIIlIlIIII[24], lIIlIlIIII[16], lIIlIlIIII[4]);
            bv.add((d)var13);
            0;
        }
        if (R.lllllIllIlIl(Bank.contains((Predicate)(var13 = item -> item.getName().toLowerCase().contains(lIIlIIllII[lIIlIlIIII[75]]))) ? 1 : 0)) {
            var2 = new d(lIIlIlIIII[68], lIIlIlIIII[7], lIIlIlIIII[69]);
            bv.add(var2);
            0;
        }
        int[] nArray8 = new int[lIIlIlIIII[1]];
        nArray8[R.lIIlIlIIII[0]] = lIIlIlIIII[70];
        if (R.lllllIllIlIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
            var2 = new d(lIIlIlIIII[70], lIIlIlIIII[54], lIIlIlIIII[71]);
            bv.add(var2);
            0;
        }
    }

    private static boolean lllllIllIllI(Object object) {
        return object != null;
    }

    @Override
    public String U() {
        return lIIlIIllII[lIIlIlIIII[73]];
    }

    public static void dg() {
        block36: {
            BankLocation var9;
            block37: {
                block44: {
                    block39: {
                        block43: {
                            block42: {
                                block41: {
                                    block40: {
                                        block38: {
                                            if (R.lllllIllIIll(bt ? 1 : 0)) {
                                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[0]];
                                                b.a(bv);
                                                if (R.lllllIllIlII(bv.size(), lIIlIlIIII[1])) {
                                                    System.out.println(lIIlIIllII[lIIlIlIIII[1]]);
                                                    bt = lIIlIlIIII[0];
                                                }
                                            }
                                            if (!R.lllllIllIlIl(bt ? 1 : 0)) break block36;
                                            if (!R.lllllIllIlIl(R.ab() ? 1 : 0)) break block37;
                                            var9 = BankLocation.getNearest();
                                            if (R.lllllIllIllI(var9) && R.lllllIllIlIl(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[2]];
                                                a.a(var9);
                                            }
                                            if (!R.lllllIllIllI(var9) || !R.lllllIllIIll(var9.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block37;
                                            if (R.lllllIllIlIl(Bank.isOpen() ? 1 : 0)) {
                                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[3]];
                                                a.a();
                                                Time.sleepUntil(() -> Bank.isOpen(), (int)lIIlIlIIII[4]);
                                                0;
                                            }
                                            if (!R.lllllIllIIll(Bank.isOpen() ? 1 : 0)) break block37;
                                            AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[5]];
                                            if (R.lllllIllIlll(Inventory.getAll().size())) {
                                                Bank.depositInventory();
                                                Time.sleepTicks((int)lIIlIlIIII[5]);
                                                0;
                                            }
                                            if (R.lllllIllIlll(Equipment.getAll().size())) {
                                                Bank.depositEquipment();
                                                Time.sleepTicks((int)lIIlIlIIII[2]);
                                                0;
                                            }
                                            int[] nArray = new int[lIIlIlIIII[1]];
                                            nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[6];
                                            if (!R.lllllIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block38;
                                            String[] stringArray = new String[lIIlIlIIII[1]];
                                            stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[7]];
                                            if (!R.lllllIlllIII(Inventory.getCount((String[])stringArray), lIIlIlIIII[1])) break block39;
                                        }
                                        int[] nArray = new int[lIIlIlIIII[1]];
                                        nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[8];
                                        if (!R.lllllIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block40;
                                        String[] stringArray = new String[lIIlIlIIII[1]];
                                        stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[9]];
                                        if (!R.lllllIlllIII(Inventory.getCount((String[])stringArray), lIIlIlIIII[1])) break block39;
                                    }
                                    int[] nArray = new int[lIIlIlIIII[1]];
                                    nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[10];
                                    if (!R.lllllIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block41;
                                    String[] stringArray = new String[lIIlIlIIII[1]];
                                    stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[11]];
                                    if (!R.lllllIlllIII(Inventory.getCount((String[])stringArray), lIIlIlIIII[1])) break block39;
                                }
                                int[] nArray = new int[lIIlIlIIII[1]];
                                nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[12];
                                if (!R.lllllIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block42;
                                String[] stringArray = new String[lIIlIlIIII[1]];
                                stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[13]];
                                if (!R.lllllIlllIII(Inventory.getCount((String[])stringArray), lIIlIlIIII[1])) break block39;
                            }
                            int[] nArray = new int[lIIlIlIIII[1]];
                            nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[14];
                            if (!R.lllllIllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block43;
                            String[] stringArray = new String[lIIlIlIIII[1]];
                            stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[15]];
                            if (!R.lllllIlllIII(Inventory.getCount((String[])stringArray), lIIlIlIIII[1])) break block39;
                        }
                        if ((!R.lllllIllIlIl(Bank.contains((int[])f.aO) ? 1 : 0) || R.lllllIlllIII(Inventory.getCount((int[])f.aO), lIIlIlIIII[1])) && !R.lllllIllIIll(Equipment.contains((int[])f.aO) ? 1 : 0)) break block44;
                    }
                    R.af();
                    System.out.println(lIIlIIllII[lIIlIlIIII[16]]);
                    bt = lIIlIlIIII[1];
                    return;
                }
                int[] nArray = new int[lIIlIlIIII[1]];
                nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[6];
                if (R.lllllIllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                    Bank.withdraw((String)lIIlIIllII[lIIlIlIIII[17]], (int)lIIlIlIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIlIIII[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIlIIII[1]];
                        stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[82]];
                        if (R.lllllIllIlll(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIlIIII[1];
                            0;
                            if ((0x71 ^ 0x74) <= 0) {
                                return false;
                            }
                        } else {
                            bl = lIIlIlIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIII[4]);
                    0;
                }
                int[] nArray2 = new int[lIIlIlIIII[1]];
                nArray2[R.lIIlIlIIII[0]] = lIIlIlIIII[8];
                if (R.lllllIllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                    Bank.withdraw((String)lIIlIIllII[lIIlIlIIII[18]], (int)lIIlIlIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIlIIII[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIlIIII[1]];
                        stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[81]];
                        if (R.lllllIllIlll(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIlIIII[1];
                            0;
                            if ((0x77 ^ 0x73) != (0x97 ^ 0x93)) {
                                return false;
                            }
                        } else {
                            bl = lIIlIlIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIII[4]);
                    0;
                }
                int[] nArray3 = new int[lIIlIlIIII[1]];
                nArray3[R.lIIlIlIIII[0]] = lIIlIlIIII[10];
                if (R.lllllIllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                    Bank.withdraw((String)lIIlIIllII[lIIlIlIIII[19]], (int)lIIlIlIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIlIIII[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIlIIII[1]];
                        stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[80]];
                        if (R.lllllIllIlll(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIlIIII[1];
                            0;
                            if (((0x88 ^ 0xA5) & ~(0xB1 ^ 0x9C)) == (0x61 ^ 0x65)) {
                                return false;
                            }
                        } else {
                            bl = lIIlIlIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIII[4]);
                    0;
                }
                int[] nArray4 = new int[lIIlIlIIII[1]];
                nArray4[R.lIIlIlIIII[0]] = lIIlIlIIII[12];
                if (R.lllllIllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                    Bank.withdraw((String)lIIlIIllII[lIIlIlIIII[20]], (int)lIIlIlIIII[21], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIlIIII[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIlIIII[1]];
                        stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[79]];
                        if (R.lllllIllIlll(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIlIIII[1];
                            0;
                            if (3 < -1) {
                                return ((179 + 52 - 10 + 34 ^ 33 + 94 - 115 + 159) & (1 ^ (0xDC ^ 0x89) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIlIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIII[4]);
                    0;
                }
                int[] nArray5 = new int[lIIlIlIIII[1]];
                nArray5[R.lIIlIlIIII[0]] = lIIlIlIIII[14];
                if (R.lllllIllIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                    Bank.withdraw((String)lIIlIIllII[lIIlIlIIII[22]], (int)lIIlIlIIII[23], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                    Time.sleepTicks((int)lIIlIlIIII[2]);
                    0;
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[lIIlIlIIII[1]];
                        stringArray[R.lIIlIlIIII[0]] = lIIlIIllII[lIIlIlIIII[78]];
                        if (R.lllllIllIlll(Inventory.getCount((String[])stringArray))) {
                            bl = lIIlIlIIII[1];
                            0;
                            if (((70 + 75 - 58 + 54 ^ 48 + 21 - -39 + 40) & (7 ^ 0x55 ^ (0xDA ^ 0x91) ^ -1)) < 0) {
                                return ((0x59 ^ 0x1F ^ (0x1B ^ 4)) & (0xB3 ^ 0x97 ^ (0x2E ^ 0x53) ^ -1)) != 0;
                            }
                        } else {
                            bl = lIIlIlIIII[0];
                        }
                        return bl;
                    }, (int)lIIlIlIIII[4]);
                    0;
                }
                if (R.lllllIllIIll(Bank.contains((int[])f.aO) ? 1 : 0)) {
                    a.b(f.aO, lIIlIlIIII[1]);
                }
                int[] nArray6 = new int[lIIlIlIIII[1]];
                nArray6[R.lIIlIlIIII[0]] = lIIlIlIIII[24];
                if (R.lllllIllIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                    a.a(lIIlIlIIII[24], lIIlIlIIII[1]);
                }
            }
            if (R.lllllIllIIll(R.ab() ? 1 : 0)) {
                if (R.lllllIllIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (R.lllllIllIIll(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[25]];
                    System.out.println(lIIlIIllII[lIIlIlIIII[26]]);
                    Inventory.getAll((int[])js).stream().forEach(Item::drop);
                }
                if (R.lllllIllIlIl(Inventory.isFull() ? 1 : 0)) {
                    if (R.lllllIllIlII(Skills.getLevel((Skill)Skill.FISHING), lIIlIlIIII[27])) {
                        if (R.lllllIllIlII(Skills.getLevel((Skill)Skill.FISHING), lIIlIlIIII[7])) {
                            if (R.lllllIllIlIl(jp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && R.lllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(jq), lIIlIlIIII[7])) {
                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[28]];
                                if (R.lllllIllIIll(Inventory.contains((int[])f.aO) ? 1 : 0)) {
                                    Inventory.getFirst((int[])f.aO).interact(lIIlIIllII[lIIlIlIIII[29]]);
                                }
                                Movement.walkTo((WorldPoint)jq);
                                0;
                                Time.sleepTicks((int)lIIlIlIIII[1]);
                                0;
                            }
                            if (R.lllllIllIIll(jp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[27]];
                                if (R.lllllIlllIlI(Players.getLocal().getAnimation(), lIIlIlIIII[30])) {
                                    int[] nArray = new int[lIIlIlIIII[1]];
                                    nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[31];
                                    var9 = NPCs.getNearest((int[])nArray);
                                    if (R.lllllIllIllI(var9) && R.lllllIllIIll(jp.contains((Locatable)var9) ? 1 : 0)) {
                                        int[] nArray7 = new int[lIIlIlIIII[1]];
                                        nArray7[R.lIIlIlIIII[0]] = lIIlIlIIII[31];
                                        NPCs.getNearest((int[])nArray7).interact(lIIlIlIIII[0]);
                                        Time.sleepTicks((int)lIIlIlIIII[2]);
                                        0;
                                    }
                                }
                            }
                        }
                        if (R.lllllIlllIII(Skills.getLevel((Skill)Skill.FISHING), lIIlIlIIII[7]) && R.lllllIllIlII(Skills.getLevel((Skill)Skill.FISHING), lIIlIlIIII[27])) {
                            if (R.lllllIllIlIl(jp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[32]];
                                Movement.walkTo((WorldPoint)jq);
                                0;
                                Time.sleepTicks((int)lIIlIlIIII[1]);
                                0;
                            }
                            if (R.lllllIllIIll(jp.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[33]];
                                if (R.lllllIlllIlI(Players.getLocal().getAnimation(), lIIlIlIIII[30])) {
                                    int[] nArray = new int[lIIlIlIIII[1]];
                                    nArray[R.lIIlIlIIII[0]] = lIIlIlIIII[31];
                                    var9 = NPCs.getNearest((int[])nArray);
                                    if (R.lllllIllIllI(var9) && R.lllllIllIIll(jp.contains((Locatable)var9) ? 1 : 0)) {
                                        int[] nArray8 = new int[lIIlIlIIII[1]];
                                        nArray8[R.lIIlIlIIII[0]] = lIIlIlIIII[31];
                                        NPCs.getNearest((int[])nArray8).interact(lIIlIIllII[lIIlIlIIII[34]]);
                                        Time.sleepTicks((int)lIIlIlIIII[2]);
                                        0;
                                    }
                                }
                            }
                        }
                    }
                    if (R.lllllIlllIII(Skills.getLevel((Skill)Skill.FISHING), lIIlIlIIII[27])) {
                        if (R.lllllIlllIIl(Players.getLocal().getWorldLocation().distanceTo(jr), lIIlIlIIII[22])) {
                            AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[35]];
                            Movement.walkTo((WorldPoint)jr);
                            0;
                            Time.sleepTicks((int)lIIlIlIIII[1]);
                            0;
                        }
                        if (R.lllllIlllIll(Players.getLocal().getWorldLocation().distanceTo(jr), lIIlIlIIII[22])) {
                            AccBuilderRogues.c = lIIlIIllII[lIIlIlIIII[36]];
                            if (R.lllllIlllIlI(Players.getLocal().getAnimation(), lIIlIlIIII[30]) && R.lllllIllIllI(NPCs.getNearest(nPC -> {
                                int n2;
                                if (R.lllllIlllIlI(nPC.getId(), lIIlIlIIII[77]) && R.lllllIlllIll(nPC.getWorldLocation().distanceTo(jr), lIIlIlIIII[22])) {
                                    n2 = lIIlIlIIII[1];
                                    0;
                                    if (2 < ((0xB1 ^ 0xA6) & ~(0xA7 ^ 0xB0))) {
                                        return false;
                                    }
                                } else {
                                    n2 = lIIlIlIIII[0];
                                }
                                return n2 != 0;
                            }))) {
                                NPCs.getNearest(nPC -> {
                                    int n2;
                                    if (R.lllllIlllIlI(nPC.getId(), lIIlIlIIII[77]) && R.lllllIlllIll(nPC.getWorldLocation().distanceTo(jr), lIIlIlIIII[22])) {
                                        n2 = lIIlIlIIII[1];
                                        0;
                                        if (1 < ((181 + 159 - 200 + 42 ^ 58 + 167 - 163 + 124) & (17 + 139 - 41 + 43 ^ 96 + 78 - 75 + 47 ^ -1))) {
                                            return ((0x4A ^ 0x1F ^ (0x46 ^ 0x4C)) & (0xFE ^ 0x98 ^ (0x52 ^ 0x6B) ^ -1)) != 0;
                                        }
                                    } else {
                                        n2 = lIIlIlIIII[0];
                                    }
                                    return n2 != 0;
                                }).interact(lIIlIIllII[lIIlIlIIII[37]]);
                                Time.sleepTicks((int)lIIlIlIIII[2]);
                                0;
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lllllIllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lllllIlllIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lllllIIllllI(String var7, String var5) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var3 = var5.toCharArray();
        int var12 = lIIlIlIIII[0];
        char[] var10 = var7.toCharArray();
        int var16 = var10.length;
        int var6 = lIIlIlIIII[0];
        while (R.lllllIllIlII(var6, var16)) {
            char var4 = var10[var6];
            var21.append((char)(var4 ^ var3[var12 % var3.length]));
            0;
            ++var12;
            ++var6;
            0;
            if (2 != ((0x1A ^ 0x3C) & ~(0x31 ^ 0x17))) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static void lllllIllIIIl() {
        lIIlIIllII = new String[lIIlIlIIII[100]];
        R.lIIlIIllII[R.lIIlIlIIII[0]] = R."Buying items";
        R.lIIlIIllII[R.lIIlIlIIII[1]] = R."Finished buying items, switching back to fishing";
        R.lIIlIIllII[R.lIIlIlIIII[2]] = R."Navigating to bank";
        R.lIIlIIllII[R.lIIlIlIIII[3]] = R."Opening bank";
        R.lIIlIIllII[R.lIIlIlIIII[5]] = R."Handling banking";
        R.lIIlIIllII[R.lIIlIlIIII[7]] = R."Small fishing net";
        R.lIIlIIllII[R.lIIlIlIIII[9]] = R."Fishing rod";
        R.lIIlIIllII[R.lIIlIlIIII[11]] = R."Fly fishing rod rod";
        R.lIIlIIllII[R.lIIlIlIIII[13]] = R."Feather";
        R.lIIlIIllII[R.lIIlIlIIII[15]] = R."Fishing bait";
        R.lIIlIIllII[R.lIIlIlIIII[16]] = R."We are missing supplies, switching to BUYING";
        R.lIIlIIllII[R.lIIlIlIIII[17]] = R."Small fishing net";
        R.lIIlIIllII[R.lIIlIlIIII[18]] = R."Fishing rod";
        R.lIIlIIllII[R.lIIlIlIIII[19]] = R."Fly fishing rod";
        R.lIIlIIllII[R.lIIlIlIIII[20]] = R."Feather";
        R.lIIlIIllII[R.lIIlIlIIII[22]] = R."Fishing bait";
        R.lIIlIIllII[R.lIIlIlIIII[25]] = R."Dropping logs";
        R.lIIlIIllII[R.lIIlIlIIII[26]] = R."Dropping logs";
        R.lIIlIIllII[R.lIIlIlIIII[28]] = R."Nav to small fish spot";
        R.lIIlIIllII[R.lIIlIlIIII[29]] = R."Wear";
        R.lIIlIIllII[R.lIIlIlIIII[27]] = R."Fishing";
        R.lIIlIIllII[R.lIIlIlIIII[32]] = R."Nav to small fish spot";
        R.lIIlIIllII[R.lIIlIlIIII[33]] = R."Fishing";
        R.lIIlIIllII[R.lIIlIlIIII[34]] = R."Bait";
        R.lIIlIIllII[R.lIIlIlIIII[35]] = R."Nav to fly fish spot";
        R.lIIlIIllII[R.lIIlIlIIII[36]] = R."Fishing";
        R.lIIlIIllII[R.lIIlIlIIII[37]] = R."Lure";
        R.lIIlIIllII[R.lIIlIlIIII[38]] = R."Dropping logs";
        R.lIIlIIllII[R.lIIlIlIIII[39]] = R."Dropping logs";
        R.lIIlIIllII[R.lIIlIlIIII[40]] = R."Fishing spot";
        R.lIIlIIllII[R.lIIlIlIIII[41]] = R."Use-rod";
        R.lIIlIIllII[R.lIIlIlIIII[42]] = R."Buying items";
        R.lIIlIIllII[R.lIIlIlIIII[43]] = R."Finished buying items, switching back to fishing";
        R.lIIlIIllII[R.lIIlIlIIII[44]] = R."Navigating to bank";
        R.lIIlIIllII[R.lIIlIlIIII[45]] = R."Opening bank";
        R.lIIlIIllII[R.lIIlIlIIII[46]] = R."Handling banking";
        R.lIIlIIllII[R.lIIlIlIIII[47]] = R."Small fishing net";
        R.lIIlIIllII[R.lIIlIlIIII[48]] = R."We are missing supplies, switching to BUYING";
        R.lIIlIIllII[R.lIIlIlIIII[49]] = R."Small fishing net";
        R.lIIlIIllII[R.lIIlIlIIII[53]] = R."Nav to bank";
        R.lIIlIIllII[R.lIIlIlIIII[54]] = R."Nav to small fish spot";
        R.lIIlIIllII[R.lIIlIlIIII[55]] = R."Wear";
        R.lIIlIIllII[R.lIIlIlIIII[56]] = R."Fishing";
        R.lIIlIIllII[R.lIIlIlIIII[57]] = R."Small fishing net";
        R.lIIlIIllII[R.lIIlIlIIII[58]] = R."Small fishing net";
        R.lIIlIIllII[R.lIIlIlIIII[59]] = R."Fishing rod";
        R.lIIlIIllII[R.lIIlIlIIII[60]] = R."Fly fishing rod";
        R.lIIlIIllII[R.lIIlIlIIII[61]] = R."Feather";
        R.lIIlIIllII[R.lIIlIlIIII[62]] = R."Fishing bait";
        R.lIIlIIllII[R.lIIlIlIIII[73]] = R."Fishing";
        R.lIIlIIllII[R.lIIlIlIIII[75]] = R."ring of wealth (";
        R.lIIlIIllII[R.lIIlIlIIII[76]] = R."Small fishing net";
        R.lIIlIIllII[R.lIIlIlIIII[78]] = R."Fishing bait";
        R.lIIlIIllII[R.lIIlIlIIII[79]] = R."Feather";
        R.lIIlIIllII[R.lIIlIlIIII[80]] = R."Fly fishing rod";
        R.lIIlIIllII[R.lIIlIlIIII[81]] = R."Fishing rod";
        R.lIIlIIllII[R.lIIlIlIIII[82]] = R."Small fishing net";
    }
}

