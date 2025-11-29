package k.p000.u.u.l.i.s.r.c.d.p001.q.u.e.u.e.e.s.s.l;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.duke.SquireDukeSucellus;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.client.Static;
@TaskDesc(name = "Attack Duke East", priority = 300, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.r  reason: invalid package and case insensitive filesystem */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/r.class */
public class C0017r extends Task {
    final /* synthetic */ SquireDukeSucellus aC;
    final /* synthetic */ C0000a aD;
    private static /* synthetic */ int[] lIllIlllllll;
    private static /* synthetic */ String[] lIllIllllllI;

    private static boolean lllIlIlIIlIllI(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean run() {
        int i;
        NPC nearest = NPCs.getNearest(npc -> {
            if (lllIlIlIIlIllI(npc.getName().equals(lIllIllllllI[lIllIlllllll[5]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIlllllll[1]];
                strArr[lIllIlllllll[0]] = lIllIllllllI[lIllIlllllll[3]];
                if (lllIlIlIIlIllI(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIlllllll[1];
                    "".length();
                    return ((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true)) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIlllllll[0];
        });
        if (lllIlIlIIlIlIl(nearest)) {
            return lIllIlllllll[0];
        }
        TileObject nearest2 = TileObjects.getNearest(tileObject -> {
            if (lllIlIlIIlIllI(tileObject.getName().equals(lIllIllllllI[lIllIlllllll[2]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIlllllll[1]];
                strArr[lIllIlllllll[0]] = lIllIllllllI[lIllIlllllll[4]];
                if (lllIlIlIIlIllI(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIlllllll[1];
                    "".length();
                    return 0 != 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIlllllll[0];
        });
        if (lllIlIlIIlIlIl(nearest2)) {
            return lIllIlllllll[0];
        }
        Player local = Players.getLocal();
        if (lllIlIlIIlIlIl(local)) {
            return lIllIlllllll[0];
        }
        if (!lllIlIlIIlIllI(C0004e.l(nearest2).contains(local) ? 1 : 0) || lllIlIlIIlIlll(C0004e.r(nearest2) ? 1 : 0)) {
            return lIllIlllllll[0];
        }
        this.aD.B();
        int tickCount = Static.getClient().getTickCount();
        this.aC.b((boolean) lIllIlllllll[1]);
        if (!lllIlIlIIllIII(tickCount - this.aD.D(), lIllIlllllll[2]) || !lllIlIlIIllIIl(tickCount - this.aD.C(), lIllIlllllll[3])) {
            Movement.setDestination(C0004e.o(nearest2));
            return lIllIlllllll[1];
        }
        Actor interacting = Players.getLocal().getInteracting();
        if (lllIlIlIIllIlI(interacting)) {
            String str = lIllIllllllI[lIllIlllllll[0]];
            if (lllIlIlIIlIllI(interacting.hasAction((v1) -> {
                return r1.equals(v1);
            }) ? 1 : 0)) {
                i = lIllIlllllll[1];
                "".length();
                if ((87 ^ 83) == "  ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
                if (lllIlIlIIlIllI(i)) {
                    nearest.interact(lIllIllllllI[lIllIlllllll[1]]);
                    return lIllIlllllll[1];
                }
                return lIllIlllllll[1];
            }
        }
        i = lIllIlllllll[0];
        if (lllIlIlIIlIllI(i)) {
        }
    }

    private static boolean lllIlIlIIllIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lllIlIlIIlIlIl(Object obj) {
        return obj == null;
    }

    private static void lllIlIlIIlIlII() {
        lIllIlllllll = new int[8];
        lIllIlllllll[0] = ((169 ^ 193) ^ (81 ^ 104)) & (((162 ^ 192) ^ (33 ^ 18)) ^ (-" ".length()));
        lIllIlllllll[1] = " ".length();
        lIllIlllllll[2] = "  ".length();
        lIllIlllllll[3] = 69 ^ 64;
        lIllIlllllll[4] = "   ".length();
        lIllIlllllll[5] = 75 ^ 79;
        lIllIlllllll[6] = (2 ^ 45) ^ (85 ^ 124);
        lIllIlllllll[7] = 67 ^ 75;
    }

    private static boolean lllIlIlIIllIIl(int i, int i2) {
        return i != i2;
    }

    @Inject
    public C0017r(SquireDukeSucellus squireDukeSucellus) {
        this.aC = squireDukeSucellus;
        this.aD = squireDukeSucellus.s();
    }

    private static String lllIlIlIIlIIlI(String lllllllllllllllIlIlllIIlIlIIIllI, String lllllllllllllllIlIlllIIlIlIIIlIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlIlIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllIIlIlIIIlII = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllIIlIlIIIlIl.toCharArray();
        int lllllllllllllllIlIlllIIlIlIIIIlI = lIllIlllllll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIlllllll[0];
        while (lllIlIlIIllIll(i, length)) {
            lllllllllllllllIlIlllIIlIlIIIlII.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIlllIIlIlIIIIlI % charArray.length]));
            "".length();
            lllllllllllllllIlIlllIIlIlIIIIlI++;
            i++;
            "".length();
            if ((-((((19 + 122) - 23) + 18) ^ (((105 + 52) - 61) + 44))) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllIIlIlIIIlII);
    }

    private static String lllIlIlIIIllIl(String lllllllllllllllIlIlllIIlIIllIIIl, String lllllllllllllllIlIlllIIlIIllIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlllIIlIIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllIIlIIllIIII.getBytes(StandardCharsets.UTF_8)), lIllIlllllll[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlllllll[2], lllllllllllllllIlIlllIIlIIllIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllIIlIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllIIlIIllIIlI) {
            lllllllllllllllIlIlllIIlIIllIIlI.printStackTrace();
            return null;
        }
    }

    static {
        lllIlIlIIlIlII();
        lllIlIlIIlIIll();
    }

    private static boolean lllIlIlIIllIlI(Object obj) {
        return obj != null;
    }

    private static boolean lllIlIlIIlIlll(int i) {
        return i == 0;
    }

    private static boolean lllIlIlIIllIll(int i, int i2) {
        return i < i2;
    }

    private static void lllIlIlIIlIIll() {
        lIllIllllllI = new String[lIllIlllllll[6]];
        lIllIllllllI[lIllIlllllll[0]] = lllIlIlIIIllIl("hbnZ54ogQSc=", "KIelQ");
        lIllIllllllI[lIllIlllllll[1]] = lllIlIlIIIllIl("PvEXATWZ9QA=", "gtNhG");
        lIllIllllllI[lIllIlllllll[2]] = lllIlIlIIIllIl("/DiKW46NxFY=", "OiRpS");
        lIllIllllllI[lIllIlllllll[4]] = lllIlIlIIIllIl("ua1KSP8HsoqKA+7g8kObCA==", "xnBbm");
        lIllIllllllI[lIllIlllllll[5]] = lllIlIlIIlIIlI("BSwqF2MSLCIXLy0sMg==", "AYArC");
        lIllIllllllI[lIllIlllllll[3]] = lllIlIlIIlIIlI("JwIzKCoN", "fvGII");
    }
}
