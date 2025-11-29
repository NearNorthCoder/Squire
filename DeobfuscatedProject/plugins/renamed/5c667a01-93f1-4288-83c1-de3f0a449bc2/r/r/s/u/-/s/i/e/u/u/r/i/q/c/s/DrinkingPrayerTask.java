/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b_Unknown;

/* TASK: Drinking prayer -> DrinkingprayerTask */
@TaskDesc(name="Drinking prayer", priority=10000)
public class DrinkingPrayerTask
extends Task {
    private final /* synthetic */ SquireScurriusConfig aa;
    private final /* synthetic */ b ab;
    private static /* synthetic */ String[] lIIlIllIIlIlI;
    private static /* synthetic */ int[] lIIlIllIIlIll;
    private final /* synthetic */ SquireScurrius Z;

    private static String lIlIllIIlllIIII(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var3 = var5.toCharArray();
        int var10 = lIIlIllIIlIll[0];
        char[] var15 = var4.toCharArray();
        int var9 = var15.length;
        int var2 = lIIlIllIIlIll[0];
        while (p.lIlIllIIllllIII(var2, var9)) {
            char var11 = var15[var2];
            var13.append((char)(var11 ^ var3[var10 % var3.length]));
            0;
            ++var10;
            ++var2;
            0;
            
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean lIlIllIIlllIlll(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIlllIlIl(Object object) {
        return object == null;
    }

    private static String lIlIllIIlllIIIl(String var14, String var6) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var8 = Cipher.getInstance("Blowfish");
            var8.init(lIIlIllIIlIll[2], var7);
            return new String(var8.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    @Inject
    public p(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.Z = squireScurrius;
        this.aa = squireScurriusConfig;
        this.ab = squireScurrius.n();
    }

    private static boolean lIlIllIIllllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIIlllIlII(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (p.lIlIllIIlllIlII(Prayers.getPoints(), this.aa.drinkPrayerAt())) {
            return lIIlIllIIlIll[0];
        }
        Item var12 = Inventory.getFirst(item -> {
            int n2;
            if (!p.lIlIllIIlllIllI(item.getName().toLowerCase().contains(lIIlIllIIlIlI[lIIlIllIIlIll[1]]) ? 1 : 0) || p.lIlIllIIlllIlll(item.getName().toLowerCase().contains(lIIlIllIIlIlI[lIIlIllIIlIll[2]]) ? 1 : 0)) {
                n2 = lIIlIllIIlIll[1];
                0;
                if (1 < 0) {
                    return false;
                }
            } else {
                n2 = lIIlIllIIlIll[0];
            }
            return n2 != 0;
        });
        if (p.lIlIllIIlllIlIl(var12)) {
            return lIIlIllIIlIll[0];
        }
        var1_1.interact(lIIlIllIIlIlI[lIIlIllIIlIll[0]]);
        return lIIlIllIIlIll[1];
    }

    private static void lIlIllIIlllIIll() {
        lIIlIllIIlIll = new int[4];
        p.lIIlIllIIlIll[0] = (74 + 91 - 17 + 7 ^ 48 + 39 - -2 + 67) & (56 + 82 - 97 + 87 ^ 2 + 90 - 16 + 59 ^ -1);
        p.lIIlIllIIlIll[1] = 1;
        p.lIIlIllIIlIll[2] = 2;
        p.lIIlIllIIlIll[3] = 3;
    }

    private static void lIlIllIIlllIIlI() {
        lIIlIllIIlIlI = new String[lIIlIllIIlIll[3]];
        p.lIIlIllIIlIlI[p.lIIlIllIIlIll[0]] = p."Drink";
        p.lIIlIllIIlIlI[p.lIIlIllIIlIll[1]] = p."prayer potion";
        p.lIIlIllIIlIlI[p.lIIlIllIIlIll[2]] = p."super restore";
    }

    static {
        p.lIlIllIIlllIIll();
        p.lIlIllIIlllIIlI();
    }

    private static boolean lIlIllIIlllIllI(int n2) {
        return n2 == 0;
    }
}

