/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.bandos.SquireBandosConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import q.s.r.i.e.s.o.u.a.d.n.-.b.BEnum;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e_Unknown;

/* TASK: Killing minions -> KillMinionsTask */
@TaskDesc(name="Killing minions")
public class KillingMinionsTask
extends Task {
    private static /* synthetic */ String[] lllIIIlllII;
    private final /* synthetic */ e aa;
    private static /* synthetic */ int[] lllIIIlllIl;
    private final /* synthetic */ SquireBandosConfig ab;

    static {
        q.lIlIlllIIlIlIl();
        q.lIlIlllIIlIlII();
    }

    /*
     * WARNING - void declaration
     */
    private NPC N() {
        int[] nArray = new int[lllIIIlllIl[1]];
        nArray[q.lllIIIlllIl[0]] = b.STEELWILL.d();
        NPC nPC2 = NPCs.getNearest((int[])nArray);
        if (q.lIlIlllIIllIII(nPC2) && q.lIlIlllIIllIIl(nPC2.isDead() ? 1 : 0)) {
            void var19;
            return var19;
        }
        int[] nArray2 = new int[lllIIIlllIl[1]];
        nArray2[q.lllIIIlllIl[0]] = b.STRONGSACK.d();
        NPC var3 = NPCs.getNearest((int[])nArray2);
        if (q.lIlIlllIIllIII(var3) && q.lIlIlllIIllIIl(var3.isDead() ? 1 : 0)) {
            return var3;
        }
        return NPCs.getNearest(nPC -> {
            int n2;
            if (q.lIlIlllIIllIIl(nPC.isDead() ? 1 : 0) && q.lIlIlllIIlllII(nPC.getId(), b.GRIMSPIKE.d())) {
                n2 = lllIIIlllIl[1];
                0;
                if (((0x5B ^ 0x11) & ~(0xEC ^ 0xA6)) > 1) {
                    return false;
                }
            } else {
                n2 = lllIIIlllIl[0];
            }
            return n2 != 0;
        });
    }

    private static String lIlIlllIIlIIIl(String var16, String var17) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lllIIIlllIl[6]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lllIIIlllIl[4], var6);
            return new String(var12.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIllIlI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIlllIIlIlll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        q var23;
        if (!q.lIlIlllIIlIllI(this.aa.t() ? 1 : 0) || q.lIlIlllIIlIllI(this.aa.s() ? 1 : 0)) {
            return lllIIIlllIl[0];
        }
        NPC var4 = var23.N();
        if (q.lIlIlllIIlIlll(var4)) {
            return lllIIIlllIl[0];
        }
        if (q.lIlIlllIIllIII(Players.getLocal().getInteracting())) {
            return lllIIIlllIl[0];
        }
        if (q.lIlIlllIIlIllI(var23.ab.useBlowpipe() ? 1 : 0)) {
            String[] stringArray = new String[lllIIIlllIl[1]];
            stringArray[q.lllIIIlllIl[0]] = lllIIIlllII[lllIIIlllIl[0]];
            Item var15 = Inventory.getFirst((String[])stringArray);
            if (q.lIlIlllIIllIII(var15)) {
                var15.interact(lllIIIlllII[lllIIIlllIl[1]]);
                return lllIIIlllIl[1];
            }
            if (q.lIlIlllIIllIIl(Combat.isSpecEnabled() ? 1 : 0) && q.lIlIlllIIllIlI(Combat.getSpecEnergy(), lllIIIlllIl[2]) && q.lIlIlllIIllIll(Combat.getMissingHealth(), lllIIIlllIl[3])) {
                Combat.toggleSpec();
            }
        }
        var1_1.interact(lllIIIlllII[lllIIIlllIl[4]]);
        this.sleep(lllIIIlllIl[4]);
        return lllIIIlllIl[1];
    }

    private static boolean lIlIlllIIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlllIIlllII(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIlllIIlIIlI(String var18, String var24) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var24.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lllIIIlllIl[4], var1);
            return new String(var11.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIIlIllI(int n2) {
        return n2 != 0;
    }

    private static void lIlIlllIIlIlII() {
        lllIIIlllII = new String[lllIIIlllIl[5]];
        q.lllIIIlllII[q.lllIIIlllIl[0]] = q."Toxic blowpipe";
        q.lllIIIlllII[q.lllIIIlllIl[1]] = q."Wield";
        q.lllIIIlllII[q.lllIIIlllIl[4]] = q."Attack";
    }

    private static void lIlIlllIIlIlIl() {
        lllIIIlllIl = new int[7];
        q.lllIIIlllIl[0] = (0x48 ^ 0x17 ^ (0x5E ^ 0x42)) & (0x30 ^ 0x36 ^ (0x54 ^ 0x11) ^ -1);
        q.lllIIIlllIl[1] = 1;
        q.lllIIIlllIl[2] = 2 ^ 0x30;
        q.lllIIIlllIl[3] = 80 + 34 - 21 + 63 ^ 52 + 57 - 5 + 46;
        q.lllIIIlllIl[4] = 2;
        q.lllIIIlllIl[5] = 3;
        q.lllIIIlllIl[6] = 0x60 ^ 0x4C ^ (0x93 ^ 0xB7);
    }

    @Inject
    public q(e e2, SquireBandosConfig squireBandosConfig) {
        this.aa = e2;
        this.ab = squireBandosConfig;
    }

    private static boolean lIlIlllIIlllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIlllIIlIIll(String var13, String var20) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var14 = var20.toCharArray();
        int var9 = lllIIIlllIl[0];
        char[] var5 = var13.toCharArray();
        int var10 = var5.length;
        int var8 = lllIIIlllIl[0];
        while (q.lIlIlllIIlllIl(var8, var10)) {
            char var7 = var5[var8];
            var21.append((char)(var7 ^ var14[var9 % var14.length]));
            0;
            ++var9;
            ++var8;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static boolean lIlIlllIIllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlllIIllIII(Object object) {
        return object != null;
    }
}

