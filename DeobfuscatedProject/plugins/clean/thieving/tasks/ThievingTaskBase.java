/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.Prayer
 *  net.runelite.api.Skill
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.Reachable
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.thieving.tasks;

import gg.squire.client.plugins.fw.Task;
import gg.squire.thieving.SquireThieving;
import gg.squire.thieving.SquireThievingConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.Prayer;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.widgets.Prayers;
import gg.squire.thieving.tasks.GameEnum;
import gg.squire.thieving.tasks.GameEnum32;

public abstract class ThievingTaskBase
extends Task {
    protected static final  int q;

    protected final  SquireThievingConfig p;
    protected final  SquireThieving o;

    private static boolean lIllIIlIllIIlII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIllIIlIllIIIII(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIllIIlIlIllIll() {
        lIIllIllllllI = new String[lIIlllIIIlllI[61]];
        a.lIIllIllllllI[a.lIIlllIIIlllI[0]] = "Wear";
        a.lIIllIllllllI[a.lIIlllIIIlllI[2]] = "Pickpocket";
        a.lIIllIllllllI[a.lIIlllIIIlllI[6]] = "Anaire";
        a.lIIllIllllllI[a.lIIlllIIIlllI[3]] = "Aranwe";
        a.lIIllIllllllI[a.lIIlllIIIlllI[9]] = "Aredhel";
        a.lIIllIllllllI[a.lIIlllIIIlllI[1]] = "Caranthir";
        a.lIIllIllllllI[a.lIIlllIIIlllI[10]] = "Celebrian";
        a.lIIllIllllllI[a.lIIlllIIIlllI[11]] = "Celegorm";
        a.lIIllIllllllI[a.lIIlllIIIlllI[12]] = "Cirdan";
        a.lIIllIllllllI[a.lIIlllIIIlllI[13]] = "Curufin";
        a.lIIllIllllllI[a.lIIlllIIIlllI[14]] = "Earwen";
        a.lIIllIllllllI[a.lIIlllIIIlllI[15]] = "Edrahil";
        a.lIIllIllllllI[a.lIIlllIIIlllI[16]] = "Elenwe";
        a.lIIllIllllllI[a.lIIlllIIIlllI[17]] = "Elladan";
        a.lIIllIllllllI[a.lIIlllIIIlllI[18]] = "Enel";
        a.lIIllIllllllI[a.lIIlllIIIlllI[19]] = "Erestor";
        a.lIIllIllllllI[a.lIIlllIIIlllI[20]] = "Enerdhil";
        a.lIIllIllllllI[a.lIIlllIIIlllI[21]] = "Enelye";
        a.lIIllIllllllI[a.lIIlllIIIlllI[22]] = "Feanor";
        a.lIIllIllllllI[a.lIIlllIIIlllI[23]] = "Findis";
        a.lIIllIllllllI[a.lIIlllIIIlllI[24]] = "Finduilas";
        a.lIIllIllllllI[a.lIIlllIIIlllI[25]] = "Fingolfin";
        a.lIIllIllllllI[a.lIIlllIIIlllI[26]] = "Fingon";
        a.lIIllIllllllI[a.lIIlllIIIlllI[27]] = "Galathil";
        a.lIIllIllllllI[a.lIIlllIIIlllI[28]] = "Gelmir";
        a.lIIllIllllllI[a.lIIlllIIIlllI[29]] = "Glorfindel";
        a.lIIllIllllllI[a.lIIlllIIIlllI[30]] = "Guilin";
        a.lIIllIllllllI[a.lIIlllIIIlllI[31]] = "Hendor";
        a.lIIllIllllllI[a.lIIlllIIIlllI[32]] = "Idril";
        a.lIIllIllllllI[a.lIIlllIIIlllI[33]] = "Imin";
        a.lIIllIllllllI[a.lIIlllIIIlllI[34]] = "Iminye";
        a.lIIllIllllllI[a.lIIlllIIIlllI[35]] = "Indis";
        a.lIIllIllllllI[a.lIIlllIIIlllI[36]] = "Ingwe";
        a.lIIllIllllllI[a.lIIlllIIIlllI[37]] = "Ingwion";
        a.lIIllIllllllI[a.lIIlllIIIlllI[38]] = "Lenwe";
        a.lIIllIllllllI[a.lIIlllIIIlllI[39]] = "Lindir";
        a.lIIllIllllllI[a.lIIlllIIIlllI[40]] = "Maeglin";
        a.lIIllIllllllI[a.lIIlllIIIlllI[41]] = "Mahtan";
        a.lIIllIllllllI[a.lIIlllIIIlllI[42]] = "Miriel";
        a.lIIllIllllllI[a.lIIlllIIIlllI[43]] = "Mithrellas";
        a.lIIllIllllllI[a.lIIlllIIIlllI[44]] = "Nellas";
        a.lIIllIllllllI[a.lIIlllIIIlllI[45]] = "Nerdanel";
        a.lIIllIllllllI[a.lIIlllIIIlllI[46]] = "Nimloth";
        a.lIIllIllllllI[a.lIIlllIIIlllI[47]] = "Oropher";
        a.lIIllIllllllI[a.lIIlllIIIlllI[48]] = "Orophin";
        a.lIIllIllllllI[a.lIIlllIIIlllI[49]] = "Saeros";
        a.lIIllIllllllI[a.lIIlllIIIlllI[50]] = "Salgant";
        a.lIIllIllllllI[a.lIIlllIIIlllI[51]] = "Tatie";
        a.lIIllIllllllI[a.lIIlllIIIlllI[52]] = "Thingol";
        a.lIIllIllllllI[a.lIIlllIIIlllI[53]] = "Turgon";
        a.lIIllIllllllI[a.lIIlllIIIlllI[54]] = "Vaire";
        a.lIIllIllllllI[a.lIIlllIIIlllI[55]] = "Arvel";
        a.lIIllIllllllI[a.lIIlllIIIlllI[56]] = "Goreu";
        a.lIIllIllllllI[a.lIIlllIIIlllI[8]] = "Kelyn";
        a.lIIllIllllllI[a.lIIlllIIIlllI[57]] = "Mawrth";
        a.lIIllIllllllI[a.lIIlllIIIlllI[58]] = "Vallessia von Pitt";
        a.lIIllIllllllI[a.lIIlllIIIlllI[60]] = "Pickpocket";
    }

    protected NPC n() {
        String string = lIIllIllllllI[lIIlllIIIlllI[58]];
        String[] stringArray = new String[lIIlllIIIlllI[2]];
        stringArray[a.lIIlllIIIlllI[0]] = string;
        return NPCs.getNearest((String[])stringArray);
    }

    private static int lIllIIlIlIllllI(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    private static boolean lIllIIlIllIIIIl(int n2) {
        return n2 <= 0;
    }

    public boolean run() {
        if (a.lIllIIlIlIlllIl((Object)this.p.method(), (Object)b.PICKPOCKETING)) {
            return lIIlllIIIlllI[0];
        }
        return this.l();
    }

        return String.valueOf(var1);
    }

    static {
        a.lIllIIlIlIlllII();
        a.lIllIIlIlIllIll();
        q = lIIlllIIIlllI[59];
    }

    private static boolean lIllIIlIlIlllll(int n2) {
        return n2 != 0;
    }

    public abstract boolean l();

    protected ThievingTaskBase(SquireThieving squireThieving, SquireThievingConfig squireThievingConfig) {
        this.o = squireThieving;
        this.p = squireThievingConfig;
    }

    /*
     * WARNING - void declaration
     */
    protected void ThievingTaskBase(NPC nPC) {
        void var2;
        double d2 = (double)(Combat.getCurrentHealth() - lIIlllIIIlllI[1]) / (double)Skills.getLevel((Skill)Skill.HITPOINTS) * 100.0;
        if (a.lIllIIlIlIlllll(this.p.redemptionHeal() ? 1 : 0) && a.lIllIIlIllIIIII(Prayers.getPoints(), lIIlllIIIlllI[2])) {
            if (a.lIllIIlIllIIIIl(a.lIllIIlIlIllllI(d2, 10.0))) {
                Prayers.flick(List.of(Prayer.REDEMPTION));

                if ((0x93 ^ 0x97) < 0) {
                    return;
                }
            } else {
                Prayers.disableAll();
            }
        }
        if (a.lIllIIlIlIlllll(Reachable.isInteractable((Locatable)var2) ? 1 : 0)) {
            a var3;
            if (a.lIllIIlIllIIIlI((Object)var3.p.pickpocketTarget(), (Object)f.VYRE) && a.lIllIIlIllIIIll(var2.getWorldLocation().distanceTo((Locatable)Players.getLocal()), lIIlllIIIlllI[3])) {
                int[] nArray = new int[lIIlllIIIlllI[3]];
                nArray[a.lIIlllIIIlllI[0]] = lIIlllIIIlllI[4];
                nArray[a.lIIlllIIIlllI[2]] = lIIlllIIIlllI[5];
                nArray[a.lIIlllIIIlllI[6]] = lIIlllIIIlllI[7];
                Iterator var4 = Inventory.getAll((int[])nArray).iterator();
                while (a.lIllIIlIlIlllll(var4.hasNext() ? 1 : 0)) {
                    Item var5 = (Item)var4.next();
                    var5.interact(lIIllIllllllI[lIIlllIIIlllI[0]]);

                    if (-(0xB6 ^ 0xB3) < 0) continue;
                    return;
                }
            }
            if (a.lIllIIlIlIlllll(var3.p.gemBag() ? 1 : 0) && a.lIllIIlIlIlllll(var3.o.k() ? 1 : 0)) {
                var3.o.c(lIIlllIIIlllI[0]);
            }
            var2.interact(lIIllIllllllI[lIIlllIIIlllI[2]]);

            if (((0x87 ^ 0x82) & ~(0x67 ^ 0x62)) != 0) {
                return;
            }
        } else {
            Movement.walkTo((WorldPoint)var2.getWorldLocation());

        }
    }

    protected NPC m() {
        String[] stringArray = new String[lIIlllIIIlllI[8]];
        stringArray[a.lIIlllIIIlllI[0]] = lIIllIllllllI[lIIlllIIIlllI[6]];
        stringArray[a.lIIlllIIIlllI[2]] = lIIllIllllllI[lIIlllIIIlllI[3]];
        stringArray[a.lIIlllIIIlllI[6]] = lIIllIllllllI[lIIlllIIIlllI[9]];
        stringArray[a.lIIlllIIIlllI[3]] = lIIllIllllllI[lIIlllIIIlllI[1]];
        stringArray[a.lIIlllIIIlllI[9]] = lIIllIllllllI[lIIlllIIIlllI[10]];
        stringArray[a.lIIlllIIIlllI[1]] = lIIllIllllllI[lIIlllIIIlllI[11]];
        stringArray[a.lIIlllIIIlllI[10]] = lIIllIllllllI[lIIlllIIIlllI[12]];
        stringArray[a.lIIlllIIIlllI[11]] = lIIllIllllllI[lIIlllIIIlllI[13]];
        stringArray[a.lIIlllIIIlllI[12]] = lIIllIllllllI[lIIlllIIIlllI[14]];
        stringArray[a.lIIlllIIIlllI[13]] = lIIllIllllllI[lIIlllIIIlllI[15]];
        stringArray[a.lIIlllIIIlllI[14]] = lIIllIllllllI[lIIlllIIIlllI[16]];
        stringArray[a.lIIlllIIIlllI[15]] = lIIllIllllllI[lIIlllIIIlllI[17]];
        stringArray[a.lIIlllIIIlllI[16]] = lIIllIllllllI[lIIlllIIIlllI[18]];
        stringArray[a.lIIlllIIIlllI[17]] = lIIllIllllllI[lIIlllIIIlllI[19]];
        stringArray[a.lIIlllIIIlllI[18]] = lIIllIllllllI[lIIlllIIIlllI[20]];
        stringArray[a.lIIlllIIIlllI[19]] = lIIllIllllllI[lIIlllIIIlllI[21]];
        stringArray[a.lIIlllIIIlllI[20]] = lIIllIllllllI[lIIlllIIIlllI[22]];
        stringArray[a.lIIlllIIIlllI[21]] = lIIllIllllllI[lIIlllIIIlllI[23]];
        stringArray[a.lIIlllIIIlllI[22]] = lIIllIllllllI[lIIlllIIIlllI[24]];
        stringArray[a.lIIlllIIIlllI[23]] = lIIllIllllllI[lIIlllIIIlllI[25]];
        stringArray[a.lIIlllIIIlllI[24]] = lIIllIllllllI[lIIlllIIIlllI[26]];
        stringArray[a.lIIlllIIIlllI[25]] = lIIllIllllllI[lIIlllIIIlllI[27]];
        stringArray[a.lIIlllIIIlllI[26]] = lIIllIllllllI[lIIlllIIIlllI[28]];
        stringArray[a.lIIlllIIIlllI[27]] = lIIllIllllllI[lIIlllIIIlllI[29]];
        stringArray[a.lIIlllIIIlllI[28]] = lIIllIllllllI[lIIlllIIIlllI[30]];
        stringArray[a.lIIlllIIIlllI[29]] = lIIllIllllllI[lIIlllIIIlllI[31]];
        stringArray[a.lIIlllIIIlllI[30]] = lIIllIllllllI[lIIlllIIIlllI[32]];
        stringArray[a.lIIlllIIIlllI[31]] = lIIllIllllllI[lIIlllIIIlllI[33]];
        stringArray[a.lIIlllIIIlllI[32]] = lIIllIllllllI[lIIlllIIIlllI[34]];
        stringArray[a.lIIlllIIIlllI[33]] = lIIllIllllllI[lIIlllIIIlllI[35]];
        stringArray[a.lIIlllIIIlllI[34]] = lIIllIllllllI[lIIlllIIIlllI[36]];
        stringArray[a.lIIlllIIIlllI[35]] = lIIllIllllllI[lIIlllIIIlllI[37]];
        stringArray[a.lIIlllIIIlllI[36]] = lIIllIllllllI[lIIlllIIIlllI[38]];
        stringArray[a.lIIlllIIIlllI[37]] = lIIllIllllllI[lIIlllIIIlllI[39]];
        stringArray[a.lIIlllIIIlllI[38]] = lIIllIllllllI[lIIlllIIIlllI[40]];
        stringArray[a.lIIlllIIIlllI[39]] = lIIllIllllllI[lIIlllIIIlllI[41]];
        stringArray[a.lIIlllIIIlllI[40]] = lIIllIllllllI[lIIlllIIIlllI[42]];
        stringArray[a.lIIlllIIIlllI[41]] = lIIllIllllllI[lIIlllIIIlllI[43]];
        stringArray[a.lIIlllIIIlllI[42]] = lIIllIllllllI[lIIlllIIIlllI[44]];
        stringArray[a.lIIlllIIIlllI[43]] = lIIllIllllllI[lIIlllIIIlllI[45]];
        stringArray[a.lIIlllIIIlllI[44]] = lIIllIllllllI[lIIlllIIIlllI[46]];
        stringArray[a.lIIlllIIIlllI[45]] = lIIllIllllllI[lIIlllIIIlllI[47]];
        stringArray[a.lIIlllIIIlllI[46]] = lIIllIllllllI[lIIlllIIIlllI[48]];
        stringArray[a.lIIlllIIIlllI[47]] = lIIllIllllllI[lIIlllIIIlllI[49]];
        stringArray[a.lIIlllIIIlllI[48]] = lIIllIllllllI[lIIlllIIIlllI[50]];
        stringArray[a.lIIlllIIIlllI[49]] = lIIllIllllllI[lIIlllIIIlllI[51]];
        stringArray[a.lIIlllIIIlllI[50]] = lIIllIllllllI[lIIlllIIIlllI[52]];
        stringArray[a.lIIlllIIIlllI[51]] = lIIllIllllllI[lIIlllIIIlllI[53]];
        stringArray[a.lIIlllIIIlllI[52]] = lIIllIllllllI[lIIlllIIIlllI[54]];
        stringArray[a.lIIlllIIIlllI[53]] = lIIllIllllllI[lIIlllIIIlllI[55]];
        stringArray[a.lIIlllIIIlllI[54]] = lIIllIllllllI[lIIlllIIIlllI[56]];
        stringArray[a.lIIlllIIIlllI[55]] = lIIllIllllllI[lIIlllIIIlllI[8]];
        stringArray[a.lIIlllIIIlllI[56]] = lIIllIllllllI[lIIlllIIIlllI[57]];
        String[] stringArray2 = stringArray;
        return NPCs.getNearest((String[])stringArray2);
    }

    private static boolean lIllIIlIlIlllIl(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIlIllIIlIl(int n2, int n3) {
        return n2 < n3;
    }

    protected boolean o() {
        boolean bl;
        if (a.lIllIIlIllIIlII(Players.getLocal().getGraphic(), lIIlllIIIlllI[59])) {
            bl = lIIlllIIIlllI[2];

            if (3 == 0) {
                return false;
            }
        } else {
            bl = lIIlllIIIlllI[0];
        }
        return bl;
    }

    /*
     * WARNING - void declaration
     */
    protected NPC ThievingTaskBase(f f2) {
        void var6;
        if (a.lIllIIlIllIIIlI((Object)f2, (Object)f.ELF)) {
            return this.m();
        }
        if (a.lIllIIlIllIIIlI(var6, (Object)f.VYRE)) {
            a var7;
            return var7.n();
        }
        return NPCs.getNearest(nPC -> {
            int n2;
            if (a.lIllIIlIlIlllll(f2.v().equals(nPC.getName()) ? 1 : 0) && a.lIllIIlIlIlllll(nPC.hasAction(lIIllIllllllI[lIIlllIIIlllI[60]]::equals) ? 1 : 0)) {
                n2 = lIIlllIIIlllI[2];

                if (3 <= 0) {
                    return false;
                }
            } else {
                n2 = lIIlllIIIlllI[0];
            }
            return n2 != 0;
        });
    }

    private static boolean lIllIIlIllIIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIIlIllIIIlI(Object object, Object object2) {
        return object == object2;
    }
}

