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
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package u.t.e.e.g.q.r.d.h.r.i.i.n.i.i.-.s.-.f.s.f.-.t.n;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.driftnet.SquireDriftNetConfig;
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
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Placing net", priority=15, blocking=true)
public class h
extends Task {
    private final /* synthetic */ Client F;
    private static /* synthetic */ String[] lIlIIIIIllII;
    private static /* synthetic */ int[] lIlIIIIIllIl;
    private static final /* synthetic */ int E;
    private final /* synthetic */ SquireDriftNetConfig G;
    private static final /* synthetic */ int D;

    private static String llIlIIllIllIII(String lllllllllllllllIlllIlIIIIIlIlIII, String lllllllllllllllIlllIlIIIIIlIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllIl[9]), "DES");
            Cipher lllllllllllllllIlllIlIIIIIlIlIlI = Cipher.getInstance("DES");
            lllllllllllllllIlllIlIIIIIlIlIlI.init(lIlIIIIIllIl[2], lllllllllllllllIlllIlIIIIIlIlIll);
            return new String(lllllllllllllllIlllIlIIIIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIIIIlIlIIl) {
            lllllllllllllllIlllIlIIIIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static String llIlIIllIllIIl(String lllllllllllllllIlllIlIIIIIIllIIl, String lllllllllllllllIlllIlIIIIIIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlllIlIIIIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIlIIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIlIIIIIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIlIIIIIIlllIl.init(lIlIIIIIllIl[2], lllllllllllllllIlllIlIIIIIIllllI);
            return new String(lllllllllllllllIlllIlIIIIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIlIIIIIIlllII) {
            lllllllllllllllIlllIlIIIIIIlllII.printStackTrace();
            return null;
        }
    }

    static {
        h.llIlIIllIlllIl();
        h.llIlIIllIllIll();
        D = lIlIIIIIllIl[4];
        E = lIlIIIIIllIl[5];
    }

    private static boolean llIlIIllIlllll(int n) {
        return n != 0;
    }

    private static boolean llIlIIlllIIIII(Object object) {
        return object != null;
    }

    private static void llIlIIllIllIll() {
        lIlIIIIIllII = new String[lIlIIIIIllIl[8]];
        h.lIlIIIIIllII[h.lIlIIIIIllIl[0]] = h.llIlIIllIlIlll("NCwWcBwX", "gIbPi");
        h.lIlIIIIIllII[h.lIlIIIIIllIl[6]] = h.llIlIIllIlIlll("IikZDx0ZLxoNSQYjHRgNUS8HSg4eLxoNSR4oVQ==", "qFtji");
        h.lIlIIIIIllII[h.lIlIIIIIllIl[2]] = h.llIlIIllIllIII("+OR0cxGQZKKAIgsrkE63BwvHkyvFgVfA", "WUOeS");
        h.lIlIIIIIllII[h.lIlIIIIIllIl[7]] = h.llIlIIllIllIIl("B4RecTgplPM=", "qisNg");
    }

    private static void llIlIIllIlllIl() {
        lIlIIIIIllIl = new int[10];
        h.lIlIIIIIllIl[0] = (0x3C ^ 7) & ~(0x2E ^ 0x15);
        h.lIlIIIIIllIl[1] = 0xFFFFFF7F & 0x2DF;
        h.lIlIIIIIllIl[2] = "  ".length();
        h.lIlIIIIIllIl[3] = 57 + 133 - 133 + 108 ^ 125 + 67 - 51 + 27;
        h.lIlIIIIIllIl[4] = 0xFFFFDFBC & 0x36F7;
        h.lIlIIIIIllIl[5] = -(0xFFFFF71A & 0x48EF) & (0xFFFFF7BF & 0x5EFF);
        h.lIlIIIIIllIl[6] = " ".length();
        h.lIlIIIIIllIl[7] = "   ".length();
        h.lIlIIIIIllIl[8] = 0x2F ^ 0x6F ^ (0x74 ^ 0x30);
        h.lIlIIIIIllIl[9] = 0x15 ^ 0x1D;
    }

    @Inject
    public h(Client client, SquireDriftNetConfig squireDriftNetConfig) {
        this.F = client;
        this.G = squireDriftNetConfig;
    }

    public boolean run() {
        Widget lllllllllllllllIlllIlIIIIlIIllII22;
        h lllllllllllllllIlllIlIIIIlIIllIl;
        if (h.llIlIIllIllllI(this.F.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIllIl[0];
        }
        if (h.llIlIIllIlllll(lllllllllllllllIlllIlIIIIlIIllIl.G.depositFish() ? 1 : 0) && h.llIlIIlllIIIII(lllllllllllllllIlllIlIIIIlIIllII22 = Widgets.get((int)lIlIIIIIllIl[1], (int)lIlIIIIIllIl[2], (int)lIlIIIIIllIl[3]))) {
            return lIlIIIIIllIl[0];
        }
        int lllllllllllllllIlllIlIIIIlIIllII22 = Static.getClient().getVarbitValue(lIlIIIIIllIl[4]);
        int lllllllllllllllIlllIlIIIIlIIlIll = Static.getClient().getVarbitValue(lIlIIIIIllIl[5]);
        if (h.llIlIIllIlllll(lllllllllllllllIlllIlIIIIlIIllII22) && h.llIlIIllIlllll(lllllllllllllllIlllIlIIIIlIIlIll)) {
            return lIlIIIIIllIl[0];
        }
        TileObject lllllllllllllllIlllIlIIIIlIIlIlI = TileObjects.getNearest(tileObject -> {
            int n;
            if (h.llIlIIllIlllll(tileObject.getName().equals(lIlIIIIIllII[lIlIIIIIllIl[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIllIl[6]];
                stringArray[h.lIlIIIIIllIl[0]] = lIlIIIIIllII[lIlIIIIIllIl[7]];
                if (h.llIlIIllIlllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n = lIlIIIIIllIl[6];
                    "".length();
                    if (null == null) return n != 0;
                    return ((0x6C ^ 0x51 ^ (0xEF ^ 0x8E)) & (213 + 81 - 244 + 178 ^ 128 + 87 - 207 + 176 ^ -" ".length())) != 0;
                }
            }
            n = lIlIIIIIllIl[0];
            return n != 0;
        });
        if (h.llIlIIlllIIIII(lllllllllllllllIlllIlIIIIlIIlIlI)) {
            lllllllllllllllIlllIlIIIIlIIlIlI.interact(lIlIIIIIllII[lIlIIIIIllIl[0]]);
            return lIlIIIIIllIl[6];
        }
        Log.error((String)lIlIIIIIllII[lIlIIIIIllIl[6]]);
        return lIlIIIIIllIl[0];
    }

    private static boolean llIlIIlllIIIIl(int n, int n2) {
        return n < n2;
    }

    private static boolean llIlIIllIllllI(int n) {
        return n == 0;
    }

    private static String llIlIIllIlIlll(String lllllllllllllllIlllIlIIIIIllllIl, String lllllllllllllllIlllIlIIIIIllIlll) {
        lllllllllllllllIlllIlIIIIIllllIl = new String(Base64.getDecoder().decode(lllllllllllllllIlllIlIIIIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIlIIIIIlllIll = new StringBuilder();
        char[] lllllllllllllllIlllIlIIIIIlllIlI = lllllllllllllllIlllIlIIIIIllIlll.toCharArray();
        int lllllllllllllllIlllIlIIIIIlllIIl = lIlIIIIIllIl[0];
        char[] lllllllllllllllIlllIlIIIIIllIIll = lllllllllllllllIlllIlIIIIIllllIl.toCharArray();
        int lllllllllllllllIlllIlIIIIIllIIlI = lllllllllllllllIlllIlIIIIIllIIll.length;
        int lllllllllllllllIlllIlIIIIIllIIIl = lIlIIIIIllIl[0];
        while (h.llIlIIlllIIIIl(lllllllllllllllIlllIlIIIIIllIIIl, lllllllllllllllIlllIlIIIIIllIIlI)) {
            char lllllllllllllllIlllIlIIIIIlllllI = lllllllllllllllIlllIlIIIIIllIIll[lllllllllllllllIlllIlIIIIIllIIIl];
            lllllllllllllllIlllIlIIIIIlllIll.append((char)(lllllllllllllllIlllIlIIIIIlllllI ^ lllllllllllllllIlllIlIIIIIlllIlI[lllllllllllllllIlllIlIIIIIlllIIl % lllllllllllllllIlllIlIIIIIlllIlI.length]));
            "".length();
            ++lllllllllllllllIlllIlIIIIIlllIIl;
            ++lllllllllllllllIlllIlIIIIIllIIIl;
            "".length();
            if (((64 + 71 - 97 + 121 ^ 78 + 72 - -1 + 10) & (224 + 171 - 334 + 188 ^ 172 + 85 - 249 + 191 ^ -" ".length())) < (68 + 58 - 109 + 124 ^ 92 + 97 - 56 + 4)) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIlIIIIIlllIll);
    }
}

