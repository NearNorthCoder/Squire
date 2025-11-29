package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import gg.squire.basics.sarachnis.SarachnisConfig;
import gg.squire.basics.sarachnis.SquireSarachnis;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import java.util.ArrayList;
import javax.inject.Inject;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.packets.WidgetPackets;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
@TaskDesc(name = "Flicking")
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.bK  reason: invalid package */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/bK.class */
public class bK extends Task {
    private static /* synthetic */ int[] llIlllI;
    private final /* synthetic */ SarachnisConfig gD;
    private final /* synthetic */ SquireSarachnis gE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v105, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v107, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    public boolean run() {
        if (llIllllIl(Skills.getBoostedLevel(Skill.PRAYER))) {
            return llIlllI[0];
        }
        ArrayList<Prayer> arrayList = new ArrayList();
        int[] iArr = new int[llIlllI[1]];
        iArr[llIlllI[0]] = llIlllI[2];
        NPC nearest = NPCs.getNearest(iArr);
        if (llIlllllI(new WorldArea(llIlllI[3], llIlllI[4], llIlllI[5], llIlllI[6], llIlllI[0]).contains(Players.getLocal()) ? 1 : 0)) {
            return llIlllI[0];
        }
        if (llIllllll(nearest)) {
            cS();
            "".length();
            return llIlllI[0];
        }
        if (lllIIIIII(Players.getLocal().getWorldArea().canMelee(Static.getClient().getTopLevelWorldView(), nearest.getWorldArea()) ? 1 : 0)) {
            arrayList.add(Prayer.PROTECT_FROM_MELEE);
            "".length();
            "".length();
            if ((-" ".length()) >= "   ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            arrayList.add(Prayer.PROTECT_FROM_MISSILES);
            "".length();
        }
        if (lllIIIIII(this.gD.flickPiety() ? 1 : 0)) {
            arrayList.add(Prayer.PIETY);
            "".length();
            "".length();
            if ((-" ".length()) == " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            Prayer prayer = Prayer.ULTIMATE_STRENGTH;
            Prayer prayer2 = Prayer.ULTIMATE_STRENGTH;
            arrayList.add(prayer);
            "".length();
            arrayList.add(prayer2);
            "".length();
        }
        for (Prayer prayer3 : arrayList) {
            if (lllIIIIII(Prayers.isEnabled(prayer3) ? 1 : 0)) {
                WidgetPackets.widgetFirstOption(Widgets.get(prayer3.getWidgetInfo()));
            }
            "".length();
            if ((((35 ^ 72) ^ (229 ^ 168)) & (((146 ^ 182) ^ "  ".length()) ^ (-" ".length()))) >= "  ".length()) {
                return "   ".length() & ("   ".length() ^ (-" ".length()));
            }
        }
        for (Prayer prayer4 : arrayList) {
            if (llIlllllI(Prayers.isEnabled(prayer4) ? 1 : 0)) {
                sleep(llIlllI[1]);
            }
            WidgetPackets.widgetFirstOption(Widgets.get(prayer4.getWidgetInfo()));
            "".length();
            if ((5 ^ 1) < "   ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        }
        return llIlllI[1];
    }

    private static boolean llIllllll(Object obj) {
        return obj == null;
    }

    private static boolean lllIIIIIl(int i2, int i3) {
        return i2 < i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private boolean cS() {
        Prayer[] values = Prayer.values();
        int lllIIlllllIllIl = values.length;
        int i2 = llIlllI[0];
        while (lllIIIIIl(i2, lllIIlllllIllIl)) {
            Prayer prayer = values[i2];
            if (lllIIIIII(Prayers.isEnabled(prayer) ? 1 : 0)) {
                Prayers.toggle(prayer);
            }
            i2++;
            "".length();
            if ((-" ".length()) < (-" ".length())) {
                return ((((93 + 105) - 54) + 39) ^ (((67 + 125) - 151) + 110)) & (((18 ^ 38) ^ (99 ^ 119)) ^ (-" ".length()));
            }
        }
        return llIlllI[0];
    }

    private static void llIllllII() {
        llIlllI = new int[7];
        llIlllI[0] = (97 ^ 85) & ((133 ^ 177) ^ (-1));
        llIlllI[1] = " ".length();
        llIlllI[2] = (-1441) & 10153;
        llIlllI[3] = (-24778) & 26607;
        llIlllI[4] = (-20825) & 30713;
        llIlllI[5] = (115 ^ 55) ^ (36 ^ 120);
        llIlllI[6] = 31 ^ 8;
    }

    private static boolean llIllllIl(int i2) {
        return i2 <= 0;
    }

    private static boolean lllIIIIII(int i2) {
        return i2 != 0;
    }

    @Inject
    public bK(SarachnisConfig sarachnisConfig, SquireSarachnis squireSarachnis) {
        this.gD = sarachnisConfig;
        this.gE = squireSarachnis;
    }

    static {
        llIllllII();
    }

    private static boolean llIlllllI(int i2) {
        return i2 == 0;
    }
}
