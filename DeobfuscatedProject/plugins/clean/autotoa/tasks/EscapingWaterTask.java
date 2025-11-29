/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Point
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.autotoa.tasks;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.autotoa.tasks.AutotoaTaskBase;
import gg.squire.autotoa.tasks.GameEnum51;
import gg.squire.autotoa.tasks.AutotoaManager;

@TaskDesc(name="Escaping water", priority=50, blocking=true)
public class EscapingWaterTask
extends AutotoaTaskBase {

    @Inject
    protected EscapingWaterTask(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIIlIllIlllIll(int n2) {
        return n2 == 0;
    }

    private static void lIIlIllIllIllI() {
        lIllIlIIIlI = new String[lIllIlIIlII[3]];
        bT.lIllIlIIIlI[bT.lIllIlIIlII[0]] = "Rock steps";
        bT.lIllIlIIIlI[bT.lIllIlIIlII[2]] = "Climb-up";
    }

    private static boolean lIIlIllIlllIlI(Object object) {
        return object == null;
    }

    private static boolean lIIlIllIllllII(int n2) {
        return n2 != 0;
    }

    static {
        bT.lIIlIllIlllIIl();
        bT.lIIlIllIllIllI();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bL() {
        void var3_3;
        bT var1;
        NPC nPC = this.cB();
        if (bT.lIIlIllIlllIlI(nPC)) {
            return lIllIlIIlII[0];
        }
        Point var2 = new Point(lIllIlIIlII[1], lIllIlIIlII[1]);
        if (!bT.lIIlIllIlllIll(Reachable.isWalkable((WorldPoint)var1.a(var2)) ? 1 : 0) || bT.lIIlIllIllllII(Reachable.isObstacle((WorldPoint)var1.a(var2)) ? 1 : 0)) {
            return lIllIlIIlII[0];
        }
        String[] stringArray = new String[lIllIlIIlII[2]];
        stringArray[bT.lIllIlIIlII[0]] = lIllIlIIIlI[lIllIlIIlII[0]];
        TileObject var3 = TileObjects.getNearest((String[])stringArray);
        if (bT.lIIlIllIlllIlI(var3)) {
            return lIllIlIIlII[0];
        }
        if (bT.lIIlIllIllllIl((Object)var1.cF(), (Object)bY.ATTACK)) {
            Movement.setDestination((WorldPoint)var3.getWorldLocation());
            return lIllIlIIlII[2];
        }
        var3_3.interact(lIllIlIIIlI[lIllIlIIlII[2]]);
        return lIllIlIIlII[2];
    }

    private static boolean lIIlIllIllllIl(Object object, Object object2) {
        return object != object2;
    }
}

