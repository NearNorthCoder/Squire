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

@TaskDesc(name="Kephri Gear Swapping", register=true)
public class KephriGearSwappingTask
extends ToaManager {

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[1];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[1];
        while (O.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (3 > 0) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var14(int n2) {
        return n2 != 0;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static void var21() {
        var2 = new String[var1[5]];
        O.var2[O.var1[1]] = "Soldier Scarab";
        O.var2[O.var1[2]] = "Kephri";
        O.var2[O.var1[3]] = "Arcane Scarab";
        O.var2[O.var1[4]] = "Scarab Swarm";
    }

    @Inject
    public KephriGearSwappingTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static void var22() {
        var1 = new int[7];
        O.var1[0] = -1;
        O.var1[1] = (0x27 ^ 0x7A) & ~(0xA ^ 0x57);
        O.var1[2] = 1;
        O.var1[3] = 2;
        O.var1[4] = 3;
        O.var1[5] = 0x34 ^ 0x30;
        O.var1[6] = 62 + 84 - 28 + 72 ^ 78 + 40 - 47 + 111;
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        int var24;
        String string2 = string;
        int n2 = var1[0];
        switch (string2.hashCode()) {
            case 829390592: {
                void var25;
                if (!O.var14(var25.equals(var2[var1[1]]) ? 1 : 0)) break;
                var24 = var1[1];
                0;
                if (3 > 0) break;
                return null;
            }
            case -2051065175: {
                void var25;
                if (!O.var14(var25.equals(var2[var1[2]]) ? 1 : 0)) break;
                var24 = var1[2];
                0;
                if (-1 <= 0) break;
                return null;
            }
            case 32389500: {
                void var25;
                if (!O.var14(var25.equals(var2[var1[3]]) ? 1 : 0)) break;
                var24 = var1[3];
                0;
                if (3 >= 1) break;
                return null;
            }
            case -2127561158: {
                void var25;
                if (!O.var14(var25.equals(var2[var1[4]]) ? 1 : 0)) break;
                var24 = var1[4];
            }
        }
        switch (var24) {
            case 0: {
                O var26;
                return var26.a(var26.aL.kephriGearSwap());
            }
            case 1: {
                O var26;
                return var26.a(var26.aL.kephriSpecialGear(), var26.aL.kephriGearSwap(), var26.aL.kephriSpecialReq());
            }
            case 2: {
                O var26;
                return var26.a(var26.aL.kephriMager());
            }
            case 3: {
                O var26;
                return var26.a(var26.aL.kephriSwarm());
            }
        }
        return new int[var1[1]];
    }

    static {
        O.var22();
        O.var21();
    }

        catch (Exception var32) {
            var32.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean C() {
        boolean bl;
        if (!O.var23(this.aL.kephriGearSwap().isSelected() ? 1 : 0) || !O.var23(this.aL.kephriMager().isSelected() ? 1 : 0) || O.var14(this.aL.kephriSwarm().isSelected() ? 1 : 0)) {
            bl = var1[2];
            0;
            if (1 == ((0x86 ^ 0xB6) & ~(0x46 ^ 0x76))) {
                return ((0x73 ^ 0x50) & ~(0x82 ^ 0xA1)) != 0;
            }
        } else {
            bl = var1[1];
        }
        return bl;
    }
}

