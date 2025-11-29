package u.i.r.d.s.e.r.q.y.a.h.p000;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.inject.Inject;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Walking back to start")
/* renamed from: u.i.r.d.s.e.r.q.y.a.h.-.B  reason: invalid package */
/* loaded from: f9dee1ad-dcbf-4af9-9fb8-47dc91e2d43e.jar:u/i/r/d/s/e/r/q/y/a/h/-/B.class */
public class B extends Task {
    private static /* synthetic */ String[] llllIIlIlIIl;
    private static /* synthetic */ int[] llllIIlIlIlI;
    private final /* synthetic */ C0002c bd;
    private final /* synthetic */ C0000a bc;

    private static boolean lIIIllllllIlIII(Object obj) {
        return obj != null;
    }

    private static boolean lIIIllllllIlIlI(int i) {
        return i > 0;
    }

    static {
        lIIIllllllIIllI();
        lIIIllllllIIlIl();
    }

    private static void lIIIllllllIIlIl() {
        llllIIlIlIIl = new String[llllIIlIlIlI[1]];
        llllIIlIlIIl[llllIIlIlIlI[0]] = lIIIllllllIIlII("Ez0mPQ4/OCY0B3IZPDEZMw==", "RQEUk");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    public boolean run() {
        if (!lIIIllllllIIlll(this.bc.g() ? 1 : 0) && !lIIIllllllIlIII(this.bc.k())) {
            String[] strArr = new String[llllIIlIlIlI[1]];
            strArr[llllIIlIlIlI[0]] = llllIIlIlIIl[llllIIlIlIlI[0]];
            if (lIIIllllllIlIII(NPCs.getNearest(strArr))) {
                return llllIIlIlIlI[0];
            }
            if (lIIIllllllIlIIl(this.bc.e(), llllIIlIlIlI[2]) && lIIIllllllIlIlI(TileItems.getAll().size())) {
                return llllIIlIlIlI[0];
            }
            WorldPoint world = k.POISON.Z().toWorld();
            if (lIIIllllllIlIll(world.equals(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                return llllIIlIlIlI[0];
            }
            Movement.setDestination(world);
            return llllIIlIlIlI[1];
        }
        return llllIIlIlIlI[0];
    }

    private static boolean lIIIllllllIlIll(int i) {
        return i != 0;
    }

    private static void lIIIllllllIIllI() {
        llllIIlIlIlI = new int[3];
        llllIIlIlIlI[0] = ((((150 + 131) - 262) + 230) ^ (((72 + 117) - 86) + 70)) & (((20 ^ 25) ^ (212 ^ 141)) ^ (-" ".length()));
        llllIIlIlIlI[1] = " ".length();
        llllIIlIlIlI[2] = (133 ^ 171) ^ (125 ^ 89);
    }

    private static boolean lIIIllllllIllII(int i, int i2) {
        return i < i2;
    }

    @Inject
    public B(C0000a c0000a, C0002c c0002c) {
        this.bc = c0000a;
        this.bd = c0002c;
    }

    private static boolean lIIIllllllIIlll(int i) {
        return i == 0;
    }

    private static boolean lIIIllllllIlIIl(int i, int i2) {
        return i > i2;
    }

    private static String lIIIllllllIIlII(String lllllllllllllllIIlIlIlIlIllIIlIl, String lllllllllllllllIIlIlIlIlIlIlllll) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIlIlIllIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIlIlIllIIIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIlIlIlIlIlllll.toCharArray();
        int lllllllllllllllIIlIlIlIlIllIIIIl = llllIIlIlIlI[0];
        char[] charArray2 = str.toCharArray();
        int lllllllllllllllIIlIlIlIlIlIllIlI = charArray2.length;
        int i = llllIIlIlIlI[0];
        while (lIIIllllllIllII(i, lllllllllllllllIIlIlIlIlIlIllIlI)) {
            char lllllllllllllllIIlIlIlIlIllIIllI = charArray2[i];
            lllllllllllllllIIlIlIlIlIllIIIll.append((char) (lllllllllllllllIIlIlIlIlIllIIllI ^ charArray[lllllllllllllllIIlIlIlIlIllIIIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIlIlIlIllIIIIl++;
            i++;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIlIlIlIllIIIll);
    }
}
