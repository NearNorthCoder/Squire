package q.e.u.r.i.u.t.q.p000.e.e.s.r.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.quest.SquireQuesterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@TaskDesc(name = "Completing Tutorial Island")
/* renamed from: q.e.u.r.i.u.t.q.-.e.e.s.r.s.B  reason: invalid package */
/* loaded from: 9740bba2-b19d-4983-898f-2f8083c87d94.jar:q/e/u/r/i/u/t/q/-/e/e/s/r/s/B.class */
public class B extends Task {
    private static /* synthetic */ String[] lIIIllIllIlII;
    private final /* synthetic */ SquireQuesterConfig bz;
    private final /* synthetic */ Client by;
    private static /* synthetic */ int[] lIIIllIllIllI;

    public void cz() {
        WorldPoint hintArrowPoint = this.by.getHintArrowPoint();
        String[] strArr = new String[lIIIllIllIllI[1]];
        strArr[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[136]];
        List at = TileObjects.getAt(hintArrowPoint, strArr);
        if (lIlIIIllIIlIIll(at.isEmpty() ? 1 : 0)) {
            ((TileObject) at.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[137]]);
        }
    }

    public void cA() {
        WorldPoint hintArrowPoint = this.by.getHintArrowPoint();
        String[] strArr = new String[lIIIllIllIllI[1]];
        strArr[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[28]];
        List at = TileObjects.getAt(hintArrowPoint, strArr);
        if (lIlIIIllIIlIIll(at.isEmpty() ? 1 : 0)) {
            String[] strArr2 = new String[lIIIllIllIllI[1]];
            strArr2[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[138]];
            if (lIlIIIllIIlIlIl(((TileObject) at.get(lIIIllIllIllI[0])).hasAction(strArr2) ? 1 : 0)) {
                ((TileObject) at.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[139]]);
            }
            String[] strArr3 = new String[lIIIllIllIllI[1]];
            strArr3[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[140]];
            if (lIlIIIllIIlIlIl(((TileObject) at.get(lIIIllIllIllI[0])).hasAction(strArr3) ? 1 : 0)) {
                ((TileObject) at.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[141]]);
            }
        }
    }

    public void cE() {
        Locatable locatable = null;
        if (lIlIIIllIIllIII(this.by.getHintArrowNpc())) {
            locatable = this.by.getHintArrowNpc();
        }
        if (lIlIIIllIIllIII(locatable) && lIlIIIllIIlIlIl(Reachable.isInteractable(locatable) ? 1 : 0)) {
            System.out.println(lIIIllIllIlII[lIIIllIllIllI[147]]);
            locatable.interact(lIIIllIllIlII[lIIIllIllIllI[148]]);
        }
        if (lIlIIIllIIlIIll(Reachable.isInteractable(locatable) ? 1 : 0)) {
            Walker.walkTo(locatable.getWorldLocation());
            "".length();
        }
    }

    public void e(int i) {
        int b = b(lIIIllIllIllI[1], lIIIllIllIllI[19]);
        System.out.println(lIIIllIllIlII[lIIIllIllIllI[23]]);
        int i2 = lIIIllIllIllI[0];
        while (lIlIIIllIIllIIl(i2, b)) {
            sleep(lIIIllIllIllI[1]);
            Widget widget = Widgets.get(lIIIllIllIllI[7], i);
            System.out.println(i);
            if (lIlIIIllIIllIII(widget)) {
                widget.interact(lIIIllIllIlII[lIIIllIllIllI[71]]);
            }
            i2++;
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return;
            }
        }
    }

    private static boolean lIlIIIllIIllIIl(int i, int i2) {
        return i < i2;
    }

    private static String lIlIIIllIIIlIll(String lllllllllllllllIIIIlIIIIIIIIIIIl, String lllllllllllllllIIIIlIIIIIIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIIIIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8)), lIIIllIllIllI[19]), "DES");
            Cipher lllllllllllllllIIIIlIIIIIIIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIIIIIIIIIIll.init(lIIIllIllIllI[8], lllllllllllllllIIIIlIIIIIIIIIlII);
            return new String(lllllllllllllllIIIIlIIIIIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIIIIIIIIIIlI) {
            lllllllllllllllIIIIlIIIIIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIllIIlIIII() {
        lIIIllIllIlII = new String[lIIIllIllIllI[153]];
        lIIIllIllIlII[lIIIllIllIllI[0]] = lIlIIIllIIIlIlI("HSgzWjcFOj9aOBVpLAg/ET0uCHoEISoUeh0gJQ==", "pIKzZ");
        lIIIllIllIlII[lIIIllIllIllI[1]] = lIlIIIllIIIlIlI("YQ==", "KGZLX");
        lIIIllIllIlII[lIIIllIllIllI[8]] = lIlIIIllIIIlIlI("Kwk1PRxOCSA1Cw==", "ngAXn");
        lIIIllIllIlII[lIIIllIllIllI[12]] = lIlIIIllIIIlIlI("Cx03Kh90UjEwA3gWLCsWNBM8eAg5HyA=", "XrEXf");
        lIIIllIllIlII[lIIIllIllIllI[13]] = lIlIIIllIIIlIll("a276ldysZwqKwhifsfiapQ==", "JUNfy");
        lIIIllIllIlII[lIIIllIllIllI[14]] = lIlIIIllIIIllII("v+hLa8x/ors=", "iRaCL");
        lIIIllIllIlII[lIIIllIllIllI[16]] = lIlIIIllIIIlIlI("HR0+BUMkAnEAAjwX", "QrQnc");
        lIIIllIllIlII[lIIIllIllIllI[10]] = lIlIIIllIIIlIll("3QSbzMuyofF2P32U1UU2kg==", "OWhrp");
        lIIIllIllIlII[lIIIllIllIllI[19]] = lIlIIIllIIIllII("JPGcx9k1nw3SUO01x4Ml9A==", "iIVkt");
        lIIIllIllIlII[lIIIllIllIllI[24]] = lIlIIIllIIIlIll("t6wucbzqL+w8/YOdErzCkQ==", "TtXoH");
        lIIIllIllIlII[lIIIllIllIllI[20]] = lIlIIIllIIIlIll("7Dc5uDH3Q0eI5xHplL1huQ==", "yFfWE");
        lIIIllIllIlII[lIIIllIllIllI[25]] = lIlIIIllIIIllII("kvvzTB+5nzE=", "gqEXT");
        lIIIllIllIlII[lIIIllIllIllI[9]] = lIlIIIllIIIlIlI("PScMACUd", "nLelI");
        lIIIllIllIlII[lIIIllIllIllI[11]] = lIlIIIllIIIlIll("Hein2Gh8mx0SR7ta9y/GFw==", "XpWzP");
        lIIIllIllIlII[lIIIllIllIllI[32]] = lIlIIIllIIIllII("st/5TTYQWRg=", "pdLEE");
        lIIIllIllIlII[lIIIllIllIllI[33]] = lIlIIIllIIIlIll("KwqRHnnnGFzZYo3CTcc4VA==", "YPfyI");
        lIIIllIllIlII[lIIIllIllIllI[35]] = lIlIIIllIIIllII("X6iwhLqBfzr36goXIIqitQ==", "DfeUL");
        lIIIllIllIlII[lIIIllIllIllI[36]] = lIlIIIllIIIlIlI("KjEjCQ==", "lXQlM");
        lIIIllIllIlII[lIIIllIllIllI[15]] = lIlIIIllIIIllII("zhwJChV7C6MQmksQ4FSvhg==", "wzGhq");
        lIIIllIllIlII[lIIIllIllIllI[6]] = lIlIIIllIIIlIll("sBglHQFRkagTkbkKq9rmqA==", "idHBe");
        lIIIllIllIlII[lIIIllIllIllI[21]] = lIlIIIllIIIllII("yuEdY+zucso/72C+Vr/qVQ==", "ToUGm");
        lIIIllIllIlII[lIIIllIllIllI[42]] = lIlIIIllIIIllII("y9Z4zlyDs8I=", "NZGVH");
        lIIIllIllIlII[lIIIllIllIllI[46]] = lIlIIIllIIIlIlI("DhYjAj8/WRYQPQ==", "ZyDeS");
        lIIIllIllIlII[lIIIllIllIllI[51]] = lIlIIIllIIIlIll("3I3H9Cov7z6+2e1f8uk+2g==", "IijZi");
        lIIIllIllIlII[lIIIllIllIllI[55]] = lIlIIIllIIIllII("ukgajC40/ul4gGwW41socsWAOdpXxEvu", "nHQjc");
        lIIIllIllIlII[lIIIllIllIllI[61]] = lIlIIIllIIIlIll("asuI0OFiUfM=", "OYowv");
        lIIIllIllIlII[lIIIllIllIllI[64]] = lIlIIIllIIIlIlI("CzcvExs=", "JYYzw");
        lIIIllIllIlII[lIIIllIllIllI[45]] = lIlIIIllIIIlIlI("FR8DMwE=", "FrjGi");
        lIIIllIllIlII[lIIIllIllIllI[67]] = lIlIIIllIIIllII("lCmxCH5vwRk=", "RRFaP");
        lIIIllIllIlII[lIIIllIllIllI[72]] = lIlIIIllIIIlIlI("EigrCWgANiwOOCgiNxM=", "EGYgH");
        lIIIllIllIlII[lIIIllIllIllI[22]] = lIlIIIllIIIlIll("bx+r7sTRVJUOH9vzZkVjePtx1MEd8MQN", "ZqvrB");
        lIIIllIllIlII[lIIIllIllIllI[76]] = lIlIIIllIIIlIlI("MTsuCDMWaSUHLhQsMw==", "sIAfI");
        lIIIllIllIlII[lIIIllIllIllI[79]] = lIlIIIllIIIlIll("B++nvn3JV5WNRHSzMgeYLw==", "hgkOY");
        lIIIllIllIlII[lIIIllIllIllI[80]] = lIlIIIllIIIlIll("yUfyhFfHae32YyaXSAKOuQ==", "XvKEC");
        lIIIllIllIlII[lIIIllIllIllI[83]] = lIlIIIllIIIllII("EtW78NhRjUE0MDGkMwRebg==", "AvzDS");
        lIIIllIllIlII[lIIIllIllIllI[88]] = lIlIIIllIIIlIlI("DBUCCA==", "Cegft");
        lIIIllIllIlII[lIIIllIllIllI[90]] = lIlIIIllIIIllII("jSSmIIcKsFI=", "caDOF");
        lIIIllIllIlII[lIIIllIllIllI[93]] = lIlIIIllIIIlIll("FKNiGd//Ljii/5i3sdo6+A==", "qGLlF");
        lIIIllIllIlII[lIIIllIllIllI[94]] = lIlIIIllIIIlIlI("HwcIEwUuABA=", "Logaq");
        lIIIllIllIlII[lIIIllIllIllI[95]] = lIlIIIllIIIlIlI("LT4HIhQH", "lJsCw");
        lIIIllIllIlII[lIIIllIllIllI[18]] = lIlIIIllIIIlIlI("CxYVIBckAVYCAyQUESoPLxsC", "JuvOb");
        lIIIllIllIlII[lIIIllIllIllI[110]] = lIlIIIllIIIllII("ETenv478x/s=", "SlbGG");
        lIIIllIllIlII[lIIIllIllIllI[113]] = lIlIIIllIIIllII("sqIHRIAUgkFouR1XX1Mazg==", "PKJaj");
        lIIIllIllIlII[lIIIllIllIllI[122]] = lIlIIIllIIIllII("FPCsjnIyo5o=", "uMcPg");
        lIIIllIllIlII[lIIIllIllIllI[128]] = lIlIIIllIIIlIll("QVLJnlheZ6el7mWqKHduXY40jj/a3G+A", "fXrVE");
        lIIIllIllIlII[lIIIllIllIllI[130]] = lIlIIIllIIIlIll("W5JB8ltK508=", "JdflO");
        lIIIllIllIlII[lIIIllIllIllI[131]] = lIlIIIllIIIllII("qpr8QHzg2XdiXISOUQyc5caJI5TR2pLJ", "KoIRj");
        lIIIllIllIlII[lIIIllIllIllI[132]] = lIlIIIllIIIllII("onjwhZhux9g=", "JOYMI");
        lIIIllIllIlII[lIIIllIllIllI[133]] = lIlIIIllIIIlIlI("OgVcczpTB1A9HABKAD8SGgQZPRRUHh9zFxtKBDsSAEQ=", "tjpSs");
        lIIIllIllIlII[lIIIllIllIllI[134]] = lIlIIIllIIIlIlI("KwowbQ==", "roCCN");
        lIIIllIllIlII[lIIIllIllIllI[26]] = lIlIIIllIIIllII("iN6Cnrz0VZ4=", "sfWgg");
        lIIIllIllIlII[lIIIllIllIllI[82]] = lIlIIIllIIIllII("AF+BLCFmPAzu8kzhQoZJZh2WdbEUHyD9Ite8j8xO0EY=", "NvXGy");
        lIIIllIllIlII[lIIIllIllIllI[27]] = lIlIIIllIIIlIll("SD//ZFpAscGjT4TMDK/5I4i+0jZdTPQdFB9QfGcvffo=", "IfEyH");
        lIIIllIllIlII[lIIIllIllIllI[50]] = lIlIIIllIIIlIlI("FhwrCQYnHg==", "UsEoo");
        lIIIllIllIlII[lIIIllIllIllI[23]] = lIlIIIllIIIllII("o0XuA02aGFIN5C/gq/e7bK2HjuoVc+OM", "WoALs");
        lIIIllIllIlII[lIIIllIllIllI[71]] = lIlIIIllIIIlIlI("PzEqDDQY", "lTFiW");
        lIIIllIllIlII[lIIIllIllIllI[109]] = lIlIIIllIIIlIll("mqK2C8+HueU=", "NPQXS");
        lIIIllIllIlII[lIIIllIllIllI[121]] = lIlIIIllIIIllII("TjVqHmSDl7s=", "DkmSr");
        lIIIllIllIlII[lIIIllIllIllI[136]] = lIlIIIllIIIlIll("p5qG/b6uqZs=", "Owowd");
        lIIIllIllIlII[lIIIllIllIllI[137]] = lIlIIIllIIIlIll("HCJpdYKsiUM=", "DOvFi");
        lIIIllIllIlII[lIIIllIllIllI[28]] = lIlIIIllIIIlIll("sDxQb3UNC2s=", "DmZCv");
        lIIIllIllIlII[lIIIllIllIllI[138]] = lIlIIIllIIIlIll("8oJ/pPMHWyjv5CKA88vG3g==", "Kvqwr");
        lIIIllIllIlII[lIIIllIllIllI[139]] = lIlIIIllIIIlIlI("EwgvOw19ACkhAQ==", "PdFVo");
        lIIIllIllIlII[lIIIllIllIllI[140]] = lIlIIIllIIIlIll("aPLrPvk9DhEc8djCeTl/bA==", "ubEOX");
        lIIIllIllIlII[lIIIllIllIllI[141]] = lIlIIIllIIIlIll("SUNUmevDmE3i5svumBPZCw==", "IqPFc");
        lIIIllIllIlII[lIIIllIllIllI[142]] = lIlIIIllIIIlIlI("JwgsDG0HBi0TJQ==", "eiBgM");
        lIIIllIllIlII[lIIIllIllIllI[143]] = lIlIIIllIIIlIlI("PzUx", "jFTih");
        lIIIllIllIlII[lIIIllIllIllI[144]] = lIlIIIllIIIllII("neWnGQAxk8SogLCafAkYeA==", "GHYvz");
        lIIIllIllIlII[lIIIllIllIllI[135]] = lIlIIIllIIIllII("Mp0EC4SJ/mc=", "lJCuF");
        lIIIllIllIlII[lIIIllIllIllI[145]] = lIlIIIllIIIllII("QpSI6FLw3sotscRW1m5k2w==", "eUeqB");
        lIIIllIllIlII[lIIIllIllIllI[29]] = lIlIIIllIIIlIll("11dmeAIyfS7bMytwxLAoTg==", "lPszA");
        lIIIllIllIlII[lIIIllIllIllI[146]] = lIlIIIllIIIllII("0DvPondeKuA=", "xDunq");
        lIIIllIllIlII[lIIIllIllIllI[147]] = lIlIIIllIIIllII("8232Rexl4NE=", "ciqzU");
        lIIIllIllIlII[lIIIllIllIllI[148]] = lIlIIIllIIIlIll("IKdV/vRJnfc=", "jaPwj");
        lIIIllIllIlII[lIIIllIllIllI[149]] = lIlIIIllIIIlIll("TO8Q/NOaXLA=", "ztSXP");
        lIIIllIllIlII[lIIIllIllIllI[150]] = lIlIIIllIIIlIll("Ux5UYSZWRaoArWhOYsJ81w==", "zNAWX");
        lIIIllIllIlII[lIIIllIllIllI[151]] = lIlIIIllIIIlIlI("Mh0yHiJVBjIE", "utSpV");
        lIIIllIllIlII[lIIIllIllIllI[152]] = lIlIIIllIIIlIlI("Kxgt", "DjHno");
    }

    private static boolean lIlIIIllIIlIllI(int i, int i2) {
        return i == i2;
    }

    public void cD() {
        WorldPoint hintArrowPoint = this.by.getHintArrowPoint();
        String[] strArr = new String[lIIIllIllIllI[8]];
        strArr[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[145]];
        strArr[lIIIllIllIllI[1]] = lIIIllIllIlII[lIIIllIllIllI[29]];
        List at = TileObjects.getAt(hintArrowPoint, strArr);
        System.out.println(((TileObject) at.get(lIIIllIllIllI[0])).getWorldLocation());
        if (lIlIIIllIIlIIll(at.isEmpty() ? 1 : 0)) {
            ((TileObject) at.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[146]]);
        }
    }

    public void cB() {
        WorldPoint hintArrowPoint = this.by.getHintArrowPoint();
        String[] strArr = new String[lIIIllIllIllI[1]];
        strArr[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[142]];
        List at = TileObjects.getAt(hintArrowPoint, strArr);
        if (lIlIIIllIIlIIll(at.isEmpty() ? 1 : 0)) {
            ((TileObject) at.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[143]]);
        }
    }

    static {
        lIlIIIllIIlIIIl();
        lIlIIIllIIlIIII();
    }

    private static int b(int i, int i2) {
        if (lIlIIIllIIlIIlI(i, i2)) {
            throw new IllegalArgumentException(lIIIllIllIlII[lIIIllIllIllI[0]]);
        }
        return new Random().nextInt((i2 - i) + lIIIllIllIllI[1]) + i;
    }

    private static void lIlIIIllIIlIIIl() {
        lIIIllIllIllI = new int[154];
        lIIIllIllIllI[0] = (49 ^ 25) & ((10 ^ 34) ^ (-1));
        lIIIllIllIllI[1] = " ".length();
        lIIIllIllIllI[2] = (-1221) & 1501;
        lIIIllIllIllI[3] = -" ".length();
        lIIIllIllIllI[4] = (-2055) & 3054;
        lIIIllIllIllI[5] = (-((-29219) & 30579)) & (-18562) & 20479;
        lIIIllIllIllI[6] = 150 ^ 133;
        lIIIllIllIllI[7] = (-((-679) & 28671)) & (-4097) & 32767;
        lIIIllIllIllI[8] = "  ".length();
        lIIIllIllIllI[9] = 180 ^ 184;
        lIIIllIllIllI[10] = 123 ^ 124;
        lIIIllIllIllI[11] = 168 ^ 165;
        lIIIllIllIllI[12] = "   ".length();
        lIIIllIllIllI[13] = (253 ^ 185) ^ (4 ^ 68);
        lIIIllIllIllI[14] = (11 ^ 89) ^ (195 ^ 148);
        lIIIllIllIllI[15] = (77 ^ 48) ^ (205 ^ 162);
        lIIIllIllIllI[16] = (234 ^ 192) ^ (3 ^ 47);
        lIIIllIllIllI[17] = ((23 + 158) - 63) + 46;
        lIIIllIllIllI[18] = (((5 + 72) - (-3)) + 85) ^ (((129 + 80) - 190) + 122);
        lIIIllIllIllI[19] = 116 ^ 124;
        lIIIllIllIllI[20] = 140 ^ 134;
        lIIIllIllIllI[21] = 187 ^ 175;
        lIIIllIllIllI[22] = 23 ^ 9;
        lIIIllIllIllI[23] = (14 ^ 99) ^ (238 ^ 181);
        lIIIllIllIllI[24] = 33 ^ 40;
        lIIIllIllIllI[25] = (3 ^ 69) ^ (127 ^ 50);
        lIIIllIllIllI[26] = (120 ^ 72) ^ "  ".length();
        lIIIllIllIllI[27] = (((141 + 116) - 242) + 157) ^ (((108 + 122) - 91) + 13);
        lIIIllIllIllI[28] = 122 ^ 70;
        lIIIllIllIllI[29] = (124 ^ 80) ^ (242 ^ 152);
        lIIIllIllIllI[30] = (-22586) & 32315;
        lIIIllIllIllI[31] = (((108 + 57) - 100) + 80) ^ (((3 + 167) - 104) + 127);
        lIIIllIllIllI[32] = (((138 + 1) - 68) + 103) ^ (((144 + 121) - 257) + 152);
        lIIIllIllIllI[33] = 161 ^ 174;
        lIIIllIllIllI[34] = (((162 + 153) - 133) + 17) ^ (((156 + 47) - 56) + 10);
        lIIIllIllIllI[35] = (118 ^ 87) ^ (111 ^ 94);
        lIIIllIllIllI[36] = (120 ^ 63) ^ (11 ^ 93);
        lIIIllIllIllI[37] = 243 ^ 139;
        lIIIllIllIllI[38] = ((81 + 65) - 29) + 13;
        lIIIllIllIllI[39] = ((24 + 98) - (-10)) + 8;
        lIIIllIllIllI[40] = ((53 + 111) - 44) + 30;
        lIIIllIllIllI[41] = ((20 + 113) - 99) + 126;
        lIIIllIllIllI[42] = 75 ^ 94;
        lIIIllIllIllI[43] = (((31 ^ 43) + (((151 + 104) - 209) + 121)) - (((75 + 128) - 123) + 97)) + ((47 + 6) - (-56)) + 19;
        lIIIllIllIllI[44] = (((6 ^ 12) + (120 ^ 86)) - (-(246 ^ 189))) + (230 ^ 163);
        lIIIllIllIllI[45] = (254 ^ 173) ^ (82 ^ 26);
        lIIIllIllIllI[46] = (((158 + 108) - 222) + 116) ^ (((131 + 37) - 80) + 94);
        lIIIllIllIllI[47] = (((104 ^ 119) + (83 ^ 28)) - (-(121 ^ 64))) + (88 ^ 115);
        lIIIllIllIllI[48] = ((202 + 33) - 179) + 164;
        lIIIllIllIllI[49] = ((40 + 154) - 93) + 129;
        lIIIllIllIllI[50] = 169 ^ 156;
        lIIIllIllIllI[51] = 86 ^ 65;
        lIIIllIllIllI[52] = ((126 + 82) - 28) + 60;
        lIIIllIllIllI[53] = (((((61 + 176) - 8) + 20) + (((90 + 12) - 15) + 62)) - ((-16458) & 16767)) + ((66 + 29) - (-49)) + 18;
        lIIIllIllIllI[54] = (-((-609) & 30460)) & (-2049) & 32159;
        lIIIllIllIllI[55] = (((16 + 74) - (-8)) + 71) ^ (((134 + 43) - 51) + 51);
        lIIIllIllIllI[56] = (-((-1029) & 30517)) & (-7) & 32575;
        lIIIllIllIllI[57] = (-22666) & 32175;
        lIIIllIllIllI[58] = (-4691) & 4990;
        lIIIllIllIllI[59] = (-17922) & 18231;
        lIIIllIllIllI[60] = (-19000) & 19319;
        lIIIllIllIllI[61] = 157 ^ 132;
        lIIIllIllIllI[62] = (-18965) & 19294;
        lIIIllIllIllI[63] = (-9387) & 9726;
        lIIIllIllIllI[64] = 82 ^ 72;
        lIIIllIllIllI[65] = (-((-26) & 24763)) & (-3585) & 28671;
        lIIIllIllIllI[66] = (-((-36) & 15915)) & (-16513) & 32703;
        lIIIllIllIllI[67] = (((133 + 40) - 43) + 6) ^ (((87 + 77) - 35) + 19);
        lIIIllIllIllI[68] = (-149) & 508;
        lIIIllIllIllI[69] = (-((-115) & 16127)) & (-2) & 16383;
        lIIIllIllIllI[70] = (-22113) & 22502;
        lIIIllIllIllI[71] = 114 ^ 69;
        lIIIllIllIllI[72] = "   ".length() ^ (55 ^ 41);
        lIIIllIllIllI[73] = (-6151) & 6550;
        lIIIllIllIllI[74] = (-20601) & 20987;
        lIIIllIllIllI[75] = (-((-14229) & 30677)) & (-4651) & 21503;
        lIIIllIllIllI[76] = 100 ^ 123;
        lIIIllIllIllI[77] = (-32262) & 32671;
        lIIIllIllIllI[78] = (-((-2734) & 31471)) & (-11) & 29167;
        lIIIllIllIllI[79] = 22 ^ 54;
        lIIIllIllIllI[80] = 173 ^ 140;
        lIIIllIllIllI[81] = (-10753) & 11182;
        lIIIllIllIllI[82] = 13 ^ 62;
        lIIIllIllIllI[83] = (100 ^ 1) ^ (32 ^ 103);
        lIIIllIllIllI[84] = (-4168) & 4607;
        lIIIllIllIllI[85] = (-((-3) & 25299)) & (-1) & 28407;
        lIIIllIllIllI[86] = (-2561) & 12078;
        lIIIllIllIllI[87] = (-((-18615) & 19135)) & (-1) & 10239;
        lIIIllIllIllI[88] = " ".length() ^ (46 ^ 12);
        lIIIllIllIllI[89] = (-((-1869) & 30541)) & (-1585) & 30706;
        lIIIllIllIllI[90] = 127 ^ 91;
        lIIIllIllIllI[91] = (-((-28973) & 32558)) & (-12329) & 16383;
        lIIIllIllIllI[92] = (-((-4426) & 31053)) & (-4117) & 31223;
        lIIIllIllIllI[93] = (163 ^ 181) ^ (39 ^ 20);
        lIIIllIllIllI[94] = (230 ^ 160) ^ (249 ^ 153);
        lIIIllIllIllI[95] = (83 ^ 62) ^ (123 ^ 49);
        lIIIllIllIllI[96] = (-21004) & 21503;
        lIIIllIllIllI[97] = (-16385) & 16894;
        lIIIllIllIllI[98] = (-16884) & 17403;
        lIIIllIllIllI[99] = (-28803) & 29327;
        lIIIllIllIllI[100] = (-((-625) & 28662)) & (-33) & 28599;
        lIIIllIllIllI[101] = (-21549) & 22079;
        lIIIllIllIllI[102] = (-22851) & 23382;
        lIIIllIllIllI[103] = (-17634) & 18173;
        lIIIllIllIllI[104] = (-((-871) & 13287)) & (-257) & 13222;
        lIIIllIllIllI[105] = (-((-11415) & 15519)) & (-17153) & 24575;
        lIIIllIllIllI[106] = (-8454) & 11581;
        lIIIllIllIllI[107] = (-((-3239) & 28671)) & (-133) & 28670;
        lIIIllIllIllI[108] = (-206) & 765;
        lIIIllIllIllI[109] = 150 ^ 174;
        lIIIllIllIllI[110] = 3 ^ 42;
        lIIIllIllIllI[111] = (-((-529) & 29334)) & (-2305) & 31679;
        lIIIllIllIllI[112] = (-((-4770) & 6845)) & (-21921) & 24575;
        lIIIllIllIllI[113] = (101 ^ 80) ^ (132 ^ 155);
        lIIIllIllIllI[114] = (-((-393) & 23983)) & (-258) & 24447;
        lIIIllIllIllI[115] = (-8582) & 9191;
        lIIIllIllIllI[116] = (-27794) & 28413;
        lIIIllIllIllI[117] = (-((-17061) & 25527)) & (-16385) & 28159;
        lIIIllIllIllI[118] = (-29460) & 32599;
        lIIIllIllIllI[119] = (-((-22853) & 31606)) & (-20801) & 32639;
        lIIIllIllIllI[120] = (-((-617) & 31337)) & (-1034) & 32383;
        lIIIllIllIllI[121] = (71 ^ 77) ^ (49 ^ 2);
        lIIIllIllIllI[122] = (((67 + 98) - 70) + 45) ^ (((56 + 71) - 99) + 139);
        lIIIllIllIllI[123] = (-((-642) & 20155)) & (-12355) & 32507;
        lIIIllIllIllI[124] = (-((-16922) & 30335)) & (-16401) & 30463;
        lIIIllIllIllI[125] = (-((-2087) & 14911)) & (-1) & 15965;
        lIIIllIllIllI[126] = (-20587) & 23674;
        lIIIllIllIllI[127] = (-24897) & 25566;
        lIIIllIllIllI[128] = (96 ^ 80) ^ (131 ^ 159);
        lIIIllIllIllI[129] = (-21737) & 22524;
        lIIIllIllIllI[130] = (14 ^ 47) ^ (190 ^ 178);
        lIIIllIllIllI[131] = 9 ^ 39;
        lIIIllIllIllI[132] = 45 ^ 2;
        lIIIllIllIllI[133] = 168 ^ 152;
        lIIIllIllIllI[134] = (38 ^ 8) ^ (25 ^ 6);
        lIIIllIllIllI[135] = 76 ^ 8;
        lIIIllIllIllI[136] = (((13 + 65) - (-22)) + 37) ^ (((79 + 72) - 4) + 32);
        lIIIllIllIllI[137] = 62 ^ 5;
        lIIIllIllIllI[138] = (107 ^ 63) ^ (84 ^ 61);
        lIIIllIllIllI[139] = 25 ^ 39;
        lIIIllIllIllI[140] = (((186 + 159) - 172) + 14) ^ (((106 + 103) - 147) + 70);
        lIIIllIllIllI[141] = 246 ^ 182;
        lIIIllIllIllI[142] = 235 ^ 170;
        lIIIllIllIllI[143] = 69 ^ 7;
        lIIIllIllIllI[144] = 254 ^ 189;
        lIIIllIllIllI[145] = 102 ^ 35;
        lIIIllIllIllI[146] = 59 ^ 124;
        lIIIllIllIllI[147] = (28 ^ 73) ^ (90 ^ 71);
        lIIIllIllIllI[148] = 68 ^ 13;
        lIIIllIllIllI[149] = (((44 + 26) - (-54)) + 110) ^ (((72 + 126) - 110) + 72);
        lIIIllIllIllI[150] = (((39 + 78) - 69) + 89) ^ (((126 + 148) - 204) + 124);
        lIIIllIllIllI[151] = 76 ^ 0;
        lIIIllIllIllI[152] = 29 ^ 80;
        lIIIllIllIllI[153] = 113 ^ 63;
    }

    private static boolean lIlIIIllIIlIlIl(int i) {
        return i != 0;
    }

    public void e(String str) {
        String[] strArr = new String[lIIIllIllIllI[1]];
        strArr[lIIIllIllIllI[0]] = str;
        if (lIlIIIllIIlIIll(Equipment.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[lIIIllIllIllI[1]];
            strArr2[lIIIllIllIllI[0]] = str;
            if (lIlIIIllIIlIlIl(Inventory.contains(strArr2) ? 1 : 0)) {
                String[] strArr3 = new String[lIIIllIllIllI[1]];
                strArr3[lIIIllIllIllI[0]] = str;
                Inventory.getFirst(strArr3).interact(lIIIllIllIlII[lIIIllIllIllI[149]]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v143, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v181, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v187, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v192, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v197, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v206, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v394, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v450, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v452, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v454, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v456, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v458, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v460, types: [boolean] */
    public boolean run() {
        if (lIlIIIllIIlIIll(this.bz.quest().equals(h.TUTORIAL_ISLAND) ? 1 : 0)) {
            return lIIIllIllIllI[0];
        }
        int varp = Vars.getVarp(lIIIllIllIllI[2]);
        if (!lIlIIIllIIlIIll(Movement.shouldWalk() ? 1 : 0) && !lIlIIIllIIlIlII(Players.getLocal().getAnimation(), lIIIllIllIllI[3])) {
            if (lIlIIIllIIlIlIl(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return lIIIllIllIllI[0];
            } else if (lIlIIIllIIlIIlI(varp, lIIIllIllIllI[4])) {
                return lIIIllIllIllI[0];
            } else {
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[1])) {
                    if (lIlIIIllIIlIlll(Widgets.get(lIIIllIllIllI[5], lIIIllIllIllI[6])) && lIlIIIllIIlIlll(Widgets.get(lIIIllIllIllI[7], lIIIllIllIllI[8]))) {
                        return lIIIllIllIllI[0];
                    }
                    if (lIlIIIllIIllIII(Widgets.get(lIIIllIllIllI[5], lIIIllIllIllI[9]))) {
                        if (lIlIIIllIIlIlIl(Widgets.get(lIIIllIllIllI[5], lIIIllIllIllI[9]).getText().equals(lIIIllIllIlII[lIIIllIllIllI[1]]) ? 1 : 0)) {
                            Widgets.get(lIIIllIllIllI[5], lIIIllIllIllI[10]).interact(lIIIllIllIlII[lIIIllIllIllI[8]]);
                            Keyboard.type(E.cM());
                        }
                        if (lIlIIIllIIlIlIl(Widgets.get(lIIIllIllIllI[5], lIIIllIllIllI[11]).getText().contains(lIIIllIllIlII[lIIIllIllIllI[12]]) ? 1 : 0)) {
                            Widgets.get(lIIIllIllIllI[5], lIIIllIllIllI[10]).interact(lIIIllIllIlII[lIIIllIllIllI[13]]);
                            Keyboard.type(E.cM());
                            sleep(lIIIllIllIllI[14]);
                        }
                        if (lIlIIIllIIlIIll(Widgets.get(lIIIllIllIllI[5], lIIIllIllIllI[9]).getText().equals(lIIIllIllIlII[lIIIllIllIllI[14]]) ? 1 : 0)) {
                            Widgets.get(lIIIllIllIllI[5], lIIIllIllIllI[15]).interact(lIIIllIllIlII[lIIIllIllIllI[16]]);
                        }
                    }
                    if (lIlIIIllIIllIII(Widgets.get(lIIIllIllIllI[5], lIIIllIllIllI[6]))) {
                        Widgets.get(lIIIllIllIllI[5], lIIIllIllIllI[6]).interact(lIIIllIllIlII[lIIIllIllIllI[10]]);
                    }
                    if (lIlIIIllIIllIII(Widgets.get(lIIIllIllIllI[7], lIIIllIllIllI[8]))) {
                        cy();
                    }
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[8])) {
                    if (lIlIIIllIIlIlIl(Dialog.isViewingOptions() ? 1 : 0)) {
                        Dialog.chooseOption(b(lIIIllIllIllI[1], lIIIllIllIllI[8]));
                        "".length();
                        return lIIIllIllIllI[0];
                    }
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[12])) {
                    Widgets.get(lIIIllIllIllI[17], lIIIllIllIllI[18]).interact(lIIIllIllIlII[lIIIllIllIllI[19]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[10])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[20])) {
                    aW();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[21])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[22])) {
                    Widgets.get(lIIIllIllIllI[17], lIIIllIllIllI[23]).interact(lIIIllIllIlII[lIIIllIllIllI[24]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[18])) {
                    String[] strArr = new String[lIIIllIllIllI[1]];
                    strArr[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[20]];
                    NPC nearest = NPCs.getNearest(strArr);
                    if (lIlIIIllIIllIII(nearest)) {
                        nearest.interact(lIIIllIllIlII[lIIIllIllIllI[25]]);
                    }
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[26])) {
                    Widgets.get(lIIIllIllIllI[17], lIIIllIllIllI[27]).interact(lIIIllIllIlII[lIIIllIllIllI[9]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[28])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[29])) {
                    int[] iArr = new int[lIIIllIllIllI[1]];
                    iArr[lIIIllIllIllI[0]] = lIIIllIllIllI[30];
                    TileObjects.getNearest(iArr).interact(lIIIllIllIlII[lIIIllIllIllI[11]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[31])) {
                    String[] strArr2 = new String[lIIIllIllIllI[1]];
                    strArr2[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[32]];
                    Item first = Inventory.getFirst(strArr2);
                    String[] strArr3 = new String[lIIIllIllIllI[1]];
                    strArr3[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[33]];
                    first.useOn(Inventory.getFirst(strArr3));
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[34])) {
                    String[] strArr4 = new String[lIIIllIllIllI[1]];
                    strArr4[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[35]];
                    Item first2 = Inventory.getFirst(strArr4);
                    String[] strArr5 = new String[lIIIllIllIllI[1]];
                    strArr5[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[36]];
                    first2.useOn(TileObjects.getNearest(strArr5));
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[37])) {
                    cz();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[38])) {
                    aW();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[39])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[40])) {
                    String[] strArr6 = new String[lIIIllIllIllI[1]];
                    strArr6[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[15]];
                    Item first3 = Inventory.getFirst(strArr6);
                    String[] strArr7 = new String[lIIIllIllIllI[1]];
                    strArr7[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[6]];
                    first3.useOn(Inventory.getFirst(strArr7));
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[41])) {
                    String[] strArr8 = new String[lIIIllIllIllI[1]];
                    strArr8[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[21]];
                    Item first4 = Inventory.getFirst(strArr8);
                    String[] strArr9 = new String[lIIIllIllIllI[1]];
                    strArr9[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[42]];
                    first4.useOn(TileObjects.getNearest(strArr9));
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[43])) {
                    aW();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[44])) {
                    Widgets.get(lIIIllIllIllI[41], lIIIllIllIllI[45]).interact(lIIIllIllIlII[lIIIllIllIllI[46]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[47])) {
                    aW();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[48])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[49])) {
                    Widgets.get(lIIIllIllIllI[17], lIIIllIllIllI[50]).interact(lIIIllIllIlII[lIIIllIllIllI[51]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[52])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[53])) {
                    cA();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[54])) {
                    String[] strArr10 = new String[lIIIllIllIllI[1]];
                    strArr10[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[55]];
                    if (lIlIIIllIIllIII(NPCs.getNearest(strArr10))) {
                        cE();
                        "".length();
                        if ((((13 ^ 8) ^ (151 ^ 183)) & (((5 ^ 39) ^ (56 ^ 63)) ^ (-" ".length()))) <= (-" ".length())) {
                            return " ".length() & (" ".length() ^ (-" ".length()));
                        }
                    } else {
                        Walker.walkTo(new WorldPoint(lIIIllIllIllI[56], lIIIllIllIllI[57], lIIIllIllIllI[0]));
                        "".length();
                    }
                }
                if (!lIlIIIllIIlIlII(varp, lIIIllIllIllI[58]) || lIlIIIllIIlIllI(varp, lIIIllIllIllI[59])) {
                    cD();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[60])) {
                    Item first5 = Inventory.getFirst(item -> {
                        return item.getName().contains(lIIIllIllIlII[lIIIllIllIllI[152]]);
                    });
                    String[] strArr11 = new String[lIIIllIllIllI[1]];
                    strArr11[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[61]];
                    first5.useOn(TileObjects.getNearest(strArr11));
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[62])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[63])) {
                    String[] strArr12 = new String[lIIIllIllIllI[1]];
                    strArr12[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[64]];
                    TileObjects.getNearest(strArr12).interact(lIIIllIllIlII[lIIIllIllIllI[45]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[65])) {
                    Widgets.get(lIIIllIllIllI[66], lIIIllIllIllI[24]).interact(lIIIllIllIlII[lIIIllIllIllI[67]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[68])) {
                    cz();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[69])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[70])) {
                    Widgets.get(lIIIllIllIllI[17], lIIIllIllIllI[71]).interact(lIIIllIllIlII[lIIIllIllIllI[72]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[73])) {
                    Widgets.get(lIIIllIllIllI[74], lIIIllIllIllI[1]).interact(lIIIllIllIlII[lIIIllIllIllI[22]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[75])) {
                    e(lIIIllIllIlII[lIIIllIllIllI[76]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[77])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[78])) {
                    e(lIIIllIllIlII[lIIIllIllIllI[79]]);
                    e(lIIIllIllIlII[lIIIllIllIllI[80]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[81])) {
                    Widgets.get(lIIIllIllIllI[17], lIIIllIllIllI[82]).interact(lIIIllIllIlII[lIIIllIllIllI[83]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[84])) {
                    WorldPoint worldPoint = new WorldPoint(lIIIllIllIllI[85], lIIIllIllIllI[86], lIIIllIllIllI[0]);
                    int[] iArr2 = new int[lIIIllIllIllI[1]];
                    iArr2[lIIIllIllIllI[0]] = lIIIllIllIllI[87];
                    ((TileObject) TileObjects.getAt(worldPoint, iArr2).get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[88]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[89])) {
                    NPC nearest2 = NPCs.getNearest(npc -> {
                        if (lIlIIIllIIlIlll(npc.getInteracting()) && lIlIIIllIIlIIll(npc.isDead() ? 1 : 0) && lIlIIIllIIlIlIl(npc.getName().equals(lIIIllIllIlII[lIIIllIllIllI[151]]) ? 1 : 0)) {
                            ?? r0 = lIIIllIllIllI[1];
                            "".length();
                            return (-" ".length()) > (103 ^ 99) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return lIIIllIllIllI[0];
                    });
                    if (lIlIIIllIIllIII(nearest2) && lIlIIIllIIlIlll(Players.getLocal().getInteracting())) {
                        nearest2.interact(lIIIllIllIlII[lIIIllIllIllI[90]]);
                    }
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[91])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[92])) {
                    e(lIIIllIllIlII[lIIIllIllIllI[93]]);
                    e(lIIIllIllIlII[lIIIllIllIllI[94]]);
                    NPC nearest3 = NPCs.getNearest(npc2 -> {
                        if (lIlIIIllIIlIlll(npc2.getInteracting()) && lIlIIIllIIlIIll(npc2.isDead() ? 1 : 0) && lIlIIIllIIlIlIl(npc2.getName().equals(lIIIllIllIlII[lIIIllIllIllI[150]]) ? 1 : 0)) {
                            ?? r0 = lIIIllIllIllI[1];
                            "".length();
                            return ("   ".length() & ("   ".length() ^ (-1))) != 0 ? "  ".length() & ("  ".length() ^ (-1)) : r0;
                        }
                        return lIIIllIllIllI[0];
                    });
                    if (lIlIIIllIIllIII(nearest3) && lIlIIIllIIlIlll(Players.getLocal().getInteracting())) {
                        nearest3.interact(lIIIllIllIlII[lIIIllIllIllI[95]]);
                    }
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[96])) {
                    cA();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[97])) {
                    cB();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[98])) {
                    cC();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[99])) {
                    aW();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[100])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[101])) {
                    Widgets.get(lIIIllIllIllI[17], lIIIllIllIllI[94]).interact(lIIIllIllIlII[lIIIllIllIllI[18]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[102])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[103])) {
                    aW();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[104])) {
                    int[] iArr3 = new int[lIIIllIllIllI[1]];
                    iArr3[lIIIllIllIllI[0]] = lIIIllIllIllI[105];
                    if (lIlIIIllIIlIlll(NPCs.getNearest(iArr3))) {
                        Walker.walkTo(new WorldPoint(lIIIllIllIllI[106], lIIIllIllIllI[107], lIIIllIllIllI[0]));
                        "".length();
                        "".length();
                        if (((39 ^ 110) & ((0 ^ 73) ^ (-1))) > 0) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        cE();
                    }
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[108])) {
                    Widgets.get(lIIIllIllIllI[17], lIIIllIllIllI[109]).interact(lIIIllIllIlII[lIIIllIllIllI[110]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[111])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[112])) {
                    Widgets.get(lIIIllIllIllI[17], lIIIllIllIllI[95]).interact(lIIIllIllIlII[lIIIllIllIllI[113]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[114])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[115])) {
                    aW();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[116])) {
                    int[] iArr4 = new int[lIIIllIllIllI[1]];
                    iArr4[lIIIllIllIllI[0]] = lIIIllIllIllI[117];
                    if (lIlIIIllIIlIlll(NPCs.getNearest(iArr4))) {
                        Walker.walkTo(new WorldPoint(lIIIllIllIllI[118], lIIIllIllIllI[119], lIIIllIllIllI[0]));
                        "".length();
                        "".length();
                        if ((true ^ true) & ((true ^ true) ^ true)) {
                            return (true ^ true) & ((true ^ true) ^ true);
                        }
                    } else {
                        cE();
                    }
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[120])) {
                    Widgets.get(lIIIllIllIllI[17], lIIIllIllIllI[121]).interact(lIIIllIllIlII[lIIIllIllIllI[122]]);
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[123])) {
                    cE();
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[124])) {
                    Walker.walkTo(new WorldPoint(lIIIllIllIllI[125], lIIIllIllIllI[126], lIIIllIllIllI[0]));
                    "".length();
                    Magic.cast(SpellBook.Standard.WIND_STRIKE, this.by.getHintArrowNpc());
                }
                if (lIlIIIllIIlIllI(varp, lIIIllIllIllI[127])) {
                    if (lIlIIIllIIlIlIl(this.bz.ironman() ? 1 : 0)) {
                        return lIIIllIllIllI[0];
                    }
                    System.out.println(lIIIllIllIlII[lIIIllIllIllI[128]]);
                    if (lIlIIIllIIllIII(Widgets.get(lIIIllIllIllI[129], lIIIllIllIllI[8]))) {
                        Widgets.get(lIIIllIllIllI[129], lIIIllIllIllI[18], lIIIllIllIllI[0]).interact(lIIIllIllIlII[lIIIllIllIllI[130]]);
                    }
                    if (lIlIIIllIIllIII(Widgets.get(lIIIllIllIllI[129], lIIIllIllIllI[33]))) {
                        System.out.println(Arrays.toString(Widgets.get(lIIIllIllIllI[129], lIIIllIllIllI[33], lIIIllIllIllI[0]).getActions()));
                        Widgets.get(lIIIllIllIllI[129], lIIIllIllIllI[33], lIIIllIllIllI[0]).interact(lIIIllIllIlII[lIIIllIllIllI[131]]);
                    }
                    if (lIlIIIllIIlIlIl(Dialog.hasOption(lIIIllIllIlII[lIIIllIllIllI[132]]) ? 1 : 0)) {
                        Dialog.chooseOption(lIIIllIllIllI[1]);
                        "".length();
                        return lIIIllIllIllI[0];
                    } else if (lIlIIIllIIlIlIl(Dialog.hasOption(lIIIllIllIlII[lIIIllIllIllI[133]]) ? 1 : 0)) {
                        Dialog.chooseOption(lIIIllIllIllI[12]);
                        "".length();
                        return lIIIllIllIllI[0];
                    } else {
                        if (lIlIIIllIIlIlIl(Dialog.isViewingOptions() ? 1 : 0)) {
                            if (lIlIIIllIIlIlIl(Dialog.hasOption(lIIIllIllIlII[lIIIllIllIllI[134]]) ? 1 : 0)) {
                                String[] strArr13 = new String[lIIIllIllIllI[1]];
                                strArr13[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[26]];
                                Dialog.chooseOption(strArr13);
                                "".length();
                                return lIIIllIllIllI[1];
                            } else if (lIlIIIllIIlIlIl(Dialog.hasOption(lIIIllIllIlII[lIIIllIllIllI[82]]) ? 1 : 0)) {
                                String[] strArr14 = new String[lIIIllIllIllI[1]];
                                strArr14[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[27]];
                                Dialog.chooseOption(strArr14);
                                "".length();
                                return lIIIllIllIllI[1];
                            }
                        }
                        cE();
                    }
                }
                return lIIIllIllIllI[1];
            }
        }
        return lIIIllIllIllI[0];
    }

    public void aW() {
        WorldPoint hintArrowPoint = this.by.getHintArrowPoint();
        String[] strArr = new String[lIIIllIllIllI[1]];
        strArr[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[109]];
        List at = TileObjects.getAt(hintArrowPoint, strArr);
        if (lIlIIIllIIlIIll(at.isEmpty() ? 1 : 0)) {
            ((TileObject) at.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[121]]);
        }
    }

    private static boolean lIlIIIllIIlIlll(Object obj) {
        return obj == null;
    }

    private static String lIlIIIllIIIlIlI(String lllllllllllllllIIIIlIIIIIIlIIIll, String lllllllllllllllIIIIlIIIIIIlIIIlI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIIIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIIIIIIlIIIIl = new StringBuilder();
        char[] charArray = lllllllllllllllIIIIlIIIIIIlIIIlI.toCharArray();
        int lllllllllllllllIIIIlIIIIIIIlllll = lIIIllIllIllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIIllIllIllI[0];
        while (lIlIIIllIIllIIl(i, length)) {
            lllllllllllllllIIIIlIIIIIIlIIIIl.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIIIlIIIIIIIlllll % charArray.length]));
            "".length();
            lllllllllllllllIIIIlIIIIIIIlllll++;
            i++;
            "".length();
            if ("  ".length() == ((251 ^ 173) ^ (10 ^ 88))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIIIlIIIIIIlIIIIl);
    }

    @Inject
    public B(Client client, SquireQuesterConfig squireQuesterConfig) {
        this.by = client;
        this.bz = squireQuesterConfig;
    }

    private static boolean lIlIIIllIIlIIlI(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIIIllIIllIII(Object obj) {
        return obj != null;
    }

    public void cy() {
        if (lIlIIIllIIllIII(Widgets.get(lIIIllIllIllI[7], lIIIllIllIllI[8]))) {
            e(b(lIIIllIllIllI[9], lIIIllIllIllI[11]));
            e(b(lIIIllIllIllI[35], lIIIllIllIllI[36]));
            e(b(lIIIllIllIllI[21], lIIIllIllIllI[42]));
            e(b(lIIIllIllIllI[122], lIIIllIllIllI[128]));
            e(b(lIIIllIllIllI[82], lIIIllIllIllI[27]));
        }
        sleep(lIIIllIllIllI[1]);
        Widget widget = Widgets.get(lIIIllIllIllI[7], lIIIllIllIllI[135]);
        if (lIlIIIllIIllIII(widget)) {
            widget.interact(lIIIllIllIlII[lIIIllIllIllI[50]]);
        }
    }

    private static boolean lIlIIIllIIlIIll(int i) {
        return i == 0;
    }

    private static boolean lIlIIIllIIlIlII(int i, int i2) {
        return i != i2;
    }

    private static String lIlIIIllIIIllII(String lllllllllllllllIIIIlIIIIIIIIlllI, String lllllllllllllllIIIIlIIIIIIIIllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIIllIllIllI[8], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIIIlIIIIIIIIllll) {
            lllllllllllllllIIIIlIIIIIIIIllll.printStackTrace();
            return null;
        }
    }

    public void cC() {
        WorldPoint hintArrowPoint = this.by.getHintArrowPoint();
        String[] strArr = new String[lIIIllIllIllI[1]];
        strArr[lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[144]];
        List at = TileObjects.getAt(hintArrowPoint, strArr);
        if (lIlIIIllIIlIIll(at.isEmpty() ? 1 : 0)) {
            ((TileObject) at.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[135]]);
        }
    }
}
