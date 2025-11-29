/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Projectile
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Projectiles
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.client.Static
 */
package gg.squire.vardorvis.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Projectile;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.client.Static;
import gg.squire.vardorvis.tasks.VardorvisManager;

@TaskDesc(name="Prayer Flicking", priority=0x7FFFFFFE)
public class PrayerFlickingTask
extends Task {

    public boolean run() {
        int[] nArray = new int[lIlIlIIIIllll[0]];
        nArray[C.lIlIlIIIIllll[1]] = g.T;
        nArray[C.lIlIlIIIIllll[2]] = g.U;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        String[] stringArray = new String[lIlIlIIIIllll[2]];
        stringArray[C.lIlIlIIIIllll[1]] = lIlIlIIIIlllI[lIlIlIIIIllll[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (!C.lIllllIlIIllIlI(nPC) || !C.lIllllIlIIllIlI(nPC.getInteracting()) || C.lIllllIlIIllIll(tileObject)) {
            Prayers.disableAll();
            return lIlIlIIIIllll[1];
        }
        if (C.lIllllIlIIlllII(Prayers.getPoints())) {
            return lIlIlIIIIllll[1];
        }
        Prayers.flick(this.W());

        return lIlIlIIIIllll[1];
    }

    private static boolean lIllllIlIIllIll(Object object) {
        return object == null;
    }

    private static boolean lIllllIlIIllIlI(Object object) {
        return object != null;
    }

    private static boolean lIllllIlIIlllII(int n2) {
        return n2 <= 0;
    }

    static {
        C.lIllllIlIIllIIl();
        C.lIllllIlIIllIII();
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> W() {
        void var1;
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        if (C.lIllllIlIIlllIl(Static.getClient().getVarbitValue(lIlIlIIIIllll[3]), lIlIlIIIIllll[4])) {
            Prayer[] prayerArray = new Prayer[lIlIlIIIIllll[5]];
            prayerArray[C.lIlIlIIIIllll[1]] = Prayer.INCREDIBLE_REFLEXES;
            prayerArray[C.lIlIlIIIIllll[2]] = Prayer.ULTIMATE_STRENGTH;
            prayerArray[C.lIlIlIIIIllll[0]] = Prayer.STEEL_SKIN;
            List<Prayer> list = Arrays.asList(prayerArray);
            arrayList.addAll(list);

            if (3 <= 1) {
                return null;
            }
        } else {
            var1.add(Prayer.PIETY);

        }
        int[] nArray = new int[lIlIlIIIIllll[2]];
        nArray[C.lIlIlIIIIllll[1]] = g.S;
        Projectile var2 = Projectiles.getNearest((int[])nArray);
        if (C.lIllllIlIIllIlI(var2) && C.lIllllIlIIllllI(var2.getRemainingCycles(), lIlIlIIIIllll[6]) && C.lIllllIlIIlllll(var2.getRemainingCycles())) {
            var1.add(Prayer.PROTECT_FROM_MISSILES);

            if (3 == 0) {
                return null;
            }
        } else {
            var1.add(Prayer.PROTECT_FROM_MELEE);

        }
        return arrayList;
    }

    private static boolean lIllllIlIIlllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIllllIlIIllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIllllIlIIllIII() {
        lIlIlIIIIlllI = new String[lIlIlIIIIllll[2]];
        C.lIlIlIIIIlllI[C.lIlIlIIIIllll[1]] = "Vardorvis";
    }

    private static boolean lIllllIlIIlllIl(int n2, int n3) {
        return n2 != n3;
    }
}

