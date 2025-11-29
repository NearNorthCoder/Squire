package p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r;

import gg.squire.account.AccBuilderBarrows;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.P  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/P.class */
public class P implements F {
    public static final /* synthetic */ WorldArea jn;
    public static final /* synthetic */ int jk;
    public static /* synthetic */ List<C0003d> bB;
    public static /* synthetic */ int[] iZ;
    private static /* synthetic */ int[] lllIllIl;
    private static /* synthetic */ String[] lllIlIll;
    public static final /* synthetic */ int jm;
    public static final /* synthetic */ int ji;
    public static final /* synthetic */ WorldPoint jp;
    public static /* synthetic */ int[] jr;
    public static /* synthetic */ boolean bz;
    public static final /* synthetic */ int jl;
    public static final /* synthetic */ WorldArea jo;
    public static final /* synthetic */ int jj;
    public static /* synthetic */ int[] jq;

    private static boolean llIIIlIIIlI(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lllIllIl[0];
    }

    private static boolean llIIIlIIIll(int i) {
        return i == 0;
    }

    static {
        llIIIlIIIII();
        llIIIIlllll();
        jj = lllIllIl[8];
        jl = lllIllIl[10];
        jk = lllIllIl[9];
        ji = lllIllIl[7];
        jm = lllIllIl[11];
        jn = new WorldArea(lllIllIl[37], lllIllIl[38], lllIllIl[34], lllIllIl[39], lllIllIl[0]);
        jo = new WorldArea(lllIllIl[40], lllIllIl[41], lllIllIl[22], lllIllIl[34], lllIllIl[0]);
        jp = new WorldPoint(lllIllIl[42], lllIllIl[43], lllIllIl[0]);
        int[] iArr = new int[lllIllIl[6]];
        iArr[lllIllIl[0]] = lllIllIl[44];
        iArr[lllIllIl[1]] = lllIllIl[45];
        iArr[lllIllIl[3]] = lllIllIl[46];
        iArr[lllIllIl[4]] = lllIllIl[47];
        jq = iArr;
        int[] iArr2 = new int[lllIllIl[1]];
        iArr2[lllIllIl[0]] = lllIllIl[48];
        jr = iArr2;
        int[] iArr3 = new int[lllIllIl[4]];
        iArr3[lllIllIl[0]] = lllIllIl[49];
        iArr3[lllIllIl[1]] = lllIllIl[50];
        iArr3[lllIllIl[3]] = lllIllIl[51];
        iZ = iArr3;
        bB = new ArrayList();
    }

