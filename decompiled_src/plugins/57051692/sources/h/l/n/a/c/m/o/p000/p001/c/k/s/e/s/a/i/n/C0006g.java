package h.l.n.a.c.m.o.p000.p001.c.k.s.e.s.a.i.n;

import gg.squire.account.AccBuilderShamans;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
/* renamed from: h.l.n.a.c.m.o.-.-.c.k.s.e.s.a.i.n.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 57051692-5fea-40a8-a012-903ac1ab23ac.jar:h/l/n/a/c/m/o/-/-/c/k/s/e/s/a/i/n/g.class */
public class C0006g {
    private static final /* synthetic */ int bk;
    private static final /* synthetic */ int bl;
    private static final /* synthetic */ int bh;
    private static /* synthetic */ String[] lIlIllllIl;
    private static final /* synthetic */ int[] bm;
    private static final /* synthetic */ int bj;
    private static /* synthetic */ int[] lIlIlllllI;
    private static final /* synthetic */ int bi;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean K() {
        int i = lIlIlllllI[3];
        while (lIIlIlIIllIII(i, bm.length)) {
            List list = Widgets.get(bm[i]);
            if (lIIlIlIIllIIl(list.isEmpty() ? 1 : 0) && lIIlIlIIllIll(((Widget) list.get(lIlIlllllI[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bm[i]);
                return lIlIlllllI[2];
            }
            i++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return lIlIlllllI[3];
    }

    private static void lIIlIlIIlIlll() {
        lIlIlllllI = new int[17];
        lIlIlllllI[0] = (-7745) & 8025;
        lIlIlllllI[1] = (-3093) & 4092;
        lIlIlllllI[2] = " ".length();
        lIlIlllllI[3] = (238 ^ 181) & ((241 ^ 170) ^ (-1));
        lIlIlllllI[4] = (((20 + 172) - 7) + 7) ^ (((28 + 114) - (-48)) + 7);
        lIlIlllllI[5] = (-5122) & 8121;
        lIlIlllllI[6] = "  ".length();
        lIlIlllllI[7] = "   ".length();
        lIlIlllllI[8] = (19 ^ 114) ^ (66 ^ 39);
        lIlIlllllI[9] = (((160 + 57) - 172) + 136) ^ (((143 + 147) - 224) + 113);
        lIlIlllllI[10] = 103 ^ 96;
        lIlIlllllI[11] = ((211 + 197) - 201) + 22;
        lIlIlllllI[12] = ((51 + 224) - 106) + 62;
        lIlIlllllI[13] = ((149 + 162) - 95) + 1;
        lIlIlllllI[14] = (((((123 + 59) - 141) + 90) + (((85 + 131) - 118) + 41)) - (((94 + 61) - 65) + 68)) + (64 ^ 43);
        lIlIlllllI[15] = (((((0 + 23) - (-20)) + 94) + (155 ^ 197)) - (((93 + 126) - 115) + 62)) + ((15 + 28) - (-54)) + 31;
        lIlIlllllI[16] = (((143 + 144) - 157) + 40) ^ (((46 + 62) - 4) + 58);
    }

    public static void a(String str, String[] strArr) {
        if (lIIlIlIIllIII(C0004e.j(lIlIlllllI[0]), lIlIlllllI[1]) && lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0) && lIIlIlIIllIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[lIlIlllllI[2]];
            strArr2[lIlIlllllI[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIIlIlIIllIlI(all.size())) {
                ((NPC) all.get(lIlIlllllI[3])).interact(lIlIllllIl[lIlIlllllI[3]]);
                Time.sleepTicks(lIlIlllllI[4]);
                "".length();
            }
        }
        if (lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[lIlIlllllI[2]];
            strArr3[lIlIlllllI[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIIlIlIIllIlI(all2.size())) {
                ((NPC) all2.get(lIlIlllllI[3])).interact(lIlIllllIl[lIlIlllllI[2]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, lIlIlllllI[5]);
                "".length();
            }
        }
        if (lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0) && lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0) && lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && !lIIlIlIIllIll(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderShamans.c = lIlIllllIl[lIlIlllllI[6]];
        if (lIIlIlIIllIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || lIIlIlIIllIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static boolean lIIlIlIIllIII(int i, int i2) {
        return i < i2;
    }

    public static void b(String str, String[] strArr) {
        if (lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr2 = new String[lIlIlllllI[2]];
            strArr2[lIlIlllllI[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIIlIlIIllIlI(all.size())) {
                ((NPC) all.get(lIlIlllllI[3])).interact(lIlIllllIl[lIlIlllllI[9]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, lIlIlllllI[5]);
                "".length();
            }
        }
        do {
            if (lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0) && lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0) && lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && !lIIlIlIIllIll(Dialog.isViewingOptions() ? 1 : 0)) {
                return;
            }
            try {
                AccBuilderShamans.c = lIlIllllIl[lIlIlllllI[10]];
                if (lIIlIlIIllIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.chooseOption(strArr);
                    "".length();
                }
                if (!lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || lIIlIlIIllIll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks(lIlIlllllI[2]);
                "".length();
                "".length();
                if (0 != 0) {
                    return;
                }
            } catch (Exception e) {
            }
            Time.sleepTicks(lIlIlllllI[2]);
            "".length();
            "".length();
        } while ("   ".length() > 0);
    }

    static {
        lIIlIlIIlIlll();
        lIIlIlIIlIllI();
        bl = lIlIlllllI[11];
        bi = lIlIlllllI[12];
        bj = lIlIlllllI[13];
        bk = lIlIlllllI[14];
        bh = lIlIlllllI[15];
        int[] iArr = new int[lIlIlllllI[4]];
        iArr[lIlIlllllI[3]] = lIlIlllllI[15];
        iArr[lIlIlllllI[2]] = lIlIlllllI[12];
        iArr[lIlIlllllI[6]] = lIlIlllllI[13];
        iArr[lIlIlllllI[7]] = lIlIlllllI[14];
        iArr[lIlIlllllI[8]] = lIlIlllllI[11];
        bm = iArr;
    }

    private static boolean lIIlIlIIllIIl(int i) {
        return i == 0;
    }

    private static String lIIlIlIIlIlII(String lllllllllllllllllllIIlllIlIIIllI, String lllllllllllllllllllIIlllIlIIIlIl) {
        try {
            SecretKeySpec lllllllllllllllllllIIlllIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), lIlIlllllI[16]), "DES");
            Cipher lllllllllllllllllllIIlllIlIIlIII = Cipher.getInstance("DES");
            lllllllllllllllllllIIlllIlIIlIII.init(lIlIlllllI[6], lllllllllllllllllllIIlllIlIIlIIl);
            return new String(lllllllllllllllllllIIlllIlIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlllIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIlllIlIIIlll) {
            lllllllllllllllllllIIlllIlIIIlll.printStackTrace();
            return null;
        }
    }

    private static String lIIlIlIIlIIll(String lllllllllllllllllllIIlllIllIlIII, String lllllllllllllllllllIIlllIllIIlll) {
        String lllllllllllllllllllIIlllIllIlIII2 = new String(Base64.getDecoder().decode(lllllllllllllllllllIIlllIllIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllIIlllIllIIlll.toCharArray();
        int lllllllllllllllllllIIlllIlIlllll = lIlIlllllI[3];
        char[] charArray2 = lllllllllllllllllllIIlllIllIlIII2.toCharArray();
        int length = charArray2.length;
        int i = lIlIlllllI[3];
        while (lIIlIlIIllIII(i, length)) {
            sb.append((char) (charArray2[i] ^ charArray[lllllllllllllllllllIIlllIlIlllll % charArray.length]));
            "".length();
            lllllllllllllllllllIIlllIlIlllll++;
            i++;
            "".length();
            if ((-(158 ^ 155)) >= 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIIlIlIIlIlIl(String lllllllllllllllllllIIlllIlIlIIll, String lllllllllllllllllllIIlllIlIlIIlI) {
        try {
            SecretKeySpec lllllllllllllllllllIIlllIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllIIlllIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIlllllI[6], lllllllllllllllllllIIlllIlIlIllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllllllIIlllIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllIIlllIlIlIlII) {
            lllllllllllllllllllIIlllIlIlIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIllIll(int i) {
        return i != 0;
    }

    public static void a(String str, String[] strArr, boolean z) {
        if (lIIlIlIIllIII(C0004e.j(lIlIlllllI[0]), lIlIlllllI[1]) && lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0) && lIIlIlIIllIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[lIlIlllllI[2]];
            strArr2[lIlIlllllI[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIIlIlIIllIlI(all.size())) {
                ((NPC) all.get(lIlIlllllI[3])).interact(lIlIllllIl[lIlIlllllI[7]]);
                Time.sleepTicks(lIlIlllllI[4]);
                "".length();
            }
        }
        if (lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[lIlIlllllI[2]];
            strArr3[lIlIlllllI[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIIlIlIIllIlI(all2.size())) {
                if (lIIlIlIIllIIl(Reachable.isInteractable((Locatable) all2.get(lIlIlllllI[3])) ? 1 : 0)) {
                    Movement.walkTo(((NPC) all2.get(lIlIlllllI[3])).getWorldLocation());
                    "".length();
                    Time.sleepTicks(lIlIlllllI[2]);
                    "".length();
                }
                if (lIIlIlIIllIll(Reachable.isInteractable((Locatable) all2.get(lIlIlllllI[3])) ? 1 : 0)) {
                    ((NPC) all2.get(lIlIlllllI[3])).interact(lIlIllllIl[lIlIlllllI[8]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, lIlIlllllI[5]);
                    "".length();
                }
            }
        }
        if (lIIlIlIIllIIl(Dialog.isOpen() ? 1 : 0) && lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0) && lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && !lIIlIlIIllIll(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderShamans.c = lIlIllllIl[lIlIlllllI[4]];
        if (lIIlIlIIllIll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || lIIlIlIIllIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    public static void a(String[] strArr) {
        if (lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) && lIIlIlIIllIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIIlIlIIllIIl(Dialog.canContinueNPC() ? 1 : 0) || lIIlIlIIllIll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static void lIIlIlIIlIllI() {
        lIlIllllIl = new String[lIlIlllllI[16]];
        lIlIllllIl[lIlIlllllI[3]] = lIIlIlIIlIIll("LQsCEkINBQ==", "yjnyo");
        lIlIllllIl[lIlIlllllI[2]] = lIIlIlIIlIlII("s78+x4mqoE4=", "IvnYz");
        lIlIllllIl[lIlIlllllI[6]] = lIIlIlIIlIlIl("QSxnmvN/O/vUnT9UMzcQjQ==", "cUfJs");
        lIlIllllIl[lIlIlllllI[7]] = lIIlIlIIlIlII("MssZh2TMIzQ=", "xqLxR");
        lIlIllllIl[lIlIlllllI[8]] = lIIlIlIIlIlII("uhPQOoNyJ8k=", "WcVCy");
        lIlIllllIl[lIlIlllllI[4]] = lIIlIlIIlIIll("KAAiGDACBipXJwIJIRgk", "khMwC");
        lIlIllllIl[lIlIlllllI[9]] = lIIlIlIIlIlIl("swoVou/jxWg=", "gLotY");
        lIlIllllIl[lIlIlllllI[10]] = lIIlIlIIlIIll("GS0oGSUzKyBWMjMkKxkx", "ZEGvV");
    }

    private static boolean lIIlIlIIllIlI(int i) {
        return i > 0;
    }
}
