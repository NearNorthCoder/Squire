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
@TaskDesc(name = "Attack Duke West", priority = 300, blocking = true)
/* renamed from: k.-.u.u.l.i.s.r.c.d.-.q.u.e.u.e.e.s.s.l.s  reason: invalid package */
/* loaded from: 2266a50d-0893-46c4-a132-50718fc51d1a.jar:k/-/u/u/l/i/s/r/c/d/-/q/u/e/u/e/e/s/s/l/s.class */
public class s extends Task {
    private static /* synthetic */ String[] lIllIlIIlllI;
    final /* synthetic */ C0000a aF;
    private static /* synthetic */ int[] lIllIlIIllll;
    final /* synthetic */ SquireDukeSucellus aE;

    private static String lllIIlllIllIll(String lllllllllllllllIlIlllllIIlIIllIl, String lllllllllllllllIlIlllllIIlIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIIlIIllII.getBytes(StandardCharsets.UTF_8)), lIllIlIIllll[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIlIIllll[1], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllllIIlIIlllI) {
            lllllllllllllllIlIlllllIIlIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIllllIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIlllIlllll(int i) {
        return i != 0;
    }

    private static String lllIIlllIllIIl(String lllllllllllllllIlIlllllIIlIllIlI, String lllllllllllllllIlIlllllIIlIllIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlllllIIlIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlllllIIlIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlllllIIlIlllII.init(lIllIlIIllll[1], secretKeySpec);
            return new String(lllllllllllllllIlIlllllIIlIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlllllIIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIlllllIIlIllIll) {
            lllllllllllllllIlIlllllIIlIllIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIlllIllllI(Object obj) {
        return obj == null;
    }

    private static boolean lllIIllllIIIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean lllIIllllIIIll(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0127  */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean run() {
        int i;
        NPC nearest = NPCs.getNearest(npc -> {
            if (lllIIlllIlllll(npc.getName().equals(lIllIlIIlllI[lIllIlIIllll[5]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIlIIllll[3]];
                strArr[lIllIlIIllll[0]] = lIllIlIIlllI[lIllIlIIllll[2]];
                if (lllIIlllIlllll(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIlIIllll[3];
                    "".length();
                    return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIlIIllll[0];
        });
        if (lllIIlllIllllI(nearest)) {
            return lIllIlIIllll[0];
        }
        TileObject nearest2 = TileObjects.getNearest(tileObject -> {
            if (lllIIlllIlllll(tileObject.getName().equals(lIllIlIIlllI[lIllIlIIllll[1]]) ? 1 : 0)) {
                String[] strArr = new String[lIllIlIIllll[3]];
                strArr[lIllIlIIllll[0]] = lIllIlIIlllI[lIllIlIIllll[4]];
                if (lllIIlllIlllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIllIlIIllll[3];
                    "".length();
                    return ((66 ^ 70) & ((52 ^ 48) ^ (-1))) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIllIlIIllll[0];
        });
        if (lllIIlllIllllI(nearest2)) {
            return lIllIlIIllll[0];
        }
        Player local = Players.getLocal();
        if (lllIIlllIllllI(local)) {
            return lIllIlIIllll[0];
        }
        if (!lllIIlllIlllll(C0004e.l(nearest2).contains(local) ? 1 : 0) || lllIIllllIIIII(C0004e.q(nearest2) ? 1 : 0)) {
            return lIllIlIIllll[0];
        }
        int tickCount = Static.getClient().getTickCount();
        this.aE.b((boolean) lIllIlIIllll[0]);
        if (!lllIIllllIIIIl(tickCount - this.aF.D(), lIllIlIIllll[1]) || !lllIIllllIIIlI(tickCount - this.aF.C(), lIllIlIIllll[2])) {
            Movement.setDestination(C0004e.m(nearest2));
            return lIllIlIIllll[3];
        }
        Actor interacting = Players.getLocal().getInteracting();
        if (lllIIllllIIIll(interacting)) {
            String str = lIllIlIIlllI[lIllIlIIllll[0]];
            if (lllIIlllIlllll(interacting.hasAction((v1) -> {
                return r1.equals(v1);
            }) ? 1 : 0)) {
                i = lIllIlIIllll[3];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((91 ^ 70) ^ (48 ^ 33)) & (((((111 + 55) - 148) + 137) ^ (((86 + 111) - 129) + 83)) ^ (-" ".length()));
                }
                if (lllIIlllIlllll(i)) {
                    nearest.interact(lIllIlIIlllI[lIllIlIIllll[3]]);
                    return lIllIlIIllll[3];
                }
                return lIllIlIIllll[3];
            }
        }
        i = lIllIlIIllll[0];
        if (lllIIlllIlllll(i)) {
        }
    }

    private static boolean lllIIllllIIIII(int i) {
        return i == 0;
    }

    @Inject
    public s(SquireDukeSucellus squireDukeSucellus) {
        this.aE = squireDukeSucellus;
        this.aF = squireDukeSucellus.s();
    }

    private static void lllIIlllIlllII() {
        lIllIlIIlllI = new String[lIllIlIIllll[6]];
        lIllIlIIlllI[lIllIlIIllll[0]] = lllIIlllIllIIl("3cSKh6jOeGo=", "pafRa");
        lIllIlIIlllI[lIllIlIIllll[3]] = lllIIlllIllIlI("KhwQEBoA", "khdqy");
        lIllIlIIlllI[lIllIlIIllll[1]] = lllIIlllIllIlI("FhIHAQ==", "Qssdz");
        lIllIlIIlllI[lIllIlIIllll[4]] = lllIIlllIllIIl("GxeEvIP97/Vu2W2FkD3fzw==", "FCxYe");
        lIllIlIIlllI[lIllIlIIllll[5]] = lllIIlllIllIll("FD38bAdfl3DornmKxW9PPg==", "reZtP");
        lIllIlIIlllI[lIllIlIIllll[2]] = lllIIlllIllIlI("AgIVCjAo", "CvakS");
    }

    private static boolean lllIIllllIIIIl(int i, int i2) {
        return i > i2;
    }

    private static String lllIIlllIllIlI(String lllllllllllllllIlIlllllIIllIllll, String lllllllllllllllIlIlllllIIllIlllI) {
        String lllllllllllllllIlIlllllIIllIllll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIlllllIIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlllllIIllIllIl = new StringBuilder();
        char[] charArray = lllllllllllllllIlIlllllIIllIlllI.toCharArray();
        int lllllllllllllllIlIlllllIIllIlIll = lIllIlIIllll[0];
        char[] charArray2 = lllllllllllllllIlIlllllIIllIllll2.toCharArray();
        int length = charArray2.length;
        int i = lIllIlIIllll[0];
        while (lllIIllllIIlII(i, length)) {
            char lllllllllllllllIlIlllllIIlllIIII = charArray2[i];
            lllllllllllllllIlIlllllIIllIllIl.append((char) (lllllllllllllllIlIlllllIIlllIIII ^ charArray[lllllllllllllllIlIlllllIIllIlIll % charArray.length]));
            "".length();
            lllllllllllllllIlIlllllIIllIlIll++;
            i++;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIlllllIIllIllIl);
    }

    static {
        lllIIlllIlllIl();
        lllIIlllIlllII();
    }

    private static void lllIIlllIlllIl() {
        lIllIlIIllll = new int[8];
        lIllIlIIllll[0] = (42 ^ 52) & ((143 ^ 145) ^ (-1));
        lIllIlIIllll[1] = "  ".length();
        lIllIlIIllll[2] = (((166 + 95) - 259) + 193) ^ (((100 + 70) - 151) + 179);
        lIllIlIIllll[3] = " ".length();
        lIllIlIIllll[4] = "   ".length();
        lIllIlIIllll[5] = (50 ^ 127) ^ (228 ^ 173);
        lIllIlIIllll[6] = (((63 + 116) - 60) + 41) ^ (((132 + 151) - 184) + 67);
        lIllIlIIllll[7] = 46 ^ 38;
    }
}
