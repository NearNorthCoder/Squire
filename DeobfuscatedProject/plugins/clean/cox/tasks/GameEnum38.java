/*
 * Decompiled with CFR 0.152.
 */
package gg.squire.cox.tasks;

import gg.squire.cox.tasks.GameEnum26;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum38
extends Enum<N> {
    private final  String name;
    public static final  /* enum */ N SCAVENGERS;
    public static final  /* enum */ N TEKTON;
    public static final  /* enum */ N MUTTADILES;
    public static final  int ROOM_MAX_SIZE;
    public static final  /* enum */ N SHAMANS;
    public static final  /* enum */ N TIGHTROPE;
    public static final  /* enum */ N THIEVING;
    
    public static final  /* enum */ N VESPULA;
    public static final  /* enum */ N EMPTY;
    public static final  /* enum */ N GUARDIANS;
    public static final  /* enum */ N VASA;
    public static final  /* enum */ N END;
    public static final  /* enum */ N CRABS;
    public static final  /* enum */ N MYSTICS;
    private final  P type;
    public static final  /* enum */ N ICE_DEMON;
    public static final  /* enum */ N UNKNOWN_COMBAT;
    public static final  /* enum */ N FARMING;
    public static final  /* enum */ N VANGUARDS;
    
    public static final  /* enum */ N UNKNOWN_PUZZLE;
    public static final  /* enum */ N START;
    private static final  N[] $VALUES;

    private static void llIlllIIIIIIII() {
        lIlIlIIIIlll = new String[lIlIlIIIlIII[38]];
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[1]] = "START";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[2]] = "Start";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[3]] = "END";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[4]] = "End";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[5]] = "SCAVENGERS";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[6]] = "Scavengers";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[7]] = "FARMING";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[8]] = "Farming";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[9]] = "EMPTY";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[10]] = "Empty";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[11]] = "TEKTON";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[12]] = "Tekton";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[13]] = "MUTTADILES";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[14]] = "Muttadiles";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[15]] = "GUARDIANS";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[16]] = "Guardians";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[17]] = "VESPULA";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[18]] = "Vespula";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[19]] = "SHAMANS";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[20]] = "Shamans";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[21]] = "VASA";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[22]] = "Vasa";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[23]] = "VANGUARDS";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[24]] = "Vanguards";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[25]] = "MYSTICS";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[26]] = "Mystics";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[27]] = "UNKNOWN_COMBAT";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[28]] = "Unknown (combat)";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[29]] = "CRABS";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[30]] = "Crabs";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[31]] = "ICE_DEMON";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[32]] = "Ice Demon";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[0]] = "TIGHTROPE";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[33]] = "Tightrope";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[34]] = "THIEVING";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[35]] = "Thieving";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[36]] = "UNKNOWN_PUZZLE";
        N.lIlIlIIIIlll[N.lIlIlIIIlIII[37]] = "Unknown (puzzle)";
    }

    public P bY() {
        return this.type;
    }

        return String.valueOf(var1);
    }

    public static N[] values() {
        return (N[])$VALUES.clone();
    }

    private GameEnum38(String string2, P p2) {
        this.name = string2;
        this.type = p2;
    }

    public String bX() {
        return this.name;
    }

    private static boolean llIlllIIIIIIlI(int n2, int n3) {
        return n2 < n3;
    }

    public static N valueOf(String string) {
        return Enum.valueOf(GameEnum38.class, string);
    }

    static {
        N.llIlllIIIIIIIl();
        N.llIlllIIIIIIII();
        ROOM_MAX_SIZE = lIlIlIIIlIII[0];
        START = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[2]], P.START);
        END = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[4]], P.END);
        SCAVENGERS = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[6]], P.SCAVENGERS);
        FARMING = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[8]], P.FARMING);
        EMPTY = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[10]], P.EMPTY);
        TEKTON = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[12]], P.COMBAT);
        MUTTADILES = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[14]], P.COMBAT);
        GUARDIANS = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[16]], P.COMBAT);
        VESPULA = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[18]], P.COMBAT);
        SHAMANS = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[20]], P.COMBAT);
        VASA = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[22]], P.COMBAT);
        VANGUARDS = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[24]], P.COMBAT);
        MYSTICS = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[26]], P.COMBAT);
        UNKNOWN_COMBAT = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[28]], P.COMBAT);
        CRABS = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[30]], P.PUZZLE);
        ICE_DEMON = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[32]], P.PUZZLE);
        TIGHTROPE = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[33]], P.PUZZLE);
        THIEVING = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[35]], P.PUZZLE);
        UNKNOWN_PUZZLE = new GameEnum38(lIlIlIIIIlll[lIlIlIIIlIII[37]], P.PUZZLE);
        N[] nArray = new N[lIlIlIIIlIII[20]];
        nArray[N.lIlIlIIIlIII[1]] = START;
        nArray[N.lIlIlIIIlIII[2]] = END;
        nArray[N.lIlIlIIIlIII[3]] = SCAVENGERS;
        nArray[N.lIlIlIIIlIII[4]] = FARMING;
        nArray[N.lIlIlIIIlIII[5]] = EMPTY;
        nArray[N.lIlIlIIIlIII[6]] = TEKTON;
        nArray[N.lIlIlIIIlIII[7]] = MUTTADILES;
        nArray[N.lIlIlIIIlIII[8]] = GUARDIANS;
        nArray[N.lIlIlIIIlIII[9]] = VESPULA;
        nArray[N.lIlIlIIIlIII[10]] = SHAMANS;
        nArray[N.lIlIlIIIlIII[11]] = VASA;
        nArray[N.lIlIlIIIlIII[12]] = VANGUARDS;
        nArray[N.lIlIlIIIlIII[13]] = MYSTICS;
        nArray[N.lIlIlIIIlIII[14]] = UNKNOWN_COMBAT;
        nArray[N.lIlIlIIIlIII[15]] = CRABS;
        nArray[N.lIlIlIIIlIII[16]] = ICE_DEMON;
        nArray[N.lIlIlIIIlIII[17]] = TIGHTROPE;
        nArray[N.lIlIlIIIlIII[18]] = THIEVING;
        nArray[N.lIlIlIIIlIII[19]] = UNKNOWN_PUZZLE;
        $VALUES = nArray;
    }
}

