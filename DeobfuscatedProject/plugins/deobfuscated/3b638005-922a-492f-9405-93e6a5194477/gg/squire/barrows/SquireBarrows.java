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
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.a;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.c;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.d;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.g;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.h;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.j;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.k;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.l;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.m;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.n;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.o;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.p;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.q;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.r;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.s;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.t;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.u;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.v;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.w;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.x;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.y;
import q.s.-.i.r.e.r.w.r.s.o.u.b.a.z;

@PluginDescriptor(name="Squire Barrows", description="Does the barrows minigame", enabledByDefault=false)
public class SquireBarrows
extends SquirePlugin {
    private static /* synthetic */ String[] llllIlIIIII;
    private static final /* synthetic */ ImmutableList<WidgetInfo> a;
    @Inject
    private /* synthetic */ OverlayManager g;
    private /* synthetic */ boolean j;
    private /* synthetic */ d e;
    private /* synthetic */ int r;
    private /* synthetic */ int s;
    private /* synthetic */ NPC t;
    private static final /* synthetic */ ImmutableList<Integer> b;
    private /* synthetic */ d l;
    private /* synthetic */ d m;
    private static final /* synthetic */ int d;
    @Inject
    private /* synthetic */ a n;
    private /* synthetic */ Widget i;
    private static final /* synthetic */ int c;
    private static /* synthetic */ int[] llllIlIIIIl;
    @Inject
    private /* synthetic */ c o;
    @Inject
    private /* synthetic */ Client k;
    @Inject
    private /* synthetic */ ChatMessageManager f;
    @Inject
    private /* synthetic */ BarrowsInfoBox h;
    private /* synthetic */ boolean p;
    private /* synthetic */ boolean q;

    protected void onStop() {
        this.b();
        this.g.remove((Overlay)this.h);
        0;
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
        TileObject llllllllllllllllIIIllIllIIIIIIII;
        SquireBarrows llllllllllllllllIIIllIllIIIIIIlI;
        Widget llllllllllllllllIIIllIllIIIIIIIl;
        if (SquireBarrows.lIllIlIlIIIIlI(this.m() ? 1 : 0) && SquireBarrows.lIllIlIlIIIIlI(this.h() ? 1 : 0) && SquireBarrows.lIllIlIlIIIIll(this.e(), llllIlIIIIl[3]) && SquireBarrows.lIllIlIlIIIIIl(this.v() ? 1 : 0)) {
            this.e = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
            this.m = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.DHAROK;
            this.l = null;
        }
        if (SquireBarrows.lIllIlIlIIIlII(llllllllllllllllIIIllIllIIIIIIIl = llllllllllllllllIIIllIllIIIIIIlI.o()) && SquireBarrows.lIllIlIlIIIIlI(llllllllllllllllIIIllIllIIIIIIIl.isHidden() ? 1 : 0)) {
            if (SquireBarrows.lIllIlIlIIIIll(llllllllllllllllIIIllIllIIIIIIIl.getId(), llllIlIIIIl[4])) {
                llllllllllllllllIIIllIllIIIIIIII = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append("Solving Puzzle " + llllllllllllllllIIIllIllIIIIIIIl.getId()).append(ChatColorType.NORMAL);
                llllllllllllllllIIIllIllIIIIIIlI.f.queue(QueuedMessage.builder().type(ChatMessageType.ITEM_EXAMINE).runeLiteFormattedMessage(llllllllllllllllIIIllIllIIIIIIII.build()).build());
                Widgets.get((int)llllIlIIIIl[5], (int)llllIlIIIIl[6]).interact(llllIlIIIIl[2]);
            }
            if (SquireBarrows.lIllIlIlIIIIll(llllllllllllllllIIIllIllIIIIIIIl.getId(), llllIlIIIIl[7])) {
                llllllllllllllllIIIllIllIIIIIIII = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append("Solving Puzzle " + llllllllllllllllIIIllIllIIIIIIIl.getId()).append(ChatColorType.NORMAL);
                llllllllllllllllIIIllIllIIIIIIlI.f.queue(QueuedMessage.builder().type(ChatMessageType.ITEM_EXAMINE).runeLiteFormattedMessage(llllllllllllllllIIIllIllIIIIIIII.build()).build());
                Widgets.get((int)llllIlIIIIl[5], (int)llllIlIIIIl[8]).interact(llllIlIIIIl[2]);
            }
            if (SquireBarrows.lIllIlIlIIIIll(llllllllllllllllIIIllIllIIIIIIIl.getId(), llllIlIIIIl[9])) {
                llllllllllllllllIIIllIllIIIIIIII = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append("Solving Puzzle " + llllllllllllllllIIIllIllIIIIIIIl.getId()).append(ChatColorType.NORMAL);
                llllllllllllllllIIIllIllIIIIIIlI.f.queue(QueuedMessage.builder().type(ChatMessageType.ITEM_EXAMINE).runeLiteFormattedMessage(llllllllllllllllIIIllIllIIIIIIII.build()).build());
                Widgets.get((int)llllIlIIIIl[5], (int)llllIlIIIIl[10]).interact(llllIlIIIIl[2]);
            }
        }
        if (SquireBarrows.lIllIlIlIIIIIl(llllllllllllllllIIIllIllIIIIIIlI.j ? 1 : 0)) {
            String[] stringArray = new String[llllIlIIIIl[11]];
            stringArray[SquireBarrows.llllIlIIIIl[2]] = llllIlIIIII[llllIlIIIIl[2]];
            llllllllllllllllIIIllIllIIIIIIII = TileObjects.getNearest((String[])stringArray);
            if (SquireBarrows.lIllIlIlIIIlII(llllllllllllllllIIIllIllIIIIIIII)) {
                llllllllllllllllIIIllIllIIIIIIII.interact(llllIlIIIII[llllIlIIIIl[11]]);
                llllllllllllllllIIIllIllIIIIIIlI.j = llllIlIIIIl[2];
            }
        }
    }

    private static void a() {
        if (SquireBarrows.lIllIlIlIIIIIl(((RSClient)Static.getClient()).isTesting() ? 1 : 0)) {
            int n2 = Rand.nextInt((int)llllIlIIIIl[0], (int)llllIlIIIIl[1]);
            Executors.newSingleThreadScheduledExecutor().schedule(() -> System.exit(llllIlIIIIl[2]), (long)n2, TimeUnit.MINUTES);
            0;
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llllIlIIIIl[12]];
        classArray[SquireBarrows.llllIlIIIIl[2]] = g.class;
        classArray[SquireBarrows.llllIlIIIIl[11]] = q.class;
        classArray[SquireBarrows.llllIlIIIIl[13]] = o.class;
        classArray[SquireBarrows.llllIlIIIIl[14]] = n.class;
        classArray[SquireBarrows.llllIlIIIIl[15]] = p.class;
        classArray[SquireBarrows.llllIlIIIIl[0]] = z.class;
        classArray[SquireBarrows.llllIlIIIIl[3]] = y.class;
        classArray[SquireBarrows.llllIlIIIIl[16]] = w.class;
        classArray[SquireBarrows.llllIlIIIIl[17]] = x.class;
        classArray[SquireBarrows.llllIlIIIIl[18]] = t.class;
        classArray[SquireBarrows.llllIlIIIIl[19]] = u.class;
        classArray[SquireBarrows.llllIlIIIIl[20]] = v.class;
        classArray[SquireBarrows.llllIlIIIIl[8]] = s.class;
        classArray[SquireBarrows.llllIlIIIIl[21]] = r.class;
        classArray[SquireBarrows.llllIlIIIIl[6]] = j.class;
        classArray[SquireBarrows.llllIlIIIIl[22]] = k.class;
        classArray[SquireBarrows.llllIlIIIIl[10]] = h.class;
        classArray[SquireBarrows.llllIlIIIIl[23]] = m.class;
        classArray[SquireBarrows.llllIlIIIIl[24]] = l.class;
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

    private static void lIllIlIlIIIIII() {
        llllIlIIIIl = new int[51];
        SquireBarrows.llllIlIIIIl[0] = 0x22 ^ 0x27;
        SquireBarrows.llllIlIIIIl[1] = 77 + 151 - 203 + 157 ^ 132 + 42 - 161 + 136;
        SquireBarrows.llllIlIIIIl[2] = (25 + 10 - -155 + 65 ^ 64 + 164 - 108 + 64) & (0xD7 ^ 0x9F ^ (0xAE ^ 0xA1) ^ -1);
        SquireBarrows.llllIlIIIIl[3] = 0x10 ^ 0x16;
        SquireBarrows.llllIlIIIIl[4] = -(0xFFFFFFFB & 0x2B5) & (0xFFFF87FF & 0x197ABF);
        SquireBarrows.llllIlIIIIl[5] = 0xC8 ^ 0xB0 ^ (0xE7 ^ 0x86);
        SquireBarrows.llllIlIIIIl[6] = 3 ^ 0x35 ^ (0x7F ^ 0x47);
        SquireBarrows.llllIlIIIIl[7] = 0xFFFFAC7F & 0x19538D;
        SquireBarrows.llllIlIIIIl[8] = 0x18 ^ 0x6F ^ (0x2D ^ 0x56);
        SquireBarrows.llllIlIIIIl[9] = 0xFFFFCF17 & 0x1930F9;
        SquireBarrows.llllIlIIIIl[10] = 0xB5 ^ 0x82 ^ (0x86 ^ 0xA1);
        SquireBarrows.llllIlIIIIl[11] = 1;
        SquireBarrows.llllIlIIIIl[12] = 0x8A ^ 0x82 ^ (0x56 ^ 0x4D);
        SquireBarrows.llllIlIIIIl[13] = 2;
        SquireBarrows.llllIlIIIIl[14] = 3;
        SquireBarrows.llllIlIIIIl[15] = 0x51 ^ 0x55;
        SquireBarrows.llllIlIIIIl[16] = 0x46 ^ 0x41;
        SquireBarrows.llllIlIIIIl[17] = 0x24 ^ 0x45 ^ (0xC6 ^ 0xAF);
        SquireBarrows.llllIlIIIIl[18] = 116 + 12 - -29 + 0 ^ 117 + 56 - 52 + 27;
        SquireBarrows.llllIlIIIIl[19] = 0xF8 ^ 0x89 ^ (9 ^ 0x72);
        SquireBarrows.llllIlIIIIl[20] = 131 + 24 - 84 + 116 ^ 155 + 28 - 165 + 158;
        SquireBarrows.llllIlIIIIl[21] = 0xC5 ^ 0xBD ^ (0xE6 ^ 0x93);
        SquireBarrows.llllIlIIIIl[22] = 0xA8 ^ 0xA7;
        SquireBarrows.llllIlIIIIl[23] = 0x7E ^ 0x2D ^ (0x64 ^ 0x26);
        SquireBarrows.llllIlIIIIl[24] = 20 + 79 - 41 + 98 ^ 34 + 3 - -19 + 86;
        SquireBarrows.llllIlIIIIl[25] = 0xFFFFB7B7 & 0x7FDF;
        SquireBarrows.llllIlIIIIl[26] = 0xFFFFFF77 & 0x37BB;
        SquireBarrows.llllIlIIIIl[27] = -(0xFFFFB39B & 0x6CE5) & (0xFFFFB6FE & 0x7BFD);
        SquireBarrows.llllIlIIIIl[28] = 0xFFFFFBFE & 0x167F;
        SquireBarrows.llllIlIIIIl[29] = 0xFFFF969B & 0x7BE6;
        SquireBarrows.llllIlIIIIl[30] = -(0xFFFFC37F & 0x7DFF) & (0xFFFFDBFE & 0x77FF);
        SquireBarrows.llllIlIIIIl[31] = 0xFFFFDA8B & 0x37FF;
        SquireBarrows.llllIlIIIIl[32] = -(0xFFFFF83F & 0x2FE7) & (0xFFFFBFFF & 0x7AAF);
        SquireBarrows.llllIlIIIIl[33] = -(0xFFFFFD7B & 0x6EF5) & (0xFFFFFEFD & Short.MAX_VALUE);
        SquireBarrows.llllIlIIIIl[34] = 0xFFFF92CF & 0x7FBF;
        SquireBarrows.llllIlIIIIl[35] = 0xFFFFDFED & 0x3276;
        SquireBarrows.llllIlIIIIl[36] = 0xFFFFBE6E & 0x53F7;
        SquireBarrows.llllIlIIIIl[37] = 0xFFFFFE6B & 0x13FC;
        SquireBarrows.llllIlIIIIl[38] = -(0xFFFFEE5E & 0x79B7) & (0xFFFFFAFF & 0x7F7F);
        SquireBarrows.llllIlIIIIl[39] = -(0xFFFFEC2B & 0x5FD5) & (0xFFFFFE6F & 0x5FFE);
        SquireBarrows.llllIlIIIIl[40] = 0xFFFFB6FF & 0x5B6C;
        SquireBarrows.llllIlIIIIl[41] = -(0xFFFFB9A7 & 0x6FDD) & (0xFFFFFBFC & 0x3FF7);
        SquireBarrows.llllIlIIIIl[42] = 0xFFFFFA7A & 0x17F7;
        SquireBarrows.llllIlIIIIl[43] = 0xFFFF92F7 & 0x7F7C;
        SquireBarrows.llllIlIIIIl[44] = -(0xFFFFDF87 & 0x24FF) & (0xFFFF97FF & 0x7EFE);
        SquireBarrows.llllIlIIIIl[45] = 0xFFFFB6FE & 0x5B7B;
        SquireBarrows.llllIlIIIIl[46] = -(0xFFFFE2EF & 0x3D99) & (0xFFFFF2FE & 0x3FFF);
        SquireBarrows.llllIlIIIIl[47] = 0xFFFF96FF & 0x7B91;
        SquireBarrows.llllIlIIIIl[48] = 0xFFFF93D5 & 0x7EBF;
        SquireBarrows.llllIlIIIIl[49] = 0xFFFFF2F7 & 0x1F9F;
        SquireBarrows.llllIlIIIIl[50] = -(0xFFFFEFF5 & 0x516F) & (0xFFFFFBFF & 0x57F7);
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
                0;
                if (2 < 1) {
                    return ((0x4D ^ 0x7B) & ~(0x1B ^ 0x2D)) != 0;
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
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[2]] = SquireBarrows."Door";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[11]] = SquireBarrows."Open";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[13]] = SquireBarrows."Drink";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[14]] = SquireBarrows."Select";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[15]] = SquireBarrows."locking mechanism";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[0]] = SquireBarrows."Barrows chest count";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[3]] = SquireBarrows."Drink";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[16]] = SquireBarrows."prayer";
        SquireBarrows.llllIlIIIII[SquireBarrows.llllIlIIIIl[17]] = SquireBarrows."restore";
    }

    private static boolean lIllIlIlIIIIIl(int n2) {
        return n2 != 0;
    }

    public boolean h() {
        int n2;
        Player player = this.k.getLocalPlayer();
        if (SquireBarrows.lIllIlIlIIIlII(player) && SquireBarrows.lIllIlIlIIIIll(player.getWorldLocation().getRegionID(), llllIlIIIIl[25])) {
            n2 = llllIlIIIIl[11];
            0;
            if (((0xB ^ 0x2C) & ~(0x65 ^ 0x42)) > 0) {
                return ((0x20 ^ 0x67) & ~(0x81 ^ 0xC6)) != 0;
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
        void llllllllllllllllIIIllIlIllllIlII;
        int n2 = llllIlIIIIl[2];
        d[] dArray = q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.values();
        int n3 = dArray.length;
        int llllllllllllllllIIIllIlIllllIIll = llllIlIIIIl[2];
        while (SquireBarrows.lIllIlIlIIIllI(llllllllllllllllIIIllIlIllllIIll, (int)llllllllllllllllIIIllIlIllllIlII)) {
            SquireBarrows llllllllllllllllIIIllIlIllllIlll;
            void llllllllllllllllIIIllIlIllllIlIl;
            void llllllllllllllllIIIllIlIllllIIlI = llllllllllllllllIIIllIlIllllIlIl[llllllllllllllllIIIllIlIllllIIll];
            if (SquireBarrows.lIllIlIlIIIIIl(llllllllllllllllIIIllIlIllllIlll.a((d)llllllllllllllllIIIllIlIllllIIlI) ? 1 : 0)) {
                void llllllllllllllllIIIllIlIllllIllI;
                ++llllllllllllllllIIIllIlIllllIllI;
            }
            ++llllllllllllllllIIIllIlIllllIIll;
            0;
            if ((0x5D ^ 0x59) > 3) continue;
            return (0xBE ^ 0xAB) & ~(6 ^ 0x13);
        }
        return n2;
    }

    private static String lIllIlIIllllIl(String llllllllllllllllIIIllIlIlIIlllIl, String llllllllllllllllIIIllIlIlIIlllII) {
        try {
            SecretKeySpec llllllllllllllllIIIllIlIlIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIlIlIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllIlIlIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllIlIlIIlllll.init(llllIlIIIIl[13], llllllllllllllllIIIllIlIlIlIIIII);
            return new String(llllllllllllllllIIIllIlIlIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIlIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIlIlIIllllI) {
            llllllllllllllllIIIllIlIlIIllllI.printStackTrace();
            return null;
        }
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
            UnmodifiableIterator llllllllllllllllIIIllIlIlllIIlII = a.iterator();
            while (SquireBarrows.lIllIlIlIIIIIl(llllllllllllllllIIIllIlIlllIIlII.hasNext() ? 1 : 0)) {
                void llllllllllllllllIIIllIlIlllIIlIl;
                WidgetInfo llllllllllllllllIIIllIlIlllIIIll = (WidgetInfo)llllllllllllllllIIIllIlIlllIIlII.next();
                Widget llllllllllllllllIIIllIlIlllIIIlI = Static.getClient().getWidget(llllllllllllllllIIIllIlIlllIIIll);
                if (SquireBarrows.lIllIlIlIIIlII(llllllllllllllllIIIllIlIlllIIIlI) && SquireBarrows.lIllIlIlIIIIll(llllllllllllllllIIIllIlIlllIIIlI.getModelId(), (int)llllllllllllllllIIIllIlIlllIIlIl)) {
                    llllllllllllllllIIIllIlIlllIIlll.i = Static.getClient().getWidget(llllllllllllllllIIIllIlIlllIIIll);
                    llllllllllllllllIIIllIlIlllIIIlI.interact(llllIlIIIII[llllIlIIIIl[14]]);
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
        if (SquireBarrows.lIllIlIlIIIlII(widget)) {
            bl = llllIlIIIIl[11];
            0;
            if (-1 >= 3) {
                return ((0x4C ^ 0x62) & ~(0x76 ^ 0x58)) != 0;
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

    private static String lIllIlIIlllllI(String llllllllllllllllIIIllIlIlIlIlIlI, String llllllllllllllllIIIllIlIlIlIIlll) {
        try {
            SecretKeySpec llllllllllllllllIIIllIlIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIlIlIlIIlll.getBytes(StandardCharsets.UTF_8)), llllIlIIIIl[17]), "DES");
            Cipher llllllllllllllllIIIllIlIlIlIllII = Cipher.getInstance("DES");
            llllllllllllllllIIIllIlIlIlIllII.init(llllIlIIIIl[13], llllllllllllllllIIIllIlIlIlIllIl);
            return new String(llllllllllllllllIIIllIlIlIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIlIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIIllIlIlIlIlIll) {
            llllllllllllllllIIIllIlIlIlIlIll.printStackTrace();
            return null;
        }
    }

    public int d() {
        return this.o.d();
    }

    private static String lIllIlIIllllII(String llllllllllllllllIIIllIlIlIIIllIl, String llllllllllllllllIIIllIlIlIIIIlll) {
        llllllllllllllllIIIllIlIlIIIllIl = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIlIlIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllIlIlIIIlIll = new StringBuilder();
        char[] llllllllllllllllIIIllIlIlIIIlIlI = llllllllllllllllIIIllIlIlIIIIlll.toCharArray();
        int llllllllllllllllIIIllIlIlIIIlIIl = llllIlIIIIl[2];
        char[] llllllllllllllllIIIllIlIlIIIIIll = llllllllllllllllIIIllIlIlIIIllIl.toCharArray();
        int llllllllllllllllIIIllIlIlIIIIIlI = llllllllllllllllIIIllIlIlIIIIIll.length;
        int llllllllllllllllIIIllIlIlIIIIIIl = llllIlIIIIl[2];
        while (SquireBarrows.lIllIlIlIIIllI(llllllllllllllllIIIllIlIlIIIIIIl, llllllllllllllllIIIllIlIlIIIIIlI)) {
            char llllllllllllllllIIIllIlIlIIIlllI = llllllllllllllllIIIllIlIlIIIIIll[llllllllllllllllIIIllIlIlIIIIIIl];
            llllllllllllllllIIIllIlIlIIIlIll.append((char)(llllllllllllllllIIIllIlIlIIIlllI ^ llllllllllllllllIIIllIlIlIIIlIlI[llllllllllllllllIIIllIlIlIIIlIIl % llllllllllllllllIIIllIlIlIIIlIlI.length]));
            0;
            ++llllllllllllllllIIIllIlIlIIIlIIl;
            ++llllllllllllllllIIIllIlIlIIIIIIl;
            0;
            if (((0x75 ^ 0x7B) & ~(5 ^ 0xB)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIIllIlIlIIIlIll);
    }

    public boolean i() {
        d d2;
        if (SquireBarrows.lIllIlIlIIIlIl((Object)this.m)) {
            d2 = this.e;
            0;
            if (-1 > 3) {
                return ((0xFD ^ 0x85 ^ (0xF3 ^ 0xB8)) & (0x88 ^ 0x80 ^ (0x95 ^ 0xAE) ^ -1)) != 0;
            }
        } else {
            SquireBarrows llllllllllllllllIIIllIlIllIIIllI;
            d2 = llllllllllllllllIIIllIlIllIIIllI.m;
        }
        return this.a(d2);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void llllllllllllllllIIIllIlIllIllIII;
        String string = chatMessage.getMessage();
        if (SquireBarrows.lIllIlIlIIIIIl(string.contains(llllIlIIIII[llllIlIIIIl[15]]) ? 1 : 0)) {
            this.j = llllIlIIIIl[11];
        }
        if (SquireBarrows.lIllIlIlIIIIIl(llllllllllllllllIIIllIlIllIllIII.contains(llllIlIIIII[llllIlIIIIl[0]]) ? 1 : 0)) {
            llllllllllllllllIIIllIlIllIllIlI.r += llllIlIIIIl[11];
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
        if (SquireBarrows.lIllIlIlIIIlll(npcDespawned.getNpc(), this.t)) {
            this.t = null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean f() {
        boolean bl;
        SquireBarrows llllllllllllllllIIIllIlIlllIllll;
        void llllllllllllllllIIIllIlIlllIlllI;
        Actor actor = Players.getLocal().getInteracting();
        if (SquireBarrows.lIllIlIlIIIlIl(actor)) {
            return llllIlIIIIl[2];
        }
        if (!SquireBarrows.lIllIlIlIIIIlI(q.s.-.i.r.e.r.w.r.s.o.u.b.a.d.a((Actor)llllllllllllllllIIIllIlIlllIlllI) ? 1 : 0) || SquireBarrows.lIllIlIlIIIIIl(llllllllllllllllIIIllIlIlllIllll.o.c(llllllllllllllllIIIllIlIlllIllll.d()).contains(llllllllllllllllIIIllIlIlllIlllI.getName()) ? 1 : 0)) {
            bl = llllIlIIIIl[11];
            0;
            if (((0x4A ^ 5) & ~(0xFC ^ 0xB3)) != 0) {
                return ((0x93 ^ 0xA6) & ~(0x20 ^ 0x15)) != 0;
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
        void llllllllllllllllIIIllIlIlIllIllI;
        this.k.forcedLogoutWildy();
        int[] nArray = this.k.getMapRegions();
        int n2 = nArray.length;
        int llllllllllllllllIIIllIlIlIllIlIl = llllIlIIIIl[2];
        while (SquireBarrows.lIllIlIlIIIllI(llllllllllllllllIIIllIlIlIllIlIl, (int)llllllllllllllllIIIllIlIlIllIllI)) {
            void llllllllllllllllIIIllIlIlIllIlll;
            void llllllllllllllllIIIllIlIlIllIlII = llllllllllllllllIIIllIlIlIllIlll[llllllllllllllllIIIllIlIlIllIlIl];
            if (SquireBarrows.lIllIlIlIIIIll((int)llllllllllllllllIIIllIlIlIllIlII, llllIlIIIIl[26])) {
                return llllIlIIIIl[11];
            }
            ++llllllllllllllllIIIllIlIlIllIlIl;
            0;
            if ((89 + 136 - 47 + 8 ^ 189 + 148 - 187 + 40) >= 0) continue;
            return ((58 + 190 - 94 + 57 ^ 17 + 99 - 12 + 44) & (0x53 ^ 0x7A ^ (0x40 ^ 0x2E) ^ -1)) != 0;
        }
        return llllIlIIIIl[2];
    }

    public boolean a(d d2) {
        boolean bl;
        if (SquireBarrows.lIllIlIlIIlIII(this.k.getVarbitValue(d2.F()))) {
            bl = llllIlIIIIl[11];
            0;
            if (-1 > 2) {
                return ((45 + 55 - 21 + 56 ^ 20 + 73 - 50 + 137) & (51 + 20 - -20 + 71 ^ 104 + 124 - 155 + 72 ^ -1)) != 0;
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

