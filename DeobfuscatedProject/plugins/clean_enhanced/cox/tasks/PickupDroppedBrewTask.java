/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum8;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Pickup Dropped Brew", priority=30000, blocking=true)
public class PickupDroppedBrewTask
extends Task {
    
    private final  SquireChambersConfig cK;
    
    private final  SquireChambersPlugin cJ;

    protected int cp() {
        return Inventory.getCount(item -> item.getName().startsWith(var2[8]));
    }

    protected int cq() {
        return Inventory.getCount(item -> item.getName().startsWith(var2[7]));
    }

    @Inject
    public PickupDroppedBrewTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig) {
        this.cJ = squireChambersPlugin;
        this.cK = squireChambersConfig;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3_4;
        int lllllllllllllllIllIIllIlIllllllI22;
        NPC var9;
        ag var10;
        if ((this.cK.pickupBrews( == 0) ? 1 : 0)) {
            return 0;
        }
        if ((var10.cJ.E( == 0) ? 1 : 0)) {
            return 0;
        }
        if (((Object)var10.cJ.L().aM() == (Object)var10.cJ.L().aM()2)N.SCAVENGERS)) {
            return 0;
        }
        if (((Object)var10.cJ.L().aM() == (Object)var10.cJ.L().aM()2)N.TIGHTROPE)) {
            String[] stringArray = new String[1];
            stringArray[0] = var2[0];
            if ((Inventory.contains((String[] == 0)stringArray) ? 1 : 0)) {
                return 0;
            }
        }
        if ((var9 = NPCs.getNearest(nPC -> {
            int n2;
            String[] stringArray = new String[1];
            stringArray[0] = var2[4];
            if ((nPC.hasAction(stringArray != 0 != null) ? 1 : 0) && (this.cJ.L( != 0).a((Locatable)nPC) ? 1 : 0)) {
                n2 = 1;
                0;
                if (-(30 + 108 - 94 + 107 ^ 17 + 100 - 107 + 136) >= 0) {
                    return ((41 + 102 - -17 + 38 ^ 108 + 118 - 65 + 33) & (0x12 ^ 0x37 ^ (0x41 ^ 0x60) ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        }))) {
            return 0;
        }
        if ((Inventory.isFull( != 0) ? 1 : 0)) {
            return 0;
        }
        if (((Object)var10.cJ.L().aM() == (Object)var10.cJ.L().aM()2)N.ICE_DEMON) && (lllllllllllllllIllIIllIlIllllllI22 = 2 - var10.cJ.K( > 0) + (3 - Skills.getLevel((SkiSkill.WOODCUTTING)) / 4)) {
            return 0;
        }
        if (((Object)var10.cJ.L().aM() == (Object)var10.cJ.L().aM()2)N.THIEVING) && (lllllllllllllllIllIIllIlIllllllI22 = 5 - var10.cJ.J( > 0) + (3 - Skills.getLevel((SkiSkill.THIEVING)) / 6)) {
            return 0;
        }
        TileItem lllllllllllllllIllIIllIlIllllllI22 = TileItems.getNearest(tileItem -> {
            int n2;
            if ((tileItem.getId() == var1[10]) && (Reachable.isWalkable(WorldPointtileItem.getWorldLocation()) ? 1 : 0)) {
                n2 = 1;
                0;
                if (((0xF5 ^ 0xAF) & ~(0x49 ^ 0x13)) > (0xE ^ 0xA)) {
                    return ((0xAD ^ 0x9A) & ~(0x82 ^ 0xB5)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if lllllllllllllllIllIIllIlIllllllI22 != null {
            return 0;
        }
        TileItem var11 = TileItems.getNearest(tileItem -> {
            int n2;
            if ((tileItem.getName( != 0).toLowerCase().contains(var2[9]) ? 1 : 0) && (this.cJ.L( != 0).a((Locatable)tileItem) ? 1 : 0) && (Reachable.isWalkable(WorldPointtileItem.getWorldLocation()) ? 1 : 0)) {
                n2 = 1;
                0;
                if (1 <= 0) {
                    return ((127 + 15 - 28 + 15 ^ 118 + 127 - 224 + 160) & (149 + 18 - 107 + 123 ^ 43 + 41 - 31 + 78 ^ -1)) != 0;
                }
            } else {
                n2 = 0;
            }
            return n2 != 0;
        });
        if var11 == null {
            return 0;
        }
        var3_4.interact(var2[1]);
        return 1;
    }

    private static String var12(String var13, String var14) {
        var13 = new String(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var15 = new StringBuilder();
        char[] var16 = var14.toCharArray();
        int var17 = 0;
        char[] var18 = var13.toCharArray();
        int var19 = var18.length;
        int var20 = 0;
        while (var20 < var19) {
            char var21 = var18[var20];
            var15.append((char)(var21 ^ var16[var17 % var16.length]));
            0;
            ++var17;
            ++var20;
            0;
            if ((0xBB ^ 0xBE) != 0) continue;
            return null;
        }
        return String.valueOf(var15);
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

}

