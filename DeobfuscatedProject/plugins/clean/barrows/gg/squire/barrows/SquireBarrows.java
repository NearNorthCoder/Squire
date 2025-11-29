/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.UnmodifiableIterator
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  javax.inject.Inject
 *  net.runelite.api.Actor
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.WidgetClosed
 *  net.runelite.api.events.WidgetLoaded
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.chat.ChatColorType
 *  net.runelite.client.chat.ChatMessageBuilder
 *  net.runelite.client.chat.ChatMessageManager
 *  net.runelite.client.chat.QueuedMessage
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.loottracker.LootReceived
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.runelite.rs.api.RSClient
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package gg.squire.barrows;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Provides;
import gg.squire.barrows.SquireBarrowsConfig;
import gg.squire.barrows.overlay.BarrowsInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Actor;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.WidgetClosed;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.chat.QueuedMessage;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.rs.api.RSClient;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import gg.squire.barrows.BarrowsManager;
import gg.squire.barrows.BarrowsManager;
import gg.squire.barrows.GameEnum20;
import gg.squire.barrows.HandlingPrayersTask;
import gg.squire.barrows.CheckingStateTask;
import gg.squire.barrows.BankingTask;
import gg.squire.barrows.WalkingToBankTask;
import gg.squire.barrows.EatingFoodTask;
import gg.squire.barrows.RestoringPrayerTask;
import gg.squire.barrows.AttackingBrotherTask;
import gg.squire.barrows.OpeningSarcophagusTask;
import gg.squire.barrows.ExitingCryptTask;
import gg.squire.barrows.DiggingNextBrotherTask;
import gg.squire.barrows.UsingImbuedHeartTask;
import gg.squire.barrows.GoingToHouseMidTripTask;
import gg.squire.barrows.DrinkingFromPoolTask;
import gg.squire.barrows.TeleportingToBarrowsTask;
import gg.squire.barrows.AttackingMonsterForPotentialTask;
import gg.squire.barrows.ClaimingChestTask;
import gg.squire.barrows.GoingToHouseTask;
import gg.squire.barrows.OpeningChestTask;
import gg.squire.barrows.WalkingToChestTask;

