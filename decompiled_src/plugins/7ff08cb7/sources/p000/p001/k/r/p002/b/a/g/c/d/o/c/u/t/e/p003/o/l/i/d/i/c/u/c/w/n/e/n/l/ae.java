package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
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
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.ae  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/ae.class */
public class ae implements ab {
    public static /* synthetic */ WorldArea cP;
    public static /* synthetic */ WorldPoint cQ;
    public static /* synthetic */ WorldPoint cm;
    public static /* synthetic */ WorldArea cO;
    private static /* synthetic */ int[] lllIIlIll;
    public static /* synthetic */ int[] cM;
    public static /* synthetic */ boolean bv;
    private static /* synthetic */ String[] lllIIlIlI;
    public static /* synthetic */ List<C0003d> bx;
    public static /* synthetic */ WorldArea cN;
    public static /* synthetic */ WorldPoint cR;

    private static String llIIIIlIlIIl(String lllIlllllIIII, String lllIllllIllll) {
        try {
            SecretKeySpec lllIlllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIllllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlllllIIlI = Cipher.getInstance("Blowfish");
            lllIlllllIIlI.init(lllIIlIll[3], lllIlllllIIll);
            return new String(lllIlllllIIlI.doFinal(Base64.getDecoder().decode(lllIlllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlllllIIIl) {
            lllIlllllIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0573, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x059c, code lost:
        return p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ae.lllIIlIll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0113, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01c1, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0218, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x026f, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x02a9, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02da, code lost:
        return p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ae.lllIIlIll[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x032f, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0386, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03dd, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0434, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x048b, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x04e2, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0539, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L12;
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
        if (llIIIIllIIll(Skills.getLevel(Skill.ATTACK), lllIIlIll[2])) {
            int[] iArr = new int[lllIIlIll[1]];
            iArr[lllIIlIll[0]] = lllIIlIll[17];
            if (llIIIIllIIII(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIlIll[1]];
                iArr2[lllIIlIll[0]] = lllIIlIll[17];
                if (llIIIIllIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                    int[] iArr3 = new int[lllIIlIll[1]];
                    iArr3[lllIIlIll[0]] = lllIIlIll[17];
                }
            }
            int[] iArr4 = new int[lllIIlIll[1]];
            iArr4[lllIIlIll[0]] = lllIIlIll[42];
            if (llIIIIllIIII(Equipment.contains(iArr4) ? 1 : 0)) {
                int[] iArr5 = new int[lllIIlIll[1]];
                iArr5[lllIIlIll[0]] = lllIIlIll[42];
                if (llIIIIllIIII(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lllIIlIll[1]];
                    iArr6[lllIIlIll[0]] = lllIIlIll[42];
                }
            }
            int[] iArr7 = new int[lllIIlIll[1]];
            iArr7[lllIIlIll[0]] = lllIIlIll[44];
            if (llIIIIllIIII(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIIlIll[1]];
                iArr8[lllIIlIll[0]] = lllIIlIll[44];
                if (llIIIIllIIII(Inventory.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lllIIlIll[1]];
                    iArr9[lllIIlIll[0]] = lllIIlIll[44];
                }
            }
            int[] iArr10 = new int[lllIIlIll[1]];
            iArr10[lllIIlIll[0]] = lllIIlIll[40];
            if (llIIIIllIIII(Equipment.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[lllIIlIll[1]];
                iArr11[lllIIlIll[0]] = lllIIlIll[40];
                if (llIIIIllIIII(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lllIIlIll[1]];
                    iArr12[lllIIlIll[0]] = lllIIlIll[40];
                }
            }
            int[] iArr13 = new int[lllIIlIll[1]];
            iArr13[lllIIlIll[0]] = lllIIlIll[45];
            if (llIIIIllIIII(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lllIIlIll[1]];
                iArr14[lllIIlIll[0]] = lllIIlIll[45];
                if (llIIIIllIIII(Inventory.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lllIIlIll[1]];
                    iArr15[lllIIlIll[0]] = lllIIlIll[45];
                }
            }
            int[] iArr16 = new int[lllIIlIll[1]];
            iArr16[lllIIlIll[0]] = lllIIlIll[47];
            if (llIIIIllIIII(Inventory.contains(iArr16) ? 1 : 0)) {
                int[] iArr17 = new int[lllIIlIll[1]];
                iArr17[lllIIlIll[0]] = lllIIlIll[47];
                if (llIIIIllIIII(Equipment.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[lllIIlIll[1]];
                    iArr18[lllIIlIll[0]] = lllIIlIll[47];
                }
            }
            int[] iArr19 = new int[lllIIlIll[1]];
            iArr19[lllIIlIll[0]] = lllIIlIll[49];
            if (llIIIIllIIII(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[lllIIlIll[1]];
                iArr20[lllIIlIll[0]] = lllIIlIll[49];
                if (llIIIIllIIII(Equipment.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[lllIIlIll[1]];
                    iArr21[lllIIlIll[0]] = lllIIlIll[49];
                }
            }
            int[] iArr22 = new int[lllIIlIll[1]];
            iArr22[lllIIlIll[0]] = lllIIlIll[11];
            if (llIIIIllIIII(Inventory.contains(iArr22) ? 1 : 0)) {
                int[] iArr23 = new int[lllIIlIll[1]];
                iArr23[lllIIlIll[0]] = lllIIlIll[11];
            }
            ?? r0 = lllIIlIll[1];
            "".length();
            return (-" ".length()) == (102 ^ 98) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        int[] iArr24 = new int[lllIIlIll[1]];
        iArr24[lllIIlIll[0]] = lllIIlIll[16];
        if (llIIIIllIIII(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lllIIlIll[1]];
            iArr25[lllIIlIll[0]] = lllIIlIll[16];
            if (llIIIIllIIII(Inventory.contains(iArr25) ? 1 : 0)) {
                int[] iArr26 = new int[lllIIlIll[1]];
                iArr26[lllIIlIll[0]] = lllIIlIll[16];
            }
        }
        int[] iArr27 = new int[lllIIlIll[1]];
        iArr27[lllIIlIll[0]] = lllIIlIll[42];
        if (llIIIIllIIII(Equipment.contains(iArr27) ? 1 : 0)) {
            int[] iArr28 = new int[lllIIlIll[1]];
            iArr28[lllIIlIll[0]] = lllIIlIll[42];
            if (llIIIIllIIII(Inventory.contains(iArr28) ? 1 : 0)) {
                int[] iArr29 = new int[lllIIlIll[1]];
                iArr29[lllIIlIll[0]] = lllIIlIll[42];
            }
        }
        int[] iArr30 = new int[lllIIlIll[1]];
        iArr30[lllIIlIll[0]] = lllIIlIll[44];
        if (llIIIIllIIII(Equipment.contains(iArr30) ? 1 : 0)) {
            int[] iArr31 = new int[lllIIlIll[1]];
            iArr31[lllIIlIll[0]] = lllIIlIll[44];
            if (llIIIIllIIII(Inventory.contains(iArr31) ? 1 : 0)) {
                int[] iArr32 = new int[lllIIlIll[1]];
                iArr32[lllIIlIll[0]] = lllIIlIll[44];
            }
        }
        int[] iArr33 = new int[lllIIlIll[1]];
        iArr33[lllIIlIll[0]] = lllIIlIll[40];
        if (llIIIIllIIII(Equipment.contains(iArr33) ? 1 : 0)) {
            int[] iArr34 = new int[lllIIlIll[1]];
            iArr34[lllIIlIll[0]] = lllIIlIll[40];
            if (llIIIIllIIII(Inventory.contains(iArr34) ? 1 : 0)) {
                int[] iArr35 = new int[lllIIlIll[1]];
                iArr35[lllIIlIll[0]] = lllIIlIll[40];
            }
        }
        int[] iArr36 = new int[lllIIlIll[1]];
        iArr36[lllIIlIll[0]] = lllIIlIll[45];
        if (llIIIIllIIII(Equipment.contains(iArr36) ? 1 : 0)) {
            int[] iArr37 = new int[lllIIlIll[1]];
            iArr37[lllIIlIll[0]] = lllIIlIll[45];
            if (llIIIIllIIII(Inventory.contains(iArr37) ? 1 : 0)) {
                int[] iArr38 = new int[lllIIlIll[1]];
                iArr38[lllIIlIll[0]] = lllIIlIll[45];
            }
        }
        int[] iArr39 = new int[lllIIlIll[1]];
        iArr39[lllIIlIll[0]] = lllIIlIll[47];
        if (llIIIIllIIII(Inventory.contains(iArr39) ? 1 : 0)) {
            int[] iArr40 = new int[lllIIlIll[1]];
            iArr40[lllIIlIll[0]] = lllIIlIll[47];
            if (llIIIIllIIII(Equipment.contains(iArr40) ? 1 : 0)) {
                int[] iArr41 = new int[lllIIlIll[1]];
                iArr41[lllIIlIll[0]] = lllIIlIll[47];
            }
        }
        int[] iArr42 = new int[lllIIlIll[1]];
        iArr42[lllIIlIll[0]] = lllIIlIll[49];
        if (llIIIIllIIII(Inventory.contains(iArr42) ? 1 : 0)) {
            int[] iArr43 = new int[lllIIlIll[1]];
            iArr43[lllIIlIll[0]] = lllIIlIll[49];
            if (llIIIIllIIII(Equipment.contains(iArr43) ? 1 : 0)) {
                int[] iArr44 = new int[lllIIlIll[1]];
                iArr44[lllIIlIll[0]] = lllIIlIll[49];
            }
        }
        int[] iArr45 = new int[lllIIlIll[1]];
        iArr45[lllIIlIll[0]] = lllIIlIll[11];
        if (llIIIIllIIII(Inventory.contains(iArr45) ? 1 : 0)) {
            int[] iArr46 = new int[lllIIlIll[1]];
            iArr46[lllIIlIll[0]] = lllIIlIll[11];
        }
        ?? r02 = lllIIlIll[1];
        "".length();
        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
    }

    private static void llIIIIlIlIll() {
        lllIIlIlI = new String[lllIIlIll[71]];
        lllIIlIlI[lllIIlIll[0]] = llIIIIlIlIII("VMe1C+8csjWWizMxtg79Zw==", "VacIE");
        lllIIlIlI[lllIIlIll[1]] = llIIIIlIlIII("+s/mkjjGczAGY8pAeN9wiT/ppK4VdaUdHW3gkmyDThRnF2sJh/tbnpm1ksJqyLxNLwjSid+smlc=", "mHbeQ");
        lllIIlIlI[lllIIlIll[3]] = llIIIIlIlIII("ZX1IqN7yBwHGFyF04aJOiE3yB9/gx3r8", "tBwcw");
        lllIIlIlI[lllIIlIll[4]] = llIIIIlIlIIl("H/aLtDW5pbAT1GEwgz+rfLISqofjrhXI", "XUPJJ");
        lllIIlIlI[lllIIlIll[6]] = llIIIIlIlIlI("EwRQKTUhQR0hNDcIHi9nNxQAOCstBANkZzcWGTwkLAgeL2cwDlAKEh0oPg8=", "DapHG");
        lllIIlIlI[lllIIlIll[10]] = llIIIIlIlIlI("Hgg9HUokGTseAyMbIA==", "WzRsj");
        lllIIlIlI[lllIIlIll[14]] = llIIIIlIlIII("mRC3qWRtO9YvMiD5tzjXrg==", "AfnqM");
        lllIIlIlI[lllIIlIll[15]] = llIIIIlIlIlI("NCQaIRsQIU46ChAgBz0ICw==", "yMnIi");
        lllIIlIlI[lllIIlIll[18]] = llIIIIlIlIIl("rKsb+Uvfc6g=", "gkEgN");
        lllIIlIlI[lllIIlIll[20]] = llIIIIlIlIII("0KABC0C+JxgFWwDJ6vVl8ZxR8u9xw0AO", "UiNTF");
        lllIIlIlI[lllIIlIll[21]] = llIIIIlIlIIl("/BGdB7IZfyt+tNwis2otCA==", "qyJQv");
        lllIIlIlI[lllIIlIll[22]] = llIIIIlIlIIl("nfanut7HkKQ=", "IEAOn");
        lllIIlIlI[lllIIlIll[23]] = llIIIIlIlIII("3nUFlwWgn00=", "jBFLH");
        lllIIlIlI[lllIIlIll[24]] = llIIIIlIlIIl("qKN39sQZBAk=", "PGSOE");
        lllIIlIlI[lllIIlIll[25]] = llIIIIlIlIIl("xPapaauY45U=", "blzWY");
        lllIIlIlI[lllIIlIll[13]] = llIIIIlIlIII("muV1n1i8IMuBzneKK3KKyQ==", "XSCwQ");
        lllIIlIlI[lllIIlIll[26]] = llIIIIlIlIII("IwNXE05TZ4o=", "HNnks");
        lllIIlIlI[lllIIlIll[29]] = llIIIIlIlIIl("jG4KeHI7hQKAIRt5vlLmcg==", "NoKAt");
        lllIIlIlI[lllIIlIll[30]] = llIIIIlIlIlI("GREKFGEjAAwXKCQCFw==", "PcezA");
        lllIIlIlI[lllIIlIll[31]] = llIIIIlIlIlI("ET0pDzM=", "FTLcW");
        lllIIlIlI[lllIIlIll[19]] = llIIIIlIlIIl("xxke3oigSEQ5BWSbRigx0Q==", "JBYku");
        lllIIlIlI[lllIIlIll[32]] = llIIIIlIlIlI("MDEpEQRDNi8dBQoxLQY=", "cELth");
        lllIIlIlI[lllIIlIll[33]] = llIIIIlIlIIl("p1fDHPTK5M0=", "QDMDv");
        lllIIlIlI[lllIIlIll[35]] = llIIIIlIlIIl("D5J/hitwPq/7T1HIdMHSZ2FBNg1mi/Kz", "LJEhS");
        lllIIlIlI[lllIIlIll[36]] = llIIIIlIlIlI("Iy8WHhcHKkIFBgcrCwIEHA==", "nFbve");
        lllIIlIlI[lllIIlIll[37]] = llIIIIlIlIII("BYBqMhBsdsQ=", "tPGzM");
        lllIIlIlI[lllIIlIll[38]] = llIIIIlIlIII("TRUlk4eJuMs=", "RWajL");
        lllIIlIlI[lllIIlIll[39]] = llIIIIlIlIII("8LPGFL5DYts=", "upjwe");
        lllIIlIlI[lllIIlIll[41]] = llIIIIlIlIlI("HxwLCA==", "HyjzC");
        lllIIlIlI[lllIIlIll[43]] = llIIIIlIlIIl("St/LvPMKpxM=", "LTzzO");
        lllIIlIlI[lllIIlIll[34]] = llIIIIlIlIII("B4/hC38Kx3Q=", "zMHZt");
        lllIIlIlI[lllIIlIll[46]] = llIIIIlIlIII("zFB51O7Pn58=", "tyuPG");
        lllIIlIlI[lllIIlIll[48]] = llIIIIlIlIII("EGATN4TynKA=", "xYGkJ");
        lllIIlIlI[lllIIlIll[50]] = llIIIIlIlIII("sutPIxincjM=", "qbwEr");
        lllIIlIlI[lllIIlIll[57]] = llIIIIlIlIII("BvT0sFD5cXY=", "FKnNS");
        lllIIlIlI[lllIIlIll[58]] = llIIIIlIlIII("X4cgB2jz0vo=", "EVdZp");
    }

    private static boolean llIIIIllIllI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0082, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bc, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f6, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0130, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x016a, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a4, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0222, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x025c, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0296, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x02d0, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x030a, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0344, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x037e, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L10;
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
        if (llIIIIllIIll(Skills.getLevel(Skill.ATTACK), lllIIlIll[2])) {
            int[] iArr = new int[lllIIlIll[1]];
            iArr[lllIIlIll[0]] = lllIIlIll[17];
            if (llIIIIllIIII(Equipment.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIlIll[1]];
                iArr2[lllIIlIll[0]] = lllIIlIll[17];
            }
            int[] iArr3 = new int[lllIIlIll[1]];
            iArr3[lllIIlIll[0]] = lllIIlIll[42];
            if (llIIIIllIIII(Equipment.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lllIIlIll[1]];
                iArr4[lllIIlIll[0]] = lllIIlIll[42];
            }
            int[] iArr5 = new int[lllIIlIll[1]];
            iArr5[lllIIlIll[0]] = lllIIlIll[44];
            if (llIIIIllIIII(Equipment.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIIlIll[1]];
                iArr6[lllIIlIll[0]] = lllIIlIll[44];
            }
            int[] iArr7 = new int[lllIIlIll[1]];
            iArr7[lllIIlIll[0]] = lllIIlIll[40];
            if (llIIIIllIIII(Equipment.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIIlIll[1]];
                iArr8[lllIIlIll[0]] = lllIIlIll[40];
            }
            int[] iArr9 = new int[lllIIlIll[1]];
            iArr9[lllIIlIll[0]] = lllIIlIll[45];
            if (llIIIIllIIII(Equipment.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lllIIlIll[1]];
                iArr10[lllIIlIll[0]] = lllIIlIll[45];
            }
            int[] iArr11 = new int[lllIIlIll[1]];
            iArr11[lllIIlIll[0]] = lllIIlIll[47];
            if (llIIIIllIIII(Equipment.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lllIIlIll[1]];
                iArr12[lllIIlIll[0]] = lllIIlIll[47];
            }
            int[] iArr13 = new int[lllIIlIll[1]];
            iArr13[lllIIlIll[0]] = lllIIlIll[49];
            if (llIIIIllIIII(Equipment.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[lllIIlIll[1]];
                iArr14[lllIIlIll[0]] = lllIIlIll[49];
            }
            int[] iArr15 = new int[lllIIlIll[1]];
            iArr15[lllIIlIll[0]] = lllIIlIll[11];
            if (llIIIIlIlllI(Inventory.contains(iArr15) ? 1 : 0)) {
                ?? r0 = lllIIlIll[1];
                "".length();
                return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lllIIlIll[0];
        }
        int[] iArr16 = new int[lllIIlIll[1]];
        iArr16[lllIIlIll[0]] = lllIIlIll[16];
        if (llIIIIllIIII(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lllIIlIll[1]];
            iArr17[lllIIlIll[0]] = lllIIlIll[16];
        }
        int[] iArr18 = new int[lllIIlIll[1]];
        iArr18[lllIIlIll[0]] = lllIIlIll[42];
        if (llIIIIllIIII(Equipment.contains(iArr18) ? 1 : 0)) {
            int[] iArr19 = new int[lllIIlIll[1]];
            iArr19[lllIIlIll[0]] = lllIIlIll[42];
        }
        int[] iArr20 = new int[lllIIlIll[1]];
        iArr20[lllIIlIll[0]] = lllIIlIll[44];
        if (llIIIIllIIII(Equipment.contains(iArr20) ? 1 : 0)) {
            int[] iArr21 = new int[lllIIlIll[1]];
            iArr21[lllIIlIll[0]] = lllIIlIll[44];
        }
        int[] iArr22 = new int[lllIIlIll[1]];
        iArr22[lllIIlIll[0]] = lllIIlIll[40];
        if (llIIIIllIIII(Equipment.contains(iArr22) ? 1 : 0)) {
            int[] iArr23 = new int[lllIIlIll[1]];
            iArr23[lllIIlIll[0]] = lllIIlIll[40];
        }
        int[] iArr24 = new int[lllIIlIll[1]];
        iArr24[lllIIlIll[0]] = lllIIlIll[45];
        if (llIIIIllIIII(Equipment.contains(iArr24) ? 1 : 0)) {
            int[] iArr25 = new int[lllIIlIll[1]];
            iArr25[lllIIlIll[0]] = lllIIlIll[45];
        }
        int[] iArr26 = new int[lllIIlIll[1]];
        iArr26[lllIIlIll[0]] = lllIIlIll[47];
        if (llIIIIllIIII(Equipment.contains(iArr26) ? 1 : 0)) {
            int[] iArr27 = new int[lllIIlIll[1]];
            iArr27[lllIIlIll[0]] = lllIIlIll[47];
        }
        int[] iArr28 = new int[lllIIlIll[1]];
        iArr28[lllIIlIll[0]] = lllIIlIll[49];
        if (llIIIIllIIII(Equipment.contains(iArr28) ? 1 : 0)) {
            int[] iArr29 = new int[lllIIlIll[1]];
            iArr29[lllIIlIll[0]] = lllIIlIll[49];
        }
        int[] iArr30 = new int[lllIIlIll[1]];
        iArr30[lllIIlIll[0]] = lllIIlIll[11];
        if (llIIIIlIlllI(Inventory.contains(iArr30) ? 1 : 0)) {
            ?? r02 = lllIIlIll[1];
            "".length();
            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
        }
        return lllIIlIll[0];
    }

    private static boolean llIIIIllIIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllIIlIll[0];
    }

    public static void am() {
        if (llIIIIllIIII(cO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIIlIlI[lllIIlIll[20]];
            Movement.walkTo(cm);
            "".length();
            Time.sleepTicks(lllIIlIll[1]);
            "".length();
        }
        if (llIIIIlIlllI(cO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderGWD.c = lllIIlIlI[lllIIlIll[21]];
            if (llIIIIllIlIl(Players.getLocal().getInteracting())) {
                NPC nearest = NPCs.getNearest(npc -> {
                    if (llIIIIlIlllI(npc.getName().contains(lllIIlIlI[lllIIlIll[58]]) ? 1 : 0) && llIIIIllIlIl(npc.getInteracting()) && llIIIIllIIII(npc.isDead() ? 1 : 0)) {
                        ?? r0 = lllIIlIll[1];
                        "".length();
                        return (-(190 ^ 186)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lllIIlIll[0];
                });
                String[] strArr = new String[lllIIlIll[3]];
                strArr[lllIIlIll[0]] = lllIIlIlI[lllIIlIll[22]];
                strArr[lllIIlIll[1]] = lllIIlIlI[lllIIlIll[23]];
                List list = (List) NPCs.getAll(strArr).stream().filter(npc2 -> {
                    if (llIIIIllIlll(npc2.getInteracting(), Players.getLocal())) {
                        ?? r0 = lllIIlIll[1];
                        "".length();
                        return (((156 ^ 186) ^ (50 ^ 79)) & (((((157 + 85) - 229) + 183) ^ (((15 + 132) - 115) + 127)) ^ (-" ".length()))) > (((50 ^ 91) ^ (80 ^ 25)) & (((((181 + 82) - 201) + 126) ^ (((72 + 29) - (-43)) + 12)) ^ (-" ".length()))) ? ((((151 + 155) - 198) + 61) ^ (((120 + 173) - 252) + 138)) & (((((102 + 64) - 83) + 51) ^ (((76 + 23) - (-16)) + 41)) ^ (-" ".length())) : r0;
                    }
                    return lllIIlIll[0];
                }).collect(Collectors.toList());
                if (llIIIIllIIII(list.isEmpty() ? 1 : 0)) {
                    ((NPC) list.get(lllIIlIll[0])).interact(lllIIlIlI[lllIIlIll[24]]);
                    Time.sleepTicks(lllIIlIll[3]);
                    "".length();
                }
                if (llIIIIllIIIl(nearest) && llIIIIllIIII(Players.getLocal().isMoving() ? 1 : 0) && llIIIIlIlllI(list.isEmpty() ? 1 : 0)) {
                    nearest.interact(lllIIlIlI[lllIIlIll[25]]);
                    Time.sleepTicks(lllIIlIll[3]);
                    "".length();
                }
            }
            if (llIIIIllIIIl(Players.getLocal().getInteracting())) {
                Time.sleepTicks(lllIIlIll[6]);
                "".length();
            }
        }
    }

    private static int llIIIIlIllIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public static void aO() {
        if (llIIIIlIllll(Skills.getLevel(Skill.DEFENCE), lllIIlIll[2])) {
            Combat.setAttackStyle(Combat.AttackStyle.FOURTH);
        }
    }

    public static void aL() {
        if (llIIIIllIllI(Static.getClient().getVar(lllIIlIll[22]), lllIIlIll[1])) {
            Static.getClient().invokeMenuAction(lllIIlIlI[lllIIlIll[13]], lllIIlIlI[lllIIlIll[26]], lllIIlIll[1], MenuAction.CC_OP.getId(), lllIIlIll[27], lllIIlIll[28]);
        }
        if (llIIIIlIllll(Skills.getLevel(Skill.ATTACK), lllIIlIll[10])) {
            String[] strArr = new String[lllIIlIll[1]];
            strArr[lllIIlIll[0]] = lllIIlIlI[lllIIlIll[29]];
            if (llIIIIlIlllI(Inventory.contains(strArr) ? 1 : 0)) {
                String[] strArr2 = new String[lllIIlIll[1]];
                strArr2[lllIIlIll[0]] = lllIIlIlI[lllIIlIll[30]];
                Inventory.getFirst(strArr2).interact(lllIIlIlI[lllIIlIll[31]]);
            }
        }
        if (llIIIIllIIll(Skills.getLevel(Skill.ATTACK), lllIIlIll[10]) && llIIIIlIllll(Skills.getLevel(Skill.ATTACK), lllIIlIll[19])) {
            String[] strArr3 = new String[lllIIlIll[1]];
            strArr3[lllIIlIll[0]] = lllIIlIlI[lllIIlIll[19]];
            if (llIIIIlIlllI(Inventory.contains(strArr3) ? 1 : 0)) {
                String[] strArr4 = new String[lllIIlIll[1]];
                strArr4[lllIIlIll[0]] = lllIIlIlI[lllIIlIll[32]];
                Inventory.getFirst(strArr4).interact(lllIIlIlI[lllIIlIll[33]]);
            }
        }
        if (llIIIIllIIll(Skills.getLevel(Skill.ATTACK), lllIIlIll[19]) && llIIIIlIllll(Skills.getLevel(Skill.ATTACK), lllIIlIll[34])) {
            String[] strArr5 = new String[lllIIlIll[1]];
            strArr5[lllIIlIll[0]] = lllIIlIlI[lllIIlIll[35]];
            if (llIIIIlIlllI(Inventory.contains(strArr5) ? 1 : 0)) {
                String[] strArr6 = new String[lllIIlIll[1]];
                strArr6[lllIIlIll[0]] = lllIIlIlI[lllIIlIll[36]];
                Inventory.getFirst(strArr6).interact(lllIIlIlI[lllIIlIll[37]]);
            }
        }
        if (llIIIIllIIll(Skills.getLevel(Skill.ATTACK), lllIIlIll[34]) && llIIIIlIllll(Skills.getLevel(Skill.ATTACK), lllIIlIll[2])) {
            int[] iArr = new int[lllIIlIll[1]];
            iArr[lllIIlIll[0]] = lllIIlIll[16];
            if (llIIIIlIlllI(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lllIIlIll[1]];
                iArr2[lllIIlIll[0]] = lllIIlIll[16];
                Inventory.getFirst(iArr2).interact(lllIIlIlI[lllIIlIll[38]]);
            }
        }
        if (llIIIIllIIll(Skills.getLevel(Skill.ATTACK), lllIIlIll[2])) {
            int[] iArr3 = new int[lllIIlIll[1]];
            iArr3[lllIIlIll[0]] = lllIIlIll[17];
            if (llIIIIlIlllI(Inventory.contains(iArr3) ? 1 : 0)) {
                int[] iArr4 = new int[lllIIlIll[1]];
                iArr4[lllIIlIll[0]] = lllIIlIll[17];
                Inventory.getFirst(iArr4).interact(lllIIlIlI[lllIIlIll[39]]);
            }
        }
        if (llIIIIllIIll(Skills.getLevel(Skill.DEFENCE), lllIIlIll[34])) {
            int[] iArr5 = new int[lllIIlIll[1]];
            iArr5[lllIIlIll[0]] = lllIIlIll[40];
            if (llIIIIlIlllI(Inventory.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lllIIlIll[1]];
                iArr6[lllIIlIll[0]] = lllIIlIll[40];
                Inventory.getFirst(iArr6).interact(lllIIlIlI[lllIIlIll[41]]);
            }
            int[] iArr7 = new int[lllIIlIll[1]];
            iArr7[lllIIlIll[0]] = lllIIlIll[42];
            if (llIIIIlIlllI(Inventory.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lllIIlIll[1]];
                iArr8[lllIIlIll[0]] = lllIIlIll[42];
                Inventory.getFirst(iArr8).interact(lllIIlIlI[lllIIlIll[43]]);
            }
            int[] iArr9 = new int[lllIIlIll[1]];
            iArr9[lllIIlIll[0]] = lllIIlIll[44];
            if (llIIIIlIlllI(Inventory.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lllIIlIll[1]];
                iArr10[lllIIlIll[0]] = lllIIlIll[44];
                Inventory.getFirst(iArr10).interact(lllIIlIlI[lllIIlIll[34]]);
            }
            int[] iArr11 = new int[lllIIlIll[1]];
            iArr11[lllIIlIll[0]] = lllIIlIll[45];
            if (llIIIIlIlllI(Inventory.contains(iArr11) ? 1 : 0)) {
                int[] iArr12 = new int[lllIIlIll[1]];
                iArr12[lllIIlIll[0]] = lllIIlIll[45];
                Inventory.getFirst(iArr12).interact(lllIIlIlI[lllIIlIll[46]]);
            }
        }
        int[] iArr13 = new int[lllIIlIll[1]];
        iArr13[lllIIlIll[0]] = lllIIlIll[47];
        if (llIIIIlIlllI(Inventory.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lllIIlIll[1]];
            iArr14[lllIIlIll[0]] = lllIIlIll[47];
            Inventory.getFirst(iArr14).interact(lllIIlIlI[lllIIlIll[48]]);
        }
        int[] iArr15 = new int[lllIIlIll[1]];
        iArr15[lllIIlIll[0]] = lllIIlIll[49];
        if (llIIIIlIlllI(Inventory.contains(iArr15) ? 1 : 0)) {
            int[] iArr16 = new int[lllIIlIll[1]];
            iArr16[lllIIlIll[0]] = lllIIlIll[49];
            Inventory.getFirst(iArr16).interact(lllIIlIlI[lllIIlIll[50]]);
        }
    }

    private static String llIIIIlIlIII(String lllIllllIIIll, String lllIllllIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIllllIIIlI.getBytes(StandardCharsets.UTF_8)), lllIIlIll[18]), "DES");
            Cipher lllIllllIIlIl = Cipher.getInstance("DES");
            lllIllllIIlIl.init(lllIIlIll[3], secretKeySpec);
            return new String(lllIllllIIlIl.doFinal(Base64.getDecoder().decode(lllIllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIllllIIlII) {
            lllIllllIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllIIlI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (llIIIIllIIll(Skills.getLevel(Skill.DEFENCE), lllIIlIll[2])) {
            ?? r0 = lllIIlIll[1];
            "".length();
            return (-" ".length()) > (((38 ^ 77) ^ (55 ^ 116)) & (((57 ^ 50) ^ (117 ^ 86)) ^ (-" ".length()))) ? ((((40 + 35) - (-3)) + 88) ^ (((40 + 65) - (-34)) + 15)) & (((90 ^ 28) ^ (249 ^ 131)) ^ (-" ".length())) : r0;
        }
        return lllIIlIll[0];
    }

    private static boolean llIIIIllIlII(int i) {
        return i < 0;
    }

    private static boolean llIIIIllIIII(int i) {
        return i == 0;
    }

    private static boolean llIIIIllIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        llIIIIlIllII();
        llIIIIlIlIll();
        bx = new ArrayList();
        int[] iArr = new int[lllIIlIll[18]];
        iArr[lllIIlIll[0]] = lllIIlIll[16];
        iArr[lllIIlIll[1]] = lllIIlIll[17];
        iArr[lllIIlIll[3]] = lllIIlIll[42];
        iArr[lllIIlIll[4]] = lllIIlIll[44];
        iArr[lllIIlIll[6]] = lllIIlIll[40];
        iArr[lllIIlIll[10]] = lllIIlIll[45];
        iArr[lllIIlIll[14]] = lllIIlIll[47];
        iArr[lllIIlIll[15]] = lllIIlIll[49];
        cM = iArr;
        cN = new WorldArea(lllIIlIll[59], lllIIlIll[60], lllIIlIll[22], lllIIlIll[22], lllIIlIll[0]);
        cO = new WorldArea(lllIIlIll[61], lllIIlIll[62], lllIIlIll[32], lllIIlIll[26], lllIIlIll[0]);
        cP = new WorldArea(lllIIlIll[63], lllIIlIll[64], lllIIlIll[65], lllIIlIll[34], lllIIlIll[0]);
        cQ = new WorldPoint(lllIIlIll[66], lllIIlIll[67], lllIIlIll[0]);
        cm = new WorldPoint(lllIIlIll[68], lllIIlIll[60], lllIIlIll[0]);
        cR = new WorldPoint(lllIIlIll[69], lllIIlIll[70], lllIIlIll[0]);
    }

    private static boolean llIIIIlIlllI(int i) {
        return i != 0;
    }

    private static void llIIIIlIllII() {
        lllIIlIll = new int[72];
        lllIIlIll[0] = ((250 ^ 159) ^ (53 ^ 7)) & (((((47 + 39) - (-48)) + 17) ^ (((91 + 147) - 88) + 42)) ^ (-" ".length()));
        lllIIlIll[1] = " ".length();
        lllIIlIll[2] = 113 ^ 89;
        lllIIlIll[3] = "  ".length();
        lllIIlIll[4] = "   ".length();
        lllIIlIll[5] = (-((-4236) & 29951)) & (-1) & 30715;
        lllIIlIll[6] = (211 ^ 144) ^ (50 ^ 117);
        lllIIlIll[7] = (-15381) & 16375;
        lllIIlIll[8] = (-24578) & 25577;
        lllIIlIll[9] = (-17) & 8023;
        lllIIlIll[10] = 84 ^ 81;
        lllIIlIll[11] = (-7813) & 8191;
        lllIIlIll[12] = 247 ^ 147;
        lllIIlIll[13] = 114 ^ 125;
        lllIIlIll[14] = 54 ^ 48;
        lllIIlIll[15] = 25 ^ 30;
        lllIIlIll[16] = (-((-1175) & 14039)) & (-16389) & 30583;
        lllIIlIll[17] = (-((-3157) & 15575)) & (-16905) & 30655;
        lllIIlIll[18] = (48 ^ 126) ^ (128 ^ 198);
        lllIIlIll[19] = 98 ^ 118;
        lllIIlIll[20] = 207 ^ 198;
        lllIIlIll[21] = 118 ^ 124;
        lllIIlIll[22] = 81 ^ 90;
        lllIIlIll[23] = (164 ^ 143) ^ (143 ^ 168);
        lllIIlIll[24] = (156 ^ 139) ^ (135 ^ 157);
        lllIIlIll[25] = 11 ^ 5;
        lllIIlIll[26] = (((94 + 139) - 182) + 108) ^ (((70 + 16) - 15) + 72);
        lllIIlIll[27] = -" ".length();
        lllIIlIll[28] = (-((-514) & 32579)) & (-129) & 38895071;
        lllIIlIll[29] = (((114 + 134) - 139) + 56) ^ (((87 + 19) - 83) + 157);
        lllIIlIll[30] = 32 ^ 50;
        lllIIlIll[31] = 14 ^ 29;
        lllIIlIll[32] = (((199 + 199) - 215) + 25) ^ (((137 + 135) - 110) + 35);
        lllIIlIll[33] = (237 ^ 194) ^ (181 ^ 140);
        lllIIlIll[34] = (105 ^ 119) ^ ((68 ^ 119) & ((18 ^ 33) ^ (-1)));
        lllIIlIll[35] = 47 ^ 56;
        lllIIlIll[36] = 90 ^ 66;
        lllIIlIll[37] = 191 ^ 166;
        lllIIlIll[38] = 110 ^ 116;
        lllIIlIll[39] = 2 ^ 25;
        lllIIlIll[40] = (-16983) & 18143;
        lllIIlIll[41] = 216 ^ 196;
        lllIIlIll[42] = (-18573) & 19695;
        lllIIlIll[43] = 152 ^ 133;
        lllIIlIll[44] = (-27401) & 28473;
        lllIIlIll[45] = (-10769) & 11967;
        lllIIlIll[46] = (236 ^ 165) ^ (59 ^ 109);
        lllIIlIll[47] = (-12309) & 14012;
        lllIIlIll[48] = ((25 ^ 18) & ((96 ^ 107) ^ (-1))) ^ (228 ^ 196);
        lllIIlIll[49] = (-((-333) & 20941)) & (-9) & 31742;
        lllIIlIll[50] = 140 ^ 173;
        lllIIlIll[51] = (-20508) & 21407;
        lllIIlIll[52] = (-((-2139) & 26719)) & (-52) & 32639;
        lllIIlIll[53] = (-((-2089) & 31791)) & (-322) & 65023;
        lllIIlIll[54] = (-((-329) & 3913)) & (-68) & 28651;
        lllIIlIll[55] = (-21515) & 22014;
        lllIIlIll[56] = (-((-10777) & 28222)) & (-259) & 32703;
        lllIIlIll[57] = 178 ^ 144;
        lllIIlIll[58] = 70 ^ 101;
        lllIIlIll[59] = (-25377) & 28601;
        lllIIlIll[60] = (-12293) & 15582;
        lllIIlIll[61] = (-13075) & 16318;
        lllIIlIll[62] = (-13058) & 16337;
        lllIIlIll[63] = (-((-10345) & 31727)) & (-8201) & 32767;
        lllIIlIll[64] = (-((-18645) & 19445)) & (-20609) & 24575;
        lllIIlIll[65] = 54 ^ 6;
        lllIIlIll[66] = (-21363) & 24575;
        lllIIlIll[67] = (-13203) & 16383;
        lllIIlIll[68] = (-((-20529) & 29306)) & (-4097) & 16127;
        lllIIlIll[69] = (-((-13851) & 14139)) & (-16449) & 19967;
        lllIIlIll[70] = (-4629) & 7924;
        lllIIlIll[71] = (126 ^ 93) ^ (146 ^ 149);
    }

    private static boolean llIIIIllIlIl(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIllIIll(int i, int i2) {
        return i >= i2;
    }

    public static void Q() {
        int[] iArr = new int[lllIIlIll[1]];
        iArr[lllIIlIll[0]] = lllIIlIll[9];
        if (llIIIIllIIII(Bank.contains(iArr) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIll[9], lllIIlIll[2], lllIIlIll[51]));
            "".length();
        }
        int[] iArr2 = new int[lllIIlIll[1]];
        iArr2[lllIIlIll[0]] = lllIIlIll[52];
        if (llIIIIllIIII(Bank.contains(iArr2) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIll[52], lllIIlIll[10], lllIIlIll[51]));
            "".length();
        }
        int[] iArr3 = new int[lllIIlIll[1]];
        iArr3[lllIIlIll[0]] = lllIIlIll[49];
        if (llIIIIllIIII(Bank.contains(iArr3) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIll[49], lllIIlIll[1], lllIIlIll[53]));
            "".length();
        }
        int[] iArr4 = new int[lllIIlIll[1]];
        iArr4[lllIIlIll[0]] = lllIIlIll[47];
        if (llIIIIllIIII(Bank.contains(iArr4) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIll[47], lllIIlIll[1], lllIIlIll[54]));
            "".length();
        }
        int[] iArr5 = new int[lllIIlIll[1]];
        iArr5[lllIIlIll[0]] = lllIIlIll[11];
        if (llIIIIllIIII(Bank.contains(iArr5) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIll[11], lllIIlIll[12], lllIIlIll[55]));
            "".length();
        }
        int[] iArr6 = new int[lllIIlIll[1]];
        iArr6[lllIIlIll[0]] = lllIIlIll[40];
        if (llIIIIllIIII(Bank.contains(iArr6) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIll[40], lllIIlIll[1], lllIIlIll[56]));
            "".length();
        }
        int[] iArr7 = new int[lllIIlIll[1]];
        iArr7[lllIIlIll[0]] = lllIIlIll[44];
        if (llIIIIllIIII(Bank.contains(iArr7) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIll[44], lllIIlIll[1], lllIIlIll[56]));
            "".length();
        }
        int[] iArr8 = new int[lllIIlIll[1]];
        iArr8[lllIIlIll[0]] = lllIIlIll[45];
        if (llIIIIllIIII(Bank.contains(iArr8) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIll[45], lllIIlIll[1], lllIIlIll[56]));
            "".length();
        }
        int[] iArr9 = new int[lllIIlIll[1]];
        iArr9[lllIIlIll[0]] = lllIIlIll[42];
        if (llIIIIllIIII(Bank.contains(iArr9) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIll[42], lllIIlIll[1], lllIIlIll[56]));
            "".length();
        }
        if (llIIIIllIIll(Skills.getLevel(Skill.ATTACK), lllIIlIll[2])) {
            int[] iArr10 = new int[lllIIlIll[1]];
            iArr10[lllIIlIll[0]] = lllIIlIll[17];
            if (llIIIIllIIII(Bank.contains(iArr10) ? 1 : 0)) {
                bx.add(new C0003d(lllIIlIll[17], lllIIlIll[1], lllIIlIll[54]));
                "".length();
            }
        }
        int[] iArr11 = new int[lllIIlIll[1]];
        iArr11[lllIIlIll[0]] = lllIIlIll[16];
        if (llIIIIllIIII(Bank.contains(iArr11) ? 1 : 0)) {
            bx.add(new C0003d(lllIIlIll[16], lllIIlIll[1], lllIIlIll[56]));
            "".length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0252, code lost:
        if (llIIIIlIlllI(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aJ() {
        if (llIIIIlIlllI(bv ? 1 : 0)) {
            AccBuilderGWD.c = lllIIlIlI[lllIIlIll[0]];
            C0001b.a(bx);
            if (llIIIIlIllll(bx.size(), lllIIlIll[1])) {
                System.out.println(lllIIlIlI[lllIIlIll[1]]);
                bv = lllIIlIll[0];
            }
        }
        if (llIIIIllIIII(bv ? 1 : 0)) {
            if (llIIIIllIIII(aM() ? 1 : 0) && llIIIIlIllll(Skills.getLevel(Skill.DEFENCE), lllIIlIll[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIIIllIIIl(nearest) && llIIIIllIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIlIlI[lllIIlIll[3]];
                    C0000a.a(nearest);
                }
                if (llIIIIllIIIl(nearest) && llIIIIlIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIIlIlI[lllIIlIll[4]];
                    if (llIIIIllIIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIIlIll[5]);
                        "".length();
                    }
                    if (llIIIIlIlllI(Bank.isOpen() ? 1 : 0)) {
                        if (llIIIIllIIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIIlIll[1]);
                            "".length();
                        }
                        if (llIIIIllIIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIIlIll[3]);
                            "".length();
                        }
                        if (llIIIIllIIII(aN() ? 1 : 0)) {
                            Q();
                            System.out.println(lllIIlIlI[lllIIlIll[6]]);
                            bv = lllIIlIll[1];
                            return;
                        }
                        C0000a.a(cM, lllIIlIll[1]);
                        C0000a.a(lllIIlIll[7], lllIIlIll[8]);
                        C0000a.b(C0005f.bc, lllIIlIll[1]);
                        C0000a.a(lllIIlIll[9], lllIIlIll[10]);
                        C0000a.a(lllIIlIll[11], lllIIlIll[12]);
                    }
                }
            }
            if (llIIIIlIlllI(aM() ? 1 : 0)) {
                aL();
                if (llIIIIllIIll(Movement.getRunEnergy(), lllIIlIll[13]) && llIIIIllIIII(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                String[] strArr = new String[lllIIlIll[1]];
                strArr[lllIIlIll[0]] = lllIIlIlI[lllIIlIll[10]];
                if (llIIIIllIIII(Equipment.contains(strArr) ? 1 : 0)) {
                    String[] strArr2 = new String[lllIIlIll[1]];
                    strArr2[lllIIlIll[0]] = lllIIlIlI[lllIIlIll[14]];
                    if (llIIIIllIIII(Equipment.contains(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[lllIIlIll[1]];
                        strArr3[lllIIlIll[0]] = lllIIlIlI[lllIIlIll[15]];
                        if (llIIIIllIIII(Equipment.contains(strArr3) ? 1 : 0)) {
                            int[] iArr = new int[lllIIlIll[1]];
                            iArr[lllIIlIll[0]] = lllIIlIll[16];
                            if (llIIIIllIIII(Equipment.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lllIIlIll[1]];
                                iArr2[lllIIlIll[0]] = lllIIlIll[17];
                            }
                        }
                    }
                }
                aO();
                if (llIIIIllIlII(llIIIIlIllIl(C0004e.w(), 45.0d))) {
                    int[] iArr3 = new int[lllIIlIll[1]];
                    iArr3[lllIIlIll[0]] = lllIIlIll[11];
                    if (llIIIIlIlllI(Inventory.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lllIIlIll[1]];
                        iArr4[lllIIlIll[0]] = lllIIlIll[11];
                        Inventory.getFirst(iArr4).interact(lllIIlIlI[lllIIlIll[18]]);
                        Time.sleepTicks(lllIIlIll[1]);
                        "".length();
                    }
                }
                if (llIIIIllIIll(Skills.getLevel(Skill.ATTACK), lllIIlIll[19]) && llIIIIllIIll(Skills.getLevel(Skill.STRENGTH), lllIIlIll[19])) {
                    C0015p.al();
                }
            }
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            aJ();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (210 ^ 194) & ((174 ^ 190) ^ (-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lllIIlIll[0];
    }

    private static String llIIIIlIlIlI(String lllIlllIlIIll, String lllIlllIlIIlI) {
        String str = new String(Base64.getDecoder().decode(lllIlllIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlllIlIIIl = new StringBuilder();
        char[] lllIlllIlIIII = lllIlllIlIIlI.toCharArray();
        int lllIlllIIllll = lllIIlIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIlIll[0];
        while (llIIIIlIllll(i, length)) {
            lllIlllIlIIIl.append((char) (charArray[i] ^ lllIlllIlIIII[lllIlllIIllll % lllIlllIlIIII.length]));
            "".length();
            lllIlllIIllll++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllIlllIlIIIl);
    }

    private static boolean llIIIIlIllll(int i, int i2) {
        return i < i2;
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllIIlIlI[lllIIlIll[57]];
    }
}
