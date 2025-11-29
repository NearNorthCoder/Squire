/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.hydra;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.overlay.HydraOverlayPanel;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import gg.squire.hydra.LootingItemsTask;
import gg.squire.hydra.WalkingBackToStartTask;
import gg.squire.hydra.TeleportOutTask;
import gg.squire.hydra.AHelper;
import gg.squire.hydra.EHelper;
import gg.squire.hydra.HydraManager;
import gg.squire.hydra.EnteringHydraRoomTask;
import gg.squire.hydra.CuringPoisonTask;
import gg.squire.hydra.RestoringPrayerTask;
import gg.squire.hydra.DrinkingRangePotionTask;
import gg.squire.hydra.EatingTask;
import gg.squire.hydra.AttackingHydraTask;
import gg.squire.hydra.UsingBlowpipeSpecTask;
import gg.squire.hydra.FireSkipTask;
import gg.squire.hydra.DodgingLightningTask;
import gg.squire.hydra.MovingTowardsTheNextTileTask;
import gg.squire.hydra.HandlingHydraPrayersTask;
import gg.squire.hydra.AlchingItemsTask;
import gg.squire.hydra.BuryingBonesTask;

@SquireUtil
@PluginDescriptor(name="Squire Hydra", description="Does stuff for the Alchemical Hydra", enabledByDefault=false, tags={"boss", "alchemical", "hydra", "prayer"})
public class SquireAlchemicalHydraPlugin
extends SquirePlugin {
    @Inject
    private  a a;
    @Inject
    private  SquireAlchemicalHydraConfig d;
    @Inject
    private  HydraOverlayPanel g;
    
    @Inject
    private  m f;
    private  boolean h;
    @Inject
    private  e b;
    @Inject
    private  OverlayManager e;
    @Inject
    private  EventBus c;

    private static boolean lIIlIIIIIllIlII(Object object, Object object2) {
        return object != object2;
    }

    public a a() {
        return this.a;
    }

    protected void onStop() {
        this.e.remove((Overlay)this.f);

        this.e.remove((Overlay)this.g);

        this.c.unregister((Object)this.a);
        this.c.unregister((Object)this.b);
    }

    private static void lIIlIIIIIllIIlI() {
        llllIlIIIIII = new String[llllIlIIIIIl[2]];
        SquireAlchemicalHydraPlugin.llllIlIIIIII[SquireAlchemicalHydraPlugin.llllIlIIIIIl[1]] = "completed your task";
    }

    @Provides
    SquireAlchemicalHydraConfig a(ConfigManager configManager) {
        return (SquireAlchemicalHydraConfig)configManager.getConfig(SquireAlchemicalHydraConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llllIlIIIIIl[0]];
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[1]] = HandlingHydraPrayersTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[2]] = MovingTowardsTheNextTileTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[3]] = AttackingHydraTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[4]] = EnteringHydraRoomTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[5]] = FireSkipTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[6]] = DodgingLightningTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[7]] = UsingBlowpipeSpecTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[8]] = LootingItemsTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[9]] = WalkingBackToStartTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[10]] = BuryingBonesTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[11]] = EatingTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[12]] = CuringPoisonTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[13]] = RestoringPrayerTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[14]] = DrinkingRangePotionTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[15]] = AlchingItemsTask.class;
        classArray[SquireAlchemicalHydraPlugin.llllIlIIIIIl[16]] = TeleportOutTask.class;
        return classArray;
    }

    public boolean c() {
        return this.h;
    }

    protected void onStart() {
        this.a.h();
        this.a(llllIlIIIIIl[1]);
        this.c.register((Object)this.a);
        this.c.register((Object)this.b);
        this.e.add((Overlay)this.f);

        this.e.add((Overlay)this.g);

    }

    static {
        SquireAlchemicalHydraPlugin.lIIlIIIIIllIIll();
        SquireAlchemicalHydraPlugin.lIIlIIIIIllIIlI();
    }

    public e b() {
        return this.b;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var1;
        if (SquireAlchemicalHydraPlugin.lIIlIIIIIllIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var2 = var1.getMessage();
        if (SquireAlchemicalHydraPlugin.lIIlIIIIIllIlIl(var2.contains(llllIlIIIIII[llllIlIIIIIl[1]]) ? 1 : 0)) {
            SquireAlchemicalHydraPlugin var3;
            var3.a(llllIlIIIIIl[2]);
        }
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    private static boolean lIIlIIIIIllIlIl(int n2) {
        return n2 != 0;
    }
}