@PluginDescriptor(name="Squire Barrows", description="Does the barrows minigame", enabledByDefault=false)
public class SquireBarrows
extends SquirePlugin {
    
    private static final  ImmutableList<WidgetInfo> a;
    @Inject
    private  OverlayManager g;
    private  boolean j;
    private  d e;
    private  int r;
    private  int s;
    private  NPC t;
    private static final  ImmutableList<Integer> b;
    private  d l;
    private  d m;
    private static final  int d;
    @Inject
    private  a n;
    private  Widget i;
    private static final  int c;
    
    @Inject
    private  c o;
    @Inject
    private  Client k;
    @Inject
    private  ChatMessageManager f;
    @Inject
    private  BarrowsInfoBox h;
    private  boolean p;
    private  boolean q;

    protected void onStop() {
        this.b();
        this.g.remove((Overlay)this.h);

    }

    static {
        SquireBarrows.lIllIlIlIIIIII();
        SquireBarrows.lIllIlIIllllll();
        c = llllIlIIIIl[25];
        d = llllIlIIIIl[26];
        a = ImmutableList.of((Object)WidgetInfo.BARROWS_PUZZLE_ANSWER1, (Object)WidgetInfo.BARROWS_PUZZLE_ANSWER2, (Object)WidgetInfo.BARROWS_PUZZLE_ANSWER3);
        Object[] objectArray = new Integer[llllIlIIIIl[8]];
        objectArray[SquireBarrows.llllIlIIIIl[2]] = llllIlIIIIl[39];
        objectArray[SquireBarrows.llllIlIIIIl[11]] = llllIlIIIIl[40];
        objectArray[SquireBarrows.llllIlIIIIl[13]] = llllIlIIIIl[41];
        objectArray[SquireBarrows.llllIlIIIIl[14]] = llllIlIIIIl[42];
        objectArray[SquireBarrows.llllIlIIIIl[15]] = llllIlIIIIl[43];
        objectArray[SquireBarrows.llllIlIIIIl[0]] = llllIlIIIIl[44];
        objectArray[SquireBarrows.llllIlIIIIl[3]] = llllIlIIIIl[45];
        objectArray[SquireBarrows.llllIlIIIIl[16]] = llllIlIIIIl[46];
        objectArray[SquireBarrows.llllIlIIIIl[17]] = llllIlIIIIl[47];
        objectArray[SquireBarrows.llllIlIIIIl[18]] = llllIlIIIIl[48];
        objectArray[SquireBarrows.llllIlIIIIl[19]] = llllIlIIIIl[49];
        objectArray[SquireBarrows.llllIlIIIIl[20]] = llllIlIIIIl[50];
        b = ImmutableList.of((Object)llllIlIIIIl[27], (Object)llllIlIIIIl[28], (Object)llllIlIIIIl[29], (Object)llllIlIIIIl[30], (Object)llllIlIIIIl[31], (Object)llllIlIIIIl[32], (Object)llllIlIIIIl[33], (Object)llllIlIIIIl[34], (Object)llllIlIIIIl[35], (Object)llllIlIIIIl[36], (Object)llllIlIIIIl[37], (Object)llllIlIIIIl[38], (Object[])objectArray);
    }

    @Provides
    SquireBarrowsConfig a(ConfigManager configManager) {
        return (SquireBarrowsConfig)configManager.getConfig(SquireBarrowsConfig.class);
    }

    public d n() {
        return this.e;
    }

    public Widget o() {
        return this.i;
    }

    public void j() {
        this.a(llllIlIIIIl[2]);
    }

    @Subscribe
    public void a(WidgetClosed widgetClosed) {
        if (SquireBarrows.lIllIlIlIIIIll(widgetClosed.getGroupId(), llllIlIIIIl[5])) {
            this.i = null;
        }
    }

    private static boolean lIllIlIlIIIlIl(Object object) {
        return object == null;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        TileObject var1;
        SquireBarrows var2;
        Widget var3;
        if (SquireBarrows.lIllIlIlIIIIlI(this.m() ? 1 : 0) && SquireBarrows.lIllIlIlIIIIlI(this.h() ? 1 : 0) && SquireBarrows.lIllIlIlIIIIll(this.e(), llllIlIIIIl[3]) && SquireBarrows.lIllIlIlIIIIIl(this.v() ? 1 : 0)) {
            this.e = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
            this.m = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
            this.l = null;
        }
        if (SquireBarrows.lIllIlIlIIIlII(var3 = var2.o()) && SquireBarrows.lIllIlIlIIIIlI(var3.isHidden() ? 1 : 0)) {
            if (SquireBarrows.lIllIlIlIIIIll(var3.getId(), llllIlIIIIl[4])) {
                var1 = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append("Solving Puzzle " + var3.getId()).append(ChatColorType.NORMAL);
                var2.f.queue(QueuedMessage.builder().type(ChatMessageType.ITEM_EXAMINE).runeLiteFormattedMessage(var1.build()).build());
                Widgets.get((int)llllIlIIIIl[5], (int)llllIlIIIIl[6]).interact(llllIlIIIIl[2]);
            }
            if (SquireBarrows.lIllIlIlIIIIll(var3.getId(), llllIlIIIIl[7])) {
                var1 = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append("Solving Puzzle " + var3.getId()).append(ChatColorType.NORMAL);
                var2.f.queue(QueuedMessage.builder().type(ChatMessageType.ITEM_EXAMINE).runeLiteFormattedMessage(var1.build()).build());
                Widgets.get((int)llllIlIIIIl[5], (int)llllIlIIIIl[8]).interact(llllIlIIIIl[2]);
            }
            if (SquireBarrows.lIllIlIlIIIIll(var3.getId(), llllIlIIIIl[9])) {
                var1 = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append("Solving Puzzle " + var3.getId()).append(ChatColorType.NORMAL);
                var2.f.queue(QueuedMessage.builder().type(ChatMessageType.ITEM_EXAMINE).runeLiteFormattedMessage(var1.build()).build());
                Widgets.get((int)llllIlIIIIl[5], (int)llllIlIIIIl[10]).interact(llllIlIIIIl[2]);
            }
        }
        if (SquireBarrows.lIllIlIlIIIIIl(var2.j ? 1 : 0)) {
            String[] stringArray = new String[llllIlIIIIl[11]];
            stringArray[SquireBarrows.llllIlIIIIl[2]] = llllIlIIIII[llllIlIIIIl[2]];
            var1 = TileObjects.getNearest((String[])stringArray);
            if (SquireBarrows.lIllIlIlIIIlII(var1)) {
                var1.interact(llllIlIIIII[llllIlIIIIl[11]]);
                var2.j = llllIlIIIIl[2];
            }
        }
    }

    private static void a() {
        if (SquireBarrows.lIllIlIlIIIIIl(((RSClient)Static.getClient()).isTesting() ? 1 : 0)) {
            int n2 = Rand.nextInt((int)llllIlIIIIl[0], (int)llllIlIIIIl[1]);
            Executors.newSingleThreadScheduledExecutor().schedule(() -> System.exit(llllIlIIIIl[2]), (long)n2, TimeUnit.MINUTES);

        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llllIlIIIIl[12]];
        classArray[SquireBarrows.llllIlIIIIl[2]] = HandlingPrayersTask.class;
        classArray[SquireBarrows.llllIlIIIIl[11]] = DiggingNextBrotherTask.class;
        classArray[SquireBarrows.llllIlIIIIl[13]] = OpeningSarcophagusTask.class;
        classArray[SquireBarrows.llllIlIIIIl[14]] = AttackingBrotherTask.class;
        classArray[SquireBarrows.llllIlIIIIl[15]] = ExitingCryptTask.class;
        classArray[SquireBarrows.llllIlIIIIl[0]] = WalkingToChestTask.class;
        classArray[SquireBarrows.llllIlIIIIl[3]] = OpeningChestTask.class;
        classArray[SquireBarrows.llllIlIIIIl[16]] = ClaimingChestTask.class;
        classArray[SquireBarrows.llllIlIIIIl[17]] = GoingToHouseTask.class;
        classArray[SquireBarrows.llllIlIIIIl[18]] = DrinkingFromPoolTask.class;
        classArray[SquireBarrows.llllIlIIIIl[19]] = TeleportingToBarrowsTask.class;
        classArray[SquireBarrows.llllIlIIIIl[20]] = AttackingMonsterForPotentialTask.class;
        classArray[SquireBarrows.llllIlIIIIl[8]] = GoingToHouseMidTripTask.class;
        classArray[SquireBarrows.llllIlIIIIl[21]] = UsingImbuedHeartTask.class;
        classArray[SquireBarrows.llllIlIIIIl[6]] = BankingTask.class;
        classArray[SquireBarrows.llllIlIIIIl[22]] = WalkingToBankTask.class;
        classArray[SquireBarrows.llllIlIIIIl[10]] = CheckingStateTask.class;
        classArray[SquireBarrows.llllIlIIIIl[23]] = RestoringPrayerTask.class;
        classArray[SquireBarrows.llllIlIIIIl[24]] = EatingFoodTask.class;
        return classArray;
    }

    public void k() {
        this.l = this.m;
    }

    public NPC y() {
        return this.t;
    }

    private static boolean lIllIlIlIIIIlI(int n2) {
        return n2 == 0;
    }

    public boolean p() {
        return this.j;
    }

    private void a(int n2) {
        this.e = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.values()[(this.e.ordinal() + llllIlIIIIl[11]) % q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.values().length];
        if (SquireBarrows.lIllIlIlIIlIII(this.k.getVarbitValue(this.e.F())) && SquireBarrows.lIllIlIlIIIllI(n2, llllIlIIIIl[3])) {
            this.a(n2 + llllIlIIIIl[11]);
        }
    }

    public Client q() {
        return this.k;
    }

    private static boolean lIllIlIlIIIlII(Object object) {
        return object != null;
    }

    public void b(d d2) {
        this.m = d2;
    }

    public boolean u() {
        return this.p;
    }

    public d r() {
        return this.l;
    }

    public boolean c() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            String[] stringArray = new String[llllIlIIIIl[11]];
            stringArray[SquireBarrows.llllIlIIIIl[2]] = llllIlIIIII[llllIlIIIIl[3]];
            if (SquireBarrows.lIllIlIlIIIIIl(item.hasAction(stringArray) ? 1 : 0) && (!SquireBarrows.lIllIlIlIIIIlI(item.getName().toLowerCase().contains(llllIlIIIII[llllIlIIIIl[16]]) ? 1 : 0) || SquireBarrows.lIllIlIlIIIIIl(item.getName().toLowerCase().contains(llllIlIIIII[llllIlIIIIl[17]]) ? 1 : 0))) {
                n2 = llllIlIIIIl[11];

                if (2 < 1) {
                    return false;
                }
            } else {
                n2 = llllIlIIIIl[2];
            }
            return n2 != 0;
        });
        if (SquireBarrows.lIllIlIlIIIlIl(item2)) {
            return llllIlIIIIl[2];
        }
        item2.interact(llllIlIIIII[llllIlIIIIl[13]]);
        return llllIlIIIIl[11];
    }

    public SquireBarrows() {
        this.e = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
        this.m = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
    }

    private static void lIllIlIIllllll() {
        llllIlIIIII = new String[llllIlIIIIl[18]];
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[2]] = "Door";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[11]] = "Open";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[13]] = "Drink";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[14]] = "Select";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[15]] = "locking mechanism";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[0]] = "Barrows chest count";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[3]] = "Drink";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[16]] = "prayer";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[17]] = "restore";
    }

    private static boolean lIllIlIlIIIIIl(int n2) {
        return n2 != 0;
    }

    public boolean h() {
        int n2;
        Player player = this.k.getLocalPlayer();
        if (SquireBarrows.lIllIlIlIIIlII(player) && SquireBarrows.lIllIlIlIIIIll(player.getWorldLocation().getRegionID(), llllIlIIIIl[25])) {
            n2 = llllIlIIIIl[11];

            if (((0xB ^ 0x2C) & ~(0x65 ^ 0x42)) > 0) {
                return false;
            }
        } else {
            n2 = llllIlIIIIl[2];
        }
        return n2 != 0;
    }

    public void b(boolean bl) {
        this.q = bl;
    }

    public boolean v() {
        return this.q;
    }

    /*
     * WARNING - void declaration
     */
    public int e() {
        void var4;
        int n2 = llllIlIIIIl[2];
        d[] dArray = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.values();
        int n3 = dArray.length;
        int var5 = llllIlIIIIl[2];
        while (SquireBarrows.lIllIlIlIIIllI(var5, (int)var4)) {
            SquireBarrows var6;
            void var7;
            void var8 = var7[var5];
            if (SquireBarrows.lIllIlIlIIIIIl(var6.a((GameEnum20) ar8) ? 1 : 0)) {
                void var9;
                ++var9;
            }
            ++var5;

            if ((0x5D ^ 0x59) > 3) continue;
            return (0xBE ^ 0xAB) & ~(6 ^ 0x13);
        }
        return n2;
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        if (SquireBarrows.lIllIlIlIIIIIl(lootReceived.getItems().stream().anyMatch(itemStack -> b.contains((Object)itemStack.getId())) ? 1 : 0)) {
            this.s += llllIlIIIIl[11];
        }
    }

    private static boolean lIllIlIlIIlIII(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(WidgetLoaded widgetLoaded) {
        if (SquireBarrows.lIllIlIlIIIIll(widgetLoaded.getGroupId(), llllIlIIIIl[5])) {
            int n2 = Static.getClient().getWidget(WidgetInfo.BARROWS_FIRST_PUZZLE).getModelId() - llllIlIIIIl[14];
            this.i = null;
            UnmodifiableIterator var10 = a.iterator();
            while (SquireBarrows.lIllIlIlIIIIIl(var10.hasNext() ? 1 : 0)) {
                void var11;
                WidgetInfo var12 = (WidgetInfo)var10.next();
                Widget var13 = Static.getClient().getWidget(var12);
                if (SquireBarrows.lIllIlIlIIIlII(var13) && SquireBarrows.lIllIlIlIIIIll(var13.getModelId(), (int)var11)) {
                    var14.i = Static.getClient().getWidget(var12);
                    var13.interact(llllIlIIIII[llllIlIIIIl[14]]);

                    if (3 >= 0) break;
                    return;
                }

                if ((0x96 ^ 0x92) > 0) continue;
                return;
            }
        }
    }

    public boolean l() {
        boolean bl;
        Widget widget = this.k.getWidget(WidgetInfo.BARROWS_BROTHERS);
        if (SquireBarrows.lIllIlIlIIIlII(widget)) {
            bl = llllIlIIIIl[11];

            if (-1 >= 3) {
                return false;
            }
        } else {
            bl = llllIlIIIIl[2];
        }
        return bl;
    }

    public a t() {
        return this.n;
    }

    public int x() {
        return this.s;
    }

    public int w() {
        return this.r;
    }

    public boolean g() {
        return this.o.c(this.d()).isEmpty();
    }

    private static boolean lIllIlIlIIIIll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIlIlIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIlIIIlll(Object object, Object object2) {
        return object == object2;
    }

    private void b() {
        this.r = llllIlIIIIl[2];
        this.s = llllIlIIIIl[2];
        this.q = llllIlIIIIl[2];
        this.e = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
        this.m = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
        this.l = null;
        this.j = llllIlIIIIl[2];
        this.i = null;
        this.t = null;
        this.k.forcedLogoutWildy();
    }

    public int d() {
        return this.o.d();
    }

        return String.valueOf(var15);
    }

    public boolean i() {
        d d2;
        if (SquireBarrows.lIllIlIlIIIlIl((Object)this.m)) {
            d2 = this.e;

            if (-1 > 3) {
                return ((0xFD ^ 0x85 ^ (0xF3 ^ 0xB8)) & (0x88 ^ 0x80 ^ (0x95 ^ 0xAE) ^ -1)) != 0;
            }
        } else {
            SquireBarrows var16;
            d2 = var16.m;
        }
        return this.a(d2);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var17;
        String string = chatMessage.getMessage();
        if (SquireBarrows.lIllIlIlIIIIIl(string.contains(llllIlIIIII[llllIlIIIIl[15]]) ? 1 : 0)) {
            this.j = llllIlIIIIl[11];
        }
        if (SquireBarrows.lIllIlIlIIIIIl(var17.contains(llllIlIIIII[llllIlIIIIl[0]]) ? 1 : 0)) {
            var18.r += llllIlIIIIl[11];
        }
    }

    public void a(boolean bl) {
        this.p = bl;
    }

    public d s() {
        return this.m;
    }

    protected void onStart() {
        this.b();
        this.g.add((Overlay)this.h);

        Executors.newSingleThreadExecutor().submit(SquireBarrows::a);

    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (SquireBarrows.lIllIlIlIIIlll(npcDespawned.getNpc(), this.t)) {
            this.t = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean f() {
        boolean bl;
        SquireBarrows var19;
        void var20;
        Actor actor = Players.getLocal().getInteracting();
        if (SquireBarrows.lIllIlIlIIIlIl(actor)) {
            return llllIlIIIIl[2];
        }
        if (!SquireBarrows.lIllIlIlIIIIlI(q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.a((Actor)var20) ? 1 : 0) || SquireBarrows.lIllIlIlIIIIIl(var19.o.c(var19.d()).contains(var20.getName()) ? 1 : 0)) {
            bl = llllIlIIIIl[11];

            if (((0x4A ^ 5) & ~(0xFC ^ 0xB3)) != 0) {
                return false;
            }
        } else {
            bl = llllIlIIIIl[2];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean m() {
        void var21;
        this.k.forcedLogoutWildy();
        int[] nArray = this.k.getMapRegions();
        int n2 = nArray.length;
        int var22 = llllIlIIIIl[2];
        while (SquireBarrows.lIllIlIlIIIllI(var22, (int)var21)) {
            void var23;
            void var24 = var23[var22];
            if (SquireBarrows.lIllIlIlIIIIll((int)var24, llllIlIIIIl[26])) {
                return llllIlIIIIl[11];
            }
            ++var22;

            if ((89 + 136 - 47 + 8 ^ 189 + 148 - 187 + 40) >= 0) continue;
            return ((58 + 190 - 94 + 57 ^ 17 + 99 - 12 + 44) & (0x53 ^ 0x7A ^ (0x40 ^ 0x2E) ^ -1)) != 0;
        }
        return llllIlIIIIl[2];
    }

    public boolean a(d d2) {
        boolean bl;
        if (SquireBarrows.lIllIlIlIIlIII(this.k.getVarbitValue(d2.F()))) {
            bl = llllIlIIIIl[11];

            if (-1 > 2) {
                return false;
            }
        } else {
            bl = llllIlIIIIl[2];
        }
        return bl;
    }

    public void a(NPC nPC) {
        this.t = nPC;
    }
}

