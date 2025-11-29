/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.game.ItemManager
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.loottracker.LootReceived
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.game.Prices
 */
package gg.squire.basics.cerberus;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.cerberus.SquireCerberusConfig;
import gg.squire.basics.cerberus.overlay.CerberusOverlay;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.cerberus.TraversingToCerberusTask;
import gg.squire.basics.cerberus.ConstructionManager;
import i.i.b.s.c.q.r.s.s.-.u.a.e.h;
import gg.squire.basics.cerberus.DrinkingPrayerPotionTask;
import gg.squire.basics.cerberus.EatingWildPieTask;
import gg.squire.basics.cerberus.HoppingWorldsTask;
import gg.squire.basics.cerberus.CheckingStateTask;
import gg.squire.basics.cerberus.TeleportingOutTask;
import gg.squire.basics.cerberus.BankingTask;
import gg.squire.basics.cerberus.WalkingToBankTask;
import gg.squire.basics.cerberus.AttackingCerberusTask;
import gg.squire.basics.cerberus.DrinkingBoostTask;
import gg.squire.basics.cerberus.EatingFoodTask;
import gg.squire.basics.cerberus.HandlingPrayerTask;
import gg.squire.basics.cerberus.LootingItemsTask;
import gg.squire.basics.cerberus.MovingOffFireTask;
import gg.squire.basics.cerberus.ScatteringAshesTask;
import gg.squire.basics.cerberus.SpecialAttackTask;
import gg.squire.basics.cerberus.UsingThrallTask;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import net.runelite.api.ChatMessageType;
import net.runelite.api.ItemComposition;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.game.Prices;

@PluginDescriptor(name="Squire Cerberus", description="Kills Cerberus for you, banks and loots items.", enabledByDefault=false)
@SquireUtil
public class SquireCerberus
extends SquirePlugin {
    
    private  boolean M;
     List<h> F;
    @Inject
    private  SquireCerberusConfig G;
    @Inject
    private  CerberusOverlay I;
    
    @Inject
    private  a J;
    @Inject
    private  OverlayManager H;
    @Inject
    private  EventBus K;
    private  int L;
    @Inject
    private  ItemManager w;

    private static void lIllIIIllIl() {
        llIIlIlIl = new String[llIIlIllI[2]];
        SquireCerberus.llIIlIlIl[SquireCerberus.llIIlIllI[1]] = "Your Cerberus kill";
    }

    public void b(int n2) {
        this.L = n2;
    }

    protected void onStart() {
        this.H.add((Overlay)this.I);

        this.J.a();
        this.K.register((Object)this.J);
    }

    public boolean r() {
        return this.M;
    }

    private static boolean lIllIIlIIII(int n2) {
        return n2 != 0;
    }

    public void b(boolean bl2) {
        this.M = bl2;
    }

    private static boolean lIllIIlIIIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(lIllIIllllIIIll);
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        lootReceived.getItems().forEach(itemStack -> {
            h h2 = new h();
            Instant instant = Instant.now();
            h2.a(instant);
            ItemComposition itemComposition = this.w.getItemComposition(itemStack.getId());
            int n2 = Prices.getItemPrice((int)itemStack.getId());
            h2.a(itemComposition.getName());
            h2.f(itemStack.getId());
            h2.g(n2);
            h2.h(this.w.getAlchValue(itemComposition));
            this.F.add(h2);

        });
    }

    @Provides
    SquireCerberusConfig a(ConfigManager configManager) {
        return (SquireCerberusConfig)configManager.getConfig(SquireCerberusConfig.class);
    }

    public int q() {
        return this.L;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lIllIIlllllIIlI;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (SquireCerberus.lIllIIIllll(chatMessageType, ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String lIllIIlllllIIII = lIllIIlllllIIlI.getMessage();
        if (SquireCerberus.lIllIIlIIII(lIllIIlllllIIII.contains(llIIlIlIl[llIIlIllI[1]]) ? 1 : 0)) {
            SquireCerberus lIllIIlllllIIll;
            lIllIIlllllIIll.b(lIllIIlllllIIll.q() + llIIlIllI[2]);
            lIllIIlllllIIll.J.a(llIIlIllI[2]);
        }
    }

    static {
        SquireCerberus.lIllIIIlllI();
        SquireCerberus.lIllIIIllIl();
    }

    public void a(List<h> list) {
        this.F = list;
    }

    protected void onStop() {
        this.H.remove((Overlay)this.I);

        this.J.a();
        this.K.register((Object)this.J);
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIlIllI[0]];
        classArray[SquireCerberus.llIIlIllI[1]] = HandlingPrayerTask.class;
        classArray[SquireCerberus.llIIlIllI[2]] = DrinkingPrayerPotionTask.class;
        classArray[SquireCerberus.llIIlIllI[3]] = EatingFoodTask.class;
        classArray[SquireCerberus.llIIlIllI[4]] = MovingOffFireTask.class;
        classArray[SquireCerberus.llIIlIllI[5]] = AttackingCerberusTask.class;
        classArray[SquireCerberus.llIIlIllI[6]] = LootingItemsTask.class;
        classArray[SquireCerberus.llIIlIllI[7]] = TeleportingOutTask.class;
        classArray[SquireCerberus.llIIlIllI[8]] = EatingWildPieTask.class;
        classArray[SquireCerberus.llIIlIllI[9]] = WalkingToBankTask.class;
        classArray[SquireCerberus.llIIlIllI[10]] = BankingTask.class;
        classArray[SquireCerberus.llIIlIllI[11]] = CheckingStateTask.class;
        classArray[SquireCerberus.llIIlIllI[12]] = TraversingToCerberusTask.class;
        classArray[SquireCerberus.llIIlIllI[13]] = UsingThrallTask.class;
        classArray[SquireCerberus.llIIlIllI[14]] = HoppingWorldsTask.class;
        classArray[SquireCerberus.llIIlIllI[15]] = SpecialAttackTask.class;
        classArray[SquireCerberus.llIIlIllI[16]] = DrinkingBoostTask.class;
        classArray[SquireCerberus.llIIlIllI[17]] = ScatteringAshesTask.class;
        return classArray;
    }

    public List<h> p() {
        return this.F;
    }

    public SquireCerberus() {
        this.F = new ArrayList<h>();
    }

    private static boolean lIllIIIllll(Object object, Object object2) {
        return object != object2;
    }
}

