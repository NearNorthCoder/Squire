package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.O  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/O.class */
public class O implements G {
    private static /* synthetic */ String[] lIIIllllll;
    public static final /* synthetic */ WorldPoint ja;
    public static final /* synthetic */ WorldPoint iZ;
    public static /* synthetic */ List<C0003d> bv;
    static /* synthetic */ int bT;
    public static /* synthetic */ WorldPoint iS;
    static /* synthetic */ WorldArea iY;
    static /* synthetic */ int iX;
    public static final /* synthetic */ WorldPoint jc;
    static /* synthetic */ int bV;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint jg;
    public static /* synthetic */ WorldPoint iR;
    private static /* synthetic */ int[] lIIlIIIIIl;
    public static final /* synthetic */ WorldPoint jb;
    public static final /* synthetic */ WorldPoint jf;
    public static final /* synthetic */ WorldPoint je;
    public static /* synthetic */ WorldPoint iT;
    public static /* synthetic */ long iU;
    public static final /* synthetic */ WorldPoint jh;
    static /* synthetic */ int cz;
    static /* synthetic */ int iW;
    public static final /* synthetic */ WorldPoint jd;
    public static /* synthetic */ String[] iV;

    private static boolean llllIIlllIII(int i, int i2) {
        return i < i2;
    }

    static {
        llllIIllIllI();
        llllIIllIlIl();
        bv = new ArrayList();
        iR = new WorldPoint(lIIlIIIIIl[56], lIIlIIIIIl[57], lIIlIIIIIl[0]);
        iS = new WorldPoint(lIIlIIIIIl[58], lIIlIIIIIl[59], lIIlIIIIIl[0]);
        iT = new WorldPoint(lIIlIIIIIl[0], lIIlIIIIIl[0], lIIlIIIIIl[0]);
        iU = System.currentTimeMillis();
        String[] strArr = new String[lIIlIIIIIl[60]];
        strArr[lIIlIIIIIl[0]] = lIIIllllll[lIIlIIIIIl[61]];
        strArr[lIIlIIIIIl[1]] = lIIIllllll[lIIlIIIIIl[62]];
        strArr[lIIlIIIIIl[3]] = lIIIllllll[lIIlIIIIIl[60]];
        strArr[lIIlIIIIIl[4]] = lIIIllllll[lIIlIIIIIl[63]];
        strArr[lIIlIIIIIl[9]] = lIIIllllll[lIIlIIIIIl[64]];
        strArr[lIIlIIIIIl[13]] = lIIIllllll[lIIlIIIIIl[65]];
        strArr[lIIlIIIIIl[18]] = lIIIllllll[lIIlIIIIIl[66]];
        strArr[lIIlIIIIIl[19]] = lIIIllllll[lIIlIIIIIl[67]];
        strArr[lIIlIIIIIl[20]] = lIIIllllll[lIIlIIIIIl[68]];
        strArr[lIIlIIIIIl[22]] = lIIIllllll[lIIlIIIIIl[69]];
        strArr[lIIlIIIIIl[14]] = lIIIllllll[lIIlIIIIIl[70]];
        strArr[lIIlIIIIIl[23]] = lIIIllllll[lIIlIIIIIl[2]];
        strArr[lIIlIIIIIl[24]] = lIIIllllll[lIIlIIIIIl[71]];
        strArr[lIIlIIIIIl[25]] = lIIIllllll[lIIlIIIIIl[72]];
        strArr[lIIlIIIIIl[26]] = lIIIllllll[lIIlIIIIIl[73]];
        strArr[lIIlIIIIIl[17]] = lIIIllllll[lIIlIIIIIl[74]];
        strArr[lIIlIIIIIl[27]] = lIIIllllll[lIIlIIIIIl[75]];
        strArr[lIIlIIIIIl[28]] = lIIIllllll[lIIlIIIIIl[76]];
        strArr[lIIlIIIIIl[29]] = lIIIllllll[lIIlIIIIIl[77]];
        strArr[lIIlIIIIIl[31]] = lIIIllllll[lIIlIIIIIl[78]];
        strArr[lIIlIIIIIl[15]] = lIIIllllll[lIIlIIIIIl[79]];
        strArr[lIIlIIIIIl[32]] = lIIIllllll[lIIlIIIIIl[80]];
        strArr[lIIlIIIIIl[33]] = lIIIllllll[lIIlIIIIIl[81]];
        strArr[lIIlIIIIIl[34]] = lIIIllllll[lIIlIIIIIl[82]];
        strArr[lIIlIIIIIl[35]] = lIIIllllll[lIIlIIIIIl[83]];
        strArr[lIIlIIIIIl[30]] = lIIIllllll[lIIlIIIIIl[84]];
        strArr[lIIlIIIIIl[36]] = lIIIllllll[lIIlIIIIIl[85]];
        strArr[lIIlIIIIIl[37]] = lIIIllllll[lIIlIIIIIl[86]];
        strArr[lIIlIIIIIl[38]] = lIIIllllll[lIIlIIIIIl[87]];
        strArr[lIIlIIIIIl[39]] = lIIIllllll[lIIlIIIIIl[88]];
        strArr[lIIlIIIIIl[40]] = lIIIllllll[lIIlIIIIIl[89]];
        strArr[lIIlIIIIIl[42]] = lIIIllllll[lIIlIIIIIl[90]];
        strArr[lIIlIIIIIl[50]] = lIIIllllll[lIIlIIIIIl[91]];
        strArr[lIIlIIIIIl[51]] = lIIIllllll[lIIlIIIIIl[92]];
        strArr[lIIlIIIIIl[52]] = lIIIllllll[lIIlIIIIIl[93]];
        strArr[lIIlIIIIIl[53]] = lIIIllllll[lIIlIIIIIl[94]];
        strArr[lIIlIIIIIl[54]] = lIIIllllll[lIIlIIIIIl[95]];
        strArr[lIIlIIIIIl[55]] = lIIIllllll[lIIlIIIIIl[96]];
        strArr[lIIlIIIIIl[6]] = lIIIllllll[lIIlIIIIIl[97]];
        strArr[lIIlIIIIIl[61]] = lIIIllllll[lIIlIIIIIl[98]];
        strArr[lIIlIIIIIl[62]] = lIIIllllll[lIIlIIIIIl[99]];
        iV = strArr;
        iW = lIIlIIIIIl[100];
        cz = lIIlIIIIIl[0];
        bV = C0004e.c(lIIlIIIIIl[20], lIIlIIIIIl[33]);
        iX = C0004e.c(lIIlIIIIIl[6], lIIlIIIIIl[74]);
        bT = lIIlIIIIIl[1];
        iY = new WorldArea(lIIlIIIIIl[101], lIIlIIIIIl[102], lIIlIIIIIl[33], lIIlIIIIIl[30], lIIlIIIIIl[0]);
        iZ = new WorldPoint(lIIlIIIIIl[103], lIIlIIIIIl[104], lIIlIIIIIl[0]);
        ja = new WorldPoint(lIIlIIIIIl[105], lIIlIIIIIl[106], lIIlIIIIIl[0]);
        jb = new WorldPoint(lIIlIIIIIl[107], lIIlIIIIIl[108], lIIlIIIIIl[0]);
        jc = new WorldPoint(lIIlIIIIIl[109], lIIlIIIIIl[110], lIIlIIIIIl[0]);
        jd = new WorldPoint(lIIlIIIIIl[111], lIIlIIIIIl[112], lIIlIIIIIl[0]);
        je = new WorldPoint(lIIlIIIIIl[113], lIIlIIIIIl[114], lIIlIIIIIl[0]);
        jf = iZ;
        jg = ja;
        jh = jg;
    }

