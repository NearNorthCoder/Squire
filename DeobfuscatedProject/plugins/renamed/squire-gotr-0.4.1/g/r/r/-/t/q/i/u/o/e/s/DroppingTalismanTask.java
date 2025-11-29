/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package g.r.r.-.t.q.i.u.o.e.s;

import g.r.r.-.t.q.i.u.o.e.s.CEnum;
import g.r.r.-.t.q.i.u.o.e.s.h_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

/* TASK: Dropping Talisman -> DroppingtalismanTask */
@TaskDesc(name="Dropping Talisman", priority=10)
public class DroppingTalismanTask
extends h_Unknown {
    private static /* synthetic */ String[] llIlIIIIlIlI;
    private static /* synthetic */ int[] llIlIIIIlIll;

    static {
        u.lIIIIIIIIlIlIIl();
        u.lIIIIIIIIlIlIII();
    }

    private static void lIIIIIIIIlIlIII() {
        llIlIIIIlIlI = new String[llIlIIIIlIll[2]];
        u.llIlIIIIlIlI[u.llIlIIIIlIll[0]] = u."Drop";
        u.llIlIIIIlIlI[u.llIlIIIIlIll[1]] = u."Portal talisman";
    }

    /*
     * WARNING - void declaration
     */
    @Override
    protected boolean ak() {
        void var1_1;
        if (u.lIIIIIIIIlIlIlI(this.aW.useTalisman() ? 1 : 0)) {
            return llIlIIIIlIll[0];
        }
        Item var5 = Inventory.getFirst(item -> item.getName().startsWith(llIlIIIIlIlI[llIlIIIIlIll[1]]));
        if (u.lIIIIIIIIlIlIll(var5)) {
            return llIlIIIIlIll[0];
        }
        var1_1.interact(llIlIIIIlIlI[llIlIIIIlIll[0]]);
        return llIlIIIIlIll[1];
    }

    private static boolean lIIIIIIIIlIlIll(Object object) {
        return object == null;
    }

    private static boolean lIIIIIIIIlIlIlI(int n2) {
        return n2 != 0;
    }

    @Override
    protected boolean aj() {
        return llIlIIIIlIll[1];
    }

    private static void lIIIIIIIIlIlIIl() {
        llIlIIIIlIll = new int[4];
        u.llIlIIIIlIll[0] = (0x72 ^ 0x3A ^ (0xC8 ^ 0xAA)) & (66 + 139 - 158 + 97 ^ 171 + 180 - 222 + 57 ^ -1);
        u.llIlIIIIlIll[1] = 1;
        u.llIlIIIIlIll[2] = 2;
        u.llIlIIIIlIll[3] = 0x39 ^ 0x57 ^ (0xFF ^ 0x99);
    }

    private static String lIIIIIIIIlIIlll(String var1, String var2) {
        try {
            SecretKeySpec var4 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), llIlIIIIlIll[3]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(llIlIIIIlIll[2], var4);
            return new String(var6.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    @Inject
    public u(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, new c[llIlIIIIlIll[0]]);
    }
}

