/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Widgets
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Widgets;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ck;

@TaskDesc(name="Claiming Rewards (Outside)", priority=0x7FFFFFFF, blocking=true)
public class cg
extends ck {
    private static /* synthetic */ int[] llIlIIIIIlI;
    private static final /* synthetic */ int hO;
    private static final /* synthetic */ int hP;
    private static /* synthetic */ String[] llIlIIIIIIl;

    private static boolean lIlIIlIIIlIllI(int n2) {
        return n2 != 0;
    }

    private static String lIlIIlIIIlIIII(String llllllllllllllllIIlllIIIlIllllII, String llllllllllllllllIIlllIIIlIlllIll) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIIllIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIIlIlllIll.getBytes(StandardCharsets.UTF_8)), llIlIIIIIlI[8]), "DES");
            Cipher llllllllllllllllIIlllIIIllIIIIII = Cipher.getInstance("DES");
            llllllllllllllllIIlllIIIllIIIIII.init(llIlIIIIIlI[4], llllllllllllllllIIlllIIIllIIIIIl);
            return new String(llllllllllllllllIIlllIIIllIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIIIlIllllll) {
            llllllllllllllllIIlllIIIlIllllll.printStackTrace();
            return null;
        }
    }

    static {
        cg.lIlIIlIIIlIIll();
        cg.lIlIIlIIIlIIlI();
        hO = llIlIIIIIlI[2];
        hP = llIlIIIIIlI[3];
    }

    @Override
    public boolean bl() {
        TileObject tileObject;
        block5: {
            block4: {
                String[] stringArray = new String[llIlIIIIIlI[0]];
                stringArray[cg.llIlIIIIIlI[1]] = llIlIIIIIIl[llIlIIIIIlI[1]];
                tileObject = TileObjects.getNearest((String[])stringArray);
                if (!cg.lIlIIlIIIlIlII(tileObject)) break block4;
                String[] stringArray2 = new String[llIlIIIIIlI[0]];
                stringArray2[cg.llIlIIIIIlI[1]] = llIlIIIIIIl[llIlIIIIIlI[0]];
                if (!cg.lIlIIlIIIlIlIl(tileObject.hasAction(stringArray2) ? 1 : 0)) break block5;
            }
            return llIlIIIIIlI[1];
        }
        Widget llllllllllllllllIIlllIIIlllIlIll = Widgets.get((int)llIlIIIIIlI[2], (int)llIlIIIIIlI[3]);
        if (cg.lIlIIlIIIlIllI(Widgets.isVisible((Widget)llllllllllllllllIIlllIIIlllIlIll) ? 1 : 0)) {
            Log.info((String)llIlIIIIIIl[llIlIIIIIlI[4]]);
            llllllllllllllllIIlllIIIlllIlIll.interact(llIlIIIIIIl[llIlIIIIIlI[5]]);
            return llIlIIIIIlI[0];
        }
        Log.info((String)llIlIIIIIIl[llIlIIIIIlI[3]]);
        tileObject.interact(llIlIIIIIIl[llIlIIIIIlI[6]]);
        return llIlIIIIIlI[0];
    }

    private static boolean lIlIIlIIIlIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIIlIIIIllll(String llllllllllllllllIIlllIIIllIllIll, String llllllllllllllllIIlllIIIllIllIlI) {
        llllllllllllllllIIlllIIIllIllIll = new String(Base64.getDecoder().decode(llllllllllllllllIIlllIIIllIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllIIIllIllllI = new StringBuilder();
        char[] llllllllllllllllIIlllIIIllIlllIl = llllllllllllllllIIlllIIIllIllIlI.toCharArray();
        int llllllllllllllllIIlllIIIllIlllII = llIlIIIIIlI[1];
        char[] llllllllllllllllIIlllIIIllIlIllI = llllllllllllllllIIlllIIIllIllIll.toCharArray();
        int llllllllllllllllIIlllIIIllIlIlIl = llllllllllllllllIIlllIIIllIlIllI.length;
        int llllllllllllllllIIlllIIIllIlIlII = llIlIIIIIlI[1];
        while (cg.lIlIIlIIIlIlll(llllllllllllllllIIlllIIIllIlIlII, llllllllllllllllIIlllIIIllIlIlIl)) {
            char llllllllllllllllIIlllIIIlllIIIIl = llllllllllllllllIIlllIIIllIlIllI[llllllllllllllllIIlllIIIllIlIlII];
            llllllllllllllllIIlllIIIllIllllI.append((char)(llllllllllllllllIIlllIIIlllIIIIl ^ llllllllllllllllIIlllIIIllIlllIl[llllllllllllllllIIlllIIIllIlllII % llllllllllllllllIIlllIIIllIlllIl.length]));
            "".length();
            ++llllllllllllllllIIlllIIIllIlllII;
            ++llllllllllllllllIIlllIIIllIlIlII;
            "".length();
            if (-"  ".length() < 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlllIIIllIllllI);
    }

    private static boolean lIlIIlIIIlIlIl(int n2) {
        return n2 == 0;
    }

    private static void lIlIIlIIIlIIlI() {
        llIlIIIIIIl = new String[llIlIIIIIlI[7]];
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[1]] = cg.lIlIIlIIIIllll("OBIgGRwOBHc2BwkfMg==", "jwWxn");
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[0]] = cg.lIlIIlIIIlIIII("/Pu3ZLq7nLo=", "wDJAQ");
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[4]] = cg.lIlIIlIIIlIIIl("EKYCa5gVUXpclsAIBFBIK7vNcMPY+txwolKDGQNE4l1H3V9N6EY0LH1cu3Z18cvR", "FJyuC");
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[5]] = cg.lIlIIlIIIlIIII("SPd08ysBg7eCFxPYTvUXSw==", "EdrDf");
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[3]] = cg.lIlIIlIIIIllll("HxM9EQIpAjQHCjY0IjkfIT0iLUsHPDAZBi0+NlAZIScwAg9kOSUVBjd+f14=", "DPQpk");
        cg.llIlIIIIIIl[cg.llIlIIIIIlI[6]] = cg.lIlIIlIIIlIIIl("Y/OZBJQZ81M=", "rnqUH");
    }

    @Inject
    protected cg(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    private static void lIlIIlIIIlIIll() {
        llIlIIIIIlI = new int[9];
        cg.llIlIIIIIlI[0] = " ".length();
        cg.llIlIIIIIlI[1] = (0x2B ^ 7) & ~(0x13 ^ 0x3F);
        cg.llIlIIIIIlI[2] = -(0xFFFFF5EF & 0x3EB5) & (0xFFFFFFB7 & 0x37EF);
        cg.llIlIIIIIlI[3] = 0x5D ^ 0x59;
        cg.llIlIIIIIlI[4] = "  ".length();
        cg.llIlIIIIIlI[5] = "   ".length();
        cg.llIlIIIIIlI[6] = 0xC2 ^ 0xC7;
        cg.llIlIIIIIlI[7] = 0x3B ^ 0x21 ^ (0x3A ^ 0x26);
        cg.llIlIIIIIlI[8] = 0x47 ^ 0x72 ^ (0x54 ^ 0x69);
    }

    private static String lIlIIlIIIlIIIl(String llllllllllllllllIIlllIIIllIIlIll, String llllllllllllllllIIlllIIIllIIlIII) {
        try {
            SecretKeySpec llllllllllllllllIIlllIIIllIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllIIIllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlllIIIllIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlllIIIllIIllIl.init(llIlIIIIIlI[4], llllllllllllllllIIlllIIIllIIlllI);
            return new String(llllllllllllllllIIlllIIIllIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllIIIllIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlllIIIllIIllII) {
            llllllllllllllllIIlllIIIllIIllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIlIIIlIlII(Object object) {
        return object != null;
    }
}

