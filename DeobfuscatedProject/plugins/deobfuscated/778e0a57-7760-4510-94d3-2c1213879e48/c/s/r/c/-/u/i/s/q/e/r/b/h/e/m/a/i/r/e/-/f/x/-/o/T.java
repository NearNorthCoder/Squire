/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Locatable
 *  net.runelite.api.Prayer
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Locatable;
import net.runelite.api.Prayer;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;

@TaskDesc(name="Setting up Auto Rooms", priority=50000, blocking=true)
public class T
extends U {
    private static /* synthetic */ int[] lIlIIlllIIll;
    private static /* synthetic */ String[] lIlIIlllIIlI;

    private static boolean llIllIllIIlIII(Object object, Object object2) {
        return object != object2;
    }

    private static void llIllIllIIIIIl() {
        lIlIIlllIIlI = new String[lIlIIlllIIll[1]];
        T.lIlIIlllIIlI[T.lIlIIlllIIll[0]] = T."----------------";
    }

    private static void llIllIllIIIIlI() {
        lIlIIlllIIll = new int[3];
        T.lIlIIlllIIll[0] = (139 + 42 - 139 + 148 ^ 161 + 58 - 84 + 40) & (0xAA ^ 0x8D ^ (0x61 ^ 0x57) ^ -1);
        T.lIlIIlllIIll[1] = 1;
        T.lIlIIlllIIll[2] = 2;
    }

    private static boolean llIllIllIIIllI(int n2) {
        return n2 != 0;
    }

    private static boolean llIllIllIIIlll(Object object) {
        return object == null;
    }

    private static boolean llIllIllIIIlII(int n2, int n3) {
        return n2 < n3;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        T lllllllllllllllIllIlIlllIlIIIlll;
        if (T.llIllIllIIIIll(this.bS.getPlane())) {
            return lIlIIlllIIll[0];
        }
        n lllllllllllllllIllIlIlllIlIIIllI = null;
        int lllllllllllllllIllIlIlllIlIIIlIl = lIlIIlllIIll[0];
        int lllllllllllllllIllIlIlllIlIIIlII = lIlIIlllIIll[0];
        while (T.llIllIllIIIlII(lllllllllllllllIllIlIlllIlIIIlII, lllllllllllllllIllIlIlllIlIIIlll.co.D().size())) {
            n lllllllllllllllIllIlIlllIlIIIIll = lllllllllllllllIllIlIlllIlIIIlll.co.D().get(lllllllllllllllIllIlIlllIlIIIlII);
            if (T.llIllIllIIIlIl(lllllllllllllllIllIlIlllIlIIIIll) && T.llIllIllIIIllI(lllllllllllllllIllIlIlllIlIIIIll.a((Locatable)lllllllllllllllIllIlIlllIlIIIlll.bS) ? 1 : 0)) {
                lllllllllllllllIllIlIlllIlIIIlIl = lllllllllllllllIllIlIlllIlIIIlII;
                System.out.println(lIlIIlllIIlI[lIlIIlllIIll[0]]);
                lllllllllllllllIllIlIlllIlIIIllI = lllllllllllllllIllIlIlllIlIIIlll.co.D().get(lllllllllllllllIllIlIlllIlIIIlII);
                System.out.println("Found room: " + String.valueOf((Object)lllllllllllllllIllIlIlllIlIIIllI.bw));
                0;
                if ((0xA4 ^ 0xA0) == (0x90 ^ 0x94)) break;
                return ((0x35 ^ 0x78) & ~(0x4E ^ 3)) != 0;
            }
            ++lllllllllllllllIllIlIlllIlIIIlII;
            0;
            if (null == null) continue;
            return ((0x1A ^ 0x14) & ~(0x29 ^ 0x27)) != 0;
        }
        if (T.llIllIllIIIlll(lllllllllllllllIllIlIlllIlIIIllI)) {
            return lIlIIlllIIll[1];
        }
        lllllllllllllllIllIlIlllIlIIIlll.co.a(lllllllllllllllIllIlIlllIlIIIllI);
        if (T.llIllIllIIlIII((Object)lllllllllllllllIllIlIlllIlIIIllI.bw, (Object)N.END) && T.llIllIllIIIlII(lllllllllllllllIllIlIlllIlIIIlIl + lIlIIlllIIll[1], lllllllllllllllIllIlIlllIlIIIlll.co.D().size())) {
            lllllllllllllllIllIlIlllIlIIIlll.co.b(lllllllllllllllIllIlIlllIlIIIlll.co.D().get(lllllllllllllllIllIlIlllIlIIIlIl + lIlIIlllIIll[1]));
        }
        this.co.h((int)var2_2);
        return lIlIIlllIIll[0];
    }

    private static String llIllIllIIIIII(String lllllllllllllllIllIlIlllIIlllIIl, String lllllllllllllllIllIlIlllIIlllIII) {
        try {
            SecretKeySpec lllllllllllllllIllIlIlllIIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIllIlIlllIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIllIlIlllIIllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIllIlIlllIIllllIl.init(lIlIIlllIIll[2], lllllllllllllllIllIlIlllIIlllllI);
            return new String(lllllllllllllllIllIlIlllIIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIllIlIlllIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIllIlIlllIIllllII) {
            lllllllllllllllIllIlIlllIIllllII.printStackTrace();
            return null;
        }
    }

    @Override
    public List<Prayer> ci() {
        return null;
    }

    @Override
    public boolean ch() {
        return lIlIIlllIIll[1];
    }

    private static boolean llIllIllIIIIll(int n2) {
        return n2 == 0;
    }

    static {
        T.llIllIllIIIIlI();
        T.llIllIllIIIIIl();
    }

    private static boolean llIllIllIIIlIl(Object object) {
        return object != null;
    }

    @Inject
    protected T(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }
}

