package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Production;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aA  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aA.class */
public class aA implements InterfaceC0003ac {
    private static final /* synthetic */ int oT;
    private static final /* synthetic */ int oL;
    private static final /* synthetic */ int oP;
    private static final /* synthetic */ int oN;
    private static final /* synthetic */ int oR;
    private static final /* synthetic */ int oU;
    public static /* synthetic */ List<C0017d> bv;
    public static /* synthetic */ boolean bt;
    private static final /* synthetic */ int oO;
    private static /* synthetic */ int[] llIlIlllll;
    private static final /* synthetic */ int oV;
    private static final /* synthetic */ int oM;
    private static final /* synthetic */ int oQ;
    private static final /* synthetic */ int oS;
    private static /* synthetic */ String[] llIlIllllI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    private static boolean an() {
        if (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[6]) && lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[10])) {
            int[] iArr = new int[llIlIlllll[1]];
            iArr[llIlIlllll[0]] = llIlIlllll[7];
            if (lIllIlIllIIII(Inventory.getCount(iArr))) {
                int[] iArr2 = new int[llIlIlllll[1]];
                iArr2[llIlIlllll[0]] = llIlIlllll[11];
                if (lIllIlIllIIII(Inventory.getCount(iArr2))) {
                    ?? r0 = llIlIlllll[1];
                    "".length();
                    return (((16 ^ 40) ^ (63 ^ 50)) & (((115 ^ 45) ^ (44 ^ 71)) ^ (-" ".length()))) == " ".length() ? ((99 ^ 43) ^ (212 ^ 166)) & (((((13 + 105) - (-31)) + 32) ^ (((87 + 42) - 105) + 119)) ^ (-" ".length())) : r0;
                }
            }
            return llIlIlllll[0];
        } else if (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[10])) {
            int[] iArr3 = new int[llIlIlllll[1]];
            iArr3[llIlIlllll[0]] = llIlIlllll[13];
            if (lIllIlIllIIII(Inventory.getCount(iArr3))) {
                int[] iArr4 = new int[llIlIlllll[1]];
                iArr4[llIlIlllll[0]] = fx();
                if (lIllIlIllIIII(Inventory.getCount(iArr4))) {
                    ?? r02 = llIlIlllll[1];
                    "".length();
                    return "   ".length() <= "  ".length() ? ((121 ^ 50) ^ (220 ^ 169)) & (((((88 + 171) - 208) + 122) ^ (((58 + 117) - 148) + 120)) ^ (-" ".length())) : r02;
                }
            }
            return llIlIlllll[0];
        } else {
            int[] iArr5 = new int[llIlIlllll[1]];
            iArr5[llIlIlllll[0]] = llIlIlllll[7];
            if (lIllIlIllIIII(Inventory.getCount(iArr5))) {
                int[] iArr6 = new int[llIlIlllll[1]];
                iArr6[llIlIlllll[0]] = llIlIlllll[8];
                if (lIllIlIllIIII(Inventory.getCount(iArr6))) {
                    ?? r03 = llIlIlllll[1];
                    "".length();
                    return "   ".length() == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r03;
                }
            }
            return llIlIlllll[0];
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        fv();
        return llIlIlllll[43];
    }

    private static boolean lIllIlIlIlllI(int i) {
        return i == 0;
    }

    private static boolean lIllIlIllIIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIlIlIllll(Object obj) {
        return obj != null;
    }

    private static String lIllIlIlIlIIl(String llllllllllllllllllIIIlIllIlIllll, String llllllllllllllllllIIIlIllIlIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIllIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIlIllIllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIlIllIllIIIl.init(llIlIlllll[2], secretKeySpec);
            return new String(llllllllllllllllllIIIlIllIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIlIllIllIIII) {
            llllllllllllllllllIIIlIllIllIIII.printStackTrace();
            return null;
        }
    }

    private static void lIllIlIlIlIlI() {
        llIlIllllI = new String[llIlIlllll[50]];
        llIlIllllI[llIlIlllll[0]] = lIllIlIlIIlll("mKJe4NxD3aqdcsax4+oyoA==", "gdCcM");
        llIlIllllI[llIlIlllll[1]] = lIllIlIlIlIII("IQIHJSYPDg1sNxISACIyRwIdKTgUR0k/Ig4fCiQ8CQxJLjQEAEk4OkcNBSkhBAMAIjI=", "gkiLU");
        llIlIllllI[llIlIlllll[2]] = lIllIlIlIIlll("IQAYhCgHunI8Gt7v20rad2f+4Zqmhnxh", "hJCjn");
        llIlIllllI[llIlIlllll[3]] = lIllIlIlIlIIl("xQ3QWH70YNj4o4U1WwHT5w==", "ynMuB");
        llIlIllllI[llIlIlllll[5]] = lIllIlIlIlIII("BRAYEx0kHxFXEywfHR4fKg==", "Mqvwq");
        llIlIllllI[llIlIlllll[9]] = lIllIlIlIlIIl("AmBLQFZ39LZUCZbJs3Qci/QlgB0FwCRtv8P0wdfvduRsM+nmTeaUoTXAtzR0vzQk", "drXTE");
        llIlIllllI[llIlIlllll[12]] = lIllIlIlIlIII("DwNXLDw9RhokPSsPGSpuKxMHPSIxAwRhbisRHjktMA8ZKm4sCVcPGwEvOQo=", "XfwMN");
        llIlIllllI[llIlIlllll[14]] = lIllIlIlIlIIl("fbuGpt2ypZToo0oZo8Ft04DTBe0ryl2dDN/nuKTu0H2yz90IzvLNF0y8KNvnrY+Z", "SttMj");
        llIlIllllI[llIlIlllll[15]] = lIllIlIlIlIIl("S748BzXCQRWzSgJSbvDO1w==", "mTCXT");
        llIlIllllI[llIlIlllll[16]] = lIllIlIlIIlll("uC8vWsdUeBgTDchjuYXOYg==", "fCwOw");
        llIlIllllI[llIlIlllll[20]] = lIllIlIlIlIII("ATsNJiIvPgY1YSg2A3ItKDkPIQ==", "GWhRA");
        llIlIllllI[llIlIlllll[21]] = lIllIlIlIlIII("Gg45aik6ATUoKiI=", "UoRJE");
        llIlIllllI[llIlIlllll[24]] = lIllIlIlIIlll("tWd2rCYEH72jEMQkyhf8Zyoc6aVncDHw", "wanXy");
        llIlIllllI[llIlIlllll[25]] = lIllIlIlIlIIl("nUOezxfA9wfW/ky0jbxvSg==", "OrHTU");
        llIlIllllI[llIlIlllll[27]] = lIllIlIlIlIII("KC0OIQYGKAUyRRkoBzkKGWEHOgsJIwQiFg==", "nAkUe");
        llIlIllllI[llIlIlllll[6]] = lIllIlIlIlIIl("xHn0LxofG5GAGwQaz5Ey+Q==", "vbjxG");
        llIlIllllI[llIlIlllll[28]] = lIllIlIlIlIIl("zKhTM42DAWmY7N7lR2LOpner5YbdCKge", "MOnRi");
        llIlIllllI[llIlIlllll[29]] = lIllIlIlIIlll("jIlXptGHWxx98phBjdgfFw==", "chBCz");
        llIlIllllI[llIlIlllll[35]] = lIllIlIlIlIII("Fzk9Oiw5PDYp", "QUXNO");
        llIlIllllI[llIlIlllll[45]] = lIllIlIlIIlll("5i1fPoxrUI215j1i2KuEZSRun/CBE9xx", "QFYDF");
    }

    private static boolean lIllIlIlIllII(int i) {
        return i != 0;
    }

    private static boolean lIllIlIlIllIl(int i, int i2) {
        return i < i2;
    }

    private static int fx() {
        return lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[26]) ? llIlIlllll[30] : (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[19]) && lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[26])) ? llIlIlllll[31] : (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[10]) && lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[19])) ? llIlIlllll[32] : lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[11]) ? llIlIlllll[7] : llIlIlllll[0];
    }

    private static boolean lIllIlIllIIII(int i) {
        return i > 0;
    }

    private static String lIllIlIlIIlll(String llllllllllllllllllIIIlIllIllllII, String llllllllllllllllllIIIlIllIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIllIlllIll.getBytes(StandardCharsets.UTF_8)), llIlIlllll[15]), "DES");
            Cipher llllllllllllllllllIIIlIllIlllllI = Cipher.getInstance("DES");
            llllllllllllllllllIIIlIllIlllllI.init(llIlIlllll[2], secretKeySpec);
            return new String(llllllllllllllllllIIIlIllIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIlIllIllllIl) {
            llllllllllllllllllIIIlIllIllllIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIlIlIII(String llllllllllllllllllIIIlIlllIlIIIl, String llllllllllllllllllIIIlIlllIlIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIIIlIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllllllIIIlIlllIIlllI = llllllllllllllllllIIIlIlllIlIIII.toCharArray();
        int llllllllllllllllllIIIlIlllIIllIl = llIlIlllll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIlIlllll[0];
        while (lIllIlIlIllIl(i, length)) {
            char llllllllllllllllllIIIlIlllIlIIlI = charArray[i];
            sb.append((char) (llllllllllllllllllIIIlIlllIlIIlI ^ llllllllllllllllllIIIlIlllIIlllI[llllllllllllllllllIIIlIlllIIllIl % llllllllllllllllllIIIlIlllIIlllI.length]));
            "".length();
            llllllllllllllllllIIIlIlllIIllIl++;
            i++;
            "".length();
            if ((-((8 ^ 48) ^ (127 ^ 67))) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[44])) {
            ?? r0 = llIlIlllll[1];
            "".length();
            return (-(62 ^ 58)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIlllll[0];
    }

    private static void Q() {
        if (lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[6])) {
            C0017d c0017d = new C0017d(llIlIlllll[7], llIlIlllll[33], llIlIlllll[11]);
            C0017d c0017d2 = new C0017d(llIlIlllll[8], llIlIlllll[34], llIlIlllll[35]);
            bv.add(c0017d);
            "".length();
            bv.add(c0017d2);
            "".length();
        }
        if (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[6]) && lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[10])) {
            C0017d c0017d3 = new C0017d(llIlIlllll[7], llIlIlllll[33], llIlIlllll[11]);
            C0017d c0017d4 = new C0017d(llIlIlllll[11], llIlIlllll[34], llIlIlllll[36]);
            bv.add(c0017d3);
            "".length();
            bv.add(c0017d4);
            "".length();
        }
        if (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[10]) && lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[19])) {
            C0017d c0017d5 = new C0017d(llIlIlllll[32], llIlIlllll[37], llIlIlllll[38]);
            C0017d c0017d6 = new C0017d(llIlIlllll[13], llIlIlllll[1], llIlIlllll[4]);
            bv.add(c0017d5);
            "".length();
            bv.add(c0017d6);
            "".length();
        }
        if (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[19]) && lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[26])) {
            C0017d c0017d7 = new C0017d(llIlIlllll[31], llIlIlllll[33], llIlIlllll[38]);
            C0017d c0017d8 = new C0017d(llIlIlllll[13], llIlIlllll[1], llIlIlllll[4]);
            bv.add(c0017d7);
            "".length();
            bv.add(c0017d8);
            "".length();
        }
        if (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[26])) {
            C0017d c0017d9 = new C0017d(llIlIlllll[30], llIlIlllll[33], llIlIlllll[38]);
            C0017d c0017d10 = new C0017d(llIlIlllll[13], llIlIlllll[1], llIlIlllll[4]);
            bv.add(c0017d9);
            "".length();
            bv.add(c0017d10);
            "".length();
        }
        if (lIllIlIlIlllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIllllI[llIlIlllll[45]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlllll[39], llIlIlllll[9], llIlIlllll[40]));
            "".length();
        }
        int[] iArr = new int[llIlIlllll[1]];
        iArr[llIlIlllll[0]] = llIlIlllll[41];
        if (lIllIlIlIlllI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlllll[41], llIlIlllll[11], llIlIlllll[42]));
            "".length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x016a, code lost:
        if (lIllIlIlIllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a4, code lost:
        if (lIllIlIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a7, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.llIlIllllI[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.llIlIlllll[9]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.llIlIlllll[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c2, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0278, code lost:
        if (lIllIlIlIllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02b2, code lost:
        if (lIllIlIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02b5, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.llIlIllllI[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.llIlIlllll[12]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.llIlIlllll[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02d0, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0379, code lost:
        if (lIllIlIllIIIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.llIlIlllll[1]) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03b2, code lost:
        if (lIllIlIlIllIl(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.llIlIlllll[1]) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03b5, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.llIlIllllI[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.llIlIlllll[14]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aA.llIlIlllll[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03d0, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v180, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v220, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v257, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v288, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void fv() {
        if (lIllIlIlIllII(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlIllllI[llIlIlllll[0]];
            C0015b.a(bv);
            if (lIllIlIlIllIl(bv.size(), llIlIlllll[1])) {
                System.out.println(llIlIllllI[llIlIlllll[1]]);
                bt = llIlIlllll[0];
            }
        }
        if (lIllIlIlIlllI(bt ? 1 : 0)) {
            if (lIllIlIlIlllI(an() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIllIlIlIllll(nearest) && lIllIlIlIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIllllI[llIlIlllll[2]];
                    C0000a.a(nearest);
                }
                if (lIllIlIlIllll(nearest) && lIllIlIlIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIllIlIlIlllI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIllllI[llIlIlllll[3]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, llIlIlllll[4]);
                        "".length();
                    }
                    if (lIllIlIlIllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIllllI[llIlIlllll[5]];
                        if (lIllIlIllIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(llIlIlllll[5]);
                            "".length();
                        }
                        if (lIllIlIllIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(llIlIlllll[2]);
                            "".length();
                        }
                        if (lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[6])) {
                            int[] iArr = new int[llIlIlllll[1]];
                            iArr[llIlIlllll[0]] = llIlIlllll[7];
                            if (lIllIlIlIlllI(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[llIlIlllll[1]];
                                iArr2[llIlIlllll[0]] = llIlIlllll[7];
                            }
                            int[] iArr3 = new int[llIlIlllll[1]];
                            iArr3[llIlIlllll[0]] = llIlIlllll[8];
                            if (lIllIlIlIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[llIlIlllll[1]];
                                iArr4[llIlIlllll[0]] = llIlIlllll[8];
                            }
                            Bank.withdrawAll(llIlIlllll[7], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIlIlllll[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr5 = new int[llIlIlllll[1]];
                                iArr5[llIlIlllll[0]] = llIlIlllll[7];
                                if (lIllIlIllIIII(Inventory.getCount(iArr5))) {
                                    ?? r0 = llIlIlllll[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlIlllll[0];
                            }, llIlIlllll[4]);
                            "".length();
                            Bank.withdrawAll(llIlIlllll[8], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIlIlllll[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr5 = new int[llIlIlllll[1]];
                                iArr5[llIlIlllll[0]] = llIlIlllll[8];
                                if (lIllIlIllIIII(Inventory.getCount(iArr5))) {
                                    ?? r0 = llIlIlllll[1];
                                    "".length();
                                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlIlllll[0];
                            }, llIlIlllll[4]);
                            "".length();
                        }
                        if (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[6]) && lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[10])) {
                            int[] iArr5 = new int[llIlIlllll[1]];
                            iArr5[llIlIlllll[0]] = llIlIlllll[7];
                            if (lIllIlIlIlllI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr6 = new int[llIlIlllll[1]];
                                iArr6[llIlIlllll[0]] = llIlIlllll[7];
                            }
                            int[] iArr7 = new int[llIlIlllll[1]];
                            iArr7[llIlIlllll[0]] = llIlIlllll[11];
                            if (lIllIlIlIlllI(Bank.contains(iArr7) ? 1 : 0)) {
                                int[] iArr8 = new int[llIlIlllll[1]];
                                iArr8[llIlIlllll[0]] = llIlIlllll[11];
                            }
                            Bank.withdrawAll(llIlIlllll[7], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIlIlllll[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr9 = new int[llIlIlllll[1]];
                                iArr9[llIlIlllll[0]] = llIlIlllll[7];
                                if (lIllIlIllIIII(Inventory.getCount(iArr9))) {
                                    ?? r0 = llIlIlllll[1];
                                    "".length();
                                    return "   ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlIlllll[0];
                            }, llIlIlllll[4]);
                            "".length();
                            Bank.withdrawAll(llIlIlllll[11], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(llIlIlllll[1]);
                            "".length();
                            Time.sleepUntil(() -> {
                                int[] iArr9 = new int[llIlIlllll[1]];
                                iArr9[llIlIlllll[0]] = llIlIlllll[11];
                                if (lIllIlIllIIII(Inventory.getCount(iArr9))) {
                                    ?? r0 = llIlIlllll[1];
                                    "".length();
                                    return "   ".length() > "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlIlllll[0];
                            }, llIlIlllll[4]);
                            "".length();
                        }
                        if (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[10])) {
                            int[] iArr9 = new int[llIlIlllll[1]];
                            iArr9[llIlIlllll[0]] = llIlIlllll[13];
                            if (lIllIlIlIlllI(Bank.contains(iArr9) ? 1 : 0)) {
                                int[] iArr10 = new int[llIlIlllll[1]];
                                iArr10[llIlIlllll[0]] = llIlIlllll[13];
                            }
                            int[] iArr11 = new int[llIlIlllll[1]];
                            iArr11[llIlIlllll[0]] = fx();
                            if (lIllIlIlIlllI(Bank.contains(iArr11) ? 1 : 0)) {
                                int[] iArr12 = new int[llIlIlllll[1]];
                                iArr12[llIlIlllll[0]] = fx();
                            }
                            int[] iArr13 = new int[llIlIlllll[1]];
                            iArr13[llIlIlllll[0]] = llIlIlllll[13];
                            if (lIllIlIlIllIl(Inventory.getCount(iArr13), llIlIlllll[1])) {
                                Bank.withdraw(llIlIlllll[13], llIlIlllll[1], Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIlIlllll[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr14 = new int[llIlIlllll[1]];
                                    iArr14[llIlIlllll[0]] = llIlIlllll[13];
                                    if (lIllIlIllIIII(Inventory.getCount(iArr14))) {
                                        ?? r0 = llIlIlllll[1];
                                        "".length();
                                        return ((95 ^ 44) ^ (222 ^ 169)) < (-" ".length()) ? ((159 ^ 129) ^ (24 ^ 59)) & (((((73 + 40) - 50) + 66) ^ (((39 + 105) - 95) + 139)) ^ (-" ".length())) : r0;
                                    }
                                    return llIlIlllll[0];
                                }, llIlIlllll[4]);
                                "".length();
                            }
                            int[] iArr14 = new int[llIlIlllll[1]];
                            iArr14[llIlIlllll[0]] = llIlIlllll[13];
                            if (lIllIlIllIIII(Inventory.getCount(iArr14))) {
                                Bank.withdrawAll(fx(), Bank.WithdrawMode.DEFAULT);
                                Time.sleepTicks(llIlIlllll[1]);
                                "".length();
                                Time.sleepUntil(() -> {
                                    int[] iArr15 = new int[llIlIlllll[1]];
                                    iArr15[llIlIlllll[0]] = fx();
                                    if (lIllIlIllIIII(Inventory.getCount(iArr15))) {
                                        ?? r0 = llIlIlllll[1];
                                        "".length();
                                        return "   ".length() <= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                    }
                                    return llIlIlllll[0];
                                }, llIlIlllll[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
            if (lIllIlIlIllII(an() ? 1 : 0)) {
                if (lIllIlIlIllII(Bank.isOpen() ? 1 : 0)) {
                    Bank.close();
                }
                if (lIllIlIlIlllI(Bank.isOpen() ? 1 : 0) && lIllIlIlIlllI(Players.getLocal().isAnimating() ? 1 : 0)) {
                    if (lIllIlIlIllII(GrandExchange.isOpen() ? 1 : 0)) {
                        GrandExchange.openBank();
                    }
                    if (lIllIlIlIlllI(Production.isOpen() ? 1 : 0)) {
                        AccBuilderSotf.c = llIlIllllI[llIlIlllll[15]];
                        int[] iArr15 = new int[llIlIlllll[1]];
                        iArr15[llIlIlllll[0]] = fw();
                        Item first = Inventory.getFirst(iArr15);
                        int[] iArr16 = new int[llIlIlllll[1]];
                        iArr16[llIlIlllll[0]] = fx();
                        Item first2 = Inventory.getFirst(iArr16);
                        if (lIllIlIlIllll(first) && lIllIlIlIllll(first2)) {
                            Time.sleepTicks(llIlIlllll[3]);
                            "".length();
                            first.useOn(first2);
                            Time.sleepUntil(() -> {
                                return Production.isOpen();
                            }, llIlIlllll[4]);
                            "".length();
                        }
                    }
                    if (lIllIlIlIllII(Production.isOpen() ? 1 : 0)) {
                        if (lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[10])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[16]];
                            Production.chooseOption(llIlIlllll[1]);
                            Time.sleepTicks(llIlIlllll[12]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (!lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0) || lIllIlIlIllII(Dialog.canLevelUpContinue() ? 1 : 0)) {
                                    ?? r0 = llIlIlllll[1];
                                    "".length();
                                    return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                }
                                return llIlIlllll[0];
                            }, C0018e.c(llIlIlllll[17], llIlIlllll[18]));
                            "".length();
                        }
                        if (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[10]) && lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[19])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[20]];
                            Production.chooseOption(llIlIllllI[llIlIlllll[21]]);
                            Time.sleepTicks(llIlIlllll[12]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    int[] iArr17 = new int[llIlIlllll[1]];
                                    iArr17[llIlIlllll[0]] = llIlIlllll[32];
                                    if (!lIllIlIlIllIl(Inventory.getCount(iArr17), llIlIlllll[1])) {
                                        return llIlIlllll[0];
                                    }
                                }
                                ?? r0 = llIlIlllll[1];
                                "".length();
                                return (-" ".length()) > 0 ? ((160 ^ 134) ^ (92 ^ 126)) & (((126 ^ 111) ^ (210 ^ 199)) ^ (-" ".length())) : r0;
                            }, C0018e.c(llIlIlllll[22], llIlIlllll[23]));
                            "".length();
                        }
                        if (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[19]) && lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[11])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[24]];
                            Production.chooseOption(llIlIllllI[llIlIlllll[25]]);
                            Time.sleepTicks(llIlIlllll[12]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    int[] iArr17 = new int[llIlIlllll[1]];
                                    iArr17[llIlIlllll[0]] = llIlIlllll[31];
                                    if (!lIllIlIlIllIl(Inventory.getCount(iArr17), llIlIlllll[1])) {
                                        return llIlIlllll[0];
                                    }
                                }
                                ?? r0 = llIlIlllll[1];
                                "".length();
                                return " ".length() != " ".length() ? ((120 ^ 36) ^ (189 ^ 181)) & (((((26 + 214) - 181) + 157) ^ (((37 + 42) - 6) + 67)) ^ (-" ".length())) : r0;
                            }, C0018e.c(llIlIlllll[22], llIlIlllll[23]));
                            "".length();
                        }
                        if (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[11]) && lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[26])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[27]];
                            Production.chooseOption(llIlIllllI[llIlIlllll[6]]);
                            Time.sleepTicks(llIlIlllll[12]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    int[] iArr17 = new int[llIlIlllll[1]];
                                    iArr17[llIlIlllll[0]] = llIlIlllll[31];
                                    if (!lIllIlIlIllIl(Inventory.getCount(iArr17), llIlIlllll[1])) {
                                        return llIlIlllll[0];
                                    }
                                }
                                ?? r0 = llIlIlllll[1];
                                "".length();
                                return (-"   ".length()) > 0 ? ((176 ^ 137) ^ (136 ^ 166)) & (((186 ^ 149) ^ (106 ^ 82)) ^ (-" ".length())) : r0;
                            }, C0018e.c(llIlIlllll[22], llIlIlllll[23]));
                            "".length();
                        }
                        if (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[26])) {
                            AccBuilderSotf.c = llIlIllllI[llIlIlllll[28]];
                            Production.chooseOption(llIlIllllI[llIlIlllll[29]]);
                            Time.sleepTicks(llIlIlllll[12]);
                            "".length();
                            Time.sleepUntil(() -> {
                                if (lIllIlIlIlllI(Dialog.isOpen() ? 1 : 0)) {
                                    int[] iArr17 = new int[llIlIlllll[1]];
                                    iArr17[llIlIlllll[0]] = llIlIlllll[30];
                                    if (!lIllIlIlIllIl(Inventory.getCount(iArr17), llIlIlllll[1])) {
                                        return llIlIlllll[0];
                                    }
                                }
                                ?? r0 = llIlIlllll[1];
                                "".length();
                                return (" ".length() & (" ".length() ^ (-" ".length()))) != 0 ? ((18 ^ 5) ^ (249 ^ 173)) & (((((184 + 162) - 197) + 47) ^ (((105 + 95) - 136) + 71)) ^ (-" ".length())) : r0;
                            }, C0018e.c(llIlIlllll[22], llIlIlllll[23]));
                            "".length();
                        }
                    }
                }
            }
        }
    }

    private static int fw() {
        return lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[10]) ? llIlIlllll[13] : (lIllIlIllIIIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[6]) && lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[10])) ? llIlIlllll[11] : lIllIlIlIllIl(Skills.getLevel(Skill.FLETCHING), llIlIlllll[6]) ? llIlIlllll[8] : llIlIlllll[0];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlIllllI[llIlIlllll[35]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlIlllll[0];
    }

    private static void lIllIlIlIlIll() {
        llIlIlllll = new int[51];
        llIlIlllll[0] = ((((122 + 132) - 224) + 111) ^ (((63 + 109) - 102) + 91)) & (((39 ^ 96) ^ (19 ^ 120)) ^ (-" ".length()));
        llIlIlllll[1] = " ".length();
        llIlIlllll[2] = "  ".length();
        llIlIlllll[3] = "   ".length();
        llIlIlllll[4] = (-17447) & 22446;
        llIlIlllll[5] = (10 ^ 17) ^ (78 ^ 81);
        llIlIlllll[6] = (208 ^ 160) ^ (((73 + 71) - 53) + 36);
        llIlIlllll[7] = 241 ^ 196;
        llIlIlllll[8] = 181 ^ 146;
        llIlIlllll[9] = 181 ^ 176;
        llIlIlllll[10] = 133 ^ 155;
        llIlIlllll[11] = 40 ^ 0;
        llIlIlllll[12] = 170 ^ 172;
        llIlIlllll[13] = (-((-20649) & 29866)) & (-22541) & 32703;
        llIlIlllll[14] = 1 ^ 6;
        llIlIlllll[15] = 156 ^ 148;
        llIlIlllll[16] = (177 ^ 165) ^ (135 ^ 154);
        llIlIlllll[17] = (-((-10373) & 27639)) & (-2) & 32767;
        llIlIlllll[18] = (-((-26182) & 32711)) & (-1029) & 24557;
        llIlIlllll[19] = 19 ^ 48;
        llIlIlllll[20] = (191 ^ 151) ^ (184 ^ 154);
        llIlIlllll[21] = (13 ^ 71) ^ (118 ^ 55);
        llIlIlllll[22] = (-((-10761) & 31515)) & (-517) & 98270;
        llIlIlllll[23] = (-((-24005) & 32254)) & (-2049) & 98297;
        llIlIlllll[24] = 83 ^ 95;
        llIlIlllll[25] = 104 ^ 101;
        llIlIlllll[26] = (57 ^ 74) ^ (251 ^ 191);
        llIlIlllll[27] = (177 ^ 138) ^ (44 ^ 25);
        llIlIlllll[28] = 173 ^ 189;
        llIlIlllll[29] = 79 ^ 94;
        llIlIlllll[30] = (-28675) & 30191;
        llIlIlllll[31] = (-((-7835) & 16027)) & (-18961) & 28671;
        llIlIlllll[32] = (-7) & 1527;
        llIlIlllll[33] = (-((-1430) & 26077)) & (-1) & 27647;
        llIlIlllll[34] = (-18446) & 20445;
        llIlIlllll[35] = 30 ^ 12;
        llIlIlllll[36] = 33 ^ 12;
        llIlIlllll[37] = (-8195) & 9194;
        llIlIlllll[38] = 43 ^ 23;
        llIlIlllll[39] = (-4098) & 16077;
        llIlIlllll[40] = (-7190) & 32189;
        llIlIlllll[41] = (-((-2825) & 11177)) & (-16385) & 32743;
        llIlIlllll[42] = (-((-8875) & 16107)) & (-25) & 8156;
        llIlIlllll[43] = 32 ^ 68;
        llIlIlllll[44] = (48 ^ 42) ^ (32 ^ 89);
        llIlIlllll[45] = 42 ^ 57;
        llIlIlllll[46] = 128 ^ 190;
        llIlIlllll[47] = (49 ^ 53) ^ (8 ^ 37);
        llIlIlllll[48] = (-1069) & 1919;
        llIlIlllll[49] = (-4109) & 5885;
        llIlIlllll[50] = (12 ^ 1) ^ (216 ^ 193);
    }

    static {
        lIllIlIlIlIll();
        lIllIlIlIlIlI();
        oM = llIlIlllll[8];
        oU = llIlIlllll[46];
        oL = llIlIlllll[7];
        oO = llIlIlllll[47];
        oR = llIlIlllll[13];
        oN = llIlIlllll[11];
        oV = llIlIlllll[48];
        oT = llIlIlllll[49];
        oP = llIlIlllll[31];
        oQ = llIlIlllll[32];
        oS = llIlIlllll[30];
        bv = new ArrayList();
    }
}
