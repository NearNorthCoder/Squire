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
import gg.squire.basics.loot.GameEnum92;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aH;
import gg.squire.basics.loot.AlchingLootTask;
import gg.squire.basics.loot.BuyingBonesTask;
import gg.squire.basics.loot.LootingCustomItemsTask;
import gg.squire.basics.loot.LootingHeadTask;
import gg.squire.basics.loot.LootingHerbsTask;
import gg.squire.basics.loot.LootingValuablesTask;
import gg.squire.basics.loot.UsingSoulBearerTask;
import gg.squire.basics.loot.WalkingBackToTileBeforeLootTask;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
    
    private  List<Integer> ex;
    
     Actor et;
     WorldPoint ep;
     List<aH> er;
     Instant es;

    public void a(Actor actor) {
        this.et = actor;
    }

    private static boolean lIlIlllllII(int n2, int n3) {
        return n2 < n3;
    }

    public WorldPoint cj() {
        return this.eu;
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
        void lIllIlIlllIIIll;
        int[] nArray = this.ce();
        int n3 = nArray.length;
        int lIllIlIlllIIIlI = llIIlIIlI[1];
        while (SquireLooter.lIlIlllllII(lIllIlIlllIIIlI, (int)lIllIlIlllIIIll)) {
            void lIllIlIlllIIlIl;
            void lIllIlIlllIIlII;
            void lIllIlIlllIIIIl = lIllIlIlllIIlII[lIllIlIlllIIIlI];
            if (SquireLooter.lIlIlllllIl((int)lIllIlIlllIIIIl, (int)lIllIlIlllIIlIl)) {
                return llIIlIIlI[2];
            }
            ++lIllIlIlllIIIlI;

            if ((0x57 ^ 0x53) > 0) continue;
            return false;
        }
        return llIIlIIlI[1];
    }

    private static boolean lIlIlllIlll(Object object, Object object2) {
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
        SquireLooter.lIlIlllIllI();
        SquireLooter.lIlIlllIlIl();
    }

    private static boolean lIlIllllIIl(int n2) {
        return n2 == 0;
    }

    private static void lIlIlllIlIl() {
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

    private static boolean lIlIllllIII(Object object) {
        return object == null;
    }

    public void e(List<aH> list) {
        this.er = list;
    }

    @Provides
    LooterConfig n(ConfigManager configManager) {
        return (LooterConfig)configManager.getConfig(LooterConfig.class);
    }

    public List<aH> p() {
        return this.F;
    }

    /*
     * WARNING - void declaration
     */
    private int[] ce() {
        void var2_2;
        SquireLooter lIllIlIllIlllII;
        if (SquireLooter.lIlIllllIll(this.ew.custom().isEmpty() ? 1 : 0)) {
            return new int[llIIlIIlI[1]];
        }
        String[] lIllIlIllIllIll = lIllIlIllIlllII.ew.custom().split(llIIlIIIl[llIIlIIlI[8]]);
        int[] lIllIlIllIllIlI = new int[lIllIlIllIllIll.length];
        int lIllIlIllIllIIl = llIIlIIlI[1];
        while (SquireLooter.lIlIlllllII(lIllIlIllIllIIl, lIllIlIllIllIll.length)) {
            lIllIlIllIllIlI[lIllIlIllIllIIl] = Integer.parseInt(lIllIlIllIllIll[lIllIlIllIllIIl].trim());
            ++lIllIlIllIllIIl;

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
        if (SquireLooter.lIlIlllIlll(Game.getState(), GameState.LOGGED_IN)) {
            return;
        }
        lIllIlIlllllIlI.ep = Players.getLocal().getWorldLocation();
        Actor lIllIlIlllllIIl = Players.getLocal().getInteracting();
        if (SquireLooter.lIlIllllIII(lIllIlIlllllIIl)) {
            return;
        }
        this.a((Actor)var1_1);
    }

    public WorldPoint cf() {
        return this.ep;
    }

    private static boolean lIlIllllIlI(int n2, int n3) {
        return n2 > n3;
    }

    public void a(List<aH> list) {
        this.F = list;
    }

    @Subscribe
    public void a(NpcLootReceived npcLootReceived) {
        npcLootReceived.getItems().forEach(itemStack -> {
            this.ex.add(itemStack.getId());

        });
    }

    public void j(WorldPoint worldPoint) {
        this.ep = worldPoint;
    }

    private static boolean lIlIlllllIl(int n2, int n3) {
        return n2 == n3;
    }

    @Subscribe
    private void a(ItemDespawned itemDespawned) {
        int n2 = itemDespawned.getItem().getId();
        this.F.removeIf(aH2 -> {
            int n3;
            if (SquireLooter.lIlIlllllIl(n2, aH2.P()) && SquireLooter.lIlIllllIll(itemDespawned.getItem().getWorldLocation().equals((Object)aH2.cd()) ? 1 : 0)) {
                n3 = llIIlIIlI[2];

                if (3 <= 0) {
                    return false;
                }
            } else {
                n3 = llIIlIIlI[1];
            }
            return n3 != 0;
        });

        if (SquireLooter.lIlIllllIll(this.ex.contains(n2) ? 1 : 0)) {
            this.ex.remove(this.ex.lastIndexOf(n2));

        }
    }

    private static boolean lIlIllllIll(int n2) {
        return n2 != 0;
    }

        return String.valueOf(lIllIlIllIIIIII);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    private void a(ItemSpawned itemSpawned) {
        SquireLooter lIllIlIllllIIlI;
        void lIllIlIllllIIII;
        TileItem tileItem = itemSpawned.getItem();
        if (SquireLooter.lIlIllllIIl(tileItem.canPickup() ? 1 : 0)) {
            return;
        }
        if (SquireLooter.lIlIllllIIl(Reachable.isInteractable((Locatable)lIllIlIllllIIII) ? 1 : 0)) {
            return;
        }
        if (SquireLooter.lIlIllllIlI(lIllIlIllllIIII.distanceTo(Players.getLocal().getWorldLocation()), llIIlIIlI[9])) {
            return;
        }
        aH lIllIlIlllIllll = new aH();
        lIllIlIlllIllll.f(lIllIlIllllIIII.getId());
        lIllIlIlllIllll.i(lIllIlIllllIIII.getWorldLocation());
        String lIllIlIlllIlllI = Static.getClient().getItemDefinition(lIllIlIllllIIII.getId()).getName();
        int n2 = Static.getClient().getItemDefinition(lIllIlIllllIIII.getId()).isStackable();
        if (SquireLooter.lIlIllllIIl(lIllIlIllllIIlI.ew.lootBones() ? 1 : 0)) {
            if (SquireLooter.lIlIllllIll(lIllIlIlllIlllI.toLowerCase().contains(llIIlIIIl[llIIlIIlI[1]]) ? 1 : 0)) {
                return;
            }
            if (SquireLooter.lIlIllllIll(lIllIlIlllIlllI.contains(llIIlIIIl[llIIlIIlI[2]]) ? 1 : 0)) {
                return;
            }
        }
        if (SquireLooter.lIlIllllIll(lIllIlIllllIIlI.y(lIllIlIllllIIII.getId()) ? 1 : 0)) {
            lIllIlIllllIIlI.F.add(lIllIlIlllIllll);

            return;
        }
        if (SquireLooter.lIlIllllIll(lIllIlIllllIIlI.ew.lootStackable() ? 1 : 0)) {
            int[] nArray = new int[llIIlIIlI[2]];
            nArray[SquireLooter.llIIlIIlI[1]] = lIllIlIlllIllll.P();
            if (SquireLooter.lIlIllllIll(Inventory.contains((int[])nArray) ? 1 : 0) && SquireLooter.lIlIllllIll(n2)) {
                System.out.println("Adding stackable item " + Static.getClient().getItemDefinition(lIllIlIlllIllll.P()).getName() + " to items to loot");
                lIllIlIllllIIlI.F.add(lIllIlIlllIllll);

            }
        }
        if (SquireLooter.lIlIllllIll(Static.getClient().getItemDefinition(lIllIlIlllIllll.P()).getName().contains(llIIlIIIl[llIIlIIlI[3]]) ? 1 : 0)) {
            if (SquireLooter.lIlIllllIll(lIllIlIllllIIlI.ew.herbsToLoot().contains((Object)aG.x(lIllIlIllllIIII.getId())) ? 1 : 0)) {
                lIllIlIllllIIlI.eq.add(lIllIlIlllIllll);

                System.out.println("Adding " + Static.getClient().getItemDefinition(lIllIlIlllIllll.P()).getName() + " to herbs to loot");

                if (-1 == (0x79 ^ 0x72 ^ (0x38 ^ 0x37))) {
                    return;
                }
            }
        } else if (SquireLooter.lIlIllllIll(Static.getClient().getItemDefinition(lIllIlIlllIllll.P()).getName().contains(llIIlIIIl[llIIlIIlI[4]]) ? 1 : 0)) {
            if (SquireLooter.lIlIllllIll(lIllIlIllllIIlI.ew.lootHeads() ? 1 : 0)) {
                lIllIlIllllIIlI.er.add(lIllIlIlllIllll);

                System.out.println("Adding " + Static.getClient().getItemDefinition(lIllIlIlllIllll.P()).getName() + " to heads to loot");

                }
            }
        } else {
            if (SquireLooter.lIlIlllllII(Prices.getItemPrice((int)lIllIlIllllIIII.getId()) * lIllIlIllllIIII.getQuantity(), lIllIlIllllIIlI.ew.lootValue()) && SquireLooter.lIlIllllIIl(Static.getClient().getItemDefinition(lIllIlIllllIIII.getId()).getName().contains(llIIlIIIl[llIIlIIlI[5]]) ? 1 : 0) && SquireLooter.lIlIllllIIl(Static.getClient().getItemDefinition(lIllIlIllllIIII.getId()).getName().toLowerCase().contains(llIIlIIIl[llIIlIIlI[6]]) ? 1 : 0) && SquireLooter.lIlIllllIIl(Static.getClient().getItemDefinition(lIllIlIllllIIII.getId()).getName().contains(llIIlIIIl[llIIlIIlI[7]]) ? 1 : 0)) {
                return;
            }
            lIllIlIllllIIlI.F.add(lIllIlIlllIllll);

            System.out.println("Adding " + Static.getClient().getItemDefinition(lIllIlIlllIllll.P()).getName() + " to items to loot");
        }
    }
}