    private static String llllIIllIIlI(String lIllIllIllI, String lIllIllIlIl) {
        try {
            SecretKeySpec lIllIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIllIllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIllIlllIII = Cipher.getInstance("Blowfish");
            lIllIlllIII.init(lIIlIIIIIl[3], lIllIlllIIl);
            return new String(lIllIlllIII.doFinal(Base64.getDecoder().decode(lIllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIllIllIlll) {
            lIllIllIlll.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0160, code lost:
        if (llllIIllIlll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean ab() {
        if (llllIIlllIII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[13])) {
            int[] iArr = new int[lIIlIIIIIl[1]];
            iArr[lIIlIIIIIl[0]] = lIIlIIIIIl[12];
            if (llllIIllIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIIIIIl[1]];
                iArr2[lIIlIIIIIl[0]] = lIIlIIIIIl[11];
                boolean contains = Inventory.contains(iArr2);
                int[] iArr3 = new int[lIIlIIIIIl[1]];
                iArr3[lIIlIIIIIl[0]] = lIIlIIIIIl[10];
                if (llllIIllIlll((contains ? 1 : 0) & (Inventory.contains(iArr3) ? 1 : 0)) && llllIIlllIll(bT)) {
                    ?? r0 = lIIlIIIIIl[1];
                    "".length();
                    return (((((63 + 102) - (-12)) + 75) ^ (((79 + 136) - 155) + 118)) & (("  ".length() ^ (252 ^ 176)) ^ (-" ".length()))) != 0 ? ((147 ^ 154) ^ (122 ^ 32)) & (((34 ^ 8) ^ (23 ^ 110)) ^ (-" ".length())) : r0;
                }
            }
            return lIIlIIIIIl[0];
        } else if (llllIIllllII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[13]) && llllIIlllIII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[6])) {
            return lIIlIIIIIl[1];
        } else {
            if (llllIIllllII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[6])) {
                int[] iArr4 = new int[lIIlIIIIIl[1]];
                iArr4[lIIlIIIIIl[0]] = lIIlIIIIIl[8];
                if (llllIIllIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lIIlIIIIIl[1]];
                    iArr5[lIIlIIIIIl[0]] = lIIlIIIIIl[7];
                    if (llllIIlllIIl(Inventory.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIIlIIIIIl[1]];
                        iArr6[lIIlIIIIIl[0]] = lIIlIIIIIl[7];
                    }
                    ?? r02 = lIIlIIIIIl[1];
                    "".length();
                    return ((((((49 + 88) - 8) + 22) ^ (((131 + 32) - 120) + 93)) & (((99 ^ 102) ^ (54 ^ 44)) ^ (-" ".length()))) & ((((((165 + 96) - 206) + 168) ^ (((1 + 121) - 94) + 128)) & (((212 ^ 173) ^ (142 ^ 180)) ^ (-" ".length()))) ^ (-" ".length()))) < 0 ? ((((182 + 30) - 199) + 172) ^ (((102 + 96) - 107) + 54)) & (((((116 + 27) - 76) + 74) ^ (((142 + 155) - 282) + 150)) ^ (-" ".length())) : r02;
                }
                return lIIlIIIIIl[0];
            }
            return lIIlIIIIIl[0];
        }
    }

