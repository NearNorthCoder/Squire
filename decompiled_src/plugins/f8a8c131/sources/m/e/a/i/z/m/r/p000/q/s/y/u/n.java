package m.e.a.i.z.m.r.p000.q.s.y.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zammy.SquireZammy;
import gg.squire.zammy.SquireZammyConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
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
/* renamed from: m.e.a.i.z.m.r.-.q.s.y.u.n  reason: invalid package */
/* loaded from: f8a8c131-0c60-4150-a875-6d5d0cb07058.jar:m/e/a/i/z/m/r/-/q/s/y/u/n.class */
public class n extends Task {
    private static /* synthetic */ String[] lIllIIlIlllll;
    private final /* synthetic */ l J;
    private final /* synthetic */ SquireZammy L;
    private final /* synthetic */ SquireZammyConfig K;
    private static /* synthetic */ int[] lIllIIllIIIII;

    private static String llIIIllIIllIIlI(String llllllllllllllIllIIlIIlIllIlllll, String llllllllllllllIllIIlIIlIllIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlIIlIllIllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIllIIIII[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlIIlIllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlIIlIlllIIIII) {
            llllllllllllllIllIIlIIlIlllIIIII.printStackTrace();
            return null;
        }
    }

    @Inject
    public n(l lVar, SquireZammyConfig squireZammyConfig, SquireZammy squireZammy) {
        this.J = lVar;
        this.K = squireZammyConfig;
        this.L = squireZammy;
    }

    private static boolean llIIIllIIllIlll(int i) {
        return i != 0;
    }

