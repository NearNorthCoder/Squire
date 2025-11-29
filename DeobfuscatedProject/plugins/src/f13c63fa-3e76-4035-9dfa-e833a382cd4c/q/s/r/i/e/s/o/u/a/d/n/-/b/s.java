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
import q.s.r.i.e.s.o.u.a.d.n.-.b.e;

@TaskDesc(name="Casting B2P", priority=6)
public class s
extends Task {
    private final /* synthetic */ e ai;
    private static /* synthetic */ String[] lllIIIlIIll;
    private static /* synthetic */ int[] lllIIIlIlII;

    private static boolean lIlIllIllIllll(int n2) {
        return n2 != 0;
    }

    public boolean run() {
        s llllllllllllllllIIlIIlllIlIIlIII;
        if (!s.lIlIllIllIllll(this.ai.t() ? 1 : 0) || s.lIlIllIllIllll(this.ai.s() ? 1 : 0)) {
            return lllIIIlIlII[0];
        }
        if (s.lIlIllIllIllll(llllllllllllllllIIlIIlllIlIIlIII.ai.w() ? 1 : 0)) {
            return lllIIIlIlII[0];
        }
        String[] stringArray = new String[lllIIIlIlII[1]];
        stringArray[s.lllIIIlIlII[0]] = lllIIIlIIll[lllIIIlIlII[0]];
        stringArray[s.lllIIIlIlII[2]] = lllIIIlIIll[lllIIIlIlII[2]];
        if (s.lIlIllIlllIIII(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            return lllIIIlIlII[0];
        }
        TileItem llllllllllllllllIIlIIlllIlIIIlll = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(lllIIIlIIll[lllIIIlIlII[7]]));
        if (s.lIlIllIlllIIIl(llllllllllllllllIIlIIlllIlIIIlll) && s.lIlIllIlllIIII(Inventory.isFull() ? 1 : 0) && s.lIlIllIlllIIlI(llllllllllllllllIIlIIlllIlIIlIII.ai.r(), lllIIIlIlII[3])) {
            return lllIIIlIlII[0];
        }
        int[] nArray = new int[lllIIIlIlII[1]];
        nArray[s.lllIIIlIlII[0]] = lllIIIlIlII[4];
        nArray[s.lllIIIlIlII[2]] = lllIIIlIlII[5];
        Item llllllllllllllllIIlIIlllIlIIIllI = Inventory.getFirst((int[])nArray);
        if (s.lIlIllIlllIIIl(llllllllllllllllIIlIIlllIlIIIllI)) {
            llllllllllllllllIIlIIlllIlIIIllI.interact(lllIIIlIIll[lllIIIlIlII[1]]);
            "".length();
            if ("   ".length() < ((0x7C ^ 6 ^ (0xEC ^ 0x88)) & (0xB4 ^ 0x8D ^ (0x54 ^ 0x73) ^ -" ".length()))) {
                return ((167 + 161 - 187 + 56 ^ 58 + 104 - 15 + 6) & (0xB ^ 0x30 ^ (0x24 ^ 0x43) ^ -" ".length())) != 0;
            }
        } else {
            SpellBook.Standard llllllllllllllllIIlIIlllIlIIIlIl = SpellBook.Standard.BONES_TO_PEACHES;
            if (s.lIlIllIllIllll(llllllllllllllllIIlIIlllIlIIIlIl.canCast() ? 1 : 0)) {
                Magic.cast((Spell)llllllllllllllllIIlIIlllIlIIIlIl);
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

    private static String lIlIllIllIlIll(String llllllllllllllllIIlIIlllIIlllIll, String llllllllllllllllIIlIIlllIIllllII) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIlIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIIlIIlllIIllllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIIlIIlllIIllllll.init(lllIIIlIlII[1], llllllllllllllllIIlIIlllIlIIIIII);
            return new String(llllllllllllllllIIlIIlllIIllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlllIIlllllI) {
            llllllllllllllllIIlIIlllIIlllllI.printStackTrace();
            return null;
        }
    }

    @Inject
    public s(e e2) {
        this.ai = e2;
    }

    private static void lIlIllIllIlllI() {
        lllIIIlIlII = new int[9];
        s.lllIIIlIlII[0] = "  ".length() & ~"  ".length();
        s.lllIIIlIlII[1] = "  ".length();
        s.lllIIIlIlII[2] = " ".length();
        s.lllIIIlIlII[3] = 0xF5 ^ 0xB0 ^ (0x65 ^ 0x2C);
        s.lllIIIlIlII[4] = 0xFFFFBB6F & 0x5F9E;
        s.lllIIIlIlII[5] = -(0xFFFFEA13 & 0x35ED) & (0xFFFFBF5F & 0x7FEF);
        s.lllIIIlIlII[6] = 33 + 50 - 35 + 91 ^ 138 + 128 - 223 + 100;
        s.lllIIIlIlII[7] = "   ".length();
        s.lllIIIlIlII[8] = 0x3B ^ 0x52 ^ (0xB ^ 0x6A);
    }

    private static String lIlIllIllIllII(String llllllllllllllllIIlIIlllIIllIIII, String llllllllllllllllIIlIIlllIIlIllIl) {
        try {
            SecretKeySpec llllllllllllllllIIlIIlllIIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIIlIIlllIIlIllIl.getBytes(StandardCharsets.UTF_8)), lllIIIlIlII[8]), "DES");
            Cipher llllllllllllllllIIlIIlllIIllIIlI = Cipher.getInstance("DES");
            llllllllllllllllIIlIIlllIIllIIlI.init(lllIIIlIlII[1], llllllllllllllllIIlIIlllIIllIIll);
            return new String(llllllllllllllllIIlIIlllIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllllIIlIIlllIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIIlIIlllIIllIIIl) {
            llllllllllllllllIIlIIlllIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIllIlllIIIl(Object object) {
        return object != null;
    }

    private static void lIlIllIllIllIl() {
        lllIIIlIIll = new String[lllIIIlIlII[6]];
        s.lllIIIlIIll[s.lllIIIlIlII[0]] = s.lIlIllIllIlIll("w3ZSAWisN0I=", "MOzYf");
        s.lllIIIlIIll[s.lllIIIlIlII[2]] = s.lIlIllIllIllII("JWT5TsJavu/HTqnkE+MPkw==", "nRyOQ");
        s.lllIIIlIIll[s.lllIIIlIlII[1]] = s.lIlIllIllIllII("QNui3TbcG8M=", "ingHv");
        s.lllIIIlIIll[s.lllIIIlIlII[7]] = s.lIlIllIllIlIll("ImxS1fwvM2o=", "ltszW");
    }
}

