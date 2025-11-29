/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.ToaManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.util.concurrent.ExecutorService;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;

@TaskDesc(name="Warden gear swapping", register=true)
public class WardenGearSwappingTask
extends ToaManager {

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = var1[0];
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = var1[0];
        while (H.var12(var11, var10)) {
            char var13 = var9[var11];
            var6.append((char)(var13 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (2 < (62 + 160 - 48 + 9 ^ 144 + 56 - 36 + 15)) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    private static boolean var14(Object object) {
        return object == null;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    static {
        H.var21();
        H.var22();
    }

    @Override
    public boolean C() {
        int n2;
        if (!H.var23(this.aL.mageP2Warden().isSelected() ? 1 : 0) || !H.var23(this.aL.rangedP2Warden().isSelected() ? 1 : 0) || !H.var23(this.aL.normalCore().isSelected() ? 1 : 0) || H.var24(this.aL.specialCore().isSelected() ? 1 : 0)) {
            n2 = var1[1];
            0;
            if null != null {
                return ((0x21 ^ 0x54 ^ (0x5A ^ 0x3C)) & (7 + 45 - -122 + 0 ^ 171 + 133 - 137 + 22 ^ -1)) != 0;
            }
        } else {
            n2 = var1[0];
        }
        return n2 != 0;
    }

    private static boolean var12(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var23(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        H var25;
        void var26;
        if (H.var24(string.equals(var2[var1[0]]) ? 1 : 0)) {
            return this.a(this.aL.specialCore(), this.aL.normalCore(), this.aL.specGearCore());
        }
        if (H.var24(var26.equals(var2[var1[1]]) ? 1 : 0)) {
            return var25.a(var25.aL.skullsGear());
        }
        if (H.var23(var26.equals(var2[var1[2]]) ? 1 : 0) && H.var23(var26.equals(var2[var1[3]]) ? 1 : 0)) {
            return new int[var1[0]];
        }
        String[] stringArray = new String[var1[1]];
        stringArray[H.var1[0]] = var26;
        NPC var27 = NPCs.getNearest((String[])stringArray);
        if (H.var14(var27)) {
            return new int[var1[0]];
        }
        int var28 = var27.getId();
        if (!H.var29(var28, var1[4]) || H.var30(var28, var1[5])) {
            return var25.a(var25.aL.rangedP2Warden());
        }
        if (!H.var29(var28, var1[6]) || H.var30(var28, var1[7])) {
            return var25.a(var25.aL.mageP2Warden());
        }
        if (!H.var29(var28, var1[8]) || !H.var29(var28, var1[9]) || !H.var29(var28, var1[10]) || H.var30(var28, var1[11])) {
            return var25.a(var25.aL.finalWardenSpec(), var25.aL.finalWardenGear(), var25.aL.specFinalReq());
        }
        return new int[var1[0]];
    }

        catch (Exception var36) {
            var36.printStackTrace();
            return null;
        }
    }

    private static void var21() {
        var1 = new int[14];
        H.var1[0] = (4 + 0 - -119 + 74 ^ 91 + 56 - 137 + 145) & (89 + 160 - 47 + 45 ^ 106 + 34 - 2 + 31 ^ -1);
        H.var1[1] = 1;
        H.var1[2] = 2;
        H.var1[3] = 3;
        H.var1[4] = 0xFFFFFFEF & 0x2DFD;
        H.var1[5] = -(0xFFFFFAA6 & 0x155F) & (0xFFFFBFEF & 0x7DFF);
        H.var1[6] = 0xFFFFFDEE & 0x2FFD;
        H.var1[7] = 0xFFFFFDFD & 0x2FEB;
        H.var1[8] = 0xFFFFBDF9 & 0x6FF7;
        H.var1[9] = -(0xFFFFDE6F & 0x3399) & (0xFFFFFFFF & 0x3FFB);
        H.var1[10] = 0xFFFFBFFA & 0x6DF7;
        H.var1[11] = -(0xFFFFCEA6 & 0x335B) & (0xFFFFFFF7 & 0x2FFD);
        H.var1[12] = 0x39 ^ 0x3D;
        H.var1[13] = 0x95 ^ 0xA2 ^ (0x7B ^ 0x44);
    }

    private static boolean var30(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var29(int n2, int n3) {
        return n2 != n3;
    }

    private static void var22() {
        var2 = new String[var1[12]];
        H.var2[H.var1[0]] = "Core";
        H.var2[H.var1[1]] = "Energy Siphon";
        H.var2[H.var1[2]] = "Tumeken's Warden";
        H.var2[H.var1[3]] = "Elidinis' Warden";
    }

    @Inject
    public WardenGearSwappingTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    private static boolean var24(int n2) {
        return n2 != 0;
    }
}

