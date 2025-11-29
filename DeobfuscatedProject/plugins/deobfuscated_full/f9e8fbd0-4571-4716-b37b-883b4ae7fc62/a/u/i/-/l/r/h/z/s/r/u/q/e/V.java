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

/* TASK: Drinking potions -> DrinkPotionsTask */
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
        void var5;
        i[] iArray = i.values();
        int n2 = iArray.length;
        int var6 = lIllIllIlllll[0];
        while (V.llIIlIIlIlIllII(var6, (int)var5)) {
            void var4;
            void var10 = var4[var6];
            if (V.llIIlIIlIlIllIl(var10.v() ? 1 : 0)) {
                Item var8 = Inventory.getFirst(arg_0 -> V.a((i)var10, arg_0));
                if (V.llIIlIIlIlIlllI(var8)) {
                    0;
                    if (3 <= 0) {
                        return ((0x7F ^ 0x5C ^ (0x28 ^ 0x17)) & (0x8E ^ 0x99 ^ (0xBB ^ 0xB0) ^ -1)) != 0;
                    }
                } else {
                    var8.interact(lIllIllIlllIl[lIllIllIlllll[0]]);
                    return lIllIllIlllll[1];
                }
            }
            ++var6;
            0;
            
            return false;
        }
        return lIllIllIlllll[0];
    }

    private static void llIIlIIlIlIlIll() {
        lIllIllIlllll = new int[3];
        V.lIllIllIlllll[0] = (0x71 ^ 0x25) & ~(7 ^ 0x53);
        V.lIllIllIlllll[1] = 1;
        V.lIllIllIlllll[2] = 2;
    }

    static {
        V.llIIlIIlIlIlIll();
        V.llIIlIIlIlIlIIl();
    }

    private static String llIIlIIlIlIlIII(String var1, String var9) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var7 = Cipher.getInstance("Blowfish");
            var7.init(lIllIllIlllll[2], var2);
            return new String(var7.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    private static boolean llIIlIIlIlIllII(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIlIIlIlIlIIl() {
        lIllIllIlllIl = new String[lIllIllIlllll[1]];
        V.lIllIllIlllIl[V.lIllIllIlllll[0]] = V."Drink";
    }

    private static boolean llIIlIIlIlIllIl(int n2) {
        return n2 == 0;
    }
}

