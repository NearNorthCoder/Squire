/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Game
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.b;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;

@TaskDesc(name="Logging out", priority=0x7FFFFFFE, blocking=true)
public class n
extends Task {
    private final /* synthetic */ b K;
    private static /* synthetic */ int[] lIIllIllIIIII;
    private /* synthetic */ Player G;
    private final /* synthetic */ TempleTrekkingPlugin I;
    private final /* synthetic */ TempleTrekkingConfig J;
    private static /* synthetic */ String[] lIIllIlIlllll;

    private static boolean lIllIIIlIIIIIIl(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIlIIIIIII() {
        lIIllIllIIIII = new int[3];
        n.lIIllIllIIIII[0] = (0x41 ^ 0x36 ^ (0x6F ^ 9)) & (0x40 ^ 0x37 ^ (0xC4 ^ 0xA2) ^ -1);
        n.lIIllIllIIIII[1] = 1;
        n.lIIllIllIIIII[2] = 2;
    }

    private static void lIllIIIIlllllll() {
        lIIllIlIlllll = new String[lIIllIllIIIII[1]];
        n.lIIllIlIlllll[n.lIIllIllIIIII[0]] = n."Logging out to reset 6h timer";
    }

    public boolean run() {
        n llllllllllllllIlllIlllIlllIIlIll;
        if (n.lIllIIIlIIIIIIl(this.I.k() ? 1 : 0)) {
            return lIIllIllIIIII[0];
        }
        Player llllllllllllllIlllIlllIlllIIlIlI = Players.getLocal();
        if (n.lIllIIIlIIIIIIl(llllllllllllllIlllIlllIlllIIlIll.I.f().contains((Locatable)llllllllllllllIlllIlllIlllIIlIlI) ? 1 : 0) && n.lIllIIIlIIIIIIl(llllllllllllllIlllIlllIlllIIlIll.I.g().contains((Locatable)llllllllllllllIlllIlllIlllIIlIlI) ? 1 : 0)) {
            return lIIllIllIIIII[0];
        }
        Game.logout();
        System.out.println(lIIllIlIlllll[lIIllIllIIIII[0]]);
        return lIIllIllIIIII[0];
    }

    static {
        n.lIllIIIlIIIIIII();
        n.lIllIIIIlllllll();
    }

    @Inject
    public n(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b b2) {
        this.J = templeTrekkingConfig;
        this.K = b2;
        this.I = templeTrekkingPlugin;
    }

    private static String lIllIIIIllllllI(String llllllllllllllIlllIlllIlllIIIIII, String llllllllllllllIlllIlllIllIllllll) {
        try {
            SecretKeySpec llllllllllllllIlllIlllIlllIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIlllIllIllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIlllIlllIIIlII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIlllIlllIIIlII.init(lIIllIllIIIII[2], llllllllllllllIlllIlllIlllIIIlIl);
            return new String(llllllllllllllIlllIlllIlllIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIlllIlllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIlllIlllIIIIll) {
            llllllllllllllIlllIlllIlllIIIIll.printStackTrace();
            return null;
        }
    }
}

