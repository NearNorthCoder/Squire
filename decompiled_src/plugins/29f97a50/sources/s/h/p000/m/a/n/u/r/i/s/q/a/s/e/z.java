package s.h.p000.m.a.n.u.r.i.s.q.a.s.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.pvm.SquireShamanConfig;
import gg.squire.pvm.SquireShamansPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.Item;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Teleporting out", priority = 8, register = true)
/* renamed from: s.h.-.m.a.n.u.r.i.s.q.a.s.e.z  reason: invalid package */
/* loaded from: 29f97a50-4c1f-4047-b5b1-e3e7ab557a1b.jar:s/h/-/m/a/n/u/r/i/s/q/a/s/e/z.class */
public class z extends Task {
    private final /* synthetic */ SquireShamansPlugin aH;
    private final /* synthetic */ SquireShamanConfig aI;
    private static final /* synthetic */ Logger aF;
    private static final /* synthetic */ WorldPoint aG;
    private static /* synthetic */ String[] lIIlIlllIlIll;
    private final /* synthetic */ c aJ;
    private static /* synthetic */ int[] lIIlIlllIllII;

    private static boolean lIlIllIllllIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIlIllIlllIIlll() {
        lIIlIlllIlIll = new String[lIIlIlllIllII[9]];
        lIIlIlllIlIll[lIIlIlllIllII[1]] = lIlIllIlllIIlII("AwY1LSUrAi4idzwHLiE2IQ==", "OoOLW");
        lIIlIlllIlIll[lIIlIlllIllII[0]] = lIlIllIlllIIlIl("2HHJsE62lOqRuocVeKHcdKC42NcBuQybMetvRAO/sp4=", "pLhjS");
        lIIlIlllIlIll[lIIlIlllIllII[2]] = lIlIllIlllIIlII("NgdVHBwYHVlYABYaVRkLHE8RHRgdTg==", "youxy");
        lIIlIlllIlIll[lIIlIlllIllII[3]] = lIlIllIlllIIllI("GOn4Mq3W3DIYjZuwPQXQNfBQC99WFTTad2D3SFem8ls=", "lPpCh");
        lIIlIlllIlIll[lIIlIlllIllII[4]] = lIlIllIlllIIlIl("8likwta6wXU=", "oJOdf");
        lIIlIlllIlIll[lIIlIlllIllII[5]] = lIlIllIlllIIlII("Nh0aKw==", "WsnBA");
        lIIlIlllIlIll[lIIlIlllIllII[6]] = lIlIllIlllIIlII("AzQsKi0=", "GFEDF");
    }

    static {
        lIlIllIlllIlllI();
        lIlIllIlllIIlll();
        aF = LoggerFactory.getLogger(z.class);
        aG = new WorldPoint(lIIlIlllIllII[7], lIIlIlllIllII[8], lIIlIlllIllII[1]);
    }

