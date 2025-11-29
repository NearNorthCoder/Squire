package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
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
@TaskDesc(name = "Pray", priority = Integer.MAX_VALUE)
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.A  reason: invalid package */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/A.class */
public class A extends w {
    private static /* synthetic */ int[] lIlIlIllIlIll;

    private static boolean lIlllllllIlllII(Object obj) {
        return obj == null;
    }

    private static boolean lIlllllllIllllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIllllllllIIIII(int i2, int i3) {
        return i2 >= i3;
    }

    private List<Prayer> ad() {
        return lIlllllllIlllll(Vars.getBit(lIlIlIllIlIll[2])) ? List.of(Prayer.EAGLE_EYE, Prayer.STEEL_SKIN) : Collections.singletonList(Prayer.RIGOUR);
    }

    private static boolean lIlllllllIlllll(int i2) {
        return i2 == 0;
    }

    static {
        lIlllllllIllIll();
    }

    private List<Prayer> ae() {
        return lIlllllllIlllll(Vars.getBit(lIlIlIllIlIll[3])) ? List.of(Prayer.ULTIMATE_STRENGTH, Prayer.INCREDIBLE_REFLEXES) : lIllllllllIIIII(Skills.getLevel(Skill.PRAYER), lIlIlIllIlIll[4]) ? Collections.singletonList(Prayer.PIETY) : Collections.singletonList(Prayer.CHIVALRY);
    }

    private static void lIlllllllIllIll() {
        lIlIlIllIlIll = new int[5];
        lIlIlIllIlIll[0] = " ".length();
        lIlIlIllIlIll[1] = (32 ^ 22) & ((121 ^ 79) ^ (-1));
        lIlIlIllIlIll[2] = (-10373) & 15823;
        lIlIlIllIlIll[3] = (-177) & 4085;
        lIlIlIllIlIll[4] = (171 ^ 146) ^ (((103 + 82) - 183) + 125);
    }

    @Inject
    protected A(Client client, C0005f c0005f, SquireVorkathConfig squireVorkathConfig) {
        super(client, c0005f, squireVorkathConfig);
    }

    private List<Prayer> ac() {
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (lIlllllllIlllII(fromSlot)) {
            return ae();
        }
        if (lIlllllllIllllI((WeaponStyle) WeaponMap.StyleMap.getOrDefault(Integer.valueOf(fromSlot.getId()), WeaponStyle.MELEE), WeaponStyle.MELEE)) {
            List<Prayer> ae = ae();
            "".length();
            if ((3 ^ 7) <= 0) {
                return null;
            }
            return ae;
        }
        return ad();
    }

    private static boolean lIlllllllIlllIl(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Override // i.v.k.o.p000.u.s.e.r.a.q.r.t.h.w
    public boolean Q() {
        if (lIlllllllIlllII(this.cg.c(lIlIlIllIlIll[0]))) {
            if (lIlllllllIlllIl(Prayers.anyActive() ? 1 : 0)) {
                Prayers.disableAll();
                return lIlIlIllIlIll[0];
            }
            return lIlIlIllIlIll[1];
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Prayer.PROTECT_FROM_MAGIC);
        "".length();
        arrayList.addAll(ac());
        "".length();
        Prayers.flick(arrayList);
        "".length();
        return lIlIlIllIlIll[0];
    }
}
