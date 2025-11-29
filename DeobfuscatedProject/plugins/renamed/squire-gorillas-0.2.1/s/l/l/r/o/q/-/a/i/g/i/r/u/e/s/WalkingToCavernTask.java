/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.Locations
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.gorillas.SquireGorillaConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import s.l.l.r.o.q.-.a.i.g.i.r.u.e.s.j_Unknown;

/* TASK: Walking to cavern -> WalkingtocavernTask */
@TaskDesc(name="Walking to cavern")
public class WalkingToCavernTask
extends j_Unknown {
    private static /* synthetic */ int[] llIIlIlIIIII;
    private static final /* synthetic */ int V;
    private static final /* synthetic */ WorldPoint W;
    private static /* synthetic */ String[] llIIlIIlllll;

    private static String lllllIlIIlIlIl(String var5, String var4) {
        var5 = new String(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var1 = var4.toCharArray();
        int var8 = llIIlIlIIIII[0];
        char[] var2 = var5.toCharArray();
        int var6 = var2.length;
        int var7 = llIIlIlIIIII[0];
        while (k.lllllIlIIllIll(var7, var6)) {
            char var3 = var2[var7];
            var10.append((char)(var3 ^ var1[var8 % var1.length]));
            0;
            ++var8;
            ++var7;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var10);
    }

    private static boolean lllllIlIIllIlI(Object object) {
        return object != null;
    }

    private static boolean lllllIlIIllIll(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public k(SquireGorillaConfig squireGorillaConfig, Client client) {
        super(squireGorillaConfig, client);
    }

    private static boolean lllllIlIIllIIl(int n2) {
        return n2 == 0;
    }

    private static void lllllIlIIlIllI() {
        llIIlIIlllll = new String[llIIlIlIIIII[5]];
        k.llIIlIIlllll[k.llIIlIlIIIII[0]] = k."Cavern entrance";
        k.llIIlIIlllll[k.llIIlIlIIIII[2]] = k."Enter";
    }

    private static boolean lllllIlIIllIII(int n2) {
        return n2 != 0;
    }

    static {
        k.lllllIlIIlIlll();
        k.lllllIlIIlIllI();
        V = llIIlIlIIIII[1];
        W = new WorldPoint(llIIlIlIIIII[3], llIIlIlIIIII[4], llIIlIlIIIII[0]);
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (k.lllllIlIIllIII(this.J() ? 1 : 0)) {
            return llIIlIlIIIII[0];
        }
        if (k.lllllIlIIllIIl(Locations.isRegionLoaded((int)llIIlIlIIIII[1]) ? 1 : 0)) {
            return llIIlIlIIIII[0];
        }
        String[] stringArray = new String[llIIlIlIIIII[2]];
        stringArray[k.llIIlIlIIIII[0]] = llIIlIIlllll[llIIlIlIIIII[0]];
        TileObject var9 = TileObjects.getNearest((String[])stringArray);
        if (!k.lllllIlIIllIlI(var9) || k.lllllIlIIllIIl(Reachable.isInteractable((Locatable)var9) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)W);
            0;
            return llIIlIlIIIII[2];
        }
        var1_1.interact(llIIlIIlllll[llIIlIlIIIII[2]]);
        return llIIlIlIIIII[2];
    }

    private static void lllllIlIIlIlll() {
        llIIlIlIIIII = new int[6];
        k.llIIlIlIIIII[0] = (0x97 ^ 0x99) & ~(0xBE ^ 0xB0);
        k.llIIlIlIIIII[1] = 0xFFFFBFFF & 0x5F57;
        k.llIIlIlIIIII[2] = 1;
        k.llIIlIlIIIII[3] = -(0xFFFFA365 & 0x7C9F) & (0xFFFFAFFF & 0x77EE);
        k.llIIlIlIIIII[4] = -(0xFFFF8E9D & 0x7977) & (0xFFFF9FFF & 0x7DFF);
        k.llIIlIlIIIII[5] = 2;
    }
}

