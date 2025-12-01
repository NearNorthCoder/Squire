package n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
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
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
@TaskDesc(name = "Looting", priority = 10, blocking = true)
/* renamed from: n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.Z  reason: invalid package */
/* loaded from: 146c6f65-5ac8-4fe6-9d9c-0b402720538d.jar:n/i/l/r/u/e/g/a/t/t/u/s/e/q/-/Z.class */
public class Z extends AbstractC0013n {
    private static /* synthetic */ int[] llIIlllIIlll;
    private static /* synthetic */ String[] llIIlllIIllI;

    private static void llllllllIIllll() {
        llIIlllIIllI = new String[llIIlllIIlll[4]];
        llIIlllIIllI[llIIlllIIlll[1]] = llllllllIIllIl("7Hpt7VF3mt0=", "zROMZ");
        llIIlllIIllI[llIIlllIIlll[0]] = llllllllIIlllI("6tj4C8on0uE=", "OrUAi");
        llIIlllIIllI[llIIlllIIlll[10]] = llllllllIIlllI("0nbk1adBaUs=", "sIyit");
        llIIlllIIllI[llIIlllIIlll[3]] = llllllllIIlllI("IF8a0Z1fT7s=", "WgoXP");
    }

    private static boolean llllllllIlIlll(int i, int i2) {
        return i == i2;
    }

    private static boolean llllllllIllIII(int i, int i2) {
        return i < i2;
    }

    private static boolean llllllllIlIIlI(int i) {
        return i != 0;
    }

