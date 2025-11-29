package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Recharging trident", priority = 1000, blocking = true, register = true)
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.cl  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/cl.class */
public class cl extends ck {
    private static /* synthetic */ String[] llIIlIIlIll;
    private static /* synthetic */ int[] llIIlIIllII;
    private /* synthetic */ boolean hZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    protected cl(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
        this.hZ = llIIlIIllII[0];
    }

    private static boolean lIlIIIIIlIllII(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (lIlIIIIIlIlIII(this.cu.isInInstancedRegion() ? 1 : 0)) {
            this.hZ = llIIlIIllII[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v35, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v72, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v73, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v75, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v49, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v50, types: [boolean] */
    @Override // q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r.ck
    public boolean bl() {
        boolean z;
        int i;
        if (lIlIIIIIlIlIII(this.hZ ? 1 : 0)) {
            return llIIlIIllII[0];
        }
        if (lIlIIIIIlIlIII(Dialog.canContinue() ? 1 : 0)) {
            this.hZ = llIIlIIllII[1];
        }
        if (lIlIIIIIlIlIII(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.enterAmount(llIIlIIllII[2]);
            return llIIlIIllII[1];
        }
        Item first = Inventory.getFirst(item -> {
            return item.getName().toLowerCase().contains(llIIlIIlIll[llIIlIIllII[7]]);
        });
        if (lIlIIIIIlIlIIl(first)) {
            return llIIlIIllII[0];
        }
        if (lIlIIIIIlIlIlI(first.getName().toLowerCase().contains(llIIlIIlIll[llIIlIIllII[0]]) ? 1 : 0) && lIlIIIIIlIlIlI(first.getName().toLowerCase().contains(llIIlIIlIll[llIIlIIllII[1]]) ? 1 : 0)) {
            ?? r0 = llIIlIIllII[1];
            "".length();
            z = r0;
            if (!(true ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            z = llIIlIIllII[0];
        }
        boolean llllllllllllllllIlIIIIIIIIIIIIll = z;
        int g = g(llllllllllllllllIlIIIIIIIIIIIIll);
        if (lIlIIIIIlIlIII(llllllllllllllllIlIIIIIIIIIIIIll ? 1 : 0)) {
            i = llIIlIIllII[3];
            "".length();
            if (0 != 0) {
                return ((198 ^ 153) ^ (108 ^ 97)) & (((((51 + 179) - 114) + 104) ^ (((84 + 24) - 70) + 104)) ^ (-" ".length()));
            }
        } else {
            i = llIIlIIllII[4];
        }
        int i2 = i;
        if (!lIlIIIIIlIlIll(g, llIIlIIllII[5])) {
            int[] iArr = new int[llIIlIIllII[1]];
            iArr[llIIlIIllII[0]] = i2;
            Item first2 = Inventory.getFirst(iArr);
            if (lIlIIIIIlIlIIl(first2)) {
                return llIIlIIllII[0];
            }
            first2.useOn(first);
            return llIIlIIllII[1];
        } else if (lIlIIIIIlIlIII(Bank.isOpen() ? 1 : 0)) {
            int[] iArr2 = new int[llIIlIIllII[1]];
            iArr2[llIIlIIllII[0]] = g;
            if (lIlIIIIIlIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
                this.hZ = llIIlIIllII[1];
            }
            if (!lIlIIIIIlIllII(Inventory.getFreeSlots(), llIIlIIllII[6])) {
                Bank.withdrawAll(g, Bank.WithdrawMode.ITEM);
                return llIIlIIllII[1];
            }
            int[] iArr3 = new int[llIIlIIllII[6]];
            iArr3[llIIlIIllII[0]] = first.getId();
            iArr3[llIIlIIllII[1]] = i2;
            iArr3[llIIlIIllII[7]] = llIIlIIllII[8];
            iArr3[llIIlIIllII[9]] = llIIlIIllII[10];
            iArr3[llIIlIIllII[11]] = llIIlIIllII[12];
            Bank.depositAllExcept(iArr3);
            return llIIlIIllII[1];
        } else {
            return llIIlIIllII[0];
        }
    }

    static {
        lIlIIIIIlIIlll();
        lIlIIIIIlIIllI();
    }

    private static boolean lIlIIIIIlIlIll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIlIIIIIlIlIII(int i) {
        return i != 0;
    }

    private static void lIlIIIIIlIIllI() {
        llIIlIIlIll = new String[llIIlIIllII[9]];
        llIIlIIlIll[llIIlIIllII[0]] = lIlIIIIIlIIlII("YXYjdtvif78=", "zkHqS");
        llIIlIIlIll[llIIlIIllII[1]] = lIlIIIIIlIIlII("IvT/K+i461E=", "zwrrO");
        llIIlIIlIll[llIIlIIllII[7]] = lIlIIIIIlIIlIl("GhU8NisAEw==", "ngURN");
    }

    private static String lIlIIIIIlIIlIl(String llllllllllllllllIIlllllllllIIIlI, String llllllllllllllllIIlllllllllIIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIIlllllllllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlllllllllIIIII = new StringBuilder();
        char[] charArray = llllllllllllllllIIlllllllllIIIIl.toCharArray();
        int llllllllllllllllIIllllllllIllllI = llIIlIIllII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIIlIIllII[0];
        while (lIlIIIIIlIllII(i, length)) {
            char llllllllllllllllIIllllllllIlIlIl = charArray2[i];
            llllllllllllllllIIlllllllllIIIII.append((char) (llllllllllllllllIIllllllllIlIlIl ^ charArray[llllllllllllllllIIllllllllIllllI % charArray.length]));
            "".length();
            llllllllllllllllIIllllllllIllllI++;
            i++;
            "".length();
            if (((53 ^ 99) & ((247 ^ 161) ^ (-1))) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIIlllllllllIIIII);
    }

    private static boolean lIlIIIIIlIlIIl(Object obj) {
        return obj == null;
    }

    private static String lIlIIIIIlIIlII(String llllllllllllllllIIllllllllllIIlI, String llllllllllllllllIIllllllllllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIllllllllllIIIl.getBytes(StandardCharsets.UTF_8)), llIIlIIllII[13]), "DES");
            Cipher llllllllllllllllIIllllllllllIlII = Cipher.getInstance("DES");
            llllllllllllllllIIllllllllllIlII.init(llIIlIIllII[7], secretKeySpec);
            return new String(llllllllllllllllIIllllllllllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIIllllllllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIIllllllllllIIll) {
            llllllllllllllllIIllllllllllIIll.printStackTrace();
            return null;
        }
    }

    public int g(boolean z) {
        int i;
        if (lIlIIIIIlIlIII(z ? 1 : 0)) {
            i = llIIlIIllII[3];
            "".length();
            if ((-"  ".length()) > 0) {
                return ((228 ^ 197) ^ (235 ^ 195)) & (("   ".length() ^ (35 ^ 41)) ^ (-" ".length()));
            }
        } else {
            i = llIIlIIllII[4];
        }
        int i2 = i;
        int[] iArr = new int[llIIlIIllII[1]];
        iArr[llIIlIIllII[0]] = i2;
        if (lIlIIIIIlIlIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return i2;
        }
        int[] iArr2 = new int[llIIlIIllII[1]];
        iArr2[llIIlIIllII[0]] = llIIlIIllII[8];
        if (lIlIIIIIlIlIlI(Inventory.contains(iArr2) ? 1 : 0)) {
            return llIIlIIllII[8];
        }
        int[] iArr3 = new int[llIIlIIllII[1]];
        iArr3[llIIlIIllII[0]] = llIIlIIllII[10];
        if (lIlIIIIIlIlIlI(Inventory.contains(iArr3) ? 1 : 0)) {
            return llIIlIIllII[10];
        }
        int[] iArr4 = new int[llIIlIIllII[1]];
        iArr4[llIIlIIllII[0]] = llIIlIIllII[12];
        return lIlIIIIIlIlIlI(Inventory.contains(iArr4) ? 1 : 0) ? llIIlIIllII[12] : llIIlIIllII[5];
    }

    private static boolean lIlIIIIIlIlIlI(int i) {
        return i == 0;
    }

    private static void lIlIIIIIlIIlll() {
        llIIlIIllII = new int[14];
        llIIlIIllII[0] = ((25 ^ 46) ^ (220 ^ 193)) & (((((40 + 0) - 20) + 158) ^ (((103 + 15) - (-2)) + 32)) ^ (-" ".length()));
        llIIlIIllII[1] = " ".length();
        llIIlIIllII[2] = (-((-68) & 28799)) & (-1) & 31231;
        llIIlIIllII[3] = (-((-3343) & 19743)) & (-5133) & 22527;
        llIIlIIllII[4] = (-((-9173) & 26621)) & (-2065) & 32446;
        llIIlIIllII[5] = -" ".length();
        llIIlIIllII[6] = 41 ^ 44;
        llIIlIIllII[7] = "  ".length();
        llIIlIIllII[8] = (-((-1546) & 28507)) & (-4225) & 31739;
        llIIlIIllII[9] = "   ".length();
        llIIlIIllII[10] = (-((-33) & 19695)) & (-8193) & 28414;
        llIIlIIllII[11] = 65 ^ 69;
        llIIlIIllII[12] = (-8582) & 9143;
        llIIlIIllII[13] = (81 ^ 106) ^ (62 ^ 13);
    }
}
