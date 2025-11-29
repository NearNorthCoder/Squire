/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.movement.Movement
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.movement.Movement;
import u.i.r.d.s.e.r.q.y.a.h.-.a;
import u.i.r.d.s.e.r.q.y.a.h.-.c;
import u.i.r.d.s.e.r.q.y.a.h.-.k;

@TaskDesc(name="Walking back to start")
public class B
extends Task {
    private static /* synthetic */ String[] llllIIlIlIIl;
    private static /* synthetic */ int[] llllIIlIlIlI;
    private final /* synthetic */ c bd;
    private final /* synthetic */ a bc;

    private static boolean lIIIllllllIlIII(Object object) {
        return object != null;
    }

    private static boolean lIIIllllllIlIlI(int n2) {
        return n2 > 0;
    }

    static {
        B.lIIIllllllIIllI();
        B.lIIIllllllIIlIl();
    }

    private static void lIIIllllllIIlIl() {
        llllIIlIlIIl = new String[llllIIlIlIlI[1]];
        B.llllIIlIlIIl[B.llllIIlIlIlI[0]] = B.lIIIllllllIIlII("Ez0mPQ4/OCY0B3IZPDEZMw==", "RQEUk");
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        B lllllllllllllllIIlIlIlIlIlllIIlI;
        if (B.lIIIllllllIIlll(this.bc.g() ? 1 : 0)) {
            return llllIIlIlIlI[0];
        }
        if (B.lIIIllllllIlIII(lllllllllllllllIIlIlIlIlIlllIIlI.bc.k())) {
            return llllIIlIlIlI[0];
        }
        String[] stringArray = new String[llllIIlIlIlI[1]];
        stringArray[B.llllIIlIlIlI[0]] = llllIIlIlIIl[llllIIlIlIlI[0]];
        NPC lllllllllllllllIIlIlIlIlIlllIIIl = NPCs.getNearest((String[])stringArray);
        if (B.lIIIllllllIlIII(lllllllllllllllIIlIlIlIlIlllIIIl)) {
            return llllIIlIlIlI[0];
        }
        if (B.lIIIllllllIlIIl(lllllllllllllllIIlIlIlIlIlllIIlI.bc.e(), llllIIlIlIlI[2]) && B.lIIIllllllIlIlI(TileItems.getAll().size())) {
            return llllIIlIlIlI[0];
        }
        WorldPoint lllllllllllllllIIlIlIlIlIlllIIII = k.POISON.Z().toWorld();
        if (B.lIIIllllllIlIll(lllllllllllllllIIlIlIlIlIlllIIII.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
            return llllIIlIlIlI[0];
        }
        Movement.setDestination((WorldPoint)var2_2);
        return llllIIlIlIlI[1];
    }

    private static boolean lIIIllllllIlIll(int n2) {
        return n2 != 0;
    }

    private static void lIIIllllllIIllI() {
        llllIIlIlIlI = new int[3];
        B.llllIIlIlIlI[0] = (150 + 131 - 262 + 230 ^ 72 + 117 - 86 + 70) & (0x14 ^ 0x19 ^ (0xD4 ^ 0x8D) ^ -" ".length());
        B.llllIIlIlIlI[1] = " ".length();
        B.llllIIlIlIlI[2] = 0x85 ^ 0xAB ^ (0x7D ^ 0x59);
    }

    private static boolean lIIIllllllIllII(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    public B(a a2, c c2) {
        this.bc = a2;
        this.bd = c2;
    }

    private static boolean lIIIllllllIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIllllllIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIIllllllIIlII(String lllllllllllllllIIlIlIlIlIllIIlIl, String lllllllllllllllIIlIlIlIlIllIIlII) {
        lllllllllllllllIIlIlIlIlIllIIlIl = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIlIlIllIIIll = new StringBuilder();
        char[] lllllllllllllllIIlIlIlIlIllIIIlI = lllllllllllllllIIlIlIlIlIllIIlII.toCharArray();
        int lllllllllllllllIIlIlIlIlIllIIIIl = llllIIlIlIlI[0];
        char[] lllllllllllllllIIlIlIlIlIlIllIll = lllllllllllllllIIlIlIlIlIllIIlIl.toCharArray();
        int lllllllllllllllIIlIlIlIlIlIllIlI = lllllllllllllllIIlIlIlIlIlIllIll.length;
        int lllllllllllllllIIlIlIlIlIlIllIIl = llllIIlIlIlI[0];
        while (B.lIIIllllllIllII(lllllllllllllllIIlIlIlIlIlIllIIl, lllllllllllllllIIlIlIlIlIlIllIlI)) {
            char lllllllllllllllIIlIlIlIlIllIIllI = lllllllllllllllIIlIlIlIlIlIllIll[lllllllllllllllIIlIlIlIlIlIllIIl];
            lllllllllllllllIIlIlIlIlIllIIIll.append((char)(lllllllllllllllIIlIlIlIlIllIIllI ^ lllllllllllllllIIlIlIlIlIllIIIlI[lllllllllllllllIIlIlIlIlIllIIIIl % lllllllllllllllIIlIlIlIlIllIIIlI.length]));
            "".length();
            ++lllllllllllllllIIlIlIlIlIllIIIIl;
            ++lllllllllllllllIIlIlIlIlIlIllIIl;
            "".length();
            if (" ".length() > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIlIlIllIIIll);
    }
}

