/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package -.m.e.a.u.s.r.r.q.i.r.e.f;

import -.m.e.a.u.s.r.r.q.i.r.e.f.HerbType;
import -.m.e.a.u.s.r.r.q.i.r.e.f.az_Unknown;
import -.m.e.a.u.s.r.r.q.i.r.e.f.f_Unknown;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

/* TASK: Picking up produce -> PickingupproduceTask */
@TaskDesc(name="Picking up produce", priority=6, blocking=true)
public class PickingUpProduceTask
extends az_Unknown {
    private static /* synthetic */ int[] lIllllIllIIl;
    private static /* synthetic */ String[] lIllllIllIII;

    static {
        bf.lllIlllIlIlllI();
        bf.lllIlllIlIllIl();
    }

    private static String lllIlllIlIllII(String var1, String var4) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIllllIllIIl[2]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(lIllllIllIIl[3], var5);
            return new String(var6.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
            return null;
        }
    }

    @Inject
    public bf(f f2, SquireFarmerConfig squireFarmerConfig, Client client) {
        super(f2, squireFarmerConfig, client);
    }

    private static boolean lllIlllIlIllll(int n2) {
        return n2 != 0;
    }

    private static void lllIlllIlIlllI() {
        lIllllIllIIl = new int[4];
        bf.lIllllIllIIl[0] = (15 + 110 - 47 + 70 ^ 140 + 160 - 187 + 56) & (0x78 ^ 8 ^ (0x43 ^ 0xE) ^ -1);
        bf.lIllllIllIIl[1] = 1;
        bf.lIllllIllIIl[2] = 0x52 ^ 1 ^ (0xE7 ^ 0xBC);
        bf.lIllllIllIIl[3] = 2;
    }

    private static void lllIlllIlIllIl() {
        lIllllIllIII = new String[lIllllIllIIl[1]];
        bf.lIllllIllIII[bf.lIllllIllIIl[0]] = bf."Take";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (bf.lllIlllIlIllll(Inventory.isFull() ? 1 : 0)) {
            return lIllllIllIIl[0];
        }
        int[] nArray = new int[lIllllIllIIl[1]];
        nArray[bf.lIllllIllIIl[0]] = au.LIMPWURT.au();
        List var2 = TileItems.getAll((int[])nArray);
        if (bf.lllIlllIlIllll(var2.isEmpty() ? 1 : 0)) {
            return lIllllIllIIl[0];
        }
        ((TileItem)var1_1.get(lIllllIllIIl[0])).interact(lIllllIllIII[lIllllIllIIl[0]]);
        return lIllllIllIIl[1];
    }
}

