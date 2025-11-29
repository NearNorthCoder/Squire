/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 */
package a.b.r.s.s.i.c.l.r.q.u.t.o.-.-.e.r.e.o.p.a.e;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;

@TaskDesc(name="Entering house portal", priority=100, blocking=true)
public class k
extends Task {
    private static /* synthetic */ String[] lIllIIIIlIII;
    private static /* synthetic */ int[] lIllIIIIlIIl;

    public boolean run() {
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (k.lllIIIlllIlllI(lIllIIIIlIII[lIllIIIIlIIl[1]].equals(tileObject.getName()) ? 1 : 0)) {
                String[] stringArray = new String[lIllIIIIlIIl[1]];
                stringArray[k.lIllIIIIlIIl[0]] = lIllIIIIlIII[lIllIIIIlIIl[2]];
                if (k.lllIIIlllIlllI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIllIIIIlIIl[1];
                    "".length();
                    if (-"   ".length() <= 0) return n2 != 0;
                    return ((0xA1 ^ 0x9F) & ~(0x1C ^ 0x22)) != 0;
                }
            }
            n2 = lIllIIIIlIIl[0];
            return n2 != 0;
        });
        if (k.lllIIIlllIllIl(tileObject2)) {
            return lIllIIIIlIIl[0];
        }
        tileObject2.interact(lIllIIIIlIII[lIllIIIIlIIl[0]]);
        return lIllIIIIlIIl[1];
    }

    private static void lllIIIlllIlIll() {
        lIllIIIIlIII = new String[lIllIIIIlIIl[3]];
        k.lIllIIIIlIII[k.lIllIIIIlIIl[0]] = k.lllIIIlllIlIlI("wIu4cihPyQg=", "xGacG");
        k.lIllIIIIlIII[k.lIllIIIIlIIl[1]] = k.lllIIIlllIlIlI("y8hj7jhYmu8=", "epzPJ");
        k.lIllIIIIlIII[k.lIllIIIIlIIl[2]] = k.lllIIIlllIlIlI("Y/GAs5sSJ14=", "UCxcZ");
    }

    private static boolean lllIIIlllIllIl(Object object) {
        return object == null;
    }

    static {
        k.lllIIIlllIllII();
        k.lllIIIlllIlIll();
    }

    private static void lllIIIlllIllII() {
        lIllIIIIlIIl = new int[4];
        k.lIllIIIIlIIl[0] = (0xCA ^ 0x89 ^ (0x61 ^ 0x3E)) & (0x8D ^ 0x9A ^ (0x5B ^ 0x50) ^ -" ".length());
        k.lIllIIIIlIIl[1] = " ".length();
        k.lIllIIIIlIIl[2] = "  ".length();
        k.lIllIIIIlIIl[3] = "   ".length();
    }

    private static String lllIIIlllIlIlI(String lllllllllllllllIllIIIlIlIIIIIIIl, String lllllllllllllllIllIIIlIlIIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIllIIIlIlIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIIIlIlIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIIIlIlIIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIIIlIlIIIIIlIl.init(lIllIIIIlIIl[2], lllllllllllllllIllIIIlIlIIIIIllI);
            return new String(lllllllllllllllIllIIIlIlIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIIIlIlIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIIIlIlIIIIIlII) {
            lllllllllllllllIllIIIlIlIIIIIlII.printStackTrace();
            return null;
        }
    }

    private static boolean lllIIIlllIlllI(int n2) {
        return n2 != 0;
    }
}

