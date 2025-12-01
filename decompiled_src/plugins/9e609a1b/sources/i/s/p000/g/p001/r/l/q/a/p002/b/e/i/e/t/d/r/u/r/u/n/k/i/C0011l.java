package i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i;

import gg.squire.account.AccBuilderRat;
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
/* renamed from: i.s.-.g.-.r.l.q.a.-.b.e.i.e.t.d.r.u.r.u.n.k.i.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 9e609a1b-c462-421a-8c76-4c9774ea7671.jar:i/s/-/g/-/r/l/q/a/-/b/e/i/e/t/d/r/u/r/u/n/k/i/l.class */
public class C0011l implements M {
    private static /* synthetic */ String[] bW;
    public static final /* synthetic */ WorldPoint cf;
    public static final /* synthetic */ WorldPoint ce;
    public static final /* synthetic */ WorldPoint cd;
    public static final /* synthetic */ WorldPoint ch;
    public static final /* synthetic */ WorldPoint cl;
    static /* synthetic */ boolean cp;
    public static final /* synthetic */ WorldPoint cg;
    public static final /* synthetic */ WorldPoint ci;
    public static final /* synthetic */ WorldPoint ck;
    static /* synthetic */ int cm;
    public static /* synthetic */ boolean by;
    static /* synthetic */ WorldArea cn;
    public static /* synthetic */ List<C0003d> bA;
    public static final /* synthetic */ WorldPoint cj;
    private static /* synthetic */ int[] lIIIlllIIlIlI;
    static /* synthetic */ int co;
    private static /* synthetic */ String[] lIIIlllIIlIIl;

    static {
        lIlIIIllllIlIII();
        lIlIIIllllIIlll();
        cd = new WorldPoint(lIIIlllIIlIlI[91], lIIIlllIIlIlI[92], lIIIlllIIlIlI[1]);
        ce = new WorldPoint(lIIIlllIIlIlI[93], lIIIlllIIlIlI[94], lIIIlllIIlIlI[1]);
        cf = new WorldPoint(lIIIlllIIlIlI[95], lIIIlllIIlIlI[96], lIIIlllIIlIlI[1]);
        cg = new WorldPoint(lIIIlllIIlIlI[97], lIIIlllIIlIlI[98], lIIIlllIIlIlI[1]);
        ch = new WorldPoint(lIIIlllIIlIlI[99], lIIIlllIIlIlI[100], lIIIlllIIlIlI[1]);
        ci = new WorldPoint(lIIIlllIIlIlI[101], lIIIlllIIlIlI[102], lIIIlllIIlIlI[1]);
        cj = new WorldPoint(lIIIlllIIlIlI[103], lIIIlllIIlIlI[104], lIIIlllIIlIlI[1]);
        ck = new WorldPoint(lIIIlllIIlIlI[91], lIIIlllIIlIlI[105], lIIIlllIIlIlI[1]);
        cl = new WorldPoint(lIIIlllIIlIlI[106], lIIIlllIIlIlI[107], lIIIlllIIlIlI[1]);
        bA = new ArrayList();
        cm = lIIIlllIIlIlI[30];
        cn = new WorldArea(lIIIlllIIlIlI[93], lIIIlllIIlIlI[108], lIIIlllIIlIlI[26], lIIIlllIIlIlI[47], lIIIlllIIlIlI[1]);
        String[] strArr = new String[lIIIlllIIlIlI[11]];
        strArr[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[109]];
        strArr[lIIIlllIIlIlI[0]] = lIIIlllIIlIIl[lIIIlllIIlIlI[110]];
        strArr[lIIIlllIIlIlI[5]] = lIIIlllIIlIIl[lIIIlllIIlIlI[111]];
        bW = strArr;
    }

    private static boolean lIlIIIlllllIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lIlIIIllllIllIl(Object obj) {
        return obj != null;
    }

    private static boolean lIlIIIllllIlllI(int i2) {
        return i2 > 0;
    }

