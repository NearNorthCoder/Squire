/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.Walker
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Widgets
 */
package q.e.u.r.i.u.t.q.-.e.e.s.r.s;

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
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.Walker;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.E;
import q.e.u.r.i.u.t.q.-.e.e.s.r.s.h;

@TaskDesc(name="Completing Tutorial Island")
public class B
extends Task {
    private static /* synthetic */ String[] lIIIllIllIlII;
    private final /* synthetic */ SquireQuesterConfig bz;
    private final /* synthetic */ Client by;
    private static /* synthetic */ int[] lIIIllIllIllI;

    public void cz() {
        String[] stringArray = new String[lIIIllIllIllI[1]];
        stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[136]];
        List list = TileObjects.getAt((WorldPoint)this.by.getHintArrowPoint(), (String[])stringArray);
        if (B.lIlIIIllIIlIIll(list.isEmpty() ? 1 : 0)) {
            ((TileObject)list.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[137]]);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cA() {
        String[] stringArray = new String[lIIIllIllIllI[1]];
        stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[28]];
        List list = TileObjects.getAt((WorldPoint)this.by.getHintArrowPoint(), (String[])stringArray);
        if (B.lIlIIIllIIlIIll(list.isEmpty() ? 1 : 0)) {
            void lllllllllllllllIIIIlIIIIIlIIIlII;
            String[] stringArray2 = new String[lIIIllIllIllI[1]];
            stringArray2[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[138]];
            if (B.lIlIIIllIIlIlIl(((TileObject)list.get(lIIIllIllIllI[0])).hasAction(stringArray2) ? 1 : 0)) {
                ((TileObject)list.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[139]]);
            }
            String[] stringArray3 = new String[lIIIllIllIllI[1]];
            stringArray3[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[140]];
            if (B.lIlIIIllIIlIlIl(((TileObject)lllllllllllllllIIIIlIIIIIlIIIlII.get(lIIIllIllIllI[0])).hasAction(stringArray3) ? 1 : 0)) {
                ((TileObject)lllllllllllllllIIIIlIIIIIlIIIlII.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[141]]);
            }
        }
    }

    public void cE() {
        NPC lllllllllllllllIIIIlIIIIIIllIlII;
        Object var1_1 = null;
        if (B.lIlIIIllIIllIII(this.by.getHintArrowNpc())) {
            lllllllllllllllIIIIlIIIIIIllIlII = this.by.getHintArrowNpc();
        }
        if (B.lIlIIIllIIllIII(lllllllllllllllIIIIlIIIIIIllIlII) && B.lIlIIIllIIlIlIl(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIIIIIIllIlII) ? 1 : 0)) {
            System.out.println(lIIIllIllIlII[lIIIllIllIllI[147]]);
            lllllllllllllllIIIIlIIIIIIllIlII.interact(lIIIllIllIlII[lIIIllIllIllI[148]]);
        }
        if (B.lIlIIIllIIlIIll(Reachable.isInteractable((Locatable)lllllllllllllllIIIIlIIIIIIllIlII) ? 1 : 0)) {
            Walker.walkTo((WorldPoint)lllllllllllllllIIIIlIIIIIIllIlII.getWorldLocation());
            "".length();
        }
    }

    /*
     * WARNING - void declaration
     */
    public void e(int n2) {
        void lllllllllllllllIIIIlIIIIIlIlIIlI;
        int n3 = B.b(lIIIllIllIllI[1], lIIIllIllIllI[19]);
        System.out.println(lIIIllIllIlII[lIIIllIllIllI[23]]);
        int lllllllllllllllIIIIlIIIIIlIlIIIl = lIIIllIllIllI[0];
        while (B.lIlIIIllIIllIIl(lllllllllllllllIIIIlIIIIIlIlIIIl, (int)lllllllllllllllIIIIlIIIIIlIlIIlI)) {
            void lllllllllllllllIIIIlIIIIIlIlIIll;
            B lllllllllllllllIIIIlIIIIIlIlIlII;
            lllllllllllllllIIIIlIIIIIlIlIlII.sleep(lIIIllIllIllI[1]);
            Widget lllllllllllllllIIIIlIIIIIlIlIIII = Widgets.get((int)lIIIllIllIllI[7], (int)lllllllllllllllIIIIlIIIIIlIlIIll);
            System.out.println((int)lllllllllllllllIIIIlIIIIIlIlIIll);
            if (B.lIlIIIllIIllIII(lllllllllllllllIIIIlIIIIIlIlIIII)) {
                lllllllllllllllIIIIlIIIIIlIlIIII.interact(lIIIllIllIlII[lIIIllIllIllI[71]]);
            }
            ++lllllllllllllllIIIIlIIIIIlIlIIIl;
            "".length();
            if (-" ".length() < " ".length()) continue;
            return;
        }
    }

    private static boolean lIlIIIllIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIIllIIIlIll(String lllllllllllllllIIIIlIIIIIIIIIIIl, String lllllllllllllllIIIIlIIIIIIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIIIIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8)), lIIIllIllIllI[19]), "DES");
            Cipher lllllllllllllllIIIIlIIIIIIIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIIIIlIIIIIIIIIIll.init(lIIIllIllIllI[8], lllllllllllllllIIIIlIIIIIIIIIlII);
            return new String(lllllllllllllllIIIIlIIIIIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIIIIIIIIIIlI) {
            lllllllllllllllIIIIlIIIIIIIIIIlI.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIllIIlIIII() {
        lIIIllIllIlII = new String[lIIIllIllIllI[153]];
        B.lIIIllIllIlII[B.lIIIllIllIllI[0]] = B.lIlIIIllIIIlIlI("HSgzWjcFOj9aOBVpLAg/ET0uCHoEISoUeh0gJQ==", "pIKzZ");
        B.lIIIllIllIlII[B.lIIIllIllIllI[1]] = B.lIlIIIllIIIlIlI("YQ==", "KGZLX");
        B.lIIIllIllIlII[B.lIIIllIllIllI[8]] = B.lIlIIIllIIIlIlI("Kwk1PRxOCSA1Cw==", "ngAXn");
        B.lIIIllIllIlII[B.lIIIllIllIllI[12]] = B.lIlIIIllIIIlIlI("Cx03Kh90UjEwA3gWLCsWNBM8eAg5HyA=", "XrEXf");
        B.lIIIllIllIlII[B.lIIIllIllIllI[13]] = B.lIlIIIllIIIlIll("a276ldysZwqKwhifsfiapQ==", "JUNfy");
        B.lIIIllIllIlII[B.lIIIllIllIllI[14]] = B.lIlIIIllIIIllII("v+hLa8x/ors=", "iRaCL");
        B.lIIIllIllIlII[B.lIIIllIllIllI[16]] = B.lIlIIIllIIIlIlI("HR0+BUMkAnEAAjwX", "QrQnc");
        B.lIIIllIllIlII[B.lIIIllIllIllI[10]] = B.lIlIIIllIIIlIll("3QSbzMuyofF2P32U1UU2kg==", "OWhrp");
        B.lIIIllIllIlII[B.lIIIllIllIllI[19]] = B.lIlIIIllIIIllII("JPGcx9k1nw3SUO01x4Ml9A==", "iIVkt");
        B.lIIIllIllIlII[B.lIIIllIllIllI[24]] = B.lIlIIIllIIIlIll("t6wucbzqL+w8/YOdErzCkQ==", "TtXoH");
        B.lIIIllIllIlII[B.lIIIllIllIllI[20]] = B.lIlIIIllIIIlIll("7Dc5uDH3Q0eI5xHplL1huQ==", "yFfWE");
        B.lIIIllIllIlII[B.lIIIllIllIllI[25]] = B.lIlIIIllIIIllII("kvvzTB+5nzE=", "gqEXT");
        B.lIIIllIllIlII[B.lIIIllIllIllI[9]] = B.lIlIIIllIIIlIlI("PScMACUd", "nLelI");
        B.lIIIllIllIlII[B.lIIIllIllIllI[11]] = B.lIlIIIllIIIlIll("Hein2Gh8mx0SR7ta9y/GFw==", "XpWzP");
        B.lIIIllIllIlII[B.lIIIllIllIllI[32]] = B.lIlIIIllIIIllII("st/5TTYQWRg=", "pdLEE");
        B.lIIIllIllIlII[B.lIIIllIllIllI[33]] = B.lIlIIIllIIIlIll("KwqRHnnnGFzZYo3CTcc4VA==", "YPfyI");
        B.lIIIllIllIlII[B.lIIIllIllIllI[35]] = B.lIlIIIllIIIllII("X6iwhLqBfzr36goXIIqitQ==", "DfeUL");
        B.lIIIllIllIlII[B.lIIIllIllIllI[36]] = B.lIlIIIllIIIlIlI("KjEjCQ==", "lXQlM");
        B.lIIIllIllIlII[B.lIIIllIllIllI[15]] = B.lIlIIIllIIIllII("zhwJChV7C6MQmksQ4FSvhg==", "wzGhq");
        B.lIIIllIllIlII[B.lIIIllIllIllI[6]] = B.lIlIIIllIIIlIll("sBglHQFRkagTkbkKq9rmqA==", "idHBe");
        B.lIIIllIllIlII[B.lIIIllIllIllI[21]] = B.lIlIIIllIIIllII("yuEdY+zucso/72C+Vr/qVQ==", "ToUGm");
        B.lIIIllIllIlII[B.lIIIllIllIllI[42]] = B.lIlIIIllIIIllII("y9Z4zlyDs8I=", "NZGVH");
        B.lIIIllIllIlII[B.lIIIllIllIllI[46]] = B.lIlIIIllIIIlIlI("DhYjAj8/WRYQPQ==", "ZyDeS");
        B.lIIIllIllIlII[B.lIIIllIllIllI[51]] = B.lIlIIIllIIIlIll("3I3H9Cov7z6+2e1f8uk+2g==", "IijZi");
        B.lIIIllIllIlII[B.lIIIllIllIllI[55]] = B.lIlIIIllIIIllII("ukgajC40/ul4gGwW41socsWAOdpXxEvu", "nHQjc");
        B.lIIIllIllIlII[B.lIIIllIllIllI[61]] = B.lIlIIIllIIIlIll("asuI0OFiUfM=", "OYowv");
        B.lIIIllIllIlII[B.lIIIllIllIllI[64]] = B.lIlIIIllIIIlIlI("CzcvExs=", "JYYzw");
        B.lIIIllIllIlII[B.lIIIllIllIllI[45]] = B.lIlIIIllIIIlIlI("FR8DMwE=", "FrjGi");
        B.lIIIllIllIlII[B.lIIIllIllIllI[67]] = B.lIlIIIllIIIllII("lCmxCH5vwRk=", "RRFaP");
        B.lIIIllIllIlII[B.lIIIllIllIllI[72]] = B.lIlIIIllIIIlIlI("EigrCWgANiwOOCgiNxM=", "EGYgH");
        B.lIIIllIllIlII[B.lIIIllIllIllI[22]] = B.lIlIIIllIIIlIll("bx+r7sTRVJUOH9vzZkVjePtx1MEd8MQN", "ZqvrB");
        B.lIIIllIllIlII[B.lIIIllIllIllI[76]] = B.lIlIIIllIIIlIlI("MTsuCDMWaSUHLhQsMw==", "sIAfI");
        B.lIIIllIllIlII[B.lIIIllIllIllI[79]] = B.lIlIIIllIIIlIll("B++nvn3JV5WNRHSzMgeYLw==", "hgkOY");
        B.lIIIllIllIlII[B.lIIIllIllIllI[80]] = B.lIlIIIllIIIlIll("yUfyhFfHae32YyaXSAKOuQ==", "XvKEC");
        B.lIIIllIllIlII[B.lIIIllIllIllI[83]] = B.lIlIIIllIIIllII("EtW78NhRjUE0MDGkMwRebg==", "AvzDS");
        B.lIIIllIllIlII[B.lIIIllIllIllI[88]] = B.lIlIIIllIIIlIlI("DBUCCA==", "Cegft");
        B.lIIIllIllIlII[B.lIIIllIllIllI[90]] = B.lIlIIIllIIIllII("jSSmIIcKsFI=", "caDOF");
        B.lIIIllIllIlII[B.lIIIllIllIllI[93]] = B.lIlIIIllIIIlIll("FKNiGd//Ljii/5i3sdo6+A==", "qGLlF");
        B.lIIIllIllIlII[B.lIIIllIllIllI[94]] = B.lIlIIIllIIIlIlI("HwcIEwUuABA=", "Logaq");
        B.lIIIllIllIlII[B.lIIIllIllIllI[95]] = B.lIlIIIllIIIlIlI("LT4HIhQH", "lJsCw");
        B.lIIIllIllIlII[B.lIIIllIllIllI[18]] = B.lIlIIIllIIIlIlI("CxYVIBckAVYCAyQUESoPLxsC", "JuvOb");
        B.lIIIllIllIlII[B.lIIIllIllIllI[110]] = B.lIlIIIllIIIllII("ETenv478x/s=", "SlbGG");
        B.lIIIllIllIlII[B.lIIIllIllIllI[113]] = B.lIlIIIllIIIllII("sqIHRIAUgkFouR1XX1Mazg==", "PKJaj");
        B.lIIIllIllIlII[B.lIIIllIllIllI[122]] = B.lIlIIIllIIIllII("FPCsjnIyo5o=", "uMcPg");
        B.lIIIllIllIlII[B.lIIIllIllIllI[128]] = B.lIlIIIllIIIlIll("QVLJnlheZ6el7mWqKHduXY40jj/a3G+A", "fXrVE");
        B.lIIIllIllIlII[B.lIIIllIllIllI[130]] = B.lIlIIIllIIIlIll("W5JB8ltK508=", "JdflO");
        B.lIIIllIllIlII[B.lIIIllIllIllI[131]] = B.lIlIIIllIIIllII("qpr8QHzg2XdiXISOUQyc5caJI5TR2pLJ", "KoIRj");
        B.lIIIllIllIlII[B.lIIIllIllIllI[132]] = B.lIlIIIllIIIllII("onjwhZhux9g=", "JOYMI");
        B.lIIIllIllIlII[B.lIIIllIllIllI[133]] = B.lIlIIIllIIIlIlI("OgVcczpTB1A9HABKAD8SGgQZPRRUHh9zFxtKBDsSAEQ=", "tjpSs");
        B.lIIIllIllIlII[B.lIIIllIllIllI[134]] = B.lIlIIIllIIIlIlI("KwowbQ==", "roCCN");
        B.lIIIllIllIlII[B.lIIIllIllIllI[26]] = B.lIlIIIllIIIllII("iN6Cnrz0VZ4=", "sfWgg");
        B.lIIIllIllIlII[B.lIIIllIllIllI[82]] = B.lIlIIIllIIIllII("AF+BLCFmPAzu8kzhQoZJZh2WdbEUHyD9Ite8j8xO0EY=", "NvXGy");
        B.lIIIllIllIlII[B.lIIIllIllIllI[27]] = B.lIlIIIllIIIlIll("SD//ZFpAscGjT4TMDK/5I4i+0jZdTPQdFB9QfGcvffo=", "IfEyH");
        B.lIIIllIllIlII[B.lIIIllIllIllI[50]] = B.lIlIIIllIIIlIlI("FhwrCQYnHg==", "UsEoo");
        B.lIIIllIllIlII[B.lIIIllIllIllI[23]] = B.lIlIIIllIIIllII("o0XuA02aGFIN5C/gq/e7bK2HjuoVc+OM", "WoALs");
        B.lIIIllIllIlII[B.lIIIllIllIllI[71]] = B.lIlIIIllIIIlIlI("PzEqDDQY", "lTFiW");
        B.lIIIllIllIlII[B.lIIIllIllIllI[109]] = B.lIlIIIllIIIlIll("mqK2C8+HueU=", "NPQXS");
        B.lIIIllIllIlII[B.lIIIllIllIllI[121]] = B.lIlIIIllIIIllII("TjVqHmSDl7s=", "DkmSr");
        B.lIIIllIllIlII[B.lIIIllIllIllI[136]] = B.lIlIIIllIIIlIll("p5qG/b6uqZs=", "Owowd");
        B.lIIIllIllIlII[B.lIIIllIllIllI[137]] = B.lIlIIIllIIIlIll("HCJpdYKsiUM=", "DOvFi");
        B.lIIIllIllIlII[B.lIIIllIllIllI[28]] = B.lIlIIIllIIIlIll("sDxQb3UNC2s=", "DmZCv");
        B.lIIIllIllIlII[B.lIIIllIllIllI[138]] = B.lIlIIIllIIIlIll("8oJ/pPMHWyjv5CKA88vG3g==", "Kvqwr");
        B.lIIIllIllIlII[B.lIIIllIllIllI[139]] = B.lIlIIIllIIIlIlI("EwgvOw19ACkhAQ==", "PdFVo");
        B.lIIIllIllIlII[B.lIIIllIllIllI[140]] = B.lIlIIIllIIIlIll("aPLrPvk9DhEc8djCeTl/bA==", "ubEOX");
        B.lIIIllIllIlII[B.lIIIllIllIllI[141]] = B.lIlIIIllIIIlIll("SUNUmevDmE3i5svumBPZCw==", "IqPFc");
        B.lIIIllIllIlII[B.lIIIllIllIllI[142]] = B.lIlIIIllIIIlIlI("JwgsDG0HBi0TJQ==", "eiBgM");
        B.lIIIllIllIlII[B.lIIIllIllIllI[143]] = B.lIlIIIllIIIlIlI("PzUx", "jFTih");
        B.lIIIllIllIlII[B.lIIIllIllIllI[144]] = B.lIlIIIllIIIllII("neWnGQAxk8SogLCafAkYeA==", "GHYvz");
        B.lIIIllIllIlII[B.lIIIllIllIllI[135]] = B.lIlIIIllIIIllII("Mp0EC4SJ/mc=", "lJCuF");
        B.lIIIllIllIlII[B.lIIIllIllIllI[145]] = B.lIlIIIllIIIllII("QpSI6FLw3sotscRW1m5k2w==", "eUeqB");
        B.lIIIllIllIlII[B.lIIIllIllIllI[29]] = B.lIlIIIllIIIlIll("11dmeAIyfS7bMytwxLAoTg==", "lPszA");
        B.lIIIllIllIlII[B.lIIIllIllIllI[146]] = B.lIlIIIllIIIllII("0DvPondeKuA=", "xDunq");
        B.lIIIllIllIlII[B.lIIIllIllIllI[147]] = B.lIlIIIllIIIllII("8232Rexl4NE=", "ciqzU");
        B.lIIIllIllIlII[B.lIIIllIllIllI[148]] = B.lIlIIIllIIIlIll("IKdV/vRJnfc=", "jaPwj");
        B.lIIIllIllIlII[B.lIIIllIllIllI[149]] = B.lIlIIIllIIIlIll("TO8Q/NOaXLA=", "ztSXP");
        B.lIIIllIllIlII[B.lIIIllIllIllI[150]] = B.lIlIIIllIIIlIll("Ux5UYSZWRaoArWhOYsJ81w==", "zNAWX");
        B.lIIIllIllIlII[B.lIIIllIllIllI[151]] = B.lIlIIIllIIIlIlI("Mh0yHiJVBjIE", "utSpV");
        B.lIIIllIllIlII[B.lIIIllIllIllI[152]] = B.lIlIIIllIIIlIlI("Kxgt", "DjHno");
    }

    private static boolean lIlIIIllIIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    public void cD() {
        String[] stringArray = new String[lIIIllIllIllI[8]];
        stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[145]];
        stringArray[B.lIIIllIllIllI[1]] = lIIIllIllIlII[lIIIllIllIllI[29]];
        List list = TileObjects.getAt((WorldPoint)this.by.getHintArrowPoint(), (String[])stringArray);
        System.out.println(((TileObject)list.get(lIIIllIllIllI[0])).getWorldLocation());
        if (B.lIlIIIllIIlIIll(list.isEmpty() ? 1 : 0)) {
            ((TileObject)list.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[146]]);
        }
    }

    public void cB() {
        String[] stringArray = new String[lIIIllIllIllI[1]];
        stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[142]];
        List list = TileObjects.getAt((WorldPoint)this.by.getHintArrowPoint(), (String[])stringArray);
        if (B.lIlIIIllIIlIIll(list.isEmpty() ? 1 : 0)) {
            ((TileObject)list.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[143]]);
        }
    }

    static {
        B.lIlIIIllIIlIIIl();
        B.lIlIIIllIIlIIII();
    }

    private static int b(int n2, int n3) {
        if (B.lIlIIIllIIlIIlI(n2, n3)) {
            throw new IllegalArgumentException(lIIIllIllIlII[lIIIllIllIllI[0]]);
        }
        Random random = new Random();
        return random.nextInt(n3 - n2 + lIIIllIllIllI[1]) + n2;
    }

    private static void lIlIIIllIIlIIIl() {
        lIIIllIllIllI = new int[154];
        B.lIIIllIllIllI[0] = (0x31 ^ 0x19) & ~(0xA ^ 0x22);
        B.lIIIllIllIllI[1] = " ".length();
        B.lIIIllIllIllI[2] = 0xFFFFFB3B & 0x5DD;
        B.lIIIllIllIllI[3] = -" ".length();
        B.lIIIllIllIllI[4] = 0xFFFFF7F9 & 0xBEE;
        B.lIIIllIllIllI[5] = -(0xFFFF8DDD & 0x7773) & (0xFFFFB77E & 0x4FFF);
        B.lIIIllIllIllI[6] = 0x96 ^ 0x85;
        B.lIIIllIllIllI[7] = -(0xFFFFFD59 & 0x6FFF) & (0xFFFFEFFF & Short.MAX_VALUE);
        B.lIIIllIllIllI[8] = "  ".length();
        B.lIIIllIllIllI[9] = 0xB4 ^ 0xB8;
        B.lIIIllIllIllI[10] = 0x7B ^ 0x7C;
        B.lIIIllIllIllI[11] = 0xA8 ^ 0xA5;
        B.lIIIllIllIllI[12] = "   ".length();
        B.lIIIllIllIllI[13] = 0xFD ^ 0xB9 ^ (4 ^ 0x44);
        B.lIIIllIllIllI[14] = 0xB ^ 0x59 ^ (0xC3 ^ 0x94);
        B.lIIIllIllIllI[15] = 0x4D ^ 0x30 ^ (0xCD ^ 0xA2);
        B.lIIIllIllIllI[16] = 0xEA ^ 0xC0 ^ (3 ^ 0x2F);
        B.lIIIllIllIllI[17] = 23 + 158 - 63 + 46;
        B.lIIIllIllIllI[18] = 5 + 72 - -3 + 85 ^ 129 + 80 - 190 + 122;
        B.lIIIllIllIllI[19] = 0x74 ^ 0x7C;
        B.lIIIllIllIllI[20] = 0x8C ^ 0x86;
        B.lIIIllIllIllI[21] = 0xBB ^ 0xAF;
        B.lIIIllIllIllI[22] = 0x17 ^ 9;
        B.lIIIllIllIllI[23] = 0xE ^ 0x63 ^ (0xEE ^ 0xB5);
        B.lIIIllIllIllI[24] = 0x21 ^ 0x28;
        B.lIIIllIllIllI[25] = 3 ^ 0x45 ^ (0x7F ^ 0x32);
        B.lIIIllIllIllI[26] = 0x78 ^ 0x48 ^ "  ".length();
        B.lIIIllIllIllI[27] = 141 + 116 - 242 + 157 ^ 108 + 122 - 91 + 13;
        B.lIIIllIllIllI[28] = 0x7A ^ 0x46;
        B.lIIIllIllIllI[29] = 0x7C ^ 0x50 ^ (0xF2 ^ 0x98);
        B.lIIIllIllIllI[30] = 0xFFFFA7C6 & 0x7E3B;
        B.lIIIllIllIllI[31] = 108 + 57 - 100 + 80 ^ 3 + 167 - 104 + 127;
        B.lIIIllIllIllI[32] = 138 + 1 - 68 + 103 ^ 144 + 121 - 257 + 152;
        B.lIIIllIllIllI[33] = 0xA1 ^ 0xAE;
        B.lIIIllIllIllI[34] = 162 + 153 - 133 + 17 ^ 156 + 47 - 56 + 10;
        B.lIIIllIllIllI[35] = 0x76 ^ 0x57 ^ (0x6F ^ 0x5E);
        B.lIIIllIllIllI[36] = 0x78 ^ 0x3F ^ (0xB ^ 0x5D);
        B.lIIIllIllIllI[37] = 0xF3 ^ 0x8B;
        B.lIIIllIllIllI[38] = 81 + 65 - 29 + 13;
        B.lIIIllIllIllI[39] = 24 + 98 - -10 + 8;
        B.lIIIllIllIllI[40] = 53 + 111 - 44 + 30;
        B.lIIIllIllIllI[41] = 20 + 113 - 99 + 126;
        B.lIIIllIllIllI[42] = 0x4B ^ 0x5E;
        B.lIIIllIllIllI[43] = (0x1F ^ 0x2B) + (151 + 104 - 209 + 121) - (75 + 128 - 123 + 97) + (47 + 6 - -56 + 19);
        B.lIIIllIllIllI[44] = (6 ^ 0xC) + (0x78 ^ 0x56) - -(0xF6 ^ 0xBD) + (0xE6 ^ 0xA3);
        B.lIIIllIllIllI[45] = 0xFE ^ 0xAD ^ (0x52 ^ 0x1A);
        B.lIIIllIllIllI[46] = 158 + 108 - 222 + 116 ^ 131 + 37 - 80 + 94;
        B.lIIIllIllIllI[47] = (0x68 ^ 0x77) + (0x53 ^ 0x1C) - -(0x79 ^ 0x40) + (0x58 ^ 0x73);
        B.lIIIllIllIllI[48] = 202 + 33 - 179 + 164;
        B.lIIIllIllIllI[49] = 40 + 154 - 93 + 129;
        B.lIIIllIllIllI[50] = 0xA9 ^ 0x9C;
        B.lIIIllIllIllI[51] = 0x56 ^ 0x41;
        B.lIIIllIllIllI[52] = 126 + 82 - 28 + 60;
        B.lIIIllIllIllI[53] = 61 + 176 - 8 + 20 + (90 + 12 - 15 + 62) - (0xFFFFBFB6 & 0x417F) + (66 + 29 - -49 + 18);
        B.lIIIllIllIllI[54] = -(0xFFFFFD9F & 0x76FC) & (0xFFFFF7FF & 0x7D9F);
        B.lIIIllIllIllI[55] = 16 + 74 - -8 + 71 ^ 134 + 43 - 51 + 51;
        B.lIIIllIllIllI[56] = -(0xFFFFFBFB & 0x7735) & (0xFFFFFFF9 & 0x7F3F);
        B.lIIIllIllIllI[57] = 0xFFFFA776 & 0x7DAF;
        B.lIIIllIllIllI[58] = 0xFFFFEDAD & 0x137E;
        B.lIIIllIllIllI[59] = 0xFFFFB9FE & 0x4737;
        B.lIIIllIllIllI[60] = 0xFFFFB5C8 & 0x4B77;
        B.lIIIllIllIllI[61] = 0x9D ^ 0x84;
        B.lIIIllIllIllI[62] = 0xFFFFB5EB & 0x4B5E;
        B.lIIIllIllIllI[63] = 0xFFFFDB55 & 0x25FE;
        B.lIIIllIllIllI[64] = 0x52 ^ 0x48;
        B.lIIIllIllIllI[65] = -(0xFFFFFFE6 & 0x60BB) & (0xFFFFF1FF & 0x6FFF);
        B.lIIIllIllIllI[66] = -(0xFFFFFFDC & 0x3E2B) & (0xFFFFBF7F & 0x7FBF);
        B.lIIIllIllIllI[67] = 133 + 40 - 43 + 6 ^ 87 + 77 - 35 + 19;
        B.lIIIllIllIllI[68] = 0xFFFFFF6B & 0x1FC;
        B.lIIIllIllIllI[69] = -(0xFFFFFF8D & 0x3EFF) & (0xFFFFFFFE & 0x3FFF);
        B.lIIIllIllIllI[70] = 0xFFFFA99F & 0x57E6;
        B.lIIIllIllIllI[71] = 0x72 ^ 0x45;
        B.lIIIllIllIllI[72] = "   ".length() ^ (0x37 ^ 0x29);
        B.lIIIllIllIllI[73] = 0xFFFFE7F9 & 0x1996;
        B.lIIIllIllIllI[74] = 0xFFFFAF87 & 0x51FB;
        B.lIIIllIllIllI[75] = -(0xFFFFC86B & 0x77D5) & (0xFFFFEDD5 & 0x53FF);
        B.lIIIllIllIllI[76] = 0x64 ^ 0x7B;
        B.lIIIllIllIllI[77] = 0xFFFF81FA & 0x7F9F;
        B.lIIIllIllIllI[78] = -(0xFFFFF552 & 0x7AEF) & (0xFFFFFFF5 & 0x71EF);
        B.lIIIllIllIllI[79] = 0x16 ^ 0x36;
        B.lIIIllIllIllI[80] = 0xAD ^ 0x8C;
        B.lIIIllIllIllI[81] = 0xFFFFD5FF & 0x2BAE;
        B.lIIIllIllIllI[82] = 0xD ^ 0x3E;
        B.lIIIllIllIllI[83] = 0x64 ^ 1 ^ (0x20 ^ 0x67);
        B.lIIIllIllIllI[84] = 0xFFFFEFB8 & 0x11FF;
        B.lIIIllIllIllI[85] = -(0xFFFFFFFD & 0x62D3) & (0xFFFFFFFF & 0x6EF7);
        B.lIIIllIllIllI[86] = 0xFFFFF5FF & 0x2F2E;
        B.lIIIllIllIllI[87] = -(0xFFFFB749 & 0x4ABF) & (0xFFFFFFFF & 0x27FF);
        B.lIIIllIllIllI[88] = " ".length() ^ (0x2E ^ 0xC);
        B.lIIIllIllIllI[89] = -(0xFFFFF8B3 & 0x774D) & (0xFFFFF9CF & 0x77F2);
        B.lIIIllIllIllI[90] = 0x7F ^ 0x5B;
        B.lIIIllIllIllI[91] = -(0xFFFF8ED3 & 0x7F2E) & (0xFFFFCFD7 & 0x3FFF);
        B.lIIIllIllIllI[92] = -(0xFFFFEEB6 & 0x794D) & (0xFFFFEFEB & 0x79F7);
        B.lIIIllIllIllI[93] = 0xA3 ^ 0xB5 ^ (0x27 ^ 0x14);
        B.lIIIllIllIllI[94] = 0xE6 ^ 0xA0 ^ (0xF9 ^ 0x99);
        B.lIIIllIllIllI[95] = 0x53 ^ 0x3E ^ (0x7B ^ 0x31);
        B.lIIIllIllIllI[96] = 0xFFFFADF4 & 0x53FF;
        B.lIIIllIllIllI[97] = 0xFFFFBFFF & 0x41FE;
        B.lIIIllIllIllI[98] = 0xFFFFBE0C & 0x43FB;
        B.lIIIllIllIllI[99] = 0xFFFF8F7D & 0x728F;
        B.lIIIllIllIllI[100] = -(0xFFFFFD8F & 0x6FF6) & (0xFFFFFFDF & 0x6FB7);
        B.lIIIllIllIllI[101] = 0xFFFFABD3 & 0x563F;
        B.lIIIllIllIllI[102] = 0xFFFFA6BD & 0x5B56;
        B.lIIIllIllIllI[103] = 0xFFFFBB1E & 0x46FD;
        B.lIIIllIllIllI[104] = -(0xFFFFFC99 & 0x33E7) & (0xFFFFFEFF & 0x33A6);
        B.lIIIllIllIllI[105] = -(0xFFFFD369 & 0x3C9F) & (0xFFFFBCFF & 0x5FFF);
        B.lIIIllIllIllI[106] = 0xFFFFDEFA & 0x2D3D;
        B.lIIIllIllIllI[107] = -(0xFFFFF359 & 0x6FFF) & (0xFFFFFF7B & 0x6FFE);
        B.lIIIllIllIllI[108] = 0xFFFFFF32 & 0x2FD;
        B.lIIIllIllIllI[109] = 0x96 ^ 0xAE;
        B.lIIIllIllIllI[110] = 3 ^ 0x2A;
        B.lIIIllIllIllI[111] = -(0xFFFFFDEF & 0x7296) & (0xFFFFF6FF & 0x7BBF);
        B.lIIIllIllIllI[112] = -(0xFFFFED5E & 0x1ABD) & (0xFFFFAA5F & 0x5FFF);
        B.lIIIllIllIllI[113] = 0x65 ^ 0x50 ^ (0x84 ^ 0x9B);
        B.lIIIllIllIllI[114] = -(0xFFFFFE77 & 0x5DAF) & (0xFFFFFEFE & 0x5F7F);
        B.lIIIllIllIllI[115] = 0xFFFFDE7A & 0x23E7;
        B.lIIIllIllIllI[116] = 0xFFFF936E & 0x6EFD;
        B.lIIIllIllIllI[117] = -(0xFFFFBD5B & 0x63B7) & (0xFFFFBFFF & 0x6DFF);
        B.lIIIllIllIllI[118] = 0xFFFF8CEC & 0x7F57;
        B.lIIIllIllIllI[119] = -(0xFFFFA6BB & 0x7B76) & (0xFFFFAEBF & 0x7F7F);
        B.lIIIllIllIllI[120] = -(0xFFFFFD97 & 0x7A69) & (0xFFFFFBF6 & 0x7E7F);
        B.lIIIllIllIllI[121] = 0x47 ^ 0x4D ^ (0x31 ^ 2);
        B.lIIIllIllIllI[122] = 67 + 98 - 70 + 45 ^ 56 + 71 - 99 + 139;
        B.lIIIllIllIllI[123] = -(0xFFFFFD7E & 0x4EBB) & (0xFFFFCFBD & 0x7EFB);
        B.lIIIllIllIllI[124] = -(0xFFFFBDE6 & 0x767F) & (0xFFFFBFEF & 0x76FF);
        B.lIIIllIllIllI[125] = -(0xFFFFF7D9 & 0x3A3F) & (0xFFFFFFFF & 0x3E5D);
        B.lIIIllIllIllI[126] = 0xFFFFAF95 & 0x5C7A;
        B.lIIIllIllIllI[127] = 0xFFFF9EBF & 0x63DE;
        B.lIIIllIllIllI[128] = 0x60 ^ 0x50 ^ (0x83 ^ 0x9F);
        B.lIIIllIllIllI[129] = 0xFFFFAB17 & 0x57FC;
        B.lIIIllIllIllI[130] = 0xE ^ 0x2F ^ (0xBE ^ 0xB2);
        B.lIIIllIllIllI[131] = 9 ^ 0x27;
        B.lIIIllIllIllI[132] = 0x2D ^ 2;
        B.lIIIllIllIllI[133] = 0xA8 ^ 0x98;
        B.lIIIllIllIllI[134] = 0x26 ^ 8 ^ (0x19 ^ 6);
        B.lIIIllIllIllI[135] = 0x4C ^ 8;
        B.lIIIllIllIllI[136] = 13 + 65 - -22 + 37 ^ 79 + 72 - 4 + 32;
        B.lIIIllIllIllI[137] = 0x3E ^ 5;
        B.lIIIllIllIllI[138] = 0x6B ^ 0x3F ^ (0x54 ^ 0x3D);
        B.lIIIllIllIllI[139] = 0x19 ^ 0x27;
        B.lIIIllIllIllI[140] = 186 + 159 - 172 + 14 ^ 106 + 103 - 147 + 70;
        B.lIIIllIllIllI[141] = 0xF6 ^ 0xB6;
        B.lIIIllIllIllI[142] = 0xEB ^ 0xAA;
        B.lIIIllIllIllI[143] = 0x45 ^ 7;
        B.lIIIllIllIllI[144] = 0xFE ^ 0xBD;
        B.lIIIllIllIllI[145] = 0x66 ^ 0x23;
        B.lIIIllIllIllI[146] = 0x3B ^ 0x7C;
        B.lIIIllIllIllI[147] = 0x1C ^ 0x49 ^ (0x5A ^ 0x47);
        B.lIIIllIllIllI[148] = 0x44 ^ 0xD;
        B.lIIIllIllIllI[149] = 44 + 26 - -54 + 110 ^ 72 + 126 - 110 + 72;
        B.lIIIllIllIllI[150] = 39 + 78 - 69 + 89 ^ 126 + 148 - 204 + 124;
        B.lIIIllIllIllI[151] = 0x4C ^ 0;
        B.lIIIllIllIllI[152] = 0x1D ^ 0x50;
        B.lIIIllIllIllI[153] = 0x71 ^ 0x3F;
    }

    private static boolean lIlIIIllIIlIlIl(int n2) {
        return n2 != 0;
    }

    public void e(String string) {
        String[] stringArray = new String[lIIIllIllIllI[1]];
        stringArray[B.lIIIllIllIllI[0]] = string;
        if (B.lIlIIIllIIlIIll(Equipment.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIIllIllIllI[1]];
            stringArray2[B.lIIIllIllIllI[0]] = string;
            if (B.lIlIIIllIIlIlIl(Inventory.contains((String[])stringArray2) ? 1 : 0)) {
                String[] stringArray3 = new String[lIIIllIllIllI[1]];
                stringArray3[B.lIIIllIllIllI[0]] = string;
                Inventory.getFirst((String[])stringArray3).interact(lIIIllIllIlII[lIIIllIllIllI[149]]);
            }
        }
    }

    public boolean run() {
        NPC lllllllllllllllIIIIlIIIIIlIllllI;
        B lllllllllllllllIIIIlIIIIIllIIIII;
        if (B.lIlIIIllIIlIIll(this.bz.quest().equals((Object)h.TUTORIAL_ISLAND) ? 1 : 0)) {
            return lIIIllIllIllI[0];
        }
        int lllllllllllllllIIIIlIIIIIlIlllll = Vars.getVarp((int)lIIIllIllIllI[2]);
        if (B.lIlIIIllIIlIIll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIIllIllIllI[0];
        }
        if (B.lIlIIIllIIlIlII(Players.getLocal().getAnimation(), lIIIllIllIllI[3])) {
            return lIIIllIllIllI[0];
        }
        if (B.lIlIIIllIIlIlIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIIIllIllIllI[0];
        }
        if (B.lIlIIIllIIlIIlI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[4])) {
            return lIIIllIllIllI[0];
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[1])) {
            if (B.lIlIIIllIIlIlll(Widgets.get((int)lIIIllIllIllI[5], (int)lIIIllIllIllI[6])) && B.lIlIIIllIIlIlll(Widgets.get((int)lIIIllIllIllI[7], (int)lIIIllIllIllI[8]))) {
                return lIIIllIllIllI[0];
            }
            if (B.lIlIIIllIIllIII(Widgets.get((int)lIIIllIllIllI[5], (int)lIIIllIllIllI[9]))) {
                if (B.lIlIIIllIIlIlIl(Widgets.get((int)lIIIllIllIllI[5], (int)lIIIllIllIllI[9]).getText().equals(lIIIllIllIlII[lIIIllIllIllI[1]]) ? 1 : 0)) {
                    Widgets.get((int)lIIIllIllIllI[5], (int)lIIIllIllIllI[10]).interact(lIIIllIllIlII[lIIIllIllIllI[8]]);
                    Keyboard.type((String)E.cM());
                }
                if (B.lIlIIIllIIlIlIl(Widgets.get((int)lIIIllIllIllI[5], (int)lIIIllIllIllI[11]).getText().contains(lIIIllIllIlII[lIIIllIllIllI[12]]) ? 1 : 0)) {
                    Widgets.get((int)lIIIllIllIllI[5], (int)lIIIllIllIllI[10]).interact(lIIIllIllIlII[lIIIllIllIllI[13]]);
                    Keyboard.type((String)E.cM());
                    lllllllllllllllIIIIlIIIIIllIIIII.sleep(lIIIllIllIllI[14]);
                }
                if (B.lIlIIIllIIlIIll(Widgets.get((int)lIIIllIllIllI[5], (int)lIIIllIllIllI[9]).getText().equals(lIIIllIllIlII[lIIIllIllIllI[14]]) ? 1 : 0)) {
                    Widgets.get((int)lIIIllIllIllI[5], (int)lIIIllIllIllI[15]).interact(lIIIllIllIlII[lIIIllIllIllI[16]]);
                }
            }
            if (B.lIlIIIllIIllIII(Widgets.get((int)lIIIllIllIllI[5], (int)lIIIllIllIllI[6]))) {
                Widgets.get((int)lIIIllIllIllI[5], (int)lIIIllIllIllI[6]).interact(lIIIllIllIlII[lIIIllIllIllI[10]]);
            }
            if (B.lIlIIIllIIllIII(Widgets.get((int)lIIIllIllIllI[7], (int)lIIIllIllIllI[8]))) {
                lllllllllllllllIIIIlIIIIIllIIIII.cy();
            }
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[8])) {
            if (B.lIlIIIllIIlIlIl(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)B.b(lIIIllIllIllI[1], lIIIllIllIllI[8]));
                "".length();
                return lIIIllIllIllI[0];
            }
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[12])) {
            Widgets.get((int)lIIIllIllIllI[17], (int)lIIIllIllIllI[18]).interact(lIIIllIllIlII[lIIIllIllIllI[19]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[10])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[20])) {
            lllllllllllllllIIIIlIIIIIllIIIII.aW();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[21])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[22])) {
            Widgets.get((int)lIIIllIllIllI[17], (int)lIIIllIllIllI[23]).interact(lIIIllIllIlII[lIIIllIllIllI[24]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[18])) {
            String[] stringArray = new String[lIIIllIllIllI[1]];
            stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[20]];
            lllllllllllllllIIIIlIIIIIlIllllI = NPCs.getNearest((String[])stringArray);
            if (B.lIlIIIllIIllIII(lllllllllllllllIIIIlIIIIIlIllllI)) {
                lllllllllllllllIIIIlIIIIIlIllllI.interact(lIIIllIllIlII[lIIIllIllIllI[25]]);
            }
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[26])) {
            Widgets.get((int)lIIIllIllIllI[17], (int)lIIIllIllIllI[27]).interact(lIIIllIllIlII[lIIIllIllIllI[9]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[28])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[29])) {
            int[] nArray = new int[lIIIllIllIllI[1]];
            nArray[B.lIIIllIllIllI[0]] = lIIIllIllIllI[30];
            TileObjects.getNearest((int[])nArray).interact(lIIIllIllIlII[lIIIllIllIllI[11]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[31])) {
            String[] stringArray = new String[lIIIllIllIllI[1]];
            stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[32]];
            String[] stringArray2 = new String[lIIIllIllIllI[1]];
            stringArray2[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[33]];
            Inventory.getFirst((String[])stringArray).useOn(Inventory.getFirst((String[])stringArray2));
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[34])) {
            String[] stringArray = new String[lIIIllIllIllI[1]];
            stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[35]];
            String[] stringArray3 = new String[lIIIllIllIllI[1]];
            stringArray3[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[36]];
            Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray3));
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[37])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cz();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[38])) {
            lllllllllllllllIIIIlIIIIIllIIIII.aW();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[39])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[40])) {
            String[] stringArray = new String[lIIIllIllIllI[1]];
            stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[15]];
            String[] stringArray4 = new String[lIIIllIllIllI[1]];
            stringArray4[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[6]];
            Inventory.getFirst((String[])stringArray).useOn(Inventory.getFirst((String[])stringArray4));
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[41])) {
            String[] stringArray = new String[lIIIllIllIllI[1]];
            stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[21]];
            String[] stringArray5 = new String[lIIIllIllIllI[1]];
            stringArray5[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[42]];
            Inventory.getFirst((String[])stringArray).useOn(TileObjects.getNearest((String[])stringArray5));
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[43])) {
            lllllllllllllllIIIIlIIIIIllIIIII.aW();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[44])) {
            Widgets.get((int)lIIIllIllIllI[41], (int)lIIIllIllIllI[45]).interact(lIIIllIllIlII[lIIIllIllIllI[46]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[47])) {
            lllllllllllllllIIIIlIIIIIllIIIII.aW();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[48])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[49])) {
            Widgets.get((int)lIIIllIllIllI[17], (int)lIIIllIllIllI[50]).interact(lIIIllIllIlII[lIIIllIllIllI[51]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[52])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[53])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cA();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[54])) {
            String[] stringArray = new String[lIIIllIllIllI[1]];
            stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[55]];
            if (B.lIlIIIllIIllIII(NPCs.getNearest((String[])stringArray))) {
                lllllllllllllllIIIIlIIIIIllIIIII.cE();
                "".length();
                if (((0xD ^ 8 ^ (0x97 ^ 0xB7)) & (5 ^ 0x27 ^ (0x38 ^ 0x3F) ^ -" ".length())) <= -" ".length()) {
                    return (" ".length() & (" ".length() ^ -" ".length())) != 0;
                }
            } else {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIllI[56], lIIIllIllIllI[57], lIIIllIllIllI[0]));
                "".length();
            }
        }
        if (!B.lIlIIIllIIlIlII(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[58]) || B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[59])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cD();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[60])) {
            String[] stringArray = new String[lIIIllIllIllI[1]];
            stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[61]];
            Inventory.getFirst(item -> item.getName().contains(lIIIllIllIlII[lIIIllIllIllI[152]])).useOn(TileObjects.getNearest((String[])stringArray));
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[62])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[63])) {
            String[] stringArray = new String[lIIIllIllIllI[1]];
            stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[64]];
            TileObjects.getNearest((String[])stringArray).interact(lIIIllIllIlII[lIIIllIllIllI[45]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[65])) {
            Widgets.get((int)lIIIllIllIllI[66], (int)lIIIllIllIllI[24]).interact(lIIIllIllIlII[lIIIllIllIllI[67]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[68])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cz();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[69])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[70])) {
            Widgets.get((int)lIIIllIllIllI[17], (int)lIIIllIllIllI[71]).interact(lIIIllIllIlII[lIIIllIllIllI[72]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[73])) {
            Widgets.get((int)lIIIllIllIllI[74], (int)lIIIllIllIllI[1]).interact(lIIIllIllIlII[lIIIllIllIllI[22]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[75])) {
            lllllllllllllllIIIIlIIIIIllIIIII.e(lIIIllIllIlII[lIIIllIllIllI[76]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[77])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[78])) {
            lllllllllllllllIIIIlIIIIIllIIIII.e(lIIIllIllIlII[lIIIllIllIllI[79]]);
            lllllllllllllllIIIIlIIIIIllIIIII.e(lIIIllIllIlII[lIIIllIllIllI[80]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[81])) {
            Widgets.get((int)lIIIllIllIllI[17], (int)lIIIllIllIllI[82]).interact(lIIIllIllIlII[lIIIllIllIllI[83]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[84])) {
            int[] nArray = new int[lIIIllIllIllI[1]];
            nArray[B.lIIIllIllIllI[0]] = lIIIllIllIllI[87];
            ((TileObject)TileObjects.getAt((WorldPoint)new WorldPoint(lIIIllIllIllI[85], lIIIllIllIllI[86], lIIIllIllIllI[0]), (int[])nArray).get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[88]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[89]) && B.lIlIIIllIIllIII(lllllllllllllllIIIIlIIIIIlIllllI = NPCs.getNearest(nPC -> {
            int n2;
            if (B.lIlIIIllIIlIlll(nPC.getInteracting()) && B.lIlIIIllIIlIIll(nPC.isDead() ? 1 : 0) && B.lIlIIIllIIlIlIl(nPC.getName().equals(lIIIllIllIlII[lIIIllIllIllI[151]]) ? 1 : 0)) {
                n2 = lIIIllIllIllI[1];
                "".length();
                if (-" ".length() > (0x67 ^ 0x63)) {
                    return ((0x42 ^ 0x58) & ~(0x6C ^ 0x76)) != 0;
                }
            } else {
                n2 = lIIIllIllIllI[0];
            }
            return n2 != 0;
        })) && B.lIlIIIllIIlIlll(Players.getLocal().getInteracting())) {
            lllllllllllllllIIIIlIIIIIlIllllI.interact(lIIIllIllIlII[lIIIllIllIllI[90]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[91])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[92])) {
            lllllllllllllllIIIIlIIIIIllIIIII.e(lIIIllIllIlII[lIIIllIllIllI[93]]);
            lllllllllllllllIIIIlIIIIIllIIIII.e(lIIIllIllIlII[lIIIllIllIllI[94]]);
            lllllllllllllllIIIIlIIIIIlIllllI = NPCs.getNearest(nPC -> {
                int n2;
                if (B.lIlIIIllIIlIlll(nPC.getInteracting()) && B.lIlIIIllIIlIIll(nPC.isDead() ? 1 : 0) && B.lIlIIIllIIlIlIl(nPC.getName().equals(lIIIllIllIlII[lIIIllIllIllI[150]]) ? 1 : 0)) {
                    n2 = lIIIllIllIllI[1];
                    "".length();
                    if (("   ".length() & ~"   ".length()) != 0) {
                        return ("  ".length() & ~"  ".length()) != 0;
                    }
                } else {
                    n2 = lIIIllIllIllI[0];
                }
                return n2 != 0;
            });
            if (B.lIlIIIllIIllIII(lllllllllllllllIIIIlIIIIIlIllllI) && B.lIlIIIllIIlIlll(Players.getLocal().getInteracting())) {
                lllllllllllllllIIIIlIIIIIlIllllI.interact(lIIIllIllIlII[lIIIllIllIllI[95]]);
            }
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[96])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cA();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[97])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cB();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[98])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cC();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[99])) {
            lllllllllllllllIIIIlIIIIIllIIIII.aW();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[100])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[101])) {
            Widgets.get((int)lIIIllIllIllI[17], (int)lIIIllIllIllI[94]).interact(lIIIllIllIlII[lIIIllIllIllI[18]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[102])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[103])) {
            lllllllllllllllIIIIlIIIIIllIIIII.aW();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[104])) {
            int[] nArray = new int[lIIIllIllIllI[1]];
            nArray[B.lIIIllIllIllI[0]] = lIIIllIllIllI[105];
            if (B.lIlIIIllIIlIlll(NPCs.getNearest((int[])nArray))) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIllI[106], lIIIllIllIllI[107], lIIIllIllIllI[0]));
                "".length();
                "".length();
                if (((0x27 ^ 0x6E) & ~(0 ^ 0x49)) > 0) {
                    return ((0xC7 ^ 0x88) & ~(0x64 ^ 0x2B)) != 0;
                }
            } else {
                lllllllllllllllIIIIlIIIIIllIIIII.cE();
            }
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[108])) {
            Widgets.get((int)lIIIllIllIllI[17], (int)lIIIllIllIllI[109]).interact(lIIIllIllIlII[lIIIllIllIllI[110]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[111])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[112])) {
            Widgets.get((int)lIIIllIllIllI[17], (int)lIIIllIllIllI[95]).interact(lIIIllIllIlII[lIIIllIllIllI[113]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[114])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[115])) {
            lllllllllllllllIIIIlIIIIIllIIIII.aW();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[116])) {
            int[] nArray = new int[lIIIllIllIllI[1]];
            nArray[B.lIIIllIllIllI[0]] = lIIIllIllIllI[117];
            if (B.lIlIIIllIIlIlll(NPCs.getNearest((int[])nArray))) {
                Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIllI[118], lIIIllIllIllI[119], lIIIllIllIllI[0]));
                "".length();
                "".length();
                if (((0x2F ^ 0x29) & ~(0x7C ^ 0x7A)) != 0) {
                    return ((0xE6 ^ 0xC2) & ~(0x5A ^ 0x7E)) != 0;
                }
            } else {
                lllllllllllllllIIIIlIIIIIllIIIII.cE();
            }
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[120])) {
            Widgets.get((int)lIIIllIllIllI[17], (int)lIIIllIllIllI[121]).interact(lIIIllIllIlII[lIIIllIllIllI[122]]);
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[123])) {
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[124])) {
            Walker.walkTo((WorldPoint)new WorldPoint(lIIIllIllIllI[125], lIIIllIllIllI[126], lIIIllIllIllI[0]));
            "".length();
            Magic.cast((Spell)SpellBook.Standard.WIND_STRIKE, (NPC)lllllllllllllllIIIIlIIIIIllIIIII.by.getHintArrowNpc());
        }
        if (B.lIlIIIllIIlIllI(lllllllllllllllIIIIlIIIIIlIlllll, lIIIllIllIllI[127])) {
            if (B.lIlIIIllIIlIlIl(lllllllllllllllIIIIlIIIIIllIIIII.bz.ironman() ? 1 : 0)) {
                return lIIIllIllIllI[0];
            }
            System.out.println(lIIIllIllIlII[lIIIllIllIllI[128]]);
            if (B.lIlIIIllIIllIII(Widgets.get((int)lIIIllIllIllI[129], (int)lIIIllIllIllI[8]))) {
                Widgets.get((int)lIIIllIllIllI[129], (int)lIIIllIllIllI[18], (int)lIIIllIllIllI[0]).interact(lIIIllIllIlII[lIIIllIllIllI[130]]);
            }
            if (B.lIlIIIllIIllIII(Widgets.get((int)lIIIllIllIllI[129], (int)lIIIllIllIllI[33]))) {
                System.out.println(Arrays.toString(Widgets.get((int)lIIIllIllIllI[129], (int)lIIIllIllIllI[33], (int)lIIIllIllIllI[0]).getActions()));
                Widgets.get((int)lIIIllIllIllI[129], (int)lIIIllIllIllI[33], (int)lIIIllIllIllI[0]).interact(lIIIllIllIlII[lIIIllIllIllI[131]]);
            }
            if (B.lIlIIIllIIlIlIl(Dialog.hasOption((String)lIIIllIllIlII[lIIIllIllIllI[132]]) ? 1 : 0)) {
                Dialog.chooseOption((int)lIIIllIllIllI[1]);
                "".length();
                return lIIIllIllIllI[0];
            }
            if (B.lIlIIIllIIlIlIl(Dialog.hasOption((String)lIIIllIllIlII[lIIIllIllIllI[133]]) ? 1 : 0)) {
                Dialog.chooseOption((int)lIIIllIllIllI[12]);
                "".length();
                return lIIIllIllIllI[0];
            }
            if (B.lIlIIIllIIlIlIl(Dialog.isViewingOptions() ? 1 : 0)) {
                if (B.lIlIIIllIIlIlIl(Dialog.hasOption((String)lIIIllIllIlII[lIIIllIllIllI[134]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIllIllI[1]];
                    stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[26]];
                    Dialog.chooseOption((String[])stringArray);
                    "".length();
                    return lIIIllIllIllI[1];
                }
                if (B.lIlIIIllIIlIlIl(Dialog.hasOption((String)lIIIllIllIlII[lIIIllIllIllI[82]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIIllIllIllI[1]];
                    stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[27]];
                    Dialog.chooseOption((String[])stringArray);
                    "".length();
                    return lIIIllIllIllI[1];
                }
            }
            lllllllllllllllIIIIlIIIIIllIIIII.cE();
        }
        return lIIIllIllIllI[1];
    }

    public void aW() {
        String[] stringArray = new String[lIIIllIllIllI[1]];
        stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[109]];
        List list = TileObjects.getAt((WorldPoint)this.by.getHintArrowPoint(), (String[])stringArray);
        if (B.lIlIIIllIIlIIll(list.isEmpty() ? 1 : 0)) {
            ((TileObject)list.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[121]]);
        }
    }

    private static boolean lIlIIIllIIlIlll(Object object) {
        return object == null;
    }

    private static String lIlIIIllIIIlIlI(String lllllllllllllllIIIIlIIIIIIlIIIll, String lllllllllllllllIIIIlIIIIIIlIIIlI) {
        lllllllllllllllIIIIlIIIIIIlIIIll = new String(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIIIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIIIlIIIIIIlIIIIl = new StringBuilder();
        char[] lllllllllllllllIIIIlIIIIIIlIIIII = lllllllllllllllIIIIlIIIIIIlIIIlI.toCharArray();
        int lllllllllllllllIIIIlIIIIIIIlllll = lIIIllIllIllI[0];
        char[] lllllllllllllllIIIIlIIIIIIIllIIl = lllllllllllllllIIIIlIIIIIIlIIIll.toCharArray();
        int lllllllllllllllIIIIlIIIIIIIllIII = lllllllllllllllIIIIlIIIIIIIllIIl.length;
        int lllllllllllllllIIIIlIIIIIIIlIlll = lIIIllIllIllI[0];
        while (B.lIlIIIllIIllIIl(lllllllllllllllIIIIlIIIIIIIlIlll, lllllllllllllllIIIIlIIIIIIIllIII)) {
            char lllllllllllllllIIIIlIIIIIIlIIlII = lllllllllllllllIIIIlIIIIIIIllIIl[lllllllllllllllIIIIlIIIIIIIlIlll];
            lllllllllllllllIIIIlIIIIIIlIIIIl.append((char)(lllllllllllllllIIIIlIIIIIIlIIlII ^ lllllllllllllllIIIIlIIIIIIlIIIII[lllllllllllllllIIIIlIIIIIIIlllll % lllllllllllllllIIIIlIIIIIIlIIIII.length]));
            "".length();
            ++lllllllllllllllIIIIlIIIIIIIlllll;
            ++lllllllllllllllIIIIlIIIIIIIlIlll;
            "".length();
            if ("  ".length() != (0xFB ^ 0xAD ^ (0xA ^ 0x58))) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIIIlIIIIIIlIIIIl);
    }

    @Inject
    public B(Client client, SquireQuesterConfig squireQuesterConfig) {
        this.by = client;
        this.bz = squireQuesterConfig;
    }

    private static boolean lIlIIIllIIlIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIIIllIIllIII(Object object) {
        return object != null;
    }

    public void cy() {
        B lllllllllllllllIIIIlIIIIIlIllIll;
        if (B.lIlIIIllIIllIII(Widgets.get((int)lIIIllIllIllI[7], (int)lIIIllIllIllI[8]))) {
            this.e(B.b(lIIIllIllIllI[9], lIIIllIllIllI[11]));
            this.e(B.b(lIIIllIllIllI[35], lIIIllIllIllI[36]));
            this.e(B.b(lIIIllIllIllI[21], lIIIllIllIllI[42]));
            this.e(B.b(lIIIllIllIllI[122], lIIIllIllIllI[128]));
            this.e(B.b(lIIIllIllIllI[82], lIIIllIllIllI[27]));
        }
        lllllllllllllllIIIIlIIIIIlIllIll.sleep(lIIIllIllIllI[1]);
        Widget lllllllllllllllIIIIlIIIIIlIllIlI = Widgets.get((int)lIIIllIllIllI[7], (int)lIIIllIllIllI[135]);
        if (B.lIlIIIllIIllIII(lllllllllllllllIIIIlIIIIIlIllIlI)) {
            lllllllllllllllIIIIlIIIIIlIllIlI.interact(lIIIllIllIlII[lIIIllIllIllI[50]]);
        }
    }

    private static boolean lIlIIIllIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIIIllIIlIlII(int n2, int n3) {
        return n2 != n3;
    }

    private static String lIlIIIllIIIllII(String lllllllllllllllIIIIlIIIIIIIIllII, String lllllllllllllllIIIIlIIIIIIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIIIIlIIIIIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIIIlIIIIIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIIIlIIIIIIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIIIlIIIIIIIlIIII.init(lIIIllIllIllI[8], lllllllllllllllIIIIlIIIIIIIlIIIl);
            return new String(lllllllllllllllIIIIlIIIIIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIIIlIIIIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIIIlIIIIIIIIllll) {
            lllllllllllllllIIIIlIIIIIIIIllll.printStackTrace();
            return null;
        }
    }

    public void cC() {
        String[] stringArray = new String[lIIIllIllIllI[1]];
        stringArray[B.lIIIllIllIllI[0]] = lIIIllIllIlII[lIIIllIllIllI[144]];
        List list = TileObjects.getAt((WorldPoint)this.by.getHintArrowPoint(), (String[])stringArray);
        if (B.lIlIIIllIIlIIll(list.isEmpty() ? 1 : 0)) {
            ((TileObject)list.get(lIIIllIllIllI[0])).interact(lIIIllIllIlII[lIIIllIllIllI[135]]);
        }
    }
}

