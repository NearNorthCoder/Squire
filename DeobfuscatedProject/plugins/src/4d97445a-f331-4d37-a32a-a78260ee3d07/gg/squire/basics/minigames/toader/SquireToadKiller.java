/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 */
package gg.squire.basics.minigames.toader;

import gg.squire.basics.minigames.toader.overlay.ToaderOverlay;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aZ;
import i.i.b.s.c.q.r.s.s.-.u.a.e.ba;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bb;
import i.i.b.s.c.q.r.s.s.-.u.a.e.bd;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;

@SquireUtil
@PluginDescriptor(name="Squire Chompy Killer", description="Kills Toad and Chomp", enabledByDefault=false)
public class SquireToadKiller
extends SquirePlugin {
    private /* synthetic */ int fk;
    private static /* synthetic */ int[] llllIIIIl;
    @Inject
    private /* synthetic */ ToaderOverlay fj;
    private static /* synthetic */ String[] llllIIIII;
    @Inject
    private /* synthetic */ OverlayManager bq;

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void lIlIlIIIIIIlIlI;
        if (SquireToadKiller.llIIlllIIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && SquireToadKiller.llIIlllIIlI(chatMessage.getType(), ChatMessageType.SPAM)) {
            return;
        }
        if (SquireToadKiller.llIIlllIIll(lIlIlIIIIIIlIlI.getMessage().contains(llllIIIII[llllIIIIl[1]]) ? 1 : 0)) {
            lIlIlIIIIIIlIll.fk += llllIIIIl[2];
        }
    }

    protected void onStop() {
        this.bq.remove((Overlay)this.fj);
        "".length();
    }

    protected void onStart() {
        this.bq.add((Overlay)this.fj);
        "".length();
    }

    private static void llIIlllIIIl() {
        llllIIIIl = new int[5];
        SquireToadKiller.llllIIIIl[0] = 0x56 ^ 0x63 ^ (0x72 ^ 0x43);
        SquireToadKiller.llllIIIIl[1] = (0x71 ^ 0x21) & ~(0xC2 ^ 0x92);
        SquireToadKiller.llllIIIIl[2] = " ".length();
        SquireToadKiller.llllIIIIl[3] = "  ".length();
        SquireToadKiller.llllIIIIl[4] = "   ".length();
    }

    private static boolean llIIlllIIll(int n2) {
        return n2 != 0;
    }

    private static void llIIlllIIII() {
        llllIIIII = new String[llllIIIIl[2]];
        SquireToadKiller.llllIIIII[SquireToadKiller.llllIIIIl[1]] = SquireToadKiller.llIIllIllll("jxU5BIciiHtfsNUsxT0GrtRMpuyLnF+0ve3CBJyjyqY=", "ljuAJ");
    }

    private static boolean llIIlllIIlI(Object object, Object object2) {
        return object != object2;
    }

    static {
        SquireToadKiller.llIIlllIIIl();
        SquireToadKiller.llIIlllIIII();
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[llllIIIIl[0]];
        classArray[SquireToadKiller.llllIIIIl[1]] = aZ.class;
        classArray[SquireToadKiller.llllIIIIl[2]] = bb.class;
        classArray[SquireToadKiller.llllIIIIl[3]] = bd.class;
        classArray[SquireToadKiller.llllIIIIl[4]] = ba.class;
        return classArray;
    }

    public int cs() {
        return this.fk;
    }

    private static String llIIllIllll(String lIlIlIIIIIIIIII, String lIlIIllllllllll) {
        try {
            SecretKeySpec lIlIlIIIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIIllllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlIlIIIIIIIlII = Cipher.getInstance("Blowfish");
            lIlIlIIIIIIIlII.init(llllIIIIl[3], lIlIlIIIIIIIlIl);
            return new String(lIlIlIIIIIIIlII.doFinal(Base64.getDecoder().decode(lIlIlIIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIlIIIIIIIIll) {
            lIlIlIIIIIIIIll.printStackTrace();
            return null;
        }
    }
}

