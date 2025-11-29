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

import a.u.i.-.l.r.h.z.s.r.u.q.e.ag;
import a.u.i.-.l.r.h.z.s.r.u.q.e.b;
import a.u.i.-.l.r.h.z.s.r.u.q.e.o;
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

@TaskDesc(name="Teleporting out", priority=1)
public class ai
extends ag {
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
        int llllllllllllllIllIIIlllIllIllIII;
        int n2;
        ai llllllllllllllIllIIIlllIllIllIlI;
        if (ai.llIIIllllIllIlI(this.E.e() ? 1 : 0)) {
            return lIllIlIIlIlll[0];
        }
        int llllllllllllllIllIIIlllIllIllIIl = Inventory.getCount(item -> {
            String[] stringArray = new String[lIllIlIIlIlll[1]];
            stringArray[ai.lIllIlIIlIlll[0]] = lIllIlIIlIllI[lIllIlIIlIlll[0]];
            return item.hasAction(stringArray);
        });
        if (!ai.llIIIllllIllIlI(Inventory.contains(item -> item.getName().startsWith(this.aC.cure().k())) ? 1 : 0) || ai.llIIIllllIllIll((Object)llllllllllllllIllIIIlllIllIllIlI.aC.cure(), (Object)o.IGNORE)) {
            n2 = lIllIlIIlIlll[1];
            0;
            if (-(0x52 ^ 0x57) >= 0) {
                return ((0xB0 ^ 0x94) & ~(0x95 ^ 0xB1)) != 0;
            }
        } else {
            n2 = llllllllllllllIllIIIlllIllIllIII = lIllIlIIlIlll[0];
        }
        if (ai.llIIIllllIlllII(llllllllllllllIllIIIlllIllIllIIl, llllllllllllllIllIIIlllIllIllIlI.aC.multiple()) && ai.llIIIllllIlllIl(llllllllllllllIllIIIlllIllIllIlI.aC.multiple()) && ai.llIIIllllIlllIl(llllllllllllllIllIIIlllIllIllIII)) {
            return lIllIlIIlIlll[0];
        }
        llllllllllllllIllIIIlllIllIllIlI.E.a(lIllIlIIlIlll[1]);
        b llllllllllllllIllIIIlllIllIlIlll = llllllllllllllIllIIIlllIllIllIlI.aC.bankTeleportItem();
        Item llllllllllllllIllIIIlllIllIlIllI = Inventory.getFirst(item -> item.getName().startsWith(llllllllllllllIllIIIlllIllIlIlll.k()));
        if (ai.llIIIllllIllllI(llllllllllllllIllIIIlllIllIlIllI)) {
            llllllllllllllIllIIIlllIllIlIlll.l().accept(llllllllllllllIllIIIlllIllIlIllI);
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

    private static String llIIIllllIlIllI(String llllllllllllllIllIIIlllIllIIllII, String llllllllllllllIllIIIlllIllIIlIll) {
        try {
            SecretKeySpec llllllllllllllIllIIIlllIllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlllIllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlllIllIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlllIllIlIIII.init(lIllIlIIlIlll[2], llllllllllllllIllIIIlllIllIlIIIl);
            return new String(llllllllllllllIllIIIlllIllIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlllIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlllIllIIllll) {
            llllllllllllllIllIIIlllIllIIllll.printStackTrace();
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

