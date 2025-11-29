/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.scurrius.tasks.ScurriusManager;

@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFE)
public class PrayerFlickingTask
extends Task {
    private final  SquireScurrius ak;

    @Inject
    public PrayerFlickingTask(SquireScurrius squireScurrius) {
        this.ak = squireScurrius;
    }

    private static boolean lIlIllIlIIlllIl(int n2, int n3) {
        return n2 <= n3;
    }

    private static void lIlIllIlIIlIIll() {
        lIIlIllIlIIlI = new String[lIIlIllIlIlIl[1]];
        w.lIIlIllIlIIlI[w.lIIlIllIlIlIl[0]] = "Scurrius";
        w.lIIlIllIlIIlI[w.lIIlIllIlIlIl[2]] = "Giant rat";
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> x() {
        void var1;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        arrayList.addAll(Prayers.getOffensive());

        int[] nArray = new int[lIIlIllIlIlIl[1]];
        nArray[w.lIIlIllIlIlIl[0]] = d.C;
        nArray[w.lIIlIllIlIlIl[2]] = d.D;
        Projectile projectile = Projectiles.getNearest((int[])nArray);
        if (w.lIlIllIlIIlllII(projectile) && w.lIlIllIlIIlllIl(projectile.getRemainingCycles(), lIIlIllIlIlIl[3])) {
            if (w.lIlIllIlIIllllI(projectile.getId(), d.C)) {
                arrayList.add(Prayer.PROTECT_FROM_MISSILES);

                }
            } else {
                var1.add(Prayer.PROTECT_FROM_MAGIC);

                if ((128 + 51 - 60 + 42 ^ 69 + 102 - 157 + 151) == -1) {
                    return null;
                }
            }
        } else {
            var1.add(Prayer.PROTECT_FROM_MELEE);

        }
        return arrayList;
    }

    private static boolean lIlIllIlIIlllII(Object object) {
        return object != null;
    }

    private static boolean lIlIllIlIIllIll(int n2) {
        return n2 <= 0;
    }

    public boolean run() {
        if (w.lIlIllIlIIllIIl(this.ak.c() ? 1 : 0)) {
            Prayers.disableAll();
            return lIIlIllIlIlIl[0];
        }
        String[] stringArray = new String[lIIlIllIlIlIl[1]];
        stringArray[w.lIIlIllIlIlIl[0]] = lIIlIllIlIIlI[lIIlIllIlIlIl[0]];
        stringArray[w.lIIlIllIlIlIl[2]] = lIIlIllIlIIlI[lIIlIllIlIlIl[2]];
        NPC var2 = NPCs.getNearest((String[])stringArray);
        if (w.lIlIllIlIIllIlI(var2)) {
            Prayers.disableAll();
            return lIIlIllIlIlIl[0];
        }
        if (w.lIlIllIlIIllIll(Prayers.getPoints())) {
            w var3;
            var3.ak.e(lIIlIllIlIlIl[2]);
            return lIIlIllIlIlIl[0];
        }
        Prayers.flick(this.x());

        return lIIlIllIlIlIl[0];
    }

    static {
        w.lIlIllIlIIlIlll();
        w.lIlIllIlIIlIIll();
    }

    private static boolean lIlIllIlIIllIlI(Object object) {
        return object == null;
    }

        return String.valueOf(var4);
    }

    private static boolean lIlIllIlIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIllIlIIllIIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIlIllIlIIllllI(int n2, int n3) {
        return n2 == n3;
    }
}

