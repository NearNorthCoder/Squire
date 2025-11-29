/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.input.Keyboard
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.input.Keyboard;

@TaskDesc(name="Chatting", priority=50, blocking=true, register=true)
public class X
extends n {
    private static /* synthetic */ String[] llIIlIlllIlI;
    private /* synthetic */ String ch;
    private /* synthetic */ boolean cj;
    private static /* synthetic */ int[] llIIlIllllll;
    private /* synthetic */ int ci;

    private static String llllllIIIIIlll(String lllllllllllllllIlIIlIlllllIIllII, String lllllllllllllllIlIIlIlllllIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIlllllIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIlllllIlIIII.init(llIIlIllllll[2], lllllllllllllllIlIIlIlllllIlIIIl);
            return new String(lllllllllllllllIlIIlIlllllIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlllllIIllll) {
            lllllllllllllllIlIIlIlllllIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String llllllIIIIIlIl(String lllllllllllllllIlIIlIllllllIlIll, String lllllllllllllllIlIIlIllllllIllll) {
        lllllllllllllllIlIIlIllllllIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllllllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIllllllIlllI = new StringBuilder();
        char[] lllllllllllllllIlIIlIllllllIllIl = lllllllllllllllIlIIlIllllllIllll.toCharArray();
        int lllllllllllllllIlIIlIllllllIllII = llIIlIllllll[1];
        char[] lllllllllllllllIlIIlIllllllIIllI = lllllllllllllllIlIIlIllllllIlIll.toCharArray();
        int lllllllllllllllIlIIlIllllllIIlIl = lllllllllllllllIlIIlIllllllIIllI.length;
        int lllllllllllllllIlIIlIllllllIIlII = llIIlIllllll[1];
        while (X.llllllIIlIIIII(lllllllllllllllIlIIlIllllllIIlII, lllllllllllllllIlIIlIllllllIIlIl)) {
            char lllllllllllllllIlIIlIlllllllIIIl = lllllllllllllllIlIIlIllllllIIllI[lllllllllllllllIlIIlIllllllIIlII];
            lllllllllllllllIlIIlIllllllIlllI.append((char)(lllllllllllllllIlIIlIlllllllIIIl ^ lllllllllllllllIlIIlIllllllIllIl[lllllllllllllllIlIIlIllllllIllII % lllllllllllllllIlIIlIllllllIllIl.length]));
            0;
            ++lllllllllllllllIlIIlIllllllIllII;
            ++lllllllllllllllIlIIlIllllllIIlII;
            0;
            if (-1 < 2) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIllllllIlllI);
    }

    private static String llllllIIIIIllI(String lllllllllllllllIlIIlIlllllIllIIl, String lllllllllllllllIlIIlIlllllIllIlI) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIlllllIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIlllllIllIlI.getBytes(StandardCharsets.UTF_8)), llIIlIllllll[8]), "DES");
            Cipher lllllllllllllllIlIIlIlllllIlllIl = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIlllllIlllIl.init(llIIlIllllll[2], lllllllllllllllIlIIlIlllllIllllI);
            return new String(lllllllllllllllIlIIlIlllllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIlllllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIlllllIlllII) {
            lllllllllllllllIlIIlIlllllIlllII.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIIlllII(int n2) {
        return n2 != 0;
    }

    static {
        X.llllllIIIllIlI();
        X.llllllIIIllIIl();
    }

    @Inject
    public X(c c2) {
        d[] dArray = new d[llIIlIllllll[0]];
        dArray[X.llIIlIllllll[1]] = d.OUTSIDE;
        super(c2, dArray);
        this.ch = null;
        this.ci = Rand.nextInt((int)llIIlIllllll[2], (int)llIIlIllllll[3]);
        this.cj = llIIlIllllll[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        X lllllllllllllllIlIIllIIIIIIIIllI;
        String lllllllllllllllIlIIllIIIIIIIIIll;
        int lllllllllllllllIlIIllIIIIIIIIlII;
        int n2;
        void lllllllllllllllIlIIllIIIIIIIIlIl;
        if (!X.llllllIIIlllII(this.ba.h().enableChatting() ? 1 : 0) || X.llllllIIIlllII(this.ba.A() ? 1 : 0)) {
            return;
        }
        if (X.llllllIIIlllll(lllllllllllllllIlIIllIIIIIIIIlIl.getType(), ChatMessageType.GAMEMESSAGE) && X.llllllIIIlllll(lllllllllllllllIlIIllIIIIIIIIlIl.getType(), ChatMessageType.SPAM) && X.llllllIIIlllll(lllllllllllllllIlIIllIIIIIIIIlIl.getType(), ChatMessageType.CONSOLE) && X.llllllIIIlllll(lllllllllllllllIlIIllIIIIIIIIlIl.getType(), ChatMessageType.ENGINE)) {
            n2 = llIIlIllllll[0];
            0;
            if (null != null) {
                return;
            }
        } else {
            n2 = lllllllllllllllIlIIllIIIIIIIIlII = llIIlIllllll[1];
        }
        if (X.llllllIIIlllII((lllllllllllllllIlIIllIIIIIIIIIll = lllllllllllllllIlIIllIIIIIIIIlIl.getMessage().toLowerCase()).contains(llIIlIlllIlI[llIIlIllllll[1]]) ? 1 : 0)) {
            lllllllllllllllIlIIllIIIIIIIIllI.cj = llIIlIllllll[1];
            return;
        }
        String[] lllllllllllllllIlIIllIIIIIIIIIlI = lllllllllllllllIlIIllIIIIIIIIllI.ba.h().messagesAfterLoot().split(llIIlIlllIlI[llIIlIllllll[0]]);
        if (X.llllllIIIlllII(lllllllllllllllIlIIllIIIIIIIIlII) && X.llllllIIIlllII(lllllllllllllllIlIIllIIIIIIIIIll.contains(Players.getLocal().getName().toLowerCase()) ? 1 : 0)) {
            String[] lllllllllllllllIlIIllIIIIIIIIIIl = lllllllllllllllIlIIllIIIIIIIIIlI;
            int lllllllllllllllIlIIllIIIIIIIIIII = lllllllllllllllIlIIllIIIIIIIIIIl.length;
            int lllllllllllllllIlIIlIlllllllllll = llIIlIllllll[1];
            while (X.llllllIIlIIIII(lllllllllllllllIlIIlIlllllllllll, lllllllllllllllIlIIllIIIIIIIIIII)) {
                String lllllllllllllllIlIIlIllllllllllI = lllllllllllllllIlIIllIIIIIIIIIIl[lllllllllllllllIlIIlIlllllllllll];
                String[] lllllllllllllllIlIIlIlllllllllIl = lllllllllllllllIlIIlIllllllllllI.split(llIIlIlllIlI[llIIlIllllll[2]]);
                if (X.llllllIIIllIll(lllllllllllllllIlIIllIIIIIIIIIll.contains(lllllllllllllllIlIIlIlllllllllIl[llIIlIllllll[1]].toLowerCase()) ? 1 : 0)) {
                    0;
                    if (1 == ((0x75 ^ 0x21) & ~(0x44 ^ 0x10))) {
                        return;
                    }
                } else {
                    String[] lllllllllllllllIlIIlIlllllllllII = lllllllllllllllIlIIlIlllllllllIl[llIIlIllllll[0]].split(llIIlIlllIlI[llIIlIllllll[4]]);
                    int lllllllllllllllIlIIlIllllllllIll = Rand.nextInt((int)llIIlIllllll[1], (int)(lllllllllllllllIlIIlIlllllllllII.length - llIIlIllllll[0]));
                    lllllllllllllllIlIIllIIIIIIIIllI.ch = lllllllllllllllIlIIlIlllllllllII[lllllllllllllllIlIIlIllllllllIll];
                    lllllllllllllllIlIIllIIIIIIIIllI.ci = Rand.nextInt((int)llIIlIllllll[2], (int)llIIlIllllll[3]);
                    0;
                    if (3 >= 0) break;
                    return;
                }
                ++lllllllllllllllIlIIlIlllllllllll;
                0;
                if (2 > -1) continue;
                return;
            }
            return;
        }
        lllllllllllllllIlIIllIIIIIIIIIlI = lllllllllllllllIlIIllIIIIIIIIllI.ba.h().messagesAfterChat().split(llIIlIlllIlI[llIIlIllllll[5]]);
        if (X.llllllIIIlllII(lllllllllllllllIlIIllIIIIIIIIlII)) {
            String[] lllllllllllllllIlIIllIIIIIIIIIIl = lllllllllllllllIlIIllIIIIIIIIIlI;
            int lllllllllllllllIlIIllIIIIIIIIIII = lllllllllllllllIlIIllIIIIIIIIIIl.length;
            int lllllllllllllllIlIIlIlllllllllll = llIIlIllllll[1];
            while (X.llllllIIlIIIII(lllllllllllllllIlIIlIlllllllllll, lllllllllllllllIlIIllIIIIIIIIIII)) {
                String lllllllllllllllIlIIlIllllllllllI = lllllllllllllllIlIIllIIIIIIIIIIl[lllllllllllllllIlIIlIlllllllllll];
                String[] lllllllllllllllIlIIlIlllllllllIl = lllllllllllllllIlIIlIllllllllllI.split(llIIlIlllIlI[llIIlIllllll[6]]);
                if (X.llllllIIIllIll(lllllllllllllllIlIIllIIIIIIIIIll.contains(lllllllllllllllIlIIlIlllllllllIl[llIIlIllllll[1]].strip().toLowerCase()) ? 1 : 0)) {
                    0;
                    if (-3 >= 0) {
                        return;
                    }
                } else {
                    int n3;
                    String[] lllllllllllllllIlIIlIlllllllllII = lllllllllllllllIlIIlIlllllllllIl[llIIlIllllll[0]].split(llIIlIlllIlI[llIIlIllllll[3]]);
                    if (X.llllllIIlIIIIl(lllllllllllllllIlIIlIlllllllllII.length, llIIlIllllll[0])) {
                        n3 = llIIlIllllll[1];
                        0;
                        if (-3 >= 0) {
                            return;
                        }
                    } else {
                        n3 = Rand.nextInt((int)llIIlIllllll[1], (int)lllllllllllllllIlIIlIlllllllllII.length);
                    }
                    int lllllllllllllllIlIIlIllllllllIll = n3;
                    lllllllllllllllIlIIllIIIIIIIIllI.ch = lllllllllllllllIlIIlIlllllllllII[lllllllllllllllIlIIlIllllllllIll];
                    lllllllllllllllIlIIllIIIIIIIIllI.ci = Rand.nextInt((int)llIIlIllllll[2], (int)llIIlIllllll[3]);
                    return;
                }
                ++lllllllllllllllIlIIlIlllllllllll;
                0;
                if ((0x16 ^ 0 ^ (0x56 ^ 0x44)) >= 1) continue;
                return;
            }
        }
    }

    private static boolean llllllIIIlllIl(Object object) {
        return object == null;
    }

    private static boolean llllllIIIllIll(int n2) {
        return n2 == 0;
    }

    private static boolean llllllIIlIIIIl(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllllIIIllllI(int n2) {
        return n2 > 0;
    }

    private static void llllllIIIllIlI() {
        llIIlIllllll = new int[9];
        X.llIIlIllllll[0] = 1;
        X.llIIlIllllll[1] = (0x36 ^ 0x7E) & ~(0x3E ^ 0x76);
        X.llIIlIllllll[2] = 2;
        X.llIIlIllllll[3] = 0x91 ^ 0x97 ^ (0xB1 ^ 0xB8) & ~(0x10 ^ 0x19);
        X.llIIlIllllll[4] = 3;
        X.llIIlIllllll[5] = 0xCC ^ 0xC3 ^ (0xBC ^ 0xB7);
        X.llIIlIllllll[6] = 0x68 ^ 0x2B ^ (0x72 ^ 0x34);
        X.llIIlIllllll[7] = 0xE8 ^ 0x9C ^ (0xC ^ 0x7F);
        X.llIIlIllllll[8] = 20 + 158 - 144 + 169 ^ 143 + 40 - 111 + 123;
    }

    @Override
    public boolean be() {
        X lllllllllllllllIlIIllIIIIIIlIIll;
        if (X.llllllIIIllIll(this.ba.h().enableChatting() ? 1 : 0)) {
            return llIIlIllllll[1];
        }
        if (X.llllllIIIlllII(lllllllllllllllIlIIllIIIIIIlIIll.cj ? 1 : 0)) {
            return llIIlIllllll[1];
        }
        if (X.llllllIIIlllIl(lllllllllllllllIlIIllIIIIIIlIIll.ch)) {
            return llIIlIllllll[1];
        }
        if (X.llllllIIIllllI(lllllllllllllllIlIIllIIIIIIlIIll.ci)) {
            lllllllllllllllIlIIllIIIIIIlIIll.ci -= llIIlIllllll[0];
            return llIIlIllllll[0];
        }
        Keyboard.type((String)this.ch, (boolean)llIIlIllllll[0]);
        this.ch = null;
        this.cj = llIIlIllllll[0];
        return llIIlIllllll[0];
    }

    @Override
    public boolean bf() {
        return llIIlIllllll[0];
    }

    private static void llllllIIIllIIl() {
        llIIlIlllIlI = new String[llIIlIllllll[7]];
        X.llIIlIlllIlI[X.llIIlIllllll[1]] = X."you enter the gauntlet";
        X.llIIlIlllIlI[X.llIIlIllllll[0]] = X.",";
        X.llIIlIlllIlI[X.llIIlIllllll[2]] = X.":";
        X.llIIlIlllIlI[X.llIIlIllllll[4]] = X.";";
        X.llIIlIlllIlI[X.llIIlIllllll[5]] = X.",";
        X.llIIlIlllIlI[X.llIIlIllllll[6]] = X.":";
        X.llIIlIlllIlI[X.llIIlIllllll[3]] = X.";";
    }

    private static boolean llllllIIIlllll(Object object, Object object2) {
        return object != object2;
    }
}

