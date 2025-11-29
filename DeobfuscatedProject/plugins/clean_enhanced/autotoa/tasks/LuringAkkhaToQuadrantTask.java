/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Luring Akkha to Quadrant")
public class LuringAkkhaToQuadrantTask
extends AutotoaManager {
    private final  m dk;

    private final  SquireAutoTOA dl;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var4_4;
        int var3;
        int n2;
        av var4;
        if (av.var5(this.bu() ? 1 : 0)) {
            return var2[0];
        }
        List<NPC> var6 = var4.by();
        NPC var7 = var4.J();
        if (av.var8(var7)) {
            return var2[0];
        }
        if (av.var5(var4.g(var7) ? 1 : 0) && !av.var9(var6.size(), var2[1]) || av.var5(var4.bw() ? 1 : 0)) {
            return var2[0];
        }
        WorldPoint var10 = Players.getLocal().getWorldLocation();
        WorldPoint var11 = var10.createWorldArea(var2[2]).toWorldPointList().stream().filter(worldPoint -> {
            int n2;
            NPC nPC = this.i((WorldPoint)worldPoint);
            if (av.var12(nPC) && av.var13(nPC.distanceTo(worldPoint), var2[2])) {
                n2 = var2[3];
                0;
                if (2 <= 0) {
                    return ((0x60 ^ 0x36) & ~(0xE0 ^ 0xB6)) != 0;
                }
            } else {
                n2 = var2[0];
            }
            return n2 != 0;
        }).filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint.getWorldLocation())).max(Comparator.comparingDouble(worldPoint -> worldPoint.getWorldLocation().distanceToHypotenuse(this.i(worldPoint.getWorldLocation()).getWorldLocation()))).orElse(null);
        if (av.var8(var11)) {
            return var2[0];
        }
        if (av.var5(var4.g(var7) ? 1 : 0)) {
            n2 = var2[1];
            0;
            if (((210 + 216 - 316 + 116 ^ 65 + 13 - -40 + 70) & (0x4E ^ 0x7C ^ (0x77 ^ 0x1B) ^ -1)) == -1) {
                return ((0x5D ^ 0x46 ^ (0x1D ^ 0x29)) & (100 + 105 - 120 + 65 ^ 19 + 177 - 92 + 81 ^ -1)) != 0;
            }
        } else {
            n2 = var3 = var2[3];
        }
        if (av.var5(var4.g(var7) ? 1 : 0) && av.var13(var7.distanceTo(var10), var2[4]) && av.var5(var4.cW.keepBack() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var7.getWorldLocation());
            return var2[3];
        }
        if (av.var14(var10.distanceTo(var11.getWorldLocation()), var3)) {
            return var2[0];
        }
        if (av.var5(var4.dk.K() ? 1 : 0) && av.var5(var6.stream().allMatch(nPC -> {
            boolean bl2;
            if (av.var15(nPC.getAnimation(), var2[5])) {
                bl2 = var2[3];
                0;
                if (2 > 2) {
                    return ((0x59 ^ 0xD) & ~(0xC ^ 0x58)) != 0;
                }
            } else {
                bl2 = var2[0];
            }
            return bl2;
        }) ? 1 : 0)) {
            return var2[3];
        }
        this.dl.a(var2[0]);
        this.g(var4_4.getWorldLocation());
        return var2[3];
    }

    private static boolean var13(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected LuringAkkhaToQuadrantTask(Client client, z z2, TOAConfig tOAConfig, m m2, SquireAutoTOA squireAutoTOA) {
        super(client, z2, tOAConfig);
        this.dk = m2;
        this.dl = squireAutoTOA;
    }

    private static boolean var9(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static void var16() {
        var1 = new String[var2[3]];
        av.var1[av.var2[0]] = "Akkha's Shadow";
    }

    private NPC i(WorldPoint worldPoint) {
        String[] stringArray = new String[var2[3]];
        stringArray[av.var2[0]] = var1[var2[0]];
        return NPCs.getNearest((WorldPoint)worldPoint, (String[])stringArray);
    }

    static {
        av.var17();
        av.var16();
    }

    private static boolean var15(int n2, int n3) {
        return n2 == n3;
    }

    private static String var18(String var19, String var20) {
        var19 = new String(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var21 = new StringBuilder();
        char[] var22 = var20.toCharArray();
        int var23 = var2[0];
        char[] var24 = var19.toCharArray();
        int var25 = var24.length;
        int var26 = var2[0];
        while (av.var14(var26, var25)) {
            char var27 = var24[var26];
            var21.append((char)(var27 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var26;
            0;
            if ((0x10 ^ 0x78 ^ (0xD1 ^ 0xBD)) >= 0) continue;
            return null;
        }
        return String.valueOf(var21);
    }

    private static boolean var8(Object object) {
        return object == null;
    }

    private static boolean var12(Object object) {
        return object != null;
    }

    private static void var17() {
        var2 = new int[6];
        av.var2[0] = (0xB ^ 0x25 ^ (0x50 ^ 0x29)) & (0xDA ^ 0x87 ^ (0x92 ^ 0x98) ^ -1);
        av.var2[1] = 0x1B ^ 0x27 ^ (0x7B ^ 0x43);
        av.var2[2] = 0x40 ^ 0x70 ^ (0x98 ^ 0xA2);
        av.var2[3] = 1;
        av.var2[4] = 3;
        av.var2[5] = -1;
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }
}

