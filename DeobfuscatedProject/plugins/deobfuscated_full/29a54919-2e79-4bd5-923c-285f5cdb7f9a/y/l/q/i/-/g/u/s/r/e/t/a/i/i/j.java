/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.client.Static
 */
package y.l.q.i.-.g.u.s.r.e.t.a.i.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.client.Static;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.b;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.c;

/* TASK: Traversing obstacles -> TraversingobstaclesTask */
@TaskDesc(name="Traversing obstacles")
public class j
extends Task {
    private static final /* synthetic */ WorldPoint z;
    private final /* synthetic */ AgilityConfig B;
    private static /* synthetic */ String[] lIllIIIlIIl;
    private final /* synthetic */ SquireAgilityPlugin A;
    private static /* synthetic */ int[] lIllIIIlIll;

    private static void lIIlIlIlIlIlIl() {
        lIllIIIlIll = new int[16];
        j.lIllIIIlIll[0] = (0x25 ^ 0xE) & ~(0xBD ^ 0x96);
        j.lIllIIIlIll[1] = 0x5C ^ 0x56;
        j.lIllIIIlIll[2] = -1;
        j.lIllIIIlIll[3] = -(0xFFFFABF1 & 0x753F) & (0xFFFFFFF9 & 0x23FF);
        j.lIllIIIlIll[4] = 2;
        j.lIllIIIlIll[5] = 1;
        j.lIllIIIlIll[6] = -(0xFFFFFFAB & 0x7156) & (0xFFFFFBFD & 0x7F63);
        j.lIllIIIlIll[7] = -(0xFFFFBF4F & 0x72B2) & (0xFFFFBFE7 & 0x7EF9);
        j.lIllIIIlIll[8] = 3;
        j.lIllIIIlIll[9] = -(0xFFFFF7BF & 0x7A71) & (0xFFFFFEFB & 0x7FFC);
        j.lIllIIIlIll[10] = -(0xFFFFDCFF & 0x2B02) & (0xFFFFDFFF & 0x3FFF);
        j.lIllIIIlIll[11] = 89 + 98 - 123 + 78 ^ 57 + 18 - 26 + 86;
        j.lIllIIIlIll[12] = 0xFFFFAA5F & 0x5FFE;
        j.lIllIIIlIll[13] = -(0xFFFFBAED & 0x771B) & (0xFFFFFEEB & 0x3FFF);
        j.lIllIIIlIll[14] = 0x75 ^ 0x71;
        j.lIllIIIlIll[15] = 0xA2 ^ 0xAA;
    }

    static {
        j.lIIlIlIlIlIlIl();
        j.lIIlIlIlIlIIll();
        z = new WorldPoint(lIllIIIlIll[12], lIllIIIlIll[13], lIllIIIlIll[8]);
    }

    private static boolean lIIlIlIlIllllI(int n, int n2) {
        return n >= n2;
    }

    private static boolean lIIlIlIlIlIlll(int n) {
        return n == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        void var6_6;
        b var13;
        b b2;
        j var10;
        void var18;
        Player player = Players.getLocal();
        if (j.lIIlIlIlIlIllI(player)) {
            return lIllIIIlIll[0];
        }
        if (j.lIIlIlIlIlIlll(Movement.isRunEnabled() ? 1 : 0) && j.lIIlIlIlIllIII(Movement.getRunEnergy(), lIllIIIlIll[1])) {
            Movement.toggleRun();
        }
        if (j.lIIlIlIlIllIIl(var18.getAnimation(), lIllIIIlIll[2]) && j.lIIlIlIlIllIIl(var18.getAnimation(), lIllIIIlIll[3])) {
            return lIllIIIlIll[0];
        }
        WorldPoint var8 = var18.getWorldLocation();
        b var15 = var10.A.a();
        if (j.lIIlIlIlIlIllI((Object)var15)) {
            if (j.lIIlIlIlIlIlll(var8.getPlane())) {
                b b3;
                SquireAgilityPlugin squireAgilityPlugin = var10.A;
                if (j.lIIlIlIlIllIlI(var10.B.progressive() ? 1 : 0)) {
                    b3 = b.j();
                    0;
                    if (1 > (40 + 1 - -108 + 3 ^ 16 + 83 - 61 + 118)) {
                        return ((0x55 ^ 0x65 ^ (0xB2 ^ 0xA0)) & (134 + 140 - 231 + 118 ^ 3 + 77 - 63 + 114 ^ -1)) != 0;
                    }
                } else {
                    b3 = var10.B.course();
                }
                squireAgilityPlugin.a(b3);
                0;
                if (((0x94 ^ 0x88) & ~(0x69 ^ 0x75)) >= 1) {
                    return false;
                }
            } else {
                var10.A.a(b.b(var8.getRegionID()));
            }
        }
        if (j.lIIlIlIlIllIlI(var10.B.progressive() ? 1 : 0)) {
            b2 = b.j();
            0;
            if (-1 >= 3) {
                return false;
            }
        } else {
            b2 = var10.B.course();
        }
        if (j.lIIlIlIlIllIll((Object)(var13 = b2), (Object)var15) && j.lIIlIlIlIlIlll(var18.getPlane())) {
            Object[] objectArray = new Object[lIllIIIlIll[4]];
            objectArray[j.lIllIIIlIll[0]] = var15;
            objectArray[j.lIllIIIlIll[5]] = var13;
            Log.info((String)lIllIIIlIIl[lIllIIIlIll[0]], (Object[])objectArray);
            var10.A.a(var13);
            return lIllIIIlIll[5];
        }
        if (j.lIIlIlIlIlIllI((Object)var15)) {
            Object[] objectArray = new Object[lIllIIIlIll[5]];
            objectArray[j.lIllIIIlIll[0]] = var8.getRegionID();
            Log.info((String)lIllIIIlIIl[lIllIIIlIll[5]], (Object[])objectArray);
            return lIllIIIlIll[0];
        }
        c var27 = var15.k();
        if (j.lIIlIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)z) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIlIll[6], lIllIIIlIll[7], lIllIIIlIll[8]));
            0;
            var10.sleep(lIllIIIlIll[8]);
            return lIllIIIlIll[0];
        }
        if (j.lIIlIlIlIllIlI(Reachable.isWalkable((WorldPoint)new WorldPoint(lIllIIIlIll[9], lIllIIIlIll[10], lIllIIIlIll[0])) ? 1 : 0) && j.lIIlIlIlIlIlll(Static.getClient().getTopLevelWorldView().getPlane())) {
            String[] stringArray = new String[lIllIIIlIll[5]];
            stringArray[j.lIllIIIlIll[0]] = lIllIIIlIIl[lIllIIIlIll[4]];
            TileObjects.getNearest((String[])stringArray).interact(string -> lIllIIIlIll[5]);
            return lIllIIIlIll[5];
        }
        if (j.lIIlIlIlIlIllI(var27)) {
            if (j.lIIlIlIlIlllII(var8.getPlane(), lIllIIIlIll[8])) {
                return lIllIIIlIll[0];
            }
            Object[] objectArray = new Object[lIllIIIlIll[5]];
            objectArray[j.lIllIIIlIll[0]] = var15;
            Log.info((String)lIllIIIlIIl[lIllIIIlIll[8]], (Object[])objectArray);
            return lIllIIIlIll[5];
        }
        TileObject var9 = var27.r();
        if (!j.lIIlIlIlIlllIl(var9) || j.lIIlIlIlIllllI(var9.distanceTo((Locatable)Players.getLocal()), lIllIIIlIll[11])) {
            boolean bl;
            if (j.lIIlIlIlIlllII(var8.getPlane(), lIllIIIlIll[8])) {
                Movement.setDestination((WorldPoint)var27.getWorldLocation());
                return lIllIIIlIll[5];
            }
            if (j.lIIlIlIlIlIllI(var9)) {
                bl = lIllIIIlIll[5];
                0;
                if (1 >= 2) {
                    return false;
                }
            } else {
                bl = lIllIIIlIll[0];
            }
            boolean var5 = bl;
            Movement.walkTo((WorldPoint)var27.getWorldLocation(), (boolean)var5);
            0;
            return lIllIIIlIll[5];
        }
        var6_6.interact(var5_5.n());
        return lIllIIIlIll[5];
    }

    private static void lIIlIlIlIlIIll() {
        lIllIIIlIIl = new String[lIllIIIlIll[14]];
        j.lIllIIIlIIl[j.lIllIIIlIll[0]] = j."Switching course from {} to {}";
        j.lIllIIIlIIl[j.lIllIIIlIll[5]] = j."No course found for region: {}, and we can't set any other course.";
        j.lIllIIIlIIl[j.lIllIIIlIll[4]] = j."Ladder";
        j.lIllIIIlIIl[j.lIllIIIlIll[8]] = j."No obstacle found on course: {}";
    }

    private static boolean lIIlIlIlIlIllI(Object object) {
        return object == null;
    }

    @Inject
    public j(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.A = squireAgilityPlugin;
        this.B = agilityConfig;
    }

    private static String lIIlIlIlIlIIlI(String var3, String var19) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var26 = var19.toCharArray();
        int var17 = lIllIIIlIll[0];
        char[] var22 = var3.toCharArray();
        int var4 = var22.length;
        int var16 = lIllIIIlIll[0];
        while (j.lIIlIlIlIlllll(var16, var4)) {
            char var11 = var22[var16];
            var24.append((char)(var11 ^ var26[var17 % var26.length]));
            0;
            ++var17;
            ++var16;
            0;
            if (((0x36 ^ 0x14 ^ (0x49 ^ 0x20)) & (53 + 217 - 39 + 5 ^ 99 + 4 - 58 + 122 ^ -1)) >= ((50 + 86 - 117 + 138 ^ 13 + 148 - 61 + 83) & (134 + 34 - 107 + 86 ^ 143 + 65 - 48 + 25 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var24);
    }

    private static String lIIlIlIlIIllIl(String var1, String var7) {
        try {
            SecretKeySpec var25 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIllIIIlIll[4], var25);
            return new String(var6.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIllIll(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIIlIlIlIllIlI(int n) {
        return n != 0;
    }

    private static boolean lIIlIlIlIlllIl(Object object) {
        return object != null;
    }

    private static boolean lIIlIlIlIlllll(int n, int n2) {
        return n < n2;
    }

    private static boolean lIIlIlIlIllIIl(int n, int n2) {
        return n != n2;
    }

    private static String lIIlIlIlIlIIIl(String var14, String var12) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), lIllIIIlIll[15]), "DES");
            Cipher var20 = Cipher.getInstance("DES");
            var20.init(lIllIIIlIll[4], var21);
            return new String(var20.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIlIlllII(int n, int n2) {
        return n == n2;
    }

    private static boolean lIIlIlIlIllIII(int n, int n2) {
        return n > n2;
    }
}

