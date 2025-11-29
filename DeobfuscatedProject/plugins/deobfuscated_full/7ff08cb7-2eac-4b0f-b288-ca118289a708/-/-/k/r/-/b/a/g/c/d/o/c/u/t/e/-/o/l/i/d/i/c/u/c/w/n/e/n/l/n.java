/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.j;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.l;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.m;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;

public class n
implements ab {
    private static /* synthetic */ String[] llIllIIII;
    private static /* synthetic */ int[] llIllIIIl;
    public static /* synthetic */ boolean bv;
    public static /* synthetic */ List<d> bx;

    @Override
    public int af() {
        try {
            n.aA();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 <= 0) {
            return (0x98 ^ 0xBF ^ (0x40 ^ 0x2E)) & (193 + 13 - 185 + 174 ^ 80 + 58 - 31 + 31 ^ -1);
        }
        return llIllIIIl[54];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7])) {
            bl = llIllIIIl[1];
            0;
            
            }
        } else {
            bl = llIllIIIl[0];
        }
        return bl;
    }

    private static boolean lIllIlllIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlllIIlI() {
        llIllIIIl = new int[63];
        n.llIllIIIl[0] = (2 ^ 0x2C ^ (0xB1 ^ 0x8B)) & (7 + 45 - 4 + 111 ^ 29 + 20 - -71 + 19 ^ -1);
        n.llIllIIIl[1] = 1;
        n.llIllIIIl[2] = 2;
        n.llIllIIIl[3] = 3;
        n.llIllIIIl[4] = 0xFFFFFFCF & 0x13B8;
        n.llIllIIIl[5] = 0xA ^ 0xF;
        n.llIllIIIl[6] = 0xB ^ 0x34 ^ (0xD ^ 0x36);
        n.llIllIIIl[7] = 0x4A ^ 0x78 ^ (0xAF ^ 0x9B) & ~(0x9F ^ 0xAB);
        n.llIllIIIl[8] = 0xFFFFB967 & 0x6F9B;
        n.llIllIIIl[9] = 0xFFFF9DFD & 0x6BBF;
        n.llIllIIIl[10] = 0xFFFFF9DF & 0xFE3;
        n.llIllIIIl[11] = 0xFFFFA76E & 0x5BBB;
        n.llIllIIIl[12] = 0xFFFFE7EB & 0x1B5D;
        n.llIllIIIl[13] = -(0xFFFFC7E3 & 0x7CBD) & (0xFFFFC7FB & 0x7FEF);
        n.llIllIIIl[14] = 0xFFFFE3F7 & 0x1F59;
        n.llIllIIIl[15] = -(0xFFFFDEAF & 0x39DD) & (0xFFFF9FFF & 0x7BFE);
        n.llIllIIIl[16] = -(0xFFFFF6C7 & 0x5D3B) & (0xFFFFF7BF & 0x5F6B);
        n.llIllIIIl[17] = -(0xFFFF9935 & 0x7FFB) & (0xFFFF9F77 & 0x7DFF);
        n.llIllIIIl[18] = 0xFFFFA6FB & 0x5D95;
        n.llIllIIIl[19] = -(0xFFFFCEF7 & 0x799D) & (0xFFFFFCFF & 0x4FFD);
        n.llIllIIIl[20] = -(0xFFFFDBCF & 0x64BA) & (0xFFFFEBFF & Short.MAX_VALUE);
        n.llIllIIIl[21] = -(0xFFFFF87F & 0x7F93) & (0xFFFFFEBF & 0x7FFA);
        n.llIllIIIl[22] = -(0xFFFFC62F & 0x3FFF) & (0xFFFFB7FF & 0x7F7F);
        n.llIllIIIl[23] = 0xFFFFFF4D & 0x1FFB;
        n.llIllIIIl[24] = 0xF8 ^ 0x97 ^ (0x62 ^ 7);
        n.llIllIIIl[25] = -(0xFFFFBEBF & 0x61D1) & (0xFFFFBFFA & 0x7FDF);
        n.llIllIIIl[26] = 0xFFFFC97B & 0x37FF;
        n.llIllIIIl[27] = 21 + 64 - 77 + 182 ^ 117 + 36 - 116 + 123;
        n.llIllIIIl[28] = -(0xFFFFDEE3 & 0x7D9D) & (0xFFFFFFF7 & 0x5FAF);
        n.llIllIIIl[29] = 0xFFFFF6B0 & 0x2BFF;
        n.llIllIIIl[30] = 0x8A ^ 0x8C;
        n.llIllIIIl[31] = 0x63 ^ 0x6C ^ (0x54 ^ 0x4F);
        n.llIllIIIl[32] = 33 + 48 - -78 + 5 ^ 30 + 61 - -13 + 59;
        n.llIllIIIl[33] = 0x33 ^ 0x3D ^ (0x38 ^ 0x3E);
        n.llIllIIIl[34] = 0xFFFFB7F7 & 0x6ABA;
        n.llIllIIIl[35] = 0x43 ^ 0x4A;
        n.llIllIIIl[36] = 1 ^ 0x29;
        n.llIllIIIl[37] = 0x9F ^ 0xB7 ^ (0x1C ^ 0x3F);
        n.llIllIIIl[38] = 0xAF ^ 0x90 ^ (0x36 ^ 5);
        n.llIllIIIl[39] = 137 + 71 - 194 + 168 ^ 52 + 167 - 44 + 12;
        n.llIllIIIl[40] = 64 + 70 - 23 + 23 ^ 55 + 67 - 116 + 130;
        n.llIllIIIl[41] = 176 + 51 - 28 + 41;
        n.llIllIIIl[42] = 14 + 44 - 2 + 89 ^ 142 + 85 - 137 + 68;
        n.llIllIIIl[43] = 0x2F ^ 0x3F;
        n.llIllIIIl[44] = 0x2C ^ 0x19 ^ (0x25 ^ 1);
        n.llIllIIIl[45] = 0x1F ^ 0xD;
        n.llIllIIIl[46] = -(0xDB ^ 0x9F) & (0xFFFFFBFB & 0x3EDF);
        n.llIllIIIl[47] = -(0xFFFFFE3D & 0x19EB) & (0xFFFFBFFA & 0x5FFD);
        n.llIllIIIl[48] = 0xFFFFFAF9 & 0x2FFE;
        n.llIllIIIl[49] = -(0xFFFFF716 & 0x69EF) & (0xFFFFFBBF & 0x7F4F);
        n.llIllIIIl[50] = 0xFFFFDB7F & 0xAEF6;
        n.llIllIIIl[51] = -(151 + 47 - 102 + 67) & (0xFFFFBBFA & 0x5FFF);
        n.llIllIIIl[52] = -(0xFFFFBB3E & 0x65CF) & (0xFFFFE3FF & 0x7FED);
        n.llIllIIIl[53] = 0x7F ^ 0x5C;
        n.llIllIIIl[54] = 0x2E ^ 0x4A;
        n.llIllIIIl[55] = 0xFFFFC3CA & 0x3D75;
        n.llIllIIIl[56] = 0xFFFFFEDD & 0x2FEE;
        n.llIllIIIl[57] = -(0xFFFFDC71 & 0x2FCF) & (0xFFFFFDED & 0x6FFA);
        n.llIllIIIl[58] = -(0xFFFFFAFD & 0x6583) & (0xFFFFFFC7 & Short.MAX_VALUE);
        n.llIllIIIl[59] = -(0xFFFFFF77 & 0x7C99) & (0xFFFFFFD4 & 0x7FBF);
        n.llIllIIIl[60] = 0x88 ^ 0xC0 ^ (0x66 ^ 0x3D);
        n.llIllIIIl[61] = 0xD7 ^ 0xC2;
        n.llIllIIIl[62] = 0x44 ^ 0x52;
    }

    private static void Q() {
        block30: {
            d lIIIlIlllIlIII;
            block29: {
                block28: {
                    block27: {
                        Object lIIIlIlllIlIIl;
                        block25: {
                            block26: {
                                if (!n.lIllIlllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[27])) break block25;
                                int[] nArray = new int[llIllIIIl[1]];
                                nArray[n.llIllIIIl[0]] = llIllIIIl[12];
                                if (n.lIllIlllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                    d d2 = new d(llIllIIIl[12], llIllIIIl[1], llIllIIIl[46]);
                                    bx.add(d2);
                                    0;
                                }
                                int[] nArray2 = new int[llIllIIIl[1]];
                                nArray2[n.llIllIIIl[0]] = llIllIIIl[13];
                                if (n.lIllIlllIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                                    lIIIlIlllIlIIl = new d(llIllIIIl[13], llIllIIIl[1], llIllIIIl[46]);
                                    bx.add((d)lIIIlIlllIlIIl);
                                    0;
                                }
                                int[] nArray3 = new int[llIllIIIl[1]];
                                nArray3[n.llIllIIIl[0]] = llIllIIIl[14];
                                if (n.lIllIlllIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                    lIIIlIlllIlIIl = new d(llIllIIIl[14], llIllIIIl[1], llIllIIIl[46]);
                                    bx.add((d)lIIIlIlllIlIIl);
                                    0;
                                }
                                int[] nArray4 = new int[llIllIIIl[1]];
                                nArray4[n.llIllIIIl[0]] = llIllIIIl[15];
                                if (!n.lIllIlllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                                int[] nArray5 = new int[llIllIIIl[1]];
                                nArray5[n.llIllIIIl[0]] = llIllIIIl[15];
                                if (!n.lIllIlllIlII(Bank.getFirst((int[])nArray5).getQuantity(), llIllIIIl[47])) break block25;
                            }
                            lIIIlIlllIlIIl = new d(llIllIIIl[15], llIllIIIl[48], llIllIIIl[35]);
                            bx.add((d)lIIIlIlllIlIIl);
                            0;
                        }
                        int[] nArray = new int[llIllIIIl[1]];
                        nArray[n.llIllIIIl[0]] = llIllIIIl[18];
                        if (n.lIllIlllIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            lIIIlIlllIlIIl = new d(llIllIIIl[18], llIllIIIl[1], llIllIIIl[49]);
                            bx.add((d)lIIIlIlllIlIIl);
                            0;
                        }
                        int[] nArray6 = new int[llIllIIIl[1]];
                        nArray6[n.llIllIIIl[0]] = llIllIIIl[19];
                        if (n.lIllIlllIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                            lIIIlIlllIlIIl = new d(llIllIIIl[19], llIllIIIl[1], llIllIIIl[49]);
                            bx.add((d)lIIIlIlllIlIIl);
                            0;
                        }
                        int[] nArray7 = new int[llIllIIIl[1]];
                        nArray7[n.llIllIIIl[0]] = llIllIIIl[17];
                        if (n.lIllIlllIlIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                            lIIIlIlllIlIIl = new d(llIllIIIl[17], llIllIIIl[1], llIllIIIl[49]);
                            bx.add((d)lIIIlIlllIlIIl);
                            0;
                        }
                        int[] nArray8 = new int[llIllIIIl[1]];
                        nArray8[n.llIllIIIl[0]] = llIllIIIl[20];
                        if (n.lIllIlllIlIl(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            lIIIlIlllIlIIl = new d(llIllIIIl[20], llIllIIIl[1], llIllIIIl[50]);
                            bx.add((d)lIIIlIlllIlIIl);
                            0;
                        }
                        if (n.lIllIlllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7])) {
                            int[] nArray9 = new int[llIllIIIl[1]];
                            nArray9[n.llIllIIIl[0]] = llIllIIIl[16];
                            if (n.lIllIlllIlIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                lIIIlIlllIlIIl = new d(llIllIIIl[16], llIllIIIl[51], llIllIIIl[42]);
                                bx.add((d)lIIIlIlllIlIIl);
                                0;
                            }
                        }
                        int[] nArray10 = new int[llIllIIIl[1]];
                        nArray10[n.llIllIIIl[0]] = llIllIIIl[9];
                        if (n.lIllIlllIlIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                            lIIIlIlllIlIIl = new d(llIllIIIl[9], llIllIIIl[1], llIllIIIl[52]);
                            bx.add((d)lIIIlIlllIlIIl);
                            0;
                        }
                        int[] nArray11 = new int[llIllIIIl[1]];
                        nArray11[n.llIllIIIl[0]] = llIllIIIl[10];
                        if (n.lIllIlllIlIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                            lIIIlIlllIlIIl = new d(llIllIIIl[10], llIllIIIl[1], llIllIIIl[52]);
                            bx.add((d)lIIIlIlllIlIIl);
                            0;
                        }
                        if (n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7])) {
                            int[] nArray12 = new int[llIllIIIl[1]];
                            nArray12[n.llIllIIIl[0]] = llIllIIIl[11];
                            if (n.lIllIlllIlIl(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                lIIIlIlllIlIIl = new d(llIllIIIl[11], llIllIIIl[48], llIllIIIl[53]);
                                bx.add((d)lIIIlIlllIlIIl);
                                0;
                            }
                        }
                        int[] nArray13 = new int[llIllIIIl[1]];
                        nArray13[n.llIllIIIl[0]] = llIllIIIl[22];
                        if (n.lIllIlllIlIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                            lIIIlIlllIlIIl = new d(llIllIIIl[22], llIllIIIl[1], j.ch);
                            bx.add((d)lIIIlIlllIlIIl);
                            0;
                        }
                        int[] nArray14 = new int[llIllIIIl[1]];
                        nArray14[n.llIllIIIl[0]] = llIllIIIl[26];
                        if (n.lIllIlllIlIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                            lIIIlIlllIlIIl = new d(llIllIIIl[26], llIllIIIl[54], llIllIIIl[55]);
                            bx.add((d)lIIIlIlllIlIIl);
                            0;
                        }
                        if (n.lIllIlllIlIl(Bank.contains((Predicate)(lIIIlIlllIlIIl = item -> item.getName().toLowerCase().contains(llIllIIII[llIllIIIl[31]]))) ? 1 : 0)) {
                            lIIIlIlllIlIII = new d(llIllIIIl[56], llIllIIIl[5], llIllIIIl[57]);
                            bx.add(lIIIlIlllIlIII);
                            0;
                        }
                        int[] nArray15 = new int[llIllIIIl[1]];
                        nArray15[n.llIllIIIl[0]] = llIllIIIl[58];
                        if (!n.lIllIlllIIll(Bank.contains((int[])nArray15) ? 1 : 0)) break block27;
                        int[] nArray16 = new int[llIllIIIl[1]];
                        nArray16[n.llIllIIIl[0]] = llIllIIIl[58];
                        if (!n.lIllIlllIIll(Bank.contains((int[])nArray16) ? 1 : 0)) break block28;
                        int[] nArray17 = new int[llIllIIIl[1]];
                        nArray17[n.llIllIIIl[0]] = llIllIIIl[58];
                        if (!n.lIllIlllIlII(Bank.getFirst((int[])nArray17).getQuantity(), llIllIIIl[24])) break block28;
                    }
                    lIIIlIlllIlIII = new d(llIllIIIl[58], llIllIIIl[24], llIllIIIl[59]);
                    bx.add(lIIIlIlllIlIII);
                    0;
                }
                int[] nArray = new int[llIllIIIl[1]];
                nArray[n.llIllIIIl[0]] = llIllIIIl[23];
                if (!n.lIllIlllIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray18 = new int[llIllIIIl[1]];
                nArray18[n.llIllIIIl[0]] = llIllIIIl[23];
                if (!n.lIllIlllIIll(Bank.contains((int[])nArray18) ? 1 : 0)) break block30;
                int[] nArray19 = new int[llIllIIIl[1]];
                nArray19[n.llIllIIIl[0]] = llIllIIIl[23];
                if (!n.lIllIlllIlII(Bank.getFirst((int[])nArray19).getQuantity(), llIllIIIl[24])) break block30;
            }
            lIIIlIlllIlIII = new d(llIllIIIl[23], llIllIIIl[24], llIllIIIl[59]);
            bx.add(lIIIlIlllIlIII);
            0;
        }
    }

    private static boolean lIllIlllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlllIlll(int n2) {
        return n2 > 0;
    }

    private static String lIllIllIllIl(String lIIIlIllIIIlII, String lIIIlIllIIIIll) {
        try {
            SecretKeySpec lIIIlIllIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIlIllIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIIlIllIIIllI = Cipher.getInstance("Blowfish");
            lIIIlIllIIIllI.init(llIllIIIl[2], lIIIlIllIIIlll);
            return new String(lIIIlIllIIIllI.doFinal(Base64.getDecoder().decode(lIIIlIllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIllIIIlIl) {
            lIIIlIllIIIlIl.printStackTrace();
            return null;
        }
    }

    private static void aB() {
        block34: {
            block33: {
                int[] nArray = new int[llIllIIIl[1]];
                nArray[n.llIllIIIl[0]] = llIllIIIl[28];
                if (!n.lIllIlllIlIl(Equipment.contains((int[])nArray) ? 1 : 0)) break block33;
                int[] nArray2 = new int[llIllIIIl[1]];
                nArray2[n.llIllIIIl[0]] = llIllIIIl[29];
                if (!n.lIllIlllIlIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block33;
                int[] nArray3 = new int[llIllIIIl[1]];
                nArray3[n.llIllIIIl[0]] = llIllIIIl[16];
                if (!n.lIllIlllIlIl(Equipment.contains((int[])nArray3) ? 1 : 0)) break block33;
                int[] nArray4 = new int[llIllIIIl[1]];
                nArray4[n.llIllIIIl[0]] = llIllIIIl[11];
                if (n.lIllIlllIlIl(Equipment.contains((int[])nArray4) ? 1 : 0) && !n.lIllIlllIIll(Equipment.contains(item -> item.getName().contains(llIllIIII[llIllIIIl[61]])) ? 1 : 0)) break block34;
            }
            if (n.lIllIllllIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
                Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.SECOND);
            }
        }
        if (n.lIllIlllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[27])) {
            int[] nArray = new int[llIllIIIl[1]];
            nArray[n.llIllIIIl[0]] = llIllIIIl[28];
            if (n.lIllIlllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray5 = new int[llIllIIIl[1]];
                nArray5[n.llIllIIIl[0]] = llIllIIIl[28];
                Inventory.getFirst((int[])nArray5).interact(llIllIIII[llIllIIIl[30]]);
            }
            int[] nArray6 = new int[llIllIIIl[1]];
            nArray6[n.llIllIIIl[0]] = llIllIIIl[12];
            if (n.lIllIlllIIll(Inventory.contains((int[])nArray6) ? 1 : 0) && n.lIllIlllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[5])) {
                e.l(llIllIIIl[12]);
            }
            int[] nArray7 = new int[llIllIIIl[1]];
            nArray7[n.llIllIIIl[0]] = llIllIIIl[13];
            if (n.lIllIlllIIll(Inventory.contains((int[])nArray7) ? 1 : 0) && n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[5]) && n.lIllIlllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[31])) {
                e.l(llIllIIIl[13]);
            }
            int[] nArray8 = new int[llIllIIIl[1]];
            nArray8[n.llIllIIIl[0]] = llIllIIIl[14];
            if (n.lIllIlllIIll(Inventory.contains((int[])nArray8) ? 1 : 0) && n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[31])) {
                e.l(llIllIIIl[14]);
            }
            int[] nArray9 = new int[llIllIIIl[1]];
            nArray9[n.llIllIIIl[0]] = llIllIIIl[15];
            if (n.lIllIlllIIll(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                e.l(llIllIIIl[15]);
            }
        }
        if (n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[31])) {
            int[] nArray = new int[llIllIIIl[1]];
            nArray[n.llIllIIIl[0]] = llIllIIIl[18];
            if (n.lIllIlllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray10 = new int[llIllIIIl[1]];
                nArray10[n.llIllIIIl[0]] = llIllIIIl[18];
                Inventory.getFirst((int[])nArray10).interact(llIllIIII[llIllIIIl[32]]);
            }
        }
        if (n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[27])) {
            int[] nArray = new int[llIllIIIl[1]];
            nArray[n.llIllIIIl[0]] = llIllIIIl[29];
            if (n.lIllIlllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray11 = new int[llIllIIIl[1]];
                nArray11[n.llIllIIIl[0]] = llIllIIIl[29];
                Inventory.getFirst((int[])nArray11).interact(llIllIIII[llIllIIIl[33]]);
            }
            int[] nArray12 = new int[llIllIIIl[1]];
            nArray12[n.llIllIIIl[0]] = llIllIIIl[34];
            if (n.lIllIlllIIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                int[] nArray13 = new int[llIllIIIl[1]];
                nArray13[n.llIllIIIl[0]] = llIllIIIl[34];
                Inventory.getFirst((int[])nArray13).interact(llIllIIII[llIllIIIl[35]]);
            }
            int[] nArray14 = new int[llIllIIIl[1]];
            nArray14[n.llIllIIIl[0]] = llIllIIIl[16];
            if (n.lIllIlllIIll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[llIllIIIl[1]];
                nArray15[n.llIllIIIl[0]] = llIllIIIl[16];
                Inventory.getFirst((int[])nArray15).interact(llIllIIII[llIllIIIl[24]]);
            }
        }
        if (n.lIllIlllIlII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIIIl[36])) {
            int[] nArray = new int[llIllIIIl[1]];
            nArray[n.llIllIIIl[0]] = llIllIIIl[19];
            if (n.lIllIlllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llIllIIIl[1]];
                nArray16[n.llIllIIIl[0]] = llIllIIIl[19];
                Inventory.getFirst((int[])nArray16).interact(llIllIIII[llIllIIIl[37]]);
            }
        }
        if (n.lIllIlllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7])) {
            int[] nArray = new int[llIllIIIl[1]];
            nArray[n.llIllIIIl[0]] = llIllIIIl[17];
            if (n.lIllIlllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray17 = new int[llIllIIIl[1]];
                nArray17[n.llIllIIIl[0]] = llIllIIIl[17];
                Inventory.getFirst((int[])nArray17).interact(llIllIIII[llIllIIIl[38]]);
            }
        }
        int[] nArray = new int[llIllIIIl[1]];
        nArray[n.llIllIIIl[0]] = llIllIIIl[20];
        if (n.lIllIlllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray18 = new int[llIllIIIl[1]];
            nArray18[n.llIllIIIl[0]] = llIllIIIl[20];
            Inventory.getFirst((int[])nArray18).interact(llIllIIII[llIllIIIl[39]]);
        }
        int[] nArray19 = new int[llIllIIIl[1]];
        nArray19[n.llIllIIIl[0]] = llIllIIIl[21];
        if (n.lIllIlllIIll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
            int[] nArray20 = new int[llIllIIIl[1]];
            nArray20[n.llIllIIIl[0]] = llIllIIIl[21];
            Inventory.getFirst((int[])nArray20).interact(llIllIIII[llIllIIIl[40]]);
        }
        if (n.lIllIllllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIIl[41])) {
            int[] nArray21 = new int[llIllIIIl[1]];
            nArray21[n.llIllIIIl[0]] = llIllIIIl[8];
            if (n.lIllIlllIIll(Inventory.contains((int[])nArray21) ? 1 : 0)) {
                int[] nArray22 = new int[llIllIIIl[1]];
                nArray22[n.llIllIIIl[0]] = llIllIIIl[8];
                if (n.lIllIlllIlIl(Equipment.contains((int[])nArray22) ? 1 : 0)) {
                    int[] nArray23 = new int[llIllIIIl[1]];
                    nArray23[n.llIllIIIl[0]] = llIllIIIl[8];
                    Inventory.getFirst((int[])nArray23).interact(llIllIIII[llIllIIIl[42]]);
                }
            }
            if (n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7])) {
                int[] nArray24 = new int[llIllIIIl[1]];
                nArray24[n.llIllIIIl[0]] = llIllIIIl[9];
                if (n.lIllIlllIIll(Inventory.contains((int[])nArray24) ? 1 : 0)) {
                    int[] nArray25 = new int[llIllIIIl[1]];
                    nArray25[n.llIllIIIl[0]] = llIllIIIl[9];
                    if (n.lIllIlllIlIl(Equipment.contains((int[])nArray25) ? 1 : 0)) {
                        int[] nArray26 = new int[llIllIIIl[1]];
                        nArray26[n.llIllIIIl[0]] = llIllIIIl[9];
                        Inventory.getFirst((int[])nArray26).interact(llIllIIII[llIllIIIl[43]]);
                    }
                }
            }
            if (n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7]) && n.lIllIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIIIl[36])) {
                int[] nArray27 = new int[llIllIIIl[1]];
                nArray27[n.llIllIIIl[0]] = llIllIIIl[10];
                if (n.lIllIlllIIll(Inventory.contains((int[])nArray27) ? 1 : 0)) {
                    int[] nArray28 = new int[llIllIIIl[1]];
                    nArray28[n.llIllIIIl[0]] = llIllIIIl[10];
                    if (n.lIllIlllIlIl(Equipment.contains((int[])nArray28) ? 1 : 0)) {
                        int[] nArray29 = new int[llIllIIIl[1]];
                        nArray29[n.llIllIIIl[0]] = llIllIIIl[10];
                        Inventory.getFirst((int[])nArray29).interact(llIllIIII[llIllIIIl[44]]);
                    }
                }
            }
            if (n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7])) {
                int[] nArray30 = new int[llIllIIIl[1]];
                nArray30[n.llIllIIIl[0]] = llIllIIIl[11];
                if (n.lIllIlllIIll(Inventory.contains((int[])nArray30) ? 1 : 0)) {
                    int[] nArray31 = new int[llIllIIIl[1]];
                    nArray31[n.llIllIIIl[0]] = llIllIIIl[11];
                    Inventory.getFirst((int[])nArray31).interact(llIllIIII[llIllIIIl[45]]);
                }
            }
        }
    }

    @Override
    public String ag() {
        return llIllIIII[llIllIIIl[60]];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ao() {
        int n2;
        block20: {
            block21: {
                if (n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7]) && n.lIllIllllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIIl[41]) && n.lIllIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIIIl[36])) {
                    int n3;
                    int[] nArray = new int[llIllIIIl[1]];
                    nArray[n.llIllIIIl[0]] = llIllIIIl[9];
                    if (n.lIllIlllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[llIllIIIl[1]];
                        nArray2[n.llIllIIIl[0]] = llIllIIIl[10];
                        if (n.lIllIlllIIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                            int[] nArray3 = new int[llIllIIIl[1]];
                            nArray3[n.llIllIIIl[0]] = llIllIIIl[18];
                            if (n.lIllIlllIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llIllIIIl[1]];
                                nArray4[n.llIllIIIl[0]] = llIllIIIl[20];
                                if (n.lIllIlllIIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                                    int[] nArray5 = new int[llIllIIIl[1]];
                                    nArray5[n.llIllIIIl[0]] = llIllIIIl[11];
                                    if (n.lIllIlllIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                        int[] nArray6 = new int[llIllIIIl[1]];
                                        nArray6[n.llIllIIIl[0]] = llIllIIIl[8];
                                        if (n.lIllIlllIIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                                            int[] nArray7 = new int[llIllIIIl[1]];
                                            nArray7[n.llIllIIIl[0]] = llIllIIIl[26];
                                            if (n.lIllIlllIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                                n3 = llIllIIIl[1];
                                                0;
                                                if ((0x17 ^ 0x13) >= ((0xA6 ^ 0x9D) & ~(0x9E ^ 0xA5))) return n3 != 0;
                                                return false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n3 = llIllIIIl[0];
                    return n3 != 0;
                }
                if (n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[27]) && n.lIllIlllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7])) {
                    int n4;
                    int[] nArray = new int[llIllIIIl[1]];
                    nArray[n.llIllIIIl[0]] = llIllIIIl[17];
                    if (n.lIllIlllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray8 = new int[llIllIIIl[1]];
                        nArray8[n.llIllIIIl[0]] = llIllIIIl[19];
                        if (n.lIllIlllIIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
                            int[] nArray9 = new int[llIllIIIl[1]];
                            nArray9[n.llIllIIIl[0]] = llIllIIIl[18];
                            if (n.lIllIlllIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llIllIIIl[1]];
                                nArray10[n.llIllIIIl[0]] = llIllIIIl[20];
                                if (n.lIllIlllIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                                    int[] nArray11 = new int[llIllIIIl[1]];
                                    nArray11[n.llIllIIIl[0]] = llIllIIIl[16];
                                    if (n.lIllIlllIIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                        int[] nArray12 = new int[llIllIIIl[1]];
                                        nArray12[n.llIllIIIl[0]] = llIllIIIl[26];
                                        if (n.lIllIlllIIll(Bank.contains((int[])nArray12) ? 1 : 0)) {
                                            n4 = llIllIIIl[1];
                                            0;
                                            if (-1 <= 3) return n4 != 0;
                                            return ((0x64 ^ 0x41 ^ (0x80 ^ 0xC5)) & (168 + 117 - 218 + 185 ^ 64 + 44 - 65 + 113 ^ -1)) != 0;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    n4 = llIllIIIl[0];
                    return n4 != 0;
                }
                int[] nArray = new int[llIllIIIl[1]];
                nArray[n.llIllIIIl[0]] = llIllIIIl[17];
                if (!n.lIllIlllIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                int[] nArray13 = new int[llIllIIIl[1]];
                nArray13[n.llIllIIIl[0]] = llIllIIIl[19];
                if (!n.lIllIlllIIll(Bank.contains((int[])nArray13) ? 1 : 0)) break block20;
                int[] nArray14 = new int[llIllIIIl[1]];
                nArray14[n.llIllIIIl[0]] = llIllIIIl[18];
                if (!n.lIllIlllIIll(Bank.contains((int[])nArray14) ? 1 : 0)) break block20;
                int[] nArray15 = new int[llIllIIIl[1]];
                nArray15[n.llIllIIIl[0]] = llIllIIIl[20];
                if (!n.lIllIlllIIll(Bank.contains((int[])nArray15) ? 1 : 0)) break block20;
                int[] nArray16 = new int[llIllIIIl[1]];
                nArray16[n.llIllIIIl[0]] = llIllIIIl[12];
                if (!n.lIllIlllIIll(Bank.contains((int[])nArray16) ? 1 : 0)) break block20;
                int[] nArray17 = new int[llIllIIIl[1]];
                nArray17[n.llIllIIIl[0]] = llIllIIIl[23];
                if (!n.lIllIlllIIll(Bank.contains((int[])nArray17) ? 1 : 0)) break block20;
                int[] nArray18 = new int[llIllIIIl[1]];
                nArray18[n.llIllIIIl[0]] = llIllIIIl[13];
                if (!n.lIllIlllIIll(Bank.contains((int[])nArray18) ? 1 : 0)) break block20;
                int[] nArray19 = new int[llIllIIIl[1]];
                nArray19[n.llIllIIIl[0]] = llIllIIIl[14];
                if (!n.lIllIlllIIll(Bank.contains((int[])nArray19) ? 1 : 0)) break block20;
                int[] nArray20 = new int[llIllIIIl[1]];
                nArray20[n.llIllIIIl[0]] = llIllIIIl[15];
                if (!n.lIllIlllIlIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block21;
                int[] nArray21 = new int[llIllIIIl[1]];
                nArray21[n.llIllIIIl[0]] = llIllIIIl[15];
                if (!n.lIllIlllIIll(Equipment.contains((int[])nArray21) ? 1 : 0)) break block20;
            }
            int[] nArray = new int[llIllIIIl[1]];
            nArray[n.llIllIIIl[0]] = llIllIIIl[16];
            if (n.lIllIlllIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray22 = new int[llIllIIIl[1]];
                nArray22[n.llIllIIIl[0]] = llIllIIIl[26];
                if (n.lIllIlllIIll(Bank.contains((int[])nArray22) ? 1 : 0)) {
                    n2 = llIllIIIl[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0xCF ^ 0xC6 ^ (0x44 ^ 0x66)) & (0x90 ^ 0xAB ^ (0xD7 ^ 0xC7) ^ -1)) != 0;
                }
            }
        }
        n2 = llIllIIIl[0];
        return n2 != 0;
    }

    static {
        n.lIllIlllIIlI();
        n.lIllIlllIIII();
        bx = new ArrayList<d>();
    }

    private static String lIllIllIlllI(String lIIIlIllIllIIl, String lIIIlIllIlIIll) {
        lIIIlIllIllIIl = new String(Base64.getDecoder().decode(lIIIlIllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIIlIllIlIlll = new StringBuilder();
        char[] lIIIlIllIlIllI = lIIIlIllIlIIll.toCharArray();
        int lIIIlIllIlIlIl = llIllIIIl[0];
        char[] lIIIlIllIIllll = lIIIlIllIllIIl.toCharArray();
        int lIIIlIllIIlllI = lIIIlIllIIllll.length;
        int lIIIlIllIIllIl = llIllIIIl[0];
        while (n.lIllIlllIlII(lIIIlIllIIllIl, lIIIlIllIIlllI)) {
            char lIIIlIllIllIlI = lIIIlIllIIllll[lIIIlIllIIllIl];
            lIIIlIllIlIlll.append((char)(lIIIlIllIllIlI ^ lIIIlIllIlIllI[lIIIlIllIlIlIl % lIIIlIllIlIllI.length]));
            0;
            ++lIIIlIllIlIlIl;
            ++lIIIlIllIIllIl;
            0;
            if (((0x36 ^ 0xA ^ (0x1C ^ 0x7B)) & (0x94 ^ 0xC3 ^ (0x5E ^ 0x52) ^ -1)) != 3) continue;
            return null;
        }
        return String.valueOf(lIIIlIllIlIlll);
    }

    private static String lIllIllIllll(String lIIIlIlIllIlll, String lIIIlIlIllIllI) {
        try {
            SecretKeySpec lIIIlIlIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIlIlIllIllI.getBytes(StandardCharsets.UTF_8)), llIllIIIl[33]), "DES");
            Cipher lIIIlIlIlllIIl = Cipher.getInstance("DES");
            lIIIlIlIlllIIl.init(llIllIIIl[2], lIIIlIlIlllIlI);
            return new String(lIIIlIlIlllIIl.doFinal(Base64.getDecoder().decode(lIIIlIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIIlIlIlllIII) {
            lIIIlIlIlllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIllllIIl(Object object, Object object2) {
        return object != object2;
    }

    private static void lIllIlllIIII() {
        llIllIIII = new String[llIllIIIl[62]];
        n.llIllIIII[n.llIllIIIl[0]] = n."Buying items";
        n.llIllIIII[n.llIllIIIl[1]] = n."Finished buying items, switching back to magic training";
        n.llIllIIII[n.llIllIIIl[2]] = n."Navigating to bank";
        n.llIllIIII[n.llIllIIIl[3]] = n."Handling banking";
        n.llIllIIII[n.llIllIIIl[6]] = n."We are missing supplies, switching to BUYING";
        n.llIllIIII[n.llIllIIIl[5]] = n."Take";
        n.llIllIIII[n.llIllIIIl[30]] = n."Wield";
        n.llIllIIII[n.llIllIIIl[32]] = n."Wear";
        n.llIllIIII[n.llIllIIIl[33]] = n."Wield";
        n.llIllIIII[n.llIllIIIl[35]] = n."Wield";
        n.llIllIIII[n.llIllIIIl[24]] = n."Wield";
        n.llIllIIII[n.llIllIIIl[37]] = n."Wear";
        n.llIllIIII[n.llIllIIIl[38]] = n."Wear";
        n.llIllIIII[n.llIllIIIl[39]] = n."Wear";
        n.llIllIIII[n.llIllIIIl[40]] = n."Wear";
        n.llIllIIII[n.llIllIIIl[42]] = n."Wear";
        n.llIllIIII[n.llIllIIIl[43]] = n."Wear";
        n.llIllIIII[n.llIllIIIl[44]] = n."Wear";
        n.llIllIIII[n.llIllIIIl[45]] = n."Wield";
        n.llIllIIII[n.llIllIIIl[60]] = n."Range training";
        n.llIllIIII[n.llIllIIIl[31]] = n."ring of wealth (";
        n.llIllIIII[n.llIllIIIl[61]] = n."bow";
    }

    public static void aA() {
        if (n.lIllIlllIIll(bv ? 1 : 0)) {
            AccBuilderGWD.c = llIllIIII[llIllIIIl[0]];
            b.a(bx);
            if (n.lIllIlllIlII(bx.size(), llIllIIIl[1])) {
                System.out.println(llIllIIII[llIllIIIl[1]]);
                bv = llIllIIIl[0];
            }
        }
        if (n.lIllIlllIlIl(bv ? 1 : 0)) {
            BankLocation lIIIlIlllIllII;
            if (n.lIllIlllIlIl(n.an() ? 1 : 0)) {
                lIIIlIlllIllII = BankLocation.getNearest();
                if (n.lIllIlllIllI(lIIIlIlllIllII) && n.lIllIlllIlIl(lIIIlIlllIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIllIIII[llIllIIIl[2]];
                    a.a(lIIIlIlllIllII);
                }
                if (n.lIllIlllIllI(lIIIlIlllIllII) && n.lIllIlllIIll(lIIIlIlllIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = llIllIIII[llIllIIIl[3]];
                    if (n.lIllIlllIlIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIllIIIl[4]);
                        0;
                        Time.sleepTicks((int)llIllIIIl[3]);
                        0;
                    }
                    if (n.lIllIlllIIll(Bank.isOpen() ? 1 : 0)) {
                        if (n.lIllIlllIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llIllIIIl[5]);
                            0;
                        }
                        if (n.lIllIlllIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks((int)llIllIIIl[2]);
                            0;
                        }
                        if (n.lIllIlllIlIl(n.ao() ? 1 : 0)) {
                            n.Q();
                            System.out.println(llIllIIII[llIllIIIl[6]]);
                            bv = llIllIIIl[1];
                            return;
                        }
                        if (n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7])) {
                            a.a(llIllIIIl[8], llIllIIIl[1]);
                            a.a(llIllIIIl[9], llIllIIIl[1]);
                            a.a(llIllIIIl[10], llIllIIIl[1]);
                            Bank.withdrawAll((int)llIllIIIl[11], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                        }
                        if (n.lIllIlllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7])) {
                            a.a(llIllIIIl[12], llIllIIIl[1]);
                            a.a(llIllIIIl[13], llIllIIIl[1]);
                            a.a(llIllIIIl[14], llIllIIIl[1]);
                            Bank.withdrawAll((int)llIllIIIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llIllIIIl[1]);
                            0;
                            Bank.withdrawAll((int)llIllIIIl[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llIllIIIl[1]);
                            0;
                            a.a(llIllIIIl[17], llIllIIIl[1]);
                        }
                        a.a(llIllIIIl[18], llIllIIIl[1]);
                        a.a(llIllIIIl[19], llIllIIIl[1]);
                        a.a(llIllIIIl[20], llIllIIIl[1]);
                        a.a(llIllIIIl[21], llIllIIIl[1]);
                        a.a(llIllIIIl[22], llIllIIIl[1]);
                        a.a(llIllIIIl[23], llIllIIIl[24]);
                        a.a(llIllIIIl[25], llIllIIIl[24]);
                        a.a(llIllIIIl[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (n.lIllIlllIIll(n.an() ? 1 : 0)) {
                n.aB();
                if (n.lIllIlllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[27])) {
                    m.al();
                }
                if (n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[27])) {
                    lIIIlIlllIllII = TileItems.getNearest(tileItem -> {
                        int n2;
                        if (n.lIllIllllIlI(tileItem.getId(), llIllIIIl[16]) && n.lIllIllllIII(tileItem.getQuantity(), llIllIIIl[42])) {
                            n2 = llIllIIIl[1];
                            0;
                            if (1 == 0) {
                                return ((0xDF ^ 0x88 ^ (0xE5 ^ 0x93)) & (35 + 69 - -30 + 45 ^ 37 + 44 - -25 + 40 ^ -1)) != 0;
                            }
                        } else {
                            n2 = llIllIIIl[0];
                        }
                        return n2 != 0;
                    });
                    if (n.lIllIlllIllI(lIIIlIlllIllII)) {
                        lIIIlIlllIllII.interact(llIllIIII[llIllIIIl[5]]);
                        Time.sleepTicks((int)llIllIIIl[6]);
                        0;
                    }
                    l.aj();
                }
            }
        }
    }

    private static boolean lIllIlllIIll(int n2) {
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block40: {
            block48: {
                block47: {
                    block46: {
                        block45: {
                            block44: {
                                block43: {
                                    block42: {
                                        block41: {
                                            block39: {
                                                block32: {
                                                    int n3;
                                                    block34: {
                                                        block38: {
                                                            block37: {
                                                                block36: {
                                                                    block35: {
                                                                        block33: {
                                                                            block24: {
                                                                                int n4;
                                                                                block26: {
                                                                                    block31: {
                                                                                        block30: {
                                                                                            block29: {
                                                                                                block28: {
                                                                                                    block27: {
                                                                                                        block25: {
                                                                                                            block16: {
                                                                                                                int n5;
                                                                                                                block18: {
                                                                                                                    block23: {
                                                                                                                        block22: {
                                                                                                                            block21: {
                                                                                                                                block20: {
                                                                                                                                    block19: {
                                                                                                                                        block17: {
                                                                                                                                            if (!n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7]) || !n.lIllIllllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIIl[41]) || !n.lIllIllllIII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIIIl[36])) break block16;
                                                                                                                                            int[] nArray = new int[llIllIIIl[1]];
                                                                                                                                            nArray[n.llIllIIIl[0]] = llIllIIIl[9];
                                                                                                                                            if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block17;
                                                                                                                                            int[] nArray2 = new int[llIllIIIl[1]];
                                                                                                                                            nArray2[n.llIllIIIl[0]] = llIllIIIl[9];
                                                                                                                                            if (!n.lIllIlllIIll(Equipment.contains((int[])nArray2) ? 1 : 0)) break block18;
                                                                                                                                        }
                                                                                                                                        int[] nArray = new int[llIllIIIl[1]];
                                                                                                                                        nArray[n.llIllIIIl[0]] = llIllIIIl[10];
                                                                                                                                        if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block19;
                                                                                                                                        int[] nArray3 = new int[llIllIIIl[1]];
                                                                                                                                        nArray3[n.llIllIIIl[0]] = llIllIIIl[10];
                                                                                                                                        if (!n.lIllIlllIIll(Equipment.contains((int[])nArray3) ? 1 : 0)) break block18;
                                                                                                                                    }
                                                                                                                                    int[] nArray = new int[llIllIIIl[1]];
                                                                                                                                    nArray[n.llIllIIIl[0]] = llIllIIIl[18];
                                                                                                                                    if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                                                                                                    int[] nArray4 = new int[llIllIIIl[1]];
                                                                                                                                    nArray4[n.llIllIIIl[0]] = llIllIIIl[18];
                                                                                                                                    if (!n.lIllIlllIIll(Equipment.contains((int[])nArray4) ? 1 : 0)) break block18;
                                                                                                                                }
                                                                                                                                int[] nArray = new int[llIllIIIl[1]];
                                                                                                                                nArray[n.llIllIIIl[0]] = llIllIIIl[20];
                                                                                                                                if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                                                                                                                                int[] nArray5 = new int[llIllIIIl[1]];
                                                                                                                                nArray5[n.llIllIIIl[0]] = llIllIIIl[20];
                                                                                                                                if (!n.lIllIlllIIll(Equipment.contains((int[])nArray5) ? 1 : 0)) break block18;
                                                                                                                            }
                                                                                                                            int[] nArray = new int[llIllIIIl[1]];
                                                                                                                            nArray[n.llIllIIIl[0]] = llIllIIIl[11];
                                                                                                                            if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                                                                                                                            int[] nArray6 = new int[llIllIIIl[1]];
                                                                                                                            nArray6[n.llIllIIIl[0]] = llIllIIIl[11];
                                                                                                                            if (!n.lIllIlllIIll(Equipment.contains((int[])nArray6) ? 1 : 0)) break block18;
                                                                                                                        }
                                                                                                                        int[] nArray = new int[llIllIIIl[1]];
                                                                                                                        nArray[n.llIllIIIl[0]] = llIllIIIl[8];
                                                                                                                        if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                                                                                                        int[] nArray7 = new int[llIllIIIl[1]];
                                                                                                                        nArray7[n.llIllIIIl[0]] = llIllIIIl[8];
                                                                                                                        if (!n.lIllIlllIIll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block18;
                                                                                                                    }
                                                                                                                    int[] nArray = new int[llIllIIIl[1]];
                                                                                                                    nArray[n.llIllIIIl[0]] = llIllIIIl[26];
                                                                                                                    if (n.lIllIlllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                                                        n5 = llIllIIIl[1];
                                                                                                                        0;
                                                                                                                        if (null == null) return n5 != 0;
                                                                                                                        return ((2 ^ 0x44 ^ (0x64 ^ 0x7E)) & (127 + 182 - 257 + 166 ^ 115 + 79 - 78 + 18 ^ -1)) != 0;
                                                                                                                    }
                                                                                                                }
                                                                                                                n5 = llIllIIIl[0];
                                                                                                                return n5 != 0;
                                                                                                            }
                                                                                                            if (!n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7]) || !n.lIllIllllIlI(Vars.getBit((int)QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), llIllIIIl[41]) || !n.lIllIlllIlII(Skills.getLevel((Skill)Skill.DEFENCE), llIllIIIl[36])) break block24;
                                                                                                            int[] nArray = new int[llIllIIIl[1]];
                                                                                                            nArray[n.llIllIIIl[0]] = llIllIIIl[9];
                                                                                                            if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block25;
                                                                                                            int[] nArray8 = new int[llIllIIIl[1]];
                                                                                                            nArray8[n.llIllIIIl[0]] = llIllIIIl[9];
                                                                                                            if (!n.lIllIlllIIll(Equipment.contains((int[])nArray8) ? 1 : 0)) break block26;
                                                                                                        }
                                                                                                        int[] nArray = new int[llIllIIIl[1]];
                                                                                                        nArray[n.llIllIIIl[0]] = llIllIIIl[19];
                                                                                                        if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block27;
                                                                                                        int[] nArray9 = new int[llIllIIIl[1]];
                                                                                                        nArray9[n.llIllIIIl[0]] = llIllIIIl[19];
                                                                                                        if (!n.lIllIlllIIll(Equipment.contains((int[])nArray9) ? 1 : 0)) break block26;
                                                                                                    }
                                                                                                    int[] nArray = new int[llIllIIIl[1]];
                                                                                                    nArray[n.llIllIIIl[0]] = llIllIIIl[18];
                                                                                                    if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                                                                                                    int[] nArray10 = new int[llIllIIIl[1]];
                                                                                                    nArray10[n.llIllIIIl[0]] = llIllIIIl[18];
                                                                                                    if (!n.lIllIlllIIll(Equipment.contains((int[])nArray10) ? 1 : 0)) break block26;
                                                                                                }
                                                                                                int[] nArray = new int[llIllIIIl[1]];
                                                                                                nArray[n.llIllIIIl[0]] = llIllIIIl[20];
                                                                                                if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block29;
                                                                                                int[] nArray11 = new int[llIllIIIl[1]];
                                                                                                nArray11[n.llIllIIIl[0]] = llIllIIIl[20];
                                                                                                if (!n.lIllIlllIIll(Equipment.contains((int[])nArray11) ? 1 : 0)) break block26;
                                                                                            }
                                                                                            int[] nArray = new int[llIllIIIl[1]];
                                                                                            nArray[n.llIllIIIl[0]] = llIllIIIl[11];
                                                                                            if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block30;
                                                                                            int[] nArray12 = new int[llIllIIIl[1]];
                                                                                            nArray12[n.llIllIIIl[0]] = llIllIIIl[11];
                                                                                            if (!n.lIllIlllIIll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block26;
                                                                                        }
                                                                                        int[] nArray = new int[llIllIIIl[1]];
                                                                                        nArray[n.llIllIIIl[0]] = llIllIIIl[8];
                                                                                        if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block31;
                                                                                        int[] nArray13 = new int[llIllIIIl[1]];
                                                                                        nArray13[n.llIllIIIl[0]] = llIllIIIl[8];
                                                                                        if (!n.lIllIlllIIll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block26;
                                                                                    }
                                                                                    int[] nArray = new int[llIllIIIl[1]];
                                                                                    nArray[n.llIllIIIl[0]] = llIllIIIl[26];
                                                                                    if (n.lIllIlllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                                                        n4 = llIllIIIl[1];
                                                                                        0;
                                                                                        if (3 >= 0) return n4 != 0;
                                                                                        return false;
                                                                                    }
                                                                                }
                                                                                n4 = llIllIIIl[0];
                                                                                return n4 != 0;
                                                                            }
                                                                            if (!n.lIllIllllIII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[27]) || !n.lIllIlllIlII(Skills.getLevel((Skill)Skill.RANGED), llIllIIIl[7])) break block32;
                                                                            int[] nArray = new int[llIllIIIl[1]];
                                                                            nArray[n.llIllIIIl[0]] = llIllIIIl[17];
                                                                            if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block33;
                                                                            int[] nArray14 = new int[llIllIIIl[1]];
                                                                            nArray14[n.llIllIIIl[0]] = llIllIIIl[17];
                                                                            if (!n.lIllIlllIIll(Equipment.contains((int[])nArray14) ? 1 : 0)) break block34;
                                                                        }
                                                                        int[] nArray = new int[llIllIIIl[1]];
                                                                        nArray[n.llIllIIIl[0]] = llIllIIIl[19];
                                                                        if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block35;
                                                                        int[] nArray15 = new int[llIllIIIl[1]];
                                                                        nArray15[n.llIllIIIl[0]] = llIllIIIl[19];
                                                                        if (!n.lIllIlllIIll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block34;
                                                                    }
                                                                    int[] nArray = new int[llIllIIIl[1]];
                                                                    nArray[n.llIllIIIl[0]] = llIllIIIl[18];
                                                                    if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block36;
                                                                    int[] nArray16 = new int[llIllIIIl[1]];
                                                                    nArray16[n.llIllIIIl[0]] = llIllIIIl[18];
                                                                    if (!n.lIllIlllIIll(Equipment.contains((int[])nArray16) ? 1 : 0)) break block34;
                                                                }
                                                                int[] nArray = new int[llIllIIIl[1]];
                                                                nArray[n.llIllIIIl[0]] = llIllIIIl[20];
                                                                if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block37;
                                                                int[] nArray17 = new int[llIllIIIl[1]];
                                                                nArray17[n.llIllIIIl[0]] = llIllIIIl[20];
                                                                if (!n.lIllIlllIIll(Equipment.contains((int[])nArray17) ? 1 : 0)) break block34;
                                                            }
                                                            int[] nArray = new int[llIllIIIl[1]];
                                                            nArray[n.llIllIIIl[0]] = llIllIIIl[16];
                                                            if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block38;
                                                            int[] nArray18 = new int[llIllIIIl[1]];
                                                            nArray18[n.llIllIIIl[0]] = llIllIIIl[16];
                                                            if (!n.lIllIlllIIll(Equipment.contains((int[])nArray18) ? 1 : 0)) break block34;
                                                        }
                                                        int[] nArray = new int[llIllIIIl[1]];
                                                        nArray[n.llIllIIIl[0]] = llIllIIIl[26];
                                                        if (n.lIllIlllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                            n3 = llIllIIIl[1];
                                                            0;
                                                            if (-2 < 0) return n3 != 0;
                                                            return false;
                                                        }
                                                    }
                                                    n3 = llIllIIIl[0];
                                                    return n3 != 0;
                                                }
                                                int[] nArray = new int[llIllIIIl[1]];
                                                nArray[n.llIllIIIl[0]] = llIllIIIl[17];
                                                if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block39;
                                                int[] nArray19 = new int[llIllIIIl[1]];
                                                nArray19[n.llIllIIIl[0]] = llIllIIIl[17];
                                                if (!n.lIllIlllIIll(Equipment.contains((int[])nArray19) ? 1 : 0)) break block40;
                                            }
                                            int[] nArray = new int[llIllIIIl[1]];
                                            nArray[n.llIllIIIl[0]] = llIllIIIl[19];
                                            if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block41;
                                            int[] nArray20 = new int[llIllIIIl[1]];
                                            nArray20[n.llIllIIIl[0]] = llIllIIIl[19];
                                            if (!n.lIllIlllIIll(Equipment.contains((int[])nArray20) ? 1 : 0)) break block40;
                                        }
                                        int[] nArray = new int[llIllIIIl[1]];
                                        nArray[n.llIllIIIl[0]] = llIllIIIl[18];
                                        if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block42;
                                        int[] nArray21 = new int[llIllIIIl[1]];
                                        nArray21[n.llIllIIIl[0]] = llIllIIIl[18];
                                        if (!n.lIllIlllIIll(Equipment.contains((int[])nArray21) ? 1 : 0)) break block40;
                                    }
                                    int[] nArray = new int[llIllIIIl[1]];
                                    nArray[n.llIllIIIl[0]] = llIllIIIl[20];
                                    if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block43;
                                    int[] nArray22 = new int[llIllIIIl[1]];
                                    nArray22[n.llIllIIIl[0]] = llIllIIIl[20];
                                    if (!n.lIllIlllIIll(Equipment.contains((int[])nArray22) ? 1 : 0)) break block40;
                                }
                                int[] nArray = new int[llIllIIIl[1]];
                                nArray[n.llIllIIIl[0]] = llIllIIIl[15];
                                if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block44;
                                int[] nArray23 = new int[llIllIIIl[1]];
                                nArray23[n.llIllIIIl[0]] = llIllIIIl[15];
                                if (!n.lIllIlllIIll(Equipment.contains((int[])nArray23) ? 1 : 0)) break block40;
                            }
                            int[] nArray = new int[llIllIIIl[1]];
                            nArray[n.llIllIIIl[0]] = llIllIIIl[12];
                            if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block45;
                            int[] nArray24 = new int[llIllIIIl[1]];
                            nArray24[n.llIllIIIl[0]] = llIllIIIl[12];
                            if (!n.lIllIlllIIll(Equipment.contains((int[])nArray24) ? 1 : 0)) break block40;
                        }
                        int[] nArray = new int[llIllIIIl[1]];
                        nArray[n.llIllIIIl[0]] = llIllIIIl[13];
                        if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block46;
                        int[] nArray25 = new int[llIllIIIl[1]];
                        nArray25[n.llIllIIIl[0]] = llIllIIIl[13];
                        if (!n.lIllIlllIIll(Equipment.contains((int[])nArray25) ? 1 : 0)) break block40;
                    }
                    int[] nArray = new int[llIllIIIl[1]];
                    nArray[n.llIllIIIl[0]] = llIllIIIl[14];
                    if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block47;
                    int[] nArray26 = new int[llIllIIIl[1]];
                    nArray26[n.llIllIIIl[0]] = llIllIIIl[14];
                    if (!n.lIllIlllIIll(Equipment.contains((int[])nArray26) ? 1 : 0)) break block40;
                }
                int[] nArray = new int[llIllIIIl[1]];
                nArray[n.llIllIIIl[0]] = llIllIIIl[16];
                if (!n.lIllIlllIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block48;
                int[] nArray27 = new int[llIllIIIl[1]];
                nArray27[n.llIllIIIl[0]] = llIllIIIl[16];
                if (!n.lIllIlllIIll(Equipment.contains((int[])nArray27) ? 1 : 0)) break block40;
            }
            int[] nArray = new int[llIllIIIl[1]];
            nArray[n.llIllIIIl[0]] = llIllIIIl[26];
            if (n.lIllIlllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIllIIIl[1];
                0;
                if (1 >= 1) return n2 != 0;
                return ((0x7B ^ 0x4E ^ (0x71 ^ 0xC)) & (0xCE ^ 0xC0 ^ (0x3C ^ 0x7A) ^ -1) & ((0x33 ^ 0x38 ^ (0x60 ^ 0x79)) & (19 + 1 - -73 + 97 ^ 127 + 104 - 91 + 32 ^ -1) ^ -1)) != 0;
            }
        }
        n2 = llIllIIIl[0];
        return n2 != 0;
    }

    @Override
    public boolean ae() {
        return llIllIIIl[0];
    }

    private static boolean lIllIlllIllI(Object object) {
        return object != null;
    }

    private static boolean lIllIllllIII(int n2, int n3) {
        return n2 >= n3;
    }
}

