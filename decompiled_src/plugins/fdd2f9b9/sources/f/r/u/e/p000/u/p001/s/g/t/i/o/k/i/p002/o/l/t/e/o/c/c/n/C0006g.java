package f.r.u.e.p000.u.p001.s.g.t.i.o.k.i.p002.o.l.t.e.o.c.c.n;

import gg.squire.account.AccBuilderRogues;
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
/* renamed from: f.r.u.e.-.u.-.s.g.t.i.o.k.i.-.o.l.t.e.o.c.c.n.g  reason: invalid package and case insensitive filesystem */
/* loaded from: fdd2f9b9-6584-4a70-afa7-d1946c214094.jar:f/r/u/e/-/u/-/s/g/t/i/o/k/i/-/o/l/t/e/o/c/c/n/g.class */
public class C0006g {
    private static final /* synthetic */ int[] bn;
    private static final /* synthetic */ int bk;
    private static final /* synthetic */ int bi;
    private static final /* synthetic */ int bj;
    private static /* synthetic */ int[] lIIlllIlIl;
    private static final /* synthetic */ int bl;
    private static final /* synthetic */ int bm;
    private static /* synthetic */ String[] lIIlllIlII;

    public static void a(String str, String[] strArr) {
        if (lIIIIlIIlllII(C0004e.j(lIIlllIlIl[0]), lIIlllIlIl[1]) && lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) && lIIIIlIIlllIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[lIIlllIlIl[2]];
            strArr2[lIIlllIlIl[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIIIIlIIllllI(all.size())) {
                ((NPC) all.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[3]]);
                Time.sleepTicks(lIIlllIlIl[4]);
                "".length();
            }
        }
        if (lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[lIIlllIlIl[2]];
            strArr3[lIIlllIlIl[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIIIIlIIllllI(all2.size())) {
                ((NPC) all2.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[2]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, lIIlllIlIl[5]);
                "".length();
            }
        }
        if (lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0) && lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) && lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && !lIIIIlIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderRogues.c = lIIlllIlII[lIIlllIlIl[6]];
        if (lIIIIlIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || lIIIIlIIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    public static void b(String str, String[] strArr) {
        if (lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr2 = new String[lIIlllIlIl[2]];
            strArr2[lIIlllIlIl[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIIIIlIIllllI(all.size())) {
                ((NPC) all.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[9]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, lIIlllIlIl[5]);
                "".length();
            }
        }
        do {
            if (lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0) && lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) && lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && !lIIIIlIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
                return;
            }
            try {
                AccBuilderRogues.c = lIIlllIlII[lIIlllIlIl[10]];
                if (lIIIIlIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.chooseOption(strArr);
                    "".length();
                }
                if (!lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || lIIIIlIIlllll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks(lIIlllIlIl[2]);
                "".length();
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return;
                }
            } catch (Exception e) {
            }
            Time.sleepTicks(lIIlllIlIl[2]);
            "".length();
            "".length();
        } while (("  ".length() & ("  ".length() ^ (-" ".length()))) != (-" ".length()));
    }

