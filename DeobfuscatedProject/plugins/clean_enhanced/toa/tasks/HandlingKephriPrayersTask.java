/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.GameEnum;
import gg.squire.toa.tasks.ToaManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.util.List;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Handling Kephri Prayers")
public class HandlingKephriPrayersTask
extends ToaManager {

    @Override
    public n J() {
        return this.aT.prayerModeKephri();
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean I() {
        return var2[0];
    }

    private static boolean var9(Object object) {
        return object != null;
    }

    @Override
    public int F() {
        return var2[4];
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean C() {
        int[] nArray = new int[var2[2]];
        nArray[P.var2[1]] = var2[5];
        nArray[P.var2[0]] = var2[6];
        nArray[P.var2[3]] = var2[7];
        return this.aS.a(nArray);
    }

    @Override
    public List<Prayer> E() {
        String[] stringArray = new String[var2[0]];
        stringArray[P.var2[1]] = var1[var2[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (P.var9(nPC) && P.var11(nPC.distanceTo((Locatable)Players.getLocal()), var2[2]) && P.var10(Reachable.isInteractable((Locatable)nPC) ? 1 : 0)) {
            return List.of(this.H(), Prayer.PROTECT_FROM_MELEE);
        }
        String[] stringArray2 = new String[var2[3]];
        stringArray2[P.var2[1]] = var1[var2[0]];
        stringArray2[P.var2[0]] = var1[var2[3]];
        NPC var12 = NPCs.getNearest((String[])stringArray2);
        if (P.var9(var12)) {
            P var13;
            return List.of(var13.H(), Prayer.PROTECT_FROM_MISSILES);
        }
        return List.of(this.H());
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    private static String var20(String var21, String var22) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var23 = new StringBuilder();
        char[] var24 = var22.toCharArray();
        int var25 = var2[1];
        char[] var26 = var21.toCharArray();
        int var27 = var26.length;
        int var28 = var2[1];
        while (P.var29(var28, var27)) {
            char var30 = var26[var28];
            var23.append((char)(var30 ^ var24[var25 % var24.length]));
            0;
            ++var25;
            ++var28;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var23);
    }

    private static boolean var11(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean var29(int n2, int n3) {
        return n2 < n3;
    }

    private static void var31() {
        var2 = new int[9];
        P.var2[0] = 1;
        P.var2[1] = (0xD9 ^ 0x85) & ~(0x53 ^ 0xF);
        P.var2[2] = 3;
        P.var2[3] = 2;
        P.var2[4] = -(0xFFFFDBEB & 0x64B7) & (0xFFFFFFF7 & 0x77FE);
        P.var2[5] = -(0x35 ^ 4) & (0xFFFFBDF7 & 0x6FFF);
        P.var2[6] = 0xFFFFAFDB & 0x7DEC;
        P.var2[7] = -(0xFFFFD63F & 0x69F7) & (0xFFFFFFFF & 0x6DFF);
        P.var2[8] = 0x18 ^ 0x10;
    }

    @Inject
    public HandlingKephriPrayersTask(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    private static void var32() {
        var1 = new String[var2[2]];
        P.var1[P.var2[1]] = "Soldier Scarab";
        P.var1[P.var2[0]] = "Spitting Scarab";
        P.var1[P.var2[3]] = "Agile Scarab";
    }

    static {
        P.var31();
        P.var32();
    }
}

