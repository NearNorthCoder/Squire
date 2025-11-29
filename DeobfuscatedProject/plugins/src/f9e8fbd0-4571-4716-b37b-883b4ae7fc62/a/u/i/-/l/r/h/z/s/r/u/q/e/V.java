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

import a.u.i.-.l.r.h.z.s.r.u.q.e.ad;
import a.u.i.-.l.r.h.z.s.r.u.q.e.i;
import a.u.i.-.l.r.h.z.s.r.u.q.e.v;
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

@TaskDesc(name="Drinking potions", priority=5)
public class V
extends ad {
    private static /* synthetic */ String[] lIllIllIlllIl;
    private static /* synthetic */ int[] lIllIllIlllll;

    @Inject
    protected V(v v2, Client client, SquireZulrahConfig squireZulrahConfig) {
        super(v2, client, squireZulrahConfig);
    }

    private static /* synthetic */ boolean a(i i2, Item item) {
        return item.getName().startsWith(i2.k());
    }

    private static boolean llIIlIIlIlIlllI(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean ac() {
        void llllllllllllllIllIIIlIIllIlIIIll;
        i[] iArray = i.values();
        int n2 = iArray.length;
        int llllllllllllllIllIIIlIIllIlIIIlI = lIllIllIlllll[0];
        while (V.llIIlIIlIlIllII(llllllllllllllIllIIIlIIllIlIIIlI, (int)llllllllllllllIllIIIlIIllIlIIIll)) {
            void llllllllllllllIllIIIlIIllIlIIlII;
            void llllllllllllllIllIIIlIIllIlIIIIl = llllllllllllllIllIIIlIIllIlIIlII[llllllllllllllIllIIIlIIllIlIIIlI];
            if (V.llIIlIIlIlIllIl(llllllllllllllIllIIIlIIllIlIIIIl.v() ? 1 : 0)) {
                Item llllllllllllllIllIIIlIIllIlIIIII = Inventory.getFirst(arg_0 -> V.a((i)llllllllllllllIllIIIlIIllIlIIIIl, arg_0));
                if (V.llIIlIIlIlIlllI(llllllllllllllIllIIIlIIllIlIIIII)) {
                    "".length();
                    if ("   ".length() <= 0) {
                        return ((0x7F ^ 0x5C ^ (0x28 ^ 0x17)) & (0x8E ^ 0x99 ^ (0xBB ^ 0xB0) ^ -" ".length())) != 0;
                    }
                } else {
                    llllllllllllllIllIIIlIIllIlIIIII.interact(lIllIllIlllIl[lIllIllIlllll[0]]);
                    return lIllIllIlllll[1];
                }
            }
            ++llllllllllllllIllIIIlIIllIlIIIlI;
            "".length();
            if (null == null) continue;
            return ((0x2D ^ 0x66) & ~(0x5C ^ 0x17)) != 0;
        }
        return lIllIllIlllll[0];
    }

    private static void llIIlIIlIlIlIll() {
        lIllIllIlllll = new int[3];
        V.lIllIllIlllll[0] = (0x71 ^ 0x25) & ~(7 ^ 0x53);
        V.lIllIllIlllll[1] = " ".length();
        V.lIllIllIlllll[2] = "  ".length();
    }

    static {
        V.llIIlIIlIlIlIll();
        V.llIIlIIlIlIlIIl();
    }

    private static String llIIlIIlIlIlIII(String llllllllllllllIllIIIlIIllIIlIllI, String llllllllllllllIllIIIlIIllIIlIlll) {
        try {
            SecretKeySpec llllllllllllllIllIIIlIIllIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIlIIllIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIIIlIIllIIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIIIlIIllIIllIlI.init(lIllIllIlllll[2], llllllllllllllIllIIIlIIllIIllIll);
            return new String(llllllllllllllIllIIIlIIllIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIlIIllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIlIIllIIllIIl) {
            llllllllllllllIllIIIlIIllIIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIlIlIlIIl() {
        lIllIllIlllIl = new String[lIllIllIlllll[1]];
        V.lIllIllIlllIl[V.lIllIllIlllll[0]] = V.llIIlIIlIlIlIII("uT9/n48RvXE=", "Vmagd");
    }

    private static boolean llIIlIIlIlIllIl(int n2) {
        return n2 == 0;
    }
}

