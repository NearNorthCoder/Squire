/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  gg.squire.client.util.Log
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.whisperer;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.whisperer.config.SquireWhispererConfig;
import gg.squire.whisperer.overlay.WhispererInfoBox;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import gg.squire.whisperer.UsingImbuedHeartTask;
import gg.squire.whisperer.EnteringRealmTask;
import gg.squire.whisperer.WalkingOnGreenOrbsTask;
import gg.squire.whisperer.KillingSetOfGhostsTask;
import gg.squire.whisperer.HidingBehindPillarTask;
import gg.squire.whisperer.WhispererManager;
import gg.squire.whisperer.WhispererManager;
import gg.squire.whisperer.DrinkingStaminaPotionTask;
import gg.squire.whisperer.RechargingTridentTask;
import gg.squire.whisperer.WalkingToTheBankTask;
import gg.squire.whisperer.WalkingToBossTask;
import gg.squire.whisperer.WithdrawingItemsTask;
import gg.squire.whisperer.AttackingWhispererTask;
import gg.squire.whisperer.DisturbingOddFigureTask;
import gg.squire.whisperer.DodgingTentaclesTask;
import gg.squire.whisperer.HandlingPrayersTask;
import gg.squire.whisperer.MovingOutOfMeleeRangeTask;
import gg.squire.whisperer.TakingLootTask;
import gg.squire.whisperer.TeleportingOutTask;
import gg.squire.whisperer.DrinkingBrewsTask;
import gg.squire.whisperer.DroppingEmptyVialsTask;
import gg.squire.whisperer.EatingFoodTask;
import gg.squire.whisperer.RestoringPrayerTask;

@SquireUtil
@PluginDescriptor(name="Squire Whisperer", enabledByDefault=false)
public class SquireWhisperer
extends SquirePlugin {
    @Inject
    private  OverlayManager b;
    @Inject
    private  EventBus e;
    @Inject
    private  WhispererInfoBox c;

    @Inject
    private  a f;
    private  int a;
    @Inject
    private  d d;
    private  boolean g;

    protected void onStart() {
        this.b.add((Overlay)this.c);
        0;
        this.d.e();
        this.f.a(0);
        this.g = 0;
        this.e.register((Object)this.d);
    }

    public SquireWhisperer() {
        this.g = 0;
    }

    protected void onStop() {
        this.b.remove((Overlay)this.c);
        0;
        this.e.unregister((Object)this.d);
    }

    public int a() {
        return this.a;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Provides
    SquireWhispererConfig a(ConfigManager configManager) {
        return (SquireWhispererConfig)configManager.getConfig(SquireWhispererConfig.class);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var9;
        if ((chatMessage.getMessage( != 0).contains(var2[0]) ? 1 : 0)) {
            this.a += 2;
        }
        if ((var9.getMessage( != 0).contains(var2[2]) ? 1 : 0)) {
            SquireWhisperer var10;
            var10.g = 2;
            Log.info((String)var2[3]);
            var10.forceStop();
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[1];
        classArray[0] = WithdrawingItemsTask.class;
        classArray[2] = WalkingToTheBankTask.class;
        classArray[3] = DrinkingStaminaPotionTask.class;
        classArray[4] = WalkingToBossTask.class;
        classArray[5] = EatingFoodTask.class;
        classArray[6] = DisturbingOddFigureTask.class;
        classArray[7] = DodgingTentaclesTask.class;
        classArray[8] = HandlingPrayersTask.class;
        classArray[9] = AttackingWhispererTask.class;
        classArray[SquireWhisperer.var1[10]] = MovingOutOfMeleeRangeTask.class;
        classArray[SquireWhisperer.var1[11]] = UsingImbuedHeartTask.class;
        classArray[SquireWhisperer.var1[12]] = RestoringPrayerTask.class;
        classArray[SquireWhisperer.var1[13]] = DroppingEmptyVialsTask.class;
        classArray[SquireWhisperer.var1[14]] = TakingLootTask.class;
        classArray[SquireWhisperer.var1[15]] = DrinkingBrewsTask.class;
        classArray[SquireWhisperer.var1[16]] = EnteringRealmTask.class;
        classArray[SquireWhisperer.var1[17]] = TeleportingOutTask.class;
        classArray[SquireWhisperer.var1[18]] = RechargingTridentTask.class;
        classArray[SquireWhisperer.var1[19]] = WalkingOnGreenOrbsTask.class;
        classArray[SquireWhisperer.var1[20]] = KillingSetOfGhostsTask.class;
        classArray[SquireWhisperer.var1[21]] = HidingBehindPillarTask.class;
        return classArray;
    }

        catch (Exception var16) {
            var16.printStackTrace();
            return null;
        }
    }
}

