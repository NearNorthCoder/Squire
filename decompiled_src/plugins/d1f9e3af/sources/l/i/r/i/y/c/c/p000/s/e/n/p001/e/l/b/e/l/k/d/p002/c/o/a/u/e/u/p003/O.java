package l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003;

import gg.squire.account.AccBuilderEasyClues;
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
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.O  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/O.class */
public class O implements W {
    static /* synthetic */ boolean cm;
    static /* synthetic */ int cl;
    static /* synthetic */ int bT;
    private static final /* synthetic */ String[] jm;
    private static /* synthetic */ String[] lIlIlIlII;
    public static /* synthetic */ WorldPoint jn;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ int[] lIlIlIlll;

    static {
        lIIlIIIIIlIl();
        lIIlIIIIIlII();
        String[] strArr = new String[lIlIlIlll[15]];
        strArr[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[64]];
        strArr[lIlIlIlll[1]] = lIlIlIlII[lIlIlIlll[65]];
        strArr[lIlIlIlll[3]] = lIlIlIlII[lIlIlIlll[66]];
        strArr[lIlIlIlll[5]] = lIlIlIlII[lIlIlIlll[67]];
        strArr[lIlIlIlll[6]] = lIlIlIlII[lIlIlIlll[68]];
        strArr[lIlIlIlll[8]] = lIlIlIlII[lIlIlIlll[69]];
        strArr[lIlIlIlll[10]] = lIlIlIlII[lIlIlIlll[70]];
        jm = strArr;
        bv = new ArrayList();
        jn = new WorldPoint(lIlIlIlll[71], lIlIlIlll[72], lIlIlIlll[0]);
        bT = lIlIlIlll[0];
    }

    private static boolean lIIlIIIIlllI(int i, int i2) {
        return i == i2;
    }

