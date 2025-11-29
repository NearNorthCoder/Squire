/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.GameEnum;
import gg.squire.toa.tasks.ToaManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;

@TaskDesc(name="Handling baba prayers", priority=0x7FFFFFFF)
public class HandlingBabaPrayersTask
extends ToaManager {

    private static void var3() {
        var2 = new String[var1[0]];
        L.var2[L.var1[1]] = "Ba-Ba";
    }

    @Override
    public n J() {
        return this.aT.prayFlickBaba();
    }

    static {
        L.var4();
        L.var3();
    }

    @Override
    public boolean C() {
        int[] nArray = new int[var1[4]];
        nArray[L.var1[1]] = var1[5];
        nArray[L.var1[0]] = var1[6];
        nArray[L.var1[7]] = var1[2];
        return this.aS.a(nArray);
    }

    @Inject
    public HandlingBabaPrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    @Override
    public List<Prayer> E() {
        String[] stringArray = new String[var1[0]];
        stringArray[L.var1[1]] = var2[var1[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (L.var5(nPC) && L.var6(nPC.getId(), var1[2])) {
            return List.of(this.H());
        }
        return List.of(Prayer.PROTECT_FROM_MELEE, this.H());
    }

    @Override
    public boolean I() {
        return var1[0];
    }

    private static boolean var6(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int F() {
        return var1[3];
    }

    private static void var4() {
        var1 = new int[9];
        L.var1[0] = 1;
        L.var1[1] = (2 ^ (0 ^ 0x28)) & (0xF7 ^ 0xAF ^ (0x7B ^ 9) ^ -1);
        L.var1[2] = 0xFFFFAF06 & 0x7EFD;
        L.var1[3] = -(0x99 ^ 0xBA) & (0xFFFFFB76 & 0x3FFF);
        L.var1[4] = 3;
        L.var1[5] = -(0xFFFFAF56 & 0x51EB) & (0xFFFFEFC7 & 0x3F7B);
        L.var1[6] = 0xFFFFEF8B & 0x3E77;
        L.var1[7] = 2;
        L.var1[8] = 5 ^ 0xD;
    }

    private static boolean var5(Object object) {
        return object != null;
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }
}

