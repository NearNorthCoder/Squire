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
import gg.squire.cox.GameEnum38;
import gg.squire.cox.GameEnum26;
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
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.e;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.f;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.g;
import gg.squire.cox.CoxManager;
import gg.squire.cox.CoxManager;
import gg.squire.cox.CoxManager;
import gg.squire.cox.CoxManager;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import gg.squire.cox.CoxManager;
import gg.squire.cox.CoxManager;
import gg.squire.cox.GameEnum32;
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
                    SquireChambersPlugin var1;
                    var1.S.submitLayout(string2, layoutRoomArray);

                }
                catch (Exception var2) {
                    z.warn(lIlIIIIIllll[lIlIIIIlIIII[30]], (Throwable)var2);

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
            void var3;
            int[] nArray2 = new int[lIlIIIIlIIII[3]];
            nArray2[SquireChambersPlugin.lIlIIIIlIIII[0]] = lIlIIIIlIIII[66];
            Item item2 = Inventory.getFirst((int[])nArray2);
            if (SquireChambersPlugin.llIlIlIIlIllII(item2)) {
                return lIlIIIIlIIII[0];
            }
            var3.interact(lIlIIIIIllll[lIlIIIIlIIII[23]]);
            return lIlIIIIlIIII[3];
        }
        Item var3 = Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIllll[lIlIIIIlIIII[29]]));
        if (SquireChambersPlugin.llIlIlIIlIllII(var3)) {
            var3 = Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIllll[lIlIIIIlIIII[28]]));
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(var3)) {
            var3 = Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIllll[lIlIIIIlIIII[27]]));
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(var3)) {
            var3 = Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIllll[lIlIIIIlIIII[26]]));
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(var3)) {
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
        a var4;
        SquireChambersPlugin var5;
        a a3 = a2;
        if (SquireChambersPlugin.llIlIlIIlIllII(a3)) {
            void var6;
            Point point = this.v();
            if (SquireChambersPlugin.llIlIlIIlIllII(point)) {
                return null;
            }
            Integer var7 = var5.a((Point)var6);
            if (SquireChambersPlugin.llIlIlIIlIllII(var7)) {
                return null;
            }
            var4 = new CoxManager(new WorldPoint(var5.u.getBaseX() + var6.getX(), var5.u.getBaseY() + var6.getY(), lIlIIIIlIIII[5]), var7);
        }
        int var6 = var4.l() % lIlIIIIlIIII[6];
        if (SquireChambersPlugin.llIlIlIIlIllll(var4.l() % lIlIIIIlIIII[10], lIlIIIIlIIII[5])) {
            n2 = lIlIIIIlIIII[3];

            if ((2 & ~2) == (0x34 ^ 0x30)) {
                return null;
            }
        } else {
            n2 = lIlIIIIlIIII[0];
        }
        int var7 = n2;
        int var8 = lIlIIIIlIIII[0];
        while (SquireChambersPlugin.llIlIlIIlIlIII(var8, var4.h().length)) {
            int n3;
            int var9;
            int n4;
            int var10 = var8 % lIlIIIIlIIII[6];
            if (SquireChambersPlugin.llIlIlIIlIllll(var8 % lIlIIIIlIIII[10], lIlIIIIlIIII[5])) {
                n4 = lIlIIIIlIIII[3];

                if ((0xBC ^ 0xA8 ^ (0x33 ^ 0x23)) < 0) {
                    return null;
                }
            } else {
                n4 = var9 = lIlIIIIlIIII[0];
            }
            if (SquireChambersPlugin.llIlIlIIlIllll(var8, lIlIIIIlIIII[9])) {
                n3 = lIlIIIIlIIII[4];

                if ((54 + 19 - -57 + 1 ^ 64 + 52 - 31 + 50) < 0) {
                    return null;
                }
            } else {
                n3 = lIlIIIIlIIII[5];
            }
            int var11 = n3;
            var10 -= var6;
            var9 -= var7;
            var10 = var4.k().getX() + var10 * lIlIIIIlIIII[34];
            var9 = var4.k().getY() - var9 * lIlIIIIlIIII[34];
            var9 -= var5.u.getBaseY();
            if (SquireChambersPlugin.llIlIlIIllIIII(var10 -= var5.u.getBaseX(), lIlIIIIlIIII[64])) {
                if (SquireChambersPlugin.llIlIlIIllIIII(var10, lIlIIIIlIIII[62])) {

                    if ((147 + 61 - 78 + 33 ^ 135 + 27 - 72 + 77) != (2 ^ (0xB9 ^ 0xBF))) {
                        return null;
                    }
                } else {
                    Tile var12;
                    if (SquireChambersPlugin.llIlIlIIlIlIII(var10, lIlIIIIlIIII[3])) {
                        var10 = lIlIIIIlIIII[3];
                    }
                    if (SquireChambersPlugin.llIlIlIIlIlIII(var9, lIlIIIIlIIII[3])) {
                        var9 = lIlIIIIlIIII[3];
                    }
                    if (SquireChambersPlugin.llIlIlIIlIllII(var12 = var5.u.getScene().getTiles()[var11][var10][var9])) {

                        if (2 > 3) {
                            return null;
                        }
                    } else {
                        N var13 = var5.b(var12);
                        var4.a(var13, var8);
                    }
                }
            }
            ++var8;

            if (((0x4E ^ 0x7C) & ~(0 ^ 0x32)) == 0) continue;
            return null;
        }
        return a3;
    }

    protected void onStart() {
        BankLoadout var14;
        SquireChambersPlugin var15;
        int n2;
        if (!SquireChambersPlugin.llIlIlIIlIIllI(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.be() ? 1 : 0) || SquireChambersPlugin.llIlIlIIlIIlll(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bf() ? 1 : 0)) {
            n2 = lIlIIIIlIIII[3];

            if ((0x58 ^ 0x5C) < -1) {
                return;
            }
        } else {
            n2 = lIlIIIIlIIII[0];
        }
        this.af = n2;
        var15.N.add((Overlay)var15.O);

        var15.Z.register((Object)var15.V);
        var15.V.T();
        var15.Z.register((Object)var15.W);
        var15.Z.register((Object)var15.X);
        var15.Z.register((Object)var15.Y);
        var15.Y.T();
        var15.R.invokeLater(var15::t);
        var15.ai = lIlIIIIlIIII[0];
        var15.aj = lIlIIIIlIIII[0];
        if (SquireChambersPlugin.llIlIlIIlIlIII(var15.r(), lIlIIIIlIIII[5])) {
            var15.forceStop();
            Log.error((String)lIlIIIIIllll[lIlIIIIlIIII[0]]);
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIlIII(var15.s(), lIlIIIIlIIII[4])) {
            var15.forceStop();
            Log.error((String)lIlIIIIIllll[lIlIIIIlIIII[3]]);
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var15.k.enableGuardians() ? 1 : 0) && SquireChambersPlugin.llIlIlIIlIIlll((var14 = var15.q()).getInventorySetup().contains(itemComposition -> itemComposition.getName().toLowerCase().contains(lIlIIIIIllll[lIlIIIIlIIII[31]])) ? 1 : 0)) {
            var15.forceStop();
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
        Object var16;
        int n2;
        int n3;
        SquireChambersPlugin var17;
        if (SquireChambersPlugin.llIlIlIIlIlllI(this.u.getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIlIIl((Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bh(), (Object)w.REACHED_BOTTOM)) {
            var17.b(s.ba());
            var17.a(s.bc());
            var17.c(s.bb());
            var17.d(s.b(s.aZ()));
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIlIlI(var17.u.getVarbitValue(lIlIIIIlIIII[61]), lIlIIIIlIIII[3])) {
            n3 = lIlIIIIlIIII[3];

            if (((0x20 ^ 0x7C) & ~(0x73 ^ 0x2F)) != 0) {
                return;
            }
        } else {
            var17.ac = lIlIIIIlIIII[0];
            n3 = var17.ac ? 1 : 0;
        }
        if (SquireChambersPlugin.llIlIlIIlIIlll(var17.ac ? 1 : 0)) {
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(var17.aa)) {
            n2 = lIlIIIIlIIII[3];

            if ((0x1B ^ 0x5E ^ (0x87 ^ 0xC6)) > (117 + 112 - 226 + 125 ^ 12 + 105 - 60 + 75)) {
                return;
            }
        } else {
            n2 = lIlIIIIlIIII[0];
        }
        int var18 = n2;
        var17.aa = var17.a(var17.aa);
        if (SquireChambersPlugin.llIlIlIIlIllII(var17.aa)) {
            z.debug(lIlIIIIIllll[lIlIIIIlIIII[15]]);
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(var17.aa.j())) {
            var16 = var17.P.a(var17.aa.d());
            if (SquireChambersPlugin.llIlIlIIlIllII(var16)) {
                z.debug(lIlIIIIIllll[lIlIIIIlIIII[16]]);
                var17.aa = null;
                return;
            }
            var17.aa.a((CoxManager) ar16);
        }
        var16 = var17.aa.c();
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.R.b(var16);

        var17.aa.a((N[])var16);
        var17.ab = n.c(var17.aa);
        var17.aj = lIlIIIIlIIII[0];
        var17.ai = lIlIIIIlIIII[0];
        var17.V.T();
        if (SquireChambersPlugin.llIlIlIIlIIllI(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bf() ? 1 : 0)) {
            var17.b(s.ba());
            var17.a(s.bc());
            var17.c(s.bb());
            var17.d(s.b(s.aZ()));

            if (3 == 0) {
                return;
            }
        } else {
            var17.ao = null;
            var17.an = null;
            var17.ap = null;
            var17.aq = null;
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
        void var19;
        int n2 = this.u.getInstanceTemplateChunks()[tile.getPlane()][tile.getSceneLocation().getX() / lIlIIIIlIIII[10]][tile.getSceneLocation().getY() / lIlIIIIlIIII[10]];
        InstanceTemplates instanceTemplates = InstanceTemplates.findMatch((int)n2);
        if (SquireChambersPlugin.llIlIlIIlIllII(instanceTemplates)) {
            return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.EMPTY;
        }
        switch (e.as[var19.ordinal()]) {
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
        LayoutRoom[] var20;
        String var21;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (SquireChambersPlugin.llIlIlIIlIIllI(chatMessageType.equals((Object)ChatMessageType.PRIVATECHATOUT) ? 1 : 0)) {
            String string2 = this.u.getLocalPlayer().getName();

            if (2 < 0) {
                return;
            }
        } else {
            void var22;
            var21 = Text.sanitize((String)var22.getName());
        }
        try {
            SquireChambersPlugin var23;
            var20 = var23.S.getLayout(var21);

        }
        catch (IOException var24) {
            z.debug(lIlIIIIIllll[lIlIIIIlIIII[18]], (Throwable)var24);
            return;
        }
        if (2 <= -1) {
            return;
        }
        if (!SquireChambersPlugin.llIlIlIIlIllIl(var20) || SquireChambersPlugin.llIlIlIIlIIlll(var20.length)) {
            return;
        }
        String var24 = Joiner.on((String)lIlIIIIIllll[lIlIIIIlIIII[19]]).join(Arrays.stream(var20).map(layoutRoom -> c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.valueOf(layoutRoom.name())).filter(n2 -> {
            boolean bl2;
            if (!SquireChambersPlugin.llIlIlIIlIlllI((Object)n2.bY(), (Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.P.COMBAT) || SquireChambersPlugin.llIlIlIIlIlIIl((Object)n2.bY(), (Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.P.PUZZLE)) {
                bl2 = lIlIIIIlIIII[3];

                }
            } else {
                bl2 = lIlIIIIlIIII[0];
            }
            return bl2;
        }).map(N::bX).toArray());
        if (SquireChambersPlugin.llIlIlIIlIllll(var24.length(), lIlIIIIlIIII[65])) {
            z.debug(lIlIIIIIllll[lIlIIIIlIIII[20]], (Object)var24.length());
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
        void var25;
        if (SquireChambersPlugin.llIlIlIIlIIlll(configChanged.getGroup().equals(lIlIIIIIllll[lIlIIIIlIIII[5]]) ? 1 : 0)) {
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var25.getKey().equals(lIlIIIIIllll[lIlIIIIlIIII[6]]) ? 1 : 0)) {
            SquireChambersPlugin var26;
            var26.u();
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

    /*
     * WARNING - void declaration
     */
    public int r() {
        void var27;
        SquireChambersPlugin var28;
        int n2 = lIlIIIIlIIII[0];
        if (SquireChambersPlugin.llIlIlIIlIIllI(this.k.enableGuardians() ? 1 : 0)) {
            ++n2;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var28.k.enableTekton() ? 1 : 0)) {
            ++var27;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var28.k.enableMuttadiles() ? 1 : 0)) {
            ++var27;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var28.k.enableVasa() ? 1 : 0)) {
            ++var27;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var28.k.enableVespula() ? 1 : 0)) {
            ++var27;
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
        int var29 = lIlIIIIlIIII[0];
        while (SquireChambersPlugin.llIlIlIIlIlIII(var29, lIlIIIIlIIII[62])) {
            int var30 = lIlIIIIlIIII[0];
            while (SquireChambersPlugin.llIlIlIIlIlIII(var30, lIlIIIIlIIII[62])) {
                void var31;
                if (SquireChambersPlugin.llIlIlIIlIllIl(var31[var29][var30])) {
                    if (SquireChambersPlugin.llIlIlIIlIllII(var31[var29][var30].getWallObject())) {

                        if ((106 + 61 - 57 + 86 ^ 87 + 117 - 35 + 24) == 0) {
                            return null;
                        }
                    } else if (SquireChambersPlugin.llIlIlIIlIlIlI(var31[var29][var30].getWallObject().getId(), lIlIIIIlIIII[63])) {
                        return var31[var29][var30].getSceneLocation();
                    }
                }
                ++var30;

                if ((1 & (1 ^ -1)) == ((113 + 214 - 230 + 149 ^ 38 + 133 - 166 + 182) & (240 + 96 - 197 + 113 ^ 59 + 58 - 26 + 86 ^ -1))) continue;
                return null;
            }
            ++var29;

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
        classArray[SquireChambersPlugin.lIlIIIIlIIII[37]] = ScoutingForARaidTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[38]] = SettingUpRaidTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[39]] = SettingUpAutoRoomsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[40]] = HoppingToDifferentWorldTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[41]] = LeaveRaidTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[42]] = ConfigurePartyTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[43]] = MakingPartyTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[44]] = WithdrawingItemsTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[45]] = EmptyPrivateStorageTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[46]] = RechargingTridentTask.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[47]] = TestTask.class;
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
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[0]] = "Not enough Combat Rooms selected, please select more Combat Rooms";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[3]] = "Not enough Puzzle Rooms selected, please select more Puzzle Rooms";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[4]] = "Guardians rooms is enabled but no pickaxe found in Bank Loadout";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[5]] = "squireraids";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[6]] = "raidsTimer";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[7]] = "deposited grubs";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[8]] = "deposited grubs";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[9]] = "Raid party has been dissolved";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[10]] = "IN RAID CHANGED";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[11]] = "Scouting raid";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[12]] = "Raid has ended";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[13]] = "level complete!";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[14]] = "Congratulations - your raid is complete!";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[15]] = "Failed to build raid";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[16]] = "Could not find layout match";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[17]] = "Scouting for raid";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[18]] = "unable to lookup layout";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[19]] = ", ";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[20]] = "layout message too long! {}";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[21]] = "Layout: ";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[22]] = "Setting response {}";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[23]] = "Eat";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[24]] = "Chambers";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[25]] = "Tekton";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[26]] = "Revitalisation";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[27]] = "Super restore";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[28]] = "Xeric's";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[29]] = "Saradomin brew";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[30]] = "unable to submit layout";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[31]] = "pickaxe";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[32]] = "Congratulations - your raid is complete!";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[33]] = "level complete!";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[34]] = "###.##";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[35]] = "#,###";
    }

    public void a(n n2) {
        this.ak = n2;
    }

        return String.valueOf(var32);
    }

    public int J() {
        return this.ai;
    }

    public void b(EquipmentSetup equipmentSetup) {
        this.ao = equipmentSetup;
    }

    public void configure(Binder binder) {
        binder.bind(CoxManager.class);

    }

    public a C() {
        return this.aa;
    }

    /*
     * WARNING - void declaration
     */
    public int s() {
        void var33;
        SquireChambersPlugin var34;
        int n2 = lIlIIIIlIIII[0];
        if (SquireChambersPlugin.llIlIlIIlIIllI(this.k.enableCrabs() ? 1 : 0)) {
            ++n2;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var34.k.enableThieving() ? 1 : 0)) {
            ++var33;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var34.k.enableIceDemon() ? 1 : 0)) {
            ++var33;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(var34.k.enableTightrope() ? 1 : 0)) {
            ++var33;
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
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.al.a(itemStack2, collection, this.k.anonymize());
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
            SquireChambersPlugin var35;
            void var36;
            String string = Text.removeTags((String)chatMessage.getMessage());
            if (SquireChambersPlugin.llIlIlIIlIllIl((Object)this.ae) && SquireChambersPlugin.llIlIlIIlIIllI(string.contains(lIlIIIIIllll[lIlIIIIlIIII[13]]) ? 1 : 0)) {
                this.ae.n();
            }
            if (SquireChambersPlugin.llIlIlIIlIIllI(var36.startsWith(lIlIIIIIllll[lIlIIIIlIIII[14]]) ? 1 : 0) && SquireChambersPlugin.llIlIlIIlIllIl((Object)var35.ae)) {
                var35.ae.o();
                var35.ae.a(lIlIIIIlIIII[3]);
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
        SquireChambersPlugin var38;
        if (!SquireChambersPlugin.llIlIlIIlIlIIl(this.u.getGameState(), GameState.LOGGED_IN) || SquireChambersPlugin.llIlIlIIlIlllI(this.ar, GameState.CONNECTION_LOST)) {
            // empty if block
        }
        if (SquireChambersPlugin.llIlIlIIlIlIIl(var38.u.getGameState(), GameState.LOGIN_SCREEN)) {
            var38.b(lIlIIIIlIIII[3]);
        }
        if (SquireChambersPlugin.llIlIlIIlIllIl(var37)) {
            var38.ar = var38.u.getGameState();
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
            void var39;
            if (SquireChambersPlugin.llIlIlIIlIlIlI(n3, lIlIIIIlIIII[57])) {
                System.out.print(lIlIIIIIllll[lIlIIIIlIIII[7]]);
                this.ai += n2;
            }
            if (SquireChambersPlugin.llIlIlIIlIlIlI((int)var39, lIlIIIIlIIII[58])) {
                void var40;
                System.out.print(lIlIIIIIllll[lIlIIIIlIIII[8]]);
                var41.aj += var40;
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
        int var42;
        int var43;
        void var44;
        SquireChambersPlugin var45;
        if (!SquireChambersPlugin.llIlIlIIlIllll(lIlIIIIlIIII[62], point.getX() + lIlIIIIlIIII[34]) || SquireChambersPlugin.llIlIlIIllIIIl(lIlIIIIlIIII[62], point.getY() + lIlIIIIlIIII[34])) {
            return null;
        }
        Tile[][] var46 = var45.u.getScene().getTiles()[lIlIIIIlIIII[5]];
        if (SquireChambersPlugin.llIlIlIIlIllII(var46[var44.getX()][var44.getY() + lIlIIIIlIIII[34]])) {
            var43 = lIlIIIIlIIII[0];

            if (((44 + 79 - 60 + 78 ^ 45 + 59 - 102 + 160) & (0x26 ^ 0x48 ^ (0x74 ^ 0x35) ^ -1)) < 0) {
                return null;
            }
        } else {
            var43 = lIlIIIIlIIII[3];
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(var46[var44.getX() + lIlIIIIlIIII[34]][var44.getY()])) {
            var42 = lIlIIIIlIIII[5];

        } else {
            int var47;
            var42 = lIlIIIIlIIII[0];
            while (SquireChambersPlugin.llIlIlIIlIlIII(var42, lIlIIIIlIIII[5]) && SquireChambersPlugin.llIlIlIIllIIlI(var47 = var44.getX() - lIlIIIIlIIII[3] - lIlIIIIlIIII[34] * var42)) {
                if (SquireChambersPlugin.llIlIlIIlIllII(var46[var47][var44.getY()])) {

                    if (-1 < 3) break;
                    return null;
                }
                ++var42;

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
        void var48;
        SquireChambersPlugin var49;
        if (SquireChambersPlugin.llIlIlIIlIlIlI(varbitChanged.getVarpId(), lIlIIIIlIIII[59])) {
            int n2 = this.ac;
            int n3 = this.ad;
            this.ad = varbitChanged.getValue();
            if (SquireChambersPlugin.llIlIlIIlIlIIl(this.u.getGameState(), GameState.LOGGED_IN) && (!SquireChambersPlugin.llIlIlIIlIIllI(n2) || SquireChambersPlugin.llIlIlIIlIlIll(n3, lIlIIIIlIIII[60]) && SquireChambersPlugin.llIlIlIIlIlIll(this.ad, lIlIIIIlIIII[60]) && SquireChambersPlugin.llIlIlIIlIlIll(n3, this.ad))) {
                z.debug(lIlIIIIIllll[lIlIIIIlIIII[9]]);
                var49.w();
            }
        }
        if (SquireChambersPlugin.llIlIlIIlIlIlI(var48.getVarbitId(), lIlIIIIlIIII[61])) {
            int n4;
            System.out.println(lIlIIIIIllll[lIlIIIIlIIII[10]]);
            if (SquireChambersPlugin.llIlIlIIlIlIlI(var48.getValue(), lIlIIIIlIIII[3])) {
                n4 = lIlIIIIlIIII[3];

            } else {
                n4 = lIlIIIIlIIII[0];
            }
            int n5 = n4;
            var49.ac = n5;
            if (SquireChambersPlugin.llIlIlIIlIlIIl(var49.u.getGameState(), GameState.LOGGED_IN)) {
                if (SquireChambersPlugin.llIlIlIIlIIllI(n5) && SquireChambersPlugin.llIlIlIIlIllII(var49.aa)) {
                    System.out.println(lIlIIIIIllll[lIlIIIIlIIII[11]]);
                    var49.t();

                    if ((9 ^ 0xC) <= 0) {
                        return;
                    }
                } else if (SquireChambersPlugin.llIlIlIIlIlIlI(var49.ad, lIlIIIIlIIII[60])) {
                    z.debug(lIlIIIIIllll[lIlIIIIlIIII[12]]);
                    var49.w();
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

