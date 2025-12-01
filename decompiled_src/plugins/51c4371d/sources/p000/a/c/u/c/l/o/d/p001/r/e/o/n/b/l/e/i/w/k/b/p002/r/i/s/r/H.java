package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

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
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.H  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/H.class */
public class H implements F {
    public static /* synthetic */ boolean bz;
    public static /* synthetic */ WorldPoint iG;
    public static /* synthetic */ WorldArea iD;
    public static /* synthetic */ WorldPoint bD;
    public static /* synthetic */ WorldPoint iF;
    private static /* synthetic */ String[] lIlllllI;
    public static /* synthetic */ WorldArea iC;
    private static /* synthetic */ int[] llIIIIII;
    public static /* synthetic */ List<C0003d> bB;
    public static /* synthetic */ int[] iB;
    public static /* synthetic */ WorldArea iE;

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            cu();
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((92 ^ 58) ^ (12 ^ 87)) & (((46 ^ 63) ^ (15 ^ 35)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return llIIIIII[0];
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lIlllllI[llIIIIII[57]];
    }

    public static void cv() {
        if (lIlIIIlIIIl(Static.getClient().getVar(llIIIIII[22]), llIIIIII[1])) {
            Static.getClient().invokeMenuAction(lIlllllI[llIIIIII[13]], lIlllllI[llIIIIII[26]], llIIIIII[1], MenuAction.CC_OP.getId(), llIIIIII[27], llIIIIII[28]);
        }
        if (lIlIIIIlIlI(Skills.getLevel(Skill.ATTACK), llIIIIII[10])) {
            String[] strArr = new String[llIIIIII[1]];
            strArr[llIIIIII[0]] = lIlllllI[llIIIIII[29]];
            if (lIlIIIIlIIl(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[llIIIIII[1]];
                strArr2[llIIIIII[0]] = lIlllllI[llIIIIII[30]];
                Inventory.getFirst(strArr2).interact(lIlllllI[llIIIIII[31]]);
            }
        }
        if (lIlIIIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIII[10]) && lIlIIIIlIlI(Skills.getLevel(Skill.ATTACK), llIIIIII[19])) {
            String[] strArr3 = new String[llIIIIII[1]];
            strArr3[llIIIIII[0]] = lIlllllI[llIIIIII[19]];
            if (lIlIIIIlIIl(Inventory.contains(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[llIIIIII[1]];
                strArr4[llIIIIII[0]] = lIlllllI[llIIIIII[32]];
                Inventory.getFirst(strArr4).interact(lIlllllI[llIIIIII[33]]);
            }
        }
        if (lIlIIIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIII[19]) && lIlIIIIlIlI(Skills.getLevel(Skill.ATTACK), llIIIIII[34])) {
            String[] strArr5 = new String[llIIIIII[1]];
            strArr5[llIIIIII[0]] = lIlllllI[llIIIIII[35]];
            if (lIlIIIIlIIl(Inventory.contains(strArr5) ? 1 : 0)) {
                String[] strArr6 = new String[llIIIIII[1]];
                strArr6[llIIIIII[0]] = lIlllllI[llIIIIII[36]];
                Inventory.getFirst(strArr6).interact(lIlllllI[llIIIIII[37]]);
            }
        }
        if (lIlIIIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIII[34]) && lIlIIIIlIlI(Skills.getLevel(Skill.ATTACK), llIIIIII[2])) {
            int[] iArr = new int[llIIIIII[1]];
            iArr[llIIIIII[0]] = llIIIIII[16];
            if (lIlIIIIlIIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIIIII[1]];
                iArr2[llIIIIII[0]] = llIIIIII[16];
                Inventory.getFirst(iArr2).interact(lIlllllI[llIIIIII[38]]);
            }
        }
        if (lIlIIIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIII[2])) {
            int[] iArr3 = new int[llIIIIII[1]];
            iArr3[llIIIIII[0]] = llIIIIII[17];
            if (lIlIIIIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIIIII[1]];
                iArr4[llIIIIII[0]] = llIIIIII[17];
                Inventory.getFirst(iArr4).interact(lIlllllI[llIIIIII[39]]);
            }
        }
        if (lIlIIIIlllI(Skills.getLevel(Skill.DEFENCE), llIIIIII[34])) {
            int[] iArr5 = new int[llIIIIII[1]];
            iArr5[llIIIIII[0]] = llIIIIII[40];
            if (lIlIIIIlIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIIIII[1]];
                iArr6[llIIIIII[0]] = llIIIIII[40];
                Inventory.getFirst(iArr6).interact(lIlllllI[llIIIIII[41]]);
            }
            int[] iArr7 = new int[llIIIIII[1]];
            iArr7[llIIIIII[0]] = llIIIIII[42];
            if (lIlIIIIlIIl(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIIIII[1]];
                iArr8[llIIIIII[0]] = llIIIIII[42];
                Inventory.getFirst(iArr8).interact(lIlllllI[llIIIIII[43]]);
            }
            int[] iArr9 = new int[llIIIIII[1]];
            iArr9[llIIIIII[0]] = llIIIIII[44];
            if (lIlIIIIlIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIIIII[1]];
                iArr10[llIIIIII[0]] = llIIIIII[44];
                Inventory.getFirst(iArr10).interact(lIlllllI[llIIIIII[34]]);
            }
            int[] iArr11 = new int[llIIIIII[1]];
            iArr11[llIIIIII[0]] = llIIIIII[45];
            if (lIlIIIIlIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIIIII[1]];
                iArr12[llIIIIII[0]] = llIIIIII[45];
                Inventory.getFirst(iArr12).interact(lIlllllI[llIIIIII[46]]);
            }
        }
        int[] iArr13 = new int[llIIIIII[1]];
        iArr13[llIIIIII[0]] = llIIIIII[47];
        if (lIlIIIIlIIl(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[llIIIIII[1]];
            iArr14[llIIIIII[0]] = llIIIIII[47];
            Inventory.getFirst(iArr14).interact(lIlllllI[llIIIIII[48]]);
        }
        int[] iArr15 = new int[llIIIIII[1]];
        iArr15[llIIIIII[0]] = llIIIIII[49];
        if (lIlIIIIlIIl(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[llIIIIII[1]];
            iArr16[llIIIIII[0]] = llIIIIII[49];
            Inventory.getFirst(iArr16).interact(lIlllllI[llIIIIII[50]]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0082, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f6, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0130, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a4, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0225, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x025f, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0299, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02d3, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x030d, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0347, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0381, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean bm() {
        if (lIlIIIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIII[2])) {
            int[] iArr = new int[llIIIIII[1]];
            iArr[llIIIIII[0]] = llIIIIII[17];
            if (lIlIIIIlIll(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIIIII[1]];
                iArr2[llIIIIII[0]] = llIIIIII[17];
            }
            int[] iArr3 = new int[llIIIIII[1]];
            iArr3[llIIIIII[0]] = llIIIIII[42];
            if (lIlIIIIlIll(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIIIIII[1]];
                iArr4[llIIIIII[0]] = llIIIIII[42];
            }
            int[] iArr5 = new int[llIIIIII[1]];
            iArr5[llIIIIII[0]] = llIIIIII[44];
            if (lIlIIIIlIll(Equipment.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIIIIII[1]];
                iArr6[llIIIIII[0]] = llIIIIII[44];
            }
            int[] iArr7 = new int[llIIIIII[1]];
            iArr7[llIIIIII[0]] = llIIIIII[40];
            if (lIlIIIIlIll(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIIIII[1]];
                iArr8[llIIIIII[0]] = llIIIIII[40];
            }
            int[] iArr9 = new int[llIIIIII[1]];
            iArr9[llIIIIII[0]] = llIIIIII[45];
            if (lIlIIIIlIll(Equipment.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIIIIII[1]];
                iArr10[llIIIIII[0]] = llIIIIII[45];
            }
            int[] iArr11 = new int[llIIIIII[1]];
            iArr11[llIIIIII[0]] = llIIIIII[47];
            if (lIlIIIIlIll(Equipment.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIIIIII[1]];
                iArr12[llIIIIII[0]] = llIIIIII[47];
            }
            int[] iArr13 = new int[llIIIIII[1]];
            iArr13[llIIIIII[0]] = llIIIIII[49];
            if (lIlIIIIlIll(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIIIIII[1]];
                iArr14[llIIIIII[0]] = llIIIIII[49];
            }
            int[] iArr15 = new int[llIIIIII[1]];
            iArr15[llIIIIII[0]] = llIIIIII[11];
            if (lIlIIIIlIIl(Inventory.contains(iArr15) ? 1 : 0)) {
                ?? r0 = llIIIIII[1];
                "".length();
                return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIIIII[0];
        }
        int[] iArr16 = new int[llIIIIII[1]];
        iArr16[llIIIIII[0]] = llIIIIII[16];
        if (lIlIIIIlIll(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[llIIIIII[1]];
            iArr17[llIIIIII[0]] = llIIIIII[16];
        }
        int[] iArr18 = new int[llIIIIII[1]];
        iArr18[llIIIIII[0]] = llIIIIII[42];
        if (lIlIIIIlIll(Equipment.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[llIIIIII[1]];
            iArr19[llIIIIII[0]] = llIIIIII[42];
        }
        int[] iArr20 = new int[llIIIIII[1]];
        iArr20[llIIIIII[0]] = llIIIIII[44];
        if (lIlIIIIlIll(Equipment.contains(iArr20) ? 1 : 0)) {
            int[] iArr21 = new int[llIIIIII[1]];
            iArr21[llIIIIII[0]] = llIIIIII[44];
        }
        int[] iArr22 = new int[llIIIIII[1]];
        iArr22[llIIIIII[0]] = llIIIIII[40];
        if (lIlIIIIlIll(Equipment.contains(iArr22) ? 1 : 0)) {
            int[] iArr23 = new int[llIIIIII[1]];
            iArr23[llIIIIII[0]] = llIIIIII[40];
        }
        int[] iArr24 = new int[llIIIIII[1]];
        iArr24[llIIIIII[0]] = llIIIIII[45];
        if (lIlIIIIlIll(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[llIIIIII[1]];
            iArr25[llIIIIII[0]] = llIIIIII[45];
        }
        int[] iArr26 = new int[llIIIIII[1]];
        iArr26[llIIIIII[0]] = llIIIIII[47];
        if (lIlIIIIlIll(Equipment.contains(iArr26) ? 1 : 0)) {
            int[] iArr27 = new int[llIIIIII[1]];
            iArr27[llIIIIII[0]] = llIIIIII[47];
        }
        int[] iArr28 = new int[llIIIIII[1]];
        iArr28[llIIIIII[0]] = llIIIIII[49];
        if (lIlIIIIlIll(Equipment.contains(iArr28) ? 1 : 0)) {
            int[] iArr29 = new int[llIIIIII[1]];
            iArr29[llIIIIII[0]] = llIIIIII[49];
        }
        int[] iArr30 = new int[llIIIIII[1]];
        iArr30[llIIIIII[0]] = llIIIIII[11];
        if (lIlIIIIlIIl(Inventory.contains(iArr30) ? 1 : 0)) {
            ?? r02 = llIIIIII[1];
            "".length();
            return "  ".length() < " ".length() ? ((64 ^ 26) ^ (10 ^ 72)) & (((((99 + 120) - 110) + 36) ^ (((119 + 11) - 102) + 109)) ^ (-" ".length())) : r02;
        }
        return llIIIIII[0];
    }

    private static void lIlIIIIIllI() {
        llIIIIII = new int[72];
        llIIIIII[0] = ((((43 + 226) - 94) + 68) ^ (((18 + 81) - 10) + 84)) & (((((165 + 139) - 169) + 117) ^ (((47 + 100) - 42) + 57)) ^ (-" ".length()));
        llIIIIII[1] = " ".length();
        llIIIIII[2] = 152 ^ 176;
        llIIIIII[3] = "  ".length();
        llIIIIII[4] = "   ".length();
        llIIIIII[5] = (-((-449) & 19955)) & (-8258) & 32763;
        llIIIIII[6] = (234 ^ 199) ^ (165 ^ 140);
        llIIIIII[7] = (-((-681) & 21181)) & (-1) & 21495;
        llIIIIII[8] = (-((-5003) & 32670)) & (-5) & 28671;
        llIIIIII[9] = (-((-7551) & 23935)) & (-8249) & 32639;
        llIIIIII[10] = (188 ^ 140) ^ (191 ^ 138);
        llIIIIII[11] = (-8705) & 9083;
        llIIIIII[12] = (147 ^ 175) ^ (24 ^ 64);
        llIIIIII[13] = (42 ^ 68) ^ (21 ^ 116);
        llIIIIII[14] = 92 ^ 90;
        llIIIIII[15] = (((0 + 151) - 77) + 88) ^ (((11 + 133) - 111) + 132);
        llIIIIII[16] = (-((-1363) & 17883)) & (-14853) & 32703;
        llIIIIII[17] = (-6795) & 8127;
        llIIIIII[18] = (((141 + 24) - 101) + 118) ^ (((72 + 55) - 3) + 66);
        llIIIIII[19] = (218 ^ 147) ^ (117 ^ 40);
        llIIIIII[20] = 49 ^ 56;
        llIIIIII[21] = 61 ^ 55;
        llIIIIII[22] = 9 ^ 2;
        llIIIIII[23] = 123 ^ 119;
        llIIIIII[24] = (202 ^ 184) ^ (((125 + 109) - 107) + 0);
        llIIIIII[25] = (((55 + 1) - 40) + 127) ^ (((41 + 8) - 2) + 82);
        llIIIIII[26] = 62 ^ 46;
        llIIIIII[27] = -" ".length();
        llIIIIII[28] = (-4257) & 38867134;
        llIIIIII[29] = (((4 + 156) - 30) + 37) ^ (((101 + 124) - 84) + 41);
        llIIIIII[30] = (44 ^ 20) ^ (128 ^ 170);
        llIIIIII[31] = (((35 + 81) - 98) + 109) ^ (7 ^ 107);
        llIIIIII[32] = 151 ^ 130;
        llIIIIII[33] = (187 ^ 128) ^ (170 ^ 135);
        llIIIIII[34] = (139 ^ 199) ^ (16 ^ 66);
        llIIIIII[35] = 178 ^ 165;
        llIIIIII[36] = 156 ^ 132;
        llIIIIII[37] = 49 ^ 40;
        llIIIIII[38] = (11 ^ 62) ^ (16 ^ 63);
        llIIIIII[39] = (215 ^ 197) ^ (94 ^ 87);
        llIIIIII[40] = (-14673) & 15833;
        llIIIIII[41] = (87 ^ 116) ^ (33 ^ 30);
        llIIIIII[42] = (-((-129) & 27009)) & (-4625) & 32627;
        llIIIIII[43] = 126 ^ 99;
        llIIIIII[44] = (-21127) & 22199;
        llIIIIII[45] = (-6209) & 7407;
        llIIIIII[46] = 74 ^ 85;
        llIIIIII[47] = (-24599) & 26302;
        llIIIIII[48] = 136 ^ 168;
        llIIIIII[49] = (-((-2129) & 3282)) & (-4097) & 16375;
        llIIIIII[50] = (209 ^ 129) ^ (252 ^ 141);
        llIIIIII[51] = (-5244) & 6143;
        llIIIIII[52] = (-8193) & 16200;
        llIIIIII[53] = (-8961) & 43960;
        llIIIIII[54] = (-1542) & 26541;
        llIIIIII[55] = (-13828) & 14327;
        llIIIIII[56] = (-((-6737) & 24403)) & (-5) & 32670;
        llIIIIII[57] = (((36 + 75) - 55) + 82) ^ (((36 + 23) - 13) + 122);
        llIIIIII[58] = (7 ^ 110) ^ (195 ^ 137);
        llIIIIII[59] = (-((-1071) & 22127)) & (-8451) & 32731;
        llIIIIII[60] = (-16386) & 19675;
        llIIIIII[61] = (-((-6686) & 23071)) & (-8449) & 28077;
        llIIIIII[62] = (-21007) & 24286;
        llIIIIII[63] = (-((-3273) & 28621)) & (-131) & 28663;
        llIIIIII[64] = (-((-17471) & 22463)) & (-16417) & 24575;
        llIIIIII[65] = 143 ^ 191;
        llIIIIII[66] = (-16737) & 19949;
        llIIIIII[67] = (-((-16489) & 29545)) & (-16529) & 32765;
        llIIIIII[68] = (-((-11381) & 32637)) & (-8194) & 32703;
        llIIIIII[69] = (-((-155) & 29435)) & (-257) & 32767;
        llIIIIII[70] = (-((-3137) & 7519)) & (-8705) & 16382;
        llIIIIII[71] = 16 ^ 52;
    }

    private static boolean lIlIIIIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIIlIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlIIIIlIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIIIIlIll(int i) {
        return i == 0;
    }

    private static String lIlIIIIIIlI(String lIlIllIIlllIlIl, String lIlIllIIlllIlII) {
        String lIlIllIIlllIlIl2 = new String(Base64.getDecoder().decode(lIlIllIIlllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIllIIlllIIll = new StringBuilder();
        char[] charArray = lIlIllIIlllIlII.toCharArray();
        int lIlIllIIlllIIIl = llIIIIII[0];
        char[] charArray2 = lIlIllIIlllIlIl2.toCharArray();
        int length = charArray2.length;
        int i = llIIIIII[0];
        while (lIlIIIIlIlI(i, length)) {
            char lIlIllIIlllIllI = charArray2[i];
            lIlIllIIlllIIll.append((char) (lIlIllIIlllIllI ^ charArray[lIlIllIIlllIIIl % charArray.length]));
            "".length();
            lIlIllIIlllIIIl++;
            i++;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lIlIllIIlllIIll);
    }

    static {
        lIlIIIIIllI();
        lIlIIIIIIll();
        bB = new ArrayList();
        int[] iArr = new int[llIIIIII[18]];
        iArr[llIIIIII[0]] = llIIIIII[16];
        iArr[llIIIIII[1]] = llIIIIII[17];
        iArr[llIIIIII[3]] = llIIIIII[42];
        iArr[llIIIIII[4]] = llIIIIII[44];
        iArr[llIIIIII[6]] = llIIIIII[40];
        iArr[llIIIIII[10]] = llIIIIII[45];
        iArr[llIIIIII[14]] = llIIIIII[47];
        iArr[llIIIIII[15]] = llIIIIII[49];
        iB = iArr;
        iC = new WorldArea(llIIIIII[59], llIIIIII[60], llIIIIII[22], llIIIIII[22], llIIIIII[0]);
        iD = new WorldArea(llIIIIII[61], llIIIIII[62], llIIIIII[32], llIIIIII[26], llIIIIII[0]);
        iE = new WorldArea(llIIIIII[63], llIIIIII[64], llIIIIII[65], llIIIIII[34], llIIIIII[0]);
        iF = new WorldPoint(llIIIIII[66], llIIIIII[67], llIIIIII[0]);
        bD = new WorldPoint(llIIIIII[68], llIIIIII[60], llIIIIII[0]);
        iG = new WorldPoint(llIIIIII[69], llIIIIII[70], llIIIIII[0]);
    }

    private static boolean lIlIIIIlllI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIlIIIIlllI(Skills.getLevel(Skill.DEFENCE), llIIIIII[2])) {
            ?? r0 = llIIIIII[1];
            "".length();
            return (((69 ^ 92) ^ (78 ^ 103)) & (((92 ^ 23) ^ (43 ^ 80)) ^ (-" ".length()))) != 0 ? ((25 ^ 16) ^ (81 ^ 124)) & (("   ".length() ^ (158 ^ 185)) ^ (-" ".length())) : r0;
        }
        return llIIIIII[0];
    }

    public static void ag() {
        int[] iArr = new int[llIIIIII[1]];
        iArr[llIIIIII[0]] = llIIIIII[9];
        if (lIlIIIIlIll(Bank.contains(iArr) ? 1 : 0)) {
            bB.add(new C0003d(llIIIIII[9], llIIIIII[2], llIIIIII[51]));
            "".length();
        }
        int[] iArr2 = new int[llIIIIII[1]];
        iArr2[llIIIIII[0]] = llIIIIII[52];
        if (lIlIIIIlIll(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(llIIIIII[52], llIIIIII[10], llIIIIII[51]));
            "".length();
        }
        int[] iArr3 = new int[llIIIIII[1]];
        iArr3[llIIIIII[0]] = llIIIIII[49];
        if (lIlIIIIlIll(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(llIIIIII[49], llIIIIII[1], llIIIIII[53]));
            "".length();
        }
        int[] iArr4 = new int[llIIIIII[1]];
        iArr4[llIIIIII[0]] = llIIIIII[47];
        if (lIlIIIIlIll(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(llIIIIII[47], llIIIIII[1], llIIIIII[54]));
            "".length();
        }
        int[] iArr5 = new int[llIIIIII[1]];
        iArr5[llIIIIII[0]] = llIIIIII[11];
        if (lIlIIIIlIll(Bank.contains(iArr5) ? 1 : 0)) {
            bB.add(new C0003d(llIIIIII[11], llIIIIII[12], llIIIIII[55]));
            "".length();
        }
        int[] iArr6 = new int[llIIIIII[1]];
        iArr6[llIIIIII[0]] = llIIIIII[40];
        if (lIlIIIIlIll(Bank.contains(iArr6) ? 1 : 0)) {
            bB.add(new C0003d(llIIIIII[40], llIIIIII[1], llIIIIII[56]));
            "".length();
        }
        int[] iArr7 = new int[llIIIIII[1]];
        iArr7[llIIIIII[0]] = llIIIIII[44];
        if (lIlIIIIlIll(Bank.contains(iArr7) ? 1 : 0)) {
            bB.add(new C0003d(llIIIIII[44], llIIIIII[1], llIIIIII[56]));
            "".length();
        }
        int[] iArr8 = new int[llIIIIII[1]];
        iArr8[llIIIIII[0]] = llIIIIII[45];
        if (lIlIIIIlIll(Bank.contains(iArr8) ? 1 : 0)) {
            bB.add(new C0003d(llIIIIII[45], llIIIIII[1], llIIIIII[56]));
            "".length();
        }
        int[] iArr9 = new int[llIIIIII[1]];
        iArr9[llIIIIII[0]] = llIIIIII[42];
        if (lIlIIIIlIll(Bank.contains(iArr9) ? 1 : 0)) {
            bB.add(new C0003d(llIIIIII[42], llIIIIII[1], llIIIIII[56]));
            "".length();
        }
        if (lIlIIIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIII[2])) {
            int[] iArr10 = new int[llIIIIII[1]];
            iArr10[llIIIIII[0]] = llIIIIII[17];
            if (lIlIIIIlIll(Bank.contains(iArr10) ? 1 : 0)) {
                bB.add(new C0003d(llIIIIII[17], llIIIIII[1], llIIIIII[54]));
                "".length();
            }
        }
        int[] iArr11 = new int[llIIIIII[1]];
        iArr11[llIIIIII[0]] = llIIIIII[16];
        if (lIlIIIIlIll(Bank.contains(iArr11) ? 1 : 0)) {
            bB.add(new C0003d(llIIIIII[16], llIIIIII[1], llIIIIII[56]));
            "".length();
        }
    }

    private static String lIlIIIIIIIl(String lIlIllIlIIlIIlI, String lIlIllIlIIlIIIl) {
        try {
            SecretKeySpec lIlIllIlIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIllIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), llIIIIII[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIII[3], lIlIllIlIIlIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIllIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIlIIlIIll) {
            lIlIllIlIIlIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIIII(Object obj) {
        return obj == null;
    }

    private static boolean lIlIIIlIIIl(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0252, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cu() {
        if (lIlIIIIlIIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIlllllI[llIIIIII[0]];
            C0001b.a(bB);
            if (lIlIIIIlIlI(bB.size(), llIIIIII[1])) {
                System.out.println(lIlllllI[llIIIIII[1]]);
                bz = llIIIIII[0];
            }
        }
        if (lIlIIIIlIll(bz ? 1 : 0)) {
            if (lIlIIIIlIll(bm() ? 1 : 0) && lIlIIIIlIlI(Skills.getLevel(Skill.DEFENCE), llIIIIII[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIIIllII(nearest) && lIlIIIIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIlllllI[llIIIIII[3]];
                    C0000a.a(nearest);
                }
                if (lIlIIIIllII(nearest) && lIlIIIIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIlllllI[llIIIIII[4]];
                    if (lIlIIIIlIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIIIIII[5]);
                        "".length();
                    }
                    if (lIlIIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIlIIIIllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIIIIII[1]);
                            "".length();
                        }
                        if (lIlIIIIllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIIIIII[3]);
                            "".length();
                        }
                        if (lIlIIIIlIll(cw() ? 1 : 0)) {
                            ag();
                            System.out.println(lIlllllI[llIIIIII[6]]);
                            bz = llIIIIII[1];
                            return;
                        }
                        C0000a.a(iB, llIIIIII[1]);
                        C0000a.a(llIIIIII[7], llIIIIII[8]);
                        C0000a.b(C0005f.bb, llIIIIII[1]);
                        C0000a.a(llIIIIII[9], llIIIIII[10]);
                        C0000a.a(llIIIIII[11], llIIIIII[12]);
                    }
                }
            }
            if (lIlIIIIlIIl(bm() ? 1 : 0)) {
                cv();
                if (lIlIIIIlllI(Movement.getRunEnergy(), llIIIIII[13]) && lIlIIIIlIll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                String[] strArr = new String[llIIIIII[1]];
                strArr[llIIIIII[0]] = lIlllllI[llIIIIII[10]];
                if (lIlIIIIlIll(Equipment.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIIIIII[1]];
                    strArr2[llIIIIII[0]] = lIlllllI[llIIIIII[14]];
                    if (lIlIIIIlIll(Equipment.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[llIIIIII[1]];
                        strArr3[llIIIIII[0]] = lIlllllI[llIIIIII[15]];
                        if (lIlIIIIlIll(Equipment.contains(strArr3) ? 1 : 0)) {
                            int[] iArr = new int[llIIIIII[1]];
                            iArr[llIIIIII[0]] = llIIIIII[16];
                            if (lIlIIIIlIll(Equipment.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIIIIII[1]];
                                iArr2[llIIIIII[0]] = llIIIIII[17];
                            }
                        }
                    }
                }
                cx();
                if (lIlIIIIllll(lIlIIIIlIII(C0004e.v(), 45.0d))) {
                    int[] iArr3 = new int[llIIIIII[1]];
                    iArr3[llIIIIII[0]] = llIIIIII[11];
                    if (lIlIIIIlIIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[llIIIIII[1]];
                        iArr4[llIIIIII[0]] = llIIIIII[11];
                        Inventory.getFirst(iArr4).interact(lIlllllI[llIIIIII[18]]);
                        Time.sleepTicks(llIIIIII[1]);
                        "".length();
                    }
                }
                if (lIlIIIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIII[19]) && lIlIIIIlllI(Skills.getLevel(Skill.STRENGTH), llIIIIII[19])) {
                    C0009j.R();
                }
            }
        }
    }

    private static int lIlIIIIlIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return llIIIIII[0];
    }

    private static boolean lIlIIIIllll(int i) {
        return i < 0;
    }

    private static void lIlIIIIIIll() {
        lIlllllI = new String[llIIIIII[71]];
        lIlllllI[llIIIIII[0]] = lIlIIIIIIII("jt5TgXjt+R0VwoLI9TxxhA==", "OHDhF");
        lIlllllI[llIIIIII[1]] = lIlIIIIIIII("KHzvTZHbCgzdjzrQm/wBhqh2vwInyD9NYoXRdxve8ZdwPnr++w5sl/fKShWHF8409lGUTG9frvc=", "JCcWv");
        lIlllllI[llIIIIII[3]] = lIlIIIIIIIl("/QUCqdax/irHD7JX951RYyVBSxjCwYC+", "PYMLw");
        lIlllllI[llIIIIII[4]] = lIlIIIIIIIl("mk+b89NujsKk12YiL4Qpq1jn4/vfXXcn", "NbHGe");
        lIlllllI[llIIIIII[6]] = lIlIIIIIIIl("VrtUysmtDHTTq/jeh7nmoBmM1/p+WMS0Z4TUUEoq2mR1LzKXPInShPKmFXc2G9SA", "nnnIR");
        lIlllllI[llIIIIII[10]] = lIlIIIIIIIl("aquDGGV57T8xS8XlcRyRaQ==", "gyMwf");
        lIlllllI[llIIIIII[14]] = lIlIIIIIIlI("IwEqBD5QBiwIPxkBLhM=", "puOaR");
        lIlllllI[llIIIIII[15]] = lIlIIIIIIIl("zkZlndEOKEOJOGulaT2JBWeb19Bam54o", "yMaPT");
        lIlllllI[llIIIIII[18]] = lIlIIIIIIlI("Ci05", "OLMXQ");
        lIlllllI[llIIIIII[20]] = lIlIIIIIIIl("umkf6MhQn1A5gjd+5dUrpWMqrtOjZDDf", "UHPBL");
        lIlllllI[llIIIIII[21]] = lIlIIIIIIII("DGJVXYXinnzveJ6Jvjeb1Q==", "azpBC");
        lIlllllI[llIIIIII[22]] = lIlIIIIIIII("0Y01D0Dfufg=", "SKeRM");
        lIlllllI[llIIIIII[23]] = lIlIIIIIIlI("MioF", "QErtr");
        lIlllllI[llIIIIII[24]] = lIlIIIIIIIl("PTVutG9Lq5A=", "GpojS");
        lIlllllI[llIIIIII[25]] = lIlIIIIIIlI("FwMdMDQ9", "VwiQW");
        lIlllllI[llIIIIII[13]] = lIlIIIIIIII("NelX2w18TsOgYDOgRvIBMQ==", "raCFo");
        lIlllllI[llIIIIII[26]] = lIlIIIIIIIl("Ig8pLkqJUwk=", "psqbZ");
        lIlllllI[llIIIIII[29]] = lIlIIIIIIlI("Mx0cD0IJDBoMCw4OAQ==", "zosab");
        lIlllllI[llIIIIII[30]] = lIlIIIIIIlI("AAEMFG46EAoXJz0SEQ==", "IsczN");
        lIlllllI[llIIIIII[31]] = lIlIIIIIIlI("EBsIIx0=", "GrmOy");
        lIlllllI[llIIIIII[19]] = lIlIIIIIIIl("tyKW08yTGsdsQxjgIgyuUA==", "WAxJn");
        lIlllllI[llIIIIII[32]] = lIlIIIIIIlI("HBYCEihvEQQeKSYWBgU=", "ObgwD");
        lIlllllI[llIIIIII[33]] = lIlIIIIIIlI("GQwtCxA=", "NeHgt");
        lIlllllI[llIIIIII[35]] = lIlIIIIIIIl("QNdVNv5rpQHQvxONDVEVEUBx7BBwgc4k", "EQKbQ");
        lIlllllI[llIIIIII[36]] = lIlIIIIIIlI("KR8GOSYNGlIiNw0bGyU1Fg==", "dvrQT");
        lIlllllI[llIIIIII[37]] = lIlIIIIIIII("Lz1Ryu5jUHs=", "zANUm");
        lIlllllI[llIIIIII[38]] = lIlIIIIIIIl("utIDTIoKZmE=", "EQZtK");
        lIlllllI[llIIIIII[39]] = lIlIIIIIIlI("EjgnOwY=", "EQBWb");
        lIlllllI[llIIIIII[41]] = lIlIIIIIIlI("LxcLIg==", "xrjPW");
        lIlllllI[llIIIIII[43]] = lIlIIIIIIIl("lwxkTcX7SZA=", "RXFlW");
        lIlllllI[llIIIIII[34]] = lIlIIIIIIIl("to9g427fnyA=", "YwqGe");
        lIlllllI[llIIIIII[46]] = lIlIIIIIIII("oKGRBEOf1LI=", "nNlfy");
        lIlllllI[llIIIIII[48]] = lIlIIIIIIlI("MT0qNg==", "fXKDh");
        lIlllllI[llIIIIII[50]] = lIlIIIIIIIl("bnQ8amYuTmw=", "MVLra");
        lIlllllI[llIIIIII[57]] = lIlIIIIIIIl("szb6/ffOdPo=", "WjOMU");
        lIlllllI[llIIIIII[58]] = lIlIIIIIIlI("CgAh", "IoVQv");
    }

    private static boolean lIlIIIIllII(Object obj) {
        return obj != null;
    }

    public static void ab() {
        if (lIlIIIIlIll(iD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIlllllI[llIIIIII[20]];
            Movement.walkTo(bD);
            "".length();
            Time.sleepTicks(llIIIIII[1]);
            "".length();
        }
        if (lIlIIIIlIIl(iD.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lIlllllI[llIIIIII[21]];
            if (lIlIIIlIIII(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIlIIIIlIIl(npc.getName().contains(lIlllllI[llIIIIII[58]]) ? 1 : 0) && lIlIIIlIIII(npc.getInteracting()) && lIlIIIIlIll(npc.isDead() ? 1 : 0)) {
                        ?? r0 = llIIIIII[1];
                        "".length();
                        return (((56 ^ 23) ^ (158 ^ 149)) & (((((128 + 13) - 69) + 74) ^ (((20 + 80) - 84) + 166)) ^ (-" ".length()))) != 0 ? ((69 ^ 83) ^ (4 ^ 49)) & (((190 ^ 142) ^ (137 ^ 154)) ^ (-" ".length())) : r0;
                    }
                    return llIIIIII[0];
                });
                String[] strArr = new String[llIIIIII[3]];
                strArr[llIIIIII[0]] = lIlllllI[llIIIIII[22]];
                strArr[llIIIIII[1]] = lIlllllI[llIIIIII[23]];
                List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                    if (lIlIIIlIlII(npc2.getInteracting(), Players.getLocal())) {
                        ?? r0 = llIIIIII[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIIIII[0];
                }).collect(Collectors.toList());
                if (lIlIIIIlIll(list.isEmpty() ? 1 : 0)) {
                    ((NPC) list.get(llIIIIII[0])).interact(lIlllllI[llIIIIII[24]]);
                    Time.sleepTicks(llIIIIII[3]);
                    "".length();
                }
                if (lIlIIIIllII(nearest) && lIlIIIIlIll(Players.getLocal().isMoving() ? 1 : 0) && lIlIIIIlIIl(list.isEmpty() ? 1 : 0)) {
                    nearest.interact(lIlllllI[llIIIIII[25]]);
                    Time.sleepTicks(llIIIIII[3]);
                    "".length();
                }
            }
            if (lIlIIIIllII(Players.getLocal().getInteracting())) {
                Time.sleepTicks(llIIIIII[6]);
                "".length();
            }
        }
    }

    public static void cx() {
        if (lIlIIIIlIlI(Skills.getLevel(Skill.DEFENCE), llIIIIII[2])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
    }

    private static boolean lIlIIIIllIl(int i) {
        return i > 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0577, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x05c8, code lost:
        return p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.H.llIIIIII[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0113, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c1, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0218, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x026f, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02a9, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02de, code lost:
        return p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.H.llIIIIII[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0333, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x038a, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03e1, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0438, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x048f, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04e6, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x053d, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
        if (lIlIIIIlIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v230, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean cw() {
        if (lIlIIIIlllI(Skills.getLevel(Skill.ATTACK), llIIIIII[2])) {
            int[] iArr = new int[llIIIIII[1]];
            iArr[llIIIIII[0]] = llIIIIII[17];
            if (lIlIIIIlIll(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIIIIII[1]];
                iArr2[llIIIIII[0]] = llIIIIII[17];
                if (lIlIIIIlIll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIIIIII[1]];
                    iArr3[llIIIIII[0]] = llIIIIII[17];
                }
            }
            int[] iArr4 = new int[llIIIIII[1]];
            iArr4[llIIIIII[0]] = llIIIIII[42];
            if (lIlIIIIlIll(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[llIIIIII[1]];
                iArr5[llIIIIII[0]] = llIIIIII[42];
                if (lIlIIIIlIll(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[llIIIIII[1]];
                    iArr6[llIIIIII[0]] = llIIIIII[42];
                }
            }
            int[] iArr7 = new int[llIIIIII[1]];
            iArr7[llIIIIII[0]] = llIIIIII[44];
            if (lIlIIIIlIll(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIIIIII[1]];
                iArr8[llIIIIII[0]] = llIIIIII[44];
                if (lIlIIIIlIll(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[llIIIIII[1]];
                    iArr9[llIIIIII[0]] = llIIIIII[44];
                }
            }
            int[] iArr10 = new int[llIIIIII[1]];
            iArr10[llIIIIII[0]] = llIIIIII[40];
            if (lIlIIIIlIll(Equipment.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[llIIIIII[1]];
                iArr11[llIIIIII[0]] = llIIIIII[40];
                if (lIlIIIIlIll(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[llIIIIII[1]];
                    iArr12[llIIIIII[0]] = llIIIIII[40];
                }
            }
            int[] iArr13 = new int[llIIIIII[1]];
            iArr13[llIIIIII[0]] = llIIIIII[45];
            if (lIlIIIIlIll(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIIIIII[1]];
                iArr14[llIIIIII[0]] = llIIIIII[45];
                if (lIlIIIIlIll(Inventory.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llIIIIII[1]];
                    iArr15[llIIIIII[0]] = llIIIIII[45];
                }
            }
            int[] iArr16 = new int[llIIIIII[1]];
            iArr16[llIIIIII[0]] = llIIIIII[47];
            if (lIlIIIIlIll(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIIIIII[1]];
                iArr17[llIIIIII[0]] = llIIIIII[47];
                if (lIlIIIIlIll(Equipment.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIIIIII[1]];
                    iArr18[llIIIIII[0]] = llIIIIII[47];
                }
            }
            int[] iArr19 = new int[llIIIIII[1]];
            iArr19[llIIIIII[0]] = llIIIIII[49];
            if (lIlIIIIlIll(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIIIIII[1]];
                iArr20[llIIIIII[0]] = llIIIIII[49];
                if (lIlIIIIlIll(Equipment.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[llIIIIII[1]];
                    iArr21[llIIIIII[0]] = llIIIIII[49];
                }
            }
            int[] iArr22 = new int[llIIIIII[1]];
            iArr22[llIIIIII[0]] = llIIIIII[11];
            if (lIlIIIIlIll(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[llIIIIII[1]];
                iArr23[llIIIIII[0]] = llIIIIII[11];
            }
            ?? r0 = llIIIIII[1];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        int[] iArr24 = new int[llIIIIII[1]];
        iArr24[llIIIIII[0]] = llIIIIII[16];
        if (lIlIIIIlIll(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[llIIIIII[1]];
            iArr25[llIIIIII[0]] = llIIIIII[16];
            if (lIlIIIIlIll(Inventory.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[llIIIIII[1]];
                iArr26[llIIIIII[0]] = llIIIIII[16];
            }
        }
        int[] iArr27 = new int[llIIIIII[1]];
        iArr27[llIIIIII[0]] = llIIIIII[42];
        if (lIlIIIIlIll(Equipment.contains(iArr27) ? 1 : 0)) {
            int[] iArr28 = new int[llIIIIII[1]];
            iArr28[llIIIIII[0]] = llIIIIII[42];
            if (lIlIIIIlIll(Inventory.contains(iArr28) ? 1 : 0)) {
                int[] iArr29 = new int[llIIIIII[1]];
                iArr29[llIIIIII[0]] = llIIIIII[42];
            }
        }
        int[] iArr30 = new int[llIIIIII[1]];
        iArr30[llIIIIII[0]] = llIIIIII[44];
        if (lIlIIIIlIll(Equipment.contains(iArr30) ? 1 : 0)) {
            int[] iArr31 = new int[llIIIIII[1]];
            iArr31[llIIIIII[0]] = llIIIIII[44];
            if (lIlIIIIlIll(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[llIIIIII[1]];
                iArr32[llIIIIII[0]] = llIIIIII[44];
            }
        }
        int[] iArr33 = new int[llIIIIII[1]];
        iArr33[llIIIIII[0]] = llIIIIII[40];
        if (lIlIIIIlIll(Equipment.contains(iArr33) ? 1 : 0)) {
            int[] iArr34 = new int[llIIIIII[1]];
            iArr34[llIIIIII[0]] = llIIIIII[40];
            if (lIlIIIIlIll(Inventory.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[llIIIIII[1]];
                iArr35[llIIIIII[0]] = llIIIIII[40];
            }
        }
        int[] iArr36 = new int[llIIIIII[1]];
        iArr36[llIIIIII[0]] = llIIIIII[45];
        if (lIlIIIIlIll(Equipment.contains(iArr36) ? 1 : 0)) {
            int[] iArr37 = new int[llIIIIII[1]];
            iArr37[llIIIIII[0]] = llIIIIII[45];
            if (lIlIIIIlIll(Inventory.contains(iArr37) ? 1 : 0)) {
                int[] iArr38 = new int[llIIIIII[1]];
                iArr38[llIIIIII[0]] = llIIIIII[45];
            }
        }
        int[] iArr39 = new int[llIIIIII[1]];
        iArr39[llIIIIII[0]] = llIIIIII[47];
        if (lIlIIIIlIll(Inventory.contains(iArr39) ? 1 : 0)) {
            int[] iArr40 = new int[llIIIIII[1]];
            iArr40[llIIIIII[0]] = llIIIIII[47];
            if (lIlIIIIlIll(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[llIIIIII[1]];
                iArr41[llIIIIII[0]] = llIIIIII[47];
            }
        }
        int[] iArr42 = new int[llIIIIII[1]];
        iArr42[llIIIIII[0]] = llIIIIII[49];
        if (lIlIIIIlIll(Inventory.contains(iArr42) ? 1 : 0)) {
            int[] iArr43 = new int[llIIIIII[1]];
            iArr43[llIIIIII[0]] = llIIIIII[49];
            if (lIlIIIIlIll(Equipment.contains(iArr43) ? 1 : 0)) {
                int[] iArr44 = new int[llIIIIII[1]];
                iArr44[llIIIIII[0]] = llIIIIII[49];
            }
        }
        int[] iArr45 = new int[llIIIIII[1]];
        iArr45[llIIIIII[0]] = llIIIIII[11];
        if (lIlIIIIlIll(Inventory.contains(iArr45) ? 1 : 0)) {
            int[] iArr46 = new int[llIIIIII[1]];
            iArr46[llIIIIII[0]] = llIIIIII[11];
        }
        ?? r02 = llIIIIII[1];
        "".length();
        return ((112 ^ 86) ^ (126 ^ 92)) <= " ".length() ? ((((138 + 123) - 174) + 127) ^ (((4 + 97) - 63) + 111)) & (((47 ^ 0) ^ (85 ^ 57)) ^ (-" ".length())) : r02;
    }

    private static String lIlIIIIIIII(String lIlIllIlIIIIlIl, String lIlIllIlIIIIlII) {
        try {
            SecretKeySpec lIlIllIlIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIllIlIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIllIlIIIIlll = Cipher.getInstance("Blowfish");
            lIlIllIlIIIIlll.init(llIIIIII[3], lIlIllIlIIIlIII);
            return new String(lIlIllIlIIIIlll.doFinal(Base64.getDecoder().decode(lIlIllIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIllIlIIIIllI) {
            lIlIllIlIIIIllI.printStackTrace();
            return null;
        }
    }
}
