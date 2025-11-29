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
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.coords.RectangularArea
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.widgets.Widgets
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.NpcDespawned;
import net.runelite.api.events.NpcSpawned;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.coords.RectangularArea;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Widgets;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.j;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.k;

@Singleton
public class g {
    private /* synthetic */ j u;
    private static /* synthetic */ String[] lIIlIIllIlIII;
    private static /* synthetic */ int[] lIIlIIllIlIlI;
    private /* synthetic */ int t;
    private /* synthetic */ int v;
    private static final /* synthetic */ RectangularArea r;
    private final /* synthetic */ Client s;
    private static final /* synthetic */ int q;

    public int r() {
        g var13;
        if (g.lIlIlIlIIlIllIl(this.s.getVarbitValue(lIIlIIllIlIlI[7]), lIIlIIllIlIlI[2])) {
            return lIIlIIllIlIlI[8];
        }
        if (g.lIlIlIlIIlIllIl(var13.s.getVarbitValue(lIIlIIllIlIlI[9]), lIIlIIllIlIlI[2])) {
            return lIIlIIllIlIlI[10];
        }
        if (g.lIlIlIlIIlIllIl(var13.s.getVarbitValue(lIIlIIllIlIlI[11]), lIIlIIllIlIlI[2])) {
            return lIIlIIllIlIlI[12];
        }
        if (g.lIlIlIlIIlIllIl(var13.s.getVarbitValue(lIIlIIllIlIlI[13]), lIIlIIllIlIlI[2])) {
            return lIIlIIllIlIlI[14];
        }
        return lIIlIIllIlIlI[15];
    }

    private static boolean lIlIlIlIIlIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIlIlIlIIlIllll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIlIlIlIIlIllII(Object object) {
        return object == null;
    }

    public boolean m() {
        return this.a(Players.getLocal().getWorldLocation());
    }

    static {
        g.lIlIlIlIIlIlIII();
        g.lIlIlIlIIlIIllI();
        q = lIIlIIllIlIlI[4];
        r = new RectangularArea(lIIlIIllIlIlI[18], lIIlIIllIlIlI[19], lIIlIIllIlIlI[20], lIIlIIllIlIlI[21]);
    }

    @Subscribe
    public void a(NpcDespawned npcDespawned) {
        g var1;
        if (g.lIlIlIlIIlIlIIl(npcDespawned.getNpc().getName().equals(lIIlIIllIlIII[lIIlIIllIlIlI[1]]) ? 1 : 0)) {
            return;
        }
        if (g.lIlIlIlIIlIlIlI(var1.m() ? 1 : 0)) {
            var1.v += lIIlIIllIlIlI[1];
        }
        this.t = this.s.getTickCount();
        this.u = null;
    }

    private static boolean lIlIlIlIIlIlIIl(int n2) {
        return n2 == 0;
    }

    public boolean o() {
        boolean bl;
        if (g.lIlIlIlIIlIlIll(NPCs.getNearest(nPC -> {
            int n2;
            if (g.lIlIlIlIIlIlIIl(nPC.isDead() ? 1 : 0) && g.lIlIlIlIIlIlIll((Object)k.c(nPC))) {
                n2 = lIIlIIllIlIlI[1];
                0;
                if (1 >= (0xD ^ 9)) {
                    return false;
                }
            } else {
                n2 = lIIlIIllIlIlI[0];
            }
            return n2 != 0;
        }))) {
            bl = lIIlIIllIlIlI[1];
            0;
            if (((0x32 ^ 0x17) & ~(0x5F ^ 0x7A)) == 3) {
                return false;
            }
        } else {
            bl = lIIlIIllIlIlI[0];
        }
        return bl;
    }

    private static boolean lIlIlIlIIlIlllI(int n2, int n3) {
        return n2 >= n3;
    }

    public boolean s() {
        return Widgets.isVisible((Widget)Widgets.get((int)lIIlIIllIlIlI[16], (int)lIIlIIllIlIlI[17]));
    }

