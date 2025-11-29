/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Doing pressure order", priority=5, blocking=true)
public class DoingPressureOrderTask
extends AutotoaTaskBase {

    private final  Set<WorldPoint> fv;

    private static void lIIlllIIllIIII() {
        llIIIIIlIIl = new String[llIIIIIllIl[5]];
        bq.llIIIIIlIIl[bq.llIIIIIllIl[1]] = "Ancient button";
        bq.llIIIIIlIIl[bq.llIIIIIllIl[0]] = "Push";
        bq.llIIIIIlIIl[bq.llIIIIIllIl[6]] = "Next: %s, %s";
        bq.llIIIIIlIIl[bq.llIIIIIllIl[8]] = "Closest: %s";
        bq.llIIIIIlIIl[bq.llIIIIIllIl[9]] = "Ancient button";
    }

    @Override
    public boolean bj() {
        boolean bl2;
        int[] nArray = new int[llIIIIIllIl[0]];
        nArray[bq.llIIIIIllIl[1]] = llIIIIIllIl[2];
        if (bq.lIIlllIIlllIII(TileObjects.getAll((int[])nArray).size(), llIIIIIllIl[3])) {
            bl2 = llIIIIIllIl[0];

            if ((0x3D ^ 0x28 ^ (0x6C ^ 0x7D)) == ((2 ^ 0x3C ^ 1) & (0x61 ^ 0x5F ^ 1 ^ -1) & ((0xC2 ^ 0x97 ^ (0x50 ^ 8)) & (24 + 77 - 91 + 126 ^ 75 + 97 - 101 + 62 ^ -1) ^ -1))) {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            bl2 = llIIIIIllIl[1];
        }
        return bl2;
    }

    @Inject
    protected DoingPressureOrderTask(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
        this.fv = new HashSet<WorldPoint>();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var1;
        bq var2;
        Queue<WorldPoint> queue = this.fh.R();
        if (!bq.lIIlllIIlllIIl(queue) || bq.lIIlllIIlllIlI(queue.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[llIIIIIllIl[0]];
            stringArray[bq.llIIIIIllIl[1]] = llIIIIIlIIl[llIIIIIllIl[1]];
            TileObject var3 = TileObjects.getNearest((String[])stringArray);
            if (bq.lIIlllIIlllIll(var3)) {
                return llIIIIIllIl[1];
            }
            var3.interact(llIIIIIlIIl[llIIIIIllIl[0]]);
            var2.sleep(llIIIIIllIl[5]);
            return llIIIIIllIl[0];
        }
        WorldPoint var3 = Players.getLocal().getWorldLocation();
        WorldPoint var4 = (WorldPoint)var1.peek();
        if (bq.lIIlllIIlllIIl(var4) && bq.lIIlllIIlllIlI(var4.equals((Object)var3) ? 1 : 0)) {
            var1.remove();

        }
        Object[] objectArray = new Object[llIIIIIllIl[6]];
        objectArray[bq.llIIIIIllIl[1]] = var4;
        objectArray[bq.llIIIIIllIl[0]] = var2.fv;
        Log.info((String)llIIIIIlIIl[llIIIIIllIl[6]], (Object[])objectArray);
        WorldArea var5 = var3.dx(llIIIIIllIl[7]).dy(llIIIIIllIl[7]).createWorldArea(llIIIIIllIl[8], llIIIIIllIl[8]);
        if (bq.lIIlllIIlllIlI(var5.contains(var4) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var4);

        } else {
            WorldPoint var6 = var5.toWorldPointList().stream().filter(worldPoint -> {
                int[] nArray = new int[llIIIIIllIl[0]];
                nArray[bq.llIIIIIllIl[1]] = llIIIIIllIl[4];
                return TileObjects.getAll((int[])nArray).stream().noneMatch(tileObject -> tileObject.getWorldLocation().equals(worldPoint));
            }).filter(worldPoint2 -> {
                boolean bl2;
                if (bq.lIIlllIIllllII(worldPoint2.equals((Object)var3) ? 1 : 0)) {
                    bl2 = llIIIIIllIl[0];

                    if ((0x12 ^ 0x16) == -1) {
                        return false;
                    }
                } else {
                    bl2 = llIIIIIllIl[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(var4))).orElse(null);
            Object[] objectArray2 = new Object[llIIIIIllIl[0]];
            objectArray2[bq.llIIIIIllIl[1]] = var6;
            Log.info((String)llIIIIIlIIl[llIIIIIllIl[8]], (Object[])objectArray2);
            if (bq.lIIlllIIlllIIl(var6)) {
                Movement.setDestination((WorldPoint)var6);
            }
        }
        return llIIIIIllIl[0];
    }

    private static boolean lIIlllIIlllIlI(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean bk() {
        int[] nArray = new int[llIIIIIllIl[0]];
        nArray[bq.llIIIIIllIl[1]] = llIIIIIllIl[4];
        return TileObjects.getAll((int[])nArray).stream().anyMatch(Reachable::isInteractable);
    }

    private static boolean lIIlllIIlllIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIlllIIllllIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var7);
    }

    static {
        bq.lIIlllIIllIlll();
        bq.lIIlllIIllIIII();
    }

    private static boolean lIIlllIIlllIIl(Object object) {
        return object != null;
    }

    @Override
    public void r() {
        this.fv.clear();
    }

    @Override
    public int bZ() {
        String[] stringArray = new String[llIIIIIllIl[0]];
        stringArray[bq.llIIIIIllIl[1]] = llIIIIIlIIl[llIIIIIllIl[9]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (bq.lIIlllIIlllIIl(tileObject)) {
            return tileObject.getWorldLocation().getX();
        }
        return llIIIIIllIl[1];
    }

    private static boolean lIIlllIIlllIll(Object object) {
        return object == null;
    }

    private static boolean lIIlllIIllllII(int n2) {
        return n2 == 0;
    }

}

