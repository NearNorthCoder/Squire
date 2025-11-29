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

@TaskDesc(name="Walking to stall")
public class K
extends Task {
    private static /* synthetic */ int[] lIIllIllIllII;
    private final /* synthetic */ SquireThievingConfig aM;
    private static /* synthetic */ String[] lIIllIllIlIll;

    private static String lIllIIIlIllIlIl(String llllllllllllllIlllIlllIllIIIllII, String llllllllllllllIlllIlllIllIIlIIII) {
        llllllllllllllIlllIlllIllIIIllII = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIllIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIlllIllIIIllll = new StringBuilder();
        char[] llllllllllllllIlllIlllIllIIIlllI = llllllllllllllIlllIlllIllIIlIIII.toCharArray();
        int llllllllllllllIlllIlllIllIIIllIl = lIIllIllIllII[0];
        char[] llllllllllllllIlllIlllIllIIIIlll = llllllllllllllIlllIlllIllIIIllII.toCharArray();
        int llllllllllllllIlllIlllIllIIIIllI = llllllllllllllIlllIlllIllIIIIlll.length;
        int llllllllllllllIlllIlllIllIIIIlIl = lIIllIllIllII[0];
        while (K.lIllIIIlIllllII(llllllllllllllIlllIlllIllIIIIlIl, llllllllllllllIlllIlllIllIIIIllI)) {
            char llllllllllllllIlllIlllIllIIlIIlI = llllllllllllllIlllIlllIllIIIIlll[llllllllllllllIlllIlllIllIIIIlIl];
            llllllllllllllIlllIlllIllIIIllll.append((char)(llllllllllllllIlllIlllIllIIlIIlI ^ llllllllllllllIlllIlllIllIIIlllI[llllllllllllllIlllIlllIllIIIllIl % llllllllllllllIlllIlllIllIIIlllI.length]));
            "".length();
            ++llllllllllllllIlllIlllIllIIIllIl;
            ++llllllllllllllIlllIlllIllIIIIlIl;
            "".length();
            if ("   ".length() != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIlllIllIIIllll);
    }

    private static void lIllIIIlIllIlll() {
        lIIllIllIllII = new int[2];
        K.lIIllIllIllII[0] = (0x8B ^ 0xC0) & ~(0x51 ^ 0x1A);
        K.lIIllIllIllII[1] = " ".length();
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
        K.lIIllIllIlIll[K.lIIllIllIllII[0]] = K.lIllIIIlIllIlIl("LTMgAyYUNWwcIFohOAkjFg==", "zRLhO");
    }

    public boolean run() {
        K llllllllllllllIlllIlllIllIIlllIl;
        if (K.lIllIIIlIlllIII((Object)this.aM.method(), (Object)b.STALLS)) {
            return lIIllIllIllII[0];
        }
        if (K.lIllIIIlIlllIIl(Bank.isOpen() ? 1 : 0)) {
            return lIIllIllIllII[0];
        }
        Player llllllllllllllIlllIlllIllIIlllII = Players.getLocal();
        if (K.lIllIIIlIlllIlI(llllllllllllllIlllIlllIllIIlllII)) {
            return lIIllIllIllII[0];
        }
        WorldArea[] worldAreaArray = new WorldArea[lIIllIllIllII[1]];
        worldAreaArray[K.lIIllIllIllII[0]] = llllllllllllllIlllIlllIllIIlllIl.aM.stallTarget().p();
        if (K.lIllIIIlIlllIll(llllllllllllllIlllIlllIllIIlllII.getWorldLocation().isInArea(worldAreaArray) ? 1 : 0)) {
            Log.info((String)lIIllIllIlIll[lIIllIllIllII[0]]);
            Movement.walkTo((WorldPoint)llllllllllllllIlllIlllIllIIlllIl.aM.stallTarget().z());
            "".length();
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

