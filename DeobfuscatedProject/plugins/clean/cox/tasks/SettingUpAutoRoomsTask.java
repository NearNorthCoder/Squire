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
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.CoxTaskBase;
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
public class SettingUpAutoRoomsTask
extends CoxTaskBase {

    private static boolean llIllIllIIlIII(Object object, Object object2) {
        return object != object2;
    }

    private static void llIllIllIIIIIl() {
        lIlIIlllIIlI = new String[lIlIIlllIIll[1]];
        T.lIlIIlllIIlI[T.lIlIIlllIIll[0]] = "----------------";
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
        T var1;
        if (T.llIllIllIIIIll(this.bS.getPlane())) {
            return lIlIIlllIIll[0];
        }
        n var2 = null;
        int var3 = lIlIIlllIIll[0];
        int var4 = lIlIIlllIIll[0];
        while (T.llIllIllIIIlII(var4, var1.co.D().size())) {
            n var5 = var1.co.D().get(var4);
            if (T.llIllIllIIIlIl(var5) && T.llIllIllIIIllI(var5.a((Locatable)var1.bS) ? 1 : 0)) {
                var3 = var4;
                System.out.println(lIlIIlllIIlI[lIlIIlllIIll[0]]);
                var2 = var1.co.D().get(var4);
                System.out.println("Found room: " + String.valueOf((Object)var2.bw));

                if ((0xA4 ^ 0xA0) == (0x90 ^ 0x94)) break;
                return false;
            }
            ++var4;

            return false;
        }
        if (T.llIllIllIIIlll(var2)) {
            return lIlIIlllIIll[1];
        }
        var1.co.a(var2);
        if (T.llIllIllIIlIII((Object)var2.bw, (Object)N.END) && T.llIllIllIIIlII(var3 + lIlIIlllIIll[1], var1.co.D().size())) {
            var1.co.b(var1.co.D().get(var3 + lIlIIlllIIll[1]));
        }
        this.co.h((int)var2_2);
        return lIlIIlllIIll[0];
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
    protected SettingUpAutoRoomsTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }
}

