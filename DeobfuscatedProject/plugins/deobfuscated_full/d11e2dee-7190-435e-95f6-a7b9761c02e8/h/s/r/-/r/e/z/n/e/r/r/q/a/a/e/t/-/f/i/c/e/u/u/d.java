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
import java.util.Base64;
import net.runelite.api.Locatable;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;

/* TASK: Crafting Blood Runes -> CraftingbloodrunesTask */
@TaskDesc(name="Crafting Blood Runes")
public class d
extends Task {
    private static /* synthetic */ String[] lIllIIlllIlIl;
    private final /* synthetic */ SquireZeahRunecrafter v;
    private static final /* synthetic */ WorldPoint t;
    private static /* synthetic */ int[] lIllIIlllIlll;
    private final /* synthetic */ a u;
    private static final /* synthetic */ WorldArea s;

    @Inject
    public d(a a2, SquireZeahRunecrafter squireZeahRunecrafter) {
        this.u = a2;
        this.v = squireZeahRunecrafter;
    }

    private static void llIIIlllIIIIIll() {
        lIllIIlllIlll = new int[12];
        d.lIllIIlllIlll[0] = (0x97 ^ 0x83) & ~(0x10 ^ 4);
        d.lIllIIlllIlll[1] = 1;
        d.lIllIIlllIlll[2] = 0xFFFFB5DD & 0x7EA7;
        d.lIllIIlllIlll[3] = -(0xFFFFCA5D & 0x77EB) & (0xFFFFFEEE & 0x77DF);
        d.lIllIIlllIlll[4] = 0xFFFFBF43 & 0x5FBE;
        d.lIllIIlllIlll[5] = -(0xFFFFBAB5 & 0x47EF) & (0xFFFFFFEF & 0x6FFE);
        d.lIllIIlllIlll[6] = 0xFFFFAFEF & 0x56BE;
        d.lIllIIlllIlll[7] = 0xFFFF9FFF & 0x6EED;
        d.lIllIIlllIlll[8] = 0x11 ^ 3;
        d.lIllIIlllIlll[9] = 0x88 ^ 0x99;
        d.lIllIIlllIlll[10] = -(0xFFFFEBFB & 0x5D4D) & (0xFFFFDFFF & 0x6FFF);
        d.lIllIIlllIlll[11] = -(0xFFFFF7FD & 0x590B) & (0xFFFFDFFE & 0x7FFD);
    }

    public boolean run() {
        d var5;
        if (!d.llIIIlllIIIIlII(this.v.a() ? 1 : 0) || d.llIIIlllIIIIlIl(this.m() ? 1 : 0)) {
            return lIllIIlllIlll[0];
        }
        TileObject var11 = var5.p();
        if (d.llIIIlllIIIIllI(var11)) {
            var5.a(var11);
            0;
            if (3 == 0) {
                return ((0xF8 ^ 0xB2 ^ (0x7D ^ 0x19)) & (18 + 90 - 23 + 59 ^ 79 + 110 - 132 + 133 ^ -1)) != 0;
            }
        } else {
            var5.q();
        }
        return lIllIIlllIlll[1];
    }

    private static boolean llIIIlllIIIIlIl(int n) {
        return n == 0;
    }

    private static boolean llIIIlllIIIIlll(int n, int n2) {
        return n == n2;
    }

    private static boolean llIIIlllIIIlIII(int n, int n2) {
        return n < n2;
    }

    private static String llIIIllIlllllIl(String var6, String var4) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var3 = new StringBuilder();
        char[] var7 = var4.toCharArray();
        int var8 = lIllIIlllIlll[0];
        char[] var10 = var6.toCharArray();
        int var9 = var10.length;
        int var1 = lIllIIlllIlll[0];
        while (d.llIIIlllIIIlIII(var1, var9)) {
            char var2 = var10[var1];
            var3.append((char)(var2 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var1;
            0;
            if ((0x85 ^ 0x80) != 0) continue;
            return null;
        }
        return String.valueOf(var3);
    }

    private boolean m() {
        boolean bl;
        if (!d.llIIIlllIIIIlIl(this.n() ? 1 : 0) || d.llIIIlllIIIIlII(this.o() ? 1 : 0)) {
            bl = lIllIIlllIlll[1];
            0;
            if (((0x61 ^ 9 ^ (0xDF ^ 0xA1)) & (5 ^ 0x59 ^ (0xEB ^ 0xA1) ^ -1)) < 0) {
                return false;
            }
        } else {
            bl = lIllIIlllIlll[0];
        }
        return bl;
    }

    private void a(TileObject tileObject) {
        tileObject.interact(lIllIIlllIlIl[lIllIIlllIlll[0]]);
    }

    private TileObject p() {
        TileObject tileObject;
        int[] nArray = new int[lIllIIlllIlll[1]];
        nArray[d.lIllIIlllIlll[0]] = lIllIIlllIlll[5];
        TileObject tileObject2 = TileObjects.getNearest((int[])nArray);
        if (d.llIIIlllIIIIllI(tileObject2) && d.llIIIlllIIIIlII(Reachable.isInteractable((Locatable)tileObject2) ? 1 : 0)) {
            tileObject = tileObject2;
            0;
            if (((0x78 ^ 0x1A) & ~(0xC3 ^ 0xA1)) > ((0xBB ^ 0x92) & ~(0x94 ^ 0xBD))) {
                return null;
            }
        } else {
            tileObject = null;
        }
        return tileObject;
    }

    private static boolean llIIIlllIIIIllI(Object object) {
        return object != null;
    }

    private boolean n() {
        int n;
        int[] nArray = new int[lIllIIlllIlll[1]];
        nArray[d.lIllIIlllIlll[0]] = lIllIIlllIlll[2];
        if (d.llIIIlllIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0) && d.llIIIlllIIIIlll(this.u.h(), this.u.j()) && d.llIIIlllIIIIlII(Inventory.isFull() ? 1 : 0)) {
            n = lIllIIlllIlll[1];
            0;
            if (2 <= 0) {
                return false;
            }
        } else {
            n = lIllIIlllIlll[0];
        }
        return n != 0;
    }

    private static void llIIIllIllllllI() {
        lIllIIlllIlIl = new String[lIllIIlllIlll[1]];
        d.lIllIIlllIlIl[d.lIllIIlllIlll[0]] = d."Bind";
    }

    private void q() {
        Movement.walkTo((WorldPoint)t);
        0;
    }

    private static boolean llIIIlllIIIIlII(int n) {
        return n != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean o() {
        int n;
        if (d.llIIIlllIIIIlII(s.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            int[] nArray = new int[lIllIIlllIlll[1]];
            nArray[d.lIllIIlllIlll[0]] = lIllIIlllIlll[3];
            if (d.llIIIlllIIIIlIl(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[lIllIIlllIlll[1]];
                nArray2[d.lIllIIlllIlll[0]] = lIllIIlllIlll[4];
                if (d.llIIIlllIIIIlII(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    n = lIllIIlllIlll[1];
                    0;
                    if (-1 < 2) return n != 0;
                    return false;
                }
            }
        }
        n = lIllIIlllIlll[0];
        return n != 0;
    }

    static {
        d.llIIIlllIIIIIll();
        d.llIIIllIllllllI();
        s = new WorldArea(lIllIIlllIlll[6], lIllIIlllIlll[7], lIllIIlllIlll[8], lIllIIlllIlll[9], lIllIIlllIlll[0]);
        t = new WorldPoint(lIllIIlllIlll[10], lIllIIlllIlll[11], lIllIIlllIlll[0]);
    }
}

