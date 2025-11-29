package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.an  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/an.class */
public class C0014an implements InterfaceC0003ac {
    private static /* synthetic */ int[] llIlIlIllI;
    public static /* synthetic */ WorldArea cM;
    public static /* synthetic */ int[] cK;
    public static /* synthetic */ WorldPoint ck;
    private static /* synthetic */ String[] llIlIlIlIl;
    public static /* synthetic */ WorldArea cN;
    public static /* synthetic */ int[] np;
    public static /* synthetic */ WorldArea cL;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldPoint cO;
    public static /* synthetic */ WorldPoint cP;
    public static /* synthetic */ List<C0017d> bv;

    private static boolean lIllIIllllIlI(int i, int i2) {
        return i >= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlIlIlIl[llIlIlIllI[86]];
    }

    private static String lIllIIllIlIII(String llllllllllllllllllIIIllIlllllllI, String llllllllllllllllllIIIllIllllllIl) {
        try {
            SecretKeySpec llllllllllllllllllIIIlllIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIllIllllllIl.getBytes(StandardCharsets.UTF_8)), llIlIlIllI[20]), "DES");
            Cipher llllllllllllllllllIIIlllIIIIIIII = Cipher.getInstance("DES");
            llllllllllllllllllIIIlllIIIIIIII.init(llIlIlIllI[4], llllllllllllllllllIIIlllIIIIIIIl);
            return new String(llllllllllllllllllIIIlllIIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIllIlllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIllIllllllll) {
            llllllllllllllllllIIIllIllllllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlIlIllI[0];
    }

    private static boolean lIllIIllllIll(Object obj) {
        return obj != null;
    }

    private static boolean lIllIlIIIIIII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0546, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x059d, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x05f4, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x062e, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0670, code lost:
        return o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0014an.llIlIlIllI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x06c5, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x071c, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0087, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0773, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x07ca, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0821, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0878, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x08cf, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0909, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0960, code lost:
        return o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0014an.llIlIlIllI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00de, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0135, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x018c, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01e3, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x023a, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0291, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02e8, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0322, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0350, code lost:
        return o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0014an.llIlIlIllI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x03ea, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0441, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0498, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04ef, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v172, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v239, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v305, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v382, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aN() {
        if (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2])) {
            int[] iArr = new int[llIlIlIllI[1]];
            iArr[llIlIlIllI[0]] = llIlIlIllI[19];
            if (lIllIIllllIIl(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlIlIllI[1]];
                iArr2[llIlIlIllI[0]] = llIlIlIllI[19];
                if (lIllIIllllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[llIlIlIllI[1]];
                    iArr3[llIlIlIllI[0]] = llIlIlIllI[19];
                }
            }
            int[] iArr4 = new int[llIlIlIllI[1]];
            iArr4[llIlIlIllI[0]] = llIlIlIllI[36];
            if (lIllIIllllIIl(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[llIlIlIllI[1]];
                iArr5[llIlIlIllI[0]] = llIlIlIllI[36];
                if (lIllIIllllIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[llIlIlIllI[1]];
                    iArr6[llIlIlIllI[0]] = llIlIlIllI[36];
                }
            }
            int[] iArr7 = new int[llIlIlIllI[1]];
            iArr7[llIlIlIllI[0]] = llIlIlIllI[37];
            if (lIllIIllllIIl(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIlIlIllI[1]];
                iArr8[llIlIlIllI[0]] = llIlIlIllI[37];
                if (lIllIIllllIIl(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[llIlIlIllI[1]];
                    iArr9[llIlIlIllI[0]] = llIlIlIllI[37];
                }
            }
            int[] iArr10 = new int[llIlIlIllI[1]];
            iArr10[llIlIlIllI[0]] = llIlIlIllI[35];
            if (lIllIIllllIIl(Equipment.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[llIlIlIllI[1]];
                iArr11[llIlIlIllI[0]] = llIlIlIllI[35];
                if (lIllIIllllIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[llIlIlIllI[1]];
                    iArr12[llIlIlIllI[0]] = llIlIlIllI[35];
                }
            }
            int[] iArr13 = new int[llIlIlIllI[1]];
            iArr13[llIlIlIllI[0]] = llIlIlIllI[39];
            if (lIllIIllllIIl(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIlIlIllI[1]];
                iArr14[llIlIlIllI[0]] = llIlIlIllI[39];
                if (lIllIIllllIIl(Inventory.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llIlIlIllI[1]];
                    iArr15[llIlIlIllI[0]] = llIlIlIllI[39];
                }
            }
            int[] iArr16 = new int[llIlIlIllI[1]];
            iArr16[llIlIlIllI[0]] = llIlIlIllI[38];
            if (lIllIIllllIIl(Equipment.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[llIlIlIllI[1]];
                iArr17[llIlIlIllI[0]] = llIlIlIllI[38];
                if (lIllIIllllIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIlIlIllI[1]];
                    iArr18[llIlIlIllI[0]] = llIlIlIllI[38];
                }
            }
            int[] iArr19 = new int[llIlIlIllI[1]];
            iArr19[llIlIlIllI[0]] = llIlIlIllI[34];
            if (lIllIIllllIIl(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIlIlIllI[1]];
                iArr20[llIlIlIllI[0]] = llIlIlIllI[34];
                if (lIllIIllllIIl(Equipment.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[llIlIlIllI[1]];
                    iArr21[llIlIlIllI[0]] = llIlIlIllI[34];
                }
            }
            int[] iArr22 = new int[llIlIlIllI[1]];
            iArr22[llIlIlIllI[0]] = llIlIlIllI[62];
            if (lIllIIllllIIl(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[llIlIlIllI[1]];
                iArr23[llIlIlIllI[0]] = llIlIlIllI[62];
                if (lIllIIllllIIl(Equipment.contains(iArr23) ? 1 : 0)) {
                    int[] iArr24 = new int[llIlIlIllI[1]];
                    iArr24[llIlIlIllI[0]] = llIlIlIllI[62];
                }
            }
            int[] iArr25 = new int[llIlIlIllI[1]];
            iArr25[llIlIlIllI[0]] = llIlIlIllI[12];
            if (lIllIIllllIIl(Inventory.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[llIlIlIllI[1]];
                iArr26[llIlIlIllI[0]] = llIlIlIllI[12];
            }
            ?? r0 = llIlIlIllI[1];
            "".length();
            return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        } else if ((!lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[21]) || lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2])) && !(lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) && lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]))) {
            int[] iArr27 = new int[llIlIlIllI[1]];
            iArr27[llIlIlIllI[0]] = llIlIlIllI[17];
            if (lIllIIllllIIl(Equipment.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[llIlIlIllI[1]];
                iArr28[llIlIlIllI[0]] = llIlIlIllI[17];
                if (lIllIIllllIIl(Inventory.contains(iArr28) ? 1 : 0)) {
                    int[] iArr29 = new int[llIlIlIllI[1]];
                    iArr29[llIlIlIllI[0]] = llIlIlIllI[17];
                }
            }
            int[] iArr30 = new int[llIlIlIllI[1]];
            iArr30[llIlIlIllI[0]] = llIlIlIllI[54];
            if (lIllIIllllIIl(Equipment.contains(iArr30) ? 1 : 0)) {
                int[] iArr31 = new int[llIlIlIllI[1]];
                iArr31[llIlIlIllI[0]] = llIlIlIllI[54];
                if (lIllIIllllIIl(Inventory.contains(iArr31) ? 1 : 0)) {
                    int[] iArr32 = new int[llIlIlIllI[1]];
                    iArr32[llIlIlIllI[0]] = llIlIlIllI[54];
                }
            }
            int[] iArr33 = new int[llIlIlIllI[1]];
            iArr33[llIlIlIllI[0]] = llIlIlIllI[56];
            if (lIllIIllllIIl(Equipment.contains(iArr33) ? 1 : 0)) {
                int[] iArr34 = new int[llIlIlIllI[1]];
                iArr34[llIlIlIllI[0]] = llIlIlIllI[56];
                if (lIllIIllllIIl(Inventory.contains(iArr34) ? 1 : 0)) {
                    int[] iArr35 = new int[llIlIlIllI[1]];
                    iArr35[llIlIlIllI[0]] = llIlIlIllI[56];
                }
            }
            int[] iArr36 = new int[llIlIlIllI[1]];
            iArr36[llIlIlIllI[0]] = llIlIlIllI[52];
            if (lIllIIllllIIl(Equipment.contains(iArr36) ? 1 : 0)) {
                int[] iArr37 = new int[llIlIlIllI[1]];
                iArr37[llIlIlIllI[0]] = llIlIlIllI[52];
                if (lIllIIllllIIl(Inventory.contains(iArr37) ? 1 : 0)) {
                    int[] iArr38 = new int[llIlIlIllI[1]];
                    iArr38[llIlIlIllI[0]] = llIlIlIllI[52];
                }
            }
            int[] iArr39 = new int[llIlIlIllI[1]];
            iArr39[llIlIlIllI[0]] = llIlIlIllI[58];
            if (lIllIIllllIIl(Equipment.contains(iArr39) ? 1 : 0)) {
                int[] iArr40 = new int[llIlIlIllI[1]];
                iArr40[llIlIlIllI[0]] = llIlIlIllI[58];
                if (lIllIIllllIIl(Inventory.contains(iArr40) ? 1 : 0)) {
                    int[] iArr41 = new int[llIlIlIllI[1]];
                    iArr41[llIlIlIllI[0]] = llIlIlIllI[58];
                }
            }
            int[] iArr42 = new int[llIlIlIllI[1]];
            iArr42[llIlIlIllI[0]] = llIlIlIllI[60];
            if (lIllIIllllIIl(Inventory.contains(iArr42) ? 1 : 0)) {
                int[] iArr43 = new int[llIlIlIllI[1]];
                iArr43[llIlIlIllI[0]] = llIlIlIllI[60];
                if (lIllIIllllIIl(Equipment.contains(iArr43) ? 1 : 0)) {
                    int[] iArr44 = new int[llIlIlIllI[1]];
                    iArr44[llIlIlIllI[0]] = llIlIlIllI[60];
                }
            }
            int[] iArr45 = new int[llIlIlIllI[1]];
            iArr45[llIlIlIllI[0]] = llIlIlIllI[62];
            if (lIllIIllllIIl(Inventory.contains(iArr45) ? 1 : 0)) {
                int[] iArr46 = new int[llIlIlIllI[1]];
                iArr46[llIlIlIllI[0]] = llIlIlIllI[62];
                if (lIllIIllllIIl(Equipment.contains(iArr46) ? 1 : 0)) {
                    int[] iArr47 = new int[llIlIlIllI[1]];
                    iArr47[llIlIlIllI[0]] = llIlIlIllI[62];
                }
            }
            int[] iArr48 = new int[llIlIlIllI[1]];
            iArr48[llIlIlIllI[0]] = llIlIlIllI[12];
            if (lIllIIllllIIl(Inventory.contains(iArr48) ? 1 : 0)) {
                int[] iArr49 = new int[llIlIlIllI[1]];
                iArr49[llIlIlIllI[0]] = llIlIlIllI[12];
            }
            ?? r02 = llIlIlIllI[1];
            "".length();
            return (-((((82 + 55) - 125) + 181) ^ (((190 + 26) - 103) + 83))) >= 0 ? ((63 ^ 127) ^ ((66 ^ 11) & ((52 ^ 125) ^ (-1)))) & (((44 ^ 36) ^ (7 ^ 79)) ^ (-" ".length())) : r02;
        } else {
            int[] iArr50 = new int[llIlIlIllI[1]];
            iArr50[llIlIlIllI[0]] = llIlIlIllI[18];
            if (lIllIIllllIIl(Equipment.contains(iArr50) ? 1 : 0)) {
                int[] iArr51 = new int[llIlIlIllI[1]];
                iArr51[llIlIlIllI[0]] = llIlIlIllI[18];
                if (lIllIIllllIIl(Inventory.contains(iArr51) ? 1 : 0)) {
                    int[] iArr52 = new int[llIlIlIllI[1]];
                    iArr52[llIlIlIllI[0]] = llIlIlIllI[18];
                }
            }
            int[] iArr53 = new int[llIlIlIllI[1]];
            iArr53[llIlIlIllI[0]] = llIlIlIllI[54];
            if (lIllIIllllIIl(Equipment.contains(iArr53) ? 1 : 0)) {
                int[] iArr54 = new int[llIlIlIllI[1]];
                iArr54[llIlIlIllI[0]] = llIlIlIllI[54];
                if (lIllIIllllIIl(Inventory.contains(iArr54) ? 1 : 0)) {
                    int[] iArr55 = new int[llIlIlIllI[1]];
                    iArr55[llIlIlIllI[0]] = llIlIlIllI[54];
                }
            }
            int[] iArr56 = new int[llIlIlIllI[1]];
            iArr56[llIlIlIllI[0]] = llIlIlIllI[56];
            if (lIllIIllllIIl(Equipment.contains(iArr56) ? 1 : 0)) {
                int[] iArr57 = new int[llIlIlIllI[1]];
                iArr57[llIlIlIllI[0]] = llIlIlIllI[56];
                if (lIllIIllllIIl(Inventory.contains(iArr57) ? 1 : 0)) {
                    int[] iArr58 = new int[llIlIlIllI[1]];
                    iArr58[llIlIlIllI[0]] = llIlIlIllI[56];
                }
            }
            int[] iArr59 = new int[llIlIlIllI[1]];
            iArr59[llIlIlIllI[0]] = llIlIlIllI[52];
            if (lIllIIllllIIl(Equipment.contains(iArr59) ? 1 : 0)) {
                int[] iArr60 = new int[llIlIlIllI[1]];
                iArr60[llIlIlIllI[0]] = llIlIlIllI[52];
                if (lIllIIllllIIl(Inventory.contains(iArr60) ? 1 : 0)) {
                    int[] iArr61 = new int[llIlIlIllI[1]];
                    iArr61[llIlIlIllI[0]] = llIlIlIllI[52];
                }
            }
            int[] iArr62 = new int[llIlIlIllI[1]];
            iArr62[llIlIlIllI[0]] = llIlIlIllI[58];
            if (lIllIIllllIIl(Equipment.contains(iArr62) ? 1 : 0)) {
                int[] iArr63 = new int[llIlIlIllI[1]];
                iArr63[llIlIlIllI[0]] = llIlIlIllI[58];
                if (lIllIIllllIIl(Inventory.contains(iArr63) ? 1 : 0)) {
                    int[] iArr64 = new int[llIlIlIllI[1]];
                    iArr64[llIlIlIllI[0]] = llIlIlIllI[58];
                }
            }
            int[] iArr65 = new int[llIlIlIllI[1]];
            iArr65[llIlIlIllI[0]] = llIlIlIllI[60];
            if (lIllIIllllIIl(Inventory.contains(iArr65) ? 1 : 0)) {
                int[] iArr66 = new int[llIlIlIllI[1]];
                iArr66[llIlIlIllI[0]] = llIlIlIllI[60];
                if (lIllIIllllIIl(Equipment.contains(iArr66) ? 1 : 0)) {
                    int[] iArr67 = new int[llIlIlIllI[1]];
                    iArr67[llIlIlIllI[0]] = llIlIlIllI[60];
                }
            }
            int[] iArr68 = new int[llIlIlIllI[1]];
            iArr68[llIlIlIllI[0]] = llIlIlIllI[62];
            if (lIllIIllllIIl(Inventory.contains(iArr68) ? 1 : 0)) {
                int[] iArr69 = new int[llIlIlIllI[1]];
                iArr69[llIlIlIllI[0]] = llIlIlIllI[62];
                if (lIllIIllllIIl(Equipment.contains(iArr69) ? 1 : 0)) {
                    int[] iArr70 = new int[llIlIlIllI[1]];
                    iArr70[llIlIlIllI[0]] = llIlIlIllI[62];
                }
            }
            int[] iArr71 = new int[llIlIlIllI[1]];
            iArr71[llIlIlIllI[0]] = llIlIlIllI[12];
            if (lIllIIllllIIl(Inventory.contains(iArr71) ? 1 : 0)) {
                int[] iArr72 = new int[llIlIlIllI[1]];
                iArr72[llIlIlIllI[0]] = llIlIlIllI[12];
            }
            ?? r03 = llIlIlIllI[1];
            "".length();
            return ((74 ^ 41) ^ (96 ^ 6)) <= 0 ? ((169 ^ 183) ^ (115 ^ 73)) & (((18 ^ 56) ^ (127 ^ 113)) ^ (-" ".length())) : r03;
        }
    }

    private static void lIllIIllIlIlI() {
        llIlIlIlIl = new String[llIlIlIllI[100]];
        llIlIlIlIl[llIlIlIllI[0]] = lIllIIllIIlll("KhcXLgoPQgczAQUR", "hbnGd");
        llIlIlIlIl[llIlIlIllI[1]] = lIllIIllIlIII("Lv0jVOzymQXuxgwkWjLY35VyovpnaJEEHr5pbIsxBQmpMu80H7NGBcfKZ1HgxFuDnXbQ+q0z2ic=", "nIFLO");
        llIlIlIlIl[llIlIlIllI[4]] = lIllIIllIIlll("OQsFEyoWHhoUKlceHFovFgQY", "wjszM");
        llIlIlIlIl[llIlIlIllI[5]] = lIllIIllIlIIl("lGotVKidphbuLN8nVe/lMc/FsS09pkAN", "XjHWJ");
        llIlIlIlIl[llIlIlIllI[7]] = lIllIIllIIlll("HyFIIzgtZAUrOTstBiVqOzEYMiYhIRtuajszATYpIC0GJWo8K0gAHxENJgU=", "HDhBJ");
        llIlIlIlIl[llIlIlIllI[11]] = lIllIIllIlIIl("kYXw4VkVNU5p+r+S+jBXCw==", "oyORW");
        llIlIlIlIl[llIlIlIllI[15]] = lIllIIllIIlll("GSMVFh9qJBMaHiMjEQE=", "JWpss");
        llIlIlIlIl[llIlIlIllI[16]] = lIllIIllIIlll("CQgePgstDUolGi0MAyIYNg==", "DajVy");
        llIlIlIlIl[llIlIlIllI[20]] = lIllIIllIlIII("T5xyEUTU/8A=", "gqyFw");
        llIlIlIlIl[llIlIlIllI[23]] = lIllIIllIlIIl("50dbb1DVkmdB/SV7rgQoHw==", "AjSbq");
        llIlIlIlIl[llIlIlIllI[22]] = lIllIIllIIlll("EjcsFAFhMCoYACg3KAM=", "ACIqm");
        llIlIlIlIl[llIlIlIllI[24]] = lIllIIllIlIII("nEdWV0SlUhUucvuZZevcT+PvHfMQf9jf", "DHbmj");
        llIlIlIlIl[llIlIlIllI[25]] = lIllIIllIIlll("BxIqDT8+FGYSOXAQKRF2MQEjBw==", "PsFfV");
        llIlIlIlIl[llIlIlIllI[26]] = lIllIIllIIlll("CgA6Hh4vDnYRGDYa", "AiVrw");
        llIlIlIlIl[llIlIlIllI[27]] = lIllIIllIIlll("Gxob", "Xulbe");
        llIlIlIlIl[llIlIlIllI[14]] = lIllIIllIlIII("XO92syVN968=", "eWvqk");
        llIlIlIlIl[llIlIlIllI[28]] = lIllIIllIlIIl("kYFjxYX0ypI=", "RAkgZ");
        llIlIlIlIl[llIlIlIllI[29]] = lIllIIllIlIII("QioK3n6irqw=", "sovlm");
        llIlIlIlIl[llIlIlIllI[30]] = lIllIIllIlIII("jJR/D1PZhfR9e8zDD2rdlQ==", "QyAFr");
        llIlIlIlIl[llIlIlIllI[31]] = lIllIIllIlIII("gynfp9GEPiQ=", "eBhbL");
        llIlIlIlIl[llIlIlIllI[41]] = lIllIIllIIlll("LT8DPVMXLgU+GhAsHg==", "dMlSs");
        llIlIlIlIl[llIlIlIllI[42]] = lIllIIllIlIII("E717bsGHXPdF60YF7HJfJg==", "BXtlU");
        llIlIlIlIl[llIlIlIllI[43]] = lIllIIllIIlll("LwwPACU=", "xejlA");
        llIlIlIlIl[llIlIlIllI[44]] = lIllIIllIIlll("JiQcKCBVIxokIRwkGD8=", "uPyML");
        llIlIlIlIl[llIlIlIllI[45]] = lIllIIllIlIII("vah36SFtoGsQTtjn0bljag==", "HQlgW");
        llIlIlIlIl[llIlIlIllI[46]] = lIllIIllIlIII("Kx2C2rLByQI=", "AxbQI");
        llIlIlIlIl[llIlIlIllI[48]] = lIllIIllIlIIl("ySIUasFcQ2nHkIzHVCpSCHz2Dq73vOTG", "kIjcB");
        llIlIlIlIl[llIlIlIllI[49]] = lIllIIllIlIIl("gSyO+7kJLAefp0qmUzi6Sz+qW3HcAlcU", "MgEyY");
        llIlIlIlIl[llIlIlIllI[50]] = lIllIIllIlIIl("EyWBUsjTlnA=", "POfHC");
        llIlIlIlIl[llIlIlIllI[51]] = lIllIIllIIlll("ABocJx4=", "WsyKz");
        llIlIlIlIl[llIlIlIllI[47]] = lIllIIllIlIII("nlonuT+XPLo=", "CyTjG");
        llIlIlIlIl[llIlIlIllI[53]] = lIllIIllIlIII("TQ5wfVeC13A=", "VRHnT");
        llIlIlIlIl[llIlIlIllI[55]] = lIllIIllIlIII("DsFwXPdtaZE=", "dXyln");
        llIlIlIlIl[llIlIlIllI[57]] = lIllIIllIIlll("EBcPHg==", "Grnlf");
        llIlIlIlIl[llIlIlIllI[59]] = lIllIIllIIlll("ARAOBg==", "Vuotn");
        llIlIlIlIl[llIlIlIllI[61]] = lIllIIllIIlll("OSsAPQ==", "nNaOk");
        llIlIlIlIl[llIlIlIllI[63]] = lIllIIllIIlll("BzEwAA==", "PTQrA");
        llIlIlIlIl[llIlIlIllI[86]] = lIllIIllIlIII("mxKsyrzDdrjaoEYPefWJsA==", "MXheg");
        llIlIlIlIl[llIlIlIllI[87]] = lIllIIllIIlll("LAw2", "ocAWg");
    }

    public static void aL() {
        if (lIllIlIIIIIII(Static.getClient().getVar(llIlIlIllI[24]), llIlIlIllI[1])) {
            Static.getClient().invokeMenuAction(llIlIlIlIl[llIlIlIllI[30]], llIlIlIlIl[llIlIlIllI[31]], llIlIlIllI[1], MenuAction.CC_OP.getId(), llIlIlIllI[32], llIlIlIllI[33]);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2])) {
            C0018e.l(llIlIlIllI[19]);
            C0018e.l(llIlIlIllI[34]);
            C0018e.l(llIlIlIllI[35]);
            C0018e.l(llIlIlIllI[36]);
            C0018e.l(llIlIlIllI[37]);
            C0018e.l(llIlIlIllI[38]);
            C0018e.l(llIlIlIllI[39]);
            C0018e.l(llIlIlIllI[40]);
        }
        if (lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[11])) {
            String[] strArr = new String[llIlIlIllI[1]];
            strArr[llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[41]];
            if (lIllIIlllIlll(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[llIlIlIllI[1]];
                strArr2[llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[42]];
                Inventory.getFirst(strArr2).interact(llIlIlIlIl[llIlIlIllI[43]]);
            }
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[11]) && lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[41])) {
            String[] strArr3 = new String[llIlIlIllI[1]];
            strArr3[llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[44]];
            if (lIllIIlllIlll(Inventory.contains(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[llIlIlIllI[1]];
                strArr4[llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[45]];
                Inventory.getFirst(strArr4).interact(llIlIlIlIl[llIlIlIllI[46]]);
            }
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[41]) && lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[47])) {
            String[] strArr5 = new String[llIlIlIllI[1]];
            strArr5[llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[48]];
            if (lIllIIlllIlll(Inventory.contains(strArr5) ? 1 : 0)) {
                String[] strArr6 = new String[llIlIlIllI[1]];
                strArr6[llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[49]];
                Inventory.getFirst(strArr6).interact(llIlIlIlIl[llIlIlIllI[50]]);
            }
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[47]) && lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[21])) {
            int[] iArr = new int[llIlIlIllI[1]];
            iArr[llIlIlIllI[0]] = llIlIlIllI[17];
            if (lIllIIlllIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlIlIllI[1]];
                iArr2[llIlIlIllI[0]] = llIlIlIllI[17];
                Inventory.getFirst(iArr2).interact(llIlIlIlIl[llIlIlIllI[51]]);
            }
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[21])) {
            int[] iArr3 = new int[llIlIlIllI[1]];
            iArr3[llIlIlIllI[0]] = llIlIlIllI[18];
            if (lIllIIlllIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIlIlIllI[1]];
                iArr4[llIlIlIllI[0]] = llIlIlIllI[18];
                Inventory.getFirst(iArr4).interact(llIlIlIlIl[llIlIlIllI[47]]);
            }
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[47])) {
            int[] iArr5 = new int[llIlIlIllI[1]];
            iArr5[llIlIlIllI[0]] = llIlIlIllI[52];
            if (lIllIIlllIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIlIlIllI[1]];
                iArr6[llIlIlIllI[0]] = llIlIlIllI[52];
                Inventory.getFirst(iArr6).interact(llIlIlIlIl[llIlIlIllI[53]]);
            }
            int[] iArr7 = new int[llIlIlIllI[1]];
            iArr7[llIlIlIllI[0]] = llIlIlIllI[54];
            if (lIllIIlllIlll(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIlIlIllI[1]];
                iArr8[llIlIlIllI[0]] = llIlIlIllI[54];
                Inventory.getFirst(iArr8).interact(llIlIlIlIl[llIlIlIllI[55]]);
            }
            int[] iArr9 = new int[llIlIlIllI[1]];
            iArr9[llIlIlIllI[0]] = llIlIlIllI[56];
            if (lIllIIlllIlll(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIlIlIllI[1]];
                iArr10[llIlIlIllI[0]] = llIlIlIllI[56];
                Inventory.getFirst(iArr10).interact(llIlIlIlIl[llIlIlIllI[57]]);
            }
            int[] iArr11 = new int[llIlIlIllI[1]];
            iArr11[llIlIlIllI[0]] = llIlIlIllI[58];
            if (lIllIIlllIlll(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIlIlIllI[1]];
                iArr12[llIlIlIllI[0]] = llIlIlIllI[58];
                Inventory.getFirst(iArr12).interact(llIlIlIlIl[llIlIlIllI[59]]);
            }
        }
        int[] iArr13 = new int[llIlIlIllI[1]];
        iArr13[llIlIlIllI[0]] = llIlIlIllI[60];
        if (lIllIIlllIlll(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[llIlIlIllI[1]];
            iArr14[llIlIlIllI[0]] = llIlIlIllI[60];
            Inventory.getFirst(iArr14).interact(llIlIlIlIl[llIlIlIllI[61]]);
        }
        int[] iArr15 = new int[llIlIlIllI[1]];
        iArr15[llIlIlIllI[0]] = llIlIlIllI[62];
        if (lIllIIlllIlll(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[llIlIlIllI[1]];
            iArr16[llIlIlIllI[0]] = llIlIlIllI[62];
            Inventory.getFirst(iArr16).interact(llIlIlIlIl[llIlIlIllI[63]]);
        }
    }

    private static void lIllIIlllIlIl() {
        llIlIlIllI = new int[101];
        llIlIlIllI[0] = ((((127 + 111) - 194) + 86) ^ (((110 + 159) - 91) + 2)) & (((104 ^ 76) ^ (148 ^ 134)) ^ (-" ".length()));
        llIlIlIllI[1] = " ".length();
        llIlIlIllI[2] = 28 ^ 32;
        llIlIlIllI[3] = 116 ^ 63;
        llIlIlIllI[4] = "  ".length();
        llIlIlIllI[5] = "   ".length();
        llIlIlIllI[6] = (-((-5000) & 30703)) & (-2065) & 32767;
        llIlIlIllI[7] = (((105 + 28) - 130) + 138) ^ (((30 + 77) - 101) + 131);
        llIlIlIllI[8] = (-11277) & 12271;
        llIlIlIllI[9] = (-((-25537) & 28626)) & (-24579) & 28667;
        llIlIlIllI[10] = (-16433) & 24439;
        llIlIlIllI[11] = 82 ^ 87;
        llIlIlIllI[12] = (-21637) & 22015;
        llIlIlIllI[13] = 235 ^ 143;
        llIlIlIllI[14] = (((26 + 51) - (-55)) + 42) ^ (((45 + 20) - (-63)) + 33);
        llIlIlIllI[15] = 38 ^ 32;
        llIlIlIllI[16] = (102 ^ 17) ^ (217 ^ 169);
        llIlIlIllI[17] = (-18509) & 19839;
        llIlIlIllI[18] = (-14339) & 15671;
        llIlIlIllI[19] = (-((-1051) & 25627)) & (-133) & 31231;
        llIlIlIllI[20] = 61 ^ 53;
        llIlIlIllI[21] = 104 ^ 64;
        llIlIlIllI[22] = (14 ^ 73) ^ (213 ^ 152);
        llIlIlIllI[23] = (101 ^ 1) ^ (63 ^ 82);
        llIlIlIllI[24] = (170 ^ 199) ^ (254 ^ 152);
        llIlIlIllI[25] = 6 ^ 10;
        llIlIlIllI[26] = 85 ^ 88;
        llIlIlIllI[27] = 135 ^ 137;
        llIlIlIllI[28] = 140 ^ 156;
        llIlIlIllI[29] = (216 ^ 175) ^ (218 ^ 188);
        llIlIlIllI[30] = (62 ^ 114) ^ (120 ^ 38);
        llIlIlIllI[31] = 210 ^ 193;
        llIlIlIllI[32] = -" ".length();
        llIlIlIllI[33] = (-11937) & 38874814;
        llIlIlIllI[34] = (-1154) & 12281;
        llIlIlIllI[35] = (-8269) & 29566;
        llIlIlIllI[36] = (-2051) & 23351;
        llIlIlIllI[37] = (-10438) & 31741;
        llIlIlIllI[38] = (-((-6421) & 6940)) & (-24577) & 31663;
        llIlIlIllI[39] = (-1026) & 7549;
        llIlIlIllI[40] = (-((-8769) & 29647)) & (-33) & 32750;
        llIlIlIllI[41] = (71 ^ 87) ^ (59 ^ 63);
        llIlIlIllI[42] = (158 ^ 179) ^ (30 ^ 38);
        llIlIlIllI[43] = (29 ^ 101) ^ (31 ^ 113);
        llIlIlIllI[44] = (((144 + 51) - 178) + 169) ^ (((13 + 40) - 48) + 168);
        llIlIlIllI[45] = 129 ^ 153;
        llIlIlIllI[46] = 80 ^ 73;
        llIlIlIllI[47] = 127 ^ 97;
        llIlIlIllI[48] = (89 ^ 26) ^ (208 ^ 137);
        llIlIlIllI[49] = (36 ^ 50) ^ (29 ^ 16);
        llIlIlIllI[50] = (((96 + 103) - 97) + 43) ^ (((43 + 110) - 93) + 81);
        llIlIlIllI[51] = 150 ^ 139;
        llIlIlIllI[52] = (-((-2101) & 31029)) & (-2103) & 32191;
        llIlIlIllI[53] = 131 ^ 156;
        llIlIlIllI[54] = (-23189) & 24311;
        llIlIlIllI[55] = 97 ^ 65;
        llIlIlIllI[56] = (-((-1075) & 32247)) & (-11) & 32255;
        llIlIlIllI[57] = (((68 + 162) - 159) + 104) ^ (((32 + 128) - 63) + 45);
        llIlIlIllI[58] = (-((-1325) & 24445)) & (-1) & 24319;
        llIlIlIllI[59] = 134 ^ 164;
        llIlIlIllI[60] = (-12628) & 14331;
        llIlIlIllI[61] = 138 ^ 169;
        llIlIlIllI[62] = (-21642) & 32767;
        llIlIlIllI[63] = (11 ^ 52) ^ (91 ^ 64);
        llIlIlIllI[64] = 158 ^ 172;
        llIlIlIllI[65] = 49 ^ 119;
        llIlIlIllI[66] = (-18451) & 19350;
        llIlIlIllI[67] = (-24595) & 32602;
        llIlIlIllI[68] = (-8710) & 43709;
        llIlIlIllI[69] = (-580) & 25579;
        llIlIlIllI[70] = (-((-16357) & 32751)) & (-7681) & 24574;
        llIlIlIllI[71] = (-17477) & 32476;
        llIlIlIllI[72] = (-4806) & 589805;
        llIlIlIllI[73] = (-12946) & 637945;
        llIlIlIllI[74] = (-104) & 175103;
        llIlIlIllI[75] = (-2387) & 187386;
        llIlIlIllI[76] = (-((-8193) & 24999)) & (-4098) & 915903;
        llIlIlIllI[77] = (-((-12612) & 29143)) & (-8197) & 949727;
        llIlIlIllI[78] = (-((-8212) & 15295)) & (-17413) & 1474495;
        llIlIlIllI[79] = (-((-31753) & 32685)) & (-16388) & 1507319;
        llIlIlIllI[80] = (-21447) & 1171446;
        llIlIlIllI[81] = (-16390) & 1266389;
        llIlIlIllI[82] = (-((-7257) & 31997)) & (-4097) & 718836;
        llIlIlIllI[83] = (-13654) & 753653;
        llIlIlIllI[84] = (-((-61) & 15550)) & (-16387) & 2981875;
        llIlIlIllI[85] = (-((-9665) & 26599)) & (-65) & 3071998;
        llIlIlIllI[86] = (((44 + 75) - (-17)) + 3) ^ (((73 + 84) - 151) + 168);
        llIlIlIllI[87] = (((3 + 99) - 24) + 60) ^ (((99 + 126) - 89) + 36);
        llIlIlIllI[88] = (-((-1233) & 30709)) & (-1) & 32701;
        llIlIlIllI[89] = (-8454) & 11743;
        llIlIlIllI[90] = (-((-22945) & 31666)) & (-16707) & 28671;
        llIlIlIllI[91] = (-8965) & 12244;
        llIlIlIllI[92] = (-((-13641) & 30671)) & (-257) & 20471;
        llIlIlIllI[93] = (-((-3271) & 32743)) & (-129) & 32767;
        llIlIlIllI[94] = (((140 + 115) - 73) + 1) ^ (((74 + 124) - 91) + 28);
        llIlIlIllI[95] = (-28785) & 31997;
        llIlIlIllI[96] = (-((-3113) & 28603)) & (-4097) & 32767;
        llIlIlIllI[97] = (-((-3602) & 32603)) & (-513) & 32767;
        llIlIlIllI[98] = (-((-10335) & 14687)) & (-1) & 7583;
        llIlIlIllI[99] = (-((-17541) & 30621)) & (-4) & 16379;
        llIlIlIllI[100] = 128 ^ 167;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[3]) && lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[3]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2])) {
            ?? r0 = llIlIlIllI[1];
            "".length();
            return (-" ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIlIllI[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0336, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v205, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v241, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aJ() {
        if (lIllIIlllIlll(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlIlIlIl[llIlIlIllI[0]];
            C0015b.a(bv);
            if (lIllIIllllIII(bv.size(), llIlIlIllI[1])) {
                System.out.println(llIlIlIlIl[llIlIlIllI[1]]);
                bt = llIlIlIllI[0];
            }
        }
        if (lIllIIllllIIl(bt ? 1 : 0) && (!lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) || !lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[2]) || lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]))) {
            if (lIllIIllllIIl(aM() ? 1 : 0) && (!lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]) || !lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[3]) || lIllIIllllIII(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[3]))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIIllllIll(nearest) && lIllIIllllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIlIlIl[llIlIlIllI[4]];
                    C0000a.a(nearest);
                }
                if (lIllIIllllIll(nearest) && lIllIIlllIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIlIlIl[llIlIlIllI[5]];
                    if (lIllIIllllIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlIlIllI[6]);
                        "".length();
                    }
                    if (lIllIIlllIlll(Bank.isOpen() ? 1 : 0)) {
                        if (lIllIIlllllII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlIlIllI[1]);
                            "".length();
                        }
                        if (lIllIIlllllII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlIlIllI[4]);
                            "".length();
                        }
                        if (lIllIIllllIIl(aN() ? 1 : 0)) {
                            Q();
                            System.out.println(llIlIlIlIl[llIlIlIllI[7]]);
                            bt = llIlIlIllI[1];
                            return;
                        }
                        if (!lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) || (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) && lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]))) {
                            C0000a.a(cK, llIlIlIllI[1]);
                        }
                        if (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2])) {
                            C0000a.a(np, llIlIlIllI[1]);
                        }
                        C0000a.a(llIlIlIllI[8], llIlIlIllI[9]);
                        C0000a.b(C0019f.ba, llIlIlIllI[1]);
                        C0000a.a(llIlIlIllI[10], llIlIlIllI[11]);
                        C0000a.a(llIlIlIllI[12], llIlIlIllI[13]);
                    }
                }
            }
            if (lIllIIlllIlll(aM() ? 1 : 0)) {
                aL();
                if (lIllIIllllIlI(Movement.getRunEnergy(), llIlIlIllI[14]) && lIllIIllllIIl(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                String[] strArr = new String[llIlIlIllI[1]];
                strArr[llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[11]];
                if (lIllIIllllIIl(Equipment.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[llIlIlIllI[1]];
                    strArr2[llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[15]];
                    if (lIllIIllllIIl(Equipment.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[llIlIlIllI[1]];
                        strArr3[llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[16]];
                        if (lIllIIllllIIl(Equipment.contains(strArr3) ? 1 : 0)) {
                            int[] iArr = new int[llIlIlIllI[1]];
                            iArr[llIlIlIllI[0]] = llIlIlIllI[17];
                            if (lIllIIllllIIl(Equipment.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIlIlIllI[1]];
                                iArr2[llIlIlIllI[0]] = llIlIlIllI[18];
                                if (lIllIIllllIIl(Equipment.contains(iArr2) ? 1 : 0)) {
                                    int[] iArr3 = new int[llIlIlIllI[1]];
                                    iArr3[llIlIlIllI[0]] = llIlIlIllI[19];
                                }
                            }
                        }
                    }
                }
                aO();
                if (lIllIIllllllI(lIllIIlllIllI(C0018e.w(), 45.0d))) {
                    int[] iArr4 = new int[llIlIlIllI[1]];
                    iArr4[llIlIlIllI[0]] = llIlIlIllI[12];
                    if (lIllIIlllIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIlIlIllI[1]];
                        iArr5[llIlIlIllI[0]] = llIlIlIllI[12];
                        Inventory.getFirst(iArr5).interact(llIlIlIlIl[llIlIlIllI[20]]);
                        Time.sleepTicks(llIlIlIllI[1]);
                        "".length();
                    }
                }
                if ((lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[21]) && !lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[22])) || ((lIllIIllllIII(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[21]) && !lIllIIllllIII(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[22])) || (lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[21]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[22])))) {
                    C0029p.al();
                }
                if (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[21]) && lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[21]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[21]) && ((lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[21]) && !lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2])) || ((lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[21]) && !lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[2])) || (lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[21]) && lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]))))) {
                    C0025l.aj();
                }
            }
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2])) {
            if (!lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[3]) || lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[3])) {
                C0031r.aV();
                String[] strArr4 = new String[llIlIlIllI[1]];
                strArr4[llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[23]];
                if (lIllIIllllIIl(Equipment.contains(strArr4) ? 1 : 0)) {
                    String[] strArr5 = new String[llIlIlIllI[1]];
                    strArr5[llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[22]];
                    if (lIllIIllllIIl(Equipment.contains(strArr5) ? 1 : 0)) {
                        String[] strArr6 = new String[llIlIlIllI[1]];
                        strArr6[llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[24]];
                        if (lIllIIllllIIl(Equipment.contains(strArr6) ? 1 : 0)) {
                            int[] iArr6 = new int[llIlIlIllI[1]];
                            iArr6[llIlIlIllI[0]] = llIlIlIllI[17];
                            if (lIllIIllllIIl(Equipment.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[llIlIlIllI[1]];
                                iArr7[llIlIlIllI[0]] = llIlIlIllI[18];
                                if (lIllIIllllIIl(Equipment.contains(iArr7) ? 1 : 0)) {
                                    int[] iArr8 = new int[llIlIlIllI[1]];
                                    iArr8[llIlIlIllI[0]] = llIlIlIllI[19];
                                    if (!lIllIIlllIlll(Equipment.contains(iArr8) ? 1 : 0)) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                aO();
            }
        }
    }

    private static String lIllIIllIlIIl(String llllllllllllllllllIIIllIllllIIIl, String llllllllllllllllllIIIllIllllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIllIllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIllIllllIIll = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIllIllllIIll.init(llIlIlIllI[4], secretKeySpec);
            return new String(llllllllllllllllllIIIllIllllIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIllIllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIllIllllIIlI) {
            llllllllllllllllllIIIllIllllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIllllIIl(int i) {
        return i == 0;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            aJ();
            "".length();
            if ("  ".length() >= ((245 ^ 179) ^ (103 ^ 37))) {
                return ((171 ^ 162) ^ (201 ^ 130)) & (((42 ^ 36) ^ (76 ^ 0)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return llIlIlIllI[0];
    }

    private static boolean lIllIIlllllII(int i) {
        return i > 0;
    }

    private static boolean lIllIIllllllI(int i) {
        return i < 0;
    }

    public static void Q() {
        int[] iArr = new int[llIlIlIllI[1]];
        iArr[llIlIlIllI[0]] = llIlIlIllI[10];
        if (lIllIIllllIIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlIllI[10], llIlIlIllI[21], llIlIlIllI[66]));
            "".length();
        }
        int[] iArr2 = new int[llIlIlIllI[1]];
        iArr2[llIlIlIllI[0]] = llIlIlIllI[67];
        if (lIllIIllllIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlIllI[67], llIlIlIllI[11], llIlIlIllI[66]));
            "".length();
        }
        int[] iArr3 = new int[llIlIlIllI[1]];
        iArr3[llIlIlIllI[0]] = llIlIlIllI[62];
        if (lIllIIllllIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlIllI[62], llIlIlIllI[1], llIlIlIllI[68]));
            "".length();
        }
        int[] iArr4 = new int[llIlIlIllI[1]];
        iArr4[llIlIlIllI[0]] = llIlIlIllI[60];
        if (lIllIIllllIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlIllI[60], llIlIlIllI[1], llIlIlIllI[69]));
            "".length();
        }
        int[] iArr5 = new int[llIlIlIllI[1]];
        iArr5[llIlIlIllI[0]] = llIlIlIllI[12];
        if (lIllIIllllIIl(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlIllI[12], llIlIlIllI[13], llIlIlIllI[70]));
            "".length();
        }
        if ((lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[21]) && !lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2])) || (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) && lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]))) {
            int[] iArr6 = new int[llIlIlIllI[1]];
            iArr6[llIlIlIllI[0]] = llIlIlIllI[52];
            if (lIllIIllllIIl(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[52], llIlIlIllI[1], llIlIlIllI[71]));
                "".length();
            }
            int[] iArr7 = new int[llIlIlIllI[1]];
            iArr7[llIlIlIllI[0]] = llIlIlIllI[56];
            if (lIllIIllllIIl(Bank.contains(iArr7) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[56], llIlIlIllI[1], llIlIlIllI[71]));
                "".length();
            }
            int[] iArr8 = new int[llIlIlIllI[1]];
            iArr8[llIlIlIllI[0]] = llIlIlIllI[58];
            if (lIllIIllllIIl(Bank.contains(iArr8) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[58], llIlIlIllI[1], llIlIlIllI[71]));
                "".length();
            }
            int[] iArr9 = new int[llIlIlIllI[1]];
            iArr9[llIlIlIllI[0]] = llIlIlIllI[54];
            if (lIllIIllllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[54], llIlIlIllI[1], llIlIlIllI[71]));
                "".length();
            }
        }
        if (lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2])) {
            int[] iArr10 = new int[llIlIlIllI[1]];
            iArr10[llIlIlIllI[0]] = llIlIlIllI[52];
            if (lIllIIllllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[52], llIlIlIllI[1], llIlIlIllI[71]));
                "".length();
            }
            int[] iArr11 = new int[llIlIlIllI[1]];
            iArr11[llIlIlIllI[0]] = llIlIlIllI[56];
            if (lIllIIllllIIl(Bank.contains(iArr11) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[56], llIlIlIllI[1], llIlIlIllI[71]));
                "".length();
            }
            int[] iArr12 = new int[llIlIlIllI[1]];
            iArr12[llIlIlIllI[0]] = llIlIlIllI[58];
            if (lIllIIllllIIl(Bank.contains(iArr12) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[58], llIlIlIllI[1], llIlIlIllI[71]));
                "".length();
            }
            int[] iArr13 = new int[llIlIlIllI[1]];
            iArr13[llIlIlIllI[0]] = llIlIlIllI[54];
            if (lIllIIllllIIl(Bank.contains(iArr13) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[54], llIlIlIllI[1], llIlIlIllI[71]));
                "".length();
            }
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[2])) {
            int[] iArr14 = new int[llIlIlIllI[1]];
            iArr14[llIlIlIllI[0]] = llIlIlIllI[19];
            if (lIllIIllllIIl(Bank.contains(iArr14) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[19], llIlIlIllI[1], C0018e.c(llIlIlIllI[72], llIlIlIllI[73])));
                "".length();
            }
            int[] iArr15 = new int[llIlIlIllI[1]];
            iArr15[llIlIlIllI[0]] = llIlIlIllI[40];
            if (lIllIIllllIIl(Bank.contains(iArr15) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[40], llIlIlIllI[1], C0018e.c(llIlIlIllI[74], llIlIlIllI[75])));
                "".length();
            }
            int[] iArr16 = new int[llIlIlIllI[1]];
            iArr16[llIlIlIllI[0]] = llIlIlIllI[38];
            if (lIllIIllllIIl(Bank.contains(iArr16) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[38], llIlIlIllI[1], C0018e.c(llIlIlIllI[76], llIlIlIllI[77])));
                "".length();
            }
            int[] iArr17 = new int[llIlIlIllI[1]];
            iArr17[llIlIlIllI[0]] = llIlIlIllI[35];
            if (lIllIIllllIIl(Bank.contains(iArr17) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[35], llIlIlIllI[1], C0018e.c(llIlIlIllI[76], llIlIlIllI[77])));
                "".length();
            }
            int[] iArr18 = new int[llIlIlIllI[1]];
            iArr18[llIlIlIllI[0]] = llIlIlIllI[36];
            if (lIllIIllllIIl(Bank.contains(iArr18) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[36], llIlIlIllI[1], C0018e.c(llIlIlIllI[78], llIlIlIllI[79])));
                "".length();
            }
            int[] iArr19 = new int[llIlIlIllI[1]];
            iArr19[llIlIlIllI[0]] = llIlIlIllI[37];
            if (lIllIIllllIIl(Bank.contains(iArr19) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[37], llIlIlIllI[1], C0018e.c(llIlIlIllI[80], llIlIlIllI[81])));
                "".length();
            }
            int[] iArr20 = new int[llIlIlIllI[1]];
            iArr20[llIlIlIllI[0]] = llIlIlIllI[39];
            if (lIllIIllllIIl(Bank.contains(iArr20) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[39], llIlIlIllI[1], C0018e.c(llIlIlIllI[82], llIlIlIllI[83])));
                "".length();
            }
            int[] iArr21 = new int[llIlIlIllI[1]];
            iArr21[llIlIlIllI[0]] = llIlIlIllI[34];
            if (lIllIIllllIIl(Bank.contains(iArr21) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[34], llIlIlIllI[1], C0018e.c(llIlIlIllI[84], llIlIlIllI[85])));
                "".length();
            }
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[21])) {
            int[] iArr22 = new int[llIlIlIllI[1]];
            iArr22[llIlIlIllI[0]] = llIlIlIllI[18];
            if (lIllIIllllIIl(Bank.contains(iArr22) ? 1 : 0)) {
                bv.add(new C0017d(llIlIlIllI[18], llIlIlIllI[1], llIlIlIllI[69]));
                "".length();
            }
        }
        int[] iArr23 = new int[llIlIlIllI[1]];
        iArr23[llIlIlIllI[0]] = llIlIlIllI[17];
        if (lIllIIllllIIl(Bank.contains(iArr23) ? 1 : 0) && lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[21]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[47])) {
            bv.add(new C0017d(llIlIlIllI[17], llIlIlIllI[1], llIlIlIllI[71]));
            "".length();
        }
    }

    private static boolean lIllIlIIIIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String lIllIIllIIlll(String llllllllllllllllllIIIlllIIIlIIll, String llllllllllllllllllIIIlllIIIIllIl) {
        String llllllllllllllllllIIIlllIIIlIIll2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIIlllIIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIlllIIIlIIIl = new StringBuilder();
        char[] charArray = llllllllllllllllllIIIlllIIIIllIl.toCharArray();
        int llllllllllllllllllIIIlllIIIIllll = llIlIlIllI[0];
        char[] charArray2 = llllllllllllllllllIIIlllIIIlIIll2.toCharArray();
        int length = charArray2.length;
        int i = llIlIlIllI[0];
        while (lIllIIllllIII(i, length)) {
            char llllllllllllllllllIIIlllIIIlIlII = charArray2[i];
            llllllllllllllllllIIIlllIIIlIIIl.append((char) (llllllllllllllllllIIIlllIIIlIlII ^ charArray[llllllllllllllllllIIIlllIIIIllll % charArray.length]));
            "".length();
            llllllllllllllllllIIIlllIIIIllll++;
            i++;
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIIlllIIIlIIIl);
    }

    private static boolean lIllIlIIIIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllIIllllIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0538, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0572, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x05ac, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x05e6, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0620, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x006a, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x065a, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a4, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00de, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0118, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0152, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x018c, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01c6, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0200, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x023a, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02a6, code lost:
        return o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0014an.llIlIlIllI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0323, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x035d, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0397, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03d1, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x040b, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0445, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x047f, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x04fe, code lost:
        if (lIllIIlllIlll(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v132, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v164, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v225, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v267, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aM() {
        if (lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2])) {
            int[] iArr = new int[llIlIlIllI[1]];
            iArr[llIlIlIllI[0]] = llIlIlIllI[19];
            if (lIllIIllllIIl(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[llIlIlIllI[1]];
                iArr2[llIlIlIllI[0]] = llIlIlIllI[19];
            }
            int[] iArr3 = new int[llIlIlIllI[1]];
            iArr3[llIlIlIllI[0]] = llIlIlIllI[36];
            if (lIllIIllllIIl(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[llIlIlIllI[1]];
                iArr4[llIlIlIllI[0]] = llIlIlIllI[36];
            }
            int[] iArr5 = new int[llIlIlIllI[1]];
            iArr5[llIlIlIllI[0]] = llIlIlIllI[37];
            if (lIllIIllllIIl(Equipment.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIlIlIllI[1]];
                iArr6[llIlIlIllI[0]] = llIlIlIllI[37];
            }
            int[] iArr7 = new int[llIlIlIllI[1]];
            iArr7[llIlIlIllI[0]] = llIlIlIllI[35];
            if (lIllIIllllIIl(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[llIlIlIllI[1]];
                iArr8[llIlIlIllI[0]] = llIlIlIllI[35];
            }
            int[] iArr9 = new int[llIlIlIllI[1]];
            iArr9[llIlIlIllI[0]] = llIlIlIllI[39];
            if (lIllIIllllIIl(Equipment.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[llIlIlIllI[1]];
                iArr10[llIlIlIllI[0]] = llIlIlIllI[39];
            }
            int[] iArr11 = new int[llIlIlIllI[1]];
            iArr11[llIlIlIllI[0]] = llIlIlIllI[38];
            if (lIllIIllllIIl(Equipment.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[llIlIlIllI[1]];
                iArr12[llIlIlIllI[0]] = llIlIlIllI[38];
            }
            int[] iArr13 = new int[llIlIlIllI[1]];
            iArr13[llIlIlIllI[0]] = llIlIlIllI[34];
            if (lIllIIllllIIl(Inventory.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIlIlIllI[1]];
                iArr14[llIlIlIllI[0]] = llIlIlIllI[34];
            }
            int[] iArr15 = new int[llIlIlIllI[1]];
            iArr15[llIlIlIllI[0]] = llIlIlIllI[62];
            if (lIllIIllllIIl(Inventory.contains(iArr15) ? 1 : 0)) {
                int[] iArr16 = new int[llIlIlIllI[1]];
                iArr16[llIlIlIllI[0]] = llIlIlIllI[62];
            }
            int[] iArr17 = new int[llIlIlIllI[1]];
            iArr17[llIlIlIllI[0]] = llIlIlIllI[12];
            if (lIllIIllllIIl(Inventory.contains(iArr17) ? 1 : 0)) {
                int[] iArr18 = new int[llIlIlIllI[1]];
                iArr18[llIlIlIllI[0]] = llIlIlIllI[12];
            }
            ?? r0 = llIlIlIllI[1];
            "".length();
            return (((((111 + 184) - 104) + 0) ^ (((108 + 20) - 68) + 73)) & (((242 ^ 194) ^ (75 ^ 65)) ^ (-" ".length()))) != 0 ? ((((24 + 113) - (-39)) + 38) ^ (((35 + 37) - (-8)) + 51)) & (((74 ^ 65) ^ (3 ^ 93)) ^ (-" ".length())) : r0;
        } else if ((!lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[21]) || lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2])) && !(lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) && lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]))) {
            int[] iArr19 = new int[llIlIlIllI[1]];
            iArr19[llIlIlIllI[0]] = llIlIlIllI[17];
            if (lIllIIllllIIl(Equipment.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIlIlIllI[1]];
                iArr20[llIlIlIllI[0]] = llIlIlIllI[17];
            }
            int[] iArr21 = new int[llIlIlIllI[1]];
            iArr21[llIlIlIllI[0]] = llIlIlIllI[54];
            if (lIllIIllllIIl(Equipment.contains(iArr21) ? 1 : 0)) {
                int[] iArr22 = new int[llIlIlIllI[1]];
                iArr22[llIlIlIllI[0]] = llIlIlIllI[54];
            }
            int[] iArr23 = new int[llIlIlIllI[1]];
            iArr23[llIlIlIllI[0]] = llIlIlIllI[56];
            if (lIllIIllllIIl(Equipment.contains(iArr23) ? 1 : 0)) {
                int[] iArr24 = new int[llIlIlIllI[1]];
                iArr24[llIlIlIllI[0]] = llIlIlIllI[56];
            }
            int[] iArr25 = new int[llIlIlIllI[1]];
            iArr25[llIlIlIllI[0]] = llIlIlIllI[52];
            if (lIllIIllllIIl(Equipment.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[llIlIlIllI[1]];
                iArr26[llIlIlIllI[0]] = llIlIlIllI[52];
            }
            int[] iArr27 = new int[llIlIlIllI[1]];
            iArr27[llIlIlIllI[0]] = llIlIlIllI[58];
            if (lIllIIllllIIl(Equipment.contains(iArr27) ? 1 : 0)) {
                int[] iArr28 = new int[llIlIlIllI[1]];
                iArr28[llIlIlIllI[0]] = llIlIlIllI[58];
            }
            int[] iArr29 = new int[llIlIlIllI[1]];
            iArr29[llIlIlIllI[0]] = llIlIlIllI[60];
            if (lIllIIllllIIl(Equipment.contains(iArr29) ? 1 : 0)) {
                int[] iArr30 = new int[llIlIlIllI[1]];
                iArr30[llIlIlIllI[0]] = llIlIlIllI[60];
            }
            int[] iArr31 = new int[llIlIlIllI[1]];
            iArr31[llIlIlIllI[0]] = llIlIlIllI[62];
            if (lIllIIllllIIl(Equipment.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[llIlIlIllI[1]];
                iArr32[llIlIlIllI[0]] = llIlIlIllI[62];
            }
            int[] iArr33 = new int[llIlIlIllI[1]];
            iArr33[llIlIlIllI[0]] = llIlIlIllI[12];
            if (lIllIIlllIlll(Inventory.contains(iArr33) ? 1 : 0)) {
                ?? r02 = llIlIlIllI[1];
                "".length();
                return (-(133 ^ 128)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
            }
            return llIlIlIllI[0];
        } else {
            int[] iArr34 = new int[llIlIlIllI[1]];
            iArr34[llIlIlIllI[0]] = llIlIlIllI[18];
            if (lIllIIllllIIl(Equipment.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[llIlIlIllI[1]];
                iArr35[llIlIlIllI[0]] = llIlIlIllI[18];
            }
            int[] iArr36 = new int[llIlIlIllI[1]];
            iArr36[llIlIlIllI[0]] = llIlIlIllI[54];
            if (lIllIIllllIIl(Equipment.contains(iArr36) ? 1 : 0)) {
                int[] iArr37 = new int[llIlIlIllI[1]];
                iArr37[llIlIlIllI[0]] = llIlIlIllI[54];
            }
            int[] iArr38 = new int[llIlIlIllI[1]];
            iArr38[llIlIlIllI[0]] = llIlIlIllI[56];
            if (lIllIIllllIIl(Equipment.contains(iArr38) ? 1 : 0)) {
                int[] iArr39 = new int[llIlIlIllI[1]];
                iArr39[llIlIlIllI[0]] = llIlIlIllI[56];
            }
            int[] iArr40 = new int[llIlIlIllI[1]];
            iArr40[llIlIlIllI[0]] = llIlIlIllI[52];
            if (lIllIIllllIIl(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[llIlIlIllI[1]];
                iArr41[llIlIlIllI[0]] = llIlIlIllI[52];
            }
            int[] iArr42 = new int[llIlIlIllI[1]];
            iArr42[llIlIlIllI[0]] = llIlIlIllI[58];
            if (lIllIIllllIIl(Equipment.contains(iArr42) ? 1 : 0)) {
                int[] iArr43 = new int[llIlIlIllI[1]];
                iArr43[llIlIlIllI[0]] = llIlIlIllI[58];
            }
            int[] iArr44 = new int[llIlIlIllI[1]];
            iArr44[llIlIlIllI[0]] = llIlIlIllI[60];
            if (lIllIIllllIIl(Equipment.contains(iArr44) ? 1 : 0)) {
                int[] iArr45 = new int[llIlIlIllI[1]];
                iArr45[llIlIlIllI[0]] = llIlIlIllI[60];
            }
            int[] iArr46 = new int[llIlIlIllI[1]];
            iArr46[llIlIlIllI[0]] = llIlIlIllI[62];
            if (lIllIIllllIIl(Equipment.contains(iArr46) ? 1 : 0)) {
                int[] iArr47 = new int[llIlIlIllI[1]];
                iArr47[llIlIlIllI[0]] = llIlIlIllI[62];
            }
            int[] iArr48 = new int[llIlIlIllI[1]];
            iArr48[llIlIlIllI[0]] = llIlIlIllI[12];
            if (lIllIIlllIlll(Inventory.contains(iArr48) ? 1 : 0)) {
                ?? r03 = llIlIlIllI[1];
                "".length();
                return (-" ".length()) >= 0 ? " ".length() & (" ".length() ^ (-1)) : r03;
            }
            return llIlIlIllI[0];
        }
    }

    public static void aO() {
        if (lIllIIllllIII(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[22]) && lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[22]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[22]) && lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIllIIllllIII(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[41]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[22]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[41]) && lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[41]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[41]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[41]) && lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[41])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIllIIllllIII(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[47]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[41]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[41])) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[47]) && lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[47]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[41])) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[47]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[47]) && lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[47]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIllIIllllIII(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[21]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[47]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[47]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[21]) && lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[21]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[47]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[21]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[21]) && lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[21]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIllIIllllIII(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[64]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[21]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[21]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[64]) && lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[64]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[21]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[64]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[64]) && lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[64]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIllIIllllIII(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[64]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[64]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[2]) && lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[64]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) && lIllIIllllIII(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FOURTH)) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIllIIllllIII(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[65]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[2]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[65]) && lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[65]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIllIIllllIII(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[3]) && lIllIIllllIlI(Skills.getLevel(Skill.ATTACK), llIlIlIllI[65]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIllIIllllIlI(Skills.getLevel(Skill.STRENGTH), llIlIlIllI[3]) && lIllIIllllIII(Skills.getLevel(Skill.ATTACK), llIlIlIllI[3]) && lIllIIllllIlI(Skills.getLevel(Skill.DEFENCE), llIlIlIllI[2]) && lIllIlIIIIIIl(Combat.getAttackStyle(), Combat.AttackStyle.FIRST)) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
    }

    public static void am() {
        if (lIllIIllllIIl(cM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIlIlIlIl[llIlIlIllI[25]];
            Movement.walkTo(ck);
            "".length();
            Time.sleepTicks(llIlIlIllI[1]);
            "".length();
        }
        if (lIllIIlllIlll(cM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = llIlIlIlIl[llIlIlIllI[26]];
            if (lIllIIlllllll(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIllIIlllIlll(npc.getName().contains(llIlIlIlIl[llIlIlIllI[87]]) ? 1 : 0) && lIllIIlllllll(npc.getInteracting()) && lIllIIllllIIl(npc.isDead() ? 1 : 0)) {
                        ?? r0 = llIlIlIllI[1];
                        "".length();
                        return " ".length() <= (-" ".length()) ? ((80 ^ 68) ^ (215 ^ 133)) & (((97 ^ 72) ^ (22 ^ 121)) ^ (-" ".length())) : r0;
                    }
                    return llIlIlIllI[0];
                });
                String[] strArr = new String[llIlIlIllI[4]];
                strArr[llIlIlIllI[0]] = llIlIlIlIl[llIlIlIllI[27]];
                strArr[llIlIlIllI[1]] = llIlIlIlIl[llIlIlIllI[14]];
                List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                    if (lIllIlIIIIIlI(npc2.getInteracting(), Players.getLocal())) {
                        ?? r0 = llIlIlIllI[1];
                        "".length();
                        return " ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIlIlIllI[0];
                }).collect(Collectors.toList());
                if (lIllIIllllIIl(list.isEmpty() ? 1 : 0)) {
                    ((NPC) list.get(llIlIlIllI[0])).interact(llIlIlIlIl[llIlIlIllI[28]]);
                    Time.sleepTicks(llIlIlIllI[4]);
                    "".length();
                }
                if (lIllIIllllIll(nearest) && lIllIIllllIIl(Players.getLocal().isMoving() ? 1 : 0) && lIllIIlllIlll(list.isEmpty() ? 1 : 0)) {
                    nearest.interact(llIlIlIlIl[llIlIlIllI[29]]);
                    Time.sleepTicks(llIlIlIllI[4]);
                    "".length();
                }
            }
            if (lIllIIllllIll(Players.getLocal().getInteracting())) {
                Time.sleepTicks(llIlIlIllI[7]);
                "".length();
            }
        }
    }

    private static boolean lIllIIlllllll(Object obj) {
        return obj == null;
    }

    private static int lIllIIlllIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    static {
        lIllIIlllIlIl();
        lIllIIllIlIlI();
        bv = new ArrayList();
        int[] iArr = new int[llIlIlIllI[20]];
        iArr[llIlIlIllI[0]] = llIlIlIllI[17];
        iArr[llIlIlIllI[1]] = llIlIlIllI[18];
        iArr[llIlIlIllI[4]] = llIlIlIllI[54];
        iArr[llIlIlIllI[5]] = llIlIlIllI[56];
        iArr[llIlIlIllI[7]] = llIlIlIllI[52];
        iArr[llIlIlIllI[11]] = llIlIlIllI[58];
        iArr[llIlIlIllI[15]] = llIlIlIllI[60];
        iArr[llIlIlIllI[16]] = llIlIlIllI[62];
        cK = iArr;
        int[] iArr2 = new int[llIlIlIllI[23]];
        iArr2[llIlIlIllI[0]] = llIlIlIllI[19];
        iArr2[llIlIlIllI[1]] = llIlIlIllI[34];
        iArr2[llIlIlIllI[4]] = llIlIlIllI[35];
        iArr2[llIlIlIllI[5]] = llIlIlIllI[36];
        iArr2[llIlIlIllI[7]] = llIlIlIllI[37];
        iArr2[llIlIlIllI[11]] = llIlIlIllI[38];
        iArr2[llIlIlIllI[15]] = llIlIlIllI[39];
        iArr2[llIlIlIllI[16]] = llIlIlIllI[62];
        iArr2[llIlIlIllI[20]] = llIlIlIllI[40];
        np = iArr2;
        cL = new WorldArea(llIlIlIllI[88], llIlIlIllI[89], llIlIlIllI[24], llIlIlIllI[24], llIlIlIllI[0]);
        cM = new WorldArea(llIlIlIllI[90], llIlIlIllI[91], llIlIlIllI[42], llIlIlIllI[28], llIlIlIllI[0]);
        cN = new WorldArea(llIlIlIllI[92], llIlIlIllI[93], llIlIlIllI[94], llIlIlIllI[47], llIlIlIllI[0]);
        cO = new WorldPoint(llIlIlIllI[95], llIlIlIllI[96], llIlIlIllI[0]);
        ck = new WorldPoint(llIlIlIllI[97], llIlIlIllI[89], llIlIlIllI[0]);
        cP = new WorldPoint(llIlIlIllI[98], llIlIlIllI[99], llIlIlIllI[0]);
    }

    private static boolean lIllIIlllIlll(int i) {
        return i != 0;
    }
}
