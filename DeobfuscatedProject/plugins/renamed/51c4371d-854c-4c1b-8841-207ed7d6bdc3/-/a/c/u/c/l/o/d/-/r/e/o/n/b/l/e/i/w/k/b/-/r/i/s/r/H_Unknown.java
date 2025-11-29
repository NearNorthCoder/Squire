/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Combat$AttackStyle
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.client.Static
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f_Unknown;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.j_Unknown;
import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.client.Static;

public class H_Unknown
implements F {
    public static /* synthetic */ boolean bz;
    public static /* synthetic */ WorldPoint iG;
    public static /* synthetic */ WorldArea iD;
    public static /* synthetic */ WorldPoint bD;
    public static /* synthetic */ WorldPoint iF;
    private static /* synthetic */ String[] lIlllllI;
    public static /* synthetic */ WorldArea iC;
    private static /* synthetic */ int[] llIIIIII;
    public static /* synthetic */ List<d> bB;
    public static /* synthetic */ int[] iB;
    public static /* synthetic */ WorldArea iE;

    @Override
    public int U() {
        try {
            H.cu();
            0;
        }
        catch (Exception lIlIllIlIIllllI) {
            lIlIllIlIIllllI.printStackTrace();
        }
        if (3 != 3) {
            return (0x5C ^ 0x3A ^ (0xC ^ 0x57)) & (0x2E ^ 0x3F ^ (0xF ^ 0x23) ^ -1);
        }
        return llIIIIII[0];
    }

    @Override
    public String V() {
        return lIlllllI[llIIIIII[57]];
    }

    public static void cv() {
        if (H.lIlIIIlIIIl(Static.getClient().getVar(llIIIIII[22]), llIIIIII[1])) {
            Static.getClient().invokeMenuAction(lIlllllI[llIIIIII[13]], lIlllllI[llIIIIII[26]], llIIIIII[1], MenuAction.CC_OP.getId(), llIIIIII[27], llIIIIII[28]);
        }
        if (H.lIlIIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[10])) {
            String[] stringArray = new String[llIIIIII[1]];
            stringArray[H.llIIIIII[0]] = lIlllllI[llIIIIII[29]];
            if (H.lIlIIIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llIIIIII[1]];
                stringArray2[H.llIIIIII[0]] = lIlllllI[llIIIIII[30]];
                Inventory.getFirst((String[])stringArray2).interact(lIlllllI[llIIIIII[31]]);
            }
        }
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[10]) && H.lIlIIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[19])) {
            String[] stringArray = new String[llIIIIII[1]];
            stringArray[H.llIIIIII[0]] = lIlllllI[llIIIIII[19]];
            if (H.lIlIIIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[llIIIIII[1]];
                stringArray3[H.llIIIIII[0]] = lIlllllI[llIIIIII[32]];
                Inventory.getFirst((String[])stringArray3).interact(lIlllllI[llIIIIII[33]]);
            }
        }
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[19]) && H.lIlIIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[34])) {
            String[] stringArray = new String[llIIIIII[1]];
            stringArray[H.llIIIIII[0]] = lIlllllI[llIIIIII[35]];
            if (H.lIlIIIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[llIIIIII[1]];
                stringArray4[H.llIIIIII[0]] = lIlllllI[llIIIIII[36]];
                Inventory.getFirst((String[])stringArray4).interact(lIlllllI[llIIIIII[37]]);
            }
        }
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[34]) && H.lIlIIIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[2])) {
            int[] nArray = new int[llIIIIII[1]];
            nArray[H.llIIIIII[0]] = llIIIIII[16];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIIIII[1]];
                nArray2[H.llIIIIII[0]] = llIIIIII[16];
                Inventory.getFirst((int[])nArray2).interact(lIlllllI[llIIIIII[38]]);
            }
        }
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[2])) {
            int[] nArray = new int[llIIIIII[1]];
            nArray[H.llIIIIII[0]] = llIIIIII[17];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIIIIII[1]];
                nArray3[H.llIIIIII[0]] = llIIIIII[17];
                Inventory.getFirst((int[])nArray3).interact(lIlllllI[llIIIIII[39]]);
            }
        }
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIIII[34])) {
            int[] nArray = new int[llIIIIII[1]];
            nArray[H.llIIIIII[0]] = llIIIIII[40];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[llIIIIII[1]];
                nArray4[H.llIIIIII[0]] = llIIIIII[40];
                Inventory.getFirst((int[])nArray4).interact(lIlllllI[llIIIIII[41]]);
            }
            int[] nArray5 = new int[llIIIIII[1]];
            nArray5[H.llIIIIII[0]] = llIIIIII[42];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[llIIIIII[1]];
                nArray6[H.llIIIIII[0]] = llIIIIII[42];
                Inventory.getFirst((int[])nArray6).interact(lIlllllI[llIIIIII[43]]);
            }
            int[] nArray7 = new int[llIIIIII[1]];
            nArray7[H.llIIIIII[0]] = llIIIIII[44];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[llIIIIII[1]];
                nArray8[H.llIIIIII[0]] = llIIIIII[44];
                Inventory.getFirst((int[])nArray8).interact(lIlllllI[llIIIIII[34]]);
            }
            int[] nArray9 = new int[llIIIIII[1]];
            nArray9[H.llIIIIII[0]] = llIIIIII[45];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[llIIIIII[1]];
                nArray10[H.llIIIIII[0]] = llIIIIII[45];
                Inventory.getFirst((int[])nArray10).interact(lIlllllI[llIIIIII[46]]);
            }
        }
        int[] nArray = new int[llIIIIII[1]];
        nArray[H.llIIIIII[0]] = llIIIIII[47];
        if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[llIIIIII[1]];
            nArray11[H.llIIIIII[0]] = llIIIIII[47];
            Inventory.getFirst((int[])nArray11).interact(lIlllllI[llIIIIII[48]]);
        }
        int[] nArray12 = new int[llIIIIII[1]];
        nArray12[H.llIIIIII[0]] = llIIIIII[49];
        if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[llIIIIII[1]];
            nArray13[H.llIIIIII[0]] = llIIIIII[49];
            Inventory.getFirst((int[])nArray13).interact(lIlllllI[llIIIIII[50]]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bm() {
        int n2;
        block18: {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block17: {
                                        block8: {
                                            int n3;
                                            block10: {
                                                block16: {
                                                    block15: {
                                                        block14: {
                                                            block13: {
                                                                block12: {
                                                                    block11: {
                                                                        block9: {
                                                                            if (!H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[2])) break block8;
                                                                            int[] nArray = new int[llIIIIII[1]];
                                                                            nArray[H.llIIIIII[0]] = llIIIIII[17];
                                                                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[llIIIIII[1]];
                                                                            nArray2[H.llIIIIII[0]] = llIIIIII[17];
                                                                            if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[llIIIIII[1]];
                                                                        nArray[H.llIIIIII[0]] = llIIIIII[42];
                                                                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[llIIIIII[1]];
                                                                        nArray3[H.llIIIIII[0]] = llIIIIII[42];
                                                                        if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[llIIIIII[1]];
                                                                    nArray[H.llIIIIII[0]] = llIIIIII[44];
                                                                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[llIIIIII[1]];
                                                                    nArray4[H.llIIIIII[0]] = llIIIIII[44];
                                                                    if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[llIIIIII[1]];
                                                                nArray[H.llIIIIII[0]] = llIIIIII[40];
                                                                if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[llIIIIII[1]];
                                                                nArray5[H.llIIIIII[0]] = llIIIIII[40];
                                                                if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[llIIIIII[1]];
                                                            nArray[H.llIIIIII[0]] = llIIIIII[45];
                                                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[llIIIIII[1]];
                                                            nArray6[H.llIIIIII[0]] = llIIIIII[45];
                                                            if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[llIIIIII[1]];
                                                        nArray[H.llIIIIII[0]] = llIIIIII[47];
                                                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[llIIIIII[1]];
                                                        nArray7[H.llIIIIII[0]] = llIIIIII[47];
                                                        if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[llIIIIII[1]];
                                                    nArray[H.llIIIIII[0]] = llIIIIII[49];
                                                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[llIIIIII[1]];
                                                    nArray8[H.llIIIIII[0]] = llIIIIII[49];
                                                    if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[llIIIIII[1]];
                                                nArray[H.llIIIIII[0]] = llIIIIII[11];
                                                if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = llIIIIII[1];
                                                    0;
                                                    if (-1 <= 0) return n3 != 0;
                                                    return false;
                                                }
                                            }
                                            n3 = llIIIIII[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[llIIIIII[1]];
                                        nArray[H.llIIIIII[0]] = llIIIIII[16];
                                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[llIIIIII[1]];
                                        nArray9[H.llIIIIII[0]] = llIIIIII[16];
                                        if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[llIIIIII[1]];
                                    nArray[H.llIIIIII[0]] = llIIIIII[42];
                                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[llIIIIII[1]];
                                    nArray10[H.llIIIIII[0]] = llIIIIII[42];
                                    if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[llIIIIII[1]];
                                nArray[H.llIIIIII[0]] = llIIIIII[44];
                                if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[llIIIIII[1]];
                                nArray11[H.llIIIIII[0]] = llIIIIII[44];
                                if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[llIIIIII[1]];
                            nArray[H.llIIIIII[0]] = llIIIIII[40];
                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[llIIIIII[1]];
                            nArray12[H.llIIIIII[0]] = llIIIIII[40];
                            if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[llIIIIII[1]];
                        nArray[H.llIIIIII[0]] = llIIIIII[45];
                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[llIIIIII[1]];
                        nArray13[H.llIIIIII[0]] = llIIIIII[45];
                        if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[llIIIIII[1]];
                    nArray[H.llIIIIII[0]] = llIIIIII[47];
                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[llIIIIII[1]];
                    nArray14[H.llIIIIII[0]] = llIIIIII[47];
                    if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[llIIIIII[1]];
                nArray[H.llIIIIII[0]] = llIIIIII[49];
                if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[llIIIIII[1]];
                nArray15[H.llIIIIII[0]] = llIIIIII[49];
                if (!H.lIlIIIIlIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[llIIIIII[1]];
            nArray[H.llIIIIII[0]] = llIIIIII[11];
            if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIIIIII[1];
                0;
                if (2 >= 1) return n2 != 0;
                return ((0x40 ^ 0x1A ^ (0xA ^ 0x48)) & (99 + 120 - 110 + 36 ^ 119 + 11 - 102 + 109 ^ -1)) != 0;
            }
        }
        n2 = llIIIIII[0];
        return n2 != 0;
    }

    private static void lIlIIIIIllI() {
        llIIIIII = new int[72];
        H.llIIIIII[0] = (43 + 226 - 94 + 68 ^ 18 + 81 - 10 + 84) & (165 + 139 - 169 + 117 ^ 47 + 100 - 42 + 57 ^ -1);
        H.llIIIIII[1] = 1;
        H.llIIIIII[2] = 0x98 ^ 0xB0;
        H.llIIIIII[3] = 2;
        H.llIIIIII[4] = 3;
        H.llIIIIII[5] = -(0xFFFFFE3F & 0x4DF3) & (0xFFFFDFBE & 0x7FFB);
        H.llIIIIII[6] = 0xEA ^ 0xC7 ^ (0xA5 ^ 0x8C);
        H.llIIIIII[7] = -(0xFFFFFD57 & 0x52BD) & (0xFFFFFFFF & 0x53F7);
        H.llIIIIII[8] = -(0xFFFFEC75 & 0x7F9E) & (0xFFFFFFFB & 0x6FFF);
        H.llIIIIII[9] = -(0xFFFFE281 & 0x5D7F) & (0xFFFFDFC7 & 0x7F7F);
        H.llIIIIII[10] = 0xBC ^ 0x8C ^ (0xBF ^ 0x8A);
        H.llIIIIII[11] = 0xFFFFDDFF & 0x237B;
        H.llIIIIII[12] = 0x93 ^ 0xAF ^ (0x18 ^ 0x40);
        H.llIIIIII[13] = 0x2A ^ 0x44 ^ (0x15 ^ 0x74);
        H.llIIIIII[14] = 0x5C ^ 0x5A;
        H.llIIIIII[15] = 0 + 151 - 77 + 88 ^ 11 + 133 - 111 + 132;
        H.llIIIIII[16] = -(0xFFFFFAAD & 0x45DB) & (0xFFFFC5FB & 0x7FBF);
        H.llIIIIII[17] = 0xFFFFE575 & 0x1FBF;
        H.llIIIIII[18] = 141 + 24 - 101 + 118 ^ 72 + 55 - 3 + 66;
        H.llIIIIII[19] = 0xDA ^ 0x93 ^ (0x75 ^ 0x28);
        H.llIIIIII[20] = 0x31 ^ 0x38;
        H.llIIIIII[21] = 0x3D ^ 0x37;
        H.llIIIIII[22] = 9 ^ 2;
        H.llIIIIII[23] = 0x7B ^ 0x77;
        H.llIIIIII[24] = 0xCA ^ 0xB8 ^ 125 + 109 - 107 + 0;
        H.llIIIIII[25] = 55 + 1 - 40 + 127 ^ 41 + 8 - 2 + 82;
        H.llIIIIII[26] = 0x3E ^ 0x2E;
        H.llIIIIII[27] = -1;
        H.llIIIIII[28] = 0xFFFFEF5F & 0x25110BE;
        H.llIIIIII[29] = 4 + 156 - 30 + 37 ^ 101 + 124 - 84 + 41;
        H.llIIIIII[30] = 0x2C ^ 0x14 ^ (0x80 ^ 0xAA);
        H.llIIIIII[31] = 35 + 81 - 98 + 109 ^ (7 ^ 0x6B);
        H.llIIIIII[32] = 0x97 ^ 0x82;
        H.llIIIIII[33] = 0xBB ^ 0x80 ^ (0xAA ^ 0x87);
        H.llIIIIII[34] = 0x8B ^ 0xC7 ^ (0x10 ^ 0x42);
        H.llIIIIII[35] = 0xB2 ^ 0xA5;
        H.llIIIIII[36] = 0x9C ^ 0x84;
        H.llIIIIII[37] = 0x31 ^ 0x28;
        H.llIIIIII[38] = 0xB ^ 0x3E ^ (0x10 ^ 0x3F);
        H.llIIIIII[39] = 0xD7 ^ 0xC5 ^ (0x5E ^ 0x57);
        H.llIIIIII[40] = 0xFFFFC6AF & 0x3DD9;
        H.llIIIIII[41] = 0x57 ^ 0x74 ^ (0x21 ^ 0x1E);
        H.llIIIIII[42] = -(0xFFFFFF7F & 0x6981) & (0xFFFFEDEF & 0x7F73);
        H.llIIIIII[43] = 0x7E ^ 0x63;
        H.llIIIIII[44] = 0xFFFFAD79 & 0x56B7;
        H.llIIIIII[45] = 0xFFFFE7BF & 0x1CEF;
        H.llIIIIII[46] = 0x4A ^ 0x55;
        H.llIIIIII[47] = 0xFFFF9FE9 & 0x66BE;
        H.llIIIIII[48] = 0x88 ^ 0xA8;
        H.llIIIIII[49] = -(0xFFFFF7AF & 0xCD2) & (0xFFFFEFFF & 0x3FF7);
        H.llIIIIII[50] = 0xD1 ^ 0x81 ^ (0xFC ^ 0x8D);
        H.llIIIIII[51] = 0xFFFFEB84 & 0x17FF;
        H.llIIIIII[52] = 0xFFFFDFFF & 0x3F48;
        H.llIIIIII[53] = 0xFFFFDCFF & 0xABB8;
        H.llIIIIII[54] = 0xFFFFF9FA & 0x67AD;
        H.llIIIIII[55] = 0xFFFFC9FC & 0x37F7;
        H.llIIIIII[56] = -(0xFFFFE5AF & 0x5F53) & (0xFFFFFFFB & 0x7F9E);
        H.llIIIIII[57] = 36 + 75 - 55 + 82 ^ 36 + 23 - 13 + 122;
        H.llIIIIII[58] = 7 ^ 0x6E ^ (0xC3 ^ 0x89);
        H.llIIIIII[59] = -(0xFFFFFBD1 & 0x566F) & (0xFFFFDEFD & 0x7FDB);
        H.llIIIIII[60] = 0xFFFFBFFE & 0x4CDB;
        H.llIIIIII[61] = -(0xFFFFE5E2 & 0x5A1F) & (0xFFFFDEFF & 0x6DAD);
        H.llIIIIII[62] = 0xFFFFADF1 & 0x5EDE;
        H.llIIIIII[63] = -(0xFFFFF337 & 0x6FCD) & (0xFFFFFF7D & 0x6FF7);
        H.llIIIIII[64] = -(0xFFFFBBC1 & 0x57BF) & (0xFFFFBFDF & 0x5FFF);
        H.llIIIIII[65] = 0x8F ^ 0xBF;
        H.llIIIIII[66] = 0xFFFFBE9F & 0x4DED;
        H.llIIIIII[67] = -(0xFFFFBF97 & 0x7369) & (0xFFFFBF6F & 0x7FFD);
        H.llIIIIII[68] = -(0xFFFFD38B & 0x7F7D) & (0xFFFFDFFE & 0x7FBF);
        H.llIIIIII[69] = -(0xFFFFFF65 & 0x72FB) & (0xFFFFFEFF & Short.MAX_VALUE);
        H.llIIIIII[70] = -(0xFFFFF3BF & 0x1D5F) & (0xFFFFDDFF & 0x3FFE);
        H.llIIIIII[71] = 0x10 ^ 0x34;
    }

    private static boolean lIlIIIIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIlII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIIlIll(int n2) {
        return n2 == 0;
    }

    private static String lIlIIIIIIlI(String lIlIllIIlllIIII, String lIlIllIIllIllll) {
        lIlIllIIlllIIII = new String(Base64.getDecoder().decode(lIlIllIIlllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIIlllIIll = new StringBuilder();
        char[] lIlIllIIlllIIlI = lIlIllIIllIllll.toCharArray();
        int lIlIllIIlllIIIl = llIIIIII[0];
        char[] lIlIllIIllIlIll = lIlIllIIlllIIII.toCharArray();
        int lIlIllIIllIlIlI = lIlIllIIllIlIll.length;
        int lIlIllIIllIlIIl = llIIIIII[0];
        while (H.lIlIIIIlIlI(lIlIllIIllIlIIl, lIlIllIIllIlIlI)) {
            char lIlIllIIlllIllI = lIlIllIIllIlIll[lIlIllIIllIlIIl];
            lIlIllIIlllIIll.append((char)(lIlIllIIlllIllI ^ lIlIllIIlllIIlI[lIlIllIIlllIIIl % lIlIllIIlllIIlI.length]));
            0;
            ++lIlIllIIlllIIIl;
            ++lIlIllIIllIlIIl;
            0;
            if (3 <= 3) continue;
            return null;
        }
        return String.valueOf(lIlIllIIlllIIll);
    }

    static {
        H.lIlIIIIIllI();
        H.lIlIIIIIIll();
        bB = new ArrayList<d>();
        int[] nArray = new int[llIIIIII[18]];
        nArray[H.llIIIIII[0]] = llIIIIII[16];
        nArray[H.llIIIIII[1]] = llIIIIII[17];
        nArray[H.llIIIIII[3]] = llIIIIII[42];
        nArray[H.llIIIIII[4]] = llIIIIII[44];
        nArray[H.llIIIIII[6]] = llIIIIII[40];
        nArray[H.llIIIIII[10]] = llIIIIII[45];
        nArray[H.llIIIIII[14]] = llIIIIII[47];
        nArray[H.llIIIIII[15]] = llIIIIII[49];
        iB = nArray;
        iC = new WorldArea(llIIIIII[59], llIIIIII[60], llIIIIII[22], llIIIIII[22], llIIIIII[0]);
        iD = new WorldArea(llIIIIII[61], llIIIIII[62], llIIIIII[32], llIIIIII[26], llIIIIII[0]);
        iE = new WorldArea(llIIIIII[63], llIIIIII[64], llIIIIII[65], llIIIIII[34], llIIIIII[0]);
        iF = new WorldPoint(llIIIIII[66], llIIIIII[67], llIIIIII[0]);
        bD = new WorldPoint(llIIIIII[68], llIIIIII[60], llIIIIII[0]);
        iG = new WorldPoint(llIIIIII[69], llIIIIII[70], llIIIIII[0]);
    }

    private static boolean lIlIIIIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean W() {
        boolean bl;
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIIII[2])) {
            bl = llIIIIII[1];
            0;
            if (((0x45 ^ 0x5C ^ (0x4E ^ 0x67)) & (0x5C ^ 0x17 ^ (0x2B ^ 0x50) ^ -1)) != 0) {
                return ((0x19 ^ 0x10 ^ (0x51 ^ 0x7C)) & (3 ^ (0x9E ^ 0xB9) ^ -1)) != 0;
            }
        } else {
            bl = llIIIIII[0];
        }
        return bl;
    }

    public static void ag() {
        d lIlIllIlIlIIIII;
        int[] nArray = new int[llIIIIII[1]];
        nArray[H.llIIIIII[0]] = llIIIIII[9];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIIIII[9], llIIIIII[2], llIIIIII[51]);
            bB.add(d2);
            0;
        }
        int[] nArray2 = new int[llIIIIII[1]];
        nArray2[H.llIIIIII[0]] = llIIIIII[52];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlIllIlIlIIIII = new d(llIIIIII[52], llIIIIII[10], llIIIIII[51]);
            bB.add(lIlIllIlIlIIIII);
            0;
        }
        int[] nArray3 = new int[llIIIIII[1]];
        nArray3[H.llIIIIII[0]] = llIIIIII[49];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlIllIlIlIIIII = new d(llIIIIII[49], llIIIIII[1], llIIIIII[53]);
            bB.add(lIlIllIlIlIIIII);
            0;
        }
        int[] nArray4 = new int[llIIIIII[1]];
        nArray4[H.llIIIIII[0]] = llIIIIII[47];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlIllIlIlIIIII = new d(llIIIIII[47], llIIIIII[1], llIIIIII[54]);
            bB.add(lIlIllIlIlIIIII);
            0;
        }
        int[] nArray5 = new int[llIIIIII[1]];
        nArray5[H.llIIIIII[0]] = llIIIIII[11];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIlIllIlIlIIIII = new d(llIIIIII[11], llIIIIII[12], llIIIIII[55]);
            bB.add(lIlIllIlIlIIIII);
            0;
        }
        int[] nArray6 = new int[llIIIIII[1]];
        nArray6[H.llIIIIII[0]] = llIIIIII[40];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIlIllIlIlIIIII = new d(llIIIIII[40], llIIIIII[1], llIIIIII[56]);
            bB.add(lIlIllIlIlIIIII);
            0;
        }
        int[] nArray7 = new int[llIIIIII[1]];
        nArray7[H.llIIIIII[0]] = llIIIIII[44];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIlIllIlIlIIIII = new d(llIIIIII[44], llIIIIII[1], llIIIIII[56]);
            bB.add(lIlIllIlIlIIIII);
            0;
        }
        int[] nArray8 = new int[llIIIIII[1]];
        nArray8[H.llIIIIII[0]] = llIIIIII[45];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIlIllIlIlIIIII = new d(llIIIIII[45], llIIIIII[1], llIIIIII[56]);
            bB.add(lIlIllIlIlIIIII);
            0;
        }
        int[] nArray9 = new int[llIIIIII[1]];
        nArray9[H.llIIIIII[0]] = llIIIIII[42];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lIlIllIlIlIIIII = new d(llIIIIII[42], llIIIIII[1], llIIIIII[56]);
            bB.add(lIlIllIlIlIIIII);
            0;
        }
        if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[2])) {
            int[] nArray10 = new int[llIIIIII[1]];
            nArray10[H.llIIIIII[0]] = llIIIIII[17];
            if (H.lIlIIIIlIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                lIlIllIlIlIIIII = new d(llIIIIII[17], llIIIIII[1], llIIIIII[54]);
                bB.add(lIlIllIlIlIIIII);
                0;
            }
        }
        int[] nArray11 = new int[llIIIIII[1]];
        nArray11[H.llIIIIII[0]] = llIIIIII[16];
        if (H.lIlIIIIlIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
            lIlIllIlIlIIIII = new d(llIIIIII[16], llIIIIII[1], llIIIIII[56]);
            bB.add(lIlIllIlIlIIIII);
            0;
        }
    }

    private static String lIlIIIIIIIl(String lIlIllIlIIlIIlI, String lIlIllIlIIlIIIl) {
        try {
            SecretKeySpec lIlIllIlIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), llIIIIII[18]), "DES");
            Cipher lIlIllIlIIlIlII = Cipher.getInstance("DES");
            lIlIllIlIIlIlII.init(llIIIIII[3], lIlIllIlIIlIlIl);
            return new String(lIlIllIlIIlIlII.doFinal(Base64.getDecoder().decode(lIlIllIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIlIIlIIll) {
            lIlIllIlIIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIIII(Object object) {
        return object == null;
    }

    private static boolean lIlIIIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    public static void cu() {
        block17: {
            block19: {
                block18: {
                    if (H.lIlIIIIlIIl(bz ? 1 : 0)) {
                        AccBuilderBarrows.c = lIlllllI[llIIIIII[0]];
                        b.a(bB);
                        if (H.lIlIIIIlIlI(bB.size(), llIIIIII[1])) {
                            System.out.println(lIlllllI[llIIIIII[1]]);
                            bz = llIIIIII[0];
                        }
                    }
                    if (!H.lIlIIIIlIll(bz ? 1 : 0)) break block17;
                    if (H.lIlIIIIlIll(H.bm() ? 1 : 0) && H.lIlIIIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIIII[2])) {
                        BankLocation lIlIllIlIlIIllI = BankLocation.getNearest();
                        if (H.lIlIIIIllII(lIlIllIlIlIIllI) && H.lIlIIIIlIll(lIlIllIlIlIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = lIlllllI[llIIIIII[3]];
                            a.a(lIlIllIlIlIIllI);
                        }
                        if (H.lIlIIIIllII(lIlIllIlIlIIllI) && H.lIlIIIIlIIl(lIlIllIlIlIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = lIlllllI[llIIIIII[4]];
                            if (H.lIlIIIIlIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIII[5]);
                                0;
                            }
                            if (H.lIlIIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                if (H.lIlIIIIllIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIIIII[1]);
                                    0;
                                }
                                if (H.lIlIIIIllIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIIIIII[3]);
                                    0;
                                }
                                if (H.lIlIIIIlIll(H.cw() ? 1 : 0)) {
                                    H.ag();
                                    System.out.println(lIlllllI[llIIIIII[6]]);
                                    bz = llIIIIII[1];
                                    return;
                                }
                                a.a(iB, llIIIIII[1]);
                                a.a(llIIIIII[7], llIIIIII[8]);
                                a.b(f.bb, llIIIIII[1]);
                                a.a(llIIIIII[9], llIIIIII[10]);
                                a.a(llIIIIII[11], llIIIIII[12]);
                            }
                        }
                    }
                    if (!H.lIlIIIIlIIl(H.bm() ? 1 : 0)) break block17;
                    H.cv();
                    if (H.lIlIIIIlllI(Movement.getRunEnergy(), llIIIIII[13]) && H.lIlIIIIlIll(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[llIIIIII[1]];
                    stringArray[H.llIIIIII[0]] = lIlllllI[llIIIIII[10]];
                    if (!H.lIlIIIIlIll(Equipment.contains((String[])stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[llIIIIII[1]];
                    stringArray2[H.llIIIIII[0]] = lIlllllI[llIIIIII[14]];
                    if (!H.lIlIIIIlIll(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[llIIIIII[1]];
                    stringArray3[H.llIIIIII[0]] = lIlllllI[llIIIIII[15]];
                    if (!H.lIlIIIIlIll(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[llIIIIII[1]];
                    nArray[H.llIIIIII[0]] = llIIIIII[16];
                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[llIIIIII[1]];
                    nArray2[H.llIIIIII[0]] = llIIIIII[17];
                    if (!H.lIlIIIIlIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block19;
                }
                H.cx();
            }
            if (H.lIlIIIIllll(H.lIlIIIIlIII(e.v(), 45.0))) {
                int[] nArray = new int[llIIIIII[1]];
                nArray[H.llIIIIII[0]] = llIIIIII[11];
                if (H.lIlIIIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[llIIIIII[1]];
                    nArray3[H.llIIIIII[0]] = llIIIIII[11];
                    Inventory.getFirst((int[])nArray3).interact(lIlllllI[llIIIIII[18]]);
                    Time.sleepTicks((int)llIIIIII[1]);
                    0;
                }
            }
            if (H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[19]) && H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.STRENGTH), llIIIIII[19])) {
                j.R();
            }
        }
    }

    private static int lIlIIIIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean T() {
        return llIIIIII[0];
    }

    private static boolean lIlIIIIllll(int n2) {
        return n2 < 0;
    }

    private static void lIlIIIIIIll() {
        lIlllllI = new String[llIIIIII[71]];
        H.lIlllllI[H.llIIIIII[0]] = H."Buying items";
        H.lIlllllI[H.llIIIIII[1]] = H."Finished buying items, switching back to melee training";
        H.lIlllllI[H.llIIIIII[3]] = H."Navigating to bank";
        H.lIlllllI[H.llIIIIII[4]] = H."Handling banking";
        H.lIlllllI[H.llIIIIII[6]] = H."We are missing supplies, switching to BUYING";
        H.lIlllllI[H.llIIIIII[10]] = H."Iron scimitar";
        H.lIlllllI[H.llIIIIII[14]] = H."Steel scimitar";
        H.lIlllllI[H.llIIIIII[15]] = H."Mithril scimitar";
        H.lIlllllI[H.llIIIIII[18]] = H."Eat";
        H.lIlllllI[H.llIIIIII[20]] = H."Walking to cow area";
        H.lIlllllI[H.llIIIIII[21]] = H."Killing cows";
        H.lIlllllI[H.llIIIIII[22]] = H."Cow";
        H.lIlllllI[H.llIIIIII[23]] = H."cow";
        H.lIlllllI[H.llIIIIII[24]] = H."Attack";
        H.lIlllllI[H.llIIIIII[25]] = H."Attack";
        H.lIlllllI[H.llIIIIII[13]] = H."Auto retaliate";
        H.lIlllllI[H.llIIIIII[26]] = H."";
        H.lIlllllI[H.llIIIIII[29]] = H."Iron scimitar";
        H.lIlllllI[H.llIIIIII[30]] = H."Iron scimitar";
        H.lIlllllI[H.llIIIIII[31]] = H."Wield";
        H.lIlllllI[H.llIIIIII[19]] = H."Steel scimitar";
        H.lIlllllI[H.llIIIIII[32]] = H."Steel scimitar";
        H.lIlllllI[H.llIIIIII[33]] = H."Wield";
        H.lIlllllI[H.llIIIIII[35]] = H."Mithril scimitar";
        H.lIlllllI[H.llIIIIII[36]] = H."Mithril scimitar";
        H.lIlllllI[H.llIIIIII[37]] = H."Wield";
        H.lIlllllI[H.llIIIIII[38]] = H."Wield";
        H.lIlllllI[H.llIIIIII[39]] = H."Wield";
        H.lIlllllI[H.llIIIIII[41]] = H."Wear";
        H.lIlllllI[H.llIIIIII[43]] = H."Wear";
        H.lIlllllI[H.llIIIIII[34]] = H."Wear";
        H.lIlllllI[H.llIIIIII[46]] = H."Wear";
        H.lIlllllI[H.llIIIIII[48]] = H."Wear";
        H.lIlllllI[H.llIIIIII[50]] = H."Wear";
        H.lIlllllI[H.llIIIIII[57]] = H."40 Def";
        H.lIlllllI[H.llIIIIII[58]] = H."Cow";
    }

    private static boolean lIlIIIIllII(Object object) {
        return object != null;
    }

    public static void ab() {
        if (H.lIlIIIIlIll(iD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIlllllI[llIIIIII[20]];
            Movement.walkTo((WorldPoint)bD);
            0;
            Time.sleepTicks((int)llIIIIII[1]);
            0;
        }
        if (H.lIlIIIIlIIl(iD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIlllllI[llIIIIII[21]];
            if (H.lIlIIIlIIII(Players.getLocal().getInteracting())) {
                NPC lIlIllIlIlIIIll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (H.lIlIIIIlIIl(nPC.getName().contains(lIlllllI[llIIIIII[58]]) ? 1 : 0) && H.lIlIIIlIIII(nPC.getInteracting()) && H.lIlIIIIlIll(nPC.isDead() ? 1 : 0)) {
                        n2 = llIIIIII[1];
                        0;
                        if (((0x38 ^ 0x17 ^ (0x9E ^ 0x95)) & (128 + 13 - 69 + 74 ^ 20 + 80 - 84 + 166 ^ -1)) != 0) {
                            return ((0x45 ^ 0x53 ^ (4 ^ 0x31)) & (0xBE ^ 0x8E ^ (0x89 ^ 0x9A) ^ -1)) != 0;
                        }
                    } else {
                        n2 = llIIIIII[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[llIIIIII[3]];
                stringArray[H.llIIIIII[0]] = lIlllllI[llIIIIII[22]];
                stringArray[H.llIIIIII[1]] = lIlllllI[llIIIIII[23]];
                List lIlIllIlIlIIIlI = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (H.lIlIIIlIlII(nPC.getInteracting(), Players.getLocal())) {
                        bl = llIIIIII[1];
                        0;
                        
                        }
                    } else {
                        bl = llIIIIII[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (H.lIlIIIIlIll(lIlIllIlIlIIIlI.isEmpty() ? 1 : 0)) {
                    ((NPC)lIlIllIlIlIIIlI.get(llIIIIII[0])).interact(lIlllllI[llIIIIII[24]]);
                    Time.sleepTicks((int)llIIIIII[3]);
                    0;
                }
                if (H.lIlIIIIllII(lIlIllIlIlIIIll) && H.lIlIIIIlIll(Players.getLocal().isMoving() ? 1 : 0) && H.lIlIIIIlIIl(lIlIllIlIlIIIlI.isEmpty() ? 1 : 0)) {
                    lIlIllIlIlIIIll.interact(lIlllllI[llIIIIII[25]]);
                    Time.sleepTicks((int)llIIIIII[3]);
                    0;
                }
            }
            if (H.lIlIIIIllII(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)llIIIIII[6]);
                0;
            }
        }
    }

    public static void cx() {
        if (H.lIlIIIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIIII[2])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    private static boolean lIlIIIIllIl(int n2) {
        return n2 > 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean cw() {
        int n2;
        block15: {
            block22: {
                block21: {
                    block20: {
                        block19: {
                            block18: {
                                block17: {
                                    block16: {
                                        block14: {
                                            block4: {
                                                int n3;
                                                block6: {
                                                    block13: {
                                                        block12: {
                                                            block11: {
                                                                block10: {
                                                                    block9: {
                                                                        block8: {
                                                                            block7: {
                                                                                block5: {
                                                                                    if (!H.lIlIIIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIII[2])) break block4;
                                                                                    int[] nArray = new int[llIIIIII[1]];
                                                                                    nArray[H.llIIIIII[0]] = llIIIIII[17];
                                                                                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[llIIIIII[1]];
                                                                                    nArray2[H.llIIIIII[0]] = llIIIIII[17];
                                                                                    if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[llIIIIII[1]];
                                                                                    nArray3[H.llIIIIII[0]] = llIIIIII[17];
                                                                                    if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[llIIIIII[1]];
                                                                                nArray[H.llIIIIII[0]] = llIIIIII[42];
                                                                                if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[llIIIIII[1]];
                                                                                nArray4[H.llIIIIII[0]] = llIIIIII[42];
                                                                                if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[llIIIIII[1]];
                                                                                nArray5[H.llIIIIII[0]] = llIIIIII[42];
                                                                                if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[llIIIIII[1]];
                                                                            nArray[H.llIIIIII[0]] = llIIIIII[44];
                                                                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[llIIIIII[1]];
                                                                            nArray6[H.llIIIIII[0]] = llIIIIII[44];
                                                                            if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[llIIIIII[1]];
                                                                            nArray7[H.llIIIIII[0]] = llIIIIII[44];
                                                                            if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[llIIIIII[1]];
                                                                        nArray[H.llIIIIII[0]] = llIIIIII[40];
                                                                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[llIIIIII[1]];
                                                                        nArray8[H.llIIIIII[0]] = llIIIIII[40];
                                                                        if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[llIIIIII[1]];
                                                                        nArray9[H.llIIIIII[0]] = llIIIIII[40];
                                                                        if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[llIIIIII[1]];
                                                                    nArray[H.llIIIIII[0]] = llIIIIII[45];
                                                                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[llIIIIII[1]];
                                                                    nArray10[H.llIIIIII[0]] = llIIIIII[45];
                                                                    if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[llIIIIII[1]];
                                                                    nArray11[H.llIIIIII[0]] = llIIIIII[45];
                                                                    if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[llIIIIII[1]];
                                                                nArray[H.llIIIIII[0]] = llIIIIII[47];
                                                                if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[llIIIIII[1]];
                                                                nArray12[H.llIIIIII[0]] = llIIIIII[47];
                                                                if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[llIIIIII[1]];
                                                                nArray13[H.llIIIIII[0]] = llIIIIII[47];
                                                                if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[llIIIIII[1]];
                                                            nArray[H.llIIIIII[0]] = llIIIIII[49];
                                                            if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[llIIIIII[1]];
                                                            nArray14[H.llIIIIII[0]] = llIIIIII[49];
                                                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[llIIIIII[1]];
                                                            nArray15[H.llIIIIII[0]] = llIIIIII[49];
                                                            if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[llIIIIII[1]];
                                                        nArray[H.llIIIIII[0]] = llIIIIII[11];
                                                        if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[llIIIIII[1]];
                                                        nArray16[H.llIIIIII[0]] = llIIIIII[11];
                                                        if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = llIIIIII[1];
                                                    0;
                                                    if (((0x72 ^ 0x64) & ~(0x39 ^ 0x2F)) == 0) return n3 != 0;
                                                    return false;
                                                }
                                                n3 = llIIIIII[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[llIIIIII[1]];
                                            nArray[H.llIIIIII[0]] = llIIIIII[16];
                                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[llIIIIII[1]];
                                            nArray17[H.llIIIIII[0]] = llIIIIII[16];
                                            if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[llIIIIII[1]];
                                            nArray18[H.llIIIIII[0]] = llIIIIII[16];
                                            if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[llIIIIII[1]];
                                        nArray[H.llIIIIII[0]] = llIIIIII[42];
                                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[llIIIIII[1]];
                                        nArray19[H.llIIIIII[0]] = llIIIIII[42];
                                        if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[llIIIIII[1]];
                                        nArray20[H.llIIIIII[0]] = llIIIIII[42];
                                        if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[llIIIIII[1]];
                                    nArray[H.llIIIIII[0]] = llIIIIII[44];
                                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[llIIIIII[1]];
                                    nArray21[H.llIIIIII[0]] = llIIIIII[44];
                                    if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[llIIIIII[1]];
                                    nArray22[H.llIIIIII[0]] = llIIIIII[44];
                                    if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[llIIIIII[1]];
                                nArray[H.llIIIIII[0]] = llIIIIII[40];
                                if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[llIIIIII[1]];
                                nArray23[H.llIIIIII[0]] = llIIIIII[40];
                                if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[llIIIIII[1]];
                                nArray24[H.llIIIIII[0]] = llIIIIII[40];
                                if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[llIIIIII[1]];
                            nArray[H.llIIIIII[0]] = llIIIIII[45];
                            if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[llIIIIII[1]];
                            nArray25[H.llIIIIII[0]] = llIIIIII[45];
                            if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[llIIIIII[1]];
                            nArray26[H.llIIIIII[0]] = llIIIIII[45];
                            if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[llIIIIII[1]];
                        nArray[H.llIIIIII[0]] = llIIIIII[47];
                        if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[llIIIIII[1]];
                        nArray27[H.llIIIIII[0]] = llIIIIII[47];
                        if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[llIIIIII[1]];
                        nArray28[H.llIIIIII[0]] = llIIIIII[47];
                        if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[llIIIIII[1]];
                    nArray[H.llIIIIII[0]] = llIIIIII[49];
                    if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[llIIIIII[1]];
                    nArray29[H.llIIIIII[0]] = llIIIIII[49];
                    if (!H.lIlIIIIlIll(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[llIIIIII[1]];
                    nArray30[H.llIIIIII[0]] = llIIIIII[49];
                    if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[llIIIIII[1]];
                nArray[H.llIIIIII[0]] = llIIIIII[11];
                if (!H.lIlIIIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[llIIIIII[1]];
                nArray31[H.llIIIIII[0]] = llIIIIII[11];
                if (!H.lIlIIIIlIIl(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = llIIIIII[1];
            0;
            if ((0x70 ^ 0x56 ^ (0x7E ^ 0x5C)) > 1) return n2 != 0;
            return ((138 + 123 - 174 + 127 ^ 4 + 97 - 63 + 111) & (0x2F ^ 0 ^ (0x55 ^ 0x39) ^ -1)) != 0;
        }
        n2 = llIIIIII[0];
        return n2 != 0;
    }

    private static String lIlIIIIIIII(String lIlIllIlIIIIlIl, String lIlIllIlIIIIlII) {
        try {
            SecretKeySpec lIlIllIlIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIlIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIlIIIIlll = Cipher.getInstance("Blowfish");
            lIlIllIlIIIIlll.init(llIIIIII[3], lIlIllIlIIIlIII);
            return new String(lIlIllIlIIIIlll.doFinal(Base64.getDecoder().decode(lIlIllIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIllIlIIIIllI) {
            lIlIllIlIIIIllI.printStackTrace();
            return null;
        }
    }
}

