package w.r.e.i.d.r.q.u.e.p000.c.u.o.s.o.t.t;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.woodcutting.SquireWoodcutterConfig;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@Singleton
@TaskDesc(name = "Tracking the tree", priority = 420)
/* renamed from: w.r.e.i.d.r.q.u.e.-.c.u.o.s.o.t.t.l  reason: invalid package */
/* loaded from: f90b6cea-b1e4-4f52-8aee-23d3738ff311.jar:w/r/e/i/d/r/q/u/e/-/c/u/o/s/o/t/t/l.class */
public class l extends Task {
    private /* synthetic */ long chopTimestamp;
    private final /* synthetic */ SquireWoodcutterConfig M;
    private static /* synthetic */ int[] lIllIIIlIIIII;
    private static final /* synthetic */ List<i> N;
    private static /* synthetic */ String[] lIllIIIIlllll;

    private static void llIIIlIIlIIllll() {
        lIllIIIlIIIII = new int[2];
        lIllIIIlIIIII[0] = (105 ^ 124) & ((113 ^ 100) ^ (-1));
        lIllIIIlIIIII[1] = " ".length();
    }

    private static boolean llIIIlIIlIlIIIl(int i) {
        return i == 0;
    }

    static {
        llIIIlIIlIIllll();
        llIIIlIIlIIlllI();
        N = new ArrayList();
    }

    private static boolean llIIIlIIlIlIIlI(Object obj) {
        return obj == null;
    }

    public static i x() {
        if (llIIIlIIlIlIIII(N.isEmpty() ? 1 : 0)) {
            return null;
        }
        return N.get(lIllIIIlIIIII[0]);
    }

    @Inject
    public l(SquireWoodcutterConfig squireWoodcutterConfig) {
        this.M = squireWoodcutterConfig;
    }

    private static boolean llIIIlIIlIlIlII(int i, int i2) {
        return i == i2;
    }

    private static String llIIIlIIlIIllIl(String llllllllllllllIllIIllIIIlIIIIlII, String llllllllllllllIllIIllIIIlIIIlIII) {
        String llllllllllllllIllIIllIIIlIIIIlII2 = new String(Base64.getDecoder().decode(llllllllllllllIllIIllIIIlIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIllIIIlIIIIlll = new StringBuilder();
        char[] llllllllllllllIllIIllIIIlIIIIllI = llllllllllllllIllIIllIIIlIIIlIII.toCharArray();
        int llllllllllllllIllIIllIIIlIIIIlIl = lIllIIIlIIIII[0];
        char[] charArray = llllllllllllllIllIIllIIIlIIIIlII2.toCharArray();
        int llllllllllllllIllIIllIIIIllllllI = charArray.length;
        int i = lIllIIIlIIIII[0];
        while (llIIIlIIlIlIlIl(i, llllllllllllllIllIIllIIIIllllllI)) {
            llllllllllllllIllIIllIIIlIIIIlll.append((char) (charArray[i] ^ llllllllllllllIllIIllIIIlIIIIllI[llllllllllllllIllIIllIIIlIIIIlIl % llllllllllllllIllIIllIIIlIIIIllI.length]));
            "".length();
            llllllllllllllIllIIllIIIlIIIIlIl++;
            i++;
            "".length();
            if ((113 ^ 117) <= ((250 ^ 182) & ((225 ^ 173) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIllIIIlIIIIlll);
    }

    private static boolean llIIIlIIlIlIIll(Object obj) {
        return obj != null;
    }

    private static boolean llIIIlIIlIlIlIl(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    public boolean run() {
        if (!llIIIlIIlIlIIII(this.M.fastTickChop() ? 1 : 0) || llIIIlIIlIlIIII(this.M.bank() ? 1 : 0)) {
            return lIllIIIlIIIII[0];
        }
        List all = TileObjects.getAll(tileObject -> {
            return tileObject.getName().contains(this.M.tree().r());
        });
        i iVar = llIIIlIIlIlIIIl(N.isEmpty() ? 1 : 0) ? N.get(lIllIIIlIIIII[0]) : null;
        if (llIIIlIIlIlIIlI(all) && llIIIlIIlIlIIll(iVar)) {
            Movement.setDestination(iVar.w().getNearest());
            return lIllIIIlIIIII[1];
        }
        String[] strArr = new String[lIllIIIlIIIII[1]];
        strArr[lIllIIIlIIIII[0]] = lIllIIIIlllll[lIllIIIlIIIII[0]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (llIIIlIIlIlIIlI(nearest)) {
            N.clear();
            return lIllIIIlIIIII[0];
        }
        for (i iVar2 : N) {
            if (!llIIIlIIlIlIIlI(TileObjects.getNearest(tileObject2 -> {
                if (llIIIlIIlIlIIII(tileObject2.getName().contains(this.M.tree().r()) ? 1 : 0) && llIIIlIIlIlIlII(tileObject2.getId(), iVar2.v())) {
                    ?? r0 = lIllIIIlIIIII[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
                return lIllIIIlIIIII[0];
            }))) {
                N.remove(iVar2);
                "".length();
                return lIllIIIlIIIII[0];
            }
            "".length();
            if ("  ".length() == " ".length()) {
                return ((119 ^ 22) ^ (82 ^ 112)) & (((((9 + 7) - (-132)) + 67) ^ (((97 + 110) - 77) + 18)) ^ (-" ".length()));
            }
        }
        i b = i.b(nearest);
        if (llIIIlIIlIlIIII(N.contains(b) ? 1 : 0)) {
            return lIllIIIlIIIII[0];
        }
        N.add(b);
        "".length();
        return lIllIIIlIIIII[1];
    }

    private static boolean llIIIlIIlIlIIII(int i) {
        return i != 0;
    }

    private static void llIIIlIIlIIlllI() {
        lIllIIIIlllll = new String[lIllIIIlIIIII[1]];
        lIllIIIIlllll[lIllIIIlIIIII[0]] = llIIIlIIlIIllIl("BhEtMUohFz05Gg==", "RcHTj");
    }
}
