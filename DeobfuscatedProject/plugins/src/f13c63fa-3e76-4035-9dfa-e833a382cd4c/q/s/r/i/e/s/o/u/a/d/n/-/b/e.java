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
import q.s.r.i.e.s.o.u.a.d.n.-.b.a;
import q.s.r.i.e.s.o.u.a.d.n.-.b.b;
import q.s.r.i.e.s.o.u.a.d.n.-.b.d;

@Singleton
public class e {
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
            "".length();
            if (-"   ".length() > 0) {
                return ("   ".length() & ~"   ".length()) != 0;
            }
        } else {
            bl = lllIIIIllII[1];
        }
        return bl;
    }

    private static void lIlIllIlIIllII() {
        lllIIIIllII = new int[14];
        e.lllIIIIllII[0] = -" ".length();
        e.lllIIIIllII[1] = (0x53 ^ 0x5D ^ (0xE0 ^ 0xB0)) & (17 + 115 - 96 + 199 ^ 119 + 48 - 73 + 87 ^ -" ".length());
        e.lllIIIIllII[2] = " ".length();
        e.lllIIIIllII[3] = "  ".length();
        e.lllIIIIllII[4] = (0x3E ^ 0xC) + (0xCE ^ 0xB0) - (105 + 96 - 125 + 64) + (0x2E ^ 0x5C);
        e.lllIIIIllII[5] = -(0xFFFFD95D & 0x76A3) & (0xFFFFDFFF & 0x7F87);
        e.lllIIIIllII[6] = 0xA ^ 0xD;
        e.lllIIIIllII[7] = -(0xFFFF9DFF & 0x776B) & (0xFFFFBD7F & 0xFFFF);
        e.lllIIIIllII[8] = 0x20 ^ 0x10;
        e.lllIIIIllII[9] = 0x34 ^ 0x13;
        e.lllIIIIllII[10] = 0x6C ^ 0x2B ^ (0xED ^ 0x96);
        e.lllIIIIllII[11] = 0x55 ^ 0xB ^ (0x64 ^ 3);
        e.lllIIIIllII[12] = "   ".length();
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
        void llllllllllllllllIIlIlIIIIIlIIIll;
        int[] nArray = this.p.getMapRegions();
        int n2 = nArray.length;
        int llllllllllllllllIIlIlIIIIIlIIIlI = lllIIIIllII[1];
        while (e.lIlIllIlIlIlII(llllllllllllllllIIlIlIIIIIlIIIlI, (int)llllllllllllllllIIlIlIIIIIlIIIll)) {
            void llllllllllllllllIIlIlIIIIIlIIlII;
            void llllllllllllllllIIlIlIIIIIlIIIIl = llllllllllllllllIIlIlIIIIIlIIlII[llllllllllllllllIIlIlIIIIIlIIIlI];
            if (e.lIlIllIlIlIIIl((int)llllllllllllllllIIlIlIIIIIlIIIIl, d.i())) {
                return lllIIIIllII[2];
            }
            ++llllllllllllllllIIlIlIIIIIlIIIlI;
            "".length();
            if (null == null) continue;
            return ((0xA0 ^ 0x9C) & ~(0x54 ^ 0x68)) != 0;
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
        e.lllIIIIlIll[e.lllIIIIllII[1]] = e.lIlIllIlIIlIlI("Mtoy6v6n4RY82fQTnIi3Gt4RMl+gow7N", "ZJuwa");
        e.lllIIIIlIll[e.lllIIIIllII[2]] = e.lIlIllIlIIlIlI("wMV4o5Lsw7MzhaDSNYZuZePy2SuQgn4q", "ahNqy");
        e.lllIIIIlIll[e.lllIIIIllII[3]] = e.lIlIllIlIIlIlI("COnl5tQE6OT4mb4ssbmyKj5iHgJtzPr6", "NdjXH");
    }

    public boolean w() {
        boolean bl;
        if (e.lIlIllIlIIllll(NPCs.getNearest(nPC -> {
            boolean bl;
            if (e.lIlIllIlIIllll((Object)b.a(nPC))) {
                bl = lllIIIIllII[2];
                "".length();
                if ("   ".length() <= 0) {
                    return ((11 + 98 - 96 + 137 ^ 105 + 97 - 47 + 2) & (0xCB ^ 0xB0 ^ (0x66 ^ 0x16) ^ -" ".length())) != 0;
                }
            } else {
                bl = lllIIIIllII[1];
            }
            return bl;
        }))) {
            bl = lllIIIIllII[2];
            "".length();
            if (" ".length() == (7 ^ 3)) {
                return ((0xC8 ^ 0x96) & ~(0xC9 ^ 0x97)) != 0;
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
        e llllllllllllllllIIlIlIIIIIlllIlI;
        if (e.lIlIllIlIIllIl(npcDespawned.getNpc().getName().equals(lllIIIIlIll[lllIIIIllII[2]]) ? 1 : 0)) {
            return;
        }
        if (e.lIlIllIlIIlllI(llllllllllllllllIIlIlIIIIIlllIlI.t() ? 1 : 0)) {
            llllllllllllllllIIlIlIIIIIlllIlI.s += lllIIIIllII[2];
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
        void llllllllllllllllIIlIlIIIIIlIlIll;
        RegionPoint regionPoint = RegionPoint.fromWorld((WorldPoint)worldPoint);
        if (e.lIlIllIlIIllIl(this.u() ? 1 : 0)) {
            return lllIIIIllII[1];
        }
        if (e.lIlIllIlIlIIlI(llllllllllllllllIIlIlIIIIIlIlIll.getX(), o.getMinX()) && e.lIlIllIlIlIIll(llllllllllllllllIIlIlIIIIIlIlIll.getX(), o.getMaxX()) && e.lIlIllIlIlIIlI(llllllllllllllllIIlIlIIIIIlIlIll.getY(), o.getMinY()) && e.lIlIllIlIlIIll(llllllllllllllllIIlIlIIIIIlIlIll.getY(), o.getMaxY())) {
            n2 = lllIIIIllII[2];
            "".length();
            if ((0x8C ^ 0x88) <= -" ".length()) {
                return ((0x19 ^ 0x24) & ~(0x74 ^ 0x49)) != 0;
            }
        } else {
            n2 = lllIIIIllII[1];
        }
        return n2 != 0;
    }

    private static String lIlIllIlIIlIlI(String llllllllllllllllIIlIlIIIIIIlIlIl, String llllllllllllllllIIlIlIIIIIIlIIlI) {
        try {
            SecretKeySpec llllllllllllllllIIlIlIIIIIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIlIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), lllIIIIllII[13]), "DES");
            Cipher llllllllllllllllIIlIlIIIIIIlIlll = Cipher.getInstance("DES");
            llllllllllllllllIIlIlIIIIIIlIlll.init(lllIIIIllII[3], llllllllllllllllIIlIlIIIIIIllIII);
            return new String(llllllllllllllllIIlIlIIIIIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIlIIIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIlIIIIIIlIllI) {
            llllllllllllllllIIlIlIIIIIIlIllI.printStackTrace();
            return null;
        }
    }

    public boolean v() {
        boolean bl;
        if (e.lIlIllIlIIllll(NPCs.getNearest(nPC -> {
            int n2;
            if (e.lIlIllIlIIllIl(nPC.isDead() ? 1 : 0) && e.lIlIllIlIIllll((Object)b.a(nPC))) {
                n2 = lllIIIIllII[2];
                "".length();
                if (-" ".length() > " ".length()) {
                    return ((0x35 ^ 0x15) & ~(0x8F ^ 0xAF)) != 0;
                }
            } else {
                n2 = lllIIIIllII[1];
            }
            return n2 != 0;
        }))) {
            bl = lllIIIIllII[2];
            "".length();
            if (" ".length() > "   ".length()) {
                return ((0xC9 ^ 0x9C) & ~(0xA ^ 0x5F)) != 0;
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
            "".length();
            if (((0xC3 ^ 0xBD ^ (0x41 ^ 0x33)) & (0x91 ^ 0xB0 ^ (0xEE ^ 0xC3) ^ -" ".length())) != 0) {
                return ((0x2E ^ 0x23 ^ (0xBD ^ 0xA2)) & (0xF3 ^ 0x94 ^ (0x18 ^ 0x6D) ^ -" ".length())) != 0;
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
        NPC llllllllllllllllIIlIlIIIIIllIlIl = NPCs.getNearest((String[])stringArray);
        if (e.lIlIllIlIlIIII(llllllllllllllllIIlIlIIIIIllIlIl)) {
            return;
        }
        this.r = new a((NPC)var2_2);
    }
}

