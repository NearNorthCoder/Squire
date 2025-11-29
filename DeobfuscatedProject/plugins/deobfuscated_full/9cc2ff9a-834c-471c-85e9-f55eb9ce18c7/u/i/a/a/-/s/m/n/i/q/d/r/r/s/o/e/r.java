/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.a;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.l;

/* TASK: Drinking stamina dose -> DrinkingstaminadoseTask */
@TaskDesc(name="Drinking stamina dose", priority=8)
public class r
extends Task {
    private static /* synthetic */ int[] lIIlIlIIlllIl;
    private static /* synthetic */ String[] lIIlIlIIlllII;
    private final /* synthetic */ a aa;
    private final /* synthetic */ l Z;
    private final /* synthetic */ g Y;

    private static void lIlIlIlllIlIlll() {
        lIIlIlIIlllIl = new int[6];
        r.lIIlIlIIlllIl[0] = (0x76 ^ 0x36 ^ (0x6A ^ 0x35)) & (125 + 101 - 198 + 163 ^ 22 + 20 - -68 + 50 ^ -1);
        r.lIIlIlIIlllIl[1] = 0xB1 ^ 0xAF;
        r.lIIlIlIIlllIl[2] = 3;
        r.lIIlIlIIlllIl[3] = 1;
        r.lIIlIlIIlllIl[4] = 2;
        r.lIIlIlIIlllIl[5] = 108 + 15 - 107 + 129 ^ 39 + 146 - 103 + 71;
    }

    private static boolean lIlIlIlllIllIlI(Object object) {
        return object != null;
    }

    private static String lIlIlIlllIlIlII(String var5, String var12) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var2 = var12.toCharArray();
        int var3 = lIIlIlIIlllIl[0];
        char[] var8 = var5.toCharArray();
        int var13 = var8.length;
        int var4 = lIIlIlIIlllIl[0];
        while (r.lIlIlIlllIllIll(var4, var13)) {
            char var15 = var8[var4];
            var1.append((char)(var15 ^ var2[var3 % var2.length]));
            0;
            ++var3;
            ++var4;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static boolean lIlIlIlllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var10;
        if (r.lIlIlIlllIllIII(this.Y.m() ? 1 : 0)) {
            return lIIlIlIIlllIl[0];
        }
        if (!r.lIlIlIlllIllIIl(var10.Y.l() ? 1 : 0) || r.lIlIlIlllIllIlI(var10.Z.M())) {
            return lIIlIlIIlllIl[0];
        }
        if (!r.lIlIlIlllIllIll(Movement.getRunEnergy(), lIIlIlIIlllIl[1]) || r.lIlIlIlllIllIIl(Movement.isStaminaBoosted() ? 1 : 0)) {
            return lIIlIlIIlllIl[0];
        }
        Item var11 = Inventory.getFirst(item -> item.getName().startsWith(lIIlIlIIlllII[lIIlIlIIlllIl[3]]));
        if (!r.lIlIlIlllIllIlI(var11) || r.lIlIlIlllIllIII(var10.aa.e() ? 1 : 0)) {
            return lIIlIlIIlllIl[0];
        }
        var1_1.interact(lIIlIlIIlllII[lIIlIlIIlllIl[0]]);
        this.aa.b();
        this.sleep(lIIlIlIIlllIl[2]);
        return lIIlIlIIlllIl[3];
    }

    private static boolean lIlIlIlllIllIII(int n2) {
        return n2 == 0;
    }

    @Inject
    public r(g g2, l l2, a a2) {
        this.Y = g2;
        this.Z = l2;
        this.aa = a2;
    }

    static {
        r.lIlIlIlllIlIlll();
        r.lIlIlIlllIlIllI();
    }

    private static boolean lIlIlIlllIllIIl(int n2) {
        return n2 != 0;
    }

    private static String lIlIlIlllIlIlIl(String var14, String var6) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIIlIlIIlllIl[5]), "DES");
            Cipher var7 = Cipher.getInstance("DES");
            var7.init(lIIlIlIIlllIl[4], var16);
            return new String(var7.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlllIlIllI() {
        lIIlIlIIlllII = new String[lIIlIlIIlllIl[4]];
        r.lIIlIlIIlllII[r.lIIlIlIIlllIl[0]] = r."Drink";
        r.lIIlIlIIlllII[r.lIIlIlIIlllIl[3]] = r."Stamina";
    }
}

