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
import gg.squire.runecrafting.RunecraftingManager;
import gg.squire.runecrafting.GameEnum2;
import gg.squire.runecrafting.GameEnum4;
import gg.squire.runecrafting.GameEnum3;
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
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
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

        catch (Exception var8) {
            var8.printStackTrace();
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
        if ((nPC.getId() == var2[43])) {
            this.ac = nPC;
        }
    }

    public boolean g() {
        return Arrays.stream(this.ab.getMapRegions()).anyMatch(n2 -> {
            boolean bl;
            if (n2 == var2[50]) {
                bl = 2;
                0;
                if (-1 > -1) {
                    return ((143 + 225 - 165 + 39 ^ 108 + 50 - -32 + 0) & (0x52 ^ 0x7C ^ (0xC ^ 0x6E) ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        });
    }

    public MouseEvent mouseClicked(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    public d h() {
        Object object;
        Object var9;
        SquireGOTRPlugin var10;
        if (((Object)this.m() != (Object)this.m()2)g.r.r.-.t.q.i.u.o.e.s.c.ACTIVE)) {
            return null;
        }
        Optional<d> var11 = Arrays.stream(g.r.r.-.t.q.i.u.o.e.s.d.values()).filter(d2 -> {
            boolean bl;
            if ((d2.Y() == this.av)) {
                bl = 2;
                0;
                if (((119 + 41 - 47 + 92 ^ 65 + 123 - 95 + 36) & (33 + 190 - 164 + 162 ^ 127 + 38 - 26 + 6 ^ -1)) >= 1) {
                    return ((9 ^ 0x1B ^ (0x88 ^ 0xAC)) & (0x3B ^ 0x27 ^ (0xB8 ^ 0x92) ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }).findFirst();
        Optional<d> var12 = Arrays.stream(g.r.r.-.t.q.i.u.o.e.s.d.values()).filter(d2 -> {
            boolean bl;
            if ((d2.Y() == this.aw)) {
                bl = 2;
                0;
                if (1 < -1) {
                    return ((0x84 ^ 0x9C) & ~(0x99 ^ 0x81)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }).findFirst();
        Object var13 = null;
        if (!(var11.isEmpty( == 0) ? 1 : 0) || (var12.isEmpty( != 0) ? 1 : 0)) {
            return null;
        }
        if ((var10.Y.useTalisman( != 0) ? 1 : 0)) {
            var9 = g.r.r.-.t.q.i.u.o.e.s.d.values();
            int var14 = ((d[])var9).length;
            int var15 = 1;
            while (var15 < var14) {
                d var16 = var9[var15];
                int[] nArray = new int[2];
                nArray[1] = var16.X();
                if ((Inventory.contains((int[] != 0)nArray) ? 1 : 0)) {
                    return var16;
                }
                ++var15;
                0;
                if ((0xFC ^ 0x9D ^ (0x6D ^ 8)) > -1) continue;
                return null;
            }
        }
        var9 = var11.get();
        d var14 = var12.get();
        if ((var10.Y.runeTypes( == 0).contains(var9) ? 1 : 0) && (var10.Y.runeTypes( == 0).contains((Object)var14) ? 1 : 0)) {
            return null;
        }
        if ((var10.Y.runeTypes( != 0).contains(var9) ? 1 : 0) && (var10.Y.runeTypes( == 0).contains((Object)var14) ? 1 : 0)) {
            var13 = var9;
            0;
            if null != null {
                return null;
            }
        } else if ((var10.Y.runeTypes( == 0).contains(var9) ? 1 : 0)) {
            var13 = var14;
            0;
            if (-(0x52 ^ 0x57) >= 0) {
                return null;
            }
        } else {
            if ((var10.Y.focusStrong( != 0) ? 1 : 0)) {
                if ((((d)((Object)var9)).aa().ordinal() > var14.aa().ordinal())) {
                    var13 = var9;
                    0;
                    if null != null {
                        return null;
                    }
                } else {
                    var13 = var14;
                }
            }
            if ((var10.Y.balancePoints( != 0) ? 1 : 0) && var13 == null) {
                Object object2;
                if (var10.aF != 0) {
                    object2 = var9;
                    0;
                    if (((87 + 12 - -25 + 38 ^ 109 + 160 - 217 + 143) & (0x3C ^ 0x79 ^ (0xD ^ 0x29) ^ -1)) >= 2) {
                        return null;
                    }
                } else {
                    object2 = var13 = var14;
                }
            }
            if var13 == null {
                Object object3;
                if ((var10.I() < var10.H())) {
                    object3 = var14;
                    0;
                    if ((0x60 ^ 0x64) == 0) {
                        return null;
                    }
                } else {
                    object3 = var9;
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
            if (n2 == var2[50]) {
                bl = 2;
                0;
                if (2 < 0) {
                    return ((0xBC ^ 0x9B) & ~(0x18 ^ 0x3F)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        });
    }

    public c m() {
        SquireGOTRPlugin var17;
        if (!(Game.getState() == Game.getState()2) || (this.l( != 0) ? 1 : 0)) {
            return var17.aC;
        }
        if ((var17.f( == 0) ? 1 : 0)) {
            var17.aC = g.r.r.-.t.q.i.u.o.e.s.c.OUTSIDE;
            0;
            if (3 < 0) {
                return null;
            }
        } else if (!(var17.as != var17.as2) || (var17.ar != null)) {
            var17.aC = g.r.r.-.t.q.i.u.o.e.s.c.ACTIVATING;
            0;
            if ((0xA7 ^ 0xA3) < 3) {
                return null;
            }
        } else if ((SquireGOTRPlugin.var18(var17.j( > 0), 20L))) {
            var17.aC = g.r.r.-.t.q.i.u.o.e.s.c.COUNTDOWN;
            0;
            if null != null {
                return null;
            }
        } else if (var17.aA != 0) {
            var17.aC = g.r.r.-.t.q.i.u.o.e.s.c.FINISHING;
            0;
            if (-1 > 0) {
                return null;
            }
        } else {
            var17.aC = g.r.r.-.t.q.i.u.o.e.s.c.ACTIVE;
        }
        return this.aC;
    }

    public int d() {
        int[] nArray = new int[2];
        nArray[1] = var2[25];
        return Inventory.getCount((boolean)2, (int[])nArray);
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

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        SquireGOTRPlugin var19;
        Object var20;
        void var21;
        if ((chatMessage.getType() != chatMessage.getType()2) && (chatMessage.getType() != chatMessage.getType()2)) {
            return;
        }
        String var22 = var21.getMessage();
        if ((var22.contains(var1[7] != 0) ? 1 : 0)) {
            var20 = g.r.r.-.t.q.i.u.o.e.s.e.values();
            int var23 = ((e[])var20).length;
            int var24 = 1;
            while (var24 < var23) {
                e var25 = var20[var24];
                var25.e(1);
                ++var24;
                0;
                if ((0x88 ^ 0x8C) == (0x65 ^ 0x61)) continue;
                return;
            }
            var19.aq = Instant.now();
            var19.ar = null;
            var19.aj = 2;
            0;
            if (1 < 1) {
                return;
            }
        } else if ((var22.contains(var1[8] != 0) ? 1 : 0)) {
            var19.ar = Instant.now().plusSeconds(30L);
            0;
            if (((0xBB ^ 0xB3 ^ (0x94 ^ 0xA4)) & (0 + 49 - 43 + 145 ^ 79 + 59 - 133 + 170 ^ -1)) == -1) {
                return;
            }
        } else if ((var22.contains(var1[9] != 0) ? 1 : 0)) {
            var19.ar = Instant.now().plusSeconds(10L);
            0;
            if (2 > 3) {
                return;
            }
        } else if ((var22.contains(var1[var2[10]] != 0) ? 1 : 0)) {
            var19.ar = Instant.now().plusSeconds(5L);
            0;
            if (2 <= -1) {
                return;
            }
        } else if ((var22.contains(var1[var2[11]] != 0) ? 1 : 0)) {
            var19.ar = Instant.now().plusSeconds(60L);
            0;
            if ((0x5A ^ 0x5E) == 0) {
                return;
            }
        } else if ((var22.contains(var1[var2[12]] != 0) ? 1 : 0)) {
            var19.ak -= 2;
            var19.al -= 2;
            0;
            if (((6 ^ 0xD ^ (0x40 ^ 0x4F)) & (31 + 47 - -24 + 42 ^ 131 + 9 - 102 + 110 ^ -1)) < 0) {
                return;
            }
        } else if ((var22.contains(var1[var2[13]] != 0) ? 1 : 0)) {
            var19.aA = 2;
        }
        if (var19.ar != null) {
            var19.aA = 1;
        }
        if (((Matcher(var20 = I.matcher(var22))).find() ? 1 : 0)) {
            int n2;
            var19.ak = Integer.parseInt(((Matcher)var20).group(2));
            var19.al = Integer.parseInt(((Matcher)var20).group(3));
            if (var19.ak < var19.al) {
                n2 = 2;
                0;
                if (2 > (0x2A ^ 0x2E)) {
                    return;
                }
            } else {
                n2 = 1;
            }
            var19.aF = n2;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ItemContainerChanged itemContainerChanged) {
        int n2;
        SquireGOTRPlugin var26;
        void var27;
        if (!(itemContainerChanged.getItemContainer() == itemContainerChanged.getItemContainer()2)) || (this.g( == 0) ? 1 : 0)) {
            return;
        }
        Item[] var28 = var27.getItemContainer().getItems();
        if ((Arrays.streamlllllllllllllllIlIIllIIllIIllIII.anyMatch(item -> {
            boolean bl;
            if ((item.getId() == var2[49])) {
                bl = 2;
                0;
                if ((7 ^ 2 ^ 1) < 0) {
                    return ((53 + 146 - 59 + 22 ^ 78 + 44 - 36 + 60) & (0x31 ^ 0x7C ^ (0x49 ^ 0x34) ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }) ? 1 : 0) && (Arrays.streamlllllllllllllllIlIIllIIllIIllIII.anyMatch(item -> {
            boolean bl;
            if ((item.getId() == var2[48])) {
                bl = 2;
                0;
                if ((0x48 ^ 0x6D ^ (0x8F ^ 0xAE)) > (115 + 97 - 189 + 113 ^ 40 + 118 - 145 + 127)) {
                    return ((0xE2 ^ 0xA3 ^ 1) & (6 + 32 - -193 + 4 ^ 14 + 75 - 33 + 115 ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }) ? 1 : 0) && (var26.ax != 0)) {
            n2 = 2;
            0;
            if (-((0xFF ^ 0xB4) & ~(0x47 ^ 0xC) ^ (0x8F ^ 0x8B)) >= 0) {
                return;
            }
        } else {
            n2 = 1;
        }
        var26.ai = n2;
        var26.ao = Arrays.stream(var28).filter(item -> {
            boolean bl;
            if ((item.getId() == var2[25])) {
                bl = 2;
                0;
                if (3 == (0x70 ^ 0x74)) {
                    return ((0x8D ^ 0xB6) & ~(0x89 ^ 0xB2)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        }).mapToInt(Item::getQuantity).sum();
        IntStream intStream = Arrays.stream(var28).mapToInt(Item::getId);
        Set<Integer> set = m;
        Objects.requireNonNull(set);
        0;
        List var29 = intStream.filter(set::contains).boxed().collect(Collectors.toList());
        if ((var29.size() != var26.T.size())) {
            var26.T.clear();
            var26.T.addAll(var29);
            0;
        }
    }

    /*
     * WARNING - void declaration
     */
    int a(Widget widget, int n2) {
        if widget != null {
            void var30;
            int n3 = widget.getSpriteId();
            if (n2 != n2) {
                Optional<d> var31;
                if (n2 > 0) {
                    var31 = Stream.of(g.r.r.-.t.q.i.u.o.e.s.d.values()).filter(d2 -> {
                        boolean bl;
                        if ((d2.Y() == n2)) {
                            bl = 2;
                            0;
                            if ((1 ^ 5) <= ((0x7B ^ 0x23) & ~(0x7F ^ 0x27))) {
                                return ((8 ^ 0x3C) & ~(0x4B ^ 0x7F)) != 0;
                            }
                        } else {
                            bl = 1;
                        }
                        return bl;
                    }).findFirst();
                }
                var31 = Stream.of(g.r.r.-.t.q.i.u.o.e.s.d.values()).filter(arg_0 -> SquireGOTRPlugin.a((int)var30, arg_0)).findFirst();
            }
            return (int)var30;
        }
        return n2;
    }

    public Instant J() {
        return this.ap;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        void var32;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        if ((l.contains(gameObjectSpawned.getGameObject( != 0).getId()) ? 1 : 0)) {
            this.R.removeIf(gameObject2 -> {
                boolean bl;
                if ((gameObject2.getId() == gameObject.getId())) {
                    bl = 2;
                    0;
                    if null != null {
                        return ((162 + 156 - 117 + 37 ^ 71 + 132 - 160 + 134) & (0xC6 ^ 0x86 ^ (0x10 ^ 0xF) ^ -1)) != 0;
                    }
                } else {
                    bl = 1;
                }
                return bl;
            });
            0;
            this.S.removeIf(gameObject2 -> {
                boolean bl;
                if ((gameObject2.getId() == gameObject.getId())) {
                    bl = 2;
                    0;
                    if null != null {
                        return ((0x6A ^ 0x63) & ~(0x30 ^ 0x39)) != 0;
                    }
                } else {
                    bl = 1;
                }
                return bl;
            });
            0;
            this.R.add(gameObject);
            0;
        }
        if ((var32.getId() == var2[38])) {
            var33.ae = var32;
        }
        if ((var32.getId() == var2[39])) {
            var33.ad = var32;
        }
        if ((var32.getId() == var2[40])) {
            var33.ag = var32;
        }
        if ((var32.getId() == var2[41])) {
            var33.af = var32;
        }
        if ((var32.getId() == var2[42])) {
            var33.ah = var32;
        }
    }

    public SquireGOTRConfig w() {
        return this.Y;
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
        void var34;
        if ((gameStateChanged.getGameState() == gameStateChanged.getGameState()2)) {
            this.aC = g.r.r.-.t.q.i.u.o.e.s.c.OUTSIDE;
            this.k();
        }
        if ((var34.getGameState() == var34.getGameState()2)) {
            SquireGOTRPlugin var35;
            var35.k();
        }
    }

    public int H() {
        return this.am;
    }

    public SquireGOTRPlugin() {
        Class[] classArray = new Class[0];
        classArray[1] = EnteringMinigameTask.class;
        classArray[2] = RepairingPouchesTask.class;
        classArray[3] = FillingRunePouchesTask.class;
        classArray[4] = EmptyingPouchesTask.class;
        classArray[5] = GrabbingUnchargedCellsTask.class;
        classArray[6] = GrabbingAWeakCellTask.class;
        classArray[7] = MiningInitalFragmentsTask.class;
        classArray[8] = UsingDragonPickaxeSpecialTask.class;
        classArray[9] = EnteringEssencePortalTask.class;
        classArray[SquireGOTRPlugin.var2[10]] = LeavingRemainsPortalTask.class;
        classArray[SquireGOTRPlugin.var2[11]] = MiningHugeRemainsTask.class;
        classArray[SquireGOTRPlugin.var2[12]] = DroppingTalismanTask.class;
        classArray[SquireGOTRPlugin.var2[13]] = CreatingEssenceTask.class;
        classArray[SquireGOTRPlugin.var2[14]] = DepositingGuardianStoneTask.class;
        classArray[SquireGOTRPlugin.var2[15]] = DepositingRunesTask.class;
        classArray[SquireGOTRPlugin.var2[16]] = MiningExtraFragmentsTask.class;
        classArray[SquireGOTRPlugin.var2[17]] = PlacingACellTask.class;
        classArray[SquireGOTRPlugin.var2[18]] = CraftingAGuardianTask.class;
        classArray[SquireGOTRPlugin.var2[19]] = EnteringAltarTask.class;
        classArray[SquireGOTRPlugin.var2[20]] = CraftingRunesTask.class;
        classArray[SquireGOTRPlugin.var2[21]] = LeavingTheAltarTask.class;
        classArray[SquireGOTRPlugin.var2[22]] = ForceLeavingAltarTask.class;
        this.Q = classArray;
        this.R = new HashSet<GameObject>();
        this.S = new HashSet<GameObject>();
        this.T = new HashSet<Integer>();
        this.U = new HashSet<e>();
        this.ai = 1;
        this.aj = 1;
        this.ao = 0L;
        this.ax = 1;
        this.ay = 1;
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
        int[] nArray = new int[2];
        nArray[1] = var2[23];
        return Inventory.getCount((boolean)2, (int[])nArray);
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

    private static String var36(String var37, String var38) {
        var37 = new String(Base64.getDecoder().decode(var37.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var39 = new StringBuilder();
        char[] var40 = var38.toCharArray();
        int var41 = 1;
        char[] var42 = var37.toCharArray();
        int var43 = var42.length;
        int var44 = 1;
        while (var44 < var43) {
            char var45 = var42[var44];
            var39.append((char)(var45 ^ var40[var41 % var40.length]));
            0;
            ++var41;
            ++var44;
            0;
            if (2 != ((170 + 7 - 0 + 71 ^ 9 + 82 - -61 + 2) & (109 + 40 - -1 + 45 ^ 148 + 109 - 168 + 72 ^ -1) & ((50 + 136 - 52 + 56 ^ 96 + 140 - 118 + 37) & (0x27 ^ 0x2C ^ (0x9E ^ 0xB0) ^ -1) ^ -1))) continue;
            return null;
        }
        return String.valueOf(var39);
    }

    public MouseEvent mouseEntered(MouseEvent mouseEvent) {
        return mouseEvent;
    }

    private static  boolean a(int n2, d d2) {
        boolean bl;
        if ((d2.Y() == n2)) {
            bl = 2;
            0;
            if (2 == 1) {
                return ((0x11 ^ 0x3F) & ~(0x7E ^ 0x50)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

    public long j() {
        SquireGOTRPlugin var48;
        Instant instant = Instant.now();
        if ((this.as.isBeforeinstant)) {
            return 0L;
        }
        if (var48.as == var48.as2) {
            return -1L;
        }
        return Duration.between(Instant.now(), this.as).getSeconds();
    }

    public int I() {
        return this.an;
    }

    public int p() {
        int[] nArray = new int[2];
        nArray[1] = var2[47];
        int n2 = Inventory.getCount((int[])nArray);
        Iterator var49 = Inventory.getAll(item -> item.getName().endsWith(var1[var2[15]])).iterator();
        while ((var49.hasNext( != 0) ? 1 : 0)) {
            Item var50 = (Item)var49.next();
            e var51 = g.r.r.-.t.q.i.u.o.e.s.e.c(var50.getId());
            if ((Object == nulllllllllllllllllIlIIllIIlIlIIlIll)) {
                0;
                if (-2 <= 0) continue;
                return (6 + 35 - 35 + 170 ^ 19 + 10 - 17 + 159) & (0x86 ^ 0xB9 ^ (0x1D ^ 0x39) ^ -1);
            }
            var52 += var51.ae();
            0;
            if ((103 + 49 - 132 + 108 ^ 22 + 25 - -72 + 14) > 0) continue;
            return (15 + 174 - 31 + 92 ^ 7 + 1 - -174 + 4) & (0x61 ^ 0x34 ^ (0xE ^ 0x1B) ^ -1);
        }
        return n2;
    }

    @Subscribe(priority=20.0f)
    public void onGameTick(GameTick gameTick) {
        String[] var53;
        String var54;
        Animation var55;
        GameObject var56;
        SquireGOTRPlugin var57;
        if (((Object)this.m() != (Object)this.m()2)g.r.r.-.t.q.i.u.o.e.s.c.ACTIVE)) {
            this.az = Rand.nextInt((int)var2[27], (int)var2[28]);
        }
        if (var57.ay > 0) {
            var57.ay -= 2;
        }
        var57.S.removeIf(gameObject -> {
            boolean bl;
            Animation animation = ((DynamicObject)gameObject.getRenderable()).getAnimation();
            if (!animation != null || (animation.getId() != var2[29])) {
                bl = 2;
                0;
                if (((94 + 135 - 116 + 38 ^ 83 + 50 - 76 + 73) & (132 + 110 - 118 + 35 ^ 91 + 41 - 118 + 124 ^ -1)) != 0) {
                    return ((77 + 43 - 25 + 72 ^ 122 + 3 - 39 + 59) & (0xE ^ 7 ^ (0xA1 ^ 0x9E) ^ -1)) != 0;
                }
            } else {
                bl = 1;
            }
            return bl;
        });
        0;
        Widget var58 = var57.R.iterator();
        while ((var58.hasNext( != 0) ? 1 : 0)) {
            var56 = var58.next();
            var55 = ((DynamicObject)var56.getRenderable()).getAnimation();
            if (var55 != null && (var55.getId() == var2[29])) {
                var57.S.add(var56);
                0;
            }
            0;
            if (2 == 2) continue;
            return;
        }
        var58 = var57.ab.getWidget(var2[30]);
        var56 = var57.ab.getWidget(var2[31]);
        var55 = var57.ab.getWidget(var2[32]);
        Widget var59 = var57.ab.getWidget(var2[33]);
        Widget var60 = var57.ab.getWidget(var2[34]);
        Widget var61 = var57.ab.getWidget(var2[35]);
        var57.av = var57.a(var58, var57.av);
        var57.aw = var57.a((Widget)var56, var57.aw);
        if var55 != null {
            int n2;
            var54 = var55.getText();
            if (var54 != null && (var54.contains(var1[1] == 0) ? 1 : 0)) {
                n2 = 2;
                0;
                if (-(8 ^ 0xC) >= 0) {
                    return;
                }
            } else {
                var57.ax = 1;
                n2 = var57.ax;
            }
        }
        if (var59 != null && (var59.isHidden( == 0) ? 1 : 0)) {
            var54 = var59.getText();
            var57.aB = Integer.parseInt(var54.substring(var54.indexOf(var2[36]) + 2).replace(var1[2], var1[3]).trim());
            0;
            if ((0x33 ^ 0x37) == 1) {
                return;
            }
        } else {
            var57.aB = 1;
        }
        if (var61 != null && (var61.isHidden( == 0) ? 1 : 0) && (var54 = var61.getText( != null)) && (var54.contains(var1[4] != 0) ? 1 : 0)) {
            var53 = var54.split(var1[5]);
            int var62 = Integer.parseInt(var53[1]);
            int var63 = Integer.parseInt(var53[2]);
            var57.as = Instant.now().plus((long)var62, ChronoUnit.MINUTES).plus((long)var63, ChronoUnit.SECONDS);
        }
        if (var60 != null && (var60.isHidden( == 0) ? 1 : 0)) {
            Instant instant;
            if ((var57.ap == null) && (var57.aq != null)) {
                var57.aq = null;
                if (var57.aj != 0) {
                    var57.aj = 1;
                }
            }
            var57.au = var60.getText();
            if (var57.ap != null) {
                instant = var57.ap;
                0;
                if ((0x58 ^ 0x5C) <= 1) {
                    return;
                }
            } else {
                instant = Instant.now();
            }
            var57.ap = instant;
            0;
            if (-1 > 0) {
                return;
            }
        } else if (var58 != null && (var58.isHidden( == 0) ? 1 : 0)) {
            if (var57.ap != null) {
                var57.aq = Instant.now();
            }
            var57.au = null;
            var57.ap = null;
        }
        if ((var54 = var57.ab.getWidget(var2[37], 2 != null))) {
            var53 = var54.getText();
            if ((var53.equals(var1[6] != 0) ? 1 : 0)) {
                var57.ay = 1;
                0;
                if null != null {
                    return;
                }
            } else {
                Matcher var62 = K.matcher((CharSequence)var53);
                if ((var62.find1)) {
                    int n3;
                    var57.al = Integer.parseInt(var62.group(2));
                    var57.ak = Integer.parseInt(var62.group(3));
                    if (var57.ak < var57.al) {
                        n3 = 2;
                        0;
                        if (((0x3C ^ 0x33) & ~(0x3C ^ 0x33)) < 0) {
                            return;
                        }
                    } else {
                        n3 = 1;
                    }
                    var57.aF = n3;
                }
            }
        }
    }

    public boolean l() {
        int n2;
        Widget widget = this.ab.getWidget(var2[46]);
        if (widget != null && (widget.isHidden( == 0) ? 1 : 0)) {
            n2 = 2;
            0;
            if (((0xF4 ^ 0xC5) & ~(0x75 ^ 0x44)) != 0) {
                return ((0x4A ^ 0x44) & ~(9 ^ 7)) != 0;
            }
        } else {
            n2 = 1;
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

    private static int var18(long l2, long l3) {
        return l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
    }

    public int b() {
        if (this.aB > var2[24]) {
            return Inventory.getFreeSlots() + 2;
        }
        return this.az;
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if ((this.g( == 0) ? 1 : 0)) {
            return;
        }
        this.am = this.ab.getVarbitValue(var2[44]);
        this.an = this.ab.getVarbitValue(var2[45]);
    }

    public int q() {
        int[] nArray = new int[2];
        nArray[1] = var2[47];
        int n2 = Inventory.getCount((int[])nArray) + Inventory.getFreeSlots();
        Iterator var64 = Inventory.getAll(item -> item.getName().endsWith(var1[var2[14]])).iterator();
        while ((var64.hasNext( != 0) ? 1 : 0)) {
            Item var65 = (Item)var64.next();
            e var66 = g.r.r.-.t.q.i.u.o.e.s.e.c(var65.getId());
            if ((Object == nulllllllllllllllllIlIIllIIlIlIIIIll)) {
                0;
                if ((53 + 112 - 39 + 67 ^ 46 + 179 - 192 + 163) != 0) continue;
                return (0x2D ^ 0x78 ^ (0x54 ^ 0x2C)) & (0x2D ^ 0x6F ^ (0x6C ^ 3) ^ -1);
            }
            var67 += var66.ac();
            0;
            if (1 != 3) continue;
            return (0x31 ^ 0x65 ^ (0x1A ^ 0xB)) & (0x4B ^ 0x5E ^ (0xFB ^ 0xAB) ^ -1);
        }
        return n2;
    }

    @Subscribe(priority=-1.0f)
    public void a(MenuAutomated menuAutomated) {
        if ((this.Y.helperMode( == 0) ? 1 : 0)) {
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
        if ((gameState != gameState2) && (gameState != gameState2)) {
            return 1;
        }
        Player var68 = Players.getLocal();
        if ((f.contains(LocatablelllllllllllllllIlIIllIIllIlllIII) ? 1 : 0)) {
            return 2;
        }
        if ((e.contains(LocatablelllllllllllllllIlIIllIIllIlllIII) ? 1 : 0)) {
            return 1;
        }
        Widget widget = this.ab.getWidget(var2[26]);
        return Widgets.isVisible((Widget)widget);
    }

    public GameObject B() {
        return this.ag;
    }

    public boolean O() {
        return this.ax;
    }

    public void r() {
        this.aG = Static.getClient().getTickCount();
    }

    /*
     * WARNING - void declaration
     */
    public boolean c() {
        void var69;
        int n2 = this.a();
        if ((n2 > this.b())) {
            this.aE = 1;
            0;
            if null != null {
                return ((0x59 ^ 7) & ~(0xCC ^ 0x92)) != 0;
            }
        } else if (((int == 0)var69)) {
            var70.aE = 2;
        }
        return this.aE;
    }

        catch (Exception var76) {
            var76.printStackTrace();
            return null;
        }
    }

    public Item e() {
        return Inventory.getFirst(item -> {
            int n2;
            if ((item.getId() >= var2[51]) && (item.getId() <= var2[48])) {
                n2 = 2;
                0;
                
            } else {
                n2 = 1;
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

