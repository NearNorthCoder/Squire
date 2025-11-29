/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.packets.WidgetPackets
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import gg.squire.basics.sarachnis.SarachnisConfig;
import gg.squire.basics.sarachnis.SquireSarachnis;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import javax.inject.Inject;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

/* TASK: Flicking -> FlickingTask */
@TaskDesc(name="Flicking")
public class bK
extends Task {
    private static /* synthetic */ int[] llIlllI;
    private final /* synthetic */ SarachnisConfig gD;
    private final /* synthetic */ SquireSarachnis gE;

    public boolean run() {
        Widget lllIIllllllIIll;
        Prayer lllIIllllllIlII;
        Object lllIIllllllIlIl;
        bK lllIIlllllllIIl;
        if (bK.llIllllIl(Skills.getBoostedLevel((Skill)Skill.PRAYER))) {
            return llIlllI[0];
        }
        ArrayList<Prayer> lllIIlllllllIII = new ArrayList<Prayer>();
        int[] nArray = new int[llIlllI[1]];
        nArray[bK.llIlllI[0]] = llIlllI[2];
        NPC lllIIllllllIlll = NPCs.getNearest((int[])nArray);
        WorldArea lllIIllllllIllI = new WorldArea(llIlllI[3], llIlllI[4], llIlllI[5], llIlllI[6], llIlllI[0]);
        if (bK.llIlllllI(lllIIllllllIllI.contains((Locatable)Players.getLocal()) ? 1 : 0)) {
            return llIlllI[0];
        }
        if (bK.llIllllll(lllIIllllllIlll)) {
            lllIIlllllllIIl.cS();
            0;
            return llIlllI[0];
        }
        if (bK.lllIIIIII(Players.getLocal().getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), lllIIllllllIlll.getWorldArea()) ? 1 : 0)) {
            lllIIlllllllIII.add(Prayer.PROTECT_FROM_MELEE);
            0;
            0;
            if (-1 >= 3) {
                return false;
            }
        } else {
            lllIIlllllllIII.add(Prayer.PROTECT_FROM_MISSILES);
            0;
        }
        if (bK.lllIIIIII(lllIIlllllllIIl.gD.flickPiety() ? 1 : 0)) {
            lllIIllllllIlIl = Prayer.PIETY;
            lllIIlllllllIII.add((Prayer)lllIIllllllIlIl);
            0;
            0;
            if (-1 == 1) {
                return false;
            }
        } else {
            lllIIllllllIlIl = Prayer.ULTIMATE_STRENGTH;
            lllIIllllllIlII = Prayer.ULTIMATE_STRENGTH;
            lllIIlllllllIII.add((Prayer)lllIIllllllIlIl);
            0;
            lllIIlllllllIII.add(lllIIllllllIlII);
            0;
        }
        lllIIllllllIlIl = lllIIlllllllIII.iterator();
        while (bK.lllIIIIII(lllIIllllllIlIl.hasNext() ? 1 : 0)) {
            lllIIllllllIlII = (Prayer)lllIIllllllIlIl.next();
            if (bK.lllIIIIII(Prayers.isEnabled((Prayer)lllIIllllllIlII) ? 1 : 0)) {
                lllIIllllllIIll = Widgets.get((WidgetInfo)lllIIllllllIlII.getWidgetInfo());
                WidgetPackets.widgetFirstOption((Widget)lllIIllllllIIll);
            }
            0;
            if (((0x23 ^ 0x48 ^ (0xE5 ^ 0xA8)) & (0x92 ^ 0xB6 ^ 2 ^ -1)) < 2) continue;
            return (3 & (3 ^ -1)) != 0;
        }
        lllIIllllllIlIl = lllIIlllllllIII.iterator();
        while (bK.lllIIIIII(lllIIllllllIlIl.hasNext() ? 1 : 0)) {
            lllIIllllllIlII = (Prayer)lllIIllllllIlIl.next();
            if (bK.llIlllllI(Prayers.isEnabled((Prayer)lllIIllllllIlII) ? 1 : 0)) {
                lllIIlllllllIIl.sleep(llIlllI[1]);
            }
            lllIIllllllIIll = Widgets.get((WidgetInfo)lllIIllllllIlII.getWidgetInfo());
            WidgetPackets.widgetFirstOption((Widget)lllIIllllllIIll);
            0;
            if ((5 ^ 1) >= 3) continue;
            return false;
        }
        return llIlllI[1];
    }

    private static boolean llIllllll(Object object) {
        return object == null;
    }

    private static boolean lllIIIIIl(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private boolean cS() {
        void lllIIlllllIllIl;
        Prayer[] prayerArray = Prayer.values();
        int n2 = prayerArray.length;
        int lllIIlllllIllII = llIlllI[0];
        while (bK.lllIIIIIl(lllIIlllllIllII, (int)lllIIlllllIllIl)) {
            void lllIIlllllIlllI;
            void lllIIlllllIlIll = lllIIlllllIlllI[lllIIlllllIllII];
            if (bK.lllIIIIII(Prayers.isEnabled((Prayer)lllIIlllllIlIll) ? 1 : 0)) {
                Prayers.toggle((Prayer)lllIIlllllIlIll);
            }
            ++lllIIlllllIllII;
            0;
            if (-1 >= -1) continue;
            return ((93 + 105 - 54 + 39 ^ 67 + 125 - 151 + 110) & (0x12 ^ 0x26 ^ (0x63 ^ 0x77) ^ -1)) != 0;
        }
        return llIlllI[0];
    }

    private static void llIllllII() {
        llIlllI = new int[7];
        bK.llIlllI[0] = (0x61 ^ 0x55) & ~(0x85 ^ 0xB1);
        bK.llIlllI[1] = 1;
        bK.llIlllI[2] = 0xFFFFFA5F & 0x27A9;
        bK.llIlllI[3] = 0xFFFF9F36 & 0x67EF;
        bK.llIlllI[4] = 0xFFFFAEA7 & 0x77F9;
        bK.llIlllI[5] = 0x73 ^ 0x37 ^ (0x24 ^ 0x78);
        bK.llIlllI[6] = 0x1F ^ 8;
    }

    private static boolean llIllllIl(int n2) {
        return n2 <= 0;
    }

    private static boolean lllIIIIII(int n2) {
        return n2 != 0;
    }

    @Inject
    public bK(SarachnisConfig sarachnisConfig, SquireSarachnis squireSarachnis) {
        this.gD = sarachnisConfig;
        this.gE = squireSarachnis;
    }

    static {
        bK.llIllllII();
    }

    private static boolean llIlllllI(int n2) {
        return n2 == 0;
    }
}

