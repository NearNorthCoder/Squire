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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.s  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/s.class */
public class C0018s implements G {
    public static /* synthetic */ boolean bt;
    private static /* synthetic */ String[] lIIIlIlIII;
    private static /* synthetic */ WorldPoint cE;
    static /* synthetic */ int ck;
    private static /* synthetic */ WorldPoint cD;
    private static /* synthetic */ WorldPoint cG;
    private static /* synthetic */ WorldPoint cB;
    public static /* synthetic */ List<C0003d> bv;
    private static /* synthetic */ WorldPoint cC;
    public static /* synthetic */ boolean cv;
    private static /* synthetic */ String[] bR;
    public static /* synthetic */ boolean cu;
    public static /* synthetic */ boolean cw;
    static /* synthetic */ int cz;
    public static /* synthetic */ boolean cy;
    private static /* synthetic */ int[] lIIIlIlIIl;
    static /* synthetic */ boolean cl;
    private static /* synthetic */ WorldPoint cA;
    private static /* synthetic */ WorldPoint cF;
    public static /* synthetic */ boolean cx;

    private static boolean lllIlIllIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private static boolean ab() {
        String[] strArr = new String[lIIIlIlIIl[0]];
        strArr[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[73]];
        if (lllIlIllIllI(Inventory.getCount(strArr))) {
            int[] iArr = new int[lIIIlIlIIl[0]];
            iArr[lIIIlIlIIl[1]] = lIIIlIlIIl[7];
            if (lllIlIllIllI(Inventory.getCount(iArr)) && lllIlIllIllI(Inventory.getCount(C0005f.aV))) {
                int[] iArr2 = new int[lIIIlIlIIl[0]];
                iArr2[lIIIlIlIIl[1]] = lIIIlIlIIl[8];
                if (lllIlIllIllI(Inventory.getCount(iArr2))) {
                    ?? r0 = lIIIlIlIIl[0];
                    "".length();
                    return ((136 ^ 159) ^ (0 ^ 19)) < ((((5 + 94) - 98) + 135) ^ (((68 + 58) - (-12)) + 2)) ? ((103 ^ 31) ^ (73 ^ 116)) & (((((83 + 63) - 21) + 120) ^ (((5 + 129) - (-41)) + 1)) ^ (-" ".length())) : r0;
                }
            }
        }
        return lIIIlIlIIl[1];
    }

    private static boolean lllIlIllIllI(int i) {
        return i > 0;
    }

