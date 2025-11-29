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
import u.i.r.d.s.e.r.q.y.a.h.-.a_Unknown;
import u.i.r.d.s.e.r.q.y.a.h.-.c_Unknown;
import u.i.r.d.s.e.r.q.y.a.h.-.KEnum;

/* TASK: Walking back to start -> WalkingbacktostartTask */
@TaskDesc(name="Walking back to start")
public class WalkingBackToStartTask
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
        B.llllIIlIlIIl[B.llllIIlIlIlI[0]] = B."Alchemical Hydra";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        B var1;
        if (B.lIIIllllllIIlll(this.bc.g() ? 1 : 0)) {
            return llllIIlIlIlI[0];
        }
        if (B.lIIIllllllIlIII(var1.bc.k())) {
            return llllIIlIlIlI[0];
        }
        String[] stringArray = new String[llllIIlIlIlI[1]];
        stringArray[B.llllIIlIlIlI[0]] = llllIIlIlIIl[llllIIlIlIlI[0]];
        NPC var5 = NPCs.getNearest((String[])stringArray);
        if (B.lIIIllllllIlIII(var5)) {
            return llllIIlIlIlI[0];
        }
        if (B.lIIIllllllIlIIl(var1.bc.e(), llllIIlIlIlI[2]) && B.lIIIllllllIlIlI(TileItems.getAll().size())) {
            return llllIIlIlIlI[0];
        }
        WorldPoint var10 = k.POISON.Z().toWorld();
        if (B.lIIIllllllIlIll(var10.equals((Object)Players.getLocal().getWorldLocation()) ? 1 : 0)) {
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
        B.llllIIlIlIlI[0] = (150 + 131 - 262 + 230 ^ 72 + 117 - 86 + 70) & (0x14 ^ 0x19 ^ (0xD4 ^ 0x8D) ^ -1);
        B.llllIIlIlIlI[1] = 1;
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

    private static String lIIIllllllIIlII(String var3, String var9) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var8 = var9.toCharArray();
        int var11 = llllIIlIlIlI[0];
        char[] var2 = var3.toCharArray();
        int var6 = var2.length;
        int var7 = llllIIlIlIlI[0];
        while (B.lIIIllllllIllII(var7, var6)) {
            char var12 = var2[var7];
            var4.append((char)(var12 ^ var8[var11 % var8.length]));
            0;
            ++var11;
            ++var7;
            0;
            if (1 > 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }
}

