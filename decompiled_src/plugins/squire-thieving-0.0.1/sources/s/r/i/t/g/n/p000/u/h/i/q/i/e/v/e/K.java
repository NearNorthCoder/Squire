package s.r.i.t.g.n.p000.u.h.i.q.i.e.v.e;

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
@TaskDesc(name = "Walking to stall")
/* renamed from: s.r.i.t.g.n.-.u.h.i.q.i.e.v.e.K  reason: invalid package */
/* loaded from: squire-thieving-0.0.1.jar:s/r/i/t/g/n/-/u/h/i/q/i/e/v/e/K.class */
public class K extends Task {
    private static /* synthetic */ int[] lIIllIllIllII;
    private final /* synthetic */ SquireThievingConfig aM;
    private static /* synthetic */ String[] lIIllIllIlIll;

    private static String lIllIIIlIllIlIl(String llllllllllllllIlllIlllIllIIlIIIl, String llllllllllllllIlllIlllIllIIlIIII) {
        String llllllllllllllIlllIlllIllIIlIIIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIlllIllIIIlllI = llllllllllllllIlllIlllIllIIlIIII.toCharArray();
        int llllllllllllllIlllIlllIllIIIllIl = lIIllIllIllII[0];
        char[] charArray = llllllllllllllIlllIlllIllIIlIIIl2.toCharArray();
        int length = charArray.length;
        int i = lIIllIllIllII[0];
        while (lIllIIIlIllllII(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIlllIlllIllIIIlllI[llllllllllllllIlllIlllIllIIIllIl % llllllllllllllIlllIlllIllIIIlllI.length]));
            "".length();
            llllllllllllllIlllIlllIllIIIllIl++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static void lIllIIIlIllIlll() {
        lIIllIllIllII = new int[2];
        lIIllIllIllII[0] = (139 ^ 192) & ((81 ^ 26) ^ (-1));
        lIIllIllIllII[1] = " ".length();
    }

    private static boolean lIllIIIlIllllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIlIlllIIl(int i) {
        return i != 0;
    }

    static {
        lIllIIIlIllIlll();
        lIllIIIlIllIllI();
    }

    @Inject
    public K(SquireThievingConfig squireThievingConfig) {
        this.aM = squireThievingConfig;
    }

    private static void lIllIIIlIllIllI() {
        lIIllIllIlIll = new String[lIIllIllIllII[1]];
        lIIllIllIlIll[lIIllIllIllII[0]] = lIllIIIlIllIlIl("LTMgAyYUNWwcIFohOAkjFg==", "zRLhO");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    public boolean run() {
        if (!lIllIIIlIlllIII(this.aM.method(), EnumC0001b.STALLS) && !lIllIIIlIlllIIl(Bank.isOpen() ? 1 : 0)) {
            Player local = Players.getLocal();
            if (lIllIIIlIlllIlI(local)) {
                return lIIllIllIllII[0];
            }
            WorldPoint worldLocation = local.getWorldLocation();
            WorldArea[] worldAreaArr = new WorldArea[lIIllIllIllII[1]];
            worldAreaArr[lIIllIllIllII[0]] = this.aM.stallTarget().p();
            if (lIllIIIlIlllIll(worldLocation.isInArea(worldAreaArr) ? 1 : 0)) {
                Log.info(lIIllIllIlIll[lIIllIllIllII[0]]);
                Movement.walkTo(this.aM.stallTarget().z());
                "".length();
                return lIIllIllIllII[1];
            }
            return lIIllIllIllII[0];
        }
        return lIIllIllIllII[0];
    }

    private static boolean lIllIIIlIlllIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIllIIIlIlllIll(int i) {
        return i == 0;
    }

    private static boolean lIllIIIlIlllIII(Object obj, Object obj2) {
        return obj != obj2;
    }
}
