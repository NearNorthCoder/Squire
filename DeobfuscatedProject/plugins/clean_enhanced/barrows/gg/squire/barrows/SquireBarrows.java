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
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
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
import gg.squire.barrows.GameEnum2;
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
        0;
    }

    static {
        SquireBarrows.var3();
        SquireBarrows.var4();
        c = var2[25];
        d = var2[26];
        a = ImmutableList.of((Object)WidgetInfo.BARROWS_PUZZLE_ANSWER1, (Object)WidgetInfo.BARROWS_PUZZLE_ANSWER2, (Object)WidgetInfo.BARROWS_PUZZLE_ANSWER3);
        Object[] objectArray = new Integer[var2[8]];
        objectArray[SquireBarrows.var2[2]] = var2[39];
        objectArray[SquireBarrows.var2[11]] = var2[40];
        objectArray[SquireBarrows.var2[13]] = var2[41];
        objectArray[SquireBarrows.var2[14]] = var2[42];
        objectArray[SquireBarrows.var2[15]] = var2[43];
        objectArray[SquireBarrows.var2[0]] = var2[44];
        objectArray[SquireBarrows.var2[3]] = var2[45];
        objectArray[SquireBarrows.var2[16]] = var2[46];
        objectArray[SquireBarrows.var2[17]] = var2[47];
        objectArray[SquireBarrows.var2[18]] = var2[48];
        objectArray[SquireBarrows.var2[19]] = var2[49];
        objectArray[SquireBarrows.var2[20]] = var2[50];
        b = ImmutableList.of((Object)var2[27], (Object)var2[28], (Object)var2[29], (Object)var2[30], (Object)var2[31], (Object)var2[32], (Object)var2[33], (Object)var2[34], (Object)var2[35], (Object)var2[36], (Object)var2[37], (Object)var2[38], (Object[])objectArray);
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
        this.a(var2[2]);
    }

    @Subscribe
    public void a(WidgetClosed widgetClosed) {
        if (SquireBarrows.var5(widgetClosed.getGroupId(), var2[5])) {
            this.i = null;
        }
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        TileObject var7;
        SquireBarrows var8;
        Widget var9;
        if (SquireBarrows.var10(this.m() ? 1 : 0) && SquireBarrows.var10(this.h() ? 1 : 0) && SquireBarrows.var5(this.e(), var2[3]) && SquireBarrows.var11(this.v() ? 1 : 0)) {
            this.e = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
            this.m = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
            this.l = null;
        }
        if (SquireBarrows.var12(var9 = var8.o()) && SquireBarrows.var10(var9.isHidden() ? 1 : 0)) {
            if (SquireBarrows.var5(var9.getId(), var2[4])) {
                var7 = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append("Solving Puzzle " + var9.getId()).append(ChatColorType.NORMAL);
                var8.f.queue(QueuedMessage.builder().type(ChatMessageType.ITEM_EXAMINE).runeLiteFormattedMessage(var7.build()).build());
                Widgets.get((int)var2[5], (int)var2[6]).interact(var2[2]);
            }
            if (SquireBarrows.var5(var9.getId(), var2[7])) {
                var7 = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append("Solving Puzzle " + var9.getId()).append(ChatColorType.NORMAL);
                var8.f.queue(QueuedMessage.builder().type(ChatMessageType.ITEM_EXAMINE).runeLiteFormattedMessage(var7.build()).build());
                Widgets.get((int)var2[5], (int)var2[8]).interact(var2[2]);
            }
            if (SquireBarrows.var5(var9.getId(), var2[9])) {
                var7 = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append("Solving Puzzle " + var9.getId()).append(ChatColorType.NORMAL);
                var8.f.queue(QueuedMessage.builder().type(ChatMessageType.ITEM_EXAMINE).runeLiteFormattedMessage(var7.build()).build());
                Widgets.get((int)var2[5], (int)var2[10]).interact(var2[2]);
            }
        }
        if (SquireBarrows.var11(var8.j)) {
            String[] stringArray = new String[var2[11]];
            stringArray[SquireBarrows.var2[2]] = var1[var2[2]];
            var7 = TileObjects.getNearest((String[])stringArray);
            if (SquireBarrows.var12(var7)) {
                var7.interact(var1[var2[11]]);
                var8.j = var2[2];
            }
        }
    }

    private static void a() {
        if (SquireBarrows.var11(((RSClient)Static.getClient()).isTesting() ? 1 : 0)) {
            int n2 = Rand.nextInt((int)var2[0], (int)var2[1]);
            Executors.newSingleThreadScheduledExecutor().schedule(() -> System.exit(var2[2]), (long)n2, TimeUnit.MINUTES);
            0;
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[var2[12]];
        classArray[SquireBarrows.var2[2]] = HandlingPrayersTask.class;
        classArray[SquireBarrows.var2[11]] = DiggingNextBrotherTask.class;
        classArray[SquireBarrows.var2[13]] = OpeningSarcophagusTask.class;
        classArray[SquireBarrows.var2[14]] = AttackingBrotherTask.class;
        classArray[SquireBarrows.var2[15]] = ExitingCryptTask.class;
        classArray[SquireBarrows.var2[0]] = WalkingToChestTask.class;
        classArray[SquireBarrows.var2[3]] = OpeningChestTask.class;
        classArray[SquireBarrows.var2[16]] = ClaimingChestTask.class;
        classArray[SquireBarrows.var2[17]] = GoingToHouseTask.class;
        classArray[SquireBarrows.var2[18]] = DrinkingFromPoolTask.class;
        classArray[SquireBarrows.var2[19]] = TeleportingToBarrowsTask.class;
        classArray[SquireBarrows.var2[20]] = AttackingMonsterForPotentialTask.class;
        classArray[SquireBarrows.var2[8]] = GoingToHouseMidTripTask.class;
        classArray[SquireBarrows.var2[21]] = UsingImbuedHeartTask.class;
        classArray[SquireBarrows.var2[6]] = BankingTask.class;
        classArray[SquireBarrows.var2[22]] = WalkingToBankTask.class;
        classArray[SquireBarrows.var2[10]] = CheckingStateTask.class;
        classArray[SquireBarrows.var2[23]] = RestoringPrayerTask.class;
        classArray[SquireBarrows.var2[24]] = EatingFoodTask.class;
        return classArray;
    }

    public void k() {
        this.l = this.m;
    }

    public NPC y() {
        return this.t;
    }

    private static boolean var10(int n2) {
        return n2 == 0;
    }

    public boolean p() {
        return this.j;
    }

    private void a(int n2) {
        this.e = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.values()[(this.e.ordinal() + var2[11]) % q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.values().length];
        if (SquireBarrows.var13(this.k.getVarbitValue(this.e.F())) && SquireBarrows.var14(n2, var2[3])) {
            this.a(n2 + var2[11]);
        }
    }

    public Client q() {
        return this.k;
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    private static void var3() {
        var2 = new int[51];
        SquireBarrows.var2[0] = 0x22 ^ 0x27;
        SquireBarrows.var2[1] = 77 + 151 - 203 + 157 ^ 132 + 42 - 161 + 136;
        SquireBarrows.var2[2] = (25 + 10 - -155 + 65 ^ 64 + 164 - 108 + 64) & (0xD7 ^ 0x9F ^ (0xAE ^ 0xA1) ^ -1);
        SquireBarrows.var2[3] = 0x10 ^ 0x16;
        SquireBarrows.var2[4] = -(0xFFFFFFFB & 0x2B5) & (0xFFFF87FF & 0x197ABF);
        SquireBarrows.var2[5] = 0xC8 ^ 0xB0 ^ (0xE7 ^ 0x86);
        SquireBarrows.var2[6] = 3 ^ 0x35 ^ (0x7F ^ 0x47);
        SquireBarrows.var2[7] = 0xFFFFAC7F & 0x19538D;
        SquireBarrows.var2[8] = 0x18 ^ 0x6F ^ (0x2D ^ 0x56);
        SquireBarrows.var2[9] = 0xFFFFCF17 & 0x1930F9;
        SquireBarrows.var2[10] = 0xB5 ^ 0x82 ^ (0x86 ^ 0xA1);
        SquireBarrows.var2[11] = 1;
        SquireBarrows.var2[12] = 0x8A ^ 0x82 ^ (0x56 ^ 0x4D);
        SquireBarrows.var2[13] = 2;
        SquireBarrows.var2[14] = 3;
        SquireBarrows.var2[15] = 0x51 ^ 0x55;
        SquireBarrows.var2[16] = 0x46 ^ 0x41;
        SquireBarrows.var2[17] = 0x24 ^ 0x45 ^ (0xC6 ^ 0xAF);
        SquireBarrows.var2[18] = 116 + 12 - -29 + 0 ^ 117 + 56 - 52 + 27;
        SquireBarrows.var2[19] = 0xF8 ^ 0x89 ^ (9 ^ 0x72);
        SquireBarrows.var2[20] = 131 + 24 - 84 + 116 ^ 155 + 28 - 165 + 158;
        SquireBarrows.var2[21] = 0xC5 ^ 0xBD ^ (0xE6 ^ 0x93);
        SquireBarrows.var2[22] = 0xA8 ^ 0xA7;
        SquireBarrows.var2[23] = 0x7E ^ 0x2D ^ (0x64 ^ 0x26);
        SquireBarrows.var2[24] = 20 + 79 - 41 + 98 ^ 34 + 3 - -19 + 86;
        SquireBarrows.var2[25] = 0xFFFFB7B7 & 0x7FDF;
        SquireBarrows.var2[26] = 0xFFFFFF77 & 0x37BB;
        SquireBarrows.var2[27] = -(0xFFFFB39B & 0x6CE5) & (0xFFFFB6FE & 0x7BFD);
        SquireBarrows.var2[28] = 0xFFFFFBFE & 0x167F;
        SquireBarrows.var2[29] = 0xFFFF969B & 0x7BE6;
        SquireBarrows.var2[30] = -(0xFFFFC37F & 0x7DFF) & (0xFFFFDBFE & 0x77FF);
        SquireBarrows.var2[31] = 0xFFFFDA8B & 0x37FF;
        SquireBarrows.var2[32] = -(0xFFFFF83F & 0x2FE7) & (0xFFFFBFFF & 0x7AAF);
        SquireBarrows.var2[33] = -(0xFFFFFD7B & 0x6EF5) & (0xFFFFFEFD & Short.MAX_VALUE);
        SquireBarrows.var2[34] = 0xFFFF92CF & 0x7FBF;
        SquireBarrows.var2[35] = 0xFFFFDFED & 0x3276;
        SquireBarrows.var2[36] = 0xFFFFBE6E & 0x53F7;
        SquireBarrows.var2[37] = 0xFFFFFE6B & 0x13FC;
        SquireBarrows.var2[38] = -(0xFFFFEE5E & 0x79B7) & (0xFFFFFAFF & 0x7F7F);
        SquireBarrows.var2[39] = -(0xFFFFEC2B & 0x5FD5) & (0xFFFFFE6F & 0x5FFE);
        SquireBarrows.var2[40] = 0xFFFFB6FF & 0x5B6C;
        SquireBarrows.var2[41] = -(0xFFFFB9A7 & 0x6FDD) & (0xFFFFFBFC & 0x3FF7);
        SquireBarrows.var2[42] = 0xFFFFFA7A & 0x17F7;
        SquireBarrows.var2[43] = 0xFFFF92F7 & 0x7F7C;
        SquireBarrows.var2[44] = -(0xFFFFDF87 & 0x24FF) & (0xFFFF97FF & 0x7EFE);
        SquireBarrows.var2[45] = 0xFFFFB6FE & 0x5B7B;
        SquireBarrows.var2[46] = -(0xFFFFE2EF & 0x3D99) & (0xFFFFF2FE & 0x3FFF);
        SquireBarrows.var2[47] = 0xFFFF96FF & 0x7B91;
        SquireBarrows.var2[48] = 0xFFFF93D5 & 0x7EBF;
        SquireBarrows.var2[49] = 0xFFFFF2F7 & 0x1F9F;
        SquireBarrows.var2[50] = -(0xFFFFEFF5 & 0x516F) & (0xFFFFFBFF & 0x57F7);
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
            String[] stringArray = new String[var2[11]];
            stringArray[SquireBarrows.var2[2]] = var1[var2[3]];
            if (SquireBarrows.var11(item.hasAction(stringArray) ? 1 : 0) && (!SquireBarrows.var10(item.getName().toLowerCase().contains(var1[var2[16]]) ? 1 : 0) || SquireBarrows.var11(item.getName().toLowerCase().contains(var1[var2[17]]) ? 1 : 0))) {
                n2 = var2[11];
                0;
                if (2 < 1) {
                    return ((0x4D ^ 0x7B) & ~(0x1B ^ 0x2D)) != 0;
                }
            } else {
                n2 = var2[2];
            }
            return n2 != 0;
        });
        if (SquireBarrows.var6(item2)) {
            return var2[2];
        }
        item2.interact(var1[var2[13]]);
        return var2[11];
    }

    public SquireBarrows() {
        this.e = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
        this.m = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
    }

    private static void var4() {
        var1 = new String[var2[18]];
        SquireBarrows.var1[SquireBarrows.var2[2]] = "Door";
        SquireBarrows.var1[SquireBarrows.var2[11]] = "Open";
        SquireBarrows.var1[SquireBarrows.var2[13]] = "Drink";
        SquireBarrows.var1[SquireBarrows.var2[14]] = "Select";
        SquireBarrows.var1[SquireBarrows.var2[15]] = "locking mechanism";
        SquireBarrows.var1[SquireBarrows.var2[0]] = "Barrows chest count";
        SquireBarrows.var1[SquireBarrows.var2[3]] = "Drink";
        SquireBarrows.var1[SquireBarrows.var2[16]] = "prayer";
        SquireBarrows.var1[SquireBarrows.var2[17]] = "restore";
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    public boolean h() {
        int n2;
        Player player = this.k.getLocalPlayer();
        if (SquireBarrows.var12(player) && SquireBarrows.var5(player.getWorldLocation().getRegionID(), var2[25])) {
            n2 = var2[11];
            0;
            if (((0xB ^ 0x2C) & ~(0x65 ^ 0x42)) > 0) {
                return ((0x20 ^ 0x67) & ~(0x81 ^ 0xC6)) != 0;
            }
        } else {
            n2 = var2[2];
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
        void var15;
        int n2 = var2[2];
        d[] dArray = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.values();
        int n3 = dArray.length;
        int var16 = var2[2];
        while (SquireBarrows.var14(var16, (int)var15)) {
            SquireBarrows var17;
            void var18;
            void var19 = var18[var16];
            if (SquireBarrows.var11(var17.a((d)var19) ? 1 : 0)) {
                void var20;
                ++var20;
            }
            ++var16;
            0;
            if ((0x5D ^ 0x59) > 3) continue;
            return (0xBE ^ 0xAB) & ~(6 ^ 0x13);
        }
        return n2;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        if (SquireBarrows.var11(lootReceived.getItems().stream().anyMatch(itemStack -> b.contains((Object)itemStack.getId())) ? 1 : 0)) {
            this.s += var2[11];
        }
    }

    private static boolean var13(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(WidgetLoaded widgetLoaded) {
        if (SquireBarrows.var5(widgetLoaded.getGroupId(), var2[5])) {
            int n2 = Static.getClient().getWidget(WidgetInfo.BARROWS_FIRST_PUZZLE).getModelId() - var2[14];
            this.i = null;
            UnmodifiableIterator var27 = a.iterator();
            while (SquireBarrows.var11(var27.hasNext() ? 1 : 0)) {
                void var28;
                WidgetInfo var29 = (WidgetInfo)var27.next();
                Widget var30 = Static.getClient().getWidget(var29);
                if (SquireBarrows.var12(var30) && SquireBarrows.var5(var30.getModelId(), (int)var28)) {
                    var31.i = Static.getClient().getWidget(var29);
                    var30.interact(var1[var2[14]]);
                    0;
                    if (3 >= 0) break;
                    return;
                }
                0;
                if ((0x96 ^ 0x92) > 0) continue;
                return;
            }
        }
    }

    public boolean l() {
        boolean bl;
        Widget widget = this.k.getWidget(WidgetInfo.BARROWS_BROTHERS);
        if (SquireBarrows.var12(widget)) {
            bl = var2[11];
            0;
            if (-1 >= 3) {
                return ((0x4C ^ 0x62) & ~(0x76 ^ 0x58)) != 0;
            }
        } else {
            bl = var2[2];
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

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var32(Object object, Object object2) {
        return object == object2;
    }

    private void b() {
        this.r = var2[2];
        this.s = var2[2];
        this.q = var2[2];
        this.e = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
        this.m = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
        this.l = null;
        this.j = var2[2];
        this.i = null;
        this.t = null;
        this.k.forcedLogoutWildy();
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }

    public int d() {
        return this.o.d();
    }

    private static String var39(String var40, String var41) {
        var40 = new String(Base64.getDecoder().decode(var40.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var42 = new StringBuilder();
        char[] var43 = var41.toCharArray();
        int var44 = var2[2];
        char[] var45 = var40.toCharArray();
        int var46 = var45.length;
        int var47 = var2[2];
        while (SquireBarrows.var14(var47, var46)) {
            char var48 = var45[var47];
            var42.append((char)(var48 ^ var43[var44 % var43.length]));
            0;
            ++var44;
            ++var47;
            0;
            if (((0x75 ^ 0x7B) & ~(5 ^ 0xB)) == 0) continue;
            return null;
        }
        return String.valueOf(var42);
    }

    public boolean i() {
        d d2;
        if (SquireBarrows.var6((Object)this.m)) {
            d2 = this.e;
            0;
            if (-1 > 3) {
                return ((0xFD ^ 0x85 ^ (0xF3 ^ 0xB8)) & (0x88 ^ 0x80 ^ (0x95 ^ 0xAE) ^ -1)) != 0;
            }
        } else {
            SquireBarrows var49;
            d2 = var49.m;
        }
        return this.a(d2);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void var50;
        String string = chatMessage.getMessage();
        if (SquireBarrows.var11(string.contains(var1[var2[15]]) ? 1 : 0)) {
            this.j = var2[11];
        }
        if (SquireBarrows.var11(var50.contains(var1[var2[0]]) ? 1 : 0)) {
            var51.r += var2[11];
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
        0;
        Executors.newSingleThreadExecutor().submit(SquireBarrows::a);
        0;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (SquireBarrows.var32(npcDespawned.getNpc(), this.t)) {
            this.t = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean f() {
        boolean bl;
        SquireBarrows var52;
        void var53;
        Actor actor = Players.getLocal().getInteracting();
        if (SquireBarrows.var6(actor)) {
            return var2[2];
        }
        if (!SquireBarrows.var10(q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.a((Actor)var53) ? 1 : 0) || SquireBarrows.var11(var52.o.c(var52.d()).contains(var53.getName()) ? 1 : 0)) {
            bl = var2[11];
            0;
            if (((0x4A ^ 5) & ~(0xFC ^ 0xB3)) != 0) {
                return ((0x93 ^ 0xA6) & ~(0x20 ^ 0x15)) != 0;
            }
        } else {
            bl = var2[2];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    public boolean m() {
        void var54;
        this.k.forcedLogoutWildy();
        int[] nArray = this.k.getMapRegions();
        int n2 = nArray.length;
        int var55 = var2[2];
        while (SquireBarrows.var14(var55, (int)var54)) {
            void var56;
            void var57 = var56[var55];
            if (SquireBarrows.var5((int)var57, var2[26])) {
                return var2[11];
            }
            ++var55;
            0;
            if ((89 + 136 - 47 + 8 ^ 189 + 148 - 187 + 40) >= 0) continue;
            return ((58 + 190 - 94 + 57 ^ 17 + 99 - 12 + 44) & (0x53 ^ 0x7A ^ (0x40 ^ 0x2E) ^ -1)) != 0;
        }
        return var2[2];
    }

    public boolean a(d d2) {
        boolean bl;
        if (SquireBarrows.var13(this.k.getVarbitValue(d2.F()))) {
            bl = var2[11];
            0;
            if (-1 > 2) {
                return ((45 + 55 - 21 + 56 ^ 20 + 73 - 50 + 137) & (51 + 20 - -20 + 71 ^ 104 + 124 - 155 + 72 ^ -1)) != 0;
            }
        } else {
            bl = var2[2];
        }
        return bl;
    }

    public void a(NPC nPC) {
        this.t = nPC;
    }
}

