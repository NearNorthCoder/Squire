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
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Prayers;

public abstract class CorpTaskBase
extends CorpTaskBase {

    static {
        m.lllIIIllIIIllI();
        m.lllIIIllIIIlIl();
    }

    private static boolean lllIIIllIIlIlI(int n2) {
        return n2 != 0;
    }

    private static boolean lllIIIllIIIlll(Object object) {
        return object != null;
    }

    public boolean CorpTaskBase() {
        if (m.lllIIIllIIlIII(Combat.getSpecEnergy(), lIlIllllllll[2])) {
            return lIlIllllllll[0];
        }
        if (m.lllIIIllIIlIIl(Combat.getMissingHealth())) {
            return lIlIllllllll[0];
        }
        if (m.lllIIIllIIlIII(Prayers.getPoints(), Skills.getLevel((Skill)Skill.PRAYER))) {
            return lIlIllllllll[0];
        }
        if (m.lllIIIllIIlIII(Movement.getRunEnergy(), lIlIllllllll[3])) {
            return lIlIllllllll[0];
        }
        return lIlIllllllll[1];
    }

    private static void lllIIIllIIIlIl() {
        lIlIlllllllI = new String[lIlIllllllll[4]];
        m.lIlIlllllllI[m.lIlIllllllll[1]] = "Portal";
        m.lIlIlllllllI[m.lIlIllllllll[0]] = "Lock";
    }

        return String.valueOf(var1);
    }

    public boolean l() {
        boolean bl;
        TileObject tileObject2 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (m.lllIIIllIIlIlI(tileObject.getName().equals(lIlIlllllllI[lIlIllllllll[1]]) ? 1 : 0)) {
                String[] stringArray = new String[lIlIllllllll[0]];
                stringArray[m.lIlIllllllll[1]] = lIlIlllllllI[lIlIllllllll[0]];
                if (m.lllIIIllIIlIlI(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    n2 = lIlIllllllll[0];

                    if (-1 <= 2) return n2 != 0;
                    return false;
                }
            }
            n2 = lIlIllllllll[1];
            return n2 != 0;
        });
        if (m.lllIIIllIIIlll(tileObject2)) {
            bl = lIlIllllllll[0];

            }
        } else {
            bl = lIlIllllllll[1];
        }
        return bl;
    }

    private static boolean lllIIIllIIlIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lllIIIllIIlIIl(int n2) {
        return n2 > 0;
    }

}

