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
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
/* renamed from: l.i.r.i.y.c.c.-.s.e.n.-.e.l.b.e.l.k.d.-.c.o.a.u.e.u.-.I  reason: invalid package */
/* loaded from: d1f9e3af-c0a5-49dd-86b2-8e857984fef3.jar:l/i/r/i/y/c/c/-/s/e/n/-/e/l/b/e/l/k/d/-/c/o/a/u/e/u/-/I.class */
public class I implements W {
    static /* synthetic */ boolean cm;
    private static /* synthetic */ String[] lIIIllIll;
    static /* synthetic */ int cl;
    private static /* synthetic */ int[] lIIIlllIl;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ List<C0003d> bv;
    static /* synthetic */ String[] bR;
    static /* synthetic */ WorldPoint iJ;
    static /* synthetic */ int iI;
    static /* synthetic */ WorldPoint bX;

    private static void lllIlIllllI() {
        lIIIllIll = new String[lIIIlllIl[162]];
        lIIIllIll[lIIIlllIl[1]] = lllIlIllIII("PgUPKDcQCQVhJg0VCC8jWAUVJCkLQEEyMxEYAiktFgtBIyUbB0E1K1gdFCQ3DA==", "xlaAD");
        lIIIllIll[lIIIlllIl[0]] = lllIlIllIIl("WqDEz6MMcrL20MUajPwozg==", "apHbf");
        lIIIllIll[lIIIlllIl[3]] = lllIlIllIIl("NgJ0OVMAStTeEs9fuk1eNg==", "xSreu");
        lIIIllIll[lIIIlllIl[5]] = lllIlIllIII("GyQoNAg6KyFwBjIrLTkKNA==", "SEFPd");
        lIIIllIll[lIIIlllIl[6]] = lllIlIllIII("FTZiBhwncy8OHTE6LABOMyYnFBpiIDcXHi46JxRCYiA1DhohOysJCWInLUcsFwoLKSk=", "BSBgn");
        lIIIllIll[lIIIlllIl[7]] = lllIlIllIlI("Cj/EwNVhZN8=", "pckma");
        lIIIllIll[lIIIlllIl[18]] = lllIlIllIIl("Jq81l6adx8A=", "LYKvR");
        lIIIllIll[lIIIlllIl[19]] = lllIlIllIlI("E0lpqtuQ7HncNQzjkIb5Ow==", "fhcWs");
        lIIIllIll[lIIIlllIl[20]] = lllIlIllIII("Ai0aRQI8LQNFFTA2EgA=", "QDheC");
        lIIIllIll[lIIIlllIl[34]] = lllIlIllIII("JBkYUxcFWAgcER4KCwAQ", "jxnsc");
        lIIIllIll[lIIIlllIl[13]] = lllIlIllIII("DjwVFD0pbhcfI2wmHxYq", "LNzzG");
        lIIIllIll[lIIIlllIl[38]] = lllIlIllIlI("AlfZ850PG1JqwjFJ5Ngl5Q==", "VMUVA");
        lIIIllIll[lIIIlllIl[2]] = lllIlIllIIl("dOpf7OmZcs3tPqOB8aKz2A==", "heavm");
        lIIIllIll[lIIIlllIl[35]] = lllIlIllIlI("/QdZDwVz33H9g9rdXC6m5A==", "UzuXL");
        lIIIllIll[lIIIlllIl[39]] = lllIlIllIII("EyM3HA==", "DFVnI");
        lIIIllIll[lIIIlllIl[16]] = lllIlIllIlI("CZ9OG92/jFgaYsq7kuh9zA==", "zVSsR");
        lIIIllIll[lIIIlllIl[40]] = lllIlIllIlI("oCuVGXJBmoXV9CsNBC6PUQ==", "Ivrgt");
        lIIIllIll[lIIIlllIl[41]] = lllIlIllIlI("MUDuO5/CwXc=", "ELzGB");
        lIIIllIll[lIIIlllIl[42]] = lllIlIllIlI("Rde6DsWR2fY=", "jfWGa");
        lIIIllIll[lIIIlllIl[29]] = lllIlIllIlI("zUP5IRKaZrtkuHrZLHSn5A==", "MAbsx");
        lIIIllIll[lIIIlllIl[26]] = lllIlIllIlI("GDnvNYU9XW/RnC5Ib/Y/bA==", "oiilL");
        lIIIllIll[lIIIlllIl[43]] = lllIlIllIlI("4L7L/mgbEX7Y0MNrXY6oHQ==", "Rfikf");
        lIIIllIll[lIIIlllIl[44]] = lllIlIllIlI("cpRfd2ns028=", "TDiWs");
        lIIIllIll[lIIIlllIl[45]] = lllIlIllIIl("OhVsu9d80+hHQB40dTRBHg==", "daQde");
        lIIIllIll[lIIIlllIl[31]] = lllIlIllIlI("rYKrR0tUDec=", "TXHPF");
        lIIIllIll[lIIIlllIl[46]] = lllIlIllIlI("VP3GTtvS7Sc=", "RIMaQ");
        lIIIllIll[lIIIlllIl[49]] = lllIlIllIIl("7ev9bwDL5oTqiljGOxPDbVjQDf9YayWv", "uWUrk");
        lIIIllIll[lIIIlllIl[50]] = lllIlIllIIl("+zSgs3dVID851MrfkNlaiQ==", "QQjsz");
        lIIIllIll[lIIIlllIl[51]] = lllIlIllIIl("2FH8nYEg7w/sqTvHthfxpUTR3ek0H7/g", "tWVxZ");
        lIIIllIll[lIIIlllIl[28]] = lllIlIllIII("CCYjNC1mPzo=", "KJJYO");
        lIIIllIll[lIIIlllIl[25]] = lllIlIllIlI("IIwIz/P5u5zy09iZ1Ht3U2P+wE/hJw6g", "AiyyU");
        lIIIllIll[lIIIlllIl[54]] = lllIlIllIII("AAI4CiBuCj4QLA==", "CnQgB");
        lIIIllIll[lIIIlllIl[57]] = lllIlIllIlI("g8WkY9szPWB38Sd/ifEQeUqAlYLxrYwJTd8hxd0HzvM=", "zEvfB");
        lIIIllIll[lIIIlllIl[58]] = lllIlIllIIl("Ls5ipK4xi9s=", "MZaVR");
        lIIIllIll[lIIIlllIl[59]] = lllIlIllIIl("9zNkK7A0x1M=", "JdVzj");
        lIIIllIll[lIIIlllIl[60]] = lllIlIllIlI("EmWAl9JvEAE=", "bpPLI");
        lIIIllIll[lIIIlllIl[61]] = lllIlIllIII("Hx8kFA==", "PoAzW");
        lIIIllIll[lIIIlllIl[62]] = lllIlIllIIl("GuBgVcr9nt4=", "nyAQY");
        lIIIllIll[lIIIlllIl[63]] = lllIlIllIlI("bL0VNzWlUHs=", "lNXyO");
        lIIIllIll[lIIIlllIl[65]] = lllIlIllIII("BSAeNjQ7", "IAzRQ");
        lIIIllIll[lIIIlllIl[66]] = lllIlIllIIl("ISSuboj+H2RrxaNR/LI50w==", "CuRVP");
        lIIIllIll[lIIIlllIl[68]] = lllIlIllIII("FDYjIgV3PiU4CXcpLywIOT5qIwYzPi89", "WZJOg");
        lIIIllIll[lIIIlllIl[69]] = lllIlIllIIl("9Yiy2pMkOCk=", "AGEgw");
        lIIIllIll[lIIIlllIl[70]] = lllIlIllIIl("1UxZqj4zMT3nsrNFPNmDXw==", "OBFRi");
        lIIIllIll[lIIIlllIl[73]] = lllIlIllIIl("LBkhCXRsJjQQeLz/SDeBOA==", "njADi");
        lIIIllIll[lIIIlllIl[74]] = lllIlIllIII("JQIDNw==", "jrfYa");
        lIIIllIll[lIIIlllIl[75]] = lllIlIllIII("NRMhEyYfRzAOLRQ=", "fgTaB");
        lIIIllIll[lIIIlllIl[76]] = lllIlIllIIl("2xf96oJzDNc=", "rUWLM");
        lIIIllIll[lIIIlllIl[77]] = lllIlIllIlI("5pdOn0zyLqn9M92LzIziQg==", "ApiCf");
        lIIIllIll[lIIIlllIl[78]] = lllIlIllIII("JT8JJQ==", "jOlKw");
        lIIIllIll[lIIIlllIl[17]] = lllIlIllIII("KhcSAw0AQwMeBgs=", "ycgqi");
        lIIIllIll[lIIIlllIl[79]] = lllIlIllIII("NT0ACA==", "zMefy");
        lIIIllIll[lIIIlllIl[80]] = lllIlIllIII("JSceNApLLxguBg==", "fKwYh");
        lIIIllIll[lIIIlllIl[81]] = lllIlIllIlI("LLMlOHd7WkU=", "KYCLV");
        lIIIllIll[lIIIlllIl[82]] = lllIlIllIII("ID4JEg0CehsS", "lWzfh");
        lIIIllIll[lIIIlllIl[85]] = lllIlIllIlI("MPUlicMkBAUWJufDnK1uGA==", "RXhse");
        lIIIllIll[lIIIlllIl[86]] = lllIlIllIIl("nAN6BJM5Lzg=", "BZoSA");
        lIIIllIll[lIIIlllIl[87]] = lllIlIllIII("KzkjOy5FIDo=", "hUJVL");
        lIIIllIll[lIIIlllIl[90]] = lllIlIllIII("MDUlGHFF", "tZJjQ");
        lIIIllIll[lIIIlllIl[91]] = lllIlIllIlI("upkC/YieUXc+rsaQymjr4A==", "zmJSn");
        lIIIllIll[lIIIlllIl[92]] = lllIlIllIlI("udthrYesEDg=", "VpyRO");
        lIIIllIll[lIIIlllIl[93]] = lllIlIllIIl("32lEx8o3Ve3C1JJWD00TXA==", "lLuxG");
        lIIIllIll[lIIIlllIl[94]] = lllIlIllIII("DQc8JyIz", "AfXCG");
        lIIIllIll[lIIIlllIl[95]] = lllIlIllIII("EgEcHzN8GAU=", "QmurQ");
        lIIIllIll[lIIIlllIl[96]] = lllIlIllIII("DyUpImQsK2UlJTwgIDtkPCsyJ2RpZDEgKD0=", "XDEID");
        lIIIllIll[lIIIlllIl[97]] = lllIlIllIIl("M/cJn/25dkwLcWt7D1e+Ww==", "oUIFf");
        lIIIllIll[lIIIlllIl[98]] = lllIlIllIII("NRI1Fy4L", "ysQsK");
        lIIIllIll[lIIIlllIl[99]] = lllIlIllIII("DRQ8IjhjHDo4NA==", "NxUOZ");
        lIIIllIll[lIIIlllIl[100]] = lllIlIllIlI("1od/d9N5XU4=", "YoHxm");
        lIIIllIll[lIIIlllIl[101]] = lllIlIllIIl("Uc8wlWFN5+E=", "plcNW");
        lIIIllIll[lIIIlllIl[102]] = lllIlIllIII("FS0mFg==", "QBIdd");
        lIIIllIll[lIIIlllIl[103]] = lllIlIllIIl("+oF8T6pZXuk=", "EFMVS");
        lIIIllIll[lIIIlllIl[104]] = lllIlIllIII("ITATJiwf", "mQwBI");
        lIIIllIll[lIIIlllIl[105]] = lllIlIllIlI("V47HW5dgHLE=", "RuyzI");
        lIIIllIll[lIIIlllIl[106]] = lllIlIllIII("FQUnLQQr", "YdCIa");
        lIIIllIll[lIIIlllIl[107]] = lllIlIllIII("Ky8OOjZFNhc=", "hCgWT");
        lIIIllIll[lIIIlllIl[110]] = lllIlIllIlI("+dTxliaZTAg=", "Xwxsn");
        lIIIllIll[lIIIlllIl[111]] = lllIlIllIlI("Hv2892xEbw41CcDYPPnOiw==", "chaIi");
        lIIIllIll[lIIIlllIl[112]] = lllIlIllIII("MTwZGzVfNB8BOQ==", "rPpvW");
        lIIIllIll[lIIIlllIl[113]] = lllIlIllIlI("F5zjqgju5aM=", "atMyY");
        lIIIllIll[lIIIlllIl[114]] = lllIlIllIII("NiEBKw==", "fTrCC");
        lIIIllIll[lIIIlllIl[116]] = lllIlIllIlI("W7NGu4gbEJ4=", "RKxdE");
        lIIIllIll[lIIIlllIl[117]] = lllIlIllIIl("BDPa13n8MSE=", "mqvyr");
        lIIIllIll[lIIIlllIl[118]] = lllIlIllIIl("e2JlWsdvjsDDokjIAouCNA==", "ZrFhn");
        lIIIllIll[lIIIlllIl[120]] = lllIlIllIII("IRYAEA==", "eyobm");
        lIIIllIll[lIIIlllIl[121]] = lllIlIllIlI("lTm+HyDUovs=", "EZGqa");
        lIIIllIll[lIIIlllIl[122]] = lllIlIllIlI("wlTFv3frb3M=", "EJTRo");
        lIIIllIll[lIIIlllIl[123]] = lllIlIllIIl("NekN9CJxv/9CdWaWSxe08g==", "ggdpK");
        lIIIllIll[lIIIlllIl[125]] = lllIlIllIIl("U8AA0YlaAI0=", "ZwRIP");
        lIIIllIll[lIIIlllIl[126]] = lllIlIllIIl("DHoBTxDTdzY=", "cbYoq");
        lIIIllIll[lIIIlllIl[127]] = lllIlIllIIl("KVryXmq5IPk=", "ESNTo");
        lIIIllIll[lIIIlllIl[128]] = lllIlIllIII("IhQnBhEGEA==", "auEdp");
        lIIIllIll[lIIIlllIl[129]] = lllIlIllIIl("aMJpSNG5JBM=", "xGmLr");
        lIIIllIll[lIIIlllIl[130]] = lllIlIllIlI("BBkhtLcO7JY=", "TLGwt");
        lIIIllIll[lIIIlllIl[131]] = lllIlIllIlI("Wi+RtG0v4HU=", "FMmIb");
        lIIIllIll[lIIIlllIl[132]] = lllIlIllIIl("SQEWqPJLkliVWTXqFFVJ4A==", "aRIsJ");
        lIIIllIll[lIIIlllIl[133]] = lllIlIllIlI("AlsF9nwO0XrGT2WPMptpPw==", "Ttzoj");
        lIIIllIll[lIIIlllIl[141]] = lllIlIllIlI("uQAAcjxlKUr5TbxyEF/m+qtZDUHWmjed", "SVgQq");
        lIIIllIll[lIIIlllIl[142]] = lllIlIllIIl("Q5M4yNRppFg1oE2y087W79LuZiqgnK4k", "psMqT");
        lIIIllIll[lIIIlllIl[143]] = lllIlIllIIl("UC6N2toee/A=", "EeAIk");
        lIIIllIll[lIIIlllIl[140]] = lllIlIllIlI("JjYPzcA7lFk=", "SthnT");
        lIIIllIll[lIIIlllIl[144]] = lllIlIllIlI("/W7OKYPJm6c=", "RDHTY");
        lIIIllIll[lIIIlllIl[145]] = lllIlIllIIl("YoOzdZgNWv0mnQcT+o0kMw==", "GwnRi");
        lIIIllIll[lIIIlllIl[146]] = lllIlIllIIl("Zirt4w0j9BE=", "sNYkJ");
        lIIIllIll[lIIIlllIl[147]] = lllIlIllIlI("Y3mHh9qgHCAO5NXzvwyW/g==", "tWufs");
        lIIIllIll[lIIIlllIl[148]] = lllIlIllIlI("q080ptV5LOM=", "srSoR");
        lIIIllIll[lIIIlllIl[149]] = lllIlIllIIl("vNeQB+c/KDVQ426Y3HIaRg==", "GDlcp");
        lIIIllIll[lIIIlllIl[150]] = lllIlIllIII("BhI3MisY", "jsSVN");
        lIIIllIll[lIIIlllIl[151]] = lllIlIllIIl("Qs/mDjvAkO4TlAW8KvS2OA==", "bRRNI");
        lIIIllIll[lIIIlllIl[152]] = lllIlIllIlI("ZxVl3R20aR0=", "fZzAW");
        lIIIllIll[lIIIlllIl[153]] = lllIlIllIlI("rcTF7zfsxvgj10jJhnUYbw==", "ORIYP");
        lIIIllIll[lIIIlllIl[158]] = lllIlIllIlI("iXIqj6QFf+A=", "NmNfn");
        lIIIllIll[lIIIlllIl[159]] = lllIlIllIIl("rkW+bCgesuIBhnrBaVkE8w==", "mQCbb");
        lIIIllIll[lIIIlllIl[160]] = lllIlIllIIl("XzFeXjmJipRaDF1CZGNTyv/RHzf4iySTiyWFVTMIDQQ=", "ThYuD");
        lIIIllIll[lIIIlllIl[161]] = lllIlIllIII("O1cVHQ9VA1ERAAASX1IoVRpRFQ4bGRZSCBxXEBwYBRYIXA==", "rwqra");
    }

