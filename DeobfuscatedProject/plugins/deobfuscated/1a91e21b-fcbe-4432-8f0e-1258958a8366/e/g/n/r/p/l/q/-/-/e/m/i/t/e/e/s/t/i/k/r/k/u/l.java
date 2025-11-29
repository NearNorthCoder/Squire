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
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Bank$WithdrawMode
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.movement.pathfinder.model.BankLocation
 */
package e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u;

import com.google.inject.Inject;
import e.g.n.r.p.l.q.-.-.e.m.i.t.e.e.s.t.i.k.r.k.u.b;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.templeTrekking.TempleTrekkingConfig;
import gg.squire.templeTrekking.TempleTrekkingPlugin;
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
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;

@TaskDesc(name="Banking", priority=15, blocking=true)
public class l
extends Task {
    private final /* synthetic */ b F;
    private static /* synthetic */ String[] lIIllIlIIllll;
    private final /* synthetic */ TempleTrekkingConfig E;
    private final /* synthetic */ TempleTrekkingPlugin D;
    private static /* synthetic */ int[] lIIllIlIlIIII;
    private /* synthetic */ Player G;

    @Inject
    public l(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b b2) {
        this.E = templeTrekkingConfig;
        this.F = b2;
        this.D = templeTrekkingPlugin;
    }

    private static String lIllIIIIlIlIlIl(String llllllllllllllIlllIllllIllIIIIIl, String llllllllllllllIlllIllllIlIlllllI) {
        try {
            SecretKeySpec llllllllllllllIlllIllllIllIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIlIlllllI.getBytes(StandardCharsets.UTF_8)), lIIllIlIlIIII[5]), "DES");
            Cipher llllllllllllllIlllIllllIllIIIIll = Cipher.getInstance("DES");
            llllllllllllllIlllIllllIllIIIIll.init(lIIllIlIlIIII[2], llllllllllllllIlllIllllIllIIIlII);
            return new String(llllllllllllllIlllIllllIllIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllllIllIIIIlI) {
            llllllllllllllIlllIllllIllIIIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlIllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIllIIIIlIlIllI() {
        lIIllIlIIllll = new String[lIIllIlIlIIII[7]];
        l.lIIllIlIIllll[l.lIIllIlIlIIII[0]] = l."Eat";
        l.lIIllIlIIllll[l.lIIllIlIlIIII[1]] = l."Drink";
        l.lIIllIlIIllll[l.lIIllIlIlIIII[2]] = l."Bank is null - something went wrong";
        l.lIIllIlIIllll[l.lIIllIlIlIIII[3]] = l."Bank";
        l.lIIllIlIIllll[l.lIIllIlIlIIII[4]] = l."Bank";
        l.lIIllIlIIllll[l.lIIllIlIlIIII[6]] = l."Bank";
    }

    private static boolean lIllIIIIlIlllII(int n2) {
        return n2 != 0;
    }

    private static boolean lIllIIIIlIllIIl(int n2) {
        return n2 == 0;
    }

    static {
        l.lIllIIIIlIlIlll();
        l.lIllIIIIlIlIllI();
    }

    private static boolean lIllIIIIlIllIlI(Object object) {
        return object != null;
    }

    private static boolean lIllIIIIlIllllI(int n2, int n3) {
        return n2 < n3;
    }

    public boolean run() {
        l llllllllllllllIlllIllllIllIlllII;
        this.G = Players.getLocal();
        if (l.lIllIIIIlIllIII(this.G)) {
            return lIIllIlIlIIII[0];
        }
        if (l.lIllIIIIlIllIIl(llllllllllllllIlllIllllIllIlllII.D.e() ? 1 : 0)) {
            return lIIllIlIlIIII[0];
        }
        int[] nArray = new int[lIIllIlIlIIII[1]];
        nArray[l.lIIllIlIlIIII[0]] = llllllllllllllIlllIllllIllIlllII.E.food().u();
        Item llllllllllllllIlllIllllIllIllIll = Inventory.getFirst((int[])nArray);
        if (l.lIllIIIIlIllIlI(llllllllllllllIlllIllllIllIllIll) && l.lIllIIIIlIllIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS))) {
            String[] stringArray = new String[lIIllIlIlIIII[2]];
            stringArray[l.lIIllIlIlIIII[0]] = lIIllIlIIllll[lIIllIlIlIIII[0]];
            stringArray[l.lIIllIlIlIIII[1]] = lIIllIlIIllll[lIIllIlIlIIII[1]];
            llllllllllllllIlllIllllIllIllIll.interact(stringArray);
            llllllllllllllIlllIllllIllIlllII.sleep(lIIllIlIlIIII[3]);
            return lIIllIlIlIIII[1];
        }
        if (l.lIllIIIIlIlllII(llllllllllllllIlllIllllIllIlllII.E.healInBank() ? 1 : 0) && l.lIllIIIIlIlllII(Bank.isOpen() ? 1 : 0) && l.lIllIIIIlIllIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS))) {
            double llllllllllllllIlllIllllIllIllIlI = (double)(Skills.getLevel((Skill)Skill.HITPOINTS) - Skills.getBoostedLevel((Skill)Skill.HITPOINTS)) / (double)llllllllllllllIlllIllllIllIlllII.E.food().v();
            int llllllllllllllIlllIllllIllIllIII = (int)Math.ceil(llllllllllllllIlllIllllIllIllIlI);
            Bank.withdraw((int)llllllllllllllIlllIllllIllIlllII.E.food().u(), (int)llllllllllllllIlllIllllIllIllIII, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            llllllllllllllIlllIllllIllIlllII.sleep(lIIllIlIlIIII[1]);
            return lIIllIlIlIIII[1];
        }
        if (l.lIllIIIIlIlllII(llllllllllllllIlllIllllIllIlllII.D.i().matchesInventory() ? 1 : 0) && (!l.lIllIIIIlIlllII(llllllllllllllIlllIllllIllIlllII.E.healInBank() ? 1 : 0) || l.lIllIIIIlIlllIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS)))) {
            if (l.lIllIIIIlIlllII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                llllllllllllllIlllIllllIllIlllII.sleep(lIIllIlIlIIII[1]);
                return lIIllIlIlIIII[1];
            }
            if (l.lIllIIIIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                if (l.lIllIIIIlIllIIl(llllllllllllllIlllIllllIllIlllII.D.f().contains((Locatable)llllllllllllllIlllIllllIllIlllII.G) ? 1 : 0)) {
                    Movement.walkTo((WorldArea)llllllllllllllIlllIllllIllIlllII.D.f());
                    0;
                    return lIIllIlIlIIII[1];
                }
                llllllllllllllIlllIllllIllIlllII.D.b(lIIllIlIlIIII[0]);
                return lIIllIlIlIIII[0];
            }
        }
        if (l.lIllIIIIlIlllII(Bank.isOpen() ? 1 : 0)) {
            llllllllllllllIlllIllllIllIlllII.D.i().withdraw();
            0;
            llllllllllllllIlllIllllIllIlllII.sleep(lIIllIlIlIIII[4]);
            return lIIllIlIlIIII[1];
        }
        BankLocation llllllllllllllIlllIllllIllIllIlI = BankLocation.getNearest();
        WorldArea llllllllllllllIlllIllllIllIllIIl = llllllllllllllIlllIllllIllIllIlI.getArea();
        if (l.lIllIIIIlIllllI(llllllllllllllIlllIllllIllIllIIl.distanceTo2D(llllllllllllllIlllIllllIllIlllII.G.getWorldArea()), lIIllIlIlIIII[5])) {
            TileObject llllllllllllllIlllIllllIllIllIII = TileObjects.getNearest(tileObject -> {
                int n2;
                if (l.lIllIIIIlIlllII(tileObject.getName().contains(lIIllIlIIllll[lIIllIlIlIIII[4]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIlIlIIII[1]];
                    stringArray[l.lIIllIlIlIIII[0]] = lIIllIlIIllll[lIIllIlIlIIII[6]];
                    if (l.lIllIIIIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIllIlIlIIII[1];
                        0;
                        if (((0x16 ^ 9) & ~(0x74 ^ 0x6B)) == 0) return n2 != 0;
                        return ((0xB5 ^ 0x8D) & ~(0x9E ^ 0xA6)) != 0;
                    }
                }
                n2 = lIIllIlIlIIII[0];
                return n2 != 0;
            });
            if (l.lIllIIIIlIllIII(llllllllllllllIlllIllllIllIllIII)) {
                System.out.print(lIIllIlIIllll[lIIllIlIlIIII[2]]);
                llllllllllllllIlllIllllIllIlllII.D.forceStop();
            }
            if (l.lIllIIIIlIllIlI(llllllllllllllIlllIllllIllIllIII) && l.lIllIIIIlIllIIl(llllllllllllllIlllIllllIllIlllII.G.isMoving() ? 1 : 0)) {
                llllllllllllllIlllIllllIllIllIII.interact(lIIllIlIIllll[lIIllIlIlIIII[3]]);
                return lIIllIlIlIIII[1];
            }
            0;
            if (null != null) {
                return ((0xF7 ^ 0xB0) & ~(0xF8 ^ 0xBF)) != 0;
            }
        } else {
            Movement.walkTo((BankLocation)llllllllllllllIlllIllllIllIllIlI);
            0;
            return lIIllIlIlIIII[1];
        }
        return lIIllIlIlIIII[0];
    }

    private static boolean lIllIIIIlIllIII(Object object) {
        return object == null;
    }

    private static String lIllIIIIlIlIlII(String llllllllllllllIlllIllllIllIIlllI, String llllllllllllllIlllIllllIllIIllIl) {
        try {
            SecretKeySpec llllllllllllllIlllIllllIllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIllllIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIlllIllllIllIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllllIlllIllllIllIlIIII.init(lIIllIlIlIIII[2], llllllllllllllIlllIllllIllIlIIIl);
            return new String(llllllllllllllIlllIllllIllIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIllllIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIlllIllllIllIIllll) {
            llllllllllllllIlllIllllIllIIllll.printStackTrace();
            return null;
        }
    }

    private static boolean lIllIIIIlIlllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static void lIllIIIIlIlIlll() {
        lIIllIlIlIIII = new int[8];
        l.lIIllIlIlIIII[0] = (0x6B ^ 0x7D) & ~(0x27 ^ 0x31);
        l.lIIllIlIlIIII[1] = 1;
        l.lIIllIlIlIIII[2] = 2;
        l.lIIllIlIlIIII[3] = 3;
        l.lIIllIlIlIIII[4] = 0x66 ^ 8 ^ (0x12 ^ 0x78);
        l.lIIllIlIlIIII[5] = 0x18 ^ 0x10;
        l.lIIllIlIlIIII[6] = 0x61 ^ 0x64;
        l.lIIllIlIlIIII[7] = 0x27 ^ 0x7D ^ (0xC0 ^ 0x9C);
    }
}

