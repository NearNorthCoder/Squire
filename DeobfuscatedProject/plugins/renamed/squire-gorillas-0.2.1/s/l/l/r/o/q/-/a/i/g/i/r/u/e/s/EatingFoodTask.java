/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/* TASK: Eating food -> EatingfoodTask */
@TaskDesc(name="Eating food", priority=100)
public class EatingFoodTask
extends Task {
    private final /* synthetic */ SquireGorillaConfig aj;
    private static /* synthetic */ String[] llIIlIlIlIIl;
    private static /* synthetic */ int[] llIIlIlIlIlI;

    private static boolean lllllIlIllIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public x(SquireGorillaConfig squireGorillaConfig) {
        this.aj = squireGorillaConfig;
    }

    private static boolean lllllIlIllIIIl(Object object) {
        return object == null;
    }

    static {
        x.lllllIlIlIllll();
        x.lllllIlIlIlllI();
    }

    private static boolean lllllIlIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllllIlIlIllIl(String var14, String var10) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var7 = var10.toCharArray();
        int var1 = llIIlIlIlIlI[0];
        char[] var11 = var14.toCharArray();
        int var13 = var11.length;
        int var3 = llIIlIlIlIlI[0];
        while (x.lllllIlIllIIlI(var3, var13)) {
            char var2 = var11[var3];
            var15.append((char)(var2 ^ var7[var1 % var7.length]));
            0;
            ++var1;
            ++var3;
            0;
            
            return null;
        }
        return String.valueOf(var15);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (x.lllllIlIllIIII(Combat.getCurrentHealth(), this.aj.eatAt())) {
            return llIIlIlIlIlI[0];
        }
        Item var5 = Inventory.getFirst(item -> item.hasAction(llIIlIlIlIIl[llIIlIlIlIlI[1]]::equals));
        if (x.lllllIlIllIIIl(var5)) {
            return llIIlIlIlIlI[0];
        }
        var1_1.interact(llIIlIlIlIIl[llIIlIlIlIlI[0]]);
        return llIIlIlIlIlI[1];
    }

    private static String lllllIlIlIllII(String var9, String var8) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(llIIlIlIlIlI[2], var4);
            return new String(var6.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static void lllllIlIlIlllI() {
        llIIlIlIlIIl = new String[llIIlIlIlIlI[2]];
        x.llIIlIlIlIIl[x.llIIlIlIlIlI[0]] = x."Eat";
        x.llIIlIlIlIIl[x.llIIlIlIlIlI[1]] = x."Eat";
    }

    private static void lllllIlIlIllll() {
        llIIlIlIlIlI = new int[3];
        x.llIIlIlIlIlI[0] = (0xD0 ^ 0xC5 ^ (0x7D ^ 0x46)) & (0x67 ^ 0x19 ^ (0xC4 ^ 0x94) ^ -1);
        x.llIIlIlIlIlI[1] = 1;
        x.llIIlIlIlIlI[2] = 2;
    }
}