    private static boolean lllIllIIlIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean S() {
        return lIIIlllIl[1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0132, code lost:
        if (lllIllIIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.I.lIIIlllIl[7]) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01bd, code lost:
        if (lllIllIIIlI(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.I.lIIIlllIl[7]) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void af() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4 = new int[lIIIlllIl[0]];
        iArr4[lIIIlllIl[1]] = lIIIlllIl[11];
        if (lllIllIIIll(Bank.contains(iArr4) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlllIl[11], lIIIlllIl[0], lIIIlllIl[134]));
            "".length();
        }
        int[] iArr5 = new int[lIIIlllIl[0]];
        iArr5[lIIIlllIl[1]] = lIIIlllIl[10];
        if (lllIllIIIll(Bank.contains(iArr5) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlllIl[10], lIIIlllIl[0], lIIIlllIl[134]));
            "".length();
        }
        int[] iArr6 = new int[lIIIlllIl[0]];
        iArr6[lIIIlllIl[1]] = lIIIlllIl[12];
        if (lllIllIIIll(Bank.contains(iArr6) ? 1 : 0)) {
            bv.add(new C0003d(lIIIlllIl[12], lIIIlllIl[0], lIIIlllIl[134]));
            "".length();
        }
        int[] iArr7 = new int[lIIIlllIl[0]];
        iArr7[lIIIlllIl[1]] = lIIIlllIl[9];
        if (lllIllIIIIl(Bank.contains(iArr7) ? 1 : 0)) {
            int[] iArr8 = new int[lIIIlllIl[0]];
            iArr8[lIIIlllIl[1]] = lIIIlllIl[9];
            if (lllIllIIIIl(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[lIIIlllIl[0]];
                iArr9[lIIIlllIl[1]] = lIIIlllIl[9];
            }
            iArr = new int[lIIIlllIl[0]];
            iArr[lIIIlllIl[1]] = lIIIlllIl[15];
            if (lllIllIIIIl(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr10 = new int[lIIIlllIl[0]];
                iArr10[lIIIlllIl[1]] = lIIIlllIl[15];
                if (lllIllIIIIl(Bank.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[lIIIlllIl[0]];
                    iArr11[lIIIlllIl[1]] = lIIIlllIl[15];
                }
                if (lllIllIIIll(Bank.contains(item -> {
                    return item.getName().toLowerCase().contains(lIIIllIll[lIIIlllIl[142]]);
                }) ? 1 : 0)) {
                    bv.add(new C0003d(lIIIlllIl[137], lIIIlllIl[7], lIIIlllIl[138]));
                    "".length();
                }
                iArr2 = new int[lIIIlllIl[0]];
                iArr2[lIIIlllIl[1]] = lIIIlllIl[14];
                if (lllIllIIIll(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0003d(lIIIlllIl[14], lIIIlllIl[6], C0008i.bq));
                    "".length();
                }
                iArr3 = new int[lIIIlllIl[0]];
                iArr3[lIIIlllIl[1]] = lIIIlllIl[8];
                if (lllIllIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr12 = new int[lIIIlllIl[0]];
                    iArr12[lIIIlllIl[1]] = lIIIlllIl[8];
                    if (!lllIllIIIIl(Bank.contains(iArr12) ? 1 : 0)) {
                        return;
                    }
                    int[] iArr13 = new int[lIIIlllIl[0]];
                    iArr13[lIIIlllIl[1]] = lIIIlllIl[8];
                    if (!lllIllIIIlI(Bank.getFirst(iArr13).getQuantity(), lIIIlllIl[16])) {
                        return;
                    }
                }
                bv.add(new C0003d(lIIIlllIl[8], lIIIlllIl[66], lIIIlllIl[139]));
                "".length();
            }
            bv.add(new C0003d(lIIIlllIl[15], lIIIlllIl[13], lIIIlllIl[136]));
            "".length();
            if (lllIllIIIll(Bank.contains(item2 -> {
                return item2.getName().toLowerCase().contains(lIIIllIll[lIIIlllIl[142]]);
            }) ? 1 : 0)) {
            }
            iArr2 = new int[lIIIlllIl[0]];
            iArr2[lIIIlllIl[1]] = lIIIlllIl[14];
            if (lllIllIIIll(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[lIIIlllIl[0]];
            iArr3[lIIIlllIl[1]] = lIIIlllIl[8];
            if (lllIllIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
            }
            bv.add(new C0003d(lIIIlllIl[8], lIIIlllIl[66], lIIIlllIl[139]));
            "".length();
        }
        bv.add(new C0003d(lIIIlllIl[9], lIIIlllIl[13], lIIIlllIl[135]));
        "".length();
        iArr = new int[lIIIlllIl[0]];
        iArr[lIIIlllIl[1]] = lIIIlllIl[15];
        if (lllIllIIIIl(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIlllIl[15], lIIIlllIl[13], lIIIlllIl[136]));
        "".length();
        if (lllIllIIIll(Bank.contains(item22 -> {
            return item22.getName().toLowerCase().contains(lIIIllIll[lIIIlllIl[142]]);
        }) ? 1 : 0)) {
        }
        iArr2 = new int[lIIIlllIl[0]];
        iArr2[lIIIlllIl[1]] = lIIIlllIl[14];
        if (lllIllIIIll(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[lIIIlllIl[0]];
        iArr3[lIIIlllIl[1]] = lIIIlllIl[8];
        if (lllIllIIIIl(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bv.add(new C0003d(lIIIlllIl[8], lIIIlllIl[66], lIIIlllIl[139]));
        "".length();
    }

    private static boolean lllIllIIIll(int i) {
        return i == 0;
    }

    private static boolean lllIllIlIII(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public boolean V() {
        if (lllIllIIlII(C0004e.j(iI), lIIIlllIl[6])) {
            ?? r0 = lIIIlllIl[0];
            "".length();
            return ((103 ^ 0) ^ (27 ^ 120)) <= 0 ? ((95 ^ 77) ^ (108 ^ 94)) & (((182 ^ 163) ^ (31 ^ 42)) ^ (-" ".length())) : r0;
        }
        return lIIIlllIl[1];
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public String U() {
        return lIIIllIll[lIIIlllIl[141]];
    }

    private static boolean lllIllIIlll(int i) {
        return i < 0;
    }

    private static boolean lllIllIlIll(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIllIlIIl(int i, int i2) {
        return i != i2;
    }

    private static String lllIlIllIII(String lIIIllIIIllIIIl, String lIIIllIIIllIIII) {
        String str = new String(Base64.getDecoder().decode(lIIIllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIIIllIIIllIIII.toCharArray();
        int lIIIllIIIlIllIl = lIIIlllIl[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIlllIl[1];
        while (lllIllIIIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lIIIllIIIlIllIl % charArray.length]));
            "".length();
            lIIIllIIIlIllIl++;
            i++;
            "".length();
            if (((((4 + 87) - (-61)) + 16) ^ (((145 + 23) - 7) + 11)) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllIllIllII(Object obj) {
        return obj == null;
    }

    @Override // l.i.r.i.y.c.c.p000.s.e.n.p001.e.l.b.e.l.k.d.p002.c.o.a.u.e.u.p003.W
    public int T() {
        try {
            ca();
            "".length();
            if ((" ".length() & (" ".length() ^ (-1))) >= "   ".length()) {
                return (193 ^ 149) & ((86 ^ 2) ^ (-1));
            }
        } catch (Exception e) {
        }
        return lIIIlllIl[140];
    }

    private static boolean lllIllIllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllIllIIlII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static boolean ab() {
        int[] iArr = new int[lIIIlllIl[7]];
        iArr[lIIIlllIl[1]] = lIIIlllIl[8];
        iArr[lIIIlllIl[0]] = lIIIlllIl[9];
        iArr[lIIIlllIl[3]] = lIIIlllIl[10];
        iArr[lIIIlllIl[5]] = lIIIlllIl[11];
        iArr[lIIIlllIl[6]] = lIIIlllIl[12];
        int lIIIllIIlIlIIII = lIIIlllIl[1];
        while (lllIllIIIlI(lIIIllIIlIlIIII, iArr.length)) {
            int[] iArr2 = new int[lIIIlllIl[0]];
            iArr2[lIIIlllIl[1]] = iArr[lIIIllIIlIlIIII];
            if (lllIllIIIll(Inventory.contains(iArr2) ? 1 : 0)) {
                return lIIIlllIl[1];
            }
            lIIIllIIlIlIIII++;
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIIIlllIl[0];
    }

    private static boolean lllIllIIllI(int i) {
        return i > 0;
    }

    private static boolean lllIllIIIlI(int i, int i2) {
        return i < i2;
    }

    static {
        lllIlIlllll();
        lllIlIllllI();
        bv = new ArrayList();
        iI = lIIIlllIl[154];
        bX = new WorldPoint(lIIIlllIl[155], lIIIlllIl[156], lIIIlllIl[3]);
        iJ = new WorldPoint(lIIIlllIl[108], lIIIlllIl[157], lIIIlllIl[1]);
        String[] strArr = new String[lIIIlllIl[6]];
        strArr[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[158]];
        strArr[lIIIlllIl[0]] = lIIIllIll[lIIIlllIl[159]];
        strArr[lIIIlllIl[3]] = lIIIllIll[lIIIlllIl[160]];
        strArr[lIIIlllIl[5]] = lIIIllIll[lIIIlllIl[161]];
        bR = strArr;
    }

    private static boolean lllIllIlIlI(int i, int i2) {
        return i == i2;
    }

    private static int lllIllIIIII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lllIlIllIlI(String lIIIllIIIIlllII, String lIIIllIIIIllIll) {
        try {
            SecretKeySpec lIIIllIIIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIIllIIIIllIll.getBytes(StandardCharsets.UTF_8)), lIIIlllIl[20]), "DES");
            Cipher lIIIllIIIIllllI = Cipher.getInstance("DES");
            lIIIllIIIIllllI.init(lIIIlllIl[3], lIIIllIIIIlllll);
            return new String(lIIIllIIIIllllI.doFinal(Base64.getDecoder().decode(lIIIllIIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIllIIIIlllIl) {
            lIIIllIIIIlllIl.printStackTrace();
            return null;
        }
    }

    private static String lllIlIllIIl(String lIIIllIIIIIllll, String lIIIllIIIIIlllI) {
        try {
            SecretKeySpec lIIIllIIIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIIllIIIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIlllIl[3], lIIIllIIIIlIIlI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIIIllIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIIllIIIIlIIII) {
            lIIIllIIIIlIIII.printStackTrace();
            return null;
        }
    }

    private static void lllIlIlllll() {
        lIIIlllIl = new int[163];
        lIIIlllIl[0] = " ".length();
        lIIIlllIl[1] = (232 ^ 138) & ((165 ^ 199) ^ (-1));
        lIIIlllIl[2] = "   ".length() ^ (132 ^ 139);
        lIIIlllIl[3] = "  ".length();
        lIIIlllIl[4] = (-((-4233) & 28927)) & (-2050) & 31743;
        lIIIlllIl[5] = "   ".length();
        lIIIlllIl[6] = (12 ^ 38) ^ (43 ^ 5);
        lIIIlllIl[7] = (105 ^ 31) ^ (106 ^ 25);
        lIIIlllIl[8] = (-33) & 8039;
        lIIIlllIl[9] = (-((-17297) & 25527)) & (-16513) & 32751;
        lIIIlllIl[10] = (-6209) & 8173;
        lIIIlllIl[11] = (-((-7295) & 15743)) & (-35) & 9583;
        lIIIlllIl[12] = (-((-5323) & 15819)) & (-16909) & 28543;
        lIIIlllIl[13] = (((2 + 68) - (-73)) + 34) ^ (((28 + 145) - 14) + 28);
        lIIIlllIl[14] = (-((-8557) & 11119)) & (-17441) & 32627;
        lIIIlllIl[15] = (-((-483) & 30695)) & (-1) & 30591;
        lIIIlllIl[16] = " ".length() ^ (34 ^ 44);
        lIIIlllIl[17] = (((141 + 29) - 113) + 185) ^ (((31 + 183) - 46) + 24);
        lIIIlllIl[18] = 60 ^ 58;
        lIIIlllIl[19] = 66 ^ 69;
        lIIIlllIl[20] = (((113 + 49) - 16) + 11) ^ (((25 + 64) - 19) + 79);
        lIIIlllIl[21] = (-4147) & 7159;
        lIIIlllIl[22] = (-5) & 3519;
        lIIIlllIl[23] = (-20545) & 23550;
        lIIIlllIl[24] = (-((-18471) & 31287)) & (-16386) & 32703;
        lIIIlllIl[25] = (45 ^ 57) ^ (99 ^ 105);
        lIIIlllIl[26] = (((83 + 156) - 70) + 18) ^ (((59 + 174) - 228) + 170);
        lIIIlllIl[27] = (-((-141) & 28877)) & (-17) & 32255;
        lIIIlllIl[28] = 174 ^ 179;
        lIIIlllIl[29] = (((11 + 95) - 9) + 31) ^ (((143 + 130) - 252) + 126);
        lIIIlllIl[30] = (-((-10411) & 15595)) & (-24577) & 32767;
        lIIIlllIl[31] = 61 ^ 37;
        lIIIlllIl[32] = (-9263) & 12287;
        lIIIlllIl[33] = (-((-59) & 16511)) & (-2) & 19959;
        lIIIlllIl[34] = (66 ^ 37) ^ (66 ^ 44);
        lIIIlllIl[35] = (((18 + 17) - (-14)) + 82) ^ (((96 + 44) - 91) + 93);
        lIIIlllIl[36] = (-8227) & 11247;
        lIIIlllIl[37] = (-((-3887) & 32623)) & (-513) & 32758;
        lIIIlllIl[38] = 39 ^ 44;
        lIIIlllIl[39] = 183 ^ 185;
        lIIIlllIl[40] = (85 ^ 11) ^ (8 ^ 70);
        lIIIlllIl[41] = 126 ^ 111;
        lIIIlllIl[42] = " ".length() ^ (51 ^ 32);
        lIIIlllIl[43] = 188 ^ 169;
        lIIIlllIl[44] = 47 ^ 57;
        lIIIlllIl[45] = 89 ^ 78;
        lIIIlllIl[46] = 8 ^ 17;
        lIIIlllIl[47] = (-((-8005) & 32638)) & (-1025) & 28671;
        lIIIlllIl[48] = (-29187) & 32703;
        lIIIlllIl[49] = (((37 + 146) - 110) + 92) ^ (((32 + 146) - 9) + 22);
        lIIIlllIl[50] = 59 ^ 32;
        lIIIlllIl[51] = (((12 + 29) - (-2)) + 124) ^ (((135 + 5) - 53) + 100);
        lIIIlllIl[52] = (-((-3993) & 16349)) & (-16898) & 32767;
        lIIIlllIl[53] = (-((-17941) & 30263)) & (-17413) & 32751;
        lIIIlllIl[54] = 132 ^ 155;
        lIIIlllIl[55] = (-((-205) & 28925)) & (-1033) & 32767;
        lIIIlllIl[56] = (-((-3337) & 23887)) & (-1) & 24062;
        lIIIlllIl[57] = 77 ^ 109;
        lIIIlllIl[58] = (((132 + 128) - 245) + 143) ^ (((73 + 142) - 69) + 45);
        lIIIlllIl[59] = (240 ^ 128) ^ (87 ^ 5);
        lIIIlllIl[60] = (152 ^ 162) ^ (9 ^ 16);
        lIIIlllIl[61] = 169 ^ 141;
        lIIIlllIl[62] = 88 ^ 125;
        lIIIlllIl[63] = (115 ^ 65) ^ (80 ^ 68);
        lIIIlllIl[64] = (-8209) & 11231;
        lIIIlllIl[65] = 48 ^ 23;
        lIIIlllIl[66] = 73 ^ 97;
        lIIIlllIl[67] = (-((-4291) & 4811)) & (-4097) & 8127;
        lIIIlllIl[68] = 65 ^ 104;
        lIIIlllIl[69] = 157 ^ 183;
        lIIIlllIl[70] = 89 ^ 114;
        lIIIlllIl[71] = (-5170) & 8189;
        lIIIlllIl[72] = (-4609) & 8117;
        lIIIlllIl[73] = (184 ^ 155) ^ (61 ^ 50);
        lIIIlllIl[74] = (168 ^ 176) ^ (86 ^ 99);
        lIIIlllIl[75] = 117 ^ 91;
        lIIIlllIl[76] = (141 ^ 187) ^ (187 ^ 162);
        lIIIlllIl[77] = 104 ^ 88;
        lIIIlllIl[78] = 155 ^ 170;
        lIIIlllIl[79] = 32 ^ 19;
        lIIIlllIl[80] = (6 ^ 101) ^ (220 ^ 139);
        lIIIlllIl[81] = (147 ^ 140) ^ (191 ^ 149);
        lIIIlllIl[82] = (((73 + 133) - 172) + 120) ^ (((149 + 89) - 160) + 94);
        lIIIlllIl[83] = (-28682) & 31707;
        lIIIlllIl[84] = (-((-3479) & 24031)) & (-8709) & 32767;
        lIIIlllIl[85] = 102 ^ 81;
        lIIIlllIl[86] = 117 ^ 77;
        lIIIlllIl[87] = 140 ^ 181;
        lIIIlllIl[88] = (-((-617) & 18045)) & (-33) & 20479;
        lIIIlllIl[89] = (-((-197) & 29942)) & (-1) & 32767;
        lIIIlllIl[90] = (34 ^ 10) ^ (118 ^ 100);
        lIIIlllIl[91] = 4 ^ 63;
        lIIIlllIl[92] = (((44 + 166) - 168) + 147) ^ (((48 + 6) - 34) + 109);
        lIIIlllIl[93] = (((117 + 4) - 6) + 44) ^ (((49 + 105) - 66) + 74);
        lIIIlllIl[94] = (((140 + 10) - 20) + 61) ^ (((111 + 69) - 51) + 0);
        lIIIlllIl[95] = 45 ^ 18;
        lIIIlllIl[96] = 33 ^ 97;
        lIIIlllIl[97] = 133 ^ 196;
        lIIIlllIl[98] = 37 ^ 103;
        lIIIlllIl[99] = 65 ^ 2;
        lIIIlllIl[100] = 111 ^ 43;
        lIIIlllIl[101] = 208 ^ 149;
        lIIIlllIl[102] = (233 ^ 140) ^ (143 ^ 172);
        lIIIlllIl[103] = (159 ^ 187) ^ (80 ^ 51);
        lIIIlllIl[104] = 126 ^ 54;
        lIIIlllIl[105] = 32 ^ 105;
        lIIIlllIl[106] = (81 ^ 45) ^ (85 ^ 99);
        lIIIlllIl[107] = (242 ^ 189) ^ (194 ^ 198);
        lIIIlllIl[108] = (-((-18712) & 32063)) & (-1) & 16367;
        lIIIlllIl[109] = (-((-8231) & 12391)) & (-24577) & 32254;
        lIIIlllIl[110] = (((123 + 141) - 190) + 69) ^ (((146 + 64) - 84) + 69);
        lIIIlllIl[111] = 60 ^ 113;
        lIIIlllIl[112] = (82 ^ 25) ^ (30 ^ 27);
        lIIIlllIl[113] = (119 ^ 64) ^ (11 ^ 115);
        lIIIlllIl[114] = 110 ^ 62;
        lIIIlllIl[115] = (-((-27025) & 27601)) & (-24579) & 28670;
        lIIIlllIl[116] = (146 ^ 197) ^ (78 ^ 72);
        lIIIlllIl[117] = 105 ^ 59;
        lIIIlllIl[118] = (146 ^ 195) ^ "  ".length();
        lIIIlllIl[119] = (-((-610) & 22141)) & (-8193) & 32735;
        lIIIlllIl[120] = (((21 + 180) - 82) + 123) ^ (((93 + 15) - 31) + 89);
        lIIIlllIl[121] = (128 ^ 139) ^ (216 ^ 134);
        lIIIlllIl[122] = (148 ^ 165) ^ (117 ^ 18);
        lIIIlllIl[123] = 100 ^ 51;
        lIIIlllIl[124] = (-((-2697) & 7817)) & (-35) & 8183;
        lIIIlllIl[125] = 86 ^ 14;
        lIIIlllIl[126] = (101 ^ 32) ^ (25 ^ 5);
        lIIIlllIl[127] = 242 ^ 168;
        lIIIlllIl[128] = 0 ^ 91;
        lIIIlllIl[129] = (198 ^ 160) ^ (60 ^ 6);
        lIIIlllIl[130] = (193 ^ 197) ^ (114 ^ 43);
        lIIIlllIl[131] = (255 ^ 182) ^ (150 ^ 129);
        lIIIlllIl[132] = 216 ^ 135;
        lIIIlllIl[133] = (92 ^ 39) ^ (107 ^ 112);
        lIIIlllIl[134] = (-((-16385) & 22811)) & (-16386) & 32731;
        lIIIlllIl[135] = (-18536) & 20455;
        lIIIlllIl[136] = (-((-289) & 32626)) & (-131) & 32767;
        lIIIlllIl[137] = (-((-2269) & 23037)) & (-17) & 32764;
        lIIIlllIl[138] = (-((-24833) & 32083)) & (-2) & 32251;
        lIIIlllIl[139] = (-2178) & 4077;
        lIIIlllIl[140] = 62 ^ 90;
        lIIIlllIl[141] = 12 ^ 109;
        lIIIlllIl[142] = (236 ^ 136) ^ (40 ^ 46);
        lIIIlllIl[143] = 232 ^ 139;
        lIIIlllIl[144] = (71 ^ 53) ^ (7 ^ 16);
        lIIIlllIl[145] = 211 ^ 181;
        lIIIlllIl[146] = 55 ^ 80;
        lIIIlllIl[147] = (225 ^ 181) ^ (54 ^ 10);
        lIIIlllIl[148] = (119 ^ 77) ^ (211 ^ 128);
        lIIIlllIl[149] = (((211 + 13) - 31) + 30) ^ (((138 + 84) - 121) + 80);
        lIIIlllIl[150] = (233 ^ 169) ^ (172 ^ 135);
        lIIIlllIl[151] = 124 ^ 16;
        lIIIlllIl[152] = (((167 + 14) - 123) + 144) ^ (((71 + 133) - 176) + 139);
        lIIIlllIl[153] = 238 ^ 128;
        lIIIlllIl[154] = (((244 ^ 185) + (118 ^ 58)) - (((137 + 5) - 85) + 83)) + (65 ^ 52);
        lIIIlllIl[155] = (-((-17291) & 25595)) & (-21506) & 32767;
        lIIIlllIl[156] = (-((-3337) & 15803)) & (-513) & 16318;
        lIIIlllIl[157] = (-12803) & 16315;
        lIIIlllIl[158] = (((119 + 142) - 144) + 57) ^ (((93 + 158) - 245) + 187);
        lIIIlllIl[159] = (4 ^ 12) ^ (12 ^ 116);
        lIIIlllIl[160] = (17 ^ 56) ^ (11 ^ 83);
        lIIIlllIl[161] = 17 ^ 99;
        lIIIlllIl[162] = 103 ^ 20;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x05be, code lost:
        if (lllIllIIIll(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v766, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v784, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v791, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void ca() {
        if (lllIllIIIIl(bt ? 1 : 0)) {
            C0001b.a(bv);
            if (lllIllIIIlI(bv.size(), lIIIlllIl[0])) {
                System.out.println(lIIIllIll[lIIIlllIl[1]]);
                bt = lIIIlllIl[1];
            }
        }
        if (lllIllIIIll(bt ? 1 : 0)) {
            if (lllIllIIIlI(C0004e.H(), lIIIlllIl[2])) {
                System.out.println(lIIIllIll[lIIIlllIl[0]]);
                AccBuilderEasyClues.d = lIIIlllIl[0];
                return;
            }
            if (lllIllIIIll(ab() ? 1 : 0) && lllIllIIIlI(C0004e.j(iI), lIIIlllIl[0]) && lllIllIIlII(C0004e.H(), lIIIlllIl[2])) {
                BankLocation nearest = BankLocation.getNearest();
                if (lllIllIIlIl(nearest) && lllIllIIIll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[3]];
                    C0000a.a(nearest);
                }
                if (lllIllIIlIl(nearest) && lllIllIIIIl(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllIllIIIll(Bank.isOpen() ? 1 : 0)) {
                        C0000a.a();
                        Time.sleepUntil(() -> {
                            return Bank.isOpen();
                        }, lIIIlllIl[4]);
                        "".length();
                    }
                    if (lllIllIIIIl(Bank.isOpen() ? 1 : 0)) {
                        AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[5]];
                        if (lllIllIIllI(Inventory.getAll().size())) {
                            Bank.depositInventory();
                            Time.sleepTicks(lIIIlllIl[6]);
                            "".length();
                        }
                        if (lllIllIIllI(Equipment.getAll().size())) {
                            Bank.depositEquipment();
                            Time.sleepTicks(lIIIlllIl[3]);
                            "".length();
                        }
                        int[] iArr = new int[lIIIlllIl[7]];
                        iArr[lIIIlllIl[1]] = lIIIlllIl[8];
                        iArr[lIIIlllIl[0]] = lIIIlllIl[9];
                        iArr[lIIIlllIl[3]] = lIIIlllIl[10];
                        iArr[lIIIlllIl[5]] = lIIIlllIl[11];
                        iArr[lIIIlllIl[6]] = lIIIlllIl[12];
                        if (lllIllIIIll(C0004e.b(iArr) ? 1 : 0)) {
                            af();
                            System.out.println(lIIIllIll[lIIIlllIl[6]]);
                            bt = lIIIlllIl[0];
                            return;
                        }
                        int[] iArr2 = new int[lIIIlllIl[7]];
                        iArr2[lIIIlllIl[1]] = lIIIlllIl[8];
                        iArr2[lIIIlllIl[0]] = lIIIlllIl[9];
                        iArr2[lIIIlllIl[3]] = lIIIlllIl[10];
                        iArr2[lIIIlllIl[5]] = lIIIlllIl[11];
                        iArr2[lIIIlllIl[6]] = lIIIlllIl[12];
                        if (lllIllIIIIl(C0004e.b(iArr2) ? 1 : 0)) {
                            C0000a.a(lIIIlllIl[8], lIIIlllIl[13]);
                            C0000a.a(lIIIlllIl[9], lIIIlllIl[13]);
                            C0000a.a(lIIIlllIl[10], lIIIlllIl[0]);
                            C0000a.a(lIIIlllIl[11], lIIIlllIl[0]);
                            C0000a.a(lIIIlllIl[12], lIIIlllIl[0]);
                            C0000a.a(lIIIlllIl[14], lIIIlllIl[0]);
                            C0000a.a(lIIIlllIl[15], lIIIlllIl[16]);
                        }
                    }
                }
            }
            if (lllIllIIIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lllIllIIIlI(Movement.getRunEnergy(), lIIIlllIl[17])) {
                Inventory.getFirst(C0005f.aV).interact(lIIIllIll[lIIIlllIl[7]]);
                Time.sleepTicks(lIIIlllIl[0]);
                "".length();
            }
            int[] iArr3 = new int[lIIIlllIl[0]];
            iArr3[lIIIlllIl[1]] = lIIIlllIl[15];
            if (lllIllIIIIl(Inventory.contains(iArr3) ? 1 : 0) && lllIllIIlll(lllIllIIIII(C0004e.u(), 50.0d))) {
                int[] iArr4 = new int[lIIIlllIl[0]];
                iArr4[lIIIlllIl[1]] = lIIIlllIl[15];
                Inventory.getFirst(iArr4).interact(lIIIllIll[lIIIlllIl[18]]);
                Time.sleepTicks(lIIIlllIl[3]);
                "".length();
            }
            if (lllIllIIIIl(ab() ? 1 : 0) && lllIllIIIll(C0004e.j(iI))) {
                if (!lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIlllIl[7]) || lllIllIlIIl(Players.getLocal().getWorldLocation().getPlane(), lIIIlllIl[3])) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[19]];
                    if (lllIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                        Dialog.close();
                    }
                    Movement.walkTo(bX);
                    "".length();
                    Time.sleepTicks(lIIIlllIl[0]);
                    "".length();
                }
                if (lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIlllIl[7])) {
                    C0006g.a(lIIIllIll[lIIIlllIl[20]], bR);
                }
            }
            if (lllIllIlIlI(C0004e.j(iI), lIIIlllIl[0])) {
                cl = lIIIlllIl[1];
                WorldArea worldArea = new WorldArea(lIIIlllIl[21], lIIIlllIl[22], lIIIlllIl[18], lIIIlllIl[3], lIIIlllIl[1]);
                WorldArea worldArea2 = new WorldArea(lIIIlllIl[23], lIIIlllIl[24], lIIIlllIl[25], lIIIlllIl[26], lIIIlllIl[0]);
                WorldArea worldArea3 = new WorldArea(lIIIlllIl[23], lIIIlllIl[27], lIIIlllIl[28], lIIIlllIl[29], lIIIlllIl[3]);
                WorldArea worldArea4 = new WorldArea(lIIIlllIl[30], lIIIlllIl[22], lIIIlllIl[31], lIIIlllIl[18], lIIIlllIl[1]);
                WorldArea worldArea5 = new WorldArea(lIIIlllIl[32], lIIIlllIl[33], lIIIlllIl[34], lIIIlllIl[35], lIIIlllIl[1]);
                WorldArea worldArea6 = new WorldArea(lIIIlllIl[36], lIIIlllIl[37], lIIIlllIl[38], lIIIlllIl[34], lIIIlllIl[1]);
                if (lllIllIIIll(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIIIll(worldArea2.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIIIll(worldArea3.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIIIll(worldArea4.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIIIll(worldArea5.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIIIll(worldArea6.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(iJ), lIIIlllIl[3])) {
                        AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[34]];
                        C0004e.C();
                        Movement.walkTo(iJ);
                        "".length();
                        Time.sleepTicks(lIIIlllIl[0]);
                        "".length();
                    }
                    if (lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(iJ), lIIIlllIl[3])) {
                        String[] strArr = new String[lIIIlllIl[0]];
                        strArr[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[13]];
                        if (lllIllIIIIl(Equipment.contains(strArr) ? 1 : 0)) {
                            String[] strArr2 = new String[lIIIlllIl[0]];
                            strArr2[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[38]];
                        }
                        String[] strArr3 = new String[lIIIlllIl[0]];
                        strArr3[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[2]];
                        if (lllIllIIIIl(Inventory.contains(strArr3) ? 1 : 0)) {
                            String[] strArr4 = new String[lIIIlllIl[0]];
                            strArr4[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[35]];
                            Inventory.getFirst(strArr4).interact(lIIIllIll[lIIIlllIl[39]]);
                        }
                        String[] strArr5 = new String[lIIIlllIl[0]];
                        strArr5[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[16]];
                        if (lllIllIIIIl(Inventory.contains(strArr5) ? 1 : 0)) {
                            String[] strArr6 = new String[lIIIlllIl[0]];
                            strArr6[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[40]];
                            Inventory.getFirst(strArr6).interact(lIIIllIll[lIIIlllIl[41]]);
                        }
                        if (lllIllIIIIl(Inventory.contains(C0005f.aV) ? 1 : 0)) {
                            Inventory.getFirst(C0005f.aV).interact(lIIIllIll[lIIIlllIl[42]]);
                        }
                        String[] strArr7 = new String[lIIIlllIl[0]];
                        strArr7[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[29]];
                        if (lllIllIIIIl(Equipment.contains(strArr7) ? 1 : 0)) {
                            String[] strArr8 = new String[lIIIlllIl[0]];
                            strArr8[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[26]];
                            if (lllIllIIIIl(Equipment.contains(strArr8) ? 1 : 0)) {
                                String[] strArr9 = new String[lIIIlllIl[0]];
                                strArr9[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[43]];
                                TileObjects.getNearest(strArr9).interact(lIIIllIll[lIIIlllIl[44]]);
                                Time.sleepTicks(lIIIlllIl[6]);
                                "".length();
                            }
                        }
                    }
                }
                if (lllIllIIIIl(worldArea.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[45]];
                    String[] strArr10 = new String[lIIIlllIl[0]];
                    strArr10[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[31]];
                    TileObjects.getNearest(strArr10).interact(lIIIllIll[lIIIlllIl[46]]);
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                WorldArea worldArea7 = new WorldArea(lIIIlllIl[47], lIIIlllIl[48], lIIIlllIl[6], lIIIlllIl[5], lIIIlllIl[1]);
                WorldArea worldArea8 = new WorldArea(lIIIlllIl[47], lIIIlllIl[48], lIIIlllIl[6], lIIIlllIl[5], lIIIlllIl[0]);
                if (lllIllIIIIl(worldArea7.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[49]];
                    TileObjects.getNearest(tileObject -> {
                        if (lllIllIIIIl(tileObject.getName().equalsIgnoreCase(lIIIllIll[lIIIlllIl[152]]) ? 1 : 0)) {
                            String[] strArr11 = new String[lIIIlllIl[0]];
                            strArr11[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[153]];
                            if (lllIllIIIIl(tileObject.hasAction(strArr11) ? 1 : 0)) {
                                ?? r0 = lIIIlllIl[0];
                                "".length();
                                return " ".length() == "  ".length() ? ((96 ^ 16) ^ (239 ^ 138)) & (((160 ^ 199) ^ (217 ^ 171)) ^ (-" ".length())) : r0;
                            }
                        }
                        return lIIIlllIl[1];
                    }).interact(lIIIllIll[lIIIlllIl[50]]);
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                if (lllIllIIIIl(worldArea8.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[51]];
                    TileObjects.getNearest(tileObject2 -> {
                        if (lllIllIIIIl(tileObject2.getName().equalsIgnoreCase(lIIIllIll[lIIIlllIl[150]]) ? 1 : 0)) {
                            String[] strArr11 = new String[lIIIlllIl[0]];
                            strArr11[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[151]];
                            if (lllIllIIIIl(tileObject2.hasAction(strArr11) ? 1 : 0)) {
                                ?? r0 = lIIIlllIl[0];
                                "".length();
                                return (-"  ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                        return lIIIlllIl[1];
                    }).interact(lIIIllIll[lIIIlllIl[28]]);
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                WorldArea worldArea9 = new WorldArea(lIIIlllIl[21], lIIIlllIl[52], lIIIlllIl[18], lIIIlllIl[18], lIIIlllIl[3]);
                WorldPoint worldPoint = new WorldPoint(lIIIlllIl[53], lIIIlllIl[22], lIIIlllIl[3]);
                if (lllIllIIIIl(worldArea9.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[25]];
                    if (lllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIlllIl[0])) {
                        Movement.walkTo(worldPoint);
                        "".length();
                        Time.sleepTicks(lIIIlllIl[0]);
                        "".length();
                    }
                    if (lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(worldPoint), lIIIlllIl[0])) {
                        TileObjects.getNearest(tileObject3 -> {
                            if (lllIllIIIIl(tileObject3.getName().equalsIgnoreCase(lIIIllIll[lIIIlllIl[148]]) ? 1 : 0)) {
                                String[] strArr11 = new String[lIIIlllIl[0]];
                                strArr11[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[149]];
                                if (lllIllIIIIl(tileObject3.hasAction(strArr11) ? 1 : 0)) {
                                    ?? r0 = lIIIlllIl[0];
                                    "".length();
                                    return "  ".length() == 0 ? ((13 ^ 76) ^ (50 ^ 36)) & (((81 ^ 89) ^ (213 ^ 138)) ^ (-" ".length())) : r0;
                                }
                            }
                            return lIIIlllIl[1];
                        }).interact(lIIIllIll[lIIIlllIl[54]]);
                        Time.sleepTicks(lIIIlllIl[3]);
                        "".length();
                    }
                }
                if (lllIllIIIIl(new WorldArea(lIIIlllIl[55], lIIIlllIl[56], lIIIlllIl[13], lIIIlllIl[7], lIIIlllIl[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[57]];
                    String[] strArr11 = new String[lIIIlllIl[0]];
                    strArr11[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[58]];
                    TileObject nearest2 = TileObjects.getNearest(strArr11);
                    String[] strArr12 = new String[lIIIlllIl[0]];
                    strArr12[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[59]];
                    if (lllIllIIIIl(nearest2.hasAction(strArr12) ? 1 : 0)) {
                        String[] strArr13 = new String[lIIIlllIl[0]];
                        strArr13[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[60]];
                        TileObjects.getNearest(strArr13).interact(lIIIllIll[lIIIlllIl[61]]);
                        Time.sleepTicks(lIIIlllIl[5]);
                        "".length();
                    }
                    String[] strArr14 = new String[lIIIlllIl[0]];
                    strArr14[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[62]];
                    TileObject nearest3 = TileObjects.getNearest(strArr14);
                    String[] strArr15 = new String[lIIIlllIl[0]];
                    strArr15[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[63]];
                    if (lllIllIIIll(nearest3.hasAction(strArr15) ? 1 : 0)) {
                        if (lllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIl[64], lIIIlllIl[52], lIIIlllIl[0])), lIIIlllIl[3])) {
                            Movement.walkTo(new WorldPoint(lIIIlllIl[64], lIIIlllIl[52], lIIIlllIl[0]));
                            "".length();
                            Time.sleepTicks(lIIIlllIl[0]);
                            "".length();
                        }
                        if (lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIl[64], lIIIlllIl[52], lIIIlllIl[0])), lIIIlllIl[3])) {
                            String[] strArr16 = new String[lIIIlllIl[0]];
                            strArr16[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[65]];
                            TileObjects.getNearest(strArr16).interact(lIIIllIll[lIIIlllIl[66]]);
                            Time.sleepTicks(lIIIlllIl[3]);
                            "".length();
                        }
                    }
                }
                if (lllIllIIIIl(new WorldArea(lIIIlllIl[36], lIIIlllIl[67], lIIIlllIl[19], lIIIlllIl[18], lIIIlllIl[3]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[68]];
                    if (lllIllIlIll(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIl[32], lIIIlllIl[52], lIIIlllIl[3])), lIIIlllIl[0])) {
                        Movement.walkTo(new WorldPoint(lIIIlllIl[32], lIIIlllIl[52], lIIIlllIl[3]));
                        "".length();
                        Time.sleepTicks(lIIIlllIl[0]);
                        "".length();
                    }
                    if (lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(lIIIlllIl[32], lIIIlllIl[52], lIIIlllIl[3])), lIIIlllIl[0])) {
                        String[] strArr17 = new String[lIIIlllIl[0]];
                        strArr17[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[69]];
                        TileObjects.getNearest(strArr17).interact(lIIIllIll[lIIIlllIl[70]]);
                        Time.sleepTicks(lIIIlllIl[5]);
                        "".length();
                    }
                }
                WorldArea worldArea10 = new WorldArea(lIIIlllIl[32], lIIIlllIl[37], lIIIlllIl[7], lIIIlllIl[19], lIIIlllIl[0]);
                WorldArea worldArea11 = new WorldArea(lIIIlllIl[71], lIIIlllIl[72], lIIIlllIl[19], lIIIlllIl[6], lIIIlllIl[0]);
                WorldArea worldArea12 = new WorldArea(lIIIlllIl[71], lIIIlllIl[33], lIIIlllIl[18], lIIIlllIl[19], lIIIlllIl[0]);
                if (lllIllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[32], lIIIlllIl[52], lIIIlllIl[0])) ? 1 : 0)) {
                    String[] strArr18 = new String[lIIIlllIl[0]];
                    strArr18[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[73]];
                    TileObject nearest4 = TileObjects.getNearest(strArr18);
                    String[] strArr19 = new String[lIIIlllIl[0]];
                    strArr19[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[74]];
                    if (lllIllIIIIl(nearest4.hasAction(strArr19) ? 1 : 0)) {
                        String[] strArr20 = new String[lIIIlllIl[0]];
                        strArr20[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[75]];
                        TileObjects.getNearest(strArr20).interact(lIIIllIll[lIIIlllIl[76]]);
                        Time.sleepTicks(lIIIlllIl[5]);
                        "".length();
                    }
                }
                if (!lllIllIIIll(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIllIIIIl(worldArea10.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllIllIIIIl(worldArea11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        String[] strArr21 = new String[lIIIlllIl[0]];
                        strArr21[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[77]];
                        TileObject nearest5 = TileObjects.getNearest(strArr21);
                        String[] strArr22 = new String[lIIIlllIl[0]];
                        strArr22[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[78]];
                        if (lllIllIIIIl(nearest5.hasAction(strArr22) ? 1 : 0)) {
                            String[] strArr23 = new String[lIIIlllIl[0]];
                            strArr23[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[17]];
                            TileObjects.getNearest(strArr23).interact(lIIIllIll[lIIIlllIl[79]]);
                            Time.sleepTicks(lIIIlllIl[5]);
                            "".length();
                        }
                    }
                    if (lllIllIIIIl(worldArea12.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                        TileObjects.getNearest(tileObject4 -> {
                            if (lllIllIIIIl(tileObject4.getName().equalsIgnoreCase(lIIIllIll[lIIIlllIl[146]]) ? 1 : 0)) {
                                String[] strArr24 = new String[lIIIlllIl[0]];
                                strArr24[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[147]];
                                if (lllIllIIIIl(tileObject4.hasAction(strArr24) ? 1 : 0)) {
                                    ?? r0 = lIIIlllIl[0];
                                    "".length();
                                    return 0 != 0 ? ((132 ^ 199) ^ (211 ^ 176)) & (((68 ^ 14) ^ (235 ^ 129)) ^ (-" ".length())) : r0;
                                }
                            }
                            return lIIIlllIl[1];
                        }).interact(lIIIllIll[lIIIlllIl[80]]);
                        Time.sleepTicks(lIIIlllIl[5]);
                        "".length();
                    }
                }
                WorldArea worldArea13 = new WorldArea(lIIIlllIl[71], lIIIlllIl[37], lIIIlllIl[19], lIIIlllIl[0], lIIIlllIl[1]);
                WorldArea worldArea14 = new WorldArea(lIIIlllIl[32], lIIIlllIl[33], lIIIlllIl[3], lIIIlllIl[7], lIIIlllIl[1]);
                if (!lllIllIIIll(worldArea13.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIllIIIIl(worldArea14.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllIllIIIll(Dialog.isOpen() ? 1 : 0)) {
                        String[] strArr24 = new String[lIIIlllIl[0]];
                        strArr24[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[81]];
                        TileObjects.getNearest(strArr24).interact(lIIIllIll[lIIIlllIl[82]]);
                        Time.sleepTicks(lIIIlllIl[5]);
                        "".length();
                    }
                    C0006g.a(bR);
                }
            }
            if (lllIllIlIlI(C0004e.j(iI), lIIIlllIl[3])) {
                if (lllIllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[83], lIIIlllIl[84], lIIIlllIl[1])) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[85]];
                    String[] strArr25 = new String[lIIIlllIl[0]];
                    strArr25[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[86]];
                    TileObjects.getNearest(strArr25).interact(lIIIllIll[lIIIlllIl[87]]);
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                WorldArea worldArea15 = new WorldArea(lIIIlllIl[88], lIIIlllIl[72], lIIIlllIl[18], lIIIlllIl[6], lIIIlllIl[0]);
                WorldPoint worldPoint2 = new WorldPoint(lIIIlllIl[32], lIIIlllIl[67], lIIIlllIl[0]);
                WorldPoint worldPoint3 = new WorldPoint(lIIIlllIl[32], lIIIlllIl[37], lIIIlllIl[0]);
                WorldPoint worldPoint4 = new WorldPoint(lIIIlllIl[32], lIIIlllIl[56], lIIIlllIl[0]);
                if (!lllIllIIIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[89], lIIIlllIl[37], lIIIlllIl[0])) ? 1 : 0) || !lllIllIIIll(worldArea15.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || !lllIllIIIll(Players.getLocal().getWorldLocation().equals(worldPoint2) ? 1 : 0) || !lllIllIIIll(Players.getLocal().getWorldLocation().equals(worldPoint3) ? 1 : 0) || lllIllIIIIl(Players.getLocal().getWorldLocation().equals(worldPoint4) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[90]];
                    String[] strArr26 = new String[lIIIlllIl[0]];
                    strArr26[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[91]];
                    TileObjects.getNearest(strArr26).interact(lIIIllIll[lIIIlllIl[92]]);
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                if (lllIllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[83], lIIIlllIl[67], lIIIlllIl[0])) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[93]];
                    Time.sleepTicks(lIIIlllIl[5]);
                    "".length();
                    String[] strArr27 = new String[lIIIlllIl[0]];
                    strArr27[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[94]];
                    TileObjects.getNearest(strArr27).interact(lIIIllIll[lIIIlllIl[95]]);
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                if (lllIllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[32], lIIIlllIl[52], lIIIlllIl[3])) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[96]];
                    Movement.walkTo(new WorldPoint(lIIIlllIl[64], lIIIlllIl[52], lIIIlllIl[3]));
                    "".length();
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                if (lllIllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[64], lIIIlllIl[52], lIIIlllIl[3])) ? 1 : 0)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[97]];
                    String[] strArr28 = new String[lIIIlllIl[0]];
                    strArr28[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[98]];
                    TileObjects.getNearest(strArr28).interact(lIIIllIll[lIIIlllIl[99]]);
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                if (lllIllIIIIl(new WorldArea(lIIIlllIl[55], lIIIlllIl[56], lIIIlllIl[13], lIIIlllIl[7], lIIIlllIl[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr29 = new String[lIIIlllIl[0]];
                    strArr29[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[100]];
                    TileObject nearest6 = TileObjects.getNearest(strArr29);
                    String[] strArr30 = new String[lIIIlllIl[0]];
                    strArr30[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[101]];
                    if (lllIllIIIIl(nearest6.hasAction(strArr30) ? 1 : 0)) {
                        String[] strArr31 = new String[lIIIlllIl[0]];
                        strArr31[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[102]];
                        TileObjects.getNearest(strArr31).interact(lIIIllIll[lIIIlllIl[103]]);
                        Time.sleepTicks(lIIIlllIl[3]);
                        "".length();
                    }
                    String[] strArr32 = new String[lIIIlllIl[0]];
                    strArr32[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[104]];
                    TileObject nearest7 = TileObjects.getNearest(strArr32);
                    String[] strArr33 = new String[lIIIlllIl[0]];
                    strArr33[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[105]];
                    if (lllIllIIIll(nearest7.hasAction(strArr33) ? 1 : 0)) {
                        if (lllIllIIIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[53], lIIIlllIl[22], lIIIlllIl[0])) ? 1 : 0)) {
                            Movement.walkTo(new WorldPoint(lIIIlllIl[53], lIIIlllIl[22], lIIIlllIl[0]));
                            "".length();
                            Time.sleepTicks(lIIIlllIl[0]);
                            "".length();
                        }
                        if (lllIllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[53], lIIIlllIl[22], lIIIlllIl[0])) ? 1 : 0)) {
                            String[] strArr34 = new String[lIIIlllIl[0]];
                            strArr34[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[106]];
                            TileObjects.getNearest(strArr34).interact(lIIIllIll[lIIIlllIl[107]]);
                            Time.sleepTicks(lIIIlllIl[3]);
                            "".length();
                        }
                    }
                }
                if (lllIllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[53], lIIIlllIl[22], lIIIlllIl[3])) ? 1 : 0)) {
                    Movement.walkTo(lIIIlllIl[108], lIIIlllIl[109], lIIIlllIl[3]);
                    "".length();
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                if (lllIllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[108], lIIIlllIl[109], lIIIlllIl[3])) ? 1 : 0)) {
                    String[] strArr35 = new String[lIIIlllIl[0]];
                    strArr35[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[110]];
                    TileObjects.getNearest(strArr35).interact(lIIIllIll[lIIIlllIl[111]]);
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                if (lllIllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[108], lIIIlllIl[109], lIIIlllIl[0])) ? 1 : 0)) {
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                    TileObjects.getNearest(tileObject5 -> {
                        if (lllIllIIIIl(tileObject5.getName().equalsIgnoreCase(lIIIllIll[lIIIlllIl[144]]) ? 1 : 0)) {
                            String[] strArr36 = new String[lIIIlllIl[0]];
                            strArr36[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[145]];
                            if (lllIllIIIIl(tileObject5.hasAction(strArr36) ? 1 : 0)) {
                                ?? r0 = lIIIlllIl[0];
                                "".length();
                                return (-(109 ^ 104)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                        }
                        return lIIIlllIl[1];
                    }).interact(lIIIllIll[lIIIlllIl[112]]);
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                if (lllIllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[55], lIIIlllIl[109], lIIIlllIl[1])) ? 1 : 0)) {
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                    String[] strArr36 = new String[lIIIlllIl[0]];
                    strArr36[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[113]];
                    TileObjects.getNearest(strArr36).interact(lIIIllIll[lIIIlllIl[114]]);
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                if (lllIllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[108], lIIIlllIl[115], lIIIlllIl[1])) ? 1 : 0)) {
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                    String[] strArr37 = new String[lIIIlllIl[0]];
                    strArr37[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[116]];
                    TileObjects.getNearest(strArr37).interact(lIIIllIll[lIIIlllIl[117]]);
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                WorldArea worldArea16 = new WorldArea(lIIIlllIl[30], lIIIlllIl[22], lIIIlllIl[35], lIIIlllIl[3], lIIIlllIl[1]);
                NPC nearest8 = NPCs.getNearest(npc -> {
                    if (lllIllIIIIl(npc.getName().contains(lIIIllIll[lIIIlllIl[140]]) ? 1 : 0) && lllIllIlIII(npc.getWorldLocation().distanceTo(new WorldPoint(lIIIlllIl[88], lIIIlllIl[22], lIIIlllIl[1])), lIIIlllIl[0]) && lllIllIllIl(npc.getInteracting(), Players.getLocal())) {
                        ?? r0 = lIIIlllIl[0];
                        "".length();
                        return ((132 ^ 176) & ((159 ^ 171) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIlllIl[1];
                });
                if (lllIllIIIIl(worldArea16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIIlIl(nearest8)) {
                    AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[118]];
                    C0004e.c(new WorldPoint(lIIIlllIl[119], lIIIlllIl[22], lIIIlllIl[1]));
                    Time.sleepTicks(lIIIlllIl[34]);
                    "".length();
                }
                if (!lllIllIIIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[88], lIIIlllIl[22], lIIIlllIl[1])) ? 1 : 0) || lllIllIIIIl(worldArea16.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    NPC nearest9 = NPCs.getNearest(npc2 -> {
                        if (lllIllIIIIl(npc2.getName().contains(lIIIllIll[lIIIlllIl[143]]) ? 1 : 0) && lllIllIlIII(npc2.getWorldLocation().distanceTo(new WorldPoint(lIIIlllIl[88], lIIIlllIl[22], lIIIlllIl[1])), lIIIlllIl[3]) && lllIllIllIl(npc2.getInteracting(), Players.getLocal())) {
                            ?? r0 = lIIIlllIl[0];
                            "".length();
                            return (-((115 ^ 15) ^ (42 ^ 83))) >= 0 ? ((208 ^ 166) ^ (101 ^ 8)) & (("   ".length() ^ (84 ^ 76)) ^ (-" ".length())) : r0;
                        }
                        return lIIIlllIl[1];
                    });
                    if (lllIllIIIll(Dialog.isOpen() ? 1 : 0) && lllIllIllII(nearest9)) {
                        String[] strArr38 = new String[lIIIlllIl[0]];
                        strArr38[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[120]];
                        TileObjects.getNearest(strArr38).interact(lIIIllIll[lIIIlllIl[121]]);
                        Time.sleepTicks(lIIIlllIl[0]);
                        "".length();
                    }
                    while (lllIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                        C0006g.a(bR);
                        Time.sleep(50L);
                        "".length();
                        "".length();
                        if ((true ^ true) & ((true ^ true) ^ true)) {
                            return;
                        }
                    }
                }
                if (lllIllIIIIl(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[71], lIIIlllIl[22], lIIIlllIl[1])) ? 1 : 0)) {
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                    String[] strArr39 = new String[lIIIlllIl[0]];
                    strArr39[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[122]];
                    TileObjects.getNearest(strArr39).interact(lIIIllIll[lIIIlllIl[123]]);
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                WorldArea worldArea17 = new WorldArea(lIIIlllIl[89], lIIIlllIl[48], lIIIlllIl[38], lIIIlllIl[5], lIIIlllIl[0]);
                WorldArea worldArea18 = new WorldArea(lIIIlllIl[124], lIIIlllIl[67], lIIIlllIl[6], lIIIlllIl[34], lIIIlllIl[0]);
                if (!lllIllIIIll(Players.getLocal().getWorldLocation().equals(new WorldPoint(lIIIlllIl[89], lIIIlllIl[48], lIIIlllIl[0])) ? 1 : 0) || !lllIllIIIll(worldArea17.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lllIllIIIIl(worldArea18.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (lllIllIIIIl(Inventory.contains(C0005f.aV) ? 1 : 0) && lllIllIIIlI(Movement.getRunEnergy(), lIIIlllIl[97])) {
                        Inventory.getFirst(C0005f.aV).interact(lIIIllIll[lIIIlllIl[125]]);
                        Time.sleepTicks(lIIIlllIl[3]);
                        "".length();
                    }
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                    String[] strArr40 = new String[lIIIlllIl[0]];
                    strArr40[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[126]];
                    TileObjects.getNearest(strArr40).interact(lIIIllIll[lIIIlllIl[127]]);
                    Time.sleepTicks(lIIIlllIl[3]);
                    "".length();
                }
                if (lllIllIIIIl(new WorldArea(lIIIlllIl[32], lIIIlllIl[27], lIIIlllIl[34], lIIIlllIl[19], lIIIlllIl[0]).contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lllIllIIIll(Dialog.isOpen() ? 1 : 0)) {
                    String[] strArr41 = new String[lIIIlllIl[0]];
                    strArr41[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[128]];
                    if (lllIllIIIIl(Inventory.contains(strArr41) ? 1 : 0) && lllIllIIIll(Players.getLocal().isMoving() ? 1 : 0)) {
                        String[] strArr42 = new String[lIIIlllIl[0]];
                        strArr42[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[129]];
                        Item first = Inventory.getFirst(strArr42);
                        String[] strArr43 = new String[lIIIlllIl[0]];
                        strArr43[lIIIlllIl[1]] = lIIIllIll[lIIIlllIl[130]];
                        first.useOn(TileObjects.getNearest(strArr43));
                        Time.sleepTicks(lIIIlllIl[3]);
                        "".length();
                    }
                }
                C0006g.a(bR);
            }
            if (lllIllIlIlI(C0004e.j(iI), lIIIlllIl[5])) {
                WorldArea worldArea19 = new WorldArea(lIIIlllIl[32], lIIIlllIl[27], lIIIlllIl[34], lIIIlllIl[19], lIIIlllIl[0]);
                if (lllIllIIIIl(worldArea19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr5 = new int[lIIIlllIl[0]];
                    iArr5[lIIIlllIl[1]] = lIIIlllIl[9];
                    Inventory.getFirst(iArr5).interact(lIIIllIll[lIIIlllIl[131]]);
                    Time.sleepTicks(lIIIlllIl[7]);
                    "".length();
                }
                if (lllIllIIIll(worldArea19.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    if (!lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIlllIl[7]) || lllIllIlIIl(Players.getLocal().getWorldLocation().getPlane(), lIIIlllIl[3])) {
                        AccBuilderEasyClues.c = lIIIllIll[lIIIlllIl[132]];
                        if (lllIllIIIIl(Dialog.isOpen() ? 1 : 0)) {
                            Dialog.close();
                        }
                        C0004e.D();
                        Movement.walkTo(bX);
                        "".length();
                        Time.sleepTicks(lIIIlllIl[0]);
                        "".length();
                    }
                    if (lllIllIlIII(Players.getLocal().getWorldLocation().distanceTo(bX), lIIIlllIl[7])) {
                        if (lllIllIIIlI(cl, lIIIlllIl[0])) {
                            an.pS += lIIIlllIl[0];
                            an.o(AccBuilderEasyClues.m);
                            cl += lIIIlllIl[0];
                            an.pS = lIIIlllIl[1];
                            cm = lIIIlllIl[1];
                        }
                        C0006g.a(lIIIllIll[lIIIlllIl[133]], bR);
                    }
                }
            }
            C0006g.a(new String[lIIIlllIl[1]]);
        }
    }

    private static boolean lllIllIIIIl(int i) {
        return i != 0;
    }
}
