/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Bank$Inventory
 */
package a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f;

import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.T;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.o;
import a.n.q.u.l.-.e.-.e.s.a.b.r.i.s.u.t.r.c.f.v;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.minigames.SquireBlastFurnace;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.unethicalite.api.items.Bank;

/* TASK: Bank filling coal bag -> BankfillingcoalbagTask */
@TaskDesc(name="Bank filling coal bag")
public class Q
extends T<v> {
    private static /* synthetic */ int[] lIIllIlIIllI;
    private static /* synthetic */ String[] lIIllIlIIlIl;

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(v v2, o o2) {
        void var4;
        Item item = Bank.Inventory.getFirst((int[])v2.I());
        if (Q.llIIllllIllIIl(item)) {
            return lIIllIlIIllI[0];
        }
        String[] stringArray = new String[lIIllIlIIllI[1]];
        stringArray[Q.lIIllIlIIllI[0]] = lIIllIlIIlIl[lIIllIlIIllI[0]];
        if (Q.llIIllllIllIlI(var4.hasAction(stringArray) ? 1 : 0)) {
            var4.interact(lIIllIlIIlIl[lIIllIlIIllI[1]]);
            return lIIllIlIIllI[0];
        }
        item.interact(lIIllIlIIlIl[lIIllIlIIllI[2]]);
        o2.k().u();
        return lIIllIlIIllI[1];
    }

    static {
        Q.llIIllllIllIII();
        Q.llIIllllIlIlll();
    }

    private static void llIIllllIllIII() {
        lIIllIlIIllI = new int[6];
        Q.lIIllIlIIllI[0] = (0x5A ^ 0x13 ^ (0x23 ^ 0x73)) & (0x8B ^ 0x95 ^ (0xD ^ 0xA) ^ -1);
        Q.lIIllIlIIllI[1] = 1;
        Q.lIIllIlIIllI[2] = 2;
        Q.lIIllIlIIllI[3] = 3;
        Q.lIIllIlIIllI[4] = 0x6A ^ 0x6E;
        Q.lIIllIlIIllI[5] = 0x56 ^ 0x3E ^ (0x67 ^ 7);
    }

    private static void llIIllllIlIlll() {
        lIIllIlIIlIl = new String[lIIllIlIIllI[4]];
        Q.lIIllIlIIlIl[Q.lIIllIlIIllI[0]] = Q."Empty";
        Q.lIIllIlIIlIl[Q.lIIllIlIIllI[1]] = Q."Empty";
        Q.lIIllIlIIlIl[Q.lIIllIlIIllI[2]] = Q."Fill";
        Q.lIIllIlIIlIl[Q.lIIllIlIIllI[3]] = Q."fill";
    }

    private static String llIIllllIlIlIl(String var10, String var8) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var8.getBytes(StandardCharsets.UTF_8)), lIIllIlIIllI[5]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(lIIllIlIIllI[2], var7);
            return new String(var5.doFinal(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    @Inject
    public Q(SquireBlastFurnace squireBlastFurnace) {
        super(squireBlastFurnace, v.class, string -> string.toLowerCase().contains(lIIllIlIIlIl[lIIllIlIIllI[3]]));
    }

    private static boolean llIIllllIllIIl(Object object) {
        return object == null;
    }

    private static String llIIllllIlIllI(String var9, String var1) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var1.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var6 = Cipher.getInstance("Blowfish");
            var6.init(lIIllIlIIllI[2], var11);
            return new String(var6.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    private static boolean llIIllllIllIlI(int n2) {
        return n2 != 0;
    }
}