    public static void a(String[] strArr) {
        if (lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || lIIIIlIIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static boolean lIIIIlIIllllI(int i) {
        return i > 0;
    }

    private static boolean lIIIIlIIlllII(int i, int i2) {
        return i < i2;
    }

    private static String lIIIIlIIllIIl(String lllllllllllllllllllllIIIIllllIlI, String lllllllllllllllllllllIIIIllllIIl) {
        try {
            SecretKeySpec lllllllllllllllllllllIIIIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIIIIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllllllllIIIIlllllII = Cipher.getInstance("Blowfish");
            lllllllllllllllllllllIIIIlllllII.init(lIIlllIlIl[6], lllllllllllllllllllllIIIIlllllIl);
            return new String(lllllllllllllllllllllIIIIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIIIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIIIIllllIll) {
            lllllllllllllllllllllIIIIllllIll.printStackTrace();
            return null;
        }
    }

    private static String lIIIIlIIlIlll(String lllllllllllllllllllllIIIlIIIllll, String lllllllllllllllllllllIIIlIIIlllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllllllllIIIlIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllllllllIIIlIIIlllI.toCharArray();
        int lllllllllllllllllllllIIIlIIIlIll = lIIlllIlIl[3];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIIlllIlIl[3];
        while (lIIIIlIIlllII(i, length)) {
            char lllllllllllllllllllllIIIlIIlIIII = charArray2[i];
            sb.append((char) (lllllllllllllllllllllIIIlIIlIIII ^ charArray[lllllllllllllllllllllIIIlIIIlIll % charArray.length]));
            "".length();
            lllllllllllllllllllllIIIlIIIlIll++;
            i++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public static void a(String str, String[] strArr, boolean z) {
        if (lIIIIlIIlllII(C0004e.j(lIIlllIlIl[0]), lIIlllIlIl[1]) && lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) && lIIIIlIIlllIl(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[lIIlllIlIl[2]];
            strArr2[lIIlllIlIl[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIIIIlIIllllI(all.size())) {
                ((NPC) all.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[7]]);
                Time.sleepTicks(lIIlllIlIl[4]);
                "".length();
            }
        }
        if (lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[lIIlllIlIl[2]];
            strArr3[lIIlllIlIl[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIIIIlIIllllI(all2.size())) {
                if (lIIIIlIIlllIl(Reachable.isInteractable((Locatable) all2.get(lIIlllIlIl[3])) ? 1 : 0)) {
                    Movement.walkTo(((NPC) all2.get(lIIlllIlIl[3])).getWorldLocation());
                    "".length();
                    Time.sleepTicks(lIIlllIlIl[2]);
                    "".length();
                }
                if (lIIIIlIIlllll(Reachable.isInteractable((Locatable) all2.get(lIIlllIlIl[3])) ? 1 : 0)) {
                    ((NPC) all2.get(lIIlllIlIl[3])).interact(lIIlllIlII[lIIlllIlIl[8]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, lIIlllIlIl[5]);
                    "".length();
                }
            }
        }
        if (lIIIIlIIlllIl(Dialog.isOpen() ? 1 : 0) && lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0) && lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && !lIIIIlIIlllll(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderRogues.c = lIIlllIlII[lIIlllIlIl[4]];
        if (lIIIIlIIlllll(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) && lIIIIlIIlllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIIIIlIIlllIl(Dialog.canContinueNPC() ? 1 : 0) || lIIIIlIIlllll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    static {
        lIIIIlIIllIll();
        lIIIIlIIllIlI();
        bl = lIIlllIlIl[11];
        bm = lIIlllIlIl[12];
        bj = lIIlllIlIl[13];
        bi = lIIlllIlIl[14];
        bk = lIIlllIlIl[15];
        int[] iArr = new int[lIIlllIlIl[4]];
        iArr[lIIlllIlIl[3]] = lIIlllIlIl[14];
        iArr[lIIlllIlIl[2]] = lIIlllIlIl[13];
        iArr[lIIlllIlIl[6]] = lIIlllIlIl[15];
        iArr[lIIlllIlIl[7]] = lIIlllIlIl[11];
        iArr[lIIlllIlIl[8]] = lIIlllIlIl[12];
        bn = iArr;
    }

    private static void lIIIIlIIllIll() {
        lIIlllIlIl = new int[17];
        lIIlllIlIl[0] = (-((-65) & 22213)) & (-10273) & 32701;
        lIIlllIlIl[1] = (-23571) & 24570;
        lIIlllIlIl[2] = " ".length();
        lIIlllIlIl[3] = (50 ^ 127) & ((74 ^ 7) ^ (-1));
        lIIlllIlIl[4] = (((93 + 74) - 96) + 104) ^ (((63 + 117) - 56) + 46);
        lIIlllIlIl[5] = (-4166) & 7165;
        lIIlllIlIl[6] = "  ".length();
        lIIlllIlIl[7] = "   ".length();
        lIIlllIlIl[8] = (199 ^ 169) ^ (236 ^ 134);
        lIIlllIlIl[9] = 155 ^ 157;
        lIIlllIlIl[10] = (86 ^ 65) ^ (173 ^ 189);
        lIIlllIlIl[11] = ((155 + 22) - 82) + 124;
        lIIlllIlIl[12] = (((126 ^ 13) + (39 ^ 127)) - (((38 + 163) - 150) + 115)) + ((170 + 21) - 173) + 174;
        lIIlllIlIl[13] = ((153 + 164) - 159) + 73;
        lIIlllIlIl[14] = (((219 ^ 183) + (195 ^ 131)) - (((106 + 124) - 123) + 33)) + ((140 + 53) - 122) + 90;
        lIIlllIlIl[15] = ((154 + 20) - (-13)) + 30;
        lIIlllIlIl[16] = 164 ^ 172;
    }

    private static void lIIIIlIIllIlI() {
        lIIlllIlII = new String[lIIlllIlIl[16]];
        lIIlllIlII[lIIlllIlIl[3]] = lIIIIlIIlIlll("AjIBHGciPA==", "VSmwJ");
        lIIlllIlII[lIIlllIlIl[2]] = lIIIIlIIllIII("g4qyBd/n7Is=", "rKGgM");
        lIIlllIlII[lIIlllIlIl[6]] = lIIIIlIIllIII("V/8Dh89VkhYbNCl7Vb/Zdg==", "VWxWQ");
        lIIlllIlII[lIIlllIlIl[7]] = lIIIIlIIllIIl("y0zcqAREIV8=", "hbyNK");
        lIIlllIlII[lIIlllIlIl[8]] = lIIIIlIIllIIl("Kcy/OjezWgA=", "GJClW");
        lIIlllIlII[lIIlllIlIl[4]] = lIIIIlIIlIlll("CzIfFjQhNBdZIyE7HBYg", "HZpyG");
        lIIlllIlII[lIIlllIlIl[9]] = lIIIIlIIlIlll("Lig7OGQOJg==", "zIWSI");
        lIIlllIlII[lIIlllIlIl[10]] = lIIIIlIIllIIl("4Kf50QJmWtKcxPLlwaf6PQ==", "WBfIj");
    }

    private static boolean lIIIIlIIlllIl(int i) {
        return i == 0;
    }

    private static boolean lIIIIlIIlllll(int i) {
        return i != 0;
    }

    private static String lIIIIlIIllIII(String lllllllllllllllllllllIIIlIIlllll, String lllllllllllllllllllllIIIlIIllllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllllllllIIIlIIllllI.getBytes(StandardCharsets.UTF_8)), lIIlllIlIl[16]), "DES");
            Cipher lllllllllllllllllllllIIIlIlIIIIl = Cipher.getInstance("DES");
            lllllllllllllllllllllIIIlIlIIIIl.init(lIIlllIlIl[6], secretKeySpec);
            return new String(lllllllllllllllllllllIIIlIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllllllllIIIlIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllllllllIIIlIlIIIII) {
            lllllllllllllllllllllIIIlIlIIIII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean K() {
        int lllllllllllllllllllllIIIlIlIlIII = lIIlllIlIl[3];
        while (lIIIIlIIlllII(lllllllllllllllllllllIIIlIlIlIII, bn.length)) {
            List list = Widgets.get(bn[lllllllllllllllllllllIIIlIlIlIII]);
            if (lIIIIlIIlllIl(list.isEmpty() ? 1 : 0) && lIIIIlIIlllll(((Widget) list.get(lIIlllIlIl[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bn[lllllllllllllllllllllIIIlIlIlIII]);
                return lIIlllIlIl[2];
            }
            lllllllllllllllllllllIIIlIlIlIII++;
            "".length();
            if ("  ".length() < 0) {
                return ((((39 + 6) - (-13)) + 97) ^ (((42 + 130) - 164) + 149)) & (((34 ^ 88) ^ (31 ^ 99)) ^ (-" ".length()));
            }
        }
        return lIIlllIlIl[3];
    }
}
