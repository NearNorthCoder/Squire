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
package gg.squire.templetrekking.tasks;

import com.google.inject.Inject;
import gg.squire.templetrekking.tasks.BHelper;
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
public class BankingTask
extends Task {
    private final  b F;
    
    private final  TempleTrekkingConfig E;
    private final  TempleTrekkingPlugin D;
    
    private  Player G;

    @Inject
    public BankingTask(TempleTrekkingPlugin templeTrekkingPlugin, TempleTrekkingConfig templeTrekkingConfig, b b2) {
        this.E = templeTrekkingConfig;
        this.F = b2;
        this.D = templeTrekkingPlugin;
    }

    private static boolean lIllIIIIlIllIll(int n2, int n3) {
        return n2 != n3;
    }

    private static void lIllIIIIlIlIllI() {
        lIIllIlIIllll = new String[lIIllIlIlIIII[7]];
        l.lIIllIlIIllll[l.lIIllIlIlIIII[0]] = "Eat";
        l.lIIllIlIIllll[l.lIIllIlIlIIII[1]] = "Drink";
        l.lIIllIlIIllll[l.lIIllIlIlIIII[2]] = "Bank is null - something went wrong";
        l.lIIllIlIIllll[l.lIIllIlIlIIII[3]] = "Bank";
        l.lIIllIlIIllll[l.lIIllIlIlIIII[4]] = "Bank";
        l.lIIllIlIIllll[l.lIIllIlIlIIII[6]] = "Bank";
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
        l var1;
        this.G = Players.getLocal();
        if (l.lIllIIIIlIllIII(this.G)) {
            return lIIllIlIlIIII[0];
        }
        if (l.lIllIIIIlIllIIl(var1.D.e() ? 1 : 0)) {
            return lIIllIlIlIIII[0];
        }
        int[] nArray = new int[lIIllIlIlIIII[1]];
        nArray[l.lIIllIlIlIIII[0]] = var1.E.food().u();
        Item var2 = Inventory.getFirst((int[])nArray);
        if (l.lIllIIIIlIllIlI(var2) && l.lIllIIIIlIllIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS))) {
            String[] stringArray = new String[lIIllIlIlIIII[2]];
            stringArray[l.lIIllIlIlIIII[0]] = lIIllIlIIllll[lIIllIlIlIIII[0]];
            stringArray[l.lIIllIlIlIIII[1]] = lIIllIlIIllll[lIIllIlIlIIII[1]];
            var2.interact(stringArray);
            var1.sleep(lIIllIlIlIIII[3]);
            return lIIllIlIlIIII[1];
        }
        if (l.lIllIIIIlIlllII(var1.E.healInBank() ? 1 : 0) && l.lIllIIIIlIlllII(Bank.isOpen() ? 1 : 0) && l.lIllIIIIlIllIll(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS))) {
            double var3 = (double)(Skills.getLevel((Skill)Skill.HITPOINTS) - Skills.getBoostedLevel((Skill)Skill.HITPOINTS)) / (double)var1.E.food().v();
            int var4 = (int)Math.ceil(var3);
            Bank.withdraw((int)var1.E.food().u(), (int)var4, (Bank.WithdrawMode)Bank.WithdrawMode.ITEM);
            var1.sleep(lIIllIlIlIIII[1]);
            return lIIllIlIlIIII[1];
        }
        if (l.lIllIIIIlIlllII(var1.D.i().matchesInventory() ? 1 : 0) && (!l.lIllIIIIlIlllII(var1.E.healInBank() ? 1 : 0) || l.lIllIIIIlIlllIl(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS)))) {
            if (l.lIllIIIIlIlllII(Bank.isOpen() ? 1 : 0)) {
                Bank.close();
                var1.sleep(lIIllIlIlIIII[1]);
                return lIIllIlIlIIII[1];
            }
            if (l.lIllIIIIlIllIIl(Bank.isOpen() ? 1 : 0)) {
                if (l.lIllIIIIlIllIIl(var1.D.f().contains((Locatable)var1.G) ? 1 : 0)) {
                    Movement.walkTo((WorldArea)var1.D.f());

                    return lIIllIlIlIIII[1];
                }
                var1.D.b(lIIllIlIlIIII[0]);
                return lIIllIlIlIIII[0];
            }
        }
        if (l.lIllIIIIlIlllII(Bank.isOpen() ? 1 : 0)) {
            var1.D.i().withdraw();

            var1.sleep(lIIllIlIlIIII[4]);
            return lIIllIlIlIIII[1];
        }
        BankLocation var3 = BankLocation.getNearest();
        WorldArea var5 = var3.getArea();
        if (l.lIllIIIIlIllllI(var5.distanceTo2D(var1.G.getWorldArea()), lIIllIlIlIIII[5])) {
            TileObject var4 = TileObjects.getNearest(tileObject -> {
                int n2;
                if (l.lIllIIIIlIlllII(tileObject.getName().contains(lIIllIlIIllll[lIIllIlIlIIII[4]]) ? 1 : 0)) {
                    String[] stringArray = new String[lIIllIlIlIIII[1]];
                    stringArray[l.lIIllIlIlIIII[0]] = lIIllIlIIllll[lIIllIlIlIIII[6]];
                    if (l.lIllIIIIlIlllII(tileObject.hasAction(stringArray) ? 1 : 0)) {
                        n2 = lIIllIlIlIIII[1];

                        if (((0x16 ^ 9) & ~(0x74 ^ 0x6B)) == 0) return n2 != 0;
                        return false;
                    }
                }
                n2 = lIIllIlIlIIII[0];
                return n2 != 0;
            });
            if (l.lIllIIIIlIllIII(var4)) {
                System.out.print(lIIllIlIIllll[lIIllIlIlIIII[2]]);
                var1.D.forceStop();
            }
            if (l.lIllIIIIlIllIlI(var4) && l.lIllIIIIlIllIIl(var1.G.isMoving() ? 1 : 0)) {
                var4.interact(lIIllIlIIllll[lIIllIlIlIIII[3]]);
                return lIIllIlIlIIII[1];
            }

            }
        } else {
            Movement.walkTo((BankLocation)var3);

            return lIIllIlIlIIII[1];
        }
        return lIIllIlIlIIII[0];
    }

    private static boolean lIllIIIIlIllIII(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIlIlllIl(int n2, int n3) {
        return n2 >= n3;
    }

}

