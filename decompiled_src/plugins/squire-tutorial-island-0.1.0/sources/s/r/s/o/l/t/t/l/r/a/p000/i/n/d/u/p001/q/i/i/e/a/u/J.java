package s.r.s.o.l.t.t.l.r.a.p000.i.n.d.u.p001.q.i.i.e.a.u;

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
@TaskDesc(name = "Completing Tutorial Island")
/* renamed from: s.r.s.o.l.t.t.l.r.a.-.i.n.d.u.-.q.i.i.e.a.u.J  reason: invalid package */
/* loaded from: squire-tutorial-island-0.1.0.jar:s/r/s/o/l/t/t/l/r/a/-/i/n/d/u/-/q/i/i/e/a/u/J.class */
public class J extends Task {
    private static /* synthetic */ int[] lIlIIIlIlIIIl;
    private /* synthetic */ int aE;
    private final /* synthetic */ SquireTutorialIsland aK;
    private static /* synthetic */ String[] lIlIIIlIlIIII;
    private final /* synthetic */ Client aI;
    private final /* synthetic */ SquireQuesterConfig aJ;

    private static boolean lIllIllllllIlll(int i, int i2) {
        return i != i2;
    }

    @Inject
    public J(Client client, SquireQuesterConfig squireQuesterConfig, SquireTutorialIsland squireTutorialIsland) {
        this.aI = client;
        this.aJ = squireQuesterConfig;
        this.aK = squireTutorialIsland;
    }

    private static String lIllIlllllIllll(String llllllllllllllIlllIIIlIllIlIIIlI, String llllllllllllllIlllIIIlIllIlIIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIIIlIllIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIIlIllIlIIIII = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIIlIllIlIIIIl.toCharArray();
        int llllllllllllllIlllIIIlIllIIllllI = lIlIIIlIlIIIl[1];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllIlllIIIlIllIIlIlll = charArray2.length;
        int i = lIlIIIlIlIIIl[1];
        while (lIllIlllllllIll(i, llllllllllllllIlllIIIlIllIIlIlll)) {
            char llllllllllllllIlllIIIlIllIlIIIll = charArray2[i];
            llllllllllllllIlllIIIlIllIlIIIII.append((char) (llllllllllllllIlllIIIlIllIlIIIll ^ charArray[llllllllllllllIlllIIIlIllIIllllI % charArray.length]));
            "".length();
            llllllllllllllIlllIIIlIllIIllllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIIlIllIlIIIII);
    }

