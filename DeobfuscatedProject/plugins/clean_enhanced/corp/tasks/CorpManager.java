/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.movement.Movement
 *  net.unethicalite.api.widgets.Prayers
 */
package gg.squire.corp.tasks;

import gg.squire.corp.tasks.CorpTaskBase;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;

public abstract class CorpManager
extends CorpTaskBase {

    public boolean CorpManager() {
        if ((Combat.getSpecEnergy() < 2)) {
            return 0;
        }
        if ((Combat.getMissingHealth( > 0))) {
            return 0;
        }
        if ((Prayers.getPoints() < Skills.getLevel((SkiSkill.PRAYER))) {
            return 0;
        }
        if ((Movement.getRunEnergy() < 3)) {
            return 0;
        }
        return 1;
    }

    private static String var3(String var4, String var5) {
        var4 = new String(Base64.getDecoder().decode(var4.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var6 = new StringBuilder();
        char[] var7 = var5.toCharArray();
        int var8 = 1;
        char[] var9 = var4.toCharArray();
        int var10 = var9.length;
        int var11 = 1;
        while (var11 < var10) {
            char var12 = var9[var11];
            var6.append((char)(var12 ^ var7[var8 % var7.length]));
            0;
            ++var8;
            ++var11;
            0;
            if ((138 + 1 - 99 + 145 ^ 38 + 152 - 4 + 3) == (106 + 31 - 62 + 57 ^ 101 + 99 - 136 + 64)) continue;
            return null;
        }
        return String.valueOf(var6);
    }

    public boolean l() {
        boolean bl;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if ((tileObject.getName( != 0).equals(var2[1]) ? 1 : 0)) {
                String[] stringArray = new String[0];
                stringArray[1] = var2[0];
                if ((tileObject.hasActionstringArray)) {
                    n2 = 0;
                    0;
                    if (-1 <= 2) return n2 != 0;
                    return ((0x72 ^ 0x12) & ~(0x34 ^ 0x54)) != 0;
                }
            }
            n2 = 1;
            return n2 != 0;
        });
        if tileObject2 != null {
            bl = 0;
            0;
            if null != null {
                return ((0x5E ^ 7 ^ (0x78 ^ 0x70)) & (0xB ^ 0x17 ^ (0x22 ^ 0x6F) ^ -1)) != 0;
            }
        } else {
            bl = 1;
        }
        return bl;
    }

        catch (Exception var18) {
            var18.printStackTrace();
            return null;
        }
    }
}

