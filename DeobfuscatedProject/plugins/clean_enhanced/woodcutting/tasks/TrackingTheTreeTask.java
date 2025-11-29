/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.woodcutting.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import gg.squire.woodcutting.tasks.GameEnum;

@Singleton
@TaskDesc(name="Tracking the tree", priority=420)
public class TrackingTheTreeTask
extends Task {
    private  long chopTimestamp;
    private final  SquireWoodcutterConfig M;
    
    private static final  List<i> N;

    static {
        l.var3();
        l.var4();
        N = new ArrayList<i>();
    }

    public static i x() {
        if ((N.isEmpty( != 0) ? 1 : 0)) {
            return null;
        }
        return N.get(0);
    }

    @Inject
    public TrackingTheTreeTask(SquireWoodcutterConfig squireWoodcutterConfig) {
        this.M = squireWoodcutterConfig;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < llllllllllllllIllIIllIIIIlllllIl2) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if ((0x71 ^ 0x75) > ((0xFA ^ 0xB6) & ~(0xE1 ^ 0xAD))) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var4_5;
        l var15;
        if (!(this.M.fastTickChop( != 0) ? 1 : 0) || (this.M.bank( != 0) ? 1 : 0)) {
            return 0;
        }
        List var16 = TileObjects.getAll(tileObject -> tileObject.getName().contains(this.M.tree().r()));
        i var17 = null;
        if ((N.isEmpty( == 0) ? 1 : 0)) {
            var17 = N.get(0);
        }
        if (var16 == null && var17 != null) {
            WorldPoint var18 = var17.w().getNearest();
            Movement.setDestination((WorldPoint)var18);
            return 1;
        }
        String[] stringArray = new String[1];
        stringArray[0] = var2[0];
        TileObject var18 = TileObjects.getNearest((String[])stringArray);
        if var18 == null {
            N.clear();
            return 0;
        }
        Object var19 = N.iterator();
        while ((var19.hasNext( != 0) ? 1 : 0)) {
            i var20 = var19.next();
            TileObject var21 = TileObjects.getNearest(tileObject -> {
                int n;
                if ((tileObject.getName( != 0).contains(this.M.tree().r()) ? 1 : 0) && (tileObject.getId() == tileObject.getId()2))) {
                    n = 1;
                    0;
                    if null != null {
                        return ((0x64 ^ 0x42) & ~(0x49 ^ 0x6F)) != 0;
                    }
                } else {
                    n = 0;
                }
                return n != 0;
            });
            if var21 == null {
                0;
                if (2 != 1) continue;
                return ((0x77 ^ 0x16 ^ (0x52 ^ 0x70)) & (9 + 7 - -132 + 67 ^ 97 + 110 - 77 + 18 ^ -1)) != 0;
            }
            N.remove((Object)var20);
            0;
            return 0;
        }
        var19 = i.b(var18);
        if ((N.containsllllllllllllllIllIIllIIIlIIlllII)) {
            return 0;
        }
        N.add((i)var4_5);
        0;
        return 1;
    }

}

