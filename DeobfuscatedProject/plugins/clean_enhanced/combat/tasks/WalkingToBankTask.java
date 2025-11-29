/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.combat.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.combat.SquireBlueDragonKiller;
import gg.squire.combat.SquireBlueDragonKillerConfig;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Walking To Bank")
public class WalkingToBankTask
extends Task {

    private final  SquireBlueDragonKiller G;
    private final  SquireBlueDragonKillerConfig H;

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < lllllllllllllllIlllIlIIllIIlIlll2) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((0xE7 ^ 0xBE ^ (0x1F ^ 0x67)) & (59 + 172 - 116 + 110 ^ 63 + 158 - 86 + 57 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public boolean run() {
        k var13;
        if ((this.G.h( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var13.y( != 0) ? 1 : 0)) {
            return 0;
        }
        this.z();
        return 1;
    }

    @Inject
    public WalkingToBankTask(SquireBlueDragonKiller squireBlueDragonKiller, SquireBlueDragonKillerConfig squireBlueDragonKillerConfig) {
        this.G = squireBlueDragonKiller;
        this.H = squireBlueDragonKillerConfig;
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private void z() {
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return;
        }
        if ((Inventory.contains(item -> item.getName( != 0).contains(var1[2])) ? 1 : 0)) {
            Inventory.getFirst(item -> item.getName().contains(var1[1])).interact(var1[0]);
            return;
        }
        Movement.walkTo((WorldArea)this.H.bankLocation().getArea());
        0;
    }

    private boolean y() {
        return this.H.bankLocation().getArea().contains((Locatable)Players.getLocal());
    }
}

