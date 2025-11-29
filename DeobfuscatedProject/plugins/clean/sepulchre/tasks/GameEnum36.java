/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Triple
 *  net.runelite.api.Locatable
 *  net.runelite.api.Player
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.coords.RegionPoint
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.movement.Movement
 */
package gg.squire.sepulchre.tasks;

import gg.squire.sepulchre.tasks.GameEnum26;
import e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.b;
import gg.squire.sepulchre.tasks.SepulchreManager;
import gg.squire.sepulchre.SquireSepulchre;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Triple;
import net.runelite.api.Locatable;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.coords.RegionPoint;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.movement.Movement;

public final class GameEnum36
extends Enum<K> {
    public static final  /* enum */ K WEST_II_II;
    public static final  /* enum */ K BOTTOM_V_III;
    public static final  /* enum */ K SOUTH_II_I_EXTEND;
    public static final  /* enum */ K NORTH_IV_IV;
    public static final  /* enum */ K TOP_V_VII;
    public static final  /* enum */ K SOUTH_IV_III;
     Supplier<List<WorldArea>> startAreas;
    public static final  /* enum */ K WEST_III_IV;
    public static final  /* enum */ K EAST_II_IV;
    public static final  /* enum */ K MIDDLE_V_XVI;
    public static final  /* enum */ K NORTH_II_V;
    
    public static final  /* enum */ K EAST_III_III_EXTEND;
     Supplier<WorldPoint> destination;
     L type;
    private static final  K[] $VALUES;
    public static final  /* enum */ K MIDDLE_V_II;
    public static final  /* enum */ K TOP_V_VI;
    public static final  /* enum */ K MIDDLE_V_XIV;
    public static final  /* enum */ K WEST_IV_III;
    public static final  /* enum */ K SOUTH_IV_V;
    public static final  /* enum */ K EAST_IV_V;
    public static final  /* enum */ K WEST_IV_V;
    public static final  /* enum */ K EAST_IV_IV;
    public static final  /* enum */ K WEST_IV_VI;
    public static final  /* enum */ K WEST_IV_II;
    public static final  /* enum */ K NORTH_IV_I;
    public static final  /* enum */ K SOUTH_II_II;
    public static final  /* enum */ K MIDDLE_V_XII;
    public static final  /* enum */ K WEST_IV_IV;
     Supplier<WorldPoint> startPoint;
    public static final  /* enum */ K NORTH_IV_II;

    public Supplier<WorldPoint> s() {
        return this.destination;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(d d2, SquireSepulchre squireSepulchre) {
        void var1;
        K var2;
        Player player = Players.getLocal();
        if (K.lIIIlIIIlIllIIl(player)) {
            return lllIIIIllIlI[0];
        }
        if (K.lIIIlIIIlIllIlI(var2.a((Locatable)var1) ? 1 : 0)) {
            return lllIIIIllIlI[0];
        }
        System.out.println(lllIIIIlIIII[lllIIIIllIlI[0]]);
        this.a(squireSepulchre);
        Movement.setDestination((WorldPoint)this.destination.get());
        return lllIIIIllIlI[1];
    }

        return String.valueOf(var3);
    }

    private static void lIIIlIIIlIlIlll() {
        lllIIIIlIIII = new String[lllIIIIllIlI[54]];
        K.lllIIIIlIIII[K.lllIIIIllIlI[0]] = "in here!";
        K.lllIIIIlIIII[K.lllIIIIllIlI[1]] = "WEST_II_II";
        K.lllIIIIlIIII[K.lllIIIIllIlI[4]] = "SOUTH_II_I_EXTEND";
        K.lllIIIIlIIII[K.lllIIIIllIlI[10]] = "SOUTH_II_II";
        K.lllIIIIlIIII[K.lllIIIIllIlI[18]] = "EAST_II_IV";
        K.lllIIIIlIIII[K.lllIIIIllIlI[22]] = "NORTH_II_V";
        K.lllIIIIlIIII[K.lllIIIIllIlI[14]] = "EAST_III_III_EXTEND";
        K.lllIIIIlIIII[K.lllIIIIllIlI[31]] = "WEST_III_IV";
        K.lllIIIIlIIII[K.lllIIIIllIlI[2]] = "NORTH_IV_I";
        K.lllIIIIlIIII[K.lllIIIIllIlI[38]] = "NORTH_IV_II";
        K.lllIIIIlIIII[K.lllIIIIllIlI[5]] = "SOUTH_IV_III";
        K.lllIIIIlIIII[K.lllIIIIllIlI[16]] = "SOUTH_IV_V";
        K.lllIIIIlIIII[K.lllIIIIllIlI[9]] = "NORTH_IV_IV";
        K.lllIIIIlIIII[K.lllIIIIllIlI[40]] = "EAST_IV_IV";
        K.lllIIIIlIIII[K.lllIIIIllIlI[36]] = "EAST_IV_V";
        K.lllIIIIlIIII[K.lllIIIIllIlI[17]] = "WEST_IV_II";
        K.lllIIIIlIIII[K.lllIIIIllIlI[15]] = "WEST_IV_III";
        K.lllIIIIlIIII[K.lllIIIIllIlI[13]] = "WEST_IV_IV";
        K.lllIIIIlIIII[K.lllIIIIllIlI[45]] = "WEST_IV_V";
        K.lllIIIIlIIII[K.lllIIIIllIlI[47]] = "WEST_IV_VI";
        K.lllIIIIlIIII[K.lllIIIIllIlI[28]] = "TOP_V_VI";
        K.lllIIIIlIIII[K.lllIIIIllIlI[43]] = "TOP_V_VII";
        K.lllIIIIlIIII[K.lllIIIIllIlI[46]] = "MIDDLE_V_II";
        K.lllIIIIlIIII[K.lllIIIIllIlI[21]] = "MIDDLE_V_XII";
        K.lllIIIIlIIII[K.lllIIIIllIlI[34]] = "MIDDLE_V_XIV";
        K.lllIIIIlIIII[K.lllIIIIllIlI[51]] = "MIDDLE_V_XVI";
        K.lllIIIIlIIII[K.lllIIIIllIlI[20]] = "BOTTOM_V_III";
    }

    static {
        K.lIIIlIIIlIllIII();
        K.lIIIlIIIlIlIlll();
        WEST_II_II = new GameEnum36(List.of(new Triple((Object)new RegionPoint(lllIIIIllIlI[2], lllIIIIllIlI[3], lllIIIIllIlI[4], b.G), (Object)lllIIIIllIlI[5], (Object)lllIIIIllIlI[6]), new Triple((Object)new RegionPoint(lllIIIIllIlI[7], lllIIIIllIlI[8], lllIIIIllIlI[4], b.I), (Object)lllIIIIllIlI[9], (Object)lllIIIIllIlI[10])), new RegionPoint(lllIIIIllIlI[11], lllIIIIllIlI[12], lllIIIIllIlI[4], b.I), new RegionPoint(lllIIIIllIlI[11], lllIIIIllIlI[12], lllIIIIllIlI[4], b.I), L.WALK);
        SOUTH_II_I_EXTEND = new GameEnum36(new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[13], lllIIIIllIlI[4], b.G), lllIIIIllIlI[4], lllIIIIllIlI[4], new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[13], lllIIIIllIlI[4], b.G), new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[13], lllIIIIllIlI[4], b.G), L.WALK);
        SOUTH_II_II = new GameEnum36(new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[15], lllIIIIllIlI[4], b.G), lllIIIIllIlI[16], lllIIIIllIlI[14], new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[17], lllIIIIllIlI[4], b.G), new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[17], lllIIIIllIlI[4], b.G), L.WALK);
        EAST_II_IV = new GameEnum36(new RegionPoint(lllIIIIllIlI[19], lllIIIIllIlI[20], lllIIIIllIlI[4], b.G), lllIIIIllIlI[15], lllIIIIllIlI[5], new RegionPoint(lllIIIIllIlI[12], lllIIIIllIlI[21], lllIIIIllIlI[4], b.G), new RegionPoint(lllIIIIllIlI[12], lllIIIIllIlI[21], lllIIIIllIlI[4], b.G), L.WALK);
        NORTH_II_V = new GameEnum36(new RegionPoint(lllIIIIllIlI[23], lllIIIIllIlI[24], lllIIIIllIlI[1], b.G), lllIIIIllIlI[14], lllIIIIllIlI[5], new RegionPoint(lllIIIIllIlI[25], lllIIIIllIlI[11], lllIIIIllIlI[1], b.G), new RegionPoint(lllIIIIllIlI[25], lllIIIIllIlI[11], lllIIIIllIlI[1], b.G), L.WALK);
        EAST_III_III_EXTEND = new GameEnum36(new RegionPoint(lllIIIIllIlI[26], lllIIIIllIlI[27], lllIIIIllIlI[4], b.J), lllIIIIllIlI[28], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[30], lllIIIIllIlI[4], b.J), new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[30], lllIIIIllIlI[4], b.J), L.WALK);
        WEST_III_IV = new GameEnum36(new RegionPoint(lllIIIIllIlI[1], lllIIIIllIlI[32], lllIIIIllIlI[4], b.J), lllIIIIllIlI[10], lllIIIIllIlI[17], new RegionPoint(lllIIIIllIlI[18], lllIIIIllIlI[33], lllIIIIllIlI[4], b.J), new RegionPoint(lllIIIIllIlI[18], lllIIIIllIlI[33], lllIIIIllIlI[4], b.J), L.WALK);
        NORTH_IV_I = new GameEnum36(new RegionPoint(lllIIIIllIlI[34], lllIIIIllIlI[35], lllIIIIllIlI[4], b.L), lllIIIIllIlI[36], lllIIIIllIlI[31], new RegionPoint(lllIIIIllIlI[21], lllIIIIllIlI[37], lllIIIIllIlI[4], b.L), new RegionPoint(lllIIIIllIlI[21], lllIIIIllIlI[37], lllIIIIllIlI[4], b.L), L.WALK);
        NORTH_IV_II = new GameEnum36(new RegionPoint(lllIIIIllIlI[16], lllIIIIllIlI[39], lllIIIIllIlI[4], b.L), lllIIIIllIlI[40], lllIIIIllIlI[38], new RegionPoint(lllIIIIllIlI[5], lllIIIIllIlI[33], lllIIIIllIlI[4], b.L), new RegionPoint(lllIIIIllIlI[5], lllIIIIllIlI[33], lllIIIIllIlI[4], b.L), L.WALK);
        SOUTH_IV_III = new GameEnum36(new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[15], lllIIIIllIlI[4], b.L), lllIIIIllIlI[36], lllIIIIllIlI[40], new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[17], lllIIIIllIlI[4], b.L), new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[17], lllIIIIllIlI[4], b.L), L.WALK);
        SOUTH_IV_V = new GameEnum36(new RegionPoint(lllIIIIllIlI[16], lllIIIIllIlI[12], lllIIIIllIlI[4], b.M), lllIIIIllIlI[16], lllIIIIllIlI[40], new RegionPoint(lllIIIIllIlI[34], lllIIIIllIlI[41], lllIIIIllIlI[4], b.M), new RegionPoint(lllIIIIllIlI[34], lllIIIIllIlI[41], lllIIIIllIlI[4], b.M), L.WALK);
        NORTH_IV_IV = new GameEnum36(new RegionPoint(lllIIIIllIlI[31], lllIIIIllIlI[42], lllIIIIllIlI[4], b.L), lllIIIIllIlI[10], lllIIIIllIlI[43], new RegionPoint(lllIIIIllIlI[9], lllIIIIllIlI[7], lllIIIIllIlI[4], b.L), new RegionPoint(lllIIIIllIlI[9], lllIIIIllIlI[7], lllIIIIllIlI[4], b.L), L.WALK);
        EAST_IV_IV = new GameEnum36(new RegionPoint(lllIIIIllIlI[23], lllIIIIllIlI[22], lllIIIIllIlI[1], b.L), lllIIIIllIlI[14], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[25], lllIIIIllIlI[31], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[25], lllIIIIllIlI[31], lllIIIIllIlI[1], b.L), L.WALK);
        EAST_IV_V = new GameEnum36(new RegionPoint(lllIIIIllIlI[39], lllIIIIllIlI[22], lllIIIIllIlI[1], b.L), lllIIIIllIlI[15], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[28], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[28], lllIIIIllIlI[1], b.L), L.WALK);
        WEST_IV_II = new GameEnum36(new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[13], lllIIIIllIlI[1], b.L), lllIIIIllIlI[10], lllIIIIllIlI[22], new RegionPoint(lllIIIIllIlI[45], lllIIIIllIlI[46], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[45], lllIIIIllIlI[46], lllIIIIllIlI[1], b.L), L.WALK);
        WEST_IV_III = new GameEnum36(new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[46], lllIIIIllIlI[1], b.L), lllIIIIllIlI[10], lllIIIIllIlI[18], new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[20], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[20], lllIIIIllIlI[1], b.L), L.WALK);
        WEST_IV_IV = new GameEnum36(List.of(new Triple((Object)new RegionPoint(lllIIIIllIlI[13], lllIIIIllIlI[20], lllIIIIllIlI[1], b.L), (Object)lllIIIIllIlI[10], (Object)lllIIIIllIlI[34]), new Triple((Object)new RegionPoint(lllIIIIllIlI[2], lllIIIIllIlI[30], lllIIIIllIlI[1], b.L), (Object)lllIIIIllIlI[38], (Object)lllIIIIllIlI[10])), new RegionPoint(lllIIIIllIlI[31], lllIIIIllIlI[44], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[31], lllIIIIllIlI[44], lllIIIIllIlI[1], b.L), L.WALK);
        WEST_IV_V = new GameEnum36(new RegionPoint(lllIIIIllIlI[16], lllIIIIllIlI[22], lllIIIIllIlI[1], b.L), lllIIIIllIlI[18], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[17], lllIIIIllIlI[31], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[17], lllIIIIllIlI[31], lllIIIIllIlI[1], b.L), L.WALK);
        WEST_IV_VI = new GameEnum36(new RegionPoint(lllIIIIllIlI[17], lllIIIIllIlI[22], lllIIIIllIlI[1], b.L), lllIIIIllIlI[15], lllIIIIllIlI[10], new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[9], lllIIIIllIlI[1], b.L), new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[9], lllIIIIllIlI[1], b.L), L.WALK);
        TOP_V_VI = new GameEnum36(new RegionPoint(lllIIIIllIlI[10], lllIIIIllIlI[42], lllIIIIllIlI[4], b.N), lllIIIIllIlI[10], lllIIIIllIlI[2], new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[39], lllIIIIllIlI[4], b.N), new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[39], lllIIIIllIlI[4], b.N), L.WALK);
        TOP_V_VII = new GameEnum36(new RegionPoint(lllIIIIllIlI[10], lllIIIIllIlI[15], lllIIIIllIlI[4], b.N), lllIIIIllIlI[38], lllIIIIllIlI[15], new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[18], lllIIIIllIlI[4], b.N), new RegionPoint(lllIIIIllIlI[22], lllIIIIllIlI[18], lllIIIIllIlI[4], b.N), L.WALK);
        MIDDLE_V_II = new GameEnum36(new RegionPoint(lllIIIIllIlI[0], lllIIIIllIlI[39], lllIIIIllIlI[1], b.N), lllIIIIllIlI[10], lllIIIIllIlI[2], new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[24], lllIIIIllIlI[1], b.N), new RegionPoint(lllIIIIllIlI[14], lllIIIIllIlI[24], lllIIIIllIlI[1], b.N), L.WALK);
        MIDDLE_V_XII = new GameEnum36(new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[25], lllIIIIllIlI[1], b.N), lllIIIIllIlI[10], lllIIIIllIlI[2], new RegionPoint(lllIIIIllIlI[12], lllIIIIllIlI[48], lllIIIIllIlI[1], b.N), new RegionPoint(lllIIIIllIlI[12], lllIIIIllIlI[48], lllIIIIllIlI[1], b.N), L.WALK);
        MIDDLE_V_XIV = new GameEnum36(new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[49], lllIIIIllIlI[1], b.N), lllIIIIllIlI[10], lllIIIIllIlI[2], new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[50], lllIIIIllIlI[1], b.N), new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[50], lllIIIIllIlI[1], b.N), L.WALK);
        MIDDLE_V_XVI = new GameEnum36(new RegionPoint(lllIIIIllIlI[52], lllIIIIllIlI[15], lllIIIIllIlI[1], b.N), lllIIIIllIlI[14], lllIIIIllIlI[13], new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[2], lllIIIIllIlI[1], b.N), new RegionPoint(lllIIIIllIlI[29], lllIIIIllIlI[2], lllIIIIllIlI[1], b.N), L.WALK);
        BOTTOM_V_III = new GameEnum36(new RegionPoint(lllIIIIllIlI[10], lllIIIIllIlI[53], lllIIIIllIlI[0], b.N), lllIIIIllIlI[46], lllIIIIllIlI[9], new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[37], lllIIIIllIlI[0], b.N), new RegionPoint(lllIIIIllIlI[44], lllIIIIllIlI[37], lllIIIIllIlI[0], b.N), L.WALK);
        K[] kArray = new K[lllIIIIllIlI[20]];
        kArray[K.lllIIIIllIlI[0]] = WEST_II_II;
        kArray[K.lllIIIIllIlI[1]] = SOUTH_II_I_EXTEND;
        kArray[K.lllIIIIllIlI[4]] = SOUTH_II_II;
        kArray[K.lllIIIIllIlI[10]] = EAST_II_IV;
        kArray[K.lllIIIIllIlI[18]] = NORTH_II_V;
        kArray[K.lllIIIIllIlI[22]] = EAST_III_III_EXTEND;
        kArray[K.lllIIIIllIlI[14]] = WEST_III_IV;
        kArray[K.lllIIIIllIlI[31]] = NORTH_IV_I;
        kArray[K.lllIIIIllIlI[2]] = NORTH_IV_II;
        kArray[K.lllIIIIllIlI[38]] = SOUTH_IV_III;
        kArray[K.lllIIIIllIlI[5]] = SOUTH_IV_V;
        kArray[K.lllIIIIllIlI[16]] = NORTH_IV_IV;
        kArray[K.lllIIIIllIlI[9]] = EAST_IV_IV;
        kArray[K.lllIIIIllIlI[40]] = EAST_IV_V;
        kArray[K.lllIIIIllIlI[36]] = WEST_IV_II;
        kArray[K.lllIIIIllIlI[17]] = WEST_IV_III;
        kArray[K.lllIIIIllIlI[15]] = WEST_IV_IV;
        kArray[K.lllIIIIllIlI[13]] = WEST_IV_V;
        kArray[K.lllIIIIllIlI[45]] = WEST_IV_VI;
        kArray[K.lllIIIIllIlI[47]] = TOP_V_VI;
        kArray[K.lllIIIIllIlI[28]] = TOP_V_VII;
        kArray[K.lllIIIIllIlI[43]] = MIDDLE_V_II;
        kArray[K.lllIIIIllIlI[46]] = MIDDLE_V_XII;
        kArray[K.lllIIIIllIlI[21]] = MIDDLE_V_XIV;
        kArray[K.lllIIIIllIlI[34]] = MIDDLE_V_XVI;
        kArray[K.lllIIIIllIlI[51]] = BOTTOM_V_III;
        $VALUES = kArray;
    }

    private static boolean lIIIlIIIlIllIIl(Object object) {
        return object == null;
    }

    /*
     * WARNING - void declaration
     */
    public boolean a(Locatable locatable) {
        Iterator<WorldArea> var4 = this.startAreas.get().iterator();
        while (K.lIIIlIIIlIllIll(var4.hasNext() ? 1 : 0)) {
            void var5;
            WorldArea var6 = var4.next();
            if (K.lIIIlIIIlIllIll(var6.contains((Locatable)var5) ? 1 : 0)) {
                return lllIIIIllIlI[1];
            }

            return ((93 + 102 - 135 + 133 ^ 83 + 38 - -26 + 10) & (0x50 ^ 0x42 ^ (0xCF ^ 0x81) ^ -1)) != 0;
        }
        return lllIIIIllIlI[0];
    }

    public void a(SquireSepulchre squireSepulchre) {
        squireSepulchre.a(this.startAreas.get());
        squireSepulchre.a(this.startPoint.get());
        squireSepulchre.b(this.destination.get());
        squireSepulchre.a(this.type.name() + " " + this.name());
    }

    private GameEnum36(RegionPoint regionPoint, int n3, int n4, RegionPoint regionPoint2, RegionPoint regionPoint3, L l2) {
        this.startAreas = () -> List.of(new WorldArea(SquireSepulchre.a(regionPoint), n3, n4));
        this.startPoint = () -> SquireSepulchre.a(regionPoint2);
        this.destination = () -> SquireSepulchre.a(regionPoint3);
        this.type = l2;
    }

    private static boolean lIIIlIIIlIllIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIIlIIIlIlllII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIIlIIIlIllIll(int n2) {
        return n2 != 0;
    }

    private GameEnum36(List<Triple<RegionPoint, Integer, Integer>> list, RegionPoint regionPoint, RegionPoint regionPoint2, L l2) {
        this.startAreas = () -> {
            ArrayList arrayList = new ArrayList();
            Iterator var7 = list.iterator();
            while (K.lIIIlIIIlIllIll(var7.hasNext() ? 1 : 0)) {
                void var8;
                Triple var9 = (Triple)var7.next();
                var8.add(new WorldArea(SquireSepulchre.a((RegionPoint)var9.getFirst()), ((Integer)var9.getSecond()).intValue(), ((Integer)var9.getThird()).intValue()));

                if (3 == 3) continue;
                return null;
            }
            return arrayList;
        };
        this.startPoint = () -> SquireSepulchre.a(regionPoint);
        this.destination = () -> SquireSepulchre.a(regionPoint2);
        this.type = l2;
    }

    public static K valueOf(String string) {
        return Enum.valueOf(GameEnum36.class, string);
    }

    public static K[] values() {
        return (K[])$VALUES.clone();
    }
}

