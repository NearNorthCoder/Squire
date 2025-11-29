/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.items.Inventory
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
import gg.squire.autotoa.SquireAutoTOA;
import gg.squire.client.plugins.fw.TaskDesc;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

/* TASK: Cracking scarab -> CrackingscarabTask */
@TaskDesc(name="Cracking scarab", priority=50)
public class ac
extends Z {
    private final /* synthetic */ C cB;
    private final /* synthetic */ SquireAutoTOA cC;
    private /* synthetic */ int cD;
    private static /* synthetic */ String[] lIllllIIlII;
    private static /* synthetic */ int[] lIllllIllll;

    private static String lIIllIlIIllIII(String var6, String var4) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var4.getBytes(StandardCharsets.UTF_8)), lIllllIllll[4]), "DES");
            Cipher var1 = Cipher.getInstance("DES");
            var1.init(lIllllIllll[5], var5);
            return new String(var1.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    @Inject
    protected ac(Client client, C c2, SquireAutoTOA squireAutoTOA) {
        super(client);
        this.cB = c2;
        this.cC = squireAutoTOA;
    }

    static {
        ac.lIIllIlIlllIII();
        ac.lIIllIlIIllIIl();
    }

    private static void lIIllIlIIllIIl() {
        lIllllIIlII = new String[lIllllIllll[3]];
        ac.lIllllIIlII[ac.lIllllIllll[1]] = ac."Crack";
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        if (ac.lIIllIlIlllIIl(this.cu.getTickCount() - this.cD, lIllllIllll[0])) {
            return lIllllIllll[1];
        }
        if (ac.lIIllIlIlllIIl(Skills.getLevel((Skill)Skill.PRAYER) - Skills.getBoostedLevel((Skill)Skill.PRAYER), lIllllIllll[2])) {
            return lIllllIllll[1];
        }
        Item var3 = Inventory.getFirst(item -> e.BLESSED_CRYSTAL_SCARAB.d(item.getId()));
        if (ac.lIIllIlIlllIlI(var3)) {
            return lIllllIllll[1];
        }
        var1_1.interact(lIllllIIlII[lIllllIllll[1]]);
        this.cD = this.cu.getTickCount();
        return lIllllIllll[3];
    }

    private static boolean lIIllIlIlllIIl(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIlIlllIlI(Object object) {
        return object == null;
    }

    private static void lIIllIlIlllIII() {
        lIllllIllll = new int[6];
        ac.lIllllIllll[0] = 0x7A ^ 0x31 ^ (0x1C ^ 0x7F);
        ac.lIllllIllll[1] = (0x48 ^ 0x5F) & ~(0x1B ^ 0xC);
        ac.lIllllIllll[2] = 0xB ^ 0x4D ^ (0xA ^ 0x46);
        ac.lIllllIllll[3] = 1;
        ac.lIllllIllll[4] = 0x67 ^ 0x49 ^ (0xA6 ^ 0x80);
        ac.lIllllIllll[5] = 2;
    }
}

