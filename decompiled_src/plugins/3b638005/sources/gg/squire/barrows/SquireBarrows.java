package gg.squire.barrows;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.inject.Provides;
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
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.a;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.c;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.d;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.g;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.h;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.j;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.k;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.l;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.m;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.n;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.o;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.p;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.q;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.r;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.s;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.t;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.u;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.v;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.w;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.x;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.y;
import q.s.p000.i.r.e.r.w.r.s.o.u.b.a.z;
@PluginDescriptor(name = "Squire Barrows", description = "Does the barrows minigame", enabledByDefault = false)
/* loaded from: 3b638005-922a-492f-9405-93e6a5194477.jar:gg/squire/barrows/SquireBarrows.class */
public class SquireBarrows extends SquirePlugin {
    private static /* synthetic */ String[] llllIlIIIII;
    private static final /* synthetic */ ImmutableList<WidgetInfo> a;
    @Inject
    private /* synthetic */ OverlayManager g;
    private /* synthetic */ boolean j;
    private /* synthetic */ int r;
    private /* synthetic */ int s;
    private /* synthetic */ NPC t;
    private static final /* synthetic */ ImmutableList<Integer> b;
    private /* synthetic */ d l;
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

    /* renamed from: q  reason: collision with root package name */
    private /* synthetic */ boolean f0q;
    private /* synthetic */ d e = d.DHAROK;
    private /* synthetic */ d m = d.DHAROK;

    protected void onStop() {
        b();
        this.g.remove(this.h);
        "".length();
    }

    static {
        lIllIlIlIIIIII();
        lIllIlIIllllll();
        c = llllIlIIIIl[25];
        d = llllIlIIIIl[26];
        a = ImmutableList.of(WidgetInfo.BARROWS_PUZZLE_ANSWER1, WidgetInfo.BARROWS_PUZZLE_ANSWER2, WidgetInfo.BARROWS_PUZZLE_ANSWER3);
        Integer valueOf = Integer.valueOf(llllIlIIIIl[27]);
        Integer valueOf2 = Integer.valueOf(llllIlIIIIl[28]);
        Integer valueOf3 = Integer.valueOf(llllIlIIIIl[29]);
        Integer valueOf4 = Integer.valueOf(llllIlIIIIl[30]);
        Integer valueOf5 = Integer.valueOf(llllIlIIIIl[31]);
        Integer valueOf6 = Integer.valueOf(llllIlIIIIl[32]);
        Integer valueOf7 = Integer.valueOf(llllIlIIIIl[33]);
        Integer valueOf8 = Integer.valueOf(llllIlIIIIl[34]);
        Integer valueOf9 = Integer.valueOf(llllIlIIIIl[35]);
        Integer valueOf10 = Integer.valueOf(llllIlIIIIl[36]);
        Integer valueOf11 = Integer.valueOf(llllIlIIIIl[37]);
        Integer valueOf12 = Integer.valueOf(llllIlIIIIl[38]);
        Integer[] numArr = new Integer[llllIlIIIIl[8]];
        numArr[llllIlIIIIl[2]] = Integer.valueOf(llllIlIIIIl[39]);
        numArr[llllIlIIIIl[11]] = Integer.valueOf(llllIlIIIIl[40]);
        numArr[llllIlIIIIl[13]] = Integer.valueOf(llllIlIIIIl[41]);
        numArr[llllIlIIIIl[14]] = Integer.valueOf(llllIlIIIIl[42]);
        numArr[llllIlIIIIl[15]] = Integer.valueOf(llllIlIIIIl[43]);
        numArr[llllIlIIIIl[0]] = Integer.valueOf(llllIlIIIIl[44]);
        numArr[llllIlIIIIl[3]] = Integer.valueOf(llllIlIIIIl[45]);
        numArr[llllIlIIIIl[16]] = Integer.valueOf(llllIlIIIIl[46]);
        numArr[llllIlIIIIl[17]] = Integer.valueOf(llllIlIIIIl[47]);
        numArr[llllIlIIIIl[18]] = Integer.valueOf(llllIlIIIIl[48]);
        numArr[llllIlIIIIl[19]] = Integer.valueOf(llllIlIIIIl[49]);
        numArr[llllIlIIIIl[20]] = Integer.valueOf(llllIlIIIIl[50]);
        b = ImmutableList.of(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, numArr);
    }

