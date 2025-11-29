/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.ToaManager;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.util.concurrent.ExecutorService;
import javax.inject.Inject;

@TaskDesc(name="Gear Swapping Ba-Ba", register=true)
public class GearSwappingBabaTask
extends ToaManager {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public GearSwappingBabaTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        K var9;
        void var10;
        if (K.var11(string.equals(var2[var1[0]]) ? 1 : 0)) {
            return this.a(this.aL.babaSpecialStyle(), this.aL.babaAttackStyle(), this.aL.specGearBabaReq());
        }
        if (K.var11(var10.equals(var2[var1[1]]) ? 1 : 0)) {
            return var9.a(var9.aL.babaBaboonAttackStyle());
        }
        if (K.var11(var10.contains(var2[var1[2]]) ? 1 : 0)) {
            if (K.var11(var9.aL.redirectBoulderClicks() ? 1 : 0)) {
                var9.c(var1[3]);
            }
            return var9.a(var9.aL.babaBoulderAttackStyle());
        }
        return new int[var1[0]];
    }

    private static boolean var11(int n2) {
        return n2 != 0;
    }

    private static void var12() {
        var1 = new int[6];
        K.var1[0] = (0xEC ^ 0xA9) & ~(0x7F ^ 0x3A);
        K.var1[1] = 1;
        K.var1[2] = 2;
        K.var1[3] = 0xFFFFAF67 & 0x7E9F;
        K.var1[4] = 3;
        K.var1[5] = 54 + 117 - 91 + 52 ^ 105 + 17 - 45 + 63;
    }

    private static void var13() {
        var2 = new String[var1[4]];
        K.var2[K.var1[0]] = "Ba-Ba";
        K.var2[K.var1[1]] = "Baboon";
        K.var2[K.var1[2]] = "Boulder";
    }

    @Override
    public boolean C() {
        int n2;
        if (!K.var14(this.aL.babaAttackStyle().isSelected() ? 1 : 0) || !K.var14(this.aL.babaBaboonAttackStyle().isSelected() ? 1 : 0) || K.var11(this.aL.babaBoulderAttackStyle().isSelected() ? 1 : 0)) {
            n2 = var1[1];
            0;
            if (-2 >= 0) {
                return ((0x53 ^ 0x1E) & ~(0xC5 ^ 0x88)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var14(int n2) {
        return n2 == 0;
    }

    static {
        K.var12();
        K.var13();
    }
}

