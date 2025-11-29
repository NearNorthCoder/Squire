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
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.R;
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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static boolean llIIIIIIIllIlII(int n2) {
        return n2 != 0;
    }

    private static void llIIIIIIIllIIlI() {
        lIlIllIIIlllI = new String[lIlIllIIIllll[4]];
        SquireVorkathPlugin.lIlIllIIIlllI[SquireVorkathPlugin.lIlIllIIIllll[0]] = "Your Vorkath kill count";
        SquireVorkathPlugin.lIlIllIIIlllI[SquireVorkathPlugin.lIlIllIIIllll[2]] = "Oh dear, you are dead";
        SquireVorkathPlugin.lIlIllIIIlllI[SquireVorkathPlugin.lIlIllIIIllll[3]] = "Died and no death handler just yet, so just stopping for now";
    }

        return String.valueOf(var1);
    }

    public int d() {
        return this.p;
    }

    public boolean f() {
        return this.r;
    }

    public SquireVorkathPlugin() {
        this.p = lIlIllIIIllll[0];
        this.q = lIlIllIIIllll[0];
        this.r = lIlIllIIIllll[0];
        this.s = lIlIllIIIllll[0];
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIllIIIllll[1]];
        classArray[SquireVorkathPlugin.lIlIllIIIllll[0]] = FleeTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[2]] = PrayTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[3]] = TickEatTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[4]] = EatTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[5]] = DrinkingAntifirePotionTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[6]] = PrayerPotTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[7]] = VenomTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[8]] = DrinkingCombatPotionTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[9]] = DodgeTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[10]] = SpecTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[11]] = AttackTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[12]] = LootTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[13]] = PokeTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[14]] = KillingZombifiedSpawnTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[15]] = WalkingToOriginalSafeSpotTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[16]] = SwappingBoltsTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[17]] = AlchingItemTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[18]] = EnteringFightTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[19]] = BoardingBoatTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[20]] = ClaimingDeathItemsTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[21]] = TraversingToRelTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[22]] = UsingBankloadoutTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[23]] = OpeningBankTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[24]] = TeleportingToRellekaTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[25]] = EnteringPortalTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[26]] = WalkingToBankTask.class;
        classArray[SquireVorkathPlugin.lIlIllIIIllll[27]] = HandlingHouseTask.class;
        return classArray;
    }

    static {
        SquireVorkathPlugin.llIIIIIIIllIIll();
        SquireVorkathPlugin.llIIIIIIIllIIlI();
    }

    protected void onStop() {
        this.j.remove((Overlay)this.k);

        this.j.remove((Overlay)this.m);

        this.n.unregister((Object)this.l);
        this.n.unregister((Object)this.h);
    }

    private static boolean llIIIIIIIllIlIl(int n2, int n3) {
        return n2 < n3;
    }

    protected void onStart() {
        this.a();
        this.j.add((Overlay)this.k);

        this.j.add((Overlay)this.m);

        this.h.a();
        this.n.register((Object)this.l);
        this.n.register((Object)this.h);
        this.o = lIlIllIIIllll[2];
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
        void var2;
        if (SquireVorkathPlugin.llIIIIIIIllIlII(chatMessage.getMessage().contains(lIlIllIIIlllI[lIlIllIIIllll[0]]) ? 1 : 0)) {
            this.q += lIlIllIIIllll[2];
        }
        if (SquireVorkathPlugin.llIIIIIIIllIlII(var2.getMessage().contains(lIlIllIIIlllI[lIlIllIIIllll[2]]) ? 1 : 0)) {
            SquireVorkathPlugin var3;
            var3.r = lIlIllIIIllll[2];
            Log.info((String)lIlIllIIIlllI[lIlIllIIIllll[3]]);
            var3.forceStop();
        }
    }

    private void a() {
        this.q = lIlIllIIIllll[0];
        this.o = lIlIllIIIllll[0];
        this.p = lIlIllIIIllll[0];
        this.r = lIlIllIIIllll[0];
        this.s = lIlIllIIIllll[0];
    }

    public R b() {
        return this.k;
    }
}

