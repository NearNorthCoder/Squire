package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

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
import net.runelite.api.TileItem;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.m  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/m.class */
public class C0012m implements G {
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ int[] lIIlIllIIl;
    private static /* synthetic */ String[] lIIlIlIlll;
    public static /* synthetic */ boolean bt;

    /* JADX WARN: Code restructure failed: missing block: B:101:0x052d, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x05ea, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0624, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x065e, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0698, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x06d2, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x070c, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0746, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0780, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x07ba, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00aa, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e4, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x011e, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0158, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0192, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x025a, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0294, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02ce, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0308, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0342, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x037c, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0445, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x047f, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x04b9, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04f3, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v142, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v164, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v213, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v240, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v289, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v316, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ab() {
        if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7]) && llllllllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIllIIl[41]) && llllllllIIIl(Skills.getLevel(Skill.DEFENCE), lIIlIllIIl[36])) {
            int[] iArr = new int[lIIlIllIIl[1]];
            iArr[lIIlIllIIl[0]] = lIIlIllIIl[9];
            if (lllllllIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIllIIl[1]];
                iArr2[lIIlIllIIl[0]] = lIIlIllIIl[9];
            }
            int[] iArr3 = new int[lIIlIllIIl[1]];
            iArr3[lIIlIllIIl[0]] = lIIlIllIIl[10];
            if (lllllllIlllI(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIIlIllIIl[1]];
                iArr4[lIIlIllIIl[0]] = lIIlIllIIl[10];
            }
            int[] iArr5 = new int[lIIlIllIIl[1]];
            iArr5[lIIlIllIIl[0]] = lIIlIllIIl[18];
            if (lllllllIlllI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIlIllIIl[1]];
                iArr6[lIIlIllIIl[0]] = lIIlIllIIl[18];
            }
            int[] iArr7 = new int[lIIlIllIIl[1]];
            iArr7[lIIlIllIIl[0]] = lIIlIllIIl[20];
            if (lllllllIlllI(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIlIllIIl[1]];
                iArr8[lIIlIllIIl[0]] = lIIlIllIIl[20];
            }
            int[] iArr9 = new int[lIIlIllIIl[1]];
            iArr9[lIIlIllIIl[0]] = lIIlIllIIl[11];
            if (lllllllIlllI(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIIlIllIIl[1]];
                iArr10[lIIlIllIIl[0]] = lIIlIllIIl[11];
            }
            int[] iArr11 = new int[lIIlIllIIl[1]];
            iArr11[lIIlIllIIl[0]] = lIIlIllIIl[8];
            if (lllllllIlllI(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIlIllIIl[1]];
                iArr12[lIIlIllIIl[0]] = lIIlIllIIl[8];
            }
            int[] iArr13 = new int[lIIlIllIIl[1]];
            iArr13[lIIlIllIIl[0]] = lIIlIllIIl[26];
            if (lllllllIllII(Inventory.contains(iArr13) ? 1 : 0)) {
                ?? r0 = lIIlIllIIl[1];
                "".length();
                return (-" ".length()) >= ((101 ^ 70) & ((3 ^ 32) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIlIllIIl[0];
        } else if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7]) && llllllllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIllIIl[41]) && lllllllIllIl(Skills.getLevel(Skill.DEFENCE), lIIlIllIIl[36])) {
            int[] iArr14 = new int[lIIlIllIIl[1]];
            iArr14[lIIlIllIIl[0]] = lIIlIllIIl[9];
            if (lllllllIlllI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIlIllIIl[1]];
                iArr15[lIIlIllIIl[0]] = lIIlIllIIl[9];
            }
            int[] iArr16 = new int[lIIlIllIIl[1]];
            iArr16[lIIlIllIIl[0]] = lIIlIllIIl[19];
            if (lllllllIlllI(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIlIllIIl[1]];
                iArr17[lIIlIllIIl[0]] = lIIlIllIIl[19];
            }
            int[] iArr18 = new int[lIIlIllIIl[1]];
            iArr18[lIIlIllIIl[0]] = lIIlIllIIl[18];
            if (lllllllIlllI(Inventory.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIlIllIIl[1]];
                iArr19[lIIlIllIIl[0]] = lIIlIllIIl[18];
            }
            int[] iArr20 = new int[lIIlIllIIl[1]];
            iArr20[lIIlIllIIl[0]] = lIIlIllIIl[20];
            if (lllllllIlllI(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIlIllIIl[1]];
                iArr21[lIIlIllIIl[0]] = lIIlIllIIl[20];
            }
            int[] iArr22 = new int[lIIlIllIIl[1]];
            iArr22[lIIlIllIIl[0]] = lIIlIllIIl[11];
            if (lllllllIlllI(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lIIlIllIIl[1]];
                iArr23[lIIlIllIIl[0]] = lIIlIllIIl[11];
            }
            int[] iArr24 = new int[lIIlIllIIl[1]];
            iArr24[lIIlIllIIl[0]] = lIIlIllIIl[8];
            if (lllllllIlllI(Inventory.contains(iArr24) ? 1 : 0)) {
                int[] iArr25 = new int[lIIlIllIIl[1]];
                iArr25[lIIlIllIIl[0]] = lIIlIllIIl[8];
            }
            int[] iArr26 = new int[lIIlIllIIl[1]];
            iArr26[lIIlIllIIl[0]] = lIIlIllIIl[26];
            if (lllllllIllII(Inventory.contains(iArr26) ? 1 : 0)) {
                ?? r02 = lIIlIllIIl[1];
                "".length();
                return ((((39 + 119) - 107) + 133) ^ (((83 + 174) - 119) + 50)) <= 0 ? ((91 ^ 102) ^ (30 ^ 119)) & (((61 ^ 44) ^ (209 ^ 148)) ^ (-" ".length())) : r02;
            }
            return lIIlIllIIl[0];
        } else if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[27]) && lllllllIllIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7])) {
            int[] iArr27 = new int[lIIlIllIIl[1]];
            iArr27[lIIlIllIIl[0]] = lIIlIllIIl[17];
            if (lllllllIlllI(Inventory.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[lIIlIllIIl[1]];
                iArr28[lIIlIllIIl[0]] = lIIlIllIIl[17];
            }
            int[] iArr29 = new int[lIIlIllIIl[1]];
            iArr29[lIIlIllIIl[0]] = lIIlIllIIl[19];
            if (lllllllIlllI(Inventory.contains(iArr29) ? 1 : 0)) {
                int[] iArr30 = new int[lIIlIllIIl[1]];
                iArr30[lIIlIllIIl[0]] = lIIlIllIIl[19];
            }
            int[] iArr31 = new int[lIIlIllIIl[1]];
            iArr31[lIIlIllIIl[0]] = lIIlIllIIl[18];
            if (lllllllIlllI(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[lIIlIllIIl[1]];
                iArr32[lIIlIllIIl[0]] = lIIlIllIIl[18];
            }
            int[] iArr33 = new int[lIIlIllIIl[1]];
            iArr33[lIIlIllIIl[0]] = lIIlIllIIl[20];
            if (lllllllIlllI(Inventory.contains(iArr33) ? 1 : 0)) {
                int[] iArr34 = new int[lIIlIllIIl[1]];
                iArr34[lIIlIllIIl[0]] = lIIlIllIIl[20];
            }
            int[] iArr35 = new int[lIIlIllIIl[1]];
            iArr35[lIIlIllIIl[0]] = lIIlIllIIl[16];
            if (lllllllIlllI(Inventory.contains(iArr35) ? 1 : 0)) {
                int[] iArr36 = new int[lIIlIllIIl[1]];
                iArr36[lIIlIllIIl[0]] = lIIlIllIIl[16];
            }
            int[] iArr37 = new int[lIIlIllIIl[1]];
            iArr37[lIIlIllIIl[0]] = lIIlIllIIl[26];
            if (lllllllIllII(Inventory.contains(iArr37) ? 1 : 0)) {
                ?? r03 = lIIlIllIIl[1];
                "".length();
                return (((172 ^ 150) ^ (112 ^ 123)) & (((((146 + 41) - 151) + 116) ^ (((128 + 56) - 110) + 95)) ^ (-" ".length()))) != 0 ? ((180 ^ 129) ^ (44 ^ 15)) & (((246 ^ 130) ^ (38 ^ 68)) ^ (-" ".length())) : r03;
            }
            return lIIlIllIIl[0];
        } else {
            int[] iArr38 = new int[lIIlIllIIl[1]];
            iArr38[lIIlIllIIl[0]] = lIIlIllIIl[17];
            if (lllllllIlllI(Inventory.contains(iArr38) ? 1 : 0)) {
                int[] iArr39 = new int[lIIlIllIIl[1]];
                iArr39[lIIlIllIIl[0]] = lIIlIllIIl[17];
            }
            int[] iArr40 = new int[lIIlIllIIl[1]];
            iArr40[lIIlIllIIl[0]] = lIIlIllIIl[19];
            if (lllllllIlllI(Inventory.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[lIIlIllIIl[1]];
                iArr41[lIIlIllIIl[0]] = lIIlIllIIl[19];
            }
            int[] iArr42 = new int[lIIlIllIIl[1]];
            iArr42[lIIlIllIIl[0]] = lIIlIllIIl[18];
            if (lllllllIlllI(Inventory.contains(iArr42) ? 1 : 0)) {
                int[] iArr43 = new int[lIIlIllIIl[1]];
                iArr43[lIIlIllIIl[0]] = lIIlIllIIl[18];
            }
            int[] iArr44 = new int[lIIlIllIIl[1]];
            iArr44[lIIlIllIIl[0]] = lIIlIllIIl[20];
            if (lllllllIlllI(Inventory.contains(iArr44) ? 1 : 0)) {
                int[] iArr45 = new int[lIIlIllIIl[1]];
                iArr45[lIIlIllIIl[0]] = lIIlIllIIl[20];
            }
            int[] iArr46 = new int[lIIlIllIIl[1]];
            iArr46[lIIlIllIIl[0]] = lIIlIllIIl[15];
            if (lllllllIlllI(Inventory.contains(iArr46) ? 1 : 0)) {
                int[] iArr47 = new int[lIIlIllIIl[1]];
                iArr47[lIIlIllIIl[0]] = lIIlIllIIl[15];
            }
            int[] iArr48 = new int[lIIlIllIIl[1]];
            iArr48[lIIlIllIIl[0]] = lIIlIllIIl[12];
            if (lllllllIlllI(Inventory.contains(iArr48) ? 1 : 0)) {
                int[] iArr49 = new int[lIIlIllIIl[1]];
                iArr49[lIIlIllIIl[0]] = lIIlIllIIl[12];
            }
            int[] iArr50 = new int[lIIlIllIIl[1]];
            iArr50[lIIlIllIIl[0]] = lIIlIllIIl[13];
            if (lllllllIlllI(Inventory.contains(iArr50) ? 1 : 0)) {
                int[] iArr51 = new int[lIIlIllIIl[1]];
                iArr51[lIIlIllIIl[0]] = lIIlIllIIl[13];
            }
            int[] iArr52 = new int[lIIlIllIIl[1]];
            iArr52[lIIlIllIIl[0]] = lIIlIllIIl[14];
            if (lllllllIlllI(Inventory.contains(iArr52) ? 1 : 0)) {
                int[] iArr53 = new int[lIIlIllIIl[1]];
                iArr53[lIIlIllIIl[0]] = lIIlIllIIl[14];
            }
            int[] iArr54 = new int[lIIlIllIIl[1]];
            iArr54[lIIlIllIIl[0]] = lIIlIllIIl[16];
            if (lllllllIlllI(Inventory.contains(iArr54) ? 1 : 0)) {
                int[] iArr55 = new int[lIIlIllIIl[1]];
                iArr55[lIIlIllIIl[0]] = lIIlIllIIl[16];
            }
            int[] iArr56 = new int[lIIlIllIIl[1]];
            iArr56[lIIlIllIIl[0]] = lIIlIllIIl[26];
            if (lllllllIllII(Inventory.contains(iArr56) ? 1 : 0)) {
                ?? r04 = lIIlIllIIl[1];
                "".length();
                return 0 != 0 ? "  ".length() & ("  ".length() ^ (-" ".length())) : r04;
            }
            return lIIlIllIIl[0];
        }
    }

    private static boolean lllllllIllIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7])) {
            ?? r0 = lIIlIllIIl[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIlIllIIl[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0121, code lost:
        if (lllllllIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0012m.lIIlIllIIl[47]) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x04b8, code lost:
        if (lllllllIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0012m.lIIlIllIIl[24]) != false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0501  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        if (lllllllIllIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[27])) {
            int[] iArr2 = new int[lIIlIllIIl[1]];
            iArr2[lIIlIllIIl[0]] = lIIlIllIIl[12];
            if (lllllllIlllI(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIllIIl[12], lIIlIllIIl[1], lIIlIllIIl[46]));
                "".length();
            }
            int[] iArr3 = new int[lIIlIllIIl[1]];
            iArr3[lIIlIllIIl[0]] = lIIlIllIIl[13];
            if (lllllllIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIllIIl[13], lIIlIllIIl[1], lIIlIllIIl[46]));
                "".length();
            }
            int[] iArr4 = new int[lIIlIllIIl[1]];
            iArr4[lIIlIllIIl[0]] = lIIlIllIIl[14];
            if (lllllllIlllI(Bank.contains(iArr4) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIllIIl[14], lIIlIllIIl[1], lIIlIllIIl[46]));
                "".length();
            }
            int[] iArr5 = new int[lIIlIllIIl[1]];
            iArr5[lIIlIllIIl[0]] = lIIlIllIIl[15];
            if (lllllllIllII(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIlIllIIl[1]];
                iArr6[lIIlIllIIl[0]] = lIIlIllIIl[15];
            }
            bv.add(new C0003d(lIIlIllIIl[15], lIIlIllIIl[48], lIIlIllIIl[35]));
            "".length();
        }
        int[] iArr7 = new int[lIIlIllIIl[1]];
        iArr7[lIIlIllIIl[0]] = lIIlIllIIl[18];
        if (lllllllIlllI(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIIl[18], lIIlIllIIl[1], lIIlIllIIl[49]));
            "".length();
        }
        int[] iArr8 = new int[lIIlIllIIl[1]];
        iArr8[lIIlIllIIl[0]] = lIIlIllIIl[19];
        if (lllllllIlllI(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIIl[19], lIIlIllIIl[1], lIIlIllIIl[49]));
            "".length();
        }
        int[] iArr9 = new int[lIIlIllIIl[1]];
        iArr9[lIIlIllIIl[0]] = lIIlIllIIl[17];
        if (lllllllIlllI(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIIl[17], lIIlIllIIl[1], lIIlIllIIl[49]));
            "".length();
        }
        int[] iArr10 = new int[lIIlIllIIl[1]];
        iArr10[lIIlIllIIl[0]] = lIIlIllIIl[20];
        if (lllllllIlllI(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIIl[20], lIIlIllIIl[1], lIIlIllIIl[50]));
            "".length();
        }
        if (lllllllIllIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7])) {
            int[] iArr11 = new int[lIIlIllIIl[1]];
            iArr11[lIIlIllIIl[0]] = lIIlIllIIl[16];
            if (lllllllIlllI(Bank.contains(iArr11) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIllIIl[16], lIIlIllIIl[51], lIIlIllIIl[42]));
                "".length();
            }
        }
        int[] iArr12 = new int[lIIlIllIIl[1]];
        iArr12[lIIlIllIIl[0]] = lIIlIllIIl[9];
        if (lllllllIlllI(Bank.contains(iArr12) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIIl[9], lIIlIllIIl[1], lIIlIllIIl[52]));
            "".length();
        }
        int[] iArr13 = new int[lIIlIllIIl[1]];
        iArr13[lIIlIllIIl[0]] = lIIlIllIIl[10];
        if (lllllllIlllI(Bank.contains(iArr13) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIIl[10], lIIlIllIIl[1], lIIlIllIIl[52]));
            "".length();
        }
        if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7])) {
            int[] iArr14 = new int[lIIlIllIIl[1]];
            iArr14[lIIlIllIIl[0]] = lIIlIllIIl[11];
            if (lllllllIlllI(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIllIIl[11], lIIlIllIIl[48], lIIlIllIIl[53]));
                "".length();
            }
        }
        int[] iArr15 = new int[lIIlIllIIl[1]];
        iArr15[lIIlIllIIl[0]] = lIIlIllIIl[22];
        if (lllllllIlllI(Bank.contains(iArr15) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIIl[22], lIIlIllIIl[1], C0008i.bq));
            "".length();
        }
        int[] iArr16 = new int[lIIlIllIIl[1]];
        iArr16[lIIlIllIIl[0]] = lIIlIllIIl[26];
        if (lllllllIlllI(Bank.contains(iArr16) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIIl[26], lIIlIllIIl[54], lIIlIllIIl[55]));
            "".length();
        }
        if (lllllllIlllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIlIlIlll[lIIlIllIIl[31]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIllIIl[56], lIIlIllIIl[5], lIIlIllIIl[57]));
            "".length();
        }
        int[] iArr17 = new int[lIIlIllIIl[1]];
        iArr17[lIIlIllIIl[0]] = lIIlIllIIl[58];
        if (lllllllIllII(Bank.contains(iArr17) ? 1 : 0)) {
            int[] iArr18 = new int[lIIlIllIIl[1]];
            iArr18[lIIlIllIIl[0]] = lIIlIllIIl[58];
            if (lllllllIllII(Bank.contains(iArr18) ? 1 : 0)) {
                int[] iArr19 = new int[lIIlIllIIl[1]];
                iArr19[lIIlIllIIl[0]] = lIIlIllIIl[58];
            }
            iArr = new int[lIIlIllIIl[1]];
            iArr[lIIlIllIIl[0]] = lIIlIllIIl[23];
            if (lllllllIllII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr20 = new int[lIIlIllIIl[1]];
                iArr20[lIIlIllIIl[0]] = lIIlIllIIl[23];
                if (!lllllllIllII(Bank.contains(iArr20) ? 1 : 0)) {
                    return;
                }
                int[] iArr21 = new int[lIIlIllIIl[1]];
                iArr21[lIIlIllIIl[0]] = lIIlIllIIl[23];
                if (!lllllllIllIl(Bank.getFirst(iArr21).getQuantity(), lIIlIllIIl[24])) {
                    return;
                }
            }
            bv.add(new C0003d(lIIlIllIIl[23], lIIlIllIIl[24], lIIlIllIIl[59]));
            "".length();
        }
        bv.add(new C0003d(lIIlIllIIl[58], lIIlIllIIl[24], lIIlIllIIl[59]));
        "".length();
        iArr = new int[lIIlIllIIl[1]];
        iArr[lIIlIllIIl[0]] = lIIlIllIIl[23];
        if (lllllllIllII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlIllIIl[23], lIIlIllIIl[24], lIIlIllIIl[59]));
        "".length();
    }

    private static boolean lllllllIllll(Object obj) {
        return obj != null;
    }

    private static void lllllllIlIll() {
        lIIlIllIIl = new int[63];
        lIIlIllIIl[0] = (59 ^ 45) & ((25 ^ 15) ^ (-1));
        lIIlIllIIl[1] = " ".length();
        lIIlIllIIl[2] = "  ".length();
        lIIlIllIIl[3] = "   ".length();
        lIIlIllIIl[4] = (-25601) & 30600;
        lIIlIllIIl[5] = (((100 + 51) - 47) + 64) ^ (((43 + 103) - (-16)) + 11);
        lIIlIllIIl[6] = (169 ^ 146) ^ (157 ^ 162);
        lIIlIllIIl[7] = 84 ^ 102;
        lIIlIllIIl[8] = (-21189) & 31687;
        lIIlIllIIl[9] = (-1603) & 4095;
        lIIlIllIIl[10] = (-22049) & 24547;
        lIIlIllIIl[11] = (-15430) & 16239;
        lIIlIllIIl[12] = (-((-11625) & 15867)) & (-19457) & 24539;
        lIIlIllIIl[13] = (-((-105) & 15613)) & (-33) & 16383;
        lIIlIllIIl[14] = (-((-19147) & 32491)) & (-2055) & 16247;
        lIIlIllIIl[15] = (-((-337) & 11741)) & (-16385) & 28670;
        lIIlIllIIl[16] = (-((-18609) & 23799)) & (-10369) & 16367;
        lIIlIllIIl[17] = (-33) & 1127;
        lIIlIllIIl[18] = (-18735) & 19903;
        lIIlIllIIl[19] = (-25365) & 26493;
        lIIlIllIIl[20] = (-16513) & 27638;
        lIIlIllIIl[21] = (-20808) & 22511;
        lIIlIllIIl[22] = (-((-4449) & 22509)) & (-1) & 30685;
        lIIlIllIIl[23] = (-24741) & 32749;
        lIIlIllIIl[24] = 22 ^ 28;
        lIIlIllIIl[25] = (-24598) & 32607;
        lIIlIllIIl[26] = (-28677) & 29055;
        lIIlIllIIl[27] = 137 ^ 151;
        lIIlIllIIl[28] = (-28689) & 29495;
        lIIlIllIIl[29] = (-((-24793) & 32221)) & (-16458) & 32765;
        lIIlIllIIl[30] = (112 ^ 102) ^ (138 ^ 154);
        lIIlIllIIl[31] = (((122 + 14) - 84) + 105) ^ (((113 + 3) - 82) + 103);
        lIIlIllIIl[32] = "  ".length() ^ (125 ^ 120);
        lIIlIllIIl[33] = 79 ^ 71;
        lIIlIllIIl[34] = (-((-17137) & 24318)) & (-257) & 16319;
        lIIlIllIIl[35] = (((99 + 107) - 176) + 109) ^ (((105 + 108) - 96) + 13);
        lIIlIllIIl[36] = (((116 + 22) - 35) + 34) ^ (((103 + 32) - 64) + 90);
        lIIlIllIIl[37] = (178 ^ 187) ^ "  ".length();
        lIIlIllIIl[38] = (((57 + 33) - 0) + 41) ^ (((68 + 102) - 87) + 60);
        lIIlIllIIl[39] = (204 ^ 140) ^ (48 ^ 125);
        lIIlIllIIl[40] = 132 ^ 138;
        lIIlIllIIl[41] = (((137 ^ 187) + (127 ^ 16)) - (-(21 ^ 39))) + (73 ^ 84);
        lIIlIllIIl[42] = 51 ^ 60;
        lIIlIllIIl[43] = (113 ^ 56) ^ (6 ^ 95);
        lIIlIllIIl[44] = 15 ^ 30;
        lIIlIllIIl[45] = 77 ^ 95;
        lIIlIllIIl[46] = (-((-7725) & 24173)) & (-1284) & 32731;
        lIIlIllIIl[47] = (-30754) & 32753;
        lIIlIllIIl[48] = (-((-2595) & 3878)) & (-4097) & 16379;
        lIIlIllIIl[49] = (-((-19001) & 27646)) & (-17457) & 32767;
        lIIlIllIIl[50] = (-((-2631) & 31687)) & (-1033) & 65534;
        lIIlIllIIl[51] = (-(((102 + 118) - 103) + 17)) & (-33) & 7165;
        lIIlIllIIl[52] = (-((-17241) & 32607)) & (-10) & 32495;
        lIIlIllIIl[53] = (((43 + 76) - 97) + 116) ^ (((105 + 50) - 130) + 144);
        lIIlIllIIl[54] = (58 ^ 48) ^ (238 ^ 128);
        lIIlIllIIl[55] = (-((-6805) & 32468)) & (-6785) & 32767;
        lIIlIllIIl[56] = (-1) & 11980;
        lIIlIllIIl[57] = (-6212) & 31211;
        lIIlIllIIl[58] = (-24705) & 32711;
        lIIlIllIIl[59] = (-9249) & 10148;
        lIIlIllIIl[60] = (((121 + 93) - 213) + 189) ^ (((171 + 85) - 137) + 54);
        lIIlIllIIl[61] = 51 ^ 38;
        lIIlIllIIl[62] = 124 ^ 106;
    }

    static {
        lllllllIlIll();
        lllllllIlIIl();
        bv = new ArrayList();
    }

    private static boolean llllllllIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlIllIIl[0];
    }

    private static boolean llllllllIIIl(int i, int i2) {
        return i >= i2;
    }

    private static String lllllllIlIII(String lllllllllllllllllllllllIIIIlIIIl, String lllllllllllllllllllllllIIIIlIIII) {
        try {
            SecretKeySpec lllllllllllllllllllllllIIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllIIIIlIIII.getBytes(StandardCharsets.UTF_8)), lIIlIllIIl[33]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIllIIl[2], lllllllllllllllllllllllIIIIlIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllllIIIIlIIlI) {
            lllllllllllllllllllllllIIIIlIIlI.printStackTrace();
            return null;
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            ap();
            "".length();
            if (0 != 0) {
                return ((160 ^ 138) ^ (((64 + 81) - 26) + 8)) & (("  ".length() ^ (107 ^ 60)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlIllIIl[54];
    }

    private static boolean llllllllIIII(int i) {
        return i > 0;
    }

    private static boolean lllllllIllII(int i) {
        return i != 0;
    }

    private static String lllllllIIlll(String llllllllllllllllllllllIllllIllII, String llllllllllllllllllllllIllllIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllllIllllIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllllIllllIlllI = Cipher.getInstance("Blowfish");
            llllllllllllllllllllllIllllIlllI.init(lIIlIllIIl[2], secretKeySpec);
            return new String(llllllllllllllllllllllIllllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllllllIllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllllIllllIllIl) {
            llllllllllllllllllllllIllllIllIl.printStackTrace();
            return null;
        }
    }

    private static String lllllllIIllI(String lllllllllllllllllllllllIIIIIIIIl, String lllllllllllllllllllllllIIIIIIIII) {
        String lllllllllllllllllllllllIIIIIIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllllllllllIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllllllIllllllllI = lllllllllllllllllllllllIIIIIIIII.toCharArray();
        int llllllllllllllllllllllIlllllllIl = lIIlIllIIl[0];
        char[] charArray = lllllllllllllllllllllllIIIIIIIIl2.toCharArray();
        int llllllllllllllllllllllIlllllIllI = charArray.length;
        int i = lIIlIllIIl[0];
        while (lllllllIllIl(i, llllllllllllllllllllllIlllllIllI)) {
            sb.append((char) (charArray[i] ^ llllllllllllllllllllllIllllllllI[llllllllllllllllllllllIlllllllIl % llllllllllllllllllllllIllllllllI.length]));
            "".length();
            llllllllllllllllllllllIlllllllIl++;
            i++;
            "".length();
            if ((-"  ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllllllIlllI(int i) {
        return i == 0;
    }

    private static boolean llllllllIIll(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v122, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95, types: [boolean] */
    public static void ap() {
        if (lllllllIllII(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIlIlll[lIIlIllIIl[0]];
            C0001b.a(bv);
            if (lllllllIllIl(bv.size(), lIIlIllIIl[1])) {
                System.out.println(lIIlIlIlll[lIIlIllIIl[1]]);
                bt = lIIlIllIIl[0];
            }
        }
        if (lllllllIlllI(bt ? 1 : 0)) {
            if (lllllllIlllI(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllllllIllll(nearest) && lllllllIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlll[lIIlIllIIl[2]];
                    C0000a.a(nearest);
                }
                if (lllllllIllll(nearest) && lllllllIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIlIlll[lIIlIllIIl[3]];
                    if (lllllllIlllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIllIIl[4]);
                        "".length();
                        Time.sleepTicks(lIIlIllIIl[3]);
                        "".length();
                    }
                    if (lllllllIllII(Bank.isOpen() ? 1 : 0)) {
                        if (llllllllIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIllIIl[5]);
                            "".length();
                        }
                        if (llllllllIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIllIIl[2]);
                            "".length();
                        }
                        if (lllllllIlllI(ac() ? 1 : 0)) {
                            af();
                            System.out.println(lIIlIlIlll[lIIlIllIIl[6]]);
                            bt = lIIlIllIIl[1];
                            return;
                        }
                        if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7])) {
                            C0000a.a(lIIlIllIIl[8], lIIlIllIIl[1]);
                            C0000a.a(lIIlIllIIl[9], lIIlIllIIl[1]);
                            C0000a.a(lIIlIllIIl[10], lIIlIllIIl[1]);
                            Bank.withdrawAll(lIIlIllIIl[11], Bank.WithdrawMode.ITEM);
                        }
                        if (lllllllIllIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7])) {
                            C0000a.a(lIIlIllIIl[12], lIIlIllIIl[1]);
                            C0000a.a(lIIlIllIIl[13], lIIlIllIIl[1]);
                            C0000a.a(lIIlIllIIl[14], lIIlIllIIl[1]);
                            Bank.withdrawAll(lIIlIllIIl[15], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIIlIllIIl[1]);
                            "".length();
                            Bank.withdrawAll(lIIlIllIIl[16], Bank.WithdrawMode.ITEM);
                            Time.sleepTicks(lIIlIllIIl[1]);
                            "".length();
                            C0000a.a(lIIlIllIIl[17], lIIlIllIIl[1]);
                        }
                        C0000a.a(lIIlIllIIl[18], lIIlIllIIl[1]);
                        C0000a.a(lIIlIllIIl[19], lIIlIllIIl[1]);
                        C0000a.a(lIIlIllIIl[20], lIIlIllIIl[1]);
                        C0000a.a(lIIlIllIIl[21], lIIlIllIIl[1]);
                        C0000a.a(lIIlIllIIl[22], lIIlIllIIl[1]);
                        C0000a.a(lIIlIllIIl[23], lIIlIllIIl[24]);
                        C0000a.a(lIIlIllIIl[25], lIIlIllIIl[24]);
                        C0000a.a(lIIlIllIIl[26], Inventory.getFreeSlots());
                    }
                }
            }
            if (lllllllIllII(ab() ? 1 : 0)) {
                aq();
                if (lllllllIllIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[27])) {
                    C0011l.Z();
                }
                if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[27])) {
                    TileItem nearest2 = TileItems.getNearest(tileItem -> {
                        if (llllllllIIll(tileItem.getId(), lIIlIllIIl[16]) && llllllllIIIl(tileItem.getQuantity(), lIIlIllIIl[42])) {
                            ?? r0 = lIIlIllIIl[1];
                            "".length();
                            return (-" ".length()) != (-" ".length()) ? ((118 ^ 2) ^ (218 ^ 150)) & (((((68 + 2) - 54) + 129) ^ (((25 + 53) - (-47)) + 44)) ^ (-" ".length())) : r0;
                        }
                        return lIIlIllIIl[0];
                    });
                    if (lllllllIllll(nearest2)) {
                        nearest2.interact(lIIlIlIlll[lIIlIllIIl[5]]);
                        Time.sleepTicks(lIIlIllIIl[6]);
                        "".length();
                    }
                    C0010k.X();
                }
            }
        }
    }

    private static void lllllllIlIIl() {
        lIIlIlIlll = new String[lIIlIllIIl[62]];
        lIIlIlIlll[lIIlIllIIl[0]] = lllllllIIllI("BxYWDDciQwYRPCgQ", "EcoeY");
        lIIlIlIlll[lIIlIllIIl[1]] = lllllllIIlll("b87mWGAlHQzzjfi6QZd+8F3GQ+J6DlnvT0u+LIqDuvKvEBQxYC4Sh5/ZilIPZv+ldstuKmt6wt0=", "MmyVS");
        lIIlIlIlll[lIIlIllIIl[2]] = lllllllIlIII("4oM3BcYXwt1ya1B2ZqIT2QLxalJoVNj6", "TsGWP");
        lIIlIlIlll[lIIlIllIIl[3]] = lllllllIIlll("vYppP5QUvouf6Ckb6nc6nlgPjsciQdrC", "wLQwj");
        lIIlIlIlll[lIIlIllIIl[6]] = lllllllIlIII("uRt23G4uGgkiUqaEug58MZ1FZTF/CbBxTczUaKYGkWhBLWs6ikznYVj9co1hEmNS", "GLzLI");
        lIIlIlIlll[lIIlIllIIl[5]] = lllllllIIlll("KlFag8K47Dg=", "rJCKg");
        lIIlIlIlll[lIIlIllIIl[30]] = lllllllIIlll("+akuzKCmfs4=", "DIWSi");
        lIIlIlIlll[lIIlIllIIl[32]] = lllllllIIllI("HAgkIw==", "KmEQQ");
        lIIlIlIlll[lIIlIllIIl[33]] = lllllllIIllI("EjgPATI=", "EQjmV");
        lIIlIlIlll[lIIlIllIIl[35]] = lllllllIIlll("maNYdrscVrk=", "dhwak");
        lIIlIlIlll[lIIlIllIIl[24]] = lllllllIIlll("/FiRkFe5+7U=", "knvZV");
        lIIlIlIlll[lIIlIllIIl[37]] = lllllllIlIII("ZqgHzXubZeE=", "ErUXb");
        lIIlIlIlll[lIIlIllIIl[38]] = lllllllIIlll("lLXhgz1qA4o=", "EPAIt");
        lIIlIlIlll[lIIlIllIIl[39]] = lllllllIIlll("Cq8PP8uQ3nk=", "mHTsl");
        lIIlIlIlll[lIIlIllIIl[40]] = lllllllIIlll("EtgVCwWGwMk=", "aXxrc");
        lIIlIlIlll[lIIlIllIIl[42]] = lllllllIIllI("JRYAHQ==", "rsaoE");
        lIIlIlIlll[lIIlIllIIl[43]] = lllllllIlIII("RyeseTd+23E=", "Cawuf");
        lIIlIlIlll[lIIlIllIIl[44]] = lllllllIIllI("DysICw==", "XNiyu");
        lIIlIlIlll[lIIlIllIIl[45]] = lllllllIIlll("euvfkN5/RYE=", "PRCTl");
        lIIlIlIlll[lIIlIllIIl[60]] = lllllllIlIII("yte3gMrUG3NVdjK2RC7OzA==", "TkPoi");
        lIIlIlIlll[lIIlIllIIl[31]] = lllllllIIllI("EycnFnAOKGkGNQAiPRlwSQ==", "aNIqP");
        lIIlIlIlll[lIIlIllIIl[61]] = lllllllIlIII("etAgqbMqJWI=", "eVniu");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x007f, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains((v0) -> { // java.util.function.Predicate.test(java.lang.Object):boolean
            return l(v0);
        }) ? 1 : 0) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void aq() {
        int[] iArr = new int[lIIlIllIIl[1]];
        iArr[lIIlIllIIl[0]] = lIIlIllIIl[28];
        if (lllllllIlllI(Equipment.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIlIllIIl[1]];
            iArr2[lIIlIllIIl[0]] = lIIlIllIIl[29];
            if (lllllllIlllI(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIlIllIIl[1]];
                iArr3[lIIlIllIIl[0]] = lIIlIllIIl[16];
                if (lllllllIlllI(Equipment.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIlIllIIl[1]];
                    iArr4[lIIlIllIIl[0]] = lIIlIllIIl[11];
                    if (lllllllIlllI(Equipment.contains(iArr4) ? 1 : 0)) {
                    }
                }
            }
        }
        if (llllllllIIlI(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lllllllIllIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[27])) {
            int[] iArr5 = new int[lIIlIllIIl[1]];
            iArr5[lIIlIllIIl[0]] = lIIlIllIIl[28];
            if (lllllllIllII(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIlIllIIl[1]];
                iArr6[lIIlIllIIl[0]] = lIIlIllIIl[28];
                Inventory.getFirst(iArr6).interact(lIIlIlIlll[lIIlIllIIl[30]]);
            }
            int[] iArr7 = new int[lIIlIllIIl[1]];
            iArr7[lIIlIllIIl[0]] = lIIlIllIIl[12];
            if (lllllllIllII(Inventory.contains(iArr7) ? 1 : 0) && lllllllIllIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[5])) {
                C0004e.l(lIIlIllIIl[12]);
            }
            int[] iArr8 = new int[lIIlIllIIl[1]];
            iArr8[lIIlIllIIl[0]] = lIIlIllIIl[13];
            if (lllllllIllII(Inventory.contains(iArr8) ? 1 : 0) && llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[5]) && lllllllIllIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[31])) {
                C0004e.l(lIIlIllIIl[13]);
            }
            int[] iArr9 = new int[lIIlIllIIl[1]];
            iArr9[lIIlIllIIl[0]] = lIIlIllIIl[14];
            if (lllllllIllII(Inventory.contains(iArr9) ? 1 : 0) && llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[31])) {
                C0004e.l(lIIlIllIIl[14]);
            }
            int[] iArr10 = new int[lIIlIllIIl[1]];
            iArr10[lIIlIllIIl[0]] = lIIlIllIIl[15];
            if (lllllllIllII(Inventory.contains(iArr10) ? 1 : 0)) {
                C0004e.l(lIIlIllIIl[15]);
            }
        }
        if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[31])) {
            int[] iArr11 = new int[lIIlIllIIl[1]];
            iArr11[lIIlIllIIl[0]] = lIIlIllIIl[18];
            if (lllllllIllII(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIlIllIIl[1]];
                iArr12[lIIlIllIIl[0]] = lIIlIllIIl[18];
                Inventory.getFirst(iArr12).interact(lIIlIlIlll[lIIlIllIIl[32]]);
            }
        }
        if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[27])) {
            int[] iArr13 = new int[lIIlIllIIl[1]];
            iArr13[lIIlIllIIl[0]] = lIIlIllIIl[29];
            if (lllllllIllII(Inventory.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lIIlIllIIl[1]];
                iArr14[lIIlIllIIl[0]] = lIIlIllIIl[29];
                Inventory.getFirst(iArr14).interact(lIIlIlIlll[lIIlIllIIl[33]]);
            }
            int[] iArr15 = new int[lIIlIllIIl[1]];
            iArr15[lIIlIllIIl[0]] = lIIlIllIIl[34];
            if (lllllllIllII(Inventory.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[lIIlIllIIl[1]];
                iArr16[lIIlIllIIl[0]] = lIIlIllIIl[34];
                Inventory.getFirst(iArr16).interact(lIIlIlIlll[lIIlIllIIl[35]]);
            }
            int[] iArr17 = new int[lIIlIllIIl[1]];
            iArr17[lIIlIllIIl[0]] = lIIlIllIIl[16];
            if (lllllllIllII(Inventory.contains(iArr17) ? 1 : 0)) {
                int[] iArr18 = new int[lIIlIllIIl[1]];
                iArr18[lIIlIllIIl[0]] = lIIlIllIIl[16];
                Inventory.getFirst(iArr18).interact(lIIlIlIlll[lIIlIllIIl[24]]);
            }
        }
        if (lllllllIllIl(Skills.getLevel(Skill.DEFENCE), lIIlIllIIl[36])) {
            int[] iArr19 = new int[lIIlIllIIl[1]];
            iArr19[lIIlIllIIl[0]] = lIIlIllIIl[19];
            if (lllllllIllII(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lIIlIllIIl[1]];
                iArr20[lIIlIllIIl[0]] = lIIlIllIIl[19];
                Inventory.getFirst(iArr20).interact(lIIlIlIlll[lIIlIllIIl[37]]);
            }
        }
        if (lllllllIllIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7])) {
            int[] iArr21 = new int[lIIlIllIIl[1]];
            iArr21[lIIlIllIIl[0]] = lIIlIllIIl[17];
            if (lllllllIllII(Inventory.contains(iArr21) ? 1 : 0)) {
                int[] iArr22 = new int[lIIlIllIIl[1]];
                iArr22[lIIlIllIIl[0]] = lIIlIllIIl[17];
                Inventory.getFirst(iArr22).interact(lIIlIlIlll[lIIlIllIIl[38]]);
            }
        }
        int[] iArr23 = new int[lIIlIllIIl[1]];
        iArr23[lIIlIllIIl[0]] = lIIlIllIIl[20];
        if (lllllllIllII(Inventory.contains(iArr23) ? 1 : 0)) {
            int[] iArr24 = new int[lIIlIllIIl[1]];
            iArr24[lIIlIllIIl[0]] = lIIlIllIIl[20];
            Inventory.getFirst(iArr24).interact(lIIlIlIlll[lIIlIllIIl[39]]);
        }
        int[] iArr25 = new int[lIIlIllIIl[1]];
        iArr25[lIIlIllIIl[0]] = lIIlIllIIl[21];
        if (lllllllIllII(Inventory.contains(iArr25) ? 1 : 0)) {
            int[] iArr26 = new int[lIIlIllIIl[1]];
            iArr26[lIIlIllIIl[0]] = lIIlIllIIl[21];
            Inventory.getFirst(iArr26).interact(lIIlIlIlll[lIIlIllIIl[40]]);
        }
        if (llllllllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIllIIl[41])) {
            int[] iArr27 = new int[lIIlIllIIl[1]];
            iArr27[lIIlIllIIl[0]] = lIIlIllIIl[8];
            if (lllllllIllII(Inventory.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[lIIlIllIIl[1]];
                iArr28[lIIlIllIIl[0]] = lIIlIllIIl[8];
                if (lllllllIlllI(Equipment.contains(iArr28) ? 1 : 0)) {
                    int[] iArr29 = new int[lIIlIllIIl[1]];
                    iArr29[lIIlIllIIl[0]] = lIIlIllIIl[8];
                    Inventory.getFirst(iArr29).interact(lIIlIlIlll[lIIlIllIIl[42]]);
                }
            }
            if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7])) {
                int[] iArr30 = new int[lIIlIllIIl[1]];
                iArr30[lIIlIllIIl[0]] = lIIlIllIIl[9];
                if (lllllllIllII(Inventory.contains(iArr30) ? 1 : 0)) {
                    int[] iArr31 = new int[lIIlIllIIl[1]];
                    iArr31[lIIlIllIIl[0]] = lIIlIllIIl[9];
                    if (lllllllIlllI(Equipment.contains(iArr31) ? 1 : 0)) {
                        int[] iArr32 = new int[lIIlIllIIl[1]];
                        iArr32[lIIlIllIIl[0]] = lIIlIllIIl[9];
                        Inventory.getFirst(iArr32).interact(lIIlIlIlll[lIIlIllIIl[43]]);
                    }
                }
            }
            if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7]) && llllllllIIIl(Skills.getLevel(Skill.DEFENCE), lIIlIllIIl[36])) {
                int[] iArr33 = new int[lIIlIllIIl[1]];
                iArr33[lIIlIllIIl[0]] = lIIlIllIIl[10];
                if (lllllllIllII(Inventory.contains(iArr33) ? 1 : 0)) {
                    int[] iArr34 = new int[lIIlIllIIl[1]];
                    iArr34[lIIlIllIIl[0]] = lIIlIllIIl[10];
                    if (lllllllIlllI(Equipment.contains(iArr34) ? 1 : 0)) {
                        int[] iArr35 = new int[lIIlIllIIl[1]];
                        iArr35[lIIlIllIIl[0]] = lIIlIllIIl[10];
                        Inventory.getFirst(iArr35).interact(lIIlIlIlll[lIIlIllIIl[44]]);
                    }
                }
            }
            if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7])) {
                int[] iArr36 = new int[lIIlIllIIl[1]];
                iArr36[lIIlIllIIl[0]] = lIIlIllIIl[11];
                if (lllllllIllII(Inventory.contains(iArr36) ? 1 : 0)) {
                    int[] iArr37 = new int[lIIlIllIIl[1]];
                    iArr37[lIIlIllIIl[0]] = lIIlIllIIl[11];
                    Inventory.getFirst(iArr37).interact(lIIlIlIlll[lIIlIllIIl[45]]);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0372, code lost:
        if (lllllllIllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v152, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ac() {
        if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7]) && llllllllIIll(Vars.getBit(QuestVarbits.QUEST_ANIMAL_MAGNETISM.getId()), lIIlIllIIl[41]) && llllllllIIIl(Skills.getLevel(Skill.DEFENCE), lIIlIllIIl[36])) {
            int[] iArr = new int[lIIlIllIIl[1]];
            iArr[lIIlIllIIl[0]] = lIIlIllIIl[9];
            if (lllllllIllII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIllIIl[1]];
                iArr2[lIIlIllIIl[0]] = lIIlIllIIl[10];
                if (lllllllIllII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIlIllIIl[1]];
                    iArr3[lIIlIllIIl[0]] = lIIlIllIIl[18];
                    if (lllllllIllII(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIlIllIIl[1]];
                        iArr4[lIIlIllIIl[0]] = lIIlIllIIl[20];
                        if (lllllllIllII(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr5 = new int[lIIlIllIIl[1]];
                            iArr5[lIIlIllIIl[0]] = lIIlIllIIl[11];
                            if (lllllllIllII(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[lIIlIllIIl[1]];
                                iArr6[lIIlIllIIl[0]] = lIIlIllIIl[8];
                                if (lllllllIllII(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr7 = new int[lIIlIllIIl[1]];
                                    iArr7[lIIlIllIIl[0]] = lIIlIllIIl[26];
                                    if (lllllllIllII(Bank.contains(iArr7) ? 1 : 0)) {
                                        ?? r0 = lIIlIllIIl[1];
                                        "".length();
                                        return (-((84 ^ 70) ^ (166 ^ 176))) >= 0 ? ((248 ^ 144) ^ (226 ^ 143)) & (((((117 + 160) - 204) + 89) ^ (((42 + 74) - 80) + 131)) ^ (-" ".length())) : r0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return lIIlIllIIl[0];
        } else if (llllllllIIIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[27]) && lllllllIllIl(Skills.getLevel(Skill.RANGED), lIIlIllIIl[7])) {
            int[] iArr8 = new int[lIIlIllIIl[1]];
            iArr8[lIIlIllIIl[0]] = lIIlIllIIl[17];
            if (lllllllIllII(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIlIllIIl[1]];
                iArr9[lIIlIllIIl[0]] = lIIlIllIIl[19];
                if (lllllllIllII(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIlIllIIl[1]];
                    iArr10[lIIlIllIIl[0]] = lIIlIllIIl[18];
                    if (lllllllIllII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lIIlIllIIl[1]];
                        iArr11[lIIlIllIIl[0]] = lIIlIllIIl[20];
                        if (lllllllIllII(Bank.contains(iArr11) ? 1 : 0)) {
                            int[] iArr12 = new int[lIIlIllIIl[1]];
                            iArr12[lIIlIllIIl[0]] = lIIlIllIIl[16];
                            if (lllllllIllII(Bank.contains(iArr12) ? 1 : 0)) {
                                int[] iArr13 = new int[lIIlIllIIl[1]];
                                iArr13[lIIlIllIIl[0]] = lIIlIllIIl[26];
                                if (lllllllIllII(Bank.contains(iArr13) ? 1 : 0)) {
                                    ?? r02 = lIIlIllIIl[1];
                                    "".length();
                                    return "   ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                                }
                            }
                        }
                    }
                }
            }
            return lIIlIllIIl[0];
        } else {
            int[] iArr14 = new int[lIIlIllIIl[1]];
            iArr14[lIIlIllIIl[0]] = lIIlIllIIl[17];
            if (lllllllIllII(Bank.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIlIllIIl[1]];
                iArr15[lIIlIllIIl[0]] = lIIlIllIIl[19];
                if (lllllllIllII(Bank.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[lIIlIllIIl[1]];
                    iArr16[lIIlIllIIl[0]] = lIIlIllIIl[18];
                    if (lllllllIllII(Bank.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIIlIllIIl[1]];
                        iArr17[lIIlIllIIl[0]] = lIIlIllIIl[20];
                        if (lllllllIllII(Bank.contains(iArr17) ? 1 : 0)) {
                            int[] iArr18 = new int[lIIlIllIIl[1]];
                            iArr18[lIIlIllIIl[0]] = lIIlIllIIl[12];
                            if (lllllllIllII(Bank.contains(iArr18) ? 1 : 0)) {
                                int[] iArr19 = new int[lIIlIllIIl[1]];
                                iArr19[lIIlIllIIl[0]] = lIIlIllIIl[23];
                                if (lllllllIllII(Bank.contains(iArr19) ? 1 : 0)) {
                                    int[] iArr20 = new int[lIIlIllIIl[1]];
                                    iArr20[lIIlIllIIl[0]] = lIIlIllIIl[13];
                                    if (lllllllIllII(Bank.contains(iArr20) ? 1 : 0)) {
                                        int[] iArr21 = new int[lIIlIllIIl[1]];
                                        iArr21[lIIlIllIIl[0]] = lIIlIllIIl[14];
                                        if (lllllllIllII(Bank.contains(iArr21) ? 1 : 0)) {
                                            int[] iArr22 = new int[lIIlIllIIl[1]];
                                            iArr22[lIIlIllIIl[0]] = lIIlIllIIl[15];
                                            if (lllllllIlllI(Bank.contains(iArr22) ? 1 : 0)) {
                                                int[] iArr23 = new int[lIIlIllIIl[1]];
                                                iArr23[lIIlIllIIl[0]] = lIIlIllIIl[15];
                                            }
                                            int[] iArr24 = new int[lIIlIllIIl[1]];
                                            iArr24[lIIlIllIIl[0]] = lIIlIllIIl[16];
                                            if (lllllllIllII(Bank.contains(iArr24) ? 1 : 0)) {
                                                int[] iArr25 = new int[lIIlIllIIl[1]];
                                                iArr25[lIIlIllIIl[0]] = lIIlIllIIl[26];
                                                if (lllllllIllII(Bank.contains(iArr25) ? 1 : 0)) {
                                                    ?? r03 = lIIlIllIIl[1];
                                                    "".length();
                                                    return (-" ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r03;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return lIIlIllIIl[0];
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlIlIlll[lIIlIllIIl[60]];
    }
}
