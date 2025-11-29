/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.util.WeaponMap
 *  com.openosrs.client.util.WeaponStyle
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.Item
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Equipment
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.vorkath.tasks;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.tasks.VorkathManager;
import gg.squire.vorkath.tasks.VorkathManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.widgets.Prayers;

@TaskDesc(name="Pray", priority=0x7FFFFFFF)
public class PrayTask
extends VorkathManager {

    private static boolean var2(Object object) {
        return object == null;
    }

    private static boolean var3(Object object, Object object2) {
        return object == object2;
    }

    private static boolean var4(int n2, int n3) {
        return n2 >= n3;
    }

    private List<Prayer> ad() {
        if (A.var5(Vars.getBit((int)var1[2]))) {
            return List.of(Prayer.EAGLE_EYE, Prayer.STEEL_SKIN);
        }
        return Collections.singletonList(Prayer.RIGOUR);
    }

    private static boolean var5(int n2) {
        return n2 == 0;
    }

    static {
        A.var6();
    }

    private List<Prayer> ae() {
        if (A.var5(Vars.getBit((int)var1[3]))) {
            return List.of(Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES);
        }
        if (A.var4(Skills.getLevel((SkiSkill.PRAYER), var1[4])) {
            return Collections.singletonList(Prayer.PIETY);
        }
        return Collections.singletonList(Prayer.CHIVALRY);
    }

    private static void var6() {
        var1 = new int[5];
        A.var1[0] = 1;
        A.var1[1] = (0x20 ^ 0x16) & ~(0x79 ^ 0x4F);
        A.var1[2] = 0xFFFFD77B & 0x3DCF;
        A.var1[3] = 0xFFFFFF4F & 0xFF5;
        A.var1[4] = 0xAB ^ 0x92 ^ 103 + 82 - 183 + 125;
    }

    @Inject
    protected PrayTask(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> ac() {
        List<Prayer> list;
        A var7;
        void var8;
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (A.var2(item)) {
            return this.ae();
        }
        WeaponStyle var9 = WeaponMap.StyleMap.getOrDefault(var8.getId(), WeaponStyle.MELEE);
        if (A.var3(var9, WeaponStyle.MELEE)) {
            list = var7.ae();
            0;
            if ((3 ^ 7) <= 0) {
                return null;
            }
        } else {
            list = var7.ad();
        }
        return list;
    }

    private static boolean var10(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean Q() {
        if (A.var2(this.cg.c(var1[0]))) {
            if (A.var10(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return var1[0];
            }
            return var1[1];
        }
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        arrayList.add(Prayer.PROTECT_FROM_MAGIC);
        0;
        arrayList.addAll(this.ac());
        0;
        Prayers.flick(arrayList);
        0;
        return var1[0];
    }
}

