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
import gg.squire.runecrafting.AHelper;
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
        Class[] classArray = new Class[lIllIIllIlIIl[0]];
        classArray[SquireZeahRunecrafter.lIllIIllIlIIl[1]] = InitializationTask.class;
        classArray[SquireZeahRunecrafter.lIllIIllIlIIl[2]] = MiningEssenceBlocksTask.class;
        classArray[SquireZeahRunecrafter.lIllIIllIlIIl[3]] = CreatingDarkEssenceTask.class;
        classArray[SquireZeahRunecrafter.lIllIIllIlIIl[4]] = BreakingEssenceBlocksTask.class;
        classArray[SquireZeahRunecrafter.lIllIIllIlIIl[5]] = CraftingBloodRunesTask.class;
        classArray[SquireZeahRunecrafter.lIllIIllIlIIl[6]] = ActivatingBloodEssenceTask.class;
        return classArray;
    }

    protected void onStart() {
        this.a(lIllIIllIlIIl[1]);
        this.d.c(lIllIIllIlIIl[7]);
        this.a.add((Overlay)this.c);

    }

    private static boolean llIIIllIlIllIIl(int n) {
        return n != 0;
    }

    protected void onStop() {
        this.a.remove((Overlay)this.c);

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
        SquireZeahRunecrafter.llIIIllIlIllIII();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        SquireZeahRunecrafter var1;
        void var2;
        if (SquireZeahRunecrafter.llIIIllIlIllIIl(inventoryChanged.getChangeType().equals((Object)InventoryChanged.ChangeType.ITEM_REMOVED) ? 1 : 0)) {
            if (SquireZeahRunecrafter.llIIIllIlIllIlI(inventoryChanged.getItemId(), lIllIIllIlIIl[8])) {
                this.d.c(lIllIIllIlIIl[1]);
            }
            if (SquireZeahRunecrafter.llIIIllIlIllIlI(var2.getItemId(), lIllIIllIlIIl[9])) {
                var1.d.c(var1.d.j() + lIllIIllIlIIl[5]);
            }
        }
        if (SquireZeahRunecrafter.llIIIllIlIllIIl(var2.getChangeType().equals((Object)InventoryChanged.ChangeType.ITEM_ADDED) ? 1 : 0) && SquireZeahRunecrafter.llIIIllIlIllIlI(var2.getItemId(), lIllIIllIlIIl[10])) {
            var1.a(var1.b() + var2.getAmount());
            var1.b(var1.c() + Prices.getItemPrice((int)var2.getItemId()) * var2.getAmount());
        }
    }

    private static boolean llIIIllIlIllIlI(int n, int n2) {
        return n == n2;
    }

    public void b(int n) {
        this.g = n;
    }

    @Subscribe
    public void a(ConfigChanged configChanged) {
    }
}

