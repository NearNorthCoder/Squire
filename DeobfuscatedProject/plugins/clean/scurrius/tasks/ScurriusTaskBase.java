/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.GraphicsObject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Reachable
 */
package gg.squire.scurrius.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.GraphicsObject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Reachable;
import gg.squire.scurrius.tasks.BHelper;
import gg.squire.scurrius.tasks.ScurriusManager;

public abstract class ScurriusTaskBase
extends Task {
    
    protected final  Client d;
    protected final  SquireScurriusConfig b;
    protected final  SquireScurrius a;
    protected  Player e;
    protected final  b c;
    
    protected  boolean g;
    protected  NPC f;

    @Inject
    protected ScurriusTaskBase(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        this.a = squireScurrius;
        this.b = squireScurriusConfig;
        this.c = b2;
        this.d = client;
    }

    private static boolean lIlIllIIIllIIII(Object object) {
        return object != null;
    }

    private static boolean lIlIllIIIlIllll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        a var1;
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllIl(this.c() ? 1 : 0)) {
            return lIIlIlIllIlll[0];
        }
        var1.e = Players.getLocal();
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIlllI(var1.e)) {
            return lIIlIlIllIlll[0];
        }
        String[] stringArray = new String[lIIlIlIllIlll[1]];
        stringArray[r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[0]] = lIIlIlIllIllI[lIIlIlIllIlll[0]];
        var1.f = NPCs.getNearest((String[])stringArray);
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIlllI(var1.f)) {
            return lIIlIlIllIlll[0];
        }
        return this.ScurriusTaskBase();
    }

    private static boolean lIlIllIIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var2);
    }

    private static boolean lIlIllIIIlIlllI(Object object) {
        return object == null;
    }

    private static void lIlIllIIIlIlIll() {
        lIIlIlIllIllI = new String[lIIlIlIllIlll[2]];
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIllI[r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[0]] = r.r.s.u.-.s.i.e.u.u.r.i.q.c.s."Scurrius";
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIllI[r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[1]] = r.r.s.u.-.s.i.e.u.u.r.i.q.c.s."Scurrius";
    }

    private static boolean lIlIllIIIlIllIl(int n2) {
        return n2 == 0;
    }

    static {
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllII();
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIlIll();
    }

    protected WorldPoint b() {
        int[] nArray = new int[lIIlIlIllIlll[1]];
        nArray[r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[0]] = r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.A;
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIlllI(tileObject)) {
            return new WorldPoint(lIIlIlIllIlll[0], lIIlIlIllIlll[0], lIIlIlIllIlll[0]);
        }
        return tileObject.getWorldLocation().dx(lIIlIlIllIlll[2]).dy(lIIlIlIllIlll[3]);
    }

    public abstract boolean ScurriusTaskBase();

    /*
     * WARNING - void declaration
     */
    protected boolean ScurriusTaskBase(WorldPoint worldPoint) {
        Iterator var3 = this.d.getGraphicsObjects().iterator();
        while (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll(var3.hasNext() ? 1 : 0)) {
            void var4;
            a var5;
            WorldPoint var6;
            GraphicsObject var7 = (GraphicsObject)var3.next();
            if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIllIIIl(var7.getId(), r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.B) && r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll((var6 = WorldPoint.fromLocal((Client)var5.d, (LocalPoint)var7.getLocation())).equals((Object)var4) ? 1 : 0)) {
                return lIIlIlIllIlll[1];
            }

            if ((0xB4 ^ 0xB0) > 0) continue;
            return false;
        }
        return lIIlIlIllIlll[0];
    }

    protected boolean c() {
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll(this.d.isInInstancedRegion() ? 1 : 0)) {
            return lIIlIlIllIlll[1];
        }
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll(r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.F.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIIlIlIllIlll[1];
        }
        return lIIlIlIllIlll[0];
    }

    protected WorldPoint ScurriusTaskBase(boolean bl) {
        String[] stringArray = new String[lIIlIlIllIlll[1]];
        stringArray[r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[0]] = lIIlIlIllIllI[lIIlIlIllIlll[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll(bl ? 1 : 0) && r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIllIIII(nPC)) {
            WorldArea worldArea = nPC.getWorldArea().offset(lIIlIlIllIlll[1]);
            return worldArea.toWorldPointList().stream().filter(worldPoint -> {
                int n2;
                if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllIl(this.ScurriusTaskBase((WorldPoint)worldPoint) ? 1 : 0) && r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll(nPC.getWorldArea().isInMeleeDistance(worldPoint) ? 1 : 0)) {
                    n2 = lIIlIlIllIlll[1];

                } else {
                    n2 = lIIlIlIllIlll[0];
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)this.e))).orElse(null);
        }
        WorldArea worldArea = this.e.getWorldArea().offset(lIIlIlIllIlll[4]);
        return worldArea.toWorldPointList().stream().filter(worldPoint -> {
            boolean bl;
            if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllIl(this.ScurriusTaskBase((WorldPoint)worldPoint) ? 1 : 0)) {
                bl = lIIlIlIllIlll[1];

                if (3 > (0x35 ^ 0x7A ^ (0xFE ^ 0xB5))) {
                    return ((0xE1 ^ 0xBA ^ (0xE0 ^ 0x87)) & (0xA4 ^ 0x8B ^ (1 ^ 0x12) ^ -1)) != 0;
                }
            } else {
                bl = lIIlIlIllIlll[0];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)this.e))).orElse(null);
    }
}

