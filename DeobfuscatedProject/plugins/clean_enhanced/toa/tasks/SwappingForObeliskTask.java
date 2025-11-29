/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.ToaManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.util.concurrent.ExecutorService;

@TaskDesc(name="Swapping for obelisk", register=true)
public class SwappingForObeliskTask
extends ToaManager {

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean C() {
        return this.aL.obeliskGear().isSelected();
    }

    private static boolean var9(int n2) {
        return n2 != 0;
    }

    private static void var10() {
        var1 = new String[var2[1]];
        E.var1[E.var2[0]] = "Obelisk";
    }

    static {
        E.var11();
        E.var10();
    }

    private static void var11() {
        var2 = new int[3];
        E.var2[0] = (0x19 ^ 9) & ~(0x12 ^ 2);
        E.var2[1] = 1;
        E.var2[2] = 2;
    }

    @Inject
    public SwappingForObeliskTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    @Override
    public int[] a(String string) {
        if (E.var9(string.contains(var1[var2[0]]) ? 1 : 0)) {
            return this.a(this.aL.obeliskGear());
        }
        return new int[var2[0]];
    }
}

