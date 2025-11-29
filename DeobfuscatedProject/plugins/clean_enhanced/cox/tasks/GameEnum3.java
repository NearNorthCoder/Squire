/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.openosrs.client.game.NPCStats
 */
package gg.squire.cox.tasks;

import com.openosrs.client.game.NPCStats;

public final class GameEnum3
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
        o.var3();
        o.var4();
        VASA = new GameEnum3(NPCStats.builder().hitpoints(1).attackLevel(2).strengthLevel(2).defenceLevel(3).magic(4).range(4).stabDef(5).slashDef(6).crushDef(7).magicDef(8).build());
        VASA_CRYSTAL = new GameEnum3(NPCStats.builder().hitpoints(9).attackLevel(2).strengthLevel(2).defenceLevel(var1[10]).magic(var1[10]).range(2).stabDef(var1[11]).slashDef(var1[12]).crushDef(var1[12]).magicDef(0).build());
        TEKTON = new GameEnum3(NPCStats.builder().hitpoints(1).attackLevel(var1[14]).strengthLevel(var1[14]).defenceLevel(var1[15]).magic(var1[15]).range(2).stabDef(var1[16]).slashDef(var1[17]).crushDef(var1[18]).magicDef(0).build());
        MUTTADILE = new GameEnum3(NPCStats.builder().hitpoints(var1[20]).attackLevel(var1[20]).strengthLevel(var1[20]).defenceLevel(var1[21]).magic(var1[20]).range(var1[20]).stabDef(var1[11]).slashDef(var1[22]).crushDef(var1[23]).magicDef(var1[24]).build());
        ABYSSAL_PORTAL = new GameEnum3(NPCStats.builder().hitpoints(var1[20]).attackLevel(2).strengthLevel(2).defenceLevel(var1[26]).magic(var1[26]).range(2).stabDef(0).slashDef(0).crushDef(0).magicDef(0).build());
        ICE_DEMON = new GameEnum3(NPCStats.builder().hitpoints(var1[28]).attackLevel(2).strengthLevel(2).defenceLevel(var1[29]).magic(var1[14]).range(var1[14]).stabDef(var1[30]).slashDef(var1[30]).crushDef(9).magicDef(var1[23]).rangeDef(var1[28]).build());
        OLM_RIGHT_HAND = new GameEnum3(NPCStats.builder().hitpoints(var1[32]).attackLevel(var1[20]).strengthLevel(var1[20]).defenceLevel(3).magic(var1[33]).range(var1[20]).stabDef(0).slashDef(0).crushDef(0).magicDef(var1[34]).rangeDef(0).build());
        OLM_LEFT_HAND = new GameEnum3(NPCStats.builder().hitpoints(var1[32]).attackLevel(var1[20]).strengthLevel(var1[20]).defenceLevel(3).magic(3).range(var1[20]).stabDef(var1[34]).slashDef(var1[34]).crushDef(var1[34]).magicDef(var1[36]).rangeDef(var1[36]).build());
        OLM_HEAD = new GameEnum3(NPCStats.builder().hitpoints(var1[32]).attackLevel(var1[20]).strengthLevel(var1[20]).defenceLevel(3).magic(3).range(var1[20]).stabDef(var1[36]).slashDef(var1[36]).crushDef(var1[36]).magicDef(var1[36]).rangeDef(var1[36]).build());
        o[] oArray = new o[var1[38]];
        oArray[0] = VASA;
        oArray[2] = VASA_CRYSTAL;
        oArray[o.var1[13]] = TEKTON;
        oArray[o.var1[19]] = MUTTADILE;
        oArray[o.var1[25]] = ABYSSAL_PORTAL;
        oArray[o.var1[27]] = ICE_DEMON;
        oArray[o.var1[31]] = OLM_RIGHT_HAND;
        oArray[o.var1[35]] = OLM_LEFT_HAND;
        oArray[o.var1[37]] = OLM_HEAD;
        $VALUES = oArray;
    }

    private GameEnum3(NPCStats nPCStats) {
        this.npcStats = nPCStats;
    }

    private static String var5(String var6, String var7) {
        var6 = new String(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var9 = var7.toCharArray();
        int var10 = 0;
        char[] var11 = var6.toCharArray();
        int var12 = var11.length;
        int var13 = 0;
        while (var13 < var12) {
            char var14 = var11[var13];
            var8.append((char)(var14 ^ var9[var10 % var9.length]));
            0;
            ++var10;
            ++var13;
            0;
            if (2 < 3) continue;
            return null;
        }
        return String.valueOf(var8);
    }

        catch (Exception var20) {
            var20.printStackTrace();
            return null;
        }
    }

        catch (Exception var26) {
            var26.printStackTrace();
            return null;
        }
    }

    public static o valueOf(String string) {
        return Enum.valueOf(GameEnum3.class, string);
    }

    public NPCStats aO() {
        return this.npcStats;
    }

    public static o[] values() {
        return (o[])$VALUES.clone();
    }
}

