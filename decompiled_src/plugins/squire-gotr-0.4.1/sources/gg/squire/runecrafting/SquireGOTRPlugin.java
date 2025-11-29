package gg.squire.runecrafting;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Provides;
import g.r.r.p000.t.q.i.u.o.e.s.A;
import g.r.r.p000.t.q.i.u.o.e.s.B;
import g.r.r.p000.t.q.i.u.o.e.s.C;
import g.r.r.p000.t.q.i.u.o.e.s.C0000a;
import g.r.r.p000.t.q.i.u.o.e.s.EnumC0002c;
import g.r.r.p000.t.q.i.u.o.e.s.d;
import g.r.r.p000.t.q.i.u.o.e.s.e;
import g.r.r.p000.t.q.i.u.o.e.s.f;
import g.r.r.p000.t.q.i.u.o.e.s.g;
import g.r.r.p000.t.q.i.u.o.e.s.i;
import g.r.r.p000.t.q.i.u.o.e.s.j;
import g.r.r.p000.t.q.i.u.o.e.s.k;
import g.r.r.p000.t.q.i.u.o.e.s.l;
import g.r.r.p000.t.q.i.u.o.e.s.m;
import g.r.r.p000.t.q.i.u.o.e.s.n;
import g.r.r.p000.t.q.i.u.o.e.s.o;
import g.r.r.p000.t.q.i.u.o.e.s.p;
import g.r.r.p000.t.q.i.u.o.e.s.q;
import g.r.r.p000.t.q.i.u.o.e.s.r;
import g.r.r.p000.t.q.i.u.o.e.s.s;
import g.r.r.p000.t.q.i.u.o.e.s.t;
import g.r.r.p000.t.q.i.u.o.e.s.u;
import g.r.r.p000.t.q.i.u.o.e.s.v;
import g.r.r.p000.t.q.i.u.o.e.s.w;
import g.r.r.p000.t.q.i.u.o.e.s.x;
import g.r.r.p000.t.q.i.u.o.e.s.y;
import g.r.r.p000.t.q.i.u.o.e.s.z;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.runecrafting.overlay.GOTRInfoBox;
import java.awt.event.MouseEvent;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Animation;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemContainerChanged;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.widgets.Widget;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.input.MouseListener;
import net.runelite.client.input.MouseManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@PluginDescriptor(name = "Squire Guardians of The Rift", enabledByDefault = false, description = "Plays the GOTR minigame")
/* loaded from: squire-gotr-0.4.1.jar:gg/squire/runecrafting/SquireGOTRPlugin.class */
public class SquireGOTRPlugin extends SquirePlugin implements MouseListener {
    private final /* synthetic */ Class<?>[] Q;
    public static /* synthetic */ boolean P;
    private /* synthetic */ EnumC0002c aC;
    private static final /* synthetic */ int t;
    private static final /* synthetic */ int y;
    public static final /* synthetic */ RectangularArea f;
    private /* synthetic */ int aD;
    private /* synthetic */ int aw;
    private /* synthetic */ NPC ac;
    private /* synthetic */ int aI;
    private static /* synthetic */ String[] llIIllIllIIl;
    private /* synthetic */ GameObject af;
    private static final /* synthetic */ int k;
    private /* synthetic */ Instant as;
    private static final /* synthetic */ Pattern K;
    private /* synthetic */ boolean ax;
    @Inject
    private /* synthetic */ f W;
    private static final /* synthetic */ int o;
    private /* synthetic */ int at;
    private /* synthetic */ boolean aF;
    @Inject
    private /* synthetic */ Client ab;
    private /* synthetic */ int aG;
    @Inject
    private /* synthetic */ OverlayManager Z;
    private static final /* synthetic */ String N;
    private static final /* synthetic */ int B;
    public static final /* synthetic */ RectangularArea h;
    private static final /* synthetic */ int L;
    private /* synthetic */ int az;
    private static final /* synthetic */ int p;
    private /* synthetic */ int av;
    private static final /* synthetic */ int w;
    private /* synthetic */ int am;
    private static final /* synthetic */ String J;
    private final /* synthetic */ Set<GameObject> R;
    private /* synthetic */ boolean ai;
    private /* synthetic */ GameObject ah;
    private /* synthetic */ GameObject ag;
    private static final /* synthetic */ int r;
    private /* synthetic */ Instant ar;
    private static final /* synthetic */ int F;
    public static final /* synthetic */ RectangularArea e;
    private /* synthetic */ GameObject ae;
    private final /* synthetic */ Set<Integer> T;
    private /* synthetic */ int aH;
    private /* synthetic */ int al;
    private static final /* synthetic */ int u;
    private /* synthetic */ boolean aj;
    @Inject
    private /* synthetic */ GOTRInfoBox aa;
    private static final /* synthetic */ int C;
    private static final /* synthetic */ Set<Integer> l;
    private static final /* synthetic */ Set<Integer> m;
    private static final /* synthetic */ int x;
    private static final /* synthetic */ int v;
    private /* synthetic */ Instant aq;
    private /* synthetic */ boolean aA;
    private static final /* synthetic */ int D;
    private static final /* synthetic */ int s;
    private static /* synthetic */ int[] llIIllIllIlI;
    private static final /* synthetic */ List<Integer> j;
    private static final /* synthetic */ Pattern I;
    private static final /* synthetic */ int G;
    private /* synthetic */ int ay;
    private static final /* synthetic */ int z;
    private static final /* synthetic */ int q;
    private /* synthetic */ int ak;
    @Inject
    private /* synthetic */ C0000a V;
    private /* synthetic */ String au;
    public static final /* synthetic */ int[] d;
    private static final /* synthetic */ int[] O;
    private static final /* synthetic */ int A;
    private /* synthetic */ GameObject ad;
    private static final /* synthetic */ String H;
    private static final /* synthetic */ String i;
    private final /* synthetic */ Set<GameObject> S;

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ RectangularArea f0g;
    private static final /* synthetic */ Logger c;
    @Inject
    private /* synthetic */ MouseManager X;
    private /* synthetic */ boolean aE;
    private /* synthetic */ long ao;
    private static final /* synthetic */ int n;
    private static final /* synthetic */ int M;
    private /* synthetic */ int aB;
    private final /* synthetic */ Set<e> U;
    private static final /* synthetic */ int E;
    @Inject
    private /* synthetic */ SquireGOTRConfig Y;
    private /* synthetic */ Instant ap;
    private /* synthetic */ int an;

    private static String llllllIlIllIll(String lllllllllllllllIlIIllIIlIIIIIllI, String lllllllllllllllIlIIllIIlIIIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIllIIlIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIllIllIlI[3], lllllllllllllllIlIIllIIlIIIIlIIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIlIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIlIIIIIlll) {
            lllllllllllllllIlIIllIIlIIIIIlll.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
        getEventBus().unregister(this.V);
        getEventBus().unregister(this.W);
        this.Z.remove(this.W);
        "".length();
        this.Z.remove(this.aa);
        "".length();
        k();
    }

    public int N() {
        return this.at;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC npc = npcSpawned.getNpc();
        if (llllllIllIlIlI(npc.getId(), llIIllIllIlI[43])) {
            this.ac = npc;
        }
    }

