/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  kotlin.collections.ArrayDeque
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.widgets.Dialog
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.x_Unknown;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.ArrayDeque;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;

/* TASK: Handling rope swing -> HandlingropeswingTask */
@TaskDesc(name="Handling rope swing")
public class HandlingRopeSwingTask
extends x_Unknown {
    private final /* synthetic */ List<TileObject> aj;
    private static /* synthetic */ String[] lIIllIIllIlll;
    private static /* synthetic */ int[] lIIllIIlllIll;

    @Inject
    protected y(TempleTrekkingPlugin templeTrekkingPlugin) {
        int[] nArray = new int[lIIllIIlllIll[0]];
        nArray[y.lIIllIIlllIll[1]] = lIIllIIlllIll[2];
        super(templeTrekkingPlugin, nArray);
        this.aj = new ArrayDeque();
    }

    private static boolean lIllIIIIIIlIlIl(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIIIlIllI(int n2, int n3) {
        return n2 <= n3;
    }

    private static String lIlIllllllllllI(String var1, String var20) {
        try {
            SecretKeySpec var15 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var20.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var23 = Cipher.getInstance("Blowfish");
            var23.init(lIIllIIlllIll[3], var15);
            return new String(var23.doFinal(Base64.getDecoder().decode(var1.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var9) {
            var9.printStackTrace();
            return null;
        }
    }

    private static void lIllIIIIIIlIIIl() {
        lIIllIIlllIll = new int[18];
        y.lIIllIIlllIll[0] = 1;
        y.lIIllIIlllIll[1] = (0x9A ^ 0x9F) & ~(0x4A ^ 0x4F);
        y.lIIllIIlllIll[2] = 0x69 ^ 0x60;
        y.lIIllIIlllIll[3] = 2;
        y.lIIllIIlllIll[4] = 60 + 121 - 59 + 11 ^ 76 + 87 - 131 + 96;
        y.lIIllIIlllIll[5] = 3;
        y.lIIllIIlllIll[6] = 0xBE ^ 0x90 ^ (0x99 ^ 0xBF);
        y.lIIllIIlllIll[7] = 0x6F ^ 0x6B;
        y.lIIllIIlllIll[8] = 8 ^ 0xE;
        y.lIIllIIlllIll[9] = 112 + 43 - 75 + 83 ^ 119 + 148 - 221 + 118;
        y.lIIllIIlllIll[10] = 0x42 ^ 0x48;
        y.lIIllIIlllIll[11] = 0xAA ^ 0xA1;
        y.lIIllIIlllIll[12] = 8 ^ 0x7D ^ (0xD0 ^ 0xA9);
        y.lIIllIIlllIll[13] = 0x5E ^ 0x37 ^ (0xEF ^ 0x8B);
        y.lIIllIIlllIll[14] = 0x48 ^ 0x46;
        y.lIIllIIlllIll[15] = 0x83 ^ 0x8C;
        y.lIIllIIlllIll[16] = 0xE3 ^ 0x9D ^ (0xF1 ^ 0x9F);
        y.lIIllIIlllIll[17] = 28 + 101 - 80 + 137 ^ 58 + 170 - 177 + 120;
    }

    private static boolean lIllIIIIIIlIlll(Object object) {
        return object != null;
    }

    private static boolean lIllIIIIIIlIlII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIIIIIIlII() {
        lIIllIIllIlll = new String[lIIllIIlllIll[17]];
        y.lIIllIIllIlll[y.lIIllIIlllIll[1]] = y."Hey...that's great...you did a great job...I'll follow you.";
        y.lIIllIIllIlll[y.lIIllIIlllIll[0]] = y."Well that's torn it... Looks like we can't get over this<br>bog. We'll have to go back to Burgh de Rott.";
        y.lIIllIIllIlll[y.lIIllIIlllIll[3]] = y."That's amazing! I'll have to do the same.";
        y.lIIllIIllIlll[y.lIIllIIlllIll[5]] = y."Continue-trek";
        y.lIIllIIllIlll[y.lIIllIIlllIll[7]] = y."Continue-trek";
        y.lIIllIIllIlll[y.lIIllIIlllIll[4]] = y."Swing-from";
        y.lIIllIIllIlll[y.lIIllIIlllIll[8]] = y."Long vine";
        y.lIIllIIllIlll[y.lIIllIIlllIll[9]] = y."Long vine";
        y.lIIllIIllIlll[y.lIIllIIlllIll[6]] = y."Swamp tree branch";
        y.lIIllIIllIlll[y.lIIllIIlllIll[2]] = y."Short vine";
        y.lIIllIIllIlll[y.lIIllIIlllIll[10]] = y."Short vine";
        y.lIIllIIllIlll[y.lIIllIIlllIll[11]] = y."Cut-vine";
        y.lIIllIIllIlll[y.lIIllIIlllIll[12]] = y."Swamp tree";
        y.lIIllIIllIlll[y.lIIllIIlllIll[13]] = y."Cut-vine";
        y.lIIllIIllIlll[y.lIIllIIlllIll[14]] = y."Swamp tree branch";
        y.lIIllIIllIlll[y.lIIllIIlllIll[15]] = y."Swing-from";
        y.lIIllIIllIlll[y.lIIllIIlllIll[16]] = y."Continue-trek";
    }

    private static String lIllIIIIIIIIIlI(String var10, String var6) {
        var10 = new String(Base64.getDecoder().decode(var10.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var17 = new StringBuilder();
        char[] var26 = var6.toCharArray();
        int var3 = lIIllIIlllIll[1];
        char[] var13 = var10.toCharArray();
        int var7 = var13.length;
        int var12 = lIIllIIlllIll[1];
        while (y.lIllIIIIIIllIIl(var12, var7)) {
            char var8 = var13[var12];
            var17.append((char)(var8 ^ var26[var3 % var26.length]));
            0;
            ++var3;
            ++var12;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(var17);
    }

    private static boolean lIllIIIIIIllIII(int n2, int n3) {
        return n2 >= n3;
    }

    @Override
    public boolean z() {
        y var18;
        String string;
        if (y.lIllIIIIIIlIIlI(Dialog.isOpen() ? 1 : 0) && y.lIllIIIIIIlIIll((string = Dialog.getText()).length()) && (!y.lIllIIIIIIlIlII(string.contains(lIIllIIllIlll[lIIllIIlllIll[1]]) ? 1 : 0) || !y.lIllIIIIIIlIlII(string.contains(lIIllIIllIlll[lIIllIIlllIll[0]]) ? 1 : 0) || y.lIllIIIIIIlIIlI(string.contains(lIIllIIllIlll[lIIllIIlllIll[3]]) ? 1 : 0))) {
            return lIIllIIlllIll[1];
        }
        Player var21 = Players.getLocal();
        TileObject var2 = var18.A();
        if (y.lIllIIIIIIlIlIl(var2)) {
            return lIIllIIlllIll[1];
        }
        if (y.lIllIIIIIIlIllI(var21.distanceTo((Locatable)var2), lIIllIIlllIll[4])) {
            var18.aj.clear();
            var2.interact(lIIllIIllIlll[lIIllIIlllIll[5]]);
            return lIIllIIlllIll[0];
        }
        var2 = TileObjects.getNearest(tileObject -> {
            String[] stringArray = new String[lIIllIIlllIll[0]];
            stringArray[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[16]];
            return tileObject.hasAction(stringArray);
        });
        if (y.lIllIIIIIIlIlll(var2) && y.lIllIIIIIIlIllI(var2.distanceTo((Locatable)var21), lIIllIIlllIll[6])) {
            var2.interact(lIIllIIllIlll[lIIllIIlllIll[7]]);
            return lIIllIIlllIll[0];
        }
        TileObject var25 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.lIllIIIIIIlIIlI(tileObject.getName().equals(lIIllIIllIlll[lIIllIIlllIll[14]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIIlllIll[0]];
                stringArray[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[15]];
                if (y.lIllIIIIIIlIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIIlllIll[0];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0xF8 ^ 0xB3 ^ (0x69 ^ 0x17)) & (0x73 ^ 0x5D ^ (0x51 ^ 0x4A) ^ -1)) != 0;
                }
            }
            n2 = lIIllIIlllIll[1];
            return n2 != 0;
        });
        if (y.lIllIIIIIIlIlll(var25)) {
            var25.interact(lIIllIIllIlll[lIIllIIlllIll[4]]);
            return lIIllIIlllIll[0];
        }
        String[] stringArray = new String[lIIllIIlllIll[0]];
        stringArray[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[8]];
        if (y.lIllIIIIIIlIIlI(Inventory.contains((String[])stringArray) ? 1 : 0)) {
            String[] stringArray2 = new String[lIIllIIlllIll[0]];
            stringArray2[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[9]];
            Item var4 = Inventory.getFirst((String[])stringArray2);
            String[] stringArray3 = new String[lIIllIIlllIll[0]];
            stringArray3[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[6]];
            TileObject var5 = TileObjects.getNearest((String[])stringArray3);
            if (y.lIllIIIIIIlIlll(var4) && y.lIllIIIIIIlIlll(var5)) {
                var4.useOn(var5);
                return lIIllIIlllIll[0];
            }
            return lIIllIIlllIll[1];
        }
        String[] stringArray4 = new String[lIIllIIlllIll[0]];
        stringArray4[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[2]];
        if (y.lIllIIIIIIllIII(Inventory.getCount((String[])stringArray4), lIIllIIlllIll[5])) {
            String[] stringArray5 = new String[lIIllIIlllIll[0]];
            stringArray5[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[10]];
            List var4 = Inventory.getAll((String[])stringArray5);
            Item var5 = (Item)var4.get(lIIllIIlllIll[1]);
            Item var14 = (Item)var4.get(lIIllIIlllIll[0]);
            if (y.lIllIIIIIIlIlll(var5) && y.lIllIIIIIIlIlll(var14)) {
                var5.useOn(var14);
                return lIIllIIlllIll[0];
            }
            return lIIllIIlllIll[1];
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (y.lIllIIIIIIlIIlI(tileObject.getName().equals(lIIllIIllIlll[lIIllIIlllIll[12]]) ? 1 : 0)) {
                String[] stringArray = new String[lIIllIIlllIll[0]];
                stringArray[y.lIIllIIlllIll[1]] = lIIllIIllIlll[lIIllIIlllIll[13]];
                if (y.lIllIIIIIIlIIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIIllIIlllIll[0];
                    0;
                    if (-(0x4E ^ 0x4A) < 0) return n2 != 0;
                    return false;
                }
            }
            n2 = lIIllIIlllIll[1];
            return n2 != 0;
        });
        if (y.lIllIIIIIIlIlll(var4)) {
            var4.interact(lIIllIIllIlll[lIIllIIlllIll[11]]);
            return lIIllIIlllIll[0];
        }
        return lIIllIIlllIll[1];
    }

    static {
        y.lIllIIIIIIlIIIl();
        y.lIllIIIIIIIIlII();
    }

    private static boolean lIllIIIIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIIIllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIIIlIIll(int n2) {
        return n2 > 0;
    }

    private static String lIllIIIIIIIIIII(String var19, String var16) {
        try {
            SecretKeySpec var11 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var16.getBytes(StandardCharsets.UTF_8)), lIIllIIlllIll[6]), "DES");
            Cipher var24 = Cipher.getInstance("DES");
            var24.init(lIIllIIlllIll[3], var11);
            return new String(var24.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var22) {
            var22.printStackTrace();
            return null;
        }
    }
}

