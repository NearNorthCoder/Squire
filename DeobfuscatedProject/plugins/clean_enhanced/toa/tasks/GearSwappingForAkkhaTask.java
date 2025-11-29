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

@TaskDesc(name="Gear swapping for Akkha", register=true)
public class GearSwappingForAkkhaTask
extends ToaManager {

    private  int aW;

    private static void var3() {
        var2 = new int[10];
        C.var2[0] = -1;
        C.var2[1] = (0x10 ^ 0x56 ^ (0x9D ^ 0x96)) & (0x9F ^ 0xB3 ^ (0xF3 ^ 0x92) ^ -1);
        C.var2[2] = 1;
        C.var2[3] = -(0xFFFFFFA9 & 0x5177) & (0xFFFFFFFF & 0x7F2E);
        C.var2[4] = 0xFFFFEF3F & 0x3ECF;
        C.var2[5] = 0xFFFFFF16 & 0x2EF9;
        C.var2[6] = -(0xFFFFC7D9 & 0x786F) & (0xFFFFEFDF & 0x7E7B);
        C.var2[7] = 2;
        C.var2[8] = 3;
        C.var2[9] = 0x7B ^ 0x7E ^ (0x33 ^ 0x3E);
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean var5(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public boolean GearSwappingForAkkhaTask() {
        int n2;
        if (!(C.var6(this.aL.mageGearAkkha().isSelected() ? 1 : 0) && C.var6(this.aL.meleeGearAkkha().isSelected() ? 1 : 0) && C.var6(this.aL.rangeGearAkkha().isSelected() ? 1 : 0) && C.var6(this.aL.akkhaFinalSpec().isSelected() ? 1 : 0) && !C.var7(this.aL.akkhaFinalNormal().isSelected() ? 1 : 0))) {
            n2 = var2[2];
            0;
            if (-1 != -1) {
                return ((146 + 63 - 67 + 21 ^ 31 + 139 - 166 + 177) & (0x62 ^ 0x59 ^ (0xA5 ^ 0x88) ^ -1)) != 0;
            }
        } else {
            n2 = var2[1];
        }
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        C var8;
        void var9;
        if (C.var7(string.equals(var1[var2[1]]) ? 1 : 0)) {
            return this.a(this.aL.shadowAttackStyle());
        }
        if (!C.var7(var9.equals(var1[var2[2]]) ? 1 : 0) || C.var5(var8.aW, var2[0])) {
            return new int[var2[1]];
        }
        if (C.var5(var8.aW, var2[3])) {
            return var8.a(var8.aL.mageGearAkkha());
        }
        if (C.var5(var8.aW, var2[4])) {
            return var8.a(var8.aL.meleeGearAkkha());
        }
        if (C.var5(var8.aW, var2[5])) {
            return var8.a(var8.aL.rangeGearAkkha());
        }
        if (C.var5(var8.aW, var2[6])) {
            return var8.a(var8.aL.akkhaFinalSpec(), var8.aL.akkhaFinalNormal(), var8.aL.specGearAkkhaFinalReq());
        }
        return new int[var2[1]];
    }

        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static boolean var7(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean run() {
        String[] stringArray = new String[var2[2]];
        stringArray[C.var2[1]] = var1[var2[7]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (C.var16(nPC)) {
            return var2[1];
        }
        this.aW = nPC.getId();
        return var2[1];
    }

        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }

    @Inject
    public GearSwappingForAkkhaTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
        this.aW = var2[0];
    }

    private static String var23(String var24, String var25) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var26 = new StringBuilder();
        char[] var27 = var25.toCharArray();
        int var28 = var2[1];
        char[] var29 = var24.toCharArray();
        int var30 = var29.length;
        int var31 = var2[1];
        while (C.var4(var31, var30)) {
            char var32 = var29[var31];
            var26.append((char)(var32 ^ var27[var28 % var27.length]));
            0;
            ++var28;
            ++var31;
            0;
            if (-1 <= 2) continue;
            return null;
        }
        return String.valueOf(var26);
    }

    private static void var33() {
        var1 = new String[var2[8]];
        C.var1[C.var2[1]] = "Akkha's Shadow";
        C.var1[C.var2[2]] = "Akkha";
        C.var1[C.var2[7]] = "Akkha";
    }

    private static boolean var6(int n2) {
        return n2 == 0;
    }

    static {
        C.var3();
        C.var33();
    }

    private static boolean var16(Object object) {
        return object == null;
    }
}

