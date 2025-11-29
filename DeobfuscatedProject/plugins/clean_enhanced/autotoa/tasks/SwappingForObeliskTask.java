/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.concurrent.ExecutorService;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Swapping for obelisk", register=true)
public class SwappingForObeliskTask
extends AutotoaManager {

    private static void var3() {
        var1 = new int[3];
        aC.var1[0] = (0x68 ^ 0x50 ^ (0xDF ^ 0xB5)) & (0xE5 ^ 0xB9 ^ (0x81 ^ 0x8F) ^ -1);
        aC.var1[1] = 1;
        aC.var1[2] = 2;
    }

    private static boolean var4(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean aL() {
        return this.cf.obeliskGear().isSelected();
    }

    private static void var5() {
        var2 = new String[var1[1]];
        aC.var2[aC.var1[0]] = "Obelisk";
    }

    static {
        aC.var3();
        aC.var5();
    }

    @Inject
    public SwappingForObeliskTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    @Override
    public int[] j(String string) {
        if (aC.var4(string.contains(var2[var1[0]]) ? 1 : 0)) {
            return this.a(this.cf.obeliskGear());
        }
        return new int[var1[0]];
    }

        catch (Exception var11) {
            var11.printStackTrace();
            return null;
        }
    }
}

