/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.b;

/* TASK: Checking for Task -> CheckingfortaskTask */
@TaskDesc(name="Checking for Task", priority=0x7FFFFFFF, blocking=true)
public class e
extends Task {
    private static /* synthetic */ String[] lIlIIlIlIIllI;
    private static /* synthetic */ int[] lIlIIlIlIlIIl;
    private static final /* synthetic */ Logger z;
    private final /* synthetic */ SquireSkipperPlugin A;

    private static String lIlllIllIIIIIII(String var19, String var8) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIlIIl[6]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIlIIlIlIlIIl[4], var14);
            return new String(var5.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIllIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    static {
        e.lIlllIllIIIlllI();
        e.lIlllIllIIIIIIl();
        z = LoggerFactory.getLogger(e.class);
    }

    @Inject
    public e(SquireSkipperPlugin squireSkipperPlugin) {
        this.A = squireSkipperPlugin;
    }

    private static void lIlllIllIIIIIIl() {
        lIlIIlIlIIllI = new String[lIlIIlIlIlIIl[5]];
        e.lIlIIlIlIIllI[e.lIlIIlIlIlIIl[1]] = e."Check";
        e.lIlIIlIlIIllI[e.lIlIIlIlIlIIl[2]] = e."Check";
        e.lIlIIlIlIIllI[e.lIlIIlIlIlIIl[4]] = e."slayer helm";
    }

    private static void lIlllIllIIIlllI() {
        lIlIIlIlIlIIl = new int[7];
        e.lIlIIlIlIlIIl[0] = 0xFFFF9FF7 & 0x6FED;
        e.lIlIIlIlIlIIl[1] = (0xD6 ^ 0x98 ^ (0xBA ^ 0xA0)) & (0xDF ^ 0xA3 ^ (0x57 ^ 0x7F) ^ -1);
        e.lIlIIlIlIlIIl[2] = 1;
        e.lIlIIlIlIlIIl[3] = -(0xFFFFFB5B & 0x6CE5) & (0xFFFFFBFF & 0x7C7B);
        e.lIlIIlIlIlIIl[4] = 2;
        e.lIlIIlIlIlIIl[5] = 3;
        e.lIlIIlIlIlIIl[6] = 177 + 96 - 270 + 188 ^ 13 + 122 - 26 + 74;
    }

    private static String lIlllIlIllllllI(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var10 = var3.toCharArray();
        int var16 = lIlIIlIlIlIIl[1];
        char[] var7 = var2.toCharArray();
        int var9 = var7.length;
        int var20 = lIlIIlIlIlIIl[1];
        while (e.lIlllIllIIlIIlI(var20, var9)) {
            char var13 = var7[var20];
            var15.append((char)(var13 ^ var10[var16 % var10.length]));
            0;
            ++var16;
            ++var20;
            0;
            
            return null;
        }
        return String.valueOf(var15);
    }

    private static String lIlllIlIlllllll(String var4, String var12) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlIIlIlIlIIl[4], var21);
            return new String(var1.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIllIIlIIII(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        b b2 = this.A.b();
        this.A.d(Static.getClient().getVarbitValue(lIlIIlIlIlIIl[0]));
        if (!e.lIlllIllIIIllll((Object)b2) || e.lIlllIllIIlIIII(this.A.c() ? 1 : 0)) {
            return lIlIIlIlIlIIl[1];
        }
        Item var18 = Equipment.getFirst(item -> item.getName().toLowerCase().contains(lIlIIlIlIIllI[lIlIIlIlIlIIl[4]]));
        if (e.lIlllIllIIlIIIl(var18)) {
            var18.interact(lIlIIlIlIIllI[lIlIIlIlIlIIl[1]]);
            return lIlIIlIlIlIIl[2];
        }
        int[] nArray = new int[lIlIIlIlIlIIl[2]];
        nArray[e.lIlIIlIlIlIIl[1]] = lIlIIlIlIlIIl[3];
        Item var6 = Inventory.getFirst((int[])nArray);
        if (e.lIlllIllIIlIIIl(var6)) {
            var6.interact(lIlIIlIlIIllI[lIlIIlIlIlIIl[2]]);
            return lIlIIlIlIlIIl[2];
        }
        return lIlIIlIlIlIIl[1];
    }

    private static boolean lIlllIllIIIllll(Object object) {
        return object == null;
    }

    private static boolean lIlllIllIIlIIIl(Object object) {
        return object != null;
    }
}