    private static boolean llIIIlIIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v77, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [boolean] */
    public static boolean ac() {
        if (llIIIlIIllI(Skills.getLevel(Skill.WOODCUTTING), lllIllIl[23])) {
            int[] iArr = new int[lllIllIl[1]];
            iArr[lllIllIl[0]] = lllIllIl[11];
            if (llIIIlIIlII(Inventory.getCount(iArr))) {
                ?? r0 = lllIllIl[1];
                "".length();
                return "  ".length() <= (-" ".length()) ? ((((53 + 40) - (-35)) + 79) ^ (((75 + 107) - 101) + 52)) & (((105 ^ 53) ^ (146 ^ 132)) ^ (-" ".length())) : r0;
            }
            return lllIllIl[0];
        } else if (llIIIlIIllI(Skills.getLevel(Skill.WOODCUTTING), lllIllIl[24]) && llIIIlIIIlI(Skills.getLevel(Skill.WOODCUTTING), lllIllIl[23])) {
            int[] iArr2 = new int[lllIllIl[1]];
            iArr2[lllIllIl[0]] = lllIllIl[11];
            if (llIIIlIIlII(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lllIllIl[1]];
                iArr3[lllIllIl[0]] = lllIllIl[10];
                if (llIIIlIIlII(Inventory.getCount(iArr3))) {
                    ?? r02 = lllIllIl[1];
                    "".length();
                    return (-" ".length()) > 0 ? ((90 ^ 118) ^ (131 ^ 156)) & (((((88 + 111) - 127) + 64) ^ (((117 + 40) - 3) + 33)) ^ (-" ".length())) : r02;
                }
            }
            return lllIllIl[0];
        } else if (llIIIlIIllI(Skills.getLevel(Skill.WOODCUTTING), lllIllIl[25]) && llIIIlIIIlI(Skills.getLevel(Skill.WOODCUTTING), lllIllIl[24])) {
            int[] iArr4 = new int[lllIllIl[1]];
            iArr4[lllIllIl[0]] = lllIllIl[11];
            if (llIIIlIIlII(Inventory.getCount(iArr4))) {
                int[] iArr5 = new int[lllIllIl[1]];
                iArr5[lllIllIl[0]] = lllIllIl[10];
                if (llIIIlIIlII(Inventory.getCount(iArr5))) {
                    int[] iArr6 = new int[lllIllIl[1]];
                    iArr6[lllIllIl[0]] = lllIllIl[9];
                    if (llIIIlIIlII(Inventory.getCount(iArr6))) {
                        ?? r03 = lllIllIl[1];
                        "".length();
                        return (((73 ^ 114) ^ (141 ^ 138)) & (((223 ^ 196) ^ (3 ^ 36)) ^ (-" ".length()))) >= " ".length() ? ((((107 + 39) - (-5)) + 90) ^ (((62 + 127) - 178) + 188)) & (((((103 + 10) - (-46)) + 26) ^ (((25 + 114) - 7) + 11)) ^ (-" ".length())) : r03;
                    }
                }
            }
            return lllIllIl[0];
        } else if (llIIIlIIllI(Skills.getLevel(Skill.WOODCUTTING), lllIllIl[13]) && llIIIlIIIlI(Skills.getLevel(Skill.WOODCUTTING), lllIllIl[25])) {
            int[] iArr7 = new int[lllIllIl[1]];
            iArr7[lllIllIl[0]] = lllIllIl[11];
            if (llIIIlIIlII(Inventory.getCount(iArr7))) {
                int[] iArr8 = new int[lllIllIl[1]];
                iArr8[lllIllIl[0]] = lllIllIl[10];
                if (llIIIlIIlII(Inventory.getCount(iArr8))) {
                    int[] iArr9 = new int[lllIllIl[1]];
                    iArr9[lllIllIl[0]] = lllIllIl[9];
                    if (llIIIlIIlII(Inventory.getCount(iArr9))) {
                        int[] iArr10 = new int[lllIllIl[1]];
                        iArr10[lllIllIl[0]] = lllIllIl[8];
                        if (llIIIlIIlII(Inventory.getCount(iArr10))) {
                            ?? r04 = lllIllIl[1];
                            "".length();
                            return (((((62 + 218) - 214) + 187) ^ (((20 + 119) - 137) + 165)) & (((121 ^ 37) ^ (13 ^ 11)) ^ (-" ".length()))) != 0 ? ((74 ^ 26) ^ (106 ^ 6)) & (((116 ^ 36) ^ (127 ^ 19)) ^ (-" ".length())) : r04;
                        }
                    }
                }
            }
            return lllIllIl[0];
        } else {
            int[] iArr11 = new int[lllIllIl[1]];
            iArr11[lllIllIl[0]] = lllIllIl[11];
            if (llIIIlIIlII(Inventory.getCount(iArr11))) {
                int[] iArr12 = new int[lllIllIl[1]];
                iArr12[lllIllIl[0]] = lllIllIl[10];
                if (llIIIlIIlII(Inventory.getCount(iArr12))) {
                    int[] iArr13 = new int[lllIllIl[1]];
                    iArr13[lllIllIl[0]] = lllIllIl[9];
                    if (llIIIlIIlII(Inventory.getCount(iArr13))) {
                        int[] iArr14 = new int[lllIllIl[1]];
                        iArr14[lllIllIl[0]] = lllIllIl[8];
                        if (llIIIlIIlII(Inventory.getCount(iArr14))) {
                            int[] iArr15 = new int[lllIllIl[1]];
                            iArr15[lllIllIl[0]] = lllIllIl[7];
                            if (llIIIlIIlII(Inventory.getCount(iArr15))) {
                                ?? r05 = lllIllIl[1];
                                "".length();
                                return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r05;
                            }
                        }
                    }
                }
            }
            return lllIllIl[0];
        }
    }

