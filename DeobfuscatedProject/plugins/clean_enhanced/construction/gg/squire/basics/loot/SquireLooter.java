/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Actor
 *  net.runelite.api.GameState
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileItem
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ItemDespawned
 *  net.runelite.api.events.ItemSpawned
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.NpcLootReceived
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.basics.loot;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.basics.loot.LooterConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.loot.GameEnum19;
import gg.squire.basics.loot.AlchingLootTask;
import gg.squire.basics.loot.BuyingBonesTask;
import gg.squire.basics.loot.LootingCustomItemsTask;
import gg.squire.basics.loot.LootingHeadTask;
import gg.squire.basics.loot.LootingHerbsTask;
import gg.squire.basics.loot.LootingValuablesTask;
import gg.squire.basics.loot.UsingSoulBearerTask;
import gg.squire.basics.loot.WalkingBackToTileBeforeLootTask;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Actor;
import net.runelite.api.GameState;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ItemDespawned;
import net.runelite.api.events.ItemSpawned;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.NpcLootReceived;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;

@SquireUtil
@PluginDescriptor(name="Squire Looter", description="Loots items", enabledByDefault=false)
public class SquireLooter
extends SquirePlugin {
     List<aH> F;
    @Inject
     LooterConfig ew;
    @Inject
     aH ev;
     List<aH> eq;
     WorldPoint eu;
    private static  int[] llIIlIIlI;
    private  List<Integer> ex;
    private static  String[] llIIlIIIl;
     Actor et;
     WorldPoint ep;
     List<aH> er;
     Instant es;

    public void a(Actor actor) {
        this.et = actor;
    }

    private static boolean var1(int n2, int n3) {
        return n2 < n3;
    }

    public WorldPoint cj() {
        return this.eu;
    }

        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public List<aH> cg() {
        return this.eq;
    }

    public SquireLooter() {
        this.F = new ArrayList<aH>();
        this.eq = new ArrayList<aH>();
        this.er = new ArrayList<aH>();
        this.ex = new ArrayList<Integer>();
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llIIlIIlI[0]];
        classArray[SquireLooter.llIIlIIlI[1]] = BuyingBonesTask.class;
        classArray[SquireLooter.llIIlIIlI[2]] = LootingHerbsTask.class;
        classArray[SquireLooter.llIIlIIlI[3]] = LootingValuablesTask.class;
        classArray[SquireLooter.llIIlIIlI[4]] = LootingCustomItemsTask.class;
        classArray[SquireLooter.llIIlIIlI[5]] = LootingHeadTask.class;
        classArray[SquireLooter.llIIlIIlI[6]] = UsingSoulBearerTask.class;
        classArray[SquireLooter.llIIlIIlI[7]] = WalkingBackToTileBeforeLootTask.class;
        classArray[SquireLooter.llIIlIIlI[8]] = AlchingLootTask.class;
        return classArray;
    }

    /*
     * WARNING - void declaration
     */
    private boolean y(int n2) {
        void var8;
        int[] nArray = this.ce();
        int n3 = nArray.length;
        int var9 = llIIlIIlI[1];
        while (SquireLooter.var1(var9, (int)var8)) {
            void var10;
            void var11;
            void var12 = var11[var9];
            if (SquireLooter.var13((int)var12, (int)var10)) {
                return llIIlIIlI[2];
            }
            ++var9;
            0;
            if ((0x57 ^ 0x53) > 0) continue;
            return ((0xD6 ^ 0xB7) & ~(0x34 ^ 0x55)) != 0;
        }
        return llIIlIIlI[1];
    }

    private static boolean var14(Object object, Object object2) {
        return object != object2;
    }

    public void d(List<aH> list) {
        this.eq = list;
    }

    public Actor ci() {
        return this.et;
    }

    public List<aH> ch() {
        return this.er;
    }

    protected void onStop() {
        this.es = null;
        this.et = null;
        this.eu = null;
        this.F.clear();
    }

    public void k(WorldPoint worldPoint) {
        this.eu = worldPoint;
    }

    static {
        SquireLooter.var15();
        SquireLooter.var16();
    }

    private static boolean var17(int n2) {
        return n2 == 0;
    }

    private static void var16() {
        llIIlIIIl = new String[llIIlIIlI[0]];
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[1]] = "bones";
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[2]] = "ashes";
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[3]] = "Grimy";
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[4]] = "head";
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[5]] = "Grimy";
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[6]] = "bones";
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[7]] = "ashes";
        SquireLooter.llIIlIIIl[SquireLooter.llIIlIIlI[8]] = ",";
    }

    private static boolean var18(Object object) {
        return object == null;
    }

    public void e(List<aH> list) {
        this.er = list;
    }

    @Provides
    LooterConfig n(ConfigManager configManager) {
        return (LooterConfig)configManager.getConfig(LooterConfig.class);
    }

        catch (Exception var24) {
            var24.printStackTrace();
            return null;
        }
    }

    public List<aH> p() {
        return this.F;
    }

    private static void var15() {
        llIIlIIlI = new int[10];
        SquireLooter.llIIlIIlI[0] = 0x80 ^ 0x88;
        SquireLooter.llIIlIIlI[1] = (0x38 ^ 0x45 ^ (0xBB ^ 0x96)) & (202 + 65 - 265 + 209 ^ 35 + 116 - 86 + 66 ^ -1);
        SquireLooter.llIIlIIlI[2] = 1;
        SquireLooter.llIIlIIlI[3] = 2;
        SquireLooter.llIIlIIlI[4] = 3;
        SquireLooter.llIIlIIlI[5] = 106 + 17 - 45 + 60 ^ 132 + 35 - 29 + 4;
        SquireLooter.llIIlIIlI[6] = 0x75 ^ 0x70;
        SquireLooter.llIIlIIlI[7] = 41 + 136 - 28 + 21 ^ 151 + 12 - 121 + 130;
        SquireLooter.llIIlIIlI[8] = 0xC ^ 0xB;
        SquireLooter.llIIlIIlI[9] = 69 + 62 - 67 + 81 ^ 89 + 96 - 99 + 71;
    }

    /*
     * WARNING - void declaration
     */
    private int[] ce() {
        void var2_2;
        SquireLooter var25;
        if (SquireLooter.var26(this.ew.custom().isEmpty() ? 1 : 0)) {
            return new int[llIIlIIlI[1]];
        }
        String[] var27 = var25.ew.custom().split(llIIlIIIl[llIIlIIlI[8]]);
        int[] var28 = new int[var27.length];
        int var29 = llIIlIIlI[1];
        while (SquireLooter.var1(var29, var27.length)) {
            var28[var29] = Integer.parseInt(var27[var29].trim());
            ++var29;
            0;
            if (((45 + 133 - 177 + 151 ^ 28 + 80 - 53 + 82) & (0xFE ^ 0xC4 ^ (0x85 ^ 0xAE) ^ -1)) < 3) continue;
            return null;
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    protected void onStart() {
        void var1_1;
        if (SquireLooter.var14(Game.getState(), GameState.LOGGED_IN)) {
            return;
        }
        var30.ep = Players.getLocal().getWorldLocation();
        Actor var31 = Players.getLocal().getInteracting();
        if (SquireLooter.var18(var31)) {
            return;
        }
        this.a((Actor)var1_1);
    }

    public WorldPoint cf() {
        return this.ep;
    }

    private static boolean var32(int n2, int n3) {
        return n2 > n3;
    }

    public void a(List<aH> list) {
        this.F = list;
    }

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        npcLootReceived.getItems().forEach(itemStack -> {
            this.ex.add(itemStack.getId());
            0;
        });
    }

    public void j(WorldPoint worldPoint) {
        this.ep = worldPoint;
    }

    private static boolean var13(int n2, int n3) {
        return n2 == n3;
    }

    @Subscribe
    private void a(ItemDespawned itemDespawned) {
        int n2 = itemDespawned.getItem().getId();
        this.F.removeIf(aH2 -> {
            int n3;
            if (SquireLooter.var13(n2, aH2.P()) && SquireLooter.var26(itemDespawned.getItem().getWorldLocation().equals((Object)aH2.cd()) ? 1 : 0)) {
                n3 = llIIlIIlI[2];
                0;
                if (3 <= 0) {
                    return ((5 ^ 0x36) & ~(0xA1 ^ 0x92)) != 0;
                }
            } else {
                n3 = llIIlIIlI[1];
            }
            return n3 != 0;
        });
        0;
        if (SquireLooter.var26(this.ex.contains(n2) ? 1 : 0)) {
            this.ex.remove(this.ex.lastIndexOf(n2));
            0;
        }
    }

    private static boolean var26(int n2) {
        return n2 != 0;
    }

    private static String var33(String var34, String var35) {
        var34 = new String(Base64.getDecoder().decode(var34.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var36 = new StringBuilder();
        char[] var37 = var35.toCharArray();
        int var38 = llIIlIIlI[1];
        char[] var39 = var34.toCharArray();
        int var40 = var39.length;
        int var41 = llIIlIIlI[1];
        while (SquireLooter.var1(var41, var40)) {
            char var42 = var39[var41];
            var36.append((char)(var42 ^ var37[var38 % var37.length]));
            0;
            ++var38;
            ++var41;
            0;
            if (((0x9B ^ 0xA0) & ~(0xB9 ^ 0x82)) == 0) continue;
            return null;
        }
        return String.valueOf(var36);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ItemSpawned itemSpawned) {
        SquireLooter var43;
        void var44;
        TileItem tileItem = itemSpawned.getItem();
        if (SquireLooter.var17(tileItem.canPickup() ? 1 : 0)) {
            return;
        }
        if (SquireLooter.var17(Reachable.isInteractable((Locatable)var44) ? 1 : 0)) {
            return;
        }
        if (SquireLooter.var32(var44.distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlI[9])) {
            return;
        }
        aH var45 = new aH();
        var45.f(var44.getId());
        var45.i(var44.getWorldLocation());
        String var46 = Static.getClient().getItemDefinition(var44.getId()).getName();
        int n2 = Static.getClient().getItemDefinition(var44.getId()).isStackable();
        if (SquireLooter.var17(var43.ew.lootBones() ? 1 : 0)) {
            if (SquireLooter.var26(var46.toLowerCase().contains(llIIlIIIl[llIIlIIlI[1]]) ? 1 : 0)) {
                return;
            }
            if (SquireLooter.var26(var46.contains(llIIlIIIl[llIIlIIlI[2]]) ? 1 : 0)) {
                return;
            }
        }
        if (SquireLooter.var26(var43.y(var44.getId()) ? 1 : 0)) {
            var43.F.add(var45);
            0;
            return;
        }
        if (SquireLooter.var26(var43.ew.lootStackable() ? 1 : 0)) {
            int[] nArray = new int[llIIlIIlI[2]];
            nArray[SquireLooter.llIIlIIlI[1]] = var45.P();
            if (SquireLooter.var26(Inventory.contains((int[])nArray) ? 1 : 0) && SquireLooter.var26(n2)) {
                System.out.println("Adding stackable item " + Static.getClient().getItemDefinition(var45.P()).getName() + " to items to loot");
                var43.F.add(var45);
                0;
            }
        }
        if (SquireLooter.var26(Static.getClient().getItemDefinition(var45.P()).getName().contains(llIIlIIIl[llIIlIIlI[3]]) ? 1 : 0)) {
            if (SquireLooter.var26(var43.ew.herbsToLoot().contains((Object)aG.x(var44.getId())) ? 1 : 0)) {
                var43.eq.add(var45);
                0;
                System.out.println("Adding " + Static.getClient().getItemDefinition(var45.P()).getName() + " to herbs to loot");
                0;
                if (-1 == (0x79 ^ 0x72 ^ (0x38 ^ 0x37))) {
                    return;
                }
            }
        } else if (SquireLooter.var26(Static.getClient().getItemDefinition(var45.P()).getName().contains(llIIlIIIl[llIIlIIlI[4]]) ? 1 : 0)) {
            if (SquireLooter.var26(var43.ew.lootHeads() ? 1 : 0)) {
                var43.er.add(var45);
                0;
                System.out.println("Adding " + Static.getClient().getItemDefinition(var45.P()).getName() + " to heads to loot");
                0;
                if null != null {
                    return;
                }
            }
        } else {
            if (SquireLooter.var1(Prices.getItemPrice((int)var44.getId()) * var44.getQuantity(), var43.ew.lootValue()) && SquireLooter.var17(Static.getClient().getItemDefinition(var44.getId()).getName().contains(llIIlIIIl[llIIlIIlI[5]]) ? 1 : 0) && SquireLooter.var17(Static.getClient().getItemDefinition(var44.getId()).getName().toLowerCase().contains(llIIlIIIl[llIIlIIlI[6]]) ? 1 : 0) && SquireLooter.var17(Static.getClient().getItemDefinition(var44.getId()).getName().contains(llIIlIIIl[llIIlIIlI[7]]) ? 1 : 0)) {
                return;
            }
            var43.F.add(var45);
            0;
            System.out.println("Adding " + Static.getClient().getItemDefinition(var45.P()).getName() + " to items to loot");
        }
    }
}

