package q.i.e.u.s.s.o.e.i.n.l.f.p000.r.o.p001.p.p002.m.r.o;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.moons.SquireMoonsOfPeril;
import gg.squire.moons.SquireMoonsOfPerilConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Cave nav")
/* renamed from: q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.h  reason: invalid package */
/* loaded from: 75784950-1a80-40ed-8300-cd0507c03978.jar:q/i/e/u/s/s/o/e/i/n/l/f/-/r/o/-/p/-/m/r/o/h.class */
public class h extends Task {
    public static /* synthetic */ int Y;
    private final /* synthetic */ SquireMoonsOfPerilConfig R;
    public static /* synthetic */ int ab;
    public static /* synthetic */ int aa;
    private static /* synthetic */ String[] lIIIIIIlIIlIl;
    public static /* synthetic */ int Z;
    private static /* synthetic */ int[] lIIIIIIlIIllI;
    final /* synthetic */ WorldArea S = new WorldArea(lIIIIIIlIIllI[0], lIIIIIIlIIllI[1], lIIIIIIlIIllI[2], lIIIIIIlIIllI[3], lIIIIIIlIIllI[4]);
    final /* synthetic */ WorldArea T = new WorldArea(lIIIIIIlIIllI[0], lIIIIIIlIIllI[5], lIIIIIIlIIllI[6], lIIIIIIlIIllI[7], lIIIIIIlIIllI[4]);
    final /* synthetic */ WorldArea U = new WorldArea(lIIIIIIlIIllI[8], lIIIIIIlIIllI[9], lIIIIIIlIIllI[10], lIIIIIIlIIllI[11], lIIIIIIlIIllI[4]);
    final /* synthetic */ WorldArea V = new WorldArea(lIIIIIIlIIllI[12], lIIIIIIlIIllI[13], lIIIIIIlIIllI[14], lIIIIIIlIIllI[15], lIIIIIIlIIllI[16]);
    final /* synthetic */ WorldPoint W = new WorldPoint(lIIIIIIlIIllI[17], lIIIIIIlIIllI[18], lIIIIIIlIIllI[4]);
    final /* synthetic */ WorldPoint X = new WorldPoint(lIIIIIIlIIllI[19], lIIIIIIlIIllI[20], lIIIIIIlIIllI[4]);

