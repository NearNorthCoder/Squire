/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.f;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.g;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.i;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.l;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;

@TaskDesc(priority=5, name="Traversing home")
public class J
extends n {
    private static /* synthetic */ String[] llIIllIIIIII;
    private static /* synthetic */ int[] llIIllIIIIIl;

    private static void llllllIIlIIlII() {
        llIIllIIIIII = new String[llIIllIIIIIl[0]];
        J.llIIllIIIIII[J.llIIllIIIIIl[1]] = J."No teleport found, walking home.";
        J.llIIllIIIIII[J.llIIllIIIIIl[2]] = J."Activate";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var4_4;
        int n2;
        J var16;
        Player player = Players.getLocal();
        if (J.llllllIIlIIllI(player)) {
            return llIIllIIIIIl[1];
        }
        g var17 = var16.ba.J();
        if (J.llllllIIlIIlll((Object)var17) && J.llllllIIlIlIII(i.CRYSTAL_ORB.aC())) {
            return llIIllIIIIIl[1];
        }
        if (!J.llllllIIlIlIII(var16.ba.N() ? 1 : 0) || J.llllllIIlIlIIl(var16.ba.a(f.TIER_3_STAFF) ? 1 : 0) && J.llllllIIlIlIIl(var16.bB() ? 1 : 0)) {
            n2 = llIIllIIIIIl[2];
            0;
            if (3 >= (72 + 109 - 70 + 26 ^ 100 + 0 - 38 + 79)) {
                return ((2 ^ (0x88 ^ 0xB0)) & (23 + 91 - -17 + 49 ^ 111 + 61 - 81 + 51 ^ -1)) != 0;
            }
        } else {
            n2 = llIIllIIIIIl[1];
        }
        int var8 = n2;
        Item var5 = Inventory.getFirst(item -> e.ab.contains(item.getId()));
        if (J.llllllIIlIlIII(var8) && J.llllllIIlIlIlI(var16.ba.M(), llIIllIIIIIl[3]) && J.llllllIIlIlIII(Inventory.isFull() ? 1 : 0)) {
            return llIIllIIIIIl[1];
        }
        if (J.llllllIIlIIllI(var5)) {
            void var13;
            Log.info((String)llIIllIIIIII[llIIllIIIIIl[1]]);
            return var16.ba.a((l)var16.ba.V().av(), var13.getWorldLocation());
        }
        var4_4.interact(llIIllIIIIII[llIIllIIIIIl[2]]);
        return llIIllIIIIIl[2];
    }

    private static boolean llllllIIlIIlll(Object object) {
        return object != null;
    }

    private static String llllllIIlIIIlI(String var19, String var4) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), llIIllIIIIIl[4]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llIIllIIIIIl[0], var6);
            return new String(var10.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIlIIllI(Object object) {
        return object == null;
    }

    private static boolean llllllIIlIlIIl(int n2) {
        return n2 != 0;
    }

    private boolean bB() {
        int n2;
        if (J.llllllIIlIlIIl(this.ba.h().makeT3Offhand() ? 1 : 0) && J.llllllIIlIlIIl(this.ba.h().goHomeT3() ? 1 : 0)) {
            n2 = llIIllIIIIIl[2];
            0;
            if (((26 + 82 - 9 + 28 ^ (0xEC ^ 0x80)) & (0xDD ^ 0xA9 ^ (0xF0 ^ 0x97) ^ -1)) >= (110 + 83 - 89 + 55 ^ 105 + 149 - 119 + 20)) {
                return ((0x1E ^ 0x1B ^ (0x19 ^ 0x17)) & (128 + 198 - 191 + 65 ^ 80 + 20 - -33 + 62 ^ -1)) != 0;
            }
        } else {
            n2 = llIIllIIIIIl[1];
        }
        return n2 != 0;
    }

    @Inject
    public J(c c2) {
        d[] dArray = new d[llIIllIIIIIl[0]];
        dArray[J.llIIllIIIIIl[1]] = d.DEMI_BOSS_EXPLORE;
        dArray[J.llIIllIIIIIl[2]] = d.EXTRA_FOOD_EXPLORE;
        super(c2, dArray);
    }

    private static String llllllIIlIIIll(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var12 = var3.toCharArray();
        int var9 = llIIllIIIIIl[1];
        char[] var7 = var2.toCharArray();
        int var18 = var7.length;
        int var1 = llIIllIIIIIl[1];
        while (J.llllllIIlIlIll(var1, var18)) {
            char var15 = var7[var1];
            var11.append((char)(var15 ^ var12[var9 % var12.length]));
            0;
            ++var9;
            ++var1;
            0;
            if (3 > -1) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static void llllllIIlIIlIl() {
        llIIllIIIIIl = new int[5];
        J.llIIllIIIIIl[0] = 2;
        J.llIIllIIIIIl[1] = (0x48 ^ 0x55) & ~(0x97 ^ 0x8A);
        J.llIIllIIIIIl[2] = 1;
        J.llIIllIIIIIl[3] = 0x4D ^ 6 ^ (0xC4 ^ 0x91);
        J.llIIllIIIIIl[4] = 0xF0 ^ 0x8E ^ (0x15 ^ 0x63);
    }

    static {
        J.llllllIIlIIlIl();
        J.llllllIIlIIlII();
    }

    private static boolean llllllIIlIlIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llllllIIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIIlIlIII(int n2) {
        return n2 == 0;
    }
}

