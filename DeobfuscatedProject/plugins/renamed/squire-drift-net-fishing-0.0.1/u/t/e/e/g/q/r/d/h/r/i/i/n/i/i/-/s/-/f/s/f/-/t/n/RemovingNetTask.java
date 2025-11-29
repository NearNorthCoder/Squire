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

/* TASK: Removing net -> RemovingnetTask */
@TaskDesc(name="Removing net", priority=20, blocking=true)
public class RemovingNetTask
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

    private static String llIlIIllIIIIII(String var9, String var8) {
        var9 = new String(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var3 = var8.toCharArray();
        int var22 = lIlIIIIIIlll[0];
        char[] var6 = var9.toCharArray();
        int var14 = var6.length;
        int var2 = lIlIIIIIIlll[0];
        while (k.llIlIIllIIIllI(var2, var14)) {
            char var21 = var6[var2];
            var10.append((char)(var21 ^ var3[var22 % var3.length]));
            0;
            ++var22;
            ++var2;
            0;
            if (((0x15 ^ 0x78 ^ (0xDE ^ 0xA3)) & (102 + 6 - 89 + 144 ^ 162 + 99 - 177 + 95 ^ -1)) > -1) continue;
            return null;
        }
        return String.valueOf(var10);
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
        int var1 = Static.getClient().getVarbitValue(lIlIIIIIIlll[2]);
        if (k.llIlIIllIIIIll(var1)) {
            k var20;
            Log.error((String)lIlIIIIIIllI[lIlIIIIIIlll[1]]);
            var20.W.forceStop();
            return lIlIIIIIIlll[0];
        }
        Widget var13 = Widgets.get((int)lIlIIIIIIlll[3], (int)lIlIIIIIIlll[4], (int)lIlIIIIIIlll[0]);
        if (k.llIlIIllIIIlIl(var13)) {
            var13.interact(lIlIIIIIIllI[lIlIIIIIIlll[5]]);
            return lIlIIIIIIlll[1];
        }
        String[] stringArray2 = new String[lIlIIIIIIlll[1]];
        stringArray2[k.lIlIIIIIIlll[0]] = lIlIIIIIIllI[lIlIIIIIIlll[6]];
        TileObject var16 = TileObjects.getNearest((String[])stringArray2);
        if (k.llIlIIllIIIlIl(var16)) {
            var16.interact(lIlIIIIIIllI[lIlIIIIIIlll[7]]);
            return lIlIIIIIIlll[1];
        }
        return lIlIIIIIIlll[0];
    }

    private static void llIlIIllIIIIIl() {
        lIlIIIIIIllI = new String[lIlIIIIIIlll[4]];
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[0]] = k."Drift net";
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[1]] = k."Out of Drift net";
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[5]] = k."Withdraw-All";
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[6]] = k."Annette";
        k.lIlIIIIIIllI[k.lIlIIIIIIlll[7]] = k."Nets";
    }

    private static String llIlIIlIllllll(String var19, String var18) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIlIIIIIIlll[5], var4);
            return new String(var7.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static void llIlIIllIIIIlI() {
        lIlIIIIIIlll = new int[9];
        k.lIlIIIIIIlll[0] = (0x97 ^ 0xAA ^ (5 ^ 0x1B)) & (0x13 ^ 0x5A ^ (0x6B ^ 1) ^ -1);
        k.lIlIIIIIIlll[1] = 1;
        k.lIlIIIIIIlll[2] = 231 + 3 - 89 + 98;
        k.lIlIIIIIIlll[3] = -(0xFFFFED43 & 0x1AFF) & (0xFFFF8D7F & 0x7BF7);
        k.lIlIIIIIIlll[4] = 91 + 159 - 164 + 95 ^ 157 + 55 - 137 + 101;
        k.lIlIIIIIIlll[5] = 2;
        k.lIlIIIIIIlll[6] = 3;
        k.lIlIIIIIIlll[7] = 0x6E ^ 0x3B ^ (0xCB ^ 0x9A);
        k.lIlIIIIIIlll[8] = 0x9A ^ 0x92;
    }

    private static String llIlIIlIlllllI(String var23, String var12) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIlll[8]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIlIIIIIIlll[5], var15);
            return new String(var5.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
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

