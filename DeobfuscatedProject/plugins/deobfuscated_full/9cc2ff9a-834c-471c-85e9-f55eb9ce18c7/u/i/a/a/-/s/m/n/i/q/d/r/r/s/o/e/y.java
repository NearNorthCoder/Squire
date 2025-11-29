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
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

/* TASK: Getting Killcount -> GettingkillcountTask */
@TaskDesc(name="Getting Killcount", priority=5)
public class y
extends Task {
    private final /* synthetic */ Client aw;
    private final /* synthetic */ g au;
    private final /* synthetic */ SquireSaraConfig av;
    private static /* synthetic */ int[] lIIlIlIIIllll;
    private static /* synthetic */ String[] lIIlIlIIIlllI;
    private static final /* synthetic */ WorldPoint at;

    private static String lIlIlIllIIlllll(String var4, String var6) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIIlIlIIIllll[9]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIIlIlIIIllll[2], var18);
            return new String(var9.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlIllIlIlIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public y(g g2, SquireSaraConfig squireSaraConfig) {
        this.au = g2;
        this.av = squireSaraConfig;
        this.aw = Static.getClient();
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        List<String> list;
        y var16;
        if (y.lIlIlIllIlIIlII(this.au.s() ? 1 : 0)) {
            return lIIlIlIIIllll[0];
        }
        if (y.lIlIlIllIlIIlIl(var16.au.m() ? 1 : 0)) {
            return lIIlIlIIIllll[0];
        }
        if (y.lIlIlIllIlIIllI(var16.au.q(), var16.au.r())) {
            return lIIlIlIIIllll[0];
        }
        Player var17 = Players.getLocal();
        if (y.lIlIlIllIlIIlll(var17.getInteracting())) {
            return lIIlIlIIIllll[0];
        }
        if (y.lIlIlIllIlIIlIl(var16.av.kcSpirituals() ? 1 : 0)) {
            list = List.of(lIIlIlIIIlllI[lIIlIlIIIllll[0]], lIIlIlIIIlllI[lIIlIlIIIllll[1]]);
            0;
            if (2 == 3) {
                return false;
            }
        } else {
            list = List.of(lIIlIlIIIlllI[lIIlIlIIIllll[2]]);
        }
        List<String> var5 = list;
        NPC var3 = NPCs.getNearest(nPC -> {
            int n2;
            if (y.lIlIlIllIlIIlII(nPC.isDead() ? 1 : 0) && y.lIlIlIllIlIIlIl(var5.contains(nPC.getName()) ? 1 : 0)) {
                n2 = lIIlIlIIIllll[1];
                0;
                if ((0x28 ^ 0x2C) != (0x36 ^ 0x32)) {
                    return false;
                }
            } else {
                n2 = lIIlIlIIIllll[0];
            }
            return n2 != 0;
        });
        if (y.lIlIlIllIlIlIII(var17.distanceTo(at), lIIlIlIIIllll[3])) {
            Movement.walkTo((WorldPoint)at);
            0;
            return lIIlIlIIIllll[1];
        }
        if (y.lIlIlIllIlIlIIl(var3)) {
            if (y.lIlIlIllIlIlIlI(Players.getLocal().distanceTo(at), lIIlIlIIIllll[4])) {
                Worlds.hopTo((World)Worlds.getRandom(world -> {
                    int n2;
                    if (y.lIlIlIllIlIIlIl(world.isMembers() ? 1 : 0) && y.lIlIlIllIlIIlIl(world.isNormal() ? 1 : 0)) {
                        n2 = lIIlIlIIIllll[1];
                        0;
                        if ((0x65 ^ 0x60) == 0) {
                            return false;
                        }
                    } else {
                        n2 = lIIlIlIIIllll[0];
                    }
                    return n2 != 0;
                }));
                var16.sleep(lIIlIlIIIllll[5]);
                return lIIlIlIIIllll[1];
            }
            return lIIlIlIIIllll[0];
        }
        var3_3.interact(lIIlIlIIIlllI[lIIlIlIIIllll[6]]);
        this.sleep(lIIlIlIIIllll[2]);
        return lIIlIlIIIllll[1];
    }

    private static boolean lIlIlIllIlIIlII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlIllIlIIlll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIllIlIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIllIlIlIIl(Object object) {
        return object == null;
    }

    private static boolean lIlIlIllIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIlIllIlIIIll() {
        lIIlIlIIIllll = new int[10];
        y.lIIlIlIIIllll[0] = (0x5F ^ 0x78) & ~(0x74 ^ 0x53);
        y.lIIlIlIIIllll[1] = 1;
        y.lIIlIlIIIllll[2] = 2;
        y.lIIlIlIIIllll[3] = 0x71 ^ 0x5E ^ (0x61 ^ 0x48);
        y.lIIlIlIIIllll[4] = 40 + 46 - -2 + 63 ^ 126 + 53 - 57 + 35;
        y.lIIlIlIIIllll[5] = 0xB9 ^ 0xB6 ^ (0x44 ^ 0x4F);
        y.lIIlIlIIIllll[6] = 3;
        y.lIIlIlIIIllll[7] = -(0x81 ^ 0x86) & (0xFFFFDBDF & 0x2F7F);
        y.lIIlIlIIIllll[8] = -(0xFFFF8735 & 0x7ACB) & (0xFFFF9EFD & 0x77B7);
        y.lIIlIlIIIllll[9] = 0xCC ^ 0xC4;
    }

    private static boolean lIlIlIllIlIlIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIlIllIlIIIIl(String var1, String var22) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var22.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var19 = Cipher.getInstance("Blowfish");
            var19.init(lIIlIlIIIllll[2], var10);
            return new String(var19.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    static {
        y.lIlIlIllIlIIIll();
        y.lIlIlIllIlIIIlI();
        at = new WorldPoint(lIIlIlIIIllll[7], lIIlIlIIIllll[8], lIIlIlIIIllll[2]);
    }

    private static String lIlIlIllIlIIIII(String var8, String var21) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var23 = var21.toCharArray();
        int var11 = lIIlIlIIIllll[0];
        char[] var2 = var8.toCharArray();
        int var13 = var2.length;
        int var12 = lIIlIlIIIllll[0];
        while (y.lIlIlIllIlIlIll(var12, var13)) {
            char var15 = var2[var12];
            var20.append((char)(var15 ^ var23[var11 % var23.length]));
            0;
            ++var11;
            ++var12;
            0;
            if (2 >= -1) continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static void lIlIlIllIlIIIlI() {
        lIIlIlIIIlllI = new String[lIIlIlIIIllll[5]];
        y.lIIlIlIIIlllI[y.lIIlIlIIIllll[0]] = y."Saradomin priest";
        y.lIIlIlIIIlllI[y.lIIlIlIIIllll[1]] = y."Spiritual mage";
        y.lIIlIlIIIlllI[y.lIIlIlIIIllll[2]] = y."Saradomin priest";
        y.lIIlIlIIIlllI[y.lIIlIlIIIllll[6]] = y."Attack";
    }

    private static boolean lIlIlIllIlIIllI(int n2, int n3) {
        return n2 >= n3;
    }
}

