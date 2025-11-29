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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
/* renamed from: e.c.l.c.e.e.k.d.-.r.-.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.-.u.C  reason: invalid package */
/* loaded from: 3047f210-3107-4c67-939d-3c9e588029ae.jar:e/c/l/c/e/e/k/d/-/r/-/t/l/t/o/m/e/k/e/n/i/p/r/b/i/l/-/u/C.class */
public class C implements S {
    public static /* synthetic */ List<C0003d> bu;
    static /* synthetic */ int bS;
    private static final /* synthetic */ int gJ;
    private static final /* synthetic */ WorldPoint gL;
    private static /* synthetic */ int[] lllIlllIIl;
    private static final /* synthetic */ int gK;
    public static /* synthetic */ boolean bs;
    private static final /* synthetic */ int gI;
    private static final /* synthetic */ String[] gM;
    static /* synthetic */ boolean cl;
    static /* synthetic */ int ck;
    private static /* synthetic */ String[] lllIlllIII;

    private static boolean llIIlIIlIlIII(Object obj) {
        return obj != null;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public int T() {
        try {
            cb();
            "".length();
            if (0 != 0) {
                return ((81 ^ 40) ^ (210 ^ 152)) & (((7 ^ 85) ^ (249 ^ 152)) ^ (-" ".length()));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return lllIlllIIl[18];
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c8, code lost:
        if (llIIlIIlIlIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C.lllIlllIIl[9]) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x020a, code lost:
        if (llIIlIIlIlIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C.lllIlllIIl[3]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x024d, code lost:
        if (llIIlIIlIIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C.lllIlllIIl[6]) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0250, code lost:
        ae();
        java.lang.System.out.println(e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C.lllIlllIII[e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C.lllIlllIIl[12]]);
        e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C.bs = e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C.lllIlllIIl[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v144, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v159, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v201, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cb() {
        if (llIIlIIlIIlII(bs ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[0]];
            C0001b.a(bu);
            if (llIIlIIlIIlIl(bu.size(), lllIlllIIl[1])) {
                System.out.println(lllIlllIII[lllIlllIIl[1]]);
                bs = lllIlllIIl[0];
            }
        }
        if (llIIlIIlIIllI(bs ? 1 : 0)) {
            if (llIIlIIlIIlII(Inventory.contains(C0005f.aU) ? 1 : 0) && llIIlIIlIIlIl(Movement.getRunEnergy(), lllIlllIIl[2])) {
                Inventory.getFirst(C0005f.aU).interact(lllIlllIII[lllIlllIIl[3]]);
                Time.sleepTicks(lllIlllIIl[1]);
                "".length();
            }
            if (llIIlIIlIIllI(Movement.isRunEnabled() ? 1 : 0) && llIIlIIlIIlll(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (llIIlIIlIIllI(aa() ? 1 : 0) && llIIlIIlIIlIl(C0004e.j(lllIlllIIl[4]), lllIlllIIl[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIlIIlIlIII(nearest) && llIIlIIlIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[5]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lllIlllIIl[3]);
                    "".length();
                }
                if (llIIlIIlIlIII(nearest) && llIIlIIlIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[6]];
                    if (llIIlIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIlllIIl[7]);
                        "".length();
                    }
                    if (llIIlIIlIIlII(Bank.isOpen() ? 1 : 0)) {
                        if (llIIlIIlIIlll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIlllIIl[6]);
                            "".length();
                        }
                        if (llIIlIIlIIlll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIlllIIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[lllIlllIIl[1]];
                        iArr[lllIlllIIl[0]] = lllIlllIIl[8];
                        if (llIIlIIlIIlII(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lllIlllIIl[1]];
                            iArr2[lllIlllIIl[0]] = lllIlllIIl[8];
                        }
                        int[] iArr3 = new int[lllIlllIIl[1]];
                        iArr3[lllIlllIIl[0]] = lllIlllIIl[10];
                        if (llIIlIIlIIlII(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllIlllIIl[1]];
                            iArr4[lllIlllIIl[0]] = lllIlllIIl[10];
                        }
                        int[] iArr5 = new int[lllIlllIIl[1]];
                        iArr5[lllIlllIIl[0]] = lllIlllIIl[11];
                        if (llIIlIIlIIlII(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lllIlllIIl[1]];
                            iArr6[lllIlllIIl[0]] = lllIlllIIl[11];
                        }
                        int[] iArr7 = new int[lllIlllIIl[6]];
                        iArr7[lllIlllIIl[0]] = lllIlllIIl[11];
                        iArr7[lllIlllIIl[1]] = lllIlllIIl[10];
                        iArr7[lllIlllIIl[3]] = lllIlllIIl[8];
                        iArr7[lllIlllIIl[5]] = lllIlllIIl[13];
                        if (llIIlIIlIIllI(C0004e.b(iArr7) ? 1 : 0)) {
                            ae();
                            System.out.println(lllIlllIII[lllIlllIIl[9]]);
                            bs = lllIlllIIl[1];
                            return;
                        }
                        int[] iArr8 = new int[lllIlllIIl[6]];
                        iArr8[lllIlllIIl[0]] = lllIlllIIl[11];
                        iArr8[lllIlllIIl[1]] = lllIlllIIl[10];
                        iArr8[lllIlllIIl[3]] = lllIlllIIl[8];
                        iArr8[lllIlllIIl[5]] = lllIlllIIl[13];
                        if (llIIlIIlIIlII(C0004e.b(iArr8) ? 1 : 0)) {
                            C0000a.a(lllIlllIIl[11], lllIlllIIl[6]);
                            C0000a.a(lllIlllIIl[10], lllIlllIIl[3]);
                            C0000a.a(lllIlllIIl[8], lllIlllIIl[9]);
                            C0000a.a(lllIlllIIl[13], lllIlllIIl[1]);
                        }
                        if (llIIlIIlIIlII(AccBuilderTempleTrek.f3e ? 1 : 0)) {
                            C0000a.b(C0005f.be, lllIlllIIl[1]);
                        }
                    }
                }
            }
            if (llIIlIIlIIllI(aa() ? 1 : 0) && llIIlIIlIIlll(C0004e.j(lllIlllIIl[4])) && llIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(gL), lllIlllIIl[12])) {
                cc();
            }
            if ((!llIIlIIlIIllI(aa() ? 1 : 0) || llIIlIIlIlIll(Players.getLocal().getWorldLocation().distanceTo(gL), lllIlllIIl[12])) && llIIlIIlIIlIl(C0004e.j(lllIlllIIl[4]), lllIlllIIl[14])) {
                if (llIIlIIlIlIlI(Players.getLocal().getWorldLocation().distanceTo(gL), lllIlllIIl[6])) {
                    ck = lllIlllIIl[0];
                    AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[15]];
                    if (llIIlIIlIIlIl(bS, lllIlllIIl[1])) {
                        C0004e.v();
                        bS += lllIlllIIl[1];
                    }
                    Movement.walkTo(gL);
                    "".length();
                }
                if (llIIlIIlIlIll(Players.getLocal().getWorldLocation().distanceTo(gL), lllIlllIIl[9])) {
                    AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[16]];
                    String[] strArr = new String[lllIlllIIl[1]];
                    strArr[lllIlllIIl[0]] = lllIlllIII[lllIlllIIl[17]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    if (llIIlIIlIlIII(nearest2)) {
                        String[] strArr2 = new String[lllIlllIIl[1]];
                        strArr2[lllIlllIIl[0]] = lllIlllIII[lllIlllIIl[18]];
                        if (llIIlIIlIIlII(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            nearest2.interact(lllIlllIII[lllIlllIIl[19]]);
                            Time.sleepTicks(lllIlllIIl[5]);
                            "".length();
                        }
                    }
                    if (llIIlIIlIIlIl(ck, lllIlllIIl[1])) {
                        ac.mY += lllIlllIIl[1];
                        ac.d(AccBuilderTempleTrek.m);
                        ck += lllIlllIIl[1];
                        ac.mY = lllIlllIIl[0];
                        cl = lllIlllIIl[0];
                    }
                    C0006g.a(lllIlllIII[lllIlllIIl[20]], gM);
                }
            }
            C0006g.a(new String[lllIlllIIl[0]]);
        }
        System.out.println("Setting: " + C0004e.j(lllIlllIIl[4]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean V() {
        if (llIIlIIlIlIIl(C0004e.j(lllIlllIIl[4]), lllIlllIIl[14])) {
            ?? r0 = lllIlllIIl[1];
            "".length();
            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIlllIIl[0];
    }

    private static String llIIlIIlIIIII(String lllllllllllllllllIllIIllllIIlIll, String lllllllllllllllllIllIIllllIIlIlI) {
        try {
            SecretKeySpec lllllllllllllllllIllIIllllIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIIllllIIlIlI.getBytes(StandardCharsets.UTF_8)), lllIlllIIl[16]), "DES");
            Cipher lllllllllllllllllIllIIllllIIllIl = Cipher.getInstance("DES");
            lllllllllllllllllIllIIllllIIllIl.init(lllIlllIIl[3], lllllllllllllllllIllIIllllIIlllI);
            return new String(lllllllllllllllllIllIIllllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIIllllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIIllllIIllII) {
            lllllllllllllllllIllIIllllIIllII.printStackTrace();
            return null;
        }
    }

    static {
        llIIlIIlIIIll();
        llIIlIIlIIIlI();
        gI = lllIlllIIl[8];
        gK = lllIlllIIl[11];
        gJ = lllIlllIIl[10];
        gL = new WorldPoint(lllIlllIIl[32], lllIlllIIl[33], lllIlllIIl[0]);
        String[] strArr = new String[lllIlllIIl[6]];
        strArr[lllIlllIIl[0]] = lllIlllIII[lllIlllIIl[34]];
        strArr[lllIlllIIl[1]] = lllIlllIII[lllIlllIIl[35]];
        strArr[lllIlllIIl[3]] = lllIlllIII[lllIlllIIl[36]];
        strArr[lllIlllIIl[5]] = lllIlllIII[lllIlllIIl[37]];
        gM = strArr;
        bu = new ArrayList();
        bS = lllIlllIIl[0];
    }

    private static String llIIlIIIlllll(String lllllllllllllllllIllIIllllllIIII, String lllllllllllllllllIllIIlllllIllll) {
        try {
            SecretKeySpec lllllllllllllllllIllIIllllllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllIIlllllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIlllIIl[3], lllllllllllllllllIllIIllllllIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllIllIIllllllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllIllIIllllllIIIl) {
            lllllllllllllllllIllIIllllllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlIlIlI(int i, int i2) {
        return i > i2;
    }

    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public String U() {
        return lllIlllIII[lllIlllIIl[30]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.S
    public boolean S() {
        return lllIlllIIl[0];
    }

    private static void llIIlIIlIIIlI() {
        lllIlllIII = new String[lllIlllIIl[38]];
        lllIlllIII[lllIlllIIl[0]] = llIIlIIIlllll("aEV+DuUaueYVr1U4uRXUSw==", "MFGvO");
        lllIlllIII[lllIlllIIl[1]] = llIIlIIlIIIII("ZCX+uW/P1vHnZLQnGinA471YYjmKi8u0hpiPPmKPaHjGN4zelmO2Ok1Yv2E96DKM", "WdTPi");
        lllIlllIII[lllIlllIIl[3]] = llIIlIIlIIIII("WR7DdFT/sCc=", "kkZVX");
        lllIlllIII[lllIlllIIl[5]] = llIIlIIlIIIII("TwwAS22rL3vEj6g0gaR4ig==", "coxfH");
        lllIlllIII[lllIlllIIl[6]] = llIIlIIlIIIIl("EiQAJTszKwlhNTsrBSg5PQ==", "ZEnAW");
        lllIlllIII[lllIlllIIl[12]] = llIIlIIlIIIII("WlxvucSh/8y8RoUiGh+eCxdoSorjrGMlk37DnodGfOJo0bUjZdhwFrSSPhBWZXKabZsBPxRx1pk=", "rpDWJ");
        lllIlllIII[lllIlllIIl[9]] = llIIlIIlIIIIl("EQthDwYjTiwHBzUHLwlUNxskHQBmHTQeBCoHJB1YZh02BwAlBigAE2YaLk42EzcIIDM=", "FnAnt");
        lllIlllIII[lllIlllIIl[15]] = llIIlIIIlllll("pRQLRp6pT2xwuxB/cfldFg==", "tJUIz");
        lllIlllIII[lllIlllIIl[16]] = llIIlIIIlllll("rJnDcW3tmORW5pSOx0RDvQ==", "IoFUb");
        lllIlllIII[lllIlllIIl[17]] = llIIlIIIlllll("RSjcTRkPTDI=", "eXlUv");
        lllIlllIII[lllIlllIIl[18]] = llIIlIIlIIIIl("GyYJIg==", "TVlLy");
        lllIlllIII[lllIlllIIl[19]] = llIIlIIIlllll("UsU3cjvhAzA=", "aYWaP");
        lllIlllIII[lllIlllIIl[20]] = llIIlIIIlllll("pfdSinNXv64=", "CQYrE");
        lllIlllIII[lllIlllIIl[21]] = llIIlIIIlllll("MaGeD4hW17jhiFvbaXZOIQ==", "GITqp");
        lllIlllIII[lllIlllIIl[22]] = llIIlIIIlllll("UlT87YpF6SKmMbn7RI1Ws5HJNw7kjaRH", "UVcde");
        lllIlllIII[lllIlllIIl[23]] = llIIlIIIlllll("KNwPicC2v4GvnPbNhzQuwgsSJnZymlq+HqS8zRS9rCnNfJhWWUByd+yXZEc8d5MPlEsoqz3NMJ8=", "lSzKw");
        lllIlllIII[lllIlllIIl[30]] = llIIlIIlIIIII("GtNAV0qy4gVLP8RkbVn7cQ==", "YQdVP");
        lllIlllIII[lllIlllIIl[31]] = llIIlIIlIIIII("OCK6WOm7E2iUjoOQFZAWt2dMW796GXhp", "ecIAy");
        lllIlllIII[lllIlllIIl[34]] = llIIlIIIlllll("VBbMploDvOfAVJtpvQbnuvhisu6TFzvkjI7YitkIFg8=", "gneQD");
        lllIlllIII[lllIlllIIl[35]] = llIIlIIlIIIIl("ES4Sek4BaxY/AiRrBjMaaDIOI048IwR2Ayk/BCQHKScSeA==", "HKaVn");
        lllIlllIII[lllIlllIIl[36]] = llIIlIIlIIIII("SHpV6DXzfk2xvdVOIFKhQ0t8GQgM4wIRpIGzu5IGOLw=", "sEWXU");
        lllIlllIII[lllIlllIIl[37]] = llIIlIIIlllll("layVIftE94g=", "NnIoL");
    }

    private static boolean llIIlIIlIIlIl(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIlIIlIIlII(int i) {
        return i != 0;
    }

    private static void llIIlIIlIIIll() {
        lllIlllIIl = new int[39];
        lllIlllIIl[0] = (165 ^ 138) & ((152 ^ 183) ^ (-1));
        lllIlllIIl[1] = " ".length();
        lllIlllIIl[2] = (27 ^ 101) ^ (216 ^ 148);
        lllIlllIIl[3] = "  ".length();
        lllIlllIIl[4] = 119 ^ 104;
        lllIlllIIl[5] = "   ".length();
        lllIlllIIl[6] = (209 ^ 132) ^ (114 ^ 35);
        lllIlllIIl[7] = (-((-6545) & 24054)) & (-17) & 22525;
        lllIlllIIl[8] = (-((-649) & 28302)) & (-1) & 28087;
        lllIlllIIl[9] = 185 ^ 191;
        lllIlllIIl[10] = (-((-129) & 32455)) & (-2) & 32767;
        lllIlllIIl[11] = (-19972) & 20407;
        lllIlllIIl[12] = (4 ^ 48) ^ (78 ^ 127);
        lllIlllIIl[13] = (-24741) & 32749;
        lllIlllIIl[14] = 192 ^ 164;
        lllIlllIIl[15] = 186 ^ 189;
        lllIlllIIl[16] = 125 ^ 117;
        lllIlllIIl[17] = 89 ^ 80;
        lllIlllIIl[18] = (((116 + 26) - 3) + 16) ^ (((83 + 32) - 10) + 40);
        lllIlllIIl[19] = 7 ^ 12;
        lllIlllIIl[20] = (91 ^ 40) ^ (((90 + 66) - 34) + 5);
        lllIlllIIl[21] = 174 ^ 163;
        lllIlllIIl[22] = (133 ^ 166) ^ (163 ^ 142);
        lllIlllIIl[23] = (78 ^ 45) ^ (60 ^ 80);
        lllIlllIIl[24] = (-((-9555) & 32083)) & (-9220) & 32247;
        lllIlllIIl[25] = (-((-3621) & 24374)) & (-33) & 32765;
        lllIlllIIl[26] = (-3666) & 28665;
        lllIlllIIl[27] = (-25) & 8031;
        lllIlllIIl[28] = 143 ^ 167;
        lllIlllIIl[29] = (-10241) & 11740;
        lllIlllIIl[30] = (170 ^ 148) ^ (143 ^ 161);
        lllIlllIIl[31] = (((76 + 157) - 197) + 123) ^ (((35 + 36) - 6) + 77);
        lllIlllIIl[32] = (-5177) & 8127;
        lllIlllIIl[33] = (-8321) & 11771;
        lllIlllIIl[34] = (163 ^ 132) ^ (11 ^ 62);
        lllIlllIIl[35] = 54 ^ 37;
        lllIlllIIl[36] = (91 ^ 68) ^ (138 ^ 129);
        lllIlllIIl[37] = 54 ^ 35;
        lllIlllIIl[38] = 151 ^ 129;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e5, code lost:
        if (llIIlIIlIIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C.lllIlllIIl[3]) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016d, code lost:
        if (llIIlIIlIIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C.lllIlllIIl[6]) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llIIlIIlIIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), e.c.l.c.e.e.k.d.p000.r.p001.t.l.t.o.m.e.k.e.n.i.p.r.b.i.l.p002.u.C.lllIlllIIl[9]) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ae() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = new int[lllIlllIIl[1]];
        iArr5[lllIlllIIl[0]] = lllIlllIIl[8];
        if (llIIlIIlIIlII(Bank.contains(iArr5) ? 1 : 0)) {
            int[] iArr6 = new int[lllIlllIIl[1]];
            iArr6[lllIlllIIl[0]] = lllIlllIIl[8];
            if (llIIlIIlIIlII(Bank.contains(iArr6) ? 1 : 0)) {
                int[] iArr7 = new int[lllIlllIIl[1]];
                iArr7[lllIlllIIl[0]] = lllIlllIIl[8];
            }
            iArr = new int[lllIlllIIl[1]];
            iArr[lllIlllIIl[0]] = lllIlllIIl[10];
            if (llIIlIIlIIlII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr8 = new int[lllIlllIIl[1]];
                iArr8[lllIlllIIl[0]] = lllIlllIIl[10];
                if (llIIlIIlIIlII(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr9 = new int[lllIlllIIl[1]];
                    iArr9[lllIlllIIl[0]] = lllIlllIIl[10];
                }
                iArr2 = new int[lllIlllIIl[1]];
                iArr2[lllIlllIIl[0]] = lllIlllIIl[11];
                if (llIIlIIlIIlII(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIlllIIl[1]];
                    iArr10[lllIlllIIl[0]] = lllIlllIIl[11];
                    if (llIIlIIlIIlII(Bank.contains(iArr10) ? 1 : 0)) {
                        int[] iArr11 = new int[lllIlllIIl[1]];
                        iArr11[lllIlllIIl[0]] = lllIlllIIl[11];
                    }
                    iArr3 = new int[lllIlllIIl[1]];
                    iArr3[lllIlllIIl[0]] = lllIlllIIl[13];
                    if (llIIlIIlIIllI(Bank.contains(iArr3) ? 1 : 0)) {
                        bu.add(new C0003d(lllIlllIIl[13], lllIlllIIl[12], lllIlllIIl[7]));
                        "".length();
                    }
                    if (llIIlIIlIIllI(Bank.contains(item -> {
                        return item.getName().toLowerCase().contains(lllIlllIII[lllIlllIIl[31]]);
                    }) ? 1 : 0)) {
                        bu.add(new C0003d(lllIlllIIl[25], lllIlllIIl[12], lllIlllIIl[26]));
                        "".length();
                    }
                    iArr4 = new int[lllIlllIIl[1]];
                    iArr4[lllIlllIIl[0]] = lllIlllIIl[27];
                    if (llIIlIIlIIllI(Bank.contains(iArr4) ? 1 : 0)) {
                        return;
                    }
                    bu.add(new C0003d(lllIlllIIl[27], lllIlllIIl[28], lllIlllIIl[29]));
                    "".length();
                    return;
                }
                bu.add(new C0003d(lllIlllIIl[11], lllIlllIIl[6], lllIlllIIl[24]));
                "".length();
                iArr3 = new int[lllIlllIIl[1]];
                iArr3[lllIlllIIl[0]] = lllIlllIIl[13];
                if (llIIlIIlIIllI(Bank.contains(iArr3) ? 1 : 0)) {
                }
                if (llIIlIIlIIllI(Bank.contains(item2 -> {
                    return item2.getName().toLowerCase().contains(lllIlllIII[lllIlllIIl[31]]);
                }) ? 1 : 0)) {
                }
                iArr4 = new int[lllIlllIIl[1]];
                iArr4[lllIlllIIl[0]] = lllIlllIIl[27];
                if (llIIlIIlIIllI(Bank.contains(iArr4) ? 1 : 0)) {
                }
            }
            bu.add(new C0003d(lllIlllIIl[10], lllIlllIIl[3], lllIlllIIl[24]));
            "".length();
            iArr2 = new int[lllIlllIIl[1]];
            iArr2[lllIlllIIl[0]] = lllIlllIIl[11];
            if (llIIlIIlIIlII(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bu.add(new C0003d(lllIlllIIl[11], lllIlllIIl[6], lllIlllIIl[24]));
            "".length();
            iArr3 = new int[lllIlllIIl[1]];
            iArr3[lllIlllIIl[0]] = lllIlllIIl[13];
            if (llIIlIIlIIllI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            if (llIIlIIlIIllI(Bank.contains(item22 -> {
                return item22.getName().toLowerCase().contains(lllIlllIII[lllIlllIIl[31]]);
            }) ? 1 : 0)) {
            }
            iArr4 = new int[lllIlllIIl[1]];
            iArr4[lllIlllIIl[0]] = lllIlllIIl[27];
            if (llIIlIIlIIllI(Bank.contains(iArr4) ? 1 : 0)) {
            }
        }
        bu.add(new C0003d(lllIlllIIl[8], lllIlllIIl[9], lllIlllIIl[24]));
        "".length();
        iArr = new int[lllIlllIIl[1]];
        iArr[lllIlllIIl[0]] = lllIlllIIl[10];
        if (llIIlIIlIIlII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bu.add(new C0003d(lllIlllIIl[10], lllIlllIIl[3], lllIlllIIl[24]));
        "".length();
        iArr2 = new int[lllIlllIIl[1]];
        iArr2[lllIlllIIl[0]] = lllIlllIIl[11];
        if (llIIlIIlIIlII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bu.add(new C0003d(lllIlllIIl[11], lllIlllIIl[6], lllIlllIIl[24]));
        "".length();
        iArr3 = new int[lllIlllIIl[1]];
        iArr3[lllIlllIIl[0]] = lllIlllIIl[13];
        if (llIIlIIlIIllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        if (llIIlIIlIIllI(Bank.contains(item222 -> {
            return item222.getName().toLowerCase().contains(lllIlllIII[lllIlllIIl[31]]);
        }) ? 1 : 0)) {
        }
        iArr4 = new int[lllIlllIIl[1]];
        iArr4[lllIlllIIl[0]] = lllIlllIIl[27];
        if (llIIlIIlIIllI(Bank.contains(iArr4) ? 1 : 0)) {
        }
    }

    private static boolean llIIlIIlIlIll(int i, int i2) {
        return i <= i2;
    }

    private static String llIIlIIlIIIIl(String lllllllllllllllllIllIIlllllIIIII, String lllllllllllllllllIllIIllllIlllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllIllIIlllllIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllIllIIllllIllllI = new StringBuilder();
        char[] charArray = lllllllllllllllllIllIIllllIlllll.toCharArray();
        int lllllllllllllllllIllIIllllIlllII = lllIlllIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lllIlllIIl[0];
        while (llIIlIIlIIlIl(i, length)) {
            char lllllllllllllllllIllIIlllllIIIIl = charArray2[i];
            lllllllllllllllllIllIIllllIllllI.append((char) (lllllllllllllllllIllIIlllllIIIIl ^ charArray[lllllllllllllllllIllIIllllIlllII % charArray.length]));
            "".length();
            lllllllllllllllllIllIIllllIlllII++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllIllIIllllIllllI);
    }

    private static boolean llIIlIIlIlIIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    private static void cc() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIIlIIlIlIII(nearest) && llIIlIIlIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[21]];
            C0000a.a(nearest);
            Time.sleepTicks(lllIlllIIl[3]);
            "".length();
        }
        if (llIIlIIlIlIII(nearest) && llIIlIIlIIlII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderTempleTrek.c = lllIlllIII[lllIlllIIl[22]];
            if (llIIlIIlIIllI(Bank.isOpen() ? 1 : 0)) {
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lllIlllIIl[7]);
                "".length();
            }
            if (llIIlIIlIIlII(Bank.isOpen() ? 1 : 0)) {
                if (llIIlIIlIIlll(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lllIlllIIl[6]);
                    "".length();
                }
                if (llIIlIIlIIlll(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lllIlllIIl[3]);
                    "".length();
                }
                int[] iArr = new int[lllIlllIIl[6]];
                iArr[lllIlllIIl[0]] = lllIlllIIl[11];
                iArr[lllIlllIIl[1]] = lllIlllIIl[10];
                iArr[lllIlllIIl[3]] = lllIlllIIl[8];
                iArr[lllIlllIIl[5]] = lllIlllIIl[13];
                if (llIIlIIlIIllI(C0004e.b(iArr) ? 1 : 0)) {
                    ae();
                    System.out.println(lllIlllIII[lllIlllIIl[23]]);
                    bs = lllIlllIIl[1];
                    return;
                }
                int[] iArr2 = new int[lllIlllIIl[6]];
                iArr2[lllIlllIIl[0]] = lllIlllIIl[11];
                iArr2[lllIlllIIl[1]] = lllIlllIIl[10];
                iArr2[lllIlllIIl[3]] = lllIlllIIl[8];
                iArr2[lllIlllIIl[5]] = lllIlllIIl[13];
                if (llIIlIIlIIlII(C0004e.b(iArr2) ? 1 : 0)) {
                    C0000a.a(lllIlllIIl[11], lllIlllIIl[6]);
                    C0000a.a(lllIlllIIl[10], lllIlllIIl[3]);
                    C0000a.a(lllIlllIIl[8], lllIlllIIl[9]);
                    C0000a.a(lllIlllIIl[13], lllIlllIIl[1]);
                }
                C0000a.b(C0005f.be, lllIlllIIl[1]);
            }
        }
    }

    private static boolean llIIlIIlIIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean aa() {
        int[] iArr = new int[lllIlllIIl[1]];
        iArr[lllIlllIIl[0]] = lllIlllIIl[8];
        if (llIIlIIlIlIIl(Inventory.getCount(iArr), lllIlllIIl[9])) {
            int[] iArr2 = new int[lllIlllIIl[1]];
            iArr2[lllIlllIIl[0]] = lllIlllIIl[10];
            if (llIIlIIlIlIIl(Inventory.getCount(iArr2), lllIlllIIl[3])) {
                int[] iArr3 = new int[lllIlllIIl[1]];
                iArr3[lllIlllIIl[0]] = lllIlllIIl[11];
                if (llIIlIIlIlIIl(Inventory.getCount(iArr3), lllIlllIIl[6])) {
                    ?? r0 = lllIlllIIl[1];
                    "".length();
                    return "   ".length() <= 0 ? " ".length() & (" ".length() ^ (-" ".length())) : r0;
                }
            }
        }
        return lllIlllIIl[0];
    }

    private static boolean llIIlIIlIIlll(int i) {
        return i > 0;
    }
}
