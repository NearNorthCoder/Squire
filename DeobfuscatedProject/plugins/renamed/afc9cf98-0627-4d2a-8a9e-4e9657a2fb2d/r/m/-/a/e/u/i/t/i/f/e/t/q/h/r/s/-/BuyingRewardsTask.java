/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
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
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.HerbType;

/* TASK: Buying Rewards -> BuyingrewardsTask */
@TaskDesc(name="Buying Rewards", priority=0x7FFFFFFF, blocking=true)
public class BuyingRewardsTask
extends Task {
    private /* synthetic */ boolean M;
    private static final /* synthetic */ int F;
    private static final /* synthetic */ int G;
    private final /* synthetic */ Client L;
    private final /* synthetic */ SquireTitheConfig K;
    private static final /* synthetic */ int E;
    private static /* synthetic */ String[] lIIllllllllIl;
    private static final /* synthetic */ int H;
    private static final /* synthetic */ int J;
    private static final /* synthetic */ int I;
    private static /* synthetic */ int[] lIIlllllllllI;

    private static boolean lIllIllIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIllIIlIlIlI(String var16, String var25) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var10 = var25.toCharArray();
        int var4 = lIIlllllllllI[0];
        char[] var15 = var16.toCharArray();
        int var22 = var15.length;
        int var9 = lIIlllllllllI[0];
        while (k.lIllIllIIllIIlI(var9, var22)) {
            char var19 = var15[var9];
            var1.append((char)(var19 ^ var10[var4 % var10.length]));
            0;
            ++var4;
            ++var9;
            0;
            if (-2 < 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean lIllIllIIllIIIl(Object object) {
        return object != null;
    }

    public boolean run() {
        k var2;
        if (k.lIllIllIIlIllll(this.L.isInInstancedRegion() ? 1 : 0)) {
            this.M = lIIlllllllllI[0];
            return lIIlllllllllI[0];
        }
        if (k.lIllIllIIlIllll(var2.M ? 1 : 0)) {
            return lIIlllllllllI[0];
        }
        if (k.lIllIllIIllIIII((Object)var2.K.buyItems(), (Object)a.NONE)) {
            return lIIlllllllllI[0];
        }
        String[] stringArray = new String[lIIlllllllllI[1]];
        stringArray[k.lIIlllllllllI[0]] = lIIllllllllIl[lIIlllllllllI[0]];
        stringArray[k.lIIlllllllllI[2]] = lIIllllllllIl[lIIlllllllllI[2]];
        Item var29 = Inventory.getFirst((String[])stringArray);
        if (k.lIllIllIIllIIIl(var29)) {
            var29.interact(lIIllllllllIl[lIIlllllllllI[1]]);
            return lIIlllllllllI[2];
        }
        int var28 = Vars.getBit((int)lIIlllllllllI[3]);
        if (k.lIllIllIIllIIlI(var28, lIIlllllllllI[4])) {
            var2.M = lIIlllllllllI[2];
            return lIIlllllllllI[0];
        }
        Widget var17 = var2.L.getWidget(lIIlllllllllI[5]);
        if (k.lIllIllIIllIIll(Widgets.isVisible((Widget)var17) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIlllllllllI[2]];
            stringArray2[k.lIIlllllllllI[0]] = lIIllllllllIl[lIIlllllllllI[6]];
            NPC var23 = NPCs.getNearest((String[])stringArray2);
            if (k.lIllIllIIllIlII(var23)) {
                return lIIlllllllllI[0];
            }
            var23.interact(lIIllllllllIl[lIIlllllllllI[7]]);
            return lIIlllllllllI[2];
        }
        this.x();
        0;
        return lIIlllllllllI[2];
    }

    @Inject
    public k(SquireTitheConfig squireTitheConfig, Client client) {
        this.K = squireTitheConfig;
        this.L = client;
    }

    private static boolean lIllIllIIlIllll(int n2) {
        return n2 != 0;
    }

    static {
        k.lIllIllIIlIlllI();
        k.lIllIllIIlIllIl();
        I = lIIlllllllllI[10];
        J = lIIlllllllllI[11];
        G = lIIlllllllllI[8];
        H = lIIlllllllllI[9];
        E = lIIlllllllllI[5];
        F = lIIlllllllllI[4];
    }

    private static String lIllIllIIlIlIll(String var8, String var20) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIIlllllllllI[14]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lIIlllllllllI[1], var11);
            return new String(var21.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public boolean x() {
        k var14;
        Widget var18;
        int var12;
        int n2;
        if (k.lIllIllIIllIIII((Object)this.K.buyItems(), (Object)a.HERB_BOX)) {
            n2 = lIIlllllllllI[8];
            0;
            if ((54 + 20 - 69 + 133 ^ 136 + 82 - 134 + 58) == 0) {
                return ((0x24 ^ 0xE ^ (0x1D ^ 0x22)) & (72 + 81 - 101 + 85 ^ 43 + 18 - -89 + 6 ^ -1)) != 0;
            }
        } else {
            n2 = var12 = lIIlllllllllI[9];
        }
        if (k.lIllIllIIllIlII(var18 = var14.L.getWidget(lIIlllllllllI[10]))) {
            return lIIlllllllllI[0];
        }
        Widget var24 = var18.getDynamicChildren()[var12];
        if (k.lIllIllIIllIlII(var24)) {
            return lIIlllllllllI[0];
        }
        Object[] var26 = var24.getOnOpListener();
        var14.L.runScript(var26);
        Widget var3 = var14.L.getWidget(lIIlllllllllI[11]);
        if (k.lIllIllIIllIIIl(var3)) {
            var3.interact(lIIllllllllIl[lIIlllllllllI[12]]);
            return lIIlllllllllI[2];
        }
        return lIIlllllllllI[0];
    }

    private static boolean lIllIllIIllIlII(Object object) {
        return object == null;
    }

    private static void lIllIllIIlIlllI() {
        lIIlllllllllI = new int[15];
        k.lIIlllllllllI[0] = (15 + 59 - 45 + 149 ^ 51 + 145 - 144 + 111) & (0x3D ^ 0x29 ^ (0x10 ^ 0x15) ^ -1);
        k.lIIlllllllllI[1] = 2;
        k.lIIlllllllllI[2] = 1;
        k.lIIlllllllllI[3] = -(0xFFFFA4ED & 0x7FD3) & (0xFFFFFFFD & 0x37DF);
        k.lIIlllllllllI[4] = 0x15 ^ 0xB;
        k.lIIlllllllllI[5] = -(0xFFFFEFB9 & 0x5DFF) & (0xFFFFFFFF & 0xEC4DBF);
        k.lIIlllllllllI[6] = 3;
        k.lIIlllllllllI[7] = 0x98 ^ 0x92 ^ (0x5A ^ 0x54);
        k.lIIlllllllllI[8] = 0xE1 ^ 0x99 ^ (0x57 ^ 0x4F);
        k.lIIlllllllllI[9] = 0x73 ^ 0x1F;
        k.lIIlllllllllI[10] = 0xFFFFE269 & 0x3331DB7;
        k.lIIlllllllllI[11] = -(0xFFFFEF6F & 0x3FD2) & (0xFFFFFF5D & 0x3332FFF);
        k.lIIlllllllllI[12] = 0x27 ^ 0x22;
        k.lIIlllllllllI[13] = 0x7A ^ 0x7C;
        k.lIIlllllllllI[14] = 0xD0 ^ 0xA0 ^ (0x7B ^ 3);
    }

    private static boolean lIllIllIIllIIII(Object object, Object object2) {
        return object == object2;
    }

    private static String lIllIllIIlIllII(String var30, String var13) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var27 = Cipher.getInstance("Blowfish");
            var27.init(lIIlllllllllI[1], var7);
            return new String(var27.doFinal(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static void lIllIllIIlIllIl() {
        lIIllllllllIl = new String[lIIlllllllllI[13]];
        k.lIIllllllllIl[k.lIIlllllllllI[0]] = k."Herb box";
        k.lIIllllllllIl[k.lIIlllllllllI[2]] = k."Seed pack";
        k.lIIllllllllIl[k.lIIlllllllllI[1]] = k."Bank-all";
        k.lIIllllllllIl[k.lIIlllllllllI[6]] = k."Farmer Gricoller";
        k.lIIllllllllIl[k.lIIlllllllllI[7]] = k."Rewards";
        k.lIIllllllllIl[k.lIIlllllllllI[12]] = k."Buy-50";
    }

    private static boolean lIllIllIIllIIll(int n2) {
        return n2 == 0;
    }
}

