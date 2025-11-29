/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import gg.squire.quest.SquireTutorialIsland;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.A;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.B;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.C;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.D;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.E;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.G;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.H;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.M;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.h;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.o;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.p;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.q;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.r;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.s;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.t;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.u;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.v;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.w;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.x;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.y;
import s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.z;

@TaskDesc(name="Completing Tutorial Island")
public class J
extends Task {
    private static /* synthetic */ int[] lIlIIIlIlIIIl;
    private /* synthetic */ int aE;
    private final /* synthetic */ SquireTutorialIsland aK;
    private static /* synthetic */ String[] lIlIIIlIlIIII;
    private final /* synthetic */ Client aI;
    private final /* synthetic */ SquireQuesterConfig aJ;

    private static boolean lIllIllllllIlll(int n2, int n3) {
        return n2 != n3;
    }

    @Inject
    public J(Client client, SquireQuesterConfig squireQuesterConfig, SquireTutorialIsland squireTutorialIsland) {
        this.aI = client;
        this.aJ = squireQuesterConfig;
        this.aK = squireTutorialIsland;
    }

    private static String lIllIlllllIllll(String llllllllllllllIlllIIIlIllIlIIIlI, String llllllllllllllIlllIIIlIllIIlllII) {
        llllllllllllllIlllIIIlIllIlIIIlI = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIlIllIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIIlIllIlIIIII = new StringBuilder();
        char[] llllllllllllllIlllIIIlIllIIlllll = llllllllllllllIlllIIIlIllIIlllII.toCharArray();
        int llllllllllllllIlllIIIlIllIIllllI = lIlIIIlIlIIIl[1];
        char[] llllllllllllllIlllIIIlIllIIllIII = llllllllllllllIlllIIIlIllIlIIIlI.toCharArray();
        int llllllllllllllIlllIIIlIllIIlIlll = llllllllllllllIlllIIIlIllIIllIII.length;
        int llllllllllllllIlllIIIlIllIIlIllI = lIlIIIlIlIIIl[1];
        while (J.lIllIlllllllIll(llllllllllllllIlllIIIlIllIIlIllI, llllllllllllllIlllIIIlIllIIlIlll)) {
            char llllllllllllllIlllIIIlIllIlIIIll = llllllllllllllIlllIIIlIllIIllIII[llllllllllllllIlllIIIlIllIIlIllI];
            llllllllllllllIlllIIIlIllIlIIIII.append((char)(llllllllllllllIlllIIIlIllIlIIIll ^ llllllllllllllIlllIIIlIllIIlllll[llllllllllllllIlllIIIlIllIIllllI % llllllllllllllIlllIIIlIllIIlllll.length]));
            "".length();
            ++llllllllllllllIlllIIIlIllIIllllI;
            ++llllllllllllllIlllIIIlIllIIlIllI;
            "".length();
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIIIlIllIlIIIII);
    }

    private static boolean lIllIlllllllIll(int n2, int n3) {
        return n2 < n3;
    }

    private o a(int n2) {
        switch (n2) {
            case 1: {
                o o2;
                J llllllllllllllIlllIIIlIlllIIlIII;
                if (J.lIllIlllllllIII(M.c(lIlIIIlIlIIIl[5], lIlIIIlIlIIIl[6]) ? 1 : 0)) {
                    return new H();
                }
                if (J.lIllIlllllllIIl(llllllllllllllIlllIIIlIlllIIlIII.aK.c())) {
                    o2 = new C(llllllllllllllIlllIIIlIlllIIlIII.aK);
                    "".length();
                    if ("   ".length() < ((57 + 38 - -63 + 4 ^ 115 + 10 - -49 + 6) & (124 + 42 - 98 + 61 ^ 62 + 109 - 25 + 5 ^ -" ".length()))) {
                        return null;
                    }
                } else {
                    o2 = new G(llllllllllllllIlllIIIlIlllIIlIII.aK);
                }
                return o2;
            }
            case 2: {
                o o3;
                if (!J.lIllIllllllIlIl(M.J() ? 1 : 0) || J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o3 = new A();
                    "".length();
                    if (null != null) {
                        return null;
                    }
                } else {
                    o3 = new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[1]], lIlIIIlIlIIII[lIlIIIlIlIIIl[2]]);
                }
                return o3;
            }
            case 3: {
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[8], lIlIIIlIlIIII[lIlIIIlIlIIIl[6]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[10], lIlIIIlIlIIII[lIlIIIlIlIIIl[11]]);
            }
            case 7: {
                o o4;
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o4 = new B();
                    "".length();
                    if (null != null) {
                        return null;
                    }
                } else {
                    o4 = new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[12]], lIlIIIlIlIIII[lIlIIIlIlIIIl[13]]);
                }
                return o4;
            }
            case 10: 
            case 70: 
            case 120: 
            case 130: 
            case 170: 
            case 210: 
            case 250: 
            case 300: 
            case 310: 
            case 340: 
            case 360: 
            case 500: 
            case 510: 
            case 520: 
            case 525: 
            case 540: 
            case 610: {
                return new x();
            }
            case 20: 
            case 60: {
                o o5;
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o5 = new B();
                    "".length();
                    if (" ".length() > " ".length()) {
                        return null;
                    }
                } else {
                    o5 = new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[14]], lIlIIIlIlIIII[lIlIIIlIlIIIl[15]]);
                }
                return o5;
            }
            case 30: {
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[16], lIlIIIlIlIIII[lIlIIIlIlIIIl[17]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[18], lIlIIIlIlIIII[lIlIIIlIlIIIl[19]]);
            }
            case 40: {
                return new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[20]], lIlIIIlIlIIII[lIlIIIlIlIIIl[21]]);
            }
            case 50: {
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[22], lIlIIIlIlIIII[lIlIIIlIlIIIl[23]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[24], lIlIIIlIlIIII[lIlIIIlIlIIIl[25]]);
            }
            case 80: {
                return new r();
            }
            case 90: {
                return new q();
            }
            case 140: {
                o o6;
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o6 = new B();
                    "".length();
                    if (null != null) {
                        return null;
                    }
                } else {
                    o6 = new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[26]], lIlIIIlIlIIII[lIlIIIlIlIIIl[27]]);
                }
                return o6;
            }
            case 150: {
                return new s();
            }
            case 160: {
                return new p();
            }
            case 200: {
                return new E(lIlIIIlIlIIIl[28], lIlIIIlIlIIIl[29], lIlIIIlIlIIII[lIlIIIlIlIIIl[30]]);
            }
            case 220: 
            case 240: {
                o o7;
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o7 = new B();
                    "".length();
                    if (" ".length() != " ".length()) {
                        return null;
                    }
                } else {
                    o7 = new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[31]], lIlIIIlIlIIII[lIlIIIlIlIIIl[32]]);
                }
                return o7;
            }
            case 230: {
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[33], lIlIIIlIlIIII[lIlIIIlIlIIIl[34]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[35], lIlIIIlIlIIII[lIlIIIlIlIIIl[36]]);
            }
            case 260: 
            case 330: {
                o o8;
                String[] stringArray = new String[lIlIIIlIlIIIl[2]];
                stringArray[J.lIlIIIlIlIIIl[1]] = lIlIIIlIlIIII[lIlIIIlIlIIIl[37]];
                if (J.lIllIlllllllIIl(NPCs.getNearest((String[])stringArray))) {
                    return new z(new WorldPoint(lIlIIIlIlIIIl[38], lIlIIIlIlIIIl[39], lIlIIIlIlIIIl[1]));
                }
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o8 = new B();
                    "".length();
                    if (((0xE2 ^ 0xBE) & ~(0xDB ^ 0x87)) > 0) {
                        return null;
                    }
                } else {
                    o8 = new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[40]], lIlIIIlIlIIII[lIlIIIlIlIIIl[41]]);
                }
                return o8;
            }
            case 320: {
                return new t();
            }
            case 350: {
                return new E(lIlIIIlIlIIIl[42], lIlIIIlIlIIIl[19], lIlIIIlIlIIII[lIlIIIlIlIIIl[43]]);
            }
            case 370: 
            case 410: 
            case 470: {
                o o9;
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o9 = new B();
                    "".length();
                    if (-"  ".length() > 0) {
                        return null;
                    }
                } else {
                    o9 = new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[44]], lIlIIIlIlIIII[lIlIIIlIlIIIl[45]]);
                }
                return o9;
            }
            case 390: {
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[46], lIlIIIlIlIIII[lIlIIIlIlIIIl[29]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[47], lIlIIIlIlIIII[lIlIIIlIlIIIl[48]]);
            }
            case 400: {
                return new E(lIlIIIlIlIIIl[49], lIlIIIlIlIIIl[2], lIlIIIlIlIIII[lIlIIIlIlIIIl[50]]);
            }
            case 405: {
                return new u(lIlIIIlIlIIIl[51]);
            }
            case 420: {
                int[] nArray = new int[lIlIIIlIlIIIl[2]];
                nArray[J.lIlIIIlIlIIIl[1]] = lIlIIIlIlIIIl[52];
                if (J.lIllIllllllIlIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    return new u(lIlIIIlIlIIIl[52]);
                }
                return new u(lIlIIIlIlIIIl[53]);
            }
            case 430: {
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[54], lIlIIIlIlIIII[lIlIIIlIlIIIl[55]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[56], lIlIIIlIlIIII[lIlIIIlIlIIIl[57]]);
            }
            case 440: {
                return new y(new WorldPoint(lIlIIIlIlIIIl[58], lIlIIIlIlIIIl[59], lIlIIIlIlIIIl[1]), lIlIIIlIlIIII[lIlIIIlIlIIIl[60]]);
            }
            case 450: {
                return new v(lIlIIIlIlIIII[lIlIIIlIlIIIl[61]], lIlIIIlIlIIII[lIlIIIlIlIIIl[62]], lIlIIIlIlIIIl[1], lIlIIIlIlIIIl[1]);
            }
            case 480: {
                int[] nArray = new int[lIlIIIlIlIIIl[2]];
                nArray[J.lIlIIIlIlIIIl[1]] = lIlIIIlIlIIIl[63];
                if (J.lIllIllllllIlIl(Equipment.contains((int[])nArray) ? 1 : 0)) {
                    return new u(lIlIIIlIlIIIl[63]);
                }
                int[] nArray2 = new int[lIlIIIlIlIIIl[2]];
                nArray2[J.lIlIIIlIlIIIl[1]] = lIlIIIlIlIIIl[64];
                if (J.lIllIllllllIlIl(Equipment.contains((int[])nArray2) ? 1 : 0)) {
                    return new u(lIlIIIlIlIIIl[64]);
                }
                return new v(lIlIIIlIlIIII[lIlIIIlIlIIIl[65]], lIlIIIlIlIIII[lIlIIIlIlIIIl[66]], lIlIIIlIlIIIl[2], lIlIIIlIlIIIl[1]);
            }
            case 530: 
            case 532: {
                o o10;
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o10 = new B();
                    "".length();
                    if (((0x98 ^ 0xB0 ^ (0xA0 ^ 0x85)) & (0x29 ^ 0x5A ^ (0x22 ^ 0x5C) ^ -" ".length())) > "   ".length()) {
                        return null;
                    }
                } else {
                    o10 = new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[67]], lIlIIIlIlIIII[lIlIIIlIlIIIl[68]]);
                }
                return o10;
            }
            case 531: {
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[69], lIlIIIlIlIIII[lIlIIIlIlIIIl[70]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[70], lIlIIIlIlIIII[lIlIIIlIlIIIl[71]]);
            }
            case 550: 
            case 570: 
            case 600: {
                o o11;
                String[] stringArray = new String[lIlIIIlIlIIIl[2]];
                stringArray[J.lIlIIIlIlIIIl[1]] = lIlIIIlIlIIII[lIlIIIlIlIIIl[10]];
                if (J.lIllIlllllllIIl(NPCs.getNearest((String[])stringArray))) {
                    return new z(new WorldPoint(lIlIIIlIlIIIl[72], lIlIIIlIlIIIl[73], lIlIIIlIlIIIl[1]));
                }
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o11 = new B();
                    "".length();
                    if ((73 + 28 - 12 + 71 ^ 100 + 86 - 164 + 142) == " ".length()) {
                        return null;
                    }
                } else {
                    o11 = new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[74]], lIlIIIlIlIIII[lIlIIIlIlIIIl[75]]);
                }
                return o11;
            }
            case 560: {
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[76], lIlIIIlIlIIII[lIlIIIlIlIIIl[77]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[78], lIlIIIlIlIIII[lIlIIIlIlIIIl[79]]);
            }
            case 580: {
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[80], lIlIIIlIlIIII[lIlIIIlIlIIIl[81]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[71], lIlIIIlIlIIII[lIlIIIlIlIIIl[82]]);
            }
            case 620: 
            case 640: 
            case 670: {
                o o12;
                J llllllllllllllIlllIIIlIlllIIlIII;
                String[] stringArray = new String[lIlIIIlIlIIIl[2]];
                stringArray[J.lIlIIIlIlIIIl[1]] = lIlIIIlIlIIII[lIlIIIlIlIIIl[69]];
                if (J.lIllIlllllllIIl(NPCs.getNearest((String[])stringArray))) {
                    return new z(new WorldPoint(lIlIIIlIlIIIl[83], lIlIIIlIlIIIl[84], lIlIIIlIlIIIl[1]));
                }
                if (J.lIllIlllllllIII(Dialog.isViewingOptions() ? 1 : 0)) {
                    if (J.lIllIlllllllIII(llllllllllllllIlllIIIlIlllIIlIII.aJ.ironman() ? 1 : 0)) {
                        return null;
                    }
                    if (J.lIllIlllllllIII(Dialog.hasOption((String)lIlIIIlIlIIII[lIlIIIlIlIIIl[80]]) ? 1 : 0)) {
                        Dialog.chooseOption((int)lIlIIIlIlIIIl[2]);
                        "".length();
                    }
                    if (J.lIllIlllllllIII(Dialog.hasOption((String)lIlIIIlIlIIII[lIlIIIlIlIIIl[85]]) ? 1 : 0)) {
                        Dialog.chooseOption((int)lIlIIIlIlIIIl[11]);
                        "".length();
                    }
                    if (J.lIllIlllllllIII(Dialog.hasOption((String)lIlIIIlIlIIII[lIlIIIlIlIIIl[8]]) ? 1 : 0)) {
                        Dialog.chooseOption((int)lIlIIIlIlIIIl[2]);
                        "".length();
                    }
                    return null;
                }
                if (J.lIllIlllllllIII(M.I() ? 1 : 0)) {
                    o12 = new B();
                    "".length();
                    if (" ".length() == -" ".length()) {
                        return null;
                    }
                } else {
                    o12 = new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[56]], lIlIIIlIlIIII[lIlIIIlIlIIIl[24]]);
                }
                return o12;
            }
            case 630: {
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[86], lIlIIIlIlIIII[lIlIIIlIlIIIl[35]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[87], lIlIIIlIlIIII[lIlIIIlIlIIIl[18]]);
            }
            case 650: {
                return new v(lIlIIIlIlIIII[lIlIIIlIlIIIl[47]], lIlIIIlIlIIII[lIlIIIlIlIIIl[78]], lIlIIIlIlIIIl[1], lIlIIIlIlIIIl[2]);
            }
        }
        return null;
    }

    private static boolean lIllIllllllIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIllIllllllIIll() {
        lIlIIIlIlIIIl = new int[88];
        J.lIlIIIlIlIIIl[0] = -(0xFFFFBE2B & 0x7DD7) & (0xFFFFFFFB & 0x3D1F);
        J.lIlIIIlIlIIIl[1] = (180 + 178 - 178 + 50 ^ 140 + 161 - 292 + 171) & (0x2E ^ 0x61 ^ (0x59 ^ 0x44) ^ -" ".length());
        J.lIlIIIlIlIIIl[2] = " ".length();
        J.lIlIIIlIlIIIl[3] = -" ".length();
        J.lIlIIIlIlIIIl[4] = 0xFFFFF3EA & 0xFFD;
        J.lIlIIIlIlIIIl[5] = -(0xFFFFFB9B & 0x7C75) & (0xFFFFFAFF & 0x7FB7);
        J.lIlIIIlIlIIIl[6] = "  ".length();
        J.lIlIIIlIlIIIl[7] = 0xFFFFCB25 & 0x36FE;
        J.lIlIIIlIlIIIl[8] = 0x2B ^ 0x38 ^ (0xE6 ^ 0xC6);
        J.lIlIIIlIlIIIl[9] = (0x7A ^ 0x4C) + (0xAF ^ 0xA6) - (0x78 ^ 0x52) + (13 + 102 - 62 + 90);
        J.lIlIIIlIlIIIl[10] = 77 + 53 - 83 + 100 ^ 53 + 5 - 50 + 178;
        J.lIlIIIlIlIIIl[11] = "   ".length();
        J.lIlIIIlIlIIIl[12] = 9 ^ 0x48 ^ (0x7B ^ 0x3E);
        J.lIlIIIlIlIIIl[13] = 16 + 189 - 91 + 84 ^ 69 + 119 - 35 + 42;
        J.lIlIIIlIlIIIl[14] = 5 ^ 0x3C ^ (0x74 ^ 0x4B);
        J.lIlIIIlIlIIIl[15] = 0x42 ^ 0x2C ^ (0x65 ^ 0xC);
        J.lIlIIIlIlIIIl[16] = 51 + 126 - 96 + 54 ^ 77 + 92 - 140 + 168;
        J.lIlIIIlIlIIIl[17] = 0xD4 ^ 0xC4 ^ (0x5A ^ 0x42);
        J.lIlIIIlIlIIIl[18] = 0x65 ^ 0x4F ^ (0x92 ^ 0x8F);
        J.lIlIIIlIlIIIl[19] = 0x16 ^ 0x1F;
        J.lIlIIIlIlIIIl[20] = 0x85 ^ 0x8F;
        J.lIlIIIlIlIIIl[21] = 0x5D ^ 4 ^ (0xE1 ^ 0xB3);
        J.lIlIIIlIlIIIl[22] = 0x72 ^ 0x20 ^ (0x3B ^ 0x29);
        J.lIlIIIlIlIIIl[23] = 0x49 ^ 0x15 ^ (0xE9 ^ 0xB9);
        J.lIlIIIlIlIIIl[24] = 8 ^ 0x23 ^ (0x26 ^ 0x38);
        J.lIlIIIlIlIIIl[25] = "  ".length() ^ (0x71 ^ 0x7E);
        J.lIlIIIlIlIIIl[26] = 0xF5 ^ 0xAE ^ (0xD6 ^ 0x83);
        J.lIlIIIlIlIIIl[27] = "   ".length() ^ (0x65 ^ 0x69);
        J.lIlIIIlIlIIIl[28] = 36 + 14 - -109 + 1;
        J.lIlIIIlIlIIIl[29] = (0xB8 ^ 0x99) & ~(0x44 ^ 0x65) ^ (0x3B ^ 0x20);
        J.lIlIIIlIlIIIl[30] = 0xB9 ^ 0xA9;
        J.lIlIIIlIlIIIl[31] = 85 + 73 - 12 + 7 ^ 84 + 24 - 83 + 111;
        J.lIlIIIlIlIIIl[32] = 0x11 ^ 0x39 ^ (5 ^ 0x3F);
        J.lIlIIIlIlIIIl[33] = 0xD3 ^ 0x92;
        J.lIlIIIlIlIIIl[34] = 14 + 126 - 46 + 91 ^ 17 + 118 - 99 + 134;
        J.lIlIIIlIlIIIl[35] = 0x19 ^ 0x2F;
        J.lIlIIIlIlIIIl[36] = 141 + 14 - 55 + 86 ^ 29 + 37 - -9 + 99;
        J.lIlIIIlIlIIIl[37] = 0x77 ^ 0x62;
        J.lIlIIIlIlIIIl[38] = 0xFFFFAF79 & 0x5C8F;
        J.lIlIIIlIlIIIl[39] = 0xFFFFF7B2 & 0x2D6D;
        J.lIlIIIlIlIIIl[40] = 0x3B ^ 0xB ^ (0x32 ^ 0x14);
        J.lIlIIIlIlIIIl[41] = 0x4A ^ 0x5D;
        J.lIlIIIlIlIIIl[42] = 0xFFFFCBB8 & 0x357F;
        J.lIlIIIlIlIIIl[43] = 0xBF ^ 0xA7;
        J.lIlIIIlIlIIIl[44] = 9 ^ 0x3E ^ (0xE8 ^ 0xC6);
        J.lIlIIIlIlIIIl[45] = 58 + 123 - 40 + 33 ^ 88 + 94 - 165 + 163;
        J.lIlIIIlIlIIIl[46] = 0x2B ^ 0x68;
        J.lIlIIIlIlIIIl[47] = 0x61 ^ 0x59;
        J.lIlIIIlIlIIIl[48] = 0x48 ^ 0x54;
        J.lIlIIIlIlIIIl[49] = 0xFFFFB7FF & 0x4983;
        J.lIlIIIlIlIIIl[50] = 0x24 ^ 0x5C ^ (0x19 ^ 0x7C);
        J.lIlIIIlIlIIIl[51] = 0xFFFFF5FF & 0xEB5;
        J.lIlIIIlIlIIIl[52] = 0xFFFFDEFF & 0x25FD;
        J.lIlIIIlIlIIIl[53] = -(0xFFFFC72D & 0x3BDF) & (0xFFFFAFFF & 0x579F);
        J.lIlIIIlIlIIIl[54] = 3 ^ 0x3C;
        J.lIlIIIlIlIIIl[55] = 0x68 ^ 0x76;
        J.lIlIIIlIlIIIl[56] = 0x73 ^ 0x47;
        J.lIlIIIlIlIIIl[57] = 107 + 93 - 167 + 109 ^ 91 + 30 - 10 + 34;
        J.lIlIIIlIlIIIl[58] = -(0xFFFFD1FD & 0x3F8B) & (0xFFFFDFAF & 0x3DFF);
        J.lIlIIIlIlIIIl[59] = -(0xFFFFDB93 & 0x766D) & (0xFFFFF77E & 0x7FAF);
        J.lIlIIIlIlIIIl[60] = 0x28 ^ 8;
        J.lIlIIIlIlIIIl[61] = 0x2A ^ 0x38 ^ (0xBC ^ 0x8F);
        J.lIlIIIlIlIIIl[62] = 0x72 ^ 0x50;
        J.lIlIIIlIlIIIl[63] = -(0xFFFFFF51 & 0x1CAF) & (0xFFFF9F7F & 0x7FC9);
        J.lIlIIIlIlIIIl[64] = 0xFFFFF37E & 0xFF3;
        J.lIlIIIlIlIIIl[65] = 63 + 99 - 69 + 65 ^ 92 + 79 - 52 + 70;
        J.lIlIIIlIlIIIl[66] = 1 ^ 0x25;
        J.lIlIIIlIlIIIl[67] = 108 + 127 - 89 + 40 ^ 36 + 101 - 48 + 70;
        J.lIlIIIlIlIIIl[68] = 0x63 ^ 0x29 ^ (0xF4 ^ 0x98);
        J.lIlIIIlIlIIIl[69] = 72 + 96 - 137 + 100 ^ 171 + 10 - 44 + 42;
        J.lIlIIIlIlIIIl[70] = 0x3F ^ 0x18;
        J.lIlIIIlIlIIIl[71] = 0x2B ^ 0x7E ^ (0x72 ^ 0xF);
        J.lIlIIIlIlIIIl[72] = 0xFFFFDD3F & 0x2EF5;
        J.lIlIIIlIlIIIl[73] = -(0xFFFFBFDD & 0x73EF) & (0xFFFFFFFF & 0x3FEF);
        J.lIlIIIlIlIIIl[74] = 0xBE ^ 0x94;
        J.lIlIIIlIlIIIl[75] = 0xBA ^ 0x91;
        J.lIlIIIlIlIIIl[76] = 0xBA ^ 0xA4 ^ (0x3D ^ 0x67);
        J.lIlIIIlIlIIIl[77] = 0x89 ^ 0xA5;
        J.lIlIIIlIlIIIl[78] = 0xAF ^ 0xA3 ^ (0xA3 ^ 0x96);
        J.lIlIIIlIlIIIl[79] = 0x2C ^ 0x5F ^ (0x10 ^ 0x4E);
        J.lIlIIIlIlIIIl[80] = 0x8E ^ 0xBF;
        J.lIlIIIlIlIIIl[81] = 0xD1 ^ 0x86 ^ (0xF8 ^ 0x81);
        J.lIlIIIlIlIIIl[82] = 0x8A ^ 0xA5;
        J.lIlIIIlIlIIIl[83] = -(0xFFFFE757 & 0x1BA9) & (0xFFFFFFEF & 0xF55);
        J.lIlIIIlIlIIIl[84] = -(0xFFFFB7D9 & 0x5AE7) & (0xFFFFBFD4 & 0x5EFB);
        J.lIlIIIlIlIIIl[85] = 0x38 ^ 0xA;
        J.lIlIIIlIlIIIl[86] = 2 + 144 - -55 + 19 ^ 98 + 108 - 92 + 39;
        J.lIlIIIlIlIIIl[87] = 0x4F ^ 0x75;
    }

    private static void lIllIllllllIIlI() {
        lIlIIIlIlIIII = new String[lIlIIIlIlIIIl[87]];
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[1]] = J.lIllIlllllIllll("FAUIIiA9Ax9uDiYFCSs=", "SlmNI");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[2]] = J.lIllIllllllIIII("vp2rzGkiLEE=", "oiFDI");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[6]] = J.lIllIllllllIIII("hBweqJrkMQquEoGQIuFZQg==", "MAkHr");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[11]] = J.lIllIllllllIIIl("AbbgDGR5e6kant0MaRxasw==", "JpxMZ");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[12]] = J.lIllIllllllIIII("4sCbBe2F/V2f2KX9E+XF6w==", "tXSTb");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[13]] = J.lIllIllllllIIII("2wRsUuIZuPg=", "GClNy");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[14]] = J.lIllIllllllIIII("enP4On/xPT0OyOAneJ1RWQ==", "fMNqd");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[15]] = J.lIllIllllllIIII("qyTxw9HbJkU=", "CyyXc");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[17]] = J.lIllIllllllIIII("NNwa7+xTOUfa7Syi+4asFA==", "iYzMn");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[19]] = J.lIllIlllllIllll("BzYOLwg6Nwoz", "NXxJf");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[20]] = J.lIllIllllllIIIl("ucyrYEFwyIG2jh2G/pUJcg==", "RKTsK");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[21]] = J.lIllIllllllIIIl("4FGdDzFQNqE=", "SOORg");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[23]] = J.lIllIllllllIIIl("52jK0xcTaiY=", "jfIoX");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[25]] = J.lIllIllllllIIII("xEsrvvEHUb4=", "NpSZH");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[26]] = J.lIllIllllllIIII("MCLtRhXZLh0MuhxMbT4fGw==", "fvVir");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[27]] = J.lIllIllllllIIII("z88jCFWBU2A=", "sVGOC");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[30]] = J.lIllIlllllIllll("MAsiPgcBRBcsBQ==", "ddEYk");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[31]] = J.lIllIlllllIllll("JCAcIT1VEgw7LRA=", "uUyRI");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[32]] = J.lIllIllllllIIII("CGDX6Nrt048=", "feouf");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[34]] = J.lIllIllllllIIII("DEnxpE7mqeqCPrTF+J4+1A==", "PPniq");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[36]] = J.lIllIllllllIIII("Yz632FZTX9PnGn2EvIYE4g==", "hHHSy");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[37]] = J.lIllIllllllIIII("3kTtb26DVobFkPoIVHNLrGlhmqRwC3De", "wIoMb");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[40]] = J.lIllIllllllIIIl("Q/Gr+/8fdU03PUjmUq7WIE6vgzpT8b+X", "mPmHz");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[41]] = J.lIllIllllllIIIl("12z1MOZ4NQE=", "fUZrV");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[43]] = J.lIllIllllllIIII("wwzUPgFfWS8=", "WDhXK");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[44]] = J.lIllIlllllIllll("IgAaBhMVTz4KARUdAgcGDh0=", "aowdr");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[45]] = J.lIllIllllllIIII("i+F/grPeAsk=", "DCeZC");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[29]] = J.lIllIllllllIIII("GXCBqTLp0HzBxK3d5PFQ1A==", "iIVQB");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[48]] = J.lIllIllllllIIII("m2ayD7qk4ZAUnsF0uskkfg==", "BsVyX");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[50]] = J.lIllIllllllIIIl("4lIe+JErOxOaw76RtC+CPRLxC7PQcRLJ", "CEcSg");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[55]] = J.lIllIlllllIllll("NS0JNjkCYiskLB8tCic=", "vBdTX");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[57]] = J.lIllIlllllIllll("ARkFAC82VicSOisZBhE=", "BvhbN");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[60]] = J.lIllIlllllIllll("IgkXDQ==", "ehchc");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[61]] = J.lIllIllllllIIII("82yXXRKdLQH4eLaPzEl9jg==", "SgRUJ");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[62]] = J.lIllIllllllIIIl("SJCBlc6S+Wk=", "ZvQlZ");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[65]] = J.lIllIllllllIIIl("PBiI0R2R2Ix3Rx6EeYTjQA==", "qBNne");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[66]] = J.lIllIllllllIIIl("fc0deRj+dSA=", "sYwsJ");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[67]] = J.lIllIllllllIIII("yMlyWpphTQopvxdSiXDXvg==", "Jkbxd");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[68]] = J.lIllIllllllIIIl("tq8p2hcPZok=", "JhWVr");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[70]] = J.lIllIllllllIIIl("5UPIPPTSKbGwmAx+H86flhp4pvhTIo0p", "QmiNM");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[71]] = J.lIllIllllllIIII("IjW/d1UOio3lqWL9KfaDEdAn/fM+t+vt", "YZHBx");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[10]] = J.lIllIllllllIIIl("lPinnK2rUeQ6tLwR+zm/zg==", "BpjPw");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[74]] = J.lIllIllllllIIIl("mGx18zRTx3elu/qdvpzw3Q==", "pqUBi");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[75]] = J.lIllIllllllIIII("HjjQl5AmZV8=", "JGDpz");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[77]] = J.lIllIllllllIIIl("z5NQpNwze+s=", "umIAU");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[79]] = J.lIllIlllllIllll("PxMYHAkd", "oayel");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[81]] = J.lIllIlllllIllll("CD4KIBkqP0MJHj04", "NLcEw");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[82]] = J.lIllIllllllIIII("P36wFs67No8Y4jE+3U+zBw==", "ocxZo");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[69]] = J.lIllIlllllIllll("Hg8eICZzJxc6MSEbGj0qIQ==", "SnyIE");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[80]] = J.lIllIllllllIIIl("Sr+kIrJ1PKQ=", "rhzdQ");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[85]] = J.lIllIllllllIIIl("nRtfiCNk8X2RMLCaz7RaIZqF2Rtdy6Xhj1laBy2hVkJcoXrIb+UTSA==", "OtoCW");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[8]] = J.lIllIllllllIIIl("mZT5jkm3R/Wx/B3wmlHtW66T2HB4JPnSMqqF7/AypFo=", "hsFRo");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[56]] = J.lIllIlllllIllll("ChcAGA1nPwkCGjUDBAUBNQ==", "Gvgqn");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[24]] = J.lIllIlllllIllll("Hy4OPl0/IA==", "KObUp");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[35]] = J.lIllIllllllIIII("BzGF80JWSdc=", "SnIna");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[18]] = J.lIllIllllllIIIl("1F+2KIBFu7E=", "nWVCA");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[47]] = J.lIllIlllllIllll("FTIQCikzNA==", "VZyiB");
        J.lIlIIIlIlIIII[J.lIlIIIlIlIIIl[78]] = J.lIllIllllllIIII("NLwLdXnaVLs=", "bWuil");
    }

    static {
        J.lIllIllllllIIll();
        J.lIllIllllllIIlI();
    }

    private static String lIllIllllllIIIl(String llllllllllllllIlllIIIlIllIllllIl, String llllllllllllllIlllIIIlIllIllllII) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIlllIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIllIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIlllIIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIlllIIIIIl.init(lIlIIIlIlIIIl[6], llllllllllllllIlllIIIlIlllIIIIlI);
            return new String(llllllllllllllIlllIIIlIlllIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIlIlllIIIIII) {
            llllllllllllllIlllIIIlIlllIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllllllIllI(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void llllllllllllllIlllIIIlIlllIIllII;
        J llllllllllllllIlllIIIlIlllIIllIl;
        int n2 = Vars.getVarp((int)lIlIIIlIlIIIl[0]);
        o o2 = this.a(n2);
        if (J.lIllIllllllIlII(o2)) {
            return o2.D();
        }
        if (J.lIllIllllllIlIl(llllllllllllllIlllIIIlIlllIIllIl.aJ.quest().equals((Object)h.TUTORIAL_ISLAND) ? 1 : 0)) {
            return lIlIIIlIlIIIl[1];
        }
        if (J.lIllIllllllIllI(llllllllllllllIlllIIIlIlllIIllIl.aE, lIlIIIlIlIIIl[2])) {
            System.out.println("[DEVELOPER]: Delay " + llllllllllllllIlllIIIlIlllIIllIl.aE + " Step: " + (int)llllllllllllllIlllIIIlIlllIIllII);
            llllllllllllllIlllIIIlIlllIIllIl.aE -= lIlIIIlIlIIIl[2];
            return lIlIIIlIlIIIl[1];
        }
        if (J.lIllIllllllIlIl(Movement.shouldWalk() ? 1 : 0)) {
            return lIlIIIlIlIIIl[1];
        }
        if (J.lIllIllllllIlll(Players.getLocal().getAnimation(), lIlIIIlIlIIIl[3])) {
            return lIlIIIlIlIIIl[1];
        }
        if (J.lIllIllllllIllI((int)llllllllllllllIlllIIIlIlllIIllII, lIlIIIlIlIIIl[4])) {
            return lIlIIIlIlIIIl[1];
        }
        return lIlIIIlIlIIIl[2];
    }

    private static String lIllIllllllIIII(String llllllllllllllIlllIIIlIllIllIIII, String llllllllllllllIlllIIIlIllIllIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIIlIllIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIllIllIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIlIlIIIl[17]), "DES");
            Cipher llllllllllllllIlllIIIlIllIllIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIIIlIllIllIlII.init(lIlIIIlIlIIIl[6], llllllllllllllIlllIIIlIllIllIlIl);
            return new String(llllllllllllllIlllIIIlIllIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIllIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIIlIllIllIIll) {
            llllllllllllllIlllIIIlIllIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlllllllIII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIlllllllIIl(Object object) {
        return object == null;
    }

    private static boolean lIllIllllllIlII(Object object) {
        return object != null;
    }
}