    public boolean g() {
        return Arrays.stream(this.ab.getMapRegions()).anyMatch(i2 -> {
            if (llllllIllIlIlI(i2, llIIllIllIlI[50])) {
                ?? r0 = llIIllIllIlI[2];
                "".length();
                return (-" ".length()) > (-" ".length()) ? ((((143 + 225) - 165) + 39) ^ (((108 + 50) - (-32)) + 0)) & (((82 ^ 124) ^ (12 ^ 110)) ^ (-" ".length())) : r0;
            }
            return llIIllIllIlI[1];
        });
    }

    private static boolean llllllIllIIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    public MouseEvent mouseClicked(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    public d h() {
        d dVar;
        d dVar2;
        if (llllllIllIIIlI(m(), EnumC0002c.ACTIVE)) {
            return null;
        }
        Optional findFirst = Arrays.stream(d.values()).filter(dVar3 -> {
            if (llllllIllIlIlI(dVar3.Y(), this.av)) {
                ?? r0 = llIIllIllIlI[2];
                "".length();
                return (((((119 + 41) - 47) + 92) ^ (((65 + 123) - 95) + 36)) & (((((33 + 190) - 164) + 162) ^ (((127 + 38) - 26) + 6)) ^ (-" ".length()))) >= " ".length() ? ((9 ^ 27) ^ (136 ^ 172)) & (((59 ^ 39) ^ (184 ^ 146)) ^ (-" ".length())) : r0;
            }
            return llIIllIllIlI[1];
        }).findFirst();
        Optional findFirst2 = Arrays.stream(d.values()).filter(dVar4 -> {
            if (llllllIllIlIlI(dVar4.Y(), this.aw)) {
                ?? r0 = llIIllIllIlI[2];
                "".length();
                return " ".length() < (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIllIllIlI[1];
        }).findFirst();
        d dVar5 = null;
        if (!llllllIllIIIIl(findFirst.isEmpty() ? 1 : 0) || llllllIllIIIll(findFirst2.isEmpty() ? 1 : 0)) {
            return null;
        }
        if (llllllIllIIIll(this.Y.useTalisman() ? 1 : 0)) {
            d[] values = d.values();
            int lllllllllllllllIlIIllIIllIlIlIIl = values.length;
            int i2 = llIIllIllIlI[1];
            while (llllllIllIIlII(i2, lllllllllllllllIlIIllIIllIlIlIIl)) {
                d dVar6 = values[i2];
                int[] iArr = new int[llIIllIllIlI[2]];
                iArr[llIIllIllIlI[1]] = dVar6.X();
                if (llllllIllIIIll(Inventory.contains(iArr) ? 1 : 0)) {
                    return dVar6;
                }
                i2++;
                "".length();
                if (((252 ^ 157) ^ (109 ^ 8)) <= (-" ".length())) {
                    return null;
                }
            }
        }
        d dVar7 = (d) findFirst.get();
        d dVar8 = (d) findFirst2.get();
        if (llllllIllIIIIl(this.Y.runeTypes().contains(dVar7) ? 1 : 0) && llllllIllIIIIl(this.Y.runeTypes().contains(dVar8) ? 1 : 0)) {
            return null;
        }
        if (llllllIllIIIll(this.Y.runeTypes().contains(dVar7) ? 1 : 0) && llllllIllIIIIl(this.Y.runeTypes().contains(dVar8) ? 1 : 0)) {
            dVar5 = dVar7;
            "".length();
            if (0 != 0) {
                return null;
            }
        } else if (llllllIllIIIIl(this.Y.runeTypes().contains(dVar7) ? 1 : 0)) {
            dVar5 = dVar8;
            "".length();
            if ((-(82 ^ 87)) >= 0) {
                return null;
            }
        } else {
            if (llllllIllIIIll(this.Y.focusStrong() ? 1 : 0)) {
                if (llllllIllIIIII(dVar7.aa().ordinal(), dVar8.aa().ordinal())) {
                    dVar5 = dVar7;
                    "".length();
                    if (0 != 0) {
                        return null;
                    }
                } else {
                    dVar5 = dVar8;
                }
            }
            if (llllllIllIIIll(this.Y.balancePoints() ? 1 : 0) && llllllIllIIlIl(dVar5)) {
                if (llllllIllIIIll(this.aF ? 1 : 0)) {
                    dVar2 = dVar7;
                    "".length();
                    if ((((((87 + 12) - (-25)) + 38) ^ (((109 + 160) - 217) + 143)) & (((60 ^ 121) ^ (13 ^ 41)) ^ (-" ".length()))) >= "  ".length()) {
                        return null;
                    }
                } else {
                    dVar2 = dVar8;
                }
                dVar5 = dVar2;
            }
            if (llllllIllIIlIl(dVar5)) {
                if (llllllIllIIlII(I(), H())) {
                    dVar = dVar8;
                    "".length();
                    if (!(true ^ true)) {
                        return null;
                    }
                } else {
                    dVar = dVar7;
                }
                dVar5 = dVar;
            }
        }
        return dVar5;
    }

    public MouseEvent mouseMoved(MouseEvent mouseEvent) {
        this.aH = mouseEvent.getX();
        this.aI = mouseEvent.getY();
        return mouseEvent;
    }

    private boolean i() {
        return Arrays.stream(this.ab.getMapRegions()).anyMatch(i2 -> {
            if (llllllIllIlIlI(i2, llIIllIllIlI[50])) {
                ?? r0 = llIIllIllIlI[2];
                "".length();
                return "  ".length() < 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIllIllIlI[1];
        });
    }

    private static boolean llllllIllIIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    public EnumC0002c m() {
        if (!llllllIllIIllI(Game.getState(), GameState.LOGGED_IN) || llllllIllIIIll(l() ? 1 : 0)) {
            return this.aC;
        }
        if (llllllIllIIIIl(f() ? 1 : 0)) {
            this.aC = EnumC0002c.OUTSIDE;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        } else if (!llllllIllIIIlI(this.as, Instant.MAX) || llllllIllIlIIl(this.ar)) {
            this.aC = EnumC0002c.ACTIVATING;
            "".length();
            if ((167 ^ 163) < "   ".length()) {
                return null;
            }
        } else if (llllllIllIlIII(llllllIllIlIll(j(), 20L))) {
            this.aC = EnumC0002c.COUNTDOWN;
            "".length();
            if (0 != 0) {
                return null;
            }
        } else if (llllllIllIIIll(this.aA ? 1 : 0)) {
            this.aC = EnumC0002c.FINISHING;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        } else {
            this.aC = EnumC0002c.ACTIVE;
        }
        return this.aC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public int d() {
        ?? r0 = llIIllIllIlI[2];
        int[] iArr = new int[llIIllIllIlI[2]];
        iArr[llIIllIllIlI[1]] = llIIllIllIlI[25];
        return Inventory.getCount((boolean) r0, iArr);
    }

    public GameObject A() {
        return this.af;
    }

    public int P() {
        return this.aB;
    }

    public void n() {
        this.aD = Static.getClient().getTickCount();
    }

    protected void onStart() {
        k();
        this.X.registerMouseListener(this);
        getEventBus().register(this.V);
        getEventBus().register(this.W);
        this.Z.add(this.aa);
        "".length();
        this.Z.add(this.W);
        "".length();
    }

    public Instant M() {
        return this.as;
    }

    public int F() {
        return this.ak;
    }

    public int S() {
        return this.aG;
    }

    public NPC x() {
        return this.ac;
    }

    public MouseEvent mousePressed(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    private static boolean llllllIllIIIIl(int i2) {
        return i2 == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v80, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        boolean z2;
        if (llllllIllIIIlI(chatMessage.getType(), ChatMessageType.SPAM) && llllllIllIIIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String message = chatMessage.getMessage();
        if (llllllIllIIIll(message.contains(llIIllIllIIl[llIIllIllIlI[7]]) ? 1 : 0)) {
            e[] values = e.values();
            int length = values.length;
            int i2 = llIIllIllIlI[1];
            while (llllllIllIIlII(i2, length)) {
                values[i2].e(llIIllIllIlI[1]);
                i2++;
                "".length();
                if ((true ^ true) != (true ^ true)) {
                    return;
                }
            }
            this.aq = Instant.now();
            this.ar = null;
            this.aj = llIIllIllIlI[2];
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
        } else if (llllllIllIIIll(message.contains(llIIllIllIIl[llIIllIllIlI[8]]) ? 1 : 0)) {
            this.ar = Instant.now().plusSeconds(30L);
            "".length();
            if ((((187 ^ 179) ^ (148 ^ 164)) & (((((0 + 49) - 43) + 145) ^ (((79 + 59) - 133) + 170)) ^ (-" ".length()))) == (-" ".length())) {
                return;
            }
        } else if (llllllIllIIIll(message.contains(llIIllIllIIl[llIIllIllIlI[9]]) ? 1 : 0)) {
            this.ar = Instant.now().plusSeconds(10L);
            "".length();
            if ("  ".length() > "   ".length()) {
                return;
            }
        } else if (llllllIllIIIll(message.contains(llIIllIllIIl[llIIllIllIlI[10]]) ? 1 : 0)) {
            this.ar = Instant.now().plusSeconds(5L);
            "".length();
            if ("  ".length() <= (-" ".length())) {
                return;
            }
        } else if (llllllIllIIIll(message.contains(llIIllIllIIl[llIIllIllIlI[11]]) ? 1 : 0)) {
            this.ar = Instant.now().plusSeconds(60L);
            "".length();
            if (!(true ^ true)) {
                return;
            }
        } else if (llllllIllIIIll(message.contains(llIIllIllIIl[llIIllIllIlI[12]]) ? 1 : 0)) {
            this.ak -= llIIllIllIlI[2];
            this.al -= llIIllIllIlI[2];
            "".length();
            if ((((6 ^ 13) ^ (64 ^ 79)) & (((((31 + 47) - (-24)) + 42) ^ (((131 + 9) - 102) + 110)) ^ (-" ".length()))) < 0) {
                return;
            }
        } else if (llllllIllIIIll(message.contains(llIIllIllIIl[llIIllIllIlI[13]]) ? 1 : 0)) {
            this.aA = llIIllIllIlI[2];
        }
        if (llllllIllIlIIl(this.ar)) {
            this.aA = llIIllIllIlI[1];
        }
        Matcher matcher = I.matcher(message);
        if (llllllIllIIIll(matcher.find() ? 1 : 0)) {
            this.ak = Integer.parseInt(matcher.group(llIIllIllIlI[2]));
            this.al = Integer.parseInt(matcher.group(llIIllIllIlI[3]));
            if (llllllIllIIlII(this.ak, this.al)) {
                int i3 = llIIllIllIlI[2];
                "".length();
                z2 = i3;
                if ("  ".length() > (42 ^ 46)) {
                    return;
                }
            } else {
                z2 = llIIllIllIlI[1];
            }
            this.aF = z2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        boolean z2;
        if (!llllllIllIIllI(itemContainerChanged.getItemContainer(), this.ab.getItemContainer(InventoryID.INVENTORY)) || llllllIllIIIIl(g() ? 1 : 0)) {
            return;
        }
        Item[] items = itemContainerChanged.getItemContainer().getItems();
        if (llllllIllIIIll(Arrays.stream(items).anyMatch(item -> {
            if (llllllIllIlIlI(item.getId(), llIIllIllIlI[49])) {
                ?? r0 = llIIllIllIlI[2];
                "".length();
                return ((7 ^ 2) ^ " ".length()) < 0 ? ((((53 + 146) - 59) + 22) ^ (((78 + 44) - 36) + 60)) & (((49 ^ 124) ^ (73 ^ 52)) ^ (-" ".length())) : r0;
            }
            return llIIllIllIlI[1];
        }) ? 1 : 0) && llllllIllIIIll(Arrays.stream(items).anyMatch(item2 -> {
            if (llllllIllIlIlI(item2.getId(), llIIllIllIlI[48])) {
                ?? r0 = llIIllIllIlI[2];
                "".length();
                return ((72 ^ 109) ^ (143 ^ 174)) > ((((115 + 97) - 189) + 113) ^ (((40 + 118) - 145) + 127)) ? ((226 ^ 163) ^ " ".length()) & (((((6 + 32) - (-193)) + 4) ^ (((14 + 75) - 33) + 115)) ^ (-" ".length())) : r0;
            }
            return llIIllIllIlI[1];
        }) ? 1 : 0) && llllllIllIIIll(this.ax ? 1 : 0)) {
            int i2 = llIIllIllIlI[2];
            "".length();
            z2 = i2;
            if ((-(((255 ^ 180) & ((71 ^ 12) ^ (-1))) ^ (143 ^ 139))) >= 0) {
                return;
            }
        } else {
            z2 = llIIllIllIlI[1];
        }
        this.ai = z2;
        this.ao = Arrays.stream(items).filter(item3 -> {
            if (llllllIllIlIlI(item3.getId(), llIIllIllIlI[25])) {
                ?? r0 = llIIllIllIlI[2];
                "".length();
                return "   ".length() == (112 ^ 116) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIllIllIlI[1];
        }).mapToInt((v0) -> {
            return v0.getQuantity();
        }).sum();
        IntStream mapToInt = Arrays.stream(items).mapToInt((v0) -> {
            return v0.getId();
        });
        Set<Integer> set = m;
        Objects.requireNonNull(set);
        "".length();
        List list = (List) mapToInt.filter((v1) -> {
            return r1.contains(v1);
        }).boxed().collect(Collectors.toList());
        if (llllllIllIIlll(list.size(), this.T.size())) {
            this.T.clear();
            this.T.addAll(list);
            "".length();
        }
    }

    int a(Widget widget, int i2) {
        if (llllllIllIlIIl(widget)) {
            int spriteId = widget.getSpriteId();
            if (llllllIllIIlll(spriteId, i2)) {
                if (llllllIllIlIII(i2)) {
                    Stream.of((Object[]) d.values()).filter(dVar -> {
                        if (llllllIllIlIlI(dVar.Y(), i2)) {
                            ?? r0 = llIIllIllIlI[2];
                            "".length();
                            return (1 ^ 5) <= ((123 ^ 35) & ((127 ^ 39) ^ (-1))) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                        }
                        return llIIllIllIlI[1];
                    }).findFirst();
                }
                Stream.of((Object[]) d.values()).filter(dVar2 -> {
                    if (llllllIllIlIlI(dVar2.Y(), spriteId)) {
                        ?? r0 = llIIllIllIlI[2];
                        "".length();
                        return "  ".length() == " ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIIllIllIlI[1];
                }).findFirst();
            }
            return spriteId;
        }
        return i2;
    }

    private static boolean llllllIllIIlll(int i2, int i3) {
        return i2 != i3;
    }

    public Instant J() {
        return this.ap;
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (llllllIllIIIll(l.contains(Integer.valueOf(gameObjectSpawned.getGameObject().getId())) ? 1 : 0)) {
            this.R.removeIf(gameObject2 -> {
                if (llllllIllIlIlI(gameObject2.getId(), gameObject.getId())) {
                    ?? r0 = llIIllIllIlI[2];
                    "".length();
                    return 0 != 0 ? ((((162 + 156) - 117) + 37) ^ (((71 + 132) - 160) + 134)) & (((198 ^ 134) ^ (16 ^ 15)) ^ (-" ".length())) : r0;
                }
                return llIIllIllIlI[1];
            });
            "".length();
            this.S.removeIf(gameObject3 -> {
                if (llllllIllIlIlI(gameObject3.getId(), gameObject.getId())) {
                    ?? r0 = llIIllIllIlI[2];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return llIIllIllIlI[1];
            });
            "".length();
            this.R.add(gameObject);
            "".length();
        }
        if (llllllIllIlIlI(gameObject.getId(), llIIllIllIlI[38])) {
            this.ae = gameObject;
        }
        if (llllllIllIlIlI(gameObject.getId(), llIIllIllIlI[39])) {
            this.ad = gameObject;
        }
        if (llllllIllIlIlI(gameObject.getId(), llIIllIllIlI[40])) {
            this.ag = gameObject;
        }
        if (llllllIllIlIlI(gameObject.getId(), llIIllIllIlI[41])) {
            this.af = gameObject;
        }
        if (llllllIllIlIlI(gameObject.getId(), llIIllIllIlI[42])) {
            this.ah = gameObject;
        }
    }

    public SquireGOTRConfig w() {
        return this.Y;
    }

    private static boolean llllllIllIIIll(int i2) {
        return i2 != 0;
    }

    private static boolean llllllIllIlIII(int i2) {
        return i2 > 0;
    }

    public boolean E() {
        return this.aj;
    }

    protected Class<?>[] tasks() {
        return this.Q;
    }

    public GameObject C() {
        return this.ah;
    }

    private static void llllllIlIlllll() {
        llIIllIllIlI = new int[90];
        llIIllIllIlI[0] = 107 ^ 125;
        llIIllIllIlI[1] = ((184 ^ 190) ^ (244 ^ 186)) & (((((51 + 135) - 141) + 194) ^ (((108 + 36) - 135) + 158)) ^ (-" ".length()));
        llIIllIllIlI[2] = " ".length();
        llIIllIllIlI[3] = "  ".length();
        llIIllIllIlI[4] = "   ".length();
        llIIllIllIlI[5] = 183 ^ 179;
        llIIllIllIlI[6] = (126 ^ 8) ^ (225 ^ 146);
        llIIllIllIlI[7] = 66 ^ 68;
        llIIllIllIlI[8] = (246 ^ 164) ^ (107 ^ 62);
        llIIllIllIlI[9] = (130 ^ 152) ^ (159 ^ 141);
        llIIllIllIlI[10] = (243 ^ 194) ^ (51 ^ 11);
        llIIllIllIlI[11] = (8 ^ 13) ^ (23 ^ 24);
        llIIllIllIlI[12] = 142 ^ 133;
        llIIllIllIlI[13] = (77 ^ 63) ^ (3 ^ 125);
        llIIllIllIlI[14] = (237 ^ 186) ^ (104 ^ 50);
        llIIllIllIlI[15] = (64 ^ 89) ^ (45 ^ 58);
        llIIllIllIlI[16] = (195 ^ 152) ^ (65 ^ 21);
        llIIllIllIlI[17] = 14 ^ 30;
        llIIllIllIlI[18] = 52 ^ 37;
        llIIllIllIlI[19] = 90 ^ 72;
        llIIllIllIlI[20] = 36 ^ 55;
        llIIllIllIlI[21] = (23 ^ 45) ^ (169 ^ 135);
        llIIllIllIlI[22] = 47 ^ 58;
        llIIllIllIlI[23] = (-1794) & 28671;
        llIIllIllIlI[24] = (147 ^ 156) ^ (56 ^ 109);
        llIIllIllIlI[25] = (-4117) & 30998;
        llIIllIllIlI[26] = (-((-1035) & 11807)) & (-16715) & 48917343;
        llIIllIllIlI[27] = (((6 + 141) - 114) + 117) ^ (((113 + 106) - 161) + 129);
        llIIllIllIlI[28] = (25 ^ 65) ^ (25 ^ 0);
        llIIllIllIlI[29] = (-((-49) & 20797)) & (-33) & 30143;
        llIIllIllIlI[30] = (-((-8197) & 31631)) & (-8193) & 48921502;
        llIIllIllIlI[31] = (-((-17049) & 21401)) & (-26313) & 48920543;
        llIIllIllIlI[32] = (-((-2058) & 15339)) & (-1) & 48903167;
        llIIllIllIlI[33] = (-69) & 48889942;
        llIIllIllIlI[34] = (-7813) & 48897695;
        llIIllIllIlI[35] = (-((-5505) & 30121)) & (-835) & 48915311;
        llIIllIllIlI[36] = (161 ^ 164) ^ (116 ^ 75);
        llIIllIllIlI[37] = (((((41 + 132) - 116) + 118) + (128 ^ 158)) - (81 ^ 11)) + (214 ^ 164);
        llIIllIllIlI[38] = (-5409) & 49141;
        llIIllIllIlI[39] = (-36) & 43767;
        llIIllIllIlI[40] = (-4149) & 47870;
        llIIllIllIlI[41] = (-((-10947) & 31735)) & (-1) & 64511;
        llIIllIllIlI[42] = (-17451) & 61179;
        llIIllIllIlI[43] = (-((-1205) & 22453)) & (-21) & 32671;
        llIIllIllIlI[44] = (-18561) & 32246;
        llIIllIllIlI[45] = (-2051) & 15735;
        llIIllIllIlI[46] = (-12081) & 48836401;
        llIIllIllIlI[47] = (-((-4245) & 6037)) & (-1) & 28671;
        llIIllIllIlI[48] = (-((-19585) & 24305)) & (-138) & 31743;
        llIIllIllIlI[49] = (-((-16963) & 29511)) & (-2081) & 16383;
        llIIllIllIlI[50] = (-((-21634) & 22253)) & (-16385) & 31487;
        llIIllIllIlI[51] = (-((-10241) & 15997)) & (-1) & 32639;
        llIIllIllIlI[52] = (-((-2927) & 8047)) & (-705) & 32765;
        llIIllIllIlI[53] = (-5158) & 32037;
        llIIllIllIlI[54] = (-((-27559) & 31679)) & (-737) & 31737;
        llIIllIllIlI[55] = (-16459) & 60158;
        llIIllIllIlI[56] = (-4099) & 47947;
        llIIllIllIlI[57] = (-24706) & 28325;
        llIIllIllIlI[58] = (-((-8713) & 29659)) & (-1) & 30687;
        llIIllIllIlI[59] = (-((-10282) & 31215)) & (-1) & 24543;
        llIIllIllIlI[60] = (-((-15881) & 32506)) & (-2049) & 28155;
        llIIllIllIlI[61] = (-((-19473) & 23857)) & (-16409) & 24379;
        llIIllIllIlI[62] = (-((-13321) & 29849)) & (-549) & 26559;
        llIIllIllIlI[63] = (-8598) & 12245;
        llIIllIllIlI[64] = (-17025) & 26543;
        llIIllIllIlI[65] = (-8593) & 12180;
        llIIllIllIlI[66] = (-4231) & 13727;
        llIIllIllIlI[67] = (-8291) & 11883;
        llIIllIllIlI[68] = (-((-17) & 23130)) & (-17) & 32639;
        llIIllIllIlI[69] = (-((-1861) & 30543)) & (-449) & 32767;
        llIIllIllIlI[70] = (-((-279) & 20855)) & (-5) & 30079;
        llIIllIllIlI[71] = (-((-1649) & 30710)) & (-65) & 32767;
        llIIllIllIlI[72] = (-((-25761) & 28347)) & (-4161) & 16254;
        llIIllIllIlI[73] = (-((-3331) & 12155)) & (-18433) & 32767;
        llIIllIllIlI[74] = (-((-6153) & 30767)) & (-529) & 30655;
        llIIllIllIlI[75] = (-((-9987) & 28423)) & (-8753) & 32703;
        llIIllIllIlI[76] = (-((-28386) & 32495)) & (-769) & 31663;
        llIIllIllIlI[77] = (-17473) & 61177;
        llIIllIllIlI[78] = (-((-10469) & 28143)) & (-1) & 61375;
        llIIllIllIlI[79] = (-5121) & 48830;
        llIIllIllIlI[80] = (-((-10437) & 15814)) & (-1) & 49079;
        llIIllIllIlI[81] = (-((-551) & 22063)) & (-1) & 65215;
        llIIllIllIlI[82] = (-4417) & 48127;
        llIIllIllIlI[83] = (-16712) & 60415;
        llIIllIllIlI[84] = (-((-23089) & 24179)) & (-2) & 44799;
        llIIllIllIlI[85] = (-17681) & 61392;
        llIIllIllIlI[86] = (-4421) & 48127;
        llIIllIllIlI[87] = (-((-6211) & 7495)) & (-20481) & 65470;
        llIIllIllIlI[88] = (-1281) & 44989;
        llIIllIllIlI[89] = (-((-10371) & 31927)) & (-1) & 32639;
    }

    private static boolean llllllIllIllII(int i2, int i3) {
        return i2 >= i3;
    }

    private void k() {
        this.R.clear();
        this.S.clear();
        this.ad = null;
        this.ac = null;
        this.af = null;
        this.ag = null;
        this.as = Instant.MAX;
    }

    @Provides
    SquireGOTRConfig a(ConfigManager configManager) {
        return (SquireGOTRConfig) configManager.getConfig(SquireGOTRConfig.class);
    }

    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (llllllIllIIllI(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            this.aC = EnumC0002c.OUTSIDE;
            k();
        }
        if (llllllIllIIllI(gameStateChanged.getGameState(), GameState.LOADING)) {
            k();
        }
    }

    public int H() {
        return this.am;
    }

    private static boolean llllllIllIlIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    public SquireGOTRPlugin() {
        Class<?>[] clsArr = new Class[llIIllIllIlI[0]];
        clsArr[llIIllIllIlI[1]] = z.class;
        clsArr[llIIllIllIlI[2]] = C.class;
        clsArr[llIIllIllIlI[3]] = B.class;
        clsArr[llIIllIllIlI[4]] = A.class;
        clsArr[llIIllIllIlI[5]] = j.class;
        clsArr[llIIllIllIlI[6]] = k.class;
        clsArr[llIIllIllIlI[7]] = l.class;
        clsArr[llIIllIllIlI[8]] = i.class;
        clsArr[llIIllIllIlI[9]] = w.class;
        clsArr[llIIllIllIlI[10]] = x.class;
        clsArr[llIIllIllIlI[11]] = y.class;
        clsArr[llIIllIllIlI[12]] = u.class;
        clsArr[llIIllIllIlI[13]] = n.class;
        clsArr[llIIllIllIlI[14]] = s.class;
        clsArr[llIIllIllIlI[15]] = t.class;
        clsArr[llIIllIllIlI[16]] = o.class;
        clsArr[llIIllIllIlI[17]] = v.class;
        clsArr[llIIllIllIlI[18]] = m.class;
        clsArr[llIIllIllIlI[19]] = q.class;
        clsArr[llIIllIllIlI[20]] = p.class;
        clsArr[llIIllIllIlI[21]] = r.class;
        clsArr[llIIllIllIlI[22]] = g.class;
        this.Q = clsArr;
        this.R = new HashSet();
        this.S = new HashSet();
        this.T = new HashSet();
        this.U = new HashSet();
        this.ai = llIIllIllIlI[1];
        this.aj = llIIllIllIlI[1];
        this.ao = 0L;
        this.ax = llIIllIllIlI[1];
        this.ay = llIIllIllIlI[1];
    }

    public Set<Integer> u() {
        return this.T;
    }

    public MouseEvent mouseReleased(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    public int G() {
        return this.al;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public int a() {
        ?? r0 = llIIllIllIlI[2];
        int[] iArr = new int[llIIllIllIlI[2]];
        iArr[llIIllIllIlI[1]] = llIIllIllIlI[23];
        return Inventory.getCount((boolean) r0, iArr);
    }

    public boolean D() {
        return this.ai;
    }

    public MouseEvent mouseExited(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    public int o() {
        return Static.getClient().getTickCount() - this.aD;
    }

    public Set<GameObject> t() {
        return this.S;
    }

    private static boolean llllllIllIIlIl(Object obj) {
        return obj == null;
    }

    private static String llllllIlIlllII(String lllllllllllllllIlIIllIIIllllIllI, String lllllllllllllllIlIIllIIIllllIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIllIIIllllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIllIIIllllIlII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIllIIIllllIlIl.toCharArray();
        int lllllllllllllllIlIIllIIIlllIllIl = llIIllIllIlI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = llIIllIllIlI[1];
        while (llllllIllIIlII(i2, length)) {
            char lllllllllllllllIlIIllIIIllllIlll = charArray2[i2];
            lllllllllllllllIlIIllIIIllllIlII.append((char) (lllllllllllllllIlIIllIIIllllIlll ^ charArray[lllllllllllllllIlIIllIIIlllIllIl % charArray.length]));
            "".length();
            lllllllllllllllIlIIllIIIlllIllIl++;
            i2++;
            "".length();
            if ("  ".length() == (((((170 + 7) - 0) + 71) ^ (((9 + 82) - (-61)) + 2)) & (((((109 + 40) - (-1)) + 45) ^ (((148 + 109) - 168) + 72)) ^ (-" ".length())) & ((((((50 + 136) - 52) + 56) ^ (((96 + 140) - 118) + 37)) & (((39 ^ 44) ^ (158 ^ 176)) ^ (-" ".length()))) ^ (-" ".length())))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIllIIIllllIlII);
    }

    public MouseEvent mouseEntered(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    static {
        llllllIlIlllll();
        llllllIlIllllI();
        D = llIIllIllIlI[33];
        F = llIIllIllIlI[34];
        r = llIIllIllIlI[40];
        H = llIIllIllIIl[llIIllIllIlI[16]];
        q = llIIllIllIlI[52];
        n = llIIllIllIlI[43];
        z = llIIllIllIlI[35];
        E = llIIllIllIlI[46];
        G = llIIllIllIlI[42];
        x = llIIllIllIlI[29];
        o = llIIllIllIlI[53];
        L = llIIllIllIlI[37];
        t = llIIllIllIlI[25];
        v = llIIllIllIlI[49];
        C = llIIllIllIlI[32];
        B = llIIllIllIlI[30];
        M = llIIllIllIlI[2];
        i = llIIllIllIIl[llIIllIllIlI[17]];
        u = llIIllIllIlI[39];
        J = llIIllIllIIl[llIIllIllIlI[18]];
        N = llIIllIllIIl[llIIllIllIlI[19]];
        y = llIIllIllIlI[26];
        A = llIIllIllIlI[31];
        k = llIIllIllIlI[50];
        w = llIIllIllIlI[48];
        s = llIIllIllIlI[41];
        p = llIIllIllIlI[54];
        c = LoggerFactory.getLogger(SquireGOTRPlugin.class);
        int[] iArr = new int[llIIllIllIlI[3]];
        iArr[llIIllIllIlI[1]] = llIIllIllIlI[55];
        iArr[llIIllIllIlI[2]] = llIIllIllIlI[56];
        d = iArr;
        e = new RectangularArea(llIIllIllIlI[57], llIIllIllIlI[58], llIIllIllIlI[59], llIIllIllIlI[60], llIIllIllIlI[1]);
        f = new RectangularArea(llIIllIllIlI[61], llIIllIllIlI[62], llIIllIllIlI[63], llIIllIllIlI[64], llIIllIllIlI[1]);
        f0g = new RectangularArea(llIIllIllIlI[65], llIIllIllIlI[66], llIIllIllIlI[67], llIIllIllIlI[68], llIIllIllIlI[1]);
        h = new RectangularArea(llIIllIllIlI[69], llIIllIllIlI[70], llIIllIllIlI[71], llIIllIllIlI[72], llIIllIllIlI[1]);
        j = ImmutableList.of(Integer.valueOf(llIIllIllIlI[73]), Integer.valueOf(llIIllIllIlI[74]), Integer.valueOf(llIIllIllIlI[75]), Integer.valueOf(llIIllIllIlI[76]));
        Integer valueOf = Integer.valueOf(llIIllIllIlI[77]);
        Integer valueOf2 = Integer.valueOf(llIIllIllIlI[78]);
        Integer valueOf3 = Integer.valueOf(llIIllIllIlI[79]);
        Integer valueOf4 = Integer.valueOf(llIIllIllIlI[80]);
        Integer valueOf5 = Integer.valueOf(llIIllIllIlI[81]);
        Integer valueOf6 = Integer.valueOf(llIIllIllIlI[82]);
        Integer[] numArr = new Integer[llIIllIllIlI[7]];
        numArr[llIIllIllIlI[1]] = Integer.valueOf(llIIllIllIlI[83]);
        numArr[llIIllIllIlI[2]] = Integer.valueOf(llIIllIllIlI[84]);
        numArr[llIIllIllIlI[3]] = Integer.valueOf(llIIllIllIlI[85]);
        numArr[llIIllIllIlI[4]] = Integer.valueOf(llIIllIllIlI[86]);
        numArr[llIIllIllIlI[5]] = Integer.valueOf(llIIllIllIlI[87]);
        numArr[llIIllIllIlI[6]] = Integer.valueOf(llIIllIllIlI[88]);
        l = ImmutableSet.of(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, numArr);
        m = (Set) Stream.of((Object[]) d.values()).mapToInt((v0) -> {
            return v0.X();
        }).boxed().collect(Collectors.toSet());
        I = Pattern.compile(llIIllIllIIl[llIIllIllIlI[20]]);
        K = Pattern.compile(llIIllIllIIl[llIIllIllIlI[21]]);
        int[] iArr2 = new int[llIIllIllIlI[2]];
        iArr2[llIIllIllIlI[1]] = llIIllIllIlI[89];
        O = iArr2;
    }

    private static boolean llllllIllIIIII(int i2, int i3) {
        return i2 > i3;
    }

    public long j() {
        if (llllllIllIIIll(this.as.isBefore(Instant.now()) ? 1 : 0)) {
            return 0L;
        }
        if (llllllIllIIllI(this.as, Instant.MAX)) {
            return -1L;
        }
        return Duration.between(Instant.now(), this.as).getSeconds();
    }

    public int I() {
        return this.an;
    }

    public int p() {
        int[] iArr = new int[llIIllIllIlI[2]];
        iArr[llIIllIllIlI[1]] = llIIllIllIlI[47];
        int count = Inventory.getCount(iArr);
        for (Item item : Inventory.getAll(item2 -> {
            return item2.getName().endsWith(llIIllIllIIl[llIIllIllIlI[15]]);
        })) {
            e c2 = e.c(item.getId());
            if (llllllIllIIlIl(c2)) {
                "".length();
                if ((-"  ".length()) > 0) {
                    return ((((6 + 35) - 35) + 170) ^ (((19 + 10) - 17) + 159)) & (((134 ^ 185) ^ (29 ^ 57)) ^ (-" ".length()));
                }
            } else {
                count += c2.ae();
                "".length();
                if (((((103 + 49) - 132) + 108) ^ (((22 + 25) - (-72)) + 14)) <= 0) {
                    return ((((15 + 174) - 31) + 92) ^ (((7 + 1) - (-174)) + 4)) & (((97 ^ 52) ^ (14 ^ 27)) ^ (-" ".length()));
                }
            }
        }
        return count;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v59, types: [boolean] */
    @Subscribe(priority = 20.0f)
    public void onGameTick(GameTick gameTick) {
        boolean z2;
        Instant now;
        boolean z3;
        if (llllllIllIIIlI(m(), EnumC0002c.ACTIVE)) {
            this.az = Rand.nextInt(llIIllIllIlI[27], llIIllIllIlI[28]);
        }
        if (llllllIllIlIII(this.ay)) {
            this.ay -= llIIllIllIlI[2];
        }
        this.S.removeIf(gameObject -> {
            Animation animation = gameObject.getRenderable().getAnimation();
            if (!llllllIllIlIIl(animation) || llllllIllIIlll(animation.getId(), llIIllIllIlI[29])) {
                ?? r0 = llIIllIllIlI[2];
                "".length();
                return (((((94 + 135) - 116) + 38) ^ (((83 + 50) - 76) + 73)) & (((((132 + 110) - 118) + 35) ^ (((91 + 41) - 118) + 124)) ^ (-" ".length()))) != 0 ? ((((77 + 43) - 25) + 72) ^ (((122 + 3) - 39) + 59)) & (((14 ^ 7) ^ (161 ^ 158)) ^ (-" ".length())) : r0;
            }
            return llIIllIllIlI[1];
        });
        "".length();
        for (GameObject gameObject2 : this.R) {
            Animation animation = gameObject2.getRenderable().getAnimation();
            if (llllllIllIlIIl(animation) && llllllIllIlIlI(animation.getId(), llIIllIllIlI[29])) {
                this.S.add(gameObject2);
                "".length();
            }
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        Widget widget = this.ab.getWidget(llIIllIllIlI[30]);
        Widget widget2 = this.ab.getWidget(llIIllIllIlI[31]);
        Widget widget3 = this.ab.getWidget(llIIllIllIlI[32]);
        Widget widget4 = this.ab.getWidget(llIIllIllIlI[33]);
        Widget widget5 = this.ab.getWidget(llIIllIllIlI[34]);
        Widget widget6 = this.ab.getWidget(llIIllIllIlI[35]);
        this.av = a(widget, this.av);
        this.aw = a(widget2, this.aw);
        if (llllllIllIlIIl(widget3)) {
            String text = widget3.getText();
            if (llllllIllIlIIl(text) && llllllIllIIIIl(text.contains(llIIllIllIIl[llIIllIllIlI[1]]) ? 1 : 0)) {
                int i2 = llIIllIllIlI[2];
                "".length();
                z3 = i2;
                if ((-(8 ^ 12)) >= 0) {
                    return;
                }
            } else {
                z3 = llIIllIllIlI[1];
            }
            this.ax = z3;
        }
        if (llllllIllIlIIl(widget4) && llllllIllIIIIl(widget4.isHidden() ? 1 : 0)) {
            String text2 = widget4.getText();
            this.aB = Integer.parseInt(text2.substring(text2.indexOf(llIIllIllIlI[36]) + llIIllIllIlI[2]).replace(llIIllIllIIl[llIIllIllIlI[2]], llIIllIllIIl[llIIllIllIlI[3]]).trim());
            "".length();
            if ((51 ^ 55) == " ".length()) {
                return;
            }
        } else {
            this.aB = llIIllIllIlI[1];
        }
        if (llllllIllIlIIl(widget6) && llllllIllIIIIl(widget6.isHidden() ? 1 : 0)) {
            String text3 = widget6.getText();
            if (llllllIllIlIIl(text3) && llllllIllIIIll(text3.contains(llIIllIllIIl[llIIllIllIlI[4]]) ? 1 : 0)) {
                String[] split = text3.split(llIIllIllIIl[llIIllIllIlI[5]]);
                this.as = Instant.now().plus(Integer.parseInt(split[llIIllIllIlI[1]]), (TemporalUnit) ChronoUnit.MINUTES).plus(Integer.parseInt(split[llIIllIllIlI[2]]), (TemporalUnit) ChronoUnit.SECONDS);
            }
        }
        if (llllllIllIlIIl(widget5) && llllllIllIIIIl(widget5.isHidden() ? 1 : 0)) {
            if (llllllIllIIlIl(this.ap) && llllllIllIlIIl(this.aq)) {
                this.aq = null;
                if (llllllIllIIIll(this.aj ? 1 : 0)) {
                    this.aj = llIIllIllIlI[1];
                }
            }
            this.au = widget5.getText();
            if (llllllIllIlIIl(this.ap)) {
                now = this.ap;
                "".length();
                if ((88 ^ 92) <= " ".length()) {
                    return;
                }
            } else {
                now = Instant.now();
            }
            this.ap = now;
            "".length();
            if ((-" ".length()) > 0) {
                return;
            }
        } else if (llllllIllIlIIl(widget) && llllllIllIIIIl(widget.isHidden() ? 1 : 0)) {
            if (llllllIllIlIIl(this.ap)) {
                this.aq = Instant.now();
            }
            this.au = null;
            this.ap = null;
        }
        Widget widget7 = this.ab.getWidget(llIIllIllIlI[37], llIIllIllIlI[2]);
        if (llllllIllIlIIl(widget7)) {
            String text4 = widget7.getText();
            if (llllllIllIIIll(text4.equals(llIIllIllIIl[llIIllIllIlI[6]]) ? 1 : 0)) {
                this.ay = llIIllIllIlI[1];
                "".length();
                if (0 != 0) {
                    return;
                }
                return;
            }
            Matcher matcher = K.matcher(text4);
            if (llllllIllIIIll(matcher.find(llIIllIllIlI[1]) ? 1 : 0)) {
                this.al = Integer.parseInt(matcher.group(llIIllIllIlI[2]));
                this.ak = Integer.parseInt(matcher.group(llIIllIllIlI[3]));
                if (llllllIllIIlII(this.ak, this.al)) {
                    int i3 = llIIllIllIlI[2];
                    "".length();
                    z2 = i3;
                    if (((60 ^ 51) & ((60 ^ 51) ^ (-1))) < 0) {
                        return;
                    }
                } else {
                    z2 = llIIllIllIlI[1];
                }
                this.aF = z2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean l() {
        Widget widget = this.ab.getWidget(llIIllIllIlI[46]);
        if (llllllIllIlIIl(widget) && llllllIllIIIIl(widget.isHidden() ? 1 : 0)) {
            ?? r0 = llIIllIllIlI[2];
            "".length();
            return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llIIllIllIlI[1];
    }

    public Set<GameObject> s() {
        return this.R;
    }

    public MouseEvent mouseDragged(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    public Set<e> v() {
        return this.U;
    }

    public boolean R() {
        return this.aF;
    }

    private static int llllllIllIlIll(long j2, long j3) {
        return (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
    }

    public int b() {
        return llllllIllIIIII(this.aB, llIIllIllIlI[24]) ? Inventory.getFreeSlots() + llIIllIllIlI[2] : this.az;
    }

    private static void llllllIlIllllI() {
        llIIllIllIIl = new String[llIIllIllIlI[22]];
        llIIllIllIIl[llIIllIllIlI[1]] = llllllIlIllIll("Aos/9+riQyw=", "LPuGR");
        llIIllIllIIl[llIIllIllIlI[2]] = llllllIlIlllII("Rg==", "coTux");
        llIIllIllIIl[llIIllIllIlI[3]] = llllllIlIllIll("A7SRfrbhA+8=", "nWSwt");
        llIIllIllIIl[llIIllIllIlI[4]] = llllllIlIlllII("SA==", "rOiWS");
        llIIllIllIIl[llIIllIllIlI[5]] = llllllIlIlllIl("ZWmzb35MjRc=", "QTjMv");
        llIIllIllIIl[llIIllIllIlI[6]] = llllllIlIlllII("OjpYITscJQttOBolHW0gGytYLDAFKxY5IQErCj50BCcMJT0dbhk/MVMkDT4gUygRIz0AJhEjM1M7CGN0KiENbTkGPQxxNgFwDyw9B24NIyAaIlg5PBY3WCwmFm4cIjoWbgwidBkhESN6", "sNxMT");
        llIIllIllIIl[llIIllIllIlI[7]] = llllllIlIllIll("s0aId2iU0RCgyERSMxWjd1wBz3P0NJ71YP4HGqsNIRA=", "XTlXW");
        llIIllIllIIl[llIIllIllIlI[8]] = llllllIlIlllIl("71PfbIGMaL0/1boEqMj1HoauzGXk1cKdt2HKBb9MwgCbKFNXt7cQ4At/exF1y8+9", "EqGbl");
        llIIllIllIIl[llIIllIllIlI[9]] = llllllIlIllIll("5j6oDV9SZwOITXYn1Aw5q/kxUeb6PgDS8kWoRaZPTBR42yhknhK1YbcDDyHov4g4", "Sgixf");
        llIIllIllIIl[llIIllIllIlI[10]] = llllllIlIllIll("H992ET8SI/70b6+i+6L391QhAu9b3DT68fe+q6s23DzRpYSZcjxCekWsD6QHdw3N", "ryNqR");
        llIIllIllIIl[llIIllIllIlI[11]] = llllllIlIlllII("Pz4vVhsEJD4XJ0sRPxc5Dz8rGDhLISMaJ0s9LxM7SyIiEyIZdjgfLR8lahk7DjhqECQZdisYJB8+LwRrWGZqBS4IOSQSOEU=", "kVJvK");
        llIIllIllIIl[llIIllIllIlI[12]] = llllllIlIlllII("LSMhUAgbOToUTgcjORVOGCM7BFQ=", "tLTpn");
        llIIllIllIIl[llIIllIllIlI[13]] = llllllIlIlllIl("5Ormnp8CrXtQjgr7glYpn+LIdXUXMA0yV1TMaa88JasjHp1uQWBCug==", "YcWcy");
        llIIllIllIIl[llIIllIllIlI[14]] = llllllIlIllIll("zvmtfY50soc=", "ezGop");
        llIIllIllIIl[llIIllIllIlI[15]] = llllllIlIlllII("GQA6EAc=", "ioOso");
        llIIllIllIIl[llIIllIllIlI[16]] = llllllIlIllIll("eb7fzmgBVWOEMYBSPSuxgodU0r1nMH69wpRac/+nSdr/W2a8rQZdopjbmb5eUO4piciO4A7LjOuYC1DyXQsim8HCWkLrccEf", "imXkJ");
        llIIllIllIIl[llIIllIllIlI[17]] = llllllIlIllIll("iQzTdxUPa3sAiB0NyC5+UsTtipgBe2ngPiTiUMLXv30T+Ru6xO4fBQ==", "qyprK");
        llIIllIllIIl[llIIllIllIlI[18]] = llllllIlIlllII("ExYCagsrDxJqSxYdXGNDKRgDKw8zDR4pQzoWHiQXOUZXKw0uWV8WB2FQVy8PLxQSJBcrFVc6DCMXAzlc", "JywJc");
        llIIllIllIIl[llIIllIllIlI[19]] = llllllIlIllIll("QpCW5egmguyUMOFCBHIF8T8iC49RIPEDRYHADUNZ6RYDkHzFxh7Qxi15p4XcbED1DrZORm1jL5hTgbY4TCqPyUd9oQHlC5vspZzXvH33UQEnlrPogPM1KlkIbmX7RQemmhw/xFIEDt79GETokuquYw==", "tkcoV");
        llIIllIllIIl[llIIllIllIlI[20]] = llllllIlIlllIl("o80LZBj7c+tDiQpepn1jFenGULi1QlEQ+0ry9lTqMjw0IKBb/LfCqy/o2FM4TK8wl71Ft62eblzqJULoFcrPuo18/5X+daDT", "cPdWp");
        llIIllIllIIl[llIIllIllIlI[21]] = llllllIlIllIll("RAkdaumHdbfKhDcg+Bh/ZqEcP4Nf2FFdYtwfDKpe0CoDASykvgJmzgTUCaBbmhppZbWiT7J0cn6SMgn8Ywhc/A==", "BrVEz");
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (llllllIllIIIIl(g() ? 1 : 0)) {
            return;
        }
        this.am = this.ab.getVarbitValue(llIIllIllIlI[44]);
        this.an = this.ab.getVarbitValue(llIIllIllIlI[45]);
    }

    public int q() {
        int[] iArr = new int[llIIllIllIlI[2]];
        iArr[llIIllIllIlI[1]] = llIIllIllIlI[47];
        int count = Inventory.getCount(iArr) + Inventory.getFreeSlots();
        for (Item item : Inventory.getAll(item2 -> {
            return item2.getName().endsWith(llIIllIllIIl[llIIllIllIlI[14]]);
        })) {
            e c2 = e.c(item.getId());
            if (llllllIllIIlIl(c2)) {
                "".length();
                if (((((53 + 112) - 39) + 67) ^ (((46 + 179) - 192) + 163)) == 0) {
                    return ((45 ^ 120) ^ (84 ^ 44)) & (((45 ^ 111) ^ (108 ^ 3)) ^ (-" ".length()));
                }
            } else {
                count += c2.ac();
                "".length();
                if (" ".length() == "   ".length()) {
                    return ((49 ^ 101) ^ (26 ^ 11)) & (((75 ^ 94) ^ (251 ^ 171)) ^ (-" ".length()));
                }
            }
        }
        return count;
    }

    private static boolean llllllIllIIlII(int i2, int i3) {
        return i2 < i3;
    }

    @Subscribe(priority = -1.0f)
    public void a(MenuAutomated menuAutomated) {
        if (llllllIllIIIIl(this.Y.helperMode() ? 1 : 0)) {
            return;
        }
        this.ab.getMouseHandler().sendMovement(this.aH, this.aI);
    }

    public Instant L() {
        return this.ar;
    }

    public Instant K() {
        return this.aq;
    }

    public GameObject z() {
        return this.ae;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    public boolean f() {
        GameState gameState = this.ab.getGameState();
        if (llllllIllIIIlI(gameState, GameState.LOGGED_IN) && llllllIllIIIlI(gameState, GameState.LOADING)) {
            return llIIllIllIlI[1];
        }
        Player local = Players.getLocal();
        return llllllIllIIIll(f.contains(local) ? 1 : 0) ? llIIllIllIlI[2] : llllllIllIIIll(e.contains(local) ? 1 : 0) ? llIIllIllIlI[1] : Widgets.isVisible(this.ab.getWidget(llIIllIllIlI[26]));
    }

    public GameObject B() {
        return this.ag;
    }

    public boolean O() {
        return this.ax;
    }

    private static boolean llllllIllIlIlI(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean llllllIllIllIl(int i2, int i3) {
        return i2 <= i3;
    }

    public void r() {
        this.aG = Static.getClient().getTickCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    public boolean c() {
        int a = a();
        if (llllllIllIIIII(a, b())) {
            this.aE = llIIllIllIlI[1];
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else if (llllllIllIIIIl(a)) {
            this.aE = llIIllIllIlI[2];
        }
        return this.aE;
    }

    private static String llllllIlIlllIl(String lllllllllllllllIlIIllIIlIIIlIIll, String lllllllllllllllIlIIllIIlIIIlIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIllIIlIIIlIIlI.getBytes(StandardCharsets.UTF_8)), llIIllIllIlI[9]), "DES");
            Cipher lllllllllllllllIlIIllIIlIIIlIlIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIllIIlIIIlIlIl.init(llIIllIllIlI[3], secretKeySpec);
            return new String(lllllllllllllllIlIIllIIlIIIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIllIIlIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIllIIlIIIIllll) {
            lllllllllllllllIlIIllIIlIIIIllll.printStackTrace();
            return null;
        }
    }

    public Item e() {
        return Inventory.getFirst(item -> {
            if (llllllIllIllII(item.getId(), llIIllIllIlI[51]) && llllllIllIllIl(item.getId(), llIIllIllIlI[48])) {
                ?? r0 = llIIllIllIlI[2];
                "".length();
                return "  ".length() == 0 ? ((((108 + 161) - 231) + 144) ^ (((87 + 126) - 135) + 85)) & (((151 ^ 135) ^ (101 ^ 96)) ^ (-" ".length())) : r0;
            }
            return llIIllIllIlI[1];
        });
    }

    public GameObject y() {
        return this.ad;
    }

    public EnumC0002c Q() {
        return this.aC;
    }
}
