/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Item
 *  net.runelite.api.events.GameTick
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.basics.inventory;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.inventory.InventoryAsisstantConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import net.runelite.api.Item;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.managers.interaction.InteractionManager;

@SquireUtil
@PluginDescriptor(name="Squire Inventory Assistant", description="Assist with inventory", enabledByDefault=false)
public class InventoryAssistant
extends SquirePlugin {
    @Inject
     InventoryAsisstantConfig dK;
    private static  String[] lllIIlIlI;
     boolean dL;
    private static  int[] lllIIlIll;
    private final  Set<Item> dJ;

    @Provides
    InventoryAsisstantConfig k(ConfigManager configManager) {
        return (InventoryAsisstantConfig)configManager.getConfig(InventoryAsisstantConfig.class);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        InventoryAssistant var1;
        int var2;
        int n2;
        if (!(Inventory.isFull( == 0) ? 1 : 0) || (Inventory.getCount((int[])this.bO()) >= this.dK.amountToDrop())) {
            n2 = 1;
            0;
            if (-(0x62 ^ 0x66) > 0) {
                return;
            }
        } else {
            n2 = var2 = 0;
        }
        if ((var1.dL == 0) && var2) {
            var1.dJ.clear();
            var1.dL = 1;
            0;
            if (-(0x7E ^ 0x7B) >= 0) {
                return;
            }
        } else if ((var1.dL != 0) && (Inventory.contains((int[] == 0)var1.bO()) ? 1 : 0)) {
            var1.dL = 0;
        }
        if (var1.dL == 0) {
            return;
        }
        int var3 = 2;
        Iterator var4 = Inventory.getAll((int[])var1.bO()).iterator();
        while ((var4.hasNext( != 0) ? 1 : 0)) {
            Item var5 = (Item)var4.next();
            if ((var1.dJ.containslIlIllIIIIIlIlI)) {
                0;
                
                return;
            }
            var5.interact(lllIIlIlI[1]);
            var1.dJ.add(var5);
            0;
            if (var3-- == 0) {
                0;
                if null == null break;
                return;
            }
            0;
            if (2 < (10 + 80 - 57 + 126 ^ 113 + 75 - 54 + 21)) continue;
            return;
        }
    }

    protected Class<?>[] tasks() {
        return new Class[0];
    }

    protected void onStop() {
        InteractionManager.setHelper((boolean)0);
    }

    public void c(boolean bl2) {
        this.dL = bl2;
    }

    private static String var6(String var7, String var8) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var9 = new StringBuilder();
        char[] var10 = var8.toCharArray();
        int var11 = 0;
        char[] var12 = var7.toCharArray();
        int var13 = var12.length;
        int var14 = 0;
        while (var14 < var13) {
            char var15 = var12[var14];
            var9.append((char)(var15 ^ var10[var11 % var10.length]));
            0;
            ++var11;
            ++var14;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var9);
    }

    /*
     * WARNING - void declaration
     */
    public int[] bO() {
        void var16;
        String[] stringArray = this.dK.itemsToDrop().split(lllIIlIlI[0]);
        int[] nArray = new int[stringArray.length];
        int var17 = 0;
        while ((var17 < ((void)var16).length)) {
            var18[var17] = Integer.parseInt(var16[var17].trim());
            ++var17;
            0;
            if (3 >= ((0xA2 ^ 0x83) & ~(0x43 ^ 0x62))) continue;
            return null;
        }
        return nArray;
    }

    protected void onStart() {
        InteractionManager.setHelper((boolean)1);
        this.dL = 0;
    }

    public boolean bP() {
        return this.dL;
    }

    public InventoryAssistant() {
        this.dJ = new HashSet<Item>();
    }
}

