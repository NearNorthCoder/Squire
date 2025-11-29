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
package gg.squire.mta.tasks;

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
import gg.squire.mta.tasks.GameEnum15;
import gg.squire.mta.tasks.EHelper;
import m.u.a.-.e.s.q.t.i.r.g;
import gg.squire.mta.tasks.MtaTaskBase;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Enchantment room", priority=6, blocking=true)
public class EnchantmentRoomTask
extends MtaTaskBase<e> {
    private static final  int at;
    private static final  int as;
    
    private  int au;

    private static void lIIIlIllllIIlll() {
        lllIlIIlllll = new String[lllIlIlIIIII[10]];
        r.lllIlIIlllll[r.lllIlIlIIIII[1]] = "Suggestion null";
        r.lllIlIIlllll[r.lllIlIlIIIII[2]] = "Coins";
        r.lllIlIIlllll[r.lllIlIlIIIII[3]] = "Coin Collector";
        r.lllIlIIlllll[r.lllIlIlIIIII[6]] = "Suggestion empty";
        r.lllIlIIlllll[r.lllIlIlIIIII[7]] = "Suggestion not null";
        r.lllIlIIlllll[r.lllIlIlIIIII[8]] = "Unknown";
        r.lllIlIIlllll[r.lllIlIlIIIII[9]] = "Unknown";
    }

    private static boolean lIIIlIllllIlIIl(Object object) {
        return object == null;
    }

        return String.valueOf(var1);
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
    private EnchantmentRoomTask(e e2, SquireMTA squireMTA) {
        super(e2, squireMTA);
        this.au = lllIlIlIIIII[0];
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
        List<String> list = ((EHelper) his.aB).o();
        return list.contains(item.getName());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean M() {
        void var2;
        r var3;
        g g3 = ((EHelper) his.aB).n();
        if (r.lIIIlIllllIlIIl(g3)) {
            System.out.println(lllIlIIlllll[lllIlIlIIIII[1]]);
            Arrays.stream(((EHelper) his.aB).p()).filter(g2 -> g2.s().j().equals(lllIlIIlllll[lllIlIlIIIII[9]])).findFirst().ifPresent(g2 -> g2.EnchantmentRoomTask().interact(lllIlIlIIIII[1]));
            return lllIlIlIIIII[2];
        }
        String[] stringArray = new String[lllIlIlIIIII[2]];
        stringArray[r.lllIlIlIIIII[1]] = lllIlIIlllll[lllIlIlIIIII[2]];
        int var4 = Inventory.getCount((boolean)lllIlIlIIIII[2], (String[])stringArray);
        if (r.lIIIlIllllIlIlI(var4, var3.au)) {
            String[] stringArray2 = new String[lllIlIlIIIII[2]];
            stringArray2[r.lllIlIlIIIII[1]] = lllIlIIlllll[lllIlIlIIIII[3]];
            TileObject var5 = TileObjects.getNearest((String[])stringArray2);
            if (r.lIIIlIllllIlIIl(var5)) {
                return lllIlIlIIIII[1];
            }
            var5.interact(lllIlIlIIIII[1]);
            return lllIlIlIIIII[2];
        }
        if (r.lIIIlIllllIlIll(var4)) {
            var3.au = Rand.nextInt((int)lllIlIlIIIII[4], (int)lllIlIlIIIII[5]);
        }
        int[] nArray = new int[lllIlIlIIIII[2]];
        nArray[r.lllIlIlIIIII[1]] = ((EHelper) ar3.aB).l().i();
        Item var5 = Inventory.getFirst((int[])nArray);
        if (r.lIIIlIllllIllII(var5)) {
            Magic.cast((Spell)var3.L(), (Item)var5);
            return lllIlIlIIIII[2];
        }
        if (r.lIIIlIllllIllIl(Inventory.isFull() ? 1 : 0)) {
            Item var6 = Inventory.getFirst(item -> Stream.of(d.values()).anyMatch(d2 -> {
                boolean bl;
                if (r.lIIIlIllllIllll(d2.i(), item.getId())) {
                    bl = lllIlIlIIIII[2];

                } else {
                    bl = lllIlIlIIIII[1];
                }
                return bl;
            }));
            if (r.lIIIlIllllIlIIl(var6)) {
                return lllIlIlIIIII[1];
            }
            Magic.cast((Spell)var3.L(), (Item)var6);
            return lllIlIlIIIII[2];
        }
        if (r.lIIIlIllllIlllI((Object)var2.s(), (Object)d.EMPTY)) {
            System.out.println(lllIlIIlllll[lllIlIlIIIII[6]]);
            Arrays.stream(((EHelper) ar3.aB).p()).filter(g2 -> g2.s().j().equals(lllIlIIlllll[lllIlIlIIIII[8]])).findFirst().ifPresent(g2 -> g2.EnchantmentRoomTask().interact(lllIlIlIIIII[1]));
            return lllIlIlIIIII[2];
        }
        System.out.println(lllIlIIlllll[lllIlIlIIIII[7]]);
        g3.EnchantmentRoomTask().interact(lllIlIlIIIII[1]);
        return lllIlIlIIIII[2];
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

