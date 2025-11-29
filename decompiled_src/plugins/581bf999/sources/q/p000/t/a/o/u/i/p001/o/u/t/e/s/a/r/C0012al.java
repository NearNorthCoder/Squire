package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Curing Poison/Venom")
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.al  reason: invalid package and case insensitive filesystem */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/al.class */
public class C0012al extends Z {
    private static /* synthetic */ String[] llIIlIlIIIl;
    private static /* synthetic */ int[] llIIlIlIIlI;
    private final /* synthetic */ SquireAutoTOA cP;
    private final /* synthetic */ C cQ;

    private static String lIlIIIIIllIIIl(String llllllllllllllllIIlllllllIIIIIlI, String llllllllllllllllIIlllllllIIIIIIl) {
        try {
            SecretKeySpec llllllllllllllllIIlllllllIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllllllIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlIlIIlI[2], llllllllllllllllIIlllllllIIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllllllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllllllIIIIIll) {
            llllllllllllllllIIlllllllIIIIIll.printStackTrace();
            return null;
        }
    }

    static {
        lIlIIIIIllIIll();
        lIlIIIIIllIIlI();
    }

    private static boolean lIlIIIIIllIlIl(int i) {
        return i != 0;
    }

    private static boolean lIlIIIIIllIllI(Object obj) {
        return obj == null;
    }

    private static String lIlIIIIIlIllll(String llllllllllllllllIIlllllllIlIIlIl, String llllllllllllllllIIlllllllIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlllllllIlIIllI.getBytes(StandardCharsets.UTF_8)), llIIlIlIIlI[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIlIIlI[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlllllllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIlllllllIlIlIII) {
            llllllllllllllllIIlllllllIlIlIII.printStackTrace();
            return null;
        }
    }

    private static void lIlIIIIIllIIll() {
        llIIlIlIIlI = new int[8];
        llIIlIlIIlI[0] = ((181 ^ 195) ^ (97 ^ 7)) & (((((65 + 128) - 90) + 51) ^ (((131 + 95) - 168) + 80)) ^ (-" ".length()));
        llIIlIlIIlI[1] = " ".length();
        llIIlIlIIlI[2] = "  ".length();
        llIIlIlIIlI[3] = "   ".length();
        llIIlIlIIlI[4] = 92 ^ 88;
        llIIlIlIIlI[5] = (((109 + 33) - 9) + 58) ^ (((15 + 39) - (-7)) + 125);
        llIIlIlIIlI[6] = (28 ^ 112) ^ (116 ^ 30);
        llIIlIlIIlI[7] = (155 ^ 139) ^ (51 ^ 43);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public boolean run() {
        if (!lIlIIIIIllIlII(this.cP.e() ? 1 : 0) || lIlIIIIIllIlII(bc() ? 1 : 0)) {
            return llIIlIlIIlI[0];
        }
        if ((!lIlIIIIIllIlII(Combat.isPoisoned() ? 1 : 0) || !lIlIIIIIllIlII(Combat.isVenomed() ? 1 : 0)) && !lIlIIIIIllIlIl(TileObjects.getAll(tileObject -> {
            if (!lIlIIIIIllIlII(tileObject.getName().toLowerCase().contains(llIIlIlIIIl[llIIlIlIIlI[4]]) ? 1 : 0) || lIlIIIIIllIlIl(tileObject.getName().toLowerCase().contains(llIIlIlIIIl[llIIlIlIIlI[5]]) ? 1 : 0)) {
                ?? r0 = llIIlIlIIlI[1];
                "".length();
                return (186 ^ 190) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return llIIlIlIIlI[0];
        }).stream().anyMatch(tileObject2 -> {
            return tileObject2.getWorldLocation().equals(Players.getLocal().getWorldLocation());
        }) ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                if (lIlIIIIIllIlII(item.getName().contains(llIIlIlIIIl[llIIlIlIIlI[1]]) ? 1 : 0) && lIlIIIIIllIlII(item.getName().contains(llIIlIlIIIl[llIIlIlIIlI[2]]) ? 1 : 0) && !lIlIIIIIllIlIl(item.getName().contains(llIIlIlIIIl[llIIlIlIIlI[3]]) ? 1 : 0)) {
                    return llIIlIlIIlI[0];
                }
                ?? r0 = llIIlIlIIlI[1];
                "".length();
                return (-((((59 + 141) - 99) + 60) ^ (((1 + 33) - 28) + 158))) >= 0 ? ((65 ^ 20) ^ (188 ^ 197)) & (((((75 + 38) - 59) + 85) ^ (((62 + 72) - 9) + 42)) ^ (-" ".length())) : r0;
            });
            if (lIlIIIIIllIllI(first)) {
                return llIIlIlIIlI[0];
            }
            first.interact(llIIlIlIIIl[llIIlIlIIlI[0]]);
            return llIIlIlIIlI[0];
        }
        return llIIlIlIIlI[0];
    }

    private static boolean lIlIIIIIllIlll(int i, int i2) {
        return i < i2;
    }

    private static void lIlIIIIIllIIlI() {
        llIIlIlIIIl = new String[llIIlIlIIlI[6]];
        llIIlIlIIIl[llIIlIlIIlI[0]] = lIlIIIIIlIllll("7JRNNxlQStw=", "OJUdC");
        llIIlIlIIIl[llIIlIlIIlI[1]] = lIlIIIIIllIIII("ECwZAw==", "QBmjx");
        llIIlIlIIIl[llIIlIlIIlI[2]] = lIlIIIIIllIIII("NRkxIw==", "QvEFU");
        llIIlIlIIIl[llIIlIlIIlI[3]] = lIlIIIIIlIllll("cJ5mpCd4lno=", "pAfZU");
        llIIlIlIIIl[llIIlIlIIlI[4]] = lIlIIIIIllIIIl("yZurzDbdHZ8=", "FhVdc");
        llIIlIlIIIl[llIIlIlIIlI[5]] = lIlIIIIIllIIIl("XwGmsVt+LdQ=", "JlQXV");
    }

    private static String lIlIIIIIllIIII(String llllllllllllllllIIlllllllIIlIlll, String llllllllllllllllIIlllllllIIlIllI) {
        String llllllllllllllllIIlllllllIIlIlll2 = new String(Base64.getDecoder().decode(llllllllllllllllIIlllllllIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllllllIIlIlIl = new StringBuilder();
        char[] charArray = llllllllllllllllIIlllllllIIlIllI.toCharArray();
        int llllllllllllllllIIlllllllIIlIIll = llIIlIlIIlI[0];
        char[] charArray2 = llllllllllllllllIIlllllllIIlIlll2.toCharArray();
        int length = charArray2.length;
        int i = llIIlIlIIlI[0];
        while (lIlIIIIIllIlll(i, length)) {
            llllllllllllllllIIlllllllIIlIlIl.append((char) (charArray2[i] ^ charArray[llllllllllllllllIIlllllllIIlIIll % charArray.length]));
            "".length();
            llllllllllllllllIIlllllllIIlIIll++;
            i++;
            "".length();
            if ("  ".length() == ((79 ^ 17) & ((245 ^ 171) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlllllllIIlIlIl);
    }

    private static boolean lIlIIIIIllIlII(int i) {
        return i == 0;
    }

    @Inject
    protected C0012al(Client client, SquireAutoTOA squireAutoTOA, C c) {
        super(client);
        this.cP = squireAutoTOA;
        this.cQ = c;
    }
}
