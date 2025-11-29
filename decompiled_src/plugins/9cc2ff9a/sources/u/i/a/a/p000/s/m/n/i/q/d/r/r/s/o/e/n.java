package u.i.a.a.p000.s.m.n.i.q.d.r.r.s.o.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.saradomin.SquireSaraConfig;
import gg.squire.saradomin.SquireSaradomin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Teleporting out", priority = 100, blocking = true)
/* renamed from: u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.n  reason: invalid package */
/* loaded from: 9cc2ff9a-834c-471c-85e9-f55eb9ce18c7.jar:u/i/a/a/-/s/m/n/i/q/d/r/r/s/o/e/n.class */
public class n extends Task {
    private static /* synthetic */ String[] lIIlIIllIIIII;
    private final /* synthetic */ C0006g K;
    private final /* synthetic */ SquireSaradomin M;
    private final /* synthetic */ SquireSaraConfig L;
    private static /* synthetic */ int[] lIIlIIllIIIIl;

    private void R() {
        if (!lIlIlIlIIIlIIlI(this.L.altarTeleport() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                String[] strArr = new String[lIIlIIllIIIIl[0]];
                strArr[lIIlIIllIIIIl[1]] = lIIlIIllIIIII[lIIlIIllIIIIl[4]];
                return item.hasAction(strArr);
            });
            if (lIlIlIlIIIlIlII(first)) {
                Magic.cast(SpellBook.Standard.TELEPORT_TO_HOUSE);
                return;
            } else {
                first.interact(lIIlIIllIIIII[lIIlIIllIIIIl[3]]);
                return;
            }
        }
        String[] strArr = new String[lIIlIIllIIIIl[0]];
        strArr[lIIlIIllIIIIl[1]] = lIIlIIllIIIII[lIIlIIllIIIIl[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIlIlIlIIIlIlII(nearest)) {
            Magic.cast(SpellBook.Standard.TELEPORT_TO_HOUSE);
            return;
        }
        nearest.interact(lIIlIIllIIIII[lIIlIIllIIIIl[0]]);
        "".length();
        if ((((230 ^ 169) ^ (2 ^ 92)) & (((((160 + 14) - 61) + 48) ^ (((99 + 22) - (-20)) + 35)) ^ (-" ".length()))) < 0) {
        }
    }

    private static boolean lIlIlIlIIIlIIll(int i, int i2) {
        return i < i2;
    }

