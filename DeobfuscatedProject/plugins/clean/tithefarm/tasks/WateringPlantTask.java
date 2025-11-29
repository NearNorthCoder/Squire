/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GameObject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.tithefarm.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.GameObject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Inventory;
import gg.squire.tithefarm.tasks.IHelper;
import gg.squire.tithefarm.tasks.TithefarmTaskBase;

@TaskDesc(name="Watering Plant", priority=20, blocking=true)
public class WateringPlantTask
extends TithefarmTaskBase {

    static {
        v.lIllIlIlllIIIII();
        v.lIllIlIllIlllll();
    }

    private static boolean lIllIlIlllIIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIllIlIlllIIIlI(Object object) {
        return object == null;
    }

    private static boolean lIllIlIlllIIlIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIlIlllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        v var1;
        int[] nArray = new int[lIIlllllIlIII[0]];
        nArray[v.lIIlllllIlIII[1]] = lIIlllllIlIII[2];
        Item item2 = Inventory.getFirst((int[])nArray);
        if (v.lIllIlIlllIIIIl(Inventory.contains(item -> {
            int n2;
            if (v.lIllIlIlllIIlII(item.getId(), lIIlllllIlIII[4]) && v.lIllIlIlllIIlIl(item.getId(), lIIlllllIlIII[5])) {
                n2 = lIIlllllIlIII[0];

                if (-(0x33 ^ 0x39 ^ (0x64 ^ 0x6A)) > 0) {
                    return ((127 + 130 - 80 + 6 ^ 31 + 29 - 54 + 128) & (0x49 ^ 0x37 ^ (0x6A ^ 0x25) ^ -1)) != 0;
                }
            } else {
                n2 = lIIlllllIlIII[1];
            }
            return n2 != 0;
        }) ? 1 : 0) && v.lIllIlIlllIIIlI(item2)) {
            return lIIlllllIlIII[1];
        }
        TileObject var2 = var1.Z.a(lIIlllllIIlll[lIIlllllIlIII[1]]);
        if (v.lIllIlIlllIIIlI(var2)) {
            return lIIlllllIlIII[1];
        }
        var2.interact(lIIlllllIIlll[lIIlllllIlIII[0]]);
        GameObject var3 = (GameObject)var2;
        Player var4 = Players.getLocal();
        if (v.lIllIlIlllIIIll(var3.getWorldArea().isInMeleeDistance(var4.getWorldArea()) ? 1 : 0)) {
            var1.sleep(lIIlllllIlIII[3]);
        }
        return lIIlllllIlIII[0];
    }

        return String.valueOf(var5);
    }

    private static boolean lIllIlIlllIIIIl(int n2) {
        return n2 == 0;
    }

    @Inject
    protected WateringPlantTask(i i2) {
        super(i2);
    }

    private static void lIllIlIllIlllll() {
        lIIlllllIIlll = new String[lIIlllllIlIII[3]];
        v.lIIlllllIIlll[v.lIIlllllIlIII[1]] = "Water";
        v.lIIlllllIIlll[v.lIIlllllIlIII[0]] = "Water";
    }

    private static boolean lIllIlIlllIIIll(int n2) {
        return n2 != 0;
    }
}

