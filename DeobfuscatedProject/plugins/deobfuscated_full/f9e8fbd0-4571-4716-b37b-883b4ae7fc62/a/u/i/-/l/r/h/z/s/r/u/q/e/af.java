/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 */
package a.u.i.-.l.r.h.z.s.r.u.q.e;

import a.u.i.-.l.r.h.z.s.r.u.q.e.ag;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.zulrah.SquireZulrahConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;

/* TASK: Looting items -> LootingTask */
@TaskDesc(name="Looting items", priority=10, blocking=true)
public class af
extends ag {
    private static /* synthetic */ String[] lIllIlIIIIlII;
    private static /* synthetic */ int[] lIllIlIIIlIII;

    private static String llIIIlllIlIIlll(String var14, String var13) {
        var14 = new String(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var11 = var13.toCharArray();
        int var6 = lIllIlIIIlIII[0];
        char[] var4 = var14.toCharArray();
        int var8 = var4.length;
        int var7 = lIllIlIIIlIII[0];
        while (af.llIIIlllIllIllI(var7, var8)) {
            char var5 = var4[var7];
            var12.append((char)(var5 ^ var11[var6 % var11.length]));
            0;
            ++var6;
            ++var7;
            0;
            if (((98 + 65 - 56 + 51 ^ 56 + 63 - 111 + 160) & (0xAE ^ 0x97 ^ (0xC8 ^ 0xC7) ^ -1)) == 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    private static boolean llIIIlllIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIIIlllIllIIII() {
        lIllIlIIIIlII = new String[lIllIlIIIlIII[3]];
        af.lIllIlIIIIlII[af.lIllIlIIIlIII[0]] = af."Eat";
        af.lIllIlIIIIlII[af.lIllIlIIIlIII[1]] = af."Take";
        af.lIllIlIIIIlII[af.lIllIlIIIlIII[2]] = af."Eat";
    }

    private static boolean llIIIlllIllIlII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIlllIllIlIl(Object object) {
        return object == null;
    }

    private static void llIIIlllIllIIll() {
        lIllIlIIIlIII = new int[4];
        af.lIllIlIIIlIII[0] = (0x9E ^ 0x91 ^ (0xE1 ^ 0x8D)) & (0x1E ^ 0xD ^ (0xFD ^ 0x8D) ^ -1);
        af.lIllIlIIIlIII[1] = 1;
        af.lIllIlIIIlIII[2] = 2;
        af.lIllIlIIIlIII[3] = 3;
    }

    @Override
    public boolean ac() {
        List list = TileItems.getAll();
        if (af.llIIIlllIllIlII(list.isEmpty() ? 1 : 0)) {
            return lIllIlIIIlIII[0];
        }
        if (af.llIIIlllIllIlII(Inventory.isFull() ? 1 : 0)) {
            Item var15 = Inventory.getFirst(item -> item.hasAction(lIllIlIIIIlII[lIllIlIIIlIII[2]]::equals));
            if (af.llIIIlllIllIlIl(var15)) {
                return lIllIlIIIlIII[0];
            }
            var15.interact(lIllIlIIIIlII[lIllIlIIIlIII[0]]);
        }
        ((TileItem)list.get(lIllIlIIIlIII[0])).interact(lIllIlIIIIlII[lIllIlIIIlIII[1]]);
        return lIllIlIIIlIII[1];
    }

    private static String llIIIlllIlIlIII(String var3, String var9) {
        try {
            SecretKeySpec var10 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var1 = Cipher.getInstance("Blowfish");
            var1.init(lIllIlIIIlIII[2], var10);
            return new String(var1.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    @Inject
    protected af(Client client, SquireZulrahConfig squireZulrahConfig) {
        super(client, squireZulrahConfig);
    }

    static {
        af.llIIIlllIllIIll();
        af.llIIIlllIllIIII();
    }
}

