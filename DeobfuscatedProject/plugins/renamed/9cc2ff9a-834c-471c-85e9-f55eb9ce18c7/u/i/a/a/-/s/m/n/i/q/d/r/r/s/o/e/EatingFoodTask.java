/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.a_Unknown;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g_Unknown;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l_Unknown;

/* TASK: Eating food -> EatingfoodTask */
@TaskDesc(name="Eating food", priority=8)
public class EatingFoodTask
extends Task {
    private static /* synthetic */ int[] lIIlIIlllllII;
    private static /* synthetic */ String[] lIIlIIllllIll;
    private final /* synthetic */ a ad;
    private final /* synthetic */ SquireSaraConfig ae;
    private final /* synthetic */ l ac;
    private final /* synthetic */ g ab;

    private static boolean lIlIlIlIllIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIlIllIIlll(int n2) {
        return n2 != 0;
    }

    @Inject
    public s(g g2, l l2, a a2, SquireSaraConfig squireSaraConfig) {
        this.ab = g2;
        this.ac = l2;
        this.ad = a2;
        this.ae = squireSaraConfig;
    }

    private static String lIlIlIlIllIIIlI(String var5, String var16) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var9 = var16.toCharArray();
        int var14 = lIIlIIlllllII[0];
        char[] var1 = var5.toCharArray();
        int var20 = var1.length;
        int var18 = lIIlIIlllllII[0];
        while (s.lIlIlIlIllIlIll(var18, var20)) {
            char var6 = var1[var18];
            var10.append((char)(var6 ^ var9[var14 % var9.length]));
            0;
            ++var14;
            ++var18;
            0;
            if (-(76 + 114 - 164 + 148 ^ 134 + 22 - 14 + 28) < 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static void lIlIlIlIllIIlII() {
        lIIlIIllllIll = new String[lIIlIIlllllII[4]];
        s.lIIlIIllllIll[s.lIIlIIlllllII[0]] = s."Peach";
        s.lIIlIIllllIll[s.lIIlIIlllllII[1]] = s."Eat";
        s.lIIlIIllllIll[s.lIIlIIlllllII[2]] = s."Peach";
        s.lIIlIIllllIll[s.lIIlIIlllllII[3]] = s."Eat";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        s var12;
        if (s.lIlIlIlIllIIllI(this.ab.m() ? 1 : 0)) {
            return lIIlIIlllllII[0];
        }
        if (s.lIlIlIlIllIIlll(var12.ab.l() ? 1 : 0) && s.lIlIlIlIllIlIII(var12.ac.M())) {
            return lIIlIIlllllII[0];
        }
        int var11 = var12.ae.eatFoodAt();
        if (!s.lIlIlIlIllIlIIl(Combat.getCurrentHealth(), var11) || s.lIlIlIlIllIIllI(var12.ad.d() ? 1 : 0)) {
            return lIIlIIlllllII[0];
        }
        Item var17 = Inventory.getFirst(item -> {
            int n2;
            if (s.lIlIlIlIllIIllI(item.getName().equals(lIIlIIllllIll[lIIlIIlllllII[2]]) ? 1 : 0) && s.lIlIlIlIllIIlll(item.hasAction(lIIlIIllllIll[lIIlIIlllllII[3]]::equals) ? 1 : 0)) {
                n2 = lIIlIIlllllII[1];
                0;
                if (3 < 0) {
                    return ((9 + 128 - 8 + 2 ^ 90 + 32 - 9 + 75) & (0x6B ^ 0x4E ^ (0x7F ^ 0x65) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlIIlllllII[0];
            }
            return n2 != 0;
        });
        if (s.lIlIlIlIllIlIlI(var17)) {
            String[] stringArray = new String[lIIlIIlllllII[1]];
            stringArray[s.lIIlIIlllllII[0]] = lIIlIIllllIll[lIIlIIlllllII[0]];
            var17 = Inventory.getFirst((String[])stringArray);
        }
        if (s.lIlIlIlIllIlIlI(var17)) {
            return var12.U();
        }
        var2_2.interact(lIIlIIllllIll[lIIlIIlllllII[1]]);
        this.ad.c();
        return lIIlIIlllllII[1];
    }

    private boolean U() {
        return lIIlIIlllllII[0];
    }

    private static String lIlIlIlIllIIIIl(String var15, String var3) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var3.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var13 = Cipher.getInstance("Blowfish");
            var13.init(lIIlIIlllllII[2], var4);
            return new String(var13.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlIllIlIll(int n2, int n3) {
        return n2 < n3;
    }

    static {
        s.lIlIlIlIllIIlIl();
        s.lIlIlIlIllIIlII();
    }

    private static void lIlIlIlIllIIlIl() {
        lIIlIIlllllII = new int[6];
        s.lIIlIIlllllII[0] = (0xB ^ 0x22) & ~(0x42 ^ 0x6B);
        s.lIIlIIlllllII[1] = 1;
        s.lIIlIIlllllII[2] = 2;
        s.lIIlIIlllllII[3] = 3;
        s.lIIlIIlllllII[4] = 0x78 ^ 0x7C;
        s.lIIlIIlllllII[5] = 0x91 ^ 0x89 ^ (0x4F ^ 0x5F);
    }

    private static boolean lIlIlIlIllIlIlI(Object object) {
        return object == null;
    }

    private static boolean lIlIlIlIllIlIIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIlIlIllIIIll(String var21, String var7) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), lIIlIIlllllII[5]), "DES");
            Cipher var19 = Cipher.getInstance("DES");
            var19.init(lIIlIIlllllII[2], var22);
            return new String(var19.doFinal(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIlIllIlIII(Object object) {
        return object != null;
    }
}

