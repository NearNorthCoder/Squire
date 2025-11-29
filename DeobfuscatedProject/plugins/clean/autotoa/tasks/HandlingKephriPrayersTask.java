/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum80;

@TaskDesc(name="Handling Kephri Prayers", priority=0x7FFFFFFF)
public class HandlingKephriPrayersTask
extends AutotoaTaskBase {

    private  int eZ;

    private static boolean lIIllIlIIllIll(int n2) {
        return n2 != 0;
    }

    @Override
    public int aO() {
        return lIllllIIlIl[4];
    }

    @Override
    public List<Prayer> aN() {
        bj var1;
        if (bj.lIIllIlIIllIll(this.bW() ? 1 : 0)) {
            this.eZ = lIllllIIlIl[1];
        }
        if (bj.lIIllIlIIlllII(var1.eZ)) {
            var1.eZ -= lIllllIIlIl[2];
            return List.of(var1.aQ(), Prayer.PROTECT_FROM_MAGIC);
        }
        String[] stringArray = new String[lIllllIIlIl[2]];
        stringArray[bj.lIllllIIlIl[0]] = lIllllIIIIl[lIllllIIlIl[0]];
        NPC var2 = NPCs.getNearest((String[])stringArray);
        if (bj.lIIllIlIIlllIl(var2) && bj.lIIllIlIIllllI(var2.getWorldArea().distanceTo((Locatable)Players.getLocal()), lIllllIIlIl[3]) && bj.lIIllIlIIllIll(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            return List.of(var1.aQ(), Prayer.PROTECT_FROM_MELEE);
        }
        String[] stringArray2 = new String[lIllllIIlIl[3]];
        stringArray2[bj.lIllllIIlIl[0]] = lIllllIIIIl[lIllllIIlIl[2]];
        stringArray2[bj.lIllllIIlIl[2]] = lIllllIIIIl[lIllllIIlIl[3]];
        NPC var3 = NPCs.getNearest((String[])stringArray2);
        if (bj.lIIllIlIIlllIl(var3)) {
            return List.of(var1.aQ(), Prayer.PROTECT_FROM_MISSILES);
        }
        return List.of(this.aQ());
    }

    private static boolean lIIllIlIIlllll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllIlIlIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    static {
        bj.lIIllIlIIllIlI();
        bj.lIIllIlIIlIlll();
    }

    private static boolean lIIllIlIlIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIllIlIIllllI(int n2, int n3) {
        return n2 <= n3;
    }

        return String.valueOf(var4);
    }

    private static boolean lIIllIlIIlllII(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean bW() {
        boolean bl2;
        void var5;
        int n2 = lIllllIIlIl[0];
        Iterator var6 = Static.getClient().getGraphicsObjects().iterator();
        while (bj.lIIllIlIIllIll(var6.hasNext() ? 1 : 0)) {
            GraphicsObject var7 = (GraphicsObject)var6.next();
            if (bj.lIIllIlIIlllll(var7.getId(), lIllllIIlIl[9])) {
                ++var5;
            }

            if (2 > 0) continue;
            return false;
        }
        if (bj.lIIllIlIlIIIII((int)var5, lIllllIIlIl[1])) {
            bl2 = lIllllIIlIl[2];

            }
        } else {
            bl2 = lIllllIIlIl[0];
        }
        return bl2;
    }

    private static boolean lIIllIlIIlllIl(Object object) {
        return object != null;
    }

    @Override
    public boolean aS() {
        return lIllllIIlIl[2];
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    @Override
    public boolean aL() {
        int[] nArray = new int[lIllllIIlIl[5]];
        nArray[bj.lIllllIIlIl[0]] = lIllllIIlIl[6];
        nArray[bj.lIllllIIlIl[2]] = lIllllIIlIl[7];
        nArray[bj.lIllllIIlIl[3]] = lIllllIIlIl[8];
        return this.cm.a(nArray);
    }

    private static void lIIllIlIIlIlll() {
        lIllllIIIIl = new String[lIllllIIlIl[5]];
        bj.lIllllIIIIl[bj.lIllllIIlIl[0]] = "Soldier Scarab";
        bj.lIllllIIIIl[bj.lIllllIIlIl[2]] = "Spitting Scarab";
        bj.lIllllIIIIl[bj.lIllllIIlIl[3]] = "Agile Scarab";
    }

    @Inject
    public HandlingKephriPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.eZ = lIllllIIlIl[0];
    }
}

