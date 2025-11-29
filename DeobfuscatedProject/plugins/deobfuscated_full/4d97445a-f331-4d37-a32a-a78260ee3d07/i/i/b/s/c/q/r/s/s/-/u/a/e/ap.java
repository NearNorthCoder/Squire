/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.plugins.fw.Task
 *  gg.squire.client.plugins.fw.TaskDesc
 *  gg.squire.client.util.Log
 *  net.runelite.api.Skill
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.BankLoadouts
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.unethicalite.api.events.ExperienceGained
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.ectofuntus.SquireEcto;
import gg.squire.basics.ectofuntus.SquireEctoConfig;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import i.i.b.s.c.q.r.s.s.-.u.a.e.am;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Skill;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.unethicalite.api.events.ExperienceGained;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;

/* TASK: Banking for items -> BankingforitemsTask */
@TaskDesc(name="Banking for items", priority=1, blocking=true, register=true)
public class ap
extends Task {
    private static /* synthetic */ int[] llIlIlII;
    private final /* synthetic */ SquireEcto cY;
    private static /* synthetic */ String[] llIlIIII;
    private final /* synthetic */ SquireEctoConfig cZ;

    @Inject
    public ap(SquireEcto squireEcto, SquireEctoConfig squireEctoConfig) {
        this.cY = squireEcto;
        this.cZ = squireEctoConfig;
    }

    private static boolean lIllllIIlI(int n2) {
        return n2 != 0;
    }

    @Subscribe
    public void a(ExperienceGained experienceGained) {
        if (ap.lIlllllIII(experienceGained.getSkill(), Skill.PRAYER)) {
            this.cY.r(this.cY.bm() + llIlIlII[1]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean by() {
        int n2;
        int[] nArray = new int[llIlIlII[1]];
        nArray[ap.llIlIlII[0]] = llIlIlII[8];
        if (ap.lIllllIlIl(Bank.getCount((boolean)llIlIlII[1], (int[])nArray), llIlIlII[12])) {
            int[] nArray2 = new int[llIlIlII[1]];
            nArray2[ap.llIlIlII[0]] = this.cZ.bonesToUse().groundItemId;
            if (ap.lIllllIlIl(Bank.getCount((boolean)llIlIlII[1], (int[])nArray2), llIlIlII[12])) {
                n2 = llIlIlII[1];
                0;
                if (-1 < 2) return n2 != 0;
                return ((0 + 127 - 64 + 99 ^ 98 + 72 - 43 + 28) & (0xA6 ^ 0x97 ^ (0xBD ^ 0xB5) ^ -1)) != 0;
            }
        }
        n2 = llIlIlII[0];
        return n2 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean bA() {
        int n2;
        int[] nArray = new int[llIlIlII[1]];
        nArray[ap.llIlIlII[0]] = llIlIlII[6];
        if (ap.lIllllIlIl(Bank.getCount((boolean)llIlIlII[1], (int[])nArray), llIlIlII[12])) {
            int[] nArray2 = new int[llIlIlII[1]];
            nArray2[ap.llIlIlII[0]] = this.cZ.bonesToUse().itemId;
            if (ap.lIllllIlIl(Bank.getCount((boolean)llIlIlII[1], (int[])nArray2), llIlIlII[12])) {
                n2 = llIlIlII[1];
                0;
                if ((0xC3 ^ 0xC6) > 0) return n2 != 0;
                return false;
            }
        }
        n2 = llIlIlII[0];
        return n2 != 0;
    }

    private static String lIlllIIlll(String llIlIllIlIIIIll, String llIlIllIlIIIlII) {
        try {
            SecretKeySpec llIlIllIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIllIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIllIlIIIlll = Cipher.getInstance("Blowfish");
            llIlIllIlIIIlll.init(llIlIlII[2], llIlIllIlIIlIII);
            return new String(llIlIllIlIIIlll.doFinal(Base64.getDecoder().decode(llIlIllIlIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIllIlIIIllI) {
            llIlIllIlIIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean bu() {
        int n2;
        block2: {
            block3: {
                if (!ap.lIllllIIlI(am.ECTOFUNTUS.bo() ? 1 : 0)) break block2;
                int[] nArray = new int[llIlIlII[1]];
                nArray[ap.llIlIlII[0]] = llIlIlII[6];
                if (!ap.lIllllIIlI(Inventory.contains((int[])nArray) ? 1 : 0)) break block2;
                int[] nArray2 = new int[llIlIlII[1]];
                nArray2[ap.llIlIlII[0]] = llIlIlII[7];
                if (!ap.lIllllIIlI(Inventory.contains((int[])nArray2) ? 1 : 0)) break block2;
                int[] nArray3 = new int[llIlIlII[1]];
                nArray3[ap.llIlIlII[0]] = this.cZ.bonesToUse().groundItemId;
                if (!ap.lIllllIIlI(Inventory.contains((int[])nArray3) ? 1 : 0)) break block3;
                int[] nArray4 = new int[llIlIlII[1]];
                nArray4[ap.llIlIlII[0]] = llIlIlII[8];
                if (!ap.lIllllIIll(Inventory.contains((int[])nArray4) ? 1 : 0)) break block2;
            }
            n2 = llIlIlII[1];
            0;
            if (1 != 3) return n2 != 0;
            return false;
        }
        n2 = llIlIlII[0];
        return n2 != 0;
    }

    private BankLoadout bx() {
        ap llIlIllIlIlIlIl;
        if (ap.lIllllIIlI(this.by() ? 1 : 0)) {
            Log.info((String)llIlIIII[llIlIlII[9]]);
            return (BankLoadout)this.cZ.prayLoadout().selected(BankLoadout.class);
        }
        if (ap.lIllllIIlI(llIlIllIlIlIlIl.bA() ? 1 : 0)) {
            Log.info((String)llIlIIII[llIlIlII[10]]);
            return (BankLoadout)llIlIllIlIlIlIl.cZ.grindLoadout().selected(BankLoadout.class);
        }
        if (ap.lIllllIIlI(llIlIllIlIlIlIl.bz() ? 1 : 0)) {
            Log.info((String)llIlIIII[llIlIlII[11]]);
            return (BankLoadout)llIlIllIlIlIlIl.cZ.slimeLoadout().selected(BankLoadout.class);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean bv() {
        int n2;
        if (ap.lIllllIIlI(am.ECTO_UPSTAIRS.bo() ? 1 : 0)) {
            int[] nArray = new int[llIlIlII[1]];
            nArray[ap.llIlIlII[0]] = llIlIlII[6];
            if (ap.lIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                int[] nArray2 = new int[llIlIlII[1]];
                nArray2[ap.llIlIlII[0]] = this.cZ.bonesToUse().itemId;
                if (ap.lIllllIIll(Inventory.contains((int[])nArray2) ? 1 : 0)) {
                    n2 = llIlIlII[1];
                    0;
                    if (null == null) return n2 != 0;
                    return ((0x26 ^ 0x76 ^ (0x98 ^ 0xC6)) & (26 + 204 - 215 + 191 ^ 115 + 105 - 140 + 112 ^ -1)) != 0;
                }
            }
        }
        n2 = llIlIlII[0];
        return n2 != 0;
    }

    public boolean run() {
        ap llIlIllIlIlllII;
        if (ap.lIllllIIlI(this.bu() ? 1 : 0) && ap.lIllllIIll(this.cY.r() ? 1 : 0)) {
            Log.info((String)llIlIIII[llIlIlII[0]]);
            this.cY.b(llIlIlII[1]);
            return llIlIlII[1];
        }
        if (ap.lIllllIIlI(llIlIllIlIlllII.bv() ? 1 : 0) && ap.lIllllIIll(llIlIllIlIlllII.cY.r() ? 1 : 0)) {
            Log.info((String)llIlIIII[llIlIlII[1]]);
            llIlIllIlIlllII.cY.b(llIlIlII[1]);
            return llIlIlII[1];
        }
        if (ap.lIllllIIlI(llIlIllIlIlllII.bw() ? 1 : 0) && ap.lIllllIIll(llIlIllIlIlllII.cY.r() ? 1 : 0)) {
            Log.info((String)llIlIIII[llIlIlII[2]]);
            llIlIllIlIlllII.cY.b(llIlIlII[1]);
            return llIlIlII[1];
        }
        if (ap.lIllllIIll(Bank.isOpen() ? 1 : 0)) {
            return llIlIlII[0];
        }
        BankLoadout llIlIllIlIllIll = llIlIllIlIlllII.bx();
        if (ap.lIllllIlII(llIlIllIlIllIll)) {
            Log.info((String)llIlIIII[llIlIlII[3]]);
            if (ap.lIllllIIll(Inventory.isEmpty() ? 1 : 0)) {
                Log.info((String)llIlIIII[llIlIlII[4]]);
                Bank.depositInventory();
                return llIlIlII[1];
            }
            Log.info((String)llIlIIII[llIlIlII[5]]);
            return llIlIlII[0];
        }
        if (ap.lIllllIIlI(llIlIllIlIllIll.needsToBank() ? 1 : 0) && ap.lIllllIIlI(BankLoadouts.withdrawWithRetries((BankLoadout)llIlIllIlIllIll, (int)llIlIlII[5]).booleanValue() ? 1 : 0)) {
            llIlIllIlIlllII.cY.b(llIlIlII[0]);
            return llIlIlII[1];
        }
        return llIlIlII[0];
    }

    private static String lIlllIlIII(String llIlIllIIllIllI, String llIlIllIIllIlll) {
        try {
            SecretKeySpec llIlIllIIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIllIIllIlll.getBytes(StandardCharsets.UTF_8)), llIlIlII[11]), "DES");
            Cipher llIlIllIIlllIlI = Cipher.getInstance("DES");
            llIlIllIIlllIlI.init(llIlIlII[2], llIlIllIIlllIll);
            return new String(llIlIllIIlllIlI.doFinal(Base64.getDecoder().decode(llIlIllIIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIlIllIIlllIIl) {
            llIlIllIIlllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIllllIlll(int n2, int n3) {
        return n2 < n3;
    }

    private static String lIlllIIllI(String llIlIllIIlIlIII, String llIlIllIIlIIIlI) {
        llIlIllIIlIlIII = new String(Base64.getDecoder().decode(llIlIllIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIllIIlIIllI = new StringBuilder();
        char[] llIlIllIIlIIlIl = llIlIllIIlIIIlI.toCharArray();
        int llIlIllIIlIIlII = llIlIlII[0];
        char[] llIlIllIIIllllI = llIlIllIIlIlIII.toCharArray();
        int llIlIllIIIlllIl = llIlIllIIIllllI.length;
        int llIlIllIIIlllII = llIlIlII[0];
        while (ap.lIllllIlll(llIlIllIIIlllII, llIlIllIIIlllIl)) {
            char llIlIllIIlIlIIl = llIlIllIIIllllI[llIlIllIIIlllII];
            llIlIllIIlIIllI.append((char)(llIlIllIIlIlIIl ^ llIlIllIIlIIlIl[llIlIllIIlIIlII % llIlIllIIlIIlIl.length]));
            0;
            ++llIlIllIIlIIlII;
            ++llIlIllIIIlllII;
            0;
            if (-1 <= (0xC ^ 8)) continue;
            return null;
        }
        return String.valueOf(llIlIllIIlIIllI);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean bw() {
        int n2;
        if (ap.lIllllIIlI(am.SLIME_COLLECTION.bo() ? 1 : 0)) {
            int[] nArray = new int[llIlIlII[1]];
            nArray[ap.llIlIlII[0]] = llIlIlII[7];
            if (ap.lIllllIIll(Inventory.contains((int[])nArray) ? 1 : 0)) {
                n2 = llIlIlII[1];
                0;
                if (((0x22 ^ 0x7F) & ~(0xEC ^ 0xB1)) == 0) return n2 != 0;
                return false;
            }
        }
        n2 = llIlIlII[0];
        return n2 != 0;
    }

    private static void lIlllIlIll() {
        llIlIIII = new String[llIlIlII[13]];
        ap.llIlIIII[ap.llIlIlII[0]] = ap."We're done praying, time to bank.";
        ap.llIlIIII[ap.llIlIlII[1]] = ap."We're done grinding, time to bank.";
        ap.llIlIIII[ap.llIlIlII[2]] = ap."We're done collecting slime, time to bank.";
        ap.llIlIIII[ap.llIlIlII[3]] = ap."No loadout found, attempting to solve.";
        ap.llIlIIII[ap.llIlIlII[4]] = ap."Attempting to solve by depositing inventory.";
        ap.llIlIIII[ap.llIlIlII[5]] = ap."We seem to be out of items to use.";
        ap.llIlIIII[ap.llIlIlII[9]] = ap."Should pray";
        ap.llIlIIII[ap.llIlIlII[10]] = ap."Should grind";
        ap.llIlIIII[ap.llIlIlII[11]] = ap."Should collect slime";
    }

    private static void lIllllIIIl() {
        llIlIlII = new int[14];
        ap.llIlIlII[0] = (0x6B ^ 0x48 ^ (0xDA ^ 0xB1)) & (125 + 173 - 152 + 60 ^ 18 + 109 - 125 + 132 ^ -1);
        ap.llIlIlII[1] = 1;
        ap.llIlIlII[2] = 2;
        ap.llIlIlII[3] = 3;
        ap.llIlIlII[4] = 0x7A ^ 0x7E;
        ap.llIlIlII[5] = 0xD ^ 8;
        ap.llIlIlII[6] = 0xFFFFD78F & 0x2FFB;
        ap.llIlIlII[7] = -(0xFFFFDD3D & 0x3AD3) & (0xFFFF9FD5 & 0x7FBF);
        ap.llIlIlII[8] = 0xFFFF94BF & 0x7BFE;
        ap.llIlIlII[9] = 0xA3 ^ 0xA5;
        ap.llIlIlII[10] = 0x2D ^ 6 ^ (0x95 ^ 0xB9);
        ap.llIlIlII[11] = 0x7F ^ 0x4F ^ (4 ^ 0x3C);
        ap.llIlIlII[12] = 90 + 125 - 146 + 59 ^ 78 + 94 - 98 + 67;
        ap.llIlIlII[13] = 4 ^ 0xD;
    }

    private static boolean lIllllIlIl(int n2, int n3) {
        return n2 >= n3;
    }

    static {
        ap.lIllllIIIl();
        ap.lIlllIlIll();
    }

    private boolean bz() {
        boolean bl2;
        int[] nArray = new int[llIlIlII[1]];
        nArray[ap.llIlIlII[0]] = llIlIlII[8];
        if (ap.lIllllIlll(Bank.getCount((boolean)llIlIlII[1], (int[])nArray), llIlIlII[12])) {
            bl2 = llIlIlII[1];
            0;
            if (3 < ((0x39 ^ 0x21) & ~(0x62 ^ 0x7A))) {
                return false;
            }
        } else {
            bl2 = llIlIlII[0];
        }
        return bl2;
    }

    private static boolean lIllllIlII(Object object) {
        return object == null;
    }

    private static boolean lIllllIIll(int n2) {
        return n2 == 0;
    }
}

