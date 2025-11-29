package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.K  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/K.class */
public class K implements G {
    public static /* synthetic */ WorldPoint iH;
    public static /* synthetic */ WorldPoint bx;
    public static /* synthetic */ WorldArea iF;
    private static /* synthetic */ int[] lIIlIlIIll;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ WorldArea iE;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ WorldPoint iI;
    private static /* synthetic */ String[] lIIlIIllll;
    public static /* synthetic */ WorldArea iG;
    public static /* synthetic */ int[] iD;

    private static String llllllIIIIIl(String lllllllllllllllllllllllIlllIlIll, String lllllllllllllllllllllllIlllIlIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllllllIlllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllllllIlllIlIIl = new StringBuilder();
        char[] charArray = lllllllllllllllllllllllIlllIlIlI.toCharArray();
        int lllllllllllllllllllllllIlllIIlll = lIIlIlIIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlIlIIll[0];
        while (llllllIIIllI(i, length)) {
            char lllllllllllllllllllllllIlllIllII = charArray2[i];
            lllllllllllllllllllllllIlllIlIIl.append((char) (lllllllllllllllllllllllIlllIllII ^ charArray[lllllllllllllllllllllllIlllIIlll % charArray.length]));
            "".length();
            lllllllllllllllllllllllIlllIIlll++;
            i++;
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllllllIlllIlIIl);
    }

    private static void llllllIIIIlI() {
        lIIlIIllll = new String[lIIlIlIIll[71]];
        lIIlIIllll[lIIlIlIIll[0]] = lllllIllIIII("vfvSijaJiSvEZtA5aUUppg==", "IWowU");
        lIIlIIllll[lIIlIlIIll[1]] = llllllIIIIII("50igqm795r4qARrVwA7tiRNzqSzICGnVCYkf7vGtjcwdAJd41QSNaUys7j3f+twTa18Q73Fm7Dg=", "OxDko");
        lIIlIIllll[lIIlIlIIll[3]] = llllllIIIIIl("JwIkEQ0IFzsWDUkXPVgICA05", "icRxj");
        lIIlIIllll[lIIlIlIIll[4]] = llllllIIIIII("EOu0pN9SDvcQo7+qxe2QYxpodt/y/HAk", "JgPKq");
        lIIlIIllll[lIIlIlIIll[6]] = lllllIllIIII("4YFg1VRd32Nrhbry34GuzRFyA4Fzml3nq+E4DIzXbnpk8f1A4KHUC9aFybGyIrTa", "ItLMz");
        lIIlIIllll[lIIlIlIIll[10]] = llllllIIIIII("LZ1DmpKZRUlE6P5LpbcGAg==", "rDpvR");
        lIIlIIllll[lIIlIlIIll[14]] = llllllIIIIIl("IA4jHyBTCSUTIRoOJwg=", "szFzL");
        lIIlIIllll[lIIlIlIIll[15]] = lllllIllIIII("c+m/TyCcgJ6CCUbk2FA0g1qYZu3kaxAW", "evPeT");
        lIIlIIllll[lIIlIlIIll[18]] = llllllIIIIII("fFYKc03ZNE4=", "BQMkn");
        lIIlIIllll[lIIlIlIIll[20]] = lllllIllIIII("Cj0ZvpkreT4YT+ZhaVw5lbHrAYa0yIEH", "fYfzp");
        lIIlIIllll[lIIlIlIIll[21]] = llllllIIIIII("lvF84G2PdfRFfydIhL03LA==", "aYzRA");
        lIIlIIllll[lIIlIlIIll[22]] = lllllIllIIII("v2NfHzFaEQA=", "LHcDS");
        lIIlIIllll[lIIlIlIIll[23]] = llllllIIIIII("qhyX0AdILQs=", "oLGvc");
        lIIlIIllll[lIIlIlIIll[24]] = llllllIIIIIl("CCYNIxsi", "IRyBx");
        lIIlIIllll[lIIlIlIIll[25]] = llllllIIIIII("zjKJSj3XC0g=", "lPNzE");
        lIIlIIllll[lIIlIlIIll[13]] = lllllIllIIII("C6B1mqq1agTsml/1B41S2w==", "bpfHl");
        lIIlIIllll[lIIlIlIIll[26]] = lllllIllIIII("zG/I0RqSK/o=", "PHMcy");
        lIIlIIllll[lIIlIlIIll[29]] = lllllIllIIII("VaedjHtwxRCd+qhouz3Shw==", "wZcMS");
        lIIlIIllll[lIIlIlIIll[30]] = llllllIIIIII("vDJjZ/x12uUu9tVcJ08ucg==", "jvyuw");
        lIIlIIllll[lIIlIlIIll[31]] = lllllIllIIII("JRfYKdmdp98=", "tQcoX");
        lIIlIIllll[lIIlIlIIll[19]] = llllllIIIIII("e3TYe1ccj1wTPIrzj0rJbQ==", "Ndkag");
        lIIlIIllll[lIIlIlIIll[32]] = llllllIIIIII("56Yfwn4cYtIF6CrlW+H1xQ==", "aqYBR");
        lIIlIIllll[lIIlIlIIll[33]] = llllllIIIIII("ROwHIWYDv8E=", "dJVeA");
        lIIlIIllll[lIIlIlIIll[35]] = lllllIllIIII("H3GPZtuU7JsrK7vBDOCq68RxjeUzy2+Y", "zIiou");
        lIIlIIllll[lIIlIlIIll[36]] = llllllIIIIIl("PQcgOTgZAnQiKRkDPSUrAg==", "pnTQJ");
        lIIlIIllll[lIIlIlIIll[37]] = llllllIIIIIl("BQMyFQo=", "RjWyn");
        lIIlIIllll[lIIlIlIIll[38]] = llllllIIIIIl("Hj4LHio=", "IWnrN");
        lIIlIIllll[lIIlIlIIll[39]] = lllllIllIIII("cuGFJwff+yk=", "lxlhD");
        lIIlIIllll[lIIlIlIIll[41]] = llllllIIIIII("MAqk8MWKRqw=", "AKdgf");
        lIIlIIllll[lIIlIlIIll[43]] = lllllIllIIII("rozOFR12sWE=", "OIuvH");
        lIIlIIllll[lIIlIlIIll[34]] = lllllIllIIII("IxmOmdRkqAw=", "QDvtT");
        lIIlIIllll[lIIlIlIIll[46]] = lllllIllIIII("sd2wiHLBXTk=", "qCQJi");
        lIIlIIllll[lIIlIlIIll[48]] = llllllIIIIII("4h3exYKHvWQ=", "apkiI");
        lIIlIIllll[lIIlIlIIll[50]] = lllllIllIIII("OiQYKtP5k3Y=", "KMrck");
        lIIlIIllll[lIIlIlIIll[57]] = lllllIllIIII("AJj+07ur6BQ=", "CEqVv");
        lIIlIIllll[lIIlIlIIll[58]] = llllllIIIIII("KxsZbpdjbqA=", "dJDWE");
    }