    @Provides
    SquireBarrowsConfig a(ConfigManager configManager) {
        return (SquireBarrowsConfig) configManager.getConfig(SquireBarrowsConfig.class);
    }

    public d n() {
        return this.e;
    }

    public Widget o() {
        return this.i;
    }

    public void j() {
        a(llllIlIIIIl[2]);
    }

    @Subscribe
    public void a(WidgetClosed widgetClosed) {
        if (lIllIlIlIIIIll(widgetClosed.getGroupId(), llllIlIIIIl[5])) {
            this.i = null;
        }
    }

    private static boolean lIllIlIlIIIlIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (lIllIlIlIIIIlI(m() ? 1 : 0) && lIllIlIlIIIIlI(h() ? 1 : 0) && lIllIlIlIIIIll(e(), llllIlIIIIl[3]) && lIllIlIlIIIIIl(v() ? 1 : 0)) {
            this.e = d.DHAROK;
            this.m = d.DHAROK;
            this.l = null;
        }
        Widget o = o();
        if (lIllIlIlIIIlII(o) && lIllIlIlIIIIlI(o.isHidden() ? 1 : 0)) {
            if (lIllIlIlIIIIll(o.getId(), llllIlIIIIl[4])) {
                this.f.queue(QueuedMessage.builder().type(ChatMessageType.ITEM_EXAMINE).runeLiteFormattedMessage(new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append("Solving Puzzle " + o.getId()).append(ChatColorType.NORMAL).build()).build());
                Widgets.get(llllIlIIIIl[5], llllIlIIIIl[6]).interact(llllIlIIIIl[2]);
            }
            if (lIllIlIlIIIIll(o.getId(), llllIlIIIIl[7])) {
                this.f.queue(QueuedMessage.builder().type(ChatMessageType.ITEM_EXAMINE).runeLiteFormattedMessage(new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append("Solving Puzzle " + o.getId()).append(ChatColorType.NORMAL).build()).build());
                Widgets.get(llllIlIIIIl[5], llllIlIIIIl[8]).interact(llllIlIIIIl[2]);
            }
            if (lIllIlIlIIIIll(o.getId(), llllIlIIIIl[9])) {
                this.f.queue(QueuedMessage.builder().type(ChatMessageType.ITEM_EXAMINE).runeLiteFormattedMessage(new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append("Solving Puzzle " + o.getId()).append(ChatColorType.NORMAL).build()).build());
                Widgets.get(llllIlIIIIl[5], llllIlIIIIl[10]).interact(llllIlIIIIl[2]);
            }
        }
        if (lIllIlIlIIIIIl(this.j ? 1 : 0)) {
            String[] strArr = new String[llllIlIIIIl[11]];
            strArr[llllIlIIIIl[2]] = llllIlIIIII[llllIlIIIIl[2]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (lIllIlIlIIIlII(nearest)) {
                nearest.interact(llllIlIIIII[llllIlIIIIl[11]]);
                this.j = llllIlIIIIl[2];
            }
        }
    }