    public j t() {
        return this.u;
    }

    private static boolean lIlIlIlIIlIlIll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIlIIlIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIlIlIIlIIIll(String var9, String var6) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var12 = Cipher.getInstance("Blowfish");
            var12.init(lIIlIIllIlIlI[2], var3);
            return new String(var12.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    public boolean p() {
        boolean bl;
        if (g.lIlIlIlIIlIlIll(NPCs.getNearest(nPC -> {
            boolean bl;
            if (g.lIlIlIlIIlIlIll((Object)k.c(nPC))) {
                bl = lIIlIIllIlIlI[1];
                0;
                if (1 < 0) {
                    return ((109 + 130 - 60 + 0 ^ 120 + 34 - 115 + 116) & (0x5E ^ 0x3D ^ (0xFE ^ 0xB5) ^ -1)) != 0;
                }
            } else {
                bl = lIIlIIllIlIlI[0];
            }
            return bl;
        }))) {
            bl = lIIlIIllIlIlI[1];
            0;
            if (1 != 1) {
                return ((0x8B ^ 0xB1 ^ (0x71 ^ 0xA)) & (0x22 ^ 0x2C ^ (0x75 ^ 0x3A) ^ -1)) != 0;
            }
        } else {
            bl = lIIlIIllIlIlI[0];
        }
        return bl;
    }

    public int q() {
        return Vars.getBit((int)lIIlIIllIlIlI[6]);
    }

    public int u() {
        return this.v;
    }

    @Subscribe
    public void a(NpcSpawned npcSpawned) {
        if (g.lIlIlIlIIlIlIIl(npcSpawned.getNpc().getName().equals(lIIlIIllIlIII[lIIlIIllIlIlI[0]]) ? 1 : 0)) {
            return;
        }
        this.u = new j(npcSpawned.getNpc());
    }

    public int k() {
        if (g.lIlIlIlIIlIllIl(this.t, lIIlIIllIlIlI[3])) {
            return lIIlIIllIlIlI[3];
        }
        return this.t + lIIlIIllIlIlI[4] - this.s.getTickCount();
    }

    /*
     * WARNING - void declaration
     */
    public boolean n() {
        void var10;
        int[] nArray = this.s.getMapRegions();
        int n2 = nArray.length;
        int var4 = lIIlIIllIlIlI[0];
        while (g.lIlIlIlIIllIIII(var4, (int)var10)) {
            void var5;
            void var2 = var5[var4];
            if (g.lIlIlIlIIlIllIl((int)var2, lIIlIIllIlIlI[5])) {
                return lIIlIIllIlIlI[1];
            }
            ++var4;
            0;
            
            return ((0x20 ^ 0x60 ^ (0x7D ^ 0x6D)) & (187 + 108 - 160 + 94 ^ 65 + 147 - 150 + 119 ^ -1)) != 0;
        }
        return lIIlIIllIlIlI[0];
    }

    private static void lIlIlIlIIlIIllI() {
        lIIlIIllIlIII = new String[lIIlIIllIlIlI[22]];
        g.lIIlIIllIlIII[g.lIIlIIllIlIlI[0]] = g."Commander Zilyana";
        g.lIIlIIllIlIII[g.lIIlIIllIlIlI[1]] = g."Commander Zilyana";
        g.lIIlIIllIlIII[g.lIIlIIllIlIlI[2]] = g."Commander Zilyana";
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(WorldPoint worldPoint) {
        int n2;
        void var8;
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)worldPoint);
        if (g.lIlIlIlIIlIlIIl(this.n() ? 1 : 0)) {
            return lIIlIIllIlIlI[0];
        }
        if (g.lIlIlIlIIlIlllI(var8.getX(), r.getMinX()) && g.lIlIlIlIIlIllll(var8.getX(), r.getMaxX()) && g.lIlIlIlIIlIlllI(var8.getY(), r.getMinY()) && g.lIlIlIlIIlIllll(var8.getY(), r.getMaxY())) {
            n2 = lIIlIIllIlIlI[1];
            0;
            if ((0x29 ^ 0x2D) != (0x49 ^ 0x4D)) {
                return false;
            }
        } else {
            n2 = lIIlIIllIlIlI[0];
        }
        return n2 != 0;
    }

