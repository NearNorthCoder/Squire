/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.SceneEntity
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 */
package p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tempoross.SquireTempoross;
import gg.squire.tempoross.SquireTemporossConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l;

@TaskDesc(name="Repairing mast", priority=0x7FFFFFFF, blocking=true)
public class m
extends l {
    private static /* synthetic */ String[] lIIllIlllIlll;
    private static /* synthetic */ int[] lIIllIllllIIl;

    private static boolean lIllIIIlllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlllIIIIl(Object object) {
        return object == null;
    }

    private static String lIllIIIllIllIIl(String llllllllllllllIlllIllIllIllIIIIl, String llllllllllllllIlllIllIllIllIIIII) {
        try {
            SecretKeySpec llllllllllllllIlllIllIllIllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllIllIllIIIII.getBytes(StandardCharsets.UTF_8)), lIIllIllllIIl[5]), "DES");
            Cipher llllllllllllllIlllIllIllIllIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIllIllIllIIlIl.init(lIIllIllllIIl[4], llllllllllllllIlllIllIllIllIIllI);
            return new String(llllllllllllllIlllIllIllIllIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllIllIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllIllIllIIlII) {
            llllllllllllllIlllIllIllIllIIlII.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ak() {
        boolean bl;
        m llllllllllllllIlllIllIlllIIIlllI;
        TileObject tileObject = this.ar.x();
        if (m.lIllIIIllIlllIl(this.ar.L() ? 1 : 0) && m.lIllIIIllIllllI(tileObject) && m.lIllIIIllIlllll(this.ar.t() ? 1 : 0) && !m.lIllIIIlllIIIII(tileObject.distanceTo((Locatable)Players.getLocal()), lIIllIllllIIl[0]) || m.lIllIIIllIlllll(llllllllllllllIlllIllIlllIIIlllI.ar.K() ? 1 : 0)) {
            bl = lIIllIllllIIl[1];
            0;
            if (-1 > (0x4E ^ 0x2F ^ (0x66 ^ 3))) {
                return ((0xAF ^ 0xBC ^ (0x36 ^ 0x1E)) & (34 + 80 - -20 + 22 ^ 63 + 68 - 60 + 96 ^ -1)) != 0;
            }
        } else {
            bl = lIIllIllllIIl[2];
        }
        return bl;
    }

    private static boolean lIllIIIllIlllll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean al() {
        void llllllllllllllIlllIllIlllIIIIlll;
        m llllllllllllllIlllIllIlllIIIlIIl;
        Player player = Players.getLocal();
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[lIIllIllllIIl[1]];
            stringArray[m.lIIllIllllIIl[2]] = lIIllIlllIlll[lIIllIllllIIl[1]];
            if (m.lIllIIIllIlllll(tileObject.hasAction(stringArray) ? 1 : 0) && m.lIllIIIlllIIIlI(tileObject.distanceTo((Locatable)player), lIIllIllllIIl[3])) {
                n2 = lIIllIllllIIl[1];
                0;
                if (-3 >= 0) {
                    return ((0xA3 ^ 0x88) & ~(0x58 ^ 0x73)) != 0;
                }
            } else {
                n2 = lIIllIllllIIl[2];
            }
            return n2 != 0;
        });
        if (m.lIllIIIlllIIIIl(tileObject2)) {
            return lIIllIllllIIl[2];
        }
        if (m.lIllIIIllIlllll(llllllllllllllIlllIllIlllIIIlIIl.au.a((Locatable)llllllllllllllIlllIllIlllIIIIlll) ? 1 : 0)) {
            return llllllllllllllIlllIllIlllIIIlIIl.au.b((SceneEntity)llllllllllllllIlllIllIlllIIIIlll);
        }
        tileObject2.interact(lIIllIlllIlll[lIIllIllllIIl[2]]);
        return lIIllIllllIIl[1];
    }

    private static String lIllIIIllIllIlI(String llllllllllllllIlllIllIllIllllIII, String llllllllllllllIlllIllIllIlllIIlI) {
        llllllllllllllIlllIllIllIllllIII = new String(Base64.getDecoder().decode(llllllllllllllIlllIllIllIllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIllIllIlllIllI = new StringBuilder();
        char[] llllllllllllllIlllIllIllIlllIlIl = llllllllllllllIlllIllIllIlllIIlI.toCharArray();
        int llllllllllllllIlllIllIllIlllIlII = lIIllIllllIIl[2];
        char[] llllllllllllllIlllIllIllIllIlllI = llllllllllllllIlllIllIllIllllIII.toCharArray();
        int llllllllllllllIlllIllIllIllIllIl = llllllllllllllIlllIllIllIllIlllI.length;
        int llllllllllllllIlllIllIllIllIllII = lIIllIllllIIl[2];
        while (m.lIllIIIlllIIIlI(llllllllllllllIlllIllIllIllIllII, llllllllllllllIlllIllIllIllIllIl)) {
            char llllllllllllllIlllIllIllIllllIIl = llllllllllllllIlllIllIllIllIlllI[llllllllllllllIlllIllIllIllIllII];
            llllllllllllllIlllIllIllIlllIllI.append((char)(llllllllllllllIlllIllIllIllllIIl ^ llllllllllllllIlllIllIllIlllIlIl[llllllllllllllIlllIllIllIlllIlII % llllllllllllllIlllIllIllIlllIlIl.length]));
            0;
            ++llllllllllllllIlllIllIllIlllIlII;
            ++llllllllllllllIlllIllIllIllIllII;
            0;
            if (-1 < ((0x69 ^ 0x28 ^ (0x69 ^ 0x22)) & (77 + 95 - 154 + 172 ^ 144 + 83 - 194 + 147 ^ -1))) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllIllIllIlllIllI);
    }

    private static boolean lIllIIIllIlllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIIIlllIIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    protected m(a a2, SquireTemporossConfig squireTemporossConfig, Client client, SquireTempoross squireTempoross) {
        super(a2, squireTemporossConfig, client, squireTempoross);
    }

    private static boolean lIllIIIllIllllI(Object object) {
        return object != null;
    }

    private static void lIllIIIllIllIll() {
        lIIllIlllIlll = new String[lIIllIllllIIl[4]];
        m.lIIllIlllIlll[m.lIIllIllllIIl[2]] = m."Repair";
        m.lIIllIlllIlll[m.lIIllIllllIIl[1]] = m."Repair";
    }

    private static void lIllIIIllIlllII() {
        lIIllIllllIIl = new int[6];
        m.lIIllIllllIIl[0] = 0x51 ^ 0x54;
        m.lIIllIllllIIl[1] = 1;
        m.lIIllIllllIIl[2] = (0xF ^ 0x74 ^ (0x46 ^ 0x73)) & (0x85 ^ 0xB4 ^ 121 + 85 - 180 + 101 ^ -1);
        m.lIIllIllllIIl[3] = 0x44 ^ 0x43 ^ (0x24 ^ 0x2C);
        m.lIIllIllllIIl[4] = 2;
        m.lIIllIllllIIl[5] = 0xB9 ^ 0xB1;
    }

    static {
        m.lIllIIIllIlllII();
        m.lIllIIIllIllIll();
    }
}

