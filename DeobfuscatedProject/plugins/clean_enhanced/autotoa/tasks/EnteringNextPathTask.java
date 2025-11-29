/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum13;

@TaskDesc(name="Entering next path", priority=20, blocking=true)
public class EnteringNextPathTask
extends AutotoaManager {
    private final  TOAConfig ce;
    private final  B cd;
    
    private static final  int cc;

    private static boolean var3(Object object) {
        return object != null;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        TileObject var11;
        U var12;
        if (U.var13(this.j(var2[0]) ? 1 : 0)) {
            return var2[1];
        }
        TileObject tileObject = new l[var2[2]];
        tileObject[U.var2[1]] = var12.ce.firstRoom();
        tileObject[U.var2[3]] = var12.ce.secondRoom();
        tileObject[U.var2[4]] = var12.ce.thirdRoom();
        tileObject[U.var2[5]] = var12.ce.fourthRoom();
        TileObject var14 = var11 = tileObject;
        int var15 = ((l[])var14).length;
        int var16 = var2[1];
        while (U.var10(var16, var15)) {
            l var17 = var14[var16];
            int[] nArray = new int[var2[3]];
            nArray[U.var2[1]] = var17.F();
            TileObject var18 = TileObjects.getNearest((int[])nArray);
            if (U.var19(var18)) {
                var12.cd.a(var17);
                0;
                if null != null {
                    return ((0x45 ^ 0x66 ^ (0xB4 ^ 0xC1)) & (0xBB ^ 0xA5 ^ (0x70 ^ 0x38) ^ -1)) != 0;
                }
            } else {
                var18.interact(var1[var2[1]]);
                return var2[3];
            }
            ++var16;
            0;
            if (2 > 0) continue;
            return ((0x5B ^ 0x12 ^ (0xF ^ 0x72)) & (0x9F ^ 0xC5 ^ (0xA ^ 0x64) ^ -1)) != 0;
        }
        String[] stringArray = new String[var2[3]];
        stringArray[U.var2[1]] = var1[var2[3]];
        var14 = TileObjects.getNearest((String[])stringArray);
        if (U.var3(var14)) {
            var14.interact(var1[var2[4]]);
            return var2[3];
        }
        return var2[1];
    }

    private static void var20() {
        var1 = new String[var2[5]];
        U.var1[U.var2[1]] = "Quick-Enter";
        U.var1[U.var2[3]] = "Entry";
        U.var1[U.var2[4]] = "Quick-Enter";
    }

    private static boolean var19(Object object) {
        return object == null;
    }

    static {
        U.var21();
        U.var20();
        cc = var2[0];
    }

    private static void var21() {
        var2 = new int[7];
        U.var2[0] = -(0xFFFFFB7A & 0x4CAF) & (0xFFFFFFFB & 0x7F7D);
        U.var2[1] = (0x40 ^ 0x6E ^ (0x2B ^ 0x12)) & (0x7C ^ 0x57 ^ (0x2B ^ 0x17) ^ -1);
        U.var2[2] = 0x6A ^ 0x6E;
        U.var2[3] = 1;
        U.var2[4] = 2;
        U.var2[5] = 3;
        U.var2[6] = 0x89 ^ 0x81;
    }

    @Inject
    protected EnteringNextPathTask(Client client, B b2, TOAConfig tOAConfig) {
        super(client);
        this.cd = b2;
        this.ce = tOAConfig;
    }

        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }
}

