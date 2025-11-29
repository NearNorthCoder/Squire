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
package m.e.a.i.z.m.r.-.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.e.a.i.z.m.r.-.q.s.y.u.EEnum;
import m.e.a.i.z.m.r.-.q.s.y.u.l_Unknown;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

/* TASK: Killing minions -> KillMinionsTask */
@TaskDesc(name="Killing minions", priority=2, blocking=true)
public class KillingMinionsTask
extends Task {
    private static /* synthetic */ String[] lIllIIIllllII;
    private static /* synthetic */ int[] lIllIIIlllllI;
    private final /* synthetic */ SquireZammyConfig ay;
    private final /* synthetic */ l ax;

    static {
        A.llIIIlIlIlllIll();
        A.llIIIlIlIlllIII();
    }

    private static String llIIIlIlIllIllI(String var4, String var11) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIllIIIlllllI[6]), "DES");
            Cipher var13 = Cipher.getInstance("DES");
            var13.init(lIllIIIlllllI[4], var18);
            return new String(var13.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static void llIIIlIlIlllIll() {
        lIllIIIlllllI = new int[7];
        A.lIllIIIlllllI[0] = (77 + 124 - 174 + 117 ^ 27 + 107 - -33 + 18) & (0x53 ^ 0x32 ^ (0xF9 ^ 0xB1) ^ -1);
        A.lIllIIIlllllI[1] = 1;
        A.lIllIIIlllllI[2] = 0 ^ 0x32;
        A.lIllIIIlllllI[3] = 108 + 71 - 168 + 176 ^ 97 + 84 - 173 + 169;
        A.lIllIIIlllllI[4] = 2;
        A.lIllIIIlllllI[5] = 3;
        A.lIllIIIlllllI[6] = 0x3A ^ 0x32;
    }

    private static void llIIIlIlIlllIII() {
        lIllIIIllllII = new String[lIllIIIlllllI[5]];
        A.lIllIIIllllII[A.lIllIIIlllllI[0]] = A."Toxic blowpipe";
        A.lIllIIIllllII[A.lIllIIIlllllI[1]] = A."Wield";
        A.lIllIIIllllII[A.lIllIIIlllllI[4]] = A."Attack";
    }

    @Inject
    public A(l l2, SquireZammyConfig squireZammyConfig) {
        this.ax = l2;
        this.ay = squireZammyConfig;
    }

    private static boolean llIIIlIlIlllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static String llIIIlIlIllIlII(String var19, String var7) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var5 = var7.toCharArray();
        int var1 = lIllIIIlllllI[0];
        char[] var6 = var19.toCharArray();
        int var20 = var6.length;
        int var8 = lIllIIIlllllI[0];
        while (A.llIIIlIllIIIIIl(var8, var20)) {
            char var3 = var6[var8];
            var21.append((char)(var3 ^ var5[var1 % var5.length]));
            0;
            ++var1;
            ++var8;
            0;
            if (3 > ((204 + 216 - 281 + 101 ^ 64 + 143 - 171 + 111) & (0xB8 ^ 0xA2 ^ (0x35 ^ 0x4C) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        A var17;
        if (!A.llIIIlIlIllllII(this.ax.B() ? 1 : 0) || A.llIIIlIlIllllII(this.ax.A() ? 1 : 0)) {
            return lIllIIIlllllI[0];
        }
        int[] nArray = new int[lIllIIIlllllI[1]];
        nArray[A.lIllIIIlllllI[0]] = e.BALFRUG_KREEYATH.n();
        NPC var12 = NPCs.getNearest((int[])nArray);
        if (!A.llIIIlIlIllllIl(var12) || A.llIIIlIlIllllII(var12.isDead() ? 1 : 0)) {
            return lIllIIIlllllI[0];
        }
        if (A.llIIIlIlIllllII(var17.ay.useBlowpipe() ? 1 : 0) && A.llIIIlIlIlllllI(Combat.getSpecEnergy(), lIllIIIlllllI[2]) && A.llIIIlIlIllllll(Combat.getMissingHealth(), lIllIIIlllllI[3])) {
            String[] stringArray = new String[lIllIIIlllllI[1]];
            stringArray[A.lIllIIIlllllI[0]] = lIllIIIllllII[lIllIIIlllllI[0]];
            Item var15 = Inventory.getFirst((String[])stringArray);
            if (A.llIIIlIlIllllIl(var15)) {
                var15.interact(lIllIIIllllII[lIllIIIlllllI[1]]);
            }
            if (A.llIIIlIllIIIIII(Combat.isSpecEnabled() ? 1 : 0)) {
                Combat.toggleSpec();
            }
        }
        if (A.llIIIlIlIllllIl(Players.getLocal().getInteracting())) {
            return lIllIIIlllllI[0];
        }
        var1_1.interact(lIllIIIllllII[lIllIIIlllllI[4]]);
        this.sleep(lIllIIIlllllI[4]);
        return lIllIIIlllllI[1];
    }

    private static boolean llIIIlIlIllllIl(Object object) {
        return object != null;
    }

    private static boolean llIIIlIllIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIIIlIlIllIlll(String var9, String var14) {
        try {
            SecretKeySpec var22 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lIllIIIlllllI[4], var22);
            return new String(var2.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIlIlIllllll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean llIIIlIlIllllII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlIllIIIIII(int n2) {
        return n2 == 0;
    }
}

