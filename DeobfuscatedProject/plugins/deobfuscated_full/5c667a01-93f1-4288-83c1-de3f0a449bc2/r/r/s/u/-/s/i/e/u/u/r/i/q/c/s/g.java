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
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
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
public class g
extends Task {
    private static /* synthetic */ String[] lIIlIllIlIllI;
    private static /* synthetic */ int[] lIIlIllIlIlll;
    private final /* synthetic */ SquireScurriusConfig P;
    private final /* synthetic */ SquireScurrius O;

    private static void lIlIllIlIlIIIlI() {
        lIIlIllIlIlll = new int[7];
        g.lIIlIllIlIlll[0] = (0xC2 ^ 0x8B) & ~(0x73 ^ 0x3A);
        g.lIIlIllIlIlll[1] = 0x11 ^ 0x3F ^ (0x6C ^ 0x5C);
        g.lIIlIllIlIlll[2] = 0xCD ^ 0xC7;
        g.lIIlIllIlIlll[3] = 1;
        g.lIIlIllIlIlll[4] = 2;
        g.lIIlIllIlIlll[5] = 3;
        g.lIIlIllIlIlll[6] = 0xD7 ^ 0xB7 ^ (0xEB ^ 0x83);
    }

    private static String lIlIllIlIlIIIII(String var2, String var8) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIIlIllIlIlll[6]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIIlIllIlIlll[4], var6);
            return new String(var10.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIlIlIIIIl() {
        lIIlIllIlIllI = new String[lIIlIllIlIlll[5]];
        g.lIIlIllIlIllI[g.lIIlIllIlIlll[0]] = g."Drink";
        g.lIIlIllIlIllI[g.lIIlIllIlIlll[3]] = g."Drink";
        g.lIIlIllIlIllI[g.lIIlIllIlIlll[4]] = g."Stamina";
    }

    private static boolean lIlIllIlIlIIIll(Object object) {
        return object == null;
    }

    private static boolean lIlIllIlIlIIllI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        Item item2 = Inventory.getFirst(item -> item.getName().contains(lIIlIllIlIllI[lIIlIllIlIlll[4]]));
        if (g.lIlIllIlIlIIIll(item2)) {
            return lIIlIllIlIlll[0];
        }
        if (g.lIlIllIlIlIIlII(Movement.getRunEnergy(), lIIlIllIlIlll[1])) {
            return lIIlIllIlIlll[0];
        }
        if (g.lIlIllIlIlIIlIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            if (g.lIlIllIlIlIIllI(Movement.getRunEnergy(), lIIlIllIlIlll[2])) {
                void var3;
                var3.interact(lIIlIllIlIllI[lIIlIllIlIlll[0]]);
                return lIIlIllIlIlll[3];
            }
            return lIIlIllIlIlll[0];
        }
        item2.interact(lIIlIllIlIllI[lIIlIllIlIlll[3]]);
        return lIIlIllIlIlll[3];
    }

    private static boolean lIlIllIlIlIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    @Inject
    g(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.O = squireScurrius;
        this.P = squireScurriusConfig;
    }

    static {
        g.lIlIllIlIlIIIlI();
        g.lIlIllIlIlIIIIl();
    }

    private static String lIlIllIlIIllIII(String var11, String var1) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var5 = Cipher.getInstance("Blowfish");
            var5.init(lIIlIllIlIlll[4], var7);
            return new String(var5.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlIlIIlIl(int n2) {
        return n2 != 0;
    }
}

