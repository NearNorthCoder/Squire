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
package gg.squire.runecrafting.tasks;

import gg.squire.runecrafting.tasks.GameEnum16;
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
public class AHelper {
    
    private  e b;
    
    private static final  Logger a;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void AHelper(MenuAutomated menuAutomated) {
        void var3_3;
        void var1;
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIlI(menuAutomated.getTarget().contains(llIIllllIlII[llIIllllIllI[0]]) ? 1 : 0)) {
            return;
        }
        int var2 = Integer.parseInt(var1.getTarget().replace(llIIllllIlII[llIIllllIllI[1]], llIIllllIlII[llIIllllIllI[2]]).trim());
        e var3 = e.c(var2);
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIll((Object)var3)) {
            return;
        }
        this.b = var3_3;
    }

    private static boolean llllllllIlIIll(Object object) {
        return object == null;
    }

    private static void llllllllIIllIl() {
        llIIllllIlII = new String[llIIllllIllI[5]];
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIlII[g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[0]] = g.r.r.-.t.q.i.u.o.e.s."ItemId=";
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIlII[g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[1]] = g.r.r.-.t.q.i.u.o.e.s."ItemId=";
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIlII[g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[2]] = g.r.r.-.t.q.i.u.o.e.s.a.llllllllIIllII("", "rrGzP");
        g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIlII[g.r.r.-.t.q.i.u.o.e.s.a.llIIllllIllI[4]] = g.r.r.-.t.q.i.u.o.e.s."You cannot add any more essence to the pouch";
    }

    static {
        g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIIl();
        g.r.r.-.t.q.i.u.o.e.s.a.llllllllIIllIl();
        a = LoggerFactory.getLogger(AHelper.class);
    }

    private static boolean llllllllIlIlII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void AHelper(ChatMessage chatMessage) {
        a var4;
        void var5;
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIlIl(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIlIl(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIlI(var5.getMessage().startsWith(llIIllllIlII[llIIllllIllI[4]]) ? 1 : 0)) {
            return;
        }
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIll((Object)var4.b)) {
            // empty if block
        }
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=20.0f)
    public void AHelper(MenuOptionClicked menuOptionClicked) {
        void var2_2;
        void var6;
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIlII(menuOptionClicked.getItemId(), llIIllllIllI[3])) {
            return;
        }
        e var7 = e.c(var6.getItemId());
        if (g.r.r.-.t.q.i.u.o.e.s.a.llllllllIlIIll((Object)var7)) {
            return;
        }
        this.b = var2_2;
    }

    private static boolean llllllllIlIIlI(int n2) {
        return n2 == 0;
    }

    private static boolean llllllllIlIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllllIlIlIl(Object object, Object object2) {
        return object != object2;
    }

        return String.valueOf(var8);
    }
}

