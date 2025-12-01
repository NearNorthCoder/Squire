package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.dagannothkings.SquireDagannothKings;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Looting")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.aj  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/aj.class */
public class C0010aj extends Task {
    private static /* synthetic */ int[] llIllII;
    private static /* synthetic */ String[] llIlIll;
    private final /* synthetic */ SquireDagannothKings cO;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    public boolean run() {
        if (llIllIlll(Players.getLocal().isMoving() ? 1 : 0)) {
            return llIllII[0];
        }
        for (aH aHVar : this.cO.p()) {
            WorldPoint cd = aHVar.cd();
            int[] iArr = new int[llIllII[1]];
            iArr[llIllII[0]] = aHVar.P();
            TileItem firstAt = TileItems.getFirstAt(cd, iArr);
            if (llIlllIII(firstAt)) {
                if (llIlllIIl(Inventory.isFull() ? 1 : 0)) {
                    firstAt.interact(llIlIll[llIllII[0]]);
                }
                if (llIllIlll(Inventory.isFull() ? 1 : 0)) {
                    if (llIllIlll(firstAt.isStackable() ? 1 : 0)) {
                        int[] iArr2 = new int[llIllII[1]];
                        iArr2[llIllII[0]] = firstAt.getId();
                        if (llIllIlll(Inventory.contains(iArr2) ? 1 : 0)) {
                            firstAt.interact(llIlIll[llIllII[1]]);
                        }
                    }
                    Item first = Inventory.getFirst(item -> {
                        String[] strArr = new String[llIllII[1]];
                        strArr[llIllII[0]] = llIlIll[llIllII[3]];
                        return item.hasAction(strArr);
                    });
                    if (llIlllIlI(first)) {
                        return llIllII[0];
                    }
                    first.interact(llIlIll[llIllII[2]]);
                    return llIllII[1];
                }
            }
            "".length();
            if ("   ".length() == 0) {
                return true & ((true ^ true) ^ true);
            }
        }
        return llIllII[1];
    }

    private static String llIllIIll(String lllIlIIIIllIlII, String lllIlIIIIllIIll) {
        String str = new String(Base64.getDecoder().decode(lllIlIIIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIlIIIIllIIlI = new StringBuilder();
        char[] lllIlIIIIllIIIl = lllIlIIIIllIIll.toCharArray();
        int lllIlIIIIllIIII = llIllII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i2 = llIllII[0];
        while (llIlllIll(i2, length)) {
            lllIlIIIIllIIlI.append((char) (charArray[i2] ^ lllIlIIIIllIIIl[lllIlIIIIllIIII % lllIlIIIIllIIIl.length]));
            "".length();
            lllIlIIIIllIIII++;
            i2++;
            "".length();
            if ((67 ^ 71) < (58 ^ 62)) {
                return null;
            }
        }
        return String.valueOf(lllIlIIIIllIIlI);
    }

    private static void llIllIlIl() {
        llIlIll = new String[llIllII[4]];
        llIlIll[llIllII[0]] = llIllIIlI("/LmV/+Cr7M0=", "RiGWK");
        llIlIll[llIllII[1]] = llIllIIll("GikhLQ==", "NHJHA");
        llIlIll[llIllII[2]] = llIllIIll("NTcm", "pVRbs");
        llIlIll[llIllII[3]] = llIllIlII("GwgYIQ5NhfE=", "yBRmi");
    }

    private static boolean llIllIlll(int i2) {
        return i2 != 0;
    }

    private static void llIllIllI() {
        llIllII = new int[6];
        llIllII[0] = ((222 ^ 174) ^ (91 ^ 116)) & (((235 ^ 182) ^ "  ".length()) ^ (-" ".length()));
        llIllII[1] = " ".length();
        llIllII[2] = "  ".length();
        llIllII[3] = "   ".length();
        llIllII[4] = 20 ^ 16;
        llIllII[5] = 120 ^ 112;
    }

    @Inject
    public C0010aj(SquireDagannothKings squireDagannothKings) {
        this.cO = squireDagannothKings;
    }

    private static boolean llIlllIIl(int i2) {
        return i2 == 0;
    }

    static {
        llIllIllI();
        llIllIlIl();
    }

    private static boolean llIlllIll(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llIlllIlI(Object obj) {
        return obj == null;
    }

    private static boolean llIlllIII(Object obj) {
        return obj != null;
    }

    private static String llIllIlII(String lllIlIIIIIlllll, String lllIlIIIIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIlIIIIIllllI.getBytes(StandardCharsets.UTF_8)), llIllII[5]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIllII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIlIIIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIIIIlIIIII) {
            lllIlIIIIlIIIII.printStackTrace();
            return null;
        }
    }

    private static String llIllIIlI(String lllIlIIIIIlIIlI, String lllIlIIIIIlIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIlIIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIlIIIIIlIlII = Cipher.getInstance("Blowfish");
            lllIlIIIIIlIlII.init(llIllII[2], secretKeySpec);
            return new String(lllIlIIIIIlIlII.doFinal(Base64.getDecoder().decode(lllIlIIIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIlIIIIIIlllI) {
            lllIlIIIIIIlllI.printStackTrace();
            return null;
        }
    }
}
