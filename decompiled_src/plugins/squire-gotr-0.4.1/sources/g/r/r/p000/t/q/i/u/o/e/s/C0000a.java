package g.r.r.p000.t.q.i.u.o.e.s;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Singleton;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.events.MenuAutomated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Singleton
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.a  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/a.class */
public class C0000a {
    private static /* synthetic */ int[] llIIllllIllI;
    private /* synthetic */ e b;
    private static /* synthetic */ String[] llIIllllIlII;
    private static final /* synthetic */ Logger a;

    @Subscribe
    public void a(MenuAutomated menuAutomated) {
        if (llllllllIlIIlI(menuAutomated.getTarget().contains(llIIllllIlII[llIIllllIllI[0]]) ? 1 : 0)) {
            return;
        }
        e c = e.c(Integer.parseInt(menuAutomated.getTarget().replace(llIIllllIlII[llIIllllIllI[1]], llIIllllIlII[llIIllllIllI[2]]).trim()));
        if (llllllllIlIIll(c)) {
            return;
        }
        this.b = c;
    }

    private static void llllllllIlIIIl() {
        llIIllllIllI = new int[7];
        llIIllllIllI[0] = ((((123 + 134) - 131) + 20) ^ (((77 + 93) - 141) + 132)) & (((204 ^ 144) ^ (63 ^ 80)) ^ (-" ".length()));
        llIIllllIllI[1] = " ".length();
        llIIllllIllI[2] = "  ".length();
        llIIllllIllI[3] = -" ".length();
        llIIllllIllI[4] = "   ".length();
        llIIllllIllI[5] = 25 ^ 29;
        llIIllllIllI[6] = 30 ^ 22;
    }

    private static boolean llllllllIlIIll(Object obj) {
        return obj == null;
    }

    private static void llllllllIIllIl() {
        llIIllllIlII = new String[llIIllllIllI[5]];
        llIIllllIlII[llIIllllIllI[0]] = llllllllIIlIlI("W0Lmrk+gTD8=", "EKXLk");
        llIIllllIlII[llIIllllIllI[1]] = llllllllIIlIll("FKB/wisE6oQ=", "VIDcL");
        llIIllllIlII[llIIllllIllI[2]] = llllllllIIllII("", "rrGzP");
        llIIllllIlII[llIIllllIllI[4]] = llllllllIIlIlI("dTpgj1x88X6MU0gQjD60Ed+PPXoasqHxcu1Omqbt4Sy5psldKlqLd854QXIpop1t", "MkKNQ");
    }

    static {
        llllllllIlIIIl();
        llllllllIIllIl();
        a = LoggerFactory.getLogger(C0000a.class);
    }

    private static boolean llllllllIlIlII(int i, int i2) {
        return i == i2;
    }

    private static String llllllllIIlIll(String lllllllllllllllIlIIlIllIlIllIlII, String lllllllllllllllIlIIlIllIlIllIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIlIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIlIllIIll.getBytes(StandardCharsets.UTF_8)), llIIllllIllI[6]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIllllIllI[2], lllllllllllllllIlIIlIllIlIllIlll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllIlIllIlIl) {
            lllllllllllllllIlIIlIllIlIllIlIl.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if ((!llllllllIlIlIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) || !llllllllIlIlIl(chatMessage.getType(), ChatMessageType.SPAM)) && !llllllllIlIIlI(chatMessage.getMessage().startsWith(llIIllllIlII[llIIllllIllI[4]]) ? 1 : 0) && llllllllIlIIll(this.b)) {
        }
    }

    @Subscribe(priority = 20.0f)
    public void a(MenuOptionClicked menuOptionClicked) {
        if (llllllllIlIlII(menuOptionClicked.getItemId(), llIIllllIllI[3])) {
            return;
        }
        e c = e.c(menuOptionClicked.getItemId());
        if (llllllllIlIIll(c)) {
            return;
        }
        this.b = c;
    }

    private static boolean llllllllIlIIlI(int i) {
        return i == 0;
    }

    private static String llllllllIIlIlI(String lllllllllllllllIlIIlIllIlIlIIlll, String lllllllllllllllIlIIlIllIlIlIIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIlIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIllIlIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIllIlIlIlIIl.init(llIIllllIllI[2], secretKeySpec);
            return new String(lllllllllllllllIlIIlIllIlIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllIlIlIlIII) {
            lllllllllllllllIlIIlIllIlIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIlIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean llllllllIlIlIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static String llllllllIIllII(String lllllllllllllllIlIIlIllIlIIlIlll, String lllllllllllllllIlIIlIllIlIIlIIIl) {
        String lllllllllllllllIlIIlIllIlIIlIlll2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllllllllllllllIlIIlIllIlIIlIlII = lllllllllllllllIlIIlIllIlIIlIIIl.toCharArray();
        int lllllllllllllllIlIIlIllIlIIlIIll = llIIllllIllI[0];
        char[] charArray = lllllllllllllllIlIIlIllIlIIlIlll2.toCharArray();
        int length = charArray.length;
        int i = llIIllllIllI[0];
        while (llllllllIlIllI(i, length)) {
            sb.append((char) (charArray[i] ^ lllllllllllllllIlIIlIllIlIIlIlII[lllllllllllllllIlIIlIllIlIIlIIll % lllllllllllllllIlIIlIllIlIIlIlII.length]));
            "".length();
            lllllllllllllllIlIIlIllIlIIlIIll++;
            i++;
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }
}
