/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.util.Log
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.Skill
 *  net.runelite.api.TileObject
 *  net.runelite.api.coords.WorldArea
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.sepulchre.tasks;

import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.client.util.Log;
import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.movement.Movement;

public final class GameEnum37
extends Enum<h> {
    private  Supplier<WorldArea> area;
    public static final  /* enum */ h FLOOR_IV;
    
    public static final  /* enum */ h FLOOR_II;
    public static final  /* enum */ h FLOOR_I;
    public static final  /* enum */ h FLOOR_V;
    
    private  int nextReq;
    public static final  /* enum */ h FLOOR_III;
    private static final  h[] $VALUES;

    public Supplier<WorldArea> K() {
        return this.area;
    }

    private static boolean lIIIlIIlIlIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    public boolean J() {
        void var3_3;
        void var1;
        h var2;
        Player player = Players.getLocal();
        if (h.lIIIlIIlIlIIIII(player)) {
            return lllIIIlIllll[0];
        }
        if (h.lIIIlIIlIlIIIIl(var2.a((Locatable)var1) ? 1 : 0)) {
            return lllIIIlIllll[0];
        }
        TileObject var3 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.lIIIlIIlIlIIIll(tileObject.getName().toLowerCase().startsWith(lllIIIlIllIl[lllIIIlIllll[9]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIlIllll[1]];
                stringArray[h.lllIIIlIllll[0]] = lllIIIlIllIl[lllIIIlIllll[10]];
                if (h.lIIIlIIlIlIIIll(tileObject.hasAction(stringArray) ? 1 : 0)) {
                    String[] stringArray2 = new String[lllIIIlIllll[1]];
                    stringArray2[h.lllIIIlIllll[0]] = lllIIIlIllIl[lllIIIlIllll[11]];
                    if (h.lIIIlIIlIlIIIll(tileObject.hasAction(stringArray2) ? 1 : 0)) {
                        n2 = lllIIIlIllll[1];

                        if (-2 < 0) return n2 != 0;
                        return (1 & ~1) != 0;
                    }
                }
            }
            n2 = lllIIIlIllll[0];
            return n2 != 0;
        });
        if (h.lIIIlIIlIlIIIII(var3)) {
            Log.error((String)lllIIIlIllIl[lllIIIlIllll[0]]);
            return lllIIIlIllll[0];
        }
        if (h.lIIIlIIlIlIIIlI(Skills.getLevel((Skill)Skill.AGILITY), var2.nextReq)) {
            var3.interact(lllIIIlIllIl[lllIIIlIllll[1]]);
            return lllIIIlIllll[1];
        }
        if (h.lIIIlIIlIlIIIlI(Movement.getRunEnergy(), lllIIIlIllll[2])) {
            var3.interact(lllIIIlIllIl[lllIIIlIllll[3]]);
            return lllIIIlIllll[1];
        }
        TileObject var4 = TileObjects.getNearest(tileObject -> {
            int n2;
            if (h.lIIIlIIlIlIIIll(tileObject.getName().startsWith(lllIIIlIllIl[lllIIIlIllll[7]]) ? 1 : 0)) {
                String[] stringArray = new String[lllIIIlIllll[1]];
                stringArray[h.lllIIIlIllll[0]] = lllIIIlIllIl[lllIIIlIllll[8]];
                if (h.lIIIlIIlIlIIIll(tileObject.hasAction(stringArray) ? 1 : 0) && h.lIIIlIIlIlIIIll(this.area.get().contains((Locatable)tileObject) ? 1 : 0)) {
                    n2 = lllIIIlIllll[1];

                    if (null == null) return n2 != 0;
                    return ((0x14 ^ 0x28 ^ (0x2D ^ 0x18)) & (67 + 0 - 59 + 125 ^ 123 + 16 - 33 + 34 ^ -1)) != 0;
                }
            }
            n2 = lllIIIlIllll[0];
            return n2 != 0;
        });
        if (h.lIIIlIIlIlIIIII(var4)) {
            var3.interact(lllIIIlIllIl[lllIIIlIllll[4]]);
            System.out.println(lllIIIlIllIl[lllIIIlIllll[5]]);
            return lllIIIlIllll[0];
        }
        var3_3.interact(lllIIIlIllIl[lllIIIlIllll[6]]);
        return lllIIIlIllll[1];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(List.of(this.area.get()));
        squireSepulchre.a(this.name());
    }

    public static h[] values() {
        return (h[])$VALUES.clone();
    }

    private static boolean lIIIlIIlIlIIIIl(int n2) {
        return n2 == 0;
    }

    static {
        h.lIIIlIIlIIlllll();
        h.lIIIlIIlIIlllIl();
        FLOOR_I = new GameEnum37(new RegionPoint(lllIIIlIllll[13], lllIIIlIllll[13], lllIIIlIllll[1], b.C), lllIIIlIllll[12], lllIIIlIllll[12], lllIIIlIllll[14]);
        FLOOR_II = new GameEnum37(new RegionPoint(lllIIIlIllll[13], lllIIIlIllll[13], lllIIIlIllll[1], b.G), lllIIIlIllll[12], lllIIIlIllll[12], lllIIIlIllll[16]);
        FLOOR_III = new GameEnum37(new RegionPoint(lllIIIlIllll[13], lllIIIlIllll[18], lllIIIlIllll[1], b.J), lllIIIlIllll[12], lllIIIlIllll[5], lllIIIlIllll[19]);
        FLOOR_IV = new GameEnum37(new RegionPoint(lllIIIlIllll[21], lllIIIlIllll[22], lllIIIlIllll[1], b.L), lllIIIlIllll[23], lllIIIlIllll[24], lllIIIlIllll[25]);
        FLOOR_V = new GameEnum37(new RegionPoint(lllIIIlIllll[26], lllIIIlIllll[27], lllIIIlIllll[0], b.N), lllIIIlIllll[6], lllIIIlIllll[5], lllIIIlIllll[28]);
        h[] hArray = new h[lllIIIlIllll[6]];
        hArray[h.lllIIIlIllll[0]] = FLOOR_I;
        hArray[h.lllIIIlIllll[1]] = FLOOR_II;
        hArray[h.lllIIIlIllll[3]] = FLOOR_III;
        hArray[h.lllIIIlIllll[4]] = FLOOR_IV;
        hArray[h.lllIIIlIllll[5]] = FLOOR_V;
        $VALUES = hArray;
    }

    private static boolean lIIIlIIlIlIIIll(int n2) {
        return n2 != 0;
    }

    private static void lIIIlIIlIIlllIl() {
        lllIIIlIllIl = new String[lllIIIlIllll[29]];
        h.lllIIIlIllIl[h.lllIIIlIllll[0]] = "obelisk is null";
        h.lllIIIlIllIl[h.lllIIIlIllll[1]] = "Quick-exit";
        h.lllIIIlIllIl[h.lllIIIlIllll[3]] = "Activate";
        h.lllIIIlIllIl[h.lllIIIlIllll[4]] = "Quick-exit";
        h.lllIIIlIllIl[h.lllIIIlIllll[5]] = "we null";
        h.lllIIIlIllIl[h.lllIIIlIllll[6]] = "Climb-down";
        h.lllIIIlIllIl[h.lllIIIlIllll[7]] = "Stairs";
        h.lllIIIlIllIl[h.lllIIIlIllll[8]] = "Climb-down";
        h.lllIIIlIllIl[h.lllIIIlIllll[9]] = "magical obelisk";
        h.lllIIIlIllIl[h.lllIIIlIllll[10]] = "Activate";
        h.lllIIIlIllIl[h.lllIIIlIllll[11]] = "Quick-exit";
        h.lllIIIlIllIl[h.lllIIIlIllll[12]] = "FLOOR_I";
        h.lllIIIlIllIl[h.lllIIIlIllll[15]] = "FLOOR_II";
        h.lllIIIlIllIl[h.lllIIIlIllll[17]] = "FLOOR_III";
        h.lllIIIlIllIl[h.lllIIIlIllll[20]] = "FLOOR_IV";
        h.lllIIIlIllIl[h.lllIIIlIllll[23]] = "FLOOR_V";
    }

    private static boolean lIIIlIIlIlIIIII(Object object) {
        return object == null;
    }

        return String.valueOf(var5);
    }

    public boolean a(Locatable locatable) {
        if (h.lIIIlIIlIlIIIll(this.area.get().contains(locatable) ? 1 : 0)) {
            return lllIIIlIllll[1];
        }
        return lllIIIlIllll[0];
    }

    private GameEnum37(RegionPoint regionPoint, int n3, int n4, int n5) {
        this.area = () -> new WorldArea(SquireSepulchre.a(regionPoint), n3, n4);
        this.nextReq = n5;
    }

    public static h valueOf(String string) {
        return Enum.valueOf(GameEnum37.class, string);
    }
}

