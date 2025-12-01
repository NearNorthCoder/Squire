package gg.squire.basics.wilderness.antipking;

import com.google.inject.Inject;
import com.google.inject.Provides;
import com.openosrs.client.util.PvPUtil;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bY;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.bZ;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.ItemComposition;
import net.runelite.api.Player;
import net.runelite.api.PlayerComposition;
import net.runelite.api.SkullIcon;
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
@PluginDescriptor(name = "Squire Anti PK Assistant", description = "Anti Pking", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/wilderness/antipking/AntiPKingAssistant.class */
public class AntiPKingAssistant extends SquirePlugin {
    private static /* synthetic */ int[] lIIllllIl;
    private final /* synthetic */ List<Player> hj = new ArrayList();
    @Inject
    private /* synthetic */ AntiPkConfig hk;

    private static boolean lIIIlIlIIIl(int i2) {
        return i2 == 0;
    }

    @Subscribe
    public void a(PlayerDespawned playerDespawned) {
        this.hj.remove(playerDespawned.getPlayer());
        "".length();
    }

    private static boolean lIIIlIlIIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIIIlIlIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIlIlIlll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIIIlIlIlIl(Object obj) {
        return obj == null;
    }

    static {
        lIIIlIlIIII();
    }

    protected Class<?>[] tasks() {
        return new Class[lIIllllIl[1]];
    }

    private static void lIIIlIlIIII() {
        lIIllllIl = new int[5];
        lIIllllIl[0] = (-8245) & 14207;
        lIIllllIl[1] = (194 ^ 148) & ((90 ^ 12) ^ (-1));
        lIIllllIl[2] = " ".length();
        lIIllllIl[3] = (-" ".length()) & (-1) & Integer.MAX_VALUE;
        lIIllllIl[4] = -" ".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    protected void onStart() {
        this.hj.clear();
        InteractionManager.setHelper((boolean) lIIllllIl[2]);
    }

    @Provides
    AntiPkConfig y(ConfigManager configManager) {
        return (AntiPkConfig) configManager.getConfig(AntiPkConfig.class);
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        Client client = Static.getClient();
        if (lIIIlIlIIIl(client.getVarbitValue(lIIllllIl[0])) || lIIIlIlIIlI(this.hj.isEmpty() ? 1 : 0)) {
            return;
        }
        a(client);
    }

    @Subscribe
    public void b(PlayerSpawned playerSpawned) {
        int i2;
        Player player = playerSpawned.getPlayer();
        if (lIIIlIlIlIl(player) || lIIIlIlIllI(player, Players.getLocal())) {
            return;
        }
        Client client = Static.getClient();
        if (lIIIlIlIIIl(PvPUtil.isAttackable(client, player) ? 1 : 0)) {
            return;
        }
        if (!lIIIlIlIIlI(this.hk.onlySkulled() ? 1 : 0) || lIIIlIlIllI(player.getSkullIcon(), SkullIcon.SKULL)) {
            i2 = lIIllllIl[2];
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        } else {
            i2 = lIIllllIl[1];
        }
        int i3 = i2;
        if (lIIIlIlIIlI(this.hk.ignoreGear() ? 1 : 0) && lIIIlIlIIlI(i3)) {
            a(client);
            this.hj.add(player);
            "".length();
        } else if (lIIIlIlIIIl(i3)) {
        } else {
            KitType[] values = KitType.values();
            int length = values.length;
            int i4 = lIIllllIl[1];
            while (lIIIlIlIIll(i4, length)) {
                KitType kitType = values[i4];
                PlayerComposition playerComposition = player.getPlayerComposition();
                if (lIIIlIlIlIl(playerComposition)) {
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                } else {
                    int equipmentId = playerComposition.getEquipmentId(kitType);
                    if (lIIIlIlIlll(equipmentId, lIIllllIl[4])) {
                        "".length();
                        if (" ".length() == "   ".length()) {
                            return;
                        }
                    } else {
                        ItemComposition itemDefinition = client.getItemDefinition(equipmentId);
                        if (lIIIlIlIIlI(Stream.concat(Stream.concat(Stream.of((Object[]) bZ.hm), Stream.of((Object[]) bZ.hl)), Stream.of((Object[]) bZ.hn)).anyMatch(str -> {
                            return itemDefinition.getName().toLowerCase().contains(str.toLowerCase());
                        }) ? 1 : 0)) {
                            a(client);
                            this.hj.add(player);
                            "".length();
                        }
                    }
                }
                i4++;
                "".length();
                if (0 != 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(Client client) {
        Item first;
        if (lIIIlIlIIIl(client.getVarbitValue(lIIllllIl[0]))) {
            return;
        }
        if (lIIIlIlIIIl(this.hk.alwaysLogout() ? 1 : 0)) {
            int wildernessLevelFrom = PvPUtil.getWildernessLevelFrom(Players.getLocal().getWorldLocation());
            bY[] values = bY.values();
            int length = values.length;
            int i2 = lIIllllIl[1];
            while (lIIIlIlIIll(i2, length)) {
                bY bYVar = values[i2];
                if (lIIIlIlIlII(wildernessLevelFrom, bYVar.da())) {
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                } else {
                    if (lIIIlIlIIlI(bYVar.db() ? 1 : 0)) {
                        first = Equipment.getFirst(bYVar.br());
                        "".length();
                        if (" ".length() != " ".length()) {
                            return;
                        }
                    } else {
                        first = Inventory.getFirst(bYVar.br());
                    }
                    Item item = first;
                    if (!lIIIlIlIlIl(item)) {
                        item.interact(bYVar.cZ());
                        return;
                    }
                    "".length();
                    if ((41 ^ 45) <= ((92 ^ 118) & ((141 ^ 167) ^ (-1)))) {
                        return;
                    }
                }
                i2++;
                "".length();
                if (0 != 0) {
                    return;
                }
            }
        }
        client.setMouseIdleTicks(lIIllllIl[3]);
        client.setKeyboardIdleTicks(lIIllllIl[3]);
        Game.logout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    protected void onStop() {
        this.hj.clear();
        InteractionManager.setHelper((boolean) lIIllllIl[1]);
    }

    private static boolean lIIIlIlIlII(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIIIlIlIIlI(int i2) {
        return i2 != 0;
    }
}
