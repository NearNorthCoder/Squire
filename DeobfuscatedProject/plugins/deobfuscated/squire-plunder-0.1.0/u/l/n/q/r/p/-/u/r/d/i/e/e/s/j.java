/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package u.l.n.q.r.p.-.u.r.d.i.e.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.a;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.c;
import u.l.n.q.r.p.-.u.r.d.i.e.e.s.k;

@TaskDesc(name="Plundering Sarcophagus", priority=1)
public class j
extends k {
    private static /* synthetic */ String[] llllllIIllIl;
    private static /* synthetic */ int[] llllllIIlllI;

    private static void lIIlIlIIIlIIIII() {
        llllllIIlllI = new int[5];
        j.llllllIIlllI[0] = (0xE5 ^ 0xA8) & ~(0xC2 ^ 0x8F);
        j.llllllIIlllI[1] = 0xFFFFDFFF & 0x30F8;
        j.llllllIIlllI[2] = 1;
        j.llllllIIlllI[3] = 0xFFFFDFC7 & 0x733F;
        j.llllllIIlllI[4] = 2;
    }

    private static boolean lIIlIlIIIlIIIIl(Object object) {
        return object == null;
    }

    private static String lIIlIlIIIIlllIl(String lllllllllllllllIIlIIlllIIlIIlIll, String lllllllllllllllIIlIIlllIIlIIllll) {
        lllllllllllllllIIlIIlllIIlIIlIll = new String(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIIlIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIIlllIIlIIlllI = new StringBuilder();
        char[] lllllllllllllllIIlIIlllIIlIIllIl = lllllllllllllllIIlIIlllIIlIIllll.toCharArray();
        int lllllllllllllllIIlIIlllIIlIIllII = llllllIIlllI[0];
        char[] lllllllllllllllIIlIIlllIIlIIIllI = lllllllllllllllIIlIIlllIIlIIlIll.toCharArray();
        int lllllllllllllllIIlIIlllIIlIIIlIl = lllllllllllllllIIlIIlllIIlIIIllI.length;
        int lllllllllllllllIIlIIlllIIlIIIlII = llllllIIlllI[0];
        while (j.lIIlIlIIIlIIlIl(lllllllllllllllIIlIIlllIIlIIIlII, lllllllllllllllIIlIIlllIIlIIIlIl)) {
            char lllllllllllllllIIlIIlllIIlIlIIIl = lllllllllllllllIIlIIlllIIlIIIllI[lllllllllllllllIIlIIlllIIlIIIlII];
            lllllllllllllllIIlIIlllIIlIIlllI.append((char)(lllllllllllllllIIlIIlllIIlIlIIIl ^ lllllllllllllllIIlIIlllIIlIIllIl[lllllllllllllllIIlIIlllIIlIIllII % lllllllllllllllIIlIIlllIIlIIllIl.length]));
            0;
            ++lllllllllllllllIIlIIlllIIlIIllII;
            ++lllllllllllllllIIlIIlllIIlIIIlII;
            0;
            if (2 >= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIIlllIIlIIlllI);
    }

    private static boolean lIIlIlIIIlIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIlIIIlIIlII(Object object) {
        return object != null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean j() {
        void var2_2;
        block7: {
            block6: {
                void lllllllllllllllIIlIIlllIIllIlIIl;
                j lllllllllllllllIIlIIlllIIllIlIlI;
                c c2 = c.f();
                if (j.lIIlIlIIIlIIIIl((Object)c2)) {
                    return llllllIIlllI[0];
                }
                if (j.lIIlIlIIIlIIIlI(lllllllllllllllIIlIIlllIIllIlIlI.D.c((c)lllllllllllllllIIlIIlllIIllIlIIl) ? 1 : 0)) {
                    return llllllIIlllI[0];
                }
                if (j.lIIlIlIIIlIIIll(Players.getLocal().getAnimation(), llllllIIlllI[1])) {
                    return llllllIIlllI[0];
                }
                int[] nArray = new int[llllllIIlllI[2]];
                nArray[j.llllllIIlllI[0]] = llllllIIlllI[3];
                TileObject lllllllllllllllIIlIIlllIIllIlIII = TileObjects.getNearest((int[])nArray);
                if (!j.lIIlIlIIIlIIlII(lllllllllllllllIIlIIlllIIllIlIII)) break block6;
                String[] stringArray = new String[llllllIIlllI[2]];
                stringArray[j.llllllIIlllI[0]] = llllllIIllIl[llllllIIlllI[0]];
                if (!j.lIIlIlIIIlIIIlI(lllllllllllllllIIlIIlllIIllIlIII.hasAction(stringArray) ? 1 : 0)) break block7;
            }
            return llllllIIlllI[0];
        }
        var2_2.interact(llllllIIllIl[llllllIIlllI[2]]);
        return llllllIIlllI[2];
    }

    @Inject
    protected j(a a2, Client client) {
        super(a2, client);
    }

    private static String lIIlIlIIIIllllI(String lllllllllllllllIIlIIlllIIlIllllI, String lllllllllllllllIIlIIlllIIlIlllll) {
        try {
            SecretKeySpec lllllllllllllllIIlIIlllIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIIlllIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIIlllIIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIIlllIIllIIIlI.init(llllllIIlllI[4], lllllllllllllllIIlIIlllIIllIIIll);
            return new String(lllllllllllllllIIlIIlllIIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIIlllIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIIlllIIllIIIIl) {
            lllllllllllllllIIlIIlllIIllIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIIIlIIIlI(int n2) {
        return n2 == 0;
    }

    private static void lIIlIlIIIIlllll() {
        llllllIIllIl = new String[llllllIIlllI[4]];
        j.llllllIIllIl[j.llllllIIlllI[0]] = j."Open";
        j.llllllIIllIl[j.llllllIIlllI[2]] = j."Open";
    }

    private static boolean lIIlIlIIIlIIIll(int n2, int n3) {
        return n2 == n3;
    }

    static {
        j.lIIlIlIIIlIIIII();
        j.lIIlIlIIIIlllll();
    }
}

