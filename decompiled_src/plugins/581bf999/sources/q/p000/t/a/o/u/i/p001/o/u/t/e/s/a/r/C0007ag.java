package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Prayers;
@TaskDesc(name = "Drinking prayer", priority = 85)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ag  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ag.class */
public class C0007ag extends Z {
    private final /* synthetic */ C cK;
    private static /* synthetic */ String[] lIllllllllI;
    private static /* synthetic */ int[] llIIIIIIIII;

    private static boolean lIIlllIIIIIlII(int i) {
        return i != 0;
    }

    @Inject
    protected C0007ag(Client client, C c) {
        super(client);
        this.cK = c;
    }

    private static boolean lIIlllIIIIlIII(int i) {
        return i == 0;
    }

    static {
        lIIlllIIIIIIll();
        lIIlllIIIIIIlI();
    }

    private static String lIIlllIIIIIIIl(String llllllllllllllllIlIIlIIIlIIlllII, String llllllllllllllllIlIIlIIIlIIllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIIlIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlIIIlIIllllI = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlIIIlIIllllI.init(llIIIIIIIII[3], secretKeySpec);
            return new String(llllllllllllllllIlIIlIIIlIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIIIlIIllIII) {
            llllllllllllllllIlIIlIIIlIIllIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    public boolean run() {
        int i;
        if (lIIlllIIIIIlII(aq() ? 1 : 0)) {
            i = llIIIIIIIII[0];
            "".length();
            if ((-" ".length()) >= 0) {
                return ((((171 + 118) - 154) + 38) ^ (((9 + 48) - 48) + 123)) & (((((49 + 20) - 67) + 184) ^ (((113 + 114) - 196) + 116)) ^ (-" ".length()));
            }
        } else {
            i = llIIIIIIIII[1];
        }
        if (lIIlllIIIIIlIl(Prayers.getPoints(), i)) {
            return llIIIIIIIII[1];
        }
        Item first = Inventory.getFirst(item -> {
            if (lIIlllIIIIlIII(EnumC0056e.TEARS_OF_ELIDINIS.d(item.getId()) ? 1 : 0) && lIIlllIIIIlIII(item.getName().contains(lIllllllllI[llIIIIIIIII[2]]) ? 1 : 0) && lIIlllIIIIlIII(item.getName().contains(lIllllllllI[llIIIIIIIII[3]]) ? 1 : 0) && !lIIlllIIIIIlII(item.getName().contains(lIllllllllI[llIIIIIIIII[4]]) ? 1 : 0)) {
                return llIIIIIIIII[1];
            }
            ?? r0 = llIIIIIIIII[2];
            "".length();
            return 0 != 0 ? ((((18 + 124) - 5) + 1) ^ (((146 + 13) - 115) + 146)) & (((62 ^ 72) ^ (109 ^ 47)) ^ (-" ".length())) : r0;
        });
        if (lIIlllIIIIIlll(first) && lIIlllIIIIIlII(this.cK.am() ? 1 : 0)) {
            first.interact(lIllllllllI[llIIIIIIIII[1]]);
            this.cK.ao();
            return llIIIIIIIII[2];
        }
        return llIIIIIIIII[1];
    }

    private static String lIIlllIIIIIIII(String llllllllllllllllIlIIlIIIlIIIllll, String llllllllllllllllIlIIlIIIlIIIlllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), llIIIIIIIII[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIIIIIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIlIIIlIIlIIII) {
            llllllllllllllllIlIIlIIIlIIlIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlllIIIIIlIl(int i, int i2) {
        return i > i2;
    }

    private static void lIIlllIIIIIIlI() {
        lIllllllllI = new String[llIIIIIIIII[5]];
        lIllllllllI[llIIIIIIIII[1]] = lIIlllIIIIIIII("1Vyk2VvmbfI=", "VJued");
        lIllllllllI[llIIIIIIIII[2]] = lIIlllIIIIIIII("fOTlfsg4pFI=", "VfPOb");
        lIllllllllI[llIIIIIIIII[3]] = lIIlllIIIIIIIl("XTO7Man8j7o=", "dslnh");
        lIllllllllI[llIIIIIIIII[4]] = lIIlllIIIIIIII("1+g+uqWDCAU=", "rljNA");
    }

    private static boolean lIIlllIIIIIlll(Object obj) {
        return obj != null;
    }

    private static void lIIlllIIIIIIll() {
        llIIIIIIIII = new int[7];
        llIIIIIIIII[0] = (117 ^ 80) ^ (144 ^ 134);
        llIIIIIIIII[1] = "  ".length() & ("  ".length() ^ (-" ".length()));
        llIIIIIIIII[2] = " ".length();
        llIIIIIIIII[3] = "  ".length();
        llIIIIIIIII[4] = "   ".length();
        llIIIIIIIII[5] = 63 ^ 59;
        llIIIIIIIII[6] = (((79 + 33) - 12) + 31) ^ (((37 + 54) - 78) + 126);
    }
}
