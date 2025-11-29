/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Item
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.ItemDespawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.leagues.pickupnoter;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemDespawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.items.Inventory;

@PluginDescriptor(name="[Leagues] Pick Up Noter", enabledByDefault=false)
@SquireUtil
public class PickupNoterPlugin
extends SquirePlugin {
    private static /* synthetic */ int[] l;
    private final /* synthetic */ List<Integer> v;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        PickupNoterPlugin llllllllllllIll;
        int n = l[1];
        if (PickupNoterPlugin.l(this.v.isEmpty() ? 1 : 0)) {
            return;
        }
        Iterator llllllllllllIIl = Inventory.getAll(item -> this.v.contains(item.getId())).iterator();
        while (PickupNoterPlugin.l(llllllllllllIIl.hasNext() ? 1 : 0)) {
            void llllllllllllIlI;
            Item llllllllllllIII = (Item)llllllllllllIIl.next();
            Inventory.use((int)llllllllllllIII.getId(), (int)llllllllllllIlI);
            "".length();
            "".length();
            if (-"  ".length() <= 0) continue;
            return;
        }
        this.v.clear();
    }

    private static void I() {
        l = new int[2];
        PickupNoterPlugin.l[0] = (0xFA ^ 0xBA) & ~(0x4A ^ 0xA);
        PickupNoterPlugin.l[1] = 0xFFFFFB5F & 0x74FF;
    }

    protected void onStart() {
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        int n = itemDespawned.getItem().getId();
        this.v.add(n);
        "".length();
    }

    private static boolean l(int n) {
        return n != 0;
    }

    public PickupNoterPlugin() {
        this.v = new ArrayList<Integer>();
    }

    protected Class<?>[] tasks() {
        return new Class[l[0]];
    }

    static {
        PickupNoterPlugin.I();
    }

    protected void onStop() {
    }
}

