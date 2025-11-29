/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.TileItem
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.basics.dagannothkings;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.dagannothkings.DagannothKingConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.dagannothkings.ConstructionManager;
import gg.squire.basics.dagannothkings.ConstructionManager;
import gg.squire.basics.dagannothkings.DrinkingPrayerPotionTask;
import gg.squire.basics.dagannothkings.EatingFoodTask;
import gg.squire.basics.dagannothkings.FlickingTask;
import gg.squire.basics.dagannothkings.TeleportingOutTask;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionManager;

@PluginDescriptor(name="Squire Dagannoth Kings", description="DK Helper", enabledByDefault=false)
@SquireUtil
public class SquireDagannothKings
extends SquirePlugin {
    private static  int[] lIlIllI;
    private static  String[] lIlIlIl;
    @Inject
    private  EventBus K;
     List<aH> F;
    @Inject
    private  ae cv;
    @Inject
    private  ad cu;
    @Inject
     DagannothKingConfig ct;

    @Provides
    DagannothKingConfig h(ConfigManager configManager) {
        return (DagannothKingConfig)configManager.getConfig(DagannothKingConfig.class);
    }

    protected void onStop() {
        InteractionManager.setHelper((boolean)lIlIllI[1]);
        this.F.clear();
        this.K.unregister((Object)this.cu);
        this.K.unregister((Object)this.cv);
    }

    public void a(List<aH> list) {
        this.F = list;
    }

    public List<aH> p() {
        return this.F;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ItemSpawned itemSpawned) {
        void var3_3;
        void var1;
        TileItem tileItem = itemSpawned.getItem();
        if (SquireDagannothKings.lIlIllIll(tileItem.canPickup() ? 1 : 0)) {
            return;
        }
        aH var2 = new aH();
        String var3 = var1.getName();
        var2.f(var1.getId());
        var2.i(var1.getWorldLocation());
        if (SquireDagannothKings.lIlIlllII(var3.contains(lIlIlIl[lIlIllI[1]]) ? 1 : 0)) {
            return;
        }
        this.F.add((aH)var3_3);
        0;
        System.out.println("Adding " + Static.getClient().getItemDefinition(var3_3.P()).getName() + " to items to loot");
    }

    private static boolean lIlIllIll(int n2) {
        return n2 == 0;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIlllII(int n2) {
        return n2 != 0;
    }

    private static void lIlIllIlI() {
        lIlIllI = new int[6];
        SquireDagannothKings.lIlIllI[0] = 0x41 ^ 0x45;
        SquireDagannothKings.lIlIllI[1] = (0x35 ^ 0x20) & ~(0x88 ^ 0x9D);
        SquireDagannothKings.lIlIllI[2] = 1;
        SquireDagannothKings.lIlIllI[3] = 2;
        SquireDagannothKings.lIlIllI[4] = 3;
        SquireDagannothKings.lIlIllI[5] = 0xAC ^ 0xA4;
    }

    private static void lIlIllIIl() {
        lIlIlIl = new String[lIlIllI[2]];
        SquireDagannothKings.lIlIlIl[SquireDagannothKings.lIlIllI[1]] = "page";
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIllI[0]];
        classArray[SquireDagannothKings.lIlIllI[1]] = FlickingTask.class;
        classArray[SquireDagannothKings.lIlIllI[2]] = EatingFoodTask.class;
        classArray[SquireDagannothKings.lIlIllI[3]] = TeleportingOutTask.class;
        classArray[SquireDagannothKings.lIlIllI[4]] = DrinkingPrayerPotionTask.class;
        return classArray;
    }

    public SquireDagannothKings() {
        this.F = new ArrayList<aH>();
    }

    protected void onStart() {
        InteractionManager.setHelper((boolean)lIlIllI[2]);
        this.K.register((Object)this.cu);
        this.K.register((Object)this.cv);
    }
}

