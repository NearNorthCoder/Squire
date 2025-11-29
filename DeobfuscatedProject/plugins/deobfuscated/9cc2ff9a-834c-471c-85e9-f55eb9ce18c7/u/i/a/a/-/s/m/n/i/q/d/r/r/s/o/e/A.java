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
package u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e;

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
import u.i.a.a.-.s.m.n.i.q.d.r.r.s.o.e.g;

@TaskDesc(name="Casting B2P", priority=6)
public class A
extends Task {
    private final /* synthetic */ g az;
    private static /* synthetic */ String[] lIIlIIllIllII;
    private static /* synthetic */ int[] lIIlIIllIllll;

    private static String lIlIlIlIIllIIlI(String llllllllllllllIlllllIIllIllIIlll, String llllllllllllllIlllllIIllIllIIllI) {
        try {
            SecretKeySpec llllllllllllllIlllllIIllIllIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIllIllIIllI.getBytes(StandardCharsets.UTF_8)), lIIlIIllIllll[8]), "DES");
            Cipher llllllllllllllIlllllIIllIllIlIll = Cipher.getInstance("DES");
            llllllllllllllIlllllIIllIllIlIll.init(lIIlIIllIllll[1], llllllllllllllIlllllIIllIllIllII);
            return new String(llllllllllllllIlllllIIllIllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIllIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIllIllIlIlI) {
            llllllllllllllIlllllIIllIllIlIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlIlIlIIllIlII(String llllllllllllllIlllllIIllIlIlIlII, String llllllllllllllIlllllIIllIlIllIII) {
        llllllllllllllIlllllIIllIlIlIlII = new String(Base64.getDecoder().decode(llllllllllllllIlllllIIllIlIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllllIIllIlIlIlll = new StringBuilder();
        char[] llllllllllllllIlllllIIllIlIlIllI = llllllllllllllIlllllIIllIlIllIII.toCharArray();
        int llllllllllllllIlllllIIllIlIlIlIl = lIIlIIllIllll[0];
        char[] llllllllllllllIlllllIIllIlIIllll = llllllllllllllIlllllIIllIlIlIlII.toCharArray();
        int llllllllllllllIlllllIIllIlIIlllI = llllllllllllllIlllllIIllIlIIllll.length;
        int llllllllllllllIlllllIIllIlIIllIl = lIIlIIllIllll[0];
        while (A.lIlIlIlIlIIIIIl(llllllllllllllIlllllIIllIlIIllIl, llllllllllllllIlllllIIllIlIIlllI)) {
            char llllllllllllllIlllllIIllIlIllIlI = llllllllllllllIlllllIIllIlIIllll[llllllllllllllIlllllIIllIlIIllIl];
            llllllllllllllIlllllIIllIlIlIlll.append((char)(llllllllllllllIlllllIIllIlIllIlI ^ llllllllllllllIlllllIIllIlIlIllI[llllllllllllllIlllllIIllIlIlIlIl % llllllllllllllIlllllIIllIlIlIllI.length]));
            0;
            ++llllllllllllllIlllllIIllIlIlIlIl;
            ++llllllllllllllIlllllIIllIlIIllIl;
            0;
            if (null == null) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIlllllIIllIlIlIlll);
    }

    private static boolean lIlIlIlIlIIIIII(int n2, int n3) {
        return n2 > n3;
    }

    @Inject
    public A(g g2) {
        this.az = g2;
    }

    static {
        A.lIlIlIlIIllllII();
        A.lIlIlIlIIllIlIl();
    }

    private static boolean lIlIlIlIIlllllI(int n2) {
        return n2 == 0;
    }

    private static String lIlIlIlIIllIIll(String llllllllllllllIlllllIIllIlIIIIlI, String llllllllllllllIlllllIIllIlIIIIll) {
        try {
            SecretKeySpec llllllllllllllIlllllIIllIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllllIIllIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllllIIllIlIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllllIlllllIIllIlIIIllI.init(lIIlIIllIllll[1], llllllllllllllIlllllIIllIlIIIlll);
            return new String(llllllllllllllIlllllIIllIlIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllllIlllllIIllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllllIIllIlIIIlIl) {
            llllllllllllllIlllllIIllIlIIIlIl.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        A llllllllllllllIlllllIIllIlllIlII;
        if (!A.lIlIlIlIIllllIl(this.az.m() ? 1 : 0) || A.lIlIlIlIIllllIl(this.az.l() ? 1 : 0)) {
            return lIIlIIllIllll[0];
        }
        if (A.lIlIlIlIIllllIl(llllllllllllllIlllllIIllIlllIlII.az.p() ? 1 : 0)) {
            return lIIlIIllIllll[0];
        }
        String[] stringArray = new String[lIIlIIllIllll[1]];
        stringArray[A.lIIlIIllIllll[0]] = lIIlIIllIllII[lIIlIIllIllll[0]];
        stringArray[A.lIIlIIllIllll[2]] = lIIlIIllIllII[lIIlIIllIllll[2]];
        if (A.lIlIlIlIIlllllI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            return lIIlIIllIllll[0];
        }
        TileItem llllllllllllllIlllllIIllIlllIIll = TileItems.getNearest(tileItem -> tileItem.getName().toLowerCase().contains(lIIlIIllIllII[lIIlIIllIllll[7]]));
        if (A.lIlIlIlIIllllll(llllllllllllllIlllllIIllIlllIIll) && A.lIlIlIlIIlllllI(Inventory.isFull() ? 1 : 0) && A.lIlIlIlIlIIIIII(llllllllllllllIlllllIIllIlllIlII.az.k(), lIIlIIllIllll[3])) {
            return lIIlIIllIllll[0];
        }
        int[] nArray = new int[lIIlIIllIllll[1]];
        nArray[A.lIIlIIllIllll[0]] = lIIlIIllIllll[4];
        nArray[A.lIIlIIllIllll[2]] = lIIlIIllIllll[5];
        Item llllllllllllllIlllllIIllIlllIIlI = Inventory.getFirst((int[])nArray);
        if (A.lIlIlIlIIllllll(llllllllllllllIlllllIIllIlllIIlI)) {
            llllllllllllllIlllllIIllIlllIIlI.interact(lIIlIIllIllII[lIIlIIllIllll[1]]);
            0;
            if (1 < 0) {
                return ((0x3B ^ 0x2A ^ (0xF6 ^ 0xA7)) & (0x77 ^ 0xF ^ (0x93 ^ 0xAB) ^ -1)) != 0;
            }
        } else {
            SpellBook.Standard llllllllllllllIlllllIIllIlllIIIl = SpellBook.Standard.BONES_TO_PEACHES;
            Magic.cast((Spell)llllllllllllllIlllllIIllIlllIIIl);
        }
        this.sleep(lIIlIIllIllll[6]);
        return lIIlIIllIllll[2];
    }

    private static void lIlIlIlIIllIlIl() {
        lIIlIIllIllII = new String[lIIlIIllIllll[6]];
        A.lIIlIIllIllII[A.lIIlIIllIllll[0]] = A."Bones";
        A.lIIlIIllIllII[A.lIIlIIllIllll[2]] = A."Big bones";
        A.lIIlIIllIllII[A.lIIlIIllIllll[1]] = A."Break";
        A.lIIlIIllIllII[A.lIIlIIllIllll[7]] = A."bones";
    }

    private static boolean lIlIlIlIlIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIlIlIlIIllllll(Object object) {
        return object != null;
    }

    private static boolean lIlIlIlIIllllIl(int n2) {
        return n2 != 0;
    }

    private static void lIlIlIlIIllllII() {
        lIIlIIllIllll = new int[9];
        A.lIIlIIllIllll[0] = (0x24 ^ 0x74) & ~(0x26 ^ 0x76);
        A.lIIlIIllIllll[1] = 2;
        A.lIIlIIllIllll[2] = 1;
        A.lIIlIIllIllll[3] = 0x8E ^ 0x82;
        A.lIIlIIllIllll[4] = 0xFFFF9F9F & 0x7B6E;
        A.lIIlIIllIllll[5] = -(0xFFFFF9FD & 0x66B3) & (0xFFFFFFFF & Short.MAX_VALUE);
        A.lIIlIIllIllll[6] = 0x3E ^ 0x3A;
        A.lIIlIIllIllll[7] = 3;
        A.lIIlIIllIllll[8] = 0x5D ^ 0x37 ^ (0xF9 ^ 0x9B);
    }
}

