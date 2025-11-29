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
import gg.squire.sotf.framework.GameStateUtil;
import gg.squire.sotf.framework.Constants;
import gg.squire.account.BuilderConfig;
import gg.squire.account.GodsApi.overlay.BuilderInfoBox;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
import gg.squire.account.7c1d3521-d222-494e-8c51-697efca0674bManager;
import gg.squire.account.7c1d3521-d222-494e-8c51-697efca0674bManager;
import gg.squire.account.7c1d3521-d222-494e-8c51-697efca0674bManager;
import gg.squire.account.7c1d3521-d222-494e-8c51-697efca0674bManager;
import gg.squire.account.7c1d3521-d222-494e-8c51-697efca0674bManager;
import gg.squire.account.7c1d3521-d222-494e-8c51-697efca0674bManager;
import gg.squire.account.7c1d3521-d222-494e-8c51-697efca0674bManager;
import gg.squire.account.7c1d3521-d222-494e-8c51-697efca0674bManager;
import gg.squire.account.7c1d3521-d222-494e-8c51-697efca0674bManager;
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
            AccBuilderSotf var3;
            block29: {
                GameStateUtil.closeEnterAmountWidget();
                int n3 = Game.getWildyLevel();
                Player player = Players.getLocal();
                int n4 = player.getCombatLevel();
                Player player3 = Players.getNearest(player2 -> {
                    int n4;
                    if (AccBuilderSotf.var4(player2, player) && AccBuilderSotf.var5(this.a(n3, n4, (Player)player2) ? 1 : 0)) {
                        n4 = var1[5];
                        0;
                        if ((7 ^ 0x4D ^ (5 ^ 0x4B)) < 1) {
                            return ((0xCB ^ 0xBF ^ (0x76 ^ 0x32)) & (0x92 ^ 0x8A ^ (0x41 ^ 0x69) ^ -1)) != 0;
                        }
                    } else {
                        n4 = var1[4];
                    }
                    return n4 != 0;
                });
                if (!AccBuilderSotf.var6(player3) || AccBuilderSotf.var7(Game.getWildyLevel()) && !AccBuilderSotf.var8(Players.getLocal().getWorldLocation().distanceTo(aD.pf), var1[18])) break block28;
                int[] nArray = new int[var1[5]];
                nArray[AccBuilderSotf.var1[4]] = var1[19];
                if (!AccBuilderSotf.var9(Inventory.contains((int[])nArray) ? 1 : 0)) break block29;
                int[] nArray2 = new int[var1[5]];
                nArray2[AccBuilderSotf.var1[4]] = var1[20];
                if (!AccBuilderSotf.var5(Inventory.contains((int[])nArray2) ? 1 : 0)) break block28;
            }
            if (AccBuilderSotf.var9(var3.q.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                Game.logout();
            }
        }
        if (AccBuilderSotf.var10(Vars.getBit((int)QuestVarbits.QUEST_SINS_OF_THE_FATHER.getId()), var1[21])) {
            String[] stringArray = new String[var1[5]];
            stringArray[AccBuilderSotf.var1[4]] = var2[var1[22]];
            if (AccBuilderSotf.var6(NPCs.getNearest((String[])stringArray))) {
                int[] nArray = new int[var1[5]];
                nArray[AccBuilderSotf.var1[4]] = var1[23];
                if (AccBuilderSotf.var6(NPCs.getNearest((int[])nArray))) {
                    int[] nArray3 = new int[var1[5]];
                    nArray3[AccBuilderSotf.var1[4]] = var1[23];
                    if (AccBuilderSotf.var9(NPCs.getNearest((int[])nArray3).isDead() ? 1 : 0)) {
                        c = var2[var1[24]];
                        int[] nArray4 = new int[var1[5]];
                        nArray4[AccBuilderSotf.var1[4]] = var1[25];
                        if (AccBuilderSotf.var9(Equipment.contains((int[])nArray4) ? 1 : 0)) {
                            int[] nArray5 = new int[var1[5]];
                            nArray5[AccBuilderSotf.var1[4]] = var1[25];
                            Inventory.getFirst((int[])nArray5).interact(var2[var1[26]]);
                        }
                        int[] nArray6 = new int[var1[5]];
                        nArray6[AccBuilderSotf.var1[4]] = var1[25];
                        if (AccBuilderSotf.var5(Equipment.contains((int[])nArray6) ? 1 : 0)) {
                            int[] nArray7 = new int[var1[5]];
                            nArray7[AccBuilderSotf.var1[4]] = var1[23];
                            NPCs.getNearest((int[])nArray7).interact(var2[var1[27]]);
                            Movement.walkTo((WorldPoint)new WorldPoint(L.gn.getX() - var1[11], L.gn.getY() + var1[11], var1[4]));
                            0;
                        }
                    }
                }
                if (AccBuilderSotf.var5(i.containsKey(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                    WorldPoint var11;
                    WorldPoint var12;
                    WorldPoint var13;
                    WorldPoint var14;
                    if (AccBuilderSotf.var5(L.gm)) {
                        String[] stringArray2 = new String[var1[5]];
                        stringArray2[AccBuilderSotf.var1[4]] = var2[var1[28]];
                        var14 = NPCs.getNearest((String[])stringArray2).getWorldLocation();
                        var13 = new WorldPoint(var14.getX(), var14.getY() + var1[5], var14.getPlane());
                        var12 = new WorldPoint(var14.getX(), var14.getY() - var1[5], var14.getPlane());
                        var11 = new WorldPoint(var14.getX() + var1[5], var14.getY(), var14.getPlane());
                        WorldPoint var15 = new WorldPoint(var14.getX() - var1[5], var14.getY(), var14.getPlane());
                        if (AccBuilderSotf.var9(i.containsKey(var13) ? 1 : 0)) {
                            GameStateUtil.clickTile(var13);
                            Time.sleepTicks((int)var1[5]);
                            0;
                            if (AccBuilderSotf.var16(Players.getLocal().getInteracting())) {
                                String[] stringArray3 = new String[var1[5]];
                                stringArray3[AccBuilderSotf.var1[4]] = var2[var1[29]];
                                NPCs.getNearest((String[])stringArray3).interact(var2[var1[30]]);
                            }
                            return;
                        }
                        if (AccBuilderSotf.var5(i.containsKey(var13) ? 1 : 0) && AccBuilderSotf.var9(i.containsKey(var12) ? 1 : 0)) {
                            GameStateUtil.clickTile(var12);
                            Time.sleepTicks((int)var1[5]);
                            0;
                            if (AccBuilderSotf.var16(Players.getLocal().getInteracting())) {
                                String[] stringArray4 = new String[var1[5]];
                                stringArray4[AccBuilderSotf.var1[4]] = var2[var1[31]];
                                NPCs.getNearest((String[])stringArray4).interact(var2[var1[32]]);
                            }
                            return;
                        }
                        if (AccBuilderSotf.var5(i.containsKey(var13) ? 1 : 0) && AccBuilderSotf.var5(i.containsKey(var12) ? 1 : 0) && AccBuilderSotf.var9(i.containsKey(var11) ? 1 : 0)) {
                            GameStateUtil.clickTile(var11);
                            Time.sleepTicks((int)var1[5]);
                            0;
                            if (AccBuilderSotf.var16(Players.getLocal().getInteracting())) {
                                String[] stringArray5 = new String[var1[5]];
                                stringArray5[AccBuilderSotf.var1[4]] = var2[var1[33]];
                                NPCs.getNearest((String[])stringArray5).interact(var2[var1[18]]);
                            }
                            return;
                        }
                        if (AccBuilderSotf.var5(i.containsKey(var13) ? 1 : 0) && AccBuilderSotf.var5(i.containsKey(var12) ? 1 : 0) && AccBuilderSotf.var5(i.containsKey(var11) ? 1 : 0) && AccBuilderSotf.var9(i.containsKey(var15) ? 1 : 0)) {
                            GameStateUtil.clickTile(var15);
                            Time.sleepTicks((int)var1[5]);
                            0;
                            if (AccBuilderSotf.var16(Players.getLocal().getInteracting())) {
                                String[] stringArray6 = new String[var1[5]];
                                stringArray6[AccBuilderSotf.var1[4]] = var2[var1[34]];
                                NPCs.getNearest((String[])stringArray6).interact(var2[var1[35]]);
                            }
                            return;
                        }
                    }
                    if (AccBuilderSotf.var9(L.gm)) {
                        var14 = Players.getLocal().getWorldLocation();
                        var13 = new WorldPoint(var14.getX() + var1[5], var14.getWorldY(), var1[4]);
                        var12 = new WorldPoint(var14.getX(), var14.getWorldY() + var1[5], var1[4]);
                        var11 = new WorldPoint(var14.getX() + var1[5], var14.getWorldY() + var1[5], var1[4]);
                        if (AccBuilderSotf.var9(i.containsKey(var13) ? 1 : 0)) {
                            c = var2[var1[36]];
                            Movement.walkTo((WorldPoint)var13);
                            0;
                        }
                        if (AccBuilderSotf.var9(i.containsKey(var12) ? 1 : 0) && AccBuilderSotf.var9(Players.getLocal().getWorldLocation().equals((Object)var13) ? 1 : 0)) {
                            c = var2[var1[37]];
                            Movement.walkTo((WorldPoint)var12);
                            0;
                        }
                        if (AccBuilderSotf.var9(i.containsKey(var11) ? 1 : 0) && AccBuilderSotf.var9(Players.getLocal().getWorldLocation().equals((Object)var13) ? 1 : 0) && AccBuilderSotf.var9(Players.getLocal().getWorldLocation().equals((Object)var12) ? 1 : 0)) {
                            c = var2[var1[38]];
                            Movement.walkTo((WorldPoint)var11);
                            0;
                        }
                    }
                }
            }
        }
        if (AccBuilderSotf.var5(Dialog.isOpen() ? 1 : 0) && AccBuilderSotf.var6(Dialog.getText())) {
            if (AccBuilderSotf.var5(Dialog.getText().contains(var2[var1[39]]) ? 1 : 0)) {
                H.ga = var1[5];
            }
            if (!AccBuilderSotf.var9(Dialog.getText().contains(var2[var1[40]]) ? 1 : 0) || AccBuilderSotf.var5(Dialog.getText().contains(var2[var1[41]]) ? 1 : 0)) {
                // empty if block
            }
            if (AccBuilderSotf.var5(Dialog.getText().contains(var2[var1[42]]) ? 1 : 0)) {
                // empty if block
            }
        }
        i.forEach((worldPoint, n2) -> {
            i.put((WorldPoint)worldPoint, n2 - var1[5]);
            0;
        });
        i.entrySet().removeIf(entry -> {
            boolean bl;
            if (AccBuilderSotf.var7((Integer)entry.getValue())) {
                bl = var1[5];
                0;
                if (3 == (0x6D ^ 0x69)) {
                    return ((0xB1 ^ 0x8D) & ~(0xB0 ^ 0x8C)) != 0;
                }
            } else {
                bl = var1[4];
            }
            return bl;
        });
        0;
        GameStateUtil.clickInterfaceButton();
    }

    private static boolean var10(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var7(int n2) {
        return n2 <= 0;
    }

    public boolean a(int n2, int n3, Player player) {
        int n4;
        int n5 = player.getCombatLevel();
        int n6 = n3 - n2;
        int n7 = n3 + n2;
        if (AccBuilderSotf.var17(n5, n6) && AccBuilderSotf.var8(n5, n7)) {
            n4 = var1[5];
            0;
            if null != null {
                return ((0x95 ^ 0xC6 ^ (0xE8 ^ 0x9E)) & (63 + 164 - 68 + 18 ^ 15 + 111 - 3 + 25 ^ -1)) != 0;
            }
        } else {
            n4 = var1[4];
        }
        return n4 != 0;
    }

    @Provides
    public BuilderConfig a(ConfigManager configManager) {
        return (BuilderConfig)configManager.getConfig(BuilderConfig.class);
    }

    @Subscribe
    private void a(ConfigChanged configChanged) {
        if (AccBuilderSotf.var5(configChanged.getGroup().equalsIgnoreCase(var2[var1[15]]) ? 1 : 0) && AccBuilderSotf.var5(configChanged.getKey().contains(var2[var1[16]]) ? 1 : 0)) {
            this.s = this.p.turnScriptOnOff();
            if (AccBuilderSotf.var5(this.s)) {
                d = var1[4];
                0;
                if (2 < 0) {
                    return;
                }
            } else {
                d = var1[5];
            }
        }
    }

    private static boolean var16(Object object) {
        return object == null;
    }

    private static boolean var17(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    protected void shutDown() {
        this.u.remove((Overlay)this.v);
        0;
        d = var1[5];
        o = new ac[var1[4]];
        L.gn = null;
        n = var1[4];
        f = var1[4];
        System.out.print(var2[var1[17]]);
        super.stop();
    }

    private static boolean var18(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var19(int n2, int n3) {
        return n2 < n3;
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var1[4];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var1[4];
        while (AccBuilderSotf.var19(var28, var27)) {
            char var29 = var26[var28];
            var23.append((char)(var29 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var23);
    }

    protected int loop() {
        block10: {
            block11: {
                if (!AccBuilderSotf.var30(Game.getState(), GameState.LOGGED_IN)) break block10;
                if (!AccBuilderSotf.var9(a.isEmpty() ? 1 : 0)) break block11;
                if (!AccBuilderSotf.var6(j) || AccBuilderSotf.var16(k)) {
                    k = Players.getLocal().getName();
                }
                k = Players.getLocal().getName();
                if (AccBuilderSotf.var5(a.get(var1[4]).ah() ? 1 : 0)) {
                    if (AccBuilderSotf.var5(a.get(var1[4]).ag().contains(var2[var1[5]]) ? 1 : 0)) {
                        f += var1[5];
                    }
                    System.out.println("Achieved " + a.get(var1[4]).ag() + " goal");
                    a.remove(var1[4]);
                    0;
                    return var1[6];
                }
                if (!AccBuilderSotf.var30(Game.getState(), GameState.LOGGED_IN)) break block11;
                while (AccBuilderSotf.var5(GameStateUtil.isGrandExchangeWarningEnabled() ? 1 : 0) && AccBuilderSotf.var9(d) && AccBuilderSotf.var10(GameStateUtil.getVarbit(var1[7]), var1[8]) && AccBuilderSotf.var9(Dialog.isOpen() ? 1 : 0)) {
                    c = var2[var1[9]];
                    GameStateUtil.disableGrandExchangeWarning();
                    Time.sleepTicks((int)var1[5]);
                    0;
                    0;
                    if ((0xBD ^ 0xB8) != 0) continue;
                    return (0x52 ^ 0x4F) & ~(0x76 ^ 0x6B);
                }
                int var31 = var1[4];
                try {
                    var31 = a.get(var1[4]).af();
                    0;
                }
                catch (Exception var32) {
                    var32.printStackTrace();
                }
                if (-1 >= (0x30 ^ 0x3A ^ (0xA1 ^ 0xAF))) {
                    return (0x35 ^ 0x30 ^ (0xD0 ^ 0xB4)) & (0x46 ^ 0x6B ^ (0x63 ^ 0x2F) ^ -1);
                }
                return var31;
            }
            if (AccBuilderSotf.var5(a.isEmpty() ? 1 : 0)) {
                if (AccBuilderSotf.var33(Players.getLocal().getWorldLocation().distanceTo(aN.pW), var1[10])) {
                    c = var2[var1[10]];
                    Movement.walkTo((WorldPoint)aN.pW);
                    0;
                }
                if (AccBuilderSotf.var8(Players.getLocal().getWorldLocation().distanceTo(aN.pW), var1[10])) {
                    c = var2[var1[11]];
                }
            }
        }
        return var1[12];
    }

    private static boolean var30(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var4(Object object, Object object2) {
        return object != object2;
    }

    private static void var34() {
        var2 = new String[var1[90]];
        AccBuilderSotf.var2[AccBuilderSotf.var1[4]] = "https://discord.com/api/webhooks/1215418698408525957/f_b1MXw4fCg6qsHKLguNMRnCRHVtAVsvyx7SPIY6Ce9Z1zYvmlDIQLyOD9qIsQ-fYTKf";
        AccBuilderSotf.var2[AccBuilderSotf.var1[5]] = "quest";
        AccBuilderSotf.var2[AccBuilderSotf.var1[9]] = "Disabling GE warning";
        AccBuilderSotf.var2[AccBuilderSotf.var1[10]] = "Navigating to GE";
        AccBuilderSotf.var2[AccBuilderSotf.var1[11]] = "Finished account";
        AccBuilderSotf.var2[AccBuilderSotf.var1[13]] = "\n[Plugin] Plugin starting up\n";
        AccBuilderSotf.var2[AccBuilderSotf.var1[14]] = "Switching to One Click Sotf account";
        AccBuilderSotf.var2[AccBuilderSotf.var1[15]] = "hootfighter";
        AccBuilderSotf.var2[AccBuilderSotf.var1[16]] = "enabled";
        AccBuilderSotf.var2[AccBuilderSotf.var1[17]] = "\n[Plugin] Plugin shut down\n";
        AccBuilderSotf.var2[AccBuilderSotf.var1[22]] = "Vanstrom Klause";
        AccBuilderSotf.var2[AccBuilderSotf.var1[24]] = "Handle bloodveld";
        AccBuilderSotf.var2[AccBuilderSotf.var1[26]] = "Wield";
        AccBuilderSotf.var2[AccBuilderSotf.var1[27]] = "Attack";
        AccBuilderSotf.var2[AccBuilderSotf.var1[28]] = "Vanstrom Klause";
        AccBuilderSotf.var2[AccBuilderSotf.var1[29]] = "Vanstrom Klause";
        AccBuilderSotf.var2[AccBuilderSotf.var1[30]] = "Attack";
        AccBuilderSotf.var2[AccBuilderSotf.var1[31]] = "Vanstrom Klause";
        AccBuilderSotf.var2[AccBuilderSotf.var1[32]] = "Attack";
        AccBuilderSotf.var2[AccBuilderSotf.var1[33]] = "Vanstrom Klause";
        AccBuilderSotf.var2[AccBuilderSotf.var1[18]] = "Attack";
        AccBuilderSotf.var2[AccBuilderSotf.var1[34]] = "Vanstrom Klause";
        AccBuilderSotf.var2[AccBuilderSotf.var1[35]] = "Attack";
        AccBuilderSotf.var2[AccBuilderSotf.var1[36]] = "lightning pos1;";
        AccBuilderSotf.var2[AccBuilderSotf.var1[37]] = "lightning pos2;";
        AccBuilderSotf.var2[AccBuilderSotf.var1[38]] = "lightning pos2;";
        AccBuilderSotf.var2[AccBuilderSotf.var1[39]] = "tell the king";
        AccBuilderSotf.var2[AccBuilderSotf.var1[40]] = "another clue scroll";
        AccBuilderSotf.var2[AccBuilderSotf.var1[41]] = "a new clue";
        AccBuilderSotf.var2[AccBuilderSotf.var1[42]] = "I could tell by the cut of your jib";
        AccBuilderSotf.var2[AccBuilderSotf.var1[43]] = "You haven't got enough";
        AccBuilderSotf.var2[AccBuilderSotf.var1[44]] = "Not enough gold for buying";
        AccBuilderSotf.var2[AccBuilderSotf.var1[45]] = "Oh dear, you are dead!";
        AccBuilderSotf.var2[AccBuilderSotf.var1[46]] = "We DIED!! :(";
        AccBuilderSotf.var2[AccBuilderSotf.var1[47]] = "Died - Ending script: Please report what quest it died on and location,step if you saw";
        AccBuilderSotf.var2[AccBuilderSotf.var1[48]] = "We died during or after prayer, should be continuing script, report if you see this and it wasn't during or right after prayer";
        AccBuilderSotf.var2[AccBuilderSotf.var1[49]] = "can't reach that";
        AccBuilderSotf.var2[AccBuilderSotf.var1[50]] = "Door";
        AccBuilderSotf.var2[AccBuilderSotf.var1[51]] = "Door";
        AccBuilderSotf.var2[AccBuilderSotf.var1[52]] = "Open";
        AccBuilderSotf.var2[AccBuilderSotf.var1[53]] = "Tree Door";
        AccBuilderSotf.var2[AccBuilderSotf.var1[54]] = "Tree Door";
        AccBuilderSotf.var2[AccBuilderSotf.var1[55]] = "Open";
        AccBuilderSotf.var2[AccBuilderSotf.var1[56]] = "think that facing North";
        AccBuilderSotf.var2[AccBuilderSotf.var1[59]] = "already some rum";
        AccBuilderSotf.var2[AccBuilderSotf.var1[61]] = "Drop";
        AccBuilderSotf.var2[AccBuilderSotf.var1[62]] = "can't reach that";
        AccBuilderSotf.var2[AccBuilderSotf.var1[63]] = "can't reach that";
        AccBuilderSotf.var2[AccBuilderSotf.var1[66]] = "Open";
        AccBuilderSotf.var2[AccBuilderSotf.var1[67]] = "Door";
        AccBuilderSotf.var2[AccBuilderSotf.var1[68]] = "Door";
        AccBuilderSotf.var2[AccBuilderSotf.var1[69]] = "Open";
        AccBuilderSotf.var2[AccBuilderSotf.var1[70]] = "Tree Door";
        AccBuilderSotf.var2[AccBuilderSotf.var1[3]] = "Tree Door";
        AccBuilderSotf.var2[AccBuilderSotf.var1[71]] = "Open";
        AccBuilderSotf.var2[AccBuilderSotf.var1[72]] = "think that facing North";
        AccBuilderSotf.var2[AccBuilderSotf.var1[73]] = "already some rum";
        AccBuilderSotf.var2[AccBuilderSotf.var1[74]] = "Drop";
        AccBuilderSotf.var2[AccBuilderSotf.var1[75]] = "fail to pick";
        AccBuilderSotf.var2[AccBuilderSotf.var1[76]] = "spots you before you manage to open the chest";
        AccBuilderSotf.var2[AccBuilderSotf.var1[77]] = "You search the chest, but find nothing.";
        AccBuilderSotf.var2[AccBuilderSotf.var1[81]] = "door is locked";
        AccBuilderSotf.var2[AccBuilderSotf.var1[2]] = "Open";
        AccBuilderSotf.var2[AccBuilderSotf.var1[80]] = "Door";
        AccBuilderSotf.var2[AccBuilderSotf.var1[85]] = "Door";
        AccBuilderSotf.var2[AccBuilderSotf.var1[86]] = "Open";
        AccBuilderSotf.var2[AccBuilderSotf.var1[87]] = "Burning";
        AccBuilderSotf.var2[AccBuilderSotf.var1[88]] = "Burning";
        AccBuilderSotf.var2[AccBuilderSotf.var1[89]] = AccBuilderSotf.var35("75f/ETg4Tl0=", "AJLLw");
    }

    private static boolean var33(int n2, int n3) {
        return n2 > n3;
    }

    static {
        AccBuilderSotf.var36();
        AccBuilderSotf.var34();
        a = new ArrayList<ac>();
        b = System.currentTimeMillis();
        d = var1[4];
        g = System.currentTimeMillis();
        h = var2[var1[89]];
        i = new HashMap();
        j = null;
        k = null;
        m = Static.getClient().getDiscordId();
        ac[] acArray = new ac[var1[5]];
        acArray[AccBuilderSotf.var1[4]] = new 7c1d3521-d222-494e-8c51-697efca0674bManager();
        o = acArray;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        TileObject var37;
        WorldPoint var38;
        void var39;
        if (AccBuilderSotf.var5(chatMessage.getMessage().contains(var2[var1[43]]) ? 1 : 0)) {
            System.out.println(var2[var1[44]]);
            d = var1[5];
        }
        if (AccBuilderSotf.var5(var39.getMessage().contains(var2[var1[45]]) ? 1 : 0)) {
            System.out.println(var2[var1[46]]);
            if (AccBuilderSotf.var9(Game.getWildyLevel()) && AccBuilderSotf.var9(Inventory.contains(item -> item.getName().contains(var2[var1[88]])) ? 1 : 0)) {
                d = var1[5];
                System.out.println(var2[var1[47]]);
            }
            if (!AccBuilderSotf.var7(Game.getWildyLevel()) || AccBuilderSotf.var5(Inventory.contains(item -> item.getName().contains(var2[var1[87]])) ? 1 : 0)) {
                d = var1[4];
                System.out.println(var2[var1[48]]);
            }
        }
        if (AccBuilderSotf.var5(var39.getMessage().contains(var2[var1[49]]) ? 1 : 0) && AccBuilderSotf.var8(Players.getLocal().getWorldLocation().distanceTo(V.mh), var1[22])) {
            String[] stringArray = new String[var1[5]];
            stringArray[AccBuilderSotf.var1[4]] = var2[var1[50]];
            if (AccBuilderSotf.var6(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray2 = new String[var1[5]];
                stringArray2[AccBuilderSotf.var1[4]] = var2[var1[51]];
                TileObjects.getNearest((String[])stringArray2).interact(var2[var1[52]]);
                Time.sleepTicks((int)var1[11]);
                0;
            }
            String[] stringArray3 = new String[var1[5]];
            stringArray3[AccBuilderSotf.var1[4]] = var2[var1[53]];
            if (AccBuilderSotf.var6(TileObjects.getNearest((String[])stringArray3))) {
                String[] stringArray4 = new String[var1[5]];
                stringArray4[AccBuilderSotf.var1[4]] = var2[var1[54]];
                TileObjects.getNearest((String[])stringArray4).interact(var2[var1[55]]);
                Time.sleepTicks((int)var1[10]);
                0;
            }
        }
        if (AccBuilderSotf.var5(var39.getMessage().contains(var2[var1[56]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(var1[57], var1[58], var1[4]));
            0;
            Time.sleepTicks((int)var1[5]);
            0;
        }
        if (AccBuilderSotf.var5(var39.getMessage().contains(var2[var1[59]]) ? 1 : 0)) {
            int[] nArray = new int[var1[5]];
            nArray[AccBuilderSotf.var1[4]] = var1[60];
            if (AccBuilderSotf.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[var1[5]];
                nArray2[AccBuilderSotf.var1[4]] = var1[60];
                Inventory.getFirst((int[])nArray2).interact(var2[var1[61]]);
            }
        }
        if (AccBuilderSotf.var5(var39.getMessage().contains(var2[var1[62]]) ? 1 : 0) && AccBuilderSotf.var8(Players.getLocal().getWorldLocation().distanceTo(z.eb), var1[22])) {
            GameStateUtil.closeBankAndHopWorld();
        }
        if (!(!AccBuilderSotf.var5(var39.getMessage().contains(var2[var1[63]]) ? 1 : 0) || AccBuilderSotf.var33(Players.getLocal().getWorldLocation().distanceTo(Constants.df), var1[22]) && AccBuilderSotf.var33(Players.getLocal().getWorldLocation().distanceTo(Constants.dh), var1[22]) && AccBuilderSotf.var33(Players.getLocal().getWorldLocation().distanceTo(new WorldPoint(var1[64], var1[65], var1[4])), var1[15]) && !AccBuilderSotf.var8(Players.getLocal().getWorldLocation().distanceTo(V.mh), var1[22]))) {
            var38 = new WorldPoint(var1[64], var1[65], var1[4]);
            var37 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (AccBuilderSotf.var5(tileObject.getName().contains(var2[var1[85]]) ? 1 : 0)) {
                    String[] stringArray = new String[var1[5]];
                    stringArray[AccBuilderSotf.var1[4]] = var2[var1[86]];
                    if (AccBuilderSotf.var5(tileObject.hasAction(stringArray) ? 1 : 0) && AccBuilderSotf.var8(tileObject.getWorldLocation().distanceTo(var38), var1[9])) {
                        n2 = var1[5];
                        0;
                        if (-1 < 1) return n2 != 0;
                        return ((0xA4 ^ 0x9D ^ (0xB ^ 0x3B)) & (0x9A ^ 0xC4 ^ (0x68 ^ 0x3F) ^ -1)) != 0;
                    }
                }
                n2 = var1[4];
                return n2 != 0;
            });
            if (AccBuilderSotf.var6(var37)) {
                var37.interact(var2[var1[66]]);
                Time.sleepTicks((int)var1[13]);
                0;
            }
            String[] stringArray = new String[var1[5]];
            stringArray[AccBuilderSotf.var1[4]] = var2[var1[67]];
            if (AccBuilderSotf.var6(TileObjects.getNearest((String[])stringArray))) {
                String[] stringArray5 = new String[var1[5]];
                stringArray5[AccBuilderSotf.var1[4]] = var2[var1[68]];
                TileObjects.getNearest((String[])stringArray5).interact(var2[var1[69]]);
                Time.sleepTicks((int)var1[11]);
                0;
            }
            String[] stringArray6 = new String[var1[5]];
            stringArray6[AccBuilderSotf.var1[4]] = var2[var1[70]];
            if (AccBuilderSotf.var6(TileObjects.getNearest((String[])stringArray6))) {
                String[] stringArray7 = new String[var1[5]];
                stringArray7[AccBuilderSotf.var1[4]] = var2[var1[3]];
                TileObjects.getNearest((String[])stringArray7).interact(var2[var1[71]]);
                Time.sleepTicks((int)var1[10]);
                0;
            }
        }
        if (AccBuilderSotf.var5(var39.getMessage().contains(var2[var1[72]]) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(var1[57], var1[58], var1[4]));
            0;
            Time.sleepTicks((int)var1[5]);
            0;
        }
        if (AccBuilderSotf.var5(var39.getMessage().contains(var2[var1[73]]) ? 1 : 0)) {
            int[] nArray = new int[var1[5]];
            nArray[AccBuilderSotf.var1[4]] = var1[60];
            if (AccBuilderSotf.var5(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray3 = new int[var1[5]];
                nArray3[AccBuilderSotf.var1[4]] = var1[60];
                Inventory.getFirst((int[])nArray3).interact(var2[var1[74]]);
            }
        }
        if (AccBuilderSotf.var5(var39.getMessage().contains(var2[var1[75]]) ? 1 : 0)) {
            // empty if block
        }
        if (AccBuilderSotf.var5(var39.getMessage().contains(var2[var1[76]]) ? 1 : 0)) {
            // empty if block
        }
        if (AccBuilderSotf.var5(var39.getMessage().contains(var2[var1[77]]) ? 1 : 0)) {
            // empty if block
        }
        var38 = new WorldArea(var1[78], var1[79], var1[80], var1[76], var1[4]);
        if (AccBuilderSotf.var5(var39.getMessage().contains(var2[var1[81]]) ? 1 : 0) && AccBuilderSotf.var5(var38.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) && AccBuilderSotf.var6(var37 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (AccBuilderSotf.var5(tileObject.getName().contains(var2[var1[80]]) ? 1 : 0) && AccBuilderSotf.var33(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), var1[5])) {
                n2 = var1[5];
                0;
                if (-2 >= 0) {
                    return ((0x83 ^ 0x97 ^ (0xC5 ^ 0xB1)) & (76 + 159 - 108 + 88 ^ 42 + 182 - 151 + 110 ^ -1)) != 0;
                }
            } else {
                n2 = var1[4];
            }
            return n2 != 0;
        }))) {
            var37.interact(var2[var1[2]]);
            Time.sleepTicks((int)var1[16]);
            0;
        }
    }

    private static boolean var8(int n2, int n3) {
        return n2 <= n3;
    }

    public void onStart(String ... stringArray) {
        SquirePlugin.setGlobalMouseRecordings();
        0;
        d = var1[4];
        System.out.print(var2[var1[13]]);
        this.u.add((Overlay)this.v);
        0;
        a.clear();
        System.out.println(var2[var1[14]]);
        a.clear();
        t[] tArray = new t[var1[5]];
        tArray[AccBuilderSotf.var1[4]] = new 7c1d3521-d222-494e-8c51-697efca0674bManager();
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
        if (!AccBuilderSotf.var18(graphicsObjectCreated.getGraphicsObject().getId(), var1[82]) || !AccBuilderSotf.var18(graphicsObjectCreated.getGraphicsObject().getId(), var1[83]) || AccBuilderSotf.var10(graphicsObjectCreated.getGraphicsObject().getId(), var1[84])) {
            void var40;
            AccBuilderSotf var41;
            if (AccBuilderSotf.var9(L.gm)) {
                L.gm = var1[5];
            }
            i.put(WorldPoint.fromLocal((Client)var41.t, (LocalPoint)var40.getGraphicsObject().getLocation()), var1[11]);
            0;
            return;
        }
    }

    @Subscribe
    private void a(LoginStateChanged loginStateChanged) {
        int n2 = loginStateChanged.getIndex();
        if (AccBuilderSotf.var18(n2, var1[28])) {
            return;
        }
        if (AccBuilderSotf.var9(n)) {
            AccBuilderSotf var42;
            GameStateUtil.sendWebhook(var42.r, "rsn: " + k + " account has been banned? - Acc builder SOTF");
            n += var1[5];
        }
    }

        catch (Exception var48) {
            var48.printStackTrace();
            return null;
        }
    }

    private static boolean var6(Object object) {
        return object != null;
    }

    public AccBuilderSotf() {
        this.q = new WorldArea(var1[0], var1[1], var1[2], var1[3], var1[4]);
        this.r = var2[var1[4]];
    }

        catch (Exception var53) {
            var53.printStackTrace();
            return null;
        }
    }

    @Subscribe
    private void a(InventoryChanged inventoryChanged) {
        if (AccBuilderSotf.var30(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_REMOVED)) {
            return;
        }
    }

    private static void var36() {
        var1 = new int[91];
        AccBuilderSotf.var1[0] = -(0xFFFFD7CB & 0x39FD) & (0xFFFFBDEF & 0x5FFF);
        AccBuilderSotf.var1[1] = -(0xFFFFEF73 & 0x51BC) & (0xFFFFFFBF & 0x4F7F);
        AccBuilderSotf.var1[2] = 0x54 ^ 0x58 ^ (0xAF ^ 0x9D);
        AccBuilderSotf.var1[3] = 2 ^ 0x37;
        AccBuilderSotf.var1[4] = (0xFB ^ 0xC5) & ~(0x35 ^ 0xB);
        AccBuilderSotf.var1[5] = 1;
        AccBuilderSotf.var1[6] = 0x76 ^ 0x12;
        AccBuilderSotf.var1[7] = -(0xFFFFEFF7 & 0x76CB) & (0xFFFFE7DF & 0x7FFB);
        AccBuilderSotf.var1[8] = -(0xFFFFFA6F & 0x6D97) & (0xFFFFFBFF & 0x6FEE);
        AccBuilderSotf.var1[9] = 2;
        AccBuilderSotf.var1[10] = 3;
        AccBuilderSotf.var1[11] = 0x70 ^ 0x1C ^ (0x41 ^ 0x29);
        AccBuilderSotf.var1[12] = 0xFFFFB7FC & 0x4A5B;
        AccBuilderSotf.var1[13] = 0x64 ^ 0x61;
        AccBuilderSotf.var1[14] = 0x15 ^ 0x6C ^ 46 + 25 - 64 + 120;
        AccBuilderSotf.var1[15] = 0xB7 ^ 0x93 ^ (0x52 ^ 0x71);
        AccBuilderSotf.var1[16] = 0x86 ^ 0x8E;
        AccBuilderSotf.var1[17] = 0xEC ^ 0x84 ^ (0x5C ^ 0x3D);
        AccBuilderSotf.var1[18] = 0x7F ^ 0x6B;
        AccBuilderSotf.var1[19] = -(0xFFFFFF5D & 0x6CE7) & (0xFFFFEFDD & 0x7E7E);
        AccBuilderSotf.var1[20] = 0xFFFFBABF & 0x4759;
        AccBuilderSotf.var1[21] = 126 + 20 - 108 + 92;
        AccBuilderSotf.var1[22] = 0x62 ^ 0x68;
        AccBuilderSotf.var1[23] = 0xFFFFB7F7 & 0x6D6D;
        AccBuilderSotf.var1[24] = 0xC8 ^ 0xC3;
        AccBuilderSotf.var1[25] = -(0xFFFFDEE9 & 0x3D97) & (0xFFFFDFFF & 0x3FDF);
        AccBuilderSotf.var1[26] = 0xF ^ 3;
        AccBuilderSotf.var1[27] = 0xAB ^ 0xA6;
        AccBuilderSotf.var1[28] = 49 + 8 - -5 + 123 ^ 40 + 160 - 92 + 75;
        AccBuilderSotf.var1[29] = 0x4C ^ 0x5B ^ (0x1B ^ 3);
        AccBuilderSotf.var1[30] = 9 ^ 0x19;
        AccBuilderSotf.var1[31] = 0x5E ^ 0 ^ (0x68 ^ 0x27);
        AccBuilderSotf.var1[32] = 0x5B ^ 0x7D ^ (0xF2 ^ 0xC6);
        AccBuilderSotf.var1[33] = 0xF7 ^ 0xB2 ^ (0x55 ^ 3);
        AccBuilderSotf.var1[34] = 0x6D ^ 0x78;
        AccBuilderSotf.var1[35] = 0x74 ^ 0x62;
        AccBuilderSotf.var1[36] = 0x28 ^ 0x3F;
        AccBuilderSotf.var1[37] = 0xD2 ^ 0xC7 ^ (0x8A ^ 0x87);
        AccBuilderSotf.var1[38] = 0x18 ^ 1;
        AccBuilderSotf.var1[39] = 0x64 ^ 0x31 ^ (0x29 ^ 0x66);
        AccBuilderSotf.var1[40] = 0xA8 ^ 0xB3;
        AccBuilderSotf.var1[41] = 0x97 ^ 0x8B;
        AccBuilderSotf.var1[42] = 0x48 ^ 0x63 ^ (0x95 ^ 0xA3);
        AccBuilderSotf.var1[43] = 0x4D ^ 0x29 ^ (0x7A ^ 0);
        AccBuilderSotf.var1[44] = 0xDE ^ 0xC7 ^ (0x9C ^ 0x9A);
        AccBuilderSotf.var1[45] = 3 ^ 0x19 ^ (0x4E ^ 0x74);
        AccBuilderSotf.var1[46] = 168 + 172 - 174 + 21 ^ 113 + 17 - 103 + 127;
        AccBuilderSotf.var1[47] = 0x8B ^ 0xA9;
        AccBuilderSotf.var1[48] = 0xB8 ^ 0x9B;
        AccBuilderSotf.var1[49] = 11 + 114 - 74 + 77 ^ 113 + 161 - 240 + 130;
        AccBuilderSotf.var1[50] = 3 ^ (0xE0 ^ 0xC6);
        AccBuilderSotf.var1[51] = 60 + 9 - -13 + 72 ^ 113 + 64 - 58 + 69;
        AccBuilderSotf.var1[52] = 0x5C ^ 0x5A ^ (0x8B ^ 0xAA);
        AccBuilderSotf.var1[53] = 0x75 ^ 0x5D;
        AccBuilderSotf.var1[54] = 0x84 ^ 0xAD;
        AccBuilderSotf.var1[55] = 0x27 ^ 0xC ^ 1;
        AccBuilderSotf.var1[56] = 74 + 210 - 210 + 159 ^ 164 + 50 - 74 + 54;
        AccBuilderSotf.var1[57] = 0xFFFFCFE5 & 0x3BBB;
        AccBuilderSotf.var1[58] = 0xFFFFFDE7 & 0xEBF;
        AccBuilderSotf.var1[59] = 110 + 42 - 75 + 76 ^ 22 + 139 - 135 + 155;
        AccBuilderSotf.var1[60] = -(0xFFFFFAD7 & 0x3F39) & (0xFFFFBFFF & 0x7BBF);
        AccBuilderSotf.var1[61] = 0x52 ^ 0x7F;
        AccBuilderSotf.var1[62] = 0x52 ^ 0x7C;
        AccBuilderSotf.var1[63] = 0xBA ^ 0x95;
        AccBuilderSotf.var1[64] = -(0xFFFFBBD6 & 0x742D) & (0xFFFFBE2F & Short.MAX_VALUE);
        AccBuilderSotf.var1[65] = 0xFFFF9FFF & 0x6CB2;
        AccBuilderSotf.var1[66] = 0x6F ^ 0x11 ^ (0xF ^ 0x41);
        AccBuilderSotf.var1[67] = 0x7E ^ 0x2B ^ (0xD2 ^ 0xB6);
        AccBuilderSotf.var1[68] = 0x65 ^ 0x1F ^ (0x2E ^ 0x66);
        AccBuilderSotf.var1[69] = 0xC7 ^ 0x96 ^ (0x20 ^ 0x42);
        AccBuilderSotf.var1[70] = 0x88 ^ 0xBC;
        AccBuilderSotf.var1[71] = 0x14 ^ 0x22;
        AccBuilderSotf.var1[72] = 0x45 ^ 0x60 ^ (0x24 ^ 0x36);
        AccBuilderSotf.var1[73] = 5 ^ 0x1D ^ (0xA2 ^ 0x82);
        AccBuilderSotf.var1[74] = 0x3E ^ 7;
        AccBuilderSotf.var1[75] = 6 ^ 0x3C;
        AccBuilderSotf.var1[76] = 0x67 ^ 0x5C;
        AccBuilderSotf.var1[77] = 5 ^ 0x14 ^ (0x10 ^ 0x3D);
        AccBuilderSotf.var1[78] = 0xFFFFCE7F & 0x3BFF;
        AccBuilderSotf.var1[79] = 0xFFFFF7BF & 0x2DFF;
        AccBuilderSotf.var1[80] = 0x40 ^ 0x7F;
        AccBuilderSotf.var1[81] = 0x44 ^ 0x4A ^ (0x74 ^ 0x47);
        AccBuilderSotf.var1[82] = 0xFFFFAFE3 & 0x561C;
        AccBuilderSotf.var1[83] = 0xFFFFC7FF & 0x3DE2;
        AccBuilderSotf.var1[84] = 0xFFFFCDB7 & 0x37EE;
        AccBuilderSotf.var1[85] = 0x7B ^ 0x3B;
        AccBuilderSotf.var1[86] = 0x3D ^ 0x7C;
        AccBuilderSotf.var1[87] = 0xCE ^ 0x8C;
        AccBuilderSotf.var1[88] = 0x25 ^ 0x66;
        AccBuilderSotf.var1[89] = 0xCC ^ 0x88;
        AccBuilderSotf.var1[90] = 0x5A ^ 0x1F;
    }

    private static boolean var9(int n2) {
        return n2 == 0;
    }
}

