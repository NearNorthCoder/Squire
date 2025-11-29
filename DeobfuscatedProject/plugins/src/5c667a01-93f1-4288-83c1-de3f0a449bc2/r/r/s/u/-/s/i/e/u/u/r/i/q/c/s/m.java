/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Actor
 *  net.runelite.api.Client
 *  net.runelite.api.widgets.Widget
 *  net.unethicalite.api.entities.Players
 */
package r.r.s.u.-.s.i.e.u.u.r.i.q.c.s;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.scurrius.SquireScurrius;
import gg.squire.scurrius.SquireScurriusConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Actor;
import net.runelite.api.Client;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.entities.Players;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.a;
import r.r.s.u.-.s.i.e.u.u.r.i.q.c.s.b;

@TaskDesc(name="Attack Boss", priority=4000, blocking=true)
public class m
extends a {
    private /* synthetic */ List<Widget> X;
    private static /* synthetic */ String[] lIIlIlIllllII;
    private static /* synthetic */ int W;
    private static /* synthetic */ int[] lIIlIlIllllIl;

    private static boolean lIlIllIIlIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public boolean a() {
        m llllllllllllllIllllIllIIlIllllII;
        int llllllllllllllIllllIllIIlIlllIlI;
        int n2;
        Actor actor = Players.getLocal().getInteracting();
        if (m.lIlIllIIlIIIIll(actor) && m.lIlIllIIlIIIlII(actor.hasAction(lIIlIlIllllII[lIIlIlIllllIl[0]]::equals) ? 1 : 0)) {
            n2 = lIIlIlIllllIl[1];
            "".length();
            if (null != null) {
                return ((3 ^ 0x2D) & ~(0x74 ^ 0x5A)) != 0;
            }
        } else {
            n2 = lIIlIlIllllIl[0];
        }
        if (m.lIlIllIIlIIIlII(llllllllllllllIllllIllIIlIlllIlI = n2)) {
            return lIIlIlIllllIl[0];
        }
        if (m.lIlIllIIlIIIlII(llllllllllllllIllllIllIIlIllllII.f.isDead() ? 1 : 0)) {
            return lIIlIlIllllIl[0];
        }
        this.f.interact(lIIlIlIllllII[lIIlIlIllllIl[1]]);
        return lIIlIlIllllIl[1];
    }

    private static void lIlIllIIlIIIIlI() {
        lIIlIlIllllIl = new int[5];
        m.lIIlIlIllllIl[0] = (0x26 ^ 0x69) & ~(0x7A ^ 0x35);
        m.lIIlIlIllllIl[1] = " ".length();
        m.lIIlIlIllllIl[2] = -(0xFFFFD3DD & 0x7CF7) & (0xFFFFF6DF & 0x34159FF);
        m.lIIlIlIllllIl[3] = "  ".length();
        m.lIIlIlIllllIl[4] = 0x50 ^ 0x58;
    }

    private static boolean lIlIllIIlIIIIll(Object object) {
        return object != null;
    }

    static {
        m.lIlIllIIlIIIIlI();
        m.lIlIllIIlIIIIIl();
        W = lIIlIlIllllIl[2];
    }

    @Inject
    protected m(SquireScurrius squireScurrius, SquireScurriusConfig squireScurriusConfig, b b2, Client client) {
        super(squireScurrius, squireScurriusConfig, b2, client);
        this.X = new ArrayList<Widget>();
    }

    private static String lIlIllIIIllllll(String llllllllllllllIllllIllIIlIllIIlI, String llllllllllllllIllllIllIIlIlIllll) {
        try {
            SecretKeySpec llllllllllllllIllllIllIIlIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllllIllIIlIlIllll.getBytes(StandardCharsets.UTF_8)), lIIlIlIllllIl[4]), "DES");
            Cipher llllllllllllllIllllIllIIlIllIlII = Cipher.getInstance("DES");
            llllllllllllllIllllIllIIlIllIlII.init(lIIlIlIllllIl[3], llllllllllllllIllllIllIIlIllIlIl);
            return new String(llllllllllllllIllllIllIIlIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllIllllIllIIlIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllllIllIIlIllIIll) {
            llllllllllllllIllllIllIIlIllIIll.printStackTrace();
            return null;
        }
    }

    private static void lIlIllIIlIIIIIl() {
        lIIlIlIllllII = new String[lIIlIlIllllIl[3]];
        m.lIIlIlIllllII[m.lIIlIlIllllIl[0]] = m.lIlIllIIIllllll("vFWrFmI/Pug=", "Corbc");
        m.lIIlIlIllllII[m.lIIlIlIllllIl[1]] = m.lIlIllIIlIIIIII("KBY8JSQC", "ibHDG");
    }

    private static String lIlIllIIlIIIIII(String llllllllllllllIllllIllIIlIlIIIlI, String llllllllllllllIllllIllIIlIlIIIIl) {
        llllllllllllllIllllIllIIlIlIIIlI = new String(Base64.getDecoder().decode(llllllllllllllIllllIllIIlIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllllIllIIlIlIIIII = new StringBuilder();
        char[] llllllllllllllIllllIllIIlIIlllll = llllllllllllllIllllIllIIlIlIIIIl.toCharArray();
        int llllllllllllllIllllIllIIlIIllllI = lIIlIlIllllIl[0];
        char[] llllllllllllllIllllIllIIlIIllIII = llllllllllllllIllllIllIIlIlIIIlI.toCharArray();
        int llllllllllllllIllllIllIIlIIlIlll = llllllllllllllIllllIllIIlIIllIII.length;
        int llllllllllllllIllllIllIIlIIlIllI = lIIlIlIllllIl[0];
        while (m.lIlIllIIlIIIlIl(llllllllllllllIllllIllIIlIIlIllI, llllllllllllllIllllIllIIlIIlIlll)) {
            char llllllllllllllIllllIllIIlIlIIIll = llllllllllllllIllllIllIIlIIllIII[llllllllllllllIllllIllIIlIIlIllI];
            llllllllllllllIllllIllIIlIlIIIII.append((char)(llllllllllllllIllllIllIIlIlIIIll ^ llllllllllllllIllllIllIIlIIlllll[llllllllllllllIllllIllIIlIIllllI % llllllllllllllIllllIllIIlIIlllll.length]));
            "".length();
            ++llllllllllllllIllllIllIIlIIllllI;
            ++llllllllllllllIllllIllIIlIIlIllI;
            "".length();
            if (-(54 + 123 - 20 + 26 ^ 137 + 66 - 176 + 152) <= 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllllIllIIlIlIIIII);
    }

    private static boolean lIlIllIIlIIIlII(int n2) {
        return n2 != 0;
    }
}

