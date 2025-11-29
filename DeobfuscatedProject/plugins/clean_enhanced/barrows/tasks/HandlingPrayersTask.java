/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.barrows.tasks;

import com.google.inject.Inject;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.barrows.tasks.GameEnum2;

@TaskDesc(name="Handling Prayers", priority=0x7FFFFFFF)
public class HandlingPrayersTask
extends Task {

    private final  SquireBarrowsConfig C;

    /*
     * WARNING - void declaration
     */
    private List<Prayer> b(NPC nPC) {
        void var3_3;
        void var3;
        g var4;
        void var5;
        String string = nPC.getName();
        if (g.var6(string)) {
            return List.of();
        }
        ArrayList<Prayer> var7 = new ArrayList<Prayer>();
        if (g.var8(var5.contains(var2[var1[0]]) ? 1 : 0)) {
            var7.addAll(var4.C.karilOffensive().I());
            0;
            var7.add(Prayer.PROTECT_FROM_MISSILES);
            0;
            0;
            if (-3 >= 0) {
                return null;
            }
        } else if (g.var8(var5.contains(var2[var1[1]]) ? 1 : 0)) {
            var7.addAll(var4.C.ahrimOffensive().I());
            0;
            var7.add(Prayer.PROTECT_FROM_MAGIC);
            0;
            0;
            if (1 <= 0) {
                return null;
            }
        } else if (g.var8(d.a((Actor)var3) ? 1 : 0)) {
            var7.addAll(var4.C.defaultOffensive().I());
            0;
            var7.add(Prayer.PROTECT_FROM_MELEE);
            0;
            0;
            
        } else {
            var7.addAll(var4.C.tunnelOffensive().I());
            0;
            var7.add(Prayer.PROTECT_FROM_MELEE);
            0;
        }
        return var3_3;
    }

    @Inject
    public HandlingPrayersTask(SquireBarrowsConfig squireBarrowsConfig) {
        this.C = squireBarrowsConfig;
    }

    private static void var9() {
        var1 = new int[4];
        g.var1[0] = (0x77 ^ 0x56 ^ (0xE1 ^ 0x9D)) & (0 + 35 - -33 + 91 ^ 71 + 69 - -8 + 46 ^ -1);
        g.var1[1] = 1;
        g.var1[2] = 2;
        g.var1[3] = 0x4E ^ 0x46;
    }

    private static String var10(String var11, String var12) {
        var11 = new String(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var14 = var12.toCharArray();
        int var15 = var1[0];
        char[] var16 = var11.toCharArray();
        int var17 = var16.length;
        int var18 = var1[0];
        while (g.var19(var18, var17)) {
            char var20 = var16[var18];
            var13.append((char)(var20 ^ var14[var15 % var14.length]));
            0;
            ++var15;
            ++var18;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }

    private static boolean var21(int n2) {
        return n2 == 0;
    }

    private static boolean var22(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    private static  boolean a(Player player, NPC nPC) {
        boolean bl;
        void var23;
        Player var24;
        if (g.var8(Reachable.isInteractable((Locatable)nPC) ? 1 : 0) && !g.var25(nPC.getInteracting(), player) || g.var22(var24.getInteracting(), var23)) {
            bl = var1[1];
            0;
            if (2 <= 1) {
                return ((0x23 ^ 9) & ~(3 ^ 0x29)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    private static boolean var25(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

    private static void var26() {
        var2 = new String[var1[2]];
        g.var2[g.var1[0]] = "Karil";
        g.var2[g.var1[1]] = "Ahrim";
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_3;
        g var33;
        void var34;
        Player player = Players.getLocal();
        if (g.var6(player)) {
            return var1[0];
        }
        if (g.var21(Prayers.getPoints())) {
            return var1[0];
        }
        NPC var35 = NPCs.getNearest(arg_0 -> g.a((Player)var34, arg_0));
        if (g.var6(var35)) {
            if (g.var8(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return var1[1];
            }
            return var1[0];
        }
        List<Prayer> var36 = var33.b(var35);
        if (g.var6(var36)) {
            return var1[0];
        }
        Prayers.flick((List)var3_3);
        0;
        return var1[1];
    }

    static {
        g.var9();
        g.var26();
    }
}

