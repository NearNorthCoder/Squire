/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Prayer
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 */
package c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aR_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u_Unknown;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.WEnum;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Prayer;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.Widget;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
/* TASK: Loot Chest -> LootchestTask */
@TaskDesc(name="Loot Chest", priority=50000, blocking=true)
public class LootChestTask
extends aR_Unknown {
    private static /* synthetic */ String[] lIlIIlllllII;
    private static /* synthetic */ int[] lIlIIlllllIl;

    private static void llIllIllIlllll() {
        lIlIIlllllIl = new int[13];
        aM.lIlIIlllllIl[0] = (1 ^ 0x59 ^ (0xE7 ^ 0xBA)) & (0x3C ^ 0x26 ^ (0xB ^ 0x14) ^ -1);
        aM.lIlIIlllllIl[1] = 1;
        aM.lIlIIlllllIl[2] = 0xFFFFE3FF & 0x1E1B;
        aM.lIlIIlllllIl[3] = 0x80 ^ 0x85;
        aM.lIlIIlllllIl[4] = 2;
        aM.lIlIIlllllIl[5] = 3;
        aM.lIlIIlllllIl[6] = 0x6F ^ 0x42 ^ (0x1F ^ 0x36);
        aM.lIlIIlllllIl[7] = 0xA8 ^ 0xAE;
        aM.lIlIIlllllIl[8] = 0xAF ^ 0xA8;
        aM.lIlIIlllllIl[9] = 114 + 104 - 95 + 4 ^ (0xC1 ^ 0xB5);
        aM.lIlIIlllllIl[10] = 0x72 ^ 0x7A;
        aM.lIlIIlllllIl[11] = 0xB7 ^ 0xBE;
        aM.lIlIIlllllIl[12] = 0x98 ^ 0x92;
    }

    private static void llIllIllIllllI() {
        lIlIIlllllII = new String[lIlIIlllllIl[12]];
        aM.lIlIIlllllII[aM.lIlIIlllllIl[0]] = aM."Quick-pass";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[1]] = aM."Search";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[4]] = aM."Take";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[5]] = aM."Take";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[6]] = aM."Take";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[3]] = aM."Take";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[7]] = aM."Take";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[8]] = aM."Take";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[10]] = aM."Ancient chest";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[11]] = aM."Search";
    }

    @Inject
    protected aM(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private static boolean llIllIlllIIIlI(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        aM.llIllIllIlllll();
        aM.llIllIllIllllI();
    }

    private static boolean llIllIlllIIlIl(Object object, Object object2) {
        return object == object2;
    }

    private boolean do() {
        int n2;
        Widget widget = Widgets.get((int)lIlIIlllllIl[2], (int)lIlIIlllllIl[1], (int)lIlIIlllllIl[9]);
        if (aM.llIllIlllIIIIl(widget) && aM.llIllIlllIIIII(widget.isVisible() ? 1 : 0)) {
            n2 = lIlIIlllllIl[1];
            0;
            if ((7 + 8 - 8 + 149 ^ 116 + 74 - 159 + 121) == 1) {
                return ((2 ^ (0x17 ^ 0x13)) & (0xA2 ^ 0xC6 ^ (0x57 ^ 0x35) ^ -1)) != 0;
            }
        } else {
            n2 = lIlIIlllllIl[0];
        }
        return n2 != 0;
    }

    private static boolean llIllIlllIIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static String llIllIllIlllII(String var3, String var8) {
        var3 = new String(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var22 = var8.toCharArray();
        int var23 = lIlIIlllllIl[0];
        char[] var11 = var3.toCharArray();
        int var14 = var11.length;
        int var20 = lIlIIlllllIl[0];
        while (aM.llIllIlllIIllI(var20, var14)) {
            char var13 = var11[var20];
            var4.append((char)(var13 ^ var22[var23 % var22.length]));
            0;
            ++var23;
            ++var20;
            0;
            if (((17 + 54 - -66 + 24 ^ 31 + 104 - 51 + 54) & (135 + 8 - 67 + 81 ^ 25 + 5 - -19 + 133 ^ -1)) == ((0x75 ^ 0x65 ^ (0x7B ^ 0x34)) & (239 + 172 - 205 + 41 ^ 145 + 47 - 154 + 130 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    private static boolean llIllIlllIIlII(int n2) {
        return n2 == 0;
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if (aM.llIllIlllIIIll(prayer)) {
            prayer = Prayer.PROTECT_FROM_MAGIC;
        }
        List list = Prayers.getOffensive();
        arrayList.add(prayer);
        0;
        arrayList.addAll(list);
        0;
        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private boolean dn() {
        void var18;
        void var25;
        Widget widget = Widgets.get((int)lIlIIlllllIl[2], (int)lIlIIlllllIl[3], (int)lIlIIlllllIl[0]);
        Widget widget2 = Widgets.get((int)lIlIIlllllIl[2], (int)lIlIIlllllIl[3], (int)lIlIIlllllIl[1]);
        Widget widget3 = Widgets.get((int)lIlIIlllllIl[2], (int)lIlIIlllllIl[3], (int)lIlIIlllllIl[4]);
        if (aM.llIllIlllIIIIl(widget)) {
            String[] stringArray = new String[lIlIIlllllIl[1]];
            stringArray[aM.lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[4]];
            if (aM.llIllIlllIIIII(widget.hasAction(stringArray) ? 1 : 0)) {
                widget.interact(lIlIIlllllII[lIlIIlllllIl[5]]);
                return lIlIIlllllIl[1];
            }
        }
        if (aM.llIllIlllIIIIl(var25)) {
            String[] stringArray = new String[lIlIIlllllIl[1]];
            stringArray[aM.lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[6]];
            if (aM.llIllIlllIIIII(var25.hasAction(stringArray) ? 1 : 0)) {
                var25.interact(lIlIIlllllII[lIlIIlllllIl[3]]);
                return lIlIIlllllIl[1];
            }
        }
        if (aM.llIllIlllIIIIl(var18)) {
            String[] stringArray = new String[lIlIIlllllIl[1]];
            stringArray[aM.lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[7]];
            if (aM.llIllIlllIIIII(var18.hasAction(stringArray) ? 1 : 0)) {
                var18.interact(lIlIIlllllII[lIlIIlllllIl[8]]);
                return lIlIIlllllIl[1];
            }
        }
        this.ea.b(lIlIIlllllIl[1]);
        return lIlIIlllllIl[0];
    }

    private static boolean llIllIlllIIIIl(Object object) {
        return object != null;
    }

    private static boolean llIllIlllIIIII(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean run() {
        aM var17;
        if (aM.llIllIlllIIIII(this.eb.pause() ? 1 : 0)) {
            return lIlIIlllllIl[0];
        }
        if (aM.llIllIlllIIIII(var17.ea.G() ? 1 : 0)) {
            return lIlIIlllllIl[0];
        }
        if (aM.llIllIlllIIlII(var17.ec.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIlllllIl[0];
        }
        var17.bS = Players.getLocal();
        if (aM.llIllIlllIIIll(var17.bS)) {
            return lIlIIlllllIl[0];
        }
        if (!aM.llIllIlllIIlIl((Object)u.bh(), (Object)w.GET_OUT) || aM.llIllIlllIIIII(var17.bS.getPlane())) {
            return lIlIIlllllIl[0];
        }
        return this.cg();
    }

    private static String llIllIllIllIll(String var19, String var2) {
        try {
            SecretKeySpec var24 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var2.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var16 = Cipher.getInstance("Blowfish");
            var16.init(lIlIIlllllIl[4], var24);
            return new String(var16.doFinal(Base64.getDecoder().decode(var19.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var1) {
            var1.printStackTrace();
            return null;
        }
    }

    private static boolean llIllIlllIIIll(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        aM var7;
        TileObject var15;
        if (aM.llIllIlllIIIII(this.do() ? 1 : 0)) {
            return this.dn();
        }
        if (aM.llIllIlllIIIII(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
        }
        if (aM.llIllIlllIIIIl(var15 = var7.dq()) && aM.llIllIlllIIIlI(var15.getWorldY(), var7.bS.getWorldY())) {
            var15.interact(lIlIIlllllII[lIlIIlllllIl[0]]);
            return lIlIIlllllIl[1];
        }
        TileObject var6 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aM.llIllIlllIIIII(tileObject.getName().equals(lIlIIlllllII[lIlIIlllllIl[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlllllIl[1]];
                stringArray[aM.lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[11]];
                if (aM.llIllIlllIIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlllllIl[1];
                    0;
                    if (3 >= 3) return n2 != 0;
                    return ((30 + 6 - -73 + 109 ^ 127 + 41 - 153 + 130) & (0x88 ^ 0x8C ^ (0xF9 ^ 0xB6) ^ -1)) != 0;
                }
            }
            n2 = lIlIIlllllIl[0];
            return n2 != 0;
        });
        if (aM.llIllIlllIIIll(var6)) {
            return lIlIIlllllIl[0];
        }
        var2_2.interact(lIlIIlllllII[lIlIIlllllIl[1]]);
        return lIlIIlllllIl[1];
    }

    private static String llIllIllIlllIl(String var9, String var5) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var5.getBytes(StandardCharsets.UTF_8)), lIlIIlllllIl[10]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(lIlIIlllllIl[4], var21);
            return new String(var10.doFinal(Base64.getDecoder().decode(var9.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }
}

