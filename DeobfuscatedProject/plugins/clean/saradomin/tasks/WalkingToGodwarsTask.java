/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.saradomin.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.SquireSaradomin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import gg.squire.saradomin.tasks.SaradominManager;
import gg.squire.saradomin.tasks.SaradominTaskBase;

@TaskDesc(name="Walking to Godwars")
public class WalkingToGodwarsTask
extends SaradominTaskBase {
    private final  g S;
    
    private static final  WorldPoint Q;
    
    private static final  int R;

    private static boolean lIlIlIlIlIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIlIlIllIll(Object object) {
        return object != null;
    }

    private static void lIlIlIlIlIlIlII() {
        lIIlIIllllIII = new String[lIIlIIllllIIl[2]];
        p.lIIlIIllllIII[p.lIIlIIllllIIl[0]] = "Climb-down";
    }

    private static boolean lIlIlIlIlIllIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        p var1;
        if (p.lIlIlIlIlIllIII(this.S() ? 1 : 0)) {
            return lIIlIIllllIIl[0];
        }
        if (p.lIlIlIlIlIllIIl(var1.O.a() ? 1 : 0)) {
            return lIIlIIllllIIl[0];
        }
        if (p.lIlIlIlIlIllIIl(var1.S.s() ? 1 : 0)) {
            return lIIlIIllllIIl[0];
        }
        if (p.lIlIlIlIlIllIIl(var1.P.isInInstancedRegion() ? 1 : 0)) {
            return lIIlIIllllIIl[0];
        }
        if (p.lIlIlIlIlIllIlI(var1.P.getPlane(), lIIlIIllllIIl[1])) {
            return lIIlIIllllIIl[0];
        }
        int[] nArray = new int[lIIlIIllllIIl[2]];
        nArray[p.lIIlIIllllIIl[0]] = lIIlIIllllIIl[3];
        TileObject var2 = TileObjects.getNearest((int[])nArray);
        if (!p.lIlIlIlIlIllIll(var2) || p.lIlIlIlIlIllIII(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)Q);

            return lIIlIIllllIIl[2];
        }
        var1_1.interact(lIIlIIllllIII[lIIlIIllllIIl[0]]);
        return lIIlIIllllIIl[2];
    }

    private static boolean lIlIlIlIlIllIIl(int n2) {
        return n2 != 0;
    }

    static {
        p.lIlIlIlIlIlIlll();
        p.lIlIlIlIlIlIlII();
        R = lIIlIIllllIIl[3];
        Q = new WorldPoint(lIIlIIllllIIl[4], lIIlIIllllIIl[5], lIIlIIllllIIl[0]);
    }

    @Inject
    public WalkingToGodwarsTask(SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin, g g2, Client client) {
        super(squireSaraConfig, squireSaradomin, client);
        this.S = g2;
    }
}

