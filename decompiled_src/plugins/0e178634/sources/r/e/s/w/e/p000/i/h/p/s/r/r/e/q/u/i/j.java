package r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.Item;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
@Singleton
@TaskDesc(name = "Recharging trident", priority = 1000, blocking = true, register = true)
/* renamed from: r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.j  reason: invalid package */
/* loaded from: 0e178634-2b3a-4290-8340-3d1b3f3eaff7.jar:r/e/s/w/e/-/i/h/p/s/r/r/e/q/u/i/j.class */
public class j extends i {
    private static /* synthetic */ int[] lIlIllIlIIlII;
    private static /* synthetic */ String[] lIlIllIlIIIIl;
    private /* synthetic */ boolean B = lIlIllIlIIlII[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v36, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v52, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v57, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v67, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v73, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v79, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v85, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v53, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v54, types: [boolean] */
    @Override // r.e.s.w.e.p000.i.h.p.s.r.r.e.q.u.i.i
    public boolean p() {
        boolean z;
        float f;
        if (!llIIIIIlIIIlIIl(this.B ? 1 : 0) && !llIIIIIlIIIlIlI(n() ? 1 : 0)) {
            if (llIIIIIlIIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0) && llIIIIIlIIIlIlI(Bank.isOpen() ? 1 : 0)) {
                Dialog.enterAmount(lIlIllIlIIlII[1]);
                this.B = lIlIllIlIIlII[2];
                return lIlIllIlIIlII[2];
            }
            Item first = Inventory.getFirst(item -> {
                return item.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[11]]);
            });
            if (llIIIIIlIIIlIll(first)) {
                Item first2 = Equipment.getFirst(item2 -> {
                    return item2.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[9]]);
                });
                if (llIIIIIlIIIllII(first2) && llIIIIIlIIIlIlI(Inventory.isFull() ? 1 : 0)) {
                    first2.interact(lIlIllIlIIIIl[lIlIllIlIIlII[0]]);
                    return lIlIllIlIIlII[2];
                }
                return lIlIllIlIIlII[0];
            }
            if (llIIIIIlIIIlIlI(first.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[2]]) ? 1 : 0) && llIIIIIlIIIlIlI(first.getName().toLowerCase().contains(lIlIllIlIIIIl[lIlIllIlIIlII[3]]) ? 1 : 0)) {
                ?? r0 = lIlIllIlIIlII[2];
                "".length();
                z = r0;
                if ((-(131 ^ 135)) >= 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                z = lIlIllIlIIlII[0];
            }
            boolean z2 = z;
            int b = b(z2);
            if (llIIIIIlIIIlIIl(z2 ? 1 : 0)) {
                f = lIlIllIlIIlII[4];
                "".length();
                if ((-" ".length()) > 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                f = lIlIllIlIIlII[5];
            }
            float llllllllllllllIllIlIIlIIIIllllll = f;
            if (!llIIIIIlIIIlllI(b, lIlIllIlIIlII[6])) {
                int[] iArr = new int[lIlIllIlIIlII[2]];
                iArr[lIlIllIlIIlII[0]] = llllllllllllllIllIlIIlIIIIllllll;
                Item first3 = Inventory.getFirst(iArr);
                if (llIIIIIlIIIlIll(first3)) {
                    return lIlIllIlIIlII[0];
                }
                first3.useOn(first);
                return lIlIllIlIIlII[2];
            } else if (llIIIIIlIIIlIIl(Bank.isOpen() ? 1 : 0)) {
                int[] iArr2 = new int[lIlIllIlIIlII[2]];
                iArr2[lIlIllIlIIlII[0]] = b;
                if (llIIIIIlIIIlIlI(Bank.contains(iArr2) ? 1 : 0)) {
                    this.B = lIlIllIlIIlII[2];
                }
                if (!llIIIIIlIIIllll(Inventory.getFreeSlots(), lIlIllIlIIlII[7])) {
                    Bank.withdrawAll(b, Bank.WithdrawMode.ITEM);
                    return lIlIllIlIIlII[2];
                }
                int[] iArr3 = new int[lIlIllIlIIlII[7]];
                iArr3[lIlIllIlIIlII[0]] = first.getId();
                iArr3[lIlIllIlIIlII[2]] = llllllllllllllIllIlIIlIIIIllllll;
                iArr3[lIlIllIlIIlII[3]] = lIlIllIlIIlII[8];
                iArr3[lIlIllIlIIlII[9]] = lIlIllIlIIlII[10];
                iArr3[lIlIllIlIIlII[11]] = lIlIllIlIIlII[12];
                Bank.depositAllExcept(iArr3);
                return lIlIllIlIIlII[2];
            } else {
                return lIlIllIlIIlII[0];
            }
        }
        return lIlIllIlIIlII[0];
    }

    private static void llIIIIIlIIIIlIl() {
        lIlIllIlIIIIl = new String[lIlIllIlIIlII[7]];
        lIlIllIlIIIIl[lIlIllIlIIlII[0]] = llIIIIIIlllllll("YSd2ijiT1ik=", "mrysv");
        lIlIllIlIIIIl[lIlIllIlIIlII[2]] = llIIIIIlIIIIlII("EW2Oa6G9pF4=", "RocjC");
        lIlIllIlIIIIl[lIlIllIlIIlII[3]] = llIIIIIlIIIIlII("9KtTv3dOJQU=", "FjdYv");
        lIlIllIlIIIIl[lIlIllIlIIlII[9]] = llIIIIIIlllllll("xkWrhP/eimw=", "oCyUj");
        lIlIllIlIIIIl[lIlIllIlIIlII[11]] = llIIIIIIlllllll("0XXt7uYveEQ=", "RySyy");
    }

    private static String llIIIIIIlllllll(String llllllllllllllIllIlIIlIIIIlIIIll, String llllllllllllllIllIlIIlIIIIlIIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIIlIIIIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIlIllIlIIlII[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIllIlIIlII[3], llllllllllllllIllIlIIlIIIIlIIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIIIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIlIIIIlIIlII) {
            llllllllllllllIllIlIIlIIIIlIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIlIIIlIll(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIIlIIIllll(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIIlIIIlllI(int i, int i2) {
        return i != i2;
    }

    public int b(boolean z) {
        int i;
        if (llIIIIIlIIIlIIl(z ? 1 : 0)) {
            i = lIlIllIlIIlII[4];
            "".length();
            if ((-"   ".length()) >= 0) {
                return ((131 ^ 177) ^ (120 ^ 106)) & (((((32 + 122) - 76) + 150) ^ (((112 + 27) - (-17)) + 40)) ^ (-" ".length()));
            }
        } else {
            i = lIlIllIlIIlII[5];
        }
        int i2 = i;
        int[] iArr = new int[lIlIllIlIIlII[2]];
        iArr[lIlIllIlIIlII[0]] = i2;
        if (llIIIIIlIIIlIlI(Inventory.contains(iArr) ? 1 : 0)) {
            return i2;
        }
        int[] iArr2 = new int[lIlIllIlIIlII[2]];
        iArr2[lIlIllIlIIlII[0]] = lIlIllIlIIlII[8];
        if (llIIIIIlIIIlIlI(Inventory.contains(iArr2) ? 1 : 0)) {
            return lIlIllIlIIlII[8];
        }
        int[] iArr3 = new int[lIlIllIlIIlII[2]];
        iArr3[lIlIllIlIIlII[0]] = lIlIllIlIIlII[10];
        if (llIIIIIlIIIlIlI(Inventory.contains(iArr3) ? 1 : 0)) {
            return lIlIllIlIIlII[10];
        }
        int[] iArr4 = new int[lIlIllIlIIlII[2]];
        iArr4[lIlIllIlIIlII[0]] = lIlIllIlIIlII[12];
        return llIIIIIlIIIlIlI(Inventory.contains(iArr4) ? 1 : 0) ? lIlIllIlIIlII[12] : lIlIllIlIIlII[6];
    }

    private static String llIIIIIlIIIIlII(String llllllllllllllIllIlIIlIIIIllIIII, String llllllllllllllIllIlIIlIIIIlIllll) {
        try {
            SecretKeySpec llllllllllllllIllIlIIlIIIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIlIIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIlIIlII[3], llllllllllllllIllIlIIlIIIIllIIll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIlIIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIIlIIIIllIIIl) {
            llllllllllllllIllIlIIlIIIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static void llIIIIIlIIIlIII() {
        lIlIllIlIIlII = new int[14];
        lIlIllIlIIlII[0] = ((59 ^ 76) ^ (237 ^ 133)) & (((101 ^ 90) ^ (27 ^ 59)) ^ (-" ".length()));
        lIlIllIlIIlII[1] = (-29193) & 31692;
        lIlIllIlIIlII[2] = " ".length();
        lIlIllIlIIlII[3] = "  ".length();
        lIlIllIlIIlII[4] = (-((-941) & 14269)) & (-1) & 14323;
        lIlIllIlIIlII[5] = (-((-10337) & 10617)) & (-17442) & 30655;
        lIlIllIlIIlII[6] = -" ".length();
        lIlIllIlIIlII[7] = 37 ^ 32;
        lIlIllIlIIlII[8] = (-27798) & 28351;
        lIlIllIlIIlII[9] = "   ".length();
        lIlIllIlIIlII[10] = (-9229) & 9788;
        lIlIllIlIIlII[11] = 7 ^ 3;
        lIlIllIlIIlII[12] = (-17677) & 18238;
        lIlIllIlIIlII[13] = 182 ^ 190;
    }

    static {
        llIIIIIlIIIlIII();
        llIIIIIlIIIIlIl();
    }

    private static boolean llIIIIIlIIIllII(Object obj) {
        return obj != null;
    }

    private static boolean llIIIIIlIIIlIlI(int i) {
        return i == 0;
    }

    private static boolean llIIIIIlIIIlIIl(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (llIIIIIlIIIlIIl(this.j.isInInstancedRegion() ? 1 : 0)) {
            this.B = lIlIllIlIIlII[0];
        }
    }

    public boolean q() {
        return this.B;
    }
}
