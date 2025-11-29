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
import gg.squire.basics.wilderness.antipking.GameEnum48;
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
    
    private final  List<Player> hj;
    @Inject
    private  AntiPkConfig hk;

    private static boolean lIIIlIlIIIl(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(PlayerDespawned playerDespawned) {
        this.hj.remove(playerDespawned.getPlayer());

    }

    private static boolean lIIIlIlIIll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIlIllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIlIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlIlIlIl(Object object) {
        return object == null;
    }

    static {
        AntiPKingAssistant.lIIIlIlIIII();
    }

    protected Class<?>[] tasks() {
        return new Class[lIIllllIl[1]];
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
        AntiPKingAssistant llIIIlIlIIIIIlI;
        Client client = Static.getClient();
        if (AntiPKingAssistant.lIIIlIlIIIl(client.getVarbitValue(lIIllllIl[0]))) {
            return;
        }
        if (AntiPKingAssistant.lIIIlIlIIlI(llIIIlIlIIIIIlI.hj.isEmpty() ? 1 : 0)) {
            return;
        }
        this.a(client);
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void b(PlayerSpawned playerSpawned) {
        int llIIIlIIlIlllll;
        int n2;
        AntiPKingAssistant llIIIlIIllIIIll;
        void llIIIlIIllIIIIl;
        Player player = playerSpawned.getPlayer();
        if (AntiPKingAssistant.lIIIlIlIlIl(player)) {
            return;
        }
        if (AntiPKingAssistant.lIIIlIlIllI(llIIIlIIllIIIIl, Players.getLocal())) {
            return;
        }
        Client llIIIlIIllIIIII = Static.getClient();
        if (AntiPKingAssistant.lIIIlIlIIIl(PvPUtil.isAttackable((Client)llIIIlIIllIIIII, (Player)llIIIlIIllIIIIl) ? 1 : 0)) {
            return;
        }
        if (!AntiPKingAssistant.lIIIlIlIIlI(llIIIlIIllIIIll.hk.onlySkulled() ? 1 : 0) || AntiPKingAssistant.lIIIlIlIllI(llIIIlIIllIIIIl.getSkullIcon(), SkullIcon.SKULL)) {
            n2 = lIIllllIl[2];

            if (3 <= 0) {
                return;
            }
        } else {
            n2 = llIIIlIIlIlllll = lIIllllIl[1];
        }
        if (AntiPKingAssistant.lIIIlIlIIlI(llIIIlIIllIIIll.hk.ignoreGear() ? 1 : 0) && AntiPKingAssistant.lIIIlIlIIlI(llIIIlIIlIlllll)) {
            llIIIlIIllIIIll.a(llIIIlIIllIIIII);
            llIIIlIIllIIIll.hj.add((Player)llIIIlIIllIIIIl);

            return;
        }
        if (AntiPKingAssistant.lIIIlIlIIIl(llIIIlIIlIlllll)) {
            return;
        }
        KitType[] llIIIlIIlIllllI = KitType.values();
        int llIIIlIIlIlllIl = llIIIlIIlIllllI.length;
        int llIIIlIIlIlllII = lIIllllIl[1];
        while (AntiPKingAssistant.lIIIlIlIIll(llIIIlIIlIlllII, llIIIlIIlIlllIl)) {
            KitType llIIIlIIlIllIll = llIIIlIIlIllllI[llIIIlIIlIlllII];
            PlayerComposition llIIIlIIlIllIlI = llIIIlIIllIIIIl.getPlayerComposition();
            if (AntiPKingAssistant.lIIIlIlIlIl(llIIIlIIlIllIlI)) {

                }
            } else {
                int llIIIlIIlIllIIl = llIIIlIIlIllIlI.getEquipmentId(llIIIlIIlIllIll);
                if (AntiPKingAssistant.lIIIlIlIlll(llIIIlIIlIllIIl, lIIllllIl[4])) {

                    if (1 == 3) {
                        return;
                    }
                } else {
                    ItemComposition llIIIlIIlIllIII = llIIIlIIllIIIII.getItemDefinition(llIIIlIIlIllIIl);
                    Stream<String> llIIIlIIlIlIlll = Stream.concat(Stream.concat(Stream.of(bZ.hm), Stream.of(bZ.hl)), Stream.of(bZ.hn));
                    if (AntiPKingAssistant.lIIIlIlIIlI(llIIIlIIlIlIlll.anyMatch(string -> llIIIlIIlIllIII.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0)) {
                        llIIIlIIllIIIll.a(llIIIlIIllIIIII);
                        llIIIlIIllIIIll.hj.add((Player)llIIIlIIllIIIIl);

                    }
                }
            }
            ++llIIIlIIlIlllII;

            return;
        }
    }

    private void a(Client client) {
        AntiPKingAssistant llIIIlIIllllIII;
        if (AntiPKingAssistant.lIIIlIlIIIl(client.getVarbitValue(lIIllllIl[0]))) {
            return;
        }
        if (AntiPKingAssistant.lIIIlIlIIIl(llIIIlIIllllIII.hk.alwaysLogout() ? 1 : 0)) {
            int llIIIlIIlllIllI = PvPUtil.getWildernessLevelFrom((WorldPoint)Players.getLocal().getWorldLocation());
            bY[] llIIIlIIlllIlIl = bY.values();
            int llIIIlIIlllIlII = llIIIlIIlllIlIl.length;
            int llIIIlIIlllIIll = lIIllllIl[1];
            while (AntiPKingAssistant.lIIIlIlIIll(llIIIlIIlllIIll, llIIIlIIlllIlII)) {
                bY llIIIlIIlllIIlI = llIIIlIIlllIlIl[llIIIlIIlllIIll];
                if (AntiPKingAssistant.lIIIlIlIlII(llIIIlIIlllIllI, llIIIlIIlllIIlI.da())) {

                    }
                } else {
                    Item llIIIlIIlllIIIl;
                    Item item;
                    if (AntiPKingAssistant.lIIIlIlIIlI(llIIIlIIlllIIlI.db() ? 1 : 0)) {
                        item = Equipment.getFirst(llIIIlIIlllIIlI.br());

                        if (1 != 1) {
                            return;
                        }
                    } else {
                        item = Inventory.getFirst(llIIIlIIlllIIlI.br());
                    }
                    if (AntiPKingAssistant.lIIIlIlIlIl(llIIIlIIlllIIIl = item)) {

                        if ((0x29 ^ 0x2D) <= ((0x5C ^ 0x76) & ~(0x8D ^ 0xA7))) {
                            return;
                        }
                    } else {
                        llIIIlIIlllIIIl.interact(llIIIlIIlllIIlI.cZ());
                        return;
                    }
                }
                ++llIIIlIIlllIIll;

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

    private static boolean lIIIlIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIlIIlI(int n2) {
        return n2 != 0;
    }
}

