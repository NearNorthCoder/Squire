/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.unethicalite.api.items.Inventory
 */
package e.t.r.i.s.h.q.n.r.u.-.u.e;

import e.t.r.i.s.h.q.n.r.u.-.u.e.a;
import e.t.r.i.s.h.q.n.r.u.-.u.e.x;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.hunter.SquireHunterConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Dropping items", priority=100)
public class u
extends x {
    private static /* synthetic */ String[] lllIllllllII;
    private static /* synthetic */ int[] lllIllllllIl;

    private static boolean lIIIlllIIlIIlll(int n2) {
        return n2 != 0;
    }

    private static void lIIIlllIIlIIlIl() {
        lllIllllllII = new String[lllIllllllIl[3]];
        u.lllIllllllII[u.lllIllllllIl[0]] = u."Bury";
        u.lllIllllllII[u.lllIllllllIl[1]] = u."bones";
        u.lllIllllllII[u.lllIllllllIl[2]] = u."bones";
    }

    private static String lIIIlllIIlIIIll(String lllllllllllllllIIlIllIllIIIIIIIl, String lllllllllllllllIIlIllIllIIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIllIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIllIIIIIIII.getBytes(StandardCharsets.UTF_8)), lllIllllllIl[4]), "DES");
            Cipher lllllllllllllllIIlIllIllIIIIIlIl = Cipher.getInstance("DES");
            lllllllllllllllIIlIllIllIIIIIlIl.init(lllIllllllIl[2], lllllllllllllllIIlIllIllIIIIIllI);
            return new String(lllllllllllllllIIlIllIllIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIllIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIllIIIIIlII) {
            lllllllllllllllIIlIllIllIIIIIlII.printStackTrace();
            return null;
        }
    }

    @Override
    protected boolean x() {
        if (u.lIIIlllIIlIIlll(this.z().buryBones() ? 1 : 0)) {
            Inventory.interact(item -> item.getName().toLowerCase().contains(lllIllllllII[lllIllllllIl[2]]), (String)lllIllllllII[lllIllllllIl[0]]);
            0;
            0;
            if (3 == 1) {
                return ((63 + 56 - 96 + 123 ^ 83 + 104 - 7 + 11) & (140 + 4 - -19 + 3 ^ 73 + 98 - 155 + 123 ^ -1)) != 0;
            }
        } else {
            Inventory.dropAll(item -> item.getName().toLowerCase().contains(lllIllllllII[lllIllllllIl[1]]));
            0;
        }
        Inventory.dropAll(item -> item.getName().toLowerCase().contains(this.H().v().toLowerCase()));
        0;
        return lllIllllllIl[0];
    }

    @Inject
    public u(a a2, SquireHunterConfig squireHunterConfig) {
        super(a2, squireHunterConfig);
    }

    static {
        u.lIIIlllIIlIIllI();
        u.lIIIlllIIlIIlIl();
    }

    private static String lIIIlllIIlIIlII(String lllllllllllllllIIlIllIlIllllIlII, String lllllllllllllllIIlIllIlIllllIlIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlIlllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlIllllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIllIlIlllllIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIllIlIlllllIII.init(lllIllllllIl[2], lllllllllllllllIIlIllIlIlllllIIl);
            return new String(lllllllllllllllIIlIllIlIlllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIllIlIllllIlll) {
            lllllllllllllllIIlIllIlIllllIlll.printStackTrace();
            return null;
        }
    }

    private static void lIIIlllIIlIIllI() {
        lllIllllllIl = new int[5];
        u.lllIllllllIl[0] = (0x6D ^ 0x3A ^ (4 ^ 0x54)) & (106 + 103 - 139 + 92 ^ 16 + 99 - 80 + 130 ^ -1);
        u.lllIllllllIl[1] = 1;
        u.lllIllllllIl[2] = 2;
        u.lllIllllllIl[3] = 3;
        u.lllIllllllIl[4] = 3 + 18 - -107 + 60 ^ 117 + 16 - 84 + 131;
    }
}

