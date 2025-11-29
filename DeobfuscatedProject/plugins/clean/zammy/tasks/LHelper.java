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
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Vars
 */
package gg.squire.zammy.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.zammy.tasks.CHelper;
import m.e.a.i.z.m.r.-.q.s.y.u.d;
import gg.squire.zammy.tasks.GameEnum16;
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
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Vars;

@Singleton
public class LHelper {
    private  int z;
    private static final  int w;

    private  d A;
    private final  Client y;
    private  int B;
    private static final  RectangularArea x;

    public boolean G() {
        boolean bl;
        int[] nArray = new int[lIllIIllIIlIl[3]];
        nArray[l.lIllIIllIIlIl[1]] = lIllIIllIIlIl[6];
        nArray[l.lIllIIllIIlIl[2]] = lIllIIllIIlIl[7];
        if (l.llIIIllIlIIlIIl(TileObjects.getNearest((int[])nArray))) {
            bl = lIllIIllIIlIl[2];

        } else {
            bl = lIllIIllIIlIl[1];
        }
        return bl;
    }

    public d I() {
        return this.A;
    }

    private static boolean llIIIllIlIIlIlI(Object object) {
        return object == null;
    }

    static {
        l.llIIIllIlIIIllI();
        l.llIIIllIIlIllII();
        w = lIllIIllIIlIl[4];
        x = new RectangularArea(lIllIIllIIlIl[9], lIllIIllIIlIl[10], lIllIIllIIlIl[11], lIllIIllIIlIl[12]);
    }

    public boolean A() {
        int n2;
        if (l.llIIIllIlIIlIIl(this.A) && l.llIIIllIlIIlIII(this.A.k() ? 1 : 0)) {
            n2 = lIllIIllIIlIl[2];

            if (2 >= (0x34 ^ 0x30)) {
                return false;
            }
        } else {
            n2 = lIllIIllIIlIl[1];
        }
        return n2 != 0;
    }

    public int F() {
        return Vars.getBit((int)lIllIIllIIlIl[5]);
    }

