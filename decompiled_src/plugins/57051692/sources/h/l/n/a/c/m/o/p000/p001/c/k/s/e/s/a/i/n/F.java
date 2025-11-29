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
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.F  reason: invalid package */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/F.class */
public class F implements K {
    public static /* synthetic */ WorldPoint cV;
    public static /* synthetic */ WorldPoint iH;
    public static /* synthetic */ boolean bn;
    static /* synthetic */ WorldArea iL;
    static /* synthetic */ int dc;
    public static /* synthetic */ WorldPoint iI;
    public static /* synthetic */ WorldPoint iJ;
    static /* synthetic */ String[] cy;
    static /* synthetic */ int iK;
    static /* synthetic */ boolean dd;
    public static /* synthetic */ List<C0003d> bp;
    private static /* synthetic */ String[] lIlIIlIlII;
    public static /* synthetic */ WorldPoint iG;
    private static /* synthetic */ int[] lIlIIlIllI;

    private static boolean lIIIllIIlIIll(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean al() {
        int[] iArr = new int[lIlIIlIllI[4]];
        iArr[lIlIIlIllI[1]] = lIlIIlIllI[5];
        iArr[lIlIIlIllI[0]] = lIlIIlIllI[6];
        iArr[lIlIIlIllI[3]] = lIlIIlIllI[7];
        iArr[lIlIIlIllI[8]] = lIlIIlIllI[9];
        int i = lIlIIlIllI[1];
        while (lIIIllIIIllIl(i, iArr.length)) {
            int[] iArr2 = new int[lIlIIlIllI[0]];
            iArr2[lIlIIlIllI[1]] = iArr[i];
            if (lIIIllIIIlllI(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIlIIlIllI[1];
            }
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlIIlIllI[0];
    }

    private static void lIIIllIIIlIIl() {
        lIlIIlIlII = new String[lIlIIlIllI[197]];
        lIlIIlIlII[lIlIIlIllI[1]] = lIIIllIIIIIlI("4uA2IlP8Je/9wOqQxPHajB74BzDG6ILvpdoaG+3xBRr6ZHnl0IA+TIXnxitzdWMG", "xksQJ");
        lIlIIlIlII[lIlIIlIllI[0]] = lIIIllIIIIIll("trZnvKkNkW1XSKQTwxLGpQ==", "zKdNw");
        lIlIIlIlII[lIlIIlIllI[3]] = lIIIllIIIIlII("LjUiMBYPOit0GAc6Jz0UAQ==", "fTLTz");
        lIlIIlIlII[lIlIIlIllI[8]] = lIIIllIIIIlII("ICBsGAISZSEQAwQsIh5QBjApCgRXNjkJABssKQpcVzY7EAQULSUXF1cxI1kyIhwFNzc=", "wELyp");
        lIlIIlIlII[lIlIIlIllI[4]] = lIIIllIIIIIll("BxRkbl/j3Vs=", "ESqKy");
        lIlIIlIlII[lIlIIlIllI[14]] = lIIIllIIIIIlI("EfxxwBL36CA=", "YbYVk");
        lIlIIlIlII[lIlIIlIllI[17]] = lIIIllIIIIIlI("ucTVe+SQRXyYt4J6X4ZF8w==", "PEvLh");
        lIlIIlIlII[lIlIIlIllI[18]] = lIIIllIIIIlII("NgAPICFFBRs3JhE=", "etnRU");
        lIlIIlIlII[lIlIIlIllI[16]] = lIIIllIIIIIlI("XT1H7UP+H6OfjwJLU3DfxQ==", "MRHOr");
        lIlIIlIlII[lIlIIlIllI[20]] = lIIIllIIIIIlI("rYcf+Pzcvp8=", "UqoZd");
        lIlIIlIlII[lIlIIlIllI[10]] = lIIIllIIIIIll("UPfXPkUWMpYG2jsxOCizdrn/niE9s/Cj", "UjmEc");
        lIlIIlIlII[lIlIIlIllI[23]] = lIIIllIIIIIlI("0QxtWQ9NyjURRN1CbtPXBAAoO0cbeiee", "GyZXH");
        lIlIIlIlII[lIlIIlIllI[24]] = lIIIllIIIIIlI("7Dcmi2+hNeSD3no+RzQ03g==", "WIbVU");
        lIlIIlIlII[lIlIIlIllI[25]] = lIIIllIIIIlII("EwAhNw==", "GaJRA");
        lIlIIlIlII[lIlIIlIllI[26]] = lIIIllIIIIIlI("o4Cva99SS1EPjtu1f5iLC/V0qDr7L9qY", "IyyTM");
        lIlIIlIlII[lIlIIlIllI[27]] = lIIIllIIIIIlI("Rhq1Bcq47qA=", "TtHlv");
        lIlIIlIlII[lIlIIlIllI[28]] = lIIIllIIIIIll("wVl2R1d0RxKZctJc8Amx3g==", "yexoC");
        lIlIIlIlII[lIlIIlIllI[29]] = lIIIllIIIIlII("BQMlBQYvDQ==", "AjBbo");
        lIlIIlIlII[lIlIIlIllI[30]] = lIIIllIIIIIlI("yBSxRb6/HQ6PrLVY1TgDog==", "SeWqS");
        lIlIIlIlII[lIlIIlIllI[31]] = lIIIllIIIIlII("ISovGCUa", "rONjF");
        lIlIIlIlII[lIlIIlIllI[32]] = lIIIllIIIIlII("HD84", "WZAQj");
        lIlIIlIlII[lIlIIlIllI[33]] = lIIIllIIIIIlI("vzpXLSlcPDtVaSMtHfcptg==", "djukD");
        lIlIIlIlII[lIlIIlIllI[34]] = lIIIllIIIIlII("MRsXBTgWHQw=", "wtbkL");
        lIlIIlIlII[lIlIIlIllI[35]] = lIIIllIIIIIlI("J13/9dJ/IlQ=", "MdvWQ");
        lIlIIlIlII[lIlIIlIllI[36]] = lIIIllIIIIIll("2kjSkiMfpU0mO9+5fhRPHQ==", "xihit");
        lIlIIlIlII[lIlIIlIllI[37]] = lIIIllIIIIIlI("A5OjA2158gZQlXtFGFy1WQ==", "wKKqH");
        lIlIIlIlII[lIlIIlIllI[38]] = lIIIllIIIIIll("3x7sAmwbg6wiw+Dm/k/hBA==", "oWEeQ");
        lIlIIlIlII[lIlIIlIllI[39]] = lIIIllIIIIIlI("69ExRyHlO9s=", "AXcqj");
        lIlIIlIlII[lIlIIlIllI[40]] = lIIIllIIIIlII("LA4M", "gkupT");
        lIlIIlIlII[lIlIIlIllI[41]] = lIIIllIIIIIlI("oR1yf3ObHkgQ9K/sIX/4/g==", "EEvKA");
        lIlIIlIlII[lIlIIlIllI[42]] = lIIIllIIIIIlI("AFw/woTFaJND7CBl4wlTEQ==", "zGfPK");
        lIlIIlIlII[lIlIIlIllI[46]] = lIIIllIIIIIlI("4oP8SW78v+XQJ7Y80nUPbg==", "FQFbc");
        lIlIIlIlII[lIlIIlIllI[47]] = lIIIllIIIIlII("NzwkOw==", "sSKIV");
        lIlIIlIlII[lIlIIlIllI[48]] = lIIIllIIIIlII("KAEqPA==", "gqORc");
        lIlIIlIlII[lIlIIlIllI[49]] = lIIIllIIIIIll("WZmXEzO33Nu2EMng59JUWQ==", "vGCiM");
        lIlIIlIlII[lIlIIlIllI[50]] = lIIIllIIIIIll("ZZ84+htQcSNXgbptRr5Kyg==", "QgSPt");
        lIlIIlIlII[lIlIIlIllI[51]] = lIIIllIIIIIlI("c5EwzGcfzQ8=", "dLokb");
        lIlIIlIlII[lIlIIlIllI[52]] = lIIIllIIIIIll("5sofbTKWaPWTXN06aluGnQ==", "HPpSq");
        lIlIIlIlII[lIlIIlIllI[53]] = lIIIllIIIIIlI("vn9ZEueaCVo=", "yQsMX");
        lIlIIlIlII[lIlIIlIllI[56]] = lIIIllIIIIlII("LjsWGA==", "jTyjd");
        lIlIIlIlII[lIlIIlIllI[57]] = lIIIllIIIIIlI("9AX8G+qsz7w=", "HpwnG");
        lIlIIlIlII[lIlIIlIllI[58]] = lIIIllIIIIIll("z4Gfbgzz8cMQNKLOHHsCfTPxHPSCr+zB", "SZNUt");
        lIlIIlIlII[lIlIIlIllI[59]] = lIIIllIIIIIll("ATbWLqORgpQ=", "IefNN");
        lIlIIlIlII[lIlIIlIllI[60]] = lIIIllIIIIlII("LikmAwFAISAZDQ==", "mEOnc");
        lIlIIlIlII[lIlIIlIllI[76]] = lIIIllIIIIIlI("4K11Oi2/5BraV3Z3HLFLUw==", "wOLoy");
        lIlIIlIlII[lIlIIlIllI[77]] = lIIIllIIIIIlI("Da93qp7F/bFKkpteLh8ShQ==", "qRbqE");
        lIlIIlIlII[lIlIIlIllI[78]] = lIIIllIIIIIll("J5N7qDbfTwM=", "eiLjr");
        lIlIIlIlII[lIlIIlIllI[79]] = lIIIllIIIIIlI("MNV9nW9ZFoQ=", "CyCKt");
        lIlIIlIlII[lIlIIlIllI[81]] = lIIIllIIIIlII("PiUdWQ4fZAk=", "pDkyz");
        lIlIIlIlII[lIlIIlIllI[82]] = lIIIllIIIIIll("jVPn8W7CX3Ujd0dNm7SK0w==", "tDrVX");
        lIlIIlIlII[lIlIIlIllI[15]] = lIIIllIIIIIll("fTq8EilqCkg=", "xQVhO");
        lIlIIlIlII[lIlIIlIllI[83]] = lIIIllIIIIIlI("W8K1Emxkr24=", "FeorY");
        lIlIIlIlII[lIlIIlIllI[85]] = lIIIllIIIIlII("ADk7cgYheCk=", "NXMRr");
        lIlIIlIlII[lIlIIlIllI[86]] = lIIIllIIIIIlI("uv2gAfFFbJA=", "pffFx");
        lIlIIlIlII[lIlIIlIllI[87]] = lIIIllIIIIIll("YGevpCq4NoY=", "LvBKZ");
        lIlIIlIlII[lIlIIlIllI[88]] = lIIIllIIIIlII("NCYaBU8INgAMHQ==", "dSvio");
        lIlIIlIlII[lIlIIlIllI[89]] = lIIIllIIIIIlI("IQPFaZ6dEHo=", "PIMrd");
        lIlIIlIlII[lIlIIlIllI[90]] = lIIIllIIIIIlI("+F6QTcoYsJ4=", "jSCYh");
        lIlIIlIlII[lIlIIlIllI[92]] = lIIIllIIIIIlI("Jqikl78Vs7Mv0x6WwKbTOA==", "heIFd");
        lIlIIlIlII[lIlIIlIllI[93]] = lIIIllIIIIIlI("v+sEV9vQBvY=", "EVIlK");
        lIlIIlIlII[lIlIIlIllI[94]] = lIIIllIIIIIll("f85mXfy7zHw=", "ocMkt");
        lIlIIlIlII[lIlIIlIllI[95]] = lIIIllIIIIIll("jA0cRQYLySmgt2J/mn6ViQ==", "LlgLH");
        lIlIIlIlII[lIlIIlIllI[96]] = lIIIllIIIIIll("ixxodTJRQTCwop8D5ggi2w==", "WwPPl");
        lIlIIlIlII[lIlIIlIllI[97]] = lIIIllIIIIlII("IiM0PD5OBA==", "nFBYL");
        lIlIIlIlII[lIlIIlIllI[98]] = lIIIllIIIIIll("JE611DxcO0Q=", "LHrqw");
        lIlIIlIlII[lIlIIlIllI[99]] = lIIIllIIIIIll("2ffaTX5JjnmsAYtlyeQOWw==", "MYmKY");
        lIlIIlIlII[lIlIIlIllI[100]] = lIIIllIIIIIlI("UK9Z3ytlZKZdOlaUXQu/fg==", "zrJRU");
        lIlIIlIlII[lIlIIlIllI[101]] = lIIIllIIIIlII("IzMgKhpPFw==", "oVVOh");
        lIlIIlIlII[lIlIIlIllI[102]] = lIIIllIIIIlII("FzIJHg==", "GGerr");
        lIlIIlIlII[lIlIIlIllI[105]] = lIIIllIIIIlII("LjUiLFgXNXQtFwwo", "cZTIx");
        lIlIIlIlII[lIlIIlIllI[106]] = lIIIllIIIIlII("PhYbGQ==", "zytkV");
        lIlIIlIlII[lIlIIlIllI[107]] = lIIIllIIIIlII("GDEwDw==", "WAUaB");
        lIlIIlIlII[lIlIIlIllI[110]] = lIIIllIIIIIlI("HiKn1gqbub1ZNdlHI5fOeQ==", "OoeOL");
        lIlIIlIlII[lIlIIlIllI[111]] = lIIIllIIIIlII("MjoONA==", "vUaFy");
        lIlIIlIlII[lIlIIlIllI[112]] = lIIIllIIIIIll("1uIq5xOj/50=", "KRADb");
        lIlIIlIlII[lIlIIlIllI[114]] = lIIIllIIIIIll("J4tOWVDnYmR3A/5uR2bieA==", "LQhda");
        lIlIIlIlII[lIlIIlIllI[115]] = lIIIllIIIIIll("eXyIAlUxRJU=", "OuQUw");
        lIlIIlIlII[lIlIIlIllI[116]] = lIIIllIIIIIll("Mu9S1vrBOCg=", "cwbRb");
        lIlIIlIlII[lIlIIlIllI[117]] = lIIIllIIIIIlI("gYzCcsbIBzNIqQpsKGQNbg==", "TZNaX");
        lIlIIlIlII[lIlIIlIllI[118]] = lIIIllIIIIIll("3Sdja8i/4V/B8mOsO/TUeg==", "XDOrO");
        lIlIIlIlII[lIlIIlIllI[119]] = lIIIllIIIIIlI("ZSiC7Ryh18o=", "dQUYU");
        lIlIIlIlII[lIlIIlIllI[120]] = lIIIllIIIIlII("FxIIJw==", "GgdKU");
        lIlIIlIlII[lIlIIlIllI[122]] = lIIIllIIIIlII("ByI3ejAmYyc=", "ICAZD");
        lIlIIlIlII[lIlIIlIllI[123]] = lIIIllIIIIIll("0BSb8RIYepkfilT64E6hlg==", "jpFfZ");
        lIlIIlIlII[lIlIIlIllI[124]] = lIIIllIIIIIlI("h7MdJU4JEHY=", "jHUPg");
        lIlIIlIlII[lIlIIlIllI[125]] = lIIIllIIIIlII("OAwrLw==", "hyGCm");
        lIlIIlIlII[lIlIIlIllI[128]] = lIIIllIIIIlII("JgwiHVkfDHQcFgQR", "kcTxy");
        lIlIIlIlII[lIlIIlIllI[129]] = lIIIllIIIIIlI("cnGpx5w2NrE=", "FZHQE");
        lIlIIlIlII[lIlIIlIllI[130]] = lIIIllIIIIlII("ISkfLw==", "nYzAo");
        lIlIIlIlII[lIlIIlIllI[132]] = lIIIllIIIIlII("BQMSKW08A0QoIice", "HldLM");
        lIlIIlIlII[lIlIIlIllI[133]] = lIIIllIIIIIlI("SK4IGKtbKn8=", "KXgYr");
        lIlIIlIlII[lIlIIlIllI[134]] = lIIIllIIIIIll("6ZpY3o8XpNw=", "xVojn");
        lIlIIlIlII[lIlIIlIllI[135]] = lIIIllIIIIlII("NhMcJHAKAwYtIg==", "ffpHP");
        lIlIIlIlII[lIlIIlIllI[136]] = lIIIllIIIIIlI("8T5ZlgUOd+w=", "ZUtGn");
        lIlIIlIlII[lIlIIlIllI[137]] = lIIIllIIIIlII("Oi0UNQ==", "jXxYC");
        lIlIIlIlII[lIlIIlIllI[139]] = lIIIllIIIIIll("qarMVOVXN13BZrEbvawJvA==", "SXFck");
        lIlIIlIlII[lIlIIlIllI[140]] = lIIIllIIIIlII("DzgYNA==", "KWwFk");
        lIlIIlIlII[lIlIIlIllI[141]] = lIIIllIIIIIll("FjGTXlCMowI=", "AjCHC");
        lIlIIlIlII[lIlIIlIllI[142]] = lIIIllIIIIIll("ov5GGzRiQvjRwHSp44uk9g==", "xigta");
        lIlIIlIlII[lIlIIlIllI[143]] = lIIIllIIIIIll("hoogi7yrX5M=", "bDZTN");
        lIlIIlIlII[lIlIIlIllI[144]] = lIIIllIIIIlII("AzUyLw==", "LEWAY");
        lIlIIlIlII[lIlIIlIllI[145]] = lIIIllIIIIIlI("6uySM+nfX5JAzIZQAVd9UQ==", "xJSIh");
        lIlIIlIlII[lIlIIlIllI[146]] = lIIIllIIIIIlI("JfWogJdoB0VdOsZenauBoA==", "ufUxZ");
        lIlIIlIlII[lIlIIlIllI[147]] = lIIIllIIIIlII("BjUgAT5qFQ==", "JPVdL");
        lIlIIlIlII[lIlIIlIllI[148]] = lIIIllIIIIlII("NBgiAA==", "dmNlx");
        lIlIIlIlII[lIlIIlIllI[149]] = lIIIllIIIIlII("DAQaF3U1BEwWOi4Z", "AklrU");
        lIlIIlIlII[lIlIIlIllI[150]] = lIIIllIIIIIlI("KIJ5Kp7LZrM=", "jMgCB");
        lIlIIlIlII[lIlIIlIllI[151]] = lIIIllIIIIIlI("W8EmMjFvyps=", "SOorL");
        lIlIIlIlII[lIlIIlIllI[153]] = lIIIllIIIIIlI("DqEpAxCar6KUGkPQrxhE2w==", "BMqPA");
        lIlIIlIlII[lIlIIlIllI[154]] = lIIIllIIIIIll("SKxnEDyGK20=", "TrlPz");
        lIlIIlIlII[lIlIIlIllI[155]] = lIIIllIIIIlII("IhIoNg==", "mbMXt");
        lIlIIlIlII[lIlIIlIllI[156]] = lIIIllIIIIIll("q6G4Tdj7AobYpiE3eE5nyA==", "lgfSp");
        lIlIIlIlII[lIlIIlIllI[158]] = lIIIllIIIIlII("KTMBBw==", "fCdia");
        lIlIIlIlII[lIlIIlIllI[160]] = lIIIllIIIIIlI("RAoAalM2kaQ=", "BupIk");
        lIlIIlIlII[lIlIIlIllI[163]] = lIIIllIIIIlII("CxodagklHQ==", "DsqJj");
        lIlIIlIlII[lIlIIlIllI[164]] = lIIIllIIIIlII("PCUrWSwSIg==", "sLGyO");
        lIlIIlIlII[lIlIIlIllI[165]] = lIIIllIIIIIlI("HPsONq/sp9s=", "uPTZO");
        lIlIIlIlII[lIlIIlIllI[166]] = lIIIllIIIIlII("PzgnCgYfbTEdAQg=", "mMEhc");
        lIlIIlIlII[lIlIIlIllI[167]] = lIIIllIIIIIll("mtQS0esFW7s=", "WGmFA");
        lIlIIlIlII[lIlIIlIllI[168]] = lIIIllIIIIIll("5jLUjNfHjkU=", "KurQn");
        lIlIIlIlII[lIlIIlIllI[169]] = lIIIllIIIIlII("IRgOZToAWQg3IQkcCzYhHQ==", "oyxEN");
        lIlIIlIlII[lIlIIlIllI[170]] = lIIIllIIIIIll("ut2koaavtBU=", "COIyf");
        lIlIIlIlII[lIlIIlIllI[171]] = lIIIllIIIIIlI("v7Wh3fwhjRdcqcDSWaqvJsuUcbCDmKw2", "xViql");
        lIlIIlIlII[lIlIIlIllI[172]] = lIIIllIIIIIlI("mEknhzt4EAZafK7gYURU2PJp84rL5A4W", "DMyGp");
        lIlIIlIlII[lIlIIlIllI[173]] = lIIIllIIIIIll("s++e0l6VfCY=", "NiSwM");
        lIlIIlIlII[lIlIIlIllI[174]] = lIIIllIIIIIlI("u+uoHO0oWmzXg52pVSKHddGlbciax1GG", "cGaGr");
        lIlIIlIlII[lIlIIlIllI[180]] = lIIIllIIIIIll("Tqzic5OuAdgyCrbGCdBg9fpyYIGBWavW", "SYUqJ");
        lIlIIlIlII[lIlIIlIllI[181]] = lIIIllIIIIIlI("gqOChs1JKLA65xoQPyW6Y0xdLppjnsWe", "abQkl");
        lIlIIlIlII[lIlIIlIllI[182]] = lIIIllIIIIlII("PiUGAA==", "zJirm");
        lIlIIlIlII[lIlIIlIllI[183]] = lIIIllIIIIIll("qm2LBtn0ZcY=", "eLuJI");
        lIlIIlIlII[lIlIIlIllI[185]] = lIIIllIIIIIlI("2dtALz4F1eY=", "Nnegk");
        lIlIIlIlII[lIlIIlIllI[186]] = lIIIllIIIIlII("OSAsGA==", "vPIvQ");
        lIlIIlIlII[lIlIIlIllI[193]] = lIIIllIIIIlII("MSMrRQ==", "hFXkN");
        lIlIIlIlII[lIlIIlIllI[194]] = lIIIllIIIIIlI("QR3LaHw+pGI5NNGJaWhKCjVFkY92D0aTRwBr05BFNmXaRyhAy5FVRw==", "lcgFP");
        lIlIIlIlII[lIlIIlIllI[195]] = lIIIllIIIIIll("zbz9TGEK+nMdtzIZx53Zy2C0YSRe/UPRhrEazanLQh8bDFJbRIVza4iwXfR4nOchJSh1IdW9zU0aqta/cZBLQA==", "HqZbi");
    }

    private static boolean lIIIllIIlIIII(int i) {
        return i > 0;
    }

    private static String lIIIllIIIIlII(String llllllllllllllllllllIIlIIlIlIIlI, String llllllllllllllllllllIIlIIlIlIIIl) {
        String llllllllllllllllllllIIlIIlIlIIlI2 = new String(Base64.getDecoder().decode(llllllllllllllllllllIIlIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllllIIlIIlIlIIII = new StringBuilder();
        char[] llllllllllllllllllllIIlIIlIIllll = llllllllllllllllllllIIlIIlIlIIIl.toCharArray();
        int llllllllllllllllllllIIlIIlIIlllI = lIlIIlIllI[1];
        char[] charArray = llllllllllllllllllllIIlIIlIlIIlI2.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIllI[1];
        while (lIIIllIIIllIl(i, length)) {
            char llllllllllllllllllllIIlIIlIlIIll = charArray[i];
            llllllllllllllllllllIIlIIlIlIIII.append((char) (llllllllllllllllllllIIlIIlIlIIll ^ llllllllllllllllllllIIlIIlIIllll[llllllllllllllllllllIIlIIlIIlllI % llllllllllllllllllllIIlIIlIIllll.length]));
            "".length();
            llllllllllllllllllllIIlIIlIIlllI++;
            i++;
            "".length();
            if ((196 ^ 192) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllllIIlIIlIlIIII);
    }

    private static boolean lIIIllIIlIllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean ac() {
        return lIlIIlIllI[1];
    }

    static {
        lIIIllIIIlIlI();
        lIIIllIIIlIIl();
        bp = new ArrayList();
        cV = new WorldPoint(lIlIIlIllI[64], lIlIIlIllI[187], lIlIIlIllI[1]);
        iG = new WorldPoint(lIlIIlIllI[188], lIlIIlIllI[189], lIlIIlIllI[1]);
        iH = new WorldPoint(lIlIIlIllI[161], lIlIIlIllI[190], lIlIIlIllI[1]);
        iI = new WorldPoint(lIlIIlIllI[191], lIlIIlIllI[192], lIlIIlIllI[1]);
        iJ = new WorldPoint(lIlIIlIllI[64], lIlIIlIllI[45], lIlIIlIllI[3]);
        iK = lIlIIlIllI[47];
        String[] strArr = new String[lIlIIlIllI[8]];
        strArr[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[193]];
        strArr[lIlIIlIllI[0]] = lIlIIlIlII[lIlIIlIllI[194]];
        strArr[lIlIIlIllI[3]] = lIlIIlIlII[lIlIIlIllI[195]];
        cy = strArr;
        iL = new WorldArea(lIlIIlIllI[188], lIlIIlIllI[196], lIlIIlIllI[50], lIlIIlIllI[40], lIlIIlIllI[1]);
    }

    private static boolean lIIIllIIlIlII(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01ad, code lost:
        if (lIIIllIIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.F.lIlIIlIllI[14]) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void O() {
        int[] iArr;
        int[] iArr2 = new int[lIlIIlIllI[0]];
        iArr2[lIlIIlIllI[1]] = lIlIIlIllI[6];
        if (lIIIllIIIlllI(Bank.contains(iArr2) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIlIllI[6], lIlIIlIllI[10], lIlIIlIllI[175]));
            "".length();
        }
        int[] iArr3 = new int[lIlIIlIllI[0]];
        iArr3[lIlIIlIllI[1]] = lIlIIlIllI[7];
        if (lIIIllIIIlllI(Bank.contains(iArr3) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIlIllI[7], lIlIIlIllI[0], lIlIIlIllI[175]));
            "".length();
        }
        int[] iArr4 = new int[lIlIIlIllI[0]];
        iArr4[lIlIIlIllI[1]] = lIlIIlIllI[9];
        if (lIIIllIIIlllI(Bank.contains(iArr4) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIlIllI[9], lIlIIlIllI[0], lIlIIlIllI[175]));
            "".length();
        }
        if (lIIIllIIIlllI(Bank.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIIlIlII[lIlIIlIllI[181]]);
        }) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIlIllI[176], lIlIIlIllI[14], lIlIIlIllI[177]));
            "".length();
        }
        int[] iArr5 = new int[lIlIIlIllI[0]];
        iArr5[lIlIIlIllI[1]] = lIlIIlIllI[12];
        if (lIIIllIIIlllI(Bank.contains(iArr5) ? 1 : 0)) {
            bp.add(new C0003d(lIlIIlIllI[12], lIlIIlIllI[4], C0009j.bZ));
            "".length();
        }
        int[] iArr6 = new int[lIlIIlIllI[0]];
        iArr6[lIlIIlIllI[1]] = lIlIIlIllI[13];
        if (lIIIllIIIllII(Bank.contains(iArr6) ? 1 : 0)) {
            int[] iArr7 = new int[lIlIIlIllI[0]];
            iArr7[lIlIIlIllI[1]] = lIlIIlIllI[13];
            if (lIIIllIIIllII(Bank.contains(iArr7) ? 1 : 0)) {
                int[] iArr8 = new int[lIlIIlIllI[0]];
                iArr8[lIlIIlIllI[1]] = lIlIIlIllI[13];
            }
            iArr = new int[lIlIIlIllI[0]];
            iArr[lIlIIlIllI[1]] = lIlIIlIllI[5];
            if (lIIIllIIIllII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr9 = new int[lIlIIlIllI[0]];
                iArr9[lIlIIlIllI[1]] = lIlIIlIllI[5];
                if (!lIIIllIIIllII(Bank.contains(iArr9) ? 1 : 0)) {
                    return;
                }
                int[] iArr10 = new int[lIlIIlIllI[0]];
                iArr10[lIlIIlIllI[1]] = lIlIIlIllI[5];
                if (!lIIIllIIIllIl(Bank.getFirst(iArr10).getQuantity(), lIlIIlIllI[27])) {
                    return;
                }
            }
            bp.add(new C0003d(lIlIIlIllI[5], lIlIIlIllI[57], lIlIIlIllI[179]));
            "".length();
        }
        bp.add(new C0003d(lIlIIlIllI[13], lIlIIlIllI[10], lIlIIlIllI[178]));
        "".length();
        iArr = new int[lIlIIlIllI[0]];
        iArr[lIlIIlIllI[1]] = lIlIIlIllI[5];
        if (lIIIllIIIllII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bp.add(new C0003d(lIlIIlIllI[5], lIlIIlIllI[57], lIlIIlIllI[179]));
        "".length();
    }

    private static String lIIIllIIIIIll(String llllllllllllllllllllIIlIIIllIIII, String llllllllllllllllllllIIlIIIlIllll) {
        try {
            SecretKeySpec llllllllllllllllllllIIlIIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIlIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllllIIlIIIllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllllllllIIlIIIllIIlI.init(lIlIIlIllI[3], llllllllllllllllllllIIlIIIllIIll);
            return new String(llllllllllllllllllllIIlIIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIlIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIlIIIllIIIl) {
            llllllllllllllllllllIIlIIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIlllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0514, code lost:
        if (lIIIllIIIllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L399;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1210, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1232, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ce() {
        if (lIIIllIIIllII(bn ? 1 : 0)) {
            C0001b.a(bp);
            if (lIIIllIIIllIl(bp.size(), lIlIIlIllI[0])) {
                System.out.println(lIlIIlIlII[lIlIIlIllI[1]]);
                bn = lIlIIlIllI[1];
            }
        }
        if (lIIIllIIIlllI(bn ? 1 : 0)) {
            if (lIIIllIIIlllI(al() ? 1 : 0) && lIIIllIIIllIl(C0004e.j(iK), lIlIIlIllI[0])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lIIIllIIIllll(nearest) && lIIIllIIIlllI(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[0]];
                    C0000a.a(nearest);
                }
                if (lIIIllIIIllll(nearest) && lIIIllIIIllII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lIIIllIIIlllI(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIlIIlIllI[2]);
                        "".length();
                    }
                    if (lIIIllIIIllII(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[3]];
                        if (lIIIllIIlIIII(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIlIIlIllI[4]);
                            "".length();
                        }
                        if (lIIIllIIlIIII(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIlIIlIllI[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIlIIlIllI[4]];
                        iArr[lIlIIlIllI[1]] = lIlIIlIllI[5];
                        iArr[lIlIIlIllI[0]] = lIlIIlIllI[6];
                        iArr[lIlIIlIllI[3]] = lIlIIlIllI[7];
                        iArr[lIlIIlIllI[8]] = lIlIIlIllI[9];
                        if (lIIIllIIIlllI(C0004e.b(iArr) ? 1 : 0)) {
                            O();
                            System.out.println(lIlIIlIlII[lIlIIlIllI[8]]);
                            bn = lIlIIlIllI[0];
                            return;
                        }
                        int[] iArr2 = new int[lIlIIlIllI[4]];
                        iArr2[lIlIIlIllI[1]] = lIlIIlIllI[5];
                        iArr2[lIlIIlIllI[0]] = lIlIIlIllI[6];
                        iArr2[lIlIIlIllI[3]] = lIlIIlIllI[7];
                        iArr2[lIlIIlIllI[8]] = lIlIIlIllI[9];
                        if (lIIIllIIIllII(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIlIIlIllI[5], lIlIIlIllI[10]);
                            C0000a.a(lIlIIlIllI[6], lIlIIlIllI[10]);
                            C0000a.a(lIlIIlIllI[7], lIlIIlIllI[0]);
                            C0000a.a(lIlIIlIllI[11], lIlIIlIllI[0]);
                            C0000a.a(lIlIIlIllI[9], lIlIIlIllI[0]);
                            C0000a.a(lIlIIlIllI[12], lIlIIlIllI[0]);
                            C0000a.a(lIlIIlIllI[13], lIlIIlIllI[14]);
                        }
                    }
                }
            }
            if (lIIIllIIIllII(Inventory.contains(C0005f.aU) ? 1 : 0) && lIIIllIIIllIl(Movement.getRunEnergy(), lIlIIlIllI[15])) {
                Inventory.getFirst(C0005f.aU).interact(lIlIIlIlII[lIlIIlIllI[4]]);
                Time.sleepTicks(lIlIIlIllI[0]);
                "".length();
            }
            int[] iArr3 = new int[lIlIIlIllI[0]];
            iArr3[lIlIIlIllI[1]] = lIlIIlIllI[13];
            if (lIIIllIIIllII(Inventory.contains(iArr3) ? 1 : 0) && lIIIllIIlIIIl(lIIIllIIIlIll(C0004e.u(), 50.0d))) {
                int[] iArr4 = new int[lIlIIlIllI[0]];
                iArr4[lIlIIlIllI[1]] = lIlIIlIllI[13];
                Inventory.getFirst(iArr4).interact(lIlIIlIlII[lIlIIlIllI[14]]);
                Time.sleepTicks(lIlIIlIllI[3]);
                "".length();
            }
            if (lIIIllIIIllII(al() ? 1 : 0) && lIIIllIIIlllI(C0004e.j(iK))) {
                if (lIIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIIlIllI[16])) {
                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[17]];
                    Movement.walkTo(cV);
                    "".length();
                    Time.sleepTicks(lIlIIlIllI[0]);
                    "".length();
                }
                if (lIIIllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(cV), lIlIIlIllI[16])) {
                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[18]];
                    if (lIIIllIIIllII(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    C0006g.a(lIlIIlIlII[lIlIIlIllI[16]], cy);
                }
            }
            if (lIIIllIIlIlII(C0004e.j(iK), lIlIIlIllI[0])) {
                dc = lIlIIlIllI[1];
                int[] iArr5 = new int[lIlIIlIllI[0]];
                iArr5[lIlIIlIllI[1]] = lIlIIlIllI[11];
                if (lIIIllIIIlllI(Inventory.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[lIlIIlIllI[0]];
                    iArr6[lIlIIlIllI[1]] = lIlIIlIllI[19];
                    if (lIIIllIIIlllI(Inventory.contains(iArr6) ? 1 : 0)) {
                        String[] strArr = new String[lIlIIlIllI[0]];
                        strArr[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[20]];
                        if (lIIIllIIIlllI(Inventory.contains(strArr) ? 1 : 0)) {
                            WorldPoint worldPoint = new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[22], lIlIIlIllI[0]);
                            int[] iArr7 = new int[lIlIIlIllI[0]];
                            iArr7[lIlIIlIllI[1]] = lIlIIlIllI[11];
                            if (lIIIllIIIlllI(Inventory.contains(iArr7) ? 1 : 0)) {
                                if (lIIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIIlIllI[14])) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[10]];
                                    Movement.walkTo(worldPoint);
                                    "".length();
                                    Time.sleepTicks(lIlIIlIllI[0]);
                                    "".length();
                                }
                                if (lIIIllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIlIIlIllI[14])) {
                                    int[] iArr8 = new int[lIlIIlIllI[0]];
                                    iArr8[lIlIIlIllI[1]] = lIlIIlIllI[11];
                                    TileItem nearest2 = TileItems.getNearest(iArr8);
                                    if (lIIIllIIIllll(nearest2)) {
                                        if (lIIIllIIIlllI(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[23]];
                                            Movement.walkTo(nearest2.getWorldLocation());
                                            "".length();
                                            Time.sleepTicks(lIlIIlIllI[0]);
                                            "".length();
                                        }
                                        if (lIIIllIIIllII(Reachable.isInteractable(nearest2) ? 1 : 0)) {
                                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[24]];
                                            nearest2.interact(lIlIIlIlII[lIlIIlIllI[25]]);
                                            Time.sleepTicks(lIlIIlIllI[8]);
                                            "".length();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                int[] iArr9 = new int[lIlIIlIllI[0]];
                iArr9[lIlIIlIllI[1]] = lIlIIlIllI[11];
                if (lIIIllIIIlllI(Inventory.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[lIlIIlIllI[0]];
                    iArr10[lIlIIlIllI[1]] = lIlIIlIllI[19];
                }
                int[] iArr11 = new int[lIlIIlIllI[0]];
                iArr11[lIlIIlIllI[1]] = lIlIIlIllI[19];
                if (lIIIllIIIlllI(Inventory.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[lIlIIlIllI[0]];
                    iArr12[lIlIIlIllI[1]] = lIlIIlIllI[11];
                    if (lIIIllIIIllII(Inventory.contains(iArr12) ? 1 : 0)) {
                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[26]];
                        int[] iArr13 = new int[lIlIIlIllI[0]];
                        iArr13[lIlIIlIllI[1]] = lIlIIlIllI[11];
                        Item first = Inventory.getFirst(iArr13);
                        int[] iArr14 = new int[lIlIIlIllI[0]];
                        iArr14[lIlIIlIllI[1]] = lIlIIlIllI[9];
                        first.useOn(Inventory.getFirst(iArr14));
                        Time.sleepTicks(lIlIIlIllI[0]);
                        "".length();
                    }
                }
                int[] iArr15 = new int[lIlIIlIllI[0]];
                iArr15[lIlIIlIllI[1]] = lIlIIlIllI[19];
                if (lIIIllIIIllII(Inventory.contains(iArr15) ? 1 : 0)) {
                    String[] strArr2 = new String[lIlIIlIllI[0]];
                    strArr2[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[27]];
                    if (lIIIllIIIlllI(Inventory.contains(strArr2) ? 1 : 0)) {
                        if (lIIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iG), lIlIIlIllI[4])) {
                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[28]];
                            Movement.walkTo(iG);
                            "".length();
                            Time.sleepTicks(lIlIIlIllI[0]);
                            "".length();
                        }
                        if (lIIIllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(iG), lIlIIlIllI[4])) {
                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[29]];
                            String[] strArr3 = new String[lIlIIlIllI[0]];
                            strArr3[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[30]];
                            TileObjects.getNearest(strArr3).interact(lIlIIlIlII[lIlIIlIllI[31]]);
                            Time.sleepTicks(lIlIIlIllI[20]);
                            "".length();
                        }
                    }
                    String[] strArr4 = new String[lIlIIlIllI[0]];
                    strArr4[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[32]];
                    if (lIIIllIIIllII(Inventory.contains(strArr4) ? 1 : 0)) {
                        if (lIIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iH), lIlIIlIllI[8])) {
                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[33]];
                            Movement.walkTo(iH);
                            "".length();
                            Time.sleepTicks(lIlIIlIllI[0]);
                            "".length();
                        }
                        if (lIIIllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(iH), lIlIIlIllI[8])) {
                            int[] iArr16 = new int[lIlIIlIllI[0]];
                            iArr16[lIlIIlIllI[1]] = lIlIIlIllI[19];
                            Item first2 = Inventory.getFirst(iArr16);
                            String[] strArr5 = new String[lIlIIlIllI[0]];
                            strArr5[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[34]];
                            first2.useOn(TileObjects.getNearest(strArr5));
                            Time.sleepTicks(lIlIIlIllI[0]);
                            "".length();
                        }
                    }
                }
                String[] strArr6 = new String[lIlIIlIllI[0]];
                strArr6[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[35]];
                if (lIIIllIIIllII(Inventory.contains(strArr6) ? 1 : 0)) {
                    int[] iArr17 = new int[lIlIIlIllI[0]];
                    iArr17[lIlIIlIllI[1]] = lIlIIlIllI[19];
                    if (lIIIllIIIlllI(Inventory.contains(iArr17) ? 1 : 0)) {
                        String[] strArr7 = new String[lIlIIlIllI[0]];
                        strArr7[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[36]];
                        if (lIIIllIIIlllI(Inventory.contains(strArr7) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[37]];
                            if (lIIIllIIIlllI(Dialog.isOpen() ? 1 : 0)) {
                                String[] strArr8 = new String[lIlIIlIllI[0]];
                                strArr8[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[38]];
                                TileObjects.getNearest(strArr8).interact(lIlIIlIlII[lIlIIlIllI[39]]);
                                Time.sleepTicks(lIlIIlIllI[4]);
                                "".length();
                            }
                            C0006g.a(cy);
                        }
                    }
                }
                String[] strArr9 = new String[lIlIIlIllI[0]];
                strArr9[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[40]];
                if (lIIIllIIIllII(Inventory.contains(strArr9) ? 1 : 0)) {
                    String[] strArr10 = new String[lIlIIlIllI[0]];
                    strArr10[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[41]];
                    if (lIIIllIIIllII(Inventory.contains(strArr10) ? 1 : 0)) {
                        String[] strArr11 = new String[lIlIIlIllI[0]];
                        strArr11[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[42]];
                        if (lIIIllIIIlllI(Inventory.contains(strArr11) ? 1 : 0)) {
                            WorldPoint worldPoint2 = new WorldPoint(lIlIIlIllI[43], lIlIIlIllI[44], lIlIIlIllI[1]);
                            WorldPoint worldPoint3 = new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[44], lIlIIlIllI[1]);
                            WorldArea worldArea = new WorldArea(lIlIIlIllI[21], lIlIIlIllI[45], lIlIIlIllI[14], lIlIIlIllI[8], lIlIIlIllI[1]);
                            if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) && lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) && lIIIllIIIlllI(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[46]];
                                Movement.walkTo(worldPoint2);
                                "".length();
                                Time.sleepTicks(lIlIIlIllI[0]);
                                "".length();
                            }
                            if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0)) {
                                String[] strArr12 = new String[lIlIIlIllI[0]];
                                strArr12[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[47]];
                                TileObjects.getNearest(strArr12).interact(lIlIIlIlII[lIlIIlIllI[48]]);
                                Time.sleepTicks(lIlIIlIllI[3]);
                                "".length();
                            }
                            if (lIIIllIIIllII(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[49]];
                                String[] strArr13 = new String[lIlIIlIllI[0]];
                                strArr13[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[50]];
                                TileItems.getNearest(strArr13).interact(lIlIIlIlII[lIlIIlIllI[51]]);
                                Time.sleepTicks(lIlIIlIllI[8]);
                                "".length();
                            }
                        }
                    }
                }
                String[] strArr14 = new String[lIlIIlIllI[0]];
                strArr14[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[52]];
                if (lIIIllIIIllII(Inventory.contains(strArr14) ? 1 : 0)) {
                    String[] strArr15 = new String[lIlIIlIllI[0]];
                    strArr15[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[53]];
                    if (lIIIllIIIlllI(Inventory.contains(strArr15) ? 1 : 0)) {
                        WorldArea worldArea2 = new WorldArea(lIlIIlIllI[21], lIlIIlIllI[45], lIlIIlIllI[14], lIlIIlIllI[8], lIlIIlIllI[1]);
                        WorldArea worldArea3 = new WorldArea(lIlIIlIllI[54], lIlIIlIllI[55], lIlIIlIllI[18], lIlIIlIllI[23], lIlIIlIllI[1]);
                        if (lIIIllIIIllII(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr16 = new String[lIlIIlIllI[0]];
                            strArr16[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[56]];
                            TileObjects.getNearest(strArr16).interact(lIlIIlIlII[lIlIIlIllI[57]]);
                            Time.sleepTicks(lIlIIlIllI[3]);
                            "".length();
                        }
                        if (lIIIllIIIlllI(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllIIIlllI(iL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[58]];
                            Movement.walkTo(iI);
                            "".length();
                            Time.sleepTicks(lIlIIlIllI[0]);
                            "".length();
                        }
                        if (lIIIllIIIllII(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            String[] strArr17 = new String[lIlIIlIllI[0]];
                            strArr17[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[59]];
                            TileObjects.getNearest(strArr17).interact(lIlIIlIlII[lIlIIlIllI[60]]);
                            Time.sleepTicks(lIlIIlIllI[4]);
                            "".length();
                        }
                        if (lIIIllIIIllII(iL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            WorldPoint worldPoint4 = new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[61], lIlIIlIllI[1]);
                            WorldPoint worldPoint5 = new WorldPoint(lIlIIlIllI[62], lIlIIlIllI[63], lIlIIlIllI[1]);
                            new WorldPoint(lIlIIlIllI[64], lIlIIlIllI[65], lIlIIlIllI[1]);
                            new WorldPoint(lIlIIlIllI[43], lIlIIlIllI[66], lIlIIlIllI[1]);
                            WorldPoint worldPoint6 = new WorldPoint(lIlIIlIllI[67], lIlIIlIllI[66], lIlIIlIllI[1]);
                            WorldPoint worldPoint7 = new WorldPoint(lIlIIlIllI[67], lIlIIlIllI[66], lIlIIlIllI[1]);
                            WorldArea worldArea4 = new WorldArea(lIlIIlIllI[68], lIlIIlIllI[69], lIlIIlIllI[20], lIlIIlIllI[23], lIlIIlIllI[1]);
                            WorldArea worldArea5 = new WorldArea(lIlIIlIllI[70], lIlIIlIllI[71], lIlIIlIllI[14], lIlIIlIllI[17], lIlIIlIllI[1]);
                            WorldArea worldArea6 = new WorldArea(lIlIIlIllI[72], lIlIIlIllI[73], lIlIIlIllI[32], lIlIIlIllI[25], lIlIIlIllI[1]);
                            if (lIIIllIIlIlIl(Vars.getBit(lIlIIlIllI[74]), lIlIIlIllI[0]) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[75]))) {
                                if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[76]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(lIlIIlIllI[0]);
                                    "".length();
                                }
                                if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[77]];
                                    String[] strArr18 = new String[lIlIIlIllI[0]];
                                    strArr18[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[78]];
                                    TileObjects.getNearest(strArr18).interact(lIlIIlIlII[lIlIIlIllI[79]]);
                                    Time.sleepTicks(lIlIIlIllI[8]);
                                    "".length();
                                }
                            }
                            if (lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[74]), lIlIIlIllI[0]) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[80])) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[75]))) {
                                if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[81]];
                                    Movement.walkTo(worldPoint5);
                                    "".length();
                                    Time.sleepTicks(lIlIIlIllI[0]);
                                    "".length();
                                }
                                if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[82]];
                                    String[] strArr19 = new String[lIlIIlIllI[0]];
                                    strArr19[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[15]];
                                    TileObjects.getNearest(strArr19).interact(lIlIIlIlII[lIlIIlIllI[83]]);
                                    Time.sleepTicks(lIlIIlIllI[8]);
                                    "".length();
                                }
                            }
                            if (lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[74]), lIlIIlIllI[0]) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[80]), lIlIIlIllI[0]) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[75]))) {
                                if (lIIIllIIIlllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint8 = new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[84], lIlIIlIllI[1]);
                                    if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[85]];
                                        Movement.walkTo(worldPoint8);
                                        "".length();
                                        Time.sleepTicks(lIlIIlIllI[0]);
                                        "".length();
                                    }
                                    if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint8) ? 1 : 0)) {
                                        String[] strArr20 = new String[lIlIIlIllI[0]];
                                        strArr20[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[86]];
                                        TileObjects.getNearest(strArr20).interact(lIlIIlIlII[lIlIIlIllI[87]]);
                                        Time.sleepTicks(lIlIIlIllI[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIllIIIllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[88]];
                                    String[] strArr21 = new String[lIlIIlIllI[0]];
                                    strArr21[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[89]];
                                    TileObjects.getNearest(strArr21).interact(lIlIIlIlII[lIlIIlIllI[90]]);
                                    Time.sleepTicks(lIlIIlIllI[8]);
                                    "".length();
                                }
                            }
                            if (lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[74]), lIlIIlIllI[0]) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[80]), lIlIIlIllI[0]) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[75]), lIlIIlIllI[0])) {
                                if (lIIIllIIIllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint9 = new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[91], lIlIIlIllI[1]);
                                    if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[92]];
                                        Movement.walkTo(worldPoint9);
                                        "".length();
                                        Time.sleepTicks(lIlIIlIllI[0]);
                                        "".length();
                                    }
                                    if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint9) ? 1 : 0)) {
                                        String[] strArr22 = new String[lIlIIlIllI[0]];
                                        strArr22[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[93]];
                                        TileObjects.getNearest(strArr22).interact(lIlIIlIlII[lIlIIlIllI[94]]);
                                        Time.sleepTicks(lIlIIlIllI[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIllIIIlllI(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[95]];
                                        Movement.walkTo(worldPoint5);
                                        "".length();
                                        Time.sleepTicks(lIlIIlIllI[0]);
                                        "".length();
                                    }
                                    if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint5) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[96]];
                                        String[] strArr23 = new String[lIlIIlIllI[0]];
                                        strArr23[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[97]];
                                        TileObjects.getNearest(strArr23).interact(lIlIIlIlII[lIlIIlIllI[98]]);
                                        Time.sleepTicks(lIlIIlIllI[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[74]), lIlIIlIllI[0]) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[80])) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[75]), lIlIIlIllI[0])) {
                                if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[99]];
                                    Movement.walkTo(worldPoint4);
                                    "".length();
                                    Time.sleepTicks(lIlIIlIllI[0]);
                                    "".length();
                                }
                                if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[100]];
                                    String[] strArr24 = new String[lIlIIlIllI[0]];
                                    strArr24[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[101]];
                                    TileObjects.getNearest(strArr24).interact(lIlIIlIlII[lIlIIlIllI[102]]);
                                    Time.sleepTicks(lIlIIlIllI[8]);
                                    "".length();
                                }
                            }
                            if (lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[74])) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[80])) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[75]), lIlIIlIllI[0]) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[103])) && lIIIllIIIlllI(cf() ? 1 : 0)) {
                                if (lIIIllIIIlllI(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIIIllIIIllII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint10 = new WorldPoint(lIlIIlIllI[104], lIlIIlIllI[84], lIlIIlIllI[1]);
                                        if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[105]];
                                            Movement.walkTo(worldPoint10);
                                            "".length();
                                            Time.sleepTicks(lIlIIlIllI[0]);
                                            "".length();
                                        }
                                        if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint10) ? 1 : 0)) {
                                            String[] strArr25 = new String[lIlIIlIllI[0]];
                                            strArr25[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[106]];
                                            TileObjects.getNearest(strArr25).interact(lIlIIlIlII[lIlIIlIllI[107]]);
                                            Time.sleepTicks(lIlIIlIllI[8]);
                                            "".length();
                                        }
                                    }
                                    if (lIIIllIIIllII(new WorldArea(lIlIIlIllI[72], lIlIIlIllI[69], lIlIIlIllI[14], lIlIIlIllI[14], lIlIIlIllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllIIIlllI(cf() ? 1 : 0)) {
                                        WorldPoint worldPoint11 = new WorldPoint(lIlIIlIllI[108], lIlIIlIllI[109], lIlIIlIllI[1]);
                                        if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[110]];
                                            Movement.walkTo(worldPoint11);
                                            "".length();
                                            Time.sleepTicks(lIlIIlIllI[0]);
                                            "".length();
                                        }
                                        if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint11) ? 1 : 0)) {
                                            String[] strArr26 = new String[lIlIIlIllI[0]];
                                            strArr26[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[111]];
                                            TileObjects.getNearest(strArr26).interact(lIlIIlIlII[lIlIIlIllI[112]]);
                                            Time.sleepTicks(lIlIIlIllI[8]);
                                            "".length();
                                        }
                                    }
                                    if (lIIIllIIIllII(new WorldArea(lIlIIlIllI[70], lIlIIlIllI[69], lIlIIlIllI[14], lIlIIlIllI[14], lIlIIlIllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                        WorldPoint worldPoint12 = new WorldPoint(lIlIIlIllI[67], lIlIIlIllI[113], lIlIIlIllI[1]);
                                        if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[114]];
                                            Movement.walkTo(worldPoint12);
                                            "".length();
                                            Time.sleepTicks(lIlIIlIllI[0]);
                                            "".length();
                                        }
                                        if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint12) ? 1 : 0)) {
                                            String[] strArr27 = new String[lIlIIlIllI[0]];
                                            strArr27[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[115]];
                                            TileObjects.getNearest(strArr27).interact(lIlIIlIlII[lIlIIlIllI[116]]);
                                            Time.sleepTicks(lIlIIlIllI[8]);
                                            "".length();
                                        }
                                    }
                                }
                                if (lIIIllIIIllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllIIIlllI(cf() ? 1 : 0)) {
                                    if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[117]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(lIlIIlIllI[0]);
                                        "".length();
                                    }
                                    if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[118]];
                                        String[] strArr28 = new String[lIlIIlIllI[0]];
                                        strArr28[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[119]];
                                        TileObjects.getNearest(strArr28).interact(lIlIIlIlII[lIlIIlIllI[120]]);
                                        Time.sleepTicks(lIlIIlIllI[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[74])) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[80])) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[75]), lIlIIlIllI[0]) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[103]), lIlIIlIllI[0]) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[121]))) {
                                if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[122]];
                                    Movement.walkTo(worldPoint7);
                                    "".length();
                                    Time.sleepTicks(lIlIIlIllI[0]);
                                    "".length();
                                }
                                if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint7) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[123]];
                                    String[] strArr29 = new String[lIlIIlIllI[0]];
                                    strArr29[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[124]];
                                    TileObjects.getNearest(strArr29).interact(lIlIIlIlII[lIlIIlIllI[125]]);
                                    Time.sleepTicks(lIlIIlIllI[8]);
                                    "".length();
                                }
                            }
                            if (lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[74])) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[80])) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[75]), lIlIIlIllI[0]) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[103]), lIlIIlIllI[0]) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[121]), lIlIIlIllI[0]) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[126]))) {
                                WorldArea worldArea7 = new WorldArea(lIlIIlIllI[72], lIlIIlIllI[71], lIlIIlIllI[14], lIlIIlIllI[14], lIlIIlIllI[1]);
                                if (lIIIllIIIllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint13 = new WorldPoint(lIlIIlIllI[127], lIlIIlIllI[66], lIlIIlIllI[1]);
                                    if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[128]];
                                        Movement.walkTo(worldPoint13);
                                        "".length();
                                        Time.sleepTicks(lIlIIlIllI[0]);
                                        "".length();
                                    }
                                    if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint13) ? 1 : 0)) {
                                        String[] strArr30 = new String[lIlIIlIllI[0]];
                                        strArr30[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[129]];
                                        TileObjects.getNearest(strArr30).interact(lIlIIlIlII[lIlIIlIllI[130]]);
                                        Time.sleepTicks(lIlIIlIllI[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIllIIIllII(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint14 = new WorldPoint(lIlIIlIllI[131], lIlIIlIllI[66], lIlIIlIllI[1]);
                                    if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[132]];
                                        Movement.walkTo(worldPoint14);
                                        "".length();
                                        Time.sleepTicks(lIlIIlIllI[0]);
                                        "".length();
                                    }
                                    if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint14) ? 1 : 0)) {
                                        String[] strArr31 = new String[lIlIIlIllI[0]];
                                        strArr31[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[133]];
                                        TileObjects.getNearest(strArr31).interact(lIlIIlIlII[lIlIIlIllI[134]]);
                                        Time.sleepTicks(lIlIIlIllI[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIllIIIllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[135]];
                                    String[] strArr32 = new String[lIlIIlIllI[0]];
                                    strArr32[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[136]];
                                    TileObjects.getNearest(strArr32).interact(lIlIIlIlII[lIlIIlIllI[137]]);
                                    Time.sleepTicks(lIlIIlIllI[16]);
                                    "".length();
                                }
                            }
                            if (lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[74])) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[80])) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[75]), lIlIIlIllI[0]) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[103]), lIlIIlIllI[0]) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[121]), lIlIIlIllI[0]) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[126]), lIlIIlIllI[0])) {
                                WorldArea worldArea8 = new WorldArea(lIlIIlIllI[72], lIlIIlIllI[71], lIlIIlIllI[14], lIlIIlIllI[14], lIlIIlIllI[1]);
                                if (lIIIllIIIllII(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint15 = new WorldPoint(lIlIIlIllI[138], lIlIIlIllI[66], lIlIIlIllI[1]);
                                    if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[139]];
                                        Movement.walkTo(worldPoint15);
                                        "".length();
                                        Time.sleepTicks(lIlIIlIllI[0]);
                                        "".length();
                                    }
                                    if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint15) ? 1 : 0)) {
                                        String[] strArr33 = new String[lIlIIlIllI[0]];
                                        strArr33[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[140]];
                                        TileObjects.getNearest(strArr33).interact(lIlIIlIlII[lIlIIlIllI[141]]);
                                        Time.sleepTicks(lIlIIlIllI[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIllIIIllII(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint16 = new WorldPoint(lIlIIlIllI[108], lIlIIlIllI[66], lIlIIlIllI[1]);
                                    if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[142]];
                                        Movement.walkTo(worldPoint16);
                                        "".length();
                                        Time.sleepTicks(lIlIIlIllI[0]);
                                        "".length();
                                    }
                                    if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint16) ? 1 : 0)) {
                                        String[] strArr34 = new String[lIlIIlIllI[0]];
                                        strArr34[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[143]];
                                        TileObjects.getNearest(strArr34).interact(lIlIIlIlII[lIlIIlIllI[144]]);
                                        Time.sleepTicks(lIlIIlIllI[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIllIIIllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[145]];
                                        Movement.walkTo(worldPoint6);
                                        "".length();
                                        Time.sleepTicks(lIlIIlIllI[0]);
                                        "".length();
                                    }
                                    if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint6) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[146]];
                                        String[] strArr35 = new String[lIlIIlIllI[0]];
                                        strArr35[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[147]];
                                        TileObjects.getNearest(strArr35).interact(lIlIIlIlII[lIlIIlIllI[148]]);
                                        Time.sleepTicks(lIlIIlIllI[8]);
                                        "".length();
                                    }
                                }
                            }
                            if (lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[74])) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[80])) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[75]), lIlIIlIllI[0]) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[103])) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[121]), lIlIIlIllI[0]) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[126]), lIlIIlIllI[0])) {
                                WorldArea worldArea9 = new WorldArea(lIlIIlIllI[72], lIlIIlIllI[71], lIlIIlIllI[14], lIlIIlIllI[14], lIlIIlIllI[1]);
                                if (lIIIllIIIllII(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint17 = new WorldPoint(lIlIIlIllI[127], lIlIIlIllI[66], lIlIIlIllI[1]);
                                    if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[149]];
                                        Movement.walkTo(worldPoint17);
                                        "".length();
                                        Time.sleepTicks(lIlIIlIllI[0]);
                                        "".length();
                                    }
                                    if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint17) ? 1 : 0)) {
                                        String[] strArr36 = new String[lIlIIlIllI[0]];
                                        strArr36[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[150]];
                                        TileObjects.getNearest(strArr36).interact(lIlIIlIlII[lIlIIlIllI[151]]);
                                        Time.sleepTicks(lIlIIlIllI[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIllIIIllII(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    WorldPoint worldPoint18 = new WorldPoint(lIlIIlIllI[104], lIlIIlIllI[152], lIlIIlIllI[1]);
                                    if (lIIIllIIIlllI(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[153]];
                                        Movement.walkTo(worldPoint18);
                                        "".length();
                                        Time.sleepTicks(lIlIIlIllI[0]);
                                        "".length();
                                    }
                                    if (lIIIllIIIllII(Players.getLocal().getWorldLocation().equals(worldPoint18) ? 1 : 0)) {
                                        Time.sleepTicks(lIlIIlIllI[0]);
                                        "".length();
                                        String[] strArr37 = new String[lIlIIlIllI[0]];
                                        strArr37[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[154]];
                                        TileObjects.getNearest(strArr37).interact(lIlIIlIlII[lIlIIlIllI[155]]);
                                        Time.sleepTicks(lIlIIlIllI[8]);
                                        "".length();
                                    }
                                }
                                if (lIIIllIIIllII(new WorldArea(lIlIIlIllI[72], lIlIIlIllI[69], lIlIIlIllI[14], lIlIIlIllI[14], lIlIIlIllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIIllIIIlllI(Players.getLocal().isMoving() ? 1 : 0)) {
                                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[156]];
                                    Time.sleepTicks(lIlIIlIllI[0]);
                                    "".length();
                                    int[] iArr18 = new int[lIlIIlIllI[0]];
                                    iArr18[lIlIIlIllI[1]] = lIlIIlIllI[157];
                                    TileObjects.getNearest(iArr18).interact(lIlIIlIlII[lIlIIlIllI[158]]);
                                    Time.sleepTicks(lIlIIlIllI[8]);
                                    "".length();
                                }
                                if (lIIIllIIIllII(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    int[] iArr19 = new int[lIlIIlIllI[0]];
                                    iArr19[lIlIIlIllI[1]] = lIlIIlIllI[159];
                                    TileObjects.getNearest(iArr19).interact(lIlIIlIlII[lIlIIlIllI[160]]);
                                    Time.sleepTicks(lIlIIlIllI[8]);
                                    "".length();
                                }
                                if (lIIIllIIIllII(new WorldArea(lIlIIlIllI[161], lIlIIlIllI[162], lIlIIlIllI[23], lIlIIlIllI[14], lIlIIlIllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                                    String[] strArr38 = new String[lIlIIlIllI[0]];
                                    strArr38[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[163]];
                                    if (lIIIllIIIlllI(Inventory.contains(strArr38) ? 1 : 0)) {
                                        String[] strArr39 = new String[lIlIIlIllI[0]];
                                        strArr39[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[164]];
                                        TileItems.getNearest(strArr39).interact(lIlIIlIlII[lIlIIlIllI[165]]);
                                        Time.sleepTicks(lIlIIlIllI[14]);
                                        "".length();
                                    }
                                }
                            }
                        }
                    }
                }
                String[] strArr40 = new String[lIlIIlIllI[0]];
                strArr40[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[166]];
                if (lIIIllIIIllII(Inventory.contains(strArr40) ? 1 : 0)) {
                    String[] strArr41 = new String[lIlIIlIllI[0]];
                    strArr41[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[167]];
                    if (lIIIllIIIllII(Inventory.contains(strArr41) ? 1 : 0)) {
                        if (lIIIllIIIllII(new WorldArea(lIlIIlIllI[161], lIlIIlIllI[162], lIlIIlIllI[23], lIlIIlIllI[14], lIlIIlIllI[1]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                            int[] iArr20 = new int[lIlIIlIllI[0]];
                            iArr20[lIlIIlIllI[1]] = lIlIIlIllI[159];
                            TileObjects.getNearest(iArr20).interact(lIlIIlIlII[lIlIIlIllI[168]]);
                            Time.sleepTicks(lIlIIlIllI[14]);
                            "".length();
                        }
                        if (lIIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iJ), lIlIIlIllI[10])) {
                            AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[169]];
                            Movement.walkTo(iJ);
                            "".length();
                            Time.sleepTicks(lIlIIlIllI[0]);
                            "".length();
                        }
                        if (lIIIllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lIlIIlIllI[10])) {
                            TileObject nearest3 = TileObjects.getNearest(tileObject -> {
                                if (lIIIllIIIllII(tileObject.getName().contains(lIlIIlIlII[lIlIIlIllI[185]]) ? 1 : 0)) {
                                    String[] strArr42 = new String[lIlIIlIllI[0]];
                                    strArr42[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[186]];
                                    if (lIIIllIIIllII(tileObject.hasAction(strArr42) ? 1 : 0) && lIIIllIIlIIll(tileObject.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[184], lIlIIlIllI[3])), lIlIIlIllI[3])) {
                                        ?? r0 = lIlIIlIllI[0];
                                        "".length();
                                        return (-"  ".length()) >= 0 ? ((((32 + 1) - (-60)) + 45) ^ (((18 + 72) - 21) + 79)) & (((57 ^ 124) ^ (210 ^ 137)) ^ (-" ".length())) : r0;
                                    }
                                }
                                return lIlIIlIllI[1];
                            });
                            if (lIIIllIIIllll(nearest3)) {
                                nearest3.interact(lIlIIlIlII[lIlIIlIllI[170]]);
                                Time.sleepTicks(lIlIIlIllI[8]);
                                "".length();
                            }
                            if (lIIIllIIlIllI(nearest3)) {
                                C0006g.a(lIlIIlIlII[lIlIIlIllI[171]], cy, lIlIIlIllI[0]);
                            }
                        }
                    }
                }
            }
            if (lIIIllIIlIlII(C0004e.j(iK), lIlIIlIllI[3])) {
                if (lIIIllIIlIIlI(Players.getLocal().getWorldLocation().distanceTo(iJ), lIlIIlIllI[10])) {
                    AccBuilderShamans.c = lIlIIlIlII[lIlIIlIllI[172]];
                    Movement.walkTo(iJ);
                    "".length();
                    Time.sleepTicks(lIlIIlIllI[0]);
                    "".length();
                }
                if (lIIIllIIlIIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lIlIIlIllI[10])) {
                    TileObject nearest4 = TileObjects.getNearest(tileObject2 -> {
                        if (lIIIllIIIllII(tileObject2.getName().contains(lIlIIlIlII[lIlIIlIllI[182]]) ? 1 : 0)) {
                            String[] strArr42 = new String[lIlIIlIllI[0]];
                            strArr42[lIlIIlIllI[1]] = lIlIIlIlII[lIlIIlIllI[183]];
                            if (lIIIllIIIllII(tileObject2.hasAction(strArr42) ? 1 : 0) && lIIIllIIlIIll(tileObject2.getWorldLocation().distanceTo(new WorldPoint(lIlIIlIllI[21], lIlIIlIllI[184], lIlIIlIllI[3])), lIlIIlIllI[3])) {
                                ?? r0 = lIlIIlIllI[0];
                                "".length();
                                return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                        return lIlIIlIllI[1];
                    });
                    if (lIIIllIIIllll(nearest4)) {
                        nearest4.interact(lIlIIlIlII[lIlIIlIllI[173]]);
                        Time.sleepTicks(lIlIIlIllI[8]);
                        "".length();
                    }
                    if (lIIIllIIlIllI(nearest4)) {
                        if (lIIIllIIIllIl(dc, lIlIIlIllI[0])) {
                            Z.oi += lIlIIlIllI[0];
                            Z.p(AccBuilderShamans.m);
                            dc += lIlIIlIllI[0];
                            Z.oi = lIlIIlIllI[1];
                            dd = lIlIIlIllI[1];
                        }
                        C0006g.a(lIlIIlIlII[lIlIIlIllI[174]], cy, lIlIIlIllI[0]);
                    }
                }
            }
            C0006g.a(cy);
        }
    }

    private static String lIIIllIIIIIlI(String llllllllllllllllllllIIlIIIllllIl, String llllllllllllllllllllIIlIIIllllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllllIIlIIIllllII.getBytes(StandardCharsets.UTF_8)), lIlIIlIllI[16]), "DES");
            Cipher llllllllllllllllllllIIlIIIllllll = Cipher.getInstance("DES");
            llllllllllllllllllllIIlIIIllllll.init(lIlIIlIllI[3], secretKeySpec);
            return new String(llllllllllllllllllllIIlIIIllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllllllIIlIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllllIIlIIIlllllI) {
            llllllllllllllllllllIIlIIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIllIIIllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIllIIIllII(int i) {
        return i != 0;
    }

    private static boolean lIIIllIIlIlll(int i, int i2) {
        return i >= i2;
    }

    private static int lIIIllIIIlIll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIIllIIlIIlI(int i, int i2) {
        return i > i2;
    }

    private static void lIIIllIIIlIlI() {
        lIlIIlIllI = new int[198];
        lIlIIlIllI[0] = " ".length();
        lIlIIlIllI[1] = (133 ^ 130) & ((172 ^ 171) ^ (-1));
        lIlIIlIllI[2] = (-1061) & 6060;
        lIlIIlIllI[3] = "  ".length();
        lIlIIlIllI[4] = (((70 + 70) - 85) + 87) ^ (((91 + 33) - 10) + 24);
        lIlIIlIllI[5] = (-(21 ^ 60)) & (-8321) & 16367;
        lIlIIlIllI[6] = (-((-2249) & 10473)) & (-4609) & 32447;
        lIlIIlIllI[7] = (-1025) & 1976;
        lIlIIlIllI[8] = "   ".length();
        lIlIIlIllI[9] = (-16897) & 17169;
        lIlIIlIllI[10] = 23 ^ 29;
        lIlIIlIllI[11] = (-22182) & 22453;
        lIlIIlIllI[12] = (-16527) & 29151;
        lIlIIlIllI[13] = (-((-28675) & 32263)) & (-8193) & 12159;
        lIlIIlIllI[14] = (((82 + 61) - 106) + 152) ^ (((29 + 68) - 45) + 132);
        lIlIIlIllI[15] = (246 ^ 195) ^ (115 ^ 116);
        lIlIIlIllI[16] = 44 ^ 36;
        lIlIIlIllI[17] = 82 ^ 84;
        lIlIIlIllI[18] = 190 ^ 185;
        lIlIIlIllI[19] = (-26249) & 26522;
        lIlIIlIllI[20] = (2 ^ 49) ^ (55 ^ 13);
        lIlIIlIllI[21] = (-897) & 4004;
        lIlIIlIllI[22] = (-17025) & 20381;
        lIlIIlIllI[23] = (((111 + 54) - 52) + 14) ^ (111 ^ 27);
        lIlIIlIllI[24] = (183 ^ 158) ^ (18 ^ 55);
        lIlIIlIllI[25] = 55 ^ 58;
        lIlIIlIllI[26] = 14 ^ 0;
        lIlIIlIllI[27] = 118 ^ 121;
        lIlIIlIllI[28] = 30 ^ 14;
        lIlIIlIllI[29] = (217 ^ 135) ^ (124 ^ 51);
        lIlIIlIllI[30] = (14 ^ 48) ^ (166 ^ 138);
        lIlIIlIllI[31] = 117 ^ 102;
        lIlIIlIllI[32] = 154 ^ 142;
        lIlIIlIllI[33] = 23 ^ 2;
        lIlIIlIllI[34] = 143 ^ 153;
        lIlIIlIllI[35] = (((59 + 138) - 118) + 63) ^ (((97 + 47) - 99) + 108);
        lIlIIlIllI[36] = (235 ^ 128) ^ (209 ^ 162);
        lIlIIlIllI[37] = 166 ^ 191;
        lIlIIlIllI[38] = 57 ^ 35;
        lIlIIlIllI[39] = 137 ^ 146;
        lIlIIlIllI[40] = 216 ^ 196;
        lIlIIlIllI[41] = (((144 + 6) - 124) + 160) ^ (((16 + 55) - (-2)) + 94);
        lIlIIlIllI[42] = (99 ^ 68) ^ (122 ^ 67);
        lIlIIlIllI[43] = (-((-7777) & 32361)) & (-4497) & 32187;
        lIlIIlIllI[44] = (-4233) & 7599;
        lIlIIlIllI[45] = (-((-18981) & 31286)) & (-201) & 15871;
        lIlIIlIllI[46] = 30 ^ 1;
        lIlIIlIllI[47] = (89 ^ 18) ^ (35 ^ 72);
        lIlIIlIllI[48] = 16 ^ 49;
        lIlIIlIllI[49] = (46 ^ 18) ^ (64 ^ 94);
        lIlIIlIllI[50] = 172 ^ 143;
        lIlIIlIllI[51] = (51 ^ 124) ^ (114 ^ 25);
        lIlIIlIllI[52] = 170 ^ 143;
        lIlIIlIllI[53] = 6 ^ 32;
        lIlIIlIllI[54] = (-366) & 3455;
        lIlIIlIllI[55] = (-((-10249) & 26793)) & (-5) & 19901;
        lIlIIlIllI[56] = (34 ^ 53) ^ (142 ^ 190);
        lIlIIlIllI[57] = 65 ^ 105;
        lIlIIlIllI[58] = 161 ^ 136;
        lIlIIlIllI[59] = 115 ^ 89;
        lIlIIlIllI[60] = (((107 + 155) - 218) + 112) ^ (((121 + 137) - 96) + 21);
        lIlIIlIllI[61] = (-(((89 + 41) - 116) + 147)) & (-6474) & 16379;
        lIlIIlIllI[62] = (-25090) & 28205;
        lIlIIlIllI[63] = (-322) & 10073;
        lIlIIlIllI[64] = (-322) & 3431;
        lIlIIlIllI[65] = (-4183) & 13943;
        lIlIIlIllI[66] = (-4563) & 14327;
        lIlIIlIllI[67] = (-12773) & 15869;
        lIlIIlIllI[68] = (-((-8229) & 12543)) & (-16389) & 23807;
        lIlIIlIllI[69] = (-((-9826) & 30563)) & (-1) & 30495;
        lIlIIlIllI[70] = (-25537) & 28631;
        lIlIIlIllI[71] = (-((-835) & 5079)) & (-2369) & 16375;
        lIlIIlIllI[72] = (-12644) & 15743;
        lIlIIlIllI[73] = (-((-10003) & 32759)) & (-1) & 32501;
        lIlIIlIllI[74] = (-10498) & 12285;
        lIlIIlIllI[75] = (-6401) & 8191;
        lIlIIlIllI[76] = (211 ^ 169) ^ (238 ^ 184);
        lIlIIlIllI[77] = (171 ^ 151) ^ (212 ^ 197);
        lIlIIlIllI[78] = (13 ^ 110) ^ (227 ^ 174);
        lIlIIlIllI[79] = 74 ^ 101;
        lIlIIlIllI[80] = (-((-4169) & 22859)) & (-12289) & 32767;
        lIlIIlIllI[81] = (((173 + 124) - 227) + 113) ^ (((75 + 28) - 54) + 86);
        lIlIIlIllI[82] = 100 ^ 85;
        lIlIIlIllI[83] = (234 ^ 159) ^ (134 ^ 192);
        lIlIIlIllI[84] = (-(((123 + 62) - 140) + 86)) & (-4193) & 14079;
        lIlIIlIllI[85] = 156 ^ 168;
        lIlIIlIllI[86] = (97 ^ 13) ^ (33 ^ 120);
        lIlIIlIllI[87] = 62 ^ 8;
        lIlIIlIllI[88] = 4 ^ 51;
        lIlIIlIllI[89] = 110 ^ 86;
        lIlIIlIllI[90] = 143 ^ 182;
        lIlIIlIllI[91] = (-2369) & 12127;
        lIlIIlIllI[92] = (84 ^ 94) ^ (86 ^ 102);
        lIlIIlIllI[93] = (((74 + 121) - 125) + 76) ^ (((43 + 119) - 57) + 64);
        lIlIIlIllI[94] = 8 ^ 52;
        lIlIIlIllI[95] = (111 ^ 39) ^ (2 ^ 119);
        lIlIIlIllI[96] = (26 ^ 106) ^ (20 ^ 90);
        lIlIIlIllI[97] = 64 ^ 127;
        lIlIIlIllI[98] = 57 ^ 121;
        lIlIIlIllI[99] = 254 ^ 191;
        lIlIIlIllI[100] = (114 ^ 69) ^ (231 ^ 146);
        lIlIIlIllI[101] = (((162 + 171) - 292) + 211) ^ (((67 + 72) - 91) + 143);
        lIlIIlIllI[102] = 254 ^ 186;
        lIlIIlIllI[103] = (-((-28164) & 32447)) & (-10241) & 16315;
        lIlIIlIllI[104] = (-((-27933) & 32766)) & (-257) & 8191;
        lIlIIlIllI[105] = (((86 + 58) - (-53)) + 56) ^ (((22 + 82) - (-76)) + 4);
        lIlIIlIllI[106] = (1 ^ 100) ^ (70 ^ 101);
        lIlIIlIllI[107] = (126 ^ 30) ^ (103 ^ 64);
        lIlIIlIllI[108] = (-((-787) & 13171)) & (-3) & 15487;
        lIlIIlIllI[109] = (-((-17700) & 19835)) & (-20865) & 32759;
        lIlIIlIllI[110] = 93 ^ 21;
        lIlIIlIllI[111] = (113 ^ 67) ^ (23 ^ 108);
        lIlIIlIllI[112] = (5 ^ 91) ^ (127 ^ 107);
        lIlIIlIllI[113] = (-22) & 9783;
        lIlIIlIllI[114] = 226 ^ 169;
        lIlIIlIllI[115] = (8 ^ 50) ^ (202 ^ 188);
        lIlIIlIllI[116] = 249 ^ 180;
        lIlIIlIllI[117] = (((196 + 39) - 224) + 231) ^ (((102 + 55) - 65) + 96);
        lIlIIlIllI[118] = 19 ^ 92;
        lIlIIlIllI[119] = 67 ^ 19;
        lIlIIlIllI[120] = (58 ^ 77) ^ (138 ^ 172);
        lIlIIlIllI[121] = (-18481) & 20273;
        lIlIIlIllI[122] = (167 ^ 185) ^ (95 ^ 19);
        lIlIIlIllI[123] = 40 ^ 123;
        lIlIIlIllI[124] = (117 ^ 74) ^ (23 ^ 124);
        lIlIIlIllI[125] = 229 ^ 176;
        lIlIIlIllI[126] = (-16641) & 18430;
        lIlIIlIllI[127] = (-21473) & 24571;
        lIlIIlIllI[128] = (96 ^ 21) ^ (191 ^ 156);
        lIlIIlIllI[129] = 206 ^ 153;
        lIlIIlIllI[130] = 69 ^ 29;
        lIlIIlIllI[131] = (-9026) & 12129;
        lIlIIlIllI[132] = (((78 + 152) - 123) + 88) ^ (((72 + 68) - 50) + 64);
        lIlIIlIllI[133] = (12 ^ 123) ^ (94 ^ 115);
        lIlIIlIllI[134] = (48 ^ 34) ^ (203 ^ 130);
        lIlIIlIllI[135] = (115 ^ 37) ^ (148 ^ 158);
        lIlIIlIllI[136] = (((139 + 198) - 332) + 215) ^ (((21 + 49) - (-17)) + 42);
        lIlIIlIllI[137] = (((190 + 148) - 248) + 120) ^ (((27 + 138) - 26) + 1);
        lIlIIlIllI[138] = (-((-35) & 17015)) & (-393) & 20478;
        lIlIIlIllI[139] = 252 ^ 163;
        lIlIIlIllI[140] = 209 ^ 177;
        lIlIIlIllI[141] = (((66 + 29) - (-74)) + 30) ^ (((104 + 133) - 221) + 150);
        lIlIIlIllI[142] = 235 ^ 137;
        lIlIIlIllI[143] = 193 ^ 162;
        lIlIIlIllI[144] = 219 ^ 191;
        lIlIIlIllI[145] = (151 ^ 187) ^ (212 ^ 157);
        lIlIIlIllI[146] = 237 ^ 139;
        lIlIIlIllI[147] = 0 ^ 103;
        lIlIIlIllI[148] = 124 ^ 20;
        lIlIIlIllI[149] = (31 ^ 108) ^ (137 ^ 147);
        lIlIIlIllI[150] = (((76 + 188) - 254) + 191) ^ (((8 + 63) - (-32)) + 60);
        lIlIIlIllI[151] = 251 ^ 144;
        lIlIIlIllI[152] = (-((-2615) & 19063)) & (-4497) & 30708;
        lIlIIlIllI[153] = (166 ^ 145) ^ (228 ^ 191);
        lIlIIlIllI[154] = (((168 + 43) - 106) + 67) ^ (((54 + 116) - 169) + 192);
        lIlIIlIllI[155] = 57 ^ 87;
        lIlIIlIllI[156] = " ".length() ^ (204 ^ 162);
        lIlIIlIllI[157] = (((181 ^ 165) + (232 ^ 188)) - (15 ^ 80)) + ((137 + 47) - 91) + 47;
        lIlIIlIllI[158] = 194 ^ 178;
        lIlIIlIllI[159] = ((1 + 87) - (-9)) + 44;
        lIlIIlIllI[160] = (32 ^ 94) ^ (44 ^ 35);
        lIlIIlIllI[161] = (-16969) & 20057;
        lIlIIlIllI[162] = (-4131) & 13883;
        lIlIIlIllI[163] = (((165 + 10) - 174) + 235) ^ (((118 + 130) - 135) + 45);
        lIlIIlIllI[164] = 37 ^ 86;
        lIlIIlIllI[165] = (203 ^ 147) ^ (129 ^ 173);
        lIlIIlIllI[166] = (207 ^ 129) ^ (71 ^ 124);
        lIlIIlIllI[167] = (94 ^ 13) ^ (139 ^ 174);
        lIlIIlIllI[168] = ("   ".length() & ("   ".length() ^ (-1))) ^ (90 ^ 45);
        lIlIIlIllI[169] = 77 ^ 53;
        lIlIIlIllI[170] = 22 ^ 111;
        lIlIIlIllI[171] = 118 ^ 12;
        lIlIIlIllI[172] = 19 ^ 104;
        lIlIIlIllI[173] = 246 ^ 138;
        lIlIIlIllI[174] = 117 ^ 8;
        lIlIIlIllI[175] = (-((-5225) & 6140)) & (-2081) & 12215;
        lIlIIlIllI[176] = (-17) & 11996;
        lIlIIlIllI[177] = (-((-24778) & 27343)) & (-1105) & 28669;
        lIlIIlIllI[178] = (-((-7169) & 15443)) & (-20098) & 28671;
        lIlIIlIllI[179] = (-((-1186) & 21739)) & (-10881) & 32733;
        lIlIIlIllI[180] = (((129 + 187) - 135) + 19) ^ (((128 + 147) - 188) + 95);
        lIlIIlIllI[181] = ((87 + 10) - 0) + 30;
        lIlIIlIllI[182] = ((79 + 23) - (-2)) + 24;
        lIlIIlIllI[183] = (((36 ^ 51) + (131 ^ 195)) - (222 ^ 192)) + (11 ^ 67);
        lIlIIlIllI[184] = (-((-6593) & 7123)) & (-65) & 3959;
        lIlIIlIllI[185] = (((122 ^ 79) + (207 ^ 149)) - (71 ^ 118)) + (29 ^ 57);
        lIlIIlIllI[186] = (((57 ^ 92) + (44 ^ 107)) - (12 ^ 93)) + (188 ^ 148);
        lIlIIlIllI[187] = (-29187) & 32515;
        lIlIIlIllI[188] = (-16785) & 19871;
        lIlIIlIllI[189] = (-((-4105) & 28765)) & (-4106) & 32125;
        lIlIIlIllI[190] = (-((-3082) & 7883)) & (-16391) & 24527;
        lIlIIlIllI[191] = (-((-9527) & 26111)) & (-4354) & 24031;
        lIlIIlIllI[192] = (-((-17789) & 22013)) & (-8193) & 15775;
        lIlIIlIllI[193] = (((134 ^ 173) + (191 ^ 149)) - (-(156 ^ 181))) + (113 ^ 119);
        lIlIIlIllI[194] = (((38 ^ 74) + (101 ^ 98)) - (231 ^ 149)) + ((84 + 47) - 20) + 21;
        lIlIIlIllI[195] = ((5 + 103) - 62) + 88;
        lIlIIlIllI[196] = (-22801) & 32543;
        lIlIIlIllI[197] = (("  ".length() + (95 ^ 19)) - (119 ^ 125)) + (219 ^ 152);
    }

    private static boolean lIIIllIIlIlIl(int i, int i2) {
        return i != i2;
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public String ae() {
        return lIlIIlIlII[lIlIIlIllI[180]];
    }

    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public int ad() {
        try {
            ce();
            "".length();
            if (0 != 0) {
                return ((((130 + 123) - 195) + 75) ^ (((154 + 101) - 113) + 50)) & (((189 ^ 138) ^ (87 ^ 37)) ^ (-" ".length())) & ((((((157 + 175) - 249) + 107) ^ (((124 + 22) - 44) + 72)) & (((((125 + 122) - 142) + 28) ^ (((85 + 128) - 147) + 83)) ^ (-" ".length()))) ^ (-" ".length()));
            }
        } catch (Exception e) {
        }
        return lIlIIlIllI[144];
    }

    private static boolean lIIIllIIIllll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    static boolean cf() {
        if (lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[74])) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[80])) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[75]), lIlIIlIllI[0]) && lIIIllIIIlllI(Vars.getBit(lIlIIlIllI[103])) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[121]), lIlIIlIllI[0]) && lIIIllIIlIlII(Vars.getBit(lIlIIlIllI[126]), lIlIIlIllI[0])) {
            ?? r0 = lIlIIlIllI[0];
            "".length();
            return "   ".length() <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIIlIllI[1];
    }

    private static boolean lIIIllIIlIIIl(int i) {
        return i < 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n.K
    public boolean af() {
        if (lIIIllIIlIlll(C0004e.j(lIlIIlIllI[47]), lIlIIlIllI[8])) {
            ?? r0 = lIlIIlIllI[0];
            "".length();
            return "   ".length() == (-" ".length()) ? ((73 ^ 7) ^ (234 ^ 174)) & (((29 ^ 106) ^ (231 ^ 154)) ^ (-" ".length())) : r0;
        }
        return lIlIIlIllI[1];
    }
}
