/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Actor
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.basics.favor;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.Actor;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@PluginDescriptor(name="Squire Shayzien Soldier Healer", description="Heals Shayzien Soldiers for favor", enabledByDefault=false)
@SquireUtil
public class SoldierHealer
extends SquirePlugin {
    private static final  int dn;
    private static  int[] lllIlIllI;
    private static  String[] lllIlIlIl;

    protected Class<?>[] tasks() {
        return new Class[1];
    }

    static {
        SoldierHealer.var1();
        SoldierHealer.var2();
        dn = 5;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static String var9(String var10, String var11) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var13 = var11.toCharArray();
        int var14 = 1;
        char[] var15 = var10.toCharArray();
        int var16 = var15.length;
        int var17 = 1;
        while (var17 < var16) {
            char var18 = var15[var17];
            var12.append((char)(var18 ^ var13[var14 % var13.length]));
            0;
            ++var14;
            ++var17;
            0;
            if (-1 < ((0x6A ^ 0x76) & ~(0x36 ^ 0x2A))) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        void var3_4;
        void var2_2;
        if ((Movement.shouldWalk( == 0) ? 1 : 0)) {
            return;
        }
        String[] stringArray = new String[0];
        stringArray[1] = lllIlIlIl[1];
        Item var19 = Inventory.getFirst((String[])stringArray);
        if var19 == null {
            System.out.println(lllIlIlIl[0]);
            String[] stringArray2 = new String[0];
            stringArray2[1] = lllIlIlIl[2];
            TileObject var20 = TileObjects.getNearest((String[])stringArray2);
            if var20 != null {
                var20.interact(lllIlIlIl[3]);
            }
            return;
        }
        NPC var20 = NPCs.getNearest(nPC -> {
            int n2;
            if ((nPC.getName( != 0).contains(lllIlIlIl[4]) ? 1 : 0) && (nPC.getPoseAnimation() == 5)) {
                n2 = 0;
                0;
                if ((0x57 ^ 0x53) <= 2) {
                    return ((0x6D ^ 0x37) & ~(0xFF ^ 0xA5)) != 0;
                }
            } else {
                n2 = 1;
            }
            return n2 != 0;
        });
        if var20 == null {
            return;
        }
        var2_2.useOn((Actor)var3_4);
    }

    protected void onStart() {
    }

    protected void onStop() {
    }
}

