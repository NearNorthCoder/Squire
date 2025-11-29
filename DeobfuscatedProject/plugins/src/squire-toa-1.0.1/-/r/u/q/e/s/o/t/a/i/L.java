/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.unethicalite.api.entities.NPCs
 */
package -.r.u.q.e.s.o.t.a.i;

import -.r.u.q.e.s.o.t.a.i.n;
import -.r.u.q.e.s.o.t.a.i.z;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.SquireTOA;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.unethicalite.api.entities.NPCs;

@TaskDesc(name="Handling baba prayers", priority=0x7FFFFFFF)
public class L
extends z {
    private static /* synthetic */ int[] lIIllllllIIlI;
    private static /* synthetic */ String[] lIIllllllIIIl;

    private static void lIllIlIlIlIIlll() {
        lIIllllllIIIl = new String[lIIllllllIIlI[0]];
        L.lIIllllllIIIl[L.lIIllllllIIlI[1]] = L.lIllIlIlIlIIllI("bupcCIVRam0=", "uyluF");
    }

    @Override
    public n J() {
        return this.aT.prayFlickBaba();
    }

    static {
        L.lIllIlIlIlIlIII();
        L.lIllIlIlIlIIlll();
    }

    @Override
    public boolean C() {
        int[] nArray = new int[lIIllllllIIlI[4]];
        nArray[L.lIIllllllIIlI[1]] = lIIllllllIIlI[5];
        nArray[L.lIIllllllIIlI[0]] = lIIllllllIIlI[6];
        nArray[L.lIIllllllIIlI[7]] = lIIllllllIIlI[2];
        return this.aS.a(nArray);
    }

    @Inject
    public L(SquireTOA squireTOA, TOAConfig tOAConfig) {
        super(squireTOA, tOAConfig);
    }

    @Override
    public List<Prayer> E() {
        String[] stringArray = new String[lIIllllllIIlI[0]];
        stringArray[L.lIIllllllIIlI[1]] = lIIllllllIIIl[lIIllllllIIlI[1]];
        NPC nPC = NPCs.getNearest((String[])stringArray);
        if (L.lIllIlIlIlIlIIl(nPC) && L.lIllIlIlIlIlIlI(nPC.getId(), lIIllllllIIlI[2])) {
            return List.of(this.H());
        }
        return List.of(Prayer.PROTECT_FROM_MELEE, this.H());
    }

    @Override
    public boolean I() {
        return lIIllllllIIlI[0];
    }

    private static boolean lIllIlIlIlIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    @Override
    public int F() {
        return lIIllllllIIlI[3];
    }

    private static void lIllIlIlIlIlIII() {
        lIIllllllIIlI = new int[9];
        L.lIIllllllIIlI[0] = " ".length();
        L.lIIllllllIIlI[1] = ("  ".length() ^ (0 ^ 0x28)) & (0xF7 ^ 0xAF ^ (0x7B ^ 9) ^ -" ".length());
        L.lIIllllllIIlI[2] = 0xFFFFAF06 & 0x7EFD;
        L.lIIllllllIIlI[3] = -(0x99 ^ 0xBA) & (0xFFFFFB76 & 0x3FFF);
        L.lIIllllllIIlI[4] = "   ".length();
        L.lIIllllllIIlI[5] = -(0xFFFFAF56 & 0x51EB) & (0xFFFFEFC7 & 0x3F7B);
        L.lIIllllllIIlI[6] = 0xFFFFEF8B & 0x3E77;
        L.lIIllllllIIlI[7] = "  ".length();
        L.lIIllllllIIlI[8] = 5 ^ 0xD;
    }

    private static boolean lIllIlIlIlIlIIl(Object object) {
        return object != null;
    }

    private static String lIllIlIlIlIIllI(String llllllllllllllIlllIIlllllIlIIIIl, String llllllllllllllIlllIIlllllIlIIIlI) {
        try {
            SecretKeySpec llllllllllllllIlllIIlllllIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIlllllIlIIIlI.getBytes(StandardCharsets.UTF_8)), lIIllllllIIlI[8]), "DES");
            Cipher llllllllllllllIlllIIlllllIlIIlIl = Cipher.getInstance("DES");
            llllllllllllllIlllIIlllllIlIIlIl.init(lIIllllllIIlI[7], llllllllllllllIlllIIlllllIlIIllI);
            return new String(llllllllllllllIlllIIlllllIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIlllllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIIlllllIlIIlII) {
            llllllllllllllIlllIIlllllIlIIlII.printStackTrace();
            return null;
        }
    }
}