    private static void lllIlIlIlllI() {
        lIIIlIlIII = new String[lIIIlIlIIl[125]];
        lIIIlIlIII[lIIIlIlIIl[1]] = lllIlIlIlIll("AQcNCgsvCwdDGjIXCg0fZwcXBhU0QkMQDy4aAAsRKQlDARkkBUMXF2cfFgYLMw==", "Gnccx");
        lIIIlIlIII[lIIIlIlIIl[0]] = lllIlIlIlIll("PjYkch8fdzAzBRs=", "pWRRk");
        lIIIlIlIII[lIIIlIlIIl[5]] = lllIlIlIllII("NoLtXFLNxqY+A5mRcaZgAZg1Esrp4DjF", "ZbVtP");
        lIIIlIlIII[lIIIlIlIIl[10]] = lllIlIlIlIll("LQtBLjkfTgwmOAkHDyhrCxsEPD9aHRQ/OxYHBDxnWh0WJj8ZBgghLFoaDm8JLzcoAQw=", "znaOK");
        lIIIlIlIII[lIIIlIlIIl[6]] = lllIlIlIlIll("LQkR", "hheip");
        lIIIlIlIII[lIIIlIlIIl[13]] = lllIlIlIllII("oFruruaTu/g=", "YqiYK");
        lIIIlIlIII[lIIIlIlIIl[17]] = lllIlIlIllIl("vdTCSPdu00ISZqbQlfjP9g==", "PuVnh");
        lIIIlIlIII[lIIIlIlIIl[18]] = lllIlIlIllIl("6yUqZrp/jg7DPiKvquLIlA==", "xuoUx");
        lIIIlIlIII[lIIIlIlIIl[2]] = lllIlIlIllIl("oXW82zyLfxM=", "RtEYp");
        lIIIlIlIII[lIIIlIlIIl[24]] = lllIlIlIllII("cSx1LOTnYyg6gxRUoKc8Vd2Ab+LgxS2H", "spCXu");
        lIIIlIlIII[lIIIlIlIIl[12]] = lllIlIlIllIl("EfnaEvIq0z4=", "wYYWa");
        lIIIlIlIII[lIIIlIlIIl[25]] = lllIlIlIllIl("LcVi+UkJOyukHST1JhXNuQ==", "cYCDg");
        lIIIlIlIII[lIIIlIlIIl[15]] = lllIlIlIllII("edhJkuEGGBIhoUp9YqQgEhm4k0XK5xqr", "CzKvT");
        lIIIlIlIII[lIIIlIlIIl[26]] = lllIlIlIllII("zwsqmm1PGUI=", "RTHBj");
        lIIIlIlIII[lIIIlIlIIl[27]] = lllIlIlIlIll("NiUHMg4dPwE+TwI+DTYD", "sKdZo");
        lIIIlIlIII[lIIIlIlIIl[28]] = lllIlIlIlIll("BxUyaBomVDQhHSpUMCECLA==", "ItDHn");
        lIIIlIlIII[lIIIlIlIIl[29]] = lllIlIlIllII("noRZ1kJRK2fQ74QXLOBoaw==", "kbbVr");
        lIIIlIlIII[lIIIlIlIIl[30]] = lllIlIlIllIl("YpXW4tTSHvI=", "YDzzl");
        lIIIlIlIII[lIIIlIlIIl[31]] = lllIlIlIllIl("s3l1l3LE4lmzQnl7sDEjGw==", "TOpRn");
        lIIIlIlIII[lIIIlIlIIl[32]] = lllIlIlIlIll("IyMabjECYg08Jk02BSIg", "mBlNE");
        lIIIlIlIII[lIIIlIlIIl[33]] = lllIlIlIlIll("MScNGgALIUEQGwY=", "eFaqi");
        lIIIlIlIII[lIIIlIlIIl[34]] = lllIlIlIllII("9Wpv7kyfg7Y=", "QNqQW");
        lIIIlIlIII[lIIIlIlIIl[35]] = lllIlIlIllII("/DgWYvHkVhsc+HPxG3HknQ==", "hAMsk");
        lIIIlIlIII[lIIIlIlIIl[36]] = lllIlIlIlIll("DBshYQAtWjsuAiNaIygYJw==", "BzWAt");
        lIIIlIlIII[lIIIlIlIIl[37]] = lllIlIlIllIl("38rNNtrKoLLmwEyiyDkClQ==", "zqdVY");
        lIIIlIlIII[lIIIlIlIIl[38]] = lllIlIlIlIll("DhwiAig=", "CiLvQ");
        lIIIlIlIII[lIIIlIlIIl[39]] = lllIlIlIllII("0sNKS1LlG604u+UTTOwiGQ==", "uGdtv");
        lIIIlIlIII[lIIIlIlIIl[40]] = lllIlIlIllII("6wII1Y/6NZ5Me34RYARl9N8spJpoDdsn", "QUzKc");
        lIIIlIlIII[lIIIlIlIIl[41]] = lllIlIlIllII("OPoq/xT4p/NYuYaWG2n2vA==", "apBxJ");
        lIIIlIlIII[lIIIlIlIIl[42]] = lllIlIlIlIll("MgcpOiIeBzU=", "xbGTK");
        lIIIlIlIII[lIIIlIlIIl[43]] = lllIlIlIllII("MhEdiUYoWedMfwKCN43kfcoNbNNxfBmT", "GovNP");
        lIIIlIlIII[lIIIlIlIIl[44]] = lllIlIlIllII("rAp+nC3+mYtHELoxt7x64Tj+yAbYRWPi", "KVEio");
        lIIIlIlIII[lIIIlIlIIl[45]] = lllIlIlIllIl("m31V2a0pf2IdJEBBicposcRkbSrdN5un", "wJcGT");
        lIIIlIlIII[lIIIlIlIIl[46]] = lllIlIlIlIll("Bis4Ng4r", "NDJWm");
        lIIIlIlIII[lIIIlIlIIl[47]] = lllIlIlIllIl("vueEloYBJEMXk1CHuX4j7KI/9UQhMDIH", "RYjAJ");
        lIIIlIlIII[lIIIlIlIIl[48]] = lllIlIlIllII("PQQrV2+vhDGEO3w2sC1BSg==", "dLkIC");
        lIIIlIlIII[lIIIlIlIIl[49]] = lllIlIlIllIl("ytz+J0k+RQEzpCtIhHdBoA==", "DjILV");
        lIIIlIlIII[lIIIlIlIIl[50]] = lllIlIlIllII("o17UQspCDGk=", "dLPQt");
        lIIIlIlIII[lIIIlIlIIl[51]] = lllIlIlIllII("JDnMQLkfc6XIv6sRaEUlx+BM2lMR9W7A", "jDRpl");
        lIIIlIlIII[lIIIlIlIIl[52]] = lllIlIlIlIll("LhAYEyQRAAQSMkMGGQU=", "cikgA");
        lIIIlIlIII[lIIIlIlIIl[53]] = lllIlIlIlIll("CyA+LBc0MCItAWY2Pzo=", "FYMXr");
        lIIIlIlIII[lIIIlIlIIl[54]] = lllIlIlIllII("8o8ILYtENa2TG2sSf2/Liw==", "rdTwS");
        lIIIlIlIII[lIIIlIlIIl[55]] = lllIlIlIlIll("FgQ+egU3RTsuECoR", "XeHZq");
        lIIIlIlIII[lIIIlIlIIl[56]] = lllIlIlIlIll("PAwnCSAmCmsULCce", "HmKbI");
        lIIIlIlIII[lIIIlIlIIl[57]] = lllIlIlIllIl("limwfofKNgQ=", "Xgmnu");
        lIIIlIlIII[lIIIlIlIIl[58]] = lllIlIlIllII("uNK7potU2yG30tIDfcmVRw==", "cWjka");
        lIIIlIlIII[lIIIlIlIIl[60]] = lllIlIlIllII("75mcU+JClv9qvOT2x6RcaA==", "VJFuJ");
        lIIIlIlIII[lIIIlIlIIl[61]] = lllIlIlIlIll("IgsWCggWAEIPGA4V", "cebcy");
        lIIIlIlIII[lIIIlIlIIl[62]] = lllIlIlIllII("ZvCpaVmm/24=", "panST");
        lIIIlIlIII[lIIIlIlIIl[63]] = lllIlIlIlIll("EgE7ARM1DTkDUDIINh0VMw==", "AdWdp");
        lIIIlIlIII[lIIIlIlIIl[64]] = lllIlIlIllII("n5cznkwBsC8=", "pPHsq");
        lIIIlIlIII[lIIIlIlIIl[65]] = lllIlIlIlIll("DgIePyg/AA==", "MmpYA");
        lIIIlIlIII[lIIIlIlIIl[66]] = lllIlIlIlIll("MgASPBUGC0Y5BR4e", "snfUd");
        lIIIlIlIII[lIIIlIlIIl[67]] = lllIlIlIlIll("NAQwChAIFnIEGAsB", "fqRhy");
        lIIIlIlIII[lIIIlIlIIl[68]] = lllIlIlIlIll("KBguAT4cE3oELgQG", "ivZhO");
        lIIIlIlIII[lIIIlIlIIl[69]] = lllIlIlIlIll("JxYR", "ucsRK");
        lIIIlIlIII[lIIIlIlIIl[70]] = lllIlIlIllII("Vrq1IEAREfR+HYMVTJd1BBmlXAunMUoZ", "wymmN");
        lIIIlIlIII[lIIIlIlIIl[71]] = lllIlIlIllII("WexO5h20Jaw=", "jbfOQ");
        lIIIlIlIII[lIIIlIlIIl[72]] = lllIlIlIlIll("FQQtHCAkBg==", "VkCzI");
        lIIIlIlIII[lIIIlIlIIl[73]] = lllIlIlIlIll("Kww4BykIGw==", "miYsA");
        lIIIlIlIII[lIIIlIlIIl[78]] = lllIlIlIlIll("CwgkDhs8RCINVQMLOBkQJgA=", "HdMku");
        lIIIlIlIII[lIIIlIlIIl[79]] = lllIlIlIllIl("qcY3rWe8s7u/PsvfpkkOaQ==", "GeKBE");
        lIIIlIlIII[lIIIlIlIIl[80]] = lllIlIlIllIl("ZsOaQozh5u3iPJf+REvbwrTj5kllK+pN", "oKEse");
        lIIIlIlIII[lIIIlIlIIl[81]] = lllIlIlIllII("pINeYgvQRrzaNO9o9AlVh8JbrB68aYeiROM4bZ58D9g=", "iIQOP");
        lIIIlIlIII[lIIIlIlIIl[82]] = lllIlIlIlIll("FCI/TCBYMzkKNx1p", "xGKkS");
        lIIIlIlIII[lIIIlIlIIl[16]] = lllIlIlIlIll("DwcufgdjFig4ECZM", "CbZYt");
        lIIIlIlIII[lIIIlIlIIl[83]] = lllIlIlIllII("pLGGL3s1nSffHd1iZStfMuH1IMm76x1/Vx1OZLWPRw4=", "rWPoR");
        lIIIlIlIII[lIIIlIlIIl[84]] = lllIlIlIllII("rI0u065h/7sbzsKOQOhJwg==", "ExDZZ");
        lIIIlIlIII[lIIIlIlIIl[85]] = lllIlIlIlIll("NwAZTgRUAAQFbQ0OAk4sFg4CGm04DgEPJhEPEARy", "tawnM");
        lIIIlIlIII[lIIIlIlIIl[86]] = lllIlIlIlIll("CC8kZhVkPiIgAiFk", "DJPAf");
        lIIIlIlIII[lIIIlIlIIl[87]] = lllIlIlIllII("12f9YBk++fJj+2XrOksp7pL0Wti6AoWUXVkS99D9jxE=", "ykxTr");
        lIIIlIlIII[lIIIlIlIIl[88]] = lllIlIlIllIl("OZtsd4/hCjv9RPDfPhx4xZm47exeMJhk", "nJQdQ");
        lIIIlIlIII[lIIIlIlIIl[89]] = lllIlIlIllII("hRxAI+z4+rqpurjd4Jqx306xdh+JJQG6/Mwf+cgxYZiT69zFYdE3gQ==", "GILeD");
        lIIIlIlIII[lIIIlIlIIl[90]] = lllIlIlIllII("hs+mzyY+3i/PAc2je5NKLAl/33w7LbxVNQ1MazbohCVguQNGOps8jg==", "glPiA");
        lIIIlIlIII[lIIIlIlIIl[105]] = lllIlIlIllII("ikyCqck0fvJDidLBt/9+AtztakpK+mNvnmyHOX7BDNI=", "FUeNV");
        lIIIlIlIII[lIIIlIlIIl[106]] = lllIlIlIllIl("K46ySI2lPkQ=", "EuYvB");
        lIIIlIlIII[lIIIlIlIIl[107]] = lllIlIlIllII("WH57Tnn/dds=", "Bcsjs");
        lIIIlIlIII[lIIIlIlIIl[108]] = lllIlIlIllIl("gCS8VjfT8ntxkgHO8b5UsgoH/I6L6XL446lPecz5EaNkfftKhEJvjA==", "ejkBJ");
        lIIIlIlIII[lIIIlIlIIl[109]] = lllIlIlIllIl("ZCqpqbonVyFZA9VvazdyGgsOla9/kZDkZga1qlxvnpFRtSladejiGAn5amD9JvB6", "dIRMw");
        lIIIlIlIII[lIIIlIlIIl[110]] = lllIlIlIllII("PmeY0u2ZMuc9MoJbmnttTwRMbDo14BdMj+Cd1liFUVPA5hVL0KyUIg==", "KbHxa");
        lIIIlIlIII[lIIIlIlIIl[111]] = lllIlIlIlIll("LAAAVjtPAB0dUhYOG1YTDQ4bAlIuEw0TBxoSUQ==", "oanvr");
        lIIIlIlIII[lIIIlIlIIl[112]] = lllIlIlIllIl("qgEHpsh16hyCxXUm2KYWT+YjSE0AjMl7Sx4y5yR/5sj6h/MBeE/gLw==", "liZfj");
        lIIIlIlIII[lIIIlIlIIl[113]] = lllIlIlIlIll("KDEEaDNLMRkjWhI/H2gbCT8fPFonPxwpEQ4+DSJF", "kPjHz");
        lIIIlIlIII[lIIIlIlIIl[114]] = lllIlIlIllII("O5cESEtWR0p+L8nsu3FwKlEslmjdNVhLqpmGGxKorHZYTuNne3eNH4d5J4X35+sK", "SSMAS");
        lIIIlIlIII[lIIIlIlIIl[115]] = lllIlIlIllIl("km2NhIKcnbOozA+bc4XWvD5XDC82nwk9/6ZWyB/Q/Do=", "ghMvZ");
        lIIIlIlIII[lIIIlIlIIl[116]] = lllIlIlIllII("6nJVXJt3TbffPE26jIz0C4zyH3nTq0v+9V766DC0DQRe6f9scu7hAg==", "vioNT");
        lIIIlIlIII[lIIIlIlIIl[117]] = lllIlIlIllIl("/ZQuL4x3pqDv3eBPig+oe9Bm8yc8UBmLA6UAnaZicMg=", "lkEsM");
        lIIIlIlIII[lIIIlIlIIl[118]] = lllIlIlIllII("0iMeJUYdaGuCZLyZH0uz5dR+NI6cIFfN/9+otQZXA9PdN7HOHs7Fwg==", "ddWLy");
        lIIIlIlIII[lIIIlIlIIl[119]] = lllIlIlIlIll("HA4SDXQiFVMNPC4UFlkgJEYXFnQiCFMpOzkSUyk9OAUSCz0nDwYKaw==", "KfsyT");
        lIIIlIlIII[lIIIlIlIIl[120]] = lllIlIlIlIll("BgM1IUM4GHQhCzQZMXUXPkswOkM4BXQUETIOISAQbg==", "QkTUc");
        lIIIlIlIII[lIIIlIlIIl[121]] = lllIlIlIlIll("HREFIVQjCkQhHC8LAXUAJVkAOlQjF0QZGzwYDzAaLRNb", "JydUt");
        lIIIlIlIII[lIIIlIlIIl[122]] = lllIlIlIllII("dcXxcPO18m5IrxTyQfUgQlgNYYXlk4pFddjdn0ndC7CuRKzBxPx0jA==", "YJthF");
        lIIIlIlIII[lIIIlIlIIl[123]] = lllIlIlIllII("jUoq0PtONKY0iolN1PsjjpHtFdBsbeTQle5M21RVJDVDmotmudCbng==", "ySXBS");
        lIIIlIlIII[lIIIlIlIIl[124]] = lllIlIlIllII("Spc7VaxexolJoE5YDfZgq6jDz6+lC8rCli1HwbPcW2M=", "jGQqt");
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public String U() {
        return lIIIlIlIII[lIIIlIlIIl[78]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean S() {
        return lIIIlIlIIl[1];
    }

    public static void aI() {
        String[] strArr = new String[lIIIlIlIIl[0]];
        strArr[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[66]];
        if (lllIlIllIIII(Inventory.contains(strArr) ? 1 : 0)) {
            if (lllIlIllIlIl(Widgets.get(lIIIlIlIIl[59]))) {
                AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[67]];
                String[] strArr2 = new String[lIIIlIlIIl[0]];
                strArr2[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[68]];
                Inventory.getFirst(strArr2).interact(lIIIlIlIII[lIIIlIlIIl[69]]);
                Time.sleepTicks(lIIIlIlIIl[6]);
                "".length();
                AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[70]];
                Widget widget = Widgets.get(lIIIlIlIIl[59], lIIIlIlIIl[27]);
                if (lllIlIllIlIl(widget)) {
                    widget.interact(lIIIlIlIII[lIIIlIlIIl[71]]);
                    Time.sleepTicks(lIIIlIlIIl[0]);
                    "".length();
                }
                Widget widget2 = Widgets.get(lIIIlIlIIl[59], lIIIlIlIIl[39]);
                if (lllIlIllIlIl(widget2)) {
                    widget2.interact(lIIIlIlIII[lIIIlIlIIl[72]]);
                    Time.sleepTicks(lIIIlIlIIl[5]);
                    "".length();
                }
            }
            Time.sleepTicks(lIIIlIlIIl[0]);
            "".length();
        }
    }

    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public int T() {
        try {
            aH();
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (3 ^ 96) & ((39 ^ 68) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIlIlIIl[77];
    }

    private static void af() {
        int[] iArr = new int[lIIIlIlIIl[0]];
        iArr[lIIIlIlIIl[1]] = lIIIlIlIIl[9];
        if (lllIlIllIIlI(Bank.contains(iArr) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlIIl[9], lIIIlIlIIl[12], lIIIlIlIIl[74]));
            "".length();
        }
        int[] iArr2 = new int[lIIIlIlIIl[0]];
        iArr2[lIIIlIlIIl[1]] = lIIIlIlIIl[11];
        if (lllIlIllIIlI(Bank.contains(iArr2) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlIIl[11], lIIIlIlIIl[13], C0008i.bq));
            "".length();
        }
        if (lllIlIllIIlI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIIIlIlIII[lIIIlIlIIl[80]]);
        }) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlIIl[75], lIIIlIlIIl[13], lIIIlIlIIl[76]));
            "".length();
        }
        int[] iArr3 = new int[lIIIlIlIIl[0]];
        iArr3[lIIIlIlIIl[1]] = lIIIlIlIIl[7];
        if (lllIlIllIIlI(Bank.contains(iArr3) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlIIl[7], lIIIlIlIIl[53], lIIIlIlIIl[74]));
            "".length();
        }
        int[] iArr4 = new int[lIIIlIlIIl[0]];
        iArr4[lIIIlIlIIl[1]] = lIIIlIlIIl[8];
        if (lllIlIllIIlI(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlIlIIl[8], lIIIlIlIIl[12], lIIIlIlIIl[74]));
            "".length();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Override // f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n.G
    public boolean V() {
        if (lllIlIllIIll(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[24])) {
            String[] strArr = new String[lIIIlIlIIl[0]];
            strArr[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[79]];
            if (lllIlIllIIlI(Inventory.contains(strArr) ? 1 : 0)) {
                ?? r0 = lIIIlIlIIl[0];
                "".length();
                return " ".length() == (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
        }
        return lIIIlIlIIl[1];
    }

    private static String lllIlIlIllII(String lIlIIIlIIIIl, String lIlIIIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIIIllllI.getBytes(StandardCharsets.UTF_8)), lIIIlIlIIl[2]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIlIlIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIlIIIlI) {
            lIlIIIlIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIlIllIlII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
        if (lllIlIllIIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L290;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v495, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v497, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v499, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v501, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v503, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v608, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v635, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v113, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v99, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void aH() {
        if (lllIlIllIIII(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lllIlIllIIIl(bv.size(), lIIIlIlIIl[0])) {
                System.out.println(lIIIlIlIII[lIIIlIlIIl[1]]);
                bt = lIIIlIlIIl[1];
            }
        }
        if (lllIlIllIIlI(bt ? 1 : 0)) {
            if (lllIlIllIIll(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIlIIl[2])) {
                int[] iArr = new int[lIIIlIlIIl[0]];
                iArr[lIIIlIlIIl[1]] = lIIIlIlIIl[3];
            }
            F.cm();
            if (lllIlIllIIlI(ab() ? 1 : 0) && lllIlIllIIIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[0]) && lllIlIllIlII(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIlIIl[2])) {
                int[] iArr2 = new int[lIIIlIlIIl[0]];
                iArr2[lIIIlIlIIl[1]] = lIIIlIlIIl[3];
                if (lllIlIllIIlI(Inventory.contains(iArr2) ? 1 : 0)) {
                    BankLocation nearest = BankLocation.getNearest();
                    if (lllIlIllIlIl(nearest) && lllIlIllIIlI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[0]];
                        C0000a.a(nearest);
                    }
                    if (lllIlIllIlIl(nearest) && lllIlIllIIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        if (lllIlIllIIlI(Bank.isOpen() ? 1 : 0)) {
                            C0000a.a();
                            Time.sleepUntil(() -> {
                                return Bank.isOpen();
                            }, lIIIlIlIIl[4]);
                            "".length();
                        }
                        if (lllIlIllIIII(Bank.isOpen() ? 1 : 0)) {
                            AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[5]];
                            if (lllIlIllIllI(Inventory.getAll().size())) {
                                Bank.depositInventory();
                                Time.sleepTicks(lIIIlIlIIl[6]);
                                "".length();
                            }
                            if (lllIlIllIllI(Equipment.getAll().size())) {
                                Bank.depositEquipment();
                                Time.sleepTicks(lIIIlIlIIl[5]);
                                "".length();
                            }
                            int[] iArr3 = new int[lIIIlIlIIl[6]];
                            iArr3[lIIIlIlIIl[1]] = lIIIlIlIIl[7];
                            iArr3[lIIIlIlIIl[0]] = lIIIlIlIIl[8];
                            iArr3[lIIIlIlIIl[5]] = lIIIlIlIIl[9];
                            iArr3[lIIIlIlIIl[10]] = lIIIlIlIIl[11];
                            if (lllIlIllIIlI(C0004e.b(iArr3) ? 1 : 0)) {
                                af();
                                System.out.println(lIIIlIlIII[lIIIlIlIIl[10]]);
                                bt = lIIIlIlIIl[0];
                                return;
                            }
                            int[] iArr4 = new int[lIIIlIlIIl[6]];
                            iArr4[lIIIlIlIIl[1]] = lIIIlIlIIl[7];
                            iArr4[lIIIlIlIIl[0]] = lIIIlIlIIl[8];
                            iArr4[lIIIlIlIIl[5]] = lIIIlIlIIl[9];
                            iArr4[lIIIlIlIIl[10]] = lIIIlIlIIl[11];
                            if (lllIlIllIIII(C0004e.b(iArr4) ? 1 : 0)) {
                                C0000a.a(lIIIlIlIIl[7], lIIIlIlIIl[12]);
                                C0000a.a(lIIIlIlIIl[8], lIIIlIlIIl[12]);
                                C0000a.a(lIIIlIlIIl[9], lIIIlIlIIl[0]);
                                C0000a.a(lIIIlIlIIl[11], lIIIlIlIIl[13]);
                                C0000a.a(lIIIlIlIIl[14], lIIIlIlIIl[13]);
                            }
                        }
                    }
                }
            }
            int[] iArr5 = new int[lIIIlIlIIl[0]];
            iArr5[lIIIlIlIIl[1]] = lIIIlIlIIl[14];
            if (lllIlIllIIII(Inventory.contains(iArr5) ? 1 : 0) && lllIlIllIIll(Combat.getMissingHealth(), lIIIlIlIIl[15])) {
                int[] iArr6 = new int[lIIIlIlIIl[0]];
                iArr6[lIIIlIlIIl[1]] = lIIIlIlIIl[14];
                Inventory.getFirst(iArr6).interact(lIIIlIlIII[lIIIlIlIIl[6]]);
                Time.sleepTicks(lIIIlIlIIl[5]);
                "".length();
            }
            if (lllIlIllIIII(Inventory.contains(C0005f.aV) ? 1 : 0) && lllIlIllIIIl(Movement.getRunEnergy(), lIIIlIlIIl[16])) {
                Inventory.getFirst(C0005f.aV).interact(lIIIlIlIII[lIIIlIlIIl[13]]);
                Time.sleepTicks(lIIIlIlIIl[0]);
                "".length();
            }
            if (lllIlIllIIIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[0]) && lllIlIllIIII(ab() ? 1 : 0) && lllIlIllIlII(Vars.getBit(QuestVarbits.QUEST_X_MARKS_THE_SPOT.getId()), lIIIlIlIIl[2])) {
                int[] iArr7 = new int[lIIIlIlIIl[0]];
                iArr7[lIIIlIlIIl[1]] = lIIIlIlIIl[3];
                if (lllIlIllIIlI(Inventory.contains(iArr7) ? 1 : 0)) {
                    if (lllIlIllIIlI(Players.getLocal().getWorldLocation().equals(cA) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[17]];
                        if (lllIlIllIIII(Dialog.isOpen() ? 1 : 0) && lllIlIllIIIl(cz, lIIIlIlIIl[5])) {
                            Dialog.close();
                            cz += lIIIlIlIIl[0];
                        }
                        C0004e.a(cA);
                    }
                    if (lllIlIllIIII(Players.getLocal().getWorldLocation().equals(cA) ? 1 : 0)) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[18]];
                        C0006g.a(lIIIlIlIII[lIIIlIlIIl[2]], bR);
                    }
                }
            }
            System.out.println("5620: " + Vars.getBit(lIIIlIlIIl[19]));
            System.out.println("5621: " + Vars.getBit(lIIIlIlIIl[20]));
            System.out.println("5622: " + Vars.getBit(lIIIlIlIIl[21]));
            System.out.println("5623: " + Vars.getBit(lIIIlIlIIl[22]));
            System.out.println("5624: " + Vars.getBit(lIIIlIlIIl[23]));
            if (lllIlIllIlII(Vars.getBit(lIIIlIlIIl[19]), lIIIlIlIIl[0])) {
                cu = lIIIlIlIIl[0];
            }
            if (lllIlIllIlII(Vars.getBit(lIIIlIlIIl[20]), lIIIlIlIIl[0])) {
                cv = lIIIlIlIIl[0];
            }
            if (lllIlIllIlII(Vars.getBit(lIIIlIlIIl[21]), lIIIlIlIIl[0])) {
                cw = lIIIlIlIIl[0];
            }
            if (lllIlIllIlII(Vars.getBit(lIIIlIlIIl[22]), lIIIlIlIIl[0])) {
                cx = lIIIlIlIIl[0];
            }
            if (lllIlIllIlII(Vars.getBit(lIIIlIlIIl[23]), lIIIlIlIIl[0])) {
                cy = lIIIlIlIIl[0];
            }
            if (lllIlIllIlII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[0])) {
                ck = lIIIlIlIIl[1];
                if (lllIlIllIIlI(cu ? 1 : 0)) {
                    String[] strArr = new String[lIIIlIlIIl[0]];
                    strArr[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[24]];
                    if (lllIlIllIIII(Inventory.contains(strArr) ? 1 : 0)) {
                        String[] strArr2 = new String[lIIIlIlIIl[0]];
                        strArr2[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[12]];
                        if (lllIlIllIIII(Inventory.contains(strArr2) ? 1 : 0)) {
                            String[] strArr3 = new String[lIIIlIlIIl[0]];
                            strArr3[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[25]];
                            if (lllIlIllIIlI(Inventory.contains(strArr3) ? 1 : 0)) {
                                String[] strArr4 = new String[lIIIlIlIIl[0]];
                                strArr4[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[15]];
                                Item first = Inventory.getFirst(strArr4);
                                String[] strArr5 = new String[lIIIlIlIIl[0]];
                                strArr5[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[26]];
                                first.useOn(Inventory.getFirst(strArr5));
                                Time.sleepTicks(lIIIlIlIIl[5]);
                                "".length();
                            }
                        }
                    }
                    String[] strArr6 = new String[lIIIlIlIIl[0]];
                    strArr6[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[27]];
                    if (lllIlIllIIII(Inventory.contains(strArr6) ? 1 : 0)) {
                        if (lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cB), lIIIlIlIIl[2])) {
                            AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[28]];
                            Movement.walkTo(cB);
                            "".length();
                            Time.sleepTicks(lIIIlIlIIl[0]);
                            "".length();
                        }
                        if (lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cB), lIIIlIlIIl[2])) {
                            AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[29]];
                            C0006g.a(lIIIlIlIII[lIIIlIlIIl[30]], bR, lIIIlIlIIl[0]);
                            Time.sleepTicks(lIIIlIlIIl[0]);
                            "".length();
                            List options = Dialog.getOptions();
                            ArrayList arrayList = new ArrayList();
                            if (lllIlIllIIlI(options.isEmpty() ? 1 : 0)) {
                                int i = lIIIlIlIIl[1];
                                while (lllIlIllIIIl(i, options.size())) {
                                    arrayList.add(((Widget) options.get(i)).getText());
                                    "".length();
                                    i++;
                                    "".length();
                                    if (0 != 0) {
                                        return;
                                    }
                                }
                                boolean anyMatch = arrayList.stream().anyMatch(str -> {
                                    return str.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[90]]);
                                });
                                boolean noneMatch = arrayList.stream().noneMatch(str2 -> {
                                    return str2.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[89]]);
                                });
                                if (lllIlIllIIII(anyMatch ? 1 : 0) && lllIlIllIIII(noneMatch ? 1 : 0)) {
                                    System.out.println(lIIIlIlIII[lIIIlIlIIl[31]]);
                                }
                            }
                        }
                    }
                }
                if (lllIlIllIIlI(cv ? 1 : 0) && lllIlIllIIII(cu ? 1 : 0)) {
                    if (lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cC), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[32]];
                        Movement.walkTo(cC);
                        "".length();
                        Time.sleepTicks(lIIIlIlIIl[0]);
                        "".length();
                    }
                    if (lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cC), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[33]];
                        C0006g.a(lIIIlIlIII[lIIIlIlIIl[34]], bR, lIIIlIlIIl[0]);
                        Time.sleepTicks(lIIIlIlIIl[0]);
                        "".length();
                        List options2 = Dialog.getOptions();
                        ArrayList arrayList2 = new ArrayList();
                        if (lllIlIllIIlI(options2.isEmpty() ? 1 : 0)) {
                            int i2 = lIIIlIlIIl[1];
                            while (lllIlIllIIIl(i2, options2.size())) {
                                arrayList2.add(((Widget) options2.get(i2)).getText());
                                "".length();
                                i2++;
                                "".length();
                                if ("  ".length() == 0) {
                                    return;
                                }
                            }
                            boolean anyMatch2 = arrayList2.stream().anyMatch(str3 -> {
                                return str3.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[88]]);
                            });
                            boolean noneMatch2 = arrayList2.stream().noneMatch(str4 -> {
                                return str4.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[87]]);
                            });
                            if (lllIlIllIIII(anyMatch2 ? 1 : 0) && lllIlIllIIII(noneMatch2 ? 1 : 0)) {
                                System.out.println(lIIIlIlIII[lIIIlIlIIl[35]]);
                            }
                        }
                    }
                }
                if (lllIlIllIIlI(cw ? 1 : 0) && lllIlIllIIII(cv ? 1 : 0) && lllIlIllIIII(cu ? 1 : 0)) {
                    if (lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cD), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[36]];
                        Movement.walkTo(cD);
                        "".length();
                        Time.sleepTicks(lIIIlIlIIl[0]);
                        "".length();
                    }
                    if (lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cD), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[37]];
                        C0006g.a(lIIIlIlIII[lIIIlIlIIl[38]], bR, lIIIlIlIIl[0]);
                        Time.sleepTicks(lIIIlIlIIl[0]);
                        "".length();
                        List options3 = Dialog.getOptions();
                        ArrayList arrayList3 = new ArrayList();
                        if (lllIlIllIIlI(options3.isEmpty() ? 1 : 0)) {
                            int i3 = lIIIlIlIIl[1];
                            while (lllIlIllIIIl(i3, options3.size())) {
                                arrayList3.add(((Widget) options3.get(i3)).getText());
                                "".length();
                                i3++;
                                "".length();
                                if ((25 ^ 29) <= (-" ".length())) {
                                    return;
                                }
                            }
                            boolean anyMatch3 = arrayList3.stream().anyMatch(str5 -> {
                                return str5.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[86]]);
                            });
                            boolean noneMatch3 = arrayList3.stream().noneMatch(str6 -> {
                                return str6.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[85]]);
                            });
                            if (lllIlIllIIII(anyMatch3 ? 1 : 0) && lllIlIllIIII(noneMatch3 ? 1 : 0)) {
                                System.out.println(lIIIlIlIII[lIIIlIlIIl[39]]);
                            }
                        }
                    }
                }
                if (lllIlIllIIlI(cx ? 1 : 0) && lllIlIllIIII(cw ? 1 : 0) && lllIlIllIIII(cv ? 1 : 0) && lllIlIllIIII(cu ? 1 : 0)) {
                    if (lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cE), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[40]];
                        Movement.walkTo(cE);
                        "".length();
                        Time.sleepTicks(lIIIlIlIIl[0]);
                        "".length();
                    }
                    if (lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cE), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[41]];
                        C0006g.a(lIIIlIlIII[lIIIlIlIIl[42]], bR, lIIIlIlIIl[0]);
                        Time.sleepTicks(lIIIlIlIIl[0]);
                        "".length();
                        List options4 = Dialog.getOptions();
                        ArrayList arrayList4 = new ArrayList();
                        if (lllIlIllIIlI(options4.isEmpty() ? 1 : 0)) {
                            int i4 = lIIIlIlIIl[1];
                            while (lllIlIllIIIl(i4, options4.size())) {
                                arrayList4.add(((Widget) options4.get(i4)).getText());
                                "".length();
                                i4++;
                                "".length();
                                if ("   ".length() <= 0) {
                                    return;
                                }
                            }
                            boolean anyMatch4 = arrayList4.stream().anyMatch(str7 -> {
                                return str7.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[84]]);
                            });
                            boolean noneMatch4 = arrayList4.stream().noneMatch(str8 -> {
                                return str8.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[83]]);
                            });
                            if (lllIlIllIIII(anyMatch4 ? 1 : 0) && lllIlIllIIII(noneMatch4 ? 1 : 0)) {
                                System.out.println(lIIIlIlIII[lIIIlIlIIl[43]]);
                            }
                        }
                    }
                }
                if (lllIlIllIIlI(cy ? 1 : 0) && lllIlIllIIII(cx ? 1 : 0) && lllIlIllIIII(cw ? 1 : 0) && lllIlIllIIII(cv ? 1 : 0) && lllIlIllIIII(cu ? 1 : 0)) {
                    if (lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cF), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[44]];
                        Movement.walkTo(cF);
                        "".length();
                        Time.sleepTicks(lIIIlIlIIl[0]);
                        "".length();
                    }
                    if (lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cF), lIIIlIlIIl[18])) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[45]];
                        C0006g.a(lIIIlIlIII[lIIIlIlIIl[46]], bR, lIIIlIlIIl[0]);
                        Time.sleepTicks(lIIIlIlIIl[0]);
                        "".length();
                        List options5 = Dialog.getOptions();
                        ArrayList arrayList5 = new ArrayList();
                        if (lllIlIllIIlI(options5.isEmpty() ? 1 : 0)) {
                            int i5 = lIIIlIlIIl[1];
                            while (lllIlIllIIIl(i5, options5.size())) {
                                arrayList5.add(((Widget) options5.get(i5)).getText());
                                "".length();
                                i5++;
                                "".length();
                                if ("  ".length() >= (((84 ^ 98) & ((240 ^ 198) ^ (-1))) ^ (93 ^ 89))) {
                                    return;
                                }
                            }
                            boolean anyMatch5 = arrayList5.stream().anyMatch(str9 -> {
                                return str9.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[16]]);
                            });
                            boolean anyMatch6 = arrayList5.stream().anyMatch(str10 -> {
                                return str10.contains(lIIIlIlIII[lIIIlIlIIl[82]]);
                            });
                            boolean noneMatch5 = arrayList5.stream().noneMatch(str11 -> {
                                return str11.equalsIgnoreCase(lIIIlIlIII[lIIIlIlIIl[81]]);
                            });
                            if ((!lllIlIllIIlI(anyMatch5 ? 1 : 0) || lllIlIllIIII(anyMatch6 ? 1 : 0)) && lllIlIllIIII(noneMatch5 ? 1 : 0)) {
                                System.out.println(lIIIlIlIII[lIIIlIlIIl[47]]);
                            }
                        }
                    }
                }
            }
            if (lllIlIllIlII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[5])) {
                if (lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cA), lIIIlIlIIl[5])) {
                    AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[48]];
                    if (lllIlIllIIII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0004e.a(cA);
                }
                if (lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cA), lIIIlIlIIl[5])) {
                    AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[49]];
                    C0006g.a(lIIIlIlIII[lIIIlIlIIl[50]], bR);
                }
            }
            if (!lllIlIlllIIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[10]) || lllIlIllIlII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[17])) {
                C0006g.a(bR);
            }
            if (lllIlIllIlII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[6])) {
                if (lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cG), lIIIlIlIIl[6])) {
                    AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[51]];
                    Movement.walkTo(cG);
                    "".length();
                    Time.sleepTicks(lIIIlIlIIl[0]);
                    "".length();
                }
                if (lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cG), lIIIlIlIIl[6])) {
                    String[] strArr7 = new String[lIIIlIlIIl[0]];
                    strArr7[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[52]];
                    if (lllIlIllIIII(Inventory.contains(strArr7) ? 1 : 0)) {
                        String[] strArr8 = new String[lIIIlIlIIl[0]];
                        strArr8[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[53]];
                        Inventory.getFirst(strArr8).interact(lIIIlIlIII[lIIIlIlIIl[54]]);
                        Time.sleepTicks(lIIIlIlIIl[10]);
                        "".length();
                    }
                }
            }
            if (lllIlIllIlII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[13])) {
                if (lllIlIllIlll(Players.getLocal().getWorldLocation().distanceTo(cA), lIIIlIlIIl[5])) {
                    AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[55]];
                    C0004e.a(cA);
                }
                if (lllIlIlllIII(Players.getLocal().getWorldLocation().distanceTo(cA), lIIIlIlIIl[5])) {
                    AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[56]];
                    C0006g.a(lIIIlIlIII[lIIIlIlIIl[57]], bR);
                }
            }
            if (!lllIlIlllIIl(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[18]) || lllIlIllIlII(Vars.getBit(QuestVarbits.QUEST_CLIENT_OF_KOUREND.getId()), lIIIlIlIIl[2])) {
                if (lllIlIllIIIl(ck, lIIIlIlIIl[0])) {
                    U.mc += lIIIlIlIIl[0];
                    U.o(AccBuilderRogues.m);
                    ck += lIIIlIlIIl[0];
                    U.mc = lIIIlIlIIl[1];
                    cl = lIIIlIlIIl[1];
                }
                String[] strArr9 = new String[lIIIlIlIIl[0]];
                strArr9[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[58]];
                if (lllIlIllIIII(Inventory.contains(strArr9) ? 1 : 0)) {
                    if (lllIlIllIlIl(Widgets.get(lIIIlIlIIl[59]))) {
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[60]];
                        String[] strArr10 = new String[lIIIlIlIIl[0]];
                        strArr10[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[61]];
                        Inventory.getFirst(strArr10).interact(lIIIlIlIII[lIIIlIlIIl[62]]);
                        Time.sleepTicks(lIIIlIlIIl[6]);
                        "".length();
                        AccBuilderRogues.c = lIIIlIlIII[lIIIlIlIIl[63]];
                        Widget widget = Widgets.get(lIIIlIlIIl[59], lIIIlIlIIl[27]);
                        if (lllIlIllIlIl(widget)) {
                            widget.interact(lIIIlIlIII[lIIIlIlIIl[64]]);
                            Time.sleepTicks(lIIIlIlIIl[0]);
                            "".length();
                        }
                        Widget widget2 = Widgets.get(lIIIlIlIIl[59], lIIIlIlIIl[39]);
                        if (lllIlIllIlIl(widget2)) {
                            widget2.interact(lIIIlIlIII[lIIIlIlIIl[65]]);
                            Time.sleepTicks(lIIIlIlIIl[5]);
                            "".length();
                        }
                    }
                    Time.sleepTicks(lIIIlIlIIl[0]);
                    "".length();
                }
            }
        }
    }

    private static boolean lllIlIllIIIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIlIllIIll(int i, int i2) {
        return i >= i2;
    }

    private static boolean lllIlIllIIII(int i) {
        return i != 0;
    }

    private static String lllIlIlIllIl(String lIlIIIlIlllI, String lIlIIIlIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlIlIIl[5], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIIlIllll) {
            lIlIIIlIllll.printStackTrace();
            return null;
        }
    }

    private static String lllIlIlIlIll(String lIlIIIIlIIIl, String lIlIIIIlIIII) {
        String str = new String(Base64.getDecoder().decode(lIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlIIIIIllll = new StringBuilder();
        char[] lIlIIIIIlllI = lIlIIIIlIIII.toCharArray();
        int lIlIIIIIllIl = lIIIlIlIIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIIlIlIIl[1];
        while (lllIlIllIIIl(i, length)) {
            lIlIIIIIllll.append((char) (charArray[i] ^ lIlIIIIIlllI[lIlIIIIIllIl % lIlIIIIIlllI.length]));
            "".length();
            lIlIIIIIllIl++;
            i++;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lIlIIIIIllll);
    }

    private static boolean lllIlIllIlll(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIlIlllIIl(int i, int i2) {
        return i != i2;
    }

    private static void lllIlIlIllll() {
        lIIIlIlIIl = new int[126];
        lIIIlIlIIl[0] = " ".length();
        lIIIlIlIIl[1] = (43 ^ 114) & ((43 ^ 114) ^ (-1));
        lIIIlIlIIl[2] = 63 ^ 55;
        lIIIlIlIIl[3] = (-((-18950) & 27295)) & (-1351) & 32767;
        lIIIlIlIIl[4] = (-((-1681) & 3827)) & (-21) & 7166;
        lIIIlIlIIl[5] = "  ".length();
        lIIIlIlIIl[6] = 133 ^ 129;
        lIIIlIlIIl[7] = (-16393) & 24399;
        lIIIlIlIIl[8] = (-16517) & 24525;
        lIIIlIlIIl[9] = (-28678) & 28991;
        lIIIlIlIIl[10] = "   ".length();
        lIIIlIlIIl[11] = (-((-9401) & 11453)) & (-17411) & 32087;
        lIIIlIlIIl[12] = (25 ^ 33) ^ (150 ^ 164);
        lIIIlIlIIl[13] = (43 ^ 102) ^ (81 ^ 25);
        lIIIlIlIIl[14] = (-29697) & 30075;
        lIIIlIlIIl[15] = 141 ^ 129;
        lIIIlIlIIl[16] = 204 ^ 141;
        lIIIlIlIIl[17] = (214 ^ 177) ^ (77 ^ 44);
        lIIIlIlIIl[18] = 57 ^ 62;
        lIIIlIlIIl[19] = (-10241) & 15860;
        lIIIlIlIIl[20] = (-((-7249) & 24155)) & (-10241) & 32767;
        lIIIlIlIIl[21] = (-((-1509) & 11758)) & (-1) & 15871;
        lIIIlIlIIl[22] = (-((-21811) & 32563)) & (-16393) & 32767;
        lIIIlIlIIl[23] = (-8195) & 13818;
        lIIIlIlIIl[24] = (11 ^ 105) ^ (38 ^ 77);
        lIIIlIlIIl[25] = (16 ^ 57) ^ (57 ^ 27);
        lIIIlIlIIl[26] = 171 ^ 166;
        lIIIlIlIIl[27] = 67 ^ 77;
        lIIIlIlIIl[28] = (222 ^ 129) ^ (253 ^ 173);
        lIIIlIlIIl[29] = 129 ^ 145;
        lIIIlIlIIl[30] = 60 ^ 45;
        lIIIlIlIIl[31] = 119 ^ 101;
        lIIIlIlIIl[32] = 134 ^ 149;
        lIIIlIlIIl[33] = 80 ^ 68;
        lIIIlIlIIl[34] = 36 ^ 49;
        lIIIlIlIIl[35] = (((91 + 62) - 126) + 149) ^ (((87 + 126) - 178) + 131);
        lIIIlIlIIl[36] = 51 ^ 36;
        lIIIlIlIIl[37] = (((97 + 112) - 35) + 47) ^ (((1 + 18) - (-51)) + 127);
        lIIIlIlIIl[38] = (10 ^ 20) ^ (40 ^ 47);
        lIIIlIlIIl[39] = 111 ^ 117;
        lIIIlIlIIl[40] = 21 ^ 14;
        lIIIlIlIIl[41] = (((35 + 28) - (-46)) + 61) ^ (((38 + 132) - 108) + 120);
        lIIIlIlIIl[42] = (170 ^ 156) ^ (80 ^ 123);
        lIIIlIlIIl[43] = 181 ^ 171;
        lIIIlIlIIl[44] = 174 ^ 177;
        lIIIlIlIIl[45] = 18 ^ 50;
        lIIIlIlIIl[46] = (78 ^ 13) ^ (9 ^ 107);
        lIIIlIlIIl[47] = (87 ^ 69) ^ (66 ^ 114);
        lIIIlIlIIl[48] = (((149 + 149) - 187) + 53) ^ (((99 + 104) - 119) + 51);
        lIIIlIlIIl[49] = (((52 + 75) - (-27)) + 77) ^ (((82 + 6) - (-59)) + 48);
        lIIIlIlIIl[50] = 149 ^ 176;
        lIIIlIlIIl[51] = (((86 + 30) - (-5)) + 47) ^ (((123 + 105) - 208) + 122);
        lIIIlIlIIl[52] = 2 ^ 37;
        lIIIlIlIIl[53] = (105 ^ 29) ^ (94 ^ 2);
        lIIIlIlIIl[54] = (((39 + 44) - (-25)) + 43) ^ (((98 + 180) - 264) + 176);
        lIIIlIlIIl[55] = 180 ^ 158;
        lIIIlIlIIl[56] = (72 ^ 16) ^ (122 ^ 9);
        lIIIlIlIIl[57] = 19 ^ 63;
        lIIIlIlIIl[58] = (241 ^ 130) ^ (75 ^ 21);
        lIIIlIlIIl[59] = ((181 + 156) - 168) + 71;
        lIIIlIlIIl[60] = (144 ^ 155) ^ (148 ^ 177);
        lIIIlIlIIl[61] = 78 ^ 97;
        lIIIlIlIIl[62] = 42 ^ 26;
        lIIIlIlIIl[63] = (((45 + 166) - 105) + 63) ^ (((72 + 87) - 56) + 49);
        lIIIlIlIIl[64] = 74 ^ 120;
        lIIIlIlIIl[65] = 48 ^ 3;
        lIIIlIlIIl[66] = (166 ^ 195) ^ (207 ^ 158);
        lIIIlIlIIl[67] = (186 ^ 182) ^ (79 ^ 118);
        lIIIlIlIIl[68] = 58 ^ 12;
        lIIIlIlIIl[69] = (((25 + 109) - 9) + 44) ^ (((125 + 42) - 146) + 137);
        lIIIlIlIIl[70] = (3 ^ 53) ^ (142 ^ 128);
        lIIIlIlIIl[71] = (((11 + 34) - (-84)) + 51) ^ (((90 + 81) - 130) + 100);
        lIIIlIlIIl[72] = (155 ^ 194) ^ (219 ^ 184);
        lIIIlIlIIl[73] = (97 ^ 39) ^ (185 ^ 196);
        lIIIlIlIIl[74] = (-31796) & 32695;
        lIIIlIlIIl[75] = (-((-3076) & 23607)) & (-257) & 32767;
        lIIIlIlIIl[76] = (-((-8842) & 13021)) & (-2053) & 31231;
        lIIIlIlIIl[77] = (31 ^ 65) ^ (25 ^ 35);
        lIIIlIlIIl[78] = (221 ^ 194) ^ (146 ^ 177);
        lIIIlIlIIl[79] = 164 ^ 153;
        lIIIlIlIIl[80] = (85 ^ 103) ^ (24 ^ 20);
        lIIIlIlIIl[81] = 104 ^ 87;
        lIIIlIlIIl[82] = 0 ^ 64;
        lIIIlIlIIl[83] = (((44 + 43) - 39) + 79) ^ (44 ^ 17);
        lIIIlIlIIl[84] = (((123 + 23) - 132) + 190) ^ (((141 + 77) - 85) + 10);
        lIIIlIlIIl[85] = (174 ^ 141) ^ (27 ^ 124);
        lIIIlIlIIl[86] = (208 ^ 145) ^ (35 ^ 39);
        lIIIlIlIIl[87] = 131 ^ 197;
        lIIIlIlIIl[88] = 86 ^ 17;
        lIIIlIlIIl[89] = 45 ^ 101;
        lIIIlIlIIl[90] = 226 ^ 171;
        lIIIlIlIIl[91] = (-30811) & 32635;
        lIIIlIlIIl[92] = (-((-2) & 4503)) & (-24577) & 32767;
        lIIIlIlIIl[93] = (-6337) & 8143;
        lIIIlIlIIl[94] = (-(97 ^ 112)) & (-20482) & 24223;
        lIIIlIlIIl[95] = (-((-8327) & 29127)) & (-1) & 22519;
        lIIIlIlIIl[96] = (-((-2711) & 15255)) & (-16385) & 32653;
        lIIIlIlIIl[97] = (-2305) & 3855;
        lIIIlIlIIl[98] = (-((-259) & 8539)) & (-20481) & 32509;
        lIIIlIlIIl[99] = (-20486) & 22005;
        lIIIlIlIIl[100] = (-((-7237) & 15861)) & (-4169) & 16383;
        lIIIlIlIIl[101] = (-20737) & 22510;
        lIIIlIlIIl[102] = (-((-7717) & 16309)) & (-20586) & 32765;
        lIIIlIlIIl[103] = (-((-1031) & 32015)) & (-6) & 32701;
        lIIIlIlIIl[104] = (-24721) & 28603;
        lIIIlIlIIl[105] = (((153 + 225) - 215) + 73) ^ (((27 + 111) - 2) + 30);
        lIIIlIlIIl[106] = (128 ^ 168) ^ (167 ^ 196);
        lIIIlIlIIl[107] = 213 ^ 153;
        lIIIlIlIIl[108] = (122 ^ 111) ^ (227 ^ 187);
        lIIIlIlIIl[109] = (215 ^ 194) ^ (21 ^ 78);
        lIIIlIlIIl[110] = (53 ^ 31) ^ (34 ^ 71);
        lIIIlIlIIl[111] = (((115 + 113) - 36) + 9) ^ (((76 + 86) - 87) + 78);
        lIIIlIlIIl[112] = 33 ^ 112;
        lIIIlIlIIl[113] = (((53 + 111) - (-3)) + 54) ^ (((1 + 134) - 119) + 127);
        lIIIlIlIIl[114] = 251 ^ 168;
        lIIIlIlIIl[115] = 198 ^ 146;
        lIIIlIlIIl[116] = 26 ^ 79;
        lIIIlIlIIl[117] = 57 ^ 111;
        lIIIlIlIIl[118] = (((178 + 191) - 352) + 199) ^ (((111 + 110) - 134) + 56);
        lIIIlIlIIl[119] = (((33 + 26) - (-20)) + 131) ^ (((117 + 44) - 24) + 1);
        lIIIlIlIIl[120] = 197 ^ 156;
        lIIIlIlIIl[121] = (((23 + 20) - (-67)) + 49) ^ (((113 + 9) - 85) + 160);
        lIIIlIlIIl[122] = 22 ^ 77;
        lIIIlIlIIl[123] = (((30 + 105) - (-11)) + 89) ^ (((66 + 106) - 168) + 179);
        lIIIlIlIIl[124] = (((48 + 92) - 95) + 180) ^ (((43 + 184) - 52) + 13);
        lIIIlIlIIl[125] = 207 ^ 145;
    }

    private static boolean lllIlIlllIII(int i, int i2) {
        return i <= i2;
    }

    static {
        lllIlIlIllll();
        lllIlIlIlllI();
        bv = new ArrayList();
        cz = lIIIlIlIIl[1];
        cA = new WorldPoint(lIIIlIlIIl[91], lIIIlIlIIl[92], lIIIlIlIIl[1]);
        cB = new WorldPoint(lIIIlIlIIl[93], lIIIlIlIIl[94], lIIIlIlIIl[1]);
        cC = new WorldPoint(lIIIlIlIIl[95], lIIIlIlIIl[96], lIIIlIlIIl[1]);
        cD = new WorldPoint(lIIIlIlIIl[97], lIIIlIlIIl[98], lIIIlIlIIl[1]);
        cE = new WorldPoint(lIIIlIlIIl[99], lIIIlIlIIl[100], lIIIlIlIIl[1]);
        cF = new WorldPoint(lIIIlIlIIl[101], lIIIlIlIIl[102], lIIIlIlIIl[1]);
        cG = new WorldPoint(lIIIlIlIIl[103], lIIIlIlIIl[104], lIIIlIlIIl[1]);
        String[] strArr = new String[lIIIlIlIIl[33]];
        strArr[lIIIlIlIIl[1]] = lIIIlIlIII[lIIIlIlIIl[105]];
        strArr[lIIIlIlIIl[0]] = lIIIlIlIII[lIIIlIlIIl[106]];
        strArr[lIIIlIlIIl[5]] = lIIIlIlIII[lIIIlIlIIl[107]];
        strArr[lIIIlIlIIl[10]] = lIIIlIlIII[lIIIlIlIIl[108]];
        strArr[lIIIlIlIIl[6]] = lIIIlIlIII[lIIIlIlIIl[109]];
        strArr[lIIIlIlIIl[13]] = lIIIlIlIII[lIIIlIlIIl[110]];
        strArr[lIIIlIlIIl[17]] = lIIIlIlIII[lIIIlIlIIl[111]];
        strArr[lIIIlIlIIl[18]] = lIIIlIlIII[lIIIlIlIIl[112]];
        strArr[lIIIlIlIIl[2]] = lIIIlIlIII[lIIIlIlIIl[113]];
        strArr[lIIIlIlIIl[24]] = lIIIlIlIII[lIIIlIlIIl[114]];
        strArr[lIIIlIlIIl[12]] = lIIIlIlIII[lIIIlIlIIl[115]];
        strArr[lIIIlIlIIl[25]] = lIIIlIlIII[lIIIlIlIIl[116]];
        strArr[lIIIlIlIIl[15]] = lIIIlIlIII[lIIIlIlIIl[117]];
        strArr[lIIIlIlIIl[26]] = lIIIlIlIII[lIIIlIlIIl[118]];
        strArr[lIIIlIlIIl[27]] = lIIIlIlIII[lIIIlIlIIl[119]];
        strArr[lIIIlIlIIl[28]] = lIIIlIlIII[lIIIlIlIIl[120]];
        strArr[lIIIlIlIIl[29]] = lIIIlIlIII[lIIIlIlIIl[121]];
        strArr[lIIIlIlIIl[30]] = lIIIlIlIII[lIIIlIlIIl[122]];
        strArr[lIIIlIlIIl[31]] = lIIIlIlIII[lIIIlIlIIl[123]];
        strArr[lIIIlIlIIl[32]] = lIIIlIlIII[lIIIlIlIIl[124]];
        bR = strArr;
    }

    private static boolean lllIlIllIIlI(int i) {
        return i == 0;
    }
}
