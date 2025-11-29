/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.TaskDesc
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.Skill
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.game.Skills
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import com.google.inject.Inject;
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
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.C;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.Z;
import q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.e;

@TaskDesc(name="Smelling salts", priority=100)
public class am
extends Z {
    private static /* synthetic */ int[] lIlllIlllll;
    private final /* synthetic */ C cR;
    private static /* synthetic */ String[] lIlllIlllIl;

    private static boolean lIIllIlIIIlllI(int n2) {
        return n2 != 0;
    }

    private static void lIIllIlIIIlIII() {
        lIlllIlllll = new int[9];
        am.lIlllIlllll[0] = (155 + 43 - 108 + 71 ^ 112 + 57 - 114 + 74) & (0x5F ^ 0x4D ^ (0xB6 ^ 0x84) ^ -1);
        am.lIlllIlllll[1] = 1;
        am.lIlllIlllll[2] = -(0xFFFF9FFD & 0x657A) & (0xFFFFFF7F & 0x3DFF);
        am.lIlllIlllll[3] = 0x5F ^ 0x4B;
        am.lIlllIlllll[4] = 2;
        am.lIlllIlllll[5] = 3;
        am.lIlllIlllll[6] = 0x55 ^ 0x78 ^ (0x1E ^ 0x37);
        am.lIlllIlllll[7] = 0x1F ^ 7 ^ (0x31 ^ 0x2C);
        am.lIlllIlllll[8] = 0x49 ^ 0x41;
    }

    @Inject
    protected am(Client client, C c2) {
        super(client);
        this.cR = c2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean run() {
        void var1_1;
        am llllllllllllllllIlIIlIllllIIlIlI;
        if (am.lIIllIlIIIlIlI(this.bc() ? 1 : 0)) {
            return lIlllIlllll[0];
        }
        Item llllllllllllllllIlIIlIllllIIlIIl = Inventory.getFirst(item -> {
            int n2;
            if (am.lIIllIlIIIlllI(item.getName().contains(lIlllIlllIl[lIlllIlllll[5]]) ? 1 : 0) && am.lIIllIlIIIlllI(item.getName().contains(lIlllIlllIl[lIlllIlllll[6]]) ? 1 : 0)) {
                n2 = lIlllIlllll[1];
                0;
                if (1 >= 2) {
                    return ((0x7F ^ 0x3B ^ (0xD0 ^ 0xAB)) & (0xCF ^ 0xBC ^ (0x41 ^ 0xD) ^ -1)) != 0;
                }
            } else {
                n2 = lIlllIlllll[0];
            }
            return n2 != 0;
        });
        if (am.lIIllIlIIIllII(llllllllllllllllIlIIlIllllIIlIIl) && am.lIIllIlIIIllII(llllllllllllllllIlIIlIllllIIlIIl = Inventory.getFirst(item -> item.getName().contains(lIlllIlllIl[lIlllIlllll[4]])))) {
            return lIlllIlllll[0];
        }
        if (am.lIIllIlIIIlllI(llllllllllllllllIlIIlIllllIIlIIl.getName().contains(lIlllIlllIl[lIlllIlllll[0]]) ? 1 : 0) && am.lIIllIlIIlIIII(llllllllllllllllIlIIlIllllIIlIlI.cR.av().getOrDefault((Object)e.SMELLING_SALTS, lIlllIlllll[0]), lIlllIlllll[1]) && am.lIIllIlIIIlIlI(llllllllllllllllIlIIlIllllIIlIlI.aq() ? 1 : 0) && am.lIIllIlIIIlIlI(llllllllllllllllIlIIlIllllIIlIlI.d.dehydration() ? 1 : 0)) {
            return lIlllIlllll[0];
        }
        if (am.lIIllIlIIIllII(Players.getLocal().getInteracting())) {
            return lIlllIlllll[0];
        }
        if (am.lIIllIlIIlIIll(Vars.getBit((int)lIlllIlllll[2]))) {
            return lIlllIlllll[0];
        }
        if (am.lIIllIlIIlIlII(Skills.getBoostedLevel((Skill)Skill.STRENGTH) - Skills.getLevel((Skill)Skill.STRENGTH), lIlllIlllll[3]) && (!am.lIIllIlIIIlllI(llllllllllllllllIlIIlIllllIIlIlI.aq() ? 1 : 0) || am.lIIllIlIIIlIlI(llllllllllllllllIlIIlIllllIIlIlI.d.dehydration() ? 1 : 0))) {
            return lIlllIlllll[0];
        }
        var1_1.interact(lIlllIlllIl[lIlllIlllll[1]]);
        return lIlllIlllll[1];
    }

    private static String lIIllIlIIIIIIl(String llllllllllllllllIlIIlIlllIIlIIlI, String llllllllllllllllIlIIlIlllIIIllll) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIlllIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlllIIIllll.getBytes(StandardCharsets.UTF_8)), lIlllIlllll[8]), "DES");
            Cipher llllllllllllllllIlIIlIlllIIlIlII = Cipher.getInstance("DES");
            llllllllllllllllIlIIlIlllIIlIlII.init(lIlllIlllll[4], llllllllllllllllIlIIlIlllIIlIlIl);
            return new String(llllllllllllllllIlIIlIlllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIlllIIlIIll) {
            llllllllllllllllIlIIlIlllIIlIIll.printStackTrace();
            return null;
        }
    }

    private static void lIIllIlIIIIlII() {
        lIlllIlllIl = new String[lIlllIlllll[7]];
        am.lIlllIlllIl[am.lIlllIlllll[0]] = am."1";
        am.lIlllIlllIl[am.lIlllIlllll[1]] = am."Crush";
        am.lIlllIlllIl[am.lIlllIlllll[4]] = am."salts";
        am.lIlllIlllIl[am.lIlllIlllll[5]] = am."salts";
        am.lIlllIlllIl[am.lIlllIlllll[6]] = am."1";
    }

    private static boolean lIIllIlIIIlIlI(int n2) {
        return n2 == 0;
    }

    private static boolean lIIllIlIIIllII(Object object) {
        return object == null;
    }

    static {
        am.lIIllIlIIIlIII();
        am.lIIllIlIIIIlII();
    }

    private static boolean lIIllIlIIlIIII(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllIlIIlIlII(int n2, int n3) {
        return n2 > n3;
    }

    private static String lIIllIlIIIIIll(String llllllllllllllllIlIIlIlllIllIlIl, String llllllllllllllllIlIIlIlllIllIllI) {
        try {
            SecretKeySpec llllllllllllllllIlIIlIlllIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIlIlllIllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllllIlIIlIlllIlllIIl = Cipher.getInstance("Blowfish");
            llllllllllllllllIlIIlIlllIlllIIl.init(lIlllIlllll[4], llllllllllllllllIlIIlIlllIlllIlI);
            return new String(llllllllllllllllIlIIlIlllIlllIIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIlIlllIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllllIlIIlIlllIlllIII) {
            llllllllllllllllIlIIlIlllIlllIII.printStackTrace();
            return null;
        }
    }

    private static String lIIllIlIIIIIlI(String llllllllllllllllIlIIlIlllIlIIlll, String llllllllllllllllIlIIlIlllIlIIIIl) {
        llllllllllllllllIlIIlIlllIlIIlll = new String(Base64.getDecoder().decode(llllllllllllllllIlIIlIlllIlIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIlIlllIlIIlIl = new StringBuilder();
        char[] llllllllllllllllIlIIlIlllIlIIlII = llllllllllllllllIlIIlIlllIlIIIIl.toCharArray();
        int llllllllllllllllIlIIlIlllIlIIIll = lIlllIlllll[0];
        char[] llllllllllllllllIlIIlIlllIIlllIl = llllllllllllllllIlIIlIlllIlIIlll.toCharArray();
        int llllllllllllllllIlIIlIlllIIlllII = llllllllllllllllIlIIlIlllIIlllIl.length;
        int llllllllllllllllIlIIlIlllIIllIll = lIlllIlllll[0];
        while (am.lIIllIlIIlIIII(llllllllllllllllIlIIlIlllIIllIll, llllllllllllllllIlIIlIlllIIlllII)) {
            char llllllllllllllllIlIIlIlllIlIlIII = llllllllllllllllIlIIlIlllIIlllIl[llllllllllllllllIlIIlIlllIIllIll];
            llllllllllllllllIlIIlIlllIlIIlIl.append((char)(llllllllllllllllIlIIlIlllIlIlIII ^ llllllllllllllllIlIIlIlllIlIIlII[llllllllllllllllIlIIlIlllIlIIIll % llllllllllllllllIlIIlIlllIlIIlII.length]));
            0;
            ++llllllllllllllllIlIIlIlllIlIIIll;
            ++llllllllllllllllIlIIlIlllIIllIll;
            0;
            if (1 != 0) continue;
            return null;
        }
        return String.valueOf(llllllllllllllllIlIIlIlllIlIIlIl);
    }

    private static boolean lIIllIlIIlIIll(int n2) {
        return n2 > 0;
    }
}