    private static boolean lIllIlllllllIll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v38, types: [boolean] */
    private o a(int i) {
        switch (i) {
            case 1:
                if (lIllIlllllllIII(M.c(lIlIIIlIlIIIl[5], lIlIIIlIlIIIl[6]) ? 1 : 0)) {
                    return new H();
                }
                if (lIllIlllllllIIl(this.aK.c())) {
                    C c = new C(this.aK);
                    "".length();
                    if ("   ".length() < (((((57 + 38) - (-63)) + 4) ^ (((115 + 10) - (-49)) + 6)) & (((((124 + 42) - 98) + 61) ^ (((62 + 109) - 25) + 5)) ^ (-" ".length())))) {
                        return null;
                    }
                    return c;
                }
                return new G(this.aK);
            case 2:
                if (!lIllIllllllIlIl(M.J() ? 1 : 0) || lIllIlllllllIII(M.I() ? 1 : 0)) {
                    A a = new A();
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                    return a;
                }
                return new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[1]], lIlIIIlIlIIII[lIlIIIlIlIIIl[2]]);
            case 3:
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[8], lIlIIIlIlIIII[lIlIIIlIlIIIl[6]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[10], lIlIIIlIlIIII[lIlIIIlIlIIIl[11]]);
            case 7:
                if (lIllIlllllllIII(M.I() ? 1 : 0)) {
                    B b = new B();
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                    return b;
                }
                return new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[12]], lIlIIIlIlIIII[lIlIIIlIlIIIl[13]]);
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
            case 610:
                return new x();
            case 20:
            case 60:
                if (lIllIlllllllIII(M.I() ? 1 : 0)) {
                    B b2 = new B();
                    "".length();
                    if (" ".length() > " ".length()) {
                        return null;
                    }
                    return b2;
                }
                return new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[14]], lIlIIIlIlIIII[lIlIIIlIlIIIl[15]]);
            case 30:
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[16], lIlIIIlIlIIII[lIlIIIlIlIIIl[17]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[18], lIlIIIlIlIIII[lIlIIIlIlIIIl[19]]);
            case 40:
                return new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[20]], lIlIIIlIlIIII[lIlIIIlIlIIIl[21]]);
            case 50:
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[22], lIlIIIlIlIIII[lIlIIIlIlIIIl[23]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[24], lIlIIIlIlIIII[lIlIIIlIlIIIl[25]]);
            case 80:
                return new r();
            case 90:
                return new q();
            case 140:
                if (lIllIlllllllIII(M.I() ? 1 : 0)) {
                    B b3 = new B();
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                    return b3;
                }
                return new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[26]], lIlIIIlIlIIII[lIlIIIlIlIIIl[27]]);
            case 150:
                return new s();
            case 160:
                return new p();
            case 200:
                return new E(lIlIIIlIlIIIl[28], lIlIIIlIlIIIl[29], lIlIIIlIlIIII[lIlIIIlIlIIIl[30]]);
            case 220:
            case 240:
                if (lIllIlllllllIII(M.I() ? 1 : 0)) {
                    B b4 = new B();
                    "".length();
                    if (" ".length() != " ".length()) {
                        return null;
                    }
                    return b4;
                }
                return new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[31]], lIlIIIlIlIIII[lIlIIIlIlIIIl[32]]);
            case 230:
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[33], lIlIIIlIlIIII[lIlIIIlIlIIIl[34]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[35], lIlIIIlIlIIII[lIlIIIlIlIIIl[36]]);
            case 260:
            case 330:
                String[] strArr = new String[lIlIIIlIlIIIl[2]];
                strArr[lIlIIIlIlIIIl[1]] = lIlIIIlIlIIII[lIlIIIlIlIIIl[37]];
                if (lIllIlllllllIIl(NPCs.getNearest(strArr))) {
                    return new z(new WorldPoint(lIlIIIlIlIIIl[38], lIlIIIlIlIIIl[39], lIlIIIlIlIIIl[1]));
                }
                if (lIllIlllllllIII(M.I() ? 1 : 0)) {
                    B b5 = new B();
                    "".length();
                    if (((226 ^ 190) & ((219 ^ 135) ^ (-1))) > 0) {
                        return null;
                    }
                    return b5;
                }
                return new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[40]], lIlIIIlIlIIII[lIlIIIlIlIIIl[41]]);
            case 320:
                return new t();
            case 350:
                return new E(lIlIIIlIlIIIl[42], lIlIIIlIlIIIl[19], lIlIIIlIlIIII[lIlIIIlIlIIIl[43]]);
            case 370:
            case 410:
            case 470:
                if (lIllIlllllllIII(M.I() ? 1 : 0)) {
                    B b6 = new B();
                    "".length();
                    if ((-"  ".length()) > 0) {
                        return null;
                    }
                    return b6;
                }
                return new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[44]], lIlIIIlIlIIII[lIlIIIlIlIIIl[45]]);
            case 390:
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[46], lIlIIIlIlIIII[lIlIIIlIlIIIl[29]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[47], lIlIIIlIlIIII[lIlIIIlIlIIIl[48]]);
            case 400:
                return new E(lIlIIIlIlIIIl[49], lIlIIIlIlIIIl[2], lIlIIIlIlIIII[lIlIIIlIlIIIl[50]]);
            case 405:
                return new u(lIlIIIlIlIIIl[51]);
            case 420:
                int[] iArr = new int[lIlIIIlIlIIIl[2]];
                iArr[lIlIIIlIlIIIl[1]] = lIlIIIlIlIIIl[52];
                return lIllIllllllIlIl(Equipment.contains(iArr) ? 1 : 0) ? new u(lIlIIIlIlIIIl[52]) : new u(lIlIIIlIlIIIl[53]);
            case 430:
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[54], lIlIIIlIlIIII[lIlIIIlIlIIIl[55]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[56], lIlIIIlIlIIII[lIlIIIlIlIIIl[57]]);
            case 440:
                return new y(new WorldPoint(lIlIIIlIlIIIl[58], lIlIIIlIlIIIl[59], lIlIIIlIlIIIl[1]), lIlIIIlIlIIII[lIlIIIlIlIIIl[60]]);
            case 450:
                return new v(lIlIIIlIlIIII[lIlIIIlIlIIIl[61]], lIlIIIlIlIIII[lIlIIIlIlIIIl[62]], lIlIIIlIlIIIl[1], lIlIIIlIlIIIl[1]);
            case 480:
                int[] iArr2 = new int[lIlIIIlIlIIIl[2]];
                iArr2[lIlIIIlIlIIIl[1]] = lIlIIIlIlIIIl[63];
                if (lIllIllllllIlIl(Equipment.contains(iArr2) ? 1 : 0)) {
                    return new u(lIlIIIlIlIIIl[63]);
                }
                int[] iArr3 = new int[lIlIIIlIlIIIl[2]];
                iArr3[lIlIIIlIlIIIl[1]] = lIlIIIlIlIIIl[64];
                return lIllIllllllIlIl(Equipment.contains(iArr3) ? 1 : 0) ? new u(lIlIIIlIlIIIl[64]) : new v(lIlIIIlIlIIII[lIlIIIlIlIIIl[65]], lIlIIIlIlIIII[lIlIIIlIlIIIl[66]], lIlIIIlIlIIIl[2], lIlIIIlIlIIIl[1]);
            case 530:
            case 532:
                if (lIllIlllllllIII(M.I() ? 1 : 0)) {
                    B b7 = new B();
                    "".length();
                    if ((((152 ^ 176) ^ (160 ^ 133)) & (((41 ^ 90) ^ (34 ^ 92)) ^ (-" ".length()))) > "   ".length()) {
                        return null;
                    }
                    return b7;
                }
                return new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[67]], lIlIIIlIlIIII[lIlIIIlIlIIIl[68]]);
            case 531:
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[69], lIlIIIlIlIIII[lIlIIIlIlIIIl[70]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[70], lIlIIIlIlIIII[lIlIIIlIlIIIl[71]]);
            case 550:
            case 570:
            case 600:
                String[] strArr2 = new String[lIlIIIlIlIIIl[2]];
                strArr2[lIlIIIlIlIIIl[1]] = lIlIIIlIlIIII[lIlIIIlIlIIIl[10]];
                if (lIllIlllllllIIl(NPCs.getNearest(strArr2))) {
                    return new z(new WorldPoint(lIlIIIlIlIIIl[72], lIlIIIlIlIIIl[73], lIlIIIlIlIIIl[1]));
                }
                if (lIllIlllllllIII(M.I() ? 1 : 0)) {
                    B b8 = new B();
                    "".length();
                    if (((((73 + 28) - 12) + 71) ^ (((100 + 86) - 164) + 142)) == " ".length()) {
                        return null;
                    }
                    return b8;
                }
                return new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[74]], lIlIIIlIlIIII[lIlIIIlIlIIIl[75]]);
            case 560:
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[76], lIlIIIlIlIIII[lIlIIIlIlIIIl[77]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[78], lIlIIIlIlIIII[lIlIIIlIlIIIl[79]]);
            case 580:
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[80], lIlIIIlIlIIII[lIlIIIlIlIIIl[81]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[71], lIlIIIlIlIIII[lIlIIIlIlIIIl[82]]);
            case 620:
            case 640:
            case 670:
                String[] strArr3 = new String[lIlIIIlIlIIIl[2]];
                strArr3[lIlIIIlIlIIIl[1]] = lIlIIIlIlIIII[lIlIIIlIlIIIl[69]];
                if (lIllIlllllllIIl(NPCs.getNearest(strArr3))) {
                    return new z(new WorldPoint(lIlIIIlIlIIIl[83], lIlIIIlIlIIIl[84], lIlIIIlIlIIIl[1]));
                }
                if (!lIllIlllllllIII(Dialog.isViewingOptions() ? 1 : 0)) {
                    if (lIllIlllllllIII(M.I() ? 1 : 0)) {
                        B b9 = new B();
                        "".length();
                        if (" ".length() == (-" ".length())) {
                            return null;
                        }
                        return b9;
                    }
                    return new w(lIlIIIlIlIIII[lIlIIIlIlIIIl[56]], lIlIIIlIlIIII[lIlIIIlIlIIIl[24]]);
                } else if (lIllIlllllllIII(this.aJ.ironman() ? 1 : 0)) {
                    return null;
                } else {
                    if (lIllIlllllllIII(Dialog.hasOption(lIlIIIlIlIIII[lIlIIIlIlIIIl[80]]) ? 1 : 0)) {
                        Dialog.chooseOption(lIlIIIlIlIIIl[2]);
                        "".length();
                    }
                    if (lIllIlllllllIII(Dialog.hasOption(lIlIIIlIlIIII[lIlIIIlIlIIIl[85]]) ? 1 : 0)) {
                        Dialog.chooseOption(lIlIIIlIlIIIl[11]);
                        "".length();
                    }
                    if (lIllIlllllllIII(Dialog.hasOption(lIlIIIlIlIIII[lIlIIIlIlIIIl[8]]) ? 1 : 0)) {
                        Dialog.chooseOption(lIlIIIlIlIIIl[2]);
                        "".length();
                        return null;
                    }
                    return null;
                }
            case 630:
                return new D(lIlIIIlIlIIIl[7], lIlIIIlIlIIIl[86], lIlIIIlIlIIII[lIlIIIlIlIIIl[35]], lIlIIIlIlIIIl[9], lIlIIIlIlIIIl[87], lIlIIIlIlIIII[lIlIIIlIlIIIl[18]]);
            case 650:
                return new v(lIlIIIlIlIIII[lIlIIIlIlIIIl[47]], lIlIIIlIlIIII[lIlIIIlIlIIIl[78]], lIlIIIlIlIIIl[1], lIlIIIlIlIIIl[2]);
            default:
                return null;
        }
    }

    private static boolean lIllIllllllIlIl(int i) {
        return i == 0;
    }

    private static void lIllIllllllIIll() {
        lIlIIIlIlIIIl = new int[88];
        lIlIIIlIlIIIl[0] = (-((-16853) & 32215)) & (-5) & 15647;
        lIlIIIlIlIIIl[1] = ((((180 + 178) - 178) + 50) ^ (((140 + 161) - 292) + 171)) & (((46 ^ 97) ^ (89 ^ 68)) ^ (-" ".length()));
        lIlIIIlIlIIIl[2] = " ".length();
        lIlIIIlIlIIIl[3] = -" ".length();
        lIlIIIlIlIIIl[4] = (-3094) & 4093;
        lIlIIIlIlIIIl[5] = (-((-1125) & 31861)) & (-1281) & 32695;
        lIlIIIlIlIIIl[6] = "  ".length();
        lIlIIIlIlIIIl[7] = (-13531) & 14078;
        lIlIIIlIlIIIl[8] = (43 ^ 56) ^ (230 ^ 198);
        lIlIIIlIlIIIl[9] = (((122 ^ 76) + (175 ^ 166)) - (120 ^ 82)) + ((13 + 102) - 62) + 90;
        lIlIIIlIlIIIl[10] = (((77 + 53) - 83) + 100) ^ (((53 + 5) - 50) + 178);
        lIlIIIlIlIIIl[11] = "   ".length();
        lIlIIIlIlIIIl[12] = (9 ^ 72) ^ (123 ^ 62);
        lIlIIIlIlIIIl[13] = (((16 + 189) - 91) + 84) ^ (((69 + 119) - 35) + 42);
        lIlIIIlIlIIIl[14] = (5 ^ 60) ^ (116 ^ 75);
        lIlIIIlIlIIIl[15] = (66 ^ 44) ^ (101 ^ 12);
        lIlIIIlIlIIIl[16] = (((51 + 126) - 96) + 54) ^ (((77 + 92) - 140) + 168);
        lIlIIIlIlIIIl[17] = (212 ^ 196) ^ (90 ^ 66);
        lIlIIIlIlIIIl[18] = (101 ^ 79) ^ (146 ^ 143);
        lIlIIIlIlIIIl[19] = 22 ^ 31;
        lIlIIIlIlIIIl[20] = 133 ^ 143;
        lIlIIIlIlIIIl[21] = (93 ^ 4) ^ (225 ^ 179);
        lIlIIIlIlIIIl[22] = (114 ^ 32) ^ (59 ^ 41);
        lIlIIIlIlIIIl[23] = (73 ^ 21) ^ (233 ^ 185);
        lIlIIIlIlIIIl[24] = (8 ^ 35) ^ (38 ^ 56);
        lIlIIIlIlIIIl[25] = "  ".length() ^ (113 ^ 126);
        lIlIIIlIlIIIl[26] = (245 ^ 174) ^ (214 ^ 131);
        lIlIIIlIlIIIl[27] = "   ".length() ^ (101 ^ 105);
        lIlIIIlIlIIIl[28] = ((36 + 14) - (-109)) + 1;
        lIlIIIlIlIIIl[29] = ((184 ^ 153) & ((68 ^ 101) ^ (-1))) ^ (59 ^ 32);
        lIlIIIlIlIIIl[30] = 185 ^ 169;
        lIlIIIlIlIIIl[31] = (((85 + 73) - 12) + 7) ^ (((84 + 24) - 83) + 111);
        lIlIIIlIlIIIl[32] = (17 ^ 57) ^ (5 ^ 63);
        lIlIIIlIlIIIl[33] = 211 ^ 146;
        lIlIIIlIlIIIl[34] = (((14 + 126) - 46) + 91) ^ (((17 + 118) - 99) + 134);
        lIlIIIlIlIIIl[35] = 25 ^ 47;
        lIlIIIlIlIIIl[36] = (((141 + 14) - 55) + 86) ^ (((29 + 37) - (-9)) + 99);
        lIlIIIlIlIIIl[37] = 119 ^ 98;
        lIlIIIlIlIIIl[38] = (-20615) & 23695;
        lIlIIIlIlIIIl[39] = (-2126) & 11629;
        lIlIIIlIlIIIl[40] = (59 ^ 11) ^ (50 ^ 20);
        lIlIIIlIlIIIl[41] = 74 ^ 93;
        lIlIIIlIlIIIl[42] = (-13384) & 13695;
        lIlIIIlIlIIIl[43] = 191 ^ 167;
        lIlIIIlIlIIIl[44] = (9 ^ 62) ^ (232 ^ 198);
        lIlIIIlIlIIIl[45] = (((58 + 123) - 40) + 33) ^ (((88 + 94) - 165) + 163);
        lIlIIIlIlIIIl[46] = 43 ^ 104;
        lIlIIIlIlIIIl[47] = 97 ^ 89;
        lIlIIIlIlIIIl[48] = 72 ^ 84;
        lIlIIIlIlIIIl[49] = (-18433) & 18819;
        lIlIIIlIlIIIl[50] = (36 ^ 92) ^ (25 ^ 124);
        lIlIIIlIlIIIl[51] = (-2561) & 3765;
        lIlIIIlIlIIIl[52] = (-8449) & 9725;
        lIlIIIlIlIIIl[53] = (-((-14547) & 15327)) & (-20481) & 22431;
        lIlIIIlIlIIIl[54] = 3 ^ 60;
        lIlIIIlIlIIIl[55] = 104 ^ 118;
        lIlIIIlIlIIIl[56] = 115 ^ 71;
        lIlIIIlIlIIIl[57] = (((107 + 93) - 167) + 109) ^ (((91 + 30) - 10) + 34);
        lIlIIIlIlIIIl[58] = (-((-11779) & 16267)) & (-8273) & 15871;
        lIlIIIlIlIIIl[59] = (-((-9325) & 30317)) & (-2178) & 32687;
        lIlIIIlIlIIIl[60] = 40 ^ 8;
        lIlIIIlIlIIIl[61] = (42 ^ 56) ^ (188 ^ 143);
        lIlIIIlIlIIIl[62] = 114 ^ 80;
        lIlIIIlIlIIIl[63] = (-((-175) & 7343)) & (-24705) & 32713;
        lIlIIIlIlIIIl[64] = (-3202) & 4083;
        lIlIIIlIlIIIl[65] = (((63 + 99) - 69) + 65) ^ (((92 + 79) - 52) + 70);
        lIlIIIlIlIIIl[66] = 1 ^ 37;
        lIlIIIlIlIIIl[67] = (((108 + 127) - 89) + 40) ^ (((36 + 101) - 48) + 70);
        lIlIIIlIlIIIl[68] = (99 ^ 41) ^ (244 ^ 152);
        lIlIIIlIlIIIl[69] = (((72 + 96) - 137) + 100) ^ (((171 + 10) - 44) + 42);
        lIlIIIlIlIIIl[70] = 63 ^ 24;
        lIlIIIlIlIIIl[71] = (43 ^ 126) ^ (114 ^ 15);
        lIlIIIlIlIIIl[72] = (-8897) & 12021;
        lIlIIIlIlIIIl[73] = (-((-16419) & 29679)) & (-1) & 16367;
        lIlIIIlIlIIIl[74] = 190 ^ 148;
        lIlIIIlIlIIIl[75] = 186 ^ 145;
        lIlIIIlIlIIIl[76] = (186 ^ 164) ^ (61 ^ 103);
        lIlIIIlIlIIIl[77] = 137 ^ 165;
        lIlIIIlIlIIIl[78] = (175 ^ 163) ^ (163 ^ 150);
        lIlIIIlIlIIIl[79] = (44 ^ 95) ^ (16 ^ 78);
        lIlIIIlIlIIIl[80] = 142 ^ 191;
        lIlIIIlIlIIIl[81] = (209 ^ 134) ^ (248 ^ 129);
        lIlIIIlIlIIIl[82] = 138 ^ 165;
        lIlIIIlIlIIIl[83] = (-((-6313) & 7081)) & (-17) & 3925;
        lIlIIIlIlIIIl[84] = (-((-18471) & 23271)) & (-16428) & 24315;
        lIlIIIlIlIIIl[85] = 56 ^ 10;
        lIlIIIlIlIIIl[86] = (((2 + 144) - (-55)) + 19) ^ (((98 + 108) - 92) + 39);
        lIlIIIlIlIIIl[87] = 79 ^ 117;
    }

    private static void lIllIllllllIIlI() {
        lIlIIIlIlIIII = new String[lIlIIIlIlIIIl[87]];
        lIlIIIlIlIIII[lIlIIIlIlIIIl[1]] = lIllIlllllIllll("FAUIIiA9Ax9uDiYFCSs=", "SlmNI");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[2]] = lIllIllllllIIII("vp2rzGkiLEE=", "oiFDI");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[6]] = lIllIllllllIIII("hBweqJrkMQquEoGQIuFZQg==", "MAkHr");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[11]] = lIllIllllllIIIl("AbbgDGR5e6kant0MaRxasw==", "JpxMZ");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[12]] = lIllIllllllIIII("4sCbBe2F/V2f2KX9E+XF6w==", "tXSTb");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[13]] = lIllIllllllIIII("2wRsUuIZuPg=", "GClNy");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[14]] = lIllIllllllIIII("enP4On/xPT0OyOAneJ1RWQ==", "fMNqd");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[15]] = lIllIllllllIIII("qyTxw9HbJkU=", "CyyXc");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[17]] = lIllIllllllIIII("NNwa7+xTOUfa7Syi+4asFA==", "iYzMn");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[19]] = lIllIlllllIllll("BzYOLwg6Nwoz", "NXxJf");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[20]] = lIllIllllllIIIl("ucyrYEFwyIG2jh2G/pUJcg==", "RKTsK");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[21]] = lIllIllllllIIIl("4FGdDzFQNqE=", "SOORg");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[23]] = lIllIllllllIIIl("52jK0xcTaiY=", "jfIoX");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[25]] = lIllIllllllIIII("xEsrvvEHUb4=", "NpSZH");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[26]] = lIllIllllllIIII("MCLtRhXZLh0MuhxMbT4fGw==", "fvVir");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[27]] = lIllIllllllIIII("z88jCFWBU2A=", "sVGOC");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[30]] = lIllIlllllIllll("MAsiPgcBRBcsBQ==", "ddEYk");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[31]] = lIllIlllllIllll("JCAcIT1VEgw7LRA=", "uUyRI");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[32]] = lIllIllllllIIII("CGDX6Nrt048=", "feouf");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[34]] = lIllIllllllIIII("DEnxpE7mqeqCPrTF+J4+1A==", "PPniq");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[36]] = lIllIllllllIIII("Yz632FZTX9PnGn2EvIYE4g==", "hHHSy");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[37]] = lIllIllllllIIII("3kTtb26DVobFkPoIVHNLrGlhmqRwC3De", "wIoMb");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[40]] = lIllIllllllIIIl("Q/Gr+/8fdU03PUjmUq7WIE6vgzpT8b+X", "mPmHz");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[41]] = lIllIllllllIIIl("12z1MOZ4NQE=", "fUZrV");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[43]] = lIllIllllllIIII("wwzUPgFfWS8=", "WDhXK");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[44]] = lIllIlllllIllll("IgAaBhMVTz4KARUdAgcGDh0=", "aowdr");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[45]] = lIllIllllllIIII("i+F/grPeAsk=", "DCeZC");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[29]] = lIllIllllllIIII("GXCBqTLp0HzBxK3d5PFQ1A==", "iIVQB");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[48]] = lIllIllllllIIII("m2ayD7qk4ZAUnsF0uskkfg==", "BsVyX");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[50]] = lIllIllllllIIIl("4lIe+JErOxOaw76RtC+CPRLxC7PQcRLJ", "CEcSg");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[55]] = lIllIlllllIllll("NS0JNjkCYiskLB8tCic=", "vBdTX");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[57]] = lIllIlllllIllll("ARkFAC82VicSOisZBhE=", "BvhbN");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[60]] = lIllIlllllIllll("IgkXDQ==", "ehchc");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[61]] = lIllIllllllIIII("82yXXRKdLQH4eLaPzEl9jg==", "SgRUJ");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[62]] = lIllIllllllIIIl("SJCBlc6S+Wk=", "ZvQlZ");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[65]] = lIllIllllllIIIl("PBiI0R2R2Ix3Rx6EeYTjQA==", "qBNne");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[66]] = lIllIllllllIIIl("fc0deRj+dSA=", "sYwsJ");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[67]] = lIllIllllllIIII("yMlyWpphTQopvxdSiXDXvg==", "Jkbxd");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[68]] = lIllIllllllIIIl("tq8p2hcPZok=", "JhWVr");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[70]] = lIllIllllllIIIl("5UPIPPTSKbGwmAx+H86flhp4pvhTIo0p", "QmiNM");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[71]] = lIllIllllllIIII("IjW/d1UOio3lqWL9KfaDEdAn/fM+t+vt", "YZHBx");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[10]] = lIllIllllllIIIl("lPinnK2rUeQ6tLwR+zm/zg==", "BpjPw");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[74]] = lIllIllllllIIIl("mGx18zRTx3elu/qdvpzw3Q==", "pqUBi");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[75]] = lIllIllllllIIII("HjjQl5AmZV8=", "JGDpz");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[77]] = lIllIllllllIIIl("z5NQpNwze+s=", "umIAU");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[79]] = lIllIlllllIllll("PxMYHAkd", "oayel");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[81]] = lIllIlllllIllll("CD4KIBkqP0MJHj04", "NLcEw");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[82]] = lIllIllllllIIII("P36wFs67No8Y4jE+3U+zBw==", "ocxZo");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[69]] = lIllIlllllIllll("Hg8eICZzJxc6MSEbGj0qIQ==", "SnyIE");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[80]] = lIllIllllllIIIl("Sr+kIrJ1PKQ=", "rhzdQ");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[85]] = lIllIllllllIIIl("nRtfiCNk8X2RMLCaz7RaIZqF2Rtdy6Xhj1laBy2hVkJcoXrIb+UTSA==", "OtoCW");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[8]] = lIllIllllllIIIl("mZT5jkm3R/Wx/B3wmlHtW66T2HB4JPnSMqqF7/AypFo=", "hsFRo");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[56]] = lIllIlllllIllll("ChcAGA1nPwkCGjUDBAUBNQ==", "Gvgqn");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[24]] = lIllIlllllIllll("Hy4OPl0/IA==", "KObUp");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[35]] = lIllIllllllIIII("BzGF80JWSdc=", "SnIna");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[18]] = lIllIllllllIIIl("1F+2KIBFu7E=", "nWVCA");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[47]] = lIllIlllllIllll("FTIQCikzNA==", "VZyiB");
        lIlIIIlIlIIII[lIlIIIlIlIIIl[78]] = lIllIllllllIIII("NLwLdXnaVLs=", "bWuil");
    }

    static {
        lIllIllllllIIll();
        lIllIllllllIIlI();
    }

    private static String lIllIllllllIIIl(String llllllllllllllIlllIIIlIllIllllll, String llllllllllllllIlllIIIlIllIlllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIllIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIIlIlllIIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIIlIlllIIIIIl.init(lIlIIIlIlIIIl[6], secretKeySpec);
            return new String(llllllllllllllIlllIIIlIlllIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIlllIIIIII) {
            llllllllllllllIlllIIIlIlllIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllllllIllI(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    public boolean run() {
        int varp = Vars.getVarp(lIlIIIlIlIIIl[0]);
        o a = a(varp);
        if (lIllIllllllIlII(a)) {
            return a.D();
        }
        if (lIllIllllllIlIl(this.aJ.quest().equals(EnumC0007h.TUTORIAL_ISLAND) ? 1 : 0)) {
            return lIlIIIlIlIIIl[1];
        }
        if (lIllIllllllIllI(this.aE, lIlIIIlIlIIIl[2])) {
            System.out.println("[DEVELOPER]: Delay " + this.aE + " Step: " + varp);
            this.aE -= lIlIIIlIlIIIl[2];
            return lIlIIIlIlIIIl[1];
        }
        if (!lIllIllllllIlIl(Movement.shouldWalk() ? 1 : 0) && !lIllIllllllIlll(Players.getLocal().getAnimation(), lIlIIIlIlIIIl[3]) && !lIllIllllllIllI(varp, lIlIIIlIlIIIl[4])) {
            return lIlIIIlIlIIIl[2];
        }
        return lIlIIIlIlIIIl[1];
    }

    private static String lIllIllllllIIII(String llllllllllllllIlllIIIlIllIllIIlI, String llllllllllllllIlllIIIlIllIllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIIlIllIllIIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIlIlIIIl[17]), "DES");
            Cipher llllllllllllllIlllIIIlIllIllIlII = Cipher.getInstance("DES");
            llllllllllllllIlllIIIlIllIllIlII.init(lIlIIIlIlIIIl[6], secretKeySpec);
            return new String(llllllllllllllIlllIIIlIllIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIIlIllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIIlIllIllIIll) {
            llllllllllllllIlllIIIlIllIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlllllllIII(int i) {
        return i != 0;
    }

    private static boolean lIllIlllllllIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIllIllllllIlII(Object obj) {
        return obj != null;
    }
}