    private static void cr() {
        String[] strArr = new String[lIlIlIlll[1]];
        strArr[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[51]];
        if (lIIlIIIIlIII(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIlIlIlll[1]];
            strArr2[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[52]];
            if (!lIIlIIIIIllI(Inventory.contains(strArr2) ? 1 : 0)) {
                return;
            }
        }
        int[] iArr = new int[lIlIlIlll[1]];
        iArr[lIlIlIlll[0]] = lIlIlIlll[9];
        if (lIIlIIIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
            if (lIIlIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                Time.sleepTicks(C0004e.c(lIlIlIlll[3], lIlIlIlll[5]));
                "".length();
            }
            AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[53]];
            String[] strArr3 = new String[lIlIlIlll[1]];
            strArr3[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[54]];
            Item first = Inventory.getFirst(strArr3);
            String[] strArr4 = new String[lIlIlIlll[1]];
            strArr4[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[55]];
            Item first2 = Inventory.getFirst(strArr4);
            int[] iArr2 = new int[lIlIlIlll[1]];
            iArr2[lIlIlIlll[0]] = lIlIlIlll[9];
            Item first3 = Inventory.getFirst(iArr2);
            if (lIIlIIIIlIIl(first) && lIIlIIIIlIIl(first3)) {
                first.useOn(first3);
                Time.sleepTicks(lIlIlIlll[1]);
                "".length();
            }
            int[] iArr3 = new int[lIlIlIlll[1]];
            iArr3[lIlIlIlll[0]] = lIlIlIlll[9];
            Item first4 = Inventory.getFirst(iArr3);
            if (lIIlIIIIlIIl(first2) && lIIlIIIIlIIl(first4)) {
                first2.useOn(first4);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e6, code lost:
        if (lIIlIIIIIlll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.O.lIlIlIlll[5]) != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[lIlIlIlll[1]];
        iArr4[lIlIlIlll[0]] = lIlIlIlll[11];
        if (lIIlIIIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIlIlIlll[11], lIlIlIlll[1], lIlIlIlll[56]));
            "".length();
        }
        int[] iArr5 = new int[lIlIlIlll[1]];
        iArr5[lIlIlIlll[0]] = lIlIlIlll[12];
        if (lIIlIIIIlIII(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIlIlIlll[12], lIlIlIlll[1], lIlIlIlll[56]));
            "".length();
        }
        int[] iArr6 = new int[lIlIlIlll[1]];
        iArr6[lIlIlIlll[0]] = lIlIlIlll[9];
        if (lIIlIIIIIllI(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIlIlIlll[1]];
            iArr7[lIlIlIlll[0]] = lIlIlIlll[9];
            if (lIIlIIIIIllI(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlIlIlll[1]];
                iArr8[lIlIlIlll[0]] = lIlIlIlll[9];
            }
            iArr = new int[lIlIlIlll[1]];
            iArr[lIlIlIlll[0]] = lIlIlIlll[14];
            if (lIIlIIIIlIII(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIlIlIlll[14], lIlIlIlll[8], lIlIlIlll[56]));
                "".length();
            }
            if (lIIlIIIIlIII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lIlIlIlII[lIlIlIlll[63]]);
            }) ? 1 : 0)) {
                bv.add(new C0003d(lIlIlIlll[57], lIlIlIlll[8], lIlIlIlll[58]));
                "".length();
            }
            iArr2 = new int[lIlIlIlll[1]];
            iArr2[lIlIlIlll[0]] = lIlIlIlll[59];
            if (lIIlIIIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIlIlIlll[59], lIlIlIlll[54], lIlIlIlll[60]));
                "".length();
            }
            iArr3 = new int[lIlIlIlll[1]];
            iArr3[lIlIlIlll[0]] = lIlIlIlll[13];
            if (lIIlIIIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
                return;
            }
            bv.add(new C0003d(lIlIlIlll[13], lIlIlIlll[8], C0008i.bq));
            "".length();
            return;
        }
        bv.add(new C0003d(lIlIlIlll[9], lIlIlIlll[5], lIlIlIlll[56]));
        "".length();
        iArr = new int[lIlIlIlll[1]];
        iArr[lIlIlIlll[0]] = lIlIlIlll[14];
        if (lIIlIIIIlIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        if (lIIlIIIIlIII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lIlIlIlII[lIlIlIlll[63]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[lIlIlIlll[1]];
        iArr2[lIlIlIlll[0]] = lIlIlIlll[59];
        if (lIIlIIIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIlIlIlll[1]];
        iArr3[lIlIlIlll[0]] = lIlIlIlll[13];
        if (lIIlIIIIlIII(Bank.contains(iArr3) ? 1 : 0)) {
        }
    }

    private static boolean lIIlIIIIlIll(int i, int i2) {
        return i > i2;
    }

    private static String lIIIllllIIII(String lllIIlIllIlIll, String lllIIlIllIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIlIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIlIllIllll = Cipher.getInstance("Blowfish");
            lllIIlIllIllll.init(lIlIlIlll[3], secretKeySpec);
            return new String(lllIIlIllIllll.doFinal(Base64.getDecoder().decode(lllIIlIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIlIllIlllI) {
            lllIIlIllIlllI.printStackTrace();
            return null;
        }
    }

    private static String lIIIllllIIIl(String lllIIlIllllIlI, String lllIIlIllllIIl) {
        try {
            SecretKeySpec lllIIlIlllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIllllIIl.getBytes(StandardCharsets.UTF_8)), lIlIlIlll[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIlll[3], lllIIlIlllllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIlIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIlIllllIll) {
            lllIIlIllllIll.printStackTrace();
            return null;
        }
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            cq();
            "".length();
            if (0 != 0) {
                return (66 ^ 16) & ((214 ^ 132) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIlIlIlll[61];
    }

    private static void lIIlIIIIIlII() {
        lIlIlIlII = new String[lIlIlIlll[73]];
        lIlIlIlII[lIlIlIlll[0]] = lIIIlllIllll("MhIeDgMXRw4TCB0U", "pgggm");
        lIlIlIlII[lIlIlIlll[1]] = lIIIlllIllll("NyYpCAcZKiNBFgQ2Lg8TUSYzBBkCY2cSAxg7JAkdHyhnAxUSJGcVG1E+MgQHBQ==", "qOGat");
        lIlIlIlII[lIlIlIlll[3]] = lIIIllllIIII("nIOa594YyaI=", "VLUlq");
        lIlIlIlII[lIlIlIlll[5]] = lIIIlllIllll("IxcgPTUMAj86NU0COXQwDBg9", "mvVTR");
        lIlIlIlII[lIlIlIlll[6]] = lIIIllllIIIl("CYxBaEPKd3yl4Iv+lsPXsQ==", "kGstv");
        lIlIlIlII[lIlIlIlll[8]] = lIIIllllIIII("yQ7C7fZNaGuNXx3Vk3V+6IXj+/P2WnTW", "AVqYs");
        lIlIlIlII[lIlIlIlll[10]] = lIIIllllIIII("pGAKUvHcUQWIF9pYXLcx3Ohq/rgviP7gwzgoUwavbtZ0WWCJ6B/PdMy671mSLaVmog0Y2Rmlsyc=", "vShUv");
        lIlIlIlII[lIlIlIlll[15]] = lIIIllllIIII("cffc8ZNdY9JBOrdOKTJt4fIOXQDWp89IL/HLiWAgtFFLyGQAmRKio/pjDBj8oxtUTG228ScyQhA=", "zBvJd");
        lIlIlIlII[lIlIlIlll[16]] = lIIIlllIllll("FxYiWQ02VycNGCsD", "YwTyy");
        lIlIlIlII[lIlIlIlll[17]] = lIIIllllIIIl("S8NfAdKZ0X/c02I8H1J/6A==", "WyCub");
        lIlIlIlII[lIlIlIlll[18]] = lIIIllllIIIl("9X86ZZn26sF6o07QzpaTjA==", "urxNm");
        lIlIlIlII[lIlIlIlll[19]] = lIIIllllIIIl("hBnSAAY/0qs=", "arCRd");
        lIlIlIlII[lIlIlIlll[20]] = lIIIlllIllll("GDEdBQ==", "WAxkJ");
        lIlIlIlII[lIlIlIlll[21]] = lIIIllllIIII("NDfFG4EKdEyqQii+r7HEYOKIIPV9FYbg", "RWPMZ");
        lIlIlIlII[lIlIlIlll[25]] = lIIIlllIllll("MAAXBFUWFQc=", "rlbau");
        lIlIlIlII[lIlIlIlll[26]] = lIIIllllIIIl("V5Yeb7sA/K5/YU0IltSD1Q==", "GEqaw");
        lIlIlIlII[lIlIlIlll[27]] = lIIIllllIIII("J/34o6rIeLqPDs6lUwzOpA==", "bEXRK");
        lIlIlIlII[lIlIlIlll[28]] = lIIIllllIIII("DiGcAH8p7fTvlbhQpZZ8yQ==", "clWul");
        lIlIlIlII[lIlIlIlll[29]] = lIIIlllIllll("ITwBPFcHKRE=", "cPtYw");
        lIlIlIlII[lIlIlIlll[30]] = lIIIllllIIIl("WbWBA8vfUqUTrM3cYoMnk+UpvmJwvdQp", "KojKK");
        lIlIlIlII[lIlIlIlll[31]] = lIIIlllIllll("GTwkKAkzbiIpDDonK2YDNycp", "VNEFn");
        lIlIlIlII[lIlIlIlll[32]] = lIIIllllIIIl("DRsaoTByrjbSQQei0fYSVA==", "eXMKY");
        lIlIlIlII[lIlIlIlll[33]] = lIIIllllIIIl("sD5LiGaHaWqs6xDCGs5eywEiQegJE0Ov", "izbYy");
        lIlIlIlII[lIlIlIlll[34]] = lIIIllllIIII("kOI5feAKtOWRFUPeFnBi196c99iXCutr", "sISgw");
        lIlIlIlII[lIlIlIlll[36]] = lIIIllllIIIl("u3F5u9EJFtDr4s/7IHl/0ZL2g6E+F26/", "gTfRu");
        lIlIlIlII[lIlIlIlll[37]] = lIIIlllIllll("NgAwP28TAyc2JhpMKDsmGA==", "tlEZO");
        lIlIlIlII[lIlIlIlll[38]] = lIIIllllIIII("clJRLI13MNhZxeDfmNdFdQ==", "CydnA");
        lIlIlIlII[lIlIlIlll[39]] = lIIIllllIIIl("wlD7eXNdUc3KvNrLIh7iJQ==", "bsUlD");
        lIlIlIlII[lIlIlIlll[40]] = lIIIllllIIIl("UvjYDHdWhgIUl81YkscqUSW8pZ9towro", "IFmAs");
        lIlIlIlII[lIlIlIlll[42]] = lIIIllllIIII("xZ/dsv/sRqSb5gnGV2lIuaRqmg31mYsi", "DjGug");
        lIlIlIlII[lIlIlIlll[43]] = lIIIllllIIII("PyqYqx52qKfvjNk+0J1t1g==", "lOxlG");
        lIlIlIlII[lIlIlIlll[44]] = lIIIlllIllll("NjMUMyQQOloUMx8iFDksFA==", "qVzVV");
        lIlIlIlII[lIlIlIlll[46]] = lIIIllllIIII("XEb6IvRacV3A9/Ir1jeYEzzoSlV+L6gO", "pyKXT");
        lIlIlIlII[lIlIlIlll[47]] = lIIIllllIIII("l3iMpGI0peDS5feV53YYdg==", "qjVis");
        lIlIlIlII[lIlIlIlll[48]] = lIIIllllIIIl("2rjVakRB5va6jb9kW6xIXjflqXn0gSOT", "EXtUN");
        lIlIlIlII[lIlIlIlll[49]] = lIIIlllIllll("JTRmOTEXcSsxMAE4KD9jAyQjKzdSIjMoMx44IytvUiIxMTcROS82JFIlKXgBJwgPFgQ=", "rQFXC");
        lIlIlIlII[lIlIlIlll[50]] = lIIIlllIllll("HBR4JgsuUTUuCjgYNiBZOgQ9NA1rAi03CScYPTRVawIvLg0oGTEpHmsFN2c7HigRCT4=", "KqXGy");
        lIlIlIlII[lIlIlIlll[51]] = lIIIlllIllll("ISQMEEQHMRw=", "cHyud");
        lIlIlIlII[lIlIlIlll[52]] = lIIIlllIllll("DAQ3FAUmVjIDBw==", "CvVzb");
        lIlIlIlII[lIlIlIlll[53]] = lIIIlllIllll("JiADOy5COBg4JhA=", "bYjUI");
        lIlIlIlII[lIlIlIlll[54]] = lIIIllllIIII("xtg2pySMMRoC2bwV08HlwQ==", "qqdMO");
        lIlIlIlII[lIlIlIlll[55]] = lIIIllllIIIl("iioFUUV3xeet370iMmuIZA==", "ClAGS");
        lIlIlIlII[lIlIlIlll[62]] = lIIIllllIIII("fcdwRpfcKMzWzfjezpeGUB+UaAm1ckY5", "Ckivm");
        lIlIlIlII[lIlIlIlll[63]] = lIIIlllIllll("OgA9NkYnD3MmAykFJzlGYA==", "HiSQf");
        lIlIlIlII[lIlIlIlll[64]] = lIIIllllIIIl("CcnopFmA2GE=", "GufVi");
        lIlIlIlII[lIlIlIlll[65]] = lIIIllllIIIl("VyPCrjfhjFlVrz4QSGfuZbzTtT4HkG4D9lK6qLg1lMVH7Szhz9hyd4lTOtPSsbxOhlZJ9PlFXY4=", "DFuwx");
        lIlIlIlII[lIlIlIlll[66]] = lIIIlllIllll("Jw8KJ2YRBQQmMlAGSzcvFgEOISMeE0swKRwIHiF5", "pgkSF");
        lIlIlIlII[lIlIlIlll[67]] = lIIIlllIllll("C0EHNw8nQRw5FCdBACQYLAYKdhgwDAAjC2IJCiQcbA==", "BaoVy");
        lIlIlIlII[lIlIlIlll[68]] = lIIIlllIllll("Gno9Djg2eiYAIzZ6NwM7Nno0HSM8LydPJjYoMEE=", "SZUoN");
        lIlIlIlII[lIlIlIlll[69]] = lIIIllllIIII("7Qa9bSXeNUj0NJ7zfDMnPkkwt6EJfz/Qk54Lb/uxZOA=", "ofnrt");
        lIlIlIlII[lIlIlIlll[70]] = lIIIlllIllll("O10uLkUeHyM0AFIDLTdFBhViKxFc", "rzBBe");
    }

    private static boolean lIIlIIIlIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIIIIllII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x04c4, code lost:
        if (lIIlIIIIllIl(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0521, code lost:
        if (lIIlIIIIIllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v321, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v330, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v365, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v84, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v42, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void cq() {
        if (lIIlIIIIIllI(bt ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[0]];
            C0001b.a(bv);
            if (lIIlIIIIIlll(bv.size(), lIlIlIlll[1])) {
                System.out.println(lIlIlIlII[lIlIlIlll[1]]);
                bt = lIlIlIlll[0];
            }
        }
        if (lIIlIIIIlIII(bt ? 1 : 0)) {
            if (lIIlIIIIIllI(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIlIIIIIlll(Movement.getRunEnergy(), lIlIlIlll[2]) && lIIlIIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                Inventory.getFirst(C0005f.aV).interact(lIlIlIlII[lIlIlIlll[3]]);
                Time.sleepTicks(lIlIlIlll[1]);
                "".length();
            }
            if (lIIlIIIIlIII(ab() ? 1 : 0) && lIIlIIIIIlll(C0004e.j(lIlIlIlll[4]), lIlIlIlll[1])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIlIIIIlIIl(nearest) && lIIlIIIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[5]];
                    C0000a.a(nearest);
                }
                if (lIIlIIIIlIIl(nearest) && lIIlIIIIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIlIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[6]];
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIlIlll[7]);
                        "".length();
                    }
                    if (lIIlIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[8]];
                        if (lIIlIIIIlIlI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIlIlll[6]);
                            "".length();
                        }
                        if (lIIlIIIIlIlI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIlIlll[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIlIlIlll[1]];
                        iArr[lIlIlIlll[0]] = lIlIlIlll[9];
                        if (lIIlIIIIIllI(Bank.contains(iArr) ? 1 : 0)) {
                            int[] iArr2 = new int[lIlIlIlll[1]];
                            iArr2[lIlIlIlll[0]] = lIlIlIlll[9];
                            if (lIIlIIIIIlll(Bank.getFirst(iArr2).getQuantity(), lIlIlIlll[5])) {
                                af();
                                System.out.println(lIlIlIlII[lIlIlIlll[10]]);
                                bt = lIlIlIlll[1];
                                return;
                            }
                        }
                        int[] iArr3 = new int[lIlIlIlll[8]];
                        iArr3[lIlIlIlll[0]] = lIlIlIlll[11];
                        iArr3[lIlIlIlll[1]] = lIlIlIlll[12];
                        iArr3[lIlIlIlll[3]] = lIlIlIlll[9];
                        iArr3[lIlIlIlll[5]] = lIlIlIlll[13];
                        iArr3[lIlIlIlll[6]] = lIlIlIlll[14];
                        if (lIIlIIIIlIII(C0004e.b(iArr3) ? 1 : 0)) {
                            af();
                            System.out.println(lIlIlIlII[lIlIlIlll[15]]);
                            bt = lIlIlIlll[1];
                            return;
                        }
                    }
                    int[] iArr4 = new int[lIlIlIlll[8]];
                    iArr4[lIlIlIlll[0]] = lIlIlIlll[11];
                    iArr4[lIlIlIlll[1]] = lIlIlIlll[12];
                    iArr4[lIlIlIlll[3]] = lIlIlIlll[9];
                    iArr4[lIlIlIlll[5]] = lIlIlIlll[13];
                    iArr4[lIlIlIlll[6]] = lIlIlIlll[14];
                    if (lIIlIIIIIllI(C0004e.b(iArr4) ? 1 : 0)) {
                        Bank.withdraw(lIlIlIlll[11], lIlIlIlll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIlll[1]);
                        "".length();
                        Bank.withdraw(lIlIlIlll[12], lIlIlIlll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIlll[1]);
                        "".length();
                        Bank.withdraw(lIlIlIlll[9], lIlIlIlll[5], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIlll[1]);
                        "".length();
                        Bank.withdraw(lIlIlIlll[13], lIlIlIlll[1], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIlll[1]);
                        "".length();
                        Bank.withdraw(lIlIlIlll[14], lIlIlIlll[5], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(lIlIlIlll[1]);
                        "".length();
                        C0000a.b(C0005f.bf, lIlIlIlll[1]);
                        Time.sleepTicks(lIlIlIlll[5]);
                        "".length();
                    }
                }
            }
            if (lIIlIIIIIllI(ab() ? 1 : 0) && lIIlIIIIIlll(C0004e.j(lIlIlIlll[4]), lIlIlIlll[1])) {
                if (lIIlIIIIIlll(bT, lIlIlIlll[1])) {
                    C0004e.v();
                    bT += lIlIlIlll[1];
                }
                if (lIIlIIIIlIlI(bT)) {
                    if (lIIlIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(jn), lIlIlIlll[8])) {
                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[16]];
                        Movement.walkTo(jn);
                        "".length();
                        Time.sleepTicks(lIlIlIlll[1]);
                        "".length();
                    }
                    if (lIIlIIIIllII(Players.getLocal().getWorldLocation().distanceTo(jn), lIlIlIlll[8])) {
                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[17]];
                        String[] strArr = new String[lIlIlIlll[1]];
                        strArr[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[18]];
                        TileObject nearest2 = TileObjects.getNearest(strArr);
                        if (lIIlIIIIlIIl(nearest2)) {
                            String[] strArr2 = new String[lIlIlIlll[1]];
                            strArr2[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[19]];
                            if (lIIlIIIIIllI(nearest2.hasAction(strArr2) ? 1 : 0)) {
                                nearest2.interact(lIlIlIlII[lIlIlIlll[20]]);
                                Time.sleepTicks(lIlIlIlll[5]);
                                "".length();
                            }
                        }
                        C0006g.a(lIlIlIlII[lIlIlIlll[21]], jm);
                    }
                }
            }
            int[] iArr5 = new int[lIlIlIlll[1]];
            iArr5[lIlIlIlll[0]] = lIlIlIlll[22];
            if (lIIlIIIIlIIl(NPCs.getNearest(iArr5))) {
                int[] iArr6 = new int[lIlIlIlll[1]];
                iArr6[lIlIlIlll[0]] = lIlIlIlll[23];
                if (lIIlIIIIlIIl(NPCs.getNearest(iArr6))) {
                    int[] iArr7 = new int[lIlIlIlll[1]];
                    iArr7[lIlIlIlll[0]] = lIlIlIlll[24];
                }
            }
            C0006g.a(jm);
            if (lIIlIIIIlllI(C0004e.j(lIlIlIlll[4]), lIlIlIlll[5])) {
                String[] strArr3 = new String[lIlIlIlll[1]];
                strArr3[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[25]];
                if (lIIlIIIIlIII(Inventory.contains(strArr3) ? 1 : 0)) {
                    String[] strArr4 = new String[lIlIlIlll[1]];
                    strArr4[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[26]];
                }
                int[] iArr8 = new int[lIlIlIlll[1]];
                iArr8[lIlIlIlll[0]] = lIlIlIlll[9];
                if (lIIlIIIIIllI(Inventory.contains(iArr8) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[27]];
                    String[] strArr5 = new String[lIlIlIlll[1]];
                    strArr5[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[28]];
                    Item first = Inventory.getFirst(strArr5);
                    String[] strArr6 = new String[lIlIlIlll[1]];
                    strArr6[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[29]];
                    Item first2 = Inventory.getFirst(strArr6);
                    int[] iArr9 = new int[lIlIlIlll[1]];
                    iArr9[lIlIlIlll[0]] = lIlIlIlll[9];
                    Item first3 = Inventory.getFirst(iArr9);
                    if (lIIlIIIIlIIl(first) && lIIlIIIIlIIl(first3)) {
                        first.useOn(first3);
                        Time.sleepTicks(lIlIlIlll[1]);
                        "".length();
                    }
                    int[] iArr10 = new int[lIlIlIlll[1]];
                    iArr10[lIlIlIlll[0]] = lIlIlIlll[9];
                    Item first4 = Inventory.getFirst(iArr10);
                    if (lIIlIIIIlIIl(first2) && lIIlIIIIlIIl(first4)) {
                        first2.useOn(first4);
                    }
                }
            }
            if (lIIlIIIIlllI(C0004e.j(lIlIlIlll[4]), lIlIlIlll[5])) {
                int[] iArr11 = new int[lIlIlIlll[1]];
                iArr11[lIlIlIlll[0]] = lIlIlIlll[9];
                if (lIIlIIIIlIII(Inventory.contains(iArr11) ? 1 : 0)) {
                    String[] strArr7 = new String[lIlIlIlll[1]];
                    strArr7[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[30]];
                    if (lIIlIIIIlIII(Inventory.contains(strArr7) ? 1 : 0)) {
                        ck();
                    }
                }
            }
            if (lIIlIIIIlllI(C0004e.j(lIlIlIlll[4]), lIlIlIlll[5])) {
                int[] iArr12 = new int[lIlIlIlll[1]];
                iArr12[lIlIlIlll[0]] = lIlIlIlll[9];
                if (lIIlIIIIIllI(Inventory.contains(iArr12) ? 1 : 0)) {
                    String[] strArr8 = new String[lIlIlIlll[1]];
                    strArr8[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[31]];
                    if (lIIlIIIIIllI(Inventory.contains(strArr8) ? 1 : 0)) {
                        cl = lIlIlIlll[0];
                        if (lIIlIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(jn), lIlIlIlll[8])) {
                            AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[32]];
                            Movement.walkTo(jn);
                            "".length();
                            Time.sleepTicks(lIlIlIlll[1]);
                            "".length();
                        }
                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[33]];
                        C0006g.a(lIlIlIlII[lIlIlIlll[34]], jm, lIlIlIlll[1]);
                    }
                }
            }
            if (lIIlIIIIlllI(C0004e.j(lIlIlIlll[4]), lIlIlIlll[35])) {
                String[] strArr9 = new String[lIlIlIlll[1]];
                strArr9[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[36]];
                if (lIIlIIIIlIII(Inventory.contains(strArr9) ? 1 : 0)) {
                    ck();
                }
            }
            if (lIIlIIIIlllI(C0004e.j(lIlIlIlll[4]), lIlIlIlll[35])) {
                String[] strArr10 = new String[lIlIlIlll[1]];
                strArr10[lIlIlIlll[0]] = lIlIlIlII[lIlIlIlll[37]];
                if (lIIlIIIIIllI(Inventory.contains(strArr10) ? 1 : 0)) {
                    if (lIIlIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(jn), lIlIlIlll[8])) {
                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[38]];
                        Movement.walkTo(jn);
                        "".length();
                        Time.sleepTicks(lIlIlIlll[1]);
                        "".length();
                    }
                    AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[39]];
                    C0006g.a(lIlIlIlII[lIlIlIlll[40]], jm, lIlIlIlll[1]);
                }
            }
            if (lIIlIIIIlllI(C0004e.j(lIlIlIlll[4]), lIlIlIlll[41])) {
                int[] iArr13 = new int[lIlIlIlll[1]];
                iArr13[lIlIlIlll[0]] = lIlIlIlll[9];
                if (lIIlIIIIlIII(Inventory.contains(iArr13) ? 1 : 0)) {
                    ck();
                }
            }
            if (lIIlIIIIlllI(C0004e.j(lIlIlIlll[4]), lIlIlIlll[41])) {
                int[] iArr14 = new int[lIlIlIlll[1]];
                iArr14[lIlIlIlll[0]] = lIlIlIlll[9];
                if (lIIlIIIIIllI(Inventory.contains(iArr14) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[42]];
                    if (lIIlIIIIIlll(cl, lIlIlIlll[1])) {
                        an.pL += lIlIlIlll[1];
                        an.o(AccBuilderEasyClues.m);
                        cl += lIlIlIlll[1];
                        an.pL = lIlIlIlll[0];
                        cm = lIlIlIlll[0];
                    }
                    if (lIIlIIIIlIll(Players.getLocal().getWorldLocation().distanceTo(jn), lIlIlIlll[8])) {
                        AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[43]];
                        Movement.walkTo(jn);
                        "".length();
                        Time.sleepTicks(lIlIlIlll[1]);
                        "".length();
                    }
                    C0006g.a(lIlIlIlII[lIlIlIlll[44]], jm, lIlIlIlll[1]);
                }
            }
            Widget widget = Widgets.get(lIlIlIlll[45], lIlIlIlll[26]);
            if (lIIlIIIIlIIl(widget)) {
                widget.interact(lIlIlIlll[0]);
            }
            C0006g.a(new String[lIlIlIlll[0]]);
        }
    }

    private static boolean lIIlIIIIllIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIIIIIllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if ((!lIIlIIIIllll(C0004e.j(lIlIlIlll[4]), lIlIlIlll[10]) || lIIlIIIIllll(C0004e.j(lIlIlIlll[4]), lIlIlIlll[18])) && !lIIlIIIlIIII(Quests.getState(Quest.GOBLIN_DIPLOMACY), QuestState.FINISHED)) {
            return lIlIlIlll[0];
        }
        ?? r0 = lIlIlIlll[1];
        "".length();
        return "  ".length() > ((131 ^ 191) ^ (32 ^ 24)) ? ((((89 + 22) - 11) + 140) ^ (((194 + 15) - 198) + 186)) & (((121 ^ 84) ^ (147 ^ 139)) ^ (-" ".length())) : r0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIlIlIlll[1]];
        iArr[lIlIlIlll[0]] = lIlIlIlll[11];
        if (lIIlIIIIIllI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIlIlIlll[1]];
            iArr2[lIlIlIlll[0]] = lIlIlIlll[12];
            if (lIIlIIIIIllI(Inventory.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIlIlIlll[1]];
                iArr3[lIlIlIlll[0]] = lIlIlIlll[9];
                if (lIIlIIIIIllI(Inventory.contains(iArr3) ? 1 : 0)) {
                    ?? r0 = lIlIlIlll[1];
                    "".length();
                    return " ".length() != " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
        }
        return lIlIlIlll[0];
    }

    private static boolean lIIlIIIIlIII(int i) {
        return i == 0;
    }

    private static void lIIlIIIIIlIl() {
        lIlIlIlll = new int[74];
        lIlIlIlll[0] = ((((123 + 96) - 170) + 91) ^ (((87 + 3) - (-23)) + 19)) & (((90 ^ 1) ^ (12 ^ 95)) ^ (-" ".length()));
        lIlIlIlll[1] = " ".length();
        lIlIlIlll[2] = 111 ^ 36;
        lIlIlIlll[3] = "  ".length();
        lIlIlIlll[4] = (((91 + 103) - 24) + 8) ^ (((56 + 100) - 24) + 8);
        lIlIlIlll[5] = "   ".length();
        lIlIlIlll[6] = (231 ^ 181) ^ (225 ^ 183);
        lIlIlIlll[7] = (-11314) & 16313;
        lIlIlIlll[8] = 163 ^ 166;
        lIlIlIlll[9] = (-((-22697) & 31466)) & (-3085) & 12141;
        lIlIlIlll[10] = 146 ^ 148;
        lIlIlIlll[11] = (-12289) & 14055;
        lIlIlIlll[12] = (-12291) & 14059;
        lIlIlIlll[13] = (-18433) & 31057;
        lIlIlIlll[14] = (-((-2049) & 18485)) & (-3) & 24447;
        lIlIlIlll[15] = 16 ^ 23;
        lIlIlIlll[16] = (93 ^ 110) ^ (15 ^ 52);
        lIlIlIlll[17] = (((83 + 124) - 109) + 30) ^ (((106 + 136) - 224) + 119);
        lIlIlIlll[18] = 67 ^ 73;
        lIlIlIlll[19] = (125 ^ 54) ^ (118 ^ 54);
        lIlIlIlll[20] = 19 ^ 31;
        lIlIlIlll[21] = 113 ^ 124;
        lIlIlIlll[22] = (-((-11170) & 16381)) & (-8197) & 14079;
        lIlIlIlll[23] = (-21769) & 22441;
        lIlIlIlll[24] = (-25697) & 26367;
        lIlIlIlll[25] = 89 ^ 87;
        lIlIlIlll[26] = (185 ^ 192) ^ (69 ^ 51);
        lIlIlIlll[27] = 140 ^ 156;
        lIlIlIlll[28] = 151 ^ 134;
        lIlIlIlll[29] = 83 ^ 65;
        lIlIlIlll[30] = (33 ^ 77) ^ (((18 + 5) - 8) + 112);
        lIlIlIlll[31] = 168 ^ 188;
        lIlIlIlll[32] = 25 ^ 12;
        lIlIlIlll[33] = (((15 + 153) - 136) + 182) ^ (((130 + 183) - 156) + 35);
        lIlIlIlll[34] = (116 ^ 88) ^ (0 ^ 59);
        lIlIlIlll[35] = (-107) & 622;
        lIlIlIlll[36] = 182 ^ 174;
        lIlIlIlll[37] = (((10 + 14) - (-89)) + 47) ^ (((12 + 117) - (-25)) + 31);
        lIlIlIlll[38] = 217 ^ 195;
        lIlIlIlll[39] = 147 ^ 136;
        lIlIlIlll[40] = 78 ^ 82;
        lIlIlIlll[41] = (-((-1063) & 26287)) & (-6449) & 32701;
        lIlIlIlll[42] = (231 ^ 184) ^ (235 ^ 169);
        lIlIlIlll[43] = 116 ^ 106;
        lIlIlIlll[44] = 98 ^ 125;
        lIlIlIlll[45] = (-((-1) & 15083)) & (-1025) & 16383;
        lIlIlIlll[46] = 225 ^ 193;
        lIlIlIlll[47] = 39 ^ 6;
        lIlIlIlll[48] = (103 ^ 3) ^ (33 ^ 103);
        lIlIlIlll[49] = (93 ^ 56) ^ (28 ^ 90);
        lIlIlIlll[50] = 44 ^ 8;
        lIlIlIlll[51] = 96 ^ 69;
        lIlIlIlll[52] = (((174 + 122) - 285) + 177) ^ (((146 + 134) - 173) + 47);
        lIlIlIlll[53] = (200 ^ 155) ^ (237 ^ 153);
        lIlIlIlll[54] = 43 ^ 3;
        lIlIlIlll[55] = (((55 + 1) - (-24)) + 47) ^ (51 ^ 101);
        lIlIlIlll[56] = (-5251) & 14250;
        lIlIlIlll[57] = (-4403) & 16382;
        lIlIlIlll[58] = (-3650) & 28649;
        lIlIlIlll[59] = (-8241) & 16247;
        lIlIlIlll[60] = (-((-2875) & 15166)) & (-18577) & 32767;
        lIlIlIlll[61] = (((100 + 79) - 164) + 216) ^ (((22 + 13) - (-76)) + 20);
        lIlIlIlll[62] = (((72 + 161) - 158) + 91) ^ (((132 + 88) - 114) + 34);
        lIlIlIlll[63] = 23 ^ 60;
        lIlIlIlll[64] = (242 ^ 149) ^ (93 ^ 22);
        lIlIlIlll[65] = 86 ^ 123;
        lIlIlIlll[66] = (52 ^ 58) ^ (70 ^ 102);
        lIlIlIlll[67] = (((14 + 4) - (-13)) + 134) ^ (((70 + 41) - 8) + 35);
        lIlIlIlll[68] = (((80 + 118) - 144) + 127) ^ (((52 + 58) - (-4)) + 19);
        lIlIlIlll[69] = 73 ^ 120;
        lIlIlIlll[70] = (79 ^ 8) ^ (248 ^ 141);
        lIlIlIlll[71] = (-20497) & 23453;
        lIlIlIlll[72] = (-((-167) & 29422)) & (-1) & 32767;
        lIlIlIlll[73] = (((59 + 189) - 57) + 54) ^ (((75 + 85) - 144) + 182);
    }

    private static boolean lIIlIIIIlIlI(int i) {
        return i > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIlIlIlll[0];
    }

    private static boolean lIIlIIIIIlll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    private static void ck() {
        BankLocation nearest = BankLocation.getNearest();
        if (lIIlIIIIlIIl(nearest) && lIIlIIIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[46]];
            C0000a.a(nearest);
        }
        if (lIIlIIIIlIIl(nearest) && lIIlIIIIIllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (lIIlIIIIlIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[47]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, lIlIlIlll[7]);
                "".length();
            }
            if (lIIlIIIIIllI(Bank.isOpen() ? 1 : 0)) {
                AccBuilderEasyClues.c = lIlIlIlII[lIlIlIlll[48]];
                if (lIIlIIIIlIlI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(lIlIlIlll[6]);
                    "".length();
                }
                if (lIIlIIIIlIlI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(lIlIlIlll[3]);
                    "".length();
                }
                int[] iArr = new int[lIlIlIlll[1]];
                iArr[lIlIlIlll[0]] = lIlIlIlll[9];
                if (lIIlIIIIIllI(Bank.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[lIlIlIlll[1]];
                    iArr2[lIlIlIlll[0]] = lIlIlIlll[9];
                    if (lIIlIIIIIlll(Bank.getFirst(iArr2).getQuantity(), lIlIlIlll[5])) {
                        af();
                        System.out.println(lIlIlIlII[lIlIlIlll[49]]);
                        bt = lIlIlIlll[1];
                        return;
                    }
                }
                int[] iArr3 = new int[lIlIlIlll[8]];
                iArr3[lIlIlIlll[0]] = lIlIlIlll[11];
                iArr3[lIlIlIlll[1]] = lIlIlIlll[12];
                iArr3[lIlIlIlll[3]] = lIlIlIlll[9];
                iArr3[lIlIlIlll[5]] = lIlIlIlll[13];
                iArr3[lIlIlIlll[6]] = lIlIlIlll[14];
                if (lIIlIIIIlIII(C0004e.b(iArr3) ? 1 : 0)) {
                    af();
                    System.out.println(lIlIlIlII[lIlIlIlll[50]]);
                    bt = lIlIlIlll[1];
                    return;
                }
            }
            int[] iArr4 = new int[lIlIlIlll[8]];
            iArr4[lIlIlIlll[0]] = lIlIlIlll[11];
            iArr4[lIlIlIlll[1]] = lIlIlIlll[12];
            iArr4[lIlIlIlll[3]] = lIlIlIlll[9];
            iArr4[lIlIlIlll[5]] = lIlIlIlll[13];
            iArr4[lIlIlIlll[6]] = lIlIlIlll[14];
            if (lIIlIIIIIllI(C0004e.b(iArr4) ? 1 : 0)) {
                Bank.withdraw(lIlIlIlll[11], lIlIlIlll[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(lIlIlIlll[1]);
                "".length();
                Bank.withdraw(lIlIlIlll[12], lIlIlIlll[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(lIlIlIlll[1]);
                "".length();
                Bank.withdraw(lIlIlIlll[9], lIlIlIlll[5], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(lIlIlIlll[1]);
                "".length();
                Bank.withdraw(lIlIlIlll[13], lIlIlIlll[1], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(lIlIlIlll[1]);
                "".length();
                Bank.withdraw(lIlIlIlll[14], lIlIlIlll[5], Bank.WithdrawMode.DEFAULT);
                Time.sleepTicks(lIlIlIlll[1]);
                "".length();
                C0000a.b(C0005f.bf, lIlIlIlll[1]);
                Time.sleepTicks(lIlIlIlll[5]);
                "".length();
                Bank.close();
                cr();
            }
        }
    }

    private static String lIIIlllIllll(String lllIIlIlIlllIl, String lllIIlIlIlllII) {
        String lllIIlIlIlllIl2 = new String(Base64.getDecoder().decode(lllIIlIlIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIlIlIllIll = new StringBuilder();
        char[] charArray = lllIIlIlIlllII.toCharArray();
        int lllIIlIlIllIIl = lIlIlIlll[0];
        char[] charArray2 = lllIIlIlIlllIl2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlIlll[0];
        while (lIIlIIIIIlll(i, length)) {
            char lllIIlIlIllllI = charArray2[i];
            lllIIlIlIllIll.append((char) (lllIIlIlIllllI ^ charArray[lllIIlIlIllIIl % charArray.length]));
            "".length();
            lllIIlIlIllIIl++;
            i++;
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllIIlIlIllIll);
    }

    private static boolean lIIlIIIIllll(int i, int i2) {
        return i >= i2;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIlIlIlII[lIlIlIlll[62]];
    }

    private static boolean lIIlIIIIlIIl(Object obj) {
        return obj != null;
    }
}
