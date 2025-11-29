/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  net.runelite.api.Animation
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.DynamicObject
 *  net.runelite.api.GameObject
 *  net.runelite.api.GameState
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.ItemContainerChanged
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.input.MouseListener
 *  net.runelite.client.input.MouseManager
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.MouseHandler
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.events.MenuAutomated
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.runecrafting;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.Provides;
import g.r.r.-.t.q.i.u.o.e.s.A;
import g.r.r.-.t.q.i.u.o.e.s.B;
import g.r.r.-.t.q.i.u.o.e.s.C;
import g.r.r.-.t.q.i.u.o.e.s.a;
import g.r.r.-.t.q.i.u.o.e.s.c;
import g.r.r.-.t.q.i.u.o.e.s.d;
import g.r.r.-.t.q.i.u.o.e.s.e;
import g.r.r.-.t.q.i.u.o.e.s.f;
import g.r.r.-.t.q.i.u.o.e.s.g;
import g.r.r.-.t.q.i.u.o.e.s.i;
import g.r.r.-.t.q.i.u.o.e.s.j;
import g.r.r.-.t.q.i.u.o.e.s.k;
import g.r.r.-.t.q.i.u.o.e.s.l;
import g.r.r.-.t.q.i.u.o.e.s.m;
import g.r.r.-.t.q.i.u.o.e.s.n;
import g.r.r.-.t.q.i.u.o.e.s.o;
import g.r.r.-.t.q.i.u.o.e.s.p;
import g.r.r.-.t.q.i.u.o.e.s.q;
import g.r.r.-.t.q.i.u.o.e.s.r;
import g.r.r.-.t.q.i.u.o.e.s.s;
import g.r.r.-.t.q.i.u.o.e.s.t;
import g.r.r.-.t.q.i.u.o.e.s.u;
import g.r.r.-.t.q.i.u.o.e.s.v;
import g.r.r.-.t.q.i.u.o.e.s.w;
import g.r.r.-.t.q.i.u.o.e.s.x;
import g.r.r.-.t.q.i.u.o.e.s.y;
import g.r.r.-.t.q.i.u.o.e.s.z;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.runecrafting.SquireGOTRConfig;
import gg.squire.runecrafting.overlay.GOTRInfoBox;
import java.awt.event.MouseEvent;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Iterator;
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
import net.runelite.api.DynamicObject;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
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
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.MouseHandler;
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

