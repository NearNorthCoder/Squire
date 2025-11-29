/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o;

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
import q.i.e.u.s.s.o.e.i.n.l.f.-.r.o.-.p.-.m.r.o.k;

@TaskDesc(name="Cave nav")
public class h
extends Task {
    public static /* synthetic */ int Y;
    final /* synthetic */ WorldPoint W;
    final /* synthetic */ WorldArea V;
    private final /* synthetic */ SquireMoonsOfPerilConfig R;
    final /* synthetic */ WorldArea U;
    final /* synthetic */ WorldPoint X;
    public static /* synthetic */ int ab;
    final /* synthetic */ WorldArea S;
    public static /* synthetic */ int aa;
    private static /* synthetic */ String[] lIIIIIIlIIlIl;
    public static /* synthetic */ int Z;
    final /* synthetic */ WorldArea T;
    private static /* synthetic */ int[] lIIIIIIlIIllI;

    private static void lIIlIlllIlllIll() {
        lIIIIIIlIIlIl = new String[lIIIIIIlIIllI[3]];
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[4]] = h.lIIlIlllIlllIII("bHMAJXKAjQ0XVYrcK0AbZO1DUbnvjZdc", "qzQoY");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[16]] = h.lIIlIlllIlllIIl("lrrrOPqo2htG9UJjeva8x7PGf2MWGdIK", "jvgSi");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[24]] = h.lIIlIlllIlllIII("SDnx+XiEvkoQr15yd5km8g==", "bfXJg");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[26]] = h.lIIlIlllIlllIIl("ywEg+AM0DN3KtURs+bGfaw==", "GHmcM");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[27]] = h.lIIlIlllIlllIIl("gEs7ksdPa/yB2v11yftXvw==", "kwVup");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[29]] = h.lIIlIlllIlllIII("jfn1knBcoL9aXSE2wt6NTdGGYTD/56Sp", "rKKcX");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[30]] = h.lIIlIlllIlllIIl("ovmC6/p8fsxYl42J1MvHtjQs2zZhC6uv", "sPVBd");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[31]] = h.lIIlIlllIlllIII("v85KXprCAbhziHrnjAp0lA==", "EIqNm");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[32]] = h.lIIlIlllIlllIIl("RwwJpxOx/b1IHYcuVYVejg==", "OdNYx");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[28]] = h.lIIlIlllIlllIIl("bZWO6oF1jqDwUNCEoLFQgf+K1XaD+nW2", "oHeRn");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[34]] = h.lIIlIlllIlllIlI("PgQaKR8AAkk/GBoXCDQVCw==", "neiZv");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[35]] = h.lIIlIlllIlllIIl("hG0Ju/ZIRQoUtgLFmQRGww==", "zHbpn");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[36]] = h.lIIlIlllIlllIII("gwrgw/8pMr7exk09SvlaCw==", "OfPNq");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[37]] = h.lIIlIlllIlllIlI("KAwcIX4GGAc0Mg==", "emwDS");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[40]] = h.lIIlIlllIlllIIl("5wdcYh3AxCT7VlC6/ReYVgbuKwDSVthX", "pEEIc");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[41]] = h.lIIlIlllIlllIlI("OggGJzEEDlUxNh4bFDo7Dw==", "jiuTX");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[42]] = h.lIIlIlllIlllIII("iscRIvtyMCvNLggZRDqflQ==", "mJoDR");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[43]] = h.lIIlIlllIlllIIl("UJwCDvlUhYnCCjFAWU8fsg==", "tpvaZ");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[44]] = h.lIIlIlllIlllIII("XKfnEbcobr5ujy3tVv5qpQ==", "NZcPf");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[47]] = h.lIIlIlllIlllIlI("DQUfYQUsRAwgAzcMCy4ELQBJJR4sFg==", "CdiAq");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[48]] = h.lIIlIlllIlllIII("Om8mjTvk0NEdxhQveQHzp+UeQpCVQIYq", "LQdeQ");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[49]] = h.lIIlIlllIlllIIl("XMF5KvDg4S9ZWOPIhv5Qug==", "jVUrq");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[50]] = h.lIIlIlllIlllIlI("PRolDA0QBitCEhwJ", "yhLbf");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[51]] = h.lIIlIlllIlllIII("4ffC3AR6UD8tYY/rOWD9cA==", "vkVaM");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[54]] = h.lIIlIlllIlllIIl("CqTjpVv2eHKti008Y4EZfwLU6kuKPeQ+", "tGAHj");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[55]] = h.lIIlIlllIlllIII("nP/iZQJ2o6tuWohT2eHWmw==", "guCNY");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[56]] = h.lIIlIlllIlllIIl("1zhTAftYp2DZGU9XDaZvIQ==", "HGVjo");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[57]] = h.lIIlIlllIlllIlI("Jig5O2wCITgnNBEh", "vIJHA");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[59]] = h.lIIlIlllIlllIIl("Le+PFRDvjdWwVQQUtOS6msd8tzv/uyX8", "ykPnT");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[60]] = h.lIIlIlllIlllIII("Q+sZ4HefeYnayJW9KV8OYKxBn1lqngoS", "LWmPs");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[61]] = h.lIIlIlllIlllIII("2O932T7hrszXQp+sU4s2Ng==", "yXRQT");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[62]] = h.lIIlIlllIlllIIl("hOE/DxKi2jAI2GnNlyAu2w==", "VohOA");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[63]] = h.lIIlIlllIlllIII("snn+UQsRWiJbc99SP0Ub1Q==", "rauGp");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[66]] = h.lIIlIlllIlllIII("9zcg/n6+2RaaBAQU8pjfhW34LvbqpejyxF2q17XbR3U=", "bDhlA");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[67]] = h.lIIlIlllIlllIII("G6QzDM+gdZl5GMtmQZzxbQ8sRjH3Boxl", "QChBK");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[68]] = h.lIIlIlllIlllIIl("4WQttUlwNyiCEKKG3iKfFw==", "HPwws");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[69]] = h.lIIlIlllIlllIII("kIbKFShMzlJq6iRZhCeR8g==", "unafx");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[70]] = h.lIIlIlllIlllIIl("/HSCiZrD084Ljr5I5Z1e4A==", "smLNX");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[71]] = h.lIIlIlllIlllIIl("5/Y5/xI2Z3JIZY9Huaw4TDpWIyKnjocN", "uZabH");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[72]] = h.lIIlIlllIlllIIl("4yC9Fa1SqZop+VUuM2V8/RJYL3tqFBzF", "nApIV");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[73]] = h.lIIlIlllIlllIlI("JDI8C0wAOz0XFBM7", "tSOxa");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[74]] = h.lIIlIlllIlllIlI("CTMiAC0kLyxOMigg", "MAKnF");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[75]] = h.lIIlIlllIlllIIl("2tdvTVjOC88Mu9Btr2dkZg==", "ceYVh");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[76]] = h.lIIlIlllIlllIIl("UI/KzaGhttVWrkSzU34QcOiYb4SC+Qwm", "BWZUi");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[77]] = h.lIIlIlllIlllIlI("Nh4RDSVTEgkHOBdQCAc4HQ==", "spehW");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[78]] = h.lIIlIlllIlllIII("hXFmwTrzj4vaG0+43kSMwg==", "SgWkY");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[15]] = h.lIIlIlllIlllIII("uesc+0QPHOxPqAdj83qN3A==", "aiMMu");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[79]] = h.lIIlIlllIlllIlI("AgsgQyoiDzYO", "PjWcH");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[80]] = h.lIIlIlllIlllIlI("BSo/CikiZTITKSco", "FEPaL");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[81]] = h.lIIlIlllIlllIII("xEQGybPZiDuUFdCRkKDkHg==", "SfdHN");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[14]] = h.lIIlIlllIlllIIl("v598vMq9b9dIkMaDr+p/iQ==", "LcXbH");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[82]] = h.lIIlIlllIlllIII("OfhlWO5OEFciFfH/pIkEWA==", "XggWu");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[83]] = h.lIIlIlllIlllIIl("vWOThZ8wYy56w0wb5ltAzQ==", "GhNiB");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[2]] = h.lIIlIlllIlllIII("EXmr07Zr7F5b5QYj7YKh0A==", "qnoyK");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[84]] = h.lIIlIlllIlllIIl("cEbHcLtmOivfk3CLHfc+sQ==", "iUoLh");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[85]] = h.lIIlIlllIlllIII("VKM/bnxb7Vdmupl1u47Arw==", "yunwi");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[86]] = h.lIIlIlllIlllIII("pltgwbB/2i/oyzGRa0Xk9g==", "dPhDI");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[87]] = h.lIIlIlllIlllIIl("sknQAlKdbfEz+zBX/O1luw==", "evIIm");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[88]] = h.lIIlIlllIlllIIl("f3/yPUEtQNWu8BvUfKq1uQ==", "oLjra");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[89]] = h.lIIlIlllIlllIII("nvh4HwleH/Mpmi3kjIiJgw==", "hVlLW");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[10]] = h.lIIlIlllIlllIlI("KwMNIAAGC0I4HQcaBw==", "hlbKi");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[90]] = h.lIIlIlllIlllIIl("I05v0u/0qbUvr8QWzGWfHQ==", "jJVBD");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[91]] = h.lIIlIlllIlllIlI("MxsEODEeE0sgLB8CDg==", "ptkSX");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[11]] = h.lIIlIlllIlllIII("zo6Aqk+jpqwRNPcER87POA==", "GZpFY");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[92]] = h.lIIlIlllIlllIII("qZArvdGdZfU3rjTw+430RQ==", "FCwVZ");
        h.lIIIIIIlIIlIl[h.lIIIIIIlIIllI[93]] = h.lIIlIlllIlllIlI("AjomFAMpNzc=", "GTRfb");
    }

    private static /* synthetic */ boolean c(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[87]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[29])) {
            n = lIIIIIIlIIllI[16];
            "".length();
            if (((0x67 ^ 0x5F) & ~(0xA ^ 0x32)) > " ".length()) {
                return ((0x50 ^ 0x55) & ~(0xAF ^ 0xAA)) != 0;
            }
        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

    private static /* synthetic */ boolean g(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[93]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[29])) {
            n = lIIIIIIlIIllI[16];
            "".length();
            if ("   ".length() <= -" ".length()) {
                return ((0x5D ^ 0x73 ^ (0xA9 ^ 0x95)) & (0x86 ^ 0xA0 ^ (0xF2 ^ 0xC6) ^ -" ".length())) != 0;
            }
        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

    public boolean run() {
        TileObject lllllllllllllllIIIllllIIIIllIIll;
        TileObject lllllllllllllllIIIllllIIIIllIlII;
        TileObject lllllllllllllllIIIllllIIIIllIlIl;
        h lllllllllllllllIIIllllIIIIllIllI;
        ab = this.R.minimumFood();
        Y = this.R.minimumBlueMoonFood();
        aa = this.R.minimumBloodMoonFood();
        Z = this.R.minimumEclipseMoonFood();
        if (h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[21]))) {
            if (h.lIIlIlllIllllIl(h.d() ? 1 : 0) && h.lIIlIlllIllllIl(k.j() ? 1 : 0)) {
                k.f();
                return lIIIIIIlIIllI[4];
            }
            if (h.lIIlIlllIlllllI(h.d() ? 1 : 0)) {
                if (h.lIIlIlllIlllllI(lllllllllllllllIIIllllIIIIllIllI.V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    lllllllllllllllIIIllllIIIIllIlIl = new WorldPoint(lIIIIIIlIIllI[22], lIIIIIIlIIllI[23], lIIIIIIlIIllI[16]);
                    lllllllllllllllIIIllllIIIIllIlII = TileObjects.getNearest(arg_0 -> h.g((WorldPoint)lllllllllllllllIIIllllIIIIllIlIl, arg_0));
                    if (h.lIIlIlllIllllll(lllllllllllllllIIIllllIIIIllIlII)) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[4]];
                        Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIIIIllIlIl);
                        "".length();
                        return lIIIIIIlIIllI[4];
                    }
                    if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlII)) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[16]];
                        lllllllllllllllIIIllllIIIIllIlII.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[24]]);
                        return lIIIIIIlIIllI[4];
                    }
                }
                if (h.lIIlIlllIlllllI(lllllllllllllllIIIllllIIIIllIllI.U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    lllllllllllllllIIIllllIIIIllIlIl = TileObjects.getNearest(tileObject -> {
                        int n;
                        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[92]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                            n = lIIIIIIlIIllI[16];
                            "".length();
                            if (null != null) {
                                return ((0x51 ^ 0xE ^ (0x67 ^ 0x7D)) & (127 + 114 - 216 + 185 ^ 149 + 48 - 93 + 47 ^ -" ".length())) != 0;
                            }
                        } else {
                            n = lIIIIIIlIIllI[4];
                        }
                        return n != 0;
                    });
                    if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlIl) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[26]];
                        lllllllllllllllIIIllllIIIIllIlIl.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[27]]);
                        return lIIIIIIlIIllI[16];
                    }
                    if (h.lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIIIllllIIIIllIllI.X), lIIIIIIlIIllI[28]) && (!h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25]) || !h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlIl) || h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlIl) && h.lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIIIllllIIIIllIlIl.getWorldLocation()), lIIIIIIlIIllI[29]))) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[29]];
                        Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIIIIllIllI.X);
                        "".length();
                        return lIIIIIIlIIllI[16];
                    }
                    if (h.lIIlIllllIIIIll(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIIIllllIIIIllIllI.X), lIIIIIIlIIllI[28])) {
                        SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[30]];
                        String[] stringArray = new String[lIIIIIIlIIllI[16]];
                        stringArray[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[31]];
                        lllllllllllllllIIIllllIIIIllIlII = TileObjects.getNearest((String[])stringArray);
                        if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlII)) {
                            lllllllllllllllIIIllllIIIIllIlII.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[32]]);
                            return lIIIIIIlIIllI[16];
                        }
                    }
                }
            }
        }
        if (h.lIIlIllllIIIlII(Vars.getBit((int)lIIIIIIlIIllI[21]), lIIIIIIlIIllI[16]) && h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[33]))) {
            if (h.lIIlIlllIllllIl(h.d() ? 1 : 0) && h.lIIlIlllIllllIl(k.j() ? 1 : 0)) {
                k.f();
                return lIIIIIIlIIllI[4];
            }
            if (h.lIIlIlllIlllllI(lllllllllllllllIIIllllIIIIllIllI.V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lllllllllllllllIIIllllIIIIllIlIl = new WorldPoint(lIIIIIIlIIllI[22], lIIIIIIlIIllI[23], lIIIIIIlIIllI[16]);
                lllllllllllllllIIIllllIIIIllIlII = TileObjects.getNearest(arg_0 -> h.f((WorldPoint)lllllllllllllllIIIllllIIIIllIlIl, arg_0));
                if (h.lIIlIlllIllllll(lllllllllllllllIIIllllIIIIllIlII)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[28]];
                    Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIIIIllIlIl);
                    "".length();
                    return lIIIIIIlIIllI[4];
                }
                if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlII)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[34]];
                    lllllllllllllllIIIllllIIIIllIlII.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[35]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (h.lIIlIlllIlllllI(lllllllllllllllIIIllllIIIIllIllI.S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lllllllllllllllIIIllllIIIIllIlIl = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[91]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        n = lIIIIIIlIIllI[16];
                        "".length();
                        if (((0xA6 ^ 0xB8) & ~(0x67 ^ 0x79)) != 0) {
                            return ((0x48 ^ 0x5F) & ~(0x6B ^ 0x7C)) != 0;
                        }
                    } else {
                        n = lIIIIIIlIIllI[4];
                    }
                    return n != 0;
                });
                if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlIl) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[36]];
                    lllllllllllllllIIIllllIIIIllIlIl.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[37]]);
                    return lIIIIIIlIIllI[16];
                }
                lllllllllllllllIIIllllIIIIllIlII = new WorldPoint(lIIIIIIlIIllI[38], lIIIIIIlIIllI[39], lIIIIIIlIIllI[4]);
                lllllllllllllllIIIllllIIIIllIIll = TileObjects.getNearest(arg_0 -> h.e((WorldPoint)lllllllllllllllIIIllllIIIIllIlII, arg_0));
                if (h.lIIlIlllIllllll(lllllllllllllllIIIllllIIIIllIIll)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[40]];
                    Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIIIIllIlII);
                    "".length();
                    return lIIIIIIlIIllI[4];
                }
                if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIIll)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[41]];
                    lllllllllllllllIIIllllIIIIllIIll.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[42]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (h.lIIlIlllIlllllI(lllllllllllllllIIIllllIIIIllIllI.U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lllllllllllllllIIIllllIIIIllIlIl = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[10]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        n = lIIIIIIlIIllI[16];
                        "".length();
                        if (-" ".length() == "   ".length()) {
                            return ((58 + 202 - 228 + 181 ^ 79 + 183 - 219 + 154) & (0x30 ^ 0x4A ^ (0x1F ^ 0x75) ^ -" ".length())) != 0;
                        }
                    } else {
                        n = lIIIIIIlIIllI[4];
                    }
                    return n != 0;
                });
                if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlIl) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[43]];
                    lllllllllllllllIIIllllIIIIllIlIl.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[44]]);
                    return lIIIIIIlIIllI[16];
                }
                lllllllllllllllIIIllllIIIIllIlII = new WorldPoint(lIIIIIIlIIllI[45], lIIIIIIlIIllI[46], lIIIIIIlIIllI[4]);
                lllllllllllllllIIIllllIIIIllIIll = TileObjects.getNearest(arg_0 -> h.d((WorldPoint)lllllllllllllllIIIllllIIIIllIlII, arg_0));
                if (h.lIIlIlllIllllll(lllllllllllllllIIIllllIIIIllIIll)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[47]];
                    Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIIIIllIlII);
                    "".length();
                    return lIIIIIIlIIllI[4];
                }
                if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIIll)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[48]];
                    lllllllllllllllIIIllllIIIIllIIll.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[49]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (h.lIIlIlllIlllllI(lllllllllllllllIIIllllIIIIllIllI.T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && h.lIIlIlllIlllllI(h.d() ? 1 : 0)) {
                lllllllllllllllIIIllllIIIIllIlIl = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[88]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        n = lIIIIIIlIIllI[16];
                        "".length();
                        if (((0x80 ^ 0xBE) & ~(8 ^ 0x36)) > (0x61 ^ 0x65)) {
                            return ((0x6B ^ 0x6C) & ~(0x97 ^ 0x90)) != 0;
                        }
                    } else {
                        n = lIIIIIIlIIllI[4];
                    }
                    return n != 0;
                });
                if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlIl) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[50]];
                    lllllllllllllllIIIllllIIIIllIlIl.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[51]]);
                    return lIIIIIIlIIllI[16];
                }
                lllllllllllllllIIIllllIIIIllIlII = new WorldPoint(lIIIIIIlIIllI[52], lIIIIIIlIIllI[53], lIIIIIIlIIllI[4]);
                if (h.lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllIIIllllIIIIllIlII), lIIIIIIlIIllI[28]) && (!h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25]) || !h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlIl) || h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlIl) && h.lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIIIllllIIIIllIlIl.getWorldLocation()), lIIIIIIlIIllI[29]))) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[54]];
                    Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIIIIllIlII);
                    "".length();
                    return lIIIIIIlIIllI[16];
                }
                if (h.lIIlIllllIIIIll(Players.getLocal().getWorldLocation().distanceTo((WorldPoint)lllllllllllllllIIIllllIIIIllIlII), lIIIIIIlIIllI[28])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[55]];
                    String[] stringArray = new String[lIIIIIIlIIllI[16]];
                    stringArray[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[56]];
                    lllllllllllllllIIIllllIIIIllIIll = TileObjects.getNearest((String[])stringArray);
                    if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIIll)) {
                        lllllllllllllllIIIllllIIIIllIIll.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[57]]);
                        return lIIIIIIlIIllI[16];
                    }
                }
            }
        }
        if (h.lIIlIllllIIIlII(Vars.getBit((int)lIIIIIIlIIllI[21]), lIIIIIIlIIllI[16]) && h.lIIlIllllIIIlII(Vars.getBit((int)lIIIIIIlIIllI[33]), lIIIIIIlIIllI[16]) && h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[58]))) {
            if (h.lIIlIlllIllllIl(h.d() ? 1 : 0) && h.lIIlIlllIllllIl(k.j() ? 1 : 0)) {
                k.f();
                return lIIIIIIlIIllI[4];
            }
            if (h.lIIlIlllIlllllI(lllllllllllllllIIIllllIIIIllIllI.V.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lllllllllllllllIIIllllIIIIllIlIl = new WorldPoint(lIIIIIIlIIllI[22], lIIIIIIlIIllI[23], lIIIIIIlIIllI[16]);
                lllllllllllllllIIIllllIIIIllIlII = TileObjects.getNearest(arg_0 -> h.c((WorldPoint)lllllllllllllllIIIllllIIIIllIlIl, arg_0));
                if (h.lIIlIlllIllllll(lllllllllllllllIIIllllIIIIllIlII)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[59]];
                    Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIIIIllIlIl);
                    "".length();
                    return lIIIIIIlIIllI[4];
                }
                if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlII)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[60]];
                    lllllllllllllllIIIllllIIIIllIlII.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[61]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (h.lIIlIlllIlllllI(lllllllllllllllIIIllllIIIIllIllI.T.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lllllllllllllllIIIllllIIIIllIlIl = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[86]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        n = lIIIIIIlIIllI[16];
                        "".length();
                        if ("   ".length() <= "  ".length()) {
                            return ("   ".length() & ("   ".length() ^ -" ".length())) != 0;
                        }
                    } else {
                        n = lIIIIIIlIIllI[4];
                    }
                    return n != 0;
                });
                if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlIl) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[62]];
                    lllllllllllllllIIIllllIIIIllIlIl.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[63]]);
                    return lIIIIIIlIIllI[16];
                }
                lllllllllllllllIIIllllIIIIllIlII = new WorldPoint(lIIIIIIlIIllI[64], lIIIIIIlIIllI[65], lIIIIIIlIIllI[4]);
                lllllllllllllllIIIllllIIIIllIIll = TileObjects.getNearest(arg_0 -> h.b((WorldPoint)lllllllllllllllIIIllllIIIIllIlII, arg_0));
                if (h.lIIlIlllIllllll(lllllllllllllllIIIllllIIIIllIIll)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[66]];
                    Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIIIIllIlII);
                    "".length();
                    return lIIIIIIlIIllI[4];
                }
                if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIIll)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[67]];
                    lllllllllllllllIIIllllIIIIllIIll.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[68]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (h.lIIlIlllIlllllI(lllllllllllllllIIIllllIIIIllIllI.U.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                lllllllllllllllIIIllllIIIIllIlIl = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[84]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        n = lIIIIIIlIIllI[16];
                        "".length();
                        if (" ".length() <= ((83 + 16 - 85 + 139 ^ 128 + 71 - 182 + 162) & (0x3D ^ 0x16 ^ " ".length() ^ -" ".length()))) {
                            return ((118 + 2 - 99 + 124 ^ 53 + 160 - 78 + 45) & (0xF4 ^ 0x89 ^ (0xC2 ^ 0x9A) ^ -" ".length())) != 0;
                        }
                    } else {
                        n = lIIIIIIlIIllI[4];
                    }
                    return n != 0;
                });
                if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlIl) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[69]];
                    lllllllllllllllIIIllllIIIIllIlIl.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[70]]);
                    return lIIIIIIlIIllI[16];
                }
                lllllllllllllllIIIllllIIIIllIlII = new WorldPoint(lIIIIIIlIIllI[45], lIIIIIIlIIllI[46], lIIIIIIlIIllI[4]);
                lllllllllllllllIIIllllIIIIllIIll = TileObjects.getNearest(arg_0 -> h.a((WorldPoint)lllllllllllllllIIIllllIIIIllIlII, arg_0));
                if (h.lIIlIlllIllllll(lllllllllllllllIIIllllIIIIllIIll)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[71]];
                    Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIIIIllIlII);
                    "".length();
                    return lIIIIIIlIIllI[4];
                }
                if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIIll)) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[72]];
                    lllllllllllllllIIIllllIIIIllIIll.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[73]]);
                    return lIIIIIIlIIllI[4];
                }
            }
            if (h.lIIlIlllIlllllI(lllllllllllllllIIIllllIIIIllIllI.S.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && h.lIIlIlllIlllllI(h.d() ? 1 : 0)) {
                lllllllllllllllIIIllllIIIIllIlIl = TileObjects.getNearest(tileObject -> {
                    int n;
                    if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[83]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIIIIIIlIIllI[29])) {
                        n = lIIIIIIlIIllI[16];
                        "".length();
                        if (-"   ".length() > 0) {
                            return ((0x87 ^ 0xBE) & ~(0x70 ^ 0x49)) != 0;
                        }
                    } else {
                        n = lIIIIIIlIIllI[4];
                    }
                    return n != 0;
                });
                if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlIl) && h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[74]];
                    lllllllllllllllIIIllllIIIIllIlIl.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[75]]);
                    return lIIIIIIlIIllI[16];
                }
                if (h.lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIIIllllIIIIllIllI.W), lIIIIIIlIIllI[28]) && (!h.lIIlIllllIIIIIl(Movement.getRunEnergy(), lIIIIIIlIIllI[25]) || !h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlIl) || h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlIl) && h.lIIlIllllIIIIlI(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIIIllllIIIIllIlIl.getWorldLocation()), lIIIIIIlIIllI[29]))) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[76]];
                    Movement.walkTo((WorldPoint)lllllllllllllllIIIllllIIIIllIllI.W);
                    "".length();
                    return lIIIIIIlIIllI[16];
                }
                if (h.lIIlIllllIIIIll(Players.getLocal().getWorldLocation().distanceTo(lllllllllllllllIIIllllIIIIllIllI.W), lIIIIIIlIIllI[28])) {
                    SquireMoonsOfPeril.g = lIIIIIIlIIlIl[lIIIIIIlIIllI[77]];
                    String[] stringArray = new String[lIIIIIIlIIllI[16]];
                    stringArray[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[78]];
                    lllllllllllllllIIIllllIIIIllIlII = TileObjects.getNearest((String[])stringArray);
                    if (h.lIIlIllllIIIIII(lllllllllllllllIIIllllIIIIllIlII)) {
                        lllllllllllllllIIIllllIIIIllIlII.interact(lIIIIIIlIIlIl[lIIIIIIlIIllI[15]]);
                        return lIIIIIIlIIllI[16];
                    }
                }
            }
        }
        return lIIIIIIlIIllI[4];
    }

    private static boolean lIIlIllllIIIIIl(int n, int n2) {
        return n < n2;
    }

    static {
        h.lIIlIlllIllllII();
        h.lIIlIlllIlllIll();
    }

    private static String lIIlIlllIlllIII(String lllllllllllllllIIIlllIllllllllll, String lllllllllllllllIIIlllIlllllllllI) {
        try {
            SecretKeySpec lllllllllllllllIIIllllIIIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllIlllllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIllllIIIIIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIllllIIIIIIIIll.init(lIIIIIIlIIllI[24], lllllllllllllllIIIllllIIIIIIIlII);
            return new String(lllllllllllllllIIIllllIIIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllIllllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIllllIIIIIIIIlI) {
            lllllllllllllllIIIllllIIIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlllIllllII() {
        lIIIIIIlIIllI = new int[94];
        h.lIIIIIIlIIllI[0] = 0xFFFFB53E & 0x4FFF;
        h.lIIIIIIlIIllI[1] = 0xFFFFA7FF & 0x7D3D;
        h.lIIIIIIlIIllI[2] = 73 + 163 - 143 + 73 ^ 125 + 101 - 146 + 67;
        h.lIIIIIIlIIllI[3] = 0x99 ^ 0x93 ^ (0x67 ^ 0x2F);
        h.lIIIIIIlIIllI[4] = (0x9F ^ 0x92) & ~(0x94 ^ 0x99);
        h.lIIIIIIlIIllI[5] = -(0xFFFFFFDF & 0x1261) & (0xFFFFBFFE & 0x77FF);
        h.lIIIIIIlIIllI[6] = 0x50 ^ 2 ^ (0x81 ^ 0x97);
        h.lIIIIIIlIIllI[7] = 0x46 ^ 0x79 ^ (0xAB ^ 0xC0);
        h.lIIIIIIlIIllI[8] = -(0xFFFFFCBF & 0x536F) & (0xFFFFD7EF & 0x7DFF);
        h.lIIIIIIlIIllI[9] = -(0xFFFF98F7 & 0x7F49) & (0xFFFFFFFF & 0x3DFF);
        h.lIIIIIIlIIllI[10] = 61 + 116 - 167 + 129 ^ 39 + 157 - 130 + 117;
        h.lIIIIIIlIIllI[11] = 158 + 62 - 164 + 113 ^ 5 + 147 - 40 + 38;
        h.lIIIIIIlIIllI[12] = -(0xFFFFFB7D & 0x3C8B) & (0xFFFFFFBE & 0x3DCF);
        h.lIIIIIIlIIllI[13] = -(0xFFFFF3ED & 0x4C53) & (0xFFFFFFDF & 0x65EB);
        h.lIIIIIIlIIllI[14] = 0x5D ^ 0x6F;
        h.lIIIIIIlIIllI[15] = 0x2F ^ 1;
        h.lIIIIIIlIIllI[16] = " ".length();
        h.lIIIIIIlIIllI[17] = -(0xFFFFFF9E & 0x38E7) & (0xFFFFBFEF & 0x7DFF);
        h.lIIIIIIlIIllI[18] = -(0xFFFFA81F & 0x5FE1) & (0xFFFFFDF6 & 0x2F7F);
        h.lIIIIIIlIIllI[19] = -(0xFFFF86A7 & 0x7B5B) & (0xFFFFD7EF & 0x2FF7);
        h.lIIIIIIlIIllI[20] = 0xFFFFEDDF & 0x37EB;
        h.lIIIIIIlIIllI[21] = 0xFFFFA687 & 0x7FFC;
        h.lIIIIIIlIIllI[22] = -(0xFFFFEF9C & 0x5A6F) & (0xFFFFDFFB & 0x6FBF);
        h.lIIIIIIlIIllI[23] = 0xFFFFE7FA & 0x3DB5;
        h.lIIIIIIlIIllI[24] = "  ".length();
        h.lIIIIIIlIIllI[25] = 0x76 ^ 0x30;
        h.lIIIIIIlIIllI[26] = "   ".length();
        h.lIIIIIIlIIllI[27] = 0xAD ^ 0xA9;
        h.lIIIIIIlIIllI[28] = 0xBD ^ 0xB4;
        h.lIIIIIIlIIllI[29] = 0xDC ^ 0x90 ^ (0x74 ^ 0x3D);
        h.lIIIIIIlIIllI[30] = 0x14 ^ 0x12;
        h.lIIIIIIlIIllI[31] = 0xEE ^ 0xA7 ^ (0x1A ^ 0x54);
        h.lIIIIIIlIIllI[32] = 116 + 105 - 59 + 42 ^ 11 + 130 - 77 + 132;
        h.lIIIIIIlIIllI[33] = -(0xFFFFCAD9 & 0x7D7F) & (0xFFFFFFFF & 0x6EDB);
        h.lIIIIIIlIIllI[34] = 0x35 ^ 0x3F;
        h.lIIIIIIlIIllI[35] = 0xCA ^ 0xC1;
        h.lIIIIIIlIIllI[36] = 0x3D ^ 0x29 ^ (0xA7 ^ 0xBF);
        h.lIIIIIIlIIllI[37] = 0x9B ^ 0x96;
        h.lIIIIIIlIIllI[38] = -(0xFFFFDBFF & 0x76B1) & (0xFFFFFFFC & 0x57F7);
        h.lIIIIIIlIIllI[39] = 0xFFFFAF77 & 0x75FF;
        h.lIIIIIIlIIllI[40] = 0x18 ^ 0x16;
        h.lIIIIIIlIIllI[41] = 8 ^ 2 ^ (0x23 ^ 0x26);
        h.lIIIIIIlIIllI[42] = 42 + 53 - -35 + 2 ^ 10 + 79 - -47 + 12;
        h.lIIIIIIlIIllI[43] = 0x71 ^ 0x60;
        h.lIIIIIIlIIllI[44] = 0xBA ^ 0xA8;
        h.lIIIIIIlIIllI[45] = -(0xFFFFB1F6 & 0x6E0F) & (0xFFFFF7F7 & 0x2DFF);
        h.lIIIIIIlIIllI[46] = 0xFFFFF5F7 & 0x2FFF;
        h.lIIIIIIlIIllI[47] = 0x60 ^ 0x43 ^ (0xAF ^ 0x9F);
        h.lIIIIIIlIIllI[48] = 3 ^ 0x1F ^ (0xAB ^ 0xA3);
        h.lIIIIIIlIIllI[49] = 0x2E ^ 0x12 ^ (0x57 ^ 0x7E);
        h.lIIIIIIlIIllI[50] = 0xD7 ^ 0xC1;
        h.lIIIIIIlIIllI[51] = 0xE6 ^ 0x8D ^ (0xED ^ 0x91);
        h.lIIIIIIlIIllI[52] = 0xFFFF857B & Short.MAX_VALUE;
        h.lIIIIIIlIIllI[53] = -(0xFFFFFFBB & 0x5257) & (0xFFFFFFFA & 0x77FF);
        h.lIIIIIIlIIllI[54] = 0xFF ^ 0xB3 ^ (0x39 ^ 0x6D);
        h.lIIIIIIlIIllI[55] = 0x11 ^ 8;
        h.lIIIIIIlIIllI[56] = 0x4B ^ 0x68 ^ (0x7E ^ 0x47);
        h.lIIIIIIlIIllI[57] = 0x11 ^ 0xA;
        h.lIIIIIIlIIllI[58] = -(0xFFFFDB33 & 0x2DDD) & (0xFFFFAFBE & 0x7FD3);
        h.lIIIIIIlIIllI[59] = 4 ^ 0x18;
        h.lIIIIIIlIIllI[60] = 0x79 ^ 0x64;
        h.lIIIIIIlIIllI[61] = 0x28 ^ 0x3D ^ (0x8D ^ 0x86);
        h.lIIIIIIlIIllI[62] = 141 + 130 - 176 + 128 ^ 111 + 52 - 90 + 119;
        h.lIIIIIIlIIllI[63] = 0xB4 ^ 0x94 ^ (0x33 ^ 0x27) & ~(2 ^ 0x16);
        h.lIIIIIIlIIllI[64] = -(0xFFFFA9E7 & 0x7E39) & (0xFFFFEF7D & 0x3DFF);
        h.lIIIIIIlIIllI[65] = -(0xFFFFFF7B & 0x1A8F) & (0xFFFFBFFF & 0x7FCF);
        h.lIIIIIIlIIllI[66] = 0x4C ^ 0x6D;
        h.lIIIIIIlIIllI[67] = 0xAB ^ 0x89;
        h.lIIIIIIlIIllI[68] = 0x13 ^ 0x24 ^ (0x83 ^ 0x97);
        h.lIIIIIIlIIllI[69] = 0x4A ^ 0x6B ^ (0x3C ^ 0x39);
        h.lIIIIIIlIIllI[70] = 0x60 ^ 0x45;
        h.lIIIIIIlIIllI[71] = 0x5D ^ 0x4A ^ (7 ^ 0x36);
        h.lIIIIIIlIIllI[72] = 0x68 ^ 0x4F;
        h.lIIIIIIlIIllI[73] = 59 + 153 - 60 + 37 ^ 99 + 98 - 156 + 108;
        h.lIIIIIIlIIllI[74] = 6 ^ 0x25 ^ (0x31 ^ 0x3B);
        h.lIIIIIIlIIllI[75] = 0xF3 ^ 0x80 ^ (0x69 ^ 0x30);
        h.lIIIIIIlIIllI[76] = 0x14 ^ 0x3F;
        h.lIIIIIIlIIllI[77] = 0x45 ^ 0x69;
        h.lIIIIIIlIIllI[78] = 0x38 ^ 0x15;
        h.lIIIIIIlIIllI[79] = 0xC ^ 0x2B ^ (0x8E ^ 0x86);
        h.lIIIIIIlIIllI[80] = 109 + 179 - 146 + 44 ^ 32 + 45 - 15 + 76;
        h.lIIIIIIlIIllI[81] = 0xC7 ^ 0xA5 ^ (0xD ^ 0x5E);
        h.lIIIIIIlIIllI[82] = 0x49 ^ 0x35 ^ (0x6E ^ 0x21);
        h.lIIIIIIlIIllI[83] = 0x37 ^ 0x72 ^ (0x20 ^ 0x51);
        h.lIIIIIIlIIllI[84] = 0x43 ^ 0x7D ^ (0x2C ^ 0x24);
        h.lIIIIIIlIIllI[85] = 0x42 ^ 0x75;
        h.lIIIIIIlIIllI[86] = 0x12 ^ 0x2A;
        h.lIIIIIIlIIllI[87] = 0xB3 ^ 0x8A;
        h.lIIIIIIlIIllI[88] = 0x70 ^ 0x4A;
        h.lIIIIIIlIIllI[89] = 0x8D ^ 0xB6;
        h.lIIIIIIlIIllI[90] = 0xB2 ^ 0x8F;
        h.lIIIIIIlIIllI[91] = 79 + 48 - 4 + 12 ^ 166 + 71 - 210 + 158;
        h.lIIIIIIlIIllI[92] = 0x66 ^ 0x3E ^ (0xA2 ^ 0xBA);
        h.lIIIIIIlIIllI[93] = 0x5B ^ 0x46 ^ (0xD ^ 0x51);
    }

    private static String lIIlIlllIlllIIl(String lllllllllllllllIIIlllIllllIllIlI, String lllllllllllllllIIIlllIllllIllIIl) {
        try {
            SecretKeySpec lllllllllllllllIIIlllIllllIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIlllIllllIllIIl.getBytes(StandardCharsets.UTF_8)), lIIIIIIlIIllI[32]), "DES");
            Cipher lllllllllllllllIIIlllIllllIllllI = Cipher.getInstance("DES");
            lllllllllllllllIIIlllIllllIllllI.init(lIIIIIIlIIllI[24], lllllllllllllllIIIlllIllllIlllll);
            return new String(lllllllllllllllIIIlllIllllIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIlllIllllIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIlllIllllIlllIl) {
            lllllllllllllllIIIlllIllllIlllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIllllIIIIll(int n, int n2) {
        return n <= n2;
    }

    private static boolean lIIlIllllIIIIII(Object object) {
        return object != null;
    }

    private static boolean lIIlIlllIllllll(Object object) {
        return object == null;
    }

    private static /* synthetic */ boolean b(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[85]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[31])) {
            n = lIIIIIIlIIllI[16];
            "".length();
            if (null != null) {
                return ((0x71 ^ 0x78) & ~(0x3C ^ 0x35)) != 0;
            }
        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

    private static /* synthetic */ boolean f(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[11]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[29])) {
            n = lIIIIIIlIIllI[16];
            "".length();
            if (-" ".length() >= " ".length()) {
                return ((0x19 ^ 0x2B) & ~(0x28 ^ 0x1A)) != 0;
            }
        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

    private static String lIIlIlllIlllIlI(String lllllllllllllllIIIlllIllllllIIIl, String lllllllllllllllIIIlllIlllllIlIll) {
        lllllllllllllllIIIlllIllllllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIIIlllIllllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIlllIlllllIllll = new StringBuilder();
        char[] lllllllllllllllIIIlllIlllllIlllI = lllllllllllllllIIIlllIlllllIlIll.toCharArray();
        int lllllllllllllllIIIlllIlllllIllIl = lIIIIIIlIIllI[4];
        char[] lllllllllllllllIIIlllIlllllIIlll = lllllllllllllllIIIlllIllllllIIIl.toCharArray();
        int lllllllllllllllIIIlllIlllllIIllI = lllllllllllllllIIIlllIlllllIIlll.length;
        int lllllllllllllllIIIlllIlllllIIlIl = lIIIIIIlIIllI[4];
        while (h.lIIlIllllIIIIIl(lllllllllllllllIIIlllIlllllIIlIl, lllllllllllllllIIIlllIlllllIIllI)) {
            char lllllllllllllllIIIlllIllllllIIlI = lllllllllllllllIIIlllIlllllIIlll[lllllllllllllllIIIlllIlllllIIlIl];
            lllllllllllllllIIIlllIlllllIllll.append((char)(lllllllllllllllIIIlllIllllllIIlI ^ lllllllllllllllIIIlllIlllllIlllI[lllllllllllllllIIIlllIlllllIllIl % lllllllllllllllIIIlllIlllllIlllI.length]));
            "".length();
            ++lllllllllllllllIIIlllIlllllIllIl;
            ++lllllllllllllllIIIlllIlllllIIlIl;
            "".length();
            if (-" ".length() < "   ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIlllIlllllIllll);
    }

    @Inject
    public h(SquireMoonsOfPerilConfig squireMoonsOfPerilConfig) {
        this.S = new WorldArea(lIIIIIIlIIllI[0], lIIIIIIlIIllI[1], lIIIIIIlIIllI[2], lIIIIIIlIIllI[3], lIIIIIIlIIllI[4]);
        this.T = new WorldArea(lIIIIIIlIIllI[0], lIIIIIIlIIllI[5], lIIIIIIlIIllI[6], lIIIIIIlIIllI[7], lIIIIIIlIIllI[4]);
        this.U = new WorldArea(lIIIIIIlIIllI[8], lIIIIIIlIIllI[9], lIIIIIIlIIllI[10], lIIIIIIlIIllI[11], lIIIIIIlIIllI[4]);
        this.V = new WorldArea(lIIIIIIlIIllI[12], lIIIIIIlIIllI[13], lIIIIIIlIIllI[14], lIIIIIIlIIllI[15], lIIIIIIlIIllI[16]);
        this.W = new WorldPoint(lIIIIIIlIIllI[17], lIIIIIIlIIllI[18], lIIIIIIlIIllI[4]);
        this.X = new WorldPoint(lIIIIIIlIIllI[19], lIIIIIIlIIllI[20], lIIIIIIlIIllI[4]);
        this.R = squireMoonsOfPerilConfig;
    }

    private static boolean lIIlIlllIllllIl(int n) {
        return n == 0;
    }

    private static /* synthetic */ boolean d(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[89]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[29])) {
            n = lIIIIIIlIIllI[16];
            "".length();
            if (((0x5A ^ 0x10) & ~(0x1D ^ 0x57)) < 0) {
                return ((0xAA ^ 0x96) & ~(0x76 ^ 0x4A)) != 0;
            }
        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

    private static /* synthetic */ boolean a(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[2]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[29])) {
            n = lIIIIIIlIIllI[16];
            "".length();
            if ("  ".length() > "  ".length()) {
                return ((0x79 ^ 0xD ^ (0xF0 ^ 0xB9)) & (2 ^ 0x28 ^ (0x64 ^ 0x73) ^ -" ".length())) != 0;
            }
        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

    private static /* synthetic */ boolean e(WorldPoint worldPoint, TileObject tileObject) {
        int n;
        if (h.lIIlIlllIlllllI(tileObject.getName().contains(lIIIIIIlIIlIl[lIIIIIIlIIllI[90]]) ? 1 : 0) && h.lIIlIllllIIIIll(tileObject.getWorldLocation().distanceTo(worldPoint), lIIIIIIlIIllI[29])) {
            n = lIIIIIIlIIllI[16];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x44 ^ 0x6F ^ (0x8D ^ 0x94)) & (0x63 ^ 0x7E ^ (0x44 ^ 0x6B) ^ -" ".length())) != 0;
            }
        } else {
            n = lIIIIIIlIIllI[4];
        }
        return n != 0;
    }

    private static boolean lIIlIllllIIIlII(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIlIllllIIIlIl(int n, int n2) {
        return n >= n2;
    }

    public static boolean d() {
        block10: {
            block11: {
                block8: {
                    block9: {
                        block6: {
                            block7: {
                                if (!h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[21])) || !h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[33])) || !h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[58]))) break block6;
                                if (!h.lIIlIlllIlllllI(Inventory.isFull() ? 1 : 0)) break block7;
                                String[] stringArray = new String[lIIIIIIlIIllI[16]];
                                stringArray[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[79]];
                                if (!h.lIIlIlllIlllllI(Inventory.contains((String[])stringArray) ? 1 : 0)) break block6;
                            }
                            return lIIIIIIlIIllI[4];
                        }
                        if (!h.lIIlIllllIIIlII(Vars.getBit((int)lIIIIIIlIIllI[21]), lIIIIIIlIIllI[16]) || !h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[33]))) break block8;
                        String[] stringArray = new String[lIIIIIIlIIllI[16]];
                        stringArray[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[80]];
                        if (!h.lIIlIllllIIIlIl(Inventory.getCount((String[])stringArray), Y)) break block9;
                        String[] stringArray2 = new String[lIIIIIIlIIllI[16]];
                        stringArray2[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[81]];
                        if (!h.lIIlIlllIlllllI(Inventory.contains((String[])stringArray2) ? 1 : 0)) break block8;
                    }
                    return lIIIIIIlIIllI[4];
                }
                if (!h.lIIlIllllIIIlII(Vars.getBit((int)lIIIIIIlIIllI[21]), lIIIIIIlIIllI[16]) || !h.lIIlIllllIIIlII(Vars.getBit((int)lIIIIIIlIIllI[33]), lIIIIIIlIIllI[16]) || !h.lIIlIlllIllllIl(Vars.getBit((int)lIIIIIIlIIllI[58]))) break block10;
                String[] stringArray = new String[lIIIIIIlIIllI[16]];
                stringArray[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[14]];
                if (!h.lIIlIllllIIIlIl(Inventory.getCount((String[])stringArray), aa)) break block11;
                String[] stringArray3 = new String[lIIIIIIlIIllI[16]];
                stringArray3[h.lIIIIIIlIIllI[4]] = lIIIIIIlIIlIl[lIIIIIIlIIllI[82]];
                if (!h.lIIlIlllIlllllI(Inventory.contains((String[])stringArray3) ? 1 : 0)) break block10;
            }
            return lIIIIIIlIIllI[4];
        }
        return lIIIIIIlIIllI[16];
    }

    private static boolean lIIlIllllIIIIlI(int n, int n2) {
        return n > n2;
    }

    private static boolean lIIlIlllIlllllI(int n) {
        return n != 0;
    }
}

