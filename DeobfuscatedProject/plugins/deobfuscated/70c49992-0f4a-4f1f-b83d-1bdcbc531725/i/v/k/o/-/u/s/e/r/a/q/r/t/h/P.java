/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.Q;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Entering fight", priority=100, blocking=true)
public class P
extends Q {
    private final /* synthetic */ Client cG;
    private static final /* synthetic */ WorldPoint cF;
    private static /* synthetic */ String[] lIlIlIlIlllIl;
    public static final /* synthetic */ WorldPoint cE;
    public static final /* synthetic */ WorldArea cD;
    private static /* synthetic */ int[] lIlIlIlIllllI;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var1_1;
        if (P.lIllllllIllIlIl(this.cG.isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIlIllllI[0];
        }
        TileObject llllllllllllllIllIlIlIIllIlIIlIl = TileObjects.getNearest((WorldPoint)cE, tileObject -> {
            String[] stringArray = new String[lIlIlIlIllllI[1]];
            stringArray[P.lIlIlIlIllllI[0]] = lIlIlIlIlllIl[lIlIlIlIllllI[1]];
            return tileObject.hasAction(stringArray);
        });
        if (P.lIllllllIllIllI(llllllllllllllIllIlIlIIllIlIIlIl)) {
            Movement.walkTo((WorldPoint)cF);
            0;
            return lIlIlIlIllllI[0];
        }
        var1_1.interact(lIlIlIlIlllIl[lIlIlIlIllllI[0]]);
        return lIlIlIlIllllI[1];
    }

    static {
        P.lIllllllIllIlII();
        P.lIllllllIllIIll();
        cD = new WorldPoint(lIlIlIlIllllI[2], lIlIlIlIllllI[3], lIlIlIlIllllI[0]).toWorldArea();
        cE = new WorldPoint(lIlIlIlIllllI[4], lIlIlIlIllllI[5], lIlIlIlIllllI[0]);
        cF = new WorldPoint(lIlIlIlIllllI[6], lIlIlIlIllllI[7], lIlIlIlIllllI[0]);
    }

    private static boolean lIllllllIllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIllllllIllIIlI(String llllllllllllllIllIlIlIIllIIllIlI, String llllllllllllllIllIlIlIIllIIlIlII) {
        llllllllllllllIllIlIlIIllIIllIlI = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIIllIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIIllIIllIII = new StringBuilder();
        char[] llllllllllllllIllIlIlIIllIIlIlll = llllllllllllllIllIlIlIIllIIlIlII.toCharArray();
        int llllllllllllllIllIlIlIIllIIlIllI = lIlIlIlIllllI[0];
        char[] llllllllllllllIllIlIlIIllIIlIIII = llllllllllllllIllIlIlIIllIIllIlI.toCharArray();
        int llllllllllllllIllIlIlIIllIIIllll = llllllllllllllIllIlIlIIllIIlIIII.length;
        int llllllllllllllIllIlIlIIllIIIlllI = lIlIlIlIllllI[0];
        while (P.lIllllllIllIlll(llllllllllllllIllIlIlIIllIIIlllI, llllllllllllllIllIlIlIIllIIIllll)) {
            char llllllllllllllIllIlIlIIllIIllIll = llllllllllllllIllIlIlIIllIIlIIII[llllllllllllllIllIlIlIIllIIIlllI];
            llllllllllllllIllIlIlIIllIIllIII.append((char)(llllllllllllllIllIlIlIIllIIllIll ^ llllllllllllllIllIlIlIIllIIlIlll[llllllllllllllIllIlIlIIllIIlIllI % llllllllllllllIllIlIlIIllIIlIlll.length]));
            0;
            ++llllllllllllllIllIlIlIIllIIlIllI;
            ++llllllllllllllIllIlIlIIllIIIlllI;
            0;
            if ((0x61 ^ 0x25 ^ (0xEB ^ 0xAB)) == (0x68 ^ 0x19 ^ (0xFE ^ 0x8B))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIlIIllIIllIII);
    }

    private static boolean lIllllllIllIllI(Object object) {
        return object == null;
    }

    private static void lIllllllIllIlII() {
        lIlIlIlIllllI = new int[9];
        P.lIlIlIlIllllI[0] = (0x36 ^ 0x29) & ~(0x98 ^ 0x87);
        P.lIlIlIlIllllI[1] = 1;
        P.lIlIlIlIllllI[2] = -(0xFFFFF7DF & 0x7A3B) & (0xFFFFFBFF & 0x7EFF);
        P.lIlIlIlIllllI[3] = -(0xFFFFBAE3 & 0x751D) & (0xFFFFFFDA & 0x3FE7);
        P.lIlIlIlIllllI[4] = 0xFFFFA9FD & 0x5EDF;
        P.lIlIlIlIllllI[5] = -(0xFFFFC34F & 0x7CB1) & (0xFFFFDFFB & 0x6FDF);
        P.lIlIlIlIllllI[6] = -(0xFFFFB517 & 0x7FF9) & (0xFFFFFFF6 & 0x3DF9);
        P.lIlIlIlIllllI[7] = -(0xFFFFFF3B & 0x50E5) & (0xFFFFFFF5 & 0x5FFB);
        P.lIlIlIlIllllI[8] = 2;
    }

    @Inject
    protected P(Client client, SquireVorkathConfig squireVorkathConfig) {
        super(client, squireVorkathConfig);
        this.cG = client;
    }

    private static void lIllllllIllIIll() {
        lIlIlIlIlllIl = new String[lIlIlIlIllllI[8]];
        P.lIlIlIlIlllIl[P.lIlIlIlIllllI[0]] = P."Climb-over";
        P.lIlIlIlIlllIl[P.lIlIlIlIllllI[1]] = P."Climb-over";
    }

    private static boolean lIllllllIllIlIl(int n2) {
        return n2 != 0;
    }
}

