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
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.f_Unknown;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.w_Unknown;
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

/* TASK: Pray -> PrayerTask */
@TaskDesc(name="Pray", priority=0x7FFFFFFF)
public class PrayTask
extends w_Unknown {
    private static /* synthetic */ int[] lIlIlIllIlIll;

    private static boolean lIlllllllIlllII(Object object) {
        return object == null;
    }

    private static boolean lIlllllllIllllI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIllllllllIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private List<Prayer> ad() {
        if (A.lIlllllllIlllll(Vars.getBit((int)lIlIlIllIlIll[2]))) {
            return List.of(Prayer.EAGLE_EYE, Prayer.STEEL_SKIN);
        }
        return Collections.singletonList(Prayer.RIGOUR);
    }

    private static boolean lIlllllllIlllll(int n2) {
        return n2 == 0;
    }

    static {
        A.lIlllllllIllIll();
    }

    private List<Prayer> ae() {
        if (A.lIlllllllIlllll(Vars.getBit((int)lIlIlIllIlIll[3]))) {
            return List.of(Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES);
        }
        if (A.lIllllllllIIIII(Skills.getLevel((Skill)Skill.PRAYER), lIlIlIllIlIll[4])) {
            return Collections.singletonList(Prayer.PIETY);
        }
        return Collections.singletonList(Prayer.CHIVALRY);
    }

    private static void lIlllllllIllIll() {
        lIlIlIllIlIll = new int[5];
        A.lIlIlIllIlIll[0] = 1;
        A.lIlIlIllIlIll[1] = (0x20 ^ 0x16) & ~(0x79 ^ 0x4F);
        A.lIlIlIllIlIll[2] = 0xFFFFD77B & 0x3DCF;
        A.lIlIlIllIlIll[3] = 0xFFFFFF4F & 0xFF5;
        A.lIlIlIllIlIll[4] = 0xAB ^ 0x92 ^ 103 + 82 - 183 + 125;
    }

    @Inject
    protected A(Client client, f f2, SquireVorkathConfig squireVorkathConfig) {
        super(client, f2, squireVorkathConfig);
    }

    /*
     * WARNING - void declaration
     */
    private List<Prayer> ac() {
        List<Prayer> list;
        A var1;
        void var2;
        Item item = Equipment.fromSlot((EquipmentInventorySlot)EquipmentInventorySlot.WEAPON);
        if (A.lIlllllllIlllII(item)) {
            return this.ae();
        }
        WeaponStyle var3 = WeaponMap.StyleMap.getOrDefault(var2.getId(), WeaponStyle.MELEE);
        if (A.lIlllllllIllllI(var3, WeaponStyle.MELEE)) {
            list = var1.ae();
            0;
            if ((3 ^ 7) <= 0) {
                return null;
            }
        } else {
            list = var1.ad();
        }
        return list;
    }

    private static boolean lIlllllllIlllIl(int n2) {
        return n2 != 0;
    }

    @Override
    public boolean Q() {
        if (A.lIlllllllIlllII(this.cg.c(lIlIlIllIlIll[0]))) {
            if (A.lIlllllllIlllIl(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIlIlIllIlIll[0];
            }
            return lIlIlIllIlIll[1];
        }
        ArrayList<Prayer> arrayList = new ArrayList<Prayer>();
        arrayList.add(Prayer.PROTECT_FROM_MAGIC);
        0;
        arrayList.addAll(this.ac());
        0;
        Prayers.flick(arrayList);
        0;
        return lIlIlIllIlIll[0];
    }
}