    private static String lIlIllIlllIIlII(String llllllllllllllIllllIlIIIIIlIIIlI, String llllllllllllllIllllIlIIIIIlIIIIl) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllllIlIIIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllllllllllIllllIlIIIIIIlllll = llllllllllllllIllllIlIIIIIlIIIIl.toCharArray();
        int llllllllllllllIllllIlIIIIIIllllI = lIIlIlllIllII[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lIIlIlllIllII[1];
        while (lIlIllIllllIllI(i, length)) {
            char llllllllllllllIllllIlIIIIIlIIIll = charArray[i];
            sb.append((char) (llllllllllllllIllllIlIIIIIlIIIll ^ llllllllllllllIllllIlIIIIIIlllll[llllllllllllllIllllIlIIIIIIllllI % llllllllllllllIllllIlIIIIIIlllll.length]));
            "".length();
            llllllllllllllIllllIlIIIIIIllllI++;
            i++;
            "".length();
            if ((((105 ^ 48) ^ (46 ^ 97)) & (((((110 + 30) - 133) + 175) ^ (((112 + 92) - 140) + 96)) ^ (-" ".length()))) != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    @Inject
    public z(SquireShamansPlugin squireShamansPlugin, SquireShamanConfig squireShamanConfig, c cVar) {
        this.aH = squireShamansPlugin;
        this.aI = squireShamanConfig;
        this.aJ = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public boolean run() {
        String[] strArr = new String[lIIlIlllIllII[0]];
        strArr[lIIlIlllIllII[1]] = lIIlIlllIlIll[lIIlIlllIllII[1]];
        if (lIlIllIlllIllll(NPCs.getNearest(strArr))) {
            this.aH.f(lIIlIlllIllII[1]);
            return lIIlIlllIllII[1];
        }
        Item first = Inventory.getFirst(item -> {
            if (lIlIllIllllIIll(item.getName().toLowerCase().contains(lIIlIlllIlIll[lIIlIlllIllII[5]]) ? 1 : 0)) {
                String[] strArr2 = new String[lIIlIlllIllII[0]];
                strArr2[lIIlIlllIllII[1]] = lIIlIlllIlIll[lIIlIlllIllII[6]];
                if (lIlIllIllllIIll(item.hasAction(strArr2) ? 1 : 0)) {
                    ?? r0 = lIIlIlllIllII[0];
                    "".length();
                    return (166 ^ 162) <= 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                }
            }
            return lIIlIlllIllII[1];
        });
        if (lIlIllIllllIIII(Inventory.getFirst(item2 -> {
            String str = lIIlIlllIlIll[lIIlIlllIllII[4]];
            return item2.hasAction((v1) -> {
                return r1.equals(v1);
            });
        })) && lIlIllIllllIIII(first) && lIlIllIllllIIIl(this.aH.i() ? 1 : 0) && lIlIllIllllIIlI(Prayers.getPoints())) {
            return lIIlIlllIllII[1];
        }
        Item first2 = Inventory.getFirst(this.aI.teleportItem().u());
        if (lIlIllIlllIllll(first2)) {
            return lIIlIlllIllII[1];
        }
        this.aH.f(lIIlIlllIllII[0]);
        if (!lIlIllIllllIIll(this.aJ.s() ? 1 : 0) || !lIlIllIllllIIll(this.aI.teleportItem().E() ? 1 : 0)) {
            this.aI.teleportItem().B().accept(first2);
            return lIIlIlllIllII[0];
        }
        Movement.walkTo(aG);
        "".length();
        return lIIlIlllIllII[0];
    }

    private static boolean lIlIllIllllIIlI(int i) {
        return i > 0;
    }

    private static boolean lIlIllIllllIlII(Object obj, Object obj2) {
        return obj != obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIlIllIllllIlII(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (lIlIllIllllIIll(chatMessage.getMessage().contains(lIIlIlllIlIll[lIIlIlllIllII[0]]) ? 1 : 0)) {
            this.aH.e(lIIlIlllIllII[0]);
        }
        if (lIlIllIllllIIll(chatMessage.getMessage().contains(lIIlIlllIlIll[lIIlIlllIllII[2]]) ? 1 : 0)) {
            Log.info(lIIlIlllIlIll[lIIlIlllIllII[3]]);
            this.aH.forceStop();
        }
    }

    private static String lIlIllIlllIIlIl(String llllllllllllllIllllIlIIIIIIIIIII, String llllllllllllllIllllIIlllllllllll) {
        try {
            SecretKeySpec llllllllllllllIllllIlIIIIIIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIIlllllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllllIlIIIIIIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllllIlIIIIIIIIIlI.init(lIIlIlllIllII[2], llllllllllllllIllllIlIIIIIIIIIll);
            return new String(llllllllllllllIllllIlIIIIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIIIIIIIIIIl) {
            llllllllllllllIllllIlIIIIIIIIIIl.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        if (lIlIllIllllIlIl(gameStateChanged.getGameState(), GameState.LOADING)) {
            this.aH.f(lIIlIlllIllII[1]);
        }
    }

    private static boolean lIlIllIllllIIIl(int i) {
        return i == 0;
    }

    private static boolean lIlIllIlllIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIlIllIllllIIII(Object obj) {
        return obj != null;
    }

    private static String lIlIllIlllIIllI(String llllllllllllllIllllIlIIIIIIIllIl, String llllllllllllllIllllIlIIIIIIIllII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIlIIIIIIIllII.getBytes(StandardCharsets.UTF_8)), lIIlIlllIllII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIlllIllII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIlIIIIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllllIlIIIIIIIlllI) {
            llllllllllllllIllllIlIIIIIIIlllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIllllIIll(int i) {
        return i != 0;
    }

    private static void lIlIllIlllIlllI() {
        lIIlIlllIllII = new int[11];
        lIIlIlllIllII[0] = " ".length();
        lIIlIlllIllII[1] = (41 ^ 108) & ((219 ^ 158) ^ (-1));
        lIIlIlllIllII[2] = "  ".length();
        lIIlIlllIllII[3] = "   ".length();
        lIIlIlllIllII[4] = (125 ^ 61) ^ (20 ^ 80);
        lIIlIlllIllII[5] = 81 ^ 84;
        lIIlIlllIllII[6] = 146 ^ 148;
        lIIlIlllIllII[7] = (-6386) & 7677;
        lIIlIlllIllII[8] = (-(((28 + 22) - 12) + 91)) & (-16402) & 26619;
        lIIlIlllIllII[9] = 60 ^ 59;
        lIIlIlllIllII[10] = 191 ^ 183;
    }

    private static boolean lIlIllIllllIllI(int i, int i2) {
        return i < i2;
    }
}
