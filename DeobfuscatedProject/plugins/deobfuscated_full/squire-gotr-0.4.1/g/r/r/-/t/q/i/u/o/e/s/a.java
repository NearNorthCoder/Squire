/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Singleton
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.MenuOptionClicked
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.events.MenuAutomated
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.e;
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
public class a {
    private static /* synthetic */ int[] llIIllllIllI;
    private /* synthetic */ e b;
    private static /* synthetic */ String[] llIIllllIlII;
    private static final /* synthetic */ Logger a;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(MenuAutomated menuAutomated) {
        void var3_3;
        void var21;
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIlI(menuAutomated.getTarget().contains(llIIllllIlII[llIIllllIllI[0]]) ? 1 : 0)) {
            return;
        }
        int var12 = Integer.parseInt(var21.getTarget().replace(llIIllllIlII[llIIllllIllI[1]], llIIllllIlII[llIIllllIllI[2]]).trim());
        e var7 = e.c(var12);
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIll((Object)var7)) {
            return;
        }
        this.b = var3_3;
    }

    private static void llllllllIlIIIl() {
        llIIllllIllI = new int[7];
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[0] = (123 + 134 - 131 + 20 ^ 77 + 93 - 141 + 132) & (0xCC ^ 0x90 ^ (0x3F ^ 0x50) ^ -1);
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[1] = 1;
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[2] = 2;
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[3] = -1;
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[4] = 3;
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[5] = 0x19 ^ 0x1D;
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[6] = 0x1E ^ 0x16;
    }

    private static boolean llllllllIlIIll(Object object) {
        return object == null;
    }

    private static void llllllllIIllIl() {
        llIIllllIlII = new String[llIIllllIllI[5]];
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIlII[g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[0]] = g.r.r.-.t.q.i.u.o.e.s.a."ItemId=";
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIlII[g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[1]] = g.r.r.-.t.q.i.u.o.e.s.a."ItemId=";
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIlII[g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[2]] = g.r.r.-.t.q.i.u.o.e.s.a."";
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIlII[g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[4]] = g.r.r.-.t.q.i.u.o.e.s.a."You cannot add any more essence to the pouch";
    }

    static {
        g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIIl();
        g.r.r.-.t.q.i.u.o.e.s.a.llllllllIIllIl();
        a = LoggerFactory.getLogger(a.class);
    }

    private static boolean llllllllIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static String llllllllIIlIll(String var10, String var14) {
        try {
            SecretKeySpec var18 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), llIIllllIllI[6]), "DES");
            Cipher var4 = Cipher.getInstance("DES");
            var4.init(llIIllllIllI[2], var18);
            return new String(var4.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        a var19;
        void var8;
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIlIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIlIl(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIlI(var8.getMessage().startsWith(llIIllllIlII[llIIllllIllI[4]]) ? 1 : 0)) {
            return;
        }
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIll((Object)var19.b)) {
            // empty if block
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=20.0f)
    public void a(MenuOptionClicked menuOptionClicked) {
        void var2_2;
        void var3;
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIlII(menuOptionClicked.getItemId(), llIIllllIllI[3])) {
            return;
        }
        e var15 = e.c(var3.getItemId());
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIll((Object)var15)) {
            return;
        }
        this.b = var2_2;
    }

    private static boolean llllllllIlIIlI(int n2) {
        return n2 == 0;
    }

    private static String llllllllIIlIlI(String var22, String var11) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(llIIllllIllI[2], var24);
            return new String(var6.doFinal(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllllIlIlIl(Object object, Object object2) {
        return object != object2;
    }

    private static String llllllllIIllII(String var26, String var25) {
        var26 = new String(Base64.getDecoder().decode(var26.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var20 = new StringBuilder();
        char[] var16 = var25.toCharArray();
        int var5 = llIIllllIllI[0];
        char[] var1 = var26.toCharArray();
        int var2 = var1.length;
        int var23 = llIIllllIllI[0];
        while (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIllI(var23, var2)) {
            char var9 = var1[var23];
            var20.append((char)(var9 ^ var16[var5 % var16.length]));
            0;
            ++var5;
            ++var23;
            0;
            if (2 <= 3) continue;
            return null;
        }
        return String.valueOf(var20);
    }
}

