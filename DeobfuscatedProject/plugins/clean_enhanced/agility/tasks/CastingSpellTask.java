/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Lunar
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package gg.squire.agility.tasks;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import gg.squire.agility.tasks.GameEnum;
import gg.squire.agility.tasks.CHelper;

@TaskDesc(name="Casting Spell", priority=500)
public class CastingSpellTask
extends Task {

    private final  SquireAgilityPlugin w;
    private final  AgilityConfig x;

    /*
     * WARNING - void declaration
     */
    private boolean x() {
        void var3_3;
        void var5_6;
        SpellBook.Standard standard;
        int llllllllllllllllIlIlIllIlIIIIlll2;
        int n;
        Object var3;
        Item var4;
        h var5;
        b b2 = this.w.a();
        if (h.var6((Object)b2)) {
            return var2[0];
        }
        String var7 = var5.x.alchIds();
        if (h.var8(var7.isEmpty() ? 1 : 0)) {
            var4 = Inventory.getFirst(Item::isNoted);
            0;
            if ((0x75 ^ 0x71) <= ((0x21 ^ 0xE) & ~(0x34 ^ 0x1B))) {
                return ((0x4A ^ 0x15) & ~(0x26 ^ 0x79)) != 0;
            }
        } else {
            String[] llllllllllllllllIlIlIllIlIIIIlll2 = var7.split(var1[var2[0]]);
            var3 = new int[llllllllllllllllIlIlIllIlIIIIlll2.length];
            int var9 = var2[0];
            while (h.var10(var9, llllllllllllllllIlIlIllIlIIIIlll2.length)) {
                var3[var9] = Integer.parseInt(llllllllllllllllIlIlIllIlIIIIlll2[var9]);
                ++var9;
                0;
                if (1 != 0) continue;
                return ((0x55 ^ 0x73) & ~(0x80 ^ 0xA6)) != 0;
            }
            var4 = Inventory.getFirst((int[])var3);
        }
        if (h.var6(var4)) {
            return var2[0];
        }
        if (h.var11(Skills.getBoostedLevel((SkiSkill.MAGIC), var2[6])) {
            n = var2[5];
            0;
            if null != null {
                return ((0x11 ^ 0x19) & ~(0xBD ^ 0xB5)) != 0;
            }
        } else {
            n = var2[0];
        }
        if (h.var8(llllllllllllllllIlIlIllIlIIIIlll2 = n)) {
            standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
            0;
            if (3 == ((0xEE ^ 0xAE) & ~(0x4E ^ 0xE))) {
                return ((0x60 ^ 0x22) & ~(0xFA ^ 0xB8)) != 0;
            }
        } else {
            standard = SpellBook.Standard.LOW_LEVEL_ALCHEMY;
        }
        if (h.var12(Magic.canCast((Spell)(var3 = (Object)standard)) ? 1 : 0)) {
            return var2[0];
        }
        Magic.cast((Spevar5_6, (Item)var3_3);
        return var2[5];
    }

    private static boolean var6(Object object) {
        return object == null;
    }

    private static void var13() {
        var1 = new String[var2[5]];
        h.var1[h.var2[0]] = ",";
    }

    private static boolean var14(int n, int n2) {
        return n != n2;
    }

    private static boolean var8(int n) {
        return n != 0;
    }

    private static boolean var12(int n) {
        return n == 0;
    }

    private static boolean var11(int n, int n2) {
        return n >= n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var15;
        h var16;
        Player player = Players.getLocal();
        if (!h.var17(player) || h.var12(player.isMoving() ? 1 : 0)) {
            return var2[0];
        }
        c var18 = var16.w.a().k();
        if (h.var6(var18)) {
            return var2[0];
        }
        if (!h.var14(var15.getAnimation(), var2[1]) || h.var19(var15.getAnimation(), var2[2])) {
            var16.sleep(var2[3]);
        }
        if (h.var8(var16.x.imbue() ? 1 : 0)) {
            return var16.w();
        }
        if (h.var8(var16.x.alch() ? 1 : 0)) {
            return var16.x();
        }
        return var2[0];
    }

    private static boolean var19(int n, int n2) {
        return n == n2;
    }

    private static void var20() {
        var2 = new int[8];
        h.var2[0] = (0xFC ^ 0xA0) & ~(0x78 ^ 0x24);
        h.var2[1] = 0xFFFFA7C9 & 0x5AFF;
        h.var2[2] = -(0xFFFFBEB2 & 0x517F) & (0xFFFFDBFD & 0x36FB);
        h.var2[3] = 3;
        h.var2[4] = -(0xFFFFEF92 & 0x72EF) & (0xFFFFF7FF & 0x7FBF);
        h.var2[5] = 1;
        h.var2[6] = 0x24 ^ 0x3C ^ (0x22 ^ 0xD);
        h.var2[7] = 2;
    }

    @Inject
    public CastingSpellTask(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.w = squireAgilityPlugin;
        this.x = agilityConfig;
    }

    static {
        h.var20();
        h.var13();
    }

    private static boolean var10(int n, int n2) {
        return n < n2;
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    private boolean w() {
        if (h.var8(Vars.getBit((int)var2[4]))) {
            return var2[0];
        }
        Magic.cast((SpeSpellBook.Lunar.MAGIC_IMBUE);
        return var2[5];
    }

    private static boolean var17(Object object) {
        return object != null;
    }
}

