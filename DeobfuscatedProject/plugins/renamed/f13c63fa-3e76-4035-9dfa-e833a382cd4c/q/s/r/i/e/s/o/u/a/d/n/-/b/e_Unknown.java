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
package q.s.r.i.e.s.o.u.a.d.n.-.b;

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
import q.s.r.i.e.s.o.u.a.d.n.-.b.a_Unknown;
import q.s.r.i.e.s.o.u.a.d.n.-.b.BEnum;
import q.s.r.i.e.s.o.u.a.d.n.-.b.d_Unknown;

@Singleton
public class e_Unknown {
    private /* synthetic */ int s;
    private static final /* synthetic */ RectangularArea o;
    private static /* synthetic */ int[] lllIIIIllII;
    private /* synthetic */ a r;
    private static /* synthetic */ String[] lllIIIIlIll;
    private /* synthetic */ int q;
    private final /* synthetic */ Client p;
    private static final /* synthetic */ int n;

    public boolean y() {
        boolean bl;
        int[] nArray = new int[lllIIIIllII[3]];
        nArray[e.lllIIIIllII[1]] = lllIIIIllII[6];
        nArray[e.lllIIIIllII[2]] = lllIIIIllII[7];
        if (e.lIlIllIlIIllll(TileObjects.getNearest((int[])nArray))) {
            bl = lllIIIIllII[2];
            0;
            if (-3 > 0) {
                return (3 & ~3) != 0;
            }
        } else {
            bl = lllIIIIllII[1];
        }
        return bl;
    }

    private static void lIlIllIlIIllII() {
        lllIIIIllII = new int[14];
        e.lllIIIIllII[0] = -1;
        e.lllIIIIllII[1] = (0x53 ^ 0x5D ^ (0xE0 ^ 0xB0)) & (17 + 115 - 96 + 199 ^ 119 + 48 - 73 + 87 ^ -1);
        e.lllIIIIllII[2] = 1;
        e.lllIIIIllII[3] = 2;
        e.lllIIIIllII[4] = (0x3E ^ 0xC) + (0xCE ^ 0xB0) - (105 + 96 - 125 + 64) + (0x2E ^ 0x5C);
        e.lllIIIIllII[5] = -(0xFFFFD95D & 0x76A3) & (0xFFFFDFFF & 0x7F87);
        e.lllIIIIllII[6] = 0xA ^ 0xD;
        e.lllIIIIllII[7] = -(0xFFFF9DFF & 0x776B) & (0xFFFFBD7F & 0xFFFF);
        e.lllIIIIllII[8] = 0x20 ^ 0x10;
        e.lllIIIIllII[9] = 0x34 ^ 0x13;
        e.lllIIIIllII[10] = 0x6C ^ 0x2B ^ (0xED ^ 0x96);
        e.lllIIIIllII[11] = 0x55 ^ 0xB ^ (0x64 ^ 3);
        e.lllIIIIllII[12] = 3;
        e.lllIIIIllII[13] = 0xBE ^ 0xB6;
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
        void var11;
        int[] nArray = this.p.getMapRegions();
        int n2 = nArray.length;
        int var1 = lllIIIIllII[1];
        while (e.lIlIllIlIlIlII(var1, (int)var11)) {
            void var7;
            void var8 = var7[var1];
            if (e.lIlIllIlIlIIIl((int)var8, d.i())) {
                return lllIIIIllII[2];
            }
            ++var1;
            0;
            
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
        e.lllIIIIlIll[e.lllIIIIllII[1]] = e."General Graardor";
        e.lllIIIIlIll[e.lllIIIIllII[2]] = e."General Graardor";
        e.lllIIIIlIll[e.lllIIIIllII[3]] = e."General Graardor";
    }

    public boolean w() {
        boolean bl;
        if (e.lIlIllIlIIllll(NPCs.getNearest(nPC -> {
            boolean bl;
            if (e.lIlIllIlIIllll((Object)b.a(nPC))) {
                bl = lllIIIIllII[2];
                0;
                if (3 <= 0) {
                    return ((11 + 98 - 96 + 137 ^ 105 + 97 - 47 + 2) & (0xCB ^ 0xB0 ^ (0x66 ^ 0x16) ^ -1)) != 0;
                }
            } else {
                bl = lllIIIIllII[1];
            }
            return bl;
        }))) {
            bl = lllIIIIllII[2];
            0;
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
        this.r = new a(npcSpawned.getNpc());
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
        e var9;
        if (e.lIlIllIlIIllIl(npcDespawned.getNpc().getName().equals(lllIIIIlIll[lllIIIIllII[2]]) ? 1 : 0)) {
            return;
        }
        if (e.lIlIllIlIIlllI(var9.t() ? 1 : 0)) {
            var9.s += lllIIIIllII[2];
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
        void var4;
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)worldPoint);
        if (e.lIlIllIlIIllIl(this.u() ? 1 : 0)) {
            return lllIIIIllII[1];
        }
        if (e.lIlIllIlIlIIlI(var4.getX(), o.getMinX()) && e.lIlIllIlIlIIll(var4.getX(), o.getMaxX()) && e.lIlIllIlIlIIlI(var4.getY(), o.getMinY()) && e.lIlIllIlIlIIll(var4.getY(), o.getMaxY())) {
            n2 = lllIIIIllII[2];
            0;
            if ((0x8C ^ 0x88) <= -1) {
                return false;
            }
        } else {
            n2 = lllIIIIllII[1];
        }
        return n2 != 0;
    }

    private static String lIlIllIlIIlIlI(String var10, String var2) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), lllIIIIllII[13]), "DES");
            Cipher var3 = Cipher.getInstance("DES");
            var3.init(lllIIIIllII[3], var5);
            return new String(var3.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var6) {
            var6.printStackTrace();
            return null;
        }
    }

    public boolean v() {
        boolean bl;
        if (e.lIlIllIlIIllll(NPCs.getNearest(nPC -> {
            int n2;
            if (e.lIlIllIlIIllIl(nPC.isDead() ? 1 : 0) && e.lIlIllIlIIllll((Object)b.a(nPC))) {
                n2 = lllIIIIllII[2];
                0;
                if (-1 > 1) {
                    return false;
                }
            } else {
                n2 = lllIIIIllII[1];
            }
            return n2 != 0;
        }))) {
            bl = lllIIIIllII[2];
            0;
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
            0;
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
    public e(Client client) {
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
        NPC var12 = NPCs.getNearest((String[])stringArray);
        if (e.lIlIllIlIlIIII(var12)) {
            return;
        }
        this.r = new a((NPC)var2_2);
    }
}

