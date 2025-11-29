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

/* TASK: Chatting -> ChattingTask */
@TaskDesc(name="Chatting", priority=50, blocking=true, register=true)
public class X
extends n {
    private static /* synthetic */ String[] llIIlIlllIlI;
    private /* synthetic */ String ch;
    private /* synthetic */ boolean cj;
    private static /* synthetic */ int[] llIIlIllllll;
    private /* synthetic */ int ci;

    private static String llllllIIIIIlll(String var13, String var21) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var21.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(llIIlIllllll[2], var6);
            return new String(var11.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean llllllIIlIIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static String llllllIIIIIlIl(String var16, String var20) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var28 = new StringBuilder();
        char[] var5 = var20.toCharArray();
        int var12 = llIIlIllllll[1];
        char[] var9 = var16.toCharArray();
        int var26 = var9.length;
        int var17 = llIIlIllllll[1];
        while (X.llllllIIlIIIII(var17, var26)) {
            char var29 = var9[var17];
            var28.append((char)(var29 ^ var5[var12 % var5.length]));
            0;
            ++var12;
            ++var17;
            0;
            if (-1 < 2) continue;
            return null;
        }
        return String.valueOf(var28);
    }

    private static String llllllIIIIIllI(String var3, String var30) {
        try {
            SecretKeySpec var19 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var30.getBytes(StandardCharsets.UTF_8)), llIIlIllllll[8]), "DES");
            Cipher var8 = Cipher.getInstance("DES");
            var8.init(llIIlIllllll[2], var19);
            return new String(var8.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var15) {
            var15.printStackTrace();
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
        X var23;
        String var10;
        int var25;
        int n2;
        void var18;
        if (!X.llllllIIIlllII(this.ba.h().enableChatting() ? 1 : 0) || X.llllllIIIlllII(this.ba.A() ? 1 : 0)) {
            return;
        }
        if (X.llllllIIIlllll(var18.getType(), ChatMessageType.GAMEMESSAGE) && X.llllllIIIlllll(var18.getType(), ChatMessageType.SPAM) && X.llllllIIIlllll(var18.getType(), ChatMessageType.CONSOLE) && X.llllllIIIlllll(var18.getType(), ChatMessageType.ENGINE)) {
            n2 = llIIlIllllll[0];
            0;
            
            }
        } else {
            n2 = var25 = llIIlIllllll[1];
        }
        if (X.llllllIIIlllII((var10 = var18.getMessage().toLowerCase()).contains(llIIlIlllIlI[llIIlIllllll[1]]) ? 1 : 0)) {
            var23.cj = llIIlIllllll[1];
            return;
        }
        String[] var24 = var23.ba.h().messagesAfterLoot().split(llIIlIlllIlI[llIIlIllllll[0]]);
        if (X.llllllIIIlllII(var25) && X.llllllIIIlllII(var10.contains(Players.getLocal().getName().toLowerCase()) ? 1 : 0)) {
            String[] var7 = var24;
            int var32 = var7.length;
            int var22 = llIIlIllllll[1];
            while (X.llllllIIlIIIII(var22, var32)) {
                String var31 = var7[var22];
                String[] var4 = var31.split(llIIlIlllIlI[llIIlIllllll[2]]);
                if (X.llllllIIIllIll(var10.contains(var4[llIIlIllllll[1]].toLowerCase()) ? 1 : 0)) {
                    0;
                    if (1 == ((0x75 ^ 0x21) & ~(0x44 ^ 0x10))) {
                        return;
                    }
                } else {
                    String[] var1 = var4[llIIlIllllll[0]].split(llIIlIlllIlI[llIIlIllllll[4]]);
                    int var2 = Rand.nextInt((int)llIIlIllllll[1], (int)(var1.length - llIIlIllllll[0]));
                    var23.ch = var1[var2];
                    var23.ci = Rand.nextInt((int)llIIlIllllll[2], (int)llIIlIllllll[3]);
                    0;
                    if (3 >= 0) break;
                    return;
                }
                ++var22;
                0;
                if (2 > -1) continue;
                return;
            }
            return;
        }
        var24 = var23.ba.h().messagesAfterChat().split(llIIlIlllIlI[llIIlIllllll[5]]);
        if (X.llllllIIIlllII(var25)) {
            String[] var7 = var24;
            int var32 = var7.length;
            int var22 = llIIlIllllll[1];
            while (X.llllllIIlIIIII(var22, var32)) {
                String var31 = var7[var22];
                String[] var4 = var31.split(llIIlIlllIlI[llIIlIllllll[6]]);
                if (X.llllllIIIllIll(var10.contains(var4[llIIlIllllll[1]].strip().toLowerCase()) ? 1 : 0)) {
                    0;
                    if (-3 >= 0) {
                        return;
                    }
                } else {
                    int n3;
                    String[] var1 = var4[llIIlIllllll[0]].split(llIIlIlllIlI[llIIlIllllll[3]]);
                    if (X.llllllIIlIIIIl(var1.length, llIIlIllllll[0])) {
                        n3 = llIIlIllllll[1];
                        0;
                        if (-3 >= 0) {
                            return;
                        }
                    } else {
                        n3 = Rand.nextInt((int)llIIlIllllll[1], (int)var1.length);
                    }
                    int var2 = n3;
                    var23.ch = var1[var2];
                    var23.ci = Rand.nextInt((int)llIIlIllllll[2], (int)llIIlIllllll[3]);
                    return;
                }
                ++var22;
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
        X var27;
        if (X.llllllIIIllIll(this.ba.h().enableChatting() ? 1 : 0)) {
            return llIIlIllllll[1];
        }
        if (X.llllllIIIlllII(var27.cj ? 1 : 0)) {
            return llIIlIllllll[1];
        }
        if (X.llllllIIIlllIl(var27.ch)) {
            return llIIlIllllll[1];
        }
        if (X.llllllIIIllllI(var27.ci)) {
            var27.ci -= llIIlIllllll[0];
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

