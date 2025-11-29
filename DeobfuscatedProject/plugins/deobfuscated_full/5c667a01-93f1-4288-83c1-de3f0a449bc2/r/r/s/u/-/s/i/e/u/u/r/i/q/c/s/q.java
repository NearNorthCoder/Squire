/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b;

/* TASK: Eating food -> EatingfoodTask */
@TaskDesc(name="Eating food", priority=10000)
public class q
extends a {
    private static /* synthetic */ int[] lIIlIlIllIIII;
    private static /* synthetic */ String[] lIIlIlIlIllIl;

    private static boolean lIlIllIIIlIIlII(Object object) {
        return object == null;
    }

    private static String lIlIllIIIIlIllI(String var14, String var2) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIIlIlIllIIII[3], var3);
            return new String(var7.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    @Inject
    protected q(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
    }

    private static void lIlIllIIIlIIIlI() {
        lIIlIlIllIIII = new int[4];
        q.lIIlIlIllIIII[0] = (0xD0 ^ 0x84) & ~(0xF7 ^ 0xA3);
        q.lIIlIlIllIIII[1] = 1;
        q.lIIlIlIllIIII[2] = 3;
        q.lIIlIlIllIIII[3] = 2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a() {
        void var1_1;
        if (q.lIlIllIIIlIIIll(Combat.getCurrentHealth(), this.b.eatAt())) {
            return lIIlIlIllIIII[0];
        }
        Item var4 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIIlIlIllIIII[1]];
            stringArray[q.lIIlIlIllIIII[0]] = lIIlIlIlIllIl[lIIlIlIllIIII[3]];
            return item.hasAction(stringArray);
        });
        if (q.lIlIllIIIlIIlII(var4)) {
            q var13;
            Log.error((String)lIIlIlIlIllIl[lIIlIlIllIIII[0]]);
            var13.a.e(lIIlIlIllIIII[1]);
            return lIIlIlIllIIII[0];
        }
        var1_1.interact(lIIlIlIlIllIl[lIIlIlIllIIII[1]]);
        this.sleep(lIIlIlIllIIII[2]);
        return lIIlIlIllIIII[1];
    }

    private static void lIlIllIIIlIIIIl() {
        lIIlIlIlIllIl = new String[lIIlIlIllIIII[2]];
        q.lIIlIlIlIllIl[q.lIIlIlIllIIII[0]] = q."No food";
        q.lIIlIlIlIllIl[q.lIIlIlIllIIII[1]] = q."Eat";
        q.lIIlIlIlIllIl[q.lIIlIlIllIIII[3]] = q."Eat";
    }

    private static String lIlIllIIIIlIlIl(String var12, String var1) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var15 = var1.toCharArray();
        int var9 = lIIlIlIllIIII[0];
        char[] var5 = var12.toCharArray();
        int var8 = var5.length;
        int var6 = lIIlIlIllIIII[0];
        while (q.lIlIllIIIlIIlIl(var6, var8)) {
            char var16 = var5[var6];
            var11.append((char)(var16 ^ var15[var9 % var15.length]));
            0;
            ++var9;
            ++var6;
            0;
            if (((164 + 160 - 286 + 155 ^ 70 + 98 - 98 + 86) & (149 + 117 - 82 + 20 ^ 106 + 20 - 34 + 53 ^ -1)) != 2) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static boolean lIlIllIIIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIIIlIIIll(int n2, int n3) {
        return n2 > n3;
    }

    static {
        q.lIlIllIIIlIIIlI();
        q.lIlIllIIIlIIIIl();
    }
}

