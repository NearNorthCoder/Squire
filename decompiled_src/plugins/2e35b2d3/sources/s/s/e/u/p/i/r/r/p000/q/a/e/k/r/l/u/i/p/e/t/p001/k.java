package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Getting New Task")
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.k  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/k.class */
public class k extends Task {
    private final /* synthetic */ SquireSkipperPlugin F;
    private static /* synthetic */ String[] lIlIIlIIlIIII;
    private static /* synthetic */ int[] lIlIIlIIlIIll;
    private final /* synthetic */ SquireSkipperConfig G;

    static {
        lIlllIlIIllIIlI();
        lIlllIlIIlIllIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v26, types: [boolean] */
    public boolean run() {
        if (lIlllIlIIllIllI(this.F.a(this.F.g()) ? 1 : 0)) {
            this.F.forceStop();
        }
        if (lIlllIlIIllIllI(this.F.h() ? 1 : 0)) {
            return lIlIIlIIlIIll[0];
        }
        if (lIlllIlIIllIllI(Dialog.isOpen() ? 1 : 0) && (!lIlllIlIIllIlll(Dialog.getText().contains(lIlIIlIIlIIII[lIlIIlIIlIIll[0]]) ? 1 : 0) || lIlllIlIIllIllI(Dialog.getText().contains(lIlIIlIIlIIII[lIlIIlIIlIIll[1]]) ? 1 : 0))) {
            this.F.a((boolean) lIlIIlIIlIIll[0]);
            Movement.setDestination(Players.getLocal().getWorldLocation());
            return lIlIIlIIlIIll[1];
        } else if (lIlllIlIIllIllI(Dialog.isOpen() ? 1 : 0) && lIlllIlIIllIllI(Dialog.getText().contains(lIlIIlIIlIIII[lIlIIlIIlIIll[2]]) ? 1 : 0)) {
            DialogOption[] dialogOptionArr = new DialogOption[lIlIIlIIlIIll[3]];
            dialogOptionArr[lIlIIlIIlIIll[0]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIlIIlIIlIIll[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIlIIlIIlIIll[2]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[lIlIIlIIlIIll[4]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[lIlIIlIIlIIll[5]] = DialogOption.PLAYER_CONTINUE;
            dialogOptionArr[lIlIIlIIlIIll[6]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
            return lIlIIlIIlIIll[1];
        } else if (lIlllIlIIlllIIl(this.F.b()) && lIlllIlIIllIlll(this.F.c() ? 1 : 0)) {
            return lIlIIlIIlIIll[0];
        } else {
            this.F.a(this.F.g());
            "".length();
            NPC nearest = NPCs.getNearest(npc -> {
                String[] strArr = new String[lIlIIlIIlIIll[1]];
                strArr[lIlIIlIIlIIll[0]] = lIlIIlIIlIIII[lIlIIlIIlIIll[5]];
                return npc.hasAction(strArr);
            });
            if (lIlllIlIIlllIIl(nearest)) {
                nearest.interact(lIlIIlIIlIIII[lIlIIlIIlIIll[4]]);
                return lIlIIlIIlIIll[1];
            }
            return lIlIIlIIlIIll[0];
        }
    }

    private static String lIlllIlIIlIlIlI(String llllllllllllllIllIlllIllIllIlIIl, String llllllllllllllIllIlllIllIllIlIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIllIllIlIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIIlIIll[7]), "DES");
            Cipher llllllllllllllIllIlllIllIllIlIll = Cipher.getInstance("DES");
            llllllllllllllIllIlllIllIllIlIll.init(lIlIIlIIlIIll[2], secretKeySpec);
            return new String(llllllllllllllIllIlllIllIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIllIllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIllIllIlIlI) {
            llllllllllllllIllIlllIllIllIlIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    public k(SquireSkipperPlugin squireSkipperPlugin, SquireSkipperConfig squireSkipperConfig) {
        this.F = squireSkipperPlugin;
        this.G = squireSkipperConfig;
    }

    private static String lIlllIlIIlIlIll(String llllllllllllllIllIlllIllIlIllIIl, String llllllllllllllIllIlllIllIlIllIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIllIlIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllIlllIllIlIlIllI = llllllllllllllIllIlllIllIlIllIII.toCharArray();
        int llllllllllllllIllIlllIllIlIlIlIl = lIlIIlIIlIIll[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIIlIIlIIll[0];
        while (lIlllIlIIlllIlI(i, length)) {
            sb.append((char) (charArray[i] ^ llllllllllllllIllIlllIllIlIlIllI[llllllllllllllIllIlllIllIlIlIlIl % llllllllllllllIllIlllIllIlIlIllI.length]));
            "".length();
            llllllllllllllIllIlllIllIlIlIlIl++;
            i++;
            "".length();
            if ((76 ^ 72) <= ((113 ^ 127) & ((207 ^ 193) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIlllIlIIlllIlI(int i, int i2) {
        return i < i2;
    }

    private static void lIlllIlIIlIllIl() {
        lIlIIlIIlIIII = new String[lIlIIlIIlIIll[6]];
        lIlIIlIIlIIII[lIlIIlIIlIIll[0]] = lIlllIlIIlIlIlI("nTiWahf1ehI=", "PaBKG");
        lIlIIlIIlIIII[lIlIIlIIlIIll[1]] = lIlllIlIIlIlIll("IQw3MUgAAjk/", "bcZTh");
        lIlIIlIIlIIII[lIlIIlIIlIIll[2]] = lIlllIlIIlIllII("nr9DyE+0WcyZULVFhfYOnw==", "jrJqo");
        lIlIIlIIlIIII[lIlIIlIIlIIll[4]] = lIlllIlIIlIlIll("NTQFOTQaKhM+Jw==", "tGvPS");
        lIlIIlIIlIIII[lIlIIlIIlIIll[5]] = lIlllIlIIlIllII("UOcRiWUFayaku+/egH0jpA==", "kKJcI");
    }

    private static boolean lIlllIlIIllIlll(int i) {
        return i == 0;
    }

    private static String lIlllIlIIlIllII(String llllllllllllllIllIlllIlllIIIIIII, String llllllllllllllIllIlllIllIllllllI) {
        try {
            SecretKeySpec llllllllllllllIllIlllIlllIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIllIllllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIIlIIll[2], llllllllllllllIllIlllIlllIIIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIlllIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIlllIIIIIIl) {
            llllllllllllllIllIlllIlllIIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIIllIllI(int i) {
        return i != 0;
    }

    private static void lIlllIlIIllIIlI() {
        lIlIIlIIlIIll = new int[8];
        lIlIIlIIlIIll[0] = (156 ^ 129) & ((223 ^ 194) ^ (-1));
        lIlIIlIIlIIll[1] = " ".length();
        lIlIIlIIlIIll[2] = "  ".length();
        lIlIIlIIlIIll[3] = (((112 + 12) - (-1)) + 52) ^ (((127 + 102) - 65) + 19);
        lIlIIlIIlIIll[4] = "   ".length();
        lIlIIlIIlIIll[5] = 62 ^ 58;
        lIlIIlIIlIIll[6] = (181 ^ 170) ^ (153 ^ 131);
        lIlIIlIIlIIll[7] = 88 ^ 80;
    }

    private static boolean lIlllIlIIlllIIl(Object obj) {
        return obj != null;
    }
}
