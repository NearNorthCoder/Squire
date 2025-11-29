/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Provides
 *  com.openosrs.client.util.PvPUtil
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.ItemComposition
 *  net.runelite.api.Player
 *  net.runelite.api.PlayerComposition
 *  net.runelite.api.SkullIcon
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.PlayerDespawned
 *  net.runelite.api.events.PlayerSpawned
 *  net.runelite.api.kit.KitType
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  net.unethicalite.client.managers.interaction.InteractionManager
 */
package gg.squire.basics.wilderness.antipking;

import com.google.inject.Inject;
import com.google.inject.Provides;
import com.openosrs.client.util.PvPUtil;
import gg.squire.basics.wilderness.antipking.AntiPkConfig;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.basics.wilderness.antipking.GameEnum8;
import gg.squire.basics.wilderness.antipking.ConstructionManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.Player;
import net.runelite.api.PlayerComposition;
import net.runelite.api.SkullIcon;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.PlayerDespawned;
import net.runelite.api.events.PlayerSpawned;
import net.runelite.api.kit.KitType;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import net.unethicalite.client.managers.interaction.InteractionManager;

@SquireUtil
@PluginDescriptor(name="Squire Anti PK Assistant", description="Anti Pking", enabledByDefault=false)
public class AntiPKingAssistant
extends SquirePlugin {
    private static  int[] lIIllllIl;
    private final  List<Player> hj;
    @Inject
    private  AntiPkConfig hk;

    private static boolean var1(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(PlayerDespawned playerDespawned) {
        this.hj.remove(playerDespawned.getPlayer());
        0;
    }

    private static boolean var2(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var5(Object object) {
        return object == null;
    }

    static {
        AntiPKingAssistant.var6();
    }

    protected Class<?>[] tasks() {
        return new Class[lIIllllIl[1]];
    }

    private static void var6() {
        lIIllllIl = new int[5];
        AntiPKingAssistant.lIIllllIl[0] = 0xFFFFDFCB & 0x377F;
        AntiPKingAssistant.lIIllllIl[1] = (0xC2 ^ 0x94) & ~(0x5A ^ 0xC);
        AntiPKingAssistant.lIIllllIl[2] = 1;
        AntiPKingAssistant.lIIllllIl[3] = -1 & (0xFFFFFFFF & Integer.MAX_VALUE);
        AntiPKingAssistant.lIIllllIl[4] = -1;
    }

    protected void onStart() {
        this.hj.clear();
        InteractionManager.setHelper((boolean)lIIllllIl[2]);
    }

    public AntiPKingAssistant() {
        this.hj = new ArrayList<Player>();
    }

    @Provides
    AntiPkConfig y(ConfigManager configManager) {
        return (AntiPkConfig)configManager.getConfig(AntiPkConfig.class);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        AntiPKingAssistant var7;
        Client client = Static.getClient();
        if (AntiPKingAssistant.var1(client.getVarbitValue(lIIllllIl[0]))) {
            return;
        }
        if (AntiPKingAssistant.var8(var7.hj.isEmpty() ? 1 : 0)) {
            return;
        }
        this.a(client);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(PlayerSpawned playerSpawned) {
        int var9;
        int n2;
        AntiPKingAssistant var10;
        void var11;
        Player player = playerSpawned.getPlayer();
        if (AntiPKingAssistant.var5(player)) {
            return;
        }
        if (AntiPKingAssistant.var3(var11, Players.getLocal())) {
            return;
        }
        Client var12 = Static.getClient();
        if (AntiPKingAssistant.var1(PvPUtil.isAttackable((Client)var12, (Player)var11) ? 1 : 0)) {
            return;
        }
        if (!AntiPKingAssistant.var8(var10.hk.onlySkulled() ? 1 : 0) || AntiPKingAssistant.var3(var11.getSkullIcon(), SkullIcon.SKULL)) {
            n2 = lIIllllIl[2];
            0;
            if (3 <= 0) {
                return;
            }
        } else {
            n2 = var9 = lIIllllIl[1];
        }
        if (AntiPKingAssistant.var8(var10.hk.ignoreGear() ? 1 : 0) && AntiPKingAssistant.var8(var9)) {
            var10.a(var12);
            var10.hj.add((Player)var11);
            0;
            return;
        }
        if (AntiPKingAssistant.var1(var9)) {
            return;
        }
        KitType[] var13 = KitType.values();
        int var14 = var13.length;
        int var15 = lIIllllIl[1];
        while (AntiPKingAssistant.var2(var15, var14)) {
            KitType var16 = var13[var15];
            PlayerComposition var17 = var11.getPlayerComposition();
            if (AntiPKingAssistant.var5(var17)) {
                0;
                if null != null {
                    return;
                }
            } else {
                int var18 = var17.getEquipmentId(var16);
                if (AntiPKingAssistant.var4(var18, lIIllllIl[4])) {
                    0;
                    if (1 == 3) {
                        return;
                    }
                } else {
                    ItemComposition var19 = var12.getItemDefinition(var18);
                    Stream<String> var20 = Stream.concat(Stream.concat(Stream.of(bZ.hm), Stream.of(bZ.hl)), Stream.of(bZ.hn));
                    if (AntiPKingAssistant.var8(var20.anyMatch(string -> var19.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0)) {
                        var10.a(var12);
                        var10.hj.add((Player)var11);
                        0;
                    }
                }
            }
            ++var15;
            0;
            if null == null continue;
            return;
        }
    }

    private void a(Client client) {
        AntiPKingAssistant var21;
        if (AntiPKingAssistant.var1(client.getVarbitValue(lIIllllIl[0]))) {
            return;
        }
        if (AntiPKingAssistant.var1(var21.hk.alwaysLogout() ? 1 : 0)) {
            int var22 = PvPUtil.getWildernessLevelFrom((WorldPoint)Players.getLocal().getWorldLocation());
            bY[] var23 = bY.values();
            int var24 = var23.length;
            int var25 = lIIllllIl[1];
            while (AntiPKingAssistant.var2(var25, var24)) {
                bY var26 = var23[var25];
                if (AntiPKingAssistant.var27(var22, var26.da())) {
                    0;
                    if null != null {
                        return;
                    }
                } else {
                    Item var28;
                    Item item;
                    if (AntiPKingAssistant.var8(var26.db() ? 1 : 0)) {
                        item = Equipment.getFirst(var26.br());
                        0;
                        if (1 != 1) {
                            return;
                        }
                    } else {
                        item = Inventory.getFirst(var26.br());
                    }
                    if (AntiPKingAssistant.var5(var28 = item)) {
                        0;
                        if ((0x29 ^ 0x2D) <= ((0x5C ^ 0x76) & ~(0x8D ^ 0xA7))) {
                            return;
                        }
                    } else {
                        var28.interact(var26.cZ());
                        return;
                    }
                }
                ++var25;
                0;
                if null == null continue;
                return;
            }
        }
        client.setMouseIdleTicks(lIIllllIl[3]);
        client.setKeyboardIdleTicks(lIIllllIl[3]);
        Game.logout();
    }

    protected void onStop() {
        this.hj.clear();
        InteractionManager.setHelper((boolean)lIIllllIl[1]);
    }

    private static boolean var27(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }
}

