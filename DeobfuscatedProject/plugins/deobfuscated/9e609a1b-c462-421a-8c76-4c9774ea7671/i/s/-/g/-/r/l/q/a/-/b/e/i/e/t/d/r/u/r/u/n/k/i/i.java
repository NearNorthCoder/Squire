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
package i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.M;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.a;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.b;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.d;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.e;
import i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.m;
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

public class i
implements M {
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ int[] lIIIllllIIIII;
    static /* synthetic */ WorldPoint bC;
    static /* synthetic */ WorldArea bB;
    static /* synthetic */ WorldPoint bD;
    public static /* synthetic */ List<d> bA;
    private static /* synthetic */ String[] lIIIlllIllIll;
    public static /* synthetic */ boolean by;

    private static boolean lIlIIlIlIIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIlIIlllIl(Object object) {
        return object == null;
    }

    public static void V() {
        if (i.lIlIIlIlIIlIlll(Widgets.get((int)lIIIllllIIIII[49], (int)lIIIllllIIIII[50]))) {
            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[51]];
            Widgets.get((int)lIIIllllIIIII[49], (int)lIIIllllIIIII[50]).interact(lIIIlllIllIll[lIIIllllIIIII[52]]);
            Time.sleepTicks((int)lIIIllllIIIII[5]);
            0;
        }
        if (i.lIlIIlIlIIlllIl(Widgets.get((int)lIIIllllIIIII[49], (int)lIIIllllIIIII[50])) && i.lIlIIlIlIIlIllI(Widgets.get((int)lIIIllllIIIII[53]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lIIIllllIIIII[1]);
            0;
            if (i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[17])) {
                Widgets.get((int)lIIIllllIIIII[53], (int)lIIIllllIIIII[1]).getChild(lIIIllllIIIII[1]).interact(lIIIlllIllIll[lIIIllllIIIII[54]]);
            }
            if (i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[31]) && i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[17])) {
                Widgets.get((int)lIIIllllIIIII[53], (int)lIIIllllIIIII[1]).getChild(lIIIllllIIIII[2]).interact(lIIIlllIllIll[lIIIllllIIIII[55]]);
            }
            if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[31]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[36])) {
                Widgets.get((int)lIIIllllIIIII[53], (int)lIIIllllIIIII[1]).getChild(lIIIllllIIIII[3]).interact(lIIIlllIllIll[lIIIllllIIIII[19]]);
            }
            if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[31])) {
                int[] nArray = new int[lIIIllllIIIII[1]];
                nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                if (i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIllllIIIII[53], (int)lIIIllllIIIII[1]).getChild(lIIIllllIIIII[3]).interact(lIIIlllIllIll[lIIIllllIIIII[50]]);
                }
            }
            if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[36])) {
                int[] nArray = new int[lIIIllllIIIII[1]];
                nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lIIIllllIIIII[53], (int)lIIIllllIIIII[1]).getChild(lIIIllllIIIII[5]).interact(lIIIlllIllIll[lIIIllllIIIII[56]]);
                }
            }
            Time.sleepTicks((int)lIIIllllIIIII[1]);
            0;
        }
    }

    private static boolean lIlIIlIlIIlIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIlIlIIlllll(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlIIlIIlllIlII(String lllllllllllllllIIIIIlIIIIlIllIIl, String lllllllllllllllIIIIIlIIIIlIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIIIIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIIIIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIlIIIIlIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIlIIIIlIllIll.init(lIIIllllIIIII[2], lllllllllllllllIIIIIlIIIIlIlllII);
            return new String(lllllllllllllllIIIIIlIIIIlIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIlIIIIlIllIlI) {
            lllllllllllllllIIIIIlIIIIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIIlIIlllIIlI(String lllllllllllllllIIIIIlIIIIlllIllI, String lllllllllllllllIIIIIlIIIIllllIlI) {
        lllllllllllllllIIIIIlIIIIlllIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIIIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIlIIIIllllIIl = new StringBuilder();
        char[] lllllllllllllllIIIIIlIIIIllllIII = lllllllllllllllIIIIIlIIIIllllIlI.toCharArray();
        int lllllllllllllllIIIIIlIIIIlllIlll = lIIIllllIIIII[0];
        char[] lllllllllllllllIIIIIlIIIIlllIIIl = lllllllllllllllIIIIIlIIIIlllIllI.toCharArray();
        int lllllllllllllllIIIIIlIIIIlllIIII = lllllllllllllllIIIIIlIIIIlllIIIl.length;
        int lllllllllllllllIIIIIlIIIIllIllll = lIIIllllIIIII[0];
        while (i.lIlIIlIlIIlIlIl(lllllllllllllllIIIIIlIIIIllIllll, lllllllllllllllIIIIIlIIIIlllIIII)) {
            char lllllllllllllllIIIIIlIIIIlllllII = lllllllllllllllIIIIIlIIIIlllIIIl[lllllllllllllllIIIIIlIIIIllIllll];
            lllllllllllllllIIIIIlIIIIllllIIl.append((char)(lllllllllllllllIIIIIlIIIIlllllII ^ lllllllllllllllIIIIIlIIIIllllIII[lllllllllllllllIIIIIlIIIIlllIlll % lllllllllllllllIIIIIlIIIIllllIII.length]));
            0;
            ++lllllllllllllllIIIIIlIIIIlllIlll;
            ++lllllllllllllllIIIIIlIIIIllIllll;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIIlIIIIllllIIl);
    }

    private static void lIlIIlIlIIlIIll() {
        lIIIllllIIIII = new int[82];
        i.lIIIllllIIIII[0] = (0xAF ^ 0xBC) & ~(6 ^ 0x15);
        i.lIIIllllIIIII[1] = 1;
        i.lIIIllllIIIII[2] = 2;
        i.lIIIllllIIIII[3] = 3;
        i.lIIIllllIIIII[4] = -(0xFFFFE3F7 & 0x7C6A) & (0xFFFFF7FF & 0x7BE9);
        i.lIIIllllIIIII[5] = 0x9C ^ 0x98;
        i.lIIIllllIIIII[6] = 0x5A ^ 7 ^ (0x41 ^ 0x2B);
        i.lIIIllllIIIII[7] = -(0xFFFFFFBF & 0x7DD1) & (0xFFFFFFFE & 0x7FBF);
        i.lIIIllllIIIII[8] = 0xFFFFC7FD & 0x3DDE;
        i.lIIIllllIIIII[9] = -(0xFFFFFBF5 & 0x5DDB) & (0xFFFFFBFF & 0x5FFB);
        i.lIIIllllIIIII[10] = -(0xFFFFDDA1 & 0x265F) & (0xFFFFBDCE & 0x4FF5);
        i.lIIIllllIIIII[11] = 0xFFFFC7AF & 0x3A7D;
        i.lIIIllllIIIII[12] = 0xFFFFBB2A & 0x46FF;
        i.lIIIllllIIIII[13] = 0xFFFFF3B7 & 0x1DDC;
        i.lIIIllllIIIII[14] = -(0xFFFFF9C9 & 0x67FF) & (0xFFFFF7FB & 0x6BFF);
        i.lIIIllllIIIII[15] = -(0xFFFFFFF5 & 0x4A2F) & (0xFFFFFBFD & 0x7F77);
        i.lIIIllllIIIII[16] = -(0xFFFFD4BF & 0x6B77) & (0xFFFFFFFF & 0x5F7F);
        i.lIIIllllIIIII[17] = 0x25 ^ 0x20;
        i.lIIIllllIIIII[18] = -(0xFFFFFFD7 & 0x5229) & (0xFFFFDF7B & 0x73FF);
        i.lIIIllllIIIII[19] = 0xFA ^ 0xB4 ^ (0x95 ^ 0xC2);
        i.lIIIllllIIIII[20] = -(0xFFFFF9AD & 0x7ED7) & (0xFFFFFDEF & Short.MAX_VALUE);
        i.lIIIllllIIIII[21] = -(0xFFFFE7EF & 0x1C51) & (0xFFFFB6ED & 0x4F7E);
        i.lIIIllllIIIII[22] = -(0xFFFF9F6D & 0x7CDF) & (0xFFFFFEFF & 0x1F7D);
        i.lIIIllllIIIII[23] = 0x2D ^ 0xB ^ (0xA5 ^ 0xBD);
        i.lIIIllllIIIII[24] = 0x1E ^ 0x18;
        i.lIIIllllIIIII[25] = 7 + 127 - 77 + 134 ^ 8 + 112 - 109 + 149;
        i.lIIIllllIIIII[26] = 0xDC ^ 0xB3 ^ (0xD4 ^ 0xBC);
        i.lIIIllllIIIII[27] = -1;
        i.lIIIllllIIIII[28] = 0x1C ^ 0x39;
        i.lIIIllllIIIII[29] = 0x8C ^ 0x84;
        i.lIIIllllIIIII[30] = 0xA9 ^ 0x84;
        i.lIIIllllIIIII[31] = 0x50 ^ 0x76 ^ (0x31 ^ 0x1E);
        i.lIIIllllIIIII[32] = 0x10 ^ 0x1A;
        i.lIIIllllIIIII[33] = 0x49 ^ 0x42;
        i.lIIIllllIIIII[34] = 0xC ^ 0;
        i.lIIIllllIIIII[35] = 0x13 ^ 0x38 ^ (0x8B ^ 0x9F);
        i.lIIIllllIIIII[36] = 0xBF ^ 0xB2;
        i.lIIIllllIIIII[37] = 0xFFFFEB5F & 0x15E0;
        i.lIIIllllIIIII[38] = -(0xFFFFEFFF & 0x7DEE) & (0xFFFFEFFF & Short.MAX_VALUE);
        i.lIIIllllIIIII[39] = -(0xFFFFE38F & 0x7C73) & (0xFFFFFDAE & 0x6FFF);
        i.lIIIllllIIIII[40] = 0x73 ^ 0x7D;
        i.lIIIllllIIIII[41] = 155 + 57 - 175 + 137 ^ 35 + 40 - 8 + 94;
        i.lIIIllllIIIII[42] = 0x6F ^ 0x7F;
        i.lIIIllllIIIII[43] = 0xC ^ 0x1D;
        i.lIIIllllIIIII[44] = 0xFFFFC5FD & 0x3F67;
        i.lIIIllllIIIII[45] = 0x65 ^ 0x45 ^ (0x5E ^ 0x6C);
        i.lIIIllllIIIII[46] = 0x99 ^ 0xC2 ^ (0x11 ^ 0x59);
        i.lIIIllllIIIII[47] = 0x83 ^ 0x97;
        i.lIIIllllIIIII[48] = -(0xFFFFFBE3 & 0x1EFF) & (0xFFFF9BF6 & Short.MAX_VALUE);
        i.lIIIllllIIIII[49] = -(0xFFFFFF73 & 0x148D) & (0xFFFF9E57 & 0x77F9);
        i.lIIIllllIIIII[50] = 0x21 ^ 0x3B;
        i.lIIIllllIIIII[51] = 0xB8 ^ 0xAD;
        i.lIIIllllIIIII[52] = 0x87 ^ 0x91;
        i.lIIIllllIIIII[53] = 23 + 97 - 94 + 175;
        i.lIIIllllIIIII[54] = 6 + 120 - 103 + 128 ^ 45 + 53 - 22 + 52;
        i.lIIIllllIIIII[55] = 0x7E ^ 0x55 ^ (0xBA ^ 0x89);
        i.lIIIllllIIIII[56] = 0x56 ^ 0x3D ^ (0x78 ^ 8);
        i.lIIIllllIIIII[57] = 0xFFFFEFEB & 0x13FC;
        i.lIIIllllIIIII[58] = 101 + 104 - 125 + 90;
        i.lIIIllllIIIII[59] = 0xFFFFEFAF & 0x1FF0;
        i.lIIIllllIIIII[60] = -(0xFFFFFFE7 & 0x83A) & (0xFFFF9FFF & 0x6FF1);
        i.lIIIllllIIIII[61] = -(0x10 ^ 0x16) & (0xFFFFBFBF & 0x4BFD);
        i.lIIIllllIIIII[62] = -(0xAB ^ 0x82) & (0xFFFFB3FF & 0x7CFC);
        i.lIIIllllIIIII[63] = 0xFFFFBDDD & 0x7EAE;
        i.lIIIllllIIIII[64] = 0xA ^ 0x4D ^ (0x70 ^ 0x4F);
        i.lIIIllllIIIII[65] = (0xB6 ^ 0x9C) + (0x21 ^ 0x13) - (0x68 ^ 0x66) + (0x10 ^ 0x58);
        i.lIIIllllIIIII[66] = 0xFFFFFFBF & 0x3AD8;
        i.lIIIllllIIIII[67] = 0xF0 ^ 0x94;
        i.lIIIllllIIIII[68] = 0xFFFFFFCF & 0x2EFC;
        i.lIIIllllIIIII[69] = 0xFFFFF7AE & 0x69F9;
        i.lIIIllllIIIII[70] = -(0xFFFFF6F9 & 0x4997) & (0xFFFFFFF7 & 0x5FDF);
        i.lIIIllllIIIII[71] = 0xFFFFFBCD & 0x7B6;
        i.lIIIllllIIIII[72] = 0xF7 ^ 0xA5 ^ (0x2D ^ 0x63);
        i.lIIIllllIIIII[73] = 0xB6 ^ 0xAF ^ (7 ^ 0x7D);
        i.lIIIllllIIIII[74] = 0x3C ^ 0x21;
        i.lIIIllllIIIII[75] = 0x36 ^ 0x28;
        i.lIIIllllIIIII[76] = 0xFFFF9BDE & 0x6FEF;
        i.lIIIllllIIIII[77] = 0xFFFFCFF3 & 0x3CEF;
        i.lIIIllllIIIII[78] = 0xFFFF9BFF & 0x6FD7;
        i.lIIIllllIIIII[79] = 0xFFFFBDE9 & 0x4EFF;
        i.lIIIllllIIIII[80] = -(0xFFFFDB7E & 0x7787) & (0xFFFFFF5F & 0x5FFF);
        i.lIIIllllIIIII[81] = -(0xFFFFF465 & 0x7BFB) & (0xFFFFFFFF & 0x7DFF);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean T() {
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
                                                    if (!i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19])) break block19;
                                                    int[] nArray = new int[lIIIllllIIIII[1]];
                                                    nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[7];
                                                    if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIllllIIIII[1]];
                                                    nArray2[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                                    if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIllllIIIII[1]];
                                                    nArray3[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                                    if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIllllIIIII[1]];
                                                    nArray4[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                                    if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIllllIIIII[1]];
                                                    nArray5[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                                                    if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIllllIIIII[1]];
                                                    nArray6[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                                    if (!i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIllllIIIII[1]];
                                                    nArray7[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                                    if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIllllIIIII[1];
                                                0;
                                                if (2 <= (0xED ^ 0x9B ^ (0x7D ^ 0xF))) return n5 != 0;
                                                return ((0xA4 ^ 0xC5 ^ (0xDD ^ 0xA8)) & (0xB7 ^ 0xAD ^ (0xCD ^ 0xC3) ^ -1)) != 0;
                                            }
                                            n5 = lIIIllllIIIII[0];
                                            return n5 != 0;
                                        }
                                        if (!i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19]) || !i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) break block22;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                        if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIllllIIIII[1]];
                                        nArray8[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                        if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIllllIIIII[1]];
                                        nArray9[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                        if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIllllIIIII[1]];
                                        nArray10[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                                        if (!i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIllllIIIII[1]];
                                        nArray11[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                        if (!i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIllllIIIII[1]];
                                        nArray12[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                        if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIllllIIIII[1];
                                    0;
                                    if ((0x87 ^ 0x83) != 0) return n4 != 0;
                                    return ((0x47 ^ 0x26) & ~(0xD8 ^ 0xB9)) != 0;
                                }
                                n4 = lIIIllllIIIII[0];
                                return n4 != 0;
                            }
                            if (!i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6]) || !i.lIlIIlIlIIlIllI(bz ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIllllIIIII[1]];
                            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            if (!i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIllllIIIII[1]];
                            nArray13[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIllllIIIII[1]];
                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                        if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIllllIIIII[1]];
                            nArray14[i.lIIIllllIIIII[0]] = lIIIllllIIIII[23];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIllllIIIII[1];
                                0;
                                if (-1 != (91 + 43 - 2 + 8 ^ 23 + 60 - 61 + 114)) return n3 != 0;
                                return ((0x72 ^ 0x22 ^ 3) & (239 + 60 - 284 + 226 ^ 35 + 128 - 38 + 37 ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIIIllllIIIII[0];
                    return n3 != 0;
                }
                if (!i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6]) || !i.lIlIIlIlIIlIlII(bz ? 1 : 0)) return lIIIllllIIIII[0];
                int[] nArray = new int[lIIIllllIIIII[1]];
                nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                if (!i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIllllIIIII[1]];
                nArray15[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIllllIIIII[1]];
                nArray16[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIllllIIIII[1]];
                    nArray17[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                    if (i.lIlIIlIlIIllIIl(Bank.getFirst((int[])nArray17).getQuantity(), lIIIllllIIIII[17])) {
                        int[] nArray18 = new int[lIIIllllIIIII[1]];
                        nArray18[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                        if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIllllIIIII[1]];
                            nArray19[i.lIIIllllIIIII[0]] = lIIIllllIIIII[23];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIllllIIIII[1];
                                0;
                                if (-1 < 0) return n2 != 0;
                                return (3 & (3 ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIllllIIIII[0];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean S() {
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
                                                    if (!i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19])) break block19;
                                                    int[] nArray = new int[lIIIllllIIIII[1]];
                                                    nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[7];
                                                    if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lIIIllllIIIII[1]];
                                                    nArray2[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                                    if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lIIIllllIIIII[1]];
                                                    nArray3[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                                    if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lIIIllllIIIII[1]];
                                                    nArray4[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                                    if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lIIIllllIIIII[1]];
                                                    nArray5[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                                                    if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lIIIllllIIIII[1]];
                                                    nArray6[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                                    if (!i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lIIIllllIIIII[1]];
                                                    nArray7[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                                    if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lIIIllllIIIII[1];
                                                0;
                                                if (-1 <= 0) return n5 != 0;
                                                return ((102 + 149 - 143 + 123 ^ 112 + 158 - 260 + 185) & (0x32 ^ 0x4C ^ (0x11 ^ 0x4B) ^ -1)) != 0;
                                            }
                                            n5 = lIIIllllIIIII[0];
                                            return n5 != 0;
                                        }
                                        if (!i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19]) || !i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) break block22;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                        if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lIIIllllIIIII[1]];
                                        nArray8[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                        if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lIIIllllIIIII[1]];
                                        nArray9[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                        if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lIIIllllIIIII[1]];
                                        nArray10[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                                        if (!i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lIIIllllIIIII[1]];
                                        nArray11[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                        if (!i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lIIIllllIIIII[1]];
                                        nArray12[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
                                        if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lIIIllllIIIII[1];
                                    0;
                                    if (-(0x66 ^ 0x62) < 0) return n4 != 0;
                                    return ((0xEF ^ 0xB7) & ~(0x41 ^ 0x19)) != 0;
                                }
                                n4 = lIIIllllIIIII[0];
                                return n4 != 0;
                            }
                            if (!i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6]) || !i.lIlIIlIlIIlIllI(bz ? 1 : 0)) break block25;
                            int[] nArray = new int[lIIIllllIIIII[1]];
                            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            if (!i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lIIIllllIIIII[1]];
                            nArray13[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lIIIllllIIIII[1]];
                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                        if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lIIIllllIIIII[1]];
                            nArray14[i.lIIIllllIIIII[0]] = lIIIllllIIIII[35];
                            if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lIIIllllIIIII[1];
                                0;
                                if ((9 + 167 - 158 + 153 ^ 45 + 174 - 142 + 98) != -1) return n3 != 0;
                                return ((0x74 ^ 0x54 ^ (0xC4 ^ 0xB4)) & (0x3A ^ 0x56 ^ (0x79 ^ 0x45) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lIIIllllIIIII[0];
                    return n3 != 0;
                }
                if (!i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6]) || !i.lIlIIlIlIIlIlII(bz ? 1 : 0)) return lIIIllllIIIII[0];
                int[] nArray = new int[lIIIllllIIIII[1]];
                nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                if (!i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lIIIllllIIIII[1]];
                nArray15[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                if (!i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
            if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lIIIllllIIIII[1]];
                nArray16[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIllllIIIII[1]];
                    nArray17[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                    if (i.lIlIIlIlIIllIIl(Inventory.getFirst((int[])nArray17).getQuantity(), lIIIllllIIIII[17])) {
                        int[] nArray18 = new int[lIIIllllIIIII[1]];
                        nArray18[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                        if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lIIIllllIIIII[1]];
                            nArray19[i.lIIIllllIIIII[0]] = lIIIllllIIIII[35];
                            if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lIIIllllIIIII[1];
                                0;
                                if (-1 < 1) return n2 != 0;
                                return ((0x70 ^ 0x40) & ~(0x88 ^ 0xB8)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lIIIllllIIIII[0];
        return n2 != 0;
    }

    private static void R() {
        if (i.lIlIIlIlIIlllII(i.lIlIIlIlIIllIll(e.v(), 30.0))) {
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
            if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIIIllllIIIII[1]];
                nArray2[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                Inventory.getFirst((int[])nArray2).interact(lIIIlllIllIll[lIIIllllIIIII[41]]);
                Time.sleepTicks((int)lIIIllllIIIII[1]);
                0;
            }
        }
        if (i.lIlIIlIlIIlllIl(Players.getLocal().getInteracting())) {
            NPC lllllllllllllllIIIIIlIIIlIIlIlIl = NPCs.getNearest(nPC -> {
                int n2;
                if (i.lIlIIlIlIIlIlII(nPC.getName().contains(lIIIlllIllIll[lIIIllllIIIII[75]]) ? 1 : 0) && i.lIlIIlIlIIlIllI(nPC.isDead() ? 1 : 0)) {
                    n2 = lIIIllllIIIII[1];
                    0;
                    if ((1 & ~1) == (0x8E ^ 0x8A)) {
                        return ((0x21 ^ 1) & ~(0x31 ^ 0x11)) != 0;
                    }
                } else {
                    n2 = lIIIllllIIIII[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lIIIllllIIIII[2]];
            stringArray[i.lIIIllllIIIII[0]] = lIIIlllIllIll[lIIIllllIIIII[42]];
            stringArray[i.lIIIllllIIIII[1]] = lIIIlllIllIll[lIIIllllIIIII[43]];
            List lllllllllllllllIIIIIlIIIlIIlIlII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (i.lIlIIlIlIIllllI(nPC.getInteracting(), Players.getLocal())) {
                    bl = lIIIllllIIIII[1];
                    0;
                    if (-3 >= 0) {
                        return ((0x8A ^ 0xC6 ^ (0xB3 ^ 0x9C)) & (38 + 78 - -38 + 13 ^ 61 + 49 - -73 + 13 ^ -1)) != 0;
                    }
                } else {
                    bl = lIIIllllIIIII[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
            if (i.lIlIIlIlIIlIlII(Equipment.contains((int[])nArray) ? 1 : 0) && i.lIlIIlIlIIlIllI(i.U() ? 1 : 0)) {
                i.V();
            }
            if (i.lIlIIlIlIIlIlll(lllllllllllllllIIIIIlIIIlIIlIlIl) && i.lIlIIlIlIIlIllI(Players.getLocal().isMoving() ? 1 : 0)) {
                AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[45]];
                lllllllllllllllIIIIIlIIIlIIlIlIl.interact(lIIIlllIllIll[lIIIllllIIIII[46]]);
                Time.sleepTicks((int)lIIIllllIIIII[3]);
                0;
            }
        }
        if (i.lIlIIlIlIIlIlll(Players.getLocal().getInteracting())) {
            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[47]];
            Time.sleepTicks((int)lIIIllllIIIII[1]);
            0;
        }
    }

    private static boolean lIlIIlIlIIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    public static boolean U() {
        if (i.lIlIIlIlIIllIlI(Vars.getBit((int)lIIIllllIIIII[48]), lIIIllllIIIII[1]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[17])) {
            return lIIIllllIIIII[1];
        }
        if (i.lIlIIlIlIIllIlI(Vars.getBit((int)lIIIllllIIIII[48]), lIIIllllIIIII[2]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[31]) && i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[17])) {
            return lIIIllllIIIII[1];
        }
        if (i.lIlIIlIlIIllIlI(Vars.getBit((int)lIIIllllIIIII[48]), lIIIllllIIIII[3]) && i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[31]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[36])) {
            return lIIIllllIIIII[1];
        }
        if (i.lIlIIlIlIIllIlI(Vars.getBit((int)lIIIllllIIIII[48]), lIIIllllIIIII[3]) && i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[31])) {
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
            if (i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIllllIIIII[1];
            }
        }
        if (i.lIlIIlIlIIllIlI(Vars.getBit((int)lIIIllllIIIII[48]), lIIIllllIIIII[5]) && i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[36])) {
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
            if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lIIIllllIIIII[1];
            }
        }
        return lIIIllllIIIII[0];
    }

    private static boolean lIlIIlIlIIlllII(int n2) {
        return n2 < 0;
    }

    public static void P() {
        if (i.lIlIIlIlIIlIlII(by ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[0]];
            b.a(bA);
            if (i.lIlIIlIlIIlIlIl(bA.size(), lIIIllllIIIII[1])) {
                System.out.println(lIIIlllIllIll[lIIIllllIIIII[1]]);
                by = lIIIllllIIIII[0];
            }
        }
        if (i.lIlIIlIlIIlIllI(by ? 1 : 0)) {
            BankLocation lllllllllllllllIIIIIlIIIlIIllIlI;
            if (i.lIlIIlIlIIlIllI(i.S() ? 1 : 0)) {
                lllllllllllllllIIIIIlIIIlIIllIlI = BankLocation.getNearest();
                if (i.lIlIIlIlIIlIlll(lllllllllllllllIIIIIlIIIlIIllIlI) && i.lIlIIlIlIIlIllI(lllllllllllllllIIIIIlIIIlIIllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[2]];
                    a.a(lllllllllllllllIIIIIlIIIlIIllIlI);
                }
                if (i.lIlIIlIlIIlIlll(lllllllllllllllIIIIIlIIIlIIllIlI) && i.lIlIIlIlIIlIlII(lllllllllllllllIIIIIlIIIlIIllIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[3]];
                    if (i.lIlIIlIlIIlIllI(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lIIIllllIIIII[4]);
                        0;
                    }
                    if (i.lIlIIlIlIIlIlII(Bank.isOpen() ? 1 : 0)) {
                        if (i.lIlIIlIlIIllIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lIIIllllIIIII[5]);
                            0;
                        }
                        while (i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6]) && i.lIlIIlIlIIlIllI(m.av() ? 1 : 0)) {
                            m.at();
                            Time.sleepTicks((int)lIIIllllIIIII[1]);
                            0;
                            0;
                            if (((0x11 ^ 0x3B) & ~(0x29 ^ 3)) == 0) continue;
                            return;
                        }
                        if (i.lIlIIlIlIIlIllI(i.T() ? 1 : 0)) {
                            i.W();
                            System.out.println(lIIIlllIllIll[lIIIllllIIIII[5]]);
                            by = lIIIllllIIIII[1];
                            return;
                        }
                        if (i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) {
                            int[] nArray = new int[lIIIllllIIIII[1]];
                            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[7];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lIIIllllIIIII[1]];
                                nArray2[i.lIIIllllIIIII[0]] = lIIIllllIIIII[7];
                                if (i.lIlIIlIlIIlIlIl(Inventory.getCount((int[])nArray2), lIIIllllIIIII[1])) {
                                    Bank.withdraw((int)lIIIllllIIIII[7], (int)lIIIllllIIIII[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[7];
                                        if (i.lIlIIlIlIIllIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIllllIIIII[1];
                                            0;
                                            if (((0xF5 ^ 0xAB ^ (7 ^ 0x51)) & (0xD6 ^ 0xB3 ^ (0x67 ^ 0xA) ^ -1)) >= 1) {
                                                return ((0x61 ^ 0x3D ^ (0xCC ^ 0xBD)) & (133 + 140 - 199 + 79 ^ 159 + 122 - 140 + 39 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIllllIIIII[0];
                                        }
                                        return bl;
                                    }, (int)lIIIllllIIIII[4]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[lIIIllllIIIII[1]];
                            nArray3[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lIIIllllIIIII[1]];
                                nArray4[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                if (i.lIlIIlIlIIlIlIl(Inventory.getCount((int[])nArray4), lIIIllllIIIII[1])) {
                                    Bank.withdraw((int)lIIIllllIIIII[9], (int)lIIIllllIIIII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
                                        if (i.lIlIIlIlIIllIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIllllIIIII[1];
                                            0;
                                            if (2 < 0) {
                                                return ((0xFF ^ 0xA2) & ~(0x60 ^ 0x3D)) != 0;
                                            }
                                        } else {
                                            bl = lIIIllllIIIII[0];
                                        }
                                        return bl;
                                    }, (int)lIIIllllIIIII[4]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[lIIIllllIIIII[1]];
                            nArray5[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lIIIllllIIIII[1]];
                                nArray6[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                if (i.lIlIIlIlIIlIlIl(Inventory.getCount((int[])nArray6), lIIIllllIIIII[1])) {
                                    Bank.withdraw((int)lIIIllllIIIII[11], (int)lIIIllllIIIII[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
                                        if (i.lIlIIlIlIIllIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIllllIIIII[1];
                                            0;
                                            if ((0x4E ^ 0x54 ^ (0x5E ^ 0x40)) == 0) {
                                                return ((4 ^ 0x77 ^ (0x65 ^ 0x45)) & (142 + 170 - 294 + 235 ^ 101 + 83 - 104 + 94 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIllllIIIII[0];
                                        }
                                        return bl;
                                    }, (int)lIIIllllIIIII[4]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[lIIIllllIIIII[1]];
                            nArray7[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lIIIllllIIIII[1]];
                                nArray8[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                if (i.lIlIIlIlIIlIlIl(Inventory.getCount((int[])nArray8), lIIIllllIIIII[1])) {
                                    Bank.withdraw((int)lIIIllllIIIII[12], (int)lIIIllllIIIII[13], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
                                        if (i.lIlIIlIlIIllIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIllllIIIII[1];
                                            0;
                                            if (null != null) {
                                                return ((0x7B ^ 0x74 ^ (0x14 ^ 0x51)) & (77 + 158 - 85 + 65 ^ 34 + 135 - 24 + 12 ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lIIIllllIIIII[0];
                                        }
                                        return bl;
                                    }, (int)lIIIllllIIIII[4]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[lIIIllllIIIII[1]];
                            nArray9[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lIIIllllIIIII[1]];
                                nArray10[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                                if (i.lIlIIlIlIIlIlIl(Inventory.getCount((int[])nArray10), lIIIllllIIIII[1])) {
                                    Bank.withdraw((int)lIIIllllIIIII[14], (int)lIIIllllIIIII[8], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                                        if (i.lIlIIlIlIIllIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIllllIIIII[1];
                                            0;
                                            if (2 < ((0x18 ^ 0x49) & ~(0x54 ^ 5))) {
                                                return ((0x59 ^ 0x61) & ~(0x8A ^ 0xB2)) != 0;
                                            }
                                        } else {
                                            bl = lIIIllllIIIII[0];
                                        }
                                        return bl;
                                    }, (int)lIIIllllIIIII[4]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[lIIIllllIIIII[1]];
                            nArray11[i.lIIIllllIIIII[0]] = lIIIllllIIIII[15];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lIIIllllIIIII[1]];
                                nArray12[i.lIIIllllIIIII[0]] = lIIIllllIIIII[15];
                                if (i.lIlIIlIlIIlIllI(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lIIIllllIIIII[15], (int)lIIIllllIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[15];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lIIIllllIIIII[4]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)lIIIllllIIIII[16], (int)lIIIllllIIIII[17], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lIIIllllIIIII[1]];
                            nArray13[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lIIIllllIIIII[1]];
                                nArray14[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                                if (i.lIlIIlIlIIlIlIl(Inventory.getCount((int[])nArray14), lIIIllllIIIII[1]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19])) {
                                    Bank.withdrawAll((int)lIIIllllIIIII[18], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lIIIllllIIIII[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lIIIllllIIIII[1]];
                                        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
                                        if (i.lIlIIlIlIIllIII(Inventory.getCount((int[])nArray))) {
                                            bl = lIIIllllIIIII[1];
                                            0;
                                            if (1 > 3) {
                                                return ((0x3A ^ 0x72) & ~(0x70 ^ 0x38)) != 0;
                                            }
                                        } else {
                                            bl = lIIIllllIIIII[0];
                                        }
                                        return bl;
                                    }, (int)lIIIllllIIIII[4]);
                                    0;
                                }
                            }
                        }
                        if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) {
                            int[] nArray = new int[lIIIllllIIIII[1]];
                            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            if (i.lIlIIlIlIIlIllI(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lIIIllllIIIII[20], (int)lIIIllllIIIII[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIllllIIIII[1]);
                                0;
                            }
                            if (i.lIlIIlIlIIlIlII(bz ? 1 : 0)) {
                                Bank.withdrawAll((int)lIIIllllIIIII[21], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIllllIIIII[1]);
                                0;
                                Bank.withdrawAll((int)lIIIllllIIIII[14], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lIIIllllIIIII[1]);
                                0;
                            }
                            Bank.withdrawAll((int)lIIIllllIIIII[22], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lIIIllllIIIII[1]);
                            0;
                            Bank.withdrawAll((int)lIIIllllIIIII[23], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lIIIllllIIIII[1]);
                            0;
                        }
                    }
                }
            }
            if (i.lIlIIlIlIIlIlII(i.S() ? 1 : 0)) {
                if (i.lIlIIlIlIIlIlII(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19])) {
                    if (i.lIlIIlIlIIlIllI(bB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[17]];
                        Movement.walkTo((WorldPoint)bC);
                        0;
                        Time.sleepTicks((int)lIIIllllIIIII[1]);
                        0;
                    }
                    if (i.lIlIIlIlIIlIlII(bB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[24]];
                        i.R();
                    }
                }
                if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[19]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[25])) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[26]];
                    if (i.lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lIIIllllIIIII[1]);
                        0;
                    }
                }
                if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[25]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[28])) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[29]];
                    if (i.lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lIIIllllIIIII[1]);
                        0;
                    }
                }
                if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[28]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[30])) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[31]];
                    if (i.lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lIIIllllIIIII[1]);
                        0;
                    }
                }
                if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[30]) && i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) {
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[32]];
                    if (i.lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lIIIllllIIIII[1]);
                        0;
                    }
                }
                if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) {
                    int lllllllllllllllIIIIIlIIIlIIllIII;
                    AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[33]];
                    int[] nArray = new int[lIIIllllIIIII[1]];
                    nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                    if (i.lIlIIlIlIIlIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lIIIllllIIIII[1]];
                        nArray15[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                        if (i.lIlIIlIlIIlIllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lIIIllllIIIII[1]];
                            nArray16[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                            Inventory.getFirst((int[])nArray16).interact(lIIIlllIllIll[lIIIllllIIIII[34]]);
                            Time.sleepTicks((int)lIIIllllIIIII[1]);
                            0;
                        }
                    }
                    if (i.lIlIIlIlIIlIlII(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lIIIllllIIIII[1]];
                    nArray17[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                    lllllllllllllllIIIIIlIIIlIIllIlI = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lIIIllllIIIII[1]];
                    nArray18[i.lIIIllllIIIII[0]] = lIIIllllIIIII[35];
                    Item lllllllllllllllIIIIIlIIIlIIllIIl = Inventory.getFirst((int[])nArray18);
                    if (i.lIlIIlIlIIlIllI(bz ? 1 : 0)) {
                        if (i.lIlIIlIlIIlIllI(Players.getLocal().getWorldLocation().equals((Object)bD) ? 1 : 0)) {
                            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[36]];
                            Movement.walkTo((WorldPoint)bD);
                            0;
                            Time.sleepTicks((int)lIIIllllIIIII[1]);
                            0;
                        }
                        if (i.lIlIIlIlIIlIlII(Players.getLocal().getWorldLocation().equals((Object)bD) ? 1 : 0) && i.lIlIIlIlIIlIlll(lllllllllllllllIIIIIlIIIlIIllIlI) && i.lIlIIlIlIIlIlll(lllllllllllllllIIIIIlIIIlIIllIIl)) {
                            lllllllllllllllIIIIIlIIIlIIllIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lllllllllllllllIIIIIlIIIlIIllIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (i.lIlIIlIlIIlllll(Skills.getExperience((Skill)Skill.MAGIC), lllllllllllllllIIIIIlIIIlIIllIII)) {
                                    bl = lIIIllllIIIII[1];
                                    0;
                                    if ((91 + 136 - 215 + 154 ^ 80 + 5 - -6 + 71) == 0) {
                                        return ((120 + 6 - 69 + 113 ^ 130 + 72 - 175 + 119) & (0x1D ^ 0x43 ^ (0x27 ^ 0x41) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIllllIIIII[0];
                                }
                                return bl;
                            }, (int)lIIIllllIIIII[8]);
                            0;
                            Time.sleep((long)e.c(lIIIllllIIIII[37], lIIIllllIIIII[38]));
                            0;
                        }
                    }
                    if (i.lIlIIlIlIIlIlII(bz ? 1 : 0)) {
                        if (i.lIlIIlIlIIlIlll(lllllllllllllllIIIIIlIIIlIIllIlI) && i.lIlIIlIlIIlIlll(lllllllllllllllIIIIIlIIIlIIllIIl) && i.lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                            lllllllllllllllIIIIIlIIIlIIllIII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lllllllllllllllIIIIIlIIIlIIllIIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (i.lIlIIlIlIIlllll(Skills.getExperience((Skill)Skill.MAGIC), lllllllllllllllIIIIIlIIIlIIllIII)) {
                                    bl = lIIIllllIIIII[1];
                                    0;
                                    if (((131 + 8 - 47 + 137 ^ 101 + 67 - 26 + 26) & (0x46 ^ 0x20 ^ (0x9A ^ 0xB1) ^ -1)) != 0) {
                                        return ((55 + 200 - 170 + 129 ^ 28 + 7 - -39 + 67) & (0x61 ^ 0x21 ^ (0x30 ^ 0x2B) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lIIIllllIIIII[0];
                                }
                                return bl;
                            }, (int)lIIIllllIIIII[8]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (i.lIlIIlIlIIllIlI(Players.getLocal().getAnimation(), lIIIllllIIIII[27])) {
                                bl = lIIIllllIIIII[1];
                                0;
                                if (1 <= 0) {
                                    return ((0x42 ^ 0x1C) & ~(0x9D ^ 0xC3)) != 0;
                                }
                            } else {
                                bl = lIIIllllIIIII[0];
                            }
                            return bl;
                        }, (int)lIIIllllIIIII[39]);
                        0;
                    }
                }
            }
        }
    }

    private static String lIlIIlIIlllIIll(String lllllllllllllllIIIIIlIIIIllIIllI, String lllllllllllllllIIIIIlIIIIllIIIll) {
        try {
            SecretKeySpec lllllllllllllllIIIIIlIIIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIlIIIIllIIIll.getBytes(StandardCharsets.UTF_8)), lIIIllllIIIII[29]), "DES");
            Cipher lllllllllllllllIIIIIlIIIIllIlIII = Cipher.getInstance("DES");
            lllllllllllllllIIIIIlIIIIllIlIII.init(lIIIllllIIIII[2], lllllllllllllllIIIIIlIIIIllIlIIl);
            return new String(lllllllllllllllIIIIIlIIIIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIlIIIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIIlIIIIllIIlll) {
            lllllllllllllllIIIIIlIIIIllIIlll.printStackTrace();
            return null;
        }
    }

    @Override
    public String Z() {
        return lIIIlllIllIll[lIIIllllIIIII[72]];
    }

    private static boolean lIlIIlIlIIlIlll(Object object) {
        return object != null;
    }

    private static void W() {
        d lllllllllllllllIIIIIlIIIlIIlIIII;
        Object lllllllllllllllIIIIIlIIIlIIlIIIl;
        if (i.lIlIIlIlIIlIlIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) {
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lIIIllllIIIII[14], lIIIllllIIIII[57], lIIIllllIIIII[58]);
                bA.add(d2);
                0;
            }
            int[] nArray2 = new int[lIIIllllIIIII[1]];
            nArray2[i.lIIIllllIIIII[0]] = lIIIllllIIIII[7];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[7], lIIIllllIIIII[59], lIIIllllIIIII[24]);
                bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                0;
            }
            int[] nArray3 = new int[lIIIllllIIIII[1]];
            nArray3[i.lIIIllllIIIII[0]] = lIIIllllIIIII[9];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[9], lIIIllllIIIII[60], lIIIllllIIIII[24]);
                bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                0;
            }
            int[] nArray4 = new int[lIIIllllIIIII[1]];
            nArray4[i.lIIIllllIIIII[0]] = lIIIllllIIIII[11];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[11], lIIIllllIIIII[61], lIIIllllIIIII[24]);
                bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                0;
            }
            int[] nArray5 = new int[lIIIllllIIIII[1]];
            nArray5[i.lIIIllllIIIII[0]] = lIIIllllIIIII[12];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[12], lIIIllllIIIII[4], lIIIllllIIIII[24]);
                bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                0;
            }
            int[] nArray6 = new int[lIIIllllIIIII[1]];
            nArray6[i.lIIIllllIIIII[0]] = lIIIllllIIIII[44];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[44], lIIIllllIIIII[1], e.c(lIIIllllIIIII[62], lIIIllllIIIII[63]));
                bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                0;
            }
        }
        if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[6])) {
            int[] nArray = new int[lIIIllllIIIII[1]];
            nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lIIIllllIIIII[1]];
                nArray7[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                if (i.lIlIIlIlIIlIlIl(Bank.getFirst((int[])nArray7).getQuantity(), lIIIllllIIIII[61])) {
                    int[] nArray8 = new int[lIIIllllIIIII[1]];
                    nArray8[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
                    lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[22], lIIIllllIIIII[61] - Bank.getFirst((int[])nArray8).getQuantity(), lIIIllllIIIII[64]);
                    bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                    0;
                }
            }
            int[] nArray9 = new int[lIIIllllIIIII[1]];
            nArray9[i.lIIIllllIIIII[0]] = lIIIllllIIIII[22];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[22], lIIIllllIIIII[61], lIIIllllIIIII[64]);
                bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                0;
            }
            int[] nArray10 = new int[lIIIllllIIIII[1]];
            nArray10[i.lIIIllllIIIII[0]] = lIIIllllIIIII[23];
            if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lIIIllllIIIII[1]];
                nArray11[i.lIIIllllIIIII[0]] = lIIIllllIIIII[23];
                if (i.lIlIIlIlIIlIlIl(Bank.getFirst((int[])nArray11).getQuantity(), lIIIllllIIIII[61])) {
                    int[] nArray12 = new int[lIIIllllIIIII[1]];
                    nArray12[i.lIIIllllIIIII[0]] = lIIIllllIIIII[23];
                    lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[23], lIIIllllIIIII[61] - Bank.getFirst((int[])nArray12).getQuantity(), lIIIllllIIIII[65]);
                    bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                    0;
                }
            }
            int[] nArray13 = new int[lIIIllllIIIII[1]];
            nArray13[i.lIIIllllIIIII[0]] = lIIIllllIIIII[23];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[23], lIIIllllIIIII[61], lIIIllllIIIII[65]);
                bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                0;
            }
            int[] nArray14 = new int[lIIIllllIIIII[1]];
            nArray14[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
            if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lIIIllllIIIII[1]];
                nArray15[i.lIIIllllIIIII[0]] = lIIIllllIIIII[20];
                if (i.lIlIIlIlIIlIllI(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[20], lIIIllllIIIII[1], lIIIllllIIIII[66]);
                    bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                    0;
                }
            }
            if (i.lIlIIlIlIIlIlII(bz ? 1 : 0)) {
                int[] nArray16 = new int[lIIIllllIIIII[1]];
                nArray16[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lIIIllllIIIII[1]];
                    nArray17[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                    if (i.lIlIIlIlIIlIlIl(Bank.getFirst((int[])nArray17).getQuantity(), lIIIllllIIIII[61])) {
                        int[] nArray18 = new int[lIIIllllIIIII[1]];
                        nArray18[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                        lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[14], lIIIllllIIIII[61] - Bank.getFirst((int[])nArray18).getQuantity(), lIIIllllIIIII[58]);
                        bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                        0;
                    }
                }
                int[] nArray19 = new int[lIIIllllIIIII[1]];
                nArray19[i.lIIIllllIIIII[0]] = lIIIllllIIIII[14];
                if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[14], lIIIllllIIIII[61], lIIIllllIIIII[58]);
                    bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                    0;
                }
                int[] nArray20 = new int[lIIIllllIIIII[1]];
                nArray20[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                if (i.lIlIIlIlIIlIlII(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lIIIllllIIIII[1]];
                    nArray21[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                    if (i.lIlIIlIlIIlIlIl(Bank.getFirst((int[])nArray21).getQuantity(), lIIIllllIIIII[66])) {
                        int[] nArray22 = new int[lIIIllllIIIII[1]];
                        nArray22[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                        lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[21], lIIIllllIIIII[66] - Bank.getFirst((int[])nArray22).getQuantity(), lIIIllllIIIII[24]);
                        bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                        0;
                    }
                }
                int[] nArray23 = new int[lIIIllllIIIII[1]];
                nArray23[i.lIIIllllIIIII[0]] = lIIIllllIIIII[21];
                if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[21], lIIIllllIIIII[66], lIIIllllIIIII[24]);
                    bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
                    0;
                }
            }
        }
        int[] nArray = new int[lIIIllllIIIII[1]];
        nArray[i.lIIIllllIIIII[0]] = lIIIllllIIIII[18];
        if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray) ? 1 : 0)) {
            lllllllllllllllIIIIIlIIIlIIlIIIl = new d(lIIIllllIIIII[18], lIIIllllIIIII[67], lIIIllllIIIII[37]);
            bA.add((d)lllllllllllllllIIIIIlIIIlIIlIIIl);
            0;
        }
        if (i.lIlIIlIlIIlIllI(Bank.contains(lllllllllllllllIIIIIlIIIlIIlIIIl = item -> item.getName().toLowerCase().contains(lIIIlllIllIll[lIIIllllIIIII[74]])) ? 1 : 0)) {
            lllllllllllllllIIIIIlIIIlIIlIIII = new d(lIIIllllIIIII[68], lIIIllllIIIII[17], lIIIllllIIIII[69]);
            bA.add(lllllllllllllllIIIIIlIIIlIIlIIII);
            0;
        }
        int[] nArray24 = new int[lIIIllllIIIII[1]];
        nArray24[i.lIIIllllIIIII[0]] = lIIIllllIIIII[70];
        if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lllllllllllllllIIIIIlIIIlIIlIIII = new d(lIIIllllIIIII[70], lIIIllllIIIII[32], lIIIllllIIIII[71]);
            bA.add(lllllllllllllllIIIIIlIIIlIIlIIII);
            0;
        }
        int[] nArray25 = new int[lIIIllllIIIII[1]];
        nArray25[i.lIIIllllIIIII[0]] = lIIIllllIIIII[16];
        if (i.lIlIIlIlIIlIllI(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lllllllllllllllIIIIIlIIIlIIlIIII = new d(lIIIllllIIIII[16], lIIIllllIIIII[32], lIIIllllIIIII[71]);
            bA.add(lllllllllllllllIIIIIlIIIlIIlIIII);
            0;
        }
    }

    @Override
    public boolean X() {
        return lIIIllllIIIII[0];
    }

    private static boolean lIlIIlIlIIlIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIlIlIIllIII(int n2) {
        return n2 > 0;
    }

    private static void lIlIIlIlIIlIIlI() {
        lIIIlllIllIll = new String[lIIIllllIIIII[25]];
        i.lIIIlllIllIll[i.lIIIllllIIIII[0]] = i."Buying items";
        i.lIIIlllIllIll[i.lIIIllllIIIII[1]] = i."Finished buying items, switching back to magic training";
        i.lIIIlllIllIll[i.lIIIllllIIIII[2]] = i."Navigating to bank";
        i.lIIIlllIllIll[i.lIIIllllIIIII[3]] = i."Handling banking";
        i.lIIIlllIllIll[i.lIIIllllIIIII[5]] = i."We are missing supplies, switching to BUYING";
        i.lIIIlllIllIll[i.lIIIllllIIIII[17]] = i."Nav to cows";
        i.lIIIlllIllIll[i.lIIIllllIIIII[24]] = i."Attacking cows";
        i.lIIIlllIllIll[i.lIIIllllIIIII[26]] = i."Casting varrock tele";
        i.lIIIlllIllIll[i.lIIIllllIIIII[29]] = i."Casting lumby tele";
        i.lIIIlllIllIll[i.lIIIllllIIIII[31]] = i."Casting fally tele";
        i.lIIIlllIllIll[i.lIIIllllIIIII[32]] = i."Casting cammy tele";
        i.lIIIlllIllIll[i.lIIIllllIIIII[33]] = i."Alching";
        i.lIIIlllIllIll[i.lIIIllllIIIII[34]] = i."Wield";
        i.lIIIlllIllIll[i.lIIIllllIIIII[36]] = i."Move to alch spot";
        i.lIIIlllIllIll[i.lIIIllllIIIII[40]] = i."Nav to cows";
        i.lIIIlllIllIll[i.lIIIllllIIIII[41]] = i."Eat";
        i.lIIIlllIllIll[i.lIIIllllIIIII[42]] = i."Cow";
        i.lIIIlllIllIll[i.lIIIllllIIIII[43]] = i."cow";
        i.lIIIlllIllIll[i.lIIIllllIIIII[45]] = i."Attacking cows";
        i.lIIIlllIllIll[i.lIIIllllIIIII[46]] = i."Attack";
        i.lIIIlllIllIll[i.lIIIllllIIIII[47]] = i."In combat";
        i.lIIIlllIllIll[i.lIIIllllIIIII[51]] = i."Opening autocast";
        i.lIIIlllIllIll[i.lIIIllllIIIII[52]] = i."Choose spell";
        i.lIIIlllIllIll[i.lIIIllllIIIII[54]] = i."Wind Strike";
        i.lIIIlllIllIll[i.lIIIllllIIIII[55]] = i."Water Strike";
        i.lIIIlllIllIll[i.lIIIllllIIIII[19]] = i."Earth Strike";
        i.lIIIlllIllIll[i.lIIIllllIIIII[50]] = i."Earth Strike";
        i.lIIIlllIllIll[i.lIIIllllIIIII[56]] = i."Fire Strike";
        i.lIIIlllIllIll[i.lIIIllllIIIII[72]] = i."Magic training";
        i.lIIIlllIllIll[i.lIIIllllIIIII[74]] = i."ring of wealth (";
        i.lIIIlllIllIll[i.lIIIllllIIIII[75]] = i."Cow";
    }

    @Override
    public boolean aa() {
        boolean bl;
        if (i.lIlIIlIlIIllIIl(Skills.getLevel((Skill)Skill.MAGIC), lIIIllllIIIII[73])) {
            bl = lIIIllllIIIII[1];
            0;
            if ((0x79 ^ 0x7C) == 0) {
                return ((0x2D ^ 0x36) & ~(0x88 ^ 0x93)) != 0;
            }
        } else {
            bl = lIIIllllIIIII[0];
        }
        return bl;
    }

    public static void Q() {
        if (i.lIlIIlIlIIlIlII(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (i.lIlIIlIlIIlIllI(bB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRat.c = lIIIlllIllIll[lIIIllllIIIII[40]];
            Movement.walkTo((WorldPoint)bC);
            0;
            Time.sleepTicks((int)lIIIllllIIIII[1]);
            0;
        }
        if (i.lIlIIlIlIIlIlII(bB.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            i.R();
        }
    }

    @Override
    public int Y() {
        try {
            i.P();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-1 == (0xC2 ^ 0xC6)) {
            return (0xB9 ^ 0x85) & ~(0x61 ^ 0x5D);
        }
        return lIIIllllIIIII[67];
    }

    static {
        i.lIlIIlIlIIlIIll();
        i.lIlIIlIlIIlIIlI();
        bA = new ArrayList<d>();
        bB = new WorldArea(lIIIllllIIIII[76], lIIIllllIIIII[77], lIIIllllIIIII[47], lIIIllllIIIII[40], lIIIllllIIIII[0]);
        bC = new WorldPoint(lIIIllllIIIII[78], lIIIllllIIIII[79], lIIIllllIIIII[0]);
        bD = new WorldPoint(lIIIllllIIIII[80] + e.c(lIIIllllIIIII[1], lIIIllllIIIII[5]), lIIIllllIIIII[81], lIIIllllIIIII[0]);
    }

    private static boolean lIlIIlIlIIllllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlIIlIlIIlIlII(int n2) {
        return n2 != 0;
    }

    private static int lIlIIlIlIIllIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }
}

