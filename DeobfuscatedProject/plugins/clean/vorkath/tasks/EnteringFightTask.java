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
package gg.squire.vorkath.tasks;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathTaskBase;
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
public class EnteringFightTask
extends VorkathTaskBase {
    private final  Client cG;
    private static final  WorldPoint cF;
    
    public static final  WorldPoint cE;
    public static final  WorldArea cD;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean Q() {
        void var1_1;
        if (P.lIllllllIllIlIl(this.cG.isInInstancedRegion() ? 1 : 0)) {
            return lIlIlIlIllllI[0];
        }
        TileObject var1 = TileObjects.getNearest((WorldPoint)cE, tileObject -> {
            String[] stringArray = new String[lIlIlIlIllllI[1]];
            stringArray[P.lIlIlIlIllllI[0]] = lIlIlIlIlllIl[lIlIlIlIllllI[1]];
            return tileObject.hasAction(stringArray);
        });
        if (P.lIllllllIllIllI(var1)) {
            Movement.walkTo((WorldPoint)cF);

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

        return String.valueOf(var2);
    }

    private static boolean lIllllllIllIllI(Object object) {
        return object == null;
    }

    @Inject
    protected EnteringFightTask(Client client, SquireVorkathConfig squireVorkathConfig) {
        super(client, squireVorkathConfig);
        this.cG = client;
    }

    private static void lIllllllIllIIll() {
        lIlIlIlIlllIl = new String[lIlIlIlIllllI[8]];
        P.lIlIlIlIlllIl[P.lIlIlIlIllllI[0]] = "Climb-over";
        P.lIlIlIlIlllIl[P.lIlIlIlIllllI[1]] = "Climb-over";
    }

    private static boolean lIllllllIllIlIl(int n2) {
        return n2 != 0;
    }
}

