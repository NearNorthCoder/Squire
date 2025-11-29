package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.util.Text;
import net.runelite.client.eventbus.Subscribe;
@TaskDesc(name = "Harvesting/Replanting", register = true)
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bD  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bD.class */
public class bD extends Task {
    private final /* synthetic */ Client gh;
    private final /* synthetic */ ExecutorService gi;

    /* renamed from: gg  reason: collision with root package name */
    private /* synthetic */ String f3gg;
    private static /* synthetic */ String[] lIIIlIII;
    private static /* synthetic */ int[] lIIIlIll;

    @Subscribe
    public void c(MenuEntryAdded menuEntryAdded) {
        if (!lIIIIllIII(lIIIlIII[lIIIlIll[0]].equals(menuEntryAdded.getOption()) ? 1 : 0) || lIIIIllIIl(menuEntryAdded.getTarget().contains(lIIIlIII[lIIIlIll[1]]) ? 1 : 0)) {
            return;
        }
        this.gh.createMenuEntry(this.gh.getMenuOptionCount()).setOption(lIIIlIII[lIIIlIll[2]]).setTarget(menuEntryAdded.getTarget()).setIdentifier(menuEntryAdded.getIdentifier()).setParam1(menuEntryAdded.getActionParam1()).setParam0(menuEntryAdded.getActionParam0()).setType(MenuAction.RUNELITE_HIGH_PRIORITY).onClick(menuEntry -> {
            this.f3gg = Text.removeTags(menuEntryAdded.getTarget());
        });
        "".length();
    }

    private static boolean lIIIIllIlI(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean run() {
        return lIIIlIll[0];
    }

    @Inject
    public bD(Client client, ExecutorService executorService) {
        this.gh = client;
        this.gi = executorService;
    }

    static {
        lIIIIlIlll();
        lIIIIlIIII();
    }

    private static String lIIIIIllIl(String lllIIIllIIllIII, String lllIIIllIIlIlll) {
        String lllIIIllIIllIII2 = new String(Base64.getDecoder().decode(lllIIIllIIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllIIIllIIlIllI = new StringBuilder();
        char[] charArray = lllIIIllIIlIlll.toCharArray();
        int lllIIIllIIlIlII = lIIIlIll[0];
        char[] charArray2 = lllIIIllIIllIII2.toCharArray();
        int length = charArray2.length;
        int i2 = lIIIlIll[0];
        while (lIIIIllIlI(i2, length)) {
            char lllIIIllIIllIIl = charArray2[i2];
            lllIIIllIIlIllI.append((char) (lllIIIllIIllIIl ^ charArray[lllIIIllIIlIlII % charArray.length]));
            "".length();
            lllIIIllIIlIlII++;
            i2++;
            "".length();
            if ((true ^ true) & ((true ^ true) ^ true)) {
                return null;
            }
        }
        return String.valueOf(lllIIIllIIlIllI);
    }

    private static String lIIIIIllII(String lllIIIllIlIlIII, String lllIIIllIlIIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIllIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllIIIllIlIlIlI = Cipher.getInstance("Blowfish");
            lllIIIllIlIlIlI.init(lIIIlIll[2], secretKeySpec);
            return new String(lllIIIllIlIlIlI.doFinal(Base64.getDecoder().decode(lllIIIllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIllIlIlIIl) {
            lllIIIllIlIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIllIIl(int i2) {
        return i2 == 0;
    }

    private static void lIIIIlIIII() {
        lIIIlIII = new String[lIIIlIll[3]];
        lIIIlIII[lIIIlIll[0]] = lIIIIIllII("s3eSZvfDLUo=", "UWcXc");
        lIIIlIII[lIIIlIll[1]] = lIIIIIllIl("HwMsKA==", "obOCg");
        lIIIlIII[lIIIlIll[2]] = lIIIIIllII("OV5SQxGq78nMDMWM1L9/BIDpdwzeqYKi", "kQnhg");
    }

    private static boolean lIIIIllIII(int i2) {
        return i2 != 0;
    }

    private static void lIIIIlIlll() {
        lIIIlIll = new int[4];
        lIIIlIll[0] = (85 ^ 72) & ((142 ^ 147) ^ (-1));
        lIIIlIll[1] = " ".length();
        lIIIlIll[2] = "  ".length();
        lIIIlIll[3] = "   ".length();
    }
}
