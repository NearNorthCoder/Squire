package gg.squire.leagues.pickupnoter;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.util.ArrayList;
import java.util.List;
import net.runelite.api.Item;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ItemDespawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.items.Inventory;
@PluginDescriptor(name = "[Leagues] Pick Up Noter", enabledByDefault = false)
@SquireUtil
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:gg/squire/leagues/pickupnoter/PickupNoterPlugin.class */
public class PickupNoterPlugin extends SquirePlugin {
    private static /* synthetic */ int[] l;
    private final /* synthetic */ List<Integer> v = new ArrayList();

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int i2 = l[1];
        if (l(this.v.isEmpty() ? 1 : 0)) {
            return;
        }
        for (Item item : Inventory.getAll(item2 -> {
            return this.v.contains(Integer.valueOf(item2.getId()));
        })) {
            Inventory.use(item.getId(), i2);
            "".length();
            "".length();
            if ((-"  ".length()) > 0) {
                return;
            }
        }
        this.v.clear();
    }

    private static void I() {
        l = new int[2];
        l[0] = (250 ^ 186) & ((74 ^ 10) ^ (-1));
        l[1] = (-1185) & 29951;
    }

    protected void onStart() {
    }

    @Subscribe
    public void a(ItemDespawned itemDespawned) {
        this.v.add(Integer.valueOf(itemDespawned.getItem().getId()));
        "".length();
    }

    private static boolean l(int i2) {
        return i2 != 0;
    }

    protected Class<?>[] tasks() {
        return new Class[l[0]];
    }

    static {
        I();
    }

    protected void onStop() {
    }
}
