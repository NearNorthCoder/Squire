/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;

/* TASK: Leaving Tithe Instance -> LeavingtitheinstanceTask */
@TaskDesc(name="Leaving Tithe Instance", priority=0x7FFFFFFF, blocking=true)
public class LeavingTitheInstanceTask
extends Task {
    private static final /* synthetic */ int W;
    private final /* synthetic */ SquireTitheConfig X;
    private final /* synthetic */ Client Y;
    private static /* synthetic */ String[] lIIlllllIllII;
    private static /* synthetic */ int[] lIIlllllIlllI;

    static {
        q.lIllIlIlllllIll();
        q.lIllIlIlllllIlI();
        W = lIIlllllIlllI[2];
    }

    private static String lIllIlIllllIlII(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var1 = var19.toCharArray();
        int var10 = lIIlllllIlllI[0];
        char[] var9 = var18.toCharArray();
        int var5 = var9.length;
        int var17 = lIIlllllIlllI[0];
        while (q.lIllIlIllllllIl(var17, var5)) {
            char var13 = var9[var17];
            var24.append((char)(var13 ^ var1[var10 % var1.length]));
            0;
            ++var10;
            ++var17;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    private static boolean lIllIlIlllllllI(int n2) {
        return n2 != 0;
    }

    private static String lIllIlIllllIIll(String var23, String var14) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), lIIlllllIlllI[10]), "DES");
            Cipher var15 = Cipher.getInstance("DES");
            var15.init(lIIlllllIlllI[4], var3);
            return new String(var15.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static String lIllIlIllllIlIl(String var21, String var16) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIIlllllIlllI[4], var8);
            return new String(var12.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    private boolean y() {
        String[] stringArray = new String[lIIlllllIlllI[3]];
        stringArray[q.lIIlllllIlllI[0]] = lIIlllllIllII[lIIlllllIlllI[5]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (q.lIllIllIIIIIIII(tileObject)) {
            return lIIlllllIlllI[0];
        }
        tileObject.interact(lIIlllllIllII[lIIlllllIlllI[6]]);
        return lIIlllllIlllI[3];
    }

    private static boolean lIllIlIllllllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllIlIllllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIlIlllllIlI() {
        lIIlllllIllII = new String[lIIlllllIlllI[10]];
        q.lIIlllllIllII[q.lIIlllllIlllI[0]] = q."Wear";
        q.lIIlllllIllII[q.lIIlllllIlllI[3]] = q."Sack";
        q.lIIlllllIllII[q.lIIlllllIlllI[4]] = q."Deposit";
        q.lIIlllllIllII[q.lIIlllllIlllI[5]] = q."Farm door";
        q.lIIlllllIllII[q.lIIlllllIlllI[6]] = q."Open";
        q.lIIlllllIllII[q.lIIlllllIlllI[7]] = q."Farmer's";
        q.lIIlllllIllII[q.lIIlllllIlllI[8]] = q."fruit";
        q.lIIlllllIllII[q.lIIlllllIlllI[9]] = q."seed";
    }

    private static boolean lIllIlIllllllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIIIIIIII(Object object) {
        return object == null;
    }

    @Inject
    public q(SquireTitheConfig squireTitheConfig, Client client) {
        this.X = squireTitheConfig;
        this.Y = client;
    }

    public boolean run() {
        q var7;
        if (q.lIllIlIllllllII(this.Y.isInInstancedRegion() ? 1 : 0)) {
            return lIIlllllIlllI[0];
        }
        Item var11 = Inventory.getFirst(item -> item.getName().endsWith(lIIlllllIllII[lIIlllllIlllI[9]]));
        if (q.lIllIlIllllllIl(Vars.getBit((int)lIIlllllIlllI[1]), lIIlllllIlllI[2]) && q.lIllIlIllllllII(var7.X.fruit().a(var11) ? 1 : 0)) {
            return lIIlllllIlllI[0];
        }
        if (q.lIllIlIlllllllI(Inventory.contains(item -> item.getName().toLowerCase().contains(lIIlllllIllII[lIIlllllIlllI[8]])) ? 1 : 0)) {
            List var20 = Inventory.getAll(item -> item.getName().contains(lIIlllllIllII[lIIlllllIlllI[7]]));
            if (q.lIllIlIllllllll(var20.size())) {
                Iterator var22 = var20.iterator();
                while (q.lIllIlIlllllllI(var22.hasNext() ? 1 : 0)) {
                    Item var4 = (Item)var22.next();
                    var4.interact(lIIlllllIllII[lIIlllllIlllI[0]]);
                    0;
                    if (((0x37 ^ 0xF ^ (0x5D ^ 0x6A)) & (0x30 ^ 0x43 ^ (0x26 ^ 0x5A) ^ -1)) == 0) continue;
                    return ((0x6B ^ 0x18 ^ (0xC0 ^ 0x98)) & (157 + 90 - 213 + 125 ^ 104 + 5 - -24 + 47 ^ -1)) != 0;
                }
                return lIIlllllIlllI[3];
            }
            String[] stringArray = new String[lIIlllllIlllI[3]];
            stringArray[q.lIIlllllIlllI[0]] = lIIlllllIllII[lIIlllllIlllI[3]];
            TileObject var22 = TileObjects.getNearest((String[])stringArray);
            if (q.lIllIllIIIIIIII(var22)) {
                return lIIlllllIlllI[0];
            }
            var22.interact(lIIlllllIllII[lIIlllllIlllI[4]]);
            return lIIlllllIlllI[3];
        }
        return this.y();
    }

    private static void lIllIlIlllllIll() {
        lIIlllllIlllI = new int[11];
        q.lIIlllllIlllI[0] = (0x6D ^ 0x36 ^ (0x16 ^ 0x7D)) & (13 + 26 - -68 + 65 ^ 142 + 6 - 61 + 69 ^ -1);
        q.lIIlllllIlllI[1] = 0xFFFFD3FD & 0x3F1F;
        q.lIIlllllIlllI[2] = 0xFFFFF4DF & 0x3F39;
        q.lIIlllllIlllI[3] = 1;
        q.lIIlllllIlllI[4] = 2;
        q.lIIlllllIlllI[5] = 3;
        q.lIIlllllIlllI[6] = 0x63 ^ 0x67;
        q.lIIlllllIlllI[7] = 0x5E ^ 0x5B;
        q.lIIlllllIlllI[8] = 153 + 0 - 28 + 72 ^ 46 + 82 - 102 + 169;
        q.lIIlllllIlllI[9] = 150 + 86 - 111 + 54 ^ 151 + 42 - 110 + 97;
        q.lIIlllllIlllI[10] = 115 + 75 - 2 + 13 ^ 98 + 144 - 125 + 76;
    }
}

