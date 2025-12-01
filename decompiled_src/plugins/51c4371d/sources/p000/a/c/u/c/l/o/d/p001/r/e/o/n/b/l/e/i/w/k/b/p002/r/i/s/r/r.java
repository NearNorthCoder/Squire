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
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.r  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/r.class */
public class r implements F {
    public static /* synthetic */ boolean cs;
    private static /* synthetic */ String[] llllllIl;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ String[] bX;
    private static /* synthetic */ WorldPoint cC;
    private static /* synthetic */ int[] llllllll;
    private static /* synthetic */ WorldPoint cz;
    static /* synthetic */ boolean cj;
    private static /* synthetic */ WorldPoint cD;
    public static /* synthetic */ boolean ct;
    public static /* synthetic */ List<C0003d> bB;
    private static /* synthetic */ WorldPoint cA;
    public static /* synthetic */ boolean cu;
    static /* synthetic */ int ci;
    static /* synthetic */ int cx;
    public static /* synthetic */ boolean cw;
    private static /* synthetic */ WorldPoint cy;
    private static /* synthetic */ WorldPoint cB;
    public static /* synthetic */ boolean cv;
    private static /* synthetic */ WorldPoint cE;

    private static boolean llIlIIlIlll(int i) {
        return i == 0;
    }

    private static boolean llIlIIllllI(int i, int i2) {
        return i != i2;
    }

    static {
        llIlIIlIlII();
        llIlIIlIIll();
        bB = new ArrayList();
        cx = llllllll[1];
        cy = new WorldPoint(llllllll[91], llllllll[92], llllllll[1]);
        cz = new WorldPoint(llllllll[93], llllllll[94], llllllll[1]);
        cA = new WorldPoint(llllllll[95], llllllll[96], llllllll[1]);
        cB = new WorldPoint(llllllll[97], llllllll[98], llllllll[1]);
        cC = new WorldPoint(llllllll[99], llllllll[100], llllllll[1]);
        cD = new WorldPoint(llllllll[101], llllllll[102], llllllll[1]);
        cE = new WorldPoint(llllllll[103], llllllll[104], llllllll[1]);
        String[] strArr = new String[llllllll[33]];
        strArr[llllllll[1]] = llllllIl[llllllll[105]];
        strArr[llllllll[0]] = llllllIl[llllllll[106]];
        strArr[llllllll[5]] = llllllIl[llllllll[107]];
        strArr[llllllll[10]] = llllllIl[llllllll[108]];
        strArr[llllllll[6]] = llllllIl[llllllll[109]];
        strArr[llllllll[13]] = llllllIl[llllllll[110]];
        strArr[llllllll[17]] = llllllIl[llllllll[111]];
        strArr[llllllll[18]] = llllllIl[llllllll[112]];
        strArr[llllllll[2]] = llllllIl[llllllll[113]];
        strArr[llllllll[24]] = llllllIl[llllllll[114]];
        strArr[llllllll[12]] = llllllIl[llllllll[115]];
        strArr[llllllll[25]] = llllllIl[llllllll[116]];
        strArr[llllllll[15]] = llllllIl[llllllll[117]];
        strArr[llllllll[26]] = llllllIl[llllllll[118]];
        strArr[llllllll[27]] = llllllIl[llllllll[119]];
        strArr[llllllll[28]] = llllllIl[llllllll[120]];
        strArr[llllllll[29]] = llllllIl[llllllll[121]];
        strArr[llllllll[30]] = llllllIl[llllllll[122]];
        strArr[llllllll[31]] = llllllIl[llllllll[123]];
        strArr[llllllll[32]] = llllllIl[llllllll[124]];
        bX = strArr;
    }

