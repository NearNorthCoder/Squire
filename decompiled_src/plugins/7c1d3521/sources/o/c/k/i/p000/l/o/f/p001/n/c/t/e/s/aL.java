package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.account.LocalPlayer;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.GrandExchange;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.aL  reason: invalid package */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/aL.class */
public class aL implements InterfaceC0003ac {
    public static /* synthetic */ String nN;
    static /* synthetic */ WorldPoint nQ;
    public static /* synthetic */ WorldPoint nI;
    static /* synthetic */ WorldPoint nR;
    private static /* synthetic */ int[] llIllllIIl;
    public static /* synthetic */ List<C0017d> bv;
    public static /* synthetic */ WorldArea nM;
    public static /* synthetic */ int mT;
    public static /* synthetic */ WorldArea nH;
    public static /* synthetic */ int mV;
    public static /* synthetic */ boolean bt;
    public static /* synthetic */ int nK;
    public static /* synthetic */ int mU;
    static /* synthetic */ WorldArea nO;
    public static /* synthetic */ WorldArea nL;
    static /* synthetic */ int cG;
    public static /* synthetic */ int nJ;
    static /* synthetic */ WorldPoint nP;
    private static /* synthetic */ String[] llIlllIlII;

    private static void lIlllIlIlIlll() {
        llIlllIlII = new String[llIllllIIl[291]];
        llIlllIlII[llIllllIIl[0]] = lIlllIIlllllI("ABQLJj8lQRs7NC8S", "BarOQ");
        llIlllIlII[llIllllIIl[1]] = lIlllIIllllll("WvirG8bImDIa35JMQ5SUgc+E+B0B3Xa7mFIIi2xdz0i2cLEESbkBVP3MmQzNBXjMUiOWySGPbPs=", "CHImJ");
        llIlllIlII[llIllllIIl[2]] = lIlllIIlllllI("HgMwDw==", "LfQkO");
        llIlllIlII[llIllllIIl[10]] = lIlllIIllllll("beAlp1x0ZFU=", "dMGWc");
        llIlllIlII[llIllllIIl[11]] = lIlllIlIIIIII("rJUKsPRVY2GVRgK7/k/ub0rnYcSLG9ja", "LBtLG");
        llIlllIlII[llIllllIIl[14]] = lIlllIIllllll("ByqlVhQigaPo7ylf65+Fmw==", "uPExl");
        llIlllIlII[llIllllIIl[15]] = lIlllIIlllllI("HwMhLy8h", "SbEKJ");
        llIlllIlII[llIllllIIl[3]] = lIlllIIlllllI("LgMfDBhAGgY=", "movaz");
        llIlllIlII[llIllllIIl[16]] = lIlllIIlllllI("AzY+ICczcxo8NCEp", "USRIF");
        llIlllIlII[llIllllIIl[17]] = lIlllIIlllllI("FBUTbjY1VAc7MD0cRSwjNB8=", "ZteNB");
        llIlllIlII[llIllllIIl[18]] = lIlllIIllllll("ySqDRbpwFa5rfU56oacC6ciusJk8xORr", "BGpQN");
        llIlllIlII[llIllllIIl[20]] = lIlllIlIIIIII("Q4+Q2M9dB8Y=", "lrlYq");
        llIlllIlII[llIllllIIl[24]] = lIlllIIlllllI("HB8MAA==", "JvmlY");
        llIlllIlII[llIllllIIl[25]] = lIlllIIllllll("EbphljfBj8c=", "RLTlp");
        llIlllIlII[llIllllIIl[26]] = lIlllIIllllll("s3BD/iDDwoY=", "vBKba");
        llIlllIlII[llIllllIIl[28]] = lIlllIIlllllI("KhMrIiY=", "naBLM");
        llIlllIlII[llIllllIIl[30]] = lIlllIIllllll("OUZewj8RxV0=", "mFUvX");
        llIlllIlII[llIllllIIl[31]] = lIlllIlIIIIII("rjOVPfkdyMu8oi6SqTIOzQ==", "bgclF");
        llIlllIlII[llIllllIIl[32]] = lIlllIIllllll("x4HtkIZLy6llqy2ZCmXCp+z1kXMlHG4o", "hEfab");
        llIlllIlII[llIllllIIl[33]] = lIlllIIlllllI("FhwjNTQgWSA7LSEX", "DyTTF");
        llIlllIlII[llIllllIIl[36]] = lIlllIlIIIIII("91PDJx5v0lB5R0nllw0FnQ==", "VlZEN");
        llIlllIlII[llIllllIIl[38]] = lIlllIlIIIIII("MovcwQsJxL8=", "gIdGr");
        llIlllIlII[llIllllIIl[39]] = lIlllIIlllllI("OyoCbQ==", "bOqCJ");
        llIlllIlII[llIllllIIl[40]] = lIlllIIllllll("Vm7/J8J+hf/tUTbWbcSKkw==", "LNpKW");
        llIlllIlII[llIllllIIl[41]] = lIlllIIllllll("tF/YZGrTnKZ2Z14KCnyM3Q==", "QMyiG");
        llIlllIlII[llIllllIIl[29]] = lIlllIlIIIIII("/DAm+HBT+wraV197A/2azA==", "VcPBs");
        llIlllIlII[llIllllIIl[42]] = lIlllIlIIIIII("Gpdmj2YL9RAaAe7fMEVYqg==", "boKuc");
        llIlllIlII[llIllllIIl[44]] = lIlllIIllllll("rOpALWQJQKI=", "FIgvR");
        llIlllIlII[llIllllIIl[45]] = lIlllIIllllll("7HrbcK3miYU=", "wEdQp");
        llIlllIlII[llIllllIIl[46]] = lIlllIIllllll("CNCqFPgT7sc=", "EVXrH");
        llIlllIlII[llIllllIIl[4]] = lIlllIlIIIIII("lDAEGqNrHQACO6SlKZZjQNCe/8R82vAa", "YFvUG");
        llIlllIlII[llIllllIIl[47]] = lIlllIlIIIIII("LSLW85WqQZAXiQ1cPMrFTAcGwJ2OZNyL", "IpANx");
        llIlllIlII[llIllllIIl[48]] = lIlllIIllllll("KrKWEzeUiAHgUR7ifvCLSQ==", "mcMZW");
        llIlllIlII[llIllllIIl[49]] = lIlllIIlllllI("EhEIMiI/UAQ3IDEZCDE=", "ZpfVN");
        llIlllIlII[llIllllIIl[50]] = lIlllIIllllll("0DiW2CfYUBU=", "VPSbK");
        llIlllIlII[llIllllIIl[52]] = lIlllIlIIIIII("pQVDKg+j3xA=", "wkzHJ");
        llIlllIlII[llIllllIIl[53]] = lIlllIIlllllI("KyAJKDsROg96OwoxAw==", "xThZO");
        llIlllIlII[llIllllIIl[56]] = lIlllIIllllll("vWjWAMwpbbjCNvyh1of3RxEzVnQRbisd", "GOHyw");
        llIlllIlII[llIllllIIl[57]] = lIlllIlIIIIII("xP1A4sSnCTj3yghAk7Rn3A==", "qSxbx");
        llIlllIlII[llIllllIIl[58]] = lIlllIIllllll("7PnfaYj4+KEDy/++L5l0NQ==", "DbNjw");
        llIlllIlII[llIllllIIl[59]] = lIlllIIllllll("09u856Zer7YEt/jS8n9CDA==", "AuEvz");
        llIlllIlII[llIllllIIl[60]] = lIlllIlIIIIII("wZ/VQzvvebKz7THNB2+1PA==", "RNAnv");
        llIlllIlII[llIllllIIl[61]] = lIlllIlIIIIII("N+vEskjea8yrrmCh3MMRnw==", "NLMgN");
        llIlllIlII[llIllllIIl[62]] = lIlllIIlllllI("DyAS", "MOuKa");
        llIlllIlII[llIllllIIl[63]] = lIlllIIlllllI("BBkDAQ4vCEIGCCwNAxFHJBkHCxM=", "Aobeg");
        llIlllIlII[llIllllIIl[64]] = lIlllIlIIIIII("Qdb0H2zw6Y1v/B46K0SpbQ==", "gTmfC");
        llIlllIlII[llIllllIIl[67]] = lIlllIlIIIIII("kMdbW9oEB5s=", "WYiua");
        llIlllIlII[llIllllIIl[69]] = lIlllIIlllllI("ITU3ASAKJHYCIQUwIkUsEiY4EQ==", "dCVeI");
        llIlllIlII[llIllllIIl[70]] = lIlllIIlllllI("EzIZEwx7IQ4SByI=", "VDxwi");
        llIlllIlII[llIllllIIl[71]] = lIlllIlIIIIII("evzVDSn73DU+K8OeC3FYVQ==", "bkcjM");
        llIlllIlII[llIllllIIl[27]] = lIlllIIllllll("FrYQVhd2VS+xs0OiLBQEAX+X2u1efV7C", "lIrtx");
        llIlllIlII[llIllllIIl[72]] = lIlllIIlllllI("ICYNAmcQMQkD", "dClfG");
        llIlllIlII[llIllllIIl[73]] = lIlllIIllllll("ufF4mblnXS8=", "xJjsG");
        llIlllIlII[llIllllIIl[74]] = lIlllIlIIIIII("Cu1nkFKiU0c=", "zpqZv");
        llIlllIlII[llIllllIIl[75]] = lIlllIIllllll("6hgepXZS1R9CrsllLKzGrxBMmlSi4vg0", "JGfJc");
        llIlllIlII[llIllllIIl[76]] = lIlllIIllllll("xN3MvqZ8pG8=", "QIOfx");
        llIlllIlII[llIllllIIl[77]] = lIlllIIlllllI("OyoXAQ==", "wEpry");
        llIlllIlII[llIllllIIl[78]] = lIlllIIllllll("bOmWMqIWJc8=", "SzSRd");
        llIlllIlII[llIllllIIl[79]] = lIlllIlIIIIII("F9r7zaxAk1MzAzwRF7xdEw==", "DDAlJ");
        llIlllIlII[llIllllIIl[81]] = lIlllIIlllllI("AScpAEMxMC0B", "EBHdc");
        llIlllIlII[llIllllIIl[68]] = lIlllIIlllllI("CyEjE2ksJjsN", "HILcI");
        llIlllIlII[llIllllIIl[82]] = lIlllIIlllllI("Ojg2NA==", "vWQGJ");
        llIlllIlII[llIllllIIl[83]] = lIlllIIlllllI("EiIUGwg=", "BNuuc");
        llIlllIlII[llIllllIIl[84]] = lIlllIIllllll("Gle9Da7e0b4=", "PPPCO");
        llIlllIlII[llIllllIIl[85]] = lIlllIlIIIIII("N8lfDMGeqlU=", "BfXVS");
        llIlllIlII[llIllllIIl[86]] = lIlllIlIIIIII("e7wOnSMco2e2wlWPrXm+8w==", "bMIXj");
        llIlllIlII[llIllllIIl[87]] = lIlllIIlllllI("OwMQBQ==", "wlwvj");
        llIlllIlII[llIllllIIl[88]] = lIlllIIlllllI("GxcjAQ==", "WxDrG");
        llIlllIlII[llIllllIIl[89]] = lIlllIlIIIIII("5eLTq1y1baoqwUB33XwQWA==", "MfuaA");
        llIlllIlII[llIllllIIl[90]] = lIlllIIlllllI("MAskbA==", "inWBp");
        llIlllIlII[llIllllIIl[91]] = lIlllIIlllllI("OygQBxEKJQ4KWAk7DRgdBWkAAREPLgc=", "kIbsx");
        llIlllIlII[llIllllIIl[92]] = lIlllIlIIIIII("+8DKFsWwLgFseER0raudwuyhmv9R5PWJ", "BaeID");
        llIlllIlII[llIllllIIl[93]] = lIlllIIlllllI("LgQqKg==", "bkMYk");
        llIlllIlII[llIllllIIl[94]] = lIlllIIllllll("8Poor7rIdrNDA/4Yu8UfEw==", "QSitb");
        llIlllIlII[llIllllIIl[95]] = lIlllIIlllllI("IS0lLXgROiEs", "eHDIX");
        llIlllIlII[llIllllIIl[96]] = lIlllIIlllllI("NAIZHEwTBQEC", "wjvll");
        llIlllIlII[llIllllIIl[97]] = lIlllIIlllllI("Oz8vBw==", "wPHtD");
        llIlllIlII[llIllllIIl[98]] = lIlllIIlllllI("EiAjHAU=", "BLBrn");
        llIlllIlII[llIllllIIl[99]] = lIlllIIlllllI("MRknHSA=", "auFsK");
        llIlllIlII[llIllllIIl[100]] = lIlllIlIIIIII("+kZ0vI/e/GU=", "tnkKO");
        llIlllIlII[llIllllIIl[101]] = lIlllIIlllllI("PCwFBz8NIRsKdg4/GBgzAm0VAT8IKhI=", "lMwsV");
        llIlllIlII[llIllllIIl[102]] = lIlllIIllllll("jm0YxCQ+pGA=", "JusCf");
        llIlllIlII[llIllllIIl[103]] = lIlllIlIIIIII("wz52AMmbD+0=", "IdkCT");
        llIlllIlII[llIllllIIl[104]] = lIlllIIllllll("eqrgaQJXuRdWLjeJXSR2qfVvKmakUtfc", "xYsiT");
        llIlllIlII[llIllllIIl[105]] = lIlllIlIIIIII("kHADJijHCyIA7Hp1CGyGnYEfmZKqvf20", "jxRlG");
        llIlllIlII[llIllllIIl[106]] = lIlllIlIIIIII("gWEfqfbgOR0=", "UiAIX");
        llIlllIlII[llIllllIIl[107]] = lIlllIlIIIIII("VS9Q+TiVrB4=", "VGICN");
        llIlllIlII[llIllllIIl[108]] = lIlllIlIIIIII("QDI4840VdUKgX6ooHsy2oXom/Q0uAY27", "IvJZK");
        llIlllIlII[llIllllIIl[109]] = lIlllIIllllll("RKkW+8ycGdYSDI8PSxvCnDkZ+fPcq4lR", "iMKxh");
        llIlllIlII[llIllllIIl[110]] = lIlllIIllllll("TNcItplNrI4=", "ZKkLi");
        llIlllIlII[llIllllIIl[111]] = lIlllIlIIIIII("8n25vKQOZ1+vC2WTPZFE5Q==", "Cupox");
        llIlllIlII[llIllllIIl[112]] = lIlllIIlllllI("IiYwMUgSMTQw", "fCQUh");
        llIlllIlII[llIllllIIl[113]] = lIlllIIlllllI("JyEsOWQAJjQn", "dICID");
        llIlllIlII[llIllllIIl[114]] = lIlllIlIIIIII("smHjXu7KWg8=", "BZbKM");
        llIlllIlII[llIllllIIl[115]] = lIlllIIllllll("wZRdCiWIOWM=", "UujMo");
        llIlllIlII[llIllllIIl[116]] = lIlllIlIIIIII("wdzRXqproJk=", "RHBWt");
        llIlllIlII[llIllllIIl[117]] = lIlllIIlllllI("NgYDJQc=", "fjbKl");
        llIlllIlII[llIllllIIl[118]] = lIlllIIlllllI("EQYZKgI2BgltCDAFGygEYggCJA4lDw==", "BjpMj");
        llIlllIlII[llIllllIIl[119]] = lIlllIlIIIIII("1qybcx1AGWA=", "TRxjy");
        llIlllIlII[llIllllIIl[120]] = lIlllIIllllll("WfX4B93WCos=", "JPXNq");
        llIlllIlII[llIllllIIl[13]] = lIlllIIllllll("t8bnX5hs8v4JL9cPvmoFNfRwAgaEj3/7", "aYAkv");
        llIlllIlII[llIllllIIl[121]] = lIlllIIlllllI("OjgmKCEdODZvKxs7JConSTY9Ji0OMQ==", "iTOOI");
        llIlllIlII[llIllllIIl[122]] = lIlllIIllllll("oE3VDIN0am0=", "fDoiF");
        llIlllIlII[llIllllIIl[123]] = lIlllIIllllll("xfrX135IvnE=", "Nguah");
        llIlllIlII[llIllllIIl[124]] = lIlllIlIIIIII("ql240kxmrjT8jRx2LMUTnA==", "ncgLr");
        llIlllIlII[llIllllIIl[125]] = lIlllIIlllllI("Fi4yBQ==", "FOFmh");
        llIlllIlII[llIllllIIl[126]] = lIlllIIllllll("KkyHpqANkMqK7YVjzH0Mrg==", "JGyDd");
        llIlllIlII[llIllllIIl[127]] = lIlllIIllllll("ZNzh/aTftOEV7Oceji6eIQ==", "AEOAf");
        llIlllIlII[llIllllIIl[128]] = lIlllIIlllllI("IjQ8IBcIKDRzBhMvNzQB", "aFSSd");
        llIlllIlII[llIllllIIl[129]] = lIlllIlIIIIII("KcQsBrHMn3Y=", "BVMVv");
        llIlllIlII[llIllllIIl[130]] = lIlllIIllllll("YyAiilY6y+SwLGYrKCyVkQ==", "vUcxO");
        llIlllIlII[llIllllIIl[131]] = lIlllIIlllllI("MQMuMQ==", "abZYf");
        llIlllIlII[llIllllIIl[132]] = lIlllIlIIIIII("LQ6WCwN0EOZDspfP2FyYfQ==", "dphRl");
        llIlllIlII[llIllllIIl[133]] = lIlllIIlllllI("CxIdFAR4DBsIFQ==", "Xzrfp");
        llIlllIlII[llIllllIIl[134]] = lIlllIlIIIIII("3F5poLBuCNswPtq4ELJPLg==", "JLiCT");
        llIlllIlII[llIllllIIl[135]] = lIlllIIlllllI("EjkbPhNhOgg2Bg==", "ANzSc");
        llIlllIlII[llIllllIIl[136]] = lIlllIIllllll("FXtcXpiNE/PKdHZilYs6zA==", "AcwES");
        llIlllIlII[llIllllIIl[137]] = lIlllIIllllll("ba8xFa8AS/5zslJaw141cw==", "TfklL");
        llIlllIlII[llIllllIIl[138]] = lIlllIlIIIIII("lMxby7aHpEW5gENh/wqSIA==", "PnKeF");
        llIlllIlII[llIllllIIl[139]] = lIlllIlIIIIII("Wg9yVuN/XoL8jzvlnaXDkg==", "OcBvZ");
        llIlllIlII[llIllllIIl[140]] = lIlllIIlllllI("PCcnHzBPOSEDIQ==", "oOHmD");
        llIlllIlII[llIllllIIl[141]] = lIlllIIlllllI("AjUIFFc4MwgW", "NZfsw");
        llIlllIlII[llIllllIIl[142]] = lIlllIIlllllI("AiY/Nm44ID80", "NIQQN");
        llIlllIlII[llIllllIIl[144]] = lIlllIlIIIIII("1aJD7TZADslZQzLrg16MhBMLoQhSRpOz", "KwMnL");
        llIlllIlII[llIllllIIl[145]] = lIlllIIlllllI("OTEDLANHIBgtCQ==", "jFjBd");
        llIlllIlII[llIllllIIl[146]] = lIlllIIlllllI("AR8bOB0sBRwiE2IEBykf", "BpuLt");
        llIlllIlII[llIllllIIl[147]] = lIlllIIllllll("Z5gq2+27odf2AEphDxtHbA==", "iekyK");
        llIlllIlII[llIllllIIl[148]] = lIlllIIlllllI("Mg4v", "paHtZ");
        llIlllIlII[llIllllIIl[149]] = lIlllIIlllllI("MSE/NAsMKXMgDQU=", "bNSBb");
        llIlllIlII[llIllllIIl[150]] = lIlllIIlllllI("JzsWKidUIBF4MRsoVys2FzseNz0=", "tOwXS");
        llIlllIlII[llIllllIIl[151]] = lIlllIlIIIIII("bQMDscbUG5c=", "tHHoE");
        llIlllIlII[llIllllIIl[152]] = lIlllIIlllllI("CT8MQxAzNh0Q", "ZZxcd");
        llIlllIlII[llIllllIIl[153]] = lIlllIIllllll("VRHmfb0n5MIz0SR1Ff+Wag==", "GTnbn");
        llIlllIlII[llIllllIIl[154]] = lIlllIlIIIIII("RDB3eIBu1lQ=", "vZoVQ");
        llIlllIlII[llIllllIIl[155]] = lIlllIIllllll("BtwvsQI9nLbUVKCC1kipIA==", "AUZRF");
        llIlllIlII[llIllllIIl[156]] = lIlllIIlllllI("FxIAOGQhHAE+IH0=", "GstPD");
        llIlllIlII[llIllllIIl[157]] = lIlllIIlllllI("JhE/E1kFH3MLDRACJ1gNGBw2", "qpSxy");
        llIlllIlII[llIllllIIl[160]] = lIlllIlIIIIII("3dybqnvgy1yvk25G042lzw==", "zbrOK");
        llIlllIlII[llIllllIIl[161]] = lIlllIIlllllI("NCkL", "vFlKG");
        llIlllIlII[llIllllIIl[162]] = lIlllIlIIIIII("DSKjLp0anmT9THsiBSzLZQ==", "WcHdq");
        llIlllIlII[llIllllIIl[163]] = lIlllIIlllllI("NjE5BRgBMHQeBwgx", "dTTjn");
        llIlllIlII[llIllllIIl[164]] = lIlllIIllllll("NXm0QpJCY7Vy6Sh0bs/ypCGS3nN/9fzY", "QxIOV");
        llIlllIlII[llIllllIIl[165]] = lIlllIlIIIIII("TWxlRRXkVVfxj8yLH5nwHA==", "pzuHm");
        llIlllIlII[llIllllIIl[166]] = lIlllIIllllll("tnoZDnmeh5HVFmQdTdBRAA==", "oQIzX");
        llIlllIlII[llIllllIIl[167]] = lIlllIIlllllI("JCA2Jg==", "tABNQ");
        llIlllIlII[llIllllIIl[168]] = lIlllIIlllllI("IDsZMAwNIRJpERExHA==", "cTwDe");
        llIlllIlII[llIllllIIl[169]] = lIlllIIllllll("gMA3JQb4aHjLVPowyqrvvg==", "hISap");
        llIlllIlII[llIllllIIl[170]] = lIlllIIllllll("3gBkAl4osv227MjW8NkfdA==", "pAGOS");
        llIlllIlII[llIllllIIl[171]] = lIlllIlIIIIII("oRCTzvVGwyZ3F8IflXGRFvN7rNVyM7Y+", "aEGpC");
        llIlllIlII[llIllllIIl[172]] = lIlllIlIIIIII("xOdnz07OGgbsMR7RwnGmiQ==", "GwdFB");
        llIlllIlII[llIllllIIl[173]] = lIlllIlIIIIII("heS5EauE0Y8=", "HyZcz");
        llIlllIlII[llIllllIIl[174]] = lIlllIIlllllI("JRI5HxRbCTY=", "vfXqp");
        llIlllIlII[llIllllIIl[175]] = lIlllIIllllll("oD0L/6CEzmNulWbJydZVhw==", "NuKFE");
        llIlllIlII[llIllllIIl[176]] = lIlllIIlllllI("Giw5YTU7JCokPXQqI215NjEoIDI9LSo=", "TCMAY");
        llIlllIlII[llIllllIIl[177]] = lIlllIIllllll("XJ9Q693J/Xbz8p+Q2jCZmA==", "CtgMo");
        llIlllIlII[llIllllIIl[178]] = lIlllIlIIIIII("OSijsoo4c3UE8t5SOQ0T3w==", "bimFc");
        llIlllIlII[llIllllIIl[179]] = lIlllIlIIIIII("gWvi09j86LQ=", "pjtmX");
        llIlllIlII[llIllllIIl[180]] = lIlllIIlllllI("CiUADRonPwtUBzsvBQ==", "IJnys");
        llIlllIlII[llIllllIIl[181]] = lIlllIIllllll("bHykDIVPOO2oZ8B2qtkDxASGUtTuivPBvDpmnP0AQ8Z0JEe1lBnejA==", "zOdVM");
        llIlllIlII[llIllllIIl[182]] = lIlllIlIIIIII("NQkBLMBuxeMxFW9FjG6BPpPSoTYEG/D6", "mSGmn");
        llIlllIlII[llIllllIIl[183]] = lIlllIIlllllI("DwkiKg==", "MhLAV");
        llIlllIlII[llIllllIIl[184]] = lIlllIIlllllI("GhAHOw==", "XqiPF");
        llIlllIlII[llIllllIIl[186]] = lIlllIIllllll("DaAC3sHO+dNonFvHvmEU6GDg+AA51C1T", "NIDup");
        llIlllIlII[llIllllIIl[187]] = lIlllIlIIIIII("oXyckJZ7j1RtjHP+rfeCZQ==", "UejeX");
        llIlllIlII[llIllllIIl[188]] = lIlllIIllllll("X5l9N14zVDDuw1nWj0D/uQ==", "AWzFv");
        llIlllIlII[llIllllIIl[191]] = lIlllIIlllllI("LzEKGywIYwQNMw==", "mCeuV");
        llIlllIlII[llIllllIIl[192]] = lIlllIIlllllI("HTI5KA==", "JWXZe");
        llIlllIlII[llIllllIIl[193]] = lIlllIIlllllI("Bh82Ow==", "QzWID");
        llIlllIlII[llIllllIIl[194]] = lIlllIlIIIIII("uTB7G1IzgX0=", "wVHSR");
        llIlllIlII[llIllllIIl[195]] = lIlllIIlllllI("GTMKBQE=", "NZoie");
        llIlllIlII[llIllllIIl[196]] = lIlllIIllllll("SF8kkXAEPRc=", "cIDfd");
        llIlllIlII[llIllllIIl[197]] = lIlllIIllllll("MAY3D/jCM78=", "sQJqS");
        llIlllIlII[llIllllIIl[199]] = lIlllIIllllll("e9ySVQ4wMeVWv0ZdUZ1Y2t0r8qPND9LE", "vbXNK");
        llIlllIlII[llIllllIIl[200]] = lIlllIIlllllI("DTYgKg==", "ZSAXd");
        llIlllIlII[llIllllIIl[201]] = lIlllIlIIIIII("4n3Bu7ipDps=", "WkyFo");
        llIlllIlII[llIllllIIl[202]] = lIlllIIlllllI("MwAiFTQ=", "diGyP");
        llIlllIlII[llIllllIIl[203]] = lIlllIIlllllI("DgswNSo=", "YbUYN");
        llIlllIlII[llIllllIIl[204]] = lIlllIIlllllI("PQI/OTw=", "xsJPL");
        llIlllIlII[llIllllIIl[205]] = lIlllIIlllllI("BxgsOSY=", "BiYPV");
        llIlllIlII[llIllllIIl[206]] = lIlllIlIIIIII("/JQgMjHXWe4An2GoB9BeEQ==", "fgwEl");
        llIlllIlII[llIllllIIl[207]] = lIlllIIllllll("lVyXjUSgWCy6/mIChHyENSGxju9QEnfH", "gvNbw");
        llIlllIlII[llIllllIIl[208]] = lIlllIIllllll("ZPJiPcXpnmy6QXj+ezWnNw==", "doRhT");
        llIlllIlII[llIllllIIl[209]] = lIlllIlIIIIII("czSX9A2gkPQ=", "lfvlN");
        llIlllIlII[llIllllIIl[211]] = lIlllIIllllll("s/AY6FFxS/hle0dlp5oISuw+byX/Iclo", "bbBua");
        llIlllIlII[llIllllIIl[212]] = lIlllIIlllllI("Ijg=", "ZHKQP");
        llIlllIlII[llIllllIIl[213]] = lIlllIlIIIIII("SjyKfRt1arc=", "GlKli");
        llIlllIlII[llIllllIIl[214]] = lIlllIIllllll("rX5ONf7MvSY=", "MqImb");
        llIlllIlII[llIllllIIl[215]] = lIlllIlIIIIII("3MtqnUEGVfw=", "Kumur");
        llIlllIlII[llIllllIIl[216]] = lIlllIIllllll("RUxGlUiqUTQ=", "ftFFs");
        llIlllIlII[llIllllIIl[217]] = lIlllIlIIIIII("TcRJ7z8KPhs=", "EVENG");
        llIlllIlII[llIllllIIl[218]] = lIlllIIllllll("ZcPCTXM4bYc=", "zFRhf");
        llIlllIlII[llIllllIIl[219]] = lIlllIlIIIIII("sJG9Gdk6vDI=", "XmIJh");
        llIlllIlII[llIllllIIl[220]] = lIlllIIllllll("fnZjSPFh/Tg=", "SvRAm");
        llIlllIlII[llIllllIIl[221]] = lIlllIIllllll("HL3rlQIwvHQ=", "gyzVW");
        llIlllIlII[llIllllIIl[222]] = lIlllIIllllll("dH3WRTqsGSE=", "nTdXC");
        llIlllIlII[llIllllIIl[223]] = lIlllIlIIIIII("Z90tk2F3yBc=", "eKpIM");
        llIlllIlII[llIllllIIl[224]] = lIlllIIlllllI("DCYzJhomJDU=", "OJROw");
        llIlllIlII[llIllllIIl[226]] = lIlllIIllllll("H457KHhW0lc=", "MsKgs");
        llIlllIlII[llIllllIIl[227]] = lIlllIlIIIIII("FNMynN6elQk=", "ndCpI");
        llIlllIlII[llIllllIIl[249]] = lIlllIIlllllI("HiMjJC8vZjomJiEtJzok", "JFNTC");
        llIlllIlII[llIllllIIl[250]] = lIlllIlIIIIII("bnqEXaoXfeo=", "joSzq");
        llIlllIlII[llIllllIIl[251]] = lIlllIIlllllI("LDgMDXIMNg0SOg==", "nYbfR");
        llIlllIlII[llIllllIIl[252]] = lIlllIIllllll("azR+6t2Hdgw=", "aIWQG");
        llIlllIlII[llIllllIIl[253]] = lIlllIIlllllI("IQc+Kw==", "qfJCg");
        llIlllIlII[llIllllIIl[254]] = lIlllIlIIIIII("I6iSYRNfLf3T7hbAhdrwuA==", "WBLYR");
        llIlllIlII[llIllllIIl[256]] = lIlllIIllllll("LTtSHq1b362Mni8gIKtLTA==", "aFPXg");
        llIlllIlII[llIllllIIl[257]] = lIlllIlIIIIII("uEUVANGx7URariorcuJAxA==", "jKzqo");
        llIlllIlII[llIllllIIl[258]] = lIlllIIllllll("HxOZ4PmzKFsuQj9D/wgkGw==", "XbAGO");
        llIlllIlII[llIllllIIl[259]] = lIlllIlIIIIII("7pHYJVbvYj/kcuemfFZ4yQ==", "uJrZC");
        llIlllIlII[llIllllIIl[260]] = lIlllIIllllll("yzfk5FKIHPk=", "uhyAo");
        llIlllIlII[llIllllIIl[261]] = lIlllIIlllllI("KDgIKSNOMwIlIwk0", "nQpLG");
        llIlllIlII[llIllllIIl[262]] = lIlllIlIIIIII("3kylgdwSbaLSXQ/iktO2jg==", "UxbKf");
        llIlllIlII[llIllllIIl[263]] = lIlllIIlllllI("ABI/DjM+DTMPPQ==", "LgRlV");
        llIlllIlII[llIllllIIl[264]] = lIlllIIlllllI("CBMzPTIP", "jaZYU");
        llIlllIlII[llIllllIIl[265]] = lIlllIIlllllI("HB0wHi50DicfJS0=", "YkQzK");
        llIlllIlII[llIllllIIl[266]] = lIlllIIlllllI("EBEAEgx4AhcTByE=", "Ugavi");
        llIlllIlII[llIllllIIl[267]] = lIlllIlIIIIII("X11jERFVLnTfyTyzxZOIOg==", "comkk");
        llIlllIlII[llIllllIIl[268]] = lIlllIIlllllI("MDMNMy83", "RAdWH");
        llIlllIlII[llIllllIIl[270]] = lIlllIIlllllI("KSAGOhMEOg1jDhgqAw==", "jOhNz");
        llIlllIlII[llIllllIIl[271]] = lIlllIlIIIIII("hFrAILbwEYk=", "LxGkn");
        llIlllIlII[llIllllIIl[272]] = lIlllIIllllll("VheK9YyRwls=", "axXmo");
        llIlllIlII[llIllllIIl[273]] = lIlllIlIIIIII("JGdP23ahh/k=", "VCJGI");
        llIlllIlII[llIllllIIl[274]] = lIlllIIlllllI("IDsgJw==", "TTMBN");
        llIlllIlII[llIllllIIl[284]] = lIlllIlIIIIII("cubQ6NmygL4=", "SLelZ");
    }

