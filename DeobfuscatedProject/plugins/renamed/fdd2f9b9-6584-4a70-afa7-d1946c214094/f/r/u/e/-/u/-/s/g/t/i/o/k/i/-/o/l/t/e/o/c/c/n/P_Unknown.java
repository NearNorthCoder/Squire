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

public class P_Unknown
implements G {
    public static final /* synthetic */ int jj;
    private static /* synthetic */ int[] lIIllllIll;
    private static /* synthetic */ String[] lIIllllIlI;
    public static final /* synthetic */ WorldPoint jl;
    public static final /* synthetic */ int jk;
    public static final /* synthetic */ WorldPoint jm;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int ji;
    public static /* synthetic */ List<d> bv;

    private static String lIIIIlIllIIlI(String var21, String var5) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var20 = var5.toCharArray();
        int var9 = lIIllllIll[0];
        char[] var11 = var21.toCharArray();
        int var3 = var11.length;
        int var1 = lIIllllIll[0];
        while (P.lIIIIlIlllIII(var1, var3)) {
            char var16 = var11[var1];
            var10.append((char)(var16 ^ var20[var9 % var20.length]));
            0;
            ++var9;
            ++var1;
            0;
            if (-1 != 2) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static String lIIIIlIllIlII(String var19, String var4) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIIllllIll[16]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIIllllIll[2], var12);
            return new String(var15.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    public static void cL() {
        if (P.lIIIIlIllIlll(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIllllIlI[lIIllllIll[0]];
            b.a(bv);
            if (P.lIIIIlIlllIII(bv.size(), lIIllllIll[1])) {
                System.out.println(lIIllllIlI[lIIllllIll[1]]);
                bt = lIIllllIll[0];
            }
        }
        if (P.lIIIIlIlllIIl(bt ? 1 : 0)) {
            BankLocation var23;
            if (P.lIIIIlIlllIIl(P.ab() ? 1 : 0)) {
                var23 = BankLocation.getNearest();
                if (P.lIIIIlIlllIlI(var23) && P.lIIIIlIlllIIl(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllllIlI[lIIllllIll[2]];
                    a.a(var23);
                }
                if (P.lIIIIlIlllIlI(var23) && P.lIIIIlIllIlll(var23.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIllllIlI[lIIllllIll[3]];
                    if (P.lIIIIlIlllIIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIllllIll[4]);
                        0;
                    }
                    if (P.lIIIIlIllIlll(Bank.isOpen() ? 1 : 0)) {
                        if (P.lIIIIlIlllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIllllIll[1]);
                            0;
                        }
                        if (P.lIIIIlIlllIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)lIIllllIll[2]);
                            0;
                        }
                    }
                    if (P.lIIIIlIlllIII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[5])) {
                        int[] nArray = new int[lIIllllIll[1]];
                        nArray[P.lIIllllIll[0]] = lIIllllIll[6];
                        if (P.lIIIIlIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            P.af();
                            System.out.println(lIIllllIlI[lIIllllIll[7]]);
                            bt = lIIllllIll[1];
                            return;
                        }
                    }
                    if (P.lIIIIlIllllII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[5]) && P.lIIIIlIlllIII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[8])) {
                        int[] nArray = new int[lIIllllIll[1]];
                        nArray[P.lIIllllIll[0]] = lIIllllIll[9];
                        if (P.lIIIIlIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            P.af();
                            System.out.println(lIIllllIlI[lIIllllIll[10]]);
                            bt = lIIllllIll[1];
                            return;
                        }
                    }
                    if (P.lIIIIlIllllII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[8])) {
                        int[] nArray = new int[lIIllllIll[1]];
                        nArray[P.lIIllllIll[0]] = lIIllllIll[11];
                        if (P.lIIIIlIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            P.af();
                            System.out.println(lIIllllIlI[lIIllllIll[12]]);
                            bt = lIIllllIll[1];
                            return;
                        }
                    }
                    int[] nArray = new int[lIIllllIll[1]];
                    nArray[P.lIIllllIll[0]] = lIIllllIll[13];
                    if (P.lIIIIlIlllIIl(Equipment.contains((int[])nArray) ? 1 : 0) && P.lIIIIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(jm), lIIllllIll[14])) {
                        a.b(f.aN, lIIllllIll[1]);
                        Time.sleepTicks((int)lIIllllIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllllIll[1]];
                            nArray[P.lIIllllIll[0]] = lIIllllIll[13];
                            if (P.lIIIIlIlllIll(Inventory.getCount((int[])nArray))) {
                                bl = lIIllllIll[1];
                                0;
                                if (3 <= 1) {
                                    return false;
                                }
                            } else {
                                bl = lIIllllIll[0];
                            }
                            return bl;
                        }, (int)lIIllllIll[4]);
                        0;
                    }
                    if (P.lIIIIlIlllIII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[5])) {
                        Bank.withdrawAll((int)lIIllllIll[6], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllllIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllllIll[1]];
                            nArray[P.lIIllllIll[0]] = lIIllllIll[6];
                            if (P.lIIIIlIlllIll(Inventory.getCount((int[])nArray))) {
                                bl = lIIllllIll[1];
                                0;
                                if (2 < 0) {
                                    return false;
                                }
                            } else {
                                bl = lIIllllIll[0];
                            }
                            return bl;
                        }, (int)lIIllllIll[4]);
                        0;
                    }
                    if (P.lIIIIlIllllII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[5]) && P.lIIIIlIlllIII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[8])) {
                        Bank.withdrawAll((int)lIIllllIll[9], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllllIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllllIll[1]];
                            nArray[P.lIIllllIll[0]] = lIIllllIll[9];
                            if (P.lIIIIlIlllIll(Inventory.getCount((int[])nArray))) {
                                bl = lIIllllIll[1];
                                0;
                                if (2 == ((0x66 ^ 0x4D) & ~(0x4E ^ 0x65))) {
                                    return false;
                                }
                            } else {
                                bl = lIIllllIll[0];
                            }
                            return bl;
                        }, (int)lIIllllIll[4]);
                        0;
                    }
                    if (P.lIIIIlIllllII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[8])) {
                        Bank.withdrawAll((int)lIIllllIll[11], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks((int)lIIllllIll[1]);
                        0;
                        Time.sleepUntil(() -> {
                            boolean bl;
                            int[] nArray = new int[lIIllllIll[1]];
                            nArray[P.lIIllllIll[0]] = lIIllllIll[11];
                            if (P.lIIIIlIlllIll(Inventory.getCount((int[])nArray))) {
                                bl = lIIllllIll[1];
                                0;
                                
                                }
                            } else {
                                bl = lIIllllIll[0];
                            }
                            return bl;
                        }, (int)lIIllllIll[4]);
                        0;
                    }
                }
            }
            if (P.lIIIIlIllIlll(P.ab() ? 1 : 0)) {
                int[] nArray = new int[lIIllllIll[1]];
                nArray[P.lIIllllIll[0]] = lIIllllIll[13];
                if (P.lIIIIlIllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[lIIllllIll[1]];
                    nArray2[P.lIIllllIll[0]] = lIIllllIll[13];
                    if (P.lIIIIlIlllIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIllllIlI[lIIllllIll[15]];
                        int[] nArray3 = new int[lIIllllIll[1]];
                        nArray3[P.lIIllllIll[0]] = lIIllllIll[13];
                        var23 = Inventory.getFirst((int[])nArray3);
                        if (P.lIIIIlIlllIlI(var23)) {
                            var23.interact(lIIllllIlI[lIIllllIll[16]]);
                            Time.sleepTicks((int)lIIllllIll[3]);
                            0;
                        }
                    }
                }
                if (P.lIIIIlIllllIl(Players.getLocal().getWorldLocation().distanceTo(jm), lIIllllIll[10])) {
                    AccBuilderRogues.c = lIIllllIlI[lIIllllIll[17]];
                    Movement.walkTo((WorldPoint)jm);
                    0;
                    Time.sleepTicks((int)lIIllllIll[7]);
                    0;
                }
                if (P.lIIIIlIlllllI(Players.getLocal().getWorldLocation().distanceTo(jm), lIIllllIll[10])) {
                    AccBuilderRogues.c = lIIllllIlI[lIIllllIll[18]];
                    String[] stringArray = new String[lIIllllIll[1]];
                    stringArray[P.lIIllllIll[0]] = lIIllllIlI[lIIllllIll[19]];
                    var23 = TileObjects.getNearest((WorldPoint)Players.getLocal().getWorldLocation(), (String[])stringArray);
                    if (P.lIIIIlIlllIlI(var23)) {
                        if (P.lIIIIlIlllIIl(Production.isOpen() ? 1 : 0)) {
                            var23.interact(lIIllllIlI[lIIllllIll[20]]);
                            Time.sleepTicks((int)lIIllllIll[2]);
                            0;
                            Time.sleepUntil(() -> Production.isOpen(), (int)lIIllllIll[4]);
                            0;
                        }
                        if (P.lIIIIlIllIlll(Production.isOpen() ? 1 : 0)) {
                            Production.chooseOption((int)lIIllllIll[1]);
                            Time.sleepTicks((int)lIIllllIll[7]);
                            0;
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (!P.lIIIIlIllIlll(P.ab() ? 1 : 0) || P.lIIIIlIllIlll(Dialog.isOpen() ? 1 : 0)) {
                                    bl = lIIllllIll[1];
                                    0;
                                    if (((0xBB ^ 0x8D ^ (0 ^ 0x78)) & (0x98 ^ 0xA1 ^ (0x2C ^ 0x5B) ^ -1)) == 3) {
                                        return ((83 + 182 - 144 + 104 ^ 57 + 13 - 25 + 83) & (0x21 ^ 0x65 ^ (0xB5 ^ 0x90) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIllllIll[0];
                                }
                                return bl;
                            }, (int)lIIllllIll[21]);
                            0;
                        }
                    }
                }
            }
        }
    }

    private static void af() {
        d var7;
        Object var2;
        Object var8;
        if (P.lIIIIlIlllIII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[5])) {
            d d2 = new d(lIIllllIll[6], lIIllllIll[22], lIIllllIll[23]);
            bv.add(d2);
            0;
        }
        if (P.lIIIIlIllllII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[5]) && P.lIIIIlIlllIII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[8])) {
            var8 = new d(lIIllllIll[9], lIIllllIll[24], lIIllllIll[25]);
            bv.add((d)var8);
            0;
        }
        if (P.lIIIIlIllllII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[8])) {
            var8 = new d(lIIllllIll[11], lIIllllIll[24], lIIllllIll[25]);
            bv.add((d)var8);
            0;
        }
        if (P.lIIIIlIlllIIl(Bank.contains(var8 = item -> item.getName().toLowerCase().contains(lIIllllIlI[lIIllllIll[5]])) ? 1 : 0)) {
            var2 = new d(lIIllllIll[13], lIIllllIll[26], lIIllllIll[27]);
            bv.add((d)var2);
            0;
        }
        if (P.lIIIIlIlllIIl(Bank.contains(var2 = item -> item.getName().toLowerCase().contains(lIIllllIlI[lIIllllIll[36]])) ? 1 : 0)) {
            var7 = new d(lIIllllIll[28], lIIllllIll[10], lIIllllIll[29]);
            bv.add(var7);
            0;
        }
        int[] nArray = new int[lIIllllIll[1]];
        nArray[P.lIIllllIll[0]] = lIIllllIll[30];
        if (P.lIIIIlIlllIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            var7 = new d(lIIllllIll[30], lIIllllIll[31], lIIllllIll[32]);
            bv.add(var7);
            0;
        }
    }

    private static boolean lIIIIlIlllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIIlIllIllI() {
        lIIllllIll = new int[42];
        P.lIIllllIll[0] = (0x5C ^ 2) & ~(0x4A ^ 0x14);
        P.lIIllllIll[1] = 1;
        P.lIIllllIll[2] = 2;
        P.lIIllllIll[3] = 3;
        P.lIIllllIll[4] = -(0xFFFFF1CA & 0x6E77) & (0xFFFFFBEB & 0x77DD);
        P.lIIllllIll[5] = 0xB2 ^ 0xBD;
        P.lIIllllIll[6] = 0xFFFFDFFF & 0x213D;
        P.lIIllllIll[7] = 0x3C ^ 0x38;
        P.lIIllllIll[8] = 0xBF ^ 0xA1;
        P.lIIllllIll[9] = -(0xFFFFFA3D & 0x35F3) & (0xFFFFFFFF & 0x317F);
        P.lIIllllIll[10] = 0x2D ^ 0x28;
        P.lIIllllIll[11] = 0xFFFFF3EF & 0xD77;
        P.lIIllllIll[12] = 0xB8 ^ 0xBE;
        P.lIIllllIll[13] = 0xFFFF9FFB & 0x69FC;
        P.lIIllllIll[14] = 0x61 ^ 0x3B ^ (0xF6 ^ 0xB5);
        P.lIIllllIll[15] = 0x3A ^ 0x3D;
        P.lIIllllIll[16] = 0x81 ^ 0x93 ^ (0x8B ^ 0x91);
        P.lIIllllIll[17] = 8 ^ 1;
        P.lIIllllIll[18] = 0x11 ^ 3 ^ (8 ^ 0x10);
        P.lIIllllIll[19] = 0x36 ^ 0x3D;
        P.lIIllllIll[20] = 0x72 ^ 0x47 ^ (0x8F ^ 0xB6);
        P.lIIllllIll[21] = -(0x74 ^ 0x70) & (0xFFFFFDEB & 0xFFFF);
        P.lIIllllIll[22] = 245 + 182 - 237 + 60;
        P.lIIllllIll[23] = 0xFFFF87AD & 0x797E;
        P.lIIllllIll[24] = 0xFFFF97F5 & 0x69FE;
        P.lIIllllIll[25] = 79 + 145 - 180 + 156;
        P.lIIllllIll[26] = 0x63 ^ 0x25 ^ (0x6D ^ 0x3F);
        P.lIIllllIll[27] = 0xFFFFCFFD & 0x37D2;
        P.lIIllllIll[28] = 0xFFFFFFDE & 0x2EED;
        P.lIIllllIll[29] = -(0xFFFFDE5B & 0x3DFC) & (0xFFFFFFFF & 0x7DFF);
        P.lIIllllIll[30] = -(0xFFFFB335 & 0x6CDB) & (0xFFFFBF77 & 0x7FDF);
        P.lIIllllIll[31] = 0x42 ^ 0x6A;
        P.lIIllllIll[32] = -(0xFFFFA6C3 & 0x7D3D) & (0xFFFFB7A7 & 0x6FDC);
        P.lIIllllIll[33] = 0xC ^ 0x27 ^ (0x53 ^ 0x1C);
        P.lIIllllIll[34] = 0xA1 ^ 0xAC;
        P.lIIllllIll[35] = 0xFF ^ 0x9C;
        P.lIIllllIll[36] = 0x1D ^ 0x13;
        P.lIIllllIll[37] = -(0xFFFFD6B3 & 0x3B7F) & (0xFFFF9FF7 & 0x7EFF);
        P.lIIllllIll[38] = -(0xFFFFBB9B & 0x577F) & (0xFFFFFF7F & 0x1FFA);
        P.lIIllllIll[39] = 0xFFFF8FDF & 0x7CE8;
        P.lIIllllIll[40] = -(0xFFFFEEBF & 0x3341) & (0xFFFFBF7C & 0x6EEF);
        P.lIIllllIll[41] = 0x41 ^ 0x51;
    }

    private static boolean lIIIIlIlllllI(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public String U() {
        return lIIllllIlI[lIIllllIll[34]];
    }

    private static boolean lIIIIlIlllIll(int n2) {
        return n2 > 0;
    }

    private static boolean ab() {
        boolean bl;
        if (P.lIIIIlIllllII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[8])) {
            boolean bl2;
            int[] nArray = new int[lIIllllIll[1]];
            nArray[P.lIIllllIll[0]] = lIIllllIll[11];
            if (P.lIIIIlIlllIll(Inventory.getCount((int[])nArray))) {
                bl2 = lIIllllIll[1];
                0;
                if ((0x38 ^ 0x3C) < 0) {
                    return false;
                }
            } else {
                bl2 = lIIllllIll[0];
            }
            return bl2;
        }
        if (P.lIIIIlIllllII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[5]) && P.lIIIIlIlllIII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[8])) {
            boolean bl3;
            int[] nArray = new int[lIIllllIll[1]];
            nArray[P.lIIllllIll[0]] = lIIllllIll[9];
            if (P.lIIIIlIlllIll(Inventory.getCount((int[])nArray))) {
                bl3 = lIIllllIll[1];
                0;
                if (1 < ((0x62 ^ 0x3E) & ~(0xEB ^ 0xB7))) {
                    return false;
                }
            } else {
                bl3 = lIIllllIll[0];
            }
            return bl3;
        }
        int[] nArray = new int[lIIllllIll[1]];
        nArray[P.lIIllllIll[0]] = lIIllllIll[6];
        if (P.lIIIIlIlllIll(Inventory.getCount((int[])nArray))) {
            bl = lIIllllIll[1];
            0;
            if ((1 & (1 ^ -1)) == 1) {
                return ((62 + 90 - -41 + 43 ^ 183 + 67 - 171 + 108) & (0x27 ^ 0x77 ^ (0x59 ^ 0x5E) ^ -1)) != 0;
            }
        } else {
            bl = lIIllllIll[0];
        }
        return bl;
    }

    private static boolean lIIIIlIllllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIIIIlIllIlIl() {
        lIIllllIlI = new String[lIIllllIll[41]];
        P.lIIllllIlI[P.lIIllllIll[0]] = P."Buying items";
        P.lIIllllIlI[P.lIIllllIll[1]] = P."Finished buying items, switching back to cooking";
        P.lIIllllIlI[P.lIIllllIll[2]] = P."Navigating to bank";
        P.lIIllllIlI[P.lIIllllIll[3]] = P."Handling banking";
        P.lIIllllIlI[P.lIIllllIll[7]] = P."We are missing supplies, switching to BUYING";
        P.lIIllllIlI[P.lIIllllIll[10]] = P."We are missing supplies, switching to BUYING";
        P.lIIllllIlI[P.lIIllllIll[12]] = P."We are missing supplies, switching to BUYING";
        P.lIIllllIlI[P.lIIllllIll[15]] = P."Equiping duel";
        P.lIIllllIlI[P.lIIllllIll[16]] = P."Wear";
        P.lIIllllIlI[P.lIIllllIll[17]] = P."Navigate to range";
        P.lIIllllIlI[P.lIIllllIll[18]] = P."Cooking";
        P.lIIllllIlI[P.lIIllllIll[19]] = P."Range";
        P.lIIllllIlI[P.lIIllllIll[20]] = P."Cook";
        P.lIIllllIlI[P.lIIllllIll[34]] = P."Cooking";
        P.lIIllllIlI[P.lIIllllIll[36]] = P."ring of wealth (";
        P.lIIllllIlI[P.lIIllllIll[5]] = P."ring of dueling(";
    }

    private static boolean lIIIIlIlllIlI(Object object) {
        return object != null;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (P.lIIIIlIllllII(Skills.getLevel((Skill)Skill.COOKING), lIIllllIll[35])) {
            bl = lIIllllIll[1];
            0;
            if (2 <= 0) {
                return false;
            }
        } else {
            bl = lIIllllIll[0];
        }
        return bl;
    }

    private static boolean lIIIIlIllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIIlIlllIIl(int n2) {
        return n2 == 0;
    }

    static {
        P.lIIIIlIllIllI();
        P.lIIIIlIllIlIl();
        ji = lIIllllIll[6];
        jk = lIIllllIll[11];
        jj = lIIllllIll[9];
        jl = new WorldPoint(lIIllllIll[37], lIIllllIll[38], lIIllllIll[0]);
        jm = new WorldPoint(lIIllllIll[39], lIIllllIll[40], lIIllllIll[0]);
        bv = new ArrayList<d>();
    }

    private static boolean lIIIIlIllIlll(int n2) {
        return n2 != 0;
    }

    private static String lIIIIlIllIIll(String var18, String var13) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIIllllIll[2], var17);
            return new String(var14.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean S() {
        return lIIllllIll[0];
    }

    @Override
    public int T() {
        P.cL();
        return lIIllllIll[33];
    }
}