    private static String lIlIIIllllIIlIl(String lllllllllllllllIIIIIllIlIIIlIIIl, String lllllllllllllllIIIIIllIlIIIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIIllIlIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIlIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIIllIlIIIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIIllIlIIIlIIll.init(lIIIlllIIlIlI[5], lllllllllllllllIIIIIllIlIIIlIlII);
            return new String(lllllllllllllllIIIIIllIlIIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIlIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIllIlIIIlIIlI) {
            lllllllllllllllIIIIIllIlIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlllllIIII(int i2, int i3) {
        return i2 <= i3;
    }

    private static boolean lIlIIIllllIlIll(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean S() {
        int[] iArr = new int[lIIIlllIIlIlI[12]];
        iArr[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
        iArr[lIIIlllIIlIlI[0]] = lIIIlllIIlIlI[7];
        iArr[lIIIlllIIlIlI[5]] = lIIIlllIIlIlI[10];
        iArr[lIIIlllIIlIlI[11]] = lIIIlllIIlIlI[14];
        iArr[lIIIlllIIlIlI[6]] = lIIIlllIIlIlI[15];
        iArr[lIIIlllIIlIlI[16]] = lIIIlllIIlIlI[17];
        int lllllllllllllllIIIIIllIlIIlIlllI = lIIIlllIIlIlI[1];
        while (lIlIIIllllIlIlI(lllllllllllllllIIIIIllIlIIlIlllI, iArr.length)) {
            int[] iArr2 = new int[lIIIlllIIlIlI[0]];
            iArr2[lIIIlllIIlIlI[1]] = iArr[lllllllllllllllIIIIIllIlIIlIlllI];
            if (lIlIIIllllIlIll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIlllIIlIlI[1];
            }
            lllllllllllllllIIIIIllIlIIlIlllI++;
            "".length();
            if (" ".length() < " ".length()) {
                return ((81 ^ 127) ^ (44 ^ 15)) & (((((12 + 48) - 10) + 104) ^ (((28 + 8) - (-15)) + 100)) ^ (-" ".length()));
            }
        }
        return lIIIlllIIlIlI[0];
    }

    private static boolean lIlIIIllllIllII(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean lIlIIIlllllIIll(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIlIIIllllIlIIl(int i2) {
        return i2 != 0;
    }

    private static void lIlIIIllllIIlll() {
        lIIIlllIIlIIl = new String[lIIIlllIIlIlI[112]];
        lIIIlllIIlIIl[lIIIlllIIlIlI[1]] = lIlIIIllllIIlII("FC06IAs6ITBpGic9PScfci0gLBUhaHQ6DzswNyERPCN0KxkxL3Q9F3I1ISwLJg==", "RDTIx");
        lIIIlllIIlIIl[lIIIlllIIlIlI[0]] = lIlIIIllllIIlIl("tnTXiQd1NPNIdQv36a+zWQ==", "ZDApq");
        lIIIlllIIlIIl[lIIIlllIIlIlI[5]] = lIlIIIllllIIlIl("rGqLEQm6mKdmhsNgkr3P2ZQg/9e30efK", "gVkqB");
        lIIIlllIIlIIl[lIIIlllIIlIlI[11]] = lIlIIIllllIIllI("LO/odJfdkyA5boS1Y3fPpJWm52KkGxy8DDneSvmenZIuVgh8Yh7ilOMZS35G3cnT", "SPxFj");
        lIIIlllIIlIIl[lIIIlllIIlIlI[6]] = lIlIIIllllIIllI("wshX8dOQnMija8t86Rdp8qzFo/i4rI1HUekwt84aNfOvVlAcq+0235+Alc2n/BmZlmcWhcdDG3A=", "edBjV");
        lIIIlllIIlIIl[lIIIlllIIlIlI[16]] = lIlIIIllllIIlII("PScwPAA=", "yUYRk");
        lIIIlllIIlIIl[lIIIlllIIlIlI[12]] = lIlIIIllllIIlII("KwUPKCQ=", "owfFO");
        lIIIlllIIlIIl[lIIIlllIIlIlI[22]] = lIlIIIllllIIlII("CzAXUzAqcRIHJTcl", "EQasD");
        lIIIlllIIlIIl[lIIIlllIIlIlI[23]] = lIlIIIllllIIllI("A7hqLDkzl3XOrgftszJn3Q==", "azjYj");
        lIIIlllIIlIIl[lIIIlllIIlIlI[24]] = lIlIIIllllIIlIl("8D+ktKAlWsB4yfFa6ZJr2Q==", "Ohagf");
        lIIIlllIIlIIl[lIIIlllIIlIlI[18]] = lIlIIIllllIIlIl("cShQIkwUFty0NzviWA+v9g==", "KOBzE");
        lIIIlllIIlIIl[lIIIlllIIlIlI[25]] = lIlIIIllllIIllI("XiEtpdrcYwI=", "YYtUj");
        lIIIlllIIlIIl[lIIIlllIIlIlI[26]] = lIlIIIllllIIlII("Cx0KGg==", "DmotQ");
        lIIIlllIIlIIl[lIIIlllIIlIlI[3]] = lIlIIIllllIIlIl("SToWRqcIGfg=", "tqisq");
        lIIIlllIIlIIl[lIIIlllIIlIlI[27]] = lIlIIIllllIIllI("wYNpoCORwEM=", "TebAh");
        lIIIlllIIlIIl[lIIIlllIIlIlI[28]] = lIlIIIllllIIlIl("Hz8K5MipjBk=", "rYeGq");
        lIIIlllIIlIIl[lIIIlllIIlIlI[29]] = lIlIIIllllIIlII("NxIxCyA=", "tzTxT");
        lIIIlllIIlIIl[lIIIlllIIlIlI[30]] = lIlIIIllllIIlIl("CUOVuwuBP6Y=", "KieIl");
        lIIIlllIIlIIl[lIIIlllIIlIlI[31]] = lIlIIIllllIIlII("NyQWOQ==", "xTsWI");
        lIIIlllIIlIIl[lIIIlllIIlIlI[32]] = lIlIIIllllIIlIl("N+ze1kNvamg=", "ASdxn");
        lIIIlllIIlIIl[lIIIlllIIlIlI[33]] = lIlIIIllllIIlIl("nHz9ZU1o0ZM=", "kBKjs");
        lIIIlllIIlIIl[lIIIlllIIlIlI[34]] = lIlIIIllllIIlII("DRIrJwY=", "NzNTr");
        lIIIlllIIlIIl[lIIIlllIIlIlI[35]] = lIlIIIllllIIlII("MgwiECUJ", "aiCbF");
        lIIIlllIIlIIl[lIIIlllIIlIlI[36]] = lIlIIIllllIIlIl("DWFlU0X4jaE=", "pvbHw");
        lIIIlllIIlIIl[lIIIlllIIlIlI[37]] = lIlIIIllllIIlII("NyAgHSEM", "dEAoB");
        lIIIlllIIlIIl[lIIIlllIIlIlI[21]] = lIlIIIllllIIllI("UrJPBdD8feE=", "JYWrr");
        lIIIlllIIlIIl[lIIIlllIIlIlI[40]] = lIlIIIllllIIllI("21e0wEL9N1I=", "OChAi");
        lIIIlllIIlIIl[lIIIlllIIlIlI[41]] = lIlIIIllllIIlIl("ylBtBReEvZpKqBSr2BWHhw==", "Avywq");
        lIIIlllIIlIIl[lIIIlllIIlIlI[42]] = lIlIIIllllIIllI("cCCQFEDCHV8=", "nljxD");
        lIIIlllIIlIIl[lIIIlllIIlIlI[43]] = lIlIIIllllIIlII("NygKDw==", "xXoaR");
        lIIIlllIIlIIl[lIIIlllIIlIlI[44]] = lIlIIIllllIIlIl("MH8khpz1D7fTux4HjnANPA==", "jHnIU");
        lIIIlllIIlIIl[lIIIlllIIlIlI[45]] = lIlIIIllllIIlII("PSo2EnUyOjYEMQ==", "uOWvU");
        lIIIlllIIlIIl[lIIIlllIIlIlI[46]] = lIlIIIllllIIlII("JioiAw9NIDEKEQ==", "mBCof");
        lIIIlllIIlIIl[lIIIlllIIlIlI[47]] = lIlIIIllllIIllI("GTRooaTgoitq0fzxKZCFew==", "PvaxD");
        lIIIlllIIlIIl[lIIIlllIIlIlI[48]] = lIlIIIllllIIlII("KAYrEAsRCmooCxEDKwQ=", "cnJjj");
        lIIIlllIIlIIl[lIIIlllIIlIlI[49]] = lIlIIIllllIIllI("79ExZT1jI8mflmJHJO6P1g==", "slQRA");
        lIIIlllIIlIIl[lIIIlllIIlIlI[50]] = lIlIIIllllIIllI("FZ6bfix+ptbIw41nMeONmA==", "LNiLj");
        lIIIlllIIlIIl[lIIIlllIIlIlI[51]] = lIlIIIllllIIlII("NC4bZxUVbwoyAAgr", "zOmGa");
        lIIIlllIIlIIl[lIIIlllIIlIlI[52]] = lIlIIIllllIIlII("HB0pI2ETDSk1JQ==", "TxHGA");
        lIIIlllIIlIIl[lIIIlllIIlIlI[53]] = lIlIIIllllIIlII("PBkaSBMdWEwbBh8VFQ==", "rxlhg");
        lIIIlllIIlIIl[lIIIlllIIlIlI[54]] = lIlIIIllllIIllI("sFpiKu5dYE060Nb3wJiXFvmgwuYjIgoA", "bkcPN");
        lIIIlllIIlIIl[lIIIlllIIlIlI[55]] = lIlIIIllllIIlIl("LudP56DXFdWIdUS70iyD2Q==", "NszKg");
        lIIIlllIIlIIl[lIIIlllIIlIlI[56]] = lIlIIIllllIIllI("lVYs0VkoOGwWhI61nCmuKA==", "wRjiY");
        lIIIlllIIlIIl[lIIIlllIIlIlI[57]] = lIlIIIllllIIllI("v/tWvN8fy6w=", "fAvNz");
        lIIIlllIIlIIl[lIIIlllIIlIlI[58]] = lIlIIIllllIIlII("AC8hFwxzHSkIAzoi", "SNLzu");
        lIIIlllIIlIIl[lIIIlllIIlIlI[2]] = lIlIIIllllIIllI("glcnrtJf2ds=", "pZhQW");
        lIIIlllIIlIIl[lIIIlllIIlIlI[59]] = lIlIIIllllIIlIl("XnYgdfuKlo8=", "LtgxT");
        lIIIlllIIlIIl[lIIIlllIIlIlI[60]] = lIlIIIllllIIlIl("S0IWXEoU9a0=", "OugDq");
        lIIIlllIIlIIl[lIIIlllIIlIlI[61]] = lIlIIIllllIIlII("Ei00MAArIXUZAjY3JSMONw==", "YEUJa");
        lIIIlllIIlIIl[lIIIlllIIlIlI[62]] = lIlIIIllllIIlIl("S0xnnwKUWTkgpKxJQphTC8SciG4F1j1q", "hpZOO");
        lIIIlllIIlIIl[lIIIlllIIlIlI[20]] = lIlIIIllllIIllI("YXAQJC4nnIo=", "Whyxm");
        lIIIlllIIlIIl[lIIIlllIIlIlI[63]] = lIlIIIllllIIlIl("Iz178Fg2CeQ=", "AjoYd");
        lIIIlllIIlIIl[lIIIlllIIlIlI[64]] = lIlIIIllllIIlIl("rnLxRq9FgaU=", "YMrMI");
        lIIIlllIIlIIl[lIIIlllIIlIlI[65]] = lIlIIIllllIIllI("a3vWb/1rmMI=", "GeApI");
        lIIIlllIIlIIl[lIIIlllIIlIlI[66]] = lIlIIIllllIIlIl("B/puMPsCBgEBmHMig22F1w==", "cFqCL");
        lIIIlllIIlIIl[lIIIlllIIlIlI[67]] = lIlIIIllllIIlII("KycyJD8=", "iUWET");
        lIIIlllIIlIIl[lIIIlllIIlIlI[71]] = lIlIIIllllIIlIl("Qz89vEBajMP8ujophPKEjw==", "NPzwB");
        lIIIlllIIlIIl[lIIIlllIIlIlI[72]] = lIlIIIllllIIllI("FlHlSMz/RTiShCuqO7S5bw==", "RyyWm");
        lIIIlllIIlIIl[lIIIlllIIlIlI[76]] = lIlIIIllllIIlIl("UrW8EtDalT4TsfgLnsWoVg==", "JwsUU");
        lIIIlllIIlIIl[lIIIlllIIlIlI[79]] = lIlIIIllllIIlII("IRMlDms+FzMBIgE=", "mrAwK");
        lIIIlllIIlIIl[lIIIlllIIlIlI[86]] = lIlIIIllllIIllI("SMBFAPY0NFSbKxVnr/pxaA==", "aMXTE");
        lIIIlllIIlIIl[lIIIlllIIlIlI[87]] = lIlIIIllllIIlII("KCUiCEM1KmwYBjsgOAdDcg==", "ZLLoc");
        lIIIlllIIlIIl[lIIIlllIIlIlI[88]] = lIlIIIllllIIlII("Chw3OhsADg==", "niRVr");
        lIIIlllIIlIIl[lIIIlllIIlIlI[89]] = lIlIIIllllIIlII("JjALKh0sIg==", "BEnFt");
        lIIIlllIIlIIl[lIIIlllIIlIlI[90]] = lIlIIIllllIIlII("Owg7NSUFWhUnPg4=", "kzRFJ");
        lIIIlllIIlIIl[lIIIlllIIlIlI[109]] = lIlIIIllllIIlII("EhUASCFxHAsEGHENAR1X", "Qtnhh");
        lIIIlllIIlIIl[lIIIlllIIlIlI[110]] = lIlIIIllllIIllI("LbBVB4LI01lX2x1qUFze3Jt9p3HlmoV4SfzEGqa4wGc=", "KTspk");
        lIIIlllIIlIIl[lIIIlllIIlIlI[111]] = lIlIIIllllIIlII("LRwfQQ==", "tyloN");
    }

    /* JADX WARN: Code restructure failed: missing block: B:249:0x0ed3, code lost:
        if (lIlIIIllllIllll(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(r0), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.lIIIlllIIlIlI[70]) != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01b6, code lost:
        if (lIlIIIllllIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.lIIIlllIIlIlI[8]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f9, code lost:
        if (lIlIIIllllIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.lIIIlllIIlIlI[8]) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x023c, code lost:
        if (lIlIIIllllIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.lIIIlllIIlIlI[8]) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x023f, code lost:
        W();
        java.lang.System.out.println(i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.lIIIlllIIlIIl[i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.lIIIlllIIlIlI[11]]);
        i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.by = i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.lIIIlllIIlIlI[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x025a, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0fcb  */
    /* JADX WARN: Type inference failed for: r0v150, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v155, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v578, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v593, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v624, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ar() {
        if (lIlIIIllllIlIIl(by ? 1 : 0)) {
            C0001b.a(bA);
            if (lIlIIIllllIlIlI(bA.size(), lIIIlllIIlIlI[0])) {
                System.out.println(lIIIlllIIlIIl[lIIIlllIIlIlI[1]]);
                by = lIIIlllIIlIlI[1];
            }
        }
        if (lIlIIIllllIlIll(by ? 1 : 0)) {
            if (lIlIIIllllIlIlI(Skills.getLevel(Skill.PRAYER), lIIIlllIIlIlI[2])) {
                O.cL();
            }
            if (lIlIIIllllIllII(Skills.getLevel(Skill.PRAYER), lIIIlllIIlIlI[2]) && lIlIIIllllIlIlI(Skills.getLevel(Skill.MAGIC), lIIIlllIIlIlI[3])) {
                C0008i.P();
            }
            if (lIlIIIllllIlIll(S() ? 1 : 0) && lIlIIIllllIlIlI(C0004e.j(cm), lIIIlllIIlIlI[0]) && lIlIIIllllIllII(Skills.getLevel(Skill.PRAYER), lIIIlllIIlIlI[2]) && lIlIIIllllIllII(Skills.getLevel(Skill.MAGIC), lIIIlllIIlIlI[3])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIlIIIllllIllIl(nearest) && lIlIIIllllIlIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[0]];
                    C0000a.a(nearest);
                }
                if (lIlIIIllllIllIl(nearest) && lIlIIIllllIlIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIIllllIlIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlllIIlIlI[4]);
                        "".length();
                    }
                    if (lIlIIIllllIlIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[5]];
                        if (lIlIIIllllIlllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlllIIlIlI[6]);
                            "".length();
                        }
                        if (lIlIIIllllIlllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlllIIlIlI[5]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIlllIIlIlI[0]];
                        iArr[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                        if (lIlIIIllllIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIIIlllIIlIlI[0]];
                            iArr2[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                        }
                        int[] iArr3 = new int[lIIIlllIIlIlI[0]];
                        iArr3[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                        if (lIlIIIllllIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                            int[] iArr4 = new int[lIIIlllIIlIlI[0]];
                            iArr4[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
                        }
                        int[] iArr5 = new int[lIIIlllIIlIlI[0]];
                        iArr5[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                        if (lIlIIIllllIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIIlllIIlIlI[0]];
                            iArr6[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                        }
                        int[] iArr7 = new int[lIIIlllIIlIlI[12]];
                        iArr7[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                        iArr7[lIIIlllIIlIlI[0]] = lIIIlllIIlIlI[7];
                        iArr7[lIIIlllIIlIlI[5]] = lIIIlllIIlIlI[10];
                        iArr7[lIIIlllIIlIlI[11]] = lIIIlllIIlIlI[14];
                        iArr7[lIIIlllIIlIlI[6]] = lIIIlllIIlIlI[15];
                        iArr7[lIIIlllIIlIlI[16]] = lIIIlllIIlIlI[17];
                        if (lIlIIIllllIlIll(C0004e.b(iArr7) ? 1 : 0)) {
                            W();
                            System.out.println(lIIIlllIIlIIl[lIIIlllIIlIlI[6]]);
                            by = lIIIlllIIlIlI[0];
                            return;
                        }
                        int[] iArr8 = new int[lIIIlllIIlIlI[12]];
                        iArr8[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                        iArr8[lIIIlllIIlIlI[0]] = lIIIlllIIlIlI[7];
                        iArr8[lIIIlllIIlIlI[5]] = lIIIlllIIlIlI[10];
                        iArr8[lIIIlllIIlIlI[11]] = lIIIlllIIlIlI[14];
                        iArr8[lIIIlllIIlIlI[6]] = lIIIlllIIlIlI[15];
                        iArr8[lIIIlllIIlIlI[16]] = lIIIlllIIlIlI[17];
                        if (lIlIIIllllIlIIl(C0004e.b(iArr8) ? 1 : 0)) {
                            while (lIlIIIllllIlIll(C0012m.av() ? 1 : 0)) {
                                C0012m.at();
                                Time.sleepTicks(lIIIlllIIlIlI[0]);
                                "".length();
                                "".length();
                                if (" ".length() <= ((103 ^ 106) & ((70 ^ 75) ^ (-1)))) {
                                    return;
                                }
                            }
                            if (lIlIIIllllIlIll(Bank.isOpen() ? 1 : 0)) {
                                C0000a.a();
                                Time.sleepTicks(lIIIlllIIlIlI[12]);
                                "".length();
                            }
                            C0000a.a(lIIIlllIIlIlI[13], lIIIlllIIlIlI[18]);
                            C0000a.a(lIIIlllIIlIlI[14], lIIIlllIIlIlI[11]);
                            C0000a.a(lIIIlllIIlIlI[7], lIIIlllIIlIlI[8]);
                            C0000a.a(lIIIlllIIlIlI[10], lIIIlllIIlIlI[8]);
                            C0000a.a(lIIIlllIIlIlI[17], lIIIlllIIlIlI[11]);
                            C0000a.a(lIIIlllIIlIlI[15], lIIIlllIIlIlI[18]);
                            C0000a.a(lIIIlllIIlIlI[19], lIIIlllIIlIlI[4]);
                        }
                    }
                }
            }
            if (lIlIIIllllIlIIl(Inventory.contains(C0005f.ba) ? 1 : 0) && lIlIIIllllIlIlI(Movement.getRunEnergy(), lIIIlllIIlIlI[20])) {
                Inventory.getFirst(C0005f.ba).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[16]]);
                Time.sleepTicks(lIIIlllIIlIlI[0]);
                "".length();
            }
            if (lIlIIIllllIlIlI(Prayers.getPoints(), lIIIlllIIlIlI[21]) && lIlIIIllllIlIIl(Inventory.contains(C0005f.aX) ? 1 : 0)) {
                Inventory.getFirst(C0005f.aX).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[12]]);
            }
            if (lIlIIIllllIlIIl(S() ? 1 : 0) && lIlIIIllllIlIll(C0004e.j(cm))) {
                if (lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[22]];
                    if (lIlIIIllllIlIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(cd);
                    "".length();
                    Time.sleepTicks(lIIIlllIIlIlI[0]);
                    "".length();
                }
                if (lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                    C0006g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[23]], bW);
                }
            }
            if (lIlIIIlllllIIIl(C0004e.j(cm), lIIIlllIIlIlI[0])) {
                if (lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ce), lIIIlllIIlIlI[6]) && lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cf), lIIIlllIIlIlI[6])) {
                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[24]];
                    Movement.walkTo(ce);
                    "".length();
                    Time.sleepTicks(lIIIlllIIlIlI[0]);
                    "".length();
                }
                if (lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ce), lIIIlllIIlIlI[12])) {
                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[18]];
                    String[] strArr = new String[lIIIlllIIlIlI[0]];
                    strArr[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[25]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    String[] strArr2 = new String[lIIIlllIIlIlI[0]];
                    strArr2[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[26]];
                    if (lIlIIIllllIlIIl(nearest2.hasAction(strArr2) ? 1 : 0)) {
                        String[] strArr3 = new String[lIIIlllIIlIlI[0]];
                        strArr3[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[3]];
                        if (lIlIIIllllIlIll(Reachable.isInteractable(TileObjects.getNearest(strArr3)) ? 1 : 0)) {
                            String[] strArr4 = new String[lIIIlllIIlIlI[0]];
                            strArr4[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[27]];
                            TileObjects.getNearest(strArr4).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[28]]);
                            Time.sleepTicks(lIIIlllIIlIlI[6]);
                            "".length();
                        }
                    }
                    String[] strArr5 = new String[lIIIlllIIlIlI[0]];
                    strArr5[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[29]];
                    if (lIlIIIllllIlIIl(Reachable.isInteractable(TileObjects.getNearest(strArr5)) ? 1 : 0)) {
                        String[] strArr6 = new String[lIIIlllIIlIlI[0]];
                        strArr6[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[30]];
                        TileObject nearest3 = TileObjects.getNearest(strArr6);
                        String[] strArr7 = new String[lIIIlllIIlIlI[0]];
                        strArr7[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[31]];
                        if (lIlIIIllllIlIIl(nearest3.hasAction(strArr7) ? 1 : 0)) {
                            String[] strArr8 = new String[lIIIlllIIlIlI[0]];
                            strArr8[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[32]];
                            TileObjects.getNearest(strArr8).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[33]]);
                            Time.sleepTicks(lIIIlllIIlIlI[5]);
                            "".length();
                        }
                        String[] strArr9 = new String[lIIIlllIIlIlI[0]];
                        strArr9[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[34]];
                        TileObject nearest4 = TileObjects.getNearest(strArr9);
                        String[] strArr10 = new String[lIIIlllIIlIlI[0]];
                        strArr10[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[35]];
                        if (lIlIIIllllIlIIl(nearest4.hasAction(strArr10) ? 1 : 0)) {
                            String[] strArr11 = new String[lIIIlllIIlIlI[0]];
                            strArr11[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[36]];
                            TileObjects.getNearest(strArr11).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[37]]);
                            Time.sleepTicks(lIIIlllIIlIlI[5]);
                            "".length();
                        }
                    }
                }
            }
            if (lIlIIIlllllIIIl(C0004e.j(cm), lIIIlllIIlIlI[5])) {
                int[] iArr9 = new int[lIIIlllIIlIlI[0]];
                iArr9[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[38];
                if (lIlIIIllllIlIIl(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIIlllIIlIlI[0]];
                    iArr10[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[38];
                    Inventory.getFirst(iArr10).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[21]]);
                }
                int[] iArr11 = new int[lIIIlllIIlIlI[0]];
                iArr11[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[39];
                if (lIlIIIllllIlIIl(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lIIIlllIIlIlI[0]];
                    iArr12[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[39];
                    Inventory.getFirst(iArr12).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[40]]);
                }
                if (lIlIIIllllIlIll(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cg), lIIIlllIIlIlI[6])) {
                        AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[41]];
                        Movement.walkTo(cg);
                        "".length();
                        Time.sleepTicks(lIIIlllIIlIlI[0]);
                        "".length();
                    }
                    if (lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cg), lIIIlllIIlIlI[6]) && lIlIIIllllIlIll(Players.getLocal().isMoving() ? 1 : 0) && lIlIIIllllIlIll(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr12 = new String[lIIIlllIIlIlI[0]];
                        strArr12[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[42]];
                        TileObjects.getNearest(strArr12).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[43]]);
                        Time.sleepTicks(lIIIlllIIlIlI[5]);
                        "".length();
                    }
                }
                if (lIlIIIllllIlIIl(cn.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[6])) {
                        AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[44]];
                        Movement.walkTo(ch);
                        "".length();
                        Time.sleepTicks(lIIIlllIIlIlI[0]);
                        "".length();
                    }
                    if (lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[6]) && lIlIIIllllIlIll(Players.getLocal().isMoving() ? 1 : 0)) {
                        C0006g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[45]], bW);
                    }
                }
            }
            if (lIlIIIlllllIIIl(C0004e.j(cm), lIIIlllIIlIlI[11])) {
                String[] strArr13 = new String[lIIIlllIIlIlI[0]];
                strArr13[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[46]];
                if (lIlIIIllllIlIll(Inventory.contains(strArr13) ? 1 : 0)) {
                    if (lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ck), lIIIlllIIlIlI[16])) {
                        AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[47]];
                        Movement.walkTo(ck);
                        "".length();
                        Time.sleepTicks(lIIIlllIIlIlI[0]);
                        "".length();
                    }
                    if (lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ck), lIIIlllIIlIlI[16])) {
                        C0006g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[48]], bW);
                    }
                }
                String[] strArr14 = new String[lIIIlllIIlIlI[0]];
                strArr14[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[49]];
                if (lIlIIIllllIlIIl(Inventory.contains(strArr14) ? 1 : 0)) {
                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[50]];
                    if (lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[16])) {
                        AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[51]];
                        Movement.walkTo(ch);
                        "".length();
                        Time.sleepTicks(lIIIlllIIlIlI[0]);
                        "".length();
                    }
                    if (lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[16])) {
                        C0006g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[52]], bW);
                    }
                }
            }
            if (lIlIIIlllllIIIl(C0004e.j(cm), lIIIlllIIlIlI[16])) {
                if (lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cl), lIIIlllIIlIlI[11])) {
                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[53]];
                    Movement.walkTo(cl);
                    "".length();
                    Time.sleepTicks(lIIIlllIIlIlI[0]);
                    "".length();
                }
                if (lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cl), lIIIlllIIlIlI[11]) && lIlIIIllllIlIll(Players.getLocal().isMoving() ? 1 : 0) && lIlIIIllllIlIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr15 = new String[lIIIlllIIlIlI[0]];
                    strArr15[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[54]];
                    Inventory.getFirst(strArr15).useOn(TileObjects.getNearest(tileObject -> {
                        if (lIlIIIllllIlIIl(tileObject.getName().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[90]]) ? 1 : 0) && lIlIIIlllllIIII(tileObject.getWorldLocation().distanceTo(cl), lIIIlllIIlIlI[11])) {
                            ?? r0 = lIIIlllIIlIlI[0];
                            "".length();
                            return (((237 ^ 182) ^ (96 ^ 12)) & (((((103 + 5) - 27) + 67) ^ (((91 + 150) - 201) + 123)) ^ (-" ".length()))) < (-" ".length()) ? ((204 ^ 175) ^ (99 ^ 47)) & (((66 ^ 22) ^ (102 ^ 29)) ^ (-" ".length())) : r0;
                        }
                        return lIIIlllIIlIlI[1];
                    }));
                    Time.sleepTicks(lIIIlllIIlIlI[5]);
                    "".length();
                }
            }
            if (lIlIIIlllllIIIl(C0004e.j(cm), lIIIlllIIlIlI[12])) {
                if (lIlIIIllllIlIll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (lIlIIIllllIlIll(C0008i.U() ? 1 : 0)) {
                    C0008i.V();
                }
                if (lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                    String[] strArr16 = new String[lIIIlllIIlIlI[0]];
                    strArr16[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[55]];
                    if (lIlIIIllllIllIl(NPCs.getNearest(strArr16))) {
                        String[] strArr17 = new String[lIIIlllIIlIlI[0]];
                        strArr17[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[56]];
                        NPCs.getNearest(strArr17).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[57]]);
                        Time.sleepTicks(lIIIlllIIlIlI[5]);
                        "".length();
                    }
                }
            }
            if (lIlIIIlllllIIIl(C0004e.j(cm), lIIIlllIIlIlI[23]) && lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                C0006g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[58]], bW);
            }
            if (lIlIIIlllllIIIl(C0004e.j(cm), lIIIlllIIlIlI[24])) {
                if (lIlIIIllllIlIll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (lIlIIIllllIlIll(C0008i.U() ? 1 : 0)) {
                    C0008i.V();
                }
                String[] strArr18 = new String[lIIIlllIIlIlI[0]];
                strArr18[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[2]];
                if (lIlIIIllllIllIl(NPCs.getNearest(strArr18))) {
                    String[] strArr19 = new String[lIIIlllIIlIlI[0]];
                    strArr19[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[59]];
                    if (lIlIIIlllllIIII(NPCs.getNearest(strArr19).getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIlllIIlIlI[16])) {
                        C0006g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[60]], bW);
                    }
                }
                if (lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                    String[] strArr20 = new String[lIIIlllIIlIlI[0]];
                    strArr20[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[61]];
                    if (lIlIIIllllIllIl(NPCs.getNearest(strArr20))) {
                        String[] strArr21 = new String[lIIIlllIIlIlI[0]];
                        strArr21[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[62]];
                        NPCs.getNearest(strArr21).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[20]]);
                        Time.sleepTicks(lIIIlllIIlIlI[5]);
                        "".length();
                    }
                }
            }
            if (lIlIIIlllllIIIl(C0004e.j(cm), lIIIlllIIlIlI[18])) {
                if (lIlIIIllllIlIll(Prayers.isEnabled(Prayer.PROTECT_FROM_MELEE) ? 1 : 0)) {
                    Prayers.toggle(Prayer.PROTECT_FROM_MELEE);
                }
                if (lIlIIIllllIlIll(C0008i.U() ? 1 : 0)) {
                    C0008i.V();
                }
                if (lIlIIIlllllIIlI(Players.getLocal().getInteracting())) {
                    String[] strArr22 = new String[lIIIlllIIlIlI[0]];
                    strArr22[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[63]];
                    if (lIlIIIllllIllIl(NPCs.getNearest(strArr22))) {
                        String[] strArr23 = new String[lIIIlllIIlIlI[0]];
                        strArr23[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[64]];
                        NPCs.getNearest(strArr23).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[65]]);
                        Time.sleepTicks(lIIIlllIIlIlI[5]);
                        "".length();
                    }
                }
            }
            if (!lIlIIIlllllIIll(C0004e.j(cm), lIIIlllIIlIlI[25]) || lIlIIIlllllIIIl(C0004e.j(cm), lIIIlllIIlIlI[26])) {
                String[] strArr24 = new String[lIIIlllIIlIlI[0]];
                strArr24[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[66]];
                if (lIlIIIllllIllIl(NPCs.getNearest(strArr24))) {
                    int[] iArr13 = new int[lIIIlllIIlIlI[0]];
                    iArr13[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                    Inventory.getFirst(iArr13).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[67]]);
                    Time.sleepTicks(lIIIlllIIlIlI[16]);
                    "".length();
                }
                WorldPoint worldPoint = new WorldPoint(lIIIlllIIlIlI[68], lIIIlllIIlIlI[69], lIIIlllIIlIlI[1]);
                if (lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(C0001b.I), lIIIlllIIlIlI[70]) && lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIlllIIlIlI[6])) {
                    AccBuilderRat.c = lIIIlllIIlIIl[lIIIlllIIlIlI[71]];
                    Movement.walkTo(worldPoint);
                    "".length();
                    Time.sleepTicks(lIIIlllIIlIlI[0]);
                    "".length();
                }
                if (!lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIlllIIlIlI[6]) || lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(ch), lIIIlllIIlIlI[54])) {
                    if (lIlIIIllllIllll(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                        String[] strArr25 = new String[lIIIlllIIlIlI[0]];
                        strArr25[lIIIlllIIlIlI[1]] = lIIIlllIIlIIl[lIIIlllIIlIlI[72]];
                        if (lIlIIIlllllIIlI(NPCs.getNearest(strArr25))) {
                        }
                    }
                    if (lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                        C0006g.a(lIIIlllIIlIIl[lIIIlllIIlIlI[79]], bW);
                    }
                }
                WorldArea worldArea = new WorldArea(lIIIlllIIlIlI[73], lIIIlllIIlIlI[74], lIIIlllIIlIlI[43], lIIIlllIIlIlI[37], lIIIlllIIlIlI[1]);
                if (lIlIIIllllIlIlI(C0004e.j(lIIIlllIIlIlI[75]), lIIIlllIIlIlI[24]) && lIlIIIllllIlIIl(Equipment.contains(item -> {
                    return item.getName().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[89]]);
                }) ? 1 : 0)) {
                    Equipment.getFirst(item2 -> {
                        return item2.getName().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[88]]);
                    }).interact(lIIIlllIIlIIl[lIIIlllIIlIlI[76]]);
                    Time.sleepTicks(lIIIlllIIlIlI[12]);
                    "".length();
                }
                if (lIlIIIllllIlIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(new WorldPoint(lIIIlllIIlIlI[77], lIIIlllIIlIlI[78], lIIIlllIIlIlI[1]));
                    "".length();
                    Time.sleepTicks(lIIIlllIIlIlI[0]);
                    "".length();
                }
                if (lIlIIIllllIlIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    Movement.walkTo(cd);
                    "".length();
                    Time.sleepTicks(lIIIlllIIlIlI[0]);
                    "".length();
                }
                if (lIlIIIlllllIIII(Players.getLocal().getWorldLocation().distanceTo(cd), lIIIlllIIlIlI[16])) {
                }
            }
            if (lIlIIIllllIlllI(C0004e.j(cm)) && lIlIIIllllIlIlI(C0004e.j(cm), lIIIlllIIlIlI[27])) {
                cp = lIIIlllIIlIlI[0];
                co = lIIIlllIIlIlI[1];
            }
            if (lIlIIIlllllIIIl(C0004e.j(cm), lIIIlllIIlIlI[27]) && lIlIIIllllIlIlI(co, lIIIlllIIlIlI[0]) && lIlIIIllllIlIIl(cp ? 1 : 0)) {
                P.iI += lIIIlllIIlIlI[0];
                P.d(AccBuilderRat.m);
                co += lIIIlllIIlIlI[0];
                P.iI = lIIIlllIIlIlI[1];
                cp = lIIIlllIIlIlI[1];
            }
            C0006g.a(bW);
        }
    }

    private static void lIlIIIllllIlIII() {
        lIIIlllIIlIlI = new int[113];
        lIIIlllIIlIlI[0] = " ".length();
        lIIIlllIIlIlI[1] = ((78 ^ 41) ^ (72 ^ 24)) & (((((89 + 74) - 139) + 112) ^ (((97 + 82) - 56) + 68)) ^ (-" ".length()));
        lIIIlllIIlIlI[2] = 181 ^ 152;
        lIIIlllIIlIlI[3] = 60 ^ 49;
        lIIIlllIIlIlI[4] = (-19461) & 24460;
        lIIIlllIIlIlI[5] = "  ".length();
        lIIIlllIIlIlI[6] = 53 ^ 49;
        lIIIlllIIlIlI[7] = (-20945) & 21502;
        lIIIlllIIlIlI[8] = (-((-5521) & 32151)) & (-4097) & 31726;
        lIIIlllIIlIlI[9] = (-8513) & 9069;
        lIIIlllIIlIlI[10] = (-7573) & 8126;
        lIIIlllIIlIlI[11] = "   ".length();
        lIIIlllIIlIlI[12] = 115 ^ 117;
        lIIIlllIIlIlI[13] = (-((-17447) & 25767)) & (-16417) & 32743;
        lIIIlllIIlIlI[14] = (-2091) & 14715;
        lIIIlllIIlIlI[15] = (-24137) & 24521;
        lIIIlllIIlIlI[16] = (19 ^ 58) ^ (172 ^ 128);
        lIIIlllIIlIlI[17] = (-16470) & 18903;
        lIIIlllIIlIlI[18] = 164 ^ 174;
        lIIIlllIIlIlI[19] = (-((-8193) & 10269)) & (-29697) & 32767;
        lIIIlllIIlIlI[20] = 12 ^ 62;
        lIIIlllIIlIlI[21] = 77 ^ 84;
        lIIIlllIIlIlI[22] = (53 ^ 59) ^ (142 ^ 135);
        lIIIlllIIlIlI[23] = 165 ^ 173;
        lIIIlllIIlIlI[24] = (((115 + 201) - 221) + 108) ^ (((170 + 63) - 86) + 47);
        lIIIlllIIlIlI[25] = 51 ^ 56;
        lIIIlllIIlIlI[26] = (34 ^ 123) ^ (237 ^ 184);
        lIIIlllIIlIlI[27] = (43 ^ 104) ^ (6 ^ 75);
        lIIIlllIIlIlI[28] = 105 ^ 102;
        lIIIlllIIlIlI[29] = 157 ^ 141;
        lIIIlllIIlIlI[30] = 163 ^ 178;
        lIIIlllIIlIlI[31] = (((157 + 94) - 188) + 100) ^ (((83 + 116) - 48) + 26);
        lIIIlllIIlIlI[32] = (((92 + 127) - 119) + 31) ^ (((97 + 89) - 78) + 36);
        lIIIlllIIlIlI[33] = 143 ^ 155;
        lIIIlllIIlIlI[34] = (((131 + 145) - 230) + 131) ^ (((145 + 31) - 112) + 100);
        lIIIlllIIlIlI[35] = (((122 + 170) - 183) + 100) ^ (((138 + 1) - 33) + 93);
        lIIIlllIIlIlI[36] = 7 ^ 16;
        lIIIlllIIlIlI[37] = 126 ^ 102;
        lIIIlllIIlIlI[38] = 5 ^ 78;
        lIIIlllIIlIlI[39] = (((122 + 191) - 234) + 120) ^ (((26 + 92) - (-6)) + 17);
        lIIIlllIIlIlI[40] = (255 ^ 169) ^ (250 ^ 182);
        lIIIlllIIlIlI[41] = (29 ^ 115) ^ (97 ^ 20);
        lIIIlllIIlIlI[42] = 129 ^ 157;
        lIIIlllIIlIlI[43] = 57 ^ 36;
        lIIIlllIIlIlI[44] = (((136 + 83) - 111) + 34) ^ (((69 + 14) - 47) + 108);
        lIIIlllIIlIlI[45] = 121 ^ 102;
        lIIIlllIIlIlI[46] = 66 ^ 98;
        lIIIlllIIlIlI[47] = (0 ^ 82) ^ (122 ^ 9);
        lIIIlllIIlIlI[48] = (97 ^ 117) ^ (37 ^ 19);
        lIIIlllIIlIlI[49] = (49 ^ 75) ^ (44 ^ 117);
        lIIIlllIIlIlI[50] = (((42 + 24) - (-15)) + 102) ^ (((85 + 23) - (-10)) + 29);
        lIIIlllIIlIlI[51] = (113 ^ 71) ^ (159 ^ 140);
        lIIIlllIIlIlI[52] = 91 ^ 125;
        lIIIlllIIlIlI[53] = (((42 + 137) - 39) + 50) ^ (((133 + 6) - 75) + 89);
        lIIIlllIIlIlI[54] = (((90 + 26) - (-6)) + 8) ^ (((106 + 81) - 76) + 59);
        lIIIlllIIlIlI[55] = 166 ^ 143;
        lIIIlllIIlIlI[56] = (((139 + 124) - 222) + 130) ^ (((65 + 4) - (-43)) + 17);
        lIIIlllIIlIlI[57] = 69 ^ 110;
        lIIIlllIIlIlI[58] = 147 ^ 191;
        lIIIlllIIlIlI[59] = 91 ^ 117;
        lIIIlllIIlIlI[60] = (157 ^ 155) ^ (91 ^ 114);
        lIIIlllIIlIlI[61] = (160 ^ 180) ^ (26 ^ 62);
        lIIIlllIIlIlI[62] = (227 ^ 162) ^ (61 ^ 77);
        lIIIlllIIlIlI[63] = (89 ^ 56) ^ (209 ^ 131);
        lIIIlllIIlIlI[64] = (((27 + 5) - 15) + 122) ^ (((117 + 7) - 117) + 184);
        lIIIlllIIlIlI[65] = 64 ^ 117;
        lIIIlllIIlIlI[66] = (139 ^ 163) ^ (83 ^ 77);
        lIIIlllIIlIlI[67] = (112 ^ 44) ^ (193 ^ 170);
        lIIIlllIIlIlI[68] = (-4365) & 7548;
        lIIIlllIIlIlI[69] = (-8717) & 12223;
        lIIIlllIIlIlI[70] = (((186 ^ 165) + (246 ^ 157)) - (28 ^ 7)) + (87 ^ 112);
        lIIIlllIIlIlI[71] = 145 ^ 169;
        lIIIlllIIlIlI[72] = (104 ^ 75) ^ (161 ^ 187);
        lIIIlllIIlIlI[73] = (-4609) & 7040;
        lIIIlllIIlIlI[74] = (-12545) & 15623;
        lIIIlllIIlIlI[75] = (((159 + 134) - 291) + 166) ^ (((134 + 151) - 122) + 36);
        lIIIlllIIlIlI[76] = (84 ^ 25) ^ (251 ^ 140);
        lIIIlllIIlIlI[77] = (-26181) & 28645;
        lIIIlllIIlIlI[78] = (-16943) & 20015;
        lIIIlllIIlIlI[79] = (167 ^ 152) ^ (75 ^ 79);
        lIIIlllIIlIlI[80] = (-10888) & 12287;
        lIIIlllIIlIlI[81] = (-20484) & 32463;
        lIIIlllIIlIlI[82] = (-((-18529) & 20087)) & (-6210) & 32767;
        lIIIlllIIlIlI[83] = (-((-9353) & 11439)) & (-1282) & 16367;
        lIIIlllIIlIlI[84] = (-4170) & 5069;
        lIIIlllIIlIlI[85] = (56 ^ 79) ^ (37 ^ 54);
        lIIIlllIIlIlI[86] = (115 ^ 9) ^ (75 ^ 13);
        lIIIlllIIlIlI[87] = (((1 + 82) - (-4)) + 94) ^ (((54 + 79) - 103) + 106);
        lIIIlllIIlIlI[88] = 81 ^ 111;
        lIIIlllIIlIlI[89] = 138 ^ 181;
        lIIIlllIIlIlI[90] = 50 ^ 114;
        lIIIlllIIlIlI[91] = (-((-19079) & 24311)) & (-24585) & 32383;
        lIIIlllIIlIlI[92] = (-129) & 3326;
        lIIIlllIIlIlI[93] = (-13574) & 16181;
        lIIIlllIIlIlI[94] = (-16641) & 19829;
        lIIIlllIIlIlI[95] = (-259) & 2871;
        lIIIlllIIlIlI[96] = (-4993) & 8182;
        lIIIlllIIlIlI[97] = (-((-2165) & 32119)) & (-70) & 32639;
        lIIIlllIIlIlI[98] = (-12825) & 15997;
        lIIIlllIIlIlI[99] = (-((-10769) & 27225)) & (-12673) & 31743;
        lIIIlllIIlIlI[100] = (-((-1125) & 25982)) & (-1) & 27999;
        lIIIlllIIlIlI[101] = (-((-899) & 29671)) & (-258) & 31615;
        lIIIlllIIlIlI[102] = (-((-8293) & 13167)) & (-24626) & 32639;
        lIIIlllIIlIlI[103] = (-((-11010) & 32675)) & (-8265) & 32507;
        lIIIlllIIlIlI[104] = (-8232) & 11375;
        lIIIlllIIlIlI[105] = (-((-21769) & 30009)) & (-4865) & 16247;
        lIIIlllIIlIlI[106] = (-16833) & 19450;
        lIIIlllIIlIlI[107] = (-24577) & 27743;
        lIIIlllIIlIlI[108] = (-28973) & 32111;
        lIIIlllIIlIlI[109] = (120 ^ 114) ^ (17 ^ 90);
        lIIIlllIIlIlI[110] = 72 ^ 10;
        lIIIlllIIlIlI[111] = 7 ^ 68;
        lIIIlllIIlIlI[112] = (117 ^ 27) ^ (101 ^ 79);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean aa() {
        if (!lIlIIIlllllIlII(Quests.getState(Quest.FIGHT_ARENA), QuestState.FINISHED) || lIlIIIllllIllII(C0004e.j(cm), lIIIlllIIlIlI[27])) {
            ?? r0 = lIIIlllIIlIlI[0];
            "".length();
            return (-"  ".length()) >= 0 ? ((((102 + 160) - 142) + 66) ^ (((2 + 54) - 22) + 113)) & (((53 ^ 93) ^ (133 ^ 196)) ^ (-" ".length())) : r0;
        }
        return lIIIlllIIlIlI[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public boolean X() {
        return lIIIlllIIlIlI[1];
    }

    private static boolean lIlIIIllllIllll(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIlIIIlllllIIIl(int i2, int i3) {
        return i2 == i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e6, code lost:
        if (lIlIIIllllIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.lIIIlllIIlIlI[8]) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x016f, code lost:
        if (lIlIIIllllIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.lIIIlllIIlIlI[8]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01f8, code lost:
        if (lIlIIIllllIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.lIIIlllIIlIlI[28]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02ba, code lost:
        if (lIlIIIllllIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.lIIIlllIIlIlI[6]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x033f, code lost:
        if (lIlIIIllllIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.lIIIlllIIlIlI[5]) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005d, code lost:
        if (lIlIIIllllIlIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.C0011l.lIIIlllIIlIlI[8]) != false) goto L56;
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
    private static void W() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7 = new int[lIIIlllIIlIlI[0]];
        iArr7[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
        if (lIlIIIllllIlIIl(Bank.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lIIIlllIIlIlI[0]];
            iArr8[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
            if (lIlIIIllllIlIIl(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIlllIIlIlI[0]];
                iArr9[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[9];
            }
            iArr = new int[lIIIlllIIlIlI[0]];
            iArr[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
            if (lIlIIIllllIlIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr10 = new int[lIIIlllIIlIlI[0]];
                iArr10[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                if (lIlIIIllllIlIIl(Bank.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lIIIlllIIlIlI[0]];
                    iArr11[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
                }
                iArr2 = new int[lIIIlllIIlIlI[0]];
                iArr2[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                if (lIlIIIllllIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
                    int[] iArr12 = new int[lIIIlllIIlIlI[0]];
                    iArr12[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                    if (lIlIIIllllIlIIl(Bank.contains(iArr12) ? 1 : 0)) {
                        int[] iArr13 = new int[lIIIlllIIlIlI[0]];
                        iArr13[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
                    }
                    iArr3 = new int[lIIIlllIIlIlI[0]];
                    iArr3[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
                    if (lIlIIIllllIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr14 = new int[lIIIlllIIlIlI[0]];
                        iArr14[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
                        if (lIlIIIllllIlIIl(Bank.contains(iArr14) ? 1 : 0)) {
                            int[] iArr15 = new int[lIIIlllIIlIlI[0]];
                            iArr15[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
                        }
                        if (lIlIIIllllIlIll(Bank.contains(item -> {
                            return item.getName().toLowerCase().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[87]]);
                        }) ? 1 : 0)) {
                            bA.add(new C0003d(lIIIlllIIlIlI[81], lIIIlllIIlIlI[16], lIIIlllIIlIlI[82]));
                            "".length();
                        }
                        iArr4 = new int[lIIIlllIIlIlI[0]];
                        iArr4[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                        if (lIlIIIllllIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
                            int[] iArr16 = new int[lIIIlllIIlIlI[0]];
                            iArr16[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                            if (lIlIIIllllIlIIl(Bank.contains(iArr16) ? 1 : 0)) {
                                int[] iArr17 = new int[lIIIlllIIlIlI[0]];
                                iArr17[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                            }
                            iArr5 = new int[lIIIlllIIlIlI[0]];
                            iArr5[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                            if (lIlIIIllllIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                                int[] iArr18 = new int[lIIIlllIIlIlI[0]];
                                iArr18[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                                if (lIlIIIllllIlIIl(Bank.contains(iArr18) ? 1 : 0)) {
                                    int[] iArr19 = new int[lIIIlllIIlIlI[0]];
                                    iArr19[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                                }
                                iArr6 = new int[lIIIlllIIlIlI[0]];
                                iArr6[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                                if (lIlIIIllllIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                                    int[] iArr20 = new int[lIIIlllIIlIlI[0]];
                                    iArr20[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                                    if (!lIlIIIllllIlIIl(Bank.contains(iArr20) ? 1 : 0)) {
                                        return;
                                    }
                                    int[] iArr21 = new int[lIIIlllIIlIlI[0]];
                                    iArr21[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                                    if (!lIlIIIllllIlIlI(Bank.getFirst(iArr21).getQuantity(), lIIIlllIIlIlI[28])) {
                                        return;
                                    }
                                }
                                bA.add(new C0003d(lIIIlllIIlIlI[13], lIIIlllIIlIlI[54], lIIIlllIIlIlI[84]));
                                "".length();
                            }
                            bA.add(new C0003d(lIIIlllIIlIlI[17], lIIIlllIIlIlI[11], lIIIlllIIlIlI[83]));
                            "".length();
                            iArr6 = new int[lIIIlllIIlIlI[0]];
                            iArr6[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                            if (lIlIIIllllIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                            }
                            bA.add(new C0003d(lIIIlllIIlIlI[13], lIIIlllIIlIlI[54], lIIIlllIIlIlI[84]));
                            "".length();
                        }
                        bA.add(new C0003d(lIIIlllIIlIlI[14], lIIIlllIIlIlI[6], C0007h.bv));
                        "".length();
                        iArr5 = new int[lIIIlllIIlIlI[0]];
                        iArr5[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                        if (lIlIIIllllIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                        }
                        bA.add(new C0003d(lIIIlllIIlIlI[17], lIIIlllIIlIlI[11], lIIIlllIIlIlI[83]));
                        "".length();
                        iArr6 = new int[lIIIlllIIlIlI[0]];
                        iArr6[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                        if (lIlIIIllllIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                        }
                        bA.add(new C0003d(lIIIlllIIlIlI[13], lIIIlllIIlIlI[54], lIIIlllIIlIlI[84]));
                        "".length();
                    }
                    bA.add(new C0003d(lIIIlllIIlIlI[15], lIIIlllIIlIlI[33], lIIIlllIIlIlI[80]));
                    "".length();
                    if (lIlIIIllllIlIll(Bank.contains(item2 -> {
                        return item2.getName().toLowerCase().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[87]]);
                    }) ? 1 : 0)) {
                    }
                    iArr4 = new int[lIIIlllIIlIlI[0]];
                    iArr4[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                    if (lIlIIIllllIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
                    }
                    bA.add(new C0003d(lIIIlllIIlIlI[14], lIIIlllIIlIlI[6], C0007h.bv));
                    "".length();
                    iArr5 = new int[lIIIlllIIlIlI[0]];
                    iArr5[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                    if (lIlIIIllllIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                    }
                    bA.add(new C0003d(lIIIlllIIlIlI[17], lIIIlllIIlIlI[11], lIIIlllIIlIlI[83]));
                    "".length();
                    iArr6 = new int[lIIIlllIIlIlI[0]];
                    iArr6[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                    if (lIlIIIllllIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                    }
                    bA.add(new C0003d(lIIIlllIIlIlI[13], lIIIlllIIlIlI[54], lIIIlllIIlIlI[84]));
                    "".length();
                }
                bA.add(new C0003d(lIIIlllIIlIlI[10], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]));
                "".length();
                iArr3 = new int[lIIIlllIIlIlI[0]];
                iArr3[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
                if (lIlIIIllllIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
                }
                bA.add(new C0003d(lIIIlllIIlIlI[15], lIIIlllIIlIlI[33], lIIIlllIIlIlI[80]));
                "".length();
                if (lIlIIIllllIlIll(Bank.contains(item22 -> {
                    return item22.getName().toLowerCase().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[87]]);
                }) ? 1 : 0)) {
                }
                iArr4 = new int[lIIIlllIIlIlI[0]];
                iArr4[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
                if (lIlIIIllllIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
                }
                bA.add(new C0003d(lIIIlllIIlIlI[14], lIIIlllIIlIlI[6], C0007h.bv));
                "".length();
                iArr5 = new int[lIIIlllIIlIlI[0]];
                iArr5[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
                if (lIlIIIllllIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
                }
                bA.add(new C0003d(lIIIlllIIlIlI[17], lIIIlllIIlIlI[11], lIIIlllIIlIlI[83]));
                "".length();
                iArr6 = new int[lIIIlllIIlIlI[0]];
                iArr6[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
                if (lIlIIIllllIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
                }
                bA.add(new C0003d(lIIIlllIIlIlI[13], lIIIlllIIlIlI[54], lIIIlllIIlIlI[84]));
                "".length();
            }
            bA.add(new C0003d(lIIIlllIIlIlI[7], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]));
            "".length();
            iArr2 = new int[lIIIlllIIlIlI[0]];
            iArr2[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
            if (lIlIIIllllIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
            }
            bA.add(new C0003d(lIIIlllIIlIlI[10], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]));
            "".length();
            iArr3 = new int[lIIIlllIIlIlI[0]];
            iArr3[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
            if (lIlIIIllllIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bA.add(new C0003d(lIIIlllIIlIlI[15], lIIIlllIIlIlI[33], lIIIlllIIlIlI[80]));
            "".length();
            if (lIlIIIllllIlIll(Bank.contains(item222 -> {
                return item222.getName().toLowerCase().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[87]]);
            }) ? 1 : 0)) {
            }
            iArr4 = new int[lIIIlllIIlIlI[0]];
            iArr4[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
            if (lIlIIIllllIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
            }
            bA.add(new C0003d(lIIIlllIIlIlI[14], lIIIlllIIlIlI[6], C0007h.bv));
            "".length();
            iArr5 = new int[lIIIlllIIlIlI[0]];
            iArr5[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
            if (lIlIIIllllIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
            }
            bA.add(new C0003d(lIIIlllIIlIlI[17], lIIIlllIIlIlI[11], lIIIlllIIlIlI[83]));
            "".length();
            iArr6 = new int[lIIIlllIIlIlI[0]];
            iArr6[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
            if (lIlIIIllllIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
            }
            bA.add(new C0003d(lIIIlllIIlIlI[13], lIIIlllIIlIlI[54], lIIIlllIIlIlI[84]));
            "".length();
        }
        bA.add(new C0003d(lIIIlllIIlIlI[9], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]));
        "".length();
        iArr = new int[lIIIlllIIlIlI[0]];
        iArr[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[7];
        if (lIlIIIllllIlIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIIlllIIlIlI[7], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]));
        "".length();
        iArr2 = new int[lIIIlllIIlIlI[0]];
        iArr2[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[10];
        if (lIlIIIllllIlIIl(Bank.contains(iArr2) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIIlllIIlIlI[10], lIIIlllIIlIlI[8], lIIIlllIIlIlI[18]));
        "".length();
        iArr3 = new int[lIIIlllIIlIlI[0]];
        iArr3[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[15];
        if (lIlIIIllllIlIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIIlllIIlIlI[15], lIIIlllIIlIlI[33], lIIIlllIIlIlI[80]));
        "".length();
        if (lIlIIIllllIlIll(Bank.contains(item2222 -> {
            return item2222.getName().toLowerCase().contains(lIIIlllIIlIIl[lIIIlllIIlIlI[87]]);
        }) ? 1 : 0)) {
        }
        iArr4 = new int[lIIIlllIIlIlI[0]];
        iArr4[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[14];
        if (lIlIIIllllIlIIl(Bank.contains(iArr4) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIIlllIIlIlI[14], lIIIlllIIlIlI[6], C0007h.bv));
        "".length();
        iArr5 = new int[lIIIlllIIlIlI[0]];
        iArr5[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[17];
        if (lIlIIIllllIlIIl(Bank.contains(iArr5) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIIlllIIlIlI[17], lIIIlllIIlIlI[11], lIIIlllIIlIlI[83]));
        "".length();
        iArr6 = new int[lIIIlllIIlIlI[0]];
        iArr6[lIIIlllIIlIlI[1]] = lIIIlllIIlIlI[13];
        if (lIlIIIllllIlIIl(Bank.contains(iArr6) ? 1 : 0)) {
        }
        bA.add(new C0003d(lIIIlllIIlIlI[13], lIIIlllIIlIlI[54], lIIIlllIIlIlI[84]));
        "".length();
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public int Y() {
        try {
            ar();
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) == (true ^ true)) {
                return (239 ^ 187) & ((56 ^ 108) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIlllIIlIlI[85];
    }

    @Override // i.s.p000.g.p001.r.l.q.a.p002.b.e.i.e.t.d.r.u.r.u.n.k.i.M
    public String Z() {
        return lIIIlllIIlIIl[lIIIlllIIlIlI[86]];
    }

    private static boolean lIlIIIllllIlIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIlIIIlllllIIlI(Object obj) {
        return obj == null;
    }

    private static String lIlIIIllllIIlII(String lllllllllllllllIIIIIllIlIIIIIIIl, String lllllllllllllllIIIIIllIlIIIIIIII) {
        String lllllllllllllllIIIIIllIlIIIIIIIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIIIllIlIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIIllIIllllllll = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIIllIlIIIIIIII.toCharArray();
        int lllllllllllllllIIIIIllIIllllllIl = lIIIlllIIlIlI[1];
        char[] charArray2 = lllllllllllllllIIIIIllIlIIIIIIIl2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIlllIIlIlI[1];
        while (lIlIIIllllIlIlI(i2, length)) {
            char lllllllllllllllIIIIIllIlIIIIIIlI = charArray2[i2];
            lllllllllllllllIIIIIllIIllllllll.append((char) (lllllllllllllllIIIIIllIlIIIIIIlI ^ charArray[lllllllllllllllIIIIIllIIllllllIl % charArray.length]));
            "".length();
            lllllllllllllllIIIIIllIIllllllIl++;
            i2++;
            "".length();
            if ((" ".length() & (" ".length() ^ (-1))) != ((124 ^ 109) & ((5 ^ 20) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIIllIIllllllll);
    }

    private static String lIlIIIllllIIllI(String lllllllllllllllIIIIIllIlIIIllllI, String lllllllllllllllIIIIIllIlIIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIIllIlIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIIllIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), lIIIlllIIlIlI[23]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlllIIlIlI[5], lllllllllllllllIIIIIllIlIIlIIIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIIllIlIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIIllIlIIIllIlI) {
            lllllllllllllllIIIIIllIlIIIllIlI.printStackTrace();
            return null;
        }
    }
}
