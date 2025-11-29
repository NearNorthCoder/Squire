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

import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.CoxManager;
import gg.squire.cox.tasks.GameEnum7;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersConfig;
import gg.squire.cox.SquireChambersPlugin;
import java.util.ArrayList;
import java.util.List;
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
extends CoxManager {

    @Inject
    protected LootChestTask(SquireChambersPlugin squireChambersPlugin, SquireChambersConfig squireChambersConfig, Client client) {
        super(squireChambersPlugin, squireChambersConfig, client);
    }

    private boolean do() {
        int n2;
        Widget widget = Widgets.get((int)2, (int)1, (int)9);
        if (widget != null && (widget.isVisible( != 0) ? 1 : 0)) {
            n2 = 1;
            0;
            if ((7 + 8 - 8 + 149 ^ 116 + 74 - 159 + 121) == 1) {
                return ((2 ^ (0x17 ^ 0x13)) & (0xA2 ^ 0xC6 ^ (0x57 ^ 0x35) ^ -1)) != 0;
            }
        } else {
            n2 = 0;
        }
        return n2 != 0;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 0;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 0;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if (((17 + 54 - -66 + 24 ^ 31 + 104 - 51 + 54) & (135 + 8 - 67 + 81 ^ 25 + 5 - -19 + 133 ^ -1)) == ((0x75 ^ 0x65 ^ (0x7B ^ 0x34)) & (239 + 172 - 205 + 41 ^ 145 + 47 - 154 + 130 ^ -1))) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    @Override
    public EquipmentSetup cj() {
        return null;
    }

    @Override
    public List<Prayer> ci() {
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        Prayer prayer = this.ed.aE();
        if prayer == null {
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
        void var13;
        void var14;
        Widget widget = Widgets.get((int)2, (int)3, (int)0);
        Widget widget2 = Widgets.get((int)2, (int)3, (int)1);
        Widget widget3 = Widgets.get((int)2, (int)3, (int)4);
        if widget != null {
            String[] stringArray = new String[1];
            stringArray[0] = var1[4];
            if ((widget.hasActionstringArray)) {
                widget.interact(var1[5]);
                return 1;
            }
        }
        if var14 != null {
            String[] stringArray = new String[1];
            stringArray[0] = var1[6];
            if ((var14.hasActionstringArray)) {
                var14.interact(var1[3]);
                return 1;
            }
        }
        if var13 != null {
            String[] stringArray = new String[1];
            stringArray[0] = var1[7];
            if ((var13.hasActionstringArray)) {
                var13.interact(var1[8]);
                return 1;
            }
        }
        this.ea.b(1);
        return 0;
    }

    @Override
    public boolean run() {
        aM var15;
        if ((this.eb.pause( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var15.ea.G( != 0) ? 1 : 0)) {
            return 0;
        }
        if ((var15.ec.isInInstancedRegion( == 0) ? 1 : 0)) {
            return 0;
        }
        var15.bS = Players.getLocal();
        if (var15.bS == null) {
            return 0;
        }
        if (!((Object)u.bh() == (Object)u.bh()2)w.GET_OUT) || (var15.bS.getPlane( != 0))) {
            return 0;
        }
        return this.cg();
    }

        catch (Exception var21) {
            var21.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean cg() {
        void var2_2;
        aM var22;
        TileObject var23;
        if ((this.do( != 0) ? 1 : 0)) {
            return this.dn();
        }
        if ((Prayers.anyActive( != 0) ? 1 : 0)) {
            Prayers.disableAll();
        }
        if ((var23 = var22.dq( != null)) && (var23.getWorldY() >= var22.bS.getWorldY())) {
            var23.interact(var1[0]);
            return 1;
        }
        TileObject var24 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var1[var2[10]]) ? 1 : 0)) {
                String[] stringArray = new String[1];
                stringArray[0] = var1[var2[11]];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 1;
                    0;
                    if (3 >= 3) return n2 != 0;
                    return ((30 + 6 - -73 + 109 ^ 127 + 41 - 153 + 130) & (0x88 ^ 0x8C ^ (0xF9 ^ 0xB6) ^ -1)) != 0;
                }
            }
            n2 = 0;
            return n2 != 0;
        });
        if var24 == null {
            return 0;
        }
        var2_2.interact(var1[1]);
        return 1;
    }

        catch (Exception var30) {
            var30.printStackTrace();
            return null;
        }
    }
}

