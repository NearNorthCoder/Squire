package gg.squire.basics.minigames.toader;

import gg.squire.basics.minigames.toader.overlay.ToaderOverlay;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0028ba;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0029bb;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.C0031bd;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.aZ;
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
import net.runelite.client.ui.overlay.OverlayManager;
@SquireUtil
@PluginDescriptor(name = "Squire Chompy Killer", description = "Kills Toad and Chomp", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/minigames/toader/SquireToadKiller.class */
public class SquireToadKiller extends SquirePlugin {
    private /* synthetic */ int fk;
    private static /* synthetic */ int[] llllIIIIl;
    @Inject
    private /* synthetic */ ToaderOverlay fj;
    private static /* synthetic */ String[] llllIIIII;
    @Inject
    private /* synthetic */ OverlayManager bq;

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (!(llIIlllIIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && llIIlllIIlI(chatMessage.getType(), ChatMessageType.SPAM)) && llIIlllIIll(chatMessage.getMessage().contains(llllIIIII[llllIIIIl[1]]) ? 1 : 0)) {
            this.fk += llllIIIIl[2];
        }
    }

    protected void onStop() {
        this.bq.remove(this.fj);
        "".length();
    }

    protected void onStart() {
        this.bq.add(this.fj);
        "".length();
    }

    private static void llIIlllIIIl() {
        llllIIIIl = new int[5];
        llllIIIIl[0] = (86 ^ 99) ^ (114 ^ 67);
        llllIIIIl[1] = (113 ^ 33) & ((194 ^ 146) ^ (-1));
        llllIIIIl[2] = " ".length();
        llllIIIIl[3] = "  ".length();
        llllIIIIl[4] = "   ".length();
    }

    private static boolean llIIlllIIll(int i2) {
        return i2 != 0;
    }

    private static void llIIlllIIII() {
        llllIIIII = new String[llllIIIIl[2]];
        llllIIIII[llllIIIIl[1]] = llIIllIllll("jxU5BIciiHtfsNUsxT0GrtRMpuyLnF+0ve3CBJyjyqY=", "ljuAJ");
    }

    private static boolean llIIlllIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    static {
        llIIlllIIIl();
        llIIlllIIII();
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[llllIIIIl[0]];
        clsArr[llllIIIIl[1]] = aZ.class;
        clsArr[llllIIIIl[2]] = C0029bb.class;
        clsArr[llllIIIIl[3]] = C0031bd.class;
        clsArr[llllIIIIl[4]] = C0028ba.class;
        return clsArr;
    }

    public int cs() {
        return this.fk;
    }

    private static String llIIllIllll(String lIlIlIIIIIIIIlI, String lIlIlIIIIIIIIIl) {
        try {
            SecretKeySpec lIlIlIIIIIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlIlIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llllIIIIl[3], lIlIlIIIIIIIlIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lIlIlIIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlIlIIIIIIIIll) {
            lIlIlIIIIIIIIll.printStackTrace();
            return null;
        }
    }
}
