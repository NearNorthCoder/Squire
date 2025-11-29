/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Iterator;
import java.util.List;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.GameEnum10;

@TaskDesc(name="Handling Kephri Prayers", priority=0x7FFFFFFF)
public class HandlingKephriPrayersTask
extends AutotoaManager {

    private  int eZ;

    private static boolean var3(int n2) {
        return n2 != 0;
    }

    @Override
    public int aO() {
        return var2[4];
    }

        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Prayer> aN() {
        bj var10;
        if (bj.var3(this.bW() ? 1 : 0)) {
            this.eZ = var2[1];
        }
        if (bj.var11(var10.eZ)) {
            var10.eZ -= var2[2];
            return List.of(var10.aQ(), Prayer.PROTECT_FROM_MAGIC);
        }
        String[] stringArray = new String[var2[2]];
        stringArray[bj.var2[0]] = var1[var2[0]];
        NPC var12 = NPCs.getNearest((String[])stringArray);
        if (bj.var13(var12) && bj.var14(var12.getWorldArea().distanceTo((Locatable)Players.getLocal()), var2[3]) && bj.var3(Reachable.isInteractable((Locatable)var12) ? 1 : 0)) {
            return List.of(var10.aQ(), Prayer.PROTECT_FROM_MELEE);
        }
        String[] stringArray2 = new String[var2[3]];
        stringArray2[bj.var2[0]] = var1[var2[2]];
        stringArray2[bj.var2[2]] = var1[var2[3]];
        NPC var15 = NPCs.getNearest((String[])stringArray2);
        if (bj.var13(var15)) {
            return List.of(var10.aQ(), Prayer.PROTECT_FROM_MISSILES);
        }
        return List.of(this.aQ());
    }

    private static boolean var16(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean var17(int n2, int n3) {
        return n2 < n3;
    }

    static {
        bj.var18();
        bj.var19();
    }

    private static boolean var20(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean var14(int n2, int n3) {
        return n2 <= n3;
    }

    private static String var21(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = var2[0];
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = var2[0];
        while (bj.var17(var29, var28)) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    private static boolean var11(int n2) {
        return n2 > 0;
    }

    /*
     * WARNING - void declaration
     */
    private boolean bW() {
        boolean bl2;
        void var31;
        int n2 = var2[0];
        Iterator var32 = Static.getClient().getGraphicsObjects().iterator();
        while (bj.var3(var32.hasNext() ? 1 : 0)) {
            GraphicsObject var33 = (GraphicsObject)var32.next();
            if (bj.var16(var33.getId(), var2[9])) {
                ++var31;
            }
            0;
            if (2 > 0) continue;
            return ((155 + 119 - 255 + 170 ^ 110 + 29 - 48 + 50) & (35 + 22 - 30 + 101 ^ 146 + 67 - 178 + 141 ^ -1)) != 0;
        }
        if (bj.var20((int)var31, var2[1])) {
            bl2 = var2[2];
            0;
            if null != null {
                return ((0x53 ^ 0x6B) & ~(0x65 ^ 0x5D)) != 0;
            }
        } else {
            bl2 = var2[0];
        }
        return bl2;
    }

    private static boolean var13(Object object) {
        return object != null;
    }

    @Override
    public boolean aS() {
        return var2[2];
    }

    @Override
    public v aT() {
        return v.FLICK;
    }

    @Override
    public boolean aL() {
        int[] nArray = new int[var2[5]];
        nArray[bj.var2[0]] = var2[6];
        nArray[bj.var2[2]] = var2[7];
        nArray[bj.var2[3]] = var2[8];
        return this.cm.a(nArray);
    }

    private static void var18() {
        var2 = new int[10];
        bj.var2[0] = (0x9D ^ 0xA0 ^ (0xE ^ 0x74)) & (0xCD ^ 0xA7 ^ (0x36 ^ 0x1B) ^ -1);
        bj.var2[1] = 0x81 ^ 0x87;
        bj.var2[2] = 1;
        bj.var2[3] = 2;
        bj.var2[4] = 0xFFFFFF7C & 0x37D7;
        bj.var2[5] = 3;
        bj.var2[6] = 0xFFFFBFC7 & 0x6DFF;
        bj.var2[7] = 0xFFFFFDCC & 0x2FFB;
        bj.var2[8] = 0xFFFFBFE9 & 0x6DDF;
        bj.var2[9] = 0xFFFFE87F & 0x1FE5;
    }

    private static void var19() {
        var1 = new String[var2[5]];
        bj.var1[bj.var2[0]] = "Soldier Scarab";
        bj.var1[bj.var2[2]] = "Spitting Scarab";
        bj.var1[bj.var2[3]] = "Agile Scarab";
    }

    @Inject
    public HandlingKephriPrayersTask(SquireAutoTOA squireAutoTOA, TOAConfig tOAConfig) {
        super(squireAutoTOA, tOAConfig);
        this.eZ = var2[0];
    }
}

