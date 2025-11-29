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
package gg.squire.autotoa.tasks;

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
import gg.squire.autotoa.tasks.AutotoaTaskBase;

@TaskDesc(name="Logging out and stopping", priority=0x7FFFFFFF, blocking=true)
public class LoggingOutAndStoppingTask
extends AutotoaTaskBase {
    
    private  boolean ia;

    private static boolean lIIllIIlllllll(int n2) {
        return n2 == 0;
    }

    @Inject
    protected LoggingOutAndStoppingTask(Client client, TOAConfig tOAConfig) {
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

    private static boolean lIIllIlIIIIIII(int n2) {
        return n2 != 0;
    }

    static {
        cm.lIIllIIllllllI();
        cm.lIIllIIlllllIl();
    }

    private static void lIIllIIlllllIl() {
        lIlllIllIll = new String[lIlllIlllII[1]];
        cm.lIlllIllIll[cm.lIlllIlllII[0]] = "has no charges";
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (cm.lIIllIlIIIIIII(chatMessage.getMessage().contains(lIlllIllIll[lIlllIlllII[0]]) ? 1 : 0)) {
            this.ia = lIlllIlllII[1];
        }
    }
}

