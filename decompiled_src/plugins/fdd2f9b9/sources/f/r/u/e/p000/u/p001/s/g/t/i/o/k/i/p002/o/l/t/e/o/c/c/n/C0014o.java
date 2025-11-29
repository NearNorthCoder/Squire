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
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
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
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.o  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/o.class */
public class C0014o implements G {
    static /* synthetic */ WorldPoint I;
    static /* synthetic */ WorldPoint cc;
    private static /* synthetic */ String[] lIIIlIIIII;
    public static /* synthetic */ boolean bY;
    public static /* synthetic */ boolean bW;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ List<C0003d> bv;
    public static /* synthetic */ boolean ca;
    public static /* synthetic */ boolean cb;
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ int[] lIIIlIIIIl;
    static /* synthetic */ WorldArea cd;
    public static /* synthetic */ boolean bZ;
    public static /* synthetic */ boolean bX;

    private static boolean lllIIllllllI(int i) {
        return i > 0;
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            ay();
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((((191 + 209) - 391) + 209) ^ (((27 + 30) - 56) + 139)) & (((((41 + 21) - 44) + 189) ^ (((44 + 29) - (-43)) + 37)) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIIIlIIIIl[183];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lllIIllllIIl(cb ? 1 : 0) && lllIIllllIIl(ca ? 1 : 0) && lllIIllllIIl(bZ ? 1 : 0) && lllIIllllIIl(bY ? 1 : 0) && lllIIllllIIl(bX ? 1 : 0)) {
            ?? r0 = lIIIlIIIIl[0];
            "".length();
            return " ".length() < 0 ? ((((65 + 74) - 29) + 26) ^ (((64 + 59) - 74) + 96)) & (((161 ^ 158) ^ (85 ^ 115)) ^ (-" ".length())) : r0;
        }
        return lIIIlIIIIl[1];
    }

