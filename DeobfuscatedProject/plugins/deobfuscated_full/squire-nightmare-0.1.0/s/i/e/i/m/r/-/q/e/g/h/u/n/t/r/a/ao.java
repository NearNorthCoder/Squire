/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

/* TASK: Cleansing parasite -> CleansingparasiteTask */
@TaskDesc(name="Cleansing parasite", priority=0x7FFFFFFF, blocking=true, register=true)
public class ao
extends Task {
    private final /* synthetic */ h eh;
    private final /* synthetic */ SquireNightmarePlugin eg;
    private static /* synthetic */ String[] llllIIIlllll;
    private static final /* synthetic */ Logger ef;
    private final /* synthetic */ SquireNightmareConfig ei;
    private static /* synthetic */ int[] llllIIlIIIII;

    private static void lIIIllllIlIlllI() {
        llllIIlIIIII = new int[7];
        ao.llllIIlIIIII[0] = (0xC3 ^ 0x91 ^ (0x65 ^ 5) & ~(0x32 ^ 0x52)) & (133 + 87 - 146 + 157 ^ 35 + 122 - 8 + 32 ^ -1);
        ao.llllIIlIIIII[1] = -(0xFFFF9E51 & 0x69EF) & (0xFFFFBFE7 & 0x6FFF);
        ao.llllIIlIIIII[2] = 1;
        ao.llllIIlIIIII[3] = 2;
        ao.llllIIlIIIII[4] = 3;
        ao.llllIIlIIIII[5] = 0xDF ^ 0xA7 ^ (0x2E ^ 0x52);
        ao.llllIIlIIIII[6] = 13 + 25 - 30 + 175 ^ 132 + 65 - 175 + 156;
    }

    static {
        ao.lIIIllllIlIlllI();
        ao.lIIIllllIlIllIl();
        ef = LoggerFactory.getLogger(ao.class);
    }

    private static boolean lIIIllllIlIllll(int n2) {
        return n2 == 0;
    }

    private static String lIIIllllIlIlIll(String var3, String var2) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var15 = var2.toCharArray();
        int var14 = llllIIlIIIII[0];
        char[] var13 = var3.toCharArray();
        int var11 = var13.length;
        int var16 = llllIIlIIIII[0];
        while (ao.lIIIllllIllIIlI(var16, var11)) {
            char var4 = var13[var16];
            var6.append((char)(var4 ^ var15[var14 % var15.length]));
            0;
            ++var14;
            ++var16;
            0;
            if (-(0xA1 ^ 0xA5) < 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static void lIIIllllIlIllIl() {
        llllIIIlllll = new String[llllIIlIIIII[6]];
        ao.llllIIIlllll[ao.llllIIlIIIII[0]] = ao."Infected and out of cures. Also No sanfew found in inventory or on the ground, teleporting out";
        ao.llllIIIlllll[ao.llllIIlIIIII[2]] = ao."Drink";
        ao.llllIIIlllll[ao.llllIIlIIIII[3]] = ao."Cleansing parasite";
        ao.llllIIIlllll[ao.llllIIlIIIII[4]] = ao."sanfew";
        ao.llllIIIlllll[ao.llllIIlIIIII[5]] = ao."balm";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ao var12;
        if (ao.lIIIllllIlIllll(Static.getClient().isInInstancedRegion() ? 1 : 0)) {
            return llllIIlIIIII[0];
        }
        if (ao.lIIIllllIllIIII(var12.eg.aq() ? 1 : 0)) {
            return llllIIlIIIII[0];
        }
        if (ao.lIIIllllIlIllll(Static.getClient().getVarbitValue(llllIIlIIIII[1]))) {
            return llllIIlIIIII[0];
        }
        Item var7 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llllIIIlllll[llllIIlIIIII[5]]));
        if (ao.lIIIllllIllIIIl(var7)) {
            var7 = Inventory.getFirst(item -> item.getName().toLowerCase().contains(llllIIIlllll[llllIIlIIIII[4]]));
        }
        if (ao.lIIIllllIllIIIl(var7)) {
            Log.info((String)llllIIIlllll[llllIIlIIIII[0]]);
            return var12.eg.m();
        }
        var1_1.interact(llllIIIlllll[llllIIlIIIII[2]]);
        ef.info(llllIIIlllll[llllIIlIIIII[3]]);
        this.sleep(llllIIlIIIII[4]);
        this.eg.p(llllIIlIIIII[0]);
        return llllIIlIIIII[2];
    }

    private static boolean lIIIllllIllIIIl(Object object) {
        return object == null;
    }

    private static boolean lIIIllllIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIIIllllIlIllII(String var1, String var5) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(llllIIlIIIII[3], var8);
            return new String(var10.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Inject
    public ao(SquireNightmarePlugin squireNightmarePlugin, h h2, SquireNightmareConfig squireNightmareConfig) {
        this.eg = squireNightmarePlugin;
        this.eh = h2;
        this.ei = squireNightmareConfig;
    }

    private static boolean lIIIllllIllIIII(int n2) {
        return n2 != 0;
    }
}

