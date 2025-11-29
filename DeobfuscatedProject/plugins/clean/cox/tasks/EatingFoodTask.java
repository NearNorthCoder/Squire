/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum38;
import gg.squire.cox.tasks.CoxManager;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import gg.squire.cox.tasks.CoxManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.cox.SquireChambersPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@TaskDesc(name="Eating food", priority=30000)
public class EatingFoodTask
extends Task {
    private final  SquireChambersPlugin cH;

     boolean cE;
     int cD;
    private final  k cG;

    private boolean ct() {
        if (ae.llIlIIllllllll(u.be() ? 1 : 0)) {
            return lIlIIIIIIllI[0];
        }
        Player var1 = Players.getLocal();
        if (!ae.llIlIIlllllllI(u.bg(), lIlIIIIIIllI[4]) || ae.llIlIIlllllIlI(var1.getPlane())) {
            return lIlIIIIIIllI[0];
        }
        TileObject var2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (ae.llIlIIlllllIlI(tileObject.getName().contains(lIlIIIIIIlIl[lIlIIIIIIllI[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIllI[2]];
                stringArray[ae.lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[4]];
                if (ae.llIlIIlllllIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIIIIllI[2];

                    if ((2 & ~2) != -1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIIIIllI[0];
            return n2 != 0;
        });
        if (ae.llIlIlIIIIIIII(var2)) {
            return lIlIIIIIIllI[0];
        }
        if (ae.llIlIlIIIIIIIl(var1.getWorldY(), var2.getWorldY())) {
            return lIlIIIIIIllI[0];
        }
        return lIlIIIIIIllI[2];
    }

    private static boolean llIlIIllllllIl(int n2, int n3) {
        return n2 < n3;
    }

    private static void llIlIIllllIlll() {
        lIlIIIIIIlIl = new String[lIlIIIIIIllI[14]];
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[0]] = "Drink";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[2]] = "Drink";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[7]] = "Vasa";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[1]] = "Mystical barrier";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[4]] = "Quick-pass";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[3]] = "Super restore";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[8]] = "Revitalisation";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[9]] = "Drink";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[10]] = "Saradomin brew";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[11]] = "Drink";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[12]] = "Xeric's aid";
        ae.lIlIIIIIIlIl[ae.lIlIIIIIIllI[13]] = "Drink";
    }

    protected boolean cx() {
        boolean bl2;
        if (ae.llIlIIlllllllI(Skills.getBoostedLevel((Skill)Skill.ATTACK) + lIlIIIIIIllI[3], Skills.getLevel((Skill)Skill.ATTACK))) {
            bl2 = lIlIIIIIIllI[2];

            if ((0x67 ^ 0x63) < -1) {
                return (1 & ~1) != 0;
            }
        } else {
            bl2 = lIlIIIIIIllI[0];
        }
        return bl2;
    }

    private static boolean llIlIlIIIIIIII(Object object) {
        return object == null;
    }

    private static boolean llIlIlIIIIIIll(Object object, Object object2) {
        return object == object2;
    }

    private static boolean llIlIIlllllIlI(int n2) {
        return n2 != 0;
    }

    private static boolean llIlIIllllllll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIIIIIIlI(Object object) {
        return object != null;
    }

    private static boolean llIlIIllllllII(int n2) {
        return n2 < 0;
    }

    private static boolean llIlIIlllllIll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var3;
        ae var4;
        int n2 = this.cA();
        if (ae.llIlIIlllllIlI(this.ct() ? 1 : 0) && ae.llIlIIlllllIlI(this.cx() ? 1 : 0) && ae.llIlIIlllllIll(Combat.getCurrentHealth(), n2) && ae.llIlIIllllllII(ae.llIlIIlllllIIl(Combat.getHealthPercent(), 95.0)) && ae.llIlIIllllllIl(this.cG.aJ(), lIlIIIIIIllI[1]) && ae.llIlIIlllllIll(this.cG.aK(), lIlIIIIIIllI[2])) {
            this.cy();

            return lIlIIIIIIllI[2];
        }
        if (ae.llIlIIlllllIlI(var4.cx() ? 1 : 0) && ae.llIlIIlllllllI(var4.cD, lIlIIIIIIllI[1])) {
            var4.cE = lIlIIIIIIllI[0];
        }
        if (ae.llIlIIllllllIl(Combat.getCurrentHealth(), (int)var3)) {
            if (ae.llIlIIllllllll(var4.cE ? 1 : 0)) {
                var4.cD = lIlIIIIIIllI[0];
            }
            var4.cE = lIlIIIIIIllI[2];
        }
        if (ae.llIlIIllllllll(var4.cE ? 1 : 0)) {
            return lIlIIIIIIllI[0];
        }
        if (ae.llIlIIllllllIl(var4.cD, lIlIIIIIIllI[1])) {
            var4.cy();

            var4.cD += lIlIIIIIIllI[2];
            return lIlIIIIIIllI[2];
        }
        this.cz();

        return lIlIIIIIIllI[2];
    }

    private static boolean llIlIIlllllllI(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean llIlIlIIIIIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    static {
        ae.llIlIIlllllIII();
        ae.llIlIIllllIlll();
    }

    protected boolean cy() {
        Item var5;
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (ae.llIlIIlllllIlI(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[12]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIIIIIIllI[2]];
                stringArray[ae.lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[13]];
                if (ae.llIlIIlllllIlI(item.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIIIIllI[2];

                    if (((0x85 ^ 0xAD) & ~(0x26 ^ 0xE)) > -1) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIIIIIIllI[0];
            return n2 != 0;
        });
        if (ae.llIlIlIIIIIIII(item2)) {
            var5 = Inventory.getFirst(item -> {
                int n2;
                if (ae.llIlIIlllllIlI(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[10]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIlIIIIIIllI[2]];
                    stringArray[ae.lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[11]];
                    if (ae.llIlIIlllllIlI(item.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIlIIIIIIllI[2];

                        if (1 < 3) return n2 != 0;
                        return ((0x2B ^ 0x7D ^ (0x76 ^ 0x6B)) & (0x4C ^ 7 ^ (0xFD ^ 0xB4) & ~(0xFD ^ 0xB4) ^ -1)) != 0;
                    }
                }
                n2 = lIlIIIIIIllI[0];
                return n2 != 0;
            });
        }
        if (ae.llIlIlIIIIIIII(var5)) {
            return lIlIIIIIIllI[0];
        }
        item2.interact(lIlIIIIIIlIl[lIlIIIIIIllI[0]]);
        this.sleep(lIlIIIIIIllI[1]);
        return lIlIIIIIIllI[2];
    }

    protected boolean cz() {
        Item item2 = Inventory.getFirst(item -> {
            int n2;
            if (!ae.llIlIIllllllll(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[3]]) ? 1 : 0) || ae.llIlIIlllllIlI(item.getName().startsWith(lIlIIIIIIlIl[lIlIIIIIIllI[8]]) ? 1 : 0)) {
                Item var6;
                String[] stringArray = new String[lIlIIIIIIllI[2]];
                stringArray[ae.lIlIIIIIIllI[0]] = lIlIIIIIIlIl[lIlIIIIIIllI[9]];
                if (ae.llIlIIlllllIlI(var6.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIIIIIIllI[2];

                    if (-2 <= 0) return n2 != 0;
                    return ((0x65 ^ 0x71 ^ (0x17 ^ 0x32)) & (0x50 ^ 0x6F ^ (0x40 ^ 0x4E) ^ -1)) != 0;
                }
            }
            n2 = lIlIIIIIIllI[0];
            return n2 != 0;
        });
        if (ae.llIlIlIIIIIIII(item2)) {
            return lIlIIIIIIllI[0];
        }
        item2.interact(lIlIIIIIIlIl[lIlIIIIIIllI[2]]);
        this.sleep(lIlIIIIIIllI[1]);
        return lIlIIIIIIllI[2];
    }

    /*
     * WARNING - void declaration
     */
    private int cA() {
        void var7;
        n n2 = this.cH.L();
        if (!ae.llIlIlIIIIIIlI(n2) || ae.llIlIIllllllll(n2.a((Locatable)Players.getLocal()) ? 1 : 0)) {
            return lIlIIIIIIllI[5];
        }
        N var8 = var7.aM();
        if (ae.llIlIlIIIIIIll((Object)var8, (Object)N.VASA) && ae.llIlIlIIIIIIlI(NPCs.getNearest(nPC -> nPC.getName().contains(lIlIIIIIIlIl[lIlIIIIIIllI[7]])))) {
            return lIlIIIIIIllI[6];
        }
        if (ae.llIlIlIIIIIIll((Object)var8, (Object)N.VESPULA)) {
            return lIlIIIIIIllI[0];
        }
        return lIlIIIIIIllI[5];
    }

    private static int llIlIIlllllIIl(double d2, double d3) {
        return d2 == d3 ? 0 : (d2 < d3 ? -1 : 1);
    }

    @Inject
    public EatingFoodTask(SquireChambersPlugin squireChambersPlugin) {
        this.cD = lIlIIIIIIllI[0];
        this.cE = lIlIIIIIIllI[0];
        this.cG = squireChambersPlugin.A();
        this.cH = squireChambersPlugin;
    }

        return String.valueOf(var9);
    }
}

