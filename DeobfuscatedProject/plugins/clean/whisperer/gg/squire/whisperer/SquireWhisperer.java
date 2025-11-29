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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean llIIIIIlIlllIlI(int n2) {
        return n2 != 0;
    }

    protected void onStart() {
        this.b.add((Overlay)this.c);

        this.d.e();
        this.f.a(lIlIllIllIIII[0]);
        this.g = lIlIllIllIIII[0];
        this.e.register((Object)this.d);
    }

    public SquireWhisperer() {
        this.g = lIlIllIllIIII[0];
    }

    static {
        SquireWhisperer.llIIIIIlIlllIIl();
        SquireWhisperer.llIIIIIlIllIlIl();
    }

    protected void onStop() {
        this.b.remove((Overlay)this.c);

        this.e.unregister((Object)this.d);
    }

    public int a() {
        return this.a;
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
        void var1;
        if (SquireWhisperer.llIIIIIlIlllIlI(chatMessage.getMessage().contains(lIlIllIlIllII[lIlIllIllIIII[0]]) ? 1 : 0)) {
            this.a += lIlIllIllIIII[2];
        }
        if (SquireWhisperer.llIIIIIlIlllIlI(var1.getMessage().contains(lIlIllIlIllII[lIlIllIllIIII[2]]) ? 1 : 0)) {
            SquireWhisperer var2;
            var2.g = lIlIllIllIIII[2];
            Log.info((String)lIlIllIlIllII[lIlIllIllIIII[3]]);
            var2.forceStop();
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIllIllIIII[1]];
        classArray[SquireWhisperer.lIlIllIllIIII[0]] = WithdrawingItemsTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[2]] = WalkingToTheBankTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[3]] = DrinkingStaminaPotionTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[4]] = WalkingToBossTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[5]] = EatingFoodTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[6]] = DisturbingOddFigureTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[7]] = DodgingTentaclesTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[8]] = HandlingPrayersTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[9]] = AttackingWhispererTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[10]] = MovingOutOfMeleeRangeTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[11]] = UsingImbuedHeartTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[12]] = RestoringPrayerTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[13]] = DroppingEmptyVialsTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[14]] = TakingLootTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[15]] = DrinkingBrewsTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[16]] = EnteringRealmTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[17]] = TeleportingOutTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[18]] = RechargingTridentTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[19]] = WalkingOnGreenOrbsTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[20]] = KillingSetOfGhostsTask.class;
        classArray[SquireWhisperer.lIlIllIllIIII[21]] = HidingBehindPillarTask.class;
        return classArray;
    }

    private static void llIIIIIlIllIlIl() {
        lIlIllIlIllII = new String[lIlIllIllIIII[4]];
        SquireWhisperer.lIlIllIlIllII[SquireWhisperer.lIlIllIllIIII[0]] = "Your Whisperer kill";
        SquireWhisperer.lIlIllIlIllII[SquireWhisperer.lIlIllIllIIII[2]] = "Oh dear, you are dead";
        SquireWhisperer.lIlIllIlIllII[SquireWhisperer.lIlIllIllIIII[3]] = "Died and no death handler just yet, so just stopping for now";
    }

}

