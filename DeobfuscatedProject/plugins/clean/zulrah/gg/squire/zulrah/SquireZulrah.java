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
import gg.squire.zulrah.GameEnum40;
import gg.squire.zulrah.THelper;
import gg.squire.zulrah.ZulrahManager;
import gg.squire.zulrah.ZulrahManager;
import a.u.i.-.l.r.h.z.s.r.u.q.e.x;
import gg.squire.zulrah.CuringVenomTask;
import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.zulrah.SquireZulrahConfig;
import gg.squire.zulrah.overlay.ZulrahInfoBox;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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

    private static void llIIlIIlllllIII() {
        lIllIlllllIIl = new String[lIllIlllllIlI[2]];
        SquireZulrah.lIllIlllllIIl[SquireZulrah.lIllIlllllIlI[1]] = "Oh dear, you are dead!";
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
        this.l = lIllIlllllIlI[1];
        this.m = lIllIlllllIlI[1];
        this.i = a.u.i.-.l.r.h.z.s.r.u.q.e.c.DONE;
        this.b.register((Object)this.a);
        this.c.add((Overlay)this.d);

        this.c.add((Overlay)this.h);

        this.c.add((Overlay)this.e);

        this.k = Static.getClient().getTickCount();
    }

    public boolean d() {
        return this.l;
    }

    public SquireZulrah() {
        this.i = a.u.i.-.l.r.h.z.s.r.u.q.e.c.DONE;
    }

    protected void onStop() {
        this.b.unregister((Object)this.a);
        this.c.remove((Overlay)this.d);

        this.c.remove((Overlay)this.e);

        this.c.remove((Overlay)this.h);

    }

    private static boolean llIIlIIlllllIll(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        this.m = lIllIlllllIlI[2];
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
        void var1;
        if (SquireZulrah.llIIlIIlllllIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var2 = var1.getMessage();
        if (SquireZulrah.llIIlIIlllllIll(var2.equals(lIllIlllllIIl[lIllIlllllIlI[1]]) ? 1 : 0)) {
            return;
        }
        this.i = a.u.i.-.l.r.h.z.s.r.u.q.e.c.BANKING;
        this.j += lIllIlllllIlI[2];
    }

    public void b(boolean bl) {
        this.m = bl;
    }

    static {
        SquireZulrah.llIIlIIlllllIIl();
        SquireZulrah.llIIlIIlllllIII();
    }

    private static boolean llIIlIIlllllIlI(Object object, Object object2) {
        return object != object2;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIllIlllllIlI[0]];
        classArray[SquireZulrah.lIllIlllllIlI[1]] = PressingContinueTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[2]] = CuringVenomTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[3]] = EquippingRecoilRingTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[4]] = MovingToSafespotTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[5]] = HandlingPrayersTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[6]] = AttackingZulrahTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[7]] = DodgingMeleeTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[8]] = EatingTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[9]] = DrinkingPotionsTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[10]] = SwappingGearTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[11]] = EnablingSpecialTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[12]] = EatingForSpaceTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[13]] = DisablingPrayersTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[14]] = LootingItemsTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[15]] = TeleportingOutTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[16]] = ReturningToZulandraTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[17]] = BoardingBoatTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[18]] = DrinkingPotionsTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[19]] = EquippingMageGearTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[20]] = UsingImbuedHeartTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[21]] = BankingTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[22]] = OpeningBankTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[23]] = TeleportingToZulandraTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[24]] = EnteringPortalTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[25]] = WalkingToBankTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[26]] = HandlingHouseTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[27]] = WalkingToBankDeathTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[28]] = OpeningBankForZulrahTeleportTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[29]] = CollectingItemsTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[30]] = WithdrawingTeleportTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[31]] = GoingToZulrahDeathwalkTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[32]] = EquippingGearDeathwalkTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[33]] = TeleportingToZulandraTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[34]] = TraversingToZulandraTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[35]] = PanicTpingTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[36]] = TurningOnRunTask.class;
        classArray[SquireZulrah.lIllIlllllIlI[37]] = DetectingDeathTask.class;
        return classArray;
    }
}

