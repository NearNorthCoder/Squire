/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.NPC
 *  net.runelite.api.Player
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.magic.Thralls
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Player;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Thralls;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.a;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.b;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e;

@TaskDesc(name="Using thrall", priority=4999)
public class D
extends a {
    private static /* synthetic */ String[] lIlIlIIllllII;
    private static /* synthetic */ int[] lIlIlIIllllIl;

    private static void lIlllllIIlIIIII() {
        lIlIlIIllllII = new String[lIlIlIIllllIl[2]];
        D.lIlIlIIllllII[D.lIlIlIIllllIl[0]] = D."Vardorvis";
        D.lIlIlIIllllII[D.lIlIlIIllllIl[1]] = D."Attack";
    }

    @Inject
    protected D(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

    private static String lIlllllIIIlllll(String llllllllllllllIllIlIlllIIIIIlIlI, String llllllllllllllIllIlIlllIIIIIlIIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIlllIIIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlllIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), lIlIlIIllllIl[3]), "DES");
            Cipher llllllllllllllIllIlIlllIIIIIlllI = Cipher.getInstance("DES");
            llllllllllllllIllIlIlllIIIIIlllI.init(lIlIlIIllllIl[2], llllllllllllllIllIlIlllIIIIIllll);
            return new String(llllllllllllllIllIlIlllIIIIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlllIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlllIIIIIllIl) {
            llllllllllllllIllIlIlllIIIIIllIl.printStackTrace();
            return null;
        }
    }

    static {
        D.lIlllllIIlIIIIl();
        D.lIlllllIIlIIIII();
    }

    @Override
    public boolean l() {
        if (D.lIlllllIIlIIIlI(Thralls.canUse() ? 1 : 0)) {
            return lIlIlIIllllIl[0];
        }
        NPC llllllllllllllIllIlIlllIIIIlIlll = NPCs.getNearest(nPC -> {
            int n2;
            if (D.lIlllllIIlIIlII(nPC.getName().equalsIgnoreCase(lIlIlIIllllII[lIlIlIIllllIl[0]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIlIIllllIl[1]];
                stringArray[D.lIlIlIIllllIl[0]] = lIlIlIIllllII[lIlIlIIllllIl[1]];
                if (D.lIlllllIIlIIlII(nPC.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIlIIllllIl[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0xB9 ^ 0xAE) & ~(0xBF ^ 0xA8)) != 0;
                }
            }
            n2 = lIlIlIIllllIl[0];
            return n2 != 0;
        });
        if (D.lIlllllIIlIIIll(llllllllllllllIllIlIlllIIIIlIlll)) {
            return lIlIlIIllllIl[0];
        }
        Player llllllllllllllIllIlIlllIIIIlIllI = Players.getLocal();
        if (D.lIlllllIIlIIIll(llllllllllllllIllIlIlllIIIIlIllI)) {
            return lIlIlIIllllIl[0];
        }
        return Thralls.useBestThrall();
    }

    private static boolean lIlllllIIlIIIll(Object object) {
        return object == null;
    }

    private static void lIlllllIIlIIIIl() {
        lIlIlIIllllIl = new int[4];
        D.lIlIlIIllllIl[0] = (0x7D ^ 0x66) & ~(0x93 ^ 0x88);
        D.lIlIlIIllllIl[1] = 1;
        D.lIlIlIIllllIl[2] = 2;
        D.lIlIlIIllllIl[3] = 65 + 7 - 12 + 76 ^ 37 + 117 - 143 + 117;
    }

    private static boolean lIlllllIIlIIlII(int n2) {
        return n2 != 0;
    }

    private static boolean lIlllllIIlIIIlI(int n2) {
        return n2 == 0;
    }
}

