/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.movement.Movement
 */
package s.r.i.t.g.n.-.u.h.i.q.i.e.v.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.movement.Movement;
import s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.b;

/* TASK: Walking to stall -> WalkingtostallTask */
@TaskDesc(name="Walking to stall")
public class K
extends Task {
    private static /* synthetic */ int[] lIIllIllIllII;
    private final /* synthetic */ SquireThievingConfig aM;
    private static /* synthetic */ String[] lIIllIllIlIll;

    private static String lIllIIIlIllIlIl(String var1, String var6) {
        var1 = new String(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var11 = new StringBuilder();
        char[] var3 = var6.toCharArray();
        int var7 = lIIllIllIllII[0];
        char[] var10 = var1.toCharArray();
        int var2 = var10.length;
        int var4 = lIIllIllIllII[0];
        while (K.lIllIIIlIllllII(var4, var2)) {
            char var9 = var10[var4];
            var11.append((char)(var9 ^ var3[var7 % var3.length]));
            0;
            ++var7;
            ++var4;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(var11);
    }

    private static void lIllIIIlIllIlll() {
        lIIllIllIllII = new int[2];
        K.lIIllIllIllII[0] = (0x8B ^ 0xC0) & ~(0x51 ^ 0x1A);
        K.lIIllIllIllII[1] = 1;
    }

    private static boolean lIllIIIlIllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlIlllIIl(int n2) {
        return n2 != 0;
    }

    static {
        K.lIllIIIlIllIlll();
        K.lIllIIIlIllIllI();
    }

    @Inject
    public K(SquireThievingConfig squireThievingConfig) {
        this.aM = squireThievingConfig;
    }

    private static void lIllIIIlIllIllI() {
        lIIllIllIlIll = new String[lIIllIllIllII[1]];
        K.lIIllIllIlIll[K.lIIllIllIllII[0]] = K."Walking to stall";
    }

    public boolean run() {
        K var8;
        if (K.lIllIIIlIlllIII((Object)this.aM.method(), (Object)b.STALLS)) {
            return lIIllIllIllII[0];
        }
        if (K.lIllIIIlIlllIIl(Bank.isOpen() ? 1 : 0)) {
            return lIIllIllIllII[0];
        }
        Player var5 = Players.getLocal();
        if (K.lIllIIIlIlllIlI(var5)) {
            return lIIllIllIllII[0];
        }
        WorldArea[] worldAreaArray = new WorldArea[lIIllIllIllII[1]];
        worldAreaArray[K.lIIllIllIllII[0]] = var8.aM.stallTarget().p();
        if (K.lIllIIIlIlllIll(var5.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
            Log.info((String)lIIllIllIlIll[lIIllIllIllII[0]]);
            Movement.walkTo((WorldPoint)var8.aM.stallTarget().z());
            0;
            return lIIllIllIllII[1];
        }
        return lIIllIllIllII[0];
    }

    private static boolean lIllIIIlIlllIlI(Object object) {
        return object == null;
    }

    private static boolean lIllIIIlIlllIll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIlIlllIII(Object object, Object object2) {
        return object != object2;
    }
}

