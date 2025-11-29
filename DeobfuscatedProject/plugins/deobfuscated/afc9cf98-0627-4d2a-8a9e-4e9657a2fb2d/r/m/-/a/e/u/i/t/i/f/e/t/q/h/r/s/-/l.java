/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 */
package r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.i;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.r;

@TaskDesc(name="Clearing blighted plants")
public class l
extends r {
    private static /* synthetic */ int[] lIIlllllllIlI;
    private static /* synthetic */ String[] lIIlllllllIII;

    public boolean run() {
        TileObject tileObject2 = this.Z.a(tileObject -> {
            String[] stringArray = new String[lIIlllllllIlI[1]];
            stringArray[l.lIIlllllllIlI[0]] = lIIlllllllIII[lIIlllllllIlI[1]];
            return tileObject.hasAction(stringArray);
        });
        if (l.lIllIllIIlIIIIl(tileObject2)) {
            return lIIlllllllIlI[0];
        }
        tileObject2.interact(lIIlllllllIII[lIIlllllllIlI[0]]);
        return lIIlllllllIlI[1];
    }

    private static String lIllIllIIIllIlI(String llllllllllllllIlllIIlIllIlIlIllI, String llllllllllllllIlllIIlIllIlIlIlIl) {
        try {
            SecretKeySpec llllllllllllllIlllIIlIllIlIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlIllIlIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIIlIllIlIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIIlIllIlIllIlI.init(lIIlllllllIlI[2], llllllllllllllIlllIIlIllIlIllIll);
            return new String(llllllllllllllIlllIIlIllIlIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlIllIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlIllIlIllIIl) {
            llllllllllllllIlllIIlIllIlIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIllIIlIIIIl(Object object) {
        return object == null;
    }

    static {
        l.lIllIllIIIllllI();
        l.lIllIllIIIllIll();
    }

    private static void lIllIllIIIllIll() {
        lIIlllllllIII = new String[lIIlllllllIlI[2]];
        l.lIIlllllllIII[l.lIIlllllllIlI[0]] = l."Clear";
        l.lIIlllllllIII[l.lIIlllllllIlI[1]] = l."Clear";
    }

    private static void lIllIllIIIllllI() {
        lIIlllllllIlI = new int[3];
        l.lIIlllllllIlI[0] = (0xB2 ^ 0x94 ^ (0x9E ^ 0x88)) & (86 + 191 - 243 + 207 ^ 162 + 79 - 110 + 62 ^ -1);
        l.lIIlllllllIlI[1] = 1;
        l.lIIlllllllIlI[2] = 2;
    }

    @Inject
    protected l(i i2) {
        super(i2);
    }
}

