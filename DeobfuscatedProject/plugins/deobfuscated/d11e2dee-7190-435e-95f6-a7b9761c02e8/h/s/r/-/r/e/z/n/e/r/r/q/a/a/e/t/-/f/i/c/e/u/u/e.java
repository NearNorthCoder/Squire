/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 */
package h.s.r.-.r.e.z.n.e.r.r.q.a.a.e.t.-.f.i.c.e.u.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireZeahRunecrafter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;

@TaskDesc(name="Creating Dark Essence")
public class e
extends Task {
    private static /* synthetic */ String[] lIllIIllIlllI;
    private static /* synthetic */ int[] lIllIIlllIIIl;
    private static final /* synthetic */ WorldPoint x;
    private static final /* synthetic */ int w;
    private final /* synthetic */ SquireZeahRunecrafter y;

    static {
        e.llIIIllIlllIIll();
        e.llIIIllIllIlllI();
        w = lIllIIlllIIIl[3];
        x = new WorldPoint(lIllIIlllIIIl[5], lIllIIlllIIIl[6], lIllIIlllIIIl[0]);
    }

    private static boolean llIIIllIlllIlII(int n) {
        return n != 0;
    }

    private static boolean llIIIllIllllIII(int n, int n2) {
        return n == n2;
    }

    private static void llIIIllIlllIIll() {
        lIllIIlllIIIl = new int[9];
        e.lIllIIlllIIIl[0] = 3 & ~3;
        e.lIllIIlllIIIl[1] = 1;
        e.lIllIIlllIIIl[2] = 0xFFFFBEDD & 0x75A7;
        e.lIllIIlllIIIl[3] = 0xE0 ^ 0xAF ^ (0x47 ^ 0xD);
        e.lIllIIlllIIIl[4] = 0xFFFFEF5B & 0x7DEF;
        e.lIllIIlllIIIl[5] = 0xFFFFBFF6 & 0x46BF;
        e.lIllIIlllIIIl[6] = -(0xFFFFE3D7 & 0x7CEE) & (0xFFFFEFFF & 0x7FEF);
        e.lIllIIlllIIIl[7] = 9 + 80 - 84 + 125 ^ 77 + 87 - 108 + 82;
        e.lIllIIlllIIIl[8] = 2;
    }

    private void u() {
        if (e.llIIIllIlllIlII(Movement.shouldWalk() ? 1 : 0)) {
            Movement.walkTo((WorldPoint)x);
            0;
        }
    }

    private static boolean llIIIllIlllIllI(Object object) {
        return object != null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean r() {
        int n;
        if (e.llIIIllIlllIlII(Inventory.isFull() ? 1 : 0)) {
            int[] nArray = new int[lIllIIlllIIIl[1]];
            nArray[e.lIllIIlllIIIl[0]] = lIllIIlllIIIl[2];
            if (e.llIIIllIlllIlII(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n = lIllIIlllIIIl[1];
                0;
                if (((67 + 139 - 116 + 56 ^ 97 + 2 - 45 + 128) & (0x89 ^ 0xB1 ^ (0xDF ^ 0xC3) ^ -1)) < (171 + 31 - 67 + 64 ^ 19 + 181 - 42 + 37)) return n != 0;
                return ((195 + 1 - 100 + 135 ^ 60 + 53 - -32 + 28) & (141 + 142 - 95 + 13 ^ 92 + 122 - 189 + 106 ^ -1)) != 0;
            }
        }
        n = lIllIIlllIIIl[0];
        return n != 0;
    }

    private static boolean llIIIllIlllIlll(int n, int n2) {
        return n <= n2;
    }

    private static String llIIIllIllIllIl(String llllllllllllllIllIIlIIIlIlIIIIIl, String llllllllllllllIllIIlIIIlIlIIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIIlIIIlIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), lIllIIlllIIIl[7]), "DES");
            Cipher llllllllllllllIllIIlIIIlIlIIIIll = Cipher.getInstance("DES");
            llllllllllllllIllIIlIIIlIlIIIIll.init(lIllIIlllIIIl[8], llllllllllllllIllIIlIIIlIlIIIlII);
            return new String(llllllllllllllIllIIlIIIlIlIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIIlIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIlIIIlIlIIIIlI) {
            llllllllllllllIllIIlIIIlIlIIIIlI.printStackTrace();
            return null;
        }
    }

    private TileObject t() {
        return TileObjects.getNearest(tileObject -> {
            int n;
            if (e.llIIIllIlllIlll(tileObject.getWorldLocation().distanceTo(Players.getLocal().getWorldLocation()), lIllIIlllIIIl[3]) && e.llIIIllIllllIII(tileObject.getId(), lIllIIlllIIIl[4])) {
                n = lIllIIlllIIIl[1];
                0;
                if (((77 + 42 - 109 + 137 ^ 107 + 119 - 172 + 96) & (124 + 7 - 24 + 29 ^ 107 + 8 - -18 + 8 ^ -1)) != 0) {
                    return ((0xB4 ^ 0xBD ^ (0xEA ^ 0xC7)) & (0xD8 ^ 0x9E ^ (0xC ^ 0x6E) ^ -1)) != 0;
                }
            } else {
                n = lIllIIlllIIIl[0];
            }
            return n != 0;
        });
    }

    private static void llIIIllIllIlllI() {
        lIllIIllIlllI = new String[lIllIIlllIIIl[1]];
        e.lIllIIllIlllI[e.lIllIIlllIIIl[0]] = e."Venerate";
    }

    public boolean run() {
        if (!e.llIIIllIlllIlII(this.y.a() ? 1 : 0) || e.llIIIllIlllIlIl(this.r() ? 1 : 0)) {
            return lIllIIlllIIIl[0];
        }
        this.s();
        return lIllIIlllIIIl[1];
    }

    private void s() {
        TileObject tileObject = this.t();
        if (e.llIIIllIlllIllI(tileObject)) {
            tileObject.interact(lIllIIllIlllI[lIllIIlllIIIl[0]]);
            0;
            if (1 == 0) {
                return;
            }
        } else {
            e llllllllllllllIllIIlIIIlIlIIllII;
            llllllllllllllIllIIlIIIlIlIIllII.u();
        }
    }

    private static boolean llIIIllIlllIlIl(int n) {
        return n == 0;
    }

    @Inject
    public e(SquireZeahRunecrafter squireZeahRunecrafter) {
        this.y = squireZeahRunecrafter;
    }
}

