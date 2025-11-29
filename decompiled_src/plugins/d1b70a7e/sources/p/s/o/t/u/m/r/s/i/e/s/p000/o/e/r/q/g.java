package p.s.o.t.u.m.r.s.i.e.s.p000.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
@TaskDesc(name = "Fishing", priority = 1000, blocking = true)
/* renamed from: p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.g  reason: invalid package */
/* loaded from: d1b70a7e-d534-4fe7-a2d5-7f0423b04edb.jar:p/s/o/t/u/m/r/s/i/e/s/-/o/e/r/q/g.class */
public class g extends Task {
    private final /* synthetic */ SquireTempoross aj;
    private final /* synthetic */ a ag;
    private final /* synthetic */ SquireTemporossConfig ah;
    private static /* synthetic */ int[] lIIllIllIIlIl;
    private static /* synthetic */ String[] lIIllIllIIlII;
    private final /* synthetic */ Client ai;

    private static void lIllIIIlIIIllIl() {
        lIIllIllIIlII = new String[lIIllIllIIlIl[3]];
        lIIllIllIIlII[lIIllIllIIlIl[0]] = lIllIIIlIIIlIlI("GjEHOx8=", "VTfMz");
        lIIllIllIIlII[lIIllIllIIlIl[1]] = lIllIIIlIIIlIll("PIzdDOa4HwE=", "ObaFi");
        lIIllIllIIlII[lIIllIllIIlIl[2]] = lIllIIIlIIIllII("D64rbPVbZ9k=", "nYloa");
    }

    private static boolean lIllIIIlIIIllll(int i) {
        return i == 0;
    }

    private static String lIllIIIlIIIlIlI(String llllllllllllllIlllIlllIlIlIIIlII, String llllllllllllllIlllIlllIlIlIIIIll) {
        String llllllllllllllIlllIlllIlIlIIIlII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIlIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llllllllllllllIlllIlllIlIlIIIIll.toCharArray();
        int llllllllllllllIlllIlllIlIlIIIIII = lIIllIllIIlIl[0];
        char[] charArray2 = llllllllllllllIlllIlllIlIlIIIlII2.toCharArray();
        int length = charArray2.length;
        int i = lIIllIllIIlIl[0];
        while (lIllIIIlIIlIIll(i, length)) {
            char llllllllllllllIlllIlllIlIlIIIlIl = charArray2[i];
            sb.append((char) (llllllllllllllIlllIlllIlIlIIIlIl ^ charArray[llllllllllllllIlllIlllIlIlIIIIII % charArray.length]));
            "".length();
            llllllllllllllIlllIlllIlIlIIIIII++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIllIIIlIIlIIll(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIIIlIIlIIIl(Object obj) {
        return obj != null;
    }

    private static void lIllIIIlIIIlllI() {
        lIIllIllIIlIl = new int[5];
        lIIllIllIIlIl[0] = ((85 ^ 24) ^ (36 ^ 49)) & (((4 ^ 88) ^ (175 ^ 171)) ^ (-" ".length()));
        lIIllIllIIlIl[1] = " ".length();
        lIIllIllIIlIl[2] = "  ".length();
        lIIllIllIIlIl[3] = "   ".length();
        lIIllIllIIlIl[4] = (((61 + 129) - 42) + 21) ^ (((96 + 33) - (-20)) + 12);
    }

    private static boolean lIllIIIlIIlIIlI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    public boolean run() {
        if (!lIllIIIlIIIllll(this.ai.isInInstancedRegion() ? 1 : 0) && !lIllIIIlIIIllll(this.ag.M() ? 1 : 0) && !lIllIIIlIIlIIII(Dialog.isOpen() ? 1 : 0) && !lIllIIIlIIIllll(Movement.shouldWalk() ? 1 : 0)) {
            NPC nearest = NPCs.getNearest(npc -> {
                if (lIllIIIlIIlIIII(npc.getName().toLowerCase().contains(lIIllIllIIlII[lIIllIllIIlIl[1]]) ? 1 : 0)) {
                    String[] strArr = new String[lIIllIllIIlIl[1]];
                    strArr[lIIllIllIIlIl[0]] = lIIllIllIIlII[lIIllIllIIlIl[2]];
                    if (lIllIIIlIIlIIII(npc.hasAction(strArr) ? 1 : 0)) {
                        ?? r0 = lIIllIllIIlIl[1];
                        "".length();
                        return (-((28 ^ 4) ^ (131 ^ 158))) >= 0 ? ((127 ^ 13) ^ (215 ^ 142)) & (((((143 + 164) - 125) + 6) ^ (((36 + 108) - 131) + 138)) ^ (-" ".length())) : r0;
                    }
                }
                return lIIllIllIIlIl[0];
            });
            if (!lIllIIIlIIlIIIl(Players.getLocal()) || lIllIIIlIIlIIlI(nearest)) {
                return lIIllIllIIlIl[0];
            }
            nearest.interact(lIIllIllIIlII[lIIllIllIIlIl[0]]);
            return lIIllIllIIlIl[1];
        }
        return lIIllIllIIlIl[0];
    }

    static {
        lIllIIIlIIIlllI();
        lIllIIIlIIIllIl();
    }

    private static String lIllIIIlIIIlIll(String llllllllllllllIlllIlllIlIlIlIlII, String llllllllllllllIlllIlllIlIlIlIIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIlIlIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIlIlIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIlIlIlIllI.init(lIIllIllIIlIl[2], secretKeySpec);
            return new String(llllllllllllllIlllIlllIlIlIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIlIlIlIlIl) {
            llllllllllllllIlllIlllIlIlIlIlIl.printStackTrace();
            return null;
        }
    }

    private static String lIllIIIlIIIllII(String llllllllllllllIlllIlllIlIllIIIIl, String llllllllllllllIlllIlllIlIllIIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIlIllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIlIllIIIII.getBytes(StandardCharsets.UTF_8)), lIIllIllIIlIl[4]), "DES");
            Cipher llllllllllllllIlllIlllIlIllIIIll = Cipher.getInstance("DES");
            llllllllllllllIlllIlllIlIllIIIll.init(lIIllIllIIlIl[2], llllllllllllllIlllIlllIlIllIIlII);
            return new String(llllllllllllllIlllIlllIlIllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIlIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIlllIlIllIIIlI) {
            llllllllllllllIlllIlllIlIllIIIlI.printStackTrace();
            return null;
        }
    }

    @Inject
    protected g(a aVar, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        this.ag = aVar;
        this.ah = squireTemporossConfig;
        this.ai = client;
        this.aj = squireTempoross;
    }

    private static boolean lIllIIIlIIlIIII(int i) {
        return i != 0;
    }
}
