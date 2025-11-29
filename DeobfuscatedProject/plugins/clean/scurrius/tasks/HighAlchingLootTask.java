/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.MenuAction
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="High Alching loot", priority=60000)
public class HighAlchingLootTask
extends Task {

    private final  SquireScurriusConfig ad;
    private final  SquireScurrius ac;

    private static boolean lIlIllIIIlllIIl(Object object) {
        return object == null;
    }

    private static void lIlIllIIIllIlIl() {
        lIIlIlIlllIII = new String[lIIlIlIlllIIl[1]];
        s.lIIlIlIlllIII[s.lIIlIlIlllIIl[0]] = "Scurrius";
        s.lIIlIlIlllIII[s.lIIlIlIlllIIl[2]] = "Giant rat";
    }

    private static boolean lIlIllIIIllIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIIIlllIII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        void var3_3;
        s var1;
        if (s.lIlIllIIIllIlll(this.ad.highAlch() ? 1 : 0)) {
            return lIIlIlIlllIIl[0];
        }
        if (s.lIlIllIIIllIlll(var1.ac.c() ? 1 : 0)) {
            return lIIlIlIlllIIl[0];
        }
        String[] stringArray = new String[lIIlIlIlllIIl[1]];
        stringArray[s.lIIlIlIlllIIl[0]] = lIIlIlIlllIII[lIIlIlIlllIIl[0]];
        stringArray[s.lIIlIlIlllIIl[2]] = lIIlIlIlllIII[lIIlIlIlllIIl[2]];
        NPC var2 = NPCs.getNearest((String[])stringArray);
        if (s.lIlIllIIIlllIII(var2)) {
            return lIIlIlIlllIIl[0];
        }
        Item var3 = Inventory.getFirst(item -> d.x.contains(item.getName()));
        if (s.lIlIllIIIlllIIl(var3)) {
            return lIIlIlIlllIIl[0];
        }
        SpellBook.Standard var4 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (s.lIlIllIIIllIlll(var4.canCast() ? 1 : 0)) {
            return lIIlIlIlllIIl[0];
        }
        Magic.cast((Spell)var3_3);
        var2_2.interact(lIIlIlIlllIIl[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), var2_2.getSlot(), WidgetInfo.INVENTORY.getId());
        return lIIlIlIlllIIl[2];
    }

    private static boolean lIlIllIIIlllIll(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> x() {
        void var5;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        arrayList.addAll(Prayers.getOffensive());

        int[] nArray = new int[lIIlIlIlllIIl[1]];
        nArray[s.lIIlIlIlllIIl[0]] = d.C;
        nArray[s.lIIlIlIlllIIl[2]] = d.D;
        Projectile projectile = Projectiles.getNearest((int[])nArray);
        if (s.lIlIllIIIlllIII(projectile) && s.lIlIllIIIlllIlI(projectile.getRemainingCycles(), lIIlIlIlllIIl[3])) {
            if (s.lIlIllIIIlllIll(projectile.getId(), d.C)) {
                arrayList.add(Prayer.PROTECT_FROM_MISSILES);

                if (3 < 1) {
                    return null;
                }
            } else {
                var5.add(Prayer.PROTECT_FROM_MAGIC);

                if (3 <= 1) {
                    return null;
                }
            }
        } else {
            var5.add(Prayer.PROTECT_FROM_MELEE);

        }
        return arrayList;
    }

    @Inject
    public HighAlchingLootTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.ac = squireScurrius;
        this.ad = squireScurriusConfig;
    }

    private static boolean lIlIllIIIlllIlI(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        s.lIlIllIIIllIllI();
        s.lIlIllIIIllIlIl();
    }
}

