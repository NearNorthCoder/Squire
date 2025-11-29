/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.GraphicsObjectCreated
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 *  net.unethicalite.api.events.LoginStateChanged
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.plugins.Script
 *  net.unethicalite.api.quests.QuestVarbits
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.client.Static
 *  org.pf4j.Extension
 */
package gg.squire.account;

import com.google.inject.Provides;
import gg.squire.account.BuilderConfig;
import gg.squire.account.GodsApi.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.GraphicsObjectCreated;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.events.LoginStateChanged;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.plugins.Script;
import net.unethicalite.api.quests.QuestVarbits;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.client.Static;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.H;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.L;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.V;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aD;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.aN;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.e;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.t;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.u;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.z;
import org.pf4j.Extension;

@PluginDescriptor(name="Squire Sotf Builder", enabledByDefault=false)
@Extension
@SquireUtil
public class AccBuilderSotf
extends Script {
    public static /* synthetic */ long b;
    private static /* synthetic */ int[] llIllIIlII;
    static /* synthetic */ int n;
    private static /* synthetic */ String[] llIllIIIll;
    @Inject
    public /* synthetic */ BuilderConfig p;
    public static /* synthetic */ HashMap<WorldPoint, Integer> i;
    public static /* synthetic */ boolean e;
    public static /* synthetic */ String k;
    @Inject
    private /* synthetic */ OverlayManager u;
    private static /* synthetic */ ac[] o;
    public static /* synthetic */ long g;
    /* synthetic */ boolean s;
    @Inject
    private /* synthetic */ Client t;
    public static /* synthetic */ String l;
    public static /* synthetic */ String c;
    public static /* synthetic */ int f;
    public static /* synthetic */ boolean d;
    public static /* synthetic */ List<ac> a;
    public static /* synthetic */ String h;
    @Inject
    private /* synthetic */ BuilderInfoBox v;
    public static /* synthetic */ String m;
    public static /* synthetic */ String j;
    /* synthetic */ WorldArea q;
    /* synthetic */ String r;

    @Subscribe
    public void a(GameTick gameTick) {
        block28: {
            AccBuilderSotf llllllllllllllllllIIIlIllIIIIlll;
            block29: {
                o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.y();
                int n3 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n4 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderSotf.lIllIllIIIlIl(player2, player) && AccBuilderSotf.lIllIlIlllllI(this.a(n3, n4, (Player)player2) ? 1 : 0)) {
                        n4 = llIllIIlII[5];
                        0;
                        if ((7 ^ 0x4D ^ (5 ^ 0x4B)) < 1) {
                            return ((0xCB ^ 0xBF ^ (0x76 ^ 0x32)) & (0x92 ^ 0x8A ^ (0x41 ^ 0x69) ^ -1)) != 0;
                        }
                    } else {
                        n4 = llIllIIlII[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderSotf.lIllIlIllllII(player3) || AccBuilderSotf.lIllIllIIIIlI(Game.getWildyLevel()) && !AccBuilderSotf.lIllIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(aD.pf), llIllIIlII[18])) break block28;
                int[] nArray = new int[llIllIIlII[5]];
                nArray[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[19];
                if (!AccBuilderSotf.lIllIlIlllIll(Inventory.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray2 = new int[llIllIIlII[5]];
                nArray2[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[20];
                if (!AccBuilderSotf.lIllIlIlllllI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block28;
            }
            if (AccBuilderSotf.lIllIlIlllIll(llllllllllllllllllIIIlIllIIIIlll.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderSotf.lIllIlIllllll(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), llIllIIlII[21])) {
            String[] stringArray = new String[llIllIIlII[5]];
            stringArray[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[22]];
            if (AccBuilderSotf.lIllIlIllllII(NPCs.getNearest((String[])stringArray))) {
                int[] nArray = new int[llIllIIlII[5]];
                nArray[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[23];
                if (AccBuilderSotf.lIllIlIllllII(NPCs.getNearest((int[])nArray))) {
                    int[] nArray3 = new int[llIllIIlII[5]];
                    nArray3[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[23];
                    if (AccBuilderSotf.lIllIlIlllIll(NPCs.getNearest((int[])nArray3).isDead() ? 1 : 0)) {
                        c = llIllIIIll[llIllIIlII[24]];
                        int[] nArray4 = new int[llIllIIlII[5]];
                        nArray4[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[25];
                        if (AccBuilderSotf.lIllIlIlllIll(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[llIllIIlII[5]];
                            nArray5[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[25];
                            Inventory.getFirst((int[])nArray5).interact(llIllIIIll[llIllIIlII[26]]);
                        }
                        int[] nArray6 = new int[llIllIIlII[5]];
                        nArray6[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[25];
                        if (AccBuilderSotf.lIllIlIlllllI(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[llIllIIlII[5]];
                            nArray7[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[23];
                            NPCs.getNearest((int[])nArray7).interact(llIllIIIll[llIllIIlII[27]]);
                            Movement.walkTo((WorldPoint)new WorldPoint(L.gn.getX() - llIllIIlII[11], L.gn.getY() + llIllIIlII[11], llIllIIlII[4]));
                            0;
                        }
                    }
                }
                if (AccBuilderSotf.lIllIlIlllllI(i.containsKey(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint llllllllllllllllllIIIlIlIlllllll;
                    WorldPoint llllllllllllllllllIIIlIllIIIIIII;
                    WorldPoint llllllllllllllllllIIIlIllIIIIIIl;
                    WorldPoint llllllllllllllllllIIIlIllIIIIIlI;
                    if (AccBuilderSotf.lIllIlIlllllI(L.gm ? 1 : 0)) {
                        String[] stringArray2 = new String[llIllIIlII[5]];
                        stringArray2[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[28]];
                        llllllllllllllllllIIIlIllIIIIIlI = NPCs.getNearest((String[])stringArray2).getWorldLocation();
                        llllllllllllllllllIIIlIllIIIIIIl = new WorldPoint(llllllllllllllllllIIIlIllIIIIIlI.getX(), llllllllllllllllllIIIlIllIIIIIlI.getY() + llIllIIlII[5], llllllllllllllllllIIIlIllIIIIIlI.getPlane());
                        llllllllllllllllllIIIlIllIIIIIII = new WorldPoint(llllllllllllllllllIIIlIllIIIIIlI.getX(), llllllllllllllllllIIIlIllIIIIIlI.getY() - llIllIIlII[5], llllllllllllllllllIIIlIllIIIIIlI.getPlane());
                        llllllllllllllllllIIIlIlIlllllll = new WorldPoint(llllllllllllllllllIIIlIllIIIIIlI.getX() + llIllIIlII[5], llllllllllllllllllIIIlIllIIIIIlI.getY(), llllllllllllllllllIIIlIllIIIIIlI.getPlane());
                        WorldPoint llllllllllllllllllIIIlIlIllllllI = new WorldPoint(llllllllllllllllllIIIlIllIIIIIlI.getX() - llIllIIlII[5], llllllllllllllllllIIIlIllIIIIIlI.getY(), llllllllllllllllllIIIlIllIIIIIlI.getPlane());
                        if (AccBuilderSotf.lIllIlIlllIll(i.containsKey(llllllllllllllllllIIIlIllIIIIIIl) ? 1 : 0)) {
                            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.c(llllllllllllllllllIIIlIllIIIIIIl);
                            Time.sleepTicks((int)llIllIIlII[5]);
                            0;
                            if (AccBuilderSotf.lIllIlIllllIl(Players.getLocal().getInteracting())) {
                                String[] stringArray3 = new String[llIllIIlII[5]];
                                stringArray3[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[29]];
                                NPCs.getNearest((String[])stringArray3).interact(llIllIIIll[llIllIIlII[30]]);
                            }
                            return;
                        }
                        if (AccBuilderSotf.lIllIlIlllllI(i.containsKey(llllllllllllllllllIIIlIllIIIIIIl) ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(i.containsKey(llllllllllllllllllIIIlIllIIIIIII) ? 1 : 0)) {
                            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.c(llllllllllllllllllIIIlIllIIIIIII);
                            Time.sleepTicks((int)llIllIIlII[5]);
                            0;
                            if (AccBuilderSotf.lIllIlIllllIl(Players.getLocal().getInteracting())) {
                                String[] stringArray4 = new String[llIllIIlII[5]];
                                stringArray4[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[31]];
                                NPCs.getNearest((String[])stringArray4).interact(llIllIIIll[llIllIIlII[32]]);
                            }
                            return;
                        }
                        if (AccBuilderSotf.lIllIlIlllllI(i.containsKey(llllllllllllllllllIIIlIllIIIIIIl) ? 1 : 0) && AccBuilderSotf.lIllIlIlllllI(i.containsKey(llllllllllllllllllIIIlIllIIIIIII) ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(i.containsKey(llllllllllllllllllIIIlIlIlllllll) ? 1 : 0)) {
                            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.c(llllllllllllllllllIIIlIlIlllllll);
                            Time.sleepTicks((int)llIllIIlII[5]);
                            0;
                            if (AccBuilderSotf.lIllIlIllllIl(Players.getLocal().getInteracting())) {
                                String[] stringArray5 = new String[llIllIIlII[5]];
                                stringArray5[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[33]];
                                NPCs.getNearest((String[])stringArray5).interact(llIllIIIll[llIllIIlII[18]]);
                            }
                            return;
                        }
                        if (AccBuilderSotf.lIllIlIlllllI(i.containsKey(llllllllllllllllllIIIlIllIIIIIIl) ? 1 : 0) && AccBuilderSotf.lIllIlIlllllI(i.containsKey(llllllllllllllllllIIIlIllIIIIIII) ? 1 : 0) && AccBuilderSotf.lIllIlIlllllI(i.containsKey(llllllllllllllllllIIIlIlIlllllll) ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(i.containsKey(llllllllllllllllllIIIlIlIllllllI) ? 1 : 0)) {
                            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.c(llllllllllllllllllIIIlIlIllllllI);
                            Time.sleepTicks((int)llIllIIlII[5]);
                            0;
                            if (AccBuilderSotf.lIllIlIllllIl(Players.getLocal().getInteracting())) {
                                String[] stringArray6 = new String[llIllIIlII[5]];
                                stringArray6[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[34]];
                                NPCs.getNearest((String[])stringArray6).interact(llIllIIIll[llIllIIlII[35]]);
                            }
                            return;
                        }
                    }
                    if (AccBuilderSotf.lIllIlIlllIll(L.gm ? 1 : 0)) {
                        llllllllllllllllllIIIlIllIIIIIlI = Players.getLocal().getWorldLocation();
                        llllllllllllllllllIIIlIllIIIIIIl = new WorldPoint(llllllllllllllllllIIIlIllIIIIIlI.getX() + llIllIIlII[5], llllllllllllllllllIIIlIllIIIIIlI.getWorldY(), llIllIIlII[4]);
                        llllllllllllllllllIIIlIllIIIIIII = new WorldPoint(llllllllllllllllllIIIlIllIIIIIlI.getX(), llllllllllllllllllIIIlIllIIIIIlI.getWorldY() + llIllIIlII[5], llIllIIlII[4]);
                        llllllllllllllllllIIIlIlIlllllll = new WorldPoint(llllllllllllllllllIIIlIllIIIIIlI.getX() + llIllIIlII[5], llllllllllllllllllIIIlIllIIIIIlI.getWorldY() + llIllIIlII[5], llIllIIlII[4]);
                        if (AccBuilderSotf.lIllIlIlllIll(i.containsKey(llllllllllllllllllIIIlIllIIIIIIl) ? 1 : 0)) {
                            c = llIllIIIll[llIllIIlII[36]];
                            Movement.walkTo((WorldPoint)llllllllllllllllllIIIlIllIIIIIIl);
                            0;
                        }
                        if (AccBuilderSotf.lIllIlIlllIll(i.containsKey(llllllllllllllllllIIIlIllIIIIIII) ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIIIlIllIIIIIIl) ? 1 : 0)) {
                            c = llIllIIIll[llIllIIlII[37]];
                            Movement.walkTo((WorldPoint)llllllllllllllllllIIIlIllIIIIIII);
                            0;
                        }
                        if (AccBuilderSotf.lIllIlIlllIll(i.containsKey(llllllllllllllllllIIIlIlIlllllll) ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIIIlIllIIIIIIl) ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(Players.getLocal().getWorldLocation().equals((Object)llllllllllllllllllIIIlIllIIIIIII) ? 1 : 0)) {
                            c = llIllIIIll[llIllIIlII[38]];
                            Movement.walkTo((WorldPoint)llllllllllllllllllIIIlIlIlllllll);
                            0;
                        }
                    }
                }
            }
        }
        if (AccBuilderSotf.lIllIlIlllllI(Dialog.isOpen() ? 1 : 0) && AccBuilderSotf.lIllIlIllllII(Dialog.getText())) {
            if (AccBuilderSotf.lIllIlIlllllI(Dialog.getText().contains(llIllIIIll[llIllIIlII[39]]) ? 1 : 0)) {
                H.ga = llIllIIlII[5];
            }
            if (!AccBuilderSotf.lIllIlIlllIll(Dialog.getText().contains(llIllIIIll[llIllIIlII[40]]) ? 1 : 0) || AccBuilderSotf.lIllIlIlllllI(Dialog.getText().contains(llIllIIIll[llIllIIlII[41]]) ? 1 : 0)) {
                // empty if block
            }
            if (AccBuilderSotf.lIllIlIlllllI(Dialog.getText().contains(llIllIIIll[llIllIIlII[42]]) ? 1 : 0)) {
                // empty if block
            }
        }
        i.forEach((worldPoint, n2) -> {
            i.put((WorldPoint)worldPoint, n2 - llIllIIlII[5]);
            0;
        });
        i.entrySet().removeIf(entry -> {
            boolean bl;
            if (AccBuilderSotf.lIllIllIIIIlI((Integer)entry.getValue())) {
                bl = llIllIIlII[5];
                0;
                if (3 == (0x6D ^ 0x69)) {
                    return ((0xB1 ^ 0x8D) & ~(0xB0 ^ 0x8C)) != 0;
                }
            } else {
                bl = llIllIIlII[4];
            }
            return bl;
        });
        0;
        o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.I();
    }

    private static boolean lIllIlIllllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIllIIIIlI(int n2) {
        return n2 <= 0;
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderSotf.lIllIllIIIIll(n5, n6) && AccBuilderSotf.lIllIllIIIIIl(n5, n7)) {
            n4 = llIllIIlII[5];
            0;
            if (null != null) {
                return ((0x95 ^ 0xC6 ^ (0xE8 ^ 0x9E)) & (63 + 164 - 68 + 18 ^ 15 + 111 - 3 + 25 ^ -1)) != 0;
            }
        } else {
            n4 = llIllIIlII[4];
        }
        return n4 != 0;
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderSotf.lIllIlIlllllI(configChanged.getGroup().equalsIgnoreCase(llIllIIIll[llIllIIlII[15]]) ? 1 : 0) && AccBuilderSotf.lIllIlIlllllI(configChanged.getKey().contains(llIllIIIll[llIllIIlII[16]]) ? 1 : 0)) {
            this.s = this.p.turnScriptOnOff();
            if (AccBuilderSotf.lIllIlIlllllI(this.s ? 1 : 0)) {
                d = llIllIIlII[4];
                0;
                if (2 < 0) {
                    return;
                }
            } else {
                d = llIllIIlII[5];
            }
        }
    }

    private static boolean lIllIlIllllIl(Object object) {
        return object == null;
    }

    private static boolean lIllIllIIIIll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIlIlllllI(int n2) {
        return n2 != 0;
    }

    protected void shutDown() {
        this.u.remove((Overlay)this.v);
        0;
        d = llIllIIlII[5];
        o = new ac[llIllIIlII[4]];
        L.gn = null;
        n = llIllIIlII[4];
        f = llIllIIlII[4];
        System.out.print(llIllIIIll[llIllIIlII[17]]);
        super.stop();
    }

    private static boolean lIllIllIIIlII(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIllIIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllIlIllIllI(String llllllllllllllllllIIIlIlIIllIllI, String llllllllllllllllllIIIlIlIIllIIII) {
        llllllllllllllllllIIIlIlIIllIllI = new String(Base64.getDecoder().decode(llllllllllllllllllIIIlIlIIllIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIlIlIIllIlII = new StringBuilder();
        char[] llllllllllllllllllIIIlIlIIllIIll = llllllllllllllllllIIIlIlIIllIIII.toCharArray();
        int llllllllllllllllllIIIlIlIIllIIlI = llIllIIlII[4];
        char[] llllllllllllllllllIIIlIlIIlIllII = llllllllllllllllllIIIlIlIIllIllI.toCharArray();
        int llllllllllllllllllIIIlIlIIlIlIll = llllllllllllllllllIIIlIlIIlIllII.length;
        int llllllllllllllllllIIIlIlIIlIlIlI = llIllIIlII[4];
        while (AccBuilderSotf.lIllIllIIIllI(llllllllllllllllllIIIlIlIIlIlIlI, llllllllllllllllllIIIlIlIIlIlIll)) {
            char llllllllllllllllllIIIlIlIIllIlll = llllllllllllllllllIIIlIlIIlIllII[llllllllllllllllllIIIlIlIIlIlIlI];
            llllllllllllllllllIIIlIlIIllIlII.append((char)(llllllllllllllllllIIIlIlIIllIlll ^ llllllllllllllllllIIIlIlIIllIIll[llllllllllllllllllIIIlIlIIllIIlI % llllllllllllllllllIIIlIlIIllIIll.length]));
            0;
            ++llllllllllllllllllIIIlIlIIllIIlI;
            ++llllllllllllllllllIIIlIlIIlIlIlI;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllllIIIlIlIIllIlII);
    }

    protected int loop() {
        block10: {
            block11: {
                if (!AccBuilderSotf.lIllIlIlllIlI(Game.getState(), GameState.LOGGED_IN)) break block10;
                if (!AccBuilderSotf.lIllIlIlllIll(a.isEmpty() ? 1 : 0)) break block11;
                if (!AccBuilderSotf.lIllIlIllllII(j) || AccBuilderSotf.lIllIlIllllIl(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderSotf.lIllIlIlllllI(a.get(llIllIIlII[4]).ah() ? 1 : 0)) {
                    if (AccBuilderSotf.lIllIlIlllllI(a.get(llIllIIlII[4]).ag().contains(llIllIIIll[llIllIIlII[5]]) ? 1 : 0)) {
                        f += llIllIIlII[5];
                    }
                    System.out.println("Achieved " + a.get(llIllIIlII[4]).ag() + " goal");
                    a.remove(llIllIIlII[4]);
                    0;
                    return llIllIIlII[6];
                }
                if (!AccBuilderSotf.lIllIlIlllIlI(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderSotf.lIllIlIlllllI(o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.z() ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(d ? 1 : 0) && AccBuilderSotf.lIllIlIllllll(o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.j(llIllIIlII[7]), llIllIIlII[8]) && AccBuilderSotf.lIllIlIlllIll(Dialog.isOpen() ? 1 : 0)) {
                    c = llIllIIIll[llIllIIlII[9]];
                    o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.A();
                    Time.sleepTicks((int)llIllIIlII[5]);
                    0;
                    0;
                    if ((0xBD ^ 0xB8) != 0) continue;
                    return (0x52 ^ 0x4F) & ~(0x76 ^ 0x6B);
                }
                int llllllllllllllllllIIIlIllIIlIlll = llIllIIlII[4];
                try {
                    llllllllllllllllllIIIlIllIIlIlll = a.get(llIllIIlII[4]).af();
                    0;
                }
                catch (Exception llllllllllllllllllIIIlIllIIlIllI) {
                    llllllllllllllllllIIIlIllIIlIllI.printStackTrace();
                }
                if (-1 >= (0x30 ^ 0x3A ^ (0xA1 ^ 0xAF))) {
                    return (0x35 ^ 0x30 ^ (0xD0 ^ 0xB4)) & (0x46 ^ 0x6B ^ (0x63 ^ 0x2F) ^ -1);
                }
                return llllllllllllllllllIIIlIllIIlIlll;
            }
            if (AccBuilderSotf.lIllIlIlllllI(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderSotf.lIllIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(aN.pW), llIllIIlII[10])) {
                    c = llIllIIIll[llIllIIlII[10]];
                    Movement.walkTo((WorldPoint)aN.pW);
                    0;
                }
                if (AccBuilderSotf.lIllIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(aN.pW), llIllIIlII[10])) {
                    c = llIllIIIll[llIllIIlII[11]];
                }
            }
        }
        return llIllIIlII[12];
    }

    private static boolean lIllIlIlllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllIllIIIlIl(Object object, Object object2) {
        return object != object2;
    }

    private static void lIllIlIlllIII() {
        llIllIIIll = new String[llIllIIlII[90]];
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[4]] = AccBuilderSotf."https://discord.com/api/webhooks/1215418698408525957/f_b1MXw4fCg6qsHKLguNMRnCRHVtAVsvyx7SPIY6Ce9Z1zYvmlDIQLyOD9qIsQ-fYTKf";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[5]] = AccBuilderSotf."quest";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[9]] = AccBuilderSotf."Disabling GE warning";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[10]] = AccBuilderSotf."Navigating to GE";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[11]] = AccBuilderSotf."Finished account";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[13]] = AccBuilderSotf."\n[Plugin] Plugin starting up\n";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[14]] = AccBuilderSotf."Switching to One Click Sotf account";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[15]] = AccBuilderSotf."hootfighter";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[16]] = AccBuilderSotf."enabled";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[17]] = AccBuilderSotf."\n[Plugin] Plugin shut down\n";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[22]] = AccBuilderSotf."Vanstrom Klause";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[24]] = AccBuilderSotf."Handle bloodveld";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[26]] = AccBuilderSotf."Wield";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[27]] = AccBuilderSotf."Attack";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[28]] = AccBuilderSotf."Vanstrom Klause";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[29]] = AccBuilderSotf."Vanstrom Klause";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[30]] = AccBuilderSotf."Attack";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[31]] = AccBuilderSotf."Vanstrom Klause";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[32]] = AccBuilderSotf."Attack";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[33]] = AccBuilderSotf."Vanstrom Klause";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[18]] = AccBuilderSotf."Attack";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[34]] = AccBuilderSotf."Vanstrom Klause";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[35]] = AccBuilderSotf."Attack";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[36]] = AccBuilderSotf."lightning pos1;";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[37]] = AccBuilderSotf."lightning pos2;";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[38]] = AccBuilderSotf."lightning pos2;";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[39]] = AccBuilderSotf."tell the king";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[40]] = AccBuilderSotf."another clue scroll";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[41]] = AccBuilderSotf."a new clue";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[42]] = AccBuilderSotf."I could tell by the cut of your jib";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[43]] = AccBuilderSotf."You haven't got enough";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[44]] = AccBuilderSotf."Not enough gold for buying";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[45]] = AccBuilderSotf."Oh dear, you are dead!";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[46]] = AccBuilderSotf."We DIED!! :(";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[47]] = AccBuilderSotf."Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[48]] = AccBuilderSotf."We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[49]] = AccBuilderSotf."can't reach that";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[50]] = AccBuilderSotf."Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[51]] = AccBuilderSotf."Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[52]] = AccBuilderSotf."Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[53]] = AccBuilderSotf."Tree Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[54]] = AccBuilderSotf."Tree Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[55]] = AccBuilderSotf."Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[56]] = AccBuilderSotf."think that facing North";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[59]] = AccBuilderSotf."already some rum";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[61]] = AccBuilderSotf."Drop";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[62]] = AccBuilderSotf."can't reach that";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[63]] = AccBuilderSotf."can't reach that";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[66]] = AccBuilderSotf."Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[67]] = AccBuilderSotf."Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[68]] = AccBuilderSotf."Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[69]] = AccBuilderSotf."Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[70]] = AccBuilderSotf."Tree Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[3]] = AccBuilderSotf."Tree Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[71]] = AccBuilderSotf."Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[72]] = AccBuilderSotf."think that facing North";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[73]] = AccBuilderSotf."already some rum";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[74]] = AccBuilderSotf."Drop";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[75]] = AccBuilderSotf."fail to pick";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[76]] = AccBuilderSotf."spots you before you manage to open the chest";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[77]] = AccBuilderSotf."You search the chest, but find nothing.";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[81]] = AccBuilderSotf."door is locked";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[2]] = AccBuilderSotf."Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[80]] = AccBuilderSotf."Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[85]] = AccBuilderSotf."Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[86]] = AccBuilderSotf."Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[87]] = AccBuilderSotf."Burning";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[88]] = AccBuilderSotf."Burning";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[89]] = AccBuilderSotf."";
    }

    private static boolean lIllIllIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    static {
        AccBuilderSotf.lIllIlIlllIIl();
        AccBuilderSotf.lIllIlIlllIII();
        a = new ArrayList<ac>();
        b = System.currentTimeMillis();
        d = llIllIIlII[4];
        g = System.currentTimeMillis();
        h = llIllIIIll[llIllIIlII[89]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        ac[] acArray = new ac[llIllIIlII[5]];
        acArray[AccBuilderSotf.llIllIIlII[4]] = new aN();
        o = acArray;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        TileObject llllllllllllllllllIIIlIlIllIllII;
        WorldPoint llllllllllllllllllIIIlIlIllIllIl;
        void llllllllllllllllllIIIlIlIllIlllI;
        if (AccBuilderSotf.lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[43]]) ? 1 : 0)) {
            System.out.println(llIllIIIll[llIllIIlII[44]]);
            d = llIllIIlII[5];
        }
        if (AccBuilderSotf.lIllIlIlllllI(llllllllllllllllllIIIlIlIllIlllI.getMessage().contains(llIllIIIll[llIllIIlII[45]]) ? 1 : 0)) {
            System.out.println(llIllIIIll[llIllIIlII[46]]);
            if (AccBuilderSotf.lIllIlIlllIll(Game.getWildyLevel()) && AccBuilderSotf.lIllIlIlllIll(Inventory.contains(item -> item.getName().contains(llIllIIIll[llIllIIlII[88]])) ? 1 : 0)) {
                d = llIllIIlII[5];
                System.out.println(llIllIIIll[llIllIIlII[47]]);
            }
            if (!AccBuilderSotf.lIllIllIIIIlI(Game.getWildyLevel()) || AccBuilderSotf.lIllIlIlllllI(Inventory.contains(item -> item.getName().contains(llIllIIIll[llIllIIlII[87]])) ? 1 : 0)) {
                d = llIllIIlII[4];
                System.out.println(llIllIIIll[llIllIIlII[48]]);
            }
        }
        if (AccBuilderSotf.lIllIlIlllllI(llllllllllllllllllIIIlIlIllIlllI.getMessage().contains(llIllIIIll[llIllIIlII[49]]) ? 1 : 0) && AccBuilderSotf.lIllIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(V.mh), llIllIIlII[22])) {
            String[] stringArray = new String[llIllIIlII[5]];
            stringArray[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[50]];
            if (AccBuilderSotf.lIllIlIllllII(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[llIllIIlII[5]];
                stringArray2[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[51]];
                TileObjects.getNearest((String[])stringArray2).interact(llIllIIIll[llIllIIlII[52]]);
                Time.sleepTicks((int)llIllIIlII[11]);
                0;
            }
            String[] stringArray3 = new String[llIllIIlII[5]];
            stringArray3[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[53]];
            if (AccBuilderSotf.lIllIlIllllII(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[llIllIIlII[5]];
                stringArray4[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[54]];
                TileObjects.getNearest((String[])stringArray4).interact(llIllIIIll[llIllIIlII[55]]);
                Time.sleepTicks((int)llIllIIlII[10]);
                0;
            }
        }
        if (AccBuilderSotf.lIllIlIlllllI(llllllllllllllllllIIIlIlIllIlllI.getMessage().contains(llIllIIIll[llIllIIlII[56]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llIllIIlII[57], llIllIIlII[58], llIllIIlII[4]));
            0;
            Time.sleepTicks((int)llIllIIlII[5]);
            0;
        }
        if (AccBuilderSotf.lIllIlIlllllI(llllllllllllllllllIIIlIlIllIlllI.getMessage().contains(llIllIIIll[llIllIIlII[59]]) ? 1 : 0)) {
            int[] nArray = new int[llIllIIlII[5]];
            nArray[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[60];
            if (AccBuilderSotf.lIllIlIlllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIllIIlII[5]];
                nArray2[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[60];
                Inventory.getFirst((int[])nArray2).interact(llIllIIIll[llIllIIlII[61]]);
            }
        }
        if (AccBuilderSotf.lIllIlIlllllI(llllllllllllllllllIIIlIlIllIlllI.getMessage().contains(llIllIIIll[llIllIIlII[62]]) ? 1 : 0) && AccBuilderSotf.lIllIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(z.eb), llIllIIlII[22])) {
            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.x();
        }
        if (!(!AccBuilderSotf.lIllIlIlllllI(llllllllllllllllllIIIlIlIllIlllI.getMessage().contains(llIllIIIll[llIllIIlII[63]]) ? 1 : 0) || AccBuilderSotf.lIllIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(o.c.k.i.-.l.o.f.-.n.c.t.e.s.u.df), llIllIIlII[22]) && AccBuilderSotf.lIllIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(o.c.k.i.-.l.o.f.-.n.c.t.e.s.u.dh), llIllIIlII[22]) && AccBuilderSotf.lIllIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllIIlII[64], llIllIIlII[65], llIllIIlII[4])), llIllIIlII[15]) && !AccBuilderSotf.lIllIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(V.mh), llIllIIlII[22]))) {
            llllllllllllllllllIIIlIlIllIllIl = new WorldPoint(llIllIIlII[64], llIllIIlII[65], llIllIIlII[4]);
            llllllllllllllllllIIIlIlIllIllII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (AccBuilderSotf.lIllIlIlllllI(tileObject.getName().contains(llIllIIIll[llIllIIlII[85]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIllIIlII[5]];
                    stringArray[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[86]];
                    if (AccBuilderSotf.lIllIlIlllllI(tileObject.hasAction(stringArray) ? 1 : 0) && AccBuilderSotf.lIllIllIIIIIl(tileObject.getWorldLocation().distanceTo(llllllllllllllllllIIIlIlIllIllIl), llIllIIlII[9])) {
                        n2 = llIllIIlII[5];
                        0;
                        if (-1 < 1) return n2 != 0;
                        return ((0xA4 ^ 0x9D ^ (0xB ^ 0x3B)) & (0x9A ^ 0xC4 ^ (0x68 ^ 0x3F) ^ -1)) != 0;
                    }
                }
                n2 = llIllIIlII[4];
                return n2 != 0;
            });
            if (AccBuilderSotf.lIllIlIllllII(llllllllllllllllllIIIlIlIllIllII)) {
                llllllllllllllllllIIIlIlIllIllII.interact(llIllIIIll[llIllIIlII[66]]);
                Time.sleepTicks((int)llIllIIlII[13]);
                0;
            }
            String[] stringArray = new String[llIllIIlII[5]];
            stringArray[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[67]];
            if (AccBuilderSotf.lIllIlIllllII(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray5 = new String[llIllIIlII[5]];
                stringArray5[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[68]];
                TileObjects.getNearest((String[])stringArray5).interact(llIllIIIll[llIllIIlII[69]]);
                Time.sleepTicks((int)llIllIIlII[11]);
                0;
            }
            String[] stringArray6 = new String[llIllIIlII[5]];
            stringArray6[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[70]];
            if (AccBuilderSotf.lIllIlIllllII(TileObjects.getNearest((String[])stringArray6))) {
                String[] stringArray7 = new String[llIllIIlII[5]];
                stringArray7[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[3]];
                TileObjects.getNearest((String[])stringArray7).interact(llIllIIIll[llIllIIlII[71]]);
                Time.sleepTicks((int)llIllIIlII[10]);
                0;
            }
        }
        if (AccBuilderSotf.lIllIlIlllllI(llllllllllllllllllIIIlIlIllIlllI.getMessage().contains(llIllIIIll[llIllIIlII[72]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llIllIIlII[57], llIllIIlII[58], llIllIIlII[4]));
            0;
            Time.sleepTicks((int)llIllIIlII[5]);
            0;
        }
        if (AccBuilderSotf.lIllIlIlllllI(llllllllllllllllllIIIlIlIllIlllI.getMessage().contains(llIllIIIll[llIllIIlII[73]]) ? 1 : 0)) {
            int[] nArray = new int[llIllIIlII[5]];
            nArray[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[60];
            if (AccBuilderSotf.lIllIlIlllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIllIIlII[5]];
                nArray3[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[60];
                Inventory.getFirst((int[])nArray3).interact(llIllIIIll[llIllIIlII[74]]);
            }
        }
        if (AccBuilderSotf.lIllIlIlllllI(llllllllllllllllllIIIlIlIllIlllI.getMessage().contains(llIllIIIll[llIllIIlII[75]]) ? 1 : 0)) {
            // empty if block
        }
        if (AccBuilderSotf.lIllIlIlllllI(llllllllllllllllllIIIlIlIllIlllI.getMessage().contains(llIllIIIll[llIllIIlII[76]]) ? 1 : 0)) {
            // empty if block
        }
        if (AccBuilderSotf.lIllIlIlllllI(llllllllllllllllllIIIlIlIllIlllI.getMessage().contains(llIllIIIll[llIllIIlII[77]]) ? 1 : 0)) {
            // empty if block
        }
        llllllllllllllllllIIIlIlIllIllIl = new WorldArea(llIllIIlII[78], llIllIIlII[79], llIllIIlII[80], llIllIIlII[76], llIllIIlII[4]);
        if (AccBuilderSotf.lIllIlIlllllI(llllllllllllllllllIIIlIlIllIlllI.getMessage().contains(llIllIIIll[llIllIIlII[81]]) ? 1 : 0) && AccBuilderSotf.lIllIlIlllllI(llllllllllllllllllIIIlIlIllIllIl.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && AccBuilderSotf.lIllIlIllllII(llllllllllllllllllIIIlIlIllIllII = TileObjects.getNearest(tileObject -> {
            int n2;
            if (AccBuilderSotf.lIllIlIlllllI(tileObject.getName().contains(llIllIIIll[llIllIIlII[80]]) ? 1 : 0) && AccBuilderSotf.lIllIllIIIIII(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIllIIlII[5])) {
                n2 = llIllIIlII[5];
                0;
                if (-2 >= 0) {
                    return ((0x83 ^ 0x97 ^ (0xC5 ^ 0xB1)) & (76 + 159 - 108 + 88 ^ 42 + 182 - 151 + 110 ^ -1)) != 0;
                }
            } else {
                n2 = llIllIIlII[4];
            }
            return n2 != 0;
        }))) {
            llllllllllllllllllIIIlIlIllIllII.interact(llIllIIIll[llIllIIlII[2]]);
            Time.sleepTicks((int)llIllIIlII[16]);
            0;
        }
    }

    private static boolean lIllIllIIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        d = llIllIIlII[4];
        System.out.print(llIllIIIll[llIllIIlII[13]]);
        this.u.add((Overlay)this.v);
        0;
        a.clear();
        System.out.println(llIllIIIll[llIllIIlII[14]]);
        a.clear();
        t[] tArray = new t[llIllIIlII[5]];
        tArray[AccBuilderSotf.llIllIIlII[4]] = new t();
        Collections.addAll(a, tArray);
        0;
        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (!AccBuilderSotf.lIllIllIIIlII(graphicsObjectCreated.getGraphicsObject().getId(), llIllIIlII[82]) || !AccBuilderSotf.lIllIllIIIlII(graphicsObjectCreated.getGraphicsObject().getId(), llIllIIlII[83]) || AccBuilderSotf.lIllIlIllllll(graphicsObjectCreated.getGraphicsObject().getId(), llIllIIlII[84])) {
            void llllllllllllllllllIIIlIlIllIlIII;
            AccBuilderSotf llllllllllllllllllIIIlIlIllIlIIl;
            if (AccBuilderSotf.lIllIlIlllIll(L.gm ? 1 : 0)) {
                L.gm = llIllIIlII[5];
            }
            i.put(WorldPoint.fromLocal((Client)llllllllllllllllllIIIlIlIllIlIIl.t, (LocalPoint)llllllllllllllllllIIIlIlIllIlIII.getGraphicsObject().getLocation()), llIllIIlII[11]);
            0;
            return;
        }
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderSotf.lIllIllIIIlII(n2, llIllIIlII[28])) {
            return;
        }
        if (AccBuilderSotf.lIllIlIlllIll(n)) {
            AccBuilderSotf llllllllllllllllllIIIlIlIllIIIlI;
            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.a(llllllllllllllllllIIIlIlIllIIIlI.r, "rsn: " + k + " account has been banned? - Acc builder SOTF");
            n += llIllIIlII[5];
        }
    }

    private static String lIllIlIllIlIl(String llllllllllllllllllIIIlIlIlIIIllI, String llllllllllllllllllIIIlIlIlIIIlIl) {
        try {
            SecretKeySpec llllllllllllllllllIIIlIlIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllllIIIlIlIlIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllllllllIIIlIlIlIIlIII.init(llIllIIlII[9], llllllllllllllllllIIIlIlIlIIlIIl);
            return new String(llllllllllllllllllIIIlIlIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIlIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIlIlIlIIIlll) {
            llllllllllllllllllIIIlIlIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIllllII(Object object) {
        return object != null;
    }

    public AccBuilderSotf() {
        this.q = new WorldArea(llIllIIlII[0], llIllIIlII[1], llIllIIlII[2], llIllIIlII[3], llIllIIlII[4]);
        this.r = llIllIIIll[llIllIIlII[4]];
    }

    private static String lIllIlIllIlll(String llllllllllllllllllIIIlIlIIIlllll, String llllllllllllllllllIIIlIlIIIllllI) {
        try {
            SecretKeySpec llllllllllllllllllIIIlIlIIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIlIlIIIllllI.getBytes(StandardCharsets.UTF_8)), llIllIIlII[16]), "DES");
            Cipher llllllllllllllllllIIIlIlIIlIIIll = Cipher.getInstance("DES");
            llllllllllllllllllIIIlIlIIlIIIll.init(llIllIIlII[9], llllllllllllllllllIIIlIlIIlIIlII);
            return new String(llllllllllllllllllIIIlIlIIlIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIlIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllllIIIlIlIIlIIIlI) {
            llllllllllllllllllIIIlIlIIlIIIlI.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(InventoryChanged inventoryChanged) {
        if (AccBuilderSotf.lIllIlIlllIlI(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_REMOVED)) {
            return;
        }
    }

    private static void lIllIlIlllIIl() {
        llIllIIlII = new int[91];
        AccBuilderSotf.llIllIIlII[0] = -(0xFFFFD7CB & 0x39FD) & (0xFFFFBDEF & 0x5FFF);
        AccBuilderSotf.llIllIIlII[1] = -(0xFFFFEF73 & 0x51BC) & (0xFFFFFFBF & 0x4F7F);
        AccBuilderSotf.llIllIIlII[2] = 0x54 ^ 0x58 ^ (0xAF ^ 0x9D);
        AccBuilderSotf.llIllIIlII[3] = 2 ^ 0x37;
        AccBuilderSotf.llIllIIlII[4] = (0xFB ^ 0xC5) & ~(0x35 ^ 0xB);
        AccBuilderSotf.llIllIIlII[5] = 1;
        AccBuilderSotf.llIllIIlII[6] = 0x76 ^ 0x12;
        AccBuilderSotf.llIllIIlII[7] = -(0xFFFFEFF7 & 0x76CB) & (0xFFFFE7DF & 0x7FFB);
        AccBuilderSotf.llIllIIlII[8] = -(0xFFFFFA6F & 0x6D97) & (0xFFFFFBFF & 0x6FEE);
        AccBuilderSotf.llIllIIlII[9] = 2;
        AccBuilderSotf.llIllIIlII[10] = 3;
        AccBuilderSotf.llIllIIlII[11] = 0x70 ^ 0x1C ^ (0x41 ^ 0x29);
        AccBuilderSotf.llIllIIlII[12] = 0xFFFFB7FC & 0x4A5B;
        AccBuilderSotf.llIllIIlII[13] = 0x64 ^ 0x61;
        AccBuilderSotf.llIllIIlII[14] = 0x15 ^ 0x6C ^ 46 + 25 - 64 + 120;
        AccBuilderSotf.llIllIIlII[15] = 0xB7 ^ 0x93 ^ (0x52 ^ 0x71);
        AccBuilderSotf.llIllIIlII[16] = 0x86 ^ 0x8E;
        AccBuilderSotf.llIllIIlII[17] = 0xEC ^ 0x84 ^ (0x5C ^ 0x3D);
        AccBuilderSotf.llIllIIlII[18] = 0x7F ^ 0x6B;
        AccBuilderSotf.llIllIIlII[19] = -(0xFFFFFF5D & 0x6CE7) & (0xFFFFEFDD & 0x7E7E);
        AccBuilderSotf.llIllIIlII[20] = 0xFFFFBABF & 0x4759;
        AccBuilderSotf.llIllIIlII[21] = 126 + 20 - 108 + 92;
        AccBuilderSotf.llIllIIlII[22] = 0x62 ^ 0x68;
        AccBuilderSotf.llIllIIlII[23] = 0xFFFFB7F7 & 0x6D6D;
        AccBuilderSotf.llIllIIlII[24] = 0xC8 ^ 0xC3;
        AccBuilderSotf.llIllIIlII[25] = -(0xFFFFDEE9 & 0x3D97) & (0xFFFFDFFF & 0x3FDF);
        AccBuilderSotf.llIllIIlII[26] = 0xF ^ 3;
        AccBuilderSotf.llIllIIlII[27] = 0xAB ^ 0xA6;
        AccBuilderSotf.llIllIIlII[28] = 49 + 8 - -5 + 123 ^ 40 + 160 - 92 + 75;
        AccBuilderSotf.llIllIIlII[29] = 0x4C ^ 0x5B ^ (0x1B ^ 3);
        AccBuilderSotf.llIllIIlII[30] = 9 ^ 0x19;
        AccBuilderSotf.llIllIIlII[31] = 0x5E ^ 0 ^ (0x68 ^ 0x27);
        AccBuilderSotf.llIllIIlII[32] = 0x5B ^ 0x7D ^ (0xF2 ^ 0xC6);
        AccBuilderSotf.llIllIIlII[33] = 0xF7 ^ 0xB2 ^ (0x55 ^ 3);
        AccBuilderSotf.llIllIIlII[34] = 0x6D ^ 0x78;
        AccBuilderSotf.llIllIIlII[35] = 0x74 ^ 0x62;
        AccBuilderSotf.llIllIIlII[36] = 0x28 ^ 0x3F;
        AccBuilderSotf.llIllIIlII[37] = 0xD2 ^ 0xC7 ^ (0x8A ^ 0x87);
        AccBuilderSotf.llIllIIlII[38] = 0x18 ^ 1;
        AccBuilderSotf.llIllIIlII[39] = 0x64 ^ 0x31 ^ (0x29 ^ 0x66);
        AccBuilderSotf.llIllIIlII[40] = 0xA8 ^ 0xB3;
        AccBuilderSotf.llIllIIlII[41] = 0x97 ^ 0x8B;
        AccBuilderSotf.llIllIIlII[42] = 0x48 ^ 0x63 ^ (0x95 ^ 0xA3);
        AccBuilderSotf.llIllIIlII[43] = 0x4D ^ 0x29 ^ (0x7A ^ 0);
        AccBuilderSotf.llIllIIlII[44] = 0xDE ^ 0xC7 ^ (0x9C ^ 0x9A);
        AccBuilderSotf.llIllIIlII[45] = 3 ^ 0x19 ^ (0x4E ^ 0x74);
        AccBuilderSotf.llIllIIlII[46] = 168 + 172 - 174 + 21 ^ 113 + 17 - 103 + 127;
        AccBuilderSotf.llIllIIlII[47] = 0x8B ^ 0xA9;
        AccBuilderSotf.llIllIIlII[48] = 0xB8 ^ 0x9B;
        AccBuilderSotf.llIllIIlII[49] = 11 + 114 - 74 + 77 ^ 113 + 161 - 240 + 130;
        AccBuilderSotf.llIllIIlII[50] = 3 ^ (0xE0 ^ 0xC6);
        AccBuilderSotf.llIllIIlII[51] = 60 + 9 - -13 + 72 ^ 113 + 64 - 58 + 69;
        AccBuilderSotf.llIllIIlII[52] = 0x5C ^ 0x5A ^ (0x8B ^ 0xAA);
        AccBuilderSotf.llIllIIlII[53] = 0x75 ^ 0x5D;
        AccBuilderSotf.llIllIIlII[54] = 0x84 ^ 0xAD;
        AccBuilderSotf.llIllIIlII[55] = 0x27 ^ 0xC ^ 1;
        AccBuilderSotf.llIllIIlII[56] = 74 + 210 - 210 + 159 ^ 164 + 50 - 74 + 54;
        AccBuilderSotf.llIllIIlII[57] = 0xFFFFCFE5 & 0x3BBB;
        AccBuilderSotf.llIllIIlII[58] = 0xFFFFFDE7 & 0xEBF;
        AccBuilderSotf.llIllIIlII[59] = 110 + 42 - 75 + 76 ^ 22 + 139 - 135 + 155;
        AccBuilderSotf.llIllIIlII[60] = -(0xFFFFFAD7 & 0x3F39) & (0xFFFFBFFF & 0x7BBF);
        AccBuilderSotf.llIllIIlII[61] = 0x52 ^ 0x7F;
        AccBuilderSotf.llIllIIlII[62] = 0x52 ^ 0x7C;
        AccBuilderSotf.llIllIIlII[63] = 0xBA ^ 0x95;
        AccBuilderSotf.llIllIIlII[64] = -(0xFFFFBBD6 & 0x742D) & (0xFFFFBE2F & Short.MAX_VALUE);
        AccBuilderSotf.llIllIIlII[65] = 0xFFFF9FFF & 0x6CB2;
        AccBuilderSotf.llIllIIlII[66] = 0x6F ^ 0x11 ^ (0xF ^ 0x41);
        AccBuilderSotf.llIllIIlII[67] = 0x7E ^ 0x2B ^ (0xD2 ^ 0xB6);
        AccBuilderSotf.llIllIIlII[68] = 0x65 ^ 0x1F ^ (0x2E ^ 0x66);
        AccBuilderSotf.llIllIIlII[69] = 0xC7 ^ 0x96 ^ (0x20 ^ 0x42);
        AccBuilderSotf.llIllIIlII[70] = 0x88 ^ 0xBC;
        AccBuilderSotf.llIllIIlII[71] = 0x14 ^ 0x22;
        AccBuilderSotf.llIllIIlII[72] = 0x45 ^ 0x60 ^ (0x24 ^ 0x36);
        AccBuilderSotf.llIllIIlII[73] = 5 ^ 0x1D ^ (0xA2 ^ 0x82);
        AccBuilderSotf.llIllIIlII[74] = 0x3E ^ 7;
        AccBuilderSotf.llIllIIlII[75] = 6 ^ 0x3C;
        AccBuilderSotf.llIllIIlII[76] = 0x67 ^ 0x5C;
        AccBuilderSotf.llIllIIlII[77] = 5 ^ 0x14 ^ (0x10 ^ 0x3D);
        AccBuilderSotf.llIllIIlII[78] = 0xFFFFCE7F & 0x3BFF;
        AccBuilderSotf.llIllIIlII[79] = 0xFFFFF7BF & 0x2DFF;
        AccBuilderSotf.llIllIIlII[80] = 0x40 ^ 0x7F;
        AccBuilderSotf.llIllIIlII[81] = 0x44 ^ 0x4A ^ (0x74 ^ 0x47);
        AccBuilderSotf.llIllIIlII[82] = 0xFFFFAFE3 & 0x561C;
        AccBuilderSotf.llIllIIlII[83] = 0xFFFFC7FF & 0x3DE2;
        AccBuilderSotf.llIllIIlII[84] = 0xFFFFCDB7 & 0x37EE;
        AccBuilderSotf.llIllIIlII[85] = 0x7B ^ 0x3B;
        AccBuilderSotf.llIllIIlII[86] = 0x3D ^ 0x7C;
        AccBuilderSotf.llIllIIlII[87] = 0xCE ^ 0x8C;
        AccBuilderSotf.llIllIIlII[88] = 0x25 ^ 0x66;
        AccBuilderSotf.llIllIIlII[89] = 0xCC ^ 0x88;
        AccBuilderSotf.llIllIIlII[90] = 0x5A ^ 0x1F;
    }

    private static boolean lIllIlIlllIll(int n2) {
        return n2 == 0;
    }
}

