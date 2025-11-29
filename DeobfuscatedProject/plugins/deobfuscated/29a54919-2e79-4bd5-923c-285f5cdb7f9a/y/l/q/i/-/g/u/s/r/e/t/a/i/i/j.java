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
        b llllllllllllllllIlIlIlIIllIlIIII;
        b b2;
        j llllllllllllllllIlIlIlIIllIlIlII;
        void llllllllllllllllIlIlIlIIllIlIIll;
        Player player = Players.getLocal();
        if (j.lIIlIlIlIlIllI(player)) {
            return lIllIIIlIll[0];
        }
        if (j.lIIlIlIlIlIlll(Movement.isRunEnabled() ? 1 : 0) && j.lIIlIlIlIllIII(Movement.getRunEnergy(), lIllIIIlIll[1])) {
            Movement.toggleRun();
        }
        if (j.lIIlIlIlIllIIl(llllllllllllllllIlIlIlIIllIlIIll.getAnimation(), lIllIIIlIll[2]) && j.lIIlIlIlIllIIl(llllllllllllllllIlIlIlIIllIlIIll.getAnimation(), lIllIIIlIll[3])) {
            return lIllIIIlIll[0];
        }
        WorldPoint llllllllllllllllIlIlIlIIllIlIIlI = llllllllllllllllIlIlIlIIllIlIIll.getWorldLocation();
        b llllllllllllllllIlIlIlIIllIlIIIl = llllllllllllllllIlIlIlIIllIlIlII.A.a();
        if (j.lIIlIlIlIlIllI((Object)llllllllllllllllIlIlIlIIllIlIIIl)) {
            if (j.lIIlIlIlIlIlll(llllllllllllllllIlIlIlIIllIlIIlI.getPlane())) {
                b b3;
                SquireAgilityPlugin squireAgilityPlugin = llllllllllllllllIlIlIlIIllIlIlII.A;
                if (j.lIIlIlIlIllIlI(llllllllllllllllIlIlIlIIllIlIlII.B.progressive() ? 1 : 0)) {
                    b3 = b.j();
                    0;
                    if (1 > (40 + 1 - -108 + 3 ^ 16 + 83 - 61 + 118)) {
                        return ((0x55 ^ 0x65 ^ (0xB2 ^ 0xA0)) & (134 + 140 - 231 + 118 ^ 3 + 77 - 63 + 114 ^ -1)) != 0;
                    }
                } else {
                    b3 = llllllllllllllllIlIlIlIIllIlIlII.B.course();
                }
                squireAgilityPlugin.a(b3);
                0;
                if (((0x94 ^ 0x88) & ~(0x69 ^ 0x75)) >= 1) {
                    return ((0x1B ^ 0x59) & ~(0x1F ^ 0x5D)) != 0;
                }
            } else {
                llllllllllllllllIlIlIlIIllIlIlII.A.a(b.b(llllllllllllllllIlIlIlIIllIlIIlI.getRegionID()));
            }
        }
        if (j.lIIlIlIlIllIlI(llllllllllllllllIlIlIlIIllIlIlII.B.progressive() ? 1 : 0)) {
            b2 = b.j();
            0;
            if (-1 >= 3) {
                return ((0x57 ^ 0x5F) & ~(0xBD ^ 0xB5)) != 0;
            }
        } else {
            b2 = llllllllllllllllIlIlIlIIllIlIlII.B.course();
        }
        if (j.lIIlIlIlIllIll((Object)(llllllllllllllllIlIlIlIIllIlIIII = b2), (Object)llllllllllllllllIlIlIlIIllIlIIIl) && j.lIIlIlIlIlIlll(llllllllllllllllIlIlIlIIllIlIIll.getPlane())) {
            Object[] objectArray = new Object[lIllIIIlIll[4]];
            objectArray[j.lIllIIIlIll[0]] = llllllllllllllllIlIlIlIIllIlIIIl;
            objectArray[j.lIllIIIlIll[5]] = llllllllllllllllIlIlIlIIllIlIIII;
            Log.info((String)lIllIIIlIIl[lIllIIIlIll[0]], (Object[])objectArray);
            llllllllllllllllIlIlIlIIllIlIlII.A.a(llllllllllllllllIlIlIlIIllIlIIII);
            return lIllIIIlIll[5];
        }
        if (j.lIIlIlIlIlIllI((Object)llllllllllllllllIlIlIlIIllIlIIIl)) {
            Object[] objectArray = new Object[lIllIIIlIll[5]];
            objectArray[j.lIllIIIlIll[0]] = llllllllllllllllIlIlIlIIllIlIIlI.getRegionID();
            Log.info((String)lIllIIIlIIl[lIllIIIlIll[5]], (Object[])objectArray);
            return lIllIIIlIll[0];
        }
        c llllllllllllllllIlIlIlIIllIIllll = llllllllllllllllIlIlIlIIllIlIIIl.k();
        if (j.lIIlIlIlIllIlI(Players.getLocal().getWorldLocation().equals((Object)z) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)new WorldPoint(lIllIIIlIll[6], lIllIIIlIll[7], lIllIIIlIll[8]));
            0;
            llllllllllllllllIlIlIlIIllIlIlII.sleep(lIllIIIlIll[8]);
            return lIllIIIlIll[0];
        }
        if (j.lIIlIlIlIllIlI(Reachable.isWalkable((WorldPoint)new WorldPoint(lIllIIIlIll[9], lIllIIIlIll[10], lIllIIIlIll[0])) ? 1 : 0) && j.lIIlIlIlIlIlll(Static.getClient().getTopLevelWorldView().getPlane())) {
            String[] stringArray = new String[lIllIIIlIll[5]];
            stringArray[j.lIllIIIlIll[0]] = lIllIIIlIIl[lIllIIIlIll[4]];
            TileObjects.getNearest((String[])stringArray).interact(string -> lIllIIIlIll[5]);
            return lIllIIIlIll[5];
        }
        if (j.lIIlIlIlIlIllI(llllllllllllllllIlIlIlIIllIIllll)) {
            if (j.lIIlIlIlIlllII(llllllllllllllllIlIlIlIIllIlIIlI.getPlane(), lIllIIIlIll[8])) {
                return lIllIIIlIll[0];
            }
            Object[] objectArray = new Object[lIllIIIlIll[5]];
            objectArray[j.lIllIIIlIll[0]] = llllllllllllllllIlIlIlIIllIlIIIl;
            Log.info((String)lIllIIIlIIl[lIllIIIlIll[8]], (Object[])objectArray);
            return lIllIIIlIll[5];
        }
        TileObject llllllllllllllllIlIlIlIIllIIlllI = llllllllllllllllIlIlIlIIllIIllll.r();
        if (!j.lIIlIlIlIlllIl(llllllllllllllllIlIlIlIIllIIlllI) || j.lIIlIlIlIllllI(llllllllllllllllIlIlIlIIllIIlllI.distanceTo((Locatable)Players.getLocal()), lIllIIIlIll[11])) {
            boolean bl;
            if (j.lIIlIlIlIlllII(llllllllllllllllIlIlIlIIllIlIIlI.getPlane(), lIllIIIlIll[8])) {
                Movement.setDestination((WorldPoint)llllllllllllllllIlIlIlIIllIIllll.getWorldLocation());
                return lIllIIIlIll[5];
            }
            if (j.lIIlIlIlIlIllI(llllllllllllllllIlIlIlIIllIIlllI)) {
                bl = lIllIIIlIll[5];
                0;
                if (1 >= 2) {
                    return ((0x46 ^ 0x72) & ~(0xD ^ 0x39)) != 0;
                }
            } else {
                bl = lIllIIIlIll[0];
            }
            boolean llllllllllllllllIlIlIlIIllIIllIl = bl;
            Movement.walkTo((WorldPoint)llllllllllllllllIlIlIlIIllIIllll.getWorldLocation(), (boolean)llllllllllllllllIlIlIlIIllIIllIl);
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

    private static String lIIlIlIlIlIIlI(String llllllllllllllllIlIlIlIIlIllIlIl, String llllllllllllllllIlIlIlIIlIlIllll) {
        llllllllllllllllIlIlIlIIlIllIlIl = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIlIIlIllIIll = new StringBuilder();
        char[] llllllllllllllllIlIlIlIIlIllIIlI = llllllllllllllllIlIlIlIIlIlIllll.toCharArray();
        int llllllllllllllllIlIlIlIIlIllIIIl = lIllIIIlIll[0];
        char[] llllllllllllllllIlIlIlIIlIlIlIll = llllllllllllllllIlIlIlIIlIllIlIl.toCharArray();
        int llllllllllllllllIlIlIlIIlIlIlIlI = llllllllllllllllIlIlIlIIlIlIlIll.length;
        int llllllllllllllllIlIlIlIIlIlIlIIl = lIllIIIlIll[0];
        while (j.lIIlIlIlIlllll(llllllllllllllllIlIlIlIIlIlIlIIl, llllllllllllllllIlIlIlIIlIlIlIlI)) {
            char llllllllllllllllIlIlIlIIlIllIllI = llllllllllllllllIlIlIlIIlIlIlIll[llllllllllllllllIlIlIlIIlIlIlIIl];
            llllllllllllllllIlIlIlIIlIllIIll.append((char)(llllllllllllllllIlIlIlIIlIllIllI ^ llllllllllllllllIlIlIlIIlIllIIlI[llllllllllllllllIlIlIlIIlIllIIIl % llllllllllllllllIlIlIlIIlIllIIlI.length]));
            0;
            ++llllllllllllllllIlIlIlIIlIllIIIl;
            ++llllllllllllllllIlIlIlIIlIlIlIIl;
            0;
            if (((0x36 ^ 0x14 ^ (0x49 ^ 0x20)) & (53 + 217 - 39 + 5 ^ 99 + 4 - 58 + 122 ^ -1)) >= ((50 + 86 - 117 + 138 ^ 13 + 148 - 61 + 83) & (134 + 34 - 107 + 86 ^ 143 + 65 - 48 + 25 ^ -1))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIlIlIIlIllIIll);
    }

    private static String lIIlIlIlIIllIl(String llllllllllllllllIlIlIlIIllIIIIll, String llllllllllllllllIlIlIlIIllIIIlII) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIIllIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIIllIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIlIIllIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIlIIllIIIlll.init(lIllIIIlIll[4], llllllllllllllllIlIlIlIIllIIlIII);
            return new String(llllllllllllllllIlIlIlIIllIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIllIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIlIIllIIIllI) {
            llllllllllllllllIlIlIlIIllIIIllI.printStackTrace();
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

    private static String lIIlIlIlIlIIIl(String llllllllllllllllIlIlIlIIlIlIIIII, String llllllllllllllllIlIlIlIIlIIlllll) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIIlIIlllll.getBytes(StandardCharsets.UTF_8)), lIllIIIlIll[15]), "DES");
            Cipher llllllllllllllllIlIlIlIIlIlIIIlI = Cipher.getInstance("DES");
            llllllllllllllllIlIlIlIIlIlIIIlI.init(lIllIIIlIll[4], llllllllllllllllIlIlIlIIlIlIIIll);
            return new String(llllllllllllllllIlIlIlIIlIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIlIIlIlIIIIl) {
            llllllllllllllllIlIlIlIIlIlIIIIl.printStackTrace();
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

