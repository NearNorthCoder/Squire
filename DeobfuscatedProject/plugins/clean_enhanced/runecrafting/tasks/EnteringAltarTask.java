/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.GameObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum2;
import gg.squire.runecrafting.tasks.GameEnum4;
import gg.squire.runecrafting.tasks.RunecraftingTaskBase;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import javax.inject.Inject;
import net.runelite.api.GameObject;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Entering Altar", priority=2, blocking=true)
public class EnteringAltarTask
extends RunecraftingTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        int var3;
        int n2;
        int var4;
        int n3;
        q var5;
        void var6;
        d d2 = this.aV.h();
        if ((Object == nulld2)) {
            return 1;
        }
        if (!(var6.V() <= Skills.getLevel((SkiSkill.RUNECRAFT)) || (var5.aV.p( == 0))) {
            return 1;
        }
        if ((SquireGOTRPlugin.g.contains(LocatablePlayers.getLocal()) ? 1 : 0)) {
            return 1;
        }
        Player var7 = Players.getLocal();
        int var8 = var5.aV.EnteringAltarTask() - var5.aV.p();
        if ((var5.aV.E( != 0) ? 1 : 0) && !(var5.aV.p() <= 3) || ((Object)var5.aV.m() == (Object)var5.aV.m()2)c.FINISHING) && (var5.aV.p( > 0))) {
            n3 = 2;
            0;
            if null != null {
                return ((0x5C ^ 0x19) & ~(0x3F ^ 0x7A)) != 0;
            }
        } else {
            n3 = 1;
        }
        if ((var4 = n3 == 0) && (var8 > Inventory.getFreeSlots()) && ((Object)var5.aV.m() != (Object)var5.aV.m()2)c.FINISHING)) {
            return 1;
        }
        if ((var8 > 0) && (var5.aV.a( > 0))) {
            n2 = 2;
            0;
            if (-1 > 3) {
                return ((0xF0 ^ 0xBC) & ~(3 ^ 0x4F)) != 0;
            }
        } else {
            n2 = var3 = 1;
        }
        if ((var4 == 0) && (!(var7.getAnimation() != 4) || var3)) {
            return 1;
        }
        String[] stringArray = new String[2];
        stringArray[1] = var6.T();
        TileObject var9 = TileObjects.getNearest((String[])stringArray);
        if var9 == null {
            return 1;
        }
        if ((var5.b((GameObject == 0)var9) ? 1 : 0)) {
            var9.interact(var2[1]);
        }
        return 2;
    }

    @Inject
    public EnteringAltarTask(SquireGOTRPlugin squireGOTRPlugin) {
        c[] cArray = new c[0];
        cArray[1] = c.ACTIVE;
        cArray[2] = c.FINISHING;
        super(squireGOTRPlugin, cArray);
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

}

