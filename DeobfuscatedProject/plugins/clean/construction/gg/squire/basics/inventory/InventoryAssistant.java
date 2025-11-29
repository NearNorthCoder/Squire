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
import java.nio.charset.StandardCharsets;
import java.util.Base64;
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
    
     boolean dL;
    
    private final  Set<Item> dJ;

    @Provides
    InventoryAsisstantConfig k(ConfigManager configManager) {
        return (InventoryAsisstantConfig)configManager.getConfig(InventoryAsisstantConfig.class);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        InventoryAssistant lIlIllIIIIIlllI;
        int lIlIllIIIIIllIl;
        int n2;
        if (!InventoryAssistant.llIIIlIIIll(Inventory.isFull() ? 1 : 0) || InventoryAssistant.llIIIlIIlII(Inventory.getCount((int[])this.bO()), this.dK.amountToDrop())) {
            n2 = lllIIlIll[1];

            if (-(0x62 ^ 0x66) > 0) {
                return;
            }
        } else {
            n2 = lIlIllIIIIIllIl = lllIIlIll[0];
        }
        if (InventoryAssistant.llIIIlIIIll(lIlIllIIIIIlllI.dL ? 1 : 0) && InventoryAssistant.llIIIlIIlIl(lIlIllIIIIIllIl)) {
            lIlIllIIIIIlllI.dJ.clear();
            lIlIllIIIIIlllI.dL = lllIIlIll[1];

            if (-(0x7E ^ 0x7B) >= 0) {
                return;
            }
        } else if (InventoryAssistant.llIIIlIIlIl(lIlIllIIIIIlllI.dL ? 1 : 0) && InventoryAssistant.llIIIlIIIll(Inventory.contains((int[])lIlIllIIIIIlllI.bO()) ? 1 : 0)) {
            lIlIllIIIIIlllI.dL = lllIIlIll[0];
        }
        if (InventoryAssistant.llIIIlIIIll(lIlIllIIIIIlllI.dL ? 1 : 0)) {
            return;
        }
        int lIlIllIIIIIllII = lllIIlIll[2];
        Iterator lIlIllIIIIIlIll = Inventory.getAll((int[])lIlIllIIIIIlllI.bO()).iterator();
        while (InventoryAssistant.llIIIlIIlIl(lIlIllIIIIIlIll.hasNext() ? 1 : 0)) {
            Item lIlIllIIIIIlIlI = (Item)lIlIllIIIIIlIll.next();
            if (InventoryAssistant.llIIIlIIlIl(lIlIllIIIIIlllI.dJ.contains(lIlIllIIIIIlIlI) ? 1 : 0)) {

                if (2 >= 0) continue;
                return;
            }
            lIlIllIIIIIlIlI.interact(lllIIlIlI[lllIIlIll[1]]);
            lIlIllIIIIIlllI.dJ.add(lIlIllIIIIIlIlI);

            if (InventoryAssistant.llIIIlIIIll(lIlIllIIIIIllII--)) {

                if (null == null) break;
                return;
            }

            if (2 < (10 + 80 - 57 + 126 ^ 113 + 75 - 54 + 21)) continue;
            return;
        }
    }

    private static boolean llIIIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIlIIIII() {
        lllIIlIlI = new String[lllIIlIll[3]];
        InventoryAssistant.lllIIlIlI[InventoryAssistant.lllIIlIll[0]] = ",";
        InventoryAssistant.lllIIlIlI[InventoryAssistant.lllIIlIll[1]] = "Drop";
    }

    protected Class<?>[] tasks() {
        return new Class[lllIIlIll[0]];
    }

    static {
        InventoryAssistant.llIIIlIIIIl();
        InventoryAssistant.llIIIlIIIII();
    }

    protected void onStop() {
        InteractionManager.setHelper((boolean)lllIIlIll[0]);
    }

    private static boolean llIIIlIIIll(int n2) {
        return n2 == 0;
    }

    public void c(boolean bl2) {
        this.dL = bl2;
    }

        return String.valueOf(lIlIlIlllllllIl);
    }

    /*
     * WARNING - void declaration
     */
    public int[] bO() {
        void lIlIllIIIIlIllI;
        String[] stringArray = this.dK.itemsToDrop().split(lllIIlIlI[lllIIlIll[0]]);
        int[] nArray = new int[stringArray.length];
        int lIlIllIIIIlIlII = lllIIlIll[0];
        while (InventoryAssistant.llIIIlIIIlI(lIlIllIIIIlIlII, ((void)lIlIllIIIIlIllI).length)) {
            lIlIllIIIIlIlIl[lIlIllIIIIlIlII] = Integer.parseInt(lIlIllIIIIlIllI[lIlIllIIIIlIlII].trim());
            ++lIlIllIIIIlIlII;

            if (3 >= ((0xA2 ^ 0x83) & ~(0x43 ^ 0x62))) continue;
            return null;
        }
        return nArray;
    }

    protected void onStart() {
        InteractionManager.setHelper((boolean)lllIIlIll[1]);
        this.dL = lllIIlIll[0];
    }

    private static boolean llIIIlIIlII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIlIIlIl(int n2) {
        return n2 != 0;
    }

    public boolean bP() {
        return this.dL;
    }

    public InventoryAssistant() {
        this.dJ = new HashSet<Item>();
    }
}

