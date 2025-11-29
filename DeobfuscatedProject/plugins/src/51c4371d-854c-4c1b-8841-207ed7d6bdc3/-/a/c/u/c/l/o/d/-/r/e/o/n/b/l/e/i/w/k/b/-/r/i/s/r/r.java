/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r;

import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.E;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.F;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.Q;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.a;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.b;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.d;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.e;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.f;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.g;
import -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.i;
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

public class r
implements F {
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
    public static /* synthetic */ List<d> bB;
    private static /* synthetic */ WorldPoint cA;
    public static /* synthetic */ boolean cu;
    static /* synthetic */ int ci;
    static /* synthetic */ int cx;
    public static /* synthetic */ boolean cw;
    private static /* synthetic */ WorldPoint cy;
    private static /* synthetic */ WorldPoint cB;
    public static /* synthetic */ boolean cv;
    private static /* synthetic */ WorldPoint cE;

    private static boolean llIlIIlIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIIllllI(int n2, int n3) {
        return n2 != n3;
    }

    static {
        r.llIlIIlIlII();
        r.llIlIIlIIll();
        bB = new ArrayList<d>();
        cx = llllllll[1];
        cy = new WorldPoint(llllllll[91], llllllll[92], llllllll[1]);
        cz = new WorldPoint(llllllll[93], llllllll[94], llllllll[1]);
        cA = new WorldPoint(llllllll[95], llllllll[96], llllllll[1]);
        cB = new WorldPoint(llllllll[97], llllllll[98], llllllll[1]);
        cC = new WorldPoint(llllllll[99], llllllll[100], llllllll[1]);
        cD = new WorldPoint(llllllll[101], llllllll[102], llllllll[1]);
        cE = new WorldPoint(llllllll[103], llllllll[104], llllllll[1]);
        String[] stringArray = new String[llllllll[33]];
        stringArray[r.llllllll[1]] = llllllIl[llllllll[105]];
        stringArray[r.llllllll[0]] = llllllIl[llllllll[106]];
        stringArray[r.llllllll[5]] = llllllIl[llllllll[107]];
        stringArray[r.llllllll[10]] = llllllIl[llllllll[108]];
        stringArray[r.llllllll[6]] = llllllIl[llllllll[109]];
        stringArray[r.llllllll[13]] = llllllIl[llllllll[110]];
        stringArray[r.llllllll[17]] = llllllIl[llllllll[111]];
        stringArray[r.llllllll[18]] = llllllIl[llllllll[112]];
        stringArray[r.llllllll[2]] = llllllIl[llllllll[113]];
        stringArray[r.llllllll[24]] = llllllIl[llllllll[114]];
        stringArray[r.llllllll[12]] = llllllIl[llllllll[115]];
        stringArray[r.llllllll[25]] = llllllIl[llllllll[116]];
        stringArray[r.llllllll[15]] = llllllIl[llllllll[117]];
        stringArray[r.llllllll[26]] = llllllIl[llllllll[118]];
        stringArray[r.llllllll[27]] = llllllIl[llllllll[119]];
        stringArray[r.llllllll[28]] = llllllIl[llllllll[120]];
        stringArray[r.llllllll[29]] = llllllIl[llllllll[121]];
        stringArray[r.llllllll[30]] = llllllIl[llllllll[122]];
        stringArray[r.llllllll[31]] = llllllIl[llllllll[123]];
        stringArray[r.llllllll[32]] = llllllIl[llllllll[124]];
        bX = stringArray;
    }

    private static boolean llIlIIllIlI(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ac() {
        int n2;
        String[] stringArray = new String[llllllll[0]];
        stringArray[r.llllllll[1]] = llllllIl[llllllll[73]];
        if (r.llIlIIllIll(Inventory.getCount((String[])stringArray))) {
            int[] nArray = new int[llllllll[0]];
            nArray[r.llllllll[1]] = llllllll[7];
            if (r.llIlIIllIll(Inventory.getCount((int[])nArray)) && r.llIlIIllIll(Inventory.getCount((int[])f.bb))) {
                int[] nArray2 = new int[llllllll[0]];
                nArray2[r.llllllll[1]] = llllllll[8];
                if (r.llIlIIllIll(Inventory.getCount((int[])nArray2))) {
                    n2 = llllllll[0];
                    "".length();
                    if (null == null) return n2 != 0;
                    return ((0x74 ^ 0x33) & ~(0x70 ^ 0x37)) != 0;
                }
            }
        }
        n2 = llllllll[1];
        return n2 != 0;
    }

    private static String llIlIIlIIII(String lIIllIIIIIlIlII, String lIIllIIIIIlIIll) {
        try {
            SecretKeySpec lIIllIIIIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIIIIlIIll.getBytes(StandardCharsets.UTF_8)), llllllll[2]), "DES");
            Cipher lIIllIIIIIllIII = Cipher.getInstance("DES");
            lIIllIIIIIllIII.init(llllllll[5], lIIllIIIIIllIIl);
            return new String(lIIllIIIIIllIII.doFinal(Base64.getDecoder().decode(lIIllIIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIllIIIIIlIlll) {
            lIIllIIIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIllIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void ag() {
        d lIIllIIIIlIIIII;
        Object lIIllIIIIlIIIIl;
        int[] nArray = new int[llllllll[0]];
        nArray[r.llllllll[1]] = llllllll[9];
        if (r.llIlIIlIlll(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llllllll[9], llllllll[12], llllllll[74]);
            bB.add(d2);
            "".length();
        }
        int[] nArray2 = new int[llllllll[0]];
        nArray2[r.llllllll[1]] = llllllll[11];
        if (r.llIlIIlIlll(Bank.contains((int[])nArray2) ? 1 : 0)) {
            lIIllIIIIlIIIIl = new d(llllllll[11], llllllll[13], i.bw);
            bB.add((d)lIIllIIIIlIIIIl);
            "".length();
        }
        if (r.llIlIIlIlll(Bank.contains(lIIllIIIIlIIIIl = item -> item.getName().toLowerCase().contains(llllllIl[llllllll[80]])) ? 1 : 0)) {
            lIIllIIIIlIIIII = new d(llllllll[75], llllllll[13], llllllll[76]);
            bB.add(lIIllIIIIlIIIII);
            "".length();
        }
        int[] nArray3 = new int[llllllll[0]];
        nArray3[r.llllllll[1]] = llllllll[7];
        if (r.llIlIIlIlll(Bank.contains((int[])nArray3) ? 1 : 0)) {
            lIIllIIIIlIIIII = new d(llllllll[7], llllllll[53], llllllll[74]);
            bB.add(lIIllIIIIlIIIII);
            "".length();
        }
        int[] nArray4 = new int[llllllll[0]];
        nArray4[r.llllllll[1]] = llllllll[8];
        if (r.llIlIIlIlll(Bank.contains((int[])nArray4) ? 1 : 0)) {
            lIIllIIIIlIIIII = new d(llllllll[8], llllllll[12], llllllll[74]);
            bB.add(lIIllIIIIlIIIII);
            "".length();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean W() {
        int n2;
        if (r.llIlIIllIII(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[24])) {
            String[] stringArray = new String[llllllll[0]];
            stringArray[r.llllllll[1]] = llllllIl[llllllll[79]];
            if (r.llIlIIlIlll(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                n2 = llllllll[0];
                "".length();
                if ((0x47 ^ 0x13 ^ (0x55 ^ 5)) >= " ".length()) return n2 != 0;
                return ((0xF6 ^ 0x80 ^ (0x3A ^ 0x7D)) & (0xE3 ^ 0xC2 ^ (0xBE ^ 0xAE) ^ -" ".length())) != 0;
            }
        }
        n2 = llllllll[1];
        return n2 != 0;
    }

    public static void aG() {
        String[] stringArray = new String[llllllll[0]];
        stringArray[r.llllllll[1]] = llllllIl[llllllll[66]];
        if (r.llIlIIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            if (r.llIlIIllIlI(Widgets.get((int)llllllll[59]))) {
                Widget lIIllIIIIlIIlII;
                AccBuilderBarrows.c = llllllIl[llllllll[67]];
                String[] stringArray2 = new String[llllllll[0]];
                stringArray2[r.llllllll[1]] = llllllIl[llllllll[68]];
                Inventory.getFirst((String[])stringArray2).interact(llllllIl[llllllll[69]]);
                Time.sleepTicks((int)llllllll[6]);
                "".length();
                AccBuilderBarrows.c = llllllIl[llllllll[70]];
                Widget widget = Widgets.get((int)llllllll[59], (int)llllllll[27]);
                if (r.llIlIIllIlI(widget)) {
                    widget.interact(llllllIl[llllllll[71]]);
                    Time.sleepTicks((int)llllllll[0]);
                    "".length();
                }
                if (r.llIlIIllIlI(lIIllIIIIlIIlII = Widgets.get((int)llllllll[59], (int)llllllll[39]))) {
                    lIIllIIIIlIIlII.interact(llllllIl[llllllll[72]]);
                    Time.sleepTicks((int)llllllll[5]);
                    "".length();
                }
            }
            Time.sleepTicks((int)llllllll[0]);
            "".length();
        }
    }

    private static void llIlIIlIIll() {
        llllllIl = new String[llllllll[125]];
        r.llllllIl[r.llllllll[1]] = r.llIlIIIllll("oiGe1rTTLbSckDUjGVPoQKqQtpVGswVq5bQQkdql+bbp631rEQn43Un/GAVix6Sf", "GLTXB");
        r.llllllIl[r.llllllll[0]] = r.llIlIIlIIII("bWSza6yJ7PsJJuaL8ic41Q==", "wSNlm");
        r.llllllIl[r.llllllll[5]] = r.llIlIIIllll("Sjd1HCRJc1yGPYrEO8e3eTdzMOAc5Lxu", "ktgHh");
        r.llllllIl[r.llllllll[10]] = r.llIlIIIllll("50hTLy0fXgcuX5mkuIHFhPo4H+Uji/t1UcRnyPBusAfUjUqWeOcQvH6Y2Ar47O3b6tpnVgmbpn8=", "WgasF");
        r.llllllIl[r.llllllll[6]] = r.llIlIIIllll("nGnRrR+u6kk=", "nTFba");
        r.llllllIl[r.llllllll[13]] = r.llIlIIlIIIl("IiYYJzs=", "fTqIP");
        r.llllllIl[r.llllllll[17]] = r.llIlIIlIIIl("BSw6RjckbT8SIjk5", "KMLfC");
        r.llllllIl[r.llllllll[18]] = r.llIlIIlIIII("yrNBzNKxcgUCCJy3X1uymw==", "ekyMa");
        r.llllllIl[r.llllllll[2]] = r.llIlIIlIIIl("LgMsHg==", "xfCmS");
        r.llllllIl[r.llllllll[24]] = r.llIlIIlIIII("WP9uvpWrzj7vonEjS0cQRAp200hyZZNj", "vzFvN");
        r.llllllIl[r.llllllll[12]] = r.llIlIIlIIII("uTfApTUMVx4=", "wKemX");
        r.llllllIl[r.llllllll[25]] = r.llIlIIlIIIl("LjgpOhQFIi82VRojIz4Z", "kVJRu");
        r.llllllIl[r.llllllll[15]] = r.llIlIIlIIII("cODp9UtlhQqCW3bMm60eyHkGfTGgIVkZ", "fiTBW");
        r.llllllIl[r.llllllll[26]] = r.llIlIIIllll("XyC+3LEhJNo=", "ZqNmO");
        r.llllllIl[r.llllllll[27]] = r.llIlIIlIIIl("Ih8NDzYJBQsDdxYEBws7", "gqngW");
        r.llllllIl[r.llllllll[28]] = r.llIlIIlIIII("veQ6Da6BRuQR7VT84vGNm6lhsmaaoLWr", "eImth");
        r.llllllIl[r.llllllll[29]] = r.llIlIIlIIIl("JiQ6PhEcInYlEQEm", "rEVUx");
        r.llllllIl[r.llllllll[30]] = r.llIlIIlIIII("D/PdxXjdfGk=", "gAgwN");
        r.llllllIl[r.llllllll[31]] = r.llIlIIlIIIl("Ngw/MBcYADV5FBkWMg==", "peQYd");
        r.llllllIl[r.llllllll[32]] = r.llIlIIlIIIl("OxUYVR0aVA8HClUABxkM", "utnui");
        r.llllllIl[r.llllllll[33]] = r.llIlIIlIIIl("PwsFGiQFDUkQPwg=", "kjiqM");
        r.llllllIl[r.llllllll[34]] = r.llIlIIlIIIl("PQwqNw4H", "oiMVz");
        r.llllllIl[r.llllllll[35]] = r.llIlIIlIIII("rIpS676fwybHUO47d5VLpg==", "AWoDw");
        r.llllllIl[r.llllllll[36]] = r.llIlIIIllll("8TZKtjzGNCnE4/vVsaP/JV9wyEECQGMQ", "TNZLz");
        r.llllllIl[r.llllllll[37]] = r.llIlIIIllll("lqJ+jwxt+3gxec2PqzGHGQ==", "RIXEv");
        r.llllllIl[r.llllllll[38]] = r.llIlIIlIIII("DoasYq3iPmM=", "nRIcy");
        r.llllllIl[r.llllllll[39]] = r.llIlIIIllll("H7DgDoT4f6e9+Ln97KgCVQ==", "rMGkK");
        r.llllllIl[r.llllllll[40]] = r.llIlIIlIIII("0iDPEXGRVAqgQ7CnD9qpEBJlhEKn2Wy4", "yOcDB");
        r.llllllIl[r.llllllll[41]] = r.llIlIIlIIIl("ERIqOgQrFGYiBTwJLzQD", "EsFQm");
        r.llllllIl[r.llllllll[42]] = r.llIlIIlIIII("rfdZimAEFGpFt9iE8X3fHQ==", "FHeOt");
        r.llllllIl[r.llllllll[43]] = r.llIlIIlIIII("Hs9TPAv/y8PVAUJjQXVDGTVgQXa0PKzU", "YXFvS");
        r.llllllIl[r.llllllll[44]] = r.llIlIIlIIII("1r2hl+oCJErBpot1VcQR+3+Srk0XfBjS", "BqsMa");
        r.llllllIl[r.llllllll[45]] = r.llIlIIIllll("Fd9fcO3IzB1g+R4Xy0celvhKxc9AfhKB", "FvEgU");
        r.llllllIl[r.llllllll[46]] = r.llIlIIlIIII("CnT/o5AbMpA=", "qDoCn");
        r.llllllIl[r.llllllll[47]] = r.llIlIIIllll("wdLY/LVVepcCcB+yIxT8x7fhK8pCH0vp", "ahFOO");
        r.llllllIl[r.llllllll[48]] = r.llIlIIIllll("tYndFgsw3qk28iPDI/t7kw==", "iKozi");
        r.llllllIl[r.llllllll[49]] = r.llIlIIlIIII("16x1fj5C65bltuDnNPK9gQ==", "gugOP");
        r.llllllIl[r.llllllll[50]] = r.llIlIIIllll("hyAAJx+uyp4=", "oEtAN");
        r.llllllIl[r.llllllll[51]] = r.llIlIIIllll("jTvXg50JjXc9Qm/3H2qteZP7DUIVSnqt", "KcNqY");
        r.llllllIl[r.llllllll[52]] = r.llIlIIlIIII("XnAD61aoRTh7mfolULSpFw==", "rwTlB");
        r.llllllIl[r.llllllll[53]] = r.llIlIIlIIIl("DCEHNhwzMRs3CmE3BiA=", "AXtBy");
        r.llllllIl[r.llllllll[54]] = r.llIlIIIllll("czSFoIgMdAgItv7qxf6vAQ==", "gheRj");
        r.llllllIl[r.llllllll[55]] = r.llIlIIlIIII("lIb1glkVVk9eqGesjDAGZA==", "bCEaT");
        r.llllllIl[r.llllllll[56]] = r.llIlIIlIIIl("BSYGOhkfIEonFR40", "qGjQp");
        r.llllllIl[r.llllllll[57]] = r.llIlIIIllll("Hdn/mEK1g0Y=", "yNYIp");
        r.llllllIl[r.llllllll[58]] = r.llIlIIlIIIl("EikwIQAmImQkED43", "SGDHq");
        r.llllllIl[r.llllllll[60]] = r.llIlIIIllll("uDc6Bp2Ylq74scQjfIg08Q==", "yPIqZ");
        r.llllllIl[r.llllllll[61]] = r.llIlIIIllll("jTcFcSrQN5xmgPtcd4KZXg==", "LuhAv");
        r.llllllIl[r.llllllll[62]] = r.llIlIIlIIIl("HgUy", "LpPuf");
        r.llllllIl[r.llllllll[63]] = r.llIlIIIllll("/hyjm9biBh3D/112nRmicbhzq0fdbLES", "fLxtH");
        r.llllllIl[r.llllllll[64]] = r.llIlIIIllll("KrpgdtfGwhc=", "bDIEr");
        r.llllllIl[r.llllllll[65]] = r.llIlIIIllll("lBeNR99Sx7E=", "AWMBl");
        r.llllllIl[r.llllllll[66]] = r.llIlIIlIIII("/Ji4TcjJHFFNw92cjqvmiw==", "XiTXi");
        r.llllllIl[r.llllllll[67]] = r.llIlIIlIIIl("MxM6IwEPAXgtCQwW", "afXAh");
        r.llllllIl[r.llllllll[68]] = r.llIlIIlIIIl("MBQzPD0EH2c5LRwK", "qzGUL");
        r.llllllIl[r.llllllll[69]] = r.llIlIIIllll("ek/84+K6Oj0=", "WWjEu");
        r.llllllIl[r.llllllll[70]] = r.llIlIIlIIIl("Nxc9Dy4QGz8NbRceMBMoFg==", "drQjM");
        r.llllllIl[r.llllllll[71]] = r.llIlIIlIIIl("FwMFFSI2", "DodlG");
        r.llllllIl[r.llllllll[72]] = r.llIlIIIllll("7IUGnWBceQM=", "hOBlQ");
        r.llllllIl[r.llllllll[73]] = r.llIlIIlIIII("6WCl+n2f8pE=", "esJyE");
        r.llllllIl[r.llllllll[78]] = r.llIlIIIllll("sSA+GMRh+jUpqkrY2S98K4QlNjRhAoFB", "xXZOF");
        r.llllllIl[r.llllllll[79]] = r.llIlIIlIIIl("GCozHxQsIWcaBDQ0", "YDGve");
        r.llllllIl[r.llllllll[80]] = r.llIlIIlIIIl("OQclLmYkCGs+IyoCPyFmYw==", "KnKIF");
        r.llllllIl[r.llllllll[81]] = r.llIlIIlIIIl("LS45cBpOLiQ7cxcgInAyDCAiJHMmICQ5Nwc6JG8=", "nOWPS");
        r.llllllIl[r.llllllll[82]] = r.llIlIIlIIII("KCVUMWHYQtZ83/Ajlv0wbw==", "ZUWZq");
        r.llllllIl[r.llllllll[16]] = r.llIlIIlIIII("t406c/HD8NfMVEG63Ig1Qw==", "JHqFJ");
        r.llllllIl[r.llllllll[83]] = r.llIlIIlIIIl("FSA2UhB2ICsZeS8uLVI4NC4tBnkFKTkLIz8kNk0=", "VAXrY");
        r.llllllIl[r.llllllll[84]] = r.llIlIIlIIIl("KhYdbTlGBxsrLgNd", "fsiJJ");
        r.llllllIl[r.llllllll[85]] = r.llIlIIlIIII("gyBeesGvJBAjddREsZcdlw8Hh5g3NAs3/6bjGecRgk0=", "ezUgA");
        r.llllllIl[r.llllllll[86]] = r.llIlIIlIIIl("CAkeUyZkGBgVMSFC", "DljtU");
        r.llllllIl[r.llllllll[87]] = r.llIlIIIllll("/CTqRrNg+36hjDdCx7mOJj4d6bfgYWXqc1KkBQ7JLD0=", "TxnGn");
        r.llllllIl[r.llllllll[88]] = r.llIlIIlIIIl("H0gxNRlxHHU0EjMMdTsZLxw9MxkxRg==", "VhUZw");
        r.llllllIl[r.llllllll[89]] = r.llIlIIIllll("O9nNpepj41bnQ1G0aKc4wHeB7rtK8FyT89VwcSdHwsQ+9zhG1t40YA==", "FNKVS");
        r.llllllIl[r.llllllll[90]] = r.llIlIIlIIII("hhoZIeO7rfOWlJyyfMmS+ticUEmsMY40ll11PuVgZGHVBAJUNZ8+6g==", "tvDWx");
        r.llllllIl[r.llllllll[105]] = r.llIlIIlIIIl("CjYdJnM7OB5jNC0jSyI9O3caNjYxIxhjNS0lSy42fQ==", "BWkCS");
        r.llllllIl[r.llllllll[106]] = r.llIlIIlIIII("qi5spJwvThk=", "EWygf");
        r.llllllIl[r.llllllll[107]] = r.llIlIIlIIII("WZHmSlbnpJQ=", "qapbT");
        r.llllllIl[r.llllllll[108]] = r.llIlIIlIIIl("LQMHdBxOAxo/dRcNHHQ0DA0cIHU+DRsgdT4LGjc0HAsFPSAdXQ==", "nbiTU");
        r.llllllIl[r.llllllll[109]] = r.llIlIIIllll("Cny2q7g5CQtuHqeNGTQUmsjSDIPOXzSBWlWoc92oTpMFsmzJRu716hzERSyuBGix", "iYzGA");
        r.llllllIl[r.llllllll[110]] = r.llIlIIlIIII("cP2TwEpkJ/MhFHJoEQDmcv7u/QmGl2511RDvC1rc+o1cO9DwD7x46g==", "BLXJS");
        r.llllllIl[r.llllllll[111]] = r.llIlIIIllll("V+WsL6a69yyVEOmGTRzzhKZCpqHZmAVXAQDya6sIE10=", "FeQnc");
        r.llllllIl[r.llllllll[112]] = r.llIlIIlIIII("wq1tkJJfVTuSa/coB1MxqpejNOs6Eu9V0ev9SuPTWGDAc8doyJpZeA==", "LiEef");
        r.llllllIl[r.llllllll[113]] = r.llIlIIIllll("+8unvRIf5wwvbrGl39SHgGUwB3aOhEQOnN1j76Qs/zU=", "uzLqx");
        r.llllllIl[r.llllllll[114]] = r.llIlIIIllll("e92G7u/x+w4FZFZFfsFPw/az4zBzndKk9Zv8CJhCgEQqb4ivEsVPJL2sXfEgZNJV", "uhpAP");
        r.llllllIl[r.llllllll[115]] = r.llIlIIlIIII("KYznsTZ54Xh4KiQEAwtMm3QaIoB+tAKQRcDiiJnECFs=", "GwdpB");
        r.llllllIl[r.llllllll[116]] = r.llIlIIIllll("ptWBUJw7aOphv6GLM5C3oex4vCTuTXiiHHOhpLc3swEpPat6rZebCg==", "AXHdr");
        r.llllllIl[r.llllllll[117]] = r.llIlIIlIIIl("By4mTxxkLjsEdT0gPU80JiA9G3UMIDsGMS06O1A=", "DOHoU");
        r.llllllIl[r.llllllll[118]] = r.llIlIIIllll("25fHSVLh/jKkzX2hqJcsZRYqlWvc3/D3dIlSy1GOmRXKYLmni38KTg==", "TbXGX");
        r.llllllIl[r.llllllll[119]] = r.llIlIIlIIII("uIWgrLQWWTP6uXl+BWW5t5/CxoGwkvIcHhfTQYsK5nBEJ83Hz9SLovxw8812Cfh6", "qznvU");
        r.llllllIl[r.llllllll[120]] = r.llIlIIlIIII("A06Xd9eSuTAxFXFgKpOQnpN+eWMLw5ruAkyH6/j7Vc4=", "WaiZW");
        r.llllllIl[r.llllllll[121]] = r.llIlIIlIIIl("IhEiG04cCmMbBhALJk8aGlknAE4cF2MjAQMYKAoAEhN8", "uyCon");
        r.llllllIl[r.llllllll[122]] = r.llIlIIlIIIl("EzopE0ktIWgTASEgLUcdK3IsCEktPGg0ASUrMg4MKm0=", "DRHgi");
        r.llllllIl[r.llllllll[123]] = r.llIlIIlIIII("8glFZXJfDk1ZXkA2Mq4wuikSfGALsBvI/roQMYGvhSmI4uuB95ld6g==", "lIYed");
        r.llllllIl[r.llllllll[124]] = r.llIlIIlIIIl("Fg8Ncgt6Hhg5E3oLGzoNLkoAOg0oSho5ET8EDXtWdA==", "ZjyUx");
    }

    private static boolean llIlIIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void llIlIIlIlII() {
        llllllll = new int[126];
        r.llllllll[0] = " ".length();
        r.llllllll[1] = (0xA9 ^ 0x8B) & ~(0x5A ^ 0x78);
        r.llllllll[2] = 0x41 ^ 0x14 ^ (0x1F ^ 0x42);
        r.llllllll[3] = 0xFFFFDAB7 & 0x7F68;
        r.llllllll[4] = -(0xFFFFD9DE & 0x2E35) & (0xFFFF9FDB & 0x7BBF);
        r.llllllll[5] = "  ".length();
        r.llllllll[6] = 80 + 166 - 144 + 68 ^ 46 + 132 - 164 + 160;
        r.llllllll[7] = 0xFFFFFF7F & 0x1FC7;
        r.llllllll[8] = 0xFFFFBF6B & 0x5FDD;
        r.llllllll[9] = -(0xFFFFD3F6 & 0x3E8F) & (0xFFFFB7FF & 0x5BBF);
        r.llllllll[10] = "   ".length();
        r.llllllll[11] = 0xFFFFF57B & 0x3BD5;
        r.llllllll[12] = 104 + 131 - 88 + 57 ^ 16 + 129 - 15 + 68;
        r.llllllll[13] = 0x97 ^ 0x92;
        r.llllllll[14] = -(0xFFFFD6C3 & 0x69BD) & (0xFFFFF7FB & 0x49FF);
        r.llllllll[15] = 5 ^ 0x5D ^ (0x15 ^ 0x41);
        r.llllllll[16] = 0x53 ^ 0x12;
        r.llllllll[17] = 0xAB ^ 0xAD;
        r.llllllll[18] = 0x2E ^ 0x29;
        r.llllllll[19] = -(0xFFFFBF61 & 0x489F) & (0xFFFFBDFF & 0x5FF4);
        r.llllllll[20] = -(0xFFFFBA33 & 0x65CF) & (0xFFFFBDF7 & 0x77FF);
        r.llllllll[21] = 0xFFFFBDFF & 0x57F6;
        r.llllllll[22] = 0xFFFFDFFF & 0x35F7;
        r.llllllll[23] = 0xFFFF9DFF & 0x77F8;
        r.llllllll[24] = 0x78 ^ 0xC ^ (0x14 ^ 0x69);
        r.llllllll[25] = 0x7D ^ 6 ^ (0x30 ^ 0x40);
        r.llllllll[26] = 0x67 ^ 0x25 ^ (0x70 ^ 0x3F);
        r.llllllll[27] = 165 + 13 - 68 + 62 ^ 34 + 77 - -44 + 7;
        r.llllllll[28] = 0x15 ^ 0x54 ^ (0x30 ^ 0x7E);
        r.llllllll[29] = 0x39 ^ 0x29;
        r.llllllll[30] = 113 + 123 - 163 + 138 ^ 126 + 29 - 107 + 146;
        r.llllllll[31] = 92 + 74 - 146 + 124 ^ 50 + 85 - 117 + 112;
        r.llllllll[32] = 0x7C ^ 6 ^ (0xD7 ^ 0xBE);
        r.llllllll[33] = 0x8F ^ 0x9B;
        r.llllllll[34] = 0xB2 ^ 0x99 ^ (0x60 ^ 0x5E);
        r.llllllll[35] = 0x37 ^ 0x25 ^ (0xA4 ^ 0xA0);
        r.llllllll[36] = 131 + 6 - 133 + 146 ^ 59 + 43 - 0 + 27;
        r.llllllll[37] = 0xC1 ^ 0xB5 ^ (0xF8 ^ 0x94);
        r.llllllll[38] = 2 ^ 0x1B;
        r.llllllll[39] = 110 + 62 - 31 + 26 ^ 60 + 13 - -12 + 104;
        r.llllllll[40] = 0x56 ^ 0x4D;
        r.llllllll[41] = 6 ^ 0x1A;
        r.llllllll[42] = 0x4C ^ 1 ^ (0x62 ^ 0x32);
        r.llllllll[43] = 0x5B ^ 0x45;
        r.llllllll[44] = 0xA9 ^ 0xB6;
        r.llllllll[45] = 0x69 ^ 0x49;
        r.llllllll[46] = 0x3E ^ 0x1F;
        r.llllllll[47] = 0x9C ^ 0xBE;
        r.llllllll[48] = 0x54 ^ 0x77;
        r.llllllll[49] = 0x75 ^ 0x41 ^ (0x97 ^ 0x87);
        r.llllllll[50] = 0x89 ^ 0xAC;
        r.llllllll[51] = 0x32 ^ 0x14;
        r.llllllll[52] = 0x24 ^ 0 ^ "   ".length();
        r.llllllll[53] = 15 + 2 - -79 + 39 ^ 44 + 79 - -32 + 20;
        r.llllllll[54] = 0x1B ^ 0x32;
        r.llllllll[55] = 0x65 ^ 0x4F;
        r.llllllll[56] = 0x8F ^ 0xA4;
        r.llllllll[57] = 1 + 44 - 10 + 102 ^ 152 + 138 - 133 + 8;
        r.llllllll[58] = 3 + 122 - 7 + 23 ^ 38 + 125 - 57 + 54;
        r.llllllll[59] = 106 + 80 - 79 + 133;
        r.llllllll[60] = 0x1E ^ 0x30;
        r.llllllll[61] = 0x6D ^ 0x42 ^ (0x29 ^ 0x68) & ~(0xC7 ^ 0x86);
        r.llllllll[62] = 0x3B ^ 0xB;
        r.llllllll[63] = 0x53 ^ 0x62;
        r.llllllll[64] = 0x74 ^ 6 ^ (0x33 ^ 0x73);
        r.llllllll[65] = 74 + 64 - 71 + 110 ^ 5 + 129 - 103 + 99;
        r.llllllll[66] = 0x45 ^ 0x71;
        r.llllllll[67] = 105 + 61 - 138 + 151 ^ 57 + 24 - 34 + 87;
        r.llllllll[68] = 0xBB ^ 0x8D;
        r.llllllll[69] = 0x39 ^ 0xE;
        r.llllllll[70] = 0xBA ^ 0x8E ^ (0x6D ^ 0x61);
        r.llllllll[71] = 0x8B ^ 0xB2;
        r.llllllll[72] = 0xB8 ^ 0x82;
        r.llllllll[73] = 0xF5 ^ 0x81 ^ (0x5A ^ 0x15);
        r.llllllll[74] = -(0xFFFFF635 & 0x79DE) & (0xFFFFF3FF & 0x7F97);
        r.llllllll[75] = 0xFFFFBEEC & 0x6FDF;
        r.llllllll[76] = -(0xFFFF8E71 & 0x77CF) & (0xFFFFEFE9 & 0x77FE);
        r.llllllll[77] = 0x55 ^ 0x6D ^ (5 ^ 0x59);
        r.llllllll[78] = 0x77 ^ 0x4B;
        r.llllllll[79] = 0x72 ^ 0x5A ^ (0x70 ^ 0x65);
        r.llllllll[80] = 0x32 ^ 0x4A ^ (0xEA ^ 0xAC);
        r.llllllll[81] = 0x18 ^ 0x2C ^ (0x1A ^ 0x11);
        r.llllllll[82] = 118 + 154 - 68 + 41 ^ 151 + 45 - 102 + 87;
        r.llllllll[83] = 0x48 ^ 0x3F ^ (1 ^ 0x34);
        r.llllllll[84] = 9 ^ 0x4E ^ (0x17 ^ 0x13);
        r.llllllll[85] = 56 + 10 - -116 + 70 ^ 75 + 120 - 123 + 112;
        r.llllllll[86] = 213 + 5 - 7 + 12 ^ 9 + 11 - -5 + 129;
        r.llllllll[87] = 0x37 ^ 0x71;
        r.llllllll[88] = 0xA7 ^ 0x87 ^ (0xE5 ^ 0x82);
        r.llllllll[89] = 0x78 ^ 0x30;
        r.llllllll[90] = 0x2C ^ 0x65;
        r.llllllll[91] = -(0xFFFFF877 & 0x7FDF) & (0xFFFFFFF7 & 0x7F7F);
        r.llllllll[92] = -(0xFFFFD9BF & 0x6655) & (0xFFFFDEFE & 0x6F7F);
        r.llllllll[93] = -(0xFFFFB9F9 & 0x4EB7) & (0xFFFFDFFF & 0x2FBF);
        r.llllllll[94] = 0xFFFFFFCF & 0xEBE;
        r.llllllll[95] = 0xFFFFC7B7 & 0x3EFF;
        r.llllllll[96] = -(0xFFFFD37F & 0x6D93) & (0xFFFFCF9F & Short.MAX_VALUE);
        r.llllllll[97] = 0xFFFF867F & 0x7F8F;
        r.llllllll[98] = 0xFFFFCFF7 & 0x3EAD;
        r.llllllll[99] = 0xFFFFA5F1 & 0x5FFE;
        r.llllllll[100] = 0xFFFFCE37 & 0x3FCF;
        r.llllllll[101] = -(0x10 ^ 1) & (0xFFFFFEFE & 0x7FF);
        r.llllllll[102] = 0xFFFFCF66 & 0x3E9D;
        r.llllllll[103] = 0xFFFF97F5 & 0x6EBA;
        r.llllllll[104] = -(0xFFFFDEBF & 0x31C5) & (0xFFFFDFBF & 0x3FEF);
        r.llllllll[105] = 0x6A ^ 0x10 ^ (0x94 ^ 0xA4);
        r.llllllll[106] = 0xF ^ 0x79 ^ (0x78 ^ 0x45);
        r.llllllll[107] = 0x6E ^ 0x4C ^ (0x24 ^ 0x4A);
        r.llllllll[108] = 0x41 ^ 0x5F ^ (0x4F ^ 0x1C);
        r.llllllll[109] = 0x6F ^ 0x53 ^ (0xEC ^ 0x9E);
        r.llllllll[110] = 0xEA ^ 0xA5;
        r.llllllll[111] = 38 + 225 - 182 + 165 ^ 69 + 65 - -22 + 10;
        r.llllllll[112] = 0xC ^ 0x5D;
        r.llllllll[113] = 0x2D ^ 0x7F;
        r.llllllll[114] = 5 ^ 0x56;
        r.llllllll[115] = 0x3A ^ 0x2E ^ (0x54 ^ 0x14);
        r.llllllll[116] = 0x4A ^ 0x1F;
        r.llllllll[117] = 7 ^ 0x51;
        r.llllllll[118] = 0x96 ^ 0xC1;
        r.llllllll[119] = 0x53 ^ 0xB;
        r.llllllll[120] = 0x4B ^ 0x12;
        r.llllllll[121] = 0xEB ^ 0xB1;
        r.llllllll[122] = 0xA6 ^ 0x82 ^ 39 + 51 - 28 + 65;
        r.llllllll[123] = 9 ^ 1 ^ (0x69 ^ 0x3D);
        r.llllllll[124] = 1 ^ 0x5C;
        r.llllllll[125] = 0x76 ^ 0x33 ^ (0x4C ^ 0x57);
    }

    private static boolean llIlIIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

    @Override
    public boolean T() {
        return llllllll[1];
    }

    private static boolean llIlIIlIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIlllII(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public int U() {
        try {
            r.aF();
            "".length();
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (-"   ".length() > 0) {
            return (0x10 ^ 0x5D ^ (0x99 ^ 0x8E)) & (8 + 208 - 142 + 155 ^ 169 + 135 - 232 + 119 ^ -" ".length());
        }
        return llllllll[77];
    }

    @Override
    public String V() {
        return llllllIl[llllllll[78]];
    }

    private static String llIlIIIllll(String lIIlIllllllIIIl, String lIIlIlllllIlllI) {
        try {
            SecretKeySpec lIIlIllllllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIlIlllllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIlIllllllIIll = Cipher.getInstance("Blowfish");
            lIIlIllllllIIll.init(llllllll[5], lIIlIllllllIlII);
            return new String(lIIlIllllllIIll.doFinal(Base64.getDecoder().decode(lIIlIllllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIllllllIIlI) {
            lIIlIllllllIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIllIll(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIlIIlIIIl(String lIIllIIIIIIIIIl, String lIIllIIIIIIIIII) {
        lIIllIIIIIIIIIl = new String(Base64.getDecoder().decode(lIIllIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIIIIIIIlII = new StringBuilder();
        char[] lIIllIIIIIIIIll = lIIllIIIIIIIIII.toCharArray();
        int lIIllIIIIIIIIlI = llllllll[1];
        char[] lIIlIllllllllII = lIIllIIIIIIIIIl.toCharArray();
        int lIIlIlllllllIll = lIIlIllllllllII.length;
        int lIIlIlllllllIlI = llllllll[1];
        while (r.llIlIIlIllI(lIIlIlllllllIlI, lIIlIlllllllIll)) {
            char lIIllIIIIIIIlll = lIIlIllllllllII[lIIlIlllllllIlI];
            lIIllIIIIIIIlII.append((char)(lIIllIIIIIIIlll ^ lIIllIIIIIIIIll[lIIllIIIIIIIIlI % lIIllIIIIIIIIll.length]));
            "".length();
            ++lIIllIIIIIIIIlI;
            ++lIIlIlllllllIlI;
            "".length();
            if ("  ".length() != -" ".length()) continue;
            return null;
        }
        return String.valueOf(lIIllIIIIIIIlII);
    }

    public static void aF() {
        block80: {
            Widget lIIllIIIIlIlIll;
            Object lIIllIIIIlIllII;
            block82: {
                block81: {
                    if (r.llIlIIlIlIl(bz ? 1 : 0)) {
                        b.a(bB);
                        if (r.llIlIIlIllI(bB.size(), llllllll[0])) {
                            System.out.println(llllllIl[llllllll[1]]);
                            bz = llllllll[1];
                        }
                    }
                    if (!r.llIlIIlIlll(bz ? 1 : 0)) break block80;
                    if (!r.llIlIIllIII(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllllll[2])) break block81;
                    int[] nArray = new int[llllllll[0]];
                    nArray[r.llllllll[1]] = llllllll[3];
                    if (!r.llIlIIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) break block82;
                }
                E.ck();
            }
            if (r.llIlIIlIlll(r.ac() ? 1 : 0) && r.llIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[0]) && r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllllll[2])) {
                int[] nArray = new int[llllllll[0]];
                nArray[r.llllllll[1]] = llllllll[3];
                if (r.llIlIIlIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    lIIllIIIIlIllII = BankLocation.getNearest();
                    if (r.llIlIIllIlI(lIIllIIIIlIllII) && r.llIlIIlIlll(lIIllIIIIlIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllllIl[llllllll[0]];
                        a.a((BankLocation)lIIllIIIIlIllII);
                    }
                    if (r.llIlIIllIlI(lIIllIIIIlIllII) && r.llIlIIlIlIl(lIIllIIIIlIllII.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (r.llIlIIlIlll(Bank.isOpen() ? 1 : 0)) {
                            a.a();
                            Time.sleepUntil(() -> Bank.isOpen(), (int)llllllll[4]);
                            "".length();
                        }
                        if (r.llIlIIlIlIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderBarrows.c = llllllIl[llllllll[5]];
                            if (r.llIlIIllIll(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks((int)llllllll[6]);
                                "".length();
                            }
                            if (r.llIlIIllIll(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks((int)llllllll[5]);
                                "".length();
                            }
                            int[] nArray2 = new int[llllllll[6]];
                            nArray2[r.llllllll[1]] = llllllll[7];
                            nArray2[r.llllllll[0]] = llllllll[8];
                            nArray2[r.llllllll[5]] = llllllll[9];
                            nArray2[r.llllllll[10]] = llllllll[11];
                            if (r.llIlIIlIlll(e.b(nArray2) ? 1 : 0)) {
                                r.ag();
                                System.out.println(llllllIl[llllllll[10]]);
                                bz = llllllll[0];
                                return;
                            }
                            int[] nArray3 = new int[llllllll[6]];
                            nArray3[r.llllllll[1]] = llllllll[7];
                            nArray3[r.llllllll[0]] = llllllll[8];
                            nArray3[r.llllllll[5]] = llllllll[9];
                            nArray3[r.llllllll[10]] = llllllll[11];
                            if (r.llIlIIlIlIl(e.b(nArray3) ? 1 : 0)) {
                                a.a(llllllll[7], llllllll[12]);
                                a.a(llllllll[8], llllllll[12]);
                                a.a(llllllll[9], llllllll[0]);
                                a.a(llllllll[11], llllllll[13]);
                                a.a(llllllll[14], llllllll[13]);
                            }
                        }
                    }
                }
            }
            int[] nArray = new int[llllllll[0]];
            nArray[r.llllllll[1]] = llllllll[14];
            if (r.llIlIIlIlIl(Inventory.contains((int[])nArray) ? 1 : 0) && r.llIlIIllIII(Combat.getMissingHealth(), llllllll[15])) {
                int[] nArray4 = new int[llllllll[0]];
                nArray4[r.llllllll[1]] = llllllll[14];
                Inventory.getFirst((int[])nArray4).interact(llllllIl[llllllll[6]]);
                Time.sleepTicks((int)llllllll[5]);
                "".length();
            }
            if (r.llIlIIlIlIl(Inventory.contains((int[])f.bb) ? 1 : 0) && r.llIlIIlIllI(Movement.getRunEnergy(), llllllll[16])) {
                Inventory.getFirst((int[])f.bb).interact(llllllIl[llllllll[13]]);
                Time.sleepTicks((int)llllllll[0]);
                "".length();
            }
            if (r.llIlIIlIllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[0]) && r.llIlIIlIlIl(r.ac() ? 1 : 0) && r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), llllllll[2])) {
                int[] nArray5 = new int[llllllll[0]];
                nArray5[r.llllllll[1]] = llllllll[3];
                if (r.llIlIIlIlll(Inventory.contains((int[])nArray5) ? 1 : 0)) {
                    if (r.llIlIIlIlll(Players.getLocal().getWorldLocation().equals((Object)cy) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllllIl[llllllll[17]];
                        if (r.llIlIIlIlIl(Dialog.isOpen() ? 1 : 0) && r.llIlIIlIllI(cx, llllllll[5])) {
                            Dialog.close();
                            cx += llllllll[0];
                        }
                        e.a(cy);
                    }
                    if (r.llIlIIlIlIl(Players.getLocal().getWorldLocation().equals((Object)cy) ? 1 : 0)) {
                        AccBuilderBarrows.c = llllllIl[llllllll[18]];
                        g.a(llllllIl[llllllll[2]], bX);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit((int)llllllll[19]));
            System.out.println("5621: " + Vars.getBit((int)llllllll[20]));
            System.out.println("5622: " + Vars.getBit((int)llllllll[21]));
            System.out.println("5623: " + Vars.getBit((int)llllllll[22]));
            System.out.println("5624: " + Vars.getBit((int)llllllll[23]));
            if (r.llIlIIllIIl(Vars.getBit((int)llllllll[19]), llllllll[0])) {
                cs = llllllll[0];
            }
            if (r.llIlIIllIIl(Vars.getBit((int)llllllll[20]), llllllll[0])) {
                ct = llllllll[0];
            }
            if (r.llIlIIllIIl(Vars.getBit((int)llllllll[21]), llllllll[0])) {
                cu = llllllll[0];
            }
            if (r.llIlIIllIIl(Vars.getBit((int)llllllll[22]), llllllll[0])) {
                cv = llllllll[0];
            }
            if (r.llIlIIllIIl(Vars.getBit((int)llllllll[23]), llllllll[0])) {
                cw = llllllll[0];
            }
            if (r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[0])) {
                int lIIllIIIIlIlIlI;
                ci = llllllll[1];
                if (r.llIlIIlIlll(cs ? 1 : 0)) {
                    String[] stringArray = new String[llllllll[0]];
                    stringArray[r.llllllll[1]] = llllllIl[llllllll[24]];
                    if (r.llIlIIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray2 = new String[llllllll[0]];
                        stringArray2[r.llllllll[1]] = llllllIl[llllllll[12]];
                        if (r.llIlIIlIlIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                            String[] stringArray3 = new String[llllllll[0]];
                            stringArray3[r.llllllll[1]] = llllllIl[llllllll[25]];
                            if (r.llIlIIlIlll(Inventory.contains((String[])stringArray3) ? 1 : 0)) {
                                String[] stringArray4 = new String[llllllll[0]];
                                stringArray4[r.llllllll[1]] = llllllIl[llllllll[15]];
                                String[] stringArray5 = new String[llllllll[0]];
                                stringArray5[r.llllllll[1]] = llllllIl[llllllll[26]];
                                Inventory.getFirst((String[])stringArray4).useOn(Inventory.getFirst((String[])stringArray5));
                                Time.sleepTicks((int)llllllll[5]);
                                "".length();
                            }
                        }
                    }
                    String[] stringArray6 = new String[llllllll[0]];
                    stringArray6[r.llllllll[1]] = llllllIl[llllllll[27]];
                    if (r.llIlIIlIlIl(Inventory.contains((String[])stringArray6) ? 1 : 0)) {
                        if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cz), llllllll[2])) {
                            AccBuilderBarrows.c = llllllIl[llllllll[28]];
                            Movement.walkTo((WorldPoint)cz);
                            "".length();
                            Time.sleepTicks((int)llllllll[0]);
                            "".length();
                        }
                        if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cz), llllllll[2])) {
                            AccBuilderBarrows.c = llllllIl[llllllll[29]];
                            g.a(llllllIl[llllllll[30]], bX, llllllll[0]);
                            Time.sleepTicks((int)llllllll[0]);
                            "".length();
                            lIIllIIIIlIllII = Dialog.getOptions();
                            lIIllIIIIlIlIll = new ArrayList();
                            if (r.llIlIIlIlll(lIIllIIIIlIllII.isEmpty() ? 1 : 0)) {
                                lIIllIIIIlIlIlI = llllllll[1];
                                while (r.llIlIIlIllI(lIIllIIIIlIlIlI, lIIllIIIIlIllII.size())) {
                                    lIIllIIIIlIlIll.add(((Widget)lIIllIIIIlIllII.get(lIIllIIIIlIlIlI)).getText());
                                    "".length();
                                    ++lIIllIIIIlIlIlI;
                                    "".length();
                                    if (-(0x6A ^ 0x66 ^ (0x57 ^ 0x5F)) <= 0) continue;
                                    return;
                                }
                                lIIllIIIIlIlIlI = lIIllIIIIlIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[90]])) ? 1 : 0;
                                int n2 = lIIllIIIIlIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[89]]));
                                if (r.llIlIIlIlIl(lIIllIIIIlIlIlI) && r.llIlIIlIlIl(n2)) {
                                    System.out.println(llllllIl[llllllll[31]]);
                                }
                            }
                        }
                    }
                }
                if (r.llIlIIlIlll(ct ? 1 : 0) && r.llIlIIlIlIl(cs ? 1 : 0)) {
                    if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cA), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[32]];
                        Movement.walkTo((WorldPoint)cA);
                        "".length();
                        Time.sleepTicks((int)llllllll[0]);
                        "".length();
                    }
                    if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cA), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[33]];
                        g.a(llllllIl[llllllll[34]], bX, llllllll[0]);
                        Time.sleepTicks((int)llllllll[0]);
                        "".length();
                        lIIllIIIIlIllII = Dialog.getOptions();
                        lIIllIIIIlIlIll = new ArrayList();
                        if (r.llIlIIlIlll(lIIllIIIIlIllII.isEmpty() ? 1 : 0)) {
                            lIIllIIIIlIlIlI = llllllll[1];
                            while (r.llIlIIlIllI(lIIllIIIIlIlIlI, lIIllIIIIlIllII.size())) {
                                lIIllIIIIlIlIll.add(((Widget)lIIllIIIIlIllII.get(lIIllIIIIlIlIlI)).getText());
                                "".length();
                                ++lIIllIIIIlIlIlI;
                                "".length();
                                if (" ".length() <= "  ".length()) continue;
                                return;
                            }
                            lIIllIIIIlIlIlI = lIIllIIIIlIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[88]])) ? 1 : 0;
                            int n3 = lIIllIIIIlIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[87]]));
                            if (r.llIlIIlIlIl(lIIllIIIIlIlIlI) && r.llIlIIlIlIl(n3)) {
                                System.out.println(llllllIl[llllllll[35]]);
                            }
                        }
                    }
                }
                if (r.llIlIIlIlll(cu ? 1 : 0) && r.llIlIIlIlIl(ct ? 1 : 0) && r.llIlIIlIlIl(cs ? 1 : 0)) {
                    if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cB), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[36]];
                        Movement.walkTo((WorldPoint)cB);
                        "".length();
                        Time.sleepTicks((int)llllllll[0]);
                        "".length();
                    }
                    if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cB), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[37]];
                        g.a(llllllIl[llllllll[38]], bX, llllllll[0]);
                        Time.sleepTicks((int)llllllll[0]);
                        "".length();
                        lIIllIIIIlIllII = Dialog.getOptions();
                        lIIllIIIIlIlIll = new ArrayList();
                        if (r.llIlIIlIlll(lIIllIIIIlIllII.isEmpty() ? 1 : 0)) {
                            lIIllIIIIlIlIlI = llllllll[1];
                            while (r.llIlIIlIllI(lIIllIIIIlIlIlI, lIIllIIIIlIllII.size())) {
                                lIIllIIIIlIlIll.add(((Widget)lIIllIIIIlIllII.get(lIIllIIIIlIlIlI)).getText());
                                "".length();
                                ++lIIllIIIIlIlIlI;
                                "".length();
                                if ("   ".length() < (" ".length() ^ (0x4F ^ 0x4A))) continue;
                                return;
                            }
                            lIIllIIIIlIlIlI = lIIllIIIIlIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[86]])) ? 1 : 0;
                            int n4 = lIIllIIIIlIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[85]]));
                            if (r.llIlIIlIlIl(lIIllIIIIlIlIlI) && r.llIlIIlIlIl(n4)) {
                                System.out.println(llllllIl[llllllll[39]]);
                            }
                        }
                    }
                }
                if (r.llIlIIlIlll(cv ? 1 : 0) && r.llIlIIlIlIl(cu ? 1 : 0) && r.llIlIIlIlIl(ct ? 1 : 0) && r.llIlIIlIlIl(cs ? 1 : 0)) {
                    if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cC), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[40]];
                        Movement.walkTo((WorldPoint)cC);
                        "".length();
                        Time.sleepTicks((int)llllllll[0]);
                        "".length();
                    }
                    if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cC), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[41]];
                        g.a(llllllIl[llllllll[42]], bX, llllllll[0]);
                        Time.sleepTicks((int)llllllll[0]);
                        "".length();
                        lIIllIIIIlIllII = Dialog.getOptions();
                        lIIllIIIIlIlIll = new ArrayList();
                        if (r.llIlIIlIlll(lIIllIIIIlIllII.isEmpty() ? 1 : 0)) {
                            lIIllIIIIlIlIlI = llllllll[1];
                            while (r.llIlIIlIllI(lIIllIIIIlIlIlI, lIIllIIIIlIllII.size())) {
                                lIIllIIIIlIlIll.add(((Widget)lIIllIIIIlIllII.get(lIIllIIIIlIlIlI)).getText());
                                "".length();
                                ++lIIllIIIIlIlIlI;
                                "".length();
                                if ((5 ^ 1) > 0) continue;
                                return;
                            }
                            lIIllIIIIlIlIlI = lIIllIIIIlIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[84]])) ? 1 : 0;
                            int n5 = lIIllIIIIlIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[83]]));
                            if (r.llIlIIlIlIl(lIIllIIIIlIlIlI) && r.llIlIIlIlIl(n5)) {
                                System.out.println(llllllIl[llllllll[43]]);
                            }
                        }
                    }
                }
                if (r.llIlIIlIlll(cw ? 1 : 0) && r.llIlIIlIlIl(cv ? 1 : 0) && r.llIlIIlIlIl(cu ? 1 : 0) && r.llIlIIlIlIl(ct ? 1 : 0) && r.llIlIIlIlIl(cs ? 1 : 0)) {
                    if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cD), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[44]];
                        Movement.walkTo((WorldPoint)cD);
                        "".length();
                        Time.sleepTicks((int)llllllll[0]);
                        "".length();
                    }
                    if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cD), llllllll[18])) {
                        AccBuilderBarrows.c = llllllIl[llllllll[45]];
                        g.a(llllllIl[llllllll[46]], bX, llllllll[0]);
                        Time.sleepTicks((int)llllllll[0]);
                        "".length();
                        lIIllIIIIlIllII = Dialog.getOptions();
                        lIIllIIIIlIlIll = new ArrayList();
                        if (r.llIlIIlIlll(lIIllIIIIlIllII.isEmpty() ? 1 : 0)) {
                            lIIllIIIIlIlIlI = llllllll[1];
                            while (r.llIlIIlIllI(lIIllIIIIlIlIlI, lIIllIIIIlIllII.size())) {
                                lIIllIIIIlIlIll.add(((Widget)lIIllIIIIlIllII.get(lIIllIIIIlIlIlI)).getText());
                                "".length();
                                ++lIIllIIIIlIlIlI;
                                "".length();
                                if (((0xA3 ^ 0xAC) & ~(0x6B ^ 0x64)) == 0) continue;
                                return;
                            }
                            lIIllIIIIlIlIlI = lIIllIIIIlIlIll.stream().anyMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[16]])) ? 1 : 0;
                            int n6 = lIIllIIIIlIlIll.stream().anyMatch(string -> string.contains(llllllIl[llllllll[82]]));
                            int n7 = lIIllIIIIlIlIll.stream().noneMatch(string -> string.equalsIgnoreCase(llllllIl[llllllll[81]]));
                            if ((!r.llIlIIlIlll(lIIllIIIIlIlIlI) || r.llIlIIlIlIl(n6)) && r.llIlIIlIlIl(n7)) {
                                System.out.println(llllllIl[llllllll[47]]);
                            }
                        }
                    }
                }
            }
            if (r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[5])) {
                if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cy), llllllll[5])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[48]];
                    if (r.llIlIIlIlIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    e.a(cy);
                }
                if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cy), llllllll[5])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[49]];
                    g.a(llllllIl[llllllll[50]], bX);
                }
            }
            if (!r.llIlIIllllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[10]) || r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[17])) {
                g.a(bX);
            }
            if (r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[6])) {
                if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cE), llllllll[6])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[51]];
                    Movement.walkTo((WorldPoint)cE);
                    "".length();
                    Time.sleepTicks((int)llllllll[0]);
                    "".length();
                }
                if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cE), llllllll[6])) {
                    String[] stringArray = new String[llllllll[0]];
                    stringArray[r.llllllll[1]] = llllllIl[llllllll[52]];
                    if (r.llIlIIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                        String[] stringArray7 = new String[llllllll[0]];
                        stringArray7[r.llllllll[1]] = llllllIl[llllllll[53]];
                        Inventory.getFirst((String[])stringArray7).interact(llllllIl[llllllll[54]]);
                        Time.sleepTicks((int)llllllll[10]);
                        "".length();
                    }
                }
            }
            if (r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[13])) {
                if (r.llIlIIlllII(Players.getLocal().getWorldLocation().distanceTo(cy), llllllll[5])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[55]];
                    e.a(cy);
                }
                if (r.llIlIIlllIl(Players.getLocal().getWorldLocation().distanceTo(cy), llllllll[5])) {
                    AccBuilderBarrows.c = llllllIl[llllllll[56]];
                    g.a(llllllIl[llllllll[57]], bX);
                }
            }
            if (!r.llIlIIllllI(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[18]) || r.llIlIIllIIl(Vars.getBit((int)QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), llllllll[2])) {
                if (r.llIlIIlIllI(ci, llllllll[0])) {
                    Q.lJ += llllllll[0];
                    Q.o(AccBuilderBarrows.m);
                    ci += llllllll[0];
                    Q.lJ = llllllll[1];
                    cj = llllllll[1];
                }
                String[] stringArray = new String[llllllll[0]];
                stringArray[r.llllllll[1]] = llllllIl[llllllll[58]];
                if (r.llIlIIlIlIl(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    if (r.llIlIIllIlI(Widgets.get((int)llllllll[59]))) {
                        AccBuilderBarrows.c = llllllIl[llllllll[60]];
                        String[] stringArray8 = new String[llllllll[0]];
                        stringArray8[r.llllllll[1]] = llllllIl[llllllll[61]];
                        Inventory.getFirst((String[])stringArray8).interact(llllllIl[llllllll[62]]);
                        Time.sleepTicks((int)llllllll[6]);
                        "".length();
                        AccBuilderBarrows.c = llllllIl[llllllll[63]];
                        lIIllIIIIlIllII = Widgets.get((int)llllllll[59], (int)llllllll[27]);
                        if (r.llIlIIllIlI(lIIllIIIIlIllII)) {
                            lIIllIIIIlIllII.interact(llllllIl[llllllll[64]]);
                            Time.sleepTicks((int)llllllll[0]);
                            "".length();
                        }
                        if (r.llIlIIllIlI(lIIllIIIIlIlIll = Widgets.get((int)llllllll[59], (int)llllllll[39]))) {
                            lIIllIIIIlIlIll.interact(llllllIl[llllllll[65]]);
                            Time.sleepTicks((int)llllllll[5]);
                            "".length();
                        }
                    }
                    Time.sleepTicks((int)llllllll[0]);
                    "".length();
                }
            }
        }
    }
}

