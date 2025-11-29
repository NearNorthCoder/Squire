/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.List;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum4;
import gg.squire.gauntlet.tasks.EHelper;
import gg.squire.gauntlet.tasks.GameEnum;
import gg.squire.gauntlet.tasks.MHelper;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@Singleton
@TaskDesc(name="Cooking food", priority=4, blocking=true)
public class CookingFoodTask
extends GauntletTaskBase {
    
    private  int bP;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var4_5;
        Item var3;
        B var4;
        void var5;
        void var6;
        m m2 = this.ba.V().av();
        List list = TileItems.getAll(tileItem -> {
            int n2;
            if ((m2.e(tileItem.getWorldLocation( != 0)) ? 1 : 0) && (i.FISH.aA( != 0).contains(tileItem.getId()) ? 1 : 0)) {
                n2 = 0;
                0;
                if (((0x42 ^ 0x2B ^ (7 ^ 0x3F)) & (0x31 ^ 0x73 ^ (0xA7 ^ 0xB4) ^ -1)) != 0) {
                    return ((130 + 8 - 71 + 130 ^ 129 + 98 - 91 + 9) & (0xAC ^ 0x97 ^ (0x14 ^ 0x7B) ^ -1)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if ((list.size( > 0)) && (Inventory.getFreeSlots( > 0))) {
            TileItem tileItem2 = (TileItem)list.get(1);
            tileItem2.interact(var2[1]);
            m2.l(TileItems.getAll(tileItem -> {
                int n2;
                if ((m2.e(tileItem.getWorldLocation( != 0)) ? 1 : 0) && (i.FISH.aA( != 0).contains(tileItem.getId()) ? 1 : 0)) {
                    n2 = 0;
                    0;
                    if ((6 ^ 2) <= 0) {
                        return ((0x75 ^ 0x3D) & ~(0x75 ^ 0x3D)) != 0;
                    }
                } else {
                    n2 = 1;
                }
                return n2 != 0;
            }).size());
            return 0;
        }
        var6.l(var5.size());
        int var7 = i.FISH.aC();
        if (var7 == 0) {
            var4.bP = 2;
            return 1;
        }
        if (var7 < var4.bP) {
            var4.bP = var7;
            Time.sleepTick();
            0;
            return 0;
        }
        TileObject var8 = TileObjects.getNearest(tileObject -> e.aE.contains(tileObject.getId()));
        if var8 == null {
            return 1;
        }
        Player var9 = Players.getLocal();
        if var9 == null {
            return 1;
        }
        if ((Skills.getBoostedLevel((SkiSkill.HITPOINTS) < Skills.getLevel((SkiSkill.HITPOINTS) - 3) && (var3 = Inventory.getFirst(item -> e.aH.contains(item.getId( != null))))) {
            var3.interact(var2[0]);
        }
        var4_5.interact(var2[4]);
        return 0;
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    @Inject
    public CookingFoodTask(c c2) {
        d[] dArray = new d[0];
        dArray[1] = d.PREPARE_BOSS_FIGHT;
        super(c2, dArray);
        this.bP = 2;
    }

    private static String var16(String var17, String var18) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var19 = new StringBuilder();
        char[] var20 = var18.toCharArray();
        int var21 = 1;
        char[] var22 = var17.toCharArray();
        int var23 = var22.length;
        int var24 = 1;
        while (var24 < var23) {
            char var25 = var22[var24];
            var19.append((char)(var25 ^ var20[var21 % var20.length]));
            0;
            ++var21;
            ++var24;
            0;
            if (3 == 3) continue;
            return null;
        }
        return String.valueOf(var19);
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }
}

