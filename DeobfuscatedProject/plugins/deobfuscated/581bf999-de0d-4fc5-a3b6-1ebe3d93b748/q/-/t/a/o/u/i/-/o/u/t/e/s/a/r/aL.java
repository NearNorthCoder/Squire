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
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.aI;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.z;

@TaskDesc(name="Attacking baba")
public class aL
extends aI {
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

    private static String lIIllIIIlIIlll(String llllllllllllllllIlIIlllIlIIIlIIl, String llllllllllllllllIlIIlllIlIIIlIII) {
        try {
            SecretKeySpec llllllllllllllllIlIIlllIlIIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIlIIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlllIlIIIllIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlllIlIIIllIl.init(lIlllIIIlIl[4], llllllllllllllllIlIIlllIlIIIlllI);
            return new String(llllllllllllllllIlIIlllIlIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlllIlIIIllII) {
            llllllllllllllllIlIIlllIlIIIllII.printStackTrace();
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
        aL llllllllllllllllIlIIlllIlIIlIllI;
        if (aL.lIIllIIIlIllIl(this.cW.redX() ? 1 : 0)) {
            return lIlllIIIlIl[0];
        }
        NPC llllllllllllllllIlIIlllIlIIlIlIl = llllllllllllllllIlIIlllIlIIlIllI.bB();
        if (aL.lIIllIIIlIllll(llllllllllllllllIlIIlllIlIIlIlIl)) {
            return lIlllIIIlIl[0];
        }
        if (aL.lIIllIIIllIIII(llllllllllllllllIlIIlllIlIIlIlIl.getId(), lIlllIIIlIl[1])) {
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

    private static String lIIllIIIlIIllI(String llllllllllllllllIlIIlllIIlllllII, String llllllllllllllllIlIIlllIIlllllIl) {
        try {
            SecretKeySpec llllllllllllllllIlIIlllIlIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlllIIlllllIl.getBytes(StandardCharsets.UTF_8)), lIlllIIIlIl[5]), "DES");
            Cipher llllllllllllllllIlIIlllIlIIIIIII = Cipher.getInstance("DES");
            llllllllllllllllIlIIlllIlIIIIIII.init(lIlllIIIlIl[4], llllllllllllllllIlIIlllIlIIIIIIl);
            return new String(llllllllllllllllIlIIlllIlIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlllIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlllIIlllllll) {
            llllllllllllllllIlIIlllIIlllllll.printStackTrace();
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

