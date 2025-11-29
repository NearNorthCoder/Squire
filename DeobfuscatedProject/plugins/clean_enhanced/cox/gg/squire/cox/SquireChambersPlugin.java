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

import gg.squire.cox.CoxManager;
import gg.squire.cox.CoxManager;
import gg.squire.cox.GameEnum8;
import gg.squire.cox.GameEnum4;
import gg.squire.cox.RHelper;
import gg.squire.cox.SettingUpAutoRoomsTask;
import gg.squire.cox.ScoutingForARaidTask;
import gg.squire.cox.SettingUpRaidTask;
import gg.squire.cox.TestTask;
import gg.squire.cox.RechargingTridentTask;
import gg.squire.cox.CoxManager;
import gg.squire.cox.GuardiansTask;
import gg.squire.cox.MuttadilesTask;
import gg.squire.cox.MysticsTask;
import gg.squire.cox.ShamansTask;
import gg.squire.cox.TektonTask;
import gg.squire.cox.VasaTask;
import gg.squire.cox.VespulaTask;
import gg.squire.cox.EnterOlmRoomTask;
import gg.squire.cox.DodgingFalligCrystalsTask;
import gg.squire.cox.PrayerFlickingTask;
import gg.squire.cox.TryingOlmHeadTask;
import gg.squire.cox.LootChestTask;
import gg.squire.cox.OlmMageHandTask;
import gg.squire.cox.OlmMeleeHandTask;
import gg.squire.cox.OlmPortalsTask;
import gg.squire.cox.OlmMeleeSpecTask;
import gg.squire.cox.PrayerFlickingTask;
import gg.squire.cox.FinishingFloorTask;
import gg.squire.cox.FarmingTopFloorTask;
import gg.squire.cox.ScavangersPrepTask;
import gg.squire.cox.ScavangersTopFloorTask;
import gg.squire.cox.StartRoomTask;
import gg.squire.cox.PrepDepositInventoryTask;
import gg.squire.cox.PrepDroppingToolsTask;
import gg.squire.cox.WithdrawingItemsTask;
import gg.squire.cox.DrinkOverloadTask;
import gg.squire.cox.DrinkStaminaTask;
import gg.squire.cox.DroppingSpareItemsTask;
import gg.squire.cox.EatingFoodTask;
import gg.squire.cox.EnablingRunTask;
import gg.squire.cox.PickupDroppedBrewTask;
import gg.squire.cox.PickupEnhanceTask;
import gg.squire.cox.ManageOverloadsTask;
import gg.squire.cox.PickSeedsTask;
import gg.squire.cox.RestoringPrayerTask;
import gg.squire.cox.CoxManager;
import gg.squire.cox.EmptyPrivateStorageTask;
import gg.squire.cox.ConfigurePartyTask;
import gg.squire.cox.HoppingToDifferentWorldTask;
import gg.squire.cox.LeaveRaidTask;
import gg.squire.cox.MakingPartyTask;
import gg.squire.cox.PrepGetSeedsTask;
import gg.squire.cox.PrepGettingToolsTask;
import gg.squire.cox.PrepGetVialsTask;
import gg.squire.cox.PrepMakePotsTask;
import gg.squire.cox.PrepPickHerbsTask;
import gg.squire.cox.PrepFarmingTask;
import gg.squire.cox.PrepWithdrawOlmGearTask;
import gg.squire.cox.CrabsTask;
import gg.squire.cox.IceDemonTask;
import gg.squire.cox.ThievingTask;
import gg.squire.cox.TightropeTask;
import gg.squire.cox.CoxManager;
import gg.squire.cox.CoxManager;
import gg.squire.cox.EHelper;
import gg.squire.cox.FHelper;
import gg.squire.cox.GHelper;
import gg.squire.cox.CoxManager;
import gg.squire.cox.CoxManager;
import gg.squire.cox.CoxManager;
import gg.squire.cox.CoxManager;
import gg.squire.cox.NHelper;
import gg.squire.cox.CoxManager;
import gg.squire.cox.CoxManager;
import gg.squire.cox.GameEnum7;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Binder;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.cox.SquireChambersConfig;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
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
    private static final  DecimalFormat G;
    private  int ah;
    @Inject
    private  Client u;
    private static final  String F;
    @Inject
    private  i V;
    private  int ai;
    @Inject
    private  ScheduledExecutorService T;
    @Inject
    private  d O;
    
     n ak;
    @Inject
    private  ImageCapture U;
     List<n> ab;
    @Inject
    private  OverlayManager N;
    @Inject
    private  SquireChambersConfig k;
    @Inject
    private  h Y;
    @Inject
    private  SpriteManager Q;
    private  boolean af;
    @Inject
    private  L P;
    private static final  Set<Integer> J;
    private  int aj;
    @Inject
    private  ChatMessageManager L;
     int am;
     EquipmentSetup ao;
     EquipmentSetup an;
    @Inject
    private  ChatClient S;
    private  c ae;
    @Inject
    private  k X;
    @Inject
    private  RuneLiteConfig K;
    public static final  int C;
     EquipmentSetup ap;
    private  int ag;
    public static final  int D;
    @Inject
    private  InfoBoxManager M;
    private static final  DecimalFormat H;
    @Inject
    private  EventBus Z;
    private static final  int I;
    private static final  String E;
    private  a aa;
    private  boolean ac;
    
    public static final  int A;
    @Inject
    private  l W;
    private static final  Logger z;
     EquipmentSetup aq;
    @Inject
    private  ClientThread R;
    private  GameState ar;
     n al;
    public static final  int B;
    private  int ad;

    protected void onStop() {
        this.N.remove((Overlay)this.O);
        0;
        this.M.removeInfoBox((InfoBox)this.ae);
        this.ae = null;
        this.ac = 0;
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

    public int K() {
        return this.aj;
    }

    private boolean a(ChatInput chatInput, String string) {
        if (this.aa == null) {
            return 0;
        }
        String string2 = this.u.getLocalPlayer().getName();
        List<N> list = this.aa.e();
        LayoutRoom[] layoutRoomArray = (LayoutRoom[])list.stream().map(n2 -> LayoutRoom.valueOf((String)n2.name())).toArray(LayoutRoom[]::new);
        this.T.execute(() -> {
            block7: {
                try {
                    SquireChambersPlugin var3;
                    var3.S.submitLayout(string2, layoutRoomArray);
                    0;
                    0;
                }
                catch (Exception var4) {
                    z.warn(var2[var1[30]], (Throwable)var4);
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
        return 3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean x() {
        void var1_2;
        int[] nArray = new int[3];
        nArray[0] = var1[66];
        if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
            void var5;
            int[] nArray2 = new int[3];
            nArray2[0] = var1[66];
            Item item2 = Inventory.getFirst((int[])nArray2);
            if item2 == null {
                return 0;
            }
            var5.interact(var2[var1[23]]);
            return 3;
        }
        Item var5 = Inventory.getFirst(item -> item.getName().startsWith(var2[var1[29]]));
        if var5 == null {
            var5 = Inventory.getFirst(item -> item.getName().startsWith(var2[var1[28]]));
        }
        if var5 == null {
            var5 = Inventory.getFirst(item -> item.getName().startsWith(var2[var1[27]]));
        }
        if var5 == null {
            var5 = Inventory.getFirst(item -> item.getName().startsWith(var2[var1[26]]));
        }
        if var5 == null {
            return 0;
        }
        var1_2.drop();
        return 3;
    }

    /*
     * WARNING - void declaration
     */
    private a a(a a2) {
        int n2;
        a var6;
        SquireChambersPlugin var7;
        a a3 = a2;
        if a3 == null {
            void var8;
            Point point = this.v();
            if point == null {
                return null;
            }
            Integer var9 = var7.a((Point)var8);
            if var9 == null {
                return null;
            }
            var6 = new CoxManager(new WorldPoint(var7.u.getBaseX() + var8.getX(), var7.u.getBaseY() + var8.getY(), 5), var9);
        }
        int var8 = var6.l() % 6;
        if ((var6.l() % var1[10] > 5)) {
            n2 = 3;
            0;
            if ((2 & ~2) == (0x34 ^ 0x30)) {
                return null;
            }
        } else {
            n2 = 0;
        }
        int var9 = n2;
        int var10 = 0;
        while ((var10 < var6.h().length)) {
            int n3;
            int var11;
            int n4;
            int var12 = var10 % 6;
            if (var10 % var1[10] > 5) {
                n4 = 3;
                0;
                if ((0xBC ^ 0xA8 ^ (0x33 ^ 0x23)) < 0) {
                    return null;
                }
            } else {
                n4 = var11 = 0;
            }
            if (var10 > 9) {
                n3 = 4;
                0;
                if ((54 + 19 - -57 + 1 ^ 64 + 52 - 31 + 50) < 0) {
                    return null;
                }
            } else {
                n3 = 5;
            }
            int var13 = n3;
            var12 -= var8;
            var11 -= var9;
            var12 = var6.k().getX() + var12 * var1[34];
            var11 = var6.k().getY() - var11 * var1[34];
            var11 -= var7.u.getBaseY();
            if ((var12 -= var7.u.getBaseX() >= var1[64])) {
                if (var12 >= var1[62]) {
                    0;
                    if ((147 + 61 - 78 + 33 ^ 135 + 27 - 72 + 77) != (2 ^ (0xB9 ^ 0xBF))) {
                        return null;
                    }
                } else {
                    Tile var14;
                    if (var12 < 3) {
                        var12 = 3;
                    }
                    if (var11 < 3) {
                        var11 = 3;
                    }
                    if ((var14 = var7.u.getScene( == null).getTiles()[var13][var12][var11])) {
                        0;
                        if (2 > 3) {
                            return null;
                        }
                    } else {
                        N var15 = var7.b(var14);
                        var6.a(var15, var10);
                    }
                }
            }
            ++var10;
            0;
            if (((0x4E ^ 0x7C) & ~(0 ^ 0x32)) == 0) continue;
            return null;
        }
        return a3;
    }

    protected void onStart() {
        BankLoadout var16;
        SquireChambersPlugin var17;
        int n2;
        if (!(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.be( != 0) ? 1 : 0) || (c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bf( == 0) ? 1 : 0)) {
            n2 = 3;
            0;
            if ((0x58 ^ 0x5C) < -1) {
                return;
            }
        } else {
            n2 = 0;
        }
        this.af = n2;
        var17.N.add((Overlay)var17.O);
        0;
        var17.Z.register((Object)var17.V);
        var17.V.T();
        var17.Z.register((Object)var17.W);
        var17.Z.register((Object)var17.X);
        var17.Z.register((Object)var17.Y);
        var17.Y.T();
        var17.R.invokeLater(var17::t);
        var17.ai = 0;
        var17.aj = 0;
        if ((var17.r() < 5)) {
            var17.forceStop();
            Log.error((String)var2[0]);
            return;
        }
        if ((var17.s() < 4)) {
            var17.forceStop();
            Log.error((String)var2[3]);
            return;
        }
        if ((var17.k.enableGuardians( != 0) ? 1 : 0) && ((var16 = var17.q( == 0)).getInventorySetup().contains(itemComposition -> itemComposition.getName().toLowerCase().contains(var2[var1[31]])) ? 1 : 0)) {
            var17.forceStop();
            Log.error((String)var2[4]);
            return;
        }
    }

    public boolean G() {
        return this.af;
    }

    @Subscribe(priority=1000.0f)
    public void a(ExperienceGained experienceGained) {
        if ((experienceGained.getSkill() == experienceGained.getSkill()2)) {
            this.ag = Static.getClient().getTickCount();
        }
    }

    public void b(n n2) {
        this.al = n2;
    }

    /*
     * WARNING - void declaration
     */
    private void t() {
        void var1_1;
        Object var18;
        int n2;
        int n3;
        SquireChambersPlugin var19;
        if ((this.u.getGameState() != this.u.getGameState()2)) {
            return;
        }
        if (((Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bh() == (Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bh()2)w.REACHED_BOTTOM)) {
            var19.b(s.ba());
            var19.a(s.bc());
            var19.c(s.bb());
            var19.d(s.b(s.aZ()));
            return;
        }
        if ((var19.u.getVarbitValue(var1[61]) == 3)) {
            n3 = 3;
            0;
            if (((0x20 ^ 0x7C) & ~(0x73 ^ 0x2F)) != 0) {
                return;
            }
        } else {
            var19.ac = 0;
            n3 = var19.ac;
        }
        if (var19.ac == 0) {
            return;
        }
        if (var19.aa == null) {
            n2 = 3;
            0;
            if ((0x1B ^ 0x5E ^ (0x87 ^ 0xC6)) > (117 + 112 - 226 + 125 ^ 12 + 105 - 60 + 75)) {
                return;
            }
        } else {
            n2 = 0;
        }
        int var20 = n2;
        var19.aa = var19.a(var19.aa);
        if (var19.aa == null) {
            z.debug(var2[var1[15]]);
            return;
        }
        if ((var19.aa.j( == null))) {
            var18 = var19.P.a(var19.aa.d());
            if var18 == null {
                z.debug(var2[var1[16]]);
                var19.aa = null;
                return;
            }
            var19.aa.a((K)var18);
        }
        var18 = var19.aa.c();
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.R.b(var18);
        0;
        var19.aa.a((N[])var18);
        var19.ab = n.c(var19.aa);
        var19.aj = 0;
        var19.ai = 0;
        var19.V.T();
        if ((c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bf( != 0) ? 1 : 0)) {
            var19.b(s.ba());
            var19.a(s.bc());
            var19.c(s.bb());
            var19.d(s.b(s.aZ()));
            0;
            
        } else {
            var19.ao = null;
            var19.an = null;
            var19.ap = null;
            var19.aq = null;
        }
        Log.error((String)var2[var1[17]]);
        this.Z.post((Object)new GHelper(this.aa, (boolean)var1_1));
    }

    public void c(EquipmentSetup equipmentSetup) {
        this.ap = equipmentSetup;
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
        void var21;
        int n2 = this.u.getInstanceTemplateChunks()[tile.getPlane()][tile.getSceneLocation().getX() / var1[10]][tile.getSceneLocation().getY() / var1[10]];
        InstanceTemplates instanceTemplates = InstanceTemplates.findMatch((int)n2);
        if instanceTemplates == null {
            return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.EMPTY;
        }
        switch (e.as[var21.ordinal()]) {
            case 1: 
            case 2: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.START;
            }
            case 3: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.END;
            }
            case 4: 
            case 5: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.SCAVENGERS;
            }
            case 6: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.SHAMANS;
            }
            case 7: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.VASA;
            }
            case 8: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.VANGUARDS;
            }
            case 9: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.ICE_DEMON;
            }
            case 10: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.THIEVING;
            }
            case 11: 
            case 12: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.FARMING;
            }
            case 13: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.MUTTADILES;
            }
            case 14: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.MYSTICS;
            }
            case 15: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.TEKTON;
            }
            case 16: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.TIGHTROPE;
            }
            case 17: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.GUARDIANS;
            }
            case 18: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.CRABS;
            }
            case 19: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.VESPULA;
            }
        }
        return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.EMPTY;
    }

    /*
     * WARNING - void declaration
     */
    private void a(ChatMessage chatMessage, String string) {
        void var6_7;
        LayoutRoom[] var22;
        String var23;
        ChatMessageType chatMessageType = chatMessage.getType();
        if ((chatMessageType.equals(ObjectChatMessageType.PRIVATECHATOUT) ? 1 : 0)) {
            String string2 = this.u.getLocalPlayer().getName();
            0;
            if (2 < 0) {
                return;
            }
        } else {
            void var24;
            var23 = Text.sanitize((String)var24.getName());
        }
        try {
            SquireChambersPlugin var25;
            var22 = var25.S.getLayout(var23);
            0;
        }
        catch (IOException var26) {
            z.debug(var2[var1[18]], (Throwable)var26);
            return;
        }
        if (2 <= -1) {
            return;
        }
        if (!var22 != null || (var22.length == 0)) {
            return;
        }
        String var26 = Joiner.on((String)var2[var1[19]]).join(Arrays.stream(var22).map(layoutRoom -> c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.valueOf(layoutRoom.name())).filter(n2 -> {
            boolean bl2;
            if (!((Object)n2.bY() != (Object)n2.bY()2)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.P.COMBAT) || ((Object)n2.bY() == (Object)n2.bY()2)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.P.PUZZLE)) {
                bl2 = 3;
                0;
                if null != null {
                    return ((0x7D ^ 0x59) & ~(0x8B ^ 0xAF)) != 0;
                }
            } else {
                bl2 = 0;
            }
            return bl2;
        }).map(N::bX).toArray());
        if ((var26.length() > var1[65])) {
            z.debug(var2[var1[20]], (Object)var26.length());
            return;
        }
        String string3 = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append(var2[var1[21]]).append(ChatColorType.NORMAL).append((String)var6_7).build();
        z.debug(var2[var1[22]], (Object)string3);
        MessageNode messageNode = chatMessage.getMessageNode();
        messageNode.setRuneLiteFormatMessage(string3);
        this.u.refreshChat();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ConfigChanged configChanged) {
        void var27;
        if ((configChanged.getGroup( == 0).equals(var2[5]) ? 1 : 0)) {
            return;
        }
        if ((var27.getKey( != 0).equals(var2[6]) ? 1 : 0)) {
            SquireChambersPlugin var28;
            var28.u();
            return;
        }
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
        SquireChambersPlugin var36;
        int n2 = 0;
        if ((this.k.enableGuardians( != 0) ? 1 : 0)) {
            ++n2;
        }
        if ((var36.k.enableTekton( != 0) ? 1 : 0)) {
            ++var35;
        }
        if ((var36.k.enableMuttadiles( != 0) ? 1 : 0)) {
            ++var35;
        }
        if ((var36.k.enableVasa( != 0) ? 1 : 0)) {
            ++var35;
        }
        if ((var36.k.enableVespula( != 0) ? 1 : 0)) {
            ++var35;
        }
        return n2;
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
        Tile[][] tileArray = this.u.getScene().getTiles()[5];
        int var37 = 0;
        while (var37 < var1[62]) {
            int var38 = 0;
            while (var38 < var1[62]) {
                void var39;
                if (var39[var37][var38] != null) {
                    if ((var39[var37][var38].getWallObject( == null))) {
                        0;
                        if ((106 + 61 - 57 + 86 ^ 87 + 117 - 35 + 24) == 0) {
                            return null;
                        }
                    } else if ((var39[var37][var38].getWallObject().getId() == var1[63])) {
                        return var39[var37][var38].getSceneLocation();
                    }
                }
                ++var38;
                0;
                if ((1 & (1 ^ -1)) == ((113 + 214 - 230 + 149 ^ 38 + 133 - 166 + 182) & (240 + 96 - 197 + 113 ^ 59 + 58 - 26 + 86 ^ -1))) continue;
                return null;
            }
            ++var37;
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
        Class[] classArray = new Class[2];
        classArray[0] = StartRoomTask.class;
        classArray[3] = ScavangersTopFloorTask.class;
        classArray[4] = ScavangersPrepTask.class;
        classArray[5] = FarmingTopFloorTask.class;
        classArray[6] = FinishingFloorTask.class;
        classArray[7] = ThievingTask.class;
        classArray[8] = TightropeTask.class;
        classArray[9] = IceDemonTask.class;
        classArray[SquireChambersPlugin.var1[10]] = CrabsTask.class;
        classArray[SquireChambersPlugin.var1[11]] = PrayerFlickingTask.class;
        classArray[SquireChambersPlugin.var1[12]] = OlmMageHandTask.class;
        classArray[SquireChambersPlugin.var1[13]] = OlmMeleeHandTask.class;
        classArray[SquireChambersPlugin.var1[14]] = PrayerFlickingTask.class;
        classArray[SquireChambersPlugin.var1[15]] = DodgingFalligCrystalsTask.class;
        classArray[SquireChambersPlugin.var1[16]] = OlmPortalsTask.class;
        classArray[SquireChambersPlugin.var1[17]] = OlmMeleeSpecTask.class;
        classArray[SquireChambersPlugin.var1[18]] = TryingOlmHeadTask.class;
        classArray[SquireChambersPlugin.var1[19]] = EnterOlmRoomTask.class;
        classArray[SquireChambersPlugin.var1[20]] = LootChestTask.class;
        classArray[SquireChambersPlugin.var1[21]] = PrepGettingToolsTask.class;
        classArray[SquireChambersPlugin.var1[22]] = PrepFarmingTask.class;
        classArray[SquireChambersPlugin.var1[23]] = PrepGetVialsTask.class;
        classArray[SquireChambersPlugin.var1[24]] = PrepDepositInventoryTask.class;
        classArray[SquireChambersPlugin.var1[25]] = PrepPickHerbsTask.class;
        classArray[SquireChambersPlugin.var1[26]] = PrepMakePotsTask.class;
        classArray[SquireChambersPlugin.var1[27]] = PrepDroppingToolsTask.class;
        classArray[SquireChambersPlugin.var1[28]] = PrepWithdrawOlmGearTask.class;
        classArray[SquireChambersPlugin.var1[29]] = PrepGetSeedsTask.class;
        classArray[SquireChambersPlugin.var1[30]] = GuardiansTask.class;
        classArray[SquireChambersPlugin.var1[31]] = MuttadilesTask.class;
        classArray[SquireChambersPlugin.var1[32]] = TektonTask.class;
        classArray[SquireChambersPlugin.var1[33]] = MysticsTask.class;
        classArray[SquireChambersPlugin.var1[34]] = ShamansTask.class;
        classArray[SquireChambersPlugin.var1[35]] = VasaTask.class;
        classArray[SquireChambersPlugin.var1[36]] = VespulaTask.class;
        classArray[SquireChambersPlugin.var1[37]] = ScoutingForARaidTask.class;
        classArray[SquireChambersPlugin.var1[38]] = SettingUpRaidTask.class;
        classArray[SquireChambersPlugin.var1[39]] = SettingUpAutoRoomsTask.class;
        classArray[SquireChambersPlugin.var1[40]] = HoppingToDifferentWorldTask.class;
        classArray[SquireChambersPlugin.var1[41]] = LeaveRaidTask.class;
        classArray[SquireChambersPlugin.var1[42]] = ConfigurePartyTask.class;
        classArray[SquireChambersPlugin.var1[43]] = MakingPartyTask.class;
        classArray[SquireChambersPlugin.var1[44]] = WithdrawingItemsTask.class;
        classArray[SquireChambersPlugin.var1[45]] = EmptyPrivateStorageTask.class;
        classArray[SquireChambersPlugin.var1[46]] = RechargingTridentTask.class;
        classArray[SquireChambersPlugin.var1[47]] = TestTask.class;
        classArray[SquireChambersPlugin.var1[48]] = EnablingRunTask.class;
        classArray[SquireChambersPlugin.var1[49]] = EatingFoodTask.class;
        classArray[SquireChambersPlugin.var1[50]] = DrinkStaminaTask.class;
        classArray[SquireChambersPlugin.var1[51]] = DrinkOverloadTask.class;
        classArray[1] = RestoringPrayerTask.class;
        classArray[SquireChambersPlugin.var1[52]] = DroppingSpareItemsTask.class;
        classArray[SquireChambersPlugin.var1[53]] = PickSeedsTask.class;
        classArray[SquireChambersPlugin.var1[54]] = ManageOverloadsTask.class;
        classArray[SquireChambersPlugin.var1[55]] = PickupEnhanceTask.class;
        classArray[SquireChambersPlugin.var1[56]] = PickupDroppedBrewTask.class;
        return classArray;
    }

        catch (Exception var45) {
            var45.printStackTrace();
            return null;
        }
    }

    public SquireChambersPlugin() {
        this.ab = new ArrayList<n>();
        this.ag = 0;
        this.ah = 1;
        this.ai = 0;
        this.aj = 0;
        this.an = null;
        this.ao = null;
        this.ap = null;
        this.aq = null;
    }

    private static void var46() {
        var2 = new String[var1[36]];
        SquireChambersPlugin.var2[0] = "Not enough Combat Rooms selected, please select more Combat Rooms";
        SquireChambersPlugin.var2[3] = "Not enough Puzzle Rooms selected, please select more Puzzle Rooms";
        SquireChambersPlugin.var2[4] = "Guardians rooms is enabled but no pickaxe found in Bank Loadout";
        SquireChambersPlugin.var2[5] = "squireraids";
        SquireChambersPlugin.var2[6] = "raidsTimer";
        SquireChambersPlugin.var2[7] = "deposited grubs";
        SquireChambersPlugin.var2[8] = "deposited grubs";
        SquireChambersPlugin.var2[9] = "Raid party has been dissolved";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[10]] = "IN RAID CHANGED";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[11]] = "Scouting raid";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[12]] = "Raid has ended";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[13]] = "level complete!";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[14]] = "Congratulations - your raid is complete!";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[15]] = "Failed to build raid";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[16]] = "Could not find layout match";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[17]] = "Scouting for raid";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[18]] = "unable to lookup layout";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[19]] = ", ";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[20]] = "layout message too long! {}";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[21]] = "Layout: ";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[22]] = "Setting response {}";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[23]] = "Eat";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[24]] = "Chambers";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[25]] = "Tekton";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[26]] = "Revitalisation";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[27]] = "Super restore";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[28]] = "Xeric's";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[29]] = "Saradomin brew";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[30]] = "unable to submit layout";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[31]] = "pickaxe";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[32]] = "Congratulations - your raid is complete!";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[33]] = "level complete!";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[34]] = "###.##";
        SquireChambersPlugin.var2[SquireChambersPlugin.var1[35]] = "#,###";
    }

    public void a(n n2) {
        this.ak = n2;
    }

    private static String var47(String var48, String var49) {
        var48 = new String(Base64.getDecoder().decode(var48.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var50 = new StringBuilder();
        char[] var51 = var49.toCharArray();
        int var52 = 0;
        char[] var53 = var48.toCharArray();
        int var54 = var53.length;
        int var55 = 0;
        while (var55 < var54) {
            char var56 = var53[var55];
            var50.append((char)(var56 ^ var51[var52 % var51.length]));
            0;
            ++var52;
            ++var55;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(var50);
    }

    public int J() {
        return this.ai;
    }

    public void b(EquipmentSetup equipmentSetup) {
        this.ao = equipmentSetup;
    }

    public void configure(Binder binder) {
        binder.bind(CoxManager.class);
        0;
    }

    public a C() {
        return this.aa;
    }

    /*
     * WARNING - void declaration
     */
    public int s() {
        void var57;
        SquireChambersPlugin var58;
        int n2 = 0;
        if ((this.k.enableCrabs( != 0) ? 1 : 0)) {
            ++n2;
        }
        if ((var58.k.enableThieving( != 0) ? 1 : 0)) {
            ++var57;
        }
        if ((var58.k.enableIceDemon( != 0) ? 1 : 0)) {
            ++var57;
        }
        if ((var58.k.enableTightrope( != 0) ? 1 : 0)) {
            ++var57;
        }
        return n2;
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        if ((lootReceived.getName( == 0).contains(var2[var1[24]]) ? 1 : 0) && (lootReceived.getName( == 0).contains(var2[var1[25]]) ? 1 : 0)) {
            return;
        }
        Collection collection = lootReceived.getItems();
        ItemStack itemStack2 = collection.stream().filter(itemStack -> J.contains(itemStack.getId())).findFirst().orElse(null);
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.al.a(itemStack2, collection, this.k.anonymize());
    }

    public int I() {
        return this.ah;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if ((this.ac != 0) && (chatMessage.getType() == chatMessage.getType()2)) {
            SquireChambersPlugin var59;
            void var60;
            String string = Text.removeTags((String)chatMessage.getMessage());
            if ((Object != nullthis.ae) && (string.contains(var2[var1[13]] != 0) ? 1 : 0)) {
                this.ae.n();
            }
            if ((var60.startsWith(var2[var1[14]] != 0) ? 1 : 0) && (Object != nulllllllllllllllllIlllIIIllllIllIIl.ae)) {
                var59.ae.o();
                var59.ae.a(3);
            }
        }
    }

    static {
        SquireChambersPlugin.var61();
        SquireChambersPlugin.var46();
        F = var2[var1[32]];
        D = 6;
        E = var2[var1[33]];
        B = 4;
        I = var1[65];
        A = 5;
        C = var1[10];
        z = LoggerFactory.getLogger(SquireChambersPlugin.class);
        G = new DecimalFormat(var2[var1[34]]);
        H = new DecimalFormat(var2[var1[35]]);
        Object[] objectArray = new Integer[8];
        objectArray[0] = var1[73];
        objectArray[3] = var1[74];
        objectArray[4] = var1[75];
        objectArray[5] = var1[76];
        objectArray[6] = var1[77];
        objectArray[7] = var1[78];
        J = ImmutableSet.of((Object)var1[67], (Object)var1[68], (Object)var1[69], (Object)var1[70], (Object)var1[71], (Object)var1[72], (Object[])objectArray);
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

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        void var62;
        SquireChambersPlugin var63;
        if (!(this.u.getGameState() == this.u.getGameState()2) || (this.ar != this.ar2)) {
            // empty if block
        }
        if ((var63.u.getGameState() == var63.u.getGameState()2)) {
            var63.b(3);
        }
        if var62 != null {
            var63.ar = var63.u.getGameState();
        }
    }

    public void d(EquipmentSetup equipmentSetup) {
        this.aq = equipmentSetup;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=1000.0f)
    public void a(InventoryChanged inventoryChanged) {
        int n2 = inventoryChanged.getAmount();
        int n3 = inventoryChanged.getItemId();
        if ((inventoryChanged.getChangeType() == inventoryChanged.getChangeType()2)) {
            void var64;
            if (var1[57] == var1[57]) {
                System.out.print(var2[7]);
                this.ai += n2;
            }
            if (((int)var64 == var1[58])) {
                void var65;
                System.out.print(var2[8]);
                var66.aj += var65;
            }
        }
    }

    private void u() {
        if ((Object != nullthis.ae) && (this.ac == 0)) {
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
        this.Z.post((Object)new FHelper());
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
        int var67;
        int var68;
        void var69;
        SquireChambersPlugin var70;
        if (!(var1[62] > point.getX() + var1[34]) || (var1[62] <= point.getY() + var1[34])) {
            return null;
        }
        Tile[][] var71 = var70.u.getScene().getTiles()[5];
        if ((var71[var69.getX( == null)][var69.getY() + var1[34]])) {
            var68 = 0;
            0;
            if (((44 + 79 - 60 + 78 ^ 45 + 59 - 102 + 160) & (0x26 ^ 0x48 ^ (0x74 ^ 0x35) ^ -1)) < 0) {
                return null;
            }
        } else {
            var68 = 3;
        }
        if ((var71[var69.getX( == null) + var1[34]][var69.getY()])) {
            var67 = 5;
            0;
            if (-3 > 0) {
                return null;
            }
        } else {
            int var72;
            var67 = 0;
            while ((var67 < 5) && (var72 = var69.getX( >= 0) - 3 - var1[34] * var67)) {
                if ((var71[var72][var69.getY( == null)])) {
                    0;
                    if (-1 < 3) break;
                    return null;
                }
                ++var67;
                0;
                if null == null continue;
                return null;
            }
        }
        return (int)(var2_4 + var3_3 * 6);
    }

    public int F() {
        return this.ad;
    }

    public boolean E() {
        return this.ac;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        void var73;
        SquireChambersPlugin var74;
        if ((varbitChanged.getVarpId() == var1[59])) {
            int n2 = this.ac;
            int n3 = this.ad;
            this.ad = varbitChanged.getValue();
            if ((this.u.getGameState() == this.u.getGameState()2) && (!n2 || (var1[60] != var1[60]) && (this.ad != var1[60]) && (this.ad != this.ad))) {
                z.debug(var2[9]);
                var74.w();
            }
        }
        if ((var73.getVarbitId() == var1[61])) {
            int n4;
            System.out.println(var2[var1[10]]);
            if ((var73.getValue() == 3)) {
                n4 = 3;
                0;
                if (-3 > 0) {
                    return;
                }
            } else {
                n4 = 0;
            }
            int n5 = n4;
            var74.ac = n5;
            if ((var74.u.getGameState() == var74.u.getGameState()2)) {
                if (n5 && (var74.aa == null)) {
                    System.out.println(var2[var1[11]]);
                    var74.t();
                    0;
                    if ((9 ^ 0xC) <= 0) {
                        return;
                    }
                } else if (var74.ad == var1[60]) {
                    z.debug(var2[var1[12]]);
                    var74.w();
                }
            }
        }
    }

    public EquipmentSetup Q() {
        return this.ap;
    }

}

