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

/* TASK: Placing net -> PlacingnetTask */
@TaskDesc(name="Placing net", priority=15, blocking=true)
public class PlacingNetTask
extends Task {
    private final /* synthetic */ Client F;
    private static /* synthetic */ String[] lIlIIIIIllII;
    private static /* synthetic */ int[] lIlIIIIIllIl;
    private static final /* synthetic */ int E;
    private final /* synthetic */ SquireDriftNetConfig G;
    private static final /* synthetic */ int D;

    private static String llIlIIllIllIII(String var16, String var14) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIlIIIIIllIl[9]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIlIIIIIllIl[2], var5);
            return new String(var15.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    private static String llIlIIllIllIIl(String var8, String var20) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIlIIIIIllIl[2], var19);
            return new String(var12.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
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
        h.lIlIIIIIllII[h.lIlIIIIIllIl[0]] = h."Set up";
        h.lIlIIIIIllII[h.lIlIIIIIllIl[6]] = h."Something weird is going on!";
        h.lIlIIIIIllII[h.lIlIIIIIllIl[2]] = h."Drift net anchors";
        h.lIlIIIIIllII[h.lIlIIIIIllIl[7]] = h."Set up";
    }

    private static void llIlIIllIlllIl() {
        lIlIIIIIllIl = new int[10];
        h.lIlIIIIIllIl[0] = (0x3C ^ 7) & ~(0x2E ^ 0x15);
        h.lIlIIIIIllIl[1] = 0xFFFFFF7F & 0x2DF;
        h.lIlIIIIIllIl[2] = 2;
        h.lIlIIIIIllIl[3] = 57 + 133 - 133 + 108 ^ 125 + 67 - 51 + 27;
        h.lIlIIIIIllIl[4] = 0xFFFFDFBC & 0x36F7;
        h.lIlIIIIIllIl[5] = -(0xFFFFF71A & 0x48EF) & (0xFFFFF7BF & 0x5EFF);
        h.lIlIIIIIllIl[6] = 1;
        h.lIlIIIIIllIl[7] = 3;
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
        h var21;
        if (h.llIlIIllIllllI(this.F.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIllIl[0];
        }
        if (h.llIlIIllIlllll(var21.G.depositFish() ? 1 : 0) && h.llIlIIlllIIIII(lllllllllllllllIlllIlIIIIlIIllII22 = Widgets.get((int)lIlIIIIIllIl[1], (int)lIlIIIIIllIl[2], (int)lIlIIIIIllIl[3]))) {
            return lIlIIIIIllIl[0];
        }
        int lllllllllllllllIlllIlIIIIlIIllII22 = Static.getClient().getVarbitValue(lIlIIIIIllIl[4]);
        int var3 = Static.getClient().getVarbitValue(lIlIIIIIllIl[5]);
        if (h.llIlIIllIlllll(lllllllllllllllIlllIlIIIIlIIllII22) && h.llIlIIllIlllll(var3)) {
            return lIlIIIIIllIl[0];
        }
        TileObject var6 = TileObjects.getNearest(tileObject -> {
            int n;
            if (h.llIlIIllIlllll(tileObject.getName().equals(lIlIIIIIllII[lIlIIIIIllIl[2]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIllIl[6]];
                stringArray[h.lIlIIIIIllIl[0]] = lIlIIIIIllII[lIlIIIIIllIl[7]];
                if (h.llIlIIllIlllll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n = lIlIIIIIllIl[6];
                    0;
                    if (null == null) return n != 0;
                    return ((0x6C ^ 0x51 ^ (0xEF ^ 0x8E)) & (213 + 81 - 244 + 178 ^ 128 + 87 - 207 + 176 ^ -1)) != 0;
                }
            }
            n = lIlIIIIIllIl[0];
            return n != 0;
        });
        if (h.llIlIIlllIIIII(var6)) {
            var6.interact(lIlIIIIIllII[lIlIIIIIllIl[0]]);
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

    private static String llIlIIllIlIlll(String var7, String var11) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var4 = lIlIIIIIllIl[0];
        char[] var1 = var7.toCharArray();
        int var2 = var1.length;
        int var22 = lIlIIIIIllIl[0];
        while (h.llIlIIlllIIIIl(var22, var2)) {
            char var17 = var1[var22];
            var9.append((char)(var17 ^ var13[var4 % var13.length]));
            0;
            ++var4;
            ++var22;
            0;
            if (((64 + 71 - 97 + 121 ^ 78 + 72 - -1 + 10) & (224 + 171 - 334 + 188 ^ 172 + 85 - 249 + 191 ^ -1)) < (68 + 58 - 109 + 124 ^ 92 + 97 - 56 + 4)) continue;
            return null;
        }
        return String.valueOf(var9);
    }
}

