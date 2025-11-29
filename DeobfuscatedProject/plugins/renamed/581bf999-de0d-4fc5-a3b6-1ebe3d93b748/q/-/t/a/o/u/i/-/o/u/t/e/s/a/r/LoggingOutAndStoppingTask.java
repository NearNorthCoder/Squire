/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.Squire
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.Squire;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.ck_Unknown;

/* TASK: Logging out and stopping -> LoggingoutandstoppingTask */
@TaskDesc(name="Logging out and stopping", priority=0x7FFFFFFF, blocking=true)
public class LoggingOutAndStoppingTask
extends ck_Unknown {
    private static /* synthetic */ int[] lIlllIlllII;
    private /* synthetic */ boolean ia;
    private static /* synthetic */ String[] lIlllIllIll;

    private static boolean lIIllIIlllllll(int n2) {
        return n2 == 0;
    }

    @Inject
    protected cm(Client client, TOAConfig tOAConfig) {
        super(client, tOAConfig);
    }

    @Override
    public boolean bl() {
        if (cm.lIIllIIlllllll(this.ia ? 1 : 0)) {
            return lIlllIlllII[0];
        }
        Squire.stop();
        this.aY.forceStop();
        return lIlllIlllII[1];
    }

    private static void lIIllIIllllllI() {
        lIlllIlllII = new int[3];
        cm.lIlllIlllII[0] = (0xD7 ^ 0xB4 ^ 3) & (76 + 13 - -59 + 61 ^ 46 + 15 - 0 + 116 ^ -1);
        cm.lIlllIlllII[1] = 1;
        cm.lIlllIlllII[2] = 2;
    }

    private static String lIIllIIlllIIll(String var2, String var5) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var3 = Cipher.getInstance("Blowfish");
            var3.init(lIlllIlllII[2], var4);
            return new String(var3.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIlIIIIIII(int n2) {
        return n2 != 0;
    }

    static {
        cm.lIIllIIllllllI();
        cm.lIIllIIlllllIl();
    }

    private static void lIIllIIlllllIl() {
        lIlllIllIll = new String[lIlllIlllII[1]];
        cm.lIlllIllIll[cm.lIlllIlllII[0]] = cm."has no charges";
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (cm.lIIllIlIIIIIII(chatMessage.getMessage().contains(lIlllIllIll[lIlllIlllII[0]]) ? 1 : 0)) {
            this.ia = lIlllIlllII[1];
        }
    }
}

