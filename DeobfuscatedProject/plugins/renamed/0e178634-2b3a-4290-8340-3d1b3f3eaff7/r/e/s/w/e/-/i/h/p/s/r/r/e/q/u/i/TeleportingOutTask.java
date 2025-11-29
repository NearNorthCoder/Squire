/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Prices
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.widgets.Dialog
 *  net.unethicalite.api.widgets.Prayers
 */
package r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Prices;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Prayers;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.a_Unknown;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u_Unknown;

/* TASK: Teleporting out -> TeleportOutTask */
@TaskDesc(name="Teleporting out", priority=0x7FFFFFFF, blocking=true)
public class TeleportingOutTask
extends u_Unknown {
    @Inject
    private /* synthetic */ a f;
    private static final /* synthetic */ int ab;
    private static /* synthetic */ String[] lIlIllIlIIllI;
    private static /* synthetic */ int[] lIlIllIlIlIIl;

    static {
        t.llIIIIIlIlIIlIl();
        t.llIIIIIlIIlllll();
        ab = lIlIllIlIlIIl[0];
    }

    /*
     * WARNING - void declaration
     */
    private boolean c(boolean bl) {
        Item var27;
        void var7;
        int[] nArray = new int[lIlIllIlIlIIl[2]];
        nArray[t.lIlIllIlIlIIl[1]] = lIlIllIlIlIIl[5];
        Item item2 = Inventory.getFirst((int[])nArray);
        if (t.llIIIIIlIlIlIIl(item2)) {
            item2.interact(lIlIllIlIIllI[lIlIllIlIlIIl[2]]);
            return lIlIllIlIlIIl[2];
        }
        int[] nArray2 = new int[lIlIllIlIlIIl[6]];
        nArray2[t.lIlIllIlIlIIl[1]] = lIlIllIlIlIIl[7];
        nArray2[t.lIlIllIlIlIIl[2]] = lIlIllIlIlIIl[8];
        Item var24 = Inventory.getFirst((int[])nArray2);
        if (t.llIIIIIlIlIlIIl(var24)) {
            var24.interact(lIlIllIlIIllI[lIlIllIlIlIIl[6]]);
            return lIlIllIlIlIIl[2];
        }
        if (t.llIIIIIlIlIIllI((int)var7) && t.llIIIIIlIlIlIIl(var27 = Inventory.getFirst(item -> item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[3]])))) {
            if (t.llIIIIIlIlIlIII(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIlIllIlIlIIl[9]);
                0;
                return lIlIllIlIlIIl[2];
            }
            var27.interact(lIlIllIlIIllI[lIlIllIlIlIIl[9]]);
            return lIlIllIlIlIIl[2];
        }
        var27 = Inventory.getFirst(item -> {
            boolean bl;
            Item var23;
            if ((!t.llIIIIIlIlIIllI(item.hasAction(lIlIllIlIIllI[lIlIllIlIlIIl[14]]::equals) ? 1 : 0) || t.llIIIIIlIlIlIII(item.hasAction(lIlIllIlIIllI[lIlIllIlIlIIl[15]]::equals) ? 1 : 0)) && t.llIIIIIlIlIllII(var23.getId(), lIlIllIlIlIIl[16])) {
                bl = lIlIllIlIlIIl[2];
                0;
                if (1 >= 2) {
                    return false;
                }
            } else {
                bl = lIlIllIlIlIIl[1];
            }
            return bl;
        });
        if (t.llIIIIIlIlIlIIl(var27)) {
            String[] stringArray = new String[lIlIllIlIlIIl[6]];
            stringArray[t.lIlIllIlIlIIl[1]] = lIlIllIlIIllI[lIlIllIlIlIIl[10]];
            stringArray[t.lIlIllIlIlIIl[2]] = lIlIllIlIIllI[lIlIllIlIlIIl[11]];
            var27.interact(stringArray);
            return lIlIllIlIlIIl[2];
        }
        Iterator var20 = SpellBook.getCurrent().getCastableSpells().iterator();
        while (t.llIIIIIlIlIlIII(var20.hasNext() ? 1 : 0)) {
            Spell var15 = (Spell)var20.next();
            String var19 = var15.toString().toLowerCase();
            if (t.llIIIIIlIlIlIII(var19.contains(lIlIllIlIIllI[lIlIllIlIlIIl[12]]) ? 1 : 0) && t.llIIIIIlIlIIllI(var19.contains(lIlIllIlIIllI[lIlIllIlIlIIl[13]]) ? 1 : 0)) {
                Magic.cast((Spell)var15);
                return lIlIllIlIlIIl[2];
            }
            0;
            if ((0x54 ^ 0x29 ^ (0x53 ^ 0x2B)) > 0) continue;
            return ((47 + 184 - 70 + 64 ^ 15 + 126 - 11 + 52) & (0x18 ^ 0x7E ^ (0xB9 ^ 0x88) ^ -1)) != 0;
        }
        return lIlIllIlIlIIl[1];
    }

    private static void llIIIIIlIIlllll() {
        lIlIllIlIIllI = new String[lIlIllIlIlIIl[29]];
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[1]] = t."Take";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[2]] = t."Break";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[6]] = t."Tele to POH";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[9]] = t."Rub";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[10]] = t."Teleport";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[11]] = t."Break";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[12]] = t."teleport";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[13]] = t."home";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[14]] = t."Teleport";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[15]] = t."Break";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[3]] = t."dueling";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[17]] = t."Prayer";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[18]] = t."restore";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[19]] = t."Eat";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[20]] = t."\\(";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[21]] = t.")";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[22]] = t."";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[23]] = t."Saradomin brew";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[24]] = t."\\(";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[25]] = t.")";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[26]] = t."";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[27]] = t."Prayer";
        t.lIlIllIlIIllI[t.lIlIllIlIlIIl[28]] = t."restore";
    }

    private static boolean llIIIIIlIlIlIIl(Object object) {
        return object != null;
    }

    @Override
    public boolean run() {
        t var17;
        if (t.llIIIIIlIlIIllI(this.p.b(lIlIllIlIlIIl[0]) ? 1 : 0)) {
            return lIlIllIlIlIIl[1];
        }
        int var8 = lIlIllIlIlIIl[1];
        if (t.llIIIIIlIlIIlll(var17.W.j())) {
            var8 = var17.t() ? 1 : 0;
            0;
            if ((0xAE ^ 0xAA) < 1) {
                return false;
            }
        } else {
            var8 = var17.u() ? 1 : 0;
        }
        if (t.llIIIIIlIlIlIII(var8)) {
            boolean bl;
            TileItem var2;
            if (t.llIIIIIlIlIIllI(Inventory.isFull() ? 1 : 0) && t.llIIIIIlIlIIlll(var17.W.j()) && t.llIIIIIlIlIlIIl(var2 = (TileItem)TileItems.getAll().stream().max(Comparator.comparingInt(tileItem -> tileItem.getQuantity() * Prices.getItemPrice((int)tileItem.getId()))).orElse(null))) {
                var2.interact(lIlIllIlIIllI[lIlIllIlIlIIl[1]]);
                return lIlIllIlIlIIl[2];
            }
            if (t.llIIIIIlIlIlIIl(var17.W.j())) {
                bl = lIlIllIlIlIIl[2];
                0;
                
                }
            } else {
                bl = lIlIllIlIlIIl[1];
            }
            if (t.llIIIIIlIlIlIII(var17.c(bl) ? 1 : 0)) {
                var17.f.a(lIlIllIlIlIIl[2]);
            }
            return lIlIllIlIlIIl[2];
        }
        return lIlIllIlIlIIl[1];
    }

    private static String llIIIIIlIIlllII(String var21, String var18) {
        var21 = new String(Base64.getDecoder().decode(var21.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var22 = new StringBuilder();
        char[] var4 = var18.toCharArray();
        int var3 = lIlIllIlIlIIl[1];
        char[] var16 = var21.toCharArray();
        int var25 = var16.length;
        int var5 = lIlIllIlIlIIl[1];
        while (t.llIIIIIlIlIlIlI(var5, var25)) {
            char var26 = var16[var5];
            var22.append((char)(var26 ^ var4[var3 % var4.length]));
            0;
            ++var3;
            ++var5;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(var22);
    }

    private static String llIIIIIlIIllIlI(String var6, String var11) {
        try {
            SecretKeySpec var28 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), lIlIllIlIlIIl[14]), "DES");
            Cipher var9 = Cipher.getInstance("DES");
            var9.init(lIlIllIlIlIIl[6], var28);
            return new String(var9.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var14) {
            var14.printStackTrace();
            return null;
        }
    }

    private static boolean llIIIIIlIlIlIlI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llIIIIIlIlIIlll(Object object) {
        return object == null;
    }

    private boolean t() {
        t var30;
        int n2 = lIlIllIlIlIIl[1];
        int n3 = Inventory.getAll(item -> {
            int n2;
            if (!t.llIIIIIlIlIIllI(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[27]]) ? 1 : 0) || t.llIIIIIlIlIlIII(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[28]]) ? 1 : 0)) {
                n2 = lIlIllIlIlIIl[2];
                0;
                
                }
            } else {
                n2 = lIlIllIlIlIIl[1];
            }
            return n2 != 0;
        }).stream().mapToInt(item -> Integer.parseInt(item.getName().split(lIlIllIlIIllI[lIlIllIlIlIIl[24]])[lIlIllIlIlIIl[2]].replace(lIlIllIlIIllI[lIlIllIlIlIIl[25]], lIlIllIlIIllI[lIlIllIlIlIIl[26]]))).sum();
        if (t.llIIIIIlIlIlIlI(n3, this.i.prayDoses())) {
            int llllllllllllllIllIlIIIllIlIllIIl = lIlIllIlIlIIl[2];
        }
        int var12 = Inventory.getAll(item -> item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[23]])).stream().mapToInt(item -> Integer.parseInt(item.getName().split(lIlIllIlIIllI[lIlIllIlIlIIl[20]])[lIlIllIlIlIIl[2]].replace(lIlIllIlIIllI[lIlIllIlIlIIl[21]], lIlIllIlIIllI[lIlIllIlIlIIl[22]]))).sum();
        if (t.llIIIIIlIlIlIlI(var12 += Inventory.getCount(item -> {
            String[] stringArray = new String[lIlIllIlIlIIl[2]];
            stringArray[t.lIlIllIlIlIIl[1]] = lIlIllIlIIllI[lIlIllIlIlIIl[19]];
            return item.hasAction(stringArray);
        }), var30.i.food())) {
            n2 = lIlIllIlIlIIl[2];
        }
        return n2 != 0;
    }

    private static boolean llIIIIIlIlIlIll(int n2, int n3) {
        return n2 <= n3;
    }

    private boolean u() {
        if (t.llIIIIIlIlIlIll(Prayers.getPoints(), lIlIllIlIlIIl[3]) && t.llIIIIIlIlIIllI(Inventory.contains(item -> {
            int n2;
            if (!t.llIIIIIlIlIIllI(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[17]]) ? 1 : 0) || t.llIIIIIlIlIlIII(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[18]]) ? 1 : 0)) {
                n2 = lIlIllIlIlIIl[2];
                0;
                if ((0x56 ^ 0x52) == 0) {
                    return false;
                }
            } else {
                n2 = lIlIllIlIlIIl[1];
            }
            return n2 != 0;
        }) ? 1 : 0)) {
            return lIlIllIlIlIIl[2];
        }
        if (t.llIIIIIlIlIlIll(Combat.getCurrentHealth(), lIlIllIlIlIIl[4])) {
            return lIlIllIlIlIIl[2];
        }
        return lIlIllIlIlIIl[1];
    }

    @Override
    public boolean p() {
        return lIlIllIlIlIIl[1];
    }

    private static String llIIIIIlIIllIll(String var31, String var10) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var10.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var29 = Cipher.getInstance("Blowfish");
            var29.init(lIlIllIlIlIIl[6], var1);
            return new String(var29.doFinal(Base64.getDecoder().decode(var31.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var13) {
            var13.printStackTrace();
            return null;
        }
    }

    private static void llIIIIIlIlIIlIl() {
        lIlIllIlIlIIl = new int[30];
        t.lIlIllIlIlIIl[0] = 0xFFFFFBE3 & 0x2D7F;
        t.lIlIllIlIlIIl[1] = (0x46 ^ 0x79 ^ (0x94 ^ 0x89)) & (0x49 ^ 0x6B ^ (0x30 ^ 0x14) & ~(0x5B ^ 0x7F) ^ -1);
        t.lIlIllIlIlIIl[2] = 1;
        t.lIlIllIlIlIIl[3] = 0x7D ^ 0x77;
        t.lIlIllIlIlIIl[4] = 0x5D ^ 0x77 ^ (8 ^ 0x3C);
        t.lIlIllIlIlIIl[5] = 0xFFFFFFCD & 0x1F7F;
        t.lIlIllIlIlIIl[6] = 2;
        t.lIlIllIlIlIIl[7] = -(0xFFFFEDD3 & 0x5B2D) & (0xFFFFEF7F & 0x7FBD);
        t.lIlIllIlIlIIl[8] = 0xFFFFBFFF & 0x663E;
        t.lIlIllIlIlIIl[9] = 3;
        t.lIlIllIlIlIIl[10] = 94 + 42 - 50 + 84 ^ 148 + 163 - 242 + 105;
        t.lIlIllIlIlIIl[11] = 0xD ^ 8;
        t.lIlIllIlIlIIl[12] = 136 + 71 - 173 + 108 ^ 21 + 121 - 10 + 4;
        t.lIlIllIlIlIIl[13] = 0xB2 ^ 0x99 ^ (0x66 ^ 0x4A);
        t.lIlIllIlIlIIl[14] = 0x5F ^ 0x57;
        t.lIlIllIlIlIIl[15] = 0x1B ^ 0x5C ^ (0x41 ^ 0xF);
        t.lIlIllIlIlIIl[16] = 0xFFFFFEBF & 0x6FE7;
        t.lIlIllIlIlIIl[17] = 0x61 ^ 0x1A ^ (0xE6 ^ 0x96);
        t.lIlIllIlIlIIl[18] = 0x39 ^ 0x35;
        t.lIlIllIlIlIIl[19] = 0x1F ^ 0x12;
        t.lIlIllIlIlIIl[20] = 0x1E ^ 0x72 ^ (0xE4 ^ 0x86);
        t.lIlIllIlIlIIl[21] = 0x56 ^ 0x71 ^ (0x22 ^ 0xA);
        t.lIlIllIlIlIIl[22] = 0x67 ^ 0x7D ^ (0x93 ^ 0x99);
        t.lIlIllIlIlIIl[23] = 0x6E ^ 0x7F;
        t.lIlIllIlIlIIl[24] = 0x6A ^ 0x78;
        t.lIlIllIlIlIIl[25] = 0x77 ^ 0x25 ^ (0x1C ^ 0x5D);
        t.lIlIllIlIlIIl[26] = 0x3E ^ 0x28 ^ 2;
        t.lIlIllIlIlIIl[27] = 0x19 ^ 0x6E ^ (0x2D ^ 0x4F);
        t.lIlIllIlIlIIl[28] = 0x44 ^ 0x52;
        t.lIlIllIlIlIIl[29] = 0x93 ^ 0x84;
    }

    private static boolean llIIIIIlIlIIllI(int n2) {
        return n2 == 0;
    }

    private static boolean llIIIIIlIlIlIII(int n2) {
        return n2 != 0;
    }

    private static boolean llIIIIIlIlIllII(int n2, int n3) {
        return n2 != n3;
    }
}

