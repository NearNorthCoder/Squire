/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 *  net.unethicalite.api.game.Prices
 */
package gg.squire.runecrafting;

import com.google.inject.Inject;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.runecrafting.overlay.RunecrafterInfoBox;
import gg.squire.runecrafting.RunecraftingManager;
import gg.squire.runecrafting.ActivatingBloodEssenceTask;
import gg.squire.runecrafting.BreakingEssenceBlocksTask;
import gg.squire.runecrafting.CraftingBloodRunesTask;
import gg.squire.runecrafting.CreatingDarkEssenceTask;
import gg.squire.runecrafting.InitializationTask;
import gg.squire.runecrafting.MiningEssenceBlocksTask;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.game.Prices;

@PluginDescriptor(name="Squire Zeah Runecrafter", enabledByDefault=false)
public class SquireZeahRunecrafter
extends SquirePlugin {
    private  int g;
    @Inject
    private  EventBus b;
    @Inject
    private  a d;
    @Inject
    private  RunecrafterInfoBox c;
    private  int f;
    private  boolean e;
    @Inject
    private  OverlayManager a;

    public int b() {
        return this.f;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[0];
        classArray[1] = InitializationTask.class;
        classArray[2] = MiningEssenceBlocksTask.class;
        classArray[3] = CreatingDarkEssenceTask.class;
        classArray[4] = BreakingEssenceBlocksTask.class;
        classArray[5] = CraftingBloodRunesTask.class;
        classArray[6] = ActivatingBloodEssenceTask.class;
        return classArray;
    }

    protected void onStart() {
        this.a(1);
        this.d.c(7);
        this.a.add((Overlay)this.c);
        0;
    }

    protected void onStop() {
        this.a.remove((Overlay)this.c);
        0;
    }

    public boolean a() {
        return this.e;
    }

    public int c() {
        return this.g;
    }

    public void a(int n) {
        this.f = n;
    }

    public void a(boolean bl) {
        this.e = bl;
    }

    static {
        SquireZeahRunecrafter.var2();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        SquireZeahRunecrafter var3;
        void var4;
        if ((inventoryChanged.getChangeType( != 0).equals((Object)InventoryChanged.ChangeType.ITEM_REMOVED) ? 1 : 0)) {
            if ((inventoryChanged.getItemId() == inventoryChanged.getItemId()2)) {
                this.d.c(1);
            }
            if ((var4.getItemId() == var4.getItemId()2)) {
                var3.d.c(var3.d.j() + 5);
            }
        }
        if ((var4.getChangeType( != 0).equals((Object)InventoryChanged.ChangeType.ITEM_ADDED) ? 1 : 0) && (var4.getItemId() == var4.getItemId()2)) {
            var3.a(var3.b() + var4.getAmount());
            var3.b(var3.c() + Prices.getItemPrice((int)var4.getItemId()) * var4.getAmount());
        }
    }

    public void b(int n) {
        this.g = n;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
    }
}

