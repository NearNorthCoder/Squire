package p000.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.wintertodt.SquireWintertodtConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Lighting Brazier", priority = 2, blocking = true, register = true)
/* renamed from: -.d.t.u.t.r.o.i.t.n.s.q.i.w.r.e.e.o  reason: invalid package */
/* loaded from: 185d2d5a-4681-414b-93d2-e699fe383083.jar:-/d/t/u/t/r/o/i/t/n/s/q/i/w/r/e/e/o.class */
public class o extends Task {
    private static /* synthetic */ int[] lIlIlllllIIII;
    public static final /* synthetic */ int Y;
    private final /* synthetic */ SquireWintertodtConfig aa;
    private final /* synthetic */ b Z;
    private /* synthetic */ int ab = lIlIlllllIIII[0];
    private static /* synthetic */ String[] lIlIllllIlllI;

    private static boolean llIIIIllIlIIIll(Object obj) {
        return obj != null;
    }

    @Inject
    public o(b bVar, SquireWintertodtConfig squireWintertodtConfig) {
        this.Z = bVar;
        this.aa = squireWintertodtConfig;
    }

    private static String llIIIIllIIlIlIl(String llllllllllllllIllIIlllIlIIIllIII, String llllllllllllllIllIIlllIlIIIlIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIIlllIlIIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIIlllIlIIIlIllI = new StringBuilder();
        char[] llllllllllllllIllIIlllIlIIIlIlIl = llllllllllllllIllIIlllIlIIIlIlll.toCharArray();
        int llllllllllllllIllIIlllIlIIIlIlII = lIlIlllllIIII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIlIlllllIIII[0];
        while (llIIIIllIlIIIII(i, length)) {
            llllllllllllllIllIIlllIlIIIlIllI.append((char) (charArray[i] ^ llllllllllllllIllIIlllIlIIIlIlIl[llllllllllllllIllIIlllIlIIIlIlII % llllllllllllllIllIIlllIlIIIlIlIl.length]));
            "".length();
            llllllllllllllIllIIlllIlIIIlIlII++;
            i++;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIIlllIlIIIlIllI);
    }

    static {
        llIIIIllIIlllII();
        llIIIIllIIlIlll();
        Y = lIlIlllllIIII[7];
    }

    @Subscribe
    public void b(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (!llIIIIllIIlllIl(message.contains(lIlIllllIlllI[lIlIlllllIIII[2]]) ? 1 : 0) || llIIIIllIIlllll(message.contains(lIlIllllIlllI[lIlIlllllIIII[6]]) ? 1 : 0)) {
            sleep(lIlIlllllIIII[0]);
        }
    }

    private static boolean llIIIIllIlIIlIl(int i, int i2) {
        return i == i2;
    }

