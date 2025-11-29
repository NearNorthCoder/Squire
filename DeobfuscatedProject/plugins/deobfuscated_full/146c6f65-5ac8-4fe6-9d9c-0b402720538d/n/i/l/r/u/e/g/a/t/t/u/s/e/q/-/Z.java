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

/* TASK: Looting -> LootingTask */
@TaskDesc(name="Looting", priority=10, blocking=true)
public class Z
extends n {
    private static /* synthetic */ int[] llIIlllIIlll;
    private static /* synthetic */ String[] llIIlllIIllI;

    private static void llllllllIIllll() {
        llIIlllIIllI = new String[llIIlllIIlll[4]];
        Z.llIIlllIIllI[Z.llIIlllIIlll[1]] = Z."Drop";
        Z.llIIlllIIllI[Z.llIIlllIIlll[0]] = Z."Open";
        Z.llIIlllIIllI[Z.llIIlllIIlll[10]] = Z.",";
        Z.llIIlllIIllI[Z.llIIlllIIlll[3]] = Z.",";
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

    private static String llllllllIIllIl(String var15, String var7) {
        try {
            SecretKeySpec var1 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var7.getBytes(StandardCharsets.UTF_8)), llIIlllIIlll[5]), "DES");
            Cipher var14 = Cipher.getInstance("DES");
            var14.init(llIIlllIIlll[10], var1);
            return new String(var14.doFinal(Base64.getDecoder().decode(var15.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
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
        Z.llIIlllIIlll[0] = 1;
        Z.llIIlllIIlll[1] = (0x73 ^ 0x45) & ~(0x51 ^ 0x67);
        Z.llIIlllIIlll[2] = -(0xFFFFF225 & 0x6DFE) & (0xFFFFFFFF & 0xF1FF);
        Z.llIIlllIIlll[3] = 3;
        Z.llIIlllIIlll[4] = 0x14 ^ 0x10;
        Z.llIIlllIIlll[5] = 0x95 ^ 0x9D;
        Z.llIIlllIIlll[6] = 6 ^ 3;
        Z.llIIlllIIlll[7] = 0x1B ^ 0x57 ^ (0xD ^ 0x4B);
        Z.llIIlllIIlll[8] = 0xFFFFF3DF & 0x2FFB;
        Z.llIIlllIIlll[9] = -(0xFFFFEDA7 & 0x527B) & (0xFFFFD7FF & 0xF9FF);
        Z.llIIlllIIlll[10] = 2;
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

    private static String llllllllIIlllI(String var11, String var13) {
        try {
            SecretKeySpec var6 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var2 = Cipher.getInstance("Blowfish");
            var2.init(llIIlllIIlll[10], var6);
            return new String(var2.doFinal(Base64.getDecoder().decode(var11.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
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
        void var3;
        TileObject var5;
        Z var10;
        Item var8;
        Player player = Players.getLocal();
        if (Z.llllllllIlIIIl(player)) {
            return llIIlllIIlll[1];
        }
        if (Z.llllllllIlIIlI(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
        }
        if (Z.llllllllIlIIll(var8 = Inventory.getFirst(item -> Arrays.stream(this.ba.h().dropping().split(llIIlllIIllI[llIIlllIIlll[3]])).anyMatch(string -> string.trim().equals(String.valueOf(item.getId())))))) {
            var8.interact(llIIlllIIllI[llIIlllIIlll[1]]);
            return llIIlllIIlll[0];
        }
        if (Z.llllllllIlIlII(SpellBook.STANDARD, SpellBook.getCurrent()) && Z.llllllllIlIIlI(SpellBook.Standard.HIGH_LEVEL_ALCHEMY.canCast() ? 1 : 0)) {
            Item var9 = Inventory.getFirst(item -> Arrays.stream(this.ba.h().alching().split(llIIlllIIllI[llIIlllIIlll[10]])).anyMatch(string -> string.trim().equals(String.valueOf(item.getId()))));
            int[] nArray = new int[llIIlllIIlll[0]];
            nArray[Z.llIIlllIIlll[1]] = llIIlllIIlll[2];
            var5 = TileObjects.getNearest((int[])nArray);
            if (Z.llllllllIlIIll(var9) && Z.llllllllIlIIll(var5)) {
                if (Z.llllllllIlIlIl(var5.distanceTo((Locatable)var3), llIIlllIIlll[3])) {
                    Movement.setDestination((int)var5.menuPoint().getX(), (int)var5.menuPoint().getY());
                    if (Z.llllllllIlIIlI(var10.ba.h().waitAfterAttempt() ? 1 : 0)) {
                        var10.sleep(Rand.nextInt((int)llIIlllIIlll[4], (int)llIIlllIIlll[5]));
                        return llIIlllIIlll[0];
                    }
                }
                if (Z.llllllllIlIllI(Tabs.isOpen((Tab)Tab.MAGIC) ? 1 : 0)) {
                    Tabs.open((Tab)Tab.MAGIC);
                }
                Magic.cast((Spell)SpellBook.Standard.HIGH_LEVEL_ALCHEMY);
                var9.interact(llIIlllIIlll[1], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), var9.getSlot(), WidgetInfo.INVENTORY.getId());
                if (Z.llllllllIlIIlI(var10.ba.h().waitAfterAttempt() ? 1 : 0)) {
                    var10.sleep(Rand.nextInt((int)llIIlllIIlll[6], (int)llIIlllIIlll[7]));
                }
                var10.sleep(llIIlllIIlll[0]);
                return llIIlllIIlll[0];
            }
        }
        if (Z.llllllllIlIlll(Vars.getBit((int)llIIlllIIlll[8]), llIIlllIIlll[0])) {
            if (Z.llllllllIlIIlI(var3.isMoving() ? 1 : 0)) {
                return llIIlllIIlll[0];
            }
            int var9 = Inventory.getFreeSlots();
            if (Z.llllllllIllIII(var9, llIIlllIIlll[4])) {
                return llIIlllIIlll[0];
            }
            if (Z.llllllllIlIIlI(var10.ba.h().hopUntilEmpty() ? 1 : 0) && Z.llllllllIlIlIl(Players.getAll().size(), llIIlllIIlll[0])) {
                return llIIlllIIlll[1];
            }
            int[] nArray = new int[llIIlllIIlll[0]];
            nArray[Z.llIIlllIIlll[1]] = llIIlllIIlll[9];
            var5 = TileObjects.getNearest((int[])nArray);
            if (Z.llllllllIlIIll(var5)) {
                var5.interact(llIIlllIIllI[llIIlllIIlll[0]]);
                return llIIlllIIlll[0];
            }
        }
        return llIIlllIIlll[1];
    }
}

