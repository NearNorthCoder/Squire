package e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u;

import gg.squire.account.AccBuilderTempleTrek;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.N  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/N.class */
public class N implements S {
    static /* synthetic */ int bS;
    static /* synthetic */ String[] bQ;
    static /* synthetic */ boolean cl;
    public static /* synthetic */ WorldPoint ig;

    /* renamed from: if  reason: not valid java name */
    public static /* synthetic */ int f0if;
    private static /* synthetic */ String[] lllIllllII;
    public static /* synthetic */ boolean bs;
    private static /* synthetic */ int[] lllIllllIl;
    public static /* synthetic */ List<C0003d> bu;
    static /* synthetic */ int ck;

    private static String llIIlIlIIlIII(String lllllllllllllllllIllIIlIlIlIIllI, String lllllllllllllllllIllIIlIlIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllllIllIIlIlIlIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIIlIlIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllIllIIlIlIlIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllllIllIIlIlIlIlIII.init(lllIllllIl[3], lllllllllllllllllIllIIlIlIlIlIIl);
            return new String(lllllllllllllllllIllIIlIlIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIIlIlIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIIlIlIlIIlll) {
            lllllllllllllllllIllIIlIlIlIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIlIIllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llIIlIlIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.N.lllIllllIl[10]) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = new int[lllIllllIl[1]];
        iArr3[lllIllllIl[0]] = lllIllllIl[9];
        if (llIIlIlIIllII(Bank.contains(iArr3) ? 1 : 0)) {
            int[] iArr4 = new int[lllIllllIl[1]];
            iArr4[lllIllllIl[0]] = lllIllllIl[9];
            if (llIIlIlIIllII(Bank.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lllIllllIl[1]];
                iArr5[lllIllllIl[0]] = lllIllllIl[9];
            }
            iArr = new int[lllIllllIl[1]];
            iArr[lllIllllIl[0]] = lllIllllIl[12];
            if (llIIlIlIIlllI(Bank.contains(iArr) ? 1 : 0)) {
                bu.add(new C0003d(lllIllllIl[12], lllIllllIl[18], lllIllllIl[25]));
                "".length();
            }
            if (llIIlIlIIlllI(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lllIllllII[lllIllllIl[33]]);
            }) ? 1 : 0)) {
                bu.add(new C0003d(lllIllllIl[26], lllIllllIl[8], lllIllllIl[27]));
                "".length();
            }
            iArr2 = new int[lllIllllIl[1]];
            iArr2[lllIllllIl[0]] = lllIllllIl[13];
            if (llIIlIlIIlllI(Bank.contains(iArr2) ? 1 : 0)) {
                bu.add(new C0003d(lllIllllIl[13], lllIllllIl[28], lllIllllIl[25]));
                "".length();
            }
            if (llIIlIlIIlllI(Bank.contains(C0005f.aU) ? 1 : 0)) {
                return;
            }
            bu.add(new C0003d(lllIllllIl[29], lllIllllIl[8], C0008i.bp));
            "".length();
            return;
        }
        bu.add(new C0003d(lllIllllIl[9], lllIllllIl[10], lllIllllIl[25]));
        "".length();
        iArr = new int[lllIllllIl[1]];
        iArr[lllIllllIl[0]] = lllIllllIl[12];
        if (llIIlIlIIlllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (llIIlIlIIlllI(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lllIllllII[lllIllllIl[33]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[lllIllllIl[1]];
        iArr2[lllIllllIl[0]] = lllIllllIl[13];
        if (llIIlIlIIlllI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        if (llIIlIlIIlllI(Bank.contains(C0005f.aU) ? 1 : 0)) {
        }
    }

    private static void llIIlIlIIlIlI() {
        lllIllllII = new String[lllIllllIl[32]];
        lllIllllII[lllIllllIl[0]] = llIIlIlIIIlll("EB4TOD81SwMlND8Y", "RkjQQ");
        lllIllllII[lllIllllIl[1]] = llIIlIlIIlIII("5T53NwPtqgYDVg0zYq1i7aDPTPyRhKf1Y2e5YbA7fqWL5T0tBe0P8ph2olnyocDP7+rdcMief5k=", "wJNyn");
        lllIllllII[lllIllllIl[3]] = llIIlIlIIIlll("LTMOCRg=", "iAggs");
        lllIllllII[lllIllllIl[5]] = llIIlIlIIlIII("YYp8pbrn6Eccq+UHBlAAp/CaV2+jF9mG", "ZAYle");
        lllIllllII[lllIllllIl[6]] = llIIlIlIIIlll("KRssBhAIDGkKGAgA", "fkIhy");
        lllIllllII[lllIllllIl[8]] = llIIlIlIIlIII("Jc7Ark6Ooy2sznOrrh9Xvj8ROAnP/QzC", "FboXr");
        lllIllllII[lllIllllIl[11]] = llIIlIlIIlIII("F+0VFqKesv1umu3h5exc2APHDtoWbtN10ufNyDgrKY5m5EE62qVPq86foxR5LtDB", "unWcY");
        lllIllllII[lllIllllIl[14]] = llIIlIlIIlIII("SQlj0pKBaPlS/iokcLBS67bgfQfEBa5z2tg/Wwo6mz7U6bmfl5EdhJoeIZFoCk0D", "loNAk");
        lllIllllII[lllIllllIl[16]] = llIIlIlIIlIIl("btx1sRjsaN68BHrKcvrqrg==", "naRYk");
        lllIllllII[lllIllllIl[17]] = llIIlIlIIlIIl("OHwp0TV+uG8bBweK/zEBkA==", "rfuir");
        lllIllllII[lllIllllIl[18]] = llIIlIlIIlIIl("Df/Cc0wJa5Nxo4qYZ4kGrQ==", "OacBJ");
        lllIllllII[lllIllllIl[19]] = llIIlIlIIlIIl("xZJZJMeete1er/LbtXR9Sw==", "oLLWT");
        lllIllllII[lllIllllIl[20]] = llIIlIlIIlIII("0QInn2gqaxA=", "inpUX");
        lllIllllII[lllIllllIl[22]] = llIIlIlIIIlll("KFYjRg4OHiUPDAZRKAkQQRBuFxcEAjpI", "aqNfb");
        lllIllllII[lllIllllIl[23]] = llIIlIlIIlIII("aubphuPTsFKpe6mBFeVxSuwMTHo3rgLipwHljZnkrXE=", "ffhFr");
        lllIllllII[lllIllllIl[24]] = llIIlIlIIlIII("rzphcZnRur4=", "vLleZ");
        lllIllllII[lllIllllIl[31]] = llIIlIlIIIlll("OhE1KQBJCjgpERscImwBHBwjOA==", "iyPLp");
        lllIllllII[lllIllllIl[33]] = llIIlIlIIlIIl("QXFoAz0pycKbNxpdT4AjqyWapxR4j7o5", "LBwPj");
        lllIllllII[lllIllllIl[36]] = llIIlIlIIlIIl("z63HZ1z+nLfTHrVSV+VsBB22XJgDPTiWi/K2a1bOgHQ=", "BQqEv");
        lllIllllII[lllIllllIl[37]] = llIIlIlIIIlll("Cy00dEs9IyYhRXIBZzsKPGgjN0smICYsRQ==", "RHGXk");
        lllIllllII[lllIllllIl[10]] = llIIlIlIIlIII("jSS1pEXItaE=", "QEEiD");
    }

    private static String llIIlIlIIlIIl(String lllllllllllllllllIllIIlIlIIllIIl, String lllllllllllllllllIllIIlIlIIllIII) {
        try {
            SecretKeySpec lllllllllllllllllIllIIlIlIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIIlIlIIllIII.getBytes(StandardCharsets.UTF_8)), lllIllllIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIllllIl[3], lllllllllllllllllIllIIlIlIIlllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIIlIlIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIIlIlIIllIlI) {
            lllllllllllllllllIllIIlIlIIllIlI.printStackTrace();
            return null;
        }
    }

    private static void dg() {
        if (llIIlIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr = new String[lllIllllIl[1]];
            strArr[lllIllllIl[0]] = lllIllllII[lllIllllIl[19]];
            List all = NPCs.getAll(strArr);
            if (llIIlIlIlIIII(all.size())) {
                ((NPC) all.get(lllIllllIl[0])).interact(lllIllllII[lllIllllIl[20]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, lllIllllIl[21]);
                "".length();
            }
        }
        if (llIIlIlIIllII(Dialog.isOpen() ? 1 : 0) && llIIlIlIIllII(Dialog.isViewingOptions() ? 1 : 0)) {
            List options = Dialog.getOptions();
            if (llIIlIlIIlllI(options.isEmpty() ? 1 : 0)) {
                int i = lllIllllIl[0];
                while (llIIlIlIIllIl(i, options.size())) {
                    if (llIIlIlIIllII(((Widget) options.get(i)).getText().equalsIgnoreCase(lllIllllII[lllIllllIl[22]]) ? 1 : 0)) {
                        String[] strArr2 = new String[lllIllllIl[1]];
                        strArr2[lllIllllIl[0]] = ((Widget) options.get(i)).getText();
                        Dialog.chooseOption(strArr2);
                        "".length();
                        "".length();
                        if ("  ".length() >= "   ".length()) {
                            return;
                        }
                        return;
                    } else if (llIIlIlIIllII(((Widget) options.get(i)).getText().equalsIgnoreCase(lllIllllII[lllIllllIl[23]]) ? 1 : 0)) {
                        String[] strArr3 = new String[lllIllllIl[1]];
                        strArr3[lllIllllIl[0]] = ((Widget) options.get(i)).getText();
                        Dialog.chooseOption(strArr3);
                        "".length();
                        "".length();
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                        return;
                    } else if (llIIlIlIIllII(((Widget) options.get(i)).getText().equalsIgnoreCase(lllIllllII[lllIllllIl[24]]) ? 1 : 0)) {
                        String[] strArr4 = new String[lllIllllIl[1]];
                        strArr4[lllIllllIl[0]] = ((Widget) options.get(i)).getText();
                        Dialog.chooseOption(strArr4);
                        "".length();
                        "".length();
                        if ("   ".length() < " ".length()) {
                            return;
                        }
                        return;
                    } else if (llIIlIlIIlllI(Dialog.isViewingOptions() ? 1 : 0)) {
                        "".length();
                        if ((-"  ".length()) >= 0) {
                            return;
                        }
                        return;
                    } else {
                        i++;
                        "".length();
                        if ((true ^ true) & ((true ^ true) ^ true)) {
                            return;
                        }
                    }
                }
            }
        }
    }

    private static boolean llIIlIlIlIIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llIIlIlIIllII(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIIlIlIlIlII(C0004e.j(lllIllllIl[4]), lllIllllIl[32])) {
            ?? r0 = lllIllllIl[1];
            "".length();
            return (-(53 ^ 48)) >= 0 ? " ".length() & (" ".length() ^ (-1)) : r0;
        }
        return lllIllllIl[0];
    }

    static {
        llIIlIlIIlIll();
        llIIlIlIIlIlI();
        bu = new ArrayList();
        f0if = lllIllllIl[9];
        ig = new WorldPoint(lllIllllIl[34], lllIllllIl[35], lllIllllIl[0]);
        String[] strArr = new String[lllIllllIl[5]];
        strArr[lllIllllIl[0]] = lllIllllII[lllIllllIl[36]];
        strArr[lllIllllIl[1]] = lllIllllII[lllIllllIl[37]];
        strArr[lllIllllIl[3]] = lllIllllII[lllIllllIl[10]];
        bQ = strArr;
    }

    private static boolean llIIlIlIlIIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean bz() {
        int[] iArr = new int[lllIllllIl[1]];
        iArr[lllIllllIl[0]] = lllIllllIl[9];
        if (llIIlIlIIllII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lllIllllIl[1]];
            iArr2[lllIllllIl[0]] = lllIllllIl[9];
            if (llIIlIlIlIlIl(Inventory.getAll(iArr2).size(), lllIllllIl[10])) {
                ?? r0 = lllIllllIl[1];
                "".length();
                return 0 != 0 ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
            }
        }
        return lllIllllIl[0];
    }

    private static String llIIlIlIIIlll(String lllllllllllllllllIllIIlIlIIIlIIl, String lllllllllllllllllIllIIlIlIIIlIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIllIIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIllIIlIlIIIIlll = new StringBuilder();
        char[] lllllllllllllllllIllIIlIlIIIIllI = lllllllllllllllllIllIIlIlIIIlIII.toCharArray();
        int lllllllllllllllllIllIIlIlIIIIlIl = lllIllllIl[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIllllIl[0];
        while (llIIlIlIIllIl(i, length)) {
            lllllllllllllllllIllIIlIlIIIIlll.append((char) (charArray[i] ^ lllllllllllllllllIllIIlIlIIIIllI[lllllllllllllllllIllIIlIlIIIIlIl % lllllllllllllllllIllIIlIlIIIIllI.length]));
            "".length();
            lllllllllllllllllIllIIlIlIIIIlIl++;
            i++;
            "".length();
            if ((((((135 + 0) - 70) + 118) ^ (((83 + 115) - 118) + 73)) & (((((22 + 50) - 38) + 127) ^ (((29 + 19) - (-52)) + 43)) ^ (-" ".length()))) <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIllIIlIlIIIIlll);
    }

    private static boolean llIIlIlIlIlIl(int i, int i2) {
        return i >= i2;
    }

    private static void llIIlIlIIlIll() {
        lllIllllIl = new int[38];
        lllIllllIl[0] = ((((128 + 220) - 330) + 234) ^ (((40 + 125) - 98) + 103)) & (((206 ^ 153) ^ " ".length()) ^ (-" ".length()));
        lllIllllIl[1] = " ".length();
        lllIllllIl[2] = 87 ^ 101;
        lllIllllIl[3] = "  ".length();
        lllIllllIl[4] = (((36 ^ 2) + (134 ^ 173)) - (58 ^ 124)) + ((136 + 22) - (-7)) + 3;
        lllIllllIl[5] = "   ".length();
        lllIllllIl[6] = (152 ^ 133) ^ (27 ^ 2);
        lllIllllIl[7] = (-26726) & 31725;
        lllIllllIl[8] = 88 ^ 93;
        lllIllllIl[9] = (-((-9941) & 32757)) & (-8193) & 32767;
        lllIllllIl[10] = (((142 + 72) - 74) + 35) ^ (((3 + 11) - (-27)) + 146);
        lllIllllIl[11] = (((15 + 128) - 141) + 182) ^ (((147 + 148) - 209) + 104);
        lllIllllIl[12] = (-8359) & 16366;
        lllIllllIl[13] = (-177) & 8183;
        lllIllllIl[14] = (((123 + 77) - 79) + 58) ^ (((90 + 103) - 175) + 162);
        lllIllllIl[15] = (-(((101 + 52) - 48) + 44)) & (-16387) & 24543;
        lllIllllIl[16] = 57 ^ 49;
        lllIllllIl[17] = 72 ^ 65;
        lllIllllIl[18] = 153 ^ 147;
        lllIllllIl[19] = (((80 + 62) - 108) + 100) ^ (((57 + 57) - 58) + 85);
        lllIllllIl[20] = 108 ^ 96;
        lllIllllIl[21] = (-20551) & 23550;
        lllIllllIl[22] = 142 ^ 131;
        lllIllllIl[23] = (((108 + 59) - 98) + 118) ^ (((28 + 28) - (-119)) + 6);
        lllIllllIl[24] = 173 ^ 162;
        lllIllllIl[25] = (-20611) & 22510;
        lllIllllIl[26] = (-4130) & 16109;
        lllIllllIl[27] = (-6723) & 31722;
        lllIllllIl[28] = (((132 + 68) - 141) + 99) ^ (((27 + 70) - (-39)) + 46);
        lllIllllIl[29] = (-((-4469) & 23039)) & (-37) & 31231;
        lllIllllIl[30] = (223 ^ 161) ^ (99 ^ 121);
        lllIllllIl[31] = (133 ^ 152) ^ (140 ^ 129);
        lllIllllIl[32] = 149 ^ 128;
        lllIllllIl[33] = 106 ^ 123;
        lllIllllIl[34] = (-17161) & 20349;
        lllIllllIl[35] = (-((-563) & 13114)) & (-513) & 16335;
        lllIllllIl[36] = 110 ^ 124;
        lllIllllIl[37] = (((11 + 79) - 29) + 101) ^ (((48 + 88) - 91) + 132);
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllIllllII[lllIllllIl[31]];
    }

    private static boolean llIIlIlIlIIll(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v141, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v176, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    public static void df() {
        if (llIIlIlIIllII(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[0]];
            C0001b.a(bu);
            if (llIIlIlIIllIl(bu.size(), lllIllllIl[1])) {
                System.out.println(lllIllllII[lllIllllIl[1]]);
                bs = lllIllllIl[0];
            }
        }
        if (llIIlIlIIlllI(bs ? 1 : 0)) {
            if (llIIlIlIIllII(Inventory.contains(C0005f.aU) ? 1 : 0) && llIIlIlIIllIl(Movement.getRunEnergy(), lllIllllIl[2]) && llIIlIlIIlllI(Dialog.isOpen() ? 1 : 0)) {
                Inventory.getFirst(C0005f.aU).interact(lllIllllII[lllIllllIl[3]]);
                Time.sleepTicks(lllIllllIl[1]);
                "".length();
            }
            if (llIIlIlIIllIl(C0004e.j(lllIllllIl[4]), lllIllllIl[1])) {
                if (llIIlIlIIlllI(bz() ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (llIIlIlIIllll(nearest) && llIIlIlIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[5]];
                        C0000a.a(nearest);
                    }
                    if (llIIlIlIIllll(nearest) && llIIlIlIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llIIlIlIIlllI(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[6]];
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lllIllllIl[7]);
                            "".length();
                        }
                        if (llIIlIlIIllII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[8]];
                            if (llIIlIlIlIIII(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lllIllllIl[5]);
                                "".length();
                            }
                            if (llIIlIlIlIIII(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lllIllllIl[3]);
                                "".length();
                            }
                            int[] iArr = new int[lllIllllIl[1]];
                            iArr[lllIllllIl[0]] = lllIllllIl[9];
                            if (llIIlIlIIllII(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lllIllllIl[1]];
                                iArr2[lllIllllIl[0]] = lllIllllIl[9];
                                if (llIIlIlIIllIl(Bank.getFirst(iArr2).getQuantity(), lllIllllIl[10])) {
                                    ae();
                                    System.out.println(lllIllllII[lllIllllIl[11]]);
                                    bs = lllIllllIl[1];
                                    return;
                                }
                            }
                            int[] iArr3 = new int[lllIllllIl[1]];
                            iArr3[lllIllllIl[0]] = lllIllllIl[9];
                            if (llIIlIlIIllII(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lllIllllIl[1]];
                                iArr4[lllIllllIl[0]] = lllIllllIl[12];
                                if (llIIlIlIIllII(Bank.contains(iArr4) ? 1 : 0)) {
                                    int[] iArr5 = new int[lllIllllIl[1]];
                                    iArr5[lllIllllIl[0]] = lllIllllIl[13];
                                    if (!llIIlIlIIlllI(Bank.contains(iArr5) ? 1 : 0)) {
                                        Bank.withdraw(lllIllllIl[9], lllIllllIl[10], Bank.WithdrawMode.DEFAULT);
                                        Bank.withdraw(lllIllllIl[12], lllIllllIl[8], Bank.WithdrawMode.DEFAULT);
                                        Bank.withdraw(lllIllllIl[15], lllIllllIl[8], Bank.WithdrawMode.DEFAULT);
                                        C0000a.b(C0005f.be, lllIllllIl[1]);
                                    }
                                }
                            }
                            ae();
                            System.out.println(lllIllllII[lllIllllIl[14]]);
                            bs = lllIllllIl[1];
                            return;
                        }
                    }
                }
                if (llIIlIlIIllII(bz() ? 1 : 0)) {
                    if (llIIlIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ig), lllIllllIl[3])) {
                        if (llIIlIlIIllIl(bS, lllIllllIl[1])) {
                            C0004e.v();
                            bS += lllIllllIl[1];
                        }
                        AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[16]];
                        Movement.walkTo(ig);
                        "".length();
                    }
                    if (llIIlIlIlIIlI(Players.getLocal().getWorldLocation().distanceTo(ig), lllIllllIl[3])) {
                        String[] strArr = new String[lllIllllIl[1]];
                        strArr[lllIllllIl[0]] = lllIllllII[lllIllllIl[17]];
                        NPC nearest2 = NPCs.getNearest(strArr);
                        if (llIIlIlIIllll(nearest2) && llIIlIlIlIIIl(nearest2.getWorldLocation().distanceTo(ig), lllIllllIl[3])) {
                            C0004e.v();
                        }
                        if (llIIlIlIIllIl(ck, lllIllllIl[1])) {
                            ac.mM += lllIllllIl[1];
                            ac.d(AccBuilderTempleTrek.m);
                            ck += lllIllllIl[1];
                            ac.mM = lllIllllIl[0];
                            cl = lllIllllIl[0];
                        }
                        dg();
                    }
                }
            }
            if (!llIIlIlIlIIll(C0004e.j(lllIllllIl[4]), lllIllllIl[1]) || llIIlIlIlIlII(C0004e.j(lllIllllIl[4]), lllIllllIl[10])) {
                if (llIIlIlIlIlII(C0004e.j(lllIllllIl[4]), lllIllllIl[1])) {
                    if (llIIlIlIlIIIl(Players.getLocal().getWorldLocation().distanceTo(ig), lllIllllIl[3])) {
                        AccBuilderTempleTrek.c = lllIllllII[lllIllllIl[18]];
                        Movement.walkTo(ig);
                        "".length();
                        Time.sleepTicks(lllIllllIl[1]);
                        "".length();
                    }
                    dg();
                }
                if (llIIlIlIlIlII(C0004e.j(lllIllllIl[4]), lllIllllIl[10])) {
                    dg();
                }
            }
            C0006g.a(new String[lllIllllIl[0]]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lllIllllIl[0];
    }

    private static boolean llIIlIlIlIIII(int i) {
        return i > 0;
    }

    private static boolean llIIlIlIlIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIlIlIIlllI(int i) {
        return i == 0;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            df();
            "".length();
            if ((-"   ".length()) > 0) {
                return ((1 ^ 36) ^ (64 ^ 114)) & (((0 ^ 8) ^ (102 ^ 121)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
        }
        return lllIllllIl[30];
    }

    private static boolean llIIlIlIIllIl(int i, int i2) {
        return i < i2;
    }
}
