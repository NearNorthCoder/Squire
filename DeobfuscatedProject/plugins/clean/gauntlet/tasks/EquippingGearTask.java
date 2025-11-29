/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import gg.squire.gauntlet.tasks.GameEnum39;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Equipping gear", priority=5, blocking=true)
public class EquippingGearTask
extends GauntletTaskBase {

    @Override
    public boolean be() {
        Player player = Players.getLocal();
        if (!T.llllllIllIIIll(player) || T.llllllIllIIlII(player.isMoving() ? 1 : 0)) {
            return llIIllIIllIl[1];
        }
        f[] fArray = new f[llIIllIIllIl[5]];
        fArray[T.llIIllIIllIl[1]] = f.TIER_1_BODY;
        fArray[T.llIIllIIllIl[2]] = f.TIER_1_HELM;
        fArray[T.llIIllIIllIl[3]] = f.TIER_1_LEGS;
        fArray[T.llIIllIIllIl[4]] = f.TIER_1_STAFF;
        fArray[T.llIIllIIllIl[0]] = f.TIER_2_STAFF;
        List var1 = Stream.of(fArray).filter(f2 -> {
            boolean bl;
            if (T.llllllIllIIlII(Equipment.contains((int[])f2.ad()) ? 1 : 0)) {
                bl = llIIllIIllIl[2];

                if (3 <= -1) {
                    return false;
                }
            } else {
                bl = llIIllIIllIl[1];
            }
            return bl;
        }).filter(f2 -> Inventory.contains((int[])f2.ad())).collect(Collectors.toList());
        if (T.llllllIllIIlIl(var1.isEmpty() ? 1 : 0)) {
            return llIIllIIllIl[1];
        }
        Iterator var2 = var1.iterator();
        if (T.llllllIllIIlIl(var2.hasNext() ? 1 : 0)) {
            String string;
            f var3 = (f)((Object)var2.next());
            Item var4 = Inventory.getFirst((int[])var3.ad());
            if (T.llllllIllIIllI(var4)) {
                return llIIllIIllIl[1];
            }
            String[] stringArray = new String[llIIllIIllIl[2]];
            stringArray[T.llIIllIIllIl[1]] = llIIllIIllII[llIIllIIllIl[1]];
            if (T.llllllIllIIlIl(var4.hasAction(stringArray) ? 1 : 0)) {
                string = llIIllIIllII[llIIllIIllIl[2]];

                if ((0x70 ^ 0x75) <= 0) {
                    return false;
                }
            } else {
                string = llIIllIIllII[llIIllIIllIl[3]];
            }
            var4.interact(string);
            return llIIllIIllIl[2];
        }
        return llIIllIIllIl[1];
    }

    static {
        T.llllllIllIIIlI();
        T.llllllIllIIIIl();
    }

    private static boolean llllllIllIIlII(int n2) {
        return n2 == 0;
    }

        return String.valueOf(var5);
    }

    private static boolean llllllIllIIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIllIIllI(Object object) {
        return object == null;
    }

    @Inject
    public EquippingGearTask(c c2) {
        d[] dArray = new d[llIIllIIllIl[0]];
        dArray[T.llIIllIIllIl[1]] = d.FIRST_ROTATION_EXPLORE;
        dArray[T.llIIllIIllIl[2]] = d.DEMI_BOSS_EXPLORE;
        dArray[T.llIIllIIllIl[3]] = d.FIRST_ROTATION_CREATE;
        dArray[T.llIIllIIllIl[4]] = d.PREPARE_BOSS_FIGHT;
        super(c2, dArray);
    }

    private static boolean llllllIllIIlIl(int n2) {
        return n2 != 0;
    }

    private static boolean llllllIllIIIll(Object object) {
        return object != null;
    }

    private static void llllllIllIIIIl() {
        llIIllIIllII = new String[llIIllIIllIl[4]];
        T.llIIllIIllII[T.llIIllIIllIl[1]] = "Wear";
        T.llIIllIIllII[T.llIIllIIllIl[2]] = "Wear";
        T.llIIllIIllII[T.llIIllIIllIl[3]] = "Wield";
    }
}

