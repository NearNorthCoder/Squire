/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.NPC
 *  net.runelite.api.TileItem
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package u.i.r.d.s.e.r.q.y.a.h.-;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.hydra.SquireAlchemicalHydraConfig;
import gg.squire.hydra.SquireAlchemicalHydraPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.TileItem;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import u.i.r.d.s.e.r.q.y.a.h.-.a;

@TaskDesc(name="Teleport out", priority=250, blocking=true)
public class C
extends Task {
    private final /* synthetic */ SquireAlchemicalHydraConfig bg;
    private static /* synthetic */ String[] llllIlIlIIII;
    private final /* synthetic */ SquireAlchemicalHydraPlugin bf;
    private static /* synthetic */ int[] llllIlIlIlII;
    private final /* synthetic */ a be;

    private static void lIIlIIIIlllIlll() {
        llllIlIlIIII = new String[llllIlIlIlII[13]];
        C.llllIlIlIIII[C.llllIlIlIlII[0]] = C."Take";
        C.llllIlIlIIII[C.llllIlIlIlII[1]] = C."Cannot find tp item";
        C.llllIlIlIIII[C.llllIlIlIlII[2]] = C."Tele to POH";
        C.llllIlIlIIII[C.llllIlIlIlII[3]] = C."Tele to POH";
        C.llllIlIlIIII[C.llllIlIlIlII[4]] = C."Break";
        C.llllIlIlIIII[C.llllIlIlIlII[5]] = C."Tele to POH";
        C.llllIlIlIIII[C.llllIlIlIlII[6]] = C."Teleport";
        C.llllIlIlIIII[C.llllIlIlIlII[7]] = C."Break";
        C.llllIlIlIIII[C.llllIlIlIlII[8]] = C."Tele to POH";
        C.llllIlIlIIII[C.llllIlIlIlII[9]] = C."Teleport";
        C.llllIlIlIIII[C.llllIlIlIlII[10]] = C."Drink";
        C.llllIlIlIIII[C.llllIlIlIlII[11]] = C."anti";
        C.llllIlIlIIII[C.llllIlIlIlII[12]] = C."Eat";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var5_5;
        int lllllllllllllllIIlIlIIIllIlIIlIl;
        int n2;
        int lllllllllllllllIIlIlIIIllIlIIllI;
        int n3;
        C lllllllllllllllIIlIlIIIllIlIlIII;
        if (C.lIIlIIIIllllIIl(this.be.g() ? 1 : 0)) {
            return llllIlIlIlII[0];
        }
        if (C.lIIlIIIIllllIlI(lllllllllllllllIIlIlIIIllIlIlIII.be.k())) {
            return llllIlIlIlII[0];
        }
        NPC lllllllllllllllIIlIlIIIllIlIIlll = lllllllllllllllIIlIlIIIllIlIlIII.be.k().K();
        if (!C.lIIlIIIIllllIll(lllllllllllllllIIlIlIIIllIlIIlll) || C.lIIlIIIIlllllII(lllllllllllllllIIlIlIIIllIlIIlll.isDead() ? 1 : 0)) {
            return llllIlIlIlII[0];
        }
        if (C.lIIlIIIIllllIIl(Inventory.contains(item -> {
            String[] stringArray = new String[llllIlIlIlII[1]];
            stringArray[C.llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[12]];
            return item.hasAction(stringArray);
        }) ? 1 : 0) && C.lIIlIIIIlllllIl(Combat.getMissingHealth(), lllllllllllllllIIlIlIIIllIlIlIII.bg.eatAt())) {
            n3 = llllIlIlIlII[1];
            0;
            if (1 <= 0) {
                return ((0x9D ^ 0x8F ^ 1) & (14 + 100 - -56 + 13 ^ 111 + 32 - 13 + 34 ^ -1)) != 0;
            }
        } else {
            n3 = lllllllllllllllIIlIlIIIllIlIIllI = llllIlIlIlII[0];
        }
        if (C.lIIlIIIIllllIIl(Inventory.contains(item -> {
            int n2;
            String[] stringArray = new String[llllIlIlIlII[1]];
            stringArray[C.llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[10]];
            if (C.lIIlIIIIlllllII(item.hasAction(stringArray) ? 1 : 0) && C.lIIlIIIIlllllII(item.getName().toLowerCase().contains(llllIlIlIIII[llllIlIlIlII[11]]) ? 1 : 0)) {
                n2 = llllIlIlIlII[1];
                0;
                if (null != null) {
                    return ((0x28 ^ 4 ^ (0x3C ^ 0x4B)) & (0x3C ^ 0x55 ^ (0x39 ^ 0xB) ^ -1)) != 0;
                }
            } else {
                n2 = llllIlIlIlII[0];
            }
            return n2 != 0;
        }) ? 1 : 0) && C.lIIlIIIIlllllII(Combat.isPoisoned() ? 1 : 0)) {
            n2 = llllIlIlIlII[1];
            0;
            if (((0xBD ^ 0xB6) & ~(0x2B ^ 0x20)) < -1) {
                return ((0x89 ^ 0x90) & ~(0x8E ^ 0x97)) != 0;
            }
        } else {
            n2 = lllllllllllllllIIlIlIIIllIlIIlIl = llllIlIlIlII[0];
        }
        if (C.lIIlIIIIllllIIl(lllllllllllllllIIlIlIIIllIlIIllI) && C.lIIlIIIIllllIIl(lllllllllllllllIIlIlIIIllIlIIlIl) && C.lIIlIIIIllllIIl(lllllllllllllllIIlIlIIIllIlIlIII.bf.c() ? 1 : 0)) {
            return llllIlIlIlII[0];
        }
        List lllllllllllllllIIlIlIIIllIlIIlII = TileItems.getAll();
        if (C.lIIlIIIIllllIIl(lllllllllllllllIIlIlIIIllIlIIlII.isEmpty() ? 1 : 0) && C.lIIlIIIIllllIIl(Inventory.isFull() ? 1 : 0)) {
            ((TileItem)lllllllllllllllIIlIlIIIllIlIIlII.iterator().next()).interact(llllIlIlIIII[llllIlIlIlII[0]]);
            return llllIlIlIlII[1];
        }
        Item lllllllllllllllIIlIlIIIllIlIIIll = Inventory.getFirst(item -> {
            String[] stringArray = new String[llllIlIlIlII[3]];
            stringArray[C.llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[7]];
            stringArray[C.llllIlIlIlII[1]] = llllIlIlIIII[llllIlIlIlII[8]];
            stringArray[C.llllIlIlIlII[2]] = llllIlIlIIII[llllIlIlIlII[9]];
            return item.hasAction(stringArray);
        });
        if (C.lIIlIIIIllllIlI(lllllllllllllllIIlIlIIIllIlIIIll)) {
            Log.info((String)llllIlIlIIII[llllIlIlIlII[1]]);
            Magic.cast((Spell)SpellBook.Standard.TELEPORT_TO_HOUSE);
            return llllIlIlIlII[1];
        }
        String[] stringArray = new String[llllIlIlIlII[1]];
        stringArray[C.llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[2]];
        if (C.lIIlIIIIlllllII(lllllllllllllllIIlIlIIIllIlIIIll.hasAction(stringArray) ? 1 : 0)) {
            lllllllllllllllIIlIlIIIllIlIIIll.interact(llllIlIlIIII[llllIlIlIlII[3]]);
            return llllIlIlIlII[1];
        }
        String[] stringArray2 = new String[llllIlIlIlII[3]];
        stringArray2[C.llllIlIlIlII[0]] = llllIlIlIIII[llllIlIlIlII[4]];
        stringArray2[C.llllIlIlIlII[1]] = llllIlIlIIII[llllIlIlIlII[5]];
        stringArray2[C.llllIlIlIlII[2]] = llllIlIlIIII[llllIlIlIlII[6]];
        var5_5.interact(stringArray2);
        return llllIlIlIlII[1];
    }

    private static void lIIlIIIIllllIII() {
        llllIlIlIlII = new int[14];
        C.llllIlIlIlII[0] = (0x3B ^ 0x3C) & ~(0x84 ^ 0x83);
        C.llllIlIlIlII[1] = 1;
        C.llllIlIlIlII[2] = 2;
        C.llllIlIlIlII[3] = 3;
        C.llllIlIlIlII[4] = 0x8B ^ 0x8F;
        C.llllIlIlIlII[5] = 0x52 ^ 0x18 ^ (0x30 ^ 0x7F);
        C.llllIlIlIlII[6] = 0xC7 ^ 0xC1;
        C.llllIlIlIlII[7] = 37 + 128 - 92 + 70 ^ 55 + 135 - 179 + 125;
        C.llllIlIlIlII[8] = 0x58 ^ 0x50;
        C.llllIlIlIlII[9] = 0x7B ^ 0x72;
        C.llllIlIlIlII[10] = 0x7B ^ 0x71;
        C.llllIlIlIlII[11] = 0x76 ^ 0x44 ^ (0x9B ^ 0xA2);
        C.llllIlIlIlII[12] = 0x18 ^ 1 ^ (0x3E ^ 0x2B);
        C.llllIlIlIlII[13] = 0x16 ^ 0x1B;
    }

    private static boolean lIIlIIIIllllIll(Object object) {
        return object != null;
    }

    private static boolean lIIlIIIIlllllIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIlIIIIllIIIlI(String lllllllllllllllIIlIlIIIllIIllIIl, String lllllllllllllllIIlIlIIIllIIlIllI) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIIllIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIIllIIlIllI.getBytes(StandardCharsets.UTF_8)), llllIlIlIlII[8]), "DES");
            Cipher lllllllllllllllIIlIlIIIllIIllIll = Cipher.getInstance("DES");
            lllllllllllllllIIlIlIIIllIIllIll.init(llllIlIlIlII[2], lllllllllllllllIIlIlIIIllIIlllII);
            return new String(lllllllllllllllIIlIlIIIllIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIIllIIllIlI) {
            lllllllllllllllIIlIlIIIllIIllIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIlllllII(int n2) {
        return n2 != 0;
    }

    static {
        C.lIIlIIIIllllIII();
        C.lIIlIIIIlllIlll();
    }

    @Inject
    public C(a a2, SquireAlchemicalHydraPlugin squireAlchemicalHydraPlugin, SquireAlchemicalHydraConfig squireAlchemicalHydraConfig) {
        this.be = a2;
        this.bf = squireAlchemicalHydraPlugin;
        this.bg = squireAlchemicalHydraConfig;
    }

    private static String lIIlIIIIllIIIll(String lllllllllllllllIIlIlIIIllIIIlIlI, String lllllllllllllllIIlIlIIIllIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIlIIIllIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIlIIIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIlIlIIIllIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIIlIlIIIllIIIlllI.init(llllIlIlIlII[2], lllllllllllllllIIlIlIIIllIIIllll);
            return new String(lllllllllllllllIIlIlIIIllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIlIlIIIllIIIllIl) {
            lllllllllllllllIIlIlIIIllIIIllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIllllIIl(int n2) {
        return n2 == 0;
    }

    private static String lIIlIIIIllIIlII(String lllllllllllllllIIlIlIIIlIlllllII, String lllllllllllllllIIlIlIIIlIlllIllI) {
        lllllllllllllllIIlIlIIIlIlllllII = new String(Base64.getDecoder().decode(lllllllllllllllIIlIlIIIlIlllllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlIlIIIlIllllIlI = new StringBuilder();
        char[] lllllllllllllllIIlIlIIIlIllllIIl = lllllllllllllllIIlIlIIIlIlllIllI.toCharArray();
        int lllllllllllllllIIlIlIIIlIllllIII = llllIlIlIlII[0];
        char[] lllllllllllllllIIlIlIIIlIlllIIlI = lllllllllllllllIIlIlIIIlIlllllII.toCharArray();
        int lllllllllllllllIIlIlIIIlIlllIIIl = lllllllllllllllIIlIlIIIlIlllIIlI.length;
        int lllllllllllllllIIlIlIIIlIlllIIII = llllIlIlIlII[0];
        while (C.lIIlIIIIllllllI(lllllllllllllllIIlIlIIIlIlllIIII, lllllllllllllllIIlIlIIIlIlllIIIl)) {
            char lllllllllllllllIIlIlIIIlIlllllIl = lllllllllllllllIIlIlIIIlIlllIIlI[lllllllllllllllIIlIlIIIlIlllIIII];
            lllllllllllllllIIlIlIIIlIllllIlI.append((char)(lllllllllllllllIIlIlIIIlIlllllIl ^ lllllllllllllllIIlIlIIIlIllllIIl[lllllllllllllllIIlIlIIIlIllllIII % lllllllllllllllIIlIlIIIlIllllIIl.length]));
            0;
            ++lllllllllllllllIIlIlIIIlIllllIII;
            ++lllllllllllllllIIlIlIIIlIlllIIII;
            0;
            if (-1 <= 1) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIIlIlIIIlIllllIlI);
    }

    private static boolean lIIlIIIIllllllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIlIIIIllllIlI(Object object) {
        return object == null;
    }
}

