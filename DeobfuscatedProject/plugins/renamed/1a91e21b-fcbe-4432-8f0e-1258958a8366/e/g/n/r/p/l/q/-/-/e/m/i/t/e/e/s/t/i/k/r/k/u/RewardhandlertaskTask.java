/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;

/* TASK: RewardHandlerTask -> RewardhandlertaskTask */
@TaskDesc(name="RewardHandlerTask", priority=10, blocking=true)
public class RewardhandlertaskTask
extends Task {
    private static /* synthetic */ int[] lIIllIlIIIIlI;
    private static /* synthetic */ String[] lIIllIlIIIIII;
    private final /* synthetic */ String[] N;
    private final /* synthetic */ TempleTrekkingConfig M;
    private final /* synthetic */ TempleTrekkingPlugin L;

    private static void lIllIIIIIlIlIIl() {
        lIIllIlIIIIlI = new int[18];
        o.lIIllIlIIIIlI[0] = 0x4F ^ 0x48;
        o.lIIllIlIIIIlI[1] = (0x87 ^ 0xC7) & ~(0x70 ^ 0x30);
        o.lIIllIlIIIIlI[2] = 1;
        o.lIIllIlIIIIlI[3] = 2;
        o.lIIllIlIIIIlI[4] = 3;
        o.lIIllIlIIIIlI[5] = 0x2D ^ 0x4A ^ (0x7F ^ 0x1C);
        o.lIIllIlIIIIlI[6] = 0xBB ^ 0x8A ^ (0xA4 ^ 0x90);
        o.lIIllIlIIIIlI[7] = 0 ^ 0x6E ^ (0x55 ^ 0x3D);
        o.lIIllIlIIIIlI[8] = 0x46 ^ 0x4E;
        o.lIIllIlIIIIlI[9] = 0x4D ^ 0x44;
        o.lIIllIlIIIIlI[10] = 0xFFFFF95E & 0x7B3;
        o.lIIllIlIIIIlI[11] = 0xBC ^ 0xB7;
        o.lIIllIlIIIIlI[12] = 26 + 85 - 86 + 149 ^ 154 + 120 - 191 + 81;
        o.lIIllIlIIIIlI[13] = 140 + 62 - 20 + 3 ^ 13 + 135 - 99 + 132;
        o.lIIllIlIIIIlI[14] = 155 + 186 - 249 + 108 ^ 56 + 21 - 29 + 149;
        o.lIIllIlIIIIlI[15] = 0x10 ^ 0x5C ^ (0x21 ^ 0x63);
        o.lIIllIlIIIIlI[16] = 7 ^ 0x76 ^ (0x5C ^ 0x22);
        o.lIIllIlIIIIlI[17] = 0x69 ^ 0x79;
    }

    static {
        o.lIllIIIIIlIlIIl();
        o.lIllIIIIIlIIlll();
    }

    @Inject
    public o(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig) {
        String[] stringArray = new String[lIIllIlIIIIlI[0]];
        stringArray[o.lIIllIlIIIIlI[1]] = lIIllIlIIIIII[lIIllIlIIIIlI[1]];
        stringArray[o.lIIllIlIIIIlI[2]] = lIIllIlIIIIII[lIIllIlIIIIlI[2]];
        stringArray[o.lIIllIlIIIIlI[3]] = lIIllIlIIIIII[lIIllIlIIIIlI[3]];
        stringArray[o.lIIllIlIIIIlI[4]] = lIIllIlIIIIII[lIIllIlIIIIlI[4]];
        stringArray[o.lIIllIlIIIIlI[5]] = lIIllIlIIIIII[lIIllIlIIIIlI[5]];
        stringArray[o.lIIllIlIIIIlI[6]] = lIIllIlIIIIII[lIIllIlIIIIlI[6]];
        stringArray[o.lIIllIlIIIIlI[7]] = lIIllIlIIIIII[lIIllIlIIIIlI[7]];
        this.N = stringArray;
        this.L = templeTrekkingPlugin;
        this.M = templeTrekkingConfig;
    }

    private static boolean lIllIIIIIlIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIIIlIlIll(int n2) {
        return n2 != 0;
    }

    private static String lIllIIIIIlIIIll(String var19, String var8) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIIllIlIIIIlI[3], var10);
            return new String(var7.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIIlIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIIIIIlIIIIl(String var1, String var24) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), lIIllIlIIIIlI[8]), "DES");
            Cipher var17 = Cipher.getInstance("DES");
            var17.init(lIIllIlIIIIlI[3], var2);
            return new String(var17.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIlIIlll() {
        lIIllIlIIIIII = new String[lIIllIlIIIIlI[17]];
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[1]] = o."Agility tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[2]] = o."Firemaking tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[3]] = o."Fishing tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[4]] = o."Mining tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[5]] = o."Slayer tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[6]] = o."Thieving tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[7]] = o."Woodcutting tome";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[0]] = o."Read";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[8]] = o."Reward token";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[9]] = o."Reward token";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[12]] = o."Claiming rewards";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[11]] = o."Claim";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[13]] = o."Selecting rewards";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[14]] = o."Details";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[15]] = o."Opening interface";
        o.lIIllIlIIIIII[o.lIIllIlIIIIlI[16]] = o."Look-at";
    }

    private static boolean lIllIIIIIlIllII(Object object) {
        return object != null;
    }

    private static String lIllIIIIIlIIllI(String var14, String var6) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var13 = var6.toCharArray();
        int var18 = lIIllIlIIIIlI[1];
        char[] var5 = var14.toCharArray();
        int var4 = var5.length;
        int var9 = lIIllIlIIIIlI[1];
        while (o.lIllIIIIIlIlllI(var9, var4)) {
            char var15 = var5[var9];
            var21.append((char)(var15 ^ var13[var18 % var13.length]));
            0;
            ++var18;
            ++var9;
            0;
            if (2 >= 2) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    public boolean run() {
        Item item;
        if (o.lIllIIIIIlIlIlI(this.M.bankXPTomes() ? 1 : 0) && o.lIllIIIIIlIlIll(Inventory.contains((String[])this.N) ? 1 : 0) && o.lIllIIIIIlIllII(item = Inventory.getFirst((String[])this.N))) {
            item.interact(lIIllIlIIIIII[lIIllIlIIIIlI[0]]);
            return lIIllIlIIIIlI[2];
        }
        String[] stringArray = new String[lIIllIlIIIIlI[2]];
        stringArray[o.lIIllIlIIIIlI[1]] = lIIllIlIIIIII[lIIllIlIIIIlI[8]];
        if (o.lIllIIIIIlIlIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            return lIIllIlIIIIlI[1];
        }
        String[] stringArray2 = new String[lIIllIlIIIIlI[2]];
        stringArray2[o.lIIllIlIIIIlI[1]] = lIIllIlIIIIII[lIIllIlIIIIlI[9]];
        Item var16 = Inventory.getFirst((String[])stringArray2);
        if (o.lIllIIIIIlIllII(var16)) {
            o var11;
            Widget var20 = Widgets.get((int)lIIllIlIIIIlI[10], (int)lIIllIlIIIIlI[11]);
            if (o.lIllIIIIIlIllII(var20) && o.lIllIIIIIlIlIll(var20.isVisible() ? 1 : 0)) {
                System.out.println(lIIllIlIIIIII[lIIllIlIIIIlI[12]]);
                var20.interact(lIIllIlIIIIII[lIIllIlIIIIlI[11]]);
                return lIIllIlIIIIlI[2];
            }
            int var3 = var11.M.reward().x();
            Widget var12 = Widgets.get((int)lIIllIlIIIIlI[10], (int)lIIllIlIIIIlI[7], (int)var3);
            if (o.lIllIIIIIlIllII(var12)) {
                System.out.println(lIIllIlIIIIII[lIIllIlIIIIlI[13]]);
                var12.interact(lIIllIlIIIIII[lIIllIlIIIIlI[14]]);
                return lIIllIlIIIIlI[2];
            }
            System.out.println(lIIllIlIIIIII[lIIllIlIIIIlI[15]]);
            var16.interact(lIIllIlIIIIII[lIIllIlIIIIlI[16]]);
            return lIIllIlIIIIlI[2];
        }
        return lIIllIlIIIIlI[1];
    }
}

