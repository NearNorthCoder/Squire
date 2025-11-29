/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.movement.pathfinder.TeleportLoader
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import gg.squire.corp.tasks.CorpManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.corp.SquireCorp;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.TeleportLoader;

@TaskDesc(name="Specing Corp")
public class SpecingCorpTask
extends CorpTaskBase {
    @Inject
    private  s a;
    
    @Inject
    private  SquireCorp p;

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        r var3;
        if ((this.g( == 0) ? 1 : 0)) {
            return 0;
        }
        NPC var4 = var3.f();
        if (!var4 != null || !(Reachable.isInteractable(LocatablelllllllllllllllIllIIIlllllIlIlII) ? 1 : 0) || (var4.isDead( != 0) ? 1 : 0)) {
            return 0;
        }
        Player var5 = Players.getNearest(player -> {
            int n2;
            if (player != player2) && (player.getInteracting() == player.getInteracting()2) && (player.isFriend( == 0) ? 1 : 0)) {
                n2 = 1;
                0;
                if (1 != 1) {
                    return ((0xB3 ^ 0x9D ^ (0x5A ^ 0x66)) & (0x4A ^ 3 ^ (0x27 ^ 0x7C) ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var5 != null {
            var3.p.c(1);
            return 0;
        }
        EquipmentSetup var6 = var3.a.t();
        if var6 == null {
            return 0;
        }
        if (!(Combat.getSpecEnergy() >= 2) || (Combat.getCurrentHealth() < 3)) {
            TeleportLoader.enterHouse();
            0;
            return 0;
        }
        if ((Gear.isEquipped((int[] == 0)var6.getIds()) ? 1 : 0)) {
            Gear.swapTo((EquipmentSetup)var6);
            0;
            return 1;
        }
        if ((Combat.isSpecEnabled( == 0) ? 1 : 0)) {
            Combat.toggleSpec();
        }
        var1_1.interact(var2[0]);
        this.p.b(1);
        return 1;
    }

    private static String var7(String var8, String var9) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var11 = var9.toCharArray();
        int var12 = 0;
        char[] var13 = var8.toCharArray();
        int var14 = var13.length;
        int var15 = 0;
        while (var15 < var14) {
            char var16 = var13[var15];
            var10.append((char)(var16 ^ var11[var12 % var11.length]));
            0;
            ++var12;
            ++var15;
            0;
            if (((3 + 20 - -127 + 0 ^ 10 + 29 - -98 + 9) & (0x7E ^ 0x13 ^ (0x5E ^ 0x37) ^ -1)) >= ((0xFB ^ 0xBF ^ (0x3E ^ 0x77)) & (0x18 ^ 0x53 ^ (0x5D ^ 0x1B) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var10);
    }

}

