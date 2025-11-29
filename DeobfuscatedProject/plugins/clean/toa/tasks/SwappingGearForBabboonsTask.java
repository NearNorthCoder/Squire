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

import gg.squire.toa.tasks.ToaTaskBase;
import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.events.MenuOptionClicked;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

@TaskDesc(name="Swapping gear for babboons", register=true)
public class SwappingGearForBabboonsTask
extends ToaTaskBase {

    /*
     * WARNING - void declaration
     */
    @Override
    public int[] a(String string) {
        int var1;
        String string2 = string;
        int n2 = lIIlllllIIlII[0];
        switch (string2.hashCode()) {
            case 1911983736: {
                void var2;
                if (!M.lIllIlIlIIIIIll(var2.equals(lIIlllllIIIll[lIIlllllIIlII[1]]) ? 1 : 0)) break;
                var1 = lIIlllllIIlII[1];

                if (null == null) break;
                return null;
            }
            case 618003550: {
                void var2;
                if (!M.lIllIlIlIIIIIll(var2.equals(lIIlllllIIIll[lIIlllllIIlII[2]]) ? 1 : 0)) break;
                var1 = lIIlllllIIlII[2];

                if (-2 <= 0) break;
                return null;
            }
            case 556951929: {
                void var2;
                if (!M.lIllIlIlIIIIIll(var2.equals(lIIlllllIIIll[lIIlllllIIlII[3]]) ? 1 : 0)) break;
                var1 = lIIlllllIIlII[3];

                if (-1 <= 0) break;
                return null;
            }
            case -857618786: {
                void var2;
                if (!M.lIllIlIlIIIIIll(var2.equals(lIIlllllIIIll[lIIlllllIIlII[4]]) ? 1 : 0)) break;
                var1 = lIIlllllIIlII[4];

                if (((0xC8 ^ 0x8D) & ~(3 ^ 0x46)) == 0) break;
                return null;
            }
            case 1829704903: {
                void var2;
                if (!M.lIllIlIlIIIIIll(var2.equals(lIIlllllIIIll[lIIlllllIIlII[5]]) ? 1 : 0)) break;
                var1 = lIIlllllIIlII[5];

                if (null == null) break;
                return null;
            }
            case 1882859331: {
                void var2;
                if (!M.lIllIlIlIIIIIll(var2.equals(lIIlllllIIIll[lIIlllllIIlII[6]]) ? 1 : 0)) break;
                var1 = lIIlllllIIlII[6];
            }
        }
        switch (var1) {
            case 0: {
                M var3;
                if (M.lIllIlIlIIIIIll(var3.aL.autoBloodSpells() ? 1 : 0)) {
                    SpellBook.Ancient ancient;
                    if (M.lIllIlIlIIIIIll(SpellBook.Ancient.BLOOD_BARRAGE.canCast() ? 1 : 0)) {
                        ancient = SpellBook.Ancient.BLOOD_BARRAGE;

                        if (3 < 0) {
                            return null;
                        }
                    } else {
                        ancient = SpellBook.Ancient.BLOOD_BURST;
                    }
                    var3.a((Spell)ancient);
                }
                return var3.a(var3.aL.mageGearBaboons());
            }
            case 1: 
            case 2: {
                M var3;
                return var3.a(var3.aL.mageGearBaboons());
            }
            case 3: {
                M var3;
                return var3.a(var3.aL.meleeGearBaboons());
            }
            case 4: 
            case 5: {
                M var3;
                return var3.a(var3.aL.rangeGearBaboons());
            }
        }
        return new int[lIIlllllIIlII[1]];
    }

    private static boolean lIllIlIlIIIIIll(int n2) {
        return n2 != 0;
    }

    @Override
    public void b(MenuOptionClicked menuOptionClicked) {
        this.a(menuOptionClicked.getMenuEntry());
    }

    @Override
    public boolean C() {
        boolean bl;
        if (!M.lIllIlIlIIIIlII(this.aL.rangeGearBaboons().isSelected() ? 1 : 0) || !M.lIllIlIlIIIIlII(this.aL.meleeGearBaboons().isSelected() ? 1 : 0) || M.lIllIlIlIIIIIll(this.aL.mageGearBaboons().isSelected() ? 1 : 0)) {
            bl = lIIlllllIIlII[2];

            if (((0xA5 ^ 0xC1 ^ (0x6E ^ 7)) & (114 + 153 - 253 + 148 ^ 20 + 15 - -55 + 85 ^ -1)) != 0) {
                return ((0x22 ^ 0x12 ^ (0xE5 ^ 0x99)) & (0x9A ^ 0x93 ^ (0x4A ^ 0xF) ^ -1)) != 0;
            }
        } else {
            bl = lIIlllllIIlII[1];
        }
        return bl;
    }

    private static boolean lIllIlIlIIIIlIl(int n2, int n3) {
        return n2 < n3;
    }

        return String.valueOf(var4);
    }

    @Inject
    public SwappingGearForBabboonsTask(TOAConfig tOAConfig, ExecutorService executorService) {
        super(tOAConfig, executorService);
    }

    static {
        M.lIllIlIlIIIIIlI();
        M.lIllIlIlIIIIIIl();
    }

    private static void lIllIlIlIIIIIIl() {
        lIIlllllIIIll = new String[lIIlllllIIlII[7]];
        M.lIIlllllIIIll[M.lIIlllllIIlII[1]] = "Baboon Thrall";
        M.lIIlllllIIIll[M.lIIlllllIIlII[2]] = "Baboon Brawler";
        M.lIIlllllIIIll[M.lIIlllllIIlII[3]] = "Cursed Baboon";
        M.lIIlllllIIIll[M.lIIlllllIIlII[4]] = "Baboon Thrower";
        M.lIIlllllIIIll[M.lIIlllllIIlII[5]] = "Baboon Mage";
        M.lIIlllllIIIll[M.lIIlllllIIlII[6]] = "Baboon Shaman";
    }

    private static boolean lIllIlIlIIIIlII(int n2) {
        return n2 == 0;
    }
}

