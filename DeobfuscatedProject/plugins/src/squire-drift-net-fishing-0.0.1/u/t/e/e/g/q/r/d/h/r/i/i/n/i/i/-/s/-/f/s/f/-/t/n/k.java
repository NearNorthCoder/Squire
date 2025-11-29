/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.driftnet.SquireDriftNet;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Removing net", priority=20, blocking=true)
public class k
extends Task {
    private static /* synthetic */ String[] lIlIIIIIIllI;
    private static final /* synthetic */ int S;
    private final /* synthetic */ Client X;
    private static final /* synthetic */ int V;
    private final /* synthetic */ SquireDriftNet W;
    private static final /* synthetic */ int U;
    private static final /* synthetic */ int T;
    private static /* synthetic */ int[] lIlIIIIIIlll;

    private static boolean llIlIIllIIIlIl(Object object) {
        return object != null;
    }

    static {
        k.llIlIIllIIIIlI();
        k.llIlIIllIIIIIl();
        V = lIlIIIIIIlll[2];
        U = lIlIIIIIIlll[0];
        S = lIlIIIIIIlll[3];
        T = lIlIIIIIIlll[4];
    }

    private static boolean llIlIIllIIIIll(int n) {
        return n == 0;
    }

    private static boolean llIlIIllIIIllI(int n, int n2) {
        return n < n2;
    }

    private static String llIlIIllIIIIII(String lllllllllllllllIlllIlIIIllIIlIll, String lllllllllllllllIlllIlIIIllIIllll) {
        lllllllllllllllIlllIlIIIllIIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIllIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIIIllIIlllI = new StringBuilder();
        char[] lllllllllllllllIlllIlIIIllIIllIl = lllllllllllllllIlllIlIIIllIIllll.toCharArray();
        int lllllllllllllllIlllIlIIIllIIllII = lIlIIIIIIlll[0];
        char[] lllllllllllllllIlllIlIIIllIIIllI = lllllllllllllllIlllIlIIIllIIlIll.toCharArray();
        int lllllllllllllllIlllIlIIIllIIIlIl = lllllllllllllllIlllIlIIIllIIIllI.length;
        int lllllllllllllllIlllIlIIIllIIIlII = lIlIIIIIIlll[0];
        while (k.llIlIIllIIIllI(lllllllllllllllIlllIlIIIllIIIlII, lllllllllllllllIlllIlIIIllIIIlIl)) {
            char lllllllllllllllIlllIlIIIllIlIIIl = lllllllllllllllIlllIlIIIllIIIllI[lllllllllllllllIlllIlIIIllIIIlII];
            lllllllllllllllIlllIlIIIllIIlllI.append((char)(lllllllllllllllIlllIlIIIllIlIIIl ^ lllllllllllllllIlllIlIIIllIIllIl[lllllllllllllllIlllIlIIIllIIllII % lllllllllllllllIlllIlIIIllIIllIl.length]));
            "".length();
            ++lllllllllllllllIlllIlIIIllIIllII;
            ++lllllllllllllllIlllIlIIIllIIIlII;
            "".length();
            if (((0x15 ^ 0x78 ^ (0xDE ^ 0xA3)) & (102 + 6 - 89 + 144 ^ 162 + 99 - 177 + 95 ^ -" ".length())) > -" ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIIIllIIlllI);
    }

    public boolean run() {
        if (k.llIlIIllIIIIll(this.X.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIIlll[0];
        }
        String[] stringArray = new String[lIlIIIIIIlll[1]];
        stringArray[k.lIlIIIIIIlll[0]] = lIlIIIIIIllI[lIlIIIIIIlll[0]];
        if (k.llIlIIllIIIlII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            return lIlIIIIIIlll[0];
        }
        int lllllllllllllllIlllIlIIIlllIlIlI = Static.getClient().getVarbitValue(lIlIIIIIIlll[2]);
        if (k.llIlIIllIIIIll(lllllllllllllllIlllIlIIIlllIlIlI)) {
            k lllllllllllllllIlllIlIIIlllIlIll;
            Log.error((String)lIlIIIIIIllI[lIlIIIIIIlll[1]]);
            lllllllllllllllIlllIlIIIlllIlIll.W.forceStop();
            return lIlIIIIIIlll[0];
        }
        Widget lllllllllllllllIlllIlIIIlllIlIIl = Widgets.get((int)lIlIIIIIIlll[3], (int)lIlIIIIIIlll[4], (int)lIlIIIIIIlll[0]);
        if (k.llIlIIllIIIlIl(lllllllllllllllIlllIlIIIlllIlIIl)) {
            lllllllllllllllIlllIlIIIlllIlIIl.interact(lIlIIIIIIllI[lIlIIIIIIlll[5]]);
            return lIlIIIIIIlll[1];
        }
        String[] stringArray2 = new String[lIlIIIIIIlll[1]];
        stringArray2[k.lIlIIIIIIlll[0]] = lIlIIIIIIllI[lIlIIIIIIlll[6]];
        TileObject lllllllllllllllIlllIlIIIlllIlIII = TileObjects.getNearest((String[])stringArray2);
        if (k.llIlIIllIIIlIl(lllllllllllllllIlllIlIIIlllIlIII)) {
            lllllllllllllllIlllIlIIIlllIlIII.interact(lIlIIIIIIllI[lIlIIIIIIlll[7]]);
            return lIlIIIIIIlll[1];
        }
        return lIlIIIIIIlll[0];
    }

    private static void llIlIIllIIIIIl() {
        lIlIIIIIIllI = new String[lIlIIIIIIlll[4]];
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[0]] = k.llIlIIlIlllllI("IBl/X7wiTkvfGag6YykM3w==", "VsWfI");
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[1]] = k.llIlIIlIllllll("1Qsx6g84/ak0wHEYePIBuOQqsmhgljT6", "ZQWMB");
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[5]] = k.llIlIIlIllllll("FYcsyOJ4MZiGM1ypWiFd7w==", "LGxkH");
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[6]] = k.llIlIIlIllllll("nRUfSva1KBQ=", "KCVTq");
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[7]] = k.llIlIIllIIIIII("ND8+BA==", "zZJwE");
    }

    private static String llIlIIlIllllll(String lllllllllllllllIlllIlIIIllIllllI, String lllllllllllllllIlllIlIIIllIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIlllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIllIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIIlllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIIlllIIIlI.init(lIlIIIIIIlll[5], lllllllllllllllIlllIlIIIlllIIIll);
            return new String(lllllllllllllllIlllIlIIIlllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIIlllIIIIl) {
            lllllllllllllllIlllIlIIIlllIIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIlIIllIIIIlI() {
        lIlIIIIIIlll = new int[9];
        k.lIlIIIIIIlll[0] = (0x97 ^ 0xAA ^ (5 ^ 0x1B)) & (0x13 ^ 0x5A ^ (0x6B ^ 1) ^ -" ".length());
        k.lIlIIIIIIlll[1] = " ".length();
        k.lIlIIIIIIlll[2] = 231 + 3 - 89 + 98;
        k.lIlIIIIIIlll[3] = -(0xFFFFED43 & 0x1AFF) & (0xFFFF8D7F & 0x7BF7);
        k.lIlIIIIIIlll[4] = 91 + 159 - 164 + 95 ^ 157 + 55 - 137 + 101;
        k.lIlIIIIIIlll[5] = "  ".length();
        k.lIlIIIIIIlll[6] = "   ".length();
        k.lIlIIIIIIlll[7] = 0x6E ^ 0x3B ^ (0xCB ^ 0x9A);
        k.lIlIIIIIIlll[8] = 0x9A ^ 0x92;
    }

    private static String llIlIIlIlllllI(String lllllllllllllllIlllIlIIIlIlllIll, String lllllllllllllllIlllIlIIIlIlllIII) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIlIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIlIlllIII.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIlll[8]), "DES");
            Cipher lllllllllllllllIlllIlIIIlIllllIl = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIIlIllllIl.init(lIlIIIIIIlll[5], lllllllllllllllIlllIlIIIlIlllllI);
            return new String(lllllllllllllllIlllIlIIIlIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIlIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIIlIllllII) {
            lllllllllllllllIlllIlIIIlIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIIllIIIlII(int n) {
        return n != 0;
    }

    @Inject
    public k(SquireDriftNet squireDriftNet, Client client) {
        this.W = squireDriftNet;
        this.X = client;
    }
}

