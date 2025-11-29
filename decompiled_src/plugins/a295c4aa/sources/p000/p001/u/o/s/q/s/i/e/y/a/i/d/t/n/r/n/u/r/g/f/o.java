package p000.p001.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Resetting Sword", priority = 2147483397, register = true, blocking = true)
/* renamed from: -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.o  reason: invalid package */
/* loaded from: a295c4aa-95d9-42ec-b8cf-442736b096bd.jar:-/-/u/o/s/q/s/i/e/y/a/i/d/t/n/r/n/u/r/g/f/o.class */
public class o extends Task {
    private final /* synthetic */ SquireGiantsFoundry ad;
    private final /* synthetic */ a ae;
    private static /* synthetic */ int[] llIlIlIlIIIl;
    private static /* synthetic */ String[] llIlIlIlIIII;

    private static void lIIIIIllIIIIIlI() {
        llIlIlIlIIIl = new int[8];
        llIlIlIlIIIl[0] = (103 ^ 96) & ((80 ^ 87) ^ (-1));
        llIlIlIlIIIl[1] = " ".length();
        llIlIlIlIIIl[2] = (-4141) & 31150;
        llIlIlIlIIIl[3] = "  ".length();
        llIlIlIlIIIl[4] = "   ".length();
        llIlIlIlIIIl[5] = (112 ^ 33) ^ (255 ^ 170);
        llIlIlIlIIIl[6] = (103 ^ 41) ^ (92 ^ 23);
        llIlIlIlIIIl[7] = (149 ^ 182) ^ (4 ^ 47);
    }

    private static boolean lIIIIIllIIIIlIl(Object obj) {
        return obj == null;
    }

    @Inject
    public o(SquireGiantsFoundry squireGiantsFoundry, a aVar) {
        this.ad = squireGiantsFoundry;
        this.ae = aVar;
    }

    private static String lIIIIIlIlllllll(String lllllllllllllllIlIIIIlIllIlIllll, String lllllllllllllllIlIIIIlIllIlIlllI) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIllIlIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllllllllllIlIIIIlIllIlIlllI.toCharArray();
        int lllllllllllllllIlIIIIlIllIlIlIll = llIlIlIlIIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = llIlIlIlIIIl[0];
        while (lIIIIIllIIIIlll(i, length)) {
            char lllllllllllllllIlIIIIlIllIllIIII = charArray2[i];
            sb.append((char) (lllllllllllllllIlIIIIlIllIllIIII ^ charArray[lllllllllllllllIlIIIIlIllIlIlIll % charArray.length]));
            "".length();
            lllllllllllllllIlIIIIlIllIlIlIll++;
            i++;
            "".length();
            if ("  ".length() > ((21 ^ 86) ^ (88 ^ 31))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIIIllIIIIlII(int i) {
        return i != 0;
    }

    private static String lIIIIIlIllllllI(String lllllllllllllllIlIIIIlIllIllllll, String lllllllllllllllIlIIIIlIllIlllllI) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIlIlllIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIllIlllllI.getBytes(StandardCharsets.UTF_8)), llIlIlIlIIIl[7]), "DES");
            Cipher lllllllllllllllIlIIIIlIlllIIIIIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIIIlIlllIIIIIl.init(llIlIlIlIIIl[3], lllllllllllllllIlIIIIlIlllIIIIlI);
            return new String(lllllllllllllllIlIIIIlIlllIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIlIlllIIIIII) {
            lllllllllllllllIlIIIIlIlllIIIIII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIllIIIIllI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static void lIIIIIllIIIIIIl() {
        llIlIlIlIIII = new String[llIlIlIlIIIl[6]];
        llIlIlIlIIII[llIlIlIlIIIl[0]] = lIIIIIlIllllllI("QkwX70hw9Zp9Jlc1yC256wknDj6Do2/OyaROWp61ziTDthf+h8DlBg==", "aqHWZ");
        llIlIlIlIIII[llIlIlIlIIIl[1]] = lIIIIIlIlllllll("FQQbJCIzCAYmdjMJDWElMA4aJQ==", "GahAV");
        llIlIlIlIIII[llIlIlIlIIIl[3]] = lIIIIIllIIIIIII("ELq7fCak2hA=", "tmqKV");
        llIlIlIlIIII[llIlIlIlIIIl[4]] = lIIIIIlIlllllll("PD82dgopPTgxCyxwLTlOIzU8Jk4/Pys9ByY3", "HPYVn");
        llIlIlIlIIII[llIlIlIlIIIl[5]] = lIIIIIlIlllllll("NgkbLRwNDxgvSBIDGDxIEhQZJg9FER88AEUSHi1IFhEZOgxJRgI6EQwIEWgcCkYELRsAElg=", "efvHh");
    }

    static {
        lIIIIIllIIIIIlI();
        lIIIIIllIIIIIIl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    public boolean run() {
        if (lIIIIIllIIIIIll(this.ad.c() ? 1 : 0)) {
            return llIlIlIlIIIl[0];
        }
        int[] iArr = new int[llIlIlIlIIIl[1]];
        iArr[llIlIlIlIIIl[0]] = llIlIlIlIIIl[2];
        if (lIIIIIllIIIIIll(Equipment.contains(iArr) ? 1 : 0)) {
            Log.info(llIlIlIlIIII[llIlIlIlIIIl[0]]);
            this.ad.a((boolean) llIlIlIlIIIl[0]);
            return llIlIlIlIIIl[1];
        } else if (lIIIIIllIIIIIll(Movement.shouldWalk() ? 1 : 0)) {
            return llIlIlIlIIIl[0];
        } else {
            if (lIIIIIllIIIIlII(Dialog.canContinue() ? 1 : 0)) {
                Dialog.continueSpace();
                return llIlIlIlIIIl[1];
            }
            Log.info(llIlIlIlIIII[llIlIlIlIIIl[1]]);
            NPC p = this.ae.p();
            if (lIIIIIllIIIIlIl(p)) {
                return llIlIlIlIIIl[0];
            }
            p.interact(llIlIlIlIIII[llIlIlIlIIIl[3]]);
            return llIlIlIlIIIl[1];
        }
    }

    private static boolean lIIIIIllIIIIlll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (!lIIIIIllIIIIllI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lIIIIIllIIIIlII(chatMessage.getMessage().contains(llIlIlIlIIII[llIlIlIlIIIl[4]]) ? 1 : 0)) {
            Log.info(llIlIlIlIIII[llIlIlIlIIIl[5]]);
            this.ad.a((boolean) llIlIlIlIIIl[1]);
        }
    }

    private static boolean lIIIIIllIIIIIll(int i) {
        return i == 0;
    }

    private static String lIIIIIllIIIIIII(String lllllllllllllllIlIIIIlIlllIIllII, String lllllllllllllllIlIIIIlIlllIIlIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIlIlllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIlIlllIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIlIlllIIlllI.init(llIlIlIlIIIl[3], secretKeySpec);
            return new String(lllllllllllllllIlIIIIlIlllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIlIlllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIIIlIlllIIllIl) {
            lllllllllllllllIlIIIIlIlllIIllIl.printStackTrace();
            return null;
        }
    }
}
