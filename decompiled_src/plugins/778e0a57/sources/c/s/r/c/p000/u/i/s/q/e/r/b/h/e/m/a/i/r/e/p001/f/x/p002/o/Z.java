package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Recharging trident", priority = 19010, blocking = true, register = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.Z  reason: invalid package */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/Z.class */
public class Z extends Y {
    private static /* synthetic */ int[] lIlIllIlIIIl;
    private static /* synthetic */ String[] lIlIllIlIIII;

    public int h(boolean z) {
        int i;
        if (lllIIIIIIllIIl(z ? 1 : 0)) {
            i = lIlIllIlIIIl[4];
            "".length();
            if ((-" ".length()) > " ".length()) {
                return ((13 ^ 95) ^ (103 ^ 111)) & (((((100 + 108) - 53) + 66) ^ (((86 + 35) - 50) + 64)) ^ (-" ".length()));
            }
        } else {
            i = lIlIllIlIIIl[5];
        }
        int i2 = i;
        int[] iArr = new int[lIlIllIlIIIl[1]];
        iArr[lIlIllIlIIIl[0]] = i2;
        if (lllIIIIIIllIII(Inventory.contains(iArr) ? 1 : 0)) {
            return i2;
        }
        int[] iArr2 = new int[lIlIllIlIIIl[1]];
        iArr2[lIlIllIlIIIl[0]] = lIlIllIlIIIl[8];
        if (lllIIIIIIllIII(Inventory.contains(iArr2) ? 1 : 0)) {
            return lIlIllIlIIIl[8];
        }
        int[] iArr3 = new int[lIlIllIlIIIl[1]];
        iArr3[lIlIllIlIIIl[0]] = lIlIllIlIIIl[10];
        if (lllIIIIIIllIII(Inventory.contains(iArr3) ? 1 : 0)) {
            return lIlIllIlIIIl[10];
        }
        int[] iArr4 = new int[lIlIllIlIIIl[1]];
        iArr4[lIlIllIlIIIl[0]] = lIlIllIlIIIl[12];
        return lllIIIIIIllIII(Inventory.contains(iArr4) ? 1 : 0) ? lIlIllIlIIIl[12] : lIlIllIlIIIl[6];
    }

    private static void lllIIIIIIlIlll() {
        lIlIllIlIIIl = new int[16];
        lIlIllIlIIIl[0] = (78 ^ 3) & ((110 ^ 35) ^ (-1));
        lIlIllIlIIIl[1] = " ".length();
        lIlIllIlIIIl[2] = (-((-1415) & 26503)) & (-4108) & 31695;
        lIlIllIlIIIl[3] = "  ".length();
        lIlIllIlIIIl[4] = (-((-11015) & 32519)) & (-2057) & 24555;
        lIlIllIlIIIl[5] = (-3426) & 16359;
        lIlIllIlIIIl[6] = -" ".length();
        lIlIllIlIIIl[7] = 45 ^ 40;
        lIlIllIlIIIl[8] = (-((-1817) & 32602)) & (-1157) & 32495;
        lIlIllIlIIIl[9] = "   ".length();
        lIlIllIlIIIl[10] = (-((-24621) & 30893)) & (-24843) & 31674;
        lIlIllIlIIIl[11] = 64 ^ 68;
        lIlIllIlIIIl[12] = (-((-1058) & 3431)) & (-1) & 2935;
        lIlIllIlIIIl[13] = (43 ^ 110) ^ (19 ^ 80);
        lIlIllIlIIIl[14] = 135 ^ 128;
        lIlIllIlIIIl[15] = (((116 + 125) - 235) + 141) ^ (((58 + 4) - 13) + 106);
    }

