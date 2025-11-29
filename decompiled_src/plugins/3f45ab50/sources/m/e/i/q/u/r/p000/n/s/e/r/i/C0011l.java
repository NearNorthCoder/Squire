package m.e.i.q.u.r.p000.n.s.e.r.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mining.SquireMinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Mining bone shards", priority = 5)
/* renamed from: m.e.i.q.u.r.-.n.s.e.r.i.l  reason: invalid package and case insensitive filesystem */
/* loaded from: 3f45ab50-7de6-493f-a8bc-b432dabdf252.jar:m/e/i/q/u/r/-/n/s/e/r/i/l.class */
public class C0011l extends Task {
    @Inject
    private /* synthetic */ SquireMinerConfig f;
    private static /* synthetic */ String[] lllllllIIIII;
    private static /* synthetic */ int[] lllllllIIIIl;

    private static boolean lIIlIlIIlllllIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIIlIlIIllllIll() {
        lllllllIIIII = new String[lllllllIIIIl[4]];
        lllllllIIIII[lllllllIIIIl[0]] = lIIlIlIIllllIIl("jUEk0u99nlXgyR8Qya/o5kNdfYGAUlWb", "zAKNp");
        lllllllIIIII[lllllllIIIIl[2]] = lIIlIlIIllllIIl("8YMp+3mmODk=", "hxnXC");
        lllllllIIIII[lllllllIIIIl[3]] = lIIlIlIIllllIIl("ZTQIxyBdpI4Ac0PSmFT3qg==", "XjWFw");
        lllllllIIIII[lllllllIIIIl[1]] = lIIlIlIIllllIlI("bbSS7w306qQ=", "HZvVt");
    }

    private static void lIIlIlIIlllllII() {
        lllllllIIIIl = new int[6];
        lllllllIIIIl[0] = (68 ^ 121) & ((249 ^ 196) ^ (-1));
        lllllllIIIIl[1] = "   ".length();
        lllllllIIIIl[2] = " ".length();
        lllllllIIIIl[3] = "  ".length();
        lllllllIIIIl[4] = 115 ^ 119;
        lllllllIIIIl[5] = 123 ^ 115;
    }

    private static String lIIlIlIIllllIlI(String lllllllllllllllIIlIIIlIllIIIllII, String lllllllllllllllIIlIIIlIllIIIlIll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIIlIllIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIllIIIlIll.getBytes(StandardCharsets.UTF_8)), lllllllIIIIl[5]), "DES");
            Cipher lllllllllllllllIIlIIIlIllIIIlllI = Cipher.getInstance("DES");
            lllllllllllllllIIlIIIlIllIIIlllI.init(lllllllIIIIl[3], lllllllllllllllIIlIIIlIllIIIllll);
            return new String(lllllllllllllllIIlIIIlIllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlIllIIIllIl) {
            lllllllllllllllIIlIIIlIllIIIllIl.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIIllllIIl(String lllllllllllllllIIlIIIlIllIIllIIl, String lllllllllllllllIIlIIIlIllIIllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIIlIllIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lllllllIIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIIlIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIIIlIllIIllIlI) {
            lllllllllllllllIIlIIIlIllIIllIlI.printStackTrace();
            return null;
        }
    }

    static {
        lIIlIlIIlllllII();
        lIIlIlIIllllIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    public boolean run() {
        if (lIIlIlIIlllllIl(this.f.activity(), EnumC0000a.BONE_SHARDS)) {
            return lllllllIIIIl[0];
        }
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIIlIlIIlllllll(lllllllIIIII[lllllllIIIIl[3]].equalsIgnoreCase(tileObject.getName()) ? 1 : 0)) {
                String[] strArr = new String[lllllllIIIIl[2]];
                strArr[lllllllIIIIl[0]] = lllllllIIIII[lllllllIIIIl[1]];
                if (lIIlIlIIlllllll(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lllllllIIIIl[2];
                    "".length();
                    return ((89 ^ 51) ^ (101 ^ 11)) < 0 ? ((145 ^ 194) ^ (96 ^ 38)) & (((((18 + 125) - 31) + 51) ^ (((158 + 116) - 221) + 129)) ^ (-" ".length())) : r0;
                }
            }
            return lllllllIIIIl[0];
        });
        if (lIIlIlIIllllllI(nearest)) {
            return lllllllIIIIl[0];
        }
        if (lIIlIlIIlllllll(Players.getLocal().isAnimating() ? 1 : 0)) {
            sleep(lllllllIIIIl[1]);
            return lllllllIIIIl[2];
        } else if (!lIIlIlIIlllllll(Inventory.isFull() ? 1 : 0)) {
            nearest.interact(lllllllIIIII[lllllllIIIIl[2]]);
            return lllllllIIIIl[2];
        } else {
            String[] strArr = new String[lllllllIIIIl[2]];
            strArr[lllllllIIIIl[0]] = lllllllIIIII[lllllllIIIIl[0]];
            Inventory.dropAll(strArr);
            "".length();
            return lllllllIIIIl[2];
        }
    }

    private static boolean lIIlIlIIllllllI(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlIIlllllll(int i) {
        return i != 0;
    }
}
