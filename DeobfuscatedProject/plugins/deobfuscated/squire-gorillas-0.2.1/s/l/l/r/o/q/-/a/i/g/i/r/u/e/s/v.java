/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.MenuAction
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package s.l.l.r.o.q.-.a.i.g.i.r.u.e.s;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Alching item", priority=100)
public class v
extends Task {
    private static /* synthetic */ int[] llIIlIIllIIl;
    private static /* synthetic */ String[] llIIlIIllIII;
    private static final /* synthetic */ List<String> ai;

    private static String lllllIIlllIlll(String lllllllllllllllIlIlIIIIIlIIIllII, String lllllllllllllllIlIlIIIIIlIIIllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIlIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIlIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIlIIIIIlIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIlIIIIIlIIlIIII.init(llIIlIIllIIl[3], lllllllllllllllIlIlIIIIIlIIlIIIl);
            return new String(lllllllllllllllIlIlIIIIIlIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIIIlIIIllll) {
            lllllllllllllllIlIlIIIIIlIIIllll.printStackTrace();
            return null;
        }
    }

    private static void lllllIIllllIIl() {
        llIIlIIllIIl = new int[14];
        v.llIIlIIllIIl[0] = (129 + 123 - 124 + 18 ^ 133 + 50 - 93 + 45) & (0xAA ^ 0x8D ^ (0xE ^ 0x3C) ^ -1);
        v.llIIlIIllIIl[1] = 1;
        v.llIIlIIllIIl[2] = 23 + 75 - -7 + 43 ^ 151 + 64 - 191 + 129;
        v.llIIlIIllIIl[3] = 2;
        v.llIIlIIllIIl[4] = 3;
        v.llIIlIIllIIl[5] = 9 ^ 0xD;
        v.llIIlIIllIIl[6] = 0x57 ^ 0x52;
        v.llIIlIIllIIl[7] = 0xAB ^ 0xAD;
        v.llIIlIIllIIl[8] = 0xB5 ^ 0xB2;
        v.llIIlIIllIIl[9] = 0x1C ^ 0x14;
        v.llIIlIIllIIl[10] = 0x57 ^ 0x5E;
        v.llIIlIIllIIl[11] = 39 + 37 - -7 + 44 ^ (0x73 ^ 6);
        v.llIIlIIllIIl[12] = 0x18 ^ 0x13;
        v.llIIlIIllIIl[13] = 0xB4 ^ 0xB8;
    }

    private static boolean lllllIIllllIll(int n2) {
        return n2 == 0;
    }

    static {
        v.lllllIIllllIIl();
        v.lllllIIllllIII();
        String[] stringArray = new String[llIIlIIllIIl[2]];
        stringArray[v.llIIlIIllIIl[0]] = llIIlIIllIII[llIIlIIllIIl[0]];
        stringArray[v.llIIlIIllIIl[1]] = llIIlIIllIII[llIIlIIllIIl[1]];
        stringArray[v.llIIlIIllIIl[3]] = llIIlIIllIII[llIIlIIllIIl[3]];
        stringArray[v.llIIlIIllIIl[4]] = llIIlIIllIII[llIIlIIllIIl[4]];
        stringArray[v.llIIlIIllIIl[5]] = llIIlIIllIII[llIIlIIllIIl[5]];
        stringArray[v.llIIlIIllIIl[6]] = llIIlIIllIII[llIIlIIllIIl[6]];
        stringArray[v.llIIlIIllIIl[7]] = llIIlIIllIII[llIIlIIllIIl[7]];
        stringArray[v.llIIlIIllIIl[8]] = llIIlIIllIII[llIIlIIllIIl[8]];
        stringArray[v.llIIlIIllIIl[9]] = llIIlIIllIII[llIIlIIllIIl[9]];
        stringArray[v.llIIlIIllIIl[10]] = llIIlIIllIII[llIIlIIllIIl[10]];
        stringArray[v.llIIlIIllIIl[11]] = llIIlIIllIII[llIIlIIllIIl[11]];
        stringArray[v.llIIlIIllIIl[12]] = llIIlIIllIII[llIIlIIllIIl[12]];
        stringArray[v.llIIlIIllIIl[13]] = llIIlIIllIII[llIIlIIllIIl[13]];
        ai = List.of(stringArray);
    }

    private static void lllllIIllllIII() {
        llIIlIIllIII = new String[llIIlIIllIIl[2]];
        v.llIIlIIllIII[v.llIIlIIllIIl[0]] = v."Rune platebody";
        v.llIIlIIllIII[v.llIIlIIllIIl[1]] = v."Rune 2h sword";
        v.llIIlIIllIII[v.llIIlIIllIIl[3]] = v."Rune longsword";
        v.llIIlIIllIII[v.llIIlIIllIIl[4]] = v."Rune pickaxe";
        v.llIIlIIllIII[v.llIIlIIllIIl[5]] = v."Rune kiteshield";
        v.llIIlIIllIII[v.llIIlIIllIIl[6]] = v."Rune med helm";
        v.llIIlIIllIII[v.llIIlIIllIIl[7]] = v."Rune platelegs";
        v.llIIlIIllIII[v.llIIlIIllIIl[8]] = v."Rune chainbody";
        v.llIIlIIllIII[v.llIIlIIllIIl[9]] = v."Rune warhammer";
        v.llIIlIIllIII[v.llIIlIIllIIl[10]] = v."Rune plateskirt";
        v.llIIlIIllIII[v.llIIlIIllIIl[11]] = v."Rune battleaxe";
        v.llIIlIIllIII[v.llIIlIIllIIl[12]] = v."Rune sq shield";
        v.llIIlIIllIII[v.llIIlIIllIIl[13]] = v."Dragon scimitar";
    }

    private static boolean lllllIIllllIlI(Object object) {
        return object == null;
    }

    private static String lllllIIlllIlIl(String lllllllllllllllIlIlIIIIIIlllllll, String lllllllllllllllIlIlIIIIIlIIIIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIlIIIIIlIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIlIIIIIlIIIIIII.getBytes(StandardCharsets.UTF_8)), llIIlIIllIIl[9]), "DES");
            Cipher lllllllllllllllIlIlIIIIIlIIIIIll = Cipher.getInstance("DES");
            lllllllllllllllIlIlIIIIIlIIIIIll.init(llIIlIIllIIl[3], lllllllllllllllIlIlIIIIIlIIIIlII);
            return new String(lllllllllllllllIlIlIIIIIlIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIlIIIIIlIIIIIlI) {
            lllllllllllllllIlIlIIIIIlIIIIIlI.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var2_2;
        Item item2 = Inventory.getFirst(item -> ai.contains(item.getName()));
        if (v.lllllIIllllIlI(item2)) {
            return llIIlIIllIIl[0];
        }
        SpellBook.Standard lllllllllllllllIlIlIIIIIlIIlIllI = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (v.lllllIIllllIll(lllllllllllllllIlIlIIIIIlIIlIllI.canCast() ? 1 : 0)) {
            return llIIlIIllIIl[0];
        }
        Magic.cast((Spell)var2_2);
        item2.interact(llIIlIIllIIl[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), item2.getSlot(), WidgetInfo.INVENTORY.getId());
        return llIIlIIllIIl[1];
    }

    private static boolean lllllIIlllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllllIIlllIllI(String lllllllllllllllIlIlIIIIIIlllIIIl, String lllllllllllllllIlIlIIIIIIlllIIII) {
        lllllllllllllllIlIlIIIIIIlllIIIl = new String(Base64.getDecoder().decode(lllllllllllllllIlIlIIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIlIIIIIIllIllll = new StringBuilder();
        char[] lllllllllllllllIlIlIIIIIIllIlllI = lllllllllllllllIlIlIIIIIIlllIIII.toCharArray();
        int lllllllllllllllIlIlIIIIIIllIllIl = llIIlIIllIIl[0];
        char[] lllllllllllllllIlIlIIIIIIllIIlll = lllllllllllllllIlIlIIIIIIlllIIIl.toCharArray();
        int lllllllllllllllIlIlIIIIIIllIIllI = lllllllllllllllIlIlIIIIIIllIIlll.length;
        int lllllllllllllllIlIlIIIIIIllIIlIl = llIIlIIllIIl[0];
        while (v.lllllIIlllllII(lllllllllllllllIlIlIIIIIIllIIlIl, lllllllllllllllIlIlIIIIIIllIIllI)) {
            char lllllllllllllllIlIlIIIIIIlllIIlI = lllllllllllllllIlIlIIIIIIllIIlll[lllllllllllllllIlIlIIIIIIllIIlIl];
            lllllllllllllllIlIlIIIIIIllIllll.append((char)(lllllllllllllllIlIlIIIIIIlllIIlI ^ lllllllllllllllIlIlIIIIIIllIlllI[lllllllllllllllIlIlIIIIIIllIllIl % lllllllllllllllIlIlIIIIIIllIlllI.length]));
            0;
            ++lllllllllllllllIlIlIIIIIIllIllIl;
            ++lllllllllllllllIlIlIIIIIIllIIlIl;
            0;
            if ((0x4C ^ 0x2B ^ (0xB ^ 0x69)) > 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlIlIIIIIIllIllll);
    }
}