    private static String lllIIIIIIlIlIl(String lllllllllllllllIllIIlIlIlIIlllIl, String lllllllllllllllIllIIlIlIlIIlllII) {
        try {
            SecretKeySpec lllllllllllllllIllIIlIlIlIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIlIlIIlllII.getBytes(StandardCharsets.UTF_8)), lIlIllIlIIIl[15]), "DES");
            Cipher lllllllllllllllIllIIlIlIlIIlllll = Cipher.getInstance("DES");
            lllllllllllllllIllIIlIlIlIIlllll.init(lIlIllIlIIIl[3], lllllllllllllllIllIIlIlIlIlIIIII);
            return new String(lllllllllllllllIllIIlIlIlIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIlIlIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIlIlIIllllI) {
            lllllllllllllllIllIIlIlIlIIllllI.printStackTrace();
            return null;
        }
    }

    private static String lllIIIIIIlIIll(String lllllllllllllllIllIIlIlIlIIIllIl, String lllllllllllllllIllIIlIlIlIIIllII) {
        String lllllllllllllllIllIIlIlIlIIIllIl2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIIlIlIlIIIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIllIIlIlIlIIIlIlI = lllllllllllllllIllIIlIlIlIIIllII.toCharArray();
        int lllllllllllllllIllIIlIlIlIIIlIIl = lIlIllIlIIIl[0];
        char[] charArray = lllllllllllllllIllIIlIlIlIIIllIl2.toCharArray();
        int lllllllllllllllIllIIlIlIlIIIIIlI = charArray.length;
        int i = lIlIllIlIIIl[0];
        while (lllIIIIIIlllII(i, lllllllllllllllIllIIlIlIlIIIIIlI)) {
            char lllllllllllllllIllIIlIlIlIIIlllI = charArray[i];
            sb.append((char) (lllllllllllllllIllIIlIlIlIIIlllI ^ lllllllllllllllIllIIlIlIlIIIlIlI[lllllllllllllllIllIIlIlIlIIIlIIl % lllllllllllllllIllIIlIlIlIIIlIlI.length]));
            "".length();
            lllllllllllllllIllIIlIlIlIIIlIIl++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lllIIIIIIlIlll();
        lllIIIIIIlIllI();
    }

    private static boolean lllIIIIIIllIll(int i, int i2) {
        return i != i2;
    }

    private static void lllIIIIIIlIllI() {
        lIlIllIlIIII = new String[lIlIllIlIIIl[14]];
        lIlIllIlIIII[lIlIllIlIIIl[0]] = lllIIIIIIlIIll("KgQZNhEd", "xatYg");
        lIlIllIlIIII[lIlIllIlIIIl[1]] = lllIIIIIIlIIll("BBU9Oww=", "pzERo");
        lIlIllIlIIII[lIlIllIlIIIl[3]] = lllIIIIIIlIlII("dwfHjEhTg5Q=", "sdyvn");
        lIlIllIlIIII[lIlIllIlIIIl[9]] = lllIIIIIIlIlIl("xm0qOeJFsaFcbThVIv1R3Q==", "bpDOo");
        lIlIllIlIIII[lIlIllIlIIIl[11]] = lllIIIIIIlIlII("i5JSGo2ogfU=", "zSfWR");
        lIlIllIlIIII[lIlIllIlIIIl[7]] = lllIIIIIIlIIll("Ix4LJiI5GA==", "WlbBG");
        lIlIllIlIIII[lIlIllIlIIIl[13]] = lllIIIIIIlIlII("whYLsPhzqfs=", "mMMtu");
    }

    private static boolean lllIIIIIIllllI(int i, int i2) {
        return i > i2;
    }

    private static String lllIIIIIIlIlII(String lllllllllllllllIllIIlIlIlIlIlIlI, String lllllllllllllllIllIIlIlIlIlIlIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIlIlIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIllIlIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIlIlIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIIlIlIlIlIlIll) {
            lllllllllllllllIllIIlIlIlIlIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIIIIlllIl(Object obj) {
        return obj != null;
    }

    private static boolean lllIIIIIIllIlI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (lllIIIIIIllIIl(this.u.isInInstancedRegion() ? 1 : 0)) {
            cw = lIlIllIlIIIl[0];
        }
    }

    private static boolean lllIIIIIIlllII(int i, int i2) {
        return i < i2;
    }

    private static boolean lllIIIIIIllIII(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v101, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v106, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v107, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v108, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v110, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v111, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v112, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v37, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v81, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v82, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v97, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v98, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99, types: [int[]] */
    /* JADX WARN: Type inference failed for: r1v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v56, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.Y
    public boolean cg() {
        boolean z;
        int i;
        if (!lllIIIIIIllIII(cr() ? 1 : 0) && !lllIIIIIIllIIl(cw ? 1 : 0)) {
            if (lllIIIIIIllIIl(Dialog.canContinue() ? 1 : 0)) {
                cw = lIlIllIlIIIl[1];
            }
            if (lllIIIIIIllIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                Dialog.enterAmount(lIlIllIlIIIl[2]);
                return lIlIllIlIIIl[1];
            }
            Item first = Inventory.getFirst(item -> {
                return item.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[13]]);
            });
            if (lllIIIIIIllIlI(first)) {
                Item first2 = Equipment.getFirst(item2 -> {
                    return item2.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[7]]);
                });
                if (lllIIIIIIllIlI(first2)) {
                    cw = lIlIllIlIIIl[1];
                    return lIlIllIlIIIl[0];
                }
                first2.interact(lIlIllIlIIII[lIlIllIlIIIl[0]]);
                return lIlIllIlIIIl[1];
            }
            if (lllIIIIIIllIII(first.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[1]]) ? 1 : 0) && lllIIIIIIllIII(first.getName().toLowerCase().contains(lIlIllIlIIII[lIlIllIlIIIl[3]]) ? 1 : 0)) {
                ?? r0 = lIlIllIlIIIl[1];
                "".length();
                z = r0;
                if ((((126 ^ 49) ^ (120 ^ 86)) & (((238 ^ 152) ^ (149 ^ 130)) ^ (-" ".length()))) > 0) {
                    return ((112 ^ 61) ^ "  ".length()) & (((((32 + 86) - (-83)) + 16) ^ (((9 + 80) - (-3)) + 58)) ^ (-" ".length()));
                }
            } else {
                z = lIlIllIlIIIl[0];
            }
            boolean z2 = z;
            int h = h(z2);
            if (lllIIIIIIllIIl(z2 ? 1 : 0)) {
                i = lIlIllIlIIIl[4];
                "".length();
                if ("   ".length() == 0) {
                    return ((156 ^ 182) ^ (35 ^ 29)) & (((((100 + 8) - 90) + 121) ^ (((100 + 115) - 99) + 43)) ^ (-" ".length()));
                }
            } else {
                i = lIlIllIlIIIl[5];
            }
            int i2 = i;
            if (lllIIIIIIllIll(h, lIlIllIlIIIl[6])) {
                if (lllIIIIIIllIII(Bank.isEmpty() ? 1 : 0)) {
                    int[] iArr = new int[lIlIllIlIIIl[1]];
                    iArr[lIlIllIlIIIl[0]] = h;
                    if (lllIIIIIIllIII(Bank.contains(iArr) ? 1 : 0)) {
                        cw = lIlIllIlIIIl[1];
                    }
                }
                if (lllIIIIIIllIIl(Bank.isOpen() ? 1 : 0)) {
                    if (!lllIIIIIIlllII(Inventory.getFreeSlots(), lIlIllIlIIIl[7])) {
                        Bank.withdrawAll(h, Bank.WithdrawMode.ITEM);
                        return lIlIllIlIIIl[1];
                    }
                    int[] iArr2 = new int[lIlIllIlIIIl[7]];
                    iArr2[lIlIllIlIIIl[0]] = first.getId();
                    iArr2[lIlIllIlIIIl[1]] = i2;
                    iArr2[lIlIllIlIIIl[3]] = lIlIllIlIIIl[8];
                    iArr2[lIlIllIlIIIl[9]] = lIlIllIlIIIl[10];
                    iArr2[lIlIllIlIIIl[11]] = lIlIllIlIIIl[12];
                    Bank.depositAllExcept(iArr2);
                    return lIlIllIlIIIl[1];
                }
                int[] iArr3 = new int[lIlIllIlIIIl[1]];
                iArr3[lIlIllIlIIIl[0]] = h;
                if (!lllIIIIIIllIII(Bank.contains(iArr3) ? 1 : 0) || lllIIIIIIllIIl(Bank.isEmpty() ? 1 : 0)) {
                    TileObject nearest = TileObjects.getNearest(tileObject -> {
                        if (lllIIIIIIllIIl(tileObject.getName().equals(lIlIllIlIIII[lIlIllIlIIIl[9]]) ? 1 : 0)) {
                            String[] strArr = new String[lIlIllIlIIIl[1]];
                            strArr[lIlIllIlIIIl[0]] = lIlIllIlIIII[lIlIllIlIIIl[11]];
                            if (lllIIIIIIllIIl(tileObject.hasAction(strArr) ? 1 : 0)) {
                                ?? r02 = lIlIllIlIIIl[1];
                                "".length();
                                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r02;
                            }
                        }
                        return lIlIllIlIIIl[0];
                    });
                    if (lllIIIIIIlllIl(nearest) && lllIIIIIIllllI(Players.getLocal().distanceTo(nearest), lIlIllIlIIIl[13])) {
                        Movement.setDestination(nearest.getWorldLocation());
                        return lIlIllIlIIIl[1];
                    }
                    Bank.open();
                    "".length();
                    return lIlIllIlIIIl[1];
                }
            }
            int[] iArr4 = new int[lIlIllIlIIIl[1]];
            iArr4[lIlIllIlIIIl[0]] = i2;
            Item first3 = Inventory.getFirst(iArr4);
            if (lllIIIIIIllIlI(first3)) {
                return lIlIllIlIIIl[0];
            }
            first3.useOn(first);
            return lIlIllIlIIIl[1];
        }
        return lIlIllIlIIIl[0];
    }

    private static boolean lllIIIIIIllIIl(int i) {
        return i != 0;
    }
}
