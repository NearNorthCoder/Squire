package o.c.k.i.p000.l.o.f.p001.n.c.t.e.s;

import gg.squire.account.AccBuilderSotf;
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
/* renamed from: o.c.k.i.-.l.o.f.-.n.c.t.e.s.g  reason: invalid package and case insensitive filesystem */
/* loaded from: 7c1d3521-d222-494e-8c51-697efca0674b.jar:o/c/k/i/-/l/o/f/-/n/c/t/e/s/g.class */
public class C0020g {
    private static final /* synthetic */ int bo;
    private static final /* synthetic */ int bp;
    private static final /* synthetic */ int[] bs;
    private static final /* synthetic */ int bq;
    private static final /* synthetic */ int br;
    private static /* synthetic */ String[] llIlllIlIl;
    private static final /* synthetic */ int bn;
    private static /* synthetic */ int[] llIlllIllI;

    private static boolean lIlllIlIIlIIl(int i) {
        return i != 0;
    }

    private static boolean lIlllIlIIIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIlllIlIIIlll(int i) {
        return i == 0;
    }

    public static void a(String[] strArr) {
        if (lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static String lIlllIlIIIIlI(String llllllllllllllllllIIIIIlIIIIllII, String llllllllllllllllllIIIIIlIIIIlIll) {
        try {
            SecretKeySpec llllllllllllllllllIIIIIlIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIIlIIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIlllIllI[6], llllllllllllllllllIIIIIlIIIIllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIlIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIIlIIIIllIl) {
            llllllllllllllllllIIIIIlIIIIllIl.printStackTrace();
            return null;
        }
    }

    public static void a(String str, String[] strArr) {
        if (lIlllIlIIIllI(C0018e.j(llIlllIllI[0]), llIlllIllI[1]) && lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) && lIlllIlIIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[llIlllIllI[2]];
            strArr2[llIlllIllI[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIlllIlIIlIII(all.size())) {
                ((NPC) all.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[3]]);
                Time.sleepTicks(llIlllIllI[4]);
                "".length();
            }
        }
        if (lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[llIlllIllI[2]];
            strArr3[llIlllIllI[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIlllIlIIlIII(all2.size())) {
                ((NPC) all2.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[2]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, llIlllIllI[5]);
                "".length();
            }
        }
        if (lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0) && lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) && lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && !lIlllIlIIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderSotf.c = llIlllIlIl[llIlllIllI[6]];
        if (lIlllIlIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    private static void lIlllIlIIIlII() {
        llIlllIlIl = new String[llIlllIllI[16]];
        llIlllIlIl[llIlllIllI[3]] = lIlllIlIIIIIl("Xma5CL1Tb/g=", "eqlPF");
        llIlllIlIl[llIlllIllI[2]] = lIlllIlIIIIlI("eyKy9y49C/g=", "IzRfk");
        llIlllIlIl[llIlllIllI[6]] = lIlllIlIIIIll("Nx05FjkdGzFZLh0UOhYt", "tuVyJ");
        llIlllIlIl[llIlllIllI[7]] = lIlllIlIIIIll("LTMPKEINPQ==", "yRcCo");
        llIlllIlIl[llIlllIllI[8]] = lIlllIlIIIIlI("AD7hN9gmFKI=", "LHftn");
        llIlllIlIl[llIlllIllI[4]] = lIlllIlIIIIll("Nx4HFTodGA9aLR0XBBUu", "tvhzI");
        llIlllIlIl[llIlllIllI[9]] = lIlllIlIIIIll("FRchKmo1GQ==", "AvMAG");
        llIlllIlIl[llIlllIllI[10]] = lIlllIlIIIIIl("VKZbBmcc6zuPyUWXVsa3wQ==", "VjyuO");
    }

    static {
        lIlllIlIIIlIl();
        lIlllIlIIIlII();
        bn = llIlllIllI[11];
        bq = llIlllIllI[12];
        bo = llIlllIllI[13];
        br = llIlllIllI[14];
        bp = llIlllIllI[15];
        int[] iArr = new int[llIlllIllI[4]];
        iArr[llIlllIllI[3]] = llIlllIllI[11];
        iArr[llIlllIllI[2]] = llIlllIllI[13];
        iArr[llIlllIllI[6]] = llIlllIllI[15];
        iArr[llIlllIllI[7]] = llIlllIllI[12];
        iArr[llIlllIllI[8]] = llIlllIllI[14];
        bs = iArr;
    }

    private static boolean lIlllIlIIlIII(int i) {
        return i > 0;
    }

    private static void lIlllIlIIIlIl() {
        llIlllIllI = new int[17];
        llIlllIllI[0] = (-5703) & 5983;
        llIlllIllI[1] = (-9223) & 10222;
        llIlllIllI[2] = " ".length();
        llIlllIllI[3] = ((((125 + 140) - 249) + 150) ^ (((7 + 49) - (-67)) + 60)) & (((((181 + 103) - 75) + 2) ^ (((164 + 9) - 44) + 65)) ^ (-" ".length()));
        llIlllIllI[4] = 176 ^ 181;
        llIlllIllI[5] = (-((-25) & 9305)) & (-4) & 12283;
        llIlllIllI[6] = "  ".length();
        llIlllIllI[7] = "   ".length();
        llIlllIllI[8] = 119 ^ 115;
        llIlllIllI[9] = 153 ^ 159;
        llIlllIllI[10] = 102 ^ 97;
        llIlllIllI[11] = (((211 ^ 155) + (80 ^ 122)) - (-"   ".length())) + (127 ^ 51);
        llIlllIllI[12] = (((((92 + 165) - 233) + 179) + (230 ^ 131)) - (((7 + 77) - 8) + 71)) + (96 ^ 94);
        llIlllIllI[13] = (((((77 + 196) - 272) + 207) + (120 ^ 52)) - (27 ^ 109)) + (228 ^ 165);
        llIlllIllI[14] = ((57 + 152) - 181) + 201;
        llIlllIllI[15] = ((15 + 174) - 174) + 202;
        llIlllIllI[16] = 152 ^ 144;
    }

    private static String lIlllIlIIIIIl(String llllllllllllllllllIIIIIlIIIllIIl, String llllllllllllllllllIIIIIlIIIllIII) {
        try {
            SecretKeySpec llllllllllllllllllIIIIIlIIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllllIIIIIlIIIllIII.getBytes(StandardCharsets.UTF_8)), llIlllIllI[16]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIlllIllI[6], llllllllllllllllllIIIIIlIIIlllII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllllIIIIIlIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllllIIIIIlIIIllIlI) {
            llllllllllllllllllIIIIIlIIIllIlI.printStackTrace();
            return null;
        }
    }

    public static void b(String str, String[] strArr) {
        if (lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr2 = new String[llIlllIllI[2]];
            strArr2[llIlllIllI[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIlllIlIIlIII(all.size())) {
                ((NPC) all.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[9]]);
                Time.sleepUntil(() -> {
                    return Dialog.isOpen();
                }, llIlllIllI[5]);
                "".length();
            }
        }
        do {
            if (lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0) && lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) && lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && !lIlllIlIIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
                return;
            }
            try {
                AccBuilderSotf.c = llIlllIlIl[llIlllIllI[10]];
                if (lIlllIlIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
                    Dialog.close();
                }
                if (lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.chooseOption(strArr);
                    "".length();
                }
                if (!lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
                    Dialog.continueSpace();
                }
                Time.sleepTicks(llIlllIllI[2]);
                "".length();
                "".length();
                if ((true ^ true) & ((true ^ true) ^ true)) {
                    return;
                }
            } catch (Exception e) {
            }
            Time.sleepTicks(llIlllIllI[2]);
            "".length();
            "".length();
        } while (0 == 0);
    }

