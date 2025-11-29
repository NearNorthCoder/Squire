package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.input.Keyboard;
@TaskDesc(name = "Chatting", priority = 50, blocking = true, register = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.X  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/X.class */
public class X extends AbstractC0013n {
    private static /* synthetic */ String[] llIIlIlllIlI;
    private /* synthetic */ String ch;
    private /* synthetic */ boolean cj;
    private static /* synthetic */ int[] llIIlIllllll;
    private /* synthetic */ int ci;

    private static String llllllIIIIIlll(String lllllllllllllllIlIIlIlllllIIlllI, String lllllllllllllllIlIIlIlllllIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlllllIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlllllIlIIII.init(llIIlIllllll[2], lllllllllllllllIlIIlIlllllIlIIIl);
            return new String(lllllllllllllllIlIIlIlllllIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlllllIIllll) {
            lllllllllllllllIlIIlIlllllIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIlIIIII(int i, int i2) {
        return i < i2;
    }

    private static String llllllIIIIIlIl(String lllllllllllllllIlIIlIlllllllIIII, String lllllllllllllllIlIIlIllllllIllll) {
        String lllllllllllllllIlIIlIlllllllIIII2 = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllllllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIllllllIlllI = new StringBuilder();
        char[] lllllllllllllllIlIIlIllllllIllIl = lllllllllllllllIlIIlIllllllIllll.toCharArray();
        int lllllllllllllllIlIIlIllllllIllII = llIIlIllllll[1];
        char[] charArray = lllllllllllllllIlIIlIlllllllIIII2.toCharArray();
        int length = charArray.length;
        int i = llIIlIllllll[1];
        while (llllllIIlIIIII(i, length)) {
            lllllllllllllllIlIIlIllllllIlllI.append((char) (charArray[i] ^ lllllllllllllllIlIIlIllllllIllIl[lllllllllllllllIlIIlIllllllIllII % lllllllllllllllIlIIlIllllllIllIl.length]));
            "".length();
            lllllllllllllllIlIIlIllllllIllII++;
            i++;
            "".length();
            if ((-" ".length()) >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIIlIllllllIlllI);
    }

    private static String llllllIIIIIllI(String lllllllllllllllIlIIlIlllllIllIll, String lllllllllllllllIlIIlIlllllIllIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllllIllIII.getBytes(StandardCharsets.UTF_8)), llIIlIllllll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llIIlIllllll[2], lllllllllllllllIlIIlIlllllIllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIlllllIlllII) {
            lllllllllllllllIlIIlIlllllIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIIlllII(int i) {
        return i != 0;
    }

    static {
        llllllIIIllIlI();
        llllllIIIllIIl();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIlIllllll[0]];
        enumC0003dArr[llIIlIllllll[1]] = EnumC0003d.OUTSIDE;
        this.ch = null;
        this.ci = Rand.nextInt(llIIlIllllll[2], llIIlIllllll[3]);
        this.cj = llIIlIllllll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v73, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        int i;
        int nextInt;
        if (!llllllIIIlllII(this.ba.h().enableChatting() ? 1 : 0) || llllllIIIlllII(this.ba.A() ? 1 : 0)) {
            return;
        }
        if (llllllIIIlllll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && llllllIIIlllll(chatMessage.getType(), ChatMessageType.SPAM) && llllllIIIlllll(chatMessage.getType(), ChatMessageType.CONSOLE) && llllllIIIlllll(chatMessage.getType(), ChatMessageType.ENGINE)) {
            i = llIIlIllllll[0];
            "".length();
            if (0 != 0) {
                return;
            }
        } else {
            i = llIIlIllllll[1];
        }
        int i2 = i;
        String lllllllllllllllIlIIllIIIIIIIIIll = chatMessage.getMessage().toLowerCase();
        if (llllllIIIlllII(lllllllllllllllIlIIllIIIIIIIIIll.contains(llIIlIlllIlI[llIIlIllllll[1]]) ? 1 : 0)) {
            this.cj = llIIlIllllll[1];
            return;
        }
        String[] split = this.ba.h().messagesAfterLoot().split(llIIlIlllIlI[llIIlIllllll[0]]);
        if (llllllIIIlllII(i2) && llllllIIIlllII(lllllllllllllllIlIIllIIIIIIIIIll.contains(Players.getLocal().getName().toLowerCase()) ? 1 : 0)) {
            int length = split.length;
            int i3 = llIIlIllllll[1];
            while (llllllIIlIIIII(i3, length)) {
                String[] split2 = split[i3].split(llIIlIlllIlI[llIIlIllllll[2]]);
                if (!llllllIIIllIll(lllllllllllllllIlIIllIIIIIIIIIll.contains(split2[llIIlIllllll[1]].toLowerCase()) ? 1 : 0)) {
                    String[] split3 = split2[llIIlIllllll[0]].split(llIIlIlllIlI[llIIlIllllll[4]]);
                    this.ch = split3[Rand.nextInt(llIIlIllllll[1], split3.length - llIIlIllllll[0])];
                    this.ci = Rand.nextInt(llIIlIllllll[2], llIIlIllllll[3]);
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                    return;
                }
                "".length();
                if (" ".length() == ((117 ^ 33) & ((68 ^ 16) ^ (-1)))) {
                    return;
                }
                i3++;
                "".length();
                if ("  ".length() <= (-" ".length())) {
                    return;
                }
            }
            return;
        }
        String[] split4 = this.ba.h().messagesAfterChat().split(llIIlIlllIlI[llIIlIllllll[5]]);
        if (llllllIIIlllII(i2)) {
            int length2 = split4.length;
            int i4 = llIIlIllllll[1];
            while (llllllIIlIIIII(i4, length2)) {
                String[] split5 = split4[i4].split(llIIlIlllIlI[llIIlIllllll[6]]);
                if (!llllllIIIllIll(lllllllllllllllIlIIllIIIIIIIIIll.contains(split5[llIIlIllllll[1]].strip().toLowerCase()) ? 1 : 0)) {
                    String[] split6 = split5[llIIlIllllll[0]].split(llIIlIlllIlI[llIIlIllllll[3]]);
                    if (llllllIIlIIIIl(split6.length, llIIlIllllll[0])) {
                        nextInt = llIIlIllllll[1];
                        "".length();
                        if ((-"   ".length()) >= 0) {
                            return;
                        }
                    } else {
                        nextInt = Rand.nextInt(llIIlIllllll[1], split6.length);
                    }
                    this.ch = split6[nextInt];
                    this.ci = Rand.nextInt(llIIlIllllll[2], llIIlIllllll[3]);
                    return;
                }
                "".length();
                if ((-"   ".length()) >= 0) {
                    return;
                }
                i4++;
                "".length();
                if (((22 ^ 0) ^ (86 ^ 68)) < " ".length()) {
                    return;
                }
            }
        }
    }

    private static boolean llllllIIIlllIl(Object obj) {
        return obj == null;
    }

    private static boolean llllllIIIllIll(int i) {
        return i == 0;
    }

    private static boolean llllllIIlIIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean llllllIIIllllI(int i) {
        return i > 0;
    }

    private static void llllllIIIllIlI() {
        llIIlIllllll = new int[9];
        llIIlIllllll[0] = " ".length();
        llIIlIllllll[1] = (54 ^ 126) & ((62 ^ 118) ^ (-1));
        llIIlIllllll[2] = "  ".length();
        llIIlIllllll[3] = (145 ^ 151) ^ ((177 ^ 184) & ((16 ^ 25) ^ (-1)));
        llIIlIllllll[4] = "   ".length();
        llIIlIllllll[5] = (204 ^ 195) ^ (188 ^ 183);
        llIIlIllllll[6] = (104 ^ 43) ^ (114 ^ 52);
        llIIlIllllll[7] = (232 ^ 156) ^ (12 ^ 127);
        llIIlIllllll[8] = (((20 + 158) - 144) + 169) ^ (((143 + 40) - 111) + 123);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        if (!llllllIIIllIll(this.ba.h().enableChatting() ? 1 : 0) && !llllllIIIlllII(this.cj ? 1 : 0) && !llllllIIIlllIl(this.ch)) {
            if (llllllIIIllllI(this.ci)) {
                this.ci -= llIIlIllllll[0];
                return llIIlIllllll[0];
            }
            Keyboard.type(this.ch, (boolean) llIIlIllllll[0]);
            this.ch = null;
            this.cj = llIIlIllllll[0];
            return llIIlIllllll[0];
        }
        return llIIlIllllll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean bf() {
        return llIIlIllllll[0];
    }

    private static void llllllIIIllIIl() {
        llIIlIlllIlI = new String[llIIlIllllll[7]];
        llIIlIlllIlI[llIIlIllllll[1]] = llllllIIIIIlIl("HDoESgcLIRQYQhE9FEoFBCAfHg4AIQ==", "eUqjb");
        llIIlIlllIlI[llIIlIllllll[0]] = llllllIIIIIlIl("Qg==", "nzZJL");
        llIIlIlllIlI[llIIlIllllll[2]] = llllllIIIIIlIl("XA==", "flbgN");
        llIIlIlllIlI[llIIlIllllll[4]] = llllllIIIIIllI("/23zGZq7ipw=", "Obrck");
        llIIlIlllIlI[llIIlIllllll[5]] = llllllIIIIIlIl("VQ==", "yfgaP");
        llIIlIlllIlI[llIIlIllllll[6]] = llllllIIIIIlIl("Uw==", "iSqRj");
        llIIlIlllIlI[llIIlIllllll[3]] = llllllIIIIIlll("DNamm1gEBJA=", "uBtZd");
    }

    private static boolean llllllIIIlllll(Object obj, Object obj2) {
        return obj != obj2;
    }
}
