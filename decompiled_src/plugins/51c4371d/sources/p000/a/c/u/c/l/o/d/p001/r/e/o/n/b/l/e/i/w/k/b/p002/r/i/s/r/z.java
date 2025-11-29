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
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: -.a.c.u.c.l.o.d.-.r.e.o.n.b.l.e.i.w.k.b.-.r.i.s.r.z  reason: invalid package */
/* loaded from: 51c4371d-854c-4c1b-8841-207ed7d6bdc3.jar:-/a/c/u/c/l/o/d/-/r/e/o/n/b/l/e/i/w/k/b/-/r/i/s/r/z.class */
public class z implements F {
    private static final /* synthetic */ int hD;
    public static final /* synthetic */ WorldArea gK;
    private static final /* synthetic */ WorldArea hv;
    private static /* synthetic */ int[] hJ;
    static /* synthetic */ String hI;
    private static final /* synthetic */ int hw;
    private static final /* synthetic */ WorldPoint hh;
    static /* synthetic */ boolean cj;
    private static final /* synthetic */ WorldArea ht;
    public static final /* synthetic */ WorldArea gL;
    private static final /* synthetic */ int hA;
    public static /* synthetic */ int hH;
    static /* synthetic */ String[] gx;
    private static final /* synthetic */ WorldPoint hq;
    private static final /* synthetic */ int hy;
    public static final /* synthetic */ WorldPoint gG;
    private static final /* synthetic */ int hF;
    static /* synthetic */ int ci;
    private static final /* synthetic */ WorldPoint hf;
    private static final /* synthetic */ int gT;
    public static final /* synthetic */ WorldPoint gF;
    public static /* synthetic */ int hG;
    public static final /* synthetic */ WorldArea gI;
    private static final /* synthetic */ WorldPoint hd;
    private static final /* synthetic */ WorldPoint hk;
    private static final /* synthetic */ int ha;
    private static final /* synthetic */ WorldPoint hl;
    private static final /* synthetic */ int hE;
    public static final /* synthetic */ WorldArea gO;
    private static final /* synthetic */ int hC;
    public static final /* synthetic */ WorldPoint gH;
    private static final /* synthetic */ int gV;
    private static final /* synthetic */ int gW;
    public static final /* synthetic */ WorldArea gM;
    public static final /* synthetic */ WorldArea gN;
    private static final /* synthetic */ WorldPoint hj;
    public static final /* synthetic */ WorldArea gP;
    private static final /* synthetic */ WorldPoint hm;
    private static final /* synthetic */ int gU;
    private static final /* synthetic */ int gQ;
    private static final /* synthetic */ WorldPoint hn;
    private static /* synthetic */ String[] lllllIll;
    private static final /* synthetic */ int hc;
    private static final /* synthetic */ WorldArea hu;
    public static final /* synthetic */ WorldArea gJ;
    private static final /* synthetic */ int hB;
    private static final /* synthetic */ int gY;
    private static final /* synthetic */ WorldPoint hs;
    private static final /* synthetic */ WorldPoint he;
    private static final /* synthetic */ int gR;
    private static final /* synthetic */ WorldPoint hi;
    public static /* synthetic */ boolean bz;
    private static /* synthetic */ int[] llllllII;
    private static final /* synthetic */ WorldPoint ho;
    private static final /* synthetic */ WorldPoint hp;
    public static /* synthetic */ List<C0003d> bB;
    private static final /* synthetic */ int gZ;
    private static final /* synthetic */ WorldPoint hg;
    private static final /* synthetic */ int gS;
    private static final /* synthetic */ int hb;
    private static final /* synthetic */ int hz;
    private static final /* synthetic */ int gX;
    private static final /* synthetic */ WorldPoint hr;
    private static final /* synthetic */ int hx;

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public int U() {
        bs();
        return llllllII[109];
    }

