/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.duke.SquireDukeSucellus;
import gg.squire.duke.SquireDukeSucellusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.a_Unknown;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/* TASK: Eating food -> EatingfoodTask */
@TaskDesc(name="Eating food", priority=10000)
public class EatingFoodTask
extends Task {
    private final /* synthetic */ a aR;
    private static /* synthetic */ int[] lIllIIlIlllI;
    private static /* synthetic */ String[] lIllIIlIllIl;
    private final /* synthetic */ SquireDukeSucellus aP;
    private final /* synthetic */ SquireDukeSucellusConfig aQ;

    private static boolean lllIIlIllIIlll(Object object) {
        return object == null;
    }

    private static boolean lllIIlIllIIllI(int n2, int n3) {
        return n2 > n3;
    }

    private static void lllIIlIllIIlIl() {
        lIllIIlIlllI = new int[5];
        w.lIllIIlIlllI[0] = (134 + 189 - 322 + 193 ^ 81 + 140 - 118 + 49) & (186 + 161 - 146 + 54 ^ 24 + 42 - -49 + 50 ^ -1);
        w.lIllIIlIlllI[1] = 1;
        w.lIllIIlIlllI[2] = 3;
        w.lIllIIlIlllI[3] = 2;
        w.lIllIIlIlllI[4] = 0xC3 ^ 0x88 ^ (0xFB ^ 0xB8);
    }

    private static boolean lllIIlIllIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllIIlIllIIIlI(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var5 = var7.toCharArray();
        int var15 = lIllIIlIlllI[0];
        char[] var8 = var6.toCharArray();
        int var13 = var8.length;
        int var16 = lIllIIlIlllI[0];
        while (w.lllIIlIllIlIII(var16, var13)) {
            char var14 = var8[var16];
            var11.append((char)(var14 ^ var5[var15 % var5.length]));
            0;
            ++var15;
            ++var16;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    @Inject
    public w(SquireDukeSucellus squireDukeSucellus, SquireDukeSucellusConfig squireDukeSucellusConfig) {
        this.aP = squireDukeSucellus;
        this.aQ = squireDukeSucellusConfig;
        this.aR = squireDukeSucellus.s();
    }

    private static void lllIIlIllIIlII() {
        lIllIIlIllIl = new String[lIllIIlIlllI[2]];
        w.lIllIIlIllIl[w.lIllIIlIlllI[0]] = w."No food";
        w.lIllIIlIllIl[w.lIllIIlIlllI[1]] = w."Eat";
        w.lIllIIlIllIl[w.lIllIIlIlllI[3]] = w."Eat";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (w.lllIIlIllIIllI(Combat.getCurrentHealth(), this.aQ.eatAt())) {
            return lIllIIlIlllI[0];
        }
        Item var3 = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIllIIlIlllI[1]];
            stringArray[w.lIllIIlIlllI[0]] = lIllIIlIllIl[lIllIIlIlllI[3]];
            return item.hasAction(stringArray);
        });
        if (w.lllIIlIllIIlll(var3)) {
            w var9;
            Log.error((String)lIllIIlIllIl[lIllIIlIlllI[0]]);
            var9.aP.g(lIllIIlIlllI[1]);
            return lIllIIlIlllI[0];
        }
        var1_1.interact(lIllIIlIllIl[lIllIIlIlllI[1]]);
        this.sleep(lIllIIlIlllI[2]);
        return lIllIIlIlllI[1];
    }

    static {
        w.lllIIlIllIIlIl();
        w.lllIIlIllIIlII();
    }

    private static String lllIIlIllIIIll(String var2, String var10) {
        try {
            SecretKeySpec var12 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIllIIlIlllI[4]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIllIIlIlllI[3], var12);
            return new String(var1.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }
}

