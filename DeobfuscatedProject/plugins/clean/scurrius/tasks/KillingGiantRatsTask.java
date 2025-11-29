/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
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
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GraphicsObject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="Killing Giant Rats", priority=5001)
public class KillingGiantRatsTask
extends Task {

    private final  SquireScurriusConfig af;
    private final  SquireScurrius ae;

    /*
     * WARNING - void declaration
     */
    private List<Prayer> x() {
        void var1;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        if (t.lIlIllIlIllIIIl(Static.getClient().getVarbitValue(lIIlIllIllIIl[2]), lIIlIllIllIIl[3])) {
            Prayer[] prayerArray = new Prayer[lIIlIllIllIIl[4]];
            prayerArray[t.lIIlIllIllIIl[0]] = Prayer.INCREDIBLE_REFLEXES;
            prayerArray[t.lIIlIllIllIIl[1]] = Prayer.ULTIMATE_STRENGTH;
            prayerArray[t.lIIlIllIllIIl[5]] = Prayer.STEEL_SKIN;
            List<Prayer> list = Arrays.asList(prayerArray);
            arrayList.addAll(list);

        } else {
            var1.add(Prayer.PIETY);

        }
        int[] nArray = new int[lIIlIllIllIIl[5]];
        nArray[t.lIIlIllIllIIl[0]] = d.C;
        nArray[t.lIIlIllIllIIl[1]] = d.D;
        Projectile var2 = Projectiles.getNearest((int[])nArray);
        if (t.lIlIllIlIlIllII(var2) && t.lIlIllIlIllIIlI(var2.getRemainingCycles(), lIIlIllIllIIl[6])) {
            if (t.lIlIllIlIlIlllI(var2.getId(), d.C)) {
                var1.add(Prayer.PROTECT_FROM_MISSILES);

                if (2 < 0) {
                    return null;
                }
            } else {
                var1.add(Prayer.PROTECT_FROM_MAGIC);

                if ((136 + 183 - 220 + 89 ^ 144 + 136 - 254 + 158) == -1) {
                    return null;
                }
            }
        } else {
            var1.add(Prayer.PROTECT_FROM_MELEE);

        }
        return arrayList;
    }

    private static void lIlIllIlIlIlIIl() {
        lIIlIllIllIII = new String[lIIlIllIllIIl[7]];
        t.lIIlIllIllIII[t.lIIlIllIllIIl[0]] = "Scurrius";
        t.lIIlIllIllIII[t.lIIlIllIllIIl[1]] = "Attack";
        t.lIIlIllIllIII[t.lIIlIllIllIIl[5]] = "Eat";
        t.lIIlIllIllIII[t.lIIlIllIllIIl[4]] = "Giant rat";
    }

    private static boolean lIlIllIlIllIIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var3);
    }

    private static boolean lIlIllIlIllIIIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIlIllIlIlIllll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        t var4;
        if (t.lIlIllIlIlIlIll(this.ae.c() ? 1 : 0)) {
            return lIIlIllIllIIl[0];
        }
        String[] stringArray = new String[lIIlIllIllIIl[1]];
        stringArray[t.lIIlIllIllIIl[0]] = lIIlIllIllIII[lIIlIllIllIIl[0]];
        NPC var5 = NPCs.getNearest((String[])stringArray);
        if (t.lIlIllIlIlIlIll(var4.af.focusRats() ? 1 : 0) && t.lIlIllIlIlIllII(var5)) {
            return lIIlIllIllIIl[0];
        }
        Iterator var6 = Static.getClient().getGraphicsObjects().iterator();
        while (t.lIlIllIlIlIllIl(var6.hasNext() ? 1 : 0)) {
            GraphicsObject var7 = (GraphicsObject)var6.next();
            if (t.lIlIllIlIlIlllI(var7.getId(), d.B)) {
                return lIIlIllIllIIl[0];
            }

            if (3 > 0) continue;
            return false;
        }
        var6 = NPCs.getNearest(nPC -> {
            int n2;
            if (t.lIlIllIlIlIllIl(nPC.getName().equals(lIIlIllIllIII[lIIlIllIllIIl[4]]) ? 1 : 0) && t.lIlIllIlIlIlIll(nPC.isDead() ? 1 : 0)) {
                n2 = lIIlIllIllIIl[1];

                if ((0xA6 ^ 0xA2) <= 0) {
                    return false;
                }
            } else {
                n2 = lIIlIllIllIIl[0];
            }
            return n2 != 0;
        });
        if (t.lIlIllIlIlIllll(var6)) {
            int var7 = Inventory.getCount(item -> {
                String[] stringArray = new String[lIIlIllIllIIl[1]];
                stringArray[t.lIIlIllIllIIl[0]] = lIIlIllIllIII[lIIlIllIllIIl[5]];
                return item.hasAction(stringArray);
            });
            if (t.lIlIllIlIllIIII(var7, var4.af.food())) {
                var4.ae.e(lIIlIllIllIIl[1]);
                return lIIlIllIllIIl[1];
            }
            return lIIlIllIllIIl[0];
        }
        var2_2.interact(lIIlIllIllIII[lIIlIllIllIIl[1]]);
        return lIIlIllIllIIl[1];
    }

    @Inject
    public KillingGiantRatsTask(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig) {
        this.ae = squireScurrius;
        this.af = squireScurriusConfig;
    }

    private static boolean lIlIllIlIlIllIl(int n2) {
        return n2 != 0;
    }

    static {
        t.lIlIllIlIlIlIlI();
        t.lIlIllIlIlIlIIl();
    }

    private static boolean lIlIllIlIllIIlI(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIllIlIlIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIlIlIllII(Object object) {
        return object != null;
    }

    private static boolean lIlIllIlIlIlllI(int n2, int n3) {
        return n2 == n3;
    }
}

