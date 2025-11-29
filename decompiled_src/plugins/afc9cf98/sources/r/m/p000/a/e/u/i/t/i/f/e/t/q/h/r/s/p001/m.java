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
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Depositing fruit", priority = 1000, blocking = true)
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.m  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/m.class */
public class m extends r {
    private final /* synthetic */ SquireTitheConfig N;
    private static /* synthetic */ int[] lIlIIIIIlIIII;
    private /* synthetic */ boolean P;
    private final /* synthetic */ Client O;
    private static /* synthetic */ String[] lIlIIIIIIlllI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v31, types: [boolean] */
    public boolean run() {
        String str = this.N.fruit().i().j() + " fruit";
        ?? r0 = lIlIIIIIlIIII[0];
        String[] strArr = new String[lIlIIIIIlIIII[0]];
        strArr[lIlIIIIIlIIII[1]] = str;
        int count = Inventory.getCount((boolean) r0, strArr);
        if (lIllIllIllIIIIl(count, this.N.depositFruitAt())) {
            this.P = lIlIIIIIlIIII[0];
            "".length();
            if (0 != 0) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else if (lIllIllIllIIIlI(count, lIlIIIIIlIIII[2])) {
            this.P = lIlIIIIIlIIII[1];
        }
        if (lIllIllIllIIIll(this.P ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                return item.getName().endsWith(lIlIIIIIIlllI[lIlIIIIIlIIII[5]]);
            });
            if (!lIllIllIllIIlII(first) || !lIllIllIllIIlIl(this.N.fruit().a(first) ? 1 : 0) || lIllIllIllIIIll(count)) {
                return lIlIIIIIlIIII[1];
            }
        }
        if (lIllIllIllIIllI(this.Z.u(), this.Z.t()) && lIllIllIllIIlIl(this.O.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIIIIlIIII[1];
        }
        List<Item> all = Inventory.getAll(item2 -> {
            return item2.getName().contains(lIlIIIIIIlllI[lIlIIIIIlIIII[4]]);
        });
        if (lIllIllIllIIlll(all.size())) {
            for (Item item3 : all) {
                item3.interact(lIlIIIIIIlllI[lIlIIIIIlIIII[1]]);
                "".length();
                if ((-" ".length()) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            }
            return lIlIIIIIlIIII[0];
        }
        String[] strArr2 = new String[lIlIIIIIlIIII[0]];
        strArr2[lIlIIIIIlIIII[1]] = lIlIIIIIIlllI[lIlIIIIIlIIII[0]];
        TileObject nearest = TileObjects.getNearest(strArr2);
        if (lIllIllIllIlIII(nearest)) {
            return lIlIIIIIlIIII[1];
        }
        nearest.interact(lIlIIIIIIlllI[lIlIIIIIlIIII[3]]);
        return lIlIIIIIlIIII[0];
    }

    private static String lIllIllIlIlllII(String llllllllllllllIlllIIlIIIlllllIll, String llllllllllllllIlllIIlIIIlllllIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIIlllllIlI.getBytes(StandardCharsets.UTF_8)), lIlIIIIIlIIII[7]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIIIIlIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIIIllllllII) {
            llllllllllllllIlllIIlIIIllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIllIIIlI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIllIllIIlIl(int i) {
        return i != 0;
    }

    private static boolean lIllIllIllIIllI(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIllIllIIlll(int i) {
        return i > 0;
    }

    @Inject
    protected m(i iVar, SquireTitheConfig squireTitheConfig, Client client) {
        super(iVar);
        this.N = squireTitheConfig;
        this.O = client;
    }

    private static void lIllIllIllIIIII() {
        lIlIIIIIlIIII = new int[8];
        lIlIIIIIlIIII[0] = " ".length();
        lIlIIIIIlIIII[1] = (21 ^ 18) & ((50 ^ 53) ^ (-1));
        lIlIIIIIlIIII[2] = 11 ^ 111;
        lIlIIIIIlIIII[3] = "  ".length();
        lIlIIIIIlIIII[4] = "   ".length();
        lIlIIIIIlIIII[5] = 7 ^ 3;
        lIlIIIIIlIIII[6] = 127 ^ 122;
        lIlIIIIIlIIII[7] = 60 ^ 52;
    }

    private static boolean lIllIllIllIIIIl(int i, int i2) {
        return i > i2;
    }

    static {
        lIllIllIllIIIII();
        lIllIllIlIllllI();
    }

    private static boolean lIllIllIllIIIll(int i) {
        return i == 0;
    }

    private static String lIllIllIlIlllIl(String llllllllllllllIlllIIlIIlIIIlllIl, String llllllllllllllIlllIIlIIlIIIlllII) {
        String llllllllllllllIlllIIlIIlIIIlllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIlllIIlIIlIIIllIlI = llllllllllllllIlllIIlIIlIIIlllII.toCharArray();
        int llllllllllllllIlllIIlIIlIIIllIIl = lIlIIIIIlIIII[1];
        char[] charArray = llllllllllllllIlllIIlIIlIIIlllIl2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIlIIII[1];
        while (lIllIllIllIIIlI(i, length)) {
            char llllllllllllllIlllIIlIIlIIIlIIII = charArray[i];
            sb.append((char) (llllllllllllllIlllIIlIIlIIIlIIII ^ llllllllllllllIlllIIlIIlIIIllIlI[llllllllllllllIlllIIlIIlIIIllIIl % llllllllllllllIlllIIlIIlIIIllIlI.length]));
            "".length();
            llllllllllllllIlllIIlIIlIIIllIIl++;
            i++;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIllIllIlIllIll(String llllllllllllllIlllIIlIIlIIIIlIII, String llllllllllllllIlllIIlIIlIIIIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIIlIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIIlIIIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIIlIIIIlIlI.init(lIlIIIIIlIIII[3], secretKeySpec);
            return new String(llllllllllllllIlllIIlIIlIIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIIlIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIlIIlIIIIlIIl) {
            llllllllllllllIlllIIlIIlIIIIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIllIIlII(Object obj) {
        return obj != null;
    }

    private static void lIllIllIlIllllI() {
        lIlIIIIIIlllI = new String[lIlIIIIIlIIII[6]];
        lIlIIIIIIlllI[lIlIIIIIlIIII[1]] = lIllIllIlIllIll("yAH5q/lBAq0=", "bcJiH");
        lIlIIIIIIlllI[lIlIIIIIlIIII[0]] = lIllIllIlIlllII("Tp/ht76bN00=", "bOWpT");
        lIlIIIIIIlllI[lIlIIIIIlIIII[3]] = lIllIllIlIlllIl("IjYdOCMPJw==", "fSmWP");
        lIlIIIIIIlllI[lIlIIIIIlIIII[4]] = lIllIllIlIlllIl("MwgwOzMHTjE=", "uiBVV");
        lIlIIIIIIlllI[lIlIIIIIlIIII[5]] = lIllIllIlIlllIl("HQsmJg==", "nnCBh");
    }

    private static boolean lIllIllIllIlIII(Object obj) {
        return obj == null;
    }
}