    private static String llIIIIllIII(String lIIllllIlIlIIIl, String lIIllllIlIlIIII) {
        String lIIllllIlIlIIIl2 = new String(Base64.getDecoder().decode(lIIllllIlIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllllIlIIllll = new StringBuilder();
        char[] lIIllllIlIIlllI = lIIllllIlIlIIII.toCharArray();
        int lIIllllIlIIllIl = lllIllIl[0];
        char[] charArray = lIIllllIlIlIIIl2.toCharArray();
        int length = charArray.length;
        int lIIllllIlIIIlIl = lllIllIl[0];
        while (llIIIlIIIlI(lIIllllIlIIIlIl, length)) {
            char lIIllllIlIlIIlI = charArray[lIIllllIlIIIlIl];
            lIIllllIlIIllll.append((char) (lIIllllIlIlIIlI ^ lIIllllIlIIlllI[lIIllllIlIIllIl % lIIllllIlIIlllI.length]));
            "".length();
            lIIllllIlIIllIl++;
            lIIllllIlIIIlIl++;
            "".length();
            if ((" ".length() & (" ".length() ^ (-" ".length()))) > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lIIllllIlIIllll);
    }

    private static boolean llIIIlIIlII(int i) {
        return i > 0;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lllIlIll[lllIllIl[34]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (llIIIlIIllI(Skills.getLevel(Skill.WOODCUTTING), lllIllIl[35])) {
            ?? r0 = lllIllIl[1];
            "".length();
            return (((((62 + 81) - 6) + 71) ^ (((119 + 46) - 127) + 97)) & (((((48 + 105) - 71) + 68) ^ (((105 + 51) - 153) + 190)) ^ (-" ".length()))) != 0 ? ((245 ^ 172) ^ (25 ^ 110)) & (((141 ^ 178) ^ (53 ^ 36)) ^ (-" ".length())) : r0;
        }
        return lllIllIl[0];
    }

    public static void ag() {
        int[] iArr = new int[lllIllIl[1]];
        iArr[lllIllIl[0]] = lllIllIl[7];
        if (llIIIlIIIll(Bank.contains(iArr) ? 1 : 0)) {
            bB.add(new C0003d(lllIllIl[7], lllIllIl[1], lllIllIl[5]));
            "".length();
        }
        int[] iArr2 = new int[lllIllIl[1]];
        iArr2[lllIllIl[0]] = lllIllIl[8];
        if (llIIIlIIIll(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(lllIllIl[8], lllIllIl[1], lllIllIl[5]));
            "".length();
        }
        int[] iArr3 = new int[lllIllIl[1]];
        iArr3[lllIllIl[0]] = lllIllIl[9];
        if (llIIIlIIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(lllIllIl[9], lllIllIl[1], lllIllIl[26]));
            "".length();
        }
        int[] iArr4 = new int[lllIllIl[1]];
        iArr4[lllIllIl[0]] = lllIllIl[10];
        if (llIIIlIIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(lllIllIl[10], lllIllIl[1], lllIllIl[27]));
            "".length();
        }
        int[] iArr5 = new int[lllIllIl[1]];
        iArr5[lllIllIl[0]] = lllIllIl[11];
        if (llIIIlIIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bB.add(new C0003d(lllIllIl[11], lllIllIl[1], lllIllIl[28]));
            "".length();
        }
        if (llIIIlIIIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lllIlIll[lllIllIl[36]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(lllIllIl[29], lllIllIl[12], lllIllIl[28]));
            "".length();
        }
        int[] iArr6 = new int[lllIllIl[1]];
        iArr6[lllIllIl[0]] = lllIllIl[30];
        if (llIIIlIIIll(Bank.contains(iArr6) ? 1 : 0)) {
            bB.add(new C0003d(lllIllIl[30], lllIllIl[31], lllIllIl[32]));
            "".length();
        }
    }

    private static void llIIIIlllll() {
        lllIlIll = new String[lllIllIl[52]];
        lllIlIll[lllIllIl[0]] = llIIIIllIII("Ey88Ixk2eiw+Ejwp", "QZEJw");
        lllIlIll[lllIllIl[1]] = llIIIIllIIl("q/ix0Dm6ZtNkE8WT6erpBe2bBQzSYh+cxCxvJCl+AtosYlpmZIX91puUvnWtpkcnRRWbecw4GHE=", "AFAJs");
        lllIlIll[lllIllIl[3]] = llIIIIllIIl("io+182nxGLsIC0ikbAut6XM4wW+Jv6Oy", "hONWa");
        lllIlIll[lllIllIl[4]] = llIIIIllIII("LCYOBTwNMUsJNA09", "cVkkU");
        lllIlIll[lllIllIl[6]] = llIIIIllIII("JDkIEAIFNgFUDA02DR0ACw==", "lXftn");
        lllIlIll[lllIllIl[12]] = llIIIIllIlI("dYSVXMKSWHXOrPBKydXtjKxrI0OdcV4bkMelXSOY3NengGo9BYu6ztA0G0bgVTBB", "tPbAV");
        lllIlIll[lllIllIl[13]] = llIIIIllIIl("6SaU7VdluC0bXwWlAYMQxA==", "OaGbY");
        lllIlIll[lllIllIl[14]] = llIIIIllIII("PBMnCAcRDy9YGxcGOw==", "xaHxw");
        lllIlIll[lllIllIl[16]] = llIIIIllIIl("R+/BsSLQAho3OF2OFmAqPZDS8Tcxs2O9", "voYYK");
        lllIlIll[lllIllIl[17]] = llIIIIllIII("Ig8BFh8ICQk=", "agnfo");
        lllIlIll[lllIllIl[18]] = llIIIIllIII("Ow4bPgERCBNuHRcBBw==", "xftNq");
        lllIlIll[lllIllIl[19]] = llIIIIllIII("MQ8EJHAWCBw6", "rgkTP");
        lllIlIll[lllIllIl[20]] = llIIIIllIIl("ho6rZlGJFCjRSoYdpfb5hwm9pinui3nh", "pRsUk");
        lllIlIll[lllIllIl[21]] = llIIIIllIlI("/11QXEGvjyKQ9hsnND9D+g==", "fyTTn");
        lllIlIll[lllIllIl[22]] = llIIIIllIlI("NpEZMpIOgB4oMIoC+cXl9B3+btDFZuRc", "LMZKU");
        lllIlIll[lllIllIl[15]] = llIIIIllIII("MQkaHm8WDgIA", "raunO");
        lllIlIll[lllIllIl[34]] = llIIIIllIlI("vdGwC8djfVaTPduAfysfsg==", "vCBKm");
        lllIlIll[lllIllIl[36]] = llIIIIllIIl("RTNN8QqPbmYJZMr2ILPI4zoZ5VIBfbZh", "IvVTc");
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        dj();
        return lllIllIl[33];
    }

    private static boolean llIIIlIIIIl(int i) {
        return i != 0;
    }

    private static String llIIIIllIlI(String lIIllllIllIlllI, String lIIllllIllIllIl) {
        try {
            SecretKeySpec lIIllllIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllllIllIllIl.getBytes(StandardCharsets.UTF_8)), lllIllIl[16]), "DES");
            Cipher lIIllllIlllIIII = Cipher.getInstance("DES");
            lIIllllIlllIIII.init(lllIllIl[3], lIIllllIlllIIIl);
            return new String(lIIllllIlllIIII.doFinal(Base64.getDecoder().decode(lIIllllIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllllIllIllll) {
            lIIllllIllIllll.printStackTrace();
            return null;
        }
    }

    private static String llIIIIllIIl(String lIIllllIllIIIIl, String lIIllllIllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllllIllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIllIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIllllIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllllIllIIIlI) {
            lIIllllIllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIIllI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0070, code lost:
        if (llIIIlIIlII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017b, code lost:
        if (llIIIlIIllI(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.P.lllIllIl[1]) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ba, code lost:
        if (llIIIlIIllI(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.P.lllIllIl[1]) != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f9, code lost:
        if (llIIIlIIllI(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.P.lllIllIl[1]) != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0238, code lost:
        if (llIIIlIIllI(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.P.lllIllIl[1]) != false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0277, code lost:
        if (llIIIlIIIlI(net.unethicalite.api.items.Inventory.getCount(r0), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.P.lllIllIl[1]) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x027a, code lost:
        ag();
        java.lang.System.out.println(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.P.lllIlIll[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.P.lllIllIl[12]]);
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.P.bz = p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.P.lllIllIl[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0295, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v251, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void dj() {
        if (llIIIlIIIIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lllIlIll[lllIllIl[0]];
            C0001b.a(bB);
            if (llIIIlIIIlI(bB.size(), lllIllIl[1])) {
                System.out.println(lllIlIll[lllIllIl[1]]);
                bz = lllIllIl[0];
            }
        }
        if (llIIIlIIIll(bz ? 1 : 0)) {
            if (llIIIlIIIIl(ac() ? 1 : 0)) {
                int[] iArr = new int[lllIllIl[1]];
                iArr[lllIllIl[0]] = lllIllIl[2];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (llIIIlIIlIl(nearest) && llIIIlIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lllIlIll[lllIllIl[3]];
                C0000a.a(nearest);
            }
            if (llIIIlIIlIl(nearest) && llIIIlIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (llIIIlIIIll(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIlIll[lllIllIl[4]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lllIllIl[5]);
                    "".length();
                }
                if (llIIIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIlIll[lllIllIl[6]];
                    if (llIIIlIIlII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lllIllIl[6]);
                        "".length();
                    }
                    if (llIIIlIIlII(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lllIllIl[3]);
                        "".length();
                    }
                    int[] iArr2 = new int[lllIllIl[1]];
                    iArr2[lllIllIl[0]] = lllIllIl[7];
                    if (llIIIlIIIll(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lllIllIl[1]];
                        iArr3[lllIllIl[0]] = lllIllIl[7];
                    }
                    int[] iArr4 = new int[lllIllIl[1]];
                    iArr4[lllIllIl[0]] = lllIllIl[8];
                    if (llIIIlIIIll(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lllIllIl[1]];
                        iArr5[lllIllIl[0]] = lllIllIl[8];
                    }
                    int[] iArr6 = new int[lllIllIl[1]];
                    iArr6[lllIllIl[0]] = lllIllIl[9];
                    if (llIIIlIIIll(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lllIllIl[1]];
                        iArr7[lllIllIl[0]] = lllIllIl[9];
                    }
                    int[] iArr8 = new int[lllIllIl[1]];
                    iArr8[lllIllIl[0]] = lllIllIl[10];
                    if (llIIIlIIIll(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[lllIllIl[1]];
                        iArr9[lllIllIl[0]] = lllIllIl[10];
                    }
                    int[] iArr10 = new int[lllIllIl[1]];
                    iArr10[lllIllIl[0]] = lllIllIl[11];
                    if (llIIIlIIIll(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lllIllIl[1]];
                        iArr11[lllIllIl[0]] = lllIllIl[11];
                    }
                    int[] iArr12 = new int[lllIllIl[1]];
                    iArr12[lllIllIl[0]] = lllIllIl[7];
                    if (llIIIlIIIIl(Bank.contains(iArr12) ? 1 : 0)) {
                        Bank.withdraw(lllIllIl[7], lllIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIllIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr13 = new int[lllIllIl[1]];
                            iArr13[lllIllIl[0]] = lllIllIl[7];
                            if (llIIIlIIlII(Inventory.getCount(iArr13))) {
                                ?? r0 = lllIllIl[1];
                                "".length();
                                return (-((150 ^ 158) ^ (185 ^ 181))) >= 0 ? ((41 ^ 12) ^ (143 ^ 149)) & (((((146 + 31) - 116) + 111) ^ (((12 + 13) - (-83)) + 39)) ^ (-" ".length())) : r0;
                            }
                            return lllIllIl[0];
                        }, lllIllIl[5]);
                        "".length();
                    }
                    int[] iArr13 = new int[lllIllIl[1]];
                    iArr13[lllIllIl[0]] = lllIllIl[8];
                    if (llIIIlIIIIl(Bank.contains(iArr13) ? 1 : 0)) {
                        Bank.withdraw(lllIllIl[8], lllIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIllIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr14 = new int[lllIllIl[1]];
                            iArr14[lllIllIl[0]] = lllIllIl[8];
                            if (llIIIlIIlII(Inventory.getCount(iArr14))) {
                                ?? r0 = lllIllIl[1];
                                "".length();
                                return "  ".length() == 0 ? ((((12 + 128) - 66) + 57) ^ (((1 + 63) - (-51)) + 34)) & (((64 ^ 7) ^ (62 ^ 111)) ^ (-" ".length())) : r0;
                            }
                            return lllIllIl[0];
                        }, lllIllIl[5]);
                        "".length();
                    }
                    int[] iArr14 = new int[lllIllIl[1]];
                    iArr14[lllIllIl[0]] = lllIllIl[9];
                    if (llIIIlIIIIl(Bank.contains(iArr14) ? 1 : 0)) {
                        Bank.withdraw(lllIllIl[9], lllIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIllIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr15 = new int[lllIllIl[1]];
                            iArr15[lllIllIl[0]] = lllIllIl[9];
                            if (llIIIlIIlII(Inventory.getCount(iArr15))) {
                                ?? r0 = lllIllIl[1];
                                "".length();
                                return "  ".length() <= (((((75 + 144) - 112) + 132) ^ (((67 + 3) - (-34)) + 66)) & (((((11 + 0) - (-35)) + 83) ^ (((192 + 36) - 98) + 66)) ^ (-" ".length()))) ? ((((47 + 52) - 36) + 99) ^ (((63 + 21) - 74) + 169)) & (((((11 + 116) - (-20)) + 13) ^ (((158 + 84) - 165) + 100)) ^ (-" ".length())) : r0;
                            }
                            return lllIllIl[0];
                        }, lllIllIl[5]);
                        "".length();
                    }
                    int[] iArr15 = new int[lllIllIl[1]];
                    iArr15[lllIllIl[0]] = lllIllIl[10];
                    if (llIIIlIIIIl(Bank.contains(iArr15) ? 1 : 0)) {
                        Bank.withdraw(lllIllIl[10], lllIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIllIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[lllIllIl[1]];
                            iArr16[lllIllIl[0]] = lllIllIl[10];
                            if (llIIIlIIlII(Inventory.getCount(iArr16))) {
                                ?? r0 = lllIllIl[1];
                                "".length();
                                return (((58 ^ 41) ^ (246 ^ 165)) & (((((83 + 17) - (-17)) + 18) ^ (((65 + 169) - 221) + 186)) ^ (-" ".length()))) != 0 ? ((7 ^ 48) ^ (119 ^ 79)) & (((((49 + 28) - 20) + 76) ^ (((56 + 86) - 109) + 105)) ^ (-" ".length())) : r0;
                            }
                            return lllIllIl[0];
                        }, lllIllIl[5]);
                        "".length();
                    }
                    int[] iArr16 = new int[lllIllIl[1]];
                    iArr16[lllIllIl[0]] = lllIllIl[11];
                    if (llIIIlIIIIl(Bank.contains(iArr16) ? 1 : 0)) {
                        Bank.withdraw(lllIllIl[11], lllIllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lllIllIl[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr17 = new int[lllIllIl[1]];
                            iArr17[lllIllIl[0]] = lllIllIl[11];
                            if (llIIIlIIlII(Inventory.getCount(iArr17))) {
                                ?? r0 = lllIllIl[1];
                                "".length();
                                return 0 != 0 ? ((51 ^ 81) ^ (12 ^ 42)) & (((((45 + 69) - 77) + 98) ^ (((35 + 134) - 42) + 68)) ^ (-" ".length())) : r0;
                            }
                            return lllIllIl[0];
                        }, lllIllIl[5]);
                        "".length();
                    }
                }
            }
            if (llIIIlIIIIl(ac() ? 1 : 0)) {
                if (llIIIlIIIIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderBarrows.c = lllIlIll[lllIllIl[13]];
                    System.out.println(lllIlIll[lllIllIl[14]]);
                    Inventory.getAll(iZ).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (llIIIlIIIll(Inventory.isFull() ? 1 : 0)) {
                    if (llIIIlIIIlI(Skills.getLevel(Skill.WOODCUTTING), lllIllIl[15])) {
                        if (llIIIlIIIll(jn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = lllIlIll[lllIllIl[16]];
                            Movement.walkTo(jn.toWorldPoint());
                            "".length();
                            Time.sleepTicks(lllIllIl[6]);
                            "".length();
                        }
                        if (llIIIlIIIIl(jn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = lllIlIll[lllIllIl[17]];
                            TileObject nearest2 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), jq);
                            if (llIIIlIIIll(Players.getLocal().isAnimating() ? 1 : 0) && llIIIlIIIll(Players.getLocal().isMoving() ? 1 : 0) && llIIIlIIlIl(nearest2)) {
                                System.out.println(lllIlIll[lllIllIl[18]]);
                                nearest2.interact(lllIlIll[lllIllIl[19]]);
                                Time.sleepTicks(lllIllIl[4]);
                                "".length();
                            }
                        }
                    }
                    if (llIIIlIIllI(Skills.getLevel(Skill.WOODCUTTING), lllIllIl[15])) {
                        if (llIIIlIIIll(jo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = lllIlIll[lllIllIl[20]];
                            Movement.walkTo(jp);
                            "".length();
                            Time.sleepTicks(lllIllIl[6]);
                            "".length();
                        }
                        if (llIIIlIIIIl(jo.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderBarrows.c = lllIlIll[lllIllIl[21]];
                            TileObject nearest3 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), jr);
                            if (llIIIlIIIll(Players.getLocal().isAnimating() ? 1 : 0) && llIIIlIIIll(Players.getLocal().isMoving() ? 1 : 0) && llIIIlIIlIl(nearest3)) {
                                System.out.println(lllIlIll[lllIllIl[22]]);
                                nearest3.interact(lllIlIll[lllIllIl[15]]);
                                Time.sleepTicks(lllIllIl[4]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    private static void llIIIlIIIII() {
        lllIllIl = new int[53];
        lllIllIl[0] = ((166 ^ 176) ^ (127 ^ 101)) & (((((36 + 197) - 93) + 62) ^ (((32 + 29) - 54) + 191)) ^ (-" ".length()));
        lllIllIl[1] = " ".length();
        lllIllIl[2] = (-3085) & 4079;
        lllIllIl[3] = "  ".length();
        lllIllIl[4] = "   ".length();
        lllIllIl[5] = (-27735) & 32734;
        lllIllIl[6] = (((12 + 54) - (-62)) + 6) ^ (((73 + 45) - 73) + 85);
        lllIllIl[7] = (-((-13) & 19133)) & (-8201) & 28671;
        lllIllIl[8] = (-((-16397) & 25151)) & (-2177) & 12283;
        lllIllIl[9] = (-((-3107) & 24247)) & (-8193) & 30687;
        lllIllIl[10] = (-((-25185) & 31347)) & (-1) & 7519;
        lllIllIl[11] = (-26785) & 28143;
        lllIllIl[12] = 153 ^ 156;
        lllIllIl[13] = (((152 + 50) - 59) + 53) ^ (((103 + 113) - 52) + 30);
        lllIllIl[14] = 96 ^ 103;
        lllIllIl[15] = (114 ^ 9) ^ (8 ^ 124);
        lllIllIl[16] = 186 ^ 178;
        lllIllIl[17] = 83 ^ 90;
        lllIllIl[18] = 93 ^ 87;
        lllIllIl[19] = (63 ^ 114) ^ (52 ^ 114);
        lllIllIl[20] = (147 ^ 182) ^ (129 ^ 168);
        lllIllIl[21] = ((214 ^ 182) & ((67 ^ 35) ^ (-1))) ^ (79 ^ 66);
        lllIllIl[22] = (44 ^ 81) ^ (237 ^ 158);
        lllIllIl[23] = (((16 + 104) - (-32)) + 16) ^ (((33 + 81) - 101) + 116);
        lllIllIl[24] = 57 ^ 38;
        lllIllIl[25] = 161 ^ 180;
        lllIllIl[26] = (-19654) & 28653;
        lllIllIl[27] = (-((-10786) & 31291)) & (-259) & 32763;
        lllIllIl[28] = (-3654) & 28653;
        lllIllIl[29] = (-((-209) & 20979)) & (-17) & 32766;
        lllIllIl[30] = (-((-7493) & 32093)) & (-33) & 32639;
        lllIllIl[31] = (((43 + 167) - 183) + 143) ^ (((48 + 100) - 70) + 52);
        lllIllIl[32] = (-((-30723) & 31867)) & (-12289) & 14332;
        lllIllIl[33] = (((174 + 78) - 68) + 56) ^ (((139 + 7) - 87) + 89);
        lllIllIl[34] = 66 ^ 82;
        lllIllIl[35] = (196 ^ 173) ^ (126 ^ 116);
        lllIllIl[36] = 14 ^ 31;
        lllIllIl[37] = (-((-45) & 4525)) & (-8225) & 15861;
        lllIllIl[38] = (-20626) & 23999;
        lllIllIl[39] = (((108 + 93) - 149) + 139) ^ (((4 + 58) - (-36)) + 48);
        lllIllIl[40] = (-((-17971) & 30387)) & (-514) & 16127;
        lllIllIl[41] = (-145) & 3505;
        lllIllIl[42] = (-((-4242) & 12733)) & (-20497) & 32191;
        lllIllIl[43] = (-4697) & 8061;
        lllIllIl[44] = (-11012) & 12287;
        lllIllIl[45] = (-27137) & 28414;
        lllIllIl[46] = (-((-2849) & 31674)) & (-517) & 30623;
        lllIllIl[47] = (-((-16422) & 26879)) & (-21025) & 32767;
        lllIllIl[48] = (-21913) & 32732;
        lllIllIl[49] = (-((-551) & 31279)) & (-529) & 32767;
        lllIllIl[50] = (-12811) & 14331;
        lllIllIl[51] = (-(107 ^ 122)) & (-10241) & 11775;
        lllIllIl[52] = (214 ^ 149) ^ (61 ^ 108);
    }
}
