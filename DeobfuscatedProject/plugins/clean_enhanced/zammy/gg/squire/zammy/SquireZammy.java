/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.events.ConfigButtonClicked
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.items.Equipment
 */
package gg.squire.zammy;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.zammy.SquireZammyConfig;
import gg.squire.zammy.overlay.ZammyInfoBox;
import java.util.stream.Collectors;
import gg.squire.zammy.KillingMinionsTask;
import gg.squire.zammy.PlacingCannonBaseTask;
import gg.squire.zammy.DrinkingRangePotionTask;
import gg.squire.zammy.MovingToStartingTileTask;
import gg.squire.zammy.GettingKillcountTask;
import gg.squire.zammy.ZammyManager;
import gg.squire.zammy.ZammyManager;
import gg.squire.zammy.TeleportingOutTask;
import gg.squire.zammy.AttackingZamorakTask;
import gg.squire.zammy.DrinkingPoisonCureTask;
import gg.squire.zammy.DrinkingStaminaDoseTask;
import gg.squire.zammy.EatingFoodTask;
import gg.squire.zammy.FlickingPrayersTask;
import gg.squire.zammy.RecoveringFromGettingStuckOnATileTask;
import gg.squire.zammy.MovingToNextTileTask;
import gg.squire.zammy.LootingItemsTask;
import gg.squire.zammy.BloodBarraginRestTask;
import gg.squire.zammy.EquippingMageGearTask;
import gg.squire.zammy.EquippingRangedGearTask;
import gg.squire.zammy.KillingLastMinionWithRangedTask;
import net.runelite.api.events.ConfigButtonClicked;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.items.Equipment;

@PluginDescriptor(name="Squire Zammy", enabledByDefault=false)
public class SquireZammy
extends SquirePlugin {
    @Inject
    private  l d;
    @Inject
    private  k e;
    
    @Inject
    private  EventBus c;
    @Inject
    private  ZammyInfoBox b;
    
    @Inject
    private  OverlayManager a;
    @Inject
    private  ConfigManager f;

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
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    @Provides
    SquireZammyConfig a(ConfigManager configManager) {
        return (SquireZammyConfig)configManager.getConfig(SquireZammyConfig.class);
    }

    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        if ((configButtonClicked.getGroup( == 0).equals(var2[1]) ? 1 : 0)) {
            return;
        }
        String string = configButtonClicked.getKey();
        String string2 = string.replace(var2[2], var2[3]);
        String string3 = Equipment.getAll().stream().map(item -> item.getId() + ",").collect(Collectors.joining());
        this.f.setConfiguration(configButtonClicked.getGroup(), string2, string3);
    }

    protected void onStop() {
        this.c.unregister((Object)this.d);
        this.c.unregister((Object)this.e);
        this.a.remove((Overlay)this.b);
        0;
    }

    protected void onStart() {
        this.c.register((Object)this.d);
        this.c.register((Object)this.e);
        this.a.add((Overlay)this.b);
        0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[0];
        classArray[1] = PlacingCannonBaseTask.class;
        classArray[2] = AttackingZamorakTask.class;
        classArray[3] = MovingToNextTileTask.class;
        classArray[4] = FlickingPrayersTask.class;
        classArray[5] = DrinkingStaminaDoseTask.class;
        classArray[6] = LootingItemsTask.class;
        classArray[7] = MovingToStartingTileTask.class;
        classArray[8] = DrinkingRangePotionTask.class;
        classArray[9] = TeleportingOutTask.class;
        classArray[SquireZammy.var1[10]] = EatingFoodTask.class;
        classArray[SquireZammy.var1[11]] = KillingMinionsTask.class;
        classArray[SquireZammy.var1[12]] = GettingKillcountTask.class;
        classArray[SquireZammy.var1[13]] = DrinkingPoisonCureTask.class;
        classArray[SquireZammy.var1[14]] = EquippingMageGearTask.class;
        classArray[SquireZammy.var1[15]] = BloodBarraginRestTask.class;
        classArray[SquireZammy.var1[16]] = EquippingRangedGearTask.class;
        classArray[SquireZammy.var1[17]] = KillingLastMinionWithRangedTask.class;
        classArray[SquireZammy.var1[18]] = RecoveringFromGettingStuckOnATileTask.class;
        return classArray;
    }
}

