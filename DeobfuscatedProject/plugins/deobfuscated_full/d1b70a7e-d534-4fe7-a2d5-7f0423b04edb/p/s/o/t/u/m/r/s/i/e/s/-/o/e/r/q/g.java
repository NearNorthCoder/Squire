/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Dialog
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;

/* TASK: Fishing -> FishingTask */
@TaskDesc(name="Fishing", priority=1000, blocking=true)
public class g
extends Task {
    private final /* synthetic */ SquireTempoross aj;
    private final /* synthetic */ a ag;
    private final /* synthetic */ SquireTemporossConfig ah;
    private static /* synthetic */ int[] lIIllIllIIlIl;
    private static /* synthetic */ String[] lIIllIllIIlII;
    private final /* synthetic */ Client ai;

    private static void lIllIIIlIIIllIl() {
        lIIllIllIIlII = new String[lIIllIllIIlIl[3]];
        g.lIIllIllIIlII[g.lIIllIllIIlIl[0]] = g."Leave";
        g.lIIllIllIIlII[g.lIIllIllIIlIl[1]] = g."mate";
        g.lIIllIllIIlII[g.lIIllIllIIlIl[2]] = g."Leave";
    }

    private static boolean lIllIIIlIIIllll(int n2) {
        return n2 == 0;
    }

    private static String lIllIIIlIIIlIlI(String var11, String var4) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var9 = var4.toCharArray();
        int var7 = lIIllIllIIlIl[0];
        char[] var20 = var11.toCharArray();
        int var15 = var20.length;
        int var18 = lIIllIllIIlIl[0];
        while (g.lIllIIIlIIlIIll(var18, var15)) {
            char var19 = var20[var18];
            var3.append((char)(var19 ^ var9[var7 % var9.length]));
            0;
            ++var7;
            ++var18;
            0;
            
            return null;
        }
        return String.valueOf(var3);
    }

    private static boolean lIllIIIlIIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlIIlIIIl(Object object) {
        return object != null;
    }

    private static void lIllIIIlIIIlllI() {
        lIIllIllIIlIl = new int[5];
        g.lIIllIllIIlIl[0] = (0x55 ^ 0x18 ^ (0x24 ^ 0x31)) & (4 ^ 0x58 ^ (0xAF ^ 0xAB) ^ -1);
        g.lIIllIllIIlIl[1] = 1;
        g.lIIllIllIIlIl[2] = 2;
        g.lIIllIllIIlIl[3] = 3;
        g.lIIllIllIIlIl[4] = 61 + 129 - 42 + 21 ^ 96 + 33 - -20 + 12;
    }

    private static boolean lIllIIIlIIlIIlI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        g var12;
        if (g.lIllIIIlIIIllll(this.ai.isInInstancedRegion() ? 1 : 0)) {
            return lIIllIllIIlIl[0];
        }
        if (g.lIllIIIlIIIllll(var12.ag.M() ? 1 : 0)) {
            return lIIllIllIIlIl[0];
        }
        if (g.lIllIIIlIIlIIII(Dialog.isOpen() ? 1 : 0)) {
            return lIIllIllIIlIl[0];
        }
        if (g.lIllIIIlIIIllll(Movement.shouldWalk() ? 1 : 0)) {
            return lIIllIllIIlIl[0];
        }
        NPC var1 = NPCs.getNearest(nPC -> {
            int n2;
            if (g.lIllIIIlIIlIIII(nPC.getName().toLowerCase().contains(lIIllIllIIlII[lIIllIllIIlIl[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIllIIlIl[1]];
                stringArray[g.lIIllIllIIlIl[0]] = lIIllIllIIlII[lIIllIllIIlIl[2]];
                if (g.lIllIIIlIIlIIII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIllIIlIl[1];
                    0;
                    if (-(0x1C ^ 4 ^ (0x83 ^ 0x9E)) < 0) return n2 != 0;
                    return ((0x7F ^ 0xD ^ (0xD7 ^ 0x8E)) & (143 + 164 - 125 + 6 ^ 36 + 108 - 131 + 138 ^ -1)) != 0;
                }
            }
            n2 = lIIllIllIIlIl[0];
            return n2 != 0;
        });
        Player var21 = Players.getLocal();
        if (!g.lIllIIIlIIlIIIl(var21) || g.lIllIIIlIIlIIlI(var1)) {
            return lIIllIllIIlIl[0];
        }
        var1_1.interact(lIIllIllIIlII[lIIllIllIIlIl[0]]);
        return lIIllIllIIlIl[1];
    }

    static {
        g.lIllIIIlIIIlllI();
        g.lIllIIIlIIIllIl();
    }

    private static String lIllIIIlIIIlIll(String var13, String var10) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var17 = Cipher.getInstance("Blowfish");
            var17.init(lIIllIllIIlIl[2], var14);
            return new String(var17.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlIIIllII(String var2, String var22) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), lIIllIllIIlIl[4]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(lIIllIllIIlIl[2], var6);
            return new String(var8.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }

    @Inject
    protected g(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        this.ag = a2;
        this.ah = squireTemporossConfig;
        this.ai = client;
        this.aj = squireTempoross;
    }

    private static boolean lIllIIIlIIlIIII(int n2) {
        return n2 != 0;
    }
}

