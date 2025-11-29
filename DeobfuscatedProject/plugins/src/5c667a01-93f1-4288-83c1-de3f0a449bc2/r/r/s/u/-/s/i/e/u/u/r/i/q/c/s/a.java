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
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

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
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d;

public abstract class a
extends Task {
    private static /* synthetic */ String[] lIIlIlIllIllI;
    protected final /* synthetic */ Client d;
    protected final /* synthetic */ SquireScurriusConfig b;
    protected final /* synthetic */ SquireScurrius a;
    protected /* synthetic */ Player e;
    protected final /* synthetic */ b c;
    private static /* synthetic */ int[] lIIlIlIllIlll;
    protected /* synthetic */ boolean g;
    protected /* synthetic */ NPC f;

    @Inject
    protected a(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
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
        a llllllllllllllIllllIllIlIlIIllll;
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllIl(this.c() ? 1 : 0)) {
            return lIIlIlIllIlll[0];
        }
        llllllllllllllIllllIllIlIlIIllll.e = Players.getLocal();
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIlllI(llllllllllllllIllllIllIlIlIIllll.e)) {
            return lIIlIlIllIlll[0];
        }
        String[] stringArray = new String[lIIlIlIllIlll[1]];
        stringArray[r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[0]] = lIIlIlIllIllI[lIIlIlIllIlll[0]];
        llllllllllllllIllllIllIlIlIIllll.f = NPCs.getNearest((String[])stringArray);
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIlllI(llllllllllllllIllllIllIlIlIIllll.f)) {
            return lIIlIlIllIlll[0];
        }
        return this.a();
    }

    private static boolean lIlIllIIIllIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIllIIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlIllIIIlIlIIl(String llllllllllllllIllllIllIlIIIIllll, String llllllllllllllIllllIllIlIIIIlllI) {
        try {
            SecretKeySpec llllllllllllllIllllIllIlIIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIlIIIIlllI.getBytes(StandardCharsets.UTF_8)), lIIlIlIllIlll[5]), "DES");
            Cipher llllllllllllllIllllIllIlIIIlIIIl = Cipher.getInstance("DES");
            llllllllllllllIllllIllIlIIIlIIIl.init(lIIlIlIllIlll[2], llllllllllllllIllllIllIlIIIlIIlI);
            return new String(llllllllllllllIllllIllIlIIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIlIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIllIlIIIlIIII) {
            llllllllllllllIllllIllIlIIIlIIII.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIIlIlIlI(String llllllllllllllIllllIllIlIIlIIlII, String llllllllllllllIllllIllIlIIlIIIll) {
        llllllllllllllIllllIllIlIIlIIlII = new String(Base64.getDecoder().decode(llllllllllllllIllllIllIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIllIlIIlIIIlI = new StringBuilder();
        char[] llllllllllllllIllllIllIlIIlIIIIl = llllllllllllllIllllIllIlIIlIIIll.toCharArray();
        int llllllllllllllIllllIllIlIIlIIIII = lIIlIlIllIlll[0];
        char[] llllllllllllllIllllIllIlIIIllIlI = llllllllllllllIllllIllIlIIlIIlII.toCharArray();
        int llllllllllllllIllllIllIlIIIllIIl = llllllllllllllIllllIllIlIIIllIlI.length;
        int llllllllllllllIllllIllIlIIIllIII = lIIlIlIllIlll[0];
        while (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIllIIlI(llllllllllllllIllllIllIlIIIllIII, llllllllllllllIllllIllIlIIIllIIl)) {
            char llllllllllllllIllllIllIlIIlIIlIl = llllllllllllllIllllIllIlIIIllIlI[llllllllllllllIllllIllIlIIIllIII];
            llllllllllllllIllllIllIlIIlIIIlI.append((char)(llllllllllllllIllllIllIlIIlIIlIl ^ llllllllllllllIllllIllIlIIlIIIIl[llllllllllllllIllllIllIlIIlIIIII % llllllllllllllIllllIllIlIIlIIIIl.length]));
            "".length();
            ++llllllllllllllIllllIllIlIIlIIIII;
            ++llllllllllllllIllllIllIlIIIllIII;
            "".length();
            if ((158 + 42 - 59 + 33 ^ 54 + 25 - -20 + 72) > 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIllIlIIlIIIlI);
    }

    private static boolean lIlIllIIIlIlllI(Object object) {
        return object == null;
    }

    private static void lIlIllIIIlIlIll() {
        lIIlIlIllIllI = new String[lIIlIlIllIlll[2]];
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIllI[r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[0]] = r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIlIIl("8l5H9gDCqXP5wV6KN4dfqg==", "BwxmT");
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIllI[r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[1]] = r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIlIlI("GiY/EDMgMDk=", "IEJbA");
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

    public abstract boolean a();

    /*
     * WARNING - void declaration
     */
    protected boolean a(WorldPoint worldPoint) {
        Iterator llllllllllllllIllllIllIlIIlllIll = this.d.getGraphicsObjects().iterator();
        while (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll(llllllllllllllIllllIllIlIIlllIll.hasNext() ? 1 : 0)) {
            void llllllllllllllIllllIllIlIIllllII;
            a llllllllllllllIllllIllIlIIllllIl;
            WorldPoint llllllllllllllIllllIllIlIIlllIIl;
            GraphicsObject llllllllllllllIllllIllIlIIlllIlI = (GraphicsObject)llllllllllllllIllllIllIlIIlllIll.next();
            if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIllIIIl(llllllllllllllIllllIllIlIIlllIlI.getId(), r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.B) && r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll((llllllllllllllIllllIllIlIIlllIIl = WorldPoint.fromLocal((Client)llllllllllllllIllllIllIlIIllllIl.d, (LocalPoint)llllllllllllllIllllIllIlIIlllIlI.getLocation())).equals((Object)llllllllllllllIllllIllIlIIllllII) ? 1 : 0)) {
                return lIIlIlIllIlll[1];
            }
            "".length();
            if ((0xB4 ^ 0xB0) > 0) continue;
            return ((0x15 ^ 0x47) & ~(0x6D ^ 0x3F)) != 0;
        }
        return lIIlIlIllIlll[0];
    }

    private static void lIlIllIIIlIllII() {
        lIIlIlIllIlll = new int[6];
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[0] = " ".length() & ~" ".length();
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[1] = " ".length();
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[2] = "  ".length();
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[3] = 9 ^ 0x4C ^ (0x61 ^ 0x21);
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[4] = "   ".length();
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[5] = 0x6A ^ 0x62;
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

    protected WorldPoint a(boolean bl) {
        String[] stringArray = new String[lIIlIlIllIlll[1]];
        stringArray[r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[0]] = lIIlIlIllIllI[lIIlIlIllIlll[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll(bl ? 1 : 0) && r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIllIIII(nPC)) {
            WorldArea worldArea = nPC.getWorldArea().offset(lIIlIlIllIlll[1]);
            return worldArea.toWorldPointList().stream().filter(worldPoint -> {
                int n2;
                if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllIl(this.a((WorldPoint)worldPoint) ? 1 : 0) && r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll(Reachable.isWalkable((WorldPoint)worldPoint) ? 1 : 0) && r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll(nPC.getWorldArea().isInMeleeDistance(worldPoint) ? 1 : 0)) {
                    n2 = lIIlIlIllIlll[1];
                    "".length();
                    if (-" ".length() > 0) {
                        return ((0xAC ^ 0x81) & ~(0x30 ^ 0x1D)) != 0;
                    }
                } else {
                    n2 = lIIlIlIllIlll[0];
                }
                return n2 != 0;
            }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)this.e))).orElse(null);
        }
        WorldArea worldArea = this.e.getWorldArea().offset(lIIlIlIllIlll[4]);
        return worldArea.toWorldPointList().stream().filter(worldPoint -> {
            boolean bl;
            if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllIl(this.a((WorldPoint)worldPoint) ? 1 : 0)) {
                bl = lIIlIlIllIlll[1];
                "".length();
                if ("   ".length() > (0x35 ^ 0x7A ^ (0xFE ^ 0xB5))) {
                    return ((0xE1 ^ 0xBA ^ (0xE0 ^ 0x87)) & (0xA4 ^ 0x8B ^ (1 ^ 0x12) ^ -" ".length())) != 0;
                }
            } else {
                bl = lIIlIlIllIlll[0];
            }
            return bl;
        }).min(Comparator.comparingInt(worldPoint -> worldPoint.distanceTo((Locatable)this.e))).orElse(null);
    }
}