    private static String llllllllIIllIl(String lllllllllllllllIlIIlIIlIIIIllllI, String lllllllllllllllIlIIlIIlIIIIllIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIlIIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIlIIIIllIll.getBytes(StandardCharsets.UTF_8)), llIIlllIIlll[5]), "DES");
            Cipher lllllllllllllllIlIIlIIlIIIlIIIII = Cipher.getInstance("DES");
            lllllllllllllllIlIIlIIlIIIlIIIII.init(llIIlllIIlll[10], lllllllllllllllIlIIlIIlIIIlIIIIl);
            return new String(lllllllllllllllIlIIlIIlIIIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlIIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIIlIIIIlllll) {
            lllllllllllllllIlIIlIIlIIIIlllll.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIlIllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Z(C0002c c0002c) {
        super(c0002c, r2);
        EnumC0003d[] enumC0003dArr = new EnumC0003d[llIIlllIIlll[0]];
        enumC0003dArr[llIIlllIIlll[1]] = EnumC0003d.OUTSIDE;
    }

    private static void llllllllIlIIII() {
        llIIlllIIlll = new int[11];
        llIIlllIIlll[0] = " ".length();
        llIIlllIIlll[1] = (115 ^ 69) & ((81 ^ 103) ^ (-1));
        llIIlllIIlll[2] = (-((-3547) & 28158)) & (-1) & 61951;
        llIIlllIIlll[3] = "   ".length();
        llIIlllIIlll[4] = 20 ^ 16;
        llIIlllIIlll[5] = 149 ^ 157;
        llIIlllIIlll[6] = 6 ^ 3;
        llIIlllIIlll[7] = (27 ^ 87) ^ (13 ^ 75);
        llIIlllIIlll[8] = (-3105) & 12283;
        llIIlllIIlll[9] = (-((-4697) & 21115)) & (-10241) & 63999;
        llIIlllIIlll[10] = "  ".length();
    }

    private static boolean llllllllIlIIll(Object obj) {
        return obj != null;
    }

    static {
        llllllllIlIIII();
        llllllllIIllll();
    }

    private static boolean llllllllIlIlIl(int i, int i2) {
        return i > i2;
    }

    private static String llllllllIIlllI(String lllllllllllllllIlIIlIIlIIIIlIIIl, String lllllllllllllllIlIIlIIlIIIIlIIII) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIIlIIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIIlIIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIlllIIlll[10], lllllllllllllllIlIIlIIlIIIIlIlII);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIIlIIIIlIIlI) {
            lllllllllllllllIlIIlIIlIIIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean llllllllIlIIIl(Object obj) {
        return obj == null;
    }

    private static boolean llllllllIlIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [boolean] */
    @Override // n.i.l.r.u.e.g.a.t.t.u.s.e.q.p000.AbstractC0013n
    public boolean be() {
        Player local = Players.getLocal();
        if (llllllllIlIIIl(local)) {
            return llIIlllIIlll[1];
        }
        if (llllllllIlIIlI(Prayers.anyActive() ? 1 : 0)) {
            Prayers.disableAll();
        }
        Item first = Inventory.getFirst(item -> {
            return Arrays.stream(this.ba.h().dropping().split(llIIlllIIllI[llIIlllIIlll[3]])).anyMatch(str -> {
                return str.trim().equals(String.valueOf(item.getId()));
            });
        });
        if (llllllllIlIIll(first)) {
            first.interact(llIIlllIIllI[llIIlllIIlll[1]]);
            return llIIlllIIlll[0];
        }
        if (llllllllIlIlII(SpellBook.STANDARD, SpellBook.getCurrent()) && llllllllIlIIlI(SpellBook.Standard.HIGH_LEVEL_ALCHEMY.canCast() ? 1 : 0)) {
            Item first2 = Inventory.getFirst(item2 -> {
                return Arrays.stream(this.ba.h().alching().split(llIIlllIIllI[llIIlllIIlll[10]])).anyMatch(str -> {
                    return str.trim().equals(String.valueOf(item2.getId()));
                });
            });
            int[] iArr = new int[llIIlllIIlll[0]];
            iArr[llIIlllIIlll[1]] = llIIlllIIlll[2];
            TileObject nearest = TileObjects.getNearest(iArr);
            if (llllllllIlIIll(first2) && llllllllIlIIll(nearest)) {
                if (llllllllIlIlIl(nearest.distanceTo(local), llIIlllIIlll[3])) {
                    Movement.setDestination(nearest.menuPoint().getX(), nearest.menuPoint().getY());
                    if (llllllllIlIIlI(this.ba.h().waitAfterAttempt() ? 1 : 0)) {
                        sleep(Rand.nextInt(llIIlllIIlll[4], llIIlllIIlll[5]));
                        return llIIlllIIlll[0];
                    }
                }
                if (llllllllIlIllI(Tabs.isOpen(Tab.MAGIC) ? 1 : 0)) {
                    Tabs.open(Tab.MAGIC);
                }
                Magic.cast(SpellBook.Standard.HIGH_LEVEL_ALCHEMY);
                first2.interact(llIIlllIIlll[1], MenuAction.WIDGET_TARGET_ON_WIDGET.getId(), first2.getSlot(), WidgetInfo.INVENTORY.getId());
                if (llllllllIlIIlI(this.ba.h().waitAfterAttempt() ? 1 : 0)) {
                    sleep(Rand.nextInt(llIIlllIIlll[6], llIIlllIIlll[7]));
                }
                sleep(llIIlllIIlll[0]);
                return llIIlllIIlll[0];
            }
        }
        if (llllllllIlIlll(Vars.getBit(llIIlllIIlll[8]), llIIlllIIlll[0])) {
            if (!llllllllIlIIlI(local.isMoving() ? 1 : 0) && !llllllllIllIII(Inventory.getFreeSlots(), llIIlllIIlll[4])) {
                if (llllllllIlIIlI(this.ba.h().hopUntilEmpty() ? 1 : 0) && llllllllIlIlIl(Players.getAll().size(), llIIlllIIlll[0])) {
                    return llIIlllIIlll[1];
                }
                int[] iArr2 = new int[llIIlllIIlll[0]];
                iArr2[llIIlllIIlll[1]] = llIIlllIIlll[9];
                TileObject nearest2 = TileObjects.getNearest(iArr2);
                if (llllllllIlIIll(nearest2)) {
                    nearest2.interact(llIIlllIIllI[llIIlllIIlll[0]]);
                    return llIIlllIIlll[0];
                }
            }
            return llIIlllIIlll[0];
        }
        return llIIlllIIlll[1];
    }
}