    private static boolean llllllIIllIl(int i, int i2) {
        return i == i2;
    }

    public static void af() {
        int[] iArr = new int[lIIlIlIIll[1]];
        iArr[lIIlIlIIll[0]] = lIIlIlIIll[9];
        if (llllllIIIlll(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIll[9], lIIlIlIIll[2], lIIlIlIIll[51]));
            "".length();
        }
        int[] iArr2 = new int[lIIlIlIIll[1]];
        iArr2[lIIlIlIIll[0]] = lIIlIlIIll[52];
        if (llllllIIIlll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIll[52], lIIlIlIIll[10], lIIlIlIIll[51]));
            "".length();
        }
        int[] iArr3 = new int[lIIlIlIIll[1]];
        iArr3[lIIlIlIIll[0]] = lIIlIlIIll[49];
        if (llllllIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIll[49], lIIlIlIIll[1], lIIlIlIIll[53]));
            "".length();
        }
        int[] iArr4 = new int[lIIlIlIIll[1]];
        iArr4[lIIlIlIIll[0]] = lIIlIlIIll[47];
        if (llllllIIIlll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIll[47], lIIlIlIIll[1], lIIlIlIIll[54]));
            "".length();
        }
        int[] iArr5 = new int[lIIlIlIIll[1]];
        iArr5[lIIlIlIIll[0]] = lIIlIlIIll[11];
        if (llllllIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIll[11], lIIlIlIIll[12], lIIlIlIIll[55]));
            "".length();
        }
        int[] iArr6 = new int[lIIlIlIIll[1]];
        iArr6[lIIlIlIIll[0]] = lIIlIlIIll[40];
        if (llllllIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIll[40], lIIlIlIIll[1], lIIlIlIIll[56]));
            "".length();
        }
        int[] iArr7 = new int[lIIlIlIIll[1]];
        iArr7[lIIlIlIIll[0]] = lIIlIlIIll[44];
        if (llllllIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIll[44], lIIlIlIIll[1], lIIlIlIIll[56]));
            "".length();
        }
        int[] iArr8 = new int[lIIlIlIIll[1]];
        iArr8[lIIlIlIIll[0]] = lIIlIlIIll[45];
        if (llllllIIIlll(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIll[45], lIIlIlIIll[1], lIIlIlIIll[56]));
            "".length();
        }
        int[] iArr9 = new int[lIIlIlIIll[1]];
        iArr9[lIIlIlIIll[0]] = lIIlIlIIll[42];
        if (llllllIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIll[42], lIIlIlIIll[1], lIIlIlIIll[56]));
            "".length();
        }
        if (llllllIIlIlI(Skills.getLevel(Skill.ATTACK), lIIlIlIIll[2])) {
            int[] iArr10 = new int[lIIlIlIIll[1]];
            iArr10[lIIlIlIIll[0]] = lIIlIlIIll[17];
            if (llllllIIIlll(Bank.contains(iArr10) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIlIIll[17], lIIlIlIIll[1], lIIlIlIIll[54]));
                "".length();
            }
        }
        int[] iArr11 = new int[lIIlIlIIll[1]];
        iArr11[lIIlIlIIll[0]] = lIIlIlIIll[16];
        if (llllllIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIlIIll[16], lIIlIlIIll[1], lIIlIlIIll[56]));
            "".length();
        }
    }

    public static void cx() {
        if (llllllIIllIl(Static.getClient().getVar(lIIlIlIIll[22]), lIIlIlIIll[1])) {
            Static.getClient().invokeMenuAction(lIIlIIllll[lIIlIlIIll[13]], lIIlIIllll[lIIlIlIIll[26]], lIIlIlIIll[1], MenuAction.CC_OP.getId(), lIIlIlIIll[27], lIIlIlIIll[28]);
        }
        if (llllllIIIllI(Skills.getLevel(Skill.ATTACK), lIIlIlIIll[10])) {
            String[] strArr = new String[lIIlIlIIll[1]];
            strArr[lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[29]];
            if (llllllIIIlIl(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lIIlIlIIll[1]];
                strArr2[lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[30]];
                Inventory.getFirst(strArr2).interact(lIIlIIllll[lIIlIlIIll[31]]);
            }
        }
        if (llllllIIlIlI(Skills.getLevel(Skill.ATTACK), lIIlIlIIll[10]) && llllllIIIllI(Skills.getLevel(Skill.ATTACK), lIIlIlIIll[19])) {
            String[] strArr3 = new String[lIIlIlIIll[1]];
            strArr3[lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[19]];
            if (llllllIIIlIl(Inventory.contains(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[lIIlIlIIll[1]];
                strArr4[lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[32]];
                Inventory.getFirst(strArr4).interact(lIIlIIllll[lIIlIlIIll[33]]);
            }
        }
        if (llllllIIlIlI(Skills.getLevel(Skill.ATTACK), lIIlIlIIll[19]) && llllllIIIllI(Skills.getLevel(Skill.ATTACK), lIIlIlIIll[34])) {
            String[] strArr5 = new String[lIIlIlIIll[1]];
            strArr5[lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[35]];
            if (llllllIIIlIl(Inventory.contains(strArr5) ? 1 : 0)) {
                String[] strArr6 = new String[lIIlIlIIll[1]];
                strArr6[lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[36]];
                Inventory.getFirst(strArr6).interact(lIIlIIllll[lIIlIlIIll[37]]);
            }
        }
        if (llllllIIlIlI(Skills.getLevel(Skill.ATTACK), lIIlIlIIll[34]) && llllllIIIllI(Skills.getLevel(Skill.ATTACK), lIIlIlIIll[2])) {
            int[] iArr = new int[lIIlIlIIll[1]];
            iArr[lIIlIlIIll[0]] = lIIlIlIIll[16];
            if (llllllIIIlIl(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIlIIll[1]];
                iArr2[lIIlIlIIll[0]] = lIIlIlIIll[16];
                Inventory.getFirst(iArr2).interact(lIIlIIllll[lIIlIlIIll[38]]);
            }
        }
        if (llllllIIlIlI(Skills.getLevel(Skill.ATTACK), lIIlIlIIll[2])) {
            int[] iArr3 = new int[lIIlIlIIll[1]];
            iArr3[lIIlIlIIll[0]] = lIIlIlIIll[17];
            if (llllllIIIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIIlIlIIll[1]];
                iArr4[lIIlIlIIll[0]] = lIIlIlIIll[17];
                Inventory.getFirst(iArr4).interact(lIIlIIllll[lIIlIlIIll[39]]);
            }
        }
        if (llllllIIlIlI(Skills.getLevel(Skill.DEFENCE), lIIlIlIIll[34])) {
            int[] iArr5 = new int[lIIlIlIIll[1]];
            iArr5[lIIlIlIIll[0]] = lIIlIlIIll[40];
            if (llllllIIIlIl(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIlIlIIll[1]];
                iArr6[lIIlIlIIll[0]] = lIIlIlIIll[40];
                Inventory.getFirst(iArr6).interact(lIIlIIllll[lIIlIlIIll[41]]);
            }
            int[] iArr7 = new int[lIIlIlIIll[1]];
            iArr7[lIIlIlIIll[0]] = lIIlIlIIll[42];
            if (llllllIIIlIl(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIlIlIIll[1]];
                iArr8[lIIlIlIIll[0]] = lIIlIlIIll[42];
                Inventory.getFirst(iArr8).interact(lIIlIIllll[lIIlIlIIll[43]]);
            }
            int[] iArr9 = new int[lIIlIlIIll[1]];
            iArr9[lIIlIlIIll[0]] = lIIlIlIIll[44];
            if (llllllIIIlIl(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIIlIlIIll[1]];
                iArr10[lIIlIlIIll[0]] = lIIlIlIIll[44];
                Inventory.getFirst(iArr10).interact(lIIlIIllll[lIIlIlIIll[34]]);
            }
            int[] iArr11 = new int[lIIlIlIIll[1]];
            iArr11[lIIlIlIIll[0]] = lIIlIlIIll[45];
            if (llllllIIIlIl(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIlIlIIll[1]];
                iArr12[lIIlIlIIll[0]] = lIIlIlIIll[45];
                Inventory.getFirst(iArr12).interact(lIIlIIllll[lIIlIlIIll[46]]);
            }
        }
        int[] iArr13 = new int[lIIlIlIIll[1]];
        iArr13[lIIlIlIIll[0]] = lIIlIlIIll[47];
        if (llllllIIIlIl(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIIlIlIIll[1]];
            iArr14[lIIlIlIIll[0]] = lIIlIlIIll[47];
            Inventory.getFirst(iArr14).interact(lIIlIIllll[lIIlIlIIll[48]]);
        }
        int[] iArr15 = new int[lIIlIlIIll[1]];
        iArr15[lIIlIlIIll[0]] = lIIlIlIIll[49];
        if (llllllIIIlIl(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lIIlIlIIll[1]];
            iArr16[lIIlIlIIll[0]] = lIIlIlIIll[49];
            Inventory.getFirst(iArr16).interact(lIIlIIllll[lIIlIlIIll[50]]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x058a, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x05cc, code lost:
        return f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.K.lIIlIlIIll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0113, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c1, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0218, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x026f, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02a9, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02f1, code lost:
        return f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.K.lIIlIlIIll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0346, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x039d, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03f4, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x044b, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x04a2, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04f9, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0550, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v163, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v230, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean cy() {
        if (llllllIIlIlI(Skills.getLevel(Skill.ATTACK), lIIlIlIIll[2])) {
            int[] iArr = new int[lIIlIlIIll[1]];
            iArr[lIIlIlIIll[0]] = lIIlIlIIll[17];
            if (llllllIIIlll(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIlIIll[1]];
                iArr2[lIIlIlIIll[0]] = lIIlIlIIll[17];
                if (llllllIIIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lIIlIlIIll[1]];
                    iArr3[lIIlIlIIll[0]] = lIIlIlIIll[17];
                }
            }
            int[] iArr4 = new int[lIIlIlIIll[1]];
            iArr4[lIIlIlIIll[0]] = lIIlIlIIll[42];
            if (llllllIIIlll(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lIIlIlIIll[1]];
                iArr5[lIIlIlIIll[0]] = lIIlIlIIll[42];
                if (llllllIIIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIIlIlIIll[1]];
                    iArr6[lIIlIlIIll[0]] = lIIlIlIIll[42];
                }
            }
            int[] iArr7 = new int[lIIlIlIIll[1]];
            iArr7[lIIlIlIIll[0]] = lIIlIlIIll[44];
            if (llllllIIIlll(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIlIlIIll[1]];
                iArr8[lIIlIlIIll[0]] = lIIlIlIIll[44];
                if (llllllIIIlll(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lIIlIlIIll[1]];
                    iArr9[lIIlIlIIll[0]] = lIIlIlIIll[44];
                }
            }
            int[] iArr10 = new int[lIIlIlIIll[1]];
            iArr10[lIIlIlIIll[0]] = lIIlIlIIll[40];
            if (llllllIIIlll(Equipment.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lIIlIlIIll[1]];
                iArr11[lIIlIlIIll[0]] = lIIlIlIIll[40];
                if (llllllIIIlll(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lIIlIlIIll[1]];
                    iArr12[lIIlIlIIll[0]] = lIIlIlIIll[40];
                }
            }
            int[] iArr13 = new int[lIIlIlIIll[1]];
            iArr13[lIIlIlIIll[0]] = lIIlIlIIll[45];
            if (llllllIIIlll(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lIIlIlIIll[1]];
                iArr14[lIIlIlIIll[0]] = lIIlIlIIll[45];
                if (llllllIIIlll(Inventory.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIlIlIIll[1]];
                    iArr15[lIIlIlIIll[0]] = lIIlIlIIll[45];
                }
            }
            int[] iArr16 = new int[lIIlIlIIll[1]];
            iArr16[lIIlIlIIll[0]] = lIIlIlIIll[47];
            if (llllllIIIlll(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lIIlIlIIll[1]];
                iArr17[lIIlIlIIll[0]] = lIIlIlIIll[47];
                if (llllllIIIlll(Equipment.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lIIlIlIIll[1]];
                    iArr18[lIIlIlIIll[0]] = lIIlIlIIll[47];
                }
            }
            int[] iArr19 = new int[lIIlIlIIll[1]];
            iArr19[lIIlIlIIll[0]] = lIIlIlIIll[49];
            if (llllllIIIlll(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lIIlIlIIll[1]];
                iArr20[lIIlIlIIll[0]] = lIIlIlIIll[49];
                if (llllllIIIlll(Equipment.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lIIlIlIIll[1]];
                    iArr21[lIIlIlIIll[0]] = lIIlIlIIll[49];
                }
            }
            int[] iArr22 = new int[lIIlIlIIll[1]];
            iArr22[lIIlIlIIll[0]] = lIIlIlIIll[11];
            if (llllllIIIlll(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lIIlIlIIll[1]];
                iArr23[lIIlIlIIll[0]] = lIIlIlIIll[11];
            }
            ?? r0 = lIIlIlIIll[1];
            "".length();
            return (-" ".length()) >= " ".length() ? ((146 ^ 187) ^ (196 ^ 163)) & (((((17 + 5) - (-44)) + 61) ^ (49 ^ 0)) ^ (-" ".length())) : r0;
        }
        int[] iArr24 = new int[lIIlIlIIll[1]];
        iArr24[lIIlIlIIll[0]] = lIIlIlIIll[16];
        if (llllllIIIlll(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lIIlIlIIll[1]];
            iArr25[lIIlIlIIll[0]] = lIIlIlIIll[16];
            if (llllllIIIlll(Inventory.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[lIIlIlIIll[1]];
                iArr26[lIIlIlIIll[0]] = lIIlIlIIll[16];
            }
        }
        int[] iArr27 = new int[lIIlIlIIll[1]];
        iArr27[lIIlIlIIll[0]] = lIIlIlIIll[42];
        if (llllllIIIlll(Equipment.contains(iArr27) ? 1 : 0)) {
            int[] iArr28 = new int[lIIlIlIIll[1]];
            iArr28[lIIlIlIIll[0]] = lIIlIlIIll[42];
            if (llllllIIIlll(Inventory.contains(iArr28) ? 1 : 0)) {
                int[] iArr29 = new int[lIIlIlIIll[1]];
                iArr29[lIIlIlIIll[0]] = lIIlIlIIll[42];
            }
        }
        int[] iArr30 = new int[lIIlIlIIll[1]];
        iArr30[lIIlIlIIll[0]] = lIIlIlIIll[44];
        if (llllllIIIlll(Equipment.contains(iArr30) ? 1 : 0)) {
            int[] iArr31 = new int[lIIlIlIIll[1]];
            iArr31[lIIlIlIIll[0]] = lIIlIlIIll[44];
            if (llllllIIIlll(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[lIIlIlIIll[1]];
                iArr32[lIIlIlIIll[0]] = lIIlIlIIll[44];
            }
        }
        int[] iArr33 = new int[lIIlIlIIll[1]];
        iArr33[lIIlIlIIll[0]] = lIIlIlIIll[40];
        if (llllllIIIlll(Equipment.contains(iArr33) ? 1 : 0)) {
            int[] iArr34 = new int[lIIlIlIIll[1]];
            iArr34[lIIlIlIIll[0]] = lIIlIlIIll[40];
            if (llllllIIIlll(Inventory.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[lIIlIlIIll[1]];
                iArr35[lIIlIlIIll[0]] = lIIlIlIIll[40];
            }
        }
        int[] iArr36 = new int[lIIlIlIIll[1]];
        iArr36[lIIlIlIIll[0]] = lIIlIlIIll[45];
        if (llllllIIIlll(Equipment.contains(iArr36) ? 1 : 0)) {
            int[] iArr37 = new int[lIIlIlIIll[1]];
            iArr37[lIIlIlIIll[0]] = lIIlIlIIll[45];
            if (llllllIIIlll(Inventory.contains(iArr37) ? 1 : 0)) {
                int[] iArr38 = new int[lIIlIlIIll[1]];
                iArr38[lIIlIlIIll[0]] = lIIlIlIIll[45];
            }
        }
        int[] iArr39 = new int[lIIlIlIIll[1]];
        iArr39[lIIlIlIIll[0]] = lIIlIlIIll[47];
        if (llllllIIIlll(Inventory.contains(iArr39) ? 1 : 0)) {
            int[] iArr40 = new int[lIIlIlIIll[1]];
            iArr40[lIIlIlIIll[0]] = lIIlIlIIll[47];
            if (llllllIIIlll(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[lIIlIlIIll[1]];
                iArr41[lIIlIlIIll[0]] = lIIlIlIIll[47];
            }
        }
        int[] iArr42 = new int[lIIlIlIIll[1]];
        iArr42[lIIlIlIIll[0]] = lIIlIlIIll[49];
        if (llllllIIIlll(Inventory.contains(iArr42) ? 1 : 0)) {
            int[] iArr43 = new int[lIIlIlIIll[1]];
            iArr43[lIIlIlIIll[0]] = lIIlIlIIll[49];
            if (llllllIIIlll(Equipment.contains(iArr43) ? 1 : 0)) {
                int[] iArr44 = new int[lIIlIlIIll[1]];
                iArr44[lIIlIlIIll[0]] = lIIlIlIIll[49];
            }
        }
        int[] iArr45 = new int[lIIlIlIIll[1]];
        iArr45[lIIlIlIIll[0]] = lIIlIlIIll[11];
        if (llllllIIIlll(Inventory.contains(iArr45) ? 1 : 0)) {
            int[] iArr46 = new int[lIIlIlIIll[1]];
            iArr46[lIIlIlIIll[0]] = lIIlIlIIll[11];
        }
        ?? r02 = lIIlIlIIll[1];
        "".length();
        return " ".length() <= (-" ".length()) ? ((241 ^ 197) ^ (39 ^ 58)) & (((83 ^ 16) ^ (49 ^ 91)) ^ (-" ".length())) : r02;
    }

    private static boolean llllllIIllII(Object obj) {
        return obj == null;
    }

    private static String lllllIllIIII(String lllllllllllllllllllllllIllIlIllI, String lllllllllllllllllllllllIllIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllIllIlIlIl.getBytes(StandardCharsets.UTF_8)), lIIlIlIIll[18]), "DES");
            Cipher lllllllllllllllllllllllIllIllIII = Cipher.getInstance("DES");
            lllllllllllllllllllllllIllIllIII.init(lIIlIlIIll[3], secretKeySpec);
            return new String(lllllllllllllllllllllllIllIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllllIllIlIlll) {
            lllllllllllllllllllllllIllIlIlll.printStackTrace();
            return null;
        }
    }

    static {
        llllllIIIIll();
        llllllIIIIlI();
        bv = new ArrayList();
        int[] iArr = new int[lIIlIlIIll[18]];
        iArr[lIIlIlIIll[0]] = lIIlIlIIll[16];
        iArr[lIIlIlIIll[1]] = lIIlIlIIll[17];
        iArr[lIIlIlIIll[3]] = lIIlIlIIll[42];
        iArr[lIIlIlIIll[4]] = lIIlIlIIll[44];
        iArr[lIIlIlIIll[6]] = lIIlIlIIll[40];
        iArr[lIIlIlIIll[10]] = lIIlIlIIll[45];
        iArr[lIIlIlIIll[14]] = lIIlIlIIll[47];
        iArr[lIIlIlIIll[15]] = lIIlIlIIll[49];
        iD = iArr;
        iE = new WorldArea(lIIlIlIIll[59], lIIlIlIIll[60], lIIlIlIIll[22], lIIlIlIIll[22], lIIlIlIIll[0]);
        iF = new WorldArea(lIIlIlIIll[61], lIIlIlIIll[62], lIIlIlIIll[32], lIIlIlIIll[26], lIIlIlIIll[0]);
        iG = new WorldArea(lIIlIlIIll[63], lIIlIlIIll[64], lIIlIlIIll[65], lIIlIlIIll[34], lIIlIlIIll[0]);
        iH = new WorldPoint(lIIlIlIIll[66], lIIlIlIIll[67], lIIlIlIIll[0]);
        bx = new WorldPoint(lIIlIlIIll[68], lIIlIlIIll[60], lIIlIlIIll[0]);
        iI = new WorldPoint(lIIlIlIIll[69], lIIlIlIIll[70], lIIlIlIIll[0]);
    }

    private static boolean llllllIIIlll(int i) {
        return i == 0;
    }

    private static boolean llllllIIlIlI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0082, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f6, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0130, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a4, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0233, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x026d, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02a7, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02e1, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x031b, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0355, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x038f, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean bo() {
        if (llllllIIlIlI(Skills.getLevel(Skill.ATTACK), lIIlIlIIll[2])) {
            int[] iArr = new int[lIIlIlIIll[1]];
            iArr[lIIlIlIIll[0]] = lIIlIlIIll[17];
            if (llllllIIIlll(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIlIIll[1]];
                iArr2[lIIlIlIIll[0]] = lIIlIlIIll[17];
            }
            int[] iArr3 = new int[lIIlIlIIll[1]];
            iArr3[lIIlIlIIll[0]] = lIIlIlIIll[42];
            if (llllllIIIlll(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lIIlIlIIll[1]];
                iArr4[lIIlIlIIll[0]] = lIIlIlIIll[42];
            }
            int[] iArr5 = new int[lIIlIlIIll[1]];
            iArr5[lIIlIlIIll[0]] = lIIlIlIIll[44];
            if (llllllIIIlll(Equipment.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIlIlIIll[1]];
                iArr6[lIIlIlIIll[0]] = lIIlIlIIll[44];
            }
            int[] iArr7 = new int[lIIlIlIIll[1]];
            iArr7[lIIlIlIIll[0]] = lIIlIlIIll[40];
            if (llllllIIIlll(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIIlIlIIll[1]];
                iArr8[lIIlIlIIll[0]] = lIIlIlIIll[40];
            }
            int[] iArr9 = new int[lIIlIlIIll[1]];
            iArr9[lIIlIlIIll[0]] = lIIlIlIIll[45];
            if (llllllIIIlll(Equipment.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIIlIlIIll[1]];
                iArr10[lIIlIlIIll[0]] = lIIlIlIIll[45];
            }
            int[] iArr11 = new int[lIIlIlIIll[1]];
            iArr11[lIIlIlIIll[0]] = lIIlIlIIll[47];
            if (llllllIIIlll(Equipment.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lIIlIlIIll[1]];
                iArr12[lIIlIlIIll[0]] = lIIlIlIIll[47];
            }
            int[] iArr13 = new int[lIIlIlIIll[1]];
            iArr13[lIIlIlIIll[0]] = lIIlIlIIll[49];
            if (llllllIIIlll(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lIIlIlIIll[1]];
                iArr14[lIIlIlIIll[0]] = lIIlIlIIll[49];
            }
            int[] iArr15 = new int[lIIlIlIIll[1]];
            iArr15[lIIlIlIIll[0]] = lIIlIlIIll[11];
            if (llllllIIIlIl(Inventory.contains(iArr15) ? 1 : 0)) {
                ?? r0 = lIIlIlIIll[1];
                "".length();
                return 0 != 0 ? ((44 ^ 41) ^ (231 ^ 193)) & (((29 ^ 124) ^ (251 ^ 185)) ^ (-" ".length())) : r0;
            }
            return lIIlIlIIll[0];
        }
        int[] iArr16 = new int[lIIlIlIIll[1]];
        iArr16[lIIlIlIIll[0]] = lIIlIlIIll[16];
        if (llllllIIIlll(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lIIlIlIIll[1]];
            iArr17[lIIlIlIIll[0]] = lIIlIlIIll[16];
        }
        int[] iArr18 = new int[lIIlIlIIll[1]];
        iArr18[lIIlIlIIll[0]] = lIIlIlIIll[42];
        if (llllllIIIlll(Equipment.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lIIlIlIIll[1]];
            iArr19[lIIlIlIIll[0]] = lIIlIlIIll[42];
        }
        int[] iArr20 = new int[lIIlIlIIll[1]];
        iArr20[lIIlIlIIll[0]] = lIIlIlIIll[44];
        if (llllllIIIlll(Equipment.contains(iArr20) ? 1 : 0)) {
            int[] iArr21 = new int[lIIlIlIIll[1]];
            iArr21[lIIlIlIIll[0]] = lIIlIlIIll[44];
        }
        int[] iArr22 = new int[lIIlIlIIll[1]];
        iArr22[lIIlIlIIll[0]] = lIIlIlIIll[40];
        if (llllllIIIlll(Equipment.contains(iArr22) ? 1 : 0)) {
            int[] iArr23 = new int[lIIlIlIIll[1]];
            iArr23[lIIlIlIIll[0]] = lIIlIlIIll[40];
        }
        int[] iArr24 = new int[lIIlIlIIll[1]];
        iArr24[lIIlIlIIll[0]] = lIIlIlIIll[45];
        if (llllllIIIlll(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lIIlIlIIll[1]];
            iArr25[lIIlIlIIll[0]] = lIIlIlIIll[45];
        }
        int[] iArr26 = new int[lIIlIlIIll[1]];
        iArr26[lIIlIlIIll[0]] = lIIlIlIIll[47];
        if (llllllIIIlll(Equipment.contains(iArr26) ? 1 : 0)) {
            int[] iArr27 = new int[lIIlIlIIll[1]];
            iArr27[lIIlIlIIll[0]] = lIIlIlIIll[47];
        }
        int[] iArr28 = new int[lIIlIlIIll[1]];
        iArr28[lIIlIlIIll[0]] = lIIlIlIIll[49];
        if (llllllIIIlll(Equipment.contains(iArr28) ? 1 : 0)) {
            int[] iArr29 = new int[lIIlIlIIll[1]];
            iArr29[lIIlIlIIll[0]] = lIIlIlIIll[49];
        }
        int[] iArr30 = new int[lIIlIlIIll[1]];
        iArr30[lIIlIlIIll[0]] = lIIlIlIIll[11];
        if (llllllIIIlIl(Inventory.contains(iArr30) ? 1 : 0)) {
            ?? r02 = lIIlIlIIll[1];
            "".length();
            return ((((85 ^ 4) ^ (145 ^ 150)) & (((69 ^ 114) ^ (164 ^ 197)) ^ (-" ".length()))) & ((((((139 + 119) - 196) + 173) ^ (((150 + 46) - 109) + 111)) & (((122 ^ 115) ^ (11 ^ 47)) ^ (-" ".length()))) ^ (-" ".length()))) != (((27 ^ 122) ^ (97 ^ 18)) & (((68 ^ 2) ^ (62 ^ 106)) ^ (-" ".length()))) ? ((87 ^ 81) ^ (159 ^ 189)) & (((52 ^ 63) ^ (87 ^ 120)) ^ (-" ".length())) : r02;
        }
        return lIIlIlIIll[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0252, code lost:
        if (llllllIIIlIl(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cw() {
        if (llllllIIIlIl(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIllll[lIIlIlIIll[0]];
            C0001b.a(bv);
            if (llllllIIIllI(bv.size(), lIIlIlIIll[1])) {
                System.out.println(lIIlIIllll[lIIlIlIIll[1]]);
                bt = lIIlIlIIll[0];
            }
        }
        if (llllllIIIlll(bt ? 1 : 0)) {
            if (llllllIIIlll(bo() ? 1 : 0) && llllllIIIllI(Skills.getLevel(Skill.DEFENCE), lIIlIlIIll[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llllllIIlIII(nearest) && llllllIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIllll[lIIlIlIIll[3]];
                    C0000a.a(nearest);
                }
                if (llllllIIlIII(nearest) && llllllIIIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlIIllll[lIIlIlIIll[4]];
                    if (llllllIIIlll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIlIIll[5]);
                        "".length();
                    }
                    if (llllllIIIlIl(Bank.isOpen() ? 1 : 0)) {
                        if (llllllIIlIIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIlIIll[1]);
                            "".length();
                        }
                        if (llllllIIlIIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIlIlIIll[3]);
                            "".length();
                        }
                        if (llllllIIIlll(cy() ? 1 : 0)) {
                            af();
                            System.out.println(lIIlIIllll[lIIlIlIIll[6]]);
                            bt = lIIlIlIIll[1];
                            return;
                        }
                        C0000a.a(iD, lIIlIlIIll[1]);
                        C0000a.a(lIIlIlIIll[7], lIIlIlIIll[8]);
                        C0000a.b(C0005f.aV, lIIlIlIIll[1]);
                        C0000a.a(lIIlIlIIll[9], lIIlIlIIll[10]);
                        C0000a.a(lIIlIlIIll[11], lIIlIlIIll[12]);
                    }
                }
            }
            if (llllllIIIlIl(bo() ? 1 : 0)) {
                cx();
                if (llllllIIlIlI(Movement.getRunEnergy(), lIIlIlIIll[13]) && llllllIIIlll(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                String[] strArr = new String[lIIlIlIIll[1]];
                strArr[lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[10]];
                if (llllllIIIlll(Equipment.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lIIlIlIIll[1]];
                    strArr2[lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[14]];
                    if (llllllIIIlll(Equipment.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[lIIlIlIIll[1]];
                        strArr3[lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[15]];
                        if (llllllIIIlll(Equipment.contains(strArr3) ? 1 : 0)) {
                            int[] iArr = new int[lIIlIlIIll[1]];
                            iArr[lIIlIlIIll[0]] = lIIlIlIIll[16];
                            if (llllllIIIlll(Equipment.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIlIlIIll[1]];
                                iArr2[lIIlIlIIll[0]] = lIIlIlIIll[17];
                            }
                        }
                    }
                }
                cz();
                if (llllllIIlIll(llllllIIIlII(C0004e.u(), 45.0d))) {
                    int[] iArr3 = new int[lIIlIlIIll[1]];
                    iArr3[lIIlIlIIll[0]] = lIIlIlIIll[11];
                    if (llllllIIIlIl(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIlIlIIll[1]];
                        iArr4[lIIlIlIIll[0]] = lIIlIlIIll[11];
                        Inventory.getFirst(iArr4).interact(lIIlIIllll[lIIlIlIIll[18]]);
                        Time.sleepTicks(lIIlIlIIll[1]);
                        "".length();
                    }
                }
                if (llllllIIlIlI(Skills.getLevel(Skill.ATTACK), lIIlIlIIll[19]) && llllllIIlIlI(Skills.getLevel(Skill.STRENGTH), lIIlIlIIll[19])) {
                    C0009j.Q();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (llllllIIlIlI(Skills.getLevel(Skill.DEFENCE), lIIlIlIIll[2])) {
            ?? r0 = lIIlIlIIll[1];
            "".length();
            return "  ".length() <= 0 ? ((((183 + 26) - 192) + 201) ^ (((184 + 96) - 238) + 145)) & (((((202 + 180) - 235) + 87) ^ (((61 + 38) - (-27)) + 13)) ^ (-" ".length())) : r0;
        }
        return lIIlIlIIll[0];
    }

    private static boolean llllllIIlIll(int i) {
        return i < 0;
    }

    private static boolean llllllIIlIIl(int i) {
        return i > 0;
    }

    private static void llllllIIIIll() {
        lIIlIlIIll = new int[72];
        lIIlIlIIll[0] = ((46 ^ 18) ^ (106 ^ 28)) & (((((210 + 78) - 60) + 17) ^ (((120 + 188) - 158) + 41)) ^ (-" ".length()));
        lIIlIlIIll[1] = " ".length();
        lIIlIlIIll[2] = 95 ^ 119;
        lIIlIlIIll[3] = "  ".length();
        lIIlIlIIll[4] = "   ".length();
        lIIlIlIIll[5] = (-2051) & 7050;
        lIIlIlIIll[6] = (((178 + 144) - 217) + 80) ^ (((94 + 181) - 252) + 166);
        lIIlIlIIll[7] = (-(0 ^ 13)) & (-8193) & 9199;
        lIIlIlIIll[8] = (-((-2402) & 28025)) & (-2049) & 28671;
        lIIlIlIIll[9] = (-24625) & 32631;
        lIIlIlIIll[10] = 89 ^ 92;
        lIIlIlIIll[11] = (-1157) & 1535;
        lIIlIlIIll[12] = 91 ^ 63;
        lIIlIlIIll[13] = 78 ^ 65;
        lIIlIlIIll[14] = (98 ^ 106) ^ (152 ^ 150);
        lIIlIlIIll[15] = 149 ^ 146;
        lIIlIlIIll[16] = (-22601) & 23931;
        lIIlIlIIll[17] = (-((-13) & 29261)) & (-129) & 30709;
        lIIlIlIIll[18] = (148 ^ 156) ^ ((138 ^ 129) & ((55 ^ 60) ^ (-1)));
        lIIlIlIIll[19] = (((141 + 51) - 110) + 78) ^ (((133 + 13) - 14) + 48);
        lIIlIlIIll[20] = 26 ^ 19;
        lIIlIlIIll[21] = (((34 + 52) - (-18)) + 73) ^ (((105 + 39) - (-30)) + 13);
        lIIlIlIIll[22] = (((5 + 146) - (-3)) + 27) ^ (((64 + 41) - (-15)) + 70);
        lIIlIlIIll[23] = 76 ^ 64;
        lIIlIlIIll[24] = (((73 + 25) - (-30)) + 21) ^ (((110 + 101) - 118) + 59);
        lIIlIlIIll[25] = (70 ^ 80) ^ (113 ^ 105);
        lIIlIlIIll[26] = (((43 + 196) - 69) + 40) ^ (((136 + 149) - 240) + 149);
        lIIlIlIIll[27] = -" ".length();
        lIIlIlIIll[28] = (-21377) & 38884254;
        lIIlIlIIll[29] = 97 ^ 112;
        lIIlIlIIll[30] = 36 ^ 54;
        lIIlIlIIll[31] = 104 ^ 123;
        lIIlIlIIll[32] = (((57 + 40) - 78) + 148) ^ (((36 + 142) - 150) + 150);
        lIIlIlIIll[33] = (27 ^ 40) ^ (165 ^ 128);
        lIIlIlIIll[34] = (127 ^ 43) ^ (42 ^ 96);
        lIIlIlIIll[35] = (157 ^ 139) ^ " ".length();
        lIIlIlIIll[36] = (121 ^ 42) ^ (229 ^ 174);
        lIIlIlIIll[37] = 37 ^ 60;
        lIIlIlIIll[38] = (85 ^ 103) ^ (101 ^ 77);
        lIIlIlIIll[39] = "   ".length() ^ (142 ^ 150);
        lIIlIlIIll[40] = (-19287) & 20447;
        lIIlIlIIll[41] = (((13 + 122) - 40) + 43) ^ (((37 + 43) - 70) + 140);
        lIIlIlIIll[42] = (-((-8293) & 31733)) & (-9) & 24571;
        lIIlIlIIll[43] = 182 ^ 171;
        lIIlIlIIll[44] = (-20877) & 21949;
        lIIlIlIIll[45] = (-((-109) & 19069)) & (-4353) & 24511;
        lIIlIlIIll[46] = 152 ^ 135;
        lIIlIlIIll[47] = (-31043) & 32746;
        lIIlIlIIll[48] = (((10 + 105) - (-53)) + 14) ^ (((119 + 70) - 74) + 35);
        lIIlIlIIll[49] = (-((-2369) & 22978)) & (-1025) & 32759;
        lIIlIlIIll[50] = 157 ^ 188;
        lIIlIlIIll[51] = (-((-1292) & 19791)) & (-9233) & 28631;
        lIIlIlIIll[52] = (-16422) & 24429;
        lIIlIlIIll[53] = (-28935) & 63934;
        lIIlIlIIll[54] = (-((-1035) & 3166)) & (-517) & 27647;
        lIIlIlIIll[55] = (-((-8393) & 31947)) & (-8713) & 32766;
        lIIlIlIIll[56] = (-((-14971) & 31615)) & (-35) & 31678;
        lIIlIlIIll[57] = (182 ^ 159) ^ (25 ^ 18);
        lIIlIlIIll[58] = (((40 + 67) - 88) + 112) ^ (((64 + 130) - 56) + 22);
        lIIlIlIIll[59] = (-8997) & 12221;
        lIIlIlIIll[60] = (-8961) & 12250;
        lIIlIlIIll[61] = (-((-17577) & 30396)) & (-16705) & 32767;
        lIIlIlIIll[62] = (-((-25841) & 30711)) & (-33) & 8182;
        lIIlIlIIll[63] = (-29193) & 32377;
        lIIlIlIIll[64] = (-257) & 3423;
        lIIlIlIIll[65] = (((103 + 138) - 178) + 110) ^ (((15 + 74) - (-17)) + 51);
        lIIlIlIIll[66] = (-16979) & 20191;
        lIIlIlIIll[67] = (-((-23645) & 31967)) & (-4609) & 16111;
        lIIlIlIIll[68] = (-21249) & 24502;
        lIIlIlIIll[69] = (-((-27497) & 31593)) & (-24673) & 31999;
        lIIlIlIIll[70] = (-17157) & 20452;
        lIIlIlIIll[71] = 92 ^ 120;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlIlIIll[0];
    }

    private static boolean llllllIIlllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlIIllll[lIIlIlIIll[57]];
    }

    private static boolean llllllIIlIII(Object obj) {
        return obj != null;
    }

    public static void cz() {
        if (llllllIIIllI(Skills.getLevel(Skill.DEFENCE), lIIlIlIIll[2])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            cw();
            "".length();
            if (((25 ^ 77) ^ (231 ^ 183)) < 0) {
                return ((235 ^ 133) ^ (4 ^ 59)) & (((126 ^ 123) ^ (201 ^ 157)) ^ (-" ".length()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lIIlIlIIll[0];
    }

    private static boolean llllllIIIllI(int i, int i2) {
        return i < i2;
    }

    private static String llllllIIIIII(String lllllllllllllllllllllllIlllllIll, String lllllllllllllllllllllllIlllllIII) {
        try {
            SecretKeySpec lllllllllllllllllllllllIlllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllllIlllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllllllIllllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllllllllllIllllllIl.init(lIIlIlIIll[3], lllllllllllllllllllllllIlllllllI);
            return new String(lllllllllllllllllllllllIllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllllIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllllIllllllII) {
            lllllllllllllllllllllllIllllllII.printStackTrace();
            return null;
        }
    }

    public static void aa() {
        if (llllllIIIlll(iF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIllll[lIIlIlIIll[20]];
            Movement.walkTo(bx);
            "".length();
            Time.sleepTicks(lIIlIlIIll[1]);
            "".length();
        }
        if (llllllIIIlIl(iF.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderRogues.c = lIIlIIllll[lIIlIlIIll[21]];
            if (llllllIIllII(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (llllllIIIlIl(npc.getName().contains(lIIlIIllll[lIIlIlIIll[58]]) ? 1 : 0) && llllllIIllII(npc.getInteracting()) && llllllIIIlll(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lIIlIlIIll[1];
                        "".length();
                        return " ".length() > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIlIlIIll[0];
                });
                String[] strArr = new String[lIIlIlIIll[3]];
                strArr[lIIlIlIIll[0]] = lIIlIIllll[lIIlIlIIll[22]];
                strArr[lIIlIlIIll[1]] = lIIlIIllll[lIIlIlIIll[23]];
                List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                    if (llllllIIlllI(npc2.getInteracting(), Players.getLocal())) {
                        ?? r0 = lIIlIlIIll[1];
                        "".length();
                        return (-" ".length()) >= 0 ? ((((82 + 134) - 177) + 107) ^ (((2 + 39) - (-106)) + 4)) & (((10 ^ 73) ^ (219 ^ 157)) ^ (-" ".length())) : r0;
                    }
                    return lIIlIlIIll[0];
                }).collect(Collectors.toList());
                if (llllllIIIlll(list.isEmpty() ? 1 : 0)) {
                    ((NPC) list.get(lIIlIlIIll[0])).interact(lIIlIIllll[lIIlIlIIll[24]]);
                    Time.sleepTicks(lIIlIlIIll[3]);
                    "".length();
                }
                if (llllllIIlIII(nearest) && llllllIIIlll(Players.getLocal().isMoving() ? 1 : 0) && llllllIIIlIl(list.isEmpty() ? 1 : 0)) {
                    nearest.interact(lIIlIIllll[lIIlIlIIll[25]]);
                    Time.sleepTicks(lIIlIlIIll[3]);
                    "".length();
                }
            }
            if (llllllIIlIII(Players.getLocal().getInteracting())) {
                Time.sleepTicks(lIIlIlIIll[6]);
                "".length();
            }
        }
    }

    private static int llllllIIIlII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llllllIIIlIl(int i) {
        return i != 0;
    }
}