    public boolean D() {
        boolean bl;
        if (l.llIIIllIlIIlIIl(NPCs.getNearest(nPC -> {
            int n2;
            if (l.llIIIllIlIIIlll(nPC.isDead() ? 1 : 0) && l.llIIIllIlIIlIIl((Object)e.a(nPC))) {
                n2 = lIllIIllIIlIl[2];

                }
            } else {
                n2 = lIllIIllIIlIl[1];
            }
            return n2 != 0;
        }))) {
            bl = lIllIIllIIlIl[2];

            if ((2 ^ 0x48 ^ (0x14 ^ 0x5B)) <= 0) {
                return ((3 ^ (0x3D ^ 0x6D)) & (188 + 208 - 187 + 23 ^ 85 + 31 - -27 + 44 ^ -1)) != 0;
            }
        } else {
            bl = lIllIIllIIlIl[1];
        }
        return bl;
    }

    public boolean E() {
        boolean bl;
        if (l.llIIIllIlIIlIIl(NPCs.getNearest(nPC -> {
            boolean bl;
            if (l.llIIIllIlIIlIIl((Object)e.a(nPC))) {
                bl = lIllIIllIIlIl[2];

                if (3 > (0xD4 ^ 0xAC ^ (0xBF ^ 0xC3))) {
                    return ((0xA3 ^ 0xA6 ^ (0x3E ^ 0xE)) & (3 ^ (0x41 ^ 0x77) ^ -1)) != 0;
                }
            } else {
                bl = lIllIIllIIlIl[1];
            }
            return bl;
        }))) {
            bl = lIllIIllIIlIl[2];

            if (1 == 0) {
                return ((10 + 60 - -58 + 49 ^ 132 + 76 - 51 + 17) & (0x51 ^ 0x55 ^ (0x64 ^ 0x7F) ^ -1)) != 0;
            }
        } else {
            bl = lIllIIllIIlIl[1];
        }
        return bl;
    }

    private static boolean llIIIllIlIIllIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean C() {
        void var1;
        int[] nArray = this.y.getMapRegions();
        int n2 = nArray.length;
        int var2 = lIllIIllIIlIl[1];
        while (l.llIIIllIlIIlllI(var2, (int)var1)) {
            void var3;
            void var4 = var3[var2];
            if (l.llIIIllIlIIlIll((int)var4, c.b())) {
                return lIllIIllIIlIl[2];
            }
            ++var2;

            if (((5 ^ 0x3E) & ~(0x8D ^ 0xB6)) >= 0) continue;
            return false;
        }
        return lIllIIllIIlIl[1];
    }

    private static boolean llIIIllIlIIIlll(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean b(WorldPoint worldPoint) {
        int n2;
        void var5;
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)worldPoint);
        if (l.llIIIllIlIIIlll(this.C() ? 1 : 0)) {
            return lIllIIllIIlIl[1];
        }
        if (l.llIIIllIlIIllII(var5.getX(), x.getMinX()) && l.llIIIllIlIIllIl(var5.getX(), x.getMaxX()) && l.llIIIllIlIIllII(var5.getY(), x.getMinY()) && l.llIIIllIlIIllIl(var5.getY(), x.getMaxY())) {
            n2 = lIllIIllIIlIl[2];

            if (((0xC3 ^ 0x8C) & ~(0x52 ^ 0x1D)) != 0) {
                return false;
            }
        } else {
            n2 = lIllIIllIIlIl[1];
        }
        return n2 != 0;
    }

    private static boolean llIIIllIlIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean H() {
        boolean bl;
        if (l.llIIIllIlIIllIl(this.z(), lIllIIllIIlIl[8])) {
            return lIllIIllIIlIl[1];
        }
        List var6 = NPCs.getAll(nPC -> {
            int n2;
            if (l.llIIIllIlIIIlll(nPC.isDead() ? 1 : 0) && l.llIIIllIlIIlIIl((Object)e.a(nPC))) {
                n2 = lIllIIllIIlIl[2];

                if (2 < ((0x45 ^ 0x4B) & ~(0x7B ^ 0x75))) {
                    return (2 & ~2) != 0;
                }
            } else {
                n2 = lIllIIllIIlIl[1];
            }
            return n2 != 0;
        });
        if (!l.llIIIllIlIIllll(var6.size(), lIllIIllIIlIl[3]) || l.llIIIllIlIlIIII(Combat.getMissingHealth()) && l.llIIIllIlIIlIll(var6.size(), lIllIIllIIlIl[2])) {
            bl = lIllIIllIIlIl[2];

        } else {
            bl = lIllIIllIIlIl[1];
        }
        return bl;
    }

        return String.valueOf(var7);
    }

    private static boolean llIIIllIlIIllII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIIIllIlIIllll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean llIIIllIlIIlIIl(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameTick gameTick) {
        void var2_2;
        if (l.llIIIllIlIIlIIl(this.A)) {
            return;
        }
        String[] stringArray = new String[lIllIIllIIlIl[2]];
        stringArray[l.lIllIIllIIlIl[1]] = lIllIIlIlllII[lIllIIllIIlIl[3]];
        NPC var8 = NPCs.getNearest((String[])stringArray);
        if (l.llIIIllIlIIlIlI(var8)) {
            return;
        }
        this.A = new d((NPC)var2_2);
    }

    public boolean B() {
        return this.b(Players.getLocal().getWorldLocation());
    }

    private static boolean llIIIllIlIIlIll(int n2, int n3) {
        return n2 == n3;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (l.llIIIllIlIIIlll(npcSpawned.getNpc().getName().equals(lIllIIlIlllII[lIllIIllIIlIl[1]]) ? 1 : 0)) {
            return;
        }
        this.A = new d(npcSpawned.getNpc());
    }

    public int J() {
        return this.B;
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        l var9;
        if (l.llIIIllIlIIIlll(npcDespawned.getNpc().getName().equals(lIllIIlIlllII[lIllIIllIIlIl[2]]) ? 1 : 0)) {
            return;
        }
        if (l.llIIIllIlIIlIII(var9.B() ? 1 : 0)) {
            var9.B += lIllIIllIIlIl[2];
        }
        this.z = this.y.getTickCount();
        this.A = null;
    }

    @Inject
    public LHelper(Client client) {
        this.z = lIllIIllIIlIl[0];
        this.y = client;
    }

    private static boolean llIIIllIlIIlIII(int n2) {
        return n2 != 0;
    }

    private static void llIIIllIIlIllII() {
        lIllIIlIlllII = new String[lIllIIllIIlIl[13]];
        l.lIllIIlIlllII[l.lIllIIllIIlIl[1]] = "K'ril Tsutsaroth";
        l.lIllIIlIlllII[l.lIllIIllIIlIl[2]] = "K'ril Tsutsaroth";
        l.lIllIIlIlllII[l.lIllIIllIIlIl[3]] = "K'ril Tsutsaroth";
    }

    public boolean a(String string) {
        return lIllIIllIIlIl[1];
    }

    public int z() {
        if (l.llIIIllIlIIlIll(this.z, lIllIIllIIlIl[0])) {
            return lIllIIllIIlIl[0];
        }
        return this.z + lIllIIllIIlIl[4] - this.y.getTickCount();
    }

    private static boolean llIIIllIlIlIIII(int n2) {
        return n2 > 0;
    }
}

