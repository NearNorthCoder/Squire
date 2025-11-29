/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package q.s.r.i.e.s.o.u.a.d.n.-.b;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import q.s.r.i.e.s.o.u.a.d.n.-.b.e_Unknown;

/* TASK: Casting B2P -> Castingb2PTask */
@TaskDesc(name="Casting B2P", priority=6)
public class CastingB2pTask
extends Task {
    private final /* synthetic */ e ai;
    private static /* synthetic */ String[] lllIIIlIIll;
    private static /* synthetic */ int[] lllIIIlIlII;

    private static boolean lIlIllIllIllll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        s var3;
        if (!s.lIlIllIllIllll(this.ai.t() ? 1 : 0) || s.lIlIllIllIllll(this.ai.s() ? 1 : 0)) {
            return lllIIIlIlII[0];
        }
        if (s.lIlIllIllIllll(var3.ai.w() ? 1 : 0)) {
            return lllIIIlIlII[0];
        }
        String[] stringArray = new String[lllIIIlIlII[1]];
        stringArray[s.lllIIIlIlII[0]] = lllIIIlIIll[lllIIIlIlII[0]];
        stringArray[s.lllIIIlIlII[2]] = lllIIIlIIll[lllIIIlIlII[2]];
        if (s.lIlIllIlllIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            return lllIIIlIlII[0];
        }
        TileItem var9 = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(lllIIIlIIll[lllIIIlIlII[7]]));
        if (s.lIlIllIlllIIIl(var9) && s.lIlIllIlllIIII(Inventory.isFull() ? 1 : 0) && s.lIlIllIlllIIlI(var3.ai.r(), lllIIIlIlII[3])) {
            return lllIIIlIlII[0];
        }
        int[] nArray = new int[lllIIIlIlII[1]];
        nArray[s.lllIIIlIlII[0]] = lllIIIlIlII[4];
        nArray[s.lllIIIlIlII[2]] = lllIIIlIlII[5];
        Item var12 = Inventory.getFirst((int[])nArray);
        if (s.lIlIllIlllIIIl(var12)) {
            var12.interact(lllIIIlIIll[lllIIIlIlII[1]]);
            0;
            if (3 < ((0x7C ^ 6 ^ (0xEC ^ 0x88)) & (0xB4 ^ 0x8D ^ (0x54 ^ 0x73) ^ -1))) {
                return ((167 + 161 - 187 + 56 ^ 58 + 104 - 15 + 6) & (0xB ^ 0x30 ^ (0x24 ^ 0x43) ^ -1)) != 0;
            }
        } else {
            SpellBook.Standard var11 = SpellBook.Standard.BONES_TO_PEACHES;
            if (s.lIlIllIllIllll(var11.canCast() ? 1 : 0)) {
                Magic.cast((Spell)var11);
            }
        }
        this.sleep(lllIIIlIlII[6]);
        return lllIIIlIlII[2];
    }

    private static boolean lIlIllIlllIIlI(int n2, int n3) {
        return n2 > n3;
    }

    static {
        s.lIlIllIllIlllI();
        s.lIlIllIllIllIl();
    }

    private static boolean lIlIllIlllIIII(int n2) {
        return n2 == 0;
    }

    private static String lIlIllIllIlIll(String var14, String var6) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(lllIIIlIlII[1], var7);
            return new String(var2.doFinal(Base64.getDecoder().decode(var14.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    @Inject
    public s(e e2) {
        this.ai = e2;
    }

    private static void lIlIllIllIlllI() {
        lllIIIlIlII = new int[9];
        s.lllIIIlIlII[0] = 2 & ~2;
        s.lllIIIlIlII[1] = 2;
        s.lllIIIlIlII[2] = 1;
        s.lllIIIlIlII[3] = 0xF5 ^ 0xB0 ^ (0x65 ^ 0x2C);
        s.lllIIIlIlII[4] = 0xFFFFBB6F & 0x5F9E;
        s.lllIIIlIlII[5] = -(0xFFFFEA13 & 0x35ED) & (0xFFFFBF5F & 0x7FEF);
        s.lllIIIlIlII[6] = 33 + 50 - 35 + 91 ^ 138 + 128 - 223 + 100;
        s.lllIIIlIlII[7] = 3;
        s.lllIIIlIlII[8] = 0x3B ^ 0x52 ^ (0xB ^ 0x6A);
    }

    private static String lIlIllIllIllII(String var13, String var4) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lllIIIlIlII[8]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lllIIIlIlII[1], var5);
            return new String(var1.doFinal(Base64.getDecoder().decode(var13.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlllIIIl(Object object) {
        return object != null;
    }

    private static void lIlIllIllIllIl() {
        lllIIIlIIll = new String[lllIIIlIlII[6]];
        s.lllIIIlIIll[s.lllIIIlIlII[0]] = s."Bones";
        s.lllIIIlIIll[s.lllIIIlIlII[2]] = s."Big bones";
        s.lllIIIlIIll[s.lllIIIlIlII[1]] = s."Break";
        s.lllIIIlIIll[s.lllIIIlIlII[7]] = s."bones";
    }
}

