/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.r;

/* TASK: Getting new seeds -> GettingnewseedsTask */
@TaskDesc(name="Getting new seeds", priority=500, blocking=true)
public class o
extends r {
    private final /* synthetic */ Client V;
    private static /* synthetic */ int[] lIIlllllllIIl;
    private static /* synthetic */ String[] lIIllllllIlll;
    private static final /* synthetic */ int S;
    private final /* synthetic */ SquireTitheConfig U;
    private static final /* synthetic */ int T;

    private static boolean lIllIllIIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIIIlllll(int n2) {
        return n2 != 0;
    }

    private static void lIllIllIIIlllII() {
        lIIlllllllIIl = new int[11];
        o.lIIlllllllIIl[0] = (0xCB ^ 0x80) & ~(0xF ^ 0x44);
        o.lIIlllllllIIl[1] = -(0xFFFFFEE3 & 0xDDF) & (0xFFFFDFFF & 0x3FDF);
        o.lIIlllllllIIl[2] = -(0xFFFFDC3B & 0x7FDF) & (0xFFFFDFBF & 0x7FDE);
        o.lIIlllllllIIl[3] = 1;
        o.lIIlllllllIIl[4] = 0xFFFFFF76 & 0x2799;
        o.lIIlllllllIIl[5] = 2;
        o.lIIlllllllIIl[6] = 3;
        o.lIIlllllllIIl[7] = 0xDD ^ 0x9C ^ (0x2A ^ 0x6F);
        o.lIIlllllllIIl[8] = 118 + 73 - 92 + 57 ^ 118 + 26 - 46 + 55;
        o.lIIlllllllIIl[9] = 0x60 ^ 0x66;
        o.lIIlllllllIIl[10] = 85 + 179 - 226 + 163 ^ 157 + 48 - 89 + 77;
    }

    private static boolean lIllIllIIlIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIllIllIIIllIII(String var8, String var5) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var2 = var5.toCharArray();
        int var18 = lIIlllllllIIl[0];
        char[] var15 = var8.toCharArray();
        int var17 = var15.length;
        int var12 = lIIlllllllIIl[0];
        while (o.lIllIllIIlIIllI(var12, var17)) {
            char var13 = var15[var12];
            var7.append((char)(var13 ^ var2[var18 % var2.length]));
            0;
            ++var18;
            ++var12;
            0;
            if (((106 + 40 - 28 + 104 ^ 121 + 114 - 155 + 68) & (0x35 ^ 0x50 ^ (0x8C ^ 0xA3) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    static {
        o.lIllIllIIIlllII();
        o.lIllIllIIIllIIl();
        S = lIIlllllllIIl[4];
        T = lIIlllllllIIl[2];
    }

    private static String lIllIllIIIlIllI(String var21, String var6) {
        try {
            SecretKeySpec var9 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIIlllllllIIl[10]), "DES");
            Cipher var16 = Cipher.getInstance("DES");
            var16.init(lIIlllllllIIl[5], var9);
            return new String(var16.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIllIIlIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIllIllIIlIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static String lIllIllIIIlIlll(String var14, String var19) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var19.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lIIlllllllIIl[5], var11);
            return new String(var20.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIIlllIl(int n2, int n3) {
        return n2 != n3;
    }

    public boolean run() {
        o var4;
        if (o.lIllIllIIIlllIl(this.Z.u(), this.Z.t()) && o.lIllIllIIIlllll(this.V.isInInstancedRegion() ? 1 : 0)) {
            return lIIlllllllIIl[0];
        }
        if (o.lIllIllIIlIIIII(Vars.getBit((int)lIIlllllllIIl[1]), lIIlllllllIIl[2])) {
            return lIIlllllllIIl[0];
        }
        Item var22 = Inventory.getFirst(item -> item.getName().endsWith(lIIllllllIlll[lIIlllllllIIl[8]]));
        if (o.lIllIllIIlIIIlI(var22) && o.lIllIllIIlIIIll(var22.getQuantity(), var4.Z.u()) && o.lIllIllIIIlllll(var4.V.isInInstancedRegion() ? 1 : 0)) {
            if (o.lIllIllIIlIIlII(var4.U.fruit().a(var22) ? 1 : 0)) {
                return lIIlllllllIIl[0];
            }
            if (o.lIllIllIIIlllll(Inventory.contains(item -> item.getName().endsWith(lIIllllllIlll[lIIlllllllIIl[7]])) ? 1 : 0)) {
                return lIIlllllllIIl[0];
            }
        }
        if (!o.lIllIllIIlIIlII(var4.V.isInInstancedRegion() ? 1 : 0) || o.lIllIllIIlIIIlI(var22)) {
            String[] stringArray = new String[lIIlllllllIIl[3]];
            stringArray[o.lIIlllllllIIl[0]] = lIIllllllIlll[lIIlllllllIIl[0]];
            TileObject var3 = TileObjects.getNearest((String[])stringArray);
            if (o.lIllIllIIlIIlIl(var3)) {
                return lIIlllllllIIl[0];
            }
            var3.interact(lIIllllllIlll[lIIlllllllIIl[3]]);
            return lIIlllllllIIl[3];
        }
        if (o.lIllIllIIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount((int)lIIlllllllIIl[4]);
            return lIIlllllllIIl[3];
        }
        String[] stringArray = new String[lIIlllllllIIl[3]];
        stringArray[o.lIIlllllllIIl[0]] = lIIllllllIlll[lIIlllllllIIl[5]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (o.lIllIllIIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            Dialog.chooseOption((int)var4.U.fruit().i().ordinal());
            0;
            0;
            if ((0xE6 ^ 0x83 ^ (0x2F ^ 0x4F)) <= 0) {
                return ((0x32 ^ 0xB ^ (0x3B ^ 0x3E)) & (2 ^ (0x8A ^ 0xB4) ^ -1)) != 0;
            }
        } else {
            var3.interact(lIIllllllIlll[lIIlllllllIIl[6]]);
        }
        return lIIlllllllIIl[3];
    }

    private static boolean lIllIllIIlIIlIl(Object object) {
        return object == null;
    }

    @Inject
    protected o(i i2, SquireTitheConfig squireTitheConfig, Client client) {
        super(i2);
        this.U = squireTitheConfig;
        this.V = client;
    }

    private static void lIllIllIIIllIIl() {
        lIIllllllIlll = new String[lIIlllllllIIl[9]];
        o.lIIllllllIlll[o.lIIlllllllIIl[0]] = o."Farm door";
        o.lIIllllllIlll[o.lIIlllllllIIl[3]] = o."Open";
        o.lIIllllllIlll[o.lIIlllllllIIl[5]] = o."Seed table";
        o.lIIllllllIlll[o.lIIlllllllIIl[6]] = o."Search";
        o.lIIllllllIlll[o.lIIlllllllIIl[7]] = o."fruit";
        o.lIIllllllIlll[o.lIIlllllllIIl[8]] = o."seed";
    }
}