    private static boolean lllIIlllllII(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllIIllllIIl(int i) {
        return i != 0;
    }

    private static boolean lllIIllllIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIllllIll(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean az() {
        int[] iArr = new int[lIIIlIIIIl[0]];
        iArr[lIIIlIIIIl[1]] = lIIIlIIIIl[19];
        if (lllIIllllIIl(Bank.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[lIIIlIIIIl[0]];
            iArr2[lIIIlIIIIl[1]] = lIIIlIIIIl[17];
            if (lllIIllllIIl(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[lIIIlIIIIl[0]];
                iArr3[lIIIlIIIIl[1]] = lIIIlIIIIl[15];
                if (lllIIllllIIl(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[lIIIlIIIIl[0]];
                    iArr4[lIIIlIIIIl[1]] = lIIIlIIIIl[21];
                    if (lllIIllllIIl(Bank.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[lIIIlIIIIl[0]];
                        iArr5[lIIIlIIIIl[1]] = lIIIlIIIIl[13];
                        if (lllIIllllIIl(Bank.contains(iArr5) ? 1 : 0)) {
                            ?? r0 = lIIIlIIIIl[0];
                            "".length();
                            return (-" ".length()) >= (35 ^ 39) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                }
            }
        }
        return lIIIlIIIIl[1];
    }

    private static boolean lllIIlllllll(int i, int i2) {
        return i > i2;
    }

    private static String lllIIlllIIlI(String llIIIIIlIllI, String llIIIIIlIlIl) {
        try {
            SecretKeySpec llIIIIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIIIllIII = Cipher.getInstance("Blowfish");
            llIIIIIllIII.init(lIIIlIIIIl[4], llIIIIIllIIl);
            return new String(llIIIIIllIII.doFinal(Base64.getDecoder().decode(llIIIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIlIlll) {
            llIIIIIlIlll.printStackTrace();
            return null;
        }
    }

    private static void lllIIlllIIll() {
        lIIIlIIIII = new String[lIIIlIIIIl[194]];
        lIIIlIIIII[lIIIlIIIIl[1]] = lllIIlllIIII("Kh8YMBYEExJ5BxkPHzcCTB8CPAgfWlYqEgUCFTEMAhFWOwQPHVYtCkwHAzwWGA==", "lvvYe");
        lIIIlIIIII[lIIIlIIIIl[0]] = lllIIlllIIII("FhAhETg9Nx9DCCI2Ygc+bS0tF3EgJicXcTkrJ0MjKDI3CiMoLicNJT5jJAwjbTEtBCQoMGIHNCM=", "MCBcQ");
        lIIIlIIIII[lIIIlIIIIl[4]] = lllIIlllIIIl("3zCuDrV29U2DaJoMi+gIBA==", "WqJkZ");
        lIIIlIIIII[lIIIlIIIIl[6]] = lllIIlllIIIl("YTUmTPicoJFqYzKpbj8Dld0CmGfpHume", "eHNaz");
        lIIIlIIIII[lIIIlIIIIl[7]] = lllIIlllIIIl("0j6+YWvjOsE2tNpn9NHK8w6L4/olyJR3uF6ghysr2DVKkHNKguVVOZinrgf7JUnAiE2ff5ywPaE=", "RiCaZ");
        lIIIlIIIII[lIIIlIIIIl[12]] = lllIIlllIIII("JwpoECEVTyUYIAMGJhZzARotAidQHD0BIxwGLQJ/UBw/GCcTByEfNFAbJ1ERJTYBPxQ=", "poHqS");
        lIIIlIIIII[lIIIlIIIIl[14]] = lllIIlllIIIl("+q158A9C8I4b5I749kk6nQ==", "FGTHe");
        lIIIlIIIII[lIIIlIIIIl[16]] = lllIIlllIIII("LwI/bjcHHQ==", "hmKNC");
        lIIIlIIIII[lIIIlIIIIl[18]] = lllIIlllIIII("IRcHUgADHwA=", "fxsrl");
        lIIIlIIIII[lIIIlIIIIl[20]] = lllIIlllIIlI("6dRoi1Ec0tBRuLyJXPgmyw==", "lWdvz");
        lIIIlIIIII[lIIIlIIIIl[22]] = lllIIlllIIlI("iHtllhTSnndJWcyPYnRpHg==", "sfBMw");
        lIIIlIIIII[lIIIlIIIIl[27]] = lllIIlllIIlI("7waUApvDWjI=", "pCLwp");
        lIIIlIIIII[lIIIlIIIIl[28]] = lllIIlllIIlI("RxAoXsMSDec=", "OBxdl");
        lIIIlIIIII[lIIIlIIIIl[29]] = lllIIlllIIII("LxEPIhM=", "kcfLx");
        lIIIlIIIII[lIIIlIIIIl[30]] = lllIIlllIIII("CRMiSDooUjkBIC4VNQUrZxc6HDwmHDcN", "GrThN");
        lIIIlIIIII[lIIIlIIIIl[31]] = lllIIlllIIII("IhojMQ8HDA==", "fuLCx");
        lIIIlIIIII[lIIIlIIIIl[32]] = lllIIlllIIII("FQMqPA==", "ZsORI");
        lIIIlIIIII[lIIIlIIIIl[33]] = lllIIlllIIII("OAc6BzxaOnQ0OxkdMhQ2", "zuSfR");
        lIIIlIIIII[lIIIlIIIIl[34]] = lllIIlllIIIl("whNyIDHl20e7yIZUdH5kRg==", "aESGn");
        lIIIlIIIII[lIIIlIIIIl[37]] = lllIIlllIIIl("OS/va7qwLxFt+Hgo9OzCfQ==", "LYuPP");
        lIIIlIIIII[lIIIlIIIIl[38]] = lllIIlllIIlI("1pqdqDpoVw/g2Mm5XW/bbg==", "BfGQd");
        lIIIlIIIII[lIIIlIIIIl[39]] = lllIIlllIIII("MB0MMSA=", "usxTR");
        lIIIlIIIII[lIIIlIIIIl[45]] = lllIIlllIIII("HwA+JmEBHSE5NBIdcyU2HBs0MzM=", "uuSVA");
        lIIIlIIIII[lIIIlIIIIl[46]] = lllIIlllIIIl("t8KGordAuVAbA0ZXYEPxLWXQprRGY5lO", "vKlEo");
        lIIIlIIIII[lIIIlIIIIl[49]] = lllIIlllIIlI("nuUVT/PCpMzaouANmCfVfg==", "Djgbv");
        lIIIlIIIII[lIIIlIIIIl[25]] = lllIIlllIIIl("c8MQtCYFhGU=", "ySIwu");
        lIIIlIIIII[lIIIlIIIIl[50]] = lllIIlllIIlI("ASY5/3qDVG4=", "BsEEg");
        lIIIlIIIII[lIIIlIIIIl[56]] = lllIIlllIIIl("kQffuutgG5s=", "FZCjC");
        lIIIlIIIII[lIIIlIIIIl[57]] = lllIIlllIIlI("BP+owUbasUA=", "hLCEm");
        lIIIlIIIII[lIIIlIIIIl[65]] = lllIIlllIIIl("A7ryggZwrHA=", "EONMI");
        lIIIlIIIII[lIIIlIIIIl[23]] = lllIIlllIIIl("Pyd0yNYZrAA=", "XsLtI");
        lIIIlIIIII[lIIIlIIIIl[74]] = lllIIlllIIII("OQYcFQIOAhgHGg==", "igofc");
        lIIIlIIIII[lIIIlIIIIl[75]] = lllIIlllIIIl("y3xnzPpi2LA=", "FuEjJ");
        lIIIlIIIII[lIIIlIIIIl[81]] = lllIIlllIIlI("zLNlv6rSMPQwAzg+47/2rg==", "ONZvY");
        lIIIlIIIII[lIIIlIIIIl[82]] = lllIIlllIIlI("+By5Y1PKyiE=", "URFHN");
        lIIIlIIIII[lIIIlIIIIl[86]] = lllIIlllIIlI("LBDO3GsY4Jf0hf3C/vDtPA==", "zFbEi");
        lIIIlIIIII[lIIIlIIIIl[87]] = lllIIlllIIlI("56LN/LuTboU=", "YgviD");
        lIIIlIIIII[lIIIlIIIIl[89]] = lllIIlllIIlI("gat7P0raqNI=", "cFaRx");
        lIIIlIIIII[lIIIlIIIIl[90]] = lllIIlllIIII("KxoTAQ==", "djvoO");
        lIIIlIIIII[lIIIlIIIIl[94]] = lllIIlllIIII("AC00FyY=", "LHPpC");
        lIIIlIIIII[lIIIlIIIIl[95]] = lllIIlllIIII("AD0jHwU=", "CQJrg");
        lIIIlIIIII[lIIIlIIIIl[98]] = lllIIlllIIIl("w8S91lD2f7c=", "bwHbM");
        lIIIlIIIII[lIIIlIIIIl[99]] = lllIIlllIIIl("wnwHjPziDKs=", "muMnj");
        lIIIlIIIII[lIIIlIIIIl[105]] = lllIIlllIIIl("If2uUc+Wtv0=", "KXnSK");
        lIIIlIIIII[lIIIlIIIIl[107]] = lllIIlllIIII("PgM9Bg==", "zlRtR");
        lIIIlIIIII[lIIIlIIIIl[108]] = lllIIlllIIII("BwU8Bw==", "HuYiP");
        lIIIlIIIII[lIIIlIIIIl[109]] = lllIIlllIIlI("Wan3dd9OaL0=", "XqHul");
        lIIIlIIIII[lIIIlIIIIl[128]] = lllIIlllIIlI("LLY1AECLnk4=", "vyIGb");
        lIIIlIIIII[lIIIlIIIIl[129]] = lllIIlllIIIl("NhexmsrguMQ=", "bpktU");
        lIIIlIIIII[lIIIlIIIIl[130]] = lllIIlllIIlI("dbN6sHUDnO4=", "HEEDK");
        lIIIlIIIII[lIIIlIIIIl[2]] = lllIIlllIIIl("ci3aa3z7LO8=", "JnxAr");
        lIIIlIIIII[lIIIlIIIIl[131]] = lllIIlllIIlI("PipZqqfL+ZE=", "lAjjL");
        lIIIlIIIII[lIIIlIIIIl[132]] = lllIIlllIIlI("5Hpn8N+Z1sQ=", "vofra");
        lIIIlIIIII[lIIIlIIIIl[138]] = lllIIlllIIII("DxU7GAA=", "HgRtl");
        lIIIlIIIII[lIIIlIIIIl[139]] = lllIIlllIIII("Gio2Bg==", "UZShH");
        lIIIlIIIII[lIIIlIIIIl[140]] = lllIIlllIIII("EQgkFBs=", "VzMxw");
        lIIIlIIIII[lIIIlIIIIl[141]] = lllIIlllIIlI("HfVCM9WGIGI=", "WVNkD");
        lIIIlIIIII[lIIIlIIIIl[151]] = lllIIlllIIII("HAgjIh96FC0mEz8W", "ZdBQw");
        lIIIlIIIII[lIIIlIIIIl[152]] = lllIIlllIIlI("SJMlAuiFNoQ=", "zEowS");
        lIIIlIIIII[lIIIlIIIIl[154]] = lllIIlllIIIl("z0Na47mg9obrCPRjwsr0oQ==", "nHBuu");
        lIIIlIIIII[lIIIlIIIIl[155]] = lllIIlllIIII("LDQjJw9KKC0jAw8q", "jXBTg");
        lIIIlIIIII[lIIIlIIIIl[156]] = lllIIlllIIIl("qOWnLRt+B1TNDMBQNCdyKQ==", "hhnMk");
        lIIIlIIIII[lIIIlIIIIl[158]] = lllIIlllIIII("PB0FOhFaAQs+HR8D", "zqdIy");
        lIIIlIIIII[lIIIlIIIIl[161]] = lllIIlllIIII("HRU6HUY5FTAU", "JtVqf");
        lIIIlIIIII[lIIIlIIIIl[162]] = lllIIlllIIlI("oKi7sEKTzW4=", "xCZJz");
        lIIIlIIIII[lIIIlIIIIl[163]] = lllIIlllIIII("KSkSGwYS", "zLsie");
        lIIIlIIIII[lIIIlIIIIl[164]] = lllIIlllIIIl("lxFf2AxZ8u7H/b8SXiB7Gdc/tO/Pygp76ivmzUQhlL0=", "KJPqq");
        lIIIlIIIII[lIIIlIIIIl[165]] = lllIIlllIIlI("qk88vFZEZV0=", "Hsfnp");
        lIIIlIIIII[lIIIlIIIIl[166]] = lllIIlllIIlI("5Lr/7wscFadfAii8NmxBw2VCOkpDNOoEab/ZYpZPAPI=", "SVtCQ");
        lIIIlIIIII[lIIIlIIIIl[167]] = lllIIlllIIIl("W1JODSKcc0k=", "vkTgn");
        lIIIlIIIII[lIIIlIIIIl[168]] = lllIIlllIIlI("WWe4hETT/2A7utmtu7W0fCY6h3OibfNQWC/3XAsZ7Dg=", "kguig");
        lIIIlIIIII[lIIIlIIIIl[169]] = lllIIlllIIIl("ZFB4Q21WwjGXYY0Nqe4t0g==", "MsKLw");
        lIIIlIIIII[lIIIlIIIIl[170]] = lllIIlllIIlI("dp6q0UdwIB5oUolMgIqG3wXDtdhwkHR8bYUui0l6Ikg=", "WNmHd");
        lIIIlIIIII[lIIIlIIIIl[171]] = lllIIlllIIlI("mRt8wQxAi0g=", "pmfQF");
        lIIIlIIIII[lIIIlIIIIl[172]] = lllIIlllIIlI("cvDWThDunB3vHe6VlX2THiYUhjEUjYJDefY0aGlApP4=", "pWaXQ");
        lIIIlIIIII[lIIIlIIIIl[173]] = lllIIlllIIIl("V9QqModm5Oo=", "nXqXK");
        lIIIlIIIII[lIIIlIIIIl[174]] = lllIIlllIIlI("F8wzhcOL/e4uCSkg/4tJ8A==", "vIwJZ");
        lIIIlIIIII[lIIIlIIIIl[175]] = lllIIlllIIIl("TkoIT+SzLJs=", "aixxR");
        lIIIlIIIII[lIIIlIIIIl[176]] = lllIIlllIIlI("oUt6NyPYX3c6ND7/iIoK5w==", "eggyJ");
        lIIIlIIIII[lIIIlIIIIl[177]] = lllIIlllIIII("FQY6axUdBjo4", "riNKw");
        lIIIlIIIII[lIIIlIIIIl[26]] = lllIIlllIIIl("dPW+9c5C7JNXe6rFduswLQ==", "GRjPW");
        lIIIlIIIII[lIIIlIIIIl[184]] = lllIIlllIIlI("mC9DcxZO2xI+J8t/7uBNJw==", "YHrlC");
        lIIIlIIIII[lIIIlIIIIl[185]] = lllIIlllIIlI("PNFg7cMbEZZLMz9dwSBQnd5AnJoDQhYm", "nsioF");
        lIIIlIIIII[lIIIlIIIIl[191]] = lllIIlllIIII("EBIyVw==", "IwAyj");
        lIIIlIIIII[lIIIlIIIIl[192]] = lllIIlllIIII("HAIJZSQmEw8kKSkeVmUyLQYOYjMgRwMqMGUAFTF6", "EgzEE");
        lIIIlIIIII[lIIIlIIIIl[193]] = lllIIlllIIIl("Th+8KRWFYWiHAuEozGZqkf2tDaj7w34w", "lfFVF");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0125, code lost:
        if (lllIIllllIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0014o.lIIIlIIIIl[4]) != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2 = new int[lIIIlIIIIl[0]];
        iArr2[lIIIlIIIIl[1]] = lIIIlIIIIl[10];
        if (lllIIllllIll(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIIIl[10], lIIIlIIIIl[12], lIIIlIIIIl[178]));
            "".length();
        }
        int[] iArr3 = new int[lIIIlIIIIl[0]];
        iArr3[lIIIlIIIIl[1]] = lIIIlIIIIl[11];
        if (lllIIllllIll(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIIIl[11], lIIIlIIIIl[25], lIIIlIIIIl[179]));
            "".length();
        }
        if (lllIIllllIll(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlIIIII[lIIIlIIIIl[185]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIIIIl[180], lIIIlIIIIl[12], lIIIlIIIIl[181]));
            "".length();
        }
        int[] iArr4 = new int[lIIIlIIIIl[0]];
        iArr4[lIIIlIIIIl[1]] = lIIIlIIIIl[8];
        if (lllIIllllIIl(Bank.contains(iArr4) ? 1 : 0)) {
            int[] iArr5 = new int[lIIIlIIIIl[0]];
            iArr5[lIIIlIIIIl[1]] = lIIIlIIIIl[8];
            if (lllIIllllIIl(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[lIIIlIIIIl[0]];
                iArr6[lIIIlIIIIl[1]] = lIIIlIIIIl[8];
            }
            iArr = new int[lIIIlIIIIl[0]];
            iArr[lIIIlIIIIl[1]] = lIIIlIIIIl[9];
            if (lllIIllllIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr7 = new int[lIIIlIIIIl[0]];
                iArr7[lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                if (!lllIIllllIIl(Bank.contains(iArr7) ? 1 : 0)) {
                    return;
                }
                int[] iArr8 = new int[lIIIlIIIIl[0]];
                iArr8[lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                if (!lllIIllllIlI(Bank.getFirst(iArr8).getQuantity(), lIIIlIIIIl[31])) {
                    return;
                }
            }
            bv.add(new C0003d(lIIIlIIIIl[9], lIIIlIIIIl[95], lIIIlIIIIl[182]));
            "".length();
        }
        bv.add(new C0003d(lIIIlIIIIl[8], lIIIlIIIIl[38], C0008i.bq));
        "".length();
        iArr = new int[lIIIlIIIIl[0]];
        iArr[lIIIlIIIIl[1]] = lIIIlIIIIl[9];
        if (lllIIllllIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIlIIIIl[9], lIIIlIIIIl[95], lIIIlIIIIl[182]));
        "".length();
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIIlIIIII[lIIIlIIIIl[184]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private static boolean ab() {
        if (lllIlIIIIIIl(Vars.getBit(lIIIlIIIIl[25]), lIIIlIIIIl[0]) && lllIIlllllII(Movement.getRunEnergy(), lIIIlIIIIl[24]) && lllIIllllIIl(Inventory.isEmpty() ? 1 : 0)) {
            ?? r0 = lIIIlIIIIl[0];
            "".length();
            return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIIIlIIIIl[1];
    }

    private static void lllIIllllIII() {
        lIIIlIIIIl = new int[195];
        lIIIlIIIIl[0] = " ".length();
        lIIIlIIIIl[1] = ((((35 + 19) - (-104)) + 87) ^ (((175 + 145) - 302) + 176)) & (((((164 + 152) - 282) + 132) ^ (((126 + 20) - 116) + 115)) ^ (-" ".length()));
        lIIIlIIIIl[2] = (87 ^ 41) ^ (138 ^ 198);
        lIIIlIIIIl[3] = (-((-23337) & 32621)) & (-2177) & 32767;
        lIIIlIIIIl[4] = "  ".length();
        lIIIlIIIIl[5] = (-((-841) & 19325)) & (-8258) & 31741;
        lIIIlIIIIl[6] = "   ".length();
        lIIIlIIIIl[7] = 69 ^ 65;
        lIIIlIIIIl[8] = (-((-12561) & 32667)) & (-5) & 32735;
        lIIIlIIIIl[9] = (-16561) & 24567;
        lIIIlIIIIl[10] = (-12499) & 16351;
        lIIIlIIIIl[11] = (-28724) & 31739;
        lIIIlIIIIl[12] = 73 ^ 76;
        lIIIlIIIIl[13] = (-2117) & 7670;
        lIIIlIIIIl[14] = 118 ^ 112;
        lIIIlIIIIl[15] = (-10319) & 15871;
        lIIIlIIIIl[16] = (((16 + 75) - (-97)) + 6) ^ (((76 + 153) - 195) + 163);
        lIIIlIIIIl[17] = (-2625) & 8179;
        lIIIlIIIIl[18] = 143 ^ 135;
        lIIIlIIIIl[19] = (-((-8039) & 32623)) & (-513) & 30653;
        lIIIlIIIIl[20] = (33 ^ 77) ^ (47 ^ 74);
        lIIIlIIIIl[21] = (-((-16642) & 19277)) & (-8193) & 16383;
        lIIIlIIIIl[22] = (((127 + 58) - 52) + 18) ^ (((88 + 46) - 28) + 51);
        lIIIlIIIIl[23] = 28 ^ 2;
        lIIIlIIIIl[24] = 47 ^ 117;
        lIIIlIIIIl[25] = 183 ^ 174;
        lIIIlIIIIl[26] = 81 ^ 1;
        lIIIlIIIIl[27] = 9 ^ 2;
        lIIIlIIIIl[28] = (21 ^ 49) ^ (149 ^ 189);
        lIIIlIIIIl[29] = (29 ^ 78) ^ (34 ^ 124);
        lIIIlIIIIl[30] = (57 ^ 121) ^ (117 ^ 59);
        lIIIlIIIIl[31] = ((155 ^ 178) & ((18 ^ 59) ^ (-1))) ^ (1 ^ 14);
        lIIIlIIIIl[32] = 110 ^ 126;
        lIIIlIIIIl[33] = (((86 + 95) - 142) + 96) ^ (((27 + 27) - (-96)) + 0);
        lIIIlIIIIl[34] = (((57 + 73) - 11) + 20) ^ (((139 + 7) - 38) + 45);
        lIIIlIIIIl[35] = (-((-4035) & 24526)) & (-5) & 23551;
        lIIIlIIIIl[36] = (-3196) & 8187;
        lIIIlIIIIl[37] = 110 ^ 125;
        lIIIlIIIIl[38] = (172 ^ 186) ^ "  ".length();
        lIIIlIIIIl[39] = (74 ^ 12) ^ (212 ^ 135);
        lIIIlIIIIl[40] = (-((-20525) & 28735)) & (-5125) & 16382;
        lIIIlIIIIl[41] = (-24577) & 29573;
        lIIIlIIIIl[42] = (-" ".length()) & (-21505) & 24543;
        lIIIlIIIIl[43] = (-11369) & 16367;
        lIIIlIIIIl[44] = (-((-2757) & 20189)) & (-8198) & 28671;
        lIIIlIIIIl[45] = 178 ^ 164;
        lIIIlIIIIl[46] = 39 ^ 48;
        lIIIlIIIIl[47] = (-(109 ^ 76)) & (-8201) & 11261;
        lIIIlIIIIl[48] = (-26705) & 31707;
        lIIIlIIIIl[49] = (221 ^ 159) ^ (74 ^ 16);
        lIIIlIIIIl[50] = 189 ^ 167;
        lIIIlIIIIl[51] = (-((-8469) & 12597)) & (-9217) & 16367;
        lIIIlIIIIl[52] = (-((-4591) & 32255)) & (-103) & 32767;
        lIIIlIIIIl[53] = (-24597) & 27607;
        lIIIlIIIIl[54] = (-((-8321) & 27889)) & (-3) & 24575;
        lIIIlIIIIl[55] = (-8259) & 11262;
        lIIIlIIIIl[56] = (((152 + 70) - 142) + 96) ^ (((123 + 72) - 31) + 7);
        lIIIlIIIIl[57] = 173 ^ 177;
        lIIIlIIIIl[58] = (-((-15278) & 32703)) & (-3) & 20415;
        lIIIlIIIIl[59] = (-25715) & 30718;
        lIIIlIIIIl[60] = (-16455) & 19423;
        lIIIlIIIIl[61] = (-((-16537) & 18683)) & (-16385) & 23547;
        lIIIlIIIIl[62] = (-((-5699) & 30323)) & (-1089) & 28665;
        lIIIlIIIIl[63] = (-((-8725) & 9845)) & (-26634) & 32763;
        lIIIlIIIIl[64] = (-((-6977) & 32617)) & (-65) & 28671;
        lIIIlIIIIl[65] = (170 ^ 137) ^ (8 ^ 54);
        lIIIlIIIIl[66] = (-((-3845) & 28470)) & (-5185) & 32767;
        lIIIlIIIIl[67] = (-((-137) & 25805)) & (-17) & 30719;
        lIIIlIIIIl[68] = (-((-14421) & 31829)) & (-8298) & 28667;
        lIIIlIIIIl[69] = (-((-8577) & 11713)) & (-8194) & 16379;
        lIIIlIIIIl[70] = (-((-4059) & 28635)) & (-5197) & 32735;
        lIIIlIIIIl[71] = (-26630) & 31685;
        lIIIlIIIIl[72] = (-9297) & 12253;
        lIIIlIIIIl[73] = (-26677) & 31743;
        lIIIlIIIIl[74] = 13 ^ 18;
        lIIIlIIIIl[75] = 26 ^ 58;
        lIIIlIIIIl[76] = (-((-2309) & 11607)) & (-4101) & 16350;
        lIIIlIIIIl[77] = (-1041) & 6111;
        lIIIlIIIIl[78] = (-17473) & 20427;
        lIIIlIIIIl[79] = (-26626) & 31719;
        lIIIlIIIIl[80] = (-((-4474) & 6525)) & (-1065) & 8187;
        lIIIlIIIIl[81] = (((95 + 113) - 165) + 135) ^ (((90 + 94) - 107) + 70);
        lIIIlIIIIl[82] = (34 ^ 48) ^ (168 ^ 152);
        lIIIlIIIIl[83] = (-((-21027) & 24103)) & (-8194) & 16367;
        lIIIlIIIIl[84] = (-18435) & 23539;
        lIIIlIIIIl[85] = (-((-519) & 30279)) & (-33) & 32764;
        lIIIlIIIIl[86] = (24 ^ 46) ^ (189 ^ 168);
        lIIIlIIIIl[87] = (22 ^ 95) ^ (65 ^ 44);
        lIIIlIIIIl[88] = (-((-17153) & 30499)) & (-65) & 16383;
        lIIIlIIIIl[89] = (67 ^ 117) ^ (126 ^ 109);
        lIIIlIIIIl[90] = (((37 + 57) - 49) + 133) ^ (((99 + 30) - 22) + 41);
        lIIIlIIIIl[91] = (-8193) & 13285;
        lIIIlIIIIl[92] = (-17417) & 20398;
        lIIIlIIIIl[93] = (-18465) & 23551;
        lIIIlIIIIl[94] = (138 ^ 160) ^ (49 ^ 60);
        lIIIlIIIIl[95] = (96 ^ 50) ^ (29 ^ 103);
        lIIIlIIIIl[96] = (-4161) & 7150;
        lIIIlIIIIl[97] = (-27681) & 32766;
        lIIIlIIIIl[98] = 58 ^ 19;
        lIIIlIIIIl[99] = (18 ^ 1) ^ (91 ^ 98);
        lIIIlIIIIl[100] = (-((-4241) & 21715)) & (-1) & 20471;
        lIIIlIIIIl[101] = (-((-6666) & 31263)) & (-3081) & 32765;
        lIIIlIIIIl[102] = (-1089) & 4094;
        lIIIlIIIIl[103] = (-20491) & 23483;
        lIIIlIIIIl[104] = (-((-2499) & 19451)) & (-2051) & 24570;
        lIIIlIIIIl[105] = 93 ^ 118;
        lIIIlIIIIl[106] = (-((-13905) & 32598)) & (-5131) & 24511;
        lIIIlIIIIl[107] = (((107 + 6) - 81) + 101) ^ (((149 + 131) - 236) + 125);
        lIIIlIIIIl[108] = (((152 + 27) - 163) + 164) ^ (((31 + 58) - 17) + 81);
        lIIIlIIIIl[109] = 57 ^ 23;
        lIIIlIIIIl[110] = (-20483) & 23506;
        lIIIlIIIIl[111] = (-((-8583) & 26023)) & (-8193) & 30714;
        lIIIlIIIIl[112] = (-((-2727) & 20143)) & (-8225) & 28671;
        lIIIlIIIIl[113] = (-3113) & 8191;
        lIIIlIIIIl[114] = (-((-6996) & 8027)) & (-8225) & 12287;
        lIIIlIIIIl[115] = (-3081) & 8158;
        lIIIlIIIIl[116] = (-1067) & 6143;
        lIIIlIIIIl[117] = (-4100) & 7135;
        lIIIlIIIIl[118] = (-11300) & 16375;
        lIIIlIIIIl[119] = (-((-12841) & 29227)) & (-8193) & 27615;
        lIIIlIIIIl[120] = (-((-2719) & 24254)) & (-8193) & 32767;
        lIIIlIIIIl[121] = (-9229) & 12271;
        lIIIlIIIIl[122] = (-((-3785) & 24265)) & (-9227) & 32750;
        lIIIlIIIIl[123] = (-10241) & 15309;
        lIIIlIIIIl[124] = (-((-673) & 20145)) & (-36) & 24575;
        lIIIlIIIIl[125] = (-((-2785) & 12027)) & (-16385) & 28667;
        lIIIlIIIIl[126] = (-17410) & 22479;
        lIIIlIIIIl[127] = (-((-2781) & 31486)) & (-1025) & 32767;
        lIIIlIIIIl[128] = 156 ^ 179;
        lIIIlIIIIl[129] = (15 ^ 46) ^ (60 ^ 45);
        lIIIlIIIIl[130] = 164 ^ 149;
        lIIIlIIIIl[131] = 115 ^ 64;
        lIIIlIIIIl[132] = (75 ^ 120) ^ (158 ^ 153);
        lIIIlIIIIl[133] = (-((-7139) & 24555)) & (-12291) & 32734;
        lIIIlIIIIl[134] = (-((-4841) & 32489)) & (-5) & 32686;
        lIIIlIIIIl[135] = (-((-5059) & 21475)) & (-10) & 19439;
        lIIIlIIIIl[136] = (-26695) & 31727;
        lIIIlIIIIl[137] = (-((-922) & 14271)) & (-16393) & 32751;
        lIIIlIIIIl[138] = 130 ^ 183;
        lIIIlIIIIl[139] = 55 ^ 1;
        lIIIlIIIIl[140] = (145 ^ 197) ^ (160 ^ 195);
        lIIIlIIIIl[141] = 253 ^ 197;
        lIIIlIIIIl[142] = (-((-16961) & 30315)) & (-16401) & 32763;
        lIIIlIIIIl[143] = (-" ".length()) & (-29704) & 32703;
        lIIIlIIIIl[144] = (-13326) & 16317;
        lIIIlIIIIl[145] = (-26689) & 31733;
        lIIIlIIIIl[146] = (-((-8241) & 9273)) & (-18465) & 24571;
        lIIIlIIIIl[147] = (-((-2543) & 7663)) & (-8193) & 16319;
        lIIIlIIIIl[148] = (-19461) & 24524;
        lIIIlIIIIl[149] = (-1025) & 6071;
        lIIIlIIIIl[150] = (-((-12635) & 30047)) & (-4161) & 24575;
        lIIIlIIIIl[151] = 82 ^ 107;
        lIIIlIIIIl[152] = (109 ^ 65) ^ (70 ^ 80);
        lIIIlIIIIl[153] = (-((-283) & 27967)) & (-27) & 32767;
        lIIIlIIIIl[154] = (143 ^ 175) ^ (92 ^ 71);
        lIIIlIIIIl[155] = (((232 + 162) - 311) + 165) ^ (((1 + 87) - 63) + 171);
        lIIIlIIIIl[156] = 25 ^ 36;
        lIIIlIIIIl[157] = (-((-24133) & 32461)) & (-4353) & 15871;
        lIIIlIIIIl[158] = 172 ^ 146;
        lIIIlIIIIl[159] = (-9282) & 14333;
        lIIIlIIIIl[160] = (-25669) & 30716;
        lIIIlIIIIl[161] = (171 ^ 144) ^ (8 ^ 12);
        lIIIlIIIIl[162] = (((23 + 197) - 22) + 6) ^ (((14 + 124) - 42) + 44);
        lIIIlIIIIl[163] = 58 ^ 123;
        lIIIlIIIIl[164] = (((80 + 121) - 7) + 20) ^ (((104 + 18) - 119) + 145);
        lIIIlIIIIl[165] = " ".length() ^ (134 ^ 196);
        lIIIlIIIIl[166] = (201 ^ 172) ^ (105 ^ 72);
        lIIIlIIIIl[167] = 120 ^ 61;
        lIIIlIIIIl[168] = (((18 + 113) - 42) + 147) ^ (((71 + 3) - (-68)) + 28);
        lIIIlIIIIl[169] = (((219 + 163) - 316) + 169) ^ (((16 + 130) - 67) + 93);
        lIIIlIIIIl[170] = (98 ^ 1) ^ (25 ^ 50);
        lIIIlIIIIl[171] = (((104 + 175) - 239) + 213) ^ (((71 + 28) - 92) + 173);
        lIIIlIIIIl[172] = 93 ^ 23;
        lIIIlIIIIl[173] = 224 ^ 171;
        lIIIlIIIIl[174] = (((157 + 32) - 49) + 57) ^ (((120 + 80) - 128) + 65);
        lIIIlIIIIl[175] = 211 ^ 158;
        lIIIlIIIIl[176] = (251 ^ 187) ^ (140 ^ 130);
        lIIIlIIIIl[177] = 55 ^ 120;
        lIIIlIIIIl[178] = (-((-2881) & 7023)) & (-1) & 6142;
        lIIIlIIIIl[179] = (-(((78 + 2) - 21) + 70)) & (-17945) & 24572;
        lIIIlIIIIl[180] = (-((-8277) & 12406)) & (-16387) & 32495;
        lIIIlIIIIl[181] = (-6680) & 31679;
        lIIIlIIIIl[182] = (-24580) & 25479;
        lIIIlIIIIl[183] = 222 ^ 186;
        lIIIlIIIIl[184] = 50 ^ 99;
        lIIIlIIIIl[185] = (103 ^ 12) ^ (115 ^ 74);
        lIIIlIIIIl[186] = (-26771) & 31743;
        lIIIlIIIIl[187] = (-18563) & 23551;
        lIIIlIIIIl[188] = (-((-129) & 13519)) & (-16401) & 32735;
        lIIIlIIIIl[189] = (((85 ^ 98) + (147 ^ 157)) - (-(144 ^ 137))) + (120 ^ 89);
        lIIIlIIIIl[190] = (((19 + 7) - (-169)) + 10) ^ (((64 + 178) - 117) + 54);
        lIIIlIIIIl[191] = 241 ^ 162;
        lIIIlIIIIl[192] = (((127 + 17) - (-17)) + 55) ^ (((122 + 126) - 178) + 70);
        lIIIlIIIIl[193] = 57 ^ 108;
        lIIIlIIIIl[194] = 6 ^ 80;
    }

    private static String lllIIlllIIIl(String llIIIIIIlIIl, String llIIIIIIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIIIlIII.getBytes(StandardCharsets.UTF_8)), lIIIlIIIIl[18]), "DES");
            Cipher llIIIIIIlIll = Cipher.getInstance("DES");
            llIIIIIIlIll.init(lIIIlIIIIl[4], secretKeySpec);
            return new String(llIIIIIIlIll.doFinal(Base64.getDecoder().decode(llIIIIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIIIIlIlI) {
            llIIIIIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlllllIl(Object obj) {
        return obj != null;
    }

    private static boolean lllIlIIIIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lllIlIIIIIII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIIlIIIIl[1];
    }

    static {
        lllIIllllIII();
        lllIIlllIIll();
        bv = new ArrayList();
        I = new WorldPoint(lIIIlIIIIl[122], lIIIlIIIIl[186], lIIIlIIIIl[0]);
        cc = new WorldPoint(lIIIlIIIIl[35], lIIIlIIIIl[187], lIIIlIIIIl[0]);
        cd = new WorldArea(lIIIlIIIIl[188], lIIIlIIIIl[36], lIIIlIIIIl[189], lIIIlIIIIl[190], lIIIlIIIIl[0]);
        String[] strArr = new String[lIIIlIIIIl[6]];
        strArr[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[191]];
        strArr[lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[192]];
        strArr[lIIIlIIIIl[4]] = lIIIlIIIII[lIIIlIIIIl[193]];
        bR = strArr;
    }

    private static String lllIIlllIIII(String lIlllllllIIl, String lIlllllllIII) {
        String str = new String(Base64.getDecoder().decode(lIlllllllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIllllllIlll = new StringBuilder();
        char[] lIllllllIllI = lIlllllllIII.toCharArray();
        int lIllllllIlIl = lIIIlIIIIl[1];
        char[] charArray = str.toCharArray();
        int lIlllllIlllI = charArray.length;
        int i = lIIIlIIIIl[1];
        while (lllIIllllIlI(i, lIlllllIlllI)) {
            char lIlllllllIlI = charArray[i];
            lIllllllIlll.append((char) (lIlllllllIlI ^ lIllllllIllI[lIllllllIlIl % lIllllllIllI.length]));
            "".length();
            lIllllllIlIl++;
            i++;
            "".length();
            if ("   ".length() <= (((219 ^ 194) ^ (164 ^ 129)) & (((192 ^ 183) ^ (140 ^ 199)) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lIllllllIlll);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0217, code lost:
        if (lllIIllllIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.C0014o.lIIIlIIIIl[4]) != false) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1134, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1153, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1227, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1343, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1346, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1349, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1352, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1355, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1358, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1386, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ay() {
        if (lllIIllllIIl(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lllIIllllIlI(bv.size(), lIIIlIIIIl[0])) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[1]]);
                bt = lIIIlIIIIl[1];
            }
        }
        if (lllIIllllIll(bt ? 1 : 0)) {
            if (!lllIIlllllII(Skills.getLevel(Skill.AGILITY), lIIIlIIIIl[2]) || lllIIllllIlI(Skills.getLevel(Skill.THIEVING), lIIIlIIIIl[2])) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[0]]);
                return;
            }
            if (lllIIllllIll(ab() ? 1 : 0) && lllIIllllIll(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] iArr = new int[lIIIlIIIIl[0]];
                iArr[lIIIlIIIIl[1]] = lIIIlIIIIl[3];
                if (lllIIllllIll(Inventory.contains(iArr) ? 1 : 0) && lllIIlllllII(Skills.getLevel(Skill.AGILITY), lIIIlIIIIl[2]) && lllIIlllllII(Skills.getLevel(Skill.THIEVING), lIIIlIIIIl[2])) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lllIIlllllIl(nearest) && lllIIllllIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[4]];
                        C0000a.a(nearest);
                    }
                    int[] iArr2 = new int[lIIIlIIIIl[0]];
                    iArr2[lIIIlIIIIl[1]] = lIIIlIIIIl[3];
                    if (lllIIllllIIl(Inventory.contains(iArr2) ? 1 : 0)) {
                        return;
                    }
                    if (lllIIlllllIl(nearest) && lllIIllllIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lllIIllllIll(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIIIlIIIIl[5]);
                            "".length();
                        }
                        if (lllIIllllIIl(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[6]];
                            if (lllIIllllllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIIIlIIIIl[7]);
                                "".length();
                            }
                            if (lllIIllllllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIIIlIIIIl[4]);
                                "".length();
                            }
                            Time.sleepTicks(lIIIlIIIIl[6]);
                            "".length();
                            int[] iArr3 = new int[lIIIlIIIIl[0]];
                            iArr3[lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                            if (lllIIllllIIl(Bank.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[lIIIlIIIIl[0]];
                                iArr4[lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                                if (lllIIllllIIl(Bank.contains(iArr4) ? 1 : 0)) {
                                    int[] iArr5 = new int[lIIIlIIIIl[0]];
                                    iArr5[lIIIlIIIIl[1]] = lIIIlIIIIl[8];
                                }
                                int[] iArr6 = new int[lIIIlIIIIl[7]];
                                iArr6[lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                                iArr6[lIIIlIIIIl[0]] = lIIIlIIIIl[10];
                                iArr6[lIIIlIIIIl[4]] = lIIIlIIIIl[8];
                                iArr6[lIIIlIIIIl[6]] = lIIIlIIIIl[11];
                                if (lllIIllllIll(C0004e.b(iArr6) ? 1 : 0)) {
                                    af();
                                    System.out.println(lIIIlIIIII[lIIIlIIIIl[12]]);
                                    bt = lIIIlIIIIl[0];
                                    return;
                                }
                                int[] iArr7 = new int[lIIIlIIIIl[7]];
                                iArr7[lIIIlIIIIl[1]] = lIIIlIIIIl[9];
                                iArr7[lIIIlIIIIl[0]] = lIIIlIIIIl[10];
                                iArr7[lIIIlIIIIl[4]] = lIIIlIIIIl[8];
                                iArr7[lIIIlIIIIl[6]] = lIIIlIIIIl[11];
                                if (lllIIllllIIl(C0004e.b(iArr7) ? 1 : 0)) {
                                    int[] iArr8 = new int[lIIIlIIIIl[0]];
                                    iArr8[lIIIlIIIIl[1]] = lIIIlIIIIl[13];
                                    if (lllIIllllIIl(Bank.contains(iArr8) ? 1 : 0)) {
                                        System.out.println(lIIIlIIIII[lIIIlIIIIl[14]]);
                                        bX = lIIIlIIIIl[0];
                                    }
                                    int[] iArr9 = new int[lIIIlIIIIl[0]];
                                    iArr9[lIIIlIIIIl[1]] = lIIIlIIIIl[15];
                                    if (lllIIllllIIl(Bank.contains(iArr9) ? 1 : 0)) {
                                        System.out.println(lIIIlIIIII[lIIIlIIIIl[16]]);
                                        bY = lIIIlIIIIl[0];
                                    }
                                    int[] iArr10 = new int[lIIIlIIIIl[0]];
                                    iArr10[lIIIlIIIIl[1]] = lIIIlIIIIl[17];
                                    if (lllIIllllIIl(Bank.contains(iArr10) ? 1 : 0)) {
                                        System.out.println(lIIIlIIIII[lIIIlIIIIl[18]]);
                                        bZ = lIIIlIIIIl[0];
                                    }
                                    int[] iArr11 = new int[lIIIlIIIIl[0]];
                                    iArr11[lIIIlIIIIl[1]] = lIIIlIIIIl[19];
                                    if (lllIIllllIIl(Bank.contains(iArr11) ? 1 : 0)) {
                                        System.out.println(lIIIlIIIII[lIIIlIIIIl[20]]);
                                        ca = lIIIlIIIIl[0];
                                    }
                                    int[] iArr12 = new int[lIIIlIIIIl[0]];
                                    iArr12[lIIIlIIIIl[1]] = lIIIlIIIIl[21];
                                    if (lllIIllllIIl(Bank.contains(iArr12) ? 1 : 0)) {
                                        System.out.println(lIIIlIIIII[lIIIlIIIIl[22]]);
                                        cb = lIIIlIIIIl[0];
                                    }
                                    if (lllIIllllIIl(cb ? 1 : 0) && lllIIllllIIl(ca ? 1 : 0) && lllIIllllIIl(bZ ? 1 : 0) && lllIIllllIIl(bY ? 1 : 0) && lllIIllllIIl(bX ? 1 : 0)) {
                                        return;
                                    }
                                    while (lllIIlllllll(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIIIIl[23])) {
                                        if (lllIIllllIIl(Bank.isOpen() ? 1 : 0)) {
                                            C0000a.b(C0005f.aO, lIIIlIIIIl[0]);
                                            C0000a.a(lIIIlIIIIl[11], lIIIlIIIIl[0]);
                                            C0000a.a(lIIIlIIIIl[8], lIIIlIIIIl[0]);
                                        }
                                        Movement.walkTo(I);
                                        "".length();
                                        Time.sleepTicks(lIIIlIIIIl[0]);
                                        "".length();
                                        "".length();
                                        if ((((87 ^ 27) ^ (37 ^ 48)) & (((37 ^ 91) ^ (65 ^ 102)) ^ (-" ".length()))) != 0) {
                                            return;
                                        }
                                    }
                                    if ((!lllIIlllllII(Movement.getRunEnergy(), lIIIlIIIIl[24]) || lllIIllllIll(Vars.getBit(lIIIlIIIIl[25]))) && lllIlIIIIIII(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIIIIl[23])) {
                                        C0000a.a(lIIIlIIIIl[11], lIIIlIIIIl[0]);
                                        C0000a.a(lIIIlIIIIl[8], lIIIlIIIIl[0]);
                                        while (lllIIllllIlI(Movement.getRunEnergy(), lIIIlIIIIl[26]) && lllIIllllIIl(Inventory.contains(C0005f.aW) ? 1 : 0)) {
                                            Inventory.getFirst(C0005f.aW).interact(lIIIlIIIII[lIIIlIIIIl[27]]);
                                            Time.sleepTicks(lIIIlIIIIl[0]);
                                            "".length();
                                            "".length();
                                            if ("  ".length() <= (((35 ^ 118) ^ (204 ^ 148)) & (((250 ^ 136) ^ (((25 + 23) - (-22)) + 57)) ^ (-" ".length())))) {
                                                return;
                                            }
                                        }
                                        if (lllIIllllIIl(Inventory.contains(C0005f.aV) ? 1 : 0)) {
                                            Time.sleepTicks(lIIIlIIIIl[4]);
                                            "".length();
                                            Inventory.getFirst(C0005f.aV).interact(lIIIlIIIII[lIIIlIIIIl[28]]);
                                        }
                                        if (lllIIllllIll(Bank.isOpen() ? 1 : 0)) {
                                            C0000a.a();
                                            Time.sleepTicks(lIIIlIIIIl[7]);
                                            "".length();
                                        }
                                        Bank.depositInventory();
                                    }
                                }
                            }
                            af();
                            System.out.println(lIIIlIIIII[lIIIlIIIIl[7]]);
                            bt = lIIIlIIIIl[0];
                            return;
                        }
                    }
                }
            }
            if (!lllIIllllIIl(ab() ? 1 : 0) || !lllIIllllIll(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIIlllllll(Players.getLocal().getWorldLocation().distanceTo(I), lIIIlIIIIl[23])) {
            }
            if (lllIIllllIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lllIIllllIlI(Movement.getRunEnergy(), lIIIlIIIIl[2])) {
                Inventory.getFirst(C0005f.aV).interact(lIIIlIIIII[lIIIlIIIIl[29]]);
                Time.sleepTicks(lIIIlIIIIl[0]);
                "".length();
            }
            if (lllIIllllIIl(ab() ? 1 : 0) && lllIIllllIll(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lllIIllllIll(bW ? 1 : 0)) {
                    if (lllIIlllllll(Players.getLocal().getWorldLocation().distanceTo(cc), lIIIlIIIIl[12])) {
                        AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[30]];
                        if (lllIIllllIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        Movement.walkTo(cc);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                    }
                    if (lllIlIIIIIII(Players.getLocal().getWorldLocation().distanceTo(cc), lIIIlIIIIl[12])) {
                        String[] strArr = new String[lIIIlIIIIl[0]];
                        strArr[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[31]];
                        TileObjects.getNearest(strArr).interact(lIIIlIIIII[lIIIlIIIIl[32]]);
                        Time.sleepTicks(lIIIlIIIIl[7]);
                        "".length();
                        if (lllIIllllIIl(Dialog.isOpen() ? 1 : 0)) {
                            bW = lIIIlIIIIl[0];
                        }
                    }
                }
                if (lllIIllllIIl(bW ? 1 : 0)) {
                    C0006g.a(lIIIlIIIII[lIIIlIIIIl[33]], bR);
                    List options = Dialog.getOptions();
                    if (lllIIllllIll(options.isEmpty() ? 1 : 0)) {
                        int i = lIIIlIIIIl[1];
                        while (lllIIllllIlI(i, options.size())) {
                            if (lllIIllllIIl(((Widget) options.get(i)).getText().contains(lIIIlIIIII[lIIIlIIIIl[34]]) ? 1 : 0)) {
                                bW = lIIIlIIIIl[1];
                            }
                            i++;
                            "".length();
                            if ((-" ".length()) >= " ".length()) {
                                return;
                            }
                        }
                    }
                }
            }
            if (lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlIIIIl[35], lIIIlIIIIl[36], lIIIlIIIIl[0])) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[37]];
                    String[] strArr2 = new String[lIIIlIIIIl[0]];
                    strArr2[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[38]];
                    TileObjects.getNearest(strArr2).interact(lIIIlIIIII[lIIIlIIIIl[39]]);
                    Time.sleepTicks(lIIIlIIIIl[0]);
                    "".length();
                }
                WorldPoint worldPoint = new WorldPoint(lIIIlIIIIl[40], lIIIlIIIIl[41], lIIIlIIIIl[0]);
                WorldPoint worldPoint2 = new WorldPoint(lIIIlIIIIl[42], lIIIlIIIIl[43], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlIIIIl[42], lIIIlIIIIl[41], lIIIlIIIIl[0])) ? 1 : 0)) {
                    Movement.walkTo(worldPoint2);
                    "".length();
                }
                WorldPoint worldPoint3 = new WorldPoint(lIIIlIIIIl[44], lIIIlIIIIl[43], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[45]];
                    Movement.walkTo(worldPoint3);
                    "".length();
                    Time.sleepTicks(lIIIlIIIIl[0]);
                    "".length();
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0)) {
                    AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[46]];
                    Movement.walkTo(worldPoint);
                    "".length();
                    Time.sleepTicks(lIIIlIIIIl[0]);
                    "".length();
                }
                WorldPoint worldPoint4 = new WorldPoint(lIIIlIIIIl[47], lIIIlIIIIl[48], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIIIII[lIIIlIIIIl[49]];
                        Movement.walkTo(worldPoint4);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ((-"   ".length()) > 0) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                    String[] strArr3 = new String[lIIIlIIIIl[0]];
                    strArr3[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[25]];
                    TileObjects.getNearest(strArr3).interact(lIIIlIIIII[lIIIlIIIIl[50]]);
                }
                WorldPoint worldPoint5 = new WorldPoint(lIIIlIIIIl[51], lIIIlIIIIl[52], lIIIlIIIIl[0]);
                WorldPoint worldPoint6 = new WorldPoint(lIIIlIIIIl[53], lIIIlIIIIl[54], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                    while (lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                        Movement.walkTo(worldPoint6);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("   ".length() <= 0) {
                            return;
                        }
                    }
                }
                WorldPoint worldPoint7 = new WorldPoint(lIIIlIIIIl[55], lIIIlIIIIl[48], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint7);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (" ".length() != " ".length()) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                    String[] strArr4 = new String[lIIIlIIIIl[0]];
                    strArr4[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[56]];
                    TileObjects.getNearest(strArr4).interact(lIIIlIIIII[lIIIlIIIIl[57]]);
                }
                WorldPoint worldPoint8 = new WorldPoint(lIIIlIIIIl[58], lIIIlIIIIl[59], lIIIlIIIIl[0]);
                WorldPoint worldPoint9 = new WorldPoint(lIIIlIIIIl[58], lIIIlIIIIl[54], lIIIlIIIIl[0]);
                WorldPoint worldPoint10 = new WorldPoint(lIIIlIIIIl[60], lIIIlIIIIl[61], lIIIlIIIIl[0]);
                if (!lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0) || lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                        Movement.walkTo(worldPoint10);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                    }
                }
                WorldArea worldArea = new WorldArea(lIIIlIIIIl[62], lIIIlIIIIl[63], lIIIlIIIIl[31], lIIIlIIIIl[45], lIIIlIIIIl[0]);
                new WorldPoint(lIIIlIIIIl[64], lIIIlIIIIl[61], lIIIlIIIIl[0]);
                if (lllIIllllIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIllllIll(Players.getLocal().isMoving() ? 1 : 0)) {
                    String[] strArr5 = new String[lIIIlIIIIl[0]];
                    strArr5[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[65]];
                    TileObjects.getNearest(strArr5).interact(lIIIlIIIII[lIIIlIIIIl[23]]);
                    Time.sleepTicks(lIIIlIIIIl[0]);
                    "".length();
                }
                WorldPoint worldPoint11 = new WorldPoint(lIIIlIIIIl[66], lIIIlIIIIl[67], lIIIlIIIIl[0]);
                WorldPoint worldPoint12 = new WorldPoint(lIIIlIIIIl[68], lIIIlIIIIl[69], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint12);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("   ".length() < 0) {
                            return;
                        }
                    }
                }
                WorldPoint worldPoint13 = new WorldPoint(lIIIlIIIIl[70], lIIIlIIIIl[71], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                    Movement.walkTo(worldPoint13);
                    "".length();
                    Time.sleepTicks(lIIIlIIIIl[0]);
                    "".length();
                }
                WorldPoint worldPoint14 = new WorldPoint(lIIIlIIIIl[72], lIIIlIIIIl[73], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                    while (lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                        Movement.walkTo(worldPoint14);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ((-(83 ^ 86)) >= 0) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                    String[] strArr6 = new String[lIIIlIIIIl[0]];
                    strArr6[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[74]];
                    TileObjects.getNearest(strArr6).interact(lIIIlIIIII[lIIIlIIIIl[75]]);
                }
                WorldArea worldArea2 = new WorldArea(lIIIlIIIIl[76], lIIIlIIIIl[77], lIIIlIIIIl[16], lIIIlIIIIl[25], lIIIlIIIIl[0]);
                WorldPoint worldPoint15 = new WorldPoint(lIIIlIIIIl[78], lIIIlIIIIl[79], lIIIlIIIIl[0]);
                if (lllIIllllIIl(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint16 = new WorldPoint(lIIIlIIIIl[72], lIIIlIIIIl[80], lIIIlIIIIl[0]);
                    if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                        Movement.walkTo(new WorldPoint(worldPoint16.getX(), worldPoint16.getY() + lIIIlIIIIl[14], lIIIlIIIIl[0]));
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[18]);
                        "".length();
                    }
                    if (lllIIlllllll(Players.getLocal().getWorldLocation().distanceTo(worldPoint15), lIIIlIIIIl[7])) {
                        Movement.walkTo(worldPoint15);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                    }
                    if (lllIlIIIIIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint15), lIIIlIIIIl[7])) {
                        String[] strArr7 = new String[lIIIlIIIIl[0]];
                        strArr7[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[81]];
                        TileObjects.getNearest(strArr7).interact(lIIIlIIIII[lIIIlIIIIl[82]]);
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                    }
                }
                WorldPoint worldPoint17 = new WorldPoint(lIIIlIIIIl[78], lIIIlIIIIl[83], lIIIlIIIIl[0]);
                WorldPoint worldPoint18 = new WorldPoint(lIIIlIIIIl[70], lIIIlIIIIl[84], lIIIlIIIIl[0]);
                WorldPoint worldPoint19 = new WorldPoint(lIIIlIIIIl[85], lIIIlIIIIl[83], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                    while (lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                        Movement.walkTo(worldPoint18);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[4]);
                        "".length();
                        "".length();
                        if ((-" ".length()) != (-" ".length())) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                    while (lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint19) ? 1 : 0)) {
                        Movement.walkTo(worldPoint19);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("   ".length() <= "  ".length()) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint19) ? 1 : 0)) {
                    String[] strArr8 = new String[lIIIlIIIIl[0]];
                    strArr8[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[86]];
                    TileObjects.getNearest(strArr8).interact(lIIIlIIIII[lIIIlIIIIl[87]]);
                    Time.sleepTicks(lIIIlIIIIl[0]);
                    "".length();
                }
                WorldPoint worldPoint20 = new WorldPoint(lIIIlIIIIl[85], lIIIlIIIIl[79], lIIIlIIIIl[0]);
                WorldPoint worldPoint21 = new WorldPoint(lIIIlIIIIl[88], lIIIlIIIIl[79], lIIIlIIIIl[0]);
                if (!lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint20) ? 1 : 0) || lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint21) ? 1 : 0)) {
                    String[] strArr9 = new String[lIIIlIIIIl[0]];
                    strArr9[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[89]];
                    TileObjects.getNearest(strArr9).interact(lIIIlIIIII[lIIIlIIIIl[90]]);
                }
                WorldPoint worldPoint22 = new WorldPoint(lIIIlIIIIl[85], lIIIlIIIIl[91], lIIIlIIIIl[0]);
                WorldPoint worldPoint23 = new WorldPoint(lIIIlIIIIl[88], lIIIlIIIIl[91], lIIIlIIIIl[0]);
                WorldPoint worldPoint24 = new WorldPoint(lIIIlIIIIl[92], lIIIlIIIIl[93], lIIIlIIIIl[0]);
                if (!lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint22) ? 1 : 0) || lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint23) ? 1 : 0)) {
                    while (lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint24) ? 1 : 0)) {
                        Movement.walkTo(worldPoint24);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (!(true ^ true)) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint24) ? 1 : 0)) {
                    String[] strArr10 = new String[lIIIlIIIIl[0]];
                    strArr10[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[94]];
                    TileObjects.getNearest(strArr10).interact(lIIIlIIIII[lIIIlIIIIl[95]]);
                }
                if (lllIIllllIIl(new WorldArea(lIIIlIIIIl[96], lIIIlIIIIl[97], lIIIlIIIIl[6], lIIIlIIIIl[12], lIIIlIIIIl[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr11 = new String[lIIIlIIIIl[0]];
                    strArr11[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[98]];
                    TileObjects.getNearest(strArr11).interact(lIIIlIIIII[lIIIlIIIIl[99]]);
                    Time.sleepTicks(lIIIlIIIIl[6]);
                    "".length();
                }
                WorldPoint worldPoint25 = new WorldPoint(lIIIlIIIIl[100], lIIIlIIIIl[101], lIIIlIIIIl[0]);
                WorldPoint worldPoint26 = new WorldPoint(lIIIlIIIIl[100], lIIIlIIIIl[101], lIIIlIIIIl[0]);
                WorldPoint worldPoint27 = new WorldPoint(lIIIlIIIIl[102], lIIIlIIIIl[101], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlIIIIl[103], lIIIlIIIIl[101], lIIIlIIIIl[0])) ? 1 : 0)) {
                    while (lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint25) ? 1 : 0)) {
                        Movement.walkTo(worldPoint25);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("  ".length() >= ((((57 + 65) - 61) + 77) ^ (((77 + 45) - 92) + 112))) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint26) ? 1 : 0)) {
                    while (lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint27) ? 1 : 0)) {
                        Movement.walkTo(worldPoint27);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ((-"   ".length()) >= 0) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint27) ? 1 : 0)) {
                    int[] iArr13 = new int[lIIIlIIIIl[0]];
                    iArr13[lIIIlIIIIl[1]] = lIIIlIIIIl[104];
                    TileItems.getNearest(iArr13).interact(lIIIlIIIII[lIIIlIIIIl[105]]);
                    Time.sleepTicks(lIIIlIIIIl[0]);
                    "".length();
                }
                int[] iArr14 = new int[lIIIlIIIIl[0]];
                iArr14[lIIIlIIIIl[1]] = lIIIlIIIIl[104];
                if (lllIIllllIIl(Inventory.contains(iArr14) ? 1 : 0)) {
                    if (lllIIllllIIl(Widgets.get(lIIIlIIIIl[106]).isEmpty() ? 1 : 0)) {
                        String[] strArr12 = new String[lIIIlIIIIl[0]];
                        strArr12[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[107]];
                        TileObjects.getNearest(strArr12).interact(lIIIlIIIII[lIIIlIIIIl[108]]);
                        Time.sleepTicks(lIIIlIIIIl[6]);
                        "".length();
                    }
                    if (lllIIllllIll(Widgets.get(lIIIlIIIIl[106]).isEmpty() ? 1 : 0)) {
                        Widgets.get(lIIIlIIIIl[106], lIIIlIIIIl[12]).interact(lIIIlIIIII[lIIIlIIIIl[109]]);
                        Time.sleepTicks(lIIIlIIIIl[4]);
                        "".length();
                    }
                }
                WorldPoint worldPoint28 = new WorldPoint(lIIIlIIIIl[110], lIIIlIIIIl[111], lIIIlIIIIl[0]);
                WorldPoint worldPoint29 = new WorldPoint(lIIIlIIIIl[112], lIIIlIIIIl[113], lIIIlIIIIl[0]);
                WorldPoint worldPoint30 = new WorldPoint(lIIIlIIIIl[114], lIIIlIIIIl[115], lIIIlIIIIl[0]);
                WorldPoint worldPoint31 = new WorldPoint(lIIIlIIIIl[114], lIIIlIIIIl[116], lIIIlIIIIl[0]);
                WorldPoint worldPoint32 = new WorldPoint(lIIIlIIIIl[117], lIIIlIIIIl[118], lIIIlIIIIl[0]);
                WorldPoint worldPoint33 = new WorldPoint(lIIIlIIIIl[119], lIIIlIIIIl[118], lIIIlIIIIl[0]);
                WorldPoint worldPoint34 = new WorldPoint(lIIIlIIIIl[42], lIIIlIIIIl[113], lIIIlIIIIl[0]);
                WorldPoint worldPoint35 = new WorldPoint(lIIIlIIIIl[120], lIIIlIIIIl[113], lIIIlIIIIl[0]);
                WorldPoint worldPoint36 = new WorldPoint(lIIIlIIIIl[44], lIIIlIIIIl[118], lIIIlIIIIl[0]);
                WorldPoint worldPoint37 = new WorldPoint(lIIIlIIIIl[121], lIIIlIIIIl[118], lIIIlIIIIl[0]);
                WorldPoint worldPoint38 = new WorldPoint(lIIIlIIIIl[122], lIIIlIIIIl[123], lIIIlIIIIl[0]);
                WorldPoint worldPoint39 = new WorldPoint(lIIIlIIIIl[122], lIIIlIIIIl[124], lIIIlIIIIl[0]);
                WorldPoint worldPoint40 = new WorldPoint(lIIIlIIIIl[125], lIIIlIIIIl[124], lIIIlIIIIl[0]);
                WorldPoint worldPoint41 = new WorldPoint(lIIIlIIIIl[125], lIIIlIIIIl[123], lIIIlIIIIl[0]);
                WorldPoint worldPoint42 = new WorldPoint(lIIIlIIIIl[120], lIIIlIIIIl[126], lIIIlIIIIl[0]);
                WorldPoint worldPoint43 = new WorldPoint(lIIIlIIIIl[42], lIIIlIIIIl[126], lIIIlIIIIl[0]);
                WorldPoint worldPoint44 = new WorldPoint(lIIIlIIIIl[127], lIIIlIIIIl[123], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint28) ? 1 : 0)) {
                    String[] strArr13 = new String[lIIIlIIIIl[0]];
                    strArr13[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[128]];
                    TileObjects.getNearest(strArr13).interact(lIIIlIIIII[lIIIlIIIIl[129]]);
                    Time.sleepTicks(lIIIlIIIIl[4]);
                    "".length();
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint29) ? 1 : 0)) {
                    Movement.walkTo(worldPoint30);
                    "".length();
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint30) ? 1 : 0)) {
                    String[] strArr14 = new String[lIIIlIIIIl[0]];
                    strArr14[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[130]];
                    TileObjects.getNearest(strArr14).interact(lIIIlIIIII[lIIIlIIIIl[2]]);
                    Time.sleepTicks(lIIIlIIIIl[4]);
                    "".length();
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint31) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint32) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint32);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (0 != 0) {
                            return;
                        }
                    }
                }
                if (!lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint32) ? 1 : 0) || !lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint34) ? 1 : 0) || !lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint36) ? 1 : 0) || !lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint38) ? 1 : 0) || !lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint40) ? 1 : 0) || !lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint42) ? 1 : 0) || lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint44) ? 1 : 0)) {
                    String[] strArr15 = new String[lIIIlIIIIl[0]];
                    strArr15[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[131]];
                    TileObjects.getNearest(strArr15).interact(lIIIlIIIII[lIIIlIIIIl[132]]);
                    Time.sleepTicks(lIIIlIIIIl[4]);
                    "".length();
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint33) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint34) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint34);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (0 != 0) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint35) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint36) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint36);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("   ".length() == 0) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint37) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint38) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint38);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("  ".length() < 0) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint39) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint40) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint40);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (" ".length() > "   ".length()) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint41) ? 1 : 0)) {
                    Movement.walkTo(worldPoint42);
                    "".length();
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint43) ? 1 : 0)) {
                    Movement.walkTo(worldPoint44);
                    "".length();
                }
                WorldPoint worldPoint45 = new WorldPoint(lIIIlIIIIl[127], lIIIlIIIIl[124], lIIIlIIIIl[0]);
                WorldPoint worldPoint46 = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[134], lIIIlIIIIl[0]);
                WorldPoint worldPoint47 = new WorldPoint(lIIIlIIIIl[110], lIIIlIIIIl[134], lIIIlIIIIl[0]);
                WorldPoint worldPoint48 = new WorldPoint(lIIIlIIIIl[135], lIIIlIIIIl[136], lIIIlIIIIl[0]);
                WorldPoint worldPoint49 = new WorldPoint(lIIIlIIIIl[137], lIIIlIIIIl[136], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint45) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint46) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint46);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ((true ^ true) & ((true ^ true) ^ true)) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint46) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint47) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint47);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (((158 ^ 191) & ((226 ^ 195) ^ (-1))) < 0) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint47) ? 1 : 0)) {
                    String[] strArr16 = new String[lIIIlIIIIl[0]];
                    strArr16[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[138]];
                    TileObjects.getNearest(strArr16).interact(lIIIlIIIII[lIIIlIIIIl[139]]);
                    Time.sleepTicks(lIIIlIIIIl[0]);
                    "".length();
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint48) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint49) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint49);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (" ".length() >= "   ".length()) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint49) ? 1 : 0)) {
                    String[] strArr17 = new String[lIIIlIIIIl[0]];
                    strArr17[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[140]];
                    TileObjects.getNearest(strArr17).interact(lIIIlIIIII[lIIIlIIIIl[141]]);
                    Time.sleepTicks(lIIIlIIIIl[0]);
                    "".length();
                }
                WorldPoint worldPoint50 = new WorldPoint(lIIIlIIIIl[142], lIIIlIIIIl[136], lIIIlIIIIl[0]);
                WorldPoint worldPoint51 = new WorldPoint(lIIIlIIIIl[143], lIIIlIIIIl[134], lIIIlIIIIl[0]);
                WorldPoint worldPoint52 = new WorldPoint(lIIIlIIIIl[144], lIIIlIIIIl[145], lIIIlIIIIl[0]);
                WorldPoint worldPoint53 = new WorldPoint(lIIIlIIIIl[144], lIIIlIIIIl[73], lIIIlIIIIl[0]);
                WorldPoint worldPoint54 = new WorldPoint(lIIIlIIIIl[144], lIIIlIIIIl[146], lIIIlIIIIl[0]);
                WorldPoint worldPoint55 = new WorldPoint(lIIIlIIIIl[147], lIIIlIIIIl[148], lIIIlIIIIl[0]);
                WorldPoint worldPoint56 = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[71], lIIIlIIIIl[0]);
                WorldPoint worldPoint57 = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[149], lIIIlIIIIl[0]);
                WorldPoint worldPoint58 = new WorldPoint(lIIIlIIIIl[150], lIIIlIIIIl[134], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint50) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint58) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint58);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (" ".length() <= 0) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint58) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint51) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint51);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ((-"   ".length()) > 0) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint51) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint52) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint52);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ((-" ".length()) >= " ".length()) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint52) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint53) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint53);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (((92 ^ 34) ^ (123 ^ 1)) <= "   ".length()) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint53) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint54) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint54);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if (" ".length() < 0) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint54) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint55) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint55);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        "".length();
                        if ("   ".length() <= ((214 ^ 156) & ((52 ^ 126) ^ (-1)))) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint55) ? 1 : 0)) {
                    String[] strArr18 = new String[lIIIlIIIIl[0]];
                    strArr18[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[151]];
                    TileItems.getNearest(strArr18).interact(lIIIlIIIII[lIIIlIIIIl[152]]);
                }
                WorldArea worldArea3 = new WorldArea(lIIIlIIIIl[150], lIIIlIIIIl[153], lIIIlIIIIl[25], lIIIlIIIIl[32], lIIIlIIIIl[0]);
                String[] strArr19 = new String[lIIIlIIIIl[0]];
                strArr19[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[154]];
                if (lllIIllllIIl(Inventory.contains(strArr19) ? 1 : 0)) {
                    String[] strArr20 = new String[lIIIlIIIIl[0]];
                    strArr20[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[155]];
                    if (lllIlIIIIIIl(Inventory.getFirst(strArr20).getQuantity(), lIIIlIIIIl[12])) {
                        String[] strArr21 = new String[lIIIlIIIIl[0]];
                        strArr21[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[156]];
                        Item first = Inventory.getFirst(strArr21);
                        int[] iArr15 = new int[lIIIlIIIIl[0]];
                        iArr15[lIIIlIIIIl[1]] = lIIIlIIIIl[157];
                        first.useOn(NPCs.getNearest(iArr15));
                    }
                    String[] strArr22 = new String[lIIIlIIIIl[0]];
                    strArr22[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[158]];
                    if (lllIlIIIIIIl(Inventory.getFirst(strArr22).getQuantity(), lIIIlIIIIl[7]) && lllIIllllIIl(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint56) ? 1 : 0)) {
                            Movement.walkTo(worldPoint56);
                            "".length();
                            Time.sleepTicks(lIIIlIIIIl[0]);
                            "".length();
                            "".length();
                            if ((-" ".length()) > 0) {
                                return;
                            }
                        }
                    }
                }
                WorldPoint worldPoint59 = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[159], lIIIlIIIIl[0]);
                WorldPoint worldPoint60 = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[160], lIIIlIIIIl[0]);
                WorldPoint worldPoint61 = new WorldPoint(lIIIlIIIIl[133], lIIIlIIIIl[149], lIIIlIIIIl[0]);
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint56) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint59) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint59);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        Movement.toggleRun();
                        "".length();
                        if ("   ".length() > ((158 ^ 178) ^ (180 ^ 156))) {
                            return;
                        }
                    }
                }
                if (lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint59) ? 1 : 0)) {
                    while (lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint57) ? 1 : 0) && lllIIllllIIl(cd.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        Movement.walkTo(worldPoint57);
                        "".length();
                        Time.sleepTicks(lIIIlIIIIl[0]);
                        "".length();
                        Movement.toggleRun();
                        "".length();
                        if ("  ".length() <= 0) {
                            return;
                        }
                    }
                }
                if (!lllIIllllIll(Players.getLocal().getWorldLocation().equals(worldPoint60) ? 1 : 0) || lllIIllllIIl(Players.getLocal().getWorldLocation().equals(worldPoint61) ? 1 : 0)) {
                    String[] strArr23 = new String[lIIIlIIIIl[0]];
                    strArr23[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[161]];
                    TileObjects.getNearest(strArr23).interact(lIIIlIIIII[lIIIlIIIIl[162]]);
                    Time.sleepTicks(lIIIlIIIIl[0]);
                    "".length();
                }
            }
            int[] iArr16 = new int[lIIIlIIIIl[0]];
            iArr16[lIIIlIIIIl[1]] = lIIIlIIIIl[3];
            if (lllIIllllIIl(Inventory.contains(iArr16) ? 1 : 0)) {
                if (lllIIllllIll(Dialog.isOpen() ? 1 : 0)) {
                    int[] iArr17 = new int[lIIIlIIIIl[0]];
                    iArr17[lIIIlIIIIl[1]] = lIIIlIIIIl[3];
                    Inventory.getFirst(iArr17).interact(lIIIlIIIII[lIIIlIIIIl[163]]);
                    Time.sleepTicks(lIIIlIIIIl[4]);
                    "".length();
                }
                if (lllIIllllIIl(Dialog.isOpen() ? 1 : 0)) {
                    if (lllIIllllIll(bX ? 1 : 0)) {
                        String[] strArr24 = new String[lIIIlIIIIl[4]];
                        strArr24[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[164]];
                        strArr24[lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[165]];
                        C0006g.a(strArr24);
                    }
                    if (lllIIllllIIl(bX ? 1 : 0) && lllIIllllIll(bY ? 1 : 0)) {
                        String[] strArr25 = new String[lIIIlIIIIl[4]];
                        strArr25[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[166]];
                        strArr25[lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[167]];
                        C0006g.a(strArr25);
                    }
                    if (lllIIllllIIl(bX ? 1 : 0) && lllIIllllIIl(bY ? 1 : 0) && lllIIllllIll(bZ ? 1 : 0)) {
                        String[] strArr26 = new String[lIIIlIIIIl[4]];
                        strArr26[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[168]];
                        strArr26[lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[169]];
                        C0006g.a(strArr26);
                    }
                    if (lllIIllllIIl(bX ? 1 : 0) && lllIIllllIIl(bY ? 1 : 0) && lllIIllllIIl(bZ ? 1 : 0) && lllIIllllIll(ca ? 1 : 0)) {
                        String[] strArr27 = new String[lIIIlIIIIl[4]];
                        strArr27[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[170]];
                        strArr27[lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[171]];
                        C0006g.a(strArr27);
                    }
                    if (lllIIllllIIl(bX ? 1 : 0) && lllIIllllIIl(bY ? 1 : 0) && lllIIllllIIl(bZ ? 1 : 0) && lllIIllllIIl(ca ? 1 : 0) && lllIIllllIll(cb ? 1 : 0)) {
                        String[] strArr28 = new String[lIIIlIIIIl[4]];
                        strArr28[lIIIlIIIIl[1]] = lIIIlIIIII[lIIIlIIIIl[172]];
                        strArr28[lIIIlIIIIl[0]] = lIIIlIIIII[lIIIlIIIIl[173]];
                        C0006g.a(strArr28);
                    }
                }
            }
            int[] iArr18 = new int[lIIIlIIIIl[0]];
            iArr18[lIIIlIIIIl[1]] = lIIIlIIIIl[13];
            if (lllIIllllIIl(Inventory.contains(iArr18) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[174]]);
                bX = lIIIlIIIIl[0];
            }
            int[] iArr19 = new int[lIIIlIIIIl[0]];
            iArr19[lIIIlIIIIl[1]] = lIIIlIIIIl[15];
            if (lllIIllllIIl(Inventory.contains(iArr19) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[175]]);
                bY = lIIIlIIIIl[0];
            }
            int[] iArr20 = new int[lIIIlIIIIl[0]];
            iArr20[lIIIlIIIIl[1]] = lIIIlIIIIl[17];
            if (lllIIllllIIl(Inventory.contains(iArr20) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[176]]);
                bZ = lIIIlIIIIl[0];
            }
            int[] iArr21 = new int[lIIIlIIIIl[0]];
            iArr21[lIIIlIIIIl[1]] = lIIIlIIIIl[19];
            if (lllIIllllIIl(Inventory.contains(iArr21) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[177]]);
                ca = lIIIlIIIIl[0];
            }
            int[] iArr22 = new int[lIIIlIIIIl[0]];
            iArr22[lIIIlIIIIl[1]] = lIIIlIIIIl[21];
            if (lllIIllllIIl(Inventory.contains(iArr22) ? 1 : 0)) {
                System.out.println(lIIIlIIIII[lIIIlIIIIl[26]]);
                cb = lIIIlIIIIl[0];
            }
            C0006g.a(bR);
        }
    }
}
