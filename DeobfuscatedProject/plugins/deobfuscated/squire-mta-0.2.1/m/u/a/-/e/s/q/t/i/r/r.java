/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package m.u.a.-.e.s.q.t.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.u.a.-.e.s.q.t.i.r.d;
import m.u.a.-.e.s.q.t.i.r.e;
import m.u.a.-.e.s.q.t.i.r.g;
import m.u.a.-.e.s.q.t.i.r.w;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Enchantment room", priority=6, blocking=true)
public class r
extends w<e> {
    private static final /* synthetic */ int at;
    private static final /* synthetic */ int as;
    private static /* synthetic */ String[] lllIlIIlllll;
    private /* synthetic */ int au;
    private static /* synthetic */ int[] lllIlIlIIIII;

    private static void lIIIlIllllIIlll() {
        lllIlIIlllll = new String[lllIlIlIIIII[10]];
        r.lllIlIIlllll[r.lllIlIlIIIII[1]] = r."Suggestion null";
        r.lllIlIIlllll[r.lllIlIlIIIII[2]] = r."Coins";
        r.lllIlIIlllll[r.lllIlIlIIIII[3]] = r."Coin Collector";
        r.lllIlIIlllll[r.lllIlIlIIIII[6]] = r."Suggestion empty";
        r.lllIlIIlllll[r.lllIlIlIIIII[7]] = r."Suggestion not null";
        r.lllIlIIlllll[r.lllIlIlIIIII[8]] = r."Unknown";
        r.lllIlIIlllll[r.lllIlIlIIIII[9]] = r."Unknown";
    }

    private static boolean lIIIlIllllIlIIl(Object object) {
        return object == null;
    }

    private static String lIIIlIllllIIlIl(String lllllllllllllllIIllIllIlIIlIlllI, String lllllllllllllllIIllIllIlIIlIllll) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIlIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIlIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIllIlIIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIllIlIIllIIlI.init(lllIlIlIIIII[3], lllllllllllllllIIllIllIlIIllIIll);
            return new String(lllllllllllllllIIllIllIlIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIlIIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllIlIIllIIIl) {
            lllllllllllllllIIllIllIlIIllIIIl.printStackTrace();
            return null;
        }
    }

    private static String lIIIlIllllIIllI(String lllllllllllllllIIllIllIlIlIlIIlI, String lllllllllllllllIIllIllIlIlIIllII) {
        lllllllllllllllIIllIllIlIlIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIlIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllIlIlIlIIII = new StringBuilder();
        char[] lllllllllllllllIIllIllIlIlIIllll = lllllllllllllllIIllIllIlIlIIllII.toCharArray();
        int lllllllllllllllIIllIllIlIlIIlllI = lllIlIlIIIII[1];
        char[] lllllllllllllllIIllIllIlIlIIlIII = lllllllllllllllIIllIllIlIlIlIIlI.toCharArray();
        int lllllllllllllllIIllIllIlIlIIIlll = lllllllllllllllIIllIllIlIlIIlIII.length;
        int lllllllllllllllIIllIllIlIlIIIllI = lllIlIlIIIII[1];
        while (r.lIIIlIlllllIIII(lllllllllllllllIIllIllIlIlIIIllI, lllllllllllllllIIllIllIlIlIIIlll)) {
            char lllllllllllllllIIllIllIlIlIlIIll = lllllllllllllllIIllIllIlIlIIlIII[lllllllllllllllIIllIllIlIlIIIllI];
            lllllllllllllllIIllIllIlIlIlIIII.append((char)(lllllllllllllllIIllIllIlIlIlIIll ^ lllllllllllllllIIllIllIlIlIIllll[lllllllllllllllIIllIllIlIlIIlllI % lllllllllllllllIIllIllIlIlIIllll.length]));
            0;
            ++lllllllllllllllIIllIllIlIlIIlllI;
            ++lllllllllllllllIIllIllIlIlIIIllI;
            0;
            if (-1 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIllIlIlIlIIII);
    }

    private static boolean lIIIlIllllIllIl(int n2) {
        return n2 != 0;
    }

    private static boolean lIIIlIllllIlIlI(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIIlIllllIllll(int n2, int n3) {
        return n2 == n3;
    }

    @Inject
    private r(e e2, SquireMTA squireMTA) {
        super(e2, squireMTA);
        this.au = lllIlIlIIIII[0];
    }

    private static void lIIIlIllllIlIII() {
        lllIlIlIIIII = new int[12];
        r.lllIlIlIIIII[0] = -(0xFFFFBCFF & 0x6F14) & (0xFFFFEFFB & 0x3FFF);
        r.lllIlIlIIIII[1] = (0xD2 ^ 0x8F) & ~(0x60 ^ 0x3D);
        r.lllIlIlIIIII[2] = 1;
        r.lllIlIlIIIII[3] = 2;
        r.lllIlIlIIIII[4] = -(0xFFFFF44E & 0x3BB7) & (0xFFFFB3FF & 0x7F25);
        r.lllIlIlIIIII[5] = -(0xFFFFED63 & 0x7ADF) & (0xFFFFEF57 & 0x7DFE);
        r.lllIlIlIIIII[6] = 3;
        r.lllIlIlIIIII[7] = 83 + 23 - 41 + 91 ^ 108 + 101 - 107 + 50;
        r.lllIlIlIIIII[8] = 0xB3 ^ 0x84 ^ (0x14 ^ 0x26);
        r.lllIlIlIIIII[9] = 1 ^ 7;
        r.lllIlIlIIIII[10] = 0x61 ^ 0x66;
        r.lllIlIlIIIII[11] = 0xCF ^ 0xC7;
    }

    private static boolean lIIIlIllllIlllI(Object object, Object object2) {
        return object == object2;
    }

    @Override
    public Spell L() {
        return SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
    }

    @Override
    public boolean a(Item item) {
        List<String> list = ((e)this.aB).o();
        return list.contains(item.getName());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void lllllllllllllllIIllIllIlIllIIlII;
        r lllllllllllllllIIllIllIlIllIIlIl;
        g g3 = ((e)this.aB).n();
        if (r.lIIIlIllllIlIIl(g3)) {
            System.out.println(lllIlIIlllll[lllIlIlIIIII[1]]);
            Arrays.stream(((e)this.aB).p()).filter(g2 -> g2.s().j().equals(lllIlIIlllll[lllIlIlIIIII[9]])).findFirst().ifPresent(g2 -> g2.r().interact(lllIlIlIIIII[1]));
            return lllIlIlIIIII[2];
        }
        String[] stringArray = new String[lllIlIlIIIII[2]];
        stringArray[r.lllIlIlIIIII[1]] = lllIlIIlllll[lllIlIlIIIII[2]];
        int lllllllllllllllIIllIllIlIllIIIll = Inventory.getCount((boolean)lllIlIlIIIII[2], (String[])stringArray);
        if (r.lIIIlIllllIlIlI(lllllllllllllllIIllIllIlIllIIIll, lllllllllllllllIIllIllIlIllIIlIl.au)) {
            String[] stringArray2 = new String[lllIlIlIIIII[2]];
            stringArray2[r.lllIlIlIIIII[1]] = lllIlIIlllll[lllIlIlIIIII[3]];
            TileObject lllllllllllllllIIllIllIlIllIIIlI = TileObjects.getNearest((String[])stringArray2);
            if (r.lIIIlIllllIlIIl(lllllllllllllllIIllIllIlIllIIIlI)) {
                return lllIlIlIIIII[1];
            }
            lllllllllllllllIIllIllIlIllIIIlI.interact(lllIlIlIIIII[1]);
            return lllIlIlIIIII[2];
        }
        if (r.lIIIlIllllIlIll(lllllllllllllllIIllIllIlIllIIIll)) {
            lllllllllllllllIIllIllIlIllIIlIl.au = Rand.nextInt((int)lllIlIlIIIII[4], (int)lllIlIlIIIII[5]);
        }
        int[] nArray = new int[lllIlIlIIIII[2]];
        nArray[r.lllIlIlIIIII[1]] = ((e)lllllllllllllllIIllIllIlIllIIlIl.aB).l().i();
        Item lllllllllllllllIIllIllIlIllIIIlI = Inventory.getFirst((int[])nArray);
        if (r.lIIIlIllllIllII(lllllllllllllllIIllIllIlIllIIIlI)) {
            Magic.cast((Spell)lllllllllllllllIIllIllIlIllIIlIl.L(), (Item)lllllllllllllllIIllIllIlIllIIIlI);
            return lllIlIlIIIII[2];
        }
        if (r.lIIIlIllllIllIl(Inventory.isFull() ? 1 : 0)) {
            Item lllllllllllllllIIllIllIlIllIIIIl = Inventory.getFirst(item -> Stream.of(d.values()).anyMatch(d2 -> {
                boolean bl;
                if (r.lIIIlIllllIllll(d2.i(), item.getId())) {
                    bl = lllIlIlIIIII[2];
                    0;
                    if (-2 > 0) {
                        return ((0xF4 ^ 0x9D ^ (0xC2 ^ 0xB6)) & (115 + 55 - 65 + 43 ^ 134 + 4 - 93 + 92 ^ -1)) != 0;
                    }
                } else {
                    bl = lllIlIlIIIII[1];
                }
                return bl;
            }));
            if (r.lIIIlIllllIlIIl(lllllllllllllllIIllIllIlIllIIIIl)) {
                return lllIlIlIIIII[1];
            }
            Magic.cast((Spell)lllllllllllllllIIllIllIlIllIIlIl.L(), (Item)lllllllllllllllIIllIllIlIllIIIIl);
            return lllIlIlIIIII[2];
        }
        if (r.lIIIlIllllIlllI((Object)lllllllllllllllIIllIllIlIllIIlII.s(), (Object)d.EMPTY)) {
            System.out.println(lllIlIIlllll[lllIlIlIIIII[6]]);
            Arrays.stream(((e)lllllllllllllllIIllIllIlIllIIlIl.aB).p()).filter(g2 -> g2.s().j().equals(lllIlIIlllll[lllIlIlIIIII[8]])).findFirst().ifPresent(g2 -> g2.r().interact(lllIlIlIIIII[1]));
            return lllIlIlIIIII[2];
        }
        System.out.println(lllIlIIlllll[lllIlIlIIIII[7]]);
        g3.r().interact(lllIlIlIIIII[1]);
        return lllIlIlIIIII[2];
    }

    private static String lIIIlIllllIIlII(String lllllllllllllllIIllIllIlIIlllIll, String lllllllllllllllIIllIllIlIIlllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIlIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIlIIlllIlI.getBytes(StandardCharsets.UTF_8)), lllIlIlIIIII[11]), "DES");
            Cipher lllllllllllllllIIllIllIlIIllllll = Cipher.getInstance("DES");
            lllllllllllllllIIllIllIlIIllllll.init(lllIlIlIIIII[3], lllllllllllllllIIllIllIlIlIIIIII);
            return new String(lllllllllllllllIIllIllIlIIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIlIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllIlIIlllllI) {
            lllllllllllllllIIllIllIlIIlllllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIllllIllII(Object object) {
        return object != null;
    }

    private static boolean lIIIlIllllIlIll(int n2) {
        return n2 == 0;
    }

    static {
        r.lIIIlIllllIlIII();
        r.lIIIlIllllIIlll();
        as = lllIlIlIIIII[4];
        at = lllIlIlIIIII[5];
    }

    private static boolean lIIIlIlllllIIII(int n2, int n3) {
        return n2 < n3;
    }
}

