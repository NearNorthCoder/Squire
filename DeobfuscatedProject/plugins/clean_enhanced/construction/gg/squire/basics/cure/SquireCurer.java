/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Item
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.basics.cure;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import net.runelite.api.Item;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;

@SquireUtil
@PluginDescriptor(name="Squire Cure", description="Cures Poison", enabledByDefault=false)
public class SquireCurer
extends SquirePlugin {
    private static  String[] lIllIIlIl;
    private static  int[] lIllIIllI;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        void var2_2;
        if (SquireCurer.var1(Combat.isPoisoned() ? 1 : 0)) {
            return;
        }
        Item var2 = Inventory.getFirst(item -> {
            int n2;
            if (!SquireCurer.var1(item.getName().contains(lIllIIlIl[lIllIIllI[1]]) ? 1 : 0) || SquireCurer.var3(item.getName().contains(lIllIIlIl[lIllIIllI[2]]) ? 1 : 0)) {
                n2 = lIllIIllI[1];
                0;
                if (-1 >= 0) {
                    return ((0xD ^ 0x24 ^ (0x19 ^ 0x39)) & (0x9A ^ 0xAF ^ (0x50 ^ 0x6C) ^ -1)) != 0;
                }
            } else {
                n2 = lIllIIllI[0];
            }
            return n2 != 0;
        });
        if (SquireCurer.var4(var2)) {
            return;
        }
        var2_2.interact(lIllIIlIl[lIllIIllI[0]]);
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = lIllIIllI[0];
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = lIllIIllI[0];
        while (SquireCurer.var14(var13, var12)) {
            char var15 = var11[var13];
            var8.append((char)(var15 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var8);
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    private static void var22() {
        lIllIIlIl = new String[lIllIIllI[3]];
        SquireCurer.lIllIIlIl[SquireCurer.lIllIIllI[0]] = "Drink";
        SquireCurer.lIllIIlIl[SquireCurer.lIllIIllI[1]] = "antipoison";
        SquireCurer.lIllIIlIl[SquireCurer.lIllIIllI[2]] = "ntidote";
    }

    private static boolean var4(Object object) {
        return object == null;
    }

    private static boolean var1(int n2) {
        return n2 == 0;
    }

    protected void onStop() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIllIIllI[0]];
    }

        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    private static void var29() {
        lIllIIllI = new int[5];
        SquireCurer.lIllIIllI[0] = 3 & (3 ^ -1);
        SquireCurer.lIllIIllI[1] = 1;
        SquireCurer.lIllIIllI[2] = 2;
        SquireCurer.lIllIIllI[3] = 3;
        SquireCurer.lIllIIllI[4] = 0x98 ^ 0x90;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    static {
        SquireCurer.var29();
        SquireCurer.var22();
    }

    protected void onStart() {
    }

    private static boolean var3(int n2) {
        return n2 != 0;
    }
}

