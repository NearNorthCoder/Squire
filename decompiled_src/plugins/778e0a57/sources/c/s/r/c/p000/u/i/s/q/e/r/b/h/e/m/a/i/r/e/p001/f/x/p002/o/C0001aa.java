package c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Withdrawing items", priority = 19000, blocking = true)
/* renamed from: c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aa  reason: invalid package and case insensitive filesystem */
/* loaded from: 778e0a57-7760-4510-94d3-2c1213879e48.jar:c/s/r/c/-/u/i/s/q/e/r/b/h/e/m/a/i/r/e/-/f/x/-/o/aa.class */
public class C0001aa extends Y {
    private static /* synthetic */ int[] lIlIIllIIlll;
    private static /* synthetic */ String[] lIlIIllIIllI;
    private final /* synthetic */ int cz = lIlIIllIIlll[0];

    private static boolean llIllIlIIlIIIl(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    private boolean cs() {
        int[] iArr = new int[lIlIIllIIlll[3]];
        iArr[lIlIIllIIlll[1]] = lIlIIllIIlll[4];
        if (llIllIlIIIllIl(Inventory.contains(iArr) ? 1 : 0)) {
            return lIlIIllIIlll[1];
        }
        if (llIllIlIIlIIII(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
            return lIlIIllIIlll[3];
        } else if (llIllIlIIlIIII(Dialog.isViewingOptions() ? 1 : 0) && llIllIlIIlIIII(Dialog.hasOption(lIlIIllIIllI[lIlIIllIIlll[7]]) ? 1 : 0) && llIllIlIIlIIII(Dialog.hasOption(lIlIIllIIllI[lIlIIllIIlll[5]]) ? 1 : 0)) {
            String[] strArr = new String[lIlIIllIIlll[3]];
            strArr[lIlIIllIIlll[1]] = lIlIIllIIllI[lIlIIllIIlll[8]];
            Dialog.chooseOption(strArr);
            "".length();
            return lIlIIllIIlll[3];
        } else {
            Widget widget = Widgets.get(lIlIIllIIlll[9], lIlIIllIIlll[10], lIlIIllIIlll[1]);
            if (llIllIlIIIlllI(widget) && llIllIlIIlIIII(widget.isVisible() ? 1 : 0) && llIllIlIIlIIII(widget.getText().contains(lIlIIllIIllI[lIlIIllIIlll[6]]) ? 1 : 0)) {
                Widget widget2 = Widgets.get(lIlIIllIIlll[9], lIlIIllIIlll[10]);
                if (llIllIlIIlIIIl(widget2)) {
                    return lIlIIllIIlll[1];
                }
                widget2.interact(lIlIIllIIllI[lIlIIllIIlll[2]]);
                return lIlIIllIIlll[3];
            }
            Widget widget3 = Static.getClient().getWidget(lIlIIllIIlll[0]);
            if (llIllIlIIIlllI(widget3)) {
                widget3.interact(lIlIIllIIlll[3], lIlIIllIIlll[11], lIlIIllIIlll[12], lIlIIllIIlll[0]);
                return lIlIIllIIlll[3];
            }
            int[] iArr2 = new int[lIlIIllIIlll[3]];
            iArr2[lIlIIllIIlll[1]] = lIlIIllIIlll[4];
            Item first = Inventory.getFirst(iArr2);
            if (llIllIlIIlIIIl(first)) {
                return lIlIIllIIlll[1];
            }
            first.interact(lIlIIllIIllI[lIlIIllIIlll[13]]);
            return lIlIIllIIlll[3];
        }
    }

    private static boolean llIllIlIIIllll(int i, int i2) {
        return i > i2;
    }

    private static boolean llIllIlIIIlllI(Object obj) {
        return obj != null;
    }

    private static String llIllIlIIIlIlI(String lllllllllllllllIllIllIIIlIIllIII, String lllllllllllllllIllIllIIIlIIlIlll) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIIlIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIlIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIllIIIlIIllIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIllIIIlIIllIlI.init(lIlIIllIIlll[7], lllllllllllllllIllIllIIIlIIllIll);
            return new String(lllllllllllllllIllIllIIIlIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIlIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIIlIIllIIl) {
            lllllllllllllllIllIllIIIlIIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlIIlIIlI(int i, int i2) {
        return i < i2;
    }

    private static void llIllIlIIIllII() {
        lIlIIllIIlll = new int[17];
        lIlIIllIIlll[0] = (-8197) & 15736846;
        lIlIIllIIlll[1] = ((((144 + 110) - 77) + 74) ^ (((35 + 67) - 59) + 125)) & (((((144 + 170) - 122) + 10) ^ (((115 + 129) - 129) + 38)) ^ (-" ".length()));
        lIlIIllIIlll[2] = 176 ^ 182;
        lIlIIllIIlll[3] = " ".length();
        lIlIIllIIlll[4] = (-9433) & 30459;
        lIlIIllIIlll[5] = "   ".length();
        lIlIIllIIlll[6] = (55 ^ 122) ^ (36 ^ 108);
        lIlIIllIIlll[7] = "  ".length();
        lIlIIllIIlll[8] = (188 ^ 166) ^ (85 ^ 75);
        lIlIIllIIlll[9] = ((208 + 225) - 292) + 99;
        lIlIIllIIlll[10] = (((75 + 97) - 65) + 20) ^ (78 ^ 43);
        lIlIIllIIlll[11] = (((130 + 77) - 63) + 4) ^ (((132 + 56) - 49) + 34);
        lIlIIllIIlll[12] = -" ".length();
        lIlIIllIIlll[13] = 42 ^ 45;
        lIlIIllIIlll[14] = 126 ^ 118;
        lIlIIllIIlll[15] = 146 ^ 155;
        lIlIIllIIlll[16] = (21 ^ 119) ^ (80 ^ 56);
    }

    private static String llIllIlIIIlIII(String lllllllllllllllIllIllIIIlIlIIlIl, String lllllllllllllllIllIllIIIlIlIIlII) {
        try {
            SecretKeySpec lllllllllllllllIllIllIIIlIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIllIIIlIlIIlII.getBytes(StandardCharsets.UTF_8)), lIlIIllIIlll[14]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIllIIlll[7], lllllllllllllllIllIllIIIlIlIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIllIIIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIllIllIIIlIlIIllI) {
            lllllllllllllllIllIllIIIlIlIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlIIlIIII(int i) {
        return i != 0;
    }

    private static void llIllIlIIIlIll() {
        lIlIIllIIllI = new String[lIlIIllIIlll[16]];
        lIlIIllIIllI[lIlIIllIIlll[1]] = llIllIlIIIlIII("HII2Wz28uokskFq+166vWXfzdMM9VEYJp2So1xY/XTE=", "xzFQf");
        lIlIIllIIllI[lIlIIllIIlll[3]] = llIllIlIIIlIIl("KREHMwUFF0k+DQIcDDxMXlAdMQEOA0kxAksRSSoDHFxJKxgEABkxAgw=", "kpiXl");
        lIlIIllIIllI[lIlIIllIIlll[7]] = llIllIlIIIlIII("aafABLttQHo=", "cwoOs");
        lIlIIllIIllI[lIlIIllIIlll[5]] = llIllIlIIIlIII("QpsDYqmh8sE4ksW9EsKGSg==", "pTbIe");
        lIlIIllIIllI[lIlIIllIIlll[8]] = llIllIlIIIlIlI("osAuS4gZWZk=", "yRhvG");
        lIlIIllIIllI[lIlIIllIIlll[6]] = llIllIlIIIlIIl("DxY8ET8oASs=", "GsNsS");
        lIlIIllIIllI[lIlIIllIIlll[2]] = llIllIlIIIlIlI("xVsx0xnqqik=", "hjWeZ");
        lIlIIllIIllI[lIlIIllIIlll[13]] = llIllIlIIIlIlI("C9BpP0V1+10=", "qpZXH");
        lIlIIllIIllI[lIlIIllIIlll[14]] = llIllIlIIIlIIl("EQgoMXIwASMpJg==", "SiFZR");
        lIlIIllIIllI[lIlIIllIIlll[15]] = llIllIlIIIlIlI("L0MxvYLAfng=", "cVJpS");
    }

    static {
        llIllIlIIIllII();
        llIllIlIIIlIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v14, types: [boolean] */
    @Override // c.s.r.c.p000.u.i.s.q.e.r.b.h.e.m.a.i.r.e.p001.f.x.p002.o.Y
    public boolean cg() {
        if (!llIllIlIIIllIl(cr() ? 1 : 0) && !llIllIlIIIllIl(cw ? 1 : 0)) {
            TileObject nearest = TileObjects.getNearest(tileObject -> {
                if (llIllIlIIlIIII(tileObject.getName().equals(lIlIIllIIllI[lIlIIllIIlll[14]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIIllIIlll[3]];
                    strArr[lIlIIllIIlll[1]] = lIlIIllIIllI[lIlIIllIIlll[15]];
                    if (llIllIlIIlIIII(tileObject.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIlIIllIIlll[3];
                        "".length();
                        return (-" ".length()) > 0 ? ((((24 + 237) - 182) + 160) ^ (((79 + 15) - (-12)) + 73)) & (((37 ^ 106) ^ (10 ^ 25)) ^ (-" ".length())) : r0;
                    }
                }
                return lIlIIllIIlll[1];
            });
            if (llIllIlIIIlllI(nearest) && llIllIlIIIllll(Players.getLocal().distanceTo(nearest), lIlIIllIIlll[2])) {
                Movement.setDestination(nearest.getWorldLocation());
                return lIlIIllIIlll[3];
            }
            int[] iArr = new int[lIlIIllIIlll[3]];
            iArr[lIlIIllIIlll[1]] = lIlIIllIIlll[4];
            if (llIllIlIIlIIII(Inventory.contains(iArr) ? 1 : 0)) {
                cs();
                "".length();
                return lIlIIllIIlll[3];
            } else if (llIllIlIIlIIIl(q())) {
                Log.error(lIlIIllIIllI[lIlIIllIIlll[1]]);
                return lIlIIllIIlll[1];
            } else if (!llIllIlIIIllIl(q().needsToBank() ? 1 : 0)) {
                if (llIllIlIIIllIl(BankLoadouts.withdrawWithRetries(q(), lIlIIllIIlll[6]).booleanValue() ? 1 : 0)) {
                    Log.info(lIlIIllIIllI[lIlIIllIIlll[3]]);
                    return lIlIIllIIlll[1];
                }
                sleep(lIlIIllIIlll[7]);
                return lIlIIllIIlll[3];
            } else if (llIllIlIIIllIl(Bank.isOpen() ? 1 : 0)) {
                this.v.b((boolean) lIlIIllIIlll[1]);
                return lIlIIllIIlll[1];
            } else {
                Bank.close();
                sleep(lIlIIllIIlll[5]);
                return lIlIIllIIlll[3];
            }
        }
        return lIlIIllIIlll[1];
    }

    private static String llIllIlIIIlIIl(String lllllllllllllllIllIllIIIlIIIlIII, String lllllllllllllllIllIllIIIlIIIIlll) {
        String lllllllllllllllIllIllIIIlIIIlIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIllIllIIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIllIllIIIlIIIIlll.toCharArray();
        int lllllllllllllllIllIllIIIIlllllll = lIlIIllIIlll[1];
        char[] charArray2 = lllllllllllllllIllIllIIIlIIIlIII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIIllIIlll[1];
        while (llIllIlIIlIIlI(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllIllIllIIIIlllllll % charArray.length]));
            "".length();
            lllllllllllllllIllIllIIIIlllllll++;
            i++;
            "".length();
            if ((true ^ true) != (true ^ true)) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIllIlIIIllIl(int i) {
        return i == 0;
    }
}
