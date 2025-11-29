/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;

/* TASK: Restoring prayer -> RestoringprayerTask */
@TaskDesc(name="Restoring prayer", priority=30000)
public class RestoringPrayerTask
extends Task {
    private static /* synthetic */ int[] lIlIIIlIlIIl;
    /* synthetic */ int cD;
    private final /* synthetic */ int cS = 5417;
    private static /* synthetic */ String[] lIlIIIlIlIII;
    private final /* synthetic */ SquireChambersPlugin cR;
    /* synthetic */ boolean cE;

    private static String llIlIllIIIlIIl(String var12, String var8) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIlIIIlIlIIl[7]), "DES");
            Cipher var18 = Cipher.getInstance("DES");
            var18.init(lIlIIIlIlIIl[5], var21);
            return new String(var18.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ak var1;
        if (ak.llIlIllIIIllIl(this.cR.E() ? 1 : 0)) {
            return lIlIIIlIlIIl[0];
        }
        if (ak.llIlIllIIIlllI(Prayers.getPoints(), lIlIIIlIlIIl[2])) {
            return lIlIIIlIlIIl[0];
        }
        if (ak.llIlIllIIIllll(var1.cR.L().a((Locatable)Players.getLocal()) ? 1 : 0) && ak.llIlIllIIlIIII(Static.getClient().getVarbitValue(lIlIIIlIlIIl[1])) && ak.llIlIllIIlIIIl((Object)var1.cR.L().aM(), (Object)N.VESPULA)) {
            return lIlIIIlIlIIl[0];
        }
        Item var7 = Inventory.getFirst(item -> {
            int n2;
            if (!ak.llIlIllIIIllIl(item.getName().startsWith(lIlIIIlIlIII[lIlIIIlIlIIl[4]]) ? 1 : 0) || !ak.llIlIllIIIllIl(item.getName().startsWith(lIlIIIlIlIII[lIlIIIlIlIIl[5]]) ? 1 : 0) || ak.llIlIllIIIllll(item.getName().startsWith(lIlIIIlIlIII[lIlIIIlIlIIl[3]]) ? 1 : 0)) {
                n2 = lIlIIIlIlIIl[4];
                0;
                if (1 <= 0) {
                    return ((0x3E ^ 0x68 ^ (1 ^ 0x7A)) & (0x64 ^ 0x43 ^ (0x62 ^ 0x68) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIIIlIlIIl[0];
            }
            return n2 != 0;
        });
        if (ak.llIlIllIIlIIlI(var7)) {
            return lIlIIIlIlIIl[0];
        }
        var1_1.interact(lIlIIIlIlIII[lIlIIIlIlIIl[0]]);
        this.sleep(lIlIIIlIlIIl[3]);
        return lIlIIIlIlIIl[4];
    }

    private static void llIlIllIIIlIll() {
        lIlIIIlIlIII = new String[lIlIIIlIlIIl[6]];
        ak.lIlIIIlIlIII[ak.lIlIIIlIlIIl[0]] = ak."Drink";
        ak.lIlIIIlIlIII[ak.lIlIIIlIlIIl[4]] = ak."Prayer potion";
        ak.lIlIIIlIlIII[ak.lIlIIIlIlIIl[5]] = ak."Super restore";
        ak.lIlIIIlIlIII[ak.lIlIIIlIlIIl[3]] = ak."Revitalisation";
    }

    private static void llIlIllIIIllII() {
        lIlIIIlIlIIl = new int[8];
        ak.lIlIIIlIlIIl[0] = (58 + 30 - 66 + 118 ^ 48 + 113 - 98 + 105) & (0x9B ^ 0xB6 ^ (0x90 ^ 0x99) ^ -1);
        ak.lIlIIIlIlIIl[1] = 0xFFFFB77F & 0x5DA9;
        ak.lIlIIIlIlIIl[2] = 0x62 ^ 0x67;
        ak.lIlIIIlIlIIl[3] = 3;
        ak.lIlIIIlIlIIl[4] = 1;
        ak.lIlIIIlIlIIl[5] = 2;
        ak.lIlIIIlIlIIl[6] = 0x10 ^ 0x14;
        ak.lIlIIIlIlIIl[7] = 121 + 3 - 115 + 150 ^ 108 + 64 - 83 + 62;
    }

    private static boolean llIlIllIIIllIl(int n2) {
        return n2 == 0;
    }

    @Inject
    public ak(SquireChambersPlugin squireChambersPlugin) {
        this.cD = lIlIIIlIlIIl[0];
        this.cE = lIlIIIlIlIIl[0];
        this.cS = lIlIIIlIlIIl[1];
        this.cR = squireChambersPlugin;
    }

    private static String llIlIllIIIlIlI(String var15, String var5) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIlIIIlIlIIl[5], var6);
            return new String(var16.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean llIlIllIIlIIII(int n2) {
        return n2 > 0;
    }

    private static boolean llIlIllIIIlllI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIlIllIIIllll(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIllIIlIIlI(Object object) {
        return object == null;
    }

    static {
        ak.llIlIllIIIllII();
        ak.llIlIllIIIlIll();
    }

    private static boolean llIlIllIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIlIllIIlIIIl(Object object, Object object2) {
        return object == object2;
    }

    private static String llIlIllIIIlIII(String var14, String var10) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var17 = var10.toCharArray();
        int var13 = lIlIIIlIlIIl[0];
        char[] var19 = var14.toCharArray();
        int var11 = var19.length;
        int var9 = lIlIIIlIlIIl[0];
        while (ak.llIlIllIIlIIll(var9, var11)) {
            char var3 = var19[var9];
            var2.append((char)(var3 ^ var17[var13 % var17.length]));
            0;
            ++var13;
            ++var9;
            0;
            if (2 >= 1) continue;
            return null;
        }
        return String.valueOf(var2);
    }
}

