/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.zulrah.tasks;

import gg.squire.zulrah.tasks.GameEnum40;
import gg.squire.zulrah.tasks.GameEnum16;
import gg.squire.zulrah.tasks.GameEnum18;
import gg.squire.zulrah.tasks.THelper;
import gg.squire.zulrah.tasks.ZulrahManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Traversing to Zul-andra")
public class TraversingToZulandraTask
extends Task {
    private final  SquireZulrah aS;
    private static final  WorldPoint aQ;
    
    private final  v aT;
    private static final  int aP;
    
    private static final  int aO;
    private final  SquireZulrahConfig aR;
    private final  Client aU;

    private static boolean llIIlIlIIIIIlll(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIlIlIIIIlIlI(int n2, int n3) {
        return n2 != n3;
    }

    private static void llIIlIlIIIIIIII() {
        lIllIllllllII = new String[lIllIllllllIl[11]];
        ap.lIllIllllllII[ap.lIllIllllllIl[0]] = "Enter";
        ap.lIllIllllllII[ap.lIllIllllllIl[2]] = "Eat";
    }

    private static boolean llIIlIlIIIIIIll(int n2) {
        return n2 != 0;
    }

    private static boolean llIIlIlIIIIlIIl(Object object) {
        return object == null;
    }

    private boolean ak() {
        if (ap.llIIlIlIIIIIIll(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)aQ);

        }
        return lIllIllllllIl[2];
    }

    static {
        ap.llIIlIlIIIIIIIl();
        ap.llIIlIlIIIIIIII();
        aP = lIllIllllllIl[7];
        aO = lIllIllllllIl[8];
        aQ = new WorldPoint(lIllIllllllIl[9], lIllIllllllIl[10], lIllIllllllIl[0]);
    }

    private static boolean llIIlIlIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIlIlIIIIIlIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llIIlIlIIIIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llIIlIlIIIIIIlI(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_6;
        int n2;
        int var1;
        ap var2;
        if (!ap.llIIlIlIIIIIIlI((Object)this.aS.a(), (Object)c.DONE) || ap.llIIlIlIIIIIIll(this.aS.d() ? 1 : 0)) {
            return lIllIllllllIl[0];
        }
        if (ap.llIIlIlIIIIIIlI((Object)var2.aR.transport(), (Object)q.ZUL_ANDRA_TELEPORT)) {
            return lIllIllllllIl[0];
        }
        WorldPoint var3 = Players.getLocal().getWorldLocation();
        if (ap.llIIlIlIIIIIIll(var2.aU.isInInstancedRegion() ? 1 : 0)) {
            int[] var4 = var2.aU.getMapRegions();
            var1 = var4.length;
            int var5 = lIllIllllllIl[0];
            while (ap.llIIlIlIIIIIlII(var5, var1)) {
                int var6 = var4[var5];
                if (ap.llIIlIlIIIIIlIl(var6, lIllIllllllIl[1])) {
                    return lIllIllllllIl[0];
                }
                ++var5;

                if (((75 + 198 - 144 + 121 ^ 155 + 98 - 95 + 22) & (197 + 2 - 24 + 38 ^ 53 + 75 - 2 + 29 ^ -1)) <= 0) continue;
                return ((0xDC ^ 0x93 ^ (0x7B ^ 0x1B)) & (0xE0 ^ 0xC0 ^ (0x32 ^ 0x3D) ^ -1)) != 0;
            }
        }
        int var4 = Inventory.getCount(item -> {
            String[] stringArray = new String[lIllIllllllIl[2]];
            stringArray[ap.lIllIllllllIl[0]] = lIllIllllllII[lIllIllllllIl[2]];
            return item.hasAction(stringArray);
        });
        if (!ap.llIIlIlIIIIIllI(Inventory.contains(item -> item.getName().startsWith(this.aR.cure().k())) ? 1 : 0) || ap.llIIlIlIIIIIIlI((Object)var2.aR.cure(), (Object)o.IGNORE)) {
            n2 = lIllIllllllIl[2];

            if ((0x3A ^ 0x5C ^ (0xD8 ^ 0xBA)) != (0x26 ^ 0x7B ^ (0x61 ^ 0x38))) {
                return ((0xFE ^ 0xB4 ^ (0x33 ^ 0x2C)) & (0x5B ^ 0x64 ^ (0x28 ^ 0x42) ^ -1)) != 0;
            }
        } else {
            n2 = var1 = lIllIllllllIl[0];
        }
        if (!ap.llIIlIlIIIIIlll(var4, var2.aR.multiple()) || ap.llIIlIlIIIIIllI(var1)) {
            return lIllIllllllIl[0];
        }
        if (ap.llIIlIlIIIIIIll(var2.aR.bankLocation().g().contains(var3.getRegionID()) ? 1 : 0)) {
            return lIllIllllllIl[0];
        }
        if (ap.llIIlIlIIIIlIII(aQ.distanceTo(var3), lIllIllllllIl[3]) && ap.llIIlIlIIIIIlll(var3.getX(), aQ.getX())) {
            return lIllIllllllIl[0];
        }
        int[] nArray = new int[lIllIllllllIl[2]];
        nArray[ap.lIllIllllllIl[0]] = lIllIllllllIl[4];
        TileObject var5 = TileObjects.getNearest((int[])nArray);
        if (ap.llIIlIlIIIIlIIl(var5)) {
            if (ap.llIIlIlIIIIlIlI(var3.getRegionID(), lIllIllllllIl[5])) {
                return var2.ak();
            }
            return lIllIllllllIl[0];
        }
        var4_6.interact(lIllIllllllII[lIllIllllllIl[0]]);
        this.sleep(lIllIllllllIl[6]);
        return lIllIllllllIl[2];
    }

    private static boolean llIIlIlIIIIIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected TraversingToZulandraTask(SquireZulrahConfig squireZulrahConfig, SquireZulrah squireZulrah, v v2, Client client, t t2) {
        this.aR = squireZulrahConfig;
        this.aS = squireZulrah;
        this.aT = v2;
        this.aU = client;
    }
}

