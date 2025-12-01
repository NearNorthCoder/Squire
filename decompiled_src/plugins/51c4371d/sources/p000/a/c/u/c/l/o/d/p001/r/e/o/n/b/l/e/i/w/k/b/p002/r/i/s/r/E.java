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
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.E  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/E.class */
public class E implements F {
    private static final /* synthetic */ WorldPoint is;
    private static final /* synthetic */ WorldPoint io;
    static /* synthetic */ int bZ;
    public static /* synthetic */ long g;
    public static final /* synthetic */ String[] in;
    static /* synthetic */ boolean cj;
    private static final /* synthetic */ WorldPoint ip;
    public static /* synthetic */ List<C0003d> bB;
    private static /* synthetic */ int[] lIlIllII;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ String[] lIlIlIlI;
    private static final /* synthetic */ WorldPoint iq;
    private static final /* synthetic */ WorldPoint ir;
    static /* synthetic */ int ci;
    private static final /* synthetic */ WorldPoint it;

    private static boolean lIIIlllllIl(int i) {
        return i > 0;
    }

    private static boolean lIIlIIIIIlI(int i, int i2) {
        return i >= i2;
    }

    private static void ag() {
        int[] iArr = new int[lIlIllII[1]];
        iArr[lIlIllII[0]] = lIlIllII[10];
        if (lIIIllllIll(Bank.contains(iArr) ? 1 : 0)) {
            bB.add(new C0003d(lIlIllII[10], lIlIllII[1], lIlIllII[46]));
            "".length();
        }
        int[] iArr2 = new int[lIlIllII[1]];
        iArr2[lIlIllII[0]] = lIlIllII[14];
        if (lIIIllllIll(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(lIlIllII[14], lIlIllII[1], lIlIllII[47]));
            "".length();
        }
        int[] iArr3 = new int[lIlIllII[1]];
        iArr3[lIlIllII[0]] = lIlIllII[4];
        if (lIIIllllIll(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(lIlIllII[4], lIlIllII[48], lIlIllII[49]));
            "".length();
        }
        if (lIIIllllIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIlIlI[lIlIllII[56]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(lIlIllII[50], lIlIllII[7], lIlIllII[51]));
            "".length();
        }
        int[] iArr4 = new int[lIlIllII[1]];
        iArr4[lIlIllII[0]] = lIlIllII[11];
        if (lIIIllllIll(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(lIlIllII[11], lIlIllII[15], lIlIllII[52]));
            "".length();
        }
        int[] iArr5 = new int[lIlIllII[1]];
        iArr5[lIlIllII[0]] = lIlIllII[16];
        if (lIIIllllIll(Bank.contains(iArr5) ? 1 : 0)) {
            bB.add(new C0003d(lIlIllII[16], lIlIllII[15], lIlIllII[52]));
            "".length();
        }
        int[] iArr6 = new int[lIlIllII[1]];
        iArr6[lIlIllII[0]] = lIlIllII[13];
        if (lIIIllllIll(Bank.contains(iArr6) ? 1 : 0)) {
            bB.add(new C0003d(lIlIllII[13], lIlIllII[53], lIlIllII[52]));
            "".length();
        }
        int[] iArr7 = new int[lIlIllII[1]];
        iArr7[lIlIllII[0]] = lIlIllII[12];
        if (lIIIllllIll(Bank.contains(iArr7) ? 1 : 0)) {
            bB.add(new C0003d(lIlIllII[12], lIlIllII[7], C0008i.bw));
            "".length();
        }
    }

    static {
        lIIIlllIllI();
        lIIIlllIlIl();
        String[] strArr = new String[lIlIllII[24]];
        strArr[lIlIllII[0]] = lIlIlIlI[lIlIllII[62]];
        strArr[lIlIllII[1]] = lIlIlIlI[lIlIllII[63]];
        strArr[lIlIllII[3]] = lIlIlIlI[lIlIllII[64]];
        strArr[lIlIllII[5]] = lIlIlIlI[lIlIllII[65]];
        strArr[lIlIllII[6]] = lIlIlIlI[lIlIllII[66]];
        strArr[lIlIllII[7]] = lIlIlIlI[lIlIllII[67]];
        strArr[lIlIllII[9]] = lIlIlIlI[lIlIllII[68]];
        strArr[lIlIllII[17]] = lIlIlIlI[lIlIllII[69]];
        strArr[lIlIllII[18]] = lIlIlIlI[lIlIllII[70]];
        strArr[lIlIllII[19]] = lIlIlIlI[lIlIllII[71]];
        strArr[lIlIllII[15]] = lIlIlIlI[lIlIllII[72]];
        strArr[lIlIllII[20]] = lIlIlIlI[lIlIllII[73]];
        strArr[lIlIllII[21]] = lIlIlIlI[lIlIllII[48]];
        strArr[lIlIllII[22]] = lIlIlIlI[lIlIllII[74]];
        strArr[lIlIllII[23]] = lIlIlIlI[lIlIllII[75]];
        in = strArr;
        io = new WorldPoint(lIlIllII[76], lIlIllII[77], lIlIllII[0]);
        ip = new WorldPoint(lIlIllII[78], lIlIllII[79], lIlIllII[0]);
        iq = new WorldPoint(lIlIllII[80], lIlIllII[81], lIlIllII[0]);
        ir = new WorldPoint(lIlIllII[82], lIlIllII[83], lIlIllII[0]);
        is = new WorldPoint(lIlIllII[84], lIlIllII[85], lIlIllII[0]);
        it = new WorldPoint(lIlIllII[86], lIlIllII[87], lIlIllII[0]);
        bB = new ArrayList();
        bZ = lIlIllII[0];
    }

