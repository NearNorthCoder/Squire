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
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ap;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.m;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

/* TASK: Luring Akkha to Quadrant -> LuringakkhatoquadrantTask */
@TaskDesc(name="Luring Akkha to Quadrant")
public class av
extends ap {
    private final /* synthetic */ m dk;
    private static /* synthetic */ String[] lIllIIlIlIl;
    private static /* synthetic */ int[] lIllIIlIllI;
    private final /* synthetic */ SquireAutoTOA dl;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bl() {
        void var4_4;
        int var11;
        int n2;
        av var8;
        if (av.lIIlIlIlllllII(this.bu() ? 1 : 0)) {
            return lIllIIlIllI[0];
        }
        List<NPC> var12 = var8.by();
        NPC var14 = var8.J();
        if (av.lIIlIlIlllllIl(var14)) {
            return lIllIIlIllI[0];
        }
        if (av.lIIlIlIlllllII(var8.g(var14) ? 1 : 0) && !av.lIIlIlIllllllI(var12.size(), lIllIIlIllI[1]) || av.lIIlIlIlllllII(var8.bw() ? 1 : 0)) {
            return lIllIIlIllI[0];
        }
        WorldPoint var10 = Players.getLocal().getWorldLocation();
        WorldPoint var4 = var10.createWorldArea(lIllIIlIllI[2]).toWorldPointList().stream().filter(worldPoint -> {
            int n2;
            NPC nPC = this.i((WorldPoint)worldPoint);
            if (av.lIIlIllIIIIIlI(nPC) && av.lIIlIlIlllllll(nPC.distanceTo(worldPoint), lIllIIlIllI[2])) {
                n2 = lIllIIlIllI[3];
                0;
                if (2 <= 0) {
                    return false;
                }
            } else {
                n2 = lIllIIlIllI[0];
            }
            return n2 != 0;
        }).filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint.getWorldLocation())).max(Comparator.comparingDouble(worldPoint -> worldPoint.getWorldLocation().distanceToHypotenuse(this.i(worldPoint.getWorldLocation()).getWorldLocation()))).orElse(null);
        if (av.lIIlIlIlllllIl(var4)) {
            return lIllIIlIllI[0];
        }
        if (av.lIIlIlIlllllII(var8.g(var14) ? 1 : 0)) {
            n2 = lIllIIlIllI[1];
            0;
            if (((210 + 216 - 316 + 116 ^ 65 + 13 - -40 + 70) & (0x4E ^ 0x7C ^ (0x77 ^ 0x1B) ^ -1)) == -1) {
                return ((0x5D ^ 0x46 ^ (0x1D ^ 0x29)) & (100 + 105 - 120 + 65 ^ 19 + 177 - 92 + 81 ^ -1)) != 0;
            }
        } else {
            n2 = var11 = lIllIIlIllI[3];
        }
        if (av.lIIlIlIlllllII(var8.g(var14) ? 1 : 0) && av.lIIlIlIlllllll(var14.distanceTo(var10), lIllIIlIllI[4]) && av.lIIlIlIlllllII(var8.cW.keepBack() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)var14.getWorldLocation());
            return lIllIIlIllI[3];
        }
        if (av.lIIlIllIIIIIII(var10.distanceTo(var4.getWorldLocation()), var11)) {
            return lIllIIlIllI[0];
        }
        if (av.lIIlIlIlllllII(var8.dk.K() ? 1 : 0) && av.lIIlIlIlllllII(var12.stream().allMatch(nPC -> {
            boolean bl2;
            if (av.lIIlIllIIIIIIl(nPC.getAnimation(), lIllIIlIllI[5])) {
                bl2 = lIllIIlIllI[3];
                0;
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
    protected av(Client client, z z2, TOAConfig tOAConfig, m m2, SquireAutoTOA squireAutoTOA) {
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
        av.lIllIIlIlIl[av.lIllIIlIllI[0]] = av."Akkha's Shadow";
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

    private static String lIIlIlIllllIIl(String var6, String var9) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var7 = new StringBuilder();
        char[] var13 = var9.toCharArray();
        int var1 = lIllIIlIllI[0];
        char[] var15 = var6.toCharArray();
        int var2 = var15.length;
        int var5 = lIllIIlIllI[0];
        while (av.lIIlIllIIIIIII(var5, var2)) {
            char var3 = var15[var5];
            var7.append((char)(var3 ^ var13[var1 % var13.length]));
            0;
            ++var1;
            ++var5;
            0;
            if ((0x10 ^ 0x78 ^ (0xD1 ^ 0xBD)) >= 0) continue;
            return null;
        }
        return String.valueOf(var7);
    }

    private static boolean lIIlIlIlllllIl(Object object) {
        return object == null;
    }

    private static boolean lIIlIllIIIIIlI(Object object) {
        return object != null;
    }

    private static void lIIlIlIllllIll() {
        lIllIIlIllI = new int[6];
        av.lIllIIlIllI[0] = (0xB ^ 0x25 ^ (0x50 ^ 0x29)) & (0xDA ^ 0x87 ^ (0x92 ^ 0x98) ^ -1);
        av.lIllIIlIllI[1] = 0x1B ^ 0x27 ^ (0x7B ^ 0x43);
        av.lIllIIlIllI[2] = 0x40 ^ 0x70 ^ (0x98 ^ 0xA2);
        av.lIllIIlIllI[3] = 1;
        av.lIllIIlIllI[4] = 3;
        av.lIllIIlIllI[5] = -1;
    }

    private static boolean lIIlIlIlllllII(int n2) {
        return n2 != 0;
    }
}

