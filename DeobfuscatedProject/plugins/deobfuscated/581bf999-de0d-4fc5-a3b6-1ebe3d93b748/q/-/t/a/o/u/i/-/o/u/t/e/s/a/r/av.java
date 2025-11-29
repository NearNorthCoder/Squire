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
        int llllllllllllllllIlIlIIllllIllIlI;
        int n2;
        av llllllllllllllllIlIlIIllllIlllll;
        if (av.lIIlIlIlllllII(this.bu() ? 1 : 0)) {
            return lIllIIlIllI[0];
        }
        List<NPC> llllllllllllllllIlIlIIllllIllllI = llllllllllllllllIlIlIIllllIlllll.by();
        NPC llllllllllllllllIlIlIIllllIlllIl = llllllllllllllllIlIlIIllllIlllll.J();
        if (av.lIIlIlIlllllIl(llllllllllllllllIlIlIIllllIlllIl)) {
            return lIllIIlIllI[0];
        }
        if (av.lIIlIlIlllllII(llllllllllllllllIlIlIIllllIlllll.g(llllllllllllllllIlIlIIllllIlllIl) ? 1 : 0) && !av.lIIlIlIllllllI(llllllllllllllllIlIlIIllllIllllI.size(), lIllIIlIllI[1]) || av.lIIlIlIlllllII(llllllllllllllllIlIlIIllllIlllll.bw() ? 1 : 0)) {
            return lIllIIlIllI[0];
        }
        WorldPoint llllllllllllllllIlIlIIllllIlllII = Players.getLocal().getWorldLocation();
        WorldPoint llllllllllllllllIlIlIIllllIllIll = llllllllllllllllIlIlIIllllIlllII.createWorldArea(lIllIIlIllI[2]).toWorldPointList().stream().filter(worldPoint -> {
            int n2;
            NPC nPC = this.i((WorldPoint)worldPoint);
            if (av.lIIlIllIIIIIlI(nPC) && av.lIIlIlIlllllll(nPC.distanceTo(worldPoint), lIllIIlIllI[2])) {
                n2 = lIllIIlIllI[3];
                0;
                if (2 <= 0) {
                    return ((0x60 ^ 0x36) & ~(0xE0 ^ 0xB6)) != 0;
                }
            } else {
                n2 = lIllIIlIllI[0];
            }
            return n2 != 0;
        }).filter(worldPoint -> Reachable.isWalkable((WorldPoint)worldPoint.getWorldLocation())).max(Comparator.comparingDouble(worldPoint -> worldPoint.getWorldLocation().distanceToHypotenuse(this.i(worldPoint.getWorldLocation()).getWorldLocation()))).orElse(null);
        if (av.lIIlIlIlllllIl(llllllllllllllllIlIlIIllllIllIll)) {
            return lIllIIlIllI[0];
        }
        if (av.lIIlIlIlllllII(llllllllllllllllIlIlIIllllIlllll.g(llllllllllllllllIlIlIIllllIlllIl) ? 1 : 0)) {
            n2 = lIllIIlIllI[1];
            0;
            if (((210 + 216 - 316 + 116 ^ 65 + 13 - -40 + 70) & (0x4E ^ 0x7C ^ (0x77 ^ 0x1B) ^ -1)) == -1) {
                return ((0x5D ^ 0x46 ^ (0x1D ^ 0x29)) & (100 + 105 - 120 + 65 ^ 19 + 177 - 92 + 81 ^ -1)) != 0;
            }
        } else {
            n2 = llllllllllllllllIlIlIIllllIllIlI = lIllIIlIllI[3];
        }
        if (av.lIIlIlIlllllII(llllllllllllllllIlIlIIllllIlllll.g(llllllllllllllllIlIlIIllllIlllIl) ? 1 : 0) && av.lIIlIlIlllllll(llllllllllllllllIlIlIIllllIlllIl.distanceTo(llllllllllllllllIlIlIIllllIlllII), lIllIIlIllI[4]) && av.lIIlIlIlllllII(llllllllllllllllIlIlIIllllIlllll.cW.keepBack() ? 1 : 0)) {
            Movement.setDestination((WorldPoint)llllllllllllllllIlIlIIllllIlllIl.getWorldLocation());
            return lIllIIlIllI[3];
        }
        if (av.lIIlIllIIIIIII(llllllllllllllllIlIlIIllllIlllII.distanceTo(llllllllllllllllIlIlIIllllIllIll.getWorldLocation()), llllllllllllllllIlIlIIllllIllIlI)) {
            return lIllIIlIllI[0];
        }
        if (av.lIIlIlIlllllII(llllllllllllllllIlIlIIllllIlllll.dk.K() ? 1 : 0) && av.lIIlIlIlllllII(llllllllllllllllIlIlIIllllIllllI.stream().allMatch(nPC -> {
            boolean bl2;
            if (av.lIIlIllIIIIIIl(nPC.getAnimation(), lIllIIlIllI[5])) {
                bl2 = lIllIIlIllI[3];
                0;
                if (2 > 2) {
                    return ((0x59 ^ 0xD) & ~(0xC ^ 0x58)) != 0;
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

    private static String lIIlIlIllllIIl(String llllllllllllllllIlIlIIllllIIIIlI, String llllllllllllllllIlIlIIllllIIIllI) {
        llllllllllllllllIlIlIIllllIIIIlI = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIIllllIIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIIllllIIIlIl = new StringBuilder();
        char[] llllllllllllllllIlIlIIllllIIIlII = llllllllllllllllIlIlIIllllIIIllI.toCharArray();
        int llllllllllllllllIlIlIIllllIIIIll = lIllIIlIllI[0];
        char[] llllllllllllllllIlIlIIlllIllllIl = llllllllllllllllIlIlIIllllIIIIlI.toCharArray();
        int llllllllllllllllIlIlIIlllIllllII = llllllllllllllllIlIlIIlllIllllIl.length;
        int llllllllllllllllIlIlIIlllIlllIll = lIllIIlIllI[0];
        while (av.lIIlIllIIIIIII(llllllllllllllllIlIlIIlllIlllIll, llllllllllllllllIlIlIIlllIllllII)) {
            char llllllllllllllllIlIlIIllllIIlIII = llllllllllllllllIlIlIIlllIllllIl[llllllllllllllllIlIlIIlllIlllIll];
            llllllllllllllllIlIlIIllllIIIlIl.append((char)(llllllllllllllllIlIlIIllllIIlIII ^ llllllllllllllllIlIlIIllllIIIlII[llllllllllllllllIlIlIIllllIIIIll % llllllllllllllllIlIlIIllllIIIlII.length]));
            0;
            ++llllllllllllllllIlIlIIllllIIIIll;
            ++llllllllllllllllIlIlIIlllIlllIll;
            0;
            if ((0x10 ^ 0x78 ^ (0xD1 ^ 0xBD)) >= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlIIllllIIIlIl);
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

