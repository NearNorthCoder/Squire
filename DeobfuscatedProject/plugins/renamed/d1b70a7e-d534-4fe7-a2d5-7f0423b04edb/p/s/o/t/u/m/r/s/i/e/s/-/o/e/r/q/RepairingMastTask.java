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
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.a_Unknown;
import p.s.o.t.u.m.r.s.i.e.s.-.o.e.r.q.l_Unknown;

/* TASK: Repairing mast -> RepairingmastTask */
@TaskDesc(name="Repairing mast", priority=0x7FFFFFFF, blocking=true)
public class RepairingMastTask
extends l_Unknown {
    private static /* synthetic */ String[] lIIllIlllIlll;
    private static /* synthetic */ int[] lIIllIllllIIl;

    private static boolean lIllIIIlllIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIlllIIIIl(Object object) {
        return object == null;
    }

    private static String lIllIIIllIllIIl(String var16, String var11) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIIllIllllIIl[5]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIIllIllllIIl[4], var3);
            return new String(var1.doFinal(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean ak() {
        boolean bl;
        m var17;
        TileObject tileObject = this.ar.x();
        if (m.lIllIIIllIlllIl(this.ar.L() ? 1 : 0) && m.lIllIIIllIllllI(tileObject) && m.lIllIIIllIlllll(this.ar.t() ? 1 : 0) && !m.lIllIIIlllIIIII(tileObject.distanceTo((Locatable)Players.getLocal()), lIIllIllllIIl[0]) || m.lIllIIIllIlllll(var17.ar.K() ? 1 : 0)) {
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
        void var4;
        m var15;
        Player player = Players.getLocal();
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            String[] stringArray = new String[lIIllIllllIIl[1]];
            stringArray[m.lIIllIllllIIl[2]] = lIIllIlllIlll[lIIllIllllIIl[1]];
            if (m.lIllIIIllIlllll(tileObject.hasAction(stringArray) ? 1 : 0) && m.lIllIIIlllIIIlI(tileObject.distanceTo((Locatable)player), lIIllIllllIIl[3])) {
                n2 = lIIllIllllIIl[1];
                0;
                if (-3 >= 0) {
                    return false;
                }
            } else {
                n2 = lIIllIllllIIl[2];
            }
            return n2 != 0;
        });
        if (m.lIllIIIlllIIIIl(tileObject2)) {
            return lIIllIllllIIl[2];
        }
        if (m.lIllIIIllIlllll(var15.au.a((Locatable)var4) ? 1 : 0)) {
            return var15.au.b((SceneEntity)var4);
        }
        tileObject2.interact(lIIllIlllIlll[lIIllIllllIIl[2]]);
        return lIIllIllllIIl[1];
    }

    private static String lIllIIIllIllIlI(String var12, String var7) {
        var12 = new String(Base64.getDecoder().decode(var12.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var10 = new StringBuilder();
        char[] var14 = var7.toCharArray();
        int var9 = lIIllIllllIIl[2];
        char[] var6 = var12.toCharArray();
        int var8 = var6.length;
        int var13 = lIIllIllllIIl[2];
        while (m.lIllIIIlllIIIlI(var13, var8)) {
            char var2 = var6[var13];
            var10.append((char)(var2 ^ var14[var9 % var14.length]));
            0;
            ++var9;
            ++var13;
            0;
            if (-1 < ((0x69 ^ 0x28 ^ (0x69 ^ 0x22)) & (77 + 95 - 154 + 172 ^ 144 + 83 - 194 + 147 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var10);
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

