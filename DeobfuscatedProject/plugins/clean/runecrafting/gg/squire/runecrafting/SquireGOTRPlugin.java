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
import gg.squire.runecrafting.EmptyingPouchesTask;
import gg.squire.runecrafting.FillingRunePouchesTask;
import gg.squire.runecrafting.RepairingPouchesTask;
import gg.squire.runecrafting.AHelper;
import gg.squire.runecrafting.GameEnum14;
import gg.squire.runecrafting.GameEnum24;
import gg.squire.runecrafting.GameEnum16;
import gg.squire.runecrafting.RunecraftingEventHandler;
import gg.squire.runecrafting.ForceLeavingAltarTask;
import gg.squire.runecrafting.UsingDragonPickaxeSpecialTask;
import gg.squire.runecrafting.GrabbingUnchargedCellsTask;
import gg.squire.runecrafting.GrabbingAWeakCellTask;
import gg.squire.runecrafting.MiningInitalFragmentsTask;
import gg.squire.runecrafting.CraftingAGuardianTask;
import gg.squire.runecrafting.CreatingEssenceTask;
import gg.squire.runecrafting.MiningExtraFragmentsTask;
import gg.squire.runecrafting.CraftingRunesTask;
import gg.squire.runecrafting.EnteringAltarTask;
import gg.squire.runecrafting.LeavingTheAltarTask;
import gg.squire.runecrafting.DepositingGuardianStoneTask;
import gg.squire.runecrafting.DepositingRunesTask;
import gg.squire.runecrafting.DroppingTalismanTask;
import gg.squire.runecrafting.PlacingACellTask;
import gg.squire.runecrafting.EnteringEssencePortalTask;
import gg.squire.runecrafting.LeavingRemainsPortalTask;
import gg.squire.runecrafting.MiningHugeRemainsTask;
import gg.squire.runecrafting.EnteringMinigameTask;
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
    private final  Class<?>[] Q;
    public static  boolean P;
    private  c aC;
    private static final  int t;
    private static final  int y;
    public static final  RectangularArea f;
    private  int aD;
    private  int aw;
    private  NPC ac;
    private  int aI;
    
    private  GameObject af;
    private static final  int k;
    private  Instant as;
    private static final  Pattern K;
    private  boolean ax;
    @Inject
    private  f W;
    private static final  int o;
    private  int at;
    private  boolean aF;
    @Inject
    private  Client ab;
    private  int aG;
    @Inject
    private  OverlayManager Z;
    private static final  String N;
    private static final  int B;
    public static final  RectangularArea h;
    private static final  int L;
    private  int az;
    private static final  int p;
    private  int av;
    private static final  int w;
    private  int am;
    private static final  String J;
    private final  Set<GameObject> R;
    private  boolean ai;
    private  GameObject ah;
    private  GameObject ag;
    private static final  int r;
    private  Instant ar;
    private static final  int F;
    public static final  RectangularArea e;
    private  GameObject ae;
    private final  Set<Integer> T;
    private  int aH;
    private  int al;
    private static final  int u;
    private  boolean aj;
    @Inject
    private  GOTRInfoBox aa;
    private static final  int C;
    private static final  Set<Integer> l;
    private static final  Set<Integer> m;
    private static final  int x;
    private static final  int v;
    private  Instant aq;
    private  boolean aA;
    private static final  int D;
    private static final  int s;
    
    private static final  List<Integer> j;
    private static final  Pattern I;
    private static final  int G;
    private  int ay;
    private static final  int z;
    private static final  int q;
    private  int ak;
    @Inject
    private  a V;
    private  String au;
    public static final  int[] d;
    private static final  int[] O;
    private static final  int A;
    private  GameObject ad;
    private static final  String H;
    private static final  String i;
    private final  Set<GameObject> S;
    public static final  RectangularArea g;
    private static final  Logger c;
    @Inject
    private  MouseManager X;
    private  boolean aE;
    private  long ao;
    private static final  int n;
    private static final  int M;
    private  int aB;
    private final  Set<e> U;
    private static final  int E;
    @Inject
    private  SquireGOTRConfig Y;
    private  Instant ap;
    private  int an;

    protected void onStop() {
        this.getEventBus().unregister((Object)this.V);
        this.getEventBus().unregister((Object)this.W);
        this.Z.remove((Overlay)this.W);

        this.Z.remove((Overlay)this.aa);

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
        SquireGOTRPlugin var2;
        if (SquireGOTRPlugin.llllllIllIIIlI((Object)this.m(), (Object)g.r.r.-.t.q.i.u.o.e.s.c.ACTIVE)) {
            return null;
        }
        Optional<d> var3 = Arrays.stream(g.r.r.-.t.q.i.u.o.e.s.d.values()).filter(d2 -> {
            boolean bl;
            if (SquireGOTRPlugin.llllllIllIlIlI(d2.Y(), this.av)) {
                bl = llIIllIllIlI[2];

                if (((119 + 41 - 47 + 92 ^ 65 + 123 - 95 + 36) & (33 + 190 - 164 + 162 ^ 127 + 38 - 26 + 6 ^ -1)) >= 1) {
                    return ((9 ^ 0x1B ^ (0x88 ^ 0xAC)) & (0x3B ^ 0x27 ^ (0xB8 ^ 0x92) ^ -1)) != 0;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        }).findFirst();
        Optional<d> var4 = Arrays.stream(g.r.r.-.t.q.i.u.o.e.s.d.values()).filter(d2 -> {
            boolean bl;
            if (SquireGOTRPlugin.llllllIllIlIlI(d2.Y(), this.aw)) {
                bl = llIIllIllIlI[2];

                if (1 < -1) {
                    return false;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        }).findFirst();
        Object var5 = null;
        if (!SquireGOTRPlugin.llllllIllIIIIl(var3.isEmpty() ? 1 : 0) || SquireGOTRPlugin.llllllIllIIIll(var4.isEmpty() ? 1 : 0)) {
            return null;
        }
        if (SquireGOTRPlugin.llllllIllIIIll(var2.Y.useTalisman() ? 1 : 0)) {
            var1 = g.r.r.-.t.q.i.u.o.e.s.d.values();
            int var6 = ((d[])var1).length;
            int var7 = llIIllIllIlI[1];
            while (SquireGOTRPlugin.llllllIllIIlII(var7, var6)) {
                d var8 = var1[var7];
                int[] nArray = new int[llIIllIllIlI[2]];
                nArray[SquireGOTRPlugin.llIIllIllIlI[1]] = var8.X();
                if (SquireGOTRPlugin.llllllIllIIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                    return var8;
                }
                ++var7;

                if ((0xFC ^ 0x9D ^ (0x6D ^ 8)) > -1) continue;
                return null;
            }
        }
        var1 = var3.get();
        d var6 = var4.get();
        if (SquireGOTRPlugin.llllllIllIIIIl(var2.Y.runeTypes().contains(var1) ? 1 : 0) && SquireGOTRPlugin.llllllIllIIIIl(var2.Y.runeTypes().contains((Object)var6) ? 1 : 0)) {
            return null;
        }
        if (SquireGOTRPlugin.llllllIllIIIll(var2.Y.runeTypes().contains(var1) ? 1 : 0) && SquireGOTRPlugin.llllllIllIIIIl(var2.Y.runeTypes().contains((Object)var6) ? 1 : 0)) {
            var5 = var1;

            }
        } else if (SquireGOTRPlugin.llllllIllIIIIl(var2.Y.runeTypes().contains(var1) ? 1 : 0)) {
            var5 = var6;

            if (-(0x52 ^ 0x57) >= 0) {
                return null;
            }
        } else {
            if (SquireGOTRPlugin.llllllIllIIIll(var2.Y.focusStrong() ? 1 : 0)) {
                if (SquireGOTRPlugin.llllllIllIIIII(((d)((Object)var1)).aa().ordinal(), var6.aa().ordinal())) {
                    var5 = var1;

                    }
                } else {
                    var5 = var6;
                }
            }
            if (SquireGOTRPlugin.llllllIllIIIll(var2.Y.balancePoints() ? 1 : 0) && SquireGOTRPlugin.llllllIllIIlIl(var5)) {
                Object object2;
                if (SquireGOTRPlugin.llllllIllIIIll(var2.aF ? 1 : 0)) {
                    object2 = var1;

                    if (((87 + 12 - -25 + 38 ^ 109 + 160 - 217 + 143) & (0x3C ^ 0x79 ^ (0xD ^ 0x29) ^ -1)) >= 2) {
                        return null;
                    }
                } else {
                    object2 = var5 = var6;
                }
            }
            if (SquireGOTRPlugin.llllllIllIIlIl(var5)) {
                Object object3;
                if (SquireGOTRPlugin.llllllIllIIlII(var2.I(), var2.H())) {
                    object3 = var6;

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
        SquireGOTRPlugin var9;
        if (!SquireGOTRPlugin.llllllIllIIllI(Game.getState(), GameState.LOGGED_IN) || SquireGOTRPlugin.llllllIllIIIll(this.l() ? 1 : 0)) {
            return var9.aC;
        }
        if (SquireGOTRPlugin.llllllIllIIIIl(var9.f() ? 1 : 0)) {
            var9.aC = g.r.r.-.t.q.i.u.o.e.s.c.OUTSIDE;

            if (3 < 0) {
                return null;
            }
        } else if (!SquireGOTRPlugin.llllllIllIIIlI(var9.as, Instant.MAX) || SquireGOTRPlugin.llllllIllIlIIl(var9.ar)) {
            var9.aC = g.r.r.-.t.q.i.u.o.e.s.c.ACTIVATING;

            if ((0xA7 ^ 0xA3) < 3) {
                return null;
            }
        } else if (SquireGOTRPlugin.llllllIllIlIII(SquireGOTRPlugin.llllllIllIlIll(var9.j(), 20L))) {
            var9.aC = g.r.r.-.t.q.i.u.o.e.s.c.COUNTDOWN;

            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var9.aA ? 1 : 0)) {
            var9.aC = g.r.r.-.t.q.i.u.o.e.s.c.FINISHING;

        } else {
            var9.aC = g.r.r.-.t.q.i.u.o.e.s.c.ACTIVE;
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

        this.Z.add((Overlay)this.W);

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
        SquireGOTRPlugin var10;
        Object var11;
        void var12;
        if (SquireGOTRPlugin.llllllIllIIIlI(chatMessage.getType(), ChatMessageType.SPAM) && SquireGOTRPlugin.llllllIllIIIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        String var13 = var12.getMessage();
        if (SquireGOTRPlugin.llllllIllIIIll(var13.contains(llIIllIllIIl[llIIllIllIlI[7]]) ? 1 : 0)) {
            var11 = g.r.r.-.t.q.i.u.o.e.s.e.values();
            int var14 = ((e[])var11).length;
            int var15 = llIIllIllIlI[1];
            while (SquireGOTRPlugin.llllllIllIIlII(var15, var14)) {
                e var16 = var11[var15];
                var16.e(llIIllIllIlI[1]);
                ++var15;

                if ((0x88 ^ 0x8C) == (0x65 ^ 0x61)) continue;
                return;
            }
            var10.aq = Instant.now();
            var10.ar = null;
            var10.aj = llIIllIllIlI[2];

            if (1 < 1) {
                return;
            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var13.contains(llIIllIllIIl[llIIllIllIlI[8]]) ? 1 : 0)) {
            var10.ar = Instant.now().plusSeconds(30L);

            if (((0xBB ^ 0xB3 ^ (0x94 ^ 0xA4)) & (0 + 49 - 43 + 145 ^ 79 + 59 - 133 + 170 ^ -1)) == -1) {
                return;
            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var13.contains(llIIllIllIIl[llIIllIllIlI[9]]) ? 1 : 0)) {
            var10.ar = Instant.now().plusSeconds(10L);

            if (2 > 3) {
                return;
            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var13.contains(llIIllIllIIl[llIIllIllIlI[10]]) ? 1 : 0)) {
            var10.ar = Instant.now().plusSeconds(5L);

            if (2 <= -1) {
                return;
            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var13.contains(llIIllIllIIl[llIIllIllIlI[11]]) ? 1 : 0)) {
            var10.ar = Instant.now().plusSeconds(60L);

            if ((0x5A ^ 0x5E) == 0) {
                return;
            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var13.contains(llIIllIllIIl[llIIllIllIlI[12]]) ? 1 : 0)) {
            var10.ak -= llIIllIllIlI[2];
            var10.al -= llIIllIllIlI[2];

            if (((6 ^ 0xD ^ (0x40 ^ 0x4F)) & (31 + 47 - -24 + 42 ^ 131 + 9 - 102 + 110 ^ -1)) < 0) {
                return;
            }
        } else if (SquireGOTRPlugin.llllllIllIIIll(var13.contains(llIIllIllIIl[llIIllIllIlI[13]]) ? 1 : 0)) {
            var10.aA = llIIllIllIlI[2];
        }
        if (SquireGOTRPlugin.llllllIllIlIIl(var10.ar)) {
            var10.aA = llIIllIllIlI[1];
        }
        if (SquireGOTRPlugin.llllllIllIIIll(((Matcher)(var11 = I.matcher(var13))).find() ? 1 : 0)) {
            int n2;
            var10.ak = Integer.parseInt(((Matcher)var11).group(llIIllIllIlI[2]));
            var10.al = Integer.parseInt(((Matcher)var11).group(llIIllIllIlI[3]));
            if (SquireGOTRPlugin.llllllIllIIlII(var10.ak, var10.al)) {
                n2 = llIIllIllIlI[2];

                if (2 > (0x2A ^ 0x2E)) {
                    return;
                }
            } else {
                n2 = llIIllIllIlI[1];
            }
            var10.aF = n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        int n2;
        SquireGOTRPlugin var17;
        void var18;
        if (!SquireGOTRPlugin.llllllIllIIllI(itemContainerChanged.getItemContainer(), this.ab.getItemContainer(InventoryID.INVENTORY)) || SquireGOTRPlugin.llllllIllIIIIl(this.g() ? 1 : 0)) {
            return;
        }
        Item[] var19 = var18.getItemContainer().getItems();
        if (SquireGOTRPlugin.llllllIllIIIll(Arrays.stream(var19).anyMatch(item -> {
            boolean bl;
            if (SquireGOTRPlugin.llllllIllIlIlI(item.getId(), llIIllIllIlI[49])) {
                bl = llIIllIllIlI[2];

                if ((7 ^ 2 ^ 1) < 0) {
                    return ((53 + 146 - 59 + 22 ^ 78 + 44 - 36 + 60) & (0x31 ^ 0x7C ^ (0x49 ^ 0x34) ^ -1)) != 0;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        }) ? 1 : 0) && SquireGOTRPlugin.llllllIllIIIll(Arrays.stream(var19).anyMatch(item -> {
            boolean bl;
            if (SquireGOTRPlugin.llllllIllIlIlI(item.getId(), llIIllIllIlI[48])) {
                bl = llIIllIllIlI[2];

                if ((0x48 ^ 0x6D ^ (0x8F ^ 0xAE)) > (115 + 97 - 189 + 113 ^ 40 + 118 - 145 + 127)) {
                    return false;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        }) ? 1 : 0) && SquireGOTRPlugin.llllllIllIIIll(var17.ax ? 1 : 0)) {
            n2 = llIIllIllIlI[2];

            if (-((0xFF ^ 0xB4) & ~(0x47 ^ 0xC) ^ (0x8F ^ 0x8B)) >= 0) {
                return;
            }
        } else {
            n2 = llIIllIllIlI[1];
        }
        var17.ai = n2;
        var17.ao = Arrays.stream(var19).filter(item -> {
            boolean bl;
            if (SquireGOTRPlugin.llllllIllIlIlI(item.getId(), llIIllIllIlI[25])) {
                bl = llIIllIllIlI[2];

                if (3 == (0x70 ^ 0x74)) {
                    return false;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        }).mapToInt(Item::getQuantity).sum();
        IntStream intStream = Arrays.stream(var19).mapToInt(Item::getId);
        Set<Integer> set = m;
        Objects.requireNonNull(set);

        List var20 = intStream.filter(set::contains).boxed().collect(Collectors.toList());
        if (SquireGOTRPlugin.llllllIllIIlll(var20.size(), var17.T.size())) {
            var17.T.clear();
            var17.T.addAll(var20);

        }
    }

    /*
     * WARNING - void declaration
     */
    int a(Widget widget, int n2) {
        if (SquireGOTRPlugin.llllllIllIlIIl(widget)) {
            void var21;
            int n3 = widget.getSpriteId();
            if (SquireGOTRPlugin.llllllIllIIlll(n3, n2)) {
                Optional<d> var22;
                if (SquireGOTRPlugin.llllllIllIlIII(n2)) {
                    var22 = Stream.of(g.r.r.-.t.q.i.u.o.e.s.d.values()).filter(d2 -> {
                        boolean bl;
                        if (SquireGOTRPlugin.llllllIllIlIlI(d2.Y(), n2)) {
                            bl = llIIllIllIlI[2];

                            if ((1 ^ 5) <= ((0x7B ^ 0x23) & ~(0x7F ^ 0x27))) {
                                return false;
                            }
                        } else {
                            bl = llIIllIllIlI[1];
                        }
                        return bl;
                    }).findFirst();
                }
                var22 = Stream.of(g.r.r.-.t.q.i.u.o.e.s.d.values()).filter(arg_0 -> SquireGOTRPlugin.a((int)var21, arg_0)).findFirst();
            }
            return (int)var21;
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
        void var23;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if (SquireGOTRPlugin.llllllIllIIIll(l.contains(gameObjectSpawned.getGameObject().getId()) ? 1 : 0)) {
            this.R.removeIf(gameObject2 -> {
                boolean bl;
                if (SquireGOTRPlugin.llllllIllIlIlI(gameObject2.getId(), gameObject.getId())) {
                    bl = llIIllIllIlI[2];

                    }
                } else {
                    bl = llIIllIllIlI[1];
                }
                return bl;
            });

            this.S.removeIf(gameObject2 -> {
                boolean bl;
                if (SquireGOTRPlugin.llllllIllIlIlI(gameObject2.getId(), gameObject.getId())) {
                    bl = llIIllIllIlI[2];

                    }
                } else {
                    bl = llIIllIllIlI[1];
                }
                return bl;
            });

            this.R.add(gameObject);

        }
        if (SquireGOTRPlugin.llllllIllIlIlI(var23.getId(), llIIllIllIlI[38])) {
            var24.ae = var23;
        }
        if (SquireGOTRPlugin.llllllIllIlIlI(var23.getId(), llIIllIllIlI[39])) {
            var24.ad = var23;
        }
        if (SquireGOTRPlugin.llllllIllIlIlI(var23.getId(), llIIllIllIlI[40])) {
            var24.ag = var23;
        }
        if (SquireGOTRPlugin.llllllIllIlIlI(var23.getId(), llIIllIllIlI[41])) {
            var24.af = var23;
        }
        if (SquireGOTRPlugin.llllllIllIlIlI(var23.getId(), llIIllIllIlI[42])) {
            var24.ah = var23;
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
        void var25;
        if (SquireGOTRPlugin.llllllIllIIllI(gameStateChanged.getGameState(), GameState.LOGIN_SCREEN)) {
            this.aC = g.r.r.-.t.q.i.u.o.e.s.c.OUTSIDE;
            this.k();
        }
        if (SquireGOTRPlugin.llllllIllIIllI(var25.getGameState(), GameState.LOADING)) {
            SquireGOTRPlugin var26;
            var26.k();
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
        classArray[SquireGOTRPlugin.llIIllIllIlI[1]] = EnteringMinigameTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[2]] = RepairingPouchesTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[3]] = FillingRunePouchesTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[4]] = EmptyingPouchesTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[5]] = GrabbingUnchargedCellsTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[6]] = GrabbingAWeakCellTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[7]] = MiningInitalFragmentsTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[8]] = UsingDragonPickaxeSpecialTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[9]] = EnteringEssencePortalTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[10]] = LeavingRemainsPortalTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[11]] = MiningHugeRemainsTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[12]] = DroppingTalismanTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[13]] = CreatingEssenceTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[14]] = DepositingGuardianStoneTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[15]] = DepositingRunesTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[16]] = MiningExtraFragmentsTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[17]] = PlacingACellTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[18]] = CraftingAGuardianTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[19]] = EnteringAltarTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[20]] = CraftingRunesTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[21]] = LeavingTheAltarTask.class;
        classArray[SquireGOTRPlugin.llIIllIllIlI[22]] = ForceLeavingAltarTask.class;
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

        return String.valueOf(var27);
    }

    public MouseEvent mouseEntered(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    private static  boolean a(int n2, d d2) {
        boolean bl;
        if (SquireGOTRPlugin.llllllIllIlIlI(d2.Y(), n2)) {
            bl = llIIllIllIlI[2];

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
        SquireGOTRPlugin var28;
        Instant instant = Instant.now();
        if (SquireGOTRPlugin.llllllIllIIIll(this.as.isBefore(instant) ? 1 : 0)) {
            return 0L;
        }
        if (SquireGOTRPlugin.llllllIllIIllI(var28.as, Instant.MAX)) {
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
        Iterator var29 = Inventory.getAll(item -> item.getName().endsWith(llIIllIllIIl[llIIllIllIlI[15]])).iterator();
        while (SquireGOTRPlugin.llllllIllIIIll(var29.hasNext() ? 1 : 0)) {
            Item var30 = (Item)var29.next();
            e var31 = g.r.r.-.t.q.i.u.o.e.s.e.c(var30.getId());
            if (SquireGOTRPlugin.llllllIllIIlIl((Object)var31)) {

                if (-2 <= 0) continue;
                return (6 + 35 - 35 + 170 ^ 19 + 10 - 17 + 159) & (0x86 ^ 0xB9 ^ (0x1D ^ 0x39) ^ -1);
            }
            var32 += var31.ae();

            if ((103 + 49 - 132 + 108 ^ 22 + 25 - -72 + 14) > 0) continue;
            return (15 + 174 - 31 + 92 ^ 7 + 1 - -174 + 4) & (0x61 ^ 0x34 ^ (0xE ^ 0x1B) ^ -1);
        }
        return n2;
    }

    @Subscribe(priority=20.0f)
    public void onGameTick(GameTick gameTick) {
        String[] var33;
        String var34;
        Animation var35;
        GameObject var36;
        SquireGOTRPlugin var37;
        if (SquireGOTRPlugin.llllllIllIIIlI((Object)this.m(), (Object)g.r.r.-.t.q.i.u.o.e.s.c.ACTIVE)) {
            this.az = Rand.nextInt((int)llIIllIllIlI[27], (int)llIIllIllIlI[28]);
        }
        if (SquireGOTRPlugin.llllllIllIlIII(var37.ay)) {
            var37.ay -= llIIllIllIlI[2];
        }
        var37.S.removeIf(gameObject -> {
            boolean bl;
            Animation animation = ((DynamicObject)gameObject.getRenderable()).getAnimation();
            if (!SquireGOTRPlugin.llllllIllIlIIl(animation) || SquireGOTRPlugin.llllllIllIIlll(animation.getId(), llIIllIllIlI[29])) {
                bl = llIIllIllIlI[2];

                if (((94 + 135 - 116 + 38 ^ 83 + 50 - 76 + 73) & (132 + 110 - 118 + 35 ^ 91 + 41 - 118 + 124 ^ -1)) != 0) {
                    return ((77 + 43 - 25 + 72 ^ 122 + 3 - 39 + 59) & (0xE ^ 7 ^ (0xA1 ^ 0x9E) ^ -1)) != 0;
                }
            } else {
                bl = llIIllIllIlI[1];
            }
            return bl;
        });

        Widget var38 = var37.R.iterator();
        while (SquireGOTRPlugin.llllllIllIIIll(var38.hasNext() ? 1 : 0)) {
            var36 = var38.next();
            var35 = ((DynamicObject)var36.getRenderable()).getAnimation();
            if (SquireGOTRPlugin.llllllIllIlIIl(var35) && SquireGOTRPlugin.llllllIllIlIlI(var35.getId(), llIIllIllIlI[29])) {
                var37.S.add(var36);

            }

            if (2 == 2) continue;
            return;
        }
        var38 = var37.ab.getWidget(llIIllIllIlI[30]);
        var36 = var37.ab.getWidget(llIIllIllIlI[31]);
        var35 = var37.ab.getWidget(llIIllIllIlI[32]);
        Widget var39 = var37.ab.getWidget(llIIllIllIlI[33]);
        Widget var40 = var37.ab.getWidget(llIIllIllIlI[34]);
        Widget var41 = var37.ab.getWidget(llIIllIllIlI[35]);
        var37.av = var37.a(var38, var37.av);
        var37.aw = var37.a((Widget)var36, var37.aw);
        if (SquireGOTRPlugin.llllllIllIlIIl(var35)) {
            int n2;
            var34 = var35.getText();
            if (SquireGOTRPlugin.llllllIllIlIIl(var34) && SquireGOTRPlugin.llllllIllIIIIl(var34.contains(llIIllIllIIl[llIIllIllIlI[1]]) ? 1 : 0)) {
                n2 = llIIllIllIlI[2];

                if (-(8 ^ 0xC) >= 0) {
                    return;
                }
            } else {
                var37.ax = llIIllIllIlI[1];
                n2 = var37.ax ? 1 : 0;
            }
        }
        if (SquireGOTRPlugin.llllllIllIlIIl(var39) && SquireGOTRPlugin.llllllIllIIIIl(var39.isHidden() ? 1 : 0)) {
            var34 = var39.getText();
            var37.aB = Integer.parseInt(var34.substring(var34.indexOf(llIIllIllIlI[36]) + llIIllIllIlI[2]).replace(llIIllIllIIl[llIIllIllIlI[2]], llIIllIllIIl[llIIllIllIlI[3]]).trim());

            if ((0x33 ^ 0x37) == 1) {
                return;
            }
        } else {
            var37.aB = llIIllIllIlI[1];
        }
        if (SquireGOTRPlugin.llllllIllIlIIl(var41) && SquireGOTRPlugin.llllllIllIIIIl(var41.isHidden() ? 1 : 0) && SquireGOTRPlugin.llllllIllIlIIl(var34 = var41.getText()) && SquireGOTRPlugin.llllllIllIIIll(var34.contains(llIIllIllIIl[llIIllIllIlI[4]]) ? 1 : 0)) {
            var33 = var34.split(llIIllIllIIl[llIIllIllIlI[5]]);
            int var42 = Integer.parseInt(var33[llIIllIllIlI[1]]);
            int var43 = Integer.parseInt(var33[llIIllIllIlI[2]]);
            var37.as = Instant.now().plus((long)var42, ChronoUnit.MINUTES).plus((long)var43, ChronoUnit.SECONDS);
        }
        if (SquireGOTRPlugin.llllllIllIlIIl(var40) && SquireGOTRPlugin.llllllIllIIIIl(var40.isHidden() ? 1 : 0)) {
            Instant instant;
            if (SquireGOTRPlugin.llllllIllIIlIl(var37.ap) && SquireGOTRPlugin.llllllIllIlIIl(var37.aq)) {
                var37.aq = null;
                if (SquireGOTRPlugin.llllllIllIIIll(var37.aj ? 1 : 0)) {
                    var37.aj = llIIllIllIlI[1];
                }
            }
            var37.au = var40.getText();
            if (SquireGOTRPlugin.llllllIllIlIIl(var37.ap)) {
                instant = var37.ap;

                if ((0x58 ^ 0x5C) <= 1) {
                    return;
                }
            } else {
                instant = Instant.now();
            }
            var37.ap = instant;

        } else if (SquireGOTRPlugin.llllllIllIlIIl(var38) && SquireGOTRPlugin.llllllIllIIIIl(var38.isHidden() ? 1 : 0)) {
            if (SquireGOTRPlugin.llllllIllIlIIl(var37.ap)) {
                var37.aq = Instant.now();
            }
            var37.au = null;
            var37.ap = null;
        }
        if (SquireGOTRPlugin.llllllIllIlIIl(var34 = var37.ab.getWidget(llIIllIllIlI[37], llIIllIllIlI[2]))) {
            var33 = var34.getText();
            if (SquireGOTRPlugin.llllllIllIIIll(var33.equals(llIIllIllIIl[llIIllIllIlI[6]]) ? 1 : 0)) {
                var37.ay = llIIllIllIlI[1];

                }
            } else {
                Matcher var42 = K.matcher((CharSequence)var33);
                if (SquireGOTRPlugin.llllllIllIIIll(var42.find(llIIllIllIlI[1]) ? 1 : 0)) {
                    int n3;
                    var37.al = Integer.parseInt(var42.group(llIIllIllIlI[2]));
                    var37.ak = Integer.parseInt(var42.group(llIIllIllIlI[3]));
                    if (SquireGOTRPlugin.llllllIllIIlII(var37.ak, var37.al)) {
                        n3 = llIIllIllIlI[2];

                        if (((0x3C ^ 0x33) & ~(0x3C ^ 0x33)) < 0) {
                            return;
                        }
                    } else {
                        n3 = llIIllIllIlI[1];
                    }
                    var37.aF = n3;
                }
            }
        }
    }

    public boolean l() {
        int n2;
        Widget widget = this.ab.getWidget(llIIllIllIlI[46]);
        if (SquireGOTRPlugin.llllllIllIlIIl(widget) && SquireGOTRPlugin.llllllIllIIIIl(widget.isHidden() ? 1 : 0)) {
            n2 = llIIllIllIlI[2];

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
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[1]] = "10/10";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[2]] = "%";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[3]] = SquireGOTRPlugin.llllllIlIllIll("A7SRfrbhA+8=", "nWSwt");
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[4]] = ":";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[5]] = ":";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[6]] = "It looks like the adventurers within are just finishing up. You must<br>wait until they are done to join.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[7]] = "The rift becomes active!";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[8]] = "The rift will become active in 30 seconds.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[9]] = "The rift will become active in 10 seconds.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[10]] = "The rift will become active in 5 seconds.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[11]] = "The Portal Guardians will keep their rifts open for another 30 seconds.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[12]] = "You found some loot:";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[13]] = "The Great Guardian is fully charged";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[14]] = "pouch";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[15]] = "pouch";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[16]] = "Total elemental energy:[^>]+>(\\d+).*Total catalytic energy:[^>]+>(\\d+).";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[17]] = "Your pouch has decayed through use.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[18]] = "You have (\\d+) catalytic points? and (\\d+) elemental points?";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[19]] = "It looks like the adventurers within are just finishing up. You must<br>wait until they are done to join.";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[20]] = "Total elemental energy:[^>]+>(\\d+).*Total catalytic energy:[^>]+>(\\d+).";
        SquireGOTRPlugin.llIIllIllIIl[SquireGOTRPlugin.llIIllIllIlI[21]] = "You have (\\d+) catalytic points? and (\\d+) elemental points?";
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
        Iterator var44 = Inventory.getAll(item -> item.getName().endsWith(llIIllIllIIl[llIIllIllIlI[14]])).iterator();
        while (SquireGOTRPlugin.llllllIllIIIll(var44.hasNext() ? 1 : 0)) {
            Item var45 = (Item)var44.next();
            e var46 = g.r.r.-.t.q.i.u.o.e.s.e.c(var45.getId());
            if (SquireGOTRPlugin.llllllIllIIlIl((Object)var46)) {

                if ((53 + 112 - 39 + 67 ^ 46 + 179 - 192 + 163) != 0) continue;
                return (0x2D ^ 0x78 ^ (0x54 ^ 0x2C)) & (0x2D ^ 0x6F ^ (0x6C ^ 3) ^ -1);
            }
            var47 += var46.ac();

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
        Player var48 = Players.getLocal();
        if (SquireGOTRPlugin.llllllIllIIIll(f.contains((Locatable)var48) ? 1 : 0)) {
            return llIIllIllIlI[2];
        }
        if (SquireGOTRPlugin.llllllIllIIIll(e.contains((Locatable)var48) ? 1 : 0)) {
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
        void var49;
        int n2 = this.a();
        if (SquireGOTRPlugin.llllllIllIIIII(n2, this.b())) {
            this.aE = llIIllIllIlI[1];

            }
        } else if (SquireGOTRPlugin.llllllIllIIIIl((int)var49)) {
            var50.aE = llIIllIllIlI[2];
        }
        return this.aE;
    }

    public Item e() {
        return Inventory.getFirst(item -> {
            int n2;
            if (SquireGOTRPlugin.llllllIllIllII(item.getId(), llIIllIllIlI[51]) && SquireGOTRPlugin.llllllIllIllIl(item.getId(), llIIllIllIlI[48])) {
                n2 = llIIllIllIlI[2];

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

