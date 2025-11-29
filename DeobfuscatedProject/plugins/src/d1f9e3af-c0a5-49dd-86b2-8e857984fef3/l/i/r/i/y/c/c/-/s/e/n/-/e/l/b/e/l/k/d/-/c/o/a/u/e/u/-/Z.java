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
import l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.f;
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

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class Z
implements W {
    public static /* synthetic */ WorldArea kG;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ int[] kE;
    public static /* synthetic */ WorldArea kF;
    private static /* synthetic */ int[] llIIIIlll;
    public static /* synthetic */ WorldPoint kI;
    private static /* synthetic */ String[] llIIIIlIl;
    public static /* synthetic */ WorldArea kH;
    public static /* synthetic */ List<d> bv;
    public static /* synthetic */ WorldPoint kJ;
    public static /* synthetic */ WorldPoint bx;

    @Override
    public int T() {
        try {
            Z.dn();
            "".length();
        }
        catch (Exception lIlllIlIIIlIlI) {
            lIlllIlIIIlIlI.printStackTrace();
        }
        if (null != null) {
            return (0x2D ^ 0x1A ^ (0xBC ^ 0x87)) & (0xF2 ^ 0xA9 ^ (0x18 ^ 0x4F) ^ -" ".length());
        }
        return llIIIIlll[0];
    }

    private static boolean lIlIIlIlIlIl(Object object, Object object2) {
        return object == object2;
    }

    private static void lIlIIlIIIlll() {
        llIIIIlll = new int[72];
        Z.llIIIIlll[0] = (0x18 ^ 0xB) & ~(0x60 ^ 0x73);
        Z.llIIIIlll[1] = " ".length();
        Z.llIIIIlll[2] = 0x74 ^ 0x60;
        Z.llIIIIlll[3] = "  ".length();
        Z.llIIIIlll[4] = "   ".length();
        Z.llIIIIlll[5] = -(0xFFFFCE67 & 0x7D9C) & (0xFFFFFFBB & 0x5FCF);
        Z.llIIIIlll[6] = "  ".length() ^ (0xC7 ^ 0xC1);
        Z.llIIIIlll[7] = 0xFFFFABE3 & 0x57FF;
        Z.llIIIIlll[8] = -(0xFFFFECF9 & 0x7F0E) & (0xFFFFEFFF & 0x7FEF);
        Z.llIIIIlll[9] = -(0xFFFFFFFF & 0x6089) & (0xFFFFFFDF & 0x7FEF);
        Z.llIIIIlll[10] = 45 + 192 - 220 + 177 ^ 152 + 123 - 266 + 190;
        Z.llIIIIlll[11] = 0xFFFFDDFB & 0x237F;
        Z.llIIIIlll[12] = 0xE0 ^ 0x88 ^ (0x26 ^ 0x2A);
        Z.llIIIIlll[13] = 42 + 13 - -95 + 41 ^ 27 + 127 - 23 + 45;
        Z.llIIIIlll[14] = 0x11 ^ 0x37 ^ (0xBD ^ 0x9D);
        Z.llIIIIlll[15] = 0x62 ^ 0x70 ^ (0xBC ^ 0xA9);
        Z.llIIIIlll[16] = 0xFFFFEFF3 & 0x153F;
        Z.llIIIIlll[17] = 0xFFFF8DFF & 0x7735;
        Z.llIIIIlll[18] = 0x4B ^ 0x17 ^ (0xC7 ^ 0x93);
        Z.llIIIIlll[19] = 172 + 53 - 57 + 7 ^ 142 + 125 - 156 + 55;
        Z.llIIIIlll[20] = 0xCE ^ 0xC4;
        Z.llIIIIlll[21] = 0x90 ^ 0x9B;
        Z.llIIIIlll[22] = 132 + 75 - 89 + 26 ^ 6 + 16 - -128 + 6;
        Z.llIIIIlll[23] = 46 + 90 - 12 + 18 ^ 86 + 4 - 59 + 100;
        Z.llIIIIlll[24] = 0x42 ^ 0x4C;
        Z.llIIIIlll[25] = 0xE8 ^ 0xB2 ^ (0x7D ^ 0x37);
        Z.llIIIIlll[26] = -" ".length();
        Z.llIIIIlll[27] = 0xFFFFEB3E & 0x25114DF;
        Z.llIIIIlll[28] = 0x5F ^ 0x4E;
        Z.llIIIIlll[29] = 0xA2 ^ 0xB0;
        Z.llIIIIlll[30] = 0xD1 ^ 0xC2;
        Z.llIIIIlll[31] = 0x7E ^ 0x40 ^ (0x92 ^ 0xB9);
        Z.llIIIIlll[32] = 0x13 ^ 5;
        Z.llIIIIlll[33] = 0xD1 ^ 0xA8 ^ (0x57 ^ 0x30);
        Z.llIIIIlll[34] = 0x81 ^ 0x96;
        Z.llIIIIlll[35] = 0x5A ^ 0x42;
        Z.llIIIIlll[36] = 0x47 ^ 0x5E;
        Z.llIIIIlll[37] = 0x9D ^ 0xC3 ^ (0xF5 ^ 0x83);
        Z.llIIIIlll[38] = 0x8B ^ 0x91;
        Z.llIIIIlll[39] = 0x8F ^ 0x94;
        Z.llIIIIlll[40] = -(0xFFFFEAE7 & 0x7F7B) & (0xFFFFFFFF & 0x6EEB);
        Z.llIIIIlll[41] = 44 + 3 - 2 + 101 ^ 92 + 4 - 68 + 114;
        Z.llIIIIlll[42] = 0xFFFFE7E7 & 0x1C7B;
        Z.llIIIIlll[43] = 29 + 90 - 26 + 38 ^ 61 + 3 - -16 + 78;
        Z.llIIIIlll[44] = 0xFFFFA5FF & 0x5E31;
        Z.llIIIIlll[45] = -(0xFFFFD37F & 0x7EC1) & (0xFFFFFFEF & 0x56FF);
        Z.llIIIIlll[46] = 0x7C ^ 0x63;
        Z.llIIIIlll[47] = -(0xFFFFE89F & 0x7F73) & (0xFFFFFEBF & 0x6FFA);
        Z.llIIIIlll[48] = 3 + 67 - 51 + 126 ^ 170 + 107 - 153 + 53;
        Z.llIIIIlll[49] = 0xFFFFABF7 & 0x7F7E;
        Z.llIIIIlll[50] = 0xCB ^ 0xA9 ^ (0xE9 ^ 0xAA);
        Z.llIIIIlll[51] = -(0xFFFFE979 & 0x7EA7) & (0xFFFFEFB4 & 0x7BEF);
        Z.llIIIIlll[52] = 0xFFFFBF4E & 0x5FF9;
        Z.llIIIIlll[53] = 0xFFFF88FE & 0xFFB9;
        Z.llIIIIlll[54] = -(0xFFFFFE4D & 0xDBA) & (0xFFFFEDEF & 0x7FBF);
        Z.llIIIIlll[55] = 0xFFFFFDF4 & 0x3FF;
        Z.llIIIIlll[56] = -(0xFFFFDE39 & 0x61EE) & (0xFFFFFEFF & 0x7BBF);
        Z.llIIIIlll[57] = 0xA3 ^ 0x81;
        Z.llIIIIlll[58] = 0x46 ^ 0x65;
        Z.llIIIIlll[59] = 0xFFFFAFBF & 0x5CD9;
        Z.llIIIIlll[60] = -(0xFFFF97E7 & 0x7A39) & (0xFFFFDFFA & 0x3EFF);
        Z.llIIIIlll[61] = 0xFFFFAEEF & 0x5DBC;
        Z.llIIIIlll[62] = -(0xFFFF8F77 & 0x7389) & (0xFFFFDFDF & 0x2FF0);
        Z.llIIIIlll[63] = -(0xFFFFEAD7 & 0x57AF) & (0xFFFFEEF7 & 0x5FFF);
        Z.llIIIIlll[64] = 0xFFFFCF5F & 0x3CFF;
        Z.llIIIIlll[65] = 0x71 ^ 0x41;
        Z.llIIIIlll[66] = -(0xFFFFF9D1 & 0x763F) & (0xFFFFFEFF & 0x7D9D);
        Z.llIIIIlll[67] = 0xFFFF8CEF & 0x7F7D;
        Z.llIIIIlll[68] = -(0xFFFFB552 & 0x5BEF) & (0xFFFF9DFF & 0x7FF7);
        Z.llIIIIlll[69] = -(0xDB ^ 0xBA) & (0xFFFFACFF & 0x5FFF);
        Z.llIIIIlll[70] = -(0xFFFFE37E & 0x7D99) & (0xFFFFFFF7 & 0x6DFF);
        Z.llIIIIlll[71] = 114 + 41 - 148 + 140 ^ 126 + 24 - 13 + 46;
    }

    public static void aa() {
        if (Z.lIlIIlIIlIll(kG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIIlIl[llIIIIlll[19]];
            Movement.walkTo((WorldPoint)bx);
            "".length();
            Time.sleepTicks((int)llIIIIlll[1]);
            "".length();
        }
        if (Z.lIlIIlIIlIIl(kG.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = llIIIIlIl[llIIIIlll[20]];
            if (Z.lIlIIlIlIIII(Players.getLocal().getInteracting())) {
                NPC lIlllIlIIIllll = NPCs.getNearest(nPC -> {
                    int n2;
                    if (Z.lIlIIlIIlIIl(nPC.getName().contains(llIIIIlIl[llIIIIlll[58]]) ? 1 : 0) && Z.lIlIIlIlIIII(nPC.getInteracting()) && Z.lIlIIlIIlIll(nPC.isDead() ? 1 : 0)) {
                        n2 = llIIIIlll[1];
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return ((0x40 ^ 0x7F) & ~(0x22 ^ 0x1D)) != 0;
                        }
                    } else {
                        n2 = llIIIIlll[0];
                    }
                    return n2 != 0;
                });
                String[] stringArray = new String[llIIIIlll[3]];
                stringArray[Z.llIIIIlll[0]] = llIIIIlIl[llIIIIlll[21]];
                stringArray[Z.llIIIIlll[1]] = llIIIIlIl[llIIIIlll[22]];
                List lIlllIlIIIlllI = NPCs.getAll((String[])stringArray).stream().filter(nPC -> {
                    boolean bl;
                    if (Z.lIlIIlIlIlIl(nPC.getInteracting(), Players.getLocal())) {
                        bl = llIIIIlll[1];
                        "".length();
                        if ((14 + 54 - -41 + 32 ^ 117 + 53 - 48 + 14) == 0) {
                            return ("  ".length() & ("  ".length() ^ -" ".length())) != 0;
                        }
                    } else {
                        bl = llIIIIlll[0];
                    }
                    return bl;
                }).collect(Collectors.toList());
                if (Z.lIlIIlIIlIll(lIlllIlIIIlllI.isEmpty() ? 1 : 0)) {
                    ((NPC)lIlllIlIIIlllI.get(llIIIIlll[0])).interact(llIIIIlIl[llIIIIlll[23]]);
                    Time.sleepTicks((int)llIIIIlll[3]);
                    "".length();
                }
                if (Z.lIlIIlIIllII(lIlllIlIIIllll) && Z.lIlIIlIIlIll(Players.getLocal().isMoving() ? 1 : 0) && Z.lIlIIlIIlIIl(lIlllIlIIIlllI.isEmpty() ? 1 : 0)) {
                    lIlllIlIIIllll.interact(llIIIIlIl[llIIIIlll[24]]);
                    Time.sleepTicks((int)llIIIIlll[3]);
                    "".length();
                }
            }
            if (Z.lIlIIlIIllII(Players.getLocal().getInteracting())) {
                Time.sleepTicks((int)llIIIIlll[6]);
                "".length();
            }
        }
    }

    public static void do() {
        if (Z.lIlIIlIlIIIl(Static.getClient().getVar(llIIIIlll[21]), llIIIIlll[1])) {
            Static.getClient().invokeMenuAction(llIIIIlIl[llIIIIlll[13]], llIIIIlIl[llIIIIlll[25]], llIIIIlll[1], MenuAction.CC_OP.getId(), llIIIIlll[26], llIIIIlll[27]);
        }
        if (Z.lIlIIlIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIlll[10])) {
            String[] stringArray = new String[llIIIIlll[1]];
            stringArray[Z.llIIIIlll[0]] = llIIIIlIl[llIIIIlll[28]];
            if (Z.lIlIIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray2 = new String[llIIIIlll[1]];
                stringArray2[Z.llIIIIlll[0]] = llIIIIlIl[llIIIIlll[29]];
                Inventory.getFirst((String[])stringArray2).interact(llIIIIlIl[llIIIIlll[30]]);
            }
        }
        if (Z.lIlIIlIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIlll[10]) && Z.lIlIIlIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIlll[2])) {
            String[] stringArray = new String[llIIIIlll[1]];
            stringArray[Z.llIIIIlll[0]] = llIIIIlIl[llIIIIlll[2]];
            if (Z.lIlIIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray3 = new String[llIIIIlll[1]];
                stringArray3[Z.llIIIIlll[0]] = llIIIIlIl[llIIIIlll[31]];
                Inventory.getFirst((String[])stringArray3).interact(llIIIIlIl[llIIIIlll[32]]);
            }
        }
        if (Z.lIlIIlIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIlll[2]) && Z.lIlIIlIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIlll[33])) {
            String[] stringArray = new String[llIIIIlll[1]];
            stringArray[Z.llIIIIlll[0]] = llIIIIlIl[llIIIIlll[34]];
            if (Z.lIlIIlIIlIIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                String[] stringArray4 = new String[llIIIIlll[1]];
                stringArray4[Z.llIIIIlll[0]] = llIIIIlIl[llIIIIlll[35]];
                Inventory.getFirst((String[])stringArray4).interact(llIIIIlIl[llIIIIlll[36]]);
            }
        }
        if (Z.lIlIIlIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIlll[33]) && Z.lIlIIlIIlIlI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIlll[37])) {
            int[] nArray = new int[llIIIIlll[1]];
            nArray[Z.llIIIIlll[0]] = llIIIIlll[16];
            if (Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIIIIlll[1]];
                nArray2[Z.llIIIIlll[0]] = llIIIIlll[16];
                Inventory.getFirst((int[])nArray2).interact(llIIIIlIl[llIIIIlll[38]]);
            }
        }
        if (Z.lIlIIlIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIlll[37])) {
            int[] nArray = new int[llIIIIlll[1]];
            nArray[Z.llIIIIlll[0]] = llIIIIlll[17];
            if (Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIIIIlll[1]];
                nArray3[Z.llIIIIlll[0]] = llIIIIlll[17];
                Inventory.getFirst((int[])nArray3).interact(llIIIIlIl[llIIIIlll[39]]);
            }
        }
        if (Z.lIlIIlIIlllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIIlll[33])) {
            int[] nArray = new int[llIIIIlll[1]];
            nArray[Z.llIIIIlll[0]] = llIIIIlll[40];
            if (Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray4 = new int[llIIIIlll[1]];
                nArray4[Z.llIIIIlll[0]] = llIIIIlll[40];
                Inventory.getFirst((int[])nArray4).interact(llIIIIlIl[llIIIIlll[41]]);
            }
            int[] nArray5 = new int[llIIIIlll[1]];
            nArray5[Z.llIIIIlll[0]] = llIIIIlll[42];
            if (Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                int[] nArray6 = new int[llIIIIlll[1]];
                nArray6[Z.llIIIIlll[0]] = llIIIIlll[42];
                Inventory.getFirst((int[])nArray6).interact(llIIIIlIl[llIIIIlll[43]]);
            }
            int[] nArray7 = new int[llIIIIlll[1]];
            nArray7[Z.llIIIIlll[0]] = llIIIIlll[44];
            if (Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) {
                int[] nArray8 = new int[llIIIIlll[1]];
                nArray8[Z.llIIIIlll[0]] = llIIIIlll[44];
                Inventory.getFirst((int[])nArray8).interact(llIIIIlIl[llIIIIlll[33]]);
            }
            int[] nArray9 = new int[llIIIIlll[1]];
            nArray9[Z.llIIIIlll[0]] = llIIIIlll[45];
            if (Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) {
                int[] nArray10 = new int[llIIIIlll[1]];
                nArray10[Z.llIIIIlll[0]] = llIIIIlll[45];
                Inventory.getFirst((int[])nArray10).interact(llIIIIlIl[llIIIIlll[46]]);
            }
        }
        int[] nArray = new int[llIIIIlll[1]];
        nArray[Z.llIIIIlll[0]] = llIIIIlll[47];
        if (Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
            int[] nArray11 = new int[llIIIIlll[1]];
            nArray11[Z.llIIIIlll[0]] = llIIIIlll[47];
            Inventory.getFirst((int[])nArray11).interact(llIIIIlIl[llIIIIlll[48]]);
        }
        int[] nArray12 = new int[llIIIIlll[1]];
        nArray12[Z.llIIIIlll[0]] = llIIIIlll[49];
        if (Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) {
            int[] nArray13 = new int[llIIIIlll[1]];
            nArray13[Z.llIIIIlll[0]] = llIIIIlll[49];
            Inventory.getFirst((int[])nArray13).interact(llIIIIlIl[llIIIIlll[50]]);
        }
    }

    @Override
    public String U() {
        return llIIIIlIl[llIIIIlll[57]];
    }

    private static boolean lIlIIlIIlIll(int n2) {
        return n2 == 0;
    }

    private static String lIlIIIlllIII(String lIlllIIllIIlII, String lIlllIIllIIIll) {
        try {
            SecretKeySpec lIlllIIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIIllIIIll.getBytes(StandardCharsets.UTF_8)), llIIIIlll[18]), "DES");
            Cipher lIlllIIllIlIII = Cipher.getInstance("DES");
            lIlllIIllIlIII.init(llIIIIlll[3], lIlllIIllIlIIl);
            return new String(lIlllIIllIlIII.doFinal(Base64.getDecoder().decode(lIlllIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIllIIlll) {
            lIlllIIllIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static void dq() {
        if (Z.lIlIIlIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIIlll[37])) {
            Combat.setAttackStyle((Combat.AttackStyle)Combat.AttackStyle.FOURTH);
        }
    }

    private static int lIlIIlIIlIII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean bH() {
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
                                                                            if (!Z.lIlIIlIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIlll[37])) break block8;
                                                                            int[] nArray = new int[llIIIIlll[1]];
                                                                            nArray[Z.llIIIIlll[0]] = llIIIIlll[17];
                                                                            if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                            int[] nArray2 = new int[llIIIIlll[1]];
                                                                            nArray2[Z.llIIIIlll[0]] = llIIIIlll[17];
                                                                            if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block10;
                                                                        }
                                                                        int[] nArray = new int[llIIIIlll[1]];
                                                                        nArray[Z.llIIIIlll[0]] = llIIIIlll[42];
                                                                        if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                        int[] nArray3 = new int[llIIIIlll[1]];
                                                                        nArray3[Z.llIIIIlll[0]] = llIIIIlll[42];
                                                                        if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray3) ? 1 : 0)) break block10;
                                                                    }
                                                                    int[] nArray = new int[llIIIIlll[1]];
                                                                    nArray[Z.llIIIIlll[0]] = llIIIIlll[44];
                                                                    if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block12;
                                                                    int[] nArray4 = new int[llIIIIlll[1]];
                                                                    nArray4[Z.llIIIIlll[0]] = llIIIIlll[44];
                                                                    if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray4) ? 1 : 0)) break block10;
                                                                }
                                                                int[] nArray = new int[llIIIIlll[1]];
                                                                nArray[Z.llIIIIlll[0]] = llIIIIlll[40];
                                                                if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block13;
                                                                int[] nArray5 = new int[llIIIIlll[1]];
                                                                nArray5[Z.llIIIIlll[0]] = llIIIIlll[40];
                                                                if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray5) ? 1 : 0)) break block10;
                                                            }
                                                            int[] nArray = new int[llIIIIlll[1]];
                                                            nArray[Z.llIIIIlll[0]] = llIIIIlll[45];
                                                            if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                                            int[] nArray6 = new int[llIIIIlll[1]];
                                                            nArray6[Z.llIIIIlll[0]] = llIIIIlll[45];
                                                            if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray6) ? 1 : 0)) break block10;
                                                        }
                                                        int[] nArray = new int[llIIIIlll[1]];
                                                        nArray[Z.llIIIIlll[0]] = llIIIIlll[47];
                                                        if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block15;
                                                        int[] nArray7 = new int[llIIIIlll[1]];
                                                        nArray7[Z.llIIIIlll[0]] = llIIIIlll[47];
                                                        if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray7) ? 1 : 0)) break block10;
                                                    }
                                                    int[] nArray = new int[llIIIIlll[1]];
                                                    nArray[Z.llIIIIlll[0]] = llIIIIlll[49];
                                                    if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                                    int[] nArray8 = new int[llIIIIlll[1]];
                                                    nArray8[Z.llIIIIlll[0]] = llIIIIlll[49];
                                                    if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray8) ? 1 : 0)) break block10;
                                                }
                                                int[] nArray = new int[llIIIIlll[1]];
                                                nArray[Z.llIIIIlll[0]] = llIIIIlll[11];
                                                if (Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                                                    n3 = llIIIIlll[1];
                                                    "".length();
                                                    if ((0x66 ^ 0x62) > 0) return n3 != 0;
                                                    return ((0xF3 ^ 0xB9) & ~(0x72 ^ 0x38)) != 0;
                                                }
                                            }
                                            n3 = llIIIIlll[0];
                                            return n3 != 0;
                                        }
                                        int[] nArray = new int[llIIIIlll[1]];
                                        nArray[Z.llIIIIlll[0]] = llIIIIlll[16];
                                        if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                        int[] nArray9 = new int[llIIIIlll[1]];
                                        nArray9[Z.llIIIIlll[0]] = llIIIIlll[16];
                                        if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray9) ? 1 : 0)) break block18;
                                    }
                                    int[] nArray = new int[llIIIIlll[1]];
                                    nArray[Z.llIIIIlll[0]] = llIIIIlll[42];
                                    if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                                    int[] nArray10 = new int[llIIIIlll[1]];
                                    nArray10[Z.llIIIIlll[0]] = llIIIIlll[42];
                                    if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray10) ? 1 : 0)) break block18;
                                }
                                int[] nArray = new int[llIIIIlll[1]];
                                nArray[Z.llIIIIlll[0]] = llIIIIlll[44];
                                if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block20;
                                int[] nArray11 = new int[llIIIIlll[1]];
                                nArray11[Z.llIIIIlll[0]] = llIIIIlll[44];
                                if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray11) ? 1 : 0)) break block18;
                            }
                            int[] nArray = new int[llIIIIlll[1]];
                            nArray[Z.llIIIIlll[0]] = llIIIIlll[40];
                            if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block21;
                            int[] nArray12 = new int[llIIIIlll[1]];
                            nArray12[Z.llIIIIlll[0]] = llIIIIlll[40];
                            if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray12) ? 1 : 0)) break block18;
                        }
                        int[] nArray = new int[llIIIIlll[1]];
                        nArray[Z.llIIIIlll[0]] = llIIIIlll[45];
                        if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block22;
                        int[] nArray13 = new int[llIIIIlll[1]];
                        nArray13[Z.llIIIIlll[0]] = llIIIIlll[45];
                        if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray13) ? 1 : 0)) break block18;
                    }
                    int[] nArray = new int[llIIIIlll[1]];
                    nArray[Z.llIIIIlll[0]] = llIIIIlll[47];
                    if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block23;
                    int[] nArray14 = new int[llIIIIlll[1]];
                    nArray14[Z.llIIIIlll[0]] = llIIIIlll[47];
                    if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray14) ? 1 : 0)) break block18;
                }
                int[] nArray = new int[llIIIIlll[1]];
                nArray[Z.llIIIIlll[0]] = llIIIIlll[49];
                if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block24;
                int[] nArray15 = new int[llIIIIlll[1]];
                nArray15[Z.llIIIIlll[0]] = llIIIIlll[49];
                if (!Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray15) ? 1 : 0)) break block18;
            }
            int[] nArray = new int[llIIIIlll[1]];
            nArray[Z.llIIIIlll[0]] = llIIIIlll[11];
            if (Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIIIIlll[1];
                "".length();
                if (-" ".length() <= "   ".length()) return n2 != 0;
                return ((0xA4 ^ 0xBD) & ~(0x3C ^ 0x25)) != 0;
            }
        }
        n2 = llIIIIlll[0];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean dp() {
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
                                                                                    if (!Z.lIlIIlIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIlll[37])) break block4;
                                                                                    int[] nArray = new int[llIIIIlll[1]];
                                                                                    nArray[Z.llIIIIlll[0]] = llIIIIlll[17];
                                                                                    if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block5;
                                                                                    int[] nArray2 = new int[llIIIIlll[1]];
                                                                                    nArray2[Z.llIIIIlll[0]] = llIIIIlll[17];
                                                                                    if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray2) ? 1 : 0)) break block5;
                                                                                    int[] nArray3 = new int[llIIIIlll[1]];
                                                                                    nArray3[Z.llIIIIlll[0]] = llIIIIlll[17];
                                                                                    if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray3) ? 1 : 0)) break block6;
                                                                                }
                                                                                int[] nArray = new int[llIIIIlll[1]];
                                                                                nArray[Z.llIIIIlll[0]] = llIIIIlll[42];
                                                                                if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block7;
                                                                                int[] nArray4 = new int[llIIIIlll[1]];
                                                                                nArray4[Z.llIIIIlll[0]] = llIIIIlll[42];
                                                                                if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block7;
                                                                                int[] nArray5 = new int[llIIIIlll[1]];
                                                                                nArray5[Z.llIIIIlll[0]] = llIIIIlll[42];
                                                                                if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray5) ? 1 : 0)) break block6;
                                                                            }
                                                                            int[] nArray = new int[llIIIIlll[1]];
                                                                            nArray[Z.llIIIIlll[0]] = llIIIIlll[44];
                                                                            if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block8;
                                                                            int[] nArray6 = new int[llIIIIlll[1]];
                                                                            nArray6[Z.llIIIIlll[0]] = llIIIIlll[44];
                                                                            if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray6) ? 1 : 0)) break block8;
                                                                            int[] nArray7 = new int[llIIIIlll[1]];
                                                                            nArray7[Z.llIIIIlll[0]] = llIIIIlll[44];
                                                                            if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray7) ? 1 : 0)) break block6;
                                                                        }
                                                                        int[] nArray = new int[llIIIIlll[1]];
                                                                        nArray[Z.llIIIIlll[0]] = llIIIIlll[40];
                                                                        if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block9;
                                                                        int[] nArray8 = new int[llIIIIlll[1]];
                                                                        nArray8[Z.llIIIIlll[0]] = llIIIIlll[40];
                                                                        if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray8) ? 1 : 0)) break block9;
                                                                        int[] nArray9 = new int[llIIIIlll[1]];
                                                                        nArray9[Z.llIIIIlll[0]] = llIIIIlll[40];
                                                                        if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray9) ? 1 : 0)) break block6;
                                                                    }
                                                                    int[] nArray = new int[llIIIIlll[1]];
                                                                    nArray[Z.llIIIIlll[0]] = llIIIIlll[45];
                                                                    if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block10;
                                                                    int[] nArray10 = new int[llIIIIlll[1]];
                                                                    nArray10[Z.llIIIIlll[0]] = llIIIIlll[45];
                                                                    if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray10) ? 1 : 0)) break block10;
                                                                    int[] nArray11 = new int[llIIIIlll[1]];
                                                                    nArray11[Z.llIIIIlll[0]] = llIIIIlll[45];
                                                                    if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray11) ? 1 : 0)) break block6;
                                                                }
                                                                int[] nArray = new int[llIIIIlll[1]];
                                                                nArray[Z.llIIIIlll[0]] = llIIIIlll[47];
                                                                if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block11;
                                                                int[] nArray12 = new int[llIIIIlll[1]];
                                                                nArray12[Z.llIIIIlll[0]] = llIIIIlll[47];
                                                                if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray12) ? 1 : 0)) break block11;
                                                                int[] nArray13 = new int[llIIIIlll[1]];
                                                                nArray13[Z.llIIIIlll[0]] = llIIIIlll[47];
                                                                if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray13) ? 1 : 0)) break block6;
                                                            }
                                                            int[] nArray = new int[llIIIIlll[1]];
                                                            nArray[Z.llIIIIlll[0]] = llIIIIlll[49];
                                                            if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block12;
                                                            int[] nArray14 = new int[llIIIIlll[1]];
                                                            nArray14[Z.llIIIIlll[0]] = llIIIIlll[49];
                                                            if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray14) ? 1 : 0)) break block12;
                                                            int[] nArray15 = new int[llIIIIlll[1]];
                                                            nArray15[Z.llIIIIlll[0]] = llIIIIlll[49];
                                                            if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray15) ? 1 : 0)) break block6;
                                                        }
                                                        int[] nArray = new int[llIIIIlll[1]];
                                                        nArray[Z.llIIIIlll[0]] = llIIIIlll[11];
                                                        if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block13;
                                                        int[] nArray16 = new int[llIIIIlll[1]];
                                                        nArray16[Z.llIIIIlll[0]] = llIIIIlll[11];
                                                        if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray16) ? 1 : 0)) break block6;
                                                    }
                                                    n3 = llIIIIlll[1];
                                                    "".length();
                                                    if (-(0 ^ 4) < 0) return n3 != 0;
                                                    return ((0x73 ^ 0x28) & ~(0xD6 ^ 0x8D)) != 0;
                                                }
                                                n3 = llIIIIlll[0];
                                                return n3 != 0;
                                            }
                                            int[] nArray = new int[llIIIIlll[1]];
                                            nArray[Z.llIIIIlll[0]] = llIIIIlll[16];
                                            if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block14;
                                            int[] nArray17 = new int[llIIIIlll[1]];
                                            nArray17[Z.llIIIIlll[0]] = llIIIIlll[16];
                                            if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray17) ? 1 : 0)) break block14;
                                            int[] nArray18 = new int[llIIIIlll[1]];
                                            nArray18[Z.llIIIIlll[0]] = llIIIIlll[16];
                                            if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray18) ? 1 : 0)) break block15;
                                        }
                                        int[] nArray = new int[llIIIIlll[1]];
                                        nArray[Z.llIIIIlll[0]] = llIIIIlll[42];
                                        if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block16;
                                        int[] nArray19 = new int[llIIIIlll[1]];
                                        nArray19[Z.llIIIIlll[0]] = llIIIIlll[42];
                                        if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray19) ? 1 : 0)) break block16;
                                        int[] nArray20 = new int[llIIIIlll[1]];
                                        nArray20[Z.llIIIIlll[0]] = llIIIIlll[42];
                                        if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray20) ? 1 : 0)) break block15;
                                    }
                                    int[] nArray = new int[llIIIIlll[1]];
                                    nArray[Z.llIIIIlll[0]] = llIIIIlll[44];
                                    if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block17;
                                    int[] nArray21 = new int[llIIIIlll[1]];
                                    nArray21[Z.llIIIIlll[0]] = llIIIIlll[44];
                                    if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray21) ? 1 : 0)) break block17;
                                    int[] nArray22 = new int[llIIIIlll[1]];
                                    nArray22[Z.llIIIIlll[0]] = llIIIIlll[44];
                                    if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray22) ? 1 : 0)) break block15;
                                }
                                int[] nArray = new int[llIIIIlll[1]];
                                nArray[Z.llIIIIlll[0]] = llIIIIlll[40];
                                if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                                int[] nArray23 = new int[llIIIIlll[1]];
                                nArray23[Z.llIIIIlll[0]] = llIIIIlll[40];
                                if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray23) ? 1 : 0)) break block18;
                                int[] nArray24 = new int[llIIIIlll[1]];
                                nArray24[Z.llIIIIlll[0]] = llIIIIlll[40];
                                if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray24) ? 1 : 0)) break block15;
                            }
                            int[] nArray = new int[llIIIIlll[1]];
                            nArray[Z.llIIIIlll[0]] = llIIIIlll[45];
                            if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block19;
                            int[] nArray25 = new int[llIIIIlll[1]];
                            nArray25[Z.llIIIIlll[0]] = llIIIIlll[45];
                            if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray25) ? 1 : 0)) break block19;
                            int[] nArray26 = new int[llIIIIlll[1]];
                            nArray26[Z.llIIIIlll[0]] = llIIIIlll[45];
                            if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray26) ? 1 : 0)) break block15;
                        }
                        int[] nArray = new int[llIIIIlll[1]];
                        nArray[Z.llIIIIlll[0]] = llIIIIlll[47];
                        if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block20;
                        int[] nArray27 = new int[llIIIIlll[1]];
                        nArray27[Z.llIIIIlll[0]] = llIIIIlll[47];
                        if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray27) ? 1 : 0)) break block20;
                        int[] nArray28 = new int[llIIIIlll[1]];
                        nArray28[Z.llIIIIlll[0]] = llIIIIlll[47];
                        if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray28) ? 1 : 0)) break block15;
                    }
                    int[] nArray = new int[llIIIIlll[1]];
                    nArray[Z.llIIIIlll[0]] = llIIIIlll[49];
                    if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block21;
                    int[] nArray29 = new int[llIIIIlll[1]];
                    nArray29[Z.llIIIIlll[0]] = llIIIIlll[49];
                    if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray29) ? 1 : 0)) break block21;
                    int[] nArray30 = new int[llIIIIlll[1]];
                    nArray30[Z.llIIIIlll[0]] = llIIIIlll[49];
                    if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray30) ? 1 : 0)) break block15;
                }
                int[] nArray = new int[llIIIIlll[1]];
                nArray[Z.llIIIIlll[0]] = llIIIIlll[11];
                if (!Z.lIlIIlIIlIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block22;
                int[] nArray31 = new int[llIIIIlll[1]];
                nArray31[Z.llIIIIlll[0]] = llIIIIlll[11];
                if (!Z.lIlIIlIIlIIl(Bank.contains((int[])nArray31) ? 1 : 0)) break block15;
            }
            n2 = llIIIIlll[1];
            "".length();
            if (((0xD2 ^ 0x83) & ~(0x47 ^ 0x16)) <= ((0xAF ^ 0xBC) & ~(0x3A ^ 0x29))) return n2 != 0;
            return ((0xD3 ^ 0xC6) & ~(0xBC ^ 0xA9)) != 0;
        }
        n2 = llIIIIlll[0];
        return n2 != 0;
    }

    private static boolean lIlIIlIlIIII(Object object) {
        return object == null;
    }

    private static boolean lIlIIlIIllIl(int n2) {
        return n2 > 0;
    }

    private static String lIlIIIlllIIl(String lIlllIIllllIll, String lIlllIIllllIlI) {
        lIlllIIllllIll = new String(Base64.getDecoder().decode(lIlllIIllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllIIllllIIl = new StringBuilder();
        char[] lIlllIIllllIII = lIlllIIllllIlI.toCharArray();
        int lIlllIIlllIlll = llIIIIlll[0];
        char[] lIlllIIlllIIIl = lIlllIIllllIll.toCharArray();
        int lIlllIIlllIIII = lIlllIIlllIIIl.length;
        int lIlllIIllIllll = llIIIIlll[0];
        while (Z.lIlIIlIIlIlI(lIlllIIllIllll, lIlllIIlllIIII)) {
            char lIlllIIlllllII = lIlllIIlllIIIl[lIlllIIllIllll];
            lIlllIIllllIIl.append((char)(lIlllIIlllllII ^ lIlllIIllllIII[lIlllIIlllIlll % lIlllIIllllIII.length]));
            "".length();
            ++lIlllIIlllIlll;
            ++lIlllIIllIllll;
            "".length();
            if (((0xA0 ^ 0x96 ^ (0x3D ^ 0x25)) & (184 + 155 - 243 + 141 ^ 36 + 120 - -11 + 28 ^ -" ".length())) == 0) continue;
            return null;
        }
        return String.valueOf(lIlllIIllllIIl);
    }

    public static void af() {
        d lIlllIlIIIllII;
        int[] nArray = new int[llIIIIlll[1]];
        nArray[Z.llIIIIlll[0]] = llIIIIlll[9];
        if (Z.lIlIIlIIlIll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIIIIlll[9], llIIIIlll[37], llIIIIlll[51]);
            bv.add(d2);
            "".length();
        }
        int[] nArray2 = new int[llIIIIlll[1]];
        nArray2[Z.llIIIIlll[0]] = llIIIIlll[52];
        if (Z.lIlIIlIIlIll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIlllIlIIIllII = new d(llIIIIlll[52], llIIIIlll[10], llIIIIlll[51]);
            bv.add(lIlllIlIIIllII);
            "".length();
        }
        int[] nArray3 = new int[llIIIIlll[1]];
        nArray3[Z.llIIIIlll[0]] = llIIIIlll[49];
        if (Z.lIlIIlIIlIll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIlllIlIIIllII = new d(llIIIIlll[49], llIIIIlll[1], llIIIIlll[53]);
            bv.add(lIlllIlIIIllII);
            "".length();
        }
        int[] nArray4 = new int[llIIIIlll[1]];
        nArray4[Z.llIIIIlll[0]] = llIIIIlll[47];
        if (Z.lIlIIlIIlIll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIlllIlIIIllII = new d(llIIIIlll[47], llIIIIlll[1], llIIIIlll[54]);
            bv.add(lIlllIlIIIllII);
            "".length();
        }
        int[] nArray5 = new int[llIIIIlll[1]];
        nArray5[Z.llIIIIlll[0]] = llIIIIlll[11];
        if (Z.lIlIIlIIlIll(Bank.contains((int[])nArray5) ? 1 : 0)) {
            lIlllIlIIIllII = new d(llIIIIlll[11], llIIIIlll[12], llIIIIlll[55]);
            bv.add(lIlllIlIIIllII);
            "".length();
        }
        int[] nArray6 = new int[llIIIIlll[1]];
        nArray6[Z.llIIIIlll[0]] = llIIIIlll[40];
        if (Z.lIlIIlIIlIll(Bank.contains((int[])nArray6) ? 1 : 0)) {
            lIlllIlIIIllII = new d(llIIIIlll[40], llIIIIlll[1], llIIIIlll[56]);
            bv.add(lIlllIlIIIllII);
            "".length();
        }
        int[] nArray7 = new int[llIIIIlll[1]];
        nArray7[Z.llIIIIlll[0]] = llIIIIlll[44];
        if (Z.lIlIIlIIlIll(Bank.contains((int[])nArray7) ? 1 : 0)) {
            lIlllIlIIIllII = new d(llIIIIlll[44], llIIIIlll[1], llIIIIlll[56]);
            bv.add(lIlllIlIIIllII);
            "".length();
        }
        int[] nArray8 = new int[llIIIIlll[1]];
        nArray8[Z.llIIIIlll[0]] = llIIIIlll[45];
        if (Z.lIlIIlIIlIll(Bank.contains((int[])nArray8) ? 1 : 0)) {
            lIlllIlIIIllII = new d(llIIIIlll[45], llIIIIlll[1], llIIIIlll[56]);
            bv.add(lIlllIlIIIllII);
            "".length();
        }
        int[] nArray9 = new int[llIIIIlll[1]];
        nArray9[Z.llIIIIlll[0]] = llIIIIlll[42];
        if (Z.lIlIIlIIlIll(Bank.contains((int[])nArray9) ? 1 : 0)) {
            lIlllIlIIIllII = new d(llIIIIlll[42], llIIIIlll[1], llIIIIlll[56]);
            bv.add(lIlllIlIIIllII);
            "".length();
        }
        if (Z.lIlIIlIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIlll[37])) {
            int[] nArray10 = new int[llIIIIlll[1]];
            nArray10[Z.llIIIIlll[0]] = llIIIIlll[17];
            if (Z.lIlIIlIIlIll(Bank.contains((int[])nArray10) ? 1 : 0)) {
                lIlllIlIIIllII = new d(llIIIIlll[17], llIIIIlll[1], llIIIIlll[54]);
                bv.add(lIlllIlIIIllII);
                "".length();
            }
        }
        int[] nArray11 = new int[llIIIIlll[1]];
        nArray11[Z.llIIIIlll[0]] = llIIIIlll[16];
        if (Z.lIlIIlIIlIll(Bank.contains((int[])nArray11) ? 1 : 0)) {
            lIlllIlIIIllII = new d(llIIIIlll[16], llIIIIlll[1], llIIIIlll[56]);
            bv.add(lIlllIlIIIllII);
            "".length();
        }
    }

    private static boolean lIlIIlIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIIlIIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIlIIIlllIlI(String lIlllIIlIllIIl, String lIlllIIlIllIII) {
        try {
            SecretKeySpec lIlllIIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIIlIllIll = Cipher.getInstance("Blowfish");
            lIlllIIlIllIll.init(llIIIIlll[3], lIlllIIlIlllII);
            return new String(lIlllIIlIllIll.doFinal(Base64.getDecoder().decode(lIlllIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIlIllIlI) {
            lIlllIIlIllIlI.printStackTrace();
            return null;
        }
    }

    private static void lIlIIlIIIllI() {
        llIIIIlIl = new String[llIIIIlll[71]];
        Z.llIIIIlIl[Z.llIIIIlll[0]] = Z.lIlIIIlllIII("IlFLIHjcyM/FhTe6CZCPPQ==", "nqIFg");
        Z.llIIIIlIl[Z.llIIIIlll[1]] = Z.lIlIIIlllIIl("NCwPLhQaIAVnBQc8CCkAUiwVIgoBaUE0EBsxAi8OHCJBJQYRLkEzCFIoBCsCF2UVNQYbKwgpAA==", "rEaGg");
        Z.llIIIIlIl[Z.llIIIIlll[3]] = Z.lIlIIIlllIlI("x7ikuECbR8UHq5tDzZek93aaaaJSWcLC", "mMsaZ");
        Z.llIIIIlIl[Z.llIIIIlll[4]] = Z.lIlIIIlllIII("efRKOqiXAq5RvJvDFEbdBRDJyc3Porze", "vSrer");
        Z.llIIIIlIl[Z.llIIIIlll[6]] = Z.lIlIIIlllIlI("niEJBMdOGqZT6+JNEPlmZ7m/WtXVqRw9twoQH9WrHRS7ShgRlwTjn8OIlItYE/+d", "PgfkP");
        Z.llIIIIlIl[Z.llIIIIlll[10]] = Z.lIlIIIlllIII("175z6yuz/4QHjjUTYM5elQ==", "DRmeS");
        Z.llIIIIlIl[Z.llIIIIlll[14]] = Z.lIlIIIlllIII("wwzPFAA+hErQgWAybNfUUw==", "IwrFa");
        Z.llIIIIlIl[Z.llIIIIlll[15]] = Z.lIlIIIlllIlI("dZxSkk2UM7/8oZrpA58D0tdXw7Yym1hU", "GEjKY");
        Z.llIIIIlIl[Z.llIIIIlll[18]] = Z.lIlIIIlllIIl("KAMO", "mbzbt");
        Z.llIIIIlIl[Z.llIIIIlll[19]] = Z.lIlIIIlllIII("l+ZcciacLpj72MNLpJ6+uKYbgIDn3DVR", "VcZon");
        Z.llIIIIlIl[Z.llIIIIlll[20]] = Z.lIlIIIlllIIl("GiEkPSE/L2gyJyY7", "QHHQH");
        Z.llIIIIlIl[Z.llIIIIlll[21]] = Z.lIlIIIlllIlI("eXqv2l+NSqY=", "PuInM");
        Z.llIIIIlIl[Z.llIIIIlll[22]] = Z.lIlIIIlllIII("NYJ6QFlj7C8=", "LpJMF");
        Z.llIIIIlIl[Z.llIIIIlll[23]] = Z.lIlIIIlllIII("Q0Is3K6SBCU=", "mYYAX");
        Z.llIIIIlIl[Z.llIIIIlll[24]] = Z.lIlIIIlllIIl("AxY9Dgop", "BbIoi");
        Z.llIIIIlIl[Z.llIIIIlll[13]] = Z.lIlIIIlllIII("oknkIEqFXfrWwLDiW0Zmig==", "xRPlv");
        Z.llIIIIlIl[Z.llIIIIlll[25]] = Z.lIlIIIlllIIl("", "uxUoD");
        Z.llIIIIlIl[Z.llIIIIlll[28]] = Z.lIlIIIlllIIl("AwIOJFE5EwgnGD4REw==", "JpaJq");
        Z.llIIIIlIl[Z.llIIIIlll[29]] = Z.lIlIIIlllIII("XR6Dtm+YG2hcJjJ52rw7Cw==", "gDQem");
        Z.llIIIIlIl[Z.llIIIIlll[30]] = Z.lIlIIIlllIIl("ICQTIAA=", "wMvLd");
        Z.llIIIIlIl[Z.llIIIIlll[2]] = Z.lIlIIIlllIlI("wKa5mVd/DDl5ufSz1Kx2Wg==", "klgbV");
        Z.llIIIIlIl[Z.llIIIIlll[31]] = Z.lIlIIIlllIII("Bs/hMwyY9dGGjv4CqIYvkg==", "XWmMo");
        Z.llIIIIlIl[Z.llIIIIlll[32]] = Z.lIlIIIlllIIl("JToPPzM=", "rSjSW");
        Z.llIIIIlIl[Z.llIIIIlll[34]] = Z.lIlIIIlllIII("4LMtAtcdejxG7DJfG6ygMixVvecOmWNt", "KeDXg");
        Z.llIIIIlIl[Z.llIIIIlll[35]] = Z.lIlIIIlllIIl("HCIiDx84J3YUDjgmPxMMIw==", "QKVgm");
        Z.llIIIIlIl[Z.llIIIIlll[36]] = Z.lIlIIIlllIII("JGG5dJgzu5A=", "JrIPZ");
        Z.llIIIIlIl[Z.llIIIIlll[38]] = Z.lIlIIIlllIlI("my5+JivG+ho=", "mpvrQ");
        Z.llIIIIlIl[Z.llIIIIlll[39]] = Z.lIlIIIlllIII("OyC5LeIastA=", "wQLwk");
        Z.llIIIIlIl[Z.llIIIIlll[41]] = Z.lIlIIIlllIIl("OiIbFA==", "mGzfb");
        Z.llIIIIlIl[Z.llIIIIlll[43]] = Z.lIlIIIlllIIl("HCkKOw==", "KLkIh");
        Z.llIIIIlIl[Z.llIIIIlll[33]] = Z.lIlIIIlllIII("vg40mRoZ/As=", "LdgKk");
        Z.llIIIIlIl[Z.llIIIIlll[46]] = Z.lIlIIIlllIII("rKTzQ8dAfU8=", "bAqDg");
        Z.llIIIIlIl[Z.llIIIIlll[48]] = Z.lIlIIIlllIII("8P1O4adxKlE=", "cjNHL");
        Z.llIIIIlIl[Z.llIIIIlll[50]] = Z.lIlIIIlllIlI("ej/LwO7vWfA=", "HRicE");
        Z.llIIIIlIl[Z.llIIIIlll[57]] = Z.lIlIIIlllIIl("dlNjNjAi", "DcCrU");
        Z.llIIIIlIl[Z.llIIIIlll[58]] = Z.lIlIIIlllIIl("MSk/", "rFHJD");
    }

    @Override
    public boolean S() {
        return llIIIIlll[0];
    }

    public static void dn() {
        block17: {
            block19: {
                block18: {
                    if (Z.lIlIIlIIlIIl(bt ? 1 : 0)) {
                        AccBuilderEasyClues.c = llIIIIlIl[llIIIIlll[0]];
                        b.a(bv);
                        if (Z.lIlIIlIIlIlI(bv.size(), llIIIIlll[1])) {
                            System.out.println(llIIIIlIl[llIIIIlll[1]]);
                            bt = llIIIIlll[0];
                        }
                    }
                    if (!Z.lIlIIlIIlIll(bt ? 1 : 0)) break block17;
                    if (Z.lIlIIlIIlIll(Z.bH() ? 1 : 0) && Z.lIlIIlIIlIlI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIIlll[2])) {
                        BankLocation lIlllIlIIlIIlI = BankLocation.getNearest();
                        if (Z.lIlIIlIIllII(lIlllIlIIlIIlI) && Z.lIlIIlIIlIll(lIlllIlIIlIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = llIIIIlIl[llIIIIlll[3]];
                            a.a(lIlllIlIIlIIlI);
                        }
                        if (Z.lIlIIlIIllII(lIlllIlIIlIIlI) && Z.lIlIIlIIlIIl(lIlllIlIIlIIlI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderEasyClues.c = llIIIIlIl[llIIIIlll[4]];
                            if (Z.lIlIIlIIlIll(Bank.isOpen() ? 1 : 0)) {
                                a.a();
                                Time.sleepUntil(() -> Bank.isOpen(), (int)llIIIIlll[5]);
                                "".length();
                            }
                            if (Z.lIlIIlIIlIIl(Bank.isOpen() ? 1 : 0)) {
                                if (Z.lIlIIlIIllIl(Inventory.getAll().size())) {
                                    Bank.depositInventory();
                                    Time.sleepTicks((int)llIIIIlll[1]);
                                    "".length();
                                }
                                if (Z.lIlIIlIIllIl(Equipment.getAll().size())) {
                                    Bank.depositEquipment();
                                    Time.sleepTicks((int)llIIIIlll[3]);
                                    "".length();
                                }
                                if (Z.lIlIIlIIlIll(Z.dp() ? 1 : 0)) {
                                    Z.af();
                                    System.out.println(llIIIIlIl[llIIIIlll[6]]);
                                    bt = llIIIIlll[1];
                                    return;
                                }
                                a.a(kE, llIIIIlll[1]);
                                a.a(llIIIIlll[7], llIIIIlll[8]);
                                a.b(f.aV, llIIIIlll[1]);
                                a.a(llIIIIlll[9], llIIIIlll[10]);
                                a.a(llIIIIlll[11], llIIIIlll[12]);
                            }
                        }
                    }
                    if (!Z.lIlIIlIIlIIl(Z.bH() ? 1 : 0)) break block17;
                    Z.do();
                    if (Z.lIlIIlIIlllI(Movement.getRunEnergy(), llIIIIlll[13]) && Z.lIlIIlIIlIll(Movement.isRunEnabled() ? 1 : 0)) {
                        Movement.toggleRun();
                    }
                    String[] stringArray = new String[llIIIIlll[1]];
                    stringArray[Z.llIIIIlll[0]] = llIIIIlIl[llIIIIlll[10]];
                    if (!Z.lIlIIlIIlIll(Equipment.contains((String[])stringArray) ? 1 : 0)) break block18;
                    String[] stringArray2 = new String[llIIIIlll[1]];
                    stringArray2[Z.llIIIIlll[0]] = llIIIIlIl[llIIIIlll[14]];
                    if (!Z.lIlIIlIIlIll(Equipment.contains((String[])stringArray2) ? 1 : 0)) break block18;
                    String[] stringArray3 = new String[llIIIIlll[1]];
                    stringArray3[Z.llIIIIlll[0]] = llIIIIlIl[llIIIIlll[15]];
                    if (!Z.lIlIIlIIlIll(Equipment.contains((String[])stringArray3) ? 1 : 0)) break block18;
                    int[] nArray = new int[llIIIIlll[1]];
                    nArray[Z.llIIIIlll[0]] = llIIIIlll[16];
                    if (!Z.lIlIIlIIlIll(Equipment.contains((int[])nArray) ? 1 : 0)) break block18;
                    int[] nArray2 = new int[llIIIIlll[1]];
                    nArray2[Z.llIIIIlll[0]] = llIIIIlll[17];
                    if (!Z.lIlIIlIIlIIl(Equipment.contains((int[])nArray2) ? 1 : 0)) break block19;
                }
                Z.dq();
            }
            if (Z.lIlIIlIIllll(Z.lIlIIlIIlIII(e.u(), 45.0))) {
                int[] nArray = new int[llIIIIlll[1]];
                nArray[Z.llIIIIlll[0]] = llIIIIlll[11];
                if (Z.lIlIIlIIlIIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray3 = new int[llIIIIlll[1]];
                    nArray3[Z.llIIIIlll[0]] = llIIIIlll[11];
                    Inventory.getFirst((int[])nArray3).interact(llIIIIlIl[llIIIIlll[18]]);
                    Time.sleepTicks((int)llIIIIlll[1]);
                    "".length();
                }
            }
            if (Z.lIlIIlIIlllI(Skills.getLevel((Skill)Skill.ATTACK), llIIIIlll[2]) && Z.lIlIIlIIlllI(Skills.getLevel((Skill)Skill.STRENGTH), llIIIIlll[2])) {
                Z.aa();
            }
        }
    }

    private static boolean lIlIIlIIlIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIlIIllII(Object object) {
        return object != null;
    }

    @Override
    public boolean V() {
        boolean bl;
        if (Z.lIlIIlIIlllI(Skills.getLevel((Skill)Skill.DEFENCE), llIIIIlll[2])) {
            bl = llIIIIlll[1];
            "".length();
            if ("  ".length() > "  ".length()) {
                return ((0x40 ^ 0x47 ^ (0x49 ^ 0x10)) & (60 + 163 - 45 + 29 ^ 126 + 50 - 101 + 70 ^ -" ".length())) != 0;
            }
        } else {
            bl = llIIIIlll[0];
        }
        return bl;
    }

    private static boolean lIlIIlIIllll(int n2) {
        return n2 < 0;
    }

    static {
        Z.lIlIIlIIIlll();
        Z.lIlIIlIIIllI();
        bv = new ArrayList<d>();
        int[] nArray = new int[llIIIIlll[18]];
        nArray[Z.llIIIIlll[0]] = llIIIIlll[16];
        nArray[Z.llIIIIlll[1]] = llIIIIlll[17];
        nArray[Z.llIIIIlll[3]] = llIIIIlll[42];
        nArray[Z.llIIIIlll[4]] = llIIIIlll[44];
        nArray[Z.llIIIIlll[6]] = llIIIIlll[40];
        nArray[Z.llIIIIlll[10]] = llIIIIlll[45];
        nArray[Z.llIIIIlll[14]] = llIIIIlll[47];
        nArray[Z.llIIIIlll[15]] = llIIIIlll[49];
        kE = nArray;
        kF = new WorldArea(llIIIIlll[59], llIIIIlll[60], llIIIIlll[21], llIIIIlll[21], llIIIIlll[0]);
        kG = new WorldArea(llIIIIlll[61], llIIIIlll[62], llIIIIlll[31], llIIIIlll[25], llIIIIlll[0]);
        kH = new WorldArea(llIIIIlll[63], llIIIIlll[64], llIIIIlll[65], llIIIIlll[33], llIIIIlll[0]);
        kI = new WorldPoint(llIIIIlll[66], llIIIIlll[67], llIIIIlll[0]);
        bx = new WorldPoint(llIIIIlll[68], llIIIIlll[60], llIIIIlll[0]);
        kJ = new WorldPoint(llIIIIlll[69], llIIIIlll[70], llIIIIlll[0]);
    }
}

