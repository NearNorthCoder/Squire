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
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g_Unknown;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.KEnum;

/* TASK: Killing minions -> KillMinionsTask */
@TaskDesc(name="Killing minions")
public class KillingMinionsTask
extends Task {
    private static /* synthetic */ int[] lIIlIlIlIlIlI;
    private static /* synthetic */ String[] lIIlIlIlIIIlI;
    private final /* synthetic */ SquireSaraConfig aL;
    private final /* synthetic */ g aK;

    @Inject
    public F(g g2, SquireSaraConfig squireSaraConfig) {
        this.aK = g2;
        this.aL = squireSaraConfig;
    }

    private static boolean lIlIllIIIIIllIl(Object object) {
        return object != null;
    }

    private static String lIlIlIllllIllII(String var18, String var5) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var9 = var5.toCharArray();
        int var19 = lIIlIlIlIlIlI[0];
        char[] var3 = var18.toCharArray();
        int var2 = var3.length;
        int var1 = lIIlIlIlIlIlI[0];
        while (F.lIlIllIIIIlIIlI(var1, var2)) {
            char var7 = var3[var1];
            var16.append((char)(var7 ^ var9[var19 % var9.length]));
            0;
            ++var19;
            ++var1;
            0;
            if (2 > ((0x63 ^ 0x24) & ~(0xCB ^ 0x8C))) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static void lIlIlIllllIllIl() {
        lIIlIlIlIIIlI = new String[lIIlIlIlIlIlI[5]];
        F.lIIlIlIlIIIlI[F.lIIlIlIlIlIlI[0]] = F."Toxic blowpipe";
        F.lIIlIlIlIIIlI[F.lIIlIlIlIlIlI[1]] = F."Wield";
        F.lIIlIlIlIIIlI[F.lIIlIlIlIlIlI[4]] = F."Attack";
    }

    static {
        F.lIlIllIIIIIlIlI();
        F.lIlIlIllllIllIl();
    }

    private static String lIlIlIllllIlIll(String var4, String var10) {
        try {
            SecretKeySpec var13 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), lIIlIlIlIlIlI[6]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIIlIlIlIlIlI[4], var13);
            return new String(var8.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIIIIIlllI(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIIIIlIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIIIIIllII(Object object) {
        return object == null;
    }

    private static boolean lIlIllIIIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private NPC X() {
        int[] nArray = new int[lIIlIlIlIlIlI[1]];
        nArray[F.lIIlIlIlIlIlI[0]] = k.STARLIGHT.D();
        NPC nPC2 = NPCs.getNearest((int[])nArray);
        if (F.lIlIllIIIIIllIl(nPC2) && F.lIlIllIIIIIlllI(nPC2.isDead() ? 1 : 0)) {
            void var14;
            return var14;
        }
        int[] nArray2 = new int[lIIlIlIlIlIlI[1]];
        nArray2[F.lIIlIlIlIlIlI[0]] = k.GROWLER.D();
        NPC var6 = NPCs.getNearest((int[])nArray2);
        if (F.lIlIllIIIIIllIl(var6) && F.lIlIllIIIIIlllI(var6.isDead() ? 1 : 0)) {
            return var6;
        }
        return NPCs.getNearest(nPC -> {
            int n2;
            if (F.lIlIllIIIIIlllI(nPC.isDead() ? 1 : 0) && F.lIlIllIIIIlIIIl(nPC.getId(), k.BREE.D())) {
                n2 = lIIlIlIlIlIlI[1];
                0;
                if ((0x60 ^ 0x65) == 0) {
                    return (2 & ~2) != 0;
                }
            } else {
                n2 = lIIlIlIlIlIlI[0];
            }
            return n2 != 0;
        });
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        F var15;
        if (!F.lIlIllIIIIIlIll(this.aK.m() ? 1 : 0) || F.lIlIllIIIIIlIll(this.aK.l() ? 1 : 0)) {
            return lIIlIlIlIlIlI[0];
        }
        NPC var11 = var15.X();
        if (F.lIlIllIIIIIllII(var11)) {
            return lIIlIlIlIlIlI[0];
        }
        if (F.lIlIllIIIIIllIl(Players.getLocal().getInteracting())) {
            return lIIlIlIlIlIlI[0];
        }
        if (F.lIlIllIIIIIlIll(var15.aL.useBlowpipe() ? 1 : 0)) {
            String[] stringArray = new String[lIIlIlIlIlIlI[1]];
            stringArray[F.lIIlIlIlIlIlI[0]] = lIIlIlIlIIIlI[lIIlIlIlIlIlI[0]];
            Item var17 = Inventory.getFirst((String[])stringArray);
            if (F.lIlIllIIIIIllIl(var17)) {
                var17.interact(lIIlIlIlIIIlI[lIIlIlIlIlIlI[1]]);
                return lIIlIlIlIlIlI[1];
            }
            if (F.lIlIllIIIIIlllI(Combat.isSpecEnabled() ? 1 : 0) && F.lIlIllIIIIIllll(Combat.getSpecEnergy(), lIIlIlIlIlIlI[2]) && F.lIlIllIIIIlIIII(Combat.getMissingHealth(), lIIlIlIlIlIlI[3])) {
                Combat.toggleSpec();
            }
        }
        var1_1.interact(lIIlIlIlIIIlI[lIIlIlIlIlIlI[4]]);
        this.sleep(lIIlIlIlIlIlI[4]);
        return lIIlIlIlIlIlI[1];
    }

    private static void lIlIllIIIIIlIlI() {
        lIIlIlIlIlIlI = new int[7];
        F.lIIlIlIlIlIlI[0] = (0xED ^ 0xA9 ^ (0x5A ^ 0x24)) & (0xAF ^ 0xA3 ^ (0x5D ^ 0x6B) ^ -1);
        F.lIIlIlIlIlIlI[1] = 1;
        F.lIIlIlIlIlIlI[2] = 0x27 ^ 0x15;
        F.lIIlIlIlIlIlI[3] = 5 ^ 0xF;
        F.lIIlIlIlIlIlI[4] = 2;
        F.lIIlIlIlIlIlI[5] = 3;
        F.lIIlIlIlIlIlI[6] = 0xB5 ^ 0xBD;
    }

    private static boolean lIlIllIIIIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIIIIIllll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIllIIIIIlIll(int n2) {
        return n2 != 0;
    }
}

