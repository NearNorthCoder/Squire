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

/* TASK: Alching item -> AlchingTask */
@TaskDesc(name="Alching item", priority=100)
public class v
extends Task {
    private static /* synthetic */ int[] llIIlIIllIIl;
    private static /* synthetic */ String[] llIIlIIllIII;
    private static final /* synthetic */ List<String> ai;

    private static String lllllIIlllIlll(String var1, String var4) {
        try {
            SecretKeySpec var14 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var18 = Cipher.getInstance("Blowfish");
            var18.init(llIIlIIllIIl[3], var14);
            return new String(var18.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
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

    private static String lllllIIlllIlIl(String var20, String var12) {
        try {
            SecretKeySpec var2 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var12.getBytes(StandardCharsets.UTF_8)), llIIlIIllIIl[9]), "DES");
            Cipher var6 = Cipher.getInstance("DES");
            var6.init(llIIlIIllIIl[3], var2);
            return new String(var6.doFinal(Base64.getDecoder().decode(var20.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var3) {
            var3.printStackTrace();
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
        SpellBook.Standard var11 = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        if (v.lllllIIllllIll(var11.canCast() ? 1 : 0)) {
            return llIIlIIllIIl[0];
        }
        Magic.cast((Spell)var2_2);
        item2.interact(llIIlIIllIIl[0], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), item2.getSlot(), WidgetInfo.INVENTORY.getId());
        return llIIlIIllIIl[1];
    }

    private static boolean lllllIIlllllII(int n2, int n3) {
        return n2 < n3;
    }

    private static String lllllIIlllIllI(String var7, String var15) {
        var7 = new String(Base64.getDecoder().decode(var7.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var13 = new StringBuilder();
        char[] var5 = var15.toCharArray();
        int var8 = llIIlIIllIIl[0];
        char[] var16 = var7.toCharArray();
        int var10 = var16.length;
        int var19 = llIIlIIllIIl[0];
        while (v.lllllIIlllllII(var19, var10)) {
            char var17 = var16[var19];
            var13.append((char)(var17 ^ var5[var8 % var5.length]));
            0;
            ++var8;
            ++var19;
            0;
            if ((0x4C ^ 0x2B ^ (0xB ^ 0x69)) > 0) continue;
            return null;
        }
        return String.valueOf(var13);
    }
}

