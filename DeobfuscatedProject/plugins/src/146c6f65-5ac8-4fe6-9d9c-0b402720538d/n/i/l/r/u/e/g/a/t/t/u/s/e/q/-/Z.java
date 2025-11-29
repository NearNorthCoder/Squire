/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Locatable
 *  net.runelite.api.MenuAction
 *  net.runelite.api.Player
 *  net.runelite.api.TileObject
 *  net.runelite.api.widgets.WidgetInfo
 *  net.unethicalite.api.commons.Rand
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.magic.SpellBook$Standard
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 *  net.unethicalite.api.widgets.Tab
 *  net.unethicalite.api.widgets.Tabs
 */
package n.i.l.r.u.e.g.a.t.t.u.s.e.q.-;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.c;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.d;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.n;
import net.runelite.api.Item;
import net.runelite.api.Locatable;
import net.runelite.api.MenuAction;
import net.runelite.api.Player;
import net.runelite.api.TileObject;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;

@TaskDesc(name="Looting", priority=10, blocking=true)
public class Z
extends n {
    private static /* synthetic */ int[] llIIlllIIlll;
    private static /* synthetic */ String[] llIIlllIIllI;

    private static void llllllllIIllll() {
        llIIlllIIllI = new String[llIIlllIIlll[4]];
        Z.llIIlllIIllI[Z.llIIlllIIlll[1]] = Z.llllllllIIllIl("7Hpt7VF3mt0=", "zROMZ");
        Z.llIIlllIIllI[Z.llIIlllIIlll[0]] = Z.llllllllIIlllI("6tj4C8on0uE=", "OrUAi");
        Z.llIIlllIIllI[Z.llIIlllIIlll[10]] = Z.llllllllIIlllI("0nbk1adBaUs=", "sIyit");
        Z.llIIlllIIllI[Z.llIIlllIIlll[3]] = Z.llllllllIIlllI("IF8a0Z1fT7s=", "WgoXP");
    }

    private static boolean llllllllIlIlll(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean llllllllIllIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean llllllllIlIIlI(int n2) {
        return n2 != 0;
    }

    private static String llllllllIIllIl(String lllllllllllllllIlIIlIIlIIIIllllI, String lllllllllllllllIlIIlIIlIIIIlllIl) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIlIIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIlIIIIlllIl.getBytes(StandardCharsets.UTF_8)), llIIlllIIlll[5]), "DES");
            Cipher lllllllllllllllIlIIlIIlIIIlIIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIIlIIIlIIIII.init(llIIlllIIlll[10], lllllllllllllllIlIIlIIlIIIlIIIIl);
            return new String(lllllllllllllllIlIIlIIlIIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIIlIIIIlllll) {
            lllllllllllllllIlIIlIIlIIIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIlIllI(int n2) {
        return n2 == 0;
    }

    @Inject
    public Z(c c2) {
        d[] dArray = new d[llIIlllIIlll[0]];
        dArray[Z.llIIlllIIlll[1]] = d.OUTSIDE;
        super(c2, dArray);
    }

    private static void llllllllIlIIII() {
        llIIlllIIlll = new int[11];
        Z.llIIlllIIlll[0] = " ".length();
        Z.llIIlllIIlll[1] = (0x73 ^ 0x45) & ~(0x51 ^ 0x67);
        Z.llIIlllIIlll[2] = -(0xFFFFF225 & 0x6DFE) & (0xFFFFFFFF & 0xF1FF);
        Z.llIIlllIIlll[3] = "   ".length();
        Z.llIIlllIIlll[4] = 0x14 ^ 0x10;
        Z.llIIlllIIlll[5] = 0x95 ^ 0x9D;
        Z.llIIlllIIlll[6] = 6 ^ 3;
        Z.llIIlllIIlll[7] = 0x1B ^ 0x57 ^ (0xD ^ 0x4B);
        Z.llIIlllIIlll[8] = 0xFFFFF3DF & 0x2FFB;
        Z.llIIlllIIlll[9] = -(0xFFFFEDA7 & 0x527B) & (0xFFFFD7FF & 0xF9FF);
        Z.llIIlllIIlll[10] = "  ".length();
    }

    private static boolean llllllllIlIIll(Object object) {
        return object != null;
    }

    static {
        Z.llllllllIlIIII();
        Z.llllllllIIllll();
    }

    private static boolean llllllllIlIlIl(int n2, int n3) {
        return n2 > n3;
    }

    private static String llllllllIIlllI(String lllllllllllllllIlIIlIIlIIIIlIIIl, String lllllllllllllllIlIIlIIlIIIIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIlIIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIlIIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIIlIIIIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIIlIIIIlIIll.init(llIIlllIIlll[10], lllllllllllllllIlIIlIIlIIIIlIlII);
            return new String(lllllllllllllllIlIIlIIlIIIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlIIlIIlIIIIlIIlI) {
            lllllllllllllllIlIIlIIlIIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIlIIIl(Object object) {
        return object == null;
    }

    private static boolean llllllllIlIlII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void lllllllllllllllIlIIlIIlIIIlIlIIl;
        TileObject lllllllllllllllIlIIlIIlIIIlIIllI;
        Z lllllllllllllllIlIIlIIlIIIlIlIlI;
        Item lllllllllllllllIlIIlIIlIIIlIlIII;
        Player player = Players.getLocal();
        if (Z.llllllllIlIIIl(player)) {
            return llIIlllIIlll[1];
        }
        if (Z.llllllllIlIIlI(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
        }
        if (Z.llllllllIlIIll(lllllllllllllllIlIIlIIlIIIlIlIII = Inventory.getFirst(item -> Arrays.stream(this.ba.h().dropping().split(llIIlllIIllI[llIIlllIIlll[3]])).anyMatch(string -> string.trim().equals(String.valueOf(item.getId())))))) {
            lllllllllllllllIlIIlIIlIIIlIlIII.interact(llIIlllIIllI[llIIlllIIlll[1]]);
            return llIIlllIIlll[0];
        }
        if (Z.llllllllIlIlII(SpellBook.STANDARD, SpellBook.getCurrent()) && Z.llllllllIlIIlI(SpellBook.Standard.HIGH_LEVEL_ALCHEMY.canCast() ? 1 : 0)) {
            Item lllllllllllllllIlIIlIIlIIIlIIlll = Inventory.getFirst(item -> Arrays.stream(this.ba.h().alching().split(llIIlllIIllI[llIIlllIIlll[10]])).anyMatch(string -> string.trim().equals(String.valueOf(item.getId()))));
            int[] nArray = new int[llIIlllIIlll[0]];
            nArray[Z.llIIlllIIlll[1]] = llIIlllIIlll[2];
            lllllllllllllllIlIIlIIlIIIlIIllI = TileObjects.getNearest((int[])nArray);
            if (Z.llllllllIlIIll(lllllllllllllllIlIIlIIlIIIlIIlll) && Z.llllllllIlIIll(lllllllllllllllIlIIlIIlIIIlIIllI)) {
                if (Z.llllllllIlIlIl(lllllllllllllllIlIIlIIlIIIlIIllI.distanceTo((Locatable)lllllllllllllllIlIIlIIlIIIlIlIIl), llIIlllIIlll[3])) {
                    Movement.setDestination((int)lllllllllllllllIlIIlIIlIIIlIIllI.menuPoint().getX(), (int)lllllllllllllllIlIIlIIlIIIlIIllI.menuPoint().getY());
                    if (Z.llllllllIlIIlI(lllllllllllllllIlIIlIIlIIIlIlIlI.ba.h().waitAfterAttempt() ? 1 : 0)) {
                        lllllllllllllllIlIIlIIlIIIlIlIlI.sleep(Rand.nextInt((int)llIIlllIIlll[4], (int)llIIlllIIlll[5]));
                        return llIIlllIIlll[0];
                    }
                }
                if (Z.llllllllIlIllI(Tabs.isOpen((Tab)Tab.MAGIC) ? 1 : 0)) {
                    Tabs.open((Tab)Tab.MAGIC);
                }
                Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY);
                lllllllllllllllIlIIlIIlIIIlIIlll.interact(llIIlllIIlll[1], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), lllllllllllllllIlIIlIIlIIIlIIlll.getSlot(), WidgetInfo.INVENTORY.getId());
                if (Z.llllllllIlIIlI(lllllllllllllllIlIIlIIlIIIlIlIlI.ba.h().waitAfterAttempt() ? 1 : 0)) {
                    lllllllllllllllIlIIlIIlIIIlIlIlI.sleep(Rand.nextInt((int)llIIlllIIlll[6], (int)llIIlllIIlll[7]));
                }
                lllllllllllllllIlIIlIIlIIIlIlIlI.sleep(llIIlllIIlll[0]);
                return llIIlllIIlll[0];
            }
        }
        if (Z.llllllllIlIlll(Vars.getBit((int)llIIlllIIlll[8]), llIIlllIIlll[0])) {
            if (Z.llllllllIlIIlI(lllllllllllllllIlIIlIIlIIIlIlIIl.isMoving() ? 1 : 0)) {
                return llIIlllIIlll[0];
            }
            int lllllllllllllllIlIIlIIlIIIlIIlll = Inventory.getFreeSlots();
            if (Z.llllllllIllIII(lllllllllllllllIlIIlIIlIIIlIIlll, llIIlllIIlll[4])) {
                return llIIlllIIlll[0];
            }
            if (Z.llllllllIlIIlI(lllllllllllllllIlIIlIIlIIIlIlIlI.ba.h().hopUntilEmpty() ? 1 : 0) && Z.llllllllIlIlIl(Players.getAll().size(), llIIlllIIlll[0])) {
                return llIIlllIIlll[1];
            }
            int[] nArray = new int[llIIlllIIlll[0]];
            nArray[Z.llIIlllIIlll[1]] = llIIlllIIlll[9];
            lllllllllllllllIlIIlIIlIIIlIIllI = TileObjects.getNearest((int[])nArray);
            if (Z.llllllllIlIIll(lllllllllllllllIlIIlIIlIIIlIIllI)) {
                lllllllllllllllIlIIlIIlIIIlIIllI.interact(llIIlllIIllI[llIIlllIIlll[0]]);
                return llIIlllIIlll[0];
            }
        }
        return llIIlllIIlll[1];
    }
}

