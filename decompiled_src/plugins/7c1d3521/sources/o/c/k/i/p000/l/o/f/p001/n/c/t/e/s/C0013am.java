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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.am  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/am.class */
public class C0013am implements InterfaceC0003ac {
    public static /* synthetic */ WorldPoint cO;
    private static /* synthetic */ String[] lllIIIIIII;
    public static /* synthetic */ WorldArea cN;
    public static /* synthetic */ WorldArea cL;
    public static /* synthetic */ WorldPoint cP;
    public static /* synthetic */ int[] cK;
    private static /* synthetic */ int[] lllIIIIIIl;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0017d> bv;
    public static /* synthetic */ WorldPoint ck;
    public static /* synthetic */ WorldArea cM;

    private static boolean lIllllIlIIlII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0573, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0598, code lost:
        return o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0013am.lllIIIIIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0114, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016b, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c2, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0219, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0270, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02aa, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02da, code lost:
        return o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.C0013am.lllIIIIIIl[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x032f, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0386, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03dd, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0434, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x048b, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04e2, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0539, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v230, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aN() {
        if (lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[39])) {
            int[] iArr = new int[lllIIIIIIl[1]];
            iArr[lllIIIIIIl[0]] = lllIIIIIIl[18];
            if (lIllllIlIIIlI(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIIIIIl[1]];
                iArr2[lllIIIIIIl[0]] = lllIIIIIIl[18];
                if (lIllllIlIIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lllIIIIIIl[1]];
                    iArr3[lllIIIIIIl[0]] = lllIIIIIIl[18];
                }
            }
            int[] iArr4 = new int[lllIIIIIIl[1]];
            iArr4[lllIIIIIIl[0]] = lllIIIIIIl[44];
            if (lIllllIlIIIlI(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lllIIIIIIl[1]];
                iArr5[lllIIIIIIl[0]] = lllIIIIIIl[44];
                if (lIllllIlIIIlI(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lllIIIIIIl[1]];
                    iArr6[lllIIIIIIl[0]] = lllIIIIIIl[44];
                }
            }
            int[] iArr7 = new int[lllIIIIIIl[1]];
            iArr7[lllIIIIIIl[0]] = lllIIIIIIl[45];
            if (lIllllIlIIIlI(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIIIIIIl[1]];
                iArr8[lllIIIIIIl[0]] = lllIIIIIIl[45];
                if (lIllllIlIIIlI(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lllIIIIIIl[1]];
                    iArr9[lllIIIIIIl[0]] = lllIIIIIIl[45];
                }
            }
            int[] iArr10 = new int[lllIIIIIIl[1]];
            iArr10[lllIIIIIIl[0]] = lllIIIIIIl[42];
            if (lIllllIlIIIlI(Equipment.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lllIIIIIIl[1]];
                iArr11[lllIIIIIIl[0]] = lllIIIIIIl[42];
                if (lIllllIlIIIlI(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lllIIIIIIl[1]];
                    iArr12[lllIIIIIIl[0]] = lllIIIIIIl[42];
                }
            }
            int[] iArr13 = new int[lllIIIIIIl[1]];
            iArr13[lllIIIIIIl[0]] = lllIIIIIIl[47];
            if (lIllllIlIIIlI(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lllIIIIIIl[1]];
                iArr14[lllIIIIIIl[0]] = lllIIIIIIl[47];
                if (lIllllIlIIIlI(Inventory.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lllIIIIIIl[1]];
                    iArr15[lllIIIIIIl[0]] = lllIIIIIIl[47];
                }
            }
            int[] iArr16 = new int[lllIIIIIIl[1]];
            iArr16[lllIIIIIIl[0]] = lllIIIIIIl[49];
            if (lIllllIlIIIlI(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lllIIIIIIl[1]];
                iArr17[lllIIIIIIl[0]] = lllIIIIIIl[49];
                if (lIllllIlIIIlI(Equipment.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lllIIIIIIl[1]];
                    iArr18[lllIIIIIIl[0]] = lllIIIIIIl[49];
                }
            }
            int[] iArr19 = new int[lllIIIIIIl[1]];
            iArr19[lllIIIIIIl[0]] = lllIIIIIIl[51];
            if (lIllllIlIIIlI(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lllIIIIIIl[1]];
                iArr20[lllIIIIIIl[0]] = lllIIIIIIl[51];
                if (lIllllIlIIIlI(Equipment.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lllIIIIIIl[1]];
                    iArr21[lllIIIIIIl[0]] = lllIIIIIIl[51];
                }
            }
            int[] iArr22 = new int[lllIIIIIIl[1]];
            iArr22[lllIIIIIIl[0]] = lllIIIIIIl[12];
            if (lIllllIlIIIlI(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lllIIIIIIl[1]];
                iArr23[lllIIIIIIl[0]] = lllIIIIIIl[12];
            }
            ?? r0 = lllIIIIIIl[1];
            "".length();
            return " ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        int[] iArr24 = new int[lllIIIIIIl[1]];
        iArr24[lllIIIIIIl[0]] = lllIIIIIIl[17];
        if (lIllllIlIIIlI(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lllIIIIIIl[1]];
            iArr25[lllIIIIIIl[0]] = lllIIIIIIl[17];
            if (lIllllIlIIIlI(Inventory.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[lllIIIIIIl[1]];
                iArr26[lllIIIIIIl[0]] = lllIIIIIIl[17];
            }
        }
        int[] iArr27 = new int[lllIIIIIIl[1]];
        iArr27[lllIIIIIIl[0]] = lllIIIIIIl[44];
        if (lIllllIlIIIlI(Equipment.contains(iArr27) ? 1 : 0)) {
            int[] iArr28 = new int[lllIIIIIIl[1]];
            iArr28[lllIIIIIIl[0]] = lllIIIIIIl[44];
            if (lIllllIlIIIlI(Inventory.contains(iArr28) ? 1 : 0)) {
                int[] iArr29 = new int[lllIIIIIIl[1]];
                iArr29[lllIIIIIIl[0]] = lllIIIIIIl[44];
            }
        }
        int[] iArr30 = new int[lllIIIIIIl[1]];
        iArr30[lllIIIIIIl[0]] = lllIIIIIIl[45];
        if (lIllllIlIIIlI(Equipment.contains(iArr30) ? 1 : 0)) {
            int[] iArr31 = new int[lllIIIIIIl[1]];
            iArr31[lllIIIIIIl[0]] = lllIIIIIIl[45];
            if (lIllllIlIIIlI(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[lllIIIIIIl[1]];
                iArr32[lllIIIIIIl[0]] = lllIIIIIIl[45];
            }
        }
        int[] iArr33 = new int[lllIIIIIIl[1]];
        iArr33[lllIIIIIIl[0]] = lllIIIIIIl[42];
        if (lIllllIlIIIlI(Equipment.contains(iArr33) ? 1 : 0)) {
            int[] iArr34 = new int[lllIIIIIIl[1]];
            iArr34[lllIIIIIIl[0]] = lllIIIIIIl[42];
            if (lIllllIlIIIlI(Inventory.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[lllIIIIIIl[1]];
                iArr35[lllIIIIIIl[0]] = lllIIIIIIl[42];
            }
        }
        int[] iArr36 = new int[lllIIIIIIl[1]];
        iArr36[lllIIIIIIl[0]] = lllIIIIIIl[47];
        if (lIllllIlIIIlI(Equipment.contains(iArr36) ? 1 : 0)) {
            int[] iArr37 = new int[lllIIIIIIl[1]];
            iArr37[lllIIIIIIl[0]] = lllIIIIIIl[47];
            if (lIllllIlIIIlI(Inventory.contains(iArr37) ? 1 : 0)) {
                int[] iArr38 = new int[lllIIIIIIl[1]];
                iArr38[lllIIIIIIl[0]] = lllIIIIIIl[47];
            }
        }
        int[] iArr39 = new int[lllIIIIIIl[1]];
        iArr39[lllIIIIIIl[0]] = lllIIIIIIl[49];
        if (lIllllIlIIIlI(Inventory.contains(iArr39) ? 1 : 0)) {
            int[] iArr40 = new int[lllIIIIIIl[1]];
            iArr40[lllIIIIIIl[0]] = lllIIIIIIl[49];
            if (lIllllIlIIIlI(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[lllIIIIIIl[1]];
                iArr41[lllIIIIIIl[0]] = lllIIIIIIl[49];
            }
        }
        int[] iArr42 = new int[lllIIIIIIl[1]];
        iArr42[lllIIIIIIl[0]] = lllIIIIIIl[51];
        if (lIllllIlIIIlI(Inventory.contains(iArr42) ? 1 : 0)) {
            int[] iArr43 = new int[lllIIIIIIl[1]];
            iArr43[lllIIIIIIl[0]] = lllIIIIIIl[51];
            if (lIllllIlIIIlI(Equipment.contains(iArr43) ? 1 : 0)) {
                int[] iArr44 = new int[lllIIIIIIl[1]];
                iArr44[lllIIIIIIl[0]] = lllIIIIIIl[51];
            }
        }
        int[] iArr45 = new int[lllIIIIIIl[1]];
        iArr45[lllIIIIIIl[0]] = lllIIIIIIl[12];
        if (lIllllIlIIIlI(Inventory.contains(iArr45) ? 1 : 0)) {
            int[] iArr46 = new int[lllIIIIIIl[1]];
            iArr46[lllIIIIIIl[0]] = lllIIIIIIl[12];
        }
        ?? r02 = lllIIIIIIl[1];
        "".length();
        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
    }

    private static boolean lIllllIlIIlll(Object obj) {
        return obj == null;
    }

    private static boolean lIllllIlIlIII(int i, int i2) {
        return i == i2;
    }

    private static String lIllllIIlllII(String lllllllllllllllllIlllllIllIlIIlI, String lllllllllllllllllIlllllIllIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllllIllIlIIIl.getBytes(StandardCharsets.UTF_8)), lllIIIIIIl[19]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIIIIIIl[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllllIllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllllIllIlIIll) {
            lllllllllllllllllIlllllIllIlIIll.printStackTrace();
            return null;
        }
    }

    public static void aL() {
        if (lIllllIlIlIII(Static.getClient().getVar(lllIIIIIIl[23]), lllIIIIIIl[1])) {
            AccBuilderSotf.c = lllIIIIIII[lllIIIIIIl[14]];
            Static.getClient().invokeMenuAction(lllIIIIIII[lllIIIIIIl[27]], lllIIIIIII[lllIIIIIIl[28]], lllIIIIIIl[1], MenuAction.CC_OP.getId(), lllIIIIIIl[29], lllIIIIIIl[30]);
        }
        if (lIllllIlIIIIl(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[11])) {
            String[] strArr = new String[lllIIIIIIl[1]];
            strArr[lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[31]];
            if (lIllllIlIIIII(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lllIIIIIIl[1]];
                strArr2[lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[32]];
                Inventory.getFirst(strArr2).interact(lllIIIIIII[lllIIIIIIl[20]]);
            }
        }
        if (lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[11]) && lIllllIlIIIIl(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[20])) {
            String[] strArr3 = new String[lllIIIIIIl[1]];
            strArr3[lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[33]];
            if (lIllllIlIIIII(Inventory.contains(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[lllIIIIIIl[1]];
                strArr4[lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[34]];
                Inventory.getFirst(strArr4).interact(lllIIIIIII[lllIIIIIIl[35]]);
            }
        }
        if (lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[20]) && lIllllIlIIIIl(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[2])) {
            String[] strArr5 = new String[lllIIIIIIl[1]];
            strArr5[lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[36]];
            if (lIllllIlIIIII(Inventory.contains(strArr5) ? 1 : 0)) {
                String[] strArr6 = new String[lllIIIIIIl[1]];
                strArr6[lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[37]];
                Inventory.getFirst(strArr6).interact(lllIIIIIII[lllIIIIIIl[38]]);
            }
        }
        if (lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[2]) && lIllllIlIIIIl(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[39])) {
            int[] iArr = new int[lllIIIIIIl[1]];
            iArr[lllIIIIIIl[0]] = lllIIIIIIl[17];
            if (lIllllIlIIIII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIIIIIl[1]];
                iArr2[lllIIIIIIl[0]] = lllIIIIIIl[17];
                Inventory.getFirst(iArr2).interact(lllIIIIIII[lllIIIIIIl[40]]);
            }
        }
        if (lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[39])) {
            int[] iArr3 = new int[lllIIIIIIl[1]];
            iArr3[lllIIIIIIl[0]] = lllIIIIIIl[18];
            if (lIllllIlIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lllIIIIIIl[1]];
                iArr4[lllIIIIIIl[0]] = lllIIIIIIl[18];
                Inventory.getFirst(iArr4).interact(lllIIIIIII[lllIIIIIIl[41]]);
            }
        }
        if (lIllllIlIIIll(Skills.getLevel(Skill.DEFENCE), lllIIIIIIl[2])) {
            int[] iArr5 = new int[lllIIIIIIl[1]];
            iArr5[lllIIIIIIl[0]] = lllIIIIIIl[42];
            if (lIllllIlIIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIIIIIIl[1]];
                iArr6[lllIIIIIIl[0]] = lllIIIIIIl[42];
                Inventory.getFirst(iArr6).interact(lllIIIIIII[lllIIIIIIl[43]]);
            }
            int[] iArr7 = new int[lllIIIIIIl[1]];
            iArr7[lllIIIIIIl[0]] = lllIIIIIIl[44];
            if (lIllllIlIIIII(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIIIIIIl[1]];
                iArr8[lllIIIIIIl[0]] = lllIIIIIIl[44];
                Inventory.getFirst(iArr8).interact(lllIIIIIII[lllIIIIIIl[2]]);
            }
            int[] iArr9 = new int[lllIIIIIIl[1]];
            iArr9[lllIIIIIIl[0]] = lllIIIIIIl[45];
            if (lIllllIlIIIII(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lllIIIIIIl[1]];
                iArr10[lllIIIIIIl[0]] = lllIIIIIIl[45];
                Inventory.getFirst(iArr10).interact(lllIIIIIII[lllIIIIIIl[46]]);
            }
            int[] iArr11 = new int[lllIIIIIIl[1]];
            iArr11[lllIIIIIIl[0]] = lllIIIIIIl[47];
            if (lIllllIlIIIII(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lllIIIIIIl[1]];
                iArr12[lllIIIIIIl[0]] = lllIIIIIIl[47];
                Inventory.getFirst(iArr12).interact(lllIIIIIII[lllIIIIIIl[48]]);
            }
        }
        int[] iArr13 = new int[lllIIIIIIl[1]];
        iArr13[lllIIIIIIl[0]] = lllIIIIIIl[49];
        if (lIllllIlIIIII(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lllIIIIIIl[1]];
            iArr14[lllIIIIIIl[0]] = lllIIIIIIl[49];
            Inventory.getFirst(iArr14).interact(lllIIIIIII[lllIIIIIIl[50]]);
        }
        int[] iArr15 = new int[lllIIIIIIl[1]];
        iArr15[lllIIIIIIl[0]] = lllIIIIIIl[51];
        if (lIllllIlIIIII(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lllIIIIIIl[1]];
            iArr16[lllIIIIIIl[0]] = lllIIIIIIl[51];
            Inventory.getFirst(iArr16).interact(lllIIIIIII[lllIIIIIIl[52]]);
        }
    }

    private static boolean lIllllIlIIIIl(int i, int i2) {
        return i < i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return lllIIIIIII[lllIIIIIIl[59]];
    }

    private static void lIllllIIlllIl() {
        lllIIIIIII = new String[lllIIIIIIl[73]];
        lllIIIIIII[lllIIIIIIl[0]] = lIllllIIIlllI("mOSc/Am5U8AEds0SqGz6pw==", "RrZoj");
        lllIIIIIII[lllIIIIIIl[1]] = lIllllIIIllll("AhwNDRUsEAdEBDEMCgoBZBwXAQs3WUMXES0BAAwPKhJDBgcnHkMQCWQYBggDIVUXFgctGwoKAQ==", "Ducdf");
        lllIIIIIII[lllIIIIIIl[4]] = lIllllIIIlllI("L4Rg2G3BgtPSxsiCfPs/KQcC0REBajML", "TseZm");
        lllIIIIIII[lllIIIIIIl[5]] = lIllllIIIlllI("15bQzt3Ll+epDR6L9GJRFs1/3s8BEx4d", "DUAgG");
        lllIIIIIII[lllIIIIIIl[7]] = lIllllIIIllll("MQtiJCMDTi8sIhUHLCJxFRsyNT0PCzFpcRUZKzEyDgcsInESAWIHBD8nDAI=", "fnBEQ");
        lllIIIIIII[lllIIIIIIl[11]] = lIllllIIlllII("Fq+ZijoW2QxXPxTE/HvtHA==", "AQgLj");
        lllIIIIIII[lllIIIIIIl[15]] = lIllllIIIllll("PwwOLT5MCwghPwUMCjo=", "lxkHR");
        lllIIIIIII[lllIIIIIIl[16]] = lIllllIIIllll("BAcyDxYgAmYUByADLxMFOw==", "InFgd");
        lllIIIIIII[lllIIIIIIl[19]] = lIllllIIlllII("qWMrb4LAFDI=", "EMaIu");
        lllIIIIIII[lllIIIIIIl[21]] = lIllllIIIlllI("Iwnxclo6vPmj5NeOzcA/HMvVfWiV+5VM", "ZUvEG");
        lllIIIIIII[lllIIIIIIl[22]] = lIllllIIIlllI("RNYuCr9nRA/J/okPdwYyTw==", "sCEuo");
        lllIIIIIII[lllIIIIIIl[23]] = lIllllIIIlllI("ytXcBcmDXbM=", "SIqna");
        lllIIIIIII[lllIIIIIIl[24]] = lIllllIIIlllI("uowtC70oYMo=", "cvdUi");
        lllIIIIIII[lllIIIIIIl[25]] = lIllllIIlllII("0SSAur7J1u0=", "pwlnr");
        lllIIIIIII[lllIIIIIIl[26]] = lIllllIIIlllI("QUYmBzj6KIQ=", "lViwC");
        lllIIIIIII[lllIIIIIIl[14]] = lIllllIIIlllI("7R+szm39071HARmqm4nwvnjj68mLkfTX", "GNSHL");
        lllIIIIIII[lllIIIIIIl[27]] = lIllllIIIlllI("3RFVxD0XW7cfJqZFbIJgMA==", "ddPMD");
        lllIIIIIII[lllIIIIIIl[28]] = lIllllIIIlllI("BaBevXVAUOE=", "cThSB");
        lllIIIIIII[lllIIIIIIl[31]] = lIllllIIlllII("SioBbKYiGCt17gp1tY2JrQ==", "PVnru");
        lllIIIIIII[lllIIIIIIl[32]] = lIllllIIlllII("a9TAoKVTvPxY3VUMpzpvlQ==", "driJa");
        lllIIIIIII[lllIIIIIIl[20]] = lIllllIIIllll("ED4GAw8=", "GWcok");
        lllIIIIIII[lllIIIIIIl[33]] = lIllllIIIlllI("h05l//NHyFU9FV7DRVWXHg==", "AcRKd");
        lllIIIIIII[lllIIIIIIl[34]] = lIllllIIIlllI("gKb4VShbc4Zu6STfeMmwWA==", "Vnzdj");
        lllIIIIIII[lllIIIIIIl[35]] = lIllllIIIllll("Lx8BGwA=", "xvdwd");
        lllIIIIIII[lllIIIIIIl[36]] = lIllllIIIlllI("mklE5x6mTKoGoSf4eRtYFqVB2XVb0ZvJ", "KuNiq");
        lllIIIIIII[lllIIIIIIl[37]] = lIllllIIlllII("ZQ0Sf7qPoIq/7wp2/o+KhbNsrbB49Gzh", "LKRrd");
        lllIIIIIII[lllIIIIIIl[38]] = lIllllIIlllII("kH7C0U13gI4=", "pUcOn");
        lllIIIIIII[lllIIIIIIl[40]] = lIllllIIlllII("ifA/01aZgNc=", "KfCOD");
        lllIIIIIII[lllIIIIIIl[41]] = lIllllIIlllII("8z9Pdo5J8/I=", "nTqDm");
        lllIIIIIII[lllIIIIIIl[43]] = lIllllIIIlllI("ZFmg8NChedg=", "JbdtV");
        lllIIIIIII[lllIIIIIIl[2]] = lIllllIIIllll("OxAOAQ==", "luosL");
        lllIIIIIII[lllIIIIIIl[46]] = lIllllIIlllII("G8MVxxu1L+8=", "kqLfn");
        lllIIIIIII[lllIIIIIIl[48]] = lIllllIIIllll("BA8qBA==", "SjKvq");
        lllIIIIIII[lllIIIIIIl[50]] = lIllllIIIllll("MhYxFg==", "esPdZ");
        lllIIIIIII[lllIIIIIIl[52]] = lIllllIIIlllI("yH3Lgj54MGI=", "iRYiE");
        lllIIIIIII[lllIIIIIIl[59]] = lIllllIIIlllI("zizd0S2DfIY=", "vilnz");
        lllIIIIIII[lllIIIIIIl[60]] = lIllllIIlllII("DCNETRHwr+M=", "AsMRg");
    }

    private static boolean lIllllIlIIlIl(int i) {
        return i > 0;
    }

    private static int lIllllIIlllll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0083, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bd, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f7, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0131, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016b, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a5, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0245, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x027f, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02b9, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02f3, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x032d, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0367, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x03a1, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean aM() {
        if (lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[39])) {
            int[] iArr = new int[lllIIIIIIl[1]];
            iArr[lllIIIIIIl[0]] = lllIIIIIIl[18];
            if (lIllllIlIIIlI(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIIIIIl[1]];
                iArr2[lllIIIIIIl[0]] = lllIIIIIIl[18];
            }
            int[] iArr3 = new int[lllIIIIIIl[1]];
            iArr3[lllIIIIIIl[0]] = lllIIIIIIl[44];
            if (lIllllIlIIIlI(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lllIIIIIIl[1]];
                iArr4[lllIIIIIIl[0]] = lllIIIIIIl[44];
            }
            int[] iArr5 = new int[lllIIIIIIl[1]];
            iArr5[lllIIIIIIl[0]] = lllIIIIIIl[45];
            if (lIllllIlIIIlI(Equipment.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIIIIIIl[1]];
                iArr6[lllIIIIIIl[0]] = lllIIIIIIl[45];
            }
            int[] iArr7 = new int[lllIIIIIIl[1]];
            iArr7[lllIIIIIIl[0]] = lllIIIIIIl[42];
            if (lIllllIlIIIlI(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIIIIIIl[1]];
                iArr8[lllIIIIIIl[0]] = lllIIIIIIl[42];
            }
            int[] iArr9 = new int[lllIIIIIIl[1]];
            iArr9[lllIIIIIIl[0]] = lllIIIIIIl[47];
            if (lIllllIlIIIlI(Equipment.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lllIIIIIIl[1]];
                iArr10[lllIIIIIIl[0]] = lllIIIIIIl[47];
            }
            int[] iArr11 = new int[lllIIIIIIl[1]];
            iArr11[lllIIIIIIl[0]] = lllIIIIIIl[49];
            if (lIllllIlIIIlI(Equipment.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lllIIIIIIl[1]];
                iArr12[lllIIIIIIl[0]] = lllIIIIIIl[49];
            }
            int[] iArr13 = new int[lllIIIIIIl[1]];
            iArr13[lllIIIIIIl[0]] = lllIIIIIIl[51];
            if (lIllllIlIIIlI(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lllIIIIIIl[1]];
                iArr14[lllIIIIIIl[0]] = lllIIIIIIl[51];
            }
            int[] iArr15 = new int[lllIIIIIIl[1]];
            iArr15[lllIIIIIIl[0]] = lllIIIIIIl[12];
            if (lIllllIlIIIII(Inventory.contains(iArr15) ? 1 : 0)) {
                ?? r0 = lllIIIIIIl[1];
                "".length();
                return "   ".length() <= 0 ? ((242 ^ 191) ^ (232 ^ 170)) & (((((117 + 111) - 153) + 56) ^ (((36 + 88) - 89) + 105)) ^ (-" ".length())) : r0;
            }
            return lllIIIIIIl[0];
        }
        int[] iArr16 = new int[lllIIIIIIl[1]];
        iArr16[lllIIIIIIl[0]] = lllIIIIIIl[17];
        if (lIllllIlIIIlI(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lllIIIIIIl[1]];
            iArr17[lllIIIIIIl[0]] = lllIIIIIIl[17];
        }
        int[] iArr18 = new int[lllIIIIIIl[1]];
        iArr18[lllIIIIIIl[0]] = lllIIIIIIl[44];
        if (lIllllIlIIIlI(Equipment.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lllIIIIIIl[1]];
            iArr19[lllIIIIIIl[0]] = lllIIIIIIl[44];
        }
        int[] iArr20 = new int[lllIIIIIIl[1]];
        iArr20[lllIIIIIIl[0]] = lllIIIIIIl[45];
        if (lIllllIlIIIlI(Equipment.contains(iArr20) ? 1 : 0)) {
            int[] iArr21 = new int[lllIIIIIIl[1]];
            iArr21[lllIIIIIIl[0]] = lllIIIIIIl[45];
        }
        int[] iArr22 = new int[lllIIIIIIl[1]];
        iArr22[lllIIIIIIl[0]] = lllIIIIIIl[42];
        if (lIllllIlIIIlI(Equipment.contains(iArr22) ? 1 : 0)) {
            int[] iArr23 = new int[lllIIIIIIl[1]];
            iArr23[lllIIIIIIl[0]] = lllIIIIIIl[42];
        }
        int[] iArr24 = new int[lllIIIIIIl[1]];
        iArr24[lllIIIIIIl[0]] = lllIIIIIIl[47];
        if (lIllllIlIIIlI(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lllIIIIIIl[1]];
            iArr25[lllIIIIIIl[0]] = lllIIIIIIl[47];
        }
        int[] iArr26 = new int[lllIIIIIIl[1]];
        iArr26[lllIIIIIIl[0]] = lllIIIIIIl[49];
        if (lIllllIlIIIlI(Equipment.contains(iArr26) ? 1 : 0)) {
            int[] iArr27 = new int[lllIIIIIIl[1]];
            iArr27[lllIIIIIIl[0]] = lllIIIIIIl[49];
        }
        int[] iArr28 = new int[lllIIIIIIl[1]];
        iArr28[lllIIIIIIl[0]] = lllIIIIIIl[51];
        if (lIllllIlIIIlI(Equipment.contains(iArr28) ? 1 : 0)) {
            int[] iArr29 = new int[lllIIIIIIl[1]];
            iArr29[lllIIIIIIl[0]] = lllIIIIIIl[51];
        }
        int[] iArr30 = new int[lllIIIIIIl[1]];
        iArr30[lllIIIIIIl[0]] = lllIIIIIIl[12];
        if (lIllllIlIIIII(Inventory.contains(iArr30) ? 1 : 0)) {
            ?? r02 = lllIIIIIIl[1];
            "".length();
            return ((((10 + 71) - (-55)) + 12) ^ (((105 + 5) - 39) + 73)) <= " ".length() ? ((126 ^ 4) ^ (97 ^ 90)) & (((((70 + 107) - 173) + 131) ^ (((158 + 22) - 48) + 66)) ^ (-" ".length())) : r02;
        }
        return lllIIIIIIl[0];
    }

    public static void Q() {
        int[] iArr = new int[lllIIIIIIl[1]];
        iArr[lllIIIIIIl[0]] = lllIIIIIIl[10];
        if (lIllllIlIIIlI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIIl[10], lllIIIIIIl[39], lllIIIIIIl[53]));
            "".length();
        }
        int[] iArr2 = new int[lllIIIIIIl[1]];
        iArr2[lllIIIIIIl[0]] = lllIIIIIIl[54];
        if (lIllllIlIIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIIl[54], lllIIIIIIl[11], lllIIIIIIl[53]));
            "".length();
        }
        int[] iArr3 = new int[lllIIIIIIl[1]];
        iArr3[lllIIIIIIl[0]] = lllIIIIIIl[51];
        if (lIllllIlIIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIIl[51], lllIIIIIIl[1], lllIIIIIIl[55]));
            "".length();
        }
        int[] iArr4 = new int[lllIIIIIIl[1]];
        iArr4[lllIIIIIIl[0]] = lllIIIIIIl[49];
        if (lIllllIlIIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIIl[49], lllIIIIIIl[1], lllIIIIIIl[56]));
            "".length();
        }
        int[] iArr5 = new int[lllIIIIIIl[1]];
        iArr5[lllIIIIIIl[0]] = lllIIIIIIl[12];
        if (lIllllIlIIIlI(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIIl[12], lllIIIIIIl[13], lllIIIIIIl[57]));
            "".length();
        }
        int[] iArr6 = new int[lllIIIIIIl[1]];
        iArr6[lllIIIIIIl[0]] = lllIIIIIIl[42];
        if (lIllllIlIIIlI(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIIl[42], lllIIIIIIl[1], lllIIIIIIl[58]));
            "".length();
        }
        int[] iArr7 = new int[lllIIIIIIl[1]];
        iArr7[lllIIIIIIl[0]] = lllIIIIIIl[45];
        if (lIllllIlIIIlI(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIIl[45], lllIIIIIIl[1], lllIIIIIIl[58]));
            "".length();
        }
        int[] iArr8 = new int[lllIIIIIIl[1]];
        iArr8[lllIIIIIIl[0]] = lllIIIIIIl[47];
        if (lIllllIlIIIlI(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIIl[47], lllIIIIIIl[1], lllIIIIIIl[58]));
            "".length();
        }
        int[] iArr9 = new int[lllIIIIIIl[1]];
        iArr9[lllIIIIIIl[0]] = lllIIIIIIl[44];
        if (lIllllIlIIIlI(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIIl[44], lllIIIIIIl[1], lllIIIIIIl[58]));
            "".length();
        }
        if (lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[39])) {
            int[] iArr10 = new int[lllIIIIIIl[1]];
            iArr10[lllIIIIIIl[0]] = lllIIIIIIl[18];
            if (lIllllIlIIIlI(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0017d(lllIIIIIIl[18], lllIIIIIIl[1], lllIIIIIIl[56]));
                "".length();
            }
        }
        int[] iArr11 = new int[lllIIIIIIl[1]];
        iArr11[lllIIIIIIl[0]] = lllIIIIIIl[17];
        if (lIllllIlIIIlI(Bank.contains(iArr11) ? 1 : 0)) {
            bv.add(new C0017d(lllIIIIIIl[17], lllIIIIIIl[1], lllIIIIIIl[58]));
            "".length();
        }
    }

    private static String lIllllIIIlllI(String lllllllllllllllllIlllllIllllIlll, String lllllllllllllllllIlllllIllllIllI) {
        try {
            SecretKeySpec lllllllllllllllllIlllllIlllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIlllllIllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIlllllIlllllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllIlllllIlllllIIl.init(lllIIIIIIl[4], lllllllllllllllllIlllllIlllllIlI);
            return new String(lllllllllllllllllIlllllIlllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIlllllIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIlllllIlllllIII) {
            lllllllllllllllllIlllllIlllllIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlIIIII(int i) {
        return i != 0;
    }

    private static boolean lIllllIlIlIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllllIlIlIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIllllIlIIllI(int i) {
        return i < 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0275, code lost:
        if (lIllllIlIIIII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v124, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aJ() {
        if (lIllllIlIIIII(bt ? 1 : 0)) {
            AccBuilderSotf.c = lllIIIIIII[lllIIIIIIl[0]];
            C0015b.a(bv);
            if (lIllllIlIIIIl(bv.size(), lllIIIIIIl[1])) {
                System.out.println(lllIIIIIII[lllIIIIIIl[1]]);
                bt = lllIIIIIIl[0];
            }
        }
        if (lIllllIlIIIlI(bt ? 1 : 0)) {
            if (lIllllIlIIIlI(aM() ? 1 : 0) && (!lIllllIlIIIll(Skills.getLevel(Skill.DEFENCE), lllIIIIIIl[2]) || !lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[3]) || lIllllIlIIIIl(Skills.getLevel(Skill.STRENGTH), lllIIIIIIl[3]))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllllIlIIlII(nearest) && lIllllIlIIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIIIIII[lllIIIIIIl[4]];
                    C0000a.a(nearest);
                }
                if (lIllllIlIIlII(nearest) && lIllllIlIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = lllIIIIIII[lllIIIIIIl[5]];
                    if (lIllllIlIIIlI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIIIIIl[6]);
                        "".length();
                    }
                    if (lIllllIlIIIII(Bank.isOpen() ? 1 : 0)) {
                        if (lIllllIlIIlIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIIIIIl[1]);
                            "".length();
                        }
                        if (lIllllIlIIlIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIIIIIIl[4]);
                            "".length();
                        }
                        if (lIllllIlIIIlI(aN() ? 1 : 0)) {
                            Q();
                            System.out.println(lllIIIIIII[lllIIIIIIl[7]]);
                            bt = lllIIIIIIl[1];
                            return;
                        }
                        C0000a.a(cK, lllIIIIIIl[1]);
                        C0000a.a(lllIIIIIIl[8], lllIIIIIIl[9]);
                        C0000a.b(C0019f.ba, lllIIIIIIl[1]);
                        C0000a.a(lllIIIIIIl[10], lllIIIIIIl[11]);
                        C0000a.a(lllIIIIIIl[12], lllIIIIIIl[13]);
                    }
                }
            }
            if (lIllllIlIIIII(aM() ? 1 : 0)) {
                aL();
                if (lIllllIlIIIll(Movement.getRunEnergy(), lllIIIIIIl[14]) && lIllllIlIIIlI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                String[] strArr = new String[lllIIIIIIl[1]];
                strArr[lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[11]];
                if (lIllllIlIIIlI(Equipment.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIIIIIIl[1]];
                    strArr2[lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[15]];
                    if (lIllllIlIIIlI(Equipment.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[lllIIIIIIl[1]];
                        strArr3[lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[16]];
                        if (lIllllIlIIIlI(Equipment.contains(strArr3) ? 1 : 0)) {
                            int[] iArr = new int[lllIIIIIIl[1]];
                            iArr[lllIIIIIIl[0]] = lllIIIIIIl[17];
                            if (lIllllIlIIIlI(Equipment.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lllIIIIIIl[1]];
                                iArr2[lllIIIIIIl[0]] = lllIIIIIIl[18];
                            }
                        }
                    }
                }
                aO();
                if (lIllllIlIIllI(lIllllIIlllll(C0018e.w(), 45.0d))) {
                    int[] iArr3 = new int[lllIIIIIIl[1]];
                    iArr3[lllIIIIIIl[0]] = lllIIIIIIl[12];
                    if (lIllllIlIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllIIIIIIl[1]];
                        iArr4[lllIIIIIIl[0]] = lllIIIIIIl[12];
                        Inventory.getFirst(iArr4).interact(lllIIIIIII[lllIIIIIIl[19]]);
                        Time.sleepTicks(lllIIIIIIl[1]);
                        "".length();
                    }
                }
                if (lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[20]) && lIllllIlIIIll(Skills.getLevel(Skill.STRENGTH), lllIIIIIIl[20])) {
                    C0029p.al();
                }
            }
        }
    }

    private static String lIllllIIIllll(String lllllllllllllllllIlllllIlllIIlll, String lllllllllllllllllIlllllIlllIIllI) {
        String lllllllllllllllllIlllllIlllIIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllllIlllllIlllIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIlllllIlllIIlIl = new StringBuilder();
        char[] lllllllllllllllllIlllllIlllIIlII = lllllllllllllllllIlllllIlllIIllI.toCharArray();
        int lllllllllllllllllIlllllIlllIIIll = lllIIIIIIl[0];
        char[] charArray = lllllllllllllllllIlllllIlllIIlll2.toCharArray();
        int lllllllllllllllllIlllllIllIlllII = charArray.length;
        int i = lllIIIIIIl[0];
        while (lIllllIlIIIIl(i, lllllllllllllllllIlllllIllIlllII)) {
            char lllllllllllllllllIlllllIlllIlIII = charArray[i];
            lllllllllllllllllIlllllIlllIIlIl.append((char) (lllllllllllllllllIlllllIlllIlIII ^ lllllllllllllllllIlllllIlllIIlII[lllllllllllllllllIlllllIlllIIIll % lllllllllllllllllIlllllIlllIIlII.length]));
            "".length();
            lllllllllllllllllIlllllIlllIIIll++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIlllllIlllIIlIl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return lllIIIIIIl[0];
    }

    public static void aO() {
        if (lIllllIlIIIIl(Skills.getLevel(Skill.STRENGTH), lllIIIIIIl[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIllllIlIIIll(Skills.getLevel(Skill.STRENGTH), lllIIIIIIl[22]) && lIllllIlIIIIl(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIllllIlIIIll(Skills.getLevel(Skill.STRENGTH), lllIIIIIIl[22]) && lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[22]) && lIllllIlIIIIl(Skills.getLevel(Skill.DEFENCE), lllIIIIIIl[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIllllIlIIIIl(Skills.getLevel(Skill.STRENGTH), lllIIIIIIl[20]) && lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[22]) && lIllllIlIIIll(Skills.getLevel(Skill.DEFENCE), lllIIIIIIl[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIllllIlIIIll(Skills.getLevel(Skill.STRENGTH), lllIIIIIIl[20]) && lIllllIlIIIIl(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[20]) && lIllllIlIIIll(Skills.getLevel(Skill.DEFENCE), lllIIIIIIl[22])) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIllllIlIIIll(Skills.getLevel(Skill.STRENGTH), lllIIIIIIl[20]) && lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[20]) && lIllllIlIIIIl(Skills.getLevel(Skill.DEFENCE), lllIIIIIIl[20])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIllllIlIIIIl(Skills.getLevel(Skill.STRENGTH), lllIIIIIIl[2]) && lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[20]) && lIllllIlIIIll(Skills.getLevel(Skill.DEFENCE), lllIIIIIIl[20])) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
        if (lIllllIlIIIll(Skills.getLevel(Skill.STRENGTH), lllIIIIIIl[2]) && lIllllIlIIIIl(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[2]) && lIllllIlIIIll(Skills.getLevel(Skill.DEFENCE), lllIIIIIIl[20])) {
            Combat.setAttackStyle(Combat.AttackStyle.FIRST);
        }
        if (lIllllIlIIIll(Skills.getLevel(Skill.STRENGTH), lllIIIIIIl[2]) && lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[2]) && lIllllIlIIIIl(Skills.getLevel(Skill.DEFENCE), lllIIIIIIl[2])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
        if (lIllllIlIIIIl(Skills.getLevel(Skill.STRENGTH), lllIIIIIIl[39]) && lIllllIlIIIll(Skills.getLevel(Skill.ATTACK), lllIIIIIIl[2]) && lIllllIlIIIll(Skills.getLevel(Skill.DEFENCE), lllIIIIIIl[2]) && lIllllIlIlIIl(Combat.getAttackStyle(), Combat.AttackStyle.SECOND)) {
            Combat.setAttackStyle(Combat.AttackStyle.SECOND);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllllIlIIIll(Skills.getLevel(Skill.STRENGTH), lllIIIIIIl[39])) {
            ?? r0 = lllIIIIIIl[1];
            "".length();
            return ((((57 + 29) - 17) + 65) ^ (((16 + 13) - (-72)) + 29)) <= (((((14 + 111) - 110) + 118) ^ (((139 + 123) - 194) + 83)) & (((123 ^ 112) ^ (104 ^ 113)) ^ (-" ".length()))) ? ((83 ^ 47) ^ (122 ^ 25)) & (("  ".length() ^ (121 ^ 100)) ^ (-" ".length())) : r0;
        }
        return lllIIIIIIl[0];
    }

    private static boolean lIllllIlIIIll(int i, int i2) {
        return i >= i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            aJ();
            "".length();
            if (((167 ^ 134) ^ (90 ^ 127)) <= 0) {
                return ((122 ^ 34) ^ (114 ^ 100)) & (((109 ^ 56) ^ (128 ^ 155)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lllIIIIIIl[0];
    }

    private static boolean lIllllIlIIIlI(int i) {
        return i == 0;
    }

    private static void lIllllIIllllI() {
        lllIIIIIIl = new int[74];
        lllIIIIIIl[0] = ((((99 + 207) - 189) + 105) ^ (((84 + 1) - (-20)) + 52)) & (((((61 + 41) - 80) + 230) ^ (((48 + 140) - 92) + 95)) ^ (-" ".length()));
        lllIIIIIIl[1] = " ".length();
        lllIIIIIIl[2] = 178 ^ 172;
        lllIIIIIIl[3] = (246 ^ 184) ^ (67 ^ 63);
        lllIIIIIIl[4] = "  ".length();
        lllIIIIIIl[5] = "   ".length();
        lllIIIIIIl[6] = (-11332) & 16331;
        lllIIIIIIl[7] = (122 ^ 105) ^ (40 ^ 63);
        lllIIIIIIl[8] = (-15361) & 16355;
        lllIIIIIIl[9] = (-1047) & 2046;
        lllIIIIIIl[10] = (-((-2211) & 10419)) & (-16553) & 32767;
        lllIIIIIIl[11] = (((136 + 12) - 142) + 146) ^ (((26 + 85) - 72) + 118);
        lllIIIIIIl[12] = (-((-27241) & 31341)) & (-641) & 5119;
        lllIIIIIIl[13] = (((56 + 131) - 80) + 95) ^ (((101 + 20) - 116) + 169);
        lllIIIIIIl[14] = (144 ^ 141) ^ (4 ^ 22);
        lllIIIIIIl[15] = (((18 + 87) - 38) + 80) ^ (((113 + 97) - 143) + 82);
        lllIIIIIIl[16] = 153 ^ 158;
        lllIIIIIIl[17] = (-30721) & 32051;
        lllIIIIIIl[18] = (-((-301) & 31661)) & (-9) & 32701;
        lllIIIIIIl[19] = (212 ^ 194) ^ (6 ^ 24);
        lllIIIIIIl[20] = (((16 + 17) - (-63)) + 71) ^ (((76 + 96) - 82) + 89);
        lllIIIIIIl[21] = 31 ^ 22;
        lllIIIIIIl[22] = 60 ^ 54;
        lllIIIIIIl[23] = 184 ^ 179;
        lllIIIIIIl[24] = 187 ^ 183;
        lllIIIIIIl[25] = (((29 + 146) - 96) + 79) ^ (((7 + 20) - 9) + 129);
        lllIIIIIIl[26] = 15 ^ 1;
        lllIIIIIIl[27] = 114 ^ 98;
        lllIIIIIIl[28] = 80 ^ 65;
        lllIIIIIIl[29] = -" ".length();
        lllIIIIIIl[30] = (-((-281) & 27481)) & (-1409) & 38891486;
        lllIIIIIIl[31] = (66 ^ 63) ^ (203 ^ 164);
        lllIIIIIIl[32] = (18 ^ 78) ^ (34 ^ 109);
        lllIIIIIIl[33] = 91 ^ 78;
        lllIIIIIIl[34] = 41 ^ 63;
        lllIIIIIIl[35] = 139 ^ 156;
        lllIIIIIIl[36] = 87 ^ 79;
        lllIIIIIIl[37] = 133 ^ 156;
        lllIIIIIIl[38] = 96 ^ 122;
        lllIIIIIIl[39] = (((139 + 49) - 87) + 75) ^ (((126 + 148) - 145) + 23);
        lllIIIIIIl[40] = 172 ^ 183;
        lllIIIIIIl[41] = (((41 + 108) - (-14)) + 1) ^ (((124 + 135) - 237) + 162);
        lllIIIIIIl[42] = (-((-25) & 31293)) & (-19) & 32447;
        lllIIIIIIl[43] = (10 ^ 32) ^ (14 ^ 57);
        lllIIIIIIl[44] = (-((-3633) & 32693)) & (-2073) & 32255;
        lllIIIIIIl[45] = (-29511) & 30583;
        lllIIIIIIl[46] = 31 ^ 0;
        lllIIIIIIl[47] = (-4865) & 6063;
        lllIIIIIIl[48] = 36 ^ 4;
        lllIIIIIIl[49] = (-261) & 1964;
        lllIIIIIIl[50] = 187 ^ 154;
        lllIIIIIIl[51] = (-16394) & 27519;
        lllIIIIIIl[52] = (199 ^ 140) ^ (64 ^ 41);
        lllIIIIIIl[53] = (-15393) & 16292;
        lllIIIIIIl[54] = (-8322) & 16329;
        lllIIIIIIl[55] = (-((-10899) & 16279)) & (-24577) & 64956;
        lllIIIIIIl[56] = (-2584) & 27583;
        lllIIIIIIl[57] = (-((-303) & 2863)) & (-20491) & 23550;
        lllIIIIIIl[58] = (-((-169) & 1194)) & (-295) & 16319;
        lllIIIIIIl[59] = 88 ^ 123;
        lllIIIIIIl[60] = (101 ^ 21) ^ (31 ^ 75);
        lllIIIIIIl[61] = (-8803) & 12027;
        lllIIIIIIl[62] = (-((-8399) & 25583)) & (-12289) & 32762;
        lllIIIIIIl[63] = (-((-1953) & 30691)) & (-785) & 32766;
        lllIIIIIIl[64] = (-((-6365) & 23551)) & (-2) & 20467;
        lllIIIIIIl[65] = (-((-161) & 29355)) & (-5) & 32383;
        lllIIIIIIl[66] = (-((-1089) & 30177)) & (-513) & 32767;
        lllIIIIIIl[67] = 131 ^ 179;
        lllIIIIIIl[68] = (-((-9487) & 25983)) & (-4097) & 23805;
        lllIIIIIIl[69] = (-((-3301) & 24567)) & (-1) & 24447;
        lllIIIIIIl[70] = (-17217) & 20470;
        lllIIIIIIl[71] = (-((-1753) & 30713)) & (-513) & 32703;
        lllIIIIIIl[72] = (-((-24833) & 29455)) & (-8465) & 16382;
        lllIIIIIIl[73] = 151 ^ 178;
    }

    static {
        lIllllIIllllI();
        lIllllIIlllIl();
        bv = new ArrayList();
        int[] iArr = new int[lllIIIIIIl[19]];
        iArr[lllIIIIIIl[0]] = lllIIIIIIl[17];
        iArr[lllIIIIIIl[1]] = lllIIIIIIl[18];
        iArr[lllIIIIIIl[4]] = lllIIIIIIl[44];
        iArr[lllIIIIIIl[5]] = lllIIIIIIl[45];
        iArr[lllIIIIIIl[7]] = lllIIIIIIl[42];
        iArr[lllIIIIIIl[11]] = lllIIIIIIl[47];
        iArr[lllIIIIIIl[15]] = lllIIIIIIl[49];
        iArr[lllIIIIIIl[16]] = lllIIIIIIl[51];
        cK = iArr;
        cL = new WorldArea(lllIIIIIIl[61], lllIIIIIIl[62], lllIIIIIIl[23], lllIIIIIIl[23], lllIIIIIIl[0]);
        cM = new WorldArea(lllIIIIIIl[63], lllIIIIIIl[64], lllIIIIIIl[33], lllIIIIIIl[27], lllIIIIIIl[0]);
        cN = new WorldArea(lllIIIIIIl[65], lllIIIIIIl[66], lllIIIIIIl[67], lllIIIIIIl[2], lllIIIIIIl[0]);
        cO = new WorldPoint(lllIIIIIIl[68], lllIIIIIIl[69], lllIIIIIIl[0]);
        ck = new WorldPoint(lllIIIIIIl[70], lllIIIIIIl[62], lllIIIIIIl[0]);
        cP = new WorldPoint(lllIIIIIIl[71], lllIIIIIIl[72], lllIIIIIIl[0]);
    }

    public static void am() {
        if (lIllllIlIIIlI(cM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIIIIII[lllIIIIIIl[21]];
            Movement.walkTo(ck);
            "".length();
            Time.sleepTicks(lllIIIIIIl[1]);
            "".length();
        }
        if (lIllllIlIIIII(cM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderSotf.c = lllIIIIIII[lllIIIIIIl[22]];
            if (lIllllIlIIlll(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (lIllllIlIIIII(npc.getName().contains(lllIIIIIII[lllIIIIIIl[60]]) ? 1 : 0) && lIllllIlIIlll(npc.getInteracting()) && lIllllIlIIIlI(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lllIIIIIIl[1];
                        "".length();
                        return (128 ^ 132) < (44 ^ 40) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllIIIIIIl[0];
                });
                String[] strArr = new String[lllIIIIIIl[4]];
                strArr[lllIIIIIIl[0]] = lllIIIIIII[lllIIIIIIl[23]];
                strArr[lllIIIIIIl[1]] = lllIIIIIII[lllIIIIIIl[24]];
                List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                    if (lIllllIlIlIlI(npc2.getInteracting(), Players.getLocal())) {
                        ?? r0 = lllIIIIIIl[1];
                        "".length();
                        return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllIIIIIIl[0];
                }).collect(Collectors.toList());
                if (lIllllIlIIIlI(list.isEmpty() ? 1 : 0)) {
                    ((NPC) list.get(lllIIIIIIl[0])).interact(lllIIIIIII[lllIIIIIIl[25]]);
                    Time.sleepTicks(lllIIIIIIl[4]);
                    "".length();
                }
                if (lIllllIlIIlII(nearest) && lIllllIlIIIlI(Players.getLocal().isMoving() ? 1 : 0) && lIllllIlIIIII(list.isEmpty() ? 1 : 0)) {
                    nearest.interact(lllIIIIIII[lllIIIIIIl[26]]);
                    Time.sleepTicks(lllIIIIIIl[4]);
                    "".length();
                }
            }
            if (lIllllIlIIlII(Players.getLocal().getInteracting())) {
                Time.sleepTicks(lllIIIIIIl[7]);
                "".length();
            }
        }
    }
}