    private static String llIIIIllIIlIllI(String llllllllllllllIllIIlllIlIIlIlIII, String llllllllllllllIllIIlllIlIIlIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIlIIlIIlll.getBytes(StandardCharsets.UTF_8)), lIlIlllllIIII[4]), "DES");
            Cipher llllllllllllllIllIIlllIlIIlIlIlI = Cipher.getInstance("DES");
            llllllllllllllIllIIlllIlIIlIlIlI.init(lIlIlllllIIII[6], secretKeySpec);
            return new String(llllllllllllllIllIIlllIlIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIlIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllIlIIlIlIIl) {
            llllllllllllllIllIIlllIlIIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllIlIIIlI(Object obj) {
        return obj == null;
    }

    private static boolean llIIIIllIIlllll(int i) {
        return i != 0;
    }

    private static String llIIIIllIIlIlII(String llllllllllllllIllIIlllIlIIIIIIll, String llllllllllllllIllIIlllIlIIIIIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIIlllIlIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIlllIlIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIlllIlIIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIlllIlIIIIIlIl.init(lIlIlllllIIII[6], llllllllllllllIllIIlllIlIIIIIllI);
            return new String(llllllllllllllIllIIlllIlIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIlllIlIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIIlllIlIIIIIlII) {
            llllllllllllllIllIIlllIlIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIllIlIIlII(int i, int i2) {
        return i <= i2;
    }

    private static boolean llIIIIllIlIIIIl(int i, int i2) {
        return i > i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v68, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    public boolean run() {
        if (llIIIIllIIlllIl(this.Z.i() ? 1 : 0)) {
            return lIlIlllllIIII[0];
        }
        a q = this.Z.q();
        Player local = Players.getLocal();
        if (llIIIIllIIllllI(this.Z.k(), lIlIlllllIIII[1])) {
            if (llIIIIllIIlllll(this.Z.s() ? 1 : 0)) {
                return lIlIlllllIIII[2];
            }
            if (!llIIIIllIIlllIl(local.isMoving() ? 1 : 0) || llIIIIllIlIIIII(q.b().distanceTo(local), lIlIlllllIIII[3])) {
                return lIlIlllllIIII[0];
            }
            Movement.walk(q.b());
            return lIlIlllllIIII[2];
        } else if (llIIIIllIlIIIIl(q.b().distanceTo(local), lIlIlllllIIII[3])) {
            return lIlIlllllIIII[0];
        } else {
            if (llIIIIllIlIIIlI(NPCs.getNearest(q.b(), npc -> {
                if (llIIIIllIlIIlIl(npc.getId(), lIlIlllllIIII[7]) && llIIIIllIlIIlII(npc.distanceTo(q.b()), lIlIlllllIIII[5])) {
                    ?? r0 = lIlIlllllIIII[2];
                    "".length();
                    return ((245 ^ 179) ^ (26 ^ 88)) != ((((8 + 47) - (-3)) + 69) ^ (196 ^ 191)) ? ((15 ^ 62) ^ (80 ^ 54)) & (((((181 + 101) - 44) + 14) ^ (((78 + 151) - 180) + 122)) ^ (-" ".length())) : r0;
                }
                return lIlIlllllIIII[0];
            }))) {
                if (llIIIIllIlIIIIl(this.ab, lIlIlllllIIII[4])) {
                    this.Z.r();
                    this.ab = lIlIlllllIIII[0];
                    return lIlIlllllIIII[0];
                }
                if (llIIIIllIlIIIII(q.b().distanceTo(Players.getLocal()), lIlIlllllIIII[5])) {
                    this.ab += lIlIlllllIIII[2];
                }
                return lIlIlllllIIII[0];
            }
            TileObject nearest = TileObjects.getNearest(q.b(), tileObject -> {
                if (llIIIIllIlIIIll(tileObject.getName()) && llIIIIllIIlllll(tileObject.getName().toLowerCase(Locale.ROOT).contains(lIlIllllIlllI[lIlIlllllIIII[3]]) ? 1 : 0)) {
                    String[] strArr = new String[lIlIlllllIIII[2]];
                    strArr[lIlIlllllIIII[0]] = lIlIllllIlllI[lIlIlllllIIII[1]];
                    if (llIIIIllIIlllll(tileObject.hasAction(strArr) ? 1 : 0) && llIIIIllIlIIlII(q.b().distanceTo(tileObject), lIlIlllllIIII[3])) {
                        ?? r0 = lIlIlllllIIII[2];
                        "".length();
                        return "   ".length() <= "  ".length() ? ((((36 + 126) - 157) + 235) ^ (((135 + 23) - 46) + 56)) & (((209 ^ 183) ^ (143 ^ 177)) ^ (-" ".length())) : r0;
                    }
                }
                return lIlIlllllIIII[0];
            });
            if (llIIIIllIlIIIlI(nearest)) {
                return lIlIlllllIIII[0];
            }
            this.ab = lIlIlllllIIII[0];
            nearest.interact(lIlIllllIlllI[lIlIlllllIIII[0]]);
            sleep(lIlIlllllIIII[6]);
            return lIlIlllllIIII[2];
        }
    }

    private static void llIIIIllIIlIlll() {
        lIlIllllIlllI = new String[lIlIlllllIIII[8]];
        lIlIllllIlllI[lIlIlllllIIII[0]] = llIIIIllIIlIlII("ErpDcWPDOnA=", "DwGgP");
        lIlIllllIlllI[lIlIlllllIIII[2]] = llIIIIllIIlIlIl("PiE9CSdtLTYNO209NwwmbSY3FzE+", "MDXyT");
        lIlIllllIlllI[lIlIlllllIIII[6]] = llIIIIllIIlIllI("170qdIBhux2RsQfKy/DmEA==", "zZTTe");
        lIlIllllIlllI[lIlIlllllIIII[3]] = llIIIIllIIlIlII("m7UM2yoOd0g=", "rFEWp");
        lIlIllllIlllI[lIlIlllllIIII[1]] = llIIIIllIIlIlIl("IC81HzM=", "lFRwG");
    }

    private static boolean llIIIIllIlIIIII(int i, int i2) {
        return i < i2;
    }

    private static boolean llIIIIllIIllllI(int i, int i2) {
        return i >= i2;
    }

    private static void llIIIIllIIlllII() {
        lIlIlllllIIII = new int[9];
        lIlIlllllIIII[0] = ((19 ^ 2) ^ (18 ^ 95)) & (((179 ^ 191) ^ (249 ^ 169)) ^ (-" ".length()));
        lIlIlllllIIII[1] = 7 ^ 3;
        lIlIlllllIIII[2] = " ".length();
        lIlIlllllIIII[3] = "   ".length();
        lIlIlllllIIII[4] = (179 ^ 138) ^ (93 ^ 108);
        lIlIlllllIIII[5] = (86 ^ 1) ^ (58 ^ 103);
        lIlIlllllIIII[6] = "  ".length();
        lIlIlllllIIII[7] = (-((-7415) & 16375)) & (-16405) & 32735;
        lIlIlllllIIII[8] = (((0 + 22) - (-140)) + 23) ^ (((87 + 138) - 223) + 186);
    }

    private static boolean llIIIIllIIlllIl(int i) {
        return i == 0;
    }
}
