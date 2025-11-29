/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.NpcLootReceived
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.client.Static
 */
package gg.squire.zulrah;

import gg.squire.zulrah.EquippingRecoilRingTask;
import gg.squire.zulrah.PressingContinueTask;
import gg.squire.zulrah.TurningOnRunTask;
import gg.squire.zulrah.BankingTask;
import gg.squire.zulrah.EnteringPortalTask;
import gg.squire.zulrah.WalkingToBankTask;
import gg.squire.zulrah.HandlingHouseTask;
import gg.squire.zulrah.OpeningBankTask;
import gg.squire.zulrah.TeleportingToZulandraTask;
import gg.squire.zulrah.CollectingItemsTask;
import gg.squire.zulrah.WalkingToBankDeathTask;
import gg.squire.zulrah.GoingToZulrahDeathwalkTask;
import gg.squire.zulrah.OpeningBankForZulrahTeleportTask;
import gg.squire.zulrah.DetectingDeathTask;
import gg.squire.zulrah.EquippingGearDeathwalkTask;
import gg.squire.zulrah.WithdrawingTeleportTask;
import gg.squire.zulrah.AttackingZulrahTask;
import gg.squire.zulrah.DodgingMeleeTask;
import gg.squire.zulrah.DrinkingPotionsTask;
import gg.squire.zulrah.EatingTask;
import gg.squire.zulrah.EatingForSpaceTask;
import gg.squire.zulrah.EnablingSpecialTask;
import gg.squire.zulrah.MovingToSafespotTask;
import gg.squire.zulrah.PanicTpingTask;
import gg.squire.zulrah.HandlingPrayersTask;
import gg.squire.zulrah.SwappingGearTask;
import gg.squire.zulrah.DisablingPrayersTask;
import gg.squire.zulrah.LootingItemsTask;
import gg.squire.zulrah.ReturningToZulandraTask;
import gg.squire.zulrah.TeleportingOutTask;
import gg.squire.zulrah.BoardingBoatTask;
import gg.squire.zulrah.DrinkingPotionsTask;
import gg.squire.zulrah.EquippingMageGearTask;
import gg.squire.zulrah.UsingImbuedHeartTask;
import gg.squire.zulrah.TeleportingToZulandraTask;
import gg.squire.zulrah.TraversingToZulandraTask;
import gg.squire.zulrah.GameEnum9;
import gg.squire.zulrah.ZulrahManager;
import gg.squire.zulrah.ZulrahManager;
import gg.squire.zulrah.ZulrahManager;
import gg.squire.zulrah.XHelper;
import gg.squire.zulrah.CuringVenomTask;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.zulrah.SquireZulrahConfig;
import gg.squire.zulrah.overlay.ZulrahInfoBox;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.client.Static;

