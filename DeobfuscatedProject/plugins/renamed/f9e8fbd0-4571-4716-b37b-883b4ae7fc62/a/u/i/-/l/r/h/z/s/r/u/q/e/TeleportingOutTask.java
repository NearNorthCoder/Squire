/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ag_Unknown;
import a.u.i.-.l.r.h.z.s.r.u.q.e.BEnum;
import a.u.i.-.l.r.h.z.s.r.u.q.e.OEnum;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

/* TASK: Teleporting out -> TeleportOutTask */
@TaskDesc(name="Teleporting out", priority=1)
public class TeleportingOutTask
extends ag_Unknown {
    private static /* synthetic */ int[] lIllIlIIlIlll;
    private static /* synthetic */ String[] lIllIlIIlIllI;

    private static boolean llIIIllllIllIlI(int n2) {
        return n2 == 0;
    }

    @Inject
    protected ai(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    private static boolean llIIIllllIlllIl(int n2) {
        return n2 != 0;
    }

    private static void llIIIllllIllIII() {
        lIllIlIIlIllI = new String[lIllIlIIlIlll[1]];
        ai.lIllIlIIlIllI[ai.lIllIlIIlIlll[0]] = ai."Eat";
    }

    @Override
    public boolean ac() {
        int var2;
        int n2;
        ai var1;
        if (ai.llIIIllllIllIlI(this.E.e() ? 1 : 0)) {
            return lIllIlIIlIlll[0];
        }
        int var9 = Inventory.getCount(item -> {
            String[] stringArray = new String[lIllIlIIlIlll[1]];
            stringArray[ai.lIllIlIIlIlll[0]] = lIllIlIIlIllI[lIllIlIIlIlll[0]];
            return item.hasAction(stringArray);
        });
        if (!ai.llIIIllllIllIlI(Inventory.contains(item -> item.getName().startsWith(this.aC.cure().k())) ? 1 : 0) || ai.llIIIllllIllIll((Object)var1.aC.cure(), (Object)o.IGNORE)) {
            n2 = lIllIlIIlIlll[1];
            0;
            if (-(0x52 ^ 0x57) >= 0) {
                return false;
            }
        } else {
            n2 = var2 = lIllIlIIlIlll[0];
        }
        if (ai.llIIIllllIlllII(var9, var1.aC.multiple()) && ai.llIIIllllIlllIl(var1.aC.multiple()) && ai.llIIIllllIlllIl(var2)) {
            return lIllIlIIlIlll[0];
        }
        var1.E.a(lIllIlIIlIlll[1]);
        b var6 = var1.aC.bankTeleportItem();
        Item var4 = Inventory.getFirst(item -> item.getName().startsWith(var6.k()));
        if (ai.llIIIllllIllllI(var4)) {
            var6.l().accept(var4);
            return lIllIlIIlIlll[1];
        }
        return this.aC.bankLocation().f().getAsBoolean();
    }

    private static boolean llIIIllllIlllII(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        ai.llIIIllllIllIIl();
        ai.llIIIllllIllIII();
    }

    private static boolean llIIIllllIllIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIIllllIllllI(Object object) {
        return object != null;
    }

    private static String llIIIllllIlIllI(String var5, String var7) {
        try {
            SecretKeySpec var3 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var10 = Cipher.getInstance("Blowfish");
            var10.init(lIllIlIIlIlll[2], var3);
            return new String(var10.doFinal(Base64.getDecoder().decode(var5.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static void llIIIllllIllIIl() {
        lIllIlIIlIlll = new int[3];
        ai.lIllIlIIlIlll[0] = (0x38 ^ 0x1C) & ~(0xBA ^ 0x9E);
        ai.lIllIlIIlIlll[1] = 1;
        ai.lIllIlIIlIlll[2] = 2;
    }
}

