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
import net.runelite.api.Item;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.quests.Quests;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.w  reason: invalid package */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/w.class */
public class w implements G {
    private static /* synthetic */ int[] lIIlllIIll;
    static /* synthetic */ WorldPoint de;
    static /* synthetic */ WorldPoint dh;
    static /* synthetic */ int ck;
    static /* synthetic */ boolean cl;
    private static /* synthetic */ String[] lIIlllIIlI;
    static /* synthetic */ WorldPoint dg;
    static /* synthetic */ WorldPoint df;
    public static /* synthetic */ List<C0003d> bv;
    static /* synthetic */ String[] bR;
    public static /* synthetic */ boolean bt;
    static /* synthetic */ int di;

    static {
        lIIIIlIIIlIlI();
        lIIIIlIIIlIIl();
        bv = new ArrayList();
        de = new WorldPoint(lIIlllIIll[68], lIIlllIIll[69], lIIlllIIll[6]);
        df = new WorldPoint(lIIlllIIll[70], lIIlllIIll[71], lIIlllIIll[6]);
        dg = new WorldPoint(lIIlllIIll[72], lIIlllIIll[73], lIIlllIIll[6]);
        dh = new WorldPoint(lIIlllIIll[74], lIIlllIIll[75], lIIlllIIll[6]);
        String[] strArr = new String[lIIlllIIll[1]];
        strArr[lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[76]];
        strArr[lIIlllIIll[5]] = lIIlllIIlI[lIIlllIIll[42]];
        strArr[lIIlllIIll[8]] = lIIlllIIlI[lIIlllIIll[77]];
        bR = strArr;
        di = lIIlllIIll[78];
    }

    private static boolean lIIIIlIIIllll(int i) {
        return i == 0;
    }

    private static boolean lIIIIlIIIlllI(int i) {
        return i != 0;
    }

    private static boolean lIIIIlIIlIIIl(int i) {
        return i > 0;
    }

    private static boolean lIIIIlIIlIlII(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIIlllIIll[5]];
        iArr[lIIlllIIll[6]] = lIIlllIIll[25];
        if (lIIIIlIIlIIIl(Inventory.getCount(iArr))) {
            int[] iArr2 = new int[lIIlllIIll[5]];
            iArr2[lIIlllIIll[6]] = lIIlllIIll[16];
            if (lIIIIlIIlIIIl(Inventory.getCount(iArr2))) {
                int[] iArr3 = new int[lIIlllIIll[5]];
                iArr3[lIIlllIIll[6]] = lIIlllIIll[17];
                if (lIIIIlIIIlllI(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIlllIIll[5]];
                    iArr4[lIIlllIIll[6]] = lIIlllIIll[19];
                    if (lIIIIlIIIlllI(Inventory.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIlllIIll[5]];
                        iArr5[lIIlllIIll[6]] = lIIlllIIll[10];
                        if (lIIIIlIIIlllI(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[lIIlllIIll[5]];
                            iArr6[lIIlllIIll[6]] = lIIlllIIll[22];
                            if (lIIIIlIIIlllI(Inventory.contains(iArr6) ? 1 : 0)) {
                                int[] iArr7 = new int[lIIlllIIll[5]];
                                iArr7[lIIlllIIll[6]] = lIIlllIIll[26];
                                if (lIIIIlIIIlllI(Inventory.contains(iArr7) ? 1 : 0)) {
                                    ?? r0 = lIIlllIIll[5];
                                    "".length();
                                    return " ".length() <= 0 ? ((29 ^ 100) ^ (62 ^ 8)) & (((((178 + 112) - 196) + 138) ^ (((81 + 77) - 91) + 100)) ^ (-" ".length())) : r0;
                                }
                            }
                        }
                    }
                }
            }
        }
        return lIIlllIIll[6];
    }

