/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

/* TASK: Stamina handler -> StaminahandlerTask */
@TaskDesc(name="Stamina handler", priority=2137483647)
public class StaminaHandlerTask
extends Task {
    private final /* synthetic */ SquireSepulchre aA;
    private final /* synthetic */ SquireSepulchreConfig aB;
    private static /* synthetic */ int[] lllIIIlIIlII;
    private static /* synthetic */ String[] lllIIIlIIIll;

    private static String lIIIlIIIllllIlI(String var4, String var18) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var18.getBytes(StandardCharsets.UTF_8)), lllIIIlIIlII[6]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lllIIIlIIlII[4], var10);
            return new String(var8.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIIIlllllII(String var5, String var11) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var6 = var11.toCharArray();
        int var14 = lllIIIlIIlII[0];
        char[] var7 = var5.toCharArray();
        int var19 = var7.length;
        int var1 = lllIIIlIIlII[0];
        while (T.lIIIlIIlIIIIIlI(var1, var19)) {
            char var16 = var7[var1];
            var17.append((char)(var16 ^ var6[var14 % var6.length]));
            0;
            ++var14;
            ++var1;
            0;
            if (((0xE0 ^ 0xB1 ^ (0x9B ^ 0xC6)) & (0x7E ^ 0x68 ^ (0x96 ^ 0x8C) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static boolean lIIIlIIlIIIIIIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIIIlllllll(Object object) {
        return object == null;
    }

    private static boolean lIIIlIIlIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIlIIIlllllIl() {
        lllIIIlIIIll = new String[lllIIIlIIlII[5]];
        T.lllIIIlIIIll[T.lllIIIlIIlII[0]] = T."Drink";
        T.lllIIIlIIIll[T.lllIIIlIIlII[3]] = T."Drink";
        T.lllIIIlIIIll[T.lllIIIlIIlII[4]] = T."Stamina";
    }

    private static void lIIIlIIIllllllI() {
        lllIIIlIIlII = new int[7];
        T.lllIIIlIIlII[0] = (0x4B ^ 0x7F ^ (0xCE ^ 0x9B)) & (96 + 239 - 325 + 235 ^ 124 + 76 - 82 + 30 ^ -1);
        T.lllIIIlIIlII[1] = 0x8F ^ 0x91;
        T.lllIIIlIIlII[2] = 0x37 ^ 0x3D;
        T.lllIIIlIIlII[3] = 1;
        T.lllIIIlIIlII[4] = 2;
        T.lllIIIlIIlII[5] = 3;
        T.lllIIIlIIlII[6] = 3 ^ (0xB4 ^ 0xBF);
    }

    private static boolean lIIIlIIlIIIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    T(SquireSepulchre squireSepulchre, SquireSepulchreConfig squireSepulchreConfig) {
        this.aA = squireSepulchre;
        this.aB = squireSepulchreConfig;
    }

    static {
        T.lIIIlIIIllllllI();
        T.lIIIlIIIlllllIl();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(lllIIIlIIIll[lllIIIlIIlII[4]]));
        if (T.lIIIlIIIlllllll(item2)) {
            return lllIIIlIIlII[0];
        }
        if (T.lIIIlIIlIIIIIII(Movement.getRunEnergy(), lllIIIlIIlII[1])) {
            return lllIIIlIIlII[0];
        }
        if (T.lIIIlIIlIIIIIIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            if (T.lIIIlIIlIIIIIlI(Movement.getRunEnergy(), lllIIIlIIlII[2])) {
                void var2;
                var2.interact(lllIIIlIIIll[lllIIIlIIlII[0]]);
                return lllIIIlIIlII[3];
            }
            return lllIIIlIIlII[0];
        }
        item2.interact(lllIIIlIIIll[lllIIIlIIlII[3]]);
        return lllIIIlIIlII[3];
    }

    private static String lIIIlIIIllllIll(String var9, String var15) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var15.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var20 = Cipher.getInstance("Blowfish");
            var20.init(lllIIIlIIlII[4], var12);
            return new String(var20.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }
}

