/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.autotoa.tasks;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Progress Puzzle")
public class ProgressPuzzleTask
extends AutotoaManager {

    private static boolean var3(Object object) {
        return object != null;
    }

    @Inject
    protected ProgressPuzzleTask(Client client, z z2, TOAConfig tOAConfig, p p2) {
        super(client, z2, tOAConfig, p2);
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static void var16() {
        var1 = new String[var2[4]];
        bt.var1[bt.var2[1]] = "Barrier";
        bt.var1[bt.var2[0]] = "Crawl-through";
        bt.var1[bt.var2[3]] = "Platform";
        bt.var1[bt.var2[2]] = "Jump-to";
        bt.var1[bt.var2[5]] = "Quick-pass";
        bt.var1[bt.var2[6]] = "Passage";
    }

    private static boolean var17(int n2, int n3) {
        return n2 >= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var18;
        bt var19;
        String[] stringArray = new String[var2[0]];
        stringArray[bt.var2[1]] = var1[var2[1]];
        TileObject tileObject2 = TileObjects.getNearest((String[])stringArray);
        if (bt.var20(tileObject2)) {
            return var2[1];
        }
        int var21 = var19.cu.getLocalPlayer().getWorldX();
        if (bt.var22(var18.getWorldX(), var21)) {
            if (bt.var23(Players.getLocal().isMoving() ? 1 : 0)) {
                return var2[1];
            }
            if (bt.var17(var21, var19.fh.Z())) {
                return var2[1];
            }
            TileObject var24 = TileObjects.getNearest(tileObject -> tileObject.getName().equals(var1[var2[6]]));
            if (bt.var3(var24) && bt.var25(Math.abs(var24.getWorldX() - var19.fh.Z()), var2[2])) {
                var24.interact(var1[var2[0]]);
                return var2[0];
            }
            String[] stringArray2 = new String[var2[0]];
            stringArray2[bt.var2[1]] = var1[var2[3]];
            TileObject var26 = TileObjects.getNearest((String[])stringArray2);
            if (bt.var3(var26) && bt.var22(var26.getWorldX(), var19.fh.Z()) && bt.var25(Math.abs(var26.getWorldX() - var19.fh.Z()), var2[4])) {
                var26.interact(var1[var2[2]]);
                return var2[0];
            }
            return var2[1];
        }
        tileObject2.interact(var1[var2[5]]);
        return var2[0];
    }

    private static boolean var23(int n2) {
        return n2 != 0;
    }

    private static boolean var20(Object object) {
        return object == null;
    }

    private static void var27() {
        var2 = new int[8];
        bt.var2[0] = 1;
        bt.var2[1] = (0x87 ^ 0x82) & ~(0xC ^ 9);
        bt.var2[2] = 3;
        bt.var2[3] = 2;
        bt.var2[4] = 35 + 53 - -49 + 0 ^ 37 + 73 - -11 + 22;
        bt.var2[5] = 0xA6 ^ 0xA2;
        bt.var2[6] = 0x37 ^ 0x32;
        bt.var2[7] = 15 + 57 - -29 + 32 ^ 51 + 80 - 3 + 13;
    }

    private static String var28(String var29, String var30) {
        var29 = new String(Base64.getDecoder().decode(var29.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var31 = new StringBuilder();
        char[] var32 = var30.toCharArray();
        int var33 = var2[1];
        char[] var34 = var29.toCharArray();
        int var35 = var34.length;
        int var36 = var2[1];
        while (bt.var22(var36, var35)) {
            char var37 = var34[var36];
            var31.append((char)(var37 ^ var32[var33 % var32.length]));
            0;
            ++var33;
            ++var36;
            0;
            if (2 == 2) continue;
            return null;
        }
        return String.valueOf(var31);
    }

    private static boolean var22(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var25(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        bt.var27();
        bt.var16();
    }

    @Override
    public int bZ() {
        return this.fh.Z() + var2[0];
    }
}

