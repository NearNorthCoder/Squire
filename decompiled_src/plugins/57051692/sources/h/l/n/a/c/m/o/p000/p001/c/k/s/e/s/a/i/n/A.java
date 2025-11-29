package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
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
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.A  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/A.class */
public class A implements K {
    private static /* synthetic */ String[] cy;
    private static /* synthetic */ int[] lIllIIIlll;
    static /* synthetic */ int dc;
    public static final /* synthetic */ WorldPoint dY;
    public static /* synthetic */ boolean bn;
    private static /* synthetic */ String[] lIllIIIlIl;
    public static /* synthetic */ List<C0003d> bp;
    public static final /* synthetic */ WorldPoint dX;
    static /* synthetic */ boolean dd;

    private static boolean lIIlIllIlllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIlIlllIIlII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIlllIIIIl(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIllIlllIl(int i, int i2) {
        return i == i2;
    }

    public static void bG() {
        String[] strArr = new String[lIllIIIlll[3]];
        strArr[lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[46]];
        if (lIIlIlllIIlIl(NPCs.getNearest(strArr))) {
            if (lIIlIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                if (lIIlIllIlllll(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                Movement.walkTo(dX);
                "".length();
                Time.sleepTicks(lIllIIIlll[3]);
                "".length();
            }
            if (lIIlIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[47]];
                String[] strArr2 = new String[lIllIIIlll[3]];
                strArr2[lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[48]];
                TileObjects.getNearest(strArr2).interact(lIllIIIlIl[lIllIIIlll[0]]);
                Time.sleepTicks(lIllIIIlll[1]);
                "".length();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIlIlllIIllI(Quests.getState(Quest.RECIPE_FOR_DISASTER__ANOTHER_COOKS_QUEST), QuestState.FINISHED)) {
            ?? r0 = lIllIIIlll[3];
            "".length();
            return (-"  ".length()) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIllIIIlll[4];
    }

    private static boolean lIIlIlllIIIlI(int i) {
        return i > 0;
    }

    private static String lIIlIllIIlIll(String lllllllllllllllllllIIlIIIllIIIIl, String lllllllllllllllllllIIlIIIllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlIIIllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIIlll[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIIIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIlIIIllIIIlI) {
            lllllllllllllllllllIIlIIIllIIIlI.printStackTrace();
            return null;
        }
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            System.out.println("678: " + C0004e.j(lIllIIIlll[5]));
            bF();
            "".length();
            if (((52 ^ 31) & ((239 ^ 196) ^ (-1))) < 0) {
                return (112 ^ 83) & ((3 ^ 32) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIllIIIlll[57];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIllIIIlll[4];
    }

    private static String lIIlIllIIlIlI(String lllllllllllllllllllIIlIIIlllIllI, String lllllllllllllllllllIIlIIIlllIlIl) {
        String lllllllllllllllllllIIlIIIlllIllI2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIIlIIIlllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllIIlIIIlllIlIl.toCharArray();
        int lllllllllllllllllllIIlIIIlllIIlI = lIllIIIlll[4];
        char[] charArray2 = lllllllllllllllllllIIlIIIlllIllI2.toCharArray();
        int lllllllllllllllllllIIlIIIllIlIll = charArray2.length;
        int i = lIllIIIlll[4];
        while (lIIlIllIlllII(i, lllllllllllllllllllIIlIIIllIlIll)) {
            char lllllllllllllllllllIIlIIIlllIlll = charArray2[i];
            sb.append((char) (lllllllllllllllllllIIlIIIlllIlll ^ charArray[lllllllllllllllllllIIlIIIlllIIlI % charArray.length]));
            "".length();
            lllllllllllllllllllIIlIIIlllIIlI++;
            i++;
            "".length();
            if ((-(36 ^ 33)) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIlIlllIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean al() {
        String[] strArr = new String[lIllIIIlll[3]];
        strArr[lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[49]];
        if (lIIlIlllIIIlI(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIllIIIlll[3]];
            iArr[lIllIIIlll[4]] = lIllIIIlll[14];
            if (lIIlIlllIIIlI(Inventory.getCount(iArr))) {
                String[] strArr2 = new String[lIllIIIlll[3]];
                strArr2[lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[50]];
                if (lIIlIllIlllll(Inventory.contains(strArr2) ? 1 : 0)) {
                    int[] iArr2 = new int[lIllIIIlll[3]];
                    iArr2[lIllIIIlll[4]] = lIllIIIlll[18];
                    if (lIIlIllIlllll(Inventory.contains(iArr2) ? 1 : 0)) {
                        int[] iArr3 = new int[lIllIIIlll[3]];
                        iArr3[lIllIIIlll[4]] = lIllIIIlll[11];
                        if (lIIlIllIlllll(Inventory.contains(iArr3) ? 1 : 0)) {
                            ?? r0 = lIllIIIlll[3];
                            "".length();
                            return 0 != 0 ? ((15 ^ 88) ^ "  ".length()) & (((251 ^ 139) ^ (153 ^ 188)) ^ (-" ".length())) : r0;
                        }
                    }
                }
            }
        }
        return lIllIIIlll[4];
    }

    private static boolean lIIlIllIllllI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIlIlllIIIII(int i) {
        return i == 0;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIllIIIlIl[lIllIIIlll[58]];
    }

    private static String lIIlIllIIlIIl(String lllllllllllllllllllIIlIIIlIlIlII, String lllllllllllllllllllIIlIIIlIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlIIIlIlIIll.getBytes(StandardCharsets.UTF_8)), lIllIIIlll[23]), "DES");
            Cipher lllllllllllllllllllIIlIIIlIlIllI = Cipher.getInstance("DES");
            lllllllllllllllllllIIlIIIlIlIllI.init(lIllIIIlll[1], secretKeySpec);
            return new String(lllllllllllllllllllIIlIIIlIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlIIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIlIIIlIlIlIl) {
            lllllllllllllllllllIIlIIIlIlIlIl.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIllIllIll();
        lIIlIllIllIlI();
        dX = new WorldPoint(lIllIIIlll[67], lIllIIIlll[68], lIllIIIlll[4]);
        dY = new WorldPoint(lIllIIIlll[69], lIllIIIlll[70], lIllIIIlll[4]);
        bp = new ArrayList();
        String[] strArr = new String[lIllIIIlll[23]];
        strArr[lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[71]];
        strArr[lIllIIIlll[3]] = lIllIIIlIl[lIllIIIlll[72]];
        strArr[lIllIIIlll[1]] = lIllIIIlIl[lIllIIIlll[73]];
        strArr[lIllIIIlll[12]] = lIllIIIlIl[lIllIIIlll[74]];
        strArr[lIllIIIlll[7]] = lIllIIIlIl[lIllIIIlll[75]];
        strArr[lIllIIIlll[15]] = lIllIIIlIl[lIllIIIlll[76]];
        strArr[lIllIIIlll[17]] = lIllIIIlIl[lIllIIIlll[77]];
        strArr[lIllIIIlll[8]] = lIllIIIlIl[lIllIIIlll[78]];
        cy = strArr;
    }

    private static boolean lIIlIlllIIlIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01f7, code lost:
        if (lIIlIllIlllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.A.lIllIIIlll[2]) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void O() {
        int[] iArr;
        int[] iArr2 = new int[lIllIIIlll[3]];
        iArr2[lIllIIIlll[4]] = lIllIIIlll[19];
        if (lIIlIlllIIIII(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIlll[19], lIllIIIlll[2], C0009j.bZ));
            "".length();
        }
        int[] iArr3 = new int[lIllIIIlll[3]];
        iArr3[lIllIIIlll[4]] = lIllIIIlll[11];
        if (lIIlIlllIIIII(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIlll[11], lIllIIIlll[3], lIllIIIlll[51]));
            "".length();
        }
        int[] iArr4 = new int[lIllIIIlll[3]];
        iArr4[lIllIIIlll[4]] = lIllIIIlll[14];
        if (lIIlIlllIIIII(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIlll[14], lIllIIIlll[3], lIllIIIlll[51]));
            "".length();
        }
        int[] iArr5 = new int[lIllIIIlll[3]];
        iArr5[lIllIIIlll[4]] = lIllIIIlll[18];
        if (lIIlIlllIIIII(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIlll[18], lIllIIIlll[3], lIllIIIlll[51]));
            "".length();
        }
        int[] iArr6 = new int[lIllIIIlll[3]];
        iArr6[lIllIIIlll[4]] = lIllIIIlll[16];
        if (lIIlIlllIIIII(Bank.contains(iArr6) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIlll[16], lIllIIIlll[3], lIllIIIlll[51]));
            "".length();
        }
        int[] iArr7 = new int[lIllIIIlll[3]];
        iArr7[lIllIIIlll[4]] = lIllIIIlll[13];
        if (lIIlIlllIIIII(Bank.contains(iArr7) ? 1 : 0)) {
            bp.add(new C0003d(lIllIIIlll[13], lIllIIIlll[3], lIllIIIlll[52]));
            "".length();
        }
        int[] iArr8 = new int[lIllIIIlll[3]];
        iArr8[lIllIIIlll[4]] = lIllIIIlll[10];
        if (lIIlIllIlllll(Bank.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[lIllIIIlll[3]];
            iArr9[lIllIIIlll[4]] = lIllIIIlll[10];
            if (lIIlIllIlllll(Bank.contains(iArr9) ? 1 : 0)) {
                int[] iArr10 = new int[lIllIIIlll[3]];
                iArr10[lIllIIIlll[4]] = lIllIIIlll[10];
            }
            if (lIIlIlllIIIII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIllIIIlIl[lIllIIIlll[59]]);
            }) ? 1 : 0)) {
                bp.add(new C0003d(lIllIIIlll[54], lIllIIIlll[15], lIllIIIlll[55]));
                "".length();
            }
            iArr = new int[lIllIIIlll[3]];
            iArr[lIllIIIlll[4]] = lIllIIIlll[9];
            if (lIIlIllIlllll(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr11 = new int[lIllIIIlll[3]];
                iArr11[lIllIIIlll[4]] = lIllIIIlll[9];
                if (!lIIlIllIlllll(Bank.contains(iArr11) ? 1 : 0)) {
                    return;
                }
                int[] iArr12 = new int[lIllIIIlll[3]];
                iArr12[lIllIIIlll[4]] = lIllIIIlll[9];
                if (!lIIlIllIlllII(Bank.getFirst(iArr12).getQuantity(), lIllIIIlll[2])) {
                    return;
                }
            }
            bp.add(new C0003d(lIllIIIlll[9], lIllIIIlll[56], lIllIIIlll[52]));
            "".length();
        }
        bp.add(new C0003d(lIllIIIlll[10], lIllIIIlll[2], lIllIIIlll[53]));
        "".length();
        if (lIIlIlllIIIII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIllIIIlIl[lIllIIIlll[59]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[lIllIIIlll[3]];
        iArr[lIllIIIlll[4]] = lIllIIIlll[9];
        if (lIIlIllIlllll(Bank.contains(iArr) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIllIIIlll[9], lIllIIIlll[56], lIllIIIlll[52]));
        "".length();
    }

    private static boolean lIIlIlllIIIll(int i, int i2) {
        return i > i2;
    }

    private static void lIIlIllIllIlI() {
        lIllIIIlIl = new String[lIllIIIlll[21]];
        lIllIIIlIl[lIllIIIlll[4]] = lIIlIllIIlIIl("4znJdtND9WpykpSR2TwqsQDgRaBi4PUKuJsphH+UrcQQwho/6IxUJRzH2nlYBlyw", "nXfRx");
        lIllIIIlIl[lIllIIIlll[3]] = lIIlIllIIlIIl("zFSgOhhAPi8Sm4WZOnFTrw==", "oUVOJ");
        lIllIIIlIl[lIllIIIlll[1]] = lIIlIllIIlIIl("IYuXC+BOoduICooyob9KBUvtV9R4JQ+V", "ucsrt");
        lIllIIIlIl[lIllIIIlll[12]] = lIIlIllIIlIlI("IDd2MDAScjs4MQQ7ODZiBiczIjZXISMhMhs7MyJuVyEhODYUOj8/JVcmOXEAIgsfHwU=", "wRVQB");
        lIllIIIlIl[lIllIIIlll[7]] = lIIlIllIIlIlI("CQYaNjw=", "MtsXW");
        lIllIIIlIl[lIllIIIlll[15]] = lIIlIllIIlIIl("Mct74o6OsLe347hTzMnyJg==", "ZeaJh");
        lIllIIIlIl[lIllIIIlll[17]] = lIIlIllIIlIlI("IyYIAzYCKQFHPgImCgg9", "kGfgZ");
        lIllIIIlIl[lIllIIIlll[8]] = lIIlIllIIlIlI("Lg4BGw==", "manpV");
        lIllIIIlIl[lIllIIIlll[23]] = lIIlIllIIlIlI("HD0LHiN4NhULKSw=", "XTyjZ");
        lIllIIIlIl[lIllIIIlll[24]] = lIIlIllIIlIll("yfm/o5b1PLNABRKfx+3oQurTeOgbXJxp", "yEWMI");
        lIllIIIlIl[lIllIIIlll[2]] = lIIlIllIIlIlI("MCAoJw==", "gEIUw");
        lIllIIIlIl[lIllIIIlll[30]] = lIIlIllIIlIlI("AxE5ZAkhAgcl", "SgiDH");
        lIllIIIlIl[lIllIIIlll[31]] = lIIlIllIIlIlI("Hz81PQ82PWE9CTU7NSY=", "XZAIf");
        lIllIIIlIl[lIllIIIlll[33]] = lIIlIllIIlIIl("nnddknQzNcQ=", "RoMJD");
        lIllIIIlIl[lIllIIIlll[34]] = lIIlIllIIlIIl("pBeVBnvYlts=", "qzsGn");
        lIllIIIlIl[lIllIIIlll[36]] = lIIlIllIIlIll("ibO7h70Btk8=", "VVncc");
        lIllIIIlIl[lIllIIIlll[35]] = lIIlIllIIlIIl("FgeAfYdasJ0=", "JJcfD");
        lIllIIIlIl[lIllIIIlll[37]] = lIIlIllIIlIll("CBFGM3tS+du2R0C+eElfKA==", "ietRW");
        lIllIIIlIl[lIllIIIlll[38]] = lIIlIllIIlIIl("GMxmGN+1a7o=", "HGucE");
        lIllIIIlIl[lIllIIIlll[39]] = lIIlIllIIlIIl("+jTWEd25GaYifUQ1fKDNJQ==", "bVctR");
        lIllIIIlIl[lIllIIIlll[40]] = lIIlIllIIlIll("Pl3bTxLywjQViV2lyVZbjw==", "xhKEK");
        lIllIIIlIl[lIllIIIlll[41]] = lIIlIllIIlIll("xPdeI70/oa4=", "wndMK");
        lIllIIIlIl[lIllIIIlll[42]] = lIIlIllIIlIll("0BIq2jk744nXUnaISe6HwA==", "QdOii");
        lIllIIIlIl[lIllIIIlll[43]] = lIIlIllIIlIlI("GwMFGg==", "XljqN");
        lIllIIIlIl[lIllIIIlll[44]] = lIIlIllIIlIIl("X8bcmpI0gOI=", "UZfqF");
        lIllIIIlIl[lIllIIIlll[45]] = lIIlIllIIlIIl("px6HtE8Cc7Q=", "suLuf");
        lIllIIIlIl[lIllIIIlll[46]] = lIIlIllIIlIll("jL3cgy8q8uQ=", "iEGHe");
        lIllIIIlIl[lIllIIIlll[47]] = lIIlIllIIlIIl("RdUgiW11JlEadklC1n1kKw==", "QzLNt");
        lIllIIIlIl[lIllIIIlll[48]] = lIIlIllIIlIll("U7hWqKnrc/w=", "pMVOY");
        lIllIIIlIl[lIllIIIlll[0]] = lIIlIllIIlIll("7lLFz5NvA/U=", "toujc");
        lIllIIIlIl[lIllIIIlll[49]] = lIIlIllIIlIll("8prae+ss4VH5vIf4dJFstQ==", "mNYVM");
        lIllIIIlIl[lIllIIIlll[50]] = lIIlIllIIlIlI("BxY7GiBhBiISJzU=", "AdNsT");
        lIllIIIlIl[lIllIIIlll[58]] = lIIlIllIIlIlI("PSk+UzUbDggHZh4aHwAy", "oozsF");
        lIllIIIlIl[lIllIIIlll[59]] = lIIlIllIIlIll("NzN2z+1wEZeYsFz4XmKYjpS2LeO1wLL5", "AndYS");
        lIllIIIlIl[lIllIIIlll[60]] = lIIlIllIIlIlI("LzYsFjMlJA==", "KCIzZ");
        lIllIIIlIl[lIllIIIlll[61]] = lIIlIllIIlIIl("BVOg/7uTjAE=", "egrqh");
        lIllIIIlIl[lIllIIIlll[62]] = lIIlIllIIlIlI("Mzk0AjM5Kw==", "WLQnZ");
        lIllIIIlIl[lIllIIIlll[63]] = lIIlIllIIlIll("z14Fup0378k=", "LKWPj");
        lIllIIIlIl[lIllIIIlll[64]] = lIIlIllIIlIIl("vQIOK2WJAaw=", "bPlfl");
        lIllIIIlIl[lIllIIIlll[65]] = lIIlIllIIlIIl("QjnWH2o80kg=", "WHirb");
        lIllIIIlIl[lIllIIIlll[56]] = lIIlIllIIlIlI("NBIvCA4+AA==", "PgJdg");
        lIllIIIlIl[lIllIIIlll[66]] = lIIlIllIIlIll("fZ4SkdYBJP0=", "VgWRy");
        lIllIIIlIl[lIllIIIlll[71]] = lIIlIllIIlIll("xrr05/lCJblKc3sSsEAoxrrVxLhz9CSM", "ImNbk");
        lIllIIIlIl[lIllIIIlll[72]] = lIIlIllIIlIIl("MnXkTExO77xYa6W03Fk6rpCs/xlHgPT5EhUAJhDB5eljSjIwAoJi60uyG/4GvX0m", "hvqQg");
        lIllIIIlIl[lIllIIIlll[73]] = lIIlIllIIlIIl("8Cs1v7rC+EQG4tpMRVMMqfFWXvzGv6ZW/gP6wensXqNO1wYeY1Qg7lfHt7dygMeu", "DmkoK");
        lIllIIIlIl[lIllIIIlll[74]] = lIIlIllIIlIIl("U6kVXn0ipqs=", "oYOoY");
        lIllIIIlIl[lIllIIIlll[75]] = lIIlIllIIlIll("6OPCs9/3l+KO7b0A+w0EdQ==", "gyguP");
        lIllIIIlIl[lIllIIIlll[76]] = lIIlIllIIlIlI("KhpFDRcbVQ0VDgtVBBoBThoRHB0cVRQBHR0BFlQeAQdFGR1R", "nuetx");
        lIllIIIlIl[lIllIIIlll[77]] = lIIlIllIIlIIl("V5nU0t3WYZLe4VQC7l4V00Fg/zneKEo2DKDPvVItT7A=", "YSqeW");
        lIllIIIlIl[lIllIIIlll[78]] = lIIlIllIIlIll("RMNMchRrll/zxkkGA5zSlhrt+QBI+9U1WvDiS9NLb/g=", "XxfFi");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v300, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v322, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    public static void bF() {
        if (lIIlIllIlllII(C0004e.j(lIllIIIlll[0]), lIllIIIlll[1])) {
            E.cc();
        }
        if (lIIlIllIlllII(Skills.getLevel(Skill.COOKING), lIllIIIlll[2]) && lIIlIllIlllIl(C0004e.j(lIllIIIlll[0]), lIllIIIlll[1])) {
            U.dj();
        }
        if (lIIlIllIllllI(Skills.getLevel(Skill.COOKING), lIllIIIlll[2]) && lIIlIllIlllIl(C0004e.j(lIllIIIlll[0]), lIllIIIlll[1])) {
            if (lIIlIllIlllll(bn ? 1 : 0)) {
                C0001b.a(bp);
                if (lIIlIllIlllII(bp.size(), lIllIIIlll[3])) {
                    System.out.println(lIllIIIlIl[lIllIIIlll[4]]);
                    bn = lIllIIIlll[4];
                }
            }
            if (lIIlIlllIIIII(bn ? 1 : 0)) {
                if (lIIlIlllIIIII(al() ? 1 : 0) && lIIlIlllIIIII(C0004e.j(lIllIIIlll[5]))) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lIIlIlllIIIIl(nearest) && lIIlIlllIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[3]];
                        C0000a.a(nearest);
                    }
                    if (lIIlIlllIIIIl(nearest) && lIIlIllIlllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lIIlIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIllIIIlll[6]);
                            "".length();
                        }
                        if (lIIlIllIlllll(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[1]];
                            if (lIIlIlllIIIlI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIllIIIlll[7]);
                                "".length();
                            }
                            if (lIIlIlllIIIlI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIllIIIlll[1]);
                                "".length();
                            }
                            int[] iArr = new int[lIllIIIlll[8]];
                            iArr[lIllIIIlll[4]] = lIllIIIlll[9];
                            iArr[lIllIIIlll[3]] = lIllIIIlll[10];
                            iArr[lIllIIIlll[1]] = lIllIIIlll[11];
                            iArr[lIllIIIlll[12]] = lIllIIIlll[13];
                            iArr[lIllIIIlll[7]] = lIllIIIlll[14];
                            iArr[lIllIIIlll[15]] = lIllIIIlll[16];
                            iArr[lIllIIIlll[17]] = lIllIIIlll[18];
                            if (lIIlIlllIIIII(C0004e.b(iArr) ? 1 : 0)) {
                                O();
                                System.out.println(lIllIIIlIl[lIllIIIlll[12]]);
                                bn = lIllIIIlll[3];
                                return;
                            }
                            int[] iArr2 = new int[lIllIIIlll[8]];
                            iArr2[lIllIIIlll[4]] = lIllIIIlll[9];
                            iArr2[lIllIIIlll[3]] = lIllIIIlll[10];
                            iArr2[lIllIIIlll[1]] = lIllIIIlll[11];
                            iArr2[lIllIIIlll[12]] = lIllIIIlll[13];
                            iArr2[lIllIIIlll[7]] = lIllIIIlll[14];
                            iArr2[lIllIIIlll[15]] = lIllIIIlll[16];
                            iArr2[lIllIIIlll[17]] = lIllIIIlll[18];
                            if (lIIlIllIlllll(C0004e.b(iArr2) ? 1 : 0)) {
                                C0000a.a(lIllIIIlll[9], lIllIIIlll[2]);
                                C0000a.a(lIllIIIlll[10], lIllIIIlll[2]);
                                C0000a.a(lIllIIIlll[11], lIllIIIlll[3]);
                                C0000a.a(lIllIIIlll[13], lIllIIIlll[3]);
                                C0000a.a(lIllIIIlll[14], lIllIIIlll[3]);
                                C0000a.a(lIllIIIlll[16], lIllIIIlll[3]);
                                C0000a.a(lIllIIIlll[18], lIllIIIlll[3]);
                                C0000a.a(lIllIIIlll[19], lIllIIIlll[1]);
                                C0000a.a(lIllIIIlll[20], lIllIIIlll[6]);
                            }
                        }
                    }
                }
                if (lIIlIllIlllll(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIlIllIlllII(Movement.getRunEnergy(), lIllIIIlll[21])) {
                    Inventory.getFirst(C0005f.aU).interact(lIllIIIlIl[lIllIIIlll[7]]);
                    Time.sleepTicks(lIllIIIlll[3]);
                    "".length();
                }
                if (lIIlIlllIIIII(C0004e.j(lIllIIIlll[5])) && lIIlIllIlllll(al() ? 1 : 0)) {
                    AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[15]];
                    if (lIIlIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                        if (lIIlIllIlllll(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(dX);
                        "".length();
                        Time.sleepTicks(lIllIIIlll[3]);
                        "".length();
                    }
                    if (lIIlIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                        AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[17]];
                        C0006g.a(lIllIIIlIl[lIllIIIlll[8]], cy);
                    }
                }
                if (lIIlIllIlllIl(C0004e.j(lIllIIIlll[5]), lIllIIIlll[3])) {
                    int[] iArr3 = new int[lIllIIIlll[3]];
                    iArr3[lIllIIIlll[4]] = lIllIIIlll[22];
                    if (lIIlIlllIIIII(Inventory.contains(iArr3) ? 1 : 0)) {
                        String[] strArr = new String[lIllIIIlll[3]];
                        strArr[lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[23]];
                        if (lIIlIlllIIIII(Inventory.contains(strArr) ? 1 : 0)) {
                            dc = lIllIIIlll[4];
                            if (lIIlIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(dY), lIllIIIlll[7])) {
                                AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[24]];
                                WorldArea worldArea = new WorldArea(lIllIIIlll[25], lIllIIIlll[26], lIllIIIlll[27], lIllIIIlll[28], lIllIIIlll[4]);
                                if (lIIlIlllIIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIIlIllIlllll(Inventory.contains(item -> {
                                        return item.getName().contains(lIllIIIlIl[lIllIIIlll[66]]);
                                    }) ? 1 : 0) && lIIlIlllIIIII(Equipment.contains(item2 -> {
                                        return item2.getName().contains(lIllIIIlIl[lIllIIIlll[56]]);
                                    }) ? 1 : 0)) {
                                        Inventory.getFirst(item3 -> {
                                            return item3.getName().contains(lIllIIIlIl[lIllIIIlll[65]]);
                                        }).interact(lIllIIIlIl[lIllIIIlll[2]]);
                                    }
                                    if (lIIlIllIlllll(Equipment.contains(item4 -> {
                                        return item4.getName().contains(lIllIIIlIl[lIllIIIlll[64]]);
                                    }) ? 1 : 0) && lIIlIllIlllIl(Players.getLocal().getAnimation(), lIllIIIlll[29])) {
                                        Equipment.getFirst(item5 -> {
                                            return item5.getName().contains(lIllIIIlIl[lIllIIIlll[63]]);
                                        }).interact(lIllIIIlIl[lIllIIIlll[30]]);
                                        Time.sleepTicks(lIllIIIlll[7]);
                                        "".length();
                                    }
                                }
                                if (lIIlIllIlllll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    Movement.walkTo(dY);
                                    "".length();
                                    Time.sleepTicks(lIllIIIlll[3]);
                                    "".length();
                                }
                            }
                            if (lIIlIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(dY), lIllIIIlll[7])) {
                                AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[31]];
                                if (lIIlIllIlllll(Widgets.get(lIllIIIlll[32]).isEmpty() ? 1 : 0)) {
                                    String[] strArr2 = new String[lIllIIIlll[3]];
                                    strArr2[lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[33]];
                                    NPCs.getNearest(strArr2).interact(lIllIIIlIl[lIllIIIlll[34]]);
                                    Time.sleepTicks(lIllIIIlll[12]);
                                    "".length();
                                }
                                if (lIIlIlllIIIII(Widgets.get(lIllIIIlll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get(lIllIIIlll[32], lIllIIIlll[35], lIllIIIlll[3]).interact(lIllIIIlIl[lIllIIIlll[36]]);
                                    Time.sleepTicks(lIllIIIlll[1]);
                                    "".length();
                                }
                                int[] iArr4 = new int[lIllIIIlll[3]];
                                iArr4[lIllIIIlll[4]] = lIllIIIlll[22];
                                if (lIIlIllIlllll(Inventory.contains(iArr4) ? 1 : 0) && lIIlIlllIIIII(Widgets.get(lIllIIIlll[32]).isEmpty() ? 1 : 0)) {
                                    Widgets.get(lIllIIIlll[32], lIllIIIlll[3], lIllIIIlll[30]).interact(lIllIIIlIl[lIllIIIlll[35]]);
                                    Time.sleepTicks(lIllIIIlll[3]);
                                    "".length();
                                }
                            }
                        }
                    }
                    int[] iArr5 = new int[lIllIIIlll[3]];
                    iArr5[lIllIIIlll[4]] = lIllIIIlll[22];
                    if (lIIlIllIlllll(Inventory.contains(iArr5) ? 1 : 0)) {
                        String[] strArr3 = new String[lIllIIIlll[3]];
                        strArr3[lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[37]];
                        if (lIIlIlllIIIII(Inventory.contains(strArr3) ? 1 : 0)) {
                            int[] iArr6 = new int[lIllIIIlll[3]];
                            iArr6[lIllIIIlll[4]] = lIllIIIlll[22];
                            if (lIIlIllIlllll(Inventory.contains(iArr6) ? 1 : 0) && lIIlIlllIIIII(Widgets.get(lIllIIIlll[32]).isEmpty() ? 1 : 0)) {
                                Widgets.get(lIllIIIlll[32], lIllIIIlll[3], lIllIIIlll[30]).interact(lIllIIIlIl[lIllIIIlll[38]]);
                                Time.sleepTicks(lIllIIIlll[3]);
                                "".length();
                            }
                            int[] iArr7 = new int[lIllIIIlll[3]];
                            iArr7[lIllIIIlll[4]] = lIllIIIlll[18];
                            Item first = Inventory.getFirst(iArr7);
                            String[] strArr4 = new String[lIllIIIlll[3]];
                            strArr4[lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[39]];
                            first.useOn(Inventory.getFirst(strArr4));
                            Time.sleepTicks(lIllIIIlll[1]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[lIllIIIlll[3]];
                    strArr5[lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[40]];
                    if (lIIlIllIlllll(Inventory.contains(strArr5) ? 1 : 0)) {
                        if (lIIlIlllIIIll(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                            if (lIIlIllIlllll(Dialog.isOpen() ? 1 : 0)) {
                                Dialog.close();
                            }
                            if (lIIlIllIlllll(Inventory.contains(item6 -> {
                                return item6.getName().contains(lIllIIIlIl[lIllIIIlll[62]]);
                            }) ? 1 : 0) && lIIlIlllIIIII(Equipment.contains(item7 -> {
                                return item7.getName().contains(lIllIIIlIl[lIllIIIlll[61]]);
                            }) ? 1 : 0)) {
                                Inventory.getFirst(item8 -> {
                                    return item8.getName().contains(lIllIIIlIl[lIllIIIlll[60]]);
                                }).interact(lIllIIIlIl[lIllIIIlll[41]]);
                                Time.sleepTicks(lIllIIIlll[1]);
                                "".length();
                            }
                            Movement.walkTo(dX);
                            "".length();
                            Time.sleepTicks(lIllIIIlll[3]);
                            "".length();
                        }
                        if (lIIlIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lIllIIIlll[12])) {
                            AccBuilderShamans.c = lIllIIIlIl[lIllIIIlll[42]];
                            if (lIIlIllIlllII(dc, lIllIIIlll[3])) {
                                Z.mI += lIllIIIlll[3];
                                Z.p(AccBuilderShamans.m);
                                dc += lIllIIIlll[3];
                                Z.mI = lIllIIIlll[4];
                                dd = lIllIIIlll[4];
                            }
                            C0006g.a(lIllIIIlIl[lIllIIIlll[43]], cy);
                        }
                    }
                }
                if (lIIlIllIlllIl(C0004e.j(lIllIIIlll[5]), lIllIIIlll[1])) {
                    String[] strArr6 = new String[lIllIIIlll[3]];
                    strArr6[lIllIIIlll[4]] = lIllIIIlIl[lIllIIIlll[44]];
                    TileObjects.getNearest(strArr6).interact(lIllIIIlIl[lIllIIIlll[45]]);
                    Time.sleepTicks(lIllIIIlll[1]);
                    "".length();
                }
            }
        }
    }

    private static void lIIlIllIllIll() {
        lIllIIIlll = new int[79];
        lIllIIIlll[0] = (239 ^ 141) ^ (((37 + 54) - (-20)) + 16);
        lIllIIIlll[1] = "  ".length();
        lIllIIIlll[2] = (88 ^ 11) ^ (12 ^ 85);
        lIllIIIlll[3] = " ".length();
        lIllIIIlll[4] = ((((65 + 191) - 171) + 133) ^ (((47 + 124) - 24) + 11)) & (((((26 + 224) - 175) + 152) ^ (((77 + 123) - 149) + 116)) ^ (-" ".length()));
        lIllIIIlll[5] = (-((-825) & 32633)) & (-265) & 32750;
        lIllIIIlll[6] = (-(83 ^ 22)) & (-9251) & 14318;
        lIllIIIlll[7] = (26 ^ 113) ^ (233 ^ 134);
        lIllIIIlll[8] = (10 ^ 54) ^ (102 ^ 93);
        lIllIIIlll[9] = (-24625) & 32631;
        lIllIIIlll[10] = (-(((161 + 150) - 287) + 144)) & (-17) & 8191;
        lIllIIIlll[11] = (-((-2121) & 10831)) & (-5122) & 16383;
        lIllIIIlll[12] = "   ".length();
        lIllIIIlll[13] = (((((32 + 68) - 17) + 95) + (191 ^ 134)) - (((192 + 165) - 353) + 194)) + ((6 + 169) - 10) + 19;
        lIllIIIlll[14] = (-22537) & 24445;
        lIllIIIlll[15] = 185 ^ 188;
        lIllIIIlll[16] = (-4491) & 6574;
        lIllIIIlll[17] = 140 ^ 138;
        lIllIIIlll[18] = (-((-1030) & 5549)) & (-8201) & 13311;
        lIllIIIlll[19] = (-39) & 12663;
        lIllIIIlll[20] = (-30737) & 31731;
        lIllIIIlll[21] = 147 ^ 161;
        lIllIIIlll[22] = (-1033) & 3550;
        lIllIIIlll[23] = 19 ^ 27;
        lIllIIIlll[24] = 105 ^ 96;
        lIllIIIlll[25] = (-25345) & 28637;
        lIllIIIlll[26] = (-2) & 3191;
        lIllIIIlll[27] = 210 ^ 164;
        lIllIIIlll[28] = ((130 + 27) - 61) + 41;
        lIllIIIlll[29] = -" ".length();
        lIllIIIlll[30] = (78 ^ 41) ^ (6 ^ 106);
        lIllIIIlll[31] = (((115 + 57) - (-29)) + 4) ^ (((180 + 33) - 122) + 102);
        lIllIIIlll[32] = (-11985) & 12284;
        lIllIIIlll[33] = (((57 + 62) - 67) + 99) ^ (((53 + 16) - 2) + 87);
        lIllIIIlll[34] = (149 ^ 152) ^ "   ".length();
        lIllIIIlll[35] = (70 ^ 123) ^ (30 ^ 51);
        lIllIIIlll[36] = (((79 + 95) - 81) + 60) ^ (((7 + 142) - 3) + 4);
        lIllIIIlll[37] = 59 ^ 42;
        lIllIIIlll[38] = (34 ^ 85) ^ (164 ^ 193);
        lIllIIIlll[39] = (7 ^ 81) ^ (195 ^ 134);
        lIllIIIlll[40] = (154 ^ 141) ^ "   ".length();
        lIllIIIlll[41] = (34 ^ 46) ^ (35 ^ 58);
        lIllIIIlll[42] = 60 ^ 42;
        lIllIIIlll[43] = (((85 + 130) - 124) + 49) ^ (((17 + 57) - (-32)) + 49);
        lIllIIIlll[44] = (((7 + 0) - (-51)) + 80) ^ (((2 + 75) - (-68)) + 1);
        lIllIIIlll[45] = 20 ^ 13;
        lIllIIIlll[46] = 152 ^ 130;
        lIllIIIlll[47] = (68 ^ 75) ^ (97 ^ 117);
        lIllIIIlll[48] = 117 ^ 105;
        lIllIIIlll[49] = 221 ^ 195;
        lIllIIIlll[50] = (((93 + 209) - 110) + 26) ^ (((172 + 108) - 227) + 144);
        lIllIIIlll[51] = (-((-11045) & 15356)) & (-2049) & 15359;
        lIllIIIlll[52] = (-((-16397) & 31870)) & (-11) & 16383;
        lIllIIIlll[53] = (-22657) & 24556;
        lIllIIIlll[54] = (-4147) & 16126;
        lIllIIIlll[55] = (-((-387) & 3539)) & (-4614) & 32765;
        lIllIIIlll[56] = (185 ^ 161) ^ (118 ^ 70);
        lIllIIIlll[57] = (60 ^ 14) ^ (197 ^ 147);
        lIllIIIlll[58] = (((31 + 18) - (-27)) + 59) ^ (((74 + 148) - 173) + 118);
        lIllIIIlll[59] = (1 ^ 101) ^ (73 ^ 12);
        lIllIIIlll[60] = 19 ^ 49;
        lIllIIIlll[61] = (((26 + 69) - 62) + 150) ^ (((90 + 0) - (-4)) + 54);
        lIllIIIlll[62] = (41 ^ 70) ^ (90 ^ 17);
        lIllIIIlll[63] = 74 ^ 111;
        lIllIIIlll[64] = (170 ^ 139) ^ (10 ^ 13);
        lIllIIIlll[65] = (210 ^ 159) ^ (240 ^ 154);
        lIllIIIlll[66] = 30 ^ 55;
        lIllIIIlll[67] = (-16497) & 19703;
        lIllIIIlll[68] = (-337) & 3550;
        lIllIIIlll[69] = (-24713) & 28094;
        lIllIIIlll[70] = (-((-10369) & 14749)) & (-33) & 7679;
        lIllIIIlll[71] = (35 ^ 48) ^ (101 ^ 92);
        lIllIIIlll[72] = (68 ^ 121) ^ (5 ^ 19);
        lIllIIIlll[73] = 40 ^ 4;
        lIllIIIlll[74] = (((95 + 131) - 86) + 34) ^ (((88 + 60) - 35) + 18);
        lIllIIIlll[75] = (((78 + 128) - 121) + 56) ^ (((23 + 123) - 77) + 94);
        lIllIIIlll[76] = 61 ^ 18;
        lIllIIIlll[77] = (167 ^ 168) ^ (38 ^ 25);
        lIllIIIlll[78] = (25 ^ 114) ^ (204 ^ 150);
    }

    private static boolean lIIlIllIlllll(int i) {
        return i != 0;
    }
}
