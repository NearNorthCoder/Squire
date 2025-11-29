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

@TaskDesc(name="Gear Swapping Zebak", register=true)
public class GearSwappingZebakTask
extends ToaManager {

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    private static boolean var4(int n2, int n3) {
        return n2 < n3;
    }

    private static void var5() {
        var2 = new String[var1[4]];
        Q.var2[Q.var1[0]] = "Zebak";
        Q.var2[Q.var1[2]] = "Jug";
        Q.var2[Q.var1[1]] = "Wave";
        Q.var2[Q.var1[3]] = "Crocodile";
    }

    static {
        Q.var6();
        Q.var5();
    }

    @Inject
    public GearSwappingZebakTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean C() {
        boolean bl;
        if (!Q.var13(this.aL.gearSwapZebak().isSelected() ? 1 : 0) || Q.var3(this.aL.gearSwapCrocodile().isSelected() ? 1 : 0)) {
            bl = var1[2];
            0;
            if (((0x35 ^ 0x1F ^ (0x32 ^ 0x37)) & (99 + 44 - 65 + 49 ^ (2 ^ 0x52) ^ -1)) > 0) {
                return ((156 + 155 - 309 + 237 ^ 122 + 154 - 142 + 59) & (0x4B ^ 0x23 ^ (0x6D ^ 0x2B) ^ -1)) != 0;
            }
        } else {
            bl = var1[0];
        }
        return bl;
    }

    private static void var6() {
        var1 = new int[6];
        Q.var1[0] = (0xE1 ^ 0x82 ^ (0x46 ^ 0x7A)) & (38 + 203 - 193 + 156 ^ 80 + 80 - 101 + 88 ^ -1);
        Q.var1[1] = 2;
        Q.var1[2] = 1;
        Q.var1[3] = 3;
        Q.var1[4] = 113 + 52 - 127 + 110 ^ 59 + 60 - 99 + 124;
        Q.var1[5] = 0x23 ^ 0x2B;
    }

    private static boolean var14(Object object) {
        return object != null;
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = var1[0];
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = var1[0];
        while (Q.var4(var29, var28)) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if (-1 < 0) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        void var31;
        Q var32;
        if (Q.var3(string.equals(var2[var1[0]]) ? 1 : 0)) {
            String[] stringArray = new String[var1[1]];
            stringArray[Q.var1[0]] = var2[var1[2]];
            stringArray[Q.var1[2]] = var2[var1[1]];
            NPC nPC = NPCs.getNearest((String[])stringArray);
            if (Q.var14(nPC)) {
                return this.a(this.aL.gearSwapZebak());
            }
            return var32.a(var32.aL.specGearZebak(), var32.aL.gearSwapZebak(), var32.aL.specGearZebakReq());
        }
        if (Q.var3(var31.equals(var2[var1[3]]) ? 1 : 0)) {
            return var32.a(var32.aL.gearSwapCrocodile());
        }
        return new int[var1[0]];
    }
}

