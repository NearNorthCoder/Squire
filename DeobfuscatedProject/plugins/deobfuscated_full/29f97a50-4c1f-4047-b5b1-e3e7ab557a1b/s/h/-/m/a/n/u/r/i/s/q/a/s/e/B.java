/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.World
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Worlds
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package s.h.-.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.World;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.c;
import s.h.-.m.a.n.u.r.i.s.q.a.s.e.g;

/* TASK: Walking to shamans -> WalkingtoshamansTask */
@TaskDesc(name="Walking to shamans", priority=10, blocking=true)
public class B
extends Task {
    private final /* synthetic */ SquireShamansPlugin aP;
    private static /* synthetic */ String[] lIIlIllllllIl;
    private final /* synthetic */ c aO;
    private static /* synthetic */ int[] lIIllIIIIlIlI;

    private static boolean lIlIlllIlIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static void lIlIlllIlIllIII() {
        lIIllIIIIlIlI = new int[6];
        B.lIIllIIIIlIlI[0] = (0x4C ^ 0x21 ^ (0x5B ^ 0x30)) & (0x4C ^ 0x63 ^ (0x6A ^ 0x43) ^ -1);
        B.lIIllIIIIlIlI[1] = 0x8B ^ 0x9F;
        B.lIIllIIIIlIlI[2] = 1;
        B.lIIllIIIIlIlI[3] = -1;
        B.lIIllIIIIlIlI[4] = 2;
        B.lIIllIIIIlIlI[5] = 0xBF ^ 0xB7;
    }

    private static void lIlIlllIIlIIlIl() {
        lIIlIllllllIl = new String[lIIllIIIIlIlI[4]];
        B.lIIlIllllllIl[B.lIIllIIIIlIlI[0]] = B."Drink";
        B.lIIlIllllllIl[B.lIIllIIIIlIlI[2]] = B."Stamina";
    }

    private static boolean lIlIlllIllIIIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIlllIlIlllII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIlllIIlIIlII(String var6, String var18) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var12 = var18.toCharArray();
        int var11 = lIIllIIIIlIlI[0];
        char[] var21 = var6.toCharArray();
        int var13 = var21.length;
        int var7 = lIIllIIIIlIlI[0];
        while (B.lIlIlllIllIIIlI(var7, var13)) {
            char var8 = var21[var7];
            var10.append((char)(var8 ^ var12[var11 % var12.length]));
            0;
            ++var11;
            ++var7;
            0;
            if ((0xA3 ^ 0xA7) > 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    /*
     * WARNING - void declaration
     */
    private void H() {
        void var2_2;
        World var2;
        void var16;
        int n2 = this.aP.c();
        if (B.lIlIlllIlIlllIl(Worlds.getCurrentId(), n2)) {
            this.aP.a(lIIllIIIIlIlI[3]);
            return;
        }
        if (B.lIlIlllIlIllllI((int)var16, lIIllIIIIlIlI[3])) {
            var2 = Worlds.getFirst((int)var16);
            0;
            if (1 < 0) {
                return;
            }
        } else {
            var2 = Worlds.getFirst(world -> {
                int n2;
                if (B.lIlIlllIlIllIIl(world.isNormal() ? 1 : 0) && B.lIlIlllIlIllIIl(world.isMembers() ? 1 : 0) && B.lIlIlllIllIIIII(world.getId(), Worlds.getCurrentId())) {
                    n2 = lIIllIIIIlIlI[2];
                    0;
                    
                    }
                } else {
                    n2 = lIIllIIIIlIlI[0];
                }
                return n2 != 0;
            });
        }
        if (B.lIlIlllIlIlllll(var2) && B.lIlIlllIlIlllll(var2 = Worlds.getFirst(world -> {
            int n2;
            if (B.lIlIlllIlIllIIl(world.isNormal() ? 1 : 0) && B.lIlIlllIlIllIIl(world.isMembers() ? 1 : 0)) {
                n2 = lIIllIIIIlIlI[2];
                0;
                
                }
            } else {
                n2 = lIIllIIIIlIlI[0];
            }
            return n2 != 0;
        }))) {
            return;
        }
        Worlds.hopTo((World)var2_2);
    }

    private static boolean lIlIlllIllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlllIlIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIlllIlIlllll(Object object) {
        return object == null;
    }

    public boolean run() {
        B var17;
        if (B.lIlIlllIlIllIIl(this.aO.s() ? 1 : 0)) {
            return lIIllIIIIlIlI[0];
        }
        Item var20 = Inventory.getFirst(item -> item.getName().startsWith(lIIlIllllllIl[lIIllIIIIlIlI[2]]));
        if (B.lIlIlllIlIllIlI(var20) && B.lIlIlllIlIllIll(Movement.isStaminaBoosted() ? 1 : 0) && B.lIlIlllIlIlllII(Movement.getRunEnergy(), lIIllIIIIlIlI[1])) {
            var20.interact(lIIlIllllllIl[lIIllIIIIlIlI[0]]);
            return lIIllIIIIlIlI[2];
        }
        InventorySetup var3 = var17.aO.r();
        if (B.lIlIlllIlIllIll(var3.matchesInventory() ? 1 : 0)) {
            return lIIllIIIIlIlI[0];
        }
        g var14 = var17.aO.t();
        Player var19 = Players.getNearest(player -> {
            int n2;
            if (B.lIlIlllIlIllIIl(var14.x().contains((Locatable)player) ? 1 : 0) && B.lIlIlllIllIIIIl(player, Players.getLocal())) {
                n2 = lIIllIIIIlIlI[2];
                0;
                
                }
            } else {
                n2 = lIIllIIIIlIlI[0];
            }
            return n2 != 0;
        });
        if (B.lIlIlllIlIllIlI(var19)) {
            var17.H();
            return lIIllIIIIlIlI[0];
        }
        if (B.lIlIlllIlIllIIl(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)var14.A());
            0;
            return lIIllIIIIlIlI[2];
        }
        return lIIllIIIIlIlI[2];
    }

    private static boolean lIlIlllIlIllllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIlllIlIllIlI(Object object) {
        return object != null;
    }

    static {
        B.lIlIlllIlIllIII();
        B.lIlIlllIIlIIlIl();
    }

    private static boolean lIlIlllIlIllIIl(int n2) {
        return n2 != 0;
    }

    @Inject
    public B(c c2, SquireShamansPlugin squireShamansPlugin) {
        this.aO = c2;
        this.aP = squireShamansPlugin;
    }

    private static String lIlIlllIIlIIIll(String var9, String var5) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIIllIIIIlIlI[5]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIIllIIIIlIlI[4], var4);
            return new String(var1.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllIllIIIIl(Object object, Object object2) {
        return object != object2;
    }
}

