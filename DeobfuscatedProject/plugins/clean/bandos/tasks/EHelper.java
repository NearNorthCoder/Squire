/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.GameTick
 *  net.runelite.api.events.NpcDespawned
 *  net.runelite.api.events.NpcSpawned
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.bandos.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import gg.squire.bandos.tasks.AHelper;
import gg.squire.bandos.tasks.GameEnum;
import gg.squire.bandos.tasks.DHelper;

@Singleton
public class EHelper {
    private  int s;
    private static final  RectangularArea o;
    
    private  a r;
    
    private  int q;
    private final  Client p;
    private static final  int n;

    public boolean y() {
        boolean bl;
        int[] nArray = new int[lllIIIIllII[3]];
        nArray[e.lllIIIIllII[1]] = lllIIIIllII[6];
        nArray[e.lllIIIIllII[2]] = lllIIIIllII[7];
        if (e.lIlIllIlIIllll(TileObjects.getNearest((int[])nArray))) {
            bl = lllIIIIllII[2];

        } else {
            bl = lllIIIIllII[1];
        }
        return bl;
    }

    private static boolean lIlIllIlIlIIIl(int n2, int n3) {
        return n2 == n3;
    }

    static {
        e.lIlIllIlIIllII();
        e.lIlIllIlIIlIll();
        n = lllIIIIllII[4];
        o = new RectangularArea(lllIIIIllII[8], lllIIIIllII[9], lllIIIIllII[10], lllIIIIllII[11]);
    }

    private static boolean lIlIllIlIlIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    public int x() {
        return Vars.getBit((int)lllIIIIllII[5]);
    }

    /*
     * WARNING - void declaration
     */
    public boolean u() {
        void var1;
        int[] nArray = this.p.getMapRegions();
        int n2 = nArray.length;
        int var2 = lllIIIIllII[1];
        while (e.lIlIllIlIlIlII(var2, (int)var1)) {
            void var3;
            void var4 = var3[var2];
            if (e.lIlIllIlIlIIIl((int)var4, d.i())) {
                return lllIIIIllII[2];
            }
            ++var2;

            return false;
        }
        return lllIIIIllII[1];
    }

    private static boolean lIlIllIlIlIIII(Object object) {
        return object == null;
    }

    public boolean t() {
        return this.b(Players.getLocal().getWorldLocation());
    }

    private static void lIlIllIlIIlIll() {
        lllIIIIlIll = new String[lllIIIIllII[12]];
        e.lllIIIIlIll[e.lllIIIIllII[1]] = "General Graardor";
        e.lllIIIIlIll[e.lllIIIIllII[2]] = "General Graardor";
        e.lllIIIIlIll[e.lllIIIIllII[3]] = "General Graardor";
    }

    public boolean w() {
        boolean bl;
        if (e.lIlIllIlIIllll(NPCs.getNearest(nPC -> {
            boolean bl;
            if (e.lIlIllIlIIllll((Object)b.a(nPC))) {
                bl = lllIIIIllII[2];

                if (3 <= 0) {
                    return ((11 + 98 - 96 + 137 ^ 105 + 97 - 47 + 2) & (0xCB ^ 0xB0 ^ (0x66 ^ 0x16) ^ -1)) != 0;
                }
            } else {
                bl = lllIIIIllII[1];
            }
            return bl;
        }))) {
            bl = lllIIIIllII[2];

            if (1 == (7 ^ 3)) {
                return false;
            }
        } else {
            bl = lllIIIIllII[1];
        }
        return bl;
    }

    private static boolean lIlIllIlIIllIl(int n2) {
        return n2 == 0;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (e.lIlIllIlIIllIl(npcSpawned.getNpc().getName().equals(lllIIIIlIll[lllIIIIllII[1]]) ? 1 : 0)) {
            return;
        }
        this.r = new AHelper(npcSpawned.getNpc());
    }

    public int A() {
        return this.s;
    }

    public a z() {
        return this.r;
    }

    private static boolean lIlIllIlIlIIll(int n2, int n3) {
        return n2 <= n3;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        e var5;
        if (e.lIlIllIlIIllIl(npcDespawned.getNpc().getName().equals(lllIIIIlIll[lllIIIIllII[2]]) ? 1 : 0)) {
            return;
        }
        if (e.lIlIllIlIIlllI(var5.t() ? 1 : 0)) {
            var5.s += lllIIIIllII[2];
        }
        this.q = this.p.getTickCount();
        this.r = null;
    }

    private static boolean lIlIllIlIIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(WorldPoint worldPoint) {
        int n2;
        void var6;
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)worldPoint);
        if (e.lIlIllIlIIllIl(this.u() ? 1 : 0)) {
            return lllIIIIllII[1];
        }
        if (e.lIlIllIlIlIIlI(var6.getX(), o.getMinX()) && e.lIlIllIlIlIIll(var6.getX(), o.getMaxX()) && e.lIlIllIlIlIIlI(var6.getY(), o.getMinY()) && e.lIlIllIlIlIIll(var6.getY(), o.getMaxY())) {
            n2 = lllIIIIllII[2];

            if ((0x8C ^ 0x88) <= -1) {
                return false;
            }
        } else {
            n2 = lllIIIIllII[1];
        }
        return n2 != 0;
    }

    public boolean v() {
        boolean bl;
        if (e.lIlIllIlIIllll(NPCs.getNearest(nPC -> {
            int n2;
            if (e.lIlIllIlIIllIl(nPC.isDead() ? 1 : 0) && e.lIlIllIlIIllll((Object)b.a(nPC))) {
                n2 = lllIIIIllII[2];

                if (-1 > 1) {
                    return false;
                }
            } else {
                n2 = lllIIIIllII[1];
            }
            return n2 != 0;
        }))) {
            bl = lllIIIIllII[2];

            if (1 > 3) {
                return false;
            }
        } else {
            bl = lllIIIIllII[1];
        }
        return bl;
    }

    private static boolean lIlIllIlIlIlII(int n2, int n3) {
        return n2 < n3;
    }

    public boolean s() {
        int n2;
        if (e.lIlIllIlIIllll(this.r) && e.lIlIllIlIIlllI(this.r.a() ? 1 : 0)) {
            n2 = lllIIIIllII[2];

            if (((0xC3 ^ 0xBD ^ (0x41 ^ 0x33)) & (0x91 ^ 0xB0 ^ (0xEE ^ 0xC3) ^ -1)) != 0) {
                return ((0x2E ^ 0x23 ^ (0xBD ^ 0xA2)) & (0xF3 ^ 0x94 ^ (0x18 ^ 0x6D) ^ -1)) != 0;
            }
        } else {
            n2 = lllIIIIllII[1];
        }
        return n2 != 0;
    }

    private static boolean lIlIllIlIIllll(Object object) {
        return object != null;
    }

    @Inject
    public EHelper(Client client) {
        this.q = lllIIIIllII[0];
        this.p = client;
    }

    public int r() {
        if (e.lIlIllIlIlIIIl(this.q, lllIIIIllII[0])) {
            return lllIIIIllII[0];
        }
        return this.q + lllIIIIllII[4] - this.p.getTickCount();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameTick gameTick) {
        void var2_2;
        if (e.lIlIllIlIIllll(this.r)) {
            return;
        }
        String[] stringArray = new String[lllIIIIllII[2]];
        stringArray[e.lllIIIIllII[1]] = lllIIIIlIll[lllIIIIllII[3]];
        NPC var7 = NPCs.getNearest((String[])stringArray);
        if (e.lIlIllIlIlIIII(var7)) {
            return;
        }
        this.r = new AHelper((NPC)var2_2);
    }
}

