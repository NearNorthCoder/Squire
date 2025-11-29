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
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.CoxTaskBase;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.GameEnum32;
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
@TaskDesc(name="Loot Chest", priority=50000, blocking=true)
public class LootChestTask
extends CoxTaskBase {

    private static void llIllIllIllllI() {
        lIlIIlllllII = new String[lIlIIlllllIl[12]];
        aM.lIlIIlllllII[aM.lIlIIlllllIl[0]] = "Quick-pass";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[1]] = "Search";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[4]] = "Take";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[5]] = "Take";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[6]] = "Take";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[3]] = "Take";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[7]] = "Take";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[8]] = "Take";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[10]] = "Ancient chest";
        aM.lIlIIlllllII[aM.lIlIIlllllIl[11]] = "Search";
    }

    @Inject
    protected LootChestTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
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

        return String.valueOf(var1);
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

        arrayList.addAll(list);

        return arrayList;
    }

    /*
     * WARNING - void declaration
     */
    private boolean dn() {
        void var2;
        void var3;
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
        if (aM.llIllIlllIIIIl(var3)) {
            String[] stringArray = new String[lIlIIlllllIl[1]];
            stringArray[aM.lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[6]];
            if (aM.llIllIlllIIIII(var3.hasAction(stringArray) ? 1 : 0)) {
                var3.interact(lIlIIlllllII[lIlIIlllllIl[3]]);
                return lIlIIlllllIl[1];
            }
        }
        if (aM.llIllIlllIIIIl(var2)) {
            String[] stringArray = new String[lIlIIlllllIl[1]];
            stringArray[aM.lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[7]];
            if (aM.llIllIlllIIIII(var2.hasAction(stringArray) ? 1 : 0)) {
                var2.interact(lIlIIlllllII[lIlIIlllllIl[8]]);
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
        aM var4;
        if (aM.llIllIlllIIIII(this.eb.pause() ? 1 : 0)) {
            return lIlIIlllllIl[0];
        }
        if (aM.llIllIlllIIIII(var4.ea.G() ? 1 : 0)) {
            return lIlIIlllllIl[0];
        }
        if (aM.llIllIlllIIlII(var4.ec.isInInstancedRegion() ? 1 : 0)) {
            return lIlIIlllllIl[0];
        }
        var4.bS = Players.getLocal();
        if (aM.llIllIlllIIIll(var4.bS)) {
            return lIlIIlllllIl[0];
        }
        if (!aM.llIllIlllIIlIl((Object)u.bh(), (Object)w.GET_OUT) || aM.llIllIlllIIIII(var4.bS.getPlane())) {
            return lIlIIlllllIl[0];
        }
        return this.cg();
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
        aM var5;
        TileObject var6;
        if (aM.llIllIlllIIIII(this.do() ? 1 : 0)) {
            return this.dn();
        }
        if (aM.llIllIlllIIIII(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
        }
        if (aM.llIllIlllIIIIl(var6 = var5.dq()) && aM.llIllIlllIIIlI(var6.getWorldY(), var5.bS.getWorldY())) {
            var6.interact(lIlIIlllllII[lIlIIlllllIl[0]]);
            return lIlIIlllllIl[1];
        }
        TileObject var7 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (aM.llIllIlllIIIII(tileObject.getName().equals(lIlIIlllllII[lIlIIlllllIl[10]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIlllllIl[1]];
                stringArray[aM.lIlIIlllllIl[0]] = lIlIIlllllII[lIlIIlllllIl[11]];
                if (aM.llIllIlllIIIII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIlllllIl[1];

                    if (3 >= 3) return n2 != 0;
                    return ((30 + 6 - -73 + 109 ^ 127 + 41 - 153 + 130) & (0x88 ^ 0x8C ^ (0xF9 ^ 0xB6) ^ -1)) != 0;
                }
            }
            n2 = lIlIIlllllIl[0];
            return n2 != 0;
        });
        if (aM.llIllIlllIIIll(var7)) {
            return lIlIIlllllIl[0];
        }
        var2_2.interact(lIlIIlllllII[lIlIIlllllIl[1]]);
        return lIlIIlllllIl[1];
    }

}

