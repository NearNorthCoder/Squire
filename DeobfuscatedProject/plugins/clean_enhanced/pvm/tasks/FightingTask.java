/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import gg.squire.pvm.tasks.PvmManager;

@TaskDesc(name="Fighting")
public class FightingTask
extends Task {
    private final  SquireShamansPlugin an;
    private final  c ao;
    private final  SquireShamanConfig ap;

    private static final  Logger am;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3;
        void var4;
        t var5;
        NPC nPC = this.ao.o();
        Player player = Players.getLocal();
        if (!t.var6(nPC) || !t.var7(this.ap.room().x().contains((Locatable)player) ? 1 : 0) || t.var7(player.isMoving() ? 1 : 0)) {
            return var1[0];
        }
        Item var8 = Inventory.getFirst(item -> {
            boolean bl;
            if (!t.var9(item.getId(), this.ap.weapon()) || t.var10(item.getId(), this.an.d())) {
                bl = var1[2];
                0;
                if (((0x5F ^ 0x7B) & ~(0xA8 ^ 0x8C)) != 0) {
                    return ((0x7C ^ 0x62) & ~(0x80 ^ 0x9E)) != 0;
                }
            } else {
                bl = var1[0];
            }
            return bl;
        });
        if (t.var6(var8)) {
            String[] stringArray = new String[var1[1]];
            stringArray[t.var1[0]] = var2[var1[0]];
            stringArray[t.var1[2]] = var2[var1[2]];
            stringArray[t.var1[3]] = var2[var1[3]];
            var8.interact(stringArray);
            return var1[2];
        }
        if (t.var6(var4.getInteracting())) {
            return var1[0];
        }
        WorldPoint var11 = var4.getWorldLocation();
        if (t.var12(var5.ao.a(var11) ? 1 : 0)) {
            return var1[0];
        }
        if (t.var10(var3.getAnimation(), var1[4])) {
            return var1[0];
        }
        if (t.var13(var5.ao.a(var11, (NPC)var3).distanceTo(var11), var1[2])) {
            var3.interact(var2[var1[1]]);
            return var1[2];
        }
        return var1[0];
    }

    @Inject
    public FightingTask(SquireShamansPlugin squireShamansPlugin, c c2, SquireShamanConfig squireShamanConfig) {
        this.an = squireShamansPlugin;
        this.ao = c2;
        this.ap = squireShamanConfig;
    }

    static {
        t.var14();
        t.var15();
        am = LoggerFactory.getLogger(FightingTask.class);
    }

    private static boolean var9(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var10(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var13(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var16(int n2, int n3) {
        return n2 < n3;
    }

    private static void var15() {
        var2 = new String[var1[5]];
        t.var2[t.var1[0]] = "Wield";
        t.var2[t.var1[2]] = "Wear";
        t.var2[t.var1[3]] = "Equip";
        t.var2[t.var1[1]] = "Attack";
    }

    private static String var17(String var18, String var19) {
        var18 = new String(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var21 = var19.toCharArray();
        int var22 = var1[0];
        char[] var23 = var18.toCharArray();
        int var24 = var23.length;
        int var25 = var1[0];
        while (t.var16(var25, var24)) {
            char var26 = var23[var25];
            var20.append((char)(var26 ^ var21[var22 % var21.length]));
            0;
            ++var22;
            ++var25;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var20);
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    private static boolean var12(int n2) {
        return n2 == 0;
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    private static void var14() {
        var1 = new int[7];
        t.var1[0] = (0xC ^ 2 ^ (0xC4 ^ 0x9D)) & (0x65 ^ 0x18 ^ (8 ^ 0x22) ^ -1);
        t.var1[1] = 3;
        t.var1[2] = 1;
        t.var1[3] = 2;
        t.var1[4] = 0xFFFFBBFC & 0x5FF3;
        t.var1[5] = 0x8A ^ 0x8E;
        t.var1[6] = 23 + 189 - 65 + 57 ^ 100 + 12 - 85 + 169;
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }
}