    private static void llIlIIIIIll() {
        lllllIll = new String[llllllII[174]];
        lllllIll[llllllII[4]] = llIlIIIIIII("1ILHkppqMJ8ECq3cVOyBfg==", "wLcIi");
        lllllIll[llllllII[3]] = llIlIIIIIIl("Nhw6AAMYEDBJEgUMPQcXUBwgDB0DWXQaBxkBNwEZHhJ0CxETHnQdH1AEIQwDBBw6Dg==", "puTip");
        lllllIll[llllllII[1]] = llIlIIIIIlI("GnNS9YUNYObcOWH4D+yD4Q==", "YfIls");
        lllllIll[llllllII[12]] = llIlIIIIIII("dGsJ6O9VA6w=", "aEUkv");
        lllllIll[llllllII[15]] = llIlIIIIIlI("ytYld0GHJrDAbMl23FC/Uw==", "UcjBi");
        lllllIll[llllllII[13]] = llIlIIIIIlI("o4Rd9llC5sI=", "MSZnu");
        lllllIll[llllllII[14]] = llIlIIIIIII("NUrF6YNo1VE=", "QjIRS");
        lllllIll[llllllII[18]] = llIlIIIIIlI("dczG55qEGgXs0ZOVhDFBKuHyjXLw4ZoUHrh2f53HVLo=", "FabIp");
        lllllIll[llllllII[20]] = llIlIIIIIIl("BRkXAg==", "AkxrC");
        lllllIll[llllllII[21]] = llIlIIIIIIl("Fg0WIAksFxRhDiAA", "EysAe");
        lllllIll[llllllII[22]] = llIlIIIIIII("9giKuBp6nrogjNZaEBqEpg==", "yuzHb");
        lllllIll[llllllII[24]] = llIlIIIIIIl("KCw4NRsFNjM=", "kCVAr");
        lllllIll[llllllII[25]] = llIlIIIIIIl("BhcuNA==", "hbBXN");
        lllllIll[llllllII[26]] = llIlIIIIIII("HrIf9SZMrzk=", "YZzoz");
        lllllIll[llllllII[27]] = llIlIIIIIII("8ouaEKbLC0MDrFzwE7sUZTthDNvSy6Eb", "NddpQ");
        lllllIll[llllllII[28]] = llIlIIIIIlI("4/0qP17w5E9ES2Ta/jtumUDyvijmd8hV", "gPQhi");
        lllllIll[llllllII[29]] = llIlIIIIIIl("JCAjEjwGJzc=", "gUSpS");
        lllllIll[llllllII[30]] = llIlIIIIIII("g/kAe6dvDEvhqDMONsGBNA==", "RtRNL");
        lllllIll[llllllII[31]] = llIlIIIIIIl("KjwpBg==", "nNFvd");
        lllllIll[llllllII[32]] = llIlIIIIIIl("Ox4LIw==", "tnnMZ");
        lllllIll[llllllII[33]] = llIlIIIIIlI("n8/fvGCZ9g4=", "UOnGz");
        lllllIll[llllllII[34]] = llIlIIIIIII("PcAr2l9Yc7M=", "nmWnQ");
        lllllIll[llllllII[35]] = llIlIIIIIlI("yNzaIxTqd5c=", "CtAoZ");
        lllllIll[llllllII[36]] = llIlIIIIIII("9QEUulMYnKpQiNuLIVTxOg==", "uqEBm");
        lllllIll[llllllII[37]] = llIlIIIIIII("4TcdpfEF06Y=", "pZoEt");
        lllllIll[llllllII[38]] = llIlIIIIIIl("cQ==", "QYLBy");
        lllllIll[llllllII[40]] = llIlIIIIIII("91gMg+S0JJ102jPL9/kSYY2SZy7LzGJn", "dPiwO");
        lllllIll[llllllII[41]] = llIlIIIIIlI("mjlO7Nm/o9ShGa3Em5PXCw==", "TFxQk");
        lllllIll[llllllII[42]] = llIlIIIIIIl("EysaAQIgahwJCykvBQ==", "GJqhl");
        lllllIll[llllllII[43]] = llIlIIIIIII("Y4BNaURdqMk=", "WIfDL");
        lllllIll[llllllII[44]] = llIlIIIIIII("Bb2cnk3F8AE=", "yOaHN");
        lllllIll[llllllII[45]] = llIlIIIIIlI("SUQOBKA1dds=", "gcOhB");
        lllllIll[llllllII[46]] = llIlIIIIIlI("5c19LDjnN/I=", "xtufm");
        lllllIll[llllllII[47]] = llIlIIIIIII("bLHiyOz/Xiq8deh3BLbv8w==", "RZide");
        lllllIll[llllllII[48]] = llIlIIIIIIl("GCcYOQ==", "vRtUX");
        lllllIll[llllllII[49]] = llIlIIIIIIl("cg==", "RkdoI");
        lllllIll[llllllII[50]] = llIlIIIIIlI("s8kVU6EfkxXZZ9MWstyZwn7SupAIeBO4", "EYCbK");
        lllllIll[llllllII[51]] = llIlIIIIIII("ctPGw84AibHboXevPTCn7w==", "gFNLf");
        lllllIll[llllllII[52]] = llIlIIIIIII("hXLa9tQTONY=", "RoHyQ");
        lllllIll[llllllII[53]] = llIlIIIIIIl("DwU6BjN6FTsNMSkT", "ZvShT");
        lllllIll[llllllII[54]] = llIlIIIIIII("n8Si9pDs3iM=", "grsza");
        lllllIll[llllllII[55]] = llIlIIIIIIl("BistDjsg", "ECHkH");
        lllllIll[llllllII[56]] = llIlIIIIIlI("dSg7eb0kf7wyrqxIucYrgw==", "vaIVI");
        lllllIll[llllllII[57]] = llIlIIIIIlI("Ks6D8MhWz4ToJyOBObwl4Q==", "fnvIa");
        lllllIll[llllllII[61]] = llIlIIIIIlI("BIvsWmVl70NQMDbK1Jx/uBoxxlB0tzZ5", "DWrfN");
        lllllIll[llllllII[63]] = llIlIIIIIlI("EcuVndPVKCI=", "tpkwp");
        lllllIll[llllllII[64]] = llIlIIIIIII("VgXZf3enAPmu1tmALzFEXw==", "WIMxm");
        lllllIll[llllllII[65]] = llIlIIIIIII("VrJka3mJw9/QKDRuqA2fAgS45HS/IKfV", "vAQhl");
        lllllIll[llllllII[66]] = llIlIIIIIlI("NZarUYRzzWk=", "ZcADP");
        lllllIll[llllllII[67]] = llIlIIIIIII("XK0gzW4YXsc6eEdT2pV1zw==", "gmQyd");
        lllllIll[llllllII[68]] = llIlIIIIIII("1TrvEKZg2WTeFxm/o0gg8A==", "Lhffa");
        lllllIll[llllllII[69]] = llIlIIIIIIl("KgsRJEMeFw0k", "lbcAc");
        lllllIll[llllllII[70]] = llIlIIIIIIl("Kg8UBg==", "hnxjo");
        lllllIll[llllllII[71]] = llIlIIIIIlI("lOsEo6IPXfI=", "MDAnv");
        lllllIll[llllllII[72]] = llIlIIIIIlI("tB7G0x6ki25iV33zH5Sr1g==", "BfwSV");
        lllllIll[llllllII[73]] = llIlIIIIIlI("A+4UeN1ZvZA=", "qIvbS");
        lllllIll[llllllII[74]] = llIlIIIIIlI("/38Ac6P5moQ=", "sficj");
        lllllIll[llllllII[75]] = llIlIIIIIIl("EDk8JC47JT5lMTMp", "RKYEE");
        lllllIll[llllllII[76]] = llIlIIIIIII("PgUG5GFNHQ4=", "cALYl");
        lllllIll[llllllII[77]] = llIlIIIIIlI("cfNacTe2LMGZWA24syS2auec7FX1XwDR", "JxQpi");
        lllllIll[llllllII[78]] = llIlIIIIIIl("Ng0WIBEMH0QnFkIJESsLFg==", "bxdNx");
        lllllIll[llllllII[79]] = llIlIIIIIlI("2BOZ41OcKZw=", "blwbH");
        lllllIll[llllllII[80]] = llIlIIIIIII("uGC2puYkhHE=", "TBVLR");
        lllllIll[llllllII[81]] = llIlIIIIIII("hUsIJYa1ISKEbvvx5dMmRg==", "XZNql");
        lllllIll[llllllII[83]] = llIlIIIIIlI("9nP1I58dh3dz1DY721SpHy/Wt2W4AGqY", "WTsZR");
        lllllIll[llllllII[84]] = llIlIIIIIIl("IRshWgUAWiQfEgAUM1oCHxUj", "ozWzq");
        lllllIll[llllllII[85]] = llIlIIIIIlI("6X3wLjaBcZvfilHsyeZWbZ0kwQ2VQAGv", "iKNoW");
        lllllIll[llllllII[86]] = llIlIIIIIIl("Fg89bDU3Ti0jNDYaKiUv", "XnKLA");
        lllllIll[llllllII[87]] = llIlIIIIIlI("+HmjOS0iORcI9z7MO/es8g==", "NPohN");
        lllllIll[llllllII[88]] = llIlIIIIIIl("IBgjDBoHHjg=", "fwVbn");
        lllllIll[llllllII[89]] = llIlIIIIIlI("fM9gzYWspmE=", "LpziK");
        lllllIll[llllllII[90]] = llIlIIIIIII("Bj5amMhsHnJGeu0CuggdpA==", "NTuCl");
        lllllIll[llllllII[91]] = llIlIIIIIIl("Hg0+Gg==", "pxRvc");
        lllllIll[llllllII[92]] = llIlIIIIIII("WPEryGDTWi8=", "GDVYf");
        lllllIll[llllllII[95]] = llIlIIIIIIl("Jg8GdRgJDRt1DgcZESceSAMRLx8=", "hnpUz");
        lllllIll[llllllII[96]] = llIlIIIIIlI("GysCZ8IQNvCOnC6iTTHfrran/SIonY/X", "GcWzq");
        lllllIll[llllllII[97]] = llIlIIIIIII("nQgSatBxpXtB9Xi65LdOu6lSc77ouWT/", "suEij");
        lllllIll[llllllII[98]] = llIlIIIIIlI("mZ7TvhIBx9HPplULqCEImg==", "GxvOj");
        lllllIll[llllllII[100]] = llIlIIIIIII("SNJYTYqjqxGIA+ung5IG4NffI1Syl2Ga", "fsFUB");
        lllllIll[llllllII[102]] = llIlIIIIIIl("GQJCDAcrRw8EBj0ODApVPRISHRknAhFBVT0QCxkWJg4MClU6CEIvIBcuLCo=", "Ngbmu");
        lllllIll[llllllII[16]] = llIlIIIIIlI("1beaGb+tMGK5h6psD5/kfx/a+PwvWuFWAYVFUW9F8vmmQPRaQ1k9NRNiXqA85XEW", "CSmcv");
        lllllIll[llllllII[103]] = llIlIIIIIII("N6LH+Y+YL1MwjHXG9QTRJtKU3JMjkBrpCH0DQrFCSWWoq29mdGRNVLZs6l5CMMp/", "qyfVM");
        lllllIll[llllllII[104]] = llIlIIIIIII("RRLxQp5ywQq9upEQsKWfCzpbvGArKolHkp80MfaYH86qaTpFrmvUZl9sjo0e6uqO", "OvxfJ");
        lllllIll[llllllII[106]] = llIlIIIIIIl("ESRvCSMjYSIBIjUoIQ9xNTQ/GD0vJDxEcTU2JhwyLighD3EyLm8qBB8IAS8=", "FAOhQ");
        lllllIll[llllllII[116]] = llIlIIIIIIl("PwwuGgwNFnoxCx0WP1kVHQApDQ==", "heZyd");
        lllllIll[llllllII[117]] = llIlIIIIIlI("hnxSlSp6MAqVjQuOGRnnLd3VhfnyyMlI", "dohid");
        lllllIll[llllllII[163]] = llIlIIIIIII("ild5wcM2oiKJX6/ugO/+Zg==", "zMqcK");
        lllllIll[llllllII[164]] = llIlIIIIIII("2mW6sVOzwm3GqaAx8pEvs3A3KJzReXeB", "LHIBW");
        lllllIll[llllllII[165]] = llIlIIIIIIl("JW0nKFMYODJq", "lJKDs");
        lllllIll[llllllII[166]] = llIlIIIIIIl("Ci4/Hi4nITJHbwJtIAUgPG08Ayo5KGsfIGsrIgUrazkjAjxrPj8eKS1j", "KMKkO");
        lllllIll[llllllII[167]] = llIlIIIIIlI("14tisYUoxsQ=", "xGYpR");
        lllllIll[llllllII[168]] = llIlIIIIIIl("FCcSPUYwbwchBGMiEj0VJj1M", "COsIa");
        lllllIll[llllllII[169]] = llIlIIIIIlI("1+AyUvXWtYdzXDghMDBHPGzXUUd1drkAOw7lCYyYUic=", "tdHhc");
    }

