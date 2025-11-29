/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  com.google.inject.Singleton
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileItem
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.commons.Time
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileItems
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package gg.squire.gauntlet.tasks;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import gg.squire.gauntlet.tasks.GauntletManager;
import gg.squire.gauntlet.tasks.GameEnum38;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.e;
import gg.squire.gauntlet.tasks.GameEnum;
import n.i.l.r.u.e.g.a.t.t.u.s.e.q.-.m;
import gg.squire.gauntlet.tasks.GauntletTaskBase;
import net.runelite.api.Item;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileItems;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;

@Singleton
@TaskDesc(name="Cooking food", priority=4, blocking=true)
public class CookingFoodTask
extends GauntletTaskBase {
    
    private  int bP;

    private static boolean lllllllllIllll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean be() {
        void var4_5;
        Item var1;
        B var2;
        void var3;
        void var4;
        m m2 = this.ba.V().av();
        List list = TileItems.getAll(tileItem -> {
            int n2;
            if (B.lllllllllIllll(m2.e(tileItem.getWorldLocation()) ? 1 : 0) && B.lllllllllIllll(i.FISH.aA().contains(tileItem.getId()) ? 1 : 0)) {
                n2 = llIIlllIlIll[0];

                if (((0x42 ^ 0x2B ^ (7 ^ 0x3F)) & (0x31 ^ 0x73 ^ (0xA7 ^ 0xB4) ^ -1)) != 0) {
                    return ((130 + 8 - 71 + 130 ^ 129 + 98 - 91 + 9) & (0xAC ^ 0x97 ^ (0x14 ^ 0x7B) ^ -1)) != 0;
                }
            } else {
                n2 = llIIlllIlIll[1];
            }
            return n2 != 0;
        });
        if (B.lllllllllIlIlI(list.size()) && B.lllllllllIlIlI(Inventory.getFreeSlots())) {
            TileItem tileItem2 = (TileItem)list.get(llIIlllIlIll[1]);
            tileItem2.interact(llIIlllIlIlI[llIIlllIlIll[1]]);
            m2.l(TileItems.getAll(tileItem -> {
                int n2;
                if (B.lllllllllIllll(m2.e(tileItem.getWorldLocation()) ? 1 : 0) && B.lllllllllIllll(i.FISH.aA().contains(tileItem.getId()) ? 1 : 0)) {
                    n2 = llIIlllIlIll[0];

                    if ((6 ^ 2) <= 0) {
                        return false;
                    }
                } else {
                    n2 = llIIlllIlIll[1];
                }
                return n2 != 0;
            }).size());
            return llIIlllIlIll[0];
        }
        var4.l(var3.size());
        int var5 = i.FISH.aC();
        if (B.lllllllllIlIll(var5)) {
            var2.bP = llIIlllIlIll[2];
            return llIIlllIlIll[1];
        }
        if (B.lllllllllIllII(var5, var2.bP)) {
            var2.bP = var5;
            Time.sleepTick();

            return llIIlllIlIll[0];
        }
        TileObject var6 = TileObjects.getNearest(tileObject -> e.aE.contains(tileObject.getId()));
        if (B.lllllllllIllIl(var6)) {
            return llIIlllIlIll[1];
        }
        Player var7 = Players.getLocal();
        if (B.lllllllllIllIl(var7)) {
            return llIIlllIlIll[1];
        }
        if (B.lllllllllIllII(Skills.getBoostedLevel((Skill)Skill.HITPOINTS), Skills.getLevel((Skill)Skill.HITPOINTS) - llIIlllIlIll[3]) && B.lllllllllIlllI(var1 = Inventory.getFirst(item -> e.aH.contains(item.getId())))) {
            var1.interact(llIIlllIlIlI[llIIlllIlIll[0]]);
        }
        var4_5.interact(llIIlllIlIlI[llIIlllIlIll[4]]);
        return llIIlllIlIll[0];
    }

    private static boolean lllllllllIllIl(Object object) {
        return object == null;
    }

    private static boolean lllllllllIlIll(int n2) {
        return n2 == 0;
    }

    private static boolean lllllllllIlIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lllllllllIlllI(Object object) {
        return object != null;
    }

    @Inject
    public CookingFoodTask(c c2) {
        d[] dArray = new d[llIIlllIlIll[0]];
        dArray[B.llIIlllIlIll[1]] = d.PREPARE_BOSS_FIGHT;
        super(c2, dArray);
        this.bP = llIIlllIlIll[2];
    }

        return String.valueOf(var8);
    }

    static {
        B.lllllllllIlIIl();
        B.lllllllllIlIII();
    }

    private static void lllllllllIlIII() {
        llIIlllIlIlI = new String[llIIlllIlIll[5]];
        B.llIIlllIlIlI[B.llIIlllIlIll[1]] = "Take";
        B.llIIlllIlIlI[B.llIIlllIlIll[0]] = "Eat";
        B.llIIlllIlIlI[B.llIIlllIlIll[4]] = "Cook";
    }

    private static boolean lllllllllIllII(int n2, int n3) {
        return n2 < n3;
    }

}

