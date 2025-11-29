/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.Interactable
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Standard
 */
package k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.plugins.skilling.BankStanderConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import k.b.r.a.s.-.a.t.d.n.r.n.i.e.-.s.q.e.u.b;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;

/* TASK: Alching -> AlchingTask */
@TaskDesc(name="Alching")
public class K
extends Task {
    private final /* synthetic */ BankStanderConfig x;
    private static /* synthetic */ int[] lllIlIllIlI;
    private static /* synthetic */ String[] lllIlIllIIl;

    @Inject
    public K(BankStanderConfig bankStanderConfig) {
        this.x = bankStanderConfig;
    }

    private static void lIllIIIIIIlIIl() {
        lllIlIllIlI = new int[4];
        K.lllIlIllIlI[0] = (0x79 ^ 0x3A ^ (4 ^ 0x4F)) & (69 + 60 - 117 + 192 ^ 130 + 96 - 182 + 152 ^ -1);
        K.lllIlIllIlI[1] = 3;
        K.lllIlIllIlI[2] = 1;
        K.lllIlIllIlI[3] = 0x41 ^ 0x52 ^ (0x17 ^ 0x33);
    }

    private Spell S() {
        if (K.lIllIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lllIlIllIlI[3])) {
            return SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        }
        return SpellBook.Standard.LOW_LEVEL_ALCHEMY;
    }

    private static String lIllIIIIIIIlll(String var17, String var12) {
        var17 = new String(Base64.getDecoder().decode(var17.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var8 = new StringBuilder();
        char[] var7 = var12.toCharArray();
        int var3 = lllIlIllIlI[0];
        char[] var10 = var17.toCharArray();
        int var5 = var10.length;
        int var11 = lllIlIllIlI[0];
        while (K.lIllIIIIIIlllI(var11, var5)) {
            char var2 = var10[var11];
            var8.append((char)(var2 ^ var7[var3 % var7.length]));
            0;
            ++var3;
            ++var11;
            0;
            if ((0x48 ^ 0x40 ^ (0x6F ^ 0x62)) != 0) continue;
            return null;
        }
        return String.valueOf(var8);
    }

    /*
     * WARNING - void declaration
     */
    private boolean d(Item item) {
        void var15;
        String[] stringArray;
        String[] stringArray2 = stringArray = this.x.alchItems().split(lllIlIllIIl[lllIlIllIlI[0]]);
        int n2 = stringArray2.length;
        int var9 = lllIlIllIlI[0];
        while (K.lIllIIIIIIlllI(var9, (int)var15)) {
            void var4;
            void var14;
            String var13 = var14[var9];
            if (!K.lIllIIIIIIllII((var13 = var13.trim()).equals(var4.getName()) ? 1 : 0) || K.lIllIIIIIIllll(var13.equals(String.valueOf(var4.getId())) ? 1 : 0)) {
                return lllIlIllIlI[2];
            }
            ++var9;
            0;
            
            return ((0x17 ^ 0x67 ^ (0x46 ^ 0x17)) & (0x2F ^ 0x1A ^ (0xB0 ^ 0xA4) ^ -1)) != 0;
        }
        return lllIlIllIlI[0];
    }

    static {
        K.lIllIIIIIIlIIl();
        K.lIllIIIIIIlIII();
    }

    private static boolean lIllIIIIIIlIll(Object object) {
        return object == null;
    }

    private static boolean lIllIIIIIIllIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIIIIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIIIIIIllll(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        void var2_2;
        K var6;
        if (K.lIllIIIIIIlIlI((Object)this.x.activity(), (Object)b.ALCHING)) {
            return lllIlIllIlI[0];
        }
        Item var1 = Inventory.getFirst(var6::d);
        if (K.lIllIIIIIIlIll(var1)) {
            return lllIlIllIlI[0];
        }
        Spell var16 = var6.S();
        if (K.lIllIIIIIIllII(var16.canCast() ? 1 : 0)) {
            return lllIlIllIlI[0];
        }
        var2_2.castOn((Interactable)var1_1);
        this.sleep(lllIlIllIlI[1]);
        return lllIlIllIlI[2];
    }

    private static boolean lIllIIIIIIlIlI(Object object, Object object2) {
        return object != object2;
    }

    private static boolean lIllIIIIIIllII(int n2) {
        return n2 == 0;
    }

    private static void lIllIIIIIIlIII() {
        lllIlIllIIl = new String[lllIlIllIlI[2]];
        K.lllIlIllIIl[K.lllIlIllIlI[0]] = K.",";
    }
}

