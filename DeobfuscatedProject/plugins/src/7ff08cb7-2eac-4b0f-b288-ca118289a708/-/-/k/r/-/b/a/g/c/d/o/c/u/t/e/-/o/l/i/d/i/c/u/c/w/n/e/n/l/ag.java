/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.GrandExchange
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l;

import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.H;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.a;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ab;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.b;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.d;
import -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.e;
import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;

public class ag
implements ab {
    static /* synthetic */ WorldArea cl;
    private static /* synthetic */ String[] lllllIlll;
    static /* synthetic */ WorldPoint cn;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ WorldPoint cm;
    public static /* synthetic */ boolean ck;
    private static /* synthetic */ int[] llllllIII;
    public static /* synthetic */ List<d> bx;

    public static void al() {
        if (ag.llIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (ag.llIlIllIlIll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllIlll[llllllIII[43]];
            Movement.walkTo((WorldPoint)cm);
            "".length();
            Time.sleepTicks((int)llllllIII[1]);
            "".length();
        }
        if (ag.llIlIllIlIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllllIlll[llllllIII[44]];
            ag.am();
        }
    }

    private static boolean llIlIllIlIll(int n2) {
        return n2 == 0;
    }

    @Override
    public int af() {
        try {
            ag.ak();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if ((0x47 ^ 0x43) < 0) {
            return (0x73 ^ 0x55) & ~(0x22 ^ 4);
        }
        return llllllIII[69];
    }

    private static void llIlIllIlIII() {
        llllllIII = new int[82];
        ag.llllllIII[0] = (0x33 ^ 0x64) & ~(0x28 ^ 0x7F);
        ag.llllllIII[1] = " ".length();
        ag.llllllIII[2] = 6 ^ 0x3B;
        ag.llllllIII[3] = "  ".length();
        ag.llllllIII[4] = "   ".length();
        ag.llllllIII[5] = 0xFFFFBF89 & 0x53FE;
        ag.llllllIII[6] = 1 ^ 7;
        ag.llllllIII[7] = (0x77 ^ 0x7B) & ~(0x41 ^ 0x4D) ^ (0x68 ^ 0x6C);
        ag.llllllIII[8] = 0x21 ^ 0x16;
        ag.llllllIII[9] = -(0xFFFFF9D6 & 0x27FB) & (0xFFFFFBFF & 0x27FF);
        ag.llllllIII[10] = 0xFFFFFDDE & 0x7FD;
        ag.llllllIII[11] = 0xFFFFCE7B & 0x33AF;
        ag.llllllIII[12] = 0xFFFFC9FF & 0x3FC4;
        ag.llllllIII[13] = -(0xFFFFB43B & 0x7BC7) & (0xFFFFBF2F & 0x72FF);
        ag.llllllIII[14] = -(0xFFFF974F & 0x7DB5) & (0xFFFFB7AF & 0x5F7E);
        ag.llllllIII[15] = 0xFFFFBFB4 & 0x51DF;
        ag.llllllIII[16] = 0xFFFFF6FF & 0xB33;
        ag.llllllIII[17] = -(0xFFFFC5FD & 0x3EA3) & (0xFFFFF5F7 & 0x3FF9);
        ag.llllllIII[18] = 0xFFFFFF59 & 0x1FEF;
        ag.llllllIII[19] = 0x31 ^ 0x34;
        ag.llllllIII[20] = 0xFFFFA37F & 0x5DFB;
        ag.llllllIII[21] = 0x3A ^ 0x23;
        ag.llllllIII[22] = 0xFFFFADFB & 0x576F;
        ag.llllllIII[23] = -(0xFFFFDDC7 & 0x663C) & (0xFFFFDF6F & 0x66BF);
        ag.llllllIII[24] = 0xFFFF87F3 & 0x7A3D;
        ag.llllllIII[25] = 0x7A ^ 0x44;
        ag.llllllIII[26] = 0x37 ^ 0x4A ^ (0x27 ^ 0x45);
        ag.llllllIII[27] = 0xA9 ^ 0xAE;
        ag.llllllIII[28] = -" ".length();
        ag.llllllIII[29] = 0x81 ^ 0xA4;
        ag.llllllIII[30] = 0xF1 ^ 0x87 ^ (0x23 ^ 0x5D);
        ag.llllllIII[31] = 0x16 ^ 0x3B;
        ag.llllllIII[32] = 0x2B ^ 0x22;
        ag.llllllIII[33] = 0xDB ^ 0xC0 ^ (0x78 ^ 0x69);
        ag.llllllIII[34] = 0xD8 ^ 0x80 ^ (0x18 ^ 0x4B);
        ag.llllllIII[35] = -(0xFFFFFB93 & 0x15ED) & (0xFFFFBFDF & 0x5DFA);
        ag.llllllIII[36] = -(0xFFFFCEDB & 0x7165) & (0xFFFFDDDF & 0x6FFF);
        ag.llllllIII[37] = 0xB7 ^ 0xBB;
        ag.llllllIII[38] = 3 + 119 - 44 + 76 ^ 123 + 68 - 60 + 34;
        ag.llllllIII[39] = 0x74 ^ 0x3B ^ (0xFB ^ 0xB9);
        ag.llllllIII[40] = 0xFFFFFD6A & 0x3D5;
        ag.llllllIII[41] = 0xFFFFF6FB & 0xB16;
        ag.llllllIII[42] = 0xFFFFCFED & 0x3DBE;
        ag.llllllIII[43] = 0x2C ^ 0x5F ^ (2 ^ 0x7F);
        ag.llllllIII[44] = 0x49 ^ 0x46;
        ag.llllllIII[45] = 0xB ^ 0x1B;
        ag.llllllIII[46] = 0x62 ^ 0x73;
        ag.llllllIII[47] = 0x17 ^ 0x1C ^ (0x5C ^ 0x45);
        ag.llllllIII[48] = -(0xFFFFF9ED & 0x769B) & (0xFFFFF7FF & 0x7DED);
        ag.llllllIII[49] = 0x74 ^ 0x53 ^ (0x88 ^ 0xBC);
        ag.llllllIII[50] = -(0xFFFFDF8D & 0x70FB) & (0xFFFFD9FC & 0x779F);
        ag.llllllIII[51] = 0xFFFFB271 & 0x4FDF;
        ag.llllllIII[52] = 0xD ^ 0x17;
        ag.llllllIII[53] = 45 + 133 - 29 + 8 ^ 81 + 0 - 68 + 124;
        ag.llllllIII[54] = 34 + 35 - -48 + 49 ^ 105 + 15 - 70 + 129;
        ag.llllllIII[55] = 32 + 106 - -52 + 11;
        ag.llllllIII[56] = 0x10 ^ 6;
        ag.llllllIII[57] = 0xB ^ 0x1C;
        ag.llllllIII[58] = 0x64 ^ 0x7C;
        ag.llllllIII[59] = 0xFFFFEFF9 & 0x13EE;
        ag.llllllIII[60] = 137 + 12 - 121 + 142;
        ag.llllllIII[61] = 0xFFFF8FB2 & 0x7FED;
        ag.llllllIII[62] = -(0xFFFFAF77 & 0x58AE) & (0xFFFFCFFF & 0x3FF5);
        ag.llllllIII[63] = 0xFFFFDFBE & 0x2BF9;
        ag.llllllIII[64] = -(0xFFFFCFFB & 0x382D) & (0xFFFFBCFC & 0x7BFF);
        ag.llllllIII[65] = -(0xFFFFCBB3 & 0x777E) & (0xFFFFFFFF & 0x7FBD);
        ag.llllllIII[66] = 0xC7 ^ 0xBF;
        ag.llllllIII[67] = 131 + 9 - 22 + 16 + (0x85 ^ 0xA8) - (81 + 130 - 153 + 77) + (0x5C ^ 0x36);
        ag.llllllIII[68] = -(0xFFFFF771 & 0x4DAF) & (0xFFFFFFB9 & 0x7FFE);
        ag.llllllIII[69] = 0x23 ^ 0x47;
        ag.llllllIII[70] = 0xFFFFFFDD & 0x2EEE;
        ag.llllllIII[71] = -(0xFFFFB679 & 0x5F87) & (0xFFFFF7AD & 0x7FFA);
        ag.llllllIII[72] = -(0xFFFFEEFD & 0x3103) & (0xFFFFBFE7 & 0x7F5F);
        ag.llllllIII[73] = 0xFFFFFF8F & 0x3F4;
        ag.llllllIII[74] = 0x96 ^ 0xB6 ^ (0x7C ^ 0x47);
        ag.llllllIII[75] = 55 + 49 - 33 + 81 ^ 130 + 41 - 170 + 131;
        ag.llllllIII[76] = 0x45 ^ 0x58;
        ag.llllllIII[77] = 0xFFFFAFDF & 0x5BEE;
        ag.llllllIII[78] = 0xFFFFBEE7 & 0x4DFB;
        ag.llllllIII[79] = -(0xFFFF9FE9 & 0x743F) & (0xFFFFBFFF & 0x5FFF);
        ag.llllllIII[80] = 0xFFFF8EE9 & 0x7DFF;
        ag.llllllIII[81] = 0xD8 ^ 0xC6;
    }

    public static boolean ap() {
        if (ag.llIlIllIllll(Vars.getBit((int)llllllIII[50]), llllllIII[1]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[19])) {
            return llllllIII[1];
        }
        if (ag.llIlIllIllll(Vars.getBit((int)llllllIII[50]), llllllIII[3]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[32]) && ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[19])) {
            return llllllIII[1];
        }
        if (ag.llIlIllIllll(Vars.getBit((int)llllllIII[50]), llllllIII[4]) && ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[32]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[39])) {
            return llllllIII[1];
        }
        if (ag.llIlIllIllll(Vars.getBit((int)llllllIII[50]), llllllIII[4]) && ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[32])) {
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[14];
            if (ag.llIlIllIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llllllIII[1];
            }
        }
        if (ag.llIlIllIllll(Vars.getBit((int)llllllIII[50]), llllllIII[7]) && ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[39])) {
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[14];
            if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return llllllIII[1];
            }
        }
        return llllllIII[0];
    }

    private static boolean llIlIlllIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIllIllII(Object object) {
        return object != null;
    }

    private static boolean llIlIllIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void Q() {
        d lIlIlIllllIlI;
        Object lIlIlIllllIll;
        if (ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) {
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[16];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(llllllIII[16], llllllIII[59], llllllIII[60]);
                bx.add(d2);
                "".length();
            }
            int[] nArray2 = new int[llllllIII[1]];
            nArray2[ag.llllllIII[0]] = llllllIII[9];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIlIlIllllIll = new d(llllllIII[9], llllllIII[61], llllllIII[6]);
                bx.add((d)lIlIlIllllIll);
                "".length();
            }
            int[] nArray3 = new int[llllllIII[1]];
            nArray3[ag.llllllIII[0]] = llllllIII[11];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIlIlIllllIll = new d(llllllIII[11], llllllIII[62], llllllIII[6]);
                bx.add((d)lIlIlIllllIll);
                "".length();
            }
            int[] nArray4 = new int[llllllIII[1]];
            nArray4[ag.llllllIII[0]] = llllllIII[13];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIlIlIllllIll = new d(llllllIII[13], llllllIII[63], llllllIII[6]);
                bx.add((d)lIlIlIllllIll);
                "".length();
            }
            int[] nArray5 = new int[llllllIII[1]];
            nArray5[ag.llllllIII[0]] = llllllIII[14];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lIlIlIllllIll = new d(llllllIII[14], llllllIII[5], llllllIII[6]);
                bx.add((d)lIlIlIllllIll);
                "".length();
            }
            int[] nArray6 = new int[llllllIII[1]];
            nArray6[ag.llllllIII[0]] = llllllIII[48];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lIlIlIllllIll = new d(llllllIII[48], llllllIII[1], e.c(llllllIII[64], llllllIII[65]));
                bx.add((d)lIlIlIllllIll);
                "".length();
            }
        }
        if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) {
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[24];
            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[llllllIII[1]];
                nArray7[ag.llllllIII[0]] = llllllIII[24];
                if (ag.llIlIllIlIlI(Bank.getFirst((int[])nArray7).getQuantity(), llllllIII[63])) {
                    int[] nArray8 = new int[llllllIII[1]];
                    nArray8[ag.llllllIII[0]] = llllllIII[24];
                    lIlIlIllllIll = new d(llllllIII[24], llllllIII[63] - Bank.getFirst((int[])nArray8).getQuantity(), llllllIII[66]);
                    bx.add((d)lIlIlIllllIll);
                    "".length();
                }
            }
            int[] nArray9 = new int[llllllIII[1]];
            nArray9[ag.llllllIII[0]] = llllllIII[24];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lIlIlIllllIll = new d(llllllIII[24], llllllIII[63], llllllIII[66]);
                bx.add((d)lIlIlIllllIll);
                "".length();
            }
            int[] nArray10 = new int[llllllIII[1]];
            nArray10[ag.llllllIII[0]] = llllllIII[25];
            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[llllllIII[1]];
                nArray11[ag.llllllIII[0]] = llllllIII[25];
                if (ag.llIlIllIlIlI(Bank.getFirst((int[])nArray11).getQuantity(), llllllIII[63])) {
                    int[] nArray12 = new int[llllllIII[1]];
                    nArray12[ag.llllllIII[0]] = llllllIII[25];
                    lIlIlIllllIll = new d(llllllIII[25], llllllIII[63] - Bank.getFirst((int[])nArray12).getQuantity(), llllllIII[67]);
                    bx.add((d)lIlIlIllllIll);
                    "".length();
                }
            }
            int[] nArray13 = new int[llllllIII[1]];
            nArray13[ag.llllllIII[0]] = llllllIII[25];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lIlIlIllllIll = new d(llllllIII[25], llllllIII[63], llllllIII[67]);
                bx.add((d)lIlIlIllllIll);
                "".length();
            }
            int[] nArray14 = new int[llllllIII[1]];
            nArray14[ag.llllllIII[0]] = llllllIII[22];
            if (ag.llIlIllIlIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[llllllIII[1]];
                nArray15[ag.llllllIII[0]] = llllllIII[22];
                if (ag.llIlIllIlIll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lIlIlIllllIll = new d(llllllIII[22], llllllIII[1], llllllIII[68]);
                    bx.add((d)lIlIlIllllIll);
                    "".length();
                }
            }
            if (ag.llIlIllIlIIl(ck ? 1 : 0)) {
                int[] nArray16 = new int[llllllIII[1]];
                nArray16[ag.llllllIII[0]] = llllllIII[16];
                if (ag.llIlIllIlIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llllllIII[1]];
                    nArray17[ag.llllllIII[0]] = llllllIII[16];
                    if (ag.llIlIllIlIlI(Bank.getFirst((int[])nArray17).getQuantity(), llllllIII[63])) {
                        int[] nArray18 = new int[llllllIII[1]];
                        nArray18[ag.llllllIII[0]] = llllllIII[16];
                        lIlIlIllllIll = new d(llllllIII[16], llllllIII[63] - Bank.getFirst((int[])nArray18).getQuantity(), llllllIII[60]);
                        bx.add((d)lIlIlIllllIll);
                        "".length();
                    }
                }
                int[] nArray19 = new int[llllllIII[1]];
                nArray19[ag.llllllIII[0]] = llllllIII[16];
                if (ag.llIlIllIlIll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lIlIlIllllIll = new d(llllllIII[16], llllllIII[63], llllllIII[60]);
                    bx.add((d)lIlIlIllllIll);
                    "".length();
                }
                int[] nArray20 = new int[llllllIII[1]];
                nArray20[ag.llllllIII[0]] = llllllIII[23];
                if (ag.llIlIllIlIIl(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[llllllIII[1]];
                    nArray21[ag.llllllIII[0]] = llllllIII[23];
                    if (ag.llIlIllIlIlI(Bank.getFirst((int[])nArray21).getQuantity(), llllllIII[68])) {
                        int[] nArray22 = new int[llllllIII[1]];
                        nArray22[ag.llllllIII[0]] = llllllIII[23];
                        lIlIlIllllIll = new d(llllllIII[23], llllllIII[68] - Bank.getFirst((int[])nArray22).getQuantity(), llllllIII[6]);
                        bx.add((d)lIlIlIllllIll);
                        "".length();
                    }
                }
                int[] nArray23 = new int[llllllIII[1]];
                nArray23[ag.llllllIII[0]] = llllllIII[23];
                if (ag.llIlIllIlIll(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lIlIlIllllIll = new d(llllllIII[23], llllllIII[68], llllllIII[6]);
                    bx.add((d)lIlIlIllllIll);
                    "".length();
                }
            }
        }
        int[] nArray = new int[llllllIII[1]];
        nArray[ag.llllllIII[0]] = llllllIII[20];
        if (ag.llIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlIlIllllIll = new d(llllllIII[20], llllllIII[69], llllllIII[40]);
            bx.add((d)lIlIlIllllIll);
            "".length();
        }
        if (ag.llIlIllIlIll(Bank.contains(lIlIlIllllIll = item -> item.getName().toLowerCase().contains(lllllIlll[llllllIII[75]])) ? 1 : 0)) {
            lIlIlIllllIlI = new d(llllllIII[70], llllllIII[19], llllllIII[71]);
            bx.add(lIlIlIllllIlI);
            "".length();
        }
        int[] nArray24 = new int[llllllIII[1]];
        nArray24[ag.llllllIII[0]] = llllllIII[72];
        if (ag.llIlIllIlIll(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lIlIlIllllIlI = new d(llllllIII[72], llllllIII[33], llllllIII[73]);
            bx.add(lIlIlIllllIlI);
            "".length();
        }
        int[] nArray25 = new int[llllllIII[1]];
        nArray25[ag.llllllIII[0]] = llllllIII[18];
        if (ag.llIlIllIlIll(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lIlIlIllllIlI = new d(llllllIII[18], llllllIII[33], llllllIII[73]);
            bx.add(lIlIlIllllIlI);
            "".length();
        }
    }

    @Override
    public boolean ae() {
        return llllllIII[0];
    }

    private static boolean llIlIllIllIl(int n2) {
        return n2 > 0;
    }

    private static void llIlIllIIlll() {
        lllllIlll = new String[llllllIII[81]];
        ag.lllllIlll[ag.llllllIII[0]] = ag.llIlIlIlIlIl("RAwgEnzswAetdwinaiCqXw==", "woElw");
        ag.lllllIlll[ag.llllllIII[1]] = ag.llIlIlIlIllI("6liUZvpyibU7EOwlIuW8XtDuAfVpCeauphF+pf/nk8oGNW3CQPzuk9bXIhdHfZLekjk/r5wlbjw=", "ctpCj");
        ag.lllllIlll[ag.llllllIII[3]] = ag.llIlIlIlIllI("ppi3z8VvkwNoOTtbWOmFmFYU+rCE71fD", "MyXST");
        ag.lllllIlll[ag.llllllIII[4]] = ag.llIlIlIlIllI("4+G216NDtigftiXV8jjO/R0dup3ykL1r", "NVafk");
        ag.lllllIlll[ag.llllllIII[7]] = ag.llIlIlIlIlIl("8NfXV2GnqIB6g/xsC/8QqUeeepgCCcvvJO870jisJ7L/jlIB7oo/b46Ns2vWjxkg", "eAKLG");
        ag.lllllIlll[ag.llllllIII[19]] = ag.llIlIlIlIllI("QinfqwetnNtpXt8HN+vUcA==", "dtZXM");
        ag.lllllIlll[ag.llllllIII[6]] = ag.llIlIlIlIlIl("rDgVXpiMyIfEL2b+FfQq+w==", "DGvXR");
        ag.lllllIlll[ag.llllllIII[27]] = ag.llIlIlIlIlIl("rpWYH4WByxYiIecBA0TpiyfKifXx8C2S", "dcVjP");
        ag.lllllIlll[ag.llllllIII[30]] = ag.llIlIlIlIlll("Gww9Eio2Cm4KNjUPN0Y3PQEr", "XmNfC");
        ag.lllllIlll[ag.llllllIII[32]] = ag.llIlIlIlIlll("BRcHACgoEVQSICoaDVQ1IxoR", "FvttA");
        ag.lllllIlll[ag.llllllIII[33]] = ag.llIlIlIlIlll("ABEyNw0tF2EgBS4dOGMQJhwk", "CpACd");
        ag.lllllIlll[ag.llllllIII[34]] = ag.llIlIlIlIlll("Gy0pAgI0Jg==", "ZAJjk");
        ag.lllllIlll[ag.llllllIII[37]] = ag.llIlIlIlIllI("QMRYyquzP2g=", "PgbSK");
        ag.lllllIlll[ag.llllllIII[39]] = ag.llIlIlIlIlIl("mL2k/q5k6lKWDtTgjCpHD1BGJFGqfTMk", "uyRGt");
        ag.lllllIlll[ag.llllllIII[43]] = ag.llIlIlIlIllI("yIwqdtmaUmVAh9B3O6xhDA==", "AOGbI");
        ag.lllllIlll[ag.llllllIII[44]] = ag.llIlIlIlIllI("EOgxbnsELvU1D9pS4C8FqQ==", "JhTWD");
        ag.lllllIlll[ag.llllllIII[45]] = ag.llIlIlIlIllI("k9mSGR6iKWQ=", "cVzRn");
        ag.lllllIlll[ag.llllllIII[46]] = ag.llIlIlIlIlIl("1yovjkIlZXg=", "AoeJR");
        ag.lllllIlll[ag.llllllIII[47]] = ag.llIlIlIlIlll("AA4D", "catsU");
        ag.lllllIlll[ag.llllllIII[49]] = ag.llIlIlIlIlll("ETo3FjQ7", "PNCwW");
        ag.lllllIlll[ag.llllllIII[53]] = ag.llIlIlIlIlll("DAEkITEtFmEuLTceIi4rNw==", "CqAOX");
        ag.lllllIlll[ag.llllllIII[54]] = ag.llIlIlIlIlIl("/o82a2jpvKLE6tLzWkT8mA==", "qoEnP");
        ag.lllllIlll[ag.llllllIII[56]] = ag.llIlIlIlIlIl("bppbjh3txRxxbXRxJeDxtA==", "GSEaP");
        ag.lllllIlll[ag.llllllIII[57]] = ag.llIlIlIlIlIl("2Kl+S+gZcxFL65YVk+AEvw==", "DORxO");
        ag.lllllIlll[ag.llllllIII[58]] = ag.llIlIlIlIlIl("6pY+MLb98hd2kC5v5tYcWA==", "VUQHl");
        ag.lllllIlll[ag.llllllIII[21]] = ag.llIlIlIlIlll("Hyk2OSF6GzA/IDEt", "ZHDMI");
        ag.lllllIlll[ag.llllllIII[52]] = ag.llIlIlIlIllI("PwdaOe02l2waewRATWDxoA==", "GTShu");
        ag.lllllIlll[ag.llllllIII[74]] = ag.llIlIlIlIllI("0rOcaqNxRENPZoyjZv7sgg==", "usoBI");
        ag.lllllIlll[ag.llllllIII[75]] = ag.llIlIlIlIlIl("LjSaKa39zBDUV8u4SXkYWPo3tScWxpcs", "Nxtwf");
        ag.lllllIlll[ag.llllllIII[76]] = ag.llIlIlIlIlll("Oy46", "xAMXa");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block29: {
            block28: {
                block25: {
                    int n3;
                    block27: {
                        block26: {
                            block22: {
                                int n4;
                                block23: {
                                    block24: {
                                        block19: {
                                            int n5;
                                            block20: {
                                                block21: {
                                                    if (!ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21])) break block19;
                                                    int[] nArray = new int[llllllIII[1]];
                                                    nArray[ag.llllllIII[0]] = llllllIII[9];
                                                    if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llllllIII[1]];
                                                    nArray2[ag.llllllIII[0]] = llllllIII[13];
                                                    if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llllllIII[1]];
                                                    nArray3[ag.llllllIII[0]] = llllllIII[11];
                                                    if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llllllIII[1]];
                                                    nArray4[ag.llllllIII[0]] = llllllIII[14];
                                                    if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llllllIII[1]];
                                                    nArray5[ag.llllllIII[0]] = llllllIII[20];
                                                    if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llllllIII[1]];
                                                    nArray6[ag.llllllIII[0]] = llllllIII[48];
                                                    if (!ag.llIlIllIlIll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llllllIII[1]];
                                                    nArray7[ag.llllllIII[0]] = llllllIII[48];
                                                    if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llllllIII[1];
                                                "".length();
                                                if ((0x35 ^ 0x31) != 0) return n5 != 0;
                                                return ((0x15 ^ 3) & ~(0x7E ^ 0x68)) != 0;
                                            }
                                            n5 = llllllIII[0];
                                            return n5 != 0;
                                        }
                                        if (!ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21]) || !ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) break block22;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[13];
                                        if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llllllIII[1]];
                                        nArray8[ag.llllllIII[0]] = llllllIII[11];
                                        if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llllllIII[1]];
                                        nArray9[ag.llllllIII[0]] = llllllIII[14];
                                        if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llllllIII[1]];
                                        nArray10[ag.llllllIII[0]] = llllllIII[16];
                                        if (!ag.llIlIllIlIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llllllIII[1]];
                                        nArray11[ag.llllllIII[0]] = llllllIII[48];
                                        if (!ag.llIlIllIlIll(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llllllIII[1]];
                                        nArray12[ag.llllllIII[0]] = llllllIII[48];
                                        if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llllllIII[1];
                                    "".length();
                                    if (-" ".length() >= -" ".length()) return n4 != 0;
                                    return ((0x21 ^ 0x74 ^ (0xD1 ^ 0xB5)) & (11 + 14 - -109 + 40 ^ 11 + 57 - -20 + 71 ^ -" ".length())) != 0;
                                }
                                n4 = llllllIII[0];
                                return n4 != 0;
                            }
                            if (!ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8]) || !ag.llIlIllIlIll(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[llllllIII[1]];
                            nArray[ag.llllllIII[0]] = llllllIII[22];
                            if (!ag.llIlIllIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llllllIII[1]];
                            nArray13[ag.llllllIII[0]] = llllllIII[22];
                            if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llllllIII[1]];
                        nArray[ag.llllllIII[0]] = llllllIII[24];
                        if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llllllIII[1]];
                            nArray14[ag.llllllIII[0]] = llllllIII[38];
                            if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llllllIII[1];
                                "".length();
                                if (-" ".length() < "   ".length()) return n3 != 0;
                                return ((0x51 ^ 0x1A) & ~(0xF4 ^ 0xBF)) != 0;
                            }
                        }
                    }
                    n3 = llllllIII[0];
                    return n3 != 0;
                }
                if (!ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8]) || !ag.llIlIllIlIIl(ck ? 1 : 0)) return llllllIII[0];
                int[] nArray = new int[llllllIII[1]];
                nArray[ag.llllllIII[0]] = llllllIII[22];
                if (!ag.llIlIllIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llllllIII[1]];
                nArray15[ag.llllllIII[0]] = llllllIII[22];
                if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[16];
            if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llllllIII[1]];
                nArray16[ag.llllllIII[0]] = llllllIII[23];
                if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llllllIII[1]];
                    nArray17[ag.llllllIII[0]] = llllllIII[23];
                    if (ag.llIlIllIlllI(Inventory.getFirst((int[])nArray17).getQuantity(), llllllIII[19])) {
                        int[] nArray18 = new int[llllllIII[1]];
                        nArray18[ag.llllllIII[0]] = llllllIII[24];
                        if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llllllIII[1]];
                            nArray19[ag.llllllIII[0]] = llllllIII[38];
                            if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llllllIII[1];
                                "".length();
                                if (" ".length() <= " ".length()) return n2 != 0;
                                return ((0x33 ^ 0x3B ^ (0x87 ^ 0x82)) & (147 + 149 - 242 + 117 ^ 78 + 78 - 96 + 106 ^ -" ".length())) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = llllllIII[0];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ao() {
        int n2;
        block29: {
            block28: {
                block25: {
                    int n3;
                    block27: {
                        block26: {
                            block22: {
                                int n4;
                                block23: {
                                    block24: {
                                        block19: {
                                            int n5;
                                            block20: {
                                                block21: {
                                                    if (!ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21])) break block19;
                                                    int[] nArray = new int[llllllIII[1]];
                                                    nArray[ag.llllllIII[0]] = llllllIII[9];
                                                    if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[llllllIII[1]];
                                                    nArray2[ag.llllllIII[0]] = llllllIII[13];
                                                    if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[llllllIII[1]];
                                                    nArray3[ag.llllllIII[0]] = llllllIII[11];
                                                    if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[llllllIII[1]];
                                                    nArray4[ag.llllllIII[0]] = llllllIII[14];
                                                    if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[llllllIII[1]];
                                                    nArray5[ag.llllllIII[0]] = llllllIII[20];
                                                    if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[llllllIII[1]];
                                                    nArray6[ag.llllllIII[0]] = llllllIII[48];
                                                    if (!ag.llIlIllIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[llllllIII[1]];
                                                    nArray7[ag.llllllIII[0]] = llllllIII[48];
                                                    if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = llllllIII[1];
                                                "".length();
                                                if (-(0x77 ^ 0x73) <= 0) return n5 != 0;
                                                return ((0xDB ^ 0x9F) & ~(0x87 ^ 0xC3)) != 0;
                                            }
                                            n5 = llllllIII[0];
                                            return n5 != 0;
                                        }
                                        if (!ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21]) || !ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) break block22;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[13];
                                        if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[llllllIII[1]];
                                        nArray8[ag.llllllIII[0]] = llllllIII[11];
                                        if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[llllllIII[1]];
                                        nArray9[ag.llllllIII[0]] = llllllIII[14];
                                        if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[llllllIII[1]];
                                        nArray10[ag.llllllIII[0]] = llllllIII[16];
                                        if (!ag.llIlIllIlIIl(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[llllllIII[1]];
                                        nArray11[ag.llllllIII[0]] = llllllIII[48];
                                        if (!ag.llIlIllIlIll(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[llllllIII[1]];
                                        nArray12[ag.llllllIII[0]] = llllllIII[48];
                                        if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = llllllIII[1];
                                    "".length();
                                    if ("  ".length() != (0x23 ^ 0x2D ^ (0xB6 ^ 0xBC))) return n4 != 0;
                                    return ((178 + 75 - 127 + 99 ^ 5 + 1 - -90 + 72) & (0x57 ^ 0x61 ^ 46 + 83 - 114 + 112 ^ -" ".length())) != 0;
                                }
                                n4 = llllllIII[0];
                                return n4 != 0;
                            }
                            if (!ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8]) || !ag.llIlIllIlIll(ck ? 1 : 0)) break block25;
                            int[] nArray = new int[llllllIII[1]];
                            nArray[ag.llllllIII[0]] = llllllIII[22];
                            if (!ag.llIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[llllllIII[1]];
                            nArray13[ag.llllllIII[0]] = llllllIII[22];
                            if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[llllllIII[1]];
                        nArray[ag.llllllIII[0]] = llllllIII[24];
                        if (ag.llIlIllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[llllllIII[1]];
                            nArray14[ag.llllllIII[0]] = llllllIII[25];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = llllllIII[1];
                                "".length();
                                if ("   ".length() == "   ".length()) return n3 != 0;
                                return ((0xBB ^ 0x94) & ~(0x76 ^ 0x59)) != 0;
                            }
                        }
                    }
                    n3 = llllllIII[0];
                    return n3 != 0;
                }
                if (!ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8]) || !ag.llIlIllIlIIl(ck ? 1 : 0)) return llllllIII[0];
                int[] nArray = new int[llllllIII[1]];
                nArray[ag.llllllIII[0]] = llllllIII[22];
                if (!ag.llIlIllIlIll(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[llllllIII[1]];
                nArray15[ag.llllllIII[0]] = llllllIII[22];
                if (!ag.llIlIllIlIIl(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[16];
            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[llllllIII[1]];
                nArray16[ag.llllllIII[0]] = llllllIII[23];
                if (ag.llIlIllIlIIl(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[llllllIII[1]];
                    nArray17[ag.llllllIII[0]] = llllllIII[23];
                    if (ag.llIlIllIlllI(Bank.getFirst((int[])nArray17).getQuantity(), llllllIII[19])) {
                        int[] nArray18 = new int[llllllIII[1]];
                        nArray18[ag.llllllIII[0]] = llllllIII[24];
                        if (ag.llIlIllIlIIl(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[llllllIII[1]];
                            nArray19[ag.llllllIII[0]] = llllllIII[25];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = llllllIII[1];
                                "".length();
                                if (((0x1B ^ 0x4C) & ~(0x50 ^ 7)) == 0) return n2 != 0;
                                return ((0x2E ^ 4) & ~(0x9F ^ 0xB5)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = llllllIII[0];
        return n2 != 0;
    }

    static {
        ag.llIlIllIlIII();
        ag.llIlIllIIlll();
        ck = llllllIII[0];
        bx = new ArrayList<d>();
        cl = new WorldArea(llllllIII[77], llllllIII[78], llllllIII[53], llllllIII[43], llllllIII[0]);
        cm = new WorldPoint(llllllIII[79], llllllIII[80], llllllIII[0]);
        cn = null;
    }

    private static void am() {
        if (ag.llIlIlllIIlI(ag.llIlIlllIIIl(e.w(), 30.0))) {
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[20];
            if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llllllIII[1]];
                nArray2[ag.llllllIII[0]] = llllllIII[20];
                Inventory.getFirst((int[])nArray2).interact(lllllIlll[llllllIII[45]]);
                Time.sleepTicks((int)llllllIII[1]);
                "".length();
            }
        }
        if (ag.llIlIlllIIII(Players.getLocal().getInteracting())) {
            NPC lIlIlIlllllll = NPCs.getNearest(nPC -> {
                int n2;
                if (ag.llIlIllIlIIl(nPC.getName().contains(lllllIlll[llllllIII[76]]) ? 1 : 0) && ag.llIlIllIlIll(nPC.isDead() ? 1 : 0)) {
                    n2 = llllllIII[1];
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return ((0x60 ^ 0x52) & ~(0x19 ^ 0x2B)) != 0;
                    }
                } else {
                    n2 = llllllIII[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[llllllIII[3]];
            stringArray[ag.llllllIII[0]] = lllllIlll[llllllIII[46]];
            stringArray[ag.llllllIII[1]] = lllllIlll[llllllIII[47]];
            List lIlIlIllllllI = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (ag.llIlIlllIIll(nPC.getInteracting(), Players.getLocal())) {
                    bl = llllllIII[1];
                    "".length();
                    if (" ".length() >= (0xA ^ 0xE)) {
                        return ((0x88 ^ 0xB0) & ~(0x4F ^ 0x77)) != 0;
                    }
                } else {
                    bl = llllllIII[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[llllllIII[1]];
            nArray[ag.llllllIII[0]] = llllllIII[48];
            if (ag.llIlIllIlIIl(Equipment.contains((int[])nArray) ? 1 : 0) && ag.llIlIllIlIll(ag.ap() ? 1 : 0)) {
                ag.aq();
            }
            if (ag.llIlIllIllII(lIlIlIlllllll) && ag.llIlIllIlIll(Players.getLocal().isMoving() ? 1 : 0)) {
                lIlIlIlllllll.interact(lllllIlll[llllllIII[49]]);
                Time.sleepTicks((int)llllllIII[4]);
                "".length();
            }
        }
    }

    private static boolean llIlIllIllll(int n2, int n3) {
        return n2 == n3;
    }

    private static String llIlIlIlIlll(String lIlIlIlIllIII, String lIlIlIlIlIIlI) {
        lIlIlIlIllIII = new String(Base64.getDecoder().decode(lIlIlIlIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIlIlIlIllI = new StringBuilder();
        char[] lIlIlIlIlIlIl = lIlIlIlIlIIlI.toCharArray();
        int lIlIlIlIlIlII = llllllIII[0];
        char[] lIlIlIlIIlllI = lIlIlIlIllIII.toCharArray();
        int lIlIlIlIIllIl = lIlIlIlIIlllI.length;
        int lIlIlIlIIllII = llllllIII[0];
        while (ag.llIlIllIlIlI(lIlIlIlIIllII, lIlIlIlIIllIl)) {
            char lIlIlIlIllIIl = lIlIlIlIIlllI[lIlIlIlIIllII];
            lIlIlIlIlIllI.append((char)(lIlIlIlIllIIl ^ lIlIlIlIlIlIl[lIlIlIlIlIlII % lIlIlIlIlIlIl.length]));
            "".length();
            ++lIlIlIlIlIlII;
            ++lIlIlIlIIllII;
            "".length();
            if (" ".length() >= ((0x50 ^ 0x6E) & ~(0x8A ^ 0xB4))) continue;
            return null;
        }
        return String.valueOf(lIlIlIlIlIllI);
    }

    private static boolean llIlIlllIIlI(int n2) {
        return n2 < 0;
    }

    private static String llIlIlIlIllI(String lIlIlIlIIIIIl, String lIlIlIlIIIIlI) {
        try {
            SecretKeySpec lIlIlIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIlIlIIIIlI.getBytes(StandardCharsets.UTF_8)), llllllIII[30]), "DES");
            Cipher lIlIlIlIIIlIl = Cipher.getInstance("DES");
            lIlIlIlIIIlIl.init(llllllIII[3], lIlIlIlIIIllI);
            return new String(lIlIlIlIIIlIl.doFinal(Base64.getDecoder().decode(lIlIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIlIIIlII) {
            lIlIlIlIIIlII.printStackTrace();
            return null;
        }
    }

    private static int llIlIlllIIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static String llIlIlIlIlIl(String lIlIlIllIlIII, String lIlIlIllIIlll) {
        try {
            SecretKeySpec lIlIlIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIllIlIlI = Cipher.getInstance("Blowfish");
            lIlIlIllIlIlI.init(llllllIII[3], lIlIlIllIlIll);
            return new String(lIlIlIllIlIlI.doFinal(Base64.getDecoder().decode(lIlIlIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIllIlIIl) {
            lIlIlIllIlIIl.printStackTrace();
            return null;
        }
    }

    @Override
    public String ag() {
        return lllllIlll[llllllIII[74]];
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[2])) {
            bl = llllllIII[1];
            "".length();
            if ((0x89 ^ 0xC5 ^ (0x49 ^ 0)) == 0) {
                return ((125 + 75 - 118 + 82 ^ 112 + 71 - 41 + 3) & (0xC6 ^ 0xB8 ^ (0x26 ^ 0x6D) ^ -" ".length())) != 0;
            }
        } else {
            bl = llllllIII[0];
        }
        return bl;
    }

    private static boolean llIlIlllIIII(Object object) {
        return object == null;
    }

    public static void aq() {
        if (ag.llIlIllIllII(Widgets.get((int)llllllIII[51], (int)llllllIII[52]))) {
            AccBuilderGWD.c = lllllIlll[llllllIII[53]];
            Widgets.get((int)llllllIII[51], (int)llllllIII[52]).interact(lllllIlll[llllllIII[54]]);
            Time.sleepTicks((int)llllllIII[7]);
            "".length();
        }
        if (ag.llIlIlllIIII(Widgets.get((int)llllllIII[51], (int)llllllIII[52])) && ag.llIlIllIlIll(Widgets.get((int)llllllIII[55]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)llllllIII[1]);
            "".length();
            if (ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[19])) {
                Widgets.get((int)llllllIII[55], (int)llllllIII[1]).getChild(llllllIII[1]).interact(lllllIlll[llllllIII[56]]);
            }
            if (ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[32]) && ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[19])) {
                Widgets.get((int)llllllIII[55], (int)llllllIII[1]).getChild(llllllIII[3]).interact(lllllIlll[llllllIII[57]]);
            }
            if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[32]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[39])) {
                Widgets.get((int)llllllIII[55], (int)llllllIII[1]).getChild(llllllIII[4]).interact(lllllIlll[llllllIII[58]]);
            }
            if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[32])) {
                int[] nArray = new int[llllllIII[1]];
                nArray[ag.llllllIII[0]] = llllllIII[14];
                if (ag.llIlIllIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llllllIII[55], (int)llllllIII[1]).getChild(llllllIII[4]).interact(lllllIlll[llllllIII[21]]);
                }
            }
            if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[39])) {
                int[] nArray = new int[llllllIII[1]];
                nArray[ag.llllllIII[0]] = llllllIII[14];
                if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)llllllIII[55], (int)llllllIII[1]).getChild(llllllIII[7]).interact(lllllIlll[llllllIII[52]]);
                }
            }
            Time.sleepTicks((int)llllllIII[1]);
            "".length();
        }
    }

    private static boolean llIlIllIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIlllIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIllIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    public static void ak() {
        if (ag.llIlIllIlIIl(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllllIlll[llllllIII[0]];
            b.a(bx);
            if (ag.llIlIllIlIlI(bx.size(), llllllIII[1])) {
                System.out.println(lllllIlll[llllllIII[1]]);
                bv = llllllIII[0];
            }
        }
        if (ag.llIlIllIlIll(bv ? 1 : 0) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[2])) {
            BankLocation lIlIllIIIIlII;
            if (ag.llIlIllIlIll(ag.an() ? 1 : 0)) {
                lIlIllIIIIlII = BankLocation.getNearest();
                if (ag.llIlIllIllII(lIlIllIIIIlII) && ag.llIlIllIlIll(lIlIllIIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[3]];
                    a.a(lIlIllIIIIlII);
                }
                if (ag.llIlIllIllII(lIlIllIIIIlII) && ag.llIlIllIlIIl(lIlIllIIIIlII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[4]];
                    if (ag.llIlIllIlIll(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)llllllIII[5]);
                        "".length();
                        Time.sleepTicks((int)llllllIII[6]);
                        "".length();
                    }
                    if (ag.llIlIllIlIIl(Bank.isOpen() ? 1 : 0)) {
                        if (ag.llIlIllIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)llllllIII[7]);
                            "".length();
                        }
                        while (ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8]) && ag.llIlIllIlIll(H.bT() ? 1 : 0)) {
                            H.bR();
                            Time.sleepTicks((int)llllllIII[1]);
                            "".length();
                            "".length();
                            if ("  ".length() != 0) continue;
                            return;
                        }
                        if (ag.llIlIllIlIll(ag.ao() ? 1 : 0)) {
                            ag.Q();
                            System.out.println(lllllIlll[llllllIII[7]]);
                            bv = llllllIII[1];
                            return;
                        }
                        if (ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) {
                            int[] nArray = new int[llllllIII[1]];
                            nArray[ag.llllllIII[0]] = llllllIII[9];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[llllllIII[1]];
                                nArray2[ag.llllllIII[0]] = llllllIII[9];
                                if (ag.llIlIllIlIlI(Inventory.getCount((int[])nArray2), llllllIII[1])) {
                                    Bank.withdraw((int)llllllIII[9], (int)llllllIII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[9];
                                        if (ag.llIlIllIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllllIII[1];
                                            "".length();
                                            if (((106 + 55 - 60 + 52 ^ 102 + 36 - 83 + 77) & (0xBE ^ 0xAE ^ (0x27 ^ 0x2A) ^ -" ".length())) != 0) {
                                                return ((124 + 35 - 17 + 31 ^ 49 + 42 - 86 + 140) & (107 + 130 - 155 + 68 ^ 6 + 106 - 44 + 102 ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = llllllIII[0];
                                        }
                                        return bl;
                                    }, (int)llllllIII[5]);
                                    "".length();
                                }
                            }
                            int[] nArray3 = new int[llllllIII[1]];
                            nArray3[ag.llllllIII[0]] = llllllIII[11];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[llllllIII[1]];
                                nArray4[ag.llllllIII[0]] = llllllIII[11];
                                if (ag.llIlIllIlIlI(Inventory.getCount((int[])nArray4), llllllIII[1])) {
                                    Bank.withdraw((int)llllllIII[11], (int)llllllIII[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[11];
                                        if (ag.llIlIllIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllllIII[1];
                                            "".length();
                                            if ("  ".length() <= -" ".length()) {
                                                return ((0x26 ^ 0x51 ^ (0xDA ^ 0x8E)) & (0xEF ^ 0xC1 ^ (0x17 ^ 0x1A) ^ -" ".length())) != 0;
                                            }
                                        } else {
                                            bl = llllllIII[0];
                                        }
                                        return bl;
                                    }, (int)llllllIII[5]);
                                    "".length();
                                }
                            }
                            int[] nArray5 = new int[llllllIII[1]];
                            nArray5[ag.llllllIII[0]] = llllllIII[13];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[llllllIII[1]];
                                nArray6[ag.llllllIII[0]] = llllllIII[13];
                                if (ag.llIlIllIlIlI(Inventory.getCount((int[])nArray6), llllllIII[1])) {
                                    Bank.withdraw((int)llllllIII[13], (int)llllllIII[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[13];
                                        if (ag.llIlIllIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllllIII[1];
                                            "".length();
                                            if (null != null) {
                                                return ((0xA3 ^ 0xB3) & ~(0x17 ^ 7)) != 0;
                                            }
                                        } else {
                                            bl = llllllIII[0];
                                        }
                                        return bl;
                                    }, (int)llllllIII[5]);
                                    "".length();
                                }
                            }
                            int[] nArray7 = new int[llllllIII[1]];
                            nArray7[ag.llllllIII[0]] = llllllIII[14];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[llllllIII[1]];
                                nArray8[ag.llllllIII[0]] = llllllIII[14];
                                if (ag.llIlIllIlIlI(Inventory.getCount((int[])nArray8), llllllIII[1])) {
                                    Bank.withdraw((int)llllllIII[14], (int)llllllIII[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[14];
                                        if (ag.llIlIllIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllllIII[1];
                                            "".length();
                                            if ((0x7B ^ 0x7F) <= "   ".length()) {
                                                return ((0x5C ^ 0x15) & ~(0x36 ^ 0x7F)) != 0;
                                            }
                                        } else {
                                            bl = llllllIII[0];
                                        }
                                        return bl;
                                    }, (int)llllllIII[5]);
                                    "".length();
                                }
                            }
                            int[] nArray9 = new int[llllllIII[1]];
                            nArray9[ag.llllllIII[0]] = llllllIII[16];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[llllllIII[1]];
                                nArray10[ag.llllllIII[0]] = llllllIII[16];
                                if (ag.llIlIllIlIlI(Inventory.getCount((int[])nArray10), llllllIII[1])) {
                                    Bank.withdraw((int)llllllIII[16], (int)llllllIII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[16];
                                        if (ag.llIlIllIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllllIII[1];
                                            "".length();
                                            if (-" ".length() == (0x7A ^ 0x7E)) {
                                                return ((0x10 ^ 0x4E) & ~(0x11 ^ 0x4F)) != 0;
                                            }
                                        } else {
                                            bl = llllllIII[0];
                                        }
                                        return bl;
                                    }, (int)llllllIII[5]);
                                    "".length();
                                }
                            }
                            int[] nArray11 = new int[llllllIII[1]];
                            nArray11[ag.llllllIII[0]] = llllllIII[17];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[llllllIII[1]];
                                nArray12[ag.llllllIII[0]] = llllllIII[17];
                                if (ag.llIlIllIlIll(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)llllllIII[17], (int)llllllIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[17];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)llllllIII[5]);
                                    "".length();
                                }
                            }
                            Bank.withdraw((int)llllllIII[18], (int)llllllIII[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[llllllIII[1]];
                            nArray13[ag.llllllIII[0]] = llllllIII[20];
                            if (ag.llIlIllIlIIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[llllllIII[1]];
                                nArray14[ag.llllllIII[0]] = llllllIII[20];
                                if (ag.llIlIllIlIlI(Inventory.getCount((int[])nArray14), llllllIII[1]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21])) {
                                    Bank.withdrawAll((int)llllllIII[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)llllllIII[1]);
                                    "".length();
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[llllllIII[1]];
                                        nArray[ag.llllllIII[0]] = llllllIII[20];
                                        if (ag.llIlIllIllIl(Inventory.getCount((int[])nArray))) {
                                            bl = llllllIII[1];
                                            "".length();
                                            if ("  ".length() <= -" ".length()) {
                                                return ((0xE2 ^ 0xC6) & ~(0x87 ^ 0xA3)) != 0;
                                            }
                                        } else {
                                            bl = llllllIII[0];
                                        }
                                        return bl;
                                    }, (int)llllllIII[5]);
                                    "".length();
                                }
                            }
                        }
                        if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) {
                            int[] nArray = new int[llllllIII[1]];
                            nArray[ag.llllllIII[0]] = llllllIII[22];
                            if (ag.llIlIllIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)llllllIII[22], (int)llllllIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llllllIII[1]);
                                "".length();
                            }
                            if (ag.llIlIllIlIIl(ck ? 1 : 0)) {
                                Bank.withdrawAll((int)llllllIII[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llllllIII[1]);
                                "".length();
                                Bank.withdrawAll((int)llllllIII[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)llllllIII[1]);
                                "".length();
                            }
                            Time.sleepTicks((int)llllllIII[4]);
                            "".length();
                            Bank.withdrawAll((int)llllllIII[24], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)llllllIII[1]);
                            "".length();
                            Bank.withdrawAll((int)llllllIII[25], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)llllllIII[1]);
                            "".length();
                        }
                    }
                }
            }
            if (ag.llIlIllIlIIl(ag.an() ? 1 : 0)) {
                if (ag.llIlIllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21])) {
                    if (ag.llIlIllIlIll(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllllIlll[llllllIII[19]];
                        Movement.walkTo((WorldPoint)cm);
                        "".length();
                        Time.sleepTicks((int)llllllIII[1]);
                        "".length();
                    }
                    if (ag.llIlIllIlIIl(cl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderGWD.c = lllllIlll[llllllIII[6]];
                        ag.am();
                    }
                }
                if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[21]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[26])) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[27]];
                    if (ag.llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)llllllIII[1]);
                        "".length();
                    }
                }
                if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[26]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[29])) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[30]];
                    if (ag.llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)llllllIII[1]);
                        "".length();
                    }
                }
                if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[29]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[31])) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[32]];
                    if (ag.llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)llllllIII[1]);
                        "".length();
                    }
                }
                if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[31]) && ag.llIlIllIlIlI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) {
                    AccBuilderGWD.c = lllllIlll[llllllIII[33]];
                    if (ag.llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)llllllIII[1]);
                        "".length();
                    }
                }
                if (ag.llIlIllIlllI(Skills.getLevel((Skill)Skill.MAGIC), llllllIII[8])) {
                    int lIlIllIIIIIlI;
                    AccBuilderGWD.c = lllllIlll[llllllIII[34]];
                    if (ag.llIlIlllIIII(cn)) {
                        cn = new WorldPoint(llllllIII[35] + e.c(llllllIII[1], llllllIII[7]), llllllIII[36], llllllIII[0]);
                    }
                    int[] nArray = new int[llllllIII[1]];
                    nArray[ag.llllllIII[0]] = llllllIII[22];
                    if (ag.llIlIllIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[llllllIII[1]];
                        nArray15[ag.llllllIII[0]] = llllllIII[22];
                        if (ag.llIlIllIlIll(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[llllllIII[1]];
                            nArray16[ag.llllllIII[0]] = llllllIII[22];
                            Inventory.getFirst((int[])nArray16).interact(lllllIlll[llllllIII[37]]);
                            Time.sleepTicks((int)llllllIII[1]);
                            "".length();
                        }
                    }
                    if (ag.llIlIllIlIIl(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[llllllIII[1]];
                    nArray17[ag.llllllIII[0]] = llllllIII[24];
                    lIlIllIIIIlII = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[llllllIII[1]];
                    nArray18[ag.llllllIII[0]] = llllllIII[38];
                    Item lIlIllIIIIIll = Inventory.getFirst((int[])nArray18);
                    if (ag.llIlIllIlIll(ck ? 1 : 0) && ag.llIlIllIllII(cn)) {
                        if (ag.llIlIllIlIll(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0)) {
                            AccBuilderGWD.c = lllllIlll[llllllIII[39]];
                            Movement.walkTo((WorldPoint)cn);
                            "".length();
                            Time.sleepTicks((int)llllllIII[1]);
                            "".length();
                        }
                        if (ag.llIlIllIlIIl(Players.getLocal().getWorldLocation().equals((Object)cn) ? 1 : 0) && ag.llIlIllIllII(lIlIllIIIIlII) && ag.llIlIllIllII(lIlIllIIIIIll)) {
                            lIlIllIIIIIlI = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIlIllIIIIIll);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ag.llIlIlllIlII(Skills.getExperience((Skill)Skill.MAGIC), lIlIllIIIIIlI)) {
                                    bl = llllllIII[1];
                                    "".length();
                                    if ("  ".length() != "  ".length()) {
                                        return ((0x11 ^ 0x45 ^ (0xD7 ^ 0x99)) & (158 + 107 - 84 + 36 ^ 186 + 80 - 162 + 91 ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llllllIII[0];
                                }
                                return bl;
                            }, (int)llllllIII[10]);
                            "".length();
                            Time.sleep((long)e.c(llllllIII[40], llllllIII[41]));
                            "".length();
                        }
                    }
                    if (ag.llIlIllIlIIl(ck ? 1 : 0)) {
                        if (ag.llIlIllIllII(lIlIllIIIIlII) && ag.llIlIllIllII(lIlIllIIIIIll) && ag.llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                            lIlIllIIIIIlI = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIlIllIIIIIll);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (ag.llIlIlllIlII(Skills.getExperience((Skill)Skill.MAGIC), lIlIllIIIIIlI)) {
                                    bl = llllllIII[1];
                                    "".length();
                                    if (-" ".length() != -" ".length()) {
                                        return ((0x69 ^ 0x43 ^ (0x7E ^ 0x6F)) & (0xA ^ 0x37 ^ (0x8D ^ 0x8B) ^ -" ".length())) != 0;
                                    }
                                } else {
                                    bl = llllllIII[0];
                                }
                                return bl;
                            }, (int)llllllIII[10]);
                            "".length();
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (ag.llIlIllIllll(Players.getLocal().getAnimation(), llllllIII[28])) {
                                bl = llllllIII[1];
                                "".length();
                                if (" ".length() < -" ".length()) {
                                    return ((0x2C ^ 0xF) & ~(0x31 ^ 0x12)) != 0;
                                }
                            } else {
                                bl = llllllIII[0];
                            }
                            return bl;
                        }, (int)llllllIII[42]);
                        "".length();
                    }
                }
            }
        }
    }
}