    public boolean l() {
        int n2;
        if (g.lIlIlIlIIlIlIll(this.u) && g.lIlIlIlIIlIlIlI(this.u.A() ? 1 : 0)) {
            n2 = lIIlIIllIlIlI[1];
            0;
            
            }
        } else {
            n2 = lIIlIIllIlIlI[0];
        }
        return n2 != 0;
    }

    private static void lIlIlIlIIlIlIII() {
        lIIlIIllIlIlI = new int[23];
        g.lIIlIIllIlIlI[0] = (0x46 ^ 0x61) & ~(0xE1 ^ 0xC6);
        g.lIIlIIllIlIlI[1] = 1;
        g.lIIlIIllIlIlI[2] = 2;
        g.lIIlIIllIlIlI[3] = -1;
        g.lIIlIIllIlIlI[4] = (0x5C ^ 8) + (0x45 ^ 0x41) - -(0xA3 ^ 0xAF) + (7 ^ 0x35);
        g.lIIlIIllIlIlI[5] = 0xFFFFFF77 & 0x2DDA;
        g.lIIlIIllIlIlI[6] = -(0xFFFFE23B & 0x3DE6) & (0xFFFFAFAF & 0x7FF5);
        g.lIIlIIllIlIlI[7] = 0xFFFFF6FC & 0x3B47;
        g.lIIlIIllIlIlI[8] = 0x28 ^ 0x2E ^ (0x1C ^ 0x15);
        g.lIIlIIllIlIlI[9] = -(0xFFFFCDEF & 0x3EBD) & (0xFFFFFFFF & 0x3EEF);
        g.lIIlIIllIlIlI[10] = 0xA ^ 0x18 ^ (0x29 ^ 0x22);
        g.lIIlIIllIlIlI[11] = 0xFFFFFF56 & 0x32EB;
        g.lIIlIIllIlIlI[12] = 0x28 ^ 0x36;
        g.lIIlIIllIlIlI[13] = -(0xFFFFFFBF & 0x9F5) & (0xFFFFBFF5 & 0x7BFF);
        g.lIIlIIllIlIlI[14] = 0x12 ^ 0x31;
        g.lIIlIIllIlIlI[15] = 0x97 ^ 0xBF;
        g.lIIlIIllIlIlI[16] = -(0xFFFFDC6F & 0x6FF2) & (0xFFFFDFFF & 0x6DF7);
        g.lIIlIIllIlIlI[17] = 0x2F ^ 0x3F;
        g.lIIlIIllIlIlI[18] = 0xA9 ^ 0xBB ^ (0x66 ^ 0x71);
        g.lIIlIIllIlIlI[19] = 103 + 31 - 114 + 141 ^ 157 + 108 - 199 + 102;
        g.lIIlIIllIlIlI[20] = 0x78 ^ 0x64;
        g.lIIlIIllIlIlI[21] = 0x4E ^ 0x56 ^ (0xA4 ^ 0x9C);
        g.lIIlIIllIlIlI[22] = 3;
    }

    private static boolean lIlIlIlIIllIIII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public g(Client client) {
        this.s = client;
        this.t = client.getTickCount();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameTick gameTick) {
        void var2_2;
        if (g.lIlIlIlIIlIlIll(this.u)) {
            return;
        }
        String[] stringArray = new String[lIIlIIllIlIlI[1]];
        stringArray[g.lIIlIIllIlIlI[0]] = lIIlIIllIlIII[lIIlIIllIlIlI[2]];
        NPC var11 = NPCs.getNearest((String[])stringArray);
        if (g.lIlIlIlIIlIllII(var11)) {
            return;
        }
        this.u = new j((NPC)var2_2);
    }

    public boolean a(String string) {
        return lIIlIIllIlIlI[0];
    }
}

