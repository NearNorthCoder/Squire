/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.items.Inventory
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.c;
import a.u.i.-.l.r.h.z.s.r.u.q.e.q;
import a.u.i.-.l.r.h.z.s.r.u.q.e.u;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrah;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Teleporting to Zul-andra")
public class ao
extends Task {
    private static /* synthetic */ String[] lIllIlIlIllII;
    @Inject
    private /* synthetic */ u ab;
    private final /* synthetic */ SquireZulrahConfig aN;
    private final /* synthetic */ Client aM;
    private final /* synthetic */ SquireZulrah aL;
    private static /* synthetic */ int[] lIllIlIlIllIl;

    private static boolean llIIlIIIIIlIlII(Object object) {
        return object == null;
    }

    private static void llIIlIIIIIIlllI() {
        lIllIlIlIllII = new String[lIllIlIlIllIl[2]];
        ao.lIllIlIlIllII[ao.lIllIlIlIllIl[0]] = ao."Teleport";
    }

    private static boolean llIIlIIIIIlIIII(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIIlIIIIIlIIll(int n2) {
        return n2 == 0;
    }

    private static boolean llIIlIIIIIlIIIl(int n2) {
        return n2 != 0;
    }

    private static void llIIlIIIIIIllll() {
        lIllIlIlIllIl = new int[6];
        ao.lIllIlIlIllIl[0] = (5 ^ 0x27) & ~(0x32 ^ 0x10);
        ao.lIllIlIlIllIl[1] = 0xFFFFB7DF & 0x7B6A;
        ao.lIllIlIlIllIl[2] = 1;
        ao.lIllIlIlIllIl[3] = -(0xFFFFE8CE & 0x5737) & (0xFFFFFFEF & 0x729F);
        ao.lIllIlIlIllIl[4] = 0x14 ^ 0x1C;
        ao.lIllIlIlIllIl[5] = 2;
    }

    static {
        ao.llIIlIIIIIIllll();
        ao.llIIlIIIIIIlllI();
    }

    @Inject
    public ao(SquireZulrah squireZulrah, Client client, SquireZulrahConfig squireZulrahConfig) {
        this.aL = squireZulrah;
        this.aM = client;
        this.aN = squireZulrahConfig;
    }

    private InventorySetup aj() {
        return new InventorySetup();
    }

    private static boolean llIIlIIIIIlIIlI(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        ao llllllllllllllIllIIIllIllIlIIIII;
        if (!ao.llIIlIIIIIlIIII((Object)this.aL.a(), (Object)c.DONE) || ao.llIIlIIIIIlIIIl(this.aL.d() ? 1 : 0)) {
            return lIllIlIlIllIl[0];
        }
        if (ao.llIIlIIIIIlIIlI((Object)llllllllllllllIllIIIllIllIlIIIII.aN.transport(), (Object)q.ZUL_ANDRA_TELEPORT)) {
            return lIllIlIlIllIl[0];
        }
        if (ao.llIIlIIIIIlIIll(llllllllllllllIllIIIllIllIlIIIII.ab.h(lIllIlIlIllIl[1]) ? 1 : 0)) {
            return lIllIlIlIllIl[0];
        }
        int[] nArray = new int[lIllIlIlIllIl[2]];
        nArray[ao.lIllIlIlIllIl[0]] = lIllIlIlIllIl[3];
        Item llllllllllllllIllIIIllIllIIlllll = Inventory.getFirst((int[])nArray);
        if (ao.llIIlIIIIIlIlII(llllllllllllllIllIIIllIllIIlllll)) {
            return lIllIlIlIllIl[0];
        }
        var1_1.interact(lIllIlIlIllII[lIllIlIlIllIl[0]]);
        return lIllIlIlIllIl[2];
    }

    private static String llIIlIIIIIIllIl(String llllllllllllllIllIIIllIllIIlIlIl, String llllllllllllllIllIIIllIllIIlIlII) {
        try {
            SecretKeySpec llllllllllllllIllIIIllIllIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIIIllIllIIlIlII.getBytes(StandardCharsets.UTF_8)), lIllIlIlIllIl[4]), "DES");
            Cipher llllllllllllllIllIIIllIllIIllIIl = Cipher.getInstance("DES");
            llllllllllllllIllIIIllIllIIllIIl.init(lIllIlIlIllIl[5], llllllllllllllIllIIIllIllIIllIlI);
            return new String(llllllllllllllIllIIIllIllIIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIIIllIllIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIIIllIllIIllIII) {
            llllllllllllllIllIIIllIllIIllIII.printStackTrace();
            return null;
        }
    }
}

