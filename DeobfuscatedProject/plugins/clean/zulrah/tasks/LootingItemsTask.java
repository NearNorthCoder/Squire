/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.ZulrahTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Looting items", priority=10, blocking=true)
public class LootingItemsTask
extends ZulrahTaskBase {

        return String.valueOf(var1);
    }

    private static boolean llIIIlllIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIlllIllIIII() {
        lIllIlIIIIlII = new String[lIllIlIIIlIII[3]];
        af.lIllIlIIIIlII[af.lIllIlIIIlIII[0]] = "Eat";
        af.lIllIlIIIIlII[af.lIllIlIIIlIII[1]] = "Take";
        af.lIllIlIIIIlII[af.lIllIlIIIlIII[2]] = "Eat";
    }

    private static boolean llIIIlllIllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlllIllIlIl(Object object) {
        return object == null;
    }

    @Override
    public boolean ac() {
        List list = TileItems.getAll();
        if (af.llIIIlllIllIlII(list.isEmpty() ? 1 : 0)) {
            return lIllIlIIIlIII[0];
        }
        if (af.llIIIlllIllIlII(Inventory.isFull() ? 1 : 0)) {
            Item var2 = Inventory.getFirst(item -> item.hasAction(lIllIlIIIIlII[lIllIlIIIlIII[2]]::equals));
            if (af.llIIIlllIllIlIl(var2)) {
                return lIllIlIIIlIII[0];
            }
            var2.interact(lIllIlIIIIlII[lIllIlIIIlIII[0]]);
        }
        ((TileItem)list.get(lIllIlIIIlIII[0])).interact(lIllIlIIIIlII[lIllIlIIIlIII[1]]);
        return lIllIlIIIlIII[1];
    }

    @Inject
    protected LootingItemsTask(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    static {
        af.llIIIlllIllIIll();
        af.llIIIlllIllIIII();
    }
}

