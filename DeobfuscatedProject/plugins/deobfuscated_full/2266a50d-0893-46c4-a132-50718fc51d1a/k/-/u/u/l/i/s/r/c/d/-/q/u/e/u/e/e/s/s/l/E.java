/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

/* TASK: Collect Musca Mushrooms -> CollectmuscamushroomsTask */
@TaskDesc(name="Collect Musca Mushrooms", priority=100, blocking=true)
public class E
extends Task {
    private static /* synthetic */ String[] lIllIIlIlIll;
    final /* synthetic */ SquireDukeSucellus bh;
    final /* synthetic */ a bi;
    private static /* synthetic */ int[] lIllIIlIllII;

    private static boolean lllIIlIllIIIII(Object object) {
        return object == null;
    }

    private static String lllIIlIlIlllII(String var15, String var2) {
        var15 = new String(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var5 = var2.toCharArray();
        int var4 = lIllIIlIllII[1];
        char[] var3 = var15.toCharArray();
        int var10 = var3.length;
        int var9 = lIllIIlIllII[1];
        while (E.lllIIlIllIIIIl(var9, var10)) {
            char var13 = var3[var9];
            var1.append((char)(var13 ^ var5[var4 % var5.length]));
            0;
            ++var4;
            ++var9;
            0;
            
            return null;
        }
        return String.valueOf(var1);
    }

    private static void lllIIlIlIllllI() {
        lIllIIlIlIll = new String[lIllIIlIllII[0]];
        E.lIllIIlIlIll[E.lIllIIlIllII[1]] = E."Musca mushroom";
        E.lIllIIlIlIll[E.lIllIIlIllII[2]] = E."Arder mushroom";
    }

    @Inject
    public E(SquireDukeSucellus squireDukeSucellus) {
        this.bh = squireDukeSucellus;
        this.bi = squireDukeSucellus.s();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        String[] stringArray = new String[lIllIIlIllII[0]];
        stringArray[E.lIllIIlIllII[1]] = lIllIIlIlIll[lIllIIlIllII[1]];
        stringArray[E.lIllIIlIllII[2]] = lIllIIlIlIll[lIllIIlIllII[2]];
        Item item = Inventory.getFirst((String[])stringArray);
        if (E.lllIIlIllIIIII(item)) {
            return lIllIIlIllII[1];
        }
        int[] nArray = new int[lIllIIlIllII[2]];
        nArray[E.lIllIIlIllII[1]] = lIllIIlIllII[3];
        Item var11 = Inventory.getFirst((int[])nArray);
        if (E.lllIIlIllIIIII(var11)) {
            return lIllIIlIllII[1];
        }
        var2_2.useOn(item);
        return lIllIIlIllII[2];
    }

    private static String lllIIlIlIlllIl(String var12, String var14) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIllIIlIllII[0], var6);
            return new String(var7.doFinal(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        E.lllIIlIlIlllll();
        E.lllIIlIlIllllI();
    }

    private static void lllIIlIlIlllll() {
        lIllIIlIllII = new int[4];
        E.lIllIIlIllII[0] = 2;
        E.lIllIIlIllII[1] = (0xD ^ 7) & ~(0x58 ^ 0x52);
        E.lIllIIlIllII[2] = 1;
        E.lIllIIlIllII[3] = 213 + 220 - 414 + 214;
    }

    private static boolean lllIIlIllIIIIl(int n2, int n3) {
        return n2 < n3;
    }
}

