/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.NpcLootReceived
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.ClientToolbar
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.game.Prices
 */
package gg.squire.vorkath;

import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.ui.VorkathInfoBox;
import gg.squire.vorkath.PrayTask;
import gg.squire.vorkath.SpecTask;
import gg.squire.vorkath.SwappingBoltsTask;
import gg.squire.vorkath.WalkingToOriginalSafeSpotTask;
import gg.squire.vorkath.DrinkingAntifirePotionTask;
import gg.squire.vorkath.DrinkingCombatPotionTask;
import gg.squire.vorkath.EatTask;
import gg.squire.vorkath.PrayerPotTask;
import gg.squire.vorkath.TickEatTask;
import gg.squire.vorkath.VenomTask;
import gg.squire.vorkath.AlchingItemTask;
import gg.squire.vorkath.LootTask;
import gg.squire.vorkath.BoardingBoatTask;
import gg.squire.vorkath.TraversingToRelTask;
import gg.squire.vorkath.EnteringFightTask;
import gg.squire.vorkath.RHelper;
import gg.squire.vorkath.ClaimingDeathItemsTask;
import gg.squire.vorkath.VorkathManager;
import gg.squire.vorkath.VorkathManager;
import gg.squire.vorkath.UsingBankloadoutTask;
import gg.squire.vorkath.EnteringPortalTask;
import gg.squire.vorkath.WalkingToBankTask;
import gg.squire.vorkath.HandlingHouseTask;
import gg.squire.vorkath.OpeningBankTask;
import gg.squire.vorkath.TeleportingToRellekaTask;
import gg.squire.vorkath.AttackTask;
import gg.squire.vorkath.DodgeTask;
import gg.squire.vorkath.FleeTask;
import gg.squire.vorkath.KillingZombifiedSpawnTask;
import gg.squire.vorkath.PokeTask;
import javax.inject.Inject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Prices;

@PluginDescriptor(name="Squire Vorkath", description="Kills the big blue dragon", tags={"vorkath", "prayer", "bones"}, enabledByDefault=false)
@SquireUtil
public class SquireVorkathPlugin
extends SquirePlugin {
    
    @Inject
     OverlayManager j;
    private  int p;
    @Inject
     f h;
    @Inject
    private  EventBus n;
    @Inject
    private  VorkathInfoBox m;
    @Inject
     R k;
    private  int s;
    
    private  int q;
    @Inject
     d l;
    @Inject
     ClientToolbar i;
    private  boolean o;
    private  boolean r;

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        int n2 = npcLootReceived.getItems().stream().mapToInt(itemStack -> Prices.getItemPrice((int)itemStack.getId()) * itemStack.getQuantity()).sum();
        this.s += n2;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public int d() {
        return this.p;
    }

    public boolean f() {
        return this.r;
    }

    public SquireVorkathPlugin() {
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[1];
        classArray[0] = FleeTask.class;
        classArray[2] = PrayTask.class;
        classArray[3] = TickEatTask.class;
        classArray[4] = EatTask.class;
        classArray[5] = DrinkingAntifirePotionTask.class;
        classArray[6] = PrayerPotTask.class;
        classArray[7] = VenomTask.class;
        classArray[8] = DrinkingCombatPotionTask.class;
        classArray[9] = DodgeTask.class;
        classArray[SquireVorkathPlugin.var2[10]] = SpecTask.class;
        classArray[SquireVorkathPlugin.var2[11]] = AttackTask.class;
        classArray[SquireVorkathPlugin.var2[12]] = LootTask.class;
        classArray[SquireVorkathPlugin.var2[13]] = PokeTask.class;
        classArray[SquireVorkathPlugin.var2[14]] = KillingZombifiedSpawnTask.class;
        classArray[SquireVorkathPlugin.var2[15]] = WalkingToOriginalSafeSpotTask.class;
        classArray[SquireVorkathPlugin.var2[16]] = SwappingBoltsTask.class;
        classArray[SquireVorkathPlugin.var2[17]] = AlchingItemTask.class;
        classArray[SquireVorkathPlugin.var2[18]] = EnteringFightTask.class;
        classArray[SquireVorkathPlugin.var2[19]] = BoardingBoatTask.class;
        classArray[SquireVorkathPlugin.var2[20]] = ClaimingDeathItemsTask.class;
        classArray[SquireVorkathPlugin.var2[21]] = TraversingToRelTask.class;
        classArray[SquireVorkathPlugin.var2[22]] = UsingBankloadoutTask.class;
        classArray[SquireVorkathPlugin.var2[23]] = OpeningBankTask.class;
        classArray[SquireVorkathPlugin.var2[24]] = TeleportingToRellekaTask.class;
        classArray[SquireVorkathPlugin.var2[25]] = EnteringPortalTask.class;
        classArray[SquireVorkathPlugin.var2[26]] = WalkingToBankTask.class;
        classArray[SquireVorkathPlugin.var2[27]] = HandlingHouseTask.class;
        return classArray;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
        this.j.remove((Overlay)this.k);
        0;
        this.j.remove((Overlay)this.m);
        0;
        this.n.unregister((Object)this.l);
        this.n.unregister((Object)this.h);
    }

    protected void onStart() {
        this.a();
        this.j.add((Overlay)this.k);
        0;
        this.j.add((Overlay)this.m);
        0;
        this.h.a();
        this.n.register((Object)this.l);
        this.n.register((Object)this.h);
        this.o = 2;
    }

    public int g() {
        return this.s;
    }

    public void a(boolean bl) {
        this.o = bl;
    }

    @Provides
    SquireVorkathConfig a(ConfigManager configManager) {
        return (SquireVorkathConfig)configManager.getConfig(SquireVorkathConfig.class);
    }

    public void b(boolean bl) {
        this.r = bl;
    }

    public int e() {
        return this.q;
    }

    public boolean c() {
        return this.o;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var19;
        if ((chatMessage.getMessage( != 0).contains(var1[0]) ? 1 : 0)) {
            this.q += 2;
        }
        if ((var19.getMessage( != 0).contains(var1[2]) ? 1 : 0)) {
            SquireVorkathPlugin var20;
            var20.r = 2;
            Log.info((String)var1[3]);
            var20.forceStop();
        }
    }

    private void a() {
        this.q = 0;
        this.o = 0;
        this.p = 0;
        this.r = 0;
        this.s = 0;
    }

    public R b() {
        return this.k;
    }
}