    private static boolean lIlllIllIIIlI(Object obj) {
        return obj == null;
    }

    private static String lIlllIIlllllI(String llllllllllllllllllIIIIIIIIIlIlIl, String llllllllllllllllllIIIIIIIIIlIlII) {
        String llllllllllllllllllIIIIIIIIIlIlIl2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIIIIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIIIIIIIlIIll = new StringBuilder();
        char[] charArray = llllllllllllllllllIIIIIIIIIlIlII.toCharArray();
        int llllllllllllllllllIIIIIIIIIlIIIl = llIllllIIl[0];
        char[] charArray2 = llllllllllllllllllIIIIIIIIIlIlIl2.toCharArray();
        int length = charArray2.length;
        int i = llIllllIIl[0];
        while (lIlllIlIlllIl(i, length)) {
            llllllllllllllllllIIIIIIIIIlIIll.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIIIIIIIIIlIIIl % charArray.length]));
            "".length();
            llllllllllllllllllIIIIIIIIIlIIIl++;
            i++;
            "".length();
            if ("  ".length() < "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIIIIIIIIlIIll);
    }

    private static boolean lIlllIlIllllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0755, code lost:
        if (lIlllIlIlllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x09b0, code lost:
        if (lIlllIlIlllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0cf5, code lost:
        if (lIlllIlIlllIl(net.unethicalite.api.items.Inventory.getAll(r0).size(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aL.llIllllIIl[10]) != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x1ba6, code lost:
        if (lIlllIllIIlll(net.unethicalite.api.game.Game.getState(), net.runelite.api.GameState.LOGGED_IN) == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x1ba9, code lost:
        java.lang.System.out.println(o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aL.llIlllIlII[o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aL.llIllllIIl[176(0xb0, float:2.47E-43)]]);
        "".length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x1bd5, code lost:
        if (((93 ^ 1) & ((205 ^ 145) ^ (-1))) < " ".length()) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x1bd8, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x01c9, code lost:
        if (lIlllIllIIIlI(net.unethicalite.api.entities.TileObjects.getNearest((v0) -> { // java.util.function.Predicate.test(java.lang.Object):boolean
            return ad(v0);
        })) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x046a, code lost:
        if (lIlllIlIlllIl(net.unethicalite.api.items.Inventory.getAll(r0).size(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aL.llIllllIIl[10]) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0534, code lost:
        if (lIlllIllIIlII(net.unethicalite.api.items.Inventory.getAll(r0).size(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aL.llIllllIIl[10]) != false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x08d0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0c43  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0f7e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0675  */
    /* JADX WARN: Type inference failed for: r0v296 */
    /* JADX WARN: Type inference failed for: r0v297 */
    /* JADX WARN: Type inference failed for: r0v447 */
    /* JADX WARN: Type inference failed for: r0v448 */
    /* JADX WARN: Type inference failed for: r0v454, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v206 */
    /* JADX WARN: Type inference failed for: r1v331 */
    /* JADX WARN: Type inference failed for: r1v332 */
    /* JADX WARN: Type inference failed for: r2v373, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v374, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void gc() {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        TileObject nearest;
        String[] strArr8 = new String[llIllllIIl[1]];
        strArr8[llIllllIIl[0]] = llIlllIlII[llIllllIIl[52]];
        C0020g.a(strArr8);
        TileObject nearest2 = TileObjects.getNearest(tileObject -> {
            String[] strArr9 = new String[llIllllIIl[1]];
            strArr9[llIllllIIl[0]] = llIlllIlII[llIllllIIl[271]];
            return tileObject.hasAction(strArr9);
        });
        TileObject nearest3 = TileObjects.getNearest(tileObject2 -> {
            String[] strArr9 = new String[llIllllIIl[1]];
            strArr9[llIllllIIl[0]] = llIlllIlII[llIllllIIl[270]];
            return tileObject2.hasAction(strArr9);
        });
        if (lIlllIllIIIIl(Widgets.get(llIllllIIl[34], llIllllIIl[24])) && lIlllIllIIIIl(nearest2) && lIlllIllIIIIl(nearest3) && lIlllIlIlllIl(nearest2.distanceTo(nearest3), llIllllIIl[16]) && lIlllIlIlllIl(mV, llIllllIIl[14])) {
            nR = null;
            cG = llIllllIIl[0];
            AccBuilderSotf.c = llIlllIlII[llIllllIIl[53]];
            Widget widget = Widgets.get(llIllllIIl[34], llIllllIIl[24]);
            if (lIlllIllIIIIl(widget)) {
                Mouse.click(widget.getClickPoint().getX(), widget.getClickPoint().getY(), (boolean) llIllllIIl[1]);
                Time.sleepUntil(() -> {
                    if (lIlllIllIIIlI(Widgets.fromId(llIllllIIl[269]))) {
                        ?? r0 = llIllllIIl[1];
                        "".length();
                        return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIllllIIl[0];
                }, llIllllIIl[54], llIllllIIl[55]);
                "".length();
                mV += llIllllIIl[1];
            }
        }
        String[] strArr9 = new String[llIllllIIl[1]];
        strArr9[llIllllIIl[0]] = llIlllIlII[llIllllIIl[56]];
        if (lIlllIllIIIlI(NPCs.getNearest(strArr9))) {
            String[] strArr10 = new String[llIllllIIl[1]];
            strArr10[llIllllIIl[0]] = llIlllIlII[llIllllIIl[57]];
            if (lIlllIllIIIlI(NPCs.getNearest(strArr10))) {
                String[] strArr11 = new String[llIllllIIl[1]];
                strArr11[llIllllIIl[0]] = llIlllIlII[llIllllIIl[58]];
                if (lIlllIllIIIlI(NPCs.getNearest(strArr11))) {
                    String[] strArr12 = new String[llIllllIIl[1]];
                    strArr12[llIllllIIl[0]] = llIlllIlII[llIllllIIl[59]];
                    if (lIlllIllIIIlI(NPCs.getNearest(strArr12))) {
                        String[] strArr13 = new String[llIllllIIl[1]];
                        strArr13[llIllllIIl[0]] = llIlllIlII[llIllllIIl[60]];
                        if (lIlllIllIIIlI(NPCs.getNearest(strArr13))) {
                            String[] strArr14 = new String[llIllllIIl[1]];
                            strArr14[llIllllIIl[0]] = llIlllIlII[llIllllIIl[61]];
                            if (lIlllIllIIIlI(NPCs.getNearest(strArr14))) {
                                if (lIlllIllIIIlI(TileObjects.getNearest(tileObject3 -> {
                                    return tileObject3.getName().contains(llIlllIlII[llIllllIIl[268]]);
                                }))) {
                                }
                                strArr = new String[llIllllIIl[1]];
                                strArr[llIllllIIl[0]] = llIlllIlII[llIllllIIl[67]];
                                if (lIlllIllIIIIl(NPCs.getNearest(strArr)) && lIlllIlIllllI(nH.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(nI), llIllllIIl[68])) {
                                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[69]];
                                    nearest = TileObjects.getNearest(tileObject4 -> {
                                        String[] strArr15 = new String[llIllllIIl[1]];
                                        strArr15[llIllllIIl[0]] = llIlllIlII[llIllllIIl[265]];
                                        return tileObject4.hasAction(strArr15);
                                    });
                                    if (lIlllIllIIIIl(nearest)) {
                                        nearest.interact(llIlllIlII[llIllllIIl[70]]);
                                        Time.sleepUntil(() -> {
                                            if (lIlllIlIllllI(LocalPlayer.get().isMoving() ? 1 : 0)) {
                                                ?? r0 = llIllllIIl[1];
                                                "".length();
                                                return (-"  ".length()) >= 0 ? ((216 ^ 194) ^ (124 ^ 92)) & (((35 ^ 103) ^ (51 ^ 77)) ^ (-" ".length())) : r0;
                                            }
                                            return llIllllIIl[0];
                                        }, Rand.nextInt(llIllllIIl[65], llIllllIIl[66]));
                                        "".length();
                                    }
                                }
                                TileObjects.getNearest(tileObject5 -> {
                                    return tileObject5.getName().contains(llIlllIlII[llIllllIIl[264]]);
                                });
                                strArr2 = new String[llIllllIIl[1]];
                                strArr2[llIllllIIl[0]] = llIlllIlII[llIllllIIl[71]];
                                if (lIlllIllIIIIl(TileObjects.getNearest(strArr2))) {
                                    nR = null;
                                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[27]];
                                    String[] strArr15 = new String[llIllllIIl[1]];
                                    strArr15[llIllllIIl[0]] = llIlllIlII[llIllllIIl[72]];
                                    if (lIlllIllIIIlI(TileObjects.getNearest(strArr15))) {
                                        String[] strArr16 = new String[llIllllIIl[1]];
                                        strArr16[llIllllIIl[0]] = llIlllIlII[llIllllIIl[73]];
                                        TileItem nearest4 = TileItems.getNearest(strArr16);
                                        if (lIlllIllIIIIl(nearest4)) {
                                            nearest4.interact(llIlllIlII[llIllllIIl[74]]);
                                            Time.sleepTicks(llIllllIIl[1]);
                                            "".length();
                                        }
                                        if (lIlllIllIIIIl(TileItems.getNearest(tileItem -> {
                                            return tileItem.getName().contains(llIlllIlII[llIllllIIl[263]]);
                                        }))) {
                                        }
                                        String[] strArr17 = new String[llIllllIIl[1]];
                                        strArr17[llIllllIIl[0]] = llIlllIlII[llIllllIIl[75]];
                                        NPC nearest5 = NPCs.getNearest(strArr17);
                                        if (lIlllIllIIIIl(nearest5) && lIlllIllIIlll(LocalPlayer.get().getInteracting(), nearest5) && lIlllIllIIIlI(nearest4) && lIlllIlIllllI(nearest5.isDead() ? 1 : 0) && lIlllIlIlllII(Reachable.isInteractable(nearest5) ? 1 : 0)) {
                                            nearest5.interact(llIlllIlII[llIllllIIl[76]]);
                                            Time.sleepTicks(llIllllIIl[1]);
                                            "".length();
                                        }
                                    }
                                    String[] strArr18 = new String[llIllllIIl[1]];
                                    strArr18[llIllllIIl[0]] = llIlllIlII[llIllllIIl[77]];
                                    if (lIlllIlIlllII(Inventory.contains(strArr18) ? 1 : 0)) {
                                        String[] strArr19 = new String[llIllllIIl[1]];
                                        strArr19[llIllllIIl[0]] = llIlllIlII[llIllllIIl[78]];
                                    }
                                    String[] strArr20 = new String[llIllllIIl[1]];
                                    strArr20[llIllllIIl[0]] = llIlllIlII[llIllllIIl[79]];
                                    if (lIlllIllIIIIl(TileObjects.getNearest(strArr20)) && lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                        String[] strArr21 = new String[llIllllIIl[1]];
                                        strArr21[llIllllIIl[0]] = llIlllIlII[llIllllIIl[81]];
                                        TileObjects.getNearest(strArr21).interact(llIlllIlII[llIllllIIl[68]]);
                                        Time.sleepTicks(llIllllIIl[2]);
                                        "".length();
                                    }
                                    String[] strArr22 = new String[llIllllIIl[1]];
                                    strArr22[llIllllIIl[0]] = llIlllIlII[llIllllIIl[82]];
                                    if (lIlllIlIlllIl(Inventory.getAll(strArr22).size(), llIllllIIl[10])) {
                                        String[] strArr23 = new String[llIllllIIl[1]];
                                        strArr23[llIllllIIl[0]] = llIlllIlII[llIllllIIl[83]];
                                    }
                                    String[] strArr24 = new String[llIllllIIl[1]];
                                    strArr24[llIllllIIl[0]] = llIlllIlII[llIllllIIl[84]];
                                    if (lIlllIlIlllII(Inventory.contains(strArr24) ? 1 : 0) && lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                        String[] strArr25 = new String[llIllllIIl[1]];
                                        strArr25[llIllllIIl[0]] = llIlllIlII[llIllllIIl[85]];
                                        Item first = Inventory.getFirst(strArr25);
                                        String[] strArr26 = new String[llIllllIIl[1]];
                                        strArr26[llIllllIIl[0]] = llIlllIlII[llIllllIIl[86]];
                                        first.useOn(TileObjects.getNearest(strArr26));
                                        Time.sleepTicks(llIllllIIl[2]);
                                        "".length();
                                    }
                                    String[] strArr27 = new String[llIllllIIl[1]];
                                    strArr27[llIllllIIl[0]] = llIlllIlII[llIllllIIl[87]];
                                    if (lIlllIlIlllII(Inventory.contains(strArr27) ? 1 : 0) && lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                        String[] strArr28 = new String[llIllllIIl[1]];
                                        strArr28[llIllllIIl[0]] = llIlllIlII[llIllllIIl[88]];
                                        Item first2 = Inventory.getFirst(strArr28);
                                        String[] strArr29 = new String[llIllllIIl[1]];
                                        strArr29[llIllllIIl[0]] = llIlllIlII[llIllllIIl[89]];
                                        first2.useOn(TileObjects.getNearest(strArr29));
                                        Time.sleepTicks(llIllllIIl[2]);
                                        "".length();
                                    }
                                    String[] strArr30 = new String[llIllllIIl[1]];
                                    strArr30[llIllllIIl[0]] = llIlllIlII[llIllllIIl[90]];
                                    C0020g.a(strArr30);
                                }
                                strArr3 = new String[llIllllIIl[1]];
                                strArr3[llIllllIIl[0]] = llIlllIlII[llIllllIIl[91]];
                                if (lIlllIllIIIIl(TileObjects.getNearest(strArr3))) {
                                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[92]];
                                    String[] strArr31 = new String[llIllllIIl[1]];
                                    strArr31[llIllllIIl[0]] = llIlllIlII[llIllllIIl[93]];
                                    if (lIlllIlIllllI(Inventory.contains(strArr31) ? 1 : 0) && lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                        String[] strArr32 = new String[llIllllIIl[1]];
                                        strArr32[llIllllIIl[0]] = llIlllIlII[llIllllIIl[94]];
                                        if (lIlllIllIIIIl(TileObjects.getNearest(strArr32))) {
                                            String[] strArr33 = new String[llIllllIIl[1]];
                                            strArr33[llIllllIIl[0]] = llIlllIlII[llIllllIIl[95]];
                                            TileObjects.getNearest(strArr33).interact(llIlllIlII[llIllllIIl[96]]);
                                            Time.sleepTicks(llIllllIIl[2]);
                                            "".length();
                                        }
                                    }
                                    String[] strArr34 = new String[llIllllIIl[1]];
                                    strArr34[llIllllIIl[0]] = llIlllIlII[llIllllIIl[97]];
                                    if (lIlllIlIllllI(Inventory.contains(strArr34) ? 1 : 0)) {
                                        String[] strArr35 = new String[llIllllIIl[1]];
                                        strArr35[llIllllIIl[0]] = llIlllIlII[llIllllIIl[98]];
                                    }
                                    String[] strArr36 = new String[llIllllIIl[1]];
                                    strArr36[llIllllIIl[0]] = llIlllIlII[llIllllIIl[99]];
                                    if (lIlllIlIlllII(Inventory.contains(strArr36) ? 1 : 0) && lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                        String[] strArr37 = new String[llIllllIIl[1]];
                                        strArr37[llIllllIIl[0]] = llIlllIlII[llIllllIIl[100]];
                                        Item first3 = Inventory.getFirst(strArr37);
                                        String[] strArr38 = new String[llIllllIIl[1]];
                                        strArr38[llIllllIIl[0]] = llIlllIlII[llIllllIIl[101]];
                                        first3.useOn(TileObjects.getNearest(strArr38));
                                        Time.sleepTicks(llIllllIIl[2]);
                                        "".length();
                                    }
                                    String[] strArr39 = new String[llIllllIIl[1]];
                                    strArr39[llIllllIIl[0]] = llIlllIlII[llIllllIIl[102]];
                                    if (lIlllIlIlllII(Inventory.contains(strArr39) ? 1 : 0) && lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                        String[] strArr40 = new String[llIllllIIl[1]];
                                        strArr40[llIllllIIl[0]] = llIlllIlII[llIllllIIl[103]];
                                        Item first4 = Inventory.getFirst(strArr40);
                                        String[] strArr41 = new String[llIllllIIl[1]];
                                        strArr41[llIllllIIl[0]] = llIlllIlII[llIllllIIl[104]];
                                        first4.useOn(TileObjects.getNearest(strArr41));
                                        Time.sleepTicks(llIllllIIl[2]);
                                        "".length();
                                    }
                                    String[] strArr42 = new String[llIllllIIl[1]];
                                    strArr42[llIllllIIl[0]] = llIlllIlII[llIllllIIl[105]];
                                    TileObjects.getNearest(strArr42).interact(llIlllIlII[llIllllIIl[106]]);
                                    Time.sleepTicks(llIllllIIl[2]);
                                    "".length();
                                    String[] strArr43 = new String[llIllllIIl[1]];
                                    strArr43[llIllllIIl[0]] = llIlllIlII[llIllllIIl[107]];
                                    C0020g.a(strArr43);
                                }
                                strArr4 = new String[llIllllIIl[1]];
                                strArr4[llIllllIIl[0]] = llIlllIlII[llIllllIIl[108]];
                                if (lIlllIllIIIIl(TileObjects.getNearest(strArr4))) {
                                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[109]];
                                    String[] strArr44 = new String[llIllllIIl[1]];
                                    strArr44[llIllllIIl[0]] = llIlllIlII[llIllllIIl[110]];
                                    if (lIlllIlIllllI(Inventory.contains(strArr44) ? 1 : 0) && lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                        String[] strArr45 = new String[llIllllIIl[1]];
                                        strArr45[llIllllIIl[0]] = llIlllIlII[llIllllIIl[111]];
                                        if (lIlllIllIIIIl(TileObjects.getNearest(strArr45))) {
                                            String[] strArr46 = new String[llIllllIIl[1]];
                                            strArr46[llIllllIIl[0]] = llIlllIlII[llIllllIIl[112]];
                                            TileObjects.getNearest(strArr46).interact(llIlllIlII[llIllllIIl[113]]);
                                            Time.sleepTicks(llIllllIIl[2]);
                                            "".length();
                                        }
                                    }
                                    String[] strArr47 = new String[llIllllIIl[1]];
                                    strArr47[llIllllIIl[0]] = llIlllIlII[llIllllIIl[114]];
                                    if (lIlllIlIllllI(Inventory.contains(strArr47) ? 1 : 0)) {
                                        String[] strArr48 = new String[llIllllIIl[1]];
                                        strArr48[llIllllIIl[0]] = llIlllIlII[llIllllIIl[115]];
                                    }
                                    String[] strArr49 = new String[llIllllIIl[1]];
                                    strArr49[llIllllIIl[0]] = llIlllIlII[llIllllIIl[116]];
                                    if (lIlllIlIlllII(Inventory.contains(strArr49) ? 1 : 0) && lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                        String[] strArr50 = new String[llIllllIIl[1]];
                                        strArr50[llIllllIIl[0]] = llIlllIlII[llIllllIIl[117]];
                                        Item first5 = Inventory.getFirst(strArr50);
                                        String[] strArr51 = new String[llIllllIIl[1]];
                                        strArr51[llIllllIIl[0]] = llIlllIlII[llIllllIIl[118]];
                                        first5.useOn(TileObjects.getNearest(strArr51));
                                        Time.sleepTicks(llIllllIIl[2]);
                                        "".length();
                                    }
                                    String[] strArr52 = new String[llIllllIIl[1]];
                                    strArr52[llIllllIIl[0]] = llIlllIlII[llIllllIIl[119]];
                                    if (lIlllIlIlllII(Inventory.contains(strArr52) ? 1 : 0) && lIlllIllIlIII(Players.getLocal().getAnimation(), llIllllIIl[80])) {
                                        String[] strArr53 = new String[llIllllIIl[1]];
                                        strArr53[llIllllIIl[0]] = llIlllIlII[llIllllIIl[120]];
                                        Item first6 = Inventory.getFirst(strArr53);
                                        String[] strArr54 = new String[llIllllIIl[1]];
                                        strArr54[llIllllIIl[0]] = llIlllIlII[llIllllIIl[13]];
                                        first6.useOn(TileObjects.getNearest(strArr54));
                                        Time.sleepTicks(llIllllIIl[2]);
                                        "".length();
                                    }
                                    String[] strArr55 = new String[llIllllIIl[1]];
                                    strArr55[llIllllIIl[0]] = llIlllIlII[llIllllIIl[121]];
                                    TileObjects.getNearest(strArr55).interact(llIlllIlII[llIllllIIl[122]]);
                                    Time.sleepTicks(llIllllIIl[2]);
                                    "".length();
                                    String[] strArr56 = new String[llIllllIIl[1]];
                                    strArr56[llIllllIIl[0]] = llIlllIlII[llIllllIIl[123]];
                                    C0020g.a(strArr56);
                                }
                                strArr5 = new String[llIllllIIl[1]];
                                strArr5[llIllllIIl[0]] = llIlllIlII[llIllllIIl[124]];
                                if (lIlllIllIIIIl(TileObjects.getNearest(strArr5))) {
                                    String[] strArr57 = new String[llIllllIIl[1]];
                                    strArr57[llIllllIIl[0]] = llIlllIlII[llIllllIIl[125]];
                                    List list = (List) TileObjects.getAll(strArr57).stream().filter(tileObject6 -> {
                                        String[] strArr58 = new String[llIllllIIl[1]];
                                        strArr58[llIllllIIl[0]] = llIlllIlII[llIllllIIl[262]];
                                        return tileObject6.hasAction(strArr58);
                                    }).collect(Collectors.toList());
                                    TileObject nearest6 = TileObjects.getNearest(tileObject7 -> {
                                        String[] strArr58 = new String[llIllllIIl[1]];
                                        strArr58[llIllllIIl[0]] = llIlllIlII[llIllllIIl[260]];
                                        if (lIlllIlIlllII(tileObject7.hasAction(strArr58) ? 1 : 0) && lIlllIlIlllII(tileObject7.getName().equals(llIlllIlII[llIllllIIl[261]]) ? 1 : 0)) {
                                            ?? r0 = llIllllIIl[1];
                                            "".length();
                                            return (-" ".length()) > (109 ^ 105) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                        }
                                        return llIllllIIl[0];
                                    });
                                    if (lIlllIllIIIIl(nearest6)) {
                                        if (lIlllIllIIlII(Players.getLocal().getWorldX(), nearest6.getWorldX())) {
                                            TileObject nearest7 = TileObjects.getNearest(tileObject8 -> {
                                                String[] strArr58 = new String[llIllllIIl[1]];
                                                strArr58[llIllllIIl[0]] = llIlllIlII[llIllllIIl[259]];
                                                return tileObject8.hasAction(strArr58);
                                            });
                                            if (lIlllIllIIIIl(nearest7)) {
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[126]];
                                                nearest7.interact(llIlllIlII[llIllllIIl[127]]);
                                                Time.sleepTicks(C0018e.c(llIllllIIl[10], llIllllIIl[14]));
                                                "".length();
                                                "".length();
                                                if ("  ".length() <= (-" ".length())) {
                                                    return;
                                                }
                                            }
                                        } else {
                                            AccBuilderSotf.c = llIlllIlII[llIllllIIl[128]];
                                            nearest6.interact(llIlllIlII[llIllllIIl[129]]);
                                            Time.sleepTicks(llIllllIIl[11]);
                                            "".length();
                                        }
                                    }
                                }
                                strArr6 = new String[llIllllIIl[1]];
                                strArr6[llIllllIIl[0]] = llIlllIlII[llIllllIIl[130]];
                                if (lIlllIllIIIIl(TileObjects.getNearest(strArr6))) {
                                    nR = null;
                                    String[] strArr58 = new String[llIllllIIl[1]];
                                    strArr58[llIllllIIl[0]] = llIlllIlII[llIllllIIl[131]];
                                    List list2 = (List) TileObjects.getAll(strArr58).stream().filter(tileObject9 -> {
                                        String[] strArr59 = new String[llIllllIIl[1]];
                                        strArr59[llIllllIIl[0]] = llIlllIlII[llIllllIIl[258]];
                                        return tileObject9.hasAction(strArr59);
                                    }).collect(Collectors.toList());
                                    if (lIlllIlIllllI(list2.isEmpty() ? 1 : 0)) {
                                        if (lIlllIlIllllI(Reachable.isInteractable((Locatable) list2.get(llIllllIIl[0])) ? 1 : 0)) {
                                            String[] strArr59 = new String[llIllllIIl[1]];
                                            strArr59[llIllllIIl[0]] = llIlllIlII[llIllllIIl[132]];
                                            if (lIlllIlIlllII(Inventory.contains(strArr59) ? 1 : 0)) {
                                                String[] strArr60 = new String[llIllllIIl[1]];
                                                strArr60[llIllllIIl[0]] = llIlllIlII[llIllllIIl[133]];
                                            }
                                            AccBuilderSotf.c = llIlllIlII[llIllllIIl[134]];
                                            String[] strArr61 = new String[llIllllIIl[1]];
                                            strArr61[llIllllIIl[0]] = llIlllIlII[llIllllIIl[135]];
                                            List list3 = (List) TileObjects.getAll(strArr61).stream().filter(tileObject10 -> {
                                                String[] strArr62 = new String[llIllllIIl[1]];
                                                strArr62[llIllllIIl[0]] = llIlllIlII[llIllllIIl[257]];
                                                return tileObject10.hasAction(strArr62);
                                            }).collect(Collectors.toList());
                                            if (lIlllIlIllllI(list3.isEmpty() ? 1 : 0)) {
                                                ((TileObject) list3.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[136]]);
                                                Time.sleepTicks(llIllllIIl[2]);
                                                "".length();
                                            }
                                            String[] strArr62 = new String[llIllllIIl[1]];
                                            strArr62[llIllllIIl[0]] = llIlllIlII[llIllllIIl[137]];
                                            if (lIlllIlIlllII(Inventory.contains(strArr62) ? 1 : 0)) {
                                                String[] strArr63 = new String[llIllllIIl[1]];
                                                strArr63[llIllllIIl[0]] = llIlllIlII[llIllllIIl[138]];
                                                if (lIlllIllIIlII(Inventory.getAll(strArr63).size(), llIllllIIl[10])) {
                                                    String[] strArr64 = new String[llIllllIIl[1]];
                                                    strArr64[llIllllIIl[0]] = llIlllIlII[llIllllIIl[139]];
                                                    Item first7 = Inventory.getFirst(strArr64);
                                                    String[] strArr65 = new String[llIllllIIl[1]];
                                                    strArr65[llIllllIIl[0]] = llIlllIlII[llIllllIIl[140]];
                                                    first7.useOn((Item) Inventory.getAll(strArr65).get(llIllllIIl[1]));
                                                }
                                            }
                                            String[] strArr66 = new String[llIllllIIl[1]];
                                            strArr66[llIllllIIl[0]] = llIlllIlII[llIllllIIl[141]];
                                            if (lIlllIlIlllII(Inventory.contains(strArr66) ? 1 : 0)) {
                                                String[] strArr67 = new String[llIllllIIl[1]];
                                                strArr67[llIllllIIl[0]] = llIlllIlII[llIllllIIl[142]];
                                                Item first8 = Inventory.getFirst(strArr67);
                                                int[] iArr = new int[llIllllIIl[1]];
                                                iArr[llIllllIIl[0]] = llIllllIIl[143];
                                                first8.useOn(TileObjects.getNearest(iArr));
                                                Time.sleepTicks(llIllllIIl[15]);
                                                "".length();
                                            }
                                            String[] strArr68 = new String[llIllllIIl[1]];
                                            strArr68[llIllllIIl[0]] = llIlllIlII[llIllllIIl[144]];
                                            List list4 = (List) TileObjects.getAll(strArr68).stream().filter(tileObject11 -> {
                                                String[] strArr69 = new String[llIllllIIl[1]];
                                                strArr69[llIllllIIl[0]] = llIlllIlII[llIllllIIl[256]];
                                                return tileObject11.hasAction(strArr69);
                                            }).collect(Collectors.toList());
                                            if (lIlllIlIllllI(list4.isEmpty() ? 1 : 0)) {
                                                ((TileObject) list4.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[145]]);
                                                Time.sleepTicks(llIllllIIl[15]);
                                                "".length();
                                            }
                                        }
                                        if (lIlllIlIlllII(Reachable.isInteractable((Locatable) list2.get(llIllllIIl[0])) ? 1 : 0)) {
                                            AccBuilderSotf.c = llIlllIlII[llIllllIIl[146]];
                                            ((TileObject) list2.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[147]]);
                                            Time.sleepTicks(C0018e.c(llIllllIIl[10], llIllllIIl[14]));
                                            "".length();
                                        }
                                    }
                                }
                                strArr7 = new String[llIllllIIl[1]];
                                strArr7[llIllllIIl[0]] = llIlllIlII[llIllllIIl[148]];
                                if (lIlllIllIIIIl(TileObjects.getNearest(strArr7))) {
                                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[149]];
                                    System.out.println(llIlllIlII[llIllllIIl[150]]);
                                    ArrayList arrayList = new ArrayList();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    do {
                                        String[] strArr69 = new String[llIllllIIl[1]];
                                        strArr69[llIllllIIl[0]] = llIlllIlII[llIllllIIl[151]];
                                        if (lIlllIlIllllI(TileObjects.getAll(strArr69).isEmpty() ? 1 : 0) && lIlllIllIlIIl(Game.getState(), GameState.LOGGED_IN) && lIlllIlIllllI(AccBuilderSotf.d ? 1 : 0)) {
                                            int i = llIllllIIl[0];
                                            if (lIlllIlIlllII(arrayList.isEmpty() ? 1 : 0)) {
                                                Time.sleepTicks(llIllllIIl[15]);
                                                "".length();
                                                System.out.println(llIlllIlII[llIllllIIl[152]]);
                                                arrayList = TileObjects.getAll(tileObject12 -> {
                                                    if (lIlllIllIlIII(tileObject12.getId(), llIllllIIl[255])) {
                                                        ?? r0 = llIllllIIl[1];
                                                        "".length();
                                                        return (((90 ^ 95) ^ ((232 ^ 197) & ((15 ^ 34) ^ (-1)))) & (((103 ^ 78) ^ (236 ^ 192)) ^ (-" ".length()))) != 0 ? ((70 ^ 125) ^ (186 ^ 145)) & (((((164 + 38) - 195) + 183) ^ (((104 + 128) - 220) + 162)) ^ (-" ".length())) : r0;
                                                    }
                                                    return llIllllIIl[0];
                                                });
                                                System.out.println(llIlllIlII[llIllllIIl[153]]);
                                                String[] strArr70 = new String[llIllllIIl[1]];
                                                strArr70[llIllllIIl[0]] = llIlllIlII[llIllllIIl[154]];
                                                nR = TileObjects.getNearest(strArr70).getWorldLocation();
                                                TileObject nearest8 = TileObjects.getNearest(tileObject13 -> {
                                                    if (lIlllIlIlllII(tileObject13.getName().contains(llIlllIlII[llIllllIIl[253]]) ? 1 : 0)) {
                                                        String[] strArr71 = new String[llIllllIIl[1]];
                                                        strArr71[llIllllIIl[0]] = llIlllIlII[llIllllIIl[254]];
                                                        if (lIlllIlIlllII(tileObject13.hasAction(strArr71) ? 1 : 0)) {
                                                            ?? r0 = llIllllIIl[1];
                                                            "".length();
                                                            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                                                        }
                                                    }
                                                    return llIllllIIl[0];
                                                });
                                                if (lIlllIllIIIIl(nearest8) && lIlllIlIlllll(nearest8.getWorldLocation().getY(), nR.getY() + llIllllIIl[17])) {
                                                    i = llIllllIIl[1];
                                                }
                                            }
                                            System.out.println("Version: " + i);
                                            if (lIlllIlIllllI(i)) {
                                                if (lIlllIllIIIIl(nR) && lIlllIlIlllll(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIllllIIl[17])) {
                                                    List list5 = (List) arrayList.stream().map(tileObject14 -> {
                                                        return tileObject14.getWorldLocation();
                                                    }).collect(Collectors.toList());
                                                    WorldPoint[] worldPointArr = new WorldPoint[llIllllIIl[18]];
                                                    worldPointArr[llIllllIIl[0]] = new WorldPoint(nR.getX() - llIllllIIl[14], nR.getY() - llIllllIIl[11], nR.getPlane());
                                                    worldPointArr[llIllllIIl[1]] = new WorldPoint(nR.getX() - llIllllIIl[11], nR.getY() - llIllllIIl[11], nR.getPlane());
                                                    worldPointArr[llIllllIIl[2]] = new WorldPoint(nR.getX() - llIllllIIl[10], nR.getY() - llIllllIIl[11], nR.getPlane());
                                                    worldPointArr[llIllllIIl[10]] = new WorldPoint(nR.getX() - llIllllIIl[2], nR.getY() - llIllllIIl[11], nR.getPlane());
                                                    worldPointArr[llIllllIIl[11]] = new WorldPoint(nR.getX() - llIllllIIl[1], nR.getY() - llIllllIIl[11], nR.getPlane());
                                                    worldPointArr[llIllllIIl[14]] = new WorldPoint(nR.getX(), nR.getY() - llIllllIIl[11], nR.getPlane());
                                                    worldPointArr[llIllllIIl[15]] = new WorldPoint(nR.getX() + llIllllIIl[1], nR.getY() - llIllllIIl[11], nR.getPlane());
                                                    worldPointArr[llIllllIIl[3]] = new WorldPoint(nR.getX() + llIllllIIl[2], nR.getY() - llIllllIIl[11], nR.getPlane());
                                                    worldPointArr[llIllllIIl[16]] = new WorldPoint(nR.getX() + llIllllIIl[10], nR.getY() - llIllllIIl[11], nR.getPlane());
                                                    worldPointArr[llIllllIIl[17]] = new WorldPoint(nR.getX() + llIllllIIl[11], nR.getY() - llIllllIIl[11], nR.getPlane());
                                                    List asList = Arrays.asList(worldPointArr);
                                                    System.out.println("Start tiles: " + asList.size());
                                                    int i2 = llIllllIIl[0];
                                                    int i3 = llIllllIIl[0];
                                                    while (true) {
                                                        if (!lIlllIlIlllIl(i3, asList.size())) {
                                                            break;
                                                        }
                                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[155]];
                                                        List<WorldPoint> a = a((WorldPoint) asList.get(i3), nR.getY() - llIllllIIl[17], list5);
                                                        if (lIlllIlIllllI(a.isEmpty() ? 1 : 0)) {
                                                            System.out.println(llIlllIlII[llIllllIIl[156]]);
                                                            for (WorldPoint worldPoint : a) {
                                                                System.out.println("(" + worldPoint.getX() + ", " + worldPoint.getY() + ", " + worldPoint.getPlane() + ")");
                                                                "".length();
                                                                if (((151 ^ 182) ^ (122 ^ 95)) == "   ".length()) {
                                                                    return;
                                                                }
                                                            }
                                                            i2 = llIllllIIl[1];
                                                            while (true) {
                                                                if (!lIlllIlIlllII(i2) || !lIlllIlIllllI(a.isEmpty() ? 1 : 0)) {
                                                                    break;
                                                                }
                                                                if (lIlllIlIllllI(Players.getLocal().getWorldLocation().equals(a.get(llIllllIIl[0])) ? 1 : 0)) {
                                                                    if (lIlllIlIlllll(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIllllIIl[11])) {
                                                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[157]];
                                                                        C0018e.c(a.get(llIllllIIl[0]));
                                                                        Time.sleepUntil(() -> {
                                                                            if (lIlllIlIlllll(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIllllIIl[11])) {
                                                                                ?? r0 = llIllllIIl[1];
                                                                                "".length();
                                                                                return " ".length() <= 0 ? ((((73 + 68) - 16) + 65) ^ (((74 + 5) - 72) + 159)) & (((((142 + 14) - 83) + 112) ^ (((94 + 147) - 159) + 79)) ^ (-" ".length())) : r0;
                                                                            }
                                                                            return llIllllIIl[0];
                                                                        }, C0018e.c(llIllllIIl[158], llIllllIIl[159]));
                                                                        "".length();
                                                                        Time.sleepTicks(llIllllIIl[2]);
                                                                        "".length();
                                                                        "".length();
                                                                        if ("  ".length() < (-" ".length())) {
                                                                            return;
                                                                        }
                                                                    } else {
                                                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[160]];
                                                                        String[] strArr71 = new String[llIllllIIl[1]];
                                                                        strArr71[llIllllIIl[0]] = llIlllIlII[llIllllIIl[161]];
                                                                        List at = TileObjects.getAt(a.get(llIllllIIl[0]), strArr71);
                                                                        if (lIlllIlIllllI(at.isEmpty() ? 1 : 0)) {
                                                                            System.out.println("Bog size: " + at.size());
                                                                            ((TileObject) at.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[162]]);
                                                                            Time.sleepTicks(llIllllIIl[2]);
                                                                            "".length();
                                                                        }
                                                                        if (lIlllIlIlllII(at.isEmpty() ? 1 : 0)) {
                                                                            System.out.println("Bog is null at: " + String.valueOf(a.get(llIllllIIl[0])));
                                                                            Game.logout();
                                                                            Time.sleepTicks(llIllllIIl[2]);
                                                                            "".length();
                                                                            "".length();
                                                                            if ((-((120 ^ 96) ^ (7 ^ 26))) >= 0) {
                                                                                return;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (lIlllIlIlllII(Players.getLocal().getWorldLocation().equals(a.get(llIllllIIl[0])) ? 1 : 0)) {
                                                                    System.out.println(llIlllIlII[llIllllIIl[163]]);
                                                                    a.remove(llIllllIIl[0]);
                                                                    "".length();
                                                                    Time.sleepTicks(llIllllIIl[2]);
                                                                    "".length();
                                                                }
                                                                Time.sleepTicks(llIllllIIl[1]);
                                                                "".length();
                                                                "".length();
                                                                if (0 != 0) {
                                                                    return;
                                                                }
                                                            }
                                                            if (lIlllIllIIlll(Game.getState(), GameState.LOGGED_IN)) {
                                                                System.out.println(llIlllIlII[llIllllIIl[164]]);
                                                                "".length();
                                                                if ("  ".length() != "  ".length()) {
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                            "".length();
                                                            if (((true ^ true) & ((true ^ true) ^ true)) != false) {
                                                                return;
                                                            }
                                                        }
                                                    }
                                                    if (lIlllIlIllllI(i2)) {
                                                        System.out.println(llIlllIlII[llIllllIIl[165]]);
                                                    }
                                                    System.out.println(arrayList.size());
                                                }
                                                if (lIlllIllIIIIl(nR) && lIlllIllIIIII(Players.getLocal().getWorldLocation().getY(), nR.getY() - llIllllIIl[17])) {
                                                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[166]];
                                                    String[] strArr72 = new String[llIllllIIl[1]];
                                                    strArr72[llIllllIIl[0]] = llIlllIlII[llIllllIIl[167]];
                                                    TileObjects.getNearest(strArr72).interact(llIlllIlII[llIllllIIl[168]]);
                                                    Time.sleepTicks(llIllllIIl[11]);
                                                    "".length();
                                                }
                                            }
                                            if (lIlllIlIlllII(i)) {
                                                if (lIlllIllIIIIl(nR) && lIlllIlIlllIl(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIllllIIl[17])) {
                                                    List list6 = (List) arrayList.stream().map(tileObject15 -> {
                                                        return tileObject15.getWorldLocation();
                                                    }).collect(Collectors.toList());
                                                    WorldPoint[] worldPointArr2 = new WorldPoint[llIllllIIl[18]];
                                                    worldPointArr2[llIllllIIl[0]] = new WorldPoint(nR.getX() - llIllllIIl[14], nR.getY() + llIllllIIl[11], nR.getPlane());
                                                    worldPointArr2[llIllllIIl[1]] = new WorldPoint(nR.getX() - llIllllIIl[11], nR.getY() + llIllllIIl[11], nR.getPlane());
                                                    worldPointArr2[llIllllIIl[2]] = new WorldPoint(nR.getX() - llIllllIIl[10], nR.getY() + llIllllIIl[11], nR.getPlane());
                                                    worldPointArr2[llIllllIIl[10]] = new WorldPoint(nR.getX() - llIllllIIl[2], nR.getY() + llIllllIIl[11], nR.getPlane());
                                                    worldPointArr2[llIllllIIl[11]] = new WorldPoint(nR.getX() - llIllllIIl[1], nR.getY() + llIllllIIl[11], nR.getPlane());
                                                    worldPointArr2[llIllllIIl[14]] = new WorldPoint(nR.getX(), nR.getY() + llIllllIIl[11], nR.getPlane());
                                                    worldPointArr2[llIllllIIl[15]] = new WorldPoint(nR.getX() + llIllllIIl[1], nR.getY() + llIllllIIl[11], nR.getPlane());
                                                    worldPointArr2[llIllllIIl[3]] = new WorldPoint(nR.getX() + llIllllIIl[2], nR.getY() + llIllllIIl[11], nR.getPlane());
                                                    worldPointArr2[llIllllIIl[16]] = new WorldPoint(nR.getX() + llIllllIIl[10], nR.getY() + llIllllIIl[11], nR.getPlane());
                                                    worldPointArr2[llIllllIIl[17]] = new WorldPoint(nR.getX() + llIllllIIl[11], nR.getY() + llIllllIIl[11], nR.getPlane());
                                                    List asList2 = Arrays.asList(worldPointArr2);
                                                    System.out.println("Start tiles: " + asList2.size());
                                                    int i4 = llIllllIIl[0];
                                                    int i5 = llIllllIIl[0];
                                                    while (true) {
                                                        if (!lIlllIlIlllIl(i5, asList2.size())) {
                                                            break;
                                                        }
                                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[169]];
                                                        List<WorldPoint> a2 = a((WorldPoint) asList2.get(i5), nR.getY() + llIllllIIl[17], list6);
                                                        if (lIlllIlIllllI(a2.isEmpty() ? 1 : 0)) {
                                                            System.out.println(llIlllIlII[llIllllIIl[170]]);
                                                            for (WorldPoint worldPoint2 : a2) {
                                                                System.out.println("(" + worldPoint2.getX() + ", " + worldPoint2.getY() + ", " + worldPoint2.getPlane() + ")");
                                                                "".length();
                                                                if (0 != 0) {
                                                                    return;
                                                                }
                                                            }
                                                            i4 = llIllllIIl[1];
                                                            while (true) {
                                                                if (!lIlllIlIlllII(i4) || !lIlllIlIllllI(a2.isEmpty() ? 1 : 0)) {
                                                                    break;
                                                                }
                                                                if (lIlllIlIllllI(Players.getLocal().getWorldLocation().equals(a2.get(llIllllIIl[0])) ? 1 : 0)) {
                                                                    if (lIlllIlIlllIl(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIllllIIl[11])) {
                                                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[171]];
                                                                        C0018e.c(a2.get(llIllllIIl[0]));
                                                                        Time.sleepUntil(() -> {
                                                                            if (lIlllIlIlllIl(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIllllIIl[11])) {
                                                                                ?? r0 = llIllllIIl[1];
                                                                                "".length();
                                                                                return "   ".length() < 0 ? ((((68 + 90) - 89) + 79) ^ (((74 + 5) - 59) + 162)) & (((((5 + 144) - 85) + 92) ^ (((1 + 178) - 4) + 15)) ^ (-" ".length())) : r0;
                                                                            }
                                                                            return llIllllIIl[0];
                                                                        }, C0018e.c(llIllllIIl[158], llIllllIIl[159]));
                                                                        "".length();
                                                                        Time.sleepTicks(llIllllIIl[2]);
                                                                        "".length();
                                                                        "".length();
                                                                        if ("   ".length() < " ".length()) {
                                                                            return;
                                                                        }
                                                                    } else {
                                                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[172]];
                                                                        String[] strArr73 = new String[llIllllIIl[1]];
                                                                        strArr73[llIllllIIl[0]] = llIlllIlII[llIllllIIl[173]];
                                                                        List at2 = TileObjects.getAt(a2.get(llIllllIIl[0]), strArr73);
                                                                        if (lIlllIlIllllI(at2.isEmpty() ? 1 : 0)) {
                                                                            System.out.println("Bog size: " + at2.size());
                                                                            ((TileObject) at2.get(llIllllIIl[0])).interact(llIlllIlII[llIllllIIl[174]]);
                                                                            Time.sleepTicks(llIllllIIl[2]);
                                                                            "".length();
                                                                        }
                                                                        if (lIlllIlIlllII(at2.isEmpty() ? 1 : 0)) {
                                                                            System.out.println("Bog is null at: " + String.valueOf(a2.get(llIllllIIl[0])));
                                                                            Game.logout();
                                                                            Time.sleepTicks(llIllllIIl[2]);
                                                                            "".length();
                                                                            "".length();
                                                                            if (((((143 + 13) - 42) + 84) ^ (((24 + 166) - 111) + 115)) < 0) {
                                                                                return;
                                                                            }
                                                                        } else {
                                                                            Time.sleepTicks(llIllllIIl[2]);
                                                                            "".length();
                                                                        }
                                                                    }
                                                                }
                                                                if (lIlllIlIlllII(Players.getLocal().getWorldLocation().equals(a2.get(llIllllIIl[0])) ? 1 : 0)) {
                                                                    System.out.println(llIlllIlII[llIllllIIl[175]]);
                                                                    a2.remove(llIllllIIl[0]);
                                                                    "".length();
                                                                    Time.sleepTicks(llIllllIIl[2]);
                                                                    "".length();
                                                                }
                                                                System.out.println("Path size lefT: " + a2.size());
                                                                Time.sleepTicks(llIllllIIl[1]);
                                                                "".length();
                                                                "".length();
                                                                if ((-((121 ^ 93) ^ (155 ^ 187))) >= 0) {
                                                                    return;
                                                                }
                                                            }
                                                        } else {
                                                            i5++;
                                                            "".length();
                                                            if (((171 ^ 184) ^ (82 ^ 69)) < 0) {
                                                                return;
                                                            }
                                                        }
                                                    }
                                                    if (lIlllIlIllllI(i4)) {
                                                        System.out.println(llIlllIlII[llIllllIIl[177]]);
                                                    }
                                                    System.out.println(arrayList.size());
                                                }
                                                if (lIlllIllIIIIl(nR) && lIlllIllIIlII(Players.getLocal().getWorldLocation().getY(), nR.getY() + llIllllIIl[17])) {
                                                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[178]];
                                                    String[] strArr74 = new String[llIllllIIl[1]];
                                                    strArr74[llIllllIIl[0]] = llIlllIlII[llIllllIIl[179]];
                                                    TileObjects.getNearest(strArr74).interact(llIlllIlII[llIllllIIl[180]]);
                                                    Time.sleepTicks(llIllllIIl[11]);
                                                    "".length();
                                                }
                                            }
                                            if (lIlllIllIIIll(lIlllIllIIlIl(System.currentTimeMillis(), currentTimeMillis + 45000))) {
                                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[181]];
                                                Game.logout();
                                                currentTimeMillis = System.currentTimeMillis();
                                            }
                                            "".length();
                                        } else {
                                            int[] iArr2 = new int[llIllllIIl[1]];
                                            iArr2[llIllllIIl[0]] = llIllllIIl[9];
                                            if (lIlllIlIlllII(Inventory.contains(iArr2) ? 1 : 0)) {
                                                Time.sleepTicks(C0018e.c(llIllllIIl[10], llIllllIIl[11]));
                                                "".length();
                                                mV = llIllllIIl[0];
                                            }
                                        }
                                    } while ((-"   ".length()) < 0);
                                    return;
                                }
                                if (!lIlllIlIllllI(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIlIllllI(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIllIlIlI(lIlllIllIIllI(C0018e.w(), 25.0d))) {
                                    int[] iArr3 = new int[llIllllIIl[1]];
                                    iArr3[llIllllIIl[0]] = llIllllIIl[9];
                                    if (lIlllIlIlllII(Inventory.contains(iArr3) ? 1 : 0)) {
                                        Time.sleepTicks(C0018e.c(llIllllIIl[10], llIllllIIl[11]));
                                        "".length();
                                        mV = llIllllIIl[0];
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            }
        }
        if (lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIllllIIl[27])) {
            String[] strArr75 = new String[llIllllIIl[1]];
            strArr75[llIllllIIl[0]] = llIlllIlII[llIllllIIl[62]];
            if (lIlllIllIIIlI(TileObjects.getNearest(strArr75))) {
                nR = null;
                AccBuilderSotf.c = llIlllIlII[llIllllIIl[63]];
                TileObject nearest9 = TileObjects.getNearest(tileObject16 -> {
                    String[] strArr76 = new String[llIllllIIl[1]];
                    strArr76[llIllllIIl[0]] = llIlllIlII[llIllllIIl[266]];
                    return tileObject16.hasAction(strArr76);
                });
                if (lIlllIllIIIIl(nearest9)) {
                    nearest9.interact(llIlllIlII[llIllllIIl[64]]);
                    Time.sleepUntil(() -> {
                        if (lIlllIlIllllI(LocalPlayer.get().isMoving() ? 1 : 0)) {
                            ?? r0 = llIllllIIl[1];
                            "".length();
                            return "   ".length() <= 0 ? ((0 ^ 125) ^ (69 ^ 22)) & (((85 ^ 11) ^ (255 ^ 143)) ^ (-" ".length())) : r0;
                        }
                        return llIllllIIl[0];
                    }, Rand.nextInt(llIllllIIl[65], llIllllIIl[66]));
                    "".length();
                }
            }
        }
        strArr = new String[llIllllIIl[1]];
        strArr[llIllllIIl[0]] = llIlllIlII[llIllllIIl[67]];
        if (lIlllIllIIIIl(NPCs.getNearest(strArr))) {
            AccBuilderSotf.c = llIlllIlII[llIllllIIl[69]];
            nearest = TileObjects.getNearest(tileObject42 -> {
                String[] strArr152 = new String[llIllllIIl[1]];
                strArr152[llIllllIIl[0]] = llIlllIlII[llIllllIIl[265]];
                return tileObject42.hasAction(strArr152);
            });
            if (lIlllIllIIIIl(nearest)) {
            }
        }
        TileObjects.getNearest(tileObject52 -> {
            return tileObject52.getName().contains(llIlllIlII[llIllllIIl[264]]);
        });
        strArr2 = new String[llIllllIIl[1]];
        strArr2[llIllllIIl[0]] = llIlllIlII[llIllllIIl[71]];
        if (lIlllIllIIIIl(TileObjects.getNearest(strArr2))) {
        }
        strArr3 = new String[llIllllIIl[1]];
        strArr3[llIllllIIl[0]] = llIlllIlII[llIllllIIl[91]];
        if (lIlllIllIIIIl(TileObjects.getNearest(strArr3))) {
        }
        strArr4 = new String[llIllllIIl[1]];
        strArr4[llIllllIIl[0]] = llIlllIlII[llIllllIIl[108]];
        if (lIlllIllIIIIl(TileObjects.getNearest(strArr4))) {
        }
        strArr5 = new String[llIllllIIl[1]];
        strArr5[llIllllIIl[0]] = llIlllIlII[llIllllIIl[124]];
        if (lIlllIllIIIIl(TileObjects.getNearest(strArr5))) {
        }
        strArr6 = new String[llIllllIIl[1]];
        strArr6[llIllllIIl[0]] = llIlllIlII[llIllllIIl[130]];
        if (lIlllIllIIIIl(TileObjects.getNearest(strArr6))) {
        }
        strArr7 = new String[llIllllIIl[1]];
        strArr7[llIllllIIl[0]] = llIlllIlII[llIllllIIl[148]];
        if (lIlllIllIIIIl(TileObjects.getNearest(strArr7))) {
        }
        if (!lIlllIlIllllI(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
        }
    }

    private static int d(int i, int i2) {
        return Math.abs(i - i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01e6, code lost:
        if (lIlllIlIlllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aL.llIllllIIl[36]) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x027c, code lost:
        if (lIlllIlIlllIl(net.unethicalite.api.items.Bank.getFirst(r0).getQuantity(), o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.aL.llIllllIIl[4]) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Q() {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7 = new int[llIllllIIl[1]];
        iArr7[llIllllIIl[0]] = llIllllIIl[8];
        if (lIlllIlIllllI(Bank.contains(iArr7) ? 1 : 0)) {
            bv.add(new C0017d(llIllllIIl[8], llIllllIIl[1], C0018e.c(llIllllIIl[228], llIllllIIl[229])));
            "".length();
        }
        int[] iArr8 = new int[llIllllIIl[1]];
        iArr8[llIllllIIl[0]] = llIllllIIl[230];
        if (lIlllIlIllllI(Bank.contains(iArr8) ? 1 : 0)) {
            bv.add(new C0017d(llIllllIIl[230], llIllllIIl[2], llIllllIIl[231]));
            "".length();
        }
        int[] iArr9 = new int[llIllllIIl[1]];
        iArr9[llIllllIIl[0]] = llIllllIIl[232];
        if (lIlllIlIllllI(Bank.contains(iArr9) ? 1 : 0)) {
            bv.add(new C0017d(llIllllIIl[232], llIllllIIl[18], llIllllIIl[233]));
            "".length();
        }
        int[] iArr10 = new int[llIllllIIl[1]];
        iArr10[llIllllIIl[0]] = llIllllIIl[22];
        if (lIlllIlIllllI(Bank.contains(iArr10) ? 1 : 0)) {
            bv.add(new C0017d(llIllllIIl[22], llIllllIIl[1], C0018e.c(llIllllIIl[234], llIllllIIl[235])));
            "".length();
        }
        int[] iArr11 = new int[llIllllIIl[1]];
        iArr11[llIllllIIl[0]] = llIllllIIl[23];
        if (lIlllIlIllllI(Bank.contains(iArr11) ? 1 : 0)) {
            bv.add(new C0017d(llIllllIIl[23], llIllllIIl[1], C0018e.c(llIllllIIl[234], llIllllIIl[235])));
            "".length();
        }
        int[] iArr12 = new int[llIllllIIl[1]];
        iArr12[llIllllIIl[0]] = llIllllIIl[185];
        if (lIlllIlIlllII(Bank.contains(iArr12) ? 1 : 0)) {
            int[] iArr13 = new int[llIllllIIl[1]];
            iArr13[llIllllIIl[0]] = llIllllIIl[185];
            if (lIlllIlIlllII(Bank.contains(iArr13) ? 1 : 0)) {
                int[] iArr14 = new int[llIllllIIl[1]];
                iArr14[llIllllIIl[0]] = llIllllIIl[185];
            }
            iArr = new int[llIllllIIl[1]];
            iArr[llIllllIIl[0]] = llIllllIIl[9];
            if (lIlllIlIlllII(Bank.contains(iArr) ? 1 : 0)) {
                int[] iArr15 = new int[llIllllIIl[1]];
                iArr15[llIllllIIl[0]] = llIllllIIl[9];
                if (lIlllIlIlllII(Bank.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[llIllllIIl[1]];
                    iArr16[llIllllIIl[0]] = llIllllIIl[9];
                }
                iArr2 = new int[llIllllIIl[1]];
                iArr2[llIllllIIl[0]] = llIllllIIl[240];
                if (lIlllIlIllllI(Bank.contains(iArr2) ? 1 : 0)) {
                    bv.add(new C0017d(llIllllIIl[240], llIllllIIl[18], llIllllIIl[241]));
                    "".length();
                }
                iArr3 = new int[llIllllIIl[1]];
                iArr3[llIllllIIl[0]] = llIllllIIl[242];
                if (lIlllIlIllllI(Bank.contains(iArr3) ? 1 : 0)) {
                    bv.add(new C0017d(mU, llIllllIIl[59], llIllllIIl[243]));
                    "".length();
                }
                iArr4 = new int[llIllllIIl[1]];
                iArr4[llIllllIIl[0]] = llIllllIIl[244];
                if (lIlllIlIllllI(Bank.contains(iArr4) ? 1 : 0)) {
                    bv.add(new C0017d(llIllllIIl[244], llIllllIIl[1], llIllllIIl[245]));
                    "".length();
                }
                iArr5 = new int[llIllllIIl[1]];
                iArr5[llIllllIIl[0]] = llIllllIIl[7];
                if (lIlllIlIllllI(Bank.contains(iArr5) ? 1 : 0)) {
                    bv.add(new C0017d(llIllllIIl[7], llIllllIIl[1], C0018e.c(llIllllIIl[246], llIllllIIl[247])));
                    "".length();
                }
                iArr6 = new int[llIllllIIl[1]];
                iArr6[llIllllIIl[0]] = llIllllIIl[248];
                if (lIlllIlIllllI(Bank.contains(iArr6) ? 1 : 0)) {
                    bv.add(new C0017d(llIllllIIl[248], llIllllIIl[36], C0023j.cf));
                    "".length();
                    return;
                }
                return;
            }
            bv.add(new C0017d(llIllllIIl[9], llIllllIIl[4], C0018e.c(llIllllIIl[159], llIllllIIl[239])));
            "".length();
            iArr2 = new int[llIllllIIl[1]];
            iArr2[llIllllIIl[0]] = llIllllIIl[240];
            if (lIlllIlIllllI(Bank.contains(iArr2) ? 1 : 0)) {
            }
            iArr3 = new int[llIllllIIl[1]];
            iArr3[llIllllIIl[0]] = llIllllIIl[242];
            if (lIlllIlIllllI(Bank.contains(iArr3) ? 1 : 0)) {
            }
            iArr4 = new int[llIllllIIl[1]];
            iArr4[llIllllIIl[0]] = llIllllIIl[244];
            if (lIlllIlIllllI(Bank.contains(iArr4) ? 1 : 0)) {
            }
            iArr5 = new int[llIllllIIl[1]];
            iArr5[llIllllIIl[0]] = llIllllIIl[7];
            if (lIlllIlIllllI(Bank.contains(iArr5) ? 1 : 0)) {
            }
            iArr6 = new int[llIllllIIl[1]];
            iArr6[llIllllIIl[0]] = llIllllIIl[248];
            if (lIlllIlIllllI(Bank.contains(iArr6) ? 1 : 0)) {
            }
        }
        bv.add(new C0017d(llIllllIIl[185], llIllllIIl[236], C0018e.c(llIllllIIl[237], llIllllIIl[238])));
        "".length();
        iArr = new int[llIllllIIl[1]];
        iArr[llIllllIIl[0]] = llIllllIIl[9];
        if (lIlllIlIlllII(Bank.contains(iArr) ? 1 : 0)) {
        }
        bv.add(new C0017d(llIllllIIl[9], llIllllIIl[4], C0018e.c(llIllllIIl[159], llIllllIIl[239])));
        "".length();
        iArr2 = new int[llIllllIIl[1]];
        iArr2[llIllllIIl[0]] = llIllllIIl[240];
        if (lIlllIlIllllI(Bank.contains(iArr2) ? 1 : 0)) {
        }
        iArr3 = new int[llIllllIIl[1]];
        iArr3[llIllllIIl[0]] = llIllllIIl[242];
        if (lIlllIlIllllI(Bank.contains(iArr3) ? 1 : 0)) {
        }
        iArr4 = new int[llIllllIIl[1]];
        iArr4[llIllllIIl[0]] = llIllllIIl[244];
        if (lIlllIlIllllI(Bank.contains(iArr4) ? 1 : 0)) {
        }
        iArr5 = new int[llIllllIIl[1]];
        iArr5[llIllllIIl[0]] = llIllllIIl[7];
        if (lIlllIlIllllI(Bank.contains(iArr5) ? 1 : 0)) {
        }
        iArr6 = new int[llIllllIIl[1]];
        iArr6[llIllllIIl[0]] = llIllllIIl[248];
        if (lIlllIlIllllI(Bank.contains(iArr6) ? 1 : 0)) {
        }
    }

    private static String lIlllIIllllll(String llllllllllllllllllIIIIIIIIIIIIII, String lllllllllllllllllIllllllllllllll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllIllllllllllllll.getBytes(StandardCharsets.UTF_8)), llIllllIIl[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllllIIl[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIIIIIIIIIIl) {
            llllllllllllllllllIIIIIIIIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean a(aM aMVar, PriorityQueue<aM> priorityQueue) {
        return priorityQueue.stream().anyMatch(aMVar2 -> {
            return aMVar2.nT.equals(aMVar.nT);
        });
    }

    private static boolean lIlllIllIIIll(int i) {
        return i > 0;
    }

    private static List<WorldPoint> a(aM aMVar) {
        ArrayList arrayList = new ArrayList();
        while (lIlllIllIIIIl(aMVar)) {
            arrayList.add(aMVar.nT);
            "".length();
            aMVar = aMVar.pV;
            "".length();
            if ((-" ".length()) >= ((122 ^ 58) & ((101 ^ 37) ^ (-1)))) {
                return null;
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    private static int lIlllIllIIlIl(long j, long j2) {
        return (j > j2 ? 1 : (j == j2 ? 0 : -1));
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public String ag() {
        return llIlllIlII[llIllllIIl[249]];
    }

    static {
        lIlllIlIllIll();
        lIlllIlIlIlll();
        bv = new ArrayList();
        nH = new WorldArea(llIllllIIl[275], llIllllIIl[276], llIllllIIl[32], llIllllIIl[53], llIllllIIl[0]);
        nI = new WorldPoint(llIllllIIl[277], llIllllIIl[278], llIllllIIl[0]);
        mT = llIllllIIl[279];
        mU = llIllllIIl[242];
        nJ = llIllllIIl[185];
        nK = llIllllIIl[52];
        nL = new WorldArea(llIllllIIl[280], llIllllIIl[281], llIllllIIl[132], llIllllIIl[93], llIllllIIl[0]);
        nM = new WorldArea(llIllllIIl[282], llIllllIIl[283], llIllllIIl[72], llIllllIIl[71], llIllllIIl[0]);
        nN = llIlllIlII[llIllllIIl[284]];
        nO = new WorldArea(llIllllIIl[285], llIllllIIl[286], llIllllIIl[64], llIllllIIl[69], llIllllIIl[0]);
        nP = new WorldPoint(llIllllIIl[287], llIllllIIl[288], llIllllIIl[0]);
        nQ = new WorldPoint(llIllllIIl[289], llIllllIIl[290], llIllllIIl[0]);
        cG = llIllllIIl[0];
        nR = null;
    }

    private static boolean lIlllIllIlIlI(int i) {
        return i <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x019b, code lost:
        if (lIlllIlIlllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01f2, code lost:
        if (lIlllIlIlllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x022c, code lost:
        if (lIlllIlIlllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0266, code lost:
        if (lIlllIlIlllII(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v192, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void gd() {
        AccBuilderSotf.c = llIlllIlII[llIllllIIl[182]];
        if (lIlllIlIllllI(Bank.isOpen() ? 1 : 0)) {
            if (lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIllllIIl[3])) {
                C0000a.a();
                Time.sleepTicks(llIllllIIl[10]);
                "".length();
            }
            if (lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(nQ), llIllllIIl[28])) {
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lIlllIlIlllII(tileObject.getName().equalsIgnoreCase(llIlllIlII[llIllllIIl[251]]) ? 1 : 0)) {
                        String[] strArr = new String[llIllllIIl[1]];
                        strArr[llIllllIIl[0]] = llIlllIlII[llIllllIIl[252]];
                        if (lIlllIlIlllII(tileObject.hasAction(strArr) ? 1 : 0)) {
                            ?? r0 = llIllllIIl[1];
                            "".length();
                            return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                    }
                    return llIllllIIl[0];
                });
                if (lIlllIllIIIIl(nearest)) {
                    nearest.interact(llIlllIlII[llIllllIIl[183]]);
                    Time.sleepUntil(() -> {
                        return Bank.isOpen();
                    }, llIllllIIl[158]);
                    "".length();
                }
            }
            if (lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIllllIIl[24])) {
                int[] iArr = new int[llIllllIIl[1]];
                iArr[llIllllIIl[0]] = llIllllIIl[19];
                TileObjects.getNearest(iArr).interact(llIlllIlII[llIllllIIl[184]]);
                Time.sleepTicks(llIllllIIl[2]);
                "".length();
            }
        }
        if (lIlllIlIlllII(Bank.isOpen() ? 1 : 0)) {
            if (lIlllIllIIIll(Inventory.getAll().size())) {
                Bank.depositInventory();
                Time.sleepTicks(llIllllIIl[11]);
                "".length();
            }
            if (lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIllllIIl[3]) && lIlllIllIIIll(Equipment.getAll().size())) {
                Bank.depositEquipment();
                Time.sleepTicks(llIllllIIl[2]);
                "".length();
            }
            int[] iArr2 = new int[llIllllIIl[1]];
            iArr2[llIllllIIl[0]] = llIllllIIl[7];
            if (lIlllIlIllllI(Bank.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIllllIIl[1]];
                iArr3[llIllllIIl[0]] = llIllllIIl[7];
                if (lIlllIlIllllI(Equipment.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[llIllllIIl[1]];
                    iArr4[llIllllIIl[0]] = llIllllIIl[7];
                }
            }
            int[] iArr5 = new int[llIllllIIl[1]];
            iArr5[llIllllIIl[0]] = llIllllIIl[8];
            if (lIlllIlIllllI(Bank.contains(iArr5) ? 1 : 0)) {
                int[] iArr6 = new int[llIllllIIl[1]];
                iArr6[llIllllIIl[0]] = llIllllIIl[8];
                if (lIlllIlIllllI(Inventory.contains(iArr6) ? 1 : 0)) {
                    int[] iArr7 = new int[llIllllIIl[1]];
                    iArr7[llIllllIIl[0]] = llIllllIIl[8];
                }
            }
            int[] iArr8 = new int[llIllllIIl[1]];
            iArr8[llIllllIIl[0]] = llIllllIIl[22];
            if (lIlllIlIllllI(Bank.contains(iArr8) ? 1 : 0)) {
                int[] iArr9 = new int[llIllllIIl[1]];
                iArr9[llIllllIIl[0]] = llIllllIIl[22];
            }
            int[] iArr10 = new int[llIllllIIl[1]];
            iArr10[llIllllIIl[0]] = llIllllIIl[23];
            if (lIlllIlIllllI(Bank.contains(iArr10) ? 1 : 0)) {
                int[] iArr11 = new int[llIllllIIl[1]];
                iArr11[llIllllIIl[0]] = llIllllIIl[23];
            }
            int[] iArr12 = new int[llIllllIIl[1]];
            iArr12[llIllllIIl[0]] = llIllllIIl[185];
            if (!lIlllIlIllllI(Bank.contains(iArr12) ? 1 : 0)) {
                int[] iArr13 = new int[llIllllIIl[1]];
                iArr13[llIllllIIl[0]] = llIllllIIl[5];
                if (lIlllIlIllllI(Equipment.contains(iArr13) ? 1 : 0)) {
                    int[] iArr14 = new int[llIllllIIl[1]];
                    iArr14[llIllllIIl[0]] = llIllllIIl[5];
                    if (lIlllIlIllllI(Inventory.contains(iArr14) ? 1 : 0)) {
                        C0000a.a(llIllllIIl[5], llIllllIIl[1]);
                        Time.sleepTicks(llIllllIIl[1]);
                        "".length();
                    }
                }
                int[] iArr15 = new int[llIllllIIl[1]];
                iArr15[llIllllIIl[0]] = llIllllIIl[6];
                if (lIlllIlIllllI(Equipment.contains(iArr15) ? 1 : 0)) {
                    int[] iArr16 = new int[llIllllIIl[1]];
                    iArr16[llIllllIIl[0]] = llIllllIIl[6];
                    if (lIlllIlIllllI(Inventory.contains(iArr16) ? 1 : 0)) {
                        C0000a.a(llIllllIIl[6], llIllllIIl[1]);
                        Time.sleepTicks(llIllllIIl[1]);
                        "".length();
                    }
                }
                if (lIlllIlIllllI(Equipment.contains(C0019f.bk) ? 1 : 0) && lIlllIlIllllI(Inventory.contains(C0019f.bk) ? 1 : 0)) {
                    C0000a.b(C0019f.bk, llIllllIIl[1]);
                    Time.sleepTicks(llIllllIIl[1]);
                    "".length();
                }
                if (lIlllIlIllllI(Equipment.contains(C0019f.aW) ? 1 : 0) && lIlllIlIllllI(Inventory.contains(C0019f.aW) ? 1 : 0)) {
                    C0000a.b(C0019f.aW, llIllllIIl[1]);
                    Time.sleepTicks(llIllllIIl[1]);
                    "".length();
                }
                int[] iArr17 = new int[llIllllIIl[1]];
                iArr17[llIllllIIl[0]] = llIllllIIl[7];
                if (lIlllIlIllllI(Equipment.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIllllIIl[1]];
                    iArr18[llIllllIIl[0]] = llIllllIIl[7];
                    if (lIlllIlIllllI(Inventory.contains(iArr18) ? 1 : 0)) {
                        C0000a.a(llIllllIIl[7], llIllllIIl[1]);
                        Time.sleepTicks(llIllllIIl[1]);
                        "".length();
                    }
                }
                int[] iArr19 = new int[llIllllIIl[1]];
                iArr19[llIllllIIl[0]] = llIllllIIl[8];
                if (lIlllIlIllllI(Equipment.contains(iArr19) ? 1 : 0)) {
                    int[] iArr20 = new int[llIllllIIl[1]];
                    iArr20[llIllllIIl[0]] = llIllllIIl[8];
                    if (lIlllIlIllllI(Inventory.contains(iArr20) ? 1 : 0)) {
                        C0000a.a(llIllllIIl[8], llIllllIIl[1]);
                        Time.sleepTicks(llIllllIIl[1]);
                        "".length();
                    }
                }
                int[] iArr21 = new int[llIllllIIl[1]];
                iArr21[llIllllIIl[0]] = llIllllIIl[21];
                if (lIlllIlIllllI(Inventory.contains(iArr21) ? 1 : 0)) {
                    C0000a.a(llIllllIIl[21], llIllllIIl[1]);
                    Time.sleepTicks(llIllllIIl[1]);
                    "".length();
                }
                int[] iArr22 = new int[llIllllIIl[1]];
                iArr22[llIllllIIl[0]] = llIllllIIl[22];
                if (lIlllIlIllllI(Inventory.contains(iArr22) ? 1 : 0)) {
                    C0000a.a(llIllllIIl[22], llIllllIIl[1]);
                    Time.sleepTicks(llIllllIIl[1]);
                    "".length();
                }
                int[] iArr23 = new int[llIllllIIl[1]];
                iArr23[llIllllIIl[0]] = llIllllIIl[23];
                if (lIlllIlIllllI(Inventory.contains(iArr23) ? 1 : 0)) {
                    C0000a.a(llIllllIIl[23], llIllllIIl[1]);
                    Time.sleepTicks(llIllllIIl[1]);
                    "".length();
                }
                if (lIlllIlIlllIl(Skills.getBoostedLevel(Skill.HITPOINTS), nK)) {
                    int[] iArr24 = new int[llIllllIIl[1]];
                    iArr24[llIllllIIl[0]] = nJ;
                    if (lIlllIlIllllI(Inventory.contains(iArr24) ? 1 : 0)) {
                        C0000a.a(nJ, llIllllIIl[10]);
                        Time.sleepTicks(llIllllIIl[1]);
                        "".length();
                    }
                }
                int[] iArr25 = new int[llIllllIIl[1]];
                iArr25[llIllllIIl[0]] = llIllllIIl[9];
                if (lIlllIlIllllI(Inventory.contains(iArr25) ? 1 : 0)) {
                    Bank.withdrawAll(llIllllIIl[9], Bank.WithdrawMode.ITEM);
                    Time.sleepTicks(llIllllIIl[1]);
                    "".length();
                    return;
                }
                return;
            }
            System.out.println(llIlllIlII[llIllllIIl[186]]);
            Q();
            bt = llIllllIIl[1];
        }
    }

    private static boolean lIlllIlIlllIl(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlllIlIlllll(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ae() {
        return llIllllIIl[0];
    }

    private static boolean lIlllIlIlllII(int i) {
        return i != 0;
    }

    private static boolean lIlllIllIIIIl(Object obj) {
        return obj != null;
    }

    private static String lIlllIlIIIIII(String llllllllllllllllllIIIIIIIIlIIlIl, String llllllllllllllllllIIIIIIIIlIIlII) {
        try {
            SecretKeySpec llllllllllllllllllIIIIIIIIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIllllIIl[2], llllllllllllllllllIIIIIIIIlIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIIIIIlIIllI) {
            llllllllllllllllllIIIIIIIIlIIllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x0a79, code lost:
        if (lIlllIlIllllI(net.unethicalite.api.items.Inventory.contains(r0) ? 1 : 0) != false) goto L203;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v501, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void gb() {
        if (lIlllIlIlllII(bt ? 1 : 0)) {
            AccBuilderSotf.c = llIlllIlII[llIllllIIl[0]];
            C0015b.a(bv);
            if (lIlllIlIlllIl(bv.size(), llIllllIIl[1])) {
                System.out.println(llIlllIlII[llIllllIIl[1]]);
                bt = llIllllIIl[0];
            }
        }
        if (lIlllIlIllllI(bt ? 1 : 0)) {
            if (lIlllIlIlllII(GrandExchange.isOpen() ? 1 : 0)) {
                C0015b.g();
            }
            t(nN);
            Predicate predicate = item -> {
                return item.getName().toLowerCase().contains(llIlllIlII[llIllllIIl[274]]);
            };
            if (lIlllIlIlllII(Inventory.contains(predicate) ? 1 : 0)) {
                Inventory.getFirst(predicate).interact(llIlllIlII[llIllllIIl[2]]);
                Time.sleepTicks(llIllllIIl[1]);
                "".length();
            }
            if (lIlllIlIllllI(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIlIllllI(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIlIllllI(an() ? 1 : 0) && lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIllllIIl[3])) {
                Movement.walkTo(C0015b.I);
                "".length();
                Time.sleepTicks(llIllllIIl[1]);
                "".length();
            }
            if (lIlllIlIllllI(an() ? 1 : 0) && lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIllllIIl[3])) {
                gd();
            }
            if (lIlllIlIlllII(an() ? 1 : 0) && lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(C0015b.I), llIllllIIl[4])) {
                l(llIllllIIl[5]);
                l(llIllllIIl[6]);
                l(llIllllIIl[7]);
                l(llIllllIIl[8]);
                b(C0019f.bk);
                b(C0019f.aW);
                int[] iArr = new int[llIllllIIl[1]];
                iArr[llIllllIIl[0]] = llIllllIIl[9];
                if (lIlllIlIlllII(Inventory.contains(iArr) ? 1 : 0)) {
                    Time.sleepTicks(C0018e.c(llIllllIIl[10], llIllllIIl[11]));
                    "".length();
                    int[] iArr2 = new int[llIllllIIl[1]];
                    iArr2[llIllllIIl[0]] = llIllllIIl[9];
                    Inventory.getFirst(iArr2).interact(llIlllIlII[llIllllIIl[10]]);
                    Time.sleepUntil(() -> {
                        return nL.contains(Players.getLocal().getWorldLocation());
                    }, llIllllIIl[12]);
                    "".length();
                    mV = llIllllIIl[0];
                }
            }
            if (lIlllIlIllllI(an() ? 1 : 0) && (!lIlllIlIllllI(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) || lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(nQ), llIllllIIl[13]))) {
                if (lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIllllIIl[14])) {
                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[11]];
                    String[] strArr = new String[llIllllIIl[1]];
                    strArr[llIllllIIl[0]] = llIlllIlII[llIllllIIl[14]];
                    if (lIlllIllIIIIl(NPCs.getNearest(strArr))) {
                        String[] strArr2 = new String[llIllllIIl[1]];
                        strArr2[llIllllIIl[0]] = llIlllIlII[llIllllIIl[15]];
                        TileObjects.getNearest(strArr2).interact(llIlllIlII[llIllllIIl[3]]);
                        Time.sleepTicks(llIllllIIl[11]);
                        "".length();
                    }
                    String[] strArr3 = new String[llIllllIIl[1]];
                    strArr3[llIllllIIl[0]] = llIlllIlII[llIllllIIl[16]];
                    if (lIlllIllIIIlI(NPCs.getNearest(strArr3)) && lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIllllIIl[14])) {
                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[17]];
                        Movement.walkTo(D.fa);
                        "".length();
                        Time.sleepTicks(llIllllIIl[1]);
                        "".length();
                    }
                }
                if (lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIllllIIl[14])) {
                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[18]];
                    if (lIlllIlIllllI(Bank.isOpen() ? 1 : 0)) {
                        int[] iArr3 = new int[llIllllIIl[1]];
                        iArr3[llIllllIIl[0]] = llIllllIIl[19];
                        TileObjects.getNearest(iArr3).interact(llIlllIlII[llIllllIIl[20]]);
                        Time.sleepTicks(llIllllIIl[2]);
                        "".length();
                    }
                    if (lIlllIlIlllII(Bank.isOpen() ? 1 : 0) && lIlllIllIIIll(Inventory.getAll().size())) {
                        Bank.depositInventory();
                        Time.sleepTicks(llIllllIIl[1]);
                        "".length();
                    }
                    int[] iArr4 = new int[llIllllIIl[1]];
                    iArr4[llIllllIIl[0]] = llIllllIIl[7];
                    if (lIlllIlIllllI(Equipment.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIllllIIl[1]];
                        iArr5[llIllllIIl[0]] = llIllllIIl[7];
                        if (lIlllIlIllllI(Inventory.contains(iArr5) ? 1 : 0)) {
                            C0000a.a(llIllllIIl[7], llIllllIIl[1]);
                        }
                    }
                    int[] iArr6 = new int[llIllllIIl[1]];
                    iArr6[llIllllIIl[0]] = llIllllIIl[8];
                    if (lIlllIlIllllI(Equipment.contains(iArr6) ? 1 : 0)) {
                        int[] iArr7 = new int[llIllllIIl[1]];
                        iArr7[llIllllIIl[0]] = llIllllIIl[8];
                        if (lIlllIlIllllI(Inventory.contains(iArr7) ? 1 : 0)) {
                            C0000a.a(llIllllIIl[8], llIllllIIl[1]);
                        }
                    }
                    int[] iArr8 = new int[llIllllIIl[1]];
                    iArr8[llIllllIIl[0]] = llIllllIIl[21];
                    if (lIlllIlIllllI(Inventory.contains(iArr8) ? 1 : 0)) {
                        C0000a.a(llIllllIIl[21], llIllllIIl[1]);
                    }
                    int[] iArr9 = new int[llIllllIIl[1]];
                    iArr9[llIllllIIl[0]] = llIllllIIl[22];
                    if (lIlllIlIllllI(Inventory.contains(iArr9) ? 1 : 0)) {
                        C0000a.a(llIllllIIl[22], llIllllIIl[1]);
                    }
                    int[] iArr10 = new int[llIllllIIl[1]];
                    iArr10[llIllllIIl[0]] = llIllllIIl[23];
                    if (lIlllIlIllllI(Inventory.contains(iArr10) ? 1 : 0)) {
                        C0000a.a(llIllllIIl[23], llIllllIIl[1]);
                    }
                    if (lIlllIlIlllIl(Skills.getBoostedLevel(Skill.HITPOINTS), nK)) {
                        int[] iArr11 = new int[llIllllIIl[1]];
                        iArr11[llIllllIIl[0]] = nJ;
                        if (lIlllIlIllllI(Inventory.contains(iArr11) ? 1 : 0)) {
                            C0000a.a(nJ, llIllllIIl[11]);
                        }
                    }
                    int[] iArr12 = new int[llIllllIIl[1]];
                    iArr12[llIllllIIl[0]] = llIllllIIl[9];
                    if (lIlllIlIllllI(Inventory.contains(iArr12) ? 1 : 0)) {
                        Bank.withdrawAll(llIllllIIl[9], Bank.WithdrawMode.ITEM);
                    }
                }
            }
            if (lIlllIlIlllII(an() ? 1 : 0)) {
                l(llIllllIIl[5]);
                l(llIllllIIl[6]);
                l(llIllllIIl[7]);
                l(llIllllIIl[8]);
                b(C0019f.bk);
                b(C0019f.aW);
                String[] strArr4 = new String[llIllllIIl[1]];
                strArr4[llIllllIIl[0]] = llIlllIlII[llIllllIIl[24]];
                if (lIlllIlIlllII(Inventory.contains(strArr4) ? 1 : 0)) {
                    String[] strArr5 = new String[llIllllIIl[1]];
                    strArr5[llIllllIIl[0]] = llIlllIlII[llIllllIIl[25]];
                    Inventory.getFirst(strArr5).interact(llIlllIlII[llIllllIIl[26]]);
                }
                if (lIlllIlIlllII(Inventory.contains(C0019f.ba) ? 1 : 0) && lIlllIlIlllIl(Movement.getRunEnergy(), llIllllIIl[27])) {
                    Inventory.getFirst(C0019f.ba).interact(llIlllIlII[llIllllIIl[28]]);
                    Time.sleepTicks(llIllllIIl[1]);
                    "".length();
                }
                if (lIlllIlIlllll(Movement.getRunEnergy(), llIllllIIl[29]) && lIlllIlIllllI(Movement.isRunEnabled() ? 1 : 0)) {
                    Movement.toggleRun();
                }
                t(nN);
                Predicate predicate2 = item2 -> {
                    return item2.getName().toLowerCase().contains(llIlllIlII[llIllllIIl[273]]);
                };
                if (lIlllIlIlllII(Inventory.contains(predicate2) ? 1 : 0)) {
                    Inventory.getFirst(predicate2).interact(llIlllIlII[llIllllIIl[30]]);
                    Time.sleepTicks(llIllllIIl[1]);
                    "".length();
                }
                if (lIlllIlIlllII(nO.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr6 = new String[llIllllIIl[1]];
                    strArr6[llIllllIIl[0]] = llIlllIlII[llIllllIIl[31]];
                    if (lIlllIlIllllI(Inventory.contains(strArr6) ? 1 : 0) && lIlllIlIllllI(Inventory.contains(predicate2) ? 1 : 0)) {
                        if (lIlllIlIlllIl(cG, llIllllIIl[1]) && lIlllIllIIlII(Movement.getRunEnergy(), llIllllIIl[29])) {
                            Movement.toggleRun();
                            cG += llIllllIIl[1];
                        }
                        if (lIlllIllIIlII(Skills.getBoostedLevel(Skill.HITPOINTS), nK)) {
                            if (lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(nP), llIllllIIl[16])) {
                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[32]];
                                if (lIlllIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo(nP);
                                "".length();
                                Time.sleepTicks(llIllllIIl[1]);
                                "".length();
                            }
                            if (lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(nP), llIllllIIl[16])) {
                                Time.sleepTicks(llIllllIIl[2]);
                                "".length();
                                if (lIlllIlIllllI(Dialog.isOpen() ? 1 : 0) && lIlllIlIllllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                    String[] strArr7 = new String[llIllllIIl[1]];
                                    strArr7[llIllllIIl[0]] = llIlllIlII[llIllllIIl[33]];
                                    if (lIlllIlIllllI(Inventory.contains(strArr7) ? 1 : 0) && lIlllIlIllllI(Inventory.contains(predicate2) ? 1 : 0) && lIlllIlIlllII(Widgets.get(llIllllIIl[34]).isEmpty() ? 1 : 0) && lIlllIlIllllI(Vars.getBit(llIllllIIl[35]))) {
                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[36]];
                                        int[] iArr13 = new int[llIllllIIl[1]];
                                        iArr13[llIllllIIl[0]] = llIllllIIl[37];
                                        NPC nearest = NPCs.getNearest(iArr13);
                                        if (lIlllIllIIIIl(nearest) && lIlllIlIllllI(Dialog.isOpen() ? 1 : 0)) {
                                            nearest.interact(llIlllIlII[llIllllIIl[38]]);
                                            Time.sleepTicks(llIllllIIl[10]);
                                            "".length();
                                        }
                                        C0020g.a(new String[llIllllIIl[0]]);
                                    }
                                }
                            }
                        }
                        String[] strArr8 = new String[llIllllIIl[1]];
                        strArr8[llIllllIIl[0]] = llIlllIlII[llIllllIIl[39]];
                        C0020g.a(strArr8);
                    }
                }
                if (lIlllIlIlllII(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    String[] strArr9 = new String[llIllllIIl[1]];
                    strArr9[llIllllIIl[0]] = llIlllIlII[llIllllIIl[40]];
                    if (lIlllIlIllllI(Inventory.contains(strArr9) ? 1 : 0) && lIlllIlIllllI(Inventory.contains(predicate2) ? 1 : 0)) {
                        if (lIlllIllIIlII(Skills.getBoostedLevel(Skill.HITPOINTS), nK)) {
                            if (lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(nI), llIllllIIl[16])) {
                                AccBuilderSotf.c = llIlllIlII[llIllllIIl[41]];
                                if (lIlllIlIlllII(Dialog.isOpen() ? 1 : 0)) {
                                    Dialog.close();
                                }
                                Movement.walkTo(nI);
                                "".length();
                                Time.sleepTicks(llIllllIIl[1]);
                                "".length();
                            }
                            Time.sleepTicks(llIllllIIl[2]);
                            "".length();
                            if (lIlllIlIllllI(Dialog.isOpen() ? 1 : 0) && lIlllIlIllllI(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
                                String[] strArr10 = new String[llIllllIIl[1]];
                                strArr10[llIllllIIl[0]] = llIlllIlII[llIllllIIl[29]];
                                if (lIlllIlIllllI(Inventory.contains(strArr10) ? 1 : 0) && lIlllIlIllllI(Inventory.contains(predicate2) ? 1 : 0)) {
                                    if (lIlllIlIlllIl(cG, llIllllIIl[1]) && lIlllIllIIlII(Movement.getRunEnergy(), llIllllIIl[29])) {
                                        Movement.toggleRun();
                                        cG += llIllllIIl[1];
                                    }
                                    if (lIlllIllIIIlI(Widgets.get(llIllllIIl[34], llIllllIIl[24]))) {
                                        AccBuilderSotf.c = llIlllIlII[llIllllIIl[42]];
                                        int[] iArr14 = new int[llIllllIIl[1]];
                                        iArr14[llIllllIIl[0]] = llIllllIIl[43];
                                        NPC nearest2 = NPCs.getNearest(iArr14);
                                        if (lIlllIllIIIIl(nearest2) && lIlllIlIllllI(Dialog.isOpen() ? 1 : 0) && lIlllIlIllllI(Vars.getBit(llIllllIIl[35]))) {
                                            nearest2.interact(llIlllIlII[llIllllIIl[44]]);
                                            Time.sleepTicks(llIllllIIl[10]);
                                            "".length();
                                        }
                                        C0020g.a(new String[llIllllIIl[0]]);
                                        Time.sleepTicks(llIllllIIl[2]);
                                        "".length();
                                    }
                                }
                            }
                        }
                        C0020g.a(new String[llIllllIIl[0]]);
                    }
                }
                try {
                    gc();
                    "".length();
                    if ((((16 ^ 26) ^ (227 ^ 173)) & (((((43 + 20) - (-87)) + 100) ^ (((35 + 58) - (-57)) + 40)) ^ (-" ".length()))) != 0) {
                        return;
                    }
                } catch (Exception e) {
                    System.out.println(e.getStackTrace());
                    System.out.println(e.getCause());
                    e.printStackTrace();
                }
            }
            if (lIlllIlIlllIl(Skills.getBoostedLevel(Skill.HITPOINTS), nK)) {
                int[] iArr15 = new int[llIllllIIl[1]];
                iArr15[llIllllIIl[0]] = nJ;
                if (lIlllIlIlllII(Inventory.contains(iArr15) ? 1 : 0)) {
                    String[] strArr11 = new String[llIllllIIl[1]];
                    strArr11[llIllllIIl[0]] = llIlllIlII[llIllllIIl[45]];
                    if (lIlllIlIlllII(Inventory.contains(strArr11) ? 1 : 0)) {
                        int[] iArr16 = new int[llIllllIIl[1]];
                        iArr16[llIllllIIl[0]] = llIllllIIl[22];
                        if (lIlllIlIlllII(Inventory.contains(iArr16) ? 1 : 0)) {
                            String[] strArr12 = new String[llIllllIIl[1]];
                            strArr12[llIllllIIl[0]] = llIlllIlII[llIllllIIl[46]];
                        }
                    }
                }
                if (lIlllIlIlllII(nL.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && lIlllIlIlllll(Players.getLocal().getWorldLocation().distanceTo(nQ), llIllllIIl[28])) {
                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[4]];
                    Movement.walkTo(nQ);
                    "".length();
                }
                if (lIlllIlIlllII(nM.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[47]];
                    Movement.walkTo(BankLocation.BURGH_DE_ROTT_BANK);
                    "".length();
                }
                if (lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(D.fa), llIllllIIl[18])) {
                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[48]];
                    gd();
                }
                if (lIlllIllIIIII(Players.getLocal().getWorldLocation().distanceTo(nQ), llIllllIIl[28])) {
                    AccBuilderSotf.c = llIlllIlII[llIllllIIl[49]];
                    gd();
                }
            }
            if (lIlllIlIlllIl(Skills.getBoostedLevel(Skill.HITPOINTS), nK)) {
                int[] iArr17 = new int[llIllllIIl[1]];
                iArr17[llIllllIIl[0]] = nJ;
                if (lIlllIlIlllII(Inventory.contains(iArr17) ? 1 : 0)) {
                    int[] iArr18 = new int[llIllllIIl[1]];
                    iArr18[llIllllIIl[0]] = nJ;
                    Inventory.getFirst(iArr18).interact(llIlllIlII[llIllllIIl[50]]);
                    Time.sleepTicks(llIllllIIl[1]);
                    "".length();
                }
            }
            int[] iArr19 = new int[llIllllIIl[1]];
            iArr19[llIllllIIl[0]] = llIllllIIl[51];
            if (lIlllIlIlllII(Inventory.contains(iArr19) ? 1 : 0)) {
                int[] iArr20 = new int[llIllllIIl[1]];
                iArr20[llIllllIIl[0]] = llIllllIIl[51];
                Inventory.getAll(iArr20).stream().forEach(item3 -> {
                    item3.interact(llIlllIlII[llIllllIIl[272]]);
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f5, code lost:
        if (lIlllIlIlllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0135, code lost:
        if (lIlllIlIlllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0043, code lost:
        if (lIlllIlIlllII(net.unethicalite.api.items.Equipment.contains(r0) ? 1 : 0) != false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean an() {
        String[] strArr = new String[llIllllIIl[1]];
        strArr[llIllllIIl[0]] = llIlllIlII[llIllllIIl[187]];
        if (lIlllIlIllllI(Inventory.contains(strArr) ? 1 : 0)) {
            String[] strArr2 = new String[llIllllIIl[1]];
            strArr2[llIllllIIl[0]] = llIlllIlII[llIllllIIl[188]];
        }
        int[] iArr = new int[llIllllIIl[1]];
        iArr[llIllllIIl[0]] = llIllllIIl[8];
        if (lIlllIlIllllI(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIllllIIl[1]];
            iArr2[llIllllIIl[0]] = llIllllIIl[8];
            if (lIlllIlIllllI(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIllllIIl[1]];
                iArr3[llIllllIIl[0]] = llIllllIIl[189];
                if (lIlllIlIllllI(Inventory.contains(iArr3) ? 1 : 0)) {
                    int[] iArr4 = new int[llIllllIIl[1]];
                    iArr4[llIllllIIl[0]] = llIllllIIl[189];
                    if (lIlllIlIllllI(Equipment.contains(iArr4) ? 1 : 0)) {
                        int[] iArr5 = new int[llIllllIIl[1]];
                        iArr5[llIllllIIl[0]] = llIllllIIl[190];
                        if (lIlllIlIllllI(Inventory.contains(iArr5) ? 1 : 0)) {
                            int[] iArr6 = new int[llIllllIIl[1]];
                            iArr6[llIllllIIl[0]] = llIllllIIl[190];
                        }
                    }
                }
            }
        }
        int[] iArr7 = new int[llIllllIIl[1]];
        iArr7[llIllllIIl[0]] = llIllllIIl[22];
        if (lIlllIlIllllI(Inventory.contains(iArr7) ? 1 : 0)) {
            String[] strArr3 = new String[llIllllIIl[1]];
            strArr3[llIllllIIl[0]] = llIlllIlII[llIllllIIl[191]];
        }
        int[] iArr8 = new int[llIllllIIl[1]];
        iArr8[llIllllIIl[0]] = llIllllIIl[23];
        if (lIlllIlIlllII(Inventory.contains(iArr8) ? 1 : 0)) {
            int[] iArr9 = new int[llIllllIIl[1]];
            iArr9[llIllllIIl[0]] = llIllllIIl[9];
            if (lIlllIlIlllII(Inventory.contains(iArr9) ? 1 : 0)) {
                ?? r0 = llIllllIIl[1];
                "".length();
                return ((47 ^ 64) ^ (23 ^ 124)) < 0 ? ((((135 + 222) - 200) + 74) ^ (((41 + 139) - 160) + 176)) & (((90 ^ 86) ^ (89 ^ 118)) ^ (-" ".length())) : r0;
            }
        }
        return llIllllIIl[0];
    }

    public static void t(String str) {
        String[] strArr = new String[llIllllIIl[1]];
        strArr[llIllllIIl[0]] = llIlllIlII[llIllllIIl[206]];
        if (lIlllIlIlllII(Inventory.contains(strArr) ? 1 : 0)) {
            mV = llIllllIIl[0];
            AccBuilderSotf.c = llIlllIlII[llIllllIIl[207]];
            String[] strArr2 = new String[llIllllIIl[1]];
            strArr2[llIllllIIl[0]] = llIlllIlII[llIllllIIl[208]];
            Inventory.getFirst(strArr2).interact(llIlllIlII[llIllllIIl[209]]);
            Time.sleepTicks(llIllllIIl[10]);
            "".length();
            if (!lIlllIllIIIlI(Widgets.get(llIllllIIl[210], llIllllIIl[15])) || lIlllIlIllllI(Widgets.get(llIllllIIl[210]).isEmpty() ? 1 : 0)) {
                AccBuilderSotf.c = llIlllIlII[llIllllIIl[211]];
                if (lIlllIlIlllII(str.contains(llIlllIlII[llIllllIIl[212]]) ? 1 : 0)) {
                    Widget widget = Widgets.get(llIllllIIl[210], llIllllIIl[15]);
                    if (lIlllIllIIIIl(widget)) {
                        Time.sleepTicks(llIllllIIl[2]);
                        "".length();
                        widget.getChild(llIllllIIl[3]).interact(llIlllIlII[llIllllIIl[213]]);
                        Time.sleepTicks(llIllllIIl[1]);
                        "".length();
                    }
                }
                if (lIlllIlIlllII(str.contains(llIlllIlII[llIllllIIl[214]]) ? 1 : 0)) {
                    Widget widget2 = Widgets.get(llIllllIIl[210], llIllllIIl[15]);
                    if (lIlllIllIIIIl(widget2)) {
                        Time.sleepTicks(llIllllIIl[2]);
                        "".length();
                        widget2.getChild(llIllllIIl[1]).interact(llIlllIlII[llIllllIIl[215]]);
                        Time.sleepTicks(C0018e.c(llIllllIIl[10], llIllllIIl[11]));
                        "".length();
                    }
                }
                if (lIlllIlIlllII(str.contains(llIlllIlII[llIllllIIl[216]]) ? 1 : 0)) {
                    Widget widget3 = Widgets.get(llIllllIIl[210], llIllllIIl[15]);
                    if (lIlllIllIIIIl(widget3)) {
                        Time.sleepTicks(llIllllIIl[2]);
                        "".length();
                        widget3.getChild(llIllllIIl[0]).interact(llIlllIlII[llIllllIIl[217]]);
                        Time.sleepTicks(C0018e.c(llIllllIIl[10], llIllllIIl[11]));
                        "".length();
                    }
                }
                if (lIlllIlIlllII(str.contains(llIlllIlII[llIllllIIl[218]]) ? 1 : 0)) {
                    Widget widget4 = Widgets.get(llIllllIIl[210], llIllllIIl[15]);
                    if (lIlllIllIIIIl(widget4)) {
                        Time.sleepTicks(llIllllIIl[2]);
                        "".length();
                        widget4.getChild(llIllllIIl[2]).interact(llIlllIlII[llIllllIIl[219]]);
                        Time.sleepTicks(C0018e.c(llIllllIIl[10], llIllllIIl[11]));
                        "".length();
                    }
                }
                if (lIlllIlIlllII(str.contains(llIlllIlII[llIllllIIl[220]]) ? 1 : 0)) {
                    Widget widget5 = Widgets.get(llIllllIIl[210], llIllllIIl[15]);
                    if (lIlllIllIIIIl(widget5)) {
                        Time.sleepTicks(llIllllIIl[2]);
                        "".length();
                        widget5.getChild(llIllllIIl[10]).interact(llIlllIlII[llIllllIIl[221]]);
                        Time.sleepTicks(C0018e.c(llIllllIIl[10], llIllllIIl[11]));
                        "".length();
                    }
                }
                if (lIlllIlIlllII(str.contains(llIlllIlII[llIllllIIl[222]]) ? 1 : 0)) {
                    Widget widget6 = Widgets.get(llIllllIIl[210], llIllllIIl[15]);
                    if (lIlllIllIIIIl(widget6)) {
                        Time.sleepTicks(llIllllIIl[2]);
                        "".length();
                        widget6.getChild(llIllllIIl[11]).interact(llIlllIlII[llIllllIIl[223]]);
                        Time.sleepTicks(C0018e.c(llIllllIIl[10], llIllllIIl[11]));
                        "".length();
                    }
                }
                AccBuilderSotf.c = llIlllIlII[llIllllIIl[224]];
                Widget fromId = Widgets.fromId(llIllllIIl[225]);
                if (lIlllIllIIIIl(fromId) && lIlllIlIlllII(fromId.isVisible() ? 1 : 0)) {
                    Time.sleepTick();
                    "".length();
                    fromId.interact(llIlllIlII[llIllllIIl[226]]);
                    Time.sleepTicks(llIllllIIl[2]);
                    "".length();
                }
            }
        }
        Predicate predicate = item -> {
            return item.getName().toLowerCase().contains(llIlllIlII[llIllllIIl[250]]);
        };
        if (lIlllIlIlllII(Inventory.contains(predicate) ? 1 : 0)) {
            Inventory.getFirst(predicate).interact(llIlllIlII[llIllllIIl[227]]);
            Time.sleepTicks(llIllllIIl[1]);
            "".length();
        }
    }

    public static List<WorldPoint> a(WorldPoint worldPoint, int i, List<WorldPoint> list) {
        PriorityQueue priorityQueue = new PriorityQueue();
        ArrayList arrayList = new ArrayList();
        priorityQueue.add(new aM(worldPoint, null, llIllllIIl[0], d(worldPoint.getY(), i)));
        "".length();
        while (lIlllIlIllllI(priorityQueue.isEmpty() ? 1 : 0)) {
            aM aMVar = (aM) priorityQueue.poll();
            if (lIlllIllIlIII(aMVar.nT.getY(), i)) {
                return a(aMVar);
            }
            arrayList.add(aMVar);
            "".length();
            for (aM aMVar2 : a(aMVar, list)) {
                int llllllllllllllllllIIIIIIIlIlllll = aMVar.nV + llIllllIIl[1];
                if (lIlllIlIlllII(b(aMVar2, arrayList) ? 1 : 0)) {
                    "".length();
                    if ((((((142 + 2) - 26) + 28) ^ (((107 + 179) - 277) + 184)) & (((((42 + 202) - 28) + 25) ^ (((106 + 27) - 113) + 142)) ^ (-" ".length()))) > "  ".length()) {
                        return null;
                    }
                } else {
                    if (!lIlllIlIlllII(a(aMVar2, priorityQueue) ? 1 : 0) || lIlllIlIlllIl(llllllllllllllllllIIIIIIIlIlllll, aMVar2.nV)) {
                        priorityQueue.add(aMVar2);
                        "".length();
                    }
                    "".length();
                    if (!((true ^ true) ^ (true ^ true))) {
                        return null;
                    }
                }
            }
            "".length();
            if (" ".length() >= ((111 ^ 12) ^ (51 ^ 84))) {
                return null;
            }
        }
        return Collections.emptyList();
    }

    private static void lIlllIlIllIll() {
        llIllllIIl = new int[292];
        llIllllIIl[0] = (210 ^ 198) & ((3 ^ 23) ^ (-1));
        llIllllIIl[1] = " ".length();
        llIllllIIl[2] = "  ".length();
        llIllllIIl[3] = (221 ^ 190) ^ (41 ^ 77);
        llIllllIIl[4] = (87 ^ 72) ^ " ".length();
        llIllllIIl[5] = (-12821) & 13981;
        llIllllIIl[6] = (-((-2381) & 20479)) & (-4098) & 32759;
        llIllllIIl[7] = (-(((44 + 97) - 103) + 167)) & (-33) & 21245;
        llIllllIIl[8] = (-11145) & 12223;
        llIllllIIl[9] = (-577) & 20195;
        llIllllIIl[10] = "   ".length();
        llIllllIIl[11] = (171 ^ 149) ^ (99 ^ 89);
        llIllllIIl[12] = (-22153) & 30652;
        llIllllIIl[13] = 126 ^ 26;
        llIllllIIl[14] = 145 ^ 148;
        llIllllIIl[15] = (0 ^ 11) ^ (76 ^ 65);
        llIllllIIl[16] = 37 ^ 45;
        llIllllIIl[17] = 117 ^ 124;
        llIllllIIl[18] = 47 ^ 37;
        llIllllIIl[19] = (-1545) & 14303;
        llIllllIIl[20] = (110 ^ 71) ^ (102 ^ 68);
        llIllllIIl[21] = (-17422) & 18367;
        llIllllIIl[22] = (-27193) & 28543;
        llIllllIIl[23] = (-8261) & 10607;
        llIllllIIl[24] = (((53 + 97) - 91) + 129) ^ (((168 + 93) - 234) + 149);
        llIllllIIl[25] = 91 ^ 86;
        llIllllIIl[26] = 48 ^ 62;
        llIllllIIl[27] = 87 ^ 101;
        llIllllIIl[28] = 127 ^ 112;
        llIllllIIl[29] = (((68 + 46) - 28) + 86) ^ (((53 + 96) - 54) + 86);
        llIllllIIl[30] = 111 ^ 127;
        llIllllIIl[31] = (((42 + 137) - 131) + 118) ^ (((93 + 96) - 121) + 115);
        llIllllIIl[32] = (71 ^ 44) ^ (1 ^ 120);
        llIllllIIl[33] = 212 ^ 199;
        llIllllIIl[34] = (-((-18179) & 32647)) & (-16385) & 31181;
        llIllllIIl[35] = (-(208 ^ 145)) & (-16641) & 23423;
        llIllllIIl[36] = 164 ^ 176;
        llIllllIIl[37] = (-((-25606) & 32167)) & (-1) & 8127;
        llIllllIIl[38] = (((144 + 19) - 110) + 137) ^ (((79 + 114) - 136) + 114);
        llIllllIIl[39] = (52 ^ 4) ^ (163 ^ 133);
        llIllllIIl[40] = 152 ^ 143;
        llIllllIIl[41] = (((130 + 101) - 57) + 2) ^ (((16 + 14) - (-81)) + 57);
        llIllllIIl[42] = 86 ^ 76;
        llIllllIIl[43] = (-((-365) & 10749)) & (-261) & 12221;
        llIllllIIl[44] = (((56 + 100) - 37) + 101) ^ (((117 + 5) - (-1)) + 76);
        llIllllIIl[45] = 141 ^ 145;
        llIllllIIl[46] = 107 ^ 118;
        llIllllIIl[47] = (90 ^ 19) ^ (221 ^ 139);
        llIllllIIl[48] = 231 ^ 199;
        llIllllIIl[49] = 26 ^ 59;
        llIllllIIl[50] = 49 ^ 19;
        llIllllIIl[51] = (-((-2877) & 27453)) & (-5201) & 32735;
        llIllllIIl[52] = (((31 + 126) - 0) + 16) ^ (((58 + 9) - (-2)) + 73);
        llIllllIIl[53] = (216 ^ 144) ^ (0 ^ 108);
        llIllllIIl[54] = (-31009) & 31608;
        llIllllIIl[55] = (-((-2113) & 23123)) & (-2) & 24511;
        llIllllIIl[56] = (67 ^ 27) ^ (251 ^ 134);
        llIllllIIl[57] = (((131 + 120) - 104) + 42) ^ (((123 + 148) - 129) + 13);
        llIllllIIl[58] = 130 ^ 165;
        llIllllIIl[59] = (79 ^ 2) ^ (23 ^ 114);
        llIllllIIl[60] = 70 ^ 111;
        llIllllIIl[61] = 148 ^ 190;
        llIllllIIl[62] = 84 ^ 127;
        llIllllIIl[63] = (((12 + 91) - (-22)) + 30) ^ (((120 + 112) - 131) + 82);
        llIllllIIl[64] = 98 ^ 79;
        llIllllIIl[65] = (-((-18433) & 31021)) & (-16578) & 32765;
        llIllllIIl[66] = (-((-7586) & 16299)) & (-16387) & 30299;
        llIllllIIl[67] = 2 ^ 44;
        llIllllIIl[68] = 163 ^ 159;
        llIllllIIl[69] = (((144 + 121) - 204) + 93) ^ (((114 + 179) - 173) + 61);
        llIllllIIl[70] = 103 ^ 87;
        llIllllIIl[71] = 148 ^ 165;
        llIllllIIl[72] = 85 ^ 102;
        llIllllIIl[73] = (184 ^ 129) ^ (117 ^ 120);
        llIllllIIl[74] = 53 ^ 0;
        llIllllIIl[75] = 162 ^ 148;
        llIllllIIl[76] = (18 ^ 0) ^ (78 ^ 107);
        llIllllIIl[77] = 252 ^ 196;
        llIllllIIl[78] = (((127 + 101) - 179) + 141) ^ (((20 + 130) - 22) + 7);
        llIllllIIl[79] = (99 ^ 78) ^ (61 ^ 42);
        llIllllIIl[80] = -" ".length();
        llIllllIIl[81] = (183 ^ 192) ^ (219 ^ 151);
        llIllllIIl[82] = 130 ^ 191;
        llIllllIIl[83] = 17 ^ 47;
        llIllllIIl[84] = (248 ^ 132) ^ (234 ^ 169);
        llIllllIIl[85] = 121 ^ 57;
        llIllllIIl[86] = 34 ^ 99;
        llIllllIIl[87] = 57 ^ 123;
        llIllllIIl[88] = 193 ^ 130;
        llIllllIIl[89] = (173 ^ 181) ^ (119 ^ 43);
        llIllllIIl[90] = (81 ^ 98) ^ (103 ^ 17);
        llIllllIIl[91] = (((88 + 117) - 165) + 176) ^ (((15 + 27) - (-6)) + 110);
        llIllllIIl[92] = 101 ^ 34;
        llIllllIIl[93] = 98 ^ 42;
        llIllllIIl[94] = (19 ^ 22) ^ (40 ^ 100);
        llIllllIIl[95] = (((34 + 109) - 46) + 106) ^ (((124 + 39) - 89) + 55);
        llIllllIIl[96] = (116 ^ 122) ^ (64 ^ 5);
        llIllllIIl[97] = (9 ^ 116) ^ (75 ^ 122);
        llIllllIIl[98] = (160 ^ 172) ^ (60 ^ 125);
        llIllllIIl[99] = 237 ^ 163;
        llIllllIIl[100] = 114 ^ 61;
        llIllllIIl[101] = 98 ^ 50;
        llIllllIIl[102] = (75 ^ 15) ^ (151 ^ 130);
        llIllllIIl[103] = 118 ^ 36;
        llIllllIIl[104] = (114 ^ 57) ^ (109 ^ 117);
        llIllllIIl[105] = (238 ^ 189) ^ (58 ^ 61);
        llIllllIIl[106] = (46 ^ 110) ^ (124 ^ 105);
        llIllllIIl[107] = (144 ^ 178) ^ (94 ^ 42);
        llIllllIIl[108] = (((33 + 105) - 90) + 99) ^ (((145 + 185) - 199) + 65);
        llIllllIIl[109] = (224 ^ 131) ^ (119 ^ 76);
        llIllllIIl[110] = (123 ^ 80) ^ (39 ^ 85);
        llIllllIIl[111] = 43 ^ 113;
        llIllllIIl[112] = (121 ^ 9) ^ (184 ^ 147);
        llIllllIIl[113] = (10 ^ 0) ^ (70 ^ 16);
        llIllllIIl[114] = 193 ^ 156;
        llIllllIIl[115] = (118 ^ 50) ^ (143 ^ 149);
        llIllllIIl[116] = 252 ^ 163;
        llIllllIIl[117] = (((28 + 160) - (-28)) + 28) ^ (((61 + 13) - 10) + 84);
        llIllllIIl[118] = 218 ^ 187;
        llIllllIIl[119] = 218 ^ 184;
        llIllllIIl[120] = 32 ^ 67;
        llIllllIIl[121] = (143 ^ 157) ^ (235 ^ 156);
        llIllllIIl[122] = 59 ^ 93;
        llIllllIIl[123] = (227 ^ 146) ^ (55 ^ 33);
        llIllllIIl[124] = (176 ^ 185) ^ (121 ^ 24);
        llIllllIIl[125] = (42 ^ 68) ^ (13 ^ 10);
        llIllllIIl[126] = (54 ^ 30) ^ (49 ^ 115);
        llIllllIIl[127] = 126 ^ 21;
        llIllllIIl[128] = (11 ^ 0) ^ (72 ^ 47);
        llIllllIIl[129] = 234 ^ 135;
        llIllllIIl[130] = 31 ^ 113;
        llIllllIIl[131] = 47 ^ 64;
        llIllllIIl[132] = 233 ^ 153;
        llIllllIIl[133] = 107 ^ 26;
        llIllllIIl[134] = 93 ^ 47;
        llIllllIIl[135] = (((16 + 251) - 201) + 187) ^ (((13 + 75) - 41) + 95);
        llIllllIIl[136] = (((111 + 26) - (-26)) + 47) ^ (((33 + 101) - 99) + 131);
        llIllllIIl[137] = (((186 + 41) - 53) + 56) ^ (((29 + 34) - (-43)) + 41);
        llIllllIIl[138] = (((12 + 64) - 61) + 226) ^ (((63 + 19) - (-13)) + 40);
        llIllllIIl[139] = 93 ^ 42;
        llIllllIIl[140] = (73 ^ 123) ^ (104 ^ 34);
        llIllllIIl[141] = 71 ^ 62;
        llIllllIIl[142] = 219 ^ 161;
        llIllllIIl[143] = (-((-21529) & 24027)) & (-41) & 16383;
        llIllllIIl[144] = 103 ^ 28;
        llIllllIIl[145] = 212 ^ 168;
        llIllllIIl[146] = 222 ^ 163;
        llIllllIIl[147] = 247 ^ 137;
        llIllllIIl[148] = (((178 ^ 149) + (127 ^ 20)) - (193 ^ 137)) + (241 ^ 196);
        llIllllIIl[149] = (((152 ^ 187) + (115 ^ 14)) - (210 ^ 188)) + (192 ^ 142);
        llIllllIIl[150] = (((5 ^ 108) + (89 ^ 17)) - (127 ^ 33)) + (34 ^ 12);
        llIllllIIl[151] = ((7 + 125) - 36) + 34;
        llIllllIIl[152] = (((192 ^ 171) + (224 ^ 154)) - (98 ^ 30)) + (189 ^ 167);
        llIllllIIl[153] = ((117 + 17) - 87) + 85;
        llIllllIIl[154] = (((119 ^ 120) + (123 ^ 52)) - (189 ^ 134)) + (192 ^ 162);
        llIllllIIl[155] = (((197 ^ 148) + (60 ^ 68)) - (((170 + 162) - 330) + 178)) + (219 ^ 170);
        llIllllIIl[156] = (((19 ^ 126) + (89 ^ 114)) - (43 ^ 53)) + (30 ^ 19);
        llIllllIIl[157] = ((39 + 51) - 13) + 59;
        llIllllIIl[158] = (-((-2449) & 20473)) & (-10244) & 32767;
        llIllllIIl[159] = (-10369) & 15868;
        llIllllIIl[160] = ((31 + 2) - (-32)) + 72;
        llIllllIIl[161] = (((5 ^ 84) + (54 ^ 79)) - (209 ^ 132)) + (1 ^ 20);
        llIllllIIl[162] = (((82 ^ 101) + ((125 ^ 115) & ((67 ^ 77) ^ (-1)))) - (161 ^ 177)) + (230 ^ 130);
        llIllllIIl[163] = (((140 ^ 130) + (119 ^ 85)) - (-(120 ^ 69))) + (219 ^ 196);
        llIllllIIl[164] = (((93 ^ 13) + (84 ^ 0)) - (71 ^ 103)) + (206 ^ 199);
        llIllllIIl[165] = (((118 ^ 88) + (160 ^ 194)) - (124 ^ 97)) + (51 ^ 40);
        llIllllIIl[166] = ((124 + 45) - 79) + 53;
        llIllllIIl[167] = (((32 ^ 105) + (90 ^ 79)) - (-(22 ^ 15))) + (129 ^ 152);
        llIllllIIl[168] = (((243 ^ 155) + (17 ^ 59)) - (235 ^ 136)) + (238 ^ 140);
        llIllllIIl[169] = (((48 ^ 105) + (26 ^ 70)) - (((98 + 8) - 79) + 124)) + (73 ^ 61);
        llIllllIIl[170] = (((97 ^ 36) + (65 ^ 89)) - (-(29 ^ 24))) + (106 ^ 91);
        llIllllIIl[171] = ((33 + 117) - 16) + 14;
        llIllllIIl[172] = (((((110 + 80) - 174) + 122) + (22 ^ 53)) - (22 ^ 32)) + (90 ^ 68);
        llIllllIIl[173] = (((72 ^ 9) + (86 ^ 117)) - (217 ^ 137)) + ((18 + 39) - (-48)) + 25;
        llIllllIIl[174] = (((144 ^ 174) + (197 ^ 158)) - (((99 + 94) - 78) + 23)) + ((97 + 103) - 103) + 39;
        llIllllIIl[175] = (((45 ^ 95) + (74 ^ 26)) - (19 ^ 91)) + (124 ^ 98);
        llIllllIIl[176] = (((((110 + 98) - 73) + 1) + (243 ^ 193)) - (222 ^ 190)) + (69 ^ 122);
        llIllllIIl[177] = ((69 + 39) - 46) + 92;
        llIllllIIl[178] = (("   ".length() + "  ".length()) - (-(29 ^ 40))) + (62 ^ 95);
        llIllllIIl[179] = ((59 + 78) - (-9)) + 10;
        llIllllIIl[180] = ((12 + 55) - 42) + 132;
        llIllllIIl[181] = ((1 + 50) - 10) + 117;
        llIllllIIl[182] = (((185 ^ 167) + (30 ^ 44)) - (-(93 ^ 116))) + (162 ^ 132);
        llIllllIIl[183] = ((133 + 136) - 190) + 81;
        llIllllIIl[184] = ((57 + 120) - 160) + 144;
        llIllllIIl[185] = (-((-2154) & 19455)) & (-3) & 20447;
        llIllllIIl[186] = (((((20 + 49) - (-14)) + 76) + (212 ^ 152)) - (103 ^ 43)) + "   ".length();
        llIllllIIl[187] = ((17 + 85) - 45) + 106;
        llIllllIIl[188] = (((173 ^ 144) + (46 ^ 38)) - (-" ".length())) + (58 ^ 100);
        llIllllIIl[189] = (-((-3865) & 16153)) & (-16393) & 32767;
        llIllllIIl[190] = (-((-1145) & 20093)) & (-9235) & 32767;
        llIllllIIl[191] = (((114 ^ 12) + (43 ^ 108)) - (((87 + 58) - 72) + 99)) + ((21 + 58) - (-44)) + 17;
        llIllllIIl[192] = ((27 + 87) - 86) + 138;
        llIllllIIl[193] = (((84 ^ 105) + (70 ^ 67)) - (-(119 ^ 91))) + (74 ^ 115);
        llIllllIIl[194] = (((143 ^ 154) + (61 ^ 51)) - (-(215 ^ 182))) + (182 ^ 146);
        llIllllIIl[195] = ((150 + 79) - 163) + 103;
        llIllllIIl[196] = (((((112 + 125) - 215) + 110) + (29 ^ 20)) - (121 ^ 79)) + (57 ^ 106);
        llIllllIIl[197] = (((((8 + 75) - 68) + 116) + (61 ^ 1)) - (102 ^ 40)) + (133 ^ 191);
        llIllllIIl[198] = (-((-14345) & 16331)) & (-1) & 24543;
        llIllllIIl[199] = (((175 ^ 139) + (112 ^ 0)) - (91 ^ 9)) + (251 ^ 145);
        llIllllIIl[200] = ((152 + 66) - 176) + 131;
        llIllllIIl[201] = (((((124 + 5) - 23) + 35) + (64 ^ 14)) - (232 ^ 131)) + (25 ^ 39);
        llIllllIIl[202] = ((145 + 71) - 98) + 57;
        llIllllIIl[203] = (((144 ^ 131) + (68 ^ 33)) - (-(193 ^ 199))) + (39 ^ 21);
        llIllllIIl[204] = ((65 + 140) - 28) + 0;
        llIllllIIl[205] = (((40 ^ 110) + (140 ^ 128)) - (18 ^ 38)) + ((75 + 98) - 36) + 11;
        llIllllIIl[206] = (((((7 + 67) - 65) + 123) + (45 ^ 30)) - (176 ^ 180)) + ((203 ^ 134) & ((47 ^ 98) ^ (-1)));
        llIllllIIl[207] = (((((8 + 48) - 13) + 99) + (((22 + 78) - (-20)) + 34)) - (((73 + 72) - 3) + 18)) + (13 ^ 33);
        llIllllIIl[208] = ((88 + 46) - 82) + 129;
        llIllllIIl[209] = (((69 ^ 51) + (122 ^ 75)) - (169 ^ 129)) + (135 ^ 176);
        llIllllIIl[210] = (-29314) & 29587;
        llIllllIIl[211] = ((50 + 157) - 149) + 125;
        llIllllIIl[212] = ((76 + 166) - 162) + 104;
        llIllllIIl[213] = (((88 ^ 117) + (145 ^ 136)) - (-(30 ^ 39))) + (29 ^ 39);
        llIllllIIl[214] = ((4 + 142) - (-8)) + 32;
        llIllllIIl[215] = ((108 + 59) - 11) + 31;
        llIllllIIl[216] = ((74 + 58) - 93) + 149;
        llIllllIIl[217] = ((50 + 81) - 91) + 149;
        llIllllIIl[218] = ((154 + 189) - 173) + 20;
        llIllllIIl[219] = (((((162 + 50) - 105) + 63) + (91 ^ 94)) - (((67 + 48) - 42) + 75)) + ((128 + 54) - 161) + 143;
        llIllllIIl[220] = (((((37 + 0) - (-64)) + 50) + (231 ^ 138)) - (250 ^ 174)) + (165 ^ 181);
        llIllllIIl[221] = (((((172 + 3) - 51) + 51) + (136 ^ 194)) - (((113 + 84) - 77) + 72)) + ((89 + 55) - 110) + 102;
        llIllllIIl[222] = (((((10 + 74) - 58) + 145) + (((142 + 64) - 191) + 140)) - ((-29697) & 29985)) + ((74 + 138) - 175) + 120;
        llIllllIIl[223] = ((175 + 53) - 139) + 106;
        llIllllIIl[224] = ((194 + 171) - 189) + 20;
        llIllllIIl[225] = (-((-65) & 32501)) & (-257) & 17989567;
        llIllllIIl[226] = ((155 + 59) - 38) + 21;
        llIllllIIl[227] = (((18 ^ 80) + (131 ^ 146)) - (-(84 ^ 1))) + (41 ^ 55);
        llIllllIIl[228] = (-20483) & 95482;
        llIllllIIl[229] = (-279) & 85278;
        llIllllIIl[230] = (-16417) & 28396;
        llIllllIIl[231] = (-((-10244) & 15959)) & (-2053) & 32767;
        llIllllIIl[232] = (-8249) & 16255;
        llIllllIIl[233] = (-((-1539) & 28235)) & (-1075) & 28670;
        llIllllIIl[234] = (-((-12442) & 30653)) & (-2049) & 32759;
        llIllllIIl[235] = (-16977) & 32476;
        llIllllIIl[236] = (-529) & 828;
        llIllllIIl[237] = (-((-1347) & 19795)) & (-5121) & 24568;
        llIllllIIl[238] = (-2378) & 3577;
        llIllllIIl[239] = (-((-4481) & 22469)) & (-2) & 24189;
        llIllllIIl[240] = (-24598) & 32605;
        llIllllIIl[241] = (-10313) & 11262;
        llIllllIIl[242] = (-((-2467) & 24039)) & (-2595) & 24551;
        llIllllIIl[243] = (-18497) & 20446;
        llIllllIIl[244] = (-((-3241) & 23977)) & (-5) & 32718;
        llIllllIIl[245] = (-((-25857) & 30114)) & (-1) & 30207;
        llIllllIIl[246] = (-2052) & 147051;
        llIllllIIl[247] = (-((-25601) & 26215)) & (-24593) & 190206;
        llIllllIIl[248] = (-((-12675) & 32651)) & (-35) & 32635;
        llIllllIIl[249] = (((112 ^ 59) + (95 ^ 73)) - (99 ^ 35)) + ((124 + 58) - 87) + 71;
        llIllllIIl[250] = ((74 + 190) - 213) + 149;
        llIllllIIl[251] = ((114 + 171) - 259) + 175;
        llIllllIIl[252] = ((134 + 24) - 21) + 65;
        llIllllIIl[253] = ((82 + 15) - 41) + 147;
        llIllllIIl[254] = (((98 ^ 70) + (((123 + 114) - 153) + 76)) - (27 ^ 68)) + (121 ^ 30);
        llIllllIIl[255] = (-17) & 13854;
        llIllllIIl[256] = (((91 ^ 23) + (190 ^ 199)) - (198 ^ 157)) + (235 ^ 136);
        llIllllIIl[257] = (((51 ^ 36) + (12 ^ 83)) - (101 ^ 54)) + ((143 + 13) - 132) + 147;
        llIllllIIl[258] = ((11 + 92) - 33) + 137;
        llIllllIIl[259] = ((154 + 14) - 73) + 113;
        llIllllIIl[260] = (((112 ^ 56) + (156 ^ 138)) - (108 ^ 99)) + ((38 + 79) - 0) + 13;
        llIllllIIl[261] = (((((109 + 28) - 24) + 72) + (108 ^ 93)) - (232 ^ 135)) + (71 ^ 16);
        llIllllIIl[262] = (((((103 + 3) - 30) + 73) + (((58 + 20) - 39) + 125)) - ((-13329) & 13628)) + ((144 + 4) - 146) + 196;
        llIllllIIl[263] = (((9 ^ 85) + (((74 + 97) - 157) + 146)) - (110 ^ 25)) + (234 ^ 165);
        llIllllIIl[264] = (((((113 + 132) - 195) + 89) + (((147 + 130) - 169) + 51)) - (((127 + 161) - 191) + 118)) + ((31 + 68) - 59) + 90;
        llIllllIIl[265] = ((20 + 182) - 30) + 42;
        llIllllIIl[266] = (((245 ^ 129) + (89 ^ 27)) - (((97 + 126) - 88) + 12)) + ((151 + 143) - 245) + 131;
        llIllllIIl[267] = ((165 + 60) - 126) + 117;
        llIllllIIl[268] = (((64 ^ 41) + (123 ^ 113)) - " ".length()) + (26 ^ 125);
        llIllllIIl[269] = (-19169) & 21580512;
        llIllllIIl[270] = ((182 + 80) - 241) + 197;
        llIllllIIl[271] = (((29 ^ 79) + (((26 + 120) - 69) + 62)) - (((121 + 102) - 59) + 29)) + ((46 + 55) - (-86)) + 4;
        llIllllIIl[272] = (((((160 + 16) - 18) + 42) + (167 ^ 138)) - (((95 + 119) - 145) + 61)) + (37 ^ 76);
        llIllllIIl[273] = ((92 + 5) - 45) + 169;
        llIllllIIl[274] = ((29 + 124) - 110) + 179;
        llIllllIIl[275] = (-((-1091) & 30427)) & (-4) & 32763;
        llIllllIIl[276] = (-((-11417) & 32507)) & (-8221) & 32767;
        llIllllIIl[277] = (-((-27018) & 27547)) & (-24709) & 28671;
        llIllllIIl[278] = (-((-21593) & 30298)) & (-65) & 12255;
        llIllllIIl[279] = (-(179 ^ 146)) & (-8257) & 29434;
        llIllllIIl[280] = (-4269) & 7676;
        llIllllIIl[281] = (-25196) & 28651;
        llIllllIIl[282] = (-21041) & 24510;
        llIllllIIl[283] = (-(((34 + 121) - 67) + 41)) & (-773) & 4095;
        llIllllIIl[284] = ((187 + 218) - 367) + 185;
        llIllllIIl[285] = (-((-1795) & 5995)) & (-24582) & 32253;
        llIllllIIl[286] = (-((-22725) & 31687)) & (-20609) & 32767;
        llIllllIIl[287] = (-613) & 4093;
        llIllllIIl[288] = (-((-23342) & 31551)) & (-21001) & 32447;
        llIllllIIl[289] = (-((-7601) & 15865)) & (-4609) & 16383;
        llIllllIIl[290] = (-17001) & 20479;
        llIllllIIl[291] = (((31 ^ 76) + (((35 + 11) - (-23)) + 124)) - (110 ^ 28)) + (44 ^ 18);
    }

    private static boolean lIlllIllIIlll(Object obj, Object obj2) {
        return obj != obj2;
    }

    public static void l(int i) {
        int[] iArr = new int[llIllllIIl[1]];
        iArr[llIllllIIl[0]] = i;
        if (lIlllIlIlllII(Inventory.contains(iArr) ? 1 : 0)) {
            int[] iArr2 = new int[llIllllIIl[1]];
            iArr2[llIllllIIl[0]] = i;
            if (lIlllIlIllllI(Equipment.contains(iArr2) ? 1 : 0)) {
                int[] iArr3 = new int[llIllllIIl[1]];
                iArr3[llIllllIIl[0]] = i;
                Item first = Inventory.getFirst(iArr3);
                String[] strArr = new String[llIllllIIl[1]];
                strArr[llIllllIIl[0]] = llIlllIlII[llIllllIIl[192]];
                if (lIlllIlIlllII(first.hasAction(strArr) ? 1 : 0)) {
                    int[] iArr4 = new int[llIllllIIl[1]];
                    iArr4[llIllllIIl[0]] = i;
                    Inventory.getFirst(iArr4).interact(llIlllIlII[llIllllIIl[193]]);
                }
                int[] iArr5 = new int[llIllllIIl[1]];
                iArr5[llIllllIIl[0]] = i;
                Item first2 = Inventory.getFirst(iArr5);
                String[] strArr2 = new String[llIllllIIl[1]];
                strArr2[llIllllIIl[0]] = llIlllIlII[llIllllIIl[194]];
                if (lIlllIlIlllII(first2.hasAction(strArr2) ? 1 : 0)) {
                    int[] iArr6 = new int[llIllllIIl[1]];
                    iArr6[llIllllIIl[0]] = i;
                    Inventory.getFirst(iArr6).interact(llIlllIlII[llIllllIIl[195]]);
                }
                int[] iArr7 = new int[llIllllIIl[1]];
                iArr7[llIllllIIl[0]] = i;
                Item first3 = Inventory.getFirst(iArr7);
                String[] strArr3 = new String[llIllllIIl[1]];
                strArr3[llIllllIIl[0]] = llIlllIlII[llIllllIIl[196]];
                if (lIlllIlIlllII(first3.hasAction(strArr3) ? 1 : 0)) {
                    int[] iArr8 = new int[llIllllIIl[1]];
                    iArr8[llIllllIIl[0]] = i;
                    Inventory.getFirst(iArr8).interact(llIlllIlII[llIllllIIl[197]]);
                }
                if (lIlllIllIlIII(i, llIllllIIl[198])) {
                    Time.sleepTicks(llIllllIIl[10]);
                    "".length();
                    String[] strArr4 = new String[llIllllIIl[1]];
                    strArr4[llIllllIIl[0]] = llIlllIlII[llIllllIIl[199]];
                    C0020g.a(strArr4);
                    Time.sleepTicks(llIllllIIl[1]);
                    "".length();
                }
            }
        }
    }

    private static int lIlllIllIIllI(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    public static void b(int[] iArr) {
        if (lIlllIlIlllII(Inventory.contains(iArr) ? 1 : 0) && lIlllIlIllllI(Equipment.contains(iArr) ? 1 : 0)) {
            Item first = Inventory.getFirst(iArr);
            String[] strArr = new String[llIllllIIl[1]];
            strArr[llIllllIIl[0]] = llIlllIlII[llIllllIIl[200]];
            if (lIlllIlIlllII(first.hasAction(strArr) ? 1 : 0)) {
                Inventory.getFirst(iArr).interact(llIlllIlII[llIllllIIl[201]]);
            }
            Item first2 = Inventory.getFirst(iArr);
            String[] strArr2 = new String[llIllllIIl[1]];
            strArr2[llIllllIIl[0]] = llIlllIlII[llIllllIIl[202]];
            if (lIlllIlIlllII(first2.hasAction(strArr2) ? 1 : 0)) {
                Inventory.getFirst(iArr).interact(llIlllIlII[llIllllIIl[203]]);
            }
            Item first3 = Inventory.getFirst(iArr);
            String[] strArr3 = new String[llIllllIIl[1]];
            strArr3[llIllllIIl[0]] = llIlllIlII[llIllllIIl[204]];
            if (lIlllIlIlllII(first3.hasAction(strArr3) ? 1 : 0)) {
                Inventory.getFirst(iArr).interact(llIlllIlII[llIllllIIl[205]]);
            }
        }
    }

    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public int af() {
        try {
            gb();
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return (118 ^ 35) & ((242 ^ 167) ^ (-1));
            }
        } catch (Exception e) {
        }
        return llIllllIIl[13];
    }

    private static boolean lIlllIllIlIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIlllIllIIlII(int i, int i2) {
        return i >= i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List<aM> a(aM aMVar, List<WorldPoint> list) {
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[llIllllIIl[11]];
        int i = llIllllIIl[0];
        int[] iArr2 = new int[llIllllIIl[2]];
        iArr2[llIllllIIl[0]] = llIllllIIl[1];
        iArr2[llIllllIIl[1]] = llIllllIIl[0];
        iArr[i] = iArr2;
        int i2 = llIllllIIl[1];
        int[] iArr3 = new int[llIllllIIl[2]];
        iArr3[llIllllIIl[0]] = llIllllIIl[80];
        iArr3[llIllllIIl[1]] = llIllllIIl[0];
        iArr[i2] = iArr3;
        int i3 = llIllllIIl[2];
        int[] iArr4 = new int[llIllllIIl[2]];
        iArr4[llIllllIIl[0]] = llIllllIIl[0];
        iArr4[llIllllIIl[1]] = llIllllIIl[1];
        iArr[i3] = iArr4;
        int i4 = llIllllIIl[10];
        int[] iArr5 = new int[llIllllIIl[2]];
        iArr5[llIllllIIl[0]] = llIllllIIl[0];
        iArr5[llIllllIIl[1]] = llIllllIIl[80];
        iArr[i4] = iArr5;
        int length = iArr.length;
        int i5 = llIllllIIl[0];
        while (lIlllIlIlllIl(i5, length)) {
            Object[] objArr = iArr[i5];
            int x = aMVar.nT.getX() + objArr[llIllllIIl[0]];
            int y = aMVar.nT.getY() + objArr[llIllllIIl[1]];
            WorldPoint worldPoint = new WorldPoint(x, y, aMVar.nT.getPlane());
            if (lIlllIlIlllII(list.contains(worldPoint) ? 1 : 0)) {
                arrayList.add(new aM(worldPoint, aMVar, llIllllIIl[0], d(y, nR.getY() + llIllllIIl[17])));
                "".length();
            }
            i5++;
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return null;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    @Override // o.c.k.i.p000.l.o.f.p001.n.c.t.e.s.InterfaceC0003ac
    public boolean ah() {
        if (lIlllIllIIlII(Skills.getLevel(Skill.SLAYER), llIllllIIl[120])) {
            ?? r0 = llIllllIIl[1];
            "".length();
            return " ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIllllIIl[0];
    }

    private static boolean lIlllIllIIIII(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIlllIllIlIII(int i, int i2) {
        return i == i2;
    }

    private static boolean b(aM aMVar, List<aM> list) {
        return list.stream().anyMatch(aMVar2 -> {
            return aMVar2.nT.equals(aMVar.nT);
        });
    }
}