@PluginDescriptor(name="Squire Zulrah", description="Zulrah killing plugin", tags={"zulrah", "helper", "squire"}, enabledByDefault=false)
public class SquireZulrah
extends SquirePlugin {
    private  int j;
    @Inject
    private  OverlayManager c;
    private  boolean m;
    
    private  int k;
    private  boolean l;
    private  c i;
    @Inject
    private  SquireZulrahConfig f;
    
    @Inject
    private  EventBus b;
    @Inject
    private  ZulrahInfoBox d;
    @Inject
    private  w h;
    @Inject
    private  x e;
    @Inject
    private  t g;
    @Inject
    private  v a;

    public int b() {
        return this.j;
    }

    public void a(c c2) {
        this.i = c2;
    }

    public void a(int n2) {
        this.k = n2;
    }

    public c a() {
        return this.i;
    }

    protected void onStart() {
        this.a.T();
        this.l = 1;
        this.m = 1;
        this.i = a.u.i.-.l.r.h.z.s.r.u.q.e.c.DONE;
        this.b.register((Object)this.a);
        this.c.add((Overlay)this.d);
        0;
        this.c.add((Overlay)this.h);
        0;
        this.c.add((Overlay)this.e);
        0;
        this.k = Static.getClient().getTickCount();
    }

    public boolean d() {
        return this.l;
    }

    public SquireZulrah() {
        this.i = a.u.i.-.l.r.h.z.s.r.u.q.e.c.DONE;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
        this.b.unregister((Object)this.a);
        this.c.remove((Overlay)this.d);
        0;
        this.c.remove((Overlay)this.e);
        0;
        this.c.remove((Overlay)this.h);
        0;
    }

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        this.m = 2;
    }

    @Provides
    SquireZulrahConfig a(ConfigManager configManager) {
        return (SquireZulrahConfig)configManager.getConfig(SquireZulrahConfig.class);
    }

    public void a(boolean bl) {
        this.l = bl;
    }

    public int c() {
        return this.k;
    }

    public boolean e() {
        return this.m;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var9;
        if ((chatMessage.getType() != chatMessage.getType()2)) {
            return;
        }
        String var10 = var9.getMessage();
        if ((var10.equals(var1[1] == 0) ? 1 : 0)) {
            return;
        }
        this.i = a.u.i.-.l.r.h.z.s.r.u.q.e.c.BANKING;
        this.j += 2;
    }

    public void b(boolean bl) {
        this.m = bl;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[0];
        classArray[1] = PressingContinueTask.class;
        classArray[2] = CuringVenomTask.class;
        classArray[3] = EquippingRecoilRingTask.class;
        classArray[4] = MovingToSafespotTask.class;
        classArray[5] = HandlingPrayersTask.class;
        classArray[6] = AttackingZulrahTask.class;
        classArray[7] = DodgingMeleeTask.class;
        classArray[8] = EatingTask.class;
        classArray[9] = DrinkingPotionsTask.class;
        classArray[SquireZulrah.var2[10]] = SwappingGearTask.class;
        classArray[SquireZulrah.var2[11]] = EnablingSpecialTask.class;
        classArray[SquireZulrah.var2[12]] = EatingForSpaceTask.class;
        classArray[SquireZulrah.var2[13]] = DisablingPrayersTask.class;
        classArray[SquireZulrah.var2[14]] = LootingItemsTask.class;
        classArray[SquireZulrah.var2[15]] = TeleportingOutTask.class;
        classArray[SquireZulrah.var2[16]] = ReturningToZulandraTask.class;
        classArray[SquireZulrah.var2[17]] = BoardingBoatTask.class;
        classArray[SquireZulrah.var2[18]] = DrinkingPotionsTask.class;
        classArray[SquireZulrah.var2[19]] = EquippingMageGearTask.class;
        classArray[SquireZulrah.var2[20]] = UsingImbuedHeartTask.class;
        classArray[SquireZulrah.var2[21]] = BankingTask.class;
        classArray[SquireZulrah.var2[22]] = OpeningBankTask.class;
        classArray[SquireZulrah.var2[23]] = TeleportingToZulandraTask.class;
        classArray[SquireZulrah.var2[24]] = EnteringPortalTask.class;
        classArray[SquireZulrah.var2[25]] = WalkingToBankTask.class;
        classArray[SquireZulrah.var2[26]] = HandlingHouseTask.class;
        classArray[SquireZulrah.var2[27]] = WalkingToBankDeathTask.class;
        classArray[SquireZulrah.var2[28]] = OpeningBankForZulrahTeleportTask.class;
        classArray[SquireZulrah.var2[29]] = CollectingItemsTask.class;
        classArray[SquireZulrah.var2[30]] = WithdrawingTeleportTask.class;
        classArray[SquireZulrah.var2[31]] = GoingToZulrahDeathwalkTask.class;
        classArray[SquireZulrah.var2[32]] = EquippingGearDeathwalkTask.class;
        classArray[SquireZulrah.var2[33]] = TeleportingToZulandraTask.class;
        classArray[SquireZulrah.var2[34]] = TraversingToZulandraTask.class;
        classArray[SquireZulrah.var2[35]] = PanicTpingTask.class;
        classArray[SquireZulrah.var2[36]] = TurningOnRunTask.class;
        classArray[SquireZulrah.var2[37]] = DetectingDeathTask.class;
        return classArray;
    }
}