    private static boolean llIlIIIIlIl(int i, int i2) {
        return i < i2;
    }

    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public String V() {
        return lllllIll[llllllII[116]];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean W() {
        if (llIlIIIllIl(C0004e.j(llllllII[2]), llllllII[18])) {
            ?? r0 = llllllII[3];
            "".length();
            return (((60 ^ 56) ^ (98 ^ 44)) & (((165 ^ 145) ^ (98 ^ 28)) ^ (-" ".length()))) <= (-" ".length()) ? ((7 ^ 91) ^ (29 ^ 122)) & (((0 ^ 105) ^ (101 ^ 55)) ^ (-" ".length())) : r0;
        }
        return llllllII[4];
    }

    private static String llIlIIIIIII(String lIIllIIIllllIlI, String lIIllIIIllllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIIllIIIllllIIl.getBytes(StandardCharsets.UTF_8)), llllllII[20]), "DES");
            Cipher lIIllIIIlllllII = Cipher.getInstance("DES");
            lIIllIIIlllllII.init(llllllII[1], secretKeySpec);
            return new String(lIIllIIIlllllII.doFinal(Base64.getDecoder().decode(lIIllIIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIIIllllIll) {
            lIIllIIIllllIll.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIlIlI(int i, int i2) {
        return i <= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x025d, code lost:
        if (llIlIIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.z.llllllII[22]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02a0, code lost:
        if (llIlIIIllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.z.llllllII[13]) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02e3, code lost:
        if (llIlIIIIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.z.llllllII[33]) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x02e6, code lost:
        ag();
        java.lang.System.out.println(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.z.lllllIll[p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.z.llllllII[104(0x68, float:1.46E-43)]]);
        p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.z.bz = p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.z.llllllII[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0301, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v184, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v199, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v214, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v223, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v232, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void bu() {
        BankLocation nearest = BankLocation.getNearest();
        if (llIlIIIlIll(nearest) && llIlIIIlIII(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            AccBuilderBarrows.c = lllllIll[llllllII[97]];
            C0000a.a(nearest);
        }
        if (llIlIIIlIll(nearest) && llIlIIIIlll(nearest.getArea().contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            if (llIlIIIlIII(Bank.isOpen() ? 1 : 0)) {
                AccBuilderBarrows.c = lllllIll[llllllII[98]];
                C0000a.a();
                Time.sleepUntil(() -> {
                    return Bank.isOpen();
                }, llllllII[99]);
                "".length();
            }
            if (llIlIIIIlll(Bank.isOpen() ? 1 : 0)) {
                AccBuilderBarrows.c = lllllIll[llllllII[100]];
                if (llIlIIIlllI(Inventory.getAll().size())) {
                    Bank.depositInventory();
                    Time.sleepTicks(llllllII[12]);
                    "".length();
                }
                if (llIlIIIlllI(Equipment.getAll().size())) {
                    Bank.depositEquipment();
                    Time.sleepTicks(llllllII[1]);
                    "".length();
                }
                while (llIlIIIlIII(u.aV() ? 1 : 0) && llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    u.aT();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
                int[] iArr = new int[llllllII[3]];
                iArr[llllllII[4]] = llllllII[7];
                if (llIlIIIIlll(Bank.contains(iArr) ? 1 : 0)) {
                    int[] iArr2 = new int[llllllII[3]];
                    iArr2[llllllII[4]] = llllllII[7];
                    if (llIlIIIIlIl(Bank.getFirst(iArr2).getQuantity(), llllllII[101])) {
                        ag();
                        System.out.println(lllllIll[llllllII[102]]);
                        bz = llllllII[3];
                        return;
                    }
                }
                int[] iArr3 = new int[llllllII[3]];
                iArr3[llllllII[4]] = llllllII[6];
                if (llIlIIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[llllllII[3]];
                    iArr4[llllllII[4]] = llllllII[6];
                    if (llIlIIIIlIl(Bank.getFirst(iArr4).getQuantity(), llllllII[101])) {
                        ag();
                        System.out.println(lllllIll[llllllII[16]]);
                        bz = llllllII[3];
                        return;
                    }
                }
                int[] iArr5 = new int[llllllII[3]];
                iArr5[llllllII[4]] = llllllII[5];
                if (llIlIIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr6 = new int[llllllII[3]];
                    iArr6[llllllII[4]] = llllllII[5];
                    if (llIlIIIIlIl(Bank.getFirst(iArr6).getQuantity(), llllllII[101])) {
                        ag();
                        System.out.println(lllllIll[llllllII[103]]);
                        bz = llllllII[3];
                        return;
                    }
                }
                int[] iArr7 = new int[llllllII[3]];
                iArr7[llllllII[4]] = llllllII[10];
                if (llIlIIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                    int[] iArr8 = new int[llllllII[3]];
                    iArr8[llllllII[4]] = llllllII[10];
                }
                int[] iArr9 = new int[llllllII[3]];
                iArr9[llllllII[4]] = llllllII[9];
                if (llIlIIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
                    int[] iArr10 = new int[llllllII[3]];
                    iArr10[llllllII[4]] = llllllII[9];
                }
                int[] iArr11 = new int[llllllII[3]];
                iArr11[llllllII[4]] = llllllII[8];
                if (llIlIIIIlll(Bank.contains(iArr11) ? 1 : 0)) {
                    int[] iArr12 = new int[llllllII[3]];
                    iArr12[llllllII[4]] = llllllII[8];
                }
                int[] iArr13 = new int[llllllII[18]];
                iArr13[llllllII[4]] = llllllII[105];
                iArr13[llllllII[3]] = llllllII[10];
                iArr13[llllllII[1]] = llllllII[9];
                iArr13[llllllII[12]] = llllllII[8];
                iArr13[llllllII[15]] = llllllII[7];
                iArr13[llllllII[13]] = llllllII[5];
                iArr13[llllllII[14]] = llllllII[6];
                if (llIlIIIlIII(C0004e.b(iArr13) ? 1 : 0)) {
                    ag();
                    System.out.println(lllllIll[llllllII[106]]);
                    bz = llllllII[3];
                    return;
                }
                if (llIlIIIlIII(Bank.isOpen() ? 1 : 0)) {
                    C0000a.a();
                    Time.sleepTicks(llllllII[15]);
                    "".length();
                }
                int[] iArr14 = new int[llllllII[3]];
                iArr14[llllllII[4]] = llllllII[10];
                if (llIlIIIIlll(Bank.contains(iArr14) ? 1 : 0)) {
                    int[] iArr15 = new int[llllllII[3]];
                    iArr15[llllllII[4]] = llllllII[10];
                    if (llIlIIIIlIl(Inventory.getCount(iArr15), llllllII[3])) {
                        Bank.withdraw(llllllII[10], llllllII[13], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr16 = new int[llllllII[3]];
                            iArr16[llllllII[4]] = llllllII[10];
                            if (llIlIIIlllI(Inventory.getCount(iArr16))) {
                                ?? r0 = llllllII[3];
                                "".length();
                                return 0 != 0 ? ((77 ^ 91) ^ (136 ^ 180)) & (((66 ^ 44) ^ (109 ^ 41)) ^ (-" ".length())) : r0;
                            }
                            return llllllII[4];
                        }, llllllII[99]);
                        "".length();
                    }
                }
                int[] iArr16 = new int[llllllII[3]];
                iArr16[llllllII[4]] = llllllII[9];
                if (llIlIIIIlll(Bank.contains(iArr16) ? 1 : 0)) {
                    int[] iArr17 = new int[llllllII[3]];
                    iArr17[llllllII[4]] = llllllII[9];
                    if (llIlIIIIlIl(Inventory.getCount(iArr17), llllllII[3])) {
                        Bank.withdraw(llllllII[9], llllllII[15], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr18 = new int[llllllII[3]];
                            iArr18[llllllII[4]] = llllllII[9];
                            if (llIlIIIlllI(Inventory.getCount(iArr18))) {
                                ?? r0 = llllllII[3];
                                "".length();
                                return (-"  ".length()) >= 0 ? ((39 ^ 84) ^ (4 ^ 98)) & (((51 ^ 86) ^ (5 ^ 117)) ^ (-" ".length())) : r0;
                            }
                            return llllllII[4];
                        }, llllllII[99]);
                        "".length();
                    }
                }
                int[] iArr18 = new int[llllllII[3]];
                iArr18[llllllII[4]] = llllllII[7];
                if (llIlIIIIlll(Bank.contains(iArr18) ? 1 : 0)) {
                    int[] iArr19 = new int[llllllII[3]];
                    iArr19[llllllII[4]] = llllllII[7];
                    if (llIlIIIIlIl(Inventory.getCount(iArr19), llllllII[3])) {
                        Bank.withdraw(llllllII[7], llllllII[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr20 = new int[llllllII[3]];
                            iArr20[llllllII[4]] = llllllII[7];
                            if (llIlIIIlllI(Inventory.getCount(iArr20))) {
                                ?? r0 = llllllII[3];
                                "".length();
                                return " ".length() <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llllllII[4];
                        }, llllllII[99]);
                        "".length();
                    }
                }
                int[] iArr20 = new int[llllllII[3]];
                iArr20[llllllII[4]] = llllllII[5];
                if (llIlIIIIlll(Bank.contains(iArr20) ? 1 : 0)) {
                    int[] iArr21 = new int[llllllII[3]];
                    iArr21[llllllII[4]] = llllllII[5];
                    if (llIlIIIIlIl(Inventory.getCount(iArr21), llllllII[3])) {
                        Bank.withdraw(llllllII[5], llllllII[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr22 = new int[llllllII[3]];
                            iArr22[llllllII[4]] = llllllII[5];
                            if (llIlIIIlllI(Inventory.getCount(iArr22))) {
                                ?? r0 = llllllII[3];
                                "".length();
                                return (-(21 ^ 16)) >= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llllllII[4];
                        }, llllllII[99]);
                        "".length();
                    }
                }
                int[] iArr22 = new int[llllllII[3]];
                iArr22[llllllII[4]] = llllllII[6];
                if (llIlIIIIlll(Bank.contains(iArr22) ? 1 : 0)) {
                    int[] iArr23 = new int[llllllII[3]];
                    iArr23[llllllII[4]] = llllllII[6];
                    if (llIlIIIIlIl(Inventory.getCount(iArr23), llllllII[3])) {
                        Bank.withdraw(llllllII[6], llllllII[107], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr24 = new int[llllllII[3]];
                            iArr24[llllllII[4]] = llllllII[6];
                            if (llIlIIIlllI(Inventory.getCount(iArr24))) {
                                ?? r0 = llllllII[3];
                                "".length();
                                return ((6 ^ 57) & ((122 ^ 69) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                            }
                            return llllllII[4];
                        }, llllllII[99]);
                        "".length();
                    }
                }
                int[] iArr24 = new int[llllllII[3]];
                iArr24[llllllII[4]] = llllllII[108];
                if (llIlIIIIlll(Bank.contains(iArr24) ? 1 : 0)) {
                    int[] iArr25 = new int[llllllII[3]];
                    iArr25[llllllII[4]] = llllllII[108];
                    if (llIlIIIlIII(Inventory.contains(iArr25) ? 1 : 0)) {
                        Bank.withdraw(llllllII[108], llllllII[3], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr26 = new int[llllllII[3]];
                            iArr26[llllllII[4]] = llllllII[108];
                            return Inventory.contains(iArr26);
                        }, llllllII[99]);
                        "".length();
                    }
                }
                int[] iArr26 = new int[llllllII[3]];
                iArr26[llllllII[4]] = llllllII[8];
                if (llIlIIIIlll(Bank.contains(iArr26) ? 1 : 0)) {
                    int[] iArr27 = new int[llllllII[3]];
                    iArr27[llllllII[4]] = llllllII[8];
                    if (llIlIIIIlIl(Inventory.getCount(iArr27), llllllII[3])) {
                        Bank.withdrawAll(llllllII[8], Bank.WithdrawMode.DEFAULT);
                        Time.sleepTicks(llllllII[3]);
                        "".length();
                        Time.sleepUntil(() -> {
                            int[] iArr28 = new int[llllllII[3]];
                            iArr28[llllllII[4]] = llllllII[8];
                            if (llIlIIIlllI(Inventory.getCount(iArr28))) {
                                ?? r0 = llllllII[3];
                                "".length();
                                return (-"  ".length()) >= 0 ? ((((135 + 149) - 269) + 206) ^ (((170 + 114) - 214) + 118)) & (((228 ^ 186) ^ (20 ^ 43)) ^ (-" ".length())) : r0;
                            }
                            return llllllII[4];
                        }, llllllII[99]);
                        "".length();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.F
    public boolean T() {
        return llllllII[4];
    }

    private static void llIlIIIIlII() {
        llllllII = new int[175];
        llllllII[0] = (((145 ^ 175) + (((3 + 33) - (-32)) + 67)) - (126 ^ 74)) + (116 ^ 123);
        llllllII[1] = "  ".length();
        llllllII[2] = ((88 + 218) - 154) + 74;
        llllllII[3] = " ".length();
        llllllII[4] = (222 ^ 134) & ((79 ^ 23) ^ (-1));
        llllllII[5] = (-17473) & 18027;
        llllllII[6] = (-12627) & 13183;
        llllllII[7] = (-20561) & 21118;
        llllllII[8] = (-12293) & 12671;
        llllllII[9] = (-10245) & 12229;
        llllllII[10] = (-147) & 8155;
        llllllII[11] = ((145 + 86) - 228) + 147;
        llllllII[12] = "   ".length();
        llllllII[13] = 104 ^ 109;
        llllllII[14] = (46 ^ 10) ^ (168 ^ 138);
        llllllII[15] = (((118 + 159) - 237) + 140) ^ (((127 + 111) - 151) + 89);
        llllllII[16] = 146 ^ 194;
        llllllII[17] = (-(((79 + 95) - 133) + 104)) & (-21511) & 24063;
        llllllII[18] = 53 ^ 50;
        llllllII[19] = (-((-10931) & 32507)) & (-5) & 24447;
        llllllII[20] = (63 ^ 10) ^ (123 ^ 70);
        llllllII[21] = 200 ^ 193;
        llllllII[22] = (187 ^ 141) ^ (17 ^ 45);
        llllllII[23] = (((((110 + 53) - 114) + 105) + (252 ^ 146)) - (18 ^ 106)) + (88 ^ 13);
        llllllII[24] = (27 ^ 21) ^ (151 ^ 146);
        llllllII[25] = (165 ^ 163) ^ (178 ^ 184);
        llllllII[26] = (219 ^ 172) ^ (80 ^ 42);
        llllllII[27] = (21 ^ 116) ^ (11 ^ 100);
        llllllII[28] = (((120 + 3) - 70) + 96) ^ (((23 + 12) - (-114)) + 5);
        llllllII[29] = (((112 + 51) - 99) + 95) ^ (((139 + 120) - 168) + 52);
        llllllII[30] = 151 ^ 134;
        llllllII[31] = 21 ^ 7;
        llllllII[32] = (18 ^ 88) ^ (55 ^ 110);
        llllllII[33] = (((33 + 105) - 32) + 81) ^ (((140 + 68) - 204) + 171);
        llllllII[34] = 62 ^ 43;
        llllllII[35] = (141 ^ 196) ^ (61 ^ 98);
        llllllII[36] = (((76 + 25) - 90) + 129) ^ (((70 + 69) - 72) + 88);
        llllllII[37] = (122 ^ 39) ^ (127 ^ 58);
        llllllII[38] = 105 ^ 112;
        llllllII[39] = (-((-11745) & 12277)) & (-16386) & 19327;
        llllllII[40] = (((158 + 66) - 91) + 85) ^ (((122 + 67) - 38) + 41);
        llllllII[41] = 65 ^ 90;
        llllllII[42] = 123 ^ 103;
        llllllII[43] = 120 ^ 101;
        llllllII[44] = (((32 + 67) - 76) + 120) ^ (((59 + 23) - 57) + 120);
        llllllII[45] = 156 ^ 131;
        llllllII[46] = 84 ^ 116;
        llllllII[47] = 0 ^ 33;
        llllllII[48] = 173 ^ 143;
        llllllII[49] = 88 ^ 123;
        llllllII[50] = 181 ^ 145;
        llllllII[51] = 148 ^ 177;
        llllllII[52] = (((130 + 26) - 138) + 129) ^ (((85 + 171) - 205) + 130);
        llllllII[53] = (254 ^ 188) ^ (167 ^ 194);
        llllllII[54] = (48 ^ 87) ^ (10 ^ 69);
        llllllII[55] = (245 ^ 128) ^ (0 ^ 92);
        llllllII[56] = (247 ^ 172) ^ (79 ^ 62);
        llllllII[57] = (156 ^ 152) ^ (133 ^ 170);
        llllllII[58] = (-20489) & 23389;
        llllllII[59] = (-((-21449) & 29659)) & (-4713) & 16382;
        llllllII[60] = (-((-18817) & 32645)) & (-1) & 16239;
        llllllII[61] = 182 ^ 154;
        llllllII[62] = (-12417) & 15349;
        llllllII[63] = 4 ^ 41;
        llllllII[64] = 85 ^ 123;
        llllllII[65] = (181 ^ 196) ^ (158 ^ 192);
        llllllII[66] = 12 ^ 60;
        llllllII[67] = (246 ^ 162) ^ (94 ^ 59);
        llllllII[68] = (21 ^ 92) ^ (193 ^ 186);
        llllllII[69] = (((14 + 93) - 44) + 91) ^ (((162 + 136) - 218) + 89);
        llllllII[70] = 45 ^ 25;
        llllllII[71] = (((110 + 136) - 225) + 124) ^ (((31 + 17) - (-20)) + 96);
        llllllII[72] = 5 ^ 51;
        llllllII[73] = 109 ^ 90;
        llllllII[74] = (114 ^ 122) ^ (243 ^ 195);
        llllllII[75] = (((8 + 56) - 24) + 125) ^ (((11 + 68) - (-64)) + 13);
        llllllII[76] = 94 ^ 100;
        llllllII[77] = 30 ^ 37;
        llllllII[78] = (((18 + 76) - (-67)) + 8) ^ (((14 + 58) - 25) + 102);
        llllllII[79] = 78 ^ 115;
        llllllII[80] = 98 ^ 92;
        llllllII[81] = (42 ^ 67) ^ (113 ^ 39);
        llllllII[82] = (-20517) & 24511;
        llllllII[83] = (((59 + 57) - 29) + 41) ^ (((139 + 51) - 42) + 44);
        llllllII[84] = 40 ^ 105;
        llllllII[85] = (60 ^ 107) ^ (76 ^ 89);
        llllllII[86] = 106 ^ 41;
        llllllII[87] = (96 ^ 65) ^ (242 ^ 151);
        llllllII[88] = (((18 + 73) - (-144)) + 12) ^ (((127 + 107) - 227) + 171);
        llllllII[89] = 212 ^ 146;
        llllllII[90] = (((165 + 65) - 149) + 163) ^ (((80 + 12) - (-82)) + 5);
        llllllII[91] = 245 ^ 189;
        llllllII[92] = 29 ^ 84;
        llllllII[93] = (-((-17249) & 22389)) & (-24579) & 32631;
        llllllII[94] = (-((-11875) & 32359)) & (-593) & 24542;
        llllllII[95] = (((189 + 0) - 122) + 175) ^ (((135 + 61) - 71) + 59);
        llllllII[96] = (76 ^ 60) ^ (179 ^ 136);
        llllllII[97] = 253 ^ 177;
        llllllII[98] = 21 ^ 88;
        llllllII[99] = (-((-5273) & 31935)) & (-81) & 31742;
        llllllII[100] = (((98 + 196) - 213) + 152) ^ (((97 + 151) - 176) + 95);
        llllllII[101] = (-((-17505) & 31857)) & (-17411) & 32762;
        llllllII[102] = 61 ^ 114;
        llllllII[103] = 45 ^ 124;
        llllllII[104] = 49 ^ 99;
        llllllII[105] = (-((-1573) & 17981)) & (-33) & 24447;
        llllllII[106] = (((128 + 11) - 135) + 188) ^ (((130 + 42) - 137) + 112);
        llllllII[107] = (-17929) & 18428;
        llllllII[108] = (-((-29713) & 30399)) & (-17409) & 30719;
        llllllII[109] = 249 ^ 157;
        llllllII[110] = (-((-8601) & 14334)) & (-24585) & 30717;
        llllllII[111] = (-((-1661) & 18045)) & (-2058) & 23551;
        llllllII[112] = (-((-20329) & 24443)) & (-16386) & 32479;
        llllllII[113] = (-((-16397) & 32141)) & (-20) & 32763;
        llllllII[114] = (-4099) & 5998;
        llllllII[115] = (-14373) & 16372;
        llllllII[116] = (((58 + 27) - (-59)) + 78) ^ (((48 + 117) - 62) + 35);
        llllllII[117] = (((34 + 90) - 106) + 126) ^ (((76 + 109) - 71) + 83);
        llllllII[118] = (-20545) & 22014;
        llllllII[119] = (-((-18885) & 31742)) & (-2051) & 16383;
        llllllII[120] = (-((-2370) & 23389)) & (-10245) & 32735;
        llllllII[121] = (-((-297) & 7673)) & (-24833) & 32762;
        llllllII[122] = (-10) & 1483;
        llllllII[123] = (-4107) & 7022;
        llllllII[124] = (-((-15443) & 15959)) & (-8210) & 12189;
        llllllII[125] = (-((-12917) & 30461)) & (-17) & 20479;
        llllllII[126] = (-16395) & 19294;
        llllllII[127] = (-((-10245) & 14941)) & (-1) & 8155;
        llllllII[128] = (-9245) & 12159;
        llllllII[129] = (-1153) & 4082;
        llllllII[130] = (-((-783) & 13167)) & (-537) & 16378;
        llllllII[131] = (-((-782) & 9103)) & (-33) & 11255;
        llllllII[132] = (-29233) & 32693;
        llllllII[133] = (-((-777) & 26523)) & (-9) & 28671;
        llllllII[134] = (-((-26721) & 31983)) & (-8194) & 16367;
        llllllII[135] = (-((-3719) & 32487)) & (-521) & 32751;
        llllllII[136] = (-24713) & 27615;
        llllllII[137] = (-29699) & 32627;
        llllllII[138] = (-12574) & 15677;
        llllllII[139] = (-((-87) & 16503)) & (-4741) & 24319;
        llllllII[140] = (-((-8627) & 26035)) & (-145) & 20479;
        llllllII[141] = (-((-7205) & 16037)) & (-4097) & 16383;
        llllllII[142] = (-((-729) & 29407)) & (-1153) & 32766;
        llllllII[143] = (-((-17158) & 29455)) & (-1) & 15263;
        llllllII[144] = (-585) & 3965;
        llllllII[145] = (-((-4931) & 30539)) & (-133) & 28639;
        llllllII[146] = (-((-18707) & 31615)) & (-16385) & 32765;
        llllllII[147] = (-((-3929) & 28667)) & (-5125) & 32767;
        llllllII[148] = (-16397) & 19871;
        llllllII[149] = (-((-11091) & 32759)) & (-1) & 24574;
        llllllII[150] = (-18763) & 28638;
        llllllII[151] = (-((-24595) & 29023)) & (-2081) & 16382;
        llllllII[152] = (-18441) & 28313;
        llllllII[153] = (-((-21737) & 29951)) & (-16993) & 28671;
        llllllII[154] = (-4257) & 7167;
        llllllII[155] = (-16497) & 19965;
        llllllII[156] = (-((-11479) & 31959)) & (-8325) & 31711;
        llllllII[157] = (-521) & 3996;
        llllllII[158] = (-((-16001) & 16306)) & (-20481) & 30655;
        llllllII[159] = (-((-2645) & 24277)) & (-8193) & 32733;
        llllllII[160] = (-43) & 9919;
        llllllII[161] = (-221) & 15583;
        llllllII[162] = (-((-12297) & 31613)) & (-8321) & 32759;
        llllllII[163] = (((94 + 90) - 23) + 59) ^ (((27 + 135) - 83) + 59);
        llllllII[164] = 34 ^ 117;
        llllllII[165] = 152 ^ 192;
        llllllII[166] = 4 ^ 93;
        llllllII[167] = (129 ^ 183) ^ (25 ^ 117);
        llllllII[168] = (111 ^ 76) ^ (69 ^ 61);
        llllllII[169] = (((186 + 130) - 223) + 112) ^ (((115 + 75) - 74) + 29);
        llllllII[170] = (-16387) & 20382;
        llllllII[171] = (-((-1693) & 18143)) & (-33) & 20479;
        llllllII[172] = (-((-8967) & 29511)) & (-34) & 24575;
        llllllII[173] = (-12353) & 16351;
        llllllII[174] = (((247 + 196) - 241) + 50) ^ (((92 + 77) - 158) + 150);
    }

    private static boolean llIlIIIllII(Object obj) {
        return obj == null;
    }

    private static boolean llIlIIIIllI(int i, int i2) {
        return i == i2;
    }

    private static boolean llIlIIIlIll(Object obj) {
        return obj != null;
    }

    private static String llIlIIIIIlI(String lIIllIIIlIlIlIl, String lIIllIIIlIlIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIIllIIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIIllIIIlIlIlll = Cipher.getInstance("Blowfish");
            lIIllIIIlIlIlll.init(llllllII[1], secretKeySpec);
            return new String(lIIllIIIlIlIlll.doFinal(Base64.getDecoder().decode(lIIllIIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIIllIIIlIlIllI) {
            lIIllIIIlIlIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIIlIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0b39, code lost:
        if (llIlIIIlIIl(net.unethicalite.api.entities.Players.getLocal().getWorldLocation().distanceTo(p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.z.hr), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.z.llllllII[12]) != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0da8, code lost:
        if (llIlIIIlIII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L223;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0dd3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x019d  */
    /* JADX WARN: Type inference failed for: r0v650, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bs() {
        if (llIlIIIIlIl(C0004e.j(llllllII[0]), llllllII[1])) {
            try {
                C.bI();
                "".length();
                if (((99 ^ 38) & ((52 ^ 113) ^ (-1))) > (132 ^ 128)) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (llIlIIIIllI(C0004e.j(llllllII[0]), llllllII[1]) && llIlIIIIlIl(C0004e.j(llllllII[2]), llllllII[3])) {
            if (llIlIIIIlll(bz ? 1 : 0)) {
                AccBuilderBarrows.c = lllllIll[llllllII[4]];
                C0001b.a(bB);
                if (llIlIIIIlIl(bB.size(), llllllII[3])) {
                    System.out.println(lllllIll[llllllII[3]]);
                    bz = llllllII[4];
                }
            }
            do {
                if (llIlIIIIlll(u.aV() ? 1 : 0)) {
                    int[] iArr = new int[llllllII[3]];
                    iArr[llllllII[4]] = llllllII[5];
                    if (llIlIIIIlll(Inventory.contains(iArr) ? 1 : 0)) {
                        int[] iArr2 = new int[llllllII[3]];
                        iArr2[llllllII[4]] = llllllII[6];
                        if (llIlIIIIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                            int[] iArr3 = new int[llllllII[3]];
                            iArr3[llllllII[4]] = llllllII[7];
                            if (llIlIIIIlll(Inventory.contains(iArr3) ? 1 : 0)) {
                                int[] iArr4 = new int[llllllII[3]];
                                iArr4[llllllII[4]] = llllllII[8];
                                if (llIlIIIIlll(Inventory.contains(iArr4) ? 1 : 0)) {
                                    int[] iArr5 = new int[llllllII[3]];
                                    iArr5[llllllII[4]] = llllllII[9];
                                    if (llIlIIIIlll(Inventory.contains(iArr5) ? 1 : 0)) {
                                        int[] iArr6 = new int[llllllII[3]];
                                        iArr6[llllllII[4]] = llllllII[10];
                                        if (!llIlIIIlIII(Inventory.contains(iArr6) ? 1 : 0)) {
                                            if (llIlIIIlIII(bz ? 1 : 0)) {
                                                if (llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[11])) {
                                                    int[] iArr7 = new int[llllllII[3]];
                                                    iArr7[llllllII[4]] = llllllII[10];
                                                    if (llIlIIIIlll(Inventory.contains(iArr7) ? 1 : 0)) {
                                                        AccBuilderBarrows.c = lllllIll[llllllII[1]];
                                                        int[] iArr8 = new int[llllllII[3]];
                                                        iArr8[llllllII[4]] = llllllII[10];
                                                        Inventory.getFirst(iArr8).interact(lllllIll[llllllII[12]]);
                                                        Time.sleepTicks(llllllII[13]);
                                                        "".length();
                                                    }
                                                }
                                                if (llIlIIIIlIl(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[11]) && llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[14])) {
                                                    AccBuilderBarrows.c = lllllIll[llllllII[15]];
                                                    if (llIlIIIIlll(Inventory.contains(C0005f.bb) ? 1 : 0) && llIlIIIIlIl(Movement.getRunEnergy(), llllllII[16])) {
                                                        Inventory.getFirst(C0005f.bb).interact(lllllIll[llllllII[13]]);
                                                        Time.sleepTicks(llllllII[3]);
                                                        "".length();
                                                    }
                                                    Movement.walkTo(he);
                                                    "".length();
                                                    Time.sleepTicks(llllllII[3]);
                                                    "".length();
                                                }
                                                if (llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[14])) {
                                                    C0006g.a(lllllIll[llllllII[14]], gx);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    bu();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                    "".length();
                } else if (llIlIIIlIII(bz ? 1 : 0)) {
                }
            } while ("  ".length() >= ((81 ^ 23) & ((108 ^ 42) ^ (-1))));
            return;
        }
        if (llIlIIIIllI(C0004e.j(llllllII[0]), llllllII[1]) && llIlIIIIllI(C0004e.j(llllllII[2]), llllllII[3])) {
            if (llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hh), llllllII[15]) && llIlIIIlIII(hu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int[] iArr9 = new int[llllllII[3]];
                iArr9[llllllII[4]] = llllllII[17];
                if (llIlIIIlIII(Inventory.contains(iArr9) ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[18]];
                    Movement.walkTo(hh);
                    "".length();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                }
            }
            if (llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hh), llllllII[15]) && llIlIIIlIII(Players.getLocal().isMoving() ? 1 : 0)) {
                int[] iArr10 = new int[llllllII[3]];
                iArr10[llllllII[4]] = llllllII[17];
                if (llIlIIIlIII(Inventory.contains(iArr10) ? 1 : 0)) {
                    int[] iArr11 = new int[llllllII[3]];
                    iArr11[llllllII[4]] = llllllII[19];
                    TileObject nearest = TileObjects.getNearest(iArr11);
                    if (llIlIIIIlll(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr12 = new int[llllllII[3]];
                        iArr12[llllllII[4]] = llllllII[8];
                        Inventory.getFirst(iArr12).interact(lllllIll[llllllII[20]]);
                        Time.sleepTicks(llllllII[3]);
                        "".length();
                    }
                    if (llIlIIIlIII(Inventory.isFull() ? 1 : 0)) {
                        if (llIlIIIlIll(nearest) && llIlIIIlIII(Dialog.isOpen() ? 1 : 0)) {
                            AccBuilderBarrows.c = lllllIll[llllllII[21]];
                            nearest.interact(lllllIll[llllllII[22]]);
                            Dialog.continueSpace();
                        }
                        Widget widget = Widgets.get(llllllII[23], llllllII[3]);
                        if (llIlIIIlIll(widget)) {
                            widget.interact(lllllIll[llllllII[24]]);
                            widget.interact(llllllII[4]);
                            widget.interact(lllllIll[llllllII[25]]);
                            Keyboard.type(lllllIll[llllllII[26]]);
                        }
                    }
                }
            }
            if (llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hh), llllllII[15])) {
                int[] iArr13 = new int[llllllII[3]];
                iArr13[llllllII[4]] = llllllII[17];
                if (llIlIIIIlll(Inventory.contains(iArr13) ? 1 : 0) && llIlIIIlIII(ht.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[27]];
                    Movement.walkTo(hl);
                    "".length();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                }
            }
            if (llIlIIIIlll(hu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lllllIll[llllllII[28]];
                if (llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hl), llllllII[3])) {
                    Movement.walkTo(hl);
                    "".length();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                }
                if (llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hl), llllllII[3])) {
                    String[] strArr = new String[llllllII[3]];
                    strArr[llllllII[4]] = lllllIll[llllllII[29]];
                    TileObject nearest2 = TileObjects.getNearest(strArr);
                    AccBuilderBarrows.c = lllllIll[llllllII[30]];
                    if (llIlIIIIlll(Inventory.isFull() ? 1 : 0)) {
                        int[] iArr14 = new int[llllllII[3]];
                        iArr14[llllllII[4]] = llllllII[8];
                        Inventory.getFirst(iArr14).interact(lllllIll[llllllII[31]]);
                        Time.sleepTicks(llllllII[3]);
                        "".length();
                    }
                    if (llIlIIIlIll(nearest2)) {
                        String[] strArr2 = new String[llllllII[3]];
                        strArr2[llllllII[4]] = lllllIll[llllllII[32]];
                        if (llIlIIIIlll(nearest2.hasAction(strArr2) ? 1 : 0)) {
                            nearest2.interact(lllllIll[llllllII[33]]);
                            Time.sleepTicks(llllllII[1]);
                            "".length();
                        }
                        String[] strArr3 = new String[llllllII[3]];
                        strArr3[llllllII[4]] = lllllIll[llllllII[34]];
                        if (llIlIIIIlll(nearest2.hasAction(strArr3) ? 1 : 0)) {
                            nearest2.interact(lllllIll[llllllII[35]]);
                            Time.sleepTicks(llllllII[1]);
                            "".length();
                            Widget widget2 = Widgets.get(llllllII[23], llllllII[3]);
                            if (llIlIIIlIll(widget2)) {
                                widget2.interact(lllllIll[llllllII[36]]);
                                widget2.interact(llllllII[4]);
                                widget2.interact(lllllIll[llllllII[37]]);
                                Keyboard.type(lllllIll[llllllII[38]]);
                            }
                        }
                    }
                }
            }
        }
        if (llIlIIIIllI(C0004e.j(llllllII[0]), llllllII[1]) && llIlIIIIllI(C0004e.j(llllllII[2]), llllllII[1])) {
            ci = llllllII[4];
            if (llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[22])) {
                while (llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hh), llllllII[1]) && llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    Movement.walkTo(hh);
                    "".length();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                    "".length();
                    if ((120 ^ 125) <= 0) {
                        return;
                    }
                }
            }
            int[] iArr15 = new int[llllllII[3]];
            iArr15[llllllII[4]] = llllllII[39];
            if (llIlIIIlIII(Inventory.contains(iArr15) ? 1 : 0) && llIlIIIIlll(hu.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                AccBuilderBarrows.c = lllllIll[llllllII[40]];
                if (llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hl), llllllII[3])) {
                    Movement.walkTo(hl);
                    "".length();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                }
                if (llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hl), llllllII[3])) {
                    String[] strArr4 = new String[llllllII[3]];
                    strArr4[llllllII[4]] = lllllIll[llllllII[41]];
                    TileObject nearest3 = TileObjects.getNearest(strArr4);
                    AccBuilderBarrows.c = lllllIll[llllllII[42]];
                    if (llIlIIIlIll(nearest3)) {
                        String[] strArr5 = new String[llllllII[3]];
                        strArr5[llllllII[4]] = lllllIll[llllllII[43]];
                        if (llIlIIIIlll(nearest3.hasAction(strArr5) ? 1 : 0)) {
                            nearest3.interact(lllllIll[llllllII[44]]);
                            Time.sleepTicks(llllllII[1]);
                            "".length();
                        }
                        String[] strArr6 = new String[llllllII[3]];
                        strArr6[llllllII[4]] = lllllIll[llllllII[45]];
                        if (llIlIIIIlll(nearest3.hasAction(strArr6) ? 1 : 0)) {
                            nearest3.interact(lllllIll[llllllII[46]]);
                            Time.sleepTicks(llllllII[1]);
                            "".length();
                            Widget widget3 = Widgets.get(llllllII[23], llllllII[3]);
                            if (llIlIIIlIll(widget3)) {
                                widget3.interact(lllllIll[llllllII[47]]);
                                widget3.interact(llllllII[4]);
                                widget3.interact(lllllIll[llllllII[48]]);
                                Keyboard.type(lllllIll[llllllII[49]]);
                            }
                        }
                    }
                }
            }
            int[] iArr16 = new int[llllllII[3]];
            iArr16[llllllII[4]] = llllllII[39];
            if (llIlIIIIlll(Inventory.contains(iArr16) ? 1 : 0) && llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hi), llllllII[3])) {
                AccBuilderBarrows.c = lllllIll[llllllII[50]];
                Movement.walkTo(hi);
                "".length();
                Time.sleepTicks(llllllII[3]);
                "".length();
            }
            if (llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hi), llllllII[1])) {
                String[] strArr7 = new String[llllllII[3]];
                strArr7[llllllII[4]] = lllllIll[llllllII[51]];
                TileObject nearest4 = TileObjects.getNearest(strArr7);
                String[] strArr8 = new String[llllllII[3]];
                strArr8[llllllII[4]] = lllllIll[llllllII[52]];
                NPC nearest5 = NPCs.getNearest(strArr8);
                if (llIlIIIlIll(nearest4) && llIlIIIllII(nearest5)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[53]];
                    String[] strArr9 = new String[llllllII[3]];
                    strArr9[llllllII[4]] = lllllIll[llllllII[54]];
                    if (llIlIIIIlll(Inventory.contains(strArr9) ? 1 : 0)) {
                        String[] strArr10 = new String[llllllII[3]];
                        strArr10[llllllII[4]] = lllllIll[llllllII[55]];
                        Inventory.getFirst(strArr10).useOn(nearest4);
                    }
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                }
                if (llIlIIIlIll(nearest5)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[56]];
                    int[] iArr17 = new int[llllllII[3]];
                    iArr17[llllllII[4]] = llllllII[39];
                    if (llIlIIIIlll(Inventory.contains(iArr17) ? 1 : 0)) {
                        int[] iArr18 = new int[llllllII[3]];
                        iArr18[llllllII[4]] = llllllII[39];
                        Inventory.getFirst(iArr18).useOn(nearest5);
                    }
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                }
            }
        }
        if (llIlIIIIlll(ht.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIllI(C0004e.j(llllllII[2]), llllllII[12])) {
            AccBuilderBarrows.c = lllllIll[llllllII[57]];
            Movement.walkTo(new WorldPoint(llllllII[58], llllllII[59], llllllII[4]));
            "".length();
            Time.sleepTicks(llllllII[3]);
            "".length();
        }
        if (llIlIIIlIII(ht.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIIllI(C0004e.j(llllllII[2]), llllllII[12])) {
            int[] iArr19 = new int[llllllII[3]];
            iArr19[llllllII[4]] = llllllII[60];
            if (llIlIIIIlll(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llllllII[3]];
                iArr20[llllllII[4]] = llllllII[60];
                if (llIlIIIIlll(Inventory.contains(iArr20) ? 1 : 0)) {
                }
            }
            AccBuilderBarrows.c = lllllIll[llllllII[61]];
            if (llIlIIIllIl(Movement.getRunEnergy(), llllllII[33])) {
                bt();
            }
        }
        if (llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hr), llllllII[12])) {
            int[] iArr21 = new int[llllllII[3]];
            iArr21[llllllII[4]] = llllllII[60];
            if (llIlIIIIlll(Inventory.contains(iArr21) ? 1 : 0) && llIlIIIIllI(Players.getLocal().getWorldLocation().getX(), llllllII[62])) {
                String[] strArr11 = new String[llllllII[3]];
                strArr11[llllllII[4]] = lllllIll[llllllII[63]];
                TileObject nearest6 = TileObjects.getNearest(strArr11);
                if (llIlIIIlIll(nearest6)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[64]];
                    int[] iArr22 = new int[llllllII[3]];
                    iArr22[llllllII[4]] = llllllII[60];
                    if (llIlIIIIlll(Inventory.contains(iArr22) ? 1 : 0)) {
                        int[] iArr23 = new int[llllllII[3]];
                        iArr23[llllllII[4]] = llllllII[60];
                        Inventory.getFirst(iArr23).useOn(nearest6);
                        Time.sleepTicks(llllllII[1]);
                        "".length();
                    }
                }
            }
        }
        if (llIlIIIIlll(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            int[] iArr24 = new int[llllllII[3]];
            iArr24[llllllII[4]] = llllllII[60];
            if (llIlIIIIlll(Inventory.contains(iArr24) ? 1 : 0)) {
                if (llIlIIIlIII(Players.getLocal().getWorldLocation().equals(hf) ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[65]];
                    Movement.walkTo(hf);
                    "".length();
                }
                if (llIlIIIlIlI(Skills.getBoostedLevel(Skill.HITPOINTS), llllllII[13])) {
                    int[] iArr25 = new int[llllllII[3]];
                    iArr25[llllllII[4]] = llllllII[8];
                    if (llIlIIIIlll(Inventory.contains(iArr25) ? 1 : 0)) {
                        int[] iArr26 = new int[llllllII[3]];
                        iArr26[llllllII[4]] = llllllII[8];
                        Inventory.getFirst(iArr26).interact(lllllIll[llllllII[66]]);
                    }
                }
                if (llIlIIIIlll(Players.getLocal().getWorldLocation().equals(hf) ? 1 : 0)) {
                    NPC nearest7 = NPCs.getNearest(hJ);
                    if (llIlIIIlIll(nearest7) && llIlIIIlIII(nearest7.isDead() ? 1 : 0)) {
                        AccBuilderBarrows.c = lllllIll[llllllII[67]];
                        if (llIlIIIIlIl(Skills.getLevel(Skill.MAGIC), llllllII[21])) {
                            Magic.cast(SpellBook.Standard.WATER_STRIKE, nearest7);
                            Time.sleepTicks(llllllII[3]);
                            "".length();
                        }
                        if (!llIlIIIIlIl(Skills.getLevel(Skill.MAGIC), llllllII[26]) || llIlIIIIlIl(Skills.getLevel(Skill.MAGIC), llllllII[21])) {
                            if (llIlIIIllIl(Skills.getLevel(Skill.MAGIC), llllllII[21])) {
                                int[] iArr27 = new int[llllllII[3]];
                                iArr27[llllllII[4]] = llllllII[6];
                                if (llIlIIIIlll(Inventory.contains(iArr27) ? 1 : 0)) {
                                    String[] strArr12 = new String[llllllII[3]];
                                    strArr12[llllllII[4]] = lllllIll[llllllII[68]];
                                }
                            }
                            if (llIlIIIllIl(Skills.getLevel(Skill.MAGIC), llllllII[26])) {
                                String[] strArr13 = new String[llllllII[3]];
                                strArr13[llllllII[4]] = lllllIll[llllllII[69]];
                                if (llIlIIIIlll(Inventory.contains(strArr13) ? 1 : 0)) {
                                    Magic.cast(SpellBook.Standard.FIRE_STRIKE, nearest7);
                                    Time.sleepTicks(llllllII[3]);
                                    "".length();
                                }
                            }
                        }
                        Magic.cast(SpellBook.Standard.EARTH_STRIKE, nearest7);
                        Time.sleepTicks(llllllII[3]);
                        "".length();
                        if (llIlIIIllIl(Skills.getLevel(Skill.MAGIC), llllllII[26])) {
                        }
                    }
                }
            }
        }
        if (llIlIIIIllI(C0004e.j(llllllII[2]), llllllII[14])) {
            String[] strArr14 = new String[llllllII[3]];
            strArr14[llllllII[4]] = lllllIll[llllllII[70]];
            if (llIlIIIlIII(Inventory.contains(strArr14) ? 1 : 0)) {
                String[] strArr15 = new String[llllllII[3]];
                strArr15[llllllII[4]] = lllllIll[llllllII[71]];
                TileItem nearest8 = TileItems.getNearest(strArr15);
                if (llIlIIIlIll(nearest8)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[72]];
                    nearest8.interact(lllllIll[llllllII[73]]);
                    Time.sleepTicks(llllllII[1]);
                    "".length();
                }
            }
        }
        if (llIlIIIIllI(C0004e.j(llllllII[2]), llllllII[14])) {
            String[] strArr16 = new String[llllllII[3]];
            strArr16[llllllII[4]] = lllllIll[llllllII[74]];
            if (llIlIIIIlll(Inventory.contains(strArr16) ? 1 : 0)) {
                if (llIlIIIIlll(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    int[] iArr28 = new int[llllllII[3]];
                    iArr28[llllllII[4]] = llllllII[10];
                    if (llIlIIIIlll(Inventory.contains(iArr28) ? 1 : 0)) {
                        AccBuilderBarrows.c = lllllIll[llllllII[75]];
                        int[] iArr29 = new int[llllllII[3]];
                        iArr29[llllllII[4]] = llllllII[10];
                        Inventory.getFirst(iArr29).interact(lllllIll[llllllII[76]]);
                        Time.sleepTicks(llllllII[13]);
                        "".length();
                    }
                }
                if (llIlIIIlIII(hv.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[15])) {
                    AccBuilderBarrows.c = lllllIll[llllllII[77]];
                    Movement.walkTo(he);
                    "".length();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                }
                if (llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(he), llllllII[13])) {
                    AccBuilderBarrows.c = lllllIll[llllllII[78]];
                    if (llIlIIIIlIl(ci, llllllII[3])) {
                        Q.jv += llllllII[3];
                        Q.o(AccBuilderBarrows.m);
                        ci += llllllII[3];
                        Q.jv = llllllII[4];
                        cj = llllllII[4];
                    }
                    C0006g.a(lllllIll[llllllII[79]], gx);
                }
            }
        }
    }

    private static boolean llIlIIIIlll(int i) {
        return i != 0;
    }

    private static boolean llIlIIIlIIl(int i, int i2) {
        return i > i2;
    }

    private static boolean llIlIIIlllI(int i) {
        return i > 0;
    }

    private static boolean llIlIIIllIl(int i, int i2) {
        return i >= i2;
    }

    public static void bt() {
        if (llIlIIIIlll(Inventory.contains(C0005f.bb) ? 1 : 0) && llIlIIIIlIl(Movement.getRunEnergy(), llllllII[68])) {
            Inventory.getFirst(C0005f.bb).interact(lllllIll[llllllII[80]]);
            Time.sleepTicks(llllllII[3]);
            "".length();
        }
        if (llIlIIIlIII(Movement.isRunEnabled() ? 1 : 0)) {
            Movement.toggleRun();
        }
        if (!llIlIIIlIII(ht.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hi), llllllII[1])) {
            AccBuilderBarrows.c = lllllIll[llllllII[81]];
            Movement.walkTo(new WorldPoint(llllllII[58], llllllII[59], llllllII[4]));
            "".length();
            Time.sleepTicks(llllllII[3]);
            "".length();
        }
        int[] iArr = new int[llllllII[3]];
        iArr[llllllII[4]] = llllllII[82];
        NPC nearest = NPCs.getNearest(iArr);
        int[] iArr2 = new int[llllllII[3]];
        iArr2[llllllII[4]] = llllllII[60];
        if (llIlIIIlIII(Inventory.contains(iArr2) ? 1 : 0)) {
            if (llIlIIIIlll(gI.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIlIll(nearest) && llIlIIIIlll(gO.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(llllllII[24]);
                "".length();
                while (llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gF), llllllII[3]) && llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[83]];
                    Movement.walkTo(gF);
                    "".length();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                }
            }
            if (llIlIIIIlll(gJ.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIlIll(nearest) && llIlIIIIlll(gL.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gG), llllllII[3]) && llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[84]];
                    Movement.walkTo(gG);
                    "".length();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                    "".length();
                    if ((((212 ^ 198) ^ (127 ^ 90)) & (((183 ^ 130) ^ "  ".length()) ^ (-" ".length()))) != 0) {
                        return;
                    }
                }
            }
            if (llIlIIIIlll(gK.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIlIll(nearest) && llIlIIIIlll(gP.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                Time.sleepTicks(llllllII[18]);
                "".length();
                while (llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gH), llllllII[3]) && llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[85]];
                    Movement.walkTo(gH);
                    "".length();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                    "".length();
                    if ("   ".length() < "  ".length()) {
                        return;
                    }
                }
            }
            if (llIlIIIIlll(gN.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && llIlIIIlIll(nearest) && llIlIIIIlll(gP.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(hs), llllllII[1]) && llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[86]];
                    Movement.walkTo(hs);
                    "".length();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
            }
            if (llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hs), llllllII[12])) {
                AccBuilderBarrows.c = lllllIll[llllllII[87]];
                String[] strArr = new String[llllllII[3]];
                strArr[llllllII[4]] = lllllIll[llllllII[88]];
                TileObject nearest2 = TileObjects.getNearest(strArr);
                if (llIlIIIlIll(nearest2)) {
                    nearest2.interact(lllllIll[llllllII[89]]);
                    Time.sleepTicks(llllllII[1]);
                    "".length();
                    Widget widget = Widgets.get(llllllII[23], llllllII[3]);
                    if (llIlIIIlIll(widget)) {
                        widget.interact(lllllIll[llllllII[90]]);
                        widget.interact(llllllII[4]);
                        widget.interact(lllllIll[llllllII[91]]);
                        Keyboard.type(lllllIll[llllllII[92]]);
                    }
                }
            }
        }
        int[] iArr3 = new int[llllllII[3]];
        iArr3[llllllII[4]] = llllllII[60];
        if (llIlIIIIlll(Inventory.contains(iArr3) ? 1 : 0)) {
            if (llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(hs), llllllII[12])) {
                while (llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllllII[93], llllllII[94], llllllII[4])), llllllII[3]) && llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[95]];
                    Movement.walkTo(new WorldPoint(llllllII[93], llllllII[94], llllllII[4]));
                    "".length();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                }
            }
            if (llIlIIIlIlI(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llllllII[93], llllllII[94], llllllII[4])), llllllII[1]) && llIlIIIlIll(nearest) && llIlIIIIlll(gO.contains(nearest.getWorldLocation()) ? 1 : 0)) {
                while (llIlIIIlIIl(Players.getLocal().getWorldLocation().distanceTo(gG), llllllII[3]) && llIlIIIlIII(AccBuilderBarrows.d ? 1 : 0)) {
                    AccBuilderBarrows.c = lllllIll[llllllII[96]];
                    Movement.walkTo(gG);
                    "".length();
                    Time.sleepTicks(llllllII[3]);
                    "".length();
                    "".length();
                    if (((((81 + 140) - 167) + 121) ^ (((73 + 137) - 177) + 138)) == 0) {
                        return;
                    }
                }
            }
        }
    }

    private static String llIlIIIIIIl(String lIIllIIIllIlIlI, String lIIllIIIllIlIIl) {
        String lIIllIIIllIlIlI2 = new String(Base64.getDecoder().decode(lIIllIIIllIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIIllIIIllIlIII = new StringBuilder();
        char[] charArray = lIIllIIIllIlIIl.toCharArray();
        int lIIllIIIllIIllI = llllllII[4];
        char[] charArray2 = lIIllIIIllIlIlI2.toCharArray();
        int length = charArray2.length;
        int i = llllllII[4];
        while (llIlIIIIlIl(i, length)) {
            lIIllIIIllIlIII.append((char) (charArray2[i] ^ charArray[lIIllIIIllIIllI % charArray.length]));
            "".length();
            lIIllIIIllIIllI++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lIIllIIIllIlIII);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0158, code lost:
        if (llIlIIIIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.z.llllllII[13]) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x02aa, code lost:
        if (llIlIIIIlIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), p000.a.c.u.c.l.o.d.p001.r.e.o.n.b.l.e.i.w.k.b.p002.r.i.s.r.z.llllllII[22]) != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void ag() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8 = new int[llllllII[3]];
        iArr8[llllllII[4]] = llllllII[8];
        if (llIlIIIlIII(Bank.contains(iArr8) ? 1 : 0)) {
            bB.add(new C0003d(llllllII[8], llllllII[109], llllllII[110]));
            "".length();
        }
        int[] iArr9 = new int[llllllII[3]];
        iArr9[llllllII[4]] = llllllII[8];
        if (llIlIIIIlll(Bank.contains(iArr9) ? 1 : 0)) {
            int[] iArr10 = new int[llllllII[3]];
            iArr10[llllllII[4]] = llllllII[8];
            if (llIlIIIIlIl(Bank.getFirst(iArr10).getQuantity(), llllllII[33])) {
                bB.add(new C0003d(llllllII[8], llllllII[54], llllllII[110]));
                "".length();
            }
        }
        int[] iArr11 = new int[llllllII[3]];
        iArr11[llllllII[4]] = llllllII[9];
        if (llIlIIIlIII(Bank.contains(iArr11) ? 1 : 0)) {
            bB.add(new C0003d(llllllII[9], llllllII[13], llllllII[111]));
            "".length();
        }
        int[] iArr12 = new int[llllllII[3]];
        iArr12[llllllII[4]] = llllllII[9];
        if (llIlIIIIlll(Bank.contains(iArr12) ? 1 : 0)) {
            int[] iArr13 = new int[llllllII[3]];
            iArr13[llllllII[4]] = llllllII[9];
            if (llIlIIIIlll(Bank.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llllllII[3]];
                iArr14[llllllII[4]] = llllllII[9];
            }
            if (llIlIIIlIII(Bank.contains(item -> {
                return item.getName().toLowerCase().contains(lllllIll[llllllII[117]]);
            }) ? 1 : 0)) {
                bB.add(new C0003d(llllllII[112], llllllII[31], llllllII[113]));
                "".length();
            }
            iArr = new int[llllllII[3]];
            iArr[llllllII[4]] = llllllII[105];
            if (llIlIIIlIII(Bank.contains(iArr) ? 1 : 0)) {
                bB.add(new C0003d(llllllII[105], llllllII[54], llllllII[114]));
                "".length();
            }
            iArr2 = new int[llllllII[3]];
            iArr2[llllllII[4]] = llllllII[10];
            if (llIlIIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
                bB.add(new C0003d(llllllII[10], llllllII[33], llllllII[114]));
                "".length();
            }
            iArr3 = new int[llllllII[3]];
            iArr3[llllllII[4]] = llllllII[10];
            if (llIlIIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
                int[] iArr15 = new int[llllllII[3]];
                iArr15[llllllII[4]] = llllllII[10];
                if (llIlIIIIlll(Bank.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[llllllII[3]];
                    iArr16[llllllII[4]] = llllllII[10];
                }
                iArr4 = new int[llllllII[3]];
                iArr4[llllllII[4]] = llllllII[108];
                if (llIlIIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
                    bB.add(new C0003d(llllllII[108], llllllII[13], C0008i.bw));
                    "".length();
                }
                iArr5 = new int[llllllII[3]];
                iArr5[llllllII[4]] = llllllII[7];
                if (llIlIIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
                    int[] iArr17 = new int[llllllII[3]];
                    iArr17[llllllII[4]] = llllllII[7];
                    if (llIlIIIIlIl(Bank.getFirst(iArr17).getQuantity(), llllllII[101])) {
                        bB.add(new C0003d(llllllII[7], llllllII[115], llllllII[18]));
                        "".length();
                    }
                }
                iArr6 = new int[llllllII[3]];
                iArr6[llllllII[4]] = llllllII[5];
                if (llIlIIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
                    int[] iArr18 = new int[llllllII[3]];
                    iArr18[llllllII[4]] = llllllII[5];
                    if (llIlIIIIlIl(Bank.getFirst(iArr18).getQuantity(), llllllII[101])) {
                        bB.add(new C0003d(llllllII[5], llllllII[115], llllllII[18]));
                        "".length();
                    }
                }
                iArr7 = new int[llllllII[3]];
                iArr7[llllllII[4]] = llllllII[6];
                if (llIlIIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
                    int[] iArr19 = new int[llllllII[3]];
                    iArr19[llllllII[4]] = llllllII[6];
                    if (llIlIIIIlIl(Bank.getFirst(iArr19).getQuantity(), llllllII[101])) {
                        bB.add(new C0003d(llllllII[6], llllllII[115], llllllII[18]));
                        "".length();
                        return;
                    }
                    return;
                }
                return;
            }
            bB.add(new C0003d(llllllII[10], llllllII[33], llllllII[114]));
            "".length();
            iArr4 = new int[llllllII[3]];
            iArr4[llllllII[4]] = llllllII[108];
            if (llIlIIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[llllllII[3]];
            iArr5[llllllII[4]] = llllllII[7];
            if (llIlIIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[llllllII[3]];
            iArr6[llllllII[4]] = llllllII[5];
            if (llIlIIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
            }
            iArr7 = new int[llllllII[3]];
            iArr7[llllllII[4]] = llllllII[6];
            if (llIlIIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
            }
        }
        bB.add(new C0003d(llllllII[9], llllllII[13], llllllII[111]));
        "".length();
        if (llIlIIIlIII(Bank.contains(item2 -> {
            return item2.getName().toLowerCase().contains(lllllIll[llllllII[117]]);
        }) ? 1 : 0)) {
        }
        iArr = new int[llllllII[3]];
        iArr[llllllII[4]] = llllllII[105];
        if (llIlIIIlIII(Bank.contains(iArr) ? 1 : 0)) {
        }
        iArr2 = new int[llllllII[3]];
        iArr2[llllllII[4]] = llllllII[10];
        if (llIlIIIlIII(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llllllII[3]];
        iArr3[llllllII[4]] = llllllII[10];
        if (llIlIIIIlll(Bank.contains(iArr3) ? 1 : 0)) {
        }
        bB.add(new C0003d(llllllII[10], llllllII[33], llllllII[114]));
        "".length();
        iArr4 = new int[llllllII[3]];
        iArr4[llllllII[4]] = llllllII[108];
        if (llIlIIIlIII(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[llllllII[3]];
        iArr5[llllllII[4]] = llllllII[7];
        if (llIlIIIIlll(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[llllllII[3]];
        iArr6[llllllII[4]] = llllllII[5];
        if (llIlIIIIlll(Bank.contains(iArr6) ? 1 : 0)) {
        }
        iArr7 = new int[llllllII[3]];
        iArr7[llllllII[4]] = llllllII[6];
        if (llIlIIIIlll(Bank.contains(iArr7) ? 1 : 0)) {
        }
    }

    static {
        llIlIIIIlII();
        llIlIIIIIll();
        gS = llllllII[2];
        hb = llllllII[39];
        hE = llllllII[8];
        gT = llllllII[3];
        gQ = llllllII[0];
        hw = llllllII[118];
        ha = llllllII[60];
        gX = llllllII[18];
        hF = llllllII[9];
        gZ = llllllII[17];
        gU = llllllII[1];
        hA = llllllII[7];
        hz = llllllII[119];
        gY = llllllII[82];
        hx = llllllII[120];
        hD = llllllII[121];
        hC = llllllII[6];
        gR = llllllII[1];
        hc = llllllII[19];
        gV = llllllII[12];
        hB = llllllII[5];
        gW = llllllII[14];
        hy = llllllII[122];
        gF = new WorldPoint(llllllII[123], llllllII[59], llllllII[4]);
        gG = new WorldPoint(llllllII[62], llllllII[124], llllllII[4]);
        gH = new WorldPoint(llllllII[125], llllllII[94], llllllII[4]);
        gI = new WorldArea(llllllII[126], llllllII[127], llllllII[31], llllllII[14], llllllII[4]);
        gJ = new WorldArea(llllllII[128], llllllII[127], llllllII[30], llllllII[14], llllllII[4]);
        gK = new WorldArea(llllllII[129], llllllII[130], llllllII[15], llllllII[22], llllllII[4]);
        gL = new WorldArea(llllllII[131], llllllII[132], llllllII[24], llllllII[15], llllllII[4]);
        gM = new WorldArea(llllllII[133], llllllII[132], llllllII[18], llllllII[13], llllllII[4]);
        gN = new WorldArea(llllllII[134], llllllII[135], llllllII[21], llllllII[18], llllllII[4]);
        gO = new WorldArea(llllllII[136], llllllII[132], llllllII[15], llllllII[15], llllllII[4]);
        gP = new WorldArea(llllllII[137], llllllII[132], llllllII[15], llllllII[13], llllllII[4]);
        hd = new WorldPoint(llllllII[138], llllllII[139], llllllII[1]);
        he = new WorldPoint(llllllII[140], llllllII[141], llllllII[4]);
        hf = new WorldPoint(llllllII[142], llllllII[127], llllllII[4]);
        hg = new WorldPoint(llllllII[143], llllllII[144], llllllII[4]);
        hh = new WorldPoint(llllllII[145], llllllII[146], llllllII[4]);
        hi = new WorldPoint(llllllII[131], llllllII[94], llllllII[4]);
        hj = new WorldPoint(llllllII[147], llllllII[148], llllllII[4]);
        hk = new WorldPoint(llllllII[149], llllllII[150], llllllII[4]);
        hl = new WorldPoint(llllllII[145], llllllII[151], llllllII[4]);
        hm = new WorldPoint(llllllII[131], llllllII[151], llllllII[4]);
        hn = new WorldPoint(llllllII[131], llllllII[152], llllllII[4]);
        ho = new WorldPoint(llllllII[136], llllllII[151], llllllII[4]);
        hp = new WorldPoint(llllllII[136], llllllII[152], llllllII[4]);
        hq = new WorldPoint(llllllII[58], llllllII[153], llllllII[4]);
        hr = new WorldPoint(llllllII[62], llllllII[135], llllllII[4]);
        hs = new WorldPoint(llllllII[154], llllllII[155], llllllII[4]);
        ht = new WorldArea(new WorldPoint(llllllII[156], llllllII[157], llllllII[4]), new WorldPoint(llllllII[58], llllllII[94], llllllII[4]));
        hu = new WorldArea(new WorldPoint(llllllII[145], llllllII[158], llllllII[4]), new WorldPoint(llllllII[159], llllllII[160], llllllII[4]));
        hv = new WorldArea(llllllII[62], llllllII[130], llllllII[14], llllllII[22], llllllII[4]);
        bB = new ArrayList();
        hG = llllllII[161];
        hH = llllllII[162];
        hI = lllllIll[llllllII[163]];
        String[] strArr = new String[llllllII[14]];
        strArr[llllllII[4]] = lllllIll[llllllII[164]];
        strArr[llllllII[3]] = lllllIll[llllllII[165]];
        strArr[llllllII[1]] = lllllIll[llllllII[166]];
        strArr[llllllII[12]] = lllllIll[llllllII[167]];
        strArr[llllllII[15]] = lllllIll[llllllII[168]];
        strArr[llllllII[13]] = lllllIll[llllllII[169]];
        gx = strArr;
        int[] iArr = new int[llllllII[15]];
        iArr[llllllII[4]] = llllllII[170];
        iArr[llllllII[3]] = llllllII[171];
        iArr[llllllII[1]] = llllllII[172];
        iArr[llllllII[12]] = llllllII[173];
        hJ = iArr;
    }
}
