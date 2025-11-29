/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 */
package r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.vardorvis.SquireVardorvis;
import gg.squire.vardorvis.SquireVardorvisConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.a;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.b;
import r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.e;

@TaskDesc(name="Eating food", priority=10000)
public class z
extends a {
    private static /* synthetic */ int[] lIlIlIIlllllI;
    private static /* synthetic */ String[] lIlIlIIllIIlI;

    private static void lIlllllIIlIIllI() {
        lIlIlIIlllllI = new int[6];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[0] = 1;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[1] = (0xAC ^ 0xBF) & ~(0x7C ^ 0x6F);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[2] = 3;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[3] = 2;
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[4] = 0x8A ^ 0xA9 ^ (0x69 ^ 0x4E);
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[5] = 0x6E ^ 0x27 ^ (0x22 ^ 0x63);
    }

    static {
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlllllIIlIIllI();
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlllllIIlIIlIl();
    }

    private static boolean lIlllllIIlIlIll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIlllllIIlIIlIl() {
        lIlIlIIllIIlI = new String[lIlIlIIlllllI[4]];
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIllIIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[1]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z."No food";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIllIIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[0]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z."Eat";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIllIIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[3]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z."Eat";
        r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIllIIlI[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[2]] = r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z."Eat";
    }

    @Inject
    protected z(SquireVardorvis squireVardorvis, SquireVardorvisConfig squireVardorvisConfig, e e2, b b2, Client client) {
        super(squireVardorvis, squireVardorvisConfig, e2, b2, client);
    }

    private static String lIlllllIIIIlllI(String llllllllllllllIllIlIllIllllIIllI, String llllllllllllllIllIlIllIllllIIlIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIllIllllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIllllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIllIllllIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIllIllllIlIlI.init(lIlIlIIlllllI[3], llllllllllllllIllIlIllIllllIlIll);
            return new String(llllllllllllllIllIlIllIllllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIllllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIllIllllIlIIl) {
            llllllllllllllIllIlIllIllllIlIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIIlIlIIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIlllllIIIIllII(String llllllllllllllIllIlIllIlllllIIll, String llllllllllllllIllIlIllIlllllIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIllIllllllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIllIlllllIIlI.getBytes(StandardCharsets.UTF_8)), lIlIlIIlllllI[5]), "DES");
            Cipher llllllllllllllIllIlIllIlllllIlll = Cipher.getInstance("DES");
            llllllllllllllIllIlIllIlllllIlll.init(lIlIlIIlllllI[3], llllllllllllllIllIlIllIllllllIII);
            return new String(llllllllllllllIllIlIllIlllllIlll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIllIlllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIllIlllllIllI) {
            llllllllllllllIllIlIllIlllllIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIIlIIlll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean l() {
        void var1_2;
        z llllllllllllllIllIlIllIllllllllI;
        int n2;
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlllllIIlIIlll(this.t.earlyBank() ? 1 : 0) && r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlllllIIlIlIII(n2 = Inventory.getCount(item -> {
            String[] stringArray = new String[lIlIlIIlllllI[0]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[1]] = lIlIlIIllIIlI[lIlIlIIlllllI[2]];
            return item.hasAction(stringArray);
        }), lIlIlIIlllllI[0])) {
            this.s.c(lIlIlIIlllllI[0]);
            return lIlIlIIlllllI[1];
        }
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlllllIIlIlIIl(Combat.getCurrentHealth(), llllllllllllllIllIlIllIllllllllI.t.eatAt())) {
            return lIlIlIIlllllI[1];
        }
        Item llllllllllllllIllIlIllIlllllllIl = Inventory.getFirst(item -> {
            String[] stringArray = new String[lIlIlIIlllllI[0]];
            stringArray[r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlIlIIlllllI[1]] = lIlIlIIllIIlI[lIlIlIIlllllI[3]];
            return item.hasAction(stringArray);
        });
        if (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlllllIIlIlIlI(llllllllllllllIllIlIllIlllllllIl)) {
            Log.error((String)lIlIlIIllIIlI[lIlIlIIlllllI[1]]);
            llllllllllllllIllIlIllIllllllllI.s.c(lIlIlIIlllllI[0]);
            return lIlIlIIlllllI[1];
        }
        var1_2.interact(lIlIlIIllIIlI[lIlIlIIlllllI[0]]);
        this.sleep(lIlIlIIlllllI[2]);
        return lIlIlIIlllllI[0];
    }

    private static boolean lIlllllIIlIlIII(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlllllIIIIllIl(String llllllllllllllIllIlIllIlllIllIII, String llllllllllllllIllIlIllIlllIlIIlI) {
        llllllllllllllIllIlIllIlllIllIII = new String(Base64.getDecoder().decode(llllllllllllllIllIlIllIlllIllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIllIlllIlIllI = new StringBuilder();
        char[] llllllllllllllIllIlIllIlllIlIlIl = llllllllllllllIllIlIllIlllIlIIlI.toCharArray();
        int llllllllllllllIllIlIllIlllIlIlII = lIlIlIIlllllI[1];
        char[] llllllllllllllIllIlIllIlllIIlllI = llllllllllllllIllIlIllIlllIllIII.toCharArray();
        int llllllllllllllIllIlIllIlllIIllIl = llllllllllllllIllIlIllIlllIIlllI.length;
        int llllllllllllllIllIlIllIlllIIllII = lIlIlIIlllllI[1];
        while (r.o.u.a.r.v.s.i.s.v.q.d.r.i.-.e.z.lIlllllIIlIlIll(llllllllllllllIllIlIllIlllIIllII, llllllllllllllIllIlIllIlllIIllIl)) {
            char llllllllllllllIllIlIllIlllIllIIl = llllllllllllllIllIlIllIlllIIlllI[llllllllllllllIllIlIllIlllIIllII];
            llllllllllllllIllIlIllIlllIlIllI.append((char)(llllllllllllllIllIlIllIlllIllIIl ^ llllllllllllllIllIlIllIlllIlIlIl[llllllllllllllIllIlIllIlllIlIlII % llllllllllllllIllIlIllIlllIlIlIl.length]));
            0;
            ++llllllllllllllIllIlIllIlllIlIlII;
            ++llllllllllllllIllIlIllIlllIIllII;
            0;
            if (((0xA6 ^ 0xB8 ^ (0x14 ^ 0x3D)) & (47 + 58 - 89 + 171 ^ 109 + 127 - 191 + 95 ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIllIlllIlIllI);
    }

    private static boolean lIlllllIIlIlIlI(Object object) {
        return object == null;
    }
}