    private static boolean lIIIllllIIl(int i) {
        return i != 0;
    }

    private static int lIIIlllIlll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlIIIIIIl(int i, int i2) {
        return i == i2;
    }

    private static void lIIIlllIlIl() {
        lIlIlIlI = new String[lIlIllII[88]];
        lIlIlIlI[lIlIllII[0]] = lIIIllIllll("CSAMLBgsdRwxEyYm", "KUuEv");
        lIlIlIlI[lIlIllII[1]] = lIIIllIllll("CwQLLyslCAFmOjgUDCg/bQQRIzU+QUU1LyQZBi4xIwpFJDkuBkUyN20cECMrOQ==", "MmeFX");
        lIlIlIlI[lIlIllII[3]] = lIIIlllIIII("j0cg4P5LOh8=", "ggFeM");
        lIlIlIlI[lIlIllII[5]] = lIIIlllIIIl("C5Lq4GDJa0c=", "GAptc");
        lIlIlIlI[lIlIllII[6]] = lIIIllIllll("IQYlaDAARzEpKgQ=", "ogSHD");
        lIlIlIlI[lIlIllII[7]] = lIIIlllIIII("hPE59NOqkacwp4Zh1aWtNIuwz2bFWAFo", "RyKyU");
        lIlIlIlI[lIlIllII[9]] = lIIIlllIIII("HzgW8bacgs2vnTE/WbemUQ3CcJK1MUM1kOjwkyhCYY4Hh0lzUa0h7Ca1O1fC0UY96kcMsVKWsvM=", "VwRaJ");
        lIlIlIlI[lIlIllII[17]] = lIIIllIllll("GzMPWQw6cgoNGScm", "URyyx");
        lIlIlIlI[lIlIllII[18]] = lIIIlllIIII("97Lwu0emXz6+fHrXo0YuxA==", "zlARV");
        lIlIlIlI[lIlIllII[19]] = lIIIllIllll("PQI6KA==", "ypUXl");
        lIlIlIlI[lIlIllII[15]] = lIIIlllIIII("5rAfKJLZMOw=", "fqpxo");
        lIlIlIlI[lIlIllII[20]] = lIIIlllIIII("vXAaHz0gO+kOo5UPMWbsgA==", "tYVna");
        lIlIlIlI[lIlIllII[21]] = lIIIlllIIII("4iHGon5oels=", "zIOrS");
        lIlIlIlI[lIlIllII[22]] = lIIIlllIIII("hGJyHRaS1no=", "tryqa");
        lIlIlIlI[lIlIllII[23]] = lIIIlllIIIl("/6dUpRtMqHIaPGFIUb/aoQ==", "cdYlU");
        lIlIlIlI[lIlIllII[24]] = lIIIllIllll("BT0ABys=", "VMacN");
        lIlIlIlI[lIlIllII[25]] = lIIIlllIIII("OiYJT+5glAI=", "owiMp");
        lIlIlIlI[lIlIllII[26]] = lIIIlllIIIl("ZbR70rvJslxy7omwGSWjVw==", "ehzCK");
        lIlIlIlI[lIlIllII[27]] = lIIIllIllll("GycoHAY=", "HWIxc");
        lIlIlIlI[lIlIllII[28]] = lIIIllIllll("Mjo0", "vSScc");
        lIlIlIlI[lIlIllII[29]] = lIIIlllIIII("ww5uKORPtPuCoA8A54/fxg==", "jFXWh");
        lIlIlIlI[lIlIllII[30]] = lIIIlllIIII("5EVeVHMydXk=", "IMiEd");
        lIlIlIlI[lIlIllII[31]] = lIIIlllIIIl("RuuztQold2Y=", "BsZry");
        lIlIlIlI[lIlIllII[32]] = lIIIlllIIIl("vhu1eSG7+ZnWr5iRrNJK2A==", "cJXKx");
        lIlIlIlI[lIlIllII[33]] = lIIIlllIIIl("9ldwEFpd97k=", "zwcJB");
        lIlIlIlI[lIlIllII[34]] = lIIIlllIIII("Cmm+vs+ZS2A=", "ymWdk");
        lIlIlIlI[lIlIllII[35]] = lIIIllIllll("HzkGUDA+eAYVKyJ4FhkqOCsY", "QXppD");
        lIlIlIlI[lIlIllII[36]] = lIIIlllIIII("8LBZZZV/9QyiRBOAg5DsJw==", "AqhYB");
        lIlIlIlI[lIlIllII[37]] = lIIIlllIIII("gP2bItSOe3U=", "TmNSr");
        lIlIlIlI[lIlIllII[40]] = lIIIlllIIIl("/l46PSH2w7LdcmBnUOXyWg==", "CrvrQ");
        lIlIlIlI[lIlIllII[41]] = lIIIlllIIIl("T9vYp0Bmw2Q=", "zlBWD");
        lIlIlIlI[lIlIllII[42]] = lIIIlllIIIl("9P2SfyYn7K77lmPGMMnc8g2eIIOdwOxr", "AqVEO");
        lIlIlIlI[lIlIllII[43]] = lIIIllIllll("OS0tHycY", "jALfB");
        lIlIlIlI[lIlIllII[44]] = lIIIlllIIIl("OA0B+79YA9Y=", "ENUyR");
        lIlIlIlI[lIlIllII[45]] = lIIIlllIIIl("k9YNexFkZAo=", "vxaVn");
        lIlIlIlI[lIlIllII[55]] = lIIIllIllll("HVApEzUuA2QGLyBQNwIoMVA1ByI2BA==", "EpDrG");
        lIlIlIlI[lIlIllII[56]] = lIIIlllIIIl("hQI9wApA6I83wTv5GDbYVud4tE2E9+mv", "QPRFT");
        lIlIlIlI[lIlIllII[57]] = lIIIlllIIIl("dXuXvxZ5q4I=", "GQmnF");
        lIlIlIlI[lIlIllII[58]] = lIIIlllIIII("mcdgjOjfbQk=", "QWCUj");
        lIlIlIlI[lIlIllII[59]] = lIIIlllIIIl("NmKurUs6nT4=", "gqsvU");
        lIlIlIlI[lIlIllII[53]] = lIIIlllIIIl("TXn4t1VFoyc=", "GUljg");
        lIlIlIlI[lIlIllII[60]] = lIIIlllIIII("CqXlO17eYmw=", "xXrLd");
        lIlIlIlI[lIlIllII[61]] = lIIIlllIIIl("CY9D24+Z8yo=", "mGtYb");
        lIlIlIlI[lIlIllII[62]] = lIIIlllIIII("4PwEaf1p5xWqEHvMG6Cml+UmoTd5PCiXTA0736gbeT8=", "kGyip");
        lIlIlIlI[lIlIllII[63]] = lIIIllIllll("N1MCCQ0FAEUKClYKChAeVhUMCwkFB0UEABNTFQkJFwAASw==", "vseel");
        lIlIlIlI[lIlIllII[64]] = lIIIlllIIII("nDwBUaRkIZblbt6aYW1M+2nlb+eNygkd", "KsfHh");
        lIlIlIlI[lIlIllII[65]] = lIIIlllIIIl("aT1QJfc9IYw=", "AaTjS");
        lIlIlIlI[lIlIllII[66]] = lIIIllIllll("PnEadRsYORw8GRB2EToFVzdXJAISJQN0", "wVwUw");
        lIlIlIlI[lIlIllII[67]] = lIIIlllIIIl("QgaVot2yK3SaAqgRip5YUODkkshl1BiG", "JXyiv");
        lIlIlIlI[lIlIllII[68]] = lIIIlllIIIl("19ysqF6SBWbaHDVCPWfje0CBfO3Kr5246qa74lupDpxpX1wr5FNrzw==", "SClOk");
        lIlIlIlI[lIlIllII[69]] = lIIIlllIIIl("61K+S7nA44YS8dlF3TH1FjXx+nBtekAueW4ekQhSpE8ou3KnnmX4fYFcNBbuAAL1", "Diizm");
        lIlIlIlI[lIlIllII[70]] = lIIIllIllll("Hx8cT0woFRtDGCMWAEMBI1obCw0yWhgLCWYKHgwOKh8BQwU1VA==", "Fzlcl");
        lIlIlIlI[lIlIllII[71]] = lIIIlllIIII("zetUVaTQgug=", "KnzIb");
        lIlIlIlI[lIlIllII[72]] = lIIIllIllll("GG8/ahw0KSAjBTZoMyRLMCUnJg4laD0sSzYgPTkfcTsiLwo6aQ==", "QHRJk");
        lIlIlIlI[lIlIllII[73]] = lIIIllIllll("Gz03a1oLfylnCTcqIWk=", "BXDGz");
        lIlIlIlI[lIlIllII[48]] = lIIIllIllll("EAQ+eCU5BWkRZjAOJSh5", "XkIXF");
        lIlIlIlI[lIlIllII[74]] = lIIIlllIIII("cUcIRPOZoQQQGosXOT4kY+1BzYBS159pfrFBmx/mZNk=", "qaKQp");
        lIlIlIlI[lIlIllII[75]] = lIIIllIllll("FQUFTTt2DA4BAmk=", "Vdkmr");
    }