    public static void cF() {
        if (llllIIllIlll(Inventory.isFull() ? 1 : 0)) {
            Inventory.getAll(iV).forEach(item -> {
                item.interact(lIIIllllll[lIIlIIIIIl[6]]);
            });
            Time.sleepTicks(lIIlIIIIIl[1]);
            "".length();
            if (llllIIllIlll(Inventory.isFull() ? 1 : 0)) {
                int[] iArr = new int[lIIlIIIIIl[1]];
                iArr[lIIlIIIIIl[0]] = lIIlIIIIIl[8];
                Inventory.getFirst(iArr).interact(lIIIllllll[lIIlIIIIIl[18]]);
            }
        }
        if (llllIIlllIIl(Inventory.isFull() ? 1 : 0)) {
            int[] iArr2 = new int[lIIlIIIIIl[1]];
            iArr2[lIIlIIIIIl[0]] = lIIlIIIIIl[8];
            if (llllIIllIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIlIIIIIl[1]];
                iArr3[lIIlIIIIIl[0]] = lIIlIIIIIl[7];
                if (llllIIlllIIl(Equipment.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIlIIIIIl[1]];
                    iArr4[lIIlIIIIIl[0]] = lIIlIIIIIl[7];
                    if (llllIIllIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIlIIIIIl[1]];
                        iArr5[lIIlIIIIIl[0]] = lIIlIIIIIl[7];
                        Inventory.getFirst(iArr5).interact(lIIIllllll[lIIlIIIIIl[19]]);
                        Time.sleepTicks(lIIlIIIIIl[1]);
                        "".length();
                    }
                }
            }
        }
        if (llllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(jf), lIIlIIIIIl[17])) {
            AccBuilderRogues.c = lIIIllllll[lIIlIIIIIl[20]];
            Movement.walkTo(jf);
            "".length();
            Time.sleepTicks(lIIlIIIIIl[1]);
            "".length();
        }
        if (llllIIllllll(Players.getLocal().getWorldLocation().distanceTo(jf), lIIlIIIIIl[17])) {
            if (llllIIlllIIl(iY.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo(jf);
                "".length();
                Time.sleepTicks(lIIlIIIIIl[1]);
                "".length();
            }
            if (llllIIllIlll(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (llllIlIIIIII(Players.getLocal().getGraphic(), lIIlIIIIIl[21]) && llllIIlllIIl(Inventory.isFull() ? 1 : 0)) {
                AccBuilderRogues.c = lIIIllllll[lIIlIIIIIl[22]];
                String[] strArr = new String[lIIlIIIIIl[1]];
                strArr[lIIlIIIIIl[0]] = lIIIllllll[lIIlIIIIIl[14]];
                if (llllIIlllIlI(NPCs.getNearest(strArr)) && llllIlIIIIIl(Players.getLocal().getInteracting())) {
                    String[] strArr2 = new String[lIIlIIIIIl[1]];
                    strArr2[lIIlIIIIIl[0]] = lIIIllllll[lIIlIIIIIl[23]];
                    NPCs.getNearest(strArr2).interact(lIIIllllll[lIIlIIIIIl[24]]);
                    Time.sleepTicks(lIIlIIIIIl[1]);
                    "".length();
                }
            }
            if (llllIlIIIIlI(Players.getLocal().getGraphic(), lIIlIIIIIl[21])) {
                AccBuilderRogues.c = lIIIllllll[lIIlIIIIIl[25]];
                if (!llllIlIIIIll(llllIIlllllI(C0004e.u(), 70.0d)) || llllIIllllll(Skills.getBoostedLevel(Skill.HITPOINTS), lIIlIIIIIl[9])) {
                    int[] iArr6 = new int[lIIlIIIIIl[1]];
                    iArr6[lIIlIIIIIl[0]] = lIIlIIIIIl[8];
                    if (llllIIllIlll(Inventory.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[lIIlIIIIIl[1]];
                        iArr7[lIIlIIIIIl[0]] = lIIlIIIIIl[8];
                        Inventory.getFirst(iArr7).interact(lIIIllllll[lIIlIIIIIl[26]]);
                        Time.sleepTicks(lIIlIIIIIl[1]);
                        "".length();
                    }
                }
                String[] strArr3 = new String[lIIlIIIIIl[1]];
                strArr3[lIIlIIIIIl[0]] = lIIIllllll[lIIlIIIIIl[17]];
                if (llllIIllIlll(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIlIIIIIl[1]];
                    strArr4[lIIlIIIIIl[0]] = lIIIllllll[lIIlIIIIIl[27]];
                    Inventory.getAll(strArr4).stream().forEach(item2 -> {
                        item2.interact(lIIIllllll[lIIlIIIIIl[55]]);
                    });
                }
                Inventory.getAll(iV).forEach(item3 -> {
                    item3.interact(lIIIllllll[lIIlIIIIIl[54]]);
                });
            }
        }
    }

    private static boolean llllIlIIIIII(int i, int i2) {
        return i != i2;
    }

    private static int llllIIlllllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llllIlIIIIll(int i) {
        return i >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (llllIIllllII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[2])) {
            ?? r0 = lIIlIIIIIl[1];
            "".length();
            return " ".length() == "   ".length() ? ((((95 + 29) - (-39)) + 11) ^ (((123 + 62) - 68) + 11)) & (((56 ^ 28) ^ (84 ^ 94)) ^ (-" ".length())) : r0;
        }
        return lIIlIIIIIl[0];
    }

    private static void llllIIllIlIl() {
        lIIIllllll = new String[lIIlIIIIIl[115]];
        lIIIllllll[lIIlIIIIIl[0]] = llllIIllIIIl("JsnL2kesVpeKD8X6GYxbcA==", "SrXEA");
        lIIIllllll[lIIlIIIIIl[1]] = llllIIllIIlI("MMAPLEPhuu3YX8WbmJYo73qL8EFYuZk1w7NtZon1kPpjRRTi2NeOnay/Dh2eK1/e", "FxKFi");
        lIIIllllll[lIIlIIIIIl[3]] = llllIIllIIIl("BIBbqFU41s352YDExT0+53e+Fbt+DJCp", "VNtUX");
        lIIIllllll[lIIlIIIIIl[4]] = llllIIllIIll("HA0qEyg9AiNXJjUCLx4qMw==", "TlDwD");
        lIIIllllll[lIIlIIIIIl[9]] = llllIIllIIlI("PDmxvtwL1fdB3XZi1ZeuRBbXogWG6g0ZZ9NUwQgF5je/JeF880pvGs4sKpG+Potr", "ZUUJF");
        lIIIllllll[lIIlIIIIIl[13]] = llllIIllIIlI("7M4ssTqqTJ6UNzFw1lJK+5Vc/KFSK2cmks/goMGUxhYQIQm/nA9A5aA51JiQ25Li", "MAMBK");
        lIIIllllll[lIIlIIIIIl[18]] = llllIIllIIll("IzYGOQ==", "gDiIi");
        lIIIllllll[lIIlIIIIIl[19]] = llllIIllIIlI("GSjx9WNAYsg=", "rJfTd");
        lIIIllllll[lIIlIIIIIl[20]] = llllIIllIIIl("YKFNykXNTPumHRICGOQYlg==", "bZOzX");
        lIIIllllll[lIIlIIIIIl[22]] = llllIIllIIll("MRwGAgkOFg4MDQgbAg==", "aueiy");
        lIIIllllll[lIIlIIIIIl[14]] = llllIIllIIlI("UmkGeRpXWWzxud6l7NNgFA==", "xstJG");
        lIIIllllll[lIIlIIIIIl[23]] = llllIIllIIll("FSY5LQ8qZww4GDUiOA==", "XGJYj");
        lIIIllllll[lIIlIIIIIl[24]] = llllIIllIIlI("IplL2IhUlFkEnhI2swRJgQ==", "qAlkj");
        lIIIllllll[lIIlIIIIIl[25]] = llllIIllIIll("GhElNAgsAQ==", "IePZf");
        lIIIllllll[lIIlIIIIIl[26]] = llllIIllIIll("BwAbODg=", "CrrVS");
        lIIIllllll[lIIlIIIIIl[17]] = llllIIllIIIl("mmLHMQBtEto=", "kTRwG");
        lIIIllllll[lIIlIIIIIl[27]] = llllIIllIIIl("ThVUUGsaZEU=", "kzEUp");
        lIIIllllll[lIIlIIIIIl[28]] = llllIIllIIlI("kr+cL/i1xzOXScLcRGolnA==", "JznaU");
        lIIIllllll[lIIlIIIIIl[29]] = llllIIllIIIl("1IsuMi/dWt9iqkAuZuzIdQ==", "IyDKS");
        lIIIllllll[lIIlIIIIIl[31]] = llllIIllIIlI("EQVgxaRMQgTMyL4Ev3A1Lw==", "TVCnl");
        lIIIllllll[lIIlIIIIIl[15]] = llllIIllIIll("OTs2", "tZXsi");
        lIIIllllll[lIIlIIIIIl[32]] = llllIIllIIll("OTMb", "tRuqf");
        lIIIllllll[lIIlIIIIIl[33]] = llllIIllIIIl("2r1+W8BxYo9X1OyIougthg==", "dWSSK");
        lIIIllllll[lIIlIIIIIl[34]] = llllIIllIIll("KgcgPwscFw==", "ysUQe");
        lIIIllllll[lIIlIIIIIl[35]] = llllIIllIIlI("qFD+mZSlRVQ=", "AqxOZ");
        lIIIllllll[lIIlIIIIIl[30]] = llllIIllIIIl("XjDhX/55dxMpW2xezHUfBQ==", "KYlAa");
        lIIIllllll[lIIlIIIIIl[36]] = llllIIllIIlI("7l5osCDX4V2rUAURyDwNJg==", "lrsVF");
        lIIIllllll[lIIlIIIIIl[37]] = llllIIllIIIl("EYvBzaYXMvS0DjfSPT9fKg==", "wFPvI");
        lIIIllllll[lIIlIIIIIl[38]] = llllIIllIIIl("K21Zpszj+P+bFC1vUbk6HQ==", "cmcDc");
        lIIIllllll[lIIlIIIIIl[39]] = llllIIllIIIl("6w4vHzyViO4QDL6/ysOHdg==", "fUWko");
        lIIIllllll[lIIlIIIIIl[40]] = llllIIllIIlI("fSHWwDBOalPZZaC6a570EA==", "LhIYL");
        lIIIllllll[lIIlIIIIIl[42]] = llllIIllIIlI("RL2KYcp4nPcBzCpCXGXfIg==", "YaKud");
        lIIIllllll[lIIlIIIIIl[50]] = llllIIllIIll("NSUZPTAIIxc=", "aMpXF");
        lIIIllllll[lIIlIIIIIl[51]] = llllIIllIIll("PicLCg==", "zUdzG");
        lIIIllllll[lIIlIIIIIl[52]] = llllIIllIIll("Bxg+KQ==", "CjQYK");
        lIIIllllll[lIIlIIIIIl[53]] = llllIIllIIlI("ZuERsiw3L1Dt6IlHlZ4iCA==", "aPzOw");
        lIIIllllll[lIIlIIIIIl[54]] = llllIIllIIlI("mCDqF/kFehw=", "PpEie");
        lIIIllllll[lIIlIIIIIl[55]] = llllIIllIIll("Ij4oOw==", "fLGKH");
        lIIIllllll[lIIlIIIIIl[6]] = llllIIllIIlI("Q1HsMhxIpWo=", "VwqHv");
        lIIIllllll[lIIlIIIIIl[61]] = llllIIllIIIl("0qEpwxZrwhC01opXKe35NQ==", "pHStI");
        lIIIllllll[lIIlIIIIIl[62]] = llllIIllIIIl("JNks6tvRl5kuzKuCvpPcrw==", "CZEEP");
        lIIIllllll[lIIlIIIIIl[60]] = llllIIllIIlI("a8uHAaP/gBe0ocmOHGx24Q==", "AKcOz");
        lIIIllllll[lIIlIIIIIl[63]] = llllIIllIIlI("c1J6cWpX5JvDEdserQWtrg==", "aRdJx");
        lIIIllllll[lIIlIIIIIl[64]] = llllIIllIIIl("VSl2mUfH4NyRqpq2iDJG3Q==", "Pmapf");
        lIIIllllll[lIIlIIIIIl[65]] = llllIIllIIlI("2XICG/6QxZlcsuZ6Hpht2w==", "zdQwK");
        lIIIllllll[lIIlIIIIIl[66]] = llllIIllIIll("BxUKFRY7ABAUDmkHHAQH", "Ityac");
        lIIIllllll[lIIlIIIIIl[67]] = llllIIllIIll("BCMLFGgkLQkJLSsr", "LLgmH");
        lIIIllllll[lIIlIIIIIl[68]] = llllIIllIIIl("TkQn9nMas7jfq7H2NUfO7bwzdFb9bHgn", "nTsFv");
        lIIIllllll[lIIlIIIIIl[69]] = llllIIllIIlI("VQisRCvUuYJBdfJRPDMjIA==", "GOeVy");
        lIIIllllll[lIIlIIIIIl[70]] = llllIIllIIll("JzQTEw0XLAQYWQcmExI=", "tCvvy");
        lIIIllllll[lIIlIIIIIl[2]] = llllIIllIIlI("HwSn5Q9K+hvcSAIhysDhjg==", "Zodcg");
        lIIIllllll[lIIlIIIIIl[71]] = llllIIllIIlI("3EQ71LIOEKPkUcLa4J5xeg==", "xLutV");
        lIIIllllll[lIIlIIIIIl[72]] = llllIIllIIIl("B7IaO8XCWQIFe6kaSsPtUQyduhMUlzRb", "XsnEB");
        lIIIllllll[lIIlIIIIIl[73]] = llllIIllIIll("PBUIPRUFHRRvCQ0RHg==", "htzOz");
        lIIIllllll[lIIlIIIIIl[74]] = llllIIllIIlI("XR/nDoSGfc7CSXToEsdN/Q==", "GtLxo");
        lIIIllllll[lIIlIIIIIl[75]] = llllIIllIIlI("VcrVY/SnxVNMmNU31TNbRA==", "ICBWa");
        lIIIllllll[lIIlIIIIIl[76]] = llllIIllIIIl("XqnrsjtN61OIwCW8yYiYoLw7HJlqbmMW", "maaBy");
        lIIIllllll[lIIlIIIIIl[77]] = llllIIllIIlI("IszJQb1Qxw12cbwP3sBoew==", "jvCQe");
        lIIIllllll[lIIlIIIIIl[78]] = llllIIllIIlI("AKI4RexZJxftG4JQJjOGVA==", "sBApc");
        lIIIllllll[lIIlIIIIIl[79]] = llllIIllIIIl("76/TtN9fsmdPjHAuH1deZw==", "bjbzG");
        lIIIllllll[lIIlIIIIIl[80]] = llllIIllIIIl("OOA17UqEpY+jpjUgUEtsMQ==", "vVWic");
        lIIIllllll[lIIlIIIIIl[81]] = llllIIllIIlI("HssU4Y+D8+XssUyVErL+Rw==", "rqteJ");
        lIIIllllll[lIIlIIIIIl[82]] = llllIIllIIIl("w5r2o6FfZ7qWqE8IOAUoYQ==", "xsqLi");
        lIIIllllll[lIIlIIIIIl[83]] = llllIIllIIll("OgsTEhgYCBIBHABKBBYLHQ==", "yjwsn");
        lIIIllllll[lIIlIIIIIl[84]] = llllIIllIIIl("vMXmHiNXCXmJGfusQolNxQ==", "HkfdD");
        lIIIllllll[lIIlIIIIIl[85]] = llllIIllIIIl("3krmBUPwMAc8clnASGH7JsJKbbOmDMM8", "RznEo");
        lIIIllllll[lIIlIIIIIl[86]] = llllIIllIIlI("9i4TQtfL20aQk/b9lLtiag==", "xOiiU");
        lIIIllllll[lIIlIIIIIl[87]] = llllIIllIIIl("7JaALUVH5NwmxxlQbRo1vw==", "caZlR");
        lIIIllllll[lIIlIIIIIl[88]] = llllIIllIIll("DzYFPSMsIx4jKmIkEioi", "BWwOF");
        lIIIllllll[lIIlIIIIIl[89]] = llllIIllIIIl("jfUFe25zzwW6Xzr5zvdWfA==", "cPuNi");
        lIIIllllll[lIIlIIIIIl[90]] = llllIIllIIll("DTQwPg4pNCwoCjd1MSkKIQ==", "EUBLo");
        lIIIllllll[lIIlIIIIIl[91]] = llllIIllIIIl("JAc0k3BRPyQbiVfdVHQsSA==", "WyvDf");
        lIIIllllll[lIIlIIIIIl[92]] = llllIIllIIIl("OOk/bax5PPdL12T57G/aCw==", "gbzUj");
        lIIIllllll[lIIlIIIIIl[93]] = llllIIllIIll("AAYbMjYwRwsjJic=", "CgxFC");
        lIIIllllll[lIIlIIIIIl[94]] = llllIIllIIll("CjokJh01dTMmCi4gI2caPzA0", "ZUPGi");
        lIIIllllll[lIIlIIIIIl[95]] = llllIIllIIll("Bj8O", "LJirO");
        lIIIllllll[lIIlIIIIIl[96]] = llllIIllIIll("JQUjFRofATsfBlIXMhUM", "rdWph");
        lIIIllllll[lIIlIIIIIl[97]] = llllIIllIIll("HjEkPAMrPD86H2kqKC0C", "IYMHf");
        lIIIllllll[lIIlIIIIIl[98]] = llllIIllIIll("PAUKDCtLDwYKPBJNEB0rDw==", "kmcxN");
        lIIIllllll[lIIlIIIIIl[99]] = llllIIllIIll("IAQeGgobRR8TCgY=", "belvo");
    }

    private static boolean llllIlIIIIlI(int i, int i2) {
        return i == i2;
    }

    private static void cG() {
        if (llllIIllllIl(Players.getLocal().getWorldLocation().distanceTo(iR), lIIlIIIIIl[17])) {
            AccBuilderRogues.c = lIIIllllll[lIIlIIIIIl[28]];
            Movement.walkTo(iR);
            "".length();
            Time.sleepTicks(lIIlIIIIIl[1]);
            "".length();
        }
        if (llllIIllllll(Players.getLocal().getWorldLocation().distanceTo(iR), lIIlIIIIIl[17])) {
            if (llllIIllIlll(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (llllIlIIIIll(llllIlIIIlII(System.currentTimeMillis(), iU))) {
                AccBuilderRogues.c = lIIIllllll[lIIlIIIIIl[29]];
                int[] iArr = new int[lIIlIIIIIl[1]];
                iArr[lIIlIIIIIl[0]] = iW;
                if (llllIIllIlll(Inventory.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIIlIIIIIl[1]];
                    iArr2[lIIlIIIIIl[0]] = iW;
                    if (llllIIllllII(Inventory.getFirst(iArr2).getQuantity(), lIIlIIIIIl[30])) {
                        int[] iArr3 = new int[lIIlIIIIIl[1]];
                        iArr3[lIIlIIIIIl[0]] = iW;
                        Inventory.getFirst(iArr3).interact(lIIIllllll[lIIlIIIIIl[31]]);
                        Time.sleepTicks(lIIlIIIIIl[1]);
                        "".length();
                    }
                }
                String[] strArr = new String[lIIlIIIIIl[1]];
                strArr[lIIlIIIIIl[0]] = lIIIllllll[lIIlIIIIIl[15]];
                if (llllIIlllIlI(NPCs.getNearest(strArr)) && llllIlIIIIIl(Players.getLocal().getInteracting()) && llllIIlllIIl(Players.getLocal().isMoving() ? 1 : 0)) {
                    String[] strArr2 = new String[lIIlIIIIIl[1]];
                    strArr2[lIIlIIIIIl[0]] = lIIIllllll[lIIlIIIIIl[32]];
                    NPCs.getNearest(strArr2).interact(lIIIllllll[lIIlIIIIIl[33]]);
                    Time.sleepTicks(lIIlIIIIIl[1]);
                    "".length();
                }
            }
            if (llllIlIIIllI(llllIlIIIlII(System.currentTimeMillis(), iU))) {
                AccBuilderRogues.c = lIIIllllll[lIIlIIIIIl[34]];
                if (!llllIlIIIIll(llllIlIIIlIl(C0004e.u(), 30.0d)) || llllIIllllll(Skills.getBoostedLevel(Skill.HITPOINTS), lIIlIIIIIl[9])) {
                    int[] iArr4 = new int[lIIlIIIIIl[1]];
                    iArr4[lIIlIIIIIl[0]] = lIIlIIIIIl[12];
                    if (llllIIllIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIlIIIIIl[1]];
                        iArr5[lIIlIIIIIl[0]] = lIIlIIIIIl[12];
                        Inventory.getFirst(iArr5).interact(lIIIllllll[lIIlIIIIIl[35]]);
                        Time.sleepTicks(lIIlIIIIIl[1]);
                        "".length();
                    }
                }
            }
        }
    }

    private static int llllIlIIIlII(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    private static boolean llllIIllllIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlIIIIIl[0];
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        cE();
        return lIIlIIIIIl[49];
    }

    private static int llllIlIIIlIl(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean llllIIllllll(int i, int i2) {
        return i <= i2;
    }

    private static void llllIIllIllI() {
        lIIlIIIIIl = new int[116];
        lIIlIIIIIl[0] = ((180 ^ 177) ^ (93 ^ 81)) & (((((132 + 28) - 40) + 53) ^ (((121 + 60) - 24) + 7)) ^ (-" ".length()));
        lIIlIIIIIl[1] = " ".length();
        lIIlIIIIIl[2] = 107 ^ 89;
        lIIlIIIIIl[3] = "  ".length();
        lIIlIIIIIl[4] = "   ".length();
        lIIlIIIIIl[5] = (-2051) & 7050;
        lIIlIIIIIl[6] = 98 ^ 68;
        lIIlIIIIIl[7] = (-8225) & 29367;
        lIIlIIIIIl[8] = (-22577) & 24569;
        lIIlIIIIIl[9] = 61 ^ 57;
        lIIlIIIIIl[10] = (-24729) & 32735;
        lIIlIIIIIl[11] = (-(63 ^ 12)) & (-5) & 8062;
        lIIlIIIIIl[12] = (-((-3425) & 24549)) & (-1025) & 22527;
        lIIlIIIIIl[13] = (((112 + 105) - 89) + 43) ^ (((16 + 11) - 24) + 171);
        lIIlIIIIIl[14] = (166 ^ 156) ^ (8 ^ 56);
        lIIlIIIIIl[15] = (((128 + 74) - 129) + 69) ^ (((141 + 146) - 275) + 142);
        lIIlIIIIIl[16] = (-18461) & 20351;
        lIIlIIIIIl[17] = (76 ^ 2) ^ (52 ^ 117);
        lIIlIIIIIl[18] = 93 ^ 91;
        lIIlIIIIIl[19] = (((38 + 149) - 60) + 26) ^ (((153 + 103) - 158) + 60);
        lIIlIIIIIl[20] = (128 ^ 170) ^ (127 ^ 93);
        lIIlIIIIIl[21] = (((240 ^ 194) + (((103 + 100) - 82) + 54)) - (((116 + 88) - 145) + 123)) + ((55 + 180) - 216) + 183;
        lIIlIIIIIl[22] = (((43 + 28) - (-54)) + 61) ^ (((154 + 58) - 181) + 148);
        lIIlIIIIIl[23] = 75 ^ 64;
        lIIlIIIIIl[24] = " ".length() ^ (80 ^ 93);
        lIIlIIIIIl[25] = 23 ^ 26;
        lIIlIIIIIl[26] = (18 ^ 79) ^ (193 ^ 146);
        lIIlIIIIIl[27] = (85 ^ 118) ^ (143 ^ 188);
        lIIlIIIIIl[28] = 90 ^ 75;
        lIIlIIIIIl[29] = (((11 + 63) - 50) + 111) ^ (((111 + 35) - 40) + 43);
        lIIlIIIIIl[30] = 186 ^ 163;
        lIIlIIIIIl[31] = (55 ^ 92) ^ (240 ^ 136);
        lIIlIIIIIl[32] = (((28 + 111) - (-54)) + 15) ^ (((12 + 121) - (-58)) + 6);
        lIIlIIIIIl[33] = 162 ^ 180;
        lIIlIIIIIl[34] = (((120 + 2) - 64) + 86) ^ (((109 + 134) - 234) + 126);
        lIIlIIIIIl[35] = 130 ^ 154;
        lIIlIIIIIl[36] = (152 ^ 134) ^ (117 ^ 113);
        lIIlIIIIIl[37] = 17 ^ 10;
        lIIlIIIIIl[38] = 79 ^ 83;
        lIIlIIIIIl[39] = 190 ^ 163;
        lIIlIIIIIl[40] = (200 ^ 197) ^ (154 ^ 137);
        lIIlIIIIIl[41] = (-((-2529) & 27128)) & (-1) & 28599;
        lIIlIIIIIl[42] = 67 ^ 92;
        lIIlIIIIIl[43] = (-65) & 2042;
        lIIlIIIIIl[44] = (-4204) & 5103;
        lIIlIIIIIl[45] = (-8772) & 9071;
        lIIlIIIIIl[46] = (-((-8785) & 26361)) & (-513) & 30713;
        lIIlIIIIIl[47] = (-294) & 15293;
        lIIlIIIIIl[48] = (-10305) & 12254;
        lIIlIIIIIl[49] = (13 ^ 9) ^ (98 ^ 2);
        lIIlIIIIIl[50] = 161 ^ 129;
        lIIlIIIIIl[51] = 80 ^ 113;
        lIIlIIIIIl[52] = (83 ^ 124) ^ (110 ^ 99);
        lIIlIIIIIl[53] = (((99 + 84) - 151) + 116) ^ (((119 + 179) - 120) + 5);
        lIIlIIIIIl[54] = 129 ^ 165;
        lIIlIIIIIl[55] = 27 ^ 62;
        lIIlIIIIIl[56] = (-8300) & 11519;
        lIIlIIIIIl[57] = (-12877) & 16095;
        lIIlIIIIIl[58] = (-8473) & 11740;
        lIIlIIIIIl[59] = (-((-4177) & 29277)) & (-4258) & 32767;
        lIIlIIIIIl[60] = 170 ^ 131;
        lIIlIIIIIl[61] = 77 ^ 106;
        lIIlIIIIIl[62] = (((139 + 79) - 78) + 0) ^ (((132 + 130) - 141) + 43);
        lIIlIIIIIl[63] = (210 ^ 178) ^ (114 ^ 56);
        lIIlIIIIIl[64] = 142 ^ 165;
        lIIlIIIIIl[65] = 73 ^ 101;
        lIIlIIIIIl[66] = 30 ^ 51;
        lIIlIIIIIl[67] = (4 ^ 69) ^ (74 ^ 37);
        lIIlIIIIIl[68] = 169 ^ 134;
        lIIlIIIIIl[69] = (12 ^ 86) ^ (3 ^ 105);
        lIIlIIIIIl[70] = (114 ^ 24) ^ (16 ^ 75);
        lIIlIIIIIl[71] = 96 ^ 83;
        lIIlIIIIIl[72] = 4 ^ 48;
        lIIlIIIIIl[73] = (108 ^ 122) ^ (53 ^ 22);
        lIIlIIIIIl[74] = (91 ^ 54) ^ (50 ^ 105);
        lIIlIIIIIl[75] = 186 ^ 141;
        lIIlIIIIIl[76] = 255 ^ 199;
        lIIlIIIIIl[77] = (129 ^ 164) ^ (86 ^ 74);
        lIIlIIIIIl[78] = 16 ^ 42;
        lIIlIIIIIl[79] = 255 ^ 196;
        lIIlIIIIIl[80] = (((10 + 22) - (-64)) + 50) ^ (((12 + 150) - 116) + 128);
        lIIlIIIIIl[81] = (181 ^ 199) ^ (222 ^ 145);
        lIIlIIIIIl[82] = 148 ^ 170;
        lIIlIIIIIl[83] = 117 ^ 74;
        lIIlIIIIIl[84] = 124 ^ 60;
        lIIlIIIIIl[85] = (19 ^ 44) ^ (103 ^ 25);
        lIIlIIIIIl[86] = (((25 + 125) - 66) + 51) ^ (((4 + 44) - (-146)) + 3);
        lIIlIIIIIl[87] = (((62 + 128) - 100) + 42) ^ (((194 + 137) - 246) + 114);
        lIIlIIIIIl[88] = 101 ^ 33;
        lIIlIIIIIl[89] = (((108 + 28) - (-32)) + 35) ^ (((3 + 44) - (-9)) + 86);
        lIIlIIIIIl[90] = (((206 + 176) - 201) + 49) ^ (((133 + 92) - 126) + 61);
        lIIlIIIIIl[91] = 69 ^ 2;
        lIIlIIIIIl[92] = 28 ^ 84;
        lIIlIIIIIl[93] = 84 ^ 29;
        lIIlIIIIIl[94] = 214 ^ 156;
        lIIlIIIIIl[95] = (((167 + 49) - 22) + 18) ^ (((133 + 60) - 47) + 13);
        lIIlIIIIIl[96] = 231 ^ 171;
        lIIlIIIIIl[97] = (((204 + 119) - 232) + 125) ^ (((19 + 40) - 20) + 110);
        lIIlIIIIIl[98] = (81 ^ 56) ^ (163 ^ 132);
        lIIlIIIIIl[99] = (50 ^ 108) ^ (97 ^ 112);
        lIIlIIIIIl[100] = (-(166 ^ 161)) & (-8193) & 30719;
        lIIlIIIIIl[101] = (-((-26449) & 30545)) & (-2) & 7165;
        lIIlIIIIIl[102] = (-((-1253) & 29949)) & (-257) & 32191;
        lIIlIIIIIl[103] = (-((-24875) & 29179)) & (-25089) & 32473;
        lIIlIIIIIl[104] = (-4357) & 7607;
        lIIlIIIIIl[105] = (-17345) & 20436;
        lIIlIIIIIl[106] = (-581) & 3823;
        lIIlIIIIIl[107] = (-((-10331) & 31099)) & (-129) & 23995;
        lIIlIIIIIl[108] = (-((-9346) & 13767)) & (-9) & 7679;
        lIIlIIIIIl[109] = (-((-737) & 21502)) & (-8195) & 30719;
        lIIlIIIIIl[110] = (-24577) & 28205;
        lIIlIIIIIl[111] = (-((-1) & 24873)) & (-2049) & 28669;
        lIIlIIIIIl[112] = (-449) & 4047;
        lIIlIIIIIl[113] = (-4113) & 5851;
        lIIlIIIIIl[114] = (-((-1057) & 21993)) & (-1) & 24570;
        lIIlIIIIIl[115] = (21 ^ 109) ^ (143 ^ 167);
    }

    private static boolean llllIlIIIllI(int i) {
        return i <= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    private static boolean cI() {
        return lIIlIIIIIl[0];
    }

    private static String llllIIllIIIl(String lIlllIIIIll, String lIlllIIIIlI) {
        try {
            SecretKeySpec lIlllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIIIIlI.getBytes(StandardCharsets.UTF_8)), lIIlIIIIIl[20]), "DES");
            Cipher lIlllIIIlIl = Cipher.getInstance("DES");
            lIlllIIIlIl.init(lIIlIIIIIl[3], lIlllIIIllI);
            return new String(lIlllIIIlIl.doFinal(Base64.getDecoder().decode(lIlllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIIIlII) {
            lIlllIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llllIIlllIIl(int i) {
        return i == 0;
    }

    private static boolean llllIIlllIll(int i) {
        return i > 0;
    }

    private static boolean llllIlIIIIIl(Object obj) {
        return obj == null;
    }

    public static void af() {
        int[] iArr = new int[lIIlIIIIIl[1]];
        iArr[lIIlIIIIIl[0]] = lIIlIIIIIl[10];
        if (llllIIlllIIl(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIIIl[10], lIIlIIIIIl[14], lIIlIIIIIl[44]));
            "".length();
        }
        int[] iArr2 = new int[lIIlIIIIIl[1]];
        iArr2[lIIlIIIIIl[0]] = lIIlIIIIIl[11];
        if (llllIIlllIIl(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIIIl[11], lIIlIIIIIl[14], lIIlIIIIIl[44]));
            "".length();
        }
        int[] iArr3 = new int[lIIlIIIIIl[1]];
        iArr3[lIIlIIIIIl[0]] = lIIlIIIIIl[12];
        if (llllIIlllIIl(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIIIl[12], lIIlIIIIIl[40], lIIlIIIIIl[45]));
            "".length();
        }
        int[] iArr4 = new int[lIIlIIIIIl[1]];
        iArr4[lIIlIIIIIl[0]] = lIIlIIIIIl[46];
        if (llllIIlllIIl(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIlIIIIIl[46], lIIlIIIIIl[13], C0008i.bq));
            "".length();
        }
        if (llllIIllllII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[6])) {
            int[] iArr5 = new int[lIIlIIIIIl[1]];
            iArr5[lIIlIIIIIl[0]] = lIIlIIIIIl[8];
            if (llllIIlllIIl(Bank.contains(iArr5) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIIIIl[8], lIIlIIIIIl[47], lIIlIIIIIl[20]));
                "".length();
            }
            int[] iArr6 = new int[lIIlIIIIIl[1]];
            iArr6[lIIlIIIIIl[0]] = lIIlIIIIIl[7];
            if (llllIIlllIIl(Bank.contains(iArr6) ? 1 : 0)) {
                bv.add(new C0003d(lIIlIIIIIl[7], lIIlIIIIIl[45], lIIlIIIIIl[48]));
                "".length();
            }
        }
    }

    private static boolean llllIIllIlll(int i) {
        return i != 0;
    }

    private static boolean llllIIlllIlI(Object obj) {
        return obj != null;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIIllllll[lIIlIIIIIl[50]];
    }

    private static boolean llllIIllllII(int i, int i2) {
        return i >= i2;
    }

    private static String llllIIllIIll(String lIllIlIIllI, String lIllIlIIlIl) {
        String lIllIlIIllI2 = new String(Base64.getDecoder().decode(lIllIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllIlIIlII = new StringBuilder();
        char[] charArray = lIllIlIIlIl.toCharArray();
        int lIllIlIIIlI = lIIlIIIIIl[0];
        char[] charArray2 = lIllIlIIllI2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIIIIIl[0];
        while (llllIIlllIII(i, length)) {
            lIllIlIIlII.append((char) (charArray2[i] ^ charArray[lIllIlIIIlI % charArray.length]));
            "".length();
            lIllIlIIIlI++;
            i++;
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lIllIlIIlII);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0150, code lost:
        if (llllIIlllIIl(net.unethicalite.api.items.Bank.contains(r0) ? 1 : 0) != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v131, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cE() {
        if (llllIIllIlll(bt ? 1 : 0)) {
            AccBuilderRogues.c = lIIIllllll[lIIlIIIIIl[0]];
            C0001b.a(bv);
            if (llllIIlllIII(bv.size(), lIIlIIIIIl[1])) {
                System.out.println(lIIIllllll[lIIlIIIIIl[1]]);
                bt = lIIlIIIIIl[0];
            }
        }
        if (llllIIlllIIl(bt ? 1 : 0) && llllIIlllIII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[2])) {
            if (llllIIlllIIl(ab() ? 1 : 0)) {
                BankLocation nearest = BankLocation.getNearest();
                if (llllIIlllIlI(nearest) && llllIIlllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIllllll[lIIlIIIIIl[3]];
                    C0000a.a(nearest);
                }
                if (llllIIlllIlI(nearest) && llllIIllIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIllllll[lIIlIIIIIl[4]];
                    if (llllIIlllIIl(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIlIIIIIl[5]);
                        "".length();
                    }
                    if (llllIIllIlll(Bank.isOpen() ? 1 : 0)) {
                        if (llllIIlllIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIlIIIIIl[4]);
                            "".length();
                        }
                        if (llllIIllllII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[6])) {
                            int[] iArr = new int[lIIlIIIIIl[1]];
                            iArr[lIIlIIIIIl[0]] = lIIlIIIIIl[7];
                            if (llllIIllIlll(Bank.contains(iArr) ? 1 : 0)) {
                                int[] iArr2 = new int[lIIlIIIIIl[1]];
                                iArr2[lIIlIIIIIl[0]] = lIIlIIIIIl[8];
                            }
                            af();
                            System.out.println(lIIIllllll[lIIlIIIIIl[9]]);
                            bt = lIIlIIIIIl[1];
                            return;
                        }
                        int[] iArr3 = new int[lIIlIIIIIl[1]];
                        iArr3[lIIlIIIIIl[0]] = lIIlIIIIIl[10];
                        if (llllIIllIlll(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIlIIIIIl[1]];
                            iArr4[lIIlIIIIIl[0]] = lIIlIIIIIl[11];
                            if (llllIIllIlll(Bank.contains(iArr4) ? 1 : 0)) {
                                int[] iArr5 = new int[lIIlIIIIIl[1]];
                                iArr5[lIIlIIIIIl[0]] = lIIlIIIIIl[12];
                                if (!llllIIlllIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                    if (llllIIlllIII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[13])) {
                                        C0000a.a(lIIlIIIIIl[11], lIIlIIIIIl[13]);
                                        C0000a.a(lIIlIIIIIl[10], lIIlIIIIIl[13]);
                                        C0000a.a(lIIlIIIIIl[12], lIIlIIIIIl[14]);
                                    }
                                    if (llllIIllllII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[13]) && llllIIlllIII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[6])) {
                                        C0000a.a(lIIlIIIIIl[10], lIIlIIIIIl[13]);
                                    }
                                    if (llllIIllllII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[6])) {
                                        C0000a.a(lIIlIIIIIl[7], lIIlIIIIIl[13]);
                                        C0000a.a(lIIlIIIIIl[8], lIIlIIIIIl[15]);
                                        C0000a.a(lIIlIIIIIl[16], lIIlIIIIIl[15]);
                                    }
                                    bT += lIIlIIIIIl[1];
                                }
                            }
                        }
                        af();
                        System.out.println(lIIIllllll[lIIlIIIIIl[13]]);
                        bt = lIIlIIIIIl[1];
                        return;
                    }
                }
                if (llllIIllllIl(Inventory.getFreeSlots(), lIIlIIIIIl[17])) {
                    bT += lIIlIIIIIl[1];
                }
            }
            if (llllIIllIlll(ab() ? 1 : 0) && llllIIlllIll(bT)) {
                if (llllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (llllIIlllIII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[13])) {
                    cG();
                }
                if (llllIIllllII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[13]) && llllIIlllIII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[6])) {
                    cH();
                }
                if (llllIIllllII(Skills.getLevel(Skill.THIEVING), lIIlIIIIIl[6])) {
                    cF();
                }
            }
        }
    }

    private static void cH() {
        if (llllIIlllIIl(Players.getLocal().getWorldLocation().equals(iS) ? 1 : 0)) {
            AccBuilderRogues.c = lIIIllllll[lIIlIIIIIl[30]];
            if (llllIIllIlll(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo(iS);
            "".length();
            Time.sleepTicks(lIIlIIIIIl[1]);
            "".length();
        }
        if (llllIIllIlll(Players.getLocal().getWorldLocation().equals(iS) ? 1 : 0)) {
            int[] iArr = new int[lIIlIIIIIl[1]];
            iArr[lIIlIIIIIl[0]] = iW;
            if (llllIIllIlll(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIIlIIIIIl[1]];
                iArr2[lIIlIIIIIl[0]] = iW;
                Inventory.getFirst(iArr2).interact(lIIIllllll[lIIlIIIIIl[36]]);
                Time.sleepTicks(lIIlIIIIIl[1]);
                "".length();
            }
            if (llllIIlllIIl(Inventory.isFull() ? 1 : 0)) {
                AccBuilderRogues.c = lIIIllllll[lIIlIIIIIl[37]];
                String[] strArr = new String[lIIlIIIIIl[1]];
                strArr[lIIlIIIIIl[0]] = lIIIllllll[lIIlIIIIIl[38]];
                if (llllIIlllIlI(TileObjects.getNearest(strArr))) {
                    String[] strArr2 = new String[lIIlIIIIIl[1]];
                    strArr2[lIIlIIIIIl[0]] = lIIIllllll[lIIlIIIIIl[39]];
                    TileObjects.getNearest(strArr2).interact(lIIIllllll[lIIlIIIIIl[40]]);
                    Time.sleepUntil(() -> {
                        String[] strArr3 = new String[lIIlIIIIIl[1]];
                        strArr3[lIIlIIIIIl[0]] = lIIIllllll[lIIlIIIIIl[53]];
                        if (llllIlIIIIIl(TileObjects.getNearest(strArr3))) {
                            ?? r0 = lIIlIIIIIl[1];
                            "".length();
                            return (-"   ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIlIIIIIl[0];
                    }, lIIlIIIIIl[41]);
                    "".length();
                }
            }
            if (llllIIllIlll(Inventory.isFull() ? 1 : 0)) {
                AccBuilderRogues.c = lIIIllllll[lIIlIIIIIl[42]];
                int[] iArr3 = new int[lIIlIIIIIl[1]];
                iArr3[lIIlIIIIIl[0]] = lIIlIIIIIl[43];
                Inventory.getAll(iArr3).forEach(item -> {
                    item.interact(lIIIllllll[lIIlIIIIIl[52]]);
                });
                int[] iArr4 = new int[lIIlIIIIIl[1]];
                iArr4[lIIlIIIIIl[0]] = lIIlIIIIIl[12];
                if (llllIIllIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                    int[] iArr5 = new int[lIIlIIIIIl[1]];
                    iArr5[lIIlIIIIIl[0]] = lIIlIIIIIl[12];
                    Inventory.getAll(iArr5).forEach(item2 -> {
                        item2.interact(lIIIllllll[lIIlIIIIIl[51]]);
                    });
                }
            }
        }
    }
}
