/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.Locatable
 *  net.runelite.api.NPC
 *  net.runelite.api.coords.WorldPoint
 *  net.unethicalite.api.entities.NPCs
 */
package gg.squire.thieving.tasks;

import java.util.function.Predicate;
import net.runelite.api.Locatable;
import net.runelite.api.NPC;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.entities.NPCs;
import gg.squire.thieving.tasks.GameEnum2;

public final class GameEnum4
extends Enum<d> {
    private final  String name;
    private final  int combat;
    public static final  /* enum */ d MENAPHITE;
    private static final  d[] $VALUES;
    private final  c house;

    public static final  /* enum */ d BANDIT_56;
    public static final  /* enum */ d BANDIT_41;
    public static final  /* enum */ d HIGHEST_LEVEL;
    private final  int thieving;

    public int w() {
        return this.combat;
    }

        catch (Exception var8) {
            var8.printStackTrace();
            return null;
        }
    }

    private static boolean var9(int n2, int n3) {
        return n2 < n3;
    }

    static {
        d.var10();
        d.var11();
        HIGHEST_LEVEL = new GameEnum4(var2[0], var1[var2[4]], var2[0], null);
        MENAPHITE = new GameEnum4(var2[6], var1[var2[7]], var2[8], c.MENAPHITE_HOUSE);
        BANDIT_56 = new GameEnum4(var2[8], var1[var2[10]], var2[11], c.LADDER_HOUSE);
        BANDIT_41 = new GameEnum4(var2[13], var1[var2[14]], var2[15], c.LADDER_HOUSE);
        d[] dArray = new d[var2[5]];
        dArray[d.var2[1]] = HIGHEST_LEVEL;
        dArray[d.var2[2]] = MENAPHITE;
        dArray[d.var2[3]] = BANDIT_56;
        dArray[d.var2[4]] = BANDIT_41;
        $VALUES = dArray;
    }

    public String v() {
        return this.name;
    }

    public static d valueOf(String string) {
        return Enum.valueOf(GameEnum4.class, string);
    }

    public c t() {
        return this.house;
    }

    public NPC a(Predicate<NPC> predicate) {
        return NPCs.getNearest((WorldPoint)this.t().r(), nPC -> {
            int n2;
            if (d.var12(this.b((NPC)nPC) ? 1 : 0) && d.var12(predicate.test((NPC)nPC) ? 1 : 0)) {
                n2 = var2[2];
                0;
                if (-1 < -1) {
                    return ((31 + 115 - 107 + 115 ^ 48 + 60 - -20 + 9) & (0x85 ^ 0xBF ^ (0x16 ^ 0x3F) ^ -1)) != 0;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        });
    }

    public NPC a(d d2) {
        return NPCs.getNearest(nPC -> {
            int n2;
            if (d.var12(this.name.equals(d2.name) ? 1 : 0) && d.var13(nPC.getCombatLevel(), d2.combat)) {
                n2 = var2[2];
                0;
                if (-1 != -1) {
                    return ((0x9C ^ 0xC1 ^ (0x72 ^ 0x7D)) & (0x86 ^ 0xC6 ^ (0x72 ^ 0x60) ^ -1)) != 0;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        });
    }

    private GameEnum4(int n3, String string2, int n4, c c2) {
        this.thieving = n3;
        this.name = string2;
        this.combat = n4;
        this.house = c2;
    }

    public static d[] values() {
        return (d[])$VALUES.clone();
    }

        catch (Exception var19) {
            var19.printStackTrace();
            return null;
        }
    }

    public int u() {
        return this.thieving;
    }

    public boolean b(NPC nPC) {
        int n2;
        if (d.var12(this.name.equals(nPC.getName()) ? 1 : 0) && d.var13(this.combat, nPC.getCombatLevel())) {
            n2 = var2[2];
            0;
            if (-1 > 0) {
                return ((0x99 ^ 0x9E ^ (0x27 ^ 0x34)) & (177 + 181 - 159 + 14 ^ 35 + 175 - 44 + 27 ^ -1)) != 0;
            }
        } else {
            n2 = var2[1];
        }
        return n2 != 0;
    }

    private static boolean var13(int n2, int n3) {
        return n2 == n3;
    }

    private static void var11() {
        var1 = new String[var2[16]];
        d.var1[d.var2[1]] = " (%d)";
        d.var1[d.var2[2]] = d.var20("", "oiTVF");
        d.var1[d.var2[3]] = "HIGHEST_LEVEL";
        d.var1[d.var2[4]] = "Highest Level";
        d.var1[d.var2[5]] = "MENAPHITE";
        d.var1[d.var2[7]] = "Menaphite Thug";
        d.var1[d.var2[9]] = "BANDIT_56";
        d.var1[d.var2[10]] = "Bandit";
        d.var1[d.var2[12]] = "BANDIT_41";
        d.var1[d.var2[14]] = "Bandit";
    }

    public String toString() {
        String string;
        if (d.var21(this.thieving, var2[0])) {
            Object[] objectArray = new Object[var2[2]];
            objectArray[d.var2[1]] = this.thieving;
            string = String.format(var1[var2[1]], objectArray);
            0;
            if (((0x74 ^ 0x72 ^ (0xF6 ^ 0xBC)) & (123 + 188 - 219 + 109 ^ 106 + 127 - 221 + 121 ^ -1)) >= 1) {
                return null;
            }
        } else {
            string = var1[var2[2]];
        }
        return this.name + string;
    }

    private static boolean var12(int n2) {
        return n2 != 0;
    }

    private static boolean var21(int n2, int n3) {
        return n2 != n3;
    }

    private static String var20(String var22, String var23) {
        var22 = new String(Base64.getDecoder().decode(var22.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var24 = new StringBuilder();
        char[] var25 = var23.toCharArray();
        int var26 = var2[1];
        char[] var27 = var22.toCharArray();
        int var28 = var27.length;
        int var29 = var2[1];
        while (d.var9(var29, var28)) {
            char var30 = var27[var29];
            var24.append((char)(var30 ^ var25[var26 % var25.length]));
            0;
            ++var26;
            ++var29;
            0;
            if null == null continue;
            return null;
        }
        return String.valueOf(var24);
    }

    public NPC b(c c2) {
        return NPCs.getNearest((WorldPoint)c2.p().getCenter(), nPC -> {
            int n2;
            if (d.var12(c2.p().contains((Locatable)nPC) ? 1 : 0) && d.var12(this.name.equals(nPC.getName()) ? 1 : 0) && d.var13(nPC.getCombatLevel(), this.combat)) {
                n2 = var2[2];
                0;
                if (2 <= 0) {
                    return ((0x7C ^ 0x20 ^ 1) & (0x5D ^ 0x2D ^ (0x9B ^ 0xB6) ^ -1)) != 0;
                }
            } else {
                n2 = var2[1];
            }
            return n2 != 0;
        });
    }

    private static void var10() {
        var2 = new int[17];
        d.var2[0] = -1;
        d.var2[1] = (0x66 ^ 0x2A ^ (0x1C ^ 0x1B)) & (95 + 54 - 16 + 114 ^ 101 + 85 - 171 + 173 ^ -1);
        d.var2[2] = 1;
        d.var2[3] = 2;
        d.var2[4] = 3;
        d.var2[5] = 0x9C ^ 0x98;
        d.var2[6] = 0xC8 ^ 0x89;
        d.var2[7] = 0xB6 ^ 0xB3;
        d.var2[8] = 0x87 ^ 0xB0;
        d.var2[9] = 0x67 ^ 0x61;
        d.var2[10] = 89 + 19 - -8 + 15 ^ 40 + 86 - 6 + 12;
        d.var2[11] = 0x41 ^ 0x79;
        d.var2[12] = 175 + 68 - 97 + 59 ^ 187 + 130 - 288 + 168;
        d.var2[13] = 236 + 108 - 300 + 193 ^ 147 + 12 - -1 + 32;
        d.var2[14] = 0x35 ^ 0x3C;
        d.var2[15] = 0xEE ^ 0xC7;
        d.var2[16] = 0x9D ^ 0x97;
    }
}

