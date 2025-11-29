package s.s.e.u.p.i.r.r.p000.q.a.e.k.r.l.u.i.p.e.t.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.slayer.SquireSkipperConfig;
import gg.squire.slayer.SquireSkipperPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.NPC;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;
@TaskDesc(name = "Getting Hunting Task", priority = 10, register = true, blocking = true)
/* renamed from: s.s.e.u.p.i.r.r.-.q.a.e.k.r.l.u.i.p.e.t.-.j  reason: invalid package */
/* loaded from: 2e35b2d3-afef-4589-b5f3-450cbc042322.jar:s/s/e/u/p/i/r/r/-/q/a/e/k/r/l/u/i/p/e/t/-/j.class */
public class j extends Task {
    private final /* synthetic */ SquireSkipperPlugin E;
    private final /* synthetic */ SquireSkipperConfig D;
    private static /* synthetic */ int[] lIlIIlIlIIIIl;
    private static /* synthetic */ String[] lIlIIlIlIIIII;

    private static String lIlllIlIllIllII(String llllllllllllllIllIlllIIlllIlIIIl, String llllllllllllllIllIlllIIlllIlIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlllIIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlllIIlllIIllll = new StringBuilder();
        char[] charArray = llllllllllllllIllIlllIIlllIlIIII.toCharArray();
        int llllllllllllllIllIlllIIlllIIllIl = lIlIIlIlIIIIl[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIlIIlIlIIIIl[0];
        while (lIlllIlIlllIIll(i, length)) {
            char llllllllllllllIllIlllIIlllIlIIlI = charArray2[i];
            llllllllllllllIllIlllIIlllIIllll.append((char) (llllllllllllllIllIlllIIlllIlIIlI ^ charArray[llllllllllllllIllIlllIIlllIIllIl % charArray.length]));
            "".length();
            llllllllllllllIllIlllIIlllIIllIl++;
            i++;
            "".length();
            if ("  ".length() == (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlllIIlllIIllll);
    }

    private static boolean lIlllIlIlllIIll(int i, int i2) {
        return i < i2;
    }

    @Inject
    public j(SquireSkipperConfig squireSkipperConfig, SquireSkipperPlugin squireSkipperPlugin) {
        this.D = squireSkipperConfig;
        this.E = squireSkipperPlugin;
    }

    private static boolean lIlllIlIlllIIlI(int i) {
        return i != 0;
    }

    private static String lIlllIlIllIllIl(String llllllllllllllIllIlllIIllIllllII, String llllllllllllllIllIlllIIllIlllIll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIllIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIlIlIIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIIllIllllIl) {
            llllllllllllllIllIlllIIllIllllIl.printStackTrace();
            return null;
        }
    }

    private static String lIlllIlIllIlIll(String llllllllllllllIllIlllIIllllIIIIl, String llllllllllllllIllIlllIIllllIIIII) {
        try {
            SecretKeySpec llllllllllllllIllIlllIIllllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlllIIllllIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIlIlIIIIl[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIIlIlIIIIl[3], llllllllllllllIllIlllIIllllIIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlllIIllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlllIIllllIIIlI) {
            llllllllllllllIllIlllIIllllIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllIlIlllIIII(int i) {
        return i == 0;
    }

    private static void lIlllIlIllIllll() {
        lIlIIlIlIIIIl = new int[9];
        lIlIIlIlIIIIl[0] = ((((12 + 139) - (-30)) + 0) ^ (((81 + 92) - 117) + 98)) & (((((114 + 60) - 142) + 97) ^ (((125 + 114) - 170) + 105)) ^ (-" ".length()));
        lIlIIlIlIIIIl[1] = " ".length();
        lIlIIlIlIIIIl[2] = 81 ^ 85;
        lIlIIlIlIIIIl[3] = "  ".length();
        lIlIIlIlIIIIl[4] = "   ".length();
        lIlIIlIlIIIIl[5] = (((91 + 46) - 45) + 56) ^ (((101 + 82) - 91) + 53);
        lIlIIlIlIIIIl[6] = 97 ^ 103;
        lIlIIlIlIIIIl[7] = (((24 + 83) - 66) + 101) ^ (((70 + 120) - 90) + 37);
        lIlIIlIlIIIIl[8] = ((29 ^ 15) & ((103 ^ 117) ^ (-1))) ^ (39 ^ 47);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    public boolean j(String str) {
        String huntTaskName = this.D.huntTaskName();
        if (lIlllIlIlllIIlI(huntTaskName.contains(lIlIIlIlIIIII[lIlIIlIlIIIIl[4]]) ? 1 : 0)) {
            String[] split = huntTaskName.split(lIlIIlIlIIIII[lIlIIlIlIIIIl[2]]);
            int llllllllllllllIllIlllIIlllllIIll = split.length;
            int i = lIlIIlIlIIIIl[0];
            while (lIlllIlIlllIIll(i, llllllllllllllIllIlllIIlllllIIll)) {
                if (lIlllIlIlllIIlI(str.toLowerCase().contains(split[i].trim().toLowerCase()) ? 1 : 0)) {
                    return lIlIIlIlIIIIl[1];
                }
                i++;
                "".length();
                if ((-"  ".length()) > 0) {
                    return ((240 ^ 131) ^ (96 ^ 115)) & (((((159 + 134) - 154) + 27) ^ (((13 + 131) - 10) + 64)) ^ (-" ".length()));
                }
            }
        }
        return str.toLowerCase().contains(huntTaskName.trim().toLowerCase());
    }

    private static boolean lIlllIlIlllIlII(Object obj) {
        return obj == null;
    }

    static {
        lIlllIlIllIllll();
        lIlllIlIllIlllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        ChatMessageType type = chatMessage.getType();
        if (lIlllIlIlllIlIl(type, ChatMessageType.GAMEMESSAGE) && lIlllIlIlllIlIl(type, ChatMessageType.SPAM)) {
            return;
        }
        String removeTags = Text.removeTags(chatMessage.getMessage());
        Log.info("Actual message: " + removeTags);
        if (lIlllIlIlllIIlI(removeTags.contains(lIlIIlIlIIIII[lIlIIlIlIIIIl[5]]) ? 1 : 0)) {
            this.E.a((boolean) lIlIIlIlIIIIl[1]);
            this.E.b((boolean) lIlIIlIlIIIIl[1]);
        }
        if (lIlllIlIlllIIlI(j(removeTags) ? 1 : 0)) {
            Log.info(lIlIIlIlIIIII[lIlIIlIlIIIIl[6]]);
            this.E.forceStop();
        }
    }

    private static void lIlllIlIllIlllI() {
        lIlIIlIlIIIII = new String[lIlIIlIlIIIIl[8]];
        lIlIIlIlIIIII[lIlIIlIlIIIIl[0]] = lIlllIlIllIlIll("Io4jTSQNNkHIjh/StECGDU8EENuVgCzEOkrGZ+eoaxSlafzz4hkjCQ==", "OLlzO");
        lIlIIlIlIIIII[lIlIIlIlIIIIl[1]] = lIlllIlIllIllII("MTcrOVAUPyspUBojKzkZHDFlIBEBIiA/", "rVEMp");
        lIlIIlIlIIIII[lIlIIlIlIIIIl[3]] = lIlllIlIllIllII("BAEcIy0rHwokPg==", "EroJJ");
        lIlIIlIlIIIII[lIlIIlIlIIIIl[4]] = lIlllIlIllIllII("QQ==", "mkftI");
        lIlIIlIlIIIII[lIlIIlIlIIIIl[2]] = lIlllIlIllIllIl("rfqe2OsAvYQ=", "SlfEr");
        lIlIIlIlIIIII[lIlIIlIlIIIIl[5]] = lIlllIlIllIllIl("ZTet5IjTG8dU1IJayFwt1bDhfFUcbQ+eFDiePtLHJfEvfqeAujdk2w==", "AQMUQ");
        lIlIIlIlIIIII[lIlIIlIlIIIIl[6]] = lIlllIlIllIllII("JAQYPR0eHhBhTREfAiMJVwQfKE0fBRk5CBNQAyweHFE=", "wpwMm");
        lIlIIlIlIIIII[lIlIIlIlIIIIl[7]] = lIlllIlIllIllII("KQk0EwoGFyIUGQ==", "hzGzm");
    }

    private static boolean lIlllIlIlllIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v43, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    public boolean run() {
        if (lIlllIlIlllIIII(this.D.huntTask() ? 1 : 0)) {
            return lIlIIlIlIIIIl[0];
        }
        if (lIlllIlIlllIIIl(this.E.b()) && lIlllIlIlllIIlI(j(this.E.b().m()) ? 1 : 0)) {
            Log.info(lIlIIlIlIIIII[lIlIIlIlIIIIl[0]]);
            this.E.forceStop();
            return lIlIIlIlIIIIl[1];
        }
        if (!lIlllIlIlllIIlI(this.E.d() ? 1 : 0) && !lIlllIlIlllIIII(this.E.c() ? 1 : 0)) {
            a taskMaster = this.D.taskMaster();
            if (!lIlllIlIlllIIll(taskMaster.k().distanceTo(Players.getLocal()), lIlIIlIlIIIIl[2])) {
                if (lIlllIlIlllIIlI(Movement.shouldWalk() ? 1 : 0)) {
                    Movement.walkTo(taskMaster.k());
                    "".length();
                }
                return lIlIIlIlIIIIl[1];
            }
            NPC nearest = NPCs.getNearest(npc -> {
                String[] strArr = new String[lIlIIlIlIIIIl[1]];
                strArr[lIlIIlIlIIIIl[0]] = lIlIIlIlIIIII[lIlIIlIlIIIIl[7]];
                return npc.hasAction(strArr);
            });
            if (lIlllIlIlllIlII(nearest)) {
                Log.info(lIlIIlIlIIIII[lIlIIlIlIIIIl[1]]);
                return lIlIIlIlIIIIl[0];
            }
            nearest.interact(lIlIIlIlIIIII[lIlIIlIlIIIIl[3]]);
            sleep(lIlIIlIlIIIIl[3]);
            return lIlIIlIlIIIIl[1];
        }
        return lIlIIlIlIIIIl[0];
    }

    private static boolean lIlllIlIlllIIIl(Object obj) {
        return obj != null;
    }
}
