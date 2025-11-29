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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.au  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/au.class */
public class au implements InterfaceC0003ac {
    private static /* synthetic */ String[] llIlIlllII;
    public static final /* synthetic */ WorldArea ou;
    public static final /* synthetic */ int or;
    public static final /* synthetic */ WorldArea ot;
    public static final /* synthetic */ WorldPoint ov;
    public static final /* synthetic */ int oo;
    public static final /* synthetic */ int os;
    public static final /* synthetic */ int op;
    public static /* synthetic */ int[] ox;
    private static /* synthetic */ int[] llIlIlllIl;
    public static /* synthetic */ int[] ow;
    public static /* synthetic */ int[] oy;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ int oq;
    public static /* synthetic */ List<C0017d> bv;

    private static boolean lIllIlIlIIllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIlIlIIIlI(int i, int i2) {
        return i < i2;
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        gs();
        return llIlIlllIl[34];
    }

    private static String lIllIlIIlllII(String llllllllllllllllllIIIllIIIIllllI, String llllllllllllllllllIIIllIIIIlllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIllIIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIllIIIlIIIII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIllIIIlIIIII.init(llIlIlllIl[4], secretKeySpec);
            return new String(llllllllllllllllllIIIllIIIlIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIllIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIllIIIIlllll) {
            llllllllllllllllllIIIllIIIIlllll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIlIlllIl[0];
    }

    private static void lIllIlIIlllll() {
        llIlIlllII = new String[llIlIlllIl[52]];
        llIlIlllII[llIlIlllIl[0]] = lIllIlIIlllII("DcQiPWH0IE1ROZDdDQJXRQ==", "jjmZV");
        llIlIlllII[llIlIlllIl[1]] = lIllIlIIlllIl("xCCnRBnCkUMgXq5jTGy2Y9ZbXTCZRTJV+/Vtwv2rvzTWJSTQFp3jawVSM8PDs+TNLxFrN1JOkCM=", "tkMyz");
        llIlIlllII[llIlIlllIl[4]] = lIllIlIIllllI("AhggHgktDT8ZCWwNOVcMLRc9", "LyVwn");
        llIlIlllII[llIlIlllIl[5]] = lIllIlIIllllI("OBYNID0ZAUgsNRkN", "wfhNT");
        llIlIlllII[llIlIlllIl[7]] = lIllIlIIlllII("V4mK24vhNYbQzGNYVsNYvv0wrkykEJZu", "zOyfF");
        llIlIlllII[llIlIlllIl[13]] = lIllIlIIllllI("OxNSDwUJVh8HBB8fHAlXHB8RBRYUEwFCVx8BGxoUBB8cCVcYGVIsIjU/PCk=", "lvrnw");
        llIlIlllII[llIlIlllIl[14]] = lIllIlIIlllIl("Anj6upKYp+Dz41czEXNscA==", "HVCNT");
        llIlIlllII[llIlIlllIl[15]] = lIllIlIIlllII("q9m2FDc8/52kgm+q4NOOrA==", "yfFNf");
        llIlIlllII[llIlIlllIl[17]] = lIllIlIIlllIl("5O+0AbuwBWX0O1rKQdXD0l2aPd5Y+hLq", "RnchY");
        llIlIlllII[llIlIlllIl[18]] = lIllIlIIlllII("zIrODe8T2UG/R7NWSfkoSA==", "EhbNA");
        llIlIlllII[llIlIlllIl[19]] = lIllIlIIllllI("IR0YIz4LGxBzIg0SBA==", "buwSN");
        llIlIlllII[llIlIlllIl[20]] = lIllIlIIlllII("XV63vfqF8AF8Y29T6ZH7cg==", "tAwEG");
        llIlIlllII[llIlIlllIl[21]] = lIllIlIIlllIl("9VtfJNONRGQY8f/DllDExtVLWRamwR94", "ZaJWg");
        llIlIlllII[llIlIlllIl[22]] = lIllIlIIlllIl("pUuwi7FIvFPkTBigSAoA7Q==", "ayRIq");
        llIlIlllII[llIlIlllIl[23]] = lIllIlIIllllI("LD4iGgMGOCpKHA49bQYcCCU=", "oVMjs");
        llIlIlllII[llIlIlllIl[16]] = lIllIlIIlllII("yWlg/kc3I3WxaVVYiEAHYw==", "GPVTC");
        llIlIlllII[llIlIlllIl[35]] = lIllIlIIllllI("JTsqKREHIDEkHBU=", "rTEMr");
        llIlIlllII[llIlIlllIl[36]] = lIllIlIIlllII("ZD9p5d7ZDBRRbWsOfXiMDggDJzv/CHSc", "BeAsJ");
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
    public static boolean an() {
        if (lIllIlIlIIllI(Skills.getLevel(Skill.WOODCUTTING), llIlIlllIl[24])) {
            int[] iArr = new int[llIlIlllIl[1]];
            iArr[llIlIlllIl[0]] = llIlIlllIl[12];
            if (lIllIlIlIIlII(Inventory.getCount(iArr))) {
                ?? r0 = llIlIlllIl[1];
                "".length();
                return " ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIlIlllIl[0];
        } else if (lIllIlIlIIllI(Skills.getLevel(Skill.WOODCUTTING), llIlIlllIl[25]) && lIllIlIlIIIlI(Skills.getLevel(Skill.WOODCUTTING), llIlIlllIl[24])) {
            int[] iArr2 = new int[llIlIlllIl[1]];
            iArr2[llIlIlllIl[0]] = llIlIlllIl[12];
            if (lIllIlIlIIlII(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[llIlIlllIl[1]];
                iArr3[llIlIlllIl[0]] = llIlIlllIl[11];
                if (lIllIlIlIIlII(Inventory.getCount(iArr3))) {
                    ?? r02 = llIlIlllIl[1];
                    "".length();
                    return "   ".length() == 0 ? (true ^ true) & ((true ^ true) ^ true) : r02;
                }
            }
            return llIlIlllIl[0];
        } else if (lIllIlIlIIllI(Skills.getLevel(Skill.WOODCUTTING), llIlIlllIl[26]) && lIllIlIlIIIlI(Skills.getLevel(Skill.WOODCUTTING), llIlIlllIl[25])) {
            int[] iArr4 = new int[llIlIlllIl[1]];
            iArr4[llIlIlllIl[0]] = llIlIlllIl[12];
            if (lIllIlIlIIlII(Inventory.getCount(iArr4))) {
                int[] iArr5 = new int[llIlIlllIl[1]];
                iArr5[llIlIlllIl[0]] = llIlIlllIl[11];
                if (lIllIlIlIIlII(Inventory.getCount(iArr5))) {
                    int[] iArr6 = new int[llIlIlllIl[1]];
                    iArr6[llIlIlllIl[0]] = llIlIlllIl[10];
                    if (lIllIlIlIIlII(Inventory.getCount(iArr6))) {
                        ?? r03 = llIlIlllIl[1];
                        "".length();
                        return "   ".length() <= ((74 ^ 6) & ((30 ^ 82) ^ (-1))) ? "   ".length() & ("   ".length() ^ (-1)) : r03;
                    }
                }
            }
            return llIlIlllIl[0];
        } else if (lIllIlIlIIllI(Skills.getLevel(Skill.WOODCUTTING), llIlIlllIl[14]) && lIllIlIlIIIlI(Skills.getLevel(Skill.WOODCUTTING), llIlIlllIl[26])) {
            int[] iArr7 = new int[llIlIlllIl[1]];
            iArr7[llIlIlllIl[0]] = llIlIlllIl[12];
            if (lIllIlIlIIlII(Inventory.getCount(iArr7))) {
                int[] iArr8 = new int[llIlIlllIl[1]];
                iArr8[llIlIlllIl[0]] = llIlIlllIl[11];
                if (lIllIlIlIIlII(Inventory.getCount(iArr8))) {
                    int[] iArr9 = new int[llIlIlllIl[1]];
                    iArr9[llIlIlllIl[0]] = llIlIlllIl[10];
                    if (lIllIlIlIIlII(Inventory.getCount(iArr9))) {
                        int[] iArr10 = new int[llIlIlllIl[1]];
                        iArr10[llIlIlllIl[0]] = llIlIlllIl[9];
                        if (lIllIlIlIIlII(Inventory.getCount(iArr10))) {
                            ?? r04 = llIlIlllIl[1];
                            "".length();
                            return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r04;
                        }
                    }
                }
            }
            return llIlIlllIl[0];
        } else {
            int[] iArr11 = new int[llIlIlllIl[1]];
            iArr11[llIlIlllIl[0]] = llIlIlllIl[12];
            if (lIllIlIlIIlII(Inventory.getCount(iArr11))) {
                int[] iArr12 = new int[llIlIlllIl[1]];
                iArr12[llIlIlllIl[0]] = llIlIlllIl[11];
                if (lIllIlIlIIlII(Inventory.getCount(iArr12))) {
                    int[] iArr13 = new int[llIlIlllIl[1]];
                    iArr13[llIlIlllIl[0]] = llIlIlllIl[10];
                    if (lIllIlIlIIlII(Inventory.getCount(iArr13))) {
                        int[] iArr14 = new int[llIlIlllIl[1]];
                        iArr14[llIlIlllIl[0]] = llIlIlllIl[9];
                        if (lIllIlIlIIlII(Inventory.getCount(iArr14))) {
                            int[] iArr15 = new int[llIlIlllIl[1]];
                            iArr15[llIlIlllIl[0]] = llIlIlllIl[8];
                            if (lIllIlIlIIlII(Inventory.getCount(iArr15))) {
                                ?? r05 = llIlIlllIl[1];
                                "".length();
                                return (-"   ".length()) > 0 ? ((120 ^ 14) ^ (51 ^ 0)) & (((81 ^ 85) ^ (135 ^ 198)) ^ (-" ".length())) : r05;
                            }
                        }
                    }
                }
            }
            return llIlIlllIl[0];
        }
    }

    private static String lIllIlIIllllI(String llllllllllllllllllIIIllIIIIIlllI, String llllllllllllllllllIIIllIIIIIllIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllllIIIllIIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllllIIIllIIIIIllIl.toCharArray();
        int llllllllllllllllllIIIllIIIIIlIlI = llIlIlllIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIlIlllIl[0];
        while (lIllIlIlIIIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIIIllIIIIIlIlI % charArray.length]));
            "".length();
            llllllllllllllllllIIIllIIIIIlIlI++;
            i++;
            "".length();
            if ("   ".length() <= (((179 ^ 150) ^ (93 ^ 103)) & (((34 ^ 117) ^ (237 ^ 165)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static void Q() {
        int[] iArr = new int[llIlIlllIl[1]];
        iArr[llIlIlllIl[0]] = llIlIlllIl[8];
        if (lIllIlIlIIIll(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlllIl[8], llIlIlllIl[1], llIlIlllIl[6]));
            "".length();
        }
        int[] iArr2 = new int[llIlIlllIl[1]];
        iArr2[llIlIlllIl[0]] = llIlIlllIl[9];
        if (lIllIlIlIIIll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlllIl[9], llIlIlllIl[1], llIlIlllIl[6]));
            "".length();
        }
        int[] iArr3 = new int[llIlIlllIl[1]];
        iArr3[llIlIlllIl[0]] = llIlIlllIl[10];
        if (lIllIlIlIIIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlllIl[10], llIlIlllIl[1], llIlIlllIl[27]));
            "".length();
        }
        int[] iArr4 = new int[llIlIlllIl[1]];
        iArr4[llIlIlllIl[0]] = llIlIlllIl[11];
        if (lIllIlIlIIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlllIl[11], llIlIlllIl[1], llIlIlllIl[28]));
            "".length();
        }
        int[] iArr5 = new int[llIlIlllIl[1]];
        iArr5[llIlIlllIl[0]] = llIlIlllIl[12];
        if (lIllIlIlIIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlllIl[12], llIlIlllIl[1], llIlIlllIl[29]));
            "".length();
        }
        if (lIllIlIlIIIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llIlIlllII[llIlIlllIl[36]]);
        }) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlllIl[30], llIlIlllIl[13], llIlIlllIl[29]));
            "".length();
        }
        int[] iArr6 = new int[llIlIlllIl[1]];
        iArr6[llIlIlllIl[0]] = llIlIlllIl[31];
        if (lIllIlIlIIIll(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0017d(llIlIlllIl[31], llIlIlllIl[32], llIlIlllIl[33]));
            "".length();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0081, code lost:
        if (lIllIlIlIIlII(net.unethicalite.api.items.Inventory.getCount(r0)) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018d, code lost:
        if (lIllIlIlIIllI(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.au.llIlIlllIl[1]) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01cc, code lost:
        if (lIllIlIlIIllI(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.au.llIlIlllIl[1]) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x020b, code lost:
        if (lIllIlIlIIllI(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.au.llIlIlllIl[1]) != false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x024a, code lost:
        if (lIllIlIlIIllI(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.au.llIlIlllIl[1]) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0289, code lost:
        if (lIllIlIlIIIlI(net.unethicalite.api.items.Inventory.getCount(r0), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.au.llIlIlllIl[1]) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x028c, code lost:
        Q();
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.au.llIlIlllII[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.au.llIlIlllIl[13]]);
        o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.au.bt = o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.au.llIlIlllIl[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02a7, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v137, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v254, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void gs() {
        if (lIllIlIlIIIIl(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[0]];
            C0015b.a(bv);
            if (lIllIlIlIIIlI(bv.size(), llIlIlllIl[1])) {
                System.out.println(llIlIlllII[llIlIlllIl[1]]);
                bt = llIlIlllIl[0];
            }
        }
        if (lIllIlIlIIIll(bt ? 1 : 0) && lIllIlIlIIIlI(Skills.getLevel(Skill.WOODCUTTING), llIlIlllIl[2])) {
            if (lIllIlIlIIIIl(an() ? 1 : 0)) {
                int[] iArr = new int[llIlIlllIl[1]];
                iArr[llIlIlllIl[0]] = llIlIlllIl[3];
            }
            BankLocation nearest = BankLocation.getNearest();
            if (lIllIlIlIIlIl(nearest) && lIllIlIlIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderSotf.c = llIlIlllII[llIlIlllIl[4]];
                C0000a.a(nearest);
            }
            if (lIllIlIlIIlIl(nearest) && lIllIlIlIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIllIlIlIIIll(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIlllII[llIlIlllIl[5]];
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIlIlllIl[6]);
                    "".length();
                }
                if (lIllIlIlIIIIl(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIlllII[llIlIlllIl[7]];
                    if (lIllIlIlIIlII(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(llIlIlllIl[7]);
                        "".length();
                    }
                    if (lIllIlIlIIlII(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(llIlIlllIl[4]);
                        "".length();
                    }
                    int[] iArr2 = new int[llIlIlllIl[1]];
                    iArr2[llIlIlllIl[0]] = llIlIlllIl[8];
                    if (lIllIlIlIIIll(Bank.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[llIlIlllIl[1]];
                        iArr3[llIlIlllIl[0]] = llIlIlllIl[8];
                    }
                    int[] iArr4 = new int[llIlIlllIl[1]];
                    iArr4[llIlIlllIl[0]] = llIlIlllIl[9];
                    if (lIllIlIlIIIll(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIlIlllIl[1]];
                        iArr5[llIlIlllIl[0]] = llIlIlllIl[9];
                    }
                    int[] iArr6 = new int[llIlIlllIl[1]];
                    iArr6[llIlIlllIl[0]] = llIlIlllIl[10];
                    if (lIllIlIlIIIll(Bank.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIlIlllIl[1]];
                        iArr7[llIlIlllIl[0]] = llIlIlllIl[10];
                    }
                    int[] iArr8 = new int[llIlIlllIl[1]];
                    iArr8[llIlIlllIl[0]] = llIlIlllIl[11];
                    if (lIllIlIlIIIll(Bank.contains(iArr8) ? 1 : 0)) {
                        int[] iArr9 = new int[llIlIlllIl[1]];
                        iArr9[llIlIlllIl[0]] = llIlIlllIl[11];
                    }
                    int[] iArr10 = new int[llIlIlllIl[1]];
                    iArr10[llIlIlllIl[0]] = llIlIlllIl[12];
                    if (lIllIlIlIIIll(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[llIlIlllIl[1]];
                        iArr11[llIlIlllIl[0]] = llIlIlllIl[12];
                    }
                    int[] iArr12 = new int[llIlIlllIl[1]];
                    iArr12[llIlIlllIl[0]] = llIlIlllIl[8];
                    if (lIllIlIlIIIIl(Bank.contains(iArr12) ? 1 : 0)) {
                        Bank.withdraw(llIlIlllIl[8], llIlIlllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlIlllIl[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr13 = new int[llIlIlllIl[1]];
                            iArr13[llIlIlllIl[0]] = llIlIlllIl[8];
                            if (lIllIlIlIIlII(Inventory.getCount(iArr13))) {
                                ?? r0 = llIlIlllIl[1];
                                "".length();
                                return "  ".length() >= (5 ^ 1) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIlIlllIl[0];
                        }, llIlIlllIl[6]);
                        "".length();
                    }
                    int[] iArr13 = new int[llIlIlllIl[1]];
                    iArr13[llIlIlllIl[0]] = llIlIlllIl[9];
                    if (lIllIlIlIIIIl(Bank.contains(iArr13) ? 1 : 0)) {
                        Bank.withdraw(llIlIlllIl[9], llIlIlllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlIlllIl[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr14 = new int[llIlIlllIl[1]];
                            iArr14[llIlIlllIl[0]] = llIlIlllIl[9];
                            if (lIllIlIlIIlII(Inventory.getCount(iArr14))) {
                                ?? r0 = llIlIlllIl[1];
                                "".length();
                                return "  ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIlIlllIl[0];
                        }, llIlIlllIl[6]);
                        "".length();
                    }
                    int[] iArr14 = new int[llIlIlllIl[1]];
                    iArr14[llIlIlllIl[0]] = llIlIlllIl[10];
                    if (lIllIlIlIIIIl(Bank.contains(iArr14) ? 1 : 0)) {
                        Bank.withdraw(llIlIlllIl[10], llIlIlllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlIlllIl[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr15 = new int[llIlIlllIl[1]];
                            iArr15[llIlIlllIl[0]] = llIlIlllIl[10];
                            if (lIllIlIlIIlII(Inventory.getCount(iArr15))) {
                                ?? r0 = llIlIlllIl[1];
                                "".length();
                                return (((224 ^ 130) ^ (26 ^ 38)) & ((((180 ^ 159) & ((101 ^ 78) ^ (-1))) ^ (8 ^ 86)) ^ (-" ".length()))) != (((((77 + 64) - 9) + 27) ^ (((120 + 40) - 118) + 133)) & (((178 ^ 137) ^ (97 ^ 106)) ^ (-" ".length()))) ? ((76 ^ 18) ^ (125 ^ 21)) & (((240 ^ 176) ^ (48 ^ 70)) ^ (-" ".length())) : r0;
                            }
                            return llIlIlllIl[0];
                        }, llIlIlllIl[6]);
                        "".length();
                    }
                    int[] iArr15 = new int[llIlIlllIl[1]];
                    iArr15[llIlIlllIl[0]] = llIlIlllIl[11];
                    if (lIllIlIlIIIIl(Bank.contains(iArr15) ? 1 : 0)) {
                        Bank.withdraw(llIlIlllIl[11], llIlIlllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlIlllIl[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[llIlIlllIl[1]];
                            iArr16[llIlIlllIl[0]] = llIlIlllIl[11];
                            if (lIllIlIlIIlII(Inventory.getCount(iArr16))) {
                                ?? r0 = llIlIlllIl[1];
                                "".length();
                                return (67 ^ 70) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIlIlllIl[0];
                        }, llIlIlllIl[6]);
                        "".length();
                    }
                    int[] iArr16 = new int[llIlIlllIl[1]];
                    iArr16[llIlIlllIl[0]] = llIlIlllIl[12];
                    if (lIllIlIlIIIIl(Bank.contains(iArr16) ? 1 : 0)) {
                        Bank.withdraw(llIlIlllIl[12], llIlIlllIl[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llIlIlllIl[4]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr17 = new int[llIlIlllIl[1]];
                            iArr17[llIlIlllIl[0]] = llIlIlllIl[12];
                            if (lIllIlIlIIlII(Inventory.getCount(iArr17))) {
                                ?? r0 = llIlIlllIl[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llIlIlllIl[0];
                        }, llIlIlllIl[6]);
                        "".length();
                    }
                }
            }
            if (lIllIlIlIIIIl(an() ? 1 : 0)) {
                if (lIllIlIlIIIIl(Inventory.isFull() ? 1 : 0)) {
                    AccBuilderSotf.c = llIlIlllII[llIlIlllIl[14]];
                    System.out.println(llIlIlllII[llIlIlllIl[15]]);
                    Inventory.getAll(oy).stream().forEach((v0) -> {
                        v0.drop();
                    });
                }
                if (lIllIlIlIIIll(Inventory.isFull() ? 1 : 0)) {
                    if (lIllIlIlIIIlI(Skills.getLevel(Skill.WOODCUTTING), llIlIlllIl[16])) {
                        if (lIllIlIlIIIll(ot.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[17]];
                            Movement.walkTo(ot.toWorldPoint());
                            "".length();
                            Time.sleepTicks(llIlIlllIl[7]);
                            "".length();
                        }
                        if (lIllIlIlIIIIl(ot.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[18]];
                            TileObject nearest2 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), ow);
                            if (lIllIlIlIIIll(Players.getLocal().isAnimating() ? 1 : 0) && lIllIlIlIIIll(Players.getLocal().isMoving() ? 1 : 0) && lIllIlIlIIlIl(nearest2)) {
                                System.out.println(llIlIlllII[llIlIlllIl[19]]);
                                nearest2.interact(llIlIlllII[llIlIlllIl[20]]);
                                Time.sleepTicks(llIlIlllIl[5]);
                                "".length();
                            }
                        }
                    }
                    if (lIllIlIlIIllI(Skills.getLevel(Skill.WOODCUTTING), llIlIlllIl[16])) {
                        if (lIllIlIlIIIll(ou.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[21]];
                            Movement.walkTo(ov);
                            "".length();
                            Time.sleepTicks(llIlIlllIl[7]);
                            "".length();
                        }
                        if (lIllIlIlIIIIl(ou.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderSotf.c = llIlIlllII[llIlIlllIl[22]];
                            TileObject nearest3 = TileObjects.getNearest(Players.getLocal().getWorldLocation(), ox);
                            if (lIllIlIlIIIll(Players.getLocal().isAnimating() ? 1 : 0) && lIllIlIlIIIll(Players.getLocal().isMoving() ? 1 : 0) && lIllIlIlIIlIl(nearest3)) {
                                System.out.println(llIlIlllII[llIlIlllIl[23]]);
                                nearest3.interact(llIlIlllII[llIlIlllIl[16]]);
                                Time.sleepTicks(llIlIlllIl[5]);
                                "".length();
                            }
                        }
                    }
                }
            }
        }
    }

    private static boolean lIllIlIlIIIIl(int i) {
        return i != 0;
    }

    private static boolean lIllIlIlIIlIl(Object obj) {
        return obj != null;
    }

    private static boolean lIllIlIlIIlII(int i) {
        return i > 0;
    }

    private static boolean lIllIlIlIIIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIllIlIlIIllI(Skills.getLevel(Skill.WOODCUTTING), llIlIlllIl[2])) {
            ?? r0 = llIlIlllIl[1];
            "".length();
            return (-(7 ^ 3)) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIlIlllIl[0];
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlIlllII[llIlIlllIl[35]];
    }

    private static String lIllIlIIlllIl(String llllllllllllllllllIIIlIllllllIIl, String llllllllllllllllllIIIlIllllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIllllllIII.getBytes(StandardCharsets.UTF_8)), llIlIlllIl[17]), "DES");
            Cipher llllllllllllllllllIIIlIllllllIll = Cipher.getInstance("DES");
            llllllllllllllllllIIIlIllllllIll.init(llIlIlllIl[4], secretKeySpec);
            return new String(llllllllllllllllllIIIlIllllllIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIlIllllllIlI) {
            llllllllllllllllllIIIlIllllllIlI.printStackTrace();
            return null;
        }
    }

    static {
        lIllIlIlIIIII();
        lIllIlIIlllll();
        or = llIlIlllIl[11];
        oo = llIlIlllIl[8];
        os = llIlIlllIl[12];
        op = llIlIlllIl[9];
        oq = llIlIlllIl[10];
        ot = new WorldArea(llIlIlllIl[37], llIlIlllIl[38], llIlIlllIl[35], llIlIlllIl[39], llIlIlllIl[0]);
        ou = new WorldArea(llIlIlllIl[40], llIlIlllIl[41], llIlIlllIl[23], llIlIlllIl[35], llIlIlllIl[0]);
        ov = new WorldPoint(llIlIlllIl[42], llIlIlllIl[43], llIlIlllIl[0]);
        int[] iArr = new int[llIlIlllIl[7]];
        iArr[llIlIlllIl[0]] = llIlIlllIl[44];
        iArr[llIlIlllIl[1]] = llIlIlllIl[45];
        iArr[llIlIlllIl[4]] = llIlIlllIl[46];
        iArr[llIlIlllIl[5]] = llIlIlllIl[47];
        ow = iArr;
        int[] iArr2 = new int[llIlIlllIl[1]];
        iArr2[llIlIlllIl[0]] = llIlIlllIl[48];
        ox = iArr2;
        int[] iArr3 = new int[llIlIlllIl[5]];
        iArr3[llIlIlllIl[0]] = llIlIlllIl[49];
        iArr3[llIlIlllIl[1]] = llIlIlllIl[50];
        iArr3[llIlIlllIl[4]] = llIlIlllIl[51];
        oy = iArr3;
        bv = new ArrayList();
    }

    private static void lIllIlIlIIIII() {
        llIlIlllIl = new int[53];
        llIlIlllIl[0] = (166 ^ 170) & ((75 ^ 71) ^ (-1));
        llIlIlllIl[1] = " ".length();
        llIlIlllIl[2] = (217 ^ 180) ^ (78 ^ 29);
        llIlIlllIl[3] = (-((-733) & 14045)) & (-16401) & 30707;
        llIlIlllIl[4] = "  ".length();
        llIlIlllIl[5] = "   ".length();
        llIlIlllIl[6] = (-17490) & 22489;
        llIlIlllIl[7] = (((163 + 127) - 113) + 18) ^ (((37 + 123) - (-39)) + 0);
        llIlIlllIl[8] = (-31361) & 32711;
        llIlIlllIl[9] = (-4627) & 5979;
        llIlIlllIl[10] = (-24581) & 25935;
        llIlIlllIl[11] = (-2593) & 3949;
        llIlIlllIl[12] = (-28705) & 30063;
        llIlIlllIl[13] = (79 ^ 73) ^ "   ".length();
        llIlIlllIl[14] = 145 ^ 151;
        llIlIlllIl[15] = 13 ^ 10;
        llIlIlllIl[16] = (19 ^ 23) ^ (180 ^ 191);
        llIlIlllIl[17] = (((9 + 99) - 82) + 156) ^ (((176 + 32) - 112) + 94);
        llIlIlllIl[18] = (((123 + 91) - 84) + 25) ^ (((13 + 126) - 56) + 63);
        llIlIlllIl[19] = 178 ^ 184;
        llIlIlllIl[20] = 70 ^ 77;
        llIlIlllIl[21] = 124 ^ 112;
        llIlIlllIl[22] = (((100 + 146) - 134) + 54) ^ (((164 + 23) - 94) + 78);
        llIlIlllIl[23] = (124 ^ 30) ^ (16 ^ 124);
        llIlIlllIl[24] = 125 ^ 84;
        llIlIlllIl[25] = (197 ^ 178) ^ (192 ^ 168);
        llIlIlllIl[26] = 162 ^ 183;
        llIlIlllIl[27] = (-7314) & 16313;
        llIlIlllIl[28] = (-(167 ^ 163)) & (-20741) & 32743;
        llIlIlllIl[29] = (-5639) & 30638;
        llIlIlllIl[30] = (-((-8915) & 29398)) & (-49) & 32511;
        llIlIlllIl[31] = (-16393) & 24399;
        llIlIlllIl[32] = 92 ^ 116;
        llIlIlllIl[33] = (-7258) & 8157;
        llIlIlllIl[34] = 86 ^ 50;
        llIlIlllIl[35] = (75 ^ 23) ^ (250 ^ 182);
        llIlIlllIl[36] = 151 ^ 134;
        llIlIlllIl[37] = (-17027) & 20183;
        llIlIlllIl[38] = (-((-5135) & 30303)) & (-4098) & 32639;
        llIlIlllIl[39] = (97 ^ 58) ^ (93 ^ 43);
        llIlIlllIl[40] = (-1) & 3198;
        llIlIlllIl[41] = (-((-16409) & 21211)) & (-21) & 8183;
        llIlIlllIl[42] = (-((-3201) & 24298)) & (-8209) & 32509;
        llIlIlllIl[43] = (-((-5183) & 5823)) & (-12355) & 16359;
        llIlIlllIl[44] = (-((-16405) & 28949)) & (-16387) & 30206;
        llIlIlllIl[45] = (-((-23) & 31511)) & (-2) & 32767;
        llIlIlllIl[46] = (-((-85) & 25214)) & (-4241) & 30651;
        llIlIlllIl[47] = (-((-327) & 19319)) & (-202) & 20479;
        llIlIlllIl[48] = (-17578) & 28397;
        llIlIlllIl[49] = (-((-589) & 6733)) & (-16897) & 24551;
        llIlIlllIl[50] = (-((-16715) & 27471)) & (-20489) & 32765;
        llIlIlllIl[51] = (-((-651) & 23195)) & (-8193) & 32255;
        llIlIlllIl[52] = 140 ^ 158;
    }
}
