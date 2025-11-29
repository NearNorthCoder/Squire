package p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l;

import gg.squire.account.AccBuilderGWD;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Prayer;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
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
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
/* renamed from: -.-.k.r.-.b.a.g.c.d.o.c.u.t.e.-.o.l.i.d.i.c.u.c.w.n.e.n.l.A  reason: invalid package */
/* loaded from: 7ff08cb7-2eac-4b0f-b288-ca118289a708.jar:-/-/k/r/-/b/a/g/c/d/o/c/u/t/e/-/o/l/i/d/i/c/u/c/w/n/e/n/l/A.class */
public class A implements ab {
    public static final /* synthetic */ WorldPoint ea;
    public static final /* synthetic */ WorldPoint dV;
    public static final /* synthetic */ WorldPoint dZ;
    public static final /* synthetic */ WorldPoint dW;
    public static final /* synthetic */ WorldPoint dT;
    public static /* synthetic */ List<C0003d> bx;
    public static final /* synthetic */ WorldPoint eb;
    static /* synthetic */ int dk;
    public static final /* synthetic */ WorldPoint dY;
    private static /* synthetic */ int[] lllIllIII;
    private static /* synthetic */ String[] lllIlIlll;
    public static /* synthetic */ boolean bv;
    static /* synthetic */ boolean dl;
    public static final /* synthetic */ WorldPoint dX;
    private static /* synthetic */ String[] cG;
    static /* synthetic */ int ec;
    public static final /* synthetic */ WorldPoint dU;
    static /* synthetic */ WorldArea ed;

