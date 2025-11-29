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
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.u;
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

public class J
implements F {
    static /* synthetic */ WorldArea bC;
    static /* synthetic */ WorldPoint bD;
    public static /* synthetic */ boolean bA;
    public static /* synthetic */ boolean bz;
    public static /* synthetic */ List<d> bB;
    private static /* synthetic */ int[] lllIIIIl;
    private static /* synthetic */ String[] llIllllI;
    static /* synthetic */ WorldPoint bE;

    private static String lIllIlllllI(String lIlIIIlIIlIllIl, String lIlIIIlIIlIlIlI) {
        try {
            SecretKeySpec lIlIIIlIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIIIlIIlIllll = Cipher.getInstance("Blowfish");
            lIlIIIlIIlIllll.init(lllIIIIl[3], lIlIIIlIIllIIII);
            return new String(lIlIIIlIIlIllll.doFinal(Base64.getDecoder().decode(lIlIIIlIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIlIIlIlllI) {
            lIlIIIlIIlIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllIllIlI(Object object) {
        return object == null;
    }

    private static boolean lIlllIlllII(int n2) {
        return n2 < 0;
    }

    @Override
    public String V() {
        return llIllllI[lllIIIIl[74]];
    }

    @Override
    public boolean W() {
        boolean bl;
        if (J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[2])) {
            bl = lllIIIIl[1];
            0;
            if (((0xD2 ^ 0x8D) & ~(0x18 ^ 0x47)) != 0) {
                return false;
            }
        } else {
            bl = lllIIIIl[0];
        }
        return bl;
    }

    @Override
    public int U() {
        try {
            J.Z();
            0;
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (2 <= 0) {
            return (16 + 151 - -6 + 15 ^ 124 + 31 - 50 + 68) & (0x41 ^ 0x37 ^ (0xFE ^ 0x99) ^ -1);
        }
        return lllIIIIl[69];
    }

    public static boolean ae() {
        if (J.lIlllIllIIl(Vars.getBit((int)lllIIIIl[50]), lllIIIIl[1]) && J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[19])) {
            return lllIIIIl[1];
        }
        if (J.lIlllIllIIl(Vars.getBit((int)lllIIIIl[50]), lllIIIIl[3]) && J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[32]) && J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[19])) {
            return lllIIIIl[1];
        }
        if (J.lIlllIllIIl(Vars.getBit((int)lllIIIIl[50]), lllIIIIl[4]) && J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[32]) && J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[39])) {
            return lllIIIIl[1];
        }
        if (J.lIlllIllIIl(Vars.getBit((int)lllIIIIl[50]), lllIIIIl[4]) && J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[32])) {
            int[] nArray = new int[lllIIIIl[1]];
            nArray[J.lllIIIIl[0]] = lllIIIIl[14];
            if (J.lIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lllIIIIl[1];
            }
        }
        if (J.lIlllIllIIl(Vars.getBit((int)lllIIIIl[50]), lllIIIIl[7]) && J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[39])) {
            int[] nArray = new int[lllIIIIl[1]];
            nArray[J.lllIIIIl[0]] = lllIIIIl[14];
            if (J.lIlllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                return lllIIIIl[1];
            }
        }
        return lllIIIIl[0];
    }

    private static boolean lIlllIllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIllIllllIl(String lIlIIIlIlIlIIlI, String lIlIIIlIlIIllll) {
        try {
            SecretKeySpec lIlIIIlIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIlIlIIllll.getBytes(StandardCharsets.UTF_8)), lllIIIIl[30]), "DES");
            Cipher lIlIIIlIlIlIlII = Cipher.getInstance("DES");
            lIlIIIlIlIlIlII.init(lllIIIIl[3], lIlIIIlIlIlIlIl);
            return new String(lIlIIIlIlIlIlII.doFinal(Base64.getDecoder().decode(lIlIIIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIlIlIlIIll) {
            lIlIIIlIlIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlllIlIlll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlllIlIllI(Object object) {
        return object != null;
    }

    private static void lIlllIIIIll() {
        llIllllI = new String[lllIIIIl[81]];
        J.llIllllI[J.lllIIIIl[0]] = J."Buying items";
        J.llIllllI[J.lllIIIIl[1]] = J."Finished buying items, switching back to magic training";
        J.llIllllI[J.lllIIIIl[3]] = J."Navigating to bank";
        J.llIllllI[J.lllIIIIl[4]] = J."Handling banking";
        J.llIllllI[J.lllIIIIl[7]] = J."We are missing supplies, switching to BUYING";
        J.llIllllI[J.lllIIIIl[19]] = J."Nav to cows";
        J.llIllllI[J.lllIIIIl[6]] = J."Attacking cows";
        J.llIllllI[J.lllIIIIl[27]] = J."Casting varrock tele";
        J.llIllllI[J.lllIIIIl[30]] = J."Casting lumby tele";
        J.llIllllI[J.lllIIIIl[32]] = J."Casting fally tele";
        J.llIllllI[J.lllIIIIl[33]] = J."Casting cammy tele";
        J.llIllllI[J.lllIIIIl[34]] = J."Alching";
        J.llIllllI[J.lllIIIIl[37]] = J."Wield";
        J.llIllllI[J.lllIIIIl[39]] = J."Move to alch spot";
        J.llIllllI[J.lllIIIIl[43]] = J."Nav to cows";
        J.llIllllI[J.lllIIIIl[44]] = J."Attacking cows";
        J.llIllllI[J.lllIIIIl[45]] = J."Eat";
        J.llIllllI[J.lllIIIIl[46]] = J."Cow";
        J.llIllllI[J.lllIIIIl[47]] = J."cow";
        J.llIllllI[J.lllIIIIl[49]] = J."Attack";
        J.llIllllI[J.lllIIIIl[53]] = J."Opening autocast";
        J.llIllllI[J.lllIIIIl[54]] = J."Choose spell";
        J.llIllllI[J.lllIIIIl[56]] = J."Wind Strike";
        J.llIllllI[J.lllIIIIl[57]] = J."Water Strike";
        J.llIllllI[J.lllIIIIl[58]] = J."Earth Strike";
        J.llIllllI[J.lllIIIIl[21]] = J."Earth Strike";
        J.llIllllI[J.lllIIIIl[52]] = J."Fire Strike";
        J.llIllllI[J.lllIIIIl[74]] = J."Magic training";
        J.llIllllI[J.lllIIIIl[75]] = J."ring of wealth (";
        J.llIllllI[J.lllIIIIl[76]] = J."Cow";
    }

    private static String lIlllIIIIIl(String lIlIIIlIIllllIl, String lIlIIIlIIllllII) {
        lIlIIIlIIllllIl = new String(Base64.getDecoder().decode(lIlIIIlIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIIlIlIIIIII = new StringBuilder();
        char[] lIlIIIlIIllllll = lIlIIIlIIllllII.toCharArray();
        int lIlIIIlIIlllllI = lllIIIIl[0];
        char[] lIlIIIlIIlllIII = lIlIIIlIIllllIl.toCharArray();
        int lIlIIIlIIllIlll = lIlIIIlIIlllIII.length;
        int lIlIIIlIIllIllI = lllIIIIl[0];
        while (J.lIlllIlIlII(lIlIIIlIIllIllI, lIlIIIlIIllIlll)) {
            char lIlIIIlIlIIIIll = lIlIIIlIIlllIII[lIlIIIlIIllIllI];
            lIlIIIlIlIIIIII.append((char)(lIlIIIlIlIIIIll ^ lIlIIIlIIllllll[lIlIIIlIIlllllI % lIlIIIlIIllllll.length]));
            0;
            ++lIlIIIlIIlllllI;
            ++lIlIIIlIIllIllI;
            0;
            if (((0x51 ^ 0xD) & ~(0xD ^ 0x51)) < 1) continue;
            return null;
        }
        return String.valueOf(lIlIIIlIlIIIIII);
    }

    private static boolean lIlllIlllIl(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIlllIllllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void ab() {
        if (J.lIlllIlllII(J.lIlllIllIll(e.v(), 30.0))) {
            int[] nArray = new int[lllIIIIl[1]];
            nArray[J.lllIIIIl[0]] = lllIIIIl[20];
            if (J.lIlllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lllIIIIl[1]];
                nArray2[J.lllIIIIl[0]] = lllIIIIl[20];
                Inventory.getFirst((int[])nArray2).interact(llIllllI[lllIIIIl[45]]);
                Time.sleepTicks((int)lllIIIIl[1]);
                0;
            }
        }
        if (J.lIlllIllIlI(Players.getLocal().getInteracting())) {
            NPC lIlIIIlIllIlIIl = NPCs.getNearest(nPC -> {
                int n2;
                if (J.lIlllIlIIll(nPC.getName().contains(llIllllI[lllIIIIl[76]]) ? 1 : 0) && J.lIlllIlIlIl(nPC.isDead() ? 1 : 0)) {
                    n2 = lllIIIIl[1];
                    0;
                    if (2 >= (0xD5 ^ 0x83 ^ (0x5A ^ 8))) {
                        return ((1 ^ 0x7D ^ (0x65 ^ 0x4C)) & (0x2B ^ 0x1F ^ (0x78 ^ 0x19) ^ -1)) != 0;
                    }
                } else {
                    n2 = lllIIIIl[0];
                }
                return n2 != 0;
            });
            String[] stringArray = new String[lllIIIIl[3]];
            stringArray[J.lllIIIIl[0]] = llIllllI[lllIIIIl[46]];
            stringArray[J.lllIIIIl[1]] = llIllllI[lllIIIIl[47]];
            List lIlIIIlIllIlIII = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                boolean bl;
                if (J.lIlllIlllIl(nPC.getInteracting(), Players.getLocal())) {
                    bl = lllIIIIl[1];
                    0;
                    if (((43 + 0 - -20 + 138 ^ 85 + 27 - 4 + 37) & (67 + 133 - 67 + 110 ^ 90 + 136 - 111 + 56 ^ -1)) != 0) {
                        return ((0x38 ^ 0x79 ^ (0x4A ^ 0x56)) & (0x36 ^ 0x79 ^ (0xAC ^ 0xBE) ^ -1)) != 0;
                    }
                } else {
                    bl = lllIIIIl[0];
                }
                return bl;
            }).collect(Collectors.toList());
            int[] nArray = new int[lllIIIIl[1]];
            nArray[J.lllIIIIl[0]] = lllIIIIl[48];
            if (J.lIlllIlIIll(Equipment.contains((int[])nArray) ? 1 : 0) && J.lIlllIlIlIl(J.ae() ? 1 : 0)) {
                J.af();
            }
            if (J.lIlllIlIllI(lIlIIIlIllIlIIl) && J.lIlllIlIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
                lIlIIIlIllIlIIl.interact(llIllllI[lllIIIIl[49]]);
                Time.sleepTicks((int)lllIIIIl[4]);
                0;
            }
        }
    }

    private static int lIlllIllIll(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIlllIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIlllIlIIlI() {
        lllIIIIl = new int[82];
        J.lllIIIIl[0] = (0x95 ^ 0xB8) & ~(0x64 ^ 0x49);
        J.lllIIIIl[1] = 1;
        J.lllIIIIl[2] = 0x2A ^ 0x61;
        J.lllIIIIl[3] = 2;
        J.lllIIIIl[4] = 3;
        J.lllIIIIl[5] = 0xFFFFF7CE & 0x1BB9;
        J.lllIIIIl[6] = 0xD ^ 0xB;
        J.lllIIIIl[7] = 0x85 ^ 0x81;
        J.lllIIIIl[8] = 40 + 50 - -23 + 43 ^ 143 + 139 - 162 + 51;
        J.lllIIIIl[9] = -(0xFFFFF5F7 & 0x1F99) & (0xFFFFF7FF & 0x1FBE);
        J.lllIIIIl[10] = 0xFFFFB7DC & 0x4DFF;
        J.lllIIIIl[11] = 0xFFFFDA3F & 0x27EB;
        J.lllIIIIl[12] = 0xFFFF9FEF & 0x69D4;
        J.lllIIIIl[13] = 0xFFFFA3FF & 0x5E2D;
        J.lllIIIIl[14] = -(0xFFFFF5D5 & 0x5E3F) & (0xFFFFFE3E & 0x57FF);
        J.lllIIIIl[15] = 0xFFFFF7F5 & 0x199E;
        J.lllIIIIl[16] = -(0xFFFFF957 & 0x6FED) & (0xFFFFFF77 & 0x6BFF);
        J.lllIIIIl[17] = 0xFFFFB5D5 & 0x7B7B;
        J.lllIIIIl[18] = -(133 + 32 - 62 + 32) & (0xFFFFDFDF & 0x3FEF);
        J.lllIIIIl[19] = 51 + 96 - 22 + 6 ^ 78 + 45 - 39 + 50;
        J.lllIIIIl[20] = 0xFFFFFBFB & 0x57F;
        J.lllIIIIl[21] = 0x4F ^ 0x7C ^ (0x7E ^ 0x54);
        J.lllIIIIl[22] = -(0xFFFFBEEF & 0x4B95) & (0xFFFFBFEF & 0x4FFF);
        J.lllIIIIl[23] = 0xFFFFC6FE & 0x3B2D;
        J.lllIIIIl[24] = -(0xFFFFFC55 & 0x5FEB) & (0xFFFFFFF3 & 0x5E7D);
        J.lllIIIIl[25] = 0x52 ^ 0x6C;
        J.lllIIIIl[26] = 0xD7 ^ 0xAC ^ (0x5D ^ 0x39);
        J.lllIIIIl[27] = 0xB0 ^ 0x87 ^ (0x8F ^ 0xBF);
        J.lllIIIIl[28] = -1;
        J.lllIIIIl[29] = 0x81 ^ 0xA4;
        J.lllIIIIl[30] = 0x30 ^ 0x38;
        J.lllIIIIl[31] = 0x43 ^ 0x12 ^ (0xB ^ 0x77);
        J.lllIIIIl[32] = 0x72 ^ 0x7B;
        J.lllIIIIl[33] = 0xB4 ^ 0xBE;
        J.lllIIIIl[34] = 56 + 60 - -1 + 60 ^ 154 + 48 - 189 + 173;
        J.lllIIIIl[35] = 0xFFFFDDFA & 0x2E5F;
        J.lllIIIIl[36] = -(0xFFFFEBE3 & 0x167D) & (0xFFFFCFFF & 0x3FFF);
        J.lllIIIIl[37] = 0x8F ^ 0xA3 ^ (1 ^ 0x21);
        J.lllIIIIl[38] = 0x3F ^ 0x2F ^ (0x8F ^ 0xA0);
        J.lllIIIIl[39] = 82 + 16 - 78 + 108 ^ 107 + 98 - 198 + 134;
        J.lllIIIIl[40] = -(0xFFFFECB7 & 0x7FCF) & (0xFFFFFFE6 & 0x6DDF);
        J.lllIIIIl[41] = -(0xFFFFCFEF & 0x79BD) & (0xFFFFCFFF & 0x7BBE);
        J.lllIIIIl[42] = 0xFFFF9FBE & 0x6DED;
        J.lllIIIIl[43] = 0x69 ^ 0x67;
        J.lllIIIIl[44] = 0xC8 ^ 0xC7;
        J.lllIIIIl[45] = 0x51 ^ 0x41;
        J.lllIIIIl[46] = 0x7E ^ 0xF ^ (8 ^ 0x68);
        J.lllIIIIl[47] = 0x1D ^ 0xF;
        J.lllIIIIl[48] = 0xFFFFAFED & 0x5577;
        J.lllIIIIl[49] = 0x40 ^ 0x53;
        J.lllIIIIl[50] = -(0xFFFFFABA & 0x5FCF) & (0xFFFFFFFD & 0x5B9F);
        J.lllIIIIl[51] = 0xFFFFDFDD & 0x2273;
        J.lllIIIIl[52] = 0x15 ^ 0xF;
        J.lllIIIIl[53] = 0x10 ^ 0x37 ^ (0x30 ^ 3);
        J.lllIIIIl[54] = 0x22 ^ 0x37;
        J.lllIIIIl[55] = (0xEE ^ 0x84) + (90 + 124 - 100 + 44) - (41 + 45 - -21 + 66) + (0x7C ^ 0x12);
        J.lllIIIIl[56] = 0xBC ^ 0xAA;
        J.lllIIIIl[57] = 18 + 67 - 78 + 126 ^ 93 + 65 - 75 + 63;
        J.lllIIIIl[58] = 0x84 ^ 0x97 ^ (0xE ^ 5);
        J.lllIIIIl[59] = -(0xFFFFFD1F & 0x4AF2) & (0xFFFFEBFB & 0x5FFD);
        J.lllIIIIl[60] = (0xA0 ^ 0xB8) + (127 + 77 - 89 + 36) - (0x73 ^ 0x27) + (0x1C ^ 0x53);
        J.lllIIIIl[61] = -(0xFFFFD0DA & 0x7F7F) & (0xFFFFDFFF & 0x7FF9);
        J.lllIIIIl[62] = -(0xFFFFFFF2 & 0x782F) & (0xFFFFFFF5 & 0x7FFB);
        J.lllIIIIl[63] = 0xFFFFBFFE & 0x4BB9;
        J.lllIIIIl[64] = -(0xFFFFFFCF & 0x4939) & (0xFFFFFBDD & 0x7DFE);
        J.lllIIIIl[65] = -(0xFFFFFFBA & 0x177) & (0xFFFFFDBD & 0x3FFF);
        J.lllIIIIl[66] = 0x8C ^ 0xB6 ^ (0x63 ^ 0x21);
        J.lllIIIIl[67] = 127 + 0 - 83 + 106;
        J.lllIIIIl[68] = 0xFFFFFB99 & 0x3EFE;
        J.lllIIIIl[69] = 0x69 ^ 0xD;
        J.lllIIIIl[70] = -(0xB3 ^ 0x97) & (0xFFFFAEEF & Short.MAX_VALUE);
        J.lllIIIIl[71] = -(0xFFFFEC9D & 0x1767) & (0xFFFFEDBD & 0x77EE);
        J.lllIIIIl[72] = -(0xFFFFEF61 & 0x309F) & (0xFFFFBF47 & Short.MAX_VALUE);
        J.lllIIIIl[73] = -(0xFFFFFB7A & 0x2CEF) & (0xFFFFFFEF & 0x2BFD);
        J.lllIIIIl[74] = 0x86 ^ 0xA7 ^ (0x57 ^ 0x6D);
        J.lllIIIIl[75] = 0x15 ^ 9;
        J.lllIIIIl[76] = 0x1B ^ 6;
        J.lllIIIIl[77] = -(0xFFFFF4A5 & 0x7B5B) & (0xFFFFFFFE & 0x7BCF);
        J.lllIIIIl[78] = 0xFFFFAEEF & 0x5DF3;
        J.lllIIIIl[79] = 0xFFFFCBF7 & 0x3FDF;
        J.lllIIIIl[80] = 0xFFFFBEFF & 0x4DE9;
        J.lllIIIIl[81] = 0x67 ^ 0x79;
    }

    static {
        J.lIlllIlIIlI();
        J.lIlllIIIIll();
        bA = lllIIIIl[0];
        bB = new ArrayList<d>();
        bC = new WorldArea(lllIIIIl[77], lllIIIIl[78], lllIIIIl[53], lllIIIIl[43], lllIIIIl[0]);
        bD = new WorldPoint(lllIIIIl[79], lllIIIIl[80], lllIIIIl[0]);
        bE = null;
    }

    public static void Z() {
        if (J.lIlllIlIIll(bz ? 1 : 0)) {
            AccBuilderBarrows.c = llIllllI[lllIIIIl[0]];
            b.a(bB);
            if (J.lIlllIlIlII(bB.size(), lllIIIIl[1])) {
                System.out.println(llIllllI[lllIIIIl[1]]);
                bz = lllIIIIl[0];
            }
        }
        if (J.lIlllIlIlIl(bz ? 1 : 0) && J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[2])) {
            BankLocation lIlIIIlIllIlllI;
            if (J.lIlllIlIlIl(J.ac() ? 1 : 0)) {
                lIlIIIlIllIlllI = BankLocation.getNearest();
                if (J.lIlllIlIllI(lIlIIIlIllIlllI) && J.lIlllIlIlIl(lIlIIIlIllIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[3]];
                    a.a(lIlIIIlIllIlllI);
                }
                if (J.lIlllIlIllI(lIlIIIlIllIlllI) && J.lIlllIlIIll(lIlIIIlIllIlllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[4]];
                    if (J.lIlllIlIlIl(Bank.isOpen() ? 1 : 0)) {
                        a.a();
                        Time.sleepUntil(() -> Bank.isOpen(), (int)lllIIIIl[5]);
                        0;
                        Time.sleepTicks((int)lllIIIIl[6]);
                        0;
                    }
                    if (J.lIlllIlIIll(Bank.isOpen() ? 1 : 0)) {
                        if (J.lIlllIlIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks((int)lllIIIIl[7]);
                            0;
                        }
                        while (J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[8]) && J.lIlllIlIlIl(u.aV() ? 1 : 0)) {
                            u.aT();
                            Time.sleepTicks((int)lllIIIIl[1]);
                            0;
                            0;
                            if (-2 < 0) continue;
                            return;
                        }
                        if (J.lIlllIlIlIl(J.ad() ? 1 : 0)) {
                            J.ag();
                            System.out.println(llIllllI[lllIIIIl[7]]);
                            bz = lllIIIIl[1];
                            return;
                        }
                        if (J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[8])) {
                            int[] nArray = new int[lllIIIIl[1]];
                            nArray[J.lllIIIIl[0]] = lllIIIIl[9];
                            if (J.lIlllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                                int[] nArray2 = new int[lllIIIIl[1]];
                                nArray2[J.lllIIIIl[0]] = lllIIIIl[9];
                                if (J.lIlllIlIlII(Inventory.getCount((int[])nArray2), lllIIIIl[1])) {
                                    Bank.withdraw((int)lllIIIIl[9], (int)lllIIIIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIIIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIIIIl[1]];
                                        nArray[J.lllIIIIl[0]] = lllIIIIl[9];
                                        if (J.lIlllIlIlll(Inventory.getCount((int[])nArray))) {
                                            bl = lllIIIIl[1];
                                            0;
                                            if (2 == 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lllIIIIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIIIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray3 = new int[lllIIIIl[1]];
                            nArray3[J.lllIIIIl[0]] = lllIIIIl[11];
                            if (J.lIlllIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
                                int[] nArray4 = new int[lllIIIIl[1]];
                                nArray4[J.lllIIIIl[0]] = lllIIIIl[11];
                                if (J.lIlllIlIlII(Inventory.getCount((int[])nArray4), lllIIIIl[1])) {
                                    Bank.withdraw((int)lllIIIIl[11], (int)lllIIIIl[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIIIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIIIIl[1]];
                                        nArray[J.lllIIIIl[0]] = lllIIIIl[11];
                                        if (J.lIlllIlIlll(Inventory.getCount((int[])nArray))) {
                                            bl = lllIIIIl[1];
                                            0;
                                            if ((3 & ~3) >= 2) {
                                                return false;
                                            }
                                        } else {
                                            bl = lllIIIIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIIIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray5 = new int[lllIIIIl[1]];
                            nArray5[J.lllIIIIl[0]] = lllIIIIl[13];
                            if (J.lIlllIlIIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
                                int[] nArray6 = new int[lllIIIIl[1]];
                                nArray6[J.lllIIIIl[0]] = lllIIIIl[13];
                                if (J.lIlllIlIlII(Inventory.getCount((int[])nArray6), lllIIIIl[1])) {
                                    Bank.withdraw((int)lllIIIIl[13], (int)lllIIIIl[12], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIIIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIIIIl[1]];
                                        nArray[J.lllIIIIl[0]] = lllIIIIl[13];
                                        if (J.lIlllIlIlll(Inventory.getCount((int[])nArray))) {
                                            bl = lllIIIIl[1];
                                            0;
                                            if (1 != 1) {
                                                return ((0x87 ^ 0x8F ^ (0x47 ^ 0x1D)) & (0xDB ^ 0x8D ^ (0x5A ^ 0x5E) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lllIIIIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIIIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray7 = new int[lllIIIIl[1]];
                            nArray7[J.lllIIIIl[0]] = lllIIIIl[14];
                            if (J.lIlllIlIIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
                                int[] nArray8 = new int[lllIIIIl[1]];
                                nArray8[J.lllIIIIl[0]] = lllIIIIl[14];
                                if (J.lIlllIlIlII(Inventory.getCount((int[])nArray8), lllIIIIl[1])) {
                                    Bank.withdraw((int)lllIIIIl[14], (int)lllIIIIl[15], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIIIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIIIIl[1]];
                                        nArray[J.lllIIIIl[0]] = lllIIIIl[14];
                                        if (J.lIlllIlIlll(Inventory.getCount((int[])nArray))) {
                                            bl = lllIIIIl[1];
                                            0;
                                            if (((0x67 ^ 0x55 ^ (0x2A ^ 0x3D)) & (33 + 3 - -2 + 97 ^ 148 + 61 - 82 + 35 ^ -1)) != 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lllIIIIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIIIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray9 = new int[lllIIIIl[1]];
                            nArray9[J.lllIIIIl[0]] = lllIIIIl[16];
                            if (J.lIlllIlIIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
                                int[] nArray10 = new int[lllIIIIl[1]];
                                nArray10[J.lllIIIIl[0]] = lllIIIIl[16];
                                if (J.lIlllIlIlII(Inventory.getCount((int[])nArray10), lllIIIIl[1])) {
                                    Bank.withdraw((int)lllIIIIl[16], (int)lllIIIIl[10], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIIIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIIIIl[1]];
                                        nArray[J.lllIIIIl[0]] = lllIIIIl[16];
                                        if (J.lIlllIlIlll(Inventory.getCount((int[])nArray))) {
                                            bl = lllIIIIl[1];
                                            0;
                                            if (((0x2D ^ 0x2B) & ~(0x78 ^ 0x7E)) != 0) {
                                                return false;
                                            }
                                        } else {
                                            bl = lllIIIIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIIIIl[5]);
                                    0;
                                }
                            }
                            int[] nArray11 = new int[lllIIIIl[1]];
                            nArray11[J.lllIIIIl[0]] = lllIIIIl[17];
                            if (J.lIlllIlIIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
                                int[] nArray12 = new int[lllIIIIl[1]];
                                nArray12[J.lllIIIIl[0]] = lllIIIIl[17];
                                if (J.lIlllIlIlIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
                                    Bank.withdraw((int)lllIIIIl[17], (int)lllIIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIIIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        int[] nArray = new int[lllIIIIl[1]];
                                        nArray[J.lllIIIIl[0]] = lllIIIIl[17];
                                        return Inventory.contains((int[])nArray);
                                    }, (int)lllIIIIl[5]);
                                    0;
                                }
                            }
                            Bank.withdraw((int)lllIIIIl[18], (int)lllIIIIl[19], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                            int[] nArray13 = new int[lllIIIIl[1]];
                            nArray13[J.lllIIIIl[0]] = lllIIIIl[20];
                            if (J.lIlllIlIIll(Bank.contains((int[])nArray13) ? 1 : 0)) {
                                int[] nArray14 = new int[lllIIIIl[1]];
                                nArray14[J.lllIIIIl[0]] = lllIIIIl[20];
                                if (J.lIlllIlIlII(Inventory.getCount((int[])nArray14), lllIIIIl[1]) && J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[21])) {
                                    Bank.withdrawAll((int)lllIIIIl[20], (Bank.WithdrawMode)Bank.WithdrawMode.DEFAULT);
                                    Time.sleepTicks((int)lllIIIIl[1]);
                                    0;
                                    Time.sleepUntil(() -> {
                                        boolean bl;
                                        int[] nArray = new int[lllIIIIl[1]];
                                        nArray[J.lllIIIIl[0]] = lllIIIIl[20];
                                        if (J.lIlllIlIlll(Inventory.getCount((int[])nArray))) {
                                            bl = lllIIIIl[1];
                                            0;
                                            if (1 != 1) {
                                                return ((0x1C ^ 0x11 ^ (0x11 ^ 0x3E)) & (0x3E ^ 0x43 ^ (0xE3 ^ 0xBC) ^ -1)) != 0;
                                            }
                                        } else {
                                            bl = lllIIIIl[0];
                                        }
                                        return bl;
                                    }, (int)lllIIIIl[5]);
                                    0;
                                }
                            }
                        }
                        if (J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[8])) {
                            int[] nArray = new int[lllIIIIl[1]];
                            nArray[J.lllIIIIl[0]] = lllIIIIl[22];
                            if (J.lIlllIlIlIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                                Bank.withdraw((int)lllIIIIl[22], (int)lllIIIIl[1], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lllIIIIl[1]);
                                0;
                            }
                            if (J.lIlllIlIIll(bA ? 1 : 0)) {
                                Bank.withdrawAll((int)lllIIIIl[23], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lllIIIIl[1]);
                                0;
                                Bank.withdrawAll((int)lllIIIIl[16], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                                Time.sleepTicks((int)lllIIIIl[1]);
                                0;
                            }
                            Time.sleepTicks((int)lllIIIIl[4]);
                            0;
                            Bank.withdrawAll((int)lllIIIIl[24], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
                            Time.sleepTicks((int)lllIIIIl[1]);
                            0;
                            Bank.withdrawAll((int)lllIIIIl[25], (Bank.WithdrawMode)Bank.WithdrawMode.NOTED);
                            Time.sleepTicks((int)lllIIIIl[1]);
                            0;
                        }
                    }
                }
            }
            if (J.lIlllIlIIll(J.ac() ? 1 : 0)) {
                if (J.lIlllIlIIll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[21])) {
                    if (J.lIlllIlIlIl(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIllllI[lllIIIIl[19]];
                        Movement.walkTo((WorldPoint)bD);
                        0;
                        Time.sleepTicks((int)lllIIIIl[1]);
                        0;
                    }
                    if (J.lIlllIlIIll(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llIllllI[lllIIIIl[6]];
                        J.ab();
                    }
                }
                if (J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[21]) && J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[26])) {
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[27]];
                    if (J.lIlllIllIIl(Players.getLocal().getAnimation(), lllIIIIl[28])) {
                        Magic.cast((Spell)SpellBook.Standard.VARROCK_TELEPORT);
                        Time.sleepTicks((int)lllIIIIl[1]);
                        0;
                    }
                }
                if (J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[26]) && J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[29])) {
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[30]];
                    if (J.lIlllIllIIl(Players.getLocal().getAnimation(), lllIIIIl[28])) {
                        Magic.cast((Spell)SpellBook.Standard.LUMBRIDGE_TELEPORT);
                        Time.sleepTicks((int)lllIIIIl[1]);
                        0;
                    }
                }
                if (J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[29]) && J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[31])) {
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[32]];
                    if (J.lIlllIllIIl(Players.getLocal().getAnimation(), lllIIIIl[28])) {
                        Magic.cast((Spell)SpellBook.Standard.FALADOR_TELEPORT);
                        Time.sleepTicks((int)lllIIIIl[1]);
                        0;
                    }
                }
                if (J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[31]) && J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[8])) {
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[33]];
                    if (J.lIlllIllIIl(Players.getLocal().getAnimation(), lllIIIIl[28])) {
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepTicks((int)lllIIIIl[1]);
                        0;
                    }
                }
                if (J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[8])) {
                    int lIlIIIlIllIllII;
                    AccBuilderBarrows.c = llIllllI[lllIIIIl[34]];
                    if (J.lIlllIllIlI(bE)) {
                        bE = new WorldPoint(lllIIIIl[35] + e.c(lllIIIIl[1], lllIIIIl[7]), lllIIIIl[36], lllIIIIl[0]);
                    }
                    int[] nArray = new int[lllIIIIl[1]];
                    nArray[J.lllIIIIl[0]] = lllIIIIl[22];
                    if (J.lIlllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray15 = new int[lllIIIIl[1]];
                        nArray15[J.lllIIIIl[0]] = lllIIIIl[22];
                        if (J.lIlllIlIlIl(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                            int[] nArray16 = new int[lllIIIIl[1]];
                            nArray16[J.lllIIIIl[0]] = lllIIIIl[22];
                            Inventory.getFirst((int[])nArray16).interact(llIllllI[lllIIIIl[37]]);
                            Time.sleepTicks((int)lllIIIIl[1]);
                            0;
                        }
                    }
                    if (J.lIlllIlIIll(GrandExchange.isOpen() ? 1 : 0)) {
                        b.g();
                    }
                    int[] nArray17 = new int[lllIIIIl[1]];
                    nArray17[J.lllIIIIl[0]] = lllIIIIl[24];
                    lIlIIIlIllIlllI = Inventory.getFirst((int[])nArray17);
                    int[] nArray18 = new int[lllIIIIl[1]];
                    nArray18[J.lllIIIIl[0]] = lllIIIIl[38];
                    Item lIlIIIlIllIllIl = Inventory.getFirst((int[])nArray18);
                    if (J.lIlllIlIlIl(bA ? 1 : 0) && J.lIlllIlIllI(bE)) {
                        if (J.lIlllIlIlIl(Players.getLocal().getWorldLocation().equals((Object)bE) ? 1 : 0)) {
                            AccBuilderBarrows.c = llIllllI[lllIIIIl[39]];
                            Movement.walkTo((WorldPoint)bE);
                            0;
                            Time.sleepTicks((int)lllIIIIl[1]);
                            0;
                        }
                        if (J.lIlllIlIIll(Players.getLocal().getWorldLocation().equals((Object)bE) ? 1 : 0) && J.lIlllIlIllI(lIlIIIlIllIlllI) && J.lIlllIlIllI(lIlIIIlIllIllIl)) {
                            lIlIIIlIllIllII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIlIIIlIllIllIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (J.lIlllIllllI(Skills.getExperience((Skill)Skill.MAGIC), lIlIIIlIllIllII)) {
                                    bl = lllIIIIl[1];
                                    0;
                                    if (-1 > 3) {
                                        return false;
                                    }
                                } else {
                                    bl = lllIIIIl[0];
                                }
                                return bl;
                            }, (int)lllIIIIl[10]);
                            0;
                            Time.sleep((long)e.c(lllIIIIl[40], lllIIIIl[41]));
                            0;
                        }
                    }
                    if (J.lIlllIlIIll(bA ? 1 : 0)) {
                        if (J.lIlllIlIllI(lIlIIIlIllIlllI) && J.lIlllIlIllI(lIlIIIlIllIllIl) && J.lIlllIllIIl(Players.getLocal().getAnimation(), lllIIIIl[28])) {
                            lIlIIIlIllIllII = Skills.getExperience((Skill)Skill.MAGIC);
                            Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY, (Item)lIlIIIlIllIllIl);
                            Time.sleepUntil(() -> {
                                boolean bl;
                                if (J.lIlllIllllI(Skills.getExperience((Skill)Skill.MAGIC), lIlIIIlIllIllII)) {
                                    bl = lllIIIIl[1];
                                    0;
                                    if (((0x12 ^ 0x29 ^ (0x2D ^ 0x33)) & (45 + 106 - 75 + 66 ^ 23 + 110 - 96 + 134 ^ -1)) == (0x3A ^ 0x30 ^ (0x16 ^ 0x18))) {
                                        return ((150 + 78 - 119 + 65 ^ 111 + 47 - 14 + 27) & (0x53 ^ 2 ^ (0x6B ^ 0x3F) ^ -1)) != 0;
                                    }
                                } else {
                                    bl = lllIIIIl[0];
                                }
                                return bl;
                            }, (int)lllIIIIl[10]);
                            0;
                        }
                        Magic.cast((Spell)SpellBook.Standard.CAMELOT_TELEPORT);
                        Time.sleepUntil(() -> {
                            boolean bl;
                            if (J.lIlllIllIIl(Players.getLocal().getAnimation(), lllIIIIl[28])) {
                                bl = lllIIIIl[1];
                                0;
                                if (1 < 0) {
                                    return false;
                                }
                            } else {
                                bl = lllIIIIl[0];
                            }
                            return bl;
                        }, (int)lllIIIIl[42]);
                        0;
                    }
                }
            }
        }
    }

    public static void aa() {
        if (J.lIlllIlIIll(Dialog.isOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (J.lIlllIlIlIl(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llIllllI[lllIIIIl[43]];
            Movement.walkTo((WorldPoint)bD);
            0;
            Time.sleepTicks((int)lllIIIIl[1]);
            0;
        }
        if (J.lIlllIlIIll(bC.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = llIllllI[lllIIIIl[44]];
            J.ab();
        }
    }

    private static boolean lIlllIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
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
                                                    if (!J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[21])) break block19;
                                                    int[] nArray = new int[lllIIIIl[1]];
                                                    nArray[J.lllIIIIl[0]] = lllIIIIl[9];
                                                    if (!J.lIlllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lllIIIIl[1]];
                                                    nArray2[J.lllIIIIl[0]] = lllIIIIl[13];
                                                    if (!J.lIlllIlIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lllIIIIl[1]];
                                                    nArray3[J.lllIIIIl[0]] = lllIIIIl[11];
                                                    if (!J.lIlllIlIIll(Inventory.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lllIIIIl[1]];
                                                    nArray4[J.lllIIIIl[0]] = lllIIIIl[14];
                                                    if (!J.lIlllIlIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lllIIIIl[1]];
                                                    nArray5[J.lllIIIIl[0]] = lllIIIIl[20];
                                                    if (!J.lIlllIlIIll(Inventory.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lllIIIIl[1]];
                                                    nArray6[J.lllIIIIl[0]] = lllIIIIl[48];
                                                    if (!J.lIlllIlIlIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lllIIIIl[1]];
                                                    nArray7[J.lllIIIIl[0]] = lllIIIIl[48];
                                                    if (!J.lIlllIlIIll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lllIIIIl[1];
                                                0;
                                                if (3 >= 0) return n5 != 0;
                                                return ((0xDE ^ 0xAF ^ (0xA5 ^ 0x9C)) & (147 + 85 - 74 + 59 ^ 127 + 11 - 92 + 99 ^ -1)) != 0;
                                            }
                                            n5 = lllIIIIl[0];
                                            return n5 != 0;
                                        }
                                        if (!J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[21]) || !J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[8])) break block22;
                                        int[] nArray = new int[lllIIIIl[1]];
                                        nArray[J.lllIIIIl[0]] = lllIIIIl[13];
                                        if (!J.lIlllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lllIIIIl[1]];
                                        nArray8[J.lllIIIIl[0]] = lllIIIIl[11];
                                        if (!J.lIlllIlIIll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lllIIIIl[1]];
                                        nArray9[J.lllIIIIl[0]] = lllIIIIl[14];
                                        if (!J.lIlllIlIIll(Inventory.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lllIIIIl[1]];
                                        nArray10[J.lllIIIIl[0]] = lllIIIIl[16];
                                        if (!J.lIlllIlIIll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lllIIIIl[1]];
                                        nArray11[J.lllIIIIl[0]] = lllIIIIl[48];
                                        if (!J.lIlllIlIlIl(Inventory.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lllIIIIl[1]];
                                        nArray12[J.lllIIIIl[0]] = lllIIIIl[48];
                                        if (!J.lIlllIlIIll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lllIIIIl[1];
                                    0;
                                    if ((0xA ^ 0xE) > (3 & ~3)) return n4 != 0;
                                    return false;
                                }
                                n4 = lllIIIIl[0];
                                return n4 != 0;
                            }
                            if (!J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[8]) || !J.lIlllIlIlIl(bA ? 1 : 0)) break block25;
                            int[] nArray = new int[lllIIIIl[1]];
                            nArray[J.lllIIIIl[0]] = lllIIIIl[22];
                            if (!J.lIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lllIIIIl[1]];
                            nArray13[J.lllIIIIl[0]] = lllIIIIl[22];
                            if (!J.lIlllIlIIll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lllIIIIl[1]];
                        nArray[J.lllIIIIl[0]] = lllIIIIl[24];
                        if (J.lIlllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lllIIIIl[1]];
                            nArray14[J.lllIIIIl[0]] = lllIIIIl[38];
                            if (J.lIlllIlIIll(Inventory.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lllIIIIl[1];
                                0;
                                if (3 > 0) return n3 != 0;
                                return false;
                            }
                        }
                    }
                    n3 = lllIIIIl[0];
                    return n3 != 0;
                }
                if (!J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[8]) || !J.lIlllIlIIll(bA ? 1 : 0)) return lllIIIIl[0];
                int[] nArray = new int[lllIIIIl[1]];
                nArray[J.lllIIIIl[0]] = lllIIIIl[22];
                if (!J.lIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lllIIIIl[1]];
                nArray15[J.lllIIIIl[0]] = lllIIIIl[22];
                if (!J.lIlllIlIIll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lllIIIIl[1]];
            nArray[J.lllIIIIl[0]] = lllIIIIl[16];
            if (J.lIlllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lllIIIIl[1]];
                nArray16[J.lllIIIIl[0]] = lllIIIIl[23];
                if (J.lIlllIlIIll(Inventory.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lllIIIIl[1]];
                    nArray17[J.lllIIIIl[0]] = lllIIIIl[23];
                    if (J.lIlllIllIII(Inventory.getFirst((int[])nArray17).getQuantity(), lllIIIIl[19])) {
                        int[] nArray18 = new int[lllIIIIl[1]];
                        nArray18[J.lllIIIIl[0]] = lllIIIIl[24];
                        if (J.lIlllIlIIll(Inventory.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lllIIIIl[1]];
                            nArray19[J.lllIIIIl[0]] = lllIIIIl[38];
                            if (J.lIlllIlIIll(Inventory.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lllIIIIl[1];
                                0;
                                if (null == null) return n2 != 0;
                                return false;
                            }
                        }
                    }
                }
            }
        }
        n2 = lllIIIIl[0];
        return n2 != 0;
    }

    @Override
    public boolean T() {
        return lllIIIIl[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ad() {
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
                                                    if (!J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[21])) break block19;
                                                    int[] nArray = new int[lllIIIIl[1]];
                                                    nArray[J.lllIIIIl[0]] = lllIIIIl[9];
                                                    if (!J.lIlllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block20;
                                                    int[] nArray2 = new int[lllIIIIl[1]];
                                                    nArray2[J.lllIIIIl[0]] = lllIIIIl[13];
                                                    if (!J.lIlllIlIIll(Bank.contains((int[])nArray2) ? 1 : 0)) break block20;
                                                    int[] nArray3 = new int[lllIIIIl[1]];
                                                    nArray3[J.lllIIIIl[0]] = lllIIIIl[11];
                                                    if (!J.lIlllIlIIll(Bank.contains((int[])nArray3) ? 1 : 0)) break block20;
                                                    int[] nArray4 = new int[lllIIIIl[1]];
                                                    nArray4[J.lllIIIIl[0]] = lllIIIIl[14];
                                                    if (!J.lIlllIlIIll(Bank.contains((int[])nArray4) ? 1 : 0)) break block20;
                                                    int[] nArray5 = new int[lllIIIIl[1]];
                                                    nArray5[J.lllIIIIl[0]] = lllIIIIl[20];
                                                    if (!J.lIlllIlIIll(Bank.contains((int[])nArray5) ? 1 : 0)) break block20;
                                                    int[] nArray6 = new int[lllIIIIl[1]];
                                                    nArray6[J.lllIIIIl[0]] = lllIIIIl[48];
                                                    if (!J.lIlllIlIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) break block21;
                                                    int[] nArray7 = new int[lllIIIIl[1]];
                                                    nArray7[J.lllIIIIl[0]] = lllIIIIl[48];
                                                    if (!J.lIlllIlIIll(Equipment.contains((int[])nArray7) ? 1 : 0)) break block20;
                                                }
                                                n5 = lllIIIIl[1];
                                                0;
                                                if (2 > 0) return n5 != 0;
                                                return ((0x15 ^ 0x63 ^ (0xD ^ 0x6D)) & (0x5A ^ 0x66 ^ (0x2F ^ 5) ^ -1)) != 0;
                                            }
                                            n5 = lllIIIIl[0];
                                            return n5 != 0;
                                        }
                                        if (!J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[21]) || !J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[8])) break block22;
                                        int[] nArray = new int[lllIIIIl[1]];
                                        nArray[J.lllIIIIl[0]] = lllIIIIl[13];
                                        if (!J.lIlllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) break block23;
                                        int[] nArray8 = new int[lllIIIIl[1]];
                                        nArray8[J.lllIIIIl[0]] = lllIIIIl[11];
                                        if (!J.lIlllIlIIll(Bank.contains((int[])nArray8) ? 1 : 0)) break block23;
                                        int[] nArray9 = new int[lllIIIIl[1]];
                                        nArray9[J.lllIIIIl[0]] = lllIIIIl[14];
                                        if (!J.lIlllIlIIll(Bank.contains((int[])nArray9) ? 1 : 0)) break block23;
                                        int[] nArray10 = new int[lllIIIIl[1]];
                                        nArray10[J.lllIIIIl[0]] = lllIIIIl[16];
                                        if (!J.lIlllIlIIll(Bank.contains((int[])nArray10) ? 1 : 0)) break block23;
                                        int[] nArray11 = new int[lllIIIIl[1]];
                                        nArray11[J.lllIIIIl[0]] = lllIIIIl[48];
                                        if (!J.lIlllIlIlIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block24;
                                        int[] nArray12 = new int[lllIIIIl[1]];
                                        nArray12[J.lllIIIIl[0]] = lllIIIIl[48];
                                        if (!J.lIlllIlIIll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block23;
                                    }
                                    n4 = lllIIIIl[1];
                                    0;
                                    if (null == null) return n4 != 0;
                                    return false;
                                }
                                n4 = lllIIIIl[0];
                                return n4 != 0;
                            }
                            if (!J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[8]) || !J.lIlllIlIlIl(bA ? 1 : 0)) break block25;
                            int[] nArray = new int[lllIIIIl[1]];
                            nArray[J.lllIIIIl[0]] = lllIIIIl[22];
                            if (!J.lIlllIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block26;
                            int[] nArray13 = new int[lllIIIIl[1]];
                            nArray13[J.lllIIIIl[0]] = lllIIIIl[22];
                            if (!J.lIlllIlIIll(Equipment.contains((int[])nArray13) ? 1 : 0)) break block27;
                        }
                        int[] nArray = new int[lllIIIIl[1]];
                        nArray[J.lllIIIIl[0]] = lllIIIIl[24];
                        if (J.lIlllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                            int[] nArray14 = new int[lllIIIIl[1]];
                            nArray14[J.lllIIIIl[0]] = lllIIIIl[25];
                            if (J.lIlllIlIIll(Bank.contains((int[])nArray14) ? 1 : 0)) {
                                n3 = lllIIIIl[1];
                                0;
                                if ((46 + 105 - 80 + 79 ^ 20 + 142 - 72 + 57) > 0) return n3 != 0;
                                return ((4 ^ 0x3E ^ (0x11 ^ 0x2D)) & (0xD5 ^ 0xB2 ^ (0x33 ^ 0x52) ^ -1)) != 0;
                            }
                        }
                    }
                    n3 = lllIIIIl[0];
                    return n3 != 0;
                }
                if (!J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[8]) || !J.lIlllIlIIll(bA ? 1 : 0)) return lllIIIIl[0];
                int[] nArray = new int[lllIIIIl[1]];
                nArray[J.lllIIIIl[0]] = lllIIIIl[22];
                if (!J.lIlllIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) break block28;
                int[] nArray15 = new int[lllIIIIl[1]];
                nArray15[J.lllIIIIl[0]] = lllIIIIl[22];
                if (!J.lIlllIlIIll(Equipment.contains((int[])nArray15) ? 1 : 0)) break block29;
            }
            int[] nArray = new int[lllIIIIl[1]];
            nArray[J.lllIIIIl[0]] = lllIIIIl[16];
            if (J.lIlllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray16 = new int[lllIIIIl[1]];
                nArray16[J.lllIIIIl[0]] = lllIIIIl[23];
                if (J.lIlllIlIIll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lllIIIIl[1]];
                    nArray17[J.lllIIIIl[0]] = lllIIIIl[23];
                    if (J.lIlllIllIII(Bank.getFirst((int[])nArray17).getQuantity(), lllIIIIl[19])) {
                        int[] nArray18 = new int[lllIIIIl[1]];
                        nArray18[J.lllIIIIl[0]] = lllIIIIl[24];
                        if (J.lIlllIlIIll(Bank.contains((int[])nArray18) ? 1 : 0)) {
                            int[] nArray19 = new int[lllIIIIl[1]];
                            nArray19[J.lllIIIIl[0]] = lllIIIIl[25];
                            if (J.lIlllIlIIll(Bank.contains((int[])nArray19) ? 1 : 0)) {
                                n2 = lllIIIIl[1];
                                0;
                                if (((0x1D ^ 0x3D ^ (0xB6 ^ 0xA7)) & (0xD8 ^ 0x87 ^ (0xD6 ^ 0xB8) ^ -1)) == 0) return n2 != 0;
                                return ((0x86 ^ 0x88 ^ (0xA5 ^ 0x9E)) & (0xE ^ 0x5D ^ (0xF7 ^ 0x91) ^ -1)) != 0;
                            }
                        }
                    }
                }
            }
        }
        n2 = lllIIIIl[0];
        return n2 != 0;
    }

    private static void ag() {
        d lIlIIIlIllIIlII;
        Object lIlIIIlIllIIlIl;
        if (J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[8])) {
            int[] nArray = new int[lllIIIIl[1]];
            nArray[J.lllIIIIl[0]] = lllIIIIl[16];
            if (J.lIlllIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
                d d2 = new d(lllIIIIl[16], lllIIIIl[59], lllIIIIl[60]);
                bB.add(d2);
                0;
            }
            int[] nArray2 = new int[lllIIIIl[1]];
            nArray2[J.lllIIIIl[0]] = lllIIIIl[9];
            if (J.lIlllIlIlIl(Bank.contains((int[])nArray2) ? 1 : 0)) {
                lIlIIIlIllIIlIl = new d(lllIIIIl[9], lllIIIIl[61], lllIIIIl[6]);
                bB.add((d)lIlIIIlIllIIlIl);
                0;
            }
            int[] nArray3 = new int[lllIIIIl[1]];
            nArray3[J.lllIIIIl[0]] = lllIIIIl[11];
            if (J.lIlllIlIlIl(Bank.contains((int[])nArray3) ? 1 : 0)) {
                lIlIIIlIllIIlIl = new d(lllIIIIl[11], lllIIIIl[62], lllIIIIl[6]);
                bB.add((d)lIlIIIlIllIIlIl);
                0;
            }
            int[] nArray4 = new int[lllIIIIl[1]];
            nArray4[J.lllIIIIl[0]] = lllIIIIl[13];
            if (J.lIlllIlIlIl(Bank.contains((int[])nArray4) ? 1 : 0)) {
                lIlIIIlIllIIlIl = new d(lllIIIIl[13], lllIIIIl[63], lllIIIIl[6]);
                bB.add((d)lIlIIIlIllIIlIl);
                0;
            }
            int[] nArray5 = new int[lllIIIIl[1]];
            nArray5[J.lllIIIIl[0]] = lllIIIIl[14];
            if (J.lIlllIlIlIl(Bank.contains((int[])nArray5) ? 1 : 0)) {
                lIlIIIlIllIIlIl = new d(lllIIIIl[14], lllIIIIl[5], lllIIIIl[6]);
                bB.add((d)lIlIIIlIllIIlIl);
                0;
            }
            int[] nArray6 = new int[lllIIIIl[1]];
            nArray6[J.lllIIIIl[0]] = lllIIIIl[48];
            if (J.lIlllIlIlIl(Bank.contains((int[])nArray6) ? 1 : 0)) {
                lIlIIIlIllIIlIl = new d(lllIIIIl[48], lllIIIIl[1], e.c(lllIIIIl[64], lllIIIIl[65]));
                bB.add((d)lIlIIIlIllIIlIl);
                0;
            }
        }
        if (J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[8])) {
            int[] nArray = new int[lllIIIIl[1]];
            nArray[J.lllIIIIl[0]] = lllIIIIl[24];
            if (J.lIlllIlIIll(Bank.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray7 = new int[lllIIIIl[1]];
                nArray7[J.lllIIIIl[0]] = lllIIIIl[24];
                if (J.lIlllIlIlII(Bank.getFirst((int[])nArray7).getQuantity(), lllIIIIl[63])) {
                    int[] nArray8 = new int[lllIIIIl[1]];
                    nArray8[J.lllIIIIl[0]] = lllIIIIl[24];
                    lIlIIIlIllIIlIl = new d(lllIIIIl[24], lllIIIIl[63] - Bank.getFirst((int[])nArray8).getQuantity(), lllIIIIl[66]);
                    bB.add((d)lIlIIIlIllIIlIl);
                    0;
                }
            }
            int[] nArray9 = new int[lllIIIIl[1]];
            nArray9[J.lllIIIIl[0]] = lllIIIIl[24];
            if (J.lIlllIlIlIl(Bank.contains((int[])nArray9) ? 1 : 0)) {
                lIlIIIlIllIIlIl = new d(lllIIIIl[24], lllIIIIl[63], lllIIIIl[66]);
                bB.add((d)lIlIIIlIllIIlIl);
                0;
            }
            int[] nArray10 = new int[lllIIIIl[1]];
            nArray10[J.lllIIIIl[0]] = lllIIIIl[25];
            if (J.lIlllIlIIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                int[] nArray11 = new int[lllIIIIl[1]];
                nArray11[J.lllIIIIl[0]] = lllIIIIl[25];
                if (J.lIlllIlIlII(Bank.getFirst((int[])nArray11).getQuantity(), lllIIIIl[63])) {
                    int[] nArray12 = new int[lllIIIIl[1]];
                    nArray12[J.lllIIIIl[0]] = lllIIIIl[25];
                    lIlIIIlIllIIlIl = new d(lllIIIIl[25], lllIIIIl[63] - Bank.getFirst((int[])nArray12).getQuantity(), lllIIIIl[67]);
                    bB.add((d)lIlIIIlIllIIlIl);
                    0;
                }
            }
            int[] nArray13 = new int[lllIIIIl[1]];
            nArray13[J.lllIIIIl[0]] = lllIIIIl[25];
            if (J.lIlllIlIlIl(Bank.contains((int[])nArray13) ? 1 : 0)) {
                lIlIIIlIllIIlIl = new d(lllIIIIl[25], lllIIIIl[63], lllIIIIl[67]);
                bB.add((d)lIlIIIlIllIIlIl);
                0;
            }
            int[] nArray14 = new int[lllIIIIl[1]];
            nArray14[J.lllIIIIl[0]] = lllIIIIl[22];
            if (J.lIlllIlIlIl(Bank.contains((int[])nArray14) ? 1 : 0)) {
                int[] nArray15 = new int[lllIIIIl[1]];
                nArray15[J.lllIIIIl[0]] = lllIIIIl[22];
                if (J.lIlllIlIlIl(Equipment.contains((int[])nArray15) ? 1 : 0)) {
                    lIlIIIlIllIIlIl = new d(lllIIIIl[22], lllIIIIl[1], lllIIIIl[68]);
                    bB.add((d)lIlIIIlIllIIlIl);
                    0;
                }
            }
            if (J.lIlllIlIIll(bA ? 1 : 0)) {
                int[] nArray16 = new int[lllIIIIl[1]];
                nArray16[J.lllIIIIl[0]] = lllIIIIl[16];
                if (J.lIlllIlIIll(Bank.contains((int[])nArray16) ? 1 : 0)) {
                    int[] nArray17 = new int[lllIIIIl[1]];
                    nArray17[J.lllIIIIl[0]] = lllIIIIl[16];
                    if (J.lIlllIlIlII(Bank.getFirst((int[])nArray17).getQuantity(), lllIIIIl[63])) {
                        int[] nArray18 = new int[lllIIIIl[1]];
                        nArray18[J.lllIIIIl[0]] = lllIIIIl[16];
                        lIlIIIlIllIIlIl = new d(lllIIIIl[16], lllIIIIl[63] - Bank.getFirst((int[])nArray18).getQuantity(), lllIIIIl[60]);
                        bB.add((d)lIlIIIlIllIIlIl);
                        0;
                    }
                }
                int[] nArray19 = new int[lllIIIIl[1]];
                nArray19[J.lllIIIIl[0]] = lllIIIIl[16];
                if (J.lIlllIlIlIl(Bank.contains((int[])nArray19) ? 1 : 0)) {
                    lIlIIIlIllIIlIl = new d(lllIIIIl[16], lllIIIIl[63], lllIIIIl[60]);
                    bB.add((d)lIlIIIlIllIIlIl);
                    0;
                }
                int[] nArray20 = new int[lllIIIIl[1]];
                nArray20[J.lllIIIIl[0]] = lllIIIIl[23];
                if (J.lIlllIlIIll(Bank.contains((int[])nArray20) ? 1 : 0)) {
                    int[] nArray21 = new int[lllIIIIl[1]];
                    nArray21[J.lllIIIIl[0]] = lllIIIIl[23];
                    if (J.lIlllIlIlII(Bank.getFirst((int[])nArray21).getQuantity(), lllIIIIl[68])) {
                        int[] nArray22 = new int[lllIIIIl[1]];
                        nArray22[J.lllIIIIl[0]] = lllIIIIl[23];
                        lIlIIIlIllIIlIl = new d(lllIIIIl[23], lllIIIIl[68] - Bank.getFirst((int[])nArray22).getQuantity(), lllIIIIl[6]);
                        bB.add((d)lIlIIIlIllIIlIl);
                        0;
                    }
                }
                int[] nArray23 = new int[lllIIIIl[1]];
                nArray23[J.lllIIIIl[0]] = lllIIIIl[23];
                if (J.lIlllIlIlIl(Bank.contains((int[])nArray23) ? 1 : 0)) {
                    lIlIIIlIllIIlIl = new d(lllIIIIl[23], lllIIIIl[68], lllIIIIl[6]);
                    bB.add((d)lIlIIIlIllIIlIl);
                    0;
                }
            }
        }
        int[] nArray = new int[lllIIIIl[1]];
        nArray[J.lllIIIIl[0]] = lllIIIIl[20];
        if (J.lIlllIlIlIl(Bank.contains((int[])nArray) ? 1 : 0)) {
            lIlIIIlIllIIlIl = new d(lllIIIIl[20], lllIIIIl[69], lllIIIIl[40]);
            bB.add((d)lIlIIIlIllIIlIl);
            0;
        }
        if (J.lIlllIlIlIl(Bank.contains(lIlIIIlIllIIlIl = item -> item.getName().toLowerCase().contains(llIllllI[lllIIIIl[75]])) ? 1 : 0)) {
            lIlIIIlIllIIlII = new d(lllIIIIl[70], lllIIIIl[19], lllIIIIl[71]);
            bB.add(lIlIIIlIllIIlII);
            0;
        }
        int[] nArray24 = new int[lllIIIIl[1]];
        nArray24[J.lllIIIIl[0]] = lllIIIIl[72];
        if (J.lIlllIlIlIl(Bank.contains((int[])nArray24) ? 1 : 0)) {
            lIlIIIlIllIIlII = new d(lllIIIIl[72], lllIIIIl[33], lllIIIIl[73]);
            bB.add(lIlIIIlIllIIlII);
            0;
        }
        int[] nArray25 = new int[lllIIIIl[1]];
        nArray25[J.lllIIIIl[0]] = lllIIIIl[18];
        if (J.lIlllIlIlIl(Bank.contains((int[])nArray25) ? 1 : 0)) {
            lIlIIIlIllIIlII = new d(lllIIIIl[18], lllIIIIl[33], lllIIIIl[73]);
            bB.add(lIlIIIlIllIIlII);
            0;
        }
    }

    public static void af() {
        if (J.lIlllIlIllI(Widgets.get((int)lllIIIIl[51], (int)lllIIIIl[52]))) {
            AccBuilderBarrows.c = llIllllI[lllIIIIl[53]];
            Widgets.get((int)lllIIIIl[51], (int)lllIIIIl[52]).interact(llIllllI[lllIIIIl[54]]);
            Time.sleepTicks((int)lllIIIIl[7]);
            0;
        }
        if (J.lIlllIllIlI(Widgets.get((int)lllIIIIl[51], (int)lllIIIIl[52])) && J.lIlllIlIlIl(Widgets.get((int)lllIIIIl[55]).isEmpty() ? 1 : 0)) {
            Time.sleepTicks((int)lllIIIIl[1]);
            0;
            if (J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[19])) {
                Widgets.get((int)lllIIIIl[55], (int)lllIIIIl[1]).getChild(lllIIIIl[1]).interact(llIllllI[lllIIIIl[56]]);
            }
            if (J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[32]) && J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[19])) {
                Widgets.get((int)lllIIIIl[55], (int)lllIIIIl[1]).getChild(lllIIIIl[3]).interact(llIllllI[lllIIIIl[57]]);
            }
            if (J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[32]) && J.lIlllIlIlII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[39])) {
                Widgets.get((int)lllIIIIl[55], (int)lllIIIIl[1]).getChild(lllIIIIl[4]).interact(llIllllI[lllIIIIl[58]]);
            }
            if (J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[32])) {
                int[] nArray = new int[lllIIIIl[1]];
                nArray[J.lllIIIIl[0]] = lllIIIIl[14];
                if (J.lIlllIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lllIIIIl[55], (int)lllIIIIl[1]).getChild(lllIIIIl[4]).interact(llIllllI[lllIIIIl[21]]);
                }
            }
            if (J.lIlllIllIII(Skills.getLevel((Skill)Skill.MAGIC), lllIIIIl[39])) {
                int[] nArray = new int[lllIIIIl[1]];
                nArray[J.lllIIIIl[0]] = lllIIIIl[14];
                if (J.lIlllIlIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    Widgets.get((int)lllIIIIl[55], (int)lllIIIIl[1]).getChild(lllIIIIl[7]).interact(llIllllI[lllIIIIl[52]]);
                }
            }
            Time.sleepTicks((int)lllIIIIl[1]);
            0;
        }
    }
}

