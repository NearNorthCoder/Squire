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
package y.l.q.i.-.g.u.s.r.e.t.a.i.i;

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
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.b;
import y.l.q.i.-.g.u.s.r.e.t.a.i.i.c;

@TaskDesc(name="Casting Spell", priority=500)
public class h
extends Task {
    private static /* synthetic */ String[] lIlIlllllII;
    private static /* synthetic */ int[] lIlIlllllIl;
    private final /* synthetic */ SquireAgilityPlugin w;
    private final /* synthetic */ AgilityConfig x;

    /*
     * WARNING - void declaration
     */
    private boolean x() {
        void var3_3;
        void var5_6;
        SpellBook.Standard standard;
        int llllllllllllllllIlIlIllIlIIIIlll2;
        int n;
        Object llllllllllllllllIlIlIllIlIIIIllI;
        Item llllllllllllllllIlIlIllIlIIIlIII;
        h llllllllllllllllIlIlIllIlIIIlIll;
        b b2 = this.w.a();
        if (h.lIIlIlIIIlIlll((Object)b2)) {
            return lIlIlllllIl[0];
        }
        String llllllllllllllllIlIlIllIlIIIlIIl = llllllllllllllllIlIlIllIlIIIlIll.x.alchIds();
        if (h.lIIlIlIIIllIlI(llllllllllllllllIlIlIllIlIIIlIIl.isEmpty() ? 1 : 0)) {
            llllllllllllllllIlIlIllIlIIIlIII = Inventory.getFirst(Item::isNoted);
            0;
            if ((0x75 ^ 0x71) <= ((0x21 ^ 0xE) & ~(0x34 ^ 0x1B))) {
                return ((0x4A ^ 0x15) & ~(0x26 ^ 0x79)) != 0;
            }
        } else {
            String[] llllllllllllllllIlIlIllIlIIIIlll2 = llllllllllllllllIlIlIllIlIIIlIIl.split(lIlIlllllII[lIlIlllllIl[0]]);
            llllllllllllllllIlIlIllIlIIIIllI = new int[llllllllllllllllIlIlIllIlIIIIlll2.length];
            int llllllllllllllllIlIlIllIlIIIIlIl = lIlIlllllIl[0];
            while (h.lIIlIlIIIllIll(llllllllllllllllIlIlIllIlIIIIlIl, llllllllllllllllIlIlIllIlIIIIlll2.length)) {
                llllllllllllllllIlIlIllIlIIIIllI[llllllllllllllllIlIlIllIlIIIIlIl] = Integer.parseInt(llllllllllllllllIlIlIllIlIIIIlll2[llllllllllllllllIlIlIllIlIIIIlIl]);
                ++llllllllllllllllIlIlIllIlIIIIlIl;
                0;
                if (1 != 0) continue;
                return ((0x55 ^ 0x73) & ~(0x80 ^ 0xA6)) != 0;
            }
            llllllllllllllllIlIlIllIlIIIlIII = Inventory.getFirst((int[])llllllllllllllllIlIlIllIlIIIIllI);
        }
        if (h.lIIlIlIIIlIlll(llllllllllllllllIlIlIllIlIIIlIII)) {
            return lIlIlllllIl[0];
        }
        if (h.lIIlIlIIIlllII(Skills.getBoostedLevel((Skill)Skill.MAGIC), lIlIlllllIl[6])) {
            n = lIlIlllllIl[5];
            0;
            if (null != null) {
                return ((0x11 ^ 0x19) & ~(0xBD ^ 0xB5)) != 0;
            }
        } else {
            n = lIlIlllllIl[0];
        }
        if (h.lIIlIlIIIllIlI(llllllllllllllllIlIlIllIlIIIIlll2 = n)) {
            standard = SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
            0;
            if (3 == ((0xEE ^ 0xAE) & ~(0x4E ^ 0xE))) {
                return ((0x60 ^ 0x22) & ~(0xFA ^ 0xB8)) != 0;
            }
        } else {
            standard = SpellBook.Standard.LOW_LEVEL_ALCHEMY;
        }
        if (h.lIIlIlIIIlIllI(Magic.canCast((Spell)(llllllllllllllllIlIlIllIlIIIIllI = (Object)standard)) ? 1 : 0)) {
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
        h.lIlIlllllII[h.lIlIlllllIl[0]] = h.",";
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
        void llllllllllllllllIlIlIllIlIIlIlII;
        h llllllllllllllllIlIlIllIlIIlIlIl;
        Player player = Players.getLocal();
        if (!h.lIIlIlIIIlIlIl(player) || h.lIIlIlIIIlIllI(player.isMoving() ? 1 : 0)) {
            return lIlIlllllIl[0];
        }
        c llllllllllllllllIlIlIllIlIIlIIll = llllllllllllllllIlIlIllIlIIlIlIl.w.a().k();
        if (h.lIIlIlIIIlIlll(llllllllllllllllIlIlIllIlIIlIIll)) {
            return lIlIlllllIl[0];
        }
        if (!h.lIIlIlIIIllIII(llllllllllllllllIlIlIllIlIIlIlII.getAnimation(), lIlIlllllIl[1]) || h.lIIlIlIIIllIIl(llllllllllllllllIlIlIllIlIIlIlII.getAnimation(), lIlIlllllIl[2])) {
            llllllllllllllllIlIlIllIlIIlIlIl.sleep(lIlIlllllIl[3]);
        }
        if (h.lIIlIlIIIllIlI(llllllllllllllllIlIlIllIlIIlIlIl.x.imbue() ? 1 : 0)) {
            return llllllllllllllllIlIlIllIlIIlIlIl.w();
        }
        if (h.lIIlIlIIIllIlI(llllllllllllllllIlIlIllIlIIlIlIl.x.alch() ? 1 : 0)) {
            return llllllllllllllllIlIlIllIlIIlIlIl.x();
        }
        return lIlIlllllIl[0];
    }

    private static boolean lIIlIlIIIllIIl(int n, int n2) {
        return n == n2;
    }

    private static void lIIlIlIIIlIlII() {
        lIlIlllllIl = new int[8];
        h.lIlIlllllIl[0] = (0xFC ^ 0xA0) & ~(0x78 ^ 0x24);
        h.lIlIlllllIl[1] = 0xFFFFA7C9 & 0x5AFF;
        h.lIlIlllllIl[2] = -(0xFFFFBEB2 & 0x517F) & (0xFFFFDBFD & 0x36FB);
        h.lIlIlllllIl[3] = 3;
        h.lIlIlllllIl[4] = -(0xFFFFEF92 & 0x72EF) & (0xFFFFF7FF & 0x7FBF);
        h.lIlIlllllIl[5] = 1;
        h.lIlIlllllIl[6] = 0x24 ^ 0x3C ^ (0x22 ^ 0xD);
        h.lIlIlllllIl[7] = 2;
    }

    @Inject
    public h(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
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

    private static String lIIlIlIIIlIIlI(String llllllllllllllllIlIlIllIIllllIll, String llllllllllllllllIlIlIllIIlllllII) {
        try {
            SecretKeySpec llllllllllllllllIlIlIllIlIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIllIIlllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIlIllIIlllllll = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIlIllIIlllllll.init(lIlIlllllIl[7], llllllllllllllllIlIlIllIlIIIIIII);
            return new String(llllllllllllllllIlIlIllIIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIllIIllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIlIllIIllllllI) {
            llllllllllllllllIlIlIllIIllllllI.printStackTrace();
            return null;
        }
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

