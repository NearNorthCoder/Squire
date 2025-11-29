/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.events.MenuOptionClicked
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Ancient
 */
package gg.squire.toa.tasks;

import gg.squire.toa.tasks.ToaManager;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.util.concurrent.ExecutorService;
import net.runelite.api.events.MenuOptionClicked;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Swapping gear for babboons", register=true)
public class SwappingGearForBabboonsTask
extends ToaManager {

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        int var3;
        String string2 = string;
        int n2 = var2[0];
        switch (string2.hashCode()) {
            case 1911983736: {
                void var4;
                if (!M.var5(var4.equals(var1[var2[1]]) ? 1 : 0)) break;
                var3 = var2[1];
                0;
                if null == null break;
                return null;
            }
            case 618003550: {
                void var4;
                if (!M.var5(var4.equals(var1[var2[2]]) ? 1 : 0)) break;
                var3 = var2[2];
                0;
                if (-2 <= 0) break;
                return null;
            }
            case 556951929: {
                void var4;
                if (!M.var5(var4.equals(var1[var2[3]]) ? 1 : 0)) break;
                var3 = var2[3];
                0;
                if (-1 <= 0) break;
                return null;
            }
            case -857618786: {
                void var4;
                if (!M.var5(var4.equals(var1[var2[4]]) ? 1 : 0)) break;
                var3 = var2[4];
                0;
                if (((0xC8 ^ 0x8D) & ~(3 ^ 0x46)) == 0) break;
                return null;
            }
            case 1829704903: {
                void var4;
                if (!M.var5(var4.equals(var1[var2[5]]) ? 1 : 0)) break;
                var3 = var2[5];
                0;
                if null == null break;
                return null;
            }
            case 1882859331: {
                void var4;
                if (!M.var5(var4.equals(var1[var2[6]]) ? 1 : 0)) break;
                var3 = var2[6];
            }
        }
        switch (var3) {
            case 0: {
                M var6;
                if (M.var5(var6.aL.autoBloodSpells() ? 1 : 0)) {
                    SpellBook.Ancient ancient;
                    if (M.var5(SpellBook.Ancient.BLOOD_BARRAGE.canCast() ? 1 : 0)) {
                        ancient = SpellBook.Ancient.BLOOD_BARRAGE;
                        0;
                        if (3 < 0) {
                            return null;
                        }
                    } else {
                        ancient = SpellBook.Ancient.BLOOD_BURST;
                    }
                    var6.a((Speancient);
                }
                return var6.a(var6.aL.mageGearBaboons());
            }
            case 1: 
            case 2: {
                M var6;
                return var6.a(var6.aL.mageGearBaboons());
            }
            case 3: {
                M var6;
                return var6.a(var6.aL.meleeGearBaboons());
            }
            case 4: 
            case 5: {
                M var6;
                return var6.a(var6.aL.rangeGearBaboons());
            }
        }
        return new int[var2[1]];
    }

        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private static boolean var5(int n2) {
        return n2 != 0;
    }

    @Override
    public void b(MenuOptionClicked menuOptionClicked) {
        this.a(menuOptionClicked.getMenuEntry());
    }

    @Override
    public boolean C() {
        boolean bl;
        if (!M.var13(this.aL.rangeGearBaboons().isSelected() ? 1 : 0) || !M.var13(this.aL.meleeGearBaboons().isSelected() ? 1 : 0) || M.var5(this.aL.mageGearBaboons().isSelected() ? 1 : 0)) {
            bl = var2[2];
            0;
            if (((0xA5 ^ 0xC1 ^ (0x6E ^ 7)) & (114 + 153 - 253 + 148 ^ 20 + 15 - -55 + 85 ^ -1)) != 0) {
                return ((0x22 ^ 0x12 ^ (0xE5 ^ 0x99)) & (0x9A ^ 0x93 ^ (0x4A ^ 0xF) ^ -1)) != 0;
            }
        } else {
            bl = var2[1];
        }
        return bl;
    }

    private static boolean var14(int n2, int n3) {
        return n2 < n3;
    }

    private static String var15(String var16, String var17) {
        var16 = new String(Base64.getDecoder().decode(var16.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var18 = new StringBuilder();
        char[] var19 = var17.toCharArray();
        int var20 = var2[1];
        char[] var21 = var16.toCharArray();
        int var22 = var21.length;
        int var23 = var2[1];
        while (M.var14(var23, var22)) {
            char var24 = var21[var23];
            var18.append((char)(var24 ^ var19[var20 % var19.length]));
            0;
            ++var20;
            ++var23;
            0;
            if (3 <= (0xF8 ^ 0xBE ^ (0xF0 ^ 0xB2))) continue;
            return null;
        }
        return String.valueOf(var18);
    }

    private static void var25() {
        var2 = new int[9];
        M.var2[0] = -1;
        M.var2[1] = (0x4C ^ 0x75 ^ (0xFE ^ 0x8F)) & (199 + 65 - 101 + 42 ^ 80 + 25 - -23 + 5 ^ -1);
        M.var2[2] = 1;
        M.var2[3] = 2;
        M.var2[4] = 3;
        M.var2[5] = 0x9B ^ 0x9F;
        M.var2[6] = 0x70 ^ 0x75;
        M.var2[7] = 0x2A ^ 0x2C;
        M.var2[8] = 0xC6 ^ 0xAF ^ (0xEE ^ 0x8F);
    }

    @Inject
    public SwappingGearForBabboonsTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

        catch (Exception var31) {
            var31.printStackTrace();
            return null;
        }
    }

    static {
        M.var25();
        M.var32();
    }

    private static void var32() {
        var1 = new String[var2[7]];
        M.var1[M.var2[1]] = "Baboon Thrall";
        M.var1[M.var2[2]] = "Baboon Brawler";
        M.var1[M.var2[3]] = "Cursed Baboon";
        M.var1[M.var2[4]] = "Baboon Thrower";
        M.var1[M.var2[5]] = "Baboon Mage";
        M.var1[M.var2[6]] = "Baboon Shaman";
    }

    private static boolean var13(int n2) {
        return n2 == 0;
    }
}

