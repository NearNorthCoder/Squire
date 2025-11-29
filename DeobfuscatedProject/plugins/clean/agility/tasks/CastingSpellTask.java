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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
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
        Object var1;
        Item var2;
        h var3;
        b b2 = this.w.a();
        if (h.lIIlIlIIIlIlll((Object)b2)) {
            return lIlIlllllIl[0];
        }
        String var4 = var3.x.alchIds();
        if (h.lIIlIlIIIllIlI(var4.isEmpty() ? 1 : 0)) {
            var2 = Inventory.getFirst(Item::isNoted);

            if ((0x75 ^ 0x71) <= ((0x21 ^ 0xE) & ~(0x34 ^ 0x1B))) {
                return false;
            }
        } else {
            String[] llllllllllllllllIlIlIllIlIIIIlll2 = var4.split(lIlIlllllII[lIlIlllllIl[0]]);
            var1 = new int[llllllllllllllllIlIlIllIlIIIIlll2.length];
            int var5 = lIlIlllllIl[0];
            while (h.lIIlIlIIIllIll(var5, llllllllllllllllIlIlIllIlIIIIlll2.length)) {
                var1[var5] = Integer.parseInt(llllllllllllllllIlIlIllIlIIIIlll2[var5]);
                ++var5;

                if (1 != 0) continue;
                return false;
            }
            var2 = Inventory.getFirst((int[])var1);
        }
        if (h.lIIlIlIIIlIlll(var2)) {
            return lIlIlllllIl[0];
        }
        if (h.lIIlIlIIIlllII(Skills.getBoostedLevel((Skill)Skill.MAGIC), lIlIlllllIl[6])) {
            n = lIlIlllllIl[5];

            }
        } else {
            n = lIlIlllllIl[0];
        }
        if (h.lIIlIlIIIllIlI(llllllllllllllllIlIlIllIlIIIIlll2 = n)) {
            standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;

            if (3 == ((0xEE ^ 0xAE) & ~(0x4E ^ 0xE))) {
                return false;
            }
        } else {
            standard = SpellBook.Standard.LOW_LEVEL_ALCHEMY;
        }
        if (h.lIIlIlIIIlIllI(Magic.canCast((Spell)(var1 = (Object)standard)) ? 1 : 0)) {
            return lIlIlllllIl[0];
        }
        Magic.cast((Spell)var5_6, (Item)var3_3);
        return lIlIlllllIl[5];
    }

    private static boolean lIIlIlIIIlIlll(Object object) {
        return object == null;
    }

    private static void lIIlIlIIIlIIll() {
        lIlIlllllII = new String[lIlIlllllIl[5]];
        h.lIlIlllllII[h.lIlIlllllIl[0]] = ",";
    }

    private static boolean lIIlIlIIIllIII(int n, int n2) {
        return n != n2;
    }

    private static boolean lIIlIlIIIllIlI(int n) {
        return n != 0;
    }

    private static boolean lIIlIlIIIlIllI(int n) {
        return n == 0;
    }

    private static boolean lIIlIlIIIlllII(int n, int n2) {
        return n >= n2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var6;
        h var7;
        Player player = Players.getLocal();
        if (!h.lIIlIlIIIlIlIl(player) || h.lIIlIlIIIlIllI(player.isMoving() ? 1 : 0)) {
            return lIlIlllllIl[0];
        }
        c var8 = var7.w.a().k();
        if (h.lIIlIlIIIlIlll(var8)) {
            return lIlIlllllIl[0];
        }
        if (!h.lIIlIlIIIllIII(var6.getAnimation(), lIlIlllllIl[1]) || h.lIIlIlIIIllIIl(var6.getAnimation(), lIlIlllllIl[2])) {
            var7.sleep(lIlIlllllIl[3]);
        }
        if (h.lIIlIlIIIllIlI(var7.x.imbue() ? 1 : 0)) {
            return var7.w();
        }
        if (h.lIIlIlIIIllIlI(var7.x.alch() ? 1 : 0)) {
            return var7.x();
        }
        return lIlIlllllIl[0];
    }

    private static boolean lIIlIlIIIllIIl(int n, int n2) {
        return n == n2;
    }

    @Inject
    public CastingSpellTask(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.w = squireAgilityPlugin;
        this.x = agilityConfig;
    }

    static {
        h.lIIlIlIIIlIlII();
        h.lIIlIlIIIlIIll();
    }

    private static boolean lIIlIlIIIllIll(int n, int n2) {
        return n < n2;
    }

    private boolean w() {
        if (h.lIIlIlIIIllIlI(Vars.getBit((int)lIlIlllllIl[4]))) {
            return lIlIlllllIl[0];
        }
        Magic.cast((Spell)SpellBook.Lunar.MAGIC_IMBUE);
        return lIlIlllllIl[5];
    }

    private static boolean lIIlIlIIIlIlIl(Object object) {
        return object != null;
    }
}

