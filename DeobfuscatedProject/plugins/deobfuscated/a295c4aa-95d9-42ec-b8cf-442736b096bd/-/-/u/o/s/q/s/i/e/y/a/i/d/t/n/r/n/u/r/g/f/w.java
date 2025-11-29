/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f;

import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.a;
import -.-.u.o.s.q.s.i.e.y.a.i.d.t.n.r.n.u.r.g.f.j;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.giantsfoundry.SquireGiantsConfig;
import gg.squire.giantsfoundry.SquireGiantsFoundry;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Picking up sword", priority=300, blocking=true)
public class w
extends j {
    private static /* synthetic */ String[] llIlIllIlIlI;
    private static /* synthetic */ int[] llIlIlllIllI;

    private static void lIIIIlIIIIIIIII() {
        llIlIllIlIlI = new String[llIlIlllIllI[2]];
        w.llIlIllIlIlI[w.llIlIlllIllI[0]] = w."Pick-up";
        w.llIlIllIlIlI[w.llIlIlllIllI[1]] = w."Pick-up";
    }

    private static boolean lIIIIlIIIIIIIlI(Object object) {
        return object == null;
    }

    private static String lIIIIIllllIIIII(String lllllllllllllllIlIIIIIlIIllIIlII, String lllllllllllllllIlIIIIIlIIllIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIIIIlIIllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIIIIlIIllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIIIIlIIllIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIIIIlIIllIlIII.init(llIlIlllIllI[2], lllllllllllllllIlIIIIIlIIllIlIIl);
            return new String(lllllllllllllllIlIIIIIlIIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIIIIlIIllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIIIIlIIllIIlll) {
            lllllllllllllllIlIIIIIlIIllIIlll.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean M() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[llIlIlllIllI[1]];
            stringArray[w.llIlIlllIllI[0]] = llIlIllIlIlI[llIlIlllIllI[1]];
            return tileObject.hasAction(stringArray);
        });
        if (w.lIIIIlIIIIIIIlI(tileObject2)) {
            return llIlIlllIllI[0];
        }
        tileObject2.interact(llIlIllIlIlI[llIlIlllIllI[0]]);
        return llIlIlllIllI[1];
    }

    static {
        w.lIIIIlIIIIIIIIl();
        w.lIIIIlIIIIIIIII();
    }

    @Inject
    public w(a a2, SquireGiantsFoundry squireGiantsFoundry, SquireGiantsConfig squireGiantsConfig) {
        super(a2, squireGiantsFoundry, squireGiantsConfig);
    }

    private static void lIIIIlIIIIIIIIl() {
        llIlIlllIllI = new int[3];
        w.llIlIlllIllI[0] = (0x39 ^ 3) & ~(0x6E ^ 0x54);
        w.llIlIlllIllI[1] = 1;
        w.llIlIlllIllI[2] = 2;
    }
}

