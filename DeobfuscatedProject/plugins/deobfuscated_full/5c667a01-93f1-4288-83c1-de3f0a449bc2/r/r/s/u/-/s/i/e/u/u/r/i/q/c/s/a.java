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
        a var13;
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllIl(this.c() ? 1 : 0)) {
            return lIIlIlIllIlll[0];
        }
        var13.e = Players.getLocal();
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIlllI(var13.e)) {
            return lIIlIlIllIlll[0];
        }
        String[] stringArray = new String[lIIlIlIllIlll[1]];
        stringArray[r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[0]] = lIIlIlIllIllI[lIIlIlIllIlll[0]];
        var13.f = NPCs.getNearest((String[])stringArray);
        if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIlllI(var13.f)) {
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

    private static String lIlIllIIIlIlIIl(String var3, String var12) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIIlIlIllIlll[5]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(lIIlIlIllIlll[2], var7);
            return new String(var4.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
            return null;
        }
    }

    private static String lIlIllIIIlIlIlI(String var6, String var18) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var14 = new StringBuilder();
        char[] var5 = var18.toCharArray();
        int var16 = lIIlIlIllIlll[0];
        char[] var20 = var6.toCharArray();
        int var8 = var20.length;
        int var10 = lIIlIlIllIlll[0];
        while (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIllIIlI(var10, var8)) {
            char var2 = var20[var10];
            var14.append((char)(var2 ^ var5[var16 % var5.length]));
            0;
            ++var16;
            ++var10;
            0;
            if ((158 + 42 - 59 + 33 ^ 54 + 25 - -20 + 72) > 0) continue;
            return null;
        }
        return String.valueOf(var14);
    }

    private static boolean lIlIllIIIlIlllI(Object object) {
        return object == null;
    }

    private static void lIlIllIIIlIlIll() {
        lIIlIlIllIllI = new String[lIIlIlIllIlll[2]];
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIllI[r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[0]] = r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a."Scurrius";
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIllI[r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[1]] = r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a."Scurrius";
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
        Iterator var19 = this.d.getGraphicsObjects().iterator();
        while (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll(var19.hasNext() ? 1 : 0)) {
            void var9;
            a var1;
            WorldPoint var17;
            GraphicsObject var11 = (GraphicsObject)var19.next();
            if (r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIllIIIl(var11.getId(), r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.d.B) && r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIlIllIIIlIllll((var17 = WorldPoint.fromLocal((Client)var1.d, (LocalPoint)var11.getLocation())).equals((Object)var9) ? 1 : 0)) {
                return lIIlIlIllIlll[1];
            }
            0;
            if ((0xB4 ^ 0xB0) > 0) continue;
            return false;
        }
        return lIIlIlIllIlll[0];
    }

    private static void lIlIllIIIlIllII() {
        lIIlIlIllIlll = new int[6];
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[0] = 1 & ~1;
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[1] = 1;
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[2] = 2;
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[3] = 9 ^ 0x4C ^ (0x61 ^ 0x21);
        r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a.lIIlIlIllIlll[4] = 3;
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
                    0;
                    if (-1 > 0) {
                        return false;
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
                0;
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

