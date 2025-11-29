/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.saradomin.tasks.SaradominManager;

@TaskDesc(name="Casting B2P", priority=6)
public class CastingB2pTask
extends Task {
    private final  g az;

        return String.valueOf(var1);
    }

    private static boolean lIlIlIlIlIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public CastingB2pTask(g g2) {
        this.az = g2;
    }

    static {
        A.lIlIlIlIIllllII();
        A.lIlIlIlIIllIlIl();
    }

    private static boolean lIlIlIlIIlllllI(int n2) {
        return n2 == 0;
    }

    public boolean run() {
        A var2;
        if (!A.lIlIlIlIIllllIl(this.az.m() ? 1 : 0) || A.lIlIlIlIIllllIl(this.az.l() ? 1 : 0)) {
            return lIIlIIllIllll[0];
        }
        if (A.lIlIlIlIIllllIl(var2.az.p() ? 1 : 0)) {
            return lIIlIIllIllll[0];
        }
        String[] stringArray = new String[lIIlIIllIllll[1]];
        stringArray[A.lIIlIIllIllll[0]] = lIIlIIllIllII[lIIlIIllIllll[0]];
        stringArray[A.lIIlIIllIllll[2]] = lIIlIIllIllII[lIIlIIllIllll[2]];
        if (A.lIlIlIlIIlllllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            return lIIlIIllIllll[0];
        }
        TileItem var3 = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(lIIlIIllIllII[lIIlIIllIllll[7]]));
        if (A.lIlIlIlIIllllll(var3) && A.lIlIlIlIIlllllI(Inventory.isFull() ? 1 : 0) && A.lIlIlIlIlIIIIII(var2.az.k(), lIIlIIllIllll[3])) {
            return lIIlIIllIllll[0];
        }
        int[] nArray = new int[lIIlIIllIllll[1]];
        nArray[A.lIIlIIllIllll[0]] = lIIlIIllIllll[4];
        nArray[A.lIIlIIllIllll[2]] = lIIlIIllIllll[5];
        Item var4 = Inventory.getFirst((int[])nArray);
        if (A.lIlIlIlIIllllll(var4)) {
            var4.interact(lIIlIIllIllII[lIIlIIllIllll[1]]);

            if (1 < 0) {
                return ((0x3B ^ 0x2A ^ (0xF6 ^ 0xA7)) & (0x77 ^ 0xF ^ (0x93 ^ 0xAB) ^ -1)) != 0;
            }
        } else {
            SpellBook.Standard var5 = SpellBook.Standard.BONES_TO_PEACHES;
            Magic.cast((Spell)var5);
        }
        this.sleep(lIIlIIllIllll[6]);
        return lIIlIIllIllll[2];
    }

    private static void lIlIlIlIIllIlIl() {
        lIIlIIllIllII = new String[lIIlIIllIllll[6]];
        A.lIIlIIllIllII[A.lIIlIIllIllll[0]] = "Bones";
        A.lIIlIIllIllII[A.lIIlIIllIllll[2]] = "Big bones";
        A.lIIlIIllIllII[A.lIIlIIllIllll[1]] = "Break";
        A.lIIlIIllIllII[A.lIIlIIllIllll[7]] = "bones";
    }

    private static boolean lIlIlIlIlIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlIIllllll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIlIIllllIl(int n2) {
        return n2 != 0;
    }

}

