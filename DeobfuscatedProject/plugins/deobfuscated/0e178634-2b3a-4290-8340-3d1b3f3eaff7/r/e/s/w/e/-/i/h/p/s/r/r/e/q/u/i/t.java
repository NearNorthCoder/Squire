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
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.a;
import r.e.s.w.e.-.i.h.p.s.r.r.e.q.u.i.u;

@TaskDesc(name="Teleporting out", priority=0x7FFFFFFF, blocking=true)
public class t
extends u {
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
        Item llllllllllllllIllIlIIIllIlIIllII;
        void llllllllllllllIllIlIIIllIlIIllll;
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
        Item llllllllllllllIllIlIIIllIlIIllIl = Inventory.getFirst((int[])nArray2);
        if (t.llIIIIIlIlIlIIl(llllllllllllllIllIlIIIllIlIIllIl)) {
            llllllllllllllIllIlIIIllIlIIllIl.interact(lIlIllIlIIllI[lIlIllIlIlIIl[6]]);
            return lIlIllIlIlIIl[2];
        }
        if (t.llIIIIIlIlIIllI((int)llllllllllllllIllIlIIIllIlIIllll) && t.llIIIIIlIlIlIIl(llllllllllllllIllIlIIIllIlIIllII = Inventory.getFirst(item -> item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[3]])))) {
            if (t.llIIIIIlIlIlIII(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption((int)lIlIllIlIlIIl[9]);
                0;
                return lIlIllIlIlIIl[2];
            }
            llllllllllllllIllIlIIIllIlIIllII.interact(lIlIllIlIIllI[lIlIllIlIlIIl[9]]);
            return lIlIllIlIlIIl[2];
        }
        llllllllllllllIllIlIIIllIlIIllII = Inventory.getFirst(item -> {
            boolean bl;
            Item llllllllllllllIllIlIIIllIlIIIlll;
            if ((!t.llIIIIIlIlIIllI(item.hasAction(lIlIllIlIIllI[lIlIllIlIlIIl[14]]::equals) ? 1 : 0) || t.llIIIIIlIlIlIII(item.hasAction(lIlIllIlIIllI[lIlIllIlIlIIl[15]]::equals) ? 1 : 0)) && t.llIIIIIlIlIllII(llllllllllllllIllIlIIIllIlIIIlll.getId(), lIlIllIlIlIIl[16])) {
                bl = lIlIllIlIlIIl[2];
                0;
                if (1 >= 2) {
                    return ((0xA7 ^ 0xA0) & ~(0x5A ^ 0x5D)) != 0;
                }
            } else {
                bl = lIlIllIlIlIIl[1];
            }
            return bl;
        });
        if (t.llIIIIIlIlIlIIl(llllllllllllllIllIlIIIllIlIIllII)) {
            String[] stringArray = new String[lIlIllIlIlIIl[6]];
            stringArray[t.lIlIllIlIlIIl[1]] = lIlIllIlIIllI[lIlIllIlIlIIl[10]];
            stringArray[t.lIlIllIlIlIIl[2]] = lIlIllIlIIllI[lIlIllIlIlIIl[11]];
            llllllllllllllIllIlIIIllIlIIllII.interact(stringArray);
            return lIlIllIlIlIIl[2];
        }
        Iterator llllllllllllllIllIlIIIllIlIIlIll = SpellBook.getCurrent().getCastableSpells().iterator();
        while (t.llIIIIIlIlIlIII(llllllllllllllIllIlIIIllIlIIlIll.hasNext() ? 1 : 0)) {
            Spell llllllllllllllIllIlIIIllIlIIlIlI = (Spell)llllllllllllllIllIlIIIllIlIIlIll.next();
            String llllllllllllllIllIlIIIllIlIIlIIl = llllllllllllllIllIlIIIllIlIIlIlI.toString().toLowerCase();
            if (t.llIIIIIlIlIlIII(llllllllllllllIllIlIIIllIlIIlIIl.contains(lIlIllIlIIllI[lIlIllIlIlIIl[12]]) ? 1 : 0) && t.llIIIIIlIlIIllI(llllllllllllllIllIlIIIllIlIIlIIl.contains(lIlIllIlIIllI[lIlIllIlIlIIl[13]]) ? 1 : 0)) {
                Magic.cast((Spell)llllllllllllllIllIlIIIllIlIIlIlI);
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
        t llllllllllllllIllIlIIIllIllIIIIl;
        if (t.llIIIIIlIlIIllI(this.p.b(lIlIllIlIlIIl[0]) ? 1 : 0)) {
            return lIlIllIlIlIIl[1];
        }
        int llllllllllllllIllIlIIIllIllIIIII = lIlIllIlIlIIl[1];
        if (t.llIIIIIlIlIIlll(llllllllllllllIllIlIIIllIllIIIIl.W.j())) {
            llllllllllllllIllIlIIIllIllIIIII = llllllllllllllIllIlIIIllIllIIIIl.t() ? 1 : 0;
            0;
            if ((0xAE ^ 0xAA) < 1) {
                return ((0xF7 ^ 0xA4) & ~(0x3B ^ 0x68)) != 0;
            }
        } else {
            llllllllllllllIllIlIIIllIllIIIII = llllllllllllllIllIlIIIllIllIIIIl.u() ? 1 : 0;
        }
        if (t.llIIIIIlIlIlIII(llllllllllllllIllIlIIIllIllIIIII)) {
            boolean bl;
            TileItem llllllllllllllIllIlIIIllIlIlllll;
            if (t.llIIIIIlIlIIllI(Inventory.isFull() ? 1 : 0) && t.llIIIIIlIlIIlll(llllllllllllllIllIlIIIllIllIIIIl.W.j()) && t.llIIIIIlIlIlIIl(llllllllllllllIllIlIIIllIlIlllll = (TileItem)TileItems.getAll().stream().max(Comparator.comparingInt(tileItem -> tileItem.getQuantity() * Prices.getItemPrice((int)tileItem.getId()))).orElse(null))) {
                llllllllllllllIllIlIIIllIlIlllll.interact(lIlIllIlIIllI[lIlIllIlIlIIl[1]]);
                return lIlIllIlIlIIl[2];
            }
            if (t.llIIIIIlIlIlIIl(llllllllllllllIllIlIIIllIllIIIIl.W.j())) {
                bl = lIlIllIlIlIIl[2];
                0;
                if (null != null) {
                    return ((0xFC ^ 0x95 ^ (0x3A ^ 0x48)) & (0xCA ^ 0xAF ^ (0xCC ^ 0xB2) ^ -1)) != 0;
                }
            } else {
                bl = lIlIllIlIlIIl[1];
            }
            if (t.llIIIIIlIlIlIII(llllllllllllllIllIlIIIllIllIIIIl.c(bl) ? 1 : 0)) {
                llllllllllllllIllIlIIIllIllIIIIl.f.a(lIlIllIlIlIIl[2]);
            }
            return lIlIllIlIlIIl[2];
        }
        return lIlIllIlIlIIl[1];
    }

    private static String llIIIIIlIIlllII(String llllllllllllllIllIlIIIllIIlllIII, String llllllllllllllIllIlIIIllIIllIlll) {
        llllllllllllllIllIlIIIllIIlllIII = new String(Base64.getDecoder().decode(llllllllllllllIllIlIIIllIIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIIIllIIllIllI = new StringBuilder();
        char[] llllllllllllllIllIlIIIllIIllIlIl = llllllllllllllIllIlIIIllIIllIlll.toCharArray();
        int llllllllllllllIllIlIIIllIIllIlII = lIlIllIlIlIIl[1];
        char[] llllllllllllllIllIlIIIllIIlIlllI = llllllllllllllIllIlIIIllIIlllIII.toCharArray();
        int llllllllllllllIllIlIIIllIIlIllIl = llllllllllllllIllIlIIIllIIlIlllI.length;
        int llllllllllllllIllIlIIIllIIlIllII = lIlIllIlIlIIl[1];
        while (t.llIIIIIlIlIlIlI(llllllllllllllIllIlIIIllIIlIllII, llllllllllllllIllIlIIIllIIlIllIl)) {
            char llllllllllllllIllIlIIIllIIlllIIl = llllllllllllllIllIlIIIllIIlIlllI[llllllllllllllIllIlIIIllIIlIllII];
            llllllllllllllIllIlIIIllIIllIllI.append((char)(llllllllllllllIllIlIIIllIIlllIIl ^ llllllllllllllIllIlIIIllIIllIlIl[llllllllllllllIllIlIIIllIIllIlII % llllllllllllllIllIlIIIllIIllIlIl.length]));
            0;
            ++llllllllllllllIllIlIIIllIIllIlII;
            ++llllllllllllllIllIlIIIllIIlIllII;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(llllllllllllllIllIlIIIllIIllIllI);
    }

    private static String llIIIIIlIIllIlI(String llllllllllllllIllIlIIIllIIIlIllI, String llllllllllllllIllIlIIIllIIIlIIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIllIIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIllIIIlIIll.getBytes(StandardCharsets.UTF_8)), lIlIllIlIlIIl[14]), "DES");
            Cipher llllllllllllllIllIlIIIllIIIllIII = Cipher.getInstance("DES");
            llllllllllllllIllIlIIIllIIIllIII.init(lIlIllIlIlIIl[6], llllllllllllllIllIlIIIllIIIllIIl);
            return new String(llllllllllllllIllIlIIIllIIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIllIIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIllIIIlIlll) {
            llllllllllllllIllIlIIIllIIIlIlll.printStackTrace();
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
        t llllllllllllllIllIlIIIllIlIllIlI;
        int n2 = lIlIllIlIlIIl[1];
        int n3 = Inventory.getAll(item -> {
            int n2;
            if (!t.llIIIIIlIlIIllI(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[27]]) ? 1 : 0) || t.llIIIIIlIlIlIII(item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[28]]) ? 1 : 0)) {
                n2 = lIlIllIlIlIIl[2];
                0;
                if (null != null) {
                    return ((0x46 ^ 0x3C ^ (0xE5 ^ 0xA7)) & (0x47 ^ 0x4A ^ (0xF3 ^ 0xC6) ^ -1)) != 0;
                }
            } else {
                n2 = lIlIllIlIlIIl[1];
            }
            return n2 != 0;
        }).stream().mapToInt(item -> Integer.parseInt(item.getName().split(lIlIllIlIIllI[lIlIllIlIlIIl[24]])[lIlIllIlIlIIl[2]].replace(lIlIllIlIIllI[lIlIllIlIlIIl[25]], lIlIllIlIIllI[lIlIllIlIlIIl[26]]))).sum();
        if (t.llIIIIIlIlIlIlI(n3, this.i.prayDoses())) {
            int llllllllllllllIllIlIIIllIlIllIIl = lIlIllIlIlIIl[2];
        }
        int llllllllllllllIllIlIIIllIlIlIlll = Inventory.getAll(item -> item.getName().contains(lIlIllIlIIllI[lIlIllIlIlIIl[23]])).stream().mapToInt(item -> Integer.parseInt(item.getName().split(lIlIllIlIIllI[lIlIllIlIlIIl[20]])[lIlIllIlIlIIl[2]].replace(lIlIllIlIIllI[lIlIllIlIlIIl[21]], lIlIllIlIIllI[lIlIllIlIlIIl[22]]))).sum();
        if (t.llIIIIIlIlIlIlI(llllllllllllllIllIlIIIllIlIlIlll += Inventory.getCount(item -> {
            String[] stringArray = new String[lIlIllIlIlIIl[2]];
            stringArray[t.lIlIllIlIlIIl[1]] = lIlIllIlIIllI[lIlIllIlIlIIl[19]];
            return item.hasAction(stringArray);
        }), llllllllllllllIllIlIIIllIlIllIlI.i.food())) {
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
                    return ((0x77 ^ 0x6A) & ~(0xA0 ^ 0xBD)) != 0;
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

    private static String llIIIIIlIIllIll(String llllllllllllllIllIlIIIllIIlIIIIl, String llllllllllllllIllIlIIIllIIlIIIlI) {
        try {
            SecretKeySpec llllllllllllllIllIlIIIllIIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIIIllIIlIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIIIllIIlIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIIIllIIlIIlIl.init(lIlIllIlIlIIl[6], llllllllllllllIllIlIIIllIIlIIllI);
            return new String(llllllllllllllIllIlIIIllIIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIIIllIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIIIllIIlIIlII) {
            llllllllllllllIllIlIIIllIIlIIlII.printStackTrace();
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

