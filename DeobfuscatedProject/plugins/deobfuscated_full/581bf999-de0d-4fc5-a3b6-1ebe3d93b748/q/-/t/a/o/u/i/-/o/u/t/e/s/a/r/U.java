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

/* TASK: Entering next path -> EnteringnextpathTask */
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

    private static String lIIlIlllIlIllI(String var3, String var14) {
        try {
            SecretKeySpec var8 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var14.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var11 = Cipher.getInstance("Blowfish");
            var11.init(lIllIlIllll[4], var8);
            return new String(var11.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllIllIll(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        TileObject var4;
        U var2;
        if (U.lIIlIlllIllIlI(this.j(lIllIlIllll[0]) ? 1 : 0)) {
            return lIllIlIllll[1];
        }
        TileObject tileObject = new l[lIllIlIllll[2]];
        tileObject[U.lIllIlIllll[1]] = var2.ce.firstRoom();
        tileObject[U.lIllIlIllll[3]] = var2.ce.secondRoom();
        tileObject[U.lIllIlIllll[4]] = var2.ce.thirdRoom();
        tileObject[U.lIllIlIllll[5]] = var2.ce.fourthRoom();
        TileObject var5 = var4 = tileObject;
        int var6 = ((l[])var5).length;
        int var13 = lIllIlIllll[1];
        while (U.lIIlIlllIllIll(var13, var6)) {
            l var15 = var5[var13];
            int[] nArray = new int[lIllIlIllll[3]];
            nArray[U.lIllIlIllll[1]] = var15.F();
            TileObject var10 = TileObjects.getNearest((int[])nArray);
            if (U.lIIlIlllIlllII(var10)) {
                var2.cd.a(var15);
                0;
                
                }
            } else {
                var10.interact(lIllIlIlllI[lIllIlIllll[1]]);
                return lIllIlIllll[3];
            }
            ++var13;
            0;
            if (2 > 0) continue;
            return ((0x5B ^ 0x12 ^ (0xF ^ 0x72)) & (0x9F ^ 0xC5 ^ (0xA ^ 0x64) ^ -1)) != 0;
        }
        String[] stringArray = new String[lIllIlIllll[3]];
        stringArray[U.lIllIlIllll[1]] = lIllIlIlllI[lIllIlIllll[3]];
        var5 = TileObjects.getNearest((String[])stringArray);
        if (U.lIIlIlllIlllIl(var5)) {
            var5.interact(lIllIlIlllI[lIllIlIllll[4]]);
            return lIllIlIllll[3];
        }
        return lIllIlIllll[1];
    }

    private static void lIIlIlllIllIII() {
        lIllIlIlllI = new String[lIllIlIllll[5]];
        U.lIllIlIlllI[U.lIllIlIllll[1]] = U."Quick-Enter";
        U.lIllIlIlllI[U.lIllIlIllll[3]] = U."Entry";
        U.lIllIlIlllI[U.lIllIlIllll[4]] = U."Quick-Enter";
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
        U.lIllIlIllll[1] = (0x40 ^ 0x6E ^ (0x2B ^ 0x12)) & (0x7C ^ 0x57 ^ (0x2B ^ 0x17) ^ -1);
        U.lIllIlIllll[2] = 0x6A ^ 0x6E;
        U.lIllIlIllll[3] = 1;
        U.lIllIlIllll[4] = 2;
        U.lIllIlIllll[5] = 3;
        U.lIllIlIllll[6] = 0x89 ^ 0x81;
    }

    @Inject
    protected U(Client client, B b2, TOAConfig tOAConfig) {
        super(client);
        this.cd = b2;
        this.ce = tOAConfig;
    }

    private static String lIIlIlllIlIlll(String var1, String var17) {
        try {
            SecretKeySpec var16 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var17.getBytes(StandardCharsets.UTF_8)), lIllIlIllll[6]), "DES");
            Cipher var12 = Cipher.getInstance("DES");
            var12.init(lIllIlIllll[4], var16);
            return new String(var12.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlllIllIlI(int n2) {
        return n2 == 0;
    }
}