    private static String lIlIlIlIIIIllIl(String llllllllllllllIlllllIlIIIllIIlII, String llllllllllllllIlllllIlIIIllIIIll) {
        try {
            SecretKeySpec llllllllllllllIlllllIlIIIllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIlIIIllIIIll.getBytes(StandardCharsets.UTF_8)), lIIlIIllIIIIl[8]), "DES");
            Cipher llllllllllllllIlllllIlIIIllIIllI = Cipher.getInstance("DES");
            llllllllllllllIlllllIlIIIllIIllI.init(lIIlIIllIIIIl[3], llllllllllllllIlllllIlIIIllIIlll);
            return new String(llllllllllllllIlllllIlIIIllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIlIIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllllIlIIIllIIlIl) {
            llllllllllllllIlllllIlIIIllIIlIl.printStackTrace();
            return null;
        }
    }

    private static void lIlIlIlIIIlIIII() {
        lIIlIIllIIIIl = new int[9];
        lIIlIIllIIIIl[0] = " ".length();
        lIIlIIllIIIIl[1] = ((((10 + 58) - (-27)) + 41) ^ (((36 + 134) - 43) + 22)) & (((76 ^ 1) ^ (116 ^ 36)) ^ (-" ".length()));
        lIIlIIllIIIIl[2] = 156 ^ 139;
        lIIlIIllIIIIl[3] = "  ".length();
        lIIlIIllIIIIl[4] = "   ".length();
        lIIlIIllIIIIl[5] = (153 ^ 191) ^ (127 ^ 93);
        lIIlIIllIIIIl[6] = 26 ^ 31;
        lIIlIIllIIIIl[7] = 3 ^ 5;
        lIIlIIllIIIIl[8] = (((60 + 123) - 47) + 66) ^ (((143 + 9) - 47) + 89);
    }

    @Inject
    public n(C0006g c0006g, SquireSaraConfig squireSaraConfig, SquireSaradomin squireSaradomin) {
        this.K = c0006g;
        this.L = squireSaraConfig;
        this.M = squireSaradomin;
    }

    private static String lIlIlIlIIIIlllI(String llllllllllllllIlllllIlIIIlIlIlII, String llllllllllllllIlllllIlIIIlIlIIll) {
        String llllllllllllllIlllllIlIIIlIlIlII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllllIlIIIlIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllIlIIIlIlIIlI = new StringBuilder();
        char[] charArray = llllllllllllllIlllllIlIIIlIlIIll.toCharArray();
        int llllllllllllllIlllllIlIIIlIlIIII = lIIlIIllIIIIl[1];
        char[] charArray2 = llllllllllllllIlllllIlIIIlIlIlII2.toCharArray();
        int length = charArray2.length;
        int i = lIIlIIllIIIIl[1];
        while (lIlIlIlIIIlIIll(i, length)) {
            llllllllllllllIlllllIlIIIlIlIIlI.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllllIlIIIlIlIIII % charArray.length]));
            "".length();
            llllllllllllllIlllllIlIIIlIlIIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllllIlIIIlIlIIlI);
    }

    private static boolean lIlIlIlIIIlIIlI(int i) {
        return i != 0;
    }

    private static boolean lIlIlIlIIIlIIIl(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    public boolean run() {
        int i;
        if (lIlIlIlIIIlIIIl(Inventory.contains(item -> {
            return item.getName().startsWith(lIIlIIllIIIII[lIIlIIllIIIIl[6]]);
        }) ? 1 : 0)) {
            i = lIIlIIllIIIIl[0];
            "".length();
            if ((-"  ".length()) >= 0) {
                return ((208 ^ 145) ^ (200 ^ 194)) & (((103 ^ 68) ^ (6 ^ 110)) ^ (-" ".length()));
            }
        } else {
            i = lIIlIIllIIIIl[1];
        }
        int i2 = i;
        if (lIlIlIlIIIlIIIl(Inventory.contains(item2 -> {
            String str = lIIlIIllIIIII[lIIlIIllIIIIl[5]];
            return item2.hasAction((v1) -> {
                return r1.equals(v1);
            });
        }) ? 1 : 0)) {
            if (lIlIlIlIIIlIIlI(this.K.l() ? 1 : 0) && lIlIlIlIIIlIIll(Combat.getCurrentHealth(), this.L.eatFoodAt())) {
                i2 = lIIlIIllIIIIl[0];
                "".length();
                if ("  ".length() == ((12 ^ 38) ^ (42 ^ 4))) {
                    return ((129 ^ 187) ^ (68 ^ 102)) & (((((207 + 161) - 221) + 74) ^ (((112 + 183) - 209) + 111)) ^ (-" ".length()));
                }
            } else if (lIlIlIlIIIlIIIl(this.K.l() ? 1 : 0) && lIlIlIlIIIlIIll(Combat.getCurrentHealth(), lIIlIIllIIIIl[2])) {
                i2 = lIIlIIllIIIIl[0];
            }
        }
        if (lIlIlIlIIIlIIlI(i2)) {
            if (lIlIlIlIIIlIIIl(this.K.m() ? 1 : 0)) {
                this.M.a((boolean) lIIlIIllIIIIl[0]);
                return lIIlIIllIIIIl[1];
            }
            R();
            this.M.a((boolean) lIIlIIllIIIIl[0]);
            return lIIlIIllIIIIl[0];
        }
        return lIIlIIllIIIIl[1];
    }

    private static void lIlIlIlIIIIllll() {
        lIIlIIllIIIII = new String[lIIlIIllIIIIl[7]];
        lIIlIIllIIIII[lIIlIIllIIIIl[1]] = lIlIlIlIIIIllIl("qWptD5GUcSF7H3jKSFlq0w==", "lbNdH");
        lIIlIIllIIIII[lIIlIIllIIIIl[0]] = lIlIlIlIIIIllIl("qSULU1KutlyskQrQ3JQmkw==", "xPeFx");
        lIIlIIllIIIII[lIIlIIllIIIIl[3]] = lIlIlIlIIIIllIl("/MYPfmfeAp0=", "wniGz");
        lIIlIIllIIIII[lIIlIIllIIIIl[4]] = lIlIlIlIIIIlllI("DRMNOw0=", "OahZf");
        lIIlIIllIIIII[lIIlIIllIIIIl[5]] = lIlIlIlIIIIlllI("JxU5", "btMTg");
        lIIlIIllIIIII[lIIlIIllIIIIl[6]] = lIlIlIlIIIIlllI("ECMPHxstNg==", "CWnrr");
    }

    static {
        lIlIlIlIIIlIIII();
        lIlIlIlIIIIllll();
    }

    private static boolean lIlIlIlIIIlIlII(Object obj) {
        return obj == null;
    }
}