    private static boolean lIIIIlIIIllIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIIIlIIlIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIlIIlIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            bf();
            "".length();
            if (" ".length() == 0) {
                return ((87 ^ 80) ^ (172 ^ 165)) & (((((75 + 97) - 135) + 141) ^ (((140 + 13) - 105) + 140)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIlllIIll[65];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lIIIIlIIlIllI(Quests.getState(Quest.RECIPE_FOR_DISASTER__MOUNTAIN_DWARF), QuestState.FINISHED)) {
            ?? r0 = lIIlllIIll[5];
            "".length();
            return !((true ^ true) ^ (true ^ true)) ? ((((117 + 150) - 152) + 59) ^ (((72 + 15) - 38) + 118)) & (((4 ^ 95) ^ (23 ^ 69)) ^ (-" ".length())) : r0;
        }
        return lIIlllIIll[6];
    }

    private static void lIIIIlIIIlIIl() {
        lIIlllIIlI = new String[lIIlllIIll[79]];
        lIIlllIIlI[lIIlllIIll[6]] = lIIIIlIIIIllI("6EtxlyTy1GN7kcgVo5sG+dQrP4irIucSp2PuEfg75WzTNo580asxHMJ2jsFdeo4i", "pmtjq");
        lIIlllIIlI[lIIlllIIll[5]] = lIIIIlIIIIllI("930XMsMPGCrcQDTTvYtyZw==", "gkoVe");
        lIIlllIIlI[lIIlllIIll[8]] = lIIIIlIIIIlll("IhspDB4DFCBIEAsULAEcDQ==", "jzGhr");
        lIIlllIIlI[lIIlllIIll[1]] = lIIIIlIIIlIII("y3HYZtb43iTbi+l+JbOaVDA8Ikv0V1O1QqtHtgJxCEv4lA1+a0CgxIY4VI3wiOtPZMeOHNp0GbU=", "dmdxx");
        lIIlllIIlI[lIIlllIIll[9]] = lIIIIlIIIIlll("MSJpKxsDZyQjGhUuJy1JFzIsOR1GNDw6GQouLDlFRjQ+Ix0FLyAkDkYzJmorMx4ABC4=", "fGIJi");
        lIIlllIIlI[lIIlllIIll[3]] = lIIIIlIIIIllI("oxsb4FFZmaM=", "JJYkn");
        lIIlllIIlI[lIIlllIIll[18]] = lIIIIlIIIlIII("IMBsfWGEKNA=", "pPvHz");
        lIIlllIIlI[lIIlllIIll[20]] = lIIIIlIIIIllI("zRtbXigQTrZRp7wEl0LYCA==", "SAyzS");
        lIIlllIIlI[lIIlllIIll[21]] = lIIIIlIIIIllI("yP0uGTlQJf4=", "PMgBv");
        lIIlllIIlI[lIIlllIIll[23]] = lIIIIlIIIIlll("EhMuIys=", "VdOQM");
        lIIlllIIlI[lIIlllIIll[4]] = lIIIIlIIIIllI("JVAjLDyUBdY=", "cqXvP");
        lIIlllIIlI[lIIlllIIll[2]] = lIIIIlIIIIllI("5Kfboep93eevyfwi8F6GMTRMYBc4kqDJ", "wgLfG");
        lIIlllIIlI[lIIlllIIll[29]] = lIIIIlIIIIllI("p7UE4IPYTIUmtGBFQVqsaw==", "zkrUR");
        lIIlllIIlI[lIIlllIIll[30]] = lIIIIlIIIIlll("ARchGj0v", "JvXvX");
        lIIlllIIlI[lIIlllIIll[31]] = lIIIIlIIIIllI("GT1JZLr3Oh5gIhmfvyyRYqc7VrnA4IIV", "oWdDn");
        lIIlllIIlI[lIIlllIIll[32]] = lIIIIlIIIlIII("+00LxDYS05Ak+EvAztYDoQ==", "ZpiJM");
        lIIlllIIlI[lIIlllIIll[33]] = lIIIIlIIIlIII("PdGhOpcEsxkSHjRlrd33Aw==", "zkhCV");
        lIIlllIIlI[lIIlllIIll[36]] = lIIIIlIIIlIII("D4Au2ikHmKSrQ6sT7teBKmV/Qegt6Vny", "tmkcp");
        lIIlllIIlI[lIIlllIIll[37]] = lIIIIlIIIIllI("Pl0UvZC3LSk0taZ4H0L5qQ==", "xUWMb");
        lIIlllIIlI[lIIlllIIll[38]] = lIIIIlIIIIllI("s/Rd6mkBoPNvbj8AAvLTow==", "fnWDf");
        lIIlllIIlI[lIIlllIIll[34]] = lIIIIlIIIIlll("ERUJIgg=", "CzaCc");
        lIIlllIIlI[lIIlllIIll[39]] = lIIIIlIIIlIII("bG9XRao93m+lbQTQmrbFAw==", "TQtxd");
        lIIlllIIlI[lIIlllIIll[40]] = lIIIIlIIIIllI("Ou6Gk2FxexQ=", "AZYnu");
        lIIlllIIlI[lIIlllIIll[43]] = lIIIIlIIIIlll("KyovMTUGayI9OBc=", "cKAUY");
        lIIlllIIlI[lIIlllIIll[44]] = lIIIIlIIIIllI("x+6lCDf45vE=", "bVbVA");
        lIIlllIIlI[lIIlllIIll[45]] = lIIIIlIIIIlll("BRMOIw==", "RvoQb");
        lIIlllIIlI[lIIlllIIll[47]] = lIIIIlIIIIllI("6ElNfCIk40Q=", "VkqCi");
        lIIlllIIlI[lIIlllIIll[48]] = lIIIIlIIIlIII("PmjLTePdlk0=", "AVhIY");
        lIIlllIIlI[lIIlllIIll[49]] = lIIIIlIIIIlll("HScbZw48ZgQkHzUvCCke", "SFmGz");
        lIIlllIIlI[lIIlllIIll[50]] = lIIIIlIIIIlll("CAQYGRQiUAUbEi8ZCRYT", "Iplxw");
        lIIlllIIlI[lIIlllIIll[41]] = lIIIIlIIIlIII("uff7vVC9qzlSkxkarhHf3Q==", "uFtdt");
        lIIlllIIlI[lIIlllIIll[51]] = lIIIIlIIIlIII("vSICqtVqiNA=", "tVEjb");
        lIIlllIIlI[lIIlllIIll[55]] = lIIIIlIIIIlll("FjgxMA==", "WJXCh");
        lIIlllIIlI[lIIlllIIll[56]] = lIIIIlIIIIlll("KDkHVAcJeAMSF0YqHhse", "fXqts");
        lIIlllIIlI[lIIlllIIll[57]] = lIIIIlIIIIllI("GUqNDMMBHis=", "RDAMS");
        lIIlllIIlI[lIIlllIIll[58]] = lIIIIlIIIlIII("rcrxJNEbC1vlLPAvF+bpLQ==", "EQPQA");
        lIIlllIIlI[lIIlllIIll[59]] = lIIIIlIIIIllI("PZpV39eXhms=", "eYowu");
        lIIlllIIlI[lIIlllIIll[66]] = lIIIIlIIIIlll("HxUoWDM6Mh4eVzwmCQsD", "MSlxw");
        lIIlllIIlI[lIIlllIIll[67]] = lIIIIlIIIIllI("a2Q47pPPZ6n/I4cI637mXbWw4Rc0Funj", "snzHX");
        lIIlllIIlI[lIIlllIIll[76]] = lIIIIlIIIlIII("rq10F9cdKyo=", "rpPKq");
        lIIlllIIlI[lIIlllIIll[42]] = lIIIIlIIIIlll("BwcjF2kzDixDMD8aYhcsPANiDixwDiAMPCRPJhQoIhknEGkxASZDKDwKfQ==", "PoBcI");
        lIIlllIIlI[lIIlllIIll[77]] = lIIIIlIIIIlll("OFgXCj8dHFQKLBcdBkUzHg1UFiUcHVQMJFEKERE/AxZYRSIeD1QEKB4NAEV4QUhUAiUdHEs=", "qxteJ");
    }

    private static String lIIIIlIIIIlll(String lllllllllllllllllllllIIIllllIIlI, String lllllllllllllllllllllIIIllllIIIl) {
        String lllllllllllllllllllllIIIllllIIlI2 = new String(Base64.getDecoder().decode(lllllllllllllllllllllIIIllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllllllllIIIllllIIII = new StringBuilder();
        char[] charArray = lllllllllllllllllllllIIIllllIIIl.toCharArray();
        int lllllllllllllllllllllIIIlllIlllI = lIIlllIIll[6];
        char[] charArray2 = lllllllllllllllllllllIIIllllIIlI2.toCharArray();
        int length = charArray2.length;
        int i = lIIlllIIll[6];
        while (lIIIIlIIIlIll(i, length)) {
            char lllllllllllllllllllllIIIllllIIll = charArray2[i];
            lllllllllllllllllllllIIIllllIIII.append((char) (lllllllllllllllllllllIIIllllIIll ^ charArray[lllllllllllllllllllllIIIlllIlllI % charArray.length]));
            "".length();
            lllllllllllllllllllllIIIlllIlllI++;
            i++;
            "".length();
            if (((91 ^ 25) & ((91 ^ 25) ^ (-1))) == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllllllllIIIllllIIII);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0b28, code lost:
        if (lIIIIlIIlIIII(net.unethicalite.api.entities.NPCs.getNearest(r0)) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0b40, code lost:
        if (lIIIIlIIlIlIl(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(r0), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[41]) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0b43, code lost:
        gg.squire.account.AccBuilderRogues.c = f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIlI[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[56]];
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.x.bi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0b53, code lost:
        r0 = new java.lang.String[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[5]];
        r0[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[6]] = f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIlI[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[57]];
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0b73, code lost:
        if (lIIIIlIIlIIII(net.unethicalite.api.entities.NPCs.getNearest(r0)) == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0b7c, code lost:
        if (lIIIIlIIIllll(net.unethicalite.api.widgets.Dialog.isOpen() ? 1 : 0) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0b7f, code lost:
        gg.squire.account.AccBuilderRogues.c = f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIlI[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[58]];
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0b97, code lost:
        if (lIIIIlIIIlIll(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.ck, f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[5]) == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0b9a, code lost:
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.U.ls += f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[5];
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.U.o(gg.squire.account.AccBuilderRogues.m);
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.ck += f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[5];
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.U.ls = f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[6];
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.cl = f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0bca, code lost:
        r0 = new int[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[5]];
        r0[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[6]] = f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[52];
        r0 = net.unethicalite.api.items.Inventory.getFirst(r0);
        r1 = new java.lang.String[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[5]];
        r1[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[6]] = f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIlI[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[59]];
        r0.useOn(net.unethicalite.api.entities.TileObjects.getNearest(r1));
        net.unethicalite.api.commons.Time.sleepTicks(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[5]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0c10, code lost:
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0006g.a(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.bR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0c16, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d6, code lost:
        if (lIIIIlIIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[9]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x021a, code lost:
        if (lIIIIlIIIllII(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[3]) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x025e, code lost:
        if (lIIIIlIIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[4]) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0261, code lost:
        af();
        java.lang.System.out.println(f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIlI[f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[1]]);
        f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.bt = f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x027b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v399, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v414, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v442, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bf() {
        if (lIIIIlIIIlIll(C0004e.j(lIIlllIIll[0]), lIIlllIIll[1])) {
            x.bh();
        }
        if (lIIIIlIIIllII(C0004e.j(lIIlllIIll[0]), lIIlllIIll[1]) && lIIIIlIIIlIll(C0004e.j(lIIlllIIll[2]), lIIlllIIll[3])) {
            C0019t.aK();
        }
        if (!lIIIIlIIIllII(Skills.getLevel(Skill.COOKING), lIIlllIIll[4]) || !lIIIIlIIIllII(C0004e.j(lIIlllIIll[0]), lIIlllIIll[1]) || !lIIIIlIIIllIl(C0004e.j(lIIlllIIll[2]), lIIlllIIll[3])) {
            return;
        }
        if (lIIIIlIIIlllI(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lIIIIlIIIlIll(bv.size(), lIIlllIIll[5])) {
                System.out.println(lIIlllIIlI[lIIlllIIll[6]]);
                bt = lIIlllIIll[6];
            }
        }
        if (!lIIIIlIIIllll(bt ? 1 : 0)) {
            return;
        }
        if (lIIIIlIIIllll(ab() ? 1 : 0) && lIIIIlIIIllll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
            BankLocation nearest = BankLocation.getNearest();
            if (lIIIIlIIlIIII(nearest) && lIIIIlIIIllll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[5]];
                C0000a.a(nearest);
            }
            if (lIIIIlIIlIIII(nearest) && lIIIIlIIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lIIIIlIIIllll(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, lIIlllIIll[7]);
                    "".length();
                }
                if (lIIIIlIIIlllI(Bank.isOpen() ? 1 : 0)) {
                    AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[8]];
                    if (lIIIIlIIlIIIl(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(lIIlllIIll[9]);
                        "".length();
                    }
                    if (lIIIIlIIlIIIl(Equipment.getAll().size())) {
                        Bank.depositEquipment();
                        Time.sleepTicks(lIIlllIIll[8]);
                        "".length();
                    }
                    int[] iArr = new int[lIIlllIIll[5]];
                    iArr[lIIlllIIll[6]] = lIIlllIIll[10];
                    if (lIIIIlIIIlllI(Bank.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[lIIlllIIll[5]];
                        iArr2[lIIlllIIll[6]] = lIIlllIIll[10];
                    }
                    int[] iArr3 = new int[lIIlllIIll[5]];
                    iArr3[lIIlllIIll[6]] = lIIlllIIll[11];
                    if (lIIIIlIIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                        int[] iArr4 = new int[lIIlllIIll[5]];
                        iArr4[lIIlllIIll[6]] = lIIlllIIll[11];
                    }
                    int[] iArr5 = new int[lIIlllIIll[5]];
                    iArr5[lIIlllIIll[6]] = lIIlllIIll[12];
                    if (lIIIIlIIIlllI(Bank.contains(iArr5) ? 1 : 0)) {
                        int[] iArr6 = new int[lIIlllIIll[5]];
                        iArr6[lIIlllIIll[6]] = lIIlllIIll[12];
                    }
                    int[] iArr7 = new int[lIIlllIIll[2]];
                    iArr7[lIIlllIIll[6]] = lIIlllIIll[13];
                    iArr7[lIIlllIIll[5]] = lIIlllIIll[14];
                    iArr7[lIIlllIIll[8]] = lIIlllIIll[12];
                    iArr7[lIIlllIIll[1]] = lIIlllIIll[15];
                    iArr7[lIIlllIIll[9]] = lIIlllIIll[16];
                    iArr7[lIIlllIIll[3]] = lIIlllIIll[17];
                    iArr7[lIIlllIIll[18]] = lIIlllIIll[19];
                    iArr7[lIIlllIIll[20]] = lIIlllIIll[10];
                    iArr7[lIIlllIIll[21]] = lIIlllIIll[22];
                    iArr7[lIIlllIIll[23]] = lIIlllIIll[24];
                    iArr7[lIIlllIIll[4]] = lIIlllIIll[25];
                    if (lIIIIlIIIllll(C0004e.b(iArr7) ? 1 : 0)) {
                        af();
                        System.out.println(lIIlllIIlI[lIIlllIIll[9]]);
                        bt = lIIlllIIll[5];
                        return;
                    }
                    int[] iArr8 = new int[lIIlllIIll[2]];
                    iArr8[lIIlllIIll[6]] = lIIlllIIll[13];
                    iArr8[lIIlllIIll[5]] = lIIlllIIll[14];
                    iArr8[lIIlllIIll[8]] = lIIlllIIll[12];
                    iArr8[lIIlllIIll[1]] = lIIlllIIll[15];
                    iArr8[lIIlllIIll[9]] = lIIlllIIll[16];
                    iArr8[lIIlllIIll[3]] = lIIlllIIll[17];
                    iArr8[lIIlllIIll[18]] = lIIlllIIll[19];
                    iArr8[lIIlllIIll[20]] = lIIlllIIll[10];
                    iArr8[lIIlllIIll[21]] = lIIlllIIll[22];
                    iArr8[lIIlllIIll[23]] = lIIlllIIll[24];
                    iArr8[lIIlllIIll[4]] = lIIlllIIll[25];
                    if (lIIIIlIIIlllI(C0004e.b(iArr8) ? 1 : 0)) {
                        C0000a.a(lIIlllIIll[13], lIIlllIIll[4]);
                        C0000a.a(lIIlllIIll[14], lIIlllIIll[4]);
                        C0000a.a(lIIlllIIll[12], lIIlllIIll[4]);
                        C0000a.a(lIIlllIIll[15], lIIlllIIll[5]);
                        C0000a.a(lIIlllIIll[16], lIIlllIIll[5]);
                        C0000a.a(lIIlllIIll[17], lIIlllIIll[5]);
                        C0000a.a(lIIlllIIll[19], lIIlllIIll[5]);
                        C0000a.a(lIIlllIIll[10], lIIlllIIll[9]);
                        C0000a.a(lIIlllIIll[22], lIIlllIIll[5]);
                        C0000a.a(lIIlllIIll[25], lIIlllIIll[5]);
                        C0000a.a(lIIlllIIll[24], lIIlllIIll[3]);
                        C0000a.a(lIIlllIIll[11], lIIlllIIll[8]);
                        C0000a.a(lIIlllIIll[26], lIIlllIIll[7]);
                    }
                }
            }
        }
        if (lIIIIlIIIlllI(Inventory.contains(C0005f.aV) ? 1 : 0) && lIIIIlIIIlIll(Movement.getRunEnergy(), lIIlllIIll[27])) {
            Inventory.getFirst(C0005f.aV).interact(lIIlllIIlI[lIIlllIIll[3]]);
            Time.sleepTicks(lIIlllIIll[5]);
            "".length();
        }
        if (lIIIIlIIIlllI(ab() ? 1 : 0) && lIIIIlIIIllll(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()))) {
            if (lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(de), lIIlllIIll[9])) {
                String[] strArr = new String[lIIlllIIll[5]];
                strArr[lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[18]];
                if (lIIIIlIIlIIll(NPCs.getNearest(strArr))) {
                    AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[20]];
                    x.bi();
                }
            }
            String[] strArr2 = new String[lIIlllIIll[5]];
            strArr2[lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[21]];
            if (lIIIIlIIlIIII(NPCs.getNearest(strArr2))) {
                if (lIIIIlIIIllll(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr3 = new String[lIIlllIIll[5]];
                    strArr3[lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[23]];
                    TileObjects.getNearest(strArr3).interact(lIIlllIIlI[lIIlllIIll[4]]);
                    Time.sleepTicks(lIIlllIIll[5]);
                    "".length();
                }
                C0006g.a(bR);
            }
        }
        if (lIIIIlIIIllIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlllIIll[4])) {
            if (lIIIIlIIlIlII(Vars.getBit(lIIlllIIll[28]), lIIlllIIll[5])) {
                if (lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(df), lIIlllIIll[20])) {
                    AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[2]];
                    Movement.walkTo(df);
                    "".length();
                    Time.sleepTicks(lIIlllIIll[5]);
                    "".length();
                }
                if (lIIIIlIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(df), lIIlllIIll[20])) {
                    AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[29]];
                    C0006g.a(lIIlllIIlI[lIIlllIIll[30]], bR);
                }
            }
            if (lIIIIlIIIllIl(Vars.getBit(lIIlllIIll[28]), lIIlllIIll[5])) {
                int[] iArr9 = new int[lIIlllIIll[5]];
                iArr9[lIIlllIIll[6]] = lIIlllIIll[10];
                if (lIIIIlIIIlllI(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIIlllIIll[5]];
                    iArr10[lIIlllIIll[6]] = lIIlllIIll[26];
                    Item first = Inventory.getFirst(iArr10);
                    int[] iArr11 = new int[lIIlllIIll[5]];
                    iArr11[lIIlllIIll[6]] = lIIlllIIll[10];
                    first.useOn(Inventory.getFirst(iArr11));
                    Time.sleepTicks(lIIlllIIll[5]);
                    "".length();
                }
                int[] iArr12 = new int[lIIlllIIll[5]];
                iArr12[lIIlllIIll[6]] = lIIlllIIll[10];
                if (lIIIIlIIIllll(Inventory.contains(iArr12) ? 1 : 0)) {
                    if (lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lIIlllIIll[20])) {
                        AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[31]];
                        Movement.walkTo(dg);
                        "".length();
                        Time.sleepTicks(lIIlllIIll[5]);
                        "".length();
                    }
                    if (lIIIIlIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIlllIIll[20])) {
                        AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[32]];
                        C0006g.a(lIIlllIIlI[lIIlllIIll[33]], bR);
                    }
                }
            }
        }
        if (lIIIIlIIIllIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlllIIll[34])) {
            if (lIIIIlIIlIlII(Vars.getBit(lIIlllIIll[35]), lIIlllIIll[9])) {
                ck = lIIlllIIll[6];
                if (lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dg), lIIlllIIll[20])) {
                    AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[36]];
                    Movement.walkTo(dg);
                    "".length();
                    Time.sleepTicks(lIIlllIIll[5]);
                    "".length();
                }
                if (lIIIIlIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(dg), lIIlllIIll[20])) {
                    AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[37]];
                    C0006g.a(lIIlllIIlI[lIIlllIIll[38]], bR);
                    C0006g.a(lIIlllIIlI[lIIlllIIll[34]], bR);
                }
            }
            if (lIIIIlIIIllIl(Vars.getBit(lIIlllIIll[35]), lIIlllIIll[9])) {
                AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[39]];
                C0006g.a(lIIlllIIlI[lIIlllIIll[40]], bR);
            }
        }
        if (!lIIIIlIIlIlII(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlllIIll[41]) || lIIIIlIIIllIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlllIIll[42])) {
            AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[43]];
            C0006g.a(lIIlllIIlI[lIIlllIIll[44]], bR);
        }
        if (!lIIIIlIIIllIl(Vars.getBit(QuestVarbits.QUEST_RECIPE_FOR_DISASTER_DWARF.getId()), lIIlllIIll[27])) {
            return;
        }
        int[] iArr13 = new int[lIIlllIIll[5]];
        iArr13[lIIlllIIll[6]] = lIIlllIIll[22];
        if (lIIIIlIIIllll(Equipment.contains(iArr13) ? 1 : 0)) {
            int[] iArr14 = new int[lIIlllIIll[5]];
            iArr14[lIIlllIIll[6]] = lIIlllIIll[22];
            if (lIIIIlIIIlllI(Inventory.contains(iArr14) ? 1 : 0)) {
                int[] iArr15 = new int[lIIlllIIll[5]];
                iArr15[lIIlllIIll[6]] = lIIlllIIll[22];
                Inventory.getFirst(iArr15).interact(lIIlllIIlI[lIIlllIIll[45]]);
                Time.sleepTicks(lIIlllIIll[5]);
                "".length();
            }
        }
        int[] iArr16 = new int[lIIlllIIll[5]];
        iArr16[lIIlllIIll[6]] = lIIlllIIll[22];
        if (lIIIIlIIIlllI(Equipment.contains(iArr16) ? 1 : 0)) {
            int[] iArr17 = new int[lIIlllIIll[5]];
            iArr17[lIIlllIIll[6]] = lIIlllIIll[46];
            if (lIIIIlIIlIIII(TileItems.getNearest(iArr17))) {
                int[] iArr18 = new int[lIIlllIIll[5]];
                iArr18[lIIlllIIll[6]] = lIIlllIIll[46];
                TileItems.getNearest(iArr18).interact(lIIlllIIlI[lIIlllIIll[47]]);
                Time.sleepTicks(lIIlllIIll[5]);
                "".length();
            }
        }
        int[] iArr19 = new int[lIIlllIIll[5]];
        iArr19[lIIlllIIll[6]] = lIIlllIIll[46];
        if (lIIIIlIIIlllI(Inventory.contains(iArr19) ? 1 : 0)) {
            int[] iArr20 = new int[lIIlllIIll[5]];
            iArr20[lIIlllIIll[6]] = lIIlllIIll[25];
            if (lIIIIlIIIlllI(Inventory.contains(iArr20) ? 1 : 0)) {
                int[] iArr21 = new int[lIIlllIIll[5]];
                iArr21[lIIlllIIll[6]] = lIIlllIIll[25];
                if (lIIIIlIIIllll(Equipment.contains(iArr21) ? 1 : 0)) {
                    int[] iArr22 = new int[lIIlllIIll[5]];
                    iArr22[lIIlllIIll[6]] = lIIlllIIll[25];
                    Inventory.getFirst(iArr22).interact(lIIlllIIlI[lIIlllIIll[48]]);
                    Time.sleepTicks(lIIlllIIll[5]);
                    "".length();
                }
            }
            if (lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(dh), lIIlllIIll[18])) {
                AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[49]];
                Movement.walkTo(dh);
                "".length();
                Time.sleepTicks(lIIlllIIll[5]);
                "".length();
            }
            if (lIIIIlIIlIlIl(Players.getLocal().getWorldLocation().distanceTo(dh), lIIlllIIll[18])) {
                AccBuilderRogues.c = lIIlllIIlI[lIIlllIIll[50]];
                if (lIIIIlIIlIIll(Players.getLocal().getInteracting())) {
                    String[] strArr4 = new String[lIIlllIIll[5]];
                    strArr4[lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[41]];
                    NPCs.getNearest(strArr4).interact(lIIlllIIlI[lIIlllIIll[51]]);
                    Time.sleepTicks(lIIlllIIll[1]);
                    "".length();
                }
            }
        }
        int[] iArr23 = new int[lIIlllIIll[5]];
        iArr23[lIIlllIIll[6]] = lIIlllIIll[52];
        if (!lIIIIlIIIlllI(Inventory.contains(iArr23) ? 1 : 0)) {
            return;
        }
        WorldPoint worldPoint = new WorldPoint(lIIlllIIll[53], lIIlllIIll[54], lIIlllIIll[6]);
        if (lIIIIlIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(de), lIIlllIIll[9])) {
            String[] strArr5 = new String[lIIlllIIll[5]];
            strArr5[lIIlllIIll[6]] = lIIlllIIlI[lIIlllIIll[55]];
        }
    }

    private static boolean lIIIIlIIlIIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIIIlIIIllII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0173, code lost:
        if (lIIIIlIIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[9]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0316, code lost:
        if (lIIIIlIIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[3]) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03a0, code lost:
        if (lIIIIlIIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[4]) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x005f, code lost:
        if (lIIIIlIIIlIll(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.w.lIIlllIIll[3]) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11 = new int[lIIlllIIll[5]];
        iArr11[lIIlllIIll[6]] = lIIlllIIll[11];
        if (lIIIIlIIIlllI(Bank.contains(iArr11) ? 1 : 0)) {
            int[] iArr12 = new int[lIIlllIIll[5]];
            iArr12[lIIlllIIll[6]] = lIIlllIIll[11];
            if (lIIIIlIIIlllI(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[lIIlllIIll[5]];
                iArr13[lIIlllIIll[6]] = lIIlllIIll[11];
            }
            iArr = new int[lIIlllIIll[5]];
            iArr[lIIlllIIll[6]] = lIIlllIIll[25];
            if (lIIIIlIIIllll(Bank.contains(iArr) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllIIll[25], lIIlllIIll[5], lIIlllIIll[60]));
                "".length();
            }
            iArr2 = new int[lIIlllIIll[5]];
            iArr2[lIIlllIIll[6]] = lIIlllIIll[22];
            if (lIIIIlIIIllll(Bank.contains(iArr2) ? 1 : 0)) {
                bv.add(new C0003d(lIIlllIIll[22], lIIlllIIll[5], lIIlllIIll[60]));
                "".length();
            }
            iArr3 = new int[lIIlllIIll[5]];
            iArr3[lIIlllIIll[6]] = lIIlllIIll[10];
            if (lIIIIlIIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr14 = new int[lIIlllIIll[5]];
                iArr14[lIIlllIIll[6]] = lIIlllIIll[10];
                if (lIIIIlIIIlllI(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[lIIlllIIll[5]];
                    iArr15[lIIlllIIll[6]] = lIIlllIIll[10];
                }
                iArr4 = new int[lIIlllIIll[5]];
                iArr4[lIIlllIIll[6]] = lIIlllIIll[19];
                if (lIIIIlIIIllll(Bank.contains(iArr4) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlllIIll[19], lIIlllIIll[5], lIIlllIIll[60]));
                    "".length();
                }
                iArr5 = new int[lIIlllIIll[5]];
                iArr5[lIIlllIIll[6]] = lIIlllIIll[17];
                if (lIIIIlIIIllll(Bank.contains(iArr5) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlllIIll[17], lIIlllIIll[5], lIIlllIIll[60]));
                    "".length();
                }
                iArr6 = new int[lIIlllIIll[5]];
                iArr6[lIIlllIIll[6]] = lIIlllIIll[15];
                if (lIIIIlIIIllll(Bank.contains(iArr6) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlllIIll[15], lIIlllIIll[5], lIIlllIIll[60]));
                    "".length();
                }
                iArr7 = new int[lIIlllIIll[5]];
                iArr7[lIIlllIIll[6]] = lIIlllIIll[16];
                if (lIIIIlIIIllll(Bank.contains(iArr7) ? 1 : 0)) {
                    bv.add(new C0003d(lIIlllIIll[16], lIIlllIIll[5], lIIlllIIll[60]));
                    "".length();
                }
                iArr8 = new int[lIIlllIIll[5]];
                iArr8[lIIlllIIll[6]] = lIIlllIIll[14];
                if (lIIIIlIIIlllI(Bank.contains(iArr8) ? 1 : 0)) {
                    int[] iArr16 = new int[lIIlllIIll[5]];
                    iArr16[lIIlllIIll[6]] = lIIlllIIll[14];
                    if (lIIIIlIIIlllI(Bank.contains(iArr16) ? 1 : 0)) {
                        int[] iArr17 = new int[lIIlllIIll[5]];
                        iArr17[lIIlllIIll[6]] = lIIlllIIll[14];
                    }
                    iArr9 = new int[lIIlllIIll[5]];
                    iArr9[lIIlllIIll[6]] = lIIlllIIll[12];
                    if (lIIIIlIIIlllI(Bank.contains(iArr9) ? 1 : 0)) {
                        int[] iArr18 = new int[lIIlllIIll[5]];
                        iArr18[lIIlllIIll[6]] = lIIlllIIll[12];
                        if (lIIIIlIIIlllI(Bank.contains(iArr18) ? 1 : 0)) {
                            int[] iArr19 = new int[lIIlllIIll[5]];
                            iArr19[lIIlllIIll[6]] = lIIlllIIll[12];
                        }
                        if (lIIIIlIIIllll(Bank.contains(item -> {
                            return item.getName().toLowerCase().contains(lIIlllIIlI[lIIlllIIll[67]]);
                        }) ? 1 : 0)) {
                            bv.add(new C0003d(lIIlllIIll[63], lIIlllIIll[3], lIIlllIIll[64]));
                            "".length();
                        }
                        iArr10 = new int[lIIlllIIll[5]];
                        iArr10[lIIlllIIll[6]] = lIIlllIIll[13];
                        if (lIIIIlIIIllll(Bank.contains(iArr10) ? 1 : 0)) {
                            bv.add(new C0003d(lIIlllIIll[13], lIIlllIIll[42], lIIlllIIll[62]));
                            "".length();
                            return;
                        }
                        return;
                    }
                    bv.add(new C0003d(lIIlllIIll[12], lIIlllIIll[4], lIIlllIIll[62]));
                    "".length();
                    if (lIIIIlIIIllll(Bank.contains(item2 -> {
                        return item2.getName().toLowerCase().contains(lIIlllIIlI[lIIlllIIll[67]]);
                    }) ? 1 : 0)) {
                    }
                    iArr10 = new int[lIIlllIIll[5]];
                    iArr10[lIIlllIIll[6]] = lIIlllIIll[13];
                    if (lIIIIlIIIllll(Bank.contains(iArr10) ? 1 : 0)) {
                    }
                }
                bv.add(new C0003d(lIIlllIIll[14], lIIlllIIll[4], lIIlllIIll[62]));
                "".length();
                iArr9 = new int[lIIlllIIll[5]];
                iArr9[lIIlllIIll[6]] = lIIlllIIll[12];
                if (lIIIIlIIIlllI(Bank.contains(iArr9) ? 1 : 0)) {
                }
                bv.add(new C0003d(lIIlllIIll[12], lIIlllIIll[4], lIIlllIIll[62]));
                "".length();
                if (lIIIIlIIIllll(Bank.contains(item22 -> {
                    return item22.getName().toLowerCase().contains(lIIlllIIlI[lIIlllIIll[67]]);
                }) ? 1 : 0)) {
                }
                iArr10 = new int[lIIlllIIll[5]];
                iArr10[lIIlllIIll[6]] = lIIlllIIll[13];
                if (lIIIIlIIIllll(Bank.contains(iArr10) ? 1 : 0)) {
                }
            }
            bv.add(new C0003d(lIIlllIIll[10], lIIlllIIll[9], lIIlllIIll[61]));
            "".length();
            iArr4 = new int[lIIlllIIll[5]];
            iArr4[lIIlllIIll[6]] = lIIlllIIll[19];
            if (lIIIIlIIIllll(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[lIIlllIIll[5]];
            iArr5[lIIlllIIll[6]] = lIIlllIIll[17];
            if (lIIIIlIIIllll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[lIIlllIIll[5]];
            iArr6[lIIlllIIll[6]] = lIIlllIIll[15];
            if (lIIIIlIIIllll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[lIIlllIIll[5]];
            iArr7[lIIlllIIll[6]] = lIIlllIIll[16];
            if (lIIIIlIIIllll(Bank.contains(iArr7) ? 1 : 0)) {
            }
            iArr8 = new int[lIIlllIIll[5]];
            iArr8[lIIlllIIll[6]] = lIIlllIIll[14];
            if (lIIIIlIIIlllI(Bank.contains(iArr8) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIlllIIll[14], lIIlllIIll[4], lIIlllIIll[62]));
            "".length();
            iArr9 = new int[lIIlllIIll[5]];
            iArr9[lIIlllIIll[6]] = lIIlllIIll[12];
            if (lIIIIlIIIlllI(Bank.contains(iArr9) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIlllIIll[12], lIIlllIIll[4], lIIlllIIll[62]));
            "".length();
            if (lIIIIlIIIllll(Bank.contains(item222 -> {
                return item222.getName().toLowerCase().contains(lIIlllIIlI[lIIlllIIll[67]]);
            }) ? 1 : 0)) {
            }
            iArr10 = new int[lIIlllIIll[5]];
            iArr10[lIIlllIIll[6]] = lIIlllIIll[13];
            if (lIIIIlIIIllll(Bank.contains(iArr10) ? 1 : 0)) {
            }
        }
        bv.add(new C0003d(lIIlllIIll[11], lIIlllIIll[3], C0008i.bq));
        "".length();
        iArr = new int[lIIlllIIll[5]];
        iArr[lIIlllIIll[6]] = lIIlllIIll[25];
        if (lIIIIlIIIllll(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[lIIlllIIll[5]];
        iArr2[lIIlllIIll[6]] = lIIlllIIll[22];
        if (lIIIIlIIIllll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIlllIIll[5]];
        iArr3[lIIlllIIll[6]] = lIIlllIIll[10];
        if (lIIIIlIIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlllIIll[10], lIIlllIIll[9], lIIlllIIll[61]));
        "".length();
        iArr4 = new int[lIIlllIIll[5]];
        iArr4[lIIlllIIll[6]] = lIIlllIIll[19];
        if (lIIIIlIIIllll(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[lIIlllIIll[5]];
        iArr5[lIIlllIIll[6]] = lIIlllIIll[17];
        if (lIIIIlIIIllll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[lIIlllIIll[5]];
        iArr6[lIIlllIIll[6]] = lIIlllIIll[15];
        if (lIIIIlIIIllll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[lIIlllIIll[5]];
        iArr7[lIIlllIIll[6]] = lIIlllIIll[16];
        if (lIIIIlIIIllll(Bank.contains(iArr7) ? 1 : 0)) {
        }
        iArr8 = new int[lIIlllIIll[5]];
        iArr8[lIIlllIIll[6]] = lIIlllIIll[14];
        if (lIIIIlIIIlllI(Bank.contains(iArr8) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlllIIll[14], lIIlllIIll[4], lIIlllIIll[62]));
        "".length();
        iArr9 = new int[lIIlllIIll[5]];
        iArr9[lIIlllIIll[6]] = lIIlllIIll[12];
        if (lIIIIlIIIlllI(Bank.contains(iArr9) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIlllIIll[12], lIIlllIIll[4], lIIlllIIll[62]));
        "".length();
        if (lIIIIlIIIllll(Bank.contains(item2222 -> {
            return item2222.getName().toLowerCase().contains(lIIlllIIlI[lIIlllIIll[67]]);
        }) ? 1 : 0)) {
        }
        iArr10 = new int[lIIlllIIll[5]];
        iArr10[lIIlllIIll[6]] = lIIlllIIll[13];
        if (lIIIIlIIIllll(Bank.contains(iArr10) ? 1 : 0)) {
        }
    }

    private static boolean lIIIIlIIIlIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIIlIIlIlIl(int i, int i2) {
        return i <= i2;
    }

    private static String lIIIIlIIIlIII(String lllllllllllllllllllllIIlIIIIllll, String lllllllllllllllllllllIIlIIIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIIlIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllIIll[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIIlIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIIlIIIlIIII) {
            lllllllllllllllllllllIIlIIIlIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIlllIIll[6];
    }

    private static String lIIIIlIIIIllI(String lllllllllllllllllllllIIlIIIIIIlI, String lllllllllllllllllllllIIlIIIIIIIl) {
        try {
            SecretKeySpec lllllllllllllllllllllIIlIIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIIlIIIIIIIl.getBytes(StandardCharsets.UTF_8)), lIIlllIIll[21]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllIIll[8], lllllllllllllllllllllIIlIIIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIIlIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIIlIIIIIIll) {
            lllllllllllllllllllllIIlIIIIIIll.printStackTrace();
            return null;
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIlllIIlI[lIIlllIIll[66]];
    }

    private static boolean lIIIIlIIlIIll(Object obj) {
        return obj == null;
    }

    private static void lIIIIlIIIlIlI() {
        lIIlllIIll = new int[80];
        lIIlllIIll[0] = (-10249) & 10926;
        lIIlllIIll[1] = "   ".length();
        lIIlllIIll[2] = 9 ^ 2;
        lIIlllIIll[3] = (((183 + 174) - 179) + 12) ^ (((184 + 23) - 185) + 165);
        lIIlllIIll[4] = (105 ^ 36) ^ (54 ^ 113);
        lIIlllIIll[5] = " ".length();
        lIIlllIIll[6] = ((151 ^ 197) ^ (126 ^ 108)) & (((((172 + 16) - (-5)) + 54) ^ (((2 + 159) - (-13)) + 9)) ^ (-" ".length()));
        lIIlllIIll[7] = (-19478) & 24477;
        lIIlllIIll[8] = "  ".length();
        lIIlllIIll[9] = 77 ^ 73;
        lIIlllIIll[10] = (-4111) & 6015;
        lIIlllIIll[11] = (-2221) & 14845;
        lIIlllIIll[12] = (-8195) & 16203;
        lIIlllIIll[13] = (-((-7495) & 32255)) & (-1) & 32767;
        lIIlllIIll[14] = (-((-5218) & 29943)) & (-35) & 32767;
        lIIlllIIll[15] = (-18457) & 20383;
        lIIlllIIll[16] = (-24643) & 26575;
        lIIlllIIll[17] = (-((-8073) & 24463)) & (-10305) & 28638;
        lIIlllIIll[18] = (((67 + 29) - (-22)) + 67) ^ (((149 + 34) - 7) + 15);
        lIIlllIIll[19] = (-((-13405) & 15487)) & (-12357) & 16359;
        lIIlllIIll[20] = 97 ^ 102;
        lIIlllIIll[21] = (((19 + 1) - (-65)) + 89) ^ (((86 + 157) - 147) + 70);
        lIIlllIIll[22] = (-((-17441) & 24233)) & (-16469) & 24319;
        lIIlllIIll[23] = 81 ^ 88;
        lIIlllIIll[24] = (-11777) & 12155;
        lIIlllIIll[25] = (-22597) & 23927;
        lIIlllIIll[26] = (-26649) & 27643;
        lIIlllIIll[27] = 68 ^ 118;
        lIIlllIIll[28] = (-((-1283) & 27935)) & (-1) & 28543;
        lIIlllIIll[29] = (43 ^ 124) ^ (126 ^ 37);
        lIIlllIIll[30] = 101 ^ 104;
        lIIlllIIll[31] = 3 ^ 13;
        lIIlllIIll[32] = 29 ^ 18;
        lIIlllIIll[33] = (((28 + 30) - 7) + 137) ^ (((91 + 68) - (-13)) + 0);
        lIIlllIIll[34] = 49 ^ 37;
        lIIlllIIll[35] = (-((-16701) & 24957)) & (-20481) & 30719;
        lIIlllIIll[36] = (233 ^ 129) ^ (218 ^ 163);
        lIIlllIIll[37] = (117 ^ 101) ^ "  ".length();
        lIIlllIIll[38] = 112 ^ 99;
        lIIlllIIll[39] = 81 ^ 68;
        lIIlllIIll[40] = 60 ^ 42;
        lIIlllIIll[41] = "  ".length() ^ (180 ^ 168);
        lIIlllIIll[42] = 181 ^ 157;
        lIIlllIIll[43] = (149 ^ 173) ^ (70 ^ 105);
        lIIlllIIll[44] = 3 ^ 27;
        lIIlllIIll[45] = (215 ^ 152) ^ (216 ^ 142);
        lIIlllIIll[46] = (-(65 ^ 74)) & (-24705) & 32223;
        lIIlllIIll[47] = 12 ^ 22;
        lIIlllIIll[48] = 99 ^ 120;
        lIIlllIIll[49] = (96 ^ 82) ^ (58 ^ 20);
        lIIlllIIll[50] = 55 ^ 42;
        lIIlllIIll[51] = 92 ^ 67;
        lIIlllIIll[52] = (-24577) & 32086;
        lIIlllIIll[53] = (-1) & 3206;
        lIIlllIIll[54] = (-28806) & 32229;
        lIIlllIIll[55] = (((135 + 139) - 185) + 51) ^ (((101 + 24) - 73) + 120);
        lIIlllIIll[56] = (((133 + 61) - 73) + 30) ^ (((18 + 145) - (-4)) + 15);
        lIIlllIIll[57] = 80 ^ 114;
        lIIlllIIll[58] = 49 ^ 18;
        lIIlllIIll[59] = (((120 + 121) - 114) + 44) ^ (((63 + 105) - 131) + 106);
        lIIlllIIll[60] = (-22614) & 31613;
        lIIlllIIll[61] = (-((-10889) & 27291)) & (-4109) & 24510;
        lIIlllIIll[62] = (-((-4972) & 21375)) & (-14337) & 32639;
        lIIlllIIll[63] = (-((-2188) & 18591)) & (-4353) & 32735;
        lIIlllIIll[64] = (-7254) & 32253;
        lIIlllIIll[65] = 111 ^ 11;
        lIIlllIIll[66] = 127 ^ 90;
        lIIlllIIll[67] = 179 ^ 149;
        lIIlllIIll[68] = (-((-1157) & 18357)) & (-4105) & 24511;
        lIIlllIIll[69] = (-24865) & 28086;
        lIIlllIIll[70] = (-9313) & 12269;
        lIIlllIIll[71] = (-28754) & 32125;
        lIIlllIIll[72] = (-((-8965) & 14279)) & (-24577) & 32755;
        lIIlllIIll[73] = (-2313) & 12189;
        lIIlllIIll[74] = (-24633) & 27641;
        lIIlllIIll[75] = (-((-2265) & 19199)) & (-4169) & 24575;
        lIIlllIIll[76] = 226 ^ 197;
        lIIlllIIll[77] = 13 ^ 36;
        lIIlllIIll[78] = (-24917) & 25597;
        lIIlllIIll[79] = (81 ^ 113) ^ (119 ^ 125);
    }
}
