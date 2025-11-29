/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap$Builder
 *  javax.annotation.Nullable
 *  net.runelite.api.NPC
 *  net.runelite.api.Skill
 */
package gg.squire.construction.tasks;

import com.google.common.collect.ImmutableMap;
import java.awt.Color;
import java.util.Map;
import javax.annotation.Nullable;
import net.runelite.api.NPC;
import net.runelite.api.Skill;

public final class GameEnum10
extends Enum<g> {
    public static final  /* enum */ g MELEE;
    public static final  /* enum */ g RANGE;
    private static final  g[] $VALUES;
    private final  Color color;
    private static  int[] lllIlllI;
    public static final  /* enum */ g MAGE;
    private final  Skill type;
    private static final  Map<Integer, g> MAP;
    private final  int npcId;
    private static  String[] lllIllIl;

    private static String var1(String var2, String var3) {
        var2 = new String(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var4 = new StringBuilder();
        char[] var5 = var3.toCharArray();
        int var6 = 0;
        char[] var7 = var2.toCharArray();
        int var8 = var7.length;
        int var9 = 0;
        while (var9 < var8) {
            char var10 = var7[var9];
            var4.append((char)(var10 ^ var5[var6 % var5.length]));
            0;
            ++var6;
            ++var9;
            0;
            if (2 != 0) continue;
            return null;
        }
        return String.valueOf(var4);
    }

    public Skill L() {
        return this.type;
    }

    public int K() {
        return this.npcId;
    }

    /*
     * WARNING - void declaration
     */
    
            MAP = builder.build();
        }
    }

        catch (Exception var23) {
            var23.printStackTrace();
            return null;
        }
    }

    private GameEnum10(int n3, Skill skill, Color color) {
        this.npcId = n3;
        this.type = skill;
        this.color = color;
    }

    @Nullable
    public static g b(NPC nPC) {
        return MAP.get(nPC.getId());
    }

    public Color M() {
        return this.color;
    }

        catch (Exception var29) {
            var29.printStackTrace();
            return null;
        }
    }

    public static g e(int n2) {
        return MAP.get(n2);
    }

    public static g valueOf(String string) {
        return Enum.valueOf(GameEnum10.class, string);
    }

    public static g[] values() {
        return (g[])$VALUES.clone();
    }
}

