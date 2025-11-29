/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import gg.squire.client.plugins.fw.Task;
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
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Drinking energy boost -> DrinkingenergyboostTask */
@TaskDesc(name="Drinking energy boost", priority=20)
public class n
extends Task {
    private final /* synthetic */ SquireTitheConfig R;
    private final /* synthetic */ Client Q;
    private static /* synthetic */ int[] lIlIIIIIIlIll;
    private static /* synthetic */ String[] lIlIIIIIIlIlI;

    private static boolean lIllIllIlIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllIllIlIlIIlI() {
        lIlIIIIIIlIlI = new String[lIlIIIIIIlIll[6]];
        n.lIlIIIIIIlIlI[n.lIlIIIIIIlIll[0]] = n."Drink";
        n.lIlIIIIIIlIlI[n.lIlIIIIIIlIll[1]] = n."Drink";
        n.lIlIIIIIIlIlI[n.lIlIIIIIIlIll[2]] = n."energy";
        n.lIlIIIIIIlIlI[n.lIlIIIIIIlIll[3]] = n."energy";
        n.lIlIIIIIIlIlI[n.lIlIIIIIIlIll[4]] = n."Stamina";
        n.lIlIIIIIIlIlI[n.lIlIIIIIIlIll[5]] = n."Stamina";
    }

    private static void lIllIllIlIlIIll() {
        lIlIIIIIIlIll = new int[8];
        n.lIlIIIIIIlIll[0] = (0xC4 ^ 0x8B) & ~(0x54 ^ 0x1B);
        n.lIlIIIIIIlIll[1] = 1;
        n.lIlIIIIIIlIll[2] = 2;
        n.lIlIIIIIIlIll[3] = 3;
        n.lIlIIIIIIlIll[4] = 0x21 ^ 0x25;
        n.lIlIIIIIIlIll[5] = 0x6A ^ 0x61 ^ (0x47 ^ 0x49);
        n.lIlIIIIIIlIll[6] = 0x33 ^ 0xA ^ (0x8D ^ 0xB2);
        n.lIlIIIIIIlIll[7] = 1 + 127 - 63 + 65 ^ 107 + 60 - 113 + 84;
    }

    private static boolean lIllIllIlIlIlIl(int n2) {
        return n2 != 0;
    }

    private static String lIllIllIlIlIIII(String var2, String var8) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var9 = var8.toCharArray();
        int var15 = lIlIIIIIIlIll[0];
        char[] var14 = var2.toCharArray();
        int var3 = var14.length;
        int var13 = lIlIIIIIIlIll[0];
        while (n.lIllIllIlIlIllI(var13, var3)) {
            char var11 = var14[var13];
            var1.append((char)(var11 ^ var9[var15 % var9.length]));
            0;
            ++var15;
            ++var13;
            0;
            
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean lIllIllIlIlIlII(int n2) {
        return n2 == 0;
    }

    static {
        n.lIllIllIlIlIIll();
        n.lIllIllIlIlIIlI();
    }

    @Inject
    public n(Client client, SquireTitheConfig squireTitheConfig) {
        this.Q = client;
        this.R = squireTitheConfig;
    }

    private static String lIllIllIlIlIIIl(String var10, String var6) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIlIIIIIIlIll[2], var5);
            return new String(var12.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        n var16;
        if (n.lIllIllIlIlIlII(this.Q.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIIlIll[0];
        }
        if (n.lIllIllIlIlIlIl(Inventory.contains(item -> item.getName().startsWith(lIlIIIIIIlIlI[lIlIIIIIIlIll[5]])) ? 1 : 0) && n.lIllIllIlIlIlII(Movement.isStaminaBoosted() ? 1 : 0) && n.lIllIllIlIlIllI(Movement.getRunEnergy(), var16.R.energyBoostAt())) {
            Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIIlIlI[lIlIIIIIIlIll[4]])).interact(lIlIIIIIIlIlI[lIlIIIIIIlIll[0]]);
            return lIlIIIIIIlIll[1];
        }
        if (n.lIllIllIlIlIlIl(Inventory.contains(item -> item.getName().toLowerCase().contains(lIlIIIIIIlIlI[lIlIIIIIIlIll[3]])) ? 1 : 0) && n.lIllIllIlIlIllI(Movement.getRunEnergy(), var16.R.energyBoostAt())) {
            Inventory.getFirst(item -> item.getName().toLowerCase().contains(lIlIIIIIIlIlI[lIlIIIIIIlIll[2]])).interact(lIlIIIIIIlIlI[lIlIIIIIIlIll[1]]);
            return lIlIIIIIIlIll[1];
        }
        return lIlIIIIIIlIll[0];
    }

    private static String lIllIllIlIIllll(String var19, String var17) {
        try {
            SecretKeySpec var20 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIlIll[7]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIlIIIIIIlIll[2], var20);
            return new String(var18.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }
}

