/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.ScenePoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.ScenePoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Entering boss room", priority=1)
public class EnteringBossRoomTask
extends GauntletTaskBase {

    static {
        w.lllllIlllllllI();
        w.lllllIllllllIl();
    }

    private static boolean llllllIIIIIIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean llllllIIIIIIlI(Object object) {
        return object != null;
    }

    @Inject
    public EnteringBossRoomTask(c c2) {
        d[] dArray = new d[llIIlIlllIIl[0]];
        dArray[w.llIIlIlllIIl[1]] = d.AFK;
        super(c2, dArray);
    }

    private static boolean lllllIllllllll(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIIIIIIIl(Object object) {
        return object == null;
    }

    private static void lllllIllllllIl() {
        llIIlIlllIII = new String[llIIlIlllIIl[5]];
        w.llIIlIlllIII[w.llIIlIlllIIl[1]] = "Quick-exit";
        w.llIIlIlllIII[w.llIIlIlllIIl[0]] = "Waiting for Hunleff to move away from the entrance";
        w.llIIlIlllIII[w.llIIlIlllIIl[4]] = "Quick-pass";
    }

    private static boolean llllllIIIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllIIIIIIll(int n2, int n3) {
        return n2 > n3;
    }

        return String.valueOf(var1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var2_3;
        w var2;
        if (w.lllllIllllllll(this.ba.h().enterBossRoom() ? 1 : 0)) {
            return llIIlIlllIIl[1];
        }
        int[] nArray = new int[llIIlIlllIIl[0]];
        nArray[w.llIIlIlllIIl[1]] = llIIlIlllIIl[2];
        int var3 = Inventory.getCount((int[])nArray);
        if (w.llllllIIIIIIII(var3, var2.ba.h().abortFishAmount())) {
            TileObject var4 = TileObjects.getNearest(tileObject -> e.ac.contains(tileObject.getId()));
            if (w.llllllIIIIIIIl(var4)) {
                return llIIlIlllIIl[1];
            }
            var4.interact(llIIlIlllIII[llIIlIlllIIl[1]]);
            return llIIlIlllIIl[0];
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> e.aF.contains(tileObject.getId()));
        if (w.llllllIIIIIIIl(var4)) {
            return llIIlIlllIIl[1];
        }
        NPC var5 = var2.ba.X().aI();
        if (!w.llllllIIIIIIlI(var5) || w.llllllIIIIIIll(var4.distanceTo((Locatable)Players.getLocal()), llIIlIlllIIl[3])) {
            ScenePoint var6 = ScenePoint.fromWorld((WorldPoint)var4.getWorldLocation());
            Movement.setDestination((int)var6.getX(), (int)var6.getY());
            return llIIlIlllIIl[0];
        }
        if (w.llllllIIIIIIII(var5.getWorldArea().distanceTo(var4.getWorldLocation()), llIIlIlllIIl[0])) {
            Log.info((String)llIIlIlllIII[llIIlIlllIIl[0]]);
            return llIIlIlllIIl[0];
        }
        var2_3.interact(llIIlIlllIII[llIIlIlllIIl[4]]);
        return llIIlIlllIIl[0];
    }
}