@PluginDescriptor(name="Squire Guardians of The Rift", enabledByDefault=false, description="Plays the GOTR minigame")
public class SquireGOTRPlugin
extends SquirePlugin
implements MouseListener {
    private final /* synthetic */ Class<?>[] Q;
    public static /* synthetic */ boolean P;
    private /* synthetic */ c aC;
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
    private /* synthetic */ a V;
    private /* synthetic */ String au;
    public static final /* synthetic */ int[] d;
    private static final /* synthetic */ int[] O;
    private static final /* synthetic */ int A;
    private /* synthetic */ GameObject ad;
    private static final /* synthetic */ String H;
    private static final /* synthetic */ String i;
    private final /* synthetic */ Set<GameObject> S;
    public static final /* synthetic */ RectangularArea g;
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

    private static String llllllIlIllIll(String var36, String var9) {
        try {
            SecretKeySpec var60 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var37 = Cipher.getInstance("Blowfish");
            var37.init(llIIllIllIlI[3], var60);
            return new String(var37.doFinal(Base64.getDecoder().decode(var36.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var28) {
            var28.printStackTrace();
            return null;
        }
    }

    protected void onStop() {
        this.getEventBus().unregister((Object)this.V);
        this.getEventBus().unregister((Object)this.W);
        this.Z.remove((Overlay)this.W);
        0;
        this.Z.remove((Overlay)this.aa);
        0;
        this.k();
    }

    public int N() {
        return this.at;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        NPC nPC = npcSpawned.getNpc();
        if (SquireGOTRPlugin.llllllIllIlIlI(nPC.getId(), llIIllIllIlI[43])) {
            this.ac = nPC;
        }
    }

    public boolean g() {
        return Arrays.stream(this.ab.getMapRegions()).anyMatch(n2 -> {
            boolean bl;
            if (SquireGOTRPlugin.llllllIllIlIlI(n2, llIIllIllIlI[50])) {
                bl = llIIllIllIlI[2];
                0;
                if (-1 > -1) {
                    return ((143 + 225 - 165 + 39 ^ 108 + 50 - -32 + 0) & (0x52 ^ 0x7C ^ (0xC ^ 0x6E) ^ -1)) != 0;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        });
    }

    private static boolean llllllIllIIllI(Object object, Object object2) {
        return object == object2;
    }

    public MouseEvent mouseClicked(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    public d h() {
        Object object;
        Object var1;
        SquireGOTRPlugin var32;
        if (SquireGOTRPlugin.llllllIllIIIlI((Object)this.m(), (Object)g.r.r.-.t.q.i.u.o.e.s.c.ACTIVE)) {
            return null;
        }
        Optional<d> var24 = Arrays.stream(g.r.r.-.t.q.i.u.o.e.s.d.values()).filter(d2 -> {
            boolean bl;
            if (SquireGOTRPlugin.llllllIllIlIlI(d2.Y(), this.av)) {
                bl = llIIllIllIlI[2];
                0;
                if (((119 + 41 - 47 + 92 ^ 65 + 123 - 95 + 36) & (33 + 190 - 164 + 162 ^ 127 + 38 - 26 + 6 ^ -1)) >= 1) {
                    return ((9 ^ 0x1B ^ (0x88 ^ 0xAC)) & (0x3B ^ 0x27 ^ (0xB8 ^ 0x92) ^ -1)) != 0;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        }).findFirst();
        Optional<d> var53 = Arrays.stream(g.r.r.-.t.q.i.u.o.e.s.d.values()).filter(d2 -> {
            boolean bl;
            if (SquireGOTRPlugin.llllllIllIlIlI(d2.Y(), this.aw)) {
                bl = llIIllIllIlI[2];
                0;
                if (1 < -1) {
                    return false;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        }).findFirst();
        Object var16 = null;
        if (!SquireGOTRPlugin.llllllIllIIIIl(var24.isEmpty() ? 1 : 0) || SquireGOTRPlugin.llllllIllIIIll(var53.isEmpty() ? 1 : 0)) {
            return null;
        }
        if (SquireGOTRPlugin.llllllIllIIIll(var32.Y.useTalisman() ? 1 : 0)) {
            var1 = g.r.r.-.t.q.i.u.o.e.s.d.values();
            int var23 = ((d[])var1).length;
            int var2 = llIIllIllIlI[1];
            while (SquireGOTRPlugin.llllllIllIIlII(var2, var23)) {
                d var52 = var1[var2];
                int[] nArray = new int[llIIllIllIlI[2]];
                nArray[SquireGOTRPlugin.llIIllIllIlI[1]] = var52.X();
                if (SquireGOTRPlugin.llllllIllIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    return var52;
                }
                ++var2;
                0;
                if ((0xFC ^ 0x9D ^ (0x6D ^ 8)) > -1) continue;
                return null;
            }
        }
        var1 = var24.get();
        d var23 = var53.get();
        if (SquireGOTRPlugin.llllllIllIIIIl(var32.Y.runeTypes().contains(var1) ? 1 : 0) && SquireGOTRPlugin.llllllIllIIIIl(var32.Y.runeTypes().contains((Object)var23) ? 1 : 0)) {
            return null;
        }
        if (SquireGOTRPlugin.llllllIllIIIll(var32.Y.runeTypes().contains(var1) ? 1 : 0) && SquireGOTRPlugin.llllllIllIIIIl(var32.Y.runeTypes().contains((Object)var23) ? 1 : 0)) {
            var16 = var1;
            0;
            
            }
        } else if (SquireGOTRPlugin.llllllIllIIIIl(var32.Y.runeTypes().contains(var1) ? 1 : 0)) {
            var16 = var23;
            0;
            if (-(0x52 ^ 0x57) >= 0) {
                return null;
            }
        } else {
            if (SquireGOTRPlugin.llllllIllIIIll(var32.Y.focusStrong() ? 1 : 0)) {
                if (SquireGOTRPlugin.llllllIllIIIII(((d)((Object)var1)).aa().ordinal(), var23.aa().ordinal())) {
                    var16 = var1;
                    0;
                    
                    }
                } else {
                    var16 = var23;
                }
            }
            if (SquireGOTRPlugin.llllllIllIIIll(var32.Y.balancePoints() ? 1 : 0) && SquireGOTRPlugin.llllllIllIIlIl(var16)) {
                Object object2;
                if (SquireGOTRPlugin.llllllIllIIIll(var32.aF ? 1 : 0)) {
                    object2 = var1;
                    0;
                    if (((87 + 12 - -25 + 38 ^ 109 + 160 - 217 + 143) & (0x3C ^ 0x79 ^ (0xD ^ 0x29) ^ -1)) >= 2) {
                        return null;
                    }
                } else {
                    object2 = var16 = var23;
                }
            }
            if (SquireGOTRPlugin.llllllIllIIlIl(var16)) {
                Object object3;
                if (SquireGOTRPlugin.llllllIllIIlII(var32.I(), var32.H())) {
                    object3 = var23;
                    0;
                    if ((0x60 ^ 0x64) == 0) {
                        return null;
                    }
                } else {
                    object3 = var1;
                }
                object = object3;
            }
        }
        return object;
    }

    public MouseEvent mouseMoved(MouseEvent mouseEvent) {
        this.aH = mouseEvent.getX();
        this.aI = mouseEvent.getY();
        return mouseEvent;
    }

    private boolean i() {
        int[] nArray = this.ab.getMapRegions();
        return Arrays.stream(nArray).anyMatch(n2 -> {
            boolean bl;
            if (SquireGOTRPlugin.llllllIllIlIlI(n2, llIIllIllIlI[50])) {
                bl = llIIllIllIlI[2];
                0;
                if (2 < 0) {
                    return false;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        });
    }

    private static boolean llllllIllIIIlI(Object object, Object object2) {
        return object != object2;
    }

    public c m() {
        SquireGOTRPlugin var29;
        if (!SquireGOTRPlugin.llllllIllIIllI(Game.getState(), GameState.LOGGED_IN) || SquireGOTRPlugin.llllllIllIIIll(this.l() ? 1 : 0)) {
            return var29.aC;
        }
        if (SquireGOTRPlugin.llllllIllIIIIl(var29.f() ? 1 : 0)) {
            var29.aC = g.r.r.-.t.q.i.u.o.e.s.c.OUTSIDE;
            0;
            if (3 < 0) {
                return null;
            }
        } else if (!SquireGOTRPlugin.llllllIllIIIlI(var29.as, Instant.MAX) || SquireGOTRPlugin.llllllIllIlIIl(var29.ar)) {
            var29.aC = g.r.r.-.t.q.i.u.o.e.s.c.ACTIVATING;
            0;
            if ((0xA7 ^ 0xA3) < 3) {
                return null;
            }
        } else if (SquireGOTRPlugin.llllllIllIlIII(SquireGOTRPlugin.llllllIllIlIll(var29.j(), 20L))) {
            var29.aC = g.r.r.-.t.q.i.u.o.e.s.c.COUNTDOWN;
            0;
            
            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var29.aA ? 1 : 0)) {
            var29.aC = g.r.r.-.t.q.i.u.o.e.s.c.FINISHING;
            0;
            if (-1 > 0) {
                return null;
            }
        } else {
            var29.aC = g.r.r.-.t.q.i.u.o.e.s.c.ACTIVE;
        }
        return this.aC;
    }

    public int d() {
        int[] nArray = new int[llIIllIllIlI[2]];
        nArray[SquireGOTRPlugin.llIIllIllIlI[1]] = llIIllIllIlI[25];
        return Inventory.getCount((boolean)llIIllIllIlI[2], (int[])nArray);
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
        this.k();
        this.X.registerMouseListener((MouseListener)this);
        this.getEventBus().register((Object)this.V);
        this.getEventBus().register((Object)this.W);
        this.Z.add((Overlay)this.aa);
        0;
        this.Z.add((Overlay)this.W);
        0;
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

    private static boolean llllllIllIIIIl(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        SquireGOTRPlugin var62;
        Object var4;
        void var42;
        if (SquireGOTRPlugin.llllllIllIIIlI(chatMessage.getType(), ChatMessageType.SPAM) && SquireGOTRPlugin.llllllIllIIIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var19 = var42.getMessage();
        if (SquireGOTRPlugin.llllllIllIIIll(var19.contains(llIIllIllIIl[llIIllIllIlI[7]]) ? 1 : 0)) {
            var4 = g.r.r.-.t.q.i.u.o.e.s.e.values();
            int var10 = ((e[])var4).length;
            int var61 = llIIllIllIlI[1];
            while (SquireGOTRPlugin.llllllIllIIlII(var61, var10)) {
                e var25 = var4[var61];
                var25.e(llIIllIllIlI[1]);
                ++var61;
                0;
                if ((0x88 ^ 0x8C) == (0x65 ^ 0x61)) continue;
                return;
            }
            var62.aq = Instant.now();
            var62.ar = null;
            var62.aj = llIIllIllIlI[2];
            0;
            if (1 < 1) {
                return;
            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var19.contains(llIIllIllIIl[llIIllIllIlI[8]]) ? 1 : 0)) {
            var62.ar = Instant.now().plusSeconds(30L);
            0;
            if (((0xBB ^ 0xB3 ^ (0x94 ^ 0xA4)) & (0 + 49 - 43 + 145 ^ 79 + 59 - 133 + 170 ^ -1)) == -1) {
                return;
            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var19.contains(llIIllIllIIl[llIIllIllIlI[9]]) ? 1 : 0)) {
            var62.ar = Instant.now().plusSeconds(10L);
            0;
            if (2 > 3) {
                return;
            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var19.contains(llIIllIllIIl[llIIllIllIlI[10]]) ? 1 : 0)) {
            var62.ar = Instant.now().plusSeconds(5L);
            0;
            if (2 <= -1) {
                return;
            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var19.contains(llIIllIllIIl[llIIllIllIlI[11]]) ? 1 : 0)) {
            var62.ar = Instant.now().plusSeconds(60L);
            0;
            if ((0x5A ^ 0x5E) == 0) {
                return;
            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var19.contains(llIIllIllIIl[llIIllIllIlI[12]]) ? 1 : 0)) {
            var62.ak -= llIIllIllIlI[2];
            var62.al -= llIIllIllIlI[2];
            0;
            if (((6 ^ 0xD ^ (0x40 ^ 0x4F)) & (31 + 47 - -24 + 42 ^ 131 + 9 - 102 + 110 ^ -1)) < 0) {
                return;
            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var19.contains(llIIllIllIIl[llIIllIllIlI[13]]) ? 1 : 0)) {
            var62.aA = llIIllIllIlI[2];
        }
        if (SquireGOTRPlugin.llllllIllIlIIl(var62.ar)) {
            var62.aA = llIIllIllIlI[1];
        }
        if (SquireGOTRPlugin.llllllIllIIIll(((Matcher)(var4 = I.matcher(var19))).find() ? 1 : 0)) {
            int n2;
            var62.ak = Integer.parseInt(((Matcher)var4).group(llIIllIllIlI[2]));
            var62.al = Integer.parseInt(((Matcher)var4).group(llIIllIllIlI[3]));
            if (SquireGOTRPlugin.llllllIllIIlII(var62.ak, var62.al)) {
                n2 = llIIllIllIlI[2];
                0;
                if (2 > (0x2A ^ 0x2E)) {
                    return;
                }
            } else {
                n2 = llIIllIllIlI[1];
            }
            var62.aF = n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        int n2;
        SquireGOTRPlugin var46;
        void var5;
        if (!SquireGOTRPlugin.llllllIllIIllI(itemContainerChanged.getItemContainer(), this.ab.getItemContainer(InventoryID.INVENTORY)) || SquireGOTRPlugin.llllllIllIIIIl(this.g() ? 1 : 0)) {
            return;
        }
        Item[] var20 = var5.getItemContainer().getItems();
        if (SquireGOTRPlugin.llllllIllIIIll(Arrays.stream(var20).anyMatch(item -> {
            boolean bl;
            if (SquireGOTRPlugin.llllllIllIlIlI(item.getId(), llIIllIllIlI[49])) {
                bl = llIIllIllIlI[2];
                0;
                if ((7 ^ 2 ^ 1) < 0) {
                    return ((53 + 146 - 59 + 22 ^ 78 + 44 - 36 + 60) & (0x31 ^ 0x7C ^ (0x49 ^ 0x34) ^ -1)) != 0;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        }) ? 1 : 0) && SquireGOTRPlugin.llllllIllIIIll(Arrays.stream(var20).anyMatch(item -> {
            boolean bl;
            if (SquireGOTRPlugin.llllllIllIlIlI(item.getId(), llIIllIllIlI[48])) {
                bl = llIIllIllIlI[2];
                0;
                if ((0x48 ^ 0x6D ^ (0x8F ^ 0xAE)) > (115 + 97 - 189 + 113 ^ 40 + 118 - 145 + 127)) {
                    return false;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        }) ? 1 : 0) && SquireGOTRPlugin.llllllIllIIIll(var46.ax ? 1 : 0)) {
            n2 = llIIllIllIlI[2];
            0;
            if (-((0xFF ^ 0xB4) & ~(0x47 ^ 0xC) ^ (0x8F ^ 0x8B)) >= 0) {
                return;
            }
        } else {
            n2 = llIIllIllIlI[1];
        }
        var46.ai = n2;
        var46.ao = Arrays.stream(var20).filter(item -> {
            boolean bl;
            if (SquireGOTRPlugin.llllllIllIlIlI(item.getId(), llIIllIllIlI[25])) {
                bl = llIIllIllIlI[2];
                0;
                if (3 == (0x70 ^ 0x74)) {
                    return false;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        }).mapToInt(Item::getQuantity).sum();
        IntStream intStream = Arrays.stream(var20).mapToInt(Item::getId);
        Set<Integer> set = m;
        Objects.requireNonNull(set);
        0;
        List var55 = intStream.filter(set::contains).boxed().collect(Collectors.toList());
        if (SquireGOTRPlugin.llllllIllIIlll(var55.size(), var46.T.size())) {
            var46.T.clear();
            var46.T.addAll(var55);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    int a(Widget widget, int n2) {
        if (SquireGOTRPlugin.llllllIllIlIIl(widget)) {
            void var33;
            int n3 = widget.getSpriteId();
            if (SquireGOTRPlugin.llllllIllIIlll(n3, n2)) {
                Optional<d> var41;
                if (SquireGOTRPlugin.llllllIllIlIII(n2)) {
                    var41 = Stream.of(g.r.r.-.t.q.i.u.o.e.s.d.values()).filter(d2 -> {
                        boolean bl;
                        if (SquireGOTRPlugin.llllllIllIlIlI(d2.Y(), n2)) {
                            bl = llIIllIllIlI[2];
                            0;
                            if ((1 ^ 5) <= ((0x7B ^ 0x23) & ~(0x7F ^ 0x27))) {
                                return false;
                            }
                        } else {
                            bl = llIIllIllIlI[1];
                        }
                        return bl;
                    }).findFirst();
                }
                var41 = Stream.of(g.r.r.-.t.q.i.u.o.e.s.d.values()).filter(arg_0 -> SquireGOTRPlugin.a((int)var33, arg_0)).findFirst();
            }
            return (int)var33;
        }
        return n2;
    }

    private static boolean llllllIllIIlll(int n2, int n3) {
        return n2 != n3;
    }

    public Instant J() {
        return this.ap;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        void var51;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (SquireGOTRPlugin.llllllIllIIIll(l.contains(gameObjectSpawned.getGameObject().getId()) ? 1 : 0)) {
            this.R.removeIf(gameObject2 -> {
                boolean bl;
                if (SquireGOTRPlugin.llllllIllIlIlI(gameObject2.getId(), gameObject.getId())) {
                    bl = llIIllIllIlI[2];
                    0;
                    
                    }
                } else {
                    bl = llIIllIllIlI[1];
                }
                return bl;
            });
            0;
            this.S.removeIf(gameObject2 -> {
                boolean bl;
                if (SquireGOTRPlugin.llllllIllIlIlI(gameObject2.getId(), gameObject.getId())) {
                    bl = llIIllIllIlI[2];
                    0;
                    
                    }
                } else {
                    bl = llIIllIllIlI[1];
                }
                return bl;
            });
            0;
            this.R.add(gameObject);
            0;
        }
        if (SquireGOTRPlugin.llllllIllIlIlI(var51.getId(), llIIllIllIlI[38])) {
            var12.ae = var51;
        }
        if (SquireGOTRPlugin.llllllIllIlIlI(var51.getId(), llIIllIllIlI[39])) {
            var12.ad = var51;
        }
        if (SquireGOTRPlugin.llllllIllIlIlI(var51.getId(), llIIllIllIlI[40])) {
            var12.ag = var51;
        }
        if (SquireGOTRPlugin.llllllIllIlIlI(var51.getId(), llIIllIllIlI[41])) {
            var12.af = var51;
        }
        if (SquireGOTRPlugin.llllllIllIlIlI(var51.getId(), llIIllIllIlI[42])) {
            var12.ah = var51;
        }
    }

    public SquireGOTRConfig w() {
        return this.Y;
    }

    private static boolean llllllIllIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIllIlIII(int n2) {
        return n2 > 0;
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
        SquireGOTRPlugin.llIIllIllIlI[0] = 0x6B ^ 0x7D;
        SquireGOTRPlugin.llIIllIllIlI[1] = (0xB8 ^ 0xBE ^ (0xF4 ^ 0xBA)) & (51 + 135 - 141 + 194 ^ 108 + 36 - 135 + 158 ^ -1);
        SquireGOTRPlugin.llIIllIllIlI[2] = 1;
        SquireGOTRPlugin.llIIllIllIlI[3] = 2;
        SquireGOTRPlugin.llIIllIllIlI[4] = 3;
        SquireGOTRPlugin.llIIllIllIlI[5] = 0xB7 ^ 0xB3;
        SquireGOTRPlugin.llIIllIllIlI[6] = 0x7E ^ 8 ^ (0xE1 ^ 0x92);
        SquireGOTRPlugin.llIIllIllIlI[7] = 0x42 ^ 0x44;
        SquireGOTRPlugin.llIIllIllIlI[8] = 0xF6 ^ 0xA4 ^ (0x6B ^ 0x3E);
        SquireGOTRPlugin.llIIllIllIlI[9] = 0x82 ^ 0x98 ^ (0x9F ^ 0x8D);
        SquireGOTRPlugin.llIIllIllIlI[10] = 0xF3 ^ 0xC2 ^ (0x33 ^ 0xB);
        SquireGOTRPlugin.llIIllIllIlI[11] = 8 ^ 0xD ^ (0x17 ^ 0x18);
        SquireGOTRPlugin.llIIllIllIlI[12] = 0x8E ^ 0x85;
        SquireGOTRPlugin.llIIllIllIlI[13] = 0x4D ^ 0x3F ^ (3 ^ 0x7D);
        SquireGOTRPlugin.llIIllIllIlI[14] = 0xED ^ 0xBA ^ (0x68 ^ 0x32);
        SquireGOTRPlugin.llIIllIllIlI[15] = 0x40 ^ 0x59 ^ (0x2D ^ 0x3A);
        SquireGOTRPlugin.llIIllIllIlI[16] = 0xC3 ^ 0x98 ^ (0x41 ^ 0x15);
        SquireGOTRPlugin.llIIllIllIlI[17] = 0xE ^ 0x1E;
        SquireGOTRPlugin.llIIllIllIlI[18] = 0x34 ^ 0x25;
        SquireGOTRPlugin.llIIllIllIlI[19] = 0x5A ^ 0x48;
        SquireGOTRPlugin.llIIllIllIlI[20] = 0x24 ^ 0x37;
        SquireGOTRPlugin.llIIllIllIlI[21] = 0x17 ^ 0x2D ^ (0xA9 ^ 0x87);
        SquireGOTRPlugin.llIIllIllIlI[22] = 0x2F ^ 0x3A;
        SquireGOTRPlugin.llIIllIllIlI[23] = 0xFFFFF8FE & 0x6FFF;
        SquireGOTRPlugin.llIIllIllIlI[24] = 0x93 ^ 0x9C ^ (0x38 ^ 0x6D);
        SquireGOTRPlugin.llIIllIllIlI[25] = 0xFFFFEFEB & 0x7916;
        SquireGOTRPlugin.llIIllIllIlI[26] = -(0xFFFFFBF5 & 0x2E1F) & (0xFFFFBEB5 & 0x2EA6B5F);
        SquireGOTRPlugin.llIIllIllIlI[27] = 6 + 141 - 114 + 117 ^ 113 + 106 - 161 + 129;
        SquireGOTRPlugin.llIIllIllIlI[28] = 0x19 ^ 0x41 ^ (0x19 ^ 0);
        SquireGOTRPlugin.llIIllIllIlI[29] = -(0xFFFFFFCF & 0x513D) & (0xFFFFFFDF & 0x75BF);
        SquireGOTRPlugin.llIIllIllIlI[30] = -(0xFFFFDFFB & 0x7B8F) & (0xFFFFDFFF & 0x2EA7B9E);
        SquireGOTRPlugin.llIIllIllIlI[31] = -(0xFFFFBD67 & 0x5399) & (0xFFFF9937 & 0x2EA77DF);
        SquireGOTRPlugin.llIIllIllIlI[32] = -(0xFFFFF7F6 & 0x3BEB) & (0xFFFFFFFF & 0x2EA33FF);
        SquireGOTRPlugin.llIIllIllIlI[33] = 0xFFFFFFBB & 0x2EA0056;
        SquireGOTRPlugin.llIIllIllIlI[34] = 0xFFFFE17B & 0x2EA1E9F;
        SquireGOTRPlugin.llIIllIllIlI[35] = -(0xFFFFEA7F & 0x75A9) & (0xFFFFFCBD & 0x2EA636F);
        SquireGOTRPlugin.llIIllIllIlI[36] = 0xA1 ^ 0xA4 ^ (0x74 ^ 0x4B);
        SquireGOTRPlugin.llIIllIllIlI[37] = 41 + 132 - 116 + 118 + (0x80 ^ 0x9E) - (0x51 ^ 0xB) + (0xD6 ^ 0xA4);
        SquireGOTRPlugin.llIIllIllIlI[38] = 0xFFFFEADF & 0xBFF5;
        SquireGOTRPlugin.llIIllIllIlI[39] = 0xFFFFFFDC & 0xAAF7;
        SquireGOTRPlugin.llIIllIllIlI[40] = 0xFFFFEFCB & 0xBAFE;
        SquireGOTRPlugin.llIIllIllIlI[41] = -(0xFFFFD53D & 0x7BF7) & (0xFFFFFFFF & 0xFBFF);
        SquireGOTRPlugin.llIIllIllIlI[42] = 0xFFFFBBD5 & 0xEEFB;
        SquireGOTRPlugin.llIIllIllIlI[43] = -(0xFFFFFB4B & 0x57B5) & (0xFFFFFFEB & 0x7F9F);
        SquireGOTRPlugin.llIIllIllIlI[44] = 0xFFFFB77F & 0x7DF6;
        SquireGOTRPlugin.llIIllIllIlI[45] = 0xFFFFF7FD & 0x3D77;
        SquireGOTRPlugin.llIIllIllIlI[46] = 0xFFFFD0CF & 0x2E92F31;
        SquireGOTRPlugin.llIIllIllIlI[47] = -(0xFFFFEF6B & 0x1795) & (0xFFFFFFFF & 0x6FFF);
        SquireGOTRPlugin.llIIllIllIlI[48] = -(0xFFFFB37F & 0x5EF1) & (0xFFFFFF76 & 0x7BFF);
        SquireGOTRPlugin.llIIllIllIlI[49] = -(0xFFFFBDBD & 0x7347) & (0xFFFFF7DF & 0x3FFF);
        SquireGOTRPlugin.llIIllIllIlI[50] = -(0xFFFFAB7E & 0x56ED) & (0xFFFFBFFF & 0x7AFF);
        SquireGOTRPlugin.llIIllIllIlI[51] = -(0xFFFFD7FF & 0x3E7D) & (0xFFFFFFFF & 0x7F7F);
        SquireGOTRPlugin.llIIllIllIlI[52] = -(0xFFFFF491 & 0x1F6F) & (0xFFFFFD3F & 0x7FFD);
        SquireGOTRPlugin.llIIllIllIlI[53] = 0xFFFFEBDA & 0x7D25;
        SquireGOTRPlugin.llIIllIllIlI[54] = -(0xFFFF9459 & 0x7BBF) & (0xFFFFFD1F & 0x7BF9);
        SquireGOTRPlugin.llIIllIllIlI[55] = 0xFFFFBFB5 & 0xEAFE;
        SquireGOTRPlugin.llIIllIllIlI[56] = 0xFFFFEFFD & 0xBB4B;
        SquireGOTRPlugin.llIIllIllIlI[57] = 0xFFFF9F7E & 0x6EA5;
        SquireGOTRPlugin.llIIllIllIlI[58] = -(0xFFFFDDF7 & 0x73DB) & (0xFFFFFFFF & 0x77DF);
        SquireGOTRPlugin.llIIllIllIlI[59] = -(0xFFFFD7D6 & 0x79EF) & (0xFFFFFFFF & 0x5FDF);
        SquireGOTRPlugin.llIIllIllIlI[60] = -(0xFFFFC1F7 & 0x7EFA) & (0xFFFFF7FF & 0x6DFB);
        SquireGOTRPlugin.llIIllIllIlI[61] = -(0xFFFFB3EF & 0x5D31) & (0xFFFFBFE7 & 0x5F3B);
        SquireGOTRPlugin.llIIllIllIlI[62] = -(0xFFFFCBF7 & 0x7499) & (0xFFFFFDDB & 0x67BF);
        SquireGOTRPlugin.llIIllIllIlI[63] = 0xFFFFDE6A & 0x2FD5;
        SquireGOTRPlugin.llIIllIllIlI[64] = 0xFFFFBD7F & 0x67AF;
        SquireGOTRPlugin.llIIllIllIlI[65] = 0xFFFFDE6F & 0x2F94;
        SquireGOTRPlugin.llIIllIllIlI[66] = 0xFFFFEF79 & 0x359F;
        SquireGOTRPlugin.llIIllIllIlI[67] = 0xFFFFDF9D & 0x2E6B;
        SquireGOTRPlugin.llIIllIllIlI[68] = -(0xFFFFFFEF & 0x5A5A) & (0xFFFFFFEF & 0x7F7F);
        SquireGOTRPlugin.llIIllIllIlI[69] = -(0xFFFFF8BB & 0x774F) & (0xFFFFFE3F & Short.MAX_VALUE);
        SquireGOTRPlugin.llIIllIllIlI[70] = -(0xFFFFFEE9 & 0x5177) & (0xFFFFFFFB & 0x757F);
        SquireGOTRPlugin.llIIllIllIlI[71] = -(0xFFFFF98F & 0x77F6) & (0xFFFFFFBF & Short.MAX_VALUE);
        SquireGOTRPlugin.llIIllIllIlI[72] = -(0xFFFF9B5F & 0x6EBB) & (0xFFFFEFBF & 0x3F7E);
        SquireGOTRPlugin.llIIllIllIlI[73] = -(0xFFFFF2FD & 0x2F7B) & (0xFFFFB7FF & Short.MAX_VALUE);
        SquireGOTRPlugin.llIIllIllIlI[74] = -(0xFFFFE7F7 & 0x782F) & (0xFFFFFDEF & 0x77BF);
        SquireGOTRPlugin.llIIllIllIlI[75] = -(0xFFFFD8FD & 0x6F07) & (0xFFFFDDCF & 0x7FBF);
        SquireGOTRPlugin.llIIllIllIlI[76] = -(0xFFFF911E & 0x7EEF) & (0xFFFFFCFF & 0x7BAF);
        SquireGOTRPlugin.llIIllIllIlI[77] = 0xFFFFBBBF & 0xEEF9;
        SquireGOTRPlugin.llIIllIllIlI[78] = -(0xFFFFD71B & 0x6DEF) & (0xFFFFFFFF & 0xEFBF);
        SquireGOTRPlugin.llIIllIllIlI[79] = 0xFFFFEBFF & 0xBEBE;
        SquireGOTRPlugin.llIIllIllIlI[80] = -(0xFFFFD73B & 0x3DC6) & (0xFFFFFFFF & 0xBFB7);
        SquireGOTRPlugin.llIIllIllIlI[81] = -(0xFFFFFDD9 & 0x562F) & (0xFFFFFFFF & 0xFEBF);
        SquireGOTRPlugin.llIIllIllIlI[82] = 0xFFFFEEBF & 0xBBFF;
        SquireGOTRPlugin.llIIllIllIlI[83] = 0xFFFFBEB8 & 0xEBFF;
        SquireGOTRPlugin.llIIllIllIlI[84] = -(0xFFFFA5CF & 0x5E73) & (0xFFFFFFFE & 0xAEFF);
        SquireGOTRPlugin.llIIllIllIlI[85] = 0xFFFFBAEF & 0xEFD0;
        SquireGOTRPlugin.llIIllIllIlI[86] = 0xFFFFEEBB & 0xBBFF;
        SquireGOTRPlugin.llIIllIllIlI[87] = -(0xFFFFE7BD & 0x1D47) & (0xFFFFAFFF & 0xFFBE);
        SquireGOTRPlugin.llIIllIllIlI[88] = 0xFFFFFAFF & 0xAFBD;
        SquireGOTRPlugin.llIIllIllIlI[89] = -(0xFFFFD77D & 0x7CB7) & (0xFFFFFFFF & 0x7F7F);
    }

    private static boolean llllllIllIllII(int n2, int n3) {
        return n2 >= n3;
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
        return (SquireGOTRConfig)configManager.getConfig(SquireGOTRConfig.class);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        void var40;
        if (SquireGOTRPlugin.llllllIllIIllI(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            this.aC = g.r.r.-.t.q.i.u.o.e.s.c.OUTSIDE;
            this.k();
        }
        if (SquireGOTRPlugin.llllllIllIIllI(var40.getGameState(), GameState.LOADING)) {
            SquireGOTRPlugin var31;
            var31.k();
        }
    }

    public int H() {
        return this.am;
    }

    private static boolean llllllIllIlIIl(Object object) {
        return object != null;
    }

    public SquireGOTRPlugin() {
        Class[] classArray = new Class[llIIllIllIlI[0]];
        classArray[SquireGOTRPlugin.llIIllIllIlI[1]] = z.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[2]] = C.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[3]] = B.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[4]] = A.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[5]] = j.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[6]] = k.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[7]] = l.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[8]] = i.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[9]] = w.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[10]] = x.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[11]] = y.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[12]] = u.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[13]] = n.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[14]] = s.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[15]] = t.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[16]] = o.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[17]] = v.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[18]] = m.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[19]] = q.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[20]] = p.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[21]] = r.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[22]] = g.class;
        this.Q = classArray;
        this.R = new HashSet<GameObject>();
        this.S = new HashSet<GameObject>();
        this.T = new HashSet<Integer>();
        this.U = new HashSet<e>();
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

    public int a() {
        int[] nArray = new int[llIIllIllIlI[2]];
        nArray[SquireGOTRPlugin.llIIllIllIlI[1]] = llIIllIllIlI[23];
        return Inventory.getCount((boolean)llIIllIllIlI[2], (int[])nArray);
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

    private static boolean llllllIllIIlIl(Object object) {
        return object == null;
    }

    private static String llllllIlIlllII(String var44, String var48) {
        var44 = new String(Base64.getDecoder().decode(var44.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var57 = var48.toCharArray();
        int var49 = llIIllIllIlI[1];
        char[] var26 = var44.toCharArray();
        int var38 = var26.length;
        int var64 = llIIllIllIlI[1];
        while (SquireGOTRPlugin.llllllIllIIlII(var64, var38)) {
            char var15 = var26[var64];
            var6.append((char)(var15 ^ var57[var49 % var57.length]));
            0;
            ++var49;
            ++var64;
            0;
            if (2 != ((170 + 7 - 0 + 71 ^ 9 + 82 - -61 + 2) & (109 + 40 - -1 + 45 ^ 148 + 109 - 168 + 72 ^ -1) & ((50 + 136 - 52 + 56 ^ 96 + 140 - 118 + 37) & (0x27 ^ 0x2C ^ (0x9E ^ 0xB0) ^ -1) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public MouseEvent mouseEntered(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    private static /* synthetic */ boolean a(int n2, d d2) {
        boolean bl;
        if (SquireGOTRPlugin.llllllIllIlIlI(d2.Y(), n2)) {
            bl = llIIllIllIlI[2];
            0;
            if (2 == 1) {
                return false;
            }
        } else {
            bl = llIIllIllIlI[1];
        }
        return bl;
    }

    static {
        SquireGOTRPlugin.llllllIlIlllll();
        SquireGOTRPlugin.llllllIlIllllI();
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
        int[] nArray = new int[llIIllIllIlI[3]];
        nArray[SquireGOTRPlugin.llIIllIllIlI[1]] = llIIllIllIlI[55];
        nArray[SquireGOTRPlugin.llIIllIllIlI[2]] = llIIllIllIlI[56];
        d = nArray;
        e = new RectangularArea(llIIllIllIlI[57], llIIllIllIlI[58], llIIllIllIlI[59], llIIllIllIlI[60], llIIllIllIlI[1]);
        f = new RectangularArea(llIIllIllIlI[61], llIIllIllIlI[62], llIIllIllIlI[63], llIIllIllIlI[64], llIIllIllIlI[1]);
        g = new RectangularArea(llIIllIllIlI[65], llIIllIllIlI[66], llIIllIllIlI[67], llIIllIllIlI[68], llIIllIllIlI[1]);
        h = new RectangularArea(llIIllIllIlI[69], llIIllIllIlI[70], llIIllIllIlI[71], llIIllIllIlI[72], llIIllIllIlI[1]);
        j = ImmutableList.of((Object)llIIllIllIlI[73], (Object)llIIllIllIlI[74], (Object)llIIllIllIlI[75], (Object)llIIllIllIlI[76]);
        Object[] objectArray = new Integer[llIIllIllIlI[7]];
        objectArray[SquireGOTRPlugin.llIIllIllIlI[1]] = llIIllIllIlI[83];
        objectArray[SquireGOTRPlugin.llIIllIllIlI[2]] = llIIllIllIlI[84];
        objectArray[SquireGOTRPlugin.llIIllIllIlI[3]] = llIIllIllIlI[85];
        objectArray[SquireGOTRPlugin.llIIllIllIlI[4]] = llIIllIllIlI[86];
        objectArray[SquireGOTRPlugin.llIIllIllIlI[5]] = llIIllIllIlI[87];
        objectArray[SquireGOTRPlugin.llIIllIllIlI[6]] = llIIllIllIlI[88];
        l = ImmutableSet.of((Object)llIIllIllIlI[77], (Object)llIIllIllIlI[78], (Object)llIIllIllIlI[79], (Object)llIIllIllIlI[80], (Object)llIIllIllIlI[81], (Object)llIIllIllIlI[82], (Object[])objectArray);
        m = Stream.of(g.r.r.-.t.q.i.u.o.e.s.d.values()).mapToInt(d::X).boxed().collect(Collectors.toSet());
        I = Pattern.compile(llIIllIllIIl[llIIllIllIlI[20]]);
        K = Pattern.compile(llIIllIllIIl[llIIllIllIlI[21]]);
        int[] nArray2 = new int[llIIllIllIlI[2]];
        nArray2[SquireGOTRPlugin.llIIllIllIlI[1]] = llIIllIllIlI[89];
        O = nArray2;
    }

    private static boolean llllllIllIIIII(int n2, int n3) {
        return n2 > n3;
    }

    public long j() {
        SquireGOTRPlugin var22;
        Instant instant = Instant.now();
        if (SquireGOTRPlugin.llllllIllIIIll(this.as.isBefore(instant) ? 1 : 0)) {
            return 0L;
        }
        if (SquireGOTRPlugin.llllllIllIIllI(var22.as, Instant.MAX)) {
            return -1L;
        }
        return Duration.between(Instant.now(), this.as).getSeconds();
    }

    public int I() {
        return this.an;
    }

    public int p() {
        int[] nArray = new int[llIIllIllIlI[2]];
        nArray[SquireGOTRPlugin.llIIllIllIlI[1]] = llIIllIllIlI[47];
        int n2 = Inventory.getCount((int[])nArray);
        Iterator var17 = Inventory.getAll(item -> item.getName().endsWith(llIIllIllIIl[llIIllIllIlI[15]])).iterator();
        while (SquireGOTRPlugin.llllllIllIIIll(var17.hasNext() ? 1 : 0)) {
            Item var34 = (Item)var17.next();
            e var14 = g.r.r.-.t.q.i.u.o.e.s.e.c(var34.getId());
            if (SquireGOTRPlugin.llllllIllIIlIl((Object)var14)) {
                0;
                if (-2 <= 0) continue;
                return (6 + 35 - 35 + 170 ^ 19 + 10 - 17 + 159) & (0x86 ^ 0xB9 ^ (0x1D ^ 0x39) ^ -1);
            }
            lllllllllllllllIlIIllIIlIlIIlllI += var14.ae();
            0;
            if ((103 + 49 - 132 + 108 ^ 22 + 25 - -72 + 14) > 0) continue;
            return (15 + 174 - 31 + 92 ^ 7 + 1 - -174 + 4) & (0x61 ^ 0x34 ^ (0xE ^ 0x1B) ^ -1);
        }
        return n2;
    }

    @Subscribe(priority=20.0f)
    public void onGameTick(GameTick gameTick) {
        String[] var7;
        String var58;
        Animation var21;
        GameObject var27;
        SquireGOTRPlugin var8;
        if (SquireGOTRPlugin.llllllIllIIIlI((Object)this.m(), (Object)g.r.r.-.t.q.i.u.o.e.s.c.ACTIVE)) {
            this.az = Rand.nextInt((int)llIIllIllIlI[27], (int)llIIllIllIlI[28]);
        }
        if (SquireGOTRPlugin.llllllIllIlIII(var8.ay)) {
            var8.ay -= llIIllIllIlI[2];
        }
        var8.S.removeIf(gameObject -> {
            boolean bl;
            Animation animation = ((DynamicObject)gameObject.getRenderable()).getAnimation();
            if (!SquireGOTRPlugin.llllllIllIlIIl(animation) || SquireGOTRPlugin.llllllIllIIlll(animation.getId(), llIIllIllIlI[29])) {
                bl = llIIllIllIlI[2];
                0;
                if (((94 + 135 - 116 + 38 ^ 83 + 50 - 76 + 73) & (132 + 110 - 118 + 35 ^ 91 + 41 - 118 + 124 ^ -1)) != 0) {
                    return ((77 + 43 - 25 + 72 ^ 122 + 3 - 39 + 59) & (0xE ^ 7 ^ (0xA1 ^ 0x9E) ^ -1)) != 0;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        });
        0;
        Widget var30 = var8.R.iterator();
        while (SquireGOTRPlugin.llllllIllIIIll(var30.hasNext() ? 1 : 0)) {
            var27 = var30.next();
            var21 = ((DynamicObject)var27.getRenderable()).getAnimation();
            if (SquireGOTRPlugin.llllllIllIlIIl(var21) && SquireGOTRPlugin.llllllIllIlIlI(var21.getId(), llIIllIllIlI[29])) {
                var8.S.add(var27);
                0;
            }
            0;
            if (2 == 2) continue;
            return;
        }
        var30 = var8.ab.getWidget(llIIllIllIlI[30]);
        var27 = var8.ab.getWidget(llIIllIllIlI[31]);
        var21 = var8.ab.getWidget(llIIllIllIlI[32]);
        Widget var65 = var8.ab.getWidget(llIIllIllIlI[33]);
        Widget var63 = var8.ab.getWidget(llIIllIllIlI[34]);
        Widget var43 = var8.ab.getWidget(llIIllIllIlI[35]);
        var8.av = var8.a(var30, var8.av);
        var8.aw = var8.a((Widget)var27, var8.aw);
        if (SquireGOTRPlugin.llllllIllIlIIl(var21)) {
            int n2;
            var58 = var21.getText();
            if (SquireGOTRPlugin.llllllIllIlIIl(var58) && SquireGOTRPlugin.llllllIllIIIIl(var58.contains(llIIllIllIIl[llIIllIllIlI[1]]) ? 1 : 0)) {
                n2 = llIIllIllIlI[2];
                0;
                if (-(8 ^ 0xC) >= 0) {
                    return;
                }
            } else {
                var8.ax = llIIllIllIlI[1];
                n2 = var8.ax ? 1 : 0;
            }
        }
        if (SquireGOTRPlugin.llllllIllIlIIl(var65) && SquireGOTRPlugin.llllllIllIIIIl(var65.isHidden() ? 1 : 0)) {
            var58 = var65.getText();
            var8.aB = Integer.parseInt(var58.substring(var58.indexOf(llIIllIllIlI[36]) + llIIllIllIlI[2]).replace(llIIllIllIIl[llIIllIllIlI[2]], llIIllIllIIl[llIIllIllIlI[3]]).trim());
            0;
            if ((0x33 ^ 0x37) == 1) {
                return;
            }
        } else {
            var8.aB = llIIllIllIlI[1];
        }
        if (SquireGOTRPlugin.llllllIllIlIIl(var43) && SquireGOTRPlugin.llllllIllIIIIl(var43.isHidden() ? 1 : 0) && SquireGOTRPlugin.llllllIllIlIIl(var58 = var43.getText()) && SquireGOTRPlugin.llllllIllIIIll(var58.contains(llIIllIllIIl[llIIllIllIlI[4]]) ? 1 : 0)) {
            var7 = var58.split(llIIllIllIIl[llIIllIllIlI[5]]);
            int var35 = Integer.parseInt(var7[llIIllIllIlI[1]]);
            int var39 = Integer.parseInt(var7[llIIllIllIlI[2]]);
            var8.as = Instant.now().plus((long)var35, ChronoUnit.MINUTES).plus((long)var39, ChronoUnit.SECONDS);
        }
        if (SquireGOTRPlugin.llllllIllIlIIl(var63) && SquireGOTRPlugin.llllllIllIIIIl(var63.isHidden() ? 1 : 0)) {
            Instant instant;
            if (SquireGOTRPlugin.llllllIllIIlIl(var8.ap) && SquireGOTRPlugin.llllllIllIlIIl(var8.aq)) {
                var8.aq = null;
                if (SquireGOTRPlugin.llllllIllIIIll(var8.aj ? 1 : 0)) {
                    var8.aj = llIIllIllIlI[1];
                }
            }
            var8.au = var63.getText();
            if (SquireGOTRPlugin.llllllIllIlIIl(var8.ap)) {
                instant = var8.ap;
                0;
                if ((0x58 ^ 0x5C) <= 1) {
                    return;
                }
            } else {
                instant = Instant.now();
            }
            var8.ap = instant;
            0;
            if (-1 > 0) {
                return;
            }
        } else if (SquireGOTRPlugin.llllllIllIlIIl(var30) && SquireGOTRPlugin.llllllIllIIIIl(var30.isHidden() ? 1 : 0)) {
            if (SquireGOTRPlugin.llllllIllIlIIl(var8.ap)) {
                var8.aq = Instant.now();
            }
            var8.au = null;
            var8.ap = null;
        }
        if (SquireGOTRPlugin.llllllIllIlIIl(var58 = var8.ab.getWidget(llIIllIllIlI[37], llIIllIllIlI[2]))) {
            var7 = var58.getText();
            if (SquireGOTRPlugin.llllllIllIIIll(var7.equals(llIIllIllIIl[llIIllIllIlI[6]]) ? 1 : 0)) {
                var8.ay = llIIllIllIlI[1];
                0;
                
                }
            } else {
                Matcher var35 = K.matcher((CharSequence)var7);
                if (SquireGOTRPlugin.llllllIllIIIll(var35.find(llIIllIllIlI[1]) ? 1 : 0)) {
                    int n3;
                    var8.al = Integer.parseInt(var35.group(llIIllIllIlI[2]));
                    var8.ak = Integer.parseInt(var35.group(llIIllIllIlI[3]));
                    if (SquireGOTRPlugin.llllllIllIIlII(var8.ak, var8.al)) {
                        n3 = llIIllIllIlI[2];
                        0;
                        if (((0x3C ^ 0x33) & ~(0x3C ^ 0x33)) < 0) {
                            return;
                        }
                    } else {
                        n3 = llIIllIllIlI[1];
                    }
                    var8.aF = n3;
                }
            }
        }
    }

    public boolean l() {
        int n2;
        Widget widget = this.ab.getWidget(llIIllIllIlI[46]);
        if (SquireGOTRPlugin.llllllIllIlIIl(widget) && SquireGOTRPlugin.llllllIllIIIIl(widget.isHidden() ? 1 : 0)) {
            n2 = llIIllIllIlI[2];
            0;
            if (((0xF4 ^ 0xC5) & ~(0x75 ^ 0x44)) != 0) {
                return false;
            }
        } else {
            n2 = llIIllIllIlI[1];
        }
        return n2 != 0;
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

    private static int llllllIllIlIll(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public int b() {
        if (SquireGOTRPlugin.llllllIllIIIII(this.aB, llIIllIllIlI[24])) {
            return Inventory.getFreeSlots() + llIIllIllIlI[2];
        }
        return this.az;
    }

    private static void llllllIlIllllI() {
        llIIllIllIIl = new String[llIIllIllIlI[22]];
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[1]] = SquireGOTRPlugin."10/10";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[2]] = SquireGOTRPlugin."%";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[3]] = SquireGOTRPlugin."";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[4]] = SquireGOTRPlugin.":";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[5]] = SquireGOTRPlugin.":";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[6]] = SquireGOTRPlugin."It looks like the adventurers within are just finishing up. You must<br>wait until they are done to join.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[7]] = SquireGOTRPlugin."The rift becomes active!";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[8]] = SquireGOTRPlugin."The rift will become active in 30 seconds.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[9]] = SquireGOTRPlugin."The rift will become active in 10 seconds.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[10]] = SquireGOTRPlugin."The rift will become active in 5 seconds.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[11]] = SquireGOTRPlugin."The Portal Guardians will keep their rifts open for another 30 seconds.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[12]] = SquireGOTRPlugin."You found some loot:";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[13]] = SquireGOTRPlugin."The Great Guardian is fully charged";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[14]] = SquireGOTRPlugin."pouch";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[15]] = SquireGOTRPlugin."pouch";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[16]] = SquireGOTRPlugin."Total elemental energy:[^>]+>(\\d+).*Total catalytic energy:[^>]+>(\\d+).";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[17]] = SquireGOTRPlugin."Your pouch has decayed through use.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[18]] = SquireGOTRPlugin."You have (\\d+) catalytic points? and (\\d+) elemental points?";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[19]] = SquireGOTRPlugin."It looks like the adventurers within are just finishing up. You must<br>wait until they are done to join.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[20]] = SquireGOTRPlugin."Total elemental energy:[^>]+>(\\d+).*Total catalytic energy:[^>]+>(\\d+).";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[21]] = SquireGOTRPlugin."You have (\\d+) catalytic points? and (\\d+) elemental points?";
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (SquireGOTRPlugin.llllllIllIIIIl(this.g() ? 1 : 0)) {
            return;
        }
        this.am = this.ab.getVarbitValue(llIIllIllIlI[44]);
        this.an = this.ab.getVarbitValue(llIIllIllIlI[45]);
    }

    public int q() {
        int[] nArray = new int[llIIllIllIlI[2]];
        nArray[SquireGOTRPlugin.llIIllIllIlI[1]] = llIIllIllIlI[47];
        int n2 = Inventory.getCount((int[])nArray) + Inventory.getFreeSlots();
        Iterator var54 = Inventory.getAll(item -> item.getName().endsWith(llIIllIllIIl[llIIllIllIlI[14]])).iterator();
        while (SquireGOTRPlugin.llllllIllIIIll(var54.hasNext() ? 1 : 0)) {
            Item var11 = (Item)var54.next();
            e var13 = g.r.r.-.t.q.i.u.o.e.s.e.c(var11.getId());
            if (SquireGOTRPlugin.llllllIllIIlIl((Object)var13)) {
                0;
                if ((53 + 112 - 39 + 67 ^ 46 + 179 - 192 + 163) != 0) continue;
                return (0x2D ^ 0x78 ^ (0x54 ^ 0x2C)) & (0x2D ^ 0x6F ^ (0x6C ^ 3) ^ -1);
            }
            lllllllllllllllIlIIllIIlIlIIIllI += var13.ac();
            0;
            if (1 != 3) continue;
            return (0x31 ^ 0x65 ^ (0x1A ^ 0xB)) & (0x4B ^ 0x5E ^ (0xFB ^ 0xAB) ^ -1);
        }
        return n2;
    }

    private static boolean llllllIllIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Subscribe(priority=-1.0f)
    public void a(MenuAutomated menuAutomated) {
        if (SquireGOTRPlugin.llllllIllIIIIl(this.Y.helperMode() ? 1 : 0)) {
            return;
        }
        MouseHandler mouseHandler = this.ab.getMouseHandler();
        mouseHandler.sendMovement(this.aH, this.aI);
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

    public boolean f() {
        GameState gameState = this.ab.getGameState();
        if (SquireGOTRPlugin.llllllIllIIIlI(gameState, GameState.LOGGED_IN) && SquireGOTRPlugin.llllllIllIIIlI(gameState, GameState.LOADING)) {
            return llIIllIllIlI[1];
        }
        Player var56 = Players.getLocal();
        if (SquireGOTRPlugin.llllllIllIIIll(f.contains((Locatable)var56) ? 1 : 0)) {
            return llIIllIllIlI[2];
        }
        if (SquireGOTRPlugin.llllllIllIIIll(e.contains((Locatable)var56) ? 1 : 0)) {
            return llIIllIllIlI[1];
        }
        Widget widget = this.ab.getWidget(llIIllIllIlI[26]);
        return Widgets.isVisible((Widget)widget);
    }

    public GameObject B() {
        return this.ag;
    }

    public boolean O() {
        return this.ax;
    }

    private static boolean llllllIllIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllllIllIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    public void r() {
        this.aG = Static.getClient().getTickCount();
    }

    /*
     * WARNING - void declaration
     */
    public boolean c() {
        void var47;
        int n2 = this.a();
        if (SquireGOTRPlugin.llllllIllIIIII(n2, this.b())) {
            this.aE = llIIllIllIlI[1];
            0;
            
            }
        } else if (SquireGOTRPlugin.llllllIllIIIIl((int)var47)) {
            lllllllllllllllIlIIllIIlllIIIIII.aE = llIIllIllIlI[2];
        }
        return this.aE;
    }

    private static String llllllIlIlllIl(String var3, String var50) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var50.getBytes(StandardCharsets.UTF_8)), llIIllIllIlI[9]), "DES");
            Cipher var45 = Cipher.getInstance("DES");
            var45.init(llIIllIllIlI[3], var18);
            return new String(var45.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var59) {
            var59.printStackTrace();
            return null;
        }
    }

    public Item e() {
        return Inventory.getFirst(item -> {
            int n2;
            if (SquireGOTRPlugin.llllllIllIllII(item.getId(), llIIllIllIlI[51]) && SquireGOTRPlugin.llllllIllIllIl(item.getId(), llIIllIllIlI[48])) {
                n2 = llIIllIllIlI[2];
                0;
                if (2 == 0) {
                    return ((108 + 161 - 231 + 144 ^ 87 + 126 - 135 + 85) & (0x97 ^ 0x87 ^ (0x65 ^ 0x60) ^ -1)) != 0;
                }
            } else {
                n2 = llIIllIllIlI[1];
            }
            return n2 != 0;
        });
    }

    public GameObject y() {
        return this.ad;
    }

    public c Q() {
        return this.aC;
    }
}

