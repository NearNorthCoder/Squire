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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.KillingMinionsTask;
import gg.squire.zammy.PlacingCannonBaseTask;
import gg.squire.zammy.DrinkingRangePotionTask;
import gg.squire.zammy.MovingToStartingTileTask;
import gg.squire.zammy.GettingKillcountTask;
import gg.squire.zammy.KHelper;
import gg.squire.zammy.LHelper;
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

    private static boolean llIIIlIlIIlIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIlIlIIlIIIl(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var1);
    }

    @Provides
    SquireZammyConfig a(ConfigManager configManager) {
        return (SquireZammyConfig)configManager.getConfig(SquireZammyConfig.class);
    }

    @Subscribe
    public void a(ConfigButtonClicked configButtonClicked) {
        if (SquireZammy.llIIIlIlIIlIIIl(configButtonClicked.getGroup().equals(lIllIIIlIlllI[lIllIIIllIIII[1]]) ? 1 : 0)) {
            return;
        }
        String string = configButtonClicked.getKey();
        String string2 = string.replace(lIllIIIlIlllI[lIllIIIllIIII[2]], lIllIIIlIlllI[lIllIIIllIIII[3]]);
        String string3 = Equipment.getAll().stream().map(item -> item.getId() + ",").collect(Collectors.joining());
        this.f.setConfiguration(configButtonClicked.getGroup(), string2, string3);
    }

    protected void onStop() {
        this.c.unregister((Object)this.d);
        this.c.unregister((Object)this.e);
        this.a.remove((Overlay)this.b);

    }

    protected void onStart() {
        this.c.register((Object)this.d);
        this.c.register((Object)this.e);
        this.a.add((Overlay)this.b);

    }

    static {
        SquireZammy.llIIIlIlIIlIIII();
        SquireZammy.llIIIlIlIIIlIIl();
    }

    private static void llIIIlIlIIIlIIl() {
        lIllIIIlIlllI = new String[lIllIIIllIIII[4]];
        SquireZammy.lIllIIIlIlllI[SquireZammy.lIllIIIllIIII[1]] = "squirezammy";
        SquireZammy.lIllIIIlIlllI[SquireZammy.lIllIIIllIIII[2]] = ".copy";
        SquireZammy.lIllIIIlIlllI[SquireZammy.lIllIIIllIIII[3]] = SquireZammy.llIIIlIlIIIlIII("0+MPLRmxb1Y=", "Hksjk");
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIllIIIllIIII[0]];
        classArray[SquireZammy.lIllIIIllIIII[1]] = PlacingCannonBaseTask.class;
        classArray[SquireZammy.lIllIIIllIIII[2]] = AttackingZamorakTask.class;
        classArray[SquireZammy.lIllIIIllIIII[3]] = MovingToNextTileTask.class;
        classArray[SquireZammy.lIllIIIllIIII[4]] = FlickingPrayersTask.class;
        classArray[SquireZammy.lIllIIIllIIII[5]] = DrinkingStaminaDoseTask.class;
        classArray[SquireZammy.lIllIIIllIIII[6]] = LootingItemsTask.class;
        classArray[SquireZammy.lIllIIIllIIII[7]] = MovingToStartingTileTask.class;
        classArray[SquireZammy.lIllIIIllIIII[8]] = DrinkingRangePotionTask.class;
        classArray[SquireZammy.lIllIIIllIIII[9]] = TeleportingOutTask.class;
        classArray[SquireZammy.lIllIIIllIIII[10]] = EatingFoodTask.class;
        classArray[SquireZammy.lIllIIIllIIII[11]] = KillingMinionsTask.class;
        classArray[SquireZammy.lIllIIIllIIII[12]] = GettingKillcountTask.class;
        classArray[SquireZammy.lIllIIIllIIII[13]] = DrinkingPoisonCureTask.class;
        classArray[SquireZammy.lIllIIIllIIII[14]] = EquippingMageGearTask.class;
        classArray[SquireZammy.lIllIIIllIIII[15]] = BloodBarraginRestTask.class;
        classArray[SquireZammy.lIllIIIllIIII[16]] = EquippingRangedGearTask.class;
        classArray[SquireZammy.lIllIIIllIIII[17]] = KillingLastMinionWithRangedTask.class;
        classArray[SquireZammy.lIllIIIllIIII[18]] = RecoveringFromGettingStuckOnATileTask.class;
        return classArray;
    }
}

