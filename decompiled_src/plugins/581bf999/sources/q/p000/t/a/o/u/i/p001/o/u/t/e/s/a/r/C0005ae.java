package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Drinking brew", priority = 100)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ae  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/ae.class */
public class C0005ae extends Z {
    private final /* synthetic */ SquireAutoTOA cH;
    private static /* synthetic */ int[] llIllIlIllI;
    private final /* synthetic */ C cG;
    private static /* synthetic */ String[] llIllIlIlIl;

    private static boolean lIlIlIlIIIIIll(Object obj) {
        return obj != null;
    }

    private static boolean lIlIlIlIIIIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIlIlIlIIIIIlI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    public boolean run() {
        int i;
        if (lIlIlIlIIIIIII(this.cH.e() ? 1 : 0)) {
            return llIllIlIllI[0];
        }
        Item first = Inventory.getFirst(item -> {
            if (!lIlIlIlIIIIIlI(EnumC0056e.NECTAR.d(item.getId()) ? 1 : 0) || lIlIlIlIIIIIII(item.getName().contains(llIllIlIlIl[llIllIlIllI[1]]) ? 1 : 0)) {
                ?? r0 = llIllIlIllI[1];
                "".length();
                return "  ".length() != "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIllIlIllI[0];
        });
        if (lIlIlIlIIIIIIl(first)) {
            return llIllIlIllI[0];
        }
        if (lIlIlIlIIIIIlI(aq() ? 1 : 0)) {
            int[] iArr = new int[llIllIlIllI[1]];
            iArr[llIllIlIllI[0]] = llIllIlIllI[2];
            if (lIlIlIlIIIIIll(Inventory.getFirst(iArr)) && lIlIlIlIIIIlII(Combat.getSpecEnergy(), llIllIlIllI[3]) && lIlIlIlIIIIlII(Combat.getCurrentHealth(), llIllIlIllI[4])) {
                return llIllIlIllI[0];
            }
        }
        if ((!lIlIlIlIIIIIII(bf() ? 1 : 0) || lIlIlIlIIIIlIl(Combat.getCurrentHealth(), llIllIlIllI[5])) && !lIlIlIlIIIIIII(this.cG.ap() ? 1 : 0)) {
            i = llIllIlIllI[0];
        } else {
            i = llIllIlIllI[1];
            "".length();
            if ("   ".length() == 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        int i2 = i;
        if (!lIlIlIlIIIIIII(this.cG.am() ? 1 : 0) || lIlIlIlIIIIIlI(i2)) {
            return llIllIlIllI[0];
        }
        first.interact(llIllIlIlIl[llIllIlIllI[0]]);
        this.cG.ao();
        return llIllIlIllI[1];
    }

    private static void lIlIlIIllllllI() {
        llIllIlIlIl = new String[llIllIlIllI[6]];
        llIllIlIlIl[llIllIlIllI[0]] = lIlIlIIlllllII("w8funHT5QQw=", "DELOU");
        llIllIlIlIl[llIllIlIllI[1]] = lIlIlIIlllllIl("IB0GMg==", "BocER");
    }

    private static void lIlIlIIlllllll() {
        llIllIlIllI = new int[8];
        llIllIlIllI[0] = ((((3 + 74) - (-110)) + 19) ^ (((16 + 107) - 108) + 120)) & (((((150 + 49) - 12) + 10) ^ (((1 + 39) - 1) + 101)) ^ (-" ".length()));
        llIllIlIllI[1] = " ".length();
        llIllIlIllI[2] = (-((-29187) & 30531)) & (-33) & 28667;
        llIllIlIllI[3] = (121 ^ 113) ^ (85 ^ 27);
        llIllIlIllI[4] = 68 ^ 108;
        llIllIlIllI[5] = 147 ^ 195;
        llIllIlIllI[6] = "  ".length();
        llIllIlIllI[7] = (97 ^ 65) ^ (137 ^ 161);
    }

    private static String lIlIlIIlllllIl(String llllllllllllllllIIlIllIIllllIlll, String llllllllllllllllIIlIllIIllllIllI) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlIllIIllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllllIIlIllIIllllIllI.toCharArray();
        int llllllllllllllllIIlIllIIllllIIll = llIllIlIllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIllIlIllI[0];
        while (lIlIlIlIIIIllI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIlIllIIllllIIll % charArray.length]));
            "".length();
            llllllllllllllllIIlIllIIllllIIll++;
            i++;
            "".length();
            if (((true ^ true) & ((true ^ true) ^ true)) != ((true ^ true) & ((true ^ true) ^ true))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlIlIlIIIIlIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIlIlIlIIIIIII(int i) {
        return i != 0;
    }

    private static boolean lIlIlIlIIIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlIlIlIIIIlII(int i, int i2) {
        return i > i2;
    }

    private static String lIlIlIIlllllII(String llllllllllllllllIIlIllIlIIIIIlll, String llllllllllllllllIIlIllIlIIIIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIllIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), llIllIlIllI[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllIlIllI[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIllIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlIllIlIIIIlIII) {
            llllllllllllllllIIlIllIlIIIIlIII.printStackTrace();
            return null;
        }
    }

    static {
        lIlIlIIlllllll();
        lIlIlIIllllllI();
    }

    @Inject
    protected C0005ae(Client client, C c, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cG = c;
        this.cH = squireAutoTOA;
    }
}
