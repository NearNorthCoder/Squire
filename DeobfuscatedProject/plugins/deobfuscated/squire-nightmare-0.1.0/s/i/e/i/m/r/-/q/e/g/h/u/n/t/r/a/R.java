/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 *  net.unethicalite.api.movement.pathfinder.model.poh.HousePortal
 *  net.unethicalite.api.movement.pathfinder.model.poh.JewelryBox
 *  net.unethicalite.client.managers.RegionManager
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import net.unethicalite.api.movement.pathfinder.model.poh.HousePortal;
import net.unethicalite.api.movement.pathfinder.model.poh.JewelryBox;
import net.unethicalite.client.managers.RegionManager;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.S;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.h;

@TaskDesc(name="Grab teleport to GE", priority=18337, blocking=true)
public class R
extends S {
    private static /* synthetic */ int[] llllIIIlIIlI;
    private static /* synthetic */ String[] llllIIIlIIII;

    private static String lIIIlllIlllIlIl(String lllllllllllllllIIllIIIIIIlIIIIII, String lllllllllllllllIIllIIIIIIIllllIl) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIIIlIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIIIllllIl.getBytes(StandardCharsets.UTF_8)), llllIIIlIIlI[12]), "DES");
            Cipher lllllllllllllllIIllIIIIIIlIIIIlI = Cipher.getInstance("DES");
            lllllllllllllllIIllIIIIIIlIIIIlI.init(llllIIIlIIlI[4], lllllllllllllllIIllIIIIIIlIIIIll);
            return new String(lllllllllllllllIIllIIIIIIlIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIIIIlIIIIIl) {
            lllllllllllllllIIllIIIIIIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIlllIlllllIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlllIllllllI(int n2, int n3) {
        return n2 > n3;
    }

    @Override
    public boolean ci() {
        R lllllllllllllllIIllIIIIIIlIlllIl;
        if (R.lIIIlllIllllIll(this.cn() ? 1 : 0)) {
            return llllIIIlIIlI[0];
        }
        Player lllllllllllllllIIllIIIIIIlIlllII = Players.getLocal();
        if (R.lIIIlllIlllllII(lllllllllllllllIIllIIIIIIlIlllII)) {
            return llllIIIlIIlI[0];
        }
        if (R.lIIIlllIlllllIl(Movement.shouldWalk() ? 1 : 0)) {
            return llllIIIlIIlI[0];
        }
        if (R.lIIIlllIllllIll(Inventory.contains(lllllllllllllllIIllIIIIIIlIlllIl.ck()) ? 1 : 0)) {
            return llllIIIlIIlI[0];
        }
        BankLocation lllllllllllllllIIllIIIIIIlIllIll = BankLocation.getNearest();
        if (R.lIIIlllIllllllI(lllllllllllllllIIllIIIIIIlIllIll.getArea().distanceTo(lllllllllllllllIIllIIIIIIlIlllII.getWorldLocation()), llllIIIlIIlI[1])) {
            Movement.walkTo((WorldPoint)lllllllllllllllIIllIIIIIIlIllIll.getArea().getCenter());
            0;
            return llllIIIlIIlI[2];
        }
        if (R.lIIIlllIlllllIl(Bank.isOpen() ? 1 : 0)) {
            return Bank.open();
        }
        if (R.lIIIlllIlllllIl(Bank.contains(lllllllllllllllIIllIIIIIIlIlllIl.ck()) ? 1 : 0)) {
            Log.info((String)llllIIIlIIII[llllIIIlIIlI[0]]);
            Object[] objectArray = new Object[llllIIIlIIlI[2]];
            objectArray[R.llllIIIlIIlI[0]] = lllllllllllllllIIllIIIIIIlIlllIl.cj();
            Log.info((String)llllIIIlIIII[llllIIIlIIlI[2]], (Object[])objectArray);
            lllllllllllllllIIllIIIIIIlIlllIl.cW.forceStop();
            return llllIIIlIIlI[2];
        }
        Bank.withdraw(this.ck(), (int)llllIIIlIIlI[2], (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
        return llllIIIlIIlI[2];
    }

    private static boolean lIIIlllIlllllII(Object object) {
        return object == null;
    }

    private static boolean lIIIllllIIIIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIIlllIlllllll(int n2, int n3) {
        return n2 != n3;
    }

    static {
        R.lIIIlllIllllIlI();
        R.lIIIlllIllllIIl();
    }

    private static void lIIIlllIllllIlI() {
        llllIIIlIIlI = new int[13];
        R.llllIIIlIIlI[0] = (0x4E ^ 0x6C ^ (0x7A ^ 0x49)) & (119 + 17 - -26 + 6 ^ 95 + 171 - 125 + 44 ^ -1);
        R.llllIIIlIIlI[1] = 0x2C ^ 0x20;
        R.llllIIIlIIlI[2] = 1;
        R.llllIIIlIIlI[3] = 0xFFFF9FFF & 0x7F47;
        R.llllIIIlIIlI[4] = 2;
        R.llllIIIlIIlI[5] = 3;
        R.llllIIIlIIlI[6] = 0xFFFFE6FD & 0x3F3F;
        R.llllIIIlIIlI[7] = 0xFFFFBE3F & 0x67FE;
        R.llllIIIlIIlI[8] = 0xFFFFF3EE & 0x3FF1;
        R.llllIIIlIIlI[9] = -(0xFFFF8863 & 0x7FBE) & (0xFFFFBEFF & 0x7D3F);
        R.llllIIIlIIlI[10] = -(0xFFFFD19B & 0x6E67) & (0xFFFFFFDF & 0x5F6F);
        R.llllIIIlIIlI[11] = 0xC6 ^ 0xC2;
        R.llllIIIlIIlI[12] = 37 + 164 - 200 + 175 ^ 92 + 15 - -68 + 9;
    }

    private static String lIIIlllIlllIllI(String lllllllllllllllIIllIIIIIIlIIllIl, String lllllllllllllllIIllIIIIIIlIIllII) {
        try {
            SecretKeySpec lllllllllllllllIIllIIIIIIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIllIIIIIIlIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIIllIIIIIIlIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllllIIllIIIIIIlIIllll.init(llllIIIlIIlI[4], lllllllllllllllIIllIIIIIIlIlIIII);
            return new String(lllllllllllllllIIllIIIIIIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllllIIllIIIIIIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIIllIIIIIIlIIlllI) {
            lllllllllllllllIIllIIIIIIlIIlllI.printStackTrace();
            return null;
        }
    }

    private static void lIIIlllIllllIIl() {
        llllIIIlIIII = new String[llllIIIlIIlI[11]];
        R.llllIIIlIIII[R.llllIIIlIIlI[0]] = R."[GetTeleportToGE]: We don't have a proper teleport to GE";
        R.llllIIIlIIII[R.llllIIIlIIlI[2]] = R."[GetTeleportToGE]: Prefer house: {}";
        R.llllIIIlIIII[R.llllIIIlIIlI[4]] = R."Ring of wealth (";
        R.llllIIIlIIII[R.llllIIIlIIlI[5]] = R."Amulet of Glory (";
    }

    private boolean cj() {
        boolean bl;
        if (!R.lIIIlllIlllllIl(RegionManager.hasJewelryBox().equals((Object)JewelryBox.ORNATE) ? 1 : 0) || !R.lIIIlllIlllllIl(RegionManager.hasMountedGlory() ? 1 : 0) || R.lIIIlllIllllIll(RegionManager.getHousePortals().contains(HousePortal.VARROCK) ? 1 : 0)) {
            bl = llllIIIlIIlI[2];
            0;
            if (3 != 3) {
                return ((0x4F ^ 0x1C) & ~(0x2F ^ 0x7C)) != 0;
            }
        } else {
            bl = llllIIIlIIlI[0];
        }
        return bl;
    }

    private static boolean lIIIlllIllllIll(int n2) {
        return n2 != 0;
    }

    private Predicate<Item> ck() {
        if (R.lIIIlllIllllIll(this.cj() ? 1 : 0)) {
            return item -> {
                int n2;
                if (!(R.lIIIlllIlllllll(item.getId(), llllIIIlIIlI[6]) && R.lIIIlllIlllllll(item.getId(), llllIIIlIIlI[7]) && R.lIIIlllIlllllll(item.getId(), llllIIIlIIlI[8]) && R.lIIIlllIlllllll(item.getId(), llllIIIlIIlI[9]) && !R.lIIIllllIIIIIII(item.getId(), llllIIIlIIlI[10]))) {
                    n2 = llllIIIlIIlI[2];
                    0;
                    if (null != null) {
                        return (2 & (2 ^ -1)) != 0;
                    }
                } else {
                    n2 = llllIIIlIIlI[0];
                }
                return n2 != 0;
            };
        }
        return item -> {
            int n2;
            if (!R.lIIIlllIlllllll(item.getId(), llllIIIlIIlI[3]) || !R.lIIIlllIlllllIl(item.getName().contains(llllIIIlIIII[llllIIIlIIlI[4]]) ? 1 : 0) || R.lIIIlllIllllIll(item.getName().contains(llllIIIlIIII[llllIIIlIIlI[5]]) ? 1 : 0)) {
                n2 = llllIIIlIIlI[2];
                0;
                if ((0x66 ^ 0x62) <= 3) {
                    return ((0xF9 ^ 0xBB) & ~(0xD2 ^ 0x90)) != 0;
                }
            } else {
                n2 = llllIIIlIIlI[0];
            }
            return n2 != 0;
        };
    }

    @Inject
    protected R(SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin, h h2) {
        super(squireNightmareConfig, squireNightmarePlugin, h2);
    }
}

