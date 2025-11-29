/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 */
package h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

@TaskDesc(name="Mining Essence Blocks")
public class g
extends Task {
    private static /* synthetic */ String[] lIllIIllIlIlI;
    private static /* synthetic */ int[] lIllIIllIllII;
    private static final /* synthetic */ WorldArea C;
    private static final /* synthetic */ WorldPoint A;
    private static final /* synthetic */ WorldPoint B;
    private final /* synthetic */ a E;
    private final /* synthetic */ SquireZeahRunecrafter F;
    private static final /* synthetic */ WorldArea D;

    static {
        g.llIIIllIllIIIII();
        g.llIIIllIlIlllII();
        A = new WorldPoint(lIllIIllIllII[9], lIllIIllIllII[10], lIllIIllIllII[0]);
        B = new WorldPoint(lIllIIllIllII[9], lIllIIllIllII[11], lIllIIllIllII[0]);
        C = new WorldArea(lIllIIllIllII[12], lIllIIllIllII[13], lIllIIllIllII[14], lIllIIllIllII[15], lIllIIllIllII[0]);
        D = new WorldArea(lIllIIllIllII[16], lIllIIllIllII[17], lIllIIllIllII[18], lIllIIllIllII[15], lIllIIllIllII[0]);
    }

    public boolean run() {
        if (g.llIIIllIllIIIIl(this.v() ? 1 : 0)) {
            return lIllIIllIllII[0];
        }
        this.A();
        return lIllIIllIllII[1];
    }

    private TileObject B() {
        TileObject tileObject2;
        TileObject tileObject3 = TileObjects.getNearest(tileObject -> {
            int n;
            if (g.llIIIllIllIIIll(tileObject.getActualId(), lIllIIllIllII[7]) && g.llIIIllIllIIllI(tileObject.distanceTo(Players.getLocal().getWorldLocation()), lIllIIllIllII[8])) {
                n = lIllIIllIllII[1];
                "".length();
                if ((0x8E ^ 0x8A) == 0) {
                    return ((0x3C ^ 0x13) & ~(0xBA ^ 0x95)) != 0;
                }
            } else {
                n = lIllIIllIllII[0];
            }
            return n != 0;
        });
        if (g.llIIIllIllIIlII(tileObject3) && g.llIIIllIllIIIIl(Reachable.isInteractable((Locatable)tileObject3) ? 1 : 0)) {
            tileObject2 = tileObject3;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        } else {
            tileObject2 = null;
        }
        return tileObject2;
    }

    @Inject
    public g(a a2, SquireZeahRunecrafter squireZeahRunecrafter) {
        this.E = a2;
        this.F = squireZeahRunecrafter;
    }

    private static String llIIIllIlIllIll(String llllllllllllllIllIIlIIIllIlllIIl, String llllllllllllllIllIIlIIIllIlllIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIlIIIllIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIIllIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlIIIllIllllIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlIIIllIllllIl.init(lIllIIllIllII[19], llllllllllllllIllIIlIIIllIlllllI);
            return new String(llllllllllllllIllIIlIIIllIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIIllIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIIIllIllllII) {
            llllllllllllllIllIIlIIIllIllllII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIllIllIIIIl(int n) {
        return n != 0;
    }

    private static void llIIIllIllIIIII() {
        lIllIIllIllII = new int[20];
        g.lIllIIllIllII[0] = (0x2A ^ 0x5C ^ (0xEA ^ 0x82)) & (54 + 104 - 144 + 203 ^ 69 + 21 - 46 + 155 ^ -" ".length());
        g.lIllIIllIllII[1] = " ".length();
        g.lIllIIllIllII[2] = -(0xFFFFFA32 & 0x45DF) & (0xFFFFFF97 & 0x5F7B);
        g.lIllIIllIllII[3] = -(0xFFFFEF76 & 0x5ACB) & (0xFFFFFFFF & 0x7EC7);
        g.lIllIIllIllII[4] = -" ".length();
        g.lIllIIllIllII[5] = 0xF2 ^ 0x98 ^ (0x2E ^ 0x50);
        g.lIllIIllIllII[6] = 0xFFFF8FFD & 0xF7B7;
        g.lIllIIllIllII[7] = -(0xFFFFFDF9 & 0x5E77) & (0xFFFFFF7F & Short.MAX_VALUE);
        g.lIllIIllIllII[8] = 59 + 102 - 58 + 77 ^ 149 + 137 - 99 + 3;
        g.lIllIIllIllII[9] = -(0xFFFFF50B & 0x7AFF) & (0xFFFFFEFB & 0x77EF);
        g.lIllIIllIllII[10] = -(0xFFFFFDD7 & 0x42BA) & (0xFFFFCF9F & 0x7FFD);
        g.lIllIIllIllII[11] = -(0xFFFFEBF5 & 0x741F) & (0xFFFFFF3F & 0x6FF7);
        g.lIllIIllIllII[12] = -"  ".length() & (0xFFFFD7AF & 0x2EFF);
        g.lIllIIllIllII[13] = -(0xFFFFEDE3 & 0x731F) & (0xFFFFEFFF & 0x7FEF);
        g.lIllIIllIllII[14] = 0x63 ^ 0x71;
        g.lIllIIllIllII[15] = 0x26 ^ 0x7A ^ (0xC6 ^ 0x8B);
        g.lIllIIllIllII[16] = 0xFFFFDFBF & 0x26EC;
        g.lIllIIllIllII[17] = -(0xFFFFDBE1 & 0x747F) & (0xFFFFFF7F & 0x5FFF);
        g.lIllIIllIllII[18] = 0x1B ^ 1 ^ (0xA2 ^ 0x8F);
        g.lIllIIllIllII[19] = "  ".length();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean x() {
        int n;
        block2: {
            block3: {
                if (!g.llIIIllIllIIIIl(C.contains((Locatable)Players.getLocal()) ? 1 : 0)) break block2;
                int[] nArray = new int[lIllIIllIllII[1]];
                nArray[g.lIllIIllIllII[0]] = lIllIIllIllII[2];
                if (!g.llIIIllIllIIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block3;
                int[] nArray2 = new int[lIllIIllIllII[1]];
                nArray2[g.lIllIIllIllII[0]] = lIllIIllIllII[3];
                if (!g.llIIIllIllIIIIl(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
            }
            n = lIllIIllIllII[1];
            "".length();
            if ("  ".length() > -" ".length()) return n != 0;
            return ((0x64 ^ 0x76 ^ (0xC2 ^ 0x9C)) & (232 + 41 - 57 + 38 ^ 9 + 166 - 46 + 49 ^ -" ".length())) != 0;
        }
        n = lIllIIllIllII[0];
        return n != 0;
    }

    private void c(TileObject tileObject) {
        if (g.llIIIllIllIIIll(Players.getLocal().getAnimation(), lIllIIllIllII[4])) {
            tileObject.interact(lIllIIllIlIlI[lIllIIllIllII[0]]);
        }
    }

    private static boolean llIIIllIllIIIlI(int n) {
        return n == 0;
    }

    private static boolean llIIIllIllIIIll(int n, int n2) {
        return n == n2;
    }

    private boolean w() {
        boolean bl;
        if (g.llIIIllIllIIIlI(this.F.a() ? 1 : 0)) {
            bl = lIllIIllIllII[1];
            "".length();
            if (" ".length() >= (0xDB ^ 0x8A ^ (0xC ^ 0x59))) {
                return ((114 + 98 - 81 + 9 ^ 152 + 84 - 218 + 163) & (116 + 25 - 5 + 41 ^ 56 + 127 - 181 + 134 ^ -" ".length())) != 0;
            }
        } else {
            bl = lIllIIllIllII[0];
        }
        return bl;
    }

    private boolean y() {
        return Inventory.isFull();
    }

    private static void llIIIllIlIlllII() {
        lIllIIllIlIlI = new String[lIllIIllIllII[19]];
        g.lIllIIllIlIlI[g.lIllIIllIllII[0]] = g.llIIIllIlIllIll("VxN1idC3qe4=", "IYBBQ");
        g.lIllIIllIlIlI[g.lIllIIllIllII[1]] = g.llIIIllIlIllIll("grumIBh+qzY=", "doYXt");
    }

    private boolean v() {
        boolean bl;
        if (!g.llIIIllIllIIIlI(this.w() ? 1 : 0) || !g.llIIIllIllIIIlI(this.x() ? 1 : 0) || !g.llIIIllIllIIIlI(this.y() ? 1 : 0) || g.llIIIllIllIIIIl(this.z() ? 1 : 0)) {
            bl = lIllIIllIllII[1];
            "".length();
            if (-(0x7B ^ 0x29 ^ (0x18 ^ 0x4F)) >= 0) {
                return ((0x52 ^ 0x17 ^ (0xD ^ 0x4C)) & (0xE ^ 0x26 ^ (0x2D ^ 1) ^ -" ".length())) != 0;
            }
        } else {
            bl = lIllIIllIllII[0];
        }
        return bl;
    }

    private boolean z() {
        int n;
        if (g.llIIIllIllIIIll(this.E.j(), this.E.h()) && g.llIIIllIllIIIIl(Inventory.isFull() ? 1 : 0)) {
            n = lIllIIllIllII[1];
            "".length();
            if (null != null) {
                return ((0x82 ^ 0x98) & ~(0x99 ^ 0x83)) != 0;
            }
        } else {
            n = lIllIIllIllII[0];
        }
        return n != 0;
    }

    private static boolean llIIIllIllIIllI(int n, int n2) {
        return n <= n2;
    }

    private boolean D() {
        boolean bl;
        if (g.llIIIllIllIIlIl(A.distanceTo(Players.getLocal().getWorldLocation()), lIllIIllIllII[5])) {
            bl = lIllIIllIllII[1];
            "".length();
            if ("   ".length() < "   ".length()) {
                return ("   ".length() & ("   ".length() ^ -" ".length())) != 0;
            }
        } else {
            bl = lIllIIllIllII[0];
        }
        return bl;
    }

    private static boolean llIIIllIllIIlIl(int n, int n2) {
        return n > n2;
    }

    private void A() {
        TileObject tileObject = this.B();
        if (g.llIIIllIllIIlII(tileObject)) {
            this.c(tileObject);
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        } else {
            g llllllllllllllIllIIlIIIlllIIlllI;
            llllllllllllllIllIIlIIIlllIIlllI.C();
        }
    }

    private void C() {
        if (g.llIIIllIllIIIIl(this.D() ? 1 : 0) && g.llIIIllIllIIIIl(D.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            this.E();
            "".length();
            if (-" ".length() == "  ".length()) {
                return;
            }
        } else {
            Movement.walkTo((WorldPoint)A);
            "".length();
        }
    }

    private void E() {
        int[] nArray = new int[lIllIIllIllII[1]];
        nArray[g.lIllIIllIllII[0]] = lIllIIllIllII[6];
        TileObject tileObject = TileObjects.getNearest((int[])nArray);
        if (g.llIIIllIllIIlII(tileObject)) {
            tileObject.interact(lIllIIllIlIlI[lIllIIllIllII[1]]);
            "".length();
            if ((0x5E ^ 6 ^ (0x7F ^ 0x23)) == 0) {
                return;
            }
        } else {
            Movement.walkTo((WorldPoint)B);
            "".length();
        }
    }

    private static boolean llIIIllIllIIlII(Object object) {
        return object != null;
    }
}

