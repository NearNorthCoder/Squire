package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Praying with bonemeal", priority = 10, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.au  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/au.class */
public class C0021au extends AbstractC0019as {
    private static /* synthetic */ int[] lIIIIIII;
    private /* synthetic */ boolean dm;
    private static /* synthetic */ String[] lllllll;

    private static String llllIlIII(String lllIIlIllIIlIIl, String lllIIlIllIIlIII) {
        try {
            SecretKeySpec lllIIlIllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIlIllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIlIllIIlIll = Cipher.getInstance("Blowfish");
            lllIIlIllIIlIll.init(lIIIIIII[0], lllIIlIllIIllII);
            return new String(lllIIlIllIIlIll.doFinal(Base64.getDecoder().decode(lllIIlIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIlIllIIlIlI) {
            lllIIlIllIIlIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llllIllII(int i2) {
        return i2 != 0;
    }

    private static boolean llllIlIll(int i2) {
        return i2 == 0;
    }

    private static void llllIlIlI() {
        lIIIIIII = new int[12];
        lIIIIIII[0] = "  ".length();
        lIIIIIII[1] = (117 ^ 99) & ((185 ^ 175) ^ (-1));
        lIIIIIII[2] = " ".length();
        lIIIIIII[3] = (-((-16406) & 26199)) & (-1) & 14079;
        lIIIIIII[4] = (-16641) & 20918;
        lIIIIIII[5] = "   ".length();
        lIIIIIII[6] = (110 ^ 29) ^ (54 ^ 65);
        lIIIIIII[7] = (113 ^ 47) ^ (61 ^ 102);
        lIIIIIII[8] = (((58 + 60) - 5) + 27) ^ (((63 + 63) - 40) + 52);
        lIIIIIII[9] = 147 ^ 148;
        lIIIIIII[10] = (-((-1153) & 31995)) & (-1) & 32767;
        lIIIIIII[11] = (29 ^ 18) ^ (5 ^ 2);
    }

    private static void llllIlIIl() {
        lllllll = new String[lIIIIIII[11]];
        lllllll[lIIIIIII[1]] = llllIIllI("OhwCBiAaBwcEIlkWDR4qWRUcBShZBwYPZR4GFw==", "ysnjE");
        lllllll[lIIIIIII[2]] = llllIIlll("hNMsHazDIX0=", "wyaXO");
        lllllll[lIIIIIII[0]] = llllIIlll("Klu65j23IIrbI9Le/qydYQ==", "JFSGU");
        lllllll[lIIIIIII[5]] = llllIIllI("MxA2L2ITHg==", "gqZDO");
        lllllll[lIIIIIII[6]] = llllIlIII("XZnPHm5R/FUOgSOxR6wiy02kF1KAr/MROY/Dqx/EIY3E8LMJKU2FoKmvI1nSFdoZ", "pLrUs");
        lllllll[lIIIIIII[7]] = llllIlIII("i6NwIAi9V3MZmSr88SZFOQ==", "mlJNM");
        lllllll[lIIIIIII[8]] = llllIIlll("W1m7W8Se7ow=", "kqYkG");
        lllllll[lIIIIIII[9]] = llllIIlll("LAOJxf5ZaVA=", "cYCQO");
    }

    static {
        llllIlIlI();
        llllIlIIl();
    }

    private static boolean llllIlllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    @Override // i.i.b.s.c.q.r.s.s.p000.u.a.e.AbstractC0019as
    public boolean bB() {
        int[] iArr = new int[lIIIIIII[0]];
        iArr[lIIIIIII[1]] = this.de.bonesToUse().groundItemId;
        iArr[lIIIIIII[2]] = lIIIIIII[3];
        if (llllIlIll(Inventory.containsAllOf(iArr) ? 1 : 0)) {
            return lIIIIIII[1];
        }
        if (llllIllII(Dialog.isOpen() ? 1 : 0)) {
            this.dm = lIIIIIII[2];
            if (llllIllII(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return lIIIIIII[2];
            }
            Log.info(lllllll[lIIIIIII[1]]);
        }
        int[] iArr2 = new int[lIIIIIII[2]];
        iArr2[lIIIIIII[1]] = lIIIIIII[4];
        if (llllIllII(Inventory.contains(iArr2) ? 1 : 0) && llllIllII(this.dm ? 1 : 0)) {
            this.dm = lIIIIIII[1];
        }
        if (!llllIllII(this.dm ? 1 : 0)) {
            if (llllIlIll(EnumC0013am.ECTOFUNTUS.bo() ? 1 : 0)) {
                return this.dd.bk();
            }
            String[] strArr = new String[lIIIIIII[2]];
            strArr[lIIIIIII[1]] = lllllll[lIIIIIII[7]];
            TileObject nearest = TileObjects.getNearest(strArr);
            if (llllIlllI(nearest)) {
                Log.info(lllllll[lIIIIIII[8]]);
                return lIIIIIII[1];
            }
            nearest.interact(lllllll[lIIIIIII[9]]);
            return lIIIIIII[2];
        }
        if (llllIllII(Inventory.isFull() ? 1 : 0)) {
            Item first = Inventory.getFirst(item -> {
                if (!llllIllll(item.getId(), lIIIIIII[10]) || lllllIIII(item.getId(), lIIIIIII[3])) {
                    ?? r0 = lIIIIIII[2];
                    "".length();
                    return "   ".length() <= (-" ".length()) ? ((((149 + 142) - 264) + 198) ^ (((26 + 185) - 17) + 1)) & (((225 ^ 174) ^ (56 ^ 85)) ^ (-" ".length())) : r0;
                }
                return lIIIIIII[1];
            });
            if (llllIllIl(first)) {
                first.interact(lllllll[lIIIIIII[2]]);
                return lIIIIIII[2];
            }
        }
        String[] strArr2 = new String[lIIIIIII[2]];
        strArr2[lIIIIIII[1]] = lllllll[lIIIIIII[0]];
        NPC nearest2 = NPCs.getNearest(strArr2);
        if (llllIllIl(nearest2)) {
            nearest2.interact(lllllll[lIIIIIII[5]]);
            return lIIIIIII[2];
        }
        Log.info(lllllll[lIIIIIII[6]]);
        return lIIIIIII[1];
    }

    private static boolean llllIllIl(Object obj) {
        return obj != null;
    }

    @Inject
    public C0021au(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        super(squireEcto, squireEctoConfig);
    }

    private static boolean llllIllll(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lllllIIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static String llllIIllI(String lllIIlIllIllllI, String lllIIlIllIlllIl) {
        String lllIIlIllIllllI2 = new String(Base64.getDecoder().decode(lllIIlIllIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllIIlIllIlllIl.toCharArray();
        int lllIIlIllIllIlI = lIIIIIII[1];
        char[] charArray2 = lllIIlIllIllllI2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIIIII[1];
        while (lllllIIIl(i2, length)) {
            char lllIIlIllIlllll = charArray2[i2];
            sb.append((char) (lllIIlIllIlllll ^ charArray[lllIIlIllIllIlI % charArray.length]));
            "".length();
            lllIIlIllIllIlI++;
            i2++;
            "".length();
            if (((37 ^ 116) & ((65 ^ 16) ^ (-1))) < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lllllIIII(int i2, int i3) {
        return i2 == i3;
    }

    private static String llllIIlll(String lllIIlIlIllllII, String lllIIlIlIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIlIlIlllIll.getBytes(StandardCharsets.UTF_8)), lIIIIIII[11]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIIIIII[0], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIlIlIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIlIlIllllIl) {
            lllIIlIlIllllIl.printStackTrace();
            return null;
        }
    }
}
