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
        K.lllIlIllIlI[0] = (0x79 ^ 0x3A ^ (4 ^ 0x4F)) & (69 + 60 - 117 + 192 ^ 130 + 96 - 182 + 152 ^ -" ".length());
        K.lllIlIllIlI[1] = "   ".length();
        K.lllIlIllIlI[2] = " ".length();
        K.lllIlIllIlI[3] = 0x41 ^ 0x52 ^ (0x17 ^ 0x33);
    }

    private Spell S() {
        if (K.lIllIIIIIIllIl(Skills.getLevel((Skill)Skill.MAGIC), lllIlIllIlI[3])) {
            return SpellBook.Standard.HIGH_LEVEL_ALCHEMY;
        }
        return SpellBook.Standard.LOW_LEVEL_ALCHEMY;
    }

    private static String lIllIIIIIIIlll(String llllllllllllllllIIlIIlIIIIlllllI, String llllllllllllllllIIlIIlIIIIllllIl) {
        llllllllllllllllIIlIIlIIIIlllllI = new String(Base64.getDecoder().decode(llllllllllllllllIIlIIlIIIIlllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIIlIIlIIIlIIIIIl = new StringBuilder();
        char[] llllllllllllllllIIlIIlIIIlIIIIII = llllllllllllllllIIlIIlIIIIllllIl.toCharArray();
        int llllllllllllllllIIlIIlIIIIllllll = lllIlIllIlI[0];
        char[] llllllllllllllllIIlIIlIIIIlllIIl = llllllllllllllllIIlIIlIIIIlllllI.toCharArray();
        int llllllllllllllllIIlIIlIIIIlllIII = llllllllllllllllIIlIIlIIIIlllIIl.length;
        int llllllllllllllllIIlIIlIIIIllIlll = lllIlIllIlI[0];
        while (K.lIllIIIIIIlllI(llllllllllllllllIIlIIlIIIIllIlll, llllllllllllllllIIlIIlIIIIlllIII)) {
            char llllllllllllllllIIlIIlIIIlIIIlII = llllllllllllllllIIlIIlIIIIlllIIl[llllllllllllllllIIlIIlIIIIllIlll];
            llllllllllllllllIIlIIlIIIlIIIIIl.append((char)(llllllllllllllllIIlIIlIIIlIIIlII ^ llllllllllllllllIIlIIlIIIlIIIIII[llllllllllllllllIIlIIlIIIIllllll % llllllllllllllllIIlIIlIIIlIIIIII.length]));
            "".length();
            ++llllllllllllllllIIlIIlIIIIllllll;
            ++llllllllllllllllIIlIIlIIIIllIlll;
            "".length();
            if ((0x48 ^ 0x40 ^ (0x6F ^ 0x62)) != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIIlIIlIIIlIIIIIl);
    }

    /*
     * WARNING - void declaration
     */
    private boolean d(Item item) {
        void llllllllllllllllIIlIIlIIIlIlIIII;
        String[] stringArray;
        String[] stringArray2 = stringArray = this.x.alchItems().split(lllIlIllIIl[lllIlIllIlI[0]]);
        int n2 = stringArray2.length;
        int llllllllllllllllIIlIIlIIIlIIllll = lllIlIllIlI[0];
        while (K.lIllIIIIIIlllI(llllllllllllllllIIlIIlIIIlIIllll, (int)llllllllllllllllIIlIIlIIIlIlIIII)) {
            void llllllllllllllllIIlIIlIIIlIlIIll;
            void llllllllllllllllIIlIIlIIIlIlIIIl;
            String llllllllllllllllIIlIIlIIIlIIlllI = llllllllllllllllIIlIIlIIIlIlIIIl[llllllllllllllllIIlIIlIIIlIIllll];
            if (!K.lIllIIIIIIllII((llllllllllllllllIIlIIlIIIlIIlllI = llllllllllllllllIIlIIlIIIlIIlllI.trim()).equals(llllllllllllllllIIlIIlIIIlIlIIll.getName()) ? 1 : 0) || K.lIllIIIIIIllll(llllllllllllllllIIlIIlIIIlIIlllI.equals(String.valueOf(llllllllllllllllIIlIIlIIIlIlIIll.getId())) ? 1 : 0)) {
                return lllIlIllIlI[2];
            }
            ++llllllllllllllllIIlIIlIIIlIIllll;
            "".length();
            if (null == null) continue;
            return ((0x17 ^ 0x67 ^ (0x46 ^ 0x17)) & (0x2F ^ 0x1A ^ (0xB0 ^ 0xA4) ^ -" ".length())) != 0;
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
        K llllllllllllllllIIlIIlIIIlIllllI;
        if (K.lIllIIIIIIlIlI((Object)this.x.activity(), (Object)b.ALCHING)) {
            return lllIlIllIlI[0];
        }
        Item llllllllllllllllIIlIIlIIIlIlllIl = Inventory.getFirst(llllllllllllllllIIlIIlIIIlIllllI::d);
        if (K.lIllIIIIIIlIll(llllllllllllllllIIlIIlIIIlIlllIl)) {
            return lllIlIllIlI[0];
        }
        Spell llllllllllllllllIIlIIlIIIlIlllII = llllllllllllllllIIlIIlIIIlIllllI.S();
        if (K.lIllIIIIIIllII(llllllllllllllllIIlIIlIIIlIlllII.canCast() ? 1 : 0)) {
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
        K.lllIlIllIIl[K.lllIlIllIlI[0]] = K.lIllIIIIIIIlll("bQ==", "AHGeP");
    }
}

