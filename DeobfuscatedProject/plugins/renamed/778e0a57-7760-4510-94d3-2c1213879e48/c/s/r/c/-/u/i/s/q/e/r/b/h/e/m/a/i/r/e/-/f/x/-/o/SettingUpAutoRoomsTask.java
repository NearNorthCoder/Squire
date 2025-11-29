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

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.NEnum;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.U_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n_Unknown;
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

/* TASK: Setting up Auto Rooms -> SettingupautoroomsTask */
@TaskDesc(name="Setting up Auto Rooms", priority=50000, blocking=true)
public class SettingUpAutoRoomsTask
extends U_Unknown {
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
        T var10;
        if (T.llIllIllIIIIll(this.bS.getPlane())) {
            return lIlIIlllIIll[0];
        }
        n var9 = null;
        int var1 = lIlIIlllIIll[0];
        int var2 = lIlIIlllIIll[0];
        while (T.llIllIllIIIlII(var2, var10.co.D().size())) {
            n var8 = var10.co.D().get(var2);
            if (T.llIllIllIIIlIl(var8) && T.llIllIllIIIllI(var8.a((Locatable)var10.bS) ? 1 : 0)) {
                var1 = var2;
                System.out.println(lIlIIlllIIlI[lIlIIlllIIll[0]]);
                var9 = var10.co.D().get(var2);
                System.out.println("Found room: " + String.valueOf((Object)var9.bw));
                0;
                if ((0xA4 ^ 0xA0) == (0x90 ^ 0x94)) break;
                return false;
            }
            ++var2;
            0;
            
            return false;
        }
        if (T.llIllIllIIIlll(var9)) {
            return lIlIIlllIIll[1];
        }
        var10.co.a(var9);
        if (T.llIllIllIIlIII((Object)var9.bw, (Object)N.END) && T.llIllIllIIIlII(var1 + lIlIIlllIIll[1], var10.co.D().size())) {
            var10.co.b(var10.co.D().get(var1 + lIlIIlllIIll[1]));
        }
        this.co.h((int)var2_2);
        return lIlIIlllIIll[0];
    }

    private static String llIllIllIIIIII(String var5, String var4) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIlIIlllIIll[2], var3);
            return new String(var6.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var7) {
            var7.printStackTrace();
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

