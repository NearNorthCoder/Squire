package m.e.i.q.u.r.p000.n.s.e.r.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.Locations;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Leaving essence mine", priority = 10, blocking = true)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.o  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/o.class */
public class C0014o extends Task {
    private static /* synthetic */ int[] llllllIlllII;
    private static /* synthetic */ String[] llllllIllIll;
    @Inject
    private /* synthetic */ SquireMinerConfig f;

    private Interactable q() {
        String[] strArr = new String[llllllIlllII[2]];
        strArr[llllllIlllII[0]] = llllllIllIll[llllllIlllII[2]];
        TileObject nearest = TileObjects.getNearest(strArr);
        String[] strArr2 = new String[llllllIlllII[2]];
        strArr2[llllllIlllII[0]] = llllllIllIll[llllllIlllII[3]];
        NPC nearest2 = NPCs.getNearest(strArr2);
        if (lIIlIlIIllIllll(nearest2)) {
            return nearest;
        }
        if (lIIlIlIIllIllll(nearest)) {
            return nearest2;
        }
        if (lIIlIlIIlllIIII(nearest2.distanceTo(Players.getLocal()), nearest.distanceTo(Players.getLocal()))) {
            "".length();
            if (0 != 0) {
                return null;
            }
            return nearest2;
        }
        return nearest;
    }

    private static boolean lIIlIlIIlllIIII(int i, int i2) {
        return i < i2;
    }

    private static String lIIlIlIIllIlIIl(String lllllllllllllllIIlIIIlIlllIlllIl, String lllllllllllllllIIlIIIlIlllIlllII) {
        String lllllllllllllllIIlIIIlIlllIlllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIlllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIIlIlllIllIll = new StringBuilder();
        char[] charArray = lllllllllllllllIIlIIIlIlllIlllII.toCharArray();
        int lllllllllllllllIIlIIIlIlllIllIIl = llllllIlllII[0];
        char[] charArray2 = lllllllllllllllIIlIIIlIlllIlllIl2.toCharArray();
        int length = charArray2.length;
        int i = llllllIlllII[0];
        while (lIIlIlIIlllIIII(i, length)) {
            lllllllllllllllIIlIIIlIlllIllIll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIIlIIIlIlllIllIIl % charArray.length]));
            "".length();
            lllllllllllllllIIlIIIlIlllIllIIl++;
            i++;
            "".length();
            if ("   ".length() == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlIIIlIlllIllIll);
    }

    private static boolean lIIlIlIIllIllll(Object obj) {
        return obj == null;
    }

    private static void lIIlIlIIllIllII() {
        llllllIlllII = new int[6];
        llllllIlllII[0] = (102 ^ 92) & ((1 ^ 59) ^ (-1));
        llllllIlllII[1] = (-((-12303) & 29247)) & (-4097) & 32635;
        llllllIlllII[2] = " ".length();
        llllllIlllII[3] = "  ".length();
        llllllIlllII[4] = "   ".length();
        llllllIlllII[5] = (((77 + 26) - (-22)) + 28) ^ (((124 + 92) - 94) + 23);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    public boolean run() {
        if (!lIIlIlIIllIllIl(this.f.activity(), EnumC0000a.ESSENCE) && !lIIlIlIIllIlllI(Inventory.isFull() ? 1 : 0)) {
            Interactable q = q();
            if (!lIIlIlIIllIllll(q) && !lIIlIlIIllIlllI(Locations.isRegionLoaded(llllllIlllII[1]) ? 1 : 0)) {
                q.interact(llllllIllIll[llllllIlllII[0]]);
                return llllllIlllII[2];
            }
            return llllllIlllII[0];
        }
        return llllllIlllII[0];
    }

    private static boolean lIIlIlIIllIlllI(int i) {
        return i == 0;
    }

    private static String lIIlIlIIllIlIlI(String lllllllllllllllIIlIIIlIlllIIlIII, String lllllllllllllllIIlIIIlIlllIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIlllIIIlll.getBytes(StandardCharsets.UTF_8)), llllllIlllII[5]), "DES");
            Cipher lllllllllllllllIIlIIIlIlllIIlIlI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIlIlllIIlIlI.init(llllllIlllII[3], secretKeySpec);
            return new String(lllllllllllllllIIlIIIlIlllIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIlllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlIlllIIlIIl) {
            lllllllllllllllIIlIIIlIlllIIlIIl.printStackTrace();
            return null;
        }
    }

    private static void lIIlIlIIllIlIll() {
        llllllIllIll = new String[llllllIlllII[4]];
        llllllIllIll[llllllIlllII[0]] = lIIlIlIIllIlIIl("OSQG", "lWcpm");
        llllllIllIll[llllllIlllII[2]] = lIIlIlIIllIlIlI("qQGS4I56Ssk=", "aVkyJ");
        llllllIllIll[llllllIlllII[3]] = lIIlIlIIllIlIlI("jDPAN+2gcOg=", "BIDQk");
    }

    private static boolean lIIlIlIIllIllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        lIIlIlIIllIllII();
        lIIlIlIIllIlIll();
    }
}
