package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Planting Seed", priority = 10, blocking = true)
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.s  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/s.class */
public class s extends r {
    private static /* synthetic */ String[] lIIlllllIIlIl;
    private final /* synthetic */ SquireTitheConfig aa;
    private static /* synthetic */ int[] lIIlllllIIllI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    public boolean run() {
        Item first = Inventory.getFirst(item -> {
            return item.getName().endsWith(lIIlllllIIlIl[lIIlllllIIllI[4]]);
        });
        if (!lIllIlIllIlIlll(first) && !lIllIlIllIllIII(first.getQuantity(), this.Z.u()) && !lIllIlIllIllIII(this.Z.v(), lIIlllllIIllI[1] * this.Z.u())) {
            if (lIllIlIllIllIIl(this.Z.q()) && lIllIlIllIllIlI(Movement.getRunEnergy(), lIIlllllIIllI[2]) && lIllIlIllIllIll(this.aa.waitForEnergy() ? 1 : 0)) {
                return lIIlllllIIllI[0];
            }
            List<Item> all = Inventory.getAll(item2 -> {
                return item2.getName().contains(lIIlllllIIlIl[lIIlllllIIllI[3]]);
            });
            if (!lIllIlIllIlllII(all.size())) {
                TileObject a = this.Z.a(tileObject -> {
                    if (lIllIlIllIlllIl(f.d(tileObject.getId()), f.EMPTY)) {
                        ?? r0 = lIIlllllIIllI[3];
                        "".length();
                        return (-" ".length()) == "  ".length() ? ((106 ^ 81) ^ (194 ^ 167)) & (((45 ^ 27) ^ (21 ^ 125)) ^ (-" ".length())) : r0;
                    }
                    return lIIlllllIIllI[0];
                });
                if (lIllIlIllIlIlll(a)) {
                    return lIIlllllIIllI[0];
                }
                first.useOn(a);
                return lIIlllllIIllI[3];
            }
            for (Item item3 : all) {
                item3.interact(lIIlllllIIlIl[lIIlllllIIllI[0]]);
                "".length();
                if ("   ".length() != "   ".length()) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            return lIIlllllIIllI[3];
        }
        return lIIlllllIIllI[0];
    }

    private static String lIllIlIllIlIIll(String llllllllllllllIlllIIllIlIIllIlIl, String llllllllllllllIlllIIllIlIIllIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIlIIllIlII.getBytes(StandardCharsets.UTF_8)), lIIlllllIIllI[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlllllIIllI[4], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIlIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIlIIllIllI) {
            llllllllllllllIlllIIllIlIIllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIllIlIlll(Object obj) {
        return obj == null;
    }

    @Inject
    protected s(i iVar, SquireTitheConfig squireTitheConfig) {
        super(iVar);
        this.aa = squireTitheConfig;
    }

    private static void lIllIlIllIlIllI() {
        lIIlllllIIllI = new int[7];
        lIIlllllIIllI[0] = " ".length() & (" ".length() ^ (-" ".length()));
        lIIlllllIIllI[1] = (100 ^ 15) ^ (204 ^ 163);
        lIIlllllIIllI[2] = (((39 + 57) - 70) + 187) ^ (((100 + 134) - 78) + 21);
        lIIlllllIIllI[3] = " ".length();
        lIIlllllIIllI[4] = "  ".length();
        lIIlllllIIllI[5] = "   ".length();
        lIIlllllIIllI[6] = (0 ^ 17) ^ (181 ^ 172);
    }

    private static boolean lIllIlIllIlllIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static String lIllIlIllIlIlII(String llllllllllllllIlllIIllIlIIlIlIII, String llllllllllllllIlllIIllIlIIlIIlll) {
        try {
            SecretKeySpec llllllllllllllIlllIIllIlIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIlIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlllllIIllI[4], llllllllllllllIlllIIllIlIIlIlIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIlIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIlIIlIlIIl) {
            llllllllllllllIlllIIllIlIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIlIllIllIlI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIlIllIllIII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIlIllIllIIl(int i) {
        return i <= 0;
    }

    private static boolean lIllIlIllIlllII(int i) {
        return i > 0;
    }

    private static void lIllIlIllIlIlIl() {
        lIIlllllIIlIl = new String[lIIlllllIIllI[5]];
        lIIlllllIIlIl[lIIlllllIIllI[0]] = lIllIlIllIlIIlI("JhMUGw==", "qvuim");
        lIIlllllIIlIl[lIIlllllIIllI[3]] = lIllIlIllIlIIll("Yi7vBIH/xctZrNGfQq4u/w==", "HUxdM");
        lIIlllllIIlIl[lIIlllllIIllI[4]] = lIllIlIllIlIlII("Spgn5ykqScg=", "qJwNU");
    }

    private static String lIllIlIllIlIIlI(String llllllllllllllIlllIIllIlIlIIlIlI, String llllllllllllllIlllIIllIlIlIIlIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIlIlIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIllIlIlIIlIIl.toCharArray();
        int llllllllllllllIlllIIllIlIlIIIIIl = lIIlllllIIllI[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlllllIIllI[0];
        while (lIllIlIllIllIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[llllllllllllllIlllIIllIlIlIIIIIl % charArray.length]));
            "".length();
            llllllllllllllIlllIIllIlIlIIIIIl++;
            i++;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIllIlIllIlIllI();
        lIllIlIllIlIlIl();
    }

    private static boolean lIllIlIllIllIll(int i) {
        return i != 0;
    }
}