    private static void lIIlIlllIlllIll() {
        lIIIIIIlIIlIl = new String[lIIIIIIlIIllI[3]];
        lIIIIIIlIIlIl[lIIIIIIlIIllI[4]] = lIIlIlllIlllIII("bHMAJXKAjQ0XVYrcK0AbZO1DUbnvjZdc", "qzQoY");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[16]] = lIIlIlllIlllIIl("lrrrOPqo2htG9UJjeva8x7PGf2MWGdIK", "jvgSi");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[24]] = lIIlIlllIlllIII("SDnx+XiEvkoQr15yd5km8g==", "bfXJg");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[26]] = lIIlIlllIlllIIl("ywEg+AM0DN3KtURs+bGfaw==", "GHmcM");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[27]] = lIIlIlllIlllIIl("gEs7ksdPa/yB2v11yftXvw==", "kwVup");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[29]] = lIIlIlllIlllIII("jfn1knBcoL9aXSE2wt6NTdGGYTD/56Sp", "rKKcX");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[30]] = lIIlIlllIlllIIl("ovmC6/p8fsxYl42J1MvHtjQs2zZhC6uv", "sPVBd");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[31]] = lIIlIlllIlllIII("v85KXprCAbhziHrnjAp0lA==", "EIqNm");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[32]] = lIIlIlllIlllIIl("RwwJpxOx/b1IHYcuVYVejg==", "OdNYx");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[28]] = lIIlIlllIlllIIl("bZWO6oF1jqDwUNCEoLFQgf+K1XaD+nW2", "oHeRn");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[34]] = lIIlIlllIlllIlI("PgQaKR8AAkk/GBoXCDQVCw==", "neiZv");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[35]] = lIIlIlllIlllIIl("hG0Ju/ZIRQoUtgLFmQRGww==", "zHbpn");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[36]] = lIIlIlllIlllIII("gwrgw/8pMr7exk09SvlaCw==", "OfPNq");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[37]] = lIIlIlllIlllIlI("KAwcIX4GGAc0Mg==", "emwDS");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[40]] = lIIlIlllIlllIIl("5wdcYh3AxCT7VlC6/ReYVgbuKwDSVthX", "pEEIc");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[41]] = lIIlIlllIlllIlI("OggGJzEEDlUxNh4bFDo7Dw==", "jiuTX");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[42]] = lIIlIlllIlllIII("iscRIvtyMCvNLggZRDqflQ==", "mJoDR");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[43]] = lIIlIlllIlllIIl("UJwCDvlUhYnCCjFAWU8fsg==", "tpvaZ");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[44]] = lIIlIlllIlllIII("XKfnEbcobr5ujy3tVv5qpQ==", "NZcPf");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[47]] = lIIlIlllIlllIlI("DQUfYQUsRAwgAzcMCy4ELQBJJR4sFg==", "CdiAq");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[48]] = lIIlIlllIlllIII("Om8mjTvk0NEdxhQveQHzp+UeQpCVQIYq", "LQdeQ");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[49]] = lIIlIlllIlllIIl("XMF5KvDg4S9ZWOPIhv5Qug==", "jVUrq");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[50]] = lIIlIlllIlllIlI("PRolDA0QBitCEhwJ", "yhLbf");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[51]] = lIIlIlllIlllIII("4ffC3AR6UD8tYY/rOWD9cA==", "vkVaM");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[54]] = lIIlIlllIlllIIl("CqTjpVv2eHKti008Y4EZfwLU6kuKPeQ+", "tGAHj");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[55]] = lIIlIlllIlllIII("nP/iZQJ2o6tuWohT2eHWmw==", "guCNY");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[56]] = lIIlIlllIlllIIl("1zhTAftYp2DZGU9XDaZvIQ==", "HGVjo");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[57]] = lIIlIlllIlllIlI("Jig5O2wCITgnNBEh", "vIJHA");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[59]] = lIIlIlllIlllIIl("Le+PFRDvjdWwVQQUtOS6msd8tzv/uyX8", "ykPnT");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[60]] = lIIlIlllIlllIII("Q+sZ4HefeYnayJW9KV8OYKxBn1lqngoS", "LWmPs");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[61]] = lIIlIlllIlllIII("2O932T7hrszXQp+sU4s2Ng==", "yXRQT");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[62]] = lIIlIlllIlllIIl("hOE/DxKi2jAI2GnNlyAu2w==", "VohOA");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[63]] = lIIlIlllIlllIII("snn+UQsRWiJbc99SP0Ub1Q==", "rauGp");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[66]] = lIIlIlllIlllIII("9zcg/n6+2RaaBAQU8pjfhW34LvbqpejyxF2q17XbR3U=", "bDhlA");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[67]] = lIIlIlllIlllIII("G6QzDM+gdZl5GMtmQZzxbQ8sRjH3Boxl", "QChBK");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[68]] = lIIlIlllIlllIIl("4WQttUlwNyiCEKKG3iKfFw==", "HPwws");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[69]] = lIIlIlllIlllIII("kIbKFShMzlJq6iRZhCeR8g==", "unafx");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[70]] = lIIlIlllIlllIIl("/HSCiZrD084Ljr5I5Z1e4A==", "smLNX");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[71]] = lIIlIlllIlllIIl("5/Y5/xI2Z3JIZY9Huaw4TDpWIyKnjocN", "uZabH");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[72]] = lIIlIlllIlllIIl("4yC9Fa1SqZop+VUuM2V8/RJYL3tqFBzF", "nApIV");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[73]] = lIIlIlllIlllIlI("JDI8C0wAOz0XFBM7", "tSOxa");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[74]] = lIIlIlllIlllIlI("CTMiAC0kLyxOMigg", "MAKnF");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[75]] = lIIlIlllIlllIIl("2tdvTVjOC88Mu9Btr2dkZg==", "ceYVh");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[76]] = lIIlIlllIlllIIl("UI/KzaGhttVWrkSzU34QcOiYb4SC+Qwm", "BWZUi");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[77]] = lIIlIlllIlllIlI("Nh4RDSVTEgkHOBdQCAc4HQ==", "spehW");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[78]] = lIIlIlllIlllIII("hXFmwTrzj4vaG0+43kSMwg==", "SgWkY");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[15]] = lIIlIlllIlllIII("uesc+0QPHOxPqAdj83qN3A==", "aiMMu");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[79]] = lIIlIlllIlllIlI("AgsgQyoiDzYO", "PjWcH");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[80]] = lIIlIlllIlllIlI("BSo/CikiZTITKSco", "FEPaL");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[81]] = lIIlIlllIlllIII("xEQGybPZiDuUFdCRkKDkHg==", "SfdHN");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[14]] = lIIlIlllIlllIIl("v598vMq9b9dIkMaDr+p/iQ==", "LcXbH");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[82]] = lIIlIlllIlllIII("OfhlWO5OEFciFfH/pIkEWA==", "XggWu");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[83]] = lIIlIlllIlllIIl("vWOThZ8wYy56w0wb5ltAzQ==", "GhNiB");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[2]] = lIIlIlllIlllIII("EXmr07Zr7F5b5QYj7YKh0A==", "qnoyK");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[84]] = lIIlIlllIlllIIl("cEbHcLtmOivfk3CLHfc+sQ==", "iUoLh");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[85]] = lIIlIlllIlllIII("VKM/bnxb7Vdmupl1u47Arw==", "yunwi");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[86]] = lIIlIlllIlllIII("pltgwbB/2i/oyzGRa0Xk9g==", "dPhDI");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[87]] = lIIlIlllIlllIIl("sknQAlKdbfEz+zBX/O1luw==", "evIIm");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[88]] = lIIlIlllIlllIIl("f3/yPUEtQNWu8BvUfKq1uQ==", "oLjra");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[89]] = lIIlIlllIlllIII("nvh4HwleH/Mpmi3kjIiJgw==", "hVlLW");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[10]] = lIIlIlllIlllIlI("KwMNIAAGC0I4HQcaBw==", "hlbKi");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[90]] = lIIlIlllIlllIIl("I05v0u/0qbUvr8QWzGWfHQ==", "jJVBD");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[91]] = lIIlIlllIlllIlI("MxsEODEeE0sgLB8CDg==", "ptkSX");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[11]] = lIIlIlllIlllIII("zo6Aqk+jpqwRNPcER87POA==", "GZpFY");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[92]] = lIIlIlllIlllIII("qZArvdGdZfU3rjTw+430RQ==", "FCwVZ");
        lIIIIIIlIIlIl[lIIIIIIlIIllI[93]] = lIIlIlllIlllIlI("AjomFAMpNzc=", "GTRfb");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v123, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v130, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v147, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v153, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v160, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v173, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v179, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v183, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v231, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v239, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v254, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v271, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v277, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v284, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v301, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v307, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v314, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v327, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v333, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v337, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v372, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v381, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v396, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v409, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v415, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v419, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [boolean] */
    public boolean run() {
        ab = this.R.minimumFood();
        Y = this.R.minimumBlueMoonFood();
        aa = this.R.minimumBloodMoonFood();
        Z = this.R.minimumEclipseMoonFood();
        if (lIIlIlllIllllIl(Vars.getBit(lIIIIIIlIIllI[21]))) {
            if (lIIlIlllIllllIl(d() ? 1 : 0) && lIIlIlllIllllIl(k.j() ? 1 : 0)) {
                k.f();
                return lIIIIIIlIIllI[4];
            } else if (lIIlIlllIlllllI(d() ? 1 : 0)) {
                if (lIIlIlllIlllllI(this.V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint worldPoint = new WorldPoint(lIIIIIIlIIllI[22], lIIIIIIlIIllI[23], lIIIIIIlIIllI[16]);
                    TileObject nearest = TileObjects.getNearest(tileObject -> {
                        if (lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[93]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[29])) {
                            ?? r0 = lIIIIIIlIIllI[16];
                            "".length();
                            return "   ".length() <= (-" ".length()) ? ((93 ^ 115) ^ (169 ^ 149)) & (((134 ^ 160) ^ (242 ^ 198)) ^ (-" ".length())) : r0;
                        }
                        return lIIIIIIlIIllI[4];
                    });
                    if (lIIlIlllIllllll(nearest)) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[4]];
                        Movement.walkTo(worldPoint);
                        "".length();
                        return lIIIIIIlIIllI[4];
                    } else if (lIIlIllllIIIIII(nearest)) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[16]];
                        nearest.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[24]]);
                        return lIIIIIIlIIllI[4];
                    }
                }
                if (lIIlIlllIlllllI(this.U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                        if (lIIlIlllIlllllI(tileObject2.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[92]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject2.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                            ?? r0 = lIIIIIIlIIllI[16];
                            "".length();
                            return 0 != 0 ? ((81 ^ 14) ^ (103 ^ 125)) & (((((127 + 114) - 216) + 185) ^ (((149 + 48) - 93) + 47)) ^ (-" ".length())) : r0;
                        }
                        return lIIIIIIlIIllI[4];
                    });
                    if (lIIlIllllIIIIII(nearest2) && lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[26]];
                        nearest2.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[27]]);
                        return lIIIIIIlIIllI[16];
                    } else if (lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(this.X), lIIIIIIlIIllI[28]) && (!lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25]) || !lIIlIllllIIIIII(nearest2) || (lIIlIllllIIIIII(nearest2) && lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(nearest2.getWorldLocation()), lIIIIIIlIIllI[29])))) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[29]];
                        Movement.walkTo(this.X);
                        "".length();
                        return lIIIIIIlIIllI[16];
                    } else if (lIIlIllllIIIIll(Players.getLocal().getWorldLocation().distanceTo(this.X), lIIIIIIlIIllI[28])) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[30]];
                        String[] strArr = new String[lIIIIIIlIIllI[16]];
                        strArr[lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[31]];
                        TileObject nearest3 = TileObjects.getNearest(strArr);
                        if (lIIlIllllIIIIII(nearest3)) {
                            nearest3.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[32]]);
                            return lIIIIIIlIIllI[16];
                        }
                    }
                }
            }
        }
        if (lIIlIllllIIIlII(Vars.getBit(lIIIIIIlIIllI[21]), lIIIIIIlIIllI[16]) && lIIlIlllIllllIl(Vars.getBit(lIIIIIIlIIllI[33]))) {
            if (lIIlIlllIllllIl(d() ? 1 : 0) && lIIlIlllIllllIl(k.j() ? 1 : 0)) {
                k.f();
                return lIIIIIIlIIllI[4];
            }
            if (lIIlIlllIlllllI(this.V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint worldPoint2 = new WorldPoint(lIIIIIIlIIllI[22], lIIIIIIlIIllI[23], lIIIIIIlIIllI[16]);
                TileObject nearest4 = TileObjects.getNearest(tileObject3 -> {
                    if (lIIlIlllIlllllI(tileObject3.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[11]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject3.getWorldLocation().distanceTo(worldPoint2), lIIIIIIlIIllI[29])) {
                        ?? r0 = lIIIIIIlIIllI[16];
                        "".length();
                        return (-" ".length()) >= " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIIIIlIIllI[4];
                });
                if (lIIlIlllIllllll(nearest4)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[28]];
                    Movement.walkTo(worldPoint2);
                    "".length();
                    return lIIIIIIlIIllI[4];
                } else if (lIIlIllllIIIIII(nearest4)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[34]];
                    nearest4.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[35]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (lIIlIlllIlllllI(this.S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest5 = TileObjects.getNearest(tileObject4 -> {
                    if (lIIlIlllIlllllI(tileObject4.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[91]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject4.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        ?? r0 = lIIIIIIlIIllI[16];
                        "".length();
                        return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIIIIlIIllI[4];
                });
                if (lIIlIllllIIIIII(nearest5) && lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[36]];
                    nearest5.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[37]]);
                    return lIIIIIIlIIllI[16];
                }
                WorldPoint worldPoint3 = new WorldPoint(lIIIIIIlIIllI[38], lIIIIIIlIIllI[39], lIIIIIIlIIllI[4]);
                TileObject nearest6 = TileObjects.getNearest(tileObject5 -> {
                    if (lIIlIlllIlllllI(tileObject5.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[90]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject5.getWorldLocation().distanceTo(worldPoint3), lIIIIIIlIIllI[29])) {
                        ?? r0 = lIIIIIIlIIllI[16];
                        "".length();
                        return (-"   ".length()) > 0 ? ((68 ^ 111) ^ (141 ^ 148)) & (((99 ^ 126) ^ (68 ^ 107)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlIIllI[4];
                });
                if (lIIlIlllIllllll(nearest6)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[40]];
                    Movement.walkTo(worldPoint3);
                    "".length();
                    return lIIIIIIlIIllI[4];
                } else if (lIIlIllllIIIIII(nearest6)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[41]];
                    nearest6.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[42]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (lIIlIlllIlllllI(this.U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest7 = TileObjects.getNearest(tileObject6 -> {
                    if (lIIlIlllIlllllI(tileObject6.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[10]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject6.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        ?? r0 = lIIIIIIlIIllI[16];
                        "".length();
                        return (-" ".length()) == "   ".length() ? ((((58 + 202) - 228) + 181) ^ (((79 + 183) - 219) + 154)) & (((48 ^ 74) ^ (31 ^ 117)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlIIllI[4];
                });
                if (lIIlIllllIIIIII(nearest7) && lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[43]];
                    nearest7.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[44]]);
                    return lIIIIIIlIIllI[16];
                }
                WorldPoint worldPoint4 = new WorldPoint(lIIIIIIlIIllI[45], lIIIIIIlIIllI[46], lIIIIIIlIIllI[4]);
                TileObject nearest8 = TileObjects.getNearest(tileObject7 -> {
                    if (lIIlIlllIlllllI(tileObject7.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[89]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject7.getWorldLocation().distanceTo(worldPoint4), lIIIIIIlIIllI[29])) {
                        ?? r0 = lIIIIIIlIIllI[16];
                        "".length();
                        return ((90 ^ 16) & ((29 ^ 87) ^ (-1))) < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIIIIlIIllI[4];
                });
                if (lIIlIlllIllllll(nearest8)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[47]];
                    Movement.walkTo(worldPoint4);
                    "".length();
                    return lIIIIIIlIIllI[4];
                } else if (lIIlIllllIIIIII(nearest8)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[48]];
                    nearest8.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[49]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (lIIlIlllIlllllI(this.T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlllIlllllI(d() ? 1 : 0)) {
                TileObject nearest9 = TileObjects.getNearest(tileObject8 -> {
                    if (lIIlIlllIlllllI(tileObject8.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[88]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject8.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        ?? r0 = lIIIIIIlIIllI[16];
                        "".length();
                        return ((128 ^ 190) & ((8 ^ 54) ^ (-1))) > (97 ^ 101) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIIIIlIIllI[4];
                });
                if (lIIlIllllIIIIII(nearest9) && lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[50]];
                    nearest9.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[51]]);
                    return lIIIIIIlIIllI[16];
                }
                WorldPoint worldPoint5 = new WorldPoint(lIIIIIIlIIllI[52], lIIIIIIlIIllI[53], lIIIIIIlIIllI[4]);
                if (lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lIIIIIIlIIllI[28]) && (!lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25]) || !lIIlIllllIIIIII(nearest9) || (lIIlIllllIIIIII(nearest9) && lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(nearest9.getWorldLocation()), lIIIIIIlIIllI[29])))) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[54]];
                    Movement.walkTo(worldPoint5);
                    "".length();
                    return lIIIIIIlIIllI[16];
                } else if (lIIlIllllIIIIll(Players.getLocal().getWorldLocation().distanceTo(worldPoint5), lIIIIIIlIIllI[28])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[55]];
                    String[] strArr2 = new String[lIIIIIIlIIllI[16]];
                    strArr2[lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[56]];
                    TileObject nearest10 = TileObjects.getNearest(strArr2);
                    if (lIIlIllllIIIIII(nearest10)) {
                        nearest10.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[57]]);
                        return lIIIIIIlIIllI[16];
                    }
                }
            }
        }
        if (lIIlIllllIIIlII(Vars.getBit(lIIIIIIlIIllI[21]), lIIIIIIlIIllI[16]) && lIIlIllllIIIlII(Vars.getBit(lIIIIIIlIIllI[33]), lIIIIIIlIIllI[16]) && lIIlIlllIllllIl(Vars.getBit(lIIIIIIlIIllI[58]))) {
            if (lIIlIlllIllllIl(d() ? 1 : 0) && lIIlIlllIllllIl(k.j() ? 1 : 0)) {
                k.f();
                return lIIIIIIlIIllI[4];
            }
            if (lIIlIlllIlllllI(this.V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                WorldPoint worldPoint6 = new WorldPoint(lIIIIIIlIIllI[22], lIIIIIIlIIllI[23], lIIIIIIlIIllI[16]);
                TileObject nearest11 = TileObjects.getNearest(tileObject9 -> {
                    if (lIIlIlllIlllllI(tileObject9.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[87]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject9.getWorldLocation().distanceTo(worldPoint6), lIIIIIIlIIllI[29])) {
                        ?? r0 = lIIIIIIlIIllI[16];
                        "".length();
                        return ((103 ^ 95) & ((10 ^ 50) ^ (-1))) > " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIIIIlIIllI[4];
                });
                if (lIIlIlllIllllll(nearest11)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[59]];
                    Movement.walkTo(worldPoint6);
                    "".length();
                    return lIIIIIIlIIllI[4];
                } else if (lIIlIllllIIIIII(nearest11)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[60]];
                    nearest11.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[61]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (lIIlIlllIlllllI(this.T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest12 = TileObjects.getNearest(tileObject10 -> {
                    if (lIIlIlllIlllllI(tileObject10.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[86]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject10.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        ?? r0 = lIIIIIIlIIllI[16];
                        "".length();
                        return "   ".length() <= "  ".length() ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlIIllI[4];
                });
                if (lIIlIllllIIIIII(nearest12) && lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[62]];
                    nearest12.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[63]]);
                    return lIIIIIIlIIllI[16];
                }
                WorldPoint worldPoint7 = new WorldPoint(lIIIIIIlIIllI[64], lIIIIIIlIIllI[65], lIIIIIIlIIllI[4]);
                TileObject nearest13 = TileObjects.getNearest(tileObject11 -> {
                    if (lIIlIlllIlllllI(tileObject11.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[85]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject11.getWorldLocation().distanceTo(worldPoint7), lIIIIIIlIIllI[31])) {
                        ?? r0 = lIIIIIIlIIllI[16];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIIIIlIIllI[4];
                });
                if (lIIlIlllIllllll(nearest13)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[66]];
                    Movement.walkTo(worldPoint7);
                    "".length();
                    return lIIIIIIlIIllI[4];
                } else if (lIIlIllllIIIIII(nearest13)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[67]];
                    nearest13.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[68]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (lIIlIlllIlllllI(this.U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                TileObject nearest14 = TileObjects.getNearest(tileObject12 -> {
                    if (lIIlIlllIlllllI(tileObject12.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[84]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject12.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        ?? r0 = lIIIIIIlIIllI[16];
                        "".length();
                        return " ".length() <= (((((83 + 16) - 85) + 139) ^ (((128 + 71) - 182) + 162)) & (((61 ^ 22) ^ " ".length()) ^ (-" ".length()))) ? ((((118 + 2) - 99) + 124) ^ (((53 + 160) - 78) + 45)) & (((244 ^ 137) ^ (194 ^ 154)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlIIllI[4];
                });
                if (lIIlIllllIIIIII(nearest14) && lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[69]];
                    nearest14.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[70]]);
                    return lIIIIIIlIIllI[16];
                }
                WorldPoint worldPoint8 = new WorldPoint(lIIIIIIlIIllI[45], lIIIIIIlIIllI[46], lIIIIIIlIIllI[4]);
                TileObject nearest15 = TileObjects.getNearest(tileObject13 -> {
                    if (lIIlIlllIlllllI(tileObject13.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[2]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject13.getWorldLocation().distanceTo(worldPoint8), lIIIIIIlIIllI[29])) {
                        ?? r0 = lIIIIIIlIIllI[16];
                        "".length();
                        return "  ".length() > "  ".length() ? ((121 ^ 13) ^ (240 ^ 185)) & (((2 ^ 40) ^ (100 ^ 115)) ^ (-" ".length())) : r0;
                    }
                    return lIIIIIIlIIllI[4];
                });
                if (lIIlIlllIllllll(nearest15)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[71]];
                    Movement.walkTo(worldPoint8);
                    "".length();
                    return lIIIIIIlIIllI[4];
                } else if (lIIlIllllIIIIII(nearest15)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[72]];
                    nearest15.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[73]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (lIIlIlllIlllllI(this.S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIIlIlllIlllllI(d() ? 1 : 0)) {
                TileObject nearest16 = TileObjects.getNearest(tileObject14 -> {
                    if (lIIlIlllIlllllI(tileObject14.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[83]]) ? 1 : 0) && lIIlIllllIIIIll(tileObject14.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        ?? r0 = lIIIIIIlIIllI[16];
                        "".length();
                        return (-"   ".length()) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return lIIIIIIlIIllI[4];
                });
                if (lIIlIllllIIIIII(nearest16) && lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[74]];
                    nearest16.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[75]]);
                    return lIIIIIIlIIllI[16];
                } else if (lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(this.W), lIIIIIIlIIllI[28]) && (!lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25]) || !lIIlIllllIIIIII(nearest16) || (lIIlIllllIIIIII(nearest16) && lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(nearest16.getWorldLocation()), lIIIIIIlIIllI[29])))) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[76]];
                    Movement.walkTo(this.W);
                    "".length();
                    return lIIIIIIlIIllI[16];
                } else if (lIIlIllllIIIIll(Players.getLocal().getWorldLocation().distanceTo(this.W), lIIIIIIlIIllI[28])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[77]];
                    String[] strArr3 = new String[lIIIIIIlIIllI[16]];
                    strArr3[lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[78]];
                    TileObject nearest17 = TileObjects.getNearest(strArr3);
                    if (lIIlIllllIIIIII(nearest17)) {
                        nearest17.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[15]]);
                        return lIIIIIIlIIllI[16];
                    }
                }
            }
        }
        return lIIIIIIlIIllI[4];
    }

    private static boolean lIIlIllllIIIIIl(int i, int i2) {
        return i < i2;
    }

    static {
        lIIlIlllIllllII();
        lIIlIlllIlllIll();
    }

    private static String lIIlIlllIlllIII(String lllllllllllllllIIIllllIIIIIIIIIl, String lllllllllllllllIIIllllIIIIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIIllllIIIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIllllIIIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIIIIlIIllI[24], lllllllllllllllIIIllllIIIIIIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIllllIIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIllllIIIIIIIIlI) {
            lllllllllllllllIIIllllIIIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllIllllII() {
        lIIIIIIlIIllI = new int[94];
        lIIIIIIlIIllI[0] = (-19138) & 20479;
        lIIIIIIlIIllI[1] = (-22529) & 32061;
        lIIIIIIlIIllI[2] = (((73 + 163) - 143) + 73) ^ (((125 + 101) - 146) + 67);
        lIIIIIIlIIllI[3] = (153 ^ 147) ^ (103 ^ 47);
        lIIIIIIlIIllI[4] = (159 ^ 146) & ((148 ^ 153) ^ (-1));
        lIIIIIIlIIllI[5] = (-((-33) & 4705)) & (-16386) & 30719;
        lIIIIIIlIIllI[6] = (80 ^ 2) ^ (129 ^ 151);
        lIIIIIIlIIllI[7] = (70 ^ 121) ^ (171 ^ 192);
        lIIIIIIlIIllI[8] = (-((-833) & 21359)) & (-10257) & 32255;
        lIIIIIIlIIllI[9] = (-((-26377) & 32585)) & (-1) & 15871;
        lIIIIIIlIIllI[10] = (((61 + 116) - 167) + 129) ^ (((39 + 157) - 130) + 117);
        lIIIIIIlIIllI[11] = (((158 + 62) - 164) + 113) ^ (((5 + 147) - 40) + 38);
        lIIIIIIlIIllI[12] = (-((-1155) & 15499)) & (-66) & 15823;
        lIIIIIIlIIllI[13] = (-((-3091) & 19539)) & (-33) & 26091;
        lIIIIIIlIIllI[14] = 93 ^ 111;
        lIIIIIIlIIllI[15] = 47 ^ 1;
        lIIIIIIlIIllI[16] = " ".length();
        lIIIIIIlIIllI[17] = (-((-98) & 14567)) & (-16401) & 32255;
        lIIIIIIlIIllI[18] = (-((-22497) & 24545)) & (-522) & 12159;
        lIIIIIIlIIllI[19] = (-((-31065) & 31579)) & (-10257) & 12279;
        lIIIIIIlIIllI[20] = (-4641) & 14315;
        lIIIIIIlIIllI[21] = (-22905) & 32764;
        lIIIIIIlIIllI[22] = (-((-4196) & 23151)) & (-8197) & 28607;
        lIIIIIIlIIllI[23] = (-6150) & 15797;
        lIIIIIIlIIllI[24] = "  ".length();
        lIIIIIIlIIllI[25] = 118 ^ 48;
        lIIIIIIlIIllI[26] = "   ".length();
        lIIIIIIlIIllI[27] = 173 ^ 169;
        lIIIIIIlIIllI[28] = 189 ^ 180;
        lIIIIIIlIIllI[29] = (220 ^ 144) ^ (116 ^ 61);
        lIIIIIIlIIllI[30] = 20 ^ 18;
        lIIIIIIlIIllI[31] = (238 ^ 167) ^ (26 ^ 84);
        lIIIIIIlIIllI[32] = (((116 + 105) - 59) + 42) ^ (((11 + 130) - 77) + 132);
        lIIIIIIlIIllI[33] = (-((-13607) & 32127)) & (-1) & 28379;
        lIIIIIIlIIllI[34] = 53 ^ 63;
        lIIIIIIlIIllI[35] = 202 ^ 193;
        lIIIIIIlIIllI[36] = (61 ^ 41) ^ (167 ^ 191);
        lIIIIIIlIIllI[37] = 155 ^ 150;
        lIIIIIIlIIllI[38] = (-((-9217) & 30385)) & (-4) & 22519;
        lIIIIIIlIIllI[39] = (-20617) & 30207;
        lIIIIIIlIIllI[40] = 24 ^ 22;
        lIIIIIIlIIllI[41] = (8 ^ 2) ^ (35 ^ 38);
        lIIIIIIlIIllI[42] = (((42 + 53) - (-35)) + 2) ^ (((10 + 79) - (-47)) + 12);
        lIIIIIIlIIllI[43] = 113 ^ 96;
        lIIIIIIlIIllI[44] = 186 ^ 168;
        lIIIIIIlIIllI[45] = (-((-19978) & 28175)) & (-2057) & 11775;
        lIIIIIIlIIllI[46] = (-2569) & 12287;
        lIIIIIIlIIllI[47] = (96 ^ 67) ^ (175 ^ 159);
        lIIIIIIlIIllI[48] = (3 ^ 31) ^ (171 ^ 163);
        lIIIIIIlIIllI[49] = (46 ^ 18) ^ (87 ^ 126);
        lIIIIIIlIIllI[50] = 215 ^ 193;
        lIIIIIIlIIllI[51] = (230 ^ 141) ^ (237 ^ 145);
        lIIIIIIlIIllI[52] = (-31365) & 32767;
        lIIIIIIlIIllI[53] = (-((-69) & 21079)) & (-6) & 30719;
        lIIIIIIlIIllI[54] = (255 ^ 179) ^ (57 ^ 109);
        lIIIIIIlIIllI[55] = 17 ^ 8;
        lIIIIIIlIIllI[56] = (75 ^ 104) ^ (126 ^ 71);
        lIIIIIIlIIllI[57] = 17 ^ 10;
        lIIIIIIlIIllI[58] = (-((-9421) & 11741)) & (-20546) & 32723;
        lIIIIIIlIIllI[59] = 4 ^ 24;
        lIIIIIIlIIllI[60] = 121 ^ 100;
        lIIIIIIlIIllI[61] = (40 ^ 61) ^ (141 ^ 134);
        lIIIIIIlIIllI[62] = (((141 + 130) - 176) + 128) ^ (((111 + 52) - 90) + 119);
        lIIIIIIlIIllI[63] = (180 ^ 148) ^ ((51 ^ 39) & ((2 ^ 22) ^ (-1)));
        lIIIIIIlIIllI[64] = (-((-22041) & 32313)) & (-4227) & 15871;
        lIIIIIIlIIllI[65] = (-((-133) & 6799)) & (-16385) & 32719;
        lIIIIIIlIIllI[66] = 76 ^ 109;
        lIIIIIIlIIllI[67] = 171 ^ 137;
        lIIIIIIlIIllI[68] = (19 ^ 36) ^ (131 ^ 151);
        lIIIIIIlIIllI[69] = (74 ^ 107) ^ (60 ^ 57);
        lIIIIIIlIIllI[70] = 96 ^ 69;
        lIIIIIIlIIllI[71] = (93 ^ 74) ^ (7 ^ 54);
        lIIIIIIlIIllI[72] = 104 ^ 79;
        lIIIIIIlIIllI[73] = (((59 + 153) - 60) + 37) ^ (((99 + 98) - 156) + 108);
        lIIIIIIlIIllI[74] = (6 ^ 37) ^ (49 ^ 59);
        lIIIIIIlIIllI[75] = (243 ^ 128) ^ (105 ^ 48);
        lIIIIIIlIIllI[76] = 20 ^ 63;
        lIIIIIIlIIllI[77] = 69 ^ 105;
        lIIIIIIlIIllI[78] = 56 ^ 21;
        lIIIIIIlIIllI[79] = (12 ^ 43) ^ (142 ^ 134);
        lIIIIIIlIIllI[80] = (((109 + 179) - 146) + 44) ^ (((32 + 45) - 15) + 76);
        lIIIIIIlIIllI[81] = (199 ^ 165) ^ (13 ^ 94);
        lIIIIIIlIIllI[82] = (73 ^ 53) ^ (110 ^ 33);
        lIIIIIIlIIllI[83] = (55 ^ 114) ^ (32 ^ 81);
        lIIIIIIlIIllI[84] = (67 ^ 125) ^ (44 ^ 36);
        lIIIIIIlIIllI[85] = 66 ^ 117;
        lIIIIIIlIIllI[86] = 18 ^ 42;
        lIIIIIIlIIllI[87] = 179 ^ 138;
        lIIIIIIlIIllI[88] = 112 ^ 74;
        lIIIIIIlIIllI[89] = 141 ^ 182;
        lIIIIIIlIIllI[90] = 178 ^ 143;
        lIIIIIIlIIllI[91] = (((79 + 48) - 4) + 12) ^ (((166 + 71) - 210) + 158);
        lIIIIIIlIIllI[92] = (102 ^ 62) ^ (162 ^ 186);
        lIIIIIIlIIllI[93] = (91 ^ 70) ^ (13 ^ 81);
    }

    private static String lIIlIlllIlllIIl(String lllllllllllllllIIIlllIllllIlllII, String lllllllllllllllIIIlllIllllIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllIllllIllIll.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIIllI[32]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIIlIIllI[24], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllIllllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIlllIllllIlllIl) {
            lllllllllllllllIIIlllIllllIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllllIIIIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIIlIllllIIIIII(Object obj) {
        return obj != null;
    }

    private static boolean lIIlIlllIllllll(Object obj) {
        return obj == null;
    }

    private static String lIIlIlllIlllIlI(String lllllllllllllllIIIlllIlllllIllII, String lllllllllllllllIIIlllIllllllIIII) {
        String lllllllllllllllIIIlllIlllllIllII2 = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllIlllllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIIIlllIlllllIlllI = lllllllllllllllIIIlllIllllllIIII.toCharArray();
        int lllllllllllllllIIIlllIlllllIllIl = lIIIIIIlIIllI[4];
        char[] charArray = lllllllllllllllIIIlllIlllllIllII2.toCharArray();
        int length = charArray.length;
        int i = lIIIIIIlIIllI[4];
        while (lIIlIllllIIIIIl(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIIIlllIlllllIlllI[lllllllllllllllIIIlllIlllllIllIl % lllllllllllllllIIIlllIlllllIlllI.length]));
            "".length();
            lllllllllllllllIIIlllIlllllIllIl++;
            i++;
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public h(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.R = squireMoonsOfPerilConfig;
    }

    private static boolean lIIlIlllIllllIl(int i) {
        return i == 0;
    }

    private static boolean lIIlIllllIIIlII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIllllIIIlIl(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
        if (lIIlIlllIlllllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c9, code lost:
        if (lIIlIlllIlllllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0151, code lost:
        if (lIIlIlllIlllllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d() {
        if (lIIlIlllIllllIl(Vars.getBit(lIIIIIIlIIllI[21])) && lIIlIlllIllllIl(Vars.getBit(lIIIIIIlIIllI[33])) && lIIlIlllIllllIl(Vars.getBit(lIIIIIIlIIllI[58]))) {
            if (lIIlIlllIlllllI(Inventory.isFull() ? 1 : 0)) {
                String[] strArr = new String[lIIIIIIlIIllI[16]];
                strArr[lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[79]];
            }
            return lIIIIIIlIIllI[4];
        }
        if (lIIlIllllIIIlII(Vars.getBit(lIIIIIIlIIllI[21]), lIIIIIIlIIllI[16]) && lIIlIlllIllllIl(Vars.getBit(lIIIIIIlIIllI[33]))) {
            String[] strArr2 = new String[lIIIIIIlIIllI[16]];
            strArr2[lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[80]];
            if (lIIlIllllIIIlIl(Inventory.getCount(strArr2), Y)) {
                String[] strArr3 = new String[lIIIIIIlIIllI[16]];
                strArr3[lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[81]];
            }
            return lIIIIIIlIIllI[4];
        }
        if (lIIlIllllIIIlII(Vars.getBit(lIIIIIIlIIllI[21]), lIIIIIIlIIllI[16]) && lIIlIllllIIIlII(Vars.getBit(lIIIIIIlIIllI[33]), lIIIIIIlIIllI[16]) && lIIlIlllIllllIl(Vars.getBit(lIIIIIIlIIllI[58]))) {
            String[] strArr4 = new String[lIIIIIIlIIllI[16]];
            strArr4[lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[14]];
            if (lIIlIllllIIIlIl(Inventory.getCount(strArr4), aa)) {
                String[] strArr5 = new String[lIIIIIIlIIllI[16]];
                strArr5[lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[82]];
            }
            return lIIIIIIlIIllI[4];
        }
        return lIIIIIIlIIllI[16];
    }

    private static boolean lIIlIllllIIIIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIlllIlllllI(int i) {
        return i != 0;
    }
}
