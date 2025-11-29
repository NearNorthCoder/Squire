/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.SquireSaradomin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.o;

@TaskDesc(name="Walking to Godwars")
public class p
extends o {
    private final /* synthetic */ g S;
    private static /* synthetic */ String[] lIIlIIllllIII;
    private static final /* synthetic */ WorldPoint Q;
    private static /* synthetic */ int[] lIIlIIllllIIl;
    private static final /* synthetic */ int R;

    private static boolean lIlIlIlIlIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIlIlIlIlIllIll(Object object) {
        return object != null;
    }

    private static void lIlIlIlIlIlIlII() {
        lIIlIIllllIII = new String[lIIlIIllllIIl[2]];
        p.lIIlIIllllIII[p.lIIlIIllllIIl[0]] = p."Climb-down";
    }

    private static boolean lIlIlIlIlIllIII(int n2) {
        return n2 == 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        p llllllllllllllIlllllIIlIlIIlllIl;
        if (p.lIlIlIlIlIllIII(this.S() ? 1 : 0)) {
            return lIIlIIllllIIl[0];
        }
        if (p.lIlIlIlIlIllIIl(llllllllllllllIlllllIIlIlIIlllIl.O.a() ? 1 : 0)) {
            return lIIlIIllllIIl[0];
        }
        if (p.lIlIlIlIlIllIIl(llllllllllllllIlllllIIlIlIIlllIl.S.s() ? 1 : 0)) {
            return lIIlIIllllIIl[0];
        }
        if (p.lIlIlIlIlIllIIl(llllllllllllllIlllllIIlIlIIlllIl.P.isInInstancedRegion() ? 1 : 0)) {
            return lIIlIIllllIIl[0];
        }
        if (p.lIlIlIlIlIllIlI(llllllllllllllIlllllIIlIlIIlllIl.P.getPlane(), lIIlIIllllIIl[1])) {
            return lIIlIIllllIIl[0];
        }
        int[] nArray = new int[lIIlIIllllIIl[2]];
        nArray[p.lIIlIIllllIIl[0]] = lIIlIIllllIIl[3];
        TileObject llllllllllllllIlllllIIlIlIIlllII = TileObjects.getNearest((int[])nArray);
        if (!p.lIlIlIlIlIllIll(llllllllllllllIlllllIIlIlIIlllII) || p.lIlIlIlIlIllIII(Reachable.isInteractable((Locatable)llllllllllllllIlllllIIlIlIIlllII) ? 1 : 0)) {
            Movement.walkTo((WorldPoint)Q);
            0;
            return lIIlIIllllIIl[2];
        }
        var1_1.interact(lIIlIIllllIII[lIIlIIllllIIl[0]]);
        return lIIlIIllllIIl[2];
    }

    private static void lIlIlIlIlIlIlll() {
        lIIlIIllllIIl = new int[7];
        p.lIIlIIllllIIl[0] = (0x3A ^ 0x62) & ~(0xF0 ^ 0xA8);
        p.lIIlIIllllIIl[1] = 2;
        p.lIIlIIllllIIl[2] = 1;
        p.lIIlIIllllIIl[3] = 0xFFFFFFF7 & 0x673B;
        p.lIIlIIllllIIl[4] = 0xFFFF8BE7 & 0x7F7B;
        p.lIIlIIllllIIl[5] = 0xFFFFDFB2 & 0x2EEF;
        p.lIIlIIllllIIl[6] = 0x2F ^ 0x27;
    }

    private static boolean lIlIlIlIlIllIIl(int n2) {
        return n2 != 0;
    }

    private static String lIlIlIlIlIlIIll(String llllllllllllllIlllllIIlIlIIlIIlI, String llllllllllllllIlllllIIlIlIIlIIIl) {
        try {
            SecretKeySpec llllllllllllllIlllllIIlIlIIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIlIlIIlIIIl.getBytes(StandardCharsets.UTF_8)), lIIlIIllllIIl[6]), "DES");
            Cipher llllllllllllllIlllllIIlIlIIlIllI = Cipher.getInstance("DES");
            llllllllllllllIlllllIIlIlIIlIllI.init(lIIlIIllllIIl[1], llllllllllllllIlllllIIlIlIIlIlll);
            return new String(llllllllllllllIlllllIIlIlIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIlIlIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIlIlIIlIlIl) {
            llllllllllllllIlllllIIlIlIIlIlIl.printStackTrace();
            return null;
        }
    }

    static {
        p.lIlIlIlIlIlIlll();
        p.lIlIlIlIlIlIlII();
        R = lIIlIIllllIIl[3];
        Q = new WorldPoint(lIIlIIllllIIl[4], lIIlIIllllIIl[5], lIIlIIllllIIl[0]);
    }

    @Inject
    public p(SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin, g g2, Client client) {
        super(squireSaraConfig, squireSaradomin, client);
        this.S = g2;
    }
}

