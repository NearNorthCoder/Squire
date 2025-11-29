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
import java.util.Comparator;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Doing pressure order", priority=5, blocking=true)
public class DoingPressureOrderTask
extends AutotoaManager {

    private final  Set<WorldPoint> fv;

    private static void var3() {
        var2 = new String[var1[5]];
        bq.var2[bq.var1[1]] = "Ancient button";
        bq.var2[bq.var1[0]] = "Push";
        bq.var2[bq.var1[6]] = "Next: %s, %s";
        bq.var2[bq.var1[8]] = "Closest: %s";
        bq.var2[bq.var1[9]] = "Ancient button";
    }

    @Override
    public boolean bj() {
        boolean bl2;
        int[] nArray = new int[var1[0]];
        nArray[bq.var1[1]] = var1[2];
        if (bq.var4(TileObjects.getAll((int[])nArray).size(), var1[3])) {
            bl2 = var1[0];
            0;
            if ((0x3D ^ 0x28 ^ (0x6C ^ 0x7D)) == ((2 ^ 0x3C ^ 1) & (0x61 ^ 0x5F ^ 1 ^ -1) & ((0xC2 ^ 0x97 ^ (0x50 ^ 8)) & (24 + 77 - 91 + 126 ^ 75 + 97 - 101 + 62 ^ -1) ^ -1))) {
                return (2 & (2 ^ -1)) != 0;
            }
        } else {
            bl2 = var1[1];
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
        void var5;
        bq var6;
        Queue<WorldPoint> queue = this.fh.R();
        if (!bq.var7(queue) || bq.var8(queue.isEmpty() ? 1 : 0)) {
            String[] stringArray = new String[var1[0]];
            stringArray[bq.var1[1]] = var2[var1[1]];
            TileObject var9 = TileObjects.getNearest((String[])stringArray);
            if (bq.var10(var9)) {
                return var1[1];
            }
            var9.interact(var2[var1[0]]);
            var6.sleep(var1[5]);
            return var1[0];
        }
        WorldPoint var9 = Players.getLocal().getWorldLocation();
        WorldPoint var11 = (WorldPoint)var5.peek();
        if (bq.var7(var11) && bq.var8(var11.equals((Object)var9) ? 1 : 0)) {
            var5.remove();
            0;
        }
        Object[] objectArray = new Object[var1[6]];
        objectArray[bq.var1[1]] = var11;
        objectArray[bq.var1[0]] = var6.fv;
        Log.info((String)var2[var1[6]], (Object[])objectArray);
        WorldArea var12 = var9.dx(var1[7]).dy(var1[7]).createWorldArea(var1[8], var1[8]);
        if (bq.var8(var12.contains(var11) ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var11);
            0;
            if (-3 > 0) {
                return ((0xF ^ 0x5F) & ~(0x4C ^ 0x1C)) != 0;
            }
        } else {
            WorldPoint var13 = var12.toWorldPointList().stream().filter(worldPoint -> {
                int[] nArray = new int[var1[0]];
                nArray[bq.var1[1]] = var1[4];
                return TileObjects.getAll((int[])nArray).stream().noneMatch(tileObject -> tileObject.getWorldLocation().equals(worldPoint));
            }).filter(worldPoint2 -> {
                boolean bl2;
                if (bq.var14(worldPoint2.equals((Object)var9) ? 1 : 0)) {
                    bl2 = var1[0];
                    0;
                    if ((0x12 ^ 0x16) == -1) {
                        return ((0x45 ^ 0x7E) & ~(0xC ^ 0x37)) != 0;
                    }
                } else {
                    bl2 = var1[1];
                }
                return bl2;
            }).min(Comparator.comparingInt(worldPoint2 -> worldPoint2.distanceTo(var11))).orElse(null);
            Object[] objectArray2 = new Object[var1[0]];
            objectArray2[bq.var1[1]] = var13;
            Log.info((String)var2[var1[8]], (Object[])objectArray2);
            if (bq.var7(var13)) {
                Movement.setDestination((WorldPoint)var13);
            }
        }
        return var1[0];
    }

    private static void var15() {
        var1 = new int[11];
        bq.var1[0] = 1;
        bq.var1[1] = (0x92 ^ 0x95) & ~(0xB3 ^ 0xB4);
        bq.var1[2] = 0xFFFFB7DD & 0xF93F;
        bq.var1[3] = 43 + 5 - 4 + 140 ^ 117 + 56 - 158 + 162;
        bq.var1[4] = -(0xFFFF89F2 & 0x7EEF) & (0xFFFFFDFF & 0xBBFD);
        bq.var1[5] = 123 + 27 - 107 + 140 ^ 52 + 105 - 81 + 102;
        bq.var1[6] = 2;
        bq.var1[7] = -1;
        bq.var1[8] = 3;
        bq.var1[9] = 0x78 ^ 0x7C;
        bq.var1[10] = 0x6D ^ 0x57 ^ (0x50 ^ 0x62);
    }

    private static boolean var8(int n2) {
        return n2 != 0;
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean bk() {
        int[] nArray = new int[var1[0]];
        nArray[bq.var1[1]] = var1[4];
        return TileObjects.getAll((int[])nArray).stream().anyMatch(Reachable::isInteractable);
    }

    private static boolean var4(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = var1[1];
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = var1[1];
        while (bq.var22(var31, var30)) {
            char var32 = var29[var31];
            var26.append((char)(var32 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(var26);
    }

    static {
        bq.var15();
        bq.var3();
    }

    private static boolean var7(Object object) {
        return object != null;
    }

    @Override
    public void r() {
        this.fv.clear();
    }

    @Override
    public int bZ() {
        String[] stringArray = new String[var1[0]];
        stringArray[bq.var1[1]] = var2[var1[9]];
        TileObject tileObject = TileObjects.getNearest((String[])stringArray);
        if (bq.var7(tileObject)) {
            return tileObject.getWorldLocation().getX();
        }
        return var1[1];
    }

    private static boolean var10(Object object) {
        return object == null;
    }

    private static boolean var14(int n2) {
        return n2 == 0;
    }

        catch (Exception var38) {
            var38.printStackTrace();
            return null;
        }
    }
}

