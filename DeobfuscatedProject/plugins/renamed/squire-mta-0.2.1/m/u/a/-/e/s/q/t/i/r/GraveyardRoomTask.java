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
import m.u.a.-.e.s.q.t.i.r.l_Unknown;
import m.u.a.-.e.s.q.t.i.r.w_Unknown;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Rune;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

/* TASK: Graveyard room -> GraveyardroomTask */
@TaskDesc(name="Graveyard room", priority=4, blocking=true)
public class GraveyardRoomTask
extends w_Unknown<l> {
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
        int var5;
        SpellBook.Standard standard = SpellBook.Standard.BONES_TO_PEACHES;
        int n2 = lllIlIlIIIlI[2];
        if (v.lIIIlIlllllIlll(standard.canCast() ? 1 : 0)) {
            standard = SpellBook.Standard.BONES_TO_BANANAS;
            var5 = lllIlIlIIIlI[3];
        }
        int[] nArray = new int[lllIlIlIIIlI[1]];
        nArray[v.lllIlIlIIIlI[0]] = var5;
        if (v.lIIIlIlllllIlll(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void var18;
            Magic.cast((Spell)var18);
            return;
        }
        int[] nArray2 = new int[lllIlIlIIIlI[1]];
        nArray2[v.lllIlIlIIIlI[0]] = var5;
        Item var8 = Inventory.getFirst((int[])nArray2);
        if (!v.lIIIlIllllllIIl(var5, lllIlIlIIIlI[3]) || v.lIIIlIlllllIlIl(Players.getLocal().isMoving() ? 1 : 0)) {
            var8.interact(lllIlIlIIIIl[lllIlIlIIIlI[5]]);
        }
        String[] stringArray = new String[lllIlIlIIIlI[1]];
        stringArray[v.lllIlIlIIIlI[0]] = lllIlIlIIIIl[lllIlIlIIIlI[6]];
        TileObject var6 = TileObjects.getNearest((String[])stringArray);
        if (v.lIIIlIlllllIllI(var6)) {
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

    private static String lIIIlIlllllIIIl(String var17, String var13) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var4 = Cipher.getInstance("Blowfish");
            var4.init(lllIlIlIIIlI[5], var7);
            return new String(var4.doFinal(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
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
            0;
            if ((19 + 111 - 102 + 101 ^ 122 + 116 - 160 + 55) != (6 + 12 - -161 + 9 ^ 146 + 17 - 5 + 26)) {
                return ((0xC ^ 0x44 ^ (0xE1 ^ 0x8D)) & (0xC2 ^ 0xB9 ^ (0xC ^ 0x53) ^ -1)) != 0;
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
            v var9;
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
                if (v.lIIIlIlllllIlll(Inventory.contains((int[])nArray2) ? 1 : 0) && !v.lIIIlIllllllIII(((l)var9.aB).B(), lllIlIlIIIlI[4])) break block5;
            }
            var9.N();
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
            0;
            if (-1 >= 2) {
                return;
            }
        } else if (v.lIIIlIlllllIlIl(Inventory.isFull() ? 1 : 0) && v.lIIIlIlllllIlIl(Inventory.contains(item -> item.getName().toLowerCase().contains(lllIlIlIIIIl[lllIlIlIIIlI[8]])) ? 1 : 0)) {
            Magic.cast((Spell)SpellBook.Standard.BONES_TO_BANANAS);
        }
    }

    private static String lIIIlIlllllIIlI(String var10, String var16) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var1 = new StringBuilder();
        char[] var11 = var16.toCharArray();
        int var2 = lllIlIlIIIlI[0];
        char[] var19 = var10.toCharArray();
        int var3 = var19.length;
        int var15 = lllIlIlIIIlI[0];
        while (v.lIIIlIllllllIlI(var15, var3)) {
            char var14 = var19[var15];
            var1.append((char)(var14 ^ var11[var2 % var11.length]));
            0;
            ++var2;
            ++var15;
            0;
            if (2 != 1) continue;
            return null;
        }
        return String.valueOf(var1);
    }

    private static void lIIIlIlllllIIll() {
        lllIlIlIIIIl = new String[lllIlIlIIIlI[9]];
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[0]] = v."staff";
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[1]] = v."Bones";
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[5]] = v."Eat";
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[6]] = v."Food chute";
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[7]] = v."Deposit";
        v.lllIlIlIIIIl[v.lllIlIlIIIlI[8]] = v."bones";
    }

    private static void lIIIlIlllllIlII() {
        lllIlIlIIIlI = new int[10];
        v.lllIlIlIIIlI[0] = (0x71 ^ 0x6D) & ~(0x40 ^ 0x5C);
        v.lllIlIlIIIlI[1] = 1;
        v.lllIlIlIIIlI[2] = -(0xFFFFADFD & 0x5307) & (0xFFFFFFFF & 0x1BE7);
        v.lllIlIlIIIlI[3] = -(0xFFFFFFDD & 0x6023) & (0xFFFFEFAF & 0x77FB);
        v.lllIlIlIIIlI[4] = 6 ^ 0x22 ^ (0x12 ^ 0x24);
        v.lllIlIlIIIlI[5] = 2;
        v.lllIlIlIIIlI[6] = 3;
        v.lllIlIlIIIlI[7] = 0x51 ^ 0x55;
        v.lllIlIlIIIlI[8] = 3 + 42 - -94 + 30 ^ 54 + 145 - 75 + 48;
        v.lllIlIlIIIlI[9] = 0x66 ^ 0x60;
    }

    @Override
    public Spell L() {
        return SpellBook.Standard.BONES_TO_BANANAS;
    }
}

