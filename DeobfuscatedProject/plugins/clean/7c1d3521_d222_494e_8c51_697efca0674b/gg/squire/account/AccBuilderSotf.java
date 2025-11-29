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
import gg.squire.account.HHelper;
import gg.squire.account.LHelper;
import gg.squire.account.VHelper;
import gg.squire.account.ADHelper;
import gg.squire.account.ANHelper;
import o.c.k.i.-.l.o.f.-.n.c.t.e.s.ac;
import gg.squire.account.EHelper;
import gg.squire.account.THelper;
import gg.squire.account.UHelper;
import gg.squire.account.ZHelper;
import org.pf4j.Extension;

@PluginDescriptor(name="Squire Sotf Builder", enabledByDefault=false)
@Extension
@SquireUtil
public class AccBuilderSotf
extends Script {
    public static  long b;
    
    static  int n;
    
    @Inject
    public  BuilderConfig p;
    public static  HashMap<WorldPoint, Integer> i;
    public static  boolean e;
    public static  String k;
    @Inject
    private  OverlayManager u;
    private static  ac[] o;
    public static  long g;
     boolean s;
    @Inject
    private  Client t;
    public static  String l;
    public static  String c;
    public static  int f;
    public static  boolean d;
    public static  List<ac> a;
    public static  String h;
    @Inject
    private  BuilderInfoBox v;
    public static  String m;
    public static  String j;
     WorldArea q;
     String r;

    @Subscribe
    public void a(GameTick gameTick) {
        block28: {
            AccBuilderSotf var1;
            block29: {
                o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.y();
                int n3 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n4 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderSotf.lIllIllIIIlIl(player2, player) && AccBuilderSotf.lIllIlIlllllI(this.a(n3, n4, (Player)player2) ? 1 : 0)) {
                        n4 = llIllIIlII[5];

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
            if (AccBuilderSotf.lIllIlIlllIll(var1.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
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

                        }
                    }
                }
                if (AccBuilderSotf.lIllIlIlllllI(i.containsKey(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint var2;
                    WorldPoint var3;
                    WorldPoint var4;
                    WorldPoint var5;
                    if (AccBuilderSotf.lIllIlIlllllI(L.gm ? 1 : 0)) {
                        String[] stringArray2 = new String[llIllIIlII[5]];
                        stringArray2[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[28]];
                        var5 = NPCs.getNearest((String[])stringArray2).getWorldLocation();
                        var4 = new WorldPoint(var5.getX(), var5.getY() + llIllIIlII[5], var5.getPlane());
                        var3 = new WorldPoint(var5.getX(), var5.getY() - llIllIIlII[5], var5.getPlane());
                        var2 = new WorldPoint(var5.getX() + llIllIIlII[5], var5.getY(), var5.getPlane());
                        WorldPoint var6 = new WorldPoint(var5.getX() - llIllIIlII[5], var5.getY(), var5.getPlane());
                        if (AccBuilderSotf.lIllIlIlllIll(i.containsKey(var4) ? 1 : 0)) {
                            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.c(var4);
                            Time.sleepTicks((int)llIllIIlII[5]);

                            if (AccBuilderSotf.lIllIlIllllIl(Players.getLocal().getInteracting())) {
                                String[] stringArray3 = new String[llIllIIlII[5]];
                                stringArray3[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[29]];
                                NPCs.getNearest((String[])stringArray3).interact(llIllIIIll[llIllIIlII[30]]);
                            }
                            return;
                        }
                        if (AccBuilderSotf.lIllIlIlllllI(i.containsKey(var4) ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(i.containsKey(var3) ? 1 : 0)) {
                            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.c(var3);
                            Time.sleepTicks((int)llIllIIlII[5]);

                            if (AccBuilderSotf.lIllIlIllllIl(Players.getLocal().getInteracting())) {
                                String[] stringArray4 = new String[llIllIIlII[5]];
                                stringArray4[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[31]];
                                NPCs.getNearest((String[])stringArray4).interact(llIllIIIll[llIllIIlII[32]]);
                            }
                            return;
                        }
                        if (AccBuilderSotf.lIllIlIlllllI(i.containsKey(var4) ? 1 : 0) && AccBuilderSotf.lIllIlIlllllI(i.containsKey(var3) ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(i.containsKey(var2) ? 1 : 0)) {
                            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.c(var2);
                            Time.sleepTicks((int)llIllIIlII[5]);

                            if (AccBuilderSotf.lIllIlIllllIl(Players.getLocal().getInteracting())) {
                                String[] stringArray5 = new String[llIllIIlII[5]];
                                stringArray5[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[33]];
                                NPCs.getNearest((String[])stringArray5).interact(llIllIIIll[llIllIIlII[18]]);
                            }
                            return;
                        }
                        if (AccBuilderSotf.lIllIlIlllllI(i.containsKey(var4) ? 1 : 0) && AccBuilderSotf.lIllIlIlllllI(i.containsKey(var3) ? 1 : 0) && AccBuilderSotf.lIllIlIlllllI(i.containsKey(var2) ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(i.containsKey(var6) ? 1 : 0)) {
                            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.c(var6);
                            Time.sleepTicks((int)llIllIIlII[5]);

                            if (AccBuilderSotf.lIllIlIllllIl(Players.getLocal().getInteracting())) {
                                String[] stringArray6 = new String[llIllIIlII[5]];
                                stringArray6[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[34]];
                                NPCs.getNearest((String[])stringArray6).interact(llIllIIIll[llIllIIlII[35]]);
                            }
                            return;
                        }
                    }
                    if (AccBuilderSotf.lIllIlIlllIll(L.gm ? 1 : 0)) {
                        var5 = Players.getLocal().getWorldLocation();
                        var4 = new WorldPoint(var5.getX() + llIllIIlII[5], var5.getWorldY(), llIllIIlII[4]);
                        var3 = new WorldPoint(var5.getX(), var5.getWorldY() + llIllIIlII[5], llIllIIlII[4]);
                        var2 = new WorldPoint(var5.getX() + llIllIIlII[5], var5.getWorldY() + llIllIIlII[5], llIllIIlII[4]);
                        if (AccBuilderSotf.lIllIlIlllIll(i.containsKey(var4) ? 1 : 0)) {
                            c = llIllIIIll[llIllIIlII[36]];
                            Movement.walkTo((WorldPoint)var4);

                        }
                        if (AccBuilderSotf.lIllIlIlllIll(i.containsKey(var3) ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0)) {
                            c = llIllIIIll[llIllIIlII[37]];
                            Movement.walkTo((WorldPoint)var3);

                        }
                        if (AccBuilderSotf.lIllIlIlllIll(i.containsKey(var2) ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(Players.getLocal().getWorldLocation().equals((Object)var4) ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(Players.getLocal().getWorldLocation().equals((Object)var3) ? 1 : 0)) {
                            c = llIllIIIll[llIllIIlII[38]];
                            Movement.walkTo((WorldPoint)var2);

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

        });
        i.entrySet().removeIf(entry -> {
            boolean bl;
            if (AccBuilderSotf.lIllIllIIIIlI((Integer)entry.getValue())) {
                bl = llIllIIlII[5];

                if (3 == (0x6D ^ 0x69)) {
                    return false;
                }
            } else {
                bl = llIllIIlII[4];
            }
            return bl;
        });

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

        return String.valueOf(var7);
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

                    return llIllIIlII[6];
                }
                if (!AccBuilderSotf.lIllIlIlllIlI(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderSotf.lIllIlIlllllI(o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.z() ? 1 : 0) && AccBuilderSotf.lIllIlIlllIll(d ? 1 : 0) && AccBuilderSotf.lIllIlIllllll(o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.j(llIllIIlII[7]), llIllIIlII[8]) && AccBuilderSotf.lIllIlIlllIll(Dialog.isOpen() ? 1 : 0)) {
                    c = llIllIIIll[llIllIIlII[9]];
                    o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.A();
                    Time.sleepTicks((int)llIllIIlII[5]);

                    if ((0xBD ^ 0xB8) != 0) continue;
                    return (0x52 ^ 0x4F) & ~(0x76 ^ 0x6B);
                }
                int var8 = llIllIIlII[4];
                try {
                    var8 = a.get(llIllIIlII[4]).af();

                }
                catch (Exception var9) {
                    var9.printStackTrace();
                }
                if (-1 >= (0x30 ^ 0x3A ^ (0xA1 ^ 0xAF))) {
                    return (0x35 ^ 0x30 ^ (0xD0 ^ 0xB4)) & (0x46 ^ 0x6B ^ (0x63 ^ 0x2F) ^ -1);
                }
                return var8;
            }
            if (AccBuilderSotf.lIllIlIlllllI(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderSotf.lIllIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(aN.pW), llIllIIlII[10])) {
                    c = llIllIIIll[llIllIIlII[10]];
                    Movement.walkTo((WorldPoint)aN.pW);

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
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[4]] = "https://discord.com/api/webhooks/1215418698408525957/f_b1MXw4fCg6qsHKLguNMRnCRHVtAVsvyx7SPIY6Ce9Z1zYvmlDIQLyOD9qIsQ-fYTKf";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[5]] = "quest";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[9]] = "Disabling GE warning";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[10]] = "Navigating to GE";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[11]] = "Finished account";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[13]] = "\n[Plugin] Plugin starting up\n";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[14]] = "Switching to One Click Sotf account";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[15]] = "hootfighter";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[16]] = "enabled";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[17]] = "\n[Plugin] Plugin shut down\n";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[22]] = "Vanstrom Klause";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[24]] = "Handle bloodveld";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[26]] = "Wield";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[27]] = "Attack";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[28]] = "Vanstrom Klause";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[29]] = "Vanstrom Klause";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[30]] = "Attack";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[31]] = "Vanstrom Klause";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[32]] = "Attack";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[33]] = "Vanstrom Klause";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[18]] = "Attack";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[34]] = "Vanstrom Klause";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[35]] = "Attack";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[36]] = "lightning pos1;";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[37]] = "lightning pos2;";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[38]] = "lightning pos2;";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[39]] = "tell the king";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[40]] = "another clue scroll";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[41]] = "a new clue";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[42]] = "I could tell by the cut of your jib";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[43]] = "You haven't got enough";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[44]] = "Not enough gold for buying";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[45]] = "Oh dear, you are dead!";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[46]] = "We DIED!! :(";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[47]] = "Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[48]] = "We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[49]] = "can't reach that";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[50]] = "Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[51]] = "Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[52]] = "Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[53]] = "Tree Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[54]] = "Tree Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[55]] = "Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[56]] = "think that facing North";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[59]] = "already some rum";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[61]] = "Drop";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[62]] = "can't reach that";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[63]] = "can't reach that";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[66]] = "Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[67]] = "Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[68]] = "Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[69]] = "Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[70]] = "Tree Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[3]] = "Tree Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[71]] = "Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[72]] = "think that facing North";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[73]] = "already some rum";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[74]] = "Drop";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[75]] = "fail to pick";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[76]] = "spots you before you manage to open the chest";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[77]] = "You search the chest, but find nothing.";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[81]] = "door is locked";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[2]] = "Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[80]] = "Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[85]] = "Door";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[86]] = "Open";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[87]] = "Burning";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[88]] = "Burning";
        AccBuilderSotf.llIllIIIll[AccBuilderSotf.llIllIIlII[89]] = AccBuilderSotf.lIllIlIllIlll("75f/ETg4Tl0=", "AJLLw");
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
        acArray[AccBuilderSotf.llIllIIlII[4]] = new ANHelper();
        o = acArray;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        TileObject var10;
        WorldPoint var11;
        void var12;
        if (AccBuilderSotf.lIllIlIlllllI(chatMessage.getMessage().contains(llIllIIIll[llIllIIlII[43]]) ? 1 : 0)) {
            System.out.println(llIllIIIll[llIllIIlII[44]]);
            d = llIllIIlII[5];
        }
        if (AccBuilderSotf.lIllIlIlllllI(var12.getMessage().contains(llIllIIIll[llIllIIlII[45]]) ? 1 : 0)) {
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
        if (AccBuilderSotf.lIllIlIlllllI(var12.getMessage().contains(llIllIIIll[llIllIIlII[49]]) ? 1 : 0) && AccBuilderSotf.lIllIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(V.mh), llIllIIlII[22])) {
            String[] stringArray = new String[llIllIIlII[5]];
            stringArray[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[50]];
            if (AccBuilderSotf.lIllIlIllllII(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[llIllIIlII[5]];
                stringArray2[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[51]];
                TileObjects.getNearest((String[])stringArray2).interact(llIllIIIll[llIllIIlII[52]]);
                Time.sleepTicks((int)llIllIIlII[11]);

            }
            String[] stringArray3 = new String[llIllIIlII[5]];
            stringArray3[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[53]];
            if (AccBuilderSotf.lIllIlIllllII(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[llIllIIlII[5]];
                stringArray4[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[54]];
                TileObjects.getNearest((String[])stringArray4).interact(llIllIIIll[llIllIIlII[55]]);
                Time.sleepTicks((int)llIllIIlII[10]);

            }
        }
        if (AccBuilderSotf.lIllIlIlllllI(var12.getMessage().contains(llIllIIIll[llIllIIlII[56]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llIllIIlII[57], llIllIIlII[58], llIllIIlII[4]));

            Time.sleepTicks((int)llIllIIlII[5]);

        }
        if (AccBuilderSotf.lIllIlIlllllI(var12.getMessage().contains(llIllIIIll[llIllIIlII[59]]) ? 1 : 0)) {
            int[] nArray = new int[llIllIIlII[5]];
            nArray[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[60];
            if (AccBuilderSotf.lIllIlIlllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIllIIlII[5]];
                nArray2[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[60];
                Inventory.getFirst((int[])nArray2).interact(llIllIIIll[llIllIIlII[61]]);
            }
        }
        if (AccBuilderSotf.lIllIlIlllllI(var12.getMessage().contains(llIllIIIll[llIllIIlII[62]]) ? 1 : 0) && AccBuilderSotf.lIllIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(z.eb), llIllIIlII[22])) {
            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.x();
        }
        if (!(!AccBuilderSotf.lIllIlIlllllI(var12.getMessage().contains(llIllIIIll[llIllIIlII[63]]) ? 1 : 0) || AccBuilderSotf.lIllIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(o.c.k.i.-.l.o.f.-.n.c.t.e.s.u.df), llIllIIlII[22]) && AccBuilderSotf.lIllIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(o.c.k.i.-.l.o.f.-.n.c.t.e.s.u.dh), llIllIIlII[22]) && AccBuilderSotf.lIllIllIIIIII(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(llIllIIlII[64], llIllIIlII[65], llIllIIlII[4])), llIllIIlII[15]) && !AccBuilderSotf.lIllIllIIIIIl(Players.getLocal().getWorldLocation().distanceTo(V.mh), llIllIIlII[22]))) {
            var11 = new WorldPoint(llIllIIlII[64], llIllIIlII[65], llIllIIlII[4]);
            var10 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (AccBuilderSotf.lIllIlIlllllI(tileObject.getName().contains(llIllIIIll[llIllIIlII[85]]) ? 1 : 0)) {
                    String[] stringArray = new String[llIllIIlII[5]];
                    stringArray[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[86]];
                    if (AccBuilderSotf.lIllIlIlllllI(tileObject.hasAction(stringArray) ? 1 : 0) && AccBuilderSotf.lIllIllIIIIIl(tileObject.getWorldLocation().distanceTo(var11), llIllIIlII[9])) {
                        n2 = llIllIIlII[5];

                        if (-1 < 1) return n2 != 0;
                        return ((0xA4 ^ 0x9D ^ (0xB ^ 0x3B)) & (0x9A ^ 0xC4 ^ (0x68 ^ 0x3F) ^ -1)) != 0;
                    }
                }
                n2 = llIllIIlII[4];
                return n2 != 0;
            });
            if (AccBuilderSotf.lIllIlIllllII(var10)) {
                var10.interact(llIllIIIll[llIllIIlII[66]]);
                Time.sleepTicks((int)llIllIIlII[13]);

            }
            String[] stringArray = new String[llIllIIlII[5]];
            stringArray[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[67]];
            if (AccBuilderSotf.lIllIlIllllII(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray5 = new String[llIllIIlII[5]];
                stringArray5[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[68]];
                TileObjects.getNearest((String[])stringArray5).interact(llIllIIIll[llIllIIlII[69]]);
                Time.sleepTicks((int)llIllIIlII[11]);

            }
            String[] stringArray6 = new String[llIllIIlII[5]];
            stringArray6[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[70]];
            if (AccBuilderSotf.lIllIlIllllII(TileObjects.getNearest((String[])stringArray6))) {
                String[] stringArray7 = new String[llIllIIlII[5]];
                stringArray7[AccBuilderSotf.llIllIIlII[4]] = llIllIIIll[llIllIIlII[3]];
                TileObjects.getNearest((String[])stringArray7).interact(llIllIIIll[llIllIIlII[71]]);
                Time.sleepTicks((int)llIllIIlII[10]);

            }
        }
        if (AccBuilderSotf.lIllIlIlllllI(var12.getMessage().contains(llIllIIIll[llIllIIlII[72]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(llIllIIlII[57], llIllIIlII[58], llIllIIlII[4]));

            Time.sleepTicks((int)llIllIIlII[5]);

        }
        if (AccBuilderSotf.lIllIlIlllllI(var12.getMessage().contains(llIllIIIll[llIllIIlII[73]]) ? 1 : 0)) {
            int[] nArray = new int[llIllIIlII[5]];
            nArray[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[60];
            if (AccBuilderSotf.lIllIlIlllllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[llIllIIlII[5]];
                nArray3[AccBuilderSotf.llIllIIlII[4]] = llIllIIlII[60];
                Inventory.getFirst((int[])nArray3).interact(llIllIIIll[llIllIIlII[74]]);
            }
        }
        if (AccBuilderSotf.lIllIlIlllllI(var12.getMessage().contains(llIllIIIll[llIllIIlII[75]]) ? 1 : 0)) {
            // empty if block
        }
        if (AccBuilderSotf.lIllIlIlllllI(var12.getMessage().contains(llIllIIIll[llIllIIlII[76]]) ? 1 : 0)) {
            // empty if block
        }
        if (AccBuilderSotf.lIllIlIlllllI(var12.getMessage().contains(llIllIIIll[llIllIIlII[77]]) ? 1 : 0)) {
            // empty if block
        }
        var11 = new WorldArea(llIllIIlII[78], llIllIIlII[79], llIllIIlII[80], llIllIIlII[76], llIllIIlII[4]);
        if (AccBuilderSotf.lIllIlIlllllI(var12.getMessage().contains(llIllIIIll[llIllIIlII[81]]) ? 1 : 0) && AccBuilderSotf.lIllIlIlllllI(var11.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && AccBuilderSotf.lIllIlIllllII(var10 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (AccBuilderSotf.lIllIlIlllllI(tileObject.getName().contains(llIllIIIll[llIllIIlII[80]]) ? 1 : 0) && AccBuilderSotf.lIllIllIIIIII(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), llIllIIlII[5])) {
                n2 = llIllIIlII[5];

            } else {
                n2 = llIllIIlII[4];
            }
            return n2 != 0;
        }))) {
            var10.interact(llIllIIIll[llIllIIlII[2]]);
            Time.sleepTicks((int)llIllIIlII[16]);

        }
    }

    private static boolean lIllIllIIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();

        d = llIllIIlII[4];
        System.out.print(llIllIIIll[llIllIIlII[13]]);
        this.u.add((Overlay)this.v);

        a.clear();
        System.out.println(llIllIIIll[llIllIIlII[14]]);
        a.clear();
        t[] tArray = new t[llIllIIlII[5]];
        tArray[AccBuilderSotf.llIllIIlII[4]] = new THelper();
        Collections.addAll(a, tArray);

        g = System.currentTimeMillis();
        Collections.shuffle(a);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GraphicsObjectCreated graphicsObjectCreated) {
        if (!AccBuilderSotf.lIllIllIIIlII(graphicsObjectCreated.getGraphicsObject().getId(), llIllIIlII[82]) || !AccBuilderSotf.lIllIllIIIlII(graphicsObjectCreated.getGraphicsObject().getId(), llIllIIlII[83]) || AccBuilderSotf.lIllIlIllllll(graphicsObjectCreated.getGraphicsObject().getId(), llIllIIlII[84])) {
            void var13;
            AccBuilderSotf var14;
            if (AccBuilderSotf.lIllIlIlllIll(L.gm ? 1 : 0)) {
                L.gm = llIllIIlII[5];
            }
            i.put(WorldPoint.fromLocal((Client)var14.t, (LocalPoint)var13.getGraphicsObject().getLocation()), llIllIIlII[11]);

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
            AccBuilderSotf var15;
            o.c.k.i.-.l.o.f.-.n.c.t.e.s.e.a(var15.r, "rsn: " + k + " account has been banned? - Acc builder SOTF");
            n += llIllIIlII[5];
        }
    }

    private static boolean lIllIlIllllII(Object object) {
        return object != null;
    }

    public AccBuilderSotf() {
        this.q = new WorldArea(llIllIIlII[0], llIllIIlII[1], llIllIIlII[2], llIllIIlII[3], llIllIIlII[4]);
        this.r = llIllIIIll[llIllIIlII[4]];
    }

    @Subscribe
    private void a(InventoryChanged inventoryChanged) {
        if (AccBuilderSotf.lIllIlIlllIlI(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_REMOVED)) {
            return;
        }
    }

    private static boolean lIllIlIlllIll(int n2) {
        return n2 == 0;
    }
}

