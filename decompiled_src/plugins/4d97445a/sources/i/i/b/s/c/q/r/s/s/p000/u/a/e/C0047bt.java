package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.questing.SquireQuestHelper;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Talking to NPC", priority = 10, blocking = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bt  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bt.class */
public class C0047bt extends Task {
    private /* synthetic */ int fW;
    private static /* synthetic */ int[] llllIllll;
    private static /* synthetic */ String[] llllIlllI;
    private final /* synthetic */ SquireQuestHelper fV;

    private static boolean llIlIIlIllI(int i2) {
        return i2 != 0;
    }

    private static boolean llIlIIllIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llIlIIllIII(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v61, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    public boolean run() {
        if ((!llIlIIlIllI(Dialog.isOpen() ? 1 : 0) || !llIlIIlIlll(this.fV.cu() ? 1 : 0)) && !llIlIIlIlll(this.fV.cz().equals(llllIlllI[llllIllll[0]]) ? 1 : 0)) {
            SquireQuestHelper squireQuestHelper = this.fV;
            String[] strArr = new String[llllIllll[1]];
            strArr[llllIllll[0]] = llllIlllI[llllIllll[2]];
            strArr[llllIllll[2]] = llllIlllI[llllIllll[3]];
            strArr[llllIllll[3]] = llllIlllI[llllIllll[1]];
            if (!llIlIIlIllI(squireQuestHelper.a(strArr) ? 1 : 0) && !llIlIIlIlll(Movement.shouldWalk() ? 1 : 0)) {
                NPC cK = this.fV.cK();
                if (llIlIIllIII(cK)) {
                    return this.fV.cB();
                }
                if (llIlIIlIlll(Reachable.isInteractable(cK) ? 1 : 0) && llIlIIllIIl(this.fW, llllIllll[4])) {
                    this.fW += llllIllll[2];
                    Movement.walkTo(cK);
                    "".length();
                    "".length();
                    if ((-((65 ^ 127) ^ (45 ^ 22))) >= 0) {
                        return ((147 ^ 141) ^ (216 ^ 149)) & (((((70 + 182) - 178) + 176) ^ (((158 + 28) - 141) + 124)) ^ (-" ".length()));
                    }
                } else {
                    List<Integer> cI = this.fV.cI();
                    if (llIlIIlIlll(cI.isEmpty() ? 1 : 0)) {
                        Item first = Inventory.getFirst(item -> {
                            return cI.contains(Integer.valueOf(item.getId()));
                        });
                        if (llIlIIllIlI(first)) {
                            first.useOn(cK);
                            sleep(llllIllll[5]);
                            return llllIllll[2];
                        }
                    }
                    this.fW = llllIllll[0];
                    cK.interact(llllIlllI[llllIllll[5]]);
                }
                sleep(llllIllll[5]);
                return llllIllll[2];
            }
            return llllIllll[0];
        }
        return llllIllll[0];
    }

    private static void llIlIIlIlII() {
        llllIlllI = new String[llllIllll[4]];
        llllIlllI[llllIllll[0]] = llIlIIlIIlI("ov50m8R0a4Q=", "LXxpv");
        llllIlllI[llllIllll[2]] = llIlIIlIIll("Bj0EPA==", "mThPi");
        llllIlllI[llllIllll[3]] = llIlIIlIIlI("d741Bj8khe4=", "xnaEF");
        llllIlllI[llllIllll[1]] = llIlIIlIIlI("eVOMxkN7uBU=", "jcELl");
        llllIlllI[llllIllll[5]] = llIlIIlIIll("Ow4LE0sbAA==", "oogxf");
    }

    @Inject
    public C0047bt(SquireQuestHelper squireQuestHelper) {
        this.fV = squireQuestHelper;
    }

    private static void llIlIIlIlIl() {
        llllIllll = new int[7];
        llllIllll[0] = ((66 ^ 89) ^ (68 ^ 116)) & (((((31 + 128) - 39) + 63) ^ (((150 + 95) - 171) + 82)) ^ (-" ".length()));
        llllIllll[1] = "   ".length();
        llllIllll[2] = " ".length();
        llllIllll[3] = "  ".length();
        llllIllll[4] = (((12 + 70) - 61) + 117) ^ (((87 + 58) - 121) + 119);
        llllIllll[5] = (((125 + 85) - 97) + 44) ^ (((39 + 144) - 116) + 86);
        llllIllll[6] = (((9 + 44) - (-33)) + 42) ^ (((111 + 121) - 142) + 46);
    }

    private static boolean llIlIIlIlll(int i2) {
        return i2 == 0;
    }

    private static boolean llIlIIllIlI(Object obj) {
        return obj != null;
    }

    static {
        llIlIIlIlIl();
        llIlIIlIlII();
    }

    private static String llIlIIlIIll(String lIlIIllIIIlIlIl, String lIlIIllIIIlIlII) {
        String str = new String(Base64.getDecoder().decode(lIlIIllIIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIlIIllIIIlIIlI = lIlIIllIIIlIlII.toCharArray();
        int lIlIIllIIIlIIIl = llllIllll[0];
        char[] charArray = str.toCharArray();
        int lIlIIllIIIIlIlI = charArray.length;
        int i2 = llllIllll[0];
        while (llIlIIllIIl(i2, lIlIIllIIIIlIlI)) {
            char lIlIIllIIIlIllI = charArray[i2];
            sb.append((char) (lIlIIllIIIlIllI ^ lIlIIllIIIlIIlI[lIlIIllIIIlIIIl % lIlIIllIIIlIIlI.length]));
            "".length();
            lIlIIllIIIlIIIl++;
            i2++;
            "".length();
            if ("   ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String llIlIIlIIlI(String lIlIIllIIlIIIll, String lIlIIllIIlIIlII) {
        try {
            SecretKeySpec lIlIIllIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlIIllIIlIIlII.getBytes(StandardCharsets.UTF_8)), llllIllll[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIllll[3], lIlIIllIIlIlIII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIIllIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIIllIIlIIllI) {
            lIlIIllIIlIIllI.printStackTrace();
            return null;
        }
    }
}
