/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook$Necromancy
 */
package s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.C_Unknown;
import s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.j_Unknown;

/* TASK: Using imbued heart -> UseImbuedHeartTask */
@TaskDesc(name="Using imbued heart", priority=6)
public class UsingImbuedHeartTask
extends C_Unknown {
    private static /* synthetic */ int[] llllIIllllIl;
    private static /* synthetic */ String[] llllIIllllII;

    private static boolean lIIlIIIIIIlIlll(int n2) {
        return n2 != 0;
    }

    private static String lIIlIIIIIIlIlII(String var3, String var6) {
        try {
            SecretKeySpec var7 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var6.getBytes(StandardCharsets.UTF_8)), llllIIllllIl[6]), "DES");
            Cipher var5 = Cipher.getInstance("DES");
            var5.init(llllIIllllIl[1], var7);
            return new String(var5.doFinal(Base64.getDecoder().decode(var3.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var4) {
            var4.printStackTrace();
            return null;
        }
    }

    static {
        as.lIIlIIIIIIlIllI();
        as.lIIlIIIIIIlIlIl();
    }

    private static void lIIlIIIIIIlIlIl() {
        llllIIllllII = new String[llllIIllllIl[3]];
        as.llllIIllllII[as.llllIIllllIl[0]] = as."Invigorate";
    }

    @Inject
    protected as(j j2, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(j2, client, squireNightmareConfig, squireNightmarePlugin);
    }

    private static void lIIlIIIIIIlIllI() {
        llllIIllllIl = new int[7];
        as.llllIIllllIl[0] = (1 + 82 - 49 + 144 ^ 102 + 6 - -18 + 24) & (60 + 97 - 79 + 69 ^ 102 + 86 - 82 + 77 ^ -1);
        as.llllIIllllIl[1] = 2;
        as.llllIIllllIl[2] = 0xFFFFF9F4 & 0x56FF;
        as.llllIIllllIl[3] = 1;
        as.llllIIllllIl[4] = -1 & (0xFFFFEFFB & 0x7BFD);
        as.llllIIllllIl[5] = -(0xFFFFEAAF & 0x175F) & (0xFFFF9FFF & 0x76FF);
        as.llllIIllllIl[6] = 0xAC ^ 0xA4;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean bY() {
        void var2_2;
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (as.lIIlIIIIIIlIlll(this.bZ() ? 1 : 0) && as.lIIlIIIIIIllIII(Magic.canCast((Spell)necromancy) ? 1 : 0)) {
            return llllIIllllIl[0];
        }
        int[] nArray = new int[llllIIllllIl[1]];
        nArray[as.llllIIllllIl[0]] = llllIIllllIl[2];
        nArray[as.llllIIllllIl[3]] = llllIIllllIl[4];
        Item var1 = Inventory.getFirst((int[])nArray);
        if (as.lIIlIIIIIIllIIl(var1)) {
            return llllIIllllIl[0];
        }
        int var2 = Vars.getBit((int)llllIIllllIl[5]);
        if (as.lIIlIIIIIIllIlI(var2)) {
            return llllIIllllIl[0];
        }
        var2_2.interact(llllIIllllII[llllIIllllIl[0]]);
        return llllIIllllIl[3];
    }

    private static boolean lIIlIIIIIIllIII(int n2) {
        return n2 == 0;
    }

    private static boolean lIIlIIIIIIllIlI(int n2) {
        return n2 > 0;
    }

    private static boolean lIIlIIIIIIllIIl(Object object) {
        return object == null;
    }
}

