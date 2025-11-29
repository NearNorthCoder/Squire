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
package gg.squire.bandos.tasks;

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
import gg.squire.bandos.tasks.EHelper;

@TaskDesc(name="Casting B2P", priority=6)
public class CastingB2pTask
extends Task {
    private final  e ai;

    private static boolean lIlIllIllIllll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        s var1;
        if (!s.lIlIllIllIllll(this.ai.t() ? 1 : 0) || s.lIlIllIllIllll(this.ai.CastingB2pTask() ? 1 : 0)) {
            return lllIIIlIlII[0];
        }
        if (s.lIlIllIllIllll(var1.ai.w() ? 1 : 0)) {
            return lllIIIlIlII[0];
        }
        String[] stringArray = new String[lllIIIlIlII[1]];
        stringArray[s.lllIIIlIlII[0]] = lllIIIlIIll[lllIIIlIlII[0]];
        stringArray[s.lllIIIlIlII[2]] = lllIIIlIIll[lllIIIlIlII[2]];
        if (s.lIlIllIlllIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            return lllIIIlIlII[0];
        }
        TileItem var2 = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(lllIIIlIIll[lllIIIlIlII[7]]));
        if (s.lIlIllIlllIIIl(var2) && s.lIlIllIlllIIII(Inventory.isFull() ? 1 : 0) && s.lIlIllIlllIIlI(var1.ai.r(), lllIIIlIlII[3])) {
            return lllIIIlIlII[0];
        }
        int[] nArray = new int[lllIIIlIlII[1]];
        nArray[s.lllIIIlIlII[0]] = lllIIIlIlII[4];
        nArray[s.lllIIIlIlII[2]] = lllIIIlIlII[5];
        Item var3 = Inventory.getFirst((int[])nArray);
        if (s.lIlIllIlllIIIl(var3)) {
            var3.interact(lllIIIlIIll[lllIIIlIlII[1]]);

            if (3 < ((0x7C ^ 6 ^ (0xEC ^ 0x88)) & (0xB4 ^ 0x8D ^ (0x54 ^ 0x73) ^ -1))) {
                return ((167 + 161 - 187 + 56 ^ 58 + 104 - 15 + 6) & (0xB ^ 0x30 ^ (0x24 ^ 0x43) ^ -1)) != 0;
            }
        } else {
            SpellBook.Standard var4 = SpellBook.Standard.BONES_TO_PEACHES;
            if (s.lIlIllIllIllll(var4.canCast() ? 1 : 0)) {
                Magic.cast((Spell)var4);
            }
        }
        this.sleep(lllIIIlIlII[6]);
        return lllIIIlIlII[2];
    }

    private static boolean lIlIllIlllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        s.lIlIllIllIlllI();
        s.lIlIllIllIllIl();
    }

    private static boolean lIlIllIlllIIII(int n2) {
        return n2 == 0;
    }

    @Inject
    public CastingB2pTask(e e2) {
        this.ai = e2;
    }

    private static boolean lIlIllIlllIIIl(Object object) {
        return object != null;
    }

    private static void lIlIllIllIllIl() {
        lllIIIlIIll = new String[lllIIIlIlII[6]];
        s.lllIIIlIIll[s.lllIIIlIlII[0]] = "Bones";
        s.lllIIIlIIll[s.lllIIIlIlII[2]] = "Big bones";
        s.lllIIIlIIll[s.lllIIIlIlII[1]] = "Break";
        s.lllIIIlIIll[s.lllIIIlIlII[7]] = "bones";
    }
}

