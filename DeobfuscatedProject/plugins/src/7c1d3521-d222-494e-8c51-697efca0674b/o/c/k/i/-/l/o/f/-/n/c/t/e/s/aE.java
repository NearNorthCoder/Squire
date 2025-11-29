/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.widgets.Dialog
 */
package o.c.k.i.-.l.o.f.-.n.c.t.e.s;

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
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.a;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.b;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.d;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.j;

public class aE
implements ac {
    public static /* synthetic */ long oa;
    public static final /* synthetic */ WorldPoint pr;
    public static /* synthetic */ boolean bt;
    public static final /* synthetic */ WorldPoint pn;
    static /* synthetic */ int cI;
    public static final /* synthetic */ WorldPoint pt;
    public static /* synthetic */ List<d> bv;
    private static /* synthetic */ int[] llIllIlIII;
    public static final /* synthetic */ WorldPoint po;
    public static final /* synthetic */ WorldPoint pm;
    static /* synthetic */ int cG;
    public static final /* synthetic */ WorldPoint pp;
    public static final /* synthetic */ WorldPoint ps;
    public static /* synthetic */ WorldPoint nX;
    public static /* synthetic */ WorldPoint nY;
    static /* synthetic */ int oc;
    public static /* synthetic */ WorldPoint nZ;
    public static final /* synthetic */ WorldPoint pl;
    private static /* synthetic */ String[] llIllIIllI;
    public static final /* synthetic */ WorldPoint pq;
    static /* synthetic */ int dF;
    static /* synthetic */ int od;
    static /* synthetic */ WorldArea oe;
    public static /* synthetic */ String[] ob;

    public static void Q() {
        d llllllllllllllllllIIIlIIlIIIIlII;
        int[] nArray = new int[llIllIlIII[1]];
        nArray[aE.llIllIlIII[0]] = llIllIlIII[9];
        if (aE.lIllIlllIIIII(Bank.contains((int[])nArray) ? 1 : 0)) {
            d d2 = new d(llIllIlIII[9], llIllIlIII[13], llIllIlIII[43]);
            bv.add(d2);
            "".length();
        }
        int[] nArray2 = new int[llIllIlIII[1]];
        nArray2[aE.llIllIlIII[0]] = llIllIlIII[10];
        if (aE.lIllIlllIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) {
            llllllllllllllllllIIIlIIlIIIIlII = new d(llIllIlIII[10], llIllIlIII[13], llIllIlIII[43]);
            bv.add(llllllllllllllllllIIIlIIlIIIIlII);
            "".length();
        }
        int[] nArray3 = new int[llIllIlIII[1]];
        nArray3[aE.llIllIlIII[0]] = llIllIlIII[11];
        if (aE.lIllIlllIIIII(Bank.contains((int[])nArray3) ? 1 : 0)) {
            llllllllllllllllllIIIlIIlIIIIlII = new d(llIllIlIII[11], llIllIlIII[40], llIllIlIII[44]);
            bv.add(llllllllllllllllllIIIlIIlIIIIlII);
            "".length();
        }
        int[] nArray4 = new int[llIllIlIII[1]];
        nArray4[aE.llIllIlIII[0]] = llIllIlIII[45];
        if (aE.lIllIlllIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) {
            llllllllllllllllllIIIlIIlIIIIlII = new d(llIllIlIII[45], llIllIlIII[12], j.cf);
            bv.add(llllllllllllllllllIIIlIIlIIIIlII);
            "".length();
        }
        if (aE.lIllIlllIIIll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[5])) {
            int[] nArray5 = new int[llIllIlIII[1]];
            nArray5[aE.llIllIlIII[0]] = llIllIlIII[7];
            if (aE.lIllIlllIIIII(Bank.contains((int[])nArray5) ? 1 : 0)) {
                llllllllllllllllllIIIlIIlIIIIlII = new d(llIllIlIII[7], llIllIlIII[46], llIllIlIII[20]);
                bv.add(llllllllllllllllllIIIlIIlIIIIlII);
                "".length();
            }
            int[] nArray6 = new int[llIllIlIII[1]];
            nArray6[aE.llIllIlIII[0]] = llIllIlIII[6];
            if (aE.lIllIlllIIIII(Bank.contains((int[])nArray6) ? 1 : 0)) {
                llllllllllllllllllIIIlIIlIIIIlII = new d(llIllIlIII[6], llIllIlIII[44], llIllIlIII[47]);
                bv.add(llllllllllllllllllIIIlIIlIIIIlII);
                "".length();
            }
        }
    }

    private static boolean lIllIllIlllll(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public String ag() {
        return llIllIIllI[llIllIlIII[49]];
    }

    private static void lIllIllIllIIl() {
        llIllIIllI = new String[llIllIlIII[112]];
        aE.llIllIIllI[aE.llIllIlIII[0]] = aE.lIllIllIlIllI("7Zi5p36zM0dpaC9HlswrNw==", "DCRps");
        aE.llIllIIllI[aE.llIllIlIII[1]] = aE.lIllIllIlIllI("uAdix5v6pL4Sd8MKSYTuBWQEIEShmcmvi4o6fUR6HgPA3q79ALK5djYIP+xKSx5T", "AjbQF");
        aE.llIllIIllI[aE.llIllIlIII[2]] = aE.lIllIllIlIllI("s8jM6GHmEb2+iZFWAebeK15rfEq+5hq4", "vsONY");
        aE.llIllIIllI[aE.llIllIlIII[3]] = aE.lIllIllIlIllI("z4BjFTeriCDO48HjhltikoZ/wzdqMEtg", "eCpRg");
        aE.llIllIIllI[aE.llIllIlIII[8]] = aE.lIllIllIlIllI("k7eMgf2LQuoBftyZPtX2T7JfZzCbBUMY1L8nDACl6QKWjwM1yTmc8zWofGSHzWev", "KhStf");
        aE.llIllIIllI[aE.llIllIlIII[12]] = aE.lIllIllIlIlll("NrrNFgxn9QttUk/p/WJ2jKtxf8KmUGnhY/b2P4ZUi2zRn95xsRFzWJ24eYYXZ0HI", "hBwIj");
        aE.llIllIIllI[aE.llIllIlIII[17]] = aE.lIllIllIlIllI("otXqcRpV5eo=", "WmPje");
        aE.llIllIIllI[aE.llIllIlIII[18]] = aE.lIllIllIlIllI("K+i3kSf9+Tx8WtX4vPlUzQ==", "vEhxr");
        aE.llIllIIllI[aE.llIllIlIII[20]] = aE.lIllIllIlIlll("+LzaW4dS2xH75UGPgzpZ2g==", "WAfBU");
        aE.llIllIIllI[aE.llIllIlIII[21]] = aE.lIllIllIllIII("IgcKBB8dRj8RCAIDCw==", "ofypz");
        aE.llIllIIllI[aE.llIllIlIII[13]] = aE.lIllIllIllIII("Oig2JwIFaQMyFRosNw==", "wIESg");
        aE.llIllIIllI[aE.llIllIlIII[22]] = aE.lIllIllIlIlll("0I7vuM5hI0cW9ECYBfB/cQ==", "vnTtF");
        aE.llIllIIllI[aE.llIllIlIII[23]] = aE.lIllIllIllIII("PSwfDwcLPA==", "nXjai");
        aE.llIllIIllI[aE.llIllIlIII[24]] = aE.lIllIllIlIlll("7hSH/0L1TfM=", "cciVk");
        aE.llIllIIllI[aE.llIllIlIII[25]] = aE.lIllIllIlIllI("HMKZJWnlRps=", "QuJdG");
        aE.llIllIIllI[aE.llIllIlIII[16]] = aE.lIllIllIllIII("HRIG", "WgarW");
        aE.llIllIIllI[aE.llIllIlIII[26]] = aE.lIllIllIlIlll("WSi5S1m8dRDM1Pyrv8eC8Q==", "QQeYp");
        aE.llIllIIllI[aE.llIllIlIII[27]] = aE.lIllIllIlIlll("3DshM+eWQGv5j4YyX26ZjA==", "bsPFQ");
        aE.llIllIIllI[aE.llIllIlIII[29]] = aE.lIllIllIlIlll("FCplxYdlrvt/CtdQpJO6cQ==", "avyXe");
        aE.llIllIIllI[aE.llIllIlIII[30]] = aE.lIllIllIlIllI("Sguhdlijci0=", "TzuTE");
        aE.llIllIIllI[aE.llIllIlIII[14]] = aE.lIllIllIlIlll("ReC4WL9U8/w=", "TIOjX");
        aE.llIllIIllI[aE.llIllIlIII[31]] = aE.lIllIllIlIllI("V/EG0IcxcinwTiwtYsOu+A==", "IeSPW");
        aE.llIllIIllI[aE.llIllIlIII[32]] = aE.lIllIllIlIlll("ZOTQbWf2ddc=", "zRlAj");
        aE.llIllIIllI[aE.llIllIlIII[33]] = aE.lIllIllIllIII("MScs", "tFXhO");
        aE.llIllIIllI[aE.llIllIlIII[34]] = aE.lIllIllIllIII("JjcVajYHdhcvI0giCiYn", "hVcJB");
        aE.llIllIIllI[aE.llIllIlIII[28]] = aE.lIllIllIlIllI("AJycX4yRmd+iQ11VlrrX5A==", "nsVcF");
        aE.llIllIIllI[aE.llIllIlIII[35]] = aE.lIllIllIllIII("HhsTKzQkARE=", "MovJX");
        aE.llIllIIllI[aE.llIllIlIII[36]] = aE.lIllIllIlIllI("pScHbNehkBlKn83/qXsOdw==", "uWNhV");
        aE.llIllIIllI[aE.llIllIlIII[37]] = aE.lIllIllIllIII("DTQpcRYtMCQ9", "YQHQe");
        aE.llIllIIllI[aE.llIllIlIII[38]] = aE.lIllIllIlIlll("EB47oNBZSNzM2DkRotJHVg==", "XTRBW");
        aE.llIllIIllI[aE.llIllIlIII[40]] = aE.lIllIllIlIlll("f6PosA6B7d+G5sqOhyCyyA==", "kvvCV");
        aE.llIllIIllI[aE.llIllIlIII[49]] = aE.lIllIllIllIII("IAQsBjgdAiI=", "tlEcN");
        aE.llIllIIllI[aE.llIllIlIII[51]] = aE.lIllIllIlIllI("wqUqMMv8tIo=", "jYlVY");
        aE.llIllIIllI[aE.llIllIlIII[52]] = aE.lIllIllIllIII("AAoEGw==", "Dxkkn");
        aE.llIllIIllI[aE.llIllIlIII[53]] = aE.lIllIllIlIlll("kBOxNiwaeiGEDkizbRECDg==", "iPLUJ");
        aE.llIllIIllI[aE.llIllIlIII[54]] = aE.lIllIllIlIlll("qEbSgVl4kCc=", "uckvV");
        aE.llIllIIllI[aE.llIllIlIII[55]] = aE.lIllIllIlIlll("HQnkd6RBTV0=", "EhADH");
        aE.llIllIIllI[aE.llIllIlIII[56]] = aE.lIllIllIllIII("Mj0WKg==", "vOyZl");
        aE.llIllIIllI[aE.llIllIlIII[5]] = aE.lIllIllIlIlll("5VY2nnhRMZQDimiMTZLpSg==", "nzZkg");
        aE.llIllIIllI[aE.llIllIlIII[61]] = aE.lIllIllIllIII("PTIcIi0fPwprORU2Cg==", "pSnKJ");
        aE.llIllIIllI[aE.llIllIlIII[62]] = aE.lIllIllIllIII("Nik4BScSLXoUIxAs", "uHZgF");
        aE.llIllIIllI[aE.llIllIlIII[63]] = aE.lIllIllIlIllI("q/9pBxhzOq2Memf0PafhtQ==", "jSoss");
        aE.llIllIIllI[aE.llIllIlIII[64]] = aE.lIllIllIlIllI("RMhyErF3suWxjnTpglJflw==", "mJTCH");
        aE.llIllIIllI[aE.llIllIlIII[65]] = aE.lIllIllIlIllI("+DHfwdh4kRYb6vddLhM7+g==", "BMEMc");
        aE.llIllIIllI[aE.llIllIlIII[66]] = aE.lIllIllIlIllI("9wT+cnZKXQEsZ3e1/5et/A==", "WSRSy");
        aE.llIllIIllI[aE.llIllIlIII[67]] = aE.lIllIllIlIllI("IxWWdAd9Yhi9GUC6778WxQ==", "JEjag");
        aE.llIllIIllI[aE.llIllIlIII[68]] = aE.lIllIllIllIII("IQIKMSYXEgdyKxAJDzckFg==", "qgkRC");
        aE.llIllIIllI[aE.llIllIlIII[69]] = aE.lIllIllIlIlll("8MLrhRX8pFn4anyegs6Ldw==", "kqgdp");
        aE.llIllIIllI[aE.llIllIlIII[70]] = aE.lIllIllIlIllI("1J0LHF4BEFpfq4gq8PR4CQ==", "InEiR");
        aE.llIllIIllI[aE.llIllIlIII[71]] = aE.lIllIllIllIII("LRU5AmUJHz0C", "zzXfE");
        aE.llIllIIllI[aE.llIllIlIII[72]] = aE.lIllIllIllIII("HTUSDQ09Ig9PGyo1Eg==", "OPvoh");
        aE.llIllIIllI[aE.llIllIlIII[73]] = aE.lIllIllIllIII("MxQ2EC0LFz0FOgBVKxItHQ==", "yuXwH");
        aE.llIllIIllI[aE.llIllIlIII[74]] = aE.lIllIllIlIllI("QdcJASmLP2F8i+4i771xmA==", "LWWJa");
        aE.llIllIIllI[aE.llIllIlIII[75]] = aE.lIllIllIllIII("BC0/HQc3MDVYGTMnKA==", "VBLxj");
        aE.llIllIIllI[aE.llIllIlIII[76]] = aE.lIllIllIllIII("FgEKDT0nEAoeM2UGHQku", "EuxlJ");
        aE.llIllIIllI[aE.llIllIlIII[77]] = aE.lIllIllIlIllI("yPAzjEmmi6HjRLh/yCbHVJwM5zSmntqu", "CzUwx");
        aE.llIllIIllI[aE.llIllIlIII[78]] = aE.lIllIllIlIllI("lv8yLA+5LNzWiEFEWOBqQQ==", "FAkzN");
        aE.llIllIIllI[aE.llIllIlIII[79]] = aE.lIllIllIlIllI("+7ILpDhtP5f837loRD1VKA==", "Blhli");
        aE.llIllIIllI[aE.llIllIlIII[80]] = aE.lIllIllIlIllI("3QEmEpOYnupGdJJ76puPMA==", "DVCFa");
        aE.llIllIIllI[aE.llIllIlIII[81]] = aE.lIllIllIlIlll("fQ6HggadM+a7cLL1Tu2KgQ==", "WHynF");
        aE.llIllIIllI[aE.llIllIlIII[82]] = aE.lIllIllIlIlll("drQb2QSbDbGQfcPYfPpb7A==", "KwEGP");
        aE.llIllIIllI[aE.llIllIlIII[83]] = aE.lIllIllIlIllI("u93N6KvLfaLH6SFR0jSyJw==", "qNroL");
        aE.llIllIIllI[aE.llIllIlIII[84]] = aE.lIllIllIlIlll("DyKC7UM4lK4oOYwgNkJi2UQ8ru19IHwx", "fYAkW");
        aE.llIllIIllI[aE.llIllIlIII[85]] = aE.lIllIllIlIlll("jgouCVi891BsgLt60QjBVQ==", "ESzuQ");
        aE.llIllIIllI[aE.llIllIlIII[86]] = aE.lIllIllIllIII("DjctMjY2NCYnIT12MDA2IA==", "DVCUS");
        aE.llIllIIllI[aE.llIllIlIII[87]] = aE.lIllIllIlIlll("7eTQVqnSyTgUR4RCZk8sWQ==", "aOkVl");
        aE.llIllIIllI[aE.llIllIlIII[88]] = aE.lIllIllIlIlll("uIP+hNtXcflSFAhASwMYXQ==", "TuRkZ");
        aE.llIllIIllI[aE.llIllIlIII[89]] = aE.lIllIllIllIII("NCM4Mx8XNiMtFlkxLyQe", "yBJAz");
        aE.llIllIIllI[aE.llIllIlIII[90]] = aE.lIllIllIlIlll("wEWYCwNf6pi7S31ME7UCmQ==", "UeIXx");
        aE.llIllIIllI[aE.llIllIlIII[91]] = aE.lIllIllIlIllI("T6j8z6ODcMIoAsSNXeMit9tw0Sb+HVwK", "PgGBi");
        aE.llIllIIllI[aE.llIllIlIII[92]] = aE.lIllIllIlIllI("NkVCiQBLTgUOmg0KC4PEuw==", "zpQRW");
        aE.llIllIIllI[aE.llIllIlIII[93]] = aE.lIllIllIlIlll("Nq7ue3F7BDI+v+ZgaGY8lw==", "KsQJx");
        aE.llIllIIllI[aE.llIllIlIII[94]] = aE.lIllIllIlIlll("NOG/ceq3fPZ57yO4Hz1Wag==", "biAqb");
        aE.llIllIIllI[aE.llIllIlIII[95]] = aE.lIllIllIlIlll("3svEaMMyx5/BQWeISz7fGg7mZ5LZN+ua", "OmupT");
        aE.llIllIIllI[aE.llIllIlIII[96]] = aE.lIllIllIllIII("ICEA", "jTgtn");
    }

    private static boolean lIllIlllIIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIlllIlIlI(int n2) {
        return n2 >= 0;
    }

    private static boolean lIllIlllIllIl(int n2) {
        return n2 <= 0;
    }

    @Override
    public boolean ah() {
        boolean bl;
        if (aE.lIllIlllIIIll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[50])) {
            bl = llIllIlIII[1];
            "".length();
            if ("  ".length() == (0xC1 ^ 0xC5)) {
                return ((0x4D ^ 0x5D) & ~(4 ^ 0x14)) != 0;
            }
        } else {
            bl = llIllIlIII[0];
        }
        return bl;
    }

    private static boolean lIllIllIllllI(int n2) {
        return n2 != 0;
    }

    static {
        aE.lIllIllIlllIl();
        aE.lIllIllIllIIl();
        bv = new ArrayList<d>();
        nX = new WorldPoint(llIllIlIII[57], llIllIlIII[58], llIllIlIII[0]);
        nY = new WorldPoint(llIllIlIII[59], llIllIlIII[60], llIllIlIII[0]);
        nZ = new WorldPoint(llIllIlIII[0], llIllIlIII[0], llIllIlIII[0]);
        oa = System.currentTimeMillis();
        String[] stringArray = new String[llIllIlIII[56]];
        stringArray[aE.llIllIlIII[0]] = llIllIIllI[llIllIlIII[5]];
        stringArray[aE.llIllIlIII[1]] = llIllIIllI[llIllIlIII[61]];
        stringArray[aE.llIllIlIII[2]] = llIllIIllI[llIllIlIII[62]];
        stringArray[aE.llIllIlIII[3]] = llIllIIllI[llIllIlIII[63]];
        stringArray[aE.llIllIlIII[8]] = llIllIIllI[llIllIlIII[64]];
        stringArray[aE.llIllIlIII[12]] = llIllIIllI[llIllIlIII[65]];
        stringArray[aE.llIllIlIII[17]] = llIllIIllI[llIllIlIII[66]];
        stringArray[aE.llIllIlIII[18]] = llIllIIllI[llIllIlIII[67]];
        stringArray[aE.llIllIlIII[20]] = llIllIIllI[llIllIlIII[68]];
        stringArray[aE.llIllIlIII[21]] = llIllIIllI[llIllIlIII[69]];
        stringArray[aE.llIllIlIII[13]] = llIllIIllI[llIllIlIII[70]];
        stringArray[aE.llIllIlIII[22]] = llIllIIllI[llIllIlIII[71]];
        stringArray[aE.llIllIlIII[23]] = llIllIIllI[llIllIlIII[72]];
        stringArray[aE.llIllIlIII[24]] = llIllIIllI[llIllIlIII[73]];
        stringArray[aE.llIllIlIII[25]] = llIllIIllI[llIllIlIII[74]];
        stringArray[aE.llIllIlIII[16]] = llIllIIllI[llIllIlIII[75]];
        stringArray[aE.llIllIlIII[26]] = llIllIIllI[llIllIlIII[76]];
        stringArray[aE.llIllIlIII[27]] = llIllIIllI[llIllIlIII[77]];
        stringArray[aE.llIllIlIII[29]] = llIllIIllI[llIllIlIII[78]];
        stringArray[aE.llIllIlIII[30]] = llIllIIllI[llIllIlIII[79]];
        stringArray[aE.llIllIlIII[14]] = llIllIIllI[llIllIlIII[80]];
        stringArray[aE.llIllIlIII[31]] = llIllIIllI[llIllIlIII[81]];
        stringArray[aE.llIllIlIII[32]] = llIllIIllI[llIllIlIII[82]];
        stringArray[aE.llIllIlIII[33]] = llIllIIllI[llIllIlIII[83]];
        stringArray[aE.llIllIlIII[34]] = llIllIIllI[llIllIlIII[84]];
        stringArray[aE.llIllIlIII[28]] = llIllIIllI[llIllIlIII[85]];
        stringArray[aE.llIllIlIII[35]] = llIllIIllI[llIllIlIII[86]];
        stringArray[aE.llIllIlIII[36]] = llIllIIllI[llIllIlIII[87]];
        stringArray[aE.llIllIlIII[37]] = llIllIIllI[llIllIlIII[88]];
        stringArray[aE.llIllIlIII[38]] = llIllIIllI[llIllIlIII[89]];
        stringArray[aE.llIllIlIII[40]] = llIllIIllI[llIllIlIII[90]];
        stringArray[aE.llIllIlIII[49]] = llIllIIllI[llIllIlIII[91]];
        stringArray[aE.llIllIlIII[51]] = llIllIIllI[llIllIlIII[92]];
        stringArray[aE.llIllIlIII[52]] = llIllIIllI[llIllIlIII[93]];
        stringArray[aE.llIllIlIII[53]] = llIllIIllI[llIllIlIII[94]];
        stringArray[aE.llIllIlIII[54]] = llIllIIllI[llIllIlIII[95]];
        stringArray[aE.llIllIlIII[55]] = llIllIIllI[llIllIlIII[96]];
        ob = stringArray;
        oc = llIllIlIII[97];
        dF = llIllIlIII[0];
        cI = e.c(llIllIlIII[20], llIllIlIII[32]);
        od = e.c(llIllIlIII[5], llIllIlIII[76]);
        cG = llIllIlIII[1];
        oe = new WorldArea(llIllIlIII[98], llIllIlIII[99], llIllIlIII[32], llIllIlIII[28], llIllIlIII[0]);
        pl = new WorldPoint(llIllIlIII[100], llIllIlIII[101], llIllIlIII[0]);
        pm = new WorldPoint(llIllIlIII[102], llIllIlIII[103], llIllIlIII[0]);
        pn = new WorldPoint(llIllIlIII[104], llIllIlIII[105], llIllIlIII[0]);
        po = new WorldPoint(llIllIlIII[106], llIllIlIII[107], llIllIlIII[0]);
        pp = new WorldPoint(llIllIlIII[108], llIllIlIII[109], llIllIlIII[0]);
        pq = new WorldPoint(llIllIlIII[110], llIllIlIII[111], llIllIlIII[0]);
        pr = pl;
        pt = ps = pm;
    }

    private static boolean lIllIlllIlIII(Object object) {
        return object == null;
    }

    public static void gn() {
        if (aE.lIllIllIllllI(Inventory.isFull() ? 1 : 0)) {
            Inventory.getAll((String[])ob).forEach(item -> item.interact(llIllIIllI[llIllIlIII[56]]));
        }
        if (aE.lIllIlllIIIII(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[llIllIlIII[1]];
            nArray[aE.llIllIlIII[0]] = llIllIlIII[7];
            if (aE.lIllIllIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIllIlIII[1]];
                nArray2[aE.llIllIlIII[0]] = llIllIlIII[6];
                if (aE.lIllIlllIIIII(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    int[] nArray3 = new int[llIllIlIII[1]];
                    nArray3[aE.llIllIlIII[0]] = llIllIlIII[6];
                    if (aE.lIllIllIllllI(Inventory.contains((int[])nArray3) ? 1 : 0)) {
                        int[] nArray4 = new int[llIllIlIII[1]];
                        nArray4[aE.llIllIlIII[0]] = llIllIlIII[6];
                        Inventory.getFirst((int[])nArray4).interact(llIllIIllI[llIllIlIII[17]]);
                        Time.sleepTicks((int)llIllIlIII[1]);
                        "".length();
                    }
                }
            }
        }
        if (aE.lIllIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(pr), llIllIlIII[16])) {
            AccBuilderSotf.c = llIllIIllI[llIllIlIII[18]];
            Movement.walkTo((WorldPoint)pr);
            "".length();
            Time.sleepTicks((int)llIllIlIII[1]);
            "".length();
        }
        if (aE.lIllIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(pr), llIllIlIII[16])) {
            if (aE.lIllIlllIIIII(oe.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Movement.walkTo((WorldPoint)pr);
                "".length();
                Time.sleepTicks((int)llIllIlIII[1]);
                "".length();
            }
            if (aE.lIllIllIllllI(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (aE.lIllIlllIIlll(Players.getLocal().getGraphic(), llIllIlIII[19])) {
                AccBuilderSotf.c = llIllIIllI[llIllIlIII[20]];
                String[] stringArray = new String[llIllIlIII[1]];
                stringArray[aE.llIllIlIII[0]] = llIllIIllI[llIllIlIII[21]];
                if (aE.lIllIlllIIIIl(NPCs.getNearest((String[])stringArray)) && aE.lIllIlllIlIII(Players.getLocal().getInteracting())) {
                    String[] stringArray2 = new String[llIllIlIII[1]];
                    stringArray2[aE.llIllIlIII[0]] = llIllIIllI[llIllIlIII[13]];
                    NPCs.getNearest((String[])stringArray2).interact(llIllIIllI[llIllIlIII[22]]);
                    Time.sleepTicks((int)llIllIlIII[1]);
                    "".length();
                }
            }
            if (aE.lIllIlllIlIIl(Players.getLocal().getGraphic(), llIllIlIII[19])) {
                AccBuilderSotf.c = llIllIIllI[llIllIlIII[23]];
                if (!aE.lIllIlllIlIlI(aE.lIllIlllIIlIl(e.w(), 70.0)) || aE.lIllIlllIIllI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIllIlIII[8])) {
                    int[] nArray = new int[llIllIlIII[1]];
                    nArray[aE.llIllIlIII[0]] = llIllIlIII[7];
                    if (aE.lIllIllIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray5 = new int[llIllIlIII[1]];
                        nArray5[aE.llIllIlIII[0]] = llIllIlIII[7];
                        Inventory.getFirst((int[])nArray5).interact(llIllIIllI[llIllIlIII[24]]);
                        Time.sleepTicks((int)llIllIlIII[1]);
                        "".length();
                    }
                }
                String[] stringArray = new String[llIllIlIII[1]];
                stringArray[aE.llIllIlIII[0]] = llIllIIllI[llIllIlIII[25]];
                if (aE.lIllIllIllllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
                    String[] stringArray3 = new String[llIllIlIII[1]];
                    stringArray3[aE.llIllIlIII[0]] = llIllIIllI[llIllIlIII[16]];
                    Inventory.getAll((String[])stringArray3).stream().forEach(item -> item.interact(llIllIIllI[llIllIlIII[55]]));
                }
                Inventory.getAll((String[])ob).forEach(item -> item.interact(llIllIIllI[llIllIlIII[54]]));
            }
        }
    }

    private static void gp() {
        if (aE.lIllIlllIIIII(Players.getLocal().getWorldLocation().equals((Object)nY) ? 1 : 0)) {
            AccBuilderSotf.c = llIllIIllI[llIllIlIII[34]];
            if (aE.lIllIllIllllI(Dialog.isOpen() ? 1 : 0)) {
                Dialog.close();
            }
            Movement.walkTo((WorldPoint)nY);
            "".length();
            Time.sleepTicks((int)llIllIlIII[1]);
            "".length();
        }
        if (aE.lIllIllIllllI(Players.getLocal().getWorldLocation().equals((Object)nY) ? 1 : 0)) {
            int[] nArray = new int[llIllIlIII[1]];
            nArray[aE.llIllIlIII[0]] = oc;
            if (aE.lIllIllIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIllIlIII[1]];
                nArray2[aE.llIllIlIII[0]] = oc;
                Inventory.getFirst((int[])nArray2).interact(llIllIIllI[llIllIlIII[28]]);
                Time.sleepTicks((int)llIllIlIII[1]);
                "".length();
            }
            if (aE.lIllIlllIIIII(Inventory.isFull() ? 1 : 0)) {
                AccBuilderSotf.c = llIllIIllI[llIllIlIII[35]];
                String[] stringArray = new String[llIllIlIII[1]];
                stringArray[aE.llIllIlIII[0]] = llIllIIllI[llIllIlIII[36]];
                if (aE.lIllIlllIIIIl(TileObjects.getNearest((String[])stringArray))) {
                    String[] stringArray2 = new String[llIllIlIII[1]];
                    stringArray2[aE.llIllIlIII[0]] = llIllIIllI[llIllIlIII[37]];
                    TileObjects.getNearest((String[])stringArray2).interact(llIllIIllI[llIllIlIII[38]]);
                    Time.sleepUntil(() -> {
                        boolean bl;
                        String[] stringArray = new String[llIllIlIII[1]];
                        stringArray[aE.llIllIlIII[0]] = llIllIIllI[llIllIlIII[53]];
                        if (aE.lIllIlllIlIII(TileObjects.getNearest((String[])stringArray))) {
                            bl = llIllIlIII[1];
                            "".length();
                            if (-"  ".length() > 0) {
                                return ((0xE4 ^ 0xAD ^ (0x37 ^ 0x6C)) & (13 + 63 - 25 + 90 ^ 11 + 34 - -102 + 12 ^ -" ".length())) != 0;
                            }
                        } else {
                            bl = llIllIlIII[0];
                        }
                        return bl;
                    }, (int)llIllIlIII[39]);
                    "".length();
                }
            }
            if (aE.lIllIllIllllI(Inventory.isFull() ? 1 : 0)) {
                AccBuilderSotf.c = llIllIIllI[llIllIlIII[40]];
                int[] nArray3 = new int[llIllIlIII[2]];
                nArray3[aE.llIllIlIII[0]] = llIllIlIII[41];
                nArray3[aE.llIllIlIII[1]] = llIllIlIII[42];
                Inventory.getAll((int[])nArray3).forEach(item -> item.interact(llIllIIllI[llIllIlIII[52]]));
                int[] nArray4 = new int[llIllIlIII[1]];
                nArray4[aE.llIllIlIII[0]] = llIllIlIII[11];
                if (aE.lIllIllIllllI(Inventory.contains((int[])nArray4) ? 1 : 0)) {
                    int[] nArray5 = new int[llIllIlIII[1]];
                    nArray5[aE.llIllIlIII[0]] = llIllIlIII[11];
                    Inventory.getAll((int[])nArray5).forEach(item -> item.interact(llIllIIllI[llIllIlIII[51]]));
                }
            }
        }
    }

    private static boolean lIllIlllIIlII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean an() {
        int n2;
        block7: {
            block8: {
                if (aE.lIllIllIlllll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[12])) {
                    int n3;
                    int[] nArray = new int[llIllIlIII[1]];
                    nArray[aE.llIllIlIII[0]] = llIllIlIII[11];
                    if (aE.lIllIllIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray2 = new int[llIllIlIII[1]];
                        nArray2[aE.llIllIlIII[0]] = llIllIlIII[10];
                        int[] nArray3 = new int[llIllIlIII[1]];
                        nArray3[aE.llIllIlIII[0]] = llIllIlIII[9];
                        if (aE.lIllIllIllllI(Inventory.contains((int[])nArray2) & Inventory.contains((int[])nArray3)) && aE.lIllIlllIIIlI(cG)) {
                            n3 = llIllIlIII[1];
                            "".length();
                            if (-"  ".length() <= 0) return n3 != 0;
                            return ((0x40 ^ 0x19) & ~(0xE4 ^ 0xBD)) != 0;
                        }
                    }
                    n3 = llIllIlIII[0];
                    return n3 != 0;
                }
                if (aE.lIllIlllIIIll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[12]) && aE.lIllIllIlllll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[5])) {
                    return llIllIlIII[1];
                }
                if (!aE.lIllIlllIIIll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[5])) return llIllIlIII[0];
                int[] nArray = new int[llIllIlIII[1]];
                nArray[aE.llIllIlIII[0]] = llIllIlIII[7];
                if (!aE.lIllIllIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) break block7;
                int[] nArray4 = new int[llIllIlIII[1]];
                nArray4[aE.llIllIlIII[0]] = llIllIlIII[6];
                if (!aE.lIllIlllIIIII(Inventory.contains((int[])nArray4) ? 1 : 0)) break block8;
                int[] nArray5 = new int[llIllIlIII[1]];
                nArray5[aE.llIllIlIII[0]] = llIllIlIII[6];
                if (!aE.lIllIllIllllI(Equipment.contains((int[])nArray5) ? 1 : 0)) break block7;
            }
            n2 = llIllIlIII[1];
            "".length();
            if (-" ".length() < 0) return n2 != 0;
            return ((0xA8 ^ 0xA7) & ~(0xBE ^ 0xB1)) != 0;
        }
        n2 = llIllIlIII[0];
        return n2 != 0;
    }

    private static boolean lIllIlllIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean fN() {
        return llIllIlIII[0];
    }

    private static boolean lIllIlllIlIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlllIIIII(int n2) {
        return n2 == 0;
    }

    private static int lIllIlllIllII(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Override
    public boolean ae() {
        return llIllIlIII[0];
    }

    private static boolean lIllIlllIIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIllIllIllIII(String llllllllllllllllllIIIlIIIlIlllll, String llllllllllllllllllIIIlIIIlIllllI) {
        llllllllllllllllllIIIlIIIlIlllll = new String(Base64.getDecoder().decode(llllllllllllllllllIIIlIIIlIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIlIIIlIlllIl = new StringBuilder();
        char[] llllllllllllllllllIIIlIIIlIlllII = llllllllllllllllllIIIlIIIlIllllI.toCharArray();
        int llllllllllllllllllIIIlIIIlIllIll = llIllIlIII[0];
        char[] llllllllllllllllllIIIlIIIlIlIlIl = llllllllllllllllllIIIlIIIlIlllll.toCharArray();
        int llllllllllllllllllIIIlIIIlIlIlII = llllllllllllllllllIIIlIIIlIlIlIl.length;
        int llllllllllllllllllIIIlIIIlIlIIll = llIllIlIII[0];
        while (aE.lIllIllIlllll(llllllllllllllllllIIIlIIIlIlIIll, llllllllllllllllllIIIlIIIlIlIlII)) {
            char llllllllllllllllllIIIlIIIllIIIII = llllllllllllllllllIIIlIIIlIlIlIl[llllllllllllllllllIIIlIIIlIlIIll];
            llllllllllllllllllIIIlIIIlIlllIl.append((char)(llllllllllllllllllIIIlIIIllIIIII ^ llllllllllllllllllIIIlIIIlIlllII[llllllllllllllllllIIIlIIIlIllIll % llllllllllllllllllIIIlIIIlIlllII.length]));
            "".length();
            ++llllllllllllllllllIIIlIIIlIllIll;
            ++llllllllllllllllllIIIlIIIlIlIIll;
            "".length();
            if ((126 + 30 - -19 + 9 ^ 186 + 45 - 150 + 107) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIIlIIIlIlllIl);
    }

    private static boolean lIllIlllIIIIl(Object object) {
        return object != null;
    }

    @Override
    public int af() {
        aE.gm();
        return llIllIlIII[48];
    }

    private static void lIllIllIlllIl() {
        llIllIlIII = new int[113];
        aE.llIllIlIII[0] = (0x3A ^ 2 ^ (0x3B ^ 0x24)) & (0x98 ^ 0xB7 ^ (0x9F ^ 0x97) ^ -" ".length());
        aE.llIllIlIII[1] = " ".length();
        aE.llIllIlIII[2] = "  ".length();
        aE.llIllIlIII[3] = "   ".length();
        aE.llIllIlIII[4] = -(0xA2 ^ 0x8A) & (0xFFFFDBAF & 0x37FF);
        aE.llIllIlIII[5] = 0x8A ^ 0xC5 ^ (0x1C ^ 0x75);
        aE.llIllIlIII[6] = 0xFFFFD7B7 & 0x7ADF;
        aE.llIllIlIII[7] = 0xFFFF8FED & 0x77DB;
        aE.llIllIlIII[8] = 0x8F ^ 0x8B;
        aE.llIllIlIII[9] = 0xFFFF9F47 & Short.MAX_VALUE;
        aE.llIllIlIII[10] = 0xFFFFFF4A & 0x1FFD;
        aE.llIllIlIII[11] = -(0xFFFFFC11 & 0x53EF) & (0xFFFFDB7F & 0x75FB);
        aE.llIllIlIII[12] = 0xC7 ^ 0xC2;
        aE.llIllIlIII[13] = 0x49 ^ 0x43;
        aE.llIllIlIII[14] = 0x33 ^ 0x27;
        aE.llIllIlIII[15] = -(0xFFFF9A6F & 0x7D9D) & (0xFFFFDFFF & 0x3F6F);
        aE.llIllIlIII[16] = 0x92 ^ 0x9D;
        aE.llIllIlIII[17] = 66 + 110 - 3 + 17 ^ 49 + 73 - 22 + 84;
        aE.llIllIlIII[18] = 0xB0 ^ 0xC5 ^ (0x78 ^ 0xA);
        aE.llIllIlIII[19] = 7 + 9 - -220 + 9;
        aE.llIllIlIII[20] = 0xE ^ 6;
        aE.llIllIlIII[21] = 139 + 33 - 139 + 130 ^ 63 + 168 - 120 + 59;
        aE.llIllIlIII[22] = 0x50 ^ 0x4F ^ (0x42 ^ 0x56);
        aE.llIllIlIII[23] = 0x92 ^ 0x9E;
        aE.llIllIlIII[24] = 0x73 ^ 0x75 ^ (0x46 ^ 0x4D);
        aE.llIllIlIII[25] = 0xB6 ^ 0xB8;
        aE.llIllIlIII[26] = 81 + 50 - 110 + 110 ^ 59 + 137 - 98 + 49;
        aE.llIllIlIII[27] = 0x49 ^ 0x58;
        aE.llIllIlIII[28] = 5 ^ 0x1C;
        aE.llIllIlIII[29] = 0xD6 ^ 0xC4;
        aE.llIllIlIII[30] = 4 + 120 - -32 + 13 ^ 32 + 8 - -92 + 54;
        aE.llIllIlIII[31] = 0x6E ^ 0x41 ^ (0xAA ^ 0x90);
        aE.llIllIlIII[32] = 0xB8 ^ 0xAE;
        aE.llIllIlIII[33] = 0x88 ^ 0x9F;
        aE.llIllIlIII[34] = 0x5F ^ 0x47;
        aE.llIllIlIII[35] = 0xA7 ^ 0xBD;
        aE.llIllIlIII[36] = 155 + 139 - 243 + 129 ^ 23 + 53 - -7 + 92;
        aE.llIllIlIII[37] = 0x72 ^ 0x63 ^ (0xCA ^ 0xC7);
        aE.llIllIlIII[38] = 3 ^ 0x1E;
        aE.llIllIlIII[39] = 0xFFFFFFA5 & 0xFFA;
        aE.llIllIlIII[40] = 0x46 ^ 0x58;
        aE.llIllIlIII[41] = 0xFFFFA7BF & 0x5FFA;
        aE.llIllIlIII[42] = -(0xFFFFC7C8 & 0x7C7F) & (0xFFFFFFFF & 0x45FF);
        aE.llIllIlIII[43] = -(0xFFFFDDF6 & 0x7A7B) & (0xFFFFDFFD & 0x7BF7);
        aE.llIllIlIII[44] = -(0xFFFF87E3 & 0x7ADD) & (0xFFFFC3EE & 0x3FFD);
        aE.llIllIlIII[45] = 0xFFFFB771 & 0x79DF;
        aE.llIllIlIII[46] = 0xFFFFFA9C & 0x3FFB;
        aE.llIllIlIII[47] = -(0xD9 ^ 0x98) & (0xFFFFAFDE & 0x57FF);
        aE.llIllIlIII[48] = 197 + 119 - 240 + 146 ^ 179 + 40 - 113 + 80;
        aE.llIllIlIII[49] = 0x5C ^ 0x43;
        aE.llIllIlIII[50] = 0x57 ^ 0x34;
        aE.llIllIlIII[51] = 89 + 21 - 30 + 72 ^ 163 + 177 - 308 + 152;
        aE.llIllIlIII[52] = 0x32 ^ 0x7D ^ (0x34 ^ 0x5A);
        aE.llIllIlIII[53] = 0x86 ^ 0xA1 ^ (0x21 ^ 0x24);
        aE.llIllIlIII[54] = 206 + 21 - 52 + 49 ^ 9 + 12 - -120 + 54;
        aE.llIllIlIII[55] = 0x29 ^ 0x5B ^ (0x76 ^ 0x20);
        aE.llIllIlIII[56] = 0x45 ^ 0x60;
        aE.llIllIlIII[57] = -(0xFFFFFAFF & 0x756B) & (0xFFFFFFFE & 0x7CFF);
        aE.llIllIlIII[58] = -(0xFFFFFB6F & 0x65D9) & (0xFFFFFFFB & 0x6DDF);
        aE.llIllIlIII[59] = -(0xFFFFB45C & 0x5BBF) & (0xFFFFFFFF & 0x1CDF);
        aE.llIllIlIII[60] = 0xFFFFBDDF & 0x4F72;
        aE.llIllIlIII[61] = 0x26 ^ 1;
        aE.llIllIlIII[62] = 0x46 ^ 0x6E;
        aE.llIllIlIII[63] = 0x15 ^ 0x3C;
        aE.llIllIlIII[64] = 46 + 126 - 101 + 59 ^ 149 + 147 - 249 + 121;
        aE.llIllIlIII[65] = 0xBE ^ 0x98 ^ (0x91 ^ 0x9C);
        aE.llIllIlIII[66] = 0x73 ^ 0x7E ^ (0x68 ^ 0x49);
        aE.llIllIlIII[67] = 0x13 ^ 0x64 ^ (0xC7 ^ 0x9D);
        aE.llIllIlIII[68] = 0x82 ^ 0xAC;
        aE.llIllIlIII[69] = 0xEA ^ 0xC5;
        aE.llIllIlIII[70] = 0x85 ^ 0xB5;
        aE.llIllIlIII[71] = 0x1F ^ 0x2E;
        aE.llIllIlIII[72] = 0xF2 ^ 0xC0;
        aE.llIllIlIII[73] = 0x95 ^ 0xBB ^ (0xDB ^ 0xC6);
        aE.llIllIlIII[74] = 0x11 ^ 0x25;
        aE.llIllIlIII[75] = 0x1A ^ 0x63 ^ (0x42 ^ 0xE);
        aE.llIllIlIII[76] = 0x81 ^ 0xB7;
        aE.llIllIlIII[77] = 100 + 84 - 36 + 24 ^ 42 + 8 - -30 + 75;
        aE.llIllIlIII[78] = 0x27 ^ 0x15 ^ (0xB6 ^ 0xBC);
        aE.llIllIlIII[79] = 0xB8 ^ 0x81;
        aE.llIllIlIII[80] = 0x8C ^ 0xBD ^ (0xBC ^ 0xB7);
        aE.llIllIlIII[81] = 0x9E ^ 0xA5;
        aE.llIllIlIII[82] = 0x54 ^ 0x5B ^ (0x16 ^ 0x25);
        aE.llIllIlIII[83] = 0x99 ^ 0xA5 ^ " ".length();
        aE.llIllIlIII[84] = 0x6A ^ 0x54;
        aE.llIllIlIII[85] = 0x65 ^ 0x7B ^ (0x74 ^ 0x55);
        aE.llIllIlIII[86] = 0xF9 ^ 0x95 ^ (0xA3 ^ 0x8F);
        aE.llIllIlIII[87] = 0x6F ^ 0x69 ^ (0xED ^ 0xAA);
        aE.llIllIlIII[88] = 27 + 220 - 116 + 103 ^ 72 + 165 - 216 + 147;
        aE.llIllIlIII[89] = 0xCC ^ 0x83 ^ (0xC8 ^ 0xC4);
        aE.llIllIlIII[90] = 0x1E ^ 0x70 ^ (0x64 ^ 0x4E);
        aE.llIllIlIII[91] = 0x2F ^ 0x6A;
        aE.llIllIlIII[92] = 0x1D ^ 0x5B;
        aE.llIllIlIII[93] = 0x22 ^ 3 ^ (0x2B ^ 0x4D);
        aE.llIllIlIII[94] = 0x70 ^ 0x38;
        aE.llIllIlIII[95] = 0xC8 ^ 0x81;
        aE.llIllIlIII[96] = 142 + 0 - 63 + 118 ^ 51 + 88 - 92 + 96;
        aE.llIllIlIII[97] = 0xFFFFD7FB & 0x7FFD;
        aE.llIllIlIII[98] = 0xFFFFBFFD & 0x4BFE;
        aE.llIllIlIII[99] = 0xFFFF9CBF & 0x6FE7;
        aE.llIllIlIII[100] = 0xFFFF8CD9 & 0x7F2F;
        aE.llIllIlIII[101] = 0xFFFFBFB7 & 0x4CFB;
        aE.llIllIlIII[102] = 0xFFFF9C15 & 0x6FFE;
        aE.llIllIlIII[103] = 0xFFFFBCEB & 0x4FBF;
        aE.llIllIlIII[104] = -(0xFFFFBFB9 & 0x5067) & (0xFFFF9F7F & 0x7CBB);
        aE.llIllIlIII[105] = 0xFFFF8FF3 & 0x7CBE;
        aE.llIllIlIII[106] = 0xFFFF97F4 & 0x6EEB;
        aE.llIllIlIII[107] = -(0xFFFFF8D7 & 0x77BB) & (0xFFFFFFBF & 0x7EFF);
        aE.llIllIlIII[108] = 0xFFFF9EDD & 0x67F7;
        aE.llIllIlIII[109] = -(0x8F ^ 0xAE) & (0xFFFFBFBF & 0x4E6F);
        aE.llIllIlIII[110] = -(0xFFFFD933 & 0x77FD) & (0xFFFFD7FF & 0x7FFB);
        aE.llIllIlIII[111] = -(0xFFFFF85B & 0x47ED) & (0xFFFFCF7B & 0x7EFE);
        aE.llIllIlIII[112] = 0xFB ^ 0x83 ^ (0xB6 ^ 0x85);
    }

    private static int lIllIlllIlIll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    private static int lIllIlllIIlIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static void go() {
        if (aE.lIllIlllIIlII(Players.getLocal().getWorldLocation().distanceTo(nX), llIllIlIII[16])) {
            AccBuilderSotf.c = llIllIIllI[llIllIlIII[26]];
            Movement.walkTo((WorldPoint)nX);
            "".length();
            Time.sleepTicks((int)llIllIlIII[1]);
            "".length();
        }
        if (aE.lIllIlllIIllI(Players.getLocal().getWorldLocation().distanceTo(nX), llIllIlIII[16])) {
            if (aE.lIllIllIllllI(Dialog.canLevelUpContinue() ? 1 : 0)) {
                Dialog.close();
            }
            if (aE.lIllIlllIlIlI(aE.lIllIlllIlIll(System.currentTimeMillis(), oa))) {
                AccBuilderSotf.c = llIllIIllI[llIllIlIII[27]];
                int[] nArray = new int[llIllIlIII[1]];
                nArray[aE.llIllIlIII[0]] = oc;
                if (aE.lIllIllIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    int[] nArray2 = new int[llIllIlIII[1]];
                    nArray2[aE.llIllIlIII[0]] = oc;
                    if (aE.lIllIlllIIIll(Inventory.getFirst((int[])nArray2).getQuantity(), llIllIlIII[28])) {
                        int[] nArray3 = new int[llIllIlIII[1]];
                        nArray3[aE.llIllIlIII[0]] = oc;
                        Inventory.getFirst((int[])nArray3).interact(llIllIIllI[llIllIlIII[29]]);
                        Time.sleepTicks((int)llIllIlIII[1]);
                        "".length();
                    }
                }
                String[] stringArray = new String[llIllIlIII[1]];
                stringArray[aE.llIllIlIII[0]] = llIllIIllI[llIllIlIII[30]];
                if (aE.lIllIlllIIIIl(NPCs.getNearest((String[])stringArray)) && aE.lIllIlllIlIII(Players.getLocal().getInteracting()) && aE.lIllIlllIIIII(Players.getLocal().isMoving() ? 1 : 0)) {
                    String[] stringArray2 = new String[llIllIlIII[1]];
                    stringArray2[aE.llIllIlIII[0]] = llIllIIllI[llIllIlIII[14]];
                    NPCs.getNearest((String[])stringArray2).interact(llIllIIllI[llIllIlIII[31]]);
                    Time.sleepTicks((int)llIllIlIII[1]);
                    "".length();
                }
            }
            if (aE.lIllIlllIllIl(aE.lIllIlllIlIll(System.currentTimeMillis(), oa))) {
                AccBuilderSotf.c = llIllIIllI[llIllIlIII[32]];
                if (!aE.lIllIlllIlIlI(aE.lIllIlllIllII(e.w(), 30.0)) || aE.lIllIlllIIllI(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), llIllIlIII[8])) {
                    int[] nArray = new int[llIllIlIII[1]];
                    nArray[aE.llIllIlIII[0]] = llIllIlIII[11];
                    if (aE.lIllIllIllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                        int[] nArray4 = new int[llIllIlIII[1]];
                        nArray4[aE.llIllIlIII[0]] = llIllIlIII[11];
                        Inventory.getFirst((int[])nArray4).interact(llIllIIllI[llIllIlIII[33]]);
                        Time.sleepTicks((int)llIllIlIII[1]);
                        "".length();
                    }
                }
            }
        }
    }

    private static boolean lIllIlllIIIlI(int n2) {
        return n2 > 0;
    }

    private static String lIllIllIlIllI(String llllllllllllllllllIIIlIIIlllllII, String llllllllllllllllllIIIlIIIllllIIl) {
        try {
            SecretKeySpec llllllllllllllllllIIIlIIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIIIllllIIl.getBytes(StandardCharsets.UTF_8)), llIllIlIII[20]), "DES");
            Cipher llllllllllllllllllIIIlIIIllllllI = Cipher.getInstance("DES");
            llllllllllllllllllIIIlIIIllllllI.init(llIllIlIII[2], llllllllllllllllllIIIlIIIlllllll);
            return new String(llllllllllllllllllIIIlIIIllllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIlIIIlllllIl) {
            llllllllllllllllllIIIlIIIlllllIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIllIlIlll(String llllllllllllllllllIIIlIIIllIllll, String llllllllllllllllllIIIlIIIllIlllI) {
        try {
            SecretKeySpec llllllllllllllllllIIIlIIIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIIIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIlIIIlllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIlIIIlllIIIl.init(llIllIlIII[2], llllllllllllllllllIIIlIIIlllIIlI);
            return new String(llllllllllllllllllIIIlIIIlllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIIIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIlIIIlllIIII) {
            llllllllllllllllllIIIlIIIlllIIII.printStackTrace();
            return null;
        }
    }

    public static void gm() {
        block20: {
            block21: {
                block22: {
                    block26: {
                        block25: {
                            block23: {
                                block24: {
                                    if (aE.lIllIllIllllI(bt ? 1 : 0)) {
                                        AccBuilderSotf.c = llIllIIllI[llIllIlIII[0]];
                                        b.a(bv);
                                        if (aE.lIllIllIlllll(bv.size(), llIllIlIII[1])) {
                                            System.out.println(llIllIIllI[llIllIlIII[1]]);
                                            bt = llIllIlIII[0];
                                        }
                                    }
                                    if (!aE.lIllIlllIIIII(bt ? 1 : 0)) break block20;
                                    if (!aE.lIllIlllIIIII(aE.an() ? 1 : 0)) break block21;
                                    BankLocation llllllllllllllllllIIIlIIlIIIIllI = BankLocation.getNearest();
                                    if (aE.lIllIlllIIIIl(llllllllllllllllllIIIlIIlIIIIllI) && aE.lIllIlllIIIII(llllllllllllllllllIIIlIIlIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        AccBuilderSotf.c = llIllIIllI[llIllIlIII[2]];
                                        a.a(llllllllllllllllllIIIlIIlIIIIllI);
                                    }
                                    if (!aE.lIllIlllIIIIl(llllllllllllllllllIIIlIIlIIIIllI) || !aE.lIllIllIllllI(llllllllllllllllllIIIlIIlIIIIllI.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) break block22;
                                    AccBuilderSotf.c = llIllIIllI[llIllIlIII[3]];
                                    if (aE.lIllIlllIIIII(Bank.isOpen() ? 1 : 0)) {
                                        a.a();
                                        Time.sleepUntil(() -> Bank.isOpen(), (int)llIllIlIII[4]);
                                        "".length();
                                    }
                                    if (!aE.lIllIllIllllI(Bank.isOpen() ? 1 : 0)) break block22;
                                    if (aE.lIllIlllIIIlI(Inventory.getAll().size())) {
                                        Bank.depositInventory();
                                        Time.sleepTicks((int)llIllIlIII[3]);
                                        "".length();
                                    }
                                    if (!aE.lIllIlllIIIll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[5])) break block23;
                                    int[] nArray = new int[llIllIlIII[1]];
                                    nArray[aE.llIllIlIII[0]] = llIllIlIII[6];
                                    if (!aE.lIllIllIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block24;
                                    int[] nArray2 = new int[llIllIlIII[1]];
                                    nArray2[aE.llIllIlIII[0]] = llIllIlIII[7];
                                    if (!aE.lIllIlllIIIII(Bank.contains((int[])nArray2) ? 1 : 0)) break block23;
                                }
                                aE.Q();
                                System.out.println(llIllIIllI[llIllIlIII[8]]);
                                bt = llIllIlIII[1];
                                return;
                            }
                            int[] nArray = new int[llIllIlIII[1]];
                            nArray[aE.llIllIlIII[0]] = llIllIlIII[9];
                            if (!aE.lIllIllIllllI(Bank.contains((int[])nArray) ? 1 : 0)) break block25;
                            int[] nArray3 = new int[llIllIlIII[1]];
                            nArray3[aE.llIllIlIII[0]] = llIllIlIII[10];
                            if (!aE.lIllIllIllllI(Bank.contains((int[])nArray3) ? 1 : 0)) break block25;
                            int[] nArray4 = new int[llIllIlIII[1]];
                            nArray4[aE.llIllIlIII[0]] = llIllIlIII[11];
                            if (!aE.lIllIlllIIIII(Bank.contains((int[])nArray4) ? 1 : 0)) break block26;
                        }
                        aE.Q();
                        System.out.println(llIllIIllI[llIllIlIII[12]]);
                        bt = llIllIlIII[1];
                        return;
                    }
                    if (aE.lIllIllIlllll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[12])) {
                        a.a(llIllIlIII[10], llIllIlIII[12]);
                        a.a(llIllIlIII[9], llIllIlIII[12]);
                        a.a(llIllIlIII[11], llIllIlIII[13]);
                    }
                    if (aE.lIllIlllIIIll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[12]) && aE.lIllIllIlllll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[5])) {
                        a.a(llIllIlIII[9], llIllIlIII[12]);
                    }
                    if (aE.lIllIlllIIIll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[5])) {
                        a.a(llIllIlIII[6], llIllIlIII[12]);
                        a.a(llIllIlIII[7], llIllIlIII[14]);
                        a.a(llIllIlIII[15], llIllIlIII[14]);
                    }
                    cG += llIllIlIII[1];
                }
                if (aE.lIllIlllIIlII(Inventory.getFreeSlots(), llIllIlIII[16])) {
                    cG += llIllIlIII[1];
                }
            }
            if (aE.lIllIllIllllI(aE.an() ? 1 : 0) && aE.lIllIlllIIIlI(cG)) {
                if (aE.lIllIllIllllI(Dialog.isOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (aE.lIllIllIlllll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[12])) {
                    aE.go();
                }
                if (aE.lIllIlllIIIll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[12]) && aE.lIllIllIlllll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[5])) {
                    aE.gp();
                }
                if (aE.lIllIlllIIIll(Skills.getLevel((Skill)Skill.THIEVING), llIllIlIII[5])) {
                    aE.gn();
                }
            }
        }
    }
}

