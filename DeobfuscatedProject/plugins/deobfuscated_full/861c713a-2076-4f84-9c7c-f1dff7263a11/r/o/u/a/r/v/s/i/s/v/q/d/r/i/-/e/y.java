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
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e;

/* TASK: Drinking prayer -> DrinkingprayerTask */
@TaskDesc(name="Drinking prayer", priority=10000)
public class y
extends Task {
    private static /* synthetic */ int[] lIlIlIIIlIllI;
    private final /* synthetic */ SquireVardorvis aq;
    private final /* synthetic */ e as;
    private final /* synthetic */ SquireVardorvisConfig ar;
    private static /* synthetic */ String[] lIlIlIIIlIlIl;

    static {
        y.lIllllIlIlllIIl();
        y.lIllllIlIlllIII();
    }

    private static void lIllllIlIlllIIl() {
        lIlIlIIIlIllI = new int[5];
        y.lIlIlIIIlIllI[0] = (168 + 42 - 146 + 153 ^ 10 + 95 - 83 + 177) & (0xF6 ^ 0x84 ^ (0x26 ^ 0x4A) ^ -1);
        y.lIlIlIIIlIllI[1] = 1;
        y.lIlIlIIIlIllI[2] = 2;
        y.lIlIlIIIlIllI[3] = 3;
        y.lIlIlIIIlIllI[4] = 9 ^ 0x62 ^ (8 ^ 0x6B);
    }

    private static String lIllllIlIllIllI(String var4, String var5) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlIlIIIlIllI[2], var7);
            return new String(var1.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String lIllllIlIllIlll(String var9, String var10) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIlIlIIIlIllI[4]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIlIlIIIlIllI[2], var11);
            return new String(var6.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (y.lIllllIlIlllIlI(Prayers.getPoints(), this.ar.drinkPrayerAt())) {
            return lIlIlIIIlIllI[0];
        }
        Item var3 = Inventory.getFirst(item -> {
            int n2;
            if (!y.lIllllIlIllllII(item.getName().toLowerCase().contains(lIlIlIIIlIlIl[lIlIlIIIlIllI[1]]) ? 1 : 0) || y.lIllllIlIllllIl(item.getName().toLowerCase().contains(lIlIlIIIlIlIl[lIlIlIIIlIllI[2]]) ? 1 : 0)) {
                n2 = lIlIlIIIlIllI[1];
                0;
                if (3 <= -1) {
                    return (3 & (3 ^ -1)) != 0;
                }
            } else {
                n2 = lIlIlIIIlIllI[0];
            }
            return n2 != 0;
        });
        if (y.lIllllIlIlllIll(var3)) {
            return lIlIlIIIlIllI[0];
        }
        var1_1.interact(lIlIlIIIlIlIl[lIlIlIIIlIllI[0]]);
        return lIlIlIIIlIllI[1];
    }

    private static boolean lIllllIlIlllIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lIllllIlIlllIII() {
        lIlIlIIIlIlIl = new String[lIlIlIIIlIllI[3]];
        y.lIlIlIIIlIlIl[y.lIlIlIIIlIllI[0]] = y."Drink";
        y.lIlIlIIIlIlIl[y.lIlIlIIIlIllI[1]] = y."prayer potion";
        y.lIlIlIIIlIlIl[y.lIlIlIIIlIllI[2]] = y."super restore";
    }

    private static boolean lIllllIlIlllIll(Object object) {
        return object == null;
    }

    private static boolean lIllllIlIllllII(int n2) {
        return n2 == 0;
    }

    private static boolean lIllllIlIllllIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public y(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig) {
        this.aq = squireVardorvis;
        this.ar = squireVardorvisConfig;
        this.as = squireVardorvis.j();
    }
}

