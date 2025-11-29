/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package gg.squire.barrows.tasks;

import gg.squire.barrows.SquireBarrows;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import gg.squire.barrows.tasks.GameEnum2;

@TaskDesc(name="Exiting crypt", priority=150, blocking=true)
public class ExitingCryptTask
extends Task {

    private final  SquireBarrows W;

    private static void var3() {
        var2 = new int[4];
        p.var2[0] = (0x2E ^ 0x72) & ~(0x45 ^ 0x19);
        p.var2[1] = 0xCA ^ 0x97 ^ (0x54 ^ 0xC);
        p.var2[2] = 1;
        p.var2[3] = 2;
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean var10(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    static {
        p.var3();
        p.var12();
    }

    private static boolean var13(Object object, Object object2) {
        return object != object2;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static void var12() {
        var1 = new String[var2[3]];
        p.var1[p.var2[0]] = "Staircase";
        p.var1[p.var2[2]] = "Climb-up";
    }

    @Inject
    public ExitingCryptTask(SquireBarrows squireBarrows) {
        this.W = squireBarrows;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_2;
        p var15;
        if (p.var16(this.W.h() ? 1 : 0)) {
            return var2[0];
        }
        if (p.var16(var15.W.a(var15.W.s()) ? 1 : 0) && p.var17((Object)var15.W.r())) {
            return var2[0];
        }
        if (p.var16(var15.W.a(var15.W.s()) ? 1 : 0) && p.var13((Object)var15.W.r(), (Object)var15.W.s())) {
            return var2[0];
        }
        if (p.var18((Object)var15.W.r(), (Object)var15.W.s())) {
            int var19 = var2[0];
            d[] var20 = d.values();
            int var21 = var20.length;
            int var22 = var2[0];
            while (p.var14(var22, var21)) {
                d var23 = var20[var22];
                if (p.var11(var15.W.a(var23) ? 1 : 0)) {
                    ++var19;
                }
                ++var22;
                0;
                if null == null continue;
                return ((0x2B ^ 0x32) & ~(0x94 ^ 0x8D)) != 0;
            }
            if (p.var10(var19, var2[1])) {
                return var2[0];
            }
        }
        String[] stringArray = new String[var2[2]];
        stringArray[p.var2[0]] = var1[var2[0]];
        TileObject var19 = TileObjects.getNearest((String[])stringArray);
        if (p.var17(var19)) {
            return var2[0];
        }
        var1_2.interact(var1[var2[2]]);
        return var2[2];
    }

    private static boolean var16(int n2) {
        return n2 == 0;
    }

    private static boolean var18(Object object, Object object2) {
        return object == object2;
    }

    private static String var24(String var25, String var26) {
        var25 = new String(Base64.getDecoder().decode(var25.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var27 = new StringBuilder();
        char[] var28 = var26.toCharArray();
        int var29 = var2[0];
        char[] var30 = var25.toCharArray();
        int var31 = var30.length;
        int var32 = var2[0];
        while (p.var14(var32, var31)) {
            char var33 = var30[var32];
            var27.append((char)(var33 ^ var28[var29 % var28.length]));
            0;
            ++var29;
            ++var32;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return String.valueOf(var27);
    }

    private static boolean var17(Object object) {
        return object == null;
    }
}

