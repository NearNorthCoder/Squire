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
        void lllllllllllllllIlIIlIllIllIIlIII;
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIlI(menuAutomated.getTarget().contains(llIIllllIlII[llIIllllIllI[0]]) ? 1 : 0)) {
            return;
        }
        int lllllllllllllllIlIIlIllIllIIIlll = Integer.parseInt(lllllllllllllllIlIIlIllIllIIlIII.getTarget().replace(llIIllllIlII[llIIllllIllI[1]], llIIllllIlII[llIIllllIllI[2]]).trim());
        e lllllllllllllllIlIIlIllIllIIIllI = e.c(lllllllllllllllIlIIlIllIllIIIlll);
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIll((Object)lllllllllllllllIlIIlIllIllIIIllI)) {
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

    private static String llllllllIIlIll(String lllllllllllllllIlIIlIllIlIllIlII, String lllllllllllllllIlIIlIllIlIllIIIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIlIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIlIllIIIl.getBytes(StandardCharsets.UTF_8)), llIIllllIllI[6]), "DES");
            Cipher lllllllllllllllIlIIlIllIlIllIllI = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIllIlIllIllI.init(llIIllllIllI[2], lllllllllllllllIlIIlIllIlIllIlll);
            return new String(lllllllllllllllIlIIlIllIlIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIllIlIllIlIl) {
            lllllllllllllllIlIIlIllIlIllIlIl.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        a lllllllllllllllIlIIlIllIlIllllIl;
        void lllllllllllllllIlIIlIllIlIllllII;
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIlIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIlIl(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIlI(lllllllllllllllIlIIlIllIlIllllII.getMessage().startsWith(llIIllllIlII[llIIllllIllI[4]]) ? 1 : 0)) {
            return;
        }
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIll((Object)lllllllllllllllIlIIlIllIlIllllIl.b)) {
            // empty if block
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=20.0f)
    public void a(MenuOptionClicked menuOptionClicked) {
        void var2_2;
        void lllllllllllllllIlIIlIllIllIIIIIl;
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIlII(menuOptionClicked.getItemId(), llIIllllIllI[3])) {
            return;
        }
        e lllllllllllllllIlIIlIllIllIIIIII = e.c(lllllllllllllllIlIIlIllIllIIIIIl.getItemId());
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIll((Object)lllllllllllllllIlIIlIllIllIIIIII)) {
            return;
        }
        this.b = var2_2;
    }

    private static boolean llllllllIlIIlI(int n2) {
        return n2 == 0;
    }

    private static String llllllllIIlIlI(String lllllllllllllllIlIIlIllIlIlIIlIl, String lllllllllllllllIlIIlIllIlIlIIlII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllIlIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllIlIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIllIlIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIllIlIlIlIIl.init(llIIllllIllI[2], lllllllllllllllIlIIlIllIlIlIlIlI);
            return new String(lllllllllllllllIlIIlIllIlIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIllIlIlIlIII) {
            lllllllllllllllIlIIlIllIlIlIlIII.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllllIlIlIl(Object object, Object object2) {
        return object != object2;
    }

    private static String llllllllIIllII(String lllllllllllllllIlIIlIllIlIIlIIlI, String lllllllllllllllIlIIlIllIlIIlIllI) {
        lllllllllllllllIlIIlIllIlIIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIlIIlIllIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIIlIllIlIIlIlIl = new StringBuilder();
        char[] lllllllllllllllIlIIlIllIlIIlIlII = lllllllllllllllIlIIlIllIlIIlIllI.toCharArray();
        int lllllllllllllllIlIIlIllIlIIlIIll = llIIllllIllI[0];
        char[] lllllllllllllllIlIIlIllIlIIIllIl = lllllllllllllllIlIIlIllIlIIlIIlI.toCharArray();
        int lllllllllllllllIlIIlIllIlIIIllII = lllllllllllllllIlIIlIllIlIIIllIl.length;
        int lllllllllllllllIlIIlIllIlIIIlIll = llIIllllIllI[0];
        while (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIllI(lllllllllllllllIlIIlIllIlIIIlIll, lllllllllllllllIlIIlIllIlIIIllII)) {
            char lllllllllllllllIlIIlIllIlIIllIII = lllllllllllllllIlIIlIllIlIIIllIl[lllllllllllllllIlIIlIllIlIIIlIll];
            lllllllllllllllIlIIlIllIlIIlIlIl.append((char)(lllllllllllllllIlIIlIllIlIIllIII ^ lllllllllllllllIlIIlIllIlIIlIlII[lllllllllllllllIlIIlIllIlIIlIIll % lllllllllllllllIlIIlIllIlIIlIlII.length]));
            0;
            ++lllllllllllllllIlIIlIllIlIIlIIll;
            ++lllllllllllllllIlIIlIllIlIIIlIll;
            0;
            if (2 <= 3) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIIlIllIlIIlIlIl);
    }
}

