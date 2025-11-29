/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
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
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.B;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.l;

@TaskDesc(name="Entering next path", priority=20, blocking=true)
public class U
extends Z {
    private final /* synthetic */ TOAConfig ce;
    private final /* synthetic */ B cd;
    private static /* synthetic */ String[] lIllIlIlllI;
    private static final /* synthetic */ int cc;
    private static /* synthetic */ int[] lIllIlIllll;

    private static boolean lIIlIlllIlllIl(Object object) {
        return object != null;
    }

    private static String lIIlIlllIlIllI(String llllllllllllllllIlIlIIIlIIllIIlI, String llllllllllllllllIlIlIIIlIIllIIIl) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIlIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIlIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIIIlIIllIlII = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIIIlIIllIlII.init(lIllIlIllll[4], llllllllllllllllIlIlIIIlIIllIlIl);
            return new String(llllllllllllllllIlIlIIIlIIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIIlIIllIIll) {
            llllllllllllllllIlIlIIIlIIllIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        TileObject llllllllllllllllIlIlIIIlIIllllll;
        U llllllllllllllllIlIlIIIlIlIIIIII;
        if (U.lIIlIlllIllIlI(this.j(lIllIlIllll[0]) ? 1 : 0)) {
            return lIllIlIllll[1];
        }
        TileObject tileObject = new l[lIllIlIllll[2]];
        tileObject[U.lIllIlIllll[1]] = llllllllllllllllIlIlIIIlIlIIIIII.ce.firstRoom();
        tileObject[U.lIllIlIllll[3]] = llllllllllllllllIlIlIIIlIlIIIIII.ce.secondRoom();
        tileObject[U.lIllIlIllll[4]] = llllllllllllllllIlIlIIIlIlIIIIII.ce.thirdRoom();
        tileObject[U.lIllIlIllll[5]] = llllllllllllllllIlIlIIIlIlIIIIII.ce.fourthRoom();
        TileObject llllllllllllllllIlIlIIIlIIlllllI = llllllllllllllllIlIlIIIlIIllllll = tileObject;
        int llllllllllllllllIlIlIIIlIIllllIl = ((l[])llllllllllllllllIlIlIIIlIIlllllI).length;
        int llllllllllllllllIlIlIIIlIIllllII = lIllIlIllll[1];
        while (U.lIIlIlllIllIll(llllllllllllllllIlIlIIIlIIllllII, llllllllllllllllIlIlIIIlIIllllIl)) {
            l llllllllllllllllIlIlIIIlIIlllIll = llllllllllllllllIlIlIIIlIIlllllI[llllllllllllllllIlIlIIIlIIllllII];
            int[] nArray = new int[lIllIlIllll[3]];
            nArray[U.lIllIlIllll[1]] = llllllllllllllllIlIlIIIlIIlllIll.F();
            TileObject llllllllllllllllIlIlIIIlIIlllIlI = TileObjects.getNearest((int[])nArray);
            if (U.lIIlIlllIlllII(llllllllllllllllIlIlIIIlIIlllIlI)) {
                llllllllllllllllIlIlIIIlIlIIIIII.cd.a(llllllllllllllllIlIlIIIlIIlllIll);
                "".length();
                if (null != null) {
                    return ((0x45 ^ 0x66 ^ (0xB4 ^ 0xC1)) & (0xBB ^ 0xA5 ^ (0x70 ^ 0x38) ^ -" ".length())) != 0;
                }
            } else {
                llllllllllllllllIlIlIIIlIIlllIlI.interact(lIllIlIlllI[lIllIlIllll[1]]);
                return lIllIlIllll[3];
            }
            ++llllllllllllllllIlIlIIIlIIllllII;
            "".length();
            if ("  ".length() > 0) continue;
            return ((0x5B ^ 0x12 ^ (0xF ^ 0x72)) & (0x9F ^ 0xC5 ^ (0xA ^ 0x64) ^ -" ".length())) != 0;
        }
        String[] stringArray = new String[lIllIlIllll[3]];
        stringArray[U.lIllIlIllll[1]] = lIllIlIlllI[lIllIlIllll[3]];
        llllllllllllllllIlIlIIIlIIlllllI = TileObjects.getNearest((String[])stringArray);
        if (U.lIIlIlllIlllIl(llllllllllllllllIlIlIIIlIIlllllI)) {
            llllllllllllllllIlIlIIIlIIlllllI.interact(lIllIlIlllI[lIllIlIllll[4]]);
            return lIllIlIllll[3];
        }
        return lIllIlIllll[1];
    }

    private static void lIIlIlllIllIII() {
        lIllIlIlllI = new String[lIllIlIllll[5]];
        U.lIllIlIlllI[U.lIllIlIllll[1]] = U.lIIlIlllIlIllI("ihPMuPJabsG/RMQjlTbKmA==", "BatbA");
        U.lIllIlIlllI[U.lIllIlIllll[3]] = U.lIIlIlllIlIlll("tmaZ+LO0NTM=", "IUMQK");
        U.lIllIlIlllI[U.lIllIlIllll[4]] = U.lIIlIlllIlIlll("ZVrC+vGh3WAKUtWW2rtQyA==", "mseIG");
    }

    private static boolean lIIlIlllIlllII(Object object) {
        return object == null;
    }

    static {
        U.lIIlIlllIllIIl();
        U.lIIlIlllIllIII();
        cc = lIllIlIllll[0];
    }

    private static void lIIlIlllIllIIl() {
        lIllIlIllll = new int[7];
        U.lIllIlIllll[0] = -(0xFFFFFB7A & 0x4CAF) & (0xFFFFFFFB & 0x7F7D);
        U.lIllIlIllll[1] = (0x40 ^ 0x6E ^ (0x2B ^ 0x12)) & (0x7C ^ 0x57 ^ (0x2B ^ 0x17) ^ -" ".length());
        U.lIllIlIllll[2] = 0x6A ^ 0x6E;
        U.lIllIlIllll[3] = " ".length();
        U.lIllIlIllll[4] = "  ".length();
        U.lIllIlIllll[5] = "   ".length();
        U.lIllIlIllll[6] = 0x89 ^ 0x81;
    }

    @Inject
    protected U(Client client, B b2, TOAConfig tOAConfig) {
        super(client);
        this.cd = b2;
        this.ce = tOAConfig;
    }

    private static String lIIlIlllIlIlll(String llllllllllllllllIlIlIIIlIIlIIlIl, String llllllllllllllllIlIlIIIlIIlIIlII) {
        try {
            SecretKeySpec llllllllllllllllIlIlIIIlIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIIIlIIlIIlII.getBytes(StandardCharsets.UTF_8)), lIllIlIllll[6]), "DES");
            Cipher llllllllllllllllIlIlIIIlIIlIIlll = Cipher.getInstance("DES");
            llllllllllllllllIlIlIIIlIIlIIlll.init(lIllIlIllll[4], llllllllllllllllIlIlIIIlIIlIlIII);
            return new String(llllllllllllllllIlIlIIIlIIlIIlll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIIIlIIlIIllI) {
            llllllllllllllllIlIlIIIlIIlIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllIllIlI(int n2) {
        return n2 == 0;
    }
}

