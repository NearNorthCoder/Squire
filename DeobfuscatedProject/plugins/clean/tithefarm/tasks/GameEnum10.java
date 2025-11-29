/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 */
package gg.squire.tithefarm.tasks;

import gg.squire.client.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.d;
import gg.squire.tithefarm.tasks.GameEnum17;

public final class GameEnum10
extends Enum<c> {
    private static final  c[] $VALUES;
    
    public static final  /* enum */ c BOLOGANO;
    public static final  /* enum */ c GOLOVANOVA;
    public static final  /* enum */ c BEST_OPTION;
    
    public static final  /* enum */ c LOGAVANO;

    public static c[] values() {
        return (c[])$VALUES.clone();
    }

    private static void lIllIllIllIlIll() {
        lIlIIIIIIllll = new String[lIlIIIIIlIIIl[7]];
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[2]] = "No matching type found for {}";
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[3]] = "GOLOVANOVA";
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[4]] = "BOLOGANO";
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[5]] = "LOGAVANO";
        c.lIlIIIIIIllll[c.lIlIIIIIlIIIl[6]] = "BEST_OPTION";
    }

    private static boolean lIllIllIllIllll(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIllIllIlllI(Object object) {
        return object == null;
    }

    private static boolean lIllIllIllIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    public f i() {
        switch (d.n[this.ordinal()]) {
            case 1: {
                return f.GOLOVANOVA;
            }
            case 2: {
                return f.BOLOGANO;
            }
            case 3: {
                return f.LOGAVANO;
            }
            case 4: {
                int var1 = Skills.getLevel((Skill)Skill.FARMING);
                if (c.lIllIllIllIllIl(var1, lIlIIIIIlIIIl[0])) {
                    return f.LOGAVANO;
                }
                if (c.lIllIllIllIllIl(var1, lIlIIIIIlIIIl[1])) {
                    return f.BOLOGANO;
                }
                return f.GOLOVANOVA;
            }
        }
        return null;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(GameEnum10.class, string);
    }

        return String.valueOf(var2);
    }

    static {
        c.lIllIllIllIllII();
        c.lIllIllIllIlIll();
        GOLOVANOVA = new GameEnum10();
        BOLOGANO = new GameEnum10();
        LOGAVANO = new GameEnum10();
        BEST_OPTION = new GameEnum10();
        c[] cArray = new c[lIlIIIIIlIIIl[6]];
        cArray[c.lIlIIIIIlIIIl[2]] = GOLOVANOVA;
        cArray[c.lIlIIIIIlIIIl[3]] = BOLOGANO;
        cArray[c.lIlIIIIIlIIIl[4]] = LOGAVANO;
        cArray[c.lIlIIIIIlIIIl[5]] = BEST_OPTION;
        $VALUES = cArray;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Item item) {
        boolean bl;
        void var3;
        void var4;
        f f2 = this.i();
        if (c.lIllIllIllIlllI((Object)f2)) {
            Object[] objectArray = new Object[lIlIIIIIlIIIl[3]];
            objectArray[c.lIlIIIIIlIIIl[2]] = this;
            Log.info((String)lIlIIIIIIllll[lIlIIIIIlIIIl[2]], (Object[])objectArray);
            return lIlIIIIIlIIIl[2];
        }
        String var5 = var4.j();
        if (c.lIllIllIllIllll(var3.getName().contains(var5) ? 1 : 0)) {
            bl = lIlIIIIIlIIIl[3];

            if (-1 != -1) {
                return ((0xAB ^ 0xC5 ^ (0x7E ^ 0x3E)) & (88 + 8 - 55 + 124 ^ 108 + 39 - 53 + 45 ^ -1)) != 0;
            }
        } else {
            bl = lIlIIIIIlIIIl[2];
        }
        return bl;
    }

    private static boolean lIllIllIlllIIII(int n2, int n3) {
        return n2 < n3;
    }
}

