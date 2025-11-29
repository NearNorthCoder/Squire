/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.ImmutableSet
 *  com.google.inject.Binder
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.InstanceTemplates
 *  net.runelite.api.Item
 *  net.runelite.api.MessageNode
 *  net.runelite.api.Point
 *  net.runelite.api.Skill
 *  net.runelite.api.Tile
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.callback.ClientThread
 *  net.runelite.client.chat.ChatClient
 *  net.runelite.client.chat.ChatColorType
 *  net.runelite.client.chat.ChatMessageBuilder
 *  net.runelite.client.chat.ChatMessageManager
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.config.RuneLiteConfig
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ChatInput
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.game.ItemStack
 *  net.runelite.client.game.SpriteManager
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.loottracker.LootReceived
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.runelite.client.ui.overlay.infobox.InfoBox
 *  net.runelite.client.ui.overlay.infobox.InfoBoxManager
 *  net.runelite.client.util.ImageCapture
 *  net.runelite.client.util.Text
 *  net.runelite.http.api.chat.LayoutRoom
 *  net.unethicalite.api.events.ExperienceGained
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.cox;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.K_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.L_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.R_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.SettingUpAutoRoomsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ScoutingForARaidTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.SettingUpRaidTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.TestTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.RechargingTridentTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.GuardiansTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.MuttadilesTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.MysticsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ShamansTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.TektonTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.VasaTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.VespulaTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.EnterOlmRoomTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.DodgingFalligCrystalsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PrayerFlickingTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.TryingOlmHeadTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.LootChestTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.OlmMageHandTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.OlmMeleeHandTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.OlmPortalsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.OlmMeleeSpecTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PrayerFlickingTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.FinishingFloorTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.FarmingTopFloorTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ScavangersPrepTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ScavangersTopFloorTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.StartRoomTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PrepDepositInventoryTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PrepDroppingToolsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.WithdrawingItemsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.DrinkOverloadTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.DrinkStaminaTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.DroppingSpareItemsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.EatingFoodTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.EnablingRunTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PickupDroppedBrewTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PickupEnhanceTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ManageOverloadsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PickSeedsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.RestoringPrayerTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.al_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.EmptyPrivateStorageTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ConfigurePartyTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.HoppingToDifferentWorldTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.LeaveRaidTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.MakingPartyTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PrepGetSeedsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PrepGettingToolsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PrepGetVialsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PrepMakePotsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PrepPickHerbsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PrepFarmingTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PrepWithdrawOlmGearTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.CrabsTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.IceDemonTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ThievingTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.TightropeTask;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.c_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.d_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.e_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.f;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.g_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.h_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.i_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.k_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.l_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.s_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.WEnum;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Binder;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.cox.SquireChambersConfig;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.InstanceTemplates;
import net.runelite.api.Item;
import net.runelite.api.MessageNode;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.chat.ChatClient;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ChatInput;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.game.ItemStack;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.infobox.InfoBox;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.util.ImageCapture;
import net.runelite.client.util.Text;
import net.runelite.http.api.chat.LayoutRoom;
import net.unethicalite.api.events.ExperienceGained;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Squire Chambers Of Xeric", description="All squire devs know is vacation and cox", tags={"combat", "raid", "overlay", "pve", "pvm", "bosses", "cox"}, enabledByDefault=false)
@SquireUtil
public class SquireChambersPlugin
extends SquirePlugin {
    private static final /* synthetic */ DecimalFormat G;
    private /* synthetic */ int ah;
    @Inject
    private /* synthetic */ Client u;
    private static final /* synthetic */ String F;
    @Inject
    private /* synthetic */ i V;
    private /* synthetic */ int ai;
    @Inject
    private /* synthetic */ ScheduledExecutorService T;
    @Inject
    private /* synthetic */ d O;
    private static /* synthetic */ int[] lIlIIIIlIIII;
    /* synthetic */ n ak;
    @Inject
    private /* synthetic */ ImageCapture U;
    /* synthetic */ List<n> ab;
    @Inject
    private /* synthetic */ OverlayManager N;
    @Inject
    private /* synthetic */ SquireChambersConfig k;
    @Inject
    private /* synthetic */ h Y;
    @Inject
    private /* synthetic */ SpriteManager Q;
    private /* synthetic */ boolean af;
    @Inject
    private /* synthetic */ L P;
    private static final /* synthetic */ Set<Integer> J;
    private /* synthetic */ int aj;
    @Inject
    private /* synthetic */ ChatMessageManager L;
    /* synthetic */ int am;
    /* synthetic */ EquipmentSetup ao;
    /* synthetic */ EquipmentSetup an;
    @Inject
    private /* synthetic */ ChatClient S;
    private /* synthetic */ c ae;
    @Inject
    private /* synthetic */ k X;
    @Inject
    private /* synthetic */ RuneLiteConfig K;
    public static final /* synthetic */ int C;
    /* synthetic */ EquipmentSetup ap;
    private /* synthetic */ int ag;
    public static final /* synthetic */ int D;
    @Inject
    private /* synthetic */ InfoBoxManager M;
    private static final /* synthetic */ DecimalFormat H;
    @Inject
    private /* synthetic */ EventBus Z;
    private static final /* synthetic */ int I;
    private static final /* synthetic */ String E;
    private /* synthetic */ a aa;
    private /* synthetic */ boolean ac;
    private static /* synthetic */ String[] lIlIIIIIllll;
    public static final /* synthetic */ int A;
    @Inject
    private /* synthetic */ l W;
    private static final /* synthetic */ Logger z;
    /* synthetic */ EquipmentSetup aq;
    @Inject
    private /* synthetic */ ClientThread R;
    private /* synthetic */ GameState ar;
    /* synthetic */ n al;
    public static final /* synthetic */ int B;
    private /* synthetic */ int ad;

    protected void onStop() {
        this.N.remove((Overlay)this.O);
        0;
        this.M.removeInfoBox((InfoBox)this.ae);
        this.ae = null;
        this.ac = lIlIIIIlIIII[0];
        this.w();
        this.Z.unregister((Object)this.W);
        this.Z.unregister((Object)this.V);
        this.Z.unregister((Object)this.X);
        this.Z.unregister((Object)this.Y);
    }

    public void g(int n2) {
        this.aj = n2;
    }

    public EquipmentSetup P() {
        return this.ao;
    }

    public int N() {
        return this.am;
    }

    private static boolean llIlIlIIlIlIll(int n2, int n3) {
        return n2 != n3;
    }

    public int K() {
        return this.aj;
    }

    private boolean a(ChatInput chatInput, String string) {
        if (SquireChambersPlugin.llIlIlIIlIllII(this.aa)) {
            return lIlIIIIlIIII[0];
        }
        String string2 = this.u.getLocalPlayer().getName();
        List<N> list = this.aa.e();
        LayoutRoom[] layoutRoomArray = (LayoutRoom[])list.stream().map(n2 -> LayoutRoom.valueOf((String)n2.name())).toArray(LayoutRoom[]::new);
        this.T.execute(() -> {
            block7: {
                try {
                    SquireChambersPlugin var13;
                    var13.S.submitLayout(string2, layoutRoomArray);
                    0;
                    0;
                }
                catch (Exception var56) {
                    z.warn(lIlIIIIIllll[lIlIIIIlIIII[30]], (Throwable)var56);
                    0;
                    if (3 <= 0) {
                        return;
                    }
                    break block7;
                }
                finally {
                    chatInput.resume();
                }
                if (((0x20 ^ 0x7B) & ~(0xC1 ^ 0x9A)) != 0) {
                    return;
                }
            }
        });
        return lIlIIIIlIIII[3];
    }

    private static boolean llIlIlIIlIlIIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean x() {
        void var1_2;
        int[] nArray = new int[lIlIIIIlIIII[3]];
        nArray[SquireChambersPlugin.lIlIIIIlIIII[0]] = lIlIIIIlIIII[66];
        if (SquireChambersPlugin.llIlIlIIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void var57;
            int[] nArray2 = new int[lIlIIIIlIIII[3]];
            nArray2[SquireChambersPlugin.lIlIIIIlIIII[0]] = lIlIIIIlIIII[66];
            Item item2 = Inventory.getFirst((int[])nArray2);
            if (SquireChambersPlugin.llIlIlIIlIllII(item2)) {
                return lIlIIIIlIIII[0];
            }
            var57.interact(lIlIIIIIllll[lIlIIIIlIIII[23]]);
            return lIlIIIIlIIII[3];
        }
        Item var57 = Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIllll[lIlIIIIlIIII[29]]));
        if (SquireChambersPlugin.llIlIlIIlIllII(var57)) {
            var57 = Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIllll[lIlIIIIlIIII[28]]));
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(var57)) {
            var57 = Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIllll[lIlIIIIlIIII[27]]));
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(var57)) {
            var57 = Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIllll[lIlIIIIlIIII[26]]));
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(var57)) {
            return lIlIIIIlIIII[0];
        }
        var1_2.drop();
        return lIlIIIIlIIII[3];
    }

    /*
     * WARNING - void declaration
     */
    private a a(a a2) {
        int n2;
        a var20;
        SquireChambersPlugin var19;
        a a3 = a2;
        if (SquireChambersPlugin.llIlIlIIlIllII(a3)) {
            void var28;
            Point point = this.v();
            if (SquireChambersPlugin.llIlIlIIlIllII(point)) {
                return null;
            }
            Integer var46 = var19.a((Point)var28);
            if (SquireChambersPlugin.llIlIlIIlIllII(var46)) {
                return null;
            }
            var20 = new a(new WorldPoint(var19.u.getBaseX() + var28.getX(), var19.u.getBaseY() + var28.getY(), lIlIIIIlIIII[5]), var46);
        }
        int var28 = var20.l() % lIlIIIIlIIII[6];
        if (SquireChambersPlugin.llIlIlIIlIllll(var20.l() % lIlIIIIlIIII[10], lIlIIIIlIIII[5])) {
            n2 = lIlIIIIlIIII[3];
            0;
            if ((2 & ~2) == (0x34 ^ 0x30)) {
                return null;
            }
        } else {
            n2 = lIlIIIIlIIII[0];
        }
        int var46 = n2;
        int var58 = lIlIIIIlIIII[0];
        while (SquireChambersPlugin.llIlIlIIlIlIII(var58, var20.h().length)) {
            int n3;
            int var59;
            int n4;
            int var60 = var58 % lIlIIIIlIIII[6];
            if (SquireChambersPlugin.llIlIlIIlIllll(var58 % lIlIIIIlIIII[10], lIlIIIIlIIII[5])) {
                n4 = lIlIIIIlIIII[3];
                0;
                if ((0xBC ^ 0xA8 ^ (0x33 ^ 0x23)) < 0) {
                    return null;
                }
            } else {
                n4 = var59 = lIlIIIIlIIII[0];
            }
            if (SquireChambersPlugin.llIlIlIIlIllll(var58, lIlIIIIlIIII[9])) {
                n3 = lIlIIIIlIIII[4];
                0;
                if ((54 + 19 - -57 + 1 ^ 64 + 52 - 31 + 50) < 0) {
                    return null;
                }
            } else {
                n3 = lIlIIIIlIIII[5];
            }
            int var14 = n3;
            var60 -= var28;
            var59 -= var46;
            var60 = var20.k().getX() + var60 * lIlIIIIlIIII[34];
            var59 = var20.k().getY() - var59 * lIlIIIIlIIII[34];
            var59 -= var19.u.getBaseY();
            if (SquireChambersPlugin.llIlIlIIllIIII(var60 -= var19.u.getBaseX(), lIlIIIIlIIII[64])) {
                if (SquireChambersPlugin.llIlIlIIllIIII(var60, lIlIIIIlIIII[62])) {
                    0;
                    if ((147 + 61 - 78 + 33 ^ 135 + 27 - 72 + 77) != (2 ^ (0xB9 ^ 0xBF))) {
                        return null;
                    }
                } else {
                    Tile var26;
                    if (SquireChambersPlugin.llIlIlIIlIlIII(var60, lIlIIIIlIIII[3])) {
                        var60 = lIlIIIIlIIII[3];
                    }
                    if (SquireChambersPlugin.llIlIlIIlIlIII(var59, lIlIIIIlIIII[3])) {
                        var59 = lIlIIIIlIIII[3];
                    }
                    if (SquireChambersPlugin.llIlIlIIlIllII(var26 = var19.u.getScene().getTiles()[var14][var60][var59])) {
                        0;
                        if (2 > 3) {
                            return null;
                        }
                    } else {
                        N var48 = var19.b(var26);
                        var20.a(var48, var58);
                    }
                }
            }
            ++var58;
            0;
            if (((0x4E ^ 0x7C) & ~(0 ^ 0x32)) == 0) continue;
            return null;
        }
        return a3;
    }

    private static void llIlIlIIlIIlIl() {
        lIlIIIIlIIII = new int[79];
        SquireChambersPlugin.lIlIIIIlIIII[0] = (0x5C ^ 0x62) & ~(0x58 ^ 0x66);
        SquireChambersPlugin.lIlIIIIlIIII[1] = 0xC ^ 0x3E;
        SquireChambersPlugin.lIlIIIIlIIII[2] = 0x56 ^ 0x6E;
        SquireChambersPlugin.lIlIIIIlIIII[3] = 1;
        SquireChambersPlugin.lIlIIIIlIIII[4] = 2;
        SquireChambersPlugin.lIlIIIIlIIII[5] = 3;
        SquireChambersPlugin.lIlIIIIlIIII[6] = 0xC ^ 8;
        SquireChambersPlugin.lIlIIIIlIIII[7] = 17 + 108 - 4 + 32 ^ 84 + 131 - 214 + 155;
        SquireChambersPlugin.lIlIIIIlIIII[8] = 0xB7 ^ 0xB1;
        SquireChambersPlugin.lIlIIIIlIIII[9] = 0x5F ^ 0x58;
        SquireChambersPlugin.lIlIIIIlIIII[10] = 0x10 ^ 0x18;
        SquireChambersPlugin.lIlIIIIlIIII[11] = 3 ^ 0x51 ^ (0x77 ^ 0x2C);
        SquireChambersPlugin.lIlIIIIlIIII[12] = 0x53 ^ 0x6D ^ (4 ^ 0x30);
        SquireChambersPlugin.lIlIIIIlIIII[13] = 0x24 ^ 0x2F;
        SquireChambersPlugin.lIlIIIIlIIII[14] = 0x8F ^ 0x83;
        SquireChambersPlugin.lIlIIIIlIIII[15] = 0x89 ^ 0x84;
        SquireChambersPlugin.lIlIIIIlIIII[16] = 0x37 ^ 0x7D ^ (0xB ^ 0x4F);
        SquireChambersPlugin.lIlIIIIlIIII[17] = 32 + 65 - 20 + 58 ^ 42 + 99 - 122 + 117;
        SquireChambersPlugin.lIlIIIIlIIII[18] = 0x53 ^ 0x26 ^ (0xD7 ^ 0xB2);
        SquireChambersPlugin.lIlIIIIlIIII[19] = 0x10 ^ 1;
        SquireChambersPlugin.lIlIIIIlIIII[20] = 0x9F ^ 0x8D;
        SquireChambersPlugin.lIlIIIIlIIII[21] = 0x5B ^ 0x38 ^ (0x68 ^ 0x18);
        SquireChambersPlugin.lIlIIIIlIIII[22] = 0x9F ^ 0x80 ^ (0xBD ^ 0xB6);
        SquireChambersPlugin.lIlIIIIlIIII[23] = 137 + 96 - 175 + 89 ^ 56 + 113 - 154 + 119;
        SquireChambersPlugin.lIlIIIIlIIII[24] = 0x5E ^ 0x48;
        SquireChambersPlugin.lIlIIIIlIIII[25] = 148 + 102 - 127 + 35 ^ 100 + 41 - 81 + 77;
        SquireChambersPlugin.lIlIIIIlIIII[26] = 0x4C ^ 0x35 ^ (4 ^ 0x65);
        SquireChambersPlugin.lIlIIIIlIIII[27] = 0x8A ^ 0x81 ^ (0x2B ^ 0x39);
        SquireChambersPlugin.lIlIIIIlIIII[28] = 153 + 54 - 94 + 54 ^ 128 + 66 - 50 + 45;
        SquireChambersPlugin.lIlIIIIlIIII[29] = 0x42 ^ 0x79 ^ (0x59 ^ 0x79);
        SquireChambersPlugin.lIlIIIIlIIII[30] = 0xD9 ^ 0xC5;
        SquireChambersPlugin.lIlIIIIlIIII[31] = 0x5D ^ 0x40;
        SquireChambersPlugin.lIlIIIIlIIII[32] = 0xB1 ^ 0xAF;
        SquireChambersPlugin.lIlIIIIlIIII[33] = 11 + 65 - -22 + 81 ^ 116 + 102 - 168 + 122;
        SquireChambersPlugin.lIlIIIIlIIII[34] = 0x32 ^ 0x52 ^ (0xE ^ 0x4E);
        SquireChambersPlugin.lIlIIIIlIIII[35] = 0x3D ^ 8 ^ (0x65 ^ 0x71);
        SquireChambersPlugin.lIlIIIIlIIII[36] = 30 + 92 - 93 + 122 ^ 86 + 23 - -24 + 48;
        SquireChambersPlugin.lIlIIIIlIIII[37] = 38 + 173 - 63 + 80 ^ 151 + 166 - 234 + 116;
        SquireChambersPlugin.lIlIIIIlIIII[38] = 71 + 155 - 57 + 56 ^ 63 + 149 - 110 + 95;
        SquireChambersPlugin.lIlIIIIlIIII[39] = 0x73 ^ 0x56;
        SquireChambersPlugin.lIlIIIIlIIII[40] = 0x53 ^ 0x75;
        SquireChambersPlugin.lIlIIIIlIIII[41] = 0xA1 ^ 0x9B ^ (0x3B ^ 0x26);
        SquireChambersPlugin.lIlIIIIlIIII[42] = 0xAC ^ 0x84;
        SquireChambersPlugin.lIlIIIIlIIII[43] = 0x1A ^ 0x33;
        SquireChambersPlugin.lIlIIIIlIIII[44] = 0x7E ^ 0x54;
        SquireChambersPlugin.lIlIIIIlIIII[45] = 0xEC ^ 0xC7;
        SquireChambersPlugin.lIlIIIIlIIII[46] = 0x76 ^ 0x5A;
        SquireChambersPlugin.lIlIIIIlIIII[47] = 0x5F ^ 0x72;
        SquireChambersPlugin.lIlIIIIlIIII[48] = 0x68 ^ 0x46;
        SquireChambersPlugin.lIlIIIIlIIII[49] = 0x94 ^ 0x84 ^ (0xFF ^ 0xC0);
        SquireChambersPlugin.lIlIIIIlIIII[50] = 0xC0 ^ 0x83 ^ (0x25 ^ 0x56);
        SquireChambersPlugin.lIlIIIIlIIII[51] = 0x27 ^ 0x5B ^ (0x3E ^ 0x73);
        SquireChambersPlugin.lIlIIIIlIIII[52] = 0x4E ^ 0x79 ^ (0xA3 ^ 0xA7);
        SquireChambersPlugin.lIlIIIIlIIII[53] = 0x28 ^ 0x6E ^ (0xCD ^ 0xBF);
        SquireChambersPlugin.lIlIIIIlIIII[54] = 162 + 211 - 264 + 137 ^ 8 + 130 - 122 + 179;
        SquireChambersPlugin.lIlIIIIlIIII[55] = 0x6E ^ 0x58;
        SquireChambersPlugin.lIlIIIIlIIII[56] = 0xB2 ^ 0x85;
        SquireChambersPlugin.lIlIIIIlIIII[57] = -(0xFFFFAE21 & 0x7DFF) & (0xFFFFFFF7 & 0x7DBD);
        SquireChambersPlugin.lIlIIIIlIIII[58] = -(0xFFFFAF63 & 0x7EDD) & (0xFFFFFF7F & Short.MAX_VALUE);
        SquireChambersPlugin.lIlIIIIlIIII[59] = -(0xFFFFDAFD & 0x7D4F) & (0xFFFFFDFF & 0x5FDF);
        SquireChambersPlugin.lIlIIIIlIIII[60] = -1;
        SquireChambersPlugin.lIlIIIIlIIII[61] = 0xFFFFB7FD & 0x5D3A;
        SquireChambersPlugin.lIlIIIIlIIII[62] = 0x23 ^ 0x4B;
        SquireChambersPlugin.lIlIIIIlIIII[63] = -(0xFFFFD035 & 0x7FDB) & (0xFFFFFFFF & 0x7FD7);
        SquireChambersPlugin.lIlIIIIlIIII[64] = -(0x55 ^ 0x4A);
        SquireChambersPlugin.lIlIIIIlIIII[65] = 0xFFFFCFAC & 0x317F;
        SquireChambersPlugin.lIlIIIIlIIII[66] = 0xFFFFD9FF & 0x7793;
        SquireChambersPlugin.lIlIIIIlIIII[67] = 0xFFFFBDF4 & 0x775F;
        SquireChambersPlugin.lIlIIIIlIIII[68] = -(0xFFFFBBDB & 0x6CF6) & (0xFFFFFAFB & Short.MAX_VALUE);
        SquireChambersPlugin.lIlIIIIlIIII[69] = -(0xFFFFF5BD & 0xFEB) & (0xFFFFDFFF & 0x77FF);
        SquireChambersPlugin.lIlIIIIlIIII[70] = -(0xFFFFDED7 & 0x252A) & (0xFFFFFE7B & 0x579F);
        SquireChambersPlugin.lIlIIIIlIIII[71] = -(0xFFFFAFEF & 0x59F3) & (0xFFFFDFFF & 0x7BFF);
        SquireChambersPlugin.lIlIIIIlIIII[72] = 0xFFFFDB39 & 0x76E6;
        SquireChambersPlugin.lIlIIIIlIIII[73] = -(0xFFFFF3E3 & 0x2DFF) & (0xFFFFFBF6 & 0x77FF);
        SquireChambersPlugin.lIlIIIIlIIII[74] = 0xFFFFD2DF & 0x7F37;
        SquireChambersPlugin.lIlIIIIlIIII[75] = -(121 + 31 - 133 + 224) & (0xFFFFFAF7 & 0x57FF);
        SquireChambersPlugin.lIlIIIIlIIII[76] = -(0xFFFFD5F1 & 0x2FCF) & (0xFFFFDFDF & 0x77EB);
        SquireChambersPlugin.lIlIIIIlIIII[77] = 0xFFFFF63B & 0x5BF7;
        SquireChambersPlugin.lIlIIIIlIIII[78] = 0xFFFFDF8F & 0x7278;
    }

    protected void onStart() {
        BankLoadout var47;
        SquireChambersPlugin var24;
        int n2;
        if (!SquireChambersPlugin.llIlIlIIlIIllI(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u_Unknown.be() ? 1 : 0) || SquireChambersPlugin.llIlIlIIlIIlll(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u_Unknown.bf() ? 1 : 0)) {
            n2 = lIlIIIIlIIII[3];
            0;
            if ((0x58 ^ 0x5C) < -1) {
                return;
            }
        } else {
            n2 = lIlIIIIlIIII[0];
        }
        this.af = n2;
        var24.N.add((Overlay)var24.O);
        0;
        var24.Z.register((Object)var24.V);
        var24.V.T();
        var24.Z.register((Object)var24.W);
        var24.Z.register((Object)var24.X);
        var24.Z.register((Object)var24.Y);
        var24.Y.T();
        var24.R.invokeLater(var24::t);
        var24.ai = lIlIIIIlIIII[0];
        var24.aj = lIlIIIIlIIII[0];
        if (SquireChambersPlugin.llIlIlIIlIlIII(var24.r(), lIlIIIIlIIII[5])) {
            var24.forceStop();
            Log.error((String)lIlIIIIIllll[lIlIIIIlIIII[0]]);
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIlIII(var24.s(), lIlIIIIlIIII[4])) {
            var24.forceStop();
            Log.error((String)lIlIIIIIllll[lIlIIIIlIIII[3]]);
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var24.k.enableGuardians() ? 1 : 0) && SquireChambersPlugin.llIlIlIIlIIlll((var47 = var24.q()).getInventorySetup().contains(itemComposition -> itemComposition.getName().toLowerCase().contains(lIlIIIIIllll[lIlIIIIlIIII[31]])) ? 1 : 0)) {
            var24.forceStop();
            Log.error((String)lIlIIIIIllll[lIlIIIIlIIII[4]]);
            return;
        }
    }

    public boolean G() {
        return this.af;
    }

    @Subscribe(priority=1000.0f)
    public void a(ExperienceGained experienceGained) {
        if (SquireChambersPlugin.llIlIlIIlIlIIl(experienceGained.getSkill(), Skill.WOODCUTTING)) {
            this.ag = Static.getClient().getTickCount();
        }
    }

    private static boolean llIlIlIIlIlllI(Object object, Object object2) {
        return object != object2;
    }

    public void b(n n2) {
        this.al = n2;
    }

    /*
     * WARNING - void declaration
     */
    private void t() {
        void var1_1;
        Object var41;
        int n2;
        int n3;
        SquireChambersPlugin var65;
        if (SquireChambersPlugin.llIlIlIIlIlllI(this.u.getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIlIIl((Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u_Unknown.bh(), (Object)w.REACHED_BOTTOM)) {
            var65.b(s.ba());
            var65.a(s.bc());
            var65.c(s.bb());
            var65.d(s.b(s.aZ()));
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIlIlI(var65.u.getVarbitValue(lIlIIIIlIIII[61]), lIlIIIIlIIII[3])) {
            n3 = lIlIIIIlIIII[3];
            0;
            if (((0x20 ^ 0x7C) & ~(0x73 ^ 0x2F)) != 0) {
                return;
            }
        } else {
            var65.ac = lIlIIIIlIIII[0];
            n3 = var65.ac ? 1 : 0;
        }
        if (SquireChambersPlugin.llIlIlIIlIIlll(var65.ac ? 1 : 0)) {
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(var65.aa)) {
            n2 = lIlIIIIlIIII[3];
            0;
            if ((0x1B ^ 0x5E ^ (0x87 ^ 0xC6)) > (117 + 112 - 226 + 125 ^ 12 + 105 - 60 + 75)) {
                return;
            }
        } else {
            n2 = lIlIIIIlIIII[0];
        }
        int lllllllllllllllIlllIIIllllIIlllI = n2;
        var65.aa = var65.a(var65.aa);
        if (SquireChambersPlugin.llIlIlIIlIllII(var65.aa)) {
            z.debug(lIlIIIIIllll[lIlIIIIlIIII[15]]);
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(var65.aa.j())) {
            var41 = var65.P.a(var65.aa.d());
            if (SquireChambersPlugin.llIlIlIIlIllII(var41)) {
                z.debug(lIlIIIIIllll[lIlIIIIlIIII[16]]);
                var65.aa = null;
                return;
            }
            var65.aa.a((K)var41);
        }
        var41 = var65.aa.c();
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.R_Unknown.b(var41);
        0;
        var65.aa.a((N[])var41);
        var65.ab = n.c(var65.aa);
        var65.aj = lIlIIIIlIIII[0];
        var65.ai = lIlIIIIlIIII[0];
        var65.V.T();
        if (SquireChambersPlugin.llIlIlIIlIIllI(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u_Unknown.bf() ? 1 : 0)) {
            var65.b(s.ba());
            var65.a(s.bc());
            var65.c(s.bb());
            var65.d(s.b(s.aZ()));
            0;
            if (3 == 0) {
                return;
            }
        } else {
            var65.ao = null;
            var65.an = null;
            var65.ap = null;
            var65.aq = null;
        }
        Log.error((String)lIlIIIIIllll[lIlIIIIlIIII[17]]);
        this.Z.post((Object)new g(this.aa, (boolean)var1_1));
    }

    public void c(EquipmentSetup equipmentSetup) {
        this.ap = equipmentSetup;
    }

    private static boolean llIlIlIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIIlIllII(Object object) {
        return object == null;
    }

    public n M() {
        return this.al;
    }

    public i y() {
        return this.V;
    }

    /*
     * WARNING - void declaration
     */
    private N b(Tile tile) {
        void var53;
        int n2 = this.u.getInstanceTemplateChunks()[tile.getPlane()][tile.getSceneLocation().getX() / lIlIIIIlIIII[10]][tile.getSceneLocation().getY() / lIlIIIIlIIII[10]];
        InstanceTemplates instanceTemplates = InstanceTemplates.findMatch((int)n2);
        if (SquireChambersPlugin.llIlIlIIlIllII(instanceTemplates)) {
            return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.EMPTY;
        }
        switch (e.as[var53.ordinal()]) {
            case 1: 
            case 2: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.START;
            }
            case 3: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.END;
            }
            case 4: 
            case 5: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.SCAVENGERS;
            }
            case 6: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.SHAMANS;
            }
            case 7: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.VASA;
            }
            case 8: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.VANGUARDS;
            }
            case 9: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.ICE_DEMON;
            }
            case 10: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.THIEVING;
            }
            case 11: 
            case 12: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.FARMING;
            }
            case 13: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.MUTTADILES;
            }
            case 14: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.MYSTICS;
            }
            case 15: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.TEKTON;
            }
            case 16: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.TIGHTROPE;
            }
            case 17: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.GUARDIANS;
            }
            case 18: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.CRABS;
            }
            case 19: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.VESPULA;
            }
        }
        return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.EMPTY;
    }

    /*
     * WARNING - void declaration
     */
    private void a(ChatMessage chatMessage, String string) {
        void var6_7;
        LayoutRoom[] var27;
        String var21;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (SquireChambersPlugin.llIlIlIIlIIllI(chatMessageType.equals((Object)ChatMessageType.PRIVATECHATOUT) ? 1 : 0)) {
            String string2 = this.u.getLocalPlayer().getName();
            0;
            if (2 < 0) {
                return;
            }
        } else {
            void var54;
            var21 = Text.sanitize((String)var54.getName());
        }
        try {
            SquireChambersPlugin var61;
            var27 = var61.S.getLayout(var21);
            0;
        }
        catch (IOException var4) {
            z.debug(lIlIIIIIllll[lIlIIIIlIIII[18]], (Throwable)var4);
            return;
        }
        if (2 <= -1) {
            return;
        }
        if (!SquireChambersPlugin.llIlIlIIlIllIl(var27) || SquireChambersPlugin.llIlIlIIlIIlll(var27.length)) {
            return;
        }
        String var4 = Joiner.on((String)lIlIIIIIllll[lIlIIIIlIIII[19]]).join(Arrays.stream(var27).map(layoutRoom -> c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum.valueOf(layoutRoom.name())).filter(n2 -> {
            boolean bl2;
            if (!SquireChambersPlugin.llIlIlIIlIlllI((Object)n2.bY(), (Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PEnum.COMBAT) || SquireChambersPlugin.llIlIlIIlIlIIl((Object)n2.bY(), (Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.PEnum.PUZZLE)) {
                bl2 = lIlIIIIlIIII[3];
                0;
                
                }
            } else {
                bl2 = lIlIIIIlIIII[0];
            }
            return bl2;
        }).map(N::bX).toArray());
        if (SquireChambersPlugin.llIlIlIIlIllll(var4.length(), lIlIIIIlIIII[65])) {
            z.debug(lIlIIIIIllll[lIlIIIIlIIII[20]], (Object)var4.length());
            return;
        }
        String string3 = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append(lIlIIIIIllll[lIlIIIIlIIII[21]]).append(ChatColorType.NORMAL).append((String)var6_7).build();
        z.debug(lIlIIIIIllll[lIlIIIIlIIII[22]], (Object)string3);
        MessageNode messageNode = chatMessage.getMessageNode();
        messageNode.setRuneLiteFormatMessage(string3);
        this.u.refreshChat();
    }

    private static boolean llIlIlIIllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ConfigChanged configChanged) {
        void var36;
        if (SquireChambersPlugin.llIlIlIIlIIlll(configChanged.getGroup().equals(lIlIIIIIllll[lIlIIIIlIIII[5]]) ? 1 : 0)) {
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var36.getKey().equals(lIlIIIIIllll[lIlIIIIlIIII[6]]) ? 1 : 0)) {
            SquireChambersPlugin var43;
            var43.u();
            return;
        }
    }

    private static boolean llIlIlIIlIllIl(Object object) {
        return object != null;
    }

    void b(a a2) {
        this.aa = a2;
    }

    public n L() {
        return this.ak;
    }

    public List<n> D() {
        return this.ab;
    }

    private static String llIlIlIIlIIIll(String var5, String var29) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var29.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIlIIIIlIIII[4], var10);
            return new String(var11.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var34) {
            var34.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public int r() {
        void var35;
        SquireChambersPlugin var23;
        int n2 = lIlIIIIlIIII[0];
        if (SquireChambersPlugin.llIlIlIIlIIllI(this.k.enableGuardians() ? 1 : 0)) {
            ++n2;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var23.k.enableTekton() ? 1 : 0)) {
            ++var35;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var23.k.enableMuttadiles() ? 1 : 0)) {
            ++var35;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var23.k.enableVasa() ? 1 : 0)) {
            ++var35;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var23.k.enableVespula() ? 1 : 0)) {
            ++var35;
        }
        return n2;
    }

    private static boolean llIlIlIIlIIllI(int n2) {
        return n2 != 0;
    }

    public EquipmentSetup R() {
        return this.aq;
    }

    @Provides
    SquireChambersConfig a(ConfigManager configManager) {
        return (SquireChambersConfig)configManager.getConfig(SquireChambersConfig.class);
    }

    /*
     * WARNING - void declaration
     */
    private Point v() {
        Tile[][] tileArray = this.u.getScene().getTiles()[lIlIIIIlIIII[5]];
        int var16 = lIlIIIIlIIII[0];
        while (SquireChambersPlugin.llIlIlIIlIlIII(var16, lIlIIIIlIIII[62])) {
            int var39 = lIlIIIIlIIII[0];
            while (SquireChambersPlugin.llIlIlIIlIlIII(var39, lIlIIIIlIIII[62])) {
                void var1;
                if (SquireChambersPlugin.llIlIlIIlIllIl(var1[var16][var39])) {
                    if (SquireChambersPlugin.llIlIlIIlIllII(var1[var16][var39].getWallObject())) {
                        0;
                        if ((106 + 61 - 57 + 86 ^ 87 + 117 - 35 + 24) == 0) {
                            return null;
                        }
                    } else if (SquireChambersPlugin.llIlIlIIlIlIlI(var1[var16][var39].getWallObject().getId(), lIlIIIIlIIII[63])) {
                        return var1[var16][var39].getSceneLocation();
                    }
                }
                ++var39;
                0;
                if ((1 & (1 ^ -1)) == ((113 + 214 - 230 + 149 ^ 38 + 133 - 166 + 182) & (240 + 96 - 197 + 113 ^ 59 + 58 - 26 + 86 ^ -1))) continue;
                return null;
            }
            ++var16;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return null;
    }

    public h B() {
        return this.Y;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIIIIlIIII[2]];
        classArray[SquireChambersPlugin.lIlIIIIlIIII[0]] = StartRoomTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[3]] = ScavangersTopFloorTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[4]] = ScavangersPrepTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[5]] = FarmingTopFloorTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[6]] = FinishingFloorTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[7]] = ThievingTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[8]] = TightropeTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[9]] = IceDemonTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[10]] = CrabsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[11]] = PrayerFlickingTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[12]] = OlmMageHandTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[13]] = OlmMeleeHandTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[14]] = PrayerFlickingTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[15]] = DodgingFalligCrystalsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[16]] = OlmPortalsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[17]] = OlmMeleeSpecTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[18]] = TryingOlmHeadTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[19]] = EnterOlmRoomTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[20]] = LootChestTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[21]] = PrepGettingToolsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[22]] = PrepFarmingTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[23]] = PrepGetVialsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[24]] = PrepDepositInventoryTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[25]] = PrepPickHerbsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[26]] = PrepMakePotsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[27]] = PrepDroppingToolsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[28]] = PrepWithdrawOlmGearTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[29]] = PrepGetSeedsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[30]] = GuardiansTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[31]] = MuttadilesTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[32]] = TektonTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[33]] = MysticsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[34]] = ShamansTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[35]] = VasaTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[36]] = VespulaTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[37]] = V.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[38]] = W.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[39]] = T.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[40]] = HoppingToDifferentWorldTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[41]] = LeaveRaidTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[42]] = ConfigurePartyTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[43]] = MakingPartyTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[44]] = WithdrawingItemsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[45]] = EmptyPrivateStorageTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[46]] = Z.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[47]] = X.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[48]] = EnablingRunTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[49]] = EatingFoodTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[50]] = DrinkStaminaTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[51]] = DrinkOverloadTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[1]] = RestoringPrayerTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[52]] = DroppingSpareItemsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[53]] = PickSeedsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[54]] = ManageOverloadsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[55]] = PickupEnhanceTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[56]] = PickupDroppedBrewTask.class;
        return classArray;
    }

    private static String llIlIlIIlIIIIl(String var52, String var17) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIIII[10]), "DES");
            Cipher var63 = Cipher.getInstance("DES");
            var63.init(lIlIIIIlIIII[4], var18);
            return new String(var63.doFinal(Base64.getDecoder().decode(var52.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var49) {
            var49.printStackTrace();
            return null;
        }
    }

    public SquireChambersPlugin() {
        this.ab = new ArrayList<n>();
        this.ag = lIlIIIIlIIII[0];
        this.ah = lIlIIIIlIIII[1];
        this.ai = lIlIIIIlIIII[0];
        this.aj = lIlIIIIlIIII[0];
        this.an = null;
        this.ao = null;
        this.ap = null;
        this.aq = null;
    }

    private static void llIlIlIIlIIlII() {
        lIlIIIIIllll = new String[lIlIIIIlIIII[36]];
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[0]] = SquireChambersPlugin."Not enough Combat Rooms selected, please select more Combat Rooms";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[3]] = SquireChambersPlugin."Not enough Puzzle Rooms selected, please select more Puzzle Rooms";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[4]] = SquireChambersPlugin."Guardians rooms is enabled but no pickaxe found in Bank Loadout";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[5]] = SquireChambersPlugin."squireraids";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[6]] = SquireChambersPlugin."raidsTimer";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[7]] = SquireChambersPlugin."deposited grubs";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[8]] = SquireChambersPlugin."deposited grubs";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[9]] = SquireChambersPlugin."Raid party has been dissolved";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[10]] = SquireChambersPlugin."IN RAID CHANGED";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[11]] = SquireChambersPlugin."Scouting raid";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[12]] = SquireChambersPlugin."Raid has ended";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[13]] = SquireChambersPlugin."level complete!";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[14]] = SquireChambersPlugin."Congratulations - your raid is complete!";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[15]] = SquireChambersPlugin."Failed to build raid";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[16]] = SquireChambersPlugin."Could not find layout match";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[17]] = SquireChambersPlugin."Scouting for raid";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[18]] = SquireChambersPlugin."unable to lookup layout";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[19]] = SquireChambersPlugin.", ";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[20]] = SquireChambersPlugin."layout message too long! {}";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[21]] = SquireChambersPlugin."Layout: ";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[22]] = SquireChambersPlugin."Setting response {}";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[23]] = SquireChambersPlugin."Eat";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[24]] = SquireChambersPlugin."Chambers";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[25]] = SquireChambersPlugin."Tekton";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[26]] = SquireChambersPlugin."Revitalisation";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[27]] = SquireChambersPlugin."Super restore";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[28]] = SquireChambersPlugin."Xeric's";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[29]] = SquireChambersPlugin."Saradomin brew";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[30]] = SquireChambersPlugin."unable to submit layout";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[31]] = SquireChambersPlugin."pickaxe";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[32]] = SquireChambersPlugin."Congratulations - your raid is complete!";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[33]] = SquireChambersPlugin."level complete!";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[34]] = SquireChambersPlugin."###.##";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[35]] = SquireChambersPlugin."#,###";
    }

    public void a(n n2) {
        this.ak = n2;
    }

    private static String llIlIlIIlIIIlI(String var30, String var62) {
        var30 = new String(Base64.getDecoder().decode(var30.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var2 = new StringBuilder();
        char[] var9 = var62.toCharArray();
        int var6 = lIlIIIIlIIII[0];
        char[] var32 = var30.toCharArray();
        int var51 = var32.length;
        int var38 = lIlIIIIlIIII[0];
        while (SquireChambersPlugin.llIlIlIIlIlIII(var38, var51)) {
            char var8 = var32[var38];
            var2.append((char)(var8 ^ var9[var6 % var9.length]));
            0;
            ++var6;
            ++var38;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var2);
    }

    public int J() {
        return this.ai;
    }

    public void b(EquipmentSetup equipmentSetup) {
        this.ao = equipmentSetup;
    }

    public void configure(Binder binder) {
        binder.bind(d.class);
        0;
    }

    public a C() {
        return this.aa;
    }

    /*
     * WARNING - void declaration
     */
    public int s() {
        void var44;
        SquireChambersPlugin var31;
        int n2 = lIlIIIIlIIII[0];
        if (SquireChambersPlugin.llIlIlIIlIIllI(this.k.enableCrabs() ? 1 : 0)) {
            ++n2;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var31.k.enableThieving() ? 1 : 0)) {
            ++var44;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var31.k.enableIceDemon() ? 1 : 0)) {
            ++var44;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var31.k.enableTightrope() ? 1 : 0)) {
            ++var44;
        }
        return n2;
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        if (SquireChambersPlugin.llIlIlIIlIIlll(lootReceived.getName().contains(lIlIIIIIllll[lIlIIIIlIIII[24]]) ? 1 : 0) && SquireChambersPlugin.llIlIlIIlIIlll(lootReceived.getName().contains(lIlIIIIIllll[lIlIIIIlIIII[25]]) ? 1 : 0)) {
            return;
        }
        Collection collection = lootReceived.getItems();
        ItemStack itemStack2 = collection.stream().filter(itemStack -> J.contains(itemStack.getId())).findFirst().orElse(null);
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.al_Unknown.a(itemStack2, collection, this.k.anonymize());
    }

    private static boolean llIlIlIIllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    public int I() {
        return this.ah;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireChambersPlugin.llIlIlIIlIIllI(this.ac ? 1 : 0) && SquireChambersPlugin.llIlIlIIlIlIIl(chatMessage.getType(), ChatMessageType.FRIENDSCHATNOTIFICATION)) {
            SquireChambersPlugin var45;
            void var12;
            String string = Text.removeTags((String)chatMessage.getMessage());
            if (SquireChambersPlugin.llIlIlIIlIllIl((Object)this.ae) && SquireChambersPlugin.llIlIlIIlIIllI(string.contains(lIlIIIIIllll[lIlIIIIlIIII[13]]) ? 1 : 0)) {
                this.ae.n();
            }
            if (SquireChambersPlugin.llIlIlIIlIIllI(var12.startsWith(lIlIIIIIllll[lIlIIIIlIIII[14]]) ? 1 : 0) && SquireChambersPlugin.llIlIlIIlIllIl((Object)var45.ae)) {
                var45.ae.o();
                var45.ae.a(lIlIIIIlIIII[3]);
            }
        }
    }

    static {
        SquireChambersPlugin.llIlIlIIlIIlIl();
        SquireChambersPlugin.llIlIlIIlIIlII();
        F = lIlIIIIIllll[lIlIIIIlIIII[32]];
        D = lIlIIIIlIIII[6];
        E = lIlIIIIIllll[lIlIIIIlIIII[33]];
        B = lIlIIIIlIIII[4];
        I = lIlIIIIlIIII[65];
        A = lIlIIIIlIIII[5];
        C = lIlIIIIlIIII[10];
        z = LoggerFactory.getLogger(SquireChambersPlugin.class);
        G = new DecimalFormat(lIlIIIIIllll[lIlIIIIlIIII[34]]);
        H = new DecimalFormat(lIlIIIIIllll[lIlIIIIlIIII[35]]);
        Object[] objectArray = new Integer[lIlIIIIlIIII[8]];
        objectArray[SquireChambersPlugin.lIlIIIIlIIII[0]] = lIlIIIIlIIII[73];
        objectArray[SquireChambersPlugin.lIlIIIIlIIII[3]] = lIlIIIIlIIII[74];
        objectArray[SquireChambersPlugin.lIlIIIIlIIII[4]] = lIlIIIIlIIII[75];
        objectArray[SquireChambersPlugin.lIlIIIIlIIII[5]] = lIlIIIIlIIII[76];
        objectArray[SquireChambersPlugin.lIlIIIIlIIII[6]] = lIlIIIIlIIII[77];
        objectArray[SquireChambersPlugin.lIlIIIIlIIII[7]] = lIlIIIIlIIII[78];
        J = ImmutableSet.of((Object)lIlIIIIlIIII[67], (Object)lIlIIIIlIIII[68], (Object)lIlIIIIlIIII[69], (Object)lIlIIIIlIIII[70], (Object)lIlIIIIlIIII[71], (Object)lIlIIIIlIIII[72], (Object[])objectArray);
    }

    public k A() {
        return this.X;
    }

    public int H() {
        return this.ag;
    }

    public void f(int n2) {
        this.ai = n2;
    }

    public void b(boolean bl2) {
        this.af = bl2;
    }

    public void h(int n2) {
        this.am = n2;
    }

    public void a(EquipmentSetup equipmentSetup) {
        this.an = equipmentSetup;
    }

    private static boolean llIlIlIIlIllll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        void var37;
        SquireChambersPlugin var3;
        if (!SquireChambersPlugin.llIlIlIIlIlIIl(this.u.getGameState(), GameState.LOGGED_IN) || SquireChambersPlugin.llIlIlIIlIlllI(this.ar, GameState.CONNECTION_LOST)) {
            // empty if block
        }
        if (SquireChambersPlugin.llIlIlIIlIlIIl(var3.u.getGameState(), GameState.LOGIN_SCREEN)) {
            var3.b(lIlIIIIlIIII[3]);
        }
        if (SquireChambersPlugin.llIlIlIIlIllIl(var37)) {
            var3.ar = var3.u.getGameState();
        }
    }

    public void d(EquipmentSetup equipmentSetup) {
        this.aq = equipmentSetup;
    }

    private static boolean llIlIlIIlIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=1000.0f)
    public void a(InventoryChanged inventoryChanged) {
        int n2 = inventoryChanged.getAmount();
        int n3 = inventoryChanged.getItemId();
        if (SquireChambersPlugin.llIlIlIIlIlIIl(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_REMOVED)) {
            void var33;
            if (SquireChambersPlugin.llIlIlIIlIlIlI(n3, lIlIIIIlIIII[57])) {
                System.out.print(lIlIIIIIllll[lIlIIIIlIIII[7]]);
                this.ai += n2;
            }
            if (SquireChambersPlugin.llIlIlIIlIlIlI((int)var33, lIlIIIIlIIII[58])) {
                void var40;
                System.out.print(lIlIIIIIllll[lIlIIIIlIIII[8]]);
                lllllllllllllllIlllIIIlllllIlIII.aj += var40;
            }
        }
    }

    private void u() {
        if (SquireChambersPlugin.llIlIlIIlIllIl((Object)this.ae) && SquireChambersPlugin.llIlIlIIlIIlll(this.ac ? 1 : 0)) {
            this.M.removeInfoBox((InfoBox)this.ae);
            this.ae = null;
        }
    }

    public l z() {
        return this.W;
    }

    public EquipmentSetup O() {
        return this.an;
    }

    private void w() {
        this.aa = null;
        this.u();
        this.Z.post((Object)new f());
    }

    private BankLoadout q() {
        return (BankLoadout)this.k.bankLoadout().selected(BankLoadout.class);
    }

    /*
     * WARNING - void declaration
     */
    private Integer a(Point point) {
        void var3_3;
        void var2_4;
        int var22;
        int var50;
        void var15;
        SquireChambersPlugin var64;
        if (!SquireChambersPlugin.llIlIlIIlIllll(lIlIIIIlIIII[62], point.getX() + lIlIIIIlIIII[34]) || SquireChambersPlugin.llIlIlIIllIIIl(lIlIIIIlIIII[62], point.getY() + lIlIIIIlIIII[34])) {
            return null;
        }
        Tile[][] var25 = var64.u.getScene().getTiles()[lIlIIIIlIIII[5]];
        if (SquireChambersPlugin.llIlIlIIlIllII(var25[var15.getX()][var15.getY() + lIlIIIIlIIII[34]])) {
            var50 = lIlIIIIlIIII[0];
            0;
            if (((44 + 79 - 60 + 78 ^ 45 + 59 - 102 + 160) & (0x26 ^ 0x48 ^ (0x74 ^ 0x35) ^ -1)) < 0) {
                return null;
            }
        } else {
            var50 = lIlIIIIlIIII[3];
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(var25[var15.getX() + lIlIIIIlIIII[34]][var15.getY()])) {
            var22 = lIlIIIIlIIII[5];
            0;
            if (-3 > 0) {
                return null;
            }
        } else {
            int var55;
            var22 = lIlIIIIlIIII[0];
            while (SquireChambersPlugin.llIlIlIIlIlIII(var22, lIlIIIIlIIII[5]) && SquireChambersPlugin.llIlIlIIllIIlI(var55 = var15.getX() - lIlIIIIlIIII[3] - lIlIIIIlIIII[34] * var22)) {
                if (SquireChambersPlugin.llIlIlIIlIllII(var25[var55][var15.getY()])) {
                    0;
                    if (-1 < 3) break;
                    return null;
                }
                ++var22;
                0;
                
                return null;
            }
        }
        return (int)(var2_4 + var3_3 * lIlIIIIlIIII[6]);
    }

    public int F() {
        return this.ad;
    }

    private static boolean llIlIlIIllIIlI(int n2) {
        return n2 >= 0;
    }

    public boolean E() {
        return this.ac;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        void var42;
        SquireChambersPlugin var7;
        if (SquireChambersPlugin.llIlIlIIlIlIlI(varbitChanged.getVarpId(), lIlIIIIlIIII[59])) {
            int n2 = this.ac;
            int n3 = this.ad;
            this.ad = varbitChanged.getValue();
            if (SquireChambersPlugin.llIlIlIIlIlIIl(this.u.getGameState(), GameState.LOGGED_IN) && (!SquireChambersPlugin.llIlIlIIlIIllI(n2) || SquireChambersPlugin.llIlIlIIlIlIll(n3, lIlIIIIlIIII[60]) && SquireChambersPlugin.llIlIlIIlIlIll(this.ad, lIlIIIIlIIII[60]) && SquireChambersPlugin.llIlIlIIlIlIll(n3, this.ad))) {
                z.debug(lIlIIIIIllll[lIlIIIIlIIII[9]]);
                var7.w();
            }
        }
        if (SquireChambersPlugin.llIlIlIIlIlIlI(var42.getVarbitId(), lIlIIIIlIIII[61])) {
            int n4;
            System.out.println(lIlIIIIIllll[lIlIIIIlIIII[10]]);
            if (SquireChambersPlugin.llIlIlIIlIlIlI(var42.getValue(), lIlIIIIlIIII[3])) {
                n4 = lIlIIIIlIIII[3];
                0;
                if (-3 > 0) {
                    return;
                }
            } else {
                n4 = lIlIIIIlIIII[0];
            }
            int n5 = n4;
            var7.ac = n5;
            if (SquireChambersPlugin.llIlIlIIlIlIIl(var7.u.getGameState(), GameState.LOGGED_IN)) {
                if (SquireChambersPlugin.llIlIlIIlIIllI(n5) && SquireChambersPlugin.llIlIlIIlIllII(var7.aa)) {
                    System.out.println(lIlIIIIIllll[lIlIIIIlIIII[11]]);
                    var7.t();
                    0;
                    if ((9 ^ 0xC) <= 0) {
                        return;
                    }
                } else if (SquireChambersPlugin.llIlIlIIlIlIlI(var7.ad, lIlIIIIlIIII[60])) {
                    z.debug(lIlIIIIIllll[lIlIIIIlIIII[12]]);
                    var7.w();
                }
            }
        }
    }

    public EquipmentSetup Q() {
        return this.ap;
    }

    private static boolean llIlIlIIlIlIII(int n2, int n3) {
        return n2 < n3;
    }
}

