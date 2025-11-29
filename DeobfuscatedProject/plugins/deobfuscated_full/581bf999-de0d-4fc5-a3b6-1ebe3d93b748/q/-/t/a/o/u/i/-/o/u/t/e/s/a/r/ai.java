/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;

/* TASK: Drinking stamina -> DrinkingstaminaTask */
@TaskDesc(name="Drinking stamina", priority=100)
public class ai
extends Z {
    private static /* synthetic */ int[] llIIllIIlII;
    private static /* synthetic */ String[] llIIllIIIll;

    private static void lIlIIIlIIIllII() {
        llIIllIIIll = new String[llIIllIIlII[4]];
        ai.llIIllIIIll[ai.llIIllIIlII[0]] = ai."Drink";
        ai.llIIllIIIll[ai.llIIllIIlII[3]] = ai."Stamina";
    }

    private static String lIlIIIlIIIlIlI(String var1, String var13) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var11 = var13.toCharArray();
        int var2 = llIIllIIlII[0];
        char[] var12 = var1.toCharArray();
        int var3 = var12.length;
        int var4 = llIIllIIlII[0];
        while (ai.lIlIIIlIIlIIlI(var4, var3)) {
            char var15 = var12[var4];
            var6.append((char)(var15 ^ var11[var2 % var11.length]));
            0;
            ++var2;
            ++var4;
            0;
            if (((0xE7 ^ 0xB4 ^ (0x15 ^ 2)) & (0x4E ^ 0x50 ^ (0x4B ^ 0x11) ^ -1)) > -1) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    static {
        ai.lIlIIIlIIIllIl();
        ai.lIlIIIlIIIllII();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (ai.lIlIIIlIIIlllI(Movement.isStaminaBoosted() ? 1 : 0)) {
            return llIIllIIlII[0];
        }
        if (ai.lIlIIIlIIIllll(Vars.getBit((int)llIIllIIlII[1]))) {
            return llIIllIIlII[0];
        }
        Item var7 = Inventory.getFirst(item -> item.getName().startsWith(llIIllIIIll[llIIllIIlII[3]]));
        if (ai.lIlIIIlIIlIIII(var7)) {
            return llIIllIIlII[0];
        }
        if (ai.lIlIIIlIIlIIIl(Movement.getRunEnergy(), llIIllIIlII[2])) {
            return llIIllIIlII[0];
        }
        var1_1.interact(llIIllIIIll[llIIllIIlII[0]]);
        return llIIllIIlII[3];
    }

    private static String lIlIIIlIIIlIll(String var8, String var5) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), llIIllIIlII[5]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llIIllIIlII[4], var14);
            return new String(var10.doFinal(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIIIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIIlIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIIIlIIlIIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIIIlIIIlllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIIIlIIlIIII(Object object) {
        return object == null;
    }

    private static void lIlIIIlIIIllIl() {
        llIIllIIlII = new int[6];
        ai.llIIllIIlII[0] = (0xC4 ^ 0x84) & ~(0xCB ^ 0x8B);
        ai.llIIllIIlII[1] = 0xFFFFBC2B & 0x7BDC;
        ai.llIIllIIlII[2] = 0x7F ^ 0x78 ^ (0x7F ^ 0x72);
        ai.llIIllIIlII[3] = 1;
        ai.llIIllIIlII[4] = 2;
        ai.llIIllIIlII[5] = 0x35 ^ 0x41 ^ (0x43 ^ 0x3F);
    }

    @Inject
    protected ai(Client client) {
        super(client);
    }
}

