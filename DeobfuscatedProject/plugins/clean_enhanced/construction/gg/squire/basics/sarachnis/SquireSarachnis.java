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
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.basics.sarachnis;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.sarachnis.SarachnisConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.sarachnis.AttackingTask;
import gg.squire.basics.sarachnis.DrinkingPrayerPotionTask;
import gg.squire.basics.sarachnis.EatingFoodTask;
import gg.squire.basics.sarachnis.FlickingTask;
import gg.squire.basics.sarachnis.TeleportingOutTask;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.TileItem;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.client.managers.interaction.InteractionManager;

@PluginDescriptor(name="Squire Sarachnis", description="Sarachnis Helper", enabledByDefault=false)
@SquireUtil
public class SquireSarachnis
extends SquirePlugin {
     List<aH> F;
    private static  int[] llIIlllII;
    @Inject
     SarachnisConfig gz;

    public SquireSarachnis() {
        this.F = new ArrayList<aH>();
    }

    protected void onStop() {
        InteractionManager.setHelper((boolean)llIIlllII[1]);
        this.F.clear();
    }

    @Subscribe
    private void a(ItemSpawned itemSpawned) {
        TileItem tileItem = itemSpawned.getItem();
        if (SquireSarachnis.var1(tileItem.canPickup() ? 1 : 0)) {
            return;
        }
        aH aH2 = new aH();
        String string = tileItem.getName();
        aH2.f(tileItem.getId());
        aH2.i(tileItem.getWorldLocation());
        this.p().add(aH2);
        0;
    }

    private static boolean var1(int n2) {
        return n2 == 0;
    }

    public List<aH> p() {
        return this.F;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIlllII[0]];
        classArray[SquireSarachnis.llIIlllII[1]] = FlickingTask.class;
        classArray[SquireSarachnis.llIIlllII[2]] = AttackingTask.class;
        classArray[SquireSarachnis.llIIlllII[3]] = EatingFoodTask.class;
        classArray[SquireSarachnis.llIIlllII[4]] = TeleportingOutTask.class;
        classArray[SquireSarachnis.llIIlllII[5]] = DrinkingPrayerPotionTask.class;
        return classArray;
    }

    static {
        SquireSarachnis.var2();
    }

    public void a(List<aH> list) {
        this.F = list;
    }

    protected void onStart() {
        InteractionManager.setHelper((boolean)llIIlllII[2]);
    }

    @Provides
    SarachnisConfig v(ConfigManager configManager) {
        return (SarachnisConfig)configManager.getConfig(SarachnisConfig.class);
    }

    private static void var2() {
        llIIlllII = new int[6];
        SquireSarachnis.llIIlllII[0] = 91 + 108 - 105 + 47 ^ 72 + 112 - 166 + 118;
        SquireSarachnis.llIIlllII[1] = (2 ^ 0x44) & ~(0x1F ^ 0x59);
        SquireSarachnis.llIIlllII[2] = 1;
        SquireSarachnis.llIIlllII[3] = 2;
        SquireSarachnis.llIIlllII[4] = 3;
        SquireSarachnis.llIIlllII[5] = 0x18 ^ 0x1C;
    }
}