    private static boolean llIlIIllIlI(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ac() {
        String[] strArr = new String[llllllll[0]];
        strArr[llllllll[1]] = llllllIl[llllllll[73]];
        if (llIlIIllIll(Inventory.getCount(strArr))) {
            int[] iArr = new int[llllllll[0]];
            iArr[llllllll[1]] = llllllll[7];
            if (llIlIIllIll(Inventory.getCount(iArr)) && llIlIIllIll(Inventory.getCount(C0005f.bb))) {
                int[] iArr2 = new int[llllllll[0]];
                iArr2[llllllll[1]] = llllllll[8];
                if (llIlIIllIll(Inventory.getCount(iArr2))) {
                    ?? r0 = llllllll[0];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return llllllll[1];
    }

    private static String llIlIIlIIII(String lIIllIIIIIlIllI, String lIIllIIIIIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), llllllll[2]), "DES");
            Cipher lIIllIIIIIllIII = Cipher.getInstance("DES");
            lIIllIIIIIllIII.init(llllllll[5], secretKeySpec);
            return new String(lIIllIIIIIllIII.doFinal(Base64.getDecoder().decode(lIIllIIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIIIIIlIlll) {
            lIIllIIIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIllIIl(int i, int i2) {
        return i == i2;
    }

    private static void ag() {
        int[] iArr = new int[llllllll[0]];
        iArr[llllllll[1]] = llllllll[9];
        if (llIlIIlIlll(Bank.contains(iArr) ? 1 : 0)) {
            bB.add(new C0003d(llllllll[9], llllllll[12], llllllll[74]));
            "".length();
        }
        int[] iArr2 = new int[llllllll[0]];
        iArr2[llllllll[1]] = llllllll[11];
        if (llIlIIlIlll(Bank.contains(iArr2) ? 1 : 0)) {
            bB.add(new C0003d(llllllll[11], llllllll[13], C0008i.bw));
            "".length();
        }
        if (llIlIIlIlll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(llllllIl[llllllll[80]]);
        }) ? 1 : 0)) {
            bB.add(new C0003d(llllllll[75], llllllll[13], llllllll[76]));
            "".length();
        }
        int[] iArr3 = new int[llllllll[0]];
        iArr3[llllllll[1]] = llllllll[7];
        if (llIlIIlIlll(Bank.contains(iArr3) ? 1 : 0)) {
            bB.add(new C0003d(llllllll[7], llllllll[53], llllllll[74]));
            "".length();
        }
        int[] iArr4 = new int[llllllll[0]];
        iArr4[llllllll[1]] = llllllll[8];
        if (llIlIIlIlll(Bank.contains(iArr4) ? 1 : 0)) {
            bB.add(new C0003d(llllllll[8], llllllll[12], llllllll[74]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (llIlIIllIII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[24])) {
            String[] strArr = new String[llllllll[0]];
            strArr[llllllll[1]] = llllllIl[llllllll[79]];
            if (llIlIIlIlll(Inventory.contains(strArr) ? 1 : 0)) {
                ?? r0 = llllllll[0];
                "".length();
                return ((71 ^ 19) ^ (85 ^ 5)) < " ".length() ? ((246 ^ 128) ^ (58 ^ 125)) & (((227 ^ 194) ^ (190 ^ 174)) ^ (-" ".length())) : r0;
            }
        }
        return llllllll[1];
    }

    public static void aG() {
        String[] strArr = new String[llllllll[0]];
        strArr[llllllll[1]] = llllllIl[llllllll[66]];
        if (llIlIIlIlIl(Inventory.contains(strArr) ? 1 : 0)) {
            if (llIlIIllIlI(Widgets.get(llllllll[59]))) {
                AccBuilderBarrows.c = llllllIl[llllllll[67]];
                String[] strArr2 = new String[llllllll[0]];
                strArr2[llllllll[1]] = llllllIl[llllllll[68]];
                Inventory.getFirst(strArr2).interact(llllllIl[llllllll[69]]);
                Time.sleepTicks(llllllll[6]);
                "".length();
                AccBuilderBarrows.c = llllllIl[llllllll[70]];
                Widget widget = Widgets.get(llllllll[59], llllllll[27]);
                if (llIlIIllIlI(widget)) {
                    widget.interact(llllllIl[llllllll[71]]);
                    Time.sleepTicks(llllllll[0]);
                    "".length();
                }
                Widget widget2 = Widgets.get(llllllll[59], llllllll[39]);
                if (llIlIIllIlI(widget2)) {
                    widget2.interact(llllllIl[llllllll[72]]);
                    Time.sleepTicks(llllllll[5]);
                    "".length();
                }
            }
            Time.sleepTicks(llllllll[0]);
            "".length();
        }
    }

    private static void llIlIIlIIll() {
        llllllIl = new String[llllllll[125]];
        llllllIl[llllllll[1]] = llIlIIIllll("oiGe1rTTLbSckDUjGVPoQKqQtpVGswVq5bQQkdql+bbp631rEQn43Un/GAVix6Sf", "GLTXB");
        llllllIl[llllllll[0]] = llIlIIlIIII("bWSza6yJ7PsJJuaL8ic41Q==", "wSNlm");
        llllllIl[llllllll[5]] = llIlIIIllll("Sjd1HCRJc1yGPYrEO8e3eTdzMOAc5Lxu", "ktgHh");
        llllllIl[llllllll[10]] = llIlIIIllll("50hTLy0fXgcuX5mkuIHFhPo4H+Uji/t1UcRnyPBusAfUjUqWeOcQvH6Y2Ar47O3b6tpnVgmbpn8=", "WgasF");
        llllllIl[llllllll[6]] = llIlIIIllll("nGnRrR+u6kk=", "nTFba");
        llllllIl[llllllll[13]] = llIlIIlIIIl("IiYYJzs=", "fTqIP");
        llllllIl[llllllll[17]] = llIlIIlIIIl("BSw6RjckbT8SIjk5", "KMLfC");
        llllllIl[llllllll[18]] = llIlIIlIIII("yrNBzNKxcgUCCJy3X1uymw==", "ekyMa");
        llllllIl[llllllll[2]] = llIlIIlIIIl("LgMsHg==", "xfCmS");
        llllllIl[llllllll[24]] = llIlIIlIIII("WP9uvpWrzj7vonEjS0cQRAp200hyZZNj", "vzFvN");
        llllllIl[llllllll[12]] = llIlIIlIIII("uTfApTUMVx4=", "wKemX");
        llllllIl[llllllll[25]] = llIlIIlIIIl("LjgpOhQFIi82VRojIz4Z", "kVJRu");
        llllllIl[llllllll[15]] = llIlIIlIIII("cODp9UtlhQqCW3bMm60eyHkGfTGgIVkZ", "fiTBW");
        llllllIl[llllllll[26]] = llIlIIIllll("XyC+3LEhJNo=", "ZqNmO");
        llllllIl[llllllll[27]] = llIlIIlIIIl("Ih8NDzYJBQsDdxYEBws7", "gqngW");
        llllllIl[llllllll[28]] = llIlIIlIIII("veQ6Da6BRuQR7VT84vGNm6lhsmaaoLWr", "eImth");
        llllllIl[llllllll[29]] = llIlIIlIIIl("JiQ6PhEcInYlEQEm", "rEVUx");
        llllllIl[llllllll[30]] = llIlIIlIIII("D/PdxXjdfGk=", "gAgwN");
        llllllIl[llllllll[31]] = llIlIIlIIIl("Ngw/MBcYADV5FBkWMg==", "peQYd");
        llllllIl[llllllll[32]] = llIlIIlIIIl("OxUYVR0aVA8HClUABxkM", "utnui");
        llllllIl[llllllll[33]] = llIlIIlIIIl("PwsFGiQFDUkQPwg=", "kjiqM");
        llllllIl[llllllll[34]] = llIlIIlIIIl("PQwqNw4H", "oiMVz");
        llllllIl[llllllll[35]] = llIlIIlIIII("rIpS676fwybHUO47d5VLpg==", "AWoDw");
        llllllIl[llllllll[36]] = llIlIIIllll("8TZKtjzGNCnE4/vVsaP/JV9wyEECQGMQ", "TNZLz");
        llllllIl[llllllll[37]] = llIlIIIllll("lqJ+jwxt+3gxec2PqzGHGQ==", "RIXEv");
        llllllIl[llllllll[38]] = llIlIIlIIII("DoasYq3iPmM=", "nRIcy");
        llllllIl[llllllll[39]] = llIlIIIllll("H7DgDoT4f6e9+Ln97KgCVQ==", "rMGkK");
        llllllIl[llllllll[40]] = llIlIIlIIII("0iDPEXGRVAqgQ7CnD9qpEBJlhEKn2Wy4", "yOcDB");
        llllllIl[llllllll[41]] = llIlIIlIIIl("ERIqOgQrFGYiBTwJLzQD", "EsFQm");
        llllllIl[llllllll[42]] = llIlIIlIIII("rfdZimAEFGpFt9iE8X3fHQ==", "FHeOt");
        llllllIl[llllllll[43]] = llIlIIlIIII("Hs9TPAv/y8PVAUJjQXVDGTVgQXa0PKzU", "YXFvS");
        llllllIl[llllllll[44]] = llIlIIlIIII("1r2hl+oCJErBpot1VcQR+3+Srk0XfBjS", "BqsMa");
        llllllIl[llllllll[45]] = llIlIIIllll("Fd9fcO3IzB1g+R4Xy0celvhKxc9AfhKB", "FvEgU");
        llllllIl[llllllll[46]] = llIlIIlIIII("CnT/o5AbMpA=", "qDoCn");
        llllllIl[llllllll[47]] = llIlIIIllll("wdLY/LVVepcCcB+yIxT8x7fhK8pCH0vp", "ahFOO");
        llllllIl[llllllll[48]] = llIlIIIllll("tYndFgsw3qk28iPDI/t7kw==", "iKozi");
        llllllIl[llllllll[49]] = llIlIIlIIII("16x1fj5C65bltuDnNPK9gQ==", "gugOP");
        llllllIl[llllllll[50]] = llIlIIIllll("hyAAJx+uyp4=", "oEtAN");
        llllllIl[llllllll[51]] = llIlIIIllll("jTvXg50JjXc9Qm/3H2qteZP7DUIVSnqt", "KcNqY");
        llllllIl[llllllll[52]] = llIlIIlIIII("XnAD61aoRTh7mfolULSpFw==", "rwTlB");
        llllllIl[llllllll[53]] = llIlIIlIIIl("DCEHNhwzMRs3CmE3BiA=", "AXtBy");
        llllllIl[llllllll[54]] = llIlIIIllll("czSFoIgMdAgItv7qxf6vAQ==", "gheRj");
        llllllIl[llllllll[55]] = llIlIIlIIII("lIb1glkVVk9eqGesjDAGZA==", "bCEaT");
        llllllIl[llllllll[56]] = llIlIIlIIIl("BSYGOhkfIEonFR40", "qGjQp");
        llllllIl[llllllll[57]] = llIlIIIllll("Hdn/mEK1g0Y=", "yNYIp");
        llllllIl[llllllll[58]] = llIlIIlIIIl("EikwIQAmImQkED43", "SGDHq");
        llllllIl[llllllll[60]] = llIlIIIllll("uDc6Bp2Ylq74scQjfIg08Q==", "yPIqZ");
        llllllIl[llllllll[61]] = llIlIIIllll("jTcFcSrQN5xmgPtcd4KZXg==", "LuhAv");
        llllllIl[llllllll[62]] = llIlIIlIIIl("HgUy", "LpPuf");
        llllllIl[llllllll[63]] = llIlIIIllll("/hyjm9biBh3D/112nRmicbhzq0fdbLES", "fLxtH");
        llllllIl[llllllll[64]] = llIlIIIllll("KrpgdtfGwhc=", "bDIEr");
        llllllIl[llllllll[65]] = llIlIIIllll("lBeNR99Sx7E=", "AWMBl");
        llllllIl[llllllll[66]] = llIlIIlIIII("/Ji4TcjJHFFNw92cjqvmiw==", "XiTXi");
        llllllIl[llllllll[67]] = llIlIIlIIIl("MxM6IwEPAXgtCQwW", "afXAh");
        llllllIl[llllllll[68]] = llIlIIlIIIl("MBQzPD0EH2c5LRwK", "qzGUL");
        llllllIl[llllllll[69]] = llIlIIIllll("ek/84+K6Oj0=", "WWjEu");
        llllllIl[llllllll[70]] = llIlIIlIIIl("Nxc9Dy4QGz8NbRceMBMoFg==", "drQjM");
        llllllIl[llllllll[71]] = llIlIIlIIIl("FwMFFSI2", "DodlG");
        llllllIl[llllllll[72]] = llIlIIIllll("7IUGnWBceQM=", "hOBlQ");
        llllllIl[llllllll[73]] = llIlIIlIIII("6WCl+n2f8pE=", "esJyE");
        llllllIl[llllllll[78]] = llIlIIIllll("sSA+GMRh+jUpqkrY2S98K4QlNjRhAoFB", "xXZOF");
        llllllIl[llllllll[79]] = llIlIIlIIIl("GCozHxQsIWcaBDQ0", "YDGve");
        llllllIl[llllllll[80]] = llIlIIlIIIl("OQclLmYkCGs+IyoCPyFmYw==", "KnKIF");
        llllllIl[llllllll[81]] = llIlIIlIIIl("LS45cBpOLiQ7cxcgInAyDCAiJHMmICQ5Nwc6JG8=", "nOWPS");
        llllllIl[llllllll[82]] = llIlIIlIIII("KCVUMWHYQtZ83/Ajlv0wbw==", "ZUWZq");
        llllllIl[llllllll[16]] = llIlIIlIIII("t406c/HD8NfMVEG63Ig1Qw==", "JHqFJ");
        llllllIl[llllllll[83]] = llIlIIlIIIl("FSA2UhB2ICsZeS8uLVI4NC4tBnkFKTkLIz8kNk0=", "VAXrY");
        llllllIl[llllllll[84]] = llIlIIlIIIl("KhYdbTlGBxsrLgNd", "fsiJJ");
        llllllIl[llllllll[85]] = llIlIIlIIII("gyBeesGvJBAjddREsZcdlw8Hh5g3NAs3/6bjGecRgk0=", "ezUgA");
        llllllIl[llllllll[86]] = llIlIIlIIIl("CAkeUyZkGBgVMSFC", "DljtU");
        llllllIl[llllllll[87]] = llIlIIIllll("/CTqRrNg+36hjDdCx7mOJj4d6bfgYWXqc1KkBQ7JLD0=", "TxnGn");
        llllllIl[llllllll[88]] = llIlIIlIIIl("H0gxNRlxHHU0EjMMdTsZLxw9MxkxRg==", "VhUZw");
        llllllIl[llllllll[89]] = llIlIIIllll("O9nNpepj41bnQ1G0aKc4wHeB7rtK8FyT89VwcSdHwsQ+9zhG1t40YA==", "FNKVS");
        llllllIl[llllllll[90]] = llIlIIlIIII("hhoZIeO7rfOWlJyyfMmS+ticUEmsMY40ll11PuVgZGHVBAJUNZ8+6g==", "tvDWx");
        llllllIl[llllllll[105]] = llIlIIlIIIl("CjYdJnM7OB5jNC0jSyI9O3caNjYxIxhjNS0lSy42fQ==", "BWkCS");
        llllllIl[llllllll[106]] = llIlIIlIIII("qi5spJwvThk=", "EWygf");
        llllllIl[llllllll[107]] = llIlIIlIIII("WZHmSlbnpJQ=", "qapbT");
        llllllIl[llllllll[108]] = llIlIIlIIIl("LQMHdBxOAxo/dRcNHHQ0DA0cIHU+DRsgdT4LGjc0HAsFPSAdXQ==", "nbiTU");
        llllllIl[llllllll[109]] = llIlIIIllll("Cny2q7g5CQtuHqeNGTQUmsjSDIPOXzSBWlWoc92oTpMFsmzJRu716hzERSyuBGix", "iYzGA");
        llllllIl[llllllll[110]] = llIlIIlIIII("cP2TwEpkJ/MhFHJoEQDmcv7u/QmGl2511RDvC1rc+o1cO9DwD7x46g==", "BLXJS");
        llllllIl[llllllll[111]] = llIlIIIllll("V+WsL6a69yyVEOmGTRzzhKZCpqHZmAVXAQDya6sIE10=", "FeQnc");
        llllllIl[llllllll[112]] = llIlIIlIIII("wq1tkJJfVTuSa/coB1MxqpejNOs6Eu9V0ev9SuPTWGDAc8doyJpZeA==", "LiEef");
        llllllIl[llllllll[113]] = llIlIIIllll("+8unvRIf5wwvbrGl39SHgGUwB3aOhEQOnN1j76Qs/zU=", "uzLqx");
        llllllIl[llllllll[114]] = llIlIIIllll("e92G7u/x+w4FZFZFfsFPw/az4zBzndKk9Zv8CJhCgEQqb4ivEsVPJL2sXfEgZNJV", "uhpAP");
        llllllIl[llllllll[115]] = llIlIIlIIII("KYznsTZ54Xh4KiQEAwtMm3QaIoB+tAKQRcDiiJnECFs=", "GwdpB");
        llllllIl[llllllll[116]] = llIlIIIllll("ptWBUJw7aOphv6GLM5C3oex4vCTuTXiiHHOhpLc3swEpPat6rZebCg==", "AXHdr");
        llllllIl[llllllll[117]] = llIlIIlIIIl("By4mTxxkLjsEdT0gPU80JiA9G3UMIDsGMS06O1A=", "DOHoU");
        llllllIl[llllllll[118]] = llIlIIIllll("25fHSVLh/jKkzX2hqJcsZRYqlWvc3/D3dIlSy1GOmRXKYLmni38KTg==", "TbXGX");
        llllllIl[llllllll[119]] = llIlIIlIIII("uIWgrLQWWTP6uXl+BWW5t5/CxoGwkvIcHhfTQYsK5nBEJ83Hz9SLovxw8812Cfh6", "qznvU");
        llllllIl[llllllll[120]] = llIlIIlIIII("A06Xd9eSuTAxFXFgKpOQnpN+eWMLw5ruAkyH6/j7Vc4=", "WaiZW");
        llllllIl[llllllll[121]] = llIlIIlIIIl("IhEiG04cCmMbBhALJk8aGlknAE4cF2MjAQMYKAoAEhN8", "uyCon");
        llllllIl[llllllll[122]] = llIlIIlIIIl("EzopE0ktIWgTASEgLUcdK3IsCEktPGg0ASUrMg4MKm0=", "DRHgi");
        llllllIl[llllllll[123]] = llIlIIlIIII("8glFZXJfDk1ZXkA2Mq4wuikSfGALsBvI/roQMYGvhSmI4uuB95ld6g==", "lIYed");
        llllllIl[llllllll[124]] = llIlIIlIIIl("Fg8Ncgt6Hhg5E3oLGzoNLkoAOg0oSho5ET8EDXtWdA==", "ZjyUx");
    }

    private static boolean llIlIIllIII(int i, int i2) {
        return i >= i2;
    }

    private static void llIlIIlIlII() {
        llllllll = new int[126];
        llllllll[0] = " ".length();
        llllllll[1] = (169 ^ 139) & ((90 ^ 120) ^ (-1));
        llllllll[2] = (65 ^ 20) ^ (31 ^ 66);
        llllllll[3] = (-9545) & 32616;
        llllllll[4] = (-((-9762) & 11829)) & (-24613) & 31679;
        llllllll[5] = "  ".length();
        llllllll[6] = (((80 + 166) - 144) + 68) ^ (((46 + 132) - 164) + 160);
        llllllll[7] = (-129) & 8135;
        llllllll[8] = (-16533) & 24541;
        llllllll[9] = (-((-11274) & 16015)) & (-18433) & 23487;
        llllllll[10] = "   ".length();
        llllllll[11] = (-2693) & 15317;
        llllllll[12] = (((104 + 131) - 88) + 57) ^ (((16 + 129) - 15) + 68);
        llllllll[13] = 151 ^ 146;
        llllllll[14] = (-((-10557) & 27069)) & (-2053) & 18943;
        llllllll[15] = (5 ^ 93) ^ (21 ^ 65);
        llllllll[16] = 83 ^ 18;
        llllllll[17] = 171 ^ 173;
        llllllll[18] = 46 ^ 41;
        llllllll[19] = (-((-16543) & 18591)) & (-16897) & 24564;
        llllllll[20] = (-((-17869) & 26063)) & (-16905) & 30719;
        llllllll[21] = (-16897) & 22518;
        llllllll[22] = (-8193) & 13815;
        llllllll[23] = (-25089) & 30712;
        llllllll[24] = (120 ^ 12) ^ (20 ^ 105);
        llllllll[25] = (125 ^ 6) ^ (48 ^ 64);
        llllllll[26] = (103 ^ 37) ^ (112 ^ 63);
        llllllll[27] = (((165 + 13) - 68) + 62) ^ (((34 + 77) - (-44)) + 7);
        llllllll[28] = (21 ^ 84) ^ (48 ^ 126);
        llllllll[29] = 57 ^ 41;
        llllllll[30] = (((113 + 123) - 163) + 138) ^ (((126 + 29) - 107) + 146);
        llllllll[31] = (((92 + 74) - 146) + 124) ^ (((50 + 85) - 117) + 112);
        llllllll[32] = (124 ^ 6) ^ (215 ^ 190);
        llllllll[33] = 143 ^ 155;
        llllllll[34] = (178 ^ 153) ^ (96 ^ 94);
        llllllll[35] = (55 ^ 37) ^ (164 ^ 160);
        llllllll[36] = (((131 + 6) - 133) + 146) ^ (((59 + 43) - 0) + 27);
        llllllll[37] = (193 ^ 181) ^ (248 ^ 148);
        llllllll[38] = 2 ^ 27;
        llllllll[39] = (((110 + 62) - 31) + 26) ^ (((60 + 13) - (-12)) + 104);
        llllllll[40] = 86 ^ 77;
        llllllll[41] = 6 ^ 26;
        llllllll[42] = (76 ^ 1) ^ (98 ^ 50);
        llllllll[43] = 91 ^ 69;
        llllllll[44] = 169 ^ 182;
        llllllll[45] = 105 ^ 73;
        llllllll[46] = 62 ^ 31;
        llllllll[47] = 156 ^ 190;
        llllllll[48] = 84 ^ 119;
        llllllll[49] = (117 ^ 65) ^ (151 ^ 135);
        llllllll[50] = 137 ^ 172;
        llllllll[51] = 50 ^ 20;
        llllllll[52] = (36 ^ 0) ^ "   ".length();
        llllllll[53] = (((15 + 2) - (-79)) + 39) ^ (((44 + 79) - (-32)) + 20);
        llllllll[54] = 27 ^ 50;
        llllllll[55] = 101 ^ 79;
        llllllll[56] = 143 ^ 164;
        llllllll[57] = (((1 + 44) - 10) + 102) ^ (((152 + 138) - 133) + 8);
        llllllll[58] = (((3 + 122) - 7) + 23) ^ (((38 + 125) - 57) + 54);
        llllllll[59] = ((106 + 80) - 79) + 133;
        llllllll[60] = 30 ^ 48;
        llllllll[61] = (109 ^ 66) ^ ((41 ^ 104) & ((199 ^ 134) ^ (-1)));
        llllllll[62] = 59 ^ 11;
        llllllll[63] = 83 ^ 98;
        llllllll[64] = (116 ^ 6) ^ (51 ^ 115);
        llllllll[65] = (((74 + 64) - 71) + 110) ^ (((5 + 129) - 103) + 99);
        llllllll[66] = 69 ^ 113;
        llllllll[67] = (((105 + 61) - 138) + 151) ^ (((57 + 24) - 34) + 87);
        llllllll[68] = 187 ^ 141;
        llllllll[69] = 57 ^ 14;
        llllllll[70] = (186 ^ 142) ^ (109 ^ 97);
        llllllll[71] = 139 ^ 178;
        llllllll[72] = 184 ^ 130;
        llllllll[73] = (245 ^ 129) ^ (90 ^ 21);
        llllllll[74] = (-((-2507) & 31198)) & (-3073) & 32663;
        llllllll[75] = (-16660) & 28639;
        llllllll[76] = (-((-29071) & 30671)) & (-4119) & 30718;
        llllllll[77] = (85 ^ 109) ^ (5 ^ 89);
        llllllll[78] = 119 ^ 75;
        llllllll[79] = (114 ^ 90) ^ (112 ^ 101);
        llllllll[80] = (50 ^ 74) ^ (234 ^ 172);
        llllllll[81] = (24 ^ 44) ^ (26 ^ 17);
        llllllll[82] = (((118 + 154) - 68) + 41) ^ (((151 + 45) - 102) + 87);
        llllllll[83] = (72 ^ 63) ^ (1 ^ 52);
        llllllll[84] = (9 ^ 78) ^ (23 ^ 19);
        llllllll[85] = (((56 + 10) - (-116)) + 70) ^ (((75 + 120) - 123) + 112);
        llllllll[86] = (((213 + 5) - 7) + 12) ^ (((9 + 11) - (-5)) + 129);
        llllllll[87] = 55 ^ 113;
        llllllll[88] = (167 ^ 135) ^ (229 ^ 130);
        llllllll[89] = 120 ^ 48;
        llllllll[90] = 44 ^ 101;
        llllllll[91] = (-((-1929) & 32735)) & (-9) & 32639;
        llllllll[92] = (-((-9793) & 26197)) & (-8450) & 28543;
        llllllll[93] = (-((-17927) & 20151)) & (-8193) & 12223;
        llllllll[94] = (-49) & 3774;
        llllllll[95] = (-14409) & 16127;
        llllllll[96] = (-((-11393) & 28051)) & (-12385) & 32767;
        llllllll[97] = (-31105) & 32655;
        llllllll[98] = (-12297) & 16045;
        llllllll[99] = (-23055) & 24574;
        llllllll[100] = (-12745) & 16335;
        llllllll[101] = (-(16 ^ 1)) & (-258) & 2047;
        llllllll[102] = (-12442) & 16029;
        llllllll[103] = (-26635) & 28346;
        llllllll[104] = (-((-8513) & 12741)) & (-8257) & 16367;
        llllllll[105] = (106 ^ 16) ^ (148 ^ 164);
        llllllll[106] = (15 ^ 121) ^ (120 ^ 69);
        llllllll[107] = (110 ^ 76) ^ (36 ^ 74);
        llllllll[108] = (65 ^ 95) ^ (79 ^ 28);
        llllllll[109] = (111 ^ 83) ^ (236 ^ 158);
        llllllll[110] = 234 ^ 165;
        llllllll[111] = (((38 + 225) - 182) + 165) ^ (((69 + 65) - (-22)) + 10);
        llllllll[112] = 12 ^ 93;
        llllllll[113] = 45 ^ 127;
        llllllll[114] = 5 ^ 86;
        llllllll[115] = (58 ^ 46) ^ (84 ^ 20);
        llllllll[116] = 74 ^ 31;
        llllllll[117] = 7 ^ 81;
        llllllll[118] = 150 ^ 193;
        llllllll[119] = 83 ^ 11;
        llllllll[120] = 75 ^ 18;
        llllllll[121] = 235 ^ 177;
        llllllll[122] = (166 ^ 130) ^ (((39 + 51) - 28) + 65);
        llllllll[123] = (9 ^ 1) ^ (105 ^ 61);
        llllllll[124] = 1 ^ 92;
        llllllll[125] = (118 ^ 51) ^ (76 ^ 87);
    }

    private static boolean llIlIIlllIl(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return llllllll[1];
    }

    private static boolean llIlIIlIlIl(int i) {
        return i != 0;
    }

    private static boolean llIlIIlllII(int i, int i2) {
        return i > i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        try {
            aF();
            "".length();
            if ((-"   ".length()) > 0) {
                return ((16 ^ 93) ^ (153 ^ 142)) & (((((8 + 208) - 142) + 155) ^ (((169 + 135) - 232) + 119)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return llllllll[77];
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return llllllIl[llllllll[78]];
    }

    private static String llIlIIIllll(String lIIlIllllllIIIl, String lIIlIllllllIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIllllllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIllllllIIll = Cipher.getInstance("Blowfish");
            lIIlIllllllIIll.init(llllllll[5], secretKeySpec);
            return new String(lIIlIllllllIIll.doFinal(Base64.getDecoder().decode(lIIlIllllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIlIlllllIllIl) {
            lIIlIlllllIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIllIll(int i) {
        return i > 0;
    }

    private static boolean llIlIIlIllI(int i, int i2) {
        return i < i2;
    }

    private static String llIlIIlIIIl(String lIIllIIIIIIIllI, String lIIllIIIIIIIlIl) {
        String lIIllIIIIIIIllI2 = new String(Base64.getDecoder().decode(lIIllIIIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIIIIIIIlII = new StringBuilder();
        char[] charArray = lIIllIIIIIIIlIl.toCharArray();
        int lIIllIIIIIIIIlI = llllllll[1];
        char[] charArray2 = lIIllIIIIIIIllI2.toCharArray();
        int lIIlIlllllllIll = charArray2.length;
        int i = llllllll[1];
        while (llIlIIlIllI(i, lIIlIlllllllIll)) {
            lIIllIIIIIIIlII.append((char) (charArray2[i] ^ charArray[lIIllIIIIIIIIlI % charArray.length]));
            "".length();
            lIIllIIIIIIIIlI++;
            i++;
            "".length();
            if ("  ".length() == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lIIllIIIIIIIlII);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
        if (llIlIIlIlIl(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L290;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v499, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v501, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v503, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v505, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v507, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v612, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v639, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v85, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v97, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aF() {
        if (llIlIIlIlIl(bz ? 1 : 0)) {
            C0001b.a(bB);
            if (llIlIIlIllI(bB.size(), llllllll[0])) {
                System.out.println(llllllIl[llllllll[1]]);
                bz = llllllll[1];
            }
        }
        if (llIlIIlIlll(bz ? 1 : 0)) {
            if (llIlIIllIII(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllllll[2])) {
                int[] iArr = new int[llllllll[0]];
                iArr[llllllll[1]] = llllllll[3];
            }
            E.ck();
            if (llIlIIlIlll(ac() ? 1 : 0) && llIlIIlIllI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[0]) && llIlIIllIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllllll[2])) {
                int[] iArr2 = new int[llllllll[0]];
                iArr2[llllllll[1]] = llllllll[3];
                if (llIlIIlIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (llIlIIllIlI(nearest) && llIlIIlIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllllIl[llllllll[0]];
                        C0000a.a(nearest);
                    }
                    if (llIlIIllIlI(nearest) && llIlIIlIlIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (llIlIIlIlll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, llllllll[4]);
                            "".length();
                        }
                        if (llIlIIlIlIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderBarrows.c = llllllIl[llllllll[5]];
                            if (llIlIIllIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(llllllll[6]);
                                "".length();
                            }
                            if (llIlIIllIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(llllllll[5]);
                                "".length();
                            }
                            int[] iArr3 = new int[llllllll[6]];
                            iArr3[llllllll[1]] = llllllll[7];
                            iArr3[llllllll[0]] = llllllll[8];
                            iArr3[llllllll[5]] = llllllll[9];
                            iArr3[llllllll[10]] = llllllll[11];
                            if (llIlIIlIlll(C0004e.b(iArr3) ? 1 : 0)) {
                                ag();
                                System.out.println(llllllIl[llllllll[10]]);
                                bz = llllllll[0];
                                return;
                            }
                            int[] iArr4 = new int[llllllll[6]];
                            iArr4[llllllll[1]] = llllllll[7];
                            iArr4[llllllll[0]] = llllllll[8];
                            iArr4[llllllll[5]] = llllllll[9];
                            iArr4[llllllll[10]] = llllllll[11];
                            if (llIlIIlIlIl(C0004e.b(iArr4) ? 1 : 0)) {
                                C0000a.a(llllllll[7], llllllll[12]);
                                C0000a.a(llllllll[8], llllllll[12]);
                                C0000a.a(llllllll[9], llllllll[0]);
                                C0000a.a(llllllll[11], llllllll[13]);
                                C0000a.a(llllllll[14], llllllll[13]);
                            }
                        }
                    }
                }
            }
            int[] iArr5 = new int[llllllll[0]];
            iArr5[llllllll[1]] = llllllll[14];
            if (llIlIIlIlIl(Inventory.contains(iArr5) ? 1 : 0) && llIlIIllIII(Combat.getMissingHealth(), llllllll[15])) {
                int[] iArr6 = new int[llllllll[0]];
                iArr6[llllllll[1]] = llllllll[14];
                Inventory.getFirst(iArr6).interact(llllllIl[llllllll[6]]);
                Time.sleepTicks(llllllll[5]);
                "".length();
            }
            if (llIlIIlIlIl(Inventory.contains(C0005f.bb) ? 1 : 0) && llIlIIlIllI(Movement.getRunEnergy(), llllllll[16])) {
                Inventory.getFirst(C0005f.bb).interact(llllllIl[llllllll[13]]);
                Time.sleepTicks(llllllll[0]);
                "".length();
            }
            if (llIlIIlIllI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[0]) && llIlIIlIlIl(ac() ? 1 : 0) && llIlIIllIIl(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllllll[2])) {
                int[] iArr7 = new int[llllllll[0]];
                iArr7[llllllll[1]] = llllllll[3];
                if (llIlIIlIlll(Inventory.contains(iArr7) ? 1 : 0)) {
                    if (llIlIIlIlll(Players.getLocal().getWorldLocation().equals(cy) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllllIl[llllllll[17]];
                        if (llIlIIlIlIl(Dialog.isOpen() ? 1 : 0) && llIlIIlIllI(cx, llllllll[5])) {
                            Dialog.close();
                            cx += llllllll[0];
                        }
                        C0004e.a(cy);
                    }
                    if (llIlIIlIlIl(Players.getLocal().getWorldLocation().equals(cy) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllllIl[llllllll[18]];
                        C0006g.a(llllllIl[llllllll[2]], bX);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit(llllllll[19]));
            System.out.println("5621: " + Vars.getBit(llllllll[20]));
            System.out.println("5622: " + Vars.getBit(llllllll[21]));
            System.out.println("5623: " + Vars.getBit(llllllll[22]));
            System.out.println("5624: " + Vars.getBit(llllllll[23]));
            if (llIlIIllIIl(Vars.getBit(llllllll[19]), llllllll[0])) {
                cs = llllllll[0];
            }
            if (llIlIIllIIl(Vars.getBit(llllllll[20]), llllllll[0])) {
                ct = llllllll[0];
            }
            if (llIlIIllIIl(Vars.getBit(llllllll[21]), llllllll[0])) {
                cu = llllllll[0];
            }
            if (llIlIIllIIl(Vars.getBit(llllllll[22]), llllllll[0])) {
                cv = llllllll[0];
            }
            if (llIlIIllIIl(Vars.getBit(llllllll[23]), llllllll[0])) {
                cw = llllllll[0];
            }
            if (llIlIIllIIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[0])) {
                ci = llllllll[1];
                if (llIlIIlIlll(cs ? 1 : 0)) {
                    String[] strArr = new String[llllllll[0]];
                    strArr[llllllll[1]] = llllllIl[llllllll[24]];
                    if (llIlIIlIlIl(Inventory.contains(strArr) ? 1 : 0)) {
                        String[] strArr2 = new String[llllllll[0]];
                        strArr2[llllllll[1]] = llllllIl[llllllll[12]];
                        if (llIlIIlIlIl(Inventory.contains(strArr2) ? 1 : 0)) {
                            String[] strArr3 = new String[llllllll[0]];
                            strArr3[llllllll[1]] = llllllIl[llllllll[25]];
                            if (llIlIIlIlll(Inventory.contains(strArr3) ? 1 : 0)) {
                                String[] strArr4 = new String[llllllll[0]];
                                strArr4[llllllll[1]] = llllllIl[llllllll[15]];
                                Item first = Inventory.getFirst(strArr4);
                                String[] strArr5 = new String[llllllll[0]];
                                strArr5[llllllll[1]] = llllllIl[llllllll[26]];
                                first.useOn(Inventory.getFirst(strArr5));
                                Time.sleepTicks(llllllll[5]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr6 = new String[llllllll[0]];
                    strArr6[llllllll[1]] = llllllIl[llllllll[27]];
                    if (llIlIIlIlIl(Inventory.contains(strArr6) ? 1 : 0)) {
                        if (llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cz), llllllll[2])) {
                            AccBuilderBarrows.c = llllllIl[llllllll[28]];
                            Movement.walkTo(cz);
                            "".length();
                            Time.sleepTicks(llllllll[0]);
                            "".length();
                        }
                        if (llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cz), llllllll[2])) {
                            AccBuilderBarrows.c = llllllIl[llllllll[29]];
                            C0006g.a(llllllIl[llllllll[30]], bX, llllllll[0]);
                            Time.sleepTicks(llllllll[0]);
                            "".length();
                            List options = Dialog.getOptions();
                            ArrayList arrayList = new ArrayList();
                            if (llIlIIlIlll(options.isEmpty() ? 1 : 0)) {
                                int i = llllllll[1];
                                while (llIlIIlIllI(i, options.size())) {
                                    arrayList.add(((Widget) options.get(i)).getText());
                                    "".length();
                                    i++;
                                    "".length();
                                    if ((-((106 ^ 102) ^ (87 ^ 95))) > 0) {
                                        return;
                                    }
                                }
                                boolean anyMatch = arrayList.stream().anyMatch(str -> {
                                    return str.equalsIgnoreCase(llllllIl[llllllll[90]]);
                                });
                                boolean noneMatch = arrayList.stream().noneMatch(str2 -> {
                                    return str2.equalsIgnoreCase(llllllIl[llllllll[89]]);
                                });
                                if (llIlIIlIlIl(anyMatch ? 1 : 0) && llIlIIlIlIl(noneMatch ? 1 : 0)) {
                                    System.out.println(llllllIl[llllllll[31]]);
                                }
                            }
                        }
                    }
                }
                if (llIlIIlIlll(ct ? 1 : 0) && llIlIIlIlIl(cs ? 1 : 0)) {
                    if (llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cA), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[32]];
                        Movement.walkTo(cA);
                        "".length();
                        Time.sleepTicks(llllllll[0]);
                        "".length();
                    }
                    if (llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cA), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[33]];
                        C0006g.a(llllllIl[llllllll[34]], bX, llllllll[0]);
                        Time.sleepTicks(llllllll[0]);
                        "".length();
                        List options2 = Dialog.getOptions();
                        ArrayList arrayList2 = new ArrayList();
                        if (llIlIIlIlll(options2.isEmpty() ? 1 : 0)) {
                            int i2 = llllllll[1];
                            while (llIlIIlIllI(i2, options2.size())) {
                                arrayList2.add(((Widget) options2.get(i2)).getText());
                                "".length();
                                i2++;
                                "".length();
                                if (" ".length() > "  ".length()) {
                                    return;
                                }
                            }
                            boolean anyMatch2 = arrayList2.stream().anyMatch(str3 -> {
                                return str3.equalsIgnoreCase(llllllIl[llllllll[88]]);
                            });
                            boolean noneMatch2 = arrayList2.stream().noneMatch(str4 -> {
                                return str4.equalsIgnoreCase(llllllIl[llllllll[87]]);
                            });
                            if (llIlIIlIlIl(anyMatch2 ? 1 : 0) && llIlIIlIlIl(noneMatch2 ? 1 : 0)) {
                                System.out.println(llllllIl[llllllll[35]]);
                            }
                        }
                    }
                }
                if (llIlIIlIlll(cu ? 1 : 0) && llIlIIlIlIl(ct ? 1 : 0) && llIlIIlIlIl(cs ? 1 : 0)) {
                    if (llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cB), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[36]];
                        Movement.walkTo(cB);
                        "".length();
                        Time.sleepTicks(llllllll[0]);
                        "".length();
                    }
                    if (llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cB), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[37]];
                        C0006g.a(llllllIl[llllllll[38]], bX, llllllll[0]);
                        Time.sleepTicks(llllllll[0]);
                        "".length();
                        List options3 = Dialog.getOptions();
                        ArrayList arrayList3 = new ArrayList();
                        if (llIlIIlIlll(options3.isEmpty() ? 1 : 0)) {
                            int i3 = llllllll[1];
                            while (llIlIIlIllI(i3, options3.size())) {
                                arrayList3.add(((Widget) options3.get(i3)).getText());
                                "".length();
                                i3++;
                                "".length();
                                if ("   ".length() >= (" ".length() ^ (79 ^ 74))) {
                                    return;
                                }
                            }
                            boolean anyMatch3 = arrayList3.stream().anyMatch(str5 -> {
                                return str5.equalsIgnoreCase(llllllIl[llllllll[86]]);
                            });
                            boolean noneMatch3 = arrayList3.stream().noneMatch(str6 -> {
                                return str6.equalsIgnoreCase(llllllIl[llllllll[85]]);
                            });
                            if (llIlIIlIlIl(anyMatch3 ? 1 : 0) && llIlIIlIlIl(noneMatch3 ? 1 : 0)) {
                                System.out.println(llllllIl[llllllll[39]]);
                            }
                        }
                    }
                }
                if (llIlIIlIlll(cv ? 1 : 0) && llIlIIlIlIl(cu ? 1 : 0) && llIlIIlIlIl(ct ? 1 : 0) && llIlIIlIlIl(cs ? 1 : 0)) {
                    if (llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cC), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[40]];
                        Movement.walkTo(cC);
                        "".length();
                        Time.sleepTicks(llllllll[0]);
                        "".length();
                    }
                    if (llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cC), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[41]];
                        C0006g.a(llllllIl[llllllll[42]], bX, llllllll[0]);
                        Time.sleepTicks(llllllll[0]);
                        "".length();
                        List options4 = Dialog.getOptions();
                        ArrayList arrayList4 = new ArrayList();
                        if (llIlIIlIlll(options4.isEmpty() ? 1 : 0)) {
                            int i4 = llllllll[1];
                            while (llIlIIlIllI(i4, options4.size())) {
                                arrayList4.add(((Widget) options4.get(i4)).getText());
                                "".length();
                                i4++;
                                "".length();
                                if ((5 ^ 1) <= 0) {
                                    return;
                                }
                            }
                            boolean anyMatch4 = arrayList4.stream().anyMatch(str7 -> {
                                return str7.equalsIgnoreCase(llllllIl[llllllll[84]]);
                            });
                            boolean noneMatch4 = arrayList4.stream().noneMatch(str8 -> {
                                return str8.equalsIgnoreCase(llllllIl[llllllll[83]]);
                            });
                            if (llIlIIlIlIl(anyMatch4 ? 1 : 0) && llIlIIlIlIl(noneMatch4 ? 1 : 0)) {
                                System.out.println(llllllIl[llllllll[43]]);
                            }
                        }
                    }
                }
                if (llIlIIlIlll(cw ? 1 : 0) && llIlIIlIlIl(cv ? 1 : 0) && llIlIIlIlIl(cu ? 1 : 0) && llIlIIlIlIl(ct ? 1 : 0) && llIlIIlIlIl(cs ? 1 : 0)) {
                    if (llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cD), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[44]];
                        Movement.walkTo(cD);
                        "".length();
                        Time.sleepTicks(llllllll[0]);
                        "".length();
                    }
                    if (llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cD), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[45]];
                        C0006g.a(llllllIl[llllllll[46]], bX, llllllll[0]);
                        Time.sleepTicks(llllllll[0]);
                        "".length();
                        List options5 = Dialog.getOptions();
                        ArrayList arrayList5 = new ArrayList();
                        if (llIlIIlIlll(options5.isEmpty() ? 1 : 0)) {
                            int i5 = llllllll[1];
                            while (llIlIIlIllI(i5, options5.size())) {
                                arrayList5.add(((Widget) options5.get(i5)).getText());
                                "".length();
                                i5++;
                                "".length();
                                if ((true ^ true) & ((true ^ true) ^ true)) {
                                    return;
                                }
                            }
                            boolean anyMatch5 = arrayList5.stream().anyMatch(str9 -> {
                                return str9.equalsIgnoreCase(llllllIl[llllllll[16]]);
                            });
                            boolean anyMatch6 = arrayList5.stream().anyMatch(str10 -> {
                                return str10.contains(llllllIl[llllllll[82]]);
                            });
                            boolean noneMatch5 = arrayList5.stream().noneMatch(str11 -> {
                                return str11.equalsIgnoreCase(llllllIl[llllllll[81]]);
                            });
                            if ((!llIlIIlIlll(anyMatch5 ? 1 : 0) || llIlIIlIlIl(anyMatch6 ? 1 : 0)) && llIlIIlIlIl(noneMatch5 ? 1 : 0)) {
                                System.out.println(llllllIl[llllllll[47]]);
                            }
                        }
                    }
                }
            }
            if (llIlIIllIIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[5])) {
                if (llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cy), llllllll[5])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[48]];
                    if (llIlIIlIlIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0004e.a(cy);
                }
                if (llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cy), llllllll[5])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[49]];
                    C0006g.a(llllllIl[llllllll[50]], bX);
                }
            }
            if (!llIlIIllllI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[10]) || llIlIIllIIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[17])) {
                C0006g.a(bX);
            }
            if (llIlIIllIIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[6])) {
                if (llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cE), llllllll[6])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[51]];
                    Movement.walkTo(cE);
                    "".length();
                    Time.sleepTicks(llllllll[0]);
                    "".length();
                }
                if (llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cE), llllllll[6])) {
                    String[] strArr7 = new String[llllllll[0]];
                    strArr7[llllllll[1]] = llllllIl[llllllll[52]];
                    if (llIlIIlIlIl(Inventory.contains(strArr7) ? 1 : 0)) {
                        String[] strArr8 = new String[llllllll[0]];
                        strArr8[llllllll[1]] = llllllIl[llllllll[53]];
                        Inventory.getFirst(strArr8).interact(llllllIl[llllllll[54]]);
                        Time.sleepTicks(llllllll[10]);
                        "".length();
                    }
                }
            }
            if (llIlIIllIIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[13])) {
                if (llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cy), llllllll[5])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[55]];
                    C0004e.a(cy);
                }
                if (llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cy), llllllll[5])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[56]];
                    C0006g.a(llllllIl[llllllll[57]], bX);
                }
            }
            if (!llIlIIllllI(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[18]) || llIlIIllIIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[2])) {
                if (llIlIIlIllI(ci, llllllll[0])) {
                    Q.lJ += llllllll[0];
                    Q.o(AccBuilderBarrows.m);
                    ci += llllllll[0];
                    Q.lJ = llllllll[1];
                    cj = llllllll[1];
                }
                String[] strArr9 = new String[llllllll[0]];
                strArr9[llllllll[1]] = llllllIl[llllllll[58]];
                if (llIlIIlIlIl(Inventory.contains(strArr9) ? 1 : 0)) {
                    if (llIlIIllIlI(Widgets.get(llllllll[59]))) {
                        AccBuilderBarrows.c = llllllIl[llllllll[60]];
                        String[] strArr10 = new String[llllllll[0]];
                        strArr10[llllllll[1]] = llllllIl[llllllll[61]];
                        Inventory.getFirst(strArr10).interact(llllllIl[llllllll[62]]);
                        Time.sleepTicks(llllllll[6]);
                        "".length();
                        AccBuilderBarrows.c = llllllIl[llllllll[63]];
                        Widget widget = Widgets.get(llllllll[59], llllllll[27]);
                        if (llIlIIllIlI(widget)) {
                            widget.interact(llllllIl[llllllll[64]]);
                            Time.sleepTicks(llllllll[0]);
                            "".length();
                        }
                        Widget widget2 = Widgets.get(llllllll[59], llllllll[39]);
                        if (llIlIIllIlI(widget2)) {
                            widget2.interact(llllllIl[llllllll[65]]);
                            Time.sleepTicks(llllllll[5]);
                            "".length();
                        }
                    }
                    Time.sleepTicks(llllllll[0]);
                    "".length();
                }
            }
        }
    }
}