    private void M() {
        if (!llIIIllIIllIlll(this.K.altarTeleport() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                String[] strArr = new String[lIllIIllIIIII[0]];
                strArr[lIllIIllIIIII[1]] = lIllIIlIlllll[lIllIIllIIIII[5]];
                return item.hasAction(strArr);
            });
            if (llIIIllIIlllIIl(first)) {
                return;
            }
            first.interact(lIllIIlIlllll[lIllIIllIIIII[4]]);
            return;
        }
        String[] strArr = new String[lIllIIllIIIII[0]];
        strArr[lIllIIllIIIII[1]] = lIllIIlIlllll[lIllIIllIIIII[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (llIIIllIIlllIIl(nearest)) {
            Magic.cast(SpellBook.Standard.TELEPORT_TO_HOUSE);
            return;
        }
        nearest.interact(lIllIIlIlllll[lIllIIllIIIII[0]]);
        "".length();
        if ((((((115 + 44) - 84) + 120) ^ (((74 + 73) - 29) + 12)) & (((221 ^ 171) ^ (142 ^ 185)) ^ (-" ".length()))) != 0) {
        }
    }

    private static boolean llIIIllIIlllIIl(Object obj) {
        return obj == null;
    }

    static {
        llIIIllIIllIlIl();
        llIIIllIIllIlII();
    }

    private static boolean llIIIllIIllIllI(int i) {
        return i == 0;
    }

    private static void llIIIllIIllIlIl() {
        lIllIIllIIIII = new int[9];
        lIllIIllIIIII[0] = " ".length();
        lIllIIllIIIII[1] = (((68 ^ 2) & ((92 ^ 26) ^ (-1))) ^ (149 ^ 191)) & (((134 ^ 149) ^ (184 ^ 129)) ^ (-" ".length()));
        lIllIIllIIIII[2] = 136 ^ 160;
        lIllIIllIIIII[3] = (61 ^ 33) ^ (132 ^ 143);
        lIllIIllIIIII[4] = "  ".length();
        lIllIIllIIIII[5] = "   ".length();
        lIllIIllIIIII[6] = (226 ^ 144) ^ (55 ^ 65);
        lIllIIllIIIII[7] = (36 ^ 43) ^ (56 ^ 50);
        lIllIIllIIIII[8] = 137 ^ 143;
    }

    private static void llIIIllIIllIlII() {
        lIllIIlIlllll = new String[lIllIIllIIIII[8]];
        lIllIIlIlllll[lIllIIllIIIII[1]] = llIIIllIIllIIlI("ln3uN+z6xEFNJmnZwT/z0w==", "TiXyA");
        lIllIIlIlllll[lIllIIllIIIII[0]] = llIIIllIIllIIlI("TNm7zgwg/fYN+82TKVrZpA==", "UFHlV");
        lIllIIlIlllll[lIllIIllIIIII[4]] = llIIIllIIllIIll("ICIEBxM=", "bPafx");
        lIllIIlIlllll[lIllIIllIIIII[5]] = llIIIllIIllIIll("FBAsCDo=", "VbIiQ");
        lIllIIlIlllll[lIllIIllIIIII[6]] = llIIIllIIllIIll("Dhck", "KvPqQ");
        lIllIIlIlllll[lIllIIllIIIII[7]] = llIIIllIIllIIlI("Pe0xQXBH9w0=", "WqwjB");
    }

    private static String llIIIllIIllIIll(String llllllllllllllIllIIlIIlIllIIllll, String llllllllllllllIllIIlIIlIllIIlllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlIIlIllIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlIIlIllIIllIl = new StringBuilder();
        char[] llllllllllllllIllIIlIIlIllIIllII = llllllllllllllIllIIlIIlIllIIlllI.toCharArray();
        int llllllllllllllIllIIlIIlIllIIlIll = lIllIIllIIIII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIllIIllIIIII[1];
        while (llIIIllIIlllIII(i, length)) {
            llllllllllllllIllIIlIIlIllIIllIl.append((char) (charArray[i] ^ llllllllllllllIllIIlIIlIllIIllII[llllllllllllllIllIIlIIlIllIIlIll % llllllllllllllIllIIlIIlIllIIllII.length]));
            "".length();
            llllllllllllllIllIIlIIlIllIIlIll++;
            i++;
            "".length();
            if (((223 ^ 158) & ((51 ^ 114) ^ (-1))) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlIIlIllIIllIl);
    }

    private static boolean llIIIllIIlllIII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    public boolean run() {
        int i;
        if (llIIIllIIllIllI(Inventory.contains(item -> {
            return item.getName().startsWith(lIllIIlIlllll[lIllIIllIIIII[7]]);
        }) ? 1 : 0)) {
            i = lIllIIllIIIII[0];
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            i = lIllIIllIIIII[1];
        }
        int i2 = i;
        if (llIIIllIIllIllI(Inventory.contains(item2 -> {
            String str = lIllIIlIlllll[lIllIIllIIIII[6]];
            return item2.hasAction((v1) -> {
                return r1.equals(v1);
            });
        }) ? 1 : 0)) {
            if (llIIIllIIllIlll(this.J.A() ? 1 : 0) && llIIIllIIlllIII(Combat.getCurrentHealth(), lIllIIllIIIII[2])) {
                i2 = lIllIIllIIIII[0];
                "".length();
                if ((20 ^ 16) == " ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else if (llIIIllIIllIllI(this.J.A() ? 1 : 0) && llIIIllIIlllIII(Combat.getCurrentHealth(), lIllIIllIIIII[3])) {
                i2 = lIllIIllIIIII[0];
            }
        }
        if (llIIIllIIllIlll(i2)) {
            if (llIIIllIIllIllI(this.J.B() ? 1 : 0)) {
                this.L.forceStop();
                "".length();
                if ((((71 ^ 93) ^ (121 ^ 50)) & (((47 ^ 33) ^ (87 ^ 8)) ^ (-" ".length()))) != (((80 ^ 19) ^ (119 ^ 38)) & (((((147 + 45) - 86) + 49) ^ (((129 + 23) - 20) + 5)) ^ (-" ".length())))) {
                    return ((((8 + 73) - (-23)) + 148) ^ (((60 + 12) - (-67)) + 30)) & (((((98 + 71) - 49) + 91) ^ (((118 + 72) - 184) + 128)) ^ (-" ".length()));
                }
            } else {
                M();
            }
            return lIllIIllIIIII[0];
        }
        return lIllIIllIIIII[1];
    }
}
