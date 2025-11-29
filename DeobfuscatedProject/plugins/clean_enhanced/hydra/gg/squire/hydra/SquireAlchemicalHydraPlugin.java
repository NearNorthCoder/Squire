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
import gg.squire.hydra.HydraManager;
import gg.squire.hydra.HydraManager;
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

    private static boolean var3(Object object, Object object2) {
        return object != object2;
    }

    public a a() {
        return this.a;
    }

    protected void onStop() {
        this.e.remove((Overlay)this.f);
        0;
        this.e.remove((Overlay)this.g);
        0;
        this.c.unregister((Object)this.a);
        this.c.unregister((Object)this.b);
    }

    private static void var4() {
        var2 = new String[var1[2]];
        SquireAlchemicalHydraPlugin.var2[SquireAlchemicalHydraPlugin.var1[1]] = "completed your task";
    }

    @Provides
    SquireAlchemicalHydraConfig a(ConfigManager configManager) {
        return (SquireAlchemicalHydraConfig)configManager.getConfig(SquireAlchemicalHydraConfig.class);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var1[0]];
        classArray[SquireAlchemicalHydraPlugin.var1[1]] = HandlingHydraPrayersTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[2]] = MovingTowardsTheNextTileTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[3]] = AttackingHydraTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[4]] = EnteringHydraRoomTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[5]] = FireSkipTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[6]] = DodgingLightningTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[7]] = UsingBlowpipeSpecTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[8]] = LootingItemsTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[9]] = WalkingBackToStartTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[10]] = BuryingBonesTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[11]] = EatingTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[12]] = CuringPoisonTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[13]] = RestoringPrayerTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[14]] = DrinkingRangePotionTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[15]] = AlchingItemsTask.class;
        classArray[SquireAlchemicalHydraPlugin.var1[16]] = TeleportOutTask.class;
        return classArray;
    }

    public boolean c() {
        return this.h;
    }

    protected void onStart() {
        this.a.h();
        this.a(var1[1]);
        this.c.register((Object)this.a);
        this.c.register((Object)this.b);
        this.e.add((Overlay)this.f);
        0;
        this.e.add((Overlay)this.g);
        0;
    }

    static {
        SquireAlchemicalHydraPlugin.var5();
        SquireAlchemicalHydraPlugin.var4();
    }

    public e b() {
        return this.b;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var6;
        if (SquireAlchemicalHydraPlugin.var3(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var7 = var6.getMessage();
        if (SquireAlchemicalHydraPlugin.var8(var7.contains(var2[var1[1]]) ? 1 : 0)) {
            SquireAlchemicalHydraPlugin var9;
            var9.a(var1[2]);
        }
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void var5() {
        var1 = new int[17];
        SquireAlchemicalHydraPlugin.var1[0] = 0x89 ^ 0x99;
        SquireAlchemicalHydraPlugin.var1[1] = (0x7C ^ 0x47) & ~(0x42 ^ 0x79);
        SquireAlchemicalHydraPlugin.var1[2] = 1;
        SquireAlchemicalHydraPlugin.var1[3] = 2;
        SquireAlchemicalHydraPlugin.var1[4] = 3;
        SquireAlchemicalHydraPlugin.var1[5] = 0xED ^ 0xC2 ^ (0xBA ^ 0x91);
        SquireAlchemicalHydraPlugin.var1[6] = 0x31 ^ 0x64 ^ (0x2F ^ 0x7F);
        SquireAlchemicalHydraPlugin.var1[7] = 0x3C ^ 7 ^ (0xBF ^ 0x82);
        SquireAlchemicalHydraPlugin.var1[8] = 78 + 29 - 101 + 163 ^ 142 + 74 - 166 + 124;
        SquireAlchemicalHydraPlugin.var1[9] = 111 + 32 - 18 + 27 ^ 51 + 38 - 82 + 137;
        SquireAlchemicalHydraPlugin.var1[10] = 0x10 ^ 0x19;
        SquireAlchemicalHydraPlugin.var1[11] = 0xAD ^ 0xA7;
        SquireAlchemicalHydraPlugin.var1[12] = 0xCC ^ 0xC7;
        SquireAlchemicalHydraPlugin.var1[13] = 0x7F ^ 0x4F ^ (0xA6 ^ 0x9A);
        SquireAlchemicalHydraPlugin.var1[14] = 0x6D ^ 0x60;
        SquireAlchemicalHydraPlugin.var1[15] = 0xCB ^ 0xBB ^ (0x46 ^ 0x38);
        SquireAlchemicalHydraPlugin.var1[16] = 0xBF ^ 0xB0;
    }

    public void a(boolean bl) {
        this.h = bl;
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }
}

