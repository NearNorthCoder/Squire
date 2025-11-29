/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.game.NPCStats
 */
package gg.squire.cox.tasks;

import com.openosrs.client.game.NPCStats;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class GameEnum20
extends Enum<o> {

    public static final  /* enum */ o ABYSSAL_PORTAL;
    public static final  /* enum */ o VASA_CRYSTAL;
    public static final  /* enum */ o OLM_HEAD;
    private  NPCStats npcStats;
    public static final  /* enum */ o OLM_RIGHT_HAND;
    public static final  /* enum */ o OLM_LEFT_HAND;
    public static final  /* enum */ o ICE_DEMON;
    private static final  o[] $VALUES;
    public static final  /* enum */ o TEKTON;
    public static final  /* enum */ o MUTTADILE;
    public static final  /* enum */ o VASA;

    static {
        o.llIlIlIIllIlll();
        o.llIlIlIIllIllI();
        VASA = new GameEnum20(NPCStats.builder().hitpoints(lIlIIIIlIIlI[1]).attackLevel(lIlIIIIlIIlI[2]).strengthLevel(lIlIIIIlIIlI[2]).defenceLevel(lIlIIIIlIIlI[3]).magic(lIlIIIIlIIlI[4]).range(lIlIIIIlIIlI[4]).stabDef(lIlIIIIlIIlI[5]).slashDef(lIlIIIIlIIlI[6]).crushDef(lIlIIIIlIIlI[7]).magicDef(lIlIIIIlIIlI[8]).build());
        VASA_CRYSTAL = new GameEnum20(NPCStats.builder().hitpoints(lIlIIIIlIIlI[9]).attackLevel(lIlIIIIlIIlI[2]).strengthLevel(lIlIIIIlIIlI[2]).defenceLevel(lIlIIIIlIIlI[10]).magic(lIlIIIIlIIlI[10]).range(lIlIIIIlIIlI[2]).stabDef(lIlIIIIlIIlI[11]).slashDef(lIlIIIIlIIlI[12]).crushDef(lIlIIIIlIIlI[12]).magicDef(lIlIIIIlIIlI[0]).build());
        TEKTON = new GameEnum20(NPCStats.builder().hitpoints(lIlIIIIlIIlI[1]).attackLevel(lIlIIIIlIIlI[14]).strengthLevel(lIlIIIIlIIlI[14]).defenceLevel(lIlIIIIlIIlI[15]).magic(lIlIIIIlIIlI[15]).range(lIlIIIIlIIlI[2]).stabDef(lIlIIIIlIIlI[16]).slashDef(lIlIIIIlIIlI[17]).crushDef(lIlIIIIlIIlI[18]).magicDef(lIlIIIIlIIlI[0]).build());
        MUTTADILE = new GameEnum20(NPCStats.builder().hitpoints(lIlIIIIlIIlI[20]).attackLevel(lIlIIIIlIIlI[20]).strengthLevel(lIlIIIIlIIlI[20]).defenceLevel(lIlIIIIlIIlI[21]).magic(lIlIIIIlIIlI[20]).range(lIlIIIIlIIlI[20]).stabDef(lIlIIIIlIIlI[11]).slashDef(lIlIIIIlIIlI[22]).crushDef(lIlIIIIlIIlI[23]).magicDef(lIlIIIIlIIlI[24]).build());
        ABYSSAL_PORTAL = new GameEnum20(NPCStats.builder().hitpoints(lIlIIIIlIIlI[20]).attackLevel(lIlIIIIlIIlI[2]).strengthLevel(lIlIIIIlIIlI[2]).defenceLevel(lIlIIIIlIIlI[26]).magic(lIlIIIIlIIlI[26]).range(lIlIIIIlIIlI[2]).stabDef(lIlIIIIlIIlI[0]).slashDef(lIlIIIIlIIlI[0]).crushDef(lIlIIIIlIIlI[0]).magicDef(lIlIIIIlIIlI[0]).build());
        ICE_DEMON = new GameEnum20(NPCStats.builder().hitpoints(lIlIIIIlIIlI[28]).attackLevel(lIlIIIIlIIlI[2]).strengthLevel(lIlIIIIlIIlI[2]).defenceLevel(lIlIIIIlIIlI[29]).magic(lIlIIIIlIIlI[14]).range(lIlIIIIlIIlI[14]).stabDef(lIlIIIIlIIlI[30]).slashDef(lIlIIIIlIIlI[30]).crushDef(lIlIIIIlIIlI[9]).magicDef(lIlIIIIlIIlI[23]).rangeDef(lIlIIIIlIIlI[28]).build());
        OLM_RIGHT_HAND = new GameEnum20(NPCStats.builder().hitpoints(lIlIIIIlIIlI[32]).attackLevel(lIlIIIIlIIlI[20]).strengthLevel(lIlIIIIlIIlI[20]).defenceLevel(lIlIIIIlIIlI[3]).magic(lIlIIIIlIIlI[33]).range(lIlIIIIlIIlI[20]).stabDef(lIlIIIIlIIlI[0]).slashDef(lIlIIIIlIIlI[0]).crushDef(lIlIIIIlIIlI[0]).magicDef(lIlIIIIlIIlI[34]).rangeDef(lIlIIIIlIIlI[0]).build());
        OLM_LEFT_HAND = new GameEnum20(NPCStats.builder().hitpoints(lIlIIIIlIIlI[32]).attackLevel(lIlIIIIlIIlI[20]).strengthLevel(lIlIIIIlIIlI[20]).defenceLevel(lIlIIIIlIIlI[3]).magic(lIlIIIIlIIlI[3]).range(lIlIIIIlIIlI[20]).stabDef(lIlIIIIlIIlI[34]).slashDef(lIlIIIIlIIlI[34]).crushDef(lIlIIIIlIIlI[34]).magicDef(lIlIIIIlIIlI[36]).rangeDef(lIlIIIIlIIlI[36]).build());
        OLM_HEAD = new GameEnum20(NPCStats.builder().hitpoints(lIlIIIIlIIlI[32]).attackLevel(lIlIIIIlIIlI[20]).strengthLevel(lIlIIIIlIIlI[20]).defenceLevel(lIlIIIIlIIlI[3]).magic(lIlIIIIlIIlI[3]).range(lIlIIIIlIIlI[20]).stabDef(lIlIIIIlIIlI[36]).slashDef(lIlIIIIlIIlI[36]).crushDef(lIlIIIIlIIlI[36]).magicDef(lIlIIIIlIIlI[36]).rangeDef(lIlIIIIlIIlI[36]).build());
        o[] oArray = new o[lIlIIIIlIIlI[38]];
        oArray[o.lIlIIIIlIIlI[0]] = VASA;
        oArray[o.lIlIIIIlIIlI[2]] = VASA_CRYSTAL;
        oArray[o.lIlIIIIlIIlI[13]] = TEKTON;
        oArray[o.lIlIIIIlIIlI[19]] = MUTTADILE;
        oArray[o.lIlIIIIlIIlI[25]] = ABYSSAL_PORTAL;
        oArray[o.lIlIIIIlIIlI[27]] = ICE_DEMON;
        oArray[o.lIlIIIIlIIlI[31]] = OLM_RIGHT_HAND;
        oArray[o.lIlIIIIlIIlI[35]] = OLM_LEFT_HAND;
        oArray[o.lIlIIIIlIIlI[37]] = OLM_HEAD;
        $VALUES = oArray;
    }

    private GameEnum20(NPCStats nPCStats) {
        this.npcStats = nPCStats;
    }

    private static boolean llIlIlIIlllIII(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var1);
    }

    private static void llIlIlIIllIllI() {
        lIlIIIIlIIIl = new String[lIlIIIIlIIlI[38]];
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[0]] = "VASA";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[2]] = "VASA_CRYSTAL";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[13]] = "TEKTON";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[19]] = "MUTTADILE";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[25]] = "ABYSSAL_PORTAL";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[27]] = "ICE_DEMON";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[31]] = "OLM_RIGHT_HAND";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[35]] = "OLM_LEFT_HAND";
        o.lIlIIIIlIIIl[o.lIlIIIIlIIlI[37]] = "OLM_HEAD";
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum20.class, string);
    }

    public NPCStats aO() {
        return this.npcStats;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }
}