    private static boolean lIIIllllllI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIlllllII(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (lIIlIIIIIlI(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[18])) {
            int[] iArr = new int[lIlIllII[1]];
            iArr[lIlIllII[0]] = lIlIllII[38];
            if (lIIIllllIll(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIlIllII[1];
                "".length();
                return "   ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIlIllII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ac() {
        String[] strArr = new String[lIlIllII[1]];
        strArr[lIlIllII[0]] = lIlIlIlI[lIlIllII[45]];
        if (lIIIllllIIl(Inventory.contains(strArr) ? 1 : 0)) {
            int[] iArr = new int[lIlIllII[1]];
            iArr[lIlIllII[0]] = lIlIllII[4];
            if (lIIIllllIIl(Inventory.contains(iArr) ? 1 : 0)) {
                ?? r0 = lIlIllII[1];
                "".length();
                return (-" ".length()) < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIlIllII[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v355, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v400, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v62, types: [boolean] */
    public static void ck() {
        if (lIIIllllIIl(bz ? 1 : 0)) {
            AccBuilderBarrows.c = lIlIlIlI[lIlIllII[0]];
            C0001b.a(bB);
            if (lIIIllllIlI(bB.size(), lIlIllII[1])) {
                System.out.println(lIlIlIlI[lIlIllII[1]]);
                bz = lIlIllII[0];
            }
        }
        if (lIIIllllIll(bz ? 1 : 0)) {
            if (lIIIllllIIl(Inventory.contains(C0005f.bb) ? 1 : 0) && lIIIllllIlI(Movement.getRunEnergy(), lIlIllII[2])) {
                Inventory.getFirst(C0005f.bb).interact(lIlIlIlI[lIlIllII[3]]);
                Time.sleepTicks(lIlIllII[1]);
                "".length();
            }
            if (lIIIlllllII(lIIIlllIlll(C0004e.v(), 70.0d))) {
                int[] iArr = new int[lIlIllII[1]];
                iArr[lIlIllII[0]] = lIlIllII[4];
                if (lIIIllllIIl(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlIllII[1]];
                    iArr2[lIlIllII[0]] = lIlIllII[4];
                    Inventory.getFirst(iArr2).interact(lIlIlIlI[lIlIllII[5]]);
                }
            }
            if (lIIIllllIll(Movement.isRunEnabled() ? 1 : 0) && lIIIlllllIl(Movement.getRunEnergy())) {
                Movement.toggleRun();
            }
            if (lIIIllllIll(ac() ? 1 : 0) && lIIIllllIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()))) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIllllllI(nearest) && lIIIllllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIlIlIlI[lIlIllII[6]];
                    C0000a.a(nearest);
                    Time.sleepTicks(lIlIllII[3]);
                    "".length();
                }
                if (lIIIllllllI(nearest) && lIIIllllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIlIlIlI[lIlIllII[7]];
                    if (lIIIllllIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIllII[8]);
                        "".length();
                    }
                    if (lIIIllllIIl(Bank.isOpen() ? 1 : 0)) {
                        if (lIIIlllllIl(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIllII[6]);
                            "".length();
                        }
                        if (lIIIlllllIl(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIllII[3]);
                            "".length();
                        }
                        int[] iArr3 = new int[lIlIllII[9]];
                        iArr3[lIlIllII[0]] = lIlIllII[10];
                        iArr3[lIlIllII[1]] = lIlIllII[11];
                        iArr3[lIlIllII[3]] = lIlIllII[12];
                        iArr3[lIlIllII[5]] = lIlIllII[13];
                        iArr3[lIlIllII[6]] = lIlIllII[4];
                        iArr3[lIlIllII[7]] = lIlIllII[14];
                        if (lIIIllllIll(C0004e.b(iArr3) ? 1 : 0)) {
                            ag();
                            System.out.println(lIlIlIlI[lIlIllII[9]]);
                            bz = lIlIllII[1];
                            return;
                        }
                        int[] iArr4 = new int[lIlIllII[9]];
                        iArr4[lIlIllII[0]] = lIlIllII[10];
                        iArr4[lIlIllII[1]] = lIlIllII[11];
                        iArr4[lIlIllII[3]] = lIlIllII[12];
                        iArr4[lIlIllII[5]] = lIlIllII[13];
                        iArr4[lIlIllII[6]] = lIlIllII[4];
                        iArr4[lIlIllII[7]] = lIlIllII[14];
                        if (lIIIllllIIl(C0004e.b(iArr4) ? 1 : 0)) {
                            Bank.withdraw(lIlIllII[11], lIlIllII[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIllII[1]);
                            "".length();
                            Bank.withdraw(lIlIllII[14], lIlIllII[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIllII[1]);
                            "".length();
                            Bank.withdraw(lIlIllII[16], lIlIllII[15], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIllII[1]);
                            "".length();
                            Bank.withdraw(lIlIllII[13], lIlIllII[7], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIllII[1]);
                            "".length();
                            Bank.withdraw(lIlIllII[10], lIlIllII[1], Bank.WithdrawMode.DEFAULT);
                            Time.sleepTicks(lIlIllII[1]);
                            "".length();
                            C0000a.b(C0005f.bb, lIlIllII[6]);
                            C0000a.a(lIlIllII[4], lIlIllII[15]);
                            C0000a.b(C0005f.bl, lIlIllII[1]);
                        }
                    }
                }
            }
            if (lIIIllllIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId())) && lIIIllllIIl(ac() ? 1 : 0)) {
                if (lIIIlllllll(Players.getLocal().getWorldLocation().distanceTo(io), lIlIllII[3])) {
                    AccBuilderBarrows.c = lIlIlIlI[lIlIllII[17]];
                    if (lIIIllllIlI(bZ, lIlIllII[1])) {
                        C0004e.w();
                        bZ += lIlIllII[1];
                    }
                    Movement.walkTo(io);
                    "".length();
                    Time.sleepTicks(lIlIllII[1]);
                    "".length();
                }
                if (lIIlIIIIIII(Players.getLocal().getWorldLocation().distanceTo(io), lIlIllII[3])) {
                    AccBuilderBarrows.c = lIlIlIlI[lIlIllII[18]];
                    if (lIIIllllIll(lIIIllllIII(g, 0L))) {
                        g = System.currentTimeMillis();
                    }
                    if (lIIIllllIIl(lIIIllllIII(g, 0L)) && lIIIlllllIl(lIIIllllIII(C0004e.a(g), 30000L))) {
                        bZ = lIlIllII[0];
                        g = System.currentTimeMillis();
                    }
                    if (lIIIllllIlI(bZ, lIlIllII[1])) {
                        C0004e.w();
                        bZ += lIlIllII[1];
                    }
                    if (lIIIllllIIl(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr5 = new int[lIlIllII[1]];
                        iArr5[lIlIllII[0]] = lIlIllII[4];
                        Inventory.getFirst(iArr5).interact(lIlIlIlI[lIlIllII[19]]);
                        Time.sleepTicks(lIlIllII[3]);
                        "".length();
                    }
                    C0006g.a(lIlIlIlI[lIlIllII[15]], in, lIlIllII[1]);
                }
            }
            if (lIIlIIIIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[1])) {
                ci = lIlIllII[0];
                String[] strArr = new String[lIlIllII[1]];
                strArr[lIlIllII[0]] = lIlIlIlI[lIlIllII[20]];
                if (lIIIllllIll(Inventory.contains(strArr) ? 1 : 0)) {
                    C0006g.a(in);
                }
            }
            if (lIIlIIIIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[3])) {
                if (lIIIllllIIl(Inventory.contains(item -> {
                    return item.getName().contains(lIlIlIlI[lIlIllII[61]]);
                }) ? 1 : 0) && lIIIllllIll(Equipment.contains(item2 -> {
                    return item2.getName().contains(lIlIlIlI[lIlIllII[60]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item3 -> {
                        return item3.getName().contains(lIlIlIlI[lIlIllII[53]]);
                    }).interact(lIlIlIlI[lIlIllII[21]]);
                }
                if (lIIIllllIIl(Inventory.contains(item4 -> {
                    return item4.getName().contains(lIlIlIlI[lIlIllII[59]]);
                }) ? 1 : 0) && lIIIllllIll(Equipment.contains(item5 -> {
                    return item5.getName().contains(lIlIlIlI[lIlIllII[58]]);
                }) ? 1 : 0)) {
                    Inventory.getFirst(item6 -> {
                        return item6.getName().contains(lIlIlIlI[lIlIllII[57]]);
                    }).interact(lIlIlIlI[lIlIllII[22]]);
                }
                if (lIIIllllIll(Players.getLocal().getWorldLocation().equals(ip) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIlIlIlI[lIlIllII[23]];
                    Movement.walkTo(ip);
                    "".length();
                    Time.sleepTicks(lIlIllII[1]);
                    "".length();
                }
                if (lIIIllllIIl(Players.getLocal().getWorldLocation().equals(ip) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIllII[1]];
                    strArr2[lIlIllII[0]] = lIlIlIlI[lIlIllII[24]];
                    Inventory.getFirst(strArr2).interact(lIlIlIlI[lIlIllII[25]]);
                    Time.sleepTicks(lIlIllII[3]);
                    "".length();
                }
            }
            if (lIIlIIIIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[5])) {
                if (lIIIllllIll(Players.getLocal().getWorldLocation().equals(iq) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIlIlIlI[lIlIllII[26]];
                    Movement.walkTo(iq);
                    "".length();
                    Time.sleepTicks(lIlIllII[1]);
                    "".length();
                }
                if (lIIIllllIIl(Players.getLocal().getWorldLocation().equals(iq) ? 1 : 0)) {
                    String[] strArr3 = new String[lIlIllII[1]];
                    strArr3[lIlIllII[0]] = lIlIlIlI[lIlIllII[27]];
                    Inventory.getFirst(strArr3).interact(lIlIlIlI[lIlIllII[28]]);
                    Time.sleepTicks(lIlIllII[3]);
                    "".length();
                }
            }
            if (lIIlIIIIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[6])) {
                if (lIIIllllIll(Players.getLocal().getWorldLocation().equals(ir) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIlIlIlI[lIlIllII[29]];
                    Movement.walkTo(ir);
                    "".length();
                    Time.sleepTicks(lIlIllII[1]);
                    "".length();
                }
                if (lIIIllllIIl(Players.getLocal().getWorldLocation().equals(ir) ? 1 : 0)) {
                    String[] strArr4 = new String[lIlIllII[1]];
                    strArr4[lIlIllII[0]] = lIlIlIlI[lIlIllII[30]];
                    Inventory.getFirst(strArr4).interact(lIlIlIlI[lIlIllII[31]]);
                    Time.sleepTicks(lIlIllII[3]);
                    "".length();
                }
            }
            if (lIIlIIIIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[7])) {
                if (lIIIllllIll(Players.getLocal().getWorldLocation().equals(is) ? 1 : 0)) {
                    AccBuilderBarrows.c = lIlIlIlI[lIlIllII[32]];
                    Movement.walkTo(is);
                    "".length();
                    Time.sleepTicks(lIlIllII[1]);
                    "".length();
                }
                if (lIIIllllIIl(Players.getLocal().getWorldLocation().equals(is) ? 1 : 0)) {
                    String[] strArr5 = new String[lIlIllII[1]];
                    strArr5[lIlIllII[0]] = lIlIlIlI[lIlIllII[33]];
                    Inventory.getFirst(strArr5).interact(lIlIlIlI[lIlIllII[34]]);
                    Time.sleepTicks(lIlIllII[3]);
                    "".length();
                }
            }
            if (lIIlIIIIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[9])) {
                if (lIIIlllllll(Players.getLocal().getWorldLocation().distanceTo(it), lIlIllII[5])) {
                    AccBuilderBarrows.c = lIlIlIlI[lIlIllII[35]];
                    Movement.walkTo(it);
                    "".length();
                    Time.sleepTicks(lIlIllII[1]);
                    "".length();
                }
                if (lIIlIIIIIII(Players.getLocal().getWorldLocation().distanceTo(it), lIlIllII[5])) {
                    AccBuilderBarrows.c = lIlIlIlI[lIlIllII[36]];
                    if (lIIIllllIlI(ci, lIlIllII[1])) {
                        Q.mj += lIlIllII[1];
                        Q.o(AccBuilderBarrows.m);
                        ci += lIlIllII[1];
                        Q.mj = lIlIllII[0];
                        cj = lIlIllII[0];
                    }
                    C0006g.a(lIlIlIlI[lIlIllII[37]], in);
                }
            }
            if (lIIlIIIIIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIlIllII[17])) {
                C0006g.a(in);
            }
            do {
                int[] iArr6 = new int[lIlIllII[1]];
                iArr6[lIlIllII[0]] = lIlIllII[38];
                if (!lIIIllllIIl(Inventory.contains(iArr6) ? 1 : 0)) {
                    C0006g.a(new String[lIlIllII[0]]);
                    return;
                }
                if (lIIIllllllI(Widgets.get(lIlIllII[39]))) {
                    AccBuilderBarrows.c = lIlIlIlI[lIlIllII[40]];
                    int[] iArr7 = new int[lIlIllII[1]];
                    iArr7[lIlIllII[0]] = lIlIllII[38];
                    Inventory.getFirst(iArr7).interact(lIlIlIlI[lIlIllII[41]]);
                    Time.sleepTicks(lIlIllII[6]);
                    "".length();
                    AccBuilderBarrows.c = lIlIlIlI[lIlIllII[42]];
                    Widget widget = Widgets.get(lIlIllII[39], lIlIllII[23]);
                    if (lIIIllllllI(widget)) {
                        widget.interact(lIlIlIlI[lIlIllII[43]]);
                        Time.sleepTicks(lIlIllII[1]);
                        "".length();
                    }
                    Widget widget2 = Widgets.get(lIlIllII[39], lIlIllII[35]);
                    if (lIIIllllllI(widget2)) {
                        widget2.interact(lIlIlIlI[lIlIllII[44]]);
                        Time.sleepTicks(lIlIllII[3]);
                        "".length();
                    }
                }
                Time.sleepTicks(lIlIllII[1]);
                "".length();
                "".length();
            } while ((true ^ true) == (true ^ true));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return lIlIllII[0];
    }

    private static int lIIIllllIII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            ck();
            "".length();
            if ((-" ".length()) >= 0) {
                return (75 ^ 102) & ((173 ^ 128) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIllII[54];
    }

    private static String lIIIllIllll(String lIlllIlllllIlII, String lIlllIlllllIIll) {
        String str = new String(Base64.getDecoder().decode(lIlllIlllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlllIlllllIIll.toCharArray();
        int lIlllIlllllIIII = lIlIllII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int lIlllIllllIlIII = lIlIllII[0];
        while (lIIIllllIlI(lIlllIllllIlIII, length)) {
            char lIlllIlllllIlIl = charArray2[lIlllIllllIlIII];
            sb.append((char) (lIlllIlllllIlIl ^ charArray[lIlllIlllllIIII % charArray.length]));
            "".length();
            lIlllIlllllIIII++;
            lIlllIllllIlIII++;
            "".length();
            if ((-" ".length()) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIlllllll(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIIIIII(int i, int i2) {
        return i <= i2;
    }

    private static String lIIIlllIIII(String lIlllIlllIlllll, String lIlllIlllIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIlllIllllI.getBytes(StandardCharsets.UTF_8)), lIlIllII[18]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlllIlllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIllllIIIII) {
            lIlllIllllIIIII.printStackTrace();
            return null;
        }
    }

    private static String lIIIlllIIIl(String lIlllIlllIlIIlI, String lIlllIlllIlIIIl) {
        try {
            SecretKeySpec lIlllIlllIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIlllIlIlII = Cipher.getInstance("Blowfish");
            lIlllIlllIlIlII.init(lIlIllII[3], lIlllIlllIlIlIl);
            return new String(lIlllIlllIlIlII.doFinal(Base64.getDecoder().decode(lIlllIlllIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIlllIlIIll) {
            lIlllIlllIlIIll.printStackTrace();
            return null;
        }
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lIlIlIlI[lIlIllII[55]];
    }

    private static boolean lIIIllllIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIllllIll(int i) {
        return i == 0;
    }

    private static void lIIIlllIllI() {
        lIlIllII = new int[89];
        lIlIllII[0] = (215 ^ 182) & ((15 ^ 110) ^ (-1));
        lIlIllII[1] = " ".length();
        lIlIllII[2] = (49 ^ 98) ^ (67 ^ 86);
        lIlIllII[3] = "  ".length();
        lIlIllII[4] = (-((-13905) & 16085)) & (-13825) & 16383;
        lIlIllII[5] = "   ".length();
        lIlIllII[6] = 81 ^ 85;
        lIlIllII[7] = 130 ^ 135;
        lIlIllII[8] = (-((-2315) & 10591)) & (-18466) & 31741;
        lIlIllII[9] = 72 ^ 78;
        lIlIllII[10] = (-16418) & 28395;
        lIlIllII[11] = (-((-4874) & 21407)) & (-33) & 24573;
        lIlIllII[12] = (-19597) & 32221;
        lIlIllII[13] = (-((-3143) & 27903)) & (-1) & 32767;
        lIlIllII[14] = (-((-8329) & 11471)) & (-16386) & 20479;
        lIlIllII[15] = (168 ^ 143) ^ (43 ^ 6);
        lIlIllII[16] = (-8337) & 16345;
        lIlIllII[17] = (113 ^ 100) ^ (12 ^ 30);
        lIlIllII[18] = 81 ^ 89;
        lIlIllII[19] = 79 ^ 70;
        lIlIllII[20] = (((32 + 126) - 46) + 20) ^ (((25 + 136) - 69) + 51);
        lIlIllII[21] = 138 ^ 134;
        lIlIllII[22] = 89 ^ 84;
        lIlIllII[23] = 149 ^ 155;
        lIlIllII[24] = (74 ^ 116) ^ (144 ^ 161);
        lIlIllII[25] = (((167 + 139) - 267) + 174) ^ (((58 + 32) - 12) + 119);
        lIlIllII[26] = 18 ^ 3;
        lIlIllII[27] = 133 ^ 151;
        lIlIllII[28] = (((98 + 42) - 16) + 28) ^ (((30 + 11) - (-90)) + 8);
        lIlIllII[29] = 150 ^ 130;
        lIlIllII[30] = 62 ^ 43;
        lIlIllII[31] = (((60 + 133) - 110) + 53) ^ (((74 + 71) - 46) + 59);
        lIlIllII[32] = (((24 + 43) - (-16)) + 126) ^ (((189 + 24) - 194) + 179);
        lIlIllII[33] = 18 ^ 10;
        lIlIllII[34] = 127 ^ 102;
        lIlIllII[35] = ((145 ^ 156) & ((200 ^ 197) ^ (-1))) ^ (12 ^ 22);
        lIlIllII[36] = 179 ^ 168;
        lIlIllII[37] = (106 ^ 94) ^ (191 ^ 151);
        lIlIllII[38] = (-((-23075) & 24438)) & (-8197) & 32631;
        lIlIllII[39] = (((((89 + 133) - 93) + 23) + (38 ^ 105)) - (29 ^ 80)) + (253 ^ 171);
        lIlIllII[40] = (96 ^ 79) ^ (34 ^ 16);
        lIlIllII[41] = (((114 + 11) - 48) + 85) ^ (((12 + 90) - 55) + 141);
        lIlIllII[42] = (14 ^ 75) ^ (252 ^ 166);
        lIlIllII[43] = (((27 + 41) - (-2)) + 64) ^ (((21 + 15) - 16) + 146);
        lIlIllII[44] = 21 ^ 52;
        lIlIllII[45] = (132 ^ 128) ^ (181 ^ 147);
        lIlIllII[46] = (-16642) & 32541;
        lIlIllII[47] = (-2241) & 8140;
        lIlIllII[48] = 54 ^ 1;
        lIlIllII[49] = (-3083) & 3582;
        lIlIllII[50] = (-20531) & 32510;
        lIlIllII[51] = (-((-26540) & 30639)) & (-1541) & 30639;
        lIlIllII[52] = (-((-17761) & 26083)) & (-4113) & 14334;
        lIlIllII[53] = (36 ^ 81) ^ (42 ^ 119);
        lIlIllII[54] = 15 ^ 107;
        lIlIllII[55] = 167 ^ 132;
        lIlIllII[56] = 56 ^ 28;
        lIlIllII[57] = (197 ^ 156) ^ (207 ^ 179);
        lIlIllII[58] = (((4 + 37) - (-48)) + 96) ^ (((42 + 53) - 83) + 147);
        lIlIllII[59] = (201 ^ 149) ^ (204 ^ 183);
        lIlIllII[60] = (((89 + 66) - 124) + 152) ^ (((97 + 69) - 51) + 43);
        lIlIllII[61] = 104 ^ 66;
        lIlIllII[62] = 238 ^ 197;
        lIlIllII[63] = 238 ^ 194;
        lIlIllII[64] = 82 ^ 127;
        lIlIllII[65] = (51 ^ 70) ^ (120 ^ 35);
        lIlIllII[66] = 108 ^ 67;
        lIlIllII[67] = (31 ^ 94) ^ (235 ^ 154);
        lIlIllII[68] = 97 ^ 80;
        lIlIllII[69] = 20 ^ 38;
        lIlIllII[70] = 49 ^ 2;
        lIlIllII[71] = (((155 + 48) - 188) + 165) ^ (((94 + 66) - 133) + 101);
        lIlIllII[72] = 110 ^ 91;
        lIlIllII[73] = 116 ^ 66;
        lIlIllII[74] = (118 ^ 106) ^ (6 ^ 34);
        lIlIllII[75] = (((99 + 128) - 103) + 12) ^ (((40 + 57) - (-8)) + 72);
        lIlIllII[76] = (-((-19515) & 20347)) & (-16419) & 20479;
        lIlIllII[77] = (-786) & 4025;
        lIlIllII[78] = (-((-25895) & 30567)) & (-8193) & 16094;
        lIlIllII[79] = (-((-1157) & 30693)) & (-21) & 32765;
        lIlIllII[80] = (-((-25777) & 30457)) & (-16389) & 24271;
        lIlIllII[81] = (-4353) & 7564;
        lIlIllII[82] = (-((-17415) & 30175)) & (-515) & 16383;
        lIlIllII[83] = (-((-21900) & 30639)) & (-16409) & 28411;
        lIlIllII[84] = (-((-3463) & 16263)) & (-346) & 16223;
        lIlIllII[85] = (-((-39) & 25447)) & (-4101) & 32767;
        lIlIllII[86] = (-20498) & 23551;
        lIlIllII[87] = (-((-3513) & 32761)) & (-1) & 32494;
        lIlIllII[88] = 118 ^ 76;
    }
}
