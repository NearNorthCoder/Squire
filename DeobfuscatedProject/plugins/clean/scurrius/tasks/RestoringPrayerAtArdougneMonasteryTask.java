/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.client.Static
 */
package gg.squire.scurrius.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
import gg.squire.scurrius.tasks.ScurriusManager;
import gg.squire.scurrius.tasks.ScurriusTaskBase;

@TaskDesc(name="Restoring prayer at Ardougne Monastery", priority=2147483597, blocking=true)
public class RestoringPrayerAtArdougneMonasteryTask
extends ScurriusTaskBase {

    static {
        h.lIlIllIIlIlIlll();
        h.lIlIllIIlIlIllI();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean d(int n2) {
        void var1;
        int[] nArray = Static.getClient().getMapRegions();
        int n3 = nArray.length;
        int var2 = lIIlIllIIIIll[0];
        while (h.lIlIllIIlIlllII(var2, (int)var1)) {
            void var3;
            void var4;
            void var5 = var4[var2];
            if (h.lIlIllIIlIlllIl((int)var5, (int)var3)) {
                return lIIlIllIIIIll[2];
            }
            ++var2;

            if (2 >= -1) continue;
            return ((0x67 ^ 0x48 ^ (0x32 ^ 0x4B)) & (136 + 163 - 104 + 32 ^ 156 + 146 - 288 + 167 ^ -1)) != 0;
        }
        return lIIlIllIIIIll[0];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean a() {
        void var1_2;
        h var6;
        if (h.lIlIllIIlIllIII(this.b.ardyCloak() ? 1 : 0)) {
            return lIIlIllIIIIll[0];
        }
        if (h.lIlIllIIlIllIIl(Skills.getBoostedLevel((Skill)Skill.PRAYER), Skills.getLevel((Skill)Skill.PRAYER))) {
            return lIIlIllIIIIll[0];
        }
        if (h.lIlIllIIlIllIII(var6.d(r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.G) ? 1 : 0)) {
            Item var7 = Inventory.getFirst(item -> item.getName().startsWith(lIIlIllIIIIlI[lIIlIllIIIIll[7]]));
            if (h.lIlIllIIlIllIlI(var7)) {
                var7 = Equipment.getFirst(item -> item.getName().startsWith(lIIlIllIIIIlI[lIIlIllIIIIll[6]]));
            }
            if (h.lIlIllIIlIllIlI(var7)) {
                return lIIlIllIIIIll[0];
            }
            String[] stringArray = new String[lIIlIllIIIIll[1]];
            stringArray[h.lIIlIllIIIIll[0]] = lIIlIllIIIIlI[lIIlIllIIIIll[0]];
            stringArray[h.lIIlIllIIIIll[2]] = lIIlIllIIIIlI[lIIlIllIIIIll[2]];
            var7.interact(stringArray);
            return lIIlIllIIIIll[2];
        }
        if (h.lIlIllIIlIllIll(Players.getLocal().distanceTo(r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.H), lIIlIllIIIIll[3])) {
            Movement.setDestination((WorldPoint)r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.H);
            return lIIlIllIIIIll[2];
        }
        TileObject var7 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.lIlIllIIlIllllI(tileObject.getName().equals(lIIlIllIIIIlI[lIIlIllIIIIll[4]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIlIllIIIIll[2]];
                stringArray[h.lIIlIllIIIIll[0]] = lIIlIllIIIIlI[lIIlIllIIIIll[5]];
                if (h.lIlIllIIlIllllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIlIllIIIIll[2];

                    if (-1 < 3) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIlIllIIIIll[0];
            return n2 != 0;
        });
        if (h.lIlIllIIlIllIlI(var7)) {
            return lIIlIllIIIIll[0];
        }
        var1_2.interact(lIIlIllIIIIlI[lIIlIllIIIIll[1]]);
        return lIIlIllIIIIll[2];
    }

    private static boolean lIlIllIIlIllIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIlIllIIlIllIlI(Object object) {
        return object == null;
    }

    private static boolean lIlIllIIlIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIIlIllIll(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIlIllIIlIlllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIIlIllllI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIllIIlIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlIllIIlIlIllI() {
        lIIlIllIIIIlI = new String[lIIlIllIIIIll[8]];
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[0]] = "Kandarin Monastery";
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[2]] = "Monastery Teleport";
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[1]] = "Pray-at";
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[4]] = "Altar";
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[5]] = "Pray-at";
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[6]] = "Ardougne cloak";
        h.lIIlIllIIIIlI[h.lIIlIllIIIIll[7]] = "Ardougne cloak";
    }

        return String.valueOf(var8);
    }
}

