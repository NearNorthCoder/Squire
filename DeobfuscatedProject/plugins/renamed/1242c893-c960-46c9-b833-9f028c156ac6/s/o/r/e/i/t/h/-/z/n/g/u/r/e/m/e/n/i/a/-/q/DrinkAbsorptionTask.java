/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 */
package s.o.r.e.i.t.h.-.z.n.g.u.r.e.m.e.n.i.a.-.q;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmarezone.SquireNightmareZone;
import gg.squire.nightmarezone.SquireNightmareZoneConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;

/* TASK: Drink Absorption -> DrinkabsorptionTask */
@TaskDesc(name="Drink Absorption", priority=19, blocking=true)
public class DrinkAbsorptionTask
extends Task {
    private static /* synthetic */ String[] lIIIlIIIlIIIl;
    private /* synthetic */ int J;
    private final /* synthetic */ SquireNightmareZoneConfig G;
    private static /* synthetic */ int[] lIIIlIIIlIlII;
    private /* synthetic */ int I;
    private /* synthetic */ boolean K;
    private final /* synthetic */ SquireNightmareZone F;
    private final /* synthetic */ Client H;

    private static boolean lIIllllIlIIIIIl(int n2) {
        return n2 != 0;
    }

    static {
        e.lIIllllIIllllll();
        e.lIIllllIIlllIIl();
    }

    private static void lIIllllIIllllll() {
        lIIIlIIIlIlII = new int[9];
        e.lIIIlIIIlIlII[0] = 0xFFFFA5FE & 0x5BF5;
        e.lIIIlIIIlIlII[1] = 0x76 ^ 0x33 ^ (0x28 ^ 9);
        e.lIIIlIIIlIlII[2] = (0xB8 ^ 0x85 ^ (0x4D ^ 0x3E)) & (70 + 53 - 74 + 164 ^ 62 + 73 - 82 + 102 ^ -1);
        e.lIIIlIIIlIlII[3] = 0xFFFFCFFF & 0x3F73;
        e.lIIIlIIIlIlII[4] = -(0xFFFFF0AF & 0x3FD9) & (0xFFFFBFFD & 0x7FFE);
        e.lIIIlIIIlIlII[5] = 1;
        e.lIIIlIIIlIlII[6] = 2;
        e.lIIIlIIIlIlII[7] = 3;
        e.lIIIlIIIlIlII[8] = 0x84 ^ 0x8C;
    }

    @Inject
    public e(SquireNightmareZone squireNightmareZone, SquireNightmareZoneConfig squireNightmareZoneConfig, Client client) {
        this.I = lIIIlIIIlIlII[0];
        this.J = lIIIlIIIlIlII[1];
        this.K = lIIIlIIIlIlII[2];
        this.F = squireNightmareZone;
        this.G = squireNightmareZoneConfig;
        this.H = client;
    }

    private static String lIIllllIIlllIII(String var8, String var17) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var2 = var17.toCharArray();
        int var18 = lIIIlIIIlIlII[2];
        char[] var3 = var8.toCharArray();
        int var9 = var3.length;
        int var5 = lIIIlIIIlIlII[2];
        while (e.lIIllllIlIIIIll(var5, var9)) {
            char var21 = var3[var5];
            var15.append((char)(var21 ^ var2[var18 % var2.length]));
            0;
            ++var18;
            ++var5;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

    private static void lIIllllIIlllIIl() {
        lIIIlIIIlIIIl = new String[lIIIlIIIlIlII[7]];
        e.lIIIlIIIlIIIl[e.lIIIlIIIlIlII[2]] = e."Absorption potion is null D:";
        e.lIIIlIIIlIIIl[e.lIIIlIIIlIlII[5]] = e."Drink";
        e.lIIIlIIIlIIIl[e.lIIIlIIIlIlII[6]] = e."Absorption (";
    }

    private static boolean lIIllllIlIIIIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        e var7;
        if (e.lIIllllIlIIIIII(this.G.absorption())) {
            return lIIIlIIIlIlII[2];
        }
        if (e.lIIllllIlIIIIII(var7.H.isInInstancedRegion() ? 1 : 0)) {
            return lIIIlIIIlIlII[2];
        }
        int var19 = Static.getClient().getVarbitValue(lIIIlIIIlIlII[3]);
        if (e.lIIllllIlIIIIIl(var7.G.overload()) && e.lIIllllIlIIIIII(var19)) {
            return lIIIlIIIlIlII[2];
        }
        int var1 = Static.getClient().getVarbitValue(lIIIlIIIlIlII[4]);
        if (e.lIIllllIlIIIIlI(var7.J, var1)) {
            var7.K = lIIIlIIIlIlII[5];
        }
        if (e.lIIllllIlIIIIll(var7.I, var1)) {
            var7.K = lIIIlIIIlIlII[2];
        }
        if (e.lIIllllIlIIIIII(var7.K ? 1 : 0)) {
            return lIIIlIIIlIlII[2];
        }
        Item var11 = Inventory.getFirst(item -> item.getName().startsWith(lIIIlIIIlIIIl[lIIIlIIIlIlII[6]]));
        if (e.lIIllllIlIIIlII(var11)) {
            System.out.println(lIIIlIIIlIIIl[lIIIlIIIlIlII[2]]);
            return lIIIlIIIlIlII[2];
        }
        var3_3.interact(lIIIlIIIlIIIl[lIIIlIIIlIlII[5]]);
        return lIIIlIIIlIlII[5];
    }

    private static boolean lIIllllIlIIIIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIllllIIllIlII(String var12, String var4) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var14 = Cipher.getInstance("Blowfish");
            var14.init(lIIIlIIIlIlII[6], var23);
            return new String(var14.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static String lIIllllIIllIlll(String var13, String var20) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), lIIIlIIIlIlII[8]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIIIlIIIlIlII[6], var10);
            return new String(var6.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllllIlIIIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllllIlIIIlII(Object object) {
        return object == null;
    }
}