    private static void a() {
        if (lIllIlIlIIIIIl(Static.getClient().isTesting() ? 1 : 0)) {
            Executors.newSingleThreadScheduledExecutor().schedule(() -> {
                System.exit(llllIlIIIIl[2]);
            }, Rand.nextInt(llllIlIIIIl[0], llllIlIIIIl[1]), TimeUnit.MINUTES);
            "".length();
        }
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llllIlIIIIl[12]];
        clsArr[llllIlIIIIl[2]] = g.class;
        clsArr[llllIlIIIIl[11]] = q.class;
        clsArr[llllIlIIIIl[13]] = o.class;
        clsArr[llllIlIIIIl[14]] = n.class;
        clsArr[llllIlIIIIl[15]] = p.class;
        clsArr[llllIlIIIIl[0]] = z.class;
        clsArr[llllIlIIIIl[3]] = y.class;
        clsArr[llllIlIIIIl[16]] = w.class;
        clsArr[llllIlIIIIl[17]] = x.class;
        clsArr[llllIlIIIIl[18]] = t.class;
        clsArr[llllIlIIIIl[19]] = u.class;
        clsArr[llllIlIIIIl[20]] = v.class;
        clsArr[llllIlIIIIl[8]] = s.class;
        clsArr[llllIlIIIIl[21]] = r.class;
        clsArr[llllIlIIIIl[6]] = j.class;
        clsArr[llllIlIIIIl[22]] = k.class;
        clsArr[llllIlIIIIl[10]] = h.class;
        clsArr[llllIlIIIIl[23]] = m.class;
        clsArr[llllIlIIIIl[24]] = l.class;
        return clsArr;
    }

    public void k() {
        this.l = this.m;
    }

    public NPC y() {
        return this.t;
    }

    private static boolean lIllIlIlIIIIlI(int i) {
        return i == 0;
    }

    public boolean p() {
        return this.j;
    }

    private void a(int i) {
        this.e = d.values()[(this.e.ordinal() + llllIlIIIIl[11]) % d.values().length];
        if (lIllIlIlIIlIII(this.k.getVarbitValue(this.e.F())) && lIllIlIlIIIllI(i, llllIlIIIIl[3])) {
            a(i + llllIlIIIIl[11]);
        }
    }

    public Client q() {
        return this.k;
    }

    private static boolean lIllIlIlIIIlII(Object obj) {
        return obj != null;
    }

    private static void lIllIlIlIIIIII() {
        llllIlIIIIl = new int[51];
        llllIlIIIIl[0] = 34 ^ 39;
        llllIlIIIIl[1] = (((77 + 151) - 203) + 157) ^ (((132 + 42) - 161) + 136);
        llllIlIIIIl[2] = ((((25 + 10) - (-155)) + 65) ^ (((64 + 164) - 108) + 64)) & (((215 ^ 159) ^ (174 ^ 161)) ^ (-" ".length()));
        llllIlIIIIl[3] = 16 ^ 22;
        llllIlIIIIl[4] = (-((-5) & 693)) & (-30721) & 1669823;
        llllIlIIIIl[5] = (200 ^ 176) ^ (231 ^ 134);
        llllIlIIIIl[6] = (3 ^ 53) ^ (127 ^ 71);
        llllIlIIIIl[7] = (-21377) & 1659789;
        llllIlIIIIl[8] = (24 ^ 111) ^ (45 ^ 86);
        llllIlIIIIl[9] = (-12521) & 1650937;
        llllIlIIIIl[10] = (181 ^ 130) ^ (134 ^ 161);
        llllIlIIIIl[11] = " ".length();
        llllIlIIIIl[12] = (138 ^ 130) ^ (86 ^ 77);
        llllIlIIIIl[13] = "  ".length();
        llllIlIIIIl[14] = "   ".length();
        llllIlIIIIl[15] = 81 ^ 85;
        llllIlIIIIl[16] = 70 ^ 65;
        llllIlIIIIl[17] = (36 ^ 69) ^ (198 ^ 175);
        llllIlIIIIl[18] = (((116 + 12) - (-29)) + 0) ^ (((117 + 56) - 52) + 27);
        llllIlIIIIl[19] = (248 ^ 137) ^ (9 ^ 114);
        llllIlIIIIl[20] = (((131 + 24) - 84) + 116) ^ (((155 + 28) - 165) + 158);
        llllIlIIIIl[21] = (197 ^ 189) ^ (230 ^ 147);
        llllIlIIIIl[22] = 168 ^ 167;
        llllIlIIIIl[23] = (126 ^ 45) ^ (100 ^ 38);
        llllIlIIIIl[24] = (((20 + 79) - 41) + 98) ^ (((34 + 3) - (-19)) + 86);
        llllIlIIIIl[25] = (-18505) & 32735;
        llllIlIIIIl[26] = (-137) & 14267;
        llllIlIIIIl[27] = (-((-19557) & 27877)) & (-18690) & 31741;
        llllIlIIIIl[28] = (-1026) & 5759;
        llllIlIIIIl[29] = (-26981) & 31718;
        llllIlIIIIl[30] = (-((-15489) & 32255)) & (-9218) & 30719;
        llllIlIIIIl[31] = (-9589) & 14335;
        llllIlIIIIl[32] = (-((-1985) & 12263)) & (-16385) & 31407;
        llllIlIIIIl[33] = (-((-645) & 28405)) & (-259) & 32767;
        llllIlIIIIl[34] = (-27953) & 32703;
        llllIlIIIIl[35] = (-8211) & 12918;
        llllIlIIIIl[36] = (-16786) & 21495;
        llllIlIIIIl[37] = (-405) & 5116;
        llllIlIIIIl[38] = (-((-4514) & 31159)) & (-1281) & 32639;
        llllIlIIIIl[39] = (-((-5077) & 24533)) & (-401) & 24574;
        llllIlIIIIl[40] = (-18689) & 23404;
        llllIlIIIIl[41] = (-((-18009) & 28637)) & (-1028) & 16375;
        llllIlIIIIl[42] = (-1414) & 6135;
        llllIlIIIIl[43] = (-27913) & 32636;
        llllIlIIIIl[44] = (-((-8313) & 9471)) & (-26625) & 32510;
        llllIlIIIIl[45] = (-18690) & 23419;
        llllIlIIIIl[46] = (-((-7441) & 15769)) & (-3330) & 16383;
        llllIlIIIIl[47] = (-26881) & 31633;
        llllIlIIIIl[48] = (-27691) & 32447;
        llllIlIIIIl[49] = (-3337) & 8095;
        llllIlIIIIl[50] = (-((-4107) & 20847)) & (-1025) & 22519;
    }

    public void b(d dVar) {
        this.m = dVar;
    }

    public boolean u() {
        return this.p;
    }

    public d r() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean c() {
        Item first = Inventory.getFirst(item -> {
            String[] strArr = new String[llllIlIIIIl[11]];
            strArr[llllIlIIIIl[2]] = llllIlIIIII[llllIlIIIIl[3]];
            if (!lIllIlIlIIIIIl(item.hasAction(strArr) ? 1 : 0) || (lIllIlIlIIIIlI(item.getName().toLowerCase().contains(llllIlIIIII[llllIlIIIIl[16]]) ? 1 : 0) && !lIllIlIlIIIIIl(item.getName().toLowerCase().contains(llllIlIIIII[llllIlIIIIl[17]]) ? 1 : 0))) {
                return llllIlIIIIl[2];
            }
            ?? r0 = llllIlIIIIl[11];
            "".length();
            return "  ".length() < " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        });
        if (lIllIlIlIIIlIl(first)) {
            return llllIlIIIIl[2];
        }
        first.interact(llllIlIIIII[llllIlIIIIl[13]]);
        return llllIlIIIIl[11];
    }

    private static void lIllIlIIllllll() {
        llllIlIIIII = new String[llllIlIIIIl[18]];
        llllIlIIIII[llllIlIIIIl[2]] = lIllIlIIllllII("IiUeJw==", "fJqUa");
        llllIlIIIII[llllIlIIIIl[11]] = lIllIlIIllllIl("hZYGg8GTXyw=", "mRtzS");
        llllIlIIIII[llllIlIIIIl[13]] = lIllIlIIlllllI("c0dlk97+sB0=", "RtEgj");
        llllIlIIIII[llllIlIIIIl[14]] = lIllIlIIlllllI("h0SPVMASJeY=", "mmleP");
        llllIlIIIII[llllIlIIIIl[15]] = lIllIlIIllllII("NjYAKD40PkMuMjkxAi0+KTQ=", "ZYcCW");
        llllIlIIIII[llllIlIIIIl[0]] = lIllIlIIllllIl("91IZ/AVbPVdxUiKVscq3Txxk0KxABg/S", "xaukC");
        llllIlIIIII[llllIlIIIIl[3]] = lIllIlIIllllIl("U3OH/Zm3bZI=", "PMLMw");
        llllIlIIIII[llllIlIIIIl[16]] = lIllIlIIlllllI("SGhm8yRUN/g=", "decDC");
        llllIlIIIII[llllIlIIIIl[17]] = lIllIlIIllllII("OwgGOg47CA==", "ImuNa");
    }

    private static boolean lIllIlIlIIIIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean h() {
        Player localPlayer = this.k.getLocalPlayer();
        if (lIllIlIlIIIlII(localPlayer) && lIllIlIlIIIIll(localPlayer.getWorldLocation().getRegionID(), llllIlIIIIl[25])) {
            ?? r0 = llllIlIIIIl[11];
            "".length();
            return ((11 ^ 44) & ((101 ^ 66) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIlIIIIl[2];
    }

    public void b(boolean z) {
        this.f0q = z;
    }

    public boolean v() {
        return this.f0q;
    }

    public int e() {
        int i = llllIlIIIIl[2];
        d[] values = d.values();
        int length = values.length;
        int i2 = llllIlIIIIl[2];
        while (lIllIlIlIIIllI(i2, length)) {
            if (lIllIlIlIIIIIl(a(values[i2]) ? 1 : 0)) {
                i++;
            }
            i2++;
            "".length();
            if ((93 ^ 89) <= "   ".length()) {
                return (190 ^ 171) & ((6 ^ 19) ^ (-1));
            }
        }
        return i;
    }

    private static String lIllIlIIllllIl(String llllllllllllllllIIIllIlIlIIlllIl, String llllllllllllllllIIIllIlIlIIlllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIlIlIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIIllIlIlIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIIllIlIlIIlllll.init(llllIlIIIIl[13], secretKeySpec);
            return new String(llllllllllllllllIIIllIlIlIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIlIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIlIlIIllllI) {
            llllllllllllllllIIIllIlIlIIllllI.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        if (lIllIlIlIIIIIl(lootReceived.getItems().stream().anyMatch(itemStack -> {
            return b.contains(Integer.valueOf(itemStack.getId()));
        }) ? 1 : 0)) {
            this.s += llllIlIIIIl[11];
        }
    }

    private static boolean lIllIlIlIIlIII(int i) {
        return i > 0;
    }

    @Subscribe
    public void a(WidgetLoaded widgetLoaded) {
        if (lIllIlIlIIIIll(widgetLoaded.getGroupId(), llllIlIIIIl[5])) {
            int modelId = Static.getClient().getWidget(WidgetInfo.BARROWS_FIRST_PUZZLE).getModelId() - llllIlIIIIl[14];
            this.i = null;
            UnmodifiableIterator it = a.iterator();
            while (lIllIlIlIIIIIl(it.hasNext() ? 1 : 0)) {
                WidgetInfo widgetInfo = (WidgetInfo) it.next();
                Widget widget = Static.getClient().getWidget(widgetInfo);
                if (lIllIlIlIIIlII(widget) && lIllIlIlIIIIll(widget.getModelId(), modelId)) {
                    this.i = Static.getClient().getWidget(widgetInfo);
                    widget.interact(llllIlIIIII[llllIlIIIIl[14]]);
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                    return;
                }
                "".length();
                if ((150 ^ 146) <= 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean l() {
        if (lIllIlIlIIIlII(this.k.getWidget(WidgetInfo.BARROWS_BROTHERS))) {
            ?? r0 = llllIlIIIIl[11];
            "".length();
            return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIlIIIIl[2];
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
        return this.o.c(d()).isEmpty();
    }

    private static boolean lIllIlIlIIIIll(int i, int i2) {
        return i == i2;
    }

    private static boolean lIllIlIlIIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIlIlIIIlll(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    private void b() {
        this.r = llllIlIIIIl[2];
        this.s = llllIlIIIIl[2];
        this.f0q = llllIlIIIIl[2];
        this.e = d.DHAROK;
        this.m = d.DHAROK;
        this.l = null;
        this.j = llllIlIIIIl[2];
        this.i = null;
        this.t = null;
        this.k.forcedLogoutWildy();
    }

    private static String lIllIlIIlllllI(String llllllllllllllllIIIllIlIlIlIlIlI, String llllllllllllllllIIIllIlIlIlIlIIl) {
        try {
            SecretKeySpec llllllllllllllllIIIllIlIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIIllIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), llllIlIIIIl[17]), "DES");
            Cipher llllllllllllllllIIIllIlIlIlIllII = Cipher.getInstance("DES");
            llllllllllllllllIIIllIlIlIlIllII.init(llllIlIIIIl[13], llllllllllllllllIIIllIlIlIlIllIl);
            return new String(llllllllllllllllIIIllIlIlIlIllII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIIllIlIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIIllIlIlIlIlIll) {
            llllllllllllllllIIIllIlIlIlIlIll.printStackTrace();
            return null;
        }
    }

    public int d() {
        return this.o.d();
    }

    private static String lIllIlIIllllII(String llllllllllllllllIIIllIlIlIIIllIl, String llllllllllllllllIIIllIlIlIIIllII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIIllIlIlIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIIllIlIlIIIlIll = new StringBuilder();
        char[] llllllllllllllllIIIllIlIlIIIlIlI = llllllllllllllllIIIllIlIlIIIllII.toCharArray();
        int llllllllllllllllIIIllIlIlIIIlIIl = llllIlIIIIl[2];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llllIlIIIIl[2];
        while (lIllIlIlIIIllI(i, length)) {
            llllllllllllllllIIIllIlIlIIIlIll.append((char) (charArray[i] ^ llllllllllllllllIIIllIlIlIIIlIlI[llllllllllllllllIIIllIlIlIIIlIIl % llllllllllllllllIIIllIlIlIIIlIlI.length]));
            "".length();
            llllllllllllllllIIIllIlIlIIIlIIl++;
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIIllIlIlIIIlIll);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean i() {
        d dVar;
        if (lIllIlIlIIIlIl(this.m)) {
            dVar = this.e;
            "".length();
            if ((-" ".length()) > "   ".length()) {
                return ((253 ^ 133) ^ (243 ^ 184)) & (((136 ^ 128) ^ (149 ^ 174)) ^ (-" ".length()));
            }
        } else {
            dVar = this.m;
        }
        return a(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lIllIlIlIIIIIl(message.contains(llllIlIIIII[llllIlIIIIl[15]]) ? 1 : 0)) {
            this.j = llllIlIIIIl[11];
        }
        if (lIllIlIlIIIIIl(message.contains(llllIlIIIII[llllIlIIIIl[0]]) ? 1 : 0)) {
            this.r += llllIlIIIIl[11];
        }
    }

    public void a(boolean z) {
        this.p = z;
    }

    public d s() {
        return this.m;
    }

    protected void onStart() {
        b();
        this.g.add(this.h);
        "".length();
        Executors.newSingleThreadExecutor().submit(SquireBarrows::a);
        "".length();
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        if (lIllIlIlIIIlll(npcDespawned.getNpc(), this.t)) {
            this.t = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean f() {
        Actor interacting = Players.getLocal().getInteracting();
        if (lIllIlIlIIIlIl(interacting)) {
            return llllIlIIIIl[2];
        }
        if (!lIllIlIlIIIIlI(d.a(interacting) ? 1 : 0) || lIllIlIlIIIIIl(this.o.c(d()).contains(interacting.getName()) ? 1 : 0)) {
            ?? r0 = llllIlIIIIl[11];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIlIIIIl[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    public boolean m() {
        this.k.forcedLogoutWildy();
        int[] mapRegions = this.k.getMapRegions();
        int length = mapRegions.length;
        int i = llllIlIIIIl[2];
        while (lIllIlIlIIIllI(i, length)) {
            if (lIllIlIlIIIIll(mapRegions[i], llllIlIIIIl[26])) {
                return llllIlIIIIl[11];
            }
            i++;
            "".length();
            if (((((89 + 136) - 47) + 8) ^ (((189 + 148) - 187) + 40)) < 0) {
                return ((((58 + 190) - 94) + 57) ^ (((17 + 99) - 12) + 44)) & (((83 ^ 122) ^ (64 ^ 46)) ^ (-" ".length()));
            }
        }
        return llllIlIIIIl[2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean a(d dVar) {
        if (lIllIlIlIIlIII(this.k.getVarbitValue(dVar.F()))) {
            ?? r0 = llllIlIIIIl[11];
            "".length();
            return (-" ".length()) > "  ".length() ? ((((45 + 55) - 21) + 56) ^ (((20 + 73) - 50) + 137)) & (((((51 + 20) - (-20)) + 71) ^ (((104 + 124) - 155) + 72)) ^ (-" ".length())) : r0;
        }
        return llllIlIIIIl[2];
    }

    public void a(NPC npc) {
        this.t = npc;
    }
}
