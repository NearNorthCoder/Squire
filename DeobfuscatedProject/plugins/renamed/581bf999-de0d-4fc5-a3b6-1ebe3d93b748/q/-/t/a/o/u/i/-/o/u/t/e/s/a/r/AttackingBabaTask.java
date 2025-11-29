/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aI_Unknown;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z_Unknown;

/* TASK: Attacking baba -> AttackingbabaTask */
@TaskDesc(name="Attacking baba")
public class AttackingBabaTask
extends aI_Unknown {
    private static /* synthetic */ String[] lIlllIIIIll;
    private static /* synthetic */ int[] lIlllIIIlIl;

    private static boolean lIIllIIIlIllIl(int n2) {
        return n2 != 0;
    }

    private static void lIIllIIIlIllII() {
        lIlllIIIlIl = new int[6];
        aL.lIlllIIIlIl[0] = (0x62 ^ 0x40 ^ (0x3A ^ 6)) & (2 ^ 0x67 ^ (0xEE ^ 0x95) ^ -1);
        aL.lIlllIIIlIl[1] = 0xFFFFEF8F & 0x3E74;
        aL.lIlllIIIlIl[2] = 1;
        aL.lIlllIIIlIl[3] = 0x43 ^ 0x47;
        aL.lIlllIIIlIl[4] = 2;
        aL.lIlllIIIlIl[5] = 0xB8 ^ 0xB0;
    }

    private static String lIIllIIIlIIlll(String var7, String var9) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIlllIIIlIl[4], var11);
            return new String(var1.doFinal(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    static {
        aL.lIIllIIIlIllII();
        aL.lIIllIIIlIlIII();
    }

    private static boolean lIIllIIIlIllll(Object object) {
        return object == null;
    }

    private static void lIIllIIIlIlIII() {
        lIlllIIIIll = new String[lIlllIIIlIl[4]];
        aL.lIlllIIIIll[aL.lIlllIIIlIl[0]] = aL."Attack";
        aL.lIlllIIIIll[aL.lIlllIIIlIl[2]] = aL."Boulder";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bC() {
        void var1_1;
        aL var2;
        if (aL.lIIllIIIlIllIl(this.cW.redX() ? 1 : 0)) {
            return lIlllIIIlIl[0];
        }
        NPC var10 = var2.bB();
        if (aL.lIIllIIIlIllll(var10)) {
            return lIlllIIIlIl[0];
        }
        if (aL.lIIllIIIllIIII(var10.getId(), lIlllIIIlIl[1])) {
            return lIlllIIIlIl[0];
        }
        if (aL.lIIllIIIllIIIl(NPCs.getNearest(nPC -> {
            int n2;
            if (aL.lIIllIIIlIllIl(nPC.getName().equals(lIlllIIIIll[lIlllIIIlIl[2]]) ? 1 : 0) && aL.lIIllIIIllIIlI(nPC.distanceTo((Locatable)Players.getLocal()), lIlllIIIlIl[3])) {
                n2 = lIlllIIIlIl[2];
                0;
                if (-(0x61 ^ 9 ^ (0x5D ^ 0x30)) >= 0) {
                    return ((40 + 111 - -6 + 72 ^ 22 + 68 - -54 + 17) & (0xFE ^ 0x86 ^ (0xB9 ^ 0x85) ^ -1)) != 0;
                }
            } else {
                n2 = lIlllIIIlIl[0];
            }
            return n2 != 0;
        }))) {
            return lIlllIIIlIl[0];
        }
        this.a((NPC)var1_1, lIlllIIIlIl[2]);
        0;
        var1_1.interact(lIlllIIIIll[lIlllIIIlIl[0]]);
        return lIlllIIIlIl[2];
    }

    private static String lIIllIIIlIIllI(String var4, String var6) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), lIlllIIIlIl[5]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIlllIIIlIl[4], var3);
            return new String(var5.doFinal(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean lIIllIIIllIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllIIIllIIIl(Object object) {
        return object != null;
    }

    @Inject
    protected aL(Client client, z z2, TOAConfig tOAConfig) {
        super(client, z2, tOAConfig);
    }

    private static boolean lIIllIIIllIIlI(int n2, int n3) {
        return n2 < n3;
    }
}

