/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.HHelper;
import gg.squire.gauntlet.tasks.LHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;

@TaskDesc(name="Attack T1 Monsters", priority=2)
public class AttackT1MonstersTask
extends GauntletTaskBase {
    
    private final  b ca;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    @Inject
    public AttackT1MonstersTask(c c2, b b2) {
        d[] dArray = new d[var1[0]];
        dArray[P.var1[1]] = d.FIRST_ROTATION_EXPLORE;
        super(c2, dArray);
        this.ca = b2;
    }

    private static boolean var4(Object object, Object object2) {
        return object == object2;
    }

    private static void var5() {
        var1 = new int[4];
        P.var1[0] = 1;
        P.var1[1] = (169 + 168 - 185 + 35 ^ 92 + 154 - 226 + 153) & (42 + 43 - -43 + 82 ^ 71 + 135 - 121 + 111 ^ -1);
        P.var1[2] = 0x78 ^ 0x7D;
        P.var1[3] = 2;
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    private static  int b(Player player, NPC nPC) {
        return nPC.distanceTo(player.getWorldLocation());
    }

    static {
        P.var5();
        P.var7();
    }

    private static boolean var8(Object object) {
        return object != null;
    }

    private static boolean var9(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var10;
        NPC var11;
        int n2;
        int var12;
        int n3;
        P var13;
        Player player = Players.getLocal();
        if (!P.var8(player) || P.var8(player.getInteracting())) {
            return var1[1];
        }
        if (P.var6(var13.ba.B() ? 1 : 0)) {
            return var1[1];
        }
        h var14 = var13.ba.V();
        l var15 = var14.ar().orElse(null);
        if (!P.var8(var15) || P.var4(var15, var14.av())) {
            n3 = var1[0];
            0;
            if (2 < 0) {
                return ((0xBD ^ 0xB6) & ~(0x9D ^ 0x96)) != 0;
            }
        } else {
            n3 = var1[1];
        }
        if (P.var3(var12 = n3)) {
            n2 = var1[0];
            0;
            if (-(0x4C ^ 0x24 ^ (0xED ^ 0x81)) >= 0) {
                return ((0xC0 ^ 0xA0 ^ (0x3F ^ 1)) & (0xDF ^ 0x95 ^ (0x8B ^ 0x9F) ^ -1)) != 0;
            }
        } else {
            n2 = var1[1];
        }
        if (P.var9(var11 = (NPC)NPCs.getAll((int[])e.as[n2]).stream().filter(nPC -> {
            boolean bl;
            if (P.var6(nPC.isDead() ? 1 : 0)) {
                bl = var1[0];
                0;
                if (((59 + 111 - 151 + 132 ^ 135 + 113 - 238 + 157) & (103 + 47 - -5 + 31 ^ 9 + 108 - 24 + 45 ^ -1)) != 0) {
                    return ((0x60 ^ 9 ^ (0xC3 ^ 0xA3)) & (0x23 ^ 0x63 ^ (0xDF ^ 0x96) ^ -1)) != 0;
                }
            } else {
                bl = var1[1];
            }
            return bl;
        }).min(Comparator.comparingInt(arg_0 -> P.b((Player)var10, arg_0))).orElse(null))) {
            return var1[1];
        }
        if (P.var6(var13.ca.t() ? 1 : 0) && P.var6(var10.isMoving() ? 1 : 0)) {
            var11.interact(var2[var1[1]]);
            var13.ca.c(var1[2]);
        }
        return var1[0];
    }

    private static void var7() {
        var2 = new String[var1[0]];
        P.var2[P.var1[1]] = "Attack";
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }
}