    private static String lIlllIlIIIIll(String llllllllllllllllllIIIIIIllllllII, String llllllllllllllllllIIIIIIlllllIll) {
        String llllllllllllllllllIIIIIIllllllII2 = new String(Base64.getDecoder().decode(llllllllllllllllllIIIIIIllllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllllIIIIIIlllllIlI = new StringBuilder();
        char[] charArray = llllllllllllllllllIIIIIIlllllIll.toCharArray();
        int llllllllllllllllllIIIIIIlllllIII = llIlllIllI[3];
        char[] charArray2 = llllllllllllllllllIIIIIIllllllII2.toCharArray();
        int length = charArray2.length;
        int i = llIlllIllI[3];
        while (lIlllIlIIIllI(i, length)) {
            llllllllllllllllllIIIIIIlllllIlI.append((char) (charArray2[i] ^ charArray[llllllllllllllllllIIIIIIlllllIII % charArray.length]));
            "".length();
            llllllllllllllllllIIIIIIlllllIII++;
            i++;
            "".length();
            if (!((true ^ true) ^ (true ^ true))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllllIIIIIIlllllIlI);
    }

    public static void a(String str, String[] strArr, boolean z) {
        if (lIlllIlIIIllI(C0018e.j(llIlllIllI[0]), llIlllIllI[1]) && lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) && lIlllIlIIIlll(Dialog.isViewingOptions() ? 1 : 0)) {
            String[] strArr2 = new String[llIlllIllI[2]];
            strArr2[llIlllIllI[3]] = str;
            List all = NPCs.getAll(strArr2);
            if (lIlllIlIIlIII(all.size())) {
                ((NPC) all.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[7]]);
                Time.sleepTicks(llIlllIllI[4]);
                "".length();
            }
        }
        if (lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0)) {
            String[] strArr3 = new String[llIlllIllI[2]];
            strArr3[llIlllIllI[3]] = str;
            List all2 = NPCs.getAll(strArr3);
            if (lIlllIlIIlIII(all2.size())) {
                if (lIlllIlIIIlll(Reachable.isInteractable((Locatable) all2.get(llIlllIllI[3])) ? 1 : 0)) {
                    Movement.walkTo(((NPC) all2.get(llIlllIllI[3])).getWorldLocation());
                    "".length();
                    Time.sleepTicks(llIlllIllI[2]);
                    "".length();
                }
                if (lIlllIlIIlIIl(Reachable.isInteractable((Locatable) all2.get(llIlllIllI[3])) ? 1 : 0)) {
                    ((NPC) all2.get(llIlllIllI[3])).interact(llIlllIlIl[llIlllIllI[8]]);
                    Time.sleepUntil(() -> {
                        return Dialog.isOpen();
                    }, llIlllIllI[5]);
                    "".length();
                }
            }
        }
        if (lIlllIlIIIlll(Dialog.isOpen() ? 1 : 0) && lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0) && lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && !lIlllIlIIlIIl(Dialog.isViewingOptions() ? 1 : 0)) {
            return;
        }
        AccBuilderSotf.c = llIlllIlIl[llIlllIllI[4]];
        if (lIlllIlIIlIIl(Dialog.isEnterInputOpen() ? 1 : 0)) {
            Dialog.close();
        }
        if (lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) && lIlllIlIIIlll(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(strArr);
            "".length();
        }
        if (!lIlllIlIIIlll(Dialog.canContinueNPC() ? 1 : 0) || lIlllIlIIlIIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.continueSpace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    public static boolean M() {
        int i = llIlllIllI[3];
        while (lIlllIlIIIllI(i, bs.length)) {
            List list = Widgets.get(bs[i]);
            if (lIlllIlIIIlll(list.isEmpty() ? 1 : 0) && lIlllIlIIlIIl(((Widget) list.get(llIlllIllI[3])).isVisible() ? 1 : 0)) {
                System.out.println("Found Conversation window :" + bs[i]);
                return llIlllIllI[2];
            }
            i++;
            "".length();
            if (0 != 0) {
                return ((22 ^ 5) ^ (178 ^ 184)) & (((27 ^ 88) ^ (228 ^ 190)) ^ (-" ".length()));
            }
        }
        return llIlllIllI[3];
    }
}
