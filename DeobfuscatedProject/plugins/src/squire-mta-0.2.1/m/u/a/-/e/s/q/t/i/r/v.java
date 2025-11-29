/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Rune
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package m.u.a.-.e.s.q.t.i.r;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.mta.SquireMTA;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import m.u.a.-.e.s.q.t.i.r.l;
import m.u.a.-.e.s.q.t.i.r.w;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Rune;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Graveyard room", priority=4, blocking=true)
public class v
extends w<l> {
    private static final /* synthetic */ int az;
    private static final /* synthetic */ int ay;
    private static final /* synthetic */ int aA;
    private static /* synthetic */ int[] lllIlIlIIIlI;
    private static /* synthetic */ String[] lllIlIlIIIIl;

    private static boolean lIIIlIlllllIlIl(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    private void N() {
        void var4_4;
        int lllllllllllllllIIllIllIlIIIIIlIl;
        SpellBook.Standard standard = SpellBook.Standard.BONES_TO_PEACHES;
        int n2 = lllIlIlIIIlI[2];
        if (v.lIIIlIlllllIlll(standard.canCast() ? 1 : 0)) {
            standard = SpellBook.Standard.BONES_TO_BANANAS;
            lllllllllllllllIIllIllIlIIIIIlIl = lllIlIlIIIlI[3];
        }
        int[] nArray = new int[lllIlIlIIIlI[1]];
        nArray[v.lllIlIlIIIlI[0]] = lllllllllllllllIIllIllIlIIIIIlIl;
        if (v.lIIIlIlllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void lllllllllllllllIIllIllIlIIIIIllI;
            Magic.cast((Spell)lllllllllllllllIIllIllIlIIIIIllI);
            return;
        }
        int[] nArray2 = new int[lllIlIlIIIlI[1]];
        nArray2[v.lllIlIlIIIlI[0]] = lllllllllllllllIIllIllIlIIIIIlIl;
        Item lllllllllllllllIIllIllIlIIIIIlII = Inventory.getFirst((int[])nArray2);
        if (!v.lIIIlIllllllIIl(lllllllllllllllIIllIllIlIIIIIlIl, lllIlIlIIIlI[3]) || v.lIIIlIlllllIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            lllllllllllllllIIllIllIlIIIIIlII.interact(lllIlIlIIIIl[lllIlIlIIIlI[5]]);
        }
        String[] stringArray = new String[lllIlIlIIIlI[1]];
        stringArray[v.lllIlIlIIIlI[0]] = lllIlIlIIIIl[lllIlIlIIIlI[6]];
        TileObject lllllllllllllllIIllIllIlIIIIIIll = TileObjects.getNearest((String[])stringArray);
        if (v.lIIIlIlllllIllI(lllllllllllllllIIllIllIlIIIIIIll)) {
            return;
        }
        var4_4.interact(lllIlIlIIIIl[lllIlIlIIIlI[7]]);
    }

    static {
        v.lIIIlIlllllIlII();
        v.lIIIlIlllllIIll();
        az = lllIlIlIIIlI[2];
        ay = lllIlIlIIIlI[3];
        aA = lllIlIlIIIlI[4];
    }

    private static String lIIIlIlllllIIIl(String lllllllllllllllIIllIllIIlllllIIl, String lllllllllllllllIIllIllIIlllllIlI) {
        try {
            SecretKeySpec lllllllllllllllIIllIllIIlllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIllIIlllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIllIIllllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIllIIllllllIl.init(lllIlIlIIIlI[5], lllllllllllllllIIllIllIIlllllllI);
            return new String(lllllllllllllllIIllIllIIllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIllIIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIllIIllllllII) {
            lllllllllllllllIIllIllIIllllllII.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlIllllllIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIIlIllllllIIl(int n2, int n3) {
        return n2 != n3;
    }

    @Override
    public boolean a(Item item) {
        int n2;
        if (v.lIIIlIlllllIlIl(item.getName().toLowerCase().contains(lllIlIlIIIIl[lllIlIlIIIlI[0]]) ? 1 : 0) && v.lIIIlIlllllIlIl(Stream.of(Rune.WATER.getRuneNames()).anyMatch(string -> item.getName().toLowerCase().contains(string.toLowerCase())) ? 1 : 0)) {
            n2 = lllIlIlIIIlI[1];
            "".length();
            if ((19 + 111 - 102 + 101 ^ 122 + 116 - 160 + 55) != (6 + 12 - -161 + 9 ^ 146 + 17 - 5 + 26)) {
                return ((0xC ^ 0x44 ^ (0xE1 ^ 0x8D)) & (0xC2 ^ 0xB9 ^ (0xC ^ 0x53) ^ -" ".length())) != 0;
            }
        } else {
            n2 = lllIlIlIIIlI[0];
        }
        return n2 != 0;
    }

    private static boolean lIIIlIlllllIlll(int n2) {
        return n2 == 0;
    }

    @Override
    public boolean M() {
        TileObject tileObject;
        block5: {
            v lllllllllllllllIIllIllIlIIIIlllI;
            block4: {
                String[] stringArray = new String[lllIlIlIIIlI[1]];
                stringArray[v.lllIlIlIIIlI[0]] = lllIlIlIIIIl[lllIlIlIIIlI[1]];
                tileObject = TileObjects.getNearest((String[])stringArray);
                if (v.lIIIlIlllllIllI(tileObject)) {
                    return lllIlIlIIIlI[0];
                }
                int[] nArray = new int[lllIlIlIIIlI[1]];
                nArray[v.lllIlIlIIIlI[0]] = lllIlIlIIIlI[2];
                if (!v.lIIIlIlllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) break block4;
                int[] nArray2 = new int[lllIlIlIIIlI[1]];
                nArray2[v.lllIlIlIIIlI[0]] = lllIlIlIIIlI[3];
                if (v.lIIIlIlllllIlll(Inventory.contains((int[])nArray2) ? 1 : 0) && !v.lIIIlIllllllIII(((l)lllllllllllllllIIllIllIlIIIIlllI.aB).B(), lllIlIlIIIlI[4])) break block5;
            }
            lllllllllllllllIIllIllIlIIIIlllI.N();
            return lllIlIlIIIlI[1];
        }
        this.b(tileObject);
        return lllIlIlIIIlI[1];
    }

    private static boolean lIIIlIllllllIlI(int n2, int n3) {
        return n2 < n3;
    }

    @Inject
    private v(l l2, SquireMTA squireMTA) {
        super(l2, squireMTA);
    }

    private static boolean lIIIlIlllllIllI(Object object) {
        return object == null;
    }

    private void b(TileObject tileObject) {
        if (v.lIIIlIlllllIlll(Inventory.isFull() ? 1 : 0)) {
            tileObject.interact(lllIlIlIIIlI[0]);
            "".length();
            if (-" ".length() >= "  ".length()) {
                return;
            }
        } else if (v.lIIIlIlllllIlIl(Inventory.isFull() ? 1 : 0) && v.lIIIlIlllllIlIl(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIlIlIIIIl[lllIlIlIIIlI[8]])) ? 1 : 0)) {
            Magic.cast((Spell)SpellBook.Standard.BONES_TO_BANANAS);
        }
    }

    private static String lIIIlIlllllIIlI(String lllllllllllllllIIllIllIIlllIIllI, String lllllllllllllllIIllIllIIlllIlIlI) {
        lllllllllllllllIIllIllIIlllIIllI = new String(Base64.getDecoder().decode(lllllllllllllllIIllIllIIlllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIllIllIIlllIlIIl = new StringBuilder();
        char[] lllllllllllllllIIllIllIIlllIlIII = lllllllllllllllIIllIllIIlllIlIlI.toCharArray();
        int lllllllllllllllIIllIllIIlllIIlll = lllIlIlIIIlI[0];
        char[] lllllllllllllllIIllIllIIlllIIIIl = lllllllllllllllIIllIllIIlllIIllI.toCharArray();
        int lllllllllllllllIIllIllIIlllIIIII = lllllllllllllllIIllIllIIlllIIIIl.length;
        int lllllllllllllllIIllIllIIllIlllll = lllIlIlIIIlI[0];
        while (v.lIIIlIllllllIlI(lllllllllllllllIIllIllIIllIlllll, lllllllllllllllIIllIllIIlllIIIII)) {
            char lllllllllllllllIIllIllIIlllIllII = lllllllllllllllIIllIllIIlllIIIIl[lllllllllllllllIIllIllIIllIlllll];
            lllllllllllllllIIllIllIIlllIlIIl.append((char)(lllllllllllllllIIllIllIIlllIllII ^ lllllllllllllllIIllIllIIlllIlIII[lllllllllllllllIIllIllIIlllIIlll % lllllllllllllllIIllIllIIlllIlIII.length]));
            "".length();
            ++lllllllllllllllIIllIllIIlllIIlll;
            ++lllllllllllllllIIllIllIIllIlllll;
            "".length();
            if ("  ".length() != " ".length()) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIllIllIIlllIlIIl);
    }

    private static void lIIIlIlllllIIll() {
        lllIlIlIIIIl = new String[lllIlIlIIIlI[9]];
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[0]] = v.lIIIlIlllllIIIl("k7CO+yiD9P4=", "RcxNB");
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[1]] = v.lIIIlIlllllIIlI("KT84FgE=", "kPVsr");
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[5]] = v.lIIIlIlllllIIlI("MxIb", "vsoSe");
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[6]] = v.lIIIlIlllllIIIl("p1FjD7zOPKjw/NFOuqpV9A==", "uyhsd");
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[7]] = v.lIIIlIlllllIIlI("CAQyCDAlFQ==", "LaBgC");
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[8]] = v.lIIIlIlllllIIlI("Gy4qEzk=", "yADvJ");
    }

    private static void lIIIlIlllllIlII() {
        lllIlIlIIIlI = new int[10];
        v.lllIlIlIIIlI[0] = (0x71 ^ 0x6D) & ~(0x40 ^ 0x5C);
        v.lllIlIlIIIlI[1] = " ".length();
        v.lllIlIlIIIlI[2] = -(0xFFFFADFD & 0x5307) & (0xFFFFFFFF & 0x1BE7);
        v.lllIlIlIIIlI[3] = -(0xFFFFFFDD & 0x6023) & (0xFFFFEFAF & 0x77FB);
        v.lllIlIlIIIlI[4] = 6 ^ 0x22 ^ (0x12 ^ 0x24);
        v.lllIlIlIIIlI[5] = "  ".length();
        v.lllIlIlIIIlI[6] = "   ".length();
        v.lllIlIlIIIlI[7] = 0x51 ^ 0x55;
        v.lllIlIlIIIlI[8] = 3 + 42 - -94 + 30 ^ 54 + 145 - 75 + 48;
        v.lllIlIlIIIlI[9] = 0x66 ^ 0x60;
    }

    @Override
    public Spell L() {
        return SpellBook.Standard.BONES_TO_BANANAS;
    }
}

