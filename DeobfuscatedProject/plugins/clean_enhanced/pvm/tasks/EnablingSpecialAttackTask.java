/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.pvm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.pvm.SquireShamanConfig;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Equipment;
import gg.squire.pvm.tasks.PvmManager;

@TaskDesc(name="Enabling special attack", priority=10)
public class EnablingSpecialAttackTask
extends Task {

    private final  SquireShamanConfig al;
    private final  c ak;

    private static boolean var3(Object object) {
        return object == null;
    }

    private static void var4() {
        var1 = new int[6];
        s.var1[0] = (0x10 ^ 0x73) & ~(0x3B ^ 0x58);
        s.var1[1] = 0x54 ^ 0x66;
        s.var1[2] = 0x35 ^ 0x3E ^ 1;
        s.var1[3] = 1;
        s.var1[4] = 0x59 ^ 0x4F ^ (0x57 ^ 0x76);
        s.var1[5] = 2;
    }

    private static boolean var5(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var6(int n2, int n3) {
        return n2 < n3;
    }

    private static void var7() {
        var2 = new String[var1[5]];
        s.var2[s.var1[0]] = "blowpipe";
        s.var2[s.var1[3]] = "magic shortbow";
    }

    static {
        s.var4();
        s.var7();
    }

    public boolean run() {
        Player player = Players.getLocal();
        if (s.var8(this.al.room().x().contains((Locatable)player) ? 1 : 0)) {
            return var1[0];
        }
        if (s.var9(Combat.isSpecEnabled() ? 1 : 0)) {
            return var1[0];
        }
        Item var10 = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (s.var3(var10)) {
            return var1[0];
        }
        String var11 = var10.getName().toLowerCase();
        if (s.var9(var11.contains(var2[var1[0]]) ? 1 : 0) && s.var12(Combat.getSpecEnergy(), var1[1]) && s.var5(Combat.getMissingHealth(), var1[2])) {
            Combat.toggleSpec();
            return var1[3];
        }
        if (s.var9(var11.contains(var2[var1[3]]) ? 1 : 0) && s.var12(Combat.getSpecEnergy(), var1[4])) {
            Combat.toggleSpec();
            return var1[3];
        }
        return var1[0];
    }

    private static String var13(String var14, String var15) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var16 = new StringBuilder();
        char[] var17 = var15.toCharArray();
        int var18 = var1[0];
        char[] var19 = var14.toCharArray();
        int var20 = var19.length;
        int var21 = var1[0];
        while (s.var6(var21, var20)) {
            char var22 = var19[var21];
            var16.append((char)(var22 ^ var17[var18 % var17.length]));
            0;
            ++var18;
            ++var21;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(var16);
    }

    private static boolean var12(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    @Inject
    public EnablingSpecialAttackTask(c c2, SquireShamanConfig squireShamanConfig) {
        this.ak = c2;
        this.al = squireShamanConfig;
    }

    private static boolean var8(int n2) {
        return n2 == 0;
    }
}

