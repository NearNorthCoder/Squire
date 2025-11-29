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
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.AutotoaManager;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Luring Akkha to Quadrant")
public class LuringAkkhaToQuadrantTask
extends AutotoaTaskBase {
    private final  m dk;

    private final  SquireAutoTOA dl;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var4_4;
        int var1;
        int n2;
        av var2;
        if (av.lIIlIlIlllllII(this.bu() ? 1 : 0)) {
            return lIllIIlIllI[0];
        }
        List<NPC> var3 = var2.by();
        NPC var4 = var2.J();
        if (av.lIIlIlIlllllIl(var4)) {
            return lIllIIlIllI[0];
        }
        if (av.lIIlIlIlllllII(var2.g(var4) ? 1 : 0) && !av.lIIlIlIllllllI(var3.size(), lIllIIlIllI[1]) || av.lIIlIlIlllllII(var2.bw() ? 1 : 0)) {
            return lIllIIlIllI[0];
        }
        WorldPoint var5 = Players.getLocal().getWorldLocation();
        WorldPoint var6 = var5.createWorldArea(lIllIIlIllI[2]).toWorldPointList().stream().filter(worldPoint -> {
            int n2;
            NPC nPC = this.i((WorldPoint)worldPoint);
            if (av.lIIlIllIIIIIlI(nPC) && av.lIIlIlIlllllll(nPC.distanceTo(worldPoint), lIllIIlIllI[2])) {
                n2 = lIllIIlIllI[3];

                if (2 <= 0) {
                    return false;
                }
            } else {
                n2 = lIllIIlIllI[0];
            }
            return n2 != 0;
        }).filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint.getWorldLocation())).max(Comparator.comparingDouble(worldPoint -> worldPoint.getWorldLocation().distanceToHypotenuse(this.i(worldPoint.getWorldLocation()).getWorldLocation()))).orElse(null);
        if (av.lIIlIlIlllllIl(var6)) {
            return lIllIIlIllI[0];
        }
        if (av.lIIlIlIlllllII(var2.g(var4) ? 1 : 0)) {
            n2 = lIllIIlIllI[1];

            if (((210 + 216 - 316 + 116 ^ 65 + 13 - -40 + 70) & (0x4E ^ 0x7C ^ (0x77 ^ 0x1B) ^ -1)) == -1) {
                return ((0x5D ^ 0x46 ^ (0x1D ^ 0x29)) & (100 + 105 - 120 + 65 ^ 19 + 177 - 92 + 81 ^ -1)) != 0;
            }
        } else {
            n2 = var1 = lIllIIlIllI[3];
        }
        if (av.lIIlIlIlllllII(var2.g(var4) ? 1 : 0) && av.lIIlIlIlllllll(var4.distanceTo(var5), lIllIIlIllI[4]) && av.lIIlIlIlllllII(var2.cW.keepBack() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var4.getWorldLocation());
            return lIllIIlIllI[3];
        }
        if (av.lIIlIllIIIIIII(var5.distanceTo(var6.getWorldLocation()), var1)) {
            return lIllIIlIllI[0];
        }
        if (av.lIIlIlIlllllII(var2.dk.K() ? 1 : 0) && av.lIIlIlIlllllII(var3.stream().allMatch(nPC -> {
            boolean bl2;
            if (av.lIIlIllIIIIIIl(nPC.getAnimation(), lIllIIlIllI[5])) {
                bl2 = lIllIIlIllI[3];

                if (2 > 2) {
                    return false;
                }
            } else {
                bl2 = lIllIIlIllI[0];
            }
            return bl2;
        }) ? 1 : 0)) {
            return lIllIIlIllI[3];
        }
        this.dl.a(lIllIIlIllI[0]);
        this.g(var4_4.getWorldLocation());
        return lIllIIlIllI[3];
    }

    private static boolean lIIlIlIlllllll(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected LuringAkkhaToQuadrantTask(Client client, z z2, TOAConfig tOAConfig, m m2, SquireAutoTOA squireAutoTOA) {
        super(client, z2, tOAConfig);
        this.dk = m2;
        this.dl = squireAutoTOA;
    }

    private static boolean lIIlIlIllllllI(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIlIllIIIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIlIlIllllIlI() {
        lIllIIlIlIl = new String[lIllIIlIllI[3]];
        av.lIllIIlIlIl[av.lIllIIlIllI[0]] = "Akkha's Shadow";
    }

    private NPC i(WorldPoint worldPoint) {
        String[] stringArray = new String[lIllIIlIllI[3]];
        stringArray[av.lIllIIlIllI[0]] = lIllIIlIlIl[lIllIIlIllI[0]];
        return NPCs.getNearest((WorldPoint)worldPoint, (String[])stringArray);
    }

    static {
        av.lIIlIlIllllIll();
        av.lIIlIlIllllIlI();
    }

    private static boolean lIIlIllIIIIIIl(int n2, int n3) {
        return n2 == n3;
    }

        return String.valueOf(var7);
    }

    private static boolean lIIlIlIlllllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIllIIIIIlI(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIlllllII(int n2) {
        return n2 != 0;
    }
}