    private static String llIIIllllIlI(String llIllIlIlllll, String llIllIlIllllI) {
        String llIllIlIlllll2 = new String(Base64.getDecoder().decode(llIllIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIllIlIlllIl = new StringBuilder();
        char[] charArray = llIllIlIllllI.toCharArray();
        int llIllIlIllIll = lllIllIII[1];
        char[] charArray2 = llIllIlIlllll2.toCharArray();
        int length = charArray2.length;
        int llIllIlIlIIll = lllIllIII[1];
        while (llIIIlllllll(llIllIlIlIIll, length)) {
            llIllIlIlllIl.append((char) (charArray2[llIllIlIlIIll] ^ charArray[llIllIlIllIll % charArray.length]));
            "".length();
            llIllIlIllIll++;
            llIllIlIlIIll++;
            "".length();
            if ("  ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llIllIlIlllIl);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean an() {
        int[] iArr = new int[lllIllIII[12]];
        iArr[lllIllIII[1]] = lllIllIII[13];
        iArr[lllIllIII[0]] = lllIllIII[7];
        iArr[lllIllIII[5]] = lllIllIII[10];
        iArr[lllIllIII[11]] = lllIllIII[14];
        iArr[lllIllIII[6]] = lllIllIII[15];
        iArr[lllIllIII[16]] = lllIllIII[17];
        int i = lllIllIII[1];
        while (llIIIlllllll(i, iArr.length)) {
            int[] iArr2 = new int[lllIllIII[0]];
            iArr2[lllIllIII[1]] = iArr[i];
            if (llIIlIIIIIII(Inventory.contains(iArr2) ? 1 : 0)) {
                return lllIllIII[1];
            }
            i++;
            "".length();
            if ((((17 ^ 119) ^ (121 ^ 3)) & (((235 ^ 128) ^ (89 ^ 46)) ^ (-" ".length()))) <= (-" ".length())) {
                return ((84 ^ 93) ^ (184 ^ 159)) & (((((119 + 61) - 104) + 74) ^ (((122 + 177) - 132) + 17)) ^ (-" ".length()));
            }
        }
        return lllIllIII[0];
    }

    private static boolean llIIlIIIlIII(int i, int i2) {
        return i != i2;
    }

    private static void llIIIlllllII() {
        lllIlIlll = new String[lllIllIII[112]];
        lllIlIlll[lllIllIII[1]] = llIIIllllIIl("c3s5IViQUvYUddIiBl4NfgrblfyZcZIPALj2E7NbNWDA8VsvMDEWCdeXbczgSRXZ", "NXHqA");
        lllIlIlll[lllIllIII[0]] = llIIIllllIIl("eqD6eN6DGXMORcwZWw1zig==", "qIFcy");
        lllIlIlll[lllIllIII[5]] = llIIIllllIlI("JyonHA0GJS5YAw4lIhEPCA==", "oKIxa");
        lllIlIlll[lllIllIII[11]] = llIIIllllIll("HYAD53kQVF97fvRM2nU4WRz8xrY6EVtFyzpmQBm1C5LkiMRDor/XMjGmX+4kdCTs", "XGozJ");
        lllIlIlll[lllIllIII[6]] = llIIIllllIll("GATU/ttVOhXcEiTW0Q/q6dRxhbZueMJwyZPNPJoNc8BIt2xwFwO44wbASxTix6miOZ6xEWGV9J8=", "ILxDR");
        lllIlIlll[lllIllIII[16]] = llIIIllllIIl("cHQs3C/fJD8=", "aQXka");
        lllIlIlll[lllIllIII[12]] = llIIIllllIll("7qPUQWRMnIs=", "AuQRY");
        lllIlIlll[lllIllIII[22]] = llIIIllllIlI("ITssczMAeiknJh0u", "oZZSG");
        lllIlIlll[lllIllIII[23]] = llIIIllllIIl("TjGt2bZal6O2vRPf1cJebg==", "TkjMk");
        lllIlIlll[lllIllIII[24]] = llIIIllllIll("YTMoBK3i+56sgU6gaT4Rng==", "hqTFv");
        lllIlIlll[lllIllIII[18]] = llIIIllllIIl("/YomaU6/GjSQfiI8e16orA==", "xDqDV");
        lllIlIlll[lllIllIII[25]] = llIIIllllIll("6Fc8QyZ1OB0=", "vjdMS");
        lllIlIlll[lllIllIII[26]] = llIIIllllIIl("9XI3S+jJzLI=", "IwIuT");
        lllIlIlll[lllIllIII[3]] = llIIIllllIlI("GxESFxo=", "Xywdn");
        lllIlIlll[lllIllIII[27]] = llIIIllllIIl("q9Q7VKofrF8=", "cGHys");
        lllIlIlll[lllIllIII[28]] = llIIIllllIlI("PzYQCA==", "pFufs");
        lllIlIlll[lllIllIII[29]] = llIIIllllIIl("QCzDzEinuVk=", "ugvee");
        lllIlIlll[lllIllIII[30]] = llIIIllllIlI("CQUCIgY=", "JmgQr");
        lllIlIlll[lllIllIII[31]] = llIIIllllIIl("Kho6CR0vCsg=", "bmeZe");
        lllIlIlll[lllIllIII[32]] = llIIIllllIll("z9mnbcO4Z6Y=", "Ankgv");
        lllIlIlll[lllIllIII[33]] = llIIIllllIIl("k6xqoWgnbWs=", "laFuK");
        lllIlIlll[lllIllIII[34]] = llIIIllllIlI("MAoQBzU=", "sbutA");
        lllIlIlll[lllIllIII[35]] = llIIIllllIIl("WHcYi3QaH/U=", "MYaqE");
        lllIlIlll[lllIllIII[36]] = llIIIllllIIl("T7pAJx+2WXY=", "CypwH");
        lllIlIlll[lllIllIII[37]] = llIIIllllIll("3e5FoyWMGa8=", "UfjJy");
        lllIlIlll[lllIllIII[21]] = llIIIllllIll("CHA3KL6jZtY=", "hTtkg");
        lllIlIlll[lllIllIII[40]] = llIIIllllIlI("FgYkGQ==", "AcEky");
        lllIlIlll[lllIllIII[41]] = llIIIllllIIl("DTd9ybGIy/yQsmGeqJlvTA==", "sprwv");
        lllIlIlll[lllIllIII[42]] = llIIIllllIll("HGT9k8NSu8Q=", "CLmmc");
        lllIlIlll[lllIllIII[43]] = llIIIllllIIl("SQPYUj+8B2k=", "CzeYv");
        lllIlIlll[lllIllIII[44]] = llIIIllllIIl("qZAftvXUaUoOYl+Ap09OvA==", "QncCO");
        lllIlIlll[lllIllIII[45]] = llIIIllllIll("CZRe8K6veLnDSoOZ1GUZqg==", "BoEKY");
        lllIlIlll[lllIllIII[46]] = llIIIllllIlI("BR8OGARuFR0RGg==", "Nwotm");
        lllIlIlll[lllIllIII[47]] = llIIIllllIIl("+nHDae9kKgFZjViMP+8kEQ==", "LuOHj");
        lllIlIlll[lllIllIII[48]] = llIIIllllIll("9ccGsDO77niTHEzP3fXchw==", "PAzws");
        lllIlIlll[lllIllIII[49]] = llIIIllllIll("dgdm7tiwRpWk9eYeeqMvNA==", "rtQBQ");
        lllIlIlll[lllIllIII[50]] = llIIIllllIlI("Gg80TwM7TiUaFiYK", "TnBow");
        lllIlIlll[lllIllIII[51]] = llIIIllllIll("+0tyiRuqggbwURNNJQOd0g==", "bFnBS");
        lllIlIlll[lllIllIII[52]] = llIIIllllIll("8KIbkvDDB5YrPleRE4pXfw==", "MRPUm");
        lllIlIlll[lllIllIII[53]] = llIIIllllIlI("PSUeTD0cZEgfKB4pEQ==", "sDhlI");
        lllIlIlll[lllIllIII[54]] = llIIIllllIIl("xfxV4FKODDOus3eGpF9wz1TRosjQYbnw", "arUEQ");
        lllIlIlll[lllIllIII[55]] = llIIIllllIlI("PycFHhQGK0QrEgYq", "tOddu");
        lllIlIlll[lllIllIII[56]] = llIIIllllIlI("HxkGHjAmFUcrNiYU", "TqgdQ");
        lllIlIlll[lllIllIII[57]] = llIIIllllIll("5nDeSsPHq/8=", "qsngP");
        lllIlIlll[lllIllIII[58]] = llIIIllllIlI("NRIsAh1GICQdEg8f", "fsAod");
        lllIlIlll[lllIllIII[2]] = llIIIllllIll("m0wjrBHdZwY=", "TkWPU");
        lllIlIlll[lllIllIII[59]] = llIIIllllIIl("7WfOeqUjkoM=", "sgXwC");
        lllIlIlll[lllIllIII[60]] = llIIIllllIll("+rTrl+/C/uI=", "hZnJX");
        lllIlIlll[lllIllIII[61]] = llIIIllllIlI("Hxo1Di8mFnQnLTsAJB0hOg==", "TrTtN");
        lllIlIlll[lllIllIII[62]] = llIIIllllIlI("Py0QFBEGIVE9Exs3AQcfGg==", "tEqnp");
        lllIlIlll[lllIllIII[20]] = llIIIllllIll("atf+7NDJsFM=", "zBAUL");
        lllIlIlll[lllIllIII[63]] = llIIIllllIll("t0n02PxBXlY=", "GVqjT");
        lllIlIlll[lllIllIII[64]] = llIIIllllIIl("lBF+eCSJUWQ=", "HGuct");
        lllIlIlll[lllIllIII[65]] = llIIIllllIlI("NQ4uAzQf", "tzZbW");
        lllIlIlll[lllIllIII[66]] = llIIIllllIlI("IDMrHTEGOmUzKwYsJAon", "gVExC");
        lllIlIlll[lllIllIII[67]] = llIIIllllIIl("E9MrTLyIPZE=", "ILbFr");
        lllIlIlll[lllIllIII[71]] = llIIIllllIIl("5DIypbZPcBuEnf7IQw8zuA==", "qmOQr");
        lllIlIlll[lllIllIII[72]] = llIIIllllIlI("PTUHEjsbPEk8IRsqCAUt", "zPiwI");
        lllIlIlll[lllIllIII[76]] = llIIIllllIIl("QfV8Fg2n7VanIPcNAixe5Q==", "vqJRL");
        lllIlIlll[lllIllIII[79]] = llIIIllllIll("6Pa/2RwaJTw+YZsBNCK8MQ==", "HSCZl");
        lllIlIlll[lllIllIII[86]] = llIIIllllIlI("AxsjBy1lMzYKNyQ=", "ErDoY");
        lllIlIlll[lllIllIII[87]] = llIIIllllIll("y6V86Ii3yPFMciv6+fdpf+C7bMXfwVzc", "IQJvE");
        lllIlIlll[lllIllIII[88]] = llIIIllllIll("BOiz7U/J3Qg=", "MuIix");
        lllIlIlll[lllIllIII[89]] = llIIIllllIlI("FSwNFiwfPg==", "qYhzE");
        lllIlIlll[lllIllIII[90]] = llIIIllllIlI("Fgs4OQkoWRYrEiM=", "FyQJf");
        lllIlIlll[lllIllIII[109]] = llIIIllllIlI("ChIHQj1pGwwOBGkKBhdL", "Isibt");
        lllIlIlll[lllIllIII[110]] = llIIIllllIll("5FFSeL5HD8pYjPoFnMKeznQjfB07MtYvRpx2fs5yi9M=", "NgCoL");
        lllIlIlll[lllIllIII[111]] = llIIIllllIll("UQau+BIkwHM=", "bmRBm");
    }

    private static boolean llIIIllllllI(int i) {
        return i != 0;
    }

    static {
        llIIIlllllIl();
        llIIIlllllII();
        dT = new WorldPoint(lllIllIII[91], lllIllIII[92], lllIllIII[1]);
        dU = new WorldPoint(lllIllIII[93], lllIllIII[94], lllIllIII[1]);
        dV = new WorldPoint(lllIllIII[95], lllIllIII[96], lllIllIII[1]);
        dW = new WorldPoint(lllIllIII[97], lllIllIII[98], lllIllIII[1]);
        dX = new WorldPoint(lllIllIII[99], lllIllIII[100], lllIllIII[1]);
        dY = new WorldPoint(lllIllIII[101], lllIllIII[102], lllIllIII[1]);
        dZ = new WorldPoint(lllIllIII[103], lllIllIII[104], lllIllIII[1]);
        ea = new WorldPoint(lllIllIII[91], lllIllIII[105], lllIllIII[1]);
        eb = new WorldPoint(lllIllIII[106], lllIllIII[107], lllIllIII[1]);
        bx = new ArrayList();
        ec = lllIllIII[30];
        ed = new WorldArea(lllIllIII[93], lllIllIII[108], lllIllIII[26], lllIllIII[47], lllIllIII[1]);
        String[] strArr = new String[lllIllIII[11]];
        strArr[lllIllIII[1]] = lllIlIlll[lllIllIII[109]];
        strArr[lllIllIII[0]] = lllIlIlll[lllIllIII[110]];
        strArr[lllIllIII[5]] = lllIlIlll[lllIllIII[111]];
        cG = strArr;
    }

    private static boolean llIIIlllllll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ah() {
        if (!llIIlIIIlIIl(Quests.getState(Quest.FIGHT_ARENA), QuestState.FINISHED) || llIIlIIIIIIl(C0004e.j(ec), lllIllIII[27])) {
            ?? r0 = lllIllIII[0];
            "".length();
            return (((125 ^ 78) & ((109 ^ 94) ^ (-1))) & (((134 ^ 139) & ((108 ^ 97) ^ (-1))) ^ (-1))) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lllIllIII[1];
    }

    private static boolean llIIlIIIIlII(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x0edf, code lost:
        if (llIIlIIIIlII(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(r0), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.lllIllIII[70]) != false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b6, code lost:
        if (llIIlIIIIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.lllIllIII[8]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f9, code lost:
        if (llIIlIIIIIIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.lllIllIII[8]) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x023c, code lost:
        if (llIIIlllllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.lllIllIII[8]) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x023f, code lost:
        Q();
        java.lang.System.out.println(p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.lllIlIlll[p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.lllIllIII[11]]);
        p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.bv = p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.lllIllIII[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x025a, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0fd7  */
    /* JADX WARN: Type inference failed for: r0v567, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v582, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v613, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bq() {
        if (llIIIllllllI(bv ? 1 : 0)) {
            C0001b.a(bx);
            if (llIIIlllllll(bx.size(), lllIllIII[0])) {
                System.out.println(lllIlIlll[lllIllIII[1]]);
                bv = lllIllIII[1];
            }
        }
        if (llIIlIIIIIII(bv ? 1 : 0)) {
            if (llIIIlllllll(Skills.getLevel(Skill.PRAYER), lllIllIII[2])) {
                aq.ea();
            }
            if (llIIlIIIIIIl(Skills.getLevel(Skill.PRAYER), lllIllIII[2]) && llIIIlllllll(Skills.getLevel(Skill.MAGIC), lllIllIII[3])) {
                C0012m.ak();
            }
            if (llIIlIIIIIII(an() ? 1 : 0) && llIIIlllllll(C0004e.j(ec), lllIllIII[0]) && llIIlIIIIIIl(Skills.getLevel(Skill.PRAYER), lllIllIII[2]) && llIIlIIIIIIl(Skills.getLevel(Skill.MAGIC), lllIllIII[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (llIIlIIIIIlI(nearest) && llIIlIIIIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIlll[lllIllIII[0]];
                    C0000a.a(nearest);
                }
                if (llIIlIIIIIlI(nearest) && llIIIllllllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIlIIIIIII(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lllIllIII[4]);
                        "".length();
                    }
                    if (llIIIllllllI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderGWD.c = lllIlIlll[lllIllIII[5]];
                        if (llIIlIIIIIll(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lllIllIII[6]);
                            "".length();
                        }
                        if (llIIlIIIIIll(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lllIllIII[5]);
                            "".length();
                        }
                        int[] iArr = new int[lllIllIII[0]];
                        iArr[lllIllIII[1]] = lllIllIII[7];
                        if (llIIIllllllI(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lllIllIII[0]];
                            iArr2[lllIllIII[1]] = lllIllIII[7];
                        }
                        int[] iArr3 = new int[lllIllIII[0]];
                        iArr3[lllIllIII[1]] = lllIllIII[9];
                        if (llIIIllllllI(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lllIllIII[0]];
                            iArr4[lllIllIII[1]] = lllIllIII[9];
                        }
                        int[] iArr5 = new int[lllIllIII[0]];
                        iArr5[lllIllIII[1]] = lllIllIII[10];
                        if (llIIIllllllI(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lllIllIII[0]];
                            iArr6[lllIllIII[1]] = lllIllIII[10];
                        }
                        int[] iArr7 = new int[lllIllIII[12]];
                        iArr7[lllIllIII[1]] = lllIllIII[13];
                        iArr7[lllIllIII[0]] = lllIllIII[7];
                        iArr7[lllIllIII[5]] = lllIllIII[10];
                        iArr7[lllIllIII[11]] = lllIllIII[14];
                        iArr7[lllIllIII[6]] = lllIllIII[15];
                        iArr7[lllIllIII[16]] = lllIllIII[17];
                        if (llIIlIIIIIII(C0004e.d(iArr7) ? 1 : 0)) {
                            Q();
                            System.out.println(lllIlIlll[lllIllIII[6]]);
                            bv = lllIllIII[0];
                            return;
                        }
                        int[] iArr8 = new int[lllIllIII[12]];
                        iArr8[lllIllIII[1]] = lllIllIII[13];
                        iArr8[lllIllIII[0]] = lllIllIII[7];
                        iArr8[lllIllIII[5]] = lllIllIII[10];
                        iArr8[lllIllIII[11]] = lllIllIII[14];
                        iArr8[lllIllIII[6]] = lllIllIII[15];
                        iArr8[lllIllIII[16]] = lllIllIII[17];
                        if (llIIIllllllI(C0004e.d(iArr8) ? 1 : 0)) {
                            while (llIIlIIIIIII(H.bT() ? 1 : 0)) {
                                H.bR();
                                Time.sleepTicks(lllIllIII[0]);
                                "".length();
                                "".length();
                                if ((-((((130 + 155) - 260) + 171) ^ (((192 + 115) - 190) + 76))) >= 0) {
                                    return;
                                }
                            }
                            if (llIIlIIIIIII(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(lllIllIII[12]);
                                "".length();
                            }
                            C0000a.a(lllIllIII[13], lllIllIII[18]);
                            C0000a.a(lllIllIII[14], lllIllIII[11]);
                            C0000a.a(lllIllIII[7], lllIllIII[8]);
                            C0000a.a(lllIllIII[10], lllIllIII[8]);
                            C0000a.a(lllIllIII[17], lllIllIII[11]);
                            C0000a.a(lllIllIII[15], lllIllIII[18]);
                            C0000a.a(lllIllIII[19], lllIllIII[4]);
                        }
                    }
                }
            }
            if (llIIIllllllI(Inventory.contains(C0005f.bc) ? 1 : 0) && llIIIlllllll(Movement.getRunEnergy(), lllIllIII[20])) {
                Inventory.getFirst(C0005f.bc).interact(lllIlIlll[lllIllIII[16]]);
                Time.sleepTicks(lllIllIII[0]);
                "".length();
            }
            if (llIIIlllllll(Prayers.getPoints(), lllIllIII[21]) && llIIIllllllI(Inventory.contains(C0005f.aZ) ? 1 : 0)) {
                Inventory.getFirst(C0005f.aZ).interact(lllIlIlll[lllIllIII[12]]);
            }
            if (llIIIllllllI(an() ? 1 : 0) && llIIlIIIIIII(C0004e.j(ec))) {
                if (llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dT), lllIllIII[16])) {
                    AccBuilderGWD.c = lllIlIlll[lllIllIII[22]];
                    if (llIIIllllllI(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(dT);
                    "".length();
                    Time.sleepTicks(lllIllIII[0]);
                    "".length();
                }
                if (llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dT), lllIllIII[16])) {
                    C0006g.a(lllIlIlll[lllIllIII[23]], cG);
                }
            }
            if (llIIlIIIIllI(C0004e.j(ec), lllIllIII[0])) {
                if (llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dU), lllIllIII[6]) && llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dV), lllIllIII[6])) {
                    AccBuilderGWD.c = lllIlIlll[lllIllIII[24]];
                    Movement.walkTo(dU);
                    "".length();
                    Time.sleepTicks(lllIllIII[0]);
                    "".length();
                }
                if (llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dU), lllIllIII[12])) {
                    AccBuilderGWD.c = lllIlIlll[lllIllIII[18]];
                    String[] strArr = new String[lllIllIII[0]];
                    strArr[lllIllIII[1]] = lllIlIlll[lllIllIII[25]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    String[] strArr2 = new String[lllIllIII[0]];
                    strArr2[lllIllIII[1]] = lllIlIlll[lllIllIII[26]];
                    if (llIIIllllllI(nearest2.hasAction(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[lllIllIII[0]];
                        strArr3[lllIllIII[1]] = lllIlIlll[lllIllIII[3]];
                        if (llIIlIIIIIII(Reachable.isInteractable(TileObjects.getNearest(strArr3)) ? 1 : 0)) {
                            String[] strArr4 = new String[lllIllIII[0]];
                            strArr4[lllIllIII[1]] = lllIlIlll[lllIllIII[27]];
                            TileObjects.getNearest(strArr4).interact(lllIlIlll[lllIllIII[28]]);
                            Time.sleepTicks(lllIllIII[6]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[lllIllIII[0]];
                    strArr5[lllIllIII[1]] = lllIlIlll[lllIllIII[29]];
                    if (llIIIllllllI(Reachable.isInteractable(TileObjects.getNearest(strArr5)) ? 1 : 0)) {
                        String[] strArr6 = new String[lllIllIII[0]];
                        strArr6[lllIllIII[1]] = lllIlIlll[lllIllIII[30]];
                        TileObject nearest3 = TileObjects.getNearest(strArr6);
                        String[] strArr7 = new String[lllIllIII[0]];
                        strArr7[lllIllIII[1]] = lllIlIlll[lllIllIII[31]];
                        if (llIIIllllllI(nearest3.hasAction(strArr7) ? 1 : 0)) {
                            String[] strArr8 = new String[lllIllIII[0]];
                            strArr8[lllIllIII[1]] = lllIlIlll[lllIllIII[32]];
                            TileObjects.getNearest(strArr8).interact(lllIlIlll[lllIllIII[33]]);
                            Time.sleepTicks(lllIllIII[5]);
                            "".length();
                        }
                        String[] strArr9 = new String[lllIllIII[0]];
                        strArr9[lllIllIII[1]] = lllIlIlll[lllIllIII[34]];
                        TileObject nearest4 = TileObjects.getNearest(strArr9);
                        String[] strArr10 = new String[lllIllIII[0]];
                        strArr10[lllIllIII[1]] = lllIlIlll[lllIllIII[35]];
                        if (llIIIllllllI(nearest4.hasAction(strArr10) ? 1 : 0)) {
                            String[] strArr11 = new String[lllIllIII[0]];
                            strArr11[lllIllIII[1]] = lllIlIlll[lllIllIII[36]];
                            TileObjects.getNearest(strArr11).interact(lllIlIlll[lllIllIII[37]]);
                            Time.sleepTicks(lllIllIII[5]);
                            "".length();
                        }
                    }
                }
            }
            if (llIIlIIIIllI(C0004e.j(ec), lllIllIII[5])) {
                int[] iArr9 = new int[lllIllIII[0]];
                iArr9[lllIllIII[1]] = lllIllIII[38];
                if (llIIIllllllI(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lllIllIII[0]];
                    iArr10[lllIllIII[1]] = lllIllIII[38];
                    Inventory.getFirst(iArr10).interact(lllIlIlll[lllIllIII[21]]);
                }
                int[] iArr11 = new int[lllIllIII[0]];
                iArr11[lllIllIII[1]] = lllIllIII[39];
                if (llIIIllllllI(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lllIllIII[0]];
                    iArr12[lllIllIII[1]] = lllIllIII[39];
                    Inventory.getFirst(iArr12).interact(lllIlIlll[lllIllIII[40]]);
                }
                if (llIIlIIIIIII(ed.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dW), lllIllIII[6])) {
                        AccBuilderGWD.c = lllIlIlll[lllIllIII[41]];
                        Movement.walkTo(dW);
                        "".length();
                        Time.sleepTicks(lllIllIII[0]);
                        "".length();
                    }
                    if (llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dW), lllIllIII[6]) && llIIlIIIIIII(Players.getLocal().isMoving() ? 1 : 0) && llIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr12 = new String[lllIllIII[0]];
                        strArr12[lllIllIII[1]] = lllIlIlll[lllIllIII[42]];
                        TileObjects.getNearest(strArr12).interact(lllIlIlll[lllIllIII[43]]);
                        Time.sleepTicks(lllIllIII[5]);
                        "".length();
                    }
                }
                if (llIIIllllllI(ed.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[6])) {
                        AccBuilderGWD.c = lllIlIlll[lllIllIII[44]];
                        Movement.walkTo(dX);
                        "".length();
                        Time.sleepTicks(lllIllIII[0]);
                        "".length();
                    }
                    if (llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[6]) && llIIlIIIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
                        C0006g.a(lllIlIlll[lllIllIII[45]], cG);
                    }
                }
            }
            if (llIIlIIIIllI(C0004e.j(ec), lllIllIII[11])) {
                String[] strArr13 = new String[lllIllIII[0]];
                strArr13[lllIllIII[1]] = lllIlIlll[lllIllIII[46]];
                if (llIIlIIIIIII(Inventory.contains(strArr13) ? 1 : 0)) {
                    if (llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(ea), lllIllIII[16])) {
                        AccBuilderGWD.c = lllIlIlll[lllIllIII[47]];
                        Movement.walkTo(ea);
                        "".length();
                        Time.sleepTicks(lllIllIII[0]);
                        "".length();
                    }
                    if (llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(ea), lllIllIII[16])) {
                        C0006g.a(lllIlIlll[lllIllIII[48]], cG);
                    }
                }
                String[] strArr14 = new String[lllIllIII[0]];
                strArr14[lllIllIII[1]] = lllIlIlll[lllIllIII[49]];
                if (llIIIllllllI(Inventory.contains(strArr14) ? 1 : 0)) {
                    AccBuilderGWD.c = lllIlIlll[lllIllIII[50]];
                    if (llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[16])) {
                        AccBuilderGWD.c = lllIlIlll[lllIllIII[51]];
                        Movement.walkTo(dX);
                        "".length();
                        Time.sleepTicks(lllIllIII[0]);
                        "".length();
                    }
                    if (llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[16])) {
                        C0006g.a(lllIlIlll[lllIllIII[52]], cG);
                    }
                }
            }
            if (llIIlIIIIllI(C0004e.j(ec), lllIllIII[16])) {
                if (llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(eb), lllIllIII[11])) {
                    AccBuilderGWD.c = lllIlIlll[lllIllIII[53]];
                    Movement.walkTo(eb);
                    "".length();
                    Time.sleepTicks(lllIllIII[0]);
                    "".length();
                }
                if (llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(eb), lllIllIII[11]) && llIIlIIIIIII(Players.getLocal().isMoving() ? 1 : 0) && llIIlIIIIIII(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr15 = new String[lllIllIII[0]];
                    strArr15[lllIllIII[1]] = lllIlIlll[lllIllIII[54]];
                    Inventory.getFirst(strArr15).useOn(TileObjects.getNearest(tileObject -> {
                        if (llIIIllllllI(tileObject.getName().contains(lllIlIlll[lllIllIII[90]]) ? 1 : 0) && llIIlIIIIlIl(tileObject.getWorldLocation().distanceTo(eb), lllIllIII[11])) {
                            ?? r0 = lllIllIII[0];
                            "".length();
                            return " ".length() <= 0 ? "  ".length() & ("  ".length() ^ (-1)) : r0;
                        }
                        return lllIllIII[1];
                    }));
                    Time.sleepTicks(lllIllIII[5]);
                    "".length();
                }
            }
            if (llIIlIIIIllI(C0004e.j(ec), lllIllIII[12])) {
                if (llIIlIIIIIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (llIIlIIIIIII(C0012m.ap() ? 1 : 0)) {
                    C0012m.aq();
                }
                if (llIIlIIIIlll(Players.getLocal().getInteracting())) {
                    String[] strArr16 = new String[lllIllIII[0]];
                    strArr16[lllIllIII[1]] = lllIlIlll[lllIllIII[55]];
                    if (llIIlIIIIIlI(NPCs.getNearest(strArr16))) {
                        String[] strArr17 = new String[lllIllIII[0]];
                        strArr17[lllIllIII[1]] = lllIlIlll[lllIllIII[56]];
                        NPCs.getNearest(strArr17).interact(lllIlIlll[lllIllIII[57]]);
                        Time.sleepTicks(lllIllIII[5]);
                        "".length();
                    }
                }
            }
            if (llIIlIIIIllI(C0004e.j(ec), lllIllIII[23]) && llIIlIIIIlll(Players.getLocal().getInteracting())) {
                C0006g.a(lllIlIlll[lllIllIII[58]], cG);
            }
            if (llIIlIIIIllI(C0004e.j(ec), lllIllIII[24])) {
                if (llIIlIIIIIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (llIIlIIIIIII(C0012m.ap() ? 1 : 0)) {
                    C0012m.aq();
                }
                String[] strArr18 = new String[lllIllIII[0]];
                strArr18[lllIllIII[1]] = lllIlIlll[lllIllIII[2]];
                if (llIIlIIIIIlI(NPCs.getNearest(strArr18))) {
                    String[] strArr19 = new String[lllIllIII[0]];
                    strArr19[lllIllIII[1]] = lllIlIlll[lllIllIII[59]];
                    if (llIIlIIIIlIl(NPCs.getNearest(strArr19).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lllIllIII[16])) {
                        C0006g.a(lllIlIlll[lllIllIII[60]], cG);
                    }
                }
                if (llIIlIIIIlll(Players.getLocal().getInteracting())) {
                    String[] strArr20 = new String[lllIllIII[0]];
                    strArr20[lllIllIII[1]] = lllIlIlll[lllIllIII[61]];
                    if (llIIlIIIIIlI(NPCs.getNearest(strArr20))) {
                        String[] strArr21 = new String[lllIllIII[0]];
                        strArr21[lllIllIII[1]] = lllIlIlll[lllIllIII[62]];
                        NPCs.getNearest(strArr21).interact(lllIlIlll[lllIllIII[20]]);
                        Time.sleepTicks(lllIllIII[5]);
                        "".length();
                    }
                }
            }
            if (llIIlIIIIllI(C0004e.j(ec), lllIllIII[18])) {
                if (llIIlIIIIIII(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (llIIlIIIIIII(C0012m.ap() ? 1 : 0)) {
                    C0012m.aq();
                }
                if (llIIlIIIIlll(Players.getLocal().getInteracting())) {
                    String[] strArr22 = new String[lllIllIII[0]];
                    strArr22[lllIllIII[1]] = lllIlIlll[lllIllIII[63]];
                    if (llIIlIIIIIlI(NPCs.getNearest(strArr22))) {
                        String[] strArr23 = new String[lllIllIII[0]];
                        strArr23[lllIllIII[1]] = lllIlIlll[lllIllIII[64]];
                        NPCs.getNearest(strArr23).interact(lllIlIlll[lllIllIII[65]]);
                        Time.sleepTicks(lllIllIII[5]);
                        "".length();
                    }
                }
            }
            if (!llIIlIIIlIII(C0004e.j(ec), lllIllIII[25]) || llIIlIIIIllI(C0004e.j(ec), lllIllIII[26])) {
                String[] strArr24 = new String[lllIllIII[0]];
                strArr24[lllIllIII[1]] = lllIlIlll[lllIllIII[66]];
                if (llIIlIIIIIlI(NPCs.getNearest(strArr24))) {
                    int[] iArr13 = new int[lllIllIII[0]];
                    iArr13[lllIllIII[1]] = lllIllIII[13];
                    Inventory.getFirst(iArr13).interact(lllIlIlll[lllIllIII[67]]);
                    Time.sleepTicks(lllIllIII[16]);
                    "".length();
                }
                WorldPoint worldPoint = new WorldPoint(lllIllIII[68], lllIllIII[69], lllIllIII[1]);
                if (llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(C0001b.K), lllIllIII[70]) && llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIllIII[6])) {
                    AccBuilderGWD.c = lllIlIlll[lllIllIII[71]];
                    Movement.walkTo(worldPoint);
                    "".length();
                    Time.sleepTicks(lllIllIII[0]);
                    "".length();
                }
                if (!llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lllIllIII[6]) || llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dX), lllIllIII[54])) {
                    if (llIIlIIIIlII(Players.getLocal().getWorldLocation().distanceTo(dT), lllIllIII[16])) {
                        String[] strArr25 = new String[lllIllIII[0]];
                        strArr25[lllIllIII[1]] = lllIlIlll[lllIllIII[72]];
                        if (llIIlIIIIlll(NPCs.getNearest(strArr25))) {
                        }
                    }
                    if (llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dT), lllIllIII[16])) {
                        if (llIIIlllllll(dk, lllIllIII[0])) {
                            as.ng += lllIllIII[0];
                            as.u(AccBuilderGWD.m);
                            dk += lllIllIII[0];
                            as.ng = lllIllIII[1];
                            dl = lllIllIII[1];
                        }
                        C0006g.a(lllIlIlll[lllIllIII[79]], cG);
                    }
                }
                WorldArea worldArea = new WorldArea(lllIllIII[73], lllIllIII[74], lllIllIII[43], lllIllIII[37], lllIllIII[1]);
                if (llIIIlllllll(C0004e.j(lllIllIII[75]), lllIllIII[24]) && llIIIllllllI(Equipment.contains(item -> {
                    return item.getName().contains(lllIlIlll[lllIllIII[89]]);
                }) ? 1 : 0)) {
                    Equipment.getFirst(item2 -> {
                        return item2.getName().contains(lllIlIlll[lllIllIII[88]]);
                    }).interact(lllIlIlll[lllIllIII[76]]);
                    Time.sleepTicks(lllIllIII[12]);
                    "".length();
                }
                if (llIIIllllllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(new WorldPoint(lllIllIII[77], lllIllIII[78], lllIllIII[1]));
                    "".length();
                    Time.sleepTicks(lllIllIII[0]);
                    "".length();
                }
                if (llIIlIIIIIII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(dT);
                    "".length();
                    Time.sleepTicks(lllIllIII[0]);
                    "".length();
                }
                if (llIIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(dT), lllIllIII[16])) {
                }
            }
            C0006g.a(cG);
        }
    }

    private static String llIIIllllIIl(String llIllIlIIlIlI, String llIllIlIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIllIlIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllIllIII[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIlIIlIll) {
            llIllIlIIlIll.printStackTrace();
            return null;
        }
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public int af() {
        try {
            bq();
            "".length();
            if (" ".length() >= "   ".length()) {
                return (122 ^ 74) & ((21 ^ 37) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lllIllIII[85];
    }

    private static boolean llIIlIIIIIll(int i) {
        return i > 0;
    }

    private static boolean llIIlIIIIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIIlIIIIlll(Object obj) {
        return obj == null;
    }

    private static boolean llIIlIIIlIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public boolean ae() {
        return lllIllIII[1];
    }

    private static boolean llIIlIIIIIIl(int i, int i2) {
        return i >= i2;
    }

    private static void llIIIlllllIl() {
        lllIllIII = new int[113];
        lllIllIII[0] = " ".length();
        lllIllIII[1] = (42 ^ 1) & ((47 ^ 4) ^ (-1));
        lllIllIII[2] = (100 ^ 59) ^ (200 ^ 186);
        lllIllIII[3] = 116 ^ 121;
        lllIllIII[4] = (-1030) & 6029;
        lllIllIII[5] = "  ".length();
        lllIllIII[6] = (219 ^ 190) ^ (91 ^ 58);
        lllIllIII[7] = (-((-46) & 5503)) & (-16513) & 22527;
        lllIllIII[8] = (-28692) & 29691;
        lllIllIII[9] = (-((-29205) & 31703)) & (-29713) & 32767;
        lllIllIII[10] = (-((-2869) & 12085)) & (-18694) & 28463;
        lllIllIII[11] = "   ".length();
        lllIllIII[12] = (((44 + 96) - 51) + 91) ^ (((127 + 37) - 105) + 119);
        lllIllIII[13] = (-" ".length()) & (-16433) & 24439;
        lllIllIII[14] = (-3205) & 15829;
        lllIllIII[15] = (-((-16971) & 28267)) & (-16961) & 28641;
        lllIllIII[16] = (154 ^ 165) ^ (95 ^ 101);
        lllIllIII[17] = (-((-24741) & 29933)) & (-8742) & 16367;
        lllIllIII[18] = 160 ^ 170;
        lllIllIII[19] = (-((-1153) & 9345)) & (-4113) & 13299;
        lllIllIII[20] = 125 ^ 79;
        lllIllIII[21] = 11 ^ 18;
        lllIllIII[22] = (((145 + 95) - 163) + 101) ^ (((44 + 19) - (-90)) + 28);
        lllIllIII[23] = 90 ^ 82;
        lllIllIII[24] = 66 ^ 75;
        lllIllIII[25] = (((98 + 111) - 24) + 4) ^ (((146 + 99) - 76) + 13);
        lllIllIII[26] = (18 ^ 71) ^ (193 ^ 152);
        lllIllIII[27] = (((6 + 22) - (-18)) + 131) ^ (((4 + 51) - (-26)) + 110);
        lllIllIII[28] = (((106 + 112) - 149) + 82) ^ (((38 + 13) - 23) + 124);
        lllIllIII[29] = (((1 + 127) - 5) + 9) ^ (((39 + 139) - 62) + 32);
        lllIllIII[30] = 109 ^ 124;
        lllIllIII[31] = 14 ^ 28;
        lllIllIII[32] = 65 ^ 82;
        lllIllIII[33] = 62 ^ 42;
        lllIllIII[34] = (58 ^ 54) ^ (82 ^ 75);
        lllIllIII[35] = 176 ^ 166;
        lllIllIII[36] = (((102 + 21) - 38) + 73) ^ (((4 + 27) - 21) + 127);
        lllIllIII[37] = (11 ^ 99) ^ (77 ^ 61);
        lllIllIII[38] = (129 ^ 198) ^ (80 ^ 92);
        lllIllIII[39] = (222 ^ 168) ^ (164 ^ 152);
        lllIllIII[40] = 139 ^ 145;
        lllIllIII[41] = 85 ^ 78;
        lllIllIII[42] = 189 ^ 161;
        lllIllIII[43] = (132 ^ 138) ^ (165 ^ 182);
        lllIllIII[44] = 92 ^ 66;
        lllIllIII[45] = 35 ^ 60;
        lllIllIII[46] = 185 ^ 153;
        lllIllIII[47] = 65 ^ 96;
        lllIllIII[48] = (72 ^ 22) ^ (193 ^ 189);
        lllIllIII[49] = 172 ^ 143;
        lllIllIII[50] = (175 ^ 186) ^ (166 ^ 151);
        lllIllIII[51] = (122 ^ 95) ^ ((161 ^ 184) & ((99 ^ 122) ^ (-1)));
        lllIllIII[52] = 29 ^ 59;
        lllIllIII[53] = (((103 + 111) - 73) + 11) ^ (((129 + 49) - 110) + 123);
        lllIllIII[54] = 37 ^ 13;
        lllIllIII[55] = (14 ^ 35) ^ (165 ^ 161);
        lllIllIII[56] = (135 ^ 163) ^ (108 ^ 98);
        lllIllIII[57] = 124 ^ 87;
        lllIllIII[58] = 11 ^ 39;
        lllIllIII[59] = 137 ^ 167;
        lllIllIII[60] = (9 ^ 42) ^ (153 ^ 149);
        lllIllIII[61] = (((165 + 147) - 192) + 57) ^ (((7 + 35) - 24) + 111);
        lllIllIII[62] = (134 ^ 138) ^ (7 ^ 58);
        lllIllIII[63] = (229 ^ 188) ^ (8 ^ 98);
        lllIllIII[64] = (127 ^ 40) ^ (238 ^ 141);
        lllIllIII[65] = (((106 + 11) - 77) + 113) ^ (((102 + 70) - 67) + 67);
        lllIllIII[66] = 158 ^ 168;
        lllIllIII[67] = 123 ^ 76;
        lllIllIII[68] = (-((-19537) & 24538)) & (-8195) & 16379;
        lllIllIII[69] = (-((-3681) & 20077)) & (-4161) & 24063;
        lllIllIII[70] = (((50 ^ 121) + (222 ^ 142)) - (56 ^ 22)) + (72 ^ 97);
        lllIllIII[71] = 169 ^ 145;
        lllIllIII[72] = (133 ^ 145) ^ (132 ^ 169);
        lllIllIII[73] = (-((-2841) & 31583)) & (-521) & 31694;
        lllIllIII[74] = (-17177) & 20255;
        lllIllIII[75] = 250 ^ 149;
        lllIllIII[76] = 161 ^ 155;
        lllIllIII[77] = (-((-30835) & 32383)) & (-28691) & 32703;
        lllIllIII[78] = (-9029) & 12101;
        lllIllIII[79] = 178 ^ 137;
        lllIllIII[80] = (-((-5733) & 32487)) & (-514) & 28667;
        lllIllIII[81] = (-((-20) & 20503)) & (-273) & 32735;
        lllIllIII[82] = (-6152) & 31151;
        lllIllIII[83] = (-16675) & 29674;
        lllIllIII[84] = (-7257) & 8156;
        lllIllIII[85] = (78 ^ 8) ^ (176 ^ 146);
        lllIllIII[86] = 150 ^ 170;
        lllIllIII[87] = (18 ^ 57) ^ (129 ^ 151);
        lllIllIII[88] = 64 ^ 126;
        lllIllIII[89] = 104 ^ 87;
        lllIllIII[90] = 6 ^ 70;
        lllIllIII[91] = (-" ".length()) & (-9497) & 12063;
        lllIllIII[92] = (-((-13) & 12686)) & (-513) & 16383;
        lllIllIII[93] = (-21764) & 24371;
        lllIllIII[94] = (-((-21149) & 29597)) & (-16523) & 28159;
        lllIllIII[95] = (-13579) & 16191;
        lllIllIII[96] = (-16642) & 19831;
        lllIllIII[97] = (-((-23086) & 32751)) & (-5) & 12285;
        lllIllIII[98] = (-(((52 + 40) - (-11)) + 26)) & (-28931) & 32231;
        lllIllIII[99] = (-28737) & 31351;
        lllIllIII[100] = (-((-517) & 13229)) & (-16386) & 32239;
        lllIllIII[101] = (-((-7047) & 16359)) & (-16518) & 28415;
        lllIllIII[102] = (-((-4169) & 28891)) & (-778) & 28639;
        lllIllIII[103] = (-(104 ^ 1)) & (-21761) & 24442;
        lllIllIII[104] = (-((-11457) & 16327)) & (-1) & 8014;
        lllIllIII[105] = (-20881) & 24023;
        lllIllIII[106] = (-1410) & 4027;
        lllIllIII[107] = (-((-18765) & 31597)) & (-1) & 15999;
        lllIllIII[108] = (-8985) & 12123;
        lllIllIII[109] = (40 ^ 122) ^ (84 ^ 71);
        lllIllIII[110] = 245 ^ 183;
        lllIllIII[111] = (((229 + 99) - 225) + 146) ^ (((11 + 45) - (-105)) + 25);
        lllIllIII[112] = (165 ^ 179) ^ (15 ^ 93);
    }

    @Override // p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.ab
    public String ag() {
        return lllIlIlll[lllIllIII[86]];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e6, code lost:
        if (llIIIlllllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.lllIllIII[8]) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016f, code lost:
        if (llIIIlllllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.lllIllIII[8]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01f8, code lost:
        if (llIIIlllllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.lllIllIII[28]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02ba, code lost:
        if (llIIIlllllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.lllIllIII[6]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x033f, code lost:
        if (llIIIlllllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.lllIllIII[5]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (llIIIlllllll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.p001.k.r.p002.b.a.g.c.d.o.c.u.t.e.p003.o.l.i.d.i.c.u.c.w.n.e.n.l.A.lllIllIII[8]) != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0388  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7 = new int[lllIllIII[0]];
        iArr7[lllIllIII[1]] = lllIllIII[9];
        if (llIIIllllllI(Bank.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lllIllIII[0]];
            iArr8[lllIllIII[1]] = lllIllIII[9];
            if (llIIIllllllI(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lllIllIII[0]];
                iArr9[lllIllIII[1]] = lllIllIII[9];
            }
            iArr = new int[lllIllIII[0]];
            iArr[lllIllIII[1]] = lllIllIII[7];
            if (llIIIllllllI(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr10 = new int[lllIllIII[0]];
                iArr10[lllIllIII[1]] = lllIllIII[7];
                if (llIIIllllllI(Bank.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lllIllIII[0]];
                    iArr11[lllIllIII[1]] = lllIllIII[7];
                }
                iArr2 = new int[lllIllIII[0]];
                iArr2[lllIllIII[1]] = lllIllIII[10];
                if (llIIIllllllI(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr12 = new int[lllIllIII[0]];
                    iArr12[lllIllIII[1]] = lllIllIII[10];
                    if (llIIIllllllI(Bank.contains(iArr12) ? 1 : 0)) {
                        int[] iArr13 = new int[lllIllIII[0]];
                        iArr13[lllIllIII[1]] = lllIllIII[10];
                    }
                    iArr3 = new int[lllIllIII[0]];
                    iArr3[lllIllIII[1]] = lllIllIII[15];
                    if (llIIIllllllI(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr14 = new int[lllIllIII[0]];
                        iArr14[lllIllIII[1]] = lllIllIII[15];
                        if (llIIIllllllI(Bank.contains(iArr14) ? 1 : 0)) {
                            int[] iArr15 = new int[lllIllIII[0]];
                            iArr15[lllIllIII[1]] = lllIllIII[15];
                        }
                        if (llIIlIIIIIII(Bank.contains(item -> {
                            return item.getName().toLowerCase().contains(lllIlIlll[lllIllIII[87]]);
                        }) ? 1 : 0)) {
                            bx.add(new C0003d(lllIllIII[81], lllIllIII[16], lllIllIII[82]));
                            "".length();
                        }
                        iArr4 = new int[lllIllIII[0]];
                        iArr4[lllIllIII[1]] = lllIllIII[14];
                        if (llIIIllllllI(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr16 = new int[lllIllIII[0]];
                            iArr16[lllIllIII[1]] = lllIllIII[14];
                            if (llIIIllllllI(Bank.contains(iArr16) ? 1 : 0)) {
                                int[] iArr17 = new int[lllIllIII[0]];
                                iArr17[lllIllIII[1]] = lllIllIII[14];
                            }
                            iArr5 = new int[lllIllIII[0]];
                            iArr5[lllIllIII[1]] = lllIllIII[17];
                            if (llIIIllllllI(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr18 = new int[lllIllIII[0]];
                                iArr18[lllIllIII[1]] = lllIllIII[17];
                                if (llIIIllllllI(Bank.contains(iArr18) ? 1 : 0)) {
                                    int[] iArr19 = new int[lllIllIII[0]];
                                    iArr19[lllIllIII[1]] = lllIllIII[17];
                                }
                                iArr6 = new int[lllIllIII[0]];
                                iArr6[lllIllIII[1]] = lllIllIII[13];
                                if (llIIIllllllI(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr20 = new int[lllIllIII[0]];
                                    iArr20[lllIllIII[1]] = lllIllIII[13];
                                    if (!llIIIllllllI(Bank.contains(iArr20) ? 1 : 0)) {
                                        return;
                                    }
                                    int[] iArr21 = new int[lllIllIII[0]];
                                    iArr21[lllIllIII[1]] = lllIllIII[13];
                                    if (!llIIIlllllll(Bank.getFirst(iArr21).getQuantity(), lllIllIII[28])) {
                                        return;
                                    }
                                }
                                bx.add(new C0003d(lllIllIII[13], lllIllIII[54], lllIllIII[84]));
                                "".length();
                            }
                            bx.add(new C0003d(lllIllIII[17], lllIllIII[11], lllIllIII[83]));
                            "".length();
                            iArr6 = new int[lllIllIII[0]];
                            iArr6[lllIllIII[1]] = lllIllIII[13];
                            if (llIIIllllllI(Bank.contains(iArr6) ? 1 : 0)) {
                            }
                            bx.add(new C0003d(lllIllIII[13], lllIllIII[54], lllIllIII[84]));
                            "".length();
                        }
                        bx.add(new C0003d(lllIllIII[14], lllIllIII[6], C0009j.ch));
                        "".length();
                        iArr5 = new int[lllIllIII[0]];
                        iArr5[lllIllIII[1]] = lllIllIII[17];
                        if (llIIIllllllI(Bank.contains(iArr5) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(lllIllIII[17], lllIllIII[11], lllIllIII[83]));
                        "".length();
                        iArr6 = new int[lllIllIII[0]];
                        iArr6[lllIllIII[1]] = lllIllIII[13];
                        if (llIIIllllllI(Bank.contains(iArr6) ? 1 : 0)) {
                        }
                        bx.add(new C0003d(lllIllIII[13], lllIllIII[54], lllIllIII[84]));
                        "".length();
                    }
                    bx.add(new C0003d(lllIllIII[15], lllIllIII[33], lllIllIII[80]));
                    "".length();
                    if (llIIlIIIIIII(Bank.contains(item2 -> {
                        return item2.getName().toLowerCase().contains(lllIlIlll[lllIllIII[87]]);
                    }) ? 1 : 0)) {
                    }
                    iArr4 = new int[lllIllIII[0]];
                    iArr4[lllIllIII[1]] = lllIllIII[14];
                    if (llIIIllllllI(Bank.contains(iArr4) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lllIllIII[14], lllIllIII[6], C0009j.ch));
                    "".length();
                    iArr5 = new int[lllIllIII[0]];
                    iArr5[lllIllIII[1]] = lllIllIII[17];
                    if (llIIIllllllI(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lllIllIII[17], lllIllIII[11], lllIllIII[83]));
                    "".length();
                    iArr6 = new int[lllIllIII[0]];
                    iArr6[lllIllIII[1]] = lllIllIII[13];
                    if (llIIIllllllI(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bx.add(new C0003d(lllIllIII[13], lllIllIII[54], lllIllIII[84]));
                    "".length();
                }
                bx.add(new C0003d(lllIllIII[10], lllIllIII[8], lllIllIII[18]));
                "".length();
                iArr3 = new int[lllIllIII[0]];
                iArr3[lllIllIII[1]] = lllIllIII[15];
                if (llIIIllllllI(Bank.contains(iArr3) ? 1 : 0)) {
                }
                bx.add(new C0003d(lllIllIII[15], lllIllIII[33], lllIllIII[80]));
                "".length();
                if (llIIlIIIIIII(Bank.contains(item22 -> {
                    return item22.getName().toLowerCase().contains(lllIlIlll[lllIllIII[87]]);
                }) ? 1 : 0)) {
                }
                iArr4 = new int[lllIllIII[0]];
                iArr4[lllIllIII[1]] = lllIllIII[14];
                if (llIIIllllllI(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bx.add(new C0003d(lllIllIII[14], lllIllIII[6], C0009j.ch));
                "".length();
                iArr5 = new int[lllIllIII[0]];
                iArr5[lllIllIII[1]] = lllIllIII[17];
                if (llIIIllllllI(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bx.add(new C0003d(lllIllIII[17], lllIllIII[11], lllIllIII[83]));
                "".length();
                iArr6 = new int[lllIllIII[0]];
                iArr6[lllIllIII[1]] = lllIllIII[13];
                if (llIIIllllllI(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bx.add(new C0003d(lllIllIII[13], lllIllIII[54], lllIllIII[84]));
                "".length();
            }
            bx.add(new C0003d(lllIllIII[7], lllIllIII[8], lllIllIII[18]));
            "".length();
            iArr2 = new int[lllIllIII[0]];
            iArr2[lllIllIII[1]] = lllIllIII[10];
            if (llIIIllllllI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllIllIII[10], lllIllIII[8], lllIllIII[18]));
            "".length();
            iArr3 = new int[lllIllIII[0]];
            iArr3[lllIllIII[1]] = lllIllIII[15];
            if (llIIIllllllI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllIllIII[15], lllIllIII[33], lllIllIII[80]));
            "".length();
            if (llIIlIIIIIII(Bank.contains(item222 -> {
                return item222.getName().toLowerCase().contains(lllIlIlll[lllIllIII[87]]);
            }) ? 1 : 0)) {
            }
            iArr4 = new int[lllIllIII[0]];
            iArr4[lllIllIII[1]] = lllIllIII[14];
            if (llIIIllllllI(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllIllIII[14], lllIllIII[6], C0009j.ch));
            "".length();
            iArr5 = new int[lllIllIII[0]];
            iArr5[lllIllIII[1]] = lllIllIII[17];
            if (llIIIllllllI(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllIllIII[17], lllIllIII[11], lllIllIII[83]));
            "".length();
            iArr6 = new int[lllIllIII[0]];
            iArr6[lllIllIII[1]] = lllIllIII[13];
            if (llIIIllllllI(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bx.add(new C0003d(lllIllIII[13], lllIllIII[54], lllIllIII[84]));
            "".length();
        }
        bx.add(new C0003d(lllIllIII[9], lllIllIII[8], lllIllIII[18]));
        "".length();
        iArr = new int[lllIllIII[0]];
        iArr[lllIllIII[1]] = lllIllIII[7];
        if (llIIIllllllI(Bank.contains(iArr) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllIllIII[7], lllIllIII[8], lllIllIII[18]));
        "".length();
        iArr2 = new int[lllIllIII[0]];
        iArr2[lllIllIII[1]] = lllIllIII[10];
        if (llIIIllllllI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllIllIII[10], lllIllIII[8], lllIllIII[18]));
        "".length();
        iArr3 = new int[lllIllIII[0]];
        iArr3[lllIllIII[1]] = lllIllIII[15];
        if (llIIIllllllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllIllIII[15], lllIllIII[33], lllIllIII[80]));
        "".length();
        if (llIIlIIIIIII(Bank.contains(item2222 -> {
            return item2222.getName().toLowerCase().contains(lllIlIlll[lllIllIII[87]]);
        }) ? 1 : 0)) {
        }
        iArr4 = new int[lllIllIII[0]];
        iArr4[lllIllIII[1]] = lllIllIII[14];
        if (llIIIllllllI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllIllIII[14], lllIllIII[6], C0009j.ch));
        "".length();
        iArr5 = new int[lllIllIII[0]];
        iArr5[lllIllIII[1]] = lllIllIII[17];
        if (llIIIllllllI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllIllIII[17], lllIllIII[11], lllIllIII[83]));
        "".length();
        iArr6 = new int[lllIllIII[0]];
        iArr6[lllIllIII[1]] = lllIllIII[13];
        if (llIIIllllllI(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bx.add(new C0003d(lllIllIII[13], lllIllIII[54], lllIllIII[84]));
        "".length();
    }

    private static boolean llIIlIIIIIlI(Object obj) {
        return obj != null;
    }

    private static boolean llIIlIIIIlIl(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIlIIIIIII(int i) {
        return i == 0;
    }

    private static String llIIIllllIll(String llIllIIllllIl, String llIllIIllllII) {
        try {
            SecretKeySpec llIllIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIllllII.getBytes(StandardCharsets.UTF_8)), lllIllIII[23]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lllIllIII[5], llIllIlIIIIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIllIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIllIIlllllI) {
            llIllIIlllllI.printStackTrace();
            return null;
        }
    }
}
